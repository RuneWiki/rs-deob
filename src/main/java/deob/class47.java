package deob;

@ObfuscatedName("aw")
public class class47 extends class204 {

    @ObfuscatedName("aw.v")
    public static class193 field1063 = new class193(64);

    @ObfuscatedName("aw.f")
    public int field1064 = 0;

    @ObfuscatedName("aw.h")
    public int field1068 = -1;

    @ObfuscatedName("aw.a")
    public boolean field1066 = true;

    @ObfuscatedName("aw.s")
    public int field1067 = -1;

    @ObfuscatedName("aw.p")
    public int field1073;

    @ObfuscatedName("aw.r")
    public int field1069;

    @ObfuscatedName("aw.k")
    public int field1070;

    @ObfuscatedName("aw.d")
    public int field1071;

    @ObfuscatedName("aw.n")
    public int field1072;

    @ObfuscatedName("aw.z")
    public int field1065;

    @ObfuscatedName("v.i(Lfn;I)V")
    public static void method5(class167 arg0) {
        Statics.field1062 = arg0;
    }

    @ObfuscatedName("ac.v(IS)Law;")
    public static class47 method695(int arg0) {
        class47 var1 = (class47) field1063.method3467((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1062.method3080(4, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method896(new class119(var2), arg0);
        }
        var3.method894();
        field1063.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.f(I)V")
    public void method894() {
        if (this.field1067 != -1) {
            this.method895(this.field1067);
            this.field1071 = this.field1073;
            this.field1072 = this.field1069;
            this.field1065 = this.field1070;
        }
        this.method895(this.field1064);
    }

    @ObfuscatedName("aw.h(Ldj;II)V")
    public void method896(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2310();
            if (var3 == 0) {
                return;
            }
            this.method911(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aw.a(Ldj;III)V")
    public void method911(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1064 = arg0.method2314();
        } else if (arg1 == 2) {
            this.field1068 = arg0.method2310();
        } else if (arg1 == 5) {
            this.field1066 = false;
        } else if (arg1 == 7) {
            this.field1067 = arg0.method2314();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("aw.s(II)V")
    public void method895(int arg0) {
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
        this.field1073 = (int) (var18 * 256.0D);
        this.field1069 = (int) (var14 * 256.0D);
        this.field1070 = (int) (var16 * 256.0D);
        if (this.field1069 < 0) {
            this.field1069 = 0;
        } else if (this.field1069 > 255) {
            this.field1069 = 255;
        }
        if (this.field1070 < 0) {
            this.field1070 = 0;
        } else if (this.field1070 > 255) {
            this.field1070 = 255;
        }
    }

    @ObfuscatedName("at.p(B)V")
    public static void method608() {
        field1063.method3464();
    }
}
