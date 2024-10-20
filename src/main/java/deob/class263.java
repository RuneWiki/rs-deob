package deob;

@ObfuscatedName("je")
public class class263 extends class198 {

    @ObfuscatedName("je.c")
    public static class193 field3608 = new class193(64);

    @ObfuscatedName("je.f")
    public int field3603 = 0;

    @ObfuscatedName("je.m")
    public int field3604 = -1;

    @ObfuscatedName("je.h")
    public boolean field3605 = true;

    @ObfuscatedName("je.t")
    public int field3606 = -1;

    @ObfuscatedName("je.p")
    public int field3607;

    @ObfuscatedName("je.d")
    public int field3601;

    @ObfuscatedName("je.n")
    public int field3609;

    @ObfuscatedName("je.z")
    public int field3610;

    @ObfuscatedName("je.o")
    public int field3611;

    @ObfuscatedName("je.q")
    public int field3612;

    @ObfuscatedName("ed.s(II)Lje;")
    public static class263 method2693(int arg0) {
        class263 var1 = (class263) field3608.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3613.method3840(4, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4405(new class177(var2), arg0);
        }
        var3.method4416();
        field3608.method3315(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.c(I)V")
    public void method4416() {
        if (this.field3606 != -1) {
            this.method4420(this.field3606);
            this.field3610 = this.field3607;
            this.field3611 = this.field3601;
            this.field3612 = this.field3609;
        }
        this.method4420(this.field3603);
    }

    @ObfuscatedName("je.f(Lfs;II)V")
    public void method4405(class177 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2965();
            if (var3 == 0) {
                return;
            }
            this.method4406(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("je.m(Lfs;III)V")
    public void method4406(class177 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3603 = arg0.method2969();
        } else if (arg1 == 2) {
            this.field3604 = arg0.method2965();
        } else if (arg1 == 5) {
            this.field3605 = false;
        } else if (arg1 == 7) {
            this.field3606 = arg0.method2969();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("je.h(II)V")
    public void method4420(int arg0) {
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
        this.field3607 = (int) (var18 * 256.0D);
        this.field3601 = (int) (var14 * 256.0D);
        this.field3609 = (int) (var16 * 256.0D);
        if (this.field3601 < 0) {
            this.field3601 = 0;
        } else if (this.field3601 > 255) {
            this.field3601 = 255;
        }
        if (this.field3609 < 0) {
            this.field3609 = 0;
        } else if (this.field3609 > 255) {
            this.field3609 = 255;
        }
    }

    @ObfuscatedName("fh.t(I)V")
    public static void method2822() {
        field3608.method3316();
    }
}
