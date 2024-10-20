package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ap")
public class class37 {

    @ObfuscatedName("ap.u")
    public static int[] field789 = new int[5];

    @ObfuscatedName("ap.a")
    public static int[][] field793 = new int[5][5000];

    @ObfuscatedName("ap.h")
    public static int[] field787 = new int[1000];

    @ObfuscatedName("ap.i")
    public static String[] field788 = new String[1000];

    @ObfuscatedName("ap.t")
    public static int field792 = 0;

    @ObfuscatedName("ap.k")
    public static class15[] field790 = new class15[50];

    @ObfuscatedName("ap.e")
    public static Calendar field791 = Calendar.getInstance();

    @ObfuscatedName("ap.z")
    public static final String[] field785 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ap.p")
    public static int field781 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fl.j(Lj;I)V")
    public static void method3221(class1 arg0) {
        method2963(arg0, 200000);
    }

    @ObfuscatedName("ez.m(Lj;IS)V")
    public static void method2963(class1 arg0, int arg1) {
        Object[] var2 = arg0.field11;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method2800(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field579;
        int[] var9 = var4.field577;
        byte var10 = -1;
        field792 = 0;
        try {
            Statics.field783 = new int[var4.field584];
            int var11 = 0;
            Statics.field784 = new String[var4.field580];
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
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2735;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field17;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2736;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field16 == null ? -1 : arg0.field16.field2735;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field16 == null ? -1 : arg0.field16.field2736;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field783[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field7;
                    }
                    Statics.field784[var12++] = var15;
                }
            }
            int var16 = 0;
            field781 = arg0.field1;
            label3064: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var488 = var8[var7];
                if (var488 < 100) {
                    if (var488 == 0) {
                        field787[var5++] = var9[var7];
                        continue;
                    }
                    if (var488 == 1) {
                        int var17 = var9[var7];
                        field787[var5++] = class176.field2885[var17];
                        continue;
                    }
                    if (var488 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2885[var18] = field787[var5];
                        client.method2724(var18);
                        continue;
                    }
                    if (var488 == 3) {
                        field788[var6++] = var4.field575[var7];
                        continue;
                    }
                    if (var488 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var488 == 7) {
                        var5 -= 2;
                        if (field787[var5 + 1] != field787[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var488 == 8) {
                        var5 -= 2;
                        if (field787[var5 + 1] == field787[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var488 == 9) {
                        var5 -= 2;
                        if (field787[var5] < field787[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var488 == 10) {
                        var5 -= 2;
                        if (field787[var5] > field787[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var488 == 21) {
                        if (field792 == 0) {
                            return;
                        }
                        class15 var19 = field790[--field792];
                        var4 = var19.field212;
                        var8 = var4.field579;
                        var9 = var4.field577;
                        var7 = var19.field204;
                        Statics.field783 = var19.field205;
                        Statics.field784 = var19.field206;
                        continue;
                    }
                    if (var488 == 25) {
                        int var20 = var9[var7];
                        field787[var5++] = class176.method2999(var20);
                        continue;
                    }
                    if (var488 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class176.method2058(var21, field787[var5]);
                        continue;
                    }
                    if (var488 == 31) {
                        var5 -= 2;
                        if (field787[var5] <= field787[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var488 == 32) {
                        var5 -= 2;
                        if (field787[var5] >= field787[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var488 == 33) {
                        field787[var5++] = Statics.field783[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var488 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field783[var10001] = field787[var5];
                        continue;
                    }
                    if (var488 == 35) {
                        field788[var6++] = Statics.field784[var9[var7]];
                        continue;
                    }
                    if (var488 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field784[var10001] = field788[var6];
                        continue;
                    }
                    if (var488 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class163.method1012(field788, var6, var22);
                        field788[var6++] = var23;
                        continue;
                    }
                    if (var488 == 38) {
                        var5--;
                        continue;
                    }
                    if (var488 == 39) {
                        var6--;
                        continue;
                    }
                    if (var488 == 40) {
                        int var24 = var9[var7];
                        class23 var25 = class23.method2800(var24);
                        int[] var26 = new int[var25.field584];
                        String[] var27 = new String[var25.field580];
                        for (int var28 = 0; var28 < var25.field581; var28++) {
                            var26[var28] = field787[var5 - var25.field581 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field582; var29++) {
                            var27[var29] = field788[var6 - var25.field582 + var29];
                        }
                        var5 -= var25.field581;
                        var6 -= var25.field582;
                        class15 var30 = new class15();
                        var30.field212 = var4;
                        var30.field204 = var7;
                        var30.field205 = Statics.field783;
                        var30.field206 = Statics.field784;
                        field790[++field792 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field579;
                        var9 = var25.field577;
                        var7 = -1;
                        Statics.field783 = var26;
                        Statics.field784 = var27;
                        continue;
                    }
                    if (var488 == 42) {
                        field787[var5++] = Statics.field1440.method223(var9[var7]);
                        continue;
                    }
                    if (var488 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1440.method215(var10001, field787[var5]);
                        continue;
                    }
                    if (var488 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field787[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field789[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label3064;
                                }
                                field793[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var488 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field787[var5];
                        if (var37 >= 0 && var37 < field789[var36]) {
                            field787[var5++] = field793[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var488 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field787[var5];
                        if (var39 >= 0 && var39 < field789[var38]) {
                            field793[var38][var39] = field787[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var488 == 47) {
                        String var40 = Statics.field1440.method219(var9[var7]);
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field788[var6++] = var40;
                        continue;
                    }
                    if (var488 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1440.method238(var10001, field788[var6]);
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var488 < 1000) {
                    if (var488 == 100) {
                        var5 -= 3;
                        int var42 = field787[var5];
                        int var43 = field787[var5 + 1];
                        int var44 = field787[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var45 = class173.method1002(var42);
                        if (var45.field2807 == null) {
                            var45.field2807 = new class173[var44 + 1];
                        }
                        if (var45.field2807.length <= var44) {
                            class173[] var46 = new class173[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2807.length; var47++) {
                                var46[var47] = var45.field2807[var47];
                            }
                            var45.field2807 = var46;
                        }
                        if (var44 > 0 && var45.field2807[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class173 var48 = new class173();
                        var48.field2737 = var43;
                        var48.field2743 = var48.field2735 = var45.field2735;
                        var48.field2736 = var44;
                        var48.field2734 = true;
                        var45.field2807[var44] = var48;
                        if (var41) {
                            Statics.field2245 = var48;
                        } else {
                            Statics.field1939 = var48;
                        }
                        client.method908(var45);
                        continue;
                    }
                    if (var488 == 101) {
                        class173 var49 = var41 ? Statics.field2245 : Statics.field1939;
                        class173 var50 = class173.method1002(var49.field2735);
                        var50.field2807[var49.field2736] = null;
                        client.method908(var50);
                        continue;
                    }
                    if (var488 == 102) {
                        var5--;
                        class173 var51 = class173.method1002(field787[var5]);
                        var51.field2807 = null;
                        client.method908(var51);
                        continue;
                    }
                    if (var488 == 200) {
                        var5 -= 2;
                        int var52 = field787[var5];
                        int var53 = field787[var5 + 1];
                        class173 var54 = class173.method3744(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field787[var5++] = 1;
                            if (var41) {
                                Statics.field2245 = var54;
                            } else {
                                Statics.field1939 = var54;
                            }
                            continue;
                        }
                        field787[var5++] = 0;
                        continue;
                    }
                    if (var488 == 201) {
                        var5--;
                        class173 var55 = class173.method1002(field787[var5]);
                        if (var55 == null) {
                            field787[var5++] = 0;
                        } else {
                            field787[var5++] = 1;
                            if (var41) {
                                Statics.field2245 = var55;
                            } else {
                                Statics.field1939 = var55;
                            }
                        }
                        continue;
                    }
                } else if (var488 >= 1000 && var488 < 1100 || var488 >= 2000 && var488 < 2100) {
                    int var56 = -1;
                    class173 var57;
                    if (var488 >= 2000) {
                        var488 -= 1000;
                        var5--;
                        var56 = field787[var5];
                        var57 = class173.method1002(var56);
                    } else {
                        var57 = var41 ? Statics.field2245 : Statics.field1939;
                    }
                    if (var488 == 1000) {
                        var5 -= 4;
                        var57.field2744 = field787[var5];
                        var57.field2793 = field787[var5 + 1];
                        var57.field2740 = field787[var5 + 2];
                        var57.field2741 = field787[var5 + 3];
                        client.method908(var57);
                        client.method185(var57);
                        if (var56 != -1 && var57.field2737 == 0) {
                            client.method735(Statics.field2858[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var488 == 1001) {
                        var5 -= 4;
                        var57.field2861 = field787[var5];
                        var57.field2747 = field787[var5 + 1];
                        var57.field2742 = field787[var5 + 2];
                        var57.field2838 = field787[var5 + 3];
                        client.method908(var57);
                        client.method185(var57);
                        if (var56 != -1 && var57.field2737 == 0) {
                            client.method735(Statics.field2858[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var488 == 1003) {
                        var5--;
                        boolean var58 = field787[var5] == 1;
                        if (var57.field2725 != var58) {
                            var57.field2725 = var58;
                            client.method908(var57);
                        }
                        continue;
                    }
                    if (var488 == 1005) {
                        var5--;
                        var57.field2866 = field787[var5] == 1;
                        continue;
                    }
                    if (var488 == 1006) {
                        var5--;
                        var57.field2748 = field787[var5] == 1;
                        continue;
                    }
                } else if (!(var488 < 1100 || var488 >= 1200) || !(var488 < 2100 || var488 >= 2200)) {
                    int var59 = -1;
                    class173 var60;
                    if (var488 >= 2000) {
                        var488 -= 1000;
                        var5--;
                        var59 = field787[var5];
                        var60 = class173.method1002(var59);
                    } else {
                        var60 = var41 ? Statics.field2245 : Statics.field1939;
                    }
                    if (var488 == 1100) {
                        var5 -= 2;
                        var60.field2756 = field787[var5];
                        if (var60.field2756 > var60.field2857 - var60.field2750) {
                            var60.field2756 = var60.field2857 - var60.field2750;
                        }
                        if (var60.field2756 < 0) {
                            var60.field2756 = 0;
                        }
                        var60.field2763 = field787[var5 + 1];
                        if (var60.field2763 > var60.field2766 - var60.field2751) {
                            var60.field2763 = var60.field2766 - var60.field2751;
                        }
                        if (var60.field2763 < 0) {
                            var60.field2763 = 0;
                        }
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1101) {
                        var5--;
                        var60.field2825 = field787[var5];
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1102) {
                        var5--;
                        var60.field2764 = field787[var5] == 1;
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1103) {
                        var5--;
                        var60.field2785 = field787[var5];
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1104) {
                        var5--;
                        var60.field2833 = field787[var5];
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1105) {
                        var5--;
                        var60.field2867 = field787[var5];
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1106) {
                        var5--;
                        var60.field2770 = field787[var5];
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1107) {
                        var5--;
                        var60.field2771 = field787[var5] == 1;
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1108) {
                        var60.field2778 = 1;
                        var5--;
                        var60.field2777 = field787[var5];
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1109) {
                        var5 -= 6;
                        var60.field2782 = field787[var5];
                        var60.field2783 = field787[var5 + 1];
                        var60.field2784 = field787[var5 + 2];
                        var60.field2761 = field787[var5 + 3];
                        var60.field2786 = field787[var5 + 4];
                        var60.field2788 = field787[var5 + 5];
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1110) {
                        var5--;
                        int var61 = field787[var5];
                        if (var60.field2803 != var61) {
                            var60.field2803 = var61;
                            var60.field2855 = 0;
                            var60.field2774 = 0;
                            client.method908(var60);
                        }
                        continue;
                    }
                    if (var488 == 1111) {
                        var5--;
                        var60.field2754 = field787[var5] == 1;
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1112) {
                        var6--;
                        String var62 = field788[var6];
                        if (!var62.equals(var60.field2757)) {
                            var60.field2757 = var62;
                            client.method908(var60);
                        }
                        continue;
                    }
                    if (var488 == 1113) {
                        var5--;
                        var60.field2792 = field787[var5];
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1114) {
                        var5 -= 3;
                        var60.field2796 = field787[var5];
                        var60.field2797 = field787[var5 + 1];
                        var60.field2789 = field787[var5 + 2];
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1115) {
                        var5--;
                        var60.field2745 = field787[var5] == 1;
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1116) {
                        var5--;
                        var60.field2772 = field787[var5];
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1117) {
                        var5--;
                        var60.field2773 = field787[var5];
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1118) {
                        var5--;
                        var60.field2791 = field787[var5] == 1;
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1119) {
                        var5--;
                        var60.field2775 = field787[var5] == 1;
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1120) {
                        var5 -= 2;
                        var60.field2857 = field787[var5];
                        var60.field2766 = field787[var5 + 1];
                        client.method908(var60);
                        if (var59 != -1 && var60.field2737 == 0) {
                            client.method735(Statics.field2858[var59 >> 16], var60, false);
                        }
                        continue;
                    }
                    if (var488 == 1121) {
                        client.method2059(var60.field2735, var60.field2736);
                        client.field546 = var60;
                        client.method908(var60);
                        continue;
                    }
                    if (var488 == 1122) {
                        var5--;
                        var60.field2769 = field787[var5];
                        client.method908(var60);
                        continue;
                    }
                } else if (var488 >= 1200 && var488 < 1300 || var488 >= 2200 && var488 < 2300) {
                    class173 var63;
                    if (var488 >= 2000) {
                        var488 -= 1000;
                        var5--;
                        var63 = class173.method1002(field787[var5]);
                    } else {
                        var63 = var41 ? Statics.field2245 : Statics.field1939;
                    }
                    client.method908(var63);
                    if (var488 == 1200 || var488 == 1205 || var488 == 1212) {
                        var5 -= 2;
                        int var64 = field787[var5];
                        int var65 = field787[var5 + 1];
                        var63.field2853 = var64;
                        var63.field2854 = var65;
                        class52 var66 = class52.method154(var64);
                        var63.field2784 = var66.field1106;
                        var63.field2761 = var66.field1104;
                        var63.field2786 = var66.field1090;
                        var63.field2782 = var66.field1140;
                        var63.field2783 = var66.field1131;
                        var63.field2788 = var66.field1130;
                        if (var488 == 1205) {
                            var63.field2780 = 0;
                        } else if (var488 == 1212 | var66.field1111 == 1) {
                            var63.field2780 = 1;
                        } else {
                            var63.field2780 = 2;
                        }
                        if (var63.field2790 > 0) {
                            var63.field2788 = var63.field2788 * 32 / var63.field2790;
                        } else if (var63.field2861 > 0) {
                            var63.field2788 = var63.field2788 * 32 / var63.field2861;
                        }
                        continue;
                    }
                    if (var488 == 1201) {
                        var63.field2778 = 2;
                        var5--;
                        var63.field2777 = field787[var5];
                        continue;
                    }
                    if (var488 == 1202) {
                        var63.field2778 = 3;
                        var63.field2777 = Statics.field13.field32.method3321();
                        continue;
                    }
                } else if ((var488 < 1300 || var488 >= 1400) && (var488 < 2300 || var488 >= 2400)) {
                    if (var488 >= 1400 && var488 < 1500 || var488 >= 2400 && var488 < 2500) {
                        class173 var71;
                        if (var488 >= 2000) {
                            var488 -= 1000;
                            var5--;
                            var71 = class173.method1002(field787[var5]);
                        } else {
                            var71 = var41 ? Statics.field2245 : Statics.field1939;
                        }
                        var6--;
                        String var72 = field788[var6];
                        int[] var73 = null;
                        if (var72.length() > 0 && var72.charAt(var72.length() - 1) == 'Y') {
                            var5--;
                            int var74 = field787[var5];
                            if (var74 > 0) {
                                var73 = new int[var74];
                                while (var74-- > 0) {
                                    var5--;
                                    var73[var74] = field787[var5];
                                }
                            }
                            var72 = var72.substring(0, var72.length() - 1);
                        }
                        Object[] var75 = new Object[var72.length() + 1];
                        for (int var76 = var75.length - 1; var76 >= 1; var76--) {
                            if (var72.charAt(var76 - 1) == 's') {
                                var6--;
                                var75[var76] = field788[var6];
                            } else {
                                var5--;
                                var75[var76] = Integer.valueOf(field787[var5]);
                            }
                        }
                        var5--;
                        int var77 = field787[var5];
                        if (var77 == -1) {
                            var75 = null;
                        } else {
                            var75[0] = Integer.valueOf(var77);
                        }
                        if (var488 == 1400) {
                            var71.field2815 = var75;
                        }
                        if (var488 == 1401) {
                            var71.field2818 = var75;
                        }
                        if (var488 == 1402) {
                            var71.field2856 = var75;
                        }
                        if (var488 == 1403) {
                            var71.field2760 = var75;
                        }
                        if (var488 == 1404) {
                            var71.field2821 = var75;
                        }
                        if (var488 == 1405) {
                            var71.field2822 = var75;
                        }
                        if (var488 == 1406) {
                            var71.field2817 = var75;
                        }
                        if (var488 == 1407) {
                            var71.field2826 = var75;
                            var71.field2827 = var73;
                        }
                        if (var488 == 1408) {
                            var71.field2832 = var75;
                        }
                        if (var488 == 1409) {
                            var71.field2767 = var75;
                        }
                        if (var488 == 1410) {
                            var71.field2823 = var75;
                        }
                        if (var488 == 1411) {
                            var71.field2816 = var75;
                        }
                        if (var488 == 1412) {
                            var71.field2799 = var75;
                        }
                        if (var488 == 1414) {
                            var71.field2828 = var75;
                            var71.field2758 = var73;
                        }
                        if (var488 == 1415) {
                            var71.field2830 = var75;
                            var71.field2795 = var73;
                        }
                        if (var488 == 1416) {
                            var71.field2859 = var75;
                        }
                        if (var488 == 1417) {
                            var71.field2808 = var75;
                        }
                        if (var488 == 1418) {
                            var71.field2835 = var75;
                        }
                        if (var488 == 1419) {
                            var71.field2733 = var75;
                        }
                        if (var488 == 1420) {
                            var71.field2837 = var75;
                        }
                        if (var488 == 1421) {
                            var71.field2755 = var75;
                        }
                        if (var488 == 1422) {
                            var71.field2839 = var75;
                        }
                        if (var488 == 1423) {
                            var71.field2836 = var75;
                        }
                        if (var488 == 1424) {
                            var71.field2841 = var75;
                        }
                        if (var488 == 1425) {
                            var71.field2843 = var75;
                        }
                        if (var488 == 1426) {
                            var71.field2844 = var75;
                        }
                        if (var488 == 1427) {
                            var71.field2842 = var75;
                        }
                        var71.field2813 = true;
                        continue;
                    }
                    if (var488 < 1600) {
                        class173 var78 = var41 ? Statics.field2245 : Statics.field1939;
                        if (var488 == 1500) {
                            field787[var5++] = var78.field2847;
                            continue;
                        }
                        if (var488 == 1501) {
                            field787[var5++] = var78.field2749;
                            continue;
                        }
                        if (var488 == 1502) {
                            field787[var5++] = var78.field2750;
                            continue;
                        }
                        if (var488 == 1503) {
                            field787[var5++] = var78.field2751;
                            continue;
                        }
                        if (var488 == 1504) {
                            field787[var5++] = var78.field2725 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 1505) {
                            field787[var5++] = var78.field2743;
                            continue;
                        }
                    } else if (var488 < 1700) {
                        class173 var79 = var41 ? Statics.field2245 : Statics.field1939;
                        if (var488 == 1600) {
                            field787[var5++] = var79.field2756;
                            continue;
                        }
                        if (var488 == 1601) {
                            field787[var5++] = var79.field2763;
                            continue;
                        }
                        if (var488 == 1602) {
                            field788[var6++] = var79.field2757;
                            continue;
                        }
                        if (var488 == 1603) {
                            field787[var5++] = var79.field2857;
                            continue;
                        }
                        if (var488 == 1604) {
                            field787[var5++] = var79.field2766;
                            continue;
                        }
                        if (var488 == 1605) {
                            field787[var5++] = var79.field2788;
                            continue;
                        }
                        if (var488 == 1606) {
                            field787[var5++] = var79.field2784;
                            continue;
                        }
                        if (var488 == 1607) {
                            field787[var5++] = var79.field2786;
                            continue;
                        }
                        if (var488 == 1608) {
                            field787[var5++] = var79.field2761;
                            continue;
                        }
                        if (var488 == 1609) {
                            field787[var5++] = var79.field2785;
                            continue;
                        }
                    } else if (var488 < 1800) {
                        class173 var80 = var41 ? Statics.field2245 : Statics.field1939;
                        if (var488 == 1700) {
                            field787[var5++] = var80.field2853;
                            continue;
                        }
                        if (var488 == 1701) {
                            if (var80.field2853 == -1) {
                                field787[var5++] = 0;
                            } else {
                                field787[var5++] = var80.field2854;
                            }
                            continue;
                        }
                        if (var488 == 1702) {
                            field787[var5++] = var80.field2736;
                            continue;
                        }
                    } else if (var488 < 1900) {
                        class173 var81 = var41 ? Statics.field2245 : Statics.field1939;
                        if (var488 == 1800) {
                            int[] var82 = field787;
                            int var83 = var5++;
                            int var84 = client.method122(var81);
                            int var85 = var84 >> 11 & 0x3F;
                            var82[var83] = var85;
                            continue;
                        }
                        if (var488 == 1801) {
                            var5--;
                            int var86 = field787[var5];
                            int var489 = var86 - 1;
                            if (var81.field2787 != null && var489 < var81.field2787.length && var81.field2787[var489] != null) {
                                field788[var6++] = var81.field2787[var489];
                                continue;
                            }
                            field788[var6++] = "";
                            continue;
                        }
                        if (var488 == 1802) {
                            if (var81.field2806 == null) {
                                field788[var6++] = "";
                            } else {
                                field788[var6++] = var81.field2806;
                            }
                            continue;
                        }
                    } else if (!(var488 < 1900 || var488 >= 2000) || !(var488 < 2900 || var488 >= 3000)) {
                        class173 var87;
                        if (var488 >= 2000) {
                            var488 -= 1000;
                            var5--;
                            var87 = class173.method1002(field787[var5]);
                        } else {
                            var87 = var41 ? Statics.field2245 : Statics.field1939;
                        }
                        if (var488 == 1927) {
                            if (field781 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var87.field2842 == null) {
                                return;
                            }
                            class1 var88 = new class1();
                            var88.field3 = var87;
                            var88.field11 = var87.field2842;
                            var88.field1 = field781 + 1;
                            client.field474.method3603(arg0);
                            continue;
                        }
                    } else if (var488 < 2600) {
                        var5--;
                        class173 var89 = class173.method1002(field787[var5]);
                        if (var488 == 2500) {
                            field787[var5++] = var89.field2847;
                            continue;
                        }
                        if (var488 == 2501) {
                            field787[var5++] = var89.field2749;
                            continue;
                        }
                        if (var488 == 2502) {
                            field787[var5++] = var89.field2750;
                            continue;
                        }
                        if (var488 == 2503) {
                            field787[var5++] = var89.field2751;
                            continue;
                        }
                        if (var488 == 2504) {
                            field787[var5++] = var89.field2725 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 2505) {
                            field787[var5++] = var89.field2743;
                            continue;
                        }
                    } else if (var488 < 2700) {
                        var5--;
                        class173 var90 = class173.method1002(field787[var5]);
                        if (var488 == 2600) {
                            field787[var5++] = var90.field2756;
                            continue;
                        }
                        if (var488 == 2601) {
                            field787[var5++] = var90.field2763;
                            continue;
                        }
                        if (var488 == 2602) {
                            field788[var6++] = var90.field2757;
                            continue;
                        }
                        if (var488 == 2603) {
                            field787[var5++] = var90.field2857;
                            continue;
                        }
                        if (var488 == 2604) {
                            field787[var5++] = var90.field2766;
                            continue;
                        }
                        if (var488 == 2605) {
                            field787[var5++] = var90.field2788;
                            continue;
                        }
                        if (var488 == 2606) {
                            field787[var5++] = var90.field2784;
                            continue;
                        }
                        if (var488 == 2607) {
                            field787[var5++] = var90.field2786;
                            continue;
                        }
                        if (var488 == 2608) {
                            field787[var5++] = var90.field2761;
                            continue;
                        }
                        if (var488 == 2609) {
                            field787[var5++] = var90.field2785;
                            continue;
                        }
                    } else if (var488 < 2800) {
                        if (var488 == 2700) {
                            var5--;
                            class173 var91 = class173.method1002(field787[var5]);
                            field787[var5++] = var91.field2853;
                            continue;
                        }
                        if (var488 == 2701) {
                            var5--;
                            class173 var92 = class173.method1002(field787[var5]);
                            if (var92.field2853 == -1) {
                                field787[var5++] = 0;
                            } else {
                                field787[var5++] = var92.field2854;
                            }
                            continue;
                        }
                        if (var488 == 2702) {
                            var5--;
                            int var93 = field787[var5];
                            class4 var94 = (class4) client.field305.method3571((long) var93);
                            if (var94 == null) {
                                field787[var5++] = 0;
                            } else {
                                field787[var5++] = 1;
                            }
                            continue;
                        }
                        if (var488 == 2706) {
                            field787[var5++] = client.field439;
                            continue;
                        }
                    } else if (var488 < 2900) {
                        var5--;
                        class173 var95 = class173.method1002(field787[var5]);
                        if (var488 == 2800) {
                            int[] var96 = field787;
                            int var97 = var5++;
                            int var98 = client.method122(var95);
                            int var99 = var98 >> 11 & 0x3F;
                            var96[var97] = var99;
                            continue;
                        }
                        if (var488 == 2801) {
                            var5--;
                            int var100 = field787[var5];
                            int var490 = var100 - 1;
                            if (var95.field2787 != null && var490 < var95.field2787.length && var95.field2787[var490] != null) {
                                field788[var6++] = var95.field2787[var490];
                                continue;
                            }
                            field788[var6++] = "";
                            continue;
                        }
                        if (var488 == 2802) {
                            if (var95.field2806 == null) {
                                field788[var6++] = "";
                            } else {
                                field788[var6++] = var95.field2806;
                            }
                            continue;
                        }
                    } else if (var488 < 3200) {
                        if (var488 == 3100) {
                            var6--;
                            String var101 = field788[var6];
                            class12.method1029(0, "", var101);
                            continue;
                        }
                        if (var488 == 3101) {
                            var5 -= 2;
                            client.method3263(Statics.field13, field787[var5], field787[var5 + 1]);
                            continue;
                        }
                        if (var488 == 3103) {
                            client.method587();
                            continue;
                        }
                        if (var488 == 3104) {
                            var6--;
                            String var102 = field788[var6];
                            int var103 = 0;
                            if (class163.method213(var102)) {
                                int var104 = class163.method576(var102, 10, true);
                                var103 = var104;
                            }
                            client.field319.method2621(9);
                            client.field319.method2360(var103);
                            continue;
                        }
                        if (var488 == 3105) {
                            var6--;
                            String var105 = field788[var6];
                            client.field319.method2621(106);
                            client.field319.method2357(var105.length() + 1);
                            client.field319.method2363(var105);
                            continue;
                        }
                        if (var488 == 3106) {
                            var6--;
                            String var106 = field788[var6];
                            client.field319.method2621(177);
                            client.field319.method2357(var106.length() + 1);
                            client.field319.method2363(var106);
                            continue;
                        }
                        if (var488 == 3107) {
                            var5--;
                            int var107 = field787[var5];
                            var6--;
                            String var108 = field788[var6];
                            int var109 = class33.field734;
                            int[] var110 = class33.field731;
                            boolean var111 = false;
                            for (int var112 = 0; var112 < var109; var112++) {
                                class3 var113 = client.field398[var110[var112]];
                                if (var113 != null && Statics.field13 != var113 && var113.field35 != null && var113.field35.equalsIgnoreCase(var108)) {
                                    if (var107 == 1) {
                                        client.field319.method2621(91);
                                        client.field319.method2394(0);
                                        client.field319.method2403(var110[var112]);
                                    } else if (var107 == 4) {
                                        client.field319.method2621(67);
                                        client.field319.method2468(0);
                                        client.field319.method2403(var110[var112]);
                                    } else if (var107 == 6) {
                                        client.field319.method2621(62);
                                        client.field319.method2358(var110[var112]);
                                        client.field319.method2357(0);
                                    } else if (var107 == 7) {
                                        client.field319.method2621(55);
                                        client.field319.method2394(0);
                                        client.field319.method2403(var110[var112]);
                                    }
                                    var111 = true;
                                    break;
                                }
                            }
                            if (!var111) {
                                class12.method1029(4, "", class157.field2447 + var108);
                            }
                            continue;
                        }
                        if (var488 == 3108) {
                            var5 -= 3;
                            int var114 = field787[var5];
                            int var115 = field787[var5 + 1];
                            int var116 = field787[var5 + 2];
                            class173 var117 = class173.method1002(var116);
                            client.method616(var117, var114, var115);
                            continue;
                        }
                        if (var488 == 3109) {
                            var5 -= 2;
                            int var118 = field787[var5];
                            int var119 = field787[var5 + 1];
                            class173 var120 = var41 ? Statics.field2245 : Statics.field1939;
                            client.method616(var120, var118, var119);
                            continue;
                        }
                        if (var488 == 3110) {
                            var5--;
                            Statics.field753 = field787[var5] == 1;
                            continue;
                        }
                        if (var488 == 3111) {
                            field787[var5++] = Statics.field2278.field143 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3112) {
                            var5--;
                            Statics.field2278.field143 = field787[var5] == 1;
                            class9.method2680();
                            continue;
                        }
                        if (var488 == 3113) {
                            var6--;
                            String var121 = field788[var6];
                            var5--;
                            boolean var122 = field787[var5] == 1;
                            class138.method2983(var121, var122, false);
                            continue;
                        }
                        if (var488 == 3115) {
                            var5--;
                            int var123 = field787[var5];
                            client.field319.method2621(184);
                            client.field319.method2358(var123);
                            continue;
                        }
                        if (var488 == 3116) {
                            var5--;
                            int var124 = field787[var5];
                            var6 -= 2;
                            String var125 = field788[var6];
                            String var126 = field788[var6 + 1];
                            if (var125.length() <= 500 && var126.length() <= 500) {
                                client.field319.method2621(63);
                                client.field319.method2358(1 + class119.method2163(var125) + class119.method2163(var126));
                                client.field319.method2363(var126);
                                client.field319.method2394(var124);
                                client.field319.method2363(var125);
                            }
                            continue;
                        }
                    } else if (var488 < 3300) {
                        if (var488 == 3200) {
                            var5 -= 3;
                            client.method771(field787[var5], field787[var5 + 1], field787[var5 + 2]);
                            continue;
                        }
                        if (var488 == 3201) {
                            var5--;
                            int var127 = field787[var5];
                            if (var127 == -1 && !client.field514) {
                                Statics.field2944.method3421();
                                class183.field2941 = 1;
                                Statics.field3039 = null;
                            } else if (var127 != -1 && client.field513 != var127 && client.field544 != 0 && !client.field514) {
                                class168 var128 = Statics.field2166;
                                int var129 = client.field544;
                                class183.field2941 = 1;
                                Statics.field3039 = var128;
                                Statics.field2946 = var127;
                                Statics.field779 = 0;
                                Statics.field2943 = var129;
                                Statics.field2587 = false;
                                Statics.field2875 = 2;
                            }
                            client.field513 = var127;
                            continue;
                        }
                        if (var488 == 3202) {
                            var5 -= 2;
                            int var130 = field787[var5];
                            int var10000 = field787[var5 + 1];
                            if (client.field544 != 0 && var130 != -1) {
                                class183.method869(Statics.field1986, var130, 0, client.field544, false);
                                client.field514 = true;
                            }
                            continue;
                        }
                    } else if (var488 < 3400) {
                        if (var488 == 3300) {
                            field787[var5++] = client.field287;
                            continue;
                        }
                        if (var488 == 3301) {
                            var5 -= 2;
                            int var132 = field787[var5];
                            int var133 = field787[var5 + 1];
                            field787[var5++] = class16.method991(var132, var133);
                            continue;
                        }
                        if (var488 == 3302) {
                            var5 -= 2;
                            int var134 = field787[var5];
                            int var135 = field787[var5 + 1];
                            int[] var136 = field787;
                            int var137 = var5++;
                            class16 var138 = (class16) class16.field217.method3571((long) var134);
                            int var139;
                            if (var138 == null) {
                                var139 = 0;
                            } else if (var135 >= 0 && var135 < var138.field215.length) {
                                var139 = var138.field215[var135];
                            } else {
                                var139 = 0;
                            }
                            var136[var137] = var139;
                            continue;
                        }
                        if (var488 == 3303) {
                            var5 -= 2;
                            int var140 = field787[var5];
                            int var141 = field787[var5 + 1];
                            int[] var142 = field787;
                            int var143 = var5++;
                            class16 var144 = (class16) class16.field217.method3571((long) var140);
                            int var145;
                            if (var144 == null) {
                                var145 = 0;
                            } else if (var141 == -1) {
                                var145 = 0;
                            } else {
                                int var146 = 0;
                                for (int var147 = 0; var147 < var144.field215.length; var147++) {
                                    if (var144.field218[var147] == var141) {
                                        var146 += var144.field215[var147];
                                    }
                                }
                                var145 = var146;
                            }
                            var142[var143] = var145;
                            continue;
                        }
                        if (var488 == 3304) {
                            var5--;
                            int var148 = field787[var5];
                            field787[var5++] = class51.method3344(var148).field1080;
                            continue;
                        }
                        if (var488 == 3305) {
                            var5--;
                            int var149 = field787[var5];
                            field787[var5++] = client.field412[var149];
                            continue;
                        }
                        if (var488 == 3306) {
                            var5--;
                            int var150 = field787[var5];
                            field787[var5++] = client.field413[var150];
                            continue;
                        }
                        if (var488 == 3307) {
                            var5--;
                            int var151 = field787[var5];
                            field787[var5++] = client.field348[var151];
                            continue;
                        }
                        if (var488 == 3308) {
                            int var152 = Statics.field135;
                            int var153 = (Statics.field13.field847 >> 7) + Statics.field1054;
                            int var154 = (Statics.field13.field835 >> 7) + Statics.field2630;
                            field787[var5++] = (var152 << 28) + (var153 << 14) + var154;
                            continue;
                        }
                        if (var488 == 3309) {
                            var5--;
                            int var155 = field787[var5];
                            field787[var5++] = var155 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var488 == 3310) {
                            var5--;
                            int var156 = field787[var5];
                            field787[var5++] = var156 >> 28;
                            continue;
                        }
                        if (var488 == 3311) {
                            var5--;
                            int var157 = field787[var5];
                            field787[var5++] = var157 & 0x3FFF;
                            continue;
                        }
                        if (var488 == 3312) {
                            field787[var5++] = client.field282 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3313) {
                            var5 -= 2;
                            int var158 = field787[var5] + 32768;
                            int var159 = field787[var5 + 1];
                            field787[var5++] = class16.method991(var158, var159);
                            continue;
                        }
                        if (var488 == 3314) {
                            var5 -= 2;
                            int var160 = field787[var5] + 32768;
                            int var161 = field787[var5 + 1];
                            int[] var162 = field787;
                            int var163 = var5++;
                            class16 var164 = (class16) class16.field217.method3571((long) var160);
                            int var165;
                            if (var164 == null) {
                                var165 = 0;
                            } else if (var161 >= 0 && var161 < var164.field215.length) {
                                var165 = var164.field215[var161];
                            } else {
                                var165 = 0;
                            }
                            var162[var163] = var165;
                            continue;
                        }
                        if (var488 == 3315) {
                            var5 -= 2;
                            int var166 = field787[var5] + 32768;
                            int var167 = field787[var5 + 1];
                            int[] var168 = field787;
                            int var169 = var5++;
                            class16 var170 = (class16) class16.field217.method3571((long) var166);
                            int var171;
                            if (var170 == null) {
                                var171 = 0;
                            } else if (var167 == -1) {
                                var171 = 0;
                            } else {
                                int var172 = 0;
                                for (int var173 = 0; var173 < var170.field215.length; var173++) {
                                    if (var170.field218[var173] == var167) {
                                        var172 += var170.field215[var173];
                                    }
                                }
                                var171 = var172;
                            }
                            var168[var169] = var171;
                            continue;
                        }
                        if (var488 == 3316) {
                            if (client.field442 >= 2) {
                                field787[var5++] = client.field442;
                            } else {
                                field787[var5++] = 0;
                            }
                            continue;
                        }
                        if (var488 == 3317) {
                            field787[var5++] = client.field487;
                            continue;
                        }
                        if (var488 == 3318) {
                            field787[var5++] = client.field422;
                            continue;
                        }
                        if (var488 == 3321) {
                            field787[var5++] = client.field440;
                            continue;
                        }
                        if (var488 == 3322) {
                            field787[var5++] = client.field432;
                            continue;
                        }
                        if (var488 == 3323) {
                            if (client.field384) {
                                field787[var5++] = 1;
                            } else {
                                field787[var5++] = 0;
                            }
                            continue;
                        }
                        if (var488 == 3324) {
                            field787[var5++] = client.field278;
                            continue;
                        }
                    } else if (var488 < 3500) {
                        if (var488 == 3400) {
                            var5 -= 2;
                            int var174 = field787[var5];
                            int var175 = field787[var5 + 1];
                            class49 var176 = (class49) class49.field1069.method3543((long) var174);
                            class49 var177;
                            if (var176 == null) {
                                byte[] var178 = Statics.field1070.method3124(8, var174);
                                class49 var179 = new class49();
                                if (var178 != null) {
                                    var179.method994(new class119(var178));
                                }
                                class49.field1069.method3540(var179, (long) var174);
                                var177 = var179;
                            } else {
                                var177 = var176;
                            }
                            class49 var180 = var177;
                            if (var177.field1063 != 's') {
                            }
                            for (int var181 = 0; var181 < var180.field1066; var181++) {
                                if (var180.field1060[var181] == var175) {
                                    field788[var6++] = var180.field1061[var181];
                                    var180 = null;
                                    break;
                                }
                            }
                            if (var180 != null) {
                                field788[var6++] = var180.field1065;
                            }
                            continue;
                        }
                        if (var488 == 3408) {
                            var5 -= 4;
                            int var182 = field787[var5];
                            int var183 = field787[var5 + 1];
                            int var184 = field787[var5 + 2];
                            int var185 = field787[var5 + 3];
                            class49 var186 = (class49) class49.field1069.method3543((long) var184);
                            class49 var187;
                            if (var186 == null) {
                                byte[] var188 = Statics.field1070.method3124(8, var184);
                                class49 var189 = new class49();
                                if (var188 != null) {
                                    var189.method994(new class119(var188));
                                }
                                class49.field1069.method3540(var189, (long) var184);
                                var187 = var189;
                            } else {
                                var187 = var186;
                            }
                            class49 var190 = var187;
                            if (var187.field1062 == var182 && var187.field1063 == var183) {
                                for (int var191 = 0; var191 < var190.field1066; var191++) {
                                    if (var190.field1060[var191] == var185) {
                                        if (var183 == 115) {
                                            field788[var6++] = var190.field1061[var191];
                                        } else {
                                            field787[var5++] = var190.field1068[var191];
                                        }
                                        var190 = null;
                                        break;
                                    }
                                }
                                if (var190 != null) {
                                    if (var183 == 115) {
                                        field788[var6++] = var190.field1065;
                                    } else {
                                        field787[var5++] = var190.field1067;
                                    }
                                }
                                continue;
                            }
                            if (var183 == 115) {
                                field788[var6++] = "null";
                            } else {
                                field787[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var488 < 3700) {
                        if (var488 == 3600) {
                            if (client.field543 == 0) {
                                field787[var5++] = -2;
                            } else if (client.field543 == 1) {
                                field787[var5++] = -1;
                            } else {
                                field787[var5++] = client.field542;
                            }
                            continue;
                        }
                        if (var488 == 3601) {
                            var5--;
                            int var192 = field787[var5];
                            if (client.field543 == 2 && var192 < client.field542) {
                                field788[var6++] = client.field411[var192].field238;
                                field788[var6++] = client.field411[var192].field242;
                                continue;
                            }
                            field788[var6++] = "";
                            field788[var6++] = "";
                            continue;
                        }
                        if (var488 == 3602) {
                            var5--;
                            int var193 = field787[var5];
                            if (client.field543 == 2 && var193 < client.field542) {
                                field787[var5++] = client.field411[var193].field239;
                                continue;
                            }
                            field787[var5++] = 0;
                            continue;
                        }
                        if (var488 == 3603) {
                            var5--;
                            int var194 = field787[var5];
                            if (client.field543 == 2 && var194 < client.field542) {
                                field787[var5++] = client.field411[var194].field240;
                                continue;
                            }
                            field787[var5++] = 0;
                            continue;
                        }
                        if (var488 == 3604) {
                            var6--;
                            String var195 = field788[var6];
                            var5--;
                            int var196 = field787[var5];
                            client.field319.method2621(208);
                            client.field319.method2357(class119.method2163(var195) + 1);
                            client.field319.method2363(var195);
                            client.field319.method2503(var196);
                            continue;
                        }
                        if (var488 == 3605) {
                            var6--;
                            String var197 = field788[var6];
                            if (var197 == null) {
                                continue;
                            }
                            if ((client.field542 < 200 || client.field352 == 1) && client.field542 < 400) {
                                String var198 = class164.method2834(var197, Statics.field281);
                                if (var198 == null) {
                                    continue;
                                }
                                for (int var199 = 0; var199 < client.field542; var199++) {
                                    class18 var200 = client.field411[var199];
                                    String var201 = class164.method2834(var200.field238, Statics.field281);
                                    if (var201 != null && var201.equals(var198)) {
                                        class12.method1029(30, "", var197 + class157.field2465);
                                        continue label3064;
                                    }
                                    if (var200.field242 != null) {
                                        String var202 = class164.method2834(var200.field242, Statics.field281);
                                        if (var202 != null && var202.equals(var198)) {
                                            class12.method1029(30, "", var197 + class157.field2465);
                                            continue label3064;
                                        }
                                    }
                                }
                                for (int var203 = 0; var203 < client.field355; var203++) {
                                    class8 var204 = client.field446[var203];
                                    String var205 = class164.method2834(var204.field131, Statics.field281);
                                    if (var205 != null && var205.equals(var198)) {
                                        class12.method1029(30, "", class157.field2350 + var197 + class157.field2471);
                                        continue label3064;
                                    }
                                    if (var204.field127 != null) {
                                        String var206 = class164.method2834(var204.field127, Statics.field281);
                                        if (var206 != null && var206.equals(var198)) {
                                            class12.method1029(30, "", class157.field2350 + var197 + class157.field2471);
                                            continue label3064;
                                        }
                                    }
                                }
                                if (class164.method2834(Statics.field13.field35, Statics.field281).equals(var198)) {
                                    class12.method1029(30, "", class157.field2468);
                                } else {
                                    client.field319.method2621(181);
                                    client.field319.method2357(class119.method2163(var197));
                                    client.field319.method2363(var197);
                                }
                                continue;
                            }
                            class12.method1029(30, "", class157.field2383);
                            continue;
                        }
                        if (var488 == 3606) {
                            var6--;
                            String var207 = field788[var6];
                            if (var207 == null) {
                                continue;
                            }
                            String var208 = class164.method2834(var207, Statics.field281);
                            if (var208 == null) {
                                continue;
                            }
                            int var209 = 0;
                            while (true) {
                                if (var209 >= client.field542) {
                                    continue label3064;
                                }
                                class18 var210 = client.field411[var209];
                                String var211 = var210.field238;
                                String var212 = class164.method2834(var211, Statics.field281);
                                if (class129.method990(var207, var208, var211, var212)) {
                                    client.field542--;
                                    for (int var213 = var209; var213 < client.field542; var213++) {
                                        client.field411[var213] = client.field411[var213 + 1];
                                    }
                                    client.field459 = client.field460;
                                    client.field319.method2621(89);
                                    client.field319.method2357(class119.method2163(var207));
                                    client.field319.method2363(var207);
                                    continue label3064;
                                }
                                var209++;
                            }
                        }
                        if (var488 == 3607) {
                            var6--;
                            String var214 = field788[var6];
                            if (var214 == null) {
                                continue;
                            }
                            if ((client.field355 < 100 || client.field352 == 1) && client.field355 < 400) {
                                String var215 = class164.method2834(var214, Statics.field281);
                                if (var215 == null) {
                                    continue;
                                }
                                for (int var216 = 0; var216 < client.field355; var216++) {
                                    class8 var217 = client.field446[var216];
                                    String var218 = class164.method2834(var217.field131, Statics.field281);
                                    if (var218 != null && var218.equals(var215)) {
                                        class12.method1029(31, "", var214 + class157.field2336);
                                        continue label3064;
                                    }
                                    if (var217.field127 != null) {
                                        String var219 = class164.method2834(var217.field127, Statics.field281);
                                        if (var219 != null && var219.equals(var215)) {
                                            class12.method1029(31, "", var214 + class157.field2336);
                                            continue label3064;
                                        }
                                    }
                                }
                                for (int var220 = 0; var220 < client.field542; var220++) {
                                    class18 var221 = client.field411[var220];
                                    String var222 = class164.method2834(var221.field238, Statics.field281);
                                    if (var222 != null && var222.equals(var215)) {
                                        class12.method1029(31, "", class157.field2472 + var214 + class157.field2366);
                                        continue label3064;
                                    }
                                    if (var221.field242 != null) {
                                        String var223 = class164.method2834(var221.field242, Statics.field281);
                                        if (var223 != null && var223.equals(var215)) {
                                            class12.method1029(31, "", class157.field2472 + var214 + class157.field2366);
                                            continue label3064;
                                        }
                                    }
                                }
                                if (class164.method2834(Statics.field13.field35, Statics.field281).equals(var215)) {
                                    class12.method1029(31, "", class157.field2469);
                                } else {
                                    client.field319.method2621(25);
                                    client.field319.method2357(class119.method2163(var214));
                                    client.field319.method2363(var214);
                                }
                                continue;
                            }
                            class12.method1029(31, "", class157.field2466);
                            continue;
                        }
                        if (var488 == 3608) {
                            var6--;
                            String var224 = field788[var6];
                            client.method766(var224);
                            continue;
                        }
                        if (var488 == 3609) {
                            var6--;
                            String var225 = field788[var6];
                            class152[] var226 = new class152[] { class152.field2254, class152.field2250, class152.field2253, class152.field2251, class152.field2252 };
                            class152[] var227 = var226;
                            for (int var228 = 0; var228 < var227.length; var228++) {
                                class152 var229 = var227[var228];
                                if (var229.field2256 != -1 && var225.startsWith(class2.method256(var229.field2256))) {
                                    var225 = var225.substring(6 + Integer.toString(var229.field2256).length());
                                    break;
                                }
                            }
                            field787[var5++] = client.method134(var225, false) ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3611) {
                            if (client.field502 == null) {
                                field788[var6++] = "";
                            } else {
                                String[] var230 = field788;
                                int var231 = var6++;
                                String var232 = client.field502;
                                String var233 = class162.method202(Statics.method601(var232));
                                if (var233 == null) {
                                    var233 = "";
                                }
                                var230[var231] = var233;
                            }
                            continue;
                        }
                        if (var488 == 3612) {
                            if (client.field502 == null) {
                                field787[var5++] = 0;
                            } else {
                                field787[var5++] = Statics.field965;
                            }
                            continue;
                        }
                        if (var488 == 3613) {
                            var5--;
                            int var235 = field787[var5];
                            if (client.field502 != null && var235 < Statics.field965) {
                                field788[var6++] = Statics.field1668[var235].field605;
                                continue;
                            }
                            field788[var6++] = "";
                            continue;
                        }
                        if (var488 == 3614) {
                            var5--;
                            int var236 = field787[var5];
                            if (client.field502 != null && var236 < Statics.field965) {
                                field787[var5++] = Statics.field1668[var236].field607;
                                continue;
                            }
                            field787[var5++] = 0;
                            continue;
                        }
                        if (var488 == 3615) {
                            var5--;
                            int var237 = field787[var5];
                            if (client.field502 != null && var237 < Statics.field965) {
                                field787[var5++] = Statics.field1668[var237].field608;
                                continue;
                            }
                            field787[var5++] = 0;
                            continue;
                        }
                        if (var488 == 3616) {
                            field787[var5++] = Statics.field92;
                            continue;
                        }
                        if (var488 == 3617) {
                            var6--;
                            String var238 = field788[var6];
                            if (Statics.field1668 != null) {
                                client.field319.method2621(215);
                                client.field319.method2357(class119.method2163(var238));
                                client.field319.method2363(var238);
                            }
                            continue;
                        }
                        if (var488 == 3618) {
                            field787[var5++] = Statics.field2138;
                            continue;
                        }
                        if (var488 == 3619) {
                            var6--;
                            String var239 = field788[var6];
                            if (!var239.equals("")) {
                                client.field319.method2621(255);
                                client.field319.method2357(class119.method2163(var239));
                                client.field319.method2363(var239);
                            }
                            continue;
                        }
                        if (var488 == 3620) {
                            client.field319.method2621(255);
                            client.field319.method2357(0);
                            continue;
                        }
                        if (var488 == 3621) {
                            if (client.field543 == 0) {
                                field787[var5++] = -1;
                            } else {
                                field787[var5++] = client.field355;
                            }
                            continue;
                        }
                        if (var488 == 3622) {
                            var5--;
                            int var240 = field787[var5];
                            if (client.field543 != 0 && var240 < client.field355) {
                                field788[var6++] = client.field446[var240].field131;
                                field788[var6++] = client.field446[var240].field127;
                                continue;
                            }
                            field788[var6++] = "";
                            field788[var6++] = "";
                            continue;
                        }
                        if (var488 == 3623) {
                            var6--;
                            String var241 = field788[var6];
                            if (var241.startsWith(class2.method256(0)) || var241.startsWith(class2.method256(1))) {
                                var241 = var241.substring(7);
                            }
                            field787[var5++] = client.method847(var241) ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3624) {
                            var5--;
                            int var242 = field787[var5];
                            if (Statics.field1668 != null && var242 < Statics.field965 && Statics.field1668[var242].field605.equalsIgnoreCase(Statics.field13.field35)) {
                                field787[var5++] = 1;
                                continue;
                            }
                            field787[var5++] = 0;
                            continue;
                        }
                        if (var488 == 3625) {
                            if (client.field296 == null) {
                                field788[var6++] = "";
                            } else {
                                String[] var243 = field788;
                                int var244 = var6++;
                                String var245 = client.field296;
                                String var246 = class162.method202(Statics.method601(var245));
                                if (var246 == null) {
                                    var246 = "";
                                }
                                var243[var244] = var246;
                            }
                            continue;
                        }
                    } else if (var488 < 4000) {
                        if (var488 == 3903) {
                            var5--;
                            int var248 = field787[var5];
                            field787[var5++] = client.field500[var248].method3779();
                            continue;
                        }
                        if (var488 == 3904) {
                            var5--;
                            int var249 = field787[var5];
                            field787[var5++] = client.field500[var249].field3151;
                            continue;
                        }
                        if (var488 == 3905) {
                            var5--;
                            int var250 = field787[var5];
                            field787[var5++] = client.field500[var250].field3152;
                            continue;
                        }
                        if (var488 == 3906) {
                            var5--;
                            int var251 = field787[var5];
                            field787[var5++] = client.field500[var251].field3153;
                            continue;
                        }
                        if (var488 == 3907) {
                            var5--;
                            int var252 = field787[var5];
                            field787[var5++] = client.field500[var252].field3154;
                            continue;
                        }
                        if (var488 == 3908) {
                            var5--;
                            int var253 = field787[var5];
                            field787[var5++] = client.field500[var253].field3155;
                            continue;
                        }
                        if (var488 == 3910) {
                            var5--;
                            int var254 = field787[var5];
                            int var255 = client.field500[var254].method3778();
                            field787[var5++] = var255 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3911) {
                            var5--;
                            int var256 = field787[var5];
                            int var257 = client.field500[var256].method3778();
                            field787[var5++] = var257 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3912) {
                            var5--;
                            int var258 = field787[var5];
                            int var259 = client.field500[var258].method3778();
                            field787[var5++] = var259 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3913) {
                            var5--;
                            int var260 = field787[var5];
                            int var261 = client.field500[var260].method3778();
                            field787[var5++] = var261 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3914) {
                            var5--;
                            boolean var262 = field787[var5] == 1;
                            if (Statics.field2194 != null) {
                                Statics.field2194.method3792(class221.field3159, var262);
                            }
                            continue;
                        }
                        if (var488 == 3915) {
                            var5--;
                            boolean var263 = field787[var5] == 1;
                            if (Statics.field2194 != null) {
                                Statics.field2194.method3792(class221.field3158, var263);
                            }
                            continue;
                        }
                        if (var488 == 3916) {
                            var5 -= 2;
                            boolean var264 = field787[var5] == 1;
                            boolean var265 = field787[var5 + 1] == 1;
                            if (Statics.field2194 != null) {
                                Statics.field2194.method3792(new class22(var265), var264);
                            }
                            continue;
                        }
                        if (var488 == 3917) {
                            var5--;
                            boolean var266 = field787[var5] == 1;
                            if (Statics.field2194 != null) {
                                Statics.field2194.method3792(class221.field3161, var266);
                            }
                            continue;
                        }
                        if (var488 == 3918) {
                            var5--;
                            boolean var267 = field787[var5] == 1;
                            if (Statics.field2194 != null) {
                                Statics.field2194.method3792(class221.field3162, var267);
                            }
                            continue;
                        }
                        if (var488 == 3919) {
                            field787[var5++] = Statics.field2194 == null ? 0 : Statics.field2194.field3160.size();
                            continue;
                        }
                        if (var488 == 3920) {
                            var5--;
                            int var268 = field787[var5];
                            class214 var269 = (class214) Statics.field2194.field3160.get(var268);
                            field787[var5++] = var269.field3135;
                            continue;
                        }
                        if (var488 == 3921) {
                            var5--;
                            int var270 = field787[var5];
                            class214 var271 = (class214) Statics.field2194.field3160.get(var270);
                            field788[var6++] = var271.method3741();
                            continue;
                        }
                        if (var488 == 3922) {
                            var5--;
                            int var272 = field787[var5];
                            class214 var273 = (class214) Statics.field2194.field3160.get(var272);
                            field788[var6++] = var273.method3743();
                            continue;
                        }
                        if (var488 == 3923) {
                            var5--;
                            int var274 = field787[var5];
                            class214 var275 = (class214) Statics.field2194.field3160.get(var274);
                            long var276 = class115.method2038() - Statics.field760 - var275.field3137;
                            int var278 = (int) (var276 / 3600000L);
                            int var279 = (int) ((var276 - (long) (var278 * 3600000)) / 60000L);
                            int var280 = (int) ((var276 - (long) (var278 * 3600000) - (long) (var279 * 60000)) / 1000L);
                            String var281 = var278 + ":" + var279 / 10 + var279 % 10 + ":" + var280 / 10 + var280 % 10;
                            field788[var6++] = var281;
                            continue;
                        }
                        if (var488 == 3924) {
                            var5--;
                            int var282 = field787[var5];
                            class214 var283 = (class214) Statics.field2194.field3160.get(var282);
                            field787[var5++] = var283.field3136.field3153;
                            continue;
                        }
                        if (var488 == 3925) {
                            var5--;
                            int var284 = field787[var5];
                            class214 var285 = (class214) Statics.field2194.field3160.get(var284);
                            field787[var5++] = var285.field3136.field3152;
                            continue;
                        }
                        if (var488 == 3926) {
                            var5--;
                            int var286 = field787[var5];
                            class214 var287 = (class214) Statics.field2194.field3160.get(var286);
                            field787[var5++] = var287.field3136.field3151;
                            continue;
                        }
                    } else if (var488 < 4100) {
                        if (var488 == 4000) {
                            var5 -= 2;
                            int var288 = field787[var5];
                            int var289 = field787[var5 + 1];
                            field787[var5++] = var288 + var289;
                            continue;
                        }
                        if (var488 == 4001) {
                            var5 -= 2;
                            int var290 = field787[var5];
                            int var291 = field787[var5 + 1];
                            field787[var5++] = var290 - var291;
                            continue;
                        }
                        if (var488 == 4002) {
                            var5 -= 2;
                            int var292 = field787[var5];
                            int var293 = field787[var5 + 1];
                            field787[var5++] = var292 * var293;
                            continue;
                        }
                        if (var488 == 4003) {
                            var5 -= 2;
                            int var294 = field787[var5];
                            int var295 = field787[var5 + 1];
                            field787[var5++] = var294 / var295;
                            continue;
                        }
                        if (var488 == 4004) {
                            var5--;
                            int var296 = field787[var5];
                            field787[var5++] = (int) (Math.random() * (double) var296);
                            continue;
                        }
                        if (var488 == 4005) {
                            var5--;
                            int var297 = field787[var5];
                            field787[var5++] = (int) (Math.random() * (double) (var297 + 1));
                            continue;
                        }
                        if (var488 == 4006) {
                            var5 -= 5;
                            int var298 = field787[var5];
                            int var299 = field787[var5 + 1];
                            int var300 = field787[var5 + 2];
                            int var301 = field787[var5 + 3];
                            int var302 = field787[var5 + 4];
                            field787[var5++] = (var299 - var298) * (var302 - var300) / (var301 - var300) + var298;
                            continue;
                        }
                        if (var488 == 4007) {
                            var5 -= 2;
                            int var303 = field787[var5];
                            int var304 = field787[var5 + 1];
                            field787[var5++] = var303 * var304 / 100 + var303;
                            continue;
                        }
                        if (var488 == 4008) {
                            var5 -= 2;
                            int var305 = field787[var5];
                            int var306 = field787[var5 + 1];
                            field787[var5++] = var305 | 0x1 << var306;
                            continue;
                        }
                        if (var488 == 4009) {
                            var5 -= 2;
                            int var307 = field787[var5];
                            int var308 = field787[var5 + 1];
                            field787[var5++] = var307 & -1 - (0x1 << var308);
                            continue;
                        }
                        if (var488 == 4010) {
                            var5 -= 2;
                            int var309 = field787[var5];
                            int var310 = field787[var5 + 1];
                            field787[var5++] = (var309 & 0x1 << var310) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var488 == 4011) {
                            var5 -= 2;
                            int var311 = field787[var5];
                            int var312 = field787[var5 + 1];
                            field787[var5++] = var311 % var312;
                            continue;
                        }
                        if (var488 == 4012) {
                            var5 -= 2;
                            int var313 = field787[var5];
                            int var314 = field787[var5 + 1];
                            if (var313 == 0) {
                                field787[var5++] = 0;
                            } else {
                                field787[var5++] = (int) Math.pow((double) var313, (double) var314);
                            }
                            continue;
                        }
                        if (var488 == 4013) {
                            var5 -= 2;
                            int var315 = field787[var5];
                            int var316 = field787[var5 + 1];
                            if (var315 == 0) {
                                field787[var5++] = 0;
                            } else if (var316 == 0) {
                                field787[var5++] = Integer.MAX_VALUE;
                            } else {
                                field787[var5++] = (int) Math.pow((double) var315, 1.0D / (double) var316);
                            }
                            continue;
                        }
                        if (var488 == 4014) {
                            var5 -= 2;
                            int var317 = field787[var5];
                            int var318 = field787[var5 + 1];
                            field787[var5++] = var317 & var318;
                            continue;
                        }
                        if (var488 == 4015) {
                            var5 -= 2;
                            int var319 = field787[var5];
                            int var320 = field787[var5 + 1];
                            field787[var5++] = var319 | var320;
                            continue;
                        }
                    } else if (var488 < 4200) {
                        if (var488 == 4100) {
                            var6--;
                            String var321 = field788[var6];
                            var5--;
                            int var322 = field787[var5];
                            field788[var6++] = var321 + var322;
                            continue;
                        }
                        if (var488 == 4101) {
                            var6 -= 2;
                            String var323 = field788[var6];
                            String var324 = field788[var6 + 1];
                            field788[var6++] = var323 + var324;
                            continue;
                        }
                        if (var488 == 4102) {
                            var6--;
                            String var325 = field788[var6];
                            var5--;
                            int var326 = field787[var5];
                            field788[var6++] = var325 + class163.method2982(var326, true);
                            continue;
                        }
                        if (var488 == 4103) {
                            var6--;
                            String var327 = field788[var6];
                            field788[var6++] = var327.toLowerCase();
                            continue;
                        }
                        if (var488 == 4104) {
                            var5--;
                            int var328 = field787[var5];
                            long var329 = ((long) var328 + 11745L) * 86400000L;
                            field791.setTime(new Date(var329));
                            int var331 = field791.get(5);
                            int var332 = field791.get(2);
                            int var333 = field791.get(1);
                            field788[var6++] = var331 + "-" + field785[var332] + "-" + var333;
                            continue;
                        }
                        if (var488 == 4105) {
                            var6 -= 2;
                            String var334 = field788[var6];
                            String var335 = field788[var6 + 1];
                            if (Statics.field13.field32 != null && Statics.field13.field32.field2901) {
                                field788[var6++] = var335;
                                continue;
                            }
                            field788[var6++] = var334;
                            continue;
                        }
                        if (var488 == 4106) {
                            var5--;
                            int var336 = field787[var5];
                            field788[var6++] = Integer.toString(var336);
                            continue;
                        }
                        if (var488 == 4107) {
                            var6 -= 2;
                            int[] var337 = field787;
                            int var338 = var5++;
                            String var339 = field788[var6];
                            String var340 = field788[var6 + 1];
                            int var341 = client.field284;
                            int var342 = var339.length();
                            int var343 = var340.length();
                            int var344 = 0;
                            int var345 = 0;
                            char var346 = 0;
                            char var347 = 0;
                            int var348;
                            label2861: while (true) {
                                if (var344 - var346 >= var342 && var345 - var347 >= var343) {
                                    int var357 = Math.min(var342, var343);
                                    for (int var358 = 0; var358 < var357; var358++) {
                                        char var361 = var339.charAt(var358);
                                        char var362 = var340.charAt(var358);
                                        if (var361 != var362 && Character.toUpperCase(var361) != Character.toUpperCase(var362)) {
                                            char var363 = Character.toLowerCase(var361);
                                            char var364 = Character.toLowerCase(var362);
                                            if (var363 != var364) {
                                                var348 = class166.method1489(var363, var341) - class166.method1489(var364, var341);
                                                break label2861;
                                            }
                                        }
                                    }
                                    int var365 = var342 - var343;
                                    if (var365 == 0) {
                                        for (int var366 = 0; var366 < var357; var366++) {
                                            char var367 = var339.charAt(var366);
                                            char var368 = var340.charAt(var366);
                                            if (var367 != var368) {
                                                var348 = class166.method1489(var367, var341) - class166.method1489(var368, var341);
                                                break label2861;
                                            }
                                        }
                                        var348 = 0;
                                    } else {
                                        var348 = var365;
                                    }
                                    break;
                                }
                                if (var344 - var346 >= var342) {
                                    var348 = -1;
                                    break;
                                }
                                if (var345 - var347 >= var343) {
                                    var348 = 1;
                                    break;
                                }
                                char var349;
                                if (var346 == 0) {
                                    var349 = var339.charAt(var344++);
                                } else {
                                    var349 = var346;
                                    boolean var350 = false;
                                }
                                char var351;
                                if (var347 == 0) {
                                    var351 = var340.charAt(var345++);
                                } else {
                                    var351 = var347;
                                    boolean var352 = false;
                                }
                                var346 = class166.method1211(var349);
                                var347 = class166.method1211(var351);
                                char var353 = class166.method951(var349, var341);
                                char var354 = class166.method951(var351, var341);
                                if (var353 != var354 && Character.toUpperCase(var353) != Character.toUpperCase(var354)) {
                                    char var355 = Character.toLowerCase(var353);
                                    char var356 = Character.toLowerCase(var354);
                                    if (var355 != var356) {
                                        var348 = class166.method1489(var355, var341) - class166.method1489(var356, var341);
                                        break;
                                    }
                                }
                            }
                            var337[var338] = class163.method1078(var348);
                            continue;
                        }
                        if (var488 == 4108) {
                            var6--;
                            String var369 = field788[var6];
                            var5 -= 2;
                            int var370 = field787[var5];
                            int var371 = field787[var5 + 1];
                            byte[] var372 = Statics.field132.method3124(var371, 0);
                            class224 var373 = new class224(var372);
                            field787[var5++] = var373.method3822(var369, var370);
                            continue;
                        }
                        if (var488 == 4109) {
                            var6--;
                            String var374 = field788[var6];
                            var5 -= 2;
                            int var375 = field787[var5];
                            int var376 = field787[var5 + 1];
                            byte[] var377 = Statics.field132.method3124(var376, 0);
                            class224 var378 = new class224(var377);
                            field787[var5++] = var378.method3836(var374, var375);
                            continue;
                        }
                        if (var488 == 4110) {
                            var6 -= 2;
                            String var379 = field788[var6];
                            String var380 = field788[var6 + 1];
                            var5--;
                            if (field787[var5] == 1) {
                                field788[var6++] = var379;
                            } else {
                                field788[var6++] = var380;
                            }
                            continue;
                        }
                        if (var488 == 4111) {
                            var6--;
                            String var381 = field788[var6];
                            field788[var6++] = class223.method3842(var381);
                            continue;
                        }
                        if (var488 == 4112) {
                            var6--;
                            String var382 = field788[var6];
                            var5--;
                            int var383 = field787[var5];
                            field788[var6++] = var382 + (char) var383;
                            continue;
                        }
                        if (var488 == 4113) {
                            var5--;
                            int var384 = field787[var5];
                            int[] var385 = field787;
                            int var386 = var5++;
                            char var387 = (char) var384;
                            boolean var388;
                            if (var387 >= ' ' && var387 <= '~') {
                                var388 = true;
                            } else if (var387 >= 160 && var387 <= 255) {
                                var388 = true;
                            } else if (var387 == 8364 || var387 == 338 || var387 == 8212 || var387 == 339 || var387 == 376) {
                                var388 = true;
                            } else {
                                var388 = false;
                            }
                            var385[var386] = var388 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 4114) {
                            var5--;
                            int var389 = field787[var5];
                            field787[var5++] = class163.method47((char) var389) ? 1 : 0;
                            continue;
                        }
                        if (var488 == 4115) {
                            var5--;
                            int var390 = field787[var5];
                            int[] var391 = field787;
                            int var392 = var5++;
                            char var393 = (char) var390;
                            boolean var394 = var393 >= 'A' && var393 <= 'Z' || var393 >= 'a' && var393 <= 'z';
                            var391[var392] = var394 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 4116) {
                            var5--;
                            int var395 = field787[var5];
                            field787[var5++] = class163.method909((char) var395) ? 1 : 0;
                            continue;
                        }
                        if (var488 == 4117) {
                            var6--;
                            String var396 = field788[var6];
                            if (var396 == null) {
                                field787[var5++] = 0;
                            } else {
                                field787[var5++] = var396.length();
                            }
                            continue;
                        }
                        if (var488 == 4118) {
                            var6--;
                            String var397 = field788[var6];
                            var5 -= 2;
                            int var398 = field787[var5];
                            int var399 = field787[var5 + 1];
                            field788[var6++] = var397.substring(var398, var399);
                            continue;
                        }
                        if (var488 == 4119) {
                            var6--;
                            String var400 = field788[var6];
                            StringBuilder var401 = new StringBuilder(var400.length());
                            boolean var402 = false;
                            for (int var403 = 0; var403 < var400.length(); var403++) {
                                char var404 = var400.charAt(var403);
                                if (var404 == '<') {
                                    var402 = true;
                                } else if (var404 == '>') {
                                    var402 = false;
                                } else if (!var402) {
                                    var401.append(var404);
                                }
                            }
                            field788[var6++] = var401.toString();
                            continue;
                        }
                        if (var488 == 4120) {
                            var6--;
                            String var405 = field788[var6];
                            var5--;
                            int var406 = field787[var5];
                            field787[var5++] = var405.indexOf(var406);
                            continue;
                        }
                        if (var488 == 4121) {
                            var6 -= 2;
                            String var407 = field788[var6];
                            String var408 = field788[var6 + 1];
                            var5--;
                            int var409 = field787[var5];
                            field787[var5++] = var407.indexOf(var408, var409);
                            continue;
                        }
                    } else if (var488 < 4300) {
                        if (var488 == 4200) {
                            var5--;
                            int var410 = field787[var5];
                            field788[var6++] = class52.method154(var410).field1100;
                            continue;
                        }
                        if (var488 == 4201) {
                            var5 -= 2;
                            int var411 = field787[var5];
                            int var412 = field787[var5 + 1];
                            class52 var413 = class52.method154(var411);
                            if (var412 >= 1 && var412 <= 5 && var413.field1109[var412 - 1] != null) {
                                field788[var6++] = var413.field1109[var412 - 1];
                                continue;
                            }
                            field788[var6++] = "";
                            continue;
                        }
                        if (var488 == 4202) {
                            var5 -= 2;
                            int var414 = field787[var5];
                            int var415 = field787[var5 + 1];
                            class52 var416 = class52.method154(var414);
                            if (var415 >= 1 && var415 <= 5 && var416.field1117[var415 - 1] != null) {
                                field788[var6++] = var416.field1117[var415 - 1];
                                continue;
                            }
                            field788[var6++] = "";
                            continue;
                        }
                        if (var488 == 4203) {
                            var5--;
                            int var417 = field787[var5];
                            field787[var5++] = class52.method154(var417).field1112;
                            continue;
                        }
                        if (var488 == 4204) {
                            var5--;
                            int var418 = field787[var5];
                            field787[var5++] = class52.method154(var418).field1111 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 4205) {
                            var5--;
                            int var419 = field787[var5];
                            class52 var420 = class52.method154(var419);
                            if (var420.field1115 == -1 && var420.field1105 >= 0) {
                                field787[var5++] = var420.field1105;
                                continue;
                            }
                            field787[var5++] = var419;
                            continue;
                        }
                        if (var488 == 4206) {
                            var5--;
                            int var421 = field787[var5];
                            class52 var422 = class52.method154(var421);
                            if (var422.field1115 >= 0 && var422.field1105 >= 0) {
                                field787[var5++] = var422.field1105;
                                continue;
                            }
                            field787[var5++] = var421;
                            continue;
                        }
                        if (var488 == 4207) {
                            var5--;
                            int var423 = field787[var5];
                            field787[var5++] = class52.method154(var423).field1113 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 4210) {
                            var6--;
                            String var424 = field788[var6];
                            var5--;
                            int var425 = field787[var5];
                            client.method114(var424, var425 == 1);
                            field787[var5++] = Statics.field269;
                            continue;
                        }
                        if (var488 == 4211) {
                            if (Statics.field1940 != null && Statics.field1545 < Statics.field269) {
                                field787[var5++] = Statics.field1940[++Statics.field1545 - 1] & 0xFFFF;
                                continue;
                            }
                            field787[var5++] = -1;
                            continue;
                        }
                        if (var488 == 4212) {
                            Statics.field1545 = 0;
                            continue;
                        }
                    } else if (var488 < 5100) {
                        if (var488 == 5000) {
                            field787[var5++] = client.field493;
                            continue;
                        }
                        if (var488 == 5001) {
                            var5 -= 3;
                            client.field493 = field787[var5];
                            int var426 = field787[var5 + 1];
                            class130[] var427 = new class130[] { class130.field2044, class130.field2048, class130.field2046 };
                            class130[] var428 = var427;
                            int var429 = 0;
                            class130 var431;
                            while (true) {
                                if (var429 >= var428.length) {
                                    var431 = null;
                                    break;
                                }
                                class130 var430 = var428[var429];
                                if (var430.field2047 == var426) {
                                    var431 = var430;
                                    break;
                                }
                                var429++;
                            }
                            Statics.field2641 = var431;
                            if (Statics.field2641 == null) {
                                Statics.field2641 = class130.field2044;
                            }
                            client.field494 = field787[var5 + 2];
                            client.field319.method2621(150);
                            client.field319.method2357(client.field493);
                            client.field319.method2357(Statics.field2641.field2047);
                            client.field319.method2357(client.field494);
                            continue;
                        }
                        if (var488 == 5002) {
                            var6--;
                            String var432 = field788[var6];
                            var5 -= 2;
                            int var433 = field787[var5];
                            int var434 = field787[var5 + 1];
                            client.field319.method2621(74);
                            client.field319.method2357(class119.method2163(var432) + 2);
                            client.field319.method2363(var432);
                            client.field319.method2357(var433 - 1);
                            client.field319.method2357(var434);
                            continue;
                        }
                        if (var488 == 5003) {
                            var5 -= 2;
                            int var435 = field787[var5];
                            int var436 = field787[var5 + 1];
                            class36 var437 = class12.method2153(var435, var436);
                            if (var437 == null) {
                                field787[var5++] = -1;
                                field787[var5++] = 0;
                                field788[var6++] = "";
                                field788[var6++] = "";
                                field788[var6++] = "";
                            } else {
                                field787[var5++] = var437.field770;
                                field787[var5++] = var437.field768;
                                field788[var6++] = var437.field775 == null ? "" : var437.field775;
                                field788[var6++] = var437.field771 == null ? "" : var437.field771;
                                field788[var6++] = var437.field772 == null ? "" : var437.field772;
                            }
                            continue;
                        }
                        if (var488 == 5004) {
                            var5--;
                            int var438 = field787[var5];
                            class36 var439 = (class36) class12.field167.method3586((long) var438);
                            if (var439 == null) {
                                field787[var5++] = -1;
                                field787[var5++] = 0;
                                field788[var6++] = "";
                                field788[var6++] = "";
                                field788[var6++] = "";
                            } else {
                                field787[var5++] = var439.field769;
                                field787[var5++] = var439.field768;
                                field788[var6++] = var439.field775 == null ? "" : var439.field775;
                                field788[var6++] = var439.field771 == null ? "" : var439.field771;
                                field788[var6++] = var439.field772 == null ? "" : var439.field772;
                            }
                            continue;
                        }
                        if (var488 == 5005) {
                            if (Statics.field2641 == null) {
                                field787[var5++] = -1;
                            } else {
                                field787[var5++] = Statics.field2641.field2047;
                            }
                            continue;
                        }
                        if (var488 == 5008) {
                            var6--;
                            String var441 = field788[var6];
                            var5--;
                            int var442 = field787[var5];
                            String var443 = var441.toLowerCase();
                            byte var444 = 0;
                            if (var443.startsWith(class157.field2512)) {
                                var444 = 0;
                                var441 = var441.substring(class157.field2512.length());
                            } else if (var443.startsWith(class157.field2476)) {
                                var444 = 1;
                                var441 = var441.substring(class157.field2476.length());
                            } else if (var443.startsWith(class157.field2547)) {
                                var444 = 2;
                                var441 = var441.substring(class157.field2547.length());
                            } else if (var443.startsWith(class157.field2480)) {
                                var444 = 3;
                                var441 = var441.substring(class157.field2480.length());
                            } else if (var443.startsWith(class157.field2482)) {
                                var444 = 4;
                                var441 = var441.substring(class157.field2482.length());
                            } else if (var443.startsWith(class157.field2487)) {
                                var444 = 5;
                                var441 = var441.substring(class157.field2487.length());
                            } else if (var443.startsWith(class157.field2562)) {
                                var444 = 6;
                                var441 = var441.substring(class157.field2562.length());
                            } else if (var443.startsWith(class157.field2315)) {
                                var444 = 7;
                                var441 = var441.substring(class157.field2315.length());
                            } else if (var443.startsWith(class157.field2490)) {
                                var444 = 8;
                                var441 = var441.substring(class157.field2490.length());
                            } else if (var443.startsWith(class157.field2492)) {
                                var444 = 9;
                                var441 = var441.substring(class157.field2492.length());
                            } else if (var443.startsWith(class157.field2457)) {
                                var444 = 10;
                                var441 = var441.substring(class157.field2457.length());
                            } else if (var443.startsWith(class157.field2496)) {
                                var444 = 11;
                                var441 = var441.substring(class157.field2496.length());
                            } else if (client.field284 != 0) {
                                if (var443.startsWith(class157.field2475)) {
                                    var444 = 0;
                                    var441 = var441.substring(class157.field2475.length());
                                } else if (var443.startsWith(class157.field2531)) {
                                    var444 = 1;
                                    var441 = var441.substring(class157.field2531.length());
                                } else if (var443.startsWith(class157.field2390)) {
                                    var444 = 2;
                                    var441 = var441.substring(class157.field2390.length());
                                } else if (var443.startsWith(class157.field2540)) {
                                    var444 = 3;
                                    var441 = var441.substring(class157.field2540.length());
                                } else if (var443.startsWith(class157.field2513)) {
                                    var444 = 4;
                                    var441 = var441.substring(class157.field2513.length());
                                } else if (var443.startsWith(class157.field2556)) {
                                    var444 = 5;
                                    var441 = var441.substring(class157.field2556.length());
                                } else if (var443.startsWith(class157.field2481)) {
                                    var444 = 6;
                                    var441 = var441.substring(class157.field2481.length());
                                } else if (var443.startsWith(class157.field2489)) {
                                    var444 = 7;
                                    var441 = var441.substring(class157.field2489.length());
                                } else if (var443.startsWith(class157.field2491)) {
                                    var444 = 8;
                                    var441 = var441.substring(class157.field2491.length());
                                } else if (var443.startsWith(class157.field2493)) {
                                    var444 = 9;
                                    var441 = var441.substring(class157.field2493.length());
                                } else if (var443.startsWith(class157.field2495)) {
                                    var444 = 10;
                                    var441 = var441.substring(class157.field2495.length());
                                } else if (var443.startsWith(class157.field2369)) {
                                    var444 = 11;
                                    var441 = var441.substring(class157.field2369.length());
                                }
                            }
                            String var445 = var441.toLowerCase();
                            byte var446 = 0;
                            if (var445.startsWith(class157.field2498)) {
                                var446 = 1;
                                var441 = var441.substring(class157.field2498.length());
                            } else if (var445.startsWith(class157.field2500)) {
                                var446 = 2;
                                var441 = var441.substring(class157.field2500.length());
                            } else if (var445.startsWith(class157.field2299)) {
                                var446 = 3;
                                var441 = var441.substring(class157.field2299.length());
                            } else if (var445.startsWith(class157.field2504)) {
                                var446 = 4;
                                var441 = var441.substring(class157.field2504.length());
                            } else if (var445.startsWith(class157.field2506)) {
                                var446 = 5;
                                var441 = var441.substring(class157.field2506.length());
                            } else if (client.field284 != 0) {
                                if (var445.startsWith(class157.field2406)) {
                                    var446 = 1;
                                    var441 = var441.substring(class157.field2406.length());
                                } else if (var445.startsWith(class157.field2501)) {
                                    var446 = 2;
                                    var441 = var441.substring(class157.field2501.length());
                                } else if (var445.startsWith(class157.field2503)) {
                                    var446 = 3;
                                    var441 = var441.substring(class157.field2503.length());
                                } else if (var445.startsWith(class157.field2374)) {
                                    var446 = 4;
                                    var441 = var441.substring(class157.field2374.length());
                                } else if (var445.startsWith(class157.field2507)) {
                                    var446 = 5;
                                    var441 = var441.substring(class157.field2507.length());
                                }
                            }
                            client.field319.method2621(146);
                            client.field319.method2357(0);
                            int var447 = client.field319.field1982;
                            client.field319.method2357(var442);
                            client.field319.method2357(var444);
                            client.field319.method2357(var446);
                            class122 var448 = client.field319;
                            int var449 = var448.field1982;
                            byte[] var450 = class165.method602(var441);
                            var448.method2370(var450.length);
                            var448.field1982 += Statics.field3166.method2294(var450, 0, var450.length, var448.field1981, var448.field1982);
                            client.field319.method2369(client.field319.field1982 - var447);
                            continue;
                        }
                        if (var488 == 5009) {
                            var6 -= 2;
                            String var451 = field788[var6];
                            String var452 = field788[var6 + 1];
                            client.field319.method2621(189);
                            client.field319.method2358(0);
                            int var453 = client.field319.field1982;
                            client.field319.method2363(var451);
                            class122 var454 = client.field319;
                            int var455 = var454.field1982;
                            byte[] var456 = class165.method602(var452);
                            var454.method2370(var456.length);
                            var454.field1982 += Statics.field3166.method2294(var456, 0, var456.length, var454.field1981, var454.field1982);
                            client.field319.method2555(client.field319.field1982 - var453);
                            continue;
                        }
                        if (var488 == 5015) {
                            String var457;
                            if (Statics.field13 == null || Statics.field13.field35 == null) {
                                var457 = "";
                            } else {
                                var457 = Statics.field13.field35;
                            }
                            field788[var6++] = var457;
                            continue;
                        }
                        if (var488 == 5016) {
                            field787[var5++] = client.field494;
                            continue;
                        }
                        if (var488 == 5017) {
                            var5--;
                            int var458 = field787[var5];
                            field787[var5++] = class12.method956(var458);
                            continue;
                        }
                        if (var488 == 5018) {
                            var5--;
                            int var459 = field787[var5];
                            field787[var5++] = class12.method3005(var459);
                            continue;
                        }
                        if (var488 == 5019) {
                            var5--;
                            int var460 = field787[var5];
                            int[] var461 = field787;
                            int var462 = var5++;
                            class36 var463 = (class36) class12.field167.method3586((long) var460);
                            int var464;
                            if (var463 == null) {
                                var464 = -1;
                            } else if (class12.field173.field3089 == var463.field3093) {
                                var464 = -1;
                            } else {
                                var464 = ((class36) var463.field3093).field770;
                            }
                            var461[var462] = var464;
                            continue;
                        }
                        if (var488 == 5020) {
                            var6--;
                            String var465 = field788[var6];
                            if (var465.equalsIgnoreCase("toggleroof")) {
                                Statics.field2278.field143 = !Statics.field2278.field143;
                                class9.method2680();
                                if (Statics.field2278.field143) {
                                    class12.method1029(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method1029(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var465.equalsIgnoreCase("displayfps")) {
                                client.field293 = !client.field293;
                            }
                            if (client.field442 >= 2) {
                                if (var465.equalsIgnoreCase("fpson")) {
                                    client.field293 = true;
                                }
                                if (var465.equalsIgnoreCase("fpsoff")) {
                                    client.field293 = false;
                                }
                                if (var465.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var465.equalsIgnoreCase("clientdrop")) {
                                    if (client.field401 > 0) {
                                        client.method1587();
                                    } else {
                                        client.method695(40);
                                        Statics.field139 = Statics.field171;
                                        Statics.field171 = null;
                                    }
                                }
                                if (var465.equalsIgnoreCase("errortest") && client.field280 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field319.method2621(246);
                            client.field319.method2357(var465.length() + 1);
                            client.field319.method2363(var465);
                            continue;
                        }
                        if (var488 == 5021) {
                            var6--;
                            client.field495 = field788[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var488 == 5022) {
                            field788[var6++] = client.field495;
                            continue;
                        }
                    }
                } else {
                    class173 var67;
                    if (var488 >= 2000) {
                        var488 -= 1000;
                        var5--;
                        var67 = class173.method1002(field787[var5]);
                    } else {
                        var67 = var41 ? Statics.field2245 : Statics.field1939;
                    }
                    if (var488 == 1300) {
                        var5--;
                        int var68 = field787[var5] - 1;
                        if (var68 >= 0 && var68 <= 9) {
                            var6--;
                            var67.method3234(var68, field788[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var488 == 1301) {
                        var5 -= 2;
                        int var69 = field787[var5];
                        int var70 = field787[var5 + 1];
                        var67.field2776 = class173.method3744(var69, var70);
                        continue;
                    }
                    if (var488 == 1302) {
                        var5--;
                        var67.field2811 = field787[var5] == 1;
                        continue;
                    }
                    if (var488 == 1303) {
                        var5--;
                        var67.field2805 = field787[var5];
                        continue;
                    }
                    if (var488 == 1304) {
                        var5--;
                        var67.field2810 = field787[var5];
                        continue;
                    }
                    if (var488 == 1305) {
                        var6--;
                        var67.field2806 = field788[var6];
                        continue;
                    }
                    if (var488 == 1306) {
                        var6--;
                        var67.field2812 = field788[var6];
                        continue;
                    }
                    if (var488 == 1307) {
                        var67.field2787 = null;
                        continue;
                    }
                }
                if (var488 < 5400) {
                    if (var488 == 5306) {
                        field787[var5++] = client.method679();
                        continue;
                    }
                    if (var488 == 5307) {
                        var5--;
                        int var466 = field787[var5];
                        if (var466 != 1 && var466 != 2) {
                            continue;
                        }
                        client.field488 = 0L;
                        if (var466 >= 2) {
                            client.field427 = true;
                        } else {
                            client.field427 = false;
                        }
                        client.method2674();
                        if (client.field297 >= 25) {
                            client.method247();
                        }
                        class144.field2187 = true;
                        continue;
                    }
                    if (var488 == 5308) {
                        field787[var5++] = Statics.field2278.field133;
                        continue;
                    }
                    if (var488 == 5309) {
                        var5--;
                        int var467 = field787[var5];
                        if (var467 == 1 || var467 == 2) {
                            Statics.field2278.field133 = var467;
                            class9.method2680();
                        }
                        continue;
                    }
                }
                if (var488 < 5600) {
                    if (var488 == 5504) {
                        var5 -= 2;
                        int var468 = field787[var5];
                        int var469 = field787[var5 + 1];
                        if (!client.field335) {
                            client.field361 = var468;
                            client.field435 = var469;
                        }
                        continue;
                    }
                    if (var488 == 5505) {
                        field787[var5++] = client.field361;
                        continue;
                    }
                    if (var488 == 5506) {
                        field787[var5++] = client.field435;
                        continue;
                    }
                    if (var488 == 5530) {
                        var5--;
                        int var470 = field787[var5];
                        if (var470 < 0) {
                            var470 = 0;
                        }
                        client.field367 = var470;
                        continue;
                    }
                    if (var488 == 5531) {
                        field787[var5++] = client.field367;
                        continue;
                    }
                }
                if (var488 >= 5700 || var488 != 5630) {
                    if (var488 < 6300) {
                        if (var488 == 6200) {
                            var5 -= 2;
                            client.field529 = (short) field787[var5];
                            if (client.field529 <= 0) {
                                client.field529 = 256;
                            }
                            client.field530 = (short) field787[var5 + 1];
                            if (client.field530 <= 0) {
                                client.field530 = 205;
                            }
                            continue;
                        }
                        if (var488 == 6201) {
                            var5 -= 2;
                            client.field489 = (short) field787[var5];
                            if (client.field489 <= 0) {
                                client.field489 = 256;
                            }
                            client.field532 = (short) field787[var5 + 1];
                            if (client.field532 <= 0) {
                                client.field532 = 320;
                            }
                            continue;
                        }
                        if (var488 == 6202) {
                            var5 -= 4;
                            client.field387 = (short) field787[var5];
                            if (client.field387 <= 0) {
                                client.field387 = 1;
                            }
                            client.field534 = (short) field787[var5 + 1];
                            if (client.field534 <= 0) {
                                client.field534 = 32767;
                            } else if (client.field534 < client.field387) {
                                client.field534 = client.field387;
                            }
                            client.field535 = (short) field787[var5 + 2];
                            if (client.field535 <= 0) {
                                client.field535 = 1;
                            }
                            client.field285 = (short) field787[var5 + 3];
                            if (client.field285 <= 0) {
                                client.field285 = 32767;
                            } else if (client.field285 < client.field535) {
                                client.field285 = client.field535;
                            }
                            continue;
                        }
                        if (var488 == 6203) {
                            if (client.field536 == null) {
                                field787[var5++] = -1;
                                field787[var5++] = -1;
                            } else {
                                client.method716(0, 0, client.field536.field2750, client.field536.field2751, false);
                                field787[var5++] = client.field539;
                                field787[var5++] = client.field540;
                            }
                            continue;
                        }
                        if (var488 == 6204) {
                            field787[var5++] = client.field489;
                            field787[var5++] = client.field532;
                            continue;
                        }
                        if (var488 == 6205) {
                            field787[var5++] = client.field529;
                            field787[var5++] = client.field530;
                            continue;
                        }
                    }
                    if (var488 < 6600) {
                        if (var488 == 6500) {
                            field787[var5++] = class26.method2998() ? 1 : 0;
                            continue;
                        }
                        if (var488 == 6501) {
                            class26.field624 = 0;
                            class26 var471 = class26.method205();
                            if (var471 == null) {
                                field787[var5++] = -1;
                                field787[var5++] = 0;
                                field788[var6++] = "";
                                field787[var5++] = 0;
                                field787[var5++] = 0;
                                field788[var6++] = "";
                            } else {
                                field787[var5++] = var471.field622;
                                field787[var5++] = var471.field623;
                                field788[var6++] = var471.field634;
                                field787[var5++] = var471.field627;
                                field787[var5++] = var471.field630;
                                field788[var6++] = var471.field625;
                            }
                            continue;
                        }
                        if (var488 == 6502) {
                            class26 var473;
                            if (class26.field624 < class26.field617) {
                                var473 = Statics.field616[++class26.field624 - 1];
                            } else {
                                var473 = null;
                            }
                            if (var473 == null) {
                                field787[var5++] = -1;
                                field787[var5++] = 0;
                                field788[var6++] = "";
                                field787[var5++] = 0;
                                field787[var5++] = 0;
                                field788[var6++] = "";
                            } else {
                                field787[var5++] = var473.field622;
                                field787[var5++] = var473.field623;
                                field788[var6++] = var473.field634;
                                field787[var5++] = var473.field627;
                                field787[var5++] = var473.field630;
                                field788[var6++] = var473.field625;
                            }
                            continue;
                        }
                        if (var488 == 6506) {
                            var5--;
                            int var475 = field787[var5];
                            class26 var476 = null;
                            for (int var477 = 0; var477 < class26.field617; var477++) {
                                if (Statics.field616[var477].field622 == var475) {
                                    var476 = Statics.field616[var477];
                                    break;
                                }
                            }
                            if (var476 == null) {
                                field787[var5++] = -1;
                                field787[var5++] = 0;
                                field788[var6++] = "";
                                field787[var5++] = 0;
                                field787[var5++] = 0;
                                field788[var6++] = "";
                            } else {
                                field787[var5++] = var476.field622;
                                field787[var5++] = var476.field623;
                                field788[var6++] = var476.field634;
                                field787[var5++] = var476.field627;
                                field787[var5++] = var476.field630;
                                field788[var6++] = var476.field625;
                            }
                            continue;
                        }
                        if (var488 == 6507) {
                            var5 -= 4;
                            int var478 = field787[var5];
                            boolean var479 = field787[var5 + 1] == 1;
                            int var480 = field787[var5 + 2];
                            boolean var481 = field787[var5 + 3] == 1;
                            class26.method682(var478, var479, var480, var481);
                            continue;
                        }
                        if (var488 == 6511) {
                            var5--;
                            int var482 = field787[var5];
                            if (var482 >= 0 && var482 < class26.field617) {
                                class26 var483 = Statics.field616[var482];
                                field787[var5++] = var483.field622;
                                field787[var5++] = var483.field623;
                                field788[var6++] = var483.field634;
                                field787[var5++] = var483.field627;
                                field787[var5++] = var483.field630;
                                field788[var6++] = var483.field625;
                                continue;
                            }
                            field787[var5++] = -1;
                            field787[var5++] = 0;
                            field788[var6++] = "";
                            field787[var5++] = 0;
                            field787[var5++] = 0;
                            field788[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field401 = 250;
            }
        } catch (Exception var487) {
            StringBuilder var485 = new StringBuilder(30);
            var485.append("").append(var4.field3105).append(" ");
            for (int var486 = field792 - 1; var486 >= 0; var486--) {
                var485.append("").append(field790[var486].field212.field3105).append(" ");
            }
            var485.append("").append(var10);
            class148.method769(var485.toString(), var487);
        }
    }

    @ObfuscatedName("cl.f(II)V")
    public static void method2043(int arg0) {
        if (arg0 == -1 || !class173.method3172(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2858[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2829 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field11 = var3.field2829;
                method2963(var4, 2000000);
            }
        }
    }
}
