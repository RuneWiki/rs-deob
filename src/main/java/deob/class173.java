package deob;

@ObfuscatedName("fn")
public class class173 extends class205 {

    @ObfuscatedName("fn.z")
    public class170 field2255;

    @ObfuscatedName("fn.w")
    public int field2254;

    @ObfuscatedName("fn.s")
    public class190 field2258;

    @ObfuscatedName("fn.l")
    public int field2256;

    @ObfuscatedName("fn.u")
    public static class173[] field2257 = new class173[300];

    @ObfuscatedName("fn.q")
    public static int field2259 = 0;

    @ObfuscatedName("bl.w(I)Lfn;")
    public static class173 method1432() {
        class173 var0;
        if (field2259 == 0) {
            var0 = new class173();
        } else {
            var0 = field2257[--field2259];
        }
        var0.field2255 = null;
        var0.field2254 = 0;
        var0.field2258 = new class190(5000);
        return var0;
    }

    @ObfuscatedName("fn.s(I)V")
    public void method3163() {
        if (field2259 < field2257.length) {
            field2257[++field2259 - 1] = this;
        }
    }
}
