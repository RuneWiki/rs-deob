package deob;

@ObfuscatedName("ca")
public final class class70 extends class473 {

    @ObfuscatedName("ca.au")
    public static class378 field859 = new class378();

    @ObfuscatedName("ca.ae")
    public int field857;

    @ObfuscatedName("ca.ao")
    public int field858;

    @ObfuscatedName("ca.at")
    public int field872;

    @ObfuscatedName("ca.ac")
    public int field860;

    @ObfuscatedName("ca.ai")
    public int field861;

    @ObfuscatedName("ca.az")
    public int field862;

    @ObfuscatedName("ca.ap")
    public int field863;

    @ObfuscatedName("ca.aa")
    public class49 field869;

    @ObfuscatedName("ca.af")
    public int field868;

    @ObfuscatedName("ca.ad")
    public int field866;

    @ObfuscatedName("ca.aq")
    public int[] field867;

    @ObfuscatedName("ca.al")
    public int field876;

    @ObfuscatedName("ca.an")
    public class49 field864;

    @ObfuscatedName("ca.ar")
    public class206 field870;

    @ObfuscatedName("oo.au(B)V")
    public static void method6634() {
        for (class70 var0 = (class70) field859.method6393(); var0 != null; var0 = (class70) field859.method6395()) {
            if (var0.field869 != null) {
                Statics.field1794.method707(var0.field869);
                var0.field869 = null;
            }
            if (var0.field864 != null) {
                Statics.field1794.method707(var0.field864);
                var0.field864 = null;
            }
        }
        field859.method6387();
    }

    @ObfuscatedName("ca.ae(I)V")
    public void method1835() {
        int var1 = this.field863;
        class206 var2 = this.field870.method3610();
        if (var2 == null) {
            this.field863 = -1;
            this.field862 = 0;
            this.field868 = 0;
            this.field866 = 0;
            this.field867 = null;
        } else {
            this.field863 = var2.field2215;
            this.field862 = var2.field2216 * 128;
            this.field868 = var2.field2217;
            this.field866 = var2.field2218;
            this.field867 = var2.field2209;
        }
        if (this.field863 != var1 && this.field869 != null) {
            Statics.field1794.method707(this.field869);
            this.field869 = null;
        }
    }

    @ObfuscatedName("fy.ao(IIILhv;II)V")
    public static void method2982(int arg0, int arg1, int arg2, class206 arg3, int arg4) {
        class70 var5 = new class70();
        var5.field857 = arg0;
        var5.field858 = arg1 * 128;
        var5.field872 = arg2 * 128;
        int var6 = arg3.field2186;
        int var7 = arg3.field2171;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2171;
            var7 = arg3.field2186;
        }
        var5.field860 = (arg1 + var6) * 128;
        var5.field861 = (arg2 + var7) * 128;
        var5.field863 = arg3.field2215;
        var5.field862 = arg3.field2216 * 128;
        var5.field868 = arg3.field2217;
        var5.field866 = arg3.field2218;
        var5.field867 = arg3.field2209;
        if (arg3.field2212 != null) {
            var5.field870 = arg3;
            var5.method1835();
        }
        field859.method6405(var5);
        if (var5.field867 != null) {
            var5.field876 = var5.field868 + (int) (Math.random() * (double) (var5.field866 - var5.field868));
        }
    }

    @ObfuscatedName("ft.at(IIIIB)V")
    public static void method2900(int arg0, int arg1, int arg2, int arg3) {
        for (class70 var4 = (class70) field859.method6393(); var4 != null; var4 = (class70) field859.method6395()) {
            if (var4.field863 != -1 || var4.field867 != null) {
                int var5 = 0;
                if (arg1 > var4.field860) {
                    var5 += arg1 - var4.field860;
                } else if (arg1 < var4.field858) {
                    var5 += var4.field858 - arg1;
                }
                if (arg2 > var4.field861) {
                    var5 += arg2 - var4.field861;
                } else if (arg2 < var4.field872) {
                    var5 += var4.field872 - arg2;
                }
                if (var5 - 64 > var4.field862 || Statics.field4737.method2449() == 0 || var4.field857 != arg0) {
                    if (var4.field869 != null) {
                        Statics.field1794.method707(var4.field869);
                        var4.field869 = null;
                    }
                    if (var4.field864 != null) {
                        Statics.field1794.method707(var4.field864);
                        var4.field864 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = (var4.field862 - var5) * Statics.field4737.method2449() / var4.field862;
                    if (var4.field869 != null) {
                        var4.field869.method881(var6);
                    } else if (var4.field863 >= 0) {
                        class40 var7 = class40.method751(Statics.field162, var4.field863, 0);
                        if (var7 != null) {
                            class41 var8 = var7.method749().method770(Statics.field3625);
                            class49 var9 = class49.method952(var8, 100, var6);
                            var9.method880(-1);
                            Statics.field1794.method734(var9);
                            var4.field869 = var9;
                        }
                    }
                    if (var4.field864 != null) {
                        var4.field864.method881(var6);
                        if (!var4.field864.method7704()) {
                            var4.field864 = null;
                        }
                    } else if (var4.field867 != null && (var4.field876 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field867.length);
                        class40 var11 = class40.method751(Statics.field162, var4.field867[var10], 0);
                        if (var11 != null) {
                            class41 var12 = var11.method749().method770(Statics.field3625);
                            class49 var13 = class49.method952(var12, 100, var6);
                            var13.method880(0);
                            Statics.field1794.method734(var13);
                            var4.field864 = var13;
                            var4.field876 = var4.field868 + (int) (Math.random() * (double) (var4.field866 - var4.field868));
                        }
                    }
                }
            }
        }
    }
}
