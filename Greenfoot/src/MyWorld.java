import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
public class MyWorld {


    public class MyWorld extends World
    {
        private int score = 0;
        private int lives = 3;
        private Counter scoreCounter;
        private Counter livesCounter;
        private int appleTimer = 0;

        public MyWorld()
        {
            super(600, 400, 1);
            setBackground("background.jpg");

            // Añadir la cesta
            Basket basket = new Basket();
            addObject(basket, getWidth()/2, getHeight() - 40);

            // Contadores
            scoreCounter = new Counter("Score: ");
            addObject(scoreCounter, 70, 20);

            livesCounter = new Counter("Lives: ");
            addObject(livesCounter, 530, 20);
            livesCounter.setValue(lives);
        }

        public void act() {
            spawnApple();
            checkGameOver();
        }

        private void spawnApple() {
            appleTimer++;
            if (appleTimer > 60) { // cada ~1 segundo
                int x = Greenfoot.getRandomNumber(getWidth());
                addObject(new Apple(), x, 0);
                appleTimer = 0;
            }
        }

        public void addScore() {
            score++;
            scoreCounter.setValue(score);
        }

        public void loseLife() {
            lives--;
            livesCounter.setValue(lives);
        }

        private void checkGameOver() {
            if (lives <= 0) {
                showText("GAME OVER", getWidth()/2, getHeight()/2);
                Greenfoot.stop();
            }
        }
    }
}
