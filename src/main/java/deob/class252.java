package deob;

@ObfuscatedName("ih")
public class class252 extends class195 {

    @ObfuscatedName("ih.o")
    public static class190 field3363 = new class190(64);

    @ObfuscatedName("ih.m")
    public char field3364;

    @ObfuscatedName("ih.g")
    public int field3367;

    @ObfuscatedName("ih.d")
    public String field3362;

    @ObfuscatedName("ih.b")
    public boolean field3365 = true;

    @ObfuscatedName("bj.e(IB)Lih;")
    public static class252 method1003(int arg0) {
        class252 var1 = (class252) field3363.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3366.method3760(11, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4058(new class174(var2));
        }
        var3.method4057();
        field3363.method3250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ih.o(I)V")
    public void method4057() {
    }

    @ObfuscatedName("ih.m(Lfw;I)V")
    public void method4058(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method4065(arg0, var2);
        }
    }

    @ObfuscatedName("ih.g(Lfw;IB)V")
    public void method4065(class174 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method2944();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class267.field3650[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3364 = var6;
        } else if (arg1 == 2) {
            this.field3367 = arg0.method2896();
        } else if (arg1 == 4) {
            this.field3365 = false;
        } else if (arg1 == 5) {
            this.field3362 = arg0.method2899();
        }
    }

    @ObfuscatedName("ih.d(I)Z")
    public boolean method4067() {
        return this.field3364 == 's';
    }
}
