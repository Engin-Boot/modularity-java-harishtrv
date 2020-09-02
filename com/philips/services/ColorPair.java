package com.philips.services;

import com.philips.constants.ConstantValues;
import com.philips.constants.MajorColor;
import com.philips.constants.MinorColor;

public class ColorPair {
    private MajorColor majorColor;
    private MinorColor minorColor;

    public ColorPair(MajorColor major, MinorColor minor)
    {
        majorColor = major;
        minorColor = minor;
    }
    public MajorColor getMajor() {
        return majorColor;
    }
    public MinorColor getMinor() {
        return minorColor;
    }
    public String ToString() {
        String colorPairStr = ConstantValues.MajorColorNames[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += ConstantValues.MinorColorNames[minorColor.getIndex()];
        return colorPairStr;
    }
};
