package deob;

@ObfuscatedName("gl")
public class class185 extends class217 {

    @ObfuscatedName("gl.d")
    public class182 field2499;

    @ObfuscatedName("gl.z")
    public int field2494;

    @ObfuscatedName("gl.n")
    public class202 field2497;

    @ObfuscatedName("gl.r")
    public int field2496;

    @ObfuscatedName("gl.e")
    public static class185[] field2495 = new class185[300];

    @ObfuscatedName("gl.y")
    public static int field2498 = 0;

    @ObfuscatedName("au.d(Lfn;Lgc;I)Lgl;")
    public static class185 method251(class182 arg0, class203 arg1) {
        class185 var2;
        if (field2498 == 0) {
            var2 = new class185();
        } else {
            var2 = field2495[--field2498];
        }
        var2.field2499 = arg0;
        var2.field2494 = arg0.field2474;
        if (var2.field2494 == -1) {
            var2.field2497 = new class202(260);
        } else if (var2.field2494 == -2) {
            var2.field2497 = new class202(10000);
        } else if (var2.field2494 <= 18) {
            var2.field2497 = new class202(20);
        } else if (var2.field2494 <= 98) {
            var2.field2497 = new class202(100);
        } else {
            var2.field2497 = new class202(260);
        }
        var2.field2497.method3540(arg1);
        var2.field2497.method3549(var2.field2499.field2425);
        var2.field2496 = 0;
        return var2;
    }

    @ObfuscatedName("gl.z(S)V")
    public void method3163() {
        if (field2498 < field2495.length) {
            field2495[++field2498 - 1] = this;
        }
    }
}
