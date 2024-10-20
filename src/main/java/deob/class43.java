package deob;

@ObfuscatedName("ae")
public class class43 extends class195 {

    @ObfuscatedName("ae.k")
    public static class184 field1009 = new class184(64);

    @ObfuscatedName("ae.e")
    public int field999 = 0;

    @ObfuscatedName("ae.f")
    public int field1004 = -1;

    @ObfuscatedName("ae.w")
    public boolean field1001 = true;

    @ObfuscatedName("ae.t")
    public int field1002 = -1;

    @ObfuscatedName("ae.s")
    public int field1000;

    @ObfuscatedName("ae.c")
    public int field1005;

    @ObfuscatedName("ae.d")
    public int field1003;

    @ObfuscatedName("ae.v")
    public int field1006;

    @ObfuscatedName("ae.m")
    public int field1007;

    @ObfuscatedName("ae.h")
    public int field1008;

    @ObfuscatedName("x.p(Lff;I)V")
    public static void method139(class158 arg0) {
        Statics.field1941 = arg0;
    }

    @ObfuscatedName("aq.k(II)Lae;")
    public static class43 method621(int arg0) {
        class43 var1 = (class43) field1009.method3371((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1941.method2896(4, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method825(new class111(var2), arg0);
        }
        var3.method824();
        field1009.method3370(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.e(I)V")
    public void method824() {
        if (this.field1002 != -1) {
            this.method826(this.field1002);
            this.field1006 = this.field1000;
            this.field1007 = this.field1005;
            this.field1008 = this.field1003;
        }
        this.method826(this.field999);
    }

    @ObfuscatedName("ae.f(Lde;II)V")
    public void method825(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2314();
            if (var3 == 0) {
                return;
            }
            this.method839(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ae.w(Lde;III)V")
    public void method839(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field999 = arg0.method2179();
        } else if (arg1 == 2) {
            this.field1004 = arg0.method2314();
        } else if (arg1 == 5) {
            this.field1001 = false;
        } else if (arg1 == 7) {
            this.field1002 = arg0.method2179();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ae.t(II)V")
    public void method826(int arg0) {
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
        this.field1000 = (int) (var18 * 256.0D);
        this.field1005 = (int) (var14 * 256.0D);
        this.field1003 = (int) (var16 * 256.0D);
        if (this.field1005 < 0) {
            this.field1005 = 0;
        } else if (this.field1005 > 255) {
            this.field1005 = 255;
        }
        if (this.field1003 < 0) {
            this.field1003 = 0;
        } else if (this.field1003 > 255) {
            this.field1003 = 255;
        }
    }
}
