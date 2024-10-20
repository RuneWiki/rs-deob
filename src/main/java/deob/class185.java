package deob;

@ObfuscatedName("gd")
public class class185 extends class217 {

    @ObfuscatedName("gd.t")
    public class182 field2472;

    @ObfuscatedName("gd.q")
    public int field2470;

    @ObfuscatedName("gd.i")
    public class202 field2478;

    @ObfuscatedName("gd.a")
    public int field2471;

    @ObfuscatedName("gd.l")
    public static class185[] field2480 = new class185[300];

    @ObfuscatedName("gd.b")
    public static int field2474 = 0;

    @ObfuscatedName("ap.t(Lfo;Lgv;I)Lgd;")
    public static class185 method343(class182 arg0, class203 arg1) {
        class185 var2;
        if (field2474 == 0) {
            var2 = new class185();
        } else {
            var2 = field2480[--field2474];
        }
        var2.field2472 = arg0;
        var2.field2470 = arg0.field2405;
        if (var2.field2470 == -1) {
            var2.field2478 = new class202(260);
        } else if (var2.field2470 == -2) {
            var2.field2478 = new class202(10000);
        } else if (var2.field2470 <= 18) {
            var2.field2478 = new class202(20);
        } else if (var2.field2470 <= 98) {
            var2.field2478 = new class202(100);
        } else {
            var2.field2478 = new class202(260);
        }
        var2.field2478.method3492(arg1);
        var2.field2478.method3493(var2.field2472.field2446);
        var2.field2471 = 0;
        return var2;
    }

    @ObfuscatedName("ep.q(I)Lgd;")
    public static class185 method2856() {
        class185 var0;
        if (field2474 == 0) {
            var0 = new class185();
        } else {
            var0 = field2480[--field2474];
        }
        var0.field2472 = null;
        var0.field2470 = 0;
        var0.field2478 = new class202(5000);
        return var0;
    }

    @ObfuscatedName("gd.i(B)V")
    public void method3136() {
        if (field2474 < field2480.length) {
            field2480[++field2474 - 1] = this;
        }
    }
}
