package deob;

@ObfuscatedName("gj")
public class class185 extends class217 {

    @ObfuscatedName("gj.g")
    public class182 field2491;

    @ObfuscatedName("gj.e")
    public int field2488;

    @ObfuscatedName("gj.b")
    public class202 field2489;

    @ObfuscatedName("gj.z")
    public int field2490;

    @ObfuscatedName("gj.n")
    public static class185[] field2487 = new class185[300];

    @ObfuscatedName("gj.l")
    public static int field2492 = 0;

    @ObfuscatedName("dk.g(Lfb;Lgo;B)Lgj;")
    public static class185 method2191(class182 arg0, class203 arg1) {
        class185 var2;
        if (field2492 == 0) {
            var2 = new class185();
        } else {
            var2 = field2487[--field2492];
        }
        var2.field2491 = arg0;
        var2.field2488 = arg0.field2464;
        if (var2.field2488 == -1) {
            var2.field2489 = new class202(260);
        } else if (var2.field2488 == -2) {
            var2.field2489 = new class202(10000);
        } else if (var2.field2488 <= 18) {
            var2.field2489 = new class202(20);
        } else if (var2.field2488 <= 98) {
            var2.field2489 = new class202(100);
        } else {
            var2.field2489 = new class202(260);
        }
        var2.field2489.method3554(arg1);
        var2.field2489.method3555(var2.field2491.field2463);
        var2.field2490 = 0;
        return var2;
    }

    @ObfuscatedName("gj.e(I)V")
    public void method3218() {
        if (field2492 < field2487.length) {
            field2487[++field2492 - 1] = this;
        }
    }
}
