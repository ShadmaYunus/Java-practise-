public class functions2 {

    float totalmarks(float a, float b, float c, float d, float e) {

        float total;

        total = a + b + c + d + e;

        return total;
    }

    float percentage(float a, float b, float c, float d, float e) {

        float percent;

        percent = totalmarks(a, b, c, d, e) / 5;

        return percent;
    }

    float Highest(float a, float b, float c, float d, float e) {

        float highest;

        if (a > b && a > c && a > d && a > e) {
            highest = a;
        }
        else if (b > a && b > c && b > d && b > e) {
            highest = b;
        }
        else if (c > b && c > a && c > d && c > e) {
            highest = c;
        }
        else if (d > b && d > c && d > a && d > e) {
            highest = d;
        }
        else {
            highest = e;
        }

        return highest;
    }

    public static void main(String[] args) {

        float x = 32;
        float y = 54;
        float z = 76;
        float w = 55;
        float k = 99;

        functions2 obj = new functions2();

        float percent1 = obj.percentage(x, y, z, w, k);

        System.out.println(percent1);
    }
}