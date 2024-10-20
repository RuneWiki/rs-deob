package deob;

@ObfuscatedName("aa")
public class class47 extends class204 {

    @ObfuscatedName("aa.e")
    public static class193 field1053 = new class193(64);

    @ObfuscatedName("aa.q")
    public int field1044 = 0;

    @ObfuscatedName("aa.o")
    public int field1047 = -1;

    @ObfuscatedName("aa.g")
    public boolean field1046 = true;

    @ObfuscatedName("aa.m")
    public int field1045 = -1;

    @ObfuscatedName("aa.b")
    public int field1048;

    @ObfuscatedName("aa.p")
    public int field1049;

    @ObfuscatedName("aa.t")
    public int field1050;

    @ObfuscatedName("aa.w")
    public int field1054;

    @ObfuscatedName("aa.x")
    public int field1052;

    @ObfuscatedName("aa.k")
    public int field1051;

    @ObfuscatedName("aa.l(I)V")
    public void method958() {
        if (this.field1045 != -1) {
            this.method961(this.field1045);
            this.field1054 = this.field1048;
            this.field1052 = this.field1049;
            this.field1051 = this.field1050;
        }
        this.method961(this.field1044);
    }

    @ObfuscatedName("aa.e(Ldl;II)V")
    public void method959(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2388();
            if (var3 == 0) {
                return;
            }
            this.method960(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aa.q(Ldl;III)V")
    public void method960(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1044 = arg0.method2460();
        } else if (arg1 == 2) {
            this.field1047 = arg0.method2388();
        } else if (arg1 == 5) {
            this.field1046 = false;
        } else if (arg1 == 7) {
            this.field1045 = arg0.method2460();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("aa.o(IB)V")
    public void method961(int arg0) {
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
        this.field1048 = (int) (var18 * 256.0D);
        this.field1049 = (int) (var14 * 256.0D);
        this.field1050 = (int) (var16 * 256.0D);
        if (this.field1049 < 0) {
            this.field1049 = 0;
        } else if (this.field1049 > 255) {
            this.field1049 = 255;
        }
        if (this.field1050 < 0) {
            this.field1050 = 0;
        } else if (this.field1050 > 255) {
            this.field1050 = 255;
        }
    }

    @ObfuscatedName("au.g(B)V")
    public static void method661() {
        field1053.method3481();
    }
}
