package deob;

@ObfuscatedName("gs")
public class class188 extends class181 {

    @ObfuscatedName("gs.c")
    public class184 field2341;

    @ObfuscatedName("gs.t")
    public int field2334;

    @ObfuscatedName("gs.o")
    public class300 field2335;

    @ObfuscatedName("gs.e")
    public int field2340;

    @ObfuscatedName("gs.i")
    public static class188[] field2337 = new class188[300];

    @ObfuscatedName("gs.g")
    public static int field2338 = 0;

    @ObfuscatedName("fl.c(I)Lgs;")
    public static class188 method3189() {
        return field2338 == 0 ? new class188() : field2337[--field2338];
    }

    @ObfuscatedName("ee.t(Lgi;Llw;I)Lgs;")
    public static class188 method2887(class184 arg0, class329 arg1) {
        class188 var2 = method3189();
        var2.field2341 = arg0;
        var2.field2334 = arg0.field2306;
        if (var2.field2334 == -1) {
            var2.field2335 = new class300(260);
        } else if (var2.field2334 == -2) {
            var2.field2335 = new class300(10000);
        } else if (var2.field2334 <= 18) {
            var2.field2335 = new class300(20);
        } else if (var2.field2334 <= 98) {
            var2.field2335 = new class300(100);
        } else {
            var2.field2335 = new class300(260);
        }
        var2.field2335.method5074(arg1);
        var2.field2335.method5097(var2.field2341.field2305);
        var2.field2340 = 0;
        return var2;
    }

    @ObfuscatedName("gs.o(I)V")
    public void method3368() {
        if (field2338 < field2337.length) {
            field2337[++field2338 - 1] = this;
        }
    }
}
