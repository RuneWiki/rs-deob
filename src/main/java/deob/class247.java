package deob;

@ObfuscatedName("ix")
public class class247 extends class195 {

    @ObfuscatedName("ix.s")
    public static class190 field3337 = new class190(64);

    @ObfuscatedName("ix.q")
    public int field3338 = 0;

    @ObfuscatedName("ix.o")
    public int field3336;

    @ObfuscatedName("ix.g")
    public int field3340;

    @ObfuscatedName("ix.v")
    public int field3339;

    @ObfuscatedName("ix.p")
    public int field3342;

    @ObfuscatedName("cp.w(Lip;I)V")
    public static void method1492(class236 arg0) {
        Statics.field3341 = arg0;
    }

    @ObfuscatedName("he.s(IB)Lix;")
    public static class247 method3859(int arg0) {
        class247 var1 = (class247) field3337.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3341.method3876(1, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method4087(new class174(var2), arg0);
        }
        var3.method4086();
        field3337.method3371(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.q(I)V")
    public void method4086() {
        this.method4089(this.field3338);
    }

    @ObfuscatedName("ix.o(Lfz;II)V")
    public void method4087(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2971();
            if (var3 == 0) {
                return;
            }
            this.method4088(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ix.g(Lfz;IIS)V")
    public void method4088(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3338 = arg0.method2975();
        }
    }

    @ObfuscatedName("ix.v(II)V")
    public void method4089(int arg0) {
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
        this.field3340 = (int) (var14 * 256.0D);
        this.field3339 = (int) (var16 * 256.0D);
        if (this.field3340 < 0) {
            this.field3340 = 0;
        } else if (this.field3340 > 255) {
            this.field3340 = 255;
        }
        if (this.field3339 < 0) {
            this.field3339 = 0;
        } else if (this.field3339 > 255) {
            this.field3339 = 255;
        }
        if (var16 > 0.5D) {
            this.field3342 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3342 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3342 < 1) {
            this.field3342 = 1;
        }
        this.field3336 = (int) ((double) this.field3342 * var18);
    }
}
