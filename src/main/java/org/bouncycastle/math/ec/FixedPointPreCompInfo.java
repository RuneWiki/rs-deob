package org.bouncycastle.math.ec;

public class FixedPointPreCompInfo implements PreCompInfo {

    public ECPoint[] preComp = null;

    public int width = -1;

    public int getWidth() {
        return this.width;
    }

    public ECPoint[] getPreComp() {
        return this.preComp;
    }

    public void setWidth(int arg0) {
        this.width = arg0;
    }

    public void setPreComp(ECPoint[] arg0) {
        this.preComp = arg0;
    }
}
