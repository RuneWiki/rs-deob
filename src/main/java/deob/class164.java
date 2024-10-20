package deob;

@ObfuscatedName("as")
public class class164 extends class6 {

    @ObfuscatedName("as.f")
    public int field2446;

    @ObfuscatedName("as.g")
    public int field2445;

    @ObfuscatedName("as.d")
    public int field2439 = -1;

    @ObfuscatedName("as.l")
    public int field2440;

    @ObfuscatedName("as.j")
    public int field2443;

    @ObfuscatedName("as.k")
    public int field2436 = 0;

    @ObfuscatedName("as.h")
    public static class2 field2435 = new class2(64);

    @ObfuscatedName("as.w")
    public int field2437 = -1;

    @ObfuscatedName("as.t")
    public boolean field2438 = true;

    @ObfuscatedName("as.s")
    public int field2442;

    @ObfuscatedName("as.x")
    public int field2444;

    @ObfuscatedName("as.h(B)V")
    public void method2828() {
        if (this.field2439 != -1) {
            this.method2831(this.field2439);
            this.field2443 = this.field2440;
            this.field2444 = this.field2446;
            this.field2445 = this.field2442;
        }
        this.method2831(this.field2436);
    }

    @ObfuscatedName("as.k(Ldp;II)V")
    public void method2830(class50 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method726();
            if (var3 == 0) {
                return;
            }
            this.method2837(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("as.t(II)V")
    public void method2831(int arg0) {
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
        this.field2440 = (int) (var18 * 256.0D);
        this.field2446 = (int) (var14 * 256.0D);
        this.field2442 = (int) (var16 * 256.0D);
        if (this.field2446 < 0) {
            this.field2446 = 0;
        } else if (this.field2446 > 255) {
            this.field2446 = 255;
        }
        if (this.field2442 < 0) {
            this.field2442 = 0;
        } else if (this.field2442 > 255) {
            this.field2442 = 255;
        }
    }

    @ObfuscatedName("as.w(Ldp;III)V")
    public void method2837(class50 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2436 = arg0.method728();
        } else if (arg1 == 2) {
            this.field2437 = arg0.method726();
        } else if (arg1 == 5) {
            this.field2438 = false;
        } else if (arg1 == 7) {
            this.field2439 = arg0.method728();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("q.d(I)V")
    public static void method1368() {
        field2435.method5();
    }

    @ObfuscatedName("cl.b(II)Las;")
    public static class164 method2514(int arg0) {
        class164 var1 = (class164) field2435.method1((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2447.method1266(4, arg0);
        class164 var3 = new class164();
        if (var2 != null) {
            var3.method2830(new class50(var2), arg0);
        }
        var3.method2828();
        field2435.method4(var3, (long) arg0);
        return var3;
    }
}
