package deob;

@ObfuscatedName("lg")
public class class289 extends class449 {

    @ObfuscatedName("lg.af")
    public class287 field3210;

    @ObfuscatedName("lg.an")
    public int field3211;

    @ObfuscatedName("lg.aw")
    public class488 field3212;

    @ObfuscatedName("lg.ac")
    public int field3213;

    @ObfuscatedName("lg.au")
    public static class289[] field3216 = new class289[300];

    @ObfuscatedName("lg.ab")
    public static int field3214 = 0;

    @ObfuscatedName("hh.af(B)Llg;")
    public static class289 method3526() {
        return field3214 == 0 ? new class289() : field3216[--field3214];
    }

    @ObfuscatedName("mi.an(Llv;Ltp;S)Llg;")
    public static class289 method5974(class287 arg0, class506 arg1) {
        class289 var2 = method3526();
        var2.field3210 = arg0;
        var2.field3211 = arg0.field3196;
        if (var2.field3211 == -1) {
            var2.field3212 = new class488(260);
        } else if (var2.field3211 == -2) {
            var2.field3212 = new class488(10000);
        } else if (var2.field3211 <= 18) {
            var2.field3212 = new class488(20);
        } else if (var2.field3211 <= 98) {
            var2.field3212 = new class488(100);
        } else {
            var2.field3212 = new class488(260);
        }
        var2.field3212.method8190(arg1);
        var2.field3212.method8210(var2.field3210.field3099);
        var2.field3213 = 0;
        return var2;
    }

    @ObfuscatedName("sh.aw(S)Llg;")
    public static class289 method8094() {
        class289 var0 = method3526();
        var0.field3210 = null;
        var0.field3211 = 0;
        var0.field3212 = new class488(5000);
        return var0;
    }

    @ObfuscatedName("lg.ac(I)V")
    public void method5145() {
        if (field3214 < field3216.length) {
            field3216[++field3214 - 1] = this;
        }
    }
}
