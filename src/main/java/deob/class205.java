package deob;

@ObfuscatedName("gy")
public class class205 extends class351 {

    @ObfuscatedName("gy.f")
    public class203 field2348;

    @ObfuscatedName("gy.o")
    public int field2343;

    @ObfuscatedName("gy.u")
    public class381 field2342;

    @ObfuscatedName("gy.p")
    public int field2344;

    @ObfuscatedName("gy.b")
    public static class205[] field2345 = new class205[300];

    @ObfuscatedName("gy.e")
    public static int field2347 = 0;

    @ObfuscatedName("gd.f(I)Lgy;")
    public static class205 method3349() {
        return field2347 == 0 ? new class205() : field2345[--field2347];
    }

    @ObfuscatedName("kj.o(Lgx;Loy;I)Lgy;")
    public static class205 method4631(class203 arg0, class398 arg1) {
        class205 var2 = method3349();
        var2.field2348 = arg0;
        var2.field2343 = arg0.field2325;
        if (var2.field2343 == -1) {
            var2.field2342 = new class381(260);
        } else if (var2.field2343 == -2) {
            var2.field2342 = new class381(10000);
        } else if (var2.field2343 <= 18) {
            var2.field2342 = new class381(20);
        } else if (var2.field2343 <= 98) {
            var2.field2342 = new class381(100);
        } else {
            var2.field2342 = new class381(260);
        }
        var2.field2342.method5810(arg1);
        var2.field2342.method5802(var2.field2348.field2324);
        var2.field2344 = 0;
        return var2;
    }

    @ObfuscatedName("k.u(I)Lgy;")
    public static class205 method69() {
        class205 var0;
        if (field2347 == 0) {
            var0 = new class205();
        } else {
            var0 = field2345[--field2347];
        }
        var0.field2348 = null;
        var0.field2343 = 0;
        var0.field2342 = new class381(5000);
        return var0;
    }

    @ObfuscatedName("gy.p(I)V")
    public void method3408() {
        if (field2347 < field2345.length) {
            field2345[++field2347 - 1] = this;
        }
    }
}
