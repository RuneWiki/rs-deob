package deob;

@ObfuscatedName("aw")
public class class44 extends class208 {

    @ObfuscatedName("aw.r")
    public static class197 field979 = new class197(64);

    @ObfuscatedName("aw.j")
    public int field980 = 0;

    @ObfuscatedName("aw.z")
    public int field981;

    @ObfuscatedName("aw.i")
    public int field982;

    @ObfuscatedName("aw.b")
    public int field990;

    @ObfuscatedName("aw.l")
    public int field984;

    @ObfuscatedName("br.x(II)Law;")
    public static class44 method1544(int arg0) {
        class44 var1 = (class44) field979.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field983.method3079(1, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method819(new class123(var2), arg0);
        }
        var3.method812();
        field979.method3535(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.r(S)V")
    public void method812() {
        this.method822(this.field980);
    }

    @ObfuscatedName("aw.j(Ldp;IB)V")
    public void method819(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2408();
            if (var3 == 0) {
                return;
            }
            this.method814(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aw.z(Ldp;III)V")
    public void method814(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field980 = arg0.method2412();
        }
    }

    @ObfuscatedName("aw.i(II)V")
    public void method822(int arg0) {
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
        this.field982 = (int) (var14 * 256.0D);
        this.field990 = (int) (var16 * 256.0D);
        if (this.field982 < 0) {
            this.field982 = 0;
        } else if (this.field982 > 255) {
            this.field982 = 255;
        }
        if (this.field990 < 0) {
            this.field990 = 0;
        } else if (this.field990 > 255) {
            this.field990 = 255;
        }
        if (var16 > 0.5D) {
            this.field984 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field984 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field984 < 1) {
            this.field984 = 1;
        }
        this.field981 = (int) ((double) this.field984 * var18);
    }
}
