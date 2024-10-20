package deob;

@ObfuscatedName("kw")
public class class287 extends class219 {

    @ObfuscatedName("kw.q")
    public static class213 field3747 = new class213(64);

    @ObfuscatedName("kw.i")
    public int field3745 = 0;

    @ObfuscatedName("kw.a")
    public int field3746 = -1;

    @ObfuscatedName("kw.l")
    public boolean field3743 = true;

    @ObfuscatedName("kw.b")
    public int field3748 = -1;

    @ObfuscatedName("kw.e")
    public int field3749;

    @ObfuscatedName("kw.x")
    public int field3750;

    @ObfuscatedName("kw.p")
    public int field3751;

    @ObfuscatedName("kw.g")
    public int field3755;

    @ObfuscatedName("kw.n")
    public int field3753;

    @ObfuscatedName("kw.o")
    public int field3754;

    @ObfuscatedName("ip.t(Ljc;S)V")
    public static void method4177(class262 arg0) {
        Statics.field3752 = arg0;
    }

    @ObfuscatedName("ga.q(II)Lkw;")
    public static class287 method3134(int arg0) {
        class287 var1 = (class287) field3747.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3752.method4265(4, arg0);
        class287 var3 = new class287();
        if (var2 != null) {
            var3.method4754(new class195(var2), arg0);
        }
        var3.method4753();
        field3747.method3627(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kw.i(B)V")
    public void method4753() {
        if (this.field3748 != -1) {
            this.method4756(this.field3748);
            this.field3755 = this.field3749;
            this.field3753 = this.field3750;
            this.field3754 = this.field3751;
        }
        this.method4756(this.field3745);
    }

    @ObfuscatedName("kw.a(Lgb;II)V")
    public void method4754(class195 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3236();
            if (var3 == 0) {
                return;
            }
            this.method4755(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("kw.l(Lgb;III)V")
    public void method4755(class195 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3745 = arg0.method3399();
        } else if (arg1 == 2) {
            this.field3746 = arg0.method3236();
        } else if (arg1 == 5) {
            this.field3743 = false;
        } else if (arg1 == 7) {
            this.field3748 = arg0.method3399();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("kw.b(II)V")
    public void method4756(int arg0) {
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
        this.field3749 = (int) (var18 * 256.0D);
        this.field3750 = (int) (var14 * 256.0D);
        this.field3751 = (int) (var16 * 256.0D);
        if (this.field3750 < 0) {
            this.field3750 = 0;
        } else if (this.field3750 > 255) {
            this.field3750 = 255;
        }
        if (this.field3751 < 0) {
            this.field3751 = 0;
        } else if (this.field3751 > 255) {
            this.field3751 = 255;
        }
    }

    @ObfuscatedName("fh.e(B)V")
    public static void method3014() {
        field3747.method3632();
    }
}
