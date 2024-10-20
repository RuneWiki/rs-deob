package deob;

@ObfuscatedName("an")
public class class36 extends class173 {

    @ObfuscatedName("an.j")
    public static class169 field934 = new class169(64);

    @ObfuscatedName("an.w")
    public int field935 = 0;

    @ObfuscatedName("an.h")
    public int field948 = -1;

    @ObfuscatedName("an.v")
    public boolean field937 = true;

    @ObfuscatedName("an.k")
    public int field938 = -1;

    @ObfuscatedName("an.g")
    public int field946;

    @ObfuscatedName("an.n")
    public int field940;

    @ObfuscatedName("an.c")
    public int field939;

    @ObfuscatedName("an.o")
    public int field942;

    @ObfuscatedName("an.u")
    public int field943;

    @ObfuscatedName("an.z")
    public int field944;

    @ObfuscatedName("an.j(B)V")
    public void method770() {
        if (this.field938 != -1) {
            this.method760(this.field938);
            this.field942 = this.field946;
            this.field943 = this.field940;
            this.field944 = this.field939;
        }
        this.method760(this.field935);
    }

    @ObfuscatedName("an.w(Ldv;II)V")
    public void method756(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2544();
            if (var3 == 0) {
                return;
            }
            this.method757(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("an.h(Ldv;IIB)V")
    public void method757(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field935 = arg0.method2530();
        } else if (arg1 == 2) {
            this.field948 = arg0.method2544();
        } else if (arg1 == 5) {
            this.field937 = false;
        } else if (arg1 == 7) {
            this.field938 = arg0.method2530();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("an.v(II)V")
    public void method760(int arg0) {
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
        this.field946 = (int) (var18 * 256.0D);
        this.field940 = (int) (var14 * 256.0D);
        this.field939 = (int) (var16 * 256.0D);
        if (this.field940 < 0) {
            this.field940 = 0;
        } else if (this.field940 > 255) {
            this.field940 = 255;
        }
        if (this.field939 < 0) {
            this.field939 = 0;
        } else if (this.field939 > 255) {
            this.field939 = 255;
        }
    }
}
