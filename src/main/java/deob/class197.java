package deob;

@ObfuscatedName("gk")
public class class197 extends class190 {

    @ObfuscatedName("gk.n")
    public class193 field2367;

    @ObfuscatedName("gk.v")
    public int field2365;

    @ObfuscatedName("gk.d")
    public class310 field2372;

    @ObfuscatedName("gk.c")
    public int field2368;

    @ObfuscatedName("gk.y")
    public static class197[] field2369 = new class197[300];

    @ObfuscatedName("gk.h")
    public static int field2370 = 0;

    @ObfuscatedName("al.n(Lgd;Lmw;S)Lgk;")
    public static class197 method434(class193 arg0, class339 arg1) {
        class197 var2;
        if (field2370 == 0) {
            var2 = new class197();
        } else {
            var2 = field2369[--field2370];
        }
        var2.field2367 = arg0;
        var2.field2365 = arg0.field2260;
        if (var2.field2365 == -1) {
            var2.field2372 = new class310(260);
        } else if (var2.field2365 == -2) {
            var2.field2372 = new class310(10000);
        } else if (var2.field2365 <= 18) {
            var2.field2372 = new class310(20);
        } else if (var2.field2365 <= 98) {
            var2.field2372 = new class310(100);
        } else {
            var2.field2372 = new class310(260);
        }
        var2.field2372.method5191(arg1);
        var2.field2372.method5200(var2.field2367.field2333);
        var2.field2368 = 0;
        return var2;
    }

    @ObfuscatedName("gk.v(I)V")
    public void method3508() {
        if (field2370 < field2369.length) {
            field2369[++field2370 - 1] = this;
        }
    }
}
