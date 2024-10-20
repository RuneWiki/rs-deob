package deob;

@ObfuscatedName("ae")
public class class37 extends class174 {

    @ObfuscatedName("ae.x")
    public static class170 field952 = new class170(64);

    @ObfuscatedName("ae.e")
    public int field953 = 0;

    @ObfuscatedName("ae.r")
    public int field954 = -1;

    @ObfuscatedName("ae.p")
    public boolean field964 = true;

    @ObfuscatedName("ae.n")
    public int field951 = -1;

    @ObfuscatedName("ae.o")
    public int field957;

    @ObfuscatedName("ae.l")
    public int field958;

    @ObfuscatedName("ae.t")
    public int field956;

    @ObfuscatedName("ae.q")
    public int field960;

    @ObfuscatedName("ae.c")
    public int field961;

    @ObfuscatedName("ae.z")
    public int field962;

    @ObfuscatedName("ae.a(I)V")
    public void method795() {
        if (this.field951 != -1) {
            this.method798(this.field951);
            this.field960 = this.field957;
            this.field961 = this.field958;
            this.field962 = this.field956;
        }
        this.method798(this.field953);
    }

    @ObfuscatedName("ae.x(Ldy;II)V")
    public void method796(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2411();
            if (var3 == 0) {
                return;
            }
            this.method797(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ae.e(Ldy;IIB)V")
    public void method797(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field953 = arg0.method2415();
        } else if (arg1 == 2) {
            this.field954 = arg0.method2411();
        } else if (arg1 == 5) {
            this.field964 = false;
        } else if (arg1 == 7) {
            this.field951 = arg0.method2415();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ae.r(IB)V")
    public void method798(int arg0) {
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
        this.field957 = (int) (var18 * 256.0D);
        this.field958 = (int) (var14 * 256.0D);
        this.field956 = (int) (var16 * 256.0D);
        if (this.field958 < 0) {
            this.field958 = 0;
        } else if (this.field958 > 255) {
            this.field958 = 255;
        }
        if (this.field956 < 0) {
            this.field956 = 0;
        } else if (this.field956 > 255) {
            this.field956 = 255;
        }
    }
}
