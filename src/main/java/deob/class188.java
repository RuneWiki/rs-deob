package deob;

@ObfuscatedName("gq")
public class class188 extends class181 {

    @ObfuscatedName("gq.s")
    public class184 field2319;

    @ObfuscatedName("gq.j")
    public int field2313;

    @ObfuscatedName("gq.i")
    public class299 field2321;

    @ObfuscatedName("gq.k")
    public int field2315;

    @ObfuscatedName("gq.u")
    public static class188[] field2312 = new class188[300];

    @ObfuscatedName("gq.n")
    public static int field2317 = 0;

    @ObfuscatedName("ky.s(I)Lgq;")
    public static class188 method5211() {
        return field2317 == 0 ? new class188() : field2312[--field2317];
    }

    @ObfuscatedName("cd.j(Lgv;Lle;B)Lgq;")
    public static class188 method1879(class184 arg0, class328 arg1) {
        class188 var2 = method5211();
        var2.field2319 = arg0;
        var2.field2313 = arg0.field2268;
        if (var2.field2313 == -1) {
            var2.field2321 = new class299(260);
        } else if (var2.field2313 == -2) {
            var2.field2321 = new class299(10000);
        } else if (var2.field2313 <= 18) {
            var2.field2321 = new class299(20);
        } else if (var2.field2313 <= 98) {
            var2.field2321 = new class299(100);
        } else {
            var2.field2321 = new class299(260);
        }
        var2.field2321.method5021(arg1);
        var2.field2321.method4999(var2.field2319.field2287);
        var2.field2315 = 0;
        return var2;
    }

    @ObfuscatedName("i.i(I)Lgq;")
    public static class188 method17() {
        class188 var0 = method5211();
        var0.field2319 = null;
        var0.field2313 = 0;
        var0.field2321 = new class299(5000);
        return var0;
    }

    @ObfuscatedName("gq.k(B)V")
    public void method3328() {
        if (field2317 < field2312.length) {
            field2312[++field2317 - 1] = this;
        }
    }
}
