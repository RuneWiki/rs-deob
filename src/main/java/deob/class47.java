package deob;

@ObfuscatedName("ay")
public class class47 extends class204 {

    @ObfuscatedName("ay.q")
    public static class193 field1051 = new class193(64);

    @ObfuscatedName("ay.c")
    public int field1066 = 0;

    @ObfuscatedName("ay.l")
    public int field1052 = -1;

    @ObfuscatedName("ay.r")
    public boolean field1053 = true;

    @ObfuscatedName("ay.u")
    public int field1063 = -1;

    @ObfuscatedName("ay.j")
    public int field1055;

    @ObfuscatedName("ay.w")
    public int field1056;

    @ObfuscatedName("ay.y")
    public int field1057;

    @ObfuscatedName("ay.o")
    public int field1054;

    @ObfuscatedName("ay.h")
    public int field1049;

    @ObfuscatedName("ay.e")
    public int field1060;

    @ObfuscatedName("r.n(Lfm;I)V")
    public static void method44(class167 arg0) {
        Statics.field1058 = arg0;
    }

    @ObfuscatedName("w.q(II)Lay;")
    public static class47 method108(int arg0) {
        class47 var1 = (class47) field1051.method3475((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1058.method3094(4, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method951(new class119(var2), arg0);
        }
        var3.method952();
        field1051.method3488(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.c(I)V")
    public void method952() {
        if (this.field1063 != -1) {
            this.method953(this.field1063);
            this.field1054 = this.field1055;
            this.field1049 = this.field1056;
            this.field1060 = this.field1057;
        }
        this.method953(this.field1066);
    }

    @ObfuscatedName("ay.l(Ldc;II)V")
    public void method951(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2360();
            if (var3 == 0) {
                return;
            }
            this.method964(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ay.r(Ldc;III)V")
    public void method964(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1066 = arg0.method2364();
        } else if (arg1 == 2) {
            this.field1052 = arg0.method2360();
        } else if (arg1 == 5) {
            this.field1053 = false;
        } else if (arg1 == 7) {
            this.field1063 = arg0.method2364();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ay.u(II)V")
    public void method953(int arg0) {
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
        this.field1055 = (int) (var18 * 256.0D);
        this.field1056 = (int) (var14 * 256.0D);
        this.field1057 = (int) (var16 * 256.0D);
        if (this.field1056 < 0) {
            this.field1056 = 0;
        } else if (this.field1056 > 255) {
            this.field1056 = 255;
        }
        if (this.field1057 < 0) {
            this.field1057 = 0;
        } else if (this.field1057 > 255) {
            this.field1057 = 255;
        }
    }

    @ObfuscatedName("z.j(B)V")
    public static void method197() {
        field1051.method3479();
    }
}
