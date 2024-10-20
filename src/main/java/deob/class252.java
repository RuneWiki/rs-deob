package deob;

@ObfuscatedName("it")
public class class252 extends class195 {

    @ObfuscatedName("it.q")
    public static class190 field3367 = new class190(64);

    @ObfuscatedName("it.x")
    public char field3368;

    @ObfuscatedName("it.y")
    public int field3372;

    @ObfuscatedName("it.e")
    public String field3370;

    @ObfuscatedName("it.f")
    public boolean field3371 = true;

    @ObfuscatedName("bb.d(Lim;I)V")
    public static void method1019(class236 arg0) {
        Statics.field3366 = arg0;
    }

    @ObfuscatedName("cd.q(IB)Lit;")
    public static class252 method1696(int arg0) {
        class252 var1 = (class252) field3367.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3366.method3750(11, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4027(new class174(var2));
        }
        var3.method4041();
        field3367.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("it.x(I)V")
    public void method4041() {
    }

    @ObfuscatedName("it.y(Lfw;I)V")
    public void method4027(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method4028(arg0, var2);
        }
    }

    @ObfuscatedName("it.e(Lfw;II)V")
    public void method4028(class174 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method3082();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class267.field3646[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3368 = var6;
        } else if (arg1 == 2) {
            this.field3372 = arg0.method2935();
        } else if (arg1 == 4) {
            this.field3371 = false;
        } else if (arg1 == 5) {
            this.field3370 = arg0.method2922();
        }
    }

    @ObfuscatedName("it.f(B)Z")
    public boolean method4029() {
        return this.field3368 == 's';
    }

    @ObfuscatedName("hi.v(I)V")
    public static void method3723() {
        field3367.method3250();
    }
}
