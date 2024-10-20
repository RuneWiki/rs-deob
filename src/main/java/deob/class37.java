package deob;

@ObfuscatedName("ai")
public class class37 extends class182 {

    @ObfuscatedName("ai.b")
    public static class171 field883 = new class171(64);

    @ObfuscatedName("ai.e")
    public int field893 = 0;

    @ObfuscatedName("ai.i")
    public int field885;

    @ObfuscatedName("ai.t")
    public int field886;

    @ObfuscatedName("ai.z")
    public int field887;

    @ObfuscatedName("ai.g")
    public int field882;

    @ObfuscatedName("ay.k(IB)Lai;")
    public static class37 method787(int arg0) {
        class37 var1 = (class37) field883.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field890.method2759(1, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method680(new class107(var2), arg0);
        }
        var3.method683();
        field883.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.b(B)V")
    public void method683() {
        this.method682(this.field893);
    }

    @ObfuscatedName("ai.e(Ldi;II)V")
    public void method680(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2115();
            if (var3 == 0) {
                return;
            }
            this.method678(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ai.i(Ldi;III)V")
    public void method678(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field893 = arg0.method2119();
        }
    }

    @ObfuscatedName("ai.t(IB)V")
    public void method682(int arg0) {
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
        this.field886 = (int) (var14 * 256.0D);
        this.field887 = (int) (var16 * 256.0D);
        if (this.field886 < 0) {
            this.field886 = 0;
        } else if (this.field886 > 255) {
            this.field886 = 255;
        }
        if (this.field887 < 0) {
            this.field887 = 0;
        } else if (this.field887 > 255) {
            this.field887 = 255;
        }
        if (var16 > 0.5D) {
            this.field882 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field882 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field882 < 1) {
            this.field882 = 1;
        }
        this.field885 = (int) ((double) this.field882 * var18);
    }
}
