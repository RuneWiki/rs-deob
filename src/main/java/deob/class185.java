package deob;

@ObfuscatedName("gh")
public class class185 extends class217 {

    @ObfuscatedName("gh.o")
    public class182 field2509;

    @ObfuscatedName("gh.k")
    public int field2504;

    @ObfuscatedName("gh.t")
    public class202 field2505;

    @ObfuscatedName("gh.d")
    public int field2506;

    @ObfuscatedName("gh.h")
    public static class185[] field2508 = new class185[300];

    @ObfuscatedName("gh.m")
    public static int field2503 = 0;

    @ObfuscatedName("fs.o(I)Lgh;")
    public static class185 method3121() {
        return field2503 == 0 ? new class185() : field2508[--field2503];
    }

    @ObfuscatedName("at.k(Lfl;Lgx;I)Lgh;")
    public static class185 method267(class182 arg0, class203 arg1) {
        class185 var2 = method3121();
        var2.field2509 = arg0;
        var2.field2504 = arg0.field2433;
        if (var2.field2504 == -1) {
            var2.field2505 = new class202(260);
        } else if (var2.field2504 == -2) {
            var2.field2505 = new class202(10000);
        } else if (var2.field2504 <= 18) {
            var2.field2505 = new class202(20);
        } else if (var2.field2504 <= 98) {
            var2.field2505 = new class202(100);
        } else {
            var2.field2505 = new class202(260);
        }
        var2.field2505.method3458(arg1);
        var2.field2505.method3459(var2.field2509.field2482);
        var2.field2506 = 0;
        return var2;
    }

    @ObfuscatedName("gh.t(I)V")
    public void method3124() {
        if (field2503 < field2508.length) {
            field2508[++field2503 - 1] = this;
        }
    }
}
