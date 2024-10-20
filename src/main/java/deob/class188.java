package deob;

@ObfuscatedName("gb")
public class class188 extends class181 {

    @ObfuscatedName("gb.q")
    public class184 field2339;

    @ObfuscatedName("gb.w")
    public int field2333;

    @ObfuscatedName("gb.e")
    public class300 field2334;

    @ObfuscatedName("gb.p")
    public int field2332;

    @ObfuscatedName("gb.k")
    public static class188[] field2336 = new class188[300];

    @ObfuscatedName("gb.l")
    public static int field2337 = 0;

    @ObfuscatedName("iu.q(Lgx;Llv;I)Lgb;")
    public static class188 method3894(class184 arg0, class329 arg1) {
        class188 var2;
        if (field2337 == 0) {
            var2 = new class188();
        } else {
            var2 = field2336[--field2337];
        }
        var2.field2339 = arg0;
        var2.field2333 = arg0.field2276;
        if (var2.field2333 == -1) {
            var2.field2334 = new class300(260);
        } else if (var2.field2333 == -2) {
            var2.field2334 = new class300(10000);
        } else if (var2.field2333 <= 18) {
            var2.field2334 = new class300(20);
        } else if (var2.field2333 <= 98) {
            var2.field2334 = new class300(100);
        } else {
            var2.field2334 = new class300(260);
        }
        var2.field2334.method5015(arg1);
        var2.field2334.method5046(var2.field2339.field2298);
        var2.field2332 = 0;
        return var2;
    }

    @ObfuscatedName("gb.w(B)V")
    public void method3299() {
        if (field2337 < field2336.length) {
            field2336[++field2337 - 1] = this;
        }
    }
}
