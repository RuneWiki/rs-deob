package deob;

@ObfuscatedName("fm")
public class class182 extends class387 {

    @ObfuscatedName("fm.l")
    public static class249 field2074 = new class249(64);

    @ObfuscatedName("fm.s")
    public int field2075 = 0;

    @ObfuscatedName("fm.e")
    public int field2076 = -1;

    @ObfuscatedName("fm.r")
    public boolean field2077 = true;

    @ObfuscatedName("fm.o")
    public int field2086 = -1;

    @ObfuscatedName("fm.i")
    public int field2078;

    @ObfuscatedName("fm.w")
    public int field2080;

    @ObfuscatedName("fm.v")
    public int field2081;

    @ObfuscatedName("fm.a")
    public int field2082;

    @ObfuscatedName("fm.y")
    public int field2083;

    @ObfuscatedName("fm.u")
    public int field2079;

    @ObfuscatedName("fm.c(B)V")
    public void method3258() {
        if (this.field2086 != -1) {
            this.method3261(this.field2086);
            this.field2082 = this.field2078;
            this.field2083 = this.field2080;
            this.field2079 = this.field2081;
        }
        this.method3261(this.field2075);
    }

    @ObfuscatedName("fm.l(Lpi;II)V")
    public void method3259(class421 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method6686();
            if (var3 == 0) {
                return;
            }
            this.method3268(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fm.s(Lpi;III)V")
    public void method3268(class421 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2075 = arg0.method6668();
        } else if (arg1 == 2) {
            this.field2076 = arg0.method6686();
        } else if (arg1 == 5) {
            this.field2077 = false;
        } else if (arg1 == 7) {
            this.field2086 = arg0.method6668();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("fm.e(IB)V")
    public void method3261(int arg0) {
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
        this.field2078 = (int) (var18 * 256.0D);
        this.field2080 = (int) (var14 * 256.0D);
        this.field2081 = (int) (var16 * 256.0D);
        if (this.field2080 < 0) {
            this.field2080 = 0;
        } else if (this.field2080 > 255) {
            this.field2080 = 255;
        }
        if (this.field2081 < 0) {
            this.field2081 = 0;
        } else if (this.field2081 > 255) {
            this.field2081 = 255;
        }
    }

    @ObfuscatedName("ao.r(I)V")
    public static void method622() {
        field2074.method4475();
    }
}
