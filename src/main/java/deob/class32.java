package deob;

@ObfuscatedName("ae")
public class class32 extends class172 {

    @ObfuscatedName("ae.j")
    public static class168 field847 = new class168(64);

    @ObfuscatedName("ae.f")
    public int field850 = 0;

    @ObfuscatedName("ae.y")
    public int field848;

    @ObfuscatedName("ae.x")
    public int field846;

    @ObfuscatedName("ae.e")
    public int field851;

    @ObfuscatedName("ae.m")
    public int field852;

    @ObfuscatedName("client.c(Lew;I)V")
    public static void method506(class150 arg0) {
        Statics.field853 = arg0;
    }

    @ObfuscatedName("ae.j(B)V")
    public void method651() {
        this.method642(this.field850);
    }

    @ObfuscatedName("ae.f(Ldl;II)V")
    public void method640(class125 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2326();
            if (var3 == 0) {
                return;
            }
            this.method641(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ae.y(Ldl;IIB)V")
    public void method641(class125 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field850 = arg0.method2330();
        }
    }

    @ObfuscatedName("ae.x(IB)V")
    public void method642(int arg0) {
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
        this.field846 = (int) (var14 * 256.0D);
        this.field851 = (int) (var16 * 256.0D);
        if (this.field846 < 0) {
            this.field846 = 0;
        } else if (this.field846 > 255) {
            this.field846 = 255;
        }
        if (this.field851 < 0) {
            this.field851 = 0;
        } else if (this.field851 > 255) {
            this.field851 = 255;
        }
        if (var16 > 0.5D) {
            this.field852 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field852 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field852 < 1) {
            this.field852 = 1;
        }
        this.field848 = (int) ((double) this.field852 * var18);
    }

    @ObfuscatedName("h.e(I)V")
    public static void method130() {
        field847.method3092();
    }
}
