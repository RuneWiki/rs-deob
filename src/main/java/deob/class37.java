package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("at")
public class class37 {

    @ObfuscatedName("at.c")
    public static int[] field775 = new int[5];

    @ObfuscatedName("at.d")
    public static int[][] field785 = new int[5][5000];

    @ObfuscatedName("at.l")
    public static int[] field777 = new int[1000];

    @ObfuscatedName("at.b")
    public static String[] field771 = new String[1000];

    @ObfuscatedName("at.j")
    public static int field779 = 0;

    @ObfuscatedName("at.f")
    public static class15[] field780 = new class15[50];

    @ObfuscatedName("at.t")
    public static Calendar field783 = Calendar.getInstance();

    @ObfuscatedName("at.e")
    public static final String[] field784 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("at.q")
    public static int field786 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.k(Lk;IS)V")
    public static void method170(class1 arg0, int arg1) {
        Object[] var2 = arg0.field14;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method2957(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field581;
        int[] var9 = var4.field582;
        byte var10 = -1;
        field779 = 0;
        try {
            Statics.field773 = new int[var4.field583];
            int var11 = 0;
            Statics.field774 = new String[var4.field587];
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
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2741;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2742;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2741;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2742;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field7;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field2;
                    }
                    Statics.field773[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field774[var12++] = var15;
                }
            }
            int var16 = 0;
            field786 = arg0.field11;
            label2975: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var485 = var8[var7];
                if (var485 < 100) {
                    if (var485 == 0) {
                        field777[var5++] = var9[var7];
                        continue;
                    }
                    if (var485 == 1) {
                        int var17 = var9[var7];
                        field777[var5++] = class176.field2886[var17];
                        continue;
                    }
                    if (var485 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2886[var18] = field777[var5];
                        client.method89(var18);
                        continue;
                    }
                    if (var485 == 3) {
                        field771[var6++] = var4.field588[var7];
                        continue;
                    }
                    if (var485 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var485 == 7) {
                        var5 -= 2;
                        if (field777[var5 + 1] != field777[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var485 == 8) {
                        var5 -= 2;
                        if (field777[var5 + 1] == field777[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var485 == 9) {
                        var5 -= 2;
                        if (field777[var5] < field777[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var485 == 10) {
                        var5 -= 2;
                        if (field777[var5] > field777[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var485 == 21) {
                        if (field779 == 0) {
                            return;
                        }
                        class15 var19 = field780[--field779];
                        var4 = var19.field207;
                        var8 = var4.field581;
                        var9 = var4.field582;
                        var7 = var19.field202;
                        Statics.field773 = var19.field203;
                        Statics.field774 = var19.field208;
                        continue;
                    }
                    if (var485 == 25) {
                        int var20 = var9[var7];
                        field777[var5++] = class176.method3506(var20);
                        continue;
                    }
                    if (var485 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class176.method2944(var21, field777[var5]);
                        continue;
                    }
                    if (var485 == 31) {
                        var5 -= 2;
                        if (field777[var5] <= field777[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var485 == 32) {
                        var5 -= 2;
                        if (field777[var5] >= field777[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var485 == 33) {
                        field777[var5++] = Statics.field773[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var485 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field773[var10001] = field777[var5];
                        continue;
                    }
                    if (var485 == 35) {
                        field771[var6++] = Statics.field774[var9[var7]];
                        continue;
                    }
                    if (var485 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field774[var10001] = field771[var6];
                        continue;
                    }
                    if (var485 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = Statics.method1485(field771, var6, var22);
                        field771[var6++] = var23;
                        continue;
                    }
                    if (var485 == 38) {
                        var5--;
                        continue;
                    }
                    if (var485 == 39) {
                        var6--;
                        continue;
                    }
                    if (var485 == 40) {
                        int var24 = var9[var7];
                        class23 var25 = class23.method2957(var24);
                        int[] var26 = new int[var25.field583];
                        String[] var27 = new String[var25.field587];
                        for (int var28 = 0; var28 < var25.field584; var28++) {
                            var26[var28] = field777[var5 - var25.field584 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field580; var29++) {
                            var27[var29] = field771[var6 - var25.field580 + var29];
                        }
                        var5 -= var25.field584;
                        var6 -= var25.field580;
                        class15 var30 = new class15();
                        var30.field207 = var4;
                        var30.field202 = var7;
                        var30.field203 = Statics.field773;
                        var30.field208 = Statics.field774;
                        field780[++field779 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field581;
                        var9 = var25.field582;
                        var7 = -1;
                        Statics.field773 = var26;
                        Statics.field774 = var27;
                        continue;
                    }
                    if (var485 == 42) {
                        field777[var5++] = Statics.field1728.method226(var9[var7]);
                        continue;
                    }
                    if (var485 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1728.method193(var10001, field777[var5]);
                        continue;
                    }
                    if (var485 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field777[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field775[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2975;
                                }
                                field785[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var485 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field777[var5];
                        if (var37 >= 0 && var37 < field775[var36]) {
                            field777[var5++] = field785[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var485 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field777[var5];
                        if (var39 >= 0 && var39 < field775[var38]) {
                            field785[var38][var39] = field777[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var485 == 47) {
                        String var40 = Statics.field1728.method196(var9[var7]);
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field771[var6++] = var40;
                        continue;
                    }
                    if (var485 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1728.method195(var10001, field771[var6]);
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var485 < 1000) {
                    if (var485 == 100) {
                        var5 -= 3;
                        int var42 = field777[var5];
                        int var43 = field777[var5 + 1];
                        int var44 = field777[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var45 = class173.method3152(var42);
                        if (var45.field2863 == null) {
                            var45.field2863 = new class173[var44 + 1];
                        }
                        if (var45.field2863.length <= var44) {
                            class173[] var46 = new class173[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2863.length; var47++) {
                                var46[var47] = var45.field2863[var47];
                            }
                            var45.field2863 = var46;
                        }
                        if (var44 > 0 && var45.field2863[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class173 var48 = new class173();
                        var48.field2743 = var43;
                        var48.field2763 = var48.field2741 = var45.field2741;
                        var48.field2742 = var44;
                        var48.field2740 = true;
                        var45.field2863[var44] = var48;
                        if (var41) {
                            Statics.field776 = var48;
                        } else {
                            Statics.field781 = var48;
                        }
                        client.method2258(var45);
                        continue;
                    }
                    if (var485 == 101) {
                        class173 var49 = var41 ? Statics.field776 : Statics.field781;
                        class173 var50 = class173.method3152(var49.field2741);
                        var50.field2863[var49.field2742] = null;
                        client.method2258(var50);
                        continue;
                    }
                    if (var485 == 102) {
                        var5--;
                        class173 var51 = class173.method3152(field777[var5]);
                        var51.field2863 = null;
                        client.method2258(var51);
                        continue;
                    }
                    if (var485 == 200) {
                        var5 -= 2;
                        int var52 = field777[var5];
                        int var53 = field777[var5 + 1];
                        class173 var54 = class173.method2132(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field777[var5++] = 1;
                            if (var41) {
                                Statics.field776 = var54;
                            } else {
                                Statics.field781 = var54;
                            }
                            continue;
                        }
                        field777[var5++] = 0;
                        continue;
                    }
                    if (var485 == 201) {
                        var5--;
                        class173 var55 = class173.method3152(field777[var5]);
                        if (var55 == null) {
                            field777[var5++] = 0;
                        } else {
                            field777[var5++] = 1;
                            if (var41) {
                                Statics.field776 = var55;
                            } else {
                                Statics.field781 = var55;
                            }
                        }
                        continue;
                    }
                } else if (!(var485 < 1000 || var485 >= 1100) || !(var485 < 2000 || var485 >= 2100)) {
                    int var56 = -1;
                    class173 var57;
                    if (var485 >= 2000) {
                        var485 -= 1000;
                        var5--;
                        var56 = field777[var5];
                        var57 = class173.method3152(var56);
                    } else {
                        var57 = var41 ? Statics.field776 : Statics.field781;
                    }
                    if (var485 == 1000) {
                        var5 -= 4;
                        var57.field2750 = field777[var5];
                        var57.field2810 = field777[var5 + 1];
                        var57.field2748 = field777[var5 + 2];
                        var57.field2747 = field777[var5 + 3];
                        client.method2258(var57);
                        client.method3165(var57);
                        if (var56 != -1 && var57.field2743 == 0) {
                            client.method2777(Statics.field2838[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var485 == 1001) {
                        var5 -= 4;
                        var57.field2752 = field777[var5];
                        var57.field2753 = field777[var5 + 1];
                        var57.field2769 = field777[var5 + 2];
                        var57.field2749 = field777[var5 + 3];
                        client.method2258(var57);
                        client.method3165(var57);
                        if (var56 != -1 && var57.field2743 == 0) {
                            client.method2777(Statics.field2838[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var485 == 1003) {
                        var5--;
                        boolean var58 = field777[var5] == 1;
                        if (var57.field2766 != var58) {
                            var57.field2766 = var58;
                            client.method2258(var57);
                        }
                        continue;
                    }
                    if (var485 == 1005) {
                        var5--;
                        var57.field2872 = field777[var5] == 1;
                        continue;
                    }
                    if (var485 == 1006) {
                        var5--;
                        var57.field2873 = field777[var5] == 1;
                        continue;
                    }
                } else if (!(var485 < 1100 || var485 >= 1200) || !(var485 < 2100 || var485 >= 2200)) {
                    int var59 = -1;
                    class173 var60;
                    if (var485 >= 2000) {
                        var485 -= 1000;
                        var5--;
                        var59 = field777[var5];
                        var60 = class173.method3152(var59);
                    } else {
                        var60 = var41 ? Statics.field776 : Statics.field781;
                    }
                    if (var485 == 1100) {
                        var5 -= 2;
                        var60.field2870 = field777[var5];
                        if (var60.field2870 > var60.field2764 - var60.field2756) {
                            var60.field2870 = var60.field2764 - var60.field2756;
                        }
                        if (var60.field2870 < 0) {
                            var60.field2870 = 0;
                        }
                        var60.field2777 = field777[var5 + 1];
                        if (var60.field2777 > var60.field2765 - var60.field2811) {
                            var60.field2777 = var60.field2765 - var60.field2811;
                        }
                        if (var60.field2777 < 0) {
                            var60.field2777 = 0;
                        }
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1101) {
                        var5--;
                        var60.field2757 = field777[var5];
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1102) {
                        var5--;
                        var60.field2809 = field777[var5] == 1;
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1103) {
                        var5--;
                        var60.field2760 = field777[var5];
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1104) {
                        var5--;
                        var60.field2772 = field777[var5];
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1105) {
                        var5--;
                        var60.field2774 = field777[var5];
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1106) {
                        var5--;
                        var60.field2776 = field777[var5];
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1107) {
                        var5--;
                        var60.field2805 = field777[var5] == 1;
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1108) {
                        var60.field2782 = 1;
                        var5--;
                        var60.field2783 = field777[var5];
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1109) {
                        var5 -= 6;
                        var60.field2788 = field777[var5];
                        var60.field2790 = field777[var5 + 1];
                        var60.field2848 = field777[var5 + 2];
                        var60.field2791 = field777[var5 + 3];
                        var60.field2792 = field777[var5 + 4];
                        var60.field2793 = field777[var5 + 5];
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1110) {
                        var5--;
                        int var61 = field777[var5];
                        if (var60.field2786 != var61) {
                            var60.field2786 = var61;
                            var60.field2804 = 0;
                            var60.field2862 = 0;
                            client.method2258(var60);
                        }
                        continue;
                    }
                    if (var485 == 1111) {
                        var5--;
                        var60.field2823 = field777[var5] == 1;
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1112) {
                        var6--;
                        String var62 = field771[var6];
                        if (!var62.equals(var60.field2799)) {
                            var60.field2799 = var62;
                            client.method2258(var60);
                        }
                        continue;
                    }
                    if (var485 == 1113) {
                        var5--;
                        var60.field2798 = field777[var5];
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1114) {
                        var5 -= 3;
                        var60.field2802 = field777[var5];
                        var60.field2770 = field777[var5 + 1];
                        var60.field2827 = field777[var5 + 2];
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1115) {
                        var5--;
                        var60.field2861 = field777[var5] == 1;
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1116) {
                        var5--;
                        var60.field2778 = field777[var5];
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1117) {
                        var5--;
                        var60.field2779 = field777[var5];
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1118) {
                        var5--;
                        var60.field2780 = field777[var5] == 1;
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1119) {
                        var5--;
                        var60.field2857 = field777[var5] == 1;
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1120) {
                        var5 -= 2;
                        var60.field2764 = field777[var5];
                        var60.field2765 = field777[var5 + 1];
                        client.method2258(var60);
                        if (var59 != -1 && var60.field2743 == 0) {
                            client.method2777(Statics.field2838[var59 >> 16], var60, false);
                        }
                        continue;
                    }
                    if (var485 == 1121) {
                        int var63 = var60.field2741;
                        int var64 = var60.field2742;
                        client.field556.method2587(188);
                        client.field556.method2316(var64);
                        client.field556.method2318(var63);
                        client.field459 = var60;
                        client.method2258(var60);
                        continue;
                    }
                    if (var485 == 1122) {
                        var5--;
                        var60.field2775 = field777[var5];
                        client.method2258(var60);
                        continue;
                    }
                } else if (!(var485 < 1200 || var485 >= 1300) || !(var485 < 2200 || var485 >= 2300)) {
                    class173 var65;
                    if (var485 >= 2000) {
                        var485 -= 1000;
                        var5--;
                        var65 = class173.method3152(field777[var5]);
                    } else {
                        var65 = var41 ? Statics.field776 : Statics.field781;
                    }
                    client.method2258(var65);
                    if (var485 == 1200 || var485 == 1205 || var485 == 1212) {
                        var5 -= 2;
                        int var66 = field777[var5];
                        int var67 = field777[var5 + 1];
                        var65.field2859 = var66;
                        var65.field2860 = var67;
                        class52 var68 = class52.method2522(var66);
                        var65.field2848 = var68.field1103;
                        var65.field2791 = var68.field1101;
                        var65.field2792 = var68.field1102;
                        var65.field2788 = var68.field1129;
                        var65.field2790 = var68.field1104;
                        var65.field2793 = var68.field1086;
                        if (var485 == 1205) {
                            var65.field2751 = 0;
                        } else if (var485 == 1212 | var68.field1105 == 1) {
                            var65.field2751 = 1;
                        } else {
                            var65.field2751 = 2;
                        }
                        if (var65.field2794 > 0) {
                            var65.field2793 = var65.field2793 * 32 / var65.field2794;
                        } else if (var65.field2752 > 0) {
                            var65.field2793 = var65.field2793 * 32 / var65.field2752;
                        }
                        continue;
                    }
                    if (var485 == 1201) {
                        var65.field2782 = 2;
                        var5--;
                        var65.field2783 = field777[var5];
                        continue;
                    }
                    if (var485 == 1202) {
                        var65.field2782 = 3;
                        var65.field2783 = Statics.field2258.field28.method3281();
                        continue;
                    }
                } else if ((var485 < 1300 || var485 >= 1400) && (var485 < 2300 || var485 >= 2400)) {
                    if (var485 >= 1400 && var485 < 1500 || var485 >= 2400 && var485 < 2500) {
                        class173 var73;
                        if (var485 >= 2000) {
                            var485 -= 1000;
                            var5--;
                            var73 = class173.method3152(field777[var5]);
                        } else {
                            var73 = var41 ? Statics.field776 : Statics.field781;
                        }
                        var6--;
                        String var74 = field771[var6];
                        int[] var75 = null;
                        if (var74.length() > 0 && var74.charAt(var74.length() - 1) == 'Y') {
                            var5--;
                            int var76 = field777[var5];
                            if (var76 > 0) {
                                var75 = new int[var76];
                                while (var76-- > 0) {
                                    var5--;
                                    var75[var76] = field777[var5];
                                }
                            }
                            var74 = var74.substring(0, var74.length() - 1);
                        }
                        Object[] var77 = new Object[var74.length() + 1];
                        for (int var78 = var77.length - 1; var78 >= 1; var78--) {
                            if (var74.charAt(var78 - 1) == 's') {
                                var6--;
                                var77[var78] = field771[var6];
                            } else {
                                var5--;
                                var77[var78] = Integer.valueOf(field777[var5]);
                            }
                        }
                        var5--;
                        int var79 = field777[var5];
                        if (var79 == -1) {
                            var77 = null;
                        } else {
                            var77[0] = Integer.valueOf(var79);
                        }
                        if (var485 == 1400) {
                            var73.field2821 = var77;
                        }
                        if (var485 == 1401) {
                            var73.field2824 = var77;
                        }
                        if (var485 == 1402) {
                            var73.field2800 = var77;
                        }
                        if (var485 == 1403) {
                            var73.field2825 = var77;
                        }
                        if (var485 == 1404) {
                            var73.field2871 = var77;
                        }
                        if (var485 == 1405) {
                            var73.field2828 = var77;
                        }
                        if (var485 == 1406) {
                            var73.field2831 = var77;
                        }
                        if (var485 == 1407) {
                            var73.field2832 = var77;
                            var73.field2833 = var75;
                        }
                        if (var485 == 1408) {
                            var73.field2869 = var77;
                        }
                        if (var485 == 1409) {
                            var73.field2839 = var77;
                        }
                        if (var485 == 1410) {
                            var73.field2829 = var77;
                        }
                        if (var485 == 1411) {
                            var73.field2822 = var77;
                        }
                        if (var485 == 1412) {
                            var73.field2826 = var77;
                        }
                        if (var485 == 1414) {
                            var73.field2834 = var77;
                            var73.field2796 = var75;
                        }
                        if (var485 == 1415) {
                            var73.field2781 = var77;
                            var73.field2837 = var75;
                        }
                        if (var485 == 1416) {
                            var73.field2830 = var77;
                        }
                        if (var485 == 1417) {
                            var73.field2840 = var77;
                        }
                        if (var485 == 1418) {
                            var73.field2841 = var77;
                        }
                        if (var485 == 1419) {
                            var73.field2842 = var77;
                        }
                        if (var485 == 1420) {
                            var73.field2843 = var77;
                        }
                        if (var485 == 1421) {
                            var73.field2844 = var77;
                        }
                        if (var485 == 1422) {
                            var73.field2801 = var77;
                        }
                        if (var485 == 1423) {
                            var73.field2835 = var77;
                        }
                        if (var485 == 1424) {
                            var73.field2847 = var77;
                        }
                        if (var485 == 1425) {
                            var73.field2849 = var77;
                        }
                        if (var485 == 1426) {
                            var73.field2850 = var77;
                        }
                        if (var485 == 1427) {
                            var73.field2846 = var77;
                        }
                        var73.field2745 = true;
                        continue;
                    }
                    if (var485 < 1600) {
                        class173 var80 = var41 ? Statics.field776 : Statics.field781;
                        if (var485 == 1500) {
                            field777[var5++] = var80.field2819;
                            continue;
                        }
                        if (var485 == 1501) {
                            field777[var5++] = var80.field2755;
                            continue;
                        }
                        if (var485 == 1502) {
                            field777[var5++] = var80.field2756;
                            continue;
                        }
                        if (var485 == 1503) {
                            field777[var5++] = var80.field2811;
                            continue;
                        }
                        if (var485 == 1504) {
                            field777[var5++] = var80.field2766 ? 1 : 0;
                            continue;
                        }
                        if (var485 == 1505) {
                            field777[var5++] = var80.field2763;
                            continue;
                        }
                    } else if (var485 < 1700) {
                        class173 var81 = var41 ? Statics.field776 : Statics.field781;
                        if (var485 == 1600) {
                            field777[var5++] = var81.field2870;
                            continue;
                        }
                        if (var485 == 1601) {
                            field777[var5++] = var81.field2777;
                            continue;
                        }
                        if (var485 == 1602) {
                            field771[var6++] = var81.field2799;
                            continue;
                        }
                        if (var485 == 1603) {
                            field777[var5++] = var81.field2764;
                            continue;
                        }
                        if (var485 == 1604) {
                            field777[var5++] = var81.field2765;
                            continue;
                        }
                        if (var485 == 1605) {
                            field777[var5++] = var81.field2793;
                            continue;
                        }
                        if (var485 == 1606) {
                            field777[var5++] = var81.field2848;
                            continue;
                        }
                        if (var485 == 1607) {
                            field777[var5++] = var81.field2792;
                            continue;
                        }
                        if (var485 == 1608) {
                            field777[var5++] = var81.field2791;
                            continue;
                        }
                        if (var485 == 1609) {
                            field777[var5++] = var81.field2760;
                            continue;
                        }
                    } else if (var485 < 1800) {
                        class173 var82 = var41 ? Statics.field776 : Statics.field781;
                        if (var485 == 1700) {
                            field777[var5++] = var82.field2859;
                            continue;
                        }
                        if (var485 == 1701) {
                            if (var82.field2859 == -1) {
                                field777[var5++] = 0;
                            } else {
                                field777[var5++] = var82.field2860;
                            }
                            continue;
                        }
                        if (var485 == 1702) {
                            field777[var5++] = var82.field2742;
                            continue;
                        }
                    } else if (var485 < 1900) {
                        class173 var83 = var41 ? Statics.field776 : Statics.field781;
                        if (var485 == 1800) {
                            field777[var5++] = class178.method2950(client.method117(var83));
                            continue;
                        }
                        if (var485 == 1801) {
                            var5--;
                            int var84 = field777[var5];
                            int var486 = var84 - 1;
                            if (var83.field2803 != null && var486 < var83.field2803.length && var83.field2803[var486] != null) {
                                field771[var6++] = var83.field2803[var486];
                                continue;
                            }
                            field771[var6++] = "";
                            continue;
                        }
                        if (var485 == 1802) {
                            if (var83.field2812 == null) {
                                field771[var6++] = "";
                            } else {
                                field771[var6++] = var83.field2812;
                            }
                            continue;
                        }
                    } else if (!(var485 < 1900 || var485 >= 2000) || !(var485 < 2900 || var485 >= 3000)) {
                        class173 var85;
                        if (var485 >= 2000) {
                            var485 -= 1000;
                            var5--;
                            var85 = class173.method3152(field777[var5]);
                        } else {
                            var85 = var41 ? Statics.field776 : Statics.field781;
                        }
                        if (var485 == 1927) {
                            if (field786 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var85.field2846 == null) {
                                return;
                            }
                            class1 var86 = new class1();
                            var86.field3 = var85;
                            var86.field14 = var85.field2846;
                            var86.field11 = field786 + 1;
                            client.field288.method3588(arg0);
                            continue;
                        }
                    } else if (var485 < 2600) {
                        var5--;
                        class173 var87 = class173.method3152(field777[var5]);
                        if (var485 == 2500) {
                            field777[var5++] = var87.field2819;
                            continue;
                        }
                        if (var485 == 2501) {
                            field777[var5++] = var87.field2755;
                            continue;
                        }
                        if (var485 == 2502) {
                            field777[var5++] = var87.field2756;
                            continue;
                        }
                        if (var485 == 2503) {
                            field777[var5++] = var87.field2811;
                            continue;
                        }
                        if (var485 == 2504) {
                            field777[var5++] = var87.field2766 ? 1 : 0;
                            continue;
                        }
                        if (var485 == 2505) {
                            field777[var5++] = var87.field2763;
                            continue;
                        }
                    } else if (var485 < 2700) {
                        var5--;
                        class173 var88 = class173.method3152(field777[var5]);
                        if (var485 == 2600) {
                            field777[var5++] = var88.field2870;
                            continue;
                        }
                        if (var485 == 2601) {
                            field777[var5++] = var88.field2777;
                            continue;
                        }
                        if (var485 == 2602) {
                            field771[var6++] = var88.field2799;
                            continue;
                        }
                        if (var485 == 2603) {
                            field777[var5++] = var88.field2764;
                            continue;
                        }
                        if (var485 == 2604) {
                            field777[var5++] = var88.field2765;
                            continue;
                        }
                        if (var485 == 2605) {
                            field777[var5++] = var88.field2793;
                            continue;
                        }
                        if (var485 == 2606) {
                            field777[var5++] = var88.field2848;
                            continue;
                        }
                        if (var485 == 2607) {
                            field777[var5++] = var88.field2792;
                            continue;
                        }
                        if (var485 == 2608) {
                            field777[var5++] = var88.field2791;
                            continue;
                        }
                        if (var485 == 2609) {
                            field777[var5++] = var88.field2760;
                            continue;
                        }
                    } else if (var485 < 2800) {
                        if (var485 == 2700) {
                            var5--;
                            class173 var89 = class173.method3152(field777[var5]);
                            field777[var5++] = var89.field2859;
                            continue;
                        }
                        if (var485 == 2701) {
                            var5--;
                            class173 var90 = class173.method3152(field777[var5]);
                            if (var90.field2859 == -1) {
                                field777[var5++] = 0;
                            } else {
                                field777[var5++] = var90.field2860;
                            }
                            continue;
                        }
                        if (var485 == 2702) {
                            var5--;
                            int var91 = field777[var5];
                            class4 var92 = (class4) client.field368.method3559((long) var91);
                            if (var92 == null) {
                                field777[var5++] = 0;
                            } else {
                                field777[var5++] = 1;
                            }
                            continue;
                        }
                        if (var485 == 2706) {
                            field777[var5++] = client.field443;
                            continue;
                        }
                    } else if (var485 < 2900) {
                        var5--;
                        class173 var93 = class173.method3152(field777[var5]);
                        if (var485 == 2800) {
                            field777[var5++] = class178.method2950(client.method117(var93));
                            continue;
                        }
                        if (var485 == 2801) {
                            var5--;
                            int var94 = field777[var5];
                            int var487 = var94 - 1;
                            if (var93.field2803 != null && var487 < var93.field2803.length && var93.field2803[var487] != null) {
                                field771[var6++] = var93.field2803[var487];
                                continue;
                            }
                            field771[var6++] = "";
                            continue;
                        }
                        if (var485 == 2802) {
                            if (var93.field2812 == null) {
                                field771[var6++] = "";
                            } else {
                                field771[var6++] = var93.field2812;
                            }
                            continue;
                        }
                    } else if (var485 < 3200) {
                        if (var485 == 3100) {
                            var6--;
                            String var95 = field771[var6];
                            Statics.method78(0, "", var95);
                            continue;
                        }
                        if (var485 == 3101) {
                            var5 -= 2;
                            client.method3041(Statics.field2258, field777[var5], field777[var5 + 1]);
                            continue;
                        }
                        if (var485 == 3103) {
                            client.field556.method2587(175);
                            for (class4 var96 = (class4) client.field368.method3550(); var96 != null; var96 = (class4) client.field368.method3551()) {
                                if (var96.field55 == 0 || var96.field55 == 3) {
                                    client.method1458(var96, true);
                                }
                            }
                            if (client.field459 != null) {
                                client.method2258(client.field459);
                                client.field459 = null;
                            }
                            continue;
                        }
                        if (var485 == 3104) {
                            var6--;
                            String var97 = field771[var6];
                            int var98 = 0;
                            boolean var99 = class163.method2045(var97, 10, true);
                            if (var99) {
                                int var100 = class163.method2767(var97, 10, true);
                                var98 = var100;
                            }
                            client.field556.method2587(84);
                            client.field556.method2318(var98);
                            continue;
                        }
                        if (var485 == 3105) {
                            var6--;
                            String var101 = field771[var6];
                            client.field556.method2587(60);
                            client.field556.method2315(var101.length() + 1);
                            client.field556.method2321(var101);
                            continue;
                        }
                        if (var485 == 3106) {
                            var6--;
                            String var102 = field771[var6];
                            client.field556.method2587(158);
                            client.field556.method2315(var102.length() + 1);
                            client.field556.method2321(var102);
                            continue;
                        }
                        if (var485 == 3107) {
                            var5--;
                            int var103 = field777[var5];
                            var6--;
                            String var104 = field771[var6];
                            client.method167(var103, var104);
                            continue;
                        }
                        if (var485 == 3108) {
                            var5 -= 3;
                            int var105 = field777[var5];
                            int var106 = field777[var5 + 1];
                            int var107 = field777[var5 + 2];
                            class173 var108 = class173.method3152(var107);
                            client.method1208(var108, var105, var106);
                            continue;
                        }
                        if (var485 == 3109) {
                            var5 -= 2;
                            int var109 = field777[var5];
                            int var110 = field777[var5 + 1];
                            class173 var111 = var41 ? Statics.field776 : Statics.field781;
                            client.method1208(var111, var109, var110);
                            continue;
                        }
                        if (var485 == 3110) {
                            var5--;
                            Statics.field15 = field777[var5] == 1;
                            continue;
                        }
                        if (var485 == 3111) {
                            field777[var5++] = Statics.field1639.field127 ? 1 : 0;
                            continue;
                        }
                        if (var485 == 3112) {
                            var5--;
                            Statics.field1639.field127 = field777[var5] == 1;
                            class9.method40();
                            continue;
                        }
                        if (var485 == 3113) {
                            var6--;
                            String var112 = field771[var6];
                            var5--;
                            boolean var113 = field777[var5] == 1;
                            Statics.method705(var112, var113, "openjs", false);
                            continue;
                        }
                        if (var485 == 3115) {
                            var5--;
                            int var114 = field777[var5];
                            client.field556.method2587(39);
                            client.field556.method2316(var114);
                            continue;
                        }
                        if (var485 == 3116) {
                            var5--;
                            int var115 = field777[var5];
                            var6 -= 2;
                            String var116 = field771[var6];
                            String var117 = field771[var6 + 1];
                            if (var116.length() <= 500 && var117.length() <= 500) {
                                client.field556.method2587(204);
                                client.field556.method2316(1 + class119.method1950(var116) + class119.method1950(var117));
                                client.field556.method2321(var117);
                                client.field556.method2439(var115);
                                client.field556.method2321(var116);
                            }
                            continue;
                        }
                    } else if (var485 < 3300) {
                        if (var485 == 3200) {
                            var5 -= 3;
                            int var118 = field777[var5];
                            int var119 = field777[var5 + 1];
                            int var120 = field777[var5 + 2];
                            if (client.field474 != 0 && var119 != 0 && client.field525 < 50) {
                                client.field526[client.field525] = var118;
                                client.field318[client.field525] = var119;
                                client.field528[client.field525] = var120;
                                client.field330[client.field525] = null;
                                client.field319[client.field525] = 0;
                                client.field525++;
                            }
                            continue;
                        }
                        if (var485 == 3201) {
                            var5--;
                            int var121 = field777[var5];
                            if (var121 == -1 && !client.field422) {
                                class183.method3505();
                            } else if (var121 != -1 && client.field521 != var121 && client.field520 != 0 && !client.field422) {
                                class168 var122 = Statics.field216;
                                int var123 = client.field520;
                                class183.field2943 = 1;
                                Statics.field2941 = var122;
                                Statics.field2945 = var121;
                                Statics.field158 = 0;
                                Statics.field2946 = var123;
                                Statics.field2944 = false;
                                Statics.field722 = 2;
                            }
                            client.field521 = var121;
                            continue;
                        }
                        if (var485 == 3202) {
                            var5 -= 2;
                            client.method2031(field777[var5], field777[var5 + 1]);
                            continue;
                        }
                    } else if (var485 < 3400) {
                        if (var485 == 3300) {
                            field777[var5++] = client.field312;
                            continue;
                        }
                        if (var485 == 3301) {
                            var5 -= 2;
                            int var124 = field777[var5];
                            int var125 = field777[var5 + 1];
                            field777[var5++] = class16.method1043(var124, var125);
                            continue;
                        }
                        if (var485 == 3302) {
                            var5 -= 2;
                            int var126 = field777[var5];
                            int var127 = field777[var5 + 1];
                            field777[var5++] = class16.method551(var126, var127);
                            continue;
                        }
                        if (var485 == 3303) {
                            var5 -= 2;
                            int var128 = field777[var5];
                            int var129 = field777[var5 + 1];
                            int[] var130 = field777;
                            int var131 = var5++;
                            class16 var132 = (class16) class16.field217.method3559((long) var128);
                            int var133;
                            if (var132 == null) {
                                var133 = 0;
                            } else if (var129 == -1) {
                                var133 = 0;
                            } else {
                                int var134 = 0;
                                for (int var135 = 0; var135 < var132.field213.length; var135++) {
                                    if (var132.field212[var135] == var129) {
                                        var134 += var132.field213[var135];
                                    }
                                }
                                var133 = var134;
                            }
                            var130[var131] = var133;
                            continue;
                        }
                        if (var485 == 3304) {
                            var5--;
                            int var136 = field777[var5];
                            field777[var5++] = class51.method680(var136).field1080;
                            continue;
                        }
                        if (var485 == 3305) {
                            var5--;
                            int var137 = field777[var5];
                            field777[var5++] = client.field420[var137];
                            continue;
                        }
                        if (var485 == 3306) {
                            var5--;
                            int var138 = field777[var5];
                            field777[var5++] = client.field421[var138];
                            continue;
                        }
                        if (var485 == 3307) {
                            var5--;
                            int var139 = field777[var5];
                            field777[var5++] = client.field447[var139];
                            continue;
                        }
                        if (var485 == 3308) {
                            int var140 = Statics.field2108;
                            int var141 = (Statics.field2258.field818 >> 7) + Statics.field2725;
                            int var142 = (Statics.field2258.field788 >> 7) + Statics.field1887;
                            field777[var5++] = (var140 << 28) + (var141 << 14) + var142;
                            continue;
                        }
                        if (var485 == 3309) {
                            var5--;
                            int var143 = field777[var5];
                            field777[var5++] = var143 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var485 == 3310) {
                            var5--;
                            int var144 = field777[var5];
                            field777[var5++] = var144 >> 28;
                            continue;
                        }
                        if (var485 == 3311) {
                            var5--;
                            int var145 = field777[var5];
                            field777[var5++] = var145 & 0x3FFF;
                            continue;
                        }
                        if (var485 == 3312) {
                            field777[var5++] = client.field289 ? 1 : 0;
                            continue;
                        }
                        if (var485 == 3313) {
                            var5 -= 2;
                            int var146 = field777[var5] + 32768;
                            int var147 = field777[var5 + 1];
                            field777[var5++] = class16.method1043(var146, var147);
                            continue;
                        }
                        if (var485 == 3314) {
                            var5 -= 2;
                            int var148 = field777[var5] + 32768;
                            int var149 = field777[var5 + 1];
                            field777[var5++] = class16.method551(var148, var149);
                            continue;
                        }
                        if (var485 == 3315) {
                            var5 -= 2;
                            int var150 = field777[var5] + 32768;
                            int var151 = field777[var5 + 1];
                            int[] var152 = field777;
                            int var153 = var5++;
                            class16 var154 = (class16) class16.field217.method3559((long) var150);
                            int var155;
                            if (var154 == null) {
                                var155 = 0;
                            } else if (var151 == -1) {
                                var155 = 0;
                            } else {
                                int var156 = 0;
                                for (int var157 = 0; var157 < var154.field213.length; var157++) {
                                    if (var154.field212[var157] == var151) {
                                        var156 += var154.field213[var157];
                                    }
                                }
                                var155 = var156;
                            }
                            var152[var153] = var155;
                            continue;
                        }
                        if (var485 == 3316) {
                            if (client.field450 >= 2) {
                                field777[var5++] = client.field450;
                            } else {
                                field777[var5++] = 0;
                            }
                            continue;
                        }
                        if (var485 == 3317) {
                            field777[var5++] = client.field302;
                            continue;
                        }
                        if (var485 == 3318) {
                            field777[var5++] = client.field284;
                            continue;
                        }
                        if (var485 == 3321) {
                            field777[var5++] = client.field448;
                            continue;
                        }
                        if (var485 == 3322) {
                            field777[var5++] = client.field449;
                            continue;
                        }
                        if (var485 == 3323) {
                            if (client.field361) {
                                field777[var5++] = 1;
                            } else {
                                field777[var5++] = 0;
                            }
                            continue;
                        }
                        if (var485 == 3324) {
                            field777[var5++] = client.field406;
                            continue;
                        }
                    } else if (var485 < 3500) {
                        if (var485 == 3400) {
                            var5 -= 2;
                            int var158 = field777[var5];
                            int var159 = field777[var5 + 1];
                            class49 var160 = (class49) class49.field1058.method3510((long) var158);
                            class49 var161;
                            if (var160 == null) {
                                byte[] var162 = Statics.field1061.method3118(8, var158);
                                class49 var163 = new class49();
                                if (var162 != null) {
                                    var163.method947(new class119(var162));
                                }
                                class49.field1058.method3512(var163, (long) var158);
                                var161 = var163;
                            } else {
                                var161 = var160;
                            }
                            class49 var164 = var161;
                            if (var161.field1060 != 's') {
                            }
                            for (int var165 = 0; var165 < var164.field1063; var165++) {
                                if (var164.field1064[var165] == var159) {
                                    field771[var6++] = var164.field1062[var165];
                                    var164 = null;
                                    break;
                                }
                            }
                            if (var164 != null) {
                                field771[var6++] = var164.field1068;
                            }
                            continue;
                        }
                        if (var485 == 3408) {
                            var5 -= 4;
                            int var166 = field777[var5];
                            int var167 = field777[var5 + 1];
                            int var168 = field777[var5 + 2];
                            int var169 = field777[var5 + 3];
                            class49 var170 = (class49) class49.field1058.method3510((long) var168);
                            class49 var171;
                            if (var170 == null) {
                                byte[] var172 = Statics.field1061.method3118(8, var168);
                                class49 var173 = new class49();
                                if (var172 != null) {
                                    var173.method947(new class119(var172));
                                }
                                class49.field1058.method3512(var173, (long) var168);
                                var171 = var173;
                            } else {
                                var171 = var170;
                            }
                            class49 var174 = var171;
                            if (var171.field1066 == var166 && var171.field1060 == var167) {
                                for (int var175 = 0; var175 < var174.field1063; var175++) {
                                    if (var174.field1064[var175] == var169) {
                                        if (var167 == 115) {
                                            field771[var6++] = var174.field1062[var175];
                                        } else {
                                            field777[var5++] = var174.field1065[var175];
                                        }
                                        var174 = null;
                                        break;
                                    }
                                }
                                if (var174 != null) {
                                    if (var167 == 115) {
                                        field771[var6++] = var174.field1068;
                                    } else {
                                        field777[var5++] = var174.field1057;
                                    }
                                }
                                continue;
                            }
                            if (var167 == 115) {
                                field771[var6++] = "null";
                            } else {
                                field777[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var485 < 3700) {
                        if (var485 == 3600) {
                            if (client.field482 == 0) {
                                field777[var5++] = -2;
                            } else if (client.field482 == 1) {
                                field777[var5++] = -1;
                            } else {
                                field777[var5++] = client.field550;
                            }
                            continue;
                        }
                        if (var485 == 3601) {
                            var5--;
                            int var176 = field777[var5];
                            if (client.field482 == 2 && var176 < client.field550) {
                                field771[var6++] = client.field553[var176].field244;
                                field771[var6++] = client.field553[var176].field239;
                                continue;
                            }
                            field771[var6++] = "";
                            field771[var6++] = "";
                            continue;
                        }
                        if (var485 == 3602) {
                            var5--;
                            int var177 = field777[var5];
                            if (client.field482 == 2 && var177 < client.field550) {
                                field777[var5++] = client.field553[var177].field240;
                                continue;
                            }
                            field777[var5++] = 0;
                            continue;
                        }
                        if (var485 == 3603) {
                            var5--;
                            int var178 = field777[var5];
                            if (client.field482 == 2 && var178 < client.field550) {
                                field777[var5++] = client.field553[var178].field238;
                                continue;
                            }
                            field777[var5++] = 0;
                            continue;
                        }
                        if (var485 == 3604) {
                            var6--;
                            String var179 = field771[var6];
                            var5--;
                            int var180 = field777[var5];
                            client.field556.method2587(220);
                            client.field556.method2315(class119.method1950(var179) + 1);
                            client.field556.method2469(var180);
                            client.field556.method2321(var179);
                            continue;
                        }
                        if (var485 == 3605) {
                            var6--;
                            String var181 = field771[var6];
                            if (var181 == null) {
                                continue;
                            }
                            if ((client.field550 < 200 || client.field337 == 1) && client.field550 < 400) {
                                String var182 = class164.method57(var181, Statics.field1859);
                                if (var182 == null) {
                                    continue;
                                }
                                for (int var183 = 0; var183 < client.field550; var183++) {
                                    class18 var184 = client.field553[var183];
                                    String var185 = class164.method57(var184.field244, Statics.field1859);
                                    if (var185 != null && var185.equals(var182)) {
                                        Statics.method78(30, "", var181 + class157.field2458);
                                        continue label2975;
                                    }
                                    if (var184.field239 != null) {
                                        String var186 = class164.method57(var184.field239, Statics.field1859);
                                        if (var186 != null && var186.equals(var182)) {
                                            Statics.method78(30, "", var181 + class157.field2458);
                                            continue label2975;
                                        }
                                    }
                                }
                                for (int var187 = 0; var187 < client.field310; var187++) {
                                    class8 var188 = client.field385[var187];
                                    String var189 = class164.method57(var188.field121, Statics.field1859);
                                    if (var189 != null && var189.equals(var182)) {
                                        Statics.method78(30, "", class157.field2463 + var181 + class157.field2451);
                                        continue label2975;
                                    }
                                    if (var188.field119 != null) {
                                        String var190 = class164.method57(var188.field119, Statics.field1859);
                                        if (var190 != null && var190.equals(var182)) {
                                            Statics.method78(30, "", class157.field2463 + var181 + class157.field2451);
                                            continue label2975;
                                        }
                                    }
                                }
                                if (class164.method57(Statics.field2258.field41, Statics.field1859).equals(var182)) {
                                    Statics.method78(30, "", class157.field2298);
                                } else {
                                    client.field556.method2587(178);
                                    client.field556.method2315(class119.method1950(var181));
                                    client.field556.method2321(var181);
                                }
                                continue;
                            }
                            Statics.method78(30, "", class157.field2546);
                            continue;
                        }
                        if (var485 == 3606) {
                            var6--;
                            String var191 = field771[var6];
                            if (var191 == null) {
                                continue;
                            }
                            String var192 = class164.method57(var191, Statics.field1859);
                            if (var192 == null) {
                                continue;
                            }
                            int var193 = 0;
                            while (true) {
                                if (var193 >= client.field550) {
                                    continue label2975;
                                }
                                class18 var194 = client.field553[var193];
                                String var195 = var194.field244;
                                String var196 = class164.method57(var195, Statics.field1859);
                                if (class129.method2564(var191, var192, var195, var196)) {
                                    client.field550--;
                                    for (int var197 = var193; var197 < client.field550; var197++) {
                                        client.field553[var197] = client.field553[var197 + 1];
                                    }
                                    client.field476 = client.field468;
                                    client.field556.method2587(183);
                                    client.field556.method2315(class119.method1950(var191));
                                    client.field556.method2321(var191);
                                    continue label2975;
                                }
                                var193++;
                            }
                        }
                        if (var485 == 3607) {
                            var6--;
                            String var198 = field771[var6];
                            if (var198 == null) {
                                continue;
                            }
                            if ((client.field310 < 100 || client.field337 == 1) && client.field310 < 400) {
                                String var199 = class164.method57(var198, Statics.field1859);
                                if (var199 == null) {
                                    continue;
                                }
                                for (int var200 = 0; var200 < client.field310; var200++) {
                                    class8 var201 = client.field385[var200];
                                    String var202 = class164.method57(var201.field121, Statics.field1859);
                                    if (var202 != null && var202.equals(var199)) {
                                        Statics.method78(31, "", var198 + class157.field2367);
                                        continue label2975;
                                    }
                                    if (var201.field119 != null) {
                                        String var203 = class164.method57(var201.field119, Statics.field1859);
                                        if (var203 != null && var203.equals(var199)) {
                                            Statics.method78(31, "", var198 + class157.field2367);
                                            continue label2975;
                                        }
                                    }
                                }
                                for (int var204 = 0; var204 < client.field550; var204++) {
                                    class18 var205 = client.field553[var204];
                                    String var206 = class164.method57(var205.field244, Statics.field1859);
                                    if (var206 != null && var206.equals(var199)) {
                                        Statics.method78(31, "", class157.field2401 + var198 + class157.field2466);
                                        continue label2975;
                                    }
                                    if (var205.field239 != null) {
                                        String var207 = class164.method57(var205.field239, Statics.field1859);
                                        if (var207 != null && var207.equals(var199)) {
                                            Statics.method78(31, "", class157.field2401 + var198 + class157.field2466);
                                            continue label2975;
                                        }
                                    }
                                }
                                if (class164.method57(Statics.field2258.field41, Statics.field1859).equals(var199)) {
                                    Statics.method78(31, "", class157.field2333);
                                } else {
                                    client.field556.method2587(122);
                                    client.field556.method2315(class119.method1950(var198));
                                    client.field556.method2321(var198);
                                }
                                continue;
                            }
                            Statics.method78(31, "", class157.field2309);
                            continue;
                        }
                        if (var485 == 3608) {
                            var6--;
                            String var208 = field771[var6];
                            client.method3307(var208);
                            continue;
                        }
                        if (var485 == 3609) {
                            var6--;
                            String var209 = field771[var6];
                            class152[] var210 = new class152[] { class152.field2238, class152.field2236, class152.field2237, class152.field2239, class152.field2243 };
                            class152[] var211 = var210;
                            for (int var212 = 0; var212 < var211.length; var212++) {
                                class152 var213 = var211[var212];
                                if (var213.field2241 != -1) {
                                    int var215 = var213.field2241;
                                    String var216 = "<img=" + var215 + ">";
                                    if (var209.startsWith(var216)) {
                                        var209 = var209.substring(6 + Integer.toString(var213.field2241).length());
                                        break;
                                    }
                                }
                            }
                            field777[var5++] = client.method559(var209, false) ? 1 : 0;
                            continue;
                        }
                        if (var485 == 3611) {
                            if (client.field510 == null) {
                                field771[var6++] = "";
                            } else {
                                String[] var217 = field771;
                                int var218 = var6++;
                                String var219 = client.field510;
                                String var220 = Statics.method2625(class162.method1(var219));
                                if (var220 == null) {
                                    var220 = "";
                                }
                                var217[var218] = var220;
                            }
                            continue;
                        }
                        if (var485 == 3612) {
                            if (client.field510 == null) {
                                field777[var5++] = 0;
                            } else {
                                field777[var5++] = Statics.field605;
                            }
                            continue;
                        }
                        if (var485 == 3613) {
                            var5--;
                            int var222 = field777[var5];
                            if (client.field510 != null && var222 < Statics.field605) {
                                field771[var6++] = Statics.field172[var222].field617;
                                continue;
                            }
                            field771[var6++] = "";
                            continue;
                        }
                        if (var485 == 3614) {
                            var5--;
                            int var223 = field777[var5];
                            if (client.field510 != null && var223 < Statics.field605) {
                                field777[var5++] = Statics.field172[var223].field609;
                                continue;
                            }
                            field777[var5++] = 0;
                            continue;
                        }
                        if (var485 == 3615) {
                            var5--;
                            int var224 = field777[var5];
                            if (client.field510 != null && var224 < Statics.field605) {
                                field777[var5++] = Statics.field172[var224].field610;
                                continue;
                            }
                            field777[var5++] = 0;
                            continue;
                        }
                        if (var485 == 3616) {
                            field777[var5++] = Statics.field651;
                            continue;
                        }
                        if (var485 == 3617) {
                            var6--;
                            String var225 = field771[var6];
                            client.method528(var225);
                            continue;
                        }
                        if (var485 == 3618) {
                            field777[var5++] = Statics.field949;
                            continue;
                        }
                        if (var485 == 3619) {
                            var6--;
                            String var226 = field771[var6];
                            if (!var226.equals("")) {
                                client.field556.method2587(47);
                                client.field556.method2315(class119.method1950(var226));
                                client.field556.method2321(var226);
                            }
                            continue;
                        }
                        if (var485 == 3620) {
                            client.field556.method2587(47);
                            client.field556.method2315(0);
                            continue;
                        }
                        if (var485 == 3621) {
                            if (client.field482 == 0) {
                                field777[var5++] = -1;
                            } else {
                                field777[var5++] = client.field310;
                            }
                            continue;
                        }
                        if (var485 == 3622) {
                            var5--;
                            int var227 = field777[var5];
                            if (client.field482 != 0 && var227 < client.field310) {
                                field771[var6++] = client.field385[var227].field121;
                                field771[var6++] = client.field385[var227].field119;
                                continue;
                            }
                            field771[var6++] = "";
                            field771[var6++] = "";
                            continue;
                        }
                        if (var485 == 3623) {
                            String var228;
                            label2710: {
                                var6--;
                                var228 = field771[var6];
                                String var230 = "<img=0>";
                                if (!var228.startsWith(var230)) {
                                    String var232 = "<img=1>";
                                    if (!var228.startsWith(var232)) {
                                        break label2710;
                                    }
                                }
                                var228 = var228.substring(7);
                            }
                            field777[var5++] = client.method742(var228) ? 1 : 0;
                            continue;
                        }
                        if (var485 == 3624) {
                            var5--;
                            int var233 = field777[var5];
                            if (Statics.field172 != null && var233 < Statics.field605 && Statics.field172[var233].field617.equalsIgnoreCase(Statics.field2258.field41)) {
                                field777[var5++] = 1;
                                continue;
                            }
                            field777[var5++] = 0;
                            continue;
                        }
                        if (var485 == 3625) {
                            if (client.field511 == null) {
                                field771[var6++] = "";
                            } else {
                                String[] var234 = field771;
                                int var235 = var6++;
                                String var236 = client.field511;
                                String var237 = Statics.method2625(class162.method1(var236));
                                if (var237 == null) {
                                    var237 = "";
                                }
                                var234[var235] = var237;
                            }
                            continue;
                        }
                    } else if (var485 < 4000) {
                        if (var485 == 3903) {
                            var5--;
                            int var239 = field777[var5];
                            field777[var5++] = client.field438[var239].method3754();
                            continue;
                        }
                        if (var485 == 3904) {
                            var5--;
                            int var240 = field777[var5];
                            field777[var5++] = client.field438[var240].field3155;
                            continue;
                        }
                        if (var485 == 3905) {
                            var5--;
                            int var241 = field777[var5];
                            field777[var5++] = client.field438[var241].field3161;
                            continue;
                        }
                        if (var485 == 3906) {
                            var5--;
                            int var242 = field777[var5];
                            field777[var5++] = client.field438[var242].field3156;
                            continue;
                        }
                        if (var485 == 3907) {
                            var5--;
                            int var243 = field777[var5];
                            field777[var5++] = client.field438[var243].field3159;
                            continue;
                        }
                        if (var485 == 3908) {
                            var5--;
                            int var244 = field777[var5];
                            field777[var5++] = client.field438[var244].field3160;
                            continue;
                        }
                        if (var485 == 3910) {
                            var5--;
                            int var245 = field777[var5];
                            int var246 = client.field438[var245].method3753();
                            field777[var5++] = var246 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var485 == 3911) {
                            var5--;
                            int var247 = field777[var5];
                            int var248 = client.field438[var247].method3753();
                            field777[var5++] = var248 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var485 == 3912) {
                            var5--;
                            int var249 = field777[var5];
                            int var250 = client.field438[var249].method3753();
                            field777[var5++] = var250 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var485 == 3913) {
                            var5--;
                            int var251 = field777[var5];
                            int var252 = client.field438[var251].method3753();
                            field777[var5++] = var252 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var485 == 3914) {
                            var5--;
                            boolean var253 = field777[var5] == 1;
                            if (Statics.field257 != null) {
                                Statics.field257.method3766(class221.field3165, var253);
                            }
                            continue;
                        }
                        if (var485 == 3915) {
                            var5--;
                            boolean var254 = field777[var5] == 1;
                            if (Statics.field257 != null) {
                                Statics.field257.method3766(class221.field3164, var254);
                            }
                            continue;
                        }
                        if (var485 == 3916) {
                            var5 -= 2;
                            boolean var255 = field777[var5] == 1;
                            boolean var256 = field777[var5 + 1] == 1;
                            if (Statics.field257 != null) {
                                Statics.field257.method3766(new class22(var256), var255);
                            }
                            continue;
                        }
                        if (var485 == 3917) {
                            var5--;
                            boolean var257 = field777[var5] == 1;
                            if (Statics.field257 != null) {
                                Statics.field257.method3766(class221.field3163, var257);
                            }
                            continue;
                        }
                        if (var485 == 3918) {
                            var5--;
                            boolean var258 = field777[var5] == 1;
                            if (Statics.field257 != null) {
                                Statics.field257.method3766(class221.field3162, var258);
                            }
                            continue;
                        }
                        if (var485 == 3919) {
                            field777[var5++] = Statics.field257 == null ? 0 : Statics.field257.field3166.size();
                            continue;
                        }
                        if (var485 == 3920) {
                            var5--;
                            int var259 = field777[var5];
                            class214 var260 = (class214) Statics.field257.field3166.get(var259);
                            field777[var5++] = var260.field3144;
                            continue;
                        }
                        if (var485 == 3921) {
                            var5--;
                            int var261 = field777[var5];
                            class214 var262 = (class214) Statics.field257.field3166.get(var261);
                            field771[var6++] = var262.method3713();
                            continue;
                        }
                        if (var485 == 3922) {
                            var5--;
                            int var263 = field777[var5];
                            class214 var264 = (class214) Statics.field257.field3166.get(var263);
                            field771[var6++] = var264.method3714();
                            continue;
                        }
                        if (var485 == 3923) {
                            var5--;
                            int var265 = field777[var5];
                            class214 var266 = (class214) Statics.field257.field3166.get(var265);
                            long var267 = class115.method124() - Statics.field2107 - var266.field3139;
                            int var269 = (int) (var267 / 3600000L);
                            int var270 = (int) ((var267 - (long) (var269 * 3600000)) / 60000L);
                            int var271 = (int) ((var267 - (long) (var269 * 3600000) - (long) (var270 * 60000)) / 1000L);
                            String var272 = var269 + ":" + var270 / 10 + var270 % 10 + ":" + var271 / 10 + var271 % 10;
                            field771[var6++] = var272;
                            continue;
                        }
                        if (var485 == 3924) {
                            var5--;
                            int var273 = field777[var5];
                            class214 var274 = (class214) Statics.field257.field3166.get(var273);
                            field777[var5++] = var274.field3140.field3156;
                            continue;
                        }
                        if (var485 == 3925) {
                            var5--;
                            int var275 = field777[var5];
                            class214 var276 = (class214) Statics.field257.field3166.get(var275);
                            field777[var5++] = var276.field3140.field3161;
                            continue;
                        }
                        if (var485 == 3926) {
                            var5--;
                            int var277 = field777[var5];
                            class214 var278 = (class214) Statics.field257.field3166.get(var277);
                            field777[var5++] = var278.field3140.field3155;
                            continue;
                        }
                    } else if (var485 < 4100) {
                        if (var485 == 4000) {
                            var5 -= 2;
                            int var279 = field777[var5];
                            int var280 = field777[var5 + 1];
                            field777[var5++] = var279 + var280;
                            continue;
                        }
                        if (var485 == 4001) {
                            var5 -= 2;
                            int var281 = field777[var5];
                            int var282 = field777[var5 + 1];
                            field777[var5++] = var281 - var282;
                            continue;
                        }
                        if (var485 == 4002) {
                            var5 -= 2;
                            int var283 = field777[var5];
                            int var284 = field777[var5 + 1];
                            field777[var5++] = var283 * var284;
                            continue;
                        }
                        if (var485 == 4003) {
                            var5 -= 2;
                            int var285 = field777[var5];
                            int var286 = field777[var5 + 1];
                            field777[var5++] = var285 / var286;
                            continue;
                        }
                        if (var485 == 4004) {
                            var5--;
                            int var287 = field777[var5];
                            field777[var5++] = (int) (Math.random() * (double) var287);
                            continue;
                        }
                        if (var485 == 4005) {
                            var5--;
                            int var288 = field777[var5];
                            field777[var5++] = (int) (Math.random() * (double) (var288 + 1));
                            continue;
                        }
                        if (var485 == 4006) {
                            var5 -= 5;
                            int var289 = field777[var5];
                            int var290 = field777[var5 + 1];
                            int var291 = field777[var5 + 2];
                            int var292 = field777[var5 + 3];
                            int var293 = field777[var5 + 4];
                            field777[var5++] = (var290 - var289) * (var293 - var291) / (var292 - var291) + var289;
                            continue;
                        }
                        if (var485 == 4007) {
                            var5 -= 2;
                            int var294 = field777[var5];
                            int var295 = field777[var5 + 1];
                            field777[var5++] = var294 * var295 / 100 + var294;
                            continue;
                        }
                        if (var485 == 4008) {
                            var5 -= 2;
                            int var296 = field777[var5];
                            int var297 = field777[var5 + 1];
                            field777[var5++] = var296 | 0x1 << var297;
                            continue;
                        }
                        if (var485 == 4009) {
                            var5 -= 2;
                            int var298 = field777[var5];
                            int var299 = field777[var5 + 1];
                            field777[var5++] = var298 & -1 - (0x1 << var299);
                            continue;
                        }
                        if (var485 == 4010) {
                            var5 -= 2;
                            int var300 = field777[var5];
                            int var301 = field777[var5 + 1];
                            field777[var5++] = (var300 & 0x1 << var301) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var485 == 4011) {
                            var5 -= 2;
                            int var302 = field777[var5];
                            int var303 = field777[var5 + 1];
                            field777[var5++] = var302 % var303;
                            continue;
                        }
                        if (var485 == 4012) {
                            var5 -= 2;
                            int var304 = field777[var5];
                            int var305 = field777[var5 + 1];
                            if (var304 == 0) {
                                field777[var5++] = 0;
                            } else {
                                field777[var5++] = (int) Math.pow((double) var304, (double) var305);
                            }
                            continue;
                        }
                        if (var485 == 4013) {
                            var5 -= 2;
                            int var306 = field777[var5];
                            int var307 = field777[var5 + 1];
                            if (var306 == 0) {
                                field777[var5++] = 0;
                            } else if (var307 == 0) {
                                field777[var5++] = Integer.MAX_VALUE;
                            } else {
                                field777[var5++] = (int) Math.pow((double) var306, 1.0D / (double) var307);
                            }
                            continue;
                        }
                        if (var485 == 4014) {
                            var5 -= 2;
                            int var308 = field777[var5];
                            int var309 = field777[var5 + 1];
                            field777[var5++] = var308 & var309;
                            continue;
                        }
                        if (var485 == 4015) {
                            var5 -= 2;
                            int var310 = field777[var5];
                            int var311 = field777[var5 + 1];
                            field777[var5++] = var310 | var311;
                            continue;
                        }
                    } else if (var485 < 4200) {
                        if (var485 == 4100) {
                            var6--;
                            String var312 = field771[var6];
                            var5--;
                            int var313 = field777[var5];
                            field771[var6++] = var312 + var313;
                            continue;
                        }
                        if (var485 == 4101) {
                            var6 -= 2;
                            String var314 = field771[var6];
                            String var315 = field771[var6 + 1];
                            field771[var6++] = var314 + var315;
                            continue;
                        }
                        if (var485 == 4102) {
                            var6--;
                            String var316 = field771[var6];
                            var5--;
                            int var317 = field777[var5];
                            String[] var318 = field771;
                            int var319 = var6++;
                            String var321;
                            if (var317 < 0) {
                                var321 = Integer.toString(var317);
                            } else {
                                int var322 = var317;
                                String var323;
                                if (var317 < 0) {
                                    var323 = Integer.toString(var317, 10);
                                } else {
                                    int var324 = 2;
                                    int var325 = var317 / 10;
                                    while (var325 != 0) {
                                        var325 /= 10;
                                        var324++;
                                    }
                                    char[] var326 = new char[var324];
                                    var326[0] = '+';
                                    for (int var327 = var324 - 1; var327 > 0; var327--) {
                                        int var328 = var322;
                                        var322 /= 10;
                                        int var329 = var328 - var322 * 10;
                                        if (var329 >= 10) {
                                            var326[var327] = (char) (var329 + 87);
                                        } else {
                                            var326[var327] = (char) (var329 + 48);
                                        }
                                    }
                                    var323 = new String(var326);
                                }
                                var321 = var323;
                            }
                            var318[var319] = var316 + var321;
                            continue;
                        }
                        if (var485 == 4103) {
                            var6--;
                            String var330 = field771[var6];
                            field771[var6++] = var330.toLowerCase();
                            continue;
                        }
                        if (var485 == 4104) {
                            var5--;
                            int var331 = field777[var5];
                            long var332 = ((long) var331 + 11745L) * 86400000L;
                            field783.setTime(new Date(var332));
                            int var334 = field783.get(5);
                            int var335 = field783.get(2);
                            int var336 = field783.get(1);
                            field771[var6++] = var334 + "-" + field784[var335] + "-" + var336;
                            continue;
                        }
                        if (var485 == 4105) {
                            var6 -= 2;
                            String var337 = field771[var6];
                            String var338 = field771[var6 + 1];
                            if (Statics.field2258.field28 != null && Statics.field2258.field28.field2912) {
                                field771[var6++] = var338;
                                continue;
                            }
                            field771[var6++] = var337;
                            continue;
                        }
                        if (var485 == 4106) {
                            var5--;
                            int var339 = field777[var5];
                            field771[var6++] = Integer.toString(var339);
                            continue;
                        }
                        if (var485 == 4107) {
                            var6 -= 2;
                            int[] var340 = field777;
                            int var341 = var5++;
                            String var342 = field771[var6];
                            String var343 = field771[var6 + 1];
                            int var344 = client.field392;
                            int var345 = var342.length();
                            int var346 = var343.length();
                            int var347 = 0;
                            int var348 = 0;
                            char var349 = 0;
                            char var350 = 0;
                            int var351;
                            label2794: while (true) {
                                if (var347 - var349 >= var345 && var348 - var350 >= var346) {
                                    int var360 = Math.min(var345, var346);
                                    for (int var361 = 0; var361 < var360; var361++) {
                                        char var364 = var342.charAt(var361);
                                        char var365 = var343.charAt(var361);
                                        if (var364 != var365 && Character.toUpperCase(var364) != Character.toUpperCase(var365)) {
                                            char var366 = Character.toLowerCase(var364);
                                            char var367 = Character.toLowerCase(var365);
                                            if (var366 != var367) {
                                                var351 = class166.method3711(var366, var344) - class166.method3711(var367, var344);
                                                break label2794;
                                            }
                                        }
                                    }
                                    int var368 = var345 - var346;
                                    if (var368 == 0) {
                                        for (int var369 = 0; var369 < var360; var369++) {
                                            char var370 = var342.charAt(var369);
                                            char var371 = var343.charAt(var369);
                                            if (var370 != var371) {
                                                var351 = class166.method3711(var370, var344) - class166.method3711(var371, var344);
                                                break label2794;
                                            }
                                        }
                                        var351 = 0;
                                    } else {
                                        var351 = var368;
                                    }
                                    break;
                                }
                                if (var347 - var349 >= var345) {
                                    var351 = -1;
                                    break;
                                }
                                if (var348 - var350 >= var346) {
                                    var351 = 1;
                                    break;
                                }
                                char var352;
                                if (var349 == 0) {
                                    var352 = var342.charAt(var347++);
                                } else {
                                    var352 = var349;
                                    boolean var353 = false;
                                }
                                char var354;
                                if (var350 == 0) {
                                    var354 = var343.charAt(var348++);
                                } else {
                                    var354 = var350;
                                    boolean var355 = false;
                                }
                                var349 = class166.method80(var352);
                                var350 = class166.method80(var354);
                                char var356 = class166.method820(var352, var344);
                                char var357 = class166.method820(var354, var344);
                                if (var356 != var357 && Character.toUpperCase(var356) != Character.toUpperCase(var357)) {
                                    char var358 = Character.toLowerCase(var356);
                                    char var359 = Character.toLowerCase(var357);
                                    if (var358 != var359) {
                                        var351 = class166.method3711(var358, var344) - class166.method3711(var359, var344);
                                        break;
                                    }
                                }
                            }
                            byte var373;
                            if (var351 > 0) {
                                var373 = 1;
                            } else if (var351 < 0) {
                                var373 = -1;
                            } else {
                                var373 = 0;
                            }
                            var340[var341] = var373;
                            continue;
                        }
                        if (var485 == 4108) {
                            var6--;
                            String var374 = field771[var6];
                            var5 -= 2;
                            int var375 = field777[var5];
                            int var376 = field777[var5 + 1];
                            byte[] var377 = Statics.field1040.method3118(var376, 0);
                            class224 var378 = new class224(var377);
                            field777[var5++] = var378.method3784(var374, var375);
                            continue;
                        }
                        if (var485 == 4109) {
                            var6--;
                            String var379 = field771[var6];
                            var5 -= 2;
                            int var380 = field777[var5];
                            int var381 = field777[var5 + 1];
                            byte[] var382 = Statics.field1040.method3118(var381, 0);
                            class224 var383 = new class224(var382);
                            field777[var5++] = var383.method3783(var379, var380);
                            continue;
                        }
                        if (var485 == 4110) {
                            var6 -= 2;
                            String var384 = field771[var6];
                            String var385 = field771[var6 + 1];
                            var5--;
                            if (field777[var5] == 1) {
                                field771[var6++] = var384;
                            } else {
                                field771[var6++] = var385;
                            }
                            continue;
                        }
                        if (var485 == 4111) {
                            var6--;
                            String var386 = field771[var6];
                            field771[var6++] = class223.method3856(var386);
                            continue;
                        }
                        if (var485 == 4112) {
                            var6--;
                            String var387 = field771[var6];
                            var5--;
                            int var388 = field777[var5];
                            field771[var6++] = var387 + (char) var388;
                            continue;
                        }
                        if (var485 == 4113) {
                            var5--;
                            int var389 = field777[var5];
                            field777[var5++] = class163.method555((char) var389) ? 1 : 0;
                            continue;
                        }
                        if (var485 == 4114) {
                            var5--;
                            int var390 = field777[var5];
                            field777[var5++] = class163.method2257((char) var390) ? 1 : 0;
                            continue;
                        }
                        if (var485 == 4115) {
                            var5--;
                            int var391 = field777[var5];
                            field777[var5++] = class163.method2740((char) var391) ? 1 : 0;
                            continue;
                        }
                        if (var485 == 4116) {
                            var5--;
                            int var392 = field777[var5];
                            int[] var393 = field777;
                            int var394 = var5++;
                            char var395 = (char) var392;
                            boolean var396 = var395 >= '0' && var395 <= '9';
                            var393[var394] = var396 ? 1 : 0;
                            continue;
                        }
                        if (var485 == 4117) {
                            var6--;
                            String var397 = field771[var6];
                            if (var397 == null) {
                                field777[var5++] = 0;
                            } else {
                                field777[var5++] = var397.length();
                            }
                            continue;
                        }
                        if (var485 == 4118) {
                            var6--;
                            String var398 = field771[var6];
                            var5 -= 2;
                            int var399 = field777[var5];
                            int var400 = field777[var5 + 1];
                            field771[var6++] = var398.substring(var399, var400);
                            continue;
                        }
                        if (var485 == 4119) {
                            var6--;
                            String var401 = field771[var6];
                            StringBuilder var402 = new StringBuilder(var401.length());
                            boolean var403 = false;
                            for (int var404 = 0; var404 < var401.length(); var404++) {
                                char var405 = var401.charAt(var404);
                                if (var405 == '<') {
                                    var403 = true;
                                } else if (var405 == '>') {
                                    var403 = false;
                                } else if (!var403) {
                                    var402.append(var405);
                                }
                            }
                            field771[var6++] = var402.toString();
                            continue;
                        }
                        if (var485 == 4120) {
                            var6--;
                            String var406 = field771[var6];
                            var5--;
                            int var407 = field777[var5];
                            field777[var5++] = var406.indexOf(var407);
                            continue;
                        }
                        if (var485 == 4121) {
                            var6 -= 2;
                            String var408 = field771[var6];
                            String var409 = field771[var6 + 1];
                            var5--;
                            int var410 = field777[var5];
                            field777[var5++] = var408.indexOf(var409, var410);
                            continue;
                        }
                    } else if (var485 < 4300) {
                        if (var485 == 4200) {
                            var5--;
                            int var411 = field777[var5];
                            field771[var6++] = class52.method2522(var411).field1131;
                            continue;
                        }
                        if (var485 == 4201) {
                            var5 -= 2;
                            int var412 = field777[var5];
                            int var413 = field777[var5 + 1];
                            class52 var414 = class52.method2522(var412);
                            if (var413 >= 1 && var413 <= 5 && var414.field1094[var413 - 1] != null) {
                                field771[var6++] = var414.field1094[var413 - 1];
                                continue;
                            }
                            field771[var6++] = "";
                            continue;
                        }
                        if (var485 == 4202) {
                            var5 -= 2;
                            int var415 = field777[var5];
                            int var416 = field777[var5 + 1];
                            class52 var417 = class52.method2522(var415);
                            if (var416 >= 1 && var416 <= 5 && var417.field1109[var416 - 1] != null) {
                                field771[var6++] = var417.field1109[var416 - 1];
                                continue;
                            }
                            field771[var6++] = "";
                            continue;
                        }
                        if (var485 == 4203) {
                            var5--;
                            int var418 = field777[var5];
                            field777[var5++] = class52.method2522(var418).field1106;
                            continue;
                        }
                        if (var485 == 4204) {
                            var5--;
                            int var419 = field777[var5];
                            field777[var5++] = class52.method2522(var419).field1105 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var485 == 4205) {
                            var5--;
                            int var420 = field777[var5];
                            class52 var421 = class52.method2522(var420);
                            if (var421.field1093 == -1 && var421.field1124 >= 0) {
                                field777[var5++] = var421.field1124;
                                continue;
                            }
                            field777[var5++] = var420;
                            continue;
                        }
                        if (var485 == 4206) {
                            var5--;
                            int var422 = field777[var5];
                            class52 var423 = class52.method2522(var422);
                            if (var423.field1093 >= 0 && var423.field1124 >= 0) {
                                field777[var5++] = var423.field1124;
                                continue;
                            }
                            field777[var5++] = var422;
                            continue;
                        }
                        if (var485 == 4207) {
                            var5--;
                            int var424 = field777[var5];
                            field777[var5++] = class52.method2522(var424).field1107 ? 1 : 0;
                            continue;
                        }
                        if (var485 == 4210) {
                            var6--;
                            String var425 = field771[var6];
                            var5--;
                            int var426 = field777[var5];
                            client.method2961(var425, var426 == 1);
                            field777[var5++] = Statics.field2144;
                            continue;
                        }
                        if (var485 == 4211) {
                            if (Statics.field219 != null && Statics.field700 < Statics.field2144) {
                                field777[var5++] = Statics.field219[++Statics.field700 - 1] & 0xFFFF;
                                continue;
                            }
                            field777[var5++] = -1;
                            continue;
                        }
                        if (var485 == 4212) {
                            Statics.field700 = 0;
                            continue;
                        }
                    } else if (var485 < 5100) {
                        if (var485 == 5000) {
                            field777[var5++] = client.field463;
                            continue;
                        }
                        if (var485 == 5001) {
                            var5 -= 3;
                            client.field463 = field777[var5];
                            int var427 = field777[var5 + 1];
                            class130[] var428 = class130.method181();
                            int var429 = 0;
                            class130 var431;
                            while (true) {
                                if (var429 >= var428.length) {
                                    var431 = null;
                                    break;
                                }
                                class130 var430 = var428[var429];
                                if (var430.field2018 == var427) {
                                    var431 = var430;
                                    break;
                                }
                                var429++;
                            }
                            Statics.field189 = var431;
                            if (Statics.field189 == null) {
                                Statics.field189 = class130.field2017;
                            }
                            client.field502 = field777[var5 + 2];
                            client.field556.method2587(221);
                            client.field556.method2315(client.field463);
                            client.field556.method2315(Statics.field189.field2018);
                            client.field556.method2315(client.field502);
                            continue;
                        }
                        if (var485 == 5002) {
                            var6--;
                            String var432 = field771[var6];
                            var5 -= 2;
                            int var433 = field777[var5];
                            int var434 = field777[var5 + 1];
                            client.field556.method2587(255);
                            client.field556.method2315(class119.method1950(var432) + 2);
                            client.field556.method2321(var432);
                            client.field556.method2315(var433 - 1);
                            client.field556.method2315(var434);
                            continue;
                        }
                        if (var485 == 5003) {
                            var5 -= 2;
                            int var435 = field777[var5];
                            int var436 = field777[var5 + 1];
                            class28 var437 = (class28) class12.field162.get(var435);
                            class36 var438 = var437.method598(var436);
                            if (var438 == null) {
                                field777[var5++] = -1;
                                field777[var5++] = 0;
                                field771[var6++] = "";
                                field771[var6++] = "";
                                field771[var6++] = "";
                            } else {
                                field777[var5++] = var438.field765;
                                field777[var5++] = var438.field760;
                                field771[var6++] = var438.field762 == null ? "" : var438.field762;
                                field771[var6++] = var438.field763 == null ? "" : var438.field763;
                                field771[var6++] = var438.field764 == null ? "" : var438.field764;
                            }
                            continue;
                        }
                        if (var485 == 5004) {
                            var5--;
                            int var440 = field777[var5];
                            class36 var441 = (class36) class12.field161.method3564((long) var440);
                            if (var441 == null) {
                                field777[var5++] = -1;
                                field777[var5++] = 0;
                                field771[var6++] = "";
                                field771[var6++] = "";
                                field771[var6++] = "";
                            } else {
                                field777[var5++] = var441.field761;
                                field777[var5++] = var441.field760;
                                field771[var6++] = var441.field762 == null ? "" : var441.field762;
                                field771[var6++] = var441.field763 == null ? "" : var441.field763;
                                field771[var6++] = var441.field764 == null ? "" : var441.field764;
                            }
                            continue;
                        }
                        if (var485 == 5005) {
                            if (Statics.field189 == null) {
                                field777[var5++] = -1;
                            } else {
                                field777[var5++] = Statics.field189.field2018;
                            }
                            continue;
                        }
                        if (var485 == 5008) {
                            var6--;
                            String var443 = field771[var6];
                            var5--;
                            int var444 = field777[var5];
                            String var445 = var443.toLowerCase();
                            byte var446 = 0;
                            if (var445.startsWith(class157.field2343)) {
                                var446 = 0;
                                var443 = var443.substring(class157.field2343.length());
                            } else if (var445.startsWith(class157.field2342)) {
                                var446 = 1;
                                var443 = var443.substring(class157.field2342.length());
                            } else if (var445.startsWith(class157.field2295)) {
                                var446 = 2;
                                var443 = var443.substring(class157.field2295.length());
                            } else if (var445.startsWith(class157.field2473)) {
                                var446 = 3;
                                var443 = var443.substring(class157.field2473.length());
                            } else if (var445.startsWith(class157.field2475)) {
                                var446 = 4;
                                var443 = var443.substring(class157.field2475.length());
                            } else if (var445.startsWith(class157.field2460)) {
                                var446 = 5;
                                var443 = var443.substring(class157.field2460.length());
                            } else if (var445.startsWith(class157.field2479)) {
                                var446 = 6;
                                var443 = var443.substring(class157.field2479.length());
                            } else if (var445.startsWith(class157.field2327)) {
                                var446 = 7;
                                var443 = var443.substring(class157.field2327.length());
                            } else if (var445.startsWith(class157.field2483)) {
                                var446 = 8;
                                var443 = var443.substring(class157.field2483.length());
                            } else if (var445.startsWith(class157.field2485)) {
                                var446 = 9;
                                var443 = var443.substring(class157.field2485.length());
                            } else if (var445.startsWith(class157.field2487)) {
                                var446 = 10;
                                var443 = var443.substring(class157.field2487.length());
                            } else if (var445.startsWith(class157.field2556)) {
                                var446 = 11;
                                var443 = var443.substring(class157.field2556.length());
                            } else if (client.field392 != 0) {
                                if (var445.startsWith(class157.field2468)) {
                                    var446 = 0;
                                    var443 = var443.substring(class157.field2468.length());
                                } else if (var445.startsWith(class157.field2564)) {
                                    var446 = 1;
                                    var443 = var443.substring(class157.field2564.length());
                                } else if (var445.startsWith(class157.field2472)) {
                                    var446 = 2;
                                    var443 = var443.substring(class157.field2472.length());
                                } else if (var445.startsWith(class157.field2457)) {
                                    var446 = 3;
                                    var443 = var443.substring(class157.field2457.length());
                                } else if (var445.startsWith(class157.field2540)) {
                                    var446 = 4;
                                    var443 = var443.substring(class157.field2540.length());
                                } else if (var445.startsWith(class157.field2478)) {
                                    var446 = 5;
                                    var443 = var443.substring(class157.field2478.length());
                                } else if (var445.startsWith(class157.field2480)) {
                                    var446 = 6;
                                    var443 = var443.substring(class157.field2480.length());
                                } else if (var445.startsWith(class157.field2482)) {
                                    var446 = 7;
                                    var443 = var443.substring(class157.field2482.length());
                                } else if (var445.startsWith(class157.field2484)) {
                                    var446 = 8;
                                    var443 = var443.substring(class157.field2484.length());
                                } else if (var445.startsWith(class157.field2515)) {
                                    var446 = 9;
                                    var443 = var443.substring(class157.field2515.length());
                                } else if (var445.startsWith(class157.field2488)) {
                                    var446 = 10;
                                    var443 = var443.substring(class157.field2488.length());
                                } else if (var445.startsWith(class157.field2490)) {
                                    var446 = 11;
                                    var443 = var443.substring(class157.field2490.length());
                                }
                            }
                            String var447 = var443.toLowerCase();
                            byte var448 = 0;
                            if (var447.startsWith(class157.field2355)) {
                                var448 = 1;
                                var443 = var443.substring(class157.field2355.length());
                            } else if (var447.startsWith(class157.field2493)) {
                                var448 = 2;
                                var443 = var443.substring(class157.field2493.length());
                            } else if (var447.startsWith(class157.field2385)) {
                                var448 = 3;
                                var443 = var443.substring(class157.field2385.length());
                            } else if (var447.startsWith(class157.field2497)) {
                                var448 = 4;
                                var443 = var443.substring(class157.field2497.length());
                            } else if (var447.startsWith(class157.field2499)) {
                                var448 = 5;
                                var443 = var443.substring(class157.field2499.length());
                            } else if (client.field392 != 0) {
                                if (var447.startsWith(class157.field2492)) {
                                    var448 = 1;
                                    var443 = var443.substring(class157.field2492.length());
                                } else if (var447.startsWith(class157.field2494)) {
                                    var448 = 2;
                                    var443 = var443.substring(class157.field2494.length());
                                } else if (var447.startsWith(class157.field2496)) {
                                    var448 = 3;
                                    var443 = var443.substring(class157.field2496.length());
                                } else if (var447.startsWith(class157.field2498)) {
                                    var448 = 4;
                                    var443 = var443.substring(class157.field2498.length());
                                } else if (var447.startsWith(class157.field2500)) {
                                    var448 = 5;
                                    var443 = var443.substring(class157.field2500.length());
                                }
                            }
                            client.field556.method2587(152);
                            client.field556.method2315(0);
                            int var449 = client.field556.field1949;
                            client.field556.method2315(var444);
                            client.field556.method2315(var446);
                            client.field556.method2315(var448);
                            class222.method3503(client.field556, var443);
                            client.field556.method2327(client.field556.field1949 - var449);
                            continue;
                        }
                        if (var485 == 5009) {
                            var6 -= 2;
                            String var450 = field771[var6];
                            String var451 = field771[var6 + 1];
                            client.field556.method2587(150);
                            client.field556.method2316(0);
                            int var452 = client.field556.field1949;
                            client.field556.method2321(var450);
                            class222.method3503(client.field556, var451);
                            client.field556.method2326(client.field556.field1949 - var452);
                            continue;
                        }
                        if (var485 == 5015) {
                            String var453;
                            if (Statics.field2258 == null || Statics.field2258.field41 == null) {
                                var453 = "";
                            } else {
                                var453 = Statics.field2258.field41;
                            }
                            field771[var6++] = var453;
                            continue;
                        }
                        if (var485 == 5016) {
                            field777[var5++] = client.field502;
                            continue;
                        }
                        if (var485 == 5017) {
                            var5--;
                            int var454 = field777[var5];
                            int[] var455 = field777;
                            int var456 = var5++;
                            class28 var457 = (class28) class12.field162.get(var454);
                            int var458;
                            if (var457 == null) {
                                var458 = 0;
                            } else {
                                var458 = var457.method600();
                            }
                            var455[var456] = var458;
                            continue;
                        }
                        if (var485 == 5018) {
                            var5--;
                            int var459 = field777[var5];
                            field777[var5++] = class12.method1456(var459);
                            continue;
                        }
                        if (var485 == 5019) {
                            var5--;
                            int var460 = field777[var5];
                            field777[var5++] = class12.method2130(var460);
                            continue;
                        }
                        if (var485 == 5020) {
                            var6--;
                            String var461 = field771[var6];
                            client.method151(var461);
                            continue;
                        }
                        if (var485 == 5021) {
                            var6--;
                            client.field503 = field771[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var485 == 5022) {
                            field771[var6++] = client.field503;
                            continue;
                        }
                    }
                } else {
                    class173 var69;
                    if (var485 >= 2000) {
                        var485 -= 1000;
                        var5--;
                        var69 = class173.method3152(field777[var5]);
                    } else {
                        var69 = var41 ? Statics.field776 : Statics.field781;
                    }
                    if (var485 == 1300) {
                        var5--;
                        int var70 = field777[var5] - 1;
                        if (var70 >= 0 && var70 <= 9) {
                            var6--;
                            var69.method3200(var70, field771[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var485 == 1301) {
                        var5 -= 2;
                        int var71 = field777[var5];
                        int var72 = field777[var5 + 1];
                        var69.field2814 = class173.method2132(var71, var72);
                        continue;
                    }
                    if (var485 == 1302) {
                        var5--;
                        var69.field2817 = field777[var5] == 1;
                        continue;
                    }
                    if (var485 == 1303) {
                        var5--;
                        var69.field2815 = field777[var5];
                        continue;
                    }
                    if (var485 == 1304) {
                        var5--;
                        var69.field2816 = field777[var5];
                        continue;
                    }
                    if (var485 == 1305) {
                        var6--;
                        var69.field2812 = field771[var6];
                        continue;
                    }
                    if (var485 == 1306) {
                        var6--;
                        var69.field2735 = field771[var6];
                        continue;
                    }
                    if (var485 == 1307) {
                        var69.field2803 = null;
                        continue;
                    }
                }
                if (var485 < 5400) {
                    if (var485 == 5306) {
                        field777[var5++] = client.method227();
                        continue;
                    }
                    if (var485 == 5307) {
                        var5--;
                        int var462 = field777[var5];
                        if (var462 == 1 || var462 == 2) {
                            client.method2215(var462);
                        }
                        continue;
                    }
                    if (var485 == 5308) {
                        field777[var5++] = Statics.field1639.field129;
                        continue;
                    }
                    if (var485 == 5309) {
                        var5--;
                        int var463 = field777[var5];
                        if (var463 == 1 || var463 == 2) {
                            Statics.field1639.field129 = var463;
                            class9.method40();
                        }
                        continue;
                    }
                }
                if (var485 < 5600) {
                    if (var485 == 5504) {
                        var5 -= 2;
                        int var464 = field777[var5];
                        int var465 = field777[var5 + 1];
                        if (!client.field531) {
                            client.field369 = var464;
                            client.field370 = var465;
                        }
                        continue;
                    }
                    if (var485 == 5505) {
                        field777[var5++] = client.field369;
                        continue;
                    }
                    if (var485 == 5506) {
                        field777[var5++] = client.field370;
                        continue;
                    }
                    if (var485 == 5530) {
                        var5--;
                        int var466 = field777[var5];
                        if (var466 < 0) {
                            var466 = 0;
                        }
                        client.field375 = var466;
                        continue;
                    }
                    if (var485 == 5531) {
                        field777[var5++] = client.field375;
                        continue;
                    }
                }
                if (var485 >= 5700 || var485 != 5630) {
                    if (var485 < 6300) {
                        if (var485 == 6200) {
                            var5 -= 2;
                            client.field537 = (short) field777[var5];
                            if (client.field537 <= 0) {
                                client.field537 = 256;
                            }
                            client.field400 = (short) field777[var5 + 1];
                            if (client.field400 <= 0) {
                                client.field400 = 205;
                            }
                            continue;
                        }
                        if (var485 == 6201) {
                            var5 -= 2;
                            client.field539 = (short) field777[var5];
                            if (client.field539 <= 0) {
                                client.field539 = 256;
                            }
                            client.field540 = (short) field777[var5 + 1];
                            if (client.field540 <= 0) {
                                client.field540 = 320;
                            }
                            continue;
                        }
                        if (var485 == 6202) {
                            var5 -= 4;
                            client.field541 = (short) field777[var5];
                            if (client.field541 <= 0) {
                                client.field541 = 1;
                            }
                            client.field354 = (short) field777[var5 + 1];
                            if (client.field354 <= 0) {
                                client.field354 = 32767;
                            } else if (client.field354 < client.field541) {
                                client.field354 = client.field541;
                            }
                            client.field543 = (short) field777[var5 + 2];
                            if (client.field543 <= 0) {
                                client.field543 = 1;
                            }
                            client.field524 = (short) field777[var5 + 3];
                            if (client.field524 <= 0) {
                                client.field524 = 32767;
                            } else if (client.field524 < client.field543) {
                                client.field524 = client.field543;
                            }
                            continue;
                        }
                        if (var485 == 6203) {
                            if (client.field455 == null) {
                                field777[var5++] = -1;
                                field777[var5++] = -1;
                            } else {
                                client.method399(0, 0, client.field455.field2756, client.field455.field2811, false);
                                field777[var5++] = client.field547;
                                field777[var5++] = client.field410;
                            }
                            continue;
                        }
                        if (var485 == 6204) {
                            field777[var5++] = client.field539;
                            field777[var5++] = client.field540;
                            continue;
                        }
                        if (var485 == 6205) {
                            field777[var5++] = client.field537;
                            field777[var5++] = client.field400;
                            continue;
                        }
                    }
                    if (var485 < 6600) {
                        if (var485 == 6500) {
                            field777[var5++] = class26.method175() ? 1 : 0;
                            continue;
                        }
                        if (var485 == 6501) {
                            class26.field630 = 0;
                            class26 var467;
                            if (class26.field630 < class26.field622) {
                                var467 = Statics.field3197[++class26.field630 - 1];
                            } else {
                                var467 = null;
                            }
                            if (var467 == null) {
                                field777[var5++] = -1;
                                field777[var5++] = 0;
                                field771[var6++] = "";
                                field777[var5++] = 0;
                                field777[var5++] = 0;
                                field771[var6++] = "";
                            } else {
                                field777[var5++] = var467.field626;
                                field777[var5++] = var467.field627;
                                field771[var6++] = var467.field628;
                                field777[var5++] = var467.field631;
                                field777[var5++] = var467.field632;
                                field771[var6++] = var467.field629;
                            }
                            continue;
                        }
                        if (var485 == 6502) {
                            class26 var470;
                            if (class26.field630 < class26.field622) {
                                var470 = Statics.field3197[++class26.field630 - 1];
                            } else {
                                var470 = null;
                            }
                            if (var470 == null) {
                                field777[var5++] = -1;
                                field777[var5++] = 0;
                                field771[var6++] = "";
                                field777[var5++] = 0;
                                field777[var5++] = 0;
                                field771[var6++] = "";
                            } else {
                                field777[var5++] = var470.field626;
                                field777[var5++] = var470.field627;
                                field771[var6++] = var470.field628;
                                field777[var5++] = var470.field631;
                                field777[var5++] = var470.field632;
                                field771[var6++] = var470.field629;
                            }
                            continue;
                        }
                        if (var485 == 6506) {
                            var5--;
                            int var472 = field777[var5];
                            class26 var473 = null;
                            for (int var474 = 0; var474 < class26.field622; var474++) {
                                if (Statics.field3197[var474].field626 == var472) {
                                    var473 = Statics.field3197[var474];
                                    break;
                                }
                            }
                            if (var473 == null) {
                                field777[var5++] = -1;
                                field777[var5++] = 0;
                                field771[var6++] = "";
                                field777[var5++] = 0;
                                field777[var5++] = 0;
                                field771[var6++] = "";
                            } else {
                                field777[var5++] = var473.field626;
                                field777[var5++] = var473.field627;
                                field771[var6++] = var473.field628;
                                field777[var5++] = var473.field631;
                                field777[var5++] = var473.field632;
                                field771[var6++] = var473.field629;
                            }
                            continue;
                        }
                        if (var485 == 6507) {
                            var5 -= 4;
                            int var475 = field777[var5];
                            boolean var476 = field777[var5 + 1] == 1;
                            int var477 = field777[var5 + 2];
                            boolean var478 = field777[var5 + 3] == 1;
                            if (Statics.field3197 != null) {
                                class26.method2047(0, Statics.field3197.length - 1, var475, var476, var477, var478);
                            }
                            continue;
                        }
                        if (var485 == 6511) {
                            var5--;
                            int var479 = field777[var5];
                            if (var479 >= 0 && var479 < class26.field622) {
                                class26 var480 = Statics.field3197[var479];
                                field777[var5++] = var480.field626;
                                field777[var5++] = var480.field627;
                                field771[var6++] = var480.field628;
                                field777[var5++] = var480.field631;
                                field777[var5++] = var480.field632;
                                field771[var6++] = var480.field629;
                                continue;
                            }
                            field777[var5++] = -1;
                            field777[var5++] = 0;
                            field771[var6++] = "";
                            field777[var5++] = 0;
                            field777[var5++] = 0;
                            field771[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field281 = 250;
            }
        } catch (Exception var484) {
            StringBuilder var482 = new StringBuilder(30);
            var482.append("").append(var4.field3111).append(" ");
            for (int var483 = field779 - 1; var483 >= 0; var483--) {
                var482.append("").append(field780[var483].field207.field3111).append(" ");
            }
            var482.append("").append(var10);
            class148.method725(var482.toString(), var484);
        }
    }

    @ObfuscatedName("fl.h(IB)V")
    public static void method3012(int arg0) {
        if (arg0 == -1 || !class173.method121(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2838[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2759 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field14 = var3.field2759;
                method170(var4, 2000000);
            }
        }
    }
}
