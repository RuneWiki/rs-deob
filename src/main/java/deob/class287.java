package deob;

@ObfuscatedName("kk")
public class class287 extends class219 {

    @ObfuscatedName("kk.e")
    public static class213 field3745 = new class213(64);

    @ObfuscatedName("kk.b")
    public int field3746 = 0;

    @ObfuscatedName("kk.z")
    public int field3750 = -1;

    @ObfuscatedName("kk.n")
    public boolean field3748 = true;

    @ObfuscatedName("kk.l")
    public int field3749 = -1;

    @ObfuscatedName("kk.s")
    public int field3747;

    @ObfuscatedName("kk.y")
    public int field3751;

    @ObfuscatedName("kk.c")
    public int field3754;

    @ObfuscatedName("kk.h")
    public int field3753;

    @ObfuscatedName("kk.i")
    public int field3756;

    @ObfuscatedName("kk.o")
    public int field3744;

    @ObfuscatedName("bd.g(Ljr;B)V")
    public static void method1160(class262 arg0) {
        Statics.field3752 = arg0;
    }

    @ObfuscatedName("hd.e(II)Lkk;")
    public static class287 method3920(int arg0) {
        class287 var1 = (class287) field3745.method3706((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3752.method4294(4, arg0);
        class287 var3 = new class287();
        if (var2 != null) {
            var3.method4839(new class195(var2), arg0);
        }
        var3.method4835();
        field3745.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kk.b(B)V")
    public void method4835() {
        if (this.field3749 != -1) {
            this.method4828(this.field3749);
            this.field3753 = this.field3747;
            this.field3756 = this.field3751;
            this.field3744 = this.field3754;
        }
        this.method4828(this.field3746);
    }

    @ObfuscatedName("kk.z(Lgg;II)V")
    public void method4839(class195 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3332();
            if (var3 == 0) {
                return;
            }
            this.method4827(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("kk.n(Lgg;III)V")
    public void method4827(class195 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3746 = arg0.method3312();
        } else if (arg1 == 2) {
            this.field3750 = arg0.method3332();
        } else if (arg1 == 5) {
            this.field3748 = false;
        } else if (arg1 == 7) {
            this.field3749 = arg0.method3312();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("kk.l(II)V")
    public void method4828(int arg0) {
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
        this.field3747 = (int) (var18 * 256.0D);
        this.field3751 = (int) (var14 * 256.0D);
        this.field3754 = (int) (var16 * 256.0D);
        if (this.field3751 < 0) {
            this.field3751 = 0;
        } else if (this.field3751 > 255) {
            this.field3751 = 255;
        }
        if (this.field3754 < 0) {
            this.field3754 = 0;
        } else if (this.field3754 > 255) {
            this.field3754 = 255;
        }
    }

    @ObfuscatedName("jf.s(B)V")
    public static void method4491() {
        field3745.method3709();
    }
}
