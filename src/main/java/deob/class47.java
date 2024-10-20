package deob;

@ObfuscatedName("aq")
public class class47 extends class204 {

    @ObfuscatedName("aq.v")
    public static class193 field1044 = new class193(64);

    @ObfuscatedName("aq.r")
    public int field1045 = 0;

    @ObfuscatedName("aq.n")
    public int field1054 = -1;

    @ObfuscatedName("aq.x")
    public boolean field1047 = true;

    @ObfuscatedName("aq.q")
    public int field1052 = -1;

    @ObfuscatedName("aq.h")
    public int field1049;

    @ObfuscatedName("aq.d")
    public int field1050;

    @ObfuscatedName("aq.c")
    public int field1051;

    @ObfuscatedName("aq.y")
    public int field1056;

    @ObfuscatedName("aq.m")
    public int field1048;

    @ObfuscatedName("aq.e")
    public int field1043;

    @ObfuscatedName("cg.i(Lfe;I)V")
    public static void method2146(class167 arg0) {
        Statics.field1053 = arg0;
    }

    @ObfuscatedName("aq.v(B)V")
    public void method946() {
        if (this.field1052 != -1) {
            this.method945(this.field1052);
            this.field1056 = this.field1049;
            this.field1048 = this.field1050;
            this.field1043 = this.field1051;
        }
        this.method945(this.field1045);
    }

    @ObfuscatedName("aq.r(Ldx;IB)V")
    public void method960(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2380();
            if (var3 == 0) {
                return;
            }
            this.method959(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aq.n(Ldx;III)V")
    public void method959(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1045 = arg0.method2349();
        } else if (arg1 == 2) {
            this.field1054 = arg0.method2380();
        } else if (arg1 == 5) {
            this.field1047 = false;
        } else if (arg1 == 7) {
            this.field1052 = arg0.method2349();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("aq.x(II)V")
    public void method945(int arg0) {
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
        this.field1049 = (int) (var18 * 256.0D);
        this.field1050 = (int) (var14 * 256.0D);
        this.field1051 = (int) (var16 * 256.0D);
        if (this.field1050 < 0) {
            this.field1050 = 0;
        } else if (this.field1050 > 255) {
            this.field1050 = 255;
        }
        if (this.field1051 < 0) {
            this.field1051 = 0;
        } else if (this.field1051 > 255) {
            this.field1051 = 255;
        }
    }

    @ObfuscatedName("ab.q(B)V")
    public static void method745() {
        field1044.method3467();
    }
}
