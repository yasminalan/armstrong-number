package exercises;

public class BouncingBallSimulation {
    public static void main(String[] args) {
        /*
       A ball is dropped from a certain height.
       After hitting the ground, it bounces up to 3/4 of the height it was dropped from.
       The ball stops bouncing when its bounce height becomes less than 1 meter.
       Create a do-while code block that calculates the total distance traveled by the ball
       and the number of times it hits the ground.
*/
        double height = 16;
        double distance = 0;
        int hit = 0;

        distance += height;
        hit++;

        do{
            height = height * 3.0 / 4.0;
            if (height >= 1) {
                distance += height * 2;
                hit++;
            }
        } while(height >= 1);
        System.out.println("Hit: " + hit + " Distance: " + distance);
    }
}
