package deob;

@ObfuscatedName("gx")
public class class188 extends class181 {

    @ObfuscatedName("gx.u")
    public class184 field2352;

    @ObfuscatedName("gx.f")
    public int field2346;

    @ObfuscatedName("gx.b")
    public class299 field2347;

    @ObfuscatedName("gx.g")
    public int field2349;

    @ObfuscatedName("gx.z")
    public static class188[] field2348 = new class188[300];

    @ObfuscatedName("gx.p")
    public static int field2350 = 0;

    @ObfuscatedName("he.u(I)Lgx;")
    public static class188 method3835() {
        return field2350 == 0 ? new class188() : field2348[--field2350];
    }

    @ObfuscatedName("em.f(Lgj;Lld;I)Lgx;")
    public static class188 method3035(class184 arg0, class328 arg1) {
        class188 var2 = method3835();
        var2.field2352 = arg0;
        var2.field2346 = arg0.field2308;
        if (var2.field2346 == -1) {
            var2.field2347 = new class299(260);
        } else if (var2.field2346 == -2) {
            var2.field2347 = new class299(10000);
        } else if (var2.field2346 <= 18) {
            var2.field2347 = new class299(20);
        } else if (var2.field2346 <= 98) {
            var2.field2347 = new class299(100);
        } else {
            var2.field2347 = new class299(260);
        }
        var2.field2347.method5083(arg1);
        var2.field2347.method5084(var2.field2352.field2319);
        var2.field2349 = 0;
        return var2;
    }

    @ObfuscatedName("cj.b(I)Lgx;")
    public static class188 method2018() {
        class188 var0 = method3835();
        var0.field2352 = null;
        var0.field2346 = 0;
        var0.field2347 = new class299(5000);
        return var0;
    }

    @ObfuscatedName("gx.g(B)V")
    public void method3347() {
        if (field2350 < field2348.length) {
            field2348[++field2350 - 1] = this;
        }
    }
}
