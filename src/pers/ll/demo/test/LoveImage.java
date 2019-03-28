package pers.ll.demo.test;

/**
 * 画爱心图
 *
 * @author ll
 * @date 2019/1/17 2:36 PM
 */
public class LoveImage {

    private static final float X_DIVIDED_BY_Y = 0.5f;
    private static final float MAX_X = 35f / X_DIVIDED_BY_Y;
    private static final float MAX_Y = 35f;
    private static final float THRESHOLD = 0.5f;
    private static final float A = 13;
    private static final String LOVE_SENTENCE = "No rose, no diamond ring, that is the simple and romantic love stories in college. The graduates have to face the approaching of June, a time to farewell their beloved. When their future is confronted with love, which one is more important? What will the lovers do in June?";
    private static int sentenceIndex = 0;

    private static char getSentenceChar() {
        while(true) {
            if (sentenceIndex >= LOVE_SENTENCE.length()) {
                sentenceIndex = 0;
            }
            char c = LOVE_SENTENCE.charAt(sentenceIndex++);
            if(' ' == c) {
                sentenceIndex++;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        for (int y = 0; y <= MAX_Y; y++) {
            for (int x = 0; x <= MAX_X; x++) {
//                System.out.print(func(getY(y), getX(x)) ? getSentenceChar() : ' ');
                System.out.print(func(getY(y), getX(x)) ? 'Y' : ' ');
            }
            System.out.println();
        }
    }

    public static final float getX(float x) {
        return (x - MAX_X / 2) * X_DIVIDED_BY_Y;
    }

    public static final float getY(float y) {
        return MAX_Y / 7f - y;
    }

    public static boolean func(float x, float y) {
        return (Math.pow(x, 2) + Math.pow(y, 2) + A * x - A * Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))) < THRESHOLD;
    }


    /**
     * 简单版
     */
    public static void test1() {
        for(float y = (float) 1.5;y>-1.5;y -=0.1)
        {
            for(float x= (float) -1.5;x<1.5;x+= 0.05)
            {
                float a = x*x+y*y-1;
                if((a*a*a-x*x*y*y*y)<=0.0)
                {


                    System.out.print("*");

                }
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }

    }

}
