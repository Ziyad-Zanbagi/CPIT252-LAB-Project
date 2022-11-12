package com.company.ShawermaTypes;

import com.company.BaseShawerma;

public class MeatShawerma extends BaseShawerma {
    public MeatShawerma() {
        super.shawermaType = "Meat Shawerma";
    }

    @Override
    public String getAddOns() {
        return "";
    }
}

