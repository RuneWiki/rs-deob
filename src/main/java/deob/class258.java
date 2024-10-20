package deob;

@ObfuscatedName("ii")
public class class258 extends class176 {

    @ObfuscatedName("ii.f")
    public static class146 field3504 = new class146(64);

    @ObfuscatedName("ii.b")
    public int field3506 = 0;

    @ObfuscatedName("ii.g")
    public int field3503 = -1;

    @ObfuscatedName("ii.z")
    public boolean field3507 = true;

    @ObfuscatedName("ii.p")
    public int field3515 = -1;

    @ObfuscatedName("ii.h")
    public int field3509;

    @ObfuscatedName("ii.y")
    public int field3510;

    @ObfuscatedName("ii.w")
    public int field3514;

    @ObfuscatedName("ii.i")
    public int field3512;

    @ObfuscatedName("ii.k")
    public int field3513;

    @ObfuscatedName("ii.x")
    public int field3505;

    @ObfuscatedName("v.u(II)Lii;")
    public static class258 method275(int arg0) {
        class258 var1 = (class258) field3504.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3511.method3928(4, arg0);
        class258 var3 = new class258();
        if (var2 != null) {
            var3.method4433(new class300(var2), arg0);
        }
        var3.method4430();
        field3504.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.f(I)V")
    public void method4430() {
        if (this.field3515 != -1) {
            this.method4432(this.field3515);
            this.field3512 = this.field3509;
            this.field3513 = this.field3510;
            this.field3505 = this.field3514;
        }
        this.method4432(this.field3506);
    }

    @ObfuscatedName("ii.b(Lkg;II)V")
    public void method4433(class300 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5138();
            if (var3 == 0) {
                return;
            }
            this.method4431(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ii.g(Lkg;III)V")
    public void method4431(class300 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3506 = arg0.method5287();
        } else if (arg1 == 2) {
            this.field3503 = arg0.method5138();
        } else if (arg1 == 5) {
            this.field3507 = false;
        } else if (arg1 == 7) {
            this.field3515 = arg0.method5287();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ii.z(II)V")
    public void method4432(int arg0) {
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
        this.field3509 = (int) (var18 * 256.0D);
        this.field3510 = (int) (var14 * 256.0D);
        this.field3514 = (int) (var16 * 256.0D);
        if (this.field3510 < 0) {
            this.field3510 = 0;
        } else if (this.field3510 > 255) {
            this.field3510 = 255;
        }
        if (this.field3514 < 0) {
            this.field3514 = 0;
        } else if (this.field3514 > 255) {
            this.field3514 = 255;
        }
    }

    @ObfuscatedName("x.p(I)V")
    public static void method134() {
        field3504.method3075();
    }
}
