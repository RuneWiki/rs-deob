package deob;

@ObfuscatedName("aa")
public class class39 extends class195 {

    @ObfuscatedName("aa.d")
    public static class184 field915 = new class184(64);

    @ObfuscatedName("aa.z")
    public int field924 = 0;

    @ObfuscatedName("aa.y")
    public int field917;

    @ObfuscatedName("aa.e")
    public int field925;

    @ObfuscatedName("aa.g")
    public int field919;

    @ObfuscatedName("aa.f")
    public int field914;

    @ObfuscatedName("az.n(Lfs;I)V")
    public static void method687(class158 arg0) {
        Statics.field918 = arg0;
    }

    @ObfuscatedName("cd.d(IB)Laa;")
    public static class39 method2057(int arg0) {
        class39 var1 = (class39) field915.method3411((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field918.method2948(1, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method760(new class111(var2), arg0);
        }
        var3.method759();
        field915.method3420(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.z(I)V")
    public void method759() {
        this.method762(this.field924);
    }

    @ObfuscatedName("aa.y(Ldl;IB)V")
    public void method760(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2228();
            if (var3 == 0) {
                return;
            }
            this.method761(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aa.e(Ldl;III)V")
    public void method761(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field924 = arg0.method2232();
        }
    }

    @ObfuscatedName("aa.g(II)V")
    public void method762(int arg0) {
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
        this.field925 = (int) (var14 * 256.0D);
        this.field919 = (int) (var16 * 256.0D);
        if (this.field925 < 0) {
            this.field925 = 0;
        } else if (this.field925 > 255) {
            this.field925 = 255;
        }
        if (this.field919 < 0) {
            this.field919 = 0;
        } else if (this.field919 > 255) {
            this.field919 = 255;
        }
        if (var16 > 0.5D) {
            this.field914 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field914 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field914 < 1) {
            this.field914 = 1;
        }
        this.field917 = (int) ((double) this.field914 * var18);
    }
}
