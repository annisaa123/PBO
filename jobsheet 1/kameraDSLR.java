public class kameraDSLR {
    public static void main(String[] args) {
        String  merk1, model1;
        int isoRange1;
        merk1 = "Canon";
        model1 ="EOS 80D";
        isoRange1 = 100;

        String merk2, model2;
        int isoRange2;
        merk2 = "Nikon";
        model2 = "D850";
        isoRange2 = 200;

        String merk3, model3;
        int isoRange3;
        merk3 = "Sony";
        model3 = "A7R III";
        isoRange3 = 300;

        String merk4, model4;
        int isoRange4;
        merk4 = "Fujifilm";
        model4 = "X-T30";
        isoRange4 = 400;

        String merk5, model5;
        int isoRange5;
        merk5 = "Olympus";
        model5 = "E-M1 Mark II";
        isoRange5 = 500;

        String merk6, model6;
        int isoRange6;
        merk6 = "Panasonic";
        model6 = "Lumix GH5";
        isoRange6 = 600;

        String merk7, model7;
        int isoRange7;
        merk7 = "Pentax";
        model7 = "K-1 Mark II";
        isoRange7 = 700;

        String merk8, model8;
        int isoRange8;
        merk8 = "Casio";
        model8 = "EX-720";
        isoRange8 = 800;

        String merk9, model9;
        int isoRange9;
        merk9 = "Ricoh";
        model9 = "GR III";
        isoRange9 = 900;

        String merk10, model10;
        int isoRange10;
        merk10 = "Hasselblad";
        model10 = "X1D II 50C";
        isoRange10 = 1000;

        isoRange1 = tambahIso(isoRange1, 10);
        isoRange2 = tambahIso(isoRange2, 20);
        isoRange3 = tambahIso(isoRange3, 30);
        isoRange4 = tambahIso(isoRange4, 40);
        isoRange5 = tambahIso(isoRange5, 50);
        isoRange6 = tambahIso(isoRange6, 60);
        isoRange7 = tambahIso(isoRange7, 70);
        isoRange8 = tambahIso(isoRange8, 80);
        isoRange9 = tambahIso(isoRange9, 90);
        isoRange10 = tambahIso(isoRange10, 100);

        System.out.println("merk1: " + merk1);
        System.out.println("model1: " + model1);
        System.out.println("isoRange1; " + isoRange1);
        System.out.println("===============");

        System.out.println("merk2: " + merk2);
        System.out.println("model2: " + model2);
        System.out.println("isoRange2; " + isoRange2);
        System.out.println("===============");

        System.out.println("merk3: " + merk3);
        System.out.println("model3: " + model3);
        System.out.println("isoRange3; " + isoRange3);
        System.out.println("===============");

        System.out.println("merk4: " + merk4);
        System.out.println("model4: " + model4);
        System.out.println("isoRange4; " + isoRange4);
        System.out.println("===============");

        System.out.println("merk5: " + merk5);
        System.out.println("model5: " + model5);
        System.out.println("isoRange5; " + isoRange5);
        System.out.println("===============");

        System.out.println("merk6: " + merk6);
        System.out.println("model6: " + model6);
        System.out.println("isoRange6; " + isoRange6);
        System.out.println("===============");

        System.out.println("merk7: " + merk7);
        System.out.println("model7: " + model7);
        System.out.println("isoRange7; " + isoRange7);
        System.out.println("===================");

        System.out.println("merk8: " + merk8);
        System.out.println("model8: " + model8);
        System.out.println("isoRange8; " + isoRange8);
        System.out.println("===============");

        System.out.println("merk9: " + merk9);
        System.out.println("model9: " + model9);
        System.out.println("isoRange9; " + isoRange9);
        System.out.println("===================");

        System.out.println("merk10: " + merk10);
        System.out.println("model10: " + model10);
        System.out.println("isoRange10; " + isoRange10);
        System.out.println("===================");
        
    }

    public static int tambahIso(int isoRange, int value) {
        return isoRange += value;
    }

    public static int kurangIso(int isoRange, int value) {
        return isoRange -= value;
    }
}
