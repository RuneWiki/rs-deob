package deob;

@ObfuscatedName("az")
public class class37 extends class181 {

    @ObfuscatedName("az.j")
    public static class171 field858 = new class171(64);

    @ObfuscatedName("az.a")
    public int field859 = 0;

    @ObfuscatedName("az.y")
    public int field857;

    @ObfuscatedName("az.i")
    public int field866;

    @ObfuscatedName("az.b")
    public int field862;

    @ObfuscatedName("az.s")
    public int field863;

    @ObfuscatedName("i.z(Ler;I)V")
    public static void method32(class146 arg0) {
        Statics.field860 = arg0;
    }

    @ObfuscatedName("az.j(B)V")
    public void method672() {
        this.method675(this.field859);
    }

    @ObfuscatedName("az.a(Ldq;IB)V")
    public void method673(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2122();
            if (var3 == 0) {
                return;
            }
            this.method674(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("az.y(Ldq;IIB)V")
    public void method674(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field859 = arg0.method2212();
        }
    }

    @ObfuscatedName("az.i(IB)V")
    public void method675(int arg0) {
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
        this.field866 = (int) (var14 * 256.0D);
        this.field862 = (int) (var16 * 256.0D);
        if (this.field866 < 0) {
            this.field866 = 0;
        } else if (this.field866 > 255) {
            this.field866 = 255;
        }
        if (this.field862 < 0) {
            this.field862 = 0;
        } else if (this.field862 > 255) {
            this.field862 = 255;
        }
        if (var16 > 0.5D) {
            this.field863 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field863 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field863 < 1) {
            this.field863 = 1;
        }
        this.field857 = (int) ((double) this.field863 * var18);
    }
}
