package deob;

@ObfuscatedName("gk")
public class class188 extends class181 {

    @ObfuscatedName("gk.a")
    public class184 field2307;

    @ObfuscatedName("gk.t")
    public int field2311;

    @ObfuscatedName("gk.n")
    public class299 field2308;

    @ObfuscatedName("gk.q")
    public int field2309;

    @ObfuscatedName("gk.v")
    public static class188[] field2306 = new class188[300];

    @ObfuscatedName("gk.l")
    public static int field2310 = 0;

    @ObfuscatedName("dl.a(Lgx;Llm;I)Lgk;")
    public static class188 method2402(class184 arg0, class328 arg1) {
        class188 var2;
        if (field2310 == 0) {
            var2 = new class188();
        } else {
            var2 = field2306[--field2310];
        }
        var2.field2307 = arg0;
        var2.field2311 = arg0.field2282;
        if (var2.field2311 == -1) {
            var2.field2308 = new class299(260);
        } else if (var2.field2311 == -2) {
            var2.field2308 = new class299(10000);
        } else if (var2.field2311 <= 18) {
            var2.field2308 = new class299(20);
        } else if (var2.field2311 <= 98) {
            var2.field2308 = new class299(100);
        } else {
            var2.field2308 = new class299(260);
        }
        var2.field2308.method5103(arg1);
        var2.field2308.method5068(var2.field2307.field2213);
        var2.field2309 = 0;
        return var2;
    }

    @ObfuscatedName("gk.t(B)V")
    public void method3417() {
        if (field2310 < field2306.length) {
            field2306[++field2310 - 1] = this;
        }
    }
}
