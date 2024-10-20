package deob;

@ObfuscatedName("fo")
public class class160 extends class143 {

    @ObfuscatedName("fo.r")
    public static class101 field2416 = new class101(64);

    @ObfuscatedName("fo.d")
    public int field2417;

    @ObfuscatedName("fo.k")
    public int field2418;

    @ObfuscatedName("fo.u")
    public int field2419;

    @ObfuscatedName("dj.k(Lcv;I)V")
    public static void method1479(class87 arg0) {
        Statics.field2415 = arg0;
    }

    @ObfuscatedName("fo.u(Let;I)V")
    public void method2507(class136 arg0) {
        while (true) {
            int var2 = arg0.method1602();
            if (var2 == 0) {
                return;
            }
            this.method2508(arg0, var2);
        }
    }

    @ObfuscatedName("fo.v(Let;II)V")
    public void method2508(class136 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2417 = arg0.method1712();
            this.field2418 = arg0.method1602();
            this.field2419 = arg0.method1602();
        }
    }
}
