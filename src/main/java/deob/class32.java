package deob;

@ObfuscatedName("ab")
public class class32 extends class173 {

    @ObfuscatedName("ab.k")
    public static class169 field862 = new class169(64);

    @ObfuscatedName("ab.x")
    public int field868 = 0;

    @ObfuscatedName("ab.m")
    public int field866;

    @ObfuscatedName("ab.n")
    public int field865;

    @ObfuscatedName("ab.q")
    public int field861;

    @ObfuscatedName("ab.a")
    public int field864;

    @ObfuscatedName("dm.u(IB)Lab;")
    public static class32 method2341(int arg0) {
        class32 var1 = (class32) field862.method3263((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field867.method2965(1, arg0);
        class32 var3 = new class32();
        if (var2 != null) {
            var3.method653(new class126(var2), arg0);
        }
        var3.method656();
        field862.method3260(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.k(B)V")
    public void method656() {
        this.method655(this.field868);
    }

    @ObfuscatedName("ab.x(Ldl;IB)V")
    public void method653(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2559();
            if (var3 == 0) {
                return;
            }
            this.method663(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ab.m(Ldl;IIB)V")
    public void method663(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field868 = arg0.method2452();
        }
    }

    @ObfuscatedName("ab.n(II)V")
    public void method655(int arg0) {
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
        this.field865 = (int) (var14 * 256.0D);
        this.field861 = (int) (var16 * 256.0D);
        if (this.field865 < 0) {
            this.field865 = 0;
        } else if (this.field865 > 255) {
            this.field865 = 255;
        }
        if (this.field861 < 0) {
            this.field861 = 0;
        } else if (this.field861 > 255) {
            this.field861 = 255;
        }
        if (var16 > 0.5D) {
            this.field864 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field864 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field864 < 1) {
            this.field864 = 1;
        }
        this.field866 = (int) ((double) this.field864 * var18);
    }

    @ObfuscatedName("t.q(I)V")
    public static void method209() {
        field862.method3261();
    }
}
