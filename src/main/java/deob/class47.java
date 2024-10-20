package deob;

@ObfuscatedName("as")
public class class47 extends class204 {

    @ObfuscatedName("as.q")
    public static class193 field1038 = new class193(64);

    @ObfuscatedName("as.k")
    public int field1039 = 0;

    @ObfuscatedName("as.f")
    public int field1045 = -1;

    @ObfuscatedName("as.d")
    public boolean field1037 = true;

    @ObfuscatedName("as.l")
    public int field1042 = -1;

    @ObfuscatedName("as.r")
    public int field1049;

    @ObfuscatedName("as.g")
    public int field1044;

    @ObfuscatedName("as.h")
    public int field1043;

    @ObfuscatedName("as.n")
    public int field1046;

    @ObfuscatedName("as.j")
    public int field1051;

    @ObfuscatedName("as.a")
    public int field1047;

    @ObfuscatedName("cu.z(II)Las;")
    public static class47 method1886(int arg0) {
        class47 var1 = (class47) field1038.method3439((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1048.method2986(4, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method919(new class119(var2), arg0);
        }
        var3.method914();
        field1038.method3429(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.q(B)V")
    public void method914() {
        if (this.field1042 != -1) {
            this.method917(this.field1042);
            this.field1046 = this.field1049;
            this.field1051 = this.field1044;
            this.field1047 = this.field1043;
        }
        this.method917(this.field1039);
    }

    @ObfuscatedName("as.k(Lda;II)V")
    public void method919(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2457();
            if (var3 == 0) {
                return;
            }
            this.method916(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("as.f(Lda;III)V")
    public void method916(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1039 = arg0.method2305();
        } else if (arg1 == 2) {
            this.field1045 = arg0.method2457();
        } else if (arg1 == 5) {
            this.field1037 = false;
        } else if (arg1 == 7) {
            this.field1042 = arg0.method2305();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("as.d(IB)V")
    public void method917(int arg0) {
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
        this.field1049 = (int) (var18 * 256.0D);
        this.field1044 = (int) (var14 * 256.0D);
        this.field1043 = (int) (var16 * 256.0D);
        if (this.field1044 < 0) {
            this.field1044 = 0;
        } else if (this.field1044 > 255) {
            this.field1044 = 255;
        }
        if (this.field1043 < 0) {
            this.field1043 = 0;
        } else if (this.field1043 > 255) {
            this.field1043 = 255;
        }
    }
}
