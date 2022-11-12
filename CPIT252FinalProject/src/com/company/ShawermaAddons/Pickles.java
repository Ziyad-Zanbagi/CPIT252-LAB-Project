package com.company.ShawermaAddons;

import com.company.AddOnsDecorator;
import com.company.BaseShawerma;
public class Pickles extends AddOnsDecorator {
    public Pickles(BaseShawerma shawerma) {
        super.shawerma = shawerma;
    }

    @Override
    public String getShawermaType() {
        return shawerma.getShawermaType();
    }

    @Override
    public String getAddOns() {
        return shawerma.getAddOns() + " ,Pickels";
    }
}
