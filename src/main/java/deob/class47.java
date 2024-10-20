package deob;

@ObfuscatedName("ax")
public class class47 extends class204 {

    @ObfuscatedName("ax.q")
    public static class193 field1057 = new class193(64);

    @ObfuscatedName("ax.v")
    public int field1062 = 0;

    @ObfuscatedName("ax.n")
    public int field1067 = -1;

    @ObfuscatedName("ax.f")
    public boolean field1059 = true;

    @ObfuscatedName("ax.g")
    public int field1060 = -1;

    @ObfuscatedName("ax.o")
    public int field1061;

    @ObfuscatedName("ax.s")
    public int field1058;

    @ObfuscatedName("ax.k")
    public int field1063;

    @ObfuscatedName("ax.b")
    public int field1064;

    @ObfuscatedName("ax.c")
    public int field1065;

    @ObfuscatedName("ax.l")
    public int field1066;

    @ObfuscatedName("ax.h(B)V")
    public void method954() {
        if (this.field1060 != -1) {
            this.method937(this.field1060);
            this.field1064 = this.field1061;
            this.field1065 = this.field1058;
            this.field1066 = this.field1063;
        }
        this.method937(this.field1062);
    }

    @ObfuscatedName("ax.q(Ldm;II)V")
    public void method956(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2383();
            if (var3 == 0) {
                return;
            }
            this.method936(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ax.v(Ldm;IIB)V")
    public void method936(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1062 = arg0.method2387();
        } else if (arg1 == 2) {
            this.field1067 = arg0.method2383();
        } else if (arg1 == 5) {
            this.field1059 = false;
        } else if (arg1 == 7) {
            this.field1060 = arg0.method2387();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ax.n(II)V")
    public void method937(int arg0) {
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
        this.field1061 = (int) (var18 * 256.0D);
        this.field1058 = (int) (var14 * 256.0D);
        this.field1063 = (int) (var16 * 256.0D);
        if (this.field1058 < 0) {
            this.field1058 = 0;
        } else if (this.field1058 > 255) {
            this.field1058 = 255;
        }
        if (this.field1063 < 0) {
            this.field1063 = 0;
        } else if (this.field1063 > 255) {
            this.field1063 = 255;
        }
    }
}
