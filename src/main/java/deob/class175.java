package deob;

@ObfuscatedName("fm")
public class class175 extends class207 {

    @ObfuscatedName("fm.g")
    public class172 field2332;

    @ObfuscatedName("fm.r")
    public int field2331;

    @ObfuscatedName("fm.e")
    public class192 field2333;

    @ObfuscatedName("fm.q")
    public int field2334;

    @ObfuscatedName("fm.c")
    public static class175[] field2335 = new class175[300];

    @ObfuscatedName("fm.l")
    public static int field2336 = 0;

    @ObfuscatedName("fq.g(I)Lfm;")
    public static class175 method3351() {
        return field2336 == 0 ? new class175() : field2335[--field2336];
    }

    @ObfuscatedName("ei.r(Lfq;Lgt;B)Lfm;")
    public static class175 method3035(class172 arg0, class193 arg1) {
        class175 var2 = method3351();
        var2.field2332 = arg0;
        var2.field2331 = arg0.field2281;
        if (var2.field2331 == -1) {
            var2.field2333 = new class192(260);
        } else if (var2.field2331 == -2) {
            var2.field2333 = new class192(10000);
        } else if (var2.field2331 <= 18) {
            var2.field2333 = new class192(20);
        } else if (var2.field2331 <= 98) {
            var2.field2333 = new class192(100);
        } else {
            var2.field2333 = new class192(260);
        }
        var2.field2333.method3727(arg1);
        var2.field2333.method3728(var2.field2332.field2308);
        var2.field2334 = 0;
        return var2;
    }

    @ObfuscatedName("eh.e(I)Lfm;")
    public static class175 method3145() {
        class175 var0 = method3351();
        var0.field2332 = null;
        var0.field2331 = 0;
        var0.field2333 = new class192(5000);
        return var0;
    }

    @ObfuscatedName("fm.q(S)V")
    public void method3364() {
        if (field2336 < field2335.length) {
            field2335[++field2336 - 1] = this;
        }
    }
}
