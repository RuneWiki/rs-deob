package deob;

import java.net.URL;

@ObfuscatedName("cr")
public class class68 {

    @ObfuscatedName("cr.au")
    public static int field798 = 0;

    @ObfuscatedName("cr.aa")
    public static int field804 = 0;

    @ObfuscatedName("cr.ac")
    public static int[] field800 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cr.al")
    public static int[] field801 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cr.ap")
    public int field802;

    @ObfuscatedName("cr.av")
    public int field810;

    @ObfuscatedName("cr.ax")
    public int field807;

    @ObfuscatedName("cr.as")
    public String field805;

    @ObfuscatedName("cr.ay")
    public String field806;

    @ObfuscatedName("cr.ak")
    public int field803;

    @ObfuscatedName("cr.aj")
    public int field808;

    @ObfuscatedName("cr.am")
    public String field809;

    @ObfuscatedName("jr.at(I)Z")
    public static boolean method4422() {
        try {
            if (Statics.field5254 == null) {
                Statics.field5254 = Statics.field423.method2741(new URL(Statics.field2416));
            } else if (Statics.field5254.method2770()) {
                byte[] var0 = Statics.field5254.method2774();
                class527 var1 = new class527(var0);
                var1.method8416();
                field798 = var1.method8412();
                Statics.field3921 = new class68[field798];
                int var2 = 0;
                while (var2 < field798) {
                    class68 var3 = Statics.field3921[var2] = new class68();
                    var3.field802 = var1.method8412();
                    var3.field810 = var1.method8416();
                    var3.field805 = var1.method8535();
                    var3.field806 = var1.method8535();
                    var3.field803 = var1.method8410();
                    var3.field807 = var1.method8508();
                    var3.field808 = var2++;
                }
                method3352(Statics.field3921, 0, Statics.field3921.length - 1, field801, field800);
                Statics.field5254 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field5254 = null;
        }
        return false;
    }

    @ObfuscatedName("gk.ah(III)V")
    public static void method3289(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field801[var5] != arg0) {
                var2[var4] = field801[var5];
                var3[var4] = field800[var5];
                var4++;
            }
        }
        field801 = var2;
        field800 = var3;
        method3352(Statics.field3921, 0, Statics.field3921.length - 1, field801, field800);
    }

    @ObfuscatedName("gd.ar([Lcr;II[I[II)V")
    public static void method3352(class68[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class68 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field808;
                        var12 = var8.field808;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field807;
                        var12 = var8.field807;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1745() ? 1 : 0;
                        var12 = var8.method1745() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field802;
                        var12 = var8.field802;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field808;
                        var16 = var8.field808;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field807;
                        var16 = var8.field807;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1745() ? 1 : 0;
                        var16 = var8.method1745() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field802;
                        var16 = var8.field802;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class68 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method3352(arg0, arg1, var6, arg3, arg4);
        method3352(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ef.ao(IZIZI)V")
    public static void method2716(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field3921 != null) {
            method2935(0, Statics.field3921.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ep.ab(IIIZIZI)V")
    public static void method2935(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class68 var8 = Statics.field3921[var6];
        Statics.field3921[var6] = Statics.field3921[arg1];
        Statics.field3921[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class68 var10 = Statics.field3921[var9];
            int var11 = method2260(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method2260(var10, var8, arg4, arg5);
                    if (arg5) {
                        var12 = -var13;
                    } else {
                        var12 = var13;
                    }
                }
            } else if (arg3) {
                var12 = -var11;
            } else {
                var12 = var11;
            }
            if (var12 <= 0) {
                class68 var14 = Statics.field3921[var9];
                Statics.field3921[var9] = Statics.field3921[var7];
                Statics.field3921[var7++] = var14;
            }
        }
        Statics.field3921[arg1] = Statics.field3921[var7];
        Statics.field3921[var7] = var8;
        method2935(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method2935(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("dm.au(Lcr;Lcr;IZI)I")
    public static int method2260(class68 arg0, class68 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field807;
            int var5 = arg1.field807;
            if (!arg3) {
                if (var4 == -1) {
                    var4 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var4 - var5;
        } else if (arg2 == 2) {
            return arg0.field803 - arg1.field803;
        } else if (arg2 == 3) {
            if (arg0.field806.equals("-")) {
                if (arg1.field806.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field806.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field806.compareTo(arg1.field806);
            }
        } else if (arg2 == 4) {
            return arg0.method1790() ? (arg1.method1790() ? 0 : 1) : (arg1.method1790() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1747() ? (arg1.method1747() ? 0 : 1) : (arg1.method1747() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1748() ? (arg1.method1748() ? 0 : 1) : (arg1.method1748() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1745() ? (arg1.method1745() ? 0 : 1) : (arg1.method1745() ? -1 : 0);
        } else {
            return arg0.field802 - arg1.field802;
        }
    }

    @ObfuscatedName("of.aa(I)Lcr;")
    public static class68 method6519() {
        field804 = 0;
        return method4105();
    }

    @ObfuscatedName("ii.ac(I)Lcr;")
    public static class68 method4105() {
        return field804 < field798 ? Statics.field3921[++field804 - 1] : null;
    }

    @ObfuscatedName("cr.al(B)Z")
    public boolean method1745() {
        return (class523.field5097.method41() & this.field810) != 0;
    }

    @ObfuscatedName("cr.az(B)Z")
    public boolean method1746() {
        return (class523.field5110.method41() & this.field810) != 0;
    }

    @ObfuscatedName("cr.ap(B)Z")
    public boolean method1747() {
        return (class523.field5115.method41() & this.field810) != 0;
    }

    @ObfuscatedName("cr.av(I)Z")
    public boolean method1748() {
        return (class523.field5096.method41() & this.field810) != 0;
    }

    @ObfuscatedName("cr.ax(I)Z")
    public boolean method1790() {
        return (class523.field5109.method41() & this.field810) != 0;
    }

    @ObfuscatedName("cr.as(S)Z")
    public boolean method1750() {
        return (class523.field5123.method41() & this.field810) != 0;
    }

    @ObfuscatedName("cr.ay(I)Z")
    public boolean method1785() {
        return (class523.field5112.method41() & this.field810) != 0;
    }

    @ObfuscatedName("cr.ak(I)Z")
    public boolean method1752() {
        return (class523.field5124.method41() & this.field810) != 0;
    }

    @ObfuscatedName("cr.aj(B)Z")
    public boolean method1753() {
        return (class523.field5095.method41() & this.field810) != 0;
    }

    @ObfuscatedName("cr.am(B)Z")
    public boolean method1763() {
        return (class523.field5121.method41() & this.field810) != 0;
    }
}
