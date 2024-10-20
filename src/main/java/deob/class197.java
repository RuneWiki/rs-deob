package deob;

@ObfuscatedName("gb")
public class class197 extends class190 {

    @ObfuscatedName("gb.z")
    public class193 field2375;

    @ObfuscatedName("gb.k")
    public int field2376;

    @ObfuscatedName("gb.s")
    public class309 field2377;

    @ObfuscatedName("gb.t")
    public int field2378;

    @ObfuscatedName("gb.i")
    public static class197[] field2379 = new class197[300];

    @ObfuscatedName("gb.o")
    public static int field2380 = 0;

    @ObfuscatedName("bb.z(I)Lgb;")
    public static class197 method1082() {
        return field2380 == 0 ? new class197() : field2379[--field2380];
    }

    @ObfuscatedName("client.k(Lgf;Llh;I)Lgb;")
    public static class197 method1625(class193 arg0, class338 arg1) {
        class197 var2 = method1082();
        var2.field2375 = arg0;
        var2.field2376 = arg0.field2307;
        if (var2.field2376 == -1) {
            var2.field2377 = new class309(260);
        } else if (var2.field2376 == -2) {
            var2.field2377 = new class309(10000);
        } else if (var2.field2376 <= 18) {
            var2.field2377 = new class309(20);
        } else if (var2.field2376 <= 98) {
            var2.field2377 = new class309(100);
        } else {
            var2.field2377 = new class309(260);
        }
        var2.field2377.method5148(arg1);
        var2.field2377.method5137(var2.field2375.field2257);
        var2.field2378 = 0;
        return var2;
    }

    @ObfuscatedName("iw.s(S)Lgb;")
    public static class197 method4007() {
        class197 var0 = method1082();
        var0.field2375 = null;
        var0.field2376 = 0;
        var0.field2377 = new class309(5000);
        return var0;
    }

    @ObfuscatedName("gb.t(I)V")
    public void method3423() {
        if (field2380 < field2379.length) {
            field2379[++field2380 - 1] = this;
        }
    }
}
