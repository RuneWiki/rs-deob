package deob;

@ObfuscatedName("al")
public class class42 extends class185 {

    @ObfuscatedName("al.y")
    public static class174 field958 = new class174(64);

    @ObfuscatedName("al.g")
    public int field959 = 0;

    @ObfuscatedName("al.j")
    public int field960 = -1;

    @ObfuscatedName("al.w")
    public boolean field969 = true;

    @ObfuscatedName("al.c")
    public int field962 = -1;

    @ObfuscatedName("al.x")
    public int field961;

    @ObfuscatedName("al.f")
    public int field964;

    @ObfuscatedName("al.t")
    public int field965;

    @ObfuscatedName("al.n")
    public int field966;

    @ObfuscatedName("al.p")
    public int field967;

    @ObfuscatedName("al.a")
    public int field968;

    @ObfuscatedName("au.l(Leo;I)V")
    public static void method620(class149 arg0) {
        Statics.field971 = arg0;
    }

    @ObfuscatedName("al.y(B)V")
    public void method797() {
        if (this.field962 != -1) {
            this.method800(this.field962);
            this.field966 = this.field961;
            this.field967 = this.field964;
            this.field968 = this.field965;
        }
        this.method800(this.field959);
    }

    @ObfuscatedName("al.g(Ldk;II)V")
    public void method798(class108 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2291();
            if (var3 == 0) {
                return;
            }
            this.method807(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("al.j(Ldk;III)V")
    public void method807(class108 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field959 = arg0.method2214();
        } else if (arg1 == 2) {
            this.field960 = arg0.method2291();
        } else if (arg1 == 5) {
            this.field969 = false;
        } else if (arg1 == 7) {
            this.field962 = arg0.method2214();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("al.w(II)V")
    public void method800(int arg0) {
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
        this.field961 = (int) (var18 * 256.0D);
        this.field964 = (int) (var14 * 256.0D);
        this.field965 = (int) (var16 * 256.0D);
        if (this.field964 < 0) {
            this.field964 = 0;
        } else if (this.field964 > 255) {
            this.field964 = 255;
        }
        if (this.field965 < 0) {
            this.field965 = 0;
        } else if (this.field965 > 255) {
            this.field965 = 255;
        }
    }

    @ObfuscatedName("e.c(I)V")
    public static void method467() {
        field958.method3214();
    }
}
