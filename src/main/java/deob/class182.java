package deob;

@ObfuscatedName("fz")
public class class182 extends class188 {

    @ObfuscatedName("fz.f")
    public class178 field2305;

    @ObfuscatedName("fz.i")
    public int field2306;

    @ObfuscatedName("fz.y")
    public class299 field2303;

    @ObfuscatedName("fz.w")
    public int field2307;

    @ObfuscatedName("fz.p")
    public static class182[] field2304 = new class182[300];

    @ObfuscatedName("fz.b")
    public static int field2308 = 0;

    @ObfuscatedName("y.f(Lfh;Llr;I)Lfz;")
    public static class182 method19(class178 arg0, class328 arg1) {
        class182 var2;
        if (field2308 == 0) {
            var2 = new class182();
        } else {
            var2 = field2304[--field2308];
        }
        var2.field2305 = arg0;
        var2.field2306 = arg0.field2278;
        if (var2.field2306 == -1) {
            var2.field2303 = new class299(260);
        } else if (var2.field2306 == -2) {
            var2.field2303 = new class299(10000);
        } else if (var2.field2306 <= 18) {
            var2.field2303 = new class299(20);
        } else if (var2.field2306 <= 98) {
            var2.field2303 = new class299(100);
        } else {
            var2.field2303 = new class299(260);
        }
        var2.field2303.method5083(arg1);
        var2.field2303.method5057(var2.field2305.field2277);
        var2.field2307 = 0;
        return var2;
    }

    @ObfuscatedName("fz.i(I)V")
    public void method3279() {
        if (field2308 < field2304.length) {
            field2304[++field2308 - 1] = this;
        }
    }
}
