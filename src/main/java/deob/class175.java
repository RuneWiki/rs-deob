package deob;

@ObfuscatedName("fv")
public class class175 extends class204 {

    @ObfuscatedName("fv.s")
    public class172 field2439;

    @ObfuscatedName("fv.g")
    public int field2443;

    @ObfuscatedName("fv.m")
    public class191 field2440;

    @ObfuscatedName("fv.h")
    public int field2438;

    @ObfuscatedName("fv.i")
    public static class175[] field2441 = new class175[300];

    @ObfuscatedName("fv.w")
    public static int field2442 = 0;

    @ObfuscatedName("cf.s(Lfm;Lgo;I)Lfv;")
    public static class175 method1891(class172 arg0, class192 arg1) {
        class175 var2;
        if (field2442 == 0) {
            var2 = new class175();
        } else {
            var2 = field2441[--field2442];
        }
        var2.field2439 = arg0;
        var2.field2443 = arg0.field2375;
        if (var2.field2443 == -1) {
            var2.field2440 = new class191(260);
        } else if (var2.field2443 == -2) {
            var2.field2440 = new class191(10000);
        } else if (var2.field2443 <= 18) {
            var2.field2440 = new class191(20);
        } else if (var2.field2443 <= 98) {
            var2.field2440 = new class191(100);
        } else {
            var2.field2440 = new class191(260);
        }
        var2.field2440.method3531(arg1);
        var2.field2440.method3532(var2.field2439.field2416);
        var2.field2438 = 0;
        return var2;
    }

    @ObfuscatedName("fv.g(I)V")
    public void method3144() {
        if (field2442 < field2441.length) {
            field2441[++field2442 - 1] = this;
        }
    }
}
