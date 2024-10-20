package deob;

@ObfuscatedName("fw")
public class class182 extends class382 {

    @ObfuscatedName("fw.b")
    public static class249 field2074 = new class249(64);

    @ObfuscatedName("fw.p")
    public int field2062 = 0;

    @ObfuscatedName("fw.m")
    public int field2065 = -1;

    @ObfuscatedName("fw.t")
    public boolean field2061 = true;

    @ObfuscatedName("fw.s")
    public int field2066 = -1;

    @ObfuscatedName("fw.j")
    public int field2063;

    @ObfuscatedName("fw.w")
    public int field2068;

    @ObfuscatedName("fw.n")
    public int field2069;

    @ObfuscatedName("fw.r")
    public int field2070;

    @ObfuscatedName("fw.o")
    public int field2071;

    @ObfuscatedName("fw.v")
    public int field2072;

    @ObfuscatedName("k.c(II)Lfw;")
    public static class182 method294(int arg0) {
        class182 var1 = (class182) field2074.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2064.method5053(4, arg0);
        class182 var3 = new class182();
        if (var2 != null) {
            var3.method3303(new class419(var2), arg0);
        }
        var3.method3323();
        field2074.method4515(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fw.b(B)V")
    public void method3323() {
        if (this.field2066 != -1) {
            this.method3305(this.field2066);
            this.field2070 = this.field2063;
            this.field2071 = this.field2068;
            this.field2072 = this.field2069;
        }
        this.method3305(this.field2062);
    }

    @ObfuscatedName("fw.p(Lpi;IB)V")
    public void method3303(class419 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method6781();
            if (var3 == 0) {
                return;
            }
            this.method3301(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fw.m(Lpi;III)V")
    public void method3301(class419 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2062 = arg0.method6674();
        } else if (arg1 == 2) {
            this.field2065 = arg0.method6781();
        } else if (arg1 == 5) {
            this.field2061 = false;
        } else if (arg1 == 7) {
            this.field2066 = arg0.method6674();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("fw.t(II)V")
    public void method3305(int arg0) {
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
        this.field2063 = (int) (var18 * 256.0D);
        this.field2068 = (int) (var14 * 256.0D);
        this.field2069 = (int) (var16 * 256.0D);
        if (this.field2068 < 0) {
            this.field2068 = 0;
        } else if (this.field2068 > 255) {
            this.field2068 = 255;
        }
        if (this.field2069 < 0) {
            this.field2069 = 0;
        } else if (this.field2069 > 255) {
            this.field2069 = 255;
        }
    }

    @ObfuscatedName("ne.s(I)V")
    public static void method5980() {
        field2074.method4518();
    }
}
