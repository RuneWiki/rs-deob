package deob;

@ObfuscatedName("cy")
public final class class70 extends class474 {

    @ObfuscatedName("cy.aw")
    public static class379 field853 = new class379();

    @ObfuscatedName("cy.ay")
    public int field847;

    @ObfuscatedName("cy.ar")
    public int field848;

    @ObfuscatedName("cy.am")
    public int field849;

    @ObfuscatedName("cy.as")
    public int field850;

    @ObfuscatedName("cy.aj")
    public int field860;

    @ObfuscatedName("cy.ag")
    public int field852;

    @ObfuscatedName("cy.az")
    public int field851;

    @ObfuscatedName("cy.av")
    public class49 field856;

    @ObfuscatedName("cy.ap")
    public int field855;

    @ObfuscatedName("cy.aq")
    public int field864;

    @ObfuscatedName("cy.at")
    public int[] field857;

    @ObfuscatedName("cy.ah")
    public int field858;

    @ObfuscatedName("cy.ax")
    public class49 field859;

    @ObfuscatedName("cy.aa")
    public class207 field854;

    @ObfuscatedName("fq.aw(I)V")
    public static void method2896() {
        for (class70 var0 = (class70) field853.method6393(); var0 != null; var0 = (class70) field853.method6374()) {
            if (var0.field856 != null) {
                Statics.field1039.method712(var0.field856);
                var0.field856 = null;
            }
            if (var0.field859 != null) {
                Statics.field1039.method712(var0.field859);
                var0.field859 = null;
            }
        }
        field853.method6379();
    }

    @ObfuscatedName("ao.ay(I)V")
    public static void method270() {
        for (class70 var0 = (class70) field853.method6393(); var0 != null; var0 = (class70) field853.method6374()) {
            if (var0.field854 != null) {
                var0.method1845();
            }
        }
    }

    @ObfuscatedName("cy.ar(I)V")
    public void method1845() {
        int var1 = this.field851;
        class207 var2 = this.field854.method3592();
        if (var2 == null) {
            this.field851 = -1;
            this.field852 = 0;
            this.field855 = 0;
            this.field864 = 0;
            this.field857 = null;
        } else {
            this.field851 = var2.field2179;
            this.field852 = var2.field2180 * 128;
            this.field855 = var2.field2161;
            this.field864 = var2.field2182;
            this.field857 = var2.field2183;
        }
        if (this.field851 != var1 && this.field856 != null) {
            Statics.field1039.method712(this.field856);
            this.field856 = null;
        }
    }

    @ObfuscatedName("cu.am(IIILhb;II)V")
    public static void method1180(int arg0, int arg1, int arg2, class207 arg3, int arg4) {
        class70 var5 = new class70();
        var5.field847 = arg0;
        var5.field848 = arg1 * 128;
        var5.field849 = arg2 * 128;
        int var6 = arg3.field2170;
        int var7 = arg3.field2174;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2174;
            var7 = arg3.field2170;
        }
        var5.field850 = (arg1 + var6) * 128;
        var5.field860 = (arg2 + var7) * 128;
        var5.field851 = arg3.field2179;
        var5.field852 = arg3.field2180 * 128;
        var5.field855 = arg3.field2161;
        var5.field864 = arg3.field2182;
        var5.field857 = arg3.field2183;
        if (arg3.field2176 != null) {
            var5.field854 = arg3;
            var5.method1845();
        }
        field853.method6367(var5);
        if (var5.field857 != null) {
            var5.field858 = var5.field855 + (int) (Math.random() * (double) (var5.field864 - var5.field855));
        }
    }

    @ObfuscatedName("rn.as(IIIIB)V")
    public static void method7601(int arg0, int arg1, int arg2, int arg3) {
        for (class70 var4 = (class70) field853.method6393(); var4 != null; var4 = (class70) field853.method6374()) {
            if (var4.field851 != -1 || var4.field857 != null) {
                int var5 = 0;
                if (arg1 > var4.field850) {
                    var5 += arg1 - var4.field850;
                } else if (arg1 < var4.field848) {
                    var5 += var4.field848 - arg1;
                }
                if (arg2 > var4.field860) {
                    var5 += arg2 - var4.field860;
                } else if (arg2 < var4.field849) {
                    var5 += var4.field849 - arg2;
                }
                if (var5 - 64 > var4.field852 || Statics.field1686.method2370() == 0 || var4.field847 != arg0) {
                    if (var4.field856 != null) {
                        Statics.field1039.method712(var4.field856);
                        var4.field856 = null;
                    }
                    if (var4.field859 != null) {
                        Statics.field1039.method712(var4.field859);
                        var4.field859 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = (var4.field852 - var5) * Statics.field1686.method2370() / var4.field852;
                    if (var4.field856 != null) {
                        var4.field856.method999(var6);
                    } else if (var4.field851 >= 0) {
                        class40 var7 = class40.method746(Statics.field1677, var4.field851, 0);
                        if (var7 != null) {
                            class41 var8 = var7.method742().method753(Statics.field339);
                            class49 var9 = class49.method857(var8, 100, var6);
                            var9.method860(-1);
                            Statics.field1039.method693(var9);
                            var4.field856 = var9;
                        }
                    }
                    if (var4.field859 != null) {
                        var4.field859.method999(var6);
                        if (!var4.field859.method7666()) {
                            var4.field859 = null;
                        }
                    } else if (var4.field857 != null && (var4.field858 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field857.length);
                        class40 var11 = class40.method746(Statics.field1677, var4.field857[var10], 0);
                        if (var11 != null) {
                            class41 var12 = var11.method742().method753(Statics.field339);
                            class49 var13 = class49.method857(var12, 100, var6);
                            var13.method860(0);
                            Statics.field1039.method693(var13);
                            var4.field859 = var13;
                            var4.field858 = var4.field855 + (int) (Math.random() * (double) (var4.field864 - var4.field855));
                        }
                    }
                }
            }
        }
    }
}
