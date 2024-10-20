package deob;

@ObfuscatedName("kj")
public class class287 extends class219 {

    @ObfuscatedName("kj.k")
    public static class213 field3752 = new class213(64);

    @ObfuscatedName("kj.t")
    public int field3743 = 0;

    @ObfuscatedName("kj.d")
    public int field3744 = -1;

    @ObfuscatedName("kj.h")
    public boolean field3745 = true;

    @ObfuscatedName("kj.m")
    public int field3750 = -1;

    @ObfuscatedName("kj.z")
    public int field3751;

    @ObfuscatedName("kj.i")
    public int field3748;

    @ObfuscatedName("kj.u")
    public int field3749;

    @ObfuscatedName("kj.x")
    public int field3746;

    @ObfuscatedName("kj.y")
    public int field3742;

    @ObfuscatedName("kj.a")
    public int field3747;

    @ObfuscatedName("cy.o(II)Lkj;")
    public static class287 method1829(int arg0) {
        class287 var1 = (class287) field3752.method3601((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field306.method4241(4, arg0);
        class287 var3 = new class287();
        if (var2 != null) {
            var3.method4768(new class195(var2), arg0);
        }
        var3.method4767();
        field3752.method3603(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kj.k(I)V")
    public void method4767() {
        if (this.field3750 != -1) {
            this.method4770(this.field3750);
            this.field3746 = this.field3751;
            this.field3742 = this.field3748;
            this.field3747 = this.field3749;
        }
        this.method4770(this.field3743);
    }

    @ObfuscatedName("kj.t(Lgc;IB)V")
    public void method4768(class195 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3205();
            if (var3 == 0) {
                return;
            }
            this.method4769(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("kj.d(Lgc;IIB)V")
    public void method4769(class195 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3743 = arg0.method3233();
        } else if (arg1 == 2) {
            this.field3744 = arg0.method3205();
        } else if (arg1 == 5) {
            this.field3745 = false;
        } else if (arg1 == 7) {
            this.field3750 = arg0.method3233();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("kj.h(II)V")
    public void method4770(int arg0) {
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
        this.field3751 = (int) (var18 * 256.0D);
        this.field3748 = (int) (var14 * 256.0D);
        this.field3749 = (int) (var16 * 256.0D);
        if (this.field3748 < 0) {
            this.field3748 = 0;
        } else if (this.field3748 > 255) {
            this.field3748 = 255;
        }
        if (this.field3749 < 0) {
            this.field3749 = 0;
        } else if (this.field3749 > 255) {
            this.field3749 = 255;
        }
    }
}
