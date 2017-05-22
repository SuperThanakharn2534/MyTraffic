package app.alignsolution.mytraffic;

/**
 * Created by aligndev on 20-May-17.
 */

public class MyData {

    //Explicit  การประกาศตัวแปร
    private String[] titleStrings = new String[]{"Title1", "Title2", "Title3",
            "Title4", "Title5", "Title6", "Title7", "Title8", "Title9", "Title10",
            "Title11", "Title12", "Title13", "Title14", "Title15", "Title16", "Title17",
            "Title18", "Title19", "Title20"};

    private String[] detailStrings;

    private int[] ints = new int[]{R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03, R.drawable.traffic_04
            , R.drawable.traffic_05, R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08, R.drawable.traffic_09
            , R.drawable.traffic_10, R.drawable.traffic_11, R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14
            , R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17, R.drawable.traffic_18
            , R.drawable.traffic_19, R.drawable.traffic_20};

    public int[] getInts() {
        return ints;
    }

    public String[] getTitleStrings() {
        return titleStrings;
    }

    public String[] getDetailStrings() {

        String[] resutlString = new String[titleStrings.length];
        String s = "รายละเอียด";

        for (int i = 0; i < resutlString.length; i++) {

            resutlString[i] = s + titleStrings[i] + manyDetail();

        }// for one
        return resutlString;
    }

    private String manyDetail() {
        String s = " ";
        for (int i = 0; i < 10; i++) {
            s = s + "รายละเอียด";
        }
        return s;
    }
}    // Main Class คลาสหลัก

