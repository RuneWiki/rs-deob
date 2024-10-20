package deob;

@ObfuscatedName("an")
public class class178 extends class7 {

    @ObfuscatedName("an.b")
    public int field2723 = 0;

    @ObfuscatedName("an.c")
    public static class75 field2724 = new class75(64);

    @ObfuscatedName("an.m")
    public int field2726;

    @ObfuscatedName("an.i")
    public int field2725;

    @ObfuscatedName("an.z")
    public int field2727;

    @ObfuscatedName("an.x")
    public int field2728;

    @ObfuscatedName("an.b(Ldv;III)V")
    public void method3236(class28 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2723 = arg0.method316();
        }
    }

    @ObfuscatedName("an.i(IB)V")
    public void method3237(int arg0) {
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
        this.field2726 = (int) (var14 * 256.0D);
        this.field2727 = (int) (var16 * 256.0D);
        if (this.field2726 < 0) {
            this.field2726 = 0;
        } else if (this.field2726 > 255) {
            this.field2726 = 255;
        }
        if (this.field2727 < 0) {
            this.field2727 = 0;
        } else if (this.field2727 > 255) {
            this.field2727 = 255;
        }
        if (var16 > 0.5D) {
            this.field2728 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2728 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2728 < 1) {
            this.field2728 = 1;
        }
        this.field2725 = (int) ((double) this.field2728 * var18);
    }

    @ObfuscatedName("an.v(B)V")
    public void method3245() {
        this.method3237(this.field2723);
    }

    @ObfuscatedName("an.c(Ldv;IB)V")
    public void method3246(class28 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method450();
            if (var3 == 0) {
                return;
            }
            this.method3236(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("p.m(I)V")
    public static void method1396() {
        field2724.method1188();
    }
}
