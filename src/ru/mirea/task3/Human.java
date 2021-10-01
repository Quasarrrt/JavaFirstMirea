package ru.mirea.task3;

public class Human {
    private static class Head {
        private String hair;
        private String eyes;

        public Head() {
            this.hair = "brown";
            this.eyes = "blue";
        }
        public String getHair() {
            return hair;
        }
        public void setHair(String hair) {
            this.hair = hair;
        }
        public String getEyes() {
            return eyes;
        }
        public void setEyes(String eyes) {
            this.eyes = eyes;
        }
        public String toString() {
            return "Hair: " + this.hair + " eyes: " + this.eyes;
        }
    }
    private static class Leg {
        private int length;
        private int size;

        public Leg() {
            this.length = 100;
            this.size = 37;
        }
        public void setLegLength(int length) {
            this.length = length;
        }
        public int getLegLength() {
            return length;
        }
        public void setLegSize(int size) {
            this.size = size;
        }
        public int getLegSize() {
            return size;
        }
        public String toString() {
            return "Leg length: " + this.length + " size: " + this.size;
        }
    }
    private static class Hand {
        private int length;
        private int width;
        public Hand() {
            this.length = 50;
            this.width = 30;
        }
        public void setHandLength(int length) {
            this.length = length;
        }
        public int getHandLength() {
            return length;
        }
        public void setHandWidth(int width) {
            this.width = width;
        }
        public int getHandWidth() {
            return width;
        }
        public String toString() {
            return "Hand length: " + this.length + " width: " + this.width;
        }
    }
    private Head head;
    private Leg leg;
    private Hand hand;

    public Human() {
        this.head = new Head();
        this.leg = new Leg();
        this.hand = new Hand();
    }
    public void setHeadHair(String hair) {
        this.head.setHair(hair);
    }
    public void setHeadEyes(String eyes) {
        this.head.setEyes(eyes);
    }
    public void setHead(String hair, String eyes) {
        this.head.setHair(hair);
        this.head.setEyes(eyes);
    }
    public Head getHead() {
        return this.head;
    }
    public void setLeg(int length, int size) {
        this.leg.setLegLength(length);
        this.leg.setLegSize(size);
    }
    public void setLegLength(int length) {
        this.leg.setLegLength(length);
    }
    public void setLegSize(int size) {
        this.leg.setLegSize(size);
    }
    public Leg getLeg() {
        return this.leg;
    }
    public void setHandLength(int length) {
        this.hand.setHandLength(length);
    }
    public void setHandWidth(int width) {
        this.hand.setHandWidth(width);
    }
    public void setHand(int length, int width) {
        this.hand.setHandLength(length);
        this.hand.setHandWidth(width);
    }
    public Hand getHand() {
        return this.hand;
    }
    public String toString() {
        return this.head + " " + this.leg + " " + this.hand;
    }
}
