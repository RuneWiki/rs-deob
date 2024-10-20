package deob;

@ObfuscatedName("aj")
public class class37 extends class181 {

    @ObfuscatedName("aj.u")
    public static class171 field886 = new class171(64);

    @ObfuscatedName("aj.x")
    public int field887 = 0;

    @ObfuscatedName("aj.j")
    public int field888;

    @ObfuscatedName("aj.o")
    public int field891;

    @ObfuscatedName("aj.n")
    public int field890;

    @ObfuscatedName("aj.y")
    public int field898;

    @ObfuscatedName("aj.b(I)V")
    public void method685() {
        this.method678(this.field887);
    }

    @ObfuscatedName("aj.u(Ldh;II)V")
    public void method680(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2134();
            if (var3 == 0) {
                return;
            }
            this.method681(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aj.x(Ldh;III)V")
    public void method681(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field887 = arg0.method2138();
        }
    }

    @ObfuscatedName("aj.j(IB)V")
    public void method678(int arg0) {
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
        this.field891 = (int) (var14 * 256.0D);
        this.field890 = (int) (var16 * 256.0D);
        if (this.field891 < 0) {
            this.field891 = 0;
        } else if (this.field891 > 255) {
            this.field891 = 255;
        }
        if (this.field890 < 0) {
            this.field890 = 0;
        } else if (this.field890 > 255) {
            this.field890 = 255;
        }
        if (var16 > 0.5D) {
            this.field898 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field898 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field898 < 1) {
            this.field898 = 1;
        }
        this.field888 = (int) ((double) this.field898 * var18);
    }
}
