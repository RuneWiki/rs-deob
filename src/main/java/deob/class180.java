package deob;

@ObfuscatedName("fa")
public class class180 extends class212 {

    @ObfuscatedName("fa.a")
    public class177 field2352;

    @ObfuscatedName("fa.s")
    public int field2348;

    @ObfuscatedName("fa.g")
    public class197 field2350;

    @ObfuscatedName("fa.x")
    public int field2347;

    @ObfuscatedName("fa.h")
    public static class180[] field2351 = new class180[300];

    @ObfuscatedName("fa.f")
    public static int field2349 = 0;

    @ObfuscatedName("fg.a(S)Lfa;")
    public static class180 method3187() {
        return field2349 == 0 ? new class180() : field2351[--field2349];
    }

    @ObfuscatedName("as.s(Lfs;Lgb;I)Lfa;")
    public static class180 method625(class177 arg0, class198 arg1) {
        class180 var2 = method3187();
        var2.field2352 = arg0;
        var2.field2348 = arg0.field2277;
        if (var2.field2348 == -1) {
            var2.field2350 = new class197(260);
        } else if (var2.field2348 == -2) {
            var2.field2350 = new class197(10000);
        } else if (var2.field2348 <= 18) {
            var2.field2350 = new class197(20);
        } else if (var2.field2348 <= 98) {
            var2.field2350 = new class197(100);
        } else {
            var2.field2350 = new class197(260);
        }
        var2.field2350.method3749(arg1);
        var2.field2350.method3727(var2.field2352.field2241);
        var2.field2347 = 0;
        return var2;
    }

    @ObfuscatedName("jv.g(B)Lfa;")
    public static class180 method5041() {
        class180 var0;
        if (field2349 == 0) {
            var0 = new class180();
        } else {
            var0 = field2351[--field2349];
        }
        var0.field2352 = null;
        var0.field2348 = 0;
        var0.field2350 = new class197(5000);
        return var0;
    }

    @ObfuscatedName("fa.x(B)V")
    public void method3366() {
        if (field2349 < field2351.length) {
            field2351[++field2349 - 1] = this;
        }
    }
}
