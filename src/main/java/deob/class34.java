package deob;

@ObfuscatedName("an")
public class class34 extends class174 {

    @ObfuscatedName("an.n")
    public static class167 field873 = new class167(64);

    @ObfuscatedName("an.u")
    public int field867 = 0;

    @ObfuscatedName("an.t")
    public int field868;

    @ObfuscatedName("an.e")
    public int field869;

    @ObfuscatedName("an.a")
    public int field870;

    @ObfuscatedName("an.l")
    public int field871;

    @ObfuscatedName("cz.z(Lel;B)V")
    public static void method1874(class142 arg0) {
        Statics.field872 = arg0;
    }

    @ObfuscatedName("dv.n(II)Lan;")
    public static class34 method2428(int arg0) {
        class34 var1 = (class34) field873.method3183((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field872.method2768(1, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method685(new class104(var2), arg0);
        }
        var3.method690();
        field873.method3185(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.u(B)V")
    public void method690() {
        this.method705(this.field867);
    }

    @ObfuscatedName("an.t(Lcj;IS)V")
    public void method685(class104 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2257();
            if (var3 == 0) {
                return;
            }
            this.method686(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("an.e(Lcj;IIB)V")
    public void method686(class104 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field867 = arg0.method2167();
        }
    }

    @ObfuscatedName("an.a(II)V")
    public void method705(int arg0) {
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
        this.field869 = (int) (var14 * 256.0D);
        this.field870 = (int) (var16 * 256.0D);
        if (this.field869 < 0) {
            this.field869 = 0;
        } else if (this.field869 > 255) {
            this.field869 = 255;
        }
        if (this.field870 < 0) {
            this.field870 = 0;
        } else if (this.field870 > 255) {
            this.field870 = 255;
        }
        if (var16 > 0.5D) {
            this.field871 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field871 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field871 < 1) {
            this.field871 = 1;
        }
        this.field868 = (int) ((double) this.field871 * var18);
    }
}
