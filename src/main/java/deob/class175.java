package deob;

@ObfuscatedName("fi")
public class class175 extends class207 {

    @ObfuscatedName("fi.y")
    public class172 field2303;

    @ObfuscatedName("fi.c")
    public int field2297;

    @ObfuscatedName("fi.n")
    public class192 field2299;

    @ObfuscatedName("fi.u")
    public int field2298;

    @ObfuscatedName("fi.i")
    public static class175[] field2301 = new class175[300];

    @ObfuscatedName("fi.r")
    public static int field2302 = 0;

    @ObfuscatedName("ff.y(Lfp;Lgl;B)Lfi;")
    public static class175 method3207(class172 arg0, class193 arg1) {
        class175 var2;
        if (field2302 == 0) {
            var2 = new class175();
        } else {
            var2 = field2301[--field2302];
        }
        var2.field2303 = arg0;
        var2.field2297 = arg0.field2201;
        if (var2.field2297 == -1) {
            var2.field2299 = new class192(260);
        } else if (var2.field2297 == -2) {
            var2.field2299 = new class192(10000);
        } else if (var2.field2297 <= 18) {
            var2.field2299 = new class192(20);
        } else if (var2.field2297 <= 98) {
            var2.field2299 = new class192(100);
        } else {
            var2.field2299 = new class192(260);
        }
        var2.field2299.method3540(arg1);
        var2.field2299.method3537(var2.field2303.field2276);
        var2.field2298 = 0;
        return var2;
    }

    @ObfuscatedName("hj.c(B)Lfi;")
    public static class175 method3873() {
        class175 var0;
        if (field2302 == 0) {
            var0 = new class175();
        } else {
            var0 = field2301[--field2302];
        }
        var0.field2303 = null;
        var0.field2297 = 0;
        var0.field2299 = new class192(5000);
        return var0;
    }

    @ObfuscatedName("fi.n(S)V")
    public void method3174() {
        if (field2302 < field2301.length) {
            field2301[++field2302 - 1] = this;
        }
    }
}
