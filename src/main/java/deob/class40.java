package deob;

@ObfuscatedName("ae")
public class class40 extends class198 {

    @ObfuscatedName("ae.y")
    public static class187 field961 = new class187(64);

    @ObfuscatedName("ae.z")
    public int field957 = 0;

    @ObfuscatedName("ae.l")
    public int field958;

    @ObfuscatedName("ae.w")
    public int field959;

    @ObfuscatedName("ae.d")
    public int field960;

    @ObfuscatedName("ae.f")
    public int field956;

    @ObfuscatedName("ax.j(Lfh;B)V")
    public static void method883(class161 arg0) {
        Statics.field955 = arg0;
    }

    @ObfuscatedName("al.y(II)Lae;")
    public static class40 method936(int arg0) {
        class40 var1 = (class40) field961.method3432((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field955.method2995(1, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method817(new class114(var2), arg0);
        }
        var3.method816();
        field961.method3434(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.z(I)V")
    public void method816() {
        this.method830(this.field957);
    }

    @ObfuscatedName("ae.l(Lde;II)V")
    public void method817(class114 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2322();
            if (var3 == 0) {
                return;
            }
            this.method844(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ae.w(Lde;IIS)V")
    public void method844(class114 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field957 = arg0.method2321();
        }
    }

    @ObfuscatedName("ae.d(II)V")
    public void method830(int arg0) {
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
        this.field959 = (int) (var14 * 256.0D);
        this.field960 = (int) (var16 * 256.0D);
        if (this.field959 < 0) {
            this.field959 = 0;
        } else if (this.field959 > 255) {
            this.field959 = 255;
        }
        if (this.field960 < 0) {
            this.field960 = 0;
        } else if (this.field960 > 255) {
            this.field960 = 255;
        }
        if (var16 > 0.5D) {
            this.field956 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field956 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field956 < 1) {
            this.field956 = 1;
        }
        this.field958 = (int) ((double) this.field956 * var18);
    }

    @ObfuscatedName("a.f(B)V")
    public static void method106() {
        field961.method3435();
    }
}
