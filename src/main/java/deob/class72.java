package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ca")
public class class72 {

    @ObfuscatedName("ca.as")
    public static int[] field883 = new int[5];

    @ObfuscatedName("ca.aa")
    public static int[][] field884 = new int[5][5000];

    @ObfuscatedName("ca.az")
    public static int[] field898 = new int[1000];

    @ObfuscatedName("ca.au")
    public static String[] field887 = new String[1000];

    @ObfuscatedName("ca.ah")
    public static int field888 = 0;

    @ObfuscatedName("ca.aj")
    public static class64[] field889 = new class64[50];

    @ObfuscatedName("ca.ad")
    public static Calendar field892 = Calendar.getInstance();

    @ObfuscatedName("ca.at")
    public static final String[] field893 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ca.ae")
    public static boolean field894 = false;

    @ObfuscatedName("ca.ac")
    public static boolean field895 = false;

    @ObfuscatedName("ca.ab")
    public static ArrayList field896 = new ArrayList();

    @ObfuscatedName("ca.av")
    public static int field897 = 0;

    @ObfuscatedName("ca.bd")
    public static final double field891 = Math.log(2.0D);

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gi.aq(Lda;I)V")
    public static void method3238(class89 arg0) {
        method7290(arg0, 500000, 475000);
    }

    @ObfuscatedName("qe.aw(Lda;III)V")
    public static void method7290(class89 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1106;
        class80 var5;
        if (class532.method4213(arg0.field1104)) {
            Statics.field4642 = (class265) var3[0];
            class179 var4 = class179.method2995(Statics.field4642.field2698);
            var5 = class80.method4011(arg0.field1104, var4.field1870, var4.field1867);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class80.method1131(var6);
        }
        if (var5 != null) {
            method2755(arg0, var5, arg1, arg2);
        }
    }

