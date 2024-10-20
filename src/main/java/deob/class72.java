package deob;

@ObfuscatedName("ca")
public final class class72 extends class508 {

    @ObfuscatedName("ca.ac")
    public static class410 field859 = new class410();

    @ObfuscatedName("ca.ae")
    public int field853;

    @ObfuscatedName("ca.ag")
    public int field854;

    @ObfuscatedName("ca.am")
    public int field855;

    @ObfuscatedName("ca.ax")
    public int field860;

    @ObfuscatedName("ca.aq")
    public int field864;

    @ObfuscatedName("ca.af")
    public int field858;

    @ObfuscatedName("ca.at")
    public int field865;

    @ObfuscatedName("ca.au")
    public int field857;

    @ObfuscatedName("ca.ar")
    public class49 field852;

    @ObfuscatedName("ca.al")
    public int field862;

    @ObfuscatedName("ca.ad")
    public int field863;

    @ObfuscatedName("ca.ah")
    public int[] field856;

    @ObfuscatedName("ca.ap")
    public int field861;

    @ObfuscatedName("ca.ab")
    public class49 field866;

    @ObfuscatedName("ca.az")
    public class210 field867;

    @ObfuscatedName("ce.ac(I)V")
    public static void method2197() {
        for (class72 var0 = (class72) field859.method7029(); var0 != null; var0 = (class72) field859.method7031()) {
            if (var0.field852 != null) {
                Statics.field199.method706(var0.field852);
                var0.field852 = null;
            }
            if (var0.field866 != null) {
                Statics.field199.method706(var0.field866);
                var0.field866 = null;
            }
        }
        field859.method7023();
    }

    @ObfuscatedName("ca.ae(I)V")
    public void method1946() {
        int var1 = this.field857;
        class210 var2 = this.field867.method3800();
        if (var2 == null) {
            this.field857 = -1;
            this.field858 = 0;
            this.field865 = 0;
            this.field862 = 0;
            this.field863 = 0;
            this.field856 = null;
        } else {
            this.field857 = var2.field2171;
            this.field858 = var2.field2216 * 128;
            this.field865 = var2.field2217 * 128;
            this.field862 = var2.field2218;
            this.field863 = var2.field2219;
            this.field856 = var2.field2220;
        }
        if (this.field857 != var1 && this.field852 != null) {
            Statics.field199.method706(this.field852);
            this.field852 = null;
        }
    }

    @ObfuscatedName("fy.am(IIIII)V")
    public static void method3271(int arg0, int arg1, int arg2, int arg3) {
        for (class72 var4 = (class72) field859.method7029(); var4 != null; var4 = (class72) field859.method7031()) {
            if (var4.field857 != -1 || var4.field856 != null) {
                int var5 = 0;
                if (arg1 > var4.field860) {
                    var5 += arg1 - var4.field860;
                } else if (arg1 < var4.field854) {
                    var5 += var4.field854 - arg1;
                }
                if (arg2 > var4.field864) {
                    var5 += arg2 - var4.field864;
                } else if (arg2 < var4.field855) {
                    var5 += var4.field855 - arg2;
                }
                int var6 = Math.max(var5 - 64, 0);
                if (var6 >= var4.field858 || Statics.field4929.method2677() == 0 || var4.field853 != arg0) {
                    if (var4.field852 != null) {
                        Statics.field199.method706(var4.field852);
                        var4.field852 = null;
                    }
                    if (var4.field866 != null) {
                        Statics.field199.method706(var4.field866);
                        var4.field866 = null;
                    }
                } else {
                    float var7 = var4.field865 < var4.field858 ? Math.min(Math.max((float) (var4.field858 - var6) / (float) (var4.field858 - var4.field865), 0.0F), 1.0F) : 1.0F;
                    int var8 = (int) (var7 * (float) Statics.field4929.method2677());
                    if (var4.field852 != null) {
                        var4.field852.method878(var8);
                    } else if (var4.field857 >= 0) {
                        class40 var9 = class40.method754(Statics.field426, var4.field857, 0);
                        if (var9 != null) {
                            class41 var10 = var9.method752().method762(Statics.field96);
                            class49 var11 = class49.method874(var10, 100, var8);
                            var11.method887(-1);
                            Statics.field199.method705(var11);
                            var4.field852 = var11;
                        }
                    }
                    if (var4.field866 != null) {
                        var4.field866.method878(var8);
                        if (!var4.field866.method8363()) {
                            var4.field866 = null;
                        }
                    } else if (var4.field856 != null && (var4.field861 -= arg3) <= 0) {
                        int var12 = (int) (Math.random() * (double) var4.field856.length);
                        class40 var13 = class40.method754(Statics.field426, var4.field856[var12], 0);
                        if (var13 != null) {
                            class41 var14 = var13.method752().method762(Statics.field96);
                            class49 var15 = class49.method874(var14, 100, var8);
                            var15.method887(0);
                            Statics.field199.method705(var15);
                            var4.field866 = var15;
                            var4.field861 = var4.field862 + (int) (Math.random() * (double) (var4.field863 - var4.field862));
                        }
                    }
                }
            }
        }
    }
}
