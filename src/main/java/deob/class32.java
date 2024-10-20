package deob;

@ObfuscatedName("at")
public class class32 extends class172 {

    @ObfuscatedName("at.h")
    public static class168 field871 = new class168(64);

    @ObfuscatedName("at.c")
    public int field870 = 0;

    @ObfuscatedName("at.p")
    public int field873;

    @ObfuscatedName("at.i")
    public int field874;

    @ObfuscatedName("at.v")
    public int field875;

    @ObfuscatedName("at.l")
    public int field876;

    @ObfuscatedName("i.z(Len;B)V")
    public static void method35(class150 arg0) {
        Statics.field872 = arg0;
    }

    @ObfuscatedName("at.h(I)V")
    public void method685() {
        this.method686(this.field870);
    }

    @ObfuscatedName("at.c(Ldq;IB)V")
    public void method684(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2450();
            if (var3 == 0) {
                return;
            }
            this.method697(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("at.p(Ldq;III)V")
    public void method697(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field870 = arg0.method2454();
        }
    }

    @ObfuscatedName("at.i(IB)V")
    public void method686(int arg0) {
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
        this.field874 = (int) (var14 * 256.0D);
        this.field875 = (int) (var16 * 256.0D);
        if (this.field874 < 0) {
            this.field874 = 0;
        } else if (this.field874 > 255) {
            this.field874 = 255;
        }
        if (this.field875 < 0) {
            this.field875 = 0;
        } else if (this.field875 > 255) {
            this.field875 = 255;
        }
        if (var16 > 0.5D) {
            this.field876 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field876 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field876 < 1) {
            this.field876 = 1;
        }
        this.field873 = (int) ((double) this.field876 * var18);
    }

    @ObfuscatedName("d.v(I)V")
    public static void method127() {
        field871.method3241();
    }
}
