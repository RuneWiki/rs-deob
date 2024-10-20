package deob;

@ObfuscatedName("nn")
public class class370 {

    @ObfuscatedName("nn.c")
    public float field4227;

    @ObfuscatedName("nn.l")
    public float field4226;

    @ObfuscatedName("nn.s")
    public float field4228;

    static {
        new class370(0.0F, 0.0F, 0.0F);
        new class370(1.0F, 1.0F, 1.0F);
        new class370(1.0F, 0.0F, 0.0F);
        new class370(0.0F, 1.0F, 0.0F);
        new class370(0.0F, 0.0F, 1.0F);
        method5929(100);
    }

    @ObfuscatedName("nc.c(IB)V")
    public static void method5929(int arg0) {
    }

    public class370(float arg0, float arg1, float arg2) {
        this.field4227 = arg0;
        this.field4226 = arg1;
        this.field4228 = arg2;
    }

    @ObfuscatedName("nn.l(B)F")
    public final float method5978() {
        return (float) Math.sqrt((double) (this.field4228 * this.field4228 + this.field4227 * this.field4227 + this.field4226 * this.field4226));
    }

    public String toString() {
        return this.field4227 + ", " + this.field4226 + ", " + this.field4228;
    }
}
