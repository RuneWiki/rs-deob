package deob;

@ObfuscatedName("aq")
public final class class32 extends class128 {

    @ObfuscatedName("aq.n")
    public static class129 field698 = new class129();

    @ObfuscatedName("aq.d")
    public int field706;

    @ObfuscatedName("aq.m")
    public int field711;

    @ObfuscatedName("aq.h")
    public int field700;

    @ObfuscatedName("aq.w")
    public int field699;

    @ObfuscatedName("aq.r")
    public class198 field710;

    @ObfuscatedName("aq.c")
    public int field696;

    @ObfuscatedName("aq.p")
    public int field702;

    @ObfuscatedName("aq.g")
    public int field703;

    @ObfuscatedName("aq.z")
    public class67 field704;

    @ObfuscatedName("aq.q")
    public int field705;

    @ObfuscatedName("aq.l")
    public int field714;

    @ObfuscatedName("aq.y")
    public int[] field707;

    @ObfuscatedName("aq.e")
    public int field708;

    @ObfuscatedName("aq.x")
    public class67 field709;

    @ObfuscatedName("cb.n(I)V")
    public static void method1821() {
        for (class32 var0 = (class32) field698.method2290(); var0 != null; var0 = (class32) field698.method2285()) {
            if (var0.field704 != null) {
                Statics.field2008.method883(var0.field704);
                var0.field704 = null;
            }
            if (var0.field709 != null) {
                Statics.field2008.method883(var0.field709);
                var0.field709 = null;
            }
        }
        field698.method2277();
    }

    @ObfuscatedName("eg.d(I)V")
    public static void method2619() {
        for (class32 var0 = (class32) field698.method2290(); var0 != null; var0 = (class32) field698.method2285()) {
            if (var0.field710 != null) {
                var0.method685();
            }
        }
    }

    @ObfuscatedName("aq.m(I)V")
    public void method685() {
        int var1 = this.field703;
        class198 var2 = this.field710.method3415();
        if (var2 == null) {
            this.field703 = -1;
            this.field702 = 0;
            this.field705 = 0;
            this.field714 = 0;
            this.field707 = null;
        } else {
            this.field703 = var2.field2923;
            this.field702 = var2.field2937 * 128;
            this.field705 = var2.field2899;
            this.field714 = var2.field2939;
            this.field707 = var2.field2896;
        }
        if (this.field703 != var1 && this.field704 != null) {
            Statics.field2008.method883(this.field704);
            this.field704 = null;
        }
    }

    @ObfuscatedName("f.h(IIILgh;IB)V")
    public static void method194(int arg0, int arg1, int arg2, class198 arg3, int arg4) {
        class32 var5 = new class32();
        var5.field706 = arg0;
        var5.field711 = arg1 * 128;
        var5.field700 = arg2 * 128;
        int var6 = arg3.field2904;
        int var7 = arg3.field2908;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2908;
            var7 = arg3.field2904;
        }
        var5.field699 = (arg1 + var6) * 128;
        var5.field696 = (arg2 + var7) * 128;
        var5.field703 = arg3.field2923;
        var5.field702 = arg3.field2937 * 128;
        var5.field705 = arg3.field2899;
        var5.field714 = arg3.field2939;
        var5.field707 = arg3.field2896;
        if (arg3.field2918 != null) {
            var5.field710 = arg3;
            var5.method685();
        }
        field698.method2278(var5);
        if (var5.field707 != null) {
            var5.field708 = var5.field705 + (int) (Math.random() * (double) (var5.field714 - var5.field705));
        }
    }
}
