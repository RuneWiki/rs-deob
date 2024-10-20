package deob;

@ObfuscatedName("fk")
public class class182 extends class404 {

    @ObfuscatedName("fk.c")
    public static class257 field1960 = new class257(64);

    @ObfuscatedName("fk.i")
    public int field1957 = 0;

    @ObfuscatedName("fk.f")
    public int field1958;

    @ObfuscatedName("fk.b")
    public int field1956;

    @ObfuscatedName("fk.n")
    public int field1955;

    @ObfuscatedName("fk.s")
    public int field1961;

    @ObfuscatedName("dw.v(II)Lfk;")
    public static class182 method2672(int arg0) {
        class182 var1 = (class182) field1960.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1959.method5296(1, arg0);
        class182 var3 = new class182();
        if (var2 != null) {
            var3.method3214(new class438(var2), arg0);
        }
        var3.method3232();
        field1960.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fk.c(I)V")
    public void method3232() {
        this.method3216(this.field1957);
    }

    @ObfuscatedName("fk.i(Lpi;II)V")
    public void method3214(class438 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method6971();
            if (var3 == 0) {
                return;
            }
            this.method3224(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("fk.f(Lpi;III)V")
    public void method3224(class438 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1957 = arg0.method6975();
        }
    }

    @ObfuscatedName("fk.b(IB)V")
    public void method3216(int arg0) {
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
        this.field1956 = (int) (var14 * 256.0D);
        this.field1955 = (int) (var16 * 256.0D);
        if (this.field1956 < 0) {
            this.field1956 = 0;
        } else if (this.field1956 > 255) {
            this.field1956 = 255;
        }
        if (this.field1955 < 0) {
            this.field1955 = 0;
        } else if (this.field1955 > 255) {
            this.field1955 = 255;
        }
        if (var16 > 0.5D) {
            this.field1961 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1961 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1961 < 1) {
            this.field1961 = 1;
        }
        this.field1958 = (int) ((double) this.field1961 * var18);
    }

    @ObfuscatedName("cf.n(I)V")
    public static void method2006() {
        field1960.method4647();
    }
}
