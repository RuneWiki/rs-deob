package deob;

@ObfuscatedName("aw")
public class class37 extends class181 {

    @ObfuscatedName("aw.z")
    public static class171 field894 = new class171(64);

    @ObfuscatedName("aw.y")
    public int field892 = 0;

    @ObfuscatedName("aw.h")
    public int field893;

    @ObfuscatedName("aw.r")
    public int field896;

    @ObfuscatedName("aw.e")
    public int field890;

    @ObfuscatedName("aw.k")
    public int field895;

    @ObfuscatedName("aw.j(I)V")
    public void method667() {
        this.method670(this.field892);
    }

    @ObfuscatedName("aw.z(Lde;IB)V")
    public void method666(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2130();
            if (var3 == 0) {
                return;
            }
            this.method669(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aw.y(Lde;IIB)V")
    public void method669(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field892 = arg0.method2252();
        }
    }

    @ObfuscatedName("aw.h(IB)V")
    public void method670(int arg0) {
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
        this.field896 = (int) (var14 * 256.0D);
        this.field890 = (int) (var16 * 256.0D);
        if (this.field896 < 0) {
            this.field896 = 0;
        } else if (this.field896 > 255) {
            this.field896 = 255;
        }
        if (this.field890 < 0) {
            this.field890 = 0;
        } else if (this.field890 > 255) {
            this.field890 = 255;
        }
        if (var16 > 0.5D) {
            this.field895 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field895 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field895 < 1) {
            this.field895 = 1;
        }
        this.field893 = (int) ((double) this.field895 * var18);
    }

    @ObfuscatedName("aq.r(I)V")
    public static void method713() {
        field894.method3170();
    }
}
