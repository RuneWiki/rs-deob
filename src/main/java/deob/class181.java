package deob;

@ObfuscatedName("fs")
public class class181 extends class406 {

    @ObfuscatedName("fs.h")
    public static class256 field1972 = new class256(64);

    @ObfuscatedName("fs.w")
    public int field1974 = 0;

    @ObfuscatedName("fs.v")
    public int field1979;

    @ObfuscatedName("fs.c")
    public int field1975;

    @ObfuscatedName("fs.q")
    public int field1976;

    @ObfuscatedName("fs.i")
    public int field1977;

    @ObfuscatedName("ju.s(Lls;B)V")
    public static void method4630(class316 arg0) {
        Statics.field1971 = arg0;
    }

    @ObfuscatedName("t.h(II)Lfs;")
    public static class181 method323(int arg0) {
        class181 var1 = (class181) field1972.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1971.method5179(1, arg0);
        class181 var3 = new class181();
        if (var2 != null) {
            var3.method3133(new class444(var2), arg0);
        }
        var3.method3122();
        field1972.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fs.w(B)V")
    public void method3122() {
        this.method3123(this.field1974);
    }

    @ObfuscatedName("fs.v(Lqr;II)V")
    public void method3133(class444 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method6929();
            if (var3 == 0) {
                return;
            }
            this.method3124(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fs.c(Lqr;IIB)V")
    public void method3124(class444 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1974 = arg0.method7095();
        }
    }

    @ObfuscatedName("fs.q(II)V")
    public void method3123(int arg0) {
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
        this.field1975 = (int) (var14 * 256.0D);
        this.field1976 = (int) (var16 * 256.0D);
        if (this.field1975 < 0) {
            this.field1975 = 0;
        } else if (this.field1975 > 255) {
            this.field1975 = 255;
        }
        if (this.field1976 < 0) {
            this.field1976 = 0;
        } else if (this.field1976 > 255) {
            this.field1976 = 255;
        }
        if (var16 > 0.5D) {
            this.field1977 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1977 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1977 < 1) {
            this.field1977 = 1;
        }
        this.field1979 = (int) ((double) this.field1977 * var18);
    }
}
