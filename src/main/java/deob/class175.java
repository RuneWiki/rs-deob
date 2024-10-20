package deob;

@ObfuscatedName("fd")
public class class175 extends class207 {

    @ObfuscatedName("fd.v")
    public class172 field2309;

    @ObfuscatedName("fd.s")
    public int field2306;

    @ObfuscatedName("fd.o")
    public class192 field2311;

    @ObfuscatedName("fd.k")
    public int field2307;

    @ObfuscatedName("fd.u")
    public static class175[] field2308 = new class175[300];

    @ObfuscatedName("fd.i")
    public static int field2304 = 0;

    @ObfuscatedName("by.v(B)Lfd;")
    public static class175 method1471() {
        return field2304 == 0 ? new class175() : field2308[--field2304];
    }

    @ObfuscatedName("l.s(Lfo;Lgu;I)Lfd;")
    public static class175 method107(class172 arg0, class193 arg1) {
        class175 var2 = method1471();
        var2.field2309 = arg0;
        var2.field2306 = arg0.field2225;
        if (var2.field2306 == -1) {
            var2.field2311 = new class192(260);
        } else if (var2.field2306 == -2) {
            var2.field2311 = new class192(10000);
        } else if (var2.field2306 <= 18) {
            var2.field2311 = new class192(20);
        } else if (var2.field2306 <= 98) {
            var2.field2311 = new class192(100);
        } else {
            var2.field2311 = new class192(260);
        }
        var2.field2311.method3540(arg1);
        var2.field2311.method3556(var2.field2309.field2242);
        var2.field2307 = 0;
        return var2;
    }

    @ObfuscatedName("i.o(I)Lfd;")
    public static class175 method69() {
        class175 var0 = method1471();
        var0.field2309 = null;
        var0.field2306 = 0;
        var0.field2311 = new class192(5000);
        return var0;
    }

    @ObfuscatedName("fd.k(I)V")
    public void method3171() {
        if (field2304 < field2308.length) {
            field2308[++field2304 - 1] = this;
        }
    }
}
