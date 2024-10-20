package deob;

import java.net.URL;

@ObfuscatedName("cv")
public class class69 {

    @ObfuscatedName("cv.ah")
    public static int field829 = 0;

    @ObfuscatedName("cv.ar")
    public static int field830 = 0;

    @ObfuscatedName("cv.ab")
    public static int[] field831 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("cv.am")
    public static int[] field836 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("cv.ag")
    public int field833;

    @ObfuscatedName("cv.aa")
    public int field832;

    @ObfuscatedName("cv.ap")
    public int field840;

    @ObfuscatedName("cv.ay")
    public String field826;

    @ObfuscatedName("cv.as")
    public String field837;

    @ObfuscatedName("cv.aj")
    public int field838;

    @ObfuscatedName("cv.an")
    public int field841;

    @ObfuscatedName("cv.au")
    public String field834;

    @ObfuscatedName("at.ac(I)Z")
    public static boolean method312() {
        try {
            if (Statics.field1104 == null) {
                Statics.field1104 = Statics.field3089.method2701(new URL(Statics.field451));
            } else if (Statics.field1104.method2731()) {
                byte[] var0 = Statics.field1104.method2727();
                class530 var1 = new class530(var0);
                var1.method8371();
                field829 = var1.method8598();
                Statics.field1471 = new class69[field829];
                int var2 = 0;
                while (var2 < field829) {
                    class69 var3 = Statics.field1471[var2] = new class69();
                    var3.field833 = var1.method8598();
                    var3.field832 = var1.method8371();
                    var3.field826 = var1.method8588();
                    var3.field837 = var1.method8588();
                    var3.field838 = var1.method8365();
                    var3.field840 = var1.method8368();
                    var3.field841 = var2++;
                }
                method152(Statics.field1471, 0, Statics.field1471.length - 1, field836, field831);
                Statics.field1104 = null;
                return true;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1104 = null;
        }
        return false;
    }

    @ObfuscatedName("bo.al(III)V")
    public static void method671(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field836[var5] != arg0) {
                var2[var4] = field836[var5];
                var3[var4] = field831[var5];
                var4++;
            }
        }
        field836 = var2;
        field831 = var3;
        method152(Statics.field1471, 0, Statics.field1471.length - 1, field836, field831);
    }

    @ObfuscatedName("ap.ak([Lcv;II[I[II)V")
    public static void method152(class69[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class69 var8 = arg0[var7];
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
                        var11 = arg0[var6].field841;
                        var12 = var8.field841;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field840;
                        var12 = var8.field840;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method1735() ? 1 : 0;
                        var12 = var8.method1735() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field833;
                        var12 = var8.field833;
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
                        var15 = arg0[var5].field841;
                        var16 = var8.field841;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field840;
                        var16 = var8.field840;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method1735() ? 1 : 0;
                        var16 = var8.method1735() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field833;
                        var16 = var8.field833;
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
                class69 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method152(arg0, arg1, var6, arg3, arg4);
        method152(arg0, var6 + 1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ig.ax(IZIZI)V")
    public static void method3995(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (Statics.field1471 != null) {
            method4134(0, Statics.field1471.length - 1, arg0, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("jd.ao(IIIZIZI)V")
    public static void method4134(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg0 >= arg1) {
            return;
        }
        int var6 = (arg0 + arg1) / 2;
        int var7 = arg0;
        class69 var8 = Statics.field1471[var6];
        Statics.field1471[var6] = Statics.field1471[arg1];
        Statics.field1471[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (method303(Statics.field1471[var9], var8, arg2, arg3, arg4, arg5) <= 0) {
                class69 var10 = Statics.field1471[var9];
                Statics.field1471[var9] = Statics.field1471[var7];
                Statics.field1471[var7++] = var10;
            }
        }
        Statics.field1471[arg1] = Statics.field1471[var7];
        Statics.field1471[var7] = var8;
        method4134(arg0, var7 - 1, arg2, arg3, arg4, arg5);
        method4134(var7 + 1, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("az.ah(Lcv;Lcv;IZIZI)I")
    public static int method303(class69 arg0, class69 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        int var6 = method1123(arg0, arg1, arg2, arg3);
        if (var6 != 0) {
            return arg3 ? -var6 : var6;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var7 = method1123(arg0, arg1, arg4, arg5);
            return arg5 ? -var7 : var7;
        }
    }

    @ObfuscatedName("ck.ar(Lcv;Lcv;IZB)I")
    public static int method1123(class69 arg0, class69 arg1, int arg2, boolean arg3) {
        if (arg2 == 1) {
            int var4 = arg0.field840;
            int var5 = arg1.field840;
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
            return arg0.field838 - arg1.field838;
        } else if (arg2 == 3) {
            if (arg0.field837.equals("-")) {
                if (arg1.field837.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field837.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return arg0.field837.compareTo(arg1.field837);
            }
        } else if (arg2 == 4) {
            return arg0.method1739() ? (arg1.method1739() ? 0 : 1) : (arg1.method1739() ? -1 : 0);
        } else if (arg2 == 5) {
            return arg0.method1737() ? (arg1.method1737() ? 0 : 1) : (arg1.method1737() ? -1 : 0);
        } else if (arg2 == 6) {
            return arg0.method1762() ? (arg1.method1762() ? 0 : 1) : (arg1.method1762() ? -1 : 0);
        } else if (arg2 == 7) {
            return arg0.method1735() ? (arg1.method1735() ? 0 : 1) : (arg1.method1735() ? -1 : 0);
        } else {
            return arg0.field833 - arg1.field833;
        }
    }

    @ObfuscatedName("cu.ab(B)Lcv;")
    public static class69 method1016() {
        field830 = 0;
        return method301();
    }

    @ObfuscatedName("az.am(I)Lcv;")
    public static class69 method301() {
        return field830 < field829 ? Statics.field1471[++field830 - 1] : null;
    }

    @ObfuscatedName("cv.av(I)Z")
    public boolean method1735() {
        return (class526.field5116.method38() & this.field832) != 0;
    }

    @ObfuscatedName("cv.ag(I)Z")
    public boolean method1736() {
        return (class526.field5113.method38() & this.field832) != 0;
    }

    @ObfuscatedName("cv.aa(I)Z")
    public boolean method1737() {
        return (class526.field5112.method38() & this.field832) != 0;
    }

    @ObfuscatedName("cv.ap(B)Z")
    public boolean method1762() {
        return (class526.field5097.method38() & this.field832) != 0;
    }

    @ObfuscatedName("cv.ay(B)Z")
    public boolean method1739() {
        return (class526.field5119.method38() & this.field832) != 0;
    }

    @ObfuscatedName("cv.as(B)Z")
    public boolean method1740() {
        return (class526.field5125.method38() & this.field832) != 0;
    }

    @ObfuscatedName("cv.aj(I)Z")
    public boolean method1734() {
        return (class526.field5121.method38() & this.field832) != 0;
    }

    @ObfuscatedName("cv.an(I)Z")
    public boolean method1742() {
        return (class526.field5126.method38() & this.field832) != 0;
    }

    @ObfuscatedName("cv.au(B)Z")
    public boolean method1743() {
        return (class526.field5104.method38() & this.field832) != 0;
    }

    @ObfuscatedName("cv.ai(I)Z")
    public boolean method1744() {
        return (class526.field5102.method38() & this.field832) != 0;
    }
}
