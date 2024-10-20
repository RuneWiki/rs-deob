package deob;

@ObfuscatedName("gc")
public class class184 extends class213 {

    @ObfuscatedName("gc.b")
    public class181 field2465;

    @ObfuscatedName("gc.q")
    public int field2459;

    @ObfuscatedName("gc.o")
    public class200 field2468;

    @ObfuscatedName("gc.p")
    public int field2461;

    @ObfuscatedName("gc.a")
    public static class184[] field2462 = new class184[300];

    @ObfuscatedName("gc.h")
    public static int field2463 = 0;

    @ObfuscatedName("bk.b(Lfe;Lgo;I)Lgc;")
    public static class184 method979(class181 arg0, class201 arg1) {
        class184 var2;
        if (field2463 == 0) {
            var2 = new class184();
        } else {
            var2 = field2462[--field2463];
        }
        var2.field2465 = arg0;
        var2.field2459 = arg0.field2436;
        if (var2.field2459 == -1) {
            var2.field2468 = new class200(260);
        } else if (var2.field2459 == -2) {
            var2.field2468 = new class200(10000);
        } else if (var2.field2459 <= 18) {
            var2.field2468 = new class200(20);
        } else if (var2.field2459 <= 98) {
            var2.field2468 = new class200(100);
        } else {
            var2.field2468 = new class200(260);
        }
        var2.field2468.method3520(arg1);
        var2.field2468.method3521(var2.field2465.field2398);
        var2.field2461 = 0;
        return var2;
    }

    @ObfuscatedName("bq.q(S)Lgc;")
    public static class184 method1513() {
        class184 var0;
        if (field2463 == 0) {
            var0 = new class184();
        } else {
            var0 = field2462[--field2463];
        }
        var0.field2465 = null;
        var0.field2459 = 0;
        var0.field2468 = new class200(5000);
        return var0;
    }

    @ObfuscatedName("gc.o(I)V")
    public void method3147() {
        if (field2463 < field2462.length) {
            field2462[++field2463 - 1] = this;
        }
    }
}
