package deob;

@ObfuscatedName("ao")
public class class36 extends class173 {

    @ObfuscatedName("ao.k")
    public static class169 field927 = new class169(64);

    @ObfuscatedName("ao.x")
    public int field930 = 0;

    @ObfuscatedName("ao.m")
    public int field928 = -1;

    @ObfuscatedName("ao.n")
    public boolean field929 = true;

    @ObfuscatedName("ao.q")
    public int field939 = -1;

    @ObfuscatedName("ao.a")
    public int field926;

    @ObfuscatedName("ao.g")
    public int field933;

    @ObfuscatedName("ao.j")
    public int field937;

    @ObfuscatedName("ao.l")
    public int field934;

    @ObfuscatedName("ao.w")
    public int field935;

    @ObfuscatedName("ao.z")
    public int field936;

    @ObfuscatedName("dt.u(II)Lao;")
    public static class36 method2208(int arg0) {
        class36 var1 = (class36) field927.method3263((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1262.method2965(4, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method764(new class126(var2), arg0);
        }
        var3.method771();
        field927.method3260(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.k(I)V")
    public void method771() {
        if (this.field939 != -1) {
            this.method766(this.field939);
            this.field934 = this.field926;
            this.field935 = this.field933;
            this.field936 = this.field937;
        }
        this.method766(this.field930);
    }

    @ObfuscatedName("ao.x(Ldl;II)V")
    public void method764(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2559();
            if (var3 == 0) {
                return;
            }
            this.method765(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ao.m(Ldl;IIB)V")
    public void method765(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field930 = arg0.method2452();
        } else if (arg1 == 2) {
            this.field928 = arg0.method2559();
        } else if (arg1 == 5) {
            this.field929 = false;
        } else if (arg1 == 7) {
            this.field939 = arg0.method2452();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ao.n(IS)V")
    public void method766(int arg0) {
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
        this.field926 = (int) (var18 * 256.0D);
        this.field933 = (int) (var14 * 256.0D);
        this.field937 = (int) (var16 * 256.0D);
        if (this.field933 < 0) {
            this.field933 = 0;
        } else if (this.field933 > 255) {
            this.field933 = 255;
        }
        if (this.field937 < 0) {
            this.field937 = 0;
        } else if (this.field937 > 255) {
            this.field937 = 255;
        }
    }
}
