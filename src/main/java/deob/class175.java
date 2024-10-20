package deob;

@ObfuscatedName("fn")
public class class175 extends class207 {

    @ObfuscatedName("fn.c")
    public class172 field2302;

    @ObfuscatedName("fn.q")
    public int field2301;

    @ObfuscatedName("fn.m")
    public class192 field2308;

    @ObfuscatedName("fn.j")
    public int field2304;

    @ObfuscatedName("fn.g")
    public static class175[] field2305 = new class175[300];

    @ObfuscatedName("fn.i")
    public static int field2306 = 0;

    @ObfuscatedName("bu.c(B)Lfn;")
    public static class175 method971() {
        return field2306 == 0 ? new class175() : field2305[--field2306];
    }

    @ObfuscatedName("bw.q(Lfr;Lge;I)Lfn;")
    public static class175 method948(class172 arg0, class193 arg1) {
        class175 var2 = method971();
        var2.field2302 = arg0;
        var2.field2301 = arg0.field2282;
        if (var2.field2301 == -1) {
            var2.field2308 = new class192(260);
        } else if (var2.field2301 == -2) {
            var2.field2308 = new class192(10000);
        } else if (var2.field2301 <= 18) {
            var2.field2308 = new class192(20);
        } else if (var2.field2301 <= 98) {
            var2.field2308 = new class192(100);
        } else {
            var2.field2308 = new class192(260);
        }
        var2.field2308.method3503(arg1);
        var2.field2308.method3504(var2.field2302.field2240);
        var2.field2304 = 0;
        return var2;
    }

    @ObfuscatedName("fn.m(I)V")
    public void method3146() {
        if (field2306 < field2305.length) {
            field2305[++field2306 - 1] = this;
        }
    }
}
