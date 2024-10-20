package org.bouncycastle.math.ec;

public class ScaleXPointMap implements ECPointMap {

    public final ECFieldElement scale;

    public ScaleXPointMap(ECFieldElement arg0) {
        this.scale = arg0;
    }

    public ECPoint map(ECPoint arg0) {
        return arg0.scaleX(this.scale);
    }
}
