package colorcoder;

import com.philips.constants.MajorColor;
import com.philips.constants.MinorColor;
import com.philips.services.Service;

public class Main {
    public static void main(String[] args) {
        Service.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        Service.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
        Service.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        Service.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
