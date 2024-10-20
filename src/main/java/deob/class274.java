package deob;

@ObfuscatedName("je")
public class class274 extends class219 {

    @ObfuscatedName("je.k")
    public static class213 field3503 = new class213(64);

    @ObfuscatedName("je.t")
    public int field3505 = 0;

    @ObfuscatedName("je.d")
    public int field3502;

    @ObfuscatedName("je.h")
    public int field3506;

    @ObfuscatedName("je.m")
    public int field3507;

    @ObfuscatedName("je.z")
    public int field3508;

    @ObfuscatedName("ii.o(Ljf;B)V")
    public static void method4049(class262 arg0) {
        Statics.field3504 = arg0;
    }

    @ObfuscatedName("ej.k(II)Lje;")
    public static class274 method2456(int arg0) {
        class274 var1 = (class274) field3503.method3601((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3504.method4241(1, arg0);
        class274 var3 = new class274();
        if (var2 != null) {
            var3.method4430(new class195(var2), arg0);
        }
        var3.method4429();
        field3503.method3603(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.t(I)V")
    public void method4429() {
        this.method4436(this.field3505);
    }

    @ObfuscatedName("je.d(Lgc;II)V")
    public void method4430(class195 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3205();
            if (var3 == 0) {
                return;
            }
            this.method4431(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("je.h(Lgc;III)V")
    public void method4431(class195 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3505 = arg0.method3233();
        }
    }

    @ObfuscatedName("je.m(II)V")
    public void method4436(int arg0) {
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
        this.field3506 = (int) (var14 * 256.0D);
        this.field3507 = (int) (var16 * 256.0D);
        if (this.field3506 < 0) {
            this.field3506 = 0;
        } else if (this.field3506 > 255) {
            this.field3506 = 255;
        }
        if (this.field3507 < 0) {
            this.field3507 = 0;
        } else if (this.field3507 > 255) {
            this.field3507 = 255;
        }
        if (var16 > 0.5D) {
            this.field3508 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3508 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3508 < 1) {
            this.field3508 = 1;
        }
        this.field3502 = (int) ((double) this.field3508 * var18);
    }
}
