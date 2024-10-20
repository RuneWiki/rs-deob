package deob;

@ObfuscatedName("gg")
public class class185 extends class217 {

    @ObfuscatedName("gg.c")
    public class182 field2500;

    @ObfuscatedName("gg.i")
    public int field2493;

    @ObfuscatedName("gg.o")
    public class202 field2501;

    @ObfuscatedName("gg.j")
    public int field2495;

    @ObfuscatedName("gg.k")
    public static class185[] field2496 = new class185[300];

    @ObfuscatedName("gg.x")
    public static int field2497 = 0;

    @ObfuscatedName("em.c(Lfd;Lgr;B)Lgg;")
    public static class185 method2860(class182 arg0, class203 arg1) {
        class185 var2;
        if (field2497 == 0) {
            var2 = new class185();
        } else {
            var2 = field2496[--field2497];
        }
        var2.field2500 = arg0;
        var2.field2493 = arg0.field2429;
        if (var2.field2493 == -1) {
            var2.field2501 = new class202(260);
        } else if (var2.field2493 == -2) {
            var2.field2501 = new class202(10000);
        } else if (var2.field2493 <= 18) {
            var2.field2501 = new class202(20);
        } else if (var2.field2493 <= 98) {
            var2.field2501 = new class202(100);
        } else {
            var2.field2501 = new class202(260);
        }
        var2.field2501.method3512(arg1);
        var2.field2501.method3486(var2.field2500.field2471);
        var2.field2495 = 0;
        return var2;
    }

    @ObfuscatedName("w.i(I)Lgg;")
    public static class185 method42() {
        class185 var0;
        if (field2497 == 0) {
            var0 = new class185();
        } else {
            var0 = field2496[--field2497];
        }
        var0.field2500 = null;
        var0.field2493 = 0;
        var0.field2501 = new class202(5000);
        return var0;
    }

    @ObfuscatedName("gg.o(I)V")
    public void method3137() {
        if (field2497 < field2496.length) {
            field2496[++field2497 - 1] = this;
        }
    }
}
