

public class getPrice {
    static int finalPrice;
    int value;

    public int getFinalPrice() {
        return finalPrice;
    }

    public String run(String obj)
    {
        switch (obj) {
            case "Hatchback":
                finalPrice = 6000+finalPrice;
                value = 6000;
                break;
            case "Sedan":
                finalPrice = 15600+finalPrice;
                value = 15600;
                break;
            case "SUV":
                finalPrice = 26700+finalPrice;
                value = 26700;
                break;
            case "2L":
                value = 0;
                break;
            case "3L":
                finalPrice = 2000+finalPrice;
                value = 2000;
                break;
            case "4L":
                finalPrice = 4000+finalPrice;
                value = 4000;
                break;
            case "Black":
                value = 0;
                break;
            case "Blue":
                finalPrice = 1000+finalPrice;
                value = 1000;
                break;
            case "Green":
                finalPrice = 2000+finalPrice;
                value = 2000;
                break;
            case "Brown":
                finalPrice = 500+finalPrice;
                value = 500;
                break;
            case "White":
                finalPrice = 950+finalPrice;
                value = 950;
                break;
            case "16 IN":
                value = 0;
                break;
            case "18 IN":
                finalPrice = 1200+finalPrice;
                value = 1200;
                break;
            case "20 IN":
                finalPrice = 2400+finalPrice;
                value = 2400;
                break;
            case "Sport Package":
                value = 0;
                break;
            case "Executive Package":
                finalPrice = 8300+finalPrice;
                value = 8300;
                break;

        }
        return "$" + value+".00";

    }

}

