package deob;

@ObfuscatedName("at")
public class class36 extends class172 {

    @ObfuscatedName("at.y")
    public static class168 field919 = new class168(64);

    @ObfuscatedName("at.x")
    public int field928 = 0;

    @ObfuscatedName("at.z")
    public int field920 = -1;

    @ObfuscatedName("at.c")
    public boolean field922 = true;

    @ObfuscatedName("at.e")
    public int field923 = -1;

    @ObfuscatedName("at.s")
    public int field932;

    @ObfuscatedName("at.i")
    public int field925;

    @ObfuscatedName("at.g")
    public int field926;

    @ObfuscatedName("at.q")
    public int field924;

    @ObfuscatedName("at.w")
    public int field918;

    @ObfuscatedName("at.k")
    public int field929;

    @ObfuscatedName("av.j(II)Lat;")
    public static class36 method680(int arg0) {
        class36 var1 = (class36) field919.method3191((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field927.method2903(4, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method765(new class126(var2), arg0);
        }
        var3.method764();
        field919.method3181(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.y(B)V")
    public void method764() {
        if (this.field923 != -1) {
            this.method771(this.field923);
            this.field924 = this.field932;
            this.field918 = this.field925;
            this.field929 = this.field926;
        }
        this.method771(this.field928);
    }

    @ObfuscatedName("at.x(Ldr;II)V")
    public void method765(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2399();
            if (var3 == 0) {
                return;
            }
            this.method766(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("at.z(Ldr;III)V")
    public void method766(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field928 = arg0.method2386();
        } else if (arg1 == 2) {
            this.field920 = arg0.method2399();
        } else if (arg1 == 5) {
            this.field922 = false;
        } else if (arg1 == 7) {
            this.field923 = arg0.method2386();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("at.c(IB)V")
    public void method771(int arg0) {
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
        this.field932 = (int) (var18 * 256.0D);
        this.field925 = (int) (var14 * 256.0D);
        this.field926 = (int) (var16 * 256.0D);
        if (this.field925 < 0) {
            this.field925 = 0;
        } else if (this.field925 > 255) {
            this.field925 = 255;
        }
        if (this.field926 < 0) {
            this.field926 = 0;
        } else if (this.field926 > 255) {
            this.field926 = 255;
        }
    }
}
