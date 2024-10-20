package deob;

@ObfuscatedName("gq")
public class class197 extends class190 {

    @ObfuscatedName("gq.x")
    public class193 field2348;

    @ObfuscatedName("gq.m")
    public int field2338;

    @ObfuscatedName("gq.k")
    public class309 field2339;

    @ObfuscatedName("gq.d")
    public int field2340;

    @ObfuscatedName("gq.w")
    public static class197[] field2337 = new class197[300];

    @ObfuscatedName("gq.v")
    public static int field2342 = 0;

    @ObfuscatedName("fd.x(B)Lgq;")
    public static class197 method3198() {
        return field2342 == 0 ? new class197() : field2337[--field2342];
    }

    @ObfuscatedName("er.m(Lgn;Llp;I)Lgq;")
    public static class197 method3105(class193 arg0, class338 arg1) {
        class197 var2 = method3198();
        var2.field2348 = arg0;
        var2.field2338 = arg0.field2310;
        if (var2.field2338 == -1) {
            var2.field2339 = new class309(260);
        } else if (var2.field2338 == -2) {
            var2.field2339 = new class309(10000);
        } else if (var2.field2338 <= 18) {
            var2.field2339 = new class309(20);
        } else if (var2.field2338 <= 98) {
            var2.field2339 = new class309(100);
        } else {
            var2.field2339 = new class309(260);
        }
        var2.field2339.method5080(arg1);
        var2.field2339.method5081(var2.field2348.field2309);
        var2.field2340 = 0;
        return var2;
    }

    @ObfuscatedName("gq.k(I)V")
    public void method3384() {
        if (field2342 < field2337.length) {
            field2337[++field2342 - 1] = this;
        }
    }
}
