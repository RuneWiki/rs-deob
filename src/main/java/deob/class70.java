package deob;

@ObfuscatedName("ce")
public final class class70 extends class489 {

    @ObfuscatedName("ce.am")
    public static class394 field840 = new class394();

    @ObfuscatedName("ce.ap")
    public int field832;

    @ObfuscatedName("ce.af")
    public int field833;

    @ObfuscatedName("ce.aj")
    public int field834;

    @ObfuscatedName("ce.aq")
    public int field837;

    @ObfuscatedName("ce.ar")
    public int field836;

    @ObfuscatedName("ce.ag")
    public int field845;

    @ObfuscatedName("ce.ao")
    public int field844;

    @ObfuscatedName("ce.ae")
    public class49 field839;

    @ObfuscatedName("ce.aa")
    public int field835;

    @ObfuscatedName("ce.au")
    public int field841;

    @ObfuscatedName("ce.an")
    public int[] field842;

    @ObfuscatedName("ce.ad")
    public int field843;

    @ObfuscatedName("ce.ax")
    public class49 field838;

    @ObfuscatedName("ce.aw")
    public class202 field831;

    @ObfuscatedName("jg.am(I)V")
    public static void method4589() {
        for (class70 var0 = (class70) field840.method6670(); var0 != null; var0 = (class70) field840.method6665()) {
            if (var0.field839 != null) {
                Statics.field1710.method734(var0.field839);
                var0.field839 = null;
            }
            if (var0.field838 != null) {
                Statics.field1710.method734(var0.field838);
                var0.field838 = null;
            }
        }
        field840.method6664();
    }

    @ObfuscatedName("gl.ap(I)V")
    public static void method3198() {
        for (class70 var0 = (class70) field840.method6670(); var0 != null; var0 = (class70) field840.method6665()) {
            if (var0.field831 != null) {
                var0.method1890();
            }
        }
    }

    @ObfuscatedName("ce.af(I)V")
    public void method1890() {
        int var1 = this.field844;
        class202 var2 = this.field831.method3608();
        if (var2 == null) {
            this.field844 = -1;
            this.field845 = 0;
            this.field835 = 0;
            this.field841 = 0;
            this.field842 = null;
        } else {
            this.field844 = var2.field2139;
            this.field845 = var2.field2105 * 128;
            this.field835 = var2.field2111;
            this.field841 = var2.field2142;
            this.field842 = var2.field2143;
        }
        if (this.field844 != var1 && this.field839 != null) {
            Statics.field1710.method734(this.field839);
            this.field839 = null;
        }
    }

    @ObfuscatedName("ao.aj(IIILhg;II)V")
    public static void method45(int arg0, int arg1, int arg2, class202 arg3, int arg4) {
        class70 var5 = new class70();
        var5.field832 = arg0;
        var5.field833 = arg1 * 128;
        var5.field834 = arg2 * 128;
        int var6 = arg3.field2120;
        int var7 = arg3.field2096;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2096;
            var7 = arg3.field2120;
        }
        var5.field837 = (arg1 + var6) * 128;
        var5.field836 = (arg2 + var7) * 128;
        var5.field844 = arg3.field2139;
        var5.field845 = arg3.field2105 * 128;
        var5.field835 = arg3.field2111;
        var5.field841 = arg3.field2142;
        var5.field842 = arg3.field2143;
        if (arg3.field2097 != null) {
            var5.field831 = arg3;
            var5.method1890();
        }
        field840.method6666(var5);
        if (var5.field842 != null) {
            var5.field843 = var5.field835 + (int) (Math.random() * (double) (var5.field841 - var5.field835));
        }
    }

    @ObfuscatedName("ge.aq(IIIII)V")
    public static void method3352(int arg0, int arg1, int arg2, int arg3) {
        for (class70 var4 = (class70) field840.method6670(); var4 != null; var4 = (class70) field840.method6665()) {
            if (var4.field844 != -1 || var4.field842 != null) {
                int var5 = 0;
                if (arg1 > var4.field837) {
                    var5 += arg1 - var4.field837;
                } else if (arg1 < var4.field833) {
                    var5 += var4.field833 - arg1;
                }
                if (arg2 > var4.field836) {
                    var5 += arg2 - var4.field836;
                } else if (arg2 < var4.field834) {
                    var5 += var4.field834 - arg2;
                }
                if (var5 - 64 > var4.field845 || Statics.field1155.method2450() == 0 || var4.field832 != arg0) {
                    if (var4.field839 != null) {
                        Statics.field1710.method734(var4.field839);
                        var4.field839 = null;
                    }
                    if (var4.field838 != null) {
                        Statics.field1710.method734(var4.field838);
                        var4.field838 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = (var4.field845 - var5) * Statics.field1155.method2450() / var4.field845;
                    if (var4.field839 != null) {
                        var4.field839.method926(var6);
                    } else if (var4.field844 >= 0) {
                        class40 var7 = class40.method769(Statics.field4845, var4.field844, 0);
                        if (var7 != null) {
                            class41 var8 = var7.method770().method782(Statics.field1434);
                            class49 var9 = class49.method892(var8, 100, var6);
                            var9.method931(-1);
                            Statics.field1710.method732(var9);
                            var4.field839 = var9;
                        }
                    }
                    if (var4.field838 != null) {
                        var4.field838.method926(var6);
                        if (!var4.field838.method7989()) {
                            var4.field838 = null;
                        }
                    } else if (var4.field842 != null && (var4.field843 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field842.length);
                        class40 var11 = class40.method769(Statics.field4845, var4.field842[var10], 0);
                        if (var11 != null) {
                            class41 var12 = var11.method770().method782(Statics.field1434);
                            class49 var13 = class49.method892(var12, 100, var6);
                            var13.method931(0);
                            Statics.field1710.method732(var13);
                            var4.field838 = var13;
                            var4.field843 = var4.field835 + (int) (Math.random() * (double) (var4.field841 - var4.field835));
                        }
                    }
                }
            }
        }
    }
}
