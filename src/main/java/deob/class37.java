package deob;

@ObfuscatedName("at")
public class class37 extends class174 {

    @ObfuscatedName("at.v")
    public static class170 field944 = new class170(64);

    @ObfuscatedName("at.m")
    public int field943 = 0;

    @ObfuscatedName("at.j")
    public int field946 = -1;

    @ObfuscatedName("at.o")
    public boolean field947 = true;

    @ObfuscatedName("at.l")
    public int field949 = -1;

    @ObfuscatedName("at.g")
    public int field955;

    @ObfuscatedName("at.w")
    public int field950;

    @ObfuscatedName("at.c")
    public int field951;

    @ObfuscatedName("at.z")
    public int field948;

    @ObfuscatedName("at.f")
    public int field953;

    @ObfuscatedName("at.a")
    public int field954;

    @ObfuscatedName("bg.i(Ler;I)V")
    public static void method1398(class152 arg0) {
        Statics.field952 = arg0;
    }

    @ObfuscatedName("bl.v(II)Lat;")
    public static class37 method1371(int arg0) {
        class37 var1 = (class37) field944.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field952.method3032(4, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method802(new class127(var2), arg0);
        }
        var3.method814();
        field944.method3307(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.m(I)V")
    public void method814() {
        if (this.field949 != -1) {
            this.method803(this.field949);
            this.field948 = this.field955;
            this.field953 = this.field950;
            this.field954 = this.field951;
        }
        this.method803(this.field943);
    }

    @ObfuscatedName("at.j(Lda;II)V")
    public void method802(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2491();
            if (var3 == 0) {
                return;
            }
            this.method817(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("at.o(Lda;III)V")
    public void method817(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field943 = arg0.method2494();
        } else if (arg1 == 2) {
            this.field946 = arg0.method2491();
        } else if (arg1 == 5) {
            this.field947 = false;
        } else if (arg1 == 7) {
            this.field949 = arg0.method2494();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("at.l(IS)V")
    public void method803(int arg0) {
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
        this.field955 = (int) (var18 * 256.0D);
        this.field950 = (int) (var14 * 256.0D);
        this.field951 = (int) (var16 * 256.0D);
        if (this.field950 < 0) {
            this.field950 = 0;
        } else if (this.field950 > 255) {
            this.field950 = 255;
        }
        if (this.field951 < 0) {
            this.field951 = 0;
        } else if (this.field951 > 255) {
            this.field951 = 255;
        }
    }
}
