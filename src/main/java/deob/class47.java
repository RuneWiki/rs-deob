package deob;

@ObfuscatedName("al")
public class class47 extends class205 {

    @ObfuscatedName("al.j")
    public static class194 field1064 = new class194(64);

    @ObfuscatedName("al.p")
    public int field1059 = 0;

    @ObfuscatedName("al.x")
    public int field1052 = -1;

    @ObfuscatedName("al.d")
    public boolean field1053 = true;

    @ObfuscatedName("al.u")
    public int field1054 = -1;

    @ObfuscatedName("al.o")
    public int field1055;

    @ObfuscatedName("al.b")
    public int field1056;

    @ObfuscatedName("al.k")
    public int field1050;

    @ObfuscatedName("al.c")
    public int field1062;

    @ObfuscatedName("al.l")
    public int field1057;

    @ObfuscatedName("al.t")
    public int field1060;

    @ObfuscatedName("b.s(Lfa;B)V")
    public static void method100(class168 arg0) {
        Statics.field3130 = arg0;
    }

    @ObfuscatedName("al.j(I)V")
    public void method916() {
        if (this.field1054 != -1) {
            this.method919(this.field1054);
            this.field1062 = this.field1055;
            this.field1057 = this.field1056;
            this.field1060 = this.field1050;
        }
        this.method919(this.field1059);
    }

    @ObfuscatedName("al.p(Lds;IB)V")
    public void method917(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2338();
            if (var3 == 0) {
                return;
            }
            this.method918(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("al.x(Lds;III)V")
    public void method918(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1059 = arg0.method2359();
        } else if (arg1 == 2) {
            this.field1052 = arg0.method2338();
        } else if (arg1 == 5) {
            this.field1053 = false;
        } else if (arg1 == 7) {
            this.field1054 = arg0.method2359();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("al.d(II)V")
    public void method919(int arg0) {
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
        this.field1055 = (int) (var18 * 256.0D);
        this.field1056 = (int) (var14 * 256.0D);
        this.field1050 = (int) (var16 * 256.0D);
        if (this.field1056 < 0) {
            this.field1056 = 0;
        } else if (this.field1056 > 255) {
            this.field1056 = 255;
        }
        if (this.field1050 < 0) {
            this.field1050 = 0;
        } else if (this.field1050 > 255) {
            this.field1050 = 255;
        }
    }
}
