package deob;

@ObfuscatedName("hm")
public class class197 extends class485 {

    @ObfuscatedName("hm.ap")
    public static class302 field2048 = new class302(64);

    @ObfuscatedName("hm.af")
    public int field2049;

    @ObfuscatedName("hm.aj")
    public int field2050;

    @ObfuscatedName("hm.aq")
    public int field2051;

    @ObfuscatedName("hm.ar")
    public static final int[] field2052 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2052[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("cn.am(Low;I)V")
    public static void method1189(class375 arg0) {
        Statics.field4677 = arg0;
    }

    @ObfuscatedName("hm.ap(Luk;I)V")
    public void method3517(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method3525(arg0, var2);
        }
    }

    @ObfuscatedName("hm.af(Luk;II)V")
    public void method3525(class531 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2049 = arg0.method8775();
            this.field2050 = arg0.method8561();
            this.field2051 = arg0.method8561();
        }
    }

    @ObfuscatedName("rm.aj(I)V")
    public static void method7518() {
        field2048.method5403();
    }
}
