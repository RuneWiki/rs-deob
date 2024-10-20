package deob;

@ObfuscatedName("gk")
public class class191 extends class425 {

    @ObfuscatedName("gk.f")
    public static class266 field2047 = new class266(64);

    @ObfuscatedName("gk.c")
    public char field2049;

    @ObfuscatedName("gk.x")
    public int field2050;

    @ObfuscatedName("gk.h")
    public String field2048;

    @ObfuscatedName("gk.j")
    public boolean field2046 = true;

    @ObfuscatedName("jo.a(Llg;I)V")
    public static void method4884(class330 arg0) {
        Statics.field64 = arg0;
    }

    @ObfuscatedName("he.f(IB)Lgk;")
    public static class191 method4313(int arg0) {
        class191 var1 = (class191) field2047.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field64.method5859(11, arg0);
        class191 var3 = new class191();
        if (var2 != null) {
            var3.method3328(new class464(var2));
        }
        var3.method3340();
        field2047.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gk.c(B)V")
    public void method3340() {
    }

    @ObfuscatedName("gk.x(Lqr;I)V")
    public void method3328(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3339(arg0, var2);
        }
    }

    @ObfuscatedName("gk.h(Lqr;II)V")
    public void method3339(class464 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method7881();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class356.field4294[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field2049 = var6;
        } else if (arg1 == 2) {
            this.field2050 = arg0.method7720();
        } else if (arg1 == 4) {
            this.field2046 = false;
        } else if (arg1 == 5) {
            this.field2048 = arg0.method7725();
        }
    }

    @ObfuscatedName("gk.j(I)Z")
    public boolean method3342() {
        return this.field2049 == 's';
    }

    @ObfuscatedName("lj.y(I)V")
    public static void method5728() {
        field2047.method4837();
    }
}
