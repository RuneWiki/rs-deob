package deob;

@ObfuscatedName("gg")
public class class192 extends class186 {

    @ObfuscatedName("gg.m")
    public class189 field2358;

    @ObfuscatedName("gg.f")
    public int field2355;

    @ObfuscatedName("gg.q")
    public class209 field2356;

    @ObfuscatedName("gg.w")
    public int field2357;

    @ObfuscatedName("gg.o")
    public static class192[] field2361 = new class192[300];

    @ObfuscatedName("gg.u")
    public static int field2359 = 0;

    @ObfuscatedName("bv.m(Lgs;Lhn;I)Lgg;")
    public static class192 method1750(class189 arg0, class210 arg1) {
        class192 var2;
        if (field2359 == 0) {
            var2 = new class192();
        } else {
            var2 = field2361[--field2359];
        }
        var2.field2358 = arg0;
        var2.field2355 = arg0.field2331;
        if (var2.field2355 == -1) {
            var2.field2356 = new class209(260);
        } else if (var2.field2355 == -2) {
            var2.field2356 = new class209(10000);
        } else if (var2.field2355 <= 18) {
            var2.field2356 = new class209(20);
        } else if (var2.field2355 <= 98) {
            var2.field2356 = new class209(100);
        } else {
            var2.field2356 = new class209(260);
        }
        var2.field2356.method3684(arg1);
        var2.field2356.method3685(var2.field2358.field2330);
        var2.field2357 = 0;
        return var2;
    }

    @ObfuscatedName("gg.f(I)V")
    public void method3323() {
        if (field2359 < field2361.length) {
            field2361[++field2359 - 1] = this;
        }
    }
}
