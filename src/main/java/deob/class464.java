package deob;

@ObfuscatedName("ro")
public class class464 {

    @ObfuscatedName("ro.ac")
    public float field4773;

    @ObfuscatedName("ro.al")
    public float field4771;

    @ObfuscatedName("ro.ak")
    public float field4770;

    static {
        new class464(0.0F, 0.0F, 0.0F);
        new class464(1.0F, 1.0F, 1.0F);
        new class464(1.0F, 0.0F, 0.0F);
        new class464(0.0F, 1.0F, 0.0F);
        new class464(0.0F, 0.0F, 1.0F);
        method2520(100);
    }

    @ObfuscatedName("dc.ac(II)V")
    public static void method2520(int arg0) {
    }

    public class464(float arg0, float arg1, float arg2) {
        this.field4773 = arg0;
        this.field4771 = arg1;
        this.field4770 = arg2;
    }

    @ObfuscatedName("ro.al(I)F")
    public final float method7555() {
        return (float) Math.sqrt((double) (this.field4770 * this.field4770 + this.field4773 * this.field4773 + this.field4771 * this.field4771));
    }

    public String toString() {
        return this.field4773 + ", " + this.field4771 + ", " + this.field4770;
    }
}
