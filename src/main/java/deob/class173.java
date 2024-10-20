package deob;

@ObfuscatedName("fe")
public class class173 extends class205 {

    @ObfuscatedName("fe.w")
    public class170 field2283;

    @ObfuscatedName("fe.m")
    public int field2279;

    @ObfuscatedName("fe.q")
    public class190 field2280;

    @ObfuscatedName("fe.b")
    public int field2281;

    @ObfuscatedName("fe.f")
    public static class173[] field2282 = new class173[300];

    @ObfuscatedName("fe.n")
    public static int field2278 = 0;

    @ObfuscatedName("eo.w(Lfy;Lgh;B)Lfe;")
    public static class173 method2882(class170 arg0, class191 arg1) {
        class173 var2;
        if (field2278 == 0) {
            var2 = new class173();
        } else {
            var2 = field2282[--field2278];
        }
        var2.field2283 = arg0;
        var2.field2279 = arg0.field2167;
        if (var2.field2279 == -1) {
            var2.field2280 = new class190(260);
        } else if (var2.field2279 == -2) {
            var2.field2280 = new class190(10000);
        } else if (var2.field2279 <= 18) {
            var2.field2280 = new class190(20);
        } else if (var2.field2279 <= 98) {
            var2.field2280 = new class190(100);
        } else {
            var2.field2280 = new class190(260);
        }
        var2.field2280.method3550(arg1);
        var2.field2280.method3570(var2.field2283.field2257);
        var2.field2281 = 0;
        return var2;
    }

    @ObfuscatedName("fk.m(B)Lfe;")
    public static class173 method3152() {
        class173 var0;
        if (field2278 == 0) {
            var0 = new class173();
        } else {
            var0 = field2282[--field2278];
        }
        var0.field2283 = null;
        var0.field2279 = 0;
        var0.field2280 = new class190(5000);
        return var0;
    }

    @ObfuscatedName("fe.q(B)V")
    public void method3173() {
        if (field2278 < field2282.length) {
            field2282[++field2278 - 1] = this;
        }
    }
}
