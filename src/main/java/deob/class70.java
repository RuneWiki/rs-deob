package deob;

import java.net.URL;

@ObfuscatedName("cf")
public class class70 {

    @ObfuscatedName("cf.ao")
    public static int field818 = 0;

    @ObfuscatedName("cf.am")
    public static int field808 = 0;

    @ObfuscatedName("cf.ac")
    public static int[] field809 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cf.ae")
    public static int[] field810 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cf.aq")
    public int field817;

    @ObfuscatedName("cf.al")
    public int field813;

    @ObfuscatedName("cf.aj")
    public int field812;

    @ObfuscatedName("cf.as")
    public String field814;

    @ObfuscatedName("cf.aw")
    public String field805;

    @ObfuscatedName("cf.af")
    public int field816;

    @ObfuscatedName("cf.aa")
    public int field807;

    @ObfuscatedName("cf.ah")
    public String field811;

    @ObfuscatedName("is.ab(I)Z")
    public static boolean method4329() {
        try {
            if (Statics.field294 == null) {
                Statics.field294 = Statics.field96.method2856(new URL(Statics.field2361));
            } else if (Statics.field294.method2885()) {
                byte[] var0 = Statics.field294.method2886();
                class549 var1 = new class549(var0);
                var1.method8803();
                field818 = var1.method8968();
                Statics.field3255 = new class70[field818];
                int var2 = 0;
                while (var2 < field818) {
                    class70 var3 = Statics.field3255[var2] = new class70();
                    var3.field817 = var1.method8968();
                    var3.field813 = var1.method8803();
                    var3.field814 = var1.method8808();
                    var3.field805 = var1.method8808();
                    var3.field816 = var1.method9025();
                    var3.field812 = var1.method8919();
                    var3.field807 = var2++;
                }
                method6767(Statics.field3255, 0, Statics.field3255.length - 1, field810, field809);
                Statics.field294 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field294 = null;
        }
        return false;
    }

    @ObfuscatedName("ly.ay(IIB)V")
    public static void method5466(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field810[var5] != arg0) {
                var2[var4] = field810[var5];
                var3[var4] = field809[var5];
                var4++;
            }
        }
        field810 = var2;
        field809 = var3;
        method6767(Statics.field3255, 0, Statics.field3255.length - 1, field810, field809);
    }

    @ObfuscatedName("or.an([Lcf;II[I[II)V")
    public static void method6767(class70[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class70 var8 = arg0[var7];
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
                        var11 = arg0[var6].field807;
                        var12 = var8.field807;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field812;
                        var12 = var8.field812;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1797() ? 1 : 0;
                        var12 = var8.method1797() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field817;
                        var12 = var8.field817;
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
                        var15 = arg0[var5].field807;
                        var16 = var8.field807;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field812;
                        var16 = var8.field812;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1797() ? 1 : 0;
                        var16 = var8.method1797() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field817;
                        var16 = var8.field817;
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
                class70 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method6767(arg0, arg1, var6, arg3, arg4);
        method6767(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ja.au(IZIZI)V")
    public static void method4401(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field3255 != null) {
            method4345(0, Statics.field3255.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("iw.ax(IIIZIZI)V")
    public static void method4345(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class70 var8 = Statics.field3255[var6];
        Statics.field3255[var6] = Statics.field3255[arg1];
        Statics.field3255[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            class70 var10 = Statics.field3255[var9];
            int var11 = method3289(var10, var8, arg2, arg3);
            int var12;
            if (var11 == 0) {
                if (arg4 == -1) {
                    var12 = 0;
                } else {
                    int var13 = method3289(var10, var8, arg4, arg5);
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
                class70 var14 = Statics.field3255[var9];
                Statics.field3255[var9] = Statics.field3255[var7];
                Statics.field3255[var7++] = var14;
            }
        }
        Statics.field3255[arg1] = Statics.field3255[var7];
        Statics.field3255[var7] = var8;
        method4345(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method4345(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("gn.ao(Lcf;Lcf;IZI)I")
    public static int method3289(class70 arg0, class70 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field812;
            int var5 = arg1.field812;
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
            return arg0.field816 - arg1.field816;
        } else if (arg2 == 3) {
            if (arg0.field805.equals("-")) {
                if (arg1.field805.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field805.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field805.compareTo(arg1.field805);
            }
        } else if (arg2 == 4) {
            return arg0.method1821() ? (arg1.method1821() ? 0 : 1) : (arg1.method1821() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1799() ? (arg1.method1799() ? 0 : 1) : (arg1.method1799() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1800() ? (arg1.method1800() ? 0 : 1) : (arg1.method1800() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1797() ? (arg1.method1797() ? 0 : 1) : (arg1.method1797() ? -1 : 0);
        } else {
            return arg0.field817 - arg1.field817;
        }
    }

    @ObfuscatedName("ax.am(B)Lcf;")
    public static class70 method12() {
        field808 = 0;
        return method2351();
    }

    @ObfuscatedName("do.ac(I)Lcf;")
    public static class70 method2351() {
        return field808 < field818 ? Statics.field3255[++field808 - 1] : null;
    }

    @ObfuscatedName("cf.ae(I)Z")
    public boolean method1797() {
        return (class544.field5350.method33() & this.field813) != 0;
    }

    @ObfuscatedName("cf.ad(I)Z")
    public boolean method1798() {
        return (class544.field5345.method33() & this.field813) != 0;
    }

    @ObfuscatedName("cf.aq(I)Z")
    public boolean method1799() {
        return (class544.field5330.method33() & this.field813) != 0;
    }

    @ObfuscatedName("cf.al(I)Z")
    public boolean method1800() {
        return (class544.field5356.method33() & this.field813) != 0;
    }

    @ObfuscatedName("cf.aj(B)Z")
    public boolean method1821() {
        return (class544.field5332.method33() & this.field813) != 0;
    }

    @ObfuscatedName("cf.as(B)Z")
    public boolean method1834() {
        return (class544.field5358.method33() & this.field813) != 0;
    }

    @ObfuscatedName("cf.aw(B)Z")
    public boolean method1803() {
        return (class544.field5354.method33() & this.field813) != 0;
    }

    @ObfuscatedName("cf.af(I)Z")
    public boolean method1804() {
        return (class544.field5359.method33() & this.field813) != 0;
    }

    @ObfuscatedName("cf.aa(B)Z")
    public boolean method1832() {
        return (class544.field5337.method33() & this.field813) != 0;
    }

    @ObfuscatedName("cf.ah(I)Z")
    public boolean method1828() {
        return (class544.field5353.method33() & this.field813) != 0;
    }
}
