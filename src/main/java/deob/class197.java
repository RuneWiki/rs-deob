package deob;

@ObfuscatedName("gj")
public class class197 extends class190 {

    @ObfuscatedName("gj.m")
    public class193 field2379;

    @ObfuscatedName("gj.o")
    public int field2372;

    @ObfuscatedName("gj.q")
    public class309 field2375;

    @ObfuscatedName("gj.j")
    public int field2373;

    @ObfuscatedName("gj.p")
    public static class197[] field2374 = new class197[300];

    @ObfuscatedName("gj.g")
    public static int field2370 = 0;

    @ObfuscatedName("fc.m(Lgn;Llb;I)Lgj;")
    public static class197 method3184(class193 arg0, class338 arg1) {
        class197 var2;
        if (field2370 == 0) {
            var2 = new class197();
        } else {
            var2 = field2374[--field2370];
        }
        var2.field2379 = arg0;
        var2.field2372 = arg0.field2344;
        if (var2.field2372 == -1) {
            var2.field2375 = new class309(260);
        } else if (var2.field2372 == -2) {
            var2.field2375 = new class309(10000);
        } else if (var2.field2372 <= 18) {
            var2.field2375 = new class309(20);
        } else if (var2.field2372 <= 98) {
            var2.field2375 = new class309(100);
        } else {
            var2.field2375 = new class309(260);
        }
        var2.field2375.method5164(arg1);
        var2.field2375.method5187(var2.field2379.field2343);
        var2.field2373 = 0;
        return var2;
    }

    @ObfuscatedName("ea.o(B)Lgj;")
    public static class197 method2704() {
        class197 var0;
        if (field2370 == 0) {
            var0 = new class197();
        } else {
            var0 = field2374[--field2370];
        }
        var0.field2379 = null;
        var0.field2372 = 0;
        var0.field2375 = new class309(5000);
        return var0;
    }

    @ObfuscatedName("gj.q(B)V")
    public void method3403() {
        if (field2370 < field2374.length) {
            field2374[++field2370 - 1] = this;
        }
    }
}
