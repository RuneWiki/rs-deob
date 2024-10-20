package deob;

@ObfuscatedName("jy")
public class class271 extends class206 {

    @ObfuscatedName("jy.v")
    public static class201 field3677 = new class201(64);

    @ObfuscatedName("jy.y")
    public int field3672 = 0;

    @ObfuscatedName("jy.r")
    public int field3676 = -1;

    @ObfuscatedName("jy.h")
    public boolean field3675 = true;

    @ObfuscatedName("jy.d")
    public int field3671 = -1;

    @ObfuscatedName("jy.s")
    public int field3680;

    @ObfuscatedName("jy.b")
    public int field3678;

    @ObfuscatedName("jy.e")
    public int field3673;

    @ObfuscatedName("jy.f")
    public int field3674;

    @ObfuscatedName("jy.z")
    public int field3681;

    @ObfuscatedName("jy.u")
    public int field3682;

    @ObfuscatedName("ab.n(Lil;I)V")
    public static void method472(class247 arg0) {
        Statics.field3679 = arg0;
    }

    @ObfuscatedName("eb.v(IB)Ljy;")
    public static class271 method2740(int arg0) {
        class271 var1 = (class271) field3677.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3679.method3931(4, arg0);
        class271 var3 = new class271();
        if (var2 != null) {
            var3.method4487(new class185(var2), arg0);
        }
        var3.method4468();
        field3677.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jy.y(I)V")
    public void method4468() {
        if (this.field3671 != -1) {
            this.method4462(this.field3671);
            this.field3674 = this.field3680;
            this.field3681 = this.field3678;
            this.field3682 = this.field3673;
        }
        this.method4462(this.field3672);
    }

    @ObfuscatedName("jy.r(Lgv;II)V")
    public void method4487(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3021();
            if (var3 == 0) {
                return;
            }
            this.method4464(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jy.h(Lgv;III)V")
    public void method4464(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3672 = arg0.method3025();
        } else if (arg1 == 2) {
            this.field3676 = arg0.method3021();
        } else if (arg1 == 5) {
            this.field3675 = false;
        } else if (arg1 == 7) {
            this.field3671 = arg0.method3025();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jy.d(IB)V")
    public void method4462(int arg0) {
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
        this.field3680 = (int) (var18 * 256.0D);
        this.field3678 = (int) (var14 * 256.0D);
        this.field3673 = (int) (var16 * 256.0D);
        if (this.field3678 < 0) {
            this.field3678 = 0;
        } else if (this.field3678 > 255) {
            this.field3678 = 255;
        }
        if (this.field3673 < 0) {
            this.field3673 = 0;
        } else if (this.field3673 > 255) {
            this.field3673 = 255;
        }
    }

    @ObfuscatedName("en.s(B)V")
    public static void method2738() {
        field3677.method3409();
    }
}
