package deob;

@ObfuscatedName("gv")
public class class185 extends class406 {

    @ObfuscatedName("gv.q")
    public static class257 field2044 = new class257(64);

    @ObfuscatedName("gv.l")
    public char field2043;

    @ObfuscatedName("gv.k")
    public int field2046;

    @ObfuscatedName("gv.a")
    public String field2047;

    @ObfuscatedName("gv.m")
    public boolean field2045 = true;

    @ObfuscatedName("kz.o(Llp;I)V")
    public static void method5124(class316 arg0) {
        Statics.field2048 = arg0;
    }

    @ObfuscatedName("co.q(II)Lgv;")
    public static class185 method1959(int arg0) {
        class185 var1 = (class185) field2044.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2048.method5249(11, arg0);
        class185 var3 = new class185();
        if (var2 != null) {
            var3.method3197(new class440(var2));
        }
        var3.method3200();
        field2044.method4571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gv.l(B)V")
    public void method3200() {
    }

    @ObfuscatedName("gv.k(Lpx;I)V")
    public void method3197(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            this.method3198(arg0, var2);
        }
    }

    @ObfuscatedName("gv.a(Lpx;IS)V")
    public void method3198(class440 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method7034();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class342.field4158[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field2043 = var6;
        } else if (arg1 == 2) {
            this.field2046 = arg0.method6898();
        } else if (arg1 == 4) {
            this.field2045 = false;
        } else if (arg1 == 5) {
            this.field2047 = arg0.method7044();
        }
    }

    @ObfuscatedName("gv.m(I)Z")
    public boolean method3199() {
        return this.field2043 == 's';
    }
}
