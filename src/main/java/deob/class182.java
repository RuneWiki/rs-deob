package deob;

@ObfuscatedName("fa")
public class class182 extends class406 {

    @ObfuscatedName("fa.q")
    public static class257 field2023 = new class257(64);

    @ObfuscatedName("fa.l")
    public int field2026 = 0;

    @ObfuscatedName("fa.k")
    public int field2022;

    @ObfuscatedName("fa.a")
    public int field2021;

    @ObfuscatedName("fa.m")
    public int field2024;

    @ObfuscatedName("fa.p")
    public int field2019;

    @ObfuscatedName("fd.o(IB)Lfa;")
    public static class182 method2908(int arg0) {
        class182 var1 = (class182) field2023.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2020.method5249(1, arg0);
        class182 var3 = new class182();
        if (var2 != null) {
            var3.method3168(new class440(var2), arg0);
        }
        var3.method3169();
        field2023.method4571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fa.q(B)V")
    public void method3169() {
        this.method3170(this.field2026);
    }

    @ObfuscatedName("fa.l(Lpx;II)V")
    public void method3168(class440 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method7071();
            if (var3 == 0) {
                return;
            }
            this.method3166(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fa.k(Lpx;III)V")
    public void method3166(class440 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2026 = arg0.method6897();
        }
    }

    @ObfuscatedName("fa.a(IB)V")
    public void method3170(int arg0) {
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
        this.field2021 = (int) (var14 * 256.0D);
        this.field2024 = (int) (var16 * 256.0D);
        if (this.field2021 < 0) {
            this.field2021 = 0;
        } else if (this.field2021 > 255) {
            this.field2021 = 255;
        }
        if (this.field2024 < 0) {
            this.field2024 = 0;
        } else if (this.field2024 > 255) {
            this.field2024 = 255;
        }
        if (var16 > 0.5D) {
            this.field2019 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2019 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2019 < 1) {
            this.field2019 = 1;
        }
        this.field2022 = (int) ((double) this.field2019 * var18);
    }
}
