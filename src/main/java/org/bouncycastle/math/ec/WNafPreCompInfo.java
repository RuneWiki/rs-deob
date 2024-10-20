package org.bouncycastle.math.ec;

public class WNafPreCompInfo implements PreCompInfo {

    public ECPoint[] preComp = null;

    public ECPoint[] preCompNeg = null;

    public ECPoint twice = null;

    public ECPoint[] getPreCompNeg() {
        return this.preCompNeg;
    }

    public ECPoint[] getPreComp() {
        return this.preComp;
    }

    public void setPreComp(ECPoint[] arg0) {
        this.preComp = arg0;
    }

    public void setTwice(ECPoint arg0) {
        this.twice = arg0;
    }

    public void setPreCompNeg(ECPoint[] arg0) {
        this.preCompNeg = arg0;
    }

    public ECPoint getTwice() {
        return this.twice;
    }
}
