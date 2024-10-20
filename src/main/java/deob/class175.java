package deob;

@ObfuscatedName("fl")
public class class175 extends class207 {

    @ObfuscatedName("fl.f")
    public class172 field2341;

    @ObfuscatedName("fl.l")
    public int field2334;

    @ObfuscatedName("fl.w")
    public class192 field2335;

    @ObfuscatedName("fl.s")
    public int field2337;

    @ObfuscatedName("fl.e")
    public static class175[] field2338 = new class175[300];

    @ObfuscatedName("fl.a")
    public static int field2339 = 0;

    @ObfuscatedName("ad.f(I)Lfl;")
    public static class175 method616() {
        return field2339 == 0 ? new class175() : field2338[--field2339];
    }

    @ObfuscatedName("r.l(Lfg;Lgy;B)Lfl;")
    public static class175 method85(class172 arg0, class193 arg1) {
        class175 var2 = method616();
        var2.field2341 = arg0;
        var2.field2334 = arg0.field2309;
        if (var2.field2334 == -1) {
            var2.field2335 = new class192(260);
        } else if (var2.field2334 == -2) {
            var2.field2335 = new class192(10000);
        } else if (var2.field2334 <= 18) {
            var2.field2335 = new class192(20);
        } else if (var2.field2334 <= 98) {
            var2.field2335 = new class192(100);
        } else {
            var2.field2335 = new class192(260);
        }
        var2.field2335.method3596(arg1);
        var2.field2335.method3594(var2.field2341.field2306);
        var2.field2337 = 0;
        return var2;
    }

    @ObfuscatedName("ag.w(I)Lfl;")
    public static class175 method446() {
        class175 var0 = method616();
        var0.field2341 = null;
        var0.field2334 = 0;
        var0.field2335 = new class192(5000);
        return var0;
    }

    @ObfuscatedName("fl.s(I)V")
    public void method3245() {
        if (field2339 < field2338.length) {
            field2338[++field2339 - 1] = this;
        }
    }
}
