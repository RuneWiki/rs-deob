package deob;

@ObfuscatedName("fg")
public class class175 extends class204 {

    @ObfuscatedName("fg.a")
    public class172 field2440;

    @ObfuscatedName("fg.w")
    public int field2433;

    @ObfuscatedName("fg.e")
    public class191 field2434;

    @ObfuscatedName("fg.k")
    public int field2435;

    @ObfuscatedName("fg.u")
    public static class175[] field2432 = new class175[300];

    @ObfuscatedName("fg.z")
    public static int field2437 = 0;

    @ObfuscatedName("fj.a(B)Lfg;")
    public static class175 method2801() {
        return field2437 == 0 ? new class175() : field2432[--field2437];
    }

    @ObfuscatedName("in.w(Lfo;Lgj;I)Lfg;")
    public static class175 method3893(class172 arg0, class192 arg1) {
        class175 var2 = method2801();
        var2.field2440 = arg0;
        var2.field2433 = arg0.field2409;
        if (var2.field2433 == -1) {
            var2.field2434 = new class191(260);
        } else if (var2.field2433 == -2) {
            var2.field2434 = new class191(10000);
        } else if (var2.field2433 <= 18) {
            var2.field2434 = new class191(20);
        } else if (var2.field2433 <= 98) {
            var2.field2434 = new class191(100);
        } else {
            var2.field2434 = new class191(260);
        }
        var2.field2434.method3266(arg1);
        var2.field2434.method3238(var2.field2440.field2408);
        var2.field2435 = 0;
        return var2;
    }

    @ObfuscatedName("fg.e(I)V")
    public void method2874() {
        if (field2437 < field2432.length) {
            field2432[++field2437 - 1] = this;
        }
    }
}
