package deob;

@ObfuscatedName("rx")
public class class468 {

    @ObfuscatedName("rx.aq")
    public float field4829;

    @ObfuscatedName("rx.aw")
    public float field4831;

    @ObfuscatedName("rx.al")
    public float field4830;

    static {
        new class468(0.0F, 0.0F, 0.0F);
        new class468(1.0F, 1.0F, 1.0F);
        new class468(1.0F, 0.0F, 0.0F);
        new class468(0.0F, 1.0F, 0.0F);
        new class468(0.0F, 0.0F, 1.0F);
    }

    public class468(float arg0, float arg1, float arg2) {
        this.field4829 = arg0;
        this.field4831 = arg1;
        this.field4830 = arg2;
    }

    @ObfuscatedName("rx.aq(B)F")
    public final float method7779() {
        return (float) Math.sqrt((double) (this.field4830 * this.field4830 + this.field4831 * this.field4831 + this.field4829 * this.field4829));
    }

    public String toString() {
        return this.field4829 + ", " + this.field4831 + ", " + this.field4830;
    }
}
