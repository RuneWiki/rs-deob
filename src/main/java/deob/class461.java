package deob;

@ObfuscatedName("rb")
public class class461 {

    @ObfuscatedName("rb.at")
    public float field4759;

    @ObfuscatedName("rb.ah")
    public float field4760;

    @ObfuscatedName("rb.ar")
    public float field4761;

    static {
        new class461(0.0F, 0.0F, 0.0F);
        new class461(1.0F, 1.0F, 1.0F);
        new class461(1.0F, 0.0F, 0.0F);
        new class461(0.0F, 1.0F, 0.0F);
        new class461(0.0F, 0.0F, 1.0F);
    }

    public class461(float arg0, float arg1, float arg2) {
        this.field4759 = arg0;
        this.field4760 = arg1;
        this.field4761 = arg2;
    }

    @ObfuscatedName("rb.at(B)F")
    public final float method7631() {
        return (float) Math.sqrt((double) (this.field4761 * this.field4761 + this.field4760 * this.field4760 + this.field4759 * this.field4759));
    }

    public String toString() {
        return this.field4759 + ", " + this.field4760 + ", " + this.field4761;
    }
}
