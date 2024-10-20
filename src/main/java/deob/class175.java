package deob;

@ObfuscatedName("fy")
public class class175 extends class204 {

    @ObfuscatedName("fy.n")
    public class172 field2455;

    @ObfuscatedName("fy.v")
    public int field2449;

    @ObfuscatedName("fy.y")
    public class191 field2451;

    @ObfuscatedName("fy.r")
    public int field2452;

    @ObfuscatedName("fy.h")
    public static class175[] field2453 = new class175[300];

    @ObfuscatedName("fy.d")
    public static int field2454 = 0;

    @ObfuscatedName("ib.n(Lfj;Lgz;B)Lfy;")
    public static class175 method3892(class172 arg0, class192 arg1) {
        class175 var2;
        if (field2454 == 0) {
            var2 = new class175();
        } else {
            var2 = field2453[--field2454];
        }
        var2.field2455 = arg0;
        var2.field2449 = arg0.field2428;
        if (var2.field2449 == -1) {
            var2.field2451 = new class191(260);
        } else if (var2.field2449 == -2) {
            var2.field2451 = new class191(10000);
        } else if (var2.field2449 <= 18) {
            var2.field2451 = new class191(20);
        } else if (var2.field2449 <= 98) {
            var2.field2451 = new class191(100);
        } else {
            var2.field2451 = new class191(260);
        }
        var2.field2451.method3283(arg1);
        var2.field2451.method3307(var2.field2455.field2427);
        var2.field2452 = 0;
        return var2;
    }

    @ObfuscatedName("fy.v(B)V")
    public void method2938() {
        if (field2454 < field2453.length) {
            field2453[++field2454 - 1] = this;
        }
    }
}
