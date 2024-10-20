package deob;

@ObfuscatedName("fv")
public class class175 extends class207 {

    @ObfuscatedName("fv.f")
    public class172 field2318;

    @ObfuscatedName("fv.h")
    public int field2315;

    @ObfuscatedName("fv.e")
    public class192 field2323;

    @ObfuscatedName("fv.b")
    public int field2317;

    @ObfuscatedName("fv.l")
    public static class175[] field2322 = new class175[300];

    @ObfuscatedName("fv.w")
    public static int field2319 = 0;

    @ObfuscatedName("gs.f(Lfs;Lgo;I)Lfv;")
    public static class175 method3561(class172 arg0, class193 arg1) {
        class175 var2;
        if (field2319 == 0) {
            var2 = new class175();
        } else {
            var2 = field2322[--field2319];
        }
        var2.field2318 = arg0;
        var2.field2315 = arg0.field2289;
        if (var2.field2315 == -1) {
            var2.field2323 = new class192(260);
        } else if (var2.field2315 == -2) {
            var2.field2323 = new class192(10000);
        } else if (var2.field2315 <= 18) {
            var2.field2323 = new class192(20);
        } else if (var2.field2315 <= 98) {
            var2.field2323 = new class192(100);
        } else {
            var2.field2323 = new class192(260);
        }
        var2.field2323.method3583(arg1);
        var2.field2323.method3584(var2.field2318.field2190);
        var2.field2317 = 0;
        return var2;
    }

    @ObfuscatedName("fv.h(I)V")
    public void method3228() {
        if (field2319 < field2322.length) {
            field2322[++field2319 - 1] = this;
        }
    }
}
