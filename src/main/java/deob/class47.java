package deob;

@ObfuscatedName("ak")
public class class47 extends class204 {

    @ObfuscatedName("ak.h")
    public static class193 field1028 = new class193(64);

    @ObfuscatedName("ak.o")
    public int field1029 = 0;

    @ObfuscatedName("ak.z")
    public int field1032 = -1;

    @ObfuscatedName("ak.c")
    public boolean field1030 = true;

    @ObfuscatedName("ak.d")
    public int field1037 = -1;

    @ObfuscatedName("ak.l")
    public int field1027;

    @ObfuscatedName("ak.b")
    public int field1031;

    @ObfuscatedName("ak.j")
    public int field1035;

    @ObfuscatedName("ak.f")
    public int field1034;

    @ObfuscatedName("ak.i")
    public int field1043;

    @ObfuscatedName("ak.g")
    public int field1038;

    @ObfuscatedName("ak.k(I)V")
    public void method910() {
        if (this.field1037 != -1) {
            this.method916(this.field1037);
            this.field1034 = this.field1027;
            this.field1043 = this.field1031;
            this.field1038 = this.field1035;
        }
        this.method916(this.field1029);
    }

    @ObfuscatedName("ak.h(Ldk;II)V")
    public void method909(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2330();
            if (var3 == 0) {
                return;
            }
            this.method912(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ak.o(Ldk;III)V")
    public void method912(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1029 = arg0.method2420();
        } else if (arg1 == 2) {
            this.field1032 = arg0.method2330();
        } else if (arg1 == 5) {
            this.field1030 = false;
        } else if (arg1 == 7) {
            this.field1037 = arg0.method2420();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ak.z(II)V")
    public void method916(int arg0) {
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
        this.field1027 = (int) (var18 * 256.0D);
        this.field1031 = (int) (var14 * 256.0D);
        this.field1035 = (int) (var16 * 256.0D);
        if (this.field1031 < 0) {
            this.field1031 = 0;
        } else if (this.field1031 > 255) {
            this.field1031 = 255;
        }
        if (this.field1035 < 0) {
            this.field1035 = 0;
        } else if (this.field1035 > 255) {
            this.field1035 = 255;
        }
    }
}
