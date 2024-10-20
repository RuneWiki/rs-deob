package deob;

@ObfuscatedName("ie")
public class class252 extends class195 {

    @ObfuscatedName("ie.w")
    public static class190 field3401 = new class190(64);

    @ObfuscatedName("ie.a")
    public char field3398;

    @ObfuscatedName("ie.t")
    public int field3399;

    @ObfuscatedName("ie.s")
    public String field3402;

    @ObfuscatedName("ie.r")
    public boolean field3396 = true;

    @ObfuscatedName("en.i(II)Lie;")
    public static class252 method2639(int arg0) {
        class252 var1 = (class252) field3401.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3400.method3768(11, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4079(new class174(var2));
        }
        var3.method4078();
        field3401.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.w(I)V")
    public void method4078() {
    }

    @ObfuscatedName("ie.a(Lfp;I)V")
    public void method4079(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method4082(arg0, var2);
        }
    }

    @ObfuscatedName("ie.t(Lfp;II)V")
    public void method4082(class174 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method2930();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class267.field3669[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3398 = var6;
        } else if (arg1 == 2) {
            this.field3399 = arg0.method2885();
        } else if (arg1 == 4) {
            this.field3396 = false;
        } else if (arg1 == 5) {
            this.field3402 = arg0.method2884();
        }
    }

    @ObfuscatedName("ie.s(I)Z")
    public boolean method4081() {
        return this.field3398 == 's';
    }
}
