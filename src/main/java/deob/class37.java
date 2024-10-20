package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ai")
public class class37 {

    @ObfuscatedName("ai.y")
    public static int[] field802 = new int[5];

    @ObfuscatedName("ai.w")
    public static int[][] field806 = new int[5][5000];

    @ObfuscatedName("ai.u")
    public static int[] field819 = new int[1000];

    @ObfuscatedName("ai.a")
    public static String[] field807 = new String[1000];

    @ObfuscatedName("ai.e")
    public static int field810 = 0;

    @ObfuscatedName("ai.b")
    public static class15[] field808 = new class15[50];

    @ObfuscatedName("ai.x")
    public static Calendar field812 = Calendar.getInstance();

    @ObfuscatedName("ai.k")
    public static final String[] field813 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ai.n")
    public static int field814 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.d(Ld;I)V")
    public static void method728(class1 arg0) {
        method2672(arg0, 200000);
    }

    @ObfuscatedName("ds.p(Ld;II)V")
    public static void method2672(class1 arg0, int arg1) {
        Object[] var2 = arg0.field4;
        int var3 = (Integer) var2[0];
        class23 var4 = Statics.method96(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field584;
        int[] var9 = var4.field592;
        byte var10 = -1;
        field810 = 0;
        try {
            Statics.field803 = new int[var4.field585];
            int var11 = 0;
            Statics.field804 = new String[var4.field589];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field14;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2730;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2731;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2730;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2731;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field803[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field804[var12++] = var15;
                }
            }
            int var16 = 0;
            field814 = arg0.field11;
            label3089: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var458 = var8[var7];
                if (var458 < 100) {
                    if (var458 == 0) {
                        field819[var5++] = var9[var7];
                        continue;
                    }
                    if (var458 == 1) {
                        int var17 = var9[var7];
                        field819[var5++] = class176.field2893[var17];
                        continue;
                    }
                    if (var458 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2893[var18] = field819[var5];
                        client.method611(var18);
                        continue;
                    }
                    if (var458 == 3) {
                        field807[var6++] = var4.field587[var7];
                        continue;
                    }
                    if (var458 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var458 == 7) {
                        var5 -= 2;
                        if (field819[var5 + 1] != field819[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var458 == 8) {
                        var5 -= 2;
                        if (field819[var5 + 1] == field819[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var458 == 9) {
                        var5 -= 2;
                        if (field819[var5] < field819[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var458 == 10) {
                        var5 -= 2;
                        if (field819[var5] > field819[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var458 == 21) {
                        if (field810 == 0) {
                            return;
                        }
                        class15 var19 = field808[--field810];
                        var4 = var19.field208;
                        var8 = var4.field584;
                        var9 = var4.field592;
                        var7 = var19.field210;
                        Statics.field803 = var19.field209;
                        Statics.field804 = var19.field207;
                        continue;
                    }
                    if (var458 == 25) {
                        int var20 = var9[var7];
                        field819[var5++] = class176.method3020(var20);
                        continue;
                    }
                    if (var458 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class176.method2980(var21, field819[var5]);
                        continue;
                    }
                    if (var458 == 31) {
                        var5 -= 2;
                        if (field819[var5] <= field819[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var458 == 32) {
                        var5 -= 2;
                        if (field819[var5] >= field819[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var458 == 33) {
                        field819[var5++] = Statics.field803[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var458 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field803[var10001] = field819[var5];
                        continue;
                    }
                    if (var458 == 35) {
                        field807[var6++] = Statics.field804[var9[var7]];
                        continue;
                    }
                    if (var458 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field804[var10001] = field807[var6];
                        continue;
                    }
                    if (var458 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class163.method2139(field807, var6, var22);
                        field807[var6++] = var23;
                        continue;
                    }
                    if (var458 == 38) {
                        var5--;
                        continue;
                    }
                    if (var458 == 39) {
                        var6--;
                        continue;
                    }
                    if (var458 == 40) {
                        int var24 = var9[var7];
                        class23 var25 = Statics.method96(var24);
                        int[] var26 = new int[var25.field585];
                        String[] var27 = new String[var25.field589];
                        for (int var28 = 0; var28 < var25.field590; var28++) {
                            var26[var28] = field819[var5 - var25.field590 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field601; var29++) {
                            var27[var29] = field807[var6 - var25.field601 + var29];
                        }
                        var5 -= var25.field590;
                        var6 -= var25.field601;
                        class15 var30 = new class15();
                        var30.field208 = var4;
                        var30.field210 = var7;
                        var30.field209 = Statics.field803;
                        var30.field207 = Statics.field804;
                        field808[++field810 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field584;
                        var9 = var25.field592;
                        var7 = -1;
                        Statics.field803 = var26;
                        Statics.field804 = var27;
                        continue;
                    }
                    if (var458 == 42) {
                        field819[var5++] = Statics.field211.method237(var9[var7]);
                        continue;
                    }
                    if (var458 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field211.method204(var10001, field819[var5]);
                        continue;
                    }
                    if (var458 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field819[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field802[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label3089;
                                }
                                field806[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var458 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field819[var5];
                        if (var37 >= 0 && var37 < field802[var36]) {
                            field819[var5++] = field806[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var458 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field819[var5];
                        if (var39 >= 0 && var39 < field802[var38]) {
                            field806[var38][var39] = field819[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var458 == 47) {
                        String var40 = Statics.field211.method207(var9[var7]);
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field807[var6++] = var40;
                        continue;
                    }
                    if (var458 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field211.method239(var10001, field807[var6]);
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var458 < 1000) {
                    if (var458 == 100) {
                        var5 -= 3;
                        int var42 = field819[var5];
                        int var43 = field819[var5 + 1];
                        int var44 = field819[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var45 = class173.method3288(var42);
                        if (var45.field2800 == null) {
                            var45.field2800 = new class173[var44 + 1];
                        }
                        if (var45.field2800.length <= var44) {
                            class173[] var46 = new class173[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2800.length; var47++) {
                                var46[var47] = var45.field2800[var47];
                            }
                            var45.field2800 = var46;
                        }
                        if (var44 > 0 && var45.field2800[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class173 var48 = new class173();
                        var48.field2823 = var43;
                        var48.field2749 = var48.field2730 = var45.field2730;
                        var48.field2731 = var44;
                        var48.field2729 = true;
                        var45.field2800[var44] = var48;
                        if (var41) {
                            Statics.field150 = var48;
                        } else {
                            Statics.field811 = var48;
                        }
                        client.method2981(var45);
                        continue;
                    }
                    if (var458 == 101) {
                        class173 var49 = var41 ? Statics.field150 : Statics.field811;
                        class173 var50 = class173.method3288(var49.field2730);
                        var50.field2800[var49.field2731] = null;
                        client.method2981(var50);
                        continue;
                    }
                    if (var458 == 102) {
                        var5--;
                        class173 var51 = class173.method3288(field819[var5]);
                        var51.field2800 = null;
                        client.method2981(var51);
                        continue;
                    }
                    if (var458 == 200) {
                        var5 -= 2;
                        int var52 = field819[var5];
                        int var53 = field819[var5 + 1];
                        class173 var54 = class173.method1582(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field819[var5++] = 1;
                            if (var41) {
                                Statics.field150 = var54;
                            } else {
                                Statics.field811 = var54;
                            }
                            continue;
                        }
                        field819[var5++] = 0;
                        continue;
                    }
                    if (var458 == 201) {
                        var5--;
                        class173 var55 = class173.method3288(field819[var5]);
                        if (var55 == null) {
                            field819[var5++] = 0;
                        } else {
                            field819[var5++] = 1;
                            if (var41) {
                                Statics.field150 = var55;
                            } else {
                                Statics.field811 = var55;
                            }
                        }
                        continue;
                    }
                } else if (!(var458 < 1000 || var458 >= 1100) || !(var458 < 2000 || var458 >= 2100)) {
                    int var56 = -1;
                    class173 var57;
                    if (var458 >= 2000) {
                        var458 -= 1000;
                        var5--;
                        var56 = field819[var5];
                        var57 = class173.method3288(var56);
                    } else {
                        var57 = var41 ? Statics.field150 : Statics.field811;
                    }
                    if (var458 == 1000) {
                        var5 -= 4;
                        var57.field2739 = field819[var5];
                        var57.field2834 = field819[var5 + 1];
                        var57.field2735 = field819[var5 + 2];
                        var57.field2720 = field819[var5 + 3];
                        client.method2981(var57);
                        client.method33(var57);
                        if (var56 != -1 && var57.field2823 == 0) {
                            client.method811(Statics.field2761[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var458 == 1001) {
                        var5 -= 4;
                        var57.field2741 = field819[var5];
                        var57.field2742 = field819[var5 + 1];
                        var57.field2737 = field819[var5 + 2];
                        var57.field2738 = field819[var5 + 3];
                        client.method2981(var57);
                        client.method33(var57);
                        if (var56 != -1 && var57.field2823 == 0) {
                            client.method811(Statics.field2761[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var458 == 1003) {
                        var5--;
                        boolean var58 = field819[var5] == 1;
                        if (var57.field2750 != var58) {
                            var57.field2750 = var58;
                            client.method2981(var57);
                        }
                        continue;
                    }
                    if (var458 == 1005) {
                        var5--;
                        var57.field2861 = field819[var5] == 1;
                        continue;
                    }
                    if (var458 == 1006) {
                        var5--;
                        var57.field2814 = field819[var5] == 1;
                        continue;
                    }
                } else if (var458 >= 1100 && var458 < 1200 || var458 >= 2100 && var458 < 2200) {
                    int var59 = -1;
                    class173 var60;
                    if (var458 >= 2000) {
                        var458 -= 1000;
                        var5--;
                        var59 = field819[var5];
                        var60 = class173.method3288(var59);
                    } else {
                        var60 = var41 ? Statics.field150 : Statics.field811;
                    }
                    if (var458 == 1100) {
                        var5 -= 2;
                        var60.field2751 = field819[var5];
                        if (var60.field2751 > var60.field2842 - var60.field2745) {
                            var60.field2751 = var60.field2842 - var60.field2745;
                        }
                        if (var60.field2751 < 0) {
                            var60.field2751 = 0;
                        }
                        var60.field2752 = field819[var5 + 1];
                        if (var60.field2752 > var60.field2754 - var60.field2779) {
                            var60.field2752 = var60.field2754 - var60.field2779;
                        }
                        if (var60.field2752 < 0) {
                            var60.field2752 = 0;
                        }
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1101) {
                        var5--;
                        var60.field2755 = field819[var5];
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1102) {
                        var5--;
                        var60.field2794 = field819[var5] == 1;
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1103) {
                        var5--;
                        var60.field2760 = field819[var5];
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1104) {
                        var5--;
                        var60.field2747 = field819[var5];
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1105) {
                        var5--;
                        var60.field2763 = field819[var5];
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1106) {
                        var5--;
                        var60.field2727 = field819[var5];
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1107) {
                        var5--;
                        var60.field2766 = field819[var5] == 1;
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1108) {
                        var60.field2780 = 1;
                        var5--;
                        var60.field2772 = field819[var5];
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1109) {
                        var5 -= 6;
                        var60.field2857 = field819[var5];
                        var60.field2778 = field819[var5 + 1];
                        var60.field2740 = field819[var5 + 2];
                        var60.field2862 = field819[var5 + 3];
                        var60.field2795 = field819[var5 + 4];
                        var60.field2782 = field819[var5 + 5];
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1110) {
                        var5--;
                        int var61 = field819[var5];
                        if (var60.field2796 != var61) {
                            var60.field2796 = var61;
                            var60.field2850 = 0;
                            var60.field2724 = 0;
                            client.method2981(var60);
                        }
                        continue;
                    }
                    if (var458 == 1111) {
                        var5--;
                        var60.field2785 = field819[var5] == 1;
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1112) {
                        var6--;
                        String var62 = field807[var6];
                        if (!var62.equals(var60.field2788)) {
                            var60.field2788 = var62;
                            client.method2981(var60);
                        }
                        continue;
                    }
                    if (var458 == 1113) {
                        var5--;
                        var60.field2784 = field819[var5];
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1114) {
                        var5 -= 3;
                        var60.field2791 = field819[var5];
                        var60.field2748 = field819[var5 + 1];
                        var60.field2790 = field819[var5 + 2];
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1115) {
                        var5--;
                        var60.field2793 = field819[var5] == 1;
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1116) {
                        var5--;
                        var60.field2819 = field819[var5];
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1117) {
                        var5--;
                        var60.field2746 = field819[var5];
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1118) {
                        var5--;
                        var60.field2769 = field819[var5] == 1;
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1119) {
                        var5--;
                        var60.field2853 = field819[var5] == 1;
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1120) {
                        var5 -= 2;
                        var60.field2842 = field819[var5];
                        var60.field2754 = field819[var5 + 1];
                        client.method2981(var60);
                        if (var59 != -1 && var60.field2823 == 0) {
                            client.method811(Statics.field2761[var59 >> 16], var60, false);
                        }
                        continue;
                    }
                    if (var458 == 1121) {
                        client.method194(var60.field2730, var60.field2731);
                        client.field453 = var60;
                        client.method2981(var60);
                        continue;
                    }
                    if (var458 == 1122) {
                        var5--;
                        var60.field2764 = field819[var5];
                        client.method2981(var60);
                        continue;
                    }
                } else if (var458 >= 1200 && var458 < 1300 || var458 >= 2200 && var458 < 2300) {
                    class173 var63;
                    if (var458 >= 2000) {
                        var458 -= 1000;
                        var5--;
                        var63 = class173.method3288(field819[var5]);
                    } else {
                        var63 = var41 ? Statics.field150 : Statics.field811;
                    }
                    client.method2981(var63);
                    if (var458 == 1200 || var458 == 1205 || var458 == 1212) {
                        var5 -= 2;
                        int var64 = field819[var5];
                        int var65 = field819[var5 + 1];
                        var63.field2848 = var64;
                        var63.field2849 = var65;
                        class52 var66 = class52.method193(var64);
                        var63.field2740 = var66.field1124;
                        var63.field2862 = var66.field1125;
                        var63.field2795 = var66.field1150;
                        var63.field2857 = var66.field1159;
                        var63.field2778 = var66.field1128;
                        var63.field2782 = var66.field1153;
                        if (var458 == 1205) {
                            var63.field2786 = 0;
                        } else if (var458 == 1212 | var66.field1129 == 1) {
                            var63.field2786 = 1;
                        } else {
                            var63.field2786 = 2;
                        }
                        if (var63.field2792 > 0) {
                            var63.field2782 = var63.field2782 * 32 / var63.field2792;
                        } else if (var63.field2741 > 0) {
                            var63.field2782 = var63.field2782 * 32 / var63.field2741;
                        }
                        continue;
                    }
                    if (var458 == 1201) {
                        var63.field2780 = 2;
                        var5--;
                        var63.field2772 = field819[var5];
                        continue;
                    }
                    if (var458 == 1202) {
                        var63.field2780 = 3;
                        var63.field2772 = Statics.field2222.field31.method3315();
                        continue;
                    }
                } else if (var458 >= 1300 && var458 < 1400 || var458 >= 2300 && var458 < 2400) {
                    class173 var67;
                    if (var458 >= 2000) {
                        var458 -= 1000;
                        var5--;
                        var67 = class173.method3288(field819[var5]);
                    } else {
                        var67 = var41 ? Statics.field150 : Statics.field811;
                    }
                    if (var458 == 1300) {
                        var5--;
                        int var68 = field819[var5] - 1;
                        if (var68 >= 0 && var68 <= 9) {
                            var6--;
                            var67.method3226(var68, field807[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var458 == 1301) {
                        var5 -= 2;
                        int var69 = field819[var5];
                        int var70 = field819[var5 + 1];
                        var67.field2803 = class173.method1582(var69, var70);
                        continue;
                    }
                    if (var458 == 1302) {
                        var5--;
                        var67.field2826 = field819[var5] == 1;
                        continue;
                    }
                    if (var458 == 1303) {
                        var5--;
                        var67.field2804 = field819[var5];
                        continue;
                    }
                    if (var458 == 1304) {
                        var5--;
                        var67.field2770 = field819[var5];
                        continue;
                    }
                    if (var458 == 1305) {
                        var6--;
                        var67.field2801 = field807[var6];
                        continue;
                    }
                    if (var458 == 1306) {
                        var6--;
                        var67.field2807 = field807[var6];
                        continue;
                    }
                    if (var458 == 1307) {
                        var67.field2802 = null;
                        continue;
                    }
                } else {
                    if (var458 >= 1400 && var458 < 1500 || var458 >= 2400 && var458 < 2500) {
                        class173 var71;
                        if (var458 >= 2000) {
                            var458 -= 1000;
                            var5--;
                            var71 = class173.method3288(field819[var5]);
                        } else {
                            var71 = var41 ? Statics.field150 : Statics.field811;
                        }
                        var6--;
                        String var72 = field807[var6];
                        int[] var73 = null;
                        if (var72.length() > 0 && var72.charAt(var72.length() - 1) == 'Y') {
                            var5--;
                            int var74 = field819[var5];
                            if (var74 > 0) {
                                var73 = new int[var74];
                                while (var74-- > 0) {
                                    var5--;
                                    var73[var74] = field819[var5];
                                }
                            }
                            var72 = var72.substring(0, var72.length() - 1);
                        }
                        Object[] var75 = new Object[var72.length() + 1];
                        for (int var76 = var75.length - 1; var76 >= 1; var76--) {
                            if (var72.charAt(var76 - 1) == 's') {
                                var6--;
                                var75[var76] = field807[var6];
                            } else {
                                var5--;
                                var75[var76] = Integer.valueOf(field819[var5]);
                            }
                        }
                        var5--;
                        int var77 = field819[var5];
                        if (var77 == -1) {
                            var75 = null;
                        } else {
                            var75[0] = Integer.valueOf(var77);
                        }
                        if (var458 == 1400) {
                            var71.field2810 = var75;
                        }
                        if (var458 == 1401) {
                            var71.field2813 = var75;
                        }
                        if (var458 == 1402) {
                            var71.field2812 = var75;
                        }
                        if (var458 == 1403) {
                            var71.field2765 = var75;
                        }
                        if (var458 == 1404) {
                            var71.field2816 = var75;
                        }
                        if (var458 == 1405) {
                            var71.field2817 = var75;
                        }
                        if (var458 == 1406) {
                            var71.field2820 = var75;
                        }
                        if (var458 == 1407) {
                            var71.field2844 = var75;
                            var71.field2822 = var73;
                        }
                        if (var458 == 1408) {
                            var71.field2827 = var75;
                        }
                        if (var458 == 1409) {
                            var71.field2828 = var75;
                        }
                        if (var458 == 1410) {
                            var71.field2818 = var75;
                        }
                        if (var458 == 1411) {
                            var71.field2811 = var75;
                        }
                        if (var458 == 1412) {
                            var71.field2736 = var75;
                        }
                        if (var458 == 1414) {
                            var71.field2777 = var75;
                            var71.field2824 = var73;
                        }
                        if (var458 == 1415) {
                            var71.field2825 = var75;
                            var71.field2753 = var73;
                        }
                        if (var458 == 1416) {
                            var71.field2732 = var75;
                        }
                        if (var458 == 1417) {
                            var71.field2829 = var75;
                        }
                        if (var458 == 1418) {
                            var71.field2830 = var75;
                        }
                        if (var458 == 1419) {
                            var71.field2831 = var75;
                        }
                        if (var458 == 1420) {
                            var71.field2832 = var75;
                        }
                        if (var458 == 1421) {
                            var71.field2833 = var75;
                        }
                        if (var458 == 1422) {
                            var71.field2787 = var75;
                        }
                        if (var458 == 1423) {
                            var71.field2835 = var75;
                        }
                        if (var458 == 1424) {
                            var71.field2836 = var75;
                        }
                        if (var458 == 1425) {
                            var71.field2838 = var75;
                        }
                        if (var458 == 1426) {
                            var71.field2839 = var75;
                        }
                        if (var458 == 1427) {
                            var71.field2837 = var75;
                        }
                        var71.field2808 = true;
                        continue;
                    }
                    if (var458 < 1600) {
                        class173 var78 = var41 ? Statics.field150 : Statics.field811;
                        if (var458 == 1500) {
                            field819[var5++] = var78.field2743;
                            continue;
                        }
                        if (var458 == 1501) {
                            field819[var5++] = var78.field2744;
                            continue;
                        }
                        if (var458 == 1502) {
                            field819[var5++] = var78.field2745;
                            continue;
                        }
                        if (var458 == 1503) {
                            field819[var5++] = var78.field2779;
                            continue;
                        }
                        if (var458 == 1504) {
                            field819[var5++] = var78.field2750 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 1505) {
                            field819[var5++] = var78.field2749;
                            continue;
                        }
                    } else if (var458 < 1700) {
                        class173 var79 = var41 ? Statics.field150 : Statics.field811;
                        if (var458 == 1600) {
                            field819[var5++] = var79.field2751;
                            continue;
                        }
                        if (var458 == 1601) {
                            field819[var5++] = var79.field2752;
                            continue;
                        }
                        if (var458 == 1602) {
                            field807[var6++] = var79.field2788;
                            continue;
                        }
                        if (var458 == 1603) {
                            field819[var5++] = var79.field2842;
                            continue;
                        }
                        if (var458 == 1604) {
                            field819[var5++] = var79.field2754;
                            continue;
                        }
                        if (var458 == 1605) {
                            field819[var5++] = var79.field2782;
                            continue;
                        }
                        if (var458 == 1606) {
                            field819[var5++] = var79.field2740;
                            continue;
                        }
                        if (var458 == 1607) {
                            field819[var5++] = var79.field2795;
                            continue;
                        }
                        if (var458 == 1608) {
                            field819[var5++] = var79.field2862;
                            continue;
                        }
                        if (var458 == 1609) {
                            field819[var5++] = var79.field2760;
                            continue;
                        }
                    } else if (var458 < 1800) {
                        class173 var80 = var41 ? Statics.field150 : Statics.field811;
                        if (var458 == 1700) {
                            field819[var5++] = var80.field2848;
                            continue;
                        }
                        if (var458 == 1701) {
                            if (var80.field2848 == -1) {
                                field819[var5++] = 0;
                            } else {
                                field819[var5++] = var80.field2849;
                            }
                            continue;
                        }
                        if (var458 == 1702) {
                            field819[var5++] = var80.field2731;
                            continue;
                        }
                    } else if (var458 < 1900) {
                        class173 var81 = var41 ? Statics.field150 : Statics.field811;
                        if (var458 == 1800) {
                            field819[var5++] = class178.method2774(client.method163(var81));
                            continue;
                        }
                        if (var458 == 1801) {
                            var5--;
                            int var82 = field819[var5];
                            int var459 = var82 - 1;
                            if (var81.field2802 != null && var459 < var81.field2802.length && var81.field2802[var459] != null) {
                                field807[var6++] = var81.field2802[var459];
                                continue;
                            }
                            field807[var6++] = "";
                            continue;
                        }
                        if (var458 == 1802) {
                            if (var81.field2801 == null) {
                                field807[var6++] = "";
                            } else {
                                field807[var6++] = var81.field2801;
                            }
                            continue;
                        }
                    } else if (!(var458 < 1900 || var458 >= 2000) || !(var458 < 2900 || var458 >= 3000)) {
                        class173 var83;
                        if (var458 >= 2000) {
                            var458 -= 1000;
                            var5--;
                            var83 = class173.method3288(field819[var5]);
                        } else {
                            var83 = var41 ? Statics.field150 : Statics.field811;
                        }
                        if (var458 == 1927) {
                            if (field814 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var83.field2837 == null) {
                                return;
                            }
                            class1 var84 = new class1();
                            var84.field3 = var83;
                            var84.field4 = var83.field2837;
                            var84.field11 = field814 + 1;
                            client.field488.method3633(arg0);
                            continue;
                        }
                    } else if (var458 < 2600) {
                        var5--;
                        class173 var85 = class173.method3288(field819[var5]);
                        if (var458 == 2500) {
                            field819[var5++] = var85.field2743;
                            continue;
                        }
                        if (var458 == 2501) {
                            field819[var5++] = var85.field2744;
                            continue;
                        }
                        if (var458 == 2502) {
                            field819[var5++] = var85.field2745;
                            continue;
                        }
                        if (var458 == 2503) {
                            field819[var5++] = var85.field2779;
                            continue;
                        }
                        if (var458 == 2504) {
                            field819[var5++] = var85.field2750 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 2505) {
                            field819[var5++] = var85.field2749;
                            continue;
                        }
                    } else if (var458 < 2700) {
                        var5--;
                        class173 var86 = class173.method3288(field819[var5]);
                        if (var458 == 2600) {
                            field819[var5++] = var86.field2751;
                            continue;
                        }
                        if (var458 == 2601) {
                            field819[var5++] = var86.field2752;
                            continue;
                        }
                        if (var458 == 2602) {
                            field807[var6++] = var86.field2788;
                            continue;
                        }
                        if (var458 == 2603) {
                            field819[var5++] = var86.field2842;
                            continue;
                        }
                        if (var458 == 2604) {
                            field819[var5++] = var86.field2754;
                            continue;
                        }
                        if (var458 == 2605) {
                            field819[var5++] = var86.field2782;
                            continue;
                        }
                        if (var458 == 2606) {
                            field819[var5++] = var86.field2740;
                            continue;
                        }
                        if (var458 == 2607) {
                            field819[var5++] = var86.field2795;
                            continue;
                        }
                        if (var458 == 2608) {
                            field819[var5++] = var86.field2862;
                            continue;
                        }
                        if (var458 == 2609) {
                            field819[var5++] = var86.field2760;
                            continue;
                        }
                    } else if (var458 < 2800) {
                        if (var458 == 2700) {
                            var5--;
                            class173 var87 = class173.method3288(field819[var5]);
                            field819[var5++] = var87.field2848;
                            continue;
                        }
                        if (var458 == 2701) {
                            var5--;
                            class173 var88 = class173.method3288(field819[var5]);
                            if (var88.field2848 == -1) {
                                field819[var5++] = 0;
                            } else {
                                field819[var5++] = var88.field2849;
                            }
                            continue;
                        }
                        if (var458 == 2702) {
                            var5--;
                            int var89 = field819[var5];
                            class4 var90 = (class4) client.field450.method3588((long) var89);
                            if (var90 == null) {
                                field819[var5++] = 0;
                            } else {
                                field819[var5++] = 1;
                            }
                            continue;
                        }
                        if (var458 == 2706) {
                            field819[var5++] = client.field556;
                            continue;
                        }
                    } else if (var458 < 2900) {
                        var5--;
                        class173 var91 = class173.method3288(field819[var5]);
                        if (var458 == 2800) {
                            field819[var5++] = class178.method2774(client.method163(var91));
                            continue;
                        }
                        if (var458 == 2801) {
                            var5--;
                            int var92 = field819[var5];
                            int var460 = var92 - 1;
                            if (var91.field2802 != null && var460 < var91.field2802.length && var91.field2802[var460] != null) {
                                field807[var6++] = var91.field2802[var460];
                                continue;
                            }
                            field807[var6++] = "";
                            continue;
                        }
                        if (var458 == 2802) {
                            if (var91.field2801 == null) {
                                field807[var6++] = "";
                            } else {
                                field807[var6++] = var91.field2801;
                            }
                            continue;
                        }
                    } else if (var458 < 3200) {
                        if (var458 == 3100) {
                            var6--;
                            String var93 = field807[var6];
                            class12.method2966(0, "", var93);
                            continue;
                        }
                        if (var458 == 3101) {
                            var5 -= 2;
                            client.method2295(Statics.field2222, field819[var5], field819[var5 + 1]);
                            continue;
                        }
                        if (var458 == 3103) {
                            client.method2643();
                            continue;
                        }
                        if (var458 == 3104) {
                            var6--;
                            String var94 = field807[var6];
                            int var95 = 0;
                            boolean var96 = false;
                            boolean var97 = false;
                            int var98 = 0;
                            int var99 = var94.length();
                            int var100 = 0;
                            boolean var102;
                            while (true) {
                                if (var100 >= var99) {
                                    var102 = var97;
                                    break;
                                }
                                label3365: {
                                    char var101 = var94.charAt(var100);
                                    if (var100 == 0) {
                                        if (var101 == '-') {
                                            var96 = true;
                                            break label3365;
                                        }
                                        if (var101 == '+') {
                                            break label3365;
                                        }
                                    }
                                    int var461;
                                    if (var101 >= '0' && var101 <= '9') {
                                        var461 = var101 - '0';
                                    } else if (var101 >= 'A' && var101 <= 'Z') {
                                        var461 = var101 - '7';
                                    } else {
                                        if (var101 < 'a' || var101 > 'z') {
                                            var102 = false;
                                            break;
                                        }
                                        var461 = var101 - 'W';
                                    }
                                    if (var461 >= 10) {
                                        var102 = false;
                                        break;
                                    }
                                    if (var96) {
                                        var461 = -var461;
                                    }
                                    int var103 = var98 * 10 + var461;
                                    if (var103 / 10 != var98) {
                                        var102 = false;
                                        break;
                                    }
                                    var98 = var103;
                                    var97 = true;
                                }
                                var100++;
                            }
                            if (var102) {
                                int var105 = class163.method2145(var94, 10, true);
                                var95 = var105;
                            }
                            client.field333.method2620(79);
                            client.field333.method2345(var95);
                            continue;
                        }
                        if (var458 == 3105) {
                            var6--;
                            String var106 = field807[var6];
                            client.field333.method2620(84);
                            client.field333.method2388(var106.length() + 1);
                            client.field333.method2348(var106);
                            continue;
                        }
                        if (var458 == 3106) {
                            var6--;
                            String var107 = field807[var6];
                            client.field333.method2620(58);
                            client.field333.method2388(var107.length() + 1);
                            client.field333.method2348(var107);
                            continue;
                        }
                        if (var458 == 3107) {
                            var5--;
                            int var108 = field819[var5];
                            var6--;
                            String var109 = field807[var6];
                            int var110 = class33.field762;
                            int[] var111 = class33.field763;
                            boolean var112 = false;
                            for (int var113 = 0; var113 < var110; var113++) {
                                class3 var114 = client.field412[var111[var113]];
                                if (var114 != null && Statics.field2222 != var114 && var114.field43 != null && var114.field43.equalsIgnoreCase(var109)) {
                                    if (var108 == 1) {
                                        client.field333.method2620(234);
                                        client.field333.method2488(0);
                                        client.field333.method2455(var111[var113]);
                                    } else if (var108 == 4) {
                                        client.field333.method2620(83);
                                        client.field333.method2388(0);
                                        client.field333.method2343(var111[var113]);
                                    } else if (var108 == 6) {
                                        client.field333.method2620(4);
                                        client.field333.method2381(0);
                                        client.field333.method2455(var111[var113]);
                                    } else if (var108 == 7) {
                                        client.field333.method2620(224);
                                        client.field333.method2488(0);
                                        client.field333.method2343(var111[var113]);
                                    }
                                    var112 = true;
                                    break;
                                }
                            }
                            if (!var112) {
                                class12.method2966(4, "", class157.field2429 + var109);
                            }
                            continue;
                        }
                        if (var458 == 3108) {
                            var5 -= 3;
                            int var115 = field819[var5];
                            int var116 = field819[var5 + 1];
                            int var117 = field819[var5 + 2];
                            class173 var118 = class173.method3288(var117);
                            Statics.method2982(var118, var115, var116);
                            continue;
                        }
                        if (var458 == 3109) {
                            var5 -= 2;
                            int var119 = field819[var5];
                            int var120 = field819[var5 + 1];
                            class173 var121 = var41 ? Statics.field150 : Statics.field811;
                            Statics.method2982(var121, var119, var120);
                            continue;
                        }
                        if (var458 == 3110) {
                            var5--;
                            Statics.field627 = field819[var5] == 1;
                            continue;
                        }
                        if (var458 == 3111) {
                            field819[var5++] = Statics.field1752.field143 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3112) {
                            var5--;
                            Statics.field1752.field143 = field819[var5] == 1;
                            class9.method2975();
                            continue;
                        }
                        if (var458 == 3113) {
                            var6--;
                            String var122 = field807[var6];
                            var5--;
                            boolean var123 = field819[var5] == 1;
                            class138.method727(var122, var123, "openjs", false);
                            continue;
                        }
                        if (var458 == 3115) {
                            var5--;
                            int var124 = field819[var5];
                            client.field333.method2620(160);
                            client.field333.method2343(var124);
                            continue;
                        }
                        if (var458 == 3116) {
                            var5--;
                            int var125 = field819[var5];
                            var6 -= 2;
                            String var126 = field807[var6];
                            String var127 = field807[var6 + 1];
                            if (var126.length() <= 500 && var127.length() <= 500) {
                                client.field333.method2620(196);
                                client.field333.method2343(1 + class119.method2041(var126) + class119.method2041(var127));
                                client.field333.method2348(var127);
                                client.field333.method2381(var125);
                                client.field333.method2348(var126);
                            }
                            continue;
                        }
                    } else if (var458 < 3300) {
                        if (var458 == 3200) {
                            var5 -= 3;
                            Statics.method2058(field819[var5], field819[var5 + 1], field819[var5 + 2]);
                            continue;
                        }
                        if (var458 == 3201) {
                            var5--;
                            client.method128(field819[var5]);
                            continue;
                        }
                        if (var458 == 3202) {
                            var5 -= 2;
                            int var128 = field819[var5];
                            int var10000 = field819[var5 + 1];
                            if (client.field527 != 0 && var128 != -1) {
                                class183.method2994(Statics.field2914, var128, 0, client.field527, false);
                                client.field515 = true;
                            }
                            continue;
                        }
                    } else if (var458 < 3400) {
                        if (var458 == 3300) {
                            field819[var5++] = client.field299;
                            continue;
                        }
                        if (var458 == 3301) {
                            var5 -= 2;
                            int var130 = field819[var5];
                            int var131 = field819[var5 + 1];
                            int[] var132 = field819;
                            int var133 = var5++;
                            class16 var134 = (class16) class16.field217.method3588((long) var130);
                            int var135;
                            if (var134 == null) {
                                var135 = -1;
                            } else if (var131 >= 0 && var131 < var134.field226.length) {
                                var135 = var134.field226[var131];
                            } else {
                                var135 = -1;
                            }
                            var132[var133] = var135;
                            continue;
                        }
                        if (var458 == 3302) {
                            var5 -= 2;
                            int var136 = field819[var5];
                            int var137 = field819[var5 + 1];
                            field819[var5++] = class16.method565(var136, var137);
                            continue;
                        }
                        if (var458 == 3303) {
                            var5 -= 2;
                            int var138 = field819[var5];
                            int var139 = field819[var5 + 1];
                            int[] var140 = field819;
                            int var141 = var5++;
                            class16 var142 = (class16) class16.field217.method3588((long) var138);
                            int var143;
                            if (var142 == null) {
                                var143 = 0;
                            } else if (var139 == -1) {
                                var143 = 0;
                            } else {
                                int var144 = 0;
                                for (int var145 = 0; var145 < var142.field218.length; var145++) {
                                    if (var142.field226[var145] == var139) {
                                        var144 += var142.field218[var145];
                                    }
                                }
                                var143 = var144;
                            }
                            var140[var141] = var143;
                            continue;
                        }
                        if (var458 == 3304) {
                            var5--;
                            int var146 = field819[var5];
                            field819[var5++] = class51.method3017(var146).field1101;
                            continue;
                        }
                        if (var458 == 3305) {
                            var5--;
                            int var147 = field819[var5];
                            field819[var5++] = client.field309[var147];
                            continue;
                        }
                        if (var458 == 3306) {
                            var5--;
                            int var148 = field819[var5];
                            field819[var5++] = client.field307[var148];
                            continue;
                        }
                        if (var458 == 3307) {
                            var5--;
                            int var149 = field819[var5];
                            field819[var5++] = client.field464[var149];
                            continue;
                        }
                        if (var458 == 3308) {
                            int var150 = Statics.field65;
                            int var151 = (Statics.field2222.field851 >> 7) + Statics.field2611;
                            int var152 = (Statics.field2222.field821 >> 7) + Statics.field278;
                            field819[var5++] = (var150 << 28) + (var151 << 14) + var152;
                            continue;
                        }
                        if (var458 == 3309) {
                            var5--;
                            int var153 = field819[var5];
                            field819[var5++] = var153 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var458 == 3310) {
                            var5--;
                            int var154 = field819[var5];
                            field819[var5++] = var154 >> 28;
                            continue;
                        }
                        if (var458 == 3311) {
                            var5--;
                            int var155 = field819[var5];
                            field819[var5++] = var155 & 0x3FFF;
                            continue;
                        }
                        if (var458 == 3312) {
                            field819[var5++] = client.field292 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3313) {
                            var5 -= 2;
                            int var156 = field819[var5] + 32768;
                            int var157 = field819[var5 + 1];
                            int[] var158 = field819;
                            int var159 = var5++;
                            class16 var160 = (class16) class16.field217.method3588((long) var156);
                            int var161;
                            if (var160 == null) {
                                var161 = -1;
                            } else if (var157 >= 0 && var157 < var160.field226.length) {
                                var161 = var160.field226[var157];
                            } else {
                                var161 = -1;
                            }
                            var158[var159] = var161;
                            continue;
                        }
                        if (var458 == 3314) {
                            var5 -= 2;
                            int var162 = field819[var5] + 32768;
                            int var163 = field819[var5 + 1];
                            field819[var5++] = class16.method565(var162, var163);
                            continue;
                        }
                        if (var458 == 3315) {
                            var5 -= 2;
                            int var164 = field819[var5] + 32768;
                            int var165 = field819[var5 + 1];
                            int[] var166 = field819;
                            int var167 = var5++;
                            class16 var168 = (class16) class16.field217.method3588((long) var164);
                            int var169;
                            if (var168 == null) {
                                var169 = 0;
                            } else if (var165 == -1) {
                                var169 = 0;
                            } else {
                                int var170 = 0;
                                for (int var171 = 0; var171 < var168.field218.length; var171++) {
                                    if (var168.field226[var171] == var165) {
                                        var170 += var168.field218[var171];
                                    }
                                }
                                var169 = var170;
                            }
                            var166[var167] = var169;
                            continue;
                        }
                        if (var458 == 3316) {
                            if (client.field456 >= 2) {
                                field819[var5++] = client.field456;
                            } else {
                                field819[var5++] = 0;
                            }
                            continue;
                        }
                        if (var458 == 3317) {
                            field819[var5++] = client.field513;
                            continue;
                        }
                        if (var458 == 3318) {
                            field819[var5++] = client.field471;
                            continue;
                        }
                        if (var458 == 3321) {
                            field819[var5++] = client.field454;
                            continue;
                        }
                        if (var458 == 3322) {
                            field819[var5++] = client.field455;
                            continue;
                        }
                        if (var458 == 3323) {
                            if (client.field503) {
                                field819[var5++] = 1;
                            } else {
                                field819[var5++] = 0;
                            }
                            continue;
                        }
                        if (var458 == 3324) {
                            field819[var5++] = client.field289;
                            continue;
                        }
                    } else if (var458 < 3500) {
                        if (var458 == 3400) {
                            var5 -= 2;
                            int var172 = field819[var5];
                            int var173 = field819[var5 + 1];
                            class49 var174 = class49.method813(var172);
                            if (var174.field1083 != 's') {
                            }
                            for (int var175 = 0; var175 < var174.field1080; var175++) {
                                if (var174.field1087[var175] == var173) {
                                    field807[var6++] = var174.field1089[var175];
                                    var174 = null;
                                    break;
                                }
                            }
                            if (var174 != null) {
                                field807[var6++] = var174.field1090;
                            }
                            continue;
                        }
                        if (var458 == 3408) {
                            var5 -= 4;
                            int var176 = field819[var5];
                            int var177 = field819[var5 + 1];
                            int var178 = field819[var5 + 2];
                            int var179 = field819[var5 + 3];
                            class49 var180 = class49.method813(var178);
                            if (var180.field1084 == var176 && var180.field1083 == var177) {
                                for (int var181 = 0; var181 < var180.field1080; var181++) {
                                    if (var180.field1087[var181] == var179) {
                                        if (var177 == 115) {
                                            field807[var6++] = var180.field1089[var181];
                                        } else {
                                            field819[var5++] = var180.field1088[var181];
                                        }
                                        var180 = null;
                                        break;
                                    }
                                }
                                if (var180 != null) {
                                    if (var177 == 115) {
                                        field807[var6++] = var180.field1090;
                                    } else {
                                        field819[var5++] = var180.field1086;
                                    }
                                }
                                continue;
                            }
                            if (var177 == 115) {
                                field807[var6++] = "null";
                            } else {
                                field819[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var458 < 3700) {
                        if (var458 == 3600) {
                            if (client.field559 == 0) {
                                field819[var5++] = -2;
                            } else if (client.field559 == 1) {
                                field819[var5++] = -1;
                            } else {
                                field819[var5++] = client.field508;
                            }
                            continue;
                        }
                        if (var458 == 3601) {
                            var5--;
                            int var182 = field819[var5];
                            if (client.field559 == 2 && var182 < client.field508) {
                                field807[var6++] = client.field560[var182].field248;
                                field807[var6++] = client.field560[var182].field254;
                                continue;
                            }
                            field807[var6++] = "";
                            field807[var6++] = "";
                            continue;
                        }
                        if (var458 == 3602) {
                            var5--;
                            int var183 = field819[var5];
                            if (client.field559 == 2 && var183 < client.field508) {
                                field819[var5++] = client.field560[var183].field244;
                                continue;
                            }
                            field819[var5++] = 0;
                            continue;
                        }
                        if (var458 == 3603) {
                            var5--;
                            int var184 = field819[var5];
                            if (client.field559 == 2 && var184 < client.field508) {
                                field819[var5++] = client.field560[var184].field246;
                                continue;
                            }
                            field819[var5++] = 0;
                            continue;
                        }
                        if (var458 == 3604) {
                            var6--;
                            String var185 = field807[var6];
                            var5--;
                            int var186 = field819[var5];
                            client.field333.method2620(62);
                            client.field333.method2388(class119.method2041(var185) + 1);
                            client.field333.method2348(var185);
                            client.field333.method2488(var186);
                            continue;
                        }
                        if (var458 == 3605) {
                            var6--;
                            String var187 = field807[var6];
                            if (var187 == null) {
                                continue;
                            }
                            if ((client.field508 < 200 || client.field414 == 1) && client.field508 < 400) {
                                String var188 = class164.method1080(var187, Statics.field172);
                                if (var188 == null) {
                                    continue;
                                }
                                for (int var189 = 0; var189 < client.field508; var189++) {
                                    class18 var190 = client.field560[var189];
                                    String var191 = class164.method1080(var190.field248, Statics.field172);
                                    if (var191 != null && var191.equals(var188)) {
                                        class12.method2966(30, "", var187 + class157.field2447);
                                        continue label3089;
                                    }
                                    if (var190.field254 != null) {
                                        String var192 = class164.method1080(var190.field254, Statics.field172);
                                        if (var192 != null && var192.equals(var188)) {
                                            class12.method2966(30, "", var187 + class157.field2447);
                                            continue label3089;
                                        }
                                    }
                                }
                                for (int var193 = 0; var193 < client.field562; var193++) {
                                    class8 var194 = client.field563[var193];
                                    String var195 = class164.method1080(var194.field136, Statics.field172);
                                    if (var195 != null && var195.equals(var188)) {
                                        class12.method2966(30, "", class157.field2452 + var187 + class157.field2453);
                                        continue label3089;
                                    }
                                    if (var194.field135 != null) {
                                        String var196 = class164.method1080(var194.field135, Statics.field172);
                                        if (var196 != null && var196.equals(var188)) {
                                            class12.method2966(30, "", class157.field2452 + var187 + class157.field2453);
                                            continue label3089;
                                        }
                                    }
                                }
                                if (class164.method1080(Statics.field2222.field43, Statics.field172).equals(var188)) {
                                    class12.method2966(30, "", class157.field2460);
                                } else {
                                    client.field333.method2620(164);
                                    client.field333.method2388(class119.method2041(var187));
                                    client.field333.method2348(var187);
                                }
                                continue;
                            }
                            class12.method2966(30, "", class157.field2446);
                            continue;
                        }
                        if (var458 == 3606) {
                            var6--;
                            String var197 = field807[var6];
                            client.method872(var197);
                            continue;
                        }
                        if (var458 == 3607) {
                            var6--;
                            String var198 = field807[var6];
                            if (var198 == null) {
                                continue;
                            }
                            if ((client.field562 < 100 || client.field414 == 1) && client.field562 < 400) {
                                String var199 = class164.method1080(var198, Statics.field172);
                                if (var199 == null) {
                                    continue;
                                }
                                for (int var200 = 0; var200 < client.field562; var200++) {
                                    class8 var201 = client.field563[var200];
                                    String var202 = class164.method1080(var201.field136, Statics.field172);
                                    if (var202 != null && var202.equals(var199)) {
                                        class12.method2966(31, "", var198 + class157.field2449);
                                        continue label3089;
                                    }
                                    if (var201.field135 != null) {
                                        String var203 = class164.method1080(var201.field135, Statics.field172);
                                        if (var203 != null && var203.equals(var199)) {
                                            class12.method2966(31, "", var198 + class157.field2449);
                                            continue label3089;
                                        }
                                    }
                                }
                                for (int var204 = 0; var204 < client.field508; var204++) {
                                    class18 var205 = client.field560[var204];
                                    String var206 = class164.method1080(var205.field248, Statics.field172);
                                    if (var206 != null && var206.equals(var199)) {
                                        class12.method2966(31, "", class157.field2320 + var198 + class157.field2455);
                                        continue label3089;
                                    }
                                    if (var205.field254 != null) {
                                        String var207 = class164.method1080(var205.field254, Statics.field172);
                                        if (var207 != null && var207.equals(var199)) {
                                            class12.method2966(31, "", class157.field2320 + var198 + class157.field2455);
                                            continue label3089;
                                        }
                                    }
                                }
                                if (class164.method1080(Statics.field2222.field43, Statics.field172).equals(var199)) {
                                    class12.method2966(31, "", class157.field2451);
                                } else {
                                    client.field333.method2620(178);
                                    client.field333.method2388(class119.method2041(var198));
                                    client.field333.method2348(var198);
                                }
                                continue;
                            }
                            class12.method2966(31, "", class157.field2448);
                            continue;
                        }
                        if (var458 == 3608) {
                            var6--;
                            String var208 = field807[var6];
                            if (var208 == null) {
                                continue;
                            }
                            String var209 = class164.method1080(var208, Statics.field172);
                            if (var209 == null) {
                                continue;
                            }
                            int var210 = 0;
                            while (true) {
                                if (var210 >= client.field562) {
                                    continue label3089;
                                }
                                class8 var211 = client.field563[var210];
                                String var212 = var211.field136;
                                String var213 = class164.method1080(var212, Statics.field172);
                                if (class129.method169(var208, var209, var212, var213)) {
                                    client.field562--;
                                    for (int var214 = var210; var214 < client.field562; var214++) {
                                        client.field563[var214] = client.field563[var214 + 1];
                                    }
                                    client.field424 = client.field474;
                                    client.field333.method2620(159);
                                    client.field333.method2388(class119.method2041(var208));
                                    client.field333.method2348(var208);
                                    continue label3089;
                                }
                                var210++;
                            }
                        }
                        if (var458 == 3609) {
                            var6--;
                            String var215 = field807[var6];
                            class152[] var216 = new class152[] { class152.field2237, class152.field2232, class152.field2238, class152.field2233, class152.field2234 };
                            class152[] var217 = var216;
                            for (int var218 = 0; var218 < var217.length; var218++) {
                                class152 var219 = var217[var218];
                                if (var219.field2231 != -1 && var215.startsWith(class2.method2688(var219.field2231))) {
                                    var215 = var215.substring(6 + Integer.toString(var219.field2231).length());
                                    break;
                                }
                            }
                            field819[var5++] = client.method2143(var215, false) ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3611) {
                            if (client.field406 == null) {
                                field807[var6++] = "";
                            } else {
                                String[] var220 = field807;
                                int var221 = var6++;
                                String var222 = client.field406;
                                String var223 = class162.method956(class162.method2302(var222));
                                if (var223 == null) {
                                    var223 = "";
                                }
                                var220[var221] = var223;
                            }
                            continue;
                        }
                        if (var458 == 3612) {
                            if (client.field406 == null) {
                                field819[var5++] = 0;
                            } else {
                                field819[var5++] = Statics.field2639;
                            }
                            continue;
                        }
                        if (var458 == 3613) {
                            var5--;
                            int var225 = field819[var5];
                            if (client.field406 != null && var225 < Statics.field2639) {
                                field807[var6++] = Statics.field66[var225].field634;
                                continue;
                            }
                            field807[var6++] = "";
                            continue;
                        }
                        if (var458 == 3614) {
                            var5--;
                            int var226 = field819[var5];
                            if (client.field406 != null && var226 < Statics.field2639) {
                                field819[var5++] = Statics.field66[var226].field624;
                                continue;
                            }
                            field819[var5++] = 0;
                            continue;
                        }
                        if (var458 == 3615) {
                            var5--;
                            int var227 = field819[var5];
                            if (client.field406 != null && var227 < Statics.field2639) {
                                field819[var5++] = Statics.field66[var227].field625;
                                continue;
                            }
                            field819[var5++] = 0;
                            continue;
                        }
                        if (var458 == 3616) {
                            field819[var5++] = Statics.field1944;
                            continue;
                        }
                        if (var458 == 3617) {
                            var6--;
                            String var228 = field807[var6];
                            if (Statics.field66 != null) {
                                client.field333.method2620(166);
                                client.field333.method2388(class119.method2041(var228));
                                client.field333.method2348(var228);
                            }
                            continue;
                        }
                        if (var458 == 3618) {
                            field819[var5++] = Statics.field321;
                            continue;
                        }
                        if (var458 == 3619) {
                            var6--;
                            String var229 = field807[var6];
                            if (!var229.equals("")) {
                                client.field333.method2620(233);
                                client.field333.method2388(class119.method2041(var229));
                                client.field333.method2348(var229);
                            }
                            continue;
                        }
                        if (var458 == 3620) {
                            client.field333.method2620(233);
                            client.field333.method2388(0);
                            continue;
                        }
                        if (var458 == 3621) {
                            if (client.field559 == 0) {
                                field819[var5++] = -1;
                            } else {
                                field819[var5++] = client.field562;
                            }
                            continue;
                        }
                        if (var458 == 3622) {
                            var5--;
                            int var230 = field819[var5];
                            if (client.field559 != 0 && var230 < client.field562) {
                                field807[var6++] = client.field563[var230].field136;
                                field807[var6++] = client.field563[var230].field135;
                                continue;
                            }
                            field807[var6++] = "";
                            field807[var6++] = "";
                            continue;
                        }
                        if (var458 == 3623) {
                            var6--;
                            String var231 = field807[var6];
                            if (var231.startsWith(class2.method2688(0)) || var231.startsWith(class2.method2688(1))) {
                                var231 = var231.substring(7);
                            }
                            field819[var5++] = client.method612(var231) ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3624) {
                            var5--;
                            int var232 = field819[var5];
                            if (Statics.field66 != null && var232 < Statics.field2639 && Statics.field66[var232].field634.equalsIgnoreCase(Statics.field2222.field43)) {
                                field819[var5++] = 1;
                                continue;
                            }
                            field819[var5++] = 0;
                            continue;
                        }
                        if (var458 == 3625) {
                            if (client.field517 == null) {
                                field807[var6++] = "";
                            } else {
                                String[] var233 = field807;
                                int var234 = var6++;
                                String var235 = client.field517;
                                String var236 = class162.method956(class162.method2302(var235));
                                if (var236 == null) {
                                    var236 = "";
                                }
                                var233[var234] = var236;
                            }
                            continue;
                        }
                    } else if (var458 < 4000) {
                        if (var458 == 3903) {
                            var5--;
                            int var238 = field819[var5];
                            field819[var5++] = client.field567[var238].method3790();
                            continue;
                        }
                        if (var458 == 3904) {
                            var5--;
                            int var239 = field819[var5];
                            field819[var5++] = client.field567[var239].field3153;
                            continue;
                        }
                        if (var458 == 3905) {
                            var5--;
                            int var240 = field819[var5];
                            field819[var5++] = client.field567[var240].field3154;
                            continue;
                        }
                        if (var458 == 3906) {
                            var5--;
                            int var241 = field819[var5];
                            field819[var5++] = client.field567[var241].field3152;
                            continue;
                        }
                        if (var458 == 3907) {
                            var5--;
                            int var242 = field819[var5];
                            field819[var5++] = client.field567[var242].field3157;
                            continue;
                        }
                        if (var458 == 3908) {
                            var5--;
                            int var243 = field819[var5];
                            field819[var5++] = client.field567[var243].field3156;
                            continue;
                        }
                        if (var458 == 3910) {
                            var5--;
                            int var244 = field819[var5];
                            int var245 = client.field567[var244].method3802();
                            field819[var5++] = var245 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3911) {
                            var5--;
                            int var246 = field819[var5];
                            int var247 = client.field567[var246].method3802();
                            field819[var5++] = var247 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3912) {
                            var5--;
                            int var248 = field819[var5];
                            int var249 = client.field567[var248].method3802();
                            field819[var5++] = var249 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3913) {
                            var5--;
                            int var250 = field819[var5];
                            int var251 = client.field567[var250].method3802();
                            field819[var5++] = var251 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3914) {
                            var5--;
                            boolean var252 = field819[var5] == 1;
                            if (Statics.field2117 != null) {
                                Statics.field2117.method3810(class221.field3161, var252);
                            }
                            continue;
                        }
                        if (var458 == 3915) {
                            var5--;
                            boolean var253 = field819[var5] == 1;
                            if (Statics.field2117 != null) {
                                Statics.field2117.method3810(class221.field3160, var253);
                            }
                            continue;
                        }
                        if (var458 == 3916) {
                            var5 -= 2;
                            boolean var254 = field819[var5] == 1;
                            boolean var255 = field819[var5 + 1] == 1;
                            if (Statics.field2117 != null) {
                                Statics.field2117.method3810(new class22(var255), var254);
                            }
                            continue;
                        }
                        if (var458 == 3917) {
                            var5--;
                            boolean var256 = field819[var5] == 1;
                            if (Statics.field2117 != null) {
                                Statics.field2117.method3810(class221.field3159, var256);
                            }
                            continue;
                        }
                        if (var458 == 3918) {
                            var5--;
                            boolean var257 = field819[var5] == 1;
                            if (Statics.field2117 != null) {
                                Statics.field2117.method3810(class221.field3163, var257);
                            }
                            continue;
                        }
                        if (var458 == 3919) {
                            field819[var5++] = Statics.field2117 == null ? 0 : Statics.field2117.field3162.size();
                            continue;
                        }
                        if (var458 == 3920) {
                            var5--;
                            int var258 = field819[var5];
                            class214 var259 = (class214) Statics.field2117.field3162.get(var258);
                            field819[var5++] = var259.field3135;
                            continue;
                        }
                        if (var458 == 3921) {
                            var5--;
                            int var260 = field819[var5];
                            class214 var261 = (class214) Statics.field2117.field3162.get(var260);
                            field807[var6++] = var261.method3752();
                            continue;
                        }
                        if (var458 == 3922) {
                            var5--;
                            int var262 = field819[var5];
                            class214 var263 = (class214) Statics.field2117.field3162.get(var262);
                            field807[var6++] = var263.method3751();
                            continue;
                        }
                        if (var458 == 3923) {
                            var5--;
                            int var264 = field819[var5];
                            class214 var265 = (class214) Statics.field2117.field3162.get(var264);
                            long var266 = class115.method2142() - Statics.field1937 - var265.field3133;
                            int var268 = (int) (var266 / 3600000L);
                            int var269 = (int) ((var266 - (long) (var268 * 3600000)) / 60000L);
                            int var270 = (int) ((var266 - (long) (var268 * 3600000) - (long) (var269 * 60000)) / 1000L);
                            String var271 = var268 + ":" + var269 / 10 + var269 % 10 + ":" + var270 / 10 + var270 % 10;
                            field807[var6++] = var271;
                            continue;
                        }
                        if (var458 == 3924) {
                            var5--;
                            int var272 = field819[var5];
                            class214 var273 = (class214) Statics.field2117.field3162.get(var272);
                            field819[var5++] = var273.field3132.field3152;
                            continue;
                        }
                        if (var458 == 3925) {
                            var5--;
                            int var274 = field819[var5];
                            class214 var275 = (class214) Statics.field2117.field3162.get(var274);
                            field819[var5++] = var275.field3132.field3154;
                            continue;
                        }
                        if (var458 == 3926) {
                            var5--;
                            int var276 = field819[var5];
                            class214 var277 = (class214) Statics.field2117.field3162.get(var276);
                            field819[var5++] = var277.field3132.field3153;
                            continue;
                        }
                    } else if (var458 < 4100) {
                        if (var458 == 4000) {
                            var5 -= 2;
                            int var278 = field819[var5];
                            int var279 = field819[var5 + 1];
                            field819[var5++] = var278 + var279;
                            continue;
                        }
                        if (var458 == 4001) {
                            var5 -= 2;
                            int var280 = field819[var5];
                            int var281 = field819[var5 + 1];
                            field819[var5++] = var280 - var281;
                            continue;
                        }
                        if (var458 == 4002) {
                            var5 -= 2;
                            int var282 = field819[var5];
                            int var283 = field819[var5 + 1];
                            field819[var5++] = var282 * var283;
                            continue;
                        }
                        if (var458 == 4003) {
                            var5 -= 2;
                            int var284 = field819[var5];
                            int var285 = field819[var5 + 1];
                            field819[var5++] = var284 / var285;
                            continue;
                        }
                        if (var458 == 4004) {
                            var5--;
                            int var286 = field819[var5];
                            field819[var5++] = (int) (Math.random() * (double) var286);
                            continue;
                        }
                        if (var458 == 4005) {
                            var5--;
                            int var287 = field819[var5];
                            field819[var5++] = (int) (Math.random() * (double) (var287 + 1));
                            continue;
                        }
                        if (var458 == 4006) {
                            var5 -= 5;
                            int var288 = field819[var5];
                            int var289 = field819[var5 + 1];
                            int var290 = field819[var5 + 2];
                            int var291 = field819[var5 + 3];
                            int var292 = field819[var5 + 4];
                            field819[var5++] = (var289 - var288) * (var292 - var290) / (var291 - var290) + var288;
                            continue;
                        }
                        if (var458 == 4007) {
                            var5 -= 2;
                            int var293 = field819[var5];
                            int var294 = field819[var5 + 1];
                            field819[var5++] = var293 * var294 / 100 + var293;
                            continue;
                        }
                        if (var458 == 4008) {
                            var5 -= 2;
                            int var295 = field819[var5];
                            int var296 = field819[var5 + 1];
                            field819[var5++] = var295 | 0x1 << var296;
                            continue;
                        }
                        if (var458 == 4009) {
                            var5 -= 2;
                            int var297 = field819[var5];
                            int var298 = field819[var5 + 1];
                            field819[var5++] = var297 & -1 - (0x1 << var298);
                            continue;
                        }
                        if (var458 == 4010) {
                            var5 -= 2;
                            int var299 = field819[var5];
                            int var300 = field819[var5 + 1];
                            field819[var5++] = (var299 & 0x1 << var300) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var458 == 4011) {
                            var5 -= 2;
                            int var301 = field819[var5];
                            int var302 = field819[var5 + 1];
                            field819[var5++] = var301 % var302;
                            continue;
                        }
                        if (var458 == 4012) {
                            var5 -= 2;
                            int var303 = field819[var5];
                            int var304 = field819[var5 + 1];
                            if (var303 == 0) {
                                field819[var5++] = 0;
                            } else {
                                field819[var5++] = (int) Math.pow((double) var303, (double) var304);
                            }
                            continue;
                        }
                        if (var458 == 4013) {
                            var5 -= 2;
                            int var305 = field819[var5];
                            int var306 = field819[var5 + 1];
                            if (var305 == 0) {
                                field819[var5++] = 0;
                            } else if (var306 == 0) {
                                field819[var5++] = Integer.MAX_VALUE;
                            } else {
                                field819[var5++] = (int) Math.pow((double) var305, 1.0D / (double) var306);
                            }
                            continue;
                        }
                        if (var458 == 4014) {
                            var5 -= 2;
                            int var307 = field819[var5];
                            int var308 = field819[var5 + 1];
                            field819[var5++] = var307 & var308;
                            continue;
                        }
                        if (var458 == 4015) {
                            var5 -= 2;
                            int var309 = field819[var5];
                            int var310 = field819[var5 + 1];
                            field819[var5++] = var309 | var310;
                            continue;
                        }
                    } else if (var458 < 4200) {
                        if (var458 == 4100) {
                            var6--;
                            String var311 = field807[var6];
                            var5--;
                            int var312 = field819[var5];
                            field807[var6++] = var311 + var312;
                            continue;
                        }
                        if (var458 == 4101) {
                            var6 -= 2;
                            String var313 = field807[var6];
                            String var314 = field807[var6 + 1];
                            field807[var6++] = var313 + var314;
                            continue;
                        }
                        if (var458 == 4102) {
                            var6--;
                            String var315 = field807[var6];
                            var5--;
                            int var316 = field819[var5];
                            String[] var317 = field807;
                            int var318 = var6++;
                            String var320;
                            if (var316 < 0) {
                                var320 = Integer.toString(var316);
                            } else {
                                var320 = class163.method2683(var316, 10, true);
                            }
                            var317[var318] = var315 + var320;
                            continue;
                        }
                        if (var458 == 4103) {
                            var6--;
                            String var321 = field807[var6];
                            field807[var6++] = var321.toLowerCase();
                            continue;
                        }
                        if (var458 == 4104) {
                            var5--;
                            int var322 = field819[var5];
                            long var323 = ((long) var322 + 11745L) * 86400000L;
                            field812.setTime(new Date(var323));
                            int var325 = field812.get(5);
                            int var326 = field812.get(2);
                            int var327 = field812.get(1);
                            field807[var6++] = var325 + "-" + field813[var326] + "-" + var327;
                            continue;
                        }
                        if (var458 == 4105) {
                            var6 -= 2;
                            String var328 = field807[var6];
                            String var329 = field807[var6 + 1];
                            if (Statics.field2222.field31 != null && Statics.field2222.field31.field2907) {
                                field807[var6++] = var329;
                                continue;
                            }
                            field807[var6++] = var328;
                            continue;
                        }
                        if (var458 == 4106) {
                            var5--;
                            int var330 = field819[var5];
                            field807[var6++] = Integer.toString(var330);
                            continue;
                        }
                        if (var458 == 4107) {
                            var6 -= 2;
                            field819[var5++] = class163.method2371(class166.method726(field807[var6], field807[var6 + 1], client.field294));
                            continue;
                        }
                        if (var458 == 4108) {
                            var6--;
                            String var331 = field807[var6];
                            var5 -= 2;
                            int var332 = field819[var5];
                            int var333 = field819[var5 + 1];
                            byte[] var334 = Statics.field659.method3134(var333, 0);
                            class224 var335 = new class224(var334);
                            field819[var5++] = var335.method3825(var331, var332);
                            continue;
                        }
                        if (var458 == 4109) {
                            var6--;
                            String var336 = field807[var6];
                            var5 -= 2;
                            int var337 = field819[var5];
                            int var338 = field819[var5 + 1];
                            byte[] var339 = Statics.field659.method3134(var338, 0);
                            class224 var340 = new class224(var339);
                            field819[var5++] = var340.method3824(var336, var337);
                            continue;
                        }
                        if (var458 == 4110) {
                            var6 -= 2;
                            String var341 = field807[var6];
                            String var342 = field807[var6 + 1];
                            var5--;
                            if (field819[var5] == 1) {
                                field807[var6++] = var341;
                            } else {
                                field807[var6++] = var342;
                            }
                            continue;
                        }
                        if (var458 == 4111) {
                            var6--;
                            String var343 = field807[var6];
                            field807[var6++] = class223.method3826(var343);
                            continue;
                        }
                        if (var458 == 4112) {
                            var6--;
                            String var344 = field807[var6];
                            var5--;
                            int var345 = field819[var5];
                            field807[var6++] = var344 + (char) var345;
                            continue;
                        }
                        if (var458 == 4113) {
                            var5--;
                            int var346 = field819[var5];
                            int[] var347 = field819;
                            int var348 = var5++;
                            char var349 = (char) var346;
                            boolean var350;
                            if (var349 >= ' ' && var349 <= '~') {
                                var350 = true;
                            } else if (var349 >= 160 && var349 <= 255) {
                                var350 = true;
                            } else if (var349 == 8364 || var349 == 338 || var349 == 8212 || var349 == 339 || var349 == 376) {
                                var350 = true;
                            } else {
                                var350 = false;
                            }
                            var347[var348] = var350 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 4114) {
                            var5--;
                            int var351 = field819[var5];
                            int[] var352 = field819;
                            int var353 = var5++;
                            char var354 = (char) var351;
                            boolean var355 = var354 >= '0' && var354 <= '9' || var354 >= 'A' && var354 <= 'Z' || var354 >= 'a' && var354 <= 'z';
                            var352[var353] = var355 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 4115) {
                            var5--;
                            int var356 = field819[var5];
                            field819[var5++] = class163.method2140((char) var356) ? 1 : 0;
                            continue;
                        }
                        if (var458 == 4116) {
                            var5--;
                            int var357 = field819[var5];
                            field819[var5++] = class163.method2840((char) var357) ? 1 : 0;
                            continue;
                        }
                        if (var458 == 4117) {
                            var6--;
                            String var358 = field807[var6];
                            if (var358 == null) {
                                field819[var5++] = 0;
                            } else {
                                field819[var5++] = var358.length();
                            }
                            continue;
                        }
                        if (var458 == 4118) {
                            var6--;
                            String var359 = field807[var6];
                            var5 -= 2;
                            int var360 = field819[var5];
                            int var361 = field819[var5 + 1];
                            field807[var6++] = var359.substring(var360, var361);
                            continue;
                        }
                        if (var458 == 4119) {
                            var6--;
                            String var362 = field807[var6];
                            StringBuilder var363 = new StringBuilder(var362.length());
                            boolean var364 = false;
                            for (int var365 = 0; var365 < var362.length(); var365++) {
                                char var366 = var362.charAt(var365);
                                if (var366 == '<') {
                                    var364 = true;
                                } else if (var366 == '>') {
                                    var364 = false;
                                } else if (!var364) {
                                    var363.append(var366);
                                }
                            }
                            field807[var6++] = var363.toString();
                            continue;
                        }
                        if (var458 == 4120) {
                            var6--;
                            String var367 = field807[var6];
                            var5--;
                            int var368 = field819[var5];
                            field819[var5++] = var367.indexOf(var368);
                            continue;
                        }
                        if (var458 == 4121) {
                            var6 -= 2;
                            String var369 = field807[var6];
                            String var370 = field807[var6 + 1];
                            var5--;
                            int var371 = field819[var5];
                            field819[var5++] = var369.indexOf(var370, var371);
                            continue;
                        }
                    } else if (var458 < 4300) {
                        if (var458 == 4200) {
                            var5--;
                            int var372 = field819[var5];
                            field807[var6++] = class52.method193(var372).field1118;
                            continue;
                        }
                        if (var458 == 4201) {
                            var5 -= 2;
                            int var373 = field819[var5];
                            int var374 = field819[var5 + 1];
                            class52 var375 = class52.method193(var373);
                            if (var374 >= 1 && var374 <= 5 && var375.field1148[var374 - 1] != null) {
                                field807[var6++] = var375.field1148[var374 - 1];
                                continue;
                            }
                            field807[var6++] = "";
                            continue;
                        }
                        if (var458 == 4202) {
                            var5 -= 2;
                            int var376 = field819[var5];
                            int var377 = field819[var5 + 1];
                            class52 var378 = class52.method193(var376);
                            if (var377 >= 1 && var377 <= 5 && var378.field1144[var377 - 1] != null) {
                                field807[var6++] = var378.field1144[var377 - 1];
                                continue;
                            }
                            field807[var6++] = "";
                            continue;
                        }
                        if (var458 == 4203) {
                            var5--;
                            int var379 = field819[var5];
                            field819[var5++] = class52.method193(var379).field1122;
                            continue;
                        }
                        if (var458 == 4204) {
                            var5--;
                            int var380 = field819[var5];
                            field819[var5++] = class52.method193(var380).field1129 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 4205) {
                            var5--;
                            int var381 = field819[var5];
                            class52 var382 = class52.method193(var381);
                            if (var382.field1149 == -1 && var382.field1156 >= 0) {
                                field819[var5++] = var382.field1156;
                                continue;
                            }
                            field819[var5++] = var381;
                            continue;
                        }
                        if (var458 == 4206) {
                            var5--;
                            int var383 = field819[var5];
                            class52 var384 = class52.method193(var383);
                            if (var384.field1149 >= 0 && var384.field1156 >= 0) {
                                field819[var5++] = var384.field1156;
                                continue;
                            }
                            field819[var5++] = var383;
                            continue;
                        }
                        if (var458 == 4207) {
                            var5--;
                            int var385 = field819[var5];
                            field819[var5++] = class52.method193(var385).field1131 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 4210) {
                            var6--;
                            String var386 = field807[var6];
                            var5--;
                            int var387 = field819[var5];
                            boolean var389 = var387 == 1;
                            String var390 = var386.toLowerCase();
                            short[] var391 = new short[16];
                            int var392 = 0;
                            int var393 = 0;
                            while (true) {
                                if (var393 >= Statics.field1222) {
                                    Statics.field2164 = var391;
                                    Statics.field151 = 0;
                                    Statics.field685 = var392;
                                    String[] var397 = new String[Statics.field685];
                                    for (int var398 = 0; var398 < Statics.field685; var398++) {
                                        var397[var398] = class52.method193(var391[var398]).field1118;
                                    }
                                    class124.method2990(var397, Statics.field2164);
                                    break;
                                }
                                class52 var394 = class52.method193(var393);
                                if ((!var389 || var394.field1137) && var394.field1149 == -1 && var394.field1118.toLowerCase().indexOf(var390) != -1) {
                                    if (var392 >= 250) {
                                        Statics.field685 = -1;
                                        Statics.field2164 = null;
                                        break;
                                    }
                                    if (var392 >= var391.length) {
                                        short[] var395 = new short[var391.length * 2];
                                        for (int var396 = 0; var396 < var392; var396++) {
                                            var395[var396] = var391[var396];
                                        }
                                        var391 = var395;
                                    }
                                    var391[var392++] = (short) var393;
                                }
                                var393++;
                            }
                            field819[var5++] = Statics.field685;
                            continue;
                        }
                        if (var458 == 4211) {
                            if (Statics.field2164 != null && Statics.field151 < Statics.field685) {
                                field819[var5++] = Statics.field2164[++Statics.field151 - 1] & 0xFFFF;
                                continue;
                            }
                            field819[var5++] = -1;
                            continue;
                        }
                        if (var458 == 4212) {
                            Statics.field151 = 0;
                            continue;
                        }
                    } else if (var458 < 5100) {
                        if (var458 == 5000) {
                            field819[var5++] = client.field420;
                            continue;
                        }
                        if (var458 == 5001) {
                            var5 -= 3;
                            client.field420 = field819[var5];
                            int var399 = field819[var5 + 1];
                            class130[] var400 = class130.method2691();
                            int var401 = 0;
                            class130 var403;
                            while (true) {
                                if (var401 >= var400.length) {
                                    var403 = null;
                                    break;
                                }
                                class130 var402 = var400[var401];
                                if (var402.field2036 == var399) {
                                    var403 = var402;
                                    break;
                                }
                                var401++;
                            }
                            Statics.field271 = var403;
                            if (Statics.field271 == null) {
                                Statics.field271 = class130.field2034;
                            }
                            client.field506 = field819[var5 + 2];
                            client.field333.method2620(44);
                            client.field333.method2388(client.field420);
                            client.field333.method2388(Statics.field271.field2036);
                            client.field333.method2388(client.field506);
                            continue;
                        }
                        if (var458 == 5002) {
                            var6--;
                            String var404 = field807[var6];
                            var5 -= 2;
                            int var405 = field819[var5];
                            int var406 = field819[var5 + 1];
                            client.field333.method2620(71);
                            client.field333.method2388(class119.method2041(var404) + 2);
                            client.field333.method2348(var404);
                            client.field333.method2388(var405 - 1);
                            client.field333.method2388(var406);
                            continue;
                        }
                        if (var458 == 5003) {
                            var5 -= 2;
                            int var407 = field819[var5];
                            int var408 = field819[var5 + 1];
                            class28 var409 = (class28) class12.field183.get(var407);
                            class36 var410 = var409.method623(var408);
                            if (var410 == null) {
                                field819[var5++] = -1;
                                field819[var5++] = 0;
                                field807[var6++] = "";
                                field807[var6++] = "";
                                field807[var6++] = "";
                            } else {
                                field819[var5++] = var410.field791;
                                field819[var5++] = var410.field792;
                                field807[var6++] = var410.field799 == null ? "" : var410.field799;
                                field807[var6++] = var410.field795 == null ? "" : var410.field795;
                                field807[var6++] = var410.field796 == null ? "" : var410.field796;
                            }
                            continue;
                        }
                        if (var458 == 5004) {
                            var5--;
                            int var412 = field819[var5];
                            class36 var413 = class12.method2818(var412);
                            if (var413 == null) {
                                field819[var5++] = -1;
                                field819[var5++] = 0;
                                field807[var6++] = "";
                                field807[var6++] = "";
                                field807[var6++] = "";
                            } else {
                                field819[var5++] = var413.field793;
                                field819[var5++] = var413.field792;
                                field807[var6++] = var413.field799 == null ? "" : var413.field799;
                                field807[var6++] = var413.field795 == null ? "" : var413.field795;
                                field807[var6++] = var413.field796 == null ? "" : var413.field796;
                            }
                            continue;
                        }
                        if (var458 == 5005) {
                            if (Statics.field271 == null) {
                                field819[var5++] = -1;
                            } else {
                                field819[var5++] = Statics.field271.field2036;
                            }
                            continue;
                        }
                        if (var458 == 5008) {
                            var6--;
                            String var414 = field807[var6];
                            var5--;
                            int var415 = field819[var5];
                            String var416 = var414.toLowerCase();
                            byte var417 = 0;
                            if (var416.startsWith(class157.field2456)) {
                                var417 = 0;
                                var414 = var414.substring(class157.field2456.length());
                            } else if (var416.startsWith(class157.field2535)) {
                                var417 = 1;
                                var414 = var414.substring(class157.field2535.length());
                            } else if (var416.startsWith(class157.field2439)) {
                                var417 = 2;
                                var414 = var414.substring(class157.field2439.length());
                            } else if (var416.startsWith(class157.field2462)) {
                                var417 = 3;
                                var414 = var414.substring(class157.field2462.length());
                            } else if (var416.startsWith(class157.field2288)) {
                                var417 = 4;
                                var414 = var414.substring(class157.field2288.length());
                            } else if (var416.startsWith(class157.field2468)) {
                                var417 = 5;
                                var414 = var414.substring(class157.field2468.length());
                            } else if (var416.startsWith(class157.field2479)) {
                                var417 = 6;
                                var414 = var414.substring(class157.field2479.length());
                            } else if (var416.startsWith(class157.field2470)) {
                                var417 = 7;
                                var414 = var414.substring(class157.field2470.length());
                            } else if (var416.startsWith(class157.field2339)) {
                                var417 = 8;
                                var414 = var414.substring(class157.field2339.length());
                            } else if (var416.startsWith(class157.field2474)) {
                                var417 = 9;
                                var414 = var414.substring(class157.field2474.length());
                            } else if (var416.startsWith(class157.field2476)) {
                                var417 = 10;
                                var414 = var414.substring(class157.field2476.length());
                            } else if (var416.startsWith(class157.field2478)) {
                                var417 = 11;
                                var414 = var414.substring(class157.field2478.length());
                            } else if (client.field294 != 0) {
                                if (var416.startsWith(class157.field2457)) {
                                    var417 = 0;
                                    var414 = var414.substring(class157.field2457.length());
                                } else if (var416.startsWith(class157.field2307)) {
                                    var417 = 1;
                                    var414 = var414.substring(class157.field2307.length());
                                } else if (var416.startsWith(class157.field2461)) {
                                    var417 = 2;
                                    var414 = var414.substring(class157.field2461.length());
                                } else if (var416.startsWith(class157.field2463)) {
                                    var417 = 3;
                                    var414 = var414.substring(class157.field2463.length());
                                } else if (var416.startsWith(class157.field2465)) {
                                    var417 = 4;
                                    var414 = var414.substring(class157.field2465.length());
                                } else if (var416.startsWith(class157.field2398)) {
                                    var417 = 5;
                                    var414 = var414.substring(class157.field2398.length());
                                } else if (var416.startsWith(class157.field2469)) {
                                    var417 = 6;
                                    var414 = var414.substring(class157.field2469.length());
                                } else if (var416.startsWith(class157.field2471)) {
                                    var417 = 7;
                                    var414 = var414.substring(class157.field2471.length());
                                } else if (var416.startsWith(class157.field2473)) {
                                    var417 = 8;
                                    var414 = var414.substring(class157.field2473.length());
                                } else if (var416.startsWith(class157.field2475)) {
                                    var417 = 9;
                                    var414 = var414.substring(class157.field2475.length());
                                } else if (var416.startsWith(class157.field2287)) {
                                    var417 = 10;
                                    var414 = var414.substring(class157.field2287.length());
                                } else if (var416.startsWith(class157.field2480)) {
                                    var417 = 11;
                                    var414 = var414.substring(class157.field2480.length());
                                }
                            }
                            String var418 = var414.toLowerCase();
                            byte var419 = 0;
                            if (var418.startsWith(class157.field2533)) {
                                var419 = 1;
                                var414 = var414.substring(class157.field2533.length());
                            } else if (var418.startsWith(class157.field2531)) {
                                var419 = 2;
                                var414 = var414.substring(class157.field2531.length());
                            } else if (var418.startsWith(class157.field2484)) {
                                var419 = 3;
                                var414 = var414.substring(class157.field2484.length());
                            } else if (var418.startsWith(class157.field2486)) {
                                var419 = 4;
                                var414 = var414.substring(class157.field2486.length());
                            } else if (var418.startsWith(class157.field2537)) {
                                var419 = 5;
                                var414 = var414.substring(class157.field2537.length());
                            } else if (client.field294 != 0) {
                                if (var418.startsWith(class157.field2481)) {
                                    var419 = 1;
                                    var414 = var414.substring(class157.field2481.length());
                                } else if (var418.startsWith(class157.field2483)) {
                                    var419 = 2;
                                    var414 = var414.substring(class157.field2483.length());
                                } else if (var418.startsWith(class157.field2485)) {
                                    var419 = 3;
                                    var414 = var414.substring(class157.field2485.length());
                                } else if (var418.startsWith(class157.field2487)) {
                                    var419 = 4;
                                    var414 = var414.substring(class157.field2487.length());
                                } else if (var418.startsWith(class157.field2379)) {
                                    var419 = 5;
                                    var414 = var414.substring(class157.field2379.length());
                                }
                            }
                            client.field333.method2620(87);
                            client.field333.method2388(0);
                            int var420 = client.field333.field1966;
                            client.field333.method2388(var415);
                            client.field333.method2388(var417);
                            client.field333.method2388(var419);
                            class222.method543(client.field333, var414);
                            client.field333.method2505(client.field333.field1966 - var420);
                            continue;
                        }
                        if (var458 == 5009) {
                            var6 -= 2;
                            String var421 = field807[var6];
                            String var422 = field807[var6 + 1];
                            client.field333.method2620(248);
                            client.field333.method2343(0);
                            int var423 = client.field333.field1966;
                            client.field333.method2348(var421);
                            class122 var424 = client.field333;
                            int var425 = var424.field1966;
                            byte[] var426 = class165.method2285(var422);
                            var424.method2355(var426.length);
                            var424.field1966 += Statics.field3169.method2292(var426, 0, var426.length, var424.field1973, var424.field1966);
                            client.field333.method2353(client.field333.field1966 - var423);
                            continue;
                        }
                        if (var458 == 5015) {
                            String var427;
                            if (Statics.field2222 == null || Statics.field2222.field43 == null) {
                                var427 = "";
                            } else {
                                var427 = Statics.field2222.field43;
                            }
                            field807[var6++] = var427;
                            continue;
                        }
                        if (var458 == 5016) {
                            field819[var5++] = client.field506;
                            continue;
                        }
                        if (var458 == 5017) {
                            var5--;
                            int var428 = field819[var5];
                            field819[var5++] = class12.method3276(var428);
                            continue;
                        }
                        if (var458 == 5018) {
                            var5--;
                            int var429 = field819[var5];
                            field819[var5++] = class12.method3023(var429);
                            continue;
                        }
                        if (var458 == 5019) {
                            var5--;
                            int var430 = field819[var5];
                            field819[var5++] = class12.method2057(var430);
                            continue;
                        }
                        if (var458 == 5020) {
                            var6--;
                            String var431 = field807[var6];
                            if (var431.equalsIgnoreCase("toggleroof")) {
                                Statics.field1752.field143 = !Statics.field1752.field143;
                                class9.method2975();
                                if (Statics.field1752.field143) {
                                    class12.method2966(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method2966(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var431.equalsIgnoreCase("displayfps")) {
                                client.field305 = !client.field305;
                            }
                            if (client.field456 >= 2) {
                                if (var431.equalsIgnoreCase("fpson")) {
                                    client.field305 = true;
                                }
                                if (var431.equalsIgnoreCase("fpsoff")) {
                                    client.field305 = false;
                                }
                                if (var431.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var431.equalsIgnoreCase("clientdrop")) {
                                    client.method3208();
                                }
                                if (var431.equalsIgnoreCase("errortest") && client.field376 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field333.method2620(78);
                            client.field333.method2388(var431.length() + 1);
                            client.field333.method2348(var431);
                            continue;
                        }
                        if (var458 == 5021) {
                            var6--;
                            client.field341 = field807[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var458 == 5022) {
                            field807[var6++] = client.field341;
                            continue;
                        }
                    }
                }
                if (var458 < 5400) {
                    if (var458 == 5306) {
                        int[] var432 = field819;
                        int var433 = var5++;
                        int var434 = client.field496 ? 2 : 1;
                        var432[var433] = var434;
                        continue;
                    }
                    if (var458 == 5307) {
                        var5--;
                        int var435 = field819[var5];
                        if (var435 != 1 && var435 != 2) {
                            continue;
                        }
                        client.field331 = 0L;
                        if (var435 >= 2) {
                            client.field496 = true;
                        } else {
                            client.field496 = false;
                        }
                        client.method2144();
                        if (client.field423 >= 25) {
                            client.field333.method2620(23);
                            class122 var436 = client.field333;
                            int var437 = client.field496 ? 2 : 1;
                            var436.method2388(var437);
                            client.field333.method2343(Statics.field1778);
                            client.field333.method2343(Statics.field2681);
                        }
                        class144.field2178 = true;
                        continue;
                    }
                    if (var458 == 5308) {
                        field819[var5++] = Statics.field1752.field145;
                        continue;
                    }
                    if (var458 == 5309) {
                        var5--;
                        int var438 = field819[var5];
                        if (var438 == 1 || var438 == 2) {
                            Statics.field1752.field145 = var438;
                            class9.method2975();
                        }
                        continue;
                    }
                }
                if (var458 < 5600) {
                    if (var458 == 5504) {
                        var5 -= 2;
                        int var439 = field819[var5];
                        int var440 = field819[var5 + 1];
                        if (!client.field344) {
                            client.field350 = var439;
                            client.field285 = var440;
                        }
                        continue;
                    }
                    if (var458 == 5505) {
                        field819[var5++] = client.field350;
                        continue;
                    }
                    if (var458 == 5506) {
                        field819[var5++] = client.field285;
                        continue;
                    }
                    if (var458 == 5530) {
                        var5--;
                        int var441 = field819[var5];
                        if (var441 < 0) {
                            var441 = 0;
                        }
                        client.field509 = var441;
                        continue;
                    }
                    if (var458 == 5531) {
                        field819[var5++] = client.field509;
                        continue;
                    }
                }
                if (var458 >= 5700 || var458 != 5630) {
                    if (var458 < 6300) {
                        if (var458 == 6200) {
                            var5 -= 2;
                            client.field502 = (short) field819[var5];
                            if (client.field502 <= 0) {
                                client.field502 = 256;
                            }
                            client.field546 = (short) field819[var5 + 1];
                            if (client.field546 <= 0) {
                                client.field546 = 205;
                            }
                            continue;
                        }
                        if (var458 == 6201) {
                            var5 -= 2;
                            client.field547 = (short) field819[var5];
                            if (client.field547 <= 0) {
                                client.field547 = 256;
                            }
                            client.field297 = (short) field819[var5 + 1];
                            if (client.field297 <= 0) {
                                client.field297 = 320;
                            }
                            continue;
                        }
                        if (var458 == 6202) {
                            var5 -= 4;
                            client.field549 = (short) field819[var5];
                            if (client.field549 <= 0) {
                                client.field549 = 1;
                            }
                            client.field441 = (short) field819[var5 + 1];
                            if (client.field441 <= 0) {
                                client.field441 = 32767;
                            } else if (client.field441 < client.field549) {
                                client.field441 = client.field549;
                            }
                            client.field551 = (short) field819[var5 + 2];
                            if (client.field551 <= 0) {
                                client.field551 = 1;
                            }
                            client.field552 = (short) field819[var5 + 3];
                            if (client.field552 <= 0) {
                                client.field552 = 32767;
                            } else if (client.field552 < client.field551) {
                                client.field552 = client.field551;
                            }
                            continue;
                        }
                        if (var458 == 6203) {
                            if (client.field566 == null) {
                                field819[var5++] = -1;
                                field819[var5++] = -1;
                            } else {
                                client.method1229(0, 0, client.field566.field2745, client.field566.field2779, false);
                                field819[var5++] = client.field482;
                                field819[var5++] = client.field342;
                            }
                            continue;
                        }
                        if (var458 == 6204) {
                            field819[var5++] = client.field547;
                            field819[var5++] = client.field297;
                            continue;
                        }
                        if (var458 == 6205) {
                            field819[var5++] = client.field502;
                            field819[var5++] = client.field546;
                            continue;
                        }
                    }
                    if (var458 < 6600) {
                        if (var458 == 6500) {
                            field819[var5++] = class26.method161() ? 1 : 0;
                            continue;
                        }
                        if (var458 == 6501) {
                            class26 var442 = class26.method697();
                            if (var442 == null) {
                                field819[var5++] = -1;
                                field819[var5++] = 0;
                                field807[var6++] = "";
                                field819[var5++] = 0;
                                field819[var5++] = 0;
                                field807[var6++] = "";
                            } else {
                                field819[var5++] = var442.field656;
                                field819[var5++] = var442.field648;
                                field807[var6++] = var442.field639;
                                field819[var5++] = var442.field653;
                                field819[var5++] = var442.field649;
                                field807[var6++] = var442.field650;
                            }
                            continue;
                        }
                        if (var458 == 6502) {
                            class26 var443;
                            if (class26.field655 < class26.field647) {
                                var443 = Statics.field642[++class26.field655 - 1];
                            } else {
                                var443 = null;
                            }
                            if (var443 == null) {
                                field819[var5++] = -1;
                                field819[var5++] = 0;
                                field807[var6++] = "";
                                field819[var5++] = 0;
                                field819[var5++] = 0;
                                field807[var6++] = "";
                            } else {
                                field819[var5++] = var443.field656;
                                field819[var5++] = var443.field648;
                                field807[var6++] = var443.field639;
                                field819[var5++] = var443.field653;
                                field819[var5++] = var443.field649;
                                field807[var6++] = var443.field650;
                            }
                            continue;
                        }
                        if (var458 == 6506) {
                            var5--;
                            int var445 = field819[var5];
                            class26 var446 = null;
                            for (int var447 = 0; var447 < class26.field647; var447++) {
                                if (Statics.field642[var447].field656 == var445) {
                                    var446 = Statics.field642[var447];
                                    break;
                                }
                            }
                            if (var446 == null) {
                                field819[var5++] = -1;
                                field819[var5++] = 0;
                                field807[var6++] = "";
                                field819[var5++] = 0;
                                field819[var5++] = 0;
                                field807[var6++] = "";
                            } else {
                                field819[var5++] = var446.field656;
                                field819[var5++] = var446.field648;
                                field807[var6++] = var446.field639;
                                field819[var5++] = var446.field653;
                                field819[var5++] = var446.field649;
                                field807[var6++] = var446.field650;
                            }
                            continue;
                        }
                        if (var458 == 6507) {
                            var5 -= 4;
                            int var448 = field819[var5];
                            boolean var449 = field819[var5 + 1] == 1;
                            int var450 = field819[var5 + 2];
                            boolean var451 = field819[var5 + 3] == 1;
                            if (Statics.field642 != null) {
                                class26.method561(0, Statics.field642.length - 1, var448, var449, var450, var451);
                            }
                            continue;
                        }
                        if (var458 == 6511) {
                            var5--;
                            int var452 = field819[var5];
                            if (var452 >= 0 && var452 < class26.field647) {
                                class26 var453 = Statics.field642[var452];
                                field819[var5++] = var453.field656;
                                field819[var5++] = var453.field648;
                                field807[var6++] = var453.field639;
                                field819[var5++] = var453.field653;
                                field819[var5++] = var453.field649;
                                field807[var6++] = var453.field650;
                                continue;
                            }
                            field819[var5++] = -1;
                            field819[var5++] = 0;
                            field807[var6++] = "";
                            field819[var5++] = 0;
                            field819[var5++] = 0;
                            field807[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field343 = 250;
            }
        } catch (Exception var457) {
            StringBuilder var455 = new StringBuilder(30);
            var455.append("").append(var4.field3107).append(" ");
            for (int var456 = field810 - 1; var456 >= 0; var456--) {
                var455.append("").append(field808[var456].field208.field3107).append(" ");
            }
            var455.append("").append(var10);
            class148.method2734(var455.toString(), var457);
        }
    }

    @ObfuscatedName("e.v(II)V")
    public static void method113(int arg0) {
        if (arg0 == -1 || !class173.method911(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2761[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2809 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field4 = var3.field2809;
                method2672(var4, 2000000);
            }
        }
    }
}
