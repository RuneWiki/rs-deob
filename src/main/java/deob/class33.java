package deob;

@ObfuscatedName("aw")
public class class33 extends class174 {

    @ObfuscatedName("aw.l")
    public static class170 field859 = new class170(64);

    @ObfuscatedName("aw.d")
    public int field854 = 0;

    @ObfuscatedName("aw.x")
    public int field863;

    @ObfuscatedName("aw.o")
    public int field851;

    @ObfuscatedName("aw.a")
    public int field852;

    @ObfuscatedName("aw.w")
    public int field853;

    @ObfuscatedName("a.p(II)Law;")
    public static class33 method38(int arg0) {
        class33 var1 = (class33) field859.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field861.method3078(1, arg0);
        class33 var3 = new class33();
        if (var2 != null) {
            var3.method688(new class127(var2), arg0);
        }
        var3.method686();
        field859.method3364(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.l(B)V")
    public void method686() {
        this.method695(this.field854);
    }

    @ObfuscatedName("aw.d(Lds;II)V")
    public void method688(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2498();
            if (var3 == 0) {
                return;
            }
            this.method692(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aw.x(Lds;III)V")
    public void method692(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field854 = arg0.method2502();
        }
    }

    @ObfuscatedName("aw.o(II)V")
    public void method695(int arg0) {
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
        this.field851 = (int) (var14 * 256.0D);
        this.field852 = (int) (var16 * 256.0D);
        if (this.field851 < 0) {
            this.field851 = 0;
        } else if (this.field851 > 255) {
            this.field851 = 255;
        }
        if (this.field852 < 0) {
            this.field852 = 0;
        } else if (this.field852 > 255) {
            this.field852 = 255;
        }
        if (var16 > 0.5D) {
            this.field853 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field853 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field853 < 1) {
            this.field853 = 1;
        }
        this.field863 = (int) ((double) this.field853 * var18);
    }
}
