package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ax")
public class class39 {

    @ObfuscatedName("ax.v")
    public static int[] field812 = new int[5];

    @ObfuscatedName("ax.j")
    public static int[][] field824 = new int[5][5000];

    @ObfuscatedName("ax.m")
    public static int[] field813 = new int[1000];

    @ObfuscatedName("ax.y")
    public static String[] field815 = new String[1000];

    @ObfuscatedName("ax.u")
    public static int field816 = 0;

    @ObfuscatedName("ax.h")
    public static class15[] field817 = new class15[50];

    @ObfuscatedName("ax.g")
    public static Calendar field818 = Calendar.getInstance();

    @ObfuscatedName("ax.e")
    public static final String[] field819 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ax.p")
    public static int field811 = 0;

    public class39() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.k(Lk;I)V")
    public static void method1566(class1 arg0) {
        method2029(arg0, 200000);
    }

    @ObfuscatedName("cd.q(Lk;IB)V")
    public static void method2029(class1 arg0, int arg1) {
        Object[] var2 = arg0.field1;
        int var3 = (Integer) var2[0];
        class24 var4 = class24.method700(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field598;
        int[] var9 = var4.field592;
        byte var10 = -1;
        field816 = 0;
        try {
            Statics.field820 = new int[var4.field594];
            int var11 = 0;
            Statics.field3183 = new String[var4.field590];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field11;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field12 == null ? -1 : arg0.field12.field2896;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field3;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field12 == null ? -1 : arg0.field12.field2800;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2896;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2800;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field820[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field3183[var12++] = var15;
                }
            }
            int var16 = 0;
            field811 = arg0.field6;
            label3428: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var526 = var8[var7];
                if (var526 < 100) {
                    if (var526 == 0) {
                        field813[var5++] = var9[var7];
                        continue;
                    }
                    if (var526 == 1) {
                        int var17 = var9[var7];
                        field813[var5++] = class180.field2953[var17];
                        continue;
                    }
                    if (var526 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class180.field2953[var18] = field813[var5];
                        client.method115(var18);
                        continue;
                    }
                    if (var526 == 3) {
                        field815[var6++] = var4.field593[var7];
                        continue;
                    }
                    if (var526 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var526 == 7) {
                        var5 -= 2;
                        if (field813[var5 + 1] != field813[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var526 == 8) {
                        var5 -= 2;
                        if (field813[var5 + 1] == field813[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var526 == 9) {
                        var5 -= 2;
                        if (field813[var5] < field813[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var526 == 10) {
                        var5 -= 2;
                        if (field813[var5] > field813[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var526 == 21) {
                        if (field816 == 0) {
                            return;
                        }
                        class15 var19 = field817[--field816];
                        var4 = var19.field208;
                        var8 = var4.field598;
                        var9 = var4.field592;
                        var7 = var19.field212;
                        Statics.field820 = var19.field205;
                        Statics.field3183 = var19.field211;
                        continue;
                    }
                    if (var526 == 25) {
                        int var20 = var9[var7];
                        field813[var5++] = class180.method3744(var20);
                        continue;
                    }
                    if (var526 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class180.method980(var21, field813[var5]);
                        continue;
                    }
                    if (var526 == 31) {
                        var5 -= 2;
                        if (field813[var5] <= field813[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var526 == 32) {
                        var5 -= 2;
                        if (field813[var5] >= field813[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var526 == 33) {
                        field813[var5++] = Statics.field820[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var526 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field820[var10001] = field813[var5];
                        continue;
                    }
                    if (var526 == 35) {
                        field815[var6++] = Statics.field3183[var9[var7]];
                        continue;
                    }
                    if (var526 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field3183[var10001] = field815[var6];
                        continue;
                    }
                    if (var526 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field815;
                        String var24;
                        if (var22 == 0) {
                            var24 = "";
                        } else if (var22 == 1) {
                            String var25 = var23[var6];
                            if (var25 == null) {
                                var24 = "null";
                            } else {
                                var24 = var25.toString();
                            }
                        } else {
                            int var26 = var6 + var22;
                            int var27 = 0;
                            for (int var28 = var6; var28 < var26; var28++) {
                                String var29 = var23[var28];
                                if (var29 == null) {
                                    var27 += 4;
                                } else {
                                    var27 += var29.length();
                                }
                            }
                            StringBuilder var30 = new StringBuilder(var27);
                            for (int var31 = var6; var31 < var26; var31++) {
                                String var32 = var23[var31];
                                if (var32 == null) {
                                    var30.append("null");
                                } else {
                                    var30.append(var32);
                                }
                            }
                            var24 = var30.toString();
                        }
                        field815[var6++] = var24;
                        continue;
                    }
                    if (var526 == 38) {
                        var5--;
                        continue;
                    }
                    if (var526 == 39) {
                        var6--;
                        continue;
                    }
                    if (var526 == 40) {
                        int var34 = var9[var7];
                        class24 var35 = class24.method700(var34);
                        int[] var36 = new int[var35.field594];
                        String[] var37 = new String[var35.field590];
                        for (int var38 = 0; var38 < var35.field601; var38++) {
                            var36[var38] = field813[var5 - var35.field601 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field597; var39++) {
                            var37[var39] = field815[var6 - var35.field597 + var39];
                        }
                        var5 -= var35.field601;
                        var6 -= var35.field597;
                        class15 var40 = new class15();
                        var40.field208 = var4;
                        var40.field212 = var7;
                        var40.field205 = Statics.field820;
                        var40.field211 = Statics.field3183;
                        field817[++field816 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field598;
                        var9 = var35.field592;
                        var7 = -1;
                        Statics.field820 = var36;
                        Statics.field3183 = var37;
                        continue;
                    }
                    if (var526 == 42) {
                        field813[var5++] = Statics.field1112.method190(var9[var7]);
                        continue;
                    }
                    if (var526 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1112.method181(var10001, field813[var5]);
                        continue;
                    }
                    if (var526 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field813[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field812[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label3428;
                                }
                                field824[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var526 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field813[var5];
                        if (var47 >= 0 && var47 < field812[var46]) {
                            field813[var5++] = field824[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var526 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field813[var5];
                        if (var49 >= 0 && var49 < field812[var48]) {
                            field824[var48][var49] = field813[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var526 == 47) {
                        String var50 = Statics.field1112.method184(var9[var7]);
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field815[var6++] = var50;
                        continue;
                    }
                    if (var526 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1112.method183(var10001, field815[var6]);
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var526 < 1000) {
                    if (var526 == 100) {
                        var5 -= 3;
                        int var52 = field813[var5];
                        int var53 = field813[var5 + 1];
                        int var54 = field813[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class177 var55 = class177.method2854(var52);
                        if (var55.field2923 == null) {
                            var55.field2923 = new class177[var54 + 1];
                        }
                        if (var55.field2923.length <= var54) {
                            class177[] var56 = new class177[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2923.length; var57++) {
                                var56[var57] = var55.field2923[var57];
                            }
                            var55.field2923 = var56;
                        }
                        if (var54 > 0 && var55.field2923[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class177 var58 = new class177();
                        var58.field2827 = var53;
                        var58.field2818 = var58.field2896 = var55.field2896;
                        var58.field2800 = var54;
                        var58.field2816 = true;
                        var55.field2923[var54] = var58;
                        if (var51) {
                            Statics.field809 = var58;
                        } else {
                            Statics.field2321 = var58;
                        }
                        client.method3045(var55);
                        continue;
                    }
                    if (var526 == 101) {
                        class177 var59 = var51 ? Statics.field809 : Statics.field2321;
                        class177 var60 = class177.method2854(var59.field2896);
                        var60.field2923[var59.field2800] = null;
                        client.method3045(var60);
                        continue;
                    }
                    if (var526 == 102) {
                        var5--;
                        class177 var61 = class177.method2854(field813[var5]);
                        var61.field2923 = null;
                        client.method3045(var61);
                        continue;
                    }
                    if (var526 == 200) {
                        var5 -= 2;
                        int var62 = field813[var5];
                        int var63 = field813[var5 + 1];
                        class177 var64 = class177.method2992(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field813[var5++] = 1;
                            if (var51) {
                                Statics.field809 = var64;
                            } else {
                                Statics.field2321 = var64;
                            }
                            continue;
                        }
                        field813[var5++] = 0;
                        continue;
                    }
                    if (var526 == 201) {
                        var5--;
                        class177 var65 = class177.method2854(field813[var5]);
                        if (var65 == null) {
                            field813[var5++] = 0;
                        } else {
                            field813[var5++] = 1;
                            if (var51) {
                                Statics.field809 = var65;
                            } else {
                                Statics.field2321 = var65;
                            }
                        }
                        continue;
                    }
                } else if (var526 >= 1000 && var526 < 1100 || var526 >= 2000 && var526 < 2100) {
                    int var66 = -1;
                    class177 var67;
                    if (var526 >= 2000) {
                        var526 -= 1000;
                        var5--;
                        var66 = field813[var5];
                        var67 = class177.method2854(var66);
                    } else {
                        var67 = var51 ? Statics.field809 : Statics.field2321;
                    }
                    if (var526 == 1000) {
                        var5 -= 4;
                        var67.field2808 = field813[var5];
                        var67.field2809 = field813[var5 + 1];
                        var67.field2804 = field813[var5 + 2];
                        var67.field2805 = field813[var5 + 3];
                        client.method3045(var67);
                        client.method123(var67);
                        if (var66 != -1 && var67.field2827 == 0) {
                            client.method89(Statics.field2845[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var526 == 1001) {
                        var5 -= 4;
                        var67.field2799 = field813[var5];
                        var67.field2855 = field813[var5 + 1];
                        var67.field2839 = field813[var5 + 2];
                        var67.field2894 = field813[var5 + 3];
                        client.method3045(var67);
                        client.method123(var67);
                        if (var66 != -1 && var67.field2827 == 0) {
                            client.method89(Statics.field2845[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var526 == 1003) {
                        var5--;
                        boolean var68 = field813[var5] == 1;
                        if (var67.field2819 != var68) {
                            var67.field2819 = var68;
                            client.method3045(var67);
                        }
                        continue;
                    }
                    if (var526 == 1005) {
                        var5--;
                        var67.field2932 = field813[var5] == 1;
                        continue;
                    }
                    if (var526 == 1006) {
                        var5--;
                        var67.field2933 = field813[var5] == 1;
                        continue;
                    }
                } else if (var526 >= 1100 && var526 < 1200 || var526 >= 2100 && var526 < 2200) {
                    int var69 = -1;
                    class177 var70;
                    if (var526 >= 2000) {
                        var526 -= 1000;
                        var5--;
                        var69 = field813[var5];
                        var70 = class177.method2854(var69);
                    } else {
                        var70 = var51 ? Statics.field809 : Statics.field2321;
                    }
                    if (var526 == 1100) {
                        var5 -= 2;
                        var70.field2793 = field813[var5];
                        if (var70.field2793 > var70.field2822 - var70.field2814) {
                            var70.field2793 = var70.field2822 - var70.field2814;
                        }
                        if (var70.field2793 < 0) {
                            var70.field2793 = 0;
                        }
                        var70.field2821 = field813[var5 + 1];
                        if (var70.field2821 > var70.field2823 - var70.field2841) {
                            var70.field2821 = var70.field2823 - var70.field2841;
                        }
                        if (var70.field2821 < 0) {
                            var70.field2821 = 0;
                        }
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1101) {
                        var5--;
                        var70.field2824 = field813[var5];
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1102) {
                        var5--;
                        var70.field2828 = field813[var5] == 1;
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1103) {
                        var5--;
                        var70.field2908 = field813[var5];
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1104) {
                        var5--;
                        var70.field2880 = field813[var5];
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1105) {
                        var5--;
                        var70.field2834 = field813[var5];
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1106) {
                        var5--;
                        var70.field2836 = field813[var5];
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1107) {
                        var5--;
                        var70.field2832 = field813[var5] == 1;
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1108) {
                        var70.field2791 = 1;
                        var5--;
                        var70.field2843 = field813[var5];
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1109) {
                        var5 -= 6;
                        var70.field2904 = field813[var5];
                        var70.field2849 = field813[var5 + 1];
                        var70.field2801 = field813[var5 + 2];
                        var70.field2851 = field813[var5 + 3];
                        var70.field2852 = field813[var5 + 4];
                        var70.field2853 = field813[var5 + 5];
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1110) {
                        var5--;
                        int var71 = field813[var5];
                        if (var70.field2846 != var71) {
                            var70.field2846 = var71;
                            var70.field2921 = 0;
                            var70.field2874 = 0;
                            client.method3045(var70);
                        }
                        continue;
                    }
                    if (var526 == 1111) {
                        var5--;
                        var70.field2856 = field813[var5] == 1;
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1112) {
                        var6--;
                        String var72 = field815[var6];
                        if (!var72.equals(var70.field2859)) {
                            var70.field2859 = var72;
                            client.method3045(var70);
                        }
                        continue;
                    }
                    if (var526 == 1113) {
                        var5--;
                        var70.field2858 = field813[var5];
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1114) {
                        var5 -= 3;
                        var70.field2862 = field813[var5];
                        var70.field2863 = field813[var5 + 1];
                        var70.field2861 = field813[var5 + 2];
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1115) {
                        var5--;
                        var70.field2864 = field813[var5] == 1;
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1116) {
                        var5--;
                        var70.field2838 = field813[var5];
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1117) {
                        var5--;
                        var70.field2850 = field813[var5];
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1118) {
                        var5--;
                        var70.field2817 = field813[var5] == 1;
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1119) {
                        var5--;
                        var70.field2907 = field813[var5] == 1;
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1120) {
                        var5 -= 2;
                        var70.field2822 = field813[var5];
                        var70.field2823 = field813[var5 + 1];
                        client.method3045(var70);
                        if (var69 != -1 && var70.field2827 == 0) {
                            client.method89(Statics.field2845[var69 >> 16], var70, false);
                        }
                        continue;
                    }
                    if (var526 == 1121) {
                        client.method1236(var70.field2896, var70.field2800);
                        client.field362 = var70;
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1122) {
                        var5--;
                        var70.field2835 = field813[var5];
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1123) {
                        var5--;
                        var70.field2825 = field813[var5];
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1124) {
                        var5--;
                        var70.field2831 = field813[var5];
                        client.method3045(var70);
                        continue;
                    }
                    if (var526 == 1125) {
                        var5--;
                        int var73 = field813[var5];
                        class86[] var74 = new class86[] { class86.field1485, class86.field1493, class86.field1487, class86.field1495, class86.field1486 };
                        class86 var75 = (class86) class113.method1561(var74, var73);
                        if (var75 != null) {
                            var70.field2829 = var75;
                            client.method3045(var70);
                        }
                        continue;
                    }
                } else if (!(var526 < 1200 || var526 >= 1300) || !(var526 < 2200 || var526 >= 2300)) {
                    class177 var76;
                    if (var526 >= 2000) {
                        var526 -= 1000;
                        var5--;
                        var76 = class177.method2854(field813[var5]);
                    } else {
                        var76 = var51 ? Statics.field809 : Statics.field2321;
                    }
                    client.method3045(var76);
                    if (var526 == 1200 || var526 == 1205 || var526 == 1212) {
                        var5 -= 2;
                        int var77 = field813[var5];
                        int var78 = field813[var5 + 1];
                        var76.field2860 = var77;
                        var76.field2920 = var78;
                        class56 var79 = class56.method576(var77);
                        var76.field2801 = var79.field1184;
                        var76.field2851 = var79.field1185;
                        var76.field2852 = var79.field1202;
                        var76.field2904 = var79.field1187;
                        var76.field2849 = var79.field1188;
                        var76.field2853 = var79.field1183;
                        if (var526 == 1205) {
                            var76.field2811 = 0;
                        } else if (var526 == 1212 | var79.field1200 == 1) {
                            var76.field2811 = 1;
                        } else {
                            var76.field2811 = 2;
                        }
                        if (var76.field2854 > 0) {
                            var76.field2853 = var76.field2853 * 32 / var76.field2854;
                        } else if (var76.field2799 > 0) {
                            var76.field2853 = var76.field2853 * 32 / var76.field2799;
                        }
                        continue;
                    }
                    if (var526 == 1201) {
                        var76.field2791 = 2;
                        var5--;
                        var76.field2843 = field813[var5];
                        continue;
                    }
                    if (var526 == 1202) {
                        var76.field2791 = 3;
                        var76.field2843 = Statics.field2692.field30.method3302();
                        continue;
                    }
                } else if ((var526 < 1300 || var526 >= 1400) && (var526 < 2300 || var526 >= 2400)) {
                    if (var526 >= 1400 && var526 < 1500 || var526 >= 2400 && var526 < 2500) {
                        class177 var84;
                        if (var526 >= 2000) {
                            var526 -= 1000;
                            var5--;
                            var84 = class177.method2854(field813[var5]);
                        } else {
                            var84 = var51 ? Statics.field809 : Statics.field2321;
                        }
                        var6--;
                        String var85 = field815[var6];
                        int[] var86 = null;
                        if (var85.length() > 0 && var85.charAt(var85.length() - 1) == 'Y') {
                            var5--;
                            int var87 = field813[var5];
                            if (var87 > 0) {
                                var86 = new int[var87];
                                while (var87-- > 0) {
                                    var5--;
                                    var86[var87] = field813[var5];
                                }
                            }
                            var85 = var85.substring(0, var85.length() - 1);
                        }
                        Object[] var88 = new Object[var85.length() + 1];
                        for (int var89 = var88.length - 1; var89 >= 1; var89--) {
                            if (var85.charAt(var89 - 1) == 's') {
                                var6--;
                                var88[var89] = field815[var6];
                            } else {
                                var5--;
                                var88[var89] = Integer.valueOf(field813[var5]);
                            }
                        }
                        var5--;
                        int var90 = field813[var5];
                        if (var90 == -1) {
                            var88 = null;
                        } else {
                            var88[0] = Integer.valueOf(var90);
                        }
                        if (var526 == 1400) {
                            var84.field2881 = var88;
                        }
                        if (var526 == 1401) {
                            var84.field2884 = var88;
                        }
                        if (var526 == 1402) {
                            var84.field2798 = var88;
                        }
                        if (var526 == 1403) {
                            var84.field2885 = var88;
                        }
                        if (var526 == 1404) {
                            var84.field2887 = var88;
                        }
                        if (var526 == 1405) {
                            var84.field2888 = var88;
                        }
                        if (var526 == 1406) {
                            var84.field2815 = var88;
                        }
                        if (var526 == 1407) {
                            var84.field2892 = var88;
                            var84.field2893 = var86;
                        }
                        if (var526 == 1408) {
                            var84.field2927 = var88;
                        }
                        if (var526 == 1409) {
                            var84.field2899 = var88;
                        }
                        if (var526 == 1410) {
                            var84.field2922 = var88;
                        }
                        if (var526 == 1411) {
                            var84.field2882 = var88;
                        }
                        if (var526 == 1412) {
                            var84.field2886 = var88;
                        }
                        if (var526 == 1414) {
                            var84.field2901 = var88;
                            var84.field2895 = var86;
                        }
                        if (var526 == 1415) {
                            var84.field2820 = var88;
                            var84.field2897 = var86;
                        }
                        if (var526 == 1416) {
                            var84.field2915 = var88;
                        }
                        if (var526 == 1417) {
                            var84.field2900 = var88;
                        }
                        if (var526 == 1418) {
                            var84.field2891 = var88;
                        }
                        if (var526 == 1419) {
                            var84.field2902 = var88;
                        }
                        if (var526 == 1420) {
                            var84.field2889 = var88;
                        }
                        if (var526 == 1421) {
                            var84.field2807 = var88;
                        }
                        if (var526 == 1422) {
                            var84.field2914 = var88;
                        }
                        if (var526 == 1423) {
                            var84.field2906 = var88;
                        }
                        if (var526 == 1424) {
                            var84.field2930 = var88;
                        }
                        if (var526 == 1425) {
                            var84.field2909 = var88;
                        }
                        if (var526 == 1426) {
                            var84.field2910 = var88;
                        }
                        if (var526 == 1427) {
                            var84.field2788 = var88;
                        }
                        var84.field2919 = true;
                        continue;
                    }
                    if (var526 < 1600) {
                        class177 var91 = var51 ? Statics.field809 : Statics.field2321;
                        if (var526 == 1500) {
                            field813[var5++] = var91.field2812;
                            continue;
                        }
                        if (var526 == 1501) {
                            field813[var5++] = var91.field2813;
                            continue;
                        }
                        if (var526 == 1502) {
                            field813[var5++] = var91.field2814;
                            continue;
                        }
                        if (var526 == 1503) {
                            field813[var5++] = var91.field2841;
                            continue;
                        }
                        if (var526 == 1504) {
                            field813[var5++] = var91.field2819 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 1505) {
                            field813[var5++] = var91.field2818;
                            continue;
                        }
                    } else if (var526 < 1700) {
                        class177 var92 = var51 ? Statics.field809 : Statics.field2321;
                        if (var526 == 1600) {
                            field813[var5++] = var92.field2793;
                            continue;
                        }
                        if (var526 == 1601) {
                            field813[var5++] = var92.field2821;
                            continue;
                        }
                        if (var526 == 1602) {
                            field815[var6++] = var92.field2859;
                            continue;
                        }
                        if (var526 == 1603) {
                            field813[var5++] = var92.field2822;
                            continue;
                        }
                        if (var526 == 1604) {
                            field813[var5++] = var92.field2823;
                            continue;
                        }
                        if (var526 == 1605) {
                            field813[var5++] = var92.field2853;
                            continue;
                        }
                        if (var526 == 1606) {
                            field813[var5++] = var92.field2801;
                            continue;
                        }
                        if (var526 == 1607) {
                            field813[var5++] = var92.field2852;
                            continue;
                        }
                        if (var526 == 1608) {
                            field813[var5++] = var92.field2851;
                            continue;
                        }
                        if (var526 == 1609) {
                            field813[var5++] = var92.field2908;
                            continue;
                        }
                        if (var526 == 1610) {
                            field813[var5++] = var92.field2831;
                            continue;
                        }
                        if (var526 == 1611) {
                            field813[var5++] = var92.field2824;
                            continue;
                        }
                        if (var526 == 1612) {
                            field813[var5++] = var92.field2825;
                            continue;
                        }
                        if (var526 == 1613) {
                            field813[var5++] = var92.field2829.method565();
                            continue;
                        }
                    } else if (var526 < 1800) {
                        class177 var93 = var51 ? Statics.field809 : Statics.field2321;
                        if (var526 == 1700) {
                            field813[var5++] = var93.field2860;
                            continue;
                        }
                        if (var526 == 1701) {
                            if (var93.field2860 == -1) {
                                field813[var5++] = 0;
                            } else {
                                field813[var5++] = var93.field2920;
                            }
                            continue;
                        }
                        if (var526 == 1702) {
                            field813[var5++] = var93.field2800;
                            continue;
                        }
                    } else if (var526 < 1900) {
                        class177 var94 = var51 ? Statics.field809 : Statics.field2321;
                        if (var526 == 1800) {
                            int[] var95 = field813;
                            int var96 = var5++;
                            int var97 = client.method2223(var94);
                            int var98 = var97 >> 11 & 0x3F;
                            var95[var96] = var98;
                            continue;
                        }
                        if (var526 == 1801) {
                            var5--;
                            int var99 = field813[var5];
                            int var527 = var99 - 1;
                            if (var94.field2790 != null && var527 < var94.field2790.length && var94.field2790[var527] != null) {
                                field815[var6++] = var94.field2790[var527];
                                continue;
                            }
                            field815[var6++] = "";
                            continue;
                        }
                        if (var526 == 1802) {
                            if (var94.field2870 == null) {
                                field815[var6++] = "";
                            } else {
                                field815[var6++] = var94.field2870;
                            }
                            continue;
                        }
                    } else if (var526 >= 1900 && var526 < 2000 || var526 >= 2900 && var526 < 3000) {
                        class177 var100;
                        if (var526 >= 2000) {
                            var526 -= 1000;
                            var5--;
                            var100 = class177.method2854(field813[var5]);
                        } else {
                            var100 = var51 ? Statics.field809 : Statics.field2321;
                        }
                        if (var526 == 1927) {
                            if (field811 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var100.field2788 == null) {
                                return;
                            }
                            class1 var101 = new class1();
                            var101.field12 = var100;
                            var101.field1 = var100.field2788;
                            var101.field6 = field811 + 1;
                            client.field533.method3596(arg0);
                            continue;
                        }
                    } else if (var526 < 2600) {
                        var5--;
                        class177 var102 = class177.method2854(field813[var5]);
                        if (var526 == 2500) {
                            field813[var5++] = var102.field2812;
                            continue;
                        }
                        if (var526 == 2501) {
                            field813[var5++] = var102.field2813;
                            continue;
                        }
                        if (var526 == 2502) {
                            field813[var5++] = var102.field2814;
                            continue;
                        }
                        if (var526 == 2503) {
                            field813[var5++] = var102.field2841;
                            continue;
                        }
                        if (var526 == 2504) {
                            field813[var5++] = var102.field2819 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 2505) {
                            field813[var5++] = var102.field2818;
                            continue;
                        }
                    } else if (var526 < 2700) {
                        var5--;
                        class177 var103 = class177.method2854(field813[var5]);
                        if (var526 == 2600) {
                            field813[var5++] = var103.field2793;
                            continue;
                        }
                        if (var526 == 2601) {
                            field813[var5++] = var103.field2821;
                            continue;
                        }
                        if (var526 == 2602) {
                            field815[var6++] = var103.field2859;
                            continue;
                        }
                        if (var526 == 2603) {
                            field813[var5++] = var103.field2822;
                            continue;
                        }
                        if (var526 == 2604) {
                            field813[var5++] = var103.field2823;
                            continue;
                        }
                        if (var526 == 2605) {
                            field813[var5++] = var103.field2853;
                            continue;
                        }
                        if (var526 == 2606) {
                            field813[var5++] = var103.field2801;
                            continue;
                        }
                        if (var526 == 2607) {
                            field813[var5++] = var103.field2852;
                            continue;
                        }
                        if (var526 == 2608) {
                            field813[var5++] = var103.field2851;
                            continue;
                        }
                        if (var526 == 2609) {
                            field813[var5++] = var103.field2908;
                            continue;
                        }
                        if (var526 == 2610) {
                            field813[var5++] = var103.field2831;
                            continue;
                        }
                        if (var526 == 2611) {
                            field813[var5++] = var103.field2824;
                            continue;
                        }
                        if (var526 == 2612) {
                            field813[var5++] = var103.field2825;
                            continue;
                        }
                        if (var526 == 2613) {
                            field813[var5++] = var103.field2829.method565();
                            continue;
                        }
                    } else if (var526 < 2800) {
                        if (var526 == 2700) {
                            var5--;
                            class177 var104 = class177.method2854(field813[var5]);
                            field813[var5++] = var104.field2860;
                            continue;
                        }
                        if (var526 == 2701) {
                            var5--;
                            class177 var105 = class177.method2854(field813[var5]);
                            if (var105.field2860 == -1) {
                                field813[var5++] = 0;
                            } else {
                                field813[var5++] = var105.field2920;
                            }
                            continue;
                        }
                        if (var526 == 2702) {
                            var5--;
                            int var106 = field813[var5];
                            class4 var107 = (class4) client.field442.method3580((long) var106);
                            if (var107 == null) {
                                field813[var5++] = 0;
                            } else {
                                field813[var5++] = 1;
                            }
                            continue;
                        }
                        if (var526 == 2706) {
                            field813[var5++] = client.field326;
                            continue;
                        }
                    } else if (var526 < 2900) {
                        var5--;
                        class177 var108 = class177.method2854(field813[var5]);
                        if (var526 == 2800) {
                            int[] var109 = field813;
                            int var110 = var5++;
                            int var111 = client.method2223(var108);
                            int var112 = var111 >> 11 & 0x3F;
                            var109[var110] = var112;
                            continue;
                        }
                        if (var526 == 2801) {
                            var5--;
                            int var113 = field813[var5];
                            int var528 = var113 - 1;
                            if (var108.field2790 != null && var528 < var108.field2790.length && var108.field2790[var528] != null) {
                                field815[var6++] = var108.field2790[var528];
                                continue;
                            }
                            field815[var6++] = "";
                            continue;
                        }
                        if (var526 == 2802) {
                            if (var108.field2870 == null) {
                                field815[var6++] = "";
                            } else {
                                field815[var6++] = var108.field2870;
                            }
                            continue;
                        }
                    } else if (var526 < 3200) {
                        if (var526 == 3100) {
                            var6--;
                            String var114 = field815[var6];
                            class12.method3256(0, "", var114);
                            continue;
                        }
                        if (var526 == 3101) {
                            var5 -= 2;
                            client.method2812(Statics.field2692, field813[var5], field813[var5 + 1]);
                            continue;
                        }
                        if (var526 == 3103) {
                            client.method1063();
                            continue;
                        }
                        if (var526 == 3104) {
                            var6--;
                            String var115 = field815[var6];
                            int var116 = 0;
                            boolean var117 = false;
                            boolean var118 = false;
                            int var119 = 0;
                            int var120 = var115.length();
                            int var121 = 0;
                            boolean var123;
                            while (true) {
                                if (var121 >= var120) {
                                    var123 = var118;
                                    break;
                                }
                                label3717: {
                                    char var122 = var115.charAt(var121);
                                    if (var121 == 0) {
                                        if (var122 == '-') {
                                            var117 = true;
                                            break label3717;
                                        }
                                        if (var122 == '+') {
                                            break label3717;
                                        }
                                    }
                                    int var529;
                                    if (var122 >= '0' && var122 <= '9') {
                                        var529 = var122 - '0';
                                    } else if (var122 >= 'A' && var122 <= 'Z') {
                                        var529 = var122 - '7';
                                    } else {
                                        if (var122 < 'a' || var122 > 'z') {
                                            var123 = false;
                                            break;
                                        }
                                        var529 = var122 - 'W';
                                    }
                                    if (var529 >= 10) {
                                        var123 = false;
                                        break;
                                    }
                                    if (var117) {
                                        var529 = -var529;
                                    }
                                    int var124 = var119 * 10 + var529;
                                    if (var124 / 10 != var119) {
                                        var123 = false;
                                        break;
                                    }
                                    var119 = var124;
                                    var118 = true;
                                }
                                var121++;
                            }
                            if (var123) {
                                var116 = class167.method2851(var115);
                            }
                            client.field325.method2684(13);
                            client.field325.method2415(var116);
                            continue;
                        }
                        if (var526 == 3105) {
                            var6--;
                            String var126 = field815[var6];
                            client.field325.method2684(241);
                            client.field325.method2412(var126.length() + 1);
                            client.field325.method2418(var126);
                            continue;
                        }
                        if (var526 == 3106) {
                            var6--;
                            String var127 = field815[var6];
                            client.field325.method2684(210);
                            client.field325.method2412(var127.length() + 1);
                            client.field325.method2418(var127);
                            continue;
                        }
                        if (var526 == 3107) {
                            var5--;
                            int var128 = field813[var5];
                            var6--;
                            String var129 = field815[var6];
                            int var130 = class35.field778;
                            int[] var131 = class35.field774;
                            boolean var132 = false;
                            for (int var133 = 0; var133 < var130; var133++) {
                                class3 var134 = client.field403[var131[var133]];
                                if (var134 != null && Statics.field2692 != var134 && var134.field45 != null && var134.field45.equalsIgnoreCase(var129)) {
                                    if (var128 == 1) {
                                        client.field325.method2684(204);
                                        client.field325.method2459(var131[var133]);
                                        client.field325.method2412(0);
                                    } else if (var128 == 4) {
                                        client.field325.method2684(128);
                                        client.field325.method2494(var131[var133]);
                                        client.field325.method2429(0);
                                    } else if (var128 == 6) {
                                        client.field325.method2684(146);
                                        client.field325.method2429(0);
                                        client.field325.method2494(var131[var133]);
                                    } else if (var128 == 7) {
                                        client.field325.method2684(115);
                                        client.field325.method2412(0);
                                        client.field325.method2459(var131[var133]);
                                    }
                                    var132 = true;
                                    break;
                                }
                            }
                            if (!var132) {
                                class12.method3256(4, "", class161.field2503 + var129);
                            }
                            continue;
                        }
                        if (var526 == 3108) {
                            var5 -= 3;
                            int var135 = field813[var5];
                            int var136 = field813[var5 + 1];
                            int var137 = field813[var5 + 2];
                            class177 var138 = class177.method2854(var137);
                            client.method727(var138, var135, var136);
                            continue;
                        }
                        if (var526 == 3109) {
                            var5 -= 2;
                            int var139 = field813[var5];
                            int var140 = field813[var5 + 1];
                            class177 var141 = var51 ? Statics.field809 : Statics.field2321;
                            client.method727(var141, var139, var140);
                            continue;
                        }
                        if (var526 == 3110) {
                            var5--;
                            Statics.field2067 = field813[var5] == 1;
                            continue;
                        }
                        if (var526 == 3111) {
                            field813[var5++] = Statics.field2103.field139 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3112) {
                            var5--;
                            Statics.field2103.field139 = field813[var5] == 1;
                            class9.method3732();
                            continue;
                        }
                        if (var526 == 3113) {
                            var6--;
                            String var142 = field815[var6];
                            var5--;
                            boolean var143 = field813[var5] == 1;
                            if (!var143) {
                                class142.method2970(var142, 3, "openjs");
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var142));
                                    continue;
                                } catch (Exception var524) {
                                }
                            }
                            if (class142.field2183.startsWith("win")) {
                                class142.method2970(var142, 0, "openjs");
                            } else if (class142.field2183.startsWith("mac")) {
                                class142.method2970(var142, 1, "openjs");
                            } else {
                                class142.method2970(var142, 2, "openjs");
                            }
                            continue;
                        }
                        if (var526 == 3115) {
                            var5--;
                            int var145 = field813[var5];
                            client.field325.method2684(12);
                            client.field325.method2494(var145);
                            continue;
                        }
                        if (var526 == 3116) {
                            var5--;
                            int var146 = field813[var5];
                            var6 -= 2;
                            String var147 = field815[var6];
                            String var148 = field815[var6 + 1];
                            if (var147.length() <= 500 && var148.length() <= 500) {
                                client.field325.method2684(42);
                                client.field325.method2494(1 + class123.method667(var147) + class123.method667(var148));
                                client.field325.method2452(var146);
                                client.field325.method2418(var147);
                                client.field325.method2418(var148);
                            }
                            continue;
                        }
                    } else if (var526 < 3300) {
                        if (var526 == 3200) {
                            var5 -= 3;
                            client.method1074(field813[var5], field813[var5 + 1], field813[var5 + 2]);
                            continue;
                        }
                        if (var526 == 3201) {
                            var5--;
                            int var149 = field813[var5];
                            if (var149 == -1 && !client.field520) {
                                Statics.field3009.method3504();
                                class187.field3008 = 1;
                                Statics.field2115 = null;
                            } else if (var149 != -1 && client.field542 != var149 && client.field434 != 0 && !client.field520) {
                                class187.method2993(2, Statics.field424, var149, 0, client.field434, false);
                            }
                            client.field542 = var149;
                            continue;
                        }
                        if (var526 == 3202) {
                            var5 -= 2;
                            int var150 = field813[var5];
                            int var10000 = field813[var5 + 1];
                            if (client.field434 != 0 && var150 != -1) {
                                class187.method2809(Statics.field152, var150, 0, client.field434, false);
                                client.field520 = true;
                            }
                            continue;
                        }
                    } else if (var526 < 3400) {
                        if (var526 == 3300) {
                            field813[var5++] = client.field289;
                            continue;
                        }
                        if (var526 == 3301) {
                            var5 -= 2;
                            int var152 = field813[var5];
                            int var153 = field813[var5 + 1];
                            int[] var154 = field813;
                            int var155 = var5++;
                            class16 var156 = (class16) class16.field217.method3580((long) var152);
                            int var157;
                            if (var156 == null) {
                                var157 = -1;
                            } else if (var153 >= 0 && var153 < var156.field216.length) {
                                var157 = var156.field216[var153];
                            } else {
                                var157 = -1;
                            }
                            var154[var155] = var157;
                            continue;
                        }
                        if (var526 == 3302) {
                            var5 -= 2;
                            int var158 = field813[var5];
                            int var159 = field813[var5 + 1];
                            field813[var5++] = class16.method3794(var158, var159);
                            continue;
                        }
                        if (var526 == 3303) {
                            var5 -= 2;
                            int var160 = field813[var5];
                            int var161 = field813[var5 + 1];
                            field813[var5++] = class16.method1621(var160, var161);
                            continue;
                        }
                        if (var526 == 3304) {
                            var5--;
                            int var162 = field813[var5];
                            field813[var5++] = class55.method2978(var162).field1164;
                            continue;
                        }
                        if (var526 == 3305) {
                            var5--;
                            int var163 = field813[var5];
                            field813[var5++] = client.field417[var163];
                            continue;
                        }
                        if (var526 == 3306) {
                            var5--;
                            int var164 = field813[var5];
                            field813[var5++] = client.field418[var164];
                            continue;
                        }
                        if (var526 == 3307) {
                            var5--;
                            int var165 = field813[var5];
                            field813[var5++] = client.field419[var165];
                            continue;
                        }
                        if (var526 == 3308) {
                            int var166 = Statics.field2225;
                            int var167 = (Statics.field2692.field880 >> 7) + Statics.field1070;
                            int var168 = (Statics.field2692.field827 >> 7) + Statics.field573;
                            field813[var5++] = (var166 << 28) + (var167 << 14) + var168;
                            continue;
                        }
                        if (var526 == 3309) {
                            var5--;
                            int var169 = field813[var5];
                            field813[var5++] = var169 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var526 == 3310) {
                            var5--;
                            int var170 = field813[var5];
                            field813[var5++] = var170 >> 28;
                            continue;
                        }
                        if (var526 == 3311) {
                            var5--;
                            int var171 = field813[var5];
                            field813[var5++] = var171 & 0x3FFF;
                            continue;
                        }
                        if (var526 == 3312) {
                            field813[var5++] = client.field282 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3313) {
                            var5 -= 2;
                            int var172 = field813[var5] + 32768;
                            int var173 = field813[var5 + 1];
                            int[] var174 = field813;
                            int var175 = var5++;
                            class16 var176 = (class16) class16.field217.method3580((long) var172);
                            int var177;
                            if (var176 == null) {
                                var177 = -1;
                            } else if (var173 >= 0 && var173 < var176.field216.length) {
                                var177 = var176.field216[var173];
                            } else {
                                var177 = -1;
                            }
                            var174[var175] = var177;
                            continue;
                        }
                        if (var526 == 3314) {
                            var5 -= 2;
                            int var178 = field813[var5] + 32768;
                            int var179 = field813[var5 + 1];
                            field813[var5++] = class16.method3794(var178, var179);
                            continue;
                        }
                        if (var526 == 3315) {
                            var5 -= 2;
                            int var180 = field813[var5] + 32768;
                            int var181 = field813[var5 + 1];
                            field813[var5++] = class16.method1621(var180, var181);
                            continue;
                        }
                        if (var526 == 3316) {
                            if (client.field448 >= 2) {
                                field813[var5++] = client.field448;
                            } else {
                                field813[var5++] = 0;
                            }
                            continue;
                        }
                        if (var526 == 3317) {
                            field813[var5++] = client.field305;
                            continue;
                        }
                        if (var526 == 3318) {
                            field813[var5++] = client.field383;
                            continue;
                        }
                        if (var526 == 3321) {
                            field813[var5++] = client.field401;
                            continue;
                        }
                        if (var526 == 3322) {
                            field813[var5++] = client.field447;
                            continue;
                        }
                        if (var526 == 3323) {
                            if (client.field450) {
                                field813[var5++] = 1;
                            } else {
                                field813[var5++] = 0;
                            }
                            continue;
                        }
                        if (var526 == 3324) {
                            field813[var5++] = client.field367;
                            continue;
                        }
                    } else if (var526 < 3500) {
                        if (var526 == 3400) {
                            var5 -= 2;
                            int var182 = field813[var5];
                            int var183 = field813[var5 + 1];
                            class53 var184 = (class53) class53.field1139.method3535((long) var182);
                            class53 var185;
                            if (var184 == null) {
                                byte[] var186 = Statics.field1143.method3097(8, var182);
                                class53 var187 = new class53();
                                if (var186 != null) {
                                    var187.method1043(new class123(var186));
                                }
                                class53.field1139.method3537(var187, (long) var182);
                                var185 = var187;
                            } else {
                                var185 = var184;
                            }
                            class53 var188 = var185;
                            if (var185.field1141 != 's') {
                            }
                            for (int var189 = 0; var189 < var188.field1145; var189++) {
                                if (var188.field1151[var189] == var183) {
                                    field815[var6++] = var188.field1147[var189];
                                    var188 = null;
                                    break;
                                }
                            }
                            if (var188 != null) {
                                field815[var6++] = var188.field1146;
                            }
                            continue;
                        }
                        if (var526 == 3408) {
                            var5 -= 4;
                            int var190 = field813[var5];
                            int var191 = field813[var5 + 1];
                            int var192 = field813[var5 + 2];
                            int var193 = field813[var5 + 3];
                            class53 var194 = (class53) class53.field1139.method3535((long) var192);
                            class53 var195;
                            if (var194 == null) {
                                byte[] var196 = Statics.field1143.method3097(8, var192);
                                class53 var197 = new class53();
                                if (var196 != null) {
                                    var197.method1043(new class123(var196));
                                }
                                class53.field1139.method3537(var197, (long) var192);
                                var195 = var197;
                            } else {
                                var195 = var194;
                            }
                            class53 var198 = var195;
                            if (var195.field1140 == var190 && var195.field1141 == var191) {
                                for (int var199 = 0; var199 < var198.field1145; var199++) {
                                    if (var198.field1151[var199] == var193) {
                                        if (var191 == 115) {
                                            field815[var6++] = var198.field1147[var199];
                                        } else {
                                            field813[var5++] = var198.field1138[var199];
                                        }
                                        var198 = null;
                                        break;
                                    }
                                }
                                if (var198 != null) {
                                    if (var191 == 115) {
                                        field815[var6++] = var198.field1146;
                                    } else {
                                        field813[var5++] = var198.field1144;
                                    }
                                }
                                continue;
                            }
                            if (var191 == 115) {
                                field815[var6++] = "null";
                            } else {
                                field813[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var526 < 3700) {
                        if (var526 == 3600) {
                            if (client.field535 == 0) {
                                field813[var5++] = -2;
                            } else if (client.field535 == 1) {
                                field813[var5++] = -1;
                            } else {
                                field813[var5++] = client.field548;
                            }
                            continue;
                        }
                        if (var526 == 3601) {
                            var5--;
                            int var200 = field813[var5];
                            if (client.field535 == 2 && var200 < client.field548) {
                                field815[var6++] = client.field550[var200].field245;
                                field815[var6++] = client.field550[var200].field241;
                                continue;
                            }
                            field815[var6++] = "";
                            field815[var6++] = "";
                            continue;
                        }
                        if (var526 == 3602) {
                            var5--;
                            int var201 = field813[var5];
                            if (client.field535 == 2 && var201 < client.field548) {
                                field813[var5++] = client.field550[var201].field242;
                                continue;
                            }
                            field813[var5++] = 0;
                            continue;
                        }
                        if (var526 == 3603) {
                            var5--;
                            int var202 = field813[var5];
                            if (client.field535 == 2 && var202 < client.field548) {
                                field813[var5++] = client.field550[var202].field243;
                                continue;
                            }
                            field813[var5++] = 0;
                            continue;
                        }
                        if (var526 == 3604) {
                            var6--;
                            String var203 = field815[var6];
                            var5--;
                            int var204 = field813[var5];
                            client.field325.method2684(124);
                            client.field325.method2412(class123.method667(var203) + 1);
                            client.field325.method2418(var203);
                            client.field325.method2452(var204);
                            continue;
                        }
                        if (var526 == 3605) {
                            var6--;
                            String var205 = field815[var6];
                            client.method669(var205);
                            continue;
                        }
                        if (var526 == 3606) {
                            var6--;
                            String var206 = field815[var6];
                            if (var206 == null) {
                                continue;
                            }
                            String var207 = class168.method2347(var206, Statics.field997);
                            if (var207 == null) {
                                continue;
                            }
                            int var208 = 0;
                            while (true) {
                                if (var208 >= client.field548) {
                                    continue label3428;
                                }
                                class18 var209 = client.field550[var208];
                                String var210 = var209.field245;
                                String var211 = class168.method2347(var210, Statics.field997);
                                if (class133.method106(var206, var207, var210, var211)) {
                                    client.field548--;
                                    for (int var212 = var208; var212 < client.field548; var212++) {
                                        client.field550[var212] = client.field550[var212 + 1];
                                    }
                                    client.field360 = client.field466;
                                    client.field325.method2684(236);
                                    client.field325.method2412(class123.method667(var206));
                                    client.field325.method2418(var206);
                                    continue label3428;
                                }
                                var208++;
                            }
                        }
                        if (var526 == 3607) {
                            var6--;
                            String var213 = field815[var6];
                            if (var213 == null) {
                                continue;
                            }
                            if ((client.field552 < 100 || client.field522 == 1) && client.field552 < 400) {
                                String var214 = class168.method2347(var213, Statics.field997);
                                if (var214 == null) {
                                    continue;
                                }
                                for (int var215 = 0; var215 < client.field552; var215++) {
                                    class8 var216 = client.field553[var215];
                                    String var217 = class168.method2347(var216.field132, Statics.field997);
                                    if (var217 != null && var217.equals(var214)) {
                                        class12.method3256(31, "", var213 + class161.field2563);
                                        continue label3428;
                                    }
                                    if (var216.field130 != null) {
                                        String var218 = class168.method2347(var216.field130, Statics.field997);
                                        if (var218 != null && var218.equals(var214)) {
                                            class12.method3256(31, "", var213 + class161.field2563);
                                            continue label3428;
                                        }
                                    }
                                }
                                for (int var219 = 0; var219 < client.field548; var219++) {
                                    class18 var220 = client.field550[var219];
                                    String var221 = class168.method2347(var220.field245, Statics.field997);
                                    if (var221 != null && var221.equals(var214)) {
                                        class12.method3256(31, "", class161.field2528 + var213 + class161.field2529);
                                        continue label3428;
                                    }
                                    if (var220.field241 != null) {
                                        String var222 = class168.method2347(var220.field241, Statics.field997);
                                        if (var222 != null && var222.equals(var214)) {
                                            class12.method3256(31, "", class161.field2528 + var213 + class161.field2529);
                                            continue label3428;
                                        }
                                    }
                                }
                                if (class168.method2347(Statics.field2692.field45, Statics.field997).equals(var214)) {
                                    class12.method3256(31, "", class161.field2465);
                                } else {
                                    client.field325.method2684(60);
                                    client.field325.method2412(class123.method667(var213));
                                    client.field325.method2418(var213);
                                }
                                continue;
                            }
                            class12.method3256(31, "", class161.field2522);
                            continue;
                        }
                        if (var526 == 3608) {
                            var6--;
                            String var223 = field815[var6];
                            if (var223 == null) {
                                continue;
                            }
                            String var224 = class168.method2347(var223, Statics.field997);
                            if (var224 == null) {
                                continue;
                            }
                            int var225 = 0;
                            while (true) {
                                if (var225 >= client.field552) {
                                    continue label3428;
                                }
                                class8 var226 = client.field553[var225];
                                String var227 = var226.field132;
                                String var228 = class168.method2347(var227, Statics.field997);
                                if (class133.method106(var223, var224, var227, var228)) {
                                    client.field552--;
                                    for (int var229 = var225; var229 < client.field552; var229++) {
                                        client.field553[var229] = client.field553[var229 + 1];
                                    }
                                    client.field360 = client.field466;
                                    client.field325.method2684(37);
                                    client.field325.method2412(class123.method667(var223));
                                    client.field325.method2418(var223);
                                    continue label3428;
                                }
                                var225++;
                            }
                        }
                        if (var526 == 3609) {
                            var6--;
                            String var230 = field815[var6];
                            class156[] var231 = class156.method648();
                            for (int var232 = 0; var232 < var231.length; var232++) {
                                class156 var233 = var231[var232];
                                if (var233.field2303 != -1 && var230.startsWith(Statics.method2972(var233.field2303))) {
                                    var230 = var230.substring(6 + Integer.toString(var233.field2303).length());
                                    break;
                                }
                            }
                            field813[var5++] = client.method2(var230, false) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3611) {
                            if (client.field456 == null) {
                                field815[var6++] = "";
                            } else {
                                String[] var234 = field815;
                                int var235 = var6++;
                                String var236 = client.field456;
                                String var237 = class166.method797(class166.method3724(var236));
                                if (var237 == null) {
                                    var237 = "";
                                }
                                var234[var235] = var237;
                            }
                            continue;
                        }
                        if (var526 == 3612) {
                            if (client.field456 == null) {
                                field813[var5++] = 0;
                            } else {
                                field813[var5++] = Statics.field236;
                            }
                            continue;
                        }
                        if (var526 == 3613) {
                            var5--;
                            int var239 = field813[var5];
                            if (client.field456 != null && var239 < Statics.field236) {
                                field815[var6++] = Statics.field2017[var239].field628;
                                continue;
                            }
                            field815[var6++] = "";
                            continue;
                        }
                        if (var526 == 3614) {
                            var5--;
                            int var240 = field813[var5];
                            if (client.field456 != null && var240 < Statics.field236) {
                                field813[var5++] = Statics.field2017[var240].field620;
                                continue;
                            }
                            field813[var5++] = 0;
                            continue;
                        }
                        if (var526 == 3615) {
                            var5--;
                            int var241 = field813[var5];
                            if (client.field456 != null && var241 < Statics.field236) {
                                field813[var5++] = Statics.field2017[var241].field621;
                                continue;
                            }
                            field813[var5++] = 0;
                            continue;
                        }
                        if (var526 == 3616) {
                            field813[var5++] = Statics.field2117;
                            continue;
                        }
                        if (var526 == 3617) {
                            var6--;
                            String var242 = field815[var6];
                            client.method135(var242);
                            continue;
                        }
                        if (var526 == 3618) {
                            field813[var5++] = Statics.field992;
                            continue;
                        }
                        if (var526 == 3619) {
                            var6--;
                            String var243 = field815[var6];
                            if (!var243.equals("")) {
                                client.field325.method2684(21);
                                client.field325.method2412(class123.method667(var243));
                                client.field325.method2418(var243);
                            }
                            continue;
                        }
                        if (var526 == 3620) {
                            client.method862();
                            continue;
                        }
                        if (var526 == 3621) {
                            if (client.field535 == 0) {
                                field813[var5++] = -1;
                            } else {
                                field813[var5++] = client.field552;
                            }
                            continue;
                        }
                        if (var526 == 3622) {
                            var5--;
                            int var244 = field813[var5];
                            if (client.field535 != 0 && var244 < client.field552) {
                                field815[var6++] = client.field553[var244].field132;
                                field815[var6++] = client.field553[var244].field130;
                                continue;
                            }
                            field815[var6++] = "";
                            field815[var6++] = "";
                            continue;
                        }
                        if (var526 == 3623) {
                            var6--;
                            String var245 = field815[var6];
                            if (var245.startsWith(Statics.method2972(0)) || var245.startsWith(Statics.method2972(1))) {
                                var245 = var245.substring(7);
                            }
                            field813[var5++] = Statics.method3505(var245) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3624) {
                            var5--;
                            int var246 = field813[var5];
                            if (Statics.field2017 != null && var246 < Statics.field236 && Statics.field2017[var246].field628.equalsIgnoreCase(Statics.field2692.field45)) {
                                field813[var5++] = 1;
                                continue;
                            }
                            field813[var5++] = 0;
                            continue;
                        }
                        if (var526 == 3625) {
                            if (client.field509 == null) {
                                field815[var6++] = "";
                            } else {
                                String[] var247 = field815;
                                int var248 = var6++;
                                String var249 = client.field509;
                                String var250 = class166.method797(class166.method3724(var249));
                                if (var250 == null) {
                                    var250 = "";
                                }
                                var247[var248] = var250;
                            }
                            continue;
                        }
                    } else if (var526 < 4000) {
                        if (var526 == 3903) {
                            var5--;
                            int var252 = field813[var5];
                            field813[var5++] = client.field451[var252].method3770();
                            continue;
                        }
                        if (var526 == 3904) {
                            var5--;
                            int var253 = field813[var5];
                            field813[var5++] = client.field451[var253].field3219;
                            continue;
                        }
                        if (var526 == 3905) {
                            var5--;
                            int var254 = field813[var5];
                            field813[var5++] = client.field451[var254].field3221;
                            continue;
                        }
                        if (var526 == 3906) {
                            var5--;
                            int var255 = field813[var5];
                            field813[var5++] = client.field451[var255].field3222;
                            continue;
                        }
                        if (var526 == 3907) {
                            var5--;
                            int var256 = field813[var5];
                            field813[var5++] = client.field451[var256].field3223;
                            continue;
                        }
                        if (var526 == 3908) {
                            var5--;
                            int var257 = field813[var5];
                            field813[var5++] = client.field451[var257].field3224;
                            continue;
                        }
                        if (var526 == 3910) {
                            var5--;
                            int var258 = field813[var5];
                            int var259 = client.field451[var258].method3781();
                            field813[var5++] = var259 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3911) {
                            var5--;
                            int var260 = field813[var5];
                            int var261 = client.field451[var260].method3781();
                            field813[var5++] = var261 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3912) {
                            var5--;
                            int var262 = field813[var5];
                            int var263 = client.field451[var262].method3781();
                            field813[var5++] = var263 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3913) {
                            var5--;
                            int var264 = field813[var5];
                            int var265 = client.field451[var264].method3781();
                            field813[var5++] = var265 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 3914) {
                            var5--;
                            boolean var266 = field813[var5] == 1;
                            if (Statics.field1817 != null) {
                                Statics.field1817.method3786(class225.field3231, var266);
                            }
                            continue;
                        }
                        if (var526 == 3915) {
                            var5--;
                            boolean var267 = field813[var5] == 1;
                            if (Statics.field1817 != null) {
                                Statics.field1817.method3786(class225.field3230, var267);
                            }
                            continue;
                        }
                        if (var526 == 3916) {
                            var5 -= 2;
                            boolean var268 = field813[var5] == 1;
                            boolean var269 = field813[var5 + 1] == 1;
                            if (Statics.field1817 != null) {
                                Statics.field1817.method3786(new class23(var269), var268);
                            }
                            continue;
                        }
                        if (var526 == 3917) {
                            var5--;
                            boolean var270 = field813[var5] == 1;
                            if (Statics.field1817 != null) {
                                Statics.field1817.method3786(class225.field3229, var270);
                            }
                            continue;
                        }
                        if (var526 == 3918) {
                            var5--;
                            boolean var271 = field813[var5] == 1;
                            if (Statics.field1817 != null) {
                                Statics.field1817.method3786(class225.field3232, var271);
                            }
                            continue;
                        }
                        if (var526 == 3919) {
                            field813[var5++] = Statics.field1817 == null ? 0 : Statics.field1817.field3228.size();
                            continue;
                        }
                        if (var526 == 3920) {
                            var5--;
                            int var272 = field813[var5];
                            class218 var273 = (class218) Statics.field1817.field3228.get(var272);
                            field813[var5++] = var273.field3198;
                            continue;
                        }
                        if (var526 == 3921) {
                            var5--;
                            int var274 = field813[var5];
                            class218 var275 = (class218) Statics.field1817.field3228.get(var274);
                            field815[var6++] = var275.method3736();
                            continue;
                        }
                        if (var526 == 3922) {
                            var5--;
                            int var276 = field813[var5];
                            class218 var277 = (class218) Statics.field1817.field3228.get(var276);
                            field815[var6++] = var277.method3735();
                            continue;
                        }
                        if (var526 == 3923) {
                            var5--;
                            int var278 = field813[var5];
                            class218 var279 = (class218) Statics.field1817.field3228.get(var278);
                            long var280 = class119.method3068() - Statics.field2991 - var279.field3200;
                            int var282 = (int) (var280 / 3600000L);
                            int var283 = (int) ((var280 - (long) (var282 * 3600000)) / 60000L);
                            int var284 = (int) ((var280 - (long) (var282 * 3600000) - (long) (var283 * 60000)) / 1000L);
                            String var285 = var282 + ":" + var283 / 10 + var283 % 10 + ":" + var284 / 10 + var284 % 10;
                            field815[var6++] = var285;
                            continue;
                        }
                        if (var526 == 3924) {
                            var5--;
                            int var286 = field813[var5];
                            class218 var287 = (class218) Statics.field1817.field3228.get(var286);
                            field813[var5++] = var287.field3199.field3222;
                            continue;
                        }
                        if (var526 == 3925) {
                            var5--;
                            int var288 = field813[var5];
                            class218 var289 = (class218) Statics.field1817.field3228.get(var288);
                            field813[var5++] = var289.field3199.field3221;
                            continue;
                        }
                        if (var526 == 3926) {
                            var5--;
                            int var290 = field813[var5];
                            class218 var291 = (class218) Statics.field1817.field3228.get(var290);
                            field813[var5++] = var291.field3199.field3219;
                            continue;
                        }
                    } else if (var526 < 4100) {
                        if (var526 == 4000) {
                            var5 -= 2;
                            int var292 = field813[var5];
                            int var293 = field813[var5 + 1];
                            field813[var5++] = var292 + var293;
                            continue;
                        }
                        if (var526 == 4001) {
                            var5 -= 2;
                            int var294 = field813[var5];
                            int var295 = field813[var5 + 1];
                            field813[var5++] = var294 - var295;
                            continue;
                        }
                        if (var526 == 4002) {
                            var5 -= 2;
                            int var296 = field813[var5];
                            int var297 = field813[var5 + 1];
                            field813[var5++] = var296 * var297;
                            continue;
                        }
                        if (var526 == 4003) {
                            var5 -= 2;
                            int var298 = field813[var5];
                            int var299 = field813[var5 + 1];
                            field813[var5++] = var298 / var299;
                            continue;
                        }
                        if (var526 == 4004) {
                            var5--;
                            int var300 = field813[var5];
                            field813[var5++] = (int) (Math.random() * (double) var300);
                            continue;
                        }
                        if (var526 == 4005) {
                            var5--;
                            int var301 = field813[var5];
                            field813[var5++] = (int) (Math.random() * (double) (var301 + 1));
                            continue;
                        }
                        if (var526 == 4006) {
                            var5 -= 5;
                            int var302 = field813[var5];
                            int var303 = field813[var5 + 1];
                            int var304 = field813[var5 + 2];
                            int var305 = field813[var5 + 3];
                            int var306 = field813[var5 + 4];
                            field813[var5++] = (var303 - var302) * (var306 - var304) / (var305 - var304) + var302;
                            continue;
                        }
                        if (var526 == 4007) {
                            var5 -= 2;
                            int var307 = field813[var5];
                            int var308 = field813[var5 + 1];
                            field813[var5++] = var307 * var308 / 100 + var307;
                            continue;
                        }
                        if (var526 == 4008) {
                            var5 -= 2;
                            int var309 = field813[var5];
                            int var310 = field813[var5 + 1];
                            field813[var5++] = var309 | 0x1 << var310;
                            continue;
                        }
                        if (var526 == 4009) {
                            var5 -= 2;
                            int var311 = field813[var5];
                            int var312 = field813[var5 + 1];
                            field813[var5++] = var311 & -1 - (0x1 << var312);
                            continue;
                        }
                        if (var526 == 4010) {
                            var5 -= 2;
                            int var313 = field813[var5];
                            int var314 = field813[var5 + 1];
                            field813[var5++] = (var313 & 0x1 << var314) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var526 == 4011) {
                            var5 -= 2;
                            int var315 = field813[var5];
                            int var316 = field813[var5 + 1];
                            field813[var5++] = var315 % var316;
                            continue;
                        }
                        if (var526 == 4012) {
                            var5 -= 2;
                            int var317 = field813[var5];
                            int var318 = field813[var5 + 1];
                            if (var317 == 0) {
                                field813[var5++] = 0;
                            } else {
                                field813[var5++] = (int) Math.pow((double) var317, (double) var318);
                            }
                            continue;
                        }
                        if (var526 == 4013) {
                            var5 -= 2;
                            int var319 = field813[var5];
                            int var320 = field813[var5 + 1];
                            if (var319 == 0) {
                                field813[var5++] = 0;
                            } else if (var320 == 0) {
                                field813[var5++] = Integer.MAX_VALUE;
                            } else {
                                field813[var5++] = (int) Math.pow((double) var319, 1.0D / (double) var320);
                            }
                            continue;
                        }
                        if (var526 == 4014) {
                            var5 -= 2;
                            int var321 = field813[var5];
                            int var322 = field813[var5 + 1];
                            field813[var5++] = var321 & var322;
                            continue;
                        }
                        if (var526 == 4015) {
                            var5 -= 2;
                            int var323 = field813[var5];
                            int var324 = field813[var5 + 1];
                            field813[var5++] = var323 | var324;
                            continue;
                        }
                        if (var526 == 4018) {
                            var5 -= 3;
                            long var325 = (long) field813[var5];
                            long var327 = (long) field813[var5 + 1];
                            long var329 = (long) field813[var5 + 2];
                            field813[var5++] = (int) (var325 * var329 / var327);
                            continue;
                        }
                    } else if (var526 < 4200) {
                        if (var526 == 4100) {
                            var6--;
                            String var331 = field815[var6];
                            var5--;
                            int var332 = field813[var5];
                            field815[var6++] = var331 + var332;
                            continue;
                        }
                        if (var526 == 4101) {
                            var6 -= 2;
                            String var333 = field815[var6];
                            String var334 = field815[var6 + 1];
                            field815[var6++] = var333 + var334;
                            continue;
                        }
                        if (var526 == 4102) {
                            var6--;
                            String var335 = field815[var6];
                            var5--;
                            int var336 = field813[var5];
                            String[] var337 = field815;
                            int var338 = var6++;
                            String var340;
                            if (var336 < 0) {
                                var340 = Integer.toString(var336);
                            } else {
                                int var341 = var336;
                                String var342;
                                if (var336 < 0) {
                                    var342 = Integer.toString(var336, 10);
                                } else {
                                    int var343 = 2;
                                    int var344 = var336 / 10;
                                    while (var344 != 0) {
                                        var344 /= 10;
                                        var343++;
                                    }
                                    char[] var345 = new char[var343];
                                    var345[0] = '+';
                                    for (int var346 = var343 - 1; var346 > 0; var346--) {
                                        int var347 = var341;
                                        var341 /= 10;
                                        int var348 = var347 - var341 * 10;
                                        if (var348 >= 10) {
                                            var345[var346] = (char) (var348 + 87);
                                        } else {
                                            var345[var346] = (char) (var348 + 48);
                                        }
                                    }
                                    var342 = new String(var345);
                                }
                                var340 = var342;
                            }
                            var337[var338] = var335 + var340;
                            continue;
                        }
                        if (var526 == 4103) {
                            var6--;
                            String var349 = field815[var6];
                            field815[var6++] = var349.toLowerCase();
                            continue;
                        }
                        if (var526 == 4104) {
                            var5--;
                            int var350 = field813[var5];
                            long var351 = ((long) var350 + 11745L) * 86400000L;
                            field818.setTime(new Date(var351));
                            int var353 = field818.get(5);
                            int var354 = field818.get(2);
                            int var355 = field818.get(1);
                            field815[var6++] = var353 + "-" + field819[var354] + "-" + var355;
                            continue;
                        }
                        if (var526 == 4105) {
                            var6 -= 2;
                            String var356 = field815[var6];
                            String var357 = field815[var6 + 1];
                            if (Statics.field2692.field30 != null && Statics.field2692.field30.field2971) {
                                field815[var6++] = var357;
                                continue;
                            }
                            field815[var6++] = var356;
                            continue;
                        }
                        if (var526 == 4106) {
                            var5--;
                            int var358 = field813[var5];
                            field815[var6++] = Integer.toString(var358);
                            continue;
                        }
                        if (var526 == 4107) {
                            var6 -= 2;
                            int[] var359 = field813;
                            int var360 = var5++;
                            int var361 = class170.method2969(field815[var6], field815[var6 + 1], client.field284);
                            byte var362;
                            if (var361 > 0) {
                                var362 = 1;
                            } else if (var361 < 0) {
                                var362 = -1;
                            } else {
                                var362 = 0;
                            }
                            var359[var360] = var362;
                            continue;
                        }
                        if (var526 == 4108) {
                            var6--;
                            String var363 = field815[var6];
                            var5 -= 2;
                            int var364 = field813[var5];
                            int var365 = field813[var5 + 1];
                            byte[] var366 = Statics.field803.method3097(var365, 0);
                            class228 var367 = new class228(var366);
                            field813[var5++] = var367.method3802(var363, var364);
                            continue;
                        }
                        if (var526 == 4109) {
                            var6--;
                            String var368 = field815[var6];
                            var5 -= 2;
                            int var369 = field813[var5];
                            int var370 = field813[var5 + 1];
                            byte[] var371 = Statics.field803.method3097(var370, 0);
                            class228 var372 = new class228(var371);
                            field813[var5++] = var372.method3801(var368, var369);
                            continue;
                        }
                        if (var526 == 4110) {
                            var6 -= 2;
                            String var373 = field815[var6];
                            String var374 = field815[var6 + 1];
                            var5--;
                            if (field813[var5] == 1) {
                                field815[var6++] = var373;
                            } else {
                                field815[var6++] = var374;
                            }
                            continue;
                        }
                        if (var526 == 4111) {
                            var6--;
                            String var375 = field815[var6];
                            field815[var6++] = class227.method3812(var375);
                            continue;
                        }
                        if (var526 == 4112) {
                            var6--;
                            String var376 = field815[var6];
                            var5--;
                            int var377 = field813[var5];
                            field815[var6++] = var376 + (char) var377;
                            continue;
                        }
                        if (var526 == 4113) {
                            var5--;
                            int var378 = field813[var5];
                            field813[var5++] = class167.method969((char) var378) ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4114) {
                            var5--;
                            int var379 = field813[var5];
                            int[] var380 = field813;
                            int var381 = var5++;
                            char var382 = (char) var379;
                            boolean var383 = var382 >= '0' && var382 <= '9' || var382 >= 'A' && var382 <= 'Z' || var382 >= 'a' && var382 <= 'z';
                            var380[var381] = var383 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4115) {
                            var5--;
                            int var384 = field813[var5];
                            int[] var385 = field813;
                            int var386 = var5++;
                            char var387 = (char) var384;
                            boolean var388 = var387 >= 'A' && var387 <= 'Z' || var387 >= 'a' && var387 <= 'z';
                            var385[var386] = var388 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4116) {
                            var5--;
                            int var389 = field813[var5];
                            int[] var390 = field813;
                            int var391 = var5++;
                            char var392 = (char) var389;
                            boolean var393 = var392 >= '0' && var392 <= '9';
                            var390[var391] = var393 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4117) {
                            var6--;
                            String var394 = field815[var6];
                            if (var394 == null) {
                                field813[var5++] = 0;
                            } else {
                                field813[var5++] = var394.length();
                            }
                            continue;
                        }
                        if (var526 == 4118) {
                            var6--;
                            String var395 = field815[var6];
                            var5 -= 2;
                            int var396 = field813[var5];
                            int var397 = field813[var5 + 1];
                            field815[var6++] = var395.substring(var396, var397);
                            continue;
                        }
                        if (var526 == 4119) {
                            var6--;
                            String var398 = field815[var6];
                            StringBuilder var399 = new StringBuilder(var398.length());
                            boolean var400 = false;
                            for (int var401 = 0; var401 < var398.length(); var401++) {
                                char var402 = var398.charAt(var401);
                                if (var402 == '<') {
                                    var400 = true;
                                } else if (var402 == '>') {
                                    var400 = false;
                                } else if (!var400) {
                                    var399.append(var402);
                                }
                            }
                            field815[var6++] = var399.toString();
                            continue;
                        }
                        if (var526 == 4120) {
                            var6--;
                            String var403 = field815[var6];
                            var5--;
                            int var404 = field813[var5];
                            field813[var5++] = var403.indexOf(var404);
                            continue;
                        }
                        if (var526 == 4121) {
                            var6 -= 2;
                            String var405 = field815[var6];
                            String var406 = field815[var6 + 1];
                            var5--;
                            int var407 = field813[var5];
                            field813[var5++] = var405.indexOf(var406, var407);
                            continue;
                        }
                    } else if (var526 < 4300) {
                        if (var526 == 4200) {
                            var5--;
                            int var408 = field813[var5];
                            field815[var6++] = class56.method576(var408).field1206;
                            continue;
                        }
                        if (var526 == 4201) {
                            var5 -= 2;
                            int var409 = field813[var5];
                            int var410 = field813[var5 + 1];
                            class56 var411 = class56.method576(var409);
                            if (var410 >= 1 && var410 <= 5 && var411.field1192[var410 - 1] != null) {
                                field815[var6++] = var411.field1192[var410 - 1];
                                continue;
                            }
                            field815[var6++] = "";
                            continue;
                        }
                        if (var526 == 4202) {
                            var5 -= 2;
                            int var412 = field813[var5];
                            int var413 = field813[var5 + 1];
                            class56 var414 = class56.method576(var412);
                            if (var413 >= 1 && var413 <= 5 && var414.field1193[var413 - 1] != null) {
                                field815[var6++] = var414.field1193[var413 - 1];
                                continue;
                            }
                            field815[var6++] = "";
                            continue;
                        }
                        if (var526 == 4203) {
                            var5--;
                            int var415 = field813[var5];
                            field813[var5++] = class56.method576(var415).field1190;
                            continue;
                        }
                        if (var526 == 4204) {
                            var5--;
                            int var416 = field813[var5];
                            field813[var5++] = class56.method576(var416).field1200 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4205) {
                            var5--;
                            int var417 = field813[var5];
                            class56 var418 = class56.method576(var417);
                            if (var418.field1178 == -1 && var418.field1208 >= 0) {
                                field813[var5++] = var418.field1208;
                                continue;
                            }
                            field813[var5++] = var417;
                            continue;
                        }
                        if (var526 == 4206) {
                            var5--;
                            int var419 = field813[var5];
                            class56 var420 = class56.method576(var419);
                            if (var420.field1178 >= 0 && var420.field1208 >= 0) {
                                field813[var5++] = var420.field1208;
                                continue;
                            }
                            field813[var5++] = var419;
                            continue;
                        }
                        if (var526 == 4207) {
                            var5--;
                            int var421 = field813[var5];
                            field813[var5++] = class56.method576(var421).field1191 ? 1 : 0;
                            continue;
                        }
                        if (var526 == 4208) {
                            var5--;
                            int var422 = field813[var5];
                            class56 var423 = class56.method576(var422);
                            if (var423.field1197 == -1 && var423.field1217 >= 0) {
                                field813[var5++] = var423.field1217;
                                continue;
                            }
                            field813[var5++] = var422;
                            continue;
                        }
                        if (var526 == 4209) {
                            var5--;
                            int var424 = field813[var5];
                            class56 var425 = class56.method576(var424);
                            if (var425.field1197 >= 0 && var425.field1217 >= 0) {
                                field813[var5++] = var425.field1217;
                                continue;
                            }
                            field813[var5++] = var424;
                            continue;
                        }
                        if (var526 == 4210) {
                            var6--;
                            String var426 = field815[var6];
                            var5--;
                            int var427 = field813[var5];
                            boolean var429 = var427 == 1;
                            String var430 = var426.toLowerCase();
                            short[] var431 = new short[16];
                            int var432 = 0;
                            int var433 = 0;
                            while (true) {
                                if (var433 >= Statics.field1168) {
                                    Statics.field163 = var431;
                                    Statics.field195 = 0;
                                    Statics.field1620 = var432;
                                    String[] var437 = new String[Statics.field1620];
                                    for (int var438 = 0; var438 < Statics.field1620; var438++) {
                                        var437[var438] = class56.method576(var431[var438]).field1206;
                                    }
                                    short[] var439 = Statics.field163;
                                    class128.method672(var437, var439, 0, var437.length - 1);
                                    break;
                                }
                                class56 var434 = class56.method576(var433);
                                if ((!var429 || var434.field1171) && var434.field1178 == -1 && var434.field1206.toLowerCase().indexOf(var430) != -1) {
                                    if (var432 >= 250) {
                                        Statics.field1620 = -1;
                                        Statics.field163 = null;
                                        break;
                                    }
                                    if (var432 >= var431.length) {
                                        short[] var435 = new short[var431.length * 2];
                                        for (int var436 = 0; var436 < var432; var436++) {
                                            var435[var436] = var431[var436];
                                        }
                                        var431 = var435;
                                    }
                                    var431[var432++] = (short) var433;
                                }
                                var433++;
                            }
                            field813[var5++] = Statics.field1620;
                            continue;
                        }
                        if (var526 == 4211) {
                            if (Statics.field163 != null && Statics.field195 < Statics.field1620) {
                                field813[var5++] = Statics.field163[++Statics.field195 - 1] & 0xFFFF;
                                continue;
                            }
                            field813[var5++] = -1;
                            continue;
                        }
                        if (var526 == 4212) {
                            Statics.field195 = 0;
                            continue;
                        }
                    } else if (var526 < 5100) {
                        if (var526 == 5000) {
                            field813[var5++] = client.field499;
                            continue;
                        }
                        if (var526 == 5001) {
                            var5 -= 3;
                            client.field499 = field813[var5];
                            int var440 = field813[var5 + 1];
                            class134[] var441 = new class134[] { class134.field2113, class134.field2111, class134.field2116 };
                            class134[] var442 = var441;
                            int var443 = 0;
                            class134 var445;
                            while (true) {
                                if (var443 >= var442.length) {
                                    var445 = null;
                                    break;
                                }
                                class134 var444 = var442[var443];
                                if (var444.field2114 == var440) {
                                    var445 = var444;
                                    break;
                                }
                                var443++;
                            }
                            Statics.field2636 = var445;
                            if (Statics.field2636 == null) {
                                Statics.field2636 = class134.field2111;
                            }
                            client.field500 = field813[var5 + 2];
                            client.field325.method2684(192);
                            client.field325.method2412(client.field499);
                            client.field325.method2412(Statics.field2636.field2114);
                            client.field325.method2412(client.field500);
                            continue;
                        }
                        if (var526 == 5002) {
                            var6--;
                            String var446 = field815[var6];
                            var5 -= 2;
                            int var447 = field813[var5];
                            int var448 = field813[var5 + 1];
                            client.field325.method2684(209);
                            client.field325.method2412(class123.method667(var446) + 2);
                            client.field325.method2418(var446);
                            client.field325.method2412(var447 - 1);
                            client.field325.method2412(var448);
                            continue;
                        }
                        if (var526 == 5003) {
                            var5 -= 2;
                            int var449 = field813[var5];
                            int var450 = field813[var5 + 1];
                            class30 var451 = (class30) class12.field164.get(var449);
                            class38 var452 = var451.method654(var450);
                            if (var452 == null) {
                                field813[var5++] = -1;
                                field813[var5++] = 0;
                                field815[var6++] = "";
                                field815[var6++] = "";
                                field815[var6++] = "";
                            } else {
                                field813[var5++] = var452.field802;
                                field813[var5++] = var452.field797;
                                field815[var6++] = var452.field799 == null ? "" : var452.field799;
                                field815[var6++] = var452.field800 == null ? "" : var452.field800;
                                field815[var6++] = var452.field796 == null ? "" : var452.field796;
                            }
                            continue;
                        }
                        if (var526 == 5004) {
                            var5--;
                            int var454 = field813[var5];
                            class38 var455 = class12.method1006(var454);
                            if (var455 == null) {
                                field813[var5++] = -1;
                                field813[var5++] = 0;
                                field815[var6++] = "";
                                field815[var6++] = "";
                                field815[var6++] = "";
                            } else {
                                field813[var5++] = var455.field798;
                                field813[var5++] = var455.field797;
                                field815[var6++] = var455.field799 == null ? "" : var455.field799;
                                field815[var6++] = var455.field800 == null ? "" : var455.field800;
                                field815[var6++] = var455.field796 == null ? "" : var455.field796;
                            }
                            continue;
                        }
                        if (var526 == 5005) {
                            if (Statics.field2636 == null) {
                                field813[var5++] = -1;
                            } else {
                                field813[var5++] = Statics.field2636.field2114;
                            }
                            continue;
                        }
                        if (var526 == 5008) {
                            var6--;
                            String var456 = field815[var6];
                            var5--;
                            int var457 = field813[var5];
                            String var458 = var456.toLowerCase();
                            byte var459 = 0;
                            if (var458.startsWith(class161.field2457)) {
                                var459 = 0;
                                var456 = var456.substring(class161.field2457.length());
                            } else if (var458.startsWith(class161.field2532)) {
                                var459 = 1;
                                var456 = var456.substring(class161.field2532.length());
                            } else if (var458.startsWith(class161.field2534)) {
                                var459 = 2;
                                var456 = var456.substring(class161.field2534.length());
                            } else if (var458.startsWith(class161.field2536)) {
                                var459 = 3;
                                var456 = var456.substring(class161.field2536.length());
                            } else if (var458.startsWith(class161.field2538)) {
                                var459 = 4;
                                var456 = var456.substring(class161.field2538.length());
                            } else if (var458.startsWith(class161.field2540)) {
                                var459 = 5;
                                var456 = var456.substring(class161.field2540.length());
                            } else if (var458.startsWith(class161.field2397)) {
                                var459 = 6;
                                var456 = var456.substring(class161.field2397.length());
                            } else if (var458.startsWith(class161.field2544)) {
                                var459 = 7;
                                var456 = var456.substring(class161.field2544.length());
                            } else if (var458.startsWith(class161.field2546)) {
                                var459 = 8;
                                var456 = var456.substring(class161.field2546.length());
                            } else if (var458.startsWith(class161.field2494)) {
                                var459 = 9;
                                var456 = var456.substring(class161.field2494.length());
                            } else if (var458.startsWith(class161.field2550)) {
                                var459 = 10;
                                var456 = var456.substring(class161.field2550.length());
                            } else if (var458.startsWith(class161.field2364)) {
                                var459 = 11;
                                var456 = var456.substring(class161.field2364.length());
                            } else if (client.field284 != 0) {
                                if (var458.startsWith(class161.field2531)) {
                                    var459 = 0;
                                    var456 = var456.substring(class161.field2531.length());
                                } else if (var458.startsWith(class161.field2533)) {
                                    var459 = 1;
                                    var456 = var456.substring(class161.field2533.length());
                                } else if (var458.startsWith(class161.field2535)) {
                                    var459 = 2;
                                    var456 = var456.substring(class161.field2535.length());
                                } else if (var458.startsWith(class161.field2537)) {
                                    var459 = 3;
                                    var456 = var456.substring(class161.field2537.length());
                                } else if (var458.startsWith(class161.field2539)) {
                                    var459 = 4;
                                    var456 = var456.substring(class161.field2539.length());
                                } else if (var458.startsWith(class161.field2446)) {
                                    var459 = 5;
                                    var456 = var456.substring(class161.field2446.length());
                                } else if (var458.startsWith(class161.field2543)) {
                                    var459 = 6;
                                    var456 = var456.substring(class161.field2543.length());
                                } else if (var458.startsWith(class161.field2545)) {
                                    var459 = 7;
                                    var456 = var456.substring(class161.field2545.length());
                                } else if (var458.startsWith(class161.field2400)) {
                                    var459 = 8;
                                    var456 = var456.substring(class161.field2400.length());
                                } else if (var458.startsWith(class161.field2549)) {
                                    var459 = 9;
                                    var456 = var456.substring(class161.field2549.length());
                                } else if (var458.startsWith(class161.field2551)) {
                                    var459 = 10;
                                    var456 = var456.substring(class161.field2551.length());
                                } else if (var458.startsWith(class161.field2553)) {
                                    var459 = 11;
                                    var456 = var456.substring(class161.field2553.length());
                                }
                            }
                            String var460 = var456.toLowerCase();
                            byte var461 = 0;
                            if (var460.startsWith(class161.field2554)) {
                                var461 = 1;
                                var456 = var456.substring(class161.field2554.length());
                            } else if (var460.startsWith(class161.field2372)) {
                                var461 = 2;
                                var456 = var456.substring(class161.field2372.length());
                            } else if (var460.startsWith(class161.field2558)) {
                                var461 = 3;
                                var456 = var456.substring(class161.field2558.length());
                            } else if (var460.startsWith(class161.field2560)) {
                                var461 = 4;
                                var456 = var456.substring(class161.field2560.length());
                            } else if (var460.startsWith(class161.field2453)) {
                                var461 = 5;
                                var456 = var456.substring(class161.field2453.length());
                            } else if (client.field284 != 0) {
                                if (var460.startsWith(class161.field2555)) {
                                    var461 = 1;
                                    var456 = var456.substring(class161.field2555.length());
                                } else if (var460.startsWith(class161.field2557)) {
                                    var461 = 2;
                                    var456 = var456.substring(class161.field2557.length());
                                } else if (var460.startsWith(class161.field2559)) {
                                    var461 = 3;
                                    var456 = var456.substring(class161.field2559.length());
                                } else if (var460.startsWith(class161.field2502)) {
                                    var461 = 4;
                                    var456 = var456.substring(class161.field2502.length());
                                } else if (var460.startsWith(class161.field2362)) {
                                    var461 = 5;
                                    var456 = var456.substring(class161.field2362.length());
                                }
                            }
                            client.field325.method2684(237);
                            client.field325.method2412(0);
                            int var462 = client.field325.field2060;
                            client.field325.method2412(var457);
                            client.field325.method2412(var459);
                            client.field325.method2412(var461);
                            class126 var463 = client.field325;
                            int var464 = var463.field2060;
                            int var465 = var456.length();
                            byte[] var466 = new byte[var465];
                            for (int var467 = 0; var467 < var465; var467++) {
                                char var468 = var456.charAt(var467);
                                if (!(var468 <= 0 || var468 >= 128) || !(var468 < 160 || var468 > 255)) {
                                    var466[var467] = (byte) var468;
                                } else if (var468 == 8364) {
                                    var466[var467] = -128;
                                } else if (var468 == 8218) {
                                    var466[var467] = -126;
                                } else if (var468 == 402) {
                                    var466[var467] = -125;
                                } else if (var468 == 8222) {
                                    var466[var467] = -124;
                                } else if (var468 == 8230) {
                                    var466[var467] = -123;
                                } else if (var468 == 8224) {
                                    var466[var467] = -122;
                                } else if (var468 == 8225) {
                                    var466[var467] = -121;
                                } else if (var468 == 710) {
                                    var466[var467] = -120;
                                } else if (var468 == 8240) {
                                    var466[var467] = -119;
                                } else if (var468 == 352) {
                                    var466[var467] = -118;
                                } else if (var468 == 8249) {
                                    var466[var467] = -117;
                                } else if (var468 == 338) {
                                    var466[var467] = -116;
                                } else if (var468 == 381) {
                                    var466[var467] = -114;
                                } else if (var468 == 8216) {
                                    var466[var467] = -111;
                                } else if (var468 == 8217) {
                                    var466[var467] = -110;
                                } else if (var468 == 8220) {
                                    var466[var467] = -109;
                                } else if (var468 == 8221) {
                                    var466[var467] = -108;
                                } else if (var468 == 8226) {
                                    var466[var467] = -107;
                                } else if (var468 == 8211) {
                                    var466[var467] = -106;
                                } else if (var468 == 8212) {
                                    var466[var467] = -105;
                                } else if (var468 == 732) {
                                    var466[var467] = -104;
                                } else if (var468 == 8482) {
                                    var466[var467] = -103;
                                } else if (var468 == 353) {
                                    var466[var467] = -102;
                                } else if (var468 == 8250) {
                                    var466[var467] = -101;
                                } else if (var468 == 339) {
                                    var466[var467] = -100;
                                } else if (var468 == 382) {
                                    var466[var467] = -98;
                                } else if (var468 == 376) {
                                    var466[var467] = -97;
                                } else {
                                    var466[var467] = 63;
                                }
                            }
                            var463.method2425(var466.length);
                            var463.field2060 += Statics.field2224.method2356(var466, 0, var466.length, var463.field2054, var463.field2060);
                            client.field325.method2424(client.field325.field2060 - var462);
                            continue;
                        }
                        if (var526 == 5009) {
                            var6 -= 2;
                            String var471 = field815[var6];
                            String var472 = field815[var6 + 1];
                            client.field325.method2684(26);
                            client.field325.method2494(0);
                            int var473 = client.field325.field2060;
                            client.field325.method2418(var471);
                            class126 var474 = client.field325;
                            int var475 = var474.field2060;
                            int var476 = var472.length();
                            byte[] var477 = new byte[var476];
                            for (int var478 = 0; var478 < var476; var478++) {
                                char var479 = var472.charAt(var478);
                                if (var479 > 0 && var479 < 128 || var479 >= 160 && var479 <= 255) {
                                    var477[var478] = (byte) var479;
                                } else if (var479 == 8364) {
                                    var477[var478] = -128;
                                } else if (var479 == 8218) {
                                    var477[var478] = -126;
                                } else if (var479 == 402) {
                                    var477[var478] = -125;
                                } else if (var479 == 8222) {
                                    var477[var478] = -124;
                                } else if (var479 == 8230) {
                                    var477[var478] = -123;
                                } else if (var479 == 8224) {
                                    var477[var478] = -122;
                                } else if (var479 == 8225) {
                                    var477[var478] = -121;
                                } else if (var479 == 710) {
                                    var477[var478] = -120;
                                } else if (var479 == 8240) {
                                    var477[var478] = -119;
                                } else if (var479 == 352) {
                                    var477[var478] = -118;
                                } else if (var479 == 8249) {
                                    var477[var478] = -117;
                                } else if (var479 == 338) {
                                    var477[var478] = -116;
                                } else if (var479 == 381) {
                                    var477[var478] = -114;
                                } else if (var479 == 8216) {
                                    var477[var478] = -111;
                                } else if (var479 == 8217) {
                                    var477[var478] = -110;
                                } else if (var479 == 8220) {
                                    var477[var478] = -109;
                                } else if (var479 == 8221) {
                                    var477[var478] = -108;
                                } else if (var479 == 8226) {
                                    var477[var478] = -107;
                                } else if (var479 == 8211) {
                                    var477[var478] = -106;
                                } else if (var479 == 8212) {
                                    var477[var478] = -105;
                                } else if (var479 == 732) {
                                    var477[var478] = -104;
                                } else if (var479 == 8482) {
                                    var477[var478] = -103;
                                } else if (var479 == 353) {
                                    var477[var478] = -102;
                                } else if (var479 == 8250) {
                                    var477[var478] = -101;
                                } else if (var479 == 339) {
                                    var477[var478] = -100;
                                } else if (var479 == 382) {
                                    var477[var478] = -98;
                                } else if (var479 == 376) {
                                    var477[var478] = -97;
                                } else {
                                    var477[var478] = 63;
                                }
                            }
                            var474.method2425(var477.length);
                            var474.field2060 += Statics.field2224.method2356(var477, 0, var477.length, var474.field2054, var474.field2060);
                            client.field325.method2610(client.field325.field2060 - var473);
                            continue;
                        }
                        if (var526 == 5015) {
                            String var482;
                            if (Statics.field2692 == null || Statics.field2692.field45 == null) {
                                var482 = "";
                            } else {
                                var482 = Statics.field2692.field45;
                            }
                            field815[var6++] = var482;
                            continue;
                        }
                        if (var526 == 5016) {
                            field813[var5++] = client.field500;
                            continue;
                        }
                        if (var526 == 5017) {
                            var5--;
                            int var483 = field813[var5];
                            int[] var484 = field813;
                            int var485 = var5++;
                            class30 var486 = (class30) class12.field164.get(var483);
                            int var487;
                            if (var486 == null) {
                                var487 = 0;
                            } else {
                                var487 = var486.method655();
                            }
                            var484[var485] = var487;
                            continue;
                        }
                        if (var526 == 5018) {
                            var5--;
                            int var488 = field813[var5];
                            int[] var489 = field813;
                            int var490 = var5++;
                            class38 var491 = (class38) class12.field168.method3587((long) var488);
                            int var492;
                            if (var491 == null) {
                                var492 = -1;
                            } else if (class12.field165.field3151 == var491.field3156) {
                                var492 = -1;
                            } else {
                                var492 = ((class38) var491.field3156).field802;
                            }
                            var489[var490] = var492;
                            continue;
                        }
                        if (var526 == 5019) {
                            var5--;
                            int var493 = field813[var5];
                            int[] var494 = field813;
                            int var495 = var5++;
                            class38 var496 = (class38) class12.field168.method3587((long) var493);
                            int var497;
                            if (var496 == null) {
                                var497 = -1;
                            } else if (class12.field165.field3151 == var496.field3157) {
                                var497 = -1;
                            } else {
                                var497 = ((class38) var496.field3157).field802;
                            }
                            var494[var495] = var497;
                            continue;
                        }
                        if (var526 == 5020) {
                            var6--;
                            String var498 = field815[var6];
                            if (var498.equalsIgnoreCase("toggleroof")) {
                                Statics.field2103.field139 = !Statics.field2103.field139;
                                class9.method3732();
                                if (Statics.field2103.field139) {
                                    class12.method3256(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method3256(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var498.equalsIgnoreCase("displayfps")) {
                                client.field295 = !client.field295;
                            }
                            if (client.field448 >= 2) {
                                if (var498.equalsIgnoreCase("fpson")) {
                                    client.field295 = true;
                                }
                                if (var498.equalsIgnoreCase("fpsoff")) {
                                    client.field295 = false;
                                }
                                if (var498.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var498.equalsIgnoreCase("clientdrop")) {
                                    client.method970();
                                }
                                if (var498.equalsIgnoreCase("errortest") && client.field280 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field325.method2684(148);
                            client.field325.method2412(var498.length() + 1);
                            client.field325.method2418(var498);
                            continue;
                        }
                        if (var526 == 5021) {
                            var6--;
                            client.field501 = field815[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var526 == 5022) {
                            field815[var6++] = client.field501;
                            continue;
                        }
                    }
                } else {
                    class177 var80;
                    if (var526 >= 2000) {
                        var526 -= 1000;
                        var5--;
                        var80 = class177.method2854(field813[var5]);
                    } else {
                        var80 = var51 ? Statics.field809 : Statics.field2321;
                    }
                    if (var526 == 1300) {
                        var5--;
                        int var81 = field813[var5] - 1;
                        if (var81 >= 0 && var81 <= 9) {
                            var6--;
                            var80.method3212(var81, field815[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var526 == 1301) {
                        var5 -= 2;
                        int var82 = field813[var5];
                        int var83 = field813[var5 + 1];
                        var80.field2792 = class177.method2992(var82, var83);
                        continue;
                    }
                    if (var526 == 1302) {
                        var5--;
                        var80.field2877 = field813[var5] == 1;
                        continue;
                    }
                    if (var526 == 1303) {
                        var5--;
                        var80.field2898 = field813[var5];
                        continue;
                    }
                    if (var526 == 1304) {
                        var5--;
                        var80.field2876 = field813[var5];
                        continue;
                    }
                    if (var526 == 1305) {
                        var6--;
                        var80.field2870 = field815[var6];
                        continue;
                    }
                    if (var526 == 1306) {
                        var6--;
                        var80.field2878 = field815[var6];
                        continue;
                    }
                    if (var526 == 1307) {
                        var80.field2790 = null;
                        continue;
                    }
                }
                if (var526 < 5400) {
                    if (var526 == 5306) {
                        int[] var499 = field813;
                        int var500 = var5++;
                        int var501 = client.field495 ? 2 : 1;
                        var499[var500] = var501;
                        continue;
                    }
                    if (var526 == 5307) {
                        var5--;
                        int var502 = field813[var5];
                        if (var502 == 1 || var502 == 2) {
                            client.method908(var502);
                        }
                        continue;
                    }
                    if (var526 == 5308) {
                        field813[var5++] = Statics.field2103.field137;
                        continue;
                    }
                    if (var526 == 5309) {
                        var5--;
                        int var503 = field813[var5];
                        if (var503 == 1 || var503 == 2) {
                            Statics.field2103.field137 = var503;
                            class9.method3732();
                        }
                        continue;
                    }
                }
                if (var526 < 5600) {
                    if (var526 == 5504) {
                        var5 -= 2;
                        int var504 = field813[var5];
                        int var505 = field813[var5 + 1];
                        if (!client.field529) {
                            client.field366 = var504;
                            client.field536 = var505;
                        }
                        continue;
                    }
                    if (var526 == 5505) {
                        field813[var5++] = client.field366;
                        continue;
                    }
                    if (var526 == 5506) {
                        field813[var5++] = client.field536;
                        continue;
                    }
                    if (var526 == 5530) {
                        var5--;
                        int var506 = field813[var5];
                        if (var506 < 0) {
                            var506 = 0;
                        }
                        client.field372 = var506;
                        continue;
                    }
                    if (var526 == 5531) {
                        field813[var5++] = client.field372;
                        continue;
                    }
                }
                if (var526 >= 5700 || var526 != 5630) {
                    if (var526 < 6300) {
                        if (var526 == 6200) {
                            var5 -= 2;
                            client.field538 = (short) field813[var5];
                            if (client.field538 <= 0) {
                                client.field538 = 256;
                            }
                            client.field449 = (short) field813[var5 + 1];
                            if (client.field449 <= 0) {
                                client.field449 = 205;
                            }
                            continue;
                        }
                        if (var526 == 6201) {
                            var5 -= 2;
                            client.field513 = (short) field813[var5];
                            if (client.field513 <= 0) {
                                client.field513 = 256;
                            }
                            client.field345 = (short) field813[var5 + 1];
                            if (client.field345 <= 0) {
                                client.field345 = 320;
                            }
                            continue;
                        }
                        if (var526 == 6202) {
                            var5 -= 4;
                            client.field539 = (short) field813[var5];
                            if (client.field539 <= 0) {
                                client.field539 = 1;
                            }
                            client.field537 = (short) field813[var5 + 1];
                            if (client.field537 <= 0) {
                                client.field537 = 32767;
                            } else if (client.field537 < client.field539) {
                                client.field537 = client.field539;
                            }
                            client.field541 = (short) field813[var5 + 2];
                            if (client.field541 <= 0) {
                                client.field541 = 1;
                            }
                            client.field458 = (short) field813[var5 + 3];
                            if (client.field458 <= 0) {
                                client.field458 = 32767;
                            } else if (client.field458 < client.field541) {
                                client.field458 = client.field541;
                            }
                            continue;
                        }
                        if (var526 == 6203) {
                            if (client.field453 == null) {
                                field813[var5++] = -1;
                                field813[var5++] = -1;
                            } else {
                                client.method47(0, 0, client.field453.field2814, client.field453.field2841, false);
                                field813[var5++] = client.field545;
                                field813[var5++] = client.field298;
                            }
                            continue;
                        }
                        if (var526 == 6204) {
                            field813[var5++] = client.field513;
                            field813[var5++] = client.field345;
                            continue;
                        }
                        if (var526 == 6205) {
                            field813[var5++] = client.field538;
                            field813[var5++] = client.field449;
                            continue;
                        }
                    }
                    if (var526 < 6600) {
                        if (var526 == 6500) {
                            field813[var5++] = class28.method51() ? 1 : 0;
                            continue;
                        }
                        if (var526 == 6501) {
                            class28.field644 = 0;
                            class28 var507;
                            if (class28.field644 < class28.field657) {
                                var507 = Statics.field1172[++class28.field644 - 1];
                            } else {
                                var507 = null;
                            }
                            if (var507 == null) {
                                field813[var5++] = -1;
                                field813[var5++] = 0;
                                field815[var6++] = "";
                                field813[var5++] = 0;
                                field813[var5++] = 0;
                                field815[var6++] = "";
                            } else {
                                field813[var5++] = var507.field647;
                                field813[var5++] = var507.field649;
                                field815[var6++] = var507.field648;
                                field813[var5++] = var507.field655;
                                field813[var5++] = var507.field656;
                                field815[var6++] = var507.field650;
                            }
                            continue;
                        }
                        if (var526 == 6502) {
                            class28 var510;
                            if (class28.field644 < class28.field657) {
                                var510 = Statics.field1172[++class28.field644 - 1];
                            } else {
                                var510 = null;
                            }
                            if (var510 == null) {
                                field813[var5++] = -1;
                                field813[var5++] = 0;
                                field815[var6++] = "";
                                field813[var5++] = 0;
                                field813[var5++] = 0;
                                field815[var6++] = "";
                            } else {
                                field813[var5++] = var510.field647;
                                field813[var5++] = var510.field649;
                                field815[var6++] = var510.field648;
                                field813[var5++] = var510.field655;
                                field813[var5++] = var510.field656;
                                field815[var6++] = var510.field650;
                            }
                            continue;
                        }
                        if (var526 == 6506) {
                            var5--;
                            int var512 = field813[var5];
                            class28 var513 = null;
                            for (int var514 = 0; var514 < class28.field657; var514++) {
                                if (Statics.field1172[var514].field647 == var512) {
                                    var513 = Statics.field1172[var514];
                                    break;
                                }
                            }
                            if (var513 == null) {
                                field813[var5++] = -1;
                                field813[var5++] = 0;
                                field815[var6++] = "";
                                field813[var5++] = 0;
                                field813[var5++] = 0;
                                field815[var6++] = "";
                            } else {
                                field813[var5++] = var513.field647;
                                field813[var5++] = var513.field649;
                                field815[var6++] = var513.field648;
                                field813[var5++] = var513.field655;
                                field813[var5++] = var513.field656;
                                field815[var6++] = var513.field650;
                            }
                            continue;
                        }
                        if (var526 == 6507) {
                            var5 -= 4;
                            int var515 = field813[var5];
                            boolean var516 = field813[var5 + 1] == 1;
                            int var517 = field813[var5 + 2];
                            boolean var518 = field813[var5 + 3] == 1;
                            if (Statics.field1172 != null) {
                                class28.method175(0, Statics.field1172.length - 1, var515, var516, var517, var518);
                            }
                            continue;
                        }
                        if (var526 == 6511) {
                            var5--;
                            int var519 = field813[var5];
                            if (var519 >= 0 && var519 < class28.field657) {
                                class28 var520 = Statics.field1172[var519];
                                field813[var5++] = var520.field647;
                                field813[var5++] = var520.field649;
                                field815[var6++] = var520.field648;
                                field813[var5++] = var520.field655;
                                field813[var5++] = var520.field656;
                                field815[var6++] = var520.field650;
                                continue;
                            }
                            field813[var5++] = -1;
                            field813[var5++] = 0;
                            field815[var6++] = "";
                            field813[var5++] = 0;
                            field813[var5++] = 0;
                            field815[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field398 = 250;
            }
        } catch (Exception var525) {
            StringBuilder var522 = new StringBuilder(30);
            var522.append("").append(var4.field3166).append(" ");
            for (int var523 = field816 - 1; var523 >= 0; var523--) {
                var522.append("").append(field817[var523].field208.field3166).append(" ");
            }
            var522.append("").append(var10);
            class152.method2817(var522.toString(), var525);
        }
    }

    @ObfuscatedName("u.f(IB)V")
    public static void method108(int arg0) {
        if (arg0 == -1 || !class177.method1822(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2845[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3.field2872 != null) {
                class1 var4 = new class1();
                var4.field12 = var3;
                var4.field1 = var3.field2872;
                method2029(var4, 2000000);
            }
        }
    }
}
