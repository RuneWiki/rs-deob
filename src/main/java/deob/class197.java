package deob;

@ObfuscatedName("gv")
public class class197 extends class190 {

    @ObfuscatedName("gv.h")
    public class193 field2363;

    @ObfuscatedName("gv.v")
    public int field2360;

    @ObfuscatedName("gv.x")
    public class310 field2361;

    @ObfuscatedName("gv.w")
    public int field2367;

    @ObfuscatedName("gv.t")
    public static class197[] field2366 = new class197[300];

    @ObfuscatedName("gv.j")
    public static int field2359 = 0;

    @ObfuscatedName("bj.h(Lgb;Lmd;B)Lgv;")
    public static class197 method1128(class193 arg0, class339 arg1) {
        class197 var2;
        if (field2359 == 0) {
            var2 = new class197();
        } else {
            var2 = field2366[--field2359];
        }
        var2.field2363 = arg0;
        var2.field2360 = arg0.field2332;
        if (var2.field2360 == -1) {
            var2.field2361 = new class310(260);
        } else if (var2.field2360 == -2) {
            var2.field2361 = new class310(10000);
        } else if (var2.field2360 <= 18) {
            var2.field2361 = new class310(20);
        } else if (var2.field2360 <= 98) {
            var2.field2361 = new class310(100);
        } else {
            var2.field2361 = new class310(260);
        }
        var2.field2361.method5061(arg1);
        var2.field2361.method5092(var2.field2363.field2301);
        var2.field2367 = 0;
        return var2;
    }

    @ObfuscatedName("gv.x(B)V")
    public void method3385() {
        if (field2359 < field2366.length) {
            field2366[++field2359 - 1] = this;
        }
    }
}
