package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("az")
public class class37 {

    @ObfuscatedName("az.x")
    public static int[] field785 = new int[5];

    @ObfuscatedName("az.e")
    public static int[][] field780 = new int[5][5000];

    @ObfuscatedName("az.i")
    public static int[] field781 = new int[1000];

    @ObfuscatedName("az.c")
    public static String[] field782 = new String[1000];

    @ObfuscatedName("az.n")
    public static int field787 = 0;

    @ObfuscatedName("az.l")
    public static class15[] field784 = new class15[50];

    @ObfuscatedName("az.a")
    public static Calendar field786 = Calendar.getInstance();

    @ObfuscatedName("az.d")
    public static final String[] field783 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("az.p")
    public static int field788 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.j(Lj;I)V")
    public static void method736(class1 arg0) {
        method3142(arg0, 200000);
    }

    @ObfuscatedName("fs.h(Lj;II)V")
    public static void method3142(class1 arg0, int arg1) {
        Object[] var2 = arg0.field17;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method995(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field577;
        int[] var9 = var4.field572;
        byte var10 = -1;
        field787 = 0;
        try {
            Statics.field792 = new int[var4.field579];
            int var11 = 0;
            Statics.field778 = new String[var4.field576];
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
                        var14 = arg0.field19 == null ? -1 : arg0.field19.field2775;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field19 == null ? -1 : arg0.field19.field2799;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2775;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2799;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field9;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field1;
                    }
                    Statics.field792[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field11;
                    }
                    Statics.field778[var12++] = var15;
                }
            }
            int var16 = 0;
            field788 = arg0.field8;
            label3084: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var466 = var8[var7];
                if (var466 < 100) {
                    if (var466 == 0) {
                        field781[var5++] = var9[var7];
                        continue;
                    }
                    if (var466 == 1) {
                        int var17 = var9[var7];
                        field781[var5++] = class177.field2901[var17];
                        continue;
                    }
                    if (var466 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class177.field2901[var18] = field781[var5];
                        client.method976(var18);
                        continue;
                    }
                    if (var466 == 3) {
                        field782[var6++] = var4.field575[var7];
                        continue;
                    }
                    if (var466 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var466 == 7) {
                        var5 -= 2;
                        if (field781[var5 + 1] != field781[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var466 == 8) {
                        var5 -= 2;
                        if (field781[var5 + 1] == field781[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var466 == 9) {
                        var5 -= 2;
                        if (field781[var5] < field781[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var466 == 10) {
                        var5 -= 2;
                        if (field781[var5] > field781[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var466 == 21) {
                        if (field787 == 0) {
                            return;
                        }
                        class15 var19 = field784[--field787];
                        var4 = var19.field206;
                        var8 = var4.field577;
                        var9 = var4.field572;
                        var7 = var19.field199;
                        Statics.field792 = var19.field200;
                        Statics.field778 = var19.field201;
                        continue;
                    }
                    if (var466 == 25) {
                        int var20 = var9[var7];
                        field781[var5++] = class177.method1227(var20);
                        continue;
                    }
                    if (var466 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class177.method194(var21, field781[var5]);
                        continue;
                    }
                    if (var466 == 31) {
                        var5 -= 2;
                        if (field781[var5] <= field781[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var466 == 32) {
                        var5 -= 2;
                        if (field781[var5] >= field781[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var466 == 33) {
                        field781[var5++] = Statics.field792[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var466 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field792[var10001] = field781[var5];
                        continue;
                    }
                    if (var466 == 35) {
                        field782[var6++] = Statics.field778[var9[var7]];
                        continue;
                    }
                    if (var466 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field778[var10001] = field782[var6];
                        continue;
                    }
                    if (var466 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class164.method2809(field782, var6, var22);
                        field782[var6++] = var23;
                        continue;
                    }
                    if (var466 == 38) {
                        var5--;
                        continue;
                    }
                    if (var466 == 39) {
                        var6--;
                        continue;
                    }
                    if (var466 == 40) {
                        int var24 = var9[var7];
                        class23 var25 = class23.method995(var24);
                        int[] var26 = new int[var25.field579];
                        String[] var27 = new String[var25.field576];
                        for (int var28 = 0; var28 < var25.field578; var28++) {
                            var26[var28] = field781[var5 - var25.field578 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field582; var29++) {
                            var27[var29] = field782[var6 - var25.field582 + var29];
                        }
                        var5 -= var25.field578;
                        var6 -= var25.field582;
                        class15 var30 = new class15();
                        var30.field206 = var4;
                        var30.field199 = var7;
                        var30.field200 = Statics.field792;
                        var30.field201 = Statics.field778;
                        field784[++field787 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field577;
                        var9 = var25.field572;
                        var7 = -1;
                        Statics.field792 = var26;
                        Statics.field778 = var27;
                        continue;
                    }
                    if (var466 == 42) {
                        field781[var5++] = Statics.field652.method200(var9[var7]);
                        continue;
                    }
                    if (var466 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field652.method199(var10001, field781[var5]);
                        continue;
                    }
                    if (var466 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field781[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field785[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label3084;
                                }
                                field780[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var466 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field781[var5];
                        if (var37 >= 0 && var37 < field785[var36]) {
                            field781[var5++] = field780[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var466 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field781[var5];
                        if (var39 >= 0 && var39 < field785[var38]) {
                            field780[var38][var39] = field781[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var466 == 47) {
                        String var40 = Statics.field652.method214(var9[var7]);
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field782[var6++] = var40;
                        continue;
                    }
                    if (var466 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field652.method201(var10001, field782[var6]);
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var466 < 1000) {
                    if (var466 == 100) {
                        var5 -= 3;
                        int var42 = field781[var5];
                        int var43 = field781[var5 + 1];
                        int var44 = field781[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class174 var45 = class174.method2807(var42);
                        if (var45.field2869 == null) {
                            var45.field2869 = new class174[var44 + 1];
                        }
                        if (var45.field2869.length <= var44) {
                            class174[] var46 = new class174[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2869.length; var47++) {
                                var46[var47] = var45.field2869[var47];
                            }
                            var45.field2869 = var46;
                        }
                        if (var44 > 0 && var45.field2869[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class174 var48 = new class174();
                        var48.field2821 = var43;
                        var48.field2764 = var48.field2775 = var45.field2775;
                        var48.field2799 = var44;
                        var48.field2769 = true;
                        var45.field2869[var44] = var48;
                        if (var41) {
                            Statics.field2156 = var48;
                        } else {
                            Statics.field776 = var48;
                        }
                        client.method29(var45);
                        continue;
                    }
                    if (var466 == 101) {
                        class174 var49 = var41 ? Statics.field2156 : Statics.field776;
                        class174 var50 = class174.method2807(var49.field2775);
                        var50.field2869[var49.field2799] = null;
                        client.method29(var50);
                        continue;
                    }
                    if (var466 == 102) {
                        var5--;
                        class174 var51 = class174.method2807(field781[var5]);
                        var51.field2869 = null;
                        client.method29(var51);
                        continue;
                    }
                    if (var466 == 200) {
                        var5 -= 2;
                        int var52 = field781[var5];
                        int var53 = field781[var5 + 1];
                        class174 var54 = class174.method959(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field781[var5++] = 1;
                            if (var41) {
                                Statics.field2156 = var54;
                            } else {
                                Statics.field776 = var54;
                            }
                            continue;
                        }
                        field781[var5++] = 0;
                        continue;
                    }
                    if (var466 == 201) {
                        var5--;
                        class174 var55 = class174.method2807(field781[var5]);
                        if (var55 == null) {
                            field781[var5++] = 0;
                        } else {
                            field781[var5++] = 1;
                            if (var41) {
                                Statics.field2156 = var55;
                            } else {
                                Statics.field776 = var55;
                            }
                        }
                        continue;
                    }
                } else if (var466 >= 1000 && var466 < 1100 || var466 >= 2000 && var466 < 2100) {
                    int var56 = -1;
                    class174 var57;
                    if (var466 >= 2000) {
                        var466 -= 1000;
                        var5--;
                        var56 = field781[var5];
                        var57 = class174.method2807(var56);
                    } else {
                        var57 = var41 ? Statics.field2156 : Statics.field776;
                    }
                    if (var466 == 1000) {
                        var5 -= 4;
                        var57.field2754 = field781[var5];
                        var57.field2755 = field781[var5 + 1];
                        var57.field2750 = field781[var5 + 2];
                        var57.field2751 = field781[var5 + 3];
                        client.method29(var57);
                        client.method584(var57);
                        if (var56 != -1 && var57.field2821 == 0) {
                            client.method2309(Statics.field2736[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var466 == 1001) {
                        var5 -= 4;
                        var57.field2756 = field781[var5];
                        var57.field2757 = field781[var5 + 1];
                        var57.field2752 = field781[var5 + 2];
                        var57.field2753 = field781[var5 + 3];
                        client.method29(var57);
                        client.method584(var57);
                        if (var56 != -1 && var57.field2821 == 0) {
                            client.method2309(Statics.field2736[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var466 == 1003) {
                        var5--;
                        boolean var58 = field781[var5] == 1;
                        if (var57.field2760 != var58) {
                            var57.field2760 = var58;
                            client.method29(var57);
                        }
                        continue;
                    }
                    if (var466 == 1005) {
                        var5--;
                        var57.field2878 = field781[var5] == 1;
                        continue;
                    }
                    if (var466 == 1006) {
                        var5--;
                        var57.field2742 = field781[var5] == 1;
                        continue;
                    }
                } else if (!(var466 < 1100 || var466 >= 1200) || !(var466 < 2100 || var466 >= 2200)) {
                    int var59 = -1;
                    class174 var60;
                    if (var466 >= 2000) {
                        var466 -= 1000;
                        var5--;
                        var59 = field781[var5];
                        var60 = class174.method2807(var59);
                    } else {
                        var60 = var41 ? Statics.field2156 : Statics.field776;
                    }
                    if (var466 == 1100) {
                        var5 -= 2;
                        var60.field2766 = field781[var5];
                        if (var60.field2766 > var60.field2838 - var60.field2841) {
                            var60.field2766 = var60.field2838 - var60.field2841;
                        }
                        if (var60.field2766 < 0) {
                            var60.field2766 = 0;
                        }
                        var60.field2767 = field781[var5 + 1];
                        if (var60.field2767 > var60.field2785 - var60.field2747) {
                            var60.field2767 = var60.field2785 - var60.field2747;
                        }
                        if (var60.field2767 < 0) {
                            var60.field2767 = 0;
                        }
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1101) {
                        var5--;
                        var60.field2791 = field781[var5];
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1102) {
                        var5--;
                        var60.field2761 = field781[var5] == 1;
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1103) {
                        var5--;
                        var60.field2776 = field781[var5];
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1104) {
                        var5--;
                        var60.field2778 = field781[var5];
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1105) {
                        var5--;
                        var60.field2780 = field781[var5];
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1106) {
                        var5--;
                        var60.field2782 = field781[var5];
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1107) {
                        var5--;
                        var60.field2783 = field781[var5] == 1;
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1108) {
                        var60.field2788 = 1;
                        var5--;
                        var60.field2777 = field781[var5];
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1109) {
                        var5 -= 6;
                        var60.field2794 = field781[var5];
                        var60.field2802 = field781[var5 + 1];
                        var60.field2796 = field781[var5 + 2];
                        var60.field2833 = field781[var5 + 3];
                        var60.field2798 = field781[var5 + 4];
                        var60.field2744 = field781[var5 + 5];
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1110) {
                        var5--;
                        int var61 = field781[var5];
                        if (var60.field2849 != var61) {
                            var60.field2849 = var61;
                            var60.field2867 = 0;
                            var60.field2868 = 0;
                            client.method29(var60);
                        }
                        continue;
                    }
                    if (var466 == 1111) {
                        var5--;
                        var60.field2768 = field781[var5] == 1;
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1112) {
                        var6--;
                        String var62 = field782[var6];
                        if (!var62.equals(var60.field2876)) {
                            var60.field2876 = var62;
                            client.method29(var60);
                        }
                        continue;
                    }
                    if (var466 == 1113) {
                        var5--;
                        var60.field2804 = field781[var5];
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1114) {
                        var5 -= 3;
                        var60.field2808 = field781[var5];
                        var60.field2809 = field781[var5 + 1];
                        var60.field2807 = field781[var5 + 2];
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1115) {
                        var5--;
                        var60.field2758 = field781[var5] == 1;
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1116) {
                        var5--;
                        var60.field2784 = field781[var5];
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1117) {
                        var5--;
                        var60.field2834 = field781[var5];
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1118) {
                        var5--;
                        var60.field2746 = field781[var5] == 1;
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1119) {
                        var5--;
                        var60.field2787 = field781[var5] == 1;
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1120) {
                        var5 -= 2;
                        var60.field2838 = field781[var5];
                        var60.field2785 = field781[var5 + 1];
                        client.method29(var60);
                        if (var59 != -1 && var60.field2821 == 0) {
                            client.method2309(Statics.field2736[var59 >> 16], var60, false);
                        }
                        continue;
                    }
                    if (var466 == 1121) {
                        client.method235(var60.field2775, var60.field2799);
                        client.field438 = var60;
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1122) {
                        var5--;
                        var60.field2781 = field781[var5];
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1123) {
                        var5--;
                        var60.field2771 = field781[var5];
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1124) {
                        var5--;
                        var60.field2848 = field781[var5];
                        client.method29(var60);
                        continue;
                    }
                    if (var466 == 1125) {
                        var5--;
                        int var63 = field781[var5];
                        class83[] var64 = new class83[] { class83.field1421, class83.field1423, class83.field1415, class83.field1412, class83.field1411 };
                        class83 var65 = (class83) class110.method2153(var64, var63);
                        if (var65 != null) {
                            var60.field2789 = var65;
                            client.method29(var60);
                        }
                        continue;
                    }
                } else if (!(var466 < 1200 || var466 >= 1300) || !(var466 < 2200 || var466 >= 2300)) {
                    class174 var66;
                    if (var466 >= 2000) {
                        var466 -= 1000;
                        var5--;
                        var66 = class174.method2807(field781[var5]);
                    } else {
                        var66 = var41 ? Statics.field2156 : Statics.field776;
                    }
                    client.method29(var66);
                    if (var466 == 1200 || var466 == 1205 || var466 == 1212) {
                        var5 -= 2;
                        int var67 = field781[var5];
                        int var68 = field781[var5 + 1];
                        var66.field2774 = var67;
                        var66.field2739 = var68;
                        class52 var69 = class52.method1967(var67);
                        var66.field2796 = var69.field1102;
                        var66.field2833 = var69.field1085;
                        var66.field2798 = var69.field1104;
                        var66.field2794 = var69.field1105;
                        var66.field2802 = var69.field1097;
                        var66.field2744 = var69.field1101;
                        if (var466 == 1205) {
                            var66.field2803 = 0;
                        } else if (var466 == 1212 | var69.field1107 == 1) {
                            var66.field2803 = 1;
                        } else {
                            var66.field2803 = 2;
                        }
                        if (var66.field2800 > 0) {
                            var66.field2744 = var66.field2744 * 32 / var66.field2800;
                        } else if (var66.field2756 > 0) {
                            var66.field2744 = var66.field2744 * 32 / var66.field2756;
                        }
                        continue;
                    }
                    if (var466 == 1201) {
                        var66.field2788 = 2;
                        var5--;
                        var66.field2777 = field781[var5];
                        continue;
                    }
                    if (var466 == 1202) {
                        var66.field2788 = 3;
                        var66.field2777 = Statics.field1054.field37.method3232();
                        continue;
                    }
                } else if (var466 >= 1300 && var466 < 1400 || var466 >= 2300 && var466 < 2400) {
                    class174 var70;
                    if (var466 >= 2000) {
                        var466 -= 1000;
                        var5--;
                        var70 = class174.method2807(field781[var5]);
                    } else {
                        var70 = var41 ? Statics.field2156 : Statics.field776;
                    }
                    if (var466 == 1300) {
                        var5--;
                        int var71 = field781[var5] - 1;
                        if (var71 >= 0 && var71 <= 9) {
                            var6--;
                            var70.method3156(var71, field782[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var466 == 1301) {
                        var5 -= 2;
                        int var72 = field781[var5];
                        int var73 = field781[var5 + 1];
                        var70.field2820 = class174.method959(var72, var73);
                        continue;
                    }
                    if (var466 == 1302) {
                        var5--;
                        var70.field2823 = field781[var5] == 1;
                        continue;
                    }
                    if (var466 == 1303) {
                        var5--;
                        var70.field2858 = field781[var5];
                        continue;
                    }
                    if (var466 == 1304) {
                        var5--;
                        var70.field2822 = field781[var5];
                        continue;
                    }
                    if (var466 == 1305) {
                        var6--;
                        var70.field2818 = field782[var6];
                        continue;
                    }
                    if (var466 == 1306) {
                        var6--;
                        var70.field2824 = field782[var6];
                        continue;
                    }
                    if (var466 == 1307) {
                        var70.field2819 = null;
                        continue;
                    }
                } else {
                    if (var466 >= 1400 && var466 < 1500 || var466 >= 2400 && var466 < 2500) {
                        class174 var74;
                        if (var466 >= 2000) {
                            var466 -= 1000;
                            var5--;
                            var74 = class174.method2807(field781[var5]);
                        } else {
                            var74 = var41 ? Statics.field2156 : Statics.field776;
                        }
                        var6--;
                        String var75 = field782[var6];
                        int[] var76 = null;
                        if (var75.length() > 0 && var75.charAt(var75.length() - 1) == 'Y') {
                            var5--;
                            int var77 = field781[var5];
                            if (var77 > 0) {
                                var76 = new int[var77];
                                while (var77-- > 0) {
                                    var5--;
                                    var76[var77] = field781[var5];
                                }
                            }
                            var75 = var75.substring(0, var75.length() - 1);
                        }
                        Object[] var78 = new Object[var75.length() + 1];
                        for (int var79 = var78.length - 1; var79 >= 1; var79--) {
                            if (var75.charAt(var79 - 1) == 's') {
                                var6--;
                                var78[var79] = field782[var6];
                            } else {
                                var5--;
                                var78[var79] = Integer.valueOf(field781[var5]);
                            }
                        }
                        var5--;
                        int var80 = field781[var5];
                        if (var80 == -1) {
                            var78 = null;
                        } else {
                            var78[0] = Integer.valueOf(var80);
                        }
                        if (var466 == 1400) {
                            var74.field2827 = var78;
                        }
                        if (var466 == 1401) {
                            var74.field2830 = var78;
                        }
                        if (var466 == 1402) {
                            var74.field2829 = var78;
                        }
                        if (var466 == 1403) {
                            var74.field2843 = var78;
                        }
                        if (var466 == 1404) {
                            var74.field2852 = var78;
                        }
                        if (var466 == 1405) {
                            var74.field2805 = var78;
                        }
                        if (var466 == 1406) {
                            var74.field2837 = var78;
                        }
                        if (var466 == 1407) {
                            var74.field2801 = var78;
                            var74.field2839 = var76;
                        }
                        if (var466 == 1408) {
                            var74.field2844 = var78;
                        }
                        if (var466 == 1409) {
                            var74.field2845 = var78;
                        }
                        if (var466 == 1410) {
                            var74.field2835 = var78;
                        }
                        if (var466 == 1411) {
                            var74.field2828 = var78;
                        }
                        if (var466 == 1412) {
                            var74.field2795 = var78;
                        }
                        if (var466 == 1414) {
                            var74.field2770 = var78;
                            var74.field2879 = var76;
                        }
                        if (var466 == 1415) {
                            var74.field2842 = var78;
                            var74.field2765 = var76;
                        }
                        if (var466 == 1416) {
                            var74.field2866 = var78;
                        }
                        if (var466 == 1417) {
                            var74.field2846 = var78;
                        }
                        if (var466 == 1418) {
                            var74.field2745 = var78;
                        }
                        if (var466 == 1419) {
                            var74.field2786 = var78;
                        }
                        if (var466 == 1420) {
                            var74.field2856 = var78;
                        }
                        if (var466 == 1421) {
                            var74.field2836 = var78;
                        }
                        if (var466 == 1422) {
                            var74.field2851 = var78;
                        }
                        if (var466 == 1423) {
                            var74.field2825 = var78;
                        }
                        if (var466 == 1424) {
                            var74.field2853 = var78;
                        }
                        if (var466 == 1425) {
                            var74.field2855 = var78;
                        }
                        if (var466 == 1426) {
                            var74.field2831 = var78;
                        }
                        if (var466 == 1427) {
                            var74.field2859 = var78;
                        }
                        var74.field2810 = true;
                        continue;
                    }
                    if (var466 < 1600) {
                        class174 var81 = var41 ? Statics.field2156 : Statics.field776;
                        if (var466 == 1500) {
                            field781[var5++] = var81.field2797;
                            continue;
                        }
                        if (var466 == 1501) {
                            field781[var5++] = var81.field2759;
                            continue;
                        }
                        if (var466 == 1502) {
                            field781[var5++] = var81.field2841;
                            continue;
                        }
                        if (var466 == 1503) {
                            field781[var5++] = var81.field2747;
                            continue;
                        }
                        if (var466 == 1504) {
                            field781[var5++] = var81.field2760 ? 1 : 0;
                            continue;
                        }
                        if (var466 == 1505) {
                            field781[var5++] = var81.field2764;
                            continue;
                        }
                    } else if (var466 < 1700) {
                        class174 var82 = var41 ? Statics.field2156 : Statics.field776;
                        if (var466 == 1600) {
                            field781[var5++] = var82.field2766;
                            continue;
                        }
                        if (var466 == 1601) {
                            field781[var5++] = var82.field2767;
                            continue;
                        }
                        if (var466 == 1602) {
                            field782[var6++] = var82.field2876;
                            continue;
                        }
                        if (var466 == 1603) {
                            field781[var5++] = var82.field2838;
                            continue;
                        }
                        if (var466 == 1604) {
                            field781[var5++] = var82.field2785;
                            continue;
                        }
                        if (var466 == 1605) {
                            field781[var5++] = var82.field2744;
                            continue;
                        }
                        if (var466 == 1606) {
                            field781[var5++] = var82.field2796;
                            continue;
                        }
                        if (var466 == 1607) {
                            field781[var5++] = var82.field2798;
                            continue;
                        }
                        if (var466 == 1608) {
                            field781[var5++] = var82.field2833;
                            continue;
                        }
                        if (var466 == 1609) {
                            field781[var5++] = var82.field2776;
                            continue;
                        }
                        if (var466 == 1610) {
                            field781[var5++] = var82.field2848;
                            continue;
                        }
                        if (var466 == 1611) {
                            field781[var5++] = var82.field2791;
                            continue;
                        }
                        if (var466 == 1612) {
                            field781[var5++] = var82.field2771;
                            continue;
                        }
                        if (var466 == 1613) {
                            field781[var5++] = var82.field2789.method557();
                            continue;
                        }
                    } else if (var466 < 1800) {
                        class174 var83 = var41 ? Statics.field2156 : Statics.field776;
                        if (var466 == 1700) {
                            field781[var5++] = var83.field2774;
                            continue;
                        }
                        if (var466 == 1701) {
                            if (var83.field2774 == -1) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = var83.field2739;
                            }
                            continue;
                        }
                        if (var466 == 1702) {
                            field781[var5++] = var83.field2799;
                            continue;
                        }
                    } else if (var466 < 1900) {
                        class174 var84 = var41 ? Statics.field2156 : Statics.field776;
                        if (var466 == 1800) {
                            field781[var5++] = class179.method2933(client.method2898(var84));
                            continue;
                        }
                        if (var466 == 1801) {
                            var5--;
                            int var85 = field781[var5];
                            int var467 = var85 - 1;
                            if (var84.field2819 != null && var467 < var84.field2819.length && var84.field2819[var467] != null) {
                                field782[var6++] = var84.field2819[var467];
                                continue;
                            }
                            field782[var6++] = "";
                            continue;
                        }
                        if (var466 == 1802) {
                            if (var84.field2818 == null) {
                                field782[var6++] = "";
                            } else {
                                field782[var6++] = var84.field2818;
                            }
                            continue;
                        }
                    } else if (var466 >= 1900 && var466 < 2000 || var466 >= 2900 && var466 < 3000) {
                        class174 var86;
                        if (var466 >= 2000) {
                            var466 -= 1000;
                            var5--;
                            var86 = class174.method2807(field781[var5]);
                        } else {
                            var86 = var41 ? Statics.field2156 : Statics.field776;
                        }
                        if (var466 == 1927) {
                            if (field788 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var86.field2859 == null) {
                                return;
                            }
                            class1 var87 = new class1();
                            var87.field19 = var86;
                            var87.field17 = var86.field2859;
                            var87.field8 = field788 + 1;
                            client.field473.method3535(arg0);
                            continue;
                        }
                    } else if (var466 < 2600) {
                        var5--;
                        class174 var88 = class174.method2807(field781[var5]);
                        if (var466 == 2500) {
                            field781[var5++] = var88.field2797;
                            continue;
                        }
                        if (var466 == 2501) {
                            field781[var5++] = var88.field2759;
                            continue;
                        }
                        if (var466 == 2502) {
                            field781[var5++] = var88.field2841;
                            continue;
                        }
                        if (var466 == 2503) {
                            field781[var5++] = var88.field2747;
                            continue;
                        }
                        if (var466 == 2504) {
                            field781[var5++] = var88.field2760 ? 1 : 0;
                            continue;
                        }
                        if (var466 == 2505) {
                            field781[var5++] = var88.field2764;
                            continue;
                        }
                    } else if (var466 < 2700) {
                        var5--;
                        class174 var89 = class174.method2807(field781[var5]);
                        if (var466 == 2600) {
                            field781[var5++] = var89.field2766;
                            continue;
                        }
                        if (var466 == 2601) {
                            field781[var5++] = var89.field2767;
                            continue;
                        }
                        if (var466 == 2602) {
                            field782[var6++] = var89.field2876;
                            continue;
                        }
                        if (var466 == 2603) {
                            field781[var5++] = var89.field2838;
                            continue;
                        }
                        if (var466 == 2604) {
                            field781[var5++] = var89.field2785;
                            continue;
                        }
                        if (var466 == 2605) {
                            field781[var5++] = var89.field2744;
                            continue;
                        }
                        if (var466 == 2606) {
                            field781[var5++] = var89.field2796;
                            continue;
                        }
                        if (var466 == 2607) {
                            field781[var5++] = var89.field2798;
                            continue;
                        }
                        if (var466 == 2608) {
                            field781[var5++] = var89.field2833;
                            continue;
                        }
                        if (var466 == 2609) {
                            field781[var5++] = var89.field2776;
                            continue;
                        }
                        if (var466 == 2610) {
                            field781[var5++] = var89.field2848;
                            continue;
                        }
                        if (var466 == 2611) {
                            field781[var5++] = var89.field2791;
                            continue;
                        }
                        if (var466 == 2612) {
                            field781[var5++] = var89.field2771;
                            continue;
                        }
                        if (var466 == 2613) {
                            field781[var5++] = var89.field2789.method557();
                            continue;
                        }
                    } else if (var466 < 2800) {
                        if (var466 == 2700) {
                            var5--;
                            class174 var90 = class174.method2807(field781[var5]);
                            field781[var5++] = var90.field2774;
                            continue;
                        }
                        if (var466 == 2701) {
                            var5--;
                            class174 var91 = class174.method2807(field781[var5]);
                            if (var91.field2774 == -1) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = var91.field2739;
                            }
                            continue;
                        }
                        if (var466 == 2702) {
                            var5--;
                            int var92 = field781[var5];
                            class4 var93 = (class4) client.field435.method3498((long) var92);
                            if (var93 == null) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = 1;
                            }
                            continue;
                        }
                        if (var466 == 2706) {
                            field781[var5++] = client.field434;
                            continue;
                        }
                    } else if (var466 < 2900) {
                        var5--;
                        class174 var94 = class174.method2807(field781[var5]);
                        if (var466 == 2800) {
                            field781[var5++] = class179.method2933(client.method2898(var94));
                            continue;
                        }
                        if (var466 == 2801) {
                            var5--;
                            int var95 = field781[var5];
                            int var468 = var95 - 1;
                            if (var94.field2819 != null && var468 < var94.field2819.length && var94.field2819[var468] != null) {
                                field782[var6++] = var94.field2819[var468];
                                continue;
                            }
                            field782[var6++] = "";
                            continue;
                        }
                        if (var466 == 2802) {
                            if (var94.field2818 == null) {
                                field782[var6++] = "";
                            } else {
                                field782[var6++] = var94.field2818;
                            }
                            continue;
                        }
                    } else if (var466 < 3200) {
                        if (var466 == 3100) {
                            var6--;
                            String var96 = field782[var6];
                            class12.method108(0, "", var96);
                            continue;
                        }
                        if (var466 == 3101) {
                            var5 -= 2;
                            client.method31(Statics.field1054, field781[var5], field781[var5 + 1]);
                            continue;
                        }
                        if (var466 == 3103) {
                            client.method2728();
                            continue;
                        }
                        if (var466 == 3104) {
                            var6--;
                            String var97 = field782[var6];
                            int var98 = 0;
                            if (class164.method1769(var97)) {
                                var98 = class164.method2047(var97);
                            }
                            client.field319.method2596(35);
                            client.field319.method2349(var98);
                            continue;
                        }
                        if (var466 == 3105) {
                            var6--;
                            String var99 = field782[var6];
                            client.field319.method2596(128);
                            client.field319.method2364(var99.length() + 1);
                            client.field319.method2352(var99);
                            continue;
                        }
                        if (var466 == 3106) {
                            var6--;
                            String var100 = field782[var6];
                            client.field319.method2596(214);
                            client.field319.method2364(var100.length() + 1);
                            client.field319.method2352(var100);
                            continue;
                        }
                        if (var466 == 3107) {
                            var5--;
                            int var101 = field781[var5];
                            var6--;
                            String var102 = field782[var6];
                            int var103 = class33.field738;
                            int[] var104 = class33.field739;
                            boolean var105 = false;
                            for (int var106 = 0; var106 < var103; var106++) {
                                class3 var107 = client.field397[var104[var106]];
                                if (var107 != null && Statics.field1054 != var107 && var107.field59 != null && var107.field59.equalsIgnoreCase(var102)) {
                                    if (var101 == 1) {
                                        client.field319.method2596(202);
                                        client.field319.method2503(var104[var106]);
                                        client.field319.method2462(0);
                                    } else if (var101 == 4) {
                                        client.field319.method2596(80);
                                        client.field319.method2347(var104[var106]);
                                        client.field319.method2458(0);
                                    } else if (var101 == 6) {
                                        client.field319.method2596(19);
                                        client.field319.method2394(var104[var106]);
                                        client.field319.method2384(0);
                                    } else if (var101 == 7) {
                                        client.field319.method2596(3);
                                        client.field319.method2462(0);
                                        client.field319.method2347(var104[var106]);
                                    }
                                    var105 = true;
                                    break;
                                }
                            }
                            if (!var105) {
                                class12.method108(4, "", class158.field2446 + var102);
                            }
                            continue;
                        }
                        if (var466 == 3108) {
                            var5 -= 3;
                            int var108 = field781[var5];
                            int var109 = field781[var5 + 1];
                            int var110 = field781[var5 + 2];
                            class174 var111 = class174.method2807(var110);
                            client.method2562(var111, var108, var109);
                            continue;
                        }
                        if (var466 == 3109) {
                            var5 -= 2;
                            int var112 = field781[var5];
                            int var113 = field781[var5 + 1];
                            class174 var114 = var41 ? Statics.field2156 : Statics.field776;
                            client.method2562(var114, var112, var113);
                            continue;
                        }
                        if (var466 == 3110) {
                            var5--;
                            Statics.field2117 = field781[var5] == 1;
                            continue;
                        }
                        if (var466 == 3111) {
                            field781[var5++] = Statics.field76.field146 ? 1 : 0;
                            continue;
                        }
                        if (var466 == 3112) {
                            var5--;
                            Statics.field76.field146 = field781[var5] == 1;
                            class9.method933();
                            continue;
                        }
                        if (var466 == 3113) {
                            var6--;
                            String var115 = field782[var6];
                            var5--;
                            boolean var116 = field781[var5] == 1;
                            class139.method957(var115, var116, false);
                            continue;
                        }
                        if (var466 == 3115) {
                            var5--;
                            int var117 = field781[var5];
                            client.field319.method2596(228);
                            client.field319.method2347(var117);
                            continue;
                        }
                        if (var466 == 3116) {
                            var5--;
                            int var118 = field781[var5];
                            var6 -= 2;
                            String var119 = field782[var6];
                            String var120 = field782[var6 + 1];
                            if (var119.length() <= 500 && var120.length() <= 500) {
                                client.field319.method2596(231);
                                client.field319.method2347(1 + class120.method2308(var119) + class120.method2308(var120));
                                client.field319.method2352(var120);
                                client.field319.method2458(var118);
                                client.field319.method2352(var119);
                            }
                            continue;
                        }
                    } else if (var466 < 3300) {
                        if (var466 == 3200) {
                            var5 -= 3;
                            int var121 = field781[var5];
                            int var122 = field781[var5 + 1];
                            int var123 = field781[var5 + 2];
                            if (client.field514 != 0 && var122 != 0 && client.field516 < 50) {
                                client.field440[client.field516] = var121;
                                client.field461[client.field516] = var122;
                                client.field519[client.field516] = var123;
                                client.field544[client.field516] = null;
                                client.field520[client.field516] = 0;
                                client.field516++;
                            }
                            continue;
                        }
                        if (var466 == 3201) {
                            var5--;
                            int var124 = field781[var5];
                            if (var124 == -1 && !client.field513) {
                                class184.method3118();
                            } else if (var124 != -1 && client.field533 != var124 && client.field410 != 0 && !client.field513) {
                                class169 var125 = Statics.field2070;
                                int var126 = client.field410;
                                class184.field2960 = 1;
                                Statics.field1371 = var125;
                                Statics.field2961 = var124;
                                Statics.field2962 = 0;
                                Statics.field2958 = var126;
                                Statics.field2965 = false;
                                Statics.field2964 = 2;
                            }
                            client.field533 = var124;
                            continue;
                        }
                        if (var466 == 3202) {
                            var5 -= 2;
                            int var127 = field781[var5];
                            int var10000 = field781[var5 + 1];
                            if (client.field410 != 0 && var127 != -1) {
                                class184.method2638(Statics.field2081, var127, 0, client.field410, false);
                                client.field513 = true;
                            }
                            continue;
                        }
                    } else if (var466 < 3400) {
                        if (var466 == 3300) {
                            field781[var5++] = client.field286;
                            continue;
                        }
                        if (var466 == 3301) {
                            var5 -= 2;
                            int var129 = field781[var5];
                            int var130 = field781[var5 + 1];
                            field781[var5++] = Statics.method682(var129, var130);
                            continue;
                        }
                        if (var466 == 3302) {
                            var5 -= 2;
                            int var131 = field781[var5];
                            int var132 = field781[var5 + 1];
                            field781[var5++] = class16.method2154(var131, var132);
                            continue;
                        }
                        if (var466 == 3303) {
                            var5 -= 2;
                            int var133 = field781[var5];
                            int var134 = field781[var5 + 1];
                            field781[var5++] = class16.method187(var133, var134);
                            continue;
                        }
                        if (var466 == 3304) {
                            var5--;
                            int var135 = field781[var5];
                            int[] var136 = field781;
                            int var137 = var5++;
                            class51 var138 = (class51) class51.field1078.method3460((long) var135);
                            class51 var139;
                            if (var138 == null) {
                                byte[] var140 = Statics.field1083.method3011(5, var135);
                                class51 var141 = new class51();
                                if (var140 != null) {
                                    var141.method1003(new class120(var140));
                                }
                                class51.field1078.method3462(var141, (long) var135);
                                var139 = var141;
                            } else {
                                var139 = var138;
                            }
                            var136[var137] = var139.field1080;
                            continue;
                        }
                        if (var466 == 3305) {
                            var5--;
                            int var142 = field781[var5];
                            field781[var5++] = client.field420[var142];
                            continue;
                        }
                        if (var466 == 3306) {
                            var5--;
                            int var143 = field781[var5];
                            field781[var5++] = client.field412[var143];
                            continue;
                        }
                        if (var466 == 3307) {
                            var5--;
                            int var144 = field781[var5];
                            field781[var5++] = client.field413[var144];
                            continue;
                        }
                        if (var466 == 3308) {
                            int var145 = Statics.field656;
                            int var146 = (Statics.field1054.field817 >> 7) + Statics.field3015;
                            int var147 = (Statics.field1054.field841 >> 7) + Statics.field13;
                            field781[var5++] = (var145 << 28) + (var146 << 14) + var147;
                            continue;
                        }
                        if (var466 == 3309) {
                            var5--;
                            int var148 = field781[var5];
                            field781[var5++] = var148 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var466 == 3310) {
                            var5--;
                            int var149 = field781[var5];
                            field781[var5++] = var149 >> 28;
                            continue;
                        }
                        if (var466 == 3311) {
                            var5--;
                            int var150 = field781[var5];
                            field781[var5++] = var150 & 0x3FFF;
                            continue;
                        }
                        if (var466 == 3312) {
                            field781[var5++] = client.field280 ? 1 : 0;
                            continue;
                        }
                        if (var466 == 3313) {
                            var5 -= 2;
                            int var151 = field781[var5] + 32768;
                            int var152 = field781[var5 + 1];
                            field781[var5++] = Statics.method682(var151, var152);
                            continue;
                        }
                        if (var466 == 3314) {
                            var5 -= 2;
                            int var153 = field781[var5] + 32768;
                            int var154 = field781[var5 + 1];
                            field781[var5++] = class16.method2154(var153, var154);
                            continue;
                        }
                        if (var466 == 3315) {
                            var5 -= 2;
                            int var155 = field781[var5] + 32768;
                            int var156 = field781[var5 + 1];
                            field781[var5++] = class16.method187(var155, var156);
                            continue;
                        }
                        if (var466 == 3316) {
                            if (client.field441 >= 2) {
                                field781[var5++] = client.field441;
                            } else {
                                field781[var5++] = 0;
                            }
                            continue;
                        }
                        if (var466 == 3317) {
                            field781[var5++] = client.field405;
                            continue;
                        }
                        if (var466 == 3318) {
                            field781[var5++] = client.field275;
                            continue;
                        }
                        if (var466 == 3321) {
                            field781[var5++] = client.field439;
                            continue;
                        }
                        if (var466 == 3322) {
                            field781[var5++] = client.field414;
                            continue;
                        }
                        if (var466 == 3323) {
                            if (client.field377) {
                                field781[var5++] = 1;
                            } else {
                                field781[var5++] = 0;
                            }
                            continue;
                        }
                        if (var466 == 3324) {
                            field781[var5++] = client.field493;
                            continue;
                        }
                    } else if (var466 < 3500) {
                        if (var466 == 3400) {
                            var5 -= 2;
                            int var157 = field781[var5];
                            int var158 = field781[var5 + 1];
                            class49 var159 = (class49) class49.field1063.method3460((long) var157);
                            class49 var160;
                            if (var159 == null) {
                                byte[] var161 = Statics.field1068.method3011(8, var157);
                                class49 var162 = new class49();
                                if (var161 != null) {
                                    var162.method971(new class120(var161));
                                }
                                class49.field1063.method3462(var162, (long) var157);
                                var160 = var162;
                            } else {
                                var160 = var159;
                            }
                            class49 var163 = var160;
                            if (var160.field1061 != 's') {
                            }
                            for (int var164 = 0; var164 < var163.field1064; var164++) {
                                if (var163.field1059[var164] == var158) {
                                    field782[var6++] = var163.field1067[var164];
                                    var163 = null;
                                    break;
                                }
                            }
                            if (var163 != null) {
                                field782[var6++] = var163.field1065;
                            }
                            continue;
                        }
                        if (var466 == 3408) {
                            var5 -= 4;
                            int var165 = field781[var5];
                            int var166 = field781[var5 + 1];
                            int var167 = field781[var5 + 2];
                            int var168 = field781[var5 + 3];
                            class49 var169 = (class49) class49.field1063.method3460((long) var167);
                            class49 var170;
                            if (var169 == null) {
                                byte[] var171 = Statics.field1068.method3011(8, var167);
                                class49 var172 = new class49();
                                if (var171 != null) {
                                    var172.method971(new class120(var171));
                                }
                                class49.field1063.method3462(var172, (long) var167);
                                var170 = var172;
                            } else {
                                var170 = var169;
                            }
                            class49 var173 = var170;
                            if (var170.field1060 == var165 && var170.field1061 == var166) {
                                for (int var174 = 0; var174 < var173.field1064; var174++) {
                                    if (var173.field1059[var174] == var168) {
                                        if (var166 == 115) {
                                            field782[var6++] = var173.field1067[var174];
                                        } else {
                                            field781[var5++] = var173.field1066[var174];
                                        }
                                        var173 = null;
                                        break;
                                    }
                                }
                                if (var173 != null) {
                                    if (var166 == 115) {
                                        field782[var6++] = var173.field1065;
                                    } else {
                                        field781[var5++] = var173.field1058;
                                    }
                                }
                                continue;
                            }
                            if (var166 == 115) {
                                field782[var6++] = "null";
                            } else {
                                field781[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var466 < 3700) {
                        if (var466 == 3600) {
                            if (client.field272 == 0) {
                                field781[var5++] = -2;
                            } else if (client.field272 == 1) {
                                field781[var5++] = -1;
                            } else {
                                field781[var5++] = client.field349;
                            }
                            continue;
                        }
                        if (var466 == 3601) {
                            var5--;
                            int var175 = field781[var5];
                            if (client.field272 == 2 && var175 < client.field349) {
                                field782[var6++] = client.field429[var175].field240;
                                field782[var6++] = client.field429[var175].field239;
                                continue;
                            }
                            field782[var6++] = "";
                            field782[var6++] = "";
                            continue;
                        }
                        if (var466 == 3602) {
                            var5--;
                            int var176 = field781[var5];
                            if (client.field272 == 2 && var176 < client.field349) {
                                field781[var5++] = client.field429[var176].field238;
                                continue;
                            }
                            field781[var5++] = 0;
                            continue;
                        }
                        if (var466 == 3603) {
                            var5--;
                            int var177 = field781[var5];
                            if (client.field272 == 2 && var177 < client.field349) {
                                field781[var5++] = client.field429[var177].field241;
                                continue;
                            }
                            field781[var5++] = 0;
                            continue;
                        }
                        if (var466 == 3604) {
                            var6--;
                            String var178 = field782[var6];
                            var5--;
                            int var179 = field781[var5];
                            client.method2147(var178, var179);
                            continue;
                        }
                        if (var466 == 3605) {
                            var6--;
                            String var180 = field782[var6];
                            if (var180 == null) {
                                continue;
                            }
                            if ((client.field349 < 200 || client.field399 == 1) && client.field349 < 400) {
                                String var181 = Statics.method1536(var180, Statics.field279);
                                if (var181 == null) {
                                    continue;
                                }
                                for (int var182 = 0; var182 < client.field349; var182++) {
                                    class18 var183 = client.field429[var182];
                                    String var184 = Statics.method1536(var183.field240, Statics.field279);
                                    if (var184 != null && var184.equals(var181)) {
                                        class12.method108(30, "", var180 + class158.field2475);
                                        continue label3084;
                                    }
                                    if (var183.field239 != null) {
                                        String var185 = Statics.method1536(var183.field239, Statics.field279);
                                        if (var185 != null && var185.equals(var181)) {
                                            class12.method108(30, "", var180 + class158.field2475);
                                            continue label3084;
                                        }
                                    }
                                }
                                for (int var186 = 0; var186 < client.field545; var186++) {
                                    class8 var187 = client.field546[var186];
                                    String var188 = Statics.method1536(var187.field132, Statics.field279);
                                    if (var188 != null && var188.equals(var181)) {
                                        class12.method108(30, "", class158.field2469 + var180 + class158.field2470);
                                        continue label3084;
                                    }
                                    if (var187.field134 != null) {
                                        String var189 = Statics.method1536(var187.field134, Statics.field279);
                                        if (var189 != null && var189.equals(var181)) {
                                            class12.method108(30, "", class158.field2469 + var180 + class158.field2470);
                                            continue label3084;
                                        }
                                    }
                                }
                                if (Statics.method1536(Statics.field1054.field59, Statics.field279).equals(var181)) {
                                    class12.method108(30, "", class158.field2467);
                                } else {
                                    client.field319.method2596(32);
                                    client.field319.method2364(class120.method2308(var180));
                                    client.field319.method2352(var180);
                                }
                                continue;
                            }
                            class12.method108(30, "", class158.field2463);
                            continue;
                        }
                        if (var466 == 3606) {
                            var6--;
                            String var190 = field782[var6];
                            if (var190 == null) {
                                continue;
                            }
                            String var191 = Statics.method1536(var190, Statics.field279);
                            if (var191 == null) {
                                continue;
                            }
                            int var192 = 0;
                            while (true) {
                                if (var192 >= client.field349) {
                                    continue label3084;
                                }
                                class18 var193 = client.field429[var192];
                                String var194 = var193.field240;
                                String var195 = Statics.method1536(var194, Statics.field279);
                                if (class130.method2145(var190, var191, var194, var195)) {
                                    client.field349--;
                                    for (int var196 = var192; var196 < client.field349; var196++) {
                                        client.field429[var196] = client.field429[var196 + 1];
                                    }
                                    client.field467 = client.field459;
                                    client.field319.method2596(71);
                                    client.field319.method2364(class120.method2308(var190));
                                    client.field319.method2352(var190);
                                    continue label3084;
                                }
                                var192++;
                            }
                        }
                        if (var466 == 3607) {
                            var6--;
                            String var197 = field782[var6];
                            if (var197 == null) {
                                continue;
                            }
                            if ((client.field545 < 100 || client.field399 == 1) && client.field545 < 400) {
                                String var198 = Statics.method1536(var197, Statics.field279);
                                if (var198 == null) {
                                    continue;
                                }
                                for (int var199 = 0; var199 < client.field545; var199++) {
                                    class8 var200 = client.field546[var199];
                                    String var201 = Statics.method1536(var200.field132, Statics.field279);
                                    if (var201 != null && var201.equals(var198)) {
                                        class12.method108(31, "", var197 + class158.field2496);
                                        continue label3084;
                                    }
                                    if (var200.field134 != null) {
                                        String var202 = Statics.method1536(var200.field134, Statics.field279);
                                        if (var202 != null && var202.equals(var198)) {
                                            class12.method108(31, "", var197 + class158.field2496);
                                            continue label3084;
                                        }
                                    }
                                }
                                for (int var203 = 0; var203 < client.field349; var203++) {
                                    class18 var204 = client.field429[var203];
                                    String var205 = Statics.method1536(var204.field240, Statics.field279);
                                    if (var205 != null && var205.equals(var198)) {
                                        class12.method108(31, "", class158.field2316 + var197 + class158.field2501);
                                        continue label3084;
                                    }
                                    if (var204.field239 != null) {
                                        String var206 = Statics.method1536(var204.field239, Statics.field279);
                                        if (var206 != null && var206.equals(var198)) {
                                            class12.method108(31, "", class158.field2316 + var197 + class158.field2501);
                                            continue label3084;
                                        }
                                    }
                                }
                                if (Statics.method1536(Statics.field1054.field59, Statics.field279).equals(var198)) {
                                    class12.method108(31, "", class158.field2555);
                                } else {
                                    client.field319.method2596(150);
                                    client.field319.method2364(class120.method2308(var197));
                                    client.field319.method2352(var197);
                                }
                                continue;
                            }
                            class12.method108(31, "", class158.field2465);
                            continue;
                        }
                        if (var466 == 3608) {
                            var6--;
                            String var207 = field782[var6];
                            if (var207 == null) {
                                continue;
                            }
                            String var208 = Statics.method1536(var207, Statics.field279);
                            if (var208 == null) {
                                continue;
                            }
                            int var209 = 0;
                            while (true) {
                                if (var209 >= client.field545) {
                                    continue label3084;
                                }
                                class8 var210 = client.field546[var209];
                                String var211 = var210.field132;
                                String var212 = Statics.method1536(var211, Statics.field279);
                                if (class130.method2145(var207, var208, var211, var212)) {
                                    client.field545--;
                                    for (int var213 = var209; var213 < client.field545; var213++) {
                                        client.field546[var213] = client.field546[var213 + 1];
                                    }
                                    client.field467 = client.field459;
                                    client.field319.method2596(46);
                                    client.field319.method2364(class120.method2308(var207));
                                    client.field319.method2352(var207);
                                    continue label3084;
                                }
                                var209++;
                            }
                        }
                        if (var466 == 3609) {
                            var6--;
                            String var214 = field782[var6];
                            class153[] var215 = class153.method3117();
                            for (int var216 = 0; var216 < var215.length; var216++) {
                                class153 var217 = var215[var216];
                                if (var217.field2252 != -1 && var214.startsWith(class2.method105(var217.field2252))) {
                                    var214 = var214.substring(6 + Integer.toString(var217.field2252).length());
                                    break;
                                }
                            }
                            field781[var5++] = client.method2282(var214, false) ? 1 : 0;
                            continue;
                        }
                        if (var466 == 3611) {
                            if (client.field417 == null) {
                                field782[var6++] = "";
                            } else {
                                String[] var218 = field782;
                                int var219 = var6++;
                                String var220 = client.field417;
                                String var221 = class163.method2152(class163.method594(var220));
                                if (var221 == null) {
                                    var221 = "";
                                }
                                var218[var219] = var221;
                            }
                            continue;
                        }
                        if (var466 == 3612) {
                            if (client.field417 == null) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = Statics.field854;
                            }
                            continue;
                        }
                        if (var466 == 3613) {
                            var5--;
                            int var223 = field781[var5];
                            if (client.field417 != null && var223 < Statics.field854) {
                                field782[var6++] = Statics.field2006[var223].field608;
                                continue;
                            }
                            field782[var6++] = "";
                            continue;
                        }
                        if (var466 == 3614) {
                            var5--;
                            int var224 = field781[var5];
                            if (client.field417 != null && var224 < Statics.field854) {
                                field781[var5++] = Statics.field2006[var224].field606;
                                continue;
                            }
                            field781[var5++] = 0;
                            continue;
                        }
                        if (var466 == 3615) {
                            var5--;
                            int var225 = field781[var5];
                            if (client.field417 != null && var225 < Statics.field854) {
                                field781[var5++] = Statics.field2006[var225].field607;
                                continue;
                            }
                            field781[var5++] = 0;
                            continue;
                        }
                        if (var466 == 3616) {
                            field781[var5++] = Statics.field1891;
                            continue;
                        }
                        if (var466 == 3617) {
                            var6--;
                            String var226 = field782[var6];
                            Statics.method2762(var226);
                            continue;
                        }
                        if (var466 == 3618) {
                            field781[var5++] = Statics.field1205;
                            continue;
                        }
                        if (var466 == 3619) {
                            var6--;
                            String var227 = field782[var6];
                            if (!var227.equals("")) {
                                client.field319.method2596(133);
                                client.field319.method2364(class120.method2308(var227));
                                client.field319.method2352(var227);
                            }
                            continue;
                        }
                        if (var466 == 3620) {
                            client.field319.method2596(133);
                            client.field319.method2364(0);
                            continue;
                        }
                        if (var466 == 3621) {
                            if (client.field272 == 0) {
                                field781[var5++] = -1;
                            } else {
                                field781[var5++] = client.field545;
                            }
                            continue;
                        }
                        if (var466 == 3622) {
                            var5--;
                            int var228 = field781[var5];
                            if (client.field272 != 0 && var228 < client.field545) {
                                field782[var6++] = client.field546[var228].field132;
                                field782[var6++] = client.field546[var228].field134;
                                continue;
                            }
                            field782[var6++] = "";
                            field782[var6++] = "";
                            continue;
                        }
                        if (var466 == 3623) {
                            var6--;
                            String var229 = field782[var6];
                            if (var229.startsWith(class2.method105(0)) || var229.startsWith(class2.method105(1))) {
                                var229 = var229.substring(7);
                            }
                            field781[var5++] = client.method197(var229) ? 1 : 0;
                            continue;
                        }
                        if (var466 == 3624) {
                            var5--;
                            int var230 = field781[var5];
                            if (Statics.field2006 != null && var230 < Statics.field854 && Statics.field2006[var230].field608.equalsIgnoreCase(Statics.field1054.field59)) {
                                field781[var5++] = 1;
                                continue;
                            }
                            field781[var5++] = 0;
                            continue;
                        }
                        if (var466 == 3625) {
                            if (client.field502 == null) {
                                field782[var6++] = "";
                            } else {
                                String[] var231 = field782;
                                int var232 = var6++;
                                String var233 = client.field502;
                                String var234 = class163.method2152(class163.method594(var233));
                                if (var234 == null) {
                                    var234 = "";
                                }
                                var231[var232] = var234;
                            }
                            continue;
                        }
                    } else if (var466 < 4000) {
                        if (var466 == 3903) {
                            var5--;
                            int var236 = field781[var5];
                            field781[var5++] = client.field550[var236].method3728();
                            continue;
                        }
                        if (var466 == 3904) {
                            var5--;
                            int var237 = field781[var5];
                            field781[var5++] = client.field550[var237].field3178;
                            continue;
                        }
                        if (var466 == 3905) {
                            var5--;
                            int var238 = field781[var5];
                            field781[var5++] = client.field550[var238].field3176;
                            continue;
                        }
                        if (var466 == 3906) {
                            var5--;
                            int var239 = field781[var5];
                            field781[var5++] = client.field550[var239].field3177;
                            continue;
                        }
                        if (var466 == 3907) {
                            var5--;
                            int var240 = field781[var5];
                            field781[var5++] = client.field550[var240].field3174;
                            continue;
                        }
                        if (var466 == 3908) {
                            var5--;
                            int var241 = field781[var5];
                            field781[var5++] = client.field550[var241].field3179;
                            continue;
                        }
                        if (var466 == 3910) {
                            var5--;
                            int var242 = field781[var5];
                            int var243 = client.field550[var242].method3747();
                            field781[var5++] = var243 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var466 == 3911) {
                            var5--;
                            int var244 = field781[var5];
                            int var245 = client.field550[var244].method3747();
                            field781[var5++] = var245 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var466 == 3912) {
                            var5--;
                            int var246 = field781[var5];
                            int var247 = client.field550[var246].method3747();
                            field781[var5++] = var247 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var466 == 3913) {
                            var5--;
                            int var248 = field781[var5];
                            int var249 = client.field550[var248].method3747();
                            field781[var5++] = var249 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var466 == 3914) {
                            var5--;
                            boolean var250 = field781[var5] == 1;
                            if (Statics.field557 != null) {
                                Statics.field557.method3748(class222.field3183, var250);
                            }
                            continue;
                        }
                        if (var466 == 3915) {
                            var5--;
                            boolean var251 = field781[var5] == 1;
                            if (Statics.field557 != null) {
                                Statics.field557.method3748(class222.field3181, var251);
                            }
                            continue;
                        }
                        if (var466 == 3916) {
                            var5 -= 2;
                            boolean var252 = field781[var5] == 1;
                            boolean var253 = field781[var5 + 1] == 1;
                            if (Statics.field557 != null) {
                                Statics.field557.method3748(new class22(var253), var252);
                            }
                            continue;
                        }
                        if (var466 == 3917) {
                            var5--;
                            boolean var254 = field781[var5] == 1;
                            if (Statics.field557 != null) {
                                Statics.field557.method3748(class222.field3182, var254);
                            }
                            continue;
                        }
                        if (var466 == 3918) {
                            var5--;
                            boolean var255 = field781[var5] == 1;
                            if (Statics.field557 != null) {
                                Statics.field557.method3748(class222.field3184, var255);
                            }
                            continue;
                        }
                        if (var466 == 3919) {
                            field781[var5++] = Statics.field557 == null ? 0 : Statics.field557.field3180.size();
                            continue;
                        }
                        if (var466 == 3920) {
                            var5--;
                            int var256 = field781[var5];
                            class215 var257 = (class215) Statics.field557.field3180.get(var256);
                            field781[var5++] = var257.field3163;
                            continue;
                        }
                        if (var466 == 3921) {
                            var5--;
                            int var258 = field781[var5];
                            class215 var259 = (class215) Statics.field557.field3180.get(var258);
                            field782[var6++] = var259.method3676();
                            continue;
                        }
                        if (var466 == 3922) {
                            var5--;
                            int var260 = field781[var5];
                            class215 var261 = (class215) Statics.field557.field3180.get(var260);
                            field782[var6++] = var261.method3674();
                            continue;
                        }
                        if (var466 == 3923) {
                            var5--;
                            int var262 = field781[var5];
                            class215 var263 = (class215) Statics.field557.field3180.get(var262);
                            long var264 = class116.method1579() - Statics.field2224 - var263.field3157;
                            int var266 = (int) (var264 / 3600000L);
                            int var267 = (int) ((var264 - (long) (var266 * 3600000)) / 60000L);
                            int var268 = (int) ((var264 - (long) (var266 * 3600000) - (long) (var267 * 60000)) / 1000L);
                            String var269 = var266 + ":" + var267 / 10 + var267 % 10 + ":" + var268 / 10 + var268 % 10;
                            field782[var6++] = var269;
                            continue;
                        }
                        if (var466 == 3924) {
                            var5--;
                            int var270 = field781[var5];
                            class215 var271 = (class215) Statics.field557.field3180.get(var270);
                            field781[var5++] = var271.field3159.field3177;
                            continue;
                        }
                        if (var466 == 3925) {
                            var5--;
                            int var272 = field781[var5];
                            class215 var273 = (class215) Statics.field557.field3180.get(var272);
                            field781[var5++] = var273.field3159.field3176;
                            continue;
                        }
                        if (var466 == 3926) {
                            var5--;
                            int var274 = field781[var5];
                            class215 var275 = (class215) Statics.field557.field3180.get(var274);
                            field781[var5++] = var275.field3159.field3178;
                            continue;
                        }
                    } else if (var466 < 4100) {
                        if (var466 == 4000) {
                            var5 -= 2;
                            int var276 = field781[var5];
                            int var277 = field781[var5 + 1];
                            field781[var5++] = var276 + var277;
                            continue;
                        }
                        if (var466 == 4001) {
                            var5 -= 2;
                            int var278 = field781[var5];
                            int var279 = field781[var5 + 1];
                            field781[var5++] = var278 - var279;
                            continue;
                        }
                        if (var466 == 4002) {
                            var5 -= 2;
                            int var280 = field781[var5];
                            int var281 = field781[var5 + 1];
                            field781[var5++] = var280 * var281;
                            continue;
                        }
                        if (var466 == 4003) {
                            var5 -= 2;
                            int var282 = field781[var5];
                            int var283 = field781[var5 + 1];
                            field781[var5++] = var282 / var283;
                            continue;
                        }
                        if (var466 == 4004) {
                            var5--;
                            int var284 = field781[var5];
                            field781[var5++] = (int) (Math.random() * (double) var284);
                            continue;
                        }
                        if (var466 == 4005) {
                            var5--;
                            int var285 = field781[var5];
                            field781[var5++] = (int) (Math.random() * (double) (var285 + 1));
                            continue;
                        }
                        if (var466 == 4006) {
                            var5 -= 5;
                            int var286 = field781[var5];
                            int var287 = field781[var5 + 1];
                            int var288 = field781[var5 + 2];
                            int var289 = field781[var5 + 3];
                            int var290 = field781[var5 + 4];
                            field781[var5++] = (var287 - var286) * (var290 - var288) / (var289 - var288) + var286;
                            continue;
                        }
                        if (var466 == 4007) {
                            var5 -= 2;
                            int var291 = field781[var5];
                            int var292 = field781[var5 + 1];
                            field781[var5++] = var291 * var292 / 100 + var291;
                            continue;
                        }
                        if (var466 == 4008) {
                            var5 -= 2;
                            int var293 = field781[var5];
                            int var294 = field781[var5 + 1];
                            field781[var5++] = var293 | 0x1 << var294;
                            continue;
                        }
                        if (var466 == 4009) {
                            var5 -= 2;
                            int var295 = field781[var5];
                            int var296 = field781[var5 + 1];
                            field781[var5++] = var295 & -1 - (0x1 << var296);
                            continue;
                        }
                        if (var466 == 4010) {
                            var5 -= 2;
                            int var297 = field781[var5];
                            int var298 = field781[var5 + 1];
                            field781[var5++] = (var297 & 0x1 << var298) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var466 == 4011) {
                            var5 -= 2;
                            int var299 = field781[var5];
                            int var300 = field781[var5 + 1];
                            field781[var5++] = var299 % var300;
                            continue;
                        }
                        if (var466 == 4012) {
                            var5 -= 2;
                            int var301 = field781[var5];
                            int var302 = field781[var5 + 1];
                            if (var301 == 0) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = (int) Math.pow((double) var301, (double) var302);
                            }
                            continue;
                        }
                        if (var466 == 4013) {
                            var5 -= 2;
                            int var303 = field781[var5];
                            int var304 = field781[var5 + 1];
                            if (var303 == 0) {
                                field781[var5++] = 0;
                            } else if (var304 == 0) {
                                field781[var5++] = Integer.MAX_VALUE;
                            } else {
                                field781[var5++] = (int) Math.pow((double) var303, 1.0D / (double) var304);
                            }
                            continue;
                        }
                        if (var466 == 4014) {
                            var5 -= 2;
                            int var305 = field781[var5];
                            int var306 = field781[var5 + 1];
                            field781[var5++] = var305 & var306;
                            continue;
                        }
                        if (var466 == 4015) {
                            var5 -= 2;
                            int var307 = field781[var5];
                            int var308 = field781[var5 + 1];
                            field781[var5++] = var307 | var308;
                            continue;
                        }
                        if (var466 == 4018) {
                            var5 -= 3;
                            long var309 = (long) field781[var5];
                            long var311 = (long) field781[var5 + 1];
                            long var313 = (long) field781[var5 + 2];
                            field781[var5++] = (int) (var309 * var313 / var311);
                            continue;
                        }
                    } else if (var466 < 4200) {
                        if (var466 == 4100) {
                            var6--;
                            String var315 = field782[var6];
                            var5--;
                            int var316 = field781[var5];
                            field782[var6++] = var315 + var316;
                            continue;
                        }
                        if (var466 == 4101) {
                            var6 -= 2;
                            String var317 = field782[var6];
                            String var318 = field782[var6 + 1];
                            field782[var6++] = var317 + var318;
                            continue;
                        }
                        if (var466 == 4102) {
                            var6--;
                            String var319 = field782[var6];
                            var5--;
                            int var320 = field781[var5];
                            String[] var321 = field782;
                            int var322 = var6++;
                            String var324;
                            if (var320 < 0) {
                                var324 = Integer.toString(var320);
                            } else {
                                var324 = class164.method719(var320, 10, true);
                            }
                            var321[var322] = var319 + var324;
                            continue;
                        }
                        if (var466 == 4103) {
                            var6--;
                            String var325 = field782[var6];
                            field782[var6++] = var325.toLowerCase();
                            continue;
                        }
                        if (var466 == 4104) {
                            var5--;
                            int var326 = field781[var5];
                            long var327 = ((long) var326 + 11745L) * 86400000L;
                            field786.setTime(new Date(var327));
                            int var329 = field786.get(5);
                            int var330 = field786.get(2);
                            int var331 = field786.get(1);
                            field782[var6++] = var329 + "-" + field783[var330] + "-" + var331;
                            continue;
                        }
                        if (var466 == 4105) {
                            var6 -= 2;
                            String var332 = field782[var6];
                            String var333 = field782[var6 + 1];
                            if (Statics.field1054.field37 != null && Statics.field1054.field37.field2921) {
                                field782[var6++] = var333;
                                continue;
                            }
                            field782[var6++] = var332;
                            continue;
                        }
                        if (var466 == 4106) {
                            var5--;
                            int var334 = field781[var5];
                            field782[var6++] = Integer.toString(var334);
                            continue;
                        }
                        if (var466 == 4107) {
                            var6 -= 2;
                            int[] var335 = field781;
                            int var336 = var5++;
                            int var337 = class167.method131(field782[var6], field782[var6 + 1], client.field293);
                            byte var338;
                            if (var337 > 0) {
                                var338 = 1;
                            } else if (var337 < 0) {
                                var338 = -1;
                            } else {
                                var338 = 0;
                            }
                            var335[var336] = var338;
                            continue;
                        }
                        if (var466 == 4108) {
                            var6--;
                            String var339 = field782[var6];
                            var5 -= 2;
                            int var340 = field781[var5];
                            int var341 = field781[var5 + 1];
                            byte[] var342 = Statics.field1998.method3011(var341, 0);
                            class225 var343 = new class225(var342);
                            field781[var5++] = var343.method3796(var339, var340);
                            continue;
                        }
                        if (var466 == 4109) {
                            var6--;
                            String var344 = field782[var6];
                            var5 -= 2;
                            int var345 = field781[var5];
                            int var346 = field781[var5 + 1];
                            byte[] var347 = Statics.field1998.method3011(var346, 0);
                            class225 var348 = new class225(var347);
                            field781[var5++] = var348.method3760(var344, var345);
                            continue;
                        }
                        if (var466 == 4110) {
                            var6 -= 2;
                            String var349 = field782[var6];
                            String var350 = field782[var6 + 1];
                            var5--;
                            if (field781[var5] == 1) {
                                field782[var6++] = var349;
                            } else {
                                field782[var6++] = var350;
                            }
                            continue;
                        }
                        if (var466 == 4111) {
                            var6--;
                            String var351 = field782[var6];
                            field782[var6++] = class224.method3761(var351);
                            continue;
                        }
                        if (var466 == 4112) {
                            var6--;
                            String var352 = field782[var6];
                            var5--;
                            int var353 = field781[var5];
                            field782[var6++] = var352 + (char) var353;
                            continue;
                        }
                        if (var466 == 4113) {
                            var5--;
                            int var354 = field781[var5];
                            int[] var355 = field781;
                            int var356 = var5++;
                            char var357 = (char) var354;
                            boolean var358;
                            if (var357 >= ' ' && var357 <= '~') {
                                var358 = true;
                            } else if (var357 >= 160 && var357 <= 255) {
                                var358 = true;
                            } else if (var357 == 8364 || var357 == 338 || var357 == 8212 || var357 == 339 || var357 == 376) {
                                var358 = true;
                            } else {
                                var358 = false;
                            }
                            var355[var356] = var358 ? 1 : 0;
                            continue;
                        }
                        if (var466 == 4114) {
                            var5--;
                            int var359 = field781[var5];
                            int[] var360 = field781;
                            int var361 = var5++;
                            char var362 = (char) var359;
                            boolean var363 = var362 >= '0' && var362 <= '9' || var362 >= 'A' && var362 <= 'Z' || var362 >= 'a' && var362 <= 'z';
                            var360[var361] = var363 ? 1 : 0;
                            continue;
                        }
                        if (var466 == 4115) {
                            var5--;
                            int var364 = field781[var5];
                            field781[var5++] = class164.method7((char) var364) ? 1 : 0;
                            continue;
                        }
                        if (var466 == 4116) {
                            var5--;
                            int var365 = field781[var5];
                            int[] var366 = field781;
                            int var367 = var5++;
                            char var368 = (char) var365;
                            boolean var369 = var368 >= '0' && var368 <= '9';
                            var366[var367] = var369 ? 1 : 0;
                            continue;
                        }
                        if (var466 == 4117) {
                            var6--;
                            String var370 = field782[var6];
                            if (var370 == null) {
                                field781[var5++] = 0;
                            } else {
                                field781[var5++] = var370.length();
                            }
                            continue;
                        }
                        if (var466 == 4118) {
                            var6--;
                            String var371 = field782[var6];
                            var5 -= 2;
                            int var372 = field781[var5];
                            int var373 = field781[var5 + 1];
                            field782[var6++] = var371.substring(var372, var373);
                            continue;
                        }
                        if (var466 == 4119) {
                            var6--;
                            String var374 = field782[var6];
                            StringBuilder var375 = new StringBuilder(var374.length());
                            boolean var376 = false;
                            for (int var377 = 0; var377 < var374.length(); var377++) {
                                char var378 = var374.charAt(var377);
                                if (var378 == '<') {
                                    var376 = true;
                                } else if (var378 == '>') {
                                    var376 = false;
                                } else if (!var376) {
                                    var375.append(var378);
                                }
                            }
                            field782[var6++] = var375.toString();
                            continue;
                        }
                        if (var466 == 4120) {
                            var6--;
                            String var379 = field782[var6];
                            var5--;
                            int var380 = field781[var5];
                            field781[var5++] = var379.indexOf(var380);
                            continue;
                        }
                        if (var466 == 4121) {
                            var6 -= 2;
                            String var381 = field782[var6];
                            String var382 = field782[var6 + 1];
                            var5--;
                            int var383 = field781[var5];
                            field781[var5++] = var381.indexOf(var382, var383);
                            continue;
                        }
                    } else if (var466 < 4300) {
                        if (var466 == 4200) {
                            var5--;
                            int var384 = field781[var5];
                            field782[var6++] = class52.method1967(var384).field1096;
                            continue;
                        }
                        if (var466 == 4201) {
                            var5 -= 2;
                            int var385 = field781[var5];
                            int var386 = field781[var5 + 1];
                            class52 var387 = class52.method1967(var385);
                            if (var386 >= 1 && var386 <= 5 && var387.field1089[var386 - 1] != null) {
                                field782[var6++] = var387.field1089[var386 - 1];
                                continue;
                            }
                            field782[var6++] = "";
                            continue;
                        }
                        if (var466 == 4202) {
                            var5 -= 2;
                            int var388 = field781[var5];
                            int var389 = field781[var5 + 1];
                            class52 var390 = class52.method1967(var388);
                            if (var389 >= 1 && var389 <= 5 && var390.field1111[var389 - 1] != null) {
                                field782[var6++] = var390.field1111[var389 - 1];
                                continue;
                            }
                            field782[var6++] = "";
                            continue;
                        }
                        if (var466 == 4203) {
                            var5--;
                            int var391 = field781[var5];
                            field781[var5++] = class52.method1967(var391).field1108;
                            continue;
                        }
                        if (var466 == 4204) {
                            var5--;
                            int var392 = field781[var5];
                            field781[var5++] = class52.method1967(var392).field1107 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var466 == 4205) {
                            var5--;
                            int var393 = field781[var5];
                            class52 var394 = class52.method1967(var393);
                            if (var394.field1140 == -1 && var394.field1126 >= 0) {
                                field781[var5++] = var394.field1126;
                                continue;
                            }
                            field781[var5++] = var393;
                            continue;
                        }
                        if (var466 == 4206) {
                            var5--;
                            int var395 = field781[var5];
                            class52 var396 = class52.method1967(var395);
                            if (var396.field1140 >= 0 && var396.field1126 >= 0) {
                                field781[var5++] = var396.field1126;
                                continue;
                            }
                            field781[var5++] = var395;
                            continue;
                        }
                        if (var466 == 4207) {
                            var5--;
                            int var397 = field781[var5];
                            field781[var5++] = class52.method1967(var397).field1109 ? 1 : 0;
                            continue;
                        }
                        if (var466 == 4208) {
                            var5--;
                            int var398 = field781[var5];
                            class52 var399 = class52.method1967(var398);
                            if (var399.field1138 == -1 && var399.field1114 >= 0) {
                                field781[var5++] = var399.field1114;
                                continue;
                            }
                            field781[var5++] = var398;
                            continue;
                        }
                        if (var466 == 4209) {
                            var5--;
                            int var400 = field781[var5];
                            class52 var401 = class52.method1967(var400);
                            if (var401.field1138 >= 0 && var401.field1114 >= 0) {
                                field781[var5++] = var401.field1114;
                                continue;
                            }
                            field781[var5++] = var400;
                            continue;
                        }
                        if (var466 == 4210) {
                            var6--;
                            String var402 = field782[var6];
                            var5--;
                            int var403 = field781[var5];
                            client.method2684(var402, var403 == 1);
                            field781[var5++] = Statics.field1986;
                            continue;
                        }
                        if (var466 == 4211) {
                            if (Statics.field790 != null && Statics.field1144 < Statics.field1986) {
                                field781[var5++] = Statics.field790[++Statics.field1144 - 1] & 0xFFFF;
                                continue;
                            }
                            field781[var5++] = -1;
                            continue;
                        }
                        if (var466 == 4212) {
                            Statics.field1144 = 0;
                            continue;
                        }
                    } else if (var466 < 5100) {
                        if (var466 == 5000) {
                            field781[var5++] = client.field492;
                            continue;
                        }
                        if (var466 == 5001) {
                            var5 -= 3;
                            client.field492 = field781[var5];
                            int var404 = field781[var5 + 1];
                            class131[] var405 = class131.method2806();
                            int var406 = 0;
                            class131 var408;
                            while (true) {
                                if (var406 >= var405.length) {
                                    var408 = null;
                                    break;
                                }
                                class131 var407 = var405[var406];
                                if (var407.field2039 == var404) {
                                    var408 = var407;
                                    break;
                                }
                                var406++;
                            }
                            Statics.field654 = var408;
                            if (Statics.field654 == null) {
                                Statics.field654 = class131.field2037;
                            }
                            client.field288 = field781[var5 + 2];
                            client.field319.method2596(79);
                            client.field319.method2364(client.field492);
                            client.field319.method2364(Statics.field654.field2039);
                            client.field319.method2364(client.field288);
                            continue;
                        }
                        if (var466 == 5002) {
                            var6--;
                            String var409 = field782[var6];
                            var5 -= 2;
                            int var410 = field781[var5];
                            int var411 = field781[var5 + 1];
                            client.field319.method2596(53);
                            client.field319.method2364(class120.method2308(var409) + 2);
                            client.field319.method2352(var409);
                            client.field319.method2364(var410 - 1);
                            client.field319.method2364(var411);
                            continue;
                        }
                        if (var466 == 5003) {
                            var5 -= 2;
                            int var412 = field781[var5];
                            int var413 = field781[var5 + 1];
                            class36 var414 = Statics.method733(var412, var413);
                            if (var414 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = 0;
                                field782[var6++] = "";
                                field782[var6++] = "";
                                field782[var6++] = "";
                            } else {
                                field781[var5++] = var414.field766;
                                field781[var5++] = var414.field764;
                                field782[var6++] = var414.field765 == null ? "" : var414.field765;
                                field782[var6++] = var414.field767 == null ? "" : var414.field767;
                                field782[var6++] = var414.field769 == null ? "" : var414.field769;
                            }
                            continue;
                        }
                        if (var466 == 5004) {
                            var5--;
                            int var415 = field781[var5];
                            class36 var416 = class12.method1226(var415);
                            if (var416 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = 0;
                                field782[var6++] = "";
                                field782[var6++] = "";
                                field782[var6++] = "";
                            } else {
                                field781[var5++] = var416.field771;
                                field781[var5++] = var416.field764;
                                field782[var6++] = var416.field765 == null ? "" : var416.field765;
                                field782[var6++] = var416.field767 == null ? "" : var416.field767;
                                field782[var6++] = var416.field769 == null ? "" : var416.field769;
                            }
                            continue;
                        }
                        if (var466 == 5005) {
                            if (Statics.field654 == null) {
                                field781[var5++] = -1;
                            } else {
                                field781[var5++] = Statics.field654.field2039;
                            }
                            continue;
                        }
                        if (var466 == 5008) {
                            var6--;
                            String var417 = field782[var6];
                            var5--;
                            int var418 = field781[var5];
                            String var419 = var417.toLowerCase();
                            byte var420 = 0;
                            if (var419.startsWith(class158.field2303)) {
                                var420 = 0;
                                var417 = var417.substring(class158.field2303.length());
                            } else if (var419.startsWith(class158.field2394)) {
                                var420 = 1;
                                var417 = var417.substring(class158.field2394.length());
                            } else if (var419.startsWith(class158.field2477)) {
                                var420 = 2;
                                var417 = var417.substring(class158.field2477.length());
                            } else if (var419.startsWith(class158.field2479)) {
                                var420 = 3;
                                var417 = var417.substring(class158.field2479.length());
                            } else if (var419.startsWith(class158.field2481)) {
                                var420 = 4;
                                var417 = var417.substring(class158.field2481.length());
                            } else if (var419.startsWith(class158.field2483)) {
                                var420 = 5;
                                var417 = var417.substring(class158.field2483.length());
                            } else if (var419.startsWith(class158.field2485)) {
                                var420 = 6;
                                var417 = var417.substring(class158.field2485.length());
                            } else if (var419.startsWith(class158.field2451)) {
                                var420 = 7;
                                var417 = var417.substring(class158.field2451.length());
                            } else if (var419.startsWith(class158.field2432)) {
                                var420 = 8;
                                var417 = var417.substring(class158.field2432.length());
                            } else if (var419.startsWith(class158.field2491)) {
                                var420 = 9;
                                var417 = var417.substring(class158.field2491.length());
                            } else if (var419.startsWith(class158.field2385)) {
                                var420 = 10;
                                var417 = var417.substring(class158.field2385.length());
                            } else if (var419.startsWith(class158.field2495)) {
                                var420 = 11;
                                var417 = var417.substring(class158.field2495.length());
                            } else if (client.field293 != 0) {
                                if (var419.startsWith(class158.field2350)) {
                                    var420 = 0;
                                    var417 = var417.substring(class158.field2350.length());
                                } else if (var419.startsWith(class158.field2386)) {
                                    var420 = 1;
                                    var417 = var417.substring(class158.field2386.length());
                                } else if (var419.startsWith(class158.field2478)) {
                                    var420 = 2;
                                    var417 = var417.substring(class158.field2478.length());
                                } else if (var419.startsWith(class158.field2480)) {
                                    var420 = 3;
                                    var417 = var417.substring(class158.field2480.length());
                                } else if (var419.startsWith(class158.field2482)) {
                                    var420 = 4;
                                    var417 = var417.substring(class158.field2482.length());
                                } else if (var419.startsWith(class158.field2484)) {
                                    var420 = 5;
                                    var417 = var417.substring(class158.field2484.length());
                                } else if (var419.startsWith(class158.field2486)) {
                                    var420 = 6;
                                    var417 = var417.substring(class158.field2486.length());
                                } else if (var419.startsWith(class158.field2488)) {
                                    var420 = 7;
                                    var417 = var417.substring(class158.field2488.length());
                                } else if (var419.startsWith(class158.field2490)) {
                                    var420 = 8;
                                    var417 = var417.substring(class158.field2490.length());
                                } else if (var419.startsWith(class158.field2492)) {
                                    var420 = 9;
                                    var417 = var417.substring(class158.field2492.length());
                                } else if (var419.startsWith(class158.field2494)) {
                                    var420 = 10;
                                    var417 = var417.substring(class158.field2494.length());
                                } else if (var419.startsWith(class158.field2552)) {
                                    var420 = 11;
                                    var417 = var417.substring(class158.field2552.length());
                                }
                            }
                            String var421 = var417.toLowerCase();
                            byte var422 = 0;
                            if (var421.startsWith(class158.field2466)) {
                                var422 = 1;
                                var417 = var417.substring(class158.field2466.length());
                            } else if (var421.startsWith(class158.field2499)) {
                                var422 = 2;
                                var417 = var417.substring(class158.field2499.length());
                            } else if (var421.startsWith(class158.field2510)) {
                                var422 = 3;
                                var417 = var417.substring(class158.field2510.length());
                            } else if (var421.startsWith(class158.field2503)) {
                                var422 = 4;
                                var417 = var417.substring(class158.field2503.length());
                            } else if (var421.startsWith(class158.field2505)) {
                                var422 = 5;
                                var417 = var417.substring(class158.field2505.length());
                            } else if (client.field293 != 0) {
                                if (var421.startsWith(class158.field2498)) {
                                    var422 = 1;
                                    var417 = var417.substring(class158.field2498.length());
                                } else if (var421.startsWith(class158.field2500)) {
                                    var422 = 2;
                                    var417 = var417.substring(class158.field2500.length());
                                } else if (var421.startsWith(class158.field2383)) {
                                    var422 = 3;
                                    var417 = var417.substring(class158.field2383.length());
                                } else if (var421.startsWith(class158.field2504)) {
                                    var422 = 4;
                                    var417 = var417.substring(class158.field2504.length());
                                } else if (var421.startsWith(class158.field2506)) {
                                    var422 = 5;
                                    var417 = var417.substring(class158.field2506.length());
                                }
                            }
                            client.field319.method2596(172);
                            client.field319.method2364(0);
                            int var423 = client.field319.field1972;
                            client.field319.method2364(var418);
                            client.field319.method2364(var420);
                            client.field319.method2364(var422);
                            class223.method2283(client.field319, var417);
                            client.field319.method2358(client.field319.field1972 - var423);
                            continue;
                        }
                        if (var466 == 5009) {
                            var6 -= 2;
                            String var424 = field782[var6];
                            String var425 = field782[var6 + 1];
                            client.field319.method2596(156);
                            client.field319.method2347(0);
                            int var426 = client.field319.field1972;
                            client.field319.method2352(var424);
                            class223.method2283(client.field319, var425);
                            client.field319.method2357(client.field319.field1972 - var426);
                            continue;
                        }
                        if (var466 == 5015) {
                            String var427;
                            if (Statics.field1054 == null || Statics.field1054.field59 == null) {
                                var427 = "";
                            } else {
                                var427 = Statics.field1054.field59;
                            }
                            field782[var6++] = var427;
                            continue;
                        }
                        if (var466 == 5016) {
                            field781[var5++] = client.field288;
                            continue;
                        }
                        if (var466 == 5017) {
                            var5--;
                            int var428 = field781[var5];
                            field781[var5++] = class12.method925(var428);
                            continue;
                        }
                        if (var466 == 5018) {
                            var5--;
                            int var429 = field781[var5];
                            int[] var430 = field781;
                            int var431 = var5++;
                            class36 var432 = (class36) class12.field172.method3520((long) var429);
                            int var433;
                            if (var432 == null) {
                                var433 = -1;
                            } else if (class12.field173.field3109 == var432.field3113) {
                                var433 = -1;
                            } else {
                                var433 = ((class36) var432.field3113).field766;
                            }
                            var430[var431] = var433;
                            continue;
                        }
                        if (var466 == 5019) {
                            var5--;
                            int var434 = field781[var5];
                            int[] var435 = field781;
                            int var436 = var5++;
                            class36 var437 = (class36) class12.field172.method3520((long) var434);
                            int var438;
                            if (var437 == null) {
                                var438 = -1;
                            } else if (class12.field173.field3109 == var437.field3114) {
                                var438 = -1;
                            } else {
                                var438 = ((class36) var437.field3114).field766;
                            }
                            var435[var436] = var438;
                            continue;
                        }
                        if (var466 == 5020) {
                            var6--;
                            String var439 = field782[var6];
                            if (var439.equalsIgnoreCase("toggleroof")) {
                                Statics.field76.field146 = !Statics.field76.field146;
                                class9.method933();
                                if (Statics.field76.field146) {
                                    class12.method108(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method108(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var439.equalsIgnoreCase("displayfps")) {
                                client.field532 = !client.field532;
                            }
                            if (client.field441 >= 2) {
                                if (var439.equalsIgnoreCase("fpson")) {
                                    client.field532 = true;
                                }
                                if (var439.equalsIgnoreCase("fpsoff")) {
                                    client.field532 = false;
                                }
                                if (var439.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var439.equalsIgnoreCase("clientdrop")) {
                                    if (client.field306 > 0) {
                                        client.method576();
                                    } else {
                                        client.method159(40);
                                        Statics.field258 = Statics.field1661;
                                        Statics.field1661 = null;
                                    }
                                }
                                if (var439.equalsIgnoreCase("errortest") && client.field432 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field319.method2596(11);
                            client.field319.method2364(var439.length() + 1);
                            client.field319.method2352(var439);
                            continue;
                        }
                        if (var466 == 5021) {
                            var6--;
                            client.field482 = field782[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var466 == 5022) {
                            field782[var6++] = client.field482;
                            continue;
                        }
                    }
                }
                if (var466 < 5400) {
                    if (var466 == 5306) {
                        int[] var440 = field781;
                        int var441 = var5++;
                        int var442 = client.field488 ? 2 : 1;
                        var440[var441] = var442;
                        continue;
                    }
                    if (var466 == 5307) {
                        var5--;
                        int var443 = field781[var5];
                        if (var443 != 1 && var443 != 2) {
                            continue;
                        }
                        client.field487 = 0L;
                        if (var443 >= 2) {
                            client.field488 = true;
                        } else {
                            client.field488 = false;
                        }
                        client.method920();
                        if (client.field284 >= 25) {
                            client.field319.method2596(98);
                            class123 var444 = client.field319;
                            int var445 = client.field488 ? 2 : 1;
                            var444.method2364(var445);
                            client.field319.method2347(Statics.field103);
                            client.field319.method2347(Statics.field902);
                        }
                        class145.field2184 = true;
                        continue;
                    }
                    if (var466 == 5308) {
                        field781[var5++] = Statics.field76.field145;
                        continue;
                    }
                    if (var466 == 5309) {
                        var5--;
                        int var446 = field781[var5];
                        if (var446 == 1 || var446 == 2) {
                            Statics.field76.field145 = var446;
                            class9.method933();
                        }
                        continue;
                    }
                }
                if (var466 < 5600) {
                    if (var466 == 5504) {
                        var5 -= 2;
                        int var447 = field781[var5];
                        int var448 = field781[var5 + 1];
                        if (!client.field500) {
                            client.field360 = var447;
                            client.field522 = var448;
                        }
                        continue;
                    }
                    if (var466 == 5505) {
                        field781[var5++] = client.field360;
                        continue;
                    }
                    if (var466 == 5506) {
                        field781[var5++] = client.field522;
                        continue;
                    }
                    if (var466 == 5530) {
                        var5--;
                        int var449 = field781[var5];
                        if (var449 < 0) {
                            var449 = 0;
                        }
                        client.field366 = var449;
                        continue;
                    }
                    if (var466 == 5531) {
                        field781[var5++] = client.field366;
                        continue;
                    }
                }
                if (var466 >= 5700 || var466 != 5630) {
                    if (var466 < 6300) {
                        if (var466 == 6200) {
                            var5 -= 2;
                            client.field528 = (short) field781[var5];
                            if (client.field528 <= 0) {
                                client.field528 = 256;
                            }
                            client.field529 = (short) field781[var5 + 1];
                            if (client.field529 <= 0) {
                                client.field529 = 205;
                            }
                            continue;
                        }
                        if (var466 == 6201) {
                            var5 -= 2;
                            client.field427 = (short) field781[var5];
                            if (client.field427 <= 0) {
                                client.field427 = 256;
                            }
                            client.field531 = (short) field781[var5 + 1];
                            if (client.field531 <= 0) {
                                client.field531 = 320;
                            }
                            continue;
                        }
                        if (var466 == 6202) {
                            var5 -= 4;
                            client.field325 = (short) field781[var5];
                            if (client.field325 <= 0) {
                                client.field325 = 1;
                            }
                            client.field402 = (short) field781[var5 + 1];
                            if (client.field402 <= 0) {
                                client.field402 = 32767;
                            } else if (client.field402 < client.field325) {
                                client.field402 = client.field325;
                            }
                            client.field534 = (short) field781[var5 + 2];
                            if (client.field534 <= 0) {
                                client.field534 = 1;
                            }
                            client.field505 = (short) field781[var5 + 3];
                            if (client.field505 <= 0) {
                                client.field505 = 32767;
                            } else if (client.field505 < client.field534) {
                                client.field505 = client.field534;
                            }
                            continue;
                        }
                        if (var466 == 6203) {
                            if (client.field299 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = -1;
                            } else {
                                client.method564(0, 0, client.field299.field2841, client.field299.field2747, false);
                                field781[var5++] = client.field506;
                                field781[var5++] = client.field539;
                            }
                            continue;
                        }
                        if (var466 == 6204) {
                            field781[var5++] = client.field427;
                            field781[var5++] = client.field531;
                            continue;
                        }
                        if (var466 == 6205) {
                            field781[var5++] = client.field528;
                            field781[var5++] = client.field529;
                            continue;
                        }
                    }
                    if (var466 < 6600) {
                        if (var466 == 6500) {
                            field781[var5++] = class26.method1578() ? 1 : 0;
                            continue;
                        }
                        if (var466 == 6501) {
                            class26.field616 = 0;
                            class26 var450 = class26.method967();
                            if (var450 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = 0;
                                field782[var6++] = "";
                                field781[var5++] = 0;
                                field781[var5++] = 0;
                                field782[var6++] = "";
                            } else {
                                field781[var5++] = var450.field619;
                                field781[var5++] = var450.field614;
                                field782[var6++] = var450.field621;
                                field781[var5++] = var450.field624;
                                field781[var5++] = var450.field626;
                                field782[var6++] = var450.field628;
                            }
                            continue;
                        }
                        if (var466 == 6502) {
                            class26 var452 = class26.method967();
                            if (var452 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = 0;
                                field782[var6++] = "";
                                field781[var5++] = 0;
                                field781[var5++] = 0;
                                field782[var6++] = "";
                            } else {
                                field781[var5++] = var452.field619;
                                field781[var5++] = var452.field614;
                                field782[var6++] = var452.field621;
                                field781[var5++] = var452.field624;
                                field781[var5++] = var452.field626;
                                field782[var6++] = var452.field628;
                            }
                            continue;
                        }
                        if (var466 == 6506) {
                            var5--;
                            int var453 = field781[var5];
                            class26 var454 = null;
                            for (int var455 = 0; var455 < class26.field615; var455++) {
                                if (Statics.field617[var455].field619 == var453) {
                                    var454 = Statics.field617[var455];
                                    break;
                                }
                            }
                            if (var454 == null) {
                                field781[var5++] = -1;
                                field781[var5++] = 0;
                                field782[var6++] = "";
                                field781[var5++] = 0;
                                field781[var5++] = 0;
                                field782[var6++] = "";
                            } else {
                                field781[var5++] = var454.field619;
                                field781[var5++] = var454.field614;
                                field782[var6++] = var454.field621;
                                field781[var5++] = var454.field624;
                                field781[var5++] = var454.field626;
                                field782[var6++] = var454.field628;
                            }
                            continue;
                        }
                        if (var466 == 6507) {
                            var5 -= 4;
                            int var456 = field781[var5];
                            boolean var457 = field781[var5 + 1] == 1;
                            int var458 = field781[var5 + 2];
                            boolean var459 = field781[var5 + 3] == 1;
                            if (Statics.field617 != null) {
                                class26.method558(0, Statics.field617.length - 1, var456, var457, var458, var459);
                            }
                            continue;
                        }
                        if (var466 == 6511) {
                            var5--;
                            int var460 = field781[var5];
                            if (var460 >= 0 && var460 < class26.field615) {
                                class26 var461 = Statics.field617[var460];
                                field781[var5++] = var461.field619;
                                field781[var5++] = var461.field614;
                                field782[var6++] = var461.field621;
                                field781[var5++] = var461.field624;
                                field781[var5++] = var461.field626;
                                field782[var6++] = var461.field628;
                                continue;
                            }
                            field781[var5++] = -1;
                            field781[var5++] = 0;
                            field782[var6++] = "";
                            field781[var5++] = 0;
                            field781[var5++] = 0;
                            field782[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field306 = 250;
            }
        } catch (Exception var465) {
            StringBuilder var463 = new StringBuilder(30);
            var463.append("").append(var4.field3123).append(" ");
            for (int var464 = field787 - 1; var464 >= 0; var464--) {
                var463.append("").append(field784[var464].field206.field3123).append(" ");
            }
            var463.append("").append(var10);
            class149.method101(var463.toString(), var465);
        }
    }

    @ObfuscatedName("cb.m(II)V")
    public static void method2054(int arg0) {
        if (arg0 == -1 || !class174.method2240(arg0)) {
            return;
        }
        class174[] var1 = Statics.field2736[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174 var3 = var1[var2];
            if (var3.field2826 != null) {
                class1 var4 = new class1();
                var4.field19 = var3;
                var4.field17 = var3.field2826;
                method3142(var4, 2000000);
            }
        }
    }
}
