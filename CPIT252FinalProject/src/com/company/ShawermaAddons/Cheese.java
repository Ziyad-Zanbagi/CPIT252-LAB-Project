package com.company.ShawermaAddons;

import com.company.AddOnsDecorator;
import com.company.BaseShawerma;

public class Cheese extends AddOnsDecorator {
    public Cheese(BaseShawerma shawerma) {
        super.shawerma = shawerma;
    }

    @Override
    public String getShawermaType() {
        return shawerma.getShawermaType();
    }

    @Override
    public String getAddOns() {
        return shawerma.getAddOns()+ ", Cheese";
    }
}