    @ObfuscatedName("ek.al(Lda;Ldc;IIB)V")
    public static void method2755(class89 arg0, class80 arg1, int arg2, int arg3) {
        Object[] var4 = arg0.field1106;
        Statics.field886 = 0;
        Statics.field437 = 0;
        int var5 = -1;
        int[] var6 = arg1.field1019;
        int[] var7 = arg1.field1020;
        byte var8 = -1;
        field888 = 0;
        field894 = false;
        boolean var9 = false;
        int var10 = 0;
        try {
            StringBuilder var50;
            try {
                Statics.field5123 = new int[arg1.field1028];
                int var11 = 0;
                Statics.field882 = new String[arg1.field1023];
                int var12 = 0;
                for (int var13 = 1; var13 < var4.length; var13++) {
                    if (var4[var13] instanceof Integer) {
                        int var14 = (Integer) var4[var13];
                        if (var14 == -2147483647) {
                            var14 = arg0.field1101;
                        }
                        if (var14 == -2147483646) {
                            var14 = arg0.field1097;
                        }
                        if (var14 == -2147483645) {
                            var14 = arg0.field1095 == null ? -1 : arg0.field1095.field3725;
                        }
                        if (var14 == -2147483644) {
                            var14 = arg0.field1098;
                        }
                        if (var14 == -2147483643) {
                            var14 = arg0.field1095 == null ? -1 : arg0.field1095.field3726;
                        }
                        if (var14 == -2147483642) {
                            var14 = arg0.field1094 == null ? -1 : arg0.field1094.field3725;
                        }
                        if (var14 == -2147483641) {
                            var14 = arg0.field1094 == null ? -1 : arg0.field1094.field3726;
                        }
                        if (var14 == -2147483640) {
                            var14 = arg0.field1100;
                        }
                        if (var14 == -2147483639) {
                            var14 = arg0.field1099;
                        }
                        Statics.field5123[var11++] = var14;
                    } else if (var4[var13] instanceof String) {
                        String var15 = (String) var4[var13];
                        if (var15.equals("event_opbase")) {
                            var15 = arg0.field1102;
                        }
                        Statics.field882[var12++] = var15;
                    }
                }
                field897 = arg0.field1103;
                while (true) {
                    var10++;
                    if (var10 > arg2) {
                        throw new RuntimeException();
                    }
                    var5++;
                    int var59 = var6[var5];
                    if (var59 >= 100) {
                        boolean var46;
                        if (arg1.field1020[var5] == 1) {
                            var46 = true;
                        } else {
                            var46 = false;
                        }
                        int var47 = method291(var59, arg1, var46);
                        switch(var47) {
                            case 0:
                                return;
                            case 1:
                            default:
                                break;
                            case 2:
                                throw new IllegalStateException();
                        }
                    } else if (var59 == 0) {
                        field898[++Statics.field886 - 1] = var7[var5];
                    } else if (var59 == 1) {
                        int var16 = var7[var5];
                        field898[++Statics.field886 - 1] = class338.field3620[var16];
                    } else if (var59 == 2) {
                        int var17 = var7[var5];
                        class338.field3620[var17] = field898[--Statics.field886];
                        client.method1850(var17);
                    } else if (var59 == 3) {
                        field887[++Statics.field437 - 1] = arg1.field1021[var5];
                    } else if (var59 == 6) {
                        var5 += var7[var5];
                    } else if (var59 == 7) {
                        Statics.field886 -= 2;
                        if (field898[Statics.field886] != field898[Statics.field886 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 8) {
                        Statics.field886 -= 2;
                        if (field898[Statics.field886] == field898[Statics.field886 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 9) {
                        Statics.field886 -= 2;
                        if (field898[Statics.field886] < field898[Statics.field886 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 10) {
                        Statics.field886 -= 2;
                        if (field898[Statics.field886] > field898[Statics.field886 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 21) {
                        if (field888 == 0) {
                            return;
                        }
                        class64 var19 = field889[--field888];
                        arg1 = var19.field471;
                        var6 = arg1.field1019;
                        var7 = arg1.field1020;
                        var5 = var19.field466;
                        Statics.field5123 = var19.field473;
                        Statics.field882 = var19.field468;
                    } else if (var59 == 25) {
                        int var20 = var7[var5];
                        field898[++Statics.field886 - 1] = class338.method5735(var20);
                    } else if (var59 == 27) {
                        int var21 = var7[var5];
                        Statics.method2925(var21, field898[--Statics.field886]);
                    } else if (var59 == 31) {
                        Statics.field886 -= 2;
                        if (field898[Statics.field886] <= field898[Statics.field886 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 32) {
                        Statics.field886 -= 2;
                        if (field898[Statics.field886] >= field898[Statics.field886 + 1]) {
                            var5 += var7[var5];
                        }
                    } else if (var59 == 33) {
                        field898[++Statics.field886 - 1] = Statics.field5123[var7[var5]];
                    } else if (var59 == 34) {
                        Statics.field5123[var7[var5]] = field898[--Statics.field886];
                    } else if (var59 == 35) {
                        field887[++Statics.field437 - 1] = Statics.field882[var7[var5]];
                    } else if (var59 == 36) {
                        Statics.field882[var7[var5]] = field887[--Statics.field437];
                    } else if (var59 == 37) {
                        int var22 = var7[var5];
                        Statics.field437 -= var22;
                        String var23 = class406.method5443(field887, Statics.field437, var22);
                        field887[++Statics.field437 - 1] = var23;
                    } else if (var59 == 38) {
                        Statics.field886--;
                    } else if (var59 == 39) {
                        Statics.field437--;
                    } else if (var59 == 40) {
                        int var24 = var7[var5];
                        class80 var25 = class80.method1131(var24);
                        int[] var26 = new int[var25.field1028];
                        String[] var27 = new String[var25.field1023];
                        for (int var28 = 0; var28 < var25.field1024; var28++) {
                            var26[var28] = field898[Statics.field886 - var25.field1024 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field1022; var29++) {
                            var27[var29] = field887[Statics.field437 - var25.field1022 + var29];
                        }
                        Statics.field886 -= var25.field1024;
                        Statics.field437 -= var25.field1022;
                        class64 var30 = new class64();
                        var30.field471 = arg1;
                        var30.field466 = var5;
                        var30.field473 = Statics.field5123;
                        var30.field468 = Statics.field882;
                        field889[++field888 - 1] = var30;
                        arg1 = var25;
                        var6 = var25.field1019;
                        var7 = var25.field1020;
                        var5 = -1;
                        Statics.field5123 = var26;
                        Statics.field882 = var27;
                    } else if (var59 == 42) {
                        field898[++Statics.field886 - 1] = Statics.field470.method2661(var7[var5]);
                    } else if (var59 == 43) {
                        Statics.field470.method2660(var7[var5], field898[--Statics.field886]);
                    } else if (var59 == 44) {
                        int var31 = var7[var5] >> 16;
                        int var32 = var7[var5] & 0xFFFF;
                        int var33 = field898[--Statics.field886];
                        if (var33 < 0 || var33 > 5000) {
                            throw new RuntimeException();
                        }
                        field883[var31] = var33;
                        byte var34 = -1;
                        if (var32 == 105) {
                            var34 = 0;
                        }
                        for (int var35 = 0; var35 < var33; var35++) {
                            field884[var31][var35] = var34;
                        }
                    } else if (var59 == 45) {
                        int var36 = var7[var5];
                        int var37 = field898[--Statics.field886];
                        if (var37 < 0 || var37 >= field883[var36]) {
                            throw new RuntimeException();
                        }
                        field898[++Statics.field886 - 1] = field884[var36][var37];
                    } else if (var59 == 46) {
                        int var38 = var7[var5];
                        Statics.field886 -= 2;
                        int var39 = field898[Statics.field886];
                        if (var39 < 0 || var39 >= field883[var38]) {
                            throw new RuntimeException();
                        }
                        field884[var38][var39] = field898[Statics.field886 + 1];
                    } else if (var59 == 47) {
                        String var40 = Statics.field470.method2683(var7[var5]);
                        if (var40 == null) {
                            var40 = class370.field4015;
                        }
                        field887[++Statics.field437 - 1] = var40;
                    } else if (var59 == 48) {
                        Statics.field470.method2687(var7[var5], field887[--Statics.field437]);
                    } else if (var59 == 49) {
                        String var41 = Statics.field470.method2663(var7[var5]);
                        field887[++Statics.field437 - 1] = var41;
                    } else if (var59 == 50) {
                        Statics.field470.method2662(var7[var5], field887[--Statics.field437]);
                    } else if (var59 == 60) {
                        class507 var42 = arg1.field1026[var7[var5]];
                        class491 var43 = (class491) var42.method8299((long) field898[--Statics.field886]);
                        if (var43 != null) {
                            var5 += var43.field4917;
                        }
                    } else if (var59 == 74) {
                        Integer var44 = Statics.field364.method3077(var7[var5]);
                        if (var44 == null) {
                            field898[++Statics.field886 - 1] = -1;
                        } else {
                            field898[++Statics.field886 - 1] = var44;
                        }
                    } else if (var59 == 76) {
                        Integer var45 = Statics.field921.method7909(var7[var5]);
                        if (var45 == null) {
                            field898[++Statics.field886 - 1] = -1;
                        } else {
                            field898[++Statics.field886 - 1] = var45;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } catch (Exception var57) {
                var9 = true;
                var50 = new StringBuilder(30);
                var50.append("").append(arg1.field4920).append(" ");
                for (int var51 = field888 - 1; var51 >= 0; var51--) {
                    var50.append("").append(field889[var51].field471.field4920).append(" ");
                }
            }
            var50.append("").append(var8);
            Statics.method5453(var50.toString(), var57);
        } finally {
            while (field896.size() > 0) {
                class104 var54 = (class104) field896.remove(0);
                client.method3354(var54.method2609(), var54.method2624(), var54.method2610(), var54.method2611(), "");
            }
            if (field894) {
                field894 = false;
                client.method4841();
            }
            if (!var9 && arg3 > 0 && var10 >= arg3) {
                Statics.method5453("Warning: Script " + arg1.field1029 + " finished at op count " + var10 + " of max " + arg2, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("ab.ai(ILdc;ZI)I")
    public static int method291(int arg0, class80 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method4066(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method6318(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2625(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method3450(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method3224(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method140(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method3070(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method3499(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return Statics.method2987(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method78(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method2796(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method6318(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2625(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method3450(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method3224(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method140(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method5101(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method6350(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method101(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method77(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method2796(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method6415(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method3483(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method2323(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method4579(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method6334(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method3791(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method4068(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method6342(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method250(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method4562(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method3157(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method3907(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method3542(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method5136(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method1137(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method93(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method2325(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method3333(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method4202(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method2105(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method5088(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method2836(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method4565(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method18(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method3719(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method95(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method763(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method1438(arg0, arg1, arg2);
        } else if (arg0 < 8100) {
            return method4099(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iw.ar(ILdc;ZB)I")
    public static int method4066(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field886 -= 3;
            int var3 = field898[Statics.field886];
            int var4 = field898[Statics.field886 + 1];
            int var5 = field898[Statics.field886 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class350 var6 = Statics.field1071.method5777(var3);
            if (var6.field3863 == null) {
                var6.field3863 = new class350[var5 + 1];
            }
            if (var6.field3863.length <= var5) {
                class350[] var7 = new class350[var5 + 1];
                for (int var8 = 0; var8 < var6.field3863.length; var8++) {
                    var7[var8] = var6.field3863[var8];
                }
                var6.field3863 = var7;
            }
            if (var5 > 0 && var6.field3863[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class350 var9 = new class350();
            var9.field3735 = var4;
            var9.field3772 = var9.field3725 = var6.field3725;
            var9.field3726 = var5;
            var9.field3724 = true;
            if (var4 == 12) {
                var9.method6200();
                var9.method6152().method6125(new class107(var9));
                var9.method6152().method5898(new class108(var9));
            }
            var6.field3863[var5] = var9;
            if (arg2) {
                Statics.field890 = var9;
            } else {
                Statics.field1645 = var9;
            }
            client.method2816(var6);
            return 1;
        } else if (arg0 == 101) {
            class350 var10 = arg2 ? Statics.field890 : Statics.field1645;
            class350 var11 = Statics.field1071.method5777(var10.field3725);
            var11.field3863[var10.field3726] = null;
            client.method2816(var11);
            return 1;
        } else if (arg0 == 102) {
            class350 var12 = Statics.field1071.method5777(field898[--Statics.field886]);
            var12.field3863 = null;
            client.method2816(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field886 -= 2;
            int var13 = field898[Statics.field886];
            int var14 = field898[Statics.field886 + 1];
            class350 var15 = Statics.field1071.method5779(var13, var14);
            if (var15 == null || var14 == -1) {
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = 1;
                if (arg2) {
                    Statics.field890 = var15;
                } else {
                    Statics.field1645 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class350 var16 = Statics.field1071.method5777(field898[--Statics.field886]);
            if (var16 == null) {
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = 1;
                if (arg2) {
                    Statics.field890 = var16;
                } else {
                    Statics.field1645 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nk.as(ILdc;ZI)I")
    public static int method6318(int arg0, class80 arg1, boolean arg2) {
        int var3 = -1;
        class350 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field898[--Statics.field886];
            var4 = Statics.field1071.method5777(var3);
        } else {
            var4 = arg2 ? Statics.field890 : Statics.field1645;
        }
        if (arg0 == 1000) {
            Statics.field886 -= 4;
            var4.field3811 = field898[Statics.field886];
            var4.field3736 = field898[Statics.field886 + 1];
            var4.field3801 = field898[Statics.field886 + 2];
            var4.field3797 = field898[Statics.field886 + 3];
            client.method2816(var4);
            Statics.field2033.method1165(var4);
            if (var3 != -1 && var4.field3735 == 0) {
                client.method3192(Statics.field1071.field3634[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field886 -= 4;
            var4.field3745 = field898[Statics.field886];
            var4.field3784 = field898[Statics.field886 + 1];
            var4.field3754 = field898[Statics.field886 + 2];
            var4.field3719 = field898[Statics.field886 + 3];
            client.method2816(var4);
            Statics.field2033.method1165(var4);
            if (var3 != -1 && var4.field3735 == 0) {
                client.method3192(Statics.field1071.field3634[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field898[--Statics.field886] == 1;
            if (var4.field3746 != var5) {
                var4.field3746 = var5;
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3873 = field898[--Statics.field886] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3762 = field898[--Statics.field886] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dr.aa(ILdc;ZI)I")
    public static int method2625(int arg0, class80 arg1, boolean arg2) {
        int var3 = -1;
        class350 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field898[--Statics.field886];
            var4 = Statics.field1071.method5777(var3);
        } else {
            var4 = arg2 ? Statics.field890 : Statics.field1645;
        }
        if (arg0 == 1100) {
            Statics.field886 -= 2;
            int var5 = field898[Statics.field886];
            int var6 = field898[Statics.field886 + 1];
            if (var4.field3735 == 12) {
                class348 var7 = var4.method6152();
                if (var7 != null && var7.method5862(var5, var6)) {
                    client.method2816(var4);
                }
            } else {
                var4.field3747 = var5;
                if (var4.field3747 > var4.field3749 - var4.field3741) {
                    var4.field3747 = var4.field3749 - var4.field3741;
                }
                if (var4.field3747 < 0) {
                    var4.field3747 = 0;
                }
                var4.field3828 = var6;
                if (var4.field3828 > var4.field3750 - var4.field3742) {
                    var4.field3828 = var4.field3750 - var4.field3742;
                }
                if (var4.field3828 < 0) {
                    var4.field3828 = 0;
                }
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3751 = field898[--Statics.field886];
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3755 = field898[--Statics.field886] == 1;
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3757 = field898[--Statics.field886];
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3759 = field898[--Statics.field886];
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3803 = field898[--Statics.field886];
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3804 = field898[--Statics.field886];
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3765 = field898[--Statics.field886] == 1;
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3770 = 1;
            var4.field3771 = field898[--Statics.field886];
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field886 -= 6;
            var4.field3711 = field898[Statics.field886];
            var4.field3777 = field898[Statics.field886 + 1];
            var4.field3860 = field898[Statics.field886 + 2];
            var4.field3779 = field898[Statics.field886 + 3];
            var4.field3780 = field898[Statics.field886 + 4];
            var4.field3781 = field898[Statics.field886 + 5];
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field898[--Statics.field886];
            if (var4.field3774 != var8) {
                var4.field3774 = var8;
                var4.field3861 = 0;
                var4.field3862 = 0;
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3785 = field898[--Statics.field886] == 1;
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field887[--Statics.field437];
            if (var4.field3735 == 12) {
                class348 var10 = var4.method6152();
                if (var10 != null && var10.method5908()) {
                    var10.method5897(var9);
                } else {
                    var4.field3802 = var9;
                }
                client.method2816(var4);
            } else if (!var9.equals(var4.field3802)) {
                var4.field3802 = var9;
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3788 = field898[--Statics.field886];
            if (var4.field3735 == 12) {
                class348 var11 = var4.method6152();
                if (var11 != null) {
                    var11.method6088();
                }
            }
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field886 -= 3;
            if (var4.field3735 == 12) {
                class348 var12 = var4.method6152();
                if (var12 != null) {
                    var12.method5863(field898[Statics.field886], field898[Statics.field886 + 1]);
                    var12.method5900(field898[Statics.field886 + 2]);
                }
            } else {
                var4.field3792 = field898[Statics.field886];
                var4.field3793 = field898[Statics.field886 + 1];
                var4.field3791 = field898[Statics.field886 + 2];
            }
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3794 = field898[--Statics.field886] == 1;
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3766 = field898[--Statics.field886];
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3767 = field898[--Statics.field886];
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3768 = field898[--Statics.field886] == 1;
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3769 = field898[--Statics.field886] == 1;
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field886 -= 2;
            var4.field3749 = field898[Statics.field886];
            var4.field3750 = field898[Statics.field886 + 1];
            client.method2816(var4);
            if (var3 != -1 && var4.field3735 == 0) {
                client.method3192(Statics.field1071.field3634[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method3447(var4.field3725, var4.field3726);
            client.field704 = var4;
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3810 = field898[--Statics.field886];
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3752 = field898[--Statics.field886];
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3789 = field898[--Statics.field886];
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var13 = field898[--Statics.field886];
            class546 var14 = (class546) class392.method6317(class546.method6351(), var13);
            if (var14 != null) {
                var4.field3846 = var14;
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var15 = field898[--Statics.field886] == 1;
            var4.field3760 = var15;
            return 1;
        } else if (arg0 == 1127) {
            boolean var16 = field898[--Statics.field886] == 1;
            var4.field3730 = var16;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3763 = field887[--Statics.field437];
            client.method2816(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method6220(field887[--Statics.field437], "", Statics.field1838, client.method2627());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field886 -= 2;
            var4.method6155(field898[Statics.field886], field898[Statics.field886 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method6156(field887[--Statics.field437], field898[--Statics.field886]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field886--;
            class342 var17 = var4.method6169();
            if (var17 != null) {
                var17.field3644 = field898[Statics.field886];
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field886--;
            class342 var18 = var4.method6169();
            if (var18 != null) {
                var18.field3640 = field898[Statics.field886];
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field437--;
            class348 var19 = var4.method6152();
            if (var19 != null) {
                var4.field3790 = field887[Statics.field437];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field886--;
            class342 var20 = var4.method6169();
            if (var20 != null) {
                var20.field3641 = field898[Statics.field886];
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field886--;
            class348 var21 = var4.method6152();
            if (var21 != null && var21.method5865(field898[Statics.field886])) {
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field886--;
            class348 var22 = var4.method6152();
            if (var22 != null && var22.method5923(field898[Statics.field886])) {
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field886--;
            class348 var23 = var4.method6152();
            if (var23 != null && var23.method6118(field898[Statics.field886])) {
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var24 = field898[--Statics.field886] == 1;
            client.field738.method4022();
            class348 var25 = var4.method6152();
            if (var25 != null && var25.method6068(var24)) {
                if (var24) {
                    client.field738.method4026(var4);
                }
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var26 = field898[--Statics.field886] == 1;
            if (!var26 && client.field738.method4021() == var4) {
                client.field738.method4022();
                client.method2816(var4);
            }
            class348 var27 = var4.method6152();
            if (var27 != null) {
                var27.method5854(var26);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field886 -= 2;
            class348 var28 = var4.method6152();
            if (var28 != null && var28.method5876(field898[Statics.field886], field898[Statics.field886 + 1])) {
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field886--;
            class348 var29 = var4.method6152();
            if (var29 != null && var29.method5876(field898[Statics.field886], field898[Statics.field886])) {
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field886--;
            class348 var30 = var4.method6152();
            if (var30 != null) {
                var30.method5866(field898[Statics.field886]);
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field886--;
            class348 var31 = var4.method6152();
            if (var31 != null) {
                var31.method5985(field898[Statics.field886]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field886--;
            class348 var32 = var4.method6152();
            if (var32 != null) {
                var32.method5997(field898[Statics.field886]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field886--;
            class348 var33 = var4.method6152();
            if (var33 != null) {
                var33.method5867(field898[Statics.field886]);
                client.method2816(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field886 -= 2;
            class28 var34 = var4.method6171();
            if (var34 != null) {
                var34.method354(field898[Statics.field886], field898[Statics.field886 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field886 -= 2;
            class28 var35 = var4.method6171();
            if (var35 != null) {
                var35.method355((char) field898[Statics.field886], field898[Statics.field886 + 1]);
            }
            return 1;
        } else if (arg0 == 1150) {
            var4.method6153(field887[--Statics.field437], Statics.field1838);
            return 1;
        } else if (arg0 == 1151) {
            Statics.field437 -= 3;
            String var36 = field887[Statics.field437];
            String var37 = field887[Statics.field437 + 1];
            String var38 = field887[Statics.field437 + 2];
            long var39 = client.method2627();
            long var41 = Statics.method3148();
            String var43 = client.method7298().method8010(client.method7298().field4960);
            if (var39 != -1L) {
                var36 = var36.replaceAll("%userid%", Long.toString(var39));
            }
            if (var41 != -1L) {
                var36 = var36.replaceAll("%userhash%", Long.toString(var41));
            }
            if (!var43.isEmpty()) {
                var36 = var36.replaceAll("%deviceid%", var43);
            }
            var4.method6134(var36, var37, var38, var43, Long.toString(var41), Statics.field1838);
            return 1;
        } else if (arg0 == 1152) {
            if (var4.field3735 == 11) {
                boolean var44 = class220.method3497().method3922(var4.method6165().method3808());
                field898[++Statics.field886 - 1] = var44 ? 1 : 0;
            } else {
                System.out.println("Attempting to call function on a non-CRMView object.");
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hx.az(ILdc;ZB)I")
    public static int method3450(int arg0, class80 arg1, boolean arg2) {
        class350 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field1071.method5777(field898[--Statics.field886]);
        } else {
            var3 = arg2 ? Statics.field890 : Statics.field1645;
        }
        client.method2816(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field886 -= 2;
            int var9 = field898[Statics.field886];
            int var10 = field898[Statics.field886 + 1];
            var3.field3728 = var9;
            var3.field3721 = var10;
            class205 var11 = class205.method6353(var9);
            var3.field3860 = var11.field2189;
            var3.field3779 = var11.field2190;
            var3.field3780 = var11.field2213;
            var3.field3711 = var11.field2201;
            var3.field3777 = var11.field2193;
            var3.field3781 = var11.field2188;
            if (arg0 == 1205) {
                var3.field3787 = 0;
            } else if (arg0 == 1212 | var11.field2194 == 1) {
                var3.field3787 = 1;
            } else {
                var3.field3787 = 2;
            }
            if (var3.field3782 > 0) {
                var3.field3781 = var3.field3781 * 32 / var3.field3782;
            } else if (var3.field3745 > 0) {
                var3.field3781 = var3.field3781 * 32 / var3.field3745;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3770 = 2;
            var3.field3771 = field898[--Statics.field886];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3770 = 3;
            var3.field3771 = Statics.field1858.field1158.method5849();
            return 1;
        } else if (arg0 == 1207) {
            boolean var4 = field898[--Statics.field886] == 1;
            class350.method156(var3, Statics.field1858.field1158, var4);
            return 1;
        } else if (arg0 == 1208) {
            int var5 = field898[--Statics.field886];
            if (var3.field3775 == null) {
                throw new RuntimeException("");
            }
            class350.method2802(var3, var5);
            return 1;
        } else if (arg0 == 1209) {
            Statics.field886 -= 2;
            int var6 = field898[Statics.field886];
            int var7 = field898[Statics.field886 + 1];
            if (var3.field3775 == null) {
                throw new RuntimeException("");
            }
            class350.method3147(var3, var6, var7);
            return 1;
        } else if (arg0 == 1210) {
            int var8 = field898[--Statics.field886];
            if (var3.field3775 == null) {
                throw new RuntimeException("");
            }
            class350.method3255(var3, Statics.field1858.field1158.field3666, var8);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gp.ao(ILdc;ZB)I")
    public static int method3224(int arg0, class80 arg1, boolean arg2) {
        boolean var3 = true;
        class350 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = Statics.field1071.method5777(field898[--Statics.field886]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field890 : Statics.field1645;
        }
        if (arg0 == 1300) {
            int var5 = field898[--Statics.field886] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method6236(var5, field887[--Statics.field437]);
                return 1;
            } else {
                Statics.field437--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field886 -= 2;
            int var6 = field898[Statics.field886];
            int var7 = field898[Statics.field886 + 1];
            var4.field3808 = Statics.field1071.method5779(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3850 = field898[--Statics.field886] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3871 = field898[--Statics.field886];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3764 = field898[--Statics.field886];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3806 = field887[--Statics.field437];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3812 = field887[--Statics.field437];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3737 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3875 = field898[--Statics.field886] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field886--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field886 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field898[Statics.field886 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field898[Statics.field886 + var10];
                        var9[var10 / 2] = (byte) field898[Statics.field886 + var10 + 1];
                    }
                }
            } else {
                Statics.field886 -= 2;
                var8 = new byte[] { (byte) field898[Statics.field886] };
                var9 = new byte[] { (byte) field898[Statics.field886 + 1] };
            }
            int var11 = field898[--Statics.field886] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method6662(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field886 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field898[Statics.field886] };
            byte[] var14 = new byte[] { (byte) field898[Statics.field886 + 1] };
            method6662(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field886 -= 3;
            int var15 = field898[Statics.field886] - 1;
            int var16 = field898[Statics.field886 + 1];
            int var17 = field898[Statics.field886 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method636(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field898[--Statics.field886];
            int var20 = field898[--Statics.field886];
            method636(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field886--;
            int var21 = field898[Statics.field886] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            Statics.method2848(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            Statics.method2848(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pl.au(Lng;I[B[BI)V")
    public static final void method6662(class350 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3740 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3740 = new byte[11][];
            arg0.field3807 = new byte[11][];
            arg0.field3821 = new int[11];
            arg0.field3805 = new int[11];
        }
        arg0.field3740[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3809 = false;
            for (int var4 = 0; var4 < arg0.field3740.length; var4++) {
                if (arg0.field3740[var4] != null) {
                    arg0.field3809 = true;
                    break;
                }
            }
        } else {
            arg0.field3809 = true;
        }
        arg0.field3807[arg1] = arg3;
    }

    @ObfuscatedName("bw.ak(Lng;IIII)V")
    public static final void method636(class350 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3821 == null) {
            throw new RuntimeException();
        }
        arg0.field3821[arg1] = arg2;
        arg0.field3805[arg1] = arg3;
    }

    @ObfuscatedName("aj.aj(ILdc;ZI)I")
    public static int method140(int arg0, class80 arg1, boolean arg2) {
        class350 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field1071.method5777(field898[--Statics.field886]);
        } else {
            var3 = arg2 ? Statics.field890 : Statics.field1645;
        }
        String var4 = field887[--Statics.field437];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field898[--Statics.field886];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field898[--Statics.field886];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field887[--Statics.field437];
            } else {
                var7[var8] = Integer.valueOf(field898[--Statics.field886]);
            }
        }
        int var9 = field898[--Statics.field886];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3815 = var7;
        } else if (arg0 == 1401) {
            var3.field3761 = var7;
        } else if (arg0 == 1402) {
            var3.field3817 = var7;
        } else if (arg0 == 1403) {
            var3.field3819 = var7;
        } else if (arg0 == 1404) {
            var3.field3756 = var7;
        } else if (arg0 == 1405) {
            var3.field3822 = var7;
        } else if (arg0 == 1406) {
            var3.field3859 = var7;
        } else if (arg0 == 1407) {
            var3.field3826 = var7;
            var3.field3827 = var5;
        } else if (arg0 == 1408) {
            var3.field3722 = var7;
        } else if (arg0 == 1409) {
            var3.field3833 = var7;
        } else if (arg0 == 1410) {
            var3.field3825 = var7;
        } else if (arg0 == 1411) {
            var3.field3816 = var7;
        } else if (arg0 == 1412) {
            var3.field3852 = var7;
        } else if (arg0 == 1414) {
            var3.field3776 = var7;
            var3.field3829 = var5;
        } else if (arg0 == 1415) {
            var3.field3727 = var7;
            var3.field3831 = var5;
        } else if (arg0 == 1416) {
            var3.field3824 = var7;
        } else if (arg0 == 1417) {
            var3.field3835 = var7;
        } else if (arg0 == 1418) {
            var3.field3836 = var7;
        } else if (arg0 == 1419) {
            var3.field3837 = var7;
        } else if (arg0 == 1420) {
            var3.field3758 = var7;
        } else if (arg0 == 1421) {
            var3.field3841 = var7;
        } else if (arg0 == 1422) {
            var3.field3848 = var7;
        } else if (arg0 == 1423) {
            var3.field3845 = var7;
        } else if (arg0 == 1424) {
            var3.field3718 = var7;
        } else if (arg0 == 1425) {
            var3.field3855 = var7;
        } else if (arg0 == 1426) {
            var3.field3849 = var7;
        } else if (arg0 == 1427) {
            var3.field3843 = var7;
        } else if (arg0 == 1428) {
            var3.field3842 = var7;
        } else if (arg0 == 1429) {
            var3.field3731 = var7;
        } else if (arg0 == 1430) {
            var3.field3838 = var7;
        } else if (arg0 == 1431) {
            var3.field3839 = var7;
        } else if (arg0 == 1434) {
            var3.field3738 = var7;
        } else if (arg0 == 1435) {
            var3.field3834 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class346 var10 = var3.method6187();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3660 = var7;
                } else if (arg0 == 1437) {
                    var10.field3655 = var7;
                } else if (arg0 == 1438) {
                    var10.field3661 = var7;
                } else if (arg0 == 1439) {
                    var10.field3659 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3813 = true;
        return 1;
    }

    @ObfuscatedName("fl.af(ILdc;ZI)I")
    public static int method3070(int arg0, class80 arg1, boolean arg2) {
        class350 var3 = arg2 ? Statics.field890 : Statics.field1645;
        if (arg0 == 1500) {
            field898[++Statics.field886 - 1] = var3.field3739;
            return 1;
        } else if (arg0 == 1501) {
            field898[++Statics.field886 - 1] = var3.field3869;
            return 1;
        } else if (arg0 == 1502) {
            field898[++Statics.field886 - 1] = var3.field3741;
            return 1;
        } else if (arg0 == 1503) {
            field898[++Statics.field886 - 1] = var3.field3742;
            return 1;
        } else if (arg0 == 1504) {
            field898[++Statics.field886 - 1] = var3.field3746 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field898[++Statics.field886 - 1] = var3.field3772;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hc.ax(ILdc;ZB)I")
    public static int method3499(int arg0, class80 arg1, boolean arg2) {
        class350 var3 = arg2 ? Statics.field890 : Statics.field1645;
        if (arg0 == 1600) {
            field898[++Statics.field886 - 1] = var3.field3747;
            return 1;
        } else if (arg0 == 1601) {
            field898[++Statics.field886 - 1] = var3.field3828;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3735 == 12) {
                class348 var4 = var3.method6152();
                if (var4 != null) {
                    field887[++Statics.field437 - 1] = var4.method5861().method7044();
                    return 1;
                }
            }
            field887[++Statics.field437 - 1] = var3.field3802;
            return 1;
        } else if (arg0 == 1603) {
            field898[++Statics.field886 - 1] = var3.field3749;
            return 1;
        } else if (arg0 == 1604) {
            field898[++Statics.field886 - 1] = var3.field3750;
            return 1;
        } else if (arg0 == 1605) {
            field898[++Statics.field886 - 1] = var3.field3781;
            return 1;
        } else if (arg0 == 1606) {
            field898[++Statics.field886 - 1] = var3.field3860;
            return 1;
        } else if (arg0 == 1607) {
            field898[++Statics.field886 - 1] = var3.field3780;
            return 1;
        } else if (arg0 == 1608) {
            field898[++Statics.field886 - 1] = var3.field3779;
            return 1;
        } else if (arg0 == 1609) {
            field898[++Statics.field886 - 1] = var3.field3757;
            return 1;
        } else if (arg0 == 1610) {
            field898[++Statics.field886 - 1] = var3.field3789;
            return 1;
        } else if (arg0 == 1611) {
            field898[++Statics.field886 - 1] = var3.field3751;
            return 1;
        } else if (arg0 == 1612) {
            field898[++Statics.field886 - 1] = var3.field3752;
            return 1;
        } else if (arg0 == 1613) {
            field898[++Statics.field886 - 1] = var3.field3846.method35();
            return 1;
        } else if (arg0 == 1614) {
            field898[++Statics.field886 - 1] = var3.field3730 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class342 var5 = var3.method6169();
                field898[++Statics.field886 - 1] = var5 == null ? 0 : var5.field3644;
            }
            if (arg0 == 1618) {
                class342 var6 = var3.method6169();
                field898[++Statics.field886 - 1] = var6 == null ? 0 : var6.field3640;
                return 1;
            } else if (arg0 == 1619) {
                class348 var7 = var3.method6152();
                field887[++Statics.field437 - 1] = var7 == null ? "" : var7.method6057().method7044();
                return 1;
            } else if (arg0 == 1620) {
                class342 var8 = var3.method6169();
                field898[++Statics.field886 - 1] = var8 == null ? 0 : var8.field3641;
                return 1;
            } else if (arg0 == 1621) {
                class348 var9 = var3.method6152();
                field898[++Statics.field886 - 1] = var9 == null ? 0 : var9.method5911();
                return 1;
            } else if (arg0 == 1622) {
                class348 var10 = var3.method6152();
                field898[++Statics.field886 - 1] = var10 == null ? 0 : var10.method6009();
                return 1;
            } else if (arg0 == 1623) {
                class348 var11 = var3.method6152();
                field898[++Statics.field886 - 1] = var11 == null ? 0 : var11.method5969();
                return 1;
            } else if (arg0 == 1624) {
                class348 var12 = var3.method6152();
                field898[++Statics.field886 - 1] = var12 != null && var12.method5903() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class348 var13 = var3.method6152();
                field898[++Statics.field886 - 1] = var13 != null && var13.method5904() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class348 var14 = var3.method6152();
                field887[++Statics.field437 - 1] = var14 == null ? "" : var14.method5902().method7242();
                return 1;
            } else if (arg0 == 1627) {
                class348 var15 = var3.method6152();
                int var16 = var15 == null ? 0 : var15.method5907();
                int var17 = var15 == null ? 0 : var15.method5906();
                field898[++Statics.field886 - 1] = Math.min(var16, var17);
                field898[++Statics.field886 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class348 var18 = var3.method6152();
                field898[++Statics.field886 - 1] = var18 == null ? 0 : var18.method5906();
                return 1;
            } else if (arg0 == 1629) {
                class348 var19 = var3.method6152();
                field898[++Statics.field886 - 1] = var19 == null ? 0 : var19.method5915();
                return 1;
            } else if (arg0 == 1630) {
                class348 var20 = var3.method6152();
                field898[++Statics.field886 - 1] = var20 == null ? 0 : var20.method5914();
                return 1;
            } else if (arg0 == 1631) {
                class348 var21 = var3.method6152();
                field898[++Statics.field886 - 1] = var21 == null ? 0 : var21.method5916();
                return 1;
            } else if (arg0 == 1632) {
                class348 var22 = var3.method6152();
                field898[++Statics.field886 - 1] = var22 == null ? 0 : var22.method5982();
                return 1;
            } else if (arg0 == 1633) {
                class28 var23 = var3.method6171();
                field898[Statics.field886 - 1] = var23 == null ? 0 : var23.method356(field898[Statics.field886 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class28 var24 = var3.method6171();
                field898[Statics.field886 - 1] = var24 == null ? 0 : var24.method357((char) field898[Statics.field886 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("at.ag(Lng;I)I")
    public static int method253(class350 arg0) {
        if (arg0.field3735 == 11) {
            String var1 = field887[--Statics.field437];
            field898[++Statics.field886 - 1] = arg0.method6159(var1);
            return 1;
        } else {
            Statics.field437--;
            field898[++Statics.field886 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("oi.am(Lng;B)I")
    public static int method6344(class350 arg0) {
        if (arg0.field3735 == 11) {
            String var1 = field887[--Statics.field437];
            field887[++Statics.field437 - 1] = arg0.method6160(var1);
            return 1;
        } else {
            field887[Statics.field437 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("au.ad(ILdc;ZI)I")
    public static int method78(int arg0, class80 arg1, boolean arg2) {
        class350 var3 = arg2 ? Statics.field890 : Statics.field1645;
        if (arg0 == 1800) {
            field898[++Statics.field886 - 1] = class351.method5135(client.method7342(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field898[--Statics.field886];
            int var5 = var4 - 1;
            if (var3.field3737 == null || var5 >= var3.field3737.length || var3.field3737[var5] == null) {
                field887[++Statics.field437 - 1] = "";
            } else {
                field887[++Statics.field437 - 1] = var3.field3737[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3806 == null) {
                field887[++Statics.field437 - 1] = "";
            } else {
                field887[++Statics.field437 - 1] = var3.field3806;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ev.at(ILdc;ZB)I")
    public static int method2796(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field897 >= 10) {
                throw new RuntimeException();
            }
            class350 var10;
            if (arg0 >= 2000) {
                var10 = Statics.field1071.method5777(field898[--Statics.field886]);
            } else {
                var10 = arg2 ? Statics.field890 : Statics.field1645;
            }
            if (var10.field3843 == null) {
                return 0;
            }
            class89 var11 = new class89();
            var11.field1095 = var10;
            var11.field1106 = var10.field3843;
            var11.field1103 = field897 + 1;
            client.field742.method6678(var11);
            return 1;
        } else if (arg0 == 1928) {
            class350 var3 = arg2 ? Statics.field890 : Statics.field1645;
            int var4 = field898[--Statics.field886];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class104 var5 = new class104(var4, var3.field3725, var3.field3726, var3.field3728);
            field896.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field886 -= 3;
            int var6 = field898[Statics.field886];
            int var7 = field898[Statics.field886 + 1];
            int var8 = field898[Statics.field886 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class104 var9 = new class104(var8, var6, var7, Statics.field1071.method5777(var6).field3728);
            field896.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ke.ay(ILdc;ZI)I")
    public static int method5101(int arg0, class80 arg1, boolean arg2) {
        class350 var3 = Statics.field1071.method5777(field898[--Statics.field886]);
        if (arg0 == 2500) {
            field898[++Statics.field886 - 1] = var3.field3739;
            return 1;
        } else if (arg0 == 2501) {
            field898[++Statics.field886 - 1] = var3.field3869;
            return 1;
        } else if (arg0 == 2502) {
            field898[++Statics.field886 - 1] = var3.field3741;
            return 1;
        } else if (arg0 == 2503) {
            field898[++Statics.field886 - 1] = var3.field3742;
            return 1;
        } else if (arg0 == 2504) {
            field898[++Statics.field886 - 1] = var3.field3746 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field898[++Statics.field886 - 1] = var3.field3772;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("oh.ae(ILdc;ZB)I")
    public static int method6350(int arg0, class80 arg1, boolean arg2) {
        class350 var3 = Statics.field1071.method5777(field898[--Statics.field886]);
        if (arg0 == 2600) {
            field898[++Statics.field886 - 1] = var3.field3747;
            return 1;
        } else if (arg0 == 2601) {
            field898[++Statics.field886 - 1] = var3.field3828;
            return 1;
        } else if (arg0 == 2602) {
            field887[++Statics.field437 - 1] = var3.field3802;
            return 1;
        } else if (arg0 == 2603) {
            field898[++Statics.field886 - 1] = var3.field3749;
            return 1;
        } else if (arg0 == 2604) {
            field898[++Statics.field886 - 1] = var3.field3750;
            return 1;
        } else if (arg0 == 2605) {
            field898[++Statics.field886 - 1] = var3.field3781;
            return 1;
        } else if (arg0 == 2606) {
            field898[++Statics.field886 - 1] = var3.field3860;
            return 1;
        } else if (arg0 == 2607) {
            field898[++Statics.field886 - 1] = var3.field3780;
            return 1;
        } else if (arg0 == 2608) {
            field898[++Statics.field886 - 1] = var3.field3779;
            return 1;
        } else if (arg0 == 2609) {
            field898[++Statics.field886 - 1] = var3.field3757;
            return 1;
        } else if (arg0 == 2610) {
            field898[++Statics.field886 - 1] = var3.field3789;
            return 1;
        } else if (arg0 == 2611) {
            field898[++Statics.field886 - 1] = var3.field3751;
            return 1;
        } else if (arg0 == 2612) {
            field898[++Statics.field886 - 1] = var3.field3752;
            return 1;
        } else if (arg0 == 2613) {
            field898[++Statics.field886 - 1] = var3.field3846.method35();
            return 1;
        } else if (arg0 == 2614) {
            field898[++Statics.field886 - 1] = var3.field3730 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class342 var4 = var3.method6169();
                field898[++Statics.field886 - 1] = var4 == null ? 0 : var4.field3644;
            }
            if (arg0 == 2618) {
                class342 var5 = var3.method6169();
                field898[++Statics.field886 - 1] = var5 == null ? 0 : var5.field3640;
                return 1;
            } else if (arg0 == 2619) {
                class348 var6 = var3.method6152();
                field887[++Statics.field437 - 1] = var6 == null ? "" : var6.method6057().method7044();
                return 1;
            } else if (arg0 == 2620) {
                class342 var7 = var3.method6169();
                field898[++Statics.field886 - 1] = var7 == null ? 0 : var7.field3641;
                return 1;
            } else if (arg0 == 2621) {
                class348 var8 = var3.method6152();
                field898[++Statics.field886 - 1] = var8 == null ? 0 : var8.method5911();
                return 1;
            } else if (arg0 == 2622) {
                class348 var9 = var3.method6152();
                field898[++Statics.field886 - 1] = var9 == null ? 0 : var9.method6009();
                return 1;
            } else if (arg0 == 2623) {
                class348 var10 = var3.method6152();
                field898[++Statics.field886 - 1] = var10 == null ? 0 : var10.method5969();
                return 1;
            } else if (arg0 == 2624) {
                class348 var11 = var3.method6152();
                field898[++Statics.field886 - 1] = var11 != null && var11.method5903() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class348 var12 = var3.method6152();
                field898[++Statics.field886 - 1] = var12 != null && var12.method5904() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class348 var13 = var3.method6152();
                field887[++Statics.field437 - 1] = var13 == null ? "" : var13.method5902().method7242();
                return 1;
            } else if (arg0 == 2627) {
                class348 var14 = var3.method6152();
                int var15 = var14 == null ? 0 : var14.method5907();
                int var16 = var14 == null ? 0 : var14.method5906();
                field898[++Statics.field886 - 1] = Math.min(var15, var16);
                field898[++Statics.field886 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class348 var17 = var3.method6152();
                field898[++Statics.field886 - 1] = var17 == null ? 0 : var17.method5906();
                return 1;
            } else if (arg0 == 2629) {
                class348 var18 = var3.method6152();
                field898[++Statics.field886 - 1] = var18 == null ? 0 : var18.method5915();
                return 1;
            } else if (arg0 == 2630) {
                class348 var19 = var3.method6152();
                field898[++Statics.field886 - 1] = var19 == null ? 0 : var19.method5914();
                return 1;
            } else if (arg0 == 2631) {
                class348 var20 = var3.method6152();
                field898[++Statics.field886 - 1] = var20 == null ? 0 : var20.method5916();
                return 1;
            } else if (arg0 == 2632) {
                class348 var21 = var3.method6152();
                field898[++Statics.field886 - 1] = var21 == null ? 0 : var21.method5982();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method6171();
                field898[Statics.field886 - 1] = var22 == null ? 0 : var22.method356(field898[Statics.field886 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method6171();
                field898[Statics.field886 - 1] = var23 == null ? 0 : var23.method357((char) field898[Statics.field886 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("ah.ac(ILdc;ZI)I")
    public static int method101(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class350 var3 = Statics.field1071.method5777(field898[--Statics.field886]);
            field898[++Statics.field886 - 1] = var3.field3728;
            return 1;
        } else if (arg0 == 2701) {
            class350 var4 = Statics.field1071.method5777(field898[--Statics.field886]);
            if (var4.field3728 == -1) {
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = var4.field3721;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field898[--Statics.field886];
            class88 var6 = (class88) client.field727.method8322((long) var5);
            if (var6 == null) {
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field898[++Statics.field886 - 1] = client.field699;
            return 1;
        } else if (arg0 == 2707) {
            class350 var7 = Statics.field1071.method5777(field898[--Statics.field886]);
            field898[++Statics.field886 - 1] = var7.method6241() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class350 var8 = Statics.field1071.method5777(field898[--Statics.field886]);
            return method253(var8);
        } else if (arg0 == 2709) {
            class350 var9 = Statics.field1071.method5777(field898[--Statics.field886]);
            return method6344(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("au.ab(ILdc;ZI)I")
    public static int method77(int arg0, class80 arg1, boolean arg2) {
        class350 var3 = Statics.field1071.method5777(field898[--Statics.field886]);
        if (arg0 == 2800) {
            field898[++Statics.field886 - 1] = class351.method5135(client.method7342(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field898[--Statics.field886];
            int var5 = var4 - 1;
            if (var3.field3737 == null || var5 >= var3.field3737.length || var3.field3737[var5] == null) {
                field887[++Statics.field437 - 1] = "";
            } else {
                field887[++Statics.field437 - 1] = var3.field3737[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3806 == null) {
                field887[++Statics.field437 - 1] = "";
            } else {
                field887[++Statics.field437 - 1] = var3.field3806;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("om.av(ILdc;ZB)I")
    public static int method6415(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field887[--Statics.field437];
            class112.method3792(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field886 -= 2;
            client.method7979(Statics.field1858, field898[Statics.field886], field898[Statics.field886 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field895) {
                field894 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field887[--Statics.field437];
            int var5 = 0;
            if (class406.method5371(var4)) {
                var5 = class406.method2922(var4);
            }
            class313 var6 = class313.method5301(class311.field3250, client.field590.field1435);
            var6.field3291.method8577(var5);
            client.field590.method2741(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field887[--Statics.field437];
            class313 var8 = class313.method5301(class311.field3179, client.field590.field1435);
            var8.field3291.method8574(var7.length() + 1);
            var8.field3291.method8581(var7);
            client.field590.method2741(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field887[--Statics.field437];
            class313 var10 = class313.method5301(class311.field3236, client.field590.field1435);
            var10.field3291.method8574(var9.length() + 1);
            var10.field3291.method8581(var9);
            client.field590.method2741(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field898[--Statics.field886];
            String var12 = field887[--Statics.field437];
            client.method2216(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field886 -= 3;
            int var13 = field898[Statics.field886];
            int var14 = field898[Statics.field886 + 1];
            int var15 = field898[Statics.field886 + 2];
            class350 var16 = Statics.field1071.method5777(var15);
            client.method392(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field886 -= 2;
            int var17 = field898[Statics.field886];
            int var18 = field898[Statics.field886 + 1];
            class350 var19 = arg2 ? Statics.field890 : Statics.field1645;
            client.method392(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field5137 = field898[--Statics.field886] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field898[++Statics.field886 - 1] = Statics.field156.method2518() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field156.method2413(field898[--Statics.field886] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field887[--Statics.field437];
            boolean var21 = field898[--Statics.field886] == 1;
            class32.method2989(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field898[--Statics.field886];
            class313 var23 = class313.method5301(class311.field3176, client.field590.field1435);
            var23.field3291.method8575(var22);
            client.field590.method2741(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field898[--Statics.field886];
            Statics.field437 -= 2;
            String var25 = field887[Statics.field437];
            String var26 = field887[Statics.field437 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class313 var27 = class313.method5301(class311.field3216, client.field590.field1435);
                var27.field3291.method8575(1 + class534.method3043(var25) + class534.method3043(var26));
                var27.field3291.method8623(var24);
                var27.field3291.method8581(var25);
                var27.field3291.method8581(var26);
                client.field590.method2741(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            Statics.field886--;
            return 1;
        } else if (arg0 == 3118) {
            client.field687 = field898[--Statics.field886] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field657 = field898[--Statics.field886] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field898[--Statics.field886] == 1) {
                client.field662 |= 0x1;
            } else {
                client.field662 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field898[--Statics.field886] == 1) {
                client.field662 |= 0x2;
            } else {
                client.field662 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field898[--Statics.field886] == 1) {
                client.field662 |= 0x4;
            } else {
                client.field662 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field898[--Statics.field886] == 1) {
                client.field662 |= 0x8;
            } else {
                client.field662 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field662 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field789 = field898[--Statics.field886] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field651 = field898[--Statics.field886] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method2331(field898[--Statics.field886] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field898[++Statics.field886 - 1] = client.method6586() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field886 -= 2;
            client.field623 = field898[Statics.field886];
            client.field829 = field898[Statics.field886 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field886 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field886--;
            return 1;
        } else if (arg0 == 3132) {
            field898[++Statics.field886 - 1] = Statics.field199;
            field898[++Statics.field886 - 1] = Statics.field2531;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field886--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field886 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field576 = 3;
            client.field702 = field898[--Statics.field886];
            return 1;
        } else if (arg0 == 3137) {
            client.field576 = 2;
            client.field702 = field898[--Statics.field886];
            return 1;
        } else if (arg0 == 3138) {
            client.field576 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field576 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field576 = 3;
            client.field702 = arg2 ? Statics.field890.field3725 : Statics.field1645.field3725;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field898[--Statics.field886] == 1;
            Statics.field156.method2415(var28);
            return 1;
        } else if (arg0 == 3142) {
            field898[++Statics.field886 - 1] = Statics.field156.method2416() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field898[--Statics.field886] == 1;
            client.field579 = var29;
            if (!var29) {
                Statics.field156.method2431("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field898[++Statics.field886 - 1] = client.field579 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field898[--Statics.field886] == 1;
            Statics.field156.method2417(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field898[++Statics.field886 - 1] = Statics.field156.method2463() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field898[++Statics.field886 - 1] = class77.field951;
            return 1;
        } else if (arg0 == 3154) {
            field898[++Statics.field886 - 1] = client.method8866();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field437--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field886 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field886--;
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field886--;
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field437--;
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field886--;
            field887[++Statics.field437 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field886--;
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field886 -= 2;
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field886 -= 2;
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field886 -= 2;
            field887[++Statics.field437 - 1] = "";
            field887[++Statics.field437 - 1] = "";
            field887[++Statics.field437 - 1] = "";
            field887[++Statics.field437 - 1] = "";
            field887[++Statics.field437 - 1] = "";
            field887[++Statics.field437 - 1] = "";
            field887[++Statics.field437 - 1] = "";
            field887[++Statics.field437 - 1] = "";
            field887[++Statics.field437 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field886--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field886--;
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field886--;
            return 1;
        } else if (arg0 == 3175) {
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field437--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field437--;
            return 1;
        } else if (arg0 == 3181) {
            Statics.method3335(field898[--Statics.field886]);
            return 1;
        } else if (arg0 == 3182) {
            field898[++Statics.field886 - 1] = client.method5100();
            return 1;
        } else if (arg0 == 3189) {
            int var31 = field898[--Statics.field886];
            client.method3215(var31);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hr.ap(ILdc;ZB)I")
    public static int method3483(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field886 -= 3;
            client.method2973(field898[Statics.field886], field898[Statics.field886 + 1], field898[Statics.field886 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            Statics.field886 -= 5;
            int var3 = field898[Statics.field886];
            int var4 = field898[Statics.field886 + 1];
            int var5 = field898[Statics.field886 + 2];
            int var6 = field898[Statics.field886 + 3];
            int var7 = field898[Statics.field886 + 4];
            ArrayList var8 = new ArrayList();
            var8.add(var3);
            client.method2985(var8, var4, var5, var6, var7);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field886 -= 2;
            client.method38(field898[Statics.field886], field898[Statics.field886 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class92 var50 = class92.field1131;
            class91 var51 = class91.field1117;
            int var52 = field898[--Statics.field886];
            if (arg0 == 3212) {
                int var53 = field898[--Statics.field886];
                var50 = (class92) class392.method6317(class92.method7536(), var53);
                if (var50 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var53));
                }
            }
            if (arg0 == 3213) {
                int var54 = field898[--Statics.field886];
                var51 = (class91) class392.method6317(class91.method3773(), var54);
                if (var51 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var54));
                }
            }
            if (arg0 == 3209) {
                int var55 = field898[--Statics.field886];
                var50 = (class92) class392.method6317(class92.method7536(), var55);
                if (var50 == null) {
                    var51 = (class91) class392.method6317(class91.method3773(), var55);
                    if (var51 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var55));
                    }
                }
            } else if (arg0 == 3181) {
                var50 = class92.field1129;
            } else if (arg0 == 3203) {
                var51 = class91.field1123;
            } else if (arg0 == 3205) {
                var51 = class91.field1118;
            } else if (arg0 == 3207) {
                var51 = class91.field1119;
            }
            if (class91.field1117 == var51) {
                switch(var50.field1130) {
                    case 1:
                        Statics.field156.method2415(var52 == 1);
                        break;
                    case 2:
                        Statics.field156.method2417(var52 == 1);
                        break;
                    case 3:
                        Statics.field156.method2446(var52 == 1);
                        break;
                    case 4:
                        if (var52 < 0) {
                            var52 = 0;
                        }
                        Statics.field156.method2447(var52);
                        break;
                    case 5:
                        Statics.method3335(var52);
                        break;
                    default:
                        String var56 = String.format("Unkown device option: %s.", var50.toString());
                        throw new RuntimeException(var56);
                }
            } else {
                switch(var51.field1121) {
                    case 1:
                        Statics.field156.method2413(var52 == 1);
                        break;
                    case 2:
                        int var62 = Math.min(Math.max(var52, 0), 100);
                        int var63 = Math.round((float) (var62 * 255) / 100.0F);
                        client.method5751(var63);
                        break;
                    case 3:
                        int var60 = Math.min(Math.max(var52, 0), 100);
                        int var61 = Math.round((float) (var60 * 127) / 100.0F);
                        client.method804(var61);
                        break;
                    case 4:
                        int var58 = Math.min(Math.max(var52, 0), 100);
                        int var59 = Math.round((float) (var58 * 127) / 100.0F);
                        client.method3992(var59);
                        break;
                    default:
                        String var57 = String.format("Unkown game option: %s.", var51.toString());
                        throw new RuntimeException(var57);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class92 var38 = class92.field1131;
            class91 var39 = class91.field1117;
            boolean var40 = false;
            if (arg0 == 3214) {
                int var41 = field898[--Statics.field886];
                var38 = (class92) class392.method6317(class92.method7536(), var41);
                if (var38 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var41));
                }
            }
            if (arg0 == 3215) {
                int var42 = field898[--Statics.field886];
                var39 = (class91) class392.method6317(class91.method3773(), var42);
                if (var39 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var42));
                }
            }
            if (arg0 == 3210) {
                int var43 = field898[--Statics.field886];
                var38 = (class92) class392.method6317(class92.method7536(), var43);
                if (var38 == null) {
                    var39 = (class91) class392.method6317(class91.method3773(), var43);
                    if (var39 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var43));
                    }
                }
            } else if (arg0 == 3182) {
                var38 = class92.field1129;
            } else if (arg0 == 3204) {
                var39 = class91.field1123;
            } else if (arg0 == 3206) {
                var39 = class91.field1118;
            } else if (arg0 == 3208) {
                var39 = class91.field1119;
            }
            int var45;
            if (class91.field1117 == var39) {
                switch(var38.field1130) {
                    case 1:
                        var45 = Statics.field156.method2416() ? 1 : 0;
                        break;
                    case 2:
                        var45 = Statics.field156.method2463() ? 1 : 0;
                        break;
                    case 3:
                        var45 = Statics.field156.method2520() ? 1 : 0;
                        break;
                    case 4:
                        var45 = Statics.field156.method2409();
                        break;
                    case 5:
                        var45 = client.method5100();
                        break;
                    default:
                        String var44 = String.format("Unkown device option: %s.", var38.toString());
                        throw new RuntimeException(var44);
                }
            } else {
                switch(var39.field1121) {
                    case 1:
                        var45 = Statics.field156.method2518() ? 1 : 0;
                        break;
                    case 2:
                        int var49 = Statics.field156.method2427();
                        var45 = Math.round((float) (var49 * 100) / 255.0F);
                        break;
                    case 3:
                        int var48 = Statics.field156.method2505();
                        var45 = Math.round((float) (var48 * 100) / 127.0F);
                        break;
                    case 4:
                        int var47 = Statics.field156.method2455();
                        var45 = Math.round((float) (var47 * 100) / 127.0F);
                        break;
                    default:
                        String var46 = String.format("Unkown game option: %s.", var39.toString());
                        throw new RuntimeException(var46);
                }
            }
            field898[++Statics.field886 - 1] = var45;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else if (arg0 == 3216) {
            int var9 = field898[--Statics.field886];
            int var10 = 0;
            class92 var11 = (class92) class392.method6317(class92.method7536(), var9);
            if (var11 != null) {
                var10 = class92.field1131 == var11 ? 0 : 1;
            }
            field898[++Statics.field886 - 1] = var10;
            return 1;
        } else if (arg0 == 3218) {
            int var12 = field898[--Statics.field886];
            int var13 = 0;
            class91 var14 = (class91) class392.method6317(class91.method3773(), var12);
            if (var14 != null) {
                var13 = class91.field1117 == var14 ? 0 : 1;
            }
            field898[++Statics.field886 - 1] = var13;
            return 1;
        } else if (arg0 == 3217 || arg0 == 3219) {
            class92 var28 = class92.field1131;
            class91 var29 = class91.field1117;
            boolean var30 = true;
            boolean var31 = true;
            if (arg0 == 3217) {
                int var32 = field898[--Statics.field886];
                var28 = (class92) class392.method6317(class92.method7536(), var32);
                if (var28 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var32));
                }
            }
            if (arg0 == 3219) {
                int var33 = field898[--Statics.field886];
                var29 = (class91) class392.method6317(class91.method3773(), var33);
                if (var29 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var33));
                }
            }
            byte var35;
            int var36;
            if (class91.field1117 == var29) {
                switch(var28.field1130) {
                    case 1:
                    case 2:
                    case 3:
                        var35 = 0;
                        var36 = 1;
                        break;
                    case 4:
                        var35 = 0;
                        var36 = Integer.MAX_VALUE;
                        break;
                    case 5:
                        var35 = 0;
                        var36 = 100;
                        break;
                    default:
                        String var34 = String.format("Unkown device option: %s.", var28.toString());
                        throw new RuntimeException(var34);
                }
            } else {
                switch(var29.field1121) {
                    case 1:
                        var35 = 0;
                        var36 = 1;
                        break;
                    case 2:
                    case 3:
                    case 4:
                        var35 = 0;
                        var36 = 100;
                        break;
                    default:
                        String var37 = String.format("Unkown game option: %s.", var29.toString());
                        throw new RuntimeException(var37);
                }
            }
            field898[++Statics.field886 - 1] = var35;
            field898[++Statics.field886 - 1] = var36;
            return 1;
        } else if (arg0 == 3220) {
            Statics.field886 -= 2;
            int var15 = field898[Statics.field886];
            int var16 = field898[Statics.field886 + 1];
            class322.method3196(var15, var16);
            return 1;
        } else if (arg0 == 3221) {
            Statics.field886 -= 6;
            int var17 = field898[Statics.field886];
            int var18 = field898[Statics.field886 + 1];
            int var19 = field898[Statics.field886 + 2];
            int var20 = field898[Statics.field886 + 3];
            int var21 = field898[Statics.field886 + 4];
            int var22 = field898[Statics.field886 + 5];
            ArrayList var23 = new ArrayList();
            var23.add(var17);
            var23.add(var18);
            client.method2985(var23, var19, var20, var21, var22);
            return 1;
        } else if (arg0 == 3222) {
            Statics.field886 -= 4;
            int var24 = field898[Statics.field886];
            int var25 = field898[Statics.field886 + 1];
            int var26 = field898[Statics.field886 + 2];
            int var27 = field898[Statics.field886 + 3];
            class322.method2027(var24, var25, var26, var27);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dj.bu(ILdc;ZI)I")
    public static int method2323(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field898[++Statics.field886 - 1] = client.field536;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field886 -= 2;
            int var3 = field898[Statics.field886];
            int var4 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = class86.method3908(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field886 -= 2;
            int var5 = field898[Statics.field886];
            int var6 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = class86.method3997(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field886 -= 2;
            int var7 = field898[Statics.field886];
            int var8 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = class86.method6865(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = class172.method2268(var9).field1840;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = client.field670[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = client.field671[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = client.field672[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field4873;
            int var14 = (Statics.field1858.field1208 >> 7) + Statics.field1011;
            int var15 = (Statics.field1858.field1253 >> 7) + Statics.field216;
            field898[++Statics.field886 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field898[++Statics.field886 - 1] = client.field525 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field886 -= 2;
            int var19 = field898[Statics.field886] + 32768;
            int var20 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = class86.method3908(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field886 -= 2;
            int var21 = field898[Statics.field886] + 32768;
            int var22 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = class86.method3997(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field886 -= 2;
            int var23 = field898[Statics.field886] + 32768;
            int var24 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = class86.method6865(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field676 >= 2) {
                field898[++Statics.field886 - 1] = client.field676;
            } else {
                field898[++Statics.field886 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field898[++Statics.field886 - 1] = client.field653;
            return 1;
        } else if (arg0 == 3318) {
            field898[++Statics.field886 - 1] = client.field522;
            return 1;
        } else if (arg0 == 3321) {
            field898[++Statics.field886 - 1] = client.field705 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field898[++Statics.field886 - 1] = client.field706;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field527) {
                field898[++Statics.field886 - 1] = 1;
            } else {
                field898[++Statics.field886 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field898[++Statics.field886 - 1] = client.field588;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field886 -= 4;
            int var25 = field898[Statics.field886];
            int var26 = field898[Statics.field886 + 1];
            int var27 = field898[Statics.field886 + 2];
            int var28 = field898[Statics.field886 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field898[++Statics.field886 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field898[++Statics.field886 - 1] = client.field558;
            return 1;
        } else if (arg0 == 3327) {
            field898[++Statics.field886 - 1] = client.field698;
            return 1;
        } else if (arg0 == 3331) {
            field898[++Statics.field886 - 1] = client.field705;
            return 1;
        } else if (arg0 == 3332) {
            int var32 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = client.field673[var32];
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jp.bo(ILdc;ZI)I")
    public static int method4579(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field886 -= 2;
            int var3 = field898[Statics.field886];
            int var4 = field898[Statics.field886 + 1];
            class185 var5 = class185.method2240(var3);
            if (var5.field1935 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1937; var6++) {
                if (var5.field1938[var6] == var4) {
                    field887[++Statics.field437 - 1] = var5.field1939[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field887[++Statics.field437 - 1] = var5.field1942;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field886 -= 4;
            int var7 = field898[Statics.field886];
            int var8 = field898[Statics.field886 + 1];
            int var9 = field898[Statics.field886 + 2];
            int var10 = field898[Statics.field886 + 3];
            class185 var11 = class185.method2240(var9);
            if (var11.field1933 != var7 || var11.field1935 != var8) {
                if (var8 == 115) {
                    field887[++Statics.field437 - 1] = class370.field4015;
                } else {
                    field898[++Statics.field886 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1937; var12++) {
                if (var11.field1938[var12] == var10) {
                    if (var8 == 115) {
                        field887[++Statics.field437 - 1] = var11.field1939[var12];
                    } else {
                        field898[++Statics.field886 - 1] = var11.field1934[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field887[++Statics.field437 - 1] = var11.field1942;
                } else {
                    field898[++Statics.field886 - 1] = var11.field1936;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field898[--Statics.field886];
            class185 var14 = class185.method2240(var13);
            field898[++Statics.field886 - 1] = var14.method3342();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("oe.bd(ILdc;ZI)I")
    public static int method6334(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = client.field793.method4065(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = client.field793.method4052(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = client.field793.method4047(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("if.bi(ILdc;ZB)I")
    public static int method3791(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field1091.field858 == 0) {
                field898[++Statics.field886 - 1] = -2;
            } else if (Statics.field1091.field858 == 1) {
                field898[++Statics.field886 - 1] = -1;
            } else {
                field898[++Statics.field886 - 1] = Statics.field1091.field862.method7588();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field898[--Statics.field886];
            if (Statics.field1091.method1848() && var3 >= 0 && var3 < Statics.field1091.field862.method7588()) {
                class449 var4 = (class449) Statics.field1091.field862.method7598(var3);
                field887[++Statics.field437 - 1] = var4.method7558();
                field887[++Statics.field437 - 1] = var4.method7561();
            } else {
                field887[++Statics.field437 - 1] = "";
                field887[++Statics.field437 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field898[--Statics.field886];
            if (Statics.field1091.method1848() && var5 >= 0 && var5 < Statics.field1091.field862.method7588()) {
                field898[++Statics.field886 - 1] = ((class456) Statics.field1091.field862.method7598(var5)).field4770;
            } else {
                field898[++Statics.field886 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field898[--Statics.field886];
            if (Statics.field1091.method1848() && var6 >= 0 && var6 < Statics.field1091.field862.method7588()) {
                field898[++Statics.field886 - 1] = ((class456) Statics.field1091.field862.method7598(var6)).field4772;
            } else {
                field898[++Statics.field886 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field887[--Statics.field437];
            int var8 = field898[--Statics.field886];
            class70.method83(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field887[--Statics.field437];
            Statics.field1091.method1781(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field887[--Statics.field437];
            Statics.field1091.method1785(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field887[--Statics.field437];
            Statics.field1091.method1783(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field887[--Statics.field437];
            boolean var13 = true;
            Statics.field1091.method1786(var12, var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field887[--Statics.field437];
            String var15 = client.method7382(var14);
            field898[++Statics.field886 - 1] = Statics.field1091.method1779(new class557(var15, Statics.field4750), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field1010 == null) {
                field887[++Statics.field437 - 1] = "";
            } else {
                field887[++Statics.field437 - 1] = Statics.field1010.field4740;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field1010 == null) {
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = Statics.field1010.method7588();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field898[--Statics.field886];
            if (Statics.field1010 == null || var16 >= Statics.field1010.method7588()) {
                field887[++Statics.field437 - 1] = "";
            } else {
                field887[++Statics.field437 - 1] = Statics.field1010.method7598(var16).method7559().method9185();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field898[--Statics.field886];
            if (Statics.field1010 == null || var17 >= Statics.field1010.method7588()) {
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = ((class456) Statics.field1010.method7598(var17)).method7656();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field898[--Statics.field886];
            if (Statics.field1010 == null || var18 >= Statics.field1010.method7588()) {
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = ((class456) Statics.field1010.method7598(var18)).field4772;
            }
            return 1;
        } else if (arg0 == 3616) {
            field898[++Statics.field886 - 1] = Statics.field1010 == null ? 0 : Statics.field1010.field4742;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field887[--Statics.field437];
            client.method2805(var19);
            return 1;
        } else if (arg0 == 3618) {
            field898[++Statics.field886 - 1] = Statics.field1010 == null ? 0 : Statics.field1010.field4745;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field887[--Statics.field437];
            client.method1120(var20);
            return 1;
        } else if (arg0 == 3620) {
            client.method2604();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field1091.method1848()) {
                field898[++Statics.field886 - 1] = Statics.field1091.field857.method7588();
            } else {
                field898[++Statics.field886 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var21 = field898[--Statics.field886];
            if (Statics.field1091.method1848() && var21 >= 0 && var21 < Statics.field1091.field857.method7588()) {
                class455 var22 = (class455) Statics.field1091.field857.method7598(var21);
                field887[++Statics.field437 - 1] = var22.method7558();
                field887[++Statics.field437 - 1] = var22.method7561();
            } else {
                field887[++Statics.field437 - 1] = "";
                field887[++Statics.field437 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var23 = field887[--Statics.field437];
            String var24 = client.method7382(var23);
            field898[++Statics.field886 - 1] = Statics.field1091.method1814(new class557(var24, Statics.field4750)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var25 = field898[--Statics.field886];
            if (Statics.field1010 == null || var25 >= Statics.field1010.method7588() || !Statics.field1010.method7598(var25).method7559().equals(Statics.field1858.field1162)) {
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field1010 == null || Statics.field1010.field4741 == null) {
                field887[++Statics.field437 - 1] = "";
            } else {
                field887[++Statics.field437 - 1] = Statics.field1010.field4741;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var26 = field898[--Statics.field886];
            if (Statics.field1010 == null || var26 >= Statics.field1010.method7588() || !((class451) Statics.field1010.method7598(var26)).method7541()) {
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var27 = field898[--Statics.field886];
            if (Statics.field1010 == null || var27 >= Statics.field1010.method7588() || !((class451) Statics.field1010.method7598(var27)).method7543()) {
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field1091.field862.method7624();
            return 1;
        } else if (arg0 == 3629) {
            boolean var28 = field898[--Statics.field886] == 1;
            Statics.field1091.field862.method7606(new class540(var28));
            return 1;
        } else if (arg0 == 3630) {
            boolean var29 = field898[--Statics.field886] == 1;
            Statics.field1091.field862.method7606(new class541(var29));
            return 1;
        } else if (arg0 == 3631) {
            boolean var30 = field898[--Statics.field886] == 1;
            Statics.field1091.field862.method7606(new class121(var30));
            return 1;
        } else if (arg0 == 3632) {
            boolean var31 = field898[--Statics.field886] == 1;
            Statics.field1091.field862.method7606(new class117(var31));
            return 1;
        } else if (arg0 == 3633) {
            boolean var32 = field898[--Statics.field886] == 1;
            Statics.field1091.field862.method7606(new class120(var32));
            return 1;
        } else if (arg0 == 3634) {
            boolean var33 = field898[--Statics.field886] == 1;
            Statics.field1091.field862.method7606(new class125(var33));
            return 1;
        } else if (arg0 == 3635) {
            boolean var34 = field898[--Statics.field886] == 1;
            Statics.field1091.field862.method7606(new class119(var34));
            return 1;
        } else if (arg0 == 3636) {
            boolean var35 = field898[--Statics.field886] == 1;
            Statics.field1091.field862.method7606(new class118(var35));
            return 1;
        } else if (arg0 == 3637) {
            boolean var36 = field898[--Statics.field886] == 1;
            Statics.field1091.field862.method7606(new class122(var36));
            return 1;
        } else if (arg0 == 3638) {
            boolean var37 = field898[--Statics.field886] == 1;
            Statics.field1091.field862.method7606(new class123(var37));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field1091.field862.method7607();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field1091.field857.method7624();
            return 1;
        } else if (arg0 == 3641) {
            boolean var38 = field898[--Statics.field886] == 1;
            Statics.field1091.field857.method7606(new class540(var38));
            return 1;
        } else if (arg0 == 3642) {
            boolean var39 = field898[--Statics.field886] == 1;
            Statics.field1091.field857.method7606(new class541(var39));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field1091.field857.method7607();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field1010 != null) {
                Statics.field1010.method7624();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var40 = field898[--Statics.field886] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method7606(new class540(var40));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var41 = field898[--Statics.field886] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method7606(new class541(var41));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var42 = field898[--Statics.field886] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method7606(new class121(var42));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var43 = field898[--Statics.field886] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method7606(new class117(var43));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var44 = field898[--Statics.field886] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method7606(new class120(var44));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var45 = field898[--Statics.field886] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method7606(new class125(var45));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var46 = field898[--Statics.field886] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method7606(new class119(var46));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var47 = field898[--Statics.field886] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method7606(new class118(var47));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var48 = field898[--Statics.field886] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method7606(new class122(var48));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var49 = field898[--Statics.field886] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method7606(new class123(var49));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field1010 != null) {
                Statics.field1010.method7607();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var50 = field898[--Statics.field886] == 1;
            Statics.field1091.field862.method7606(new class124(var50));
            return 1;
        } else if (arg0 == 3657) {
            boolean var51 = field898[--Statics.field886] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method7606(new class124(var51));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iz.bq(ILdc;ZB)I")
    public static int method4068(int arg0, class80 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("oi.ba(ILdc;ZI)I")
    public static int method6342(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field2405 == null) {
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = 1;
                Statics.field364 = Statics.field2405;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field898[--Statics.field886];
            if (client.field771[var3] == null) {
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = 1;
                Statics.field364 = client.field771[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field887[++Statics.field437 - 1] = Statics.field364.field1739;
            return 1;
        } else if (arg0 == 3803) {
            field898[++Statics.field886 - 1] = Statics.field364.field1741 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field898[++Statics.field886 - 1] = Statics.field364.field1747;
            return 1;
        } else if (arg0 == 3805) {
            field898[++Statics.field886 - 1] = Statics.field364.field1749;
            return 1;
        } else if (arg0 == 3806) {
            field898[++Statics.field886 - 1] = Statics.field364.field1744;
            return 1;
        } else if (arg0 == 3807) {
            field898[++Statics.field886 - 1] = Statics.field364.field1743;
            return 1;
        } else if (arg0 == 3809) {
            field898[++Statics.field886 - 1] = Statics.field364.field1746;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field898[--Statics.field886];
            field887[++Statics.field437 - 1] = Statics.field364.field1757[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = Statics.field364.field1748[var5];
            return 1;
        } else if (arg0 == 3812) {
            field898[++Statics.field886 - 1] = Statics.field364.field1734;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field898[--Statics.field886];
            field887[++Statics.field437 - 1] = Statics.field364.field1758[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field886 -= 3;
            int var7 = field898[Statics.field886];
            int var8 = field898[Statics.field886 + 1];
            int var9 = field898[Statics.field886 + 2];
            field898[++Statics.field886 - 1] = Statics.field364.method3134(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field898[++Statics.field886 - 1] = Statics.field364.field1740;
            return 1;
        } else if (arg0 == 3816) {
            field898[++Statics.field886 - 1] = Statics.field364.field1754;
            return 1;
        } else if (arg0 == 3817) {
            field898[++Statics.field886 - 1] = Statics.field364.method3143(field887[--Statics.field437]);
            return 1;
        } else if (arg0 == 3818) {
            field898[Statics.field886 - 1] = Statics.field364.method3078()[field898[Statics.field886 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field886 -= 2;
            int var10 = field898[Statics.field886];
            int var11 = field898[Statics.field886 + 1];
            Statics.method2963(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = Statics.field364.field1751[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field886 -= 3;
                int var13 = field898[Statics.field886];
                boolean var14 = field898[Statics.field886 + 1] == 1;
                int var15 = field898[Statics.field886 + 2];
                client.method2536(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field898[--Statics.field886];
                field898[++Statics.field886 - 1] = Statics.field364.field1752[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field3446 == null) {
                    field898[++Statics.field886 - 1] = 0;
                } else {
                    field898[++Statics.field886 - 1] = 1;
                    Statics.field54 = Statics.field3446;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field898[--Statics.field886];
                if (client.field772[var17] == null) {
                    field898[++Statics.field886 - 1] = 0;
                } else {
                    field898[++Statics.field886 - 1] = 1;
                    Statics.field54 = client.field772[var17];
                    Statics.field885 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field887[++Statics.field437 - 1] = Statics.field54.field1808;
                return 1;
            } else if (arg0 == 3853) {
                field898[++Statics.field886 - 1] = Statics.field54.field1802;
                return 1;
            } else if (arg0 == 3854) {
                field898[++Statics.field886 - 1] = Statics.field54.field1807;
                return 1;
            } else if (arg0 == 3855) {
                field898[++Statics.field886 - 1] = Statics.field54.method3180();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field898[--Statics.field886];
                field887[++Statics.field437 - 1] = ((class148) Statics.field54.field1804.get(var18)).field1679.method9185();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field898[--Statics.field886];
                field898[++Statics.field886 - 1] = ((class148) Statics.field54.field1804.get(var19)).field1680;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field898[--Statics.field886];
                field898[++Statics.field886 - 1] = ((class148) Statics.field54.field1804.get(var20)).field1681;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field898[--Statics.field886];
                client.method2328(Statics.field885, var21);
                return 1;
            } else if (arg0 == 3860) {
                field898[++Statics.field886 - 1] = Statics.field54.method3186(field887[--Statics.field437]);
                return 1;
            } else if (arg0 == 3861) {
                field898[Statics.field886 - 1] = Statics.field54.method3169()[field898[Statics.field886 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field898[++Statics.field886 - 1] = Statics.field921 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("at.bt(ILdc;ZB)I")
    public static int method250(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = client.field628[var3].method6609();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = client.field628[var4].field4459;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = client.field628[var5].field4463;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = client.field628[var6].field4461;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = client.field628[var7].field4460;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = client.field628[var8].field4458;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field898[--Statics.field886];
            int var10 = client.field628[var9].method6598();
            field898[++Statics.field886 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field898[--Statics.field886];
            int var12 = client.field628[var11].method6598();
            field898[++Statics.field886 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field898[--Statics.field886];
            int var14 = client.field628[var13].method6598();
            field898[++Statics.field886 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field898[--Statics.field886];
            int var16 = client.field628[var15].method6598();
            field898[++Statics.field886 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field898[--Statics.field886] == 1;
            if (Statics.field2344 != null) {
                Statics.field2344.method6545(class380.field4436, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field898[--Statics.field886] == 1;
            if (Statics.field2344 != null) {
                Statics.field2344.method6545(class380.field4438, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field886 -= 2;
            boolean var19 = field898[Statics.field886] == 1;
            boolean var20 = field898[Statics.field886 + 1] == 1;
            if (Statics.field2344 != null) {
                client.field614.field492 = var20;
                Statics.field2344.method6545(client.field614, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field898[--Statics.field886] == 1;
            if (Statics.field2344 != null) {
                Statics.field2344.method6545(class380.field4437, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field898[--Statics.field886] == 1;
            if (Statics.field2344 != null) {
                Statics.field2344.method6545(class380.field4440, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field898[++Statics.field886 - 1] = Statics.field2344 == null ? 0 : Statics.field2344.field4441.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field898[--Statics.field886];
            class386 var24 = (class386) Statics.field2344.field4441.get(var23);
            field898[++Statics.field886 - 1] = var24.field4453;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field898[--Statics.field886];
            class386 var26 = (class386) Statics.field2344.field4441.get(var25);
            field887[++Statics.field437 - 1] = var26.method6588();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field898[--Statics.field886];
            class386 var28 = (class386) Statics.field2344.field4441.get(var27);
            field887[++Statics.field437 - 1] = var28.method6589();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field898[--Statics.field886];
            class386 var30 = (class386) Statics.field2344.field4441.get(var29);
            long var31 = class318.method2218() - Statics.field3610 - var30.field4452;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field887[++Statics.field437 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field898[--Statics.field886];
            class386 var38 = (class386) Statics.field2344.field4441.get(var37);
            field898[++Statics.field886 - 1] = var38.field4454.field4461;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field898[--Statics.field886];
            class386 var40 = (class386) Statics.field2344.field4441.get(var39);
            field898[++Statics.field886 - 1] = var40.field4454.field4463;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field898[--Statics.field886];
            class386 var42 = (class386) Statics.field2344.field4441.get(var41);
            field898[++Statics.field886 - 1] = var42.field4454.field4459;
            return 1;
        } else if (arg0 == 3939) {
            int var43 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = class205.method6353(var43).field2227 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("je.bk(ILdc;ZI)I")
    public static int method4562(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field886 -= 2;
            int var3 = field898[Statics.field886];
            int var4 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field886 -= 2;
            int var5 = field898[Statics.field886];
            int var6 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field886 -= 2;
            int var7 = field898[Statics.field886];
            int var8 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field886 -= 2;
            int var9 = field898[Statics.field886];
            int var10 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field886 -= 5;
            int var13 = field898[Statics.field886];
            int var14 = field898[Statics.field886 + 1];
            int var15 = field898[Statics.field886 + 2];
            int var16 = field898[Statics.field886 + 3];
            int var17 = field898[Statics.field886 + 4];
            field898[++Statics.field886 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field886 -= 2;
            int var18 = field898[Statics.field886];
            int var19 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field886 -= 2;
            int var20 = field898[Statics.field886];
            int var21 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field886 -= 2;
            int var22 = field898[Statics.field886];
            int var23 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field886 -= 2;
            int var24 = field898[Statics.field886];
            int var25 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field886 -= 2;
            int var26 = field898[Statics.field886];
            int var27 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field886 -= 2;
            int var28 = field898[Statics.field886];
            int var29 = field898[Statics.field886 + 1];
            if (var28 == 0) {
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field886 -= 2;
            int var30 = field898[Statics.field886];
            int var31 = field898[Statics.field886 + 1];
            if (var30 == 0) {
                field898[++Statics.field886 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field898[++Statics.field886 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field898[++Statics.field886 - 1] = var30;
                    break;
                case 2:
                    field898[++Statics.field886 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field898[++Statics.field886 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field898[++Statics.field886 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field898[++Statics.field886 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field886 -= 2;
            int var32 = field898[Statics.field886];
            int var33 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field886 -= 2;
            int var34 = field898[Statics.field886];
            int var35 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field886 -= 2;
            int var36 = field898[Statics.field886];
            int var37 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field886 -= 2;
            int var38 = field898[Statics.field886];
            int var39 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field886 -= 3;
            long var40 = (long) field898[Statics.field886];
            long var42 = (long) field898[Statics.field886 + 1];
            long var44 = (long) field898[Statics.field886 + 2];
            field898[++Statics.field886 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = class320.method5741(field898[--Statics.field886]);
            field898[++Statics.field886 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field886 -= 2;
            int var47 = field898[Statics.field886];
            int var48 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field886 -= 3;
            int var49 = field898[Statics.field886];
            int var50 = field898[Statics.field886 + 1];
            int var51 = field898[Statics.field886 + 2];
            field898[++Statics.field886 - 1] = class320.method2338(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field886 -= 3;
            int var52 = field898[Statics.field886];
            int var53 = field898[Statics.field886 + 1];
            int var54 = field898[Statics.field886 + 2];
            field898[++Statics.field886 - 1] = class320.method1037(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field886 -= 3;
            int var55 = field898[Statics.field886];
            int var56 = field898[Statics.field886 + 1];
            int var57 = field898[Statics.field886 + 2];
            int var58 = 31 - var57;
            field898[++Statics.field886 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field886 -= 4;
            int var59 = field898[Statics.field886];
            int var60 = field898[Statics.field886 + 1];
            int var61 = field898[Statics.field886 + 2];
            int var62 = field898[Statics.field886 + 3];
            int var63 = class320.method1037(var59, var61, var62);
            int var64 = class320.method5454(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field898[++Statics.field886 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field898[Statics.field886 - 1] = class484.method5425(field898[Statics.field886 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field898[Statics.field886 - 1] = class484.method803(field898[Statics.field886 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field886 -= 2;
            int var65 = field898[Statics.field886];
            int var66 = field898[Statics.field886 + 1];
            int var67 = class484.method6935(var65, var66);
            field898[++Statics.field886 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field898[Statics.field886 - 1] = Math.abs(field898[Statics.field886 - 1]);
            return 1;
        } else if (arg0 == 4036) {
            String var68 = field887[--Statics.field437];
            int var69 = -1;
            if (class406.method5371(var68)) {
                var69 = class406.method2922(var68);
            }
            field898[++Statics.field886 - 1] = var69;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gn.bm(ILdc;ZB)I")
    public static int method3157(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field887[--Statics.field437];
            int var4 = field898[--Statics.field886];
            field887[++Statics.field437 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field437 -= 2;
            String var5 = field887[Statics.field437];
            String var6 = field887[Statics.field437 + 1];
            field887[++Statics.field437 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field887[--Statics.field437];
            int var8 = field898[--Statics.field886];
            field887[++Statics.field437 - 1] = var7 + class406.method4512(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field887[--Statics.field437];
            field887[++Statics.field437 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field898[--Statics.field886];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field892.setTime(new Date(var11));
            int var13 = field892.get(5);
            int var14 = field892.get(2);
            int var15 = field892.get(1);
            field887[++Statics.field437 - 1] = var13 + "-" + field893[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field437 -= 2;
            String var16 = field887[Statics.field437];
            String var17 = field887[Statics.field437 + 1];
            if (Statics.field1858.field1158 == null || Statics.field1858.field1158.field3666 == 0) {
                field887[++Statics.field437 - 1] = var16;
            } else {
                field887[++Statics.field437 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field898[--Statics.field886];
            field887[++Statics.field437 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field437 -= 2;
            field898[++Statics.field886 - 1] = Statics.method5448(class407.method6349(field887[Statics.field437], field887[Statics.field437 + 1], Statics.field2689));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field887[--Statics.field437];
            Statics.field886 -= 2;
            int var20 = field898[Statics.field886];
            int var21 = field898[Statics.field886 + 1];
            byte[] var22 = Statics.field122.method6489(var21, 0);
            class413 var23 = new class413(var22);
            field898[++Statics.field886 - 1] = var23.method7182(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field887[--Statics.field437];
            Statics.field886 -= 2;
            int var25 = field898[Statics.field886];
            int var26 = field898[Statics.field886 + 1];
            byte[] var27 = Statics.field122.method6489(var26, 0);
            class413 var28 = new class413(var27);
            field898[++Statics.field886 - 1] = var28.method7157(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field437 -= 2;
            String var29 = field887[Statics.field437];
            String var30 = field887[Statics.field437 + 1];
            if (field898[--Statics.field886] == 1) {
                field887[++Statics.field437 - 1] = var29;
            } else {
                field887[++Statics.field437 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field887[--Statics.field437];
            field887[++Statics.field437 - 1] = class417.method7131(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field887[--Statics.field437];
            int var33 = field898[--Statics.field886];
            field887[++Statics.field437 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = class406.method5372((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = class406.method5374((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = class406.method3068((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = class406.method4207((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field887[--Statics.field437];
            if (var38 == null) {
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field887[--Statics.field437];
            Statics.field886 -= 2;
            int var40 = field898[Statics.field886];
            int var41 = field898[Statics.field886 + 1];
            field887[++Statics.field437 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field887[--Statics.field437];
            StringBuilder var43 = new StringBuilder(var42.length());
            boolean var44 = false;
            for (int var45 = 0; var45 < var42.length(); var45++) {
                char var46 = var42.charAt(var45);
                if (var46 == '<') {
                    var44 = true;
                } else if (var46 == '>') {
                    var44 = false;
                } else if (!var44) {
                    var43.append(var46);
                }
            }
            field887[++Statics.field437 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field887[--Statics.field437];
            int var48 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field437 -= 2;
            String var49 = field887[Statics.field437];
            String var50 = field887[Statics.field437 + 1];
            int var51 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field887[--Statics.field437];
            field887[++Statics.field437 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field437 -= 3;
            String var53 = field887[Statics.field437];
            String var54 = field887[Statics.field437 + 1];
            String var55 = field887[Statics.field437 + 2];
            if (Statics.field1858.field1158 == null) {
                field887[++Statics.field437 - 1] = var55;
                return 1;
            }
            switch(Statics.field1858.field1158.field3665) {
                case 0:
                    field887[++Statics.field437 - 1] = var53;
                    break;
                case 1:
                    field887[++Statics.field437 - 1] = var54;
                    break;
                case 2:
                default:
                    field887[++Statics.field437 - 1] = var55;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ix.bw(ILdc;ZB)I")
    public static int method3907(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field898[--Statics.field886];
            field887[++Statics.field437 - 1] = class205.method6353(var3).field2210;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field886 -= 2;
            int var4 = field898[Statics.field886];
            int var5 = field898[Statics.field886 + 1];
            class205 var6 = class205.method6353(var4);
            if (var5 < 1 || var5 > 5 || var6.field2200[var5 - 1] == null) {
                field887[++Statics.field437 - 1] = "";
            } else {
                field887[++Statics.field437 - 1] = var6.field2200[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field886 -= 2;
            int var7 = field898[Statics.field886];
            int var8 = field898[Statics.field886 + 1];
            class205 var9 = class205.method6353(var7);
            if (var8 < 1 || var8 > 5 || var9.field2204[var8 - 1] == null) {
                field887[++Statics.field437 - 1] = "";
            } else {
                field887[++Statics.field437 - 1] = var9.field2204[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = class205.method6353(var10).field2195;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = class205.method6353(var11).field2194 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field898[--Statics.field886];
            class205 var13 = class205.method6353(var12);
            if (var13.field2218 == -1 && var13.field2217 >= 0) {
                field898[++Statics.field886 - 1] = var13.field2217;
            } else {
                field898[++Statics.field886 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field898[--Statics.field886];
            class205 var15 = class205.method6353(var14);
            if (var15.field2218 >= 0 && var15.field2217 >= 0) {
                field898[++Statics.field886 - 1] = var15.field2217;
            } else {
                field898[++Statics.field886 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = class205.method6353(var16).field2199 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field898[--Statics.field886];
            class205 var18 = class205.method6353(var17);
            if (var18.field2196 == -1 && var18.field2230 >= 0) {
                field898[++Statics.field886 - 1] = var18.field2230;
            } else {
                field898[++Statics.field886 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field898[--Statics.field886];
            class205 var20 = class205.method6353(var19);
            if (var20.field2196 >= 0 && var20.field2230 >= 0) {
                field898[++Statics.field886 - 1] = var20.field2230;
            } else {
                field898[++Statics.field886 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field887[--Statics.field437];
            int var22 = field898[--Statics.field886];
            client.method4566(var21, var22 == 1);
            field898[++Statics.field886 - 1] = Statics.field2292;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field924 == null || Statics.field3147 >= Statics.field2292) {
                field898[++Statics.field886 - 1] = -1;
            } else {
                field898[++Statics.field886 - 1] = Statics.field924[++Statics.field3147 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field3147 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field898[--Statics.field886];
            int var24 = class205.method6353(var23).method3634();
            if (var24 == -1) {
                field898[++Statics.field886 - 1] = var24;
            } else {
                field898[++Statics.field886 - 1] = var24 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var25 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = class205.method6353(var25).field2197;
            return 1;
        } else if (arg0 == 4215) {
            int var26 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = class205.method6353(var26).field2202;
            return 1;
        } else if (arg0 == 4216) {
            int var27 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = class205.method6353(var27).field2219;
            return 1;
        } else if (arg0 == 4217) {
            int var28 = field898[--Statics.field886];
            class205 var29 = class205.method6353(var28);
            field898[++Statics.field886 - 1] = var29.field2211;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hh.bv(ILdc;ZB)I")
    public static int method3542(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field898[++Statics.field886 - 1] = client.field760;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field886 -= 3;
            client.field760 = field898[Statics.field886];
            Statics.field1583 = class553.method3237(field898[Statics.field886 + 1]);
            if (Statics.field1583 == null) {
                Statics.field1583 = class553.field5344;
            }
            client.field761 = field898[Statics.field886 + 2];
            class313 var3 = class313.method5301(class311.field3204, client.field590.field1435);
            var3.field3291.method8574(client.field760);
            var3.field3291.method8574(Statics.field1583.field5343);
            var3.field3291.method8574(client.field761);
            client.field590.method2741(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field887[--Statics.field437];
            Statics.field886 -= 2;
            int var5 = field898[Statics.field886];
            int var6 = field898[Statics.field886 + 1];
            class313 var7 = class313.method5301(class311.field3190, client.field590.field1435);
            var7.field3291.method8574(class534.method3043(var4) + 2);
            var7.field3291.method8581(var4);
            var7.field3291.method8574(var5 - 1);
            var7.field3291.method8574(var6);
            client.field590.method2741(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field886 -= 2;
            int var8 = field898[Statics.field886];
            int var9 = field898[Statics.field886 + 1];
            class65 var10 = class112.method2639(var8, var9);
            if (var10 == null) {
                field898[++Statics.field886 - 1] = -1;
                field898[++Statics.field886 - 1] = 0;
                field887[++Statics.field437 - 1] = "";
                field887[++Statics.field437 - 1] = "";
                field887[++Statics.field437 - 1] = "";
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = var10.field483;
                field898[++Statics.field886 - 1] = var10.field477;
                field887[++Statics.field437 - 1] = var10.field480 == null ? "" : var10.field480;
                field887[++Statics.field437 - 1] = var10.field484 == null ? "" : var10.field484;
                field887[++Statics.field437 - 1] = var10.field485 == null ? "" : var10.field485;
                field898[++Statics.field886 - 1] = var10.method1093() ? 1 : (var10.method1090() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field898[--Statics.field886];
            class65 var12 = class112.method1716(var11);
            if (var12 == null) {
                field898[++Statics.field886 - 1] = -1;
                field898[++Statics.field886 - 1] = 0;
                field887[++Statics.field437 - 1] = "";
                field887[++Statics.field437 - 1] = "";
                field887[++Statics.field437 - 1] = "";
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = var12.field479;
                field898[++Statics.field886 - 1] = var12.field477;
                field887[++Statics.field437 - 1] = var12.field480 == null ? "" : var12.field480;
                field887[++Statics.field437 - 1] = var12.field484 == null ? "" : var12.field484;
                field887[++Statics.field437 - 1] = var12.field485 == null ? "" : var12.field485;
                field898[++Statics.field886 - 1] = var12.method1093() ? 1 : (var12.method1090() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field1583 == null) {
                field898[++Statics.field886 - 1] = -1;
            } else {
                field898[++Statics.field886 - 1] = Statics.field1583.field5343;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field887[--Statics.field437];
            int var14 = field898[--Statics.field886];
            class313 var15 = class558.method8349(var14, var13, Statics.field2689, -1);
            client.field590.method2741(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field437 -= 2;
            String var16 = field887[Statics.field437];
            String var17 = field887[Statics.field437 + 1];
            class313 var18 = class313.method5301(class311.field3243, client.field590.field1435);
            var18.field3291.method8575(0);
            int var19 = var18.field3291.field5200;
            var18.field3291.method8581(var16);
            class357.method3870(var18.field3291, var17);
            var18.field3291.method8690(var18.field3291.field5200 - var19);
            client.field590.method2741(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field887[--Statics.field437];
            Statics.field886 -= 2;
            int var21 = field898[Statics.field886];
            int var22 = field898[Statics.field886 + 1];
            class313 var23 = class558.method8349(var21, var20, Statics.field2689, var22);
            client.field590.method2741(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field1858 == null || Statics.field1858.field1162 == null) {
                var24 = "";
            } else {
                var24 = Statics.field1858.field1162.method9185();
            }
            field887[++Statics.field437 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field898[++Statics.field886 - 1] = client.field761;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = class112.method5456(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = Statics.method2817(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = class112.method394(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field887[--Statics.field437];
            client.method2553(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field644 = field887[--Statics.field437].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field887[++Statics.field437 - 1] = client.field644;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field887[--Statics.field437];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field886 -= 2;
            int var30 = field898[Statics.field886];
            int var31 = field898[Statics.field886 + 1];
            class65 var32 = class112.method2639(var30, var31);
            if (var32 == null) {
                field898[++Statics.field886 - 1] = -1;
                field898[++Statics.field886 - 1] = 0;
                field887[++Statics.field437 - 1] = "";
                field887[++Statics.field437 - 1] = "";
                field887[++Statics.field437 - 1] = "";
                field898[++Statics.field886 - 1] = 0;
                field887[++Statics.field437 - 1] = "";
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = var32.field483;
                field898[++Statics.field886 - 1] = var32.field477;
                field887[++Statics.field437 - 1] = var32.field480 == null ? "" : var32.field480;
                field887[++Statics.field437 - 1] = var32.field484 == null ? "" : var32.field484;
                field887[++Statics.field437 - 1] = var32.field485 == null ? "" : var32.field485;
                field898[++Statics.field886 - 1] = var32.method1093() ? 1 : (var32.method1090() ? 2 : 0);
                field887[++Statics.field437 - 1] = "";
                field898[++Statics.field886 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field898[--Statics.field886];
            class65 var34 = class112.method1716(var33);
            if (var34 == null) {
                field898[++Statics.field886 - 1] = -1;
                field898[++Statics.field886 - 1] = 0;
                field887[++Statics.field437 - 1] = "";
                field887[++Statics.field437 - 1] = "";
                field887[++Statics.field437 - 1] = "";
                field898[++Statics.field886 - 1] = 0;
                field887[++Statics.field437 - 1] = "";
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = var34.field479;
                field898[++Statics.field886 - 1] = var34.field477;
                field887[++Statics.field437 - 1] = var34.field480 == null ? "" : var34.field480;
                field887[++Statics.field437 - 1] = var34.field484 == null ? "" : var34.field484;
                field887[++Statics.field437 - 1] = var34.field485 == null ? "" : var34.field485;
                field898[++Statics.field886 - 1] = var34.method1093() ? 1 : (var34.method1090() ? 2 : 0);
                field887[++Statics.field437 - 1] = "";
                field898[++Statics.field886 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kd.by(ILdc;ZI)I")
    public static int method5136(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field898[++Statics.field886 - 1] = client.method7585();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field898[--Statics.field886];
            if (var3 == 1 || var3 == 2) {
                client.method3718(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field898[++Statics.field886 - 1] = Statics.field156.method2436();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field898[--Statics.field886];
            if (var4 == 1 || var4 == 2) {
                Statics.field156.method2435(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field886--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cv.bb(ILdc;ZI)I")
    public static int method1137(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field886 -= 2;
            int var3 = field898[Statics.field886];
            int var4 = field898[Statics.field886 + 1];
            if (!client.field743) {
                client.field612 = var3;
                client.field541 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field898[++Statics.field886 - 1] = client.field612;
            return 1;
        } else if (arg0 == 5506) {
            field898[++Statics.field886 - 1] = client.field541;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field898[--Statics.field886];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field604 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field898[++Statics.field886 - 1] = client.field604;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.bn(ILdc;ZB)I")
    public static int method93(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field591 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ku.br(II)I")
    public static int method4885(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("ot.bp(IB)I")
    public static int method6543(int arg0) {
        return (int) ((Math.log((double) arg0) / field891 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("di.bf(ILdc;ZI)I")
    public static int method2325(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field886 -= 2;
            client.field725 = (short) method4885(field898[Statics.field886]);
            if (client.field725 <= 0) {
                client.field725 = 256;
            }
            client.field804 = (short) method4885(field898[Statics.field886 + 1]);
            if (client.field804 <= 0) {
                client.field804 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field886 -= 2;
            client.field805 = (short) field898[Statics.field886];
            if (client.field805 <= 0) {
                client.field805 = 256;
            }
            client.field806 = (short) field898[Statics.field886 + 1];
            if (client.field806 <= 0) {
                client.field806 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field886 -= 4;
            client.field807 = (short) field898[Statics.field886];
            if (client.field807 <= 0) {
                client.field807 = 1;
            }
            client.field808 = (short) field898[Statics.field886 + 1];
            if (client.field808 <= 0) {
                client.field808 = 32767;
            } else if (client.field808 < client.field807) {
                client.field808 = client.field807;
            }
            client.field723 = (short) field898[Statics.field886 + 2];
            if (client.field723 <= 0) {
                client.field723 = 1;
            }
            client.field810 = (short) field898[Statics.field886 + 3];
            if (client.field810 <= 0) {
                client.field810 = 32767;
            } else if (client.field810 < client.field723) {
                client.field810 = client.field723;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field710 == null) {
                field898[++Statics.field886 - 1] = -1;
                field898[++Statics.field886 - 1] = -1;
            } else {
                client.method3047(0, 0, client.field710.field3741, client.field710.field3742, false);
                field898[++Statics.field886 - 1] = client.field813;
                field898[++Statics.field886 - 1] = client.field656;
            }
            return 1;
        } else if (arg0 == 6204) {
            field898[++Statics.field886 - 1] = client.field805;
            field898[++Statics.field886 - 1] = client.field806;
            return 1;
        } else if (arg0 == 6205) {
            field898[++Statics.field886 - 1] = method6543(client.field725);
            field898[++Statics.field886 - 1] = method6543(client.field804);
            return 1;
        } else if (arg0 == 6220) {
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field898[++Statics.field886 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field898[++Statics.field886 - 1] = Statics.field199;
            return 1;
        } else if (arg0 == 6223) {
            field898[++Statics.field886 - 1] = Statics.field2531;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hg.bg(ILdc;ZI)I")
    public static int method3333(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field898[++Statics.field886 - 1] = class69.method3898() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class69 var3 = class69.method2927();
            if (var3 == null) {
                field898[++Statics.field886 - 1] = -1;
                field898[++Statics.field886 - 1] = 0;
                field887[++Statics.field437 - 1] = "";
                field898[++Statics.field886 - 1] = 0;
                field898[++Statics.field886 - 1] = 0;
                field887[++Statics.field437 - 1] = "";
            } else {
                field898[++Statics.field886 - 1] = var3.field837;
                field898[++Statics.field886 - 1] = var3.field852;
                field887[++Statics.field437 - 1] = var3.field839;
                field898[++Statics.field886 - 1] = var3.field849;
                field898[++Statics.field886 - 1] = var3.field846;
                field887[++Statics.field437 - 1] = var3.field850;
            }
            return 1;
        } else if (arg0 == 6502) {
            class69 var4 = class69.method2812();
            if (var4 == null) {
                field898[++Statics.field886 - 1] = -1;
                field898[++Statics.field886 - 1] = 0;
                field887[++Statics.field437 - 1] = "";
                field898[++Statics.field886 - 1] = 0;
                field898[++Statics.field886 - 1] = 0;
                field887[++Statics.field437 - 1] = "";
            } else {
                field898[++Statics.field886 - 1] = var4.field837;
                field898[++Statics.field886 - 1] = var4.field852;
                field887[++Statics.field437 - 1] = var4.field839;
                field898[++Statics.field886 - 1] = var4.field849;
                field898[++Statics.field886 - 1] = var4.field846;
                field887[++Statics.field437 - 1] = var4.field850;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field898[--Statics.field886];
            class69 var6 = null;
            for (int var7 = 0; var7 < class69.field840; var7++) {
                if (Statics.field2661[var7].field837 == var5) {
                    var6 = Statics.field2661[var7];
                    break;
                }
            }
            if (var6 == null) {
                field898[++Statics.field886 - 1] = -1;
                field898[++Statics.field886 - 1] = 0;
                field887[++Statics.field437 - 1] = "";
                field898[++Statics.field886 - 1] = 0;
                field898[++Statics.field886 - 1] = 0;
                field887[++Statics.field437 - 1] = "";
            } else {
                field898[++Statics.field886 - 1] = var6.field837;
                field898[++Statics.field886 - 1] = var6.field852;
                field887[++Statics.field437 - 1] = var6.field839;
                field898[++Statics.field886 - 1] = var6.field849;
                field898[++Statics.field886 - 1] = var6.field846;
                field887[++Statics.field437 - 1] = var6.field850;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field886 -= 4;
            int var8 = field898[Statics.field886];
            boolean var9 = field898[Statics.field886 + 1] == 1;
            int var10 = field898[Statics.field886 + 2];
            boolean var11 = field898[Statics.field886 + 3] == 1;
            class69.method14(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field898[--Statics.field886];
            if (var12 >= 0 && var12 < class69.field840) {
                class69 var13 = Statics.field2661[var12];
                field898[++Statics.field886 - 1] = var13.field837;
                field898[++Statics.field886 - 1] = var13.field852;
                field887[++Statics.field437 - 1] = var13.field839;
                field898[++Statics.field886 - 1] = var13.field849;
                field898[++Statics.field886 - 1] = var13.field846;
                field887[++Statics.field437 - 1] = var13.field850;
            } else {
                field898[++Statics.field886 - 1] = -1;
                field898[++Statics.field886 - 1] = 0;
                field887[++Statics.field437 - 1] = "";
                field898[++Statics.field886 - 1] = 0;
                field898[++Statics.field886 - 1] = 0;
                field887[++Statics.field437 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field685 = field898[--Statics.field886] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field886 -= 2;
            int var14 = field898[Statics.field886];
            int var15 = field898[Statics.field886 + 1];
            class200 var16 = class200.method2797(var15);
            if (var16.method3507()) {
                field887[++Statics.field437 - 1] = class190.method3274(var14).method3378(var15, var16.field2075);
            } else {
                field898[++Statics.field886 - 1] = class190.method3274(var14).method3377(var15, var16.field2078);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field886 -= 2;
            int var17 = field898[Statics.field886];
            int var18 = field898[Statics.field886 + 1];
            class200 var19 = class200.method2797(var18);
            if (var19.method3507()) {
                field887[++Statics.field437 - 1] = class204.method2849(var17).method3624(var18, var19.field2075);
            } else {
                field898[++Statics.field886 - 1] = class204.method2849(var17).method3616(var18, var19.field2078);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field886 -= 2;
            int var20 = field898[Statics.field886];
            int var21 = field898[Statics.field886 + 1];
            class200 var22 = class200.method2797(var21);
            if (var22.method3507()) {
                field887[++Statics.field437 - 1] = class205.method6353(var20).method3692(var21, var22.field2075);
            } else {
                field898[++Statics.field886 - 1] = class205.method6353(var20).method3647(var21, var22.field2078);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field886 -= 2;
            int var23 = field898[Statics.field886];
            int var24 = field898[Statics.field886 + 1];
            class200 var25 = class200.method2797(var24);
            if (var25.method3507()) {
                field887[++Statics.field437 - 1] = class201.method3041(var23).method3539(var24, var25.field2075);
            } else {
                field898[++Statics.field886 - 1] = class201.method3041(var23).method3533(var24, var25.field2078);
            }
            return 1;
        } else if (arg0 == 6518) {
            field898[++Statics.field886 - 1] = client.field530 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field898[++Statics.field886 - 1] = client.field528;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field437--;
            Statics.field886--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field437--;
            Statics.field886--;
            return 1;
        } else if (arg0 == 6524) {
            field898[++Statics.field886 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field898[++Statics.field886 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field898[++Statics.field886 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field898[++Statics.field886 - 1] = client.field529;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ji.be(ILdc;ZB)I")
    public static int method4202(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field4873;
            int var4 = (Statics.field1858.field1208 >> 7) + Statics.field1011;
            int var5 = (Statics.field1858.field1253 >> 7) + Statics.field216;
            client.method7974().method8069(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field898[--Statics.field886];
            String var7 = "";
            class242 var8 = client.method7974().method8186(var6);
            if (var8 != null) {
                var7 = var8.method4268();
            }
            field887[++Statics.field437 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field898[--Statics.field886];
            client.method7974().method8070(var9);
            return 1;
        } else if (arg0 == 6603) {
            field898[++Statics.field886 - 1] = client.method7974().method8162();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field898[--Statics.field886];
            client.method7974().method8148(var10);
            return 1;
        } else if (arg0 == 6605) {
            field898[++Statics.field886 - 1] = client.method7974().method8087() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class339 var11 = new class339(field898[--Statics.field886]);
            client.method7974().method8089(var11.field3622, var11.field3624);
            return 1;
        } else if (arg0 == 6607) {
            class339 var12 = new class339(field898[--Statics.field886]);
            client.method7974().method8090(var12.field3622, var12.field3624);
            return 1;
        } else if (arg0 == 6608) {
            class339 var13 = new class339(field898[--Statics.field886]);
            client.method7974().method8091(var13.field3623, var13.field3622, var13.field3624);
            return 1;
        } else if (arg0 == 6609) {
            class339 var14 = new class339(field898[--Statics.field886]);
            client.method7974().method8092(var14.field3623, var14.field3622, var14.field3624);
            return 1;
        } else if (arg0 == 6610) {
            field898[++Statics.field886 - 1] = client.method7974().method8093();
            field898[++Statics.field886 - 1] = client.method7974().method8094();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field898[--Statics.field886];
            class242 var16 = client.method7974().method8186(var15);
            if (var16 == null) {
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = var16.method4279().method5759();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field898[--Statics.field886];
            class242 var18 = client.method7974().method8186(var17);
            if (var18 == null) {
                field898[++Statics.field886 - 1] = 0;
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = (var18.method4280() - var18.method4288() + 1) * 64;
                field898[++Statics.field886 - 1] = (var18.method4275() - var18.method4283() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field898[--Statics.field886];
            class242 var20 = client.method7974().method8186(var19);
            if (var20 == null) {
                field898[++Statics.field886 - 1] = 0;
                field898[++Statics.field886 - 1] = 0;
                field898[++Statics.field886 - 1] = 0;
                field898[++Statics.field886 - 1] = 0;
            } else {
                field898[++Statics.field886 - 1] = var20.method4288() * 64;
                field898[++Statics.field886 - 1] = var20.method4283() * 64;
                field898[++Statics.field886 - 1] = var20.method4280() * 64 + 64 - 1;
                field898[++Statics.field886 - 1] = var20.method4275() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field898[--Statics.field886];
            class242 var22 = client.method7974().method8186(var21);
            if (var22 == null) {
                field898[++Statics.field886 - 1] = -1;
            } else {
                field898[++Statics.field886 - 1] = var22.method4321();
            }
            return 1;
        } else if (arg0 == 6615) {
            class339 var23 = client.method7974().method8095();
            if (var23 == null) {
                field898[++Statics.field886 - 1] = -1;
                field898[++Statics.field886 - 1] = -1;
            } else {
                field898[++Statics.field886 - 1] = var23.field3622;
                field898[++Statics.field886 - 1] = var23.field3624;
            }
            return 1;
        } else if (arg0 == 6616) {
            field898[++Statics.field886 - 1] = client.method7974().method8074();
            return 1;
        } else if (arg0 == 6617) {
            class339 var24 = new class339(field898[--Statics.field886]);
            class242 var25 = client.method7974().method8139();
            if (var25 == null) {
                field898[++Statics.field886 - 1] = -1;
                field898[++Statics.field886 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4271(var24.field3623, var24.field3622, var24.field3624);
            if (var26 == null) {
                field898[++Statics.field886 - 1] = -1;
                field898[++Statics.field886 - 1] = -1;
            } else {
                field898[++Statics.field886 - 1] = var26[0];
                field898[++Statics.field886 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class339 var27 = new class339(field898[--Statics.field886]);
            class242 var28 = client.method7974().method8139();
            if (var28 == null) {
                field898[++Statics.field886 - 1] = -1;
                field898[++Statics.field886 - 1] = -1;
                return 1;
            }
            class339 var29 = var28.method4263(var27.field3622, var27.field3624);
            if (var29 == null) {
                field898[++Statics.field886 - 1] = -1;
            } else {
                field898[++Statics.field886 - 1] = var29.method5759();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field886 -= 2;
            int var30 = field898[Statics.field886];
            class339 var31 = new class339(field898[Statics.field886 + 1]);
            method3585(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field886 -= 2;
            int var32 = field898[Statics.field886];
            class339 var33 = new class339(field898[Statics.field886 + 1]);
            method3585(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field886 -= 2;
            int var34 = field898[Statics.field886];
            class339 var35 = new class339(field898[Statics.field886 + 1]);
            class242 var36 = client.method7974().method8186(var34);
            if (var36 == null) {
                field898[++Statics.field886 - 1] = 0;
                return 1;
            } else {
                field898[++Statics.field886 - 1] = var36.method4260(var35.field3623, var35.field3622, var35.field3624) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field898[++Statics.field886 - 1] = client.method7974().method8096();
            field898[++Statics.field886 - 1] = client.method7974().method8097();
            return 1;
        } else if (arg0 == 6623) {
            class339 var37 = new class339(field898[--Statics.field886]);
            class242 var38 = client.method7974().method8068(var37.field3623, var37.field3622, var37.field3624);
            if (var38 == null) {
                field898[++Statics.field886 - 1] = -1;
            } else {
                field898[++Statics.field886 - 1] = var38.method4265();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method7974().method8098(field898[--Statics.field886]);
            return 1;
        } else if (arg0 == 6625) {
            client.method7974().method8151();
            return 1;
        } else if (arg0 == 6626) {
            client.method7974().method8100(field898[--Statics.field886]);
            return 1;
        } else if (arg0 == 6627) {
            client.method7974().method8101();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field898[--Statics.field886] == 1;
            client.method7974().method8102(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field898[--Statics.field886];
            client.method7974().method8057(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field898[--Statics.field886];
            client.method7974().method8254(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method7974().method8105();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field898[--Statics.field886] == 1;
            client.method7974().method8106(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field886 -= 2;
            int var43 = field898[Statics.field886];
            boolean var44 = field898[Statics.field886 + 1] == 1;
            client.method7974().method8210(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field886 -= 2;
            int var45 = field898[Statics.field886];
            boolean var46 = field898[Statics.field886 + 1] == 1;
            client.method7974().method8108(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field898[++Statics.field886 - 1] = client.method7974().method8109() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = client.method7974().method8110(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field898[--Statics.field886];
            field898[++Statics.field886 - 1] = client.method7974().method8212(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field886 -= 2;
            int var49 = field898[Statics.field886];
            class339 var50 = new class339(field898[Statics.field886 + 1]);
            class339 var51 = client.method7974().method8114(var49, var50);
            if (var51 == null) {
                field898[++Statics.field886 - 1] = -1;
            } else {
                field898[++Statics.field886 - 1] = var51.method5759();
            }
            return 1;
        } else if (arg0 == 6639) {
            class260 var52 = client.method7974().method8116();
            if (var52 == null) {
                field898[++Statics.field886 - 1] = -1;
                field898[++Statics.field886 - 1] = -1;
            } else {
                field898[++Statics.field886 - 1] = var52.method4218();
                field898[++Statics.field886 - 1] = var52.field2677.method5759();
            }
            return 1;
        } else if (arg0 == 6640) {
            class260 var53 = client.method7974().method8117();
            if (var53 == null) {
                field898[++Statics.field886 - 1] = -1;
                field898[++Statics.field886 - 1] = -1;
            } else {
                field898[++Statics.field886 - 1] = var53.method4218();
                field898[++Statics.field886 - 1] = var53.field2677.method5759();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field898[--Statics.field886];
            class179 var55 = class179.method2995(var54);
            if (var55.field1873 == null) {
                field887[++Statics.field437 - 1] = "";
            } else {
                field887[++Statics.field437 - 1] = var55.field1873;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field898[--Statics.field886];
            class179 var57 = class179.method2995(var56);
            field898[++Statics.field886 - 1] = var57.field1886;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field898[--Statics.field886];
            class179 var59 = class179.method2995(var58);
            if (var59 == null) {
                field898[++Statics.field886 - 1] = -1;
            } else {
                field898[++Statics.field886 - 1] = var59.field1867;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field898[--Statics.field886];
            class179 var61 = class179.method2995(var60);
            if (var61 == null) {
                field898[++Statics.field886 - 1] = -1;
            } else {
                field898[++Statics.field886 - 1] = var61.field1871;
            }
            return 1;
        } else if (arg0 == 6697) {
            field898[++Statics.field886 - 1] = Statics.field4642.field2698;
            return 1;
        } else if (arg0 == 6698) {
            field898[++Statics.field886 - 1] = Statics.field4642.field2699.method5759();
            return 1;
        } else if (arg0 == 6699) {
            field898[++Statics.field886 - 1] = Statics.field4642.field2700.method5759();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cf.bc(ILdc;ZI)I")
    public static int method2105(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field898[--Statics.field886];
            class190 var4 = class190.method3274(var3);
            field887[++Statics.field437 - 1] = var4 == null ? "" : var4.field1969;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field886 -= 2;
            class190 var5 = class190.method3274(field898[Statics.field886]);
            int var6 = field898[Statics.field886 + 1];
            field898[++Statics.field886 - 1] = var5.method3374(var6);
            field898[++Statics.field886 - 1] = var5.method3383(var6);
            return 1;
        } else if (arg0 == 6765) {
            class190 var7 = class190.method3274(field898[--Statics.field886]);
            field898[++Statics.field886 - 1] = var7 == null ? 0 : var7.field1994;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kt.bz(ILdc;ZI)I")
    public static int method5088(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field898[--Statics.field886];
            class204 var4 = class204.method2849(var3);
            field887[++Statics.field437 - 1] = var4 == null ? "" : var4.field2139;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("en.bh(ILdc;ZI)I")
    public static int method2836(int arg0, class80 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("jc.bs(ILdc;ZI)I")
    public static int method4565(int arg0, class80 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ar.bj(ILdc;ZI)I")
    public static int method18(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field898[++Statics.field886 - 1] = client.method7890() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hf.bl(ILdc;ZB)I")
    public static int method3719(int arg0, class80 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ah.bx(ILdc;ZI)I")
    public static int method95(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field898[--Statics.field886] == 1;
            client.method3146(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bf.cs(ILdc;ZI)I")
    public static int method763(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field898[--Statics.field886];
            Object var45 = method5502(var44);
            int var46 = field898[--Statics.field886];
            class526 var47 = client.method5370(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class528.method3193(var46);
            Statics.field1848 = var47.method8492(var45, var48);
            if (Statics.field1848 == null) {
                client.field825 = -1;
                Statics.field4676 = null;
                if (arg0 == 7500) {
                    field898[++Statics.field886 - 1] = 0;
                }
            } else {
                client.field825 = class528.method2964(var46);
                Statics.field4676 = Statics.field1848.iterator();
                if (arg0 == 7500) {
                    field898[++Statics.field886 - 1] = Statics.field1848.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field4676 != null && Statics.field4676.hasNext()) {
                field898[++Statics.field886 - 1] = (Integer) Statics.field4676.next();
            } else {
                field898[++Statics.field886 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field886 -= 3;
            int var3 = field898[Statics.field886];
            int var4 = field898[Statics.field886 + 1];
            int var5 = field898[Statics.field886 + 2];
            int var6 = class528.method2964(var4);
            int var7 = class528.method4037(var4);
            int var8 = class528.method3193(var4);
            class527 var9 = class527.method7272(var3);
            class525 var10 = class525.method4633(var6);
            int[] var11 = var10.field5141[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method8507(var7);
            if (var14 == null && var10.field5140 != null) {
                var14 = var10.field5140[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class522 var17 = class520.method5378(var16);
                    if (class522.field5127 == var17) {
                        field887[++Statics.field437 - 1] = "";
                    } else {
                        field898[++Statics.field886 - 1] = class520.method6575(var16);
                    }
                }
                return 1;
            }
            int var18 = var14.length / var11.length;
            if (var5 < 0 || var5 >= var18) {
                throw new RuntimeException();
            }
            for (int var19 = var12; var19 < var13; var19++) {
                int var20 = var11.length * var5 + var19;
                class522 var21 = class520.method5378(var11[var19]);
                if (class522.field5127 == var21) {
                    field887[++Statics.field437 - 1] = (String) var14[var20];
                } else {
                    field898[++Statics.field886 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field886 -= 2;
            int var22 = field898[Statics.field886];
            int var23 = field898[Statics.field886 + 1];
            int var24 = 0;
            int var25 = class528.method2964(var23);
            int var26 = class528.method4037(var23);
            class527 var27 = class527.method7272(var22);
            class525 var28 = class525.method4633(var25);
            int[] var29 = var28.field5141[var26];
            Object[] var30 = var27.method8507(var26);
            if (var30 == null && var28.field5140 != null) {
                var30 = var28.field5140[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field898[++Statics.field886 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field886--;
            int var41 = field898[Statics.field886];
            class526 var42 = client.method7271(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field1848 = var42.method8492(0, 0);
            int var43 = 0;
            if (Statics.field1848 != null) {
                client.field825 = var41;
                Statics.field4676 = Statics.field1848.iterator();
                var43 = Statics.field1848.size();
            }
            if (arg0 == 7504) {
                field898[++Statics.field886 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field898[--Statics.field886];
            class527 var32 = class527.method7272(var31);
            field898[++Statics.field886 - 1] = var32.field5151;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field898[--Statics.field886];
            int var34 = -1;
            if (Statics.field1848 != null && var33 >= 0 && var33 < Statics.field1848.size()) {
                var34 = (Integer) Statics.field1848.get(var33);
            }
            field898[++Statics.field886 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field898[--Statics.field886];
            Object var36 = method5502(var35);
            int var37 = field898[--Statics.field886];
            class526 var38 = client.method5370(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class528.method2964(var37) != client.field825) {
                throw new RuntimeException();
            } else if (Statics.field1848 == null && Statics.field1848.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class528.method3193(var37);
                List var40 = var38.method8492(var36, var39);
                Statics.field1848 = new LinkedList(Statics.field1848);
                if (var40 == null) {
                    Statics.field1848.clear();
                } else {
                    Statics.field1848.retainAll(var40);
                }
                Statics.field4676 = Statics.field1848.iterator();
                if (arg0 == 7507) {
                    field898[++Statics.field886 - 1] = Statics.field1848.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.ch(ILdc;ZI)I")
    public static int method1438(int arg0, class80 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("iz.co(ILdc;ZI)I")
    public static int method4099(int arg0, class80 arg1, boolean arg2) {
        if (arg0 == 8000) {
            Statics.field886--;
            int var3 = field898[Statics.field886];
            int var4 = field883[var3];
            class529.method2262(field884[var3], new int[var4], 0, var4 - 1);
            return 1;
        } else if (arg0 == 8001) {
            Statics.field886 -= 3;
            int var5 = field898[Statics.field886];
            int var6 = field898[Statics.field886 + 1];
            int var7 = field898[Statics.field886 + 2];
            int var8 = field883[var5];
            if (var8 <= 1) {
                return 1;
            } else {
                class429.method7311(field884[var5], var8, var6, var7);
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ra.cd(IB)V")
    public static void method7565(int arg0) {
        if (arg0 == -1 || !Statics.field1071.method5783(arg0)) {
            return;
        }
        class350[] var1 = Statics.field1071.field3634[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class350 var3 = var1[var2];
            if (var3.field3814 != null) {
                class89 var4 = new class89();
                var4.field1095 = var3;
                var4.field1106 = var3.field3814;
                method7290(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("hy.cg(ILns;ZI)V")
    public static void method3585(int arg0, class339 arg1, boolean arg2) {
        class242 var3 = client.method7974().method8186(arg0);
        int var4 = Statics.field1858.field1156;
        int var5 = (Statics.field1858.field1208 >> 7) + Statics.field1011;
        int var6 = (Statics.field1858.field1253 >> 7) + Statics.field216;
        class339 var7 = new class339(var4, var5, var6);
        client.method7974().method8083(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("mb.cn(Luh;B)Ljava/lang/Object;")
    public static Object method5461(class522 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field5128) {
            case 0:
                return field887[--Statics.field437];
            case 1:
                return field898[--Statics.field886];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("mm.cz(IS)Ljava/lang/Object;")
    public static Object method5502(int arg0) {
        return method5461((class522) class392.method6317(class522.method8464(), arg0));
    }
}
