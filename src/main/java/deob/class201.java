package deob;

@ObfuscatedName("hc")
public class class201 extends class501 {

    @ObfuscatedName("hc.ad")
    public static class313 field2104 = new class313(64);

    @ObfuscatedName("hc.ag")
    public int field2110;

    @ObfuscatedName("hc.ak")
    public int field2106;

    @ObfuscatedName("hc.ap")
    public int field2107;

    @ObfuscatedName("hc.an")
    public static final int[] field2108 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2108[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("dk.aq(II)Lhc;")
    public static class201 method2256(int arg0) {
        class201 var1 = (class201) field2104.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2105.method6539(14, arg0);
        class201 var3 = new class201();
        if (var2 != null) {
            var3.method3513(new class547(var2));
        }
        field2104.method5498(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hc.ad(Lvp;B)V")
    public void method3513(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method3512(arg0, var2);
        }
    }

    @ObfuscatedName("hc.ag(Lvp;II)V")
    public void method3512(class547 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2110 = arg0.method8899();
            this.field2106 = arg0.method8804();
            this.field2107 = arg0.method8804();
        }
    }

    @ObfuscatedName("fk.ak(B)V")
    public static void method3081() {
        field2104.method5500();
    }
}
