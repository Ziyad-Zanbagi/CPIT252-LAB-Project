package com.company;

public abstract class BaseShawerma {
        protected String shawermaType = "Unknown shawerma";

        public String getShawermaType() {
                return shawermaType;
        }

        public abstract String getAddOns();
}

