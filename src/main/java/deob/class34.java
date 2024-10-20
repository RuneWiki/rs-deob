package deob;

@ObfuscatedName("ai")
public class class34 extends class174 {

    @ObfuscatedName("ai.k")
    public static class167 field862 = new class167(64);

    @ObfuscatedName("ai.y")
    public int field855 = 0;

    @ObfuscatedName("ai.g")
    public int field856;

    @ObfuscatedName("ai.r")
    public int field859;

    @ObfuscatedName("ai.i")
    public int field857;

    @ObfuscatedName("ai.f")
    public int field860;

    @ObfuscatedName("f.m(II)Lai;")
    public static class34 method91(int arg0) {
        class34 var1 = (class34) field862.method3137((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field854.method2725(1, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method654(new class104(var2), arg0);
        }
        var3.method666();
        field862.method3130(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.k(I)V")
    public void method666() {
        this.method656(this.field855);
    }

    @ObfuscatedName("ai.y(Lcb;II)V")
    public void method654(class104 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2190();
            if (var3 == 0) {
                return;
            }
            this.method655(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ai.g(Lcb;IIB)V")
    public void method655(class104 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field855 = arg0.method2134();
        }
    }

    @ObfuscatedName("ai.r(II)V")
    public void method656(int arg0) {
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
        this.field859 = (int) (var14 * 256.0D);
        this.field857 = (int) (var16 * 256.0D);
        if (this.field859 < 0) {
            this.field859 = 0;
        } else if (this.field859 > 255) {
            this.field859 = 255;
        }
        if (this.field857 < 0) {
            this.field857 = 0;
        } else if (this.field857 > 255) {
            this.field857 = 255;
        }
        if (var16 > 0.5D) {
            this.field860 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field860 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field860 < 1) {
            this.field860 = 1;
        }
        this.field856 = (int) ((double) this.field860 * var18);
    }
}
