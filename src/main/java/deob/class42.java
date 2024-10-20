package deob;

@ObfuscatedName("av")
public class class42 extends class187 {

    @ObfuscatedName("av.t")
    public static class176 field965 = new class176(64);

    @ObfuscatedName("av.f")
    public int field972 = 0;

    @ObfuscatedName("av.j")
    public int field967 = -1;

    @ObfuscatedName("av.l")
    public boolean field968 = true;

    @ObfuscatedName("av.g")
    public int field966 = -1;

    @ObfuscatedName("av.k")
    public int field970;

    @ObfuscatedName("av.p")
    public int field971;

    @ObfuscatedName("av.y")
    public int field976;

    @ObfuscatedName("av.m")
    public int field973;

    @ObfuscatedName("av.o")
    public int field974;

    @ObfuscatedName("av.c")
    public int field975;

    @ObfuscatedName("r.v(II)Lav;")
    public static class42 method129(int arg0) {
        class42 var1 = (class42) field965.method3231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field969.method2852(4, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method800(new class110(var2), arg0);
        }
        var3.method807();
        field965.method3228(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.t(B)V")
    public void method807() {
        if (this.field966 != -1) {
            this.method802(this.field966);
            this.field973 = this.field970;
            this.field974 = this.field971;
            this.field975 = this.field976;
        }
        this.method802(this.field972);
    }

    @ObfuscatedName("av.f(Ldp;IB)V")
    public void method800(class110 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2257();
            if (var3 == 0) {
                return;
            }
            this.method801(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("av.j(Ldp;IIB)V")
    public void method801(class110 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field972 = arg0.method2267();
        } else if (arg1 == 2) {
            this.field967 = arg0.method2257();
        } else if (arg1 == 5) {
            this.field968 = false;
        } else if (arg1 == 7) {
            this.field966 = arg0.method2267();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("av.l(II)V")
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
        this.field970 = (int) (var18 * 256.0D);
        this.field971 = (int) (var14 * 256.0D);
        this.field976 = (int) (var16 * 256.0D);
        if (this.field971 < 0) {
            this.field971 = 0;
        } else if (this.field971 > 255) {
            this.field971 = 255;
        }
        if (this.field976 < 0) {
            this.field976 = 0;
        } else if (this.field976 > 255) {
            this.field976 = 255;
        }
    }

    @ObfuscatedName("ad.g(I)V")
    public static void method538() {
        field965.method3229();
    }
}
