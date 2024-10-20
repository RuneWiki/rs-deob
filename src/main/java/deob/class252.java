package deob;

@ObfuscatedName("iw")
public class class252 extends class195 {

    @ObfuscatedName("iw.p")
    public static class190 field3389 = new class190(64);

    @ObfuscatedName("iw.i")
    public char field3396;

    @ObfuscatedName("iw.j")
    public int field3391;

    @ObfuscatedName("iw.f")
    public String field3392;

    @ObfuscatedName("iw.m")
    public boolean field3388 = true;

    @ObfuscatedName("bx.n(Lis;I)V")
    public static void method713(class236 arg0) {
        Statics.field3390 = arg0;
    }

    @ObfuscatedName("cz.p(IB)Liw;")
    public static class252 method1729(int arg0) {
        class252 var1 = (class252) field3389.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3390.method3880(11, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4157(new class174(var2));
        }
        var3.method4145();
        field3389.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.i(I)V")
    public void method4145() {
    }

    @ObfuscatedName("iw.j(Lfl;I)V")
    public void method4157(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method4144(arg0, var2);
        }
    }

    @ObfuscatedName("iw.f(Lfl;II)V")
    public void method4144(class174 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method2922();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class267.field3674[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3396 = var6;
        } else if (arg1 == 2) {
            this.field3391 = arg0.method3058();
        } else if (arg1 == 4) {
            this.field3388 = false;
        } else if (arg1 == 5) {
            this.field3392 = arg0.method3098();
        }
    }

    @ObfuscatedName("iw.m(B)Z")
    public boolean method4148() {
        return this.field3396 == 's';
    }
}
