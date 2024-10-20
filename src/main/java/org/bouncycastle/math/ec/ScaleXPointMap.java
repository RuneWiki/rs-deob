package org.bouncycastle.math.ec;

public class ScaleXPointMap implements ECPointMap {

    public final ECFieldElement scale;

    public ECPoint map(ECPoint arg0) {
        return arg0.scaleX(this.scale);
    }

    public ScaleXPointMap(ECFieldElement arg0) {
        this.scale = arg0;
    }
}
