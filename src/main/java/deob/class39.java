package deob;

@ObfuscatedName("ah")
public class class39 extends class195 {

    @ObfuscatedName("ah.o")
    public static class184 field942 = new class184(64);

    @ObfuscatedName("ah.a")
    public int field950 = 0;

    @ObfuscatedName("ah.w")
    public int field944;

    @ObfuscatedName("ah.m")
    public int field945;

    @ObfuscatedName("ah.h")
    public int field946;

    @ObfuscatedName("ah.i")
    public int field943;

    @ObfuscatedName("aq.n(Lfd;B)V")
    public static void method585(class158 arg0) {
        Statics.field949 = arg0;
    }

    @ObfuscatedName("ab.o(II)Lah;")
    public static class39 method838(int arg0) {
        class39 var1 = (class39) field942.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field949.method2925(1, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method739(new class111(var2), arg0);
        }
        var3.method734();
        field942.method3372(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.a(I)V")
    public void method734() {
        this.method737(this.field950);
    }

    @ObfuscatedName("ah.w(Ldl;II)V")
    public void method739(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2234();
            if (var3 == 0) {
                return;
            }
            this.method736(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ah.m(Ldl;III)V")
    public void method736(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field950 = arg0.method2238();
        }
    }

    @ObfuscatedName("ah.h(II)V")
    public void method737(int arg0) {
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        this.field945 = (int) (var14 * 256.0D);
        this.field946 = (int) (var16 * 256.0D);
        if (this.field945 < 0) {
            this.field945 = 0;
        } else if (this.field945 > 255) {
            this.field945 = 255;
        }
        if (this.field946 < 0) {
            this.field946 = 0;
        } else if (this.field946 > 255) {
            this.field946 = 255;
        }
        if (var16 > 0.5D) {
            this.field943 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field943 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field943 < 1) {
            this.field943 = 1;
        }
        this.field944 = (int) ((double) this.field943 * var18);
    }
}
