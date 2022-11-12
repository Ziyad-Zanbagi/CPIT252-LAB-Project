package com.company.ShawermaAddons;

import com.company.AddOnsDecorator;
import com.company.BaseShawerma;
public class Ketchup extends AddOnsDecorator {
    public Ketchup(BaseShawerma shawerma) {
        super.shawerma = shawerma;
    }

    @Override
    public String getShawermaType() {
        return shawerma.getShawermaType();
    }

    @Override
    public String getAddOns() {
        return shawerma.getAddOns() + " ,Ketchup";
    }
}
