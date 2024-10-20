package deob;

@ObfuscatedName("gj")
public class class188 extends class181 {

    @ObfuscatedName("gj.c")
    public class184 field2314;

    @ObfuscatedName("gj.x")
    public int field2309;

    @ObfuscatedName("gj.t")
    public class299 field2313;

    @ObfuscatedName("gj.g")
    public int field2312;

    @ObfuscatedName("gj.l")
    public static class188[] field2310 = new class188[300];

    @ObfuscatedName("gj.u")
    public static int field2311 = 0;

    @ObfuscatedName("cv.x(Lgw;Lld;I)Lgj;")
    public static class188 method1894(class184 arg0, class328 arg1) {
        class188 var2 = Statics.method3794();
        var2.field2314 = arg0;
        var2.field2309 = arg0.field2198;
        if (var2.field2309 == -1) {
            var2.field2313 = new class299(260);
        } else if (var2.field2309 == -2) {
            var2.field2313 = new class299(10000);
        } else if (var2.field2309 <= 18) {
            var2.field2313 = new class299(20);
        } else if (var2.field2309 <= 98) {
            var2.field2313 = new class299(100);
        } else {
            var2.field2313 = new class299(260);
        }
        var2.field2313.method5052(arg1);
        var2.field2313.method5053(var2.field2314.field2286);
        var2.field2312 = 0;
        return var2;
    }

    @ObfuscatedName("gj.t(B)V")
    public void method3353() {
        if (field2311 < field2310.length) {
            field2310[++field2311 - 1] = this;
        }
    }
}
