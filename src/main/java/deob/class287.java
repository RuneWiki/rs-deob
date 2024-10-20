package deob;

@ObfuscatedName("kg")
public class class287 extends class219 {

    @ObfuscatedName("kg.z")
    public static class213 field3751 = new class213(64);

    @ObfuscatedName("kg.n")
    public int field3743 = 0;

    @ObfuscatedName("kg.r")
    public int field3744 = -1;

    @ObfuscatedName("kg.e")
    public boolean field3745 = true;

    @ObfuscatedName("kg.y")
    public int field3746 = -1;

    @ObfuscatedName("kg.k")
    public int field3750;

    @ObfuscatedName("kg.s")
    public int field3741;

    @ObfuscatedName("kg.p")
    public int field3749;

    @ObfuscatedName("kg.x")
    public int field3748;

    @ObfuscatedName("kg.m")
    public int field3742;

    @ObfuscatedName("kg.h")
    public int field3752;

    @ObfuscatedName("cg.d(Ljk;I)V")
    public static void method1570(class262 arg0) {
        Statics.field3747 = arg0;
    }

    @ObfuscatedName("bu.z(II)Lkg;")
    public static class287 method729(int arg0) {
        class287 var1 = (class287) field3751.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3747.method4273(4, arg0);
        class287 var3 = new class287();
        if (var2 != null) {
            var3.method4862(new class195(var2), arg0);
        }
        var3.method4856();
        field3751.method3697(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kg.n(I)V")
    public void method4856() {
        if (this.field3746 != -1) {
            this.method4857(this.field3746);
            this.field3748 = this.field3750;
            this.field3742 = this.field3741;
            this.field3752 = this.field3749;
        }
        this.method4857(this.field3743);
    }

    @ObfuscatedName("kg.r(Lgy;IB)V")
    public void method4862(class195 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3330();
            if (var3 == 0) {
                return;
            }
            this.method4859(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("kg.e(Lgy;III)V")
    public void method4859(class195 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3743 = arg0.method3263();
        } else if (arg1 == 2) {
            this.field3744 = arg0.method3330();
        } else if (arg1 == 5) {
            this.field3745 = false;
        } else if (arg1 == 7) {
            this.field3746 = arg0.method3263();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("kg.y(IB)V")
    public void method4857(int arg0) {
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
        this.field3750 = (int) (var18 * 256.0D);
        this.field3741 = (int) (var14 * 256.0D);
        this.field3749 = (int) (var16 * 256.0D);
        if (this.field3741 < 0) {
            this.field3741 = 0;
        } else if (this.field3741 > 255) {
            this.field3741 = 255;
        }
        if (this.field3749 < 0) {
            this.field3749 = 0;
        } else if (this.field3749 > 255) {
            this.field3749 = 255;
        }
    }
}
