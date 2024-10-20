package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ag")
public class class37 {

    @ObfuscatedName("ag.p")
    public static int[] field774 = new int[5];

    @ObfuscatedName("ag.h")
    public static int[][] field781 = new int[5][5000];

    @ObfuscatedName("ag.g")
    public static int[] field776 = new int[1000];

    @ObfuscatedName("ag.a")
    public static String[] field770 = new String[1000];

    @ObfuscatedName("ag.r")
    public static int field778 = 0;

    @ObfuscatedName("ag.k")
    public static class15[] field779 = new class15[50];

    @ObfuscatedName("ag.y")
    public static Calendar field782 = Calendar.getInstance();

    @ObfuscatedName("ag.i")
    public static final String[] field775 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ag.j")
    public static int field783 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cu.e(Le;B)V")
    public static void method2036(class1 arg0) {
        method644(arg0, 200000);
    }

    @ObfuscatedName("ai.w(Le;II)V")
    public static void method644(class1 arg0, int arg1) {
        Object[] var2 = arg0.field12;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method215(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field579;
        int[] var9 = var4.field580;
        byte var10 = -1;
        field778 = 0;
        try {
            Statics.field772 = new int[var4.field582];
            int var11 = 0;
            Statics.field773 = new String[var4.field581];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2795;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2817;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2795;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2817;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field17;
                    }
                    Statics.field772[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field773[var12++] = var15;
                }
            }
            int var16 = 0;
            field783 = arg0.field11;
            label3085: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var471 = var8[var7];
                if (var471 < 100) {
                    if (var471 == 0) {
                        field776[var5++] = var9[var7];
                        continue;
                    }
                    if (var471 == 1) {
                        int var17 = var9[var7];
                        field776[var5++] = class177.field2904[var17];
                        continue;
                    }
                    if (var471 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class177.field2904[var18] = field776[var5];
                        client.method987(var18);
                        continue;
                    }
                    if (var471 == 3) {
                        field770[var6++] = var4.field586[var7];
                        continue;
                    }
                    if (var471 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var471 == 7) {
                        var5 -= 2;
                        if (field776[var5 + 1] != field776[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var471 == 8) {
                        var5 -= 2;
                        if (field776[var5 + 1] == field776[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var471 == 9) {
                        var5 -= 2;
                        if (field776[var5] < field776[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var471 == 10) {
                        var5 -= 2;
                        if (field776[var5] > field776[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var471 == 21) {
                        if (field778 == 0) {
                            return;
                        }
                        class15 var19 = field779[--field778];
                        var4 = var19.field208;
                        var8 = var4.field579;
                        var9 = var4.field580;
                        var7 = var19.field209;
                        Statics.field772 = var19.field215;
                        Statics.field773 = var19.field211;
                        continue;
                    }
                    if (var471 == 25) {
                        int var20 = var9[var7];
                        field776[var5++] = class177.method2798(var20);
                        continue;
                    }
                    if (var471 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field776[var5];
                        class48 var23 = (class48) class48.field1050.method3473((long) var21);
                        class48 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field1046.method3048(14, var21);
                            class48 var26 = new class48();
                            if (var25 != null) {
                                var26.method951(new class120(var25));
                            }
                            class48.field1050.method3475(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field1044;
                        int var29 = var24.field1045;
                        int var30 = var24.field1047;
                        int var31 = class177.field2908[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class177.field2904[var28] = class177.field2904[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var471 == 31) {
                        var5 -= 2;
                        if (field776[var5] <= field776[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var471 == 32) {
                        var5 -= 2;
                        if (field776[var5] >= field776[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var471 == 33) {
                        field776[var5++] = Statics.field772[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var471 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field772[var10001] = field776[var5];
                        continue;
                    }
                    if (var471 == 35) {
                        field770[var6++] = Statics.field773[var9[var7]];
                        continue;
                    }
                    if (var471 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field773[var10001] = field770[var6];
                        continue;
                    }
                    if (var471 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String var34 = class164.method2642(field770, var6, var33);
                        field770[var6++] = var34;
                        continue;
                    }
                    if (var471 == 38) {
                        var5--;
                        continue;
                    }
                    if (var471 == 39) {
                        var6--;
                        continue;
                    }
                    if (var471 == 40) {
                        int var35 = var9[var7];
                        class23 var36 = class23.method215(var35);
                        int[] var37 = new int[var36.field582];
                        String[] var38 = new String[var36.field581];
                        for (int var39 = 0; var39 < var36.field584; var39++) {
                            var37[var39] = field776[var5 - var36.field584 + var39];
                        }
                        for (int var40 = 0; var40 < var36.field585; var40++) {
                            var38[var40] = field770[var6 - var36.field585 + var40];
                        }
                        var5 -= var36.field584;
                        var6 -= var36.field585;
                        class15 var41 = new class15();
                        var41.field208 = var4;
                        var41.field209 = var7;
                        var41.field215 = Statics.field772;
                        var41.field211 = Statics.field773;
                        field779[++field778 - 1] = var41;
                        var4 = var36;
                        var8 = var36.field579;
                        var9 = var36.field580;
                        var7 = -1;
                        Statics.field772 = var37;
                        Statics.field773 = var38;
                        continue;
                    }
                    if (var471 == 42) {
                        field776[var5++] = Statics.field2028.method195(var9[var7]);
                        continue;
                    }
                    if (var471 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2028.method187(var10001, field776[var5]);
                        continue;
                    }
                    if (var471 == 44) {
                        int var42 = var9[var7] >> 16;
                        int var43 = var9[var7] & 0xFFFF;
                        var5--;
                        int var44 = field776[var5];
                        if (var44 >= 0 && var44 <= 5000) {
                            field774[var42] = var44;
                            byte var45 = -1;
                            if (var43 == 105) {
                                var45 = 0;
                            }
                            int var46 = 0;
                            while (true) {
                                if (var46 >= var44) {
                                    continue label3085;
                                }
                                field781[var42][var46] = var45;
                                var46++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var471 == 45) {
                        int var47 = var9[var7];
                        var5--;
                        int var48 = field776[var5];
                        if (var48 >= 0 && var48 < field774[var47]) {
                            field776[var5++] = field781[var47][var48];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var471 == 46) {
                        int var49 = var9[var7];
                        var5 -= 2;
                        int var50 = field776[var5];
                        if (var50 >= 0 && var50 < field774[var49]) {
                            field781[var49][var50] = field776[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var471 == 47) {
                        String var51 = Statics.field2028.method190(var9[var7]);
                        if (var51 == null) {
                            var51 = "null";
                        }
                        field770[var6++] = var51;
                        continue;
                    }
                    if (var471 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2028.method192(var10001, field770[var6]);
                        continue;
                    }
                }
                boolean var52;
                if (var9[var7] == 1) {
                    var52 = true;
                } else {
                    var52 = false;
                }
                if (var471 < 1000) {
                    if (var471 == 100) {
                        var5 -= 3;
                        int var53 = field776[var5];
                        int var54 = field776[var5 + 1];
                        int var55 = field776[var5 + 2];
                        if (var54 == 0) {
                            throw new RuntimeException();
                        }
                        class174 var56 = class174.method2906(var53);
                        if (var56.field2880 == null) {
                            var56.field2880 = new class174[var55 + 1];
                        }
                        if (var56.field2880.length <= var55) {
                            class174[] var57 = new class174[var55 + 1];
                            for (int var58 = 0; var58 < var56.field2880.length; var58++) {
                                var57[var58] = var56.field2880[var58];
                            }
                            var56.field2880 = var57;
                        }
                        if (var55 > 0 && var56.field2880[var55 - 1] == null) {
                            throw new RuntimeException("" + (var55 - 1));
                        }
                        class174 var59 = new class174();
                        var59.field2758 = var54;
                        var59.field2775 = var59.field2795 = var56.field2795;
                        var59.field2817 = var55;
                        var59.field2810 = true;
                        var56.field2880[var55] = var59;
                        if (var52) {
                            Statics.field780 = var59;
                        } else {
                            Statics.field28 = var59;
                        }
                        client.method130(var56);
                        continue;
                    }
                    if (var471 == 101) {
                        class174 var60 = var52 ? Statics.field780 : Statics.field28;
                        class174 var61 = class174.method2906(var60.field2795);
                        var61.field2880[var60.field2817] = null;
                        client.method130(var61);
                        continue;
                    }
                    if (var471 == 102) {
                        var5--;
                        class174 var62 = class174.method2906(field776[var5]);
                        var62.field2880 = null;
                        client.method130(var62);
                        continue;
                    }
                    if (var471 == 200) {
                        var5 -= 2;
                        int var63 = field776[var5];
                        int var64 = field776[var5 + 1];
                        class174 var65 = class174.method812(var63, var64);
                        if (var65 != null && var64 != -1) {
                            field776[var5++] = 1;
                            if (var52) {
                                Statics.field780 = var65;
                            } else {
                                Statics.field28 = var65;
                            }
                            continue;
                        }
                        field776[var5++] = 0;
                        continue;
                    }
                    if (var471 == 201) {
                        var5--;
                        class174 var66 = class174.method2906(field776[var5]);
                        if (var66 == null) {
                            field776[var5++] = 0;
                        } else {
                            field776[var5++] = 1;
                            if (var52) {
                                Statics.field780 = var66;
                            } else {
                                Statics.field28 = var66;
                            }
                        }
                        continue;
                    }
                } else if (var471 >= 1000 && var471 < 1100 || var471 >= 2000 && var471 < 2100) {
                    int var67 = -1;
                    class174 var68;
                    if (var471 >= 2000) {
                        var471 -= 1000;
                        var5--;
                        var67 = field776[var5];
                        var68 = class174.method2906(var67);
                    } else {
                        var68 = var52 ? Statics.field780 : Statics.field28;
                    }
                    if (var471 == 1000) {
                        var5 -= 4;
                        var68.field2765 = field776[var5];
                        var68.field2887 = field776[var5 + 1];
                        var68.field2761 = field776[var5 + 2];
                        var68.field2762 = field776[var5 + 3];
                        client.method130(var68);
                        client.method1955(var68);
                        if (var67 != -1 && var68.field2758 == 0) {
                            client.method3274(Statics.field2838[var67 >> 16], var68, false);
                        }
                        continue;
                    }
                    if (var471 == 1001) {
                        var5 -= 4;
                        var68.field2767 = field776[var5];
                        var68.field2768 = field776[var5 + 1];
                        var68.field2763 = field776[var5 + 2];
                        var68.field2764 = field776[var5 + 3];
                        client.method130(var68);
                        client.method1955(var68);
                        if (var67 != -1 && var68.field2758 == 0) {
                            client.method3274(Statics.field2838[var67 >> 16], var68, false);
                        }
                        continue;
                    }
                    if (var471 == 1003) {
                        var5--;
                        boolean var69 = field776[var5] == 1;
                        if (var68.field2776 != var69) {
                            var68.field2776 = var69;
                            client.method130(var68);
                        }
                        continue;
                    }
                    if (var471 == 1005) {
                        var5--;
                        var68.field2889 = field776[var5] == 1;
                        continue;
                    }
                    if (var471 == 1006) {
                        var5--;
                        var68.field2890 = field776[var5] == 1;
                        continue;
                    }
                } else if (var471 >= 1100 && var471 < 1200 || var471 >= 2100 && var471 < 2200) {
                    int var70 = -1;
                    class174 var71;
                    if (var471 >= 2000) {
                        var471 -= 1000;
                        var5--;
                        var70 = field776[var5];
                        var71 = class174.method2906(var70);
                    } else {
                        var71 = var52 ? Statics.field780 : Statics.field28;
                    }
                    if (var471 == 1100) {
                        var5 -= 2;
                        var71.field2777 = field776[var5];
                        if (var71.field2777 > var71.field2779 - var71.field2771) {
                            var71.field2777 = var71.field2779 - var71.field2771;
                        }
                        if (var71.field2777 < 0) {
                            var71.field2777 = 0;
                        }
                        var71.field2816 = field776[var5 + 1];
                        if (var71.field2816 > var71.field2780 - var71.field2835) {
                            var71.field2816 = var71.field2780 - var71.field2835;
                        }
                        if (var71.field2816 < 0) {
                            var71.field2816 = 0;
                        }
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1101) {
                        var5--;
                        var71.field2781 = field776[var5];
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1102) {
                        var5--;
                        var71.field2785 = field776[var5] == 1;
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1103) {
                        var5--;
                        var71.field2787 = field776[var5];
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1104) {
                        var5--;
                        var71.field2789 = field776[var5];
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1105) {
                        var5--;
                        var71.field2859 = field776[var5];
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1106) {
                        var5--;
                        var71.field2802 = field776[var5];
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1107) {
                        var5--;
                        var71.field2794 = field776[var5] == 1;
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1108) {
                        var71.field2799 = 1;
                        var5--;
                        var71.field2877 = field776[var5];
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1109) {
                        var5 -= 6;
                        var71.field2805 = field776[var5];
                        var71.field2806 = field776[var5 + 1];
                        var71.field2766 = field776[var5 + 2];
                        var71.field2808 = field776[var5 + 3];
                        var71.field2801 = field776[var5 + 4];
                        var71.field2803 = field776[var5 + 5];
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1110) {
                        var5--;
                        int var72 = field776[var5];
                        if (var71.field2846 != var72) {
                            var71.field2846 = var72;
                            var71.field2750 = 0;
                            var71.field2869 = 0;
                            client.method130(var71);
                        }
                        continue;
                    }
                    if (var471 == 1111) {
                        var5--;
                        var71.field2807 = field776[var5] == 1;
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1112) {
                        var6--;
                        String var73 = field770[var6];
                        if (!var73.equals(var71.field2854)) {
                            var71.field2854 = var73;
                            client.method130(var71);
                        }
                        continue;
                    }
                    if (var471 == 1113) {
                        var5--;
                        var71.field2815 = field776[var5];
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1114) {
                        var5 -= 3;
                        var71.field2819 = field776[var5];
                        var71.field2820 = field776[var5 + 1];
                        var71.field2818 = field776[var5 + 2];
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1115) {
                        var5--;
                        var71.field2821 = field776[var5] == 1;
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1116) {
                        var5--;
                        var71.field2840 = field776[var5];
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1117) {
                        var5--;
                        var71.field2796 = field776[var5];
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1118) {
                        var5--;
                        var71.field2797 = field776[var5] == 1;
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1119) {
                        var5--;
                        var71.field2798 = field776[var5] == 1;
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1120) {
                        var5 -= 2;
                        var71.field2779 = field776[var5];
                        var71.field2780 = field776[var5 + 1];
                        client.method130(var71);
                        if (var70 != -1 && var71.field2758 == 0) {
                            client.method3274(Statics.field2838[var70 >> 16], var71, false);
                        }
                        continue;
                    }
                    if (var471 == 1121) {
                        client.method2941(var71.field2795, var71.field2817);
                        client.field443 = var71;
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1122) {
                        var5--;
                        var71.field2792 = field776[var5];
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1123) {
                        var5--;
                        var71.field2832 = field776[var5];
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1124) {
                        var5--;
                        var71.field2788 = field776[var5];
                        client.method130(var71);
                        continue;
                    }
                    if (var471 == 1125) {
                        var5--;
                        int var74 = field776[var5];
                        class83 var75 = (class83) class110.method709(class83.method1159(), var74);
                        if (var75 != null) {
                            var71.field2786 = var75;
                            client.method130(var71);
                        }
                        continue;
                    }
                } else if (var471 >= 1200 && var471 < 1300 || var471 >= 2200 && var471 < 2300) {
                    class174 var76;
                    if (var471 >= 2000) {
                        var471 -= 1000;
                        var5--;
                        var76 = class174.method2906(field776[var5]);
                    } else {
                        var76 = var52 ? Statics.field780 : Statics.field28;
                    }
                    client.method130(var76);
                    if (var471 == 1200 || var471 == 1205 || var471 == 1212) {
                        var5 -= 2;
                        int var77 = field776[var5];
                        int var78 = field776[var5 + 1];
                        var76.field2823 = var77;
                        var76.field2867 = var78;
                        class52 var79 = class52.method696(var77);
                        var76.field2766 = var79.field1098;
                        var76.field2808 = var79.field1099;
                        var76.field2801 = var79.field1085;
                        var76.field2805 = var79.field1107;
                        var76.field2806 = var79.field1134;
                        var76.field2803 = var79.field1097;
                        if (var471 == 1205) {
                            var76.field2814 = 0;
                        } else if (var471 == 1212 | var79.field1103 == 1) {
                            var76.field2814 = 1;
                        } else {
                            var76.field2814 = 2;
                        }
                        if (var76.field2811 > 0) {
                            var76.field2803 = var76.field2803 * 32 / var76.field2811;
                        } else if (var76.field2767 > 0) {
                            var76.field2803 = var76.field2803 * 32 / var76.field2767;
                        }
                        continue;
                    }
                    if (var471 == 1201) {
                        var76.field2799 = 2;
                        var5--;
                        var76.field2877 = field776[var5];
                        continue;
                    }
                    if (var471 == 1202) {
                        var76.field2799 = 3;
                        var76.field2877 = Statics.field573.field36.method3230();
                        continue;
                    }
                } else if (var471 >= 1300 && var471 < 1400 || var471 >= 2300 && var471 < 2400) {
                    class174 var80;
                    if (var471 >= 2000) {
                        var471 -= 1000;
                        var5--;
                        var80 = class174.method2906(field776[var5]);
                    } else {
                        var80 = var52 ? Statics.field780 : Statics.field28;
                    }
                    if (var471 == 1300) {
                        var5--;
                        int var81 = field776[var5] - 1;
                        if (var81 >= 0 && var81 <= 9) {
                            var6--;
                            var80.method3130(var81, field770[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var471 == 1301) {
                        var5 -= 2;
                        int var82 = field776[var5];
                        int var83 = field776[var5 + 1];
                        var80.field2831 = class174.method812(var82, var83);
                        continue;
                    }
                    if (var471 == 1302) {
                        var5--;
                        var80.field2864 = field776[var5] == 1;
                        continue;
                    }
                    if (var471 == 1303) {
                        var5--;
                        var80.field2855 = field776[var5];
                        continue;
                    }
                    if (var471 == 1304) {
                        var5--;
                        var80.field2756 = field776[var5];
                        continue;
                    }
                    if (var471 == 1305) {
                        var6--;
                        var80.field2829 = field770[var6];
                        continue;
                    }
                    if (var471 == 1306) {
                        var6--;
                        var80.field2813 = field770[var6];
                        continue;
                    }
                    if (var471 == 1307) {
                        var80.field2830 = null;
                        continue;
                    }
                } else {
                    if (var471 >= 1400 && var471 < 1500 || var471 >= 2400 && var471 < 2500) {
                        class174 var84;
                        if (var471 >= 2000) {
                            var471 -= 1000;
                            var5--;
                            var84 = class174.method2906(field776[var5]);
                        } else {
                            var84 = var52 ? Statics.field780 : Statics.field28;
                        }
                        var6--;
                        String var85 = field770[var6];
                        int[] var86 = null;
                        if (var85.length() > 0 && var85.charAt(var85.length() - 1) == 'Y') {
                            var5--;
                            int var87 = field776[var5];
                            if (var87 > 0) {
                                var86 = new int[var87];
                                while (var87-- > 0) {
                                    var5--;
                                    var86[var87] = field776[var5];
                                }
                            }
                            var85 = var85.substring(0, var85.length() - 1);
                        }
                        Object[] var88 = new Object[var85.length() + 1];
                        for (int var89 = var88.length - 1; var89 >= 1; var89--) {
                            if (var85.charAt(var89 - 1) == 's') {
                                var6--;
                                var88[var89] = field770[var6];
                            } else {
                                var5--;
                                var88[var89] = Integer.valueOf(field776[var5]);
                            }
                        }
                        var5--;
                        int var90 = field776[var5];
                        if (var90 == -1) {
                            var88 = null;
                        } else {
                            var88[0] = Integer.valueOf(var90);
                        }
                        if (var471 == 1400) {
                            var84.field2751 = var88;
                        }
                        if (var471 == 1401) {
                            var84.field2841 = var88;
                        }
                        if (var471 == 1402) {
                            var84.field2791 = var88;
                        }
                        if (var471 == 1403) {
                            var84.field2833 = var88;
                        }
                        if (var471 == 1404) {
                            var84.field2844 = var88;
                        }
                        if (var471 == 1405) {
                            var84.field2845 = var88;
                        }
                        if (var471 == 1406) {
                            var84.field2848 = var88;
                        }
                        if (var471 == 1407) {
                            var84.field2849 = var88;
                            var84.field2850 = var86;
                        }
                        if (var471 == 1408) {
                            var84.field2876 = var88;
                        }
                        if (var471 == 1409) {
                            var84.field2856 = var88;
                        }
                        if (var471 == 1410) {
                            var84.field2872 = var88;
                        }
                        if (var471 == 1411) {
                            var84.field2839 = var88;
                        }
                        if (var471 == 1412) {
                            var84.field2843 = var88;
                        }
                        if (var471 == 1414) {
                            var84.field2851 = var88;
                            var84.field2852 = var86;
                        }
                        if (var471 == 1415) {
                            var84.field2853 = var88;
                            var84.field2778 = var86;
                        }
                        if (var471 == 1416) {
                            var84.field2847 = var88;
                        }
                        if (var471 == 1417) {
                            var84.field2822 = var88;
                        }
                        if (var471 == 1418) {
                            var84.field2858 = var88;
                        }
                        if (var471 == 1419) {
                            var84.field2870 = var88;
                        }
                        if (var471 == 1420) {
                            var84.field2860 = var88;
                        }
                        if (var471 == 1421) {
                            var84.field2782 = var88;
                        }
                        if (var471 == 1422) {
                            var84.field2772 = var88;
                        }
                        if (var471 == 1423) {
                            var84.field2863 = var88;
                        }
                        if (var471 == 1424) {
                            var84.field2745 = var88;
                        }
                        if (var471 == 1425) {
                            var84.field2866 = var88;
                        }
                        if (var471 == 1426) {
                            var84.field2754 = var88;
                        }
                        if (var471 == 1427) {
                            var84.field2865 = var88;
                        }
                        var84.field2836 = true;
                        continue;
                    }
                    if (var471 < 1600) {
                        class174 var91 = var52 ? Statics.field780 : Statics.field28;
                        if (var471 == 1500) {
                            field776[var5++] = var91.field2881;
                            continue;
                        }
                        if (var471 == 1501) {
                            field776[var5++] = var91.field2770;
                            continue;
                        }
                        if (var471 == 1502) {
                            field776[var5++] = var91.field2771;
                            continue;
                        }
                        if (var471 == 1503) {
                            field776[var5++] = var91.field2835;
                            continue;
                        }
                        if (var471 == 1504) {
                            field776[var5++] = var91.field2776 ? 1 : 0;
                            continue;
                        }
                        if (var471 == 1505) {
                            field776[var5++] = var91.field2775;
                            continue;
                        }
                    } else if (var471 < 1700) {
                        class174 var92 = var52 ? Statics.field780 : Statics.field28;
                        if (var471 == 1600) {
                            field776[var5++] = var92.field2777;
                            continue;
                        }
                        if (var471 == 1601) {
                            field776[var5++] = var92.field2816;
                            continue;
                        }
                        if (var471 == 1602) {
                            field770[var6++] = var92.field2854;
                            continue;
                        }
                        if (var471 == 1603) {
                            field776[var5++] = var92.field2779;
                            continue;
                        }
                        if (var471 == 1604) {
                            field776[var5++] = var92.field2780;
                            continue;
                        }
                        if (var471 == 1605) {
                            field776[var5++] = var92.field2803;
                            continue;
                        }
                        if (var471 == 1606) {
                            field776[var5++] = var92.field2766;
                            continue;
                        }
                        if (var471 == 1607) {
                            field776[var5++] = var92.field2801;
                            continue;
                        }
                        if (var471 == 1608) {
                            field776[var5++] = var92.field2808;
                            continue;
                        }
                        if (var471 == 1609) {
                            field776[var5++] = var92.field2787;
                            continue;
                        }
                        if (var471 == 1610) {
                            field776[var5++] = var92.field2788;
                            continue;
                        }
                        if (var471 == 1611) {
                            field776[var5++] = var92.field2781;
                            continue;
                        }
                        if (var471 == 1612) {
                            field776[var5++] = var92.field2832;
                            continue;
                        }
                        if (var471 == 1613) {
                            field776[var5++] = var92.field2786.method558();
                            continue;
                        }
                    } else if (var471 < 1800) {
                        class174 var93 = var52 ? Statics.field780 : Statics.field28;
                        if (var471 == 1700) {
                            field776[var5++] = var93.field2823;
                            continue;
                        }
                        if (var471 == 1701) {
                            if (var93.field2823 == -1) {
                                field776[var5++] = 0;
                            } else {
                                field776[var5++] = var93.field2867;
                            }
                            continue;
                        }
                        if (var471 == 1702) {
                            field776[var5++] = var93.field2817;
                            continue;
                        }
                    } else if (var471 < 1900) {
                        class174 var94 = var52 ? Statics.field780 : Statics.field28;
                        if (var471 == 1800) {
                            field776[var5++] = class179.method3122(client.method1530(var94));
                            continue;
                        }
                        if (var471 == 1801) {
                            var5--;
                            int var95 = field776[var5];
                            int var472 = var95 - 1;
                            if (var94.field2830 != null && var472 < var94.field2830.length && var94.field2830[var472] != null) {
                                field770[var6++] = var94.field2830[var472];
                                continue;
                            }
                            field770[var6++] = "";
                            continue;
                        }
                        if (var471 == 1802) {
                            if (var94.field2829 == null) {
                                field770[var6++] = "";
                            } else {
                                field770[var6++] = var94.field2829;
                            }
                            continue;
                        }
                    } else if (var471 >= 1900 && var471 < 2000 || var471 >= 2900 && var471 < 3000) {
                        class174 var96;
                        if (var471 >= 2000) {
                            var471 -= 1000;
                            var5--;
                            var96 = class174.method2906(field776[var5]);
                        } else {
                            var96 = var52 ? Statics.field780 : Statics.field28;
                        }
                        if (var471 == 1927) {
                            if (field783 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var96.field2865 == null) {
                                return;
                            }
                            class1 var97 = new class1();
                            var97.field3 = var96;
                            var97.field12 = var96.field2865;
                            var97.field11 = field783 + 1;
                            client.field467.method3553(arg0);
                            continue;
                        }
                    } else if (var471 < 2600) {
                        var5--;
                        class174 var98 = class174.method2906(field776[var5]);
                        if (var471 == 2500) {
                            field776[var5++] = var98.field2881;
                            continue;
                        }
                        if (var471 == 2501) {
                            field776[var5++] = var98.field2770;
                            continue;
                        }
                        if (var471 == 2502) {
                            field776[var5++] = var98.field2771;
                            continue;
                        }
                        if (var471 == 2503) {
                            field776[var5++] = var98.field2835;
                            continue;
                        }
                        if (var471 == 2504) {
                            field776[var5++] = var98.field2776 ? 1 : 0;
                            continue;
                        }
                        if (var471 == 2505) {
                            field776[var5++] = var98.field2775;
                            continue;
                        }
                    } else if (var471 < 2700) {
                        var5--;
                        class174 var99 = class174.method2906(field776[var5]);
                        if (var471 == 2600) {
                            field776[var5++] = var99.field2777;
                            continue;
                        }
                        if (var471 == 2601) {
                            field776[var5++] = var99.field2816;
                            continue;
                        }
                        if (var471 == 2602) {
                            field770[var6++] = var99.field2854;
                            continue;
                        }
                        if (var471 == 2603) {
                            field776[var5++] = var99.field2779;
                            continue;
                        }
                        if (var471 == 2604) {
                            field776[var5++] = var99.field2780;
                            continue;
                        }
                        if (var471 == 2605) {
                            field776[var5++] = var99.field2803;
                            continue;
                        }
                        if (var471 == 2606) {
                            field776[var5++] = var99.field2766;
                            continue;
                        }
                        if (var471 == 2607) {
                            field776[var5++] = var99.field2801;
                            continue;
                        }
                        if (var471 == 2608) {
                            field776[var5++] = var99.field2808;
                            continue;
                        }
                        if (var471 == 2609) {
                            field776[var5++] = var99.field2787;
                            continue;
                        }
                        if (var471 == 2610) {
                            field776[var5++] = var99.field2788;
                            continue;
                        }
                        if (var471 == 2611) {
                            field776[var5++] = var99.field2781;
                            continue;
                        }
                        if (var471 == 2612) {
                            field776[var5++] = var99.field2832;
                            continue;
                        }
                        if (var471 == 2613) {
                            field776[var5++] = var99.field2786.method558();
                            continue;
                        }
                    } else if (var471 < 2800) {
                        if (var471 == 2700) {
                            var5--;
                            class174 var100 = class174.method2906(field776[var5]);
                            field776[var5++] = var100.field2823;
                            continue;
                        }
                        if (var471 == 2701) {
                            var5--;
                            class174 var101 = class174.method2906(field776[var5]);
                            if (var101.field2823 == -1) {
                                field776[var5++] = 0;
                            } else {
                                field776[var5++] = var101.field2867;
                            }
                            continue;
                        }
                        if (var471 == 2702) {
                            var5--;
                            int var102 = field776[var5];
                            class4 var103 = (class4) client.field440.method3507((long) var102);
                            if (var103 == null) {
                                field776[var5++] = 0;
                            } else {
                                field776[var5++] = 1;
                            }
                            continue;
                        }
                        if (var471 == 2706) {
                            field776[var5++] = client.field439;
                            continue;
                        }
                    } else if (var471 < 2900) {
                        var5--;
                        class174 var104 = class174.method2906(field776[var5]);
                        if (var471 == 2800) {
                            field776[var5++] = class179.method3122(client.method1530(var104));
                            continue;
                        }
                        if (var471 == 2801) {
                            var5--;
                            int var105 = field776[var5];
                            int var473 = var105 - 1;
                            if (var104.field2830 != null && var473 < var104.field2830.length && var104.field2830[var473] != null) {
                                field770[var6++] = var104.field2830[var473];
                                continue;
                            }
                            field770[var6++] = "";
                            continue;
                        }
                        if (var471 == 2802) {
                            if (var104.field2829 == null) {
                                field770[var6++] = "";
                            } else {
                                field770[var6++] = var104.field2829;
                            }
                            continue;
                        }
                    } else if (var471 < 3200) {
                        if (var471 == 3100) {
                            var6--;
                            String var106 = field770[var6];
                            class12.method1945(0, "", var106);
                            continue;
                        }
                        if (var471 == 3101) {
                            var5 -= 2;
                            client.method1953(Statics.field573, field776[var5], field776[var5 + 1]);
                            continue;
                        }
                        if (var471 == 3103) {
                            client.method2240();
                            continue;
                        }
                        if (var471 == 3104) {
                            var6--;
                            String var107 = field770[var6];
                            int var108 = 0;
                            if (class164.method2305(var107)) {
                                var108 = class164.method2756(var107);
                            }
                            client.field322.method2594(190);
                            client.field322.method2449(var108);
                            continue;
                        }
                        if (var471 == 3105) {
                            var6--;
                            String var109 = field770[var6];
                            client.field322.method2594(5);
                            client.field322.method2397(var109.length() + 1);
                            client.field322.method2346(var109);
                            continue;
                        }
                        if (var471 == 3106) {
                            var6--;
                            String var110 = field770[var6];
                            client.field322.method2594(172);
                            client.field322.method2397(var110.length() + 1);
                            client.field322.method2346(var110);
                            continue;
                        }
                        if (var471 == 3107) {
                            var5--;
                            int var111 = field776[var5];
                            var6--;
                            String var112 = field770[var6];
                            client.method3466(var111, var112);
                            continue;
                        }
                        if (var471 == 3108) {
                            var5 -= 3;
                            int var113 = field776[var5];
                            int var114 = field776[var5 + 1];
                            int var115 = field776[var5 + 2];
                            class174 var116 = class174.method2906(var115);
                            client.method2939(var116, var113, var114);
                            continue;
                        }
                        if (var471 == 3109) {
                            var5 -= 2;
                            int var117 = field776[var5];
                            int var118 = field776[var5 + 1];
                            class174 var119 = var52 ? Statics.field780 : Statics.field28;
                            client.method2939(var119, var117, var118);
                            continue;
                        }
                        if (var471 == 3110) {
                            var5--;
                            Statics.field67 = field776[var5] == 1;
                            continue;
                        }
                        if (var471 == 3111) {
                            field776[var5++] = Statics.field866.field147 ? 1 : 0;
                            continue;
                        }
                        if (var471 == 3112) {
                            var5--;
                            Statics.field866.field147 = field776[var5] == 1;
                            class9.method890();
                            continue;
                        }
                        if (var471 == 3113) {
                            var6--;
                            String var120 = field770[var6];
                            var5--;
                            boolean var121 = field776[var5] == 1;
                            class139.method2898(var120, var121, false);
                            continue;
                        }
                        if (var471 == 3115) {
                            var5--;
                            int var122 = field776[var5];
                            client.field322.method2594(80);
                            client.field322.method2545(var122);
                            continue;
                        }
                        if (var471 == 3116) {
                            var5--;
                            int var123 = field776[var5];
                            var6 -= 2;
                            String var124 = field770[var6];
                            String var125 = field770[var6 + 1];
                            if (var124.length() <= 500 && var125.length() <= 500) {
                                client.field322.method2594(136);
                                client.field322.method2545(1 + class120.method957(var124) + class120.method957(var125));
                                client.field322.method2378(var123);
                                client.field322.method2346(var125);
                                client.field322.method2346(var124);
                            }
                            continue;
                        }
                    } else if (var471 < 3300) {
                        if (var471 == 3200) {
                            var5 -= 3;
                            client.method184(field776[var5], field776[var5 + 1], field776[var5 + 2]);
                            continue;
                        }
                        if (var471 == 3201) {
                            var5--;
                            int var126 = field776[var5];
                            if (var126 == -1 && !client.field428) {
                                class184.method760();
                            } else if (var126 != -1 && client.field517 != var126 && client.field516 != 0 && !client.field428) {
                                class169 var127 = Statics.field612;
                                int var128 = client.field516;
                                class184.field2959 = 1;
                                Statics.field210 = var127;
                                Statics.field2220 = var126;
                                Statics.field2657 = 0;
                                Statics.field1612 = var128;
                                Statics.field2031 = false;
                                Statics.field3119 = 2;
                            }
                            client.field517 = var126;
                            continue;
                        }
                        if (var471 == 3202) {
                            var5 -= 2;
                            client.method3465(field776[var5], field776[var5 + 1]);
                            continue;
                        }
                    } else if (var471 < 3400) {
                        if (var471 == 3300) {
                            field776[var5++] = client.field290;
                            continue;
                        }
                        if (var471 == 3301) {
                            var5 -= 2;
                            int var129 = field776[var5];
                            int var130 = field776[var5 + 1];
                            int[] var131 = field776;
                            int var132 = var5++;
                            class16 var133 = (class16) class16.field217.method3507((long) var129);
                            int var134;
                            if (var133 == null) {
                                var134 = -1;
                            } else if (var130 >= 0 && var130 < var133.field220.length) {
                                var134 = var133.field220[var130];
                            } else {
                                var134 = -1;
                            }
                            var131[var132] = var134;
                            continue;
                        }
                        if (var471 == 3302) {
                            var5 -= 2;
                            int var135 = field776[var5];
                            int var136 = field776[var5 + 1];
                            int[] var137 = field776;
                            int var138 = var5++;
                            class16 var139 = (class16) class16.field217.method3507((long) var135);
                            int var140;
                            if (var139 == null) {
                                var140 = 0;
                            } else if (var136 >= 0 && var136 < var139.field218.length) {
                                var140 = var139.field218[var136];
                            } else {
                                var140 = 0;
                            }
                            var137[var138] = var140;
                            continue;
                        }
                        if (var471 == 3303) {
                            var5 -= 2;
                            int var141 = field776[var5];
                            int var142 = field776[var5 + 1];
                            int[] var143 = field776;
                            int var144 = var5++;
                            class16 var145 = (class16) class16.field217.method3507((long) var141);
                            int var146;
                            if (var145 == null) {
                                var146 = 0;
                            } else if (var142 == -1) {
                                var146 = 0;
                            } else {
                                int var147 = 0;
                                for (int var148 = 0; var148 < var145.field218.length; var148++) {
                                    if (var145.field220[var148] == var142) {
                                        var147 += var145.field218[var148];
                                    }
                                }
                                var146 = var147;
                            }
                            var143[var144] = var146;
                            continue;
                        }
                        if (var471 == 3304) {
                            var5--;
                            int var149 = field776[var5];
                            field776[var5++] = class51.method2940(var149).field1077;
                            continue;
                        }
                        if (var471 == 3305) {
                            var5--;
                            int var150 = field776[var5];
                            field776[var5++] = client.field493[var150];
                            continue;
                        }
                        if (var471 == 3306) {
                            var5--;
                            int var151 = field776[var5];
                            field776[var5++] = client.field416[var151];
                            continue;
                        }
                        if (var471 == 3307) {
                            var5--;
                            int var152 = field776[var5];
                            field776[var5++] = client.field553[var152];
                            continue;
                        }
                        if (var471 == 3308) {
                            int var153 = Statics.field1064;
                            int var154 = (Statics.field573.field805 >> 7) + Statics.field1440;
                            int var155 = (Statics.field573.field815 >> 7) + Statics.field129;
                            field776[var5++] = (var153 << 28) + (var154 << 14) + var155;
                            continue;
                        }
                        if (var471 == 3309) {
                            var5--;
                            int var156 = field776[var5];
                            field776[var5++] = var156 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var471 == 3310) {
                            var5--;
                            int var157 = field776[var5];
                            field776[var5++] = var157 >> 28;
                            continue;
                        }
                        if (var471 == 3311) {
                            var5--;
                            int var158 = field776[var5];
                            field776[var5++] = var158 & 0x3FFF;
                            continue;
                        }
                        if (var471 == 3312) {
                            field776[var5++] = client.field285 ? 1 : 0;
                            continue;
                        }
                        if (var471 == 3313) {
                            var5 -= 2;
                            int var159 = field776[var5] + 32768;
                            int var160 = field776[var5 + 1];
                            int[] var161 = field776;
                            int var162 = var5++;
                            class16 var163 = (class16) class16.field217.method3507((long) var159);
                            int var164;
                            if (var163 == null) {
                                var164 = -1;
                            } else if (var160 >= 0 && var160 < var163.field220.length) {
                                var164 = var163.field220[var160];
                            } else {
                                var164 = -1;
                            }
                            var161[var162] = var164;
                            continue;
                        }
                        if (var471 == 3314) {
                            var5 -= 2;
                            int var165 = field776[var5] + 32768;
                            int var166 = field776[var5 + 1];
                            int[] var167 = field776;
                            int var168 = var5++;
                            class16 var169 = (class16) class16.field217.method3507((long) var165);
                            int var170;
                            if (var169 == null) {
                                var170 = 0;
                            } else if (var166 >= 0 && var166 < var169.field218.length) {
                                var170 = var169.field218[var166];
                            } else {
                                var170 = 0;
                            }
                            var167[var168] = var170;
                            continue;
                        }
                        if (var471 == 3315) {
                            var5 -= 2;
                            int var171 = field776[var5] + 32768;
                            int var172 = field776[var5 + 1];
                            int[] var173 = field776;
                            int var174 = var5++;
                            class16 var175 = (class16) class16.field217.method3507((long) var171);
                            int var176;
                            if (var175 == null) {
                                var176 = 0;
                            } else if (var172 == -1) {
                                var176 = 0;
                            } else {
                                int var177 = 0;
                                for (int var178 = 0; var178 < var175.field218.length; var178++) {
                                    if (var175.field220[var178] == var172) {
                                        var177 += var175.field218[var178];
                                    }
                                }
                                var176 = var177;
                            }
                            var173[var174] = var176;
                            continue;
                        }
                        if (var471 == 3316) {
                            if (client.field483 >= 2) {
                                field776[var5++] = client.field483;
                            } else {
                                field776[var5++] = 0;
                            }
                            continue;
                        }
                        if (var471 == 3317) {
                            field776[var5++] = client.field431;
                            continue;
                        }
                        if (var471 == 3318) {
                            field776[var5++] = client.field280;
                            continue;
                        }
                        if (var471 == 3321) {
                            field776[var5++] = client.field444;
                            continue;
                        }
                        if (var471 == 3322) {
                            field776[var5++] = client.field366;
                            continue;
                        }
                        if (var471 == 3323) {
                            if (client.field448) {
                                field776[var5++] = 1;
                            } else {
                                field776[var5++] = 0;
                            }
                            continue;
                        }
                        if (var471 == 3324) {
                            field776[var5++] = client.field281;
                            continue;
                        }
                    } else if (var471 < 3500) {
                        if (var471 == 3400) {
                            var5 -= 2;
                            int var179 = field776[var5];
                            int var180 = field776[var5 + 1];
                            class49 var181 = class49.method2908(var179);
                            if (var181.field1053 != 's') {
                            }
                            for (int var182 = 0; var182 < var181.field1058; var182++) {
                                if (var181.field1059[var182] == var180) {
                                    field770[var6++] = var181.field1061[var182];
                                    var181 = null;
                                    break;
                                }
                            }
                            if (var181 != null) {
                                field770[var6++] = var181.field1056;
                            }
                            continue;
                        }
                        if (var471 == 3408) {
                            var5 -= 4;
                            int var183 = field776[var5];
                            int var184 = field776[var5 + 1];
                            int var185 = field776[var5 + 2];
                            int var186 = field776[var5 + 3];
                            class49 var187 = class49.method2908(var185);
                            if (var187.field1060 == var183 && var187.field1053 == var184) {
                                for (int var188 = 0; var188 < var187.field1058; var188++) {
                                    if (var187.field1059[var188] == var186) {
                                        if (var184 == 115) {
                                            field770[var6++] = var187.field1061[var188];
                                        } else {
                                            field776[var5++] = var187.field1057[var188];
                                        }
                                        var187 = null;
                                        break;
                                    }
                                }
                                if (var187 != null) {
                                    if (var184 == 115) {
                                        field770[var6++] = var187.field1056;
                                    } else {
                                        field776[var5++] = var187.field1055;
                                    }
                                }
                                continue;
                            }
                            if (var184 == 115) {
                                field770[var6++] = "null";
                            } else {
                                field776[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var471 < 3700) {
                        if (var471 == 3600) {
                            if (client.field383 == 0) {
                                field776[var5++] = -2;
                            } else if (client.field383 == 1) {
                                field776[var5++] = -1;
                            } else {
                                field776[var5++] = client.field546;
                            }
                            continue;
                        }
                        if (var471 == 3601) {
                            var5--;
                            int var189 = field776[var5];
                            if (client.field383 == 2 && var189 < client.field546) {
                                field770[var6++] = client.field548[var189].field248;
                                field770[var6++] = client.field548[var189].field246;
                                continue;
                            }
                            field770[var6++] = "";
                            field770[var6++] = "";
                            continue;
                        }
                        if (var471 == 3602) {
                            var5--;
                            int var190 = field776[var5];
                            if (client.field383 == 2 && var190 < client.field546) {
                                field776[var5++] = client.field548[var190].field243;
                                continue;
                            }
                            field776[var5++] = 0;
                            continue;
                        }
                        if (var471 == 3603) {
                            var5--;
                            int var191 = field776[var5];
                            if (client.field383 == 2 && var191 < client.field546) {
                                field776[var5++] = client.field548[var191].field245;
                                continue;
                            }
                            field776[var5++] = 0;
                            continue;
                        }
                        if (var471 == 3604) {
                            var6--;
                            String var192 = field770[var6];
                            var5--;
                            int var193 = field776[var5];
                            client.method477(var192, var193);
                            continue;
                        }
                        if (var471 == 3605) {
                            var6--;
                            String var194 = field770[var6];
                            if (var194 == null) {
                                continue;
                            }
                            if ((client.field546 < 200 || client.field403 == 1) && client.field546 < 400) {
                                String var195 = class165.method2605(var194, Statics.field284);
                                if (var195 == null) {
                                    continue;
                                }
                                for (int var196 = 0; var196 < client.field546; var196++) {
                                    class18 var197 = client.field548[var196];
                                    String var198 = class165.method2605(var197.field248, Statics.field284);
                                    if (var198 != null && var198.equals(var195)) {
                                        class12.method1945(30, "", var194 + class158.field2472);
                                        continue label3085;
                                    }
                                    if (var197.field246 != null) {
                                        String var199 = class165.method2605(var197.field246, Statics.field284);
                                        if (var199 != null && var199.equals(var195)) {
                                            class12.method1945(30, "", var194 + class158.field2472);
                                            continue label3085;
                                        }
                                    }
                                }
                                for (int var200 = 0; var200 < client.field550; var200++) {
                                    class8 var201 = client.field551[var200];
                                    String var202 = class165.method2605(var201.field142, Statics.field284);
                                    if (var202 != null && var202.equals(var195)) {
                                        class12.method1945(30, "", class158.field2477 + var194 + class158.field2320);
                                        continue label3085;
                                    }
                                    if (var201.field136 != null) {
                                        String var203 = class165.method2605(var201.field136, Statics.field284);
                                        if (var203 != null && var203.equals(var195)) {
                                            class12.method1945(30, "", class158.field2477 + var194 + class158.field2320);
                                            continue label3085;
                                        }
                                    }
                                }
                                if (class165.method2605(Statics.field573.field46, Statics.field284).equals(var195)) {
                                    class12.method1945(30, "", class158.field2475);
                                } else {
                                    client.field322.method2594(128);
                                    client.field322.method2397(class120.method957(var194));
                                    client.field322.method2346(var194);
                                }
                                continue;
                            }
                            class12.method1945(30, "", class158.field2471);
                            continue;
                        }
                        if (var471 == 3606) {
                            var6--;
                            String var204 = field770[var6];
                            if (var204 == null) {
                                continue;
                            }
                            String var205 = class165.method2605(var204, Statics.field284);
                            if (var205 == null) {
                                continue;
                            }
                            int var206 = 0;
                            while (true) {
                                if (var206 >= client.field546) {
                                    continue label3085;
                                }
                                class18 var207 = client.field548[var206];
                                String var208 = var207.field248;
                                String var209 = class165.method2605(var208, Statics.field284);
                                if (class130.method2934(var204, var205, var208, var209)) {
                                    client.field546--;
                                    for (int var210 = var206; var210 < client.field546; var210++) {
                                        client.field548[var210] = client.field548[var210 + 1];
                                    }
                                    client.field472 = client.field464;
                                    client.field322.method2594(13);
                                    client.field322.method2397(class120.method957(var204));
                                    client.field322.method2346(var204);
                                    continue label3085;
                                }
                                var206++;
                            }
                        }
                        if (var471 == 3607) {
                            var6--;
                            String var211 = field770[var6];
                            if (var211 == null) {
                                continue;
                            }
                            if ((client.field550 < 100 || client.field403 == 1) && client.field550 < 400) {
                                String var212 = class165.method2605(var211, Statics.field284);
                                if (var212 == null) {
                                    continue;
                                }
                                for (int var213 = 0; var213 < client.field550; var213++) {
                                    class8 var214 = client.field551[var213];
                                    String var215 = class165.method2605(var214.field142, Statics.field284);
                                    if (var215 != null && var215.equals(var212)) {
                                        class12.method1945(31, "", var211 + class158.field2474);
                                        continue label3085;
                                    }
                                    if (var214.field136 != null) {
                                        String var216 = class165.method2605(var214.field136, Statics.field284);
                                        if (var216 != null && var216.equals(var212)) {
                                            class12.method1945(31, "", var211 + class158.field2474);
                                            continue label3085;
                                        }
                                    }
                                }
                                for (int var217 = 0; var217 < client.field546; var217++) {
                                    class18 var218 = client.field548[var217];
                                    String var219 = class165.method2605(var218.field248, Statics.field284);
                                    if (var219 != null && var219.equals(var212)) {
                                        class12.method1945(31, "", class158.field2479 + var211 + class158.field2480);
                                        continue label3085;
                                    }
                                    if (var218.field246 != null) {
                                        String var220 = class165.method2605(var218.field246, Statics.field284);
                                        if (var220 != null && var220.equals(var212)) {
                                            class12.method1945(31, "", class158.field2479 + var211 + class158.field2480);
                                            continue label3085;
                                        }
                                    }
                                }
                                if (class165.method2605(Statics.field573.field46, Statics.field284).equals(var212)) {
                                    class12.method1945(31, "", class158.field2507);
                                } else {
                                    client.field322.method2594(21);
                                    client.field322.method2397(class120.method957(var211));
                                    client.field322.method2346(var211);
                                }
                                continue;
                            }
                            class12.method1945(31, "", class158.field2473);
                            continue;
                        }
                        if (var471 == 3608) {
                            var6--;
                            String var221 = field770[var6];
                            client.method2800(var221);
                            continue;
                        }
                        if (var471 == 3609) {
                            var6--;
                            String var222 = field770[var6];
                            class153[] var223 = class153.method2676();
                            for (int var224 = 0; var224 < var223.length; var224++) {
                                class153 var225 = var223[var224];
                                if (var225.field2259 != -1 && var222.startsWith(class2.method2037(var225.field2259))) {
                                    var222 = var222.substring(6 + Integer.toString(var225.field2259).length());
                                    break;
                                }
                            }
                            field776[var5++] = client.method125(var222, false) ? 1 : 0;
                            continue;
                        }
                        if (var471 == 3611) {
                            if (client.field506 == null) {
                                field770[var6++] = "";
                            } else {
                                field770[var6++] = class163.method627(client.field506);
                            }
                            continue;
                        }
                        if (var471 == 3612) {
                            if (client.field506 == null) {
                                field776[var5++] = 0;
                            } else {
                                field776[var5++] = Statics.field645;
                            }
                            continue;
                        }
                        if (var471 == 3613) {
                            var5--;
                            int var226 = field776[var5];
                            if (client.field506 != null && var226 < Statics.field645) {
                                field770[var6++] = Statics.field1543[var226].field610;
                                continue;
                            }
                            field770[var6++] = "";
                            continue;
                        }
                        if (var471 == 3614) {
                            var5--;
                            int var227 = field776[var5];
                            if (client.field506 != null && var227 < Statics.field645) {
                                field776[var5++] = Statics.field1543[var227].field611;
                                continue;
                            }
                            field776[var5++] = 0;
                            continue;
                        }
                        if (var471 == 3615) {
                            var5--;
                            int var228 = field776[var5];
                            if (client.field506 != null && var228 < Statics.field645) {
                                field776[var5++] = Statics.field1543[var228].field609;
                                continue;
                            }
                            field776[var5++] = 0;
                            continue;
                        }
                        if (var471 == 3616) {
                            field776[var5++] = Statics.field18;
                            continue;
                        }
                        if (var471 == 3617) {
                            var6--;
                            String var229 = field770[var6];
                            if (Statics.field1543 != null) {
                                client.field322.method2594(210);
                                client.field322.method2397(class120.method957(var229));
                                client.field322.method2346(var229);
                            }
                            continue;
                        }
                        if (var471 == 3618) {
                            field776[var5++] = Statics.field1013;
                            continue;
                        }
                        if (var471 == 3619) {
                            var6--;
                            String var230 = field770[var6];
                            client.method120(var230);
                            continue;
                        }
                        if (var471 == 3620) {
                            client.method977();
                            continue;
                        }
                        if (var471 == 3621) {
                            if (client.field383 == 0) {
                                field776[var5++] = -1;
                            } else {
                                field776[var5++] = client.field550;
                            }
                            continue;
                        }
                        if (var471 == 3622) {
                            var5--;
                            int var231 = field776[var5];
                            if (client.field383 != 0 && var231 < client.field550) {
                                field770[var6++] = client.field551[var231].field142;
                                field770[var6++] = client.field551[var231].field136;
                                continue;
                            }
                            field770[var6++] = "";
                            field770[var6++] = "";
                            continue;
                        }
                        if (var471 == 3623) {
                            var6--;
                            String var232 = field770[var6];
                            if (var232.startsWith(class2.method2037(0)) || var232.startsWith(class2.method2037(1))) {
                                var232 = var232.substring(7);
                            }
                            field776[var5++] = client.method3002(var232) ? 1 : 0;
                            continue;
                        }
                        if (var471 == 3624) {
                            var5--;
                            int var233 = field776[var5];
                            if (Statics.field1543 != null && var233 < Statics.field645 && Statics.field1543[var233].field610.equalsIgnoreCase(Statics.field573.field46)) {
                                field776[var5++] = 1;
                                continue;
                            }
                            field776[var5++] = 0;
                            continue;
                        }
                        if (var471 == 3625) {
                            if (client.field507 == null) {
                                field770[var6++] = "";
                            } else {
                                field770[var6++] = class163.method627(client.field507);
                            }
                            continue;
                        }
                    } else if (var471 < 4000) {
                        if (var471 == 3903) {
                            var5--;
                            int var234 = field776[var5];
                            field776[var5++] = client.field555[var234].method3700();
                            continue;
                        }
                        if (var471 == 3904) {
                            var5--;
                            int var235 = field776[var5];
                            field776[var5++] = client.field555[var235].field3170;
                            continue;
                        }
                        if (var471 == 3905) {
                            var5--;
                            int var236 = field776[var5];
                            field776[var5++] = client.field555[var236].field3168;
                            continue;
                        }
                        if (var471 == 3906) {
                            var5--;
                            int var237 = field776[var5];
                            field776[var5++] = client.field555[var237].field3171;
                            continue;
                        }
                        if (var471 == 3907) {
                            var5--;
                            int var238 = field776[var5];
                            field776[var5++] = client.field555[var238].field3172;
                            continue;
                        }
                        if (var471 == 3908) {
                            var5--;
                            int var239 = field776[var5];
                            field776[var5++] = client.field555[var239].field3169;
                            continue;
                        }
                        if (var471 == 3910) {
                            var5--;
                            int var240 = field776[var5];
                            int var241 = client.field555[var240].method3715();
                            field776[var5++] = var241 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var471 == 3911) {
                            var5--;
                            int var242 = field776[var5];
                            int var243 = client.field555[var242].method3715();
                            field776[var5++] = var243 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var471 == 3912) {
                            var5--;
                            int var244 = field776[var5];
                            int var245 = client.field555[var244].method3715();
                            field776[var5++] = var245 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var471 == 3913) {
                            var5--;
                            int var246 = field776[var5];
                            int var247 = client.field555[var246].method3715();
                            field776[var5++] = var247 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var471 == 3914) {
                            var5--;
                            boolean var248 = field776[var5] == 1;
                            if (Statics.field169 != null) {
                                Statics.field169.method3717(class222.field3174, var248);
                            }
                            continue;
                        }
                        if (var471 == 3915) {
                            var5--;
                            boolean var249 = field776[var5] == 1;
                            if (Statics.field169 != null) {
                                Statics.field169.method3717(class222.field3176, var249);
                            }
                            continue;
                        }
                        if (var471 == 3916) {
                            var5 -= 2;
                            boolean var250 = field776[var5] == 1;
                            boolean var251 = field776[var5 + 1] == 1;
                            if (Statics.field169 != null) {
                                Statics.field169.method3717(new class22(var251), var250);
                            }
                            continue;
                        }
                        if (var471 == 3917) {
                            var5--;
                            boolean var252 = field776[var5] == 1;
                            if (Statics.field169 != null) {
                                Statics.field169.method3717(class222.field3175, var252);
                            }
                            continue;
                        }
                        if (var471 == 3918) {
                            var5--;
                            boolean var253 = field776[var5] == 1;
                            if (Statics.field169 != null) {
                                Statics.field169.method3717(class222.field3178, var253);
                            }
                            continue;
                        }
                        if (var471 == 3919) {
                            field776[var5++] = Statics.field169 == null ? 0 : Statics.field169.field3177.size();
                            continue;
                        }
                        if (var471 == 3920) {
                            var5--;
                            int var254 = field776[var5];
                            class215 var255 = (class215) Statics.field169.field3177.get(var254);
                            field776[var5++] = var255.field3150;
                            continue;
                        }
                        if (var471 == 3921) {
                            var5--;
                            int var256 = field776[var5];
                            class215 var257 = (class215) Statics.field169.field3177.get(var256);
                            field770[var6++] = var257.method3658();
                            continue;
                        }
                        if (var471 == 3922) {
                            var5--;
                            int var258 = field776[var5];
                            class215 var259 = (class215) Statics.field169.field3177.get(var258);
                            field770[var6++] = var259.method3659();
                            continue;
                        }
                        if (var471 == 3923) {
                            var5--;
                            int var260 = field776[var5];
                            class215 var261 = (class215) Statics.field169.field3177.get(var260);
                            long var262 = class116.method2794() - Statics.field32 - var261.field3148;
                            int var264 = (int) (var262 / 3600000L);
                            int var265 = (int) ((var262 - (long) (var264 * 3600000)) / 60000L);
                            int var266 = (int) ((var262 - (long) (var264 * 3600000) - (long) (var265 * 60000)) / 1000L);
                            String var267 = var264 + ":" + var265 / 10 + var265 % 10 + ":" + var266 / 10 + var266 % 10;
                            field770[var6++] = var267;
                            continue;
                        }
                        if (var471 == 3924) {
                            var5--;
                            int var268 = field776[var5];
                            class215 var269 = (class215) Statics.field169.field3177.get(var268);
                            field776[var5++] = var269.field3147.field3171;
                            continue;
                        }
                        if (var471 == 3925) {
                            var5--;
                            int var270 = field776[var5];
                            class215 var271 = (class215) Statics.field169.field3177.get(var270);
                            field776[var5++] = var271.field3147.field3168;
                            continue;
                        }
                        if (var471 == 3926) {
                            var5--;
                            int var272 = field776[var5];
                            class215 var273 = (class215) Statics.field169.field3177.get(var272);
                            field776[var5++] = var273.field3147.field3170;
                            continue;
                        }
                    } else if (var471 < 4100) {
                        if (var471 == 4000) {
                            var5 -= 2;
                            int var274 = field776[var5];
                            int var275 = field776[var5 + 1];
                            field776[var5++] = var274 + var275;
                            continue;
                        }
                        if (var471 == 4001) {
                            var5 -= 2;
                            int var276 = field776[var5];
                            int var277 = field776[var5 + 1];
                            field776[var5++] = var276 - var277;
                            continue;
                        }
                        if (var471 == 4002) {
                            var5 -= 2;
                            int var278 = field776[var5];
                            int var279 = field776[var5 + 1];
                            field776[var5++] = var278 * var279;
                            continue;
                        }
                        if (var471 == 4003) {
                            var5 -= 2;
                            int var280 = field776[var5];
                            int var281 = field776[var5 + 1];
                            field776[var5++] = var280 / var281;
                            continue;
                        }
                        if (var471 == 4004) {
                            var5--;
                            int var282 = field776[var5];
                            field776[var5++] = (int) (Math.random() * (double) var282);
                            continue;
                        }
                        if (var471 == 4005) {
                            var5--;
                            int var283 = field776[var5];
                            field776[var5++] = (int) (Math.random() * (double) (var283 + 1));
                            continue;
                        }
                        if (var471 == 4006) {
                            var5 -= 5;
                            int var284 = field776[var5];
                            int var285 = field776[var5 + 1];
                            int var286 = field776[var5 + 2];
                            int var287 = field776[var5 + 3];
                            int var288 = field776[var5 + 4];
                            field776[var5++] = (var285 - var284) * (var288 - var286) / (var287 - var286) + var284;
                            continue;
                        }
                        if (var471 == 4007) {
                            var5 -= 2;
                            int var289 = field776[var5];
                            int var290 = field776[var5 + 1];
                            field776[var5++] = var289 * var290 / 100 + var289;
                            continue;
                        }
                        if (var471 == 4008) {
                            var5 -= 2;
                            int var291 = field776[var5];
                            int var292 = field776[var5 + 1];
                            field776[var5++] = var291 | 0x1 << var292;
                            continue;
                        }
                        if (var471 == 4009) {
                            var5 -= 2;
                            int var293 = field776[var5];
                            int var294 = field776[var5 + 1];
                            field776[var5++] = var293 & -1 - (0x1 << var294);
                            continue;
                        }
                        if (var471 == 4010) {
                            var5 -= 2;
                            int var295 = field776[var5];
                            int var296 = field776[var5 + 1];
                            field776[var5++] = (var295 & 0x1 << var296) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var471 == 4011) {
                            var5 -= 2;
                            int var297 = field776[var5];
                            int var298 = field776[var5 + 1];
                            field776[var5++] = var297 % var298;
                            continue;
                        }
                        if (var471 == 4012) {
                            var5 -= 2;
                            int var299 = field776[var5];
                            int var300 = field776[var5 + 1];
                            if (var299 == 0) {
                                field776[var5++] = 0;
                            } else {
                                field776[var5++] = (int) Math.pow((double) var299, (double) var300);
                            }
                            continue;
                        }
                        if (var471 == 4013) {
                            var5 -= 2;
                            int var301 = field776[var5];
                            int var302 = field776[var5 + 1];
                            if (var301 == 0) {
                                field776[var5++] = 0;
                            } else if (var302 == 0) {
                                field776[var5++] = Integer.MAX_VALUE;
                            } else {
                                field776[var5++] = (int) Math.pow((double) var301, 1.0D / (double) var302);
                            }
                            continue;
                        }
                        if (var471 == 4014) {
                            var5 -= 2;
                            int var303 = field776[var5];
                            int var304 = field776[var5 + 1];
                            field776[var5++] = var303 & var304;
                            continue;
                        }
                        if (var471 == 4015) {
                            var5 -= 2;
                            int var305 = field776[var5];
                            int var306 = field776[var5 + 1];
                            field776[var5++] = var305 | var306;
                            continue;
                        }
                    } else if (var471 < 4200) {
                        if (var471 == 4100) {
                            var6--;
                            String var307 = field770[var6];
                            var5--;
                            int var308 = field776[var5];
                            field770[var6++] = var307 + var308;
                            continue;
                        }
                        if (var471 == 4101) {
                            var6 -= 2;
                            String var309 = field770[var6];
                            String var310 = field770[var6 + 1];
                            field770[var6++] = var309 + var310;
                            continue;
                        }
                        if (var471 == 4102) {
                            var6--;
                            String var311 = field770[var6];
                            var5--;
                            int var312 = field776[var5];
                            String[] var313 = field770;
                            int var314 = var6++;
                            String var316;
                            if (var312 < 0) {
                                var316 = Integer.toString(var312);
                            } else {
                                var316 = class164.method2681(var312, 10, true);
                            }
                            var313[var314] = var311 + var316;
                            continue;
                        }
                        if (var471 == 4103) {
                            var6--;
                            String var317 = field770[var6];
                            field770[var6++] = var317.toLowerCase();
                            continue;
                        }
                        if (var471 == 4104) {
                            var5--;
                            int var318 = field776[var5];
                            long var319 = ((long) var318 + 11745L) * 86400000L;
                            field782.setTime(new Date(var319));
                            int var321 = field782.get(5);
                            int var322 = field782.get(2);
                            int var323 = field782.get(1);
                            field770[var6++] = var321 + "-" + field775[var322] + "-" + var323;
                            continue;
                        }
                        if (var471 == 4105) {
                            var6 -= 2;
                            String var324 = field770[var6];
                            String var325 = field770[var6 + 1];
                            if (Statics.field573.field36 != null && Statics.field573.field36.field2922) {
                                field770[var6++] = var325;
                                continue;
                            }
                            field770[var6++] = var324;
                            continue;
                        }
                        if (var471 == 4106) {
                            var5--;
                            int var326 = field776[var5];
                            field770[var6++] = Integer.toString(var326);
                            continue;
                        }
                        if (var471 == 4107) {
                            var6 -= 2;
                            int[] var327 = field776;
                            int var328 = var5++;
                            String var329 = field770[var6];
                            String var330 = field770[var6 + 1];
                            int var331 = client.field287;
                            int var332 = var329.length();
                            int var333 = var330.length();
                            int var334 = 0;
                            int var335 = 0;
                            byte var336 = 0;
                            byte var337 = 0;
                            int var338;
                            label2891: while (true) {
                                if (var334 - var336 >= var332 && var335 - var337 >= var333) {
                                    int var349 = Math.min(var332, var333);
                                    for (int var350 = 0; var350 < var349; var350++) {
                                        char var353 = var329.charAt(var350);
                                        char var354 = var330.charAt(var350);
                                        if (var353 != var354 && Character.toUpperCase(var353) != Character.toUpperCase(var354)) {
                                            char var355 = Character.toLowerCase(var353);
                                            char var356 = Character.toLowerCase(var354);
                                            if (var355 != var356) {
                                                var338 = class167.method2059(var355, var331) - class167.method2059(var356, var331);
                                                break label2891;
                                            }
                                        }
                                    }
                                    int var357 = var332 - var333;
                                    if (var357 == 0) {
                                        for (int var358 = 0; var358 < var349; var358++) {
                                            char var359 = var329.charAt(var358);
                                            char var360 = var330.charAt(var358);
                                            if (var359 != var360) {
                                                var338 = class167.method2059(var359, var331) - class167.method2059(var360, var331);
                                                break label2891;
                                            }
                                        }
                                        var338 = 0;
                                    } else {
                                        var338 = var357;
                                    }
                                    break;
                                }
                                if (var334 - var336 >= var332) {
                                    var338 = -1;
                                    break;
                                }
                                if (var335 - var337 >= var333) {
                                    var338 = 1;
                                    break;
                                }
                                char var339;
                                if (var336 == 0) {
                                    var339 = var329.charAt(var334++);
                                } else {
                                    var339 = (char) var336;
                                    boolean var340 = false;
                                }
                                char var341;
                                if (var337 == 0) {
                                    var341 = var330.charAt(var335++);
                                } else {
                                    var341 = (char) var337;
                                    boolean var342 = false;
                                }
                                byte var343;
                                if (var339 == 198) {
                                    var343 = 69;
                                } else if (var339 == 230) {
                                    var343 = 101;
                                } else if (var339 == 223) {
                                    var343 = 115;
                                } else if (var339 == 338) {
                                    var343 = 69;
                                } else if (var339 == 339) {
                                    var343 = 101;
                                } else {
                                    var343 = 0;
                                }
                                var336 = var343;
                                byte var344;
                                if (var341 == 198) {
                                    var344 = 69;
                                } else if (var341 == 230) {
                                    var344 = 101;
                                } else if (var341 == 223) {
                                    var344 = 115;
                                } else if (var341 == 338) {
                                    var344 = 69;
                                } else if (var341 == 339) {
                                    var344 = 101;
                                } else {
                                    var344 = 0;
                                }
                                var337 = var344;
                                char var345 = class167.method3680(var339, var331);
                                char var346 = class167.method3680(var341, var331);
                                if (var345 != var346 && Character.toUpperCase(var345) != Character.toUpperCase(var346)) {
                                    char var347 = Character.toLowerCase(var345);
                                    char var348 = Character.toLowerCase(var346);
                                    if (var347 != var348) {
                                        var338 = class167.method2059(var347, var331) - class167.method2059(var348, var331);
                                        break;
                                    }
                                }
                            }
                            var327[var328] = class164.method919(var338);
                            continue;
                        }
                        if (var471 == 4108) {
                            var6--;
                            String var361 = field770[var6];
                            var5 -= 2;
                            int var362 = field776[var5];
                            int var363 = field776[var5 + 1];
                            byte[] var364 = Statics.field1320.method3048(var363, 0);
                            class225 var365 = new class225(var364);
                            field776[var5++] = var365.method3736(var361, var362);
                            continue;
                        }
                        if (var471 == 4109) {
                            var6--;
                            String var366 = field770[var6];
                            var5 -= 2;
                            int var367 = field776[var5];
                            int var368 = field776[var5 + 1];
                            byte[] var369 = Statics.field1320.method3048(var368, 0);
                            class225 var370 = new class225(var369);
                            field776[var5++] = var370.method3735(var366, var367);
                            continue;
                        }
                        if (var471 == 4110) {
                            var6 -= 2;
                            String var371 = field770[var6];
                            String var372 = field770[var6 + 1];
                            var5--;
                            if (field776[var5] == 1) {
                                field770[var6++] = var371;
                            } else {
                                field770[var6++] = var372;
                            }
                            continue;
                        }
                        if (var471 == 4111) {
                            var6--;
                            String var373 = field770[var6];
                            field770[var6++] = class224.method3791(var373);
                            continue;
                        }
                        if (var471 == 4112) {
                            var6--;
                            String var374 = field770[var6];
                            var5--;
                            int var375 = field776[var5];
                            field770[var6++] = var374 + (char) var375;
                            continue;
                        }
                        if (var471 == 4113) {
                            var5--;
                            int var376 = field776[var5];
                            field776[var5++] = class164.method2936((char) var376) ? 1 : 0;
                            continue;
                        }
                        if (var471 == 4114) {
                            var5--;
                            int var377 = field776[var5];
                            field776[var5++] = class164.method185((char) var377) ? 1 : 0;
                            continue;
                        }
                        if (var471 == 4115) {
                            var5--;
                            int var378 = field776[var5];
                            int[] var379 = field776;
                            int var380 = var5++;
                            char var381 = (char) var378;
                            boolean var382 = var381 >= 'A' && var381 <= 'Z' || var381 >= 'a' && var381 <= 'z';
                            var379[var380] = var382 ? 1 : 0;
                            continue;
                        }
                        if (var471 == 4116) {
                            var5--;
                            int var383 = field776[var5];
                            int[] var384 = field776;
                            int var385 = var5++;
                            char var386 = (char) var383;
                            boolean var387 = var386 >= '0' && var386 <= '9';
                            var384[var385] = var387 ? 1 : 0;
                            continue;
                        }
                        if (var471 == 4117) {
                            var6--;
                            String var388 = field770[var6];
                            if (var388 == null) {
                                field776[var5++] = 0;
                            } else {
                                field776[var5++] = var388.length();
                            }
                            continue;
                        }
                        if (var471 == 4118) {
                            var6--;
                            String var389 = field770[var6];
                            var5 -= 2;
                            int var390 = field776[var5];
                            int var391 = field776[var5 + 1];
                            field770[var6++] = var389.substring(var390, var391);
                            continue;
                        }
                        if (var471 == 4119) {
                            var6--;
                            String var392 = field770[var6];
                            StringBuilder var393 = new StringBuilder(var392.length());
                            boolean var394 = false;
                            for (int var395 = 0; var395 < var392.length(); var395++) {
                                char var396 = var392.charAt(var395);
                                if (var396 == '<') {
                                    var394 = true;
                                } else if (var396 == '>') {
                                    var394 = false;
                                } else if (!var394) {
                                    var393.append(var396);
                                }
                            }
                            field770[var6++] = var393.toString();
                            continue;
                        }
                        if (var471 == 4120) {
                            var6--;
                            String var397 = field770[var6];
                            var5--;
                            int var398 = field776[var5];
                            field776[var5++] = var397.indexOf(var398);
                            continue;
                        }
                        if (var471 == 4121) {
                            var6 -= 2;
                            String var399 = field770[var6];
                            String var400 = field770[var6 + 1];
                            var5--;
                            int var401 = field776[var5];
                            field776[var5++] = var399.indexOf(var400, var401);
                            continue;
                        }
                    } else if (var471 < 4300) {
                        if (var471 == 4200) {
                            var5--;
                            int var402 = field776[var5];
                            field770[var6++] = class52.method696(var402).field1092;
                            continue;
                        }
                        if (var471 == 4201) {
                            var5 -= 2;
                            int var403 = field776[var5];
                            int var404 = field776[var5 + 1];
                            class52 var405 = class52.method696(var403);
                            if (var404 >= 1 && var404 <= 5 && var405.field1106[var404 - 1] != null) {
                                field770[var6++] = var405.field1106[var404 - 1];
                                continue;
                            }
                            field770[var6++] = "";
                            continue;
                        }
                        if (var471 == 4202) {
                            var5 -= 2;
                            int var406 = field776[var5];
                            int var407 = field776[var5 + 1];
                            class52 var408 = class52.method696(var406);
                            if (var407 >= 1 && var407 <= 5 && var408.field1131[var407 - 1] != null) {
                                field770[var6++] = var408.field1131[var407 - 1];
                                continue;
                            }
                            field770[var6++] = "";
                            continue;
                        }
                        if (var471 == 4203) {
                            var5--;
                            int var409 = field776[var5];
                            field776[var5++] = class52.method696(var409).field1126;
                            continue;
                        }
                        if (var471 == 4204) {
                            var5--;
                            int var410 = field776[var5];
                            field776[var5++] = class52.method696(var410).field1103 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var471 == 4205) {
                            var5--;
                            int var411 = field776[var5];
                            class52 var412 = class52.method696(var411);
                            if (var412.field1123 == -1 && var412.field1122 >= 0) {
                                field776[var5++] = var412.field1122;
                                continue;
                            }
                            field776[var5++] = var411;
                            continue;
                        }
                        if (var471 == 4206) {
                            var5--;
                            int var413 = field776[var5];
                            class52 var414 = class52.method696(var413);
                            if (var414.field1123 >= 0 && var414.field1122 >= 0) {
                                field776[var5++] = var414.field1122;
                                continue;
                            }
                            field776[var5++] = var413;
                            continue;
                        }
                        if (var471 == 4207) {
                            var5--;
                            int var415 = field776[var5];
                            field776[var5++] = class52.method696(var415).field1124 ? 1 : 0;
                            continue;
                        }
                        if (var471 == 4210) {
                            var6--;
                            String var416 = field770[var6];
                            var5--;
                            int var417 = field776[var5];
                            client.method729(var416, var417 == 1);
                            field776[var5++] = Statics.field230;
                            continue;
                        }
                        if (var471 == 4211) {
                            if (Statics.field1995 != null && Statics.field854 < Statics.field230) {
                                field776[var5++] = Statics.field1995[++Statics.field854 - 1] & 0xFFFF;
                                continue;
                            }
                            field776[var5++] = -1;
                            continue;
                        }
                        if (var471 == 4212) {
                            Statics.field854 = 0;
                            continue;
                        }
                    } else if (var471 < 5100) {
                        if (var471 == 5000) {
                            field776[var5++] = client.field519;
                            continue;
                        }
                        if (var471 == 5001) {
                            var5 -= 3;
                            client.field519 = field776[var5];
                            Statics.field1760 = class131.method159(field776[var5 + 1]);
                            if (Statics.field1760 == null) {
                                Statics.field1760 = class131.field2050;
                            }
                            client.field498 = field776[var5 + 2];
                            client.field322.method2594(242);
                            client.field322.method2397(client.field519);
                            client.field322.method2397(Statics.field1760.field2051);
                            client.field322.method2397(client.field498);
                            continue;
                        }
                        if (var471 == 5002) {
                            var6--;
                            String var418 = field770[var6];
                            var5 -= 2;
                            int var419 = field776[var5];
                            int var420 = field776[var5 + 1];
                            client.field322.method2594(57);
                            client.field322.method2397(class120.method957(var418) + 2);
                            client.field322.method2346(var418);
                            client.field322.method2397(var419 - 1);
                            client.field322.method2397(var420);
                            continue;
                        }
                        if (var471 == 5003) {
                            var5 -= 2;
                            int var421 = field776[var5];
                            int var422 = field776[var5 + 1];
                            class36 var423 = class12.method988(var421, var422);
                            if (var423 == null) {
                                field776[var5++] = -1;
                                field776[var5++] = 0;
                                field770[var6++] = "";
                                field770[var6++] = "";
                                field770[var6++] = "";
                            } else {
                                field776[var5++] = var423.field761;
                                field776[var5++] = var423.field760;
                                field770[var6++] = var423.field762 == null ? "" : var423.field762;
                                field770[var6++] = var423.field768 == null ? "" : var423.field768;
                                field770[var6++] = var423.field764 == null ? "" : var423.field764;
                            }
                            continue;
                        }
                        if (var471 == 5004) {
                            var5--;
                            int var424 = field776[var5];
                            class36 var425 = (class36) class12.field172.method3528((long) var424);
                            if (var425 == null) {
                                field776[var5++] = -1;
                                field776[var5++] = 0;
                                field770[var6++] = "";
                                field770[var6++] = "";
                                field770[var6++] = "";
                            } else {
                                field776[var5++] = var425.field769;
                                field776[var5++] = var425.field760;
                                field770[var6++] = var425.field762 == null ? "" : var425.field762;
                                field770[var6++] = var425.field768 == null ? "" : var425.field768;
                                field770[var6++] = var425.field764 == null ? "" : var425.field764;
                            }
                            continue;
                        }
                        if (var471 == 5005) {
                            if (Statics.field1760 == null) {
                                field776[var5++] = -1;
                            } else {
                                field776[var5++] = Statics.field1760.field2051;
                            }
                            continue;
                        }
                        if (var471 == 5008) {
                            var6--;
                            String var427 = field770[var6];
                            var5--;
                            int var428 = field776[var5];
                            String var429 = var427.toLowerCase();
                            byte var430 = 0;
                            if (var429.startsWith(class158.field2476)) {
                                var430 = 0;
                                var427 = var427.substring(class158.field2476.length());
                            } else if (var429.startsWith(class158.field2363)) {
                                var430 = 1;
                                var427 = var427.substring(class158.field2363.length());
                            } else if (var429.startsWith(class158.field2485)) {
                                var430 = 2;
                                var427 = var427.substring(class158.field2485.length());
                            } else if (var429.startsWith(class158.field2370)) {
                                var430 = 3;
                                var427 = var427.substring(class158.field2370.length());
                            } else if (var429.startsWith(class158.field2551)) {
                                var430 = 4;
                                var427 = var427.substring(class158.field2551.length());
                            } else if (var429.startsWith(class158.field2525)) {
                                var430 = 5;
                                var427 = var427.substring(class158.field2525.length());
                            } else if (var429.startsWith(class158.field2328)) {
                                var430 = 6;
                                var427 = var427.substring(class158.field2328.length());
                            } else if (var429.startsWith(class158.field2580)) {
                                var430 = 7;
                                var427 = var427.substring(class158.field2580.length());
                            } else if (var429.startsWith(class158.field2460)) {
                                var430 = 8;
                                var427 = var427.substring(class158.field2460.length());
                            } else if (var429.startsWith(class158.field2499)) {
                                var430 = 9;
                                var427 = var427.substring(class158.field2499.length());
                            } else if (var429.startsWith(class158.field2435)) {
                                var430 = 10;
                                var427 = var427.substring(class158.field2435.length());
                            } else if (var429.startsWith(class158.field2503)) {
                                var430 = 11;
                                var427 = var427.substring(class158.field2503.length());
                            } else if (client.field287 != 0) {
                                if (var429.startsWith(class158.field2482)) {
                                    var430 = 0;
                                    var427 = var427.substring(class158.field2482.length());
                                } else if (var429.startsWith(class158.field2484)) {
                                    var430 = 1;
                                    var427 = var427.substring(class158.field2484.length());
                                } else if (var429.startsWith(class158.field2481)) {
                                    var430 = 2;
                                    var427 = var427.substring(class158.field2481.length());
                                } else if (var429.startsWith(class158.field2488)) {
                                    var430 = 3;
                                    var427 = var427.substring(class158.field2488.length());
                                } else if (var429.startsWith(class158.field2490)) {
                                    var430 = 4;
                                    var427 = var427.substring(class158.field2490.length());
                                } else if (var429.startsWith(class158.field2581)) {
                                    var430 = 5;
                                    var427 = var427.substring(class158.field2581.length());
                                } else if (var429.startsWith(class158.field2486)) {
                                    var430 = 6;
                                    var427 = var427.substring(class158.field2486.length());
                                } else if (var429.startsWith(class158.field2493)) {
                                    var430 = 7;
                                    var427 = var427.substring(class158.field2493.length());
                                } else if (var429.startsWith(class158.field2498)) {
                                    var430 = 8;
                                    var427 = var427.substring(class158.field2498.length());
                                } else if (var429.startsWith(class158.field2440)) {
                                    var430 = 9;
                                    var427 = var427.substring(class158.field2440.length());
                                } else if (var429.startsWith(class158.field2577)) {
                                    var430 = 10;
                                    var427 = var427.substring(class158.field2577.length());
                                } else if (var429.startsWith(class158.field2504)) {
                                    var430 = 11;
                                    var427 = var427.substring(class158.field2504.length());
                                }
                            }
                            String var431 = var427.toLowerCase();
                            byte var432 = 0;
                            if (var431.startsWith(class158.field2406)) {
                                var432 = 1;
                                var427 = var427.substring(class158.field2406.length());
                            } else if (var431.startsWith(class158.field2334)) {
                                var432 = 2;
                                var427 = var427.substring(class158.field2334.length());
                            } else if (var431.startsWith(class158.field2379)) {
                                var432 = 3;
                                var427 = var427.substring(class158.field2379.length());
                            } else if (var431.startsWith(class158.field2511)) {
                                var432 = 4;
                                var427 = var427.substring(class158.field2511.length());
                            } else if (var431.startsWith(class158.field2513)) {
                                var432 = 5;
                                var427 = var427.substring(class158.field2513.length());
                            } else if (client.field287 != 0) {
                                if (var431.startsWith(class158.field2433)) {
                                    var432 = 1;
                                    var427 = var427.substring(class158.field2433.length());
                                } else if (var431.startsWith(class158.field2508)) {
                                    var432 = 2;
                                    var427 = var427.substring(class158.field2508.length());
                                } else if (var431.startsWith(class158.field2510)) {
                                    var432 = 3;
                                    var427 = var427.substring(class158.field2510.length());
                                } else if (var431.startsWith(class158.field2445)) {
                                    var432 = 4;
                                    var427 = var427.substring(class158.field2445.length());
                                } else if (var431.startsWith(class158.field2514)) {
                                    var432 = 5;
                                    var427 = var427.substring(class158.field2514.length());
                                }
                            }
                            client.field322.method2594(252);
                            client.field322.method2397(0);
                            int var433 = client.field322.field1977;
                            client.field322.method2397(var428);
                            client.field322.method2397(var430);
                            client.field322.method2397(var432);
                            class223.method2927(client.field322, var427);
                            client.field322.method2356(client.field322.field1977 - var433);
                            continue;
                        }
                        if (var471 == 5009) {
                            var6 -= 2;
                            String var434 = field770[var6];
                            String var435 = field770[var6 + 1];
                            client.field322.method2594(233);
                            client.field322.method2545(0);
                            int var436 = client.field322.field1977;
                            client.field322.method2346(var434);
                            class223.method2927(client.field322, var435);
                            client.field322.method2351(client.field322.field1977 - var436);
                            continue;
                        }
                        if (var471 == 5015) {
                            String var437;
                            if (Statics.field573 == null || Statics.field573.field46 == null) {
                                var437 = "";
                            } else {
                                var437 = Statics.field573.field46;
                            }
                            field770[var6++] = var437;
                            continue;
                        }
                        if (var471 == 5016) {
                            field776[var5++] = client.field498;
                            continue;
                        }
                        if (var471 == 5017) {
                            var5--;
                            int var438 = field776[var5];
                            int[] var439 = field776;
                            int var440 = var5++;
                            class28 var441 = (class28) class12.field173.get(var438);
                            int var442;
                            if (var441 == null) {
                                var442 = 0;
                            } else {
                                var442 = var441.method631();
                            }
                            var439[var440] = var442;
                            continue;
                        }
                        if (var471 == 5018) {
                            var5--;
                            int var443 = field776[var5];
                            field776[var5++] = class12.method3020(var443);
                            continue;
                        }
                        if (var471 == 5019) {
                            var5--;
                            int var444 = field776[var5];
                            int[] var445 = field776;
                            int var446 = var5++;
                            class36 var447 = (class36) class12.field172.method3528((long) var444);
                            int var448;
                            if (var447 == null) {
                                var448 = -1;
                            } else if (class12.field174.field3101 == var447.field3105) {
                                var448 = -1;
                            } else {
                                var448 = ((class36) var447.field3105).field761;
                            }
                            var445[var446] = var448;
                            continue;
                        }
                        if (var471 == 5020) {
                            var6--;
                            String var449 = field770[var6];
                            if (var449.equalsIgnoreCase("toggleroof")) {
                                Statics.field866.field147 = !Statics.field866.field147;
                                class9.method890();
                                if (Statics.field866.field147) {
                                    class12.method1945(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method1945(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var449.equalsIgnoreCase("displayfps")) {
                                client.field296 = !client.field296;
                            }
                            if (client.field483 >= 2) {
                                if (var449.equalsIgnoreCase("fpson")) {
                                    client.field296 = true;
                                }
                                if (var449.equalsIgnoreCase("fpsoff")) {
                                    client.field296 = false;
                                }
                                if (var449.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var449.equalsIgnoreCase("clientdrop")) {
                                    client.method47();
                                }
                                if (var449.equalsIgnoreCase("errortest") && client.field283 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field322.method2594(81);
                            client.field322.method2397(var449.length() + 1);
                            client.field322.method2346(var449);
                            continue;
                        }
                        if (var471 == 5021) {
                            var6--;
                            client.field496 = field770[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var471 == 5022) {
                            field770[var6++] = client.field496;
                            continue;
                        }
                    }
                }
                if (var471 < 5400) {
                    if (var471 == 5306) {
                        field776[var5++] = client.method1951();
                        continue;
                    }
                    if (var471 == 5307) {
                        var5--;
                        int var450 = field776[var5];
                        if (var450 == 1 || var450 == 2) {
                            client.method116(var450);
                        }
                        continue;
                    }
                    if (var471 == 5308) {
                        field776[var5++] = Statics.field866.field149;
                        continue;
                    }
                    if (var471 == 5309) {
                        var5--;
                        int var451 = field776[var5];
                        if (var451 == 1 || var451 == 2) {
                            Statics.field866.field149 = var451;
                            class9.method890();
                        }
                        continue;
                    }
                }
                if (var471 < 5600) {
                    if (var471 == 5504) {
                        var5 -= 2;
                        int var452 = field776[var5];
                        int var453 = field776[var5 + 1];
                        if (!client.field314) {
                            client.field450 = var452;
                            client.field369 = var453;
                        }
                        continue;
                    }
                    if (var471 == 5505) {
                        field776[var5++] = client.field450;
                        continue;
                    }
                    if (var471 == 5506) {
                        field776[var5++] = client.field369;
                        continue;
                    }
                    if (var471 == 5530) {
                        var5--;
                        int var454 = field776[var5];
                        if (var454 < 0) {
                            var454 = 0;
                        }
                        client.field323 = var454;
                        continue;
                    }
                    if (var471 == 5531) {
                        field776[var5++] = client.field323;
                        continue;
                    }
                }
                if (var471 >= 5700 || var471 != 5630) {
                    if (var471 < 6300) {
                        if (var471 == 6200) {
                            var5 -= 2;
                            client.field533 = (short) field776[var5];
                            if (client.field533 <= 0) {
                                client.field533 = 256;
                            }
                            client.field534 = (short) field776[var5 + 1];
                            if (client.field534 <= 0) {
                                client.field534 = 205;
                            }
                            continue;
                        }
                        if (var471 == 6201) {
                            var5 -= 2;
                            client.field535 = (short) field776[var5];
                            if (client.field535 <= 0) {
                                client.field535 = 256;
                            }
                            client.field536 = (short) field776[var5 + 1];
                            if (client.field536 <= 0) {
                                client.field536 = 320;
                            }
                            continue;
                        }
                        if (var471 == 6202) {
                            var5 -= 4;
                            client.field462 = (short) field776[var5];
                            if (client.field462 <= 0) {
                                client.field462 = 1;
                            }
                            client.field457 = (short) field776[var5 + 1];
                            if (client.field457 <= 0) {
                                client.field457 = 32767;
                            } else if (client.field457 < client.field462) {
                                client.field457 = client.field462;
                            }
                            client.field539 = (short) field776[var5 + 2];
                            if (client.field539 <= 0) {
                                client.field539 = 1;
                            }
                            client.field527 = (short) field776[var5 + 3];
                            if (client.field527 <= 0) {
                                client.field527 = 32767;
                            } else if (client.field527 < client.field539) {
                                client.field527 = client.field539;
                            }
                            continue;
                        }
                        if (var471 == 6203) {
                            if (client.field511 == null) {
                                field776[var5++] = -1;
                                field776[var5++] = -1;
                            } else {
                                client.method2796(0, 0, client.field511.field2771, client.field511.field2835, false);
                                field776[var5++] = client.field372;
                                field776[var5++] = client.field544;
                            }
                            continue;
                        }
                        if (var471 == 6204) {
                            field776[var5++] = client.field535;
                            field776[var5++] = client.field536;
                            continue;
                        }
                        if (var471 == 6205) {
                            field776[var5++] = client.field533;
                            field776[var5++] = client.field534;
                            continue;
                        }
                    }
                    if (var471 < 6600) {
                        if (var471 == 6500) {
                            field776[var5++] = class26.method3111() ? 1 : 0;
                            continue;
                        }
                        if (var471 == 6501) {
                            class26.field614 = 0;
                            class26 var455 = class26.method648();
                            if (var455 == null) {
                                field776[var5++] = -1;
                                field776[var5++] = 0;
                                field770[var6++] = "";
                                field776[var5++] = 0;
                                field776[var5++] = 0;
                                field770[var6++] = "";
                            } else {
                                field776[var5++] = var455.field621;
                                field776[var5++] = var455.field622;
                                field770[var6++] = var455.field625;
                                field776[var5++] = var455.field626;
                                field776[var5++] = var455.field623;
                                field770[var6++] = var455.field624;
                            }
                            continue;
                        }
                        if (var471 == 6502) {
                            class26 var457 = class26.method648();
                            if (var457 == null) {
                                field776[var5++] = -1;
                                field776[var5++] = 0;
                                field770[var6++] = "";
                                field776[var5++] = 0;
                                field776[var5++] = 0;
                                field770[var6++] = "";
                            } else {
                                field776[var5++] = var457.field621;
                                field776[var5++] = var457.field622;
                                field770[var6++] = var457.field625;
                                field776[var5++] = var457.field626;
                                field776[var5++] = var457.field623;
                                field770[var6++] = var457.field624;
                            }
                            continue;
                        }
                        if (var471 == 6506) {
                            var5--;
                            int var458 = field776[var5];
                            class26 var459 = null;
                            for (int var460 = 0; var460 < class26.field617; var460++) {
                                if (Statics.field616[var460].field621 == var458) {
                                    var459 = Statics.field616[var460];
                                    break;
                                }
                            }
                            if (var459 == null) {
                                field776[var5++] = -1;
                                field776[var5++] = 0;
                                field770[var6++] = "";
                                field776[var5++] = 0;
                                field776[var5++] = 0;
                                field770[var6++] = "";
                            } else {
                                field776[var5++] = var459.field621;
                                field776[var5++] = var459.field622;
                                field770[var6++] = var459.field625;
                                field776[var5++] = var459.field626;
                                field776[var5++] = var459.field623;
                                field770[var6++] = var459.field624;
                            }
                            continue;
                        }
                        if (var471 == 6507) {
                            var5 -= 4;
                            int var461 = field776[var5];
                            boolean var462 = field776[var5 + 1] == 1;
                            int var463 = field776[var5 + 2];
                            boolean var464 = field776[var5 + 3] == 1;
                            class26.method3114(var461, var462, var463, var464);
                            continue;
                        }
                        if (var471 == 6511) {
                            var5--;
                            int var465 = field776[var5];
                            if (var465 >= 0 && var465 < class26.field617) {
                                class26 var466 = Statics.field616[var465];
                                field776[var5++] = var466.field621;
                                field776[var5++] = var466.field622;
                                field770[var6++] = var466.field625;
                                field776[var5++] = var466.field626;
                                field776[var5++] = var466.field623;
                                field770[var6++] = var466.field624;
                                continue;
                            }
                            field776[var5++] = -1;
                            field776[var5++] = 0;
                            field770[var6++] = "";
                            field776[var5++] = 0;
                            field776[var5++] = 0;
                            field770[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field473 = 250;
            }
        } catch (Exception var470) {
            StringBuilder var468 = new StringBuilder(30);
            var468.append("").append(var4.field3116).append(" ");
            for (int var469 = field778 - 1; var469 >= 0; var469--) {
                var468.append("").append(field779[var469].field208.field3116).append(" ");
            }
            var468.append("").append(var10);
            class149.method17(var468.toString(), var470);
        }
    }

    @ObfuscatedName("hv.f(II)V")
    public static void method3639(int arg0) {
        if (arg0 == -1 || !class174.method2294(arg0)) {
            return;
        }
        class174[] var1 = Statics.field2838[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174 var3 = var1[var2];
            if (var3.field2837 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field12 = var3.field2837;
                method644(var4, 2000000);
            }
        }
    }
}
