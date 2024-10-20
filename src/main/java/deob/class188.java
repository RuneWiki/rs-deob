package deob;

@ObfuscatedName("gn")
public class class188 extends class181 {

    @ObfuscatedName("gn.z")
    public class184 field2317;

    @ObfuscatedName("gn.n")
    public int field2310;

    @ObfuscatedName("gn.v")
    public class299 field2315;

    @ObfuscatedName("gn.u")
    public int field2313;

    @ObfuscatedName("gn.r")
    public static class188[] field2314 = new class188[300];

    @ObfuscatedName("gn.p")
    public static int field2312 = 0;

    @ObfuscatedName("bk.z(Lgy;Llg;I)Lgn;")
    public static class188 method1039(class184 arg0, class328 arg1) {
        class188 var2;
        if (field2312 == 0) {
            var2 = new class188();
        } else {
            var2 = field2314[--field2312];
        }
        var2.field2317 = arg0;
        var2.field2310 = arg0.field2287;
        if (var2.field2310 == -1) {
            var2.field2315 = new class299(260);
        } else if (var2.field2310 == -2) {
            var2.field2315 = new class299(10000);
        } else if (var2.field2310 <= 18) {
            var2.field2315 = new class299(20);
        } else if (var2.field2310 <= 98) {
            var2.field2315 = new class299(100);
        } else {
            var2.field2315 = new class299(260);
        }
        var2.field2315.method4969(arg1);
        var2.field2315.method4941(var2.field2317.field2224);
        var2.field2313 = 0;
        return var2;
    }

    @ObfuscatedName("dl.n(I)Lgn;")
    public static class188 method2584() {
        class188 var0;
        if (field2312 == 0) {
            var0 = new class188();
        } else {
            var0 = field2314[--field2312];
        }
        var0.field2317 = null;
        var0.field2310 = 0;
        var0.field2315 = new class299(5000);
        return var0;
    }

    @ObfuscatedName("gn.v(I)V")
    public void method3274() {
        if (field2312 < field2314.length) {
            field2314[++field2312 - 1] = this;
        }
    }
}
