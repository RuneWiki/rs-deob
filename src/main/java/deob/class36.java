package deob;

@ObfuscatedName("az")
public class class36 extends class172 {

    @ObfuscatedName("az.j")
    public static class168 field916 = new class168(64);

    @ObfuscatedName("az.f")
    public int field924 = 0;

    @ObfuscatedName("az.y")
    public int field918 = -1;

    @ObfuscatedName("az.x")
    public boolean field919 = true;

    @ObfuscatedName("az.e")
    public int field920 = -1;

    @ObfuscatedName("az.m")
    public int field921;

    @ObfuscatedName("az.s")
    public int field922;

    @ObfuscatedName("az.p")
    public int field928;

    @ObfuscatedName("az.w")
    public int field925;

    @ObfuscatedName("az.r")
    public int field915;

    @ObfuscatedName("az.n")
    public int field926;

    @ObfuscatedName("ek.c(II)Laz;")
    public static class36 method2563(int arg0) {
        class36 var1 = (class36) field916.method3087((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field917.method2821(4, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method751(new class125(var2), arg0);
        }
        var3.method750();
        field916.method3089(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.j(I)V")
    public void method750() {
        if (this.field920 != -1) {
            this.method757(this.field920);
            this.field925 = this.field921;
            this.field915 = this.field922;
            this.field926 = this.field928;
        }
        this.method757(this.field924);
    }

    @ObfuscatedName("az.f(Ldl;II)V")
    public void method751(class125 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2326();
            if (var3 == 0) {
                return;
            }
            this.method755(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("az.y(Ldl;III)V")
    public void method755(class125 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field924 = arg0.method2330();
        } else if (arg1 == 2) {
            this.field918 = arg0.method2326();
        } else if (arg1 == 5) {
            this.field919 = false;
        } else if (arg1 == 7) {
            this.field920 = arg0.method2330();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("az.x(II)V")
    public void method757(int arg0) {
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
        this.field921 = (int) (var18 * 256.0D);
        this.field922 = (int) (var14 * 256.0D);
        this.field928 = (int) (var16 * 256.0D);
        if (this.field922 < 0) {
            this.field922 = 0;
        } else if (this.field922 > 255) {
            this.field922 = 255;
        }
        if (this.field928 < 0) {
            this.field928 = 0;
        } else if (this.field928 > 255) {
            this.field928 = 255;
        }
    }
}
