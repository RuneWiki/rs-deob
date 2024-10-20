package deob;

@ObfuscatedName("ax")
public class class42 extends class204 {

    @ObfuscatedName("ax.h")
    public static class193 field952 = new class193(64);

    @ObfuscatedName("ax.o")
    public int field953 = 0;

    @ObfuscatedName("ax.z")
    public int field954;

    @ObfuscatedName("ax.c")
    public int field955;

    @ObfuscatedName("ax.d")
    public int field957;

    @ObfuscatedName("ax.l")
    public int field966;

    @ObfuscatedName("s.k(Lfo;B)V")
    public static void method553(class167 arg0) {
        Statics.field965 = arg0;
    }

    @ObfuscatedName("ar.h(IB)Lax;")
    public static class42 method667(int arg0) {
        class42 var1 = (class42) field952.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field965.method3118(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method786(new class119(var2), arg0);
        }
        var3.method784();
        field952.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.o(B)V")
    public void method784() {
        this.method783(this.field953);
    }

    @ObfuscatedName("ax.z(Ldk;IB)V")
    public void method786(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2330();
            if (var3 == 0) {
                return;
            }
            this.method785(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ax.c(Ldk;III)V")
    public void method785(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field953 = arg0.method2420();
        }
    }

    @ObfuscatedName("ax.d(II)V")
    public void method783(int arg0) {
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
        this.field955 = (int) (var14 * 256.0D);
        this.field957 = (int) (var16 * 256.0D);
        if (this.field955 < 0) {
            this.field955 = 0;
        } else if (this.field955 > 255) {
            this.field955 = 255;
        }
        if (this.field957 < 0) {
            this.field957 = 0;
        } else if (this.field957 > 255) {
            this.field957 = 255;
        }
        if (var16 > 0.5D) {
            this.field966 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field966 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field966 < 1) {
            this.field966 = 1;
        }
        this.field954 = (int) ((double) this.field966 * var18);
    }
}
