package deob;

@ObfuscatedName("av")
public class class49 extends class208 {

    @ObfuscatedName("av.e")
    public static class197 field1063 = new class197(64);

    @ObfuscatedName("av.n")
    public int field1070 = 0;

    @ObfuscatedName("av.t")
    public int field1059 = -1;

    @ObfuscatedName("av.v")
    public boolean field1060 = true;

    @ObfuscatedName("av.b")
    public int field1061 = -1;

    @ObfuscatedName("av.m")
    public int field1066;

    @ObfuscatedName("av.k")
    public int field1056;

    @ObfuscatedName("av.c")
    public int field1064;

    @ObfuscatedName("av.w")
    public int field1065;

    @ObfuscatedName("av.l")
    public int field1071;

    @ObfuscatedName("av.h")
    public int field1067;

    @ObfuscatedName("av.f(B)V")
    public void method962() {
        if (this.field1061 != -1) {
            this.method952(this.field1061);
            this.field1065 = this.field1066;
            this.field1071 = this.field1056;
            this.field1067 = this.field1064;
        }
        this.method952(this.field1070);
    }

    @ObfuscatedName("av.e(Ldx;II)V")
    public void method950(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2522();
            if (var3 == 0) {
                return;
            }
            this.method951(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("av.n(Ldx;III)V")
    public void method951(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1070 = arg0.method2403();
        } else if (arg1 == 2) {
            this.field1059 = arg0.method2522();
        } else if (arg1 == 5) {
            this.field1060 = false;
        } else if (arg1 == 7) {
            this.field1061 = arg0.method2403();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("av.t(II)V")
    public void method952(int arg0) {
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
        this.field1066 = (int) (var18 * 256.0D);
        this.field1056 = (int) (var14 * 256.0D);
        this.field1064 = (int) (var16 * 256.0D);
        if (this.field1056 < 0) {
            this.field1056 = 0;
        } else if (this.field1056 > 255) {
            this.field1056 = 255;
        }
        if (this.field1064 < 0) {
            this.field1064 = 0;
        } else if (this.field1064 > 255) {
            this.field1064 = 255;
        }
    }

    @ObfuscatedName("as.v(I)V")
    public static void method737() {
        field1063.method3572();
    }
}
