package deob;

@ObfuscatedName("az")
public class class37 extends class174 {

    @ObfuscatedName("az.f")
    public static class170 field940 = new class170(64);

    @ObfuscatedName("az.o")
    public int field937 = 0;

    @ObfuscatedName("az.h")
    public int field938 = -1;

    @ObfuscatedName("az.u")
    public boolean field946 = true;

    @ObfuscatedName("az.a")
    public int field935 = -1;

    @ObfuscatedName("az.q")
    public int field941;

    @ObfuscatedName("az.t")
    public int field939;

    @ObfuscatedName("az.n")
    public int field942;

    @ObfuscatedName("az.i")
    public int field944;

    @ObfuscatedName("az.c")
    public int field936;

    @ObfuscatedName("az.b")
    public int field943;

    @ObfuscatedName("g.j(II)Laz;")
    public static class37 method142(int arg0) {
        class37 var1 = (class37) field940.method3256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field948.method3027(4, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method796(new class127(var2), arg0);
        }
        var3.method805();
        field940.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.f(I)V")
    public void method805() {
        if (this.field935 != -1) {
            this.method798(this.field935);
            this.field944 = this.field941;
            this.field936 = this.field939;
            this.field943 = this.field942;
        }
        this.method798(this.field937);
    }

    @ObfuscatedName("az.o(Ldq;IB)V")
    public void method796(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2464();
            if (var3 == 0) {
                return;
            }
            this.method797(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("az.h(Ldq;III)V")
    public void method797(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field937 = arg0.method2643();
        } else if (arg1 == 2) {
            this.field938 = arg0.method2464();
        } else if (arg1 == 5) {
            this.field946 = false;
        } else if (arg1 == 7) {
            this.field935 = arg0.method2643();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("az.u(II)V")
    public void method798(int arg0) {
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
        this.field941 = (int) (var18 * 256.0D);
        this.field939 = (int) (var14 * 256.0D);
        this.field942 = (int) (var16 * 256.0D);
        if (this.field939 < 0) {
            this.field939 = 0;
        } else if (this.field939 > 255) {
            this.field939 = 255;
        }
        if (this.field942 < 0) {
            this.field942 = 0;
        } else if (this.field942 > 255) {
            this.field942 = 255;
        }
    }
}
