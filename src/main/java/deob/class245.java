package deob;

@ObfuscatedName("ic")
public class class245 extends class176 {

    @ObfuscatedName("ic.w")
    public static class146 field3255 = new class146(64);

    @ObfuscatedName("ic.e")
    public int field3257 = 0;

    @ObfuscatedName("ic.p")
    public int field3258;

    @ObfuscatedName("ic.k")
    public int field3259;

    @ObfuscatedName("ic.l")
    public int field3260;

    @ObfuscatedName("ic.b")
    public int field3261;

    @ObfuscatedName("av.q(Lhp;I)V")
    public static void method358(class234 arg0) {
        Statics.field3256 = arg0;
    }

    @ObfuscatedName("bc.w(IB)Lic;")
    public static class245 method979(int arg0) {
        class245 var1 = (class245) field3255.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3256.method3775(1, arg0);
        class245 var3 = new class245();
        if (var2 != null) {
            var3.method4035(new class301(var2), arg0);
        }
        var3.method4034();
        field3255.method3041(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.e(I)V")
    public void method4034() {
        this.method4037(this.field3257);
    }

    @ObfuscatedName("ic.p(Lkf;II)V")
    public void method4035(class301 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5077();
            if (var3 == 0) {
                return;
            }
            this.method4049(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ic.k(Lkf;IIB)V")
    public void method4049(class301 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3257 = arg0.method5140();
        }
    }

    @ObfuscatedName("ic.l(II)V")
    public void method4037(int arg0) {
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
        this.field3259 = (int) (var14 * 256.0D);
        this.field3260 = (int) (var16 * 256.0D);
        if (this.field3259 < 0) {
            this.field3259 = 0;
        } else if (this.field3259 > 255) {
            this.field3259 = 255;
        }
        if (this.field3260 < 0) {
            this.field3260 = 0;
        } else if (this.field3260 > 255) {
            this.field3260 = 255;
        }
        if (var16 > 0.5D) {
            this.field3261 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3261 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3261 < 1) {
            this.field3261 = 1;
        }
        this.field3258 = (int) ((double) this.field3261 * var18);
    }
}
