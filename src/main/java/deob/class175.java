package deob;

@ObfuscatedName("fa")
public class class175 extends class204 {

    @ObfuscatedName("fa.p")
    public int field2401;

    @ObfuscatedName("fa.i")
    public class172 field2404;

    @ObfuscatedName("fa.w")
    public int field2400;

    @ObfuscatedName("fa.s")
    public class191 field2403;

    @ObfuscatedName("fa.j")
    public static class175[] field2402 = new class175[300];

    @ObfuscatedName("fa.a")
    public static int field2405 = 0;

    @ObfuscatedName("gl.p(B)Lfa;")
    public static class175 method3345() {
        return field2405 == 0 ? new class175() : field2402[--field2405];
    }

    @ObfuscatedName("au.i(Lfy;Lgo;B)Lfa;")
    public static class175 method470(class172 arg0, class192 arg1) {
        class175 var2 = method3345();
        var2.field2404 = arg0;
        var2.field2400 = arg0.field2380;
        if (var2.field2400 == -1) {
            var2.field2403 = new class191(260);
        } else if (var2.field2400 == -2) {
            var2.field2403 = new class191(10000);
        } else if (var2.field2400 <= 18) {
            var2.field2403 = new class191(20);
        } else if (var2.field2400 <= 98) {
            var2.field2403 = new class191(100);
        } else {
            var2.field2403 = new class191(260);
        }
        var2.field2403.method3377(arg1);
        var2.field2403.method3366(var2.field2404.field2379);
        var2.field2401 = 0;
        return var2;
    }

    @ObfuscatedName("fa.w(I)V")
    public void method3020() {
        if (field2405 < field2402.length) {
            field2402[++field2405 - 1] = this;
        }
    }
}
