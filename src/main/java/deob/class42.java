package deob;

@ObfuscatedName("ar")
public class class42 extends class204 {

    @ObfuscatedName("ar.v")
    public static class193 field994 = new class193(64);

    @ObfuscatedName("ar.f")
    public int field987 = 0;

    @ObfuscatedName("ar.h")
    public int field989;

    @ObfuscatedName("ar.a")
    public int field990;

    @ObfuscatedName("ar.s")
    public int field991;

    @ObfuscatedName("ar.p")
    public int field992;

    @ObfuscatedName("em.i(Lfn;I)V")
    public static void method2717(class167 arg0) {
        Statics.field988 = arg0;
    }

    @ObfuscatedName("fs.v(IB)Lar;")
    public static class42 method3199(int arg0) {
        class42 var1 = (class42) field994.method3467((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field988.method3080(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method801(new class119(var2), arg0);
        }
        var3.method786();
        field994.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.f(I)V")
    public void method786() {
        this.method789(this.field987);
    }

    @ObfuscatedName("ar.h(Ldj;II)V")
    public void method801(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2310();
            if (var3 == 0) {
                return;
            }
            this.method788(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ar.a(Ldj;III)V")
    public void method788(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field987 = arg0.method2314();
        }
    }

    @ObfuscatedName("ar.s(II)V")
    public void method789(int arg0) {
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
        this.field990 = (int) (var14 * 256.0D);
        this.field991 = (int) (var16 * 256.0D);
        if (this.field990 < 0) {
            this.field990 = 0;
        } else if (this.field990 > 255) {
            this.field990 = 255;
        }
        if (this.field991 < 0) {
            this.field991 = 0;
        } else if (this.field991 > 255) {
            this.field991 = 255;
        }
        if (var16 > 0.5D) {
            this.field992 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field992 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field992 < 1) {
            this.field992 = 1;
        }
        this.field989 = (int) ((double) this.field992 * var18);
    }
}
