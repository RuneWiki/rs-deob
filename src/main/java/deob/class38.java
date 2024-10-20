package deob;

@ObfuscatedName("ah")
public class class38 extends class187 {

    @ObfuscatedName("ah.y")
    public static class176 field866 = new class176(64);

    @ObfuscatedName("ah.d")
    public int field874 = 0;

    @ObfuscatedName("ah.c")
    public int field868;

    @ObfuscatedName("ah.r")
    public int field876;

    @ObfuscatedName("ah.f")
    public int field869;

    @ObfuscatedName("ah.z")
    public int field865;

    @ObfuscatedName("x.p(Len;I)V")
    public static void method518(class151 arg0) {
        Statics.field867 = arg0;
    }

    @ObfuscatedName("ah.y(I)V")
    public void method712() {
        this.method715(this.field874);
    }

    @ObfuscatedName("ah.d(Ldg;II)V")
    public void method713(class110 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2309();
            if (var3 == 0) {
                return;
            }
            this.method714(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ah.c(Ldg;III)V")
    public void method714(class110 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field874 = arg0.method2128();
        }
    }

    @ObfuscatedName("ah.r(II)V")
    public void method715(int arg0) {
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
        this.field876 = (int) (var14 * 256.0D);
        this.field869 = (int) (var16 * 256.0D);
        if (this.field876 < 0) {
            this.field876 = 0;
        } else if (this.field876 > 255) {
            this.field876 = 255;
        }
        if (this.field869 < 0) {
            this.field869 = 0;
        } else if (this.field869 > 255) {
            this.field869 = 255;
        }
        if (var16 > 0.5D) {
            this.field865 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field865 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field865 < 1) {
            this.field865 = 1;
        }
        this.field868 = (int) ((double) this.field865 * var18);
    }
}
