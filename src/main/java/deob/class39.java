package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ap")
public class class39 {

    @ObfuscatedName("ap.p")
    public static int[] field787 = new int[5];

    @ObfuscatedName("ap.g")
    public static int[][] field788 = new int[5][5000];

    @ObfuscatedName("ap.m")
    public static int[] field801 = new int[1000];

    @ObfuscatedName("ap.f")
    public static String[] field790 = new String[1000];

    @ObfuscatedName("ap.k")
    public static int field791 = 0;

    @ObfuscatedName("ap.h")
    public static class15[] field792 = new class15[50];

    @ObfuscatedName("ap.u")
    public static Calendar field783 = Calendar.getInstance();

    @ObfuscatedName("ap.n")
    public static final String[] field795 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ap.d")
    public static int field796 = 0;

    public class39() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.s(Ls;I)V")
    public static void method742(class1 arg0) {
        method36(arg0, 200000);
    }

    @ObfuscatedName("t.z(Ls;II)V")
    public static void method36(class1 arg0, int arg1) {
        Object[] var2 = arg0.field6;
        int var3 = (Integer) var2[0];
        class24 var4 = class24.method2053(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field579;
        int[] var9 = var4.field581;
        byte var10 = -1;
        field791 = 0;
        try {
            Statics.field789 = new int[var4.field582];
            int var11 = 0;
            Statics.field786 = new String[var4.field578];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field11;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field2;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2799;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field7;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2800;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2799;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2800;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field789[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field786[var12++] = var15;
                }
            }
            int var16 = 0;
            field796 = arg0.field14;
            label2936: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var443 = var8[var7];
                if (var443 < 100) {
                    if (var443 == 0) {
                        field801[var5++] = var9[var7];
                        continue;
                    }
                    if (var443 == 1) {
                        int var17 = var9[var7];
                        field801[var5++] = class180.field2952[var17];
                        continue;
                    }
                    if (var443 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class180.field2952[var18] = field801[var5];
                        client.method536(var18);
                        continue;
                    }
                    if (var443 == 3) {
                        field790[var6++] = var4.field583[var7];
                        continue;
                    }
                    if (var443 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var443 == 7) {
                        var5 -= 2;
                        if (field801[var5 + 1] != field801[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var443 == 8) {
                        var5 -= 2;
                        if (field801[var5 + 1] == field801[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var443 == 9) {
                        var5 -= 2;
                        if (field801[var5] < field801[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var443 == 10) {
                        var5 -= 2;
                        if (field801[var5] > field801[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var443 == 21) {
                        if (field791 == 0) {
                            return;
                        }
                        class15 var19 = field792[--field791];
                        var4 = var19.field199;
                        var8 = var4.field579;
                        var9 = var4.field581;
                        var7 = var19.field193;
                        Statics.field789 = var19.field194;
                        Statics.field786 = var19.field197;
                        continue;
                    }
                    if (var443 == 25) {
                        int var20 = var9[var7];
                        field801[var5++] = class180.method3191(var20);
                        continue;
                    }
                    if (var443 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field801[var5];
                        class51 var23 = (class51) class51.field1064.method3523((long) var21);
                        class51 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field1066.method3091(14, var21);
                            class51 var26 = new class51();
                            if (var25 != null) {
                                var26.method985(new class123(var25));
                            }
                            class51.field1064.method3521(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field1071;
                        int var29 = var24.field1067;
                        int var30 = var24.field1068;
                        int var31 = class180.field2950[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class180.field2952[var28] = class180.field2952[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var443 == 31) {
                        var5 -= 2;
                        if (field801[var5] <= field801[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var443 == 32) {
                        var5 -= 2;
                        if (field801[var5] >= field801[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var443 == 33) {
                        field801[var5++] = Statics.field789[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var443 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field789[var10001] = field801[var5];
                        continue;
                    }
                    if (var443 == 35) {
                        field790[var6++] = Statics.field786[var9[var7]];
                        continue;
                    }
                    if (var443 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field786[var10001] = field790[var6];
                        continue;
                    }
                    if (var443 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String var34 = class167.method2984(field790, var6, var33);
                        field790[var6++] = var34;
                        continue;
                    }
                    if (var443 == 38) {
                        var5--;
                        continue;
                    }
                    if (var443 == 39) {
                        var6--;
                        continue;
                    }
                    if (var443 == 40) {
                        int var35 = var9[var7];
                        class24 var36 = class24.method2053(var35);
                        int[] var37 = new int[var36.field582];
                        String[] var38 = new String[var36.field578];
                        for (int var39 = 0; var39 < var36.field580; var39++) {
                            var37[var39] = field801[var5 - var36.field580 + var39];
                        }
                        for (int var40 = 0; var40 < var36.field585; var40++) {
                            var38[var40] = field790[var6 - var36.field585 + var40];
                        }
                        var5 -= var36.field580;
                        var6 -= var36.field585;
                        class15 var41 = new class15();
                        var41.field199 = var4;
                        var41.field193 = var7;
                        var41.field194 = Statics.field789;
                        var41.field197 = Statics.field786;
                        field792[++field791 - 1] = var41;
                        var4 = var36;
                        var8 = var36.field579;
                        var9 = var36.field581;
                        var7 = -1;
                        Statics.field789 = var37;
                        Statics.field786 = var38;
                        continue;
                    }
                    if (var443 == 42) {
                        field801[var5++] = Statics.field2178.method194(var9[var7]);
                        continue;
                    }
                    if (var443 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2178.method193(var10001, field801[var5]);
                        continue;
                    }
                    if (var443 == 44) {
                        int var42 = var9[var7] >> 16;
                        int var43 = var9[var7] & 0xFFFF;
                        var5--;
                        int var44 = field801[var5];
                        if (var44 >= 0 && var44 <= 5000) {
                            field787[var42] = var44;
                            byte var45 = -1;
                            if (var43 == 105) {
                                var45 = 0;
                            }
                            int var46 = 0;
                            while (true) {
                                if (var46 >= var44) {
                                    continue label2936;
                                }
                                field788[var42][var46] = var45;
                                var46++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var443 == 45) {
                        int var47 = var9[var7];
                        var5--;
                        int var48 = field801[var5];
                        if (var48 >= 0 && var48 < field787[var47]) {
                            field801[var5++] = field788[var47][var48];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var443 == 46) {
                        int var49 = var9[var7];
                        var5 -= 2;
                        int var50 = field801[var5];
                        if (var50 >= 0 && var50 < field787[var49]) {
                            field788[var49][var50] = field801[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var443 == 47) {
                        String var51 = Statics.field2178.method196(var9[var7]);
                        if (var51 == null) {
                            var51 = "null";
                        }
                        field790[var6++] = var51;
                        continue;
                    }
                    if (var443 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2178.method195(var10001, field790[var6]);
                        continue;
                    }
                }
                boolean var52;
                if (var9[var7] == 1) {
                    var52 = true;
                } else {
                    var52 = false;
                }
                if (var443 < 1000) {
                    if (var443 == 100) {
                        var5 -= 3;
                        int var53 = field801[var5];
                        int var54 = field801[var5 + 1];
                        int var55 = field801[var5 + 2];
                        if (var54 == 0) {
                            throw new RuntimeException();
                        }
                        class177 var56 = class177.method1982(var53);
                        if (var56.field2923 == null) {
                            var56.field2923 = new class177[var55 + 1];
                        }
                        if (var56.field2923.length <= var55) {
                            class177[] var57 = new class177[var55 + 1];
                            for (int var58 = 0; var58 < var56.field2923.length; var58++) {
                                var57[var58] = var56.field2923[var58];
                            }
                            var56.field2923 = var57;
                        }
                        if (var55 > 0 && var56.field2923[var55 - 1] == null) {
                            throw new RuntimeException("" + (var55 - 1));
                        }
                        class177 var59 = new class177();
                        var59.field2801 = var54;
                        var59.field2829 = var59.field2799 = var56.field2799;
                        var59.field2800 = var55;
                        var59.field2798 = true;
                        var56.field2923[var55] = var59;
                        if (var52) {
                            Statics.field793 = var59;
                        } else {
                            Statics.field1987 = var59;
                        }
                        client.method678(var56);
                        continue;
                    }
                    if (var443 == 101) {
                        class177 var60 = var52 ? Statics.field793 : Statics.field1987;
                        class177 var61 = class177.method1982(var60.field2799);
                        var61.field2923[var60.field2800] = null;
                        client.method678(var61);
                        continue;
                    }
                    if (var443 == 102) {
                        var5--;
                        class177 var62 = class177.method1982(field801[var5]);
                        var62.field2923 = null;
                        client.method678(var62);
                        continue;
                    }
                    if (var443 == 200) {
                        var5 -= 2;
                        int var63 = field801[var5];
                        int var64 = field801[var5 + 1];
                        class177 var65 = class177.method2993(var63, var64);
                        if (var65 != null && var64 != -1) {
                            field801[var5++] = 1;
                            if (var52) {
                                Statics.field793 = var65;
                            } else {
                                Statics.field1987 = var65;
                            }
                            continue;
                        }
                        field801[var5++] = 0;
                        continue;
                    }
                    if (var443 == 201) {
                        var5--;
                        class177 var66 = class177.method1982(field801[var5]);
                        if (var66 == null) {
                            field801[var5++] = 0;
                        } else {
                            field801[var5++] = 1;
                            if (var52) {
                                Statics.field793 = var66;
                            } else {
                                Statics.field1987 = var66;
                            }
                        }
                        continue;
                    }
                } else if (var443 >= 1000 && var443 < 1100 || var443 >= 2000 && var443 < 2100) {
                    int var67 = -1;
                    class177 var68;
                    if (var443 >= 2000) {
                        var443 -= 1000;
                        var5--;
                        var67 = field801[var5];
                        var68 = class177.method1982(var67);
                    } else {
                        var68 = var52 ? Statics.field793 : Statics.field1987;
                    }
                    if (var443 == 1000) {
                        var5 -= 4;
                        var68.field2808 = field801[var5];
                        var68.field2809 = field801[var5 + 1];
                        var68.field2804 = field801[var5 + 2];
                        var68.field2805 = field801[var5 + 3];
                        client.method678(var68);
                        client.method1045(var68);
                        if (var67 != -1 && var68.field2801 == 0) {
                            client.method98(Statics.field2909[var67 >> 16], var68, false);
                        }
                        continue;
                    }
                    if (var443 == 1001) {
                        var5 -= 4;
                        var68.field2806 = field801[var5];
                        var68.field2792 = field801[var5 + 1];
                        var68.field2908 = field801[var5 + 2];
                        var68.field2810 = field801[var5 + 3];
                        client.method678(var68);
                        client.method1045(var68);
                        if (var67 != -1 && var68.field2801 == 0) {
                            client.method98(Statics.field2909[var67 >> 16], var68, false);
                        }
                        continue;
                    }
                    if (var443 == 1003) {
                        var5--;
                        boolean var69 = field801[var5] == 1;
                        if (var68.field2819 != var69) {
                            var68.field2819 = var69;
                            client.method678(var68);
                        }
                        continue;
                    }
                    if (var443 == 1005) {
                        var5--;
                        var68.field2932 = field801[var5] == 1;
                        continue;
                    }
                    if (var443 == 1006) {
                        var5--;
                        var68.field2933 = field801[var5] == 1;
                        continue;
                    }
                } else if (var443 >= 1100 && var443 < 1200 || var443 >= 2100 && var443 < 2200) {
                    int var70 = -1;
                    class177 var71;
                    if (var443 >= 2000) {
                        var443 -= 1000;
                        var5--;
                        var70 = field801[var5];
                        var71 = class177.method1982(var70);
                    } else {
                        var71 = var52 ? Statics.field793 : Statics.field1987;
                    }
                    if (var443 == 1100) {
                        var5 -= 2;
                        var71.field2820 = field801[var5];
                        if (var71.field2820 > var71.field2822 - var71.field2814) {
                            var71.field2820 = var71.field2822 - var71.field2814;
                        }
                        if (var71.field2820 < 0) {
                            var71.field2820 = 0;
                        }
                        var71.field2821 = field801[var5 + 1];
                        if (var71.field2821 > var71.field2818 - var71.field2921) {
                            var71.field2821 = var71.field2818 - var71.field2921;
                        }
                        if (var71.field2821 < 0) {
                            var71.field2821 = 0;
                        }
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1101) {
                        var5--;
                        var71.field2824 = field801[var5];
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1102) {
                        var5--;
                        var71.field2828 = field801[var5] == 1;
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1103) {
                        var5--;
                        var71.field2896 = field801[var5];
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1104) {
                        var5--;
                        var71.field2832 = field801[var5];
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1105) {
                        var5--;
                        var71.field2834 = field801[var5];
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1106) {
                        var5--;
                        var71.field2836 = field801[var5];
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1107) {
                        var5--;
                        var71.field2837 = field801[var5] == 1;
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1108) {
                        var71.field2842 = 1;
                        var5--;
                        var71.field2858 = field801[var5];
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1109) {
                        var5 -= 6;
                        var71.field2788 = field801[var5];
                        var71.field2848 = field801[var5 + 1];
                        var71.field2850 = field801[var5 + 2];
                        var71.field2851 = field801[var5 + 3];
                        var71.field2852 = field801[var5 + 4];
                        var71.field2853 = field801[var5 + 5];
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1110) {
                        var5--;
                        int var72 = field801[var5];
                        if (var71.field2846 != var72) {
                            var71.field2846 = var72;
                            var71.field2812 = 0;
                            var71.field2922 = 0;
                            client.method678(var71);
                        }
                        continue;
                    }
                    if (var443 == 1111) {
                        var5--;
                        var71.field2856 = field801[var5] == 1;
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1112) {
                        var6--;
                        String var73 = field790[var6];
                        if (!var73.equals(var71.field2859)) {
                            var71.field2859 = var73;
                            client.method678(var71);
                        }
                        continue;
                    }
                    if (var443 == 1113) {
                        var5--;
                        var71.field2845 = field801[var5];
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1114) {
                        var5 -= 3;
                        var71.field2787 = field801[var5];
                        var71.field2863 = field801[var5 + 1];
                        var71.field2887 = field801[var5 + 2];
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1115) {
                        var5--;
                        var71.field2880 = field801[var5] == 1;
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1116) {
                        var5--;
                        var71.field2838 = field801[var5];
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1117) {
                        var5--;
                        var71.field2839 = field801[var5];
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1118) {
                        var5--;
                        var71.field2840 = field801[var5] == 1;
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1119) {
                        var5--;
                        var71.field2841 = field801[var5] == 1;
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1120) {
                        var5 -= 2;
                        var71.field2822 = field801[var5];
                        var71.field2818 = field801[var5 + 1];
                        client.method678(var71);
                        if (var70 != -1 && var71.field2801 == 0) {
                            client.method98(Statics.field2909[var70 >> 16], var71, false);
                        }
                        continue;
                    }
                    if (var443 == 1121) {
                        client.method721(var71.field2799, var71.field2800);
                        client.field433 = var71;
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1122) {
                        var5--;
                        var71.field2835 = field801[var5];
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1123) {
                        var5--;
                        var71.field2825 = field801[var5];
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1124) {
                        var5--;
                        var71.field2831 = field801[var5];
                        client.method678(var71);
                        continue;
                    }
                    if (var443 == 1125) {
                        var5--;
                        int var74 = field801[var5];
                        class86 var75 = (class86) class113.method1576(class86.method2072(), var74);
                        if (var75 != null) {
                            var71.field2807 = var75;
                            client.method678(var71);
                        }
                        continue;
                    }
                } else if (var443 >= 1200 && var443 < 1300 || var443 >= 2200 && var443 < 2300) {
                    class177 var76;
                    if (var443 >= 2000) {
                        var443 -= 1000;
                        var5--;
                        var76 = class177.method1982(field801[var5]);
                    } else {
                        var76 = var52 ? Statics.field793 : Statics.field1987;
                    }
                    client.method678(var76);
                    if (var443 == 1200 || var443 == 1205 || var443 == 1212) {
                        var5 -= 2;
                        int var77 = field801[var5];
                        int var78 = field801[var5 + 1];
                        var76.field2892 = var77;
                        var76.field2916 = var78;
                        class56 var79 = class56.method3201(var77);
                        var76.field2850 = var79.field1184;
                        var76.field2851 = var79.field1158;
                        var76.field2852 = var79.field1160;
                        var76.field2788 = var79.field1156;
                        var76.field2848 = var79.field1187;
                        var76.field2853 = var79.field1152;
                        if (var443 == 1205) {
                            var76.field2857 = 0;
                        } else if (var443 == 1212 | var79.field1162 == 1) {
                            var76.field2857 = 1;
                        } else {
                            var76.field2857 = 2;
                        }
                        if (var76.field2854 > 0) {
                            var76.field2853 = var76.field2853 * 32 / var76.field2854;
                        } else if (var76.field2806 > 0) {
                            var76.field2853 = var76.field2853 * 32 / var76.field2806;
                        }
                        continue;
                    }
                    if (var443 == 1201) {
                        var76.field2842 = 2;
                        var5--;
                        var76.field2858 = field801[var5];
                        continue;
                    }
                    if (var443 == 1202) {
                        var76.field2842 = 3;
                        var76.field2858 = Statics.field1663.field27.method3305();
                        continue;
                    }
                } else if (var443 >= 1300 && var443 < 1400 || var443 >= 2300 && var443 < 2400) {
                    class177 var80;
                    if (var443 >= 2000) {
                        var443 -= 1000;
                        var5--;
                        var80 = class177.method1982(field801[var5]);
                    } else {
                        var80 = var52 ? Statics.field793 : Statics.field1987;
                    }
                    if (var443 == 1300) {
                        var5--;
                        int var81 = field801[var5] - 1;
                        if (var81 >= 0 && var81 <= 9) {
                            var6--;
                            var80.method3247(var81, field790[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var443 == 1301) {
                        var5 -= 2;
                        int var82 = field801[var5];
                        int var83 = field801[var5 + 1];
                        var80.field2843 = class177.method2993(var82, var83);
                        continue;
                    }
                    if (var443 == 1302) {
                        var5--;
                        var80.field2877 = field801[var5] == 1;
                        continue;
                    }
                    if (var443 == 1303) {
                        var5--;
                        var80.field2875 = field801[var5];
                        continue;
                    }
                    if (var443 == 1304) {
                        var5--;
                        var80.field2910 = field801[var5];
                        continue;
                    }
                    if (var443 == 1305) {
                        var6--;
                        var80.field2872 = field790[var6];
                        continue;
                    }
                    if (var443 == 1306) {
                        var6--;
                        var80.field2878 = field790[var6];
                        continue;
                    }
                    if (var443 == 1307) {
                        var80.field2873 = null;
                        continue;
                    }
                } else {
                    if (var443 >= 1400 && var443 < 1500 || var443 >= 2400 && var443 < 2500) {
                        class177 var84;
                        if (var443 >= 2000) {
                            var443 -= 1000;
                            var5--;
                            var84 = class177.method1982(field801[var5]);
                        } else {
                            var84 = var52 ? Statics.field793 : Statics.field1987;
                        }
                        var6--;
                        String var85 = field790[var6];
                        int[] var86 = null;
                        if (var85.length() > 0 && var85.charAt(var85.length() - 1) == 'Y') {
                            var5--;
                            int var87 = field801[var5];
                            if (var87 > 0) {
                                var86 = new int[var87];
                                while (var87-- > 0) {
                                    var5--;
                                    var86[var87] = field801[var5];
                                }
                            }
                            var85 = var85.substring(0, var85.length() - 1);
                        }
                        Object[] var88 = new Object[var85.length() + 1];
                        for (int var89 = var88.length - 1; var89 >= 1; var89--) {
                            if (var85.charAt(var89 - 1) == 's') {
                                var6--;
                                var88[var89] = field790[var6];
                            } else {
                                var5--;
                                var88[var89] = Integer.valueOf(field801[var5]);
                            }
                        }
                        var5--;
                        int var90 = field801[var5];
                        if (var90 == -1) {
                            var88 = null;
                        } else {
                            var88[0] = Integer.valueOf(var90);
                        }
                        if (var443 == 1400) {
                            var84.field2881 = var88;
                        }
                        if (var443 == 1401) {
                            var84.field2883 = var88;
                        }
                        if (var443 == 1402) {
                            var84.field2861 = var88;
                        }
                        if (var443 == 1403) {
                            var84.field2928 = var88;
                        }
                        if (var443 == 1404) {
                            var84.field2815 = var88;
                        }
                        if (var443 == 1405) {
                            var84.field2849 = var88;
                        }
                        if (var443 == 1406) {
                            var84.field2884 = var88;
                        }
                        if (var443 == 1407) {
                            var84.field2823 = var88;
                            var84.field2893 = var86;
                        }
                        if (var443 == 1408) {
                            var84.field2898 = var88;
                        }
                        if (var443 == 1409) {
                            var84.field2874 = var88;
                        }
                        if (var443 == 1410) {
                            var84.field2889 = var88;
                        }
                        if (var443 == 1411) {
                            var84.field2882 = var88;
                        }
                        if (var443 == 1412) {
                            var84.field2886 = var88;
                        }
                        if (var443 == 1414) {
                            var84.field2894 = var88;
                            var84.field2847 = var86;
                        }
                        if (var443 == 1415) {
                            var84.field2888 = var88;
                            var84.field2897 = var86;
                        }
                        if (var443 == 1416) {
                            var84.field2890 = var88;
                        }
                        if (var443 == 1417) {
                            var84.field2900 = var88;
                        }
                        if (var443 == 1418) {
                            var84.field2901 = var88;
                        }
                        if (var443 == 1419) {
                            var84.field2902 = var88;
                        }
                        if (var443 == 1420) {
                            var84.field2903 = var88;
                        }
                        if (var443 == 1421) {
                            var84.field2904 = var88;
                        }
                        if (var443 == 1422) {
                            var84.field2905 = var88;
                        }
                        if (var443 == 1423) {
                            var84.field2906 = var88;
                        }
                        if (var443 == 1424) {
                            var84.field2907 = var88;
                        }
                        if (var443 == 1425) {
                            var84.field2891 = var88;
                        }
                        if (var443 == 1426) {
                            var84.field2895 = var88;
                        }
                        if (var443 == 1427) {
                            var84.field2919 = var88;
                        }
                        var84.field2917 = true;
                        continue;
                    }
                    if (var443 < 1600) {
                        class177 var91 = var52 ? Statics.field793 : Statics.field1987;
                        if (var443 == 1500) {
                            field801[var5++] = var91.field2830;
                            continue;
                        }
                        if (var443 == 1501) {
                            field801[var5++] = var91.field2813;
                            continue;
                        }
                        if (var443 == 1502) {
                            field801[var5++] = var91.field2814;
                            continue;
                        }
                        if (var443 == 1503) {
                            field801[var5++] = var91.field2921;
                            continue;
                        }
                        if (var443 == 1504) {
                            field801[var5++] = var91.field2819 ? 1 : 0;
                            continue;
                        }
                        if (var443 == 1505) {
                            field801[var5++] = var91.field2829;
                            continue;
                        }
                    } else if (var443 < 1700) {
                        class177 var92 = var52 ? Statics.field793 : Statics.field1987;
                        if (var443 == 1600) {
                            field801[var5++] = var92.field2820;
                            continue;
                        }
                        if (var443 == 1601) {
                            field801[var5++] = var92.field2821;
                            continue;
                        }
                        if (var443 == 1602) {
                            field790[var6++] = var92.field2859;
                            continue;
                        }
                        if (var443 == 1603) {
                            field801[var5++] = var92.field2822;
                            continue;
                        }
                        if (var443 == 1604) {
                            field801[var5++] = var92.field2818;
                            continue;
                        }
                        if (var443 == 1605) {
                            field801[var5++] = var92.field2853;
                            continue;
                        }
                        if (var443 == 1606) {
                            field801[var5++] = var92.field2850;
                            continue;
                        }
                        if (var443 == 1607) {
                            field801[var5++] = var92.field2852;
                            continue;
                        }
                        if (var443 == 1608) {
                            field801[var5++] = var92.field2851;
                            continue;
                        }
                        if (var443 == 1609) {
                            field801[var5++] = var92.field2896;
                            continue;
                        }
                        if (var443 == 1610) {
                            field801[var5++] = var92.field2831;
                            continue;
                        }
                        if (var443 == 1611) {
                            field801[var5++] = var92.field2824;
                            continue;
                        }
                        if (var443 == 1612) {
                            field801[var5++] = var92.field2825;
                            continue;
                        }
                        if (var443 == 1613) {
                            field801[var5++] = var92.field2807.method537();
                            continue;
                        }
                    } else if (var443 < 1800) {
                        class177 var93 = var52 ? Statics.field793 : Statics.field1987;
                        if (var443 == 1700) {
                            field801[var5++] = var93.field2892;
                            continue;
                        }
                        if (var443 == 1701) {
                            if (var93.field2892 == -1) {
                                field801[var5++] = 0;
                            } else {
                                field801[var5++] = var93.field2916;
                            }
                            continue;
                        }
                        if (var443 == 1702) {
                            field801[var5++] = var93.field2800;
                            continue;
                        }
                    } else if (var443 < 1900) {
                        class177 var94 = var52 ? Statics.field793 : Statics.field1987;
                        if (var443 == 1800) {
                            int[] var95 = field801;
                            int var96 = var5++;
                            int var97 = client.method137(var94);
                            int var98 = var97 >> 11 & 0x3F;
                            var95[var96] = var98;
                            continue;
                        }
                        if (var443 == 1801) {
                            var5--;
                            int var99 = field801[var5];
                            int var444 = var99 - 1;
                            if (var94.field2873 != null && var444 < var94.field2873.length && var94.field2873[var444] != null) {
                                field790[var6++] = var94.field2873[var444];
                                continue;
                            }
                            field790[var6++] = "";
                            continue;
                        }
                        if (var443 == 1802) {
                            if (var94.field2872 == null) {
                                field790[var6++] = "";
                            } else {
                                field790[var6++] = var94.field2872;
                            }
                            continue;
                        }
                    } else if (!(var443 < 1900 || var443 >= 2000) || !(var443 < 2900 || var443 >= 3000)) {
                        class177 var100;
                        if (var443 >= 2000) {
                            var443 -= 1000;
                            var5--;
                            var100 = class177.method1982(field801[var5]);
                        } else {
                            var100 = var52 ? Statics.field793 : Statics.field1987;
                        }
                        if (var443 == 1927) {
                            if (field796 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var100.field2919 == null) {
                                return;
                            }
                            class1 var101 = new class1();
                            var101.field3 = var100;
                            var101.field6 = var100.field2919;
                            var101.field14 = field796 + 1;
                            client.field468.method3581(arg0);
                            continue;
                        }
                    } else if (var443 < 2600) {
                        var5--;
                        class177 var102 = class177.method1982(field801[var5]);
                        if (var443 == 2500) {
                            field801[var5++] = var102.field2830;
                            continue;
                        }
                        if (var443 == 2501) {
                            field801[var5++] = var102.field2813;
                            continue;
                        }
                        if (var443 == 2502) {
                            field801[var5++] = var102.field2814;
                            continue;
                        }
                        if (var443 == 2503) {
                            field801[var5++] = var102.field2921;
                            continue;
                        }
                        if (var443 == 2504) {
                            field801[var5++] = var102.field2819 ? 1 : 0;
                            continue;
                        }
                        if (var443 == 2505) {
                            field801[var5++] = var102.field2829;
                            continue;
                        }
                    } else if (var443 < 2700) {
                        var5--;
                        class177 var103 = class177.method1982(field801[var5]);
                        if (var443 == 2600) {
                            field801[var5++] = var103.field2820;
                            continue;
                        }
                        if (var443 == 2601) {
                            field801[var5++] = var103.field2821;
                            continue;
                        }
                        if (var443 == 2602) {
                            field790[var6++] = var103.field2859;
                            continue;
                        }
                        if (var443 == 2603) {
                            field801[var5++] = var103.field2822;
                            continue;
                        }
                        if (var443 == 2604) {
                            field801[var5++] = var103.field2818;
                            continue;
                        }
                        if (var443 == 2605) {
                            field801[var5++] = var103.field2853;
                            continue;
                        }
                        if (var443 == 2606) {
                            field801[var5++] = var103.field2850;
                            continue;
                        }
                        if (var443 == 2607) {
                            field801[var5++] = var103.field2852;
                            continue;
                        }
                        if (var443 == 2608) {
                            field801[var5++] = var103.field2851;
                            continue;
                        }
                        if (var443 == 2609) {
                            field801[var5++] = var103.field2896;
                            continue;
                        }
                        if (var443 == 2610) {
                            field801[var5++] = var103.field2831;
                            continue;
                        }
                        if (var443 == 2611) {
                            field801[var5++] = var103.field2824;
                            continue;
                        }
                        if (var443 == 2612) {
                            field801[var5++] = var103.field2825;
                            continue;
                        }
                        if (var443 == 2613) {
                            field801[var5++] = var103.field2807.method537();
                            continue;
                        }
                    } else if (var443 < 2800) {
                        if (var443 == 2700) {
                            var5--;
                            class177 var104 = class177.method1982(field801[var5]);
                            field801[var5++] = var104.field2892;
                            continue;
                        }
                        if (var443 == 2701) {
                            var5--;
                            class177 var105 = class177.method1982(field801[var5]);
                            if (var105.field2892 == -1) {
                                field801[var5++] = 0;
                            } else {
                                field801[var5++] = var105.field2916;
                            }
                            continue;
                        }
                        if (var443 == 2702) {
                            var5--;
                            int var106 = field801[var5];
                            class4 var107 = (class4) client.field430.method3555((long) var106);
                            if (var107 == null) {
                                field801[var5++] = 0;
                            } else {
                                field801[var5++] = 1;
                            }
                            continue;
                        }
                        if (var443 == 2706) {
                            field801[var5++] = client.field513;
                            continue;
                        }
                    } else if (var443 < 2900) {
                        var5--;
                        class177 var108 = class177.method1982(field801[var5]);
                        if (var443 == 2800) {
                            int[] var109 = field801;
                            int var110 = var5++;
                            int var111 = client.method137(var108);
                            int var112 = var111 >> 11 & 0x3F;
                            var109[var110] = var112;
                            continue;
                        }
                        if (var443 == 2801) {
                            var5--;
                            int var113 = field801[var5];
                            int var445 = var113 - 1;
                            if (var108.field2873 != null && var445 < var108.field2873.length && var108.field2873[var445] != null) {
                                field790[var6++] = var108.field2873[var445];
                                continue;
                            }
                            field790[var6++] = "";
                            continue;
                        }
                        if (var443 == 2802) {
                            if (var108.field2872 == null) {
                                field790[var6++] = "";
                            } else {
                                field790[var6++] = var108.field2872;
                            }
                            continue;
                        }
                    } else if (var443 < 3200) {
                        if (var443 == 3100) {
                            var6--;
                            String var114 = field790[var6];
                            class12.method37(0, "", var114);
                            continue;
                        }
                        if (var443 == 3101) {
                            var5 -= 2;
                            client.method672(Statics.field1663, field801[var5], field801[var5 + 1]);
                            continue;
                        }
                        if (var443 == 3103) {
                            client.method2282();
                            continue;
                        }
                        if (var443 == 3104) {
                            var6--;
                            String var115 = field790[var6];
                            int var116 = 0;
                            if (class167.method2973(var115)) {
                                var116 = class167.method116(var115);
                            }
                            client.field301.method2630(192);
                            client.field301.method2524(var116);
                            continue;
                        }
                        if (var443 == 3105) {
                            var6--;
                            String var117 = field790[var6];
                            client.field301.method2630(29);
                            client.field301.method2349(var117.length() + 1);
                            client.field301.method2354(var117);
                            continue;
                        }
                        if (var443 == 3106) {
                            var6--;
                            String var118 = field790[var6];
                            client.field301.method2630(232);
                            client.field301.method2349(var118.length() + 1);
                            client.field301.method2354(var118);
                            continue;
                        }
                        if (var443 == 3107) {
                            var5--;
                            int var119 = field801[var5];
                            var6--;
                            String var120 = field790[var6];
                            client.method156(var119, var120);
                            continue;
                        }
                        if (var443 == 3108) {
                            var5 -= 3;
                            int var121 = field801[var5];
                            int var122 = field801[var5 + 1];
                            int var123 = field801[var5 + 2];
                            class177 var124 = class177.method1982(var123);
                            client.method53(var124, var121, var122);
                            continue;
                        }
                        if (var443 == 3109) {
                            var5 -= 2;
                            int var125 = field801[var5];
                            int var126 = field801[var5 + 1];
                            class177 var127 = var52 ? Statics.field793 : Statics.field1987;
                            client.method53(var127, var125, var126);
                            continue;
                        }
                        if (var443 == 3110) {
                            var5--;
                            Statics.field246 = field801[var5] == 1;
                            continue;
                        }
                        if (var443 == 3111) {
                            field801[var5++] = Statics.field985.field124 ? 1 : 0;
                            continue;
                        }
                        if (var443 == 3112) {
                            var5--;
                            Statics.field985.field124 = field801[var5] == 1;
                            class9.method2692();
                            continue;
                        }
                        if (var443 == 3113) {
                            var6--;
                            String var128 = field790[var6];
                            var5--;
                            boolean var129 = field801[var5] == 1;
                            class142.method151(var128, var129, false);
                            continue;
                        }
                        if (var443 == 3115) {
                            var5--;
                            int var130 = field801[var5];
                            client.field301.method2630(246);
                            client.field301.method2350(var130);
                            continue;
                        }
                        if (var443 == 3116) {
                            var5--;
                            int var131 = field801[var5];
                            var6 -= 2;
                            String var132 = field790[var6];
                            String var133 = field790[var6 + 1];
                            if (var132.length() <= 500 && var133.length() <= 500) {
                                client.field301.method2630(119);
                                client.field301.method2350(1 + class123.method2281(var132) + class123.method2281(var133));
                                client.field301.method2354(var132);
                                client.field301.method2354(var133);
                                client.field301.method2493(var131);
                            }
                            continue;
                        }
                    } else if (var443 < 3300) {
                        if (var443 == 3200) {
                            var5 -= 3;
                            int var134 = field801[var5];
                            int var135 = field801[var5 + 1];
                            int var136 = field801[var5 + 2];
                            if (client.field509 != 0 && var135 != 0 && client.field511 < 50) {
                                client.field512[client.field511] = var134;
                                client.field316[client.field511] = var135;
                                client.field483[client.field511] = var136;
                                client.field516[client.field511] = null;
                                client.field515[client.field511] = 0;
                                client.field511++;
                            }
                            continue;
                        }
                        if (var443 == 3201) {
                            var5--;
                            client.method2719(field801[var5]);
                            continue;
                        }
                        if (var443 == 3202) {
                            var5 -= 2;
                            int var137 = field801[var5];
                            int var10000 = field801[var5 + 1];
                            if (client.field425 != 0 && var137 != -1) {
                                class187.method986(Statics.field2034, var137, 0, client.field425, false);
                                client.field508 = true;
                            }
                            continue;
                        }
                    } else if (var443 < 3400) {
                        if (var443 == 3300) {
                            field801[var5++] = client.field326;
                            continue;
                        }
                        if (var443 == 3301) {
                            var5 -= 2;
                            int var139 = field801[var5];
                            int var140 = field801[var5 + 1];
                            field801[var5++] = class16.method2301(var139, var140);
                            continue;
                        }
                        if (var443 == 3302) {
                            var5 -= 2;
                            int var141 = field801[var5];
                            int var142 = field801[var5 + 1];
                            field801[var5++] = class16.method654(var141, var142);
                            continue;
                        }
                        if (var443 == 3303) {
                            var5 -= 2;
                            int var143 = field801[var5];
                            int var144 = field801[var5 + 1];
                            int[] var145 = field801;
                            int var146 = var5++;
                            class16 var147 = (class16) class16.field207.method3555((long) var143);
                            int var148;
                            if (var147 == null) {
                                var148 = 0;
                            } else if (var144 == -1) {
                                var148 = 0;
                            } else {
                                int var149 = 0;
                                for (int var150 = 0; var150 < var147.field203.length; var150++) {
                                    if (var147.field202[var150] == var144) {
                                        var149 += var147.field203[var150];
                                    }
                                }
                                var148 = var149;
                            }
                            var145[var146] = var148;
                            continue;
                        }
                        if (var443 == 3304) {
                            var5--;
                            int var151 = field801[var5];
                            field801[var5++] = class55.method575(var151).field1128;
                            continue;
                        }
                        if (var443 == 3305) {
                            var5--;
                            int var152 = field801[var5];
                            field801[var5++] = client.field373[var152];
                            continue;
                        }
                        if (var443 == 3306) {
                            var5--;
                            int var153 = field801[var5];
                            field801[var5++] = client.field292[var153];
                            continue;
                        }
                        if (var443 == 3307) {
                            var5--;
                            int var154 = field801[var5];
                            field801[var5++] = client.field407[var154];
                            continue;
                        }
                        if (var443 == 3308) {
                            int var155 = Statics.field1239;
                            int var156 = (Statics.field1663.field810 >> 7) + Statics.field590;
                            int var157 = (Statics.field1663.field843 >> 7) + Statics.field133;
                            field801[var5++] = (var155 << 28) + (var156 << 14) + var157;
                            continue;
                        }
                        if (var443 == 3309) {
                            var5--;
                            int var158 = field801[var5];
                            field801[var5++] = var158 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var443 == 3310) {
                            var5--;
                            int var159 = field801[var5];
                            field801[var5++] = var159 >> 28;
                            continue;
                        }
                        if (var443 == 3311) {
                            var5--;
                            int var160 = field801[var5];
                            field801[var5++] = var160 & 0x3FFF;
                            continue;
                        }
                        if (var443 == 3312) {
                            field801[var5++] = client.field487 ? 1 : 0;
                            continue;
                        }
                        if (var443 == 3313) {
                            var5 -= 2;
                            int var161 = field801[var5] + 32768;
                            int var162 = field801[var5 + 1];
                            field801[var5++] = class16.method2301(var161, var162);
                            continue;
                        }
                        if (var443 == 3314) {
                            var5 -= 2;
                            int var163 = field801[var5] + 32768;
                            int var164 = field801[var5 + 1];
                            field801[var5++] = class16.method654(var163, var164);
                            continue;
                        }
                        if (var443 == 3315) {
                            var5 -= 2;
                            int var165 = field801[var5] + 32768;
                            int var166 = field801[var5 + 1];
                            int[] var167 = field801;
                            int var168 = var5++;
                            class16 var169 = (class16) class16.field207.method3555((long) var165);
                            int var170;
                            if (var169 == null) {
                                var170 = 0;
                            } else if (var166 == -1) {
                                var170 = 0;
                            } else {
                                int var171 = 0;
                                for (int var172 = 0; var172 < var169.field203.length; var172++) {
                                    if (var169.field202[var172] == var166) {
                                        var171 += var169.field203[var172];
                                    }
                                }
                                var170 = var171;
                            }
                            var167[var168] = var170;
                            continue;
                        }
                        if (var443 == 3316) {
                            if (client.field436 >= 2) {
                                field801[var5++] = client.field436;
                            } else {
                                field801[var5++] = 0;
                            }
                            continue;
                        }
                        if (var443 == 3317) {
                            field801[var5++] = client.field291;
                            continue;
                        }
                        if (var443 == 3318) {
                            field801[var5++] = client.field266;
                            continue;
                        }
                        if (var443 == 3321) {
                            field801[var5++] = client.field289;
                            continue;
                        }
                        if (var443 == 3322) {
                            field801[var5++] = client.field435;
                            continue;
                        }
                        if (var443 == 3323) {
                            if (client.field438) {
                                field801[var5++] = 1;
                            } else {
                                field801[var5++] = 0;
                            }
                            continue;
                        }
                        if (var443 == 3324) {
                            field801[var5++] = client.field267;
                            continue;
                        }
                    } else if (var443 < 3500) {
                        if (var443 == 3400) {
                            var5 -= 2;
                            int var173 = field801[var5];
                            int var174 = field801[var5 + 1];
                            class53 var175 = class53.method2746(var173);
                            if (var175.field1105 != 's') {
                            }
                            for (int var176 = 0; var176 < var175.field1118; var176++) {
                                if (var175.field1103[var176] == var174) {
                                    field790[var6++] = var175.field1111[var176];
                                    var175 = null;
                                    break;
                                }
                            }
                            if (var175 != null) {
                                field790[var6++] = var175.field1106;
                            }
                            continue;
                        }
                        if (var443 == 3408) {
                            var5 -= 4;
                            int var177 = field801[var5];
                            int var178 = field801[var5 + 1];
                            int var179 = field801[var5 + 2];
                            int var180 = field801[var5 + 3];
                            class53 var181 = class53.method2746(var179);
                            if (var181.field1108 == var177 && var181.field1105 == var178) {
                                for (int var182 = 0; var182 < var181.field1118; var182++) {
                                    if (var181.field1103[var182] == var180) {
                                        if (var178 == 115) {
                                            field790[var6++] = var181.field1111[var182];
                                        } else {
                                            field801[var5++] = var181.field1110[var182];
                                        }
                                        var181 = null;
                                        break;
                                    }
                                }
                                if (var181 != null) {
                                    if (var178 == 115) {
                                        field790[var6++] = var181.field1106;
                                    } else {
                                        field801[var5++] = var181.field1107;
                                    }
                                }
                                continue;
                            }
                            if (var178 == 115) {
                                field790[var6++] = "null";
                            } else {
                                field801[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var443 < 3700) {
                        if (var443 == 3600) {
                            if (client.field537 == 0) {
                                field801[var5++] = -2;
                            } else if (client.field537 == 1) {
                                field801[var5++] = -1;
                            } else {
                                field801[var5++] = client.field536;
                            }
                            continue;
                        }
                        if (var443 == 3601) {
                            var5--;
                            int var183 = field801[var5];
                            if (client.field537 == 2 && var183 < client.field536) {
                                field790[var6++] = client.field464[var183].field228;
                                field790[var6++] = client.field464[var183].field225;
                                continue;
                            }
                            field790[var6++] = "";
                            field790[var6++] = "";
                            continue;
                        }
                        if (var443 == 3602) {
                            var5--;
                            int var184 = field801[var5];
                            if (client.field537 == 2 && var184 < client.field536) {
                                field801[var5++] = client.field464[var184].field226;
                                continue;
                            }
                            field801[var5++] = 0;
                            continue;
                        }
                        if (var443 == 3603) {
                            var5--;
                            int var185 = field801[var5];
                            if (client.field537 == 2 && var185 < client.field536) {
                                field801[var5++] = client.field464[var185].field229;
                                continue;
                            }
                            field801[var5++] = 0;
                            continue;
                        }
                        if (var443 == 3604) {
                            var6--;
                            String var186 = field790[var6];
                            var5--;
                            int var187 = field801[var5];
                            client.field301.method2630(244);
                            client.field301.method2349(class123.method2281(var186) + 1);
                            client.field301.method2349(var187);
                            client.field301.method2354(var186);
                            continue;
                        }
                        if (var443 == 3605) {
                            var6--;
                            String var188 = field790[var6];
                            client.method2805(var188);
                            continue;
                        }
                        if (var443 == 3606) {
                            var6--;
                            String var189 = field790[var6];
                            if (var189 == null) {
                                continue;
                            }
                            String var190 = class168.method175(var189, Statics.field519);
                            if (var190 == null) {
                                continue;
                            }
                            int var191 = 0;
                            while (true) {
                                if (var191 >= client.field536) {
                                    continue label2936;
                                }
                                class18 var192 = client.field464[var191];
                                String var193 = var192.field228;
                                String var194 = class168.method175(var193, Statics.field519);
                                if (class133.method1030(var189, var190, var193, var194)) {
                                    client.field536--;
                                    for (int var195 = var191; var195 < client.field536; var195++) {
                                        client.field464[var195] = client.field464[var195 + 1];
                                    }
                                    client.field462 = client.field454;
                                    client.field301.method2630(196);
                                    client.field301.method2349(class123.method2281(var189));
                                    client.field301.method2354(var189);
                                    continue label2936;
                                }
                                var191++;
                            }
                        }
                        if (var443 == 3607) {
                            var6--;
                            String var196 = field790[var6];
                            if (var196 == null) {
                                continue;
                            }
                            if ((client.field378 < 100 || client.field388 == 1) && client.field378 < 400) {
                                String var197 = class168.method175(var196, Statics.field519);
                                if (var197 == null) {
                                    continue;
                                }
                                for (int var198 = 0; var198 < client.field378; var198++) {
                                    class8 var199 = client.field541[var198];
                                    String var200 = class168.method175(var199.field121, Statics.field519);
                                    if (var200 != null && var200.equals(var197)) {
                                        class12.method37(31, "", var196 + class161.field2523);
                                        continue label2936;
                                    }
                                    if (var199.field117 != null) {
                                        String var201 = class168.method175(var199.field117, Statics.field519);
                                        if (var201 != null && var201.equals(var197)) {
                                            class12.method37(31, "", var196 + class161.field2523);
                                            continue label2936;
                                        }
                                    }
                                }
                                for (int var202 = 0; var202 < client.field536; var202++) {
                                    class18 var203 = client.field464[var202];
                                    String var204 = class168.method175(var203.field228, Statics.field519);
                                    if (var204 != null && var204.equals(var197)) {
                                        class12.method37(31, "", class161.field2605 + var196 + class161.field2529);
                                        continue label2936;
                                    }
                                    if (var203.field225 != null) {
                                        String var205 = class168.method175(var203.field225, Statics.field519);
                                        if (var205 != null && var205.equals(var197)) {
                                            class12.method37(31, "", class161.field2605 + var196 + class161.field2529);
                                            continue label2936;
                                        }
                                    }
                                }
                                if (class168.method175(Statics.field1663.field30, Statics.field519).equals(var197)) {
                                    class12.method37(31, "", class161.field2525);
                                } else {
                                    client.field301.method2630(143);
                                    client.field301.method2349(class123.method2281(var196));
                                    client.field301.method2354(var196);
                                }
                                continue;
                            }
                            class12.method37(31, "", class161.field2551);
                            continue;
                        }
                        if (var443 == 3608) {
                            var6--;
                            String var206 = field790[var6];
                            if (var206 == null) {
                                continue;
                            }
                            String var207 = class168.method175(var206, Statics.field519);
                            if (var207 == null) {
                                continue;
                            }
                            int var208 = 0;
                            while (true) {
                                if (var208 >= client.field378) {
                                    continue label2936;
                                }
                                class8 var209 = client.field541[var208];
                                String var210 = var209.field121;
                                String var211 = class168.method175(var210, Statics.field519);
                                if (class133.method1030(var206, var207, var210, var211)) {
                                    client.field378--;
                                    for (int var212 = var208; var212 < client.field378; var212++) {
                                        client.field541[var212] = client.field541[var212 + 1];
                                    }
                                    client.field462 = client.field454;
                                    client.field301.method2630(127);
                                    client.field301.method2349(class123.method2281(var206));
                                    client.field301.method2354(var206);
                                    continue label2936;
                                }
                                var208++;
                            }
                        }
                        if (var443 == 3609) {
                            var6--;
                            String var213 = field790[var6];
                            class156[] var214 = new class156[] { class156.field2310, class156.field2306, class156.field2308, class156.field2307, class156.field2309 };
                            class156[] var215 = var214;
                            for (int var216 = 0; var216 < var215.length; var216++) {
                                class156 var217 = var215[var216];
                                if (var217.field2305 != -1) {
                                    int var219 = var217.field2305;
                                    String var220 = "<img=" + var219 + ">";
                                    if (var213.startsWith(var220)) {
                                        var213 = var213.substring(6 + Integer.toString(var217.field2305).length());
                                        break;
                                    }
                                }
                            }
                            field801[var5++] = client.method219(var213, false) ? 1 : 0;
                            continue;
                        }
                        if (var443 == 3611) {
                            if (client.field496 == null) {
                                field790[var6++] = "";
                            } else {
                                field790[var6++] = class166.method766(client.field496);
                            }
                            continue;
                        }
                        if (var443 == 3612) {
                            if (client.field496 == null) {
                                field801[var5++] = 0;
                            } else {
                                field801[var5++] = Statics.field765;
                            }
                            continue;
                        }
                        if (var443 == 3613) {
                            var5--;
                            int var221 = field801[var5];
                            if (client.field496 != null && var221 < Statics.field765) {
                                field790[var6++] = Statics.field1817[var221].field609;
                                continue;
                            }
                            field790[var6++] = "";
                            continue;
                        }
                        if (var443 == 3614) {
                            var5--;
                            int var222 = field801[var5];
                            if (client.field496 != null && var222 < Statics.field765) {
                                field801[var5++] = Statics.field1817[var222].field612;
                                continue;
                            }
                            field801[var5++] = 0;
                            continue;
                        }
                        if (var443 == 3615) {
                            var5--;
                            int var223 = field801[var5];
                            if (client.field496 != null && var223 < Statics.field765) {
                                field801[var5++] = Statics.field1817[var223].field611;
                                continue;
                            }
                            field801[var5++] = 0;
                            continue;
                        }
                        if (var443 == 3616) {
                            field801[var5++] = Statics.field994;
                            continue;
                        }
                        if (var443 == 3617) {
                            var6--;
                            String var224 = field790[var6];
                            client.method1249(var224);
                            continue;
                        }
                        if (var443 == 3618) {
                            field801[var5++] = Statics.field12;
                            continue;
                        }
                        if (var443 == 3619) {
                            var6--;
                            String var225 = field790[var6];
                            client.method3037(var225);
                            continue;
                        }
                        if (var443 == 3620) {
                            client.field301.method2630(150);
                            client.field301.method2349(0);
                            continue;
                        }
                        if (var443 == 3621) {
                            if (client.field537 == 0) {
                                field801[var5++] = -1;
                            } else {
                                field801[var5++] = client.field378;
                            }
                            continue;
                        }
                        if (var443 == 3622) {
                            var5--;
                            int var226 = field801[var5];
                            if (client.field537 != 0 && var226 < client.field378) {
                                field790[var6++] = client.field541[var226].field121;
                                field790[var6++] = client.field541[var226].field117;
                                continue;
                            }
                            field790[var6++] = "";
                            field790[var6++] = "";
                            continue;
                        }
                        if (var443 == 3623) {
                            String var227;
                            label2698: {
                                var6--;
                                var227 = field790[var6];
                                String var229 = "<img=0>";
                                if (!var227.startsWith(var229)) {
                                    String var231 = "<img=1>";
                                    if (!var227.startsWith(var231)) {
                                        break label2698;
                                    }
                                }
                                var227 = var227.substring(7);
                            }
                            field801[var5++] = client.method752(var227) ? 1 : 0;
                            continue;
                        }
                        if (var443 == 3624) {
                            var5--;
                            int var232 = field801[var5];
                            if (Statics.field1817 != null && var232 < Statics.field765 && Statics.field1817[var232].field609.equalsIgnoreCase(Statics.field1663.field30)) {
                                field801[var5++] = 1;
                                continue;
                            }
                            field801[var5++] = 0;
                            continue;
                        }
                        if (var443 == 3625) {
                            if (client.field497 == null) {
                                field790[var6++] = "";
                            } else {
                                field790[var6++] = class166.method766(client.field497);
                            }
                            continue;
                        }
                    } else if (var443 < 4000) {
                        if (var443 == 3903) {
                            var5--;
                            int var233 = field801[var5];
                            field801[var5++] = client.field545[var233].method3769();
                            continue;
                        }
                        if (var443 == 3904) {
                            var5--;
                            int var234 = field801[var5];
                            field801[var5++] = client.field545[var234].field3220;
                            continue;
                        }
                        if (var443 == 3905) {
                            var5--;
                            int var235 = field801[var5];
                            field801[var5++] = client.field545[var235].field3222;
                            continue;
                        }
                        if (var443 == 3906) {
                            var5--;
                            int var236 = field801[var5];
                            field801[var5++] = client.field545[var236].field3219;
                            continue;
                        }
                        if (var443 == 3907) {
                            var5--;
                            int var237 = field801[var5];
                            field801[var5++] = client.field545[var237].field3223;
                            continue;
                        }
                        if (var443 == 3908) {
                            var5--;
                            int var238 = field801[var5];
                            field801[var5++] = client.field545[var238].field3224;
                            continue;
                        }
                        if (var443 == 3910) {
                            var5--;
                            int var239 = field801[var5];
                            int var240 = client.field545[var239].method3764();
                            field801[var5++] = var240 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var443 == 3911) {
                            var5--;
                            int var241 = field801[var5];
                            int var242 = client.field545[var241].method3764();
                            field801[var5++] = var242 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var443 == 3912) {
                            var5--;
                            int var243 = field801[var5];
                            int var244 = client.field545[var243].method3764();
                            field801[var5++] = var244 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var443 == 3913) {
                            var5--;
                            int var245 = field801[var5];
                            int var246 = client.field545[var245].method3764();
                            field801[var5++] = var246 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var443 == 3914) {
                            var5--;
                            boolean var247 = field801[var5] == 1;
                            if (Statics.field2005 != null) {
                                Statics.field2005.method3791(class225.field3229, var247);
                            }
                            continue;
                        }
                        if (var443 == 3915) {
                            var5--;
                            boolean var248 = field801[var5] == 1;
                            if (Statics.field2005 != null) {
                                Statics.field2005.method3791(class225.field3228, var248);
                            }
                            continue;
                        }
                        if (var443 == 3916) {
                            var5 -= 2;
                            boolean var249 = field801[var5] == 1;
                            boolean var250 = field801[var5 + 1] == 1;
                            if (Statics.field2005 != null) {
                                Statics.field2005.method3791(new class23(var250), var249);
                            }
                            continue;
                        }
                        if (var443 == 3917) {
                            var5--;
                            boolean var251 = field801[var5] == 1;
                            if (Statics.field2005 != null) {
                                Statics.field2005.method3791(class225.field3227, var251);
                            }
                            continue;
                        }
                        if (var443 == 3918) {
                            var5--;
                            boolean var252 = field801[var5] == 1;
                            if (Statics.field2005 != null) {
                                Statics.field2005.method3791(class225.field3226, var252);
                            }
                            continue;
                        }
                        if (var443 == 3919) {
                            field801[var5++] = Statics.field2005 == null ? 0 : Statics.field2005.field3230.size();
                            continue;
                        }
                        if (var443 == 3920) {
                            var5--;
                            int var253 = field801[var5];
                            class218 var254 = (class218) Statics.field2005.field3230.get(var253);
                            field801[var5++] = var254.field3200;
                            continue;
                        }
                        if (var443 == 3921) {
                            var5--;
                            int var255 = field801[var5];
                            class218 var256 = (class218) Statics.field2005.field3230.get(var255);
                            field790[var6++] = var256.method3724();
                            continue;
                        }
                        if (var443 == 3922) {
                            var5--;
                            int var257 = field801[var5];
                            class218 var258 = (class218) Statics.field2005.field3230.get(var257);
                            field790[var6++] = var258.method3728();
                            continue;
                        }
                        if (var443 == 3923) {
                            var5--;
                            int var259 = field801[var5];
                            class218 var260 = (class218) Statics.field2005.field3230.get(var259);
                            long var261 = class119.method2280() - Statics.field736 - var260.field3199;
                            int var263 = (int) (var261 / 3600000L);
                            int var264 = (int) ((var261 - (long) (var263 * 3600000)) / 60000L);
                            int var265 = (int) ((var261 - (long) (var263 * 3600000) - (long) (var264 * 60000)) / 1000L);
                            String var266 = var263 + ":" + var264 / 10 + var264 % 10 + ":" + var265 / 10 + var265 % 10;
                            field790[var6++] = var266;
                            continue;
                        }
                        if (var443 == 3924) {
                            var5--;
                            int var267 = field801[var5];
                            class218 var268 = (class218) Statics.field2005.field3230.get(var267);
                            field801[var5++] = var268.field3203.field3219;
                            continue;
                        }
                        if (var443 == 3925) {
                            var5--;
                            int var269 = field801[var5];
                            class218 var270 = (class218) Statics.field2005.field3230.get(var269);
                            field801[var5++] = var270.field3203.field3222;
                            continue;
                        }
                        if (var443 == 3926) {
                            var5--;
                            int var271 = field801[var5];
                            class218 var272 = (class218) Statics.field2005.field3230.get(var271);
                            field801[var5++] = var272.field3203.field3220;
                            continue;
                        }
                    } else if (var443 < 4100) {
                        if (var443 == 4000) {
                            var5 -= 2;
                            int var273 = field801[var5];
                            int var274 = field801[var5 + 1];
                            field801[var5++] = var273 + var274;
                            continue;
                        }
                        if (var443 == 4001) {
                            var5 -= 2;
                            int var275 = field801[var5];
                            int var276 = field801[var5 + 1];
                            field801[var5++] = var275 - var276;
                            continue;
                        }
                        if (var443 == 4002) {
                            var5 -= 2;
                            int var277 = field801[var5];
                            int var278 = field801[var5 + 1];
                            field801[var5++] = var277 * var278;
                            continue;
                        }
                        if (var443 == 4003) {
                            var5 -= 2;
                            int var279 = field801[var5];
                            int var280 = field801[var5 + 1];
                            field801[var5++] = var279 / var280;
                            continue;
                        }
                        if (var443 == 4004) {
                            var5--;
                            int var281 = field801[var5];
                            field801[var5++] = (int) (Math.random() * (double) var281);
                            continue;
                        }
                        if (var443 == 4005) {
                            var5--;
                            int var282 = field801[var5];
                            field801[var5++] = (int) (Math.random() * (double) (var282 + 1));
                            continue;
                        }
                        if (var443 == 4006) {
                            var5 -= 5;
                            int var283 = field801[var5];
                            int var284 = field801[var5 + 1];
                            int var285 = field801[var5 + 2];
                            int var286 = field801[var5 + 3];
                            int var287 = field801[var5 + 4];
                            field801[var5++] = (var284 - var283) * (var287 - var285) / (var286 - var285) + var283;
                            continue;
                        }
                        if (var443 == 4007) {
                            var5 -= 2;
                            int var288 = field801[var5];
                            int var289 = field801[var5 + 1];
                            field801[var5++] = var288 * var289 / 100 + var288;
                            continue;
                        }
                        if (var443 == 4008) {
                            var5 -= 2;
                            int var290 = field801[var5];
                            int var291 = field801[var5 + 1];
                            field801[var5++] = var290 | 0x1 << var291;
                            continue;
                        }
                        if (var443 == 4009) {
                            var5 -= 2;
                            int var292 = field801[var5];
                            int var293 = field801[var5 + 1];
                            field801[var5++] = var292 & -1 - (0x1 << var293);
                            continue;
                        }
                        if (var443 == 4010) {
                            var5 -= 2;
                            int var294 = field801[var5];
                            int var295 = field801[var5 + 1];
                            field801[var5++] = (var294 & 0x1 << var295) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var443 == 4011) {
                            var5 -= 2;
                            int var296 = field801[var5];
                            int var297 = field801[var5 + 1];
                            field801[var5++] = var296 % var297;
                            continue;
                        }
                        if (var443 == 4012) {
                            var5 -= 2;
                            int var298 = field801[var5];
                            int var299 = field801[var5 + 1];
                            if (var298 == 0) {
                                field801[var5++] = 0;
                            } else {
                                field801[var5++] = (int) Math.pow((double) var298, (double) var299);
                            }
                            continue;
                        }
                        if (var443 == 4013) {
                            var5 -= 2;
                            int var300 = field801[var5];
                            int var301 = field801[var5 + 1];
                            if (var300 == 0) {
                                field801[var5++] = 0;
                            } else if (var301 == 0) {
                                field801[var5++] = Integer.MAX_VALUE;
                            } else {
                                field801[var5++] = (int) Math.pow((double) var300, 1.0D / (double) var301);
                            }
                            continue;
                        }
                        if (var443 == 4014) {
                            var5 -= 2;
                            int var302 = field801[var5];
                            int var303 = field801[var5 + 1];
                            field801[var5++] = var302 & var303;
                            continue;
                        }
                        if (var443 == 4015) {
                            var5 -= 2;
                            int var304 = field801[var5];
                            int var305 = field801[var5 + 1];
                            field801[var5++] = var304 | var305;
                            continue;
                        }
                        if (var443 == 4018) {
                            var5 -= 3;
                            long var306 = (long) field801[var5];
                            long var308 = (long) field801[var5 + 1];
                            long var310 = (long) field801[var5 + 2];
                            field801[var5++] = (int) (var306 * var310 / var308);
                            continue;
                        }
                    } else if (var443 < 4200) {
                        if (var443 == 4100) {
                            var6--;
                            String var312 = field790[var6];
                            var5--;
                            int var313 = field801[var5];
                            field790[var6++] = var312 + var313;
                            continue;
                        }
                        if (var443 == 4101) {
                            var6 -= 2;
                            String var314 = field790[var6];
                            String var315 = field790[var6 + 1];
                            field790[var6++] = var314 + var315;
                            continue;
                        }
                        if (var443 == 4102) {
                            var6--;
                            String var316 = field790[var6];
                            var5--;
                            int var317 = field801[var5];
                            field790[var6++] = var316 + class167.method2806(var317, true);
                            continue;
                        }
                        if (var443 == 4103) {
                            var6--;
                            String var318 = field790[var6];
                            field790[var6++] = var318.toLowerCase();
                            continue;
                        }
                        if (var443 == 4104) {
                            var5--;
                            int var319 = field801[var5];
                            long var320 = ((long) var319 + 11745L) * 86400000L;
                            field783.setTime(new Date(var320));
                            int var322 = field783.get(5);
                            int var323 = field783.get(2);
                            int var324 = field783.get(1);
                            field790[var6++] = var322 + "-" + field795[var323] + "-" + var324;
                            continue;
                        }
                        if (var443 == 4105) {
                            var6 -= 2;
                            String var325 = field790[var6];
                            String var326 = field790[var6 + 1];
                            if (Statics.field1663.field27 != null && Statics.field1663.field27.field2961) {
                                field790[var6++] = var326;
                                continue;
                            }
                            field790[var6++] = var325;
                            continue;
                        }
                        if (var443 == 4106) {
                            var5--;
                            int var327 = field801[var5];
                            field790[var6++] = Integer.toString(var327);
                            continue;
                        }
                        if (var443 == 4107) {
                            var6 -= 2;
                            int[] var328 = field801;
                            int var329 = var5++;
                            int var330 = class170.method2697(field790[var6], field790[var6 + 1], client.field347);
                            byte var331;
                            if (var330 > 0) {
                                var331 = 1;
                            } else if (var330 < 0) {
                                var331 = -1;
                            } else {
                                var331 = 0;
                            }
                            var328[var329] = var331;
                            continue;
                        }
                        if (var443 == 4108) {
                            var6--;
                            String var332 = field790[var6];
                            var5 -= 2;
                            int var333 = field801[var5];
                            int var334 = field801[var5 + 1];
                            byte[] var335 = Statics.field300.method3091(var334, 0);
                            class228 var336 = new class228(var335);
                            field801[var5++] = var336.method3851(var332, var333);
                            continue;
                        }
                        if (var443 == 4109) {
                            var6--;
                            String var337 = field790[var6];
                            var5 -= 2;
                            int var338 = field801[var5];
                            int var339 = field801[var5 + 1];
                            byte[] var340 = Statics.field300.method3091(var339, 0);
                            class228 var341 = new class228(var340);
                            field801[var5++] = var341.method3809(var337, var338);
                            continue;
                        }
                        if (var443 == 4110) {
                            var6 -= 2;
                            String var342 = field790[var6];
                            String var343 = field790[var6 + 1];
                            var5--;
                            if (field801[var5] == 1) {
                                field790[var6++] = var342;
                            } else {
                                field790[var6++] = var343;
                            }
                            continue;
                        }
                        if (var443 == 4111) {
                            var6--;
                            String var344 = field790[var6];
                            field790[var6++] = class227.method3833(var344);
                            continue;
                        }
                        if (var443 == 4112) {
                            var6--;
                            String var345 = field790[var6];
                            var5--;
                            int var346 = field801[var5];
                            field790[var6++] = var345 + (char) var346;
                            continue;
                        }
                        if (var443 == 4113) {
                            var5--;
                            int var347 = field801[var5];
                            int[] var348 = field801;
                            int var349 = var5++;
                            char var350 = (char) var347;
                            boolean var351;
                            if (var350 >= ' ' && var350 <= '~') {
                                var351 = true;
                            } else if (var350 >= 160 && var350 <= 255) {
                                var351 = true;
                            } else if (var350 == 8364 || var350 == 338 || var350 == 8212 || var350 == 339 || var350 == 376) {
                                var351 = true;
                            } else {
                                var351 = false;
                            }
                            var348[var349] = var351 ? 1 : 0;
                            continue;
                        }
                        if (var443 == 4114) {
                            var5--;
                            int var352 = field801[var5];
                            field801[var5++] = class167.method2967((char) var352) ? 1 : 0;
                            continue;
                        }
                        if (var443 == 4115) {
                            var5--;
                            int var353 = field801[var5];
                            int[] var354 = field801;
                            int var355 = var5++;
                            char var356 = (char) var353;
                            boolean var357 = var356 >= 'A' && var356 <= 'Z' || var356 >= 'a' && var356 <= 'z';
                            var354[var355] = var357 ? 1 : 0;
                            continue;
                        }
                        if (var443 == 4116) {
                            var5--;
                            int var358 = field801[var5];
                            field801[var5++] = class167.method1981((char) var358) ? 1 : 0;
                            continue;
                        }
                        if (var443 == 4117) {
                            var6--;
                            String var359 = field790[var6];
                            if (var359 == null) {
                                field801[var5++] = 0;
                            } else {
                                field801[var5++] = var359.length();
                            }
                            continue;
                        }
                        if (var443 == 4118) {
                            var6--;
                            String var360 = field790[var6];
                            var5 -= 2;
                            int var361 = field801[var5];
                            int var362 = field801[var5 + 1];
                            field790[var6++] = var360.substring(var361, var362);
                            continue;
                        }
                        if (var443 == 4119) {
                            var6--;
                            String var363 = field790[var6];
                            StringBuilder var364 = new StringBuilder(var363.length());
                            boolean var365 = false;
                            for (int var366 = 0; var366 < var363.length(); var366++) {
                                char var367 = var363.charAt(var366);
                                if (var367 == '<') {
                                    var365 = true;
                                } else if (var367 == '>') {
                                    var365 = false;
                                } else if (!var365) {
                                    var364.append(var367);
                                }
                            }
                            field790[var6++] = var364.toString();
                            continue;
                        }
                        if (var443 == 4120) {
                            var6--;
                            String var368 = field790[var6];
                            var5--;
                            int var369 = field801[var5];
                            field801[var5++] = var368.indexOf(var369);
                            continue;
                        }
                        if (var443 == 4121) {
                            var6 -= 2;
                            String var370 = field790[var6];
                            String var371 = field790[var6 + 1];
                            var5--;
                            int var372 = field801[var5];
                            field801[var5++] = var370.indexOf(var371, var372);
                            continue;
                        }
                    } else if (var443 < 4300) {
                        if (var443 == 4200) {
                            var5--;
                            int var373 = field801[var5];
                            field790[var6++] = class56.method3201(var373).field1151;
                            continue;
                        }
                        if (var443 == 4201) {
                            var5 -= 2;
                            int var374 = field801[var5];
                            int var375 = field801[var5 + 1];
                            class56 var376 = class56.method3201(var374);
                            if (var375 >= 1 && var375 <= 5 && var376.field1165[var375 - 1] != null) {
                                field790[var6++] = var376.field1165[var375 - 1];
                                continue;
                            }
                            field790[var6++] = "";
                            continue;
                        }
                        if (var443 == 4202) {
                            var5 -= 2;
                            int var377 = field801[var5];
                            int var378 = field801[var5 + 1];
                            class56 var379 = class56.method3201(var377);
                            if (var378 >= 1 && var378 <= 5 && var379.field1166[var378 - 1] != null) {
                                field790[var6++] = var379.field1166[var378 - 1];
                                continue;
                            }
                            field790[var6++] = "";
                            continue;
                        }
                        if (var443 == 4203) {
                            var5--;
                            int var380 = field801[var5];
                            field801[var5++] = class56.method3201(var380).field1163;
                            continue;
                        }
                        if (var443 == 4204) {
                            var5--;
                            int var381 = field801[var5];
                            field801[var5++] = class56.method3201(var381).field1162 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var443 == 4205) {
                            var5--;
                            int var382 = field801[var5];
                            class56 var383 = class56.method3201(var382);
                            if (var383.field1182 == -1 && var383.field1159 >= 0) {
                                field801[var5++] = var383.field1159;
                                continue;
                            }
                            field801[var5++] = var382;
                            continue;
                        }
                        if (var443 == 4206) {
                            var5--;
                            int var384 = field801[var5];
                            class56 var385 = class56.method3201(var384);
                            if (var385.field1182 >= 0 && var385.field1159 >= 0) {
                                field801[var5++] = var385.field1159;
                                continue;
                            }
                            field801[var5++] = var384;
                            continue;
                        }
                        if (var443 == 4207) {
                            var5--;
                            int var386 = field801[var5];
                            field801[var5++] = class56.method3201(var386).field1140 ? 1 : 0;
                            continue;
                        }
                        if (var443 == 4208) {
                            var5--;
                            int var387 = field801[var5];
                            class56 var388 = class56.method3201(var387);
                            if (var388.field1155 == -1 && var388.field1192 >= 0) {
                                field801[var5++] = var388.field1192;
                                continue;
                            }
                            field801[var5++] = var387;
                            continue;
                        }
                        if (var443 == 4209) {
                            var5--;
                            int var389 = field801[var5];
                            class56 var390 = class56.method3201(var389);
                            if (var390.field1155 >= 0 && var390.field1192 >= 0) {
                                field801[var5++] = var390.field1192;
                                continue;
                            }
                            field801[var5++] = var389;
                            continue;
                        }
                        if (var443 == 4210) {
                            var6--;
                            String var391 = field790[var6];
                            var5--;
                            int var392 = field801[var5];
                            client.method1610(var391, var392 == 1);
                            field801[var5++] = Statics.field20;
                            continue;
                        }
                        if (var443 == 4211) {
                            if (Statics.field198 != null && Statics.field204 < Statics.field20) {
                                field801[var5++] = Statics.field198[++Statics.field204 - 1] & 0xFFFF;
                                continue;
                            }
                            field801[var5++] = -1;
                            continue;
                        }
                        if (var443 == 4212) {
                            Statics.field204 = 0;
                            continue;
                        }
                    } else if (var443 < 5100) {
                        if (var443 == 5000) {
                            field801[var5++] = client.field538;
                            continue;
                        }
                        if (var443 == 5001) {
                            var5 -= 3;
                            client.field538 = field801[var5];
                            int var393 = field801[var5 + 1];
                            class134[] var394 = class134.method1798();
                            int var395 = 0;
                            class134 var397;
                            while (true) {
                                if (var395 >= var394.length) {
                                    var397 = null;
                                    break;
                                }
                                class134 var396 = var394[var395];
                                if (var396.field2099 == var393) {
                                    var397 = var396;
                                    break;
                                }
                                var395++;
                            }
                            Statics.field3170 = var397;
                            if (Statics.field3170 == null) {
                                Statics.field3170 = class134.field2096;
                            }
                            client.field488 = field801[var5 + 2];
                            client.field301.method2630(134);
                            client.field301.method2349(client.field538);
                            client.field301.method2349(Statics.field3170.field2099);
                            client.field301.method2349(client.field488);
                            continue;
                        }
                        if (var443 == 5002) {
                            var6--;
                            String var398 = field790[var6];
                            var5 -= 2;
                            int var399 = field801[var5];
                            int var400 = field801[var5 + 1];
                            client.field301.method2630(151);
                            client.field301.method2349(class123.method2281(var398) + 2);
                            client.field301.method2354(var398);
                            client.field301.method2349(var399 - 1);
                            client.field301.method2349(var400);
                            continue;
                        }
                        if (var443 == 5003) {
                            var5 -= 2;
                            int var401 = field801[var5];
                            int var402 = field801[var5 + 1];
                            class38 var403 = class12.method126(var401, var402);
                            if (var403 == null) {
                                field801[var5++] = -1;
                                field801[var5++] = 0;
                                field790[var6++] = "";
                                field790[var6++] = "";
                                field790[var6++] = "";
                            } else {
                                field801[var5++] = var403.field775;
                                field801[var5++] = var403.field772;
                                field790[var6++] = var403.field774 == null ? "" : var403.field774;
                                field790[var6++] = var403.field779 == null ? "" : var403.field779;
                                field790[var6++] = var403.field776 == null ? "" : var403.field776;
                            }
                            continue;
                        }
                        if (var443 == 5004) {
                            var5--;
                            int var404 = field801[var5];
                            class38 var405 = (class38) class12.field169.method3572((long) var404);
                            if (var405 == null) {
                                field801[var5++] = -1;
                                field801[var5++] = 0;
                                field790[var6++] = "";
                                field790[var6++] = "";
                                field790[var6++] = "";
                            } else {
                                field801[var5++] = var405.field773;
                                field801[var5++] = var405.field772;
                                field790[var6++] = var405.field774 == null ? "" : var405.field774;
                                field790[var6++] = var405.field779 == null ? "" : var405.field779;
                                field790[var6++] = var405.field776 == null ? "" : var405.field776;
                            }
                            continue;
                        }
                        if (var443 == 5005) {
                            if (Statics.field3170 == null) {
                                field801[var5++] = -1;
                            } else {
                                field801[var5++] = Statics.field3170.field2099;
                            }
                            continue;
                        }
                        if (var443 == 5008) {
                            var6--;
                            String var407 = field790[var6];
                            var5--;
                            int var408 = field801[var5];
                            String var409 = var407.toLowerCase();
                            byte var410 = 0;
                            if (var409.startsWith(class161.field2530)) {
                                var410 = 0;
                                var407 = var407.substring(class161.field2530.length());
                            } else if (var409.startsWith(class161.field2532)) {
                                var410 = 1;
                                var407 = var407.substring(class161.field2532.length());
                            } else if (var409.startsWith(class161.field2449)) {
                                var410 = 2;
                                var407 = var407.substring(class161.field2449.length());
                            } else if (var409.startsWith(class161.field2359)) {
                                var410 = 3;
                                var407 = var407.substring(class161.field2359.length());
                            } else if (var409.startsWith(class161.field2538)) {
                                var410 = 4;
                                var407 = var407.substring(class161.field2538.length());
                            } else if (var409.startsWith(class161.field2438)) {
                                var410 = 5;
                                var407 = var407.substring(class161.field2438.length());
                            } else if (var409.startsWith(class161.field2565)) {
                                var410 = 6;
                                var407 = var407.substring(class161.field2565.length());
                            } else if (var409.startsWith(class161.field2618)) {
                                var410 = 7;
                                var407 = var407.substring(class161.field2618.length());
                            } else if (var409.startsWith(class161.field2546)) {
                                var410 = 8;
                                var407 = var407.substring(class161.field2546.length());
                            } else if (var409.startsWith(class161.field2531)) {
                                var410 = 9;
                                var407 = var407.substring(class161.field2531.length());
                            } else if (var409.startsWith(class161.field2434)) {
                                var410 = 10;
                                var407 = var407.substring(class161.field2434.length());
                            } else if (var409.startsWith(class161.field2502)) {
                                var410 = 11;
                                var407 = var407.substring(class161.field2502.length());
                            } else if (client.field347 != 0) {
                                if (var409.startsWith(class161.field2470)) {
                                    var410 = 0;
                                    var407 = var407.substring(class161.field2470.length());
                                } else if (var409.startsWith(class161.field2533)) {
                                    var410 = 1;
                                    var407 = var407.substring(class161.field2533.length());
                                } else if (var409.startsWith(class161.field2592)) {
                                    var410 = 2;
                                    var407 = var407.substring(class161.field2592.length());
                                } else if (var409.startsWith(class161.field2461)) {
                                    var410 = 3;
                                    var407 = var407.substring(class161.field2461.length());
                                } else if (var409.startsWith(class161.field2611)) {
                                    var410 = 4;
                                    var407 = var407.substring(class161.field2611.length());
                                } else if (var409.startsWith(class161.field2541)) {
                                    var410 = 5;
                                    var407 = var407.substring(class161.field2541.length());
                                } else if (var409.startsWith(class161.field2534)) {
                                    var410 = 6;
                                    var407 = var407.substring(class161.field2534.length());
                                } else if (var409.startsWith(class161.field2545)) {
                                    var410 = 7;
                                    var407 = var407.substring(class161.field2545.length());
                                } else if (var409.startsWith(class161.field2547)) {
                                    var410 = 8;
                                    var407 = var407.substring(class161.field2547.length());
                                } else if (var409.startsWith(class161.field2549)) {
                                    var410 = 9;
                                    var407 = var407.substring(class161.field2549.length());
                                } else if (var409.startsWith(class161.field2437)) {
                                    var410 = 10;
                                    var407 = var407.substring(class161.field2437.length());
                                } else if (var409.startsWith(class161.field2553)) {
                                    var410 = 11;
                                    var407 = var407.substring(class161.field2553.length());
                                }
                            }
                            String var411 = var407.toLowerCase();
                            byte var412 = 0;
                            if (var411.startsWith(class161.field2375)) {
                                var412 = 1;
                                var407 = var407.substring(class161.field2375.length());
                            } else if (var411.startsWith(class161.field2556)) {
                                var412 = 2;
                                var407 = var407.substring(class161.field2556.length());
                            } else if (var411.startsWith(class161.field2558)) {
                                var412 = 3;
                                var407 = var407.substring(class161.field2558.length());
                            } else if (var411.startsWith(class161.field2560)) {
                                var412 = 4;
                                var407 = var407.substring(class161.field2560.length());
                            } else if (var411.startsWith(class161.field2415)) {
                                var412 = 5;
                                var407 = var407.substring(class161.field2415.length());
                            } else if (client.field347 != 0) {
                                if (var411.startsWith(class161.field2555)) {
                                    var412 = 1;
                                    var407 = var407.substring(class161.field2555.length());
                                } else if (var411.startsWith(class161.field2481)) {
                                    var412 = 2;
                                    var407 = var407.substring(class161.field2481.length());
                                } else if (var411.startsWith(class161.field2559)) {
                                    var412 = 3;
                                    var407 = var407.substring(class161.field2559.length());
                                } else if (var411.startsWith(class161.field2561)) {
                                    var412 = 4;
                                    var407 = var407.substring(class161.field2561.length());
                                } else if (var411.startsWith(class161.field2563)) {
                                    var412 = 5;
                                    var407 = var407.substring(class161.field2563.length());
                                }
                            }
                            client.field301.method2630(50);
                            client.field301.method2349(0);
                            int var413 = client.field301.field2028;
                            client.field301.method2349(var408);
                            client.field301.method2349(var410);
                            client.field301.method2349(var412);
                            class226.method561(client.field301, var407);
                            client.field301.method2360(client.field301.field2028 - var413);
                            continue;
                        }
                        if (var443 == 5009) {
                            var6 -= 2;
                            String var414 = field790[var6];
                            String var415 = field790[var6 + 1];
                            client.field301.method2630(201);
                            client.field301.method2350(0);
                            int var416 = client.field301.field2028;
                            client.field301.method2354(var414);
                            class226.method561(client.field301, var415);
                            client.field301.method2514(client.field301.field2028 - var416);
                            continue;
                        }
                        if (var443 == 5015) {
                            String var417;
                            if (Statics.field1663 == null || Statics.field1663.field30 == null) {
                                var417 = "";
                            } else {
                                var417 = Statics.field1663.field30;
                            }
                            field790[var6++] = var417;
                            continue;
                        }
                        if (var443 == 5016) {
                            field801[var5++] = client.field488;
                            continue;
                        }
                        if (var443 == 5017) {
                            var5--;
                            int var418 = field801[var5];
                            field801[var5++] = class12.method586(var418);
                            continue;
                        }
                        if (var443 == 5018) {
                            var5--;
                            int var419 = field801[var5];
                            field801[var5++] = class12.method192(var419);
                            continue;
                        }
                        if (var443 == 5019) {
                            var5--;
                            int var420 = field801[var5];
                            field801[var5++] = class12.method170(var420);
                            continue;
                        }
                        if (var443 == 5020) {
                            var6--;
                            String var421 = field790[var6];
                            if (var421.equalsIgnoreCase("toggleroof")) {
                                Statics.field985.field124 = !Statics.field985.field124;
                                class9.method2692();
                                if (Statics.field985.field124) {
                                    class12.method37(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method37(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var421.equalsIgnoreCase("displayfps")) {
                                client.field283 = !client.field283;
                            }
                            if (client.field436 >= 2) {
                                if (var421.equalsIgnoreCase("fpson")) {
                                    client.field283 = true;
                                }
                                if (var421.equalsIgnoreCase("fpsoff")) {
                                    client.field283 = false;
                                }
                                if (var421.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var421.equalsIgnoreCase("clientdrop")) {
                                    if (client.field549 > 0) {
                                        client.method2969();
                                    } else {
                                        client.method2278(40);
                                        Statics.field1395 = Statics.field696;
                                        Statics.field696 = null;
                                    }
                                }
                                if (var421.equalsIgnoreCase("errortest") && client.field268 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field301.method2630(34);
                            client.field301.method2349(var421.length() + 1);
                            client.field301.method2354(var421);
                            continue;
                        }
                        if (var443 == 5021) {
                            var6--;
                            client.field489 = field790[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var443 == 5022) {
                            field790[var6++] = client.field489;
                            continue;
                        }
                    }
                }
                if (var443 < 5400) {
                    if (var443 == 5306) {
                        field801[var5++] = client.method2981();
                        continue;
                    }
                    if (var443 == 5307) {
                        var5--;
                        int var422 = field801[var5];
                        if (var422 == 1 || var422 == 2) {
                            client.method573(var422);
                        }
                        continue;
                    }
                    if (var443 == 5308) {
                        field801[var5++] = Statics.field985.field126;
                        continue;
                    }
                    if (var443 == 5309) {
                        var5--;
                        int var423 = field801[var5];
                        if (var423 == 1 || var423 == 2) {
                            Statics.field985.field126 = var423;
                            class9.method2692();
                        }
                        continue;
                    }
                }
                if (var443 < 5600) {
                    if (var443 == 5504) {
                        var5 -= 2;
                        int var424 = field801[var5];
                        int var425 = field801[var5 + 1];
                        if (!client.field517) {
                            client.field354 = var424;
                            client.field355 = var425;
                        }
                        continue;
                    }
                    if (var443 == 5505) {
                        field801[var5++] = client.field354;
                        continue;
                    }
                    if (var443 == 5506) {
                        field801[var5++] = client.field355;
                        continue;
                    }
                    if (var443 == 5530) {
                        var5--;
                        int var426 = field801[var5];
                        if (var426 < 0) {
                            var426 = 0;
                        }
                        client.field360 = var426;
                        continue;
                    }
                    if (var443 == 5531) {
                        field801[var5++] = client.field360;
                        continue;
                    }
                }
                if (var443 >= 5700 || var443 != 5630) {
                    if (var443 < 6300) {
                        if (var443 == 6200) {
                            var5 -= 2;
                            client.field523 = (short) field801[var5];
                            if (client.field523 <= 0) {
                                client.field523 = 256;
                            }
                            client.field524 = (short) field801[var5 + 1];
                            if (client.field524 <= 0) {
                                client.field524 = 205;
                            }
                            continue;
                        }
                        if (var443 == 6201) {
                            var5 -= 2;
                            client.field525 = (short) field801[var5];
                            if (client.field525 <= 0) {
                                client.field525 = 256;
                            }
                            client.field526 = (short) field801[var5 + 1];
                            if (client.field526 <= 0) {
                                client.field526 = 320;
                            }
                            continue;
                        }
                        if (var443 == 6202) {
                            var5 -= 4;
                            client.field303 = (short) field801[var5];
                            if (client.field303 <= 0) {
                                client.field303 = 1;
                            }
                            client.field521 = (short) field801[var5 + 1];
                            if (client.field521 <= 0) {
                                client.field521 = 32767;
                            } else if (client.field521 < client.field303) {
                                client.field521 = client.field303;
                            }
                            client.field529 = (short) field801[var5 + 2];
                            if (client.field529 <= 0) {
                                client.field529 = 1;
                            }
                            client.field530 = (short) field801[var5 + 3];
                            if (client.field530 <= 0) {
                                client.field530 = 32767;
                            } else if (client.field530 < client.field529) {
                                client.field530 = client.field529;
                            }
                            continue;
                        }
                        if (var443 == 6203) {
                            if (client.field441 == null) {
                                field801[var5++] = -1;
                                field801[var5++] = -1;
                            } else {
                                client.method1515(0, 0, client.field441.field2814, client.field441.field2921, false);
                                field801[var5++] = client.field533;
                                field801[var5++] = client.field466;
                            }
                            continue;
                        }
                        if (var443 == 6204) {
                            field801[var5++] = client.field525;
                            field801[var5++] = client.field526;
                            continue;
                        }
                        if (var443 == 6205) {
                            field801[var5++] = client.field523;
                            field801[var5++] = client.field524;
                            continue;
                        }
                    }
                    if (var443 < 6600) {
                        if (var443 == 6500) {
                            field801[var5++] = class28.method669() ? 1 : 0;
                            continue;
                        }
                        if (var443 == 6501) {
                            class28.field642 = 0;
                            class28 var427 = class28.method389();
                            if (var427 == null) {
                                field801[var5++] = -1;
                                field801[var5++] = 0;
                                field790[var6++] = "";
                                field801[var5++] = 0;
                                field801[var5++] = 0;
                                field790[var6++] = "";
                            } else {
                                field801[var5++] = var427.field627;
                                field801[var5++] = var427.field638;
                                field790[var6++] = var427.field639;
                                field801[var5++] = var427.field640;
                                field801[var5++] = var427.field637;
                                field790[var6++] = var427.field635;
                            }
                            continue;
                        }
                        if (var443 == 6502) {
                            class28 var429 = class28.method389();
                            if (var429 == null) {
                                field801[var5++] = -1;
                                field801[var5++] = 0;
                                field790[var6++] = "";
                                field801[var5++] = 0;
                                field801[var5++] = 0;
                                field790[var6++] = "";
                            } else {
                                field801[var5++] = var429.field627;
                                field801[var5++] = var429.field638;
                                field790[var6++] = var429.field639;
                                field801[var5++] = var429.field640;
                                field801[var5++] = var429.field637;
                                field790[var6++] = var429.field635;
                            }
                            continue;
                        }
                        if (var443 == 6506) {
                            var5--;
                            int var430 = field801[var5];
                            class28 var431 = null;
                            for (int var432 = 0; var432 < class28.field631; var432++) {
                                if (Statics.field630[var432].field627 == var430) {
                                    var431 = Statics.field630[var432];
                                    break;
                                }
                            }
                            if (var431 == null) {
                                field801[var5++] = -1;
                                field801[var5++] = 0;
                                field790[var6++] = "";
                                field801[var5++] = 0;
                                field801[var5++] = 0;
                                field790[var6++] = "";
                            } else {
                                field801[var5++] = var431.field627;
                                field801[var5++] = var431.field638;
                                field790[var6++] = var431.field639;
                                field801[var5++] = var431.field640;
                                field801[var5++] = var431.field637;
                                field790[var6++] = var431.field635;
                            }
                            continue;
                        }
                        if (var443 == 6507) {
                            var5 -= 4;
                            int var433 = field801[var5];
                            boolean var434 = field801[var5 + 1] == 1;
                            int var435 = field801[var5 + 2];
                            boolean var436 = field801[var5 + 3] == 1;
                            class28.method1062(var433, var434, var435, var436);
                            continue;
                        }
                        if (var443 == 6511) {
                            var5--;
                            int var437 = field801[var5];
                            if (var437 >= 0 && var437 < class28.field631) {
                                class28 var438 = Statics.field630[var437];
                                field801[var5++] = var438.field627;
                                field801[var5++] = var438.field638;
                                field790[var6++] = var438.field639;
                                field801[var5++] = var438.field640;
                                field801[var5++] = var438.field637;
                                field790[var6++] = var438.field635;
                                continue;
                            }
                            field801[var5++] = -1;
                            field801[var5++] = 0;
                            field790[var6++] = "";
                            field801[var5++] = 0;
                            field801[var5++] = 0;
                            field790[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field549 = 250;
            }
        } catch (Exception var442) {
            StringBuilder var440 = new StringBuilder(30);
            var440.append("").append(var4.field3167).append(" ");
            for (int var441 = field791 - 1; var441 >= 0; var441--) {
                var440.append("").append(field792[var441].field199.field3167).append(" ");
            }
            var440.append("").append(var10);
            class152.method2846(var440.toString(), var442);
        }
    }

    @ObfuscatedName("df.t(IB)V")
    public static void method2682(int arg0) {
        if (arg0 == -1 || !class177.method3203(arg0)) {
            return;
        }
        class177[] var1 = Statics.field2909[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class177 var3 = var1[var2];
            if (var3.field2862 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field6 = var3.field2862;
                method36(var4, 2000000);
            }
        }
    }
}
