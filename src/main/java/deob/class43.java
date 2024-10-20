package deob;

@ObfuscatedName("av")
public class class43 extends class195 {

    @ObfuscatedName("av.g")
    public static class184 field1033 = new class184(64);

    @ObfuscatedName("av.a")
    public int field1022 = 0;

    @ObfuscatedName("av.m")
    public int field1027 = -1;

    @ObfuscatedName("av.s")
    public boolean field1024 = true;

    @ObfuscatedName("av.j")
    public int field1025 = -1;

    @ObfuscatedName("av.f")
    public int field1026;

    @ObfuscatedName("av.b")
    public int field1023;

    @ObfuscatedName("av.t")
    public int field1020;

    @ObfuscatedName("av.i")
    public int field1029;

    @ObfuscatedName("av.c")
    public int field1030;

    @ObfuscatedName("av.k")
    public int field1031;

    @ObfuscatedName("x.n(Lfi;I)V")
    public static void method135(class158 arg0) {
        Statics.field1021 = arg0;
    }

    @ObfuscatedName("av.g(I)V")
    public void method845() {
        if (this.field1025 != -1) {
            this.method832(this.field1025);
            this.field1029 = this.field1026;
            this.field1030 = this.field1023;
            this.field1031 = this.field1020;
        }
        this.method832(this.field1022);
    }

    @ObfuscatedName("av.a(Ldp;II)V")
    public void method831(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2211();
            if (var3 == 0) {
                return;
            }
            this.method843(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("av.m(Ldp;III)V")
    public void method843(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1022 = arg0.method2228();
        } else if (arg1 == 2) {
            this.field1027 = arg0.method2211();
        } else if (arg1 == 5) {
            this.field1024 = false;
        } else if (arg1 == 7) {
            this.field1025 = arg0.method2228();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("av.s(II)V")
    public void method832(int arg0) {
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
        this.field1026 = (int) (var18 * 256.0D);
        this.field1023 = (int) (var14 * 256.0D);
        this.field1020 = (int) (var16 * 256.0D);
        if (this.field1023 < 0) {
            this.field1023 = 0;
        } else if (this.field1023 > 255) {
            this.field1023 = 255;
        }
        if (this.field1020 < 0) {
            this.field1020 = 0;
        } else if (this.field1020 > 255) {
            this.field1020 = 255;
        }
    }

    @ObfuscatedName("aj.j(B)V")
    public static void method559() {
        field1033.method3398();
    }
}
