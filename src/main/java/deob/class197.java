package deob;

@ObfuscatedName("gk")
public class class197 extends class190 {

    @ObfuscatedName("gk.f")
    public class193 field2369;

    @ObfuscatedName("gk.b")
    public int field2368;

    @ObfuscatedName("gk.l")
    public class310 field2371;

    @ObfuscatedName("gk.m")
    public int field2370;

    @ObfuscatedName("gk.z")
    public static class197[] field2367 = new class197[300];

    @ObfuscatedName("gk.q")
    public static int field2372 = 0;

    @ObfuscatedName("cr.f(I)Lgk;")
    public static class197 method2156() {
        return field2372 == 0 ? new class197() : field2367[--field2372];
    }

    @ObfuscatedName("z.b(Lgz;Lmh;B)Lgk;")
    public static class197 method57(class193 arg0, class339 arg1) {
        class197 var2 = method2156();
        var2.field2369 = arg0;
        var2.field2368 = arg0.field2279;
        if (var2.field2368 == -1) {
            var2.field2371 = new class310(260);
        } else if (var2.field2368 == -2) {
            var2.field2371 = new class310(10000);
        } else if (var2.field2368 <= 18) {
            var2.field2371 = new class310(20);
        } else if (var2.field2368 <= 98) {
            var2.field2371 = new class310(100);
        } else {
            var2.field2371 = new class310(260);
        }
        var2.field2371.method5121(arg1);
        var2.field2371.method5142(var2.field2369.field2337);
        var2.field2370 = 0;
        return var2;
    }

    @ObfuscatedName("gx.l(I)Lgk;")
    public static class197 method3515() {
        class197 var0 = method2156();
        var0.field2369 = null;
        var0.field2368 = 0;
        var0.field2371 = new class310(5000);
        return var0;
    }

    @ObfuscatedName("gk.m(I)V")
    public void method3435() {
        if (field2372 < field2367.length) {
            field2367[++field2372 - 1] = this;
        }
    }
}
