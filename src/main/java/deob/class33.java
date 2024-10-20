package deob;

@ObfuscatedName("ac")
public class class33 extends class175 {

    @ObfuscatedName("ac.b")
    public static class171 field857 = new class171(64);

    @ObfuscatedName("ac.o")
    public int field858 = 0;

    @ObfuscatedName("ac.w")
    public int field859;

    @ObfuscatedName("ac.r")
    public int field860;

    @ObfuscatedName("ac.k")
    public int field866;

    @ObfuscatedName("ac.z")
    public int field862;

    @ObfuscatedName("p.l(II)Lac;")
    public static class33 method219(int arg0) {
        class33 var1 = (class33) field857.method3255((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field865.method3029(1, arg0);
        class33 var3 = new class33();
        if (var2 != null) {
            var3.method685(new class127(var2), arg0);
        }
        var3.method680();
        field857.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.b(I)V")
    public void method680() {
        this.method700(this.field858);
    }

    @ObfuscatedName("ac.o(Ldm;II)V")
    public void method685(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2440();
            if (var3 == 0) {
                return;
            }
            this.method682(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ac.w(Ldm;III)V")
    public void method682(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field858 = arg0.method2441();
        }
    }

    @ObfuscatedName("ac.r(IS)V")
    public void method700(int arg0) {
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
        this.field860 = (int) (var14 * 256.0D);
        this.field866 = (int) (var16 * 256.0D);
        if (this.field860 < 0) {
            this.field860 = 0;
        } else if (this.field860 > 255) {
            this.field860 = 255;
        }
        if (this.field866 < 0) {
            this.field866 = 0;
        } else if (this.field866 > 255) {
            this.field866 = 255;
        }
        if (var16 > 0.5D) {
            this.field862 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field862 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field862 < 1) {
            this.field862 = 1;
        }
        this.field859 = (int) ((double) this.field862 * var18);
    }

    @ObfuscatedName("x.k(I)V")
    public static void method241() {
        field857.method3254();
    }
}
