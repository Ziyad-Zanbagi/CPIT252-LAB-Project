package com.company.ShawermaAddons;

import com.company.AddOnsDecorator;
import com.company.BaseShawerma;

public class Garlic extends AddOnsDecorator {
    public Garlic(BaseShawerma shawerma) {
        super.shawerma = shawerma;
    }

    @Override
    public String getShawermaType() {
        return shawerma.getShawermaType();
    }

    @Override
    public String getAddOns() {
        return shawerma.getAddOns() + " ,Garlic";
    }
}
