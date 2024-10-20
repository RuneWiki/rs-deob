package deob;

@ObfuscatedName("aj")
public class class42 extends class205 {

    @ObfuscatedName("aj.i")
    public static class194 field978 = new class194(64);

    @ObfuscatedName("aj.g")
    public int field968 = 0;

    @ObfuscatedName("aj.h")
    public int field969;

    @ObfuscatedName("aj.z")
    public int field975;

    @ObfuscatedName("aj.r")
    public int field971;

    @ObfuscatedName("aj.f")
    public int field974;

    @ObfuscatedName("aj.t(Lfp;B)V")
    public static void method808(class168 arg0) {
        Statics.field3170 = arg0;
    }

    @ObfuscatedName("ay.i(IB)Laj;")
    public static class42 method666(int arg0) {
        class42 var1 = (class42) field978.method3453((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3170.method3002(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method804(new class120(var2), arg0);
        }
        var3.method814();
        field978.method3461(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.g(I)V")
    public void method814() {
        this.method802(this.field968);
    }

    @ObfuscatedName("aj.h(Ldr;II)V")
    public void method804(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2334();
            if (var3 == 0) {
                return;
            }
            this.method801(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aj.z(Ldr;III)V")
    public void method801(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field968 = arg0.method2312();
        }
    }

    @ObfuscatedName("aj.r(IB)V")
    public void method802(int arg0) {
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
        this.field975 = (int) (var14 * 256.0D);
        this.field971 = (int) (var16 * 256.0D);
        if (this.field975 < 0) {
            this.field975 = 0;
        } else if (this.field975 > 255) {
            this.field975 = 255;
        }
        if (this.field971 < 0) {
            this.field971 = 0;
        } else if (this.field971 > 255) {
            this.field971 = 255;
        }
        if (var16 > 0.5D) {
            this.field974 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field974 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field974 < 1) {
            this.field974 = 1;
        }
        this.field969 = (int) ((double) this.field974 * var18);
    }
}
