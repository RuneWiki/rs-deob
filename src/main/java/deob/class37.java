package deob;

@ObfuscatedName("ax")
public class class37 extends class174 {

    @ObfuscatedName("ax.r")
    public static class170 field936 = new class170(64);

    @ObfuscatedName("ax.v")
    public int field943 = 0;

    @ObfuscatedName("ax.p")
    public int field944 = -1;

    @ObfuscatedName("ax.e")
    public boolean field940 = true;

    @ObfuscatedName("ax.d")
    public int field941 = -1;

    @ObfuscatedName("ax.y")
    public int field942;

    @ObfuscatedName("ax.x")
    public int field949;

    @ObfuscatedName("ax.t")
    public int field951;

    @ObfuscatedName("ax.i")
    public int field945;

    @ObfuscatedName("ax.z")
    public int field946;

    @ObfuscatedName("ax.o")
    public int field947;

    @ObfuscatedName("ax.j(B)V")
    public void method785() {
        if (this.field941 != -1) {
            this.method786(this.field941);
            this.field945 = this.field942;
            this.field946 = this.field949;
            this.field947 = this.field951;
        }
        this.method786(this.field943);
    }

    @ObfuscatedName("ax.r(Ldn;II)V")
    public void method780(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2441();
            if (var3 == 0) {
                return;
            }
            this.method781(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ax.v(Ldn;IIB)V")
    public void method781(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field943 = arg0.method2461();
        } else if (arg1 == 2) {
            this.field944 = arg0.method2441();
        } else if (arg1 == 5) {
            this.field940 = false;
        } else if (arg1 == 7) {
            this.field941 = arg0.method2461();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ax.p(IB)V")
    public void method786(int arg0) {
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
        this.field942 = (int) (var18 * 256.0D);
        this.field949 = (int) (var14 * 256.0D);
        this.field951 = (int) (var16 * 256.0D);
        if (this.field949 < 0) {
            this.field949 = 0;
        } else if (this.field949 > 255) {
            this.field949 = 255;
        }
        if (this.field951 < 0) {
            this.field951 = 0;
        } else if (this.field951 > 255) {
            this.field951 = 255;
        }
    }
}
