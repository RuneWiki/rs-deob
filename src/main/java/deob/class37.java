package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("au")
public class class37 {

    @ObfuscatedName("au.d")
    public static int[] field784 = new int[5];

    @ObfuscatedName("au.l")
    public static int[][] field783 = new int[5][5000];

    @ObfuscatedName("au.r")
    public static int[] field788 = new int[1000];

    @ObfuscatedName("au.g")
    public static String[] field789 = new String[1000];

    @ObfuscatedName("au.h")
    public static int field787 = 0;

    @ObfuscatedName("au.n")
    public static class15[] field791 = new class15[50];

    @ObfuscatedName("au.b")
    public static Calendar field797 = Calendar.getInstance();

    @ObfuscatedName("au.c")
    public static final String[] field794 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("au.v")
    public static int field793 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.z(Lz;I)V")
    public static void method105(class1 arg0) {
        method2891(arg0, 200000);
    }

    @ObfuscatedName("ei.q(Lz;II)V")
    public static void method2891(class1 arg0, int arg1) {
        Object[] var2 = arg0.field17;
        int var3 = (Integer) var2[0];
        class23 var4 = Statics.method562(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field591;
        int[] var9 = var4.field585;
        byte var10 = -1;
        field787 = 0;
        try {
            Statics.field785 = new int[var4.field587];
            int var11 = 0;
            Statics.field2731 = new String[var4.field588];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2783;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2745;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2783;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2745;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field7;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field6;
                    }
                    Statics.field785[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field2731[var12++] = var15;
                }
            }
            int var16 = 0;
            field793 = arg0.field11;
            label3058: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var490 = var8[var7];
                if (var490 < 100) {
                    if (var490 == 0) {
                        field788[var5++] = var9[var7];
                        continue;
                    }
                    if (var490 == 1) {
                        int var17 = var9[var7];
                        field788[var5++] = class176.field2892[var17];
                        continue;
                    }
                    if (var490 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2892[var18] = field788[var5];
                        client.method2179(var18);
                        continue;
                    }
                    if (var490 == 3) {
                        field789[var6++] = var4.field586[var7];
                        continue;
                    }
                    if (var490 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var490 == 7) {
                        var5 -= 2;
                        if (field788[var5 + 1] != field788[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var490 == 8) {
                        var5 -= 2;
                        if (field788[var5 + 1] == field788[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var490 == 9) {
                        var5 -= 2;
                        if (field788[var5] < field788[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var490 == 10) {
                        var5 -= 2;
                        if (field788[var5] > field788[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var490 == 21) {
                        if (field787 == 0) {
                            return;
                        }
                        class15 var19 = field791[--field787];
                        var4 = var19.field207;
                        var8 = var4.field591;
                        var9 = var4.field585;
                        var7 = var19.field203;
                        Statics.field785 = var19.field209;
                        Statics.field2731 = var19.field204;
                        continue;
                    }
                    if (var490 == 25) {
                        int var20 = var9[var7];
                        field788[var5++] = class176.method951(var20);
                        continue;
                    }
                    if (var490 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field788[var5];
                        class48 var23 = class48.method533(var21);
                        int var24 = var23.field1056;
                        int var25 = var23.field1058;
                        int var26 = var23.field1062;
                        int var27 = class176.field2889[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class176.field2892[var24] = class176.field2892[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var490 == 31) {
                        var5 -= 2;
                        if (field788[var5] <= field788[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var490 == 32) {
                        var5 -= 2;
                        if (field788[var5] >= field788[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var490 == 33) {
                        field788[var5++] = Statics.field785[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var490 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field785[var10001] = field788[var5];
                        continue;
                    }
                    if (var490 == 35) {
                        field789[var6++] = Statics.field2731[var9[var7]];
                        continue;
                    }
                    if (var490 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2731[var10001] = field789[var6];
                        continue;
                    }
                    if (var490 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String var30 = class163.method2870(field789, var6, var29);
                        field789[var6++] = var30;
                        continue;
                    }
                    if (var490 == 38) {
                        var5--;
                        continue;
                    }
                    if (var490 == 39) {
                        var6--;
                        continue;
                    }
                    if (var490 == 40) {
                        int var31 = var9[var7];
                        class23 var32 = Statics.method562(var31);
                        int[] var33 = new int[var32.field587];
                        String[] var34 = new String[var32.field588];
                        for (int var35 = 0; var35 < var32.field589; var35++) {
                            var33[var35] = field788[var5 - var32.field589 + var35];
                        }
                        for (int var36 = 0; var36 < var32.field583; var36++) {
                            var34[var36] = field789[var6 - var32.field583 + var36];
                        }
                        var5 -= var32.field589;
                        var6 -= var32.field583;
                        class15 var37 = new class15();
                        var37.field207 = var4;
                        var37.field203 = var7;
                        var37.field209 = Statics.field785;
                        var37.field204 = Statics.field2731;
                        field791[++field787 - 1] = var37;
                        var4 = var32;
                        var8 = var32.field591;
                        var9 = var32.field585;
                        var7 = -1;
                        Statics.field785 = var33;
                        Statics.field2731 = var34;
                        continue;
                    }
                    if (var490 == 42) {
                        field788[var5++] = Statics.field60.method191(var9[var7]);
                        continue;
                    }
                    if (var490 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field60.method187(var10001, field788[var5]);
                        continue;
                    }
                    if (var490 == 44) {
                        int var38 = var9[var7] >> 16;
                        int var39 = var9[var7] & 0xFFFF;
                        var5--;
                        int var40 = field788[var5];
                        if (var40 >= 0 && var40 <= 5000) {
                            field784[var38] = var40;
                            byte var41 = -1;
                            if (var39 == 105) {
                                var41 = 0;
                            }
                            int var42 = 0;
                            while (true) {
                                if (var42 >= var40) {
                                    continue label3058;
                                }
                                field783[var38][var42] = var41;
                                var42++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var490 == 45) {
                        int var43 = var9[var7];
                        var5--;
                        int var44 = field788[var5];
                        if (var44 >= 0 && var44 < field784[var43]) {
                            field788[var5++] = field783[var43][var44];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var490 == 46) {
                        int var45 = var9[var7];
                        var5 -= 2;
                        int var46 = field788[var5];
                        if (var46 >= 0 && var46 < field784[var45]) {
                            field783[var45][var46] = field788[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var490 == 47) {
                        String var47 = Statics.field60.method190(var9[var7]);
                        if (var47 == null) {
                            var47 = "null";
                        }
                        field789[var6++] = var47;
                        continue;
                    }
                    if (var490 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field60.method189(var10001, field789[var6]);
                        continue;
                    }
                }
                boolean var48;
                if (var9[var7] == 1) {
                    var48 = true;
                } else {
                    var48 = false;
                }
                if (var490 < 1000) {
                    if (var490 == 100) {
                        var5 -= 3;
                        int var49 = field788[var5];
                        int var50 = field788[var5 + 1];
                        int var51 = field788[var5 + 2];
                        if (var50 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var52 = class173.method899(var49);
                        if (var52.field2844 == null) {
                            var52.field2844 = new class173[var51 + 1];
                        }
                        if (var52.field2844.length <= var51) {
                            class173[] var53 = new class173[var51 + 1];
                            for (int var54 = 0; var54 < var52.field2844.length; var54++) {
                                var53[var54] = var52.field2844[var54];
                            }
                            var52.field2844 = var53;
                        }
                        if (var51 > 0 && var52.field2844[var51 - 1] == null) {
                            throw new RuntimeException("" + (var51 - 1));
                        }
                        class173 var55 = new class173();
                        var55.field2746 = var50;
                        var55.field2752 = var55.field2783 = var52.field2783;
                        var55.field2745 = var51;
                        var55.field2861 = true;
                        var52.field2844[var51] = var55;
                        if (var48) {
                            Statics.field2141 = var55;
                        } else {
                            Statics.field792 = var55;
                        }
                        client.method2240(var52);
                        continue;
                    }
                    if (var490 == 101) {
                        class173 var56 = var48 ? Statics.field2141 : Statics.field792;
                        class173 var57 = class173.method899(var56.field2783);
                        var57.field2844[var56.field2745] = null;
                        client.method2240(var57);
                        continue;
                    }
                    if (var490 == 102) {
                        var5--;
                        class173 var58 = class173.method899(field788[var5]);
                        var58.field2844 = null;
                        client.method2240(var58);
                        continue;
                    }
                    if (var490 == 200) {
                        var5 -= 2;
                        int var59 = field788[var5];
                        int var60 = field788[var5 + 1];
                        class173 var61 = class173.method1026(var59, var60);
                        if (var61 != null && var60 != -1) {
                            field788[var5++] = 1;
                            if (var48) {
                                Statics.field2141 = var61;
                            } else {
                                Statics.field792 = var61;
                            }
                            continue;
                        }
                        field788[var5++] = 0;
                        continue;
                    }
                    if (var490 == 201) {
                        var5--;
                        class173 var62 = class173.method899(field788[var5]);
                        if (var62 == null) {
                            field788[var5++] = 0;
                        } else {
                            field788[var5++] = 1;
                            if (var48) {
                                Statics.field2141 = var62;
                            } else {
                                Statics.field792 = var62;
                            }
                        }
                        continue;
                    }
                } else if (var490 >= 1000 && var490 < 1100 || var490 >= 2000 && var490 < 2100) {
                    int var63 = -1;
                    class173 var64;
                    if (var490 >= 2000) {
                        var490 -= 1000;
                        var5--;
                        var63 = field788[var5];
                        var64 = class173.method899(var63);
                    } else {
                        var64 = var48 ? Statics.field2141 : Statics.field792;
                    }
                    if (var490 == 1000) {
                        var5 -= 4;
                        var64.field2753 = field788[var5];
                        var64.field2754 = field788[var5 + 1];
                        var64.field2747 = field788[var5 + 2];
                        var64.field2843 = field788[var5 + 3];
                        client.method2240(var64);
                        client.method152(var64);
                        if (var63 != -1 && var64.field2746 == 0) {
                            client.method3094(Statics.field2802[var63 >> 16], var64, false);
                        }
                        continue;
                    }
                    if (var490 == 1001) {
                        var5 -= 4;
                        var64.field2755 = field788[var5];
                        var64.field2792 = field788[var5 + 1];
                        var64.field2803 = field788[var5 + 2];
                        var64.field2771 = field788[var5 + 3];
                        client.method2240(var64);
                        client.method152(var64);
                        if (var63 != -1 && var64.field2746 == 0) {
                            client.method3094(Statics.field2802[var63 >> 16], var64, false);
                        }
                        continue;
                    }
                    if (var490 == 1003) {
                        var5--;
                        boolean var65 = field788[var5] == 1;
                        if (var64.field2764 != var65) {
                            var64.field2764 = var65;
                            client.method2240(var64);
                        }
                        continue;
                    }
                    if (var490 == 1005) {
                        var5--;
                        var64.field2875 = field788[var5] == 1;
                        continue;
                    }
                    if (var490 == 1006) {
                        var5--;
                        var64.field2876 = field788[var5] == 1;
                        continue;
                    }
                } else if (!(var490 < 1100 || var490 >= 1200) || !(var490 < 2100 || var490 >= 2200)) {
                    int var66 = -1;
                    class173 var67;
                    if (var490 >= 2000) {
                        var490 -= 1000;
                        var5--;
                        var66 = field788[var5];
                        var67 = class173.method899(var66);
                    } else {
                        var67 = var48 ? Statics.field2141 : Statics.field792;
                    }
                    if (var490 == 1100) {
                        var5 -= 2;
                        var67.field2765 = field788[var5];
                        if (var67.field2765 > var67.field2767 - var67.field2759) {
                            var67.field2765 = var67.field2767 - var67.field2759;
                        }
                        if (var67.field2765 < 0) {
                            var67.field2765 = 0;
                        }
                        var67.field2766 = field788[var5 + 1];
                        if (var67.field2766 > var67.field2768 - var67.field2775) {
                            var67.field2766 = var67.field2768 - var67.field2775;
                        }
                        if (var67.field2766 < 0) {
                            var67.field2766 = 0;
                        }
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1101) {
                        var5--;
                        var67.field2769 = field788[var5];
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1102) {
                        var5--;
                        var67.field2773 = field788[var5] == 1;
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1103) {
                        var5--;
                        var67.field2774 = field788[var5];
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1104) {
                        var5--;
                        var67.field2866 = field788[var5];
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1105) {
                        var5--;
                        var67.field2777 = field788[var5];
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1106) {
                        var5--;
                        var67.field2829 = field788[var5];
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1107) {
                        var5--;
                        var67.field2818 = field788[var5] == 1;
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1108) {
                        var67.field2785 = 1;
                        var5--;
                        var67.field2786 = field788[var5];
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1109) {
                        var5 -= 6;
                        var67.field2791 = field788[var5];
                        var67.field2750 = field788[var5 + 1];
                        var67.field2862 = field788[var5 + 2];
                        var67.field2794 = field788[var5 + 3];
                        var67.field2795 = field788[var5 + 4];
                        var67.field2734 = field788[var5 + 5];
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1110) {
                        var5--;
                        int var68 = field788[var5];
                        if (var67.field2789 != var68) {
                            var67.field2789 = var68;
                            var67.field2864 = 0;
                            var67.field2865 = 0;
                            client.method2240(var67);
                        }
                        continue;
                    }
                    if (var490 == 1111) {
                        var5--;
                        var67.field2799 = field788[var5] == 1;
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1112) {
                        var6--;
                        String var69 = field789[var6];
                        if (!var69.equals(var67.field2741)) {
                            var67.field2741 = var69;
                            client.method2240(var67);
                        }
                        continue;
                    }
                    if (var490 == 1113) {
                        var5--;
                        var67.field2819 = field788[var5];
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1114) {
                        var5 -= 3;
                        var67.field2805 = field788[var5];
                        var67.field2806 = field788[var5 + 1];
                        var67.field2797 = field788[var5 + 2];
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1115) {
                        var5--;
                        var67.field2869 = field788[var5] == 1;
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1116) {
                        var5--;
                        var67.field2781 = field788[var5];
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1117) {
                        var5--;
                        var67.field2782 = field788[var5];
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1118) {
                        var5--;
                        var67.field2788 = field788[var5] == 1;
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1119) {
                        var5--;
                        var67.field2793 = field788[var5] == 1;
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1120) {
                        var5 -= 2;
                        var67.field2767 = field788[var5];
                        var67.field2768 = field788[var5 + 1];
                        client.method2240(var67);
                        if (var66 != -1 && var67.field2746 == 0) {
                            client.method3094(Statics.field2802[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var490 == 1121) {
                        int var70 = var67.field2783;
                        int var71 = var67.field2745;
                        client.field321.method2547(147);
                        client.field321.method2333(var71);
                        client.field321.method2460(var70);
                        client.field443 = var67;
                        client.method2240(var67);
                        continue;
                    }
                    if (var490 == 1122) {
                        var5--;
                        var67.field2778 = field788[var5];
                        client.method2240(var67);
                        continue;
                    }
                } else if (!(var490 < 1200 || var490 >= 1300) || !(var490 < 2200 || var490 >= 2300)) {
                    class173 var72;
                    if (var490 >= 2000) {
                        var490 -= 1000;
                        var5--;
                        var72 = class173.method899(field788[var5]);
                    } else {
                        var72 = var48 ? Statics.field2141 : Statics.field792;
                    }
                    client.method2240(var72);
                    if (var490 == 1200 || var490 == 1205 || var490 == 1212) {
                        var5 -= 2;
                        int var73 = field788[var5];
                        int var74 = field788[var5 + 1];
                        var72.field2867 = var73;
                        var72.field2863 = var74;
                        class52 var75 = class52.method10(var73);
                        var72.field2862 = var75.field1100;
                        var72.field2794 = var75.field1118;
                        var72.field2795 = var75.field1119;
                        var72.field2791 = var75.field1120;
                        var72.field2750 = var75.field1121;
                        var72.field2734 = var75.field1116;
                        if (var490 == 1205) {
                            var72.field2751 = 0;
                        } else if (var490 == 1212 | var75.field1122 == 1) {
                            var72.field2751 = 1;
                        } else {
                            var72.field2751 = 2;
                        }
                        if (var72.field2780 > 0) {
                            var72.field2734 = var72.field2734 * 32 / var72.field2780;
                        } else if (var72.field2755 > 0) {
                            var72.field2734 = var72.field2734 * 32 / var72.field2755;
                        }
                        continue;
                    }
                    if (var490 == 1201) {
                        var72.field2785 = 2;
                        var5--;
                        var72.field2786 = field788[var5];
                        continue;
                    }
                    if (var490 == 1202) {
                        var72.field2785 = 3;
                        var72.field2786 = Statics.field859.field53.method3188();
                        continue;
                    }
                } else if (var490 >= 1300 && var490 < 1400 || var490 >= 2300 && var490 < 2400) {
                    class173 var76;
                    if (var490 >= 2000) {
                        var490 -= 1000;
                        var5--;
                        var76 = class173.method899(field788[var5]);
                    } else {
                        var76 = var48 ? Statics.field2141 : Statics.field792;
                    }
                    if (var490 == 1300) {
                        var5--;
                        int var77 = field788[var5] - 1;
                        if (var77 >= 0 && var77 <= 9) {
                            var6--;
                            var76.method3124(var77, field789[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var490 == 1301) {
                        var5 -= 2;
                        int var78 = field788[var5];
                        int var79 = field788[var5 + 1];
                        var76.field2817 = class173.method1026(var78, var79);
                        continue;
                    }
                    if (var490 == 1302) {
                        var5--;
                        var76.field2859 = field788[var5] == 1;
                        continue;
                    }
                    if (var490 == 1303) {
                        var5--;
                        var76.field2743 = field788[var5];
                        continue;
                    }
                    if (var490 == 1304) {
                        var5--;
                        var76.field2848 = field788[var5];
                        continue;
                    }
                    if (var490 == 1305) {
                        var6--;
                        var76.field2815 = field789[var6];
                        continue;
                    }
                    if (var490 == 1306) {
                        var6--;
                        var76.field2821 = field789[var6];
                        continue;
                    }
                    if (var490 == 1307) {
                        var76.field2835 = null;
                        continue;
                    }
                } else {
                    if (var490 >= 1400 && var490 < 1500 || var490 >= 2400 && var490 < 2500) {
                        class173 var80;
                        if (var490 >= 2000) {
                            var490 -= 1000;
                            var5--;
                            var80 = class173.method899(field788[var5]);
                        } else {
                            var80 = var48 ? Statics.field2141 : Statics.field792;
                        }
                        var6--;
                        String var81 = field789[var6];
                        int[] var82 = null;
                        if (var81.length() > 0 && var81.charAt(var81.length() - 1) == 'Y') {
                            var5--;
                            int var83 = field788[var5];
                            if (var83 > 0) {
                                var82 = new int[var83];
                                while (var83-- > 0) {
                                    var5--;
                                    var82[var83] = field788[var5];
                                }
                            }
                            var81 = var81.substring(0, var81.length() - 1);
                        }
                        Object[] var84 = new Object[var81.length() + 1];
                        for (int var85 = var84.length - 1; var85 >= 1; var85--) {
                            if (var81.charAt(var85 - 1) == 's') {
                                var6--;
                                var84[var85] = field789[var6];
                            } else {
                                var5--;
                                var84[var85] = Integer.valueOf(field788[var5]);
                            }
                        }
                        var5--;
                        int var86 = field788[var5];
                        if (var86 == -1) {
                            var84 = null;
                        } else {
                            var84[0] = Integer.valueOf(var86);
                        }
                        if (var490 == 1400) {
                            var80.field2779 = var84;
                        }
                        if (var490 == 1401) {
                            var80.field2827 = var84;
                        }
                        if (var490 == 1402) {
                            var80.field2826 = var84;
                        }
                        if (var490 == 1403) {
                            var80.field2828 = var84;
                        }
                        if (var490 == 1404) {
                            var80.field2830 = var84;
                        }
                        if (var490 == 1405) {
                            var80.field2831 = var84;
                        }
                        if (var490 == 1406) {
                            var80.field2796 = var84;
                        }
                        if (var490 == 1407) {
                            var80.field2809 = var84;
                            var80.field2836 = var82;
                        }
                        if (var490 == 1408) {
                            var80.field2841 = var84;
                        }
                        if (var490 == 1409) {
                            var80.field2842 = var84;
                        }
                        if (var490 == 1410) {
                            var80.field2832 = var84;
                        }
                        if (var490 == 1411) {
                            var80.field2825 = var84;
                        }
                        if (var490 == 1412) {
                            var80.field2801 = var84;
                        }
                        if (var490 == 1414) {
                            var80.field2837 = var84;
                            var80.field2770 = var82;
                        }
                        if (var490 == 1415) {
                            var80.field2839 = var84;
                            var80.field2840 = var82;
                        }
                        if (var490 == 1416) {
                            var80.field2833 = var84;
                        }
                        if (var490 == 1417) {
                            var80.field2807 = var84;
                        }
                        if (var490 == 1418) {
                            var80.field2860 = var84;
                        }
                        if (var490 == 1419) {
                            var80.field2845 = var84;
                        }
                        if (var490 == 1420) {
                            var80.field2760 = var84;
                        }
                        if (var490 == 1421) {
                            var80.field2847 = var84;
                        }
                        if (var490 == 1422) {
                            var80.field2748 = var84;
                        }
                        if (var490 == 1423) {
                            var80.field2849 = var84;
                        }
                        if (var490 == 1424) {
                            var80.field2850 = var84;
                        }
                        if (var490 == 1425) {
                            var80.field2852 = var84;
                        }
                        if (var490 == 1426) {
                            var80.field2853 = var84;
                        }
                        if (var490 == 1427) {
                            var80.field2851 = var84;
                        }
                        var80.field2822 = true;
                        continue;
                    }
                    if (var490 < 1600) {
                        class173 var87 = var48 ? Statics.field2141 : Statics.field792;
                        if (var490 == 1500) {
                            field788[var5++] = var87.field2757;
                            continue;
                        }
                        if (var490 == 1501) {
                            field788[var5++] = var87.field2758;
                            continue;
                        }
                        if (var490 == 1502) {
                            field788[var5++] = var87.field2759;
                            continue;
                        }
                        if (var490 == 1503) {
                            field788[var5++] = var87.field2775;
                            continue;
                        }
                        if (var490 == 1504) {
                            field788[var5++] = var87.field2764 ? 1 : 0;
                            continue;
                        }
                        if (var490 == 1505) {
                            field788[var5++] = var87.field2752;
                            continue;
                        }
                    } else if (var490 < 1700) {
                        class173 var88 = var48 ? Statics.field2141 : Statics.field792;
                        if (var490 == 1600) {
                            field788[var5++] = var88.field2765;
                            continue;
                        }
                        if (var490 == 1601) {
                            field788[var5++] = var88.field2766;
                            continue;
                        }
                        if (var490 == 1602) {
                            field789[var6++] = var88.field2741;
                            continue;
                        }
                        if (var490 == 1603) {
                            field788[var5++] = var88.field2767;
                            continue;
                        }
                        if (var490 == 1604) {
                            field788[var5++] = var88.field2768;
                            continue;
                        }
                        if (var490 == 1605) {
                            field788[var5++] = var88.field2734;
                            continue;
                        }
                        if (var490 == 1606) {
                            field788[var5++] = var88.field2862;
                            continue;
                        }
                        if (var490 == 1607) {
                            field788[var5++] = var88.field2795;
                            continue;
                        }
                        if (var490 == 1608) {
                            field788[var5++] = var88.field2794;
                            continue;
                        }
                        if (var490 == 1609) {
                            field788[var5++] = var88.field2774;
                            continue;
                        }
                    } else if (var490 < 1800) {
                        class173 var89 = var48 ? Statics.field2141 : Statics.field792;
                        if (var490 == 1700) {
                            field788[var5++] = var89.field2867;
                            continue;
                        }
                        if (var490 == 1701) {
                            if (var89.field2867 == -1) {
                                field788[var5++] = 0;
                            } else {
                                field788[var5++] = var89.field2863;
                            }
                            continue;
                        }
                        if (var490 == 1702) {
                            field788[var5++] = var89.field2745;
                            continue;
                        }
                    } else if (var490 < 1900) {
                        class173 var90 = var48 ? Statics.field2141 : Statics.field792;
                        if (var490 == 1800) {
                            int[] var91 = field788;
                            int var92 = var5++;
                            int var93 = client.method136(var90);
                            int var94 = var93 >> 11 & 0x3F;
                            var91[var92] = var94;
                            continue;
                        }
                        if (var490 == 1801) {
                            var5--;
                            int var95 = field788[var5];
                            int var491 = var95 - 1;
                            if (var90.field2835 != null && var491 < var90.field2835.length && var90.field2835[var491] != null) {
                                field789[var6++] = var90.field2835[var491];
                                continue;
                            }
                            field789[var6++] = "";
                            continue;
                        }
                        if (var490 == 1802) {
                            if (var90.field2815 == null) {
                                field789[var6++] = "";
                            } else {
                                field789[var6++] = var90.field2815;
                            }
                            continue;
                        }
                    } else if (!(var490 < 1900 || var490 >= 2000) || !(var490 < 2900 || var490 >= 3000)) {
                        class173 var96;
                        if (var490 >= 2000) {
                            var490 -= 1000;
                            var5--;
                            var96 = class173.method899(field788[var5]);
                        } else {
                            var96 = var48 ? Statics.field2141 : Statics.field792;
                        }
                        if (var490 == 1927) {
                            if (field793 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var96.field2851 == null) {
                                return;
                            }
                            class1 var97 = new class1();
                            var97.field3 = var96;
                            var97.field17 = var96.field2851;
                            var97.field11 = field793 + 1;
                            client.field493.method3491(arg0);
                            continue;
                        }
                    } else if (var490 < 2600) {
                        var5--;
                        class173 var98 = class173.method899(field788[var5]);
                        if (var490 == 2500) {
                            field788[var5++] = var98.field2757;
                            continue;
                        }
                        if (var490 == 2501) {
                            field788[var5++] = var98.field2758;
                            continue;
                        }
                        if (var490 == 2502) {
                            field788[var5++] = var98.field2759;
                            continue;
                        }
                        if (var490 == 2503) {
                            field788[var5++] = var98.field2775;
                            continue;
                        }
                        if (var490 == 2504) {
                            field788[var5++] = var98.field2764 ? 1 : 0;
                            continue;
                        }
                        if (var490 == 2505) {
                            field788[var5++] = var98.field2752;
                            continue;
                        }
                    } else if (var490 < 2700) {
                        var5--;
                        class173 var99 = class173.method899(field788[var5]);
                        if (var490 == 2600) {
                            field788[var5++] = var99.field2765;
                            continue;
                        }
                        if (var490 == 2601) {
                            field788[var5++] = var99.field2766;
                            continue;
                        }
                        if (var490 == 2602) {
                            field789[var6++] = var99.field2741;
                            continue;
                        }
                        if (var490 == 2603) {
                            field788[var5++] = var99.field2767;
                            continue;
                        }
                        if (var490 == 2604) {
                            field788[var5++] = var99.field2768;
                            continue;
                        }
                        if (var490 == 2605) {
                            field788[var5++] = var99.field2734;
                            continue;
                        }
                        if (var490 == 2606) {
                            field788[var5++] = var99.field2862;
                            continue;
                        }
                        if (var490 == 2607) {
                            field788[var5++] = var99.field2795;
                            continue;
                        }
                        if (var490 == 2608) {
                            field788[var5++] = var99.field2794;
                            continue;
                        }
                        if (var490 == 2609) {
                            field788[var5++] = var99.field2774;
                            continue;
                        }
                    } else if (var490 < 2800) {
                        if (var490 == 2700) {
                            var5--;
                            class173 var100 = class173.method899(field788[var5]);
                            field788[var5++] = var100.field2867;
                            continue;
                        }
                        if (var490 == 2701) {
                            var5--;
                            class173 var101 = class173.method899(field788[var5]);
                            if (var101.field2867 == -1) {
                                field788[var5++] = 0;
                            } else {
                                field788[var5++] = var101.field2863;
                            }
                            continue;
                        }
                        if (var490 == 2702) {
                            var5--;
                            int var102 = field788[var5];
                            class4 var103 = (class4) client.field519.method3462((long) var102);
                            if (var103 == null) {
                                field788[var5++] = 0;
                            } else {
                                field788[var5++] = 1;
                            }
                            continue;
                        }
                        if (var490 == 2706) {
                            field788[var5++] = client.field439;
                            continue;
                        }
                    } else if (var490 < 2900) {
                        var5--;
                        class173 var104 = class173.method899(field788[var5]);
                        if (var490 == 2800) {
                            int[] var105 = field788;
                            int var106 = var5++;
                            int var107 = client.method136(var104);
                            int var108 = var107 >> 11 & 0x3F;
                            var105[var106] = var108;
                            continue;
                        }
                        if (var490 == 2801) {
                            var5--;
                            int var109 = field788[var5];
                            int var492 = var109 - 1;
                            if (var104.field2835 != null && var492 < var104.field2835.length && var104.field2835[var492] != null) {
                                field789[var6++] = var104.field2835[var492];
                                continue;
                            }
                            field789[var6++] = "";
                            continue;
                        }
                        if (var490 == 2802) {
                            if (var104.field2815 == null) {
                                field789[var6++] = "";
                            } else {
                                field789[var6++] = var104.field2815;
                            }
                            continue;
                        }
                    } else if (var490 < 3200) {
                        if (var490 == 3100) {
                            var6--;
                            String var110 = field789[var6];
                            class12.method2763(0, "", var110);
                            continue;
                        }
                        if (var490 == 3101) {
                            var5 -= 2;
                            client.method724(Statics.field859, field788[var5], field788[var5 + 1]);
                            continue;
                        }
                        if (var490 == 3103) {
                            client.field321.method2547(176);
                            for (class4 var111 = (class4) client.field519.method3464(); var111 != null; var111 = (class4) client.field519.method3465()) {
                                if (var111.field58 == 0 || var111.field58 == 3) {
                                    client.method683(var111, true);
                                }
                            }
                            if (client.field443 != null) {
                                client.method2240(client.field443);
                                client.field443 = null;
                            }
                            continue;
                        }
                        if (var490 == 3104) {
                            var6--;
                            String var112 = field789[var6];
                            int var113 = 0;
                            if (Statics.method2502(var112)) {
                                int var114 = class163.method894(var112, 10, true);
                                var113 = var114;
                            }
                            client.field321.method2547(239);
                            client.field321.method2289(var113);
                            continue;
                        }
                        if (var490 == 3105) {
                            var6--;
                            String var115 = field789[var6];
                            client.field321.method2547(98);
                            client.field321.method2285(var115.length() + 1);
                            client.field321.method2393(var115);
                            continue;
                        }
                        if (var490 == 3106) {
                            var6--;
                            String var116 = field789[var6];
                            client.field321.method2547(44);
                            client.field321.method2285(var116.length() + 1);
                            client.field321.method2393(var116);
                            continue;
                        }
                        if (var490 == 3107) {
                            var5--;
                            int var117 = field788[var5];
                            var6--;
                            String var118 = field789[var6];
                            Statics.method898(var117, var118);
                            continue;
                        }
                        if (var490 == 3108) {
                            var5 -= 3;
                            int var119 = field788[var5];
                            int var120 = field788[var5 + 1];
                            int var121 = field788[var5 + 2];
                            class173 var122 = class173.method899(var121);
                            client.method723(var122, var119, var120);
                            continue;
                        }
                        if (var490 == 3109) {
                            var5 -= 2;
                            int var123 = field788[var5];
                            int var124 = field788[var5 + 1];
                            class173 var125 = var48 ? Statics.field2141 : Statics.field792;
                            client.method723(var125, var123, var124);
                            continue;
                        }
                        if (var490 == 3110) {
                            var5--;
                            Statics.field215 = field788[var5] == 1;
                            continue;
                        }
                        if (var490 == 3111) {
                            field788[var5++] = Statics.field2026.field138 ? 1 : 0;
                            continue;
                        }
                        if (var490 == 3112) {
                            var5--;
                            Statics.field2026.field138 = field788[var5] == 1;
                            class9.method3591();
                            continue;
                        }
                        if (var490 == 3113) {
                            var6--;
                            String var126 = field789[var6];
                            var5--;
                            boolean var127 = field788[var5] == 1;
                            class138.method2096(var126, var127, false);
                            continue;
                        }
                        if (var490 == 3115) {
                            var5--;
                            int var128 = field788[var5];
                            client.field321.method2547(108);
                            client.field321.method2287(var128);
                            continue;
                        }
                        if (var490 == 3116) {
                            var5--;
                            int var129 = field788[var5];
                            var6 -= 2;
                            String var130 = field789[var6];
                            String var131 = field789[var6 + 1];
                            if (var130.length() <= 500 && var131.length() <= 500) {
                                client.field321.method2547(84);
                                client.field321.method2287(1 + class119.method2618(var130) + class119.method2618(var131));
                                client.field321.method2393(var131);
                                client.field321.method2393(var130);
                                client.field321.method2362(var129);
                            }
                            continue;
                        }
                    } else if (var490 < 3300) {
                        if (var490 == 3200) {
                            var5 -= 3;
                            client.method1503(field788[var5], field788[var5 + 1], field788[var5 + 2]);
                            continue;
                        }
                        if (var490 == 3201) {
                            var5--;
                            int var132 = field788[var5];
                            if (var132 == -1 && !client.field489) {
                                Statics.field2943.method3302();
                                class183.field2944 = 1;
                                Statics.field2945 = null;
                            } else if (var132 != -1 && client.field518 != var132 && client.field517 != 0 && !client.field489) {
                                class168 var133 = Statics.field1608;
                                int var134 = client.field517;
                                class183.field2944 = 1;
                                Statics.field2945 = var133;
                                Statics.field1767 = var132;
                                Statics.field2942 = 0;
                                Statics.field2727 = var134;
                                Statics.field2946 = false;
                                Statics.field2632 = 2;
                            }
                            client.field518 = var132;
                            continue;
                        }
                        if (var490 == 3202) {
                            var5 -= 2;
                            int var135 = field788[var5];
                            int var10000 = field788[var5 + 1];
                            if (client.field517 != 0 && var135 != -1) {
                                class183.method96(Statics.field2977, var135, 0, client.field517, false);
                                client.field489 = true;
                            }
                            continue;
                        }
                    } else if (var490 < 3400) {
                        if (var490 == 3300) {
                            field788[var5++] = client.field290;
                            continue;
                        }
                        if (var490 == 3301) {
                            var5 -= 2;
                            int var137 = field788[var5];
                            int var138 = field788[var5 + 1];
                            int[] var139 = field788;
                            int var140 = var5++;
                            class16 var141 = (class16) class16.field218.method3462((long) var137);
                            int var142;
                            if (var141 == null) {
                                var142 = -1;
                            } else if (var138 >= 0 && var138 < var141.field213.length) {
                                var142 = var141.field213[var138];
                            } else {
                                var142 = -1;
                            }
                            var139[var140] = var142;
                            continue;
                        }
                        if (var490 == 3302) {
                            var5 -= 2;
                            int var143 = field788[var5];
                            int var144 = field788[var5 + 1];
                            int[] var145 = field788;
                            int var146 = var5++;
                            class16 var147 = (class16) class16.field218.method3462((long) var143);
                            int var148;
                            if (var147 == null) {
                                var148 = 0;
                            } else if (var144 >= 0 && var144 < var147.field214.length) {
                                var148 = var147.field214[var144];
                            } else {
                                var148 = 0;
                            }
                            var145[var146] = var148;
                            continue;
                        }
                        if (var490 == 3303) {
                            var5 -= 2;
                            int var149 = field788[var5];
                            int var150 = field788[var5 + 1];
                            field788[var5++] = class16.method681(var149, var150);
                            continue;
                        }
                        if (var490 == 3304) {
                            var5--;
                            int var151 = field788[var5];
                            field788[var5++] = Statics.method800(var151).field1090;
                            continue;
                        }
                        if (var490 == 3305) {
                            var5--;
                            int var152 = field788[var5];
                            field788[var5++] = client.field416[var152];
                            continue;
                        }
                        if (var490 == 3306) {
                            var5--;
                            int var153 = field788[var5];
                            field788[var5++] = client.field417[var153];
                            continue;
                        }
                        if (var490 == 3307) {
                            var5--;
                            int var154 = field788[var5];
                            field788[var5++] = client.field418[var154];
                            continue;
                        }
                        if (var490 == 3308) {
                            int var155 = Statics.field2179;
                            int var156 = (Statics.field859.field826 >> 7) + Statics.field86;
                            int var157 = (Statics.field859.field801 >> 7) + Statics.field2893;
                            field788[var5++] = (var155 << 28) + (var156 << 14) + var157;
                            continue;
                        }
                        if (var490 == 3309) {
                            var5--;
                            int var158 = field788[var5];
                            field788[var5++] = var158 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var490 == 3310) {
                            var5--;
                            int var159 = field788[var5];
                            field788[var5++] = var159 >> 28;
                            continue;
                        }
                        if (var490 == 3311) {
                            var5--;
                            int var160 = field788[var5];
                            field788[var5++] = var160 & 0x3FFF;
                            continue;
                        }
                        if (var490 == 3312) {
                            field788[var5++] = client.field536 ? 1 : 0;
                            continue;
                        }
                        if (var490 == 3313) {
                            var5 -= 2;
                            int var161 = field788[var5] + 32768;
                            int var162 = field788[var5 + 1];
                            int[] var163 = field788;
                            int var164 = var5++;
                            class16 var165 = (class16) class16.field218.method3462((long) var161);
                            int var166;
                            if (var165 == null) {
                                var166 = -1;
                            } else if (var162 >= 0 && var162 < var165.field213.length) {
                                var166 = var165.field213[var162];
                            } else {
                                var166 = -1;
                            }
                            var163[var164] = var166;
                            continue;
                        }
                        if (var490 == 3314) {
                            var5 -= 2;
                            int var167 = field788[var5] + 32768;
                            int var168 = field788[var5 + 1];
                            int[] var169 = field788;
                            int var170 = var5++;
                            class16 var171 = (class16) class16.field218.method3462((long) var167);
                            int var172;
                            if (var171 == null) {
                                var172 = 0;
                            } else if (var168 >= 0 && var168 < var171.field214.length) {
                                var172 = var171.field214[var168];
                            } else {
                                var172 = 0;
                            }
                            var169[var170] = var172;
                            continue;
                        }
                        if (var490 == 3315) {
                            var5 -= 2;
                            int var173 = field788[var5] + 32768;
                            int var174 = field788[var5 + 1];
                            field788[var5++] = class16.method681(var173, var174);
                            continue;
                        }
                        if (var490 == 3316) {
                            if (client.field446 >= 2) {
                                field788[var5++] = client.field446;
                            } else {
                                field788[var5++] = 0;
                            }
                            continue;
                        }
                        if (var490 == 3317) {
                            field788[var5++] = client.field297;
                            continue;
                        }
                        if (var490 == 3318) {
                            field788[var5++] = client.field524;
                            continue;
                        }
                        if (var490 == 3321) {
                            field788[var5++] = client.field460;
                            continue;
                        }
                        if (var490 == 3322) {
                            field788[var5++] = client.field445;
                            continue;
                        }
                        if (var490 == 3323) {
                            if (client.field513) {
                                field788[var5++] = 1;
                            } else {
                                field788[var5++] = 0;
                            }
                            continue;
                        }
                        if (var490 == 3324) {
                            field788[var5++] = client.field480;
                            continue;
                        }
                    } else if (var490 < 3500) {
                        if (var490 == 3400) {
                            var5 -= 2;
                            int var175 = field788[var5];
                            int var176 = field788[var5 + 1];
                            class49 var177 = class49.method910(var175);
                            if (var177.field1077 != 's') {
                            }
                            for (int var178 = 0; var178 < var177.field1075; var178++) {
                                if (var177.field1072[var178] == var176) {
                                    field789[var6++] = var177.field1078[var178];
                                    var177 = null;
                                    break;
                                }
                            }
                            if (var177 != null) {
                                field789[var6++] = var177.field1073;
                            }
                            continue;
                        }
                        if (var490 == 3408) {
                            var5 -= 4;
                            int var179 = field788[var5];
                            int var180 = field788[var5 + 1];
                            int var181 = field788[var5 + 2];
                            int var182 = field788[var5 + 3];
                            class49 var183 = class49.method910(var181);
                            if (var183.field1071 == var179 && var183.field1077 == var180) {
                                for (int var184 = 0; var184 < var183.field1075; var184++) {
                                    if (var183.field1072[var184] == var182) {
                                        if (var180 == 115) {
                                            field789[var6++] = var183.field1078[var184];
                                        } else {
                                            field788[var5++] = var183.field1069[var184];
                                        }
                                        var183 = null;
                                        break;
                                    }
                                }
                                if (var183 != null) {
                                    if (var180 == 115) {
                                        field789[var6++] = var183.field1073;
                                    } else {
                                        field788[var5++] = var183.field1074;
                                    }
                                }
                                continue;
                            }
                            if (var180 == 115) {
                                field789[var6++] = "null";
                            } else {
                                field788[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var490 < 3700) {
                        if (var490 == 3600) {
                            if (client.field548 == 0) {
                                field788[var5++] = -2;
                            } else if (client.field548 == 1) {
                                field788[var5++] = -1;
                            } else {
                                field788[var5++] = client.field547;
                            }
                            continue;
                        }
                        if (var490 == 3601) {
                            var5--;
                            int var185 = field788[var5];
                            if (client.field548 == 2 && var185 < client.field547) {
                                field789[var6++] = client.field549[var185].field253;
                                field789[var6++] = client.field549[var185].field243;
                                continue;
                            }
                            field789[var6++] = "";
                            field789[var6++] = "";
                            continue;
                        }
                        if (var490 == 3602) {
                            var5--;
                            int var186 = field788[var5];
                            if (client.field548 == 2 && var186 < client.field547) {
                                field788[var5++] = client.field549[var186].field247;
                                continue;
                            }
                            field788[var5++] = 0;
                            continue;
                        }
                        if (var490 == 3603) {
                            var5--;
                            int var187 = field788[var5];
                            if (client.field548 == 2 && var187 < client.field547) {
                                field788[var5++] = client.field549[var187].field245;
                                continue;
                            }
                            field788[var5++] = 0;
                            continue;
                        }
                        if (var490 == 3604) {
                            var6--;
                            String var188 = field789[var6];
                            var5--;
                            int var189 = field788[var5];
                            client.field321.method2547(88);
                            client.field321.method2285(class119.method2618(var188) + 1);
                            client.field321.method2393(var188);
                            client.field321.method2454(var189);
                            continue;
                        }
                        if (var490 == 3605) {
                            var6--;
                            String var190 = field789[var6];
                            client.method560(var190);
                            continue;
                        }
                        if (var490 == 3606) {
                            var6--;
                            String var191 = field789[var6];
                            client.method99(var191);
                            continue;
                        }
                        if (var490 == 3607) {
                            var6--;
                            String var192 = field789[var6];
                            if (var192 == null) {
                                continue;
                            }
                            if ((client.field322 < 100 || client.field404 == 1) && client.field322 < 400) {
                                String var193 = class164.method535(var192, Statics.field2027);
                                if (var193 == null) {
                                    continue;
                                }
                                for (int var194 = 0; var194 < client.field322; var194++) {
                                    class8 var195 = client.field476[var194];
                                    String var196 = class164.method535(var195.field137, Statics.field2027);
                                    if (var196 != null && var196.equals(var193)) {
                                        class12.method2763(31, "", var192 + class157.field2475);
                                        continue label3058;
                                    }
                                    if (var195.field133 != null) {
                                        String var197 = class164.method535(var195.field133, Statics.field2027);
                                        if (var197 != null && var197.equals(var193)) {
                                            class12.method2763(31, "", var192 + class157.field2475);
                                            continue label3058;
                                        }
                                    }
                                }
                                for (int var198 = 0; var198 < client.field547; var198++) {
                                    class18 var199 = client.field549[var198];
                                    String var200 = class164.method535(var199.field253, Statics.field2027);
                                    if (var200 != null && var200.equals(var193)) {
                                        class12.method2763(31, "", class157.field2329 + var192 + class157.field2307);
                                        continue label3058;
                                    }
                                    if (var199.field243 != null) {
                                        String var201 = class164.method535(var199.field243, Statics.field2027);
                                        if (var201 != null && var201.equals(var193)) {
                                            class12.method2763(31, "", class157.field2329 + var192 + class157.field2307);
                                            continue label3058;
                                        }
                                    }
                                }
                                if (class164.method535(Statics.field859.field37, Statics.field2027).equals(var193)) {
                                    class12.method2763(31, "", class157.field2478);
                                } else {
                                    client.field321.method2547(185);
                                    client.field321.method2285(class119.method2618(var192));
                                    client.field321.method2393(var192);
                                }
                                continue;
                            }
                            class12.method2763(31, "", class157.field2474);
                            continue;
                        }
                        if (var490 == 3608) {
                            var6--;
                            String var202 = field789[var6];
                            if (var202 == null) {
                                continue;
                            }
                            String var203 = class164.method535(var202, Statics.field2027);
                            if (var203 == null) {
                                continue;
                            }
                            int var204 = 0;
                            while (true) {
                                if (var204 >= client.field322) {
                                    continue label3058;
                                }
                                class8 var205 = client.field476[var204];
                                String var206 = var205.field137;
                                String var207 = class164.method535(var206, Statics.field2027);
                                boolean var208;
                                if (var202 == null || var206 == null) {
                                    var208 = false;
                                } else if (var202.startsWith("#") || var206.startsWith("#")) {
                                    var208 = var202.equals(var206);
                                } else {
                                    var208 = var203.equals(var207);
                                }
                                if (var208) {
                                    client.field322--;
                                    for (int var209 = var204; var209 < client.field322; var209++) {
                                        client.field476[var209] = client.field476[var209 + 1];
                                    }
                                    client.field490 = client.field516;
                                    client.field321.method2547(112);
                                    client.field321.method2285(class119.method2618(var202));
                                    client.field321.method2393(var202);
                                    continue label3058;
                                }
                                var204++;
                            }
                        }
                        if (var490 == 3609) {
                            var6--;
                            String var210 = field789[var6];
                            class152[] var211 = new class152[] { class152.field2263, class152.field2261, class152.field2260, class152.field2259, class152.field2258 };
                            class152[] var212 = var211;
                            for (int var213 = 0; var213 < var212.length; var213++) {
                                class152 var214 = var212[var213];
                                if (var214.field2264 != -1) {
                                    int var216 = var214.field2264;
                                    String var217 = "<img=" + var216 + ">";
                                    if (var210.startsWith(var217)) {
                                        var210 = var210.substring(6 + Integer.toString(var214.field2264).length());
                                        break;
                                    }
                                }
                            }
                            field788[var5++] = client.method1469(var210, false) ? 1 : 0;
                            continue;
                        }
                        if (var490 == 3611) {
                            if (client.field506 == null) {
                                field789[var6++] = "";
                            } else {
                                field789[var6++] = class162.method2654(client.field506);
                            }
                            continue;
                        }
                        if (var490 == 3612) {
                            if (client.field506 == null) {
                                field788[var5++] = 0;
                            } else {
                                field788[var5++] = Statics.field2250;
                            }
                            continue;
                        }
                        if (var490 == 3613) {
                            var5--;
                            int var218 = field788[var5];
                            if (client.field506 != null && var218 < Statics.field2250) {
                                field789[var6++] = Statics.field76[var218].field619;
                                continue;
                            }
                            field789[var6++] = "";
                            continue;
                        }
                        if (var490 == 3614) {
                            var5--;
                            int var219 = field788[var5];
                            if (client.field506 != null && var219 < Statics.field2250) {
                                field788[var5++] = Statics.field76[var219].field617;
                                continue;
                            }
                            field788[var5++] = 0;
                            continue;
                        }
                        if (var490 == 3615) {
                            var5--;
                            int var220 = field788[var5];
                            if (client.field506 != null && var220 < Statics.field2250) {
                                field788[var5++] = Statics.field76[var220].field612;
                                continue;
                            }
                            field788[var5++] = 0;
                            continue;
                        }
                        if (var490 == 3616) {
                            field788[var5++] = Statics.field2049;
                            continue;
                        }
                        if (var490 == 3617) {
                            var6--;
                            String var221 = field789[var6];
                            client.method895(var221);
                            continue;
                        }
                        if (var490 == 3618) {
                            field788[var5++] = Statics.field762;
                            continue;
                        }
                        if (var490 == 3619) {
                            var6--;
                            String var222 = field789[var6];
                            client.method2617(var222);
                            continue;
                        }
                        if (var490 == 3620) {
                            client.method183();
                            continue;
                        }
                        if (var490 == 3621) {
                            if (client.field548 == 0) {
                                field788[var5++] = -1;
                            } else {
                                field788[var5++] = client.field322;
                            }
                            continue;
                        }
                        if (var490 == 3622) {
                            var5--;
                            int var223 = field788[var5];
                            if (client.field548 != 0 && var223 < client.field322) {
                                field789[var6++] = client.field476[var223].field137;
                                field789[var6++] = client.field476[var223].field133;
                                continue;
                            }
                            field789[var6++] = "";
                            field789[var6++] = "";
                            continue;
                        }
                        if (var490 == 3623) {
                            String var224;
                            label2742: {
                                var6--;
                                var224 = field789[var6];
                                String var226 = "<img=0>";
                                if (!var224.startsWith(var226)) {
                                    String var228 = "<img=1>";
                                    if (!var224.startsWith(var228)) {
                                        break label2742;
                                    }
                                }
                                var224 = var224.substring(7);
                            }
                            field788[var5++] = client.method2936(var224) ? 1 : 0;
                            continue;
                        }
                        if (var490 == 3624) {
                            var5--;
                            int var229 = field788[var5];
                            if (Statics.field76 != null && var229 < Statics.field2250 && Statics.field76[var229].field619.equalsIgnoreCase(Statics.field859.field37)) {
                                field788[var5++] = 1;
                                continue;
                            }
                            field788[var5++] = 0;
                            continue;
                        }
                        if (var490 == 3625) {
                            if (client.field507 == null) {
                                field789[var6++] = "";
                            } else {
                                field789[var6++] = class162.method2654(client.field507);
                            }
                            continue;
                        }
                    } else if (var490 < 4000) {
                        if (var490 == 3903) {
                            var5--;
                            int var230 = field788[var5];
                            field788[var5++] = client.field396[var230].method3650();
                            continue;
                        }
                        if (var490 == 3904) {
                            var5--;
                            int var231 = field788[var5];
                            field788[var5++] = client.field396[var231].field3152;
                            continue;
                        }
                        if (var490 == 3905) {
                            var5--;
                            int var232 = field788[var5];
                            field788[var5++] = client.field396[var232].field3154;
                            continue;
                        }
                        if (var490 == 3906) {
                            var5--;
                            int var233 = field788[var5];
                            field788[var5++] = client.field396[var233].field3155;
                            continue;
                        }
                        if (var490 == 3907) {
                            var5--;
                            int var234 = field788[var5];
                            field788[var5++] = client.field396[var234].field3156;
                            continue;
                        }
                        if (var490 == 3908) {
                            var5--;
                            int var235 = field788[var5];
                            field788[var5++] = client.field396[var235].field3157;
                            continue;
                        }
                        if (var490 == 3910) {
                            var5--;
                            int var236 = field788[var5];
                            int var237 = client.field396[var236].method3649();
                            field788[var5++] = var237 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var490 == 3911) {
                            var5--;
                            int var238 = field788[var5];
                            int var239 = client.field396[var238].method3649();
                            field788[var5++] = var239 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var490 == 3912) {
                            var5--;
                            int var240 = field788[var5];
                            int var241 = client.field396[var240].method3649();
                            field788[var5++] = var241 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var490 == 3913) {
                            var5--;
                            int var242 = field788[var5];
                            int var243 = client.field396[var242].method3649();
                            field788[var5++] = var243 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var490 == 3914) {
                            var5--;
                            boolean var244 = field788[var5] == 1;
                            if (Statics.field233 != null) {
                                Statics.field233.method3665(class221.field3163, var244);
                            }
                            continue;
                        }
                        if (var490 == 3915) {
                            var5--;
                            boolean var245 = field788[var5] == 1;
                            if (Statics.field233 != null) {
                                Statics.field233.method3665(class221.field3160, var245);
                            }
                            continue;
                        }
                        if (var490 == 3916) {
                            var5 -= 2;
                            boolean var246 = field788[var5] == 1;
                            boolean var247 = field788[var5 + 1] == 1;
                            if (Statics.field233 != null) {
                                Statics.field233.method3665(new class22(var247), var246);
                            }
                            continue;
                        }
                        if (var490 == 3917) {
                            var5--;
                            boolean var248 = field788[var5] == 1;
                            if (Statics.field233 != null) {
                                Statics.field233.method3665(class221.field3162, var248);
                            }
                            continue;
                        }
                        if (var490 == 3918) {
                            var5--;
                            boolean var249 = field788[var5] == 1;
                            if (Statics.field233 != null) {
                                Statics.field233.method3665(class221.field3164, var249);
                            }
                            continue;
                        }
                        if (var490 == 3919) {
                            field788[var5++] = Statics.field233 == null ? 0 : Statics.field233.field3161.size();
                            continue;
                        }
                        if (var490 == 3920) {
                            var5--;
                            int var250 = field788[var5];
                            class214 var251 = (class214) Statics.field233.field3161.get(var250);
                            field788[var5++] = var251.field3137;
                            continue;
                        }
                        if (var490 == 3921) {
                            var5--;
                            int var252 = field788[var5];
                            class214 var253 = (class214) Statics.field233.field3161.get(var252);
                            field789[var6++] = var253.method3609();
                            continue;
                        }
                        if (var490 == 3922) {
                            var5--;
                            int var254 = field788[var5];
                            class214 var255 = (class214) Statics.field233.field3161.get(var254);
                            field789[var6++] = var255.method3608();
                            continue;
                        }
                        if (var490 == 3923) {
                            var5--;
                            int var256 = field788[var5];
                            class214 var257 = (class214) Statics.field233.field3161.get(var256);
                            long var258 = class115.method82() - Statics.field385 - var257.field3136;
                            int var260 = (int) (var258 / 3600000L);
                            int var261 = (int) ((var258 - (long) (var260 * 3600000)) / 60000L);
                            int var262 = (int) ((var258 - (long) (var260 * 3600000) - (long) (var261 * 60000)) / 1000L);
                            String var263 = var260 + ":" + var261 / 10 + var261 % 10 + ":" + var262 / 10 + var262 % 10;
                            field789[var6++] = var263;
                            continue;
                        }
                        if (var490 == 3924) {
                            var5--;
                            int var264 = field788[var5];
                            class214 var265 = (class214) Statics.field233.field3161.get(var264);
                            field788[var5++] = var265.field3135.field3155;
                            continue;
                        }
                        if (var490 == 3925) {
                            var5--;
                            int var266 = field788[var5];
                            class214 var267 = (class214) Statics.field233.field3161.get(var266);
                            field788[var5++] = var267.field3135.field3154;
                            continue;
                        }
                        if (var490 == 3926) {
                            var5--;
                            int var268 = field788[var5];
                            class214 var269 = (class214) Statics.field233.field3161.get(var268);
                            field788[var5++] = var269.field3135.field3152;
                            continue;
                        }
                    } else if (var490 < 4100) {
                        if (var490 == 4000) {
                            var5 -= 2;
                            int var270 = field788[var5];
                            int var271 = field788[var5 + 1];
                            field788[var5++] = var270 + var271;
                            continue;
                        }
                        if (var490 == 4001) {
                            var5 -= 2;
                            int var272 = field788[var5];
                            int var273 = field788[var5 + 1];
                            field788[var5++] = var272 - var273;
                            continue;
                        }
                        if (var490 == 4002) {
                            var5 -= 2;
                            int var274 = field788[var5];
                            int var275 = field788[var5 + 1];
                            field788[var5++] = var274 * var275;
                            continue;
                        }
                        if (var490 == 4003) {
                            var5 -= 2;
                            int var276 = field788[var5];
                            int var277 = field788[var5 + 1];
                            field788[var5++] = var276 / var277;
                            continue;
                        }
                        if (var490 == 4004) {
                            var5--;
                            int var278 = field788[var5];
                            field788[var5++] = (int) (Math.random() * (double) var278);
                            continue;
                        }
                        if (var490 == 4005) {
                            var5--;
                            int var279 = field788[var5];
                            field788[var5++] = (int) (Math.random() * (double) (var279 + 1));
                            continue;
                        }
                        if (var490 == 4006) {
                            var5 -= 5;
                            int var280 = field788[var5];
                            int var281 = field788[var5 + 1];
                            int var282 = field788[var5 + 2];
                            int var283 = field788[var5 + 3];
                            int var284 = field788[var5 + 4];
                            field788[var5++] = (var281 - var280) * (var284 - var282) / (var283 - var282) + var280;
                            continue;
                        }
                        if (var490 == 4007) {
                            var5 -= 2;
                            int var285 = field788[var5];
                            int var286 = field788[var5 + 1];
                            field788[var5++] = var285 * var286 / 100 + var285;
                            continue;
                        }
                        if (var490 == 4008) {
                            var5 -= 2;
                            int var287 = field788[var5];
                            int var288 = field788[var5 + 1];
                            field788[var5++] = var287 | 0x1 << var288;
                            continue;
                        }
                        if (var490 == 4009) {
                            var5 -= 2;
                            int var289 = field788[var5];
                            int var290 = field788[var5 + 1];
                            field788[var5++] = var289 & -1 - (0x1 << var290);
                            continue;
                        }
                        if (var490 == 4010) {
                            var5 -= 2;
                            int var291 = field788[var5];
                            int var292 = field788[var5 + 1];
                            field788[var5++] = (var291 & 0x1 << var292) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var490 == 4011) {
                            var5 -= 2;
                            int var293 = field788[var5];
                            int var294 = field788[var5 + 1];
                            field788[var5++] = var293 % var294;
                            continue;
                        }
                        if (var490 == 4012) {
                            var5 -= 2;
                            int var295 = field788[var5];
                            int var296 = field788[var5 + 1];
                            if (var295 == 0) {
                                field788[var5++] = 0;
                            } else {
                                field788[var5++] = (int) Math.pow((double) var295, (double) var296);
                            }
                            continue;
                        }
                        if (var490 == 4013) {
                            var5 -= 2;
                            int var297 = field788[var5];
                            int var298 = field788[var5 + 1];
                            if (var297 == 0) {
                                field788[var5++] = 0;
                            } else if (var298 == 0) {
                                field788[var5++] = Integer.MAX_VALUE;
                            } else {
                                field788[var5++] = (int) Math.pow((double) var297, 1.0D / (double) var298);
                            }
                            continue;
                        }
                        if (var490 == 4014) {
                            var5 -= 2;
                            int var299 = field788[var5];
                            int var300 = field788[var5 + 1];
                            field788[var5++] = var299 & var300;
                            continue;
                        }
                        if (var490 == 4015) {
                            var5 -= 2;
                            int var301 = field788[var5];
                            int var302 = field788[var5 + 1];
                            field788[var5++] = var301 | var302;
                            continue;
                        }
                    } else if (var490 < 4200) {
                        if (var490 == 4100) {
                            var6--;
                            String var303 = field789[var6];
                            var5--;
                            int var304 = field788[var5];
                            field789[var6++] = var303 + var304;
                            continue;
                        }
                        if (var490 == 4101) {
                            var6 -= 2;
                            String var305 = field789[var6];
                            String var306 = field789[var6 + 1];
                            field789[var6++] = var305 + var306;
                            continue;
                        }
                        if (var490 == 4102) {
                            var6--;
                            String var307 = field789[var6];
                            var5--;
                            int var308 = field788[var5];
                            String[] var309 = field789;
                            int var310 = var6++;
                            String var312;
                            if (var308 < 0) {
                                var312 = Integer.toString(var308);
                            } else {
                                int var313 = var308;
                                String var314;
                                if (var308 < 0) {
                                    var314 = Integer.toString(var308, 10);
                                } else {
                                    int var315 = 2;
                                    int var316 = var308 / 10;
                                    while (var316 != 0) {
                                        var316 /= 10;
                                        var315++;
                                    }
                                    char[] var317 = new char[var315];
                                    var317[0] = '+';
                                    for (int var318 = var315 - 1; var318 > 0; var318--) {
                                        int var319 = var313;
                                        var313 /= 10;
                                        int var320 = var319 - var313 * 10;
                                        if (var320 >= 10) {
                                            var317[var318] = (char) (var320 + 87);
                                        } else {
                                            var317[var318] = (char) (var320 + 48);
                                        }
                                    }
                                    var314 = new String(var317);
                                }
                                var312 = var314;
                            }
                            var309[var310] = var307 + var312;
                            continue;
                        }
                        if (var490 == 4103) {
                            var6--;
                            String var321 = field789[var6];
                            field789[var6++] = var321.toLowerCase();
                            continue;
                        }
                        if (var490 == 4104) {
                            var5--;
                            int var322 = field788[var5];
                            long var323 = ((long) var322 + 11745L) * 86400000L;
                            field797.setTime(new Date(var323));
                            int var325 = field797.get(5);
                            int var326 = field797.get(2);
                            int var327 = field797.get(1);
                            field789[var6++] = var325 + "-" + field794[var326] + "-" + var327;
                            continue;
                        }
                        if (var490 == 4105) {
                            var6 -= 2;
                            String var328 = field789[var6];
                            String var329 = field789[var6 + 1];
                            if (Statics.field859.field53 != null && Statics.field859.field53.field2904) {
                                field789[var6++] = var329;
                                continue;
                            }
                            field789[var6++] = var328;
                            continue;
                        }
                        if (var490 == 4106) {
                            var5--;
                            int var330 = field788[var5];
                            field789[var6++] = Integer.toString(var330);
                            continue;
                        }
                        if (var490 == 4107) {
                            var6 -= 2;
                            int[] var331 = field788;
                            int var332 = var5++;
                            String var333 = field789[var6];
                            String var334 = field789[var6 + 1];
                            int var335 = client.field456;
                            int var336 = var333.length();
                            int var337 = var334.length();
                            int var338 = 0;
                            int var339 = 0;
                            byte var340 = 0;
                            byte var341 = 0;
                            int var342;
                            label2826: while (true) {
                                if (var338 - var340 >= var336 && var339 - var341 >= var337) {
                                    int var353 = Math.min(var336, var337);
                                    for (int var354 = 0; var354 < var353; var354++) {
                                        char var357 = var333.charAt(var354);
                                        char var358 = var334.charAt(var354);
                                        if (var357 != var358 && Character.toUpperCase(var357) != Character.toUpperCase(var358)) {
                                            char var359 = Character.toLowerCase(var357);
                                            char var360 = Character.toLowerCase(var358);
                                            if (var359 != var360) {
                                                var342 = class166.method133(var359, var335) - class166.method133(var360, var335);
                                                break label2826;
                                            }
                                        }
                                    }
                                    int var361 = var336 - var337;
                                    if (var361 == 0) {
                                        for (int var362 = 0; var362 < var353; var362++) {
                                            char var363 = var333.charAt(var362);
                                            char var364 = var334.charAt(var362);
                                            if (var363 != var364) {
                                                var342 = class166.method133(var363, var335) - class166.method133(var364, var335);
                                                break label2826;
                                            }
                                        }
                                        var342 = 0;
                                    } else {
                                        var342 = var361;
                                    }
                                    break;
                                }
                                if (var338 - var340 >= var336) {
                                    var342 = -1;
                                    break;
                                }
                                if (var339 - var341 >= var337) {
                                    var342 = 1;
                                    break;
                                }
                                char var343;
                                if (var340 == 0) {
                                    var343 = var333.charAt(var338++);
                                } else {
                                    var343 = (char) var340;
                                    boolean var344 = false;
                                }
                                char var345;
                                if (var341 == 0) {
                                    var345 = var334.charAt(var339++);
                                } else {
                                    var345 = (char) var341;
                                    boolean var346 = false;
                                }
                                byte var347;
                                if (var343 == 198) {
                                    var347 = 69;
                                } else if (var343 == 230) {
                                    var347 = 101;
                                } else if (var343 == 223) {
                                    var347 = 115;
                                } else if (var343 == 338) {
                                    var347 = 69;
                                } else if (var343 == 339) {
                                    var347 = 101;
                                } else {
                                    var347 = 0;
                                }
                                var340 = var347;
                                byte var348;
                                if (var345 == 198) {
                                    var348 = 69;
                                } else if (var345 == 230) {
                                    var348 = 101;
                                } else if (var345 == 223) {
                                    var348 = 115;
                                } else if (var345 == 338) {
                                    var348 = 69;
                                } else if (var345 == 339) {
                                    var348 = 101;
                                } else {
                                    var348 = 0;
                                }
                                var341 = var348;
                                char var349 = class166.method2548(var343, var335);
                                char var350 = class166.method2548(var345, var335);
                                if (var349 != var350 && Character.toUpperCase(var349) != Character.toUpperCase(var350)) {
                                    char var351 = Character.toLowerCase(var349);
                                    char var352 = Character.toLowerCase(var350);
                                    if (var351 != var352) {
                                        var342 = class166.method133(var351, var335) - class166.method133(var352, var335);
                                        break;
                                    }
                                }
                            }
                            var331[var332] = class163.method2088(var342);
                            continue;
                        }
                        if (var490 == 4108) {
                            var6--;
                            String var365 = field789[var6];
                            var5 -= 2;
                            int var366 = field788[var5];
                            int var367 = field788[var5 + 1];
                            byte[] var368 = Statics.field621.method2986(var367, 0);
                            class224 var369 = new class224(var368);
                            field788[var5++] = var369.method3743(var365, var366);
                            continue;
                        }
                        if (var490 == 4109) {
                            var6--;
                            String var370 = field789[var6];
                            var5 -= 2;
                            int var371 = field788[var5];
                            int var372 = field788[var5 + 1];
                            byte[] var373 = Statics.field621.method2986(var372, 0);
                            class224 var374 = new class224(var373);
                            field788[var5++] = var374.method3735(var370, var371);
                            continue;
                        }
                        if (var490 == 4110) {
                            var6 -= 2;
                            String var375 = field789[var6];
                            String var376 = field789[var6 + 1];
                            var5--;
                            if (field788[var5] == 1) {
                                field789[var6++] = var375;
                            } else {
                                field789[var6++] = var376;
                            }
                            continue;
                        }
                        if (var490 == 4111) {
                            var6--;
                            String var377 = field789[var6];
                            field789[var6++] = class223.method3717(var377);
                            continue;
                        }
                        if (var490 == 4112) {
                            var6--;
                            String var378 = field789[var6];
                            var5--;
                            int var379 = field788[var5];
                            field789[var6++] = var378 + (char) var379;
                            continue;
                        }
                        if (var490 == 4113) {
                            var5--;
                            int var380 = field788[var5];
                            field788[var5++] = class163.method1996((char) var380) ? 1 : 0;
                            continue;
                        }
                        if (var490 == 4114) {
                            var5--;
                            int var381 = field788[var5];
                            int[] var382 = field788;
                            int var383 = var5++;
                            char var384 = (char) var381;
                            boolean var385 = var384 >= '0' && var384 <= '9' || var384 >= 'A' && var384 <= 'Z' || var384 >= 'a' && var384 <= 'z';
                            var382[var383] = var385 ? 1 : 0;
                            continue;
                        }
                        if (var490 == 4115) {
                            var5--;
                            int var386 = field788[var5];
                            field788[var5++] = class163.method556((char) var386) ? 1 : 0;
                            continue;
                        }
                        if (var490 == 4116) {
                            var5--;
                            int var387 = field788[var5];
                            field788[var5++] = class163.method2889((char) var387) ? 1 : 0;
                            continue;
                        }
                        if (var490 == 4117) {
                            var6--;
                            String var388 = field789[var6];
                            if (var388 == null) {
                                field788[var5++] = 0;
                            } else {
                                field788[var5++] = var388.length();
                            }
                            continue;
                        }
                        if (var490 == 4118) {
                            var6--;
                            String var389 = field789[var6];
                            var5 -= 2;
                            int var390 = field788[var5];
                            int var391 = field788[var5 + 1];
                            field789[var6++] = var389.substring(var390, var391);
                            continue;
                        }
                        if (var490 == 4119) {
                            var6--;
                            String var392 = field789[var6];
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
                            field789[var6++] = var393.toString();
                            continue;
                        }
                        if (var490 == 4120) {
                            var6--;
                            String var397 = field789[var6];
                            var5--;
                            int var398 = field788[var5];
                            field788[var5++] = var397.indexOf(var398);
                            continue;
                        }
                        if (var490 == 4121) {
                            var6 -= 2;
                            String var399 = field789[var6];
                            String var400 = field789[var6 + 1];
                            var5--;
                            int var401 = field788[var5];
                            field788[var5++] = var399.indexOf(var400, var401);
                            continue;
                        }
                    } else if (var490 < 4300) {
                        if (var490 == 4200) {
                            var5--;
                            int var402 = field788[var5];
                            field789[var6++] = class52.method10(var402).field1127;
                            continue;
                        }
                        if (var490 == 4201) {
                            var5 -= 2;
                            int var403 = field788[var5];
                            int var404 = field788[var5 + 1];
                            class52 var405 = class52.method10(var403);
                            if (var404 >= 1 && var404 <= 5 && var405.field1131[var404 - 1] != null) {
                                field789[var6++] = var405.field1131[var404 - 1];
                                continue;
                            }
                            field789[var6++] = "";
                            continue;
                        }
                        if (var490 == 4202) {
                            var5 -= 2;
                            int var406 = field788[var5];
                            int var407 = field788[var5 + 1];
                            class52 var408 = class52.method10(var406);
                            if (var407 >= 1 && var407 <= 5 && var408.field1126[var407 - 1] != null) {
                                field789[var6++] = var408.field1126[var407 - 1];
                                continue;
                            }
                            field789[var6++] = "";
                            continue;
                        }
                        if (var490 == 4203) {
                            var5--;
                            int var409 = field788[var5];
                            field788[var5++] = class52.method10(var409).field1123;
                            continue;
                        }
                        if (var490 == 4204) {
                            var5--;
                            int var410 = field788[var5];
                            field788[var5++] = class52.method10(var410).field1122 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var490 == 4205) {
                            var5--;
                            int var411 = field788[var5];
                            class52 var412 = class52.method10(var411);
                            if (var412.field1142 == -1 && var412.field1141 >= 0) {
                                field788[var5++] = var412.field1141;
                                continue;
                            }
                            field788[var5++] = var411;
                            continue;
                        }
                        if (var490 == 4206) {
                            var5--;
                            int var413 = field788[var5];
                            class52 var414 = class52.method10(var413);
                            if (var414.field1142 >= 0 && var414.field1141 >= 0) {
                                field788[var5++] = var414.field1141;
                                continue;
                            }
                            field788[var5++] = var413;
                            continue;
                        }
                        if (var490 == 4207) {
                            var5--;
                            int var415 = field788[var5];
                            field788[var5++] = class52.method10(var415).field1124 ? 1 : 0;
                            continue;
                        }
                        if (var490 == 4210) {
                            var6--;
                            String var416 = field789[var6];
                            var5--;
                            int var417 = field788[var5];
                            boolean var419 = var417 == 1;
                            String var420 = var416.toLowerCase();
                            short[] var421 = new short[16];
                            int var422 = 0;
                            int var423 = 0;
                            while (true) {
                                if (var423 >= Statics.field2697) {
                                    Statics.field3132 = var421;
                                    Statics.field2083 = 0;
                                    Statics.field274 = var422;
                                    String[] var427 = new String[Statics.field274];
                                    for (int var428 = 0; var428 < Statics.field274; var428++) {
                                        var427[var428] = class52.method10(var421[var428]).field1127;
                                    }
                                    short[] var429 = Statics.field3132;
                                    class124.method2927(var427, var429, 0, var427.length - 1);
                                    break;
                                }
                                class52 var424 = class52.method10(var423);
                                if ((!var419 || var424.field1125) && var424.field1142 == -1 && var424.field1127.toLowerCase().indexOf(var420) != -1) {
                                    if (var422 >= 250) {
                                        Statics.field274 = -1;
                                        Statics.field3132 = null;
                                        break;
                                    }
                                    if (var422 >= var421.length) {
                                        short[] var425 = new short[var421.length * 2];
                                        for (int var426 = 0; var426 < var422; var426++) {
                                            var425[var426] = var421[var426];
                                        }
                                        var421 = var425;
                                    }
                                    var421[var422++] = (short) var423;
                                }
                                var423++;
                            }
                            field788[var5++] = Statics.field274;
                            continue;
                        }
                        if (var490 == 4211) {
                            if (Statics.field3132 != null && Statics.field2083 < Statics.field274) {
                                field788[var5++] = Statics.field3132[++Statics.field2083 - 1] & 0xFFFF;
                                continue;
                            }
                            field788[var5++] = -1;
                            continue;
                        }
                        if (var490 == 4212) {
                            Statics.field2083 = 0;
                            continue;
                        }
                    } else if (var490 < 5100) {
                        if (var490 == 5000) {
                            field788[var5++] = client.field497;
                            continue;
                        }
                        if (var490 == 5001) {
                            var5 -= 3;
                            client.field497 = field788[var5];
                            Statics.field1052 = class130.method2624(field788[var5 + 1]);
                            if (Statics.field1052 == null) {
                                Statics.field1052 = class130.field2045;
                            }
                            client.field498 = field788[var5 + 2];
                            client.field321.method2547(164);
                            client.field321.method2285(client.field497);
                            client.field321.method2285(Statics.field1052.field2052);
                            client.field321.method2285(client.field498);
                            continue;
                        }
                        if (var490 == 5002) {
                            var6--;
                            String var430 = field789[var6];
                            var5 -= 2;
                            int var431 = field788[var5];
                            int var432 = field788[var5 + 1];
                            client.field321.method2547(157);
                            client.field321.method2285(class119.method2618(var430) + 2);
                            client.field321.method2393(var430);
                            client.field321.method2285(var431 - 1);
                            client.field321.method2285(var432);
                            continue;
                        }
                        if (var490 == 5003) {
                            var5 -= 2;
                            int var433 = field788[var5];
                            int var434 = field788[var5 + 1];
                            class36 var435 = class12.method2224(var433, var434);
                            if (var435 == null) {
                                field788[var5++] = -1;
                                field788[var5++] = 0;
                                field789[var6++] = "";
                                field789[var6++] = "";
                                field789[var6++] = "";
                            } else {
                                field788[var5++] = var435.field780;
                                field788[var5++] = var435.field774;
                                field789[var6++] = var435.field770 == null ? "" : var435.field770;
                                field789[var6++] = var435.field769 == null ? "" : var435.field769;
                                field789[var6++] = var435.field773 == null ? "" : var435.field773;
                            }
                            continue;
                        }
                        if (var490 == 5004) {
                            var5--;
                            int var436 = field788[var5];
                            class36 var437 = class12.method818(var436);
                            if (var437 == null) {
                                field788[var5++] = -1;
                                field788[var5++] = 0;
                                field789[var6++] = "";
                                field789[var6++] = "";
                                field789[var6++] = "";
                            } else {
                                field788[var5++] = var437.field771;
                                field788[var5++] = var437.field774;
                                field789[var6++] = var437.field770 == null ? "" : var437.field770;
                                field789[var6++] = var437.field769 == null ? "" : var437.field769;
                                field789[var6++] = var437.field773 == null ? "" : var437.field773;
                            }
                            continue;
                        }
                        if (var490 == 5005) {
                            if (Statics.field1052 == null) {
                                field788[var5++] = -1;
                            } else {
                                field788[var5++] = Statics.field1052.field2052;
                            }
                            continue;
                        }
                        if (var490 == 5008) {
                            var6--;
                            String var438 = field789[var6];
                            var5--;
                            int var439 = field788[var5];
                            String var440 = var438.toLowerCase();
                            byte var441 = 0;
                            if (var440.startsWith(class157.field2482)) {
                                var441 = 0;
                                var438 = var438.substring(class157.field2482.length());
                            } else if (var440.startsWith(class157.field2400)) {
                                var441 = 1;
                                var438 = var438.substring(class157.field2400.length());
                            } else if (var440.startsWith(class157.field2480)) {
                                var441 = 2;
                                var438 = var438.substring(class157.field2480.length());
                            } else if (var440.startsWith(class157.field2537)) {
                                var441 = 3;
                                var438 = var438.substring(class157.field2537.length());
                            } else if (var440.startsWith(class157.field2490)) {
                                var441 = 4;
                                var438 = var438.substring(class157.field2490.length());
                            } else if (var440.startsWith(class157.field2492)) {
                                var441 = 5;
                                var438 = var438.substring(class157.field2492.length());
                            } else if (var440.startsWith(class157.field2494)) {
                                var441 = 6;
                                var438 = var438.substring(class157.field2494.length());
                            } else if (var440.startsWith(class157.field2496)) {
                                var441 = 7;
                                var438 = var438.substring(class157.field2496.length());
                            } else if (var440.startsWith(class157.field2339)) {
                                var441 = 8;
                                var438 = var438.substring(class157.field2339.length());
                            } else if (var440.startsWith(class157.field2500)) {
                                var441 = 9;
                                var438 = var438.substring(class157.field2500.length());
                            } else if (var440.startsWith(class157.field2502)) {
                                var441 = 10;
                                var438 = var438.substring(class157.field2502.length());
                            } else if (var440.startsWith(class157.field2504)) {
                                var441 = 11;
                                var438 = var438.substring(class157.field2504.length());
                            } else if (client.field456 != 0) {
                                if (var440.startsWith(class157.field2483)) {
                                    var441 = 0;
                                    var438 = var438.substring(class157.field2483.length());
                                } else if (var440.startsWith(class157.field2479)) {
                                    var441 = 1;
                                    var438 = var438.substring(class157.field2479.length());
                                } else if (var440.startsWith(class157.field2424)) {
                                    var441 = 2;
                                    var438 = var438.substring(class157.field2424.length());
                                } else if (var440.startsWith(class157.field2489)) {
                                    var441 = 3;
                                    var438 = var438.substring(class157.field2489.length());
                                } else if (var440.startsWith(class157.field2491)) {
                                    var441 = 4;
                                    var438 = var438.substring(class157.field2491.length());
                                } else if (var440.startsWith(class157.field2493)) {
                                    var441 = 5;
                                    var438 = var438.substring(class157.field2493.length());
                                } else if (var440.startsWith(class157.field2568)) {
                                    var441 = 6;
                                    var438 = var438.substring(class157.field2568.length());
                                } else if (var440.startsWith(class157.field2533)) {
                                    var441 = 7;
                                    var438 = var438.substring(class157.field2533.length());
                                } else if (var440.startsWith(class157.field2499)) {
                                    var441 = 8;
                                    var438 = var438.substring(class157.field2499.length());
                                } else if (var440.startsWith(class157.field2501)) {
                                    var441 = 9;
                                    var438 = var438.substring(class157.field2501.length());
                                } else if (var440.startsWith(class157.field2503)) {
                                    var441 = 10;
                                    var438 = var438.substring(class157.field2503.length());
                                } else if (var440.startsWith(class157.field2505)) {
                                    var441 = 11;
                                    var438 = var438.substring(class157.field2505.length());
                                }
                            }
                            String var442 = var438.toLowerCase();
                            byte var443 = 0;
                            if (var442.startsWith(class157.field2506)) {
                                var443 = 1;
                                var438 = var438.substring(class157.field2506.length());
                            } else if (var442.startsWith(class157.field2528)) {
                                var443 = 2;
                                var438 = var438.substring(class157.field2528.length());
                            } else if (var442.startsWith(class157.field2510)) {
                                var443 = 3;
                                var438 = var438.substring(class157.field2510.length());
                            } else if (var442.startsWith(class157.field2512)) {
                                var443 = 4;
                                var438 = var438.substring(class157.field2512.length());
                            } else if (var442.startsWith(class157.field2570)) {
                                var443 = 5;
                                var438 = var438.substring(class157.field2570.length());
                            } else if (client.field456 != 0) {
                                if (var442.startsWith(class157.field2507)) {
                                    var443 = 1;
                                    var438 = var438.substring(class157.field2507.length());
                                } else if (var442.startsWith(class157.field2509)) {
                                    var443 = 2;
                                    var438 = var438.substring(class157.field2509.length());
                                } else if (var442.startsWith(class157.field2511)) {
                                    var443 = 3;
                                    var438 = var438.substring(class157.field2511.length());
                                } else if (var442.startsWith(class157.field2513)) {
                                    var443 = 4;
                                    var438 = var438.substring(class157.field2513.length());
                                } else if (var442.startsWith(class157.field2515)) {
                                    var443 = 5;
                                    var438 = var438.substring(class157.field2515.length());
                                }
                            }
                            client.field321.method2547(104);
                            client.field321.method2285(0);
                            int var444 = client.field321.field1986;
                            client.field321.method2285(var439);
                            client.field321.method2285(var441);
                            client.field321.method2285(var443);
                            class122 var445 = client.field321;
                            int var446 = var445.field1986;
                            byte[] var447 = class165.method160(var438);
                            var445.method2292(var447.length);
                            var445.field1986 += Statics.field3169.method2234(var447, 0, var447.length, var445.field1987, var445.field1986);
                            client.field321.method2298(client.field321.field1986 - var444);
                            continue;
                        }
                        if (var490 == 5009) {
                            var6 -= 2;
                            String var448 = field789[var6];
                            String var449 = field789[var6 + 1];
                            client.field321.method2547(233);
                            client.field321.method2287(0);
                            int var450 = client.field321.field1986;
                            client.field321.method2393(var448);
                            class122 var451 = client.field321;
                            int var452 = var451.field1986;
                            byte[] var453 = class165.method160(var449);
                            var451.method2292(var453.length);
                            var451.field1986 += Statics.field3169.method2234(var453, 0, var453.length, var451.field1987, var451.field1986);
                            client.field321.method2453(client.field321.field1986 - var450);
                            continue;
                        }
                        if (var490 == 5015) {
                            String var454;
                            if (Statics.field859 == null || Statics.field859.field37 == null) {
                                var454 = "";
                            } else {
                                var454 = Statics.field859.field37;
                            }
                            field789[var6++] = var454;
                            continue;
                        }
                        if (var490 == 5016) {
                            field788[var5++] = client.field498;
                            continue;
                        }
                        if (var490 == 5017) {
                            var5--;
                            int var455 = field788[var5];
                            field788[var5++] = class12.method801(var455);
                            continue;
                        }
                        if (var490 == 5018) {
                            var5--;
                            int var456 = field788[var5];
                            int[] var457 = field788;
                            int var458 = var5++;
                            class36 var459 = (class36) class12.field162.method3486((long) var456);
                            int var460;
                            if (var459 == null) {
                                var460 = -1;
                            } else if (class12.field171.field3087 == var459.field3092) {
                                var460 = -1;
                            } else {
                                var460 = ((class36) var459.field3092).field780;
                            }
                            var457[var458] = var460;
                            continue;
                        }
                        if (var490 == 5019) {
                            var5--;
                            int var461 = field788[var5];
                            int[] var462 = field788;
                            int var463 = var5++;
                            class36 var464 = (class36) class12.field162.method3486((long) var461);
                            int var465;
                            if (var464 == null) {
                                var465 = -1;
                            } else if (class12.field171.field3087 == var464.field3091) {
                                var465 = -1;
                            } else {
                                var465 = ((class36) var464.field3091).field780;
                            }
                            var462[var463] = var465;
                            continue;
                        }
                        if (var490 == 5020) {
                            var6--;
                            String var466 = field789[var6];
                            if (var466.equalsIgnoreCase("toggleroof")) {
                                Statics.field2026.field138 = !Statics.field2026.field138;
                                class9.method3591();
                                if (Statics.field2026.field138) {
                                    class12.method2763(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method2763(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var466.equalsIgnoreCase("displayfps")) {
                                client.field344 = !client.field344;
                            }
                            if (client.field446 >= 2) {
                                if (var466.equalsIgnoreCase("fpson")) {
                                    client.field344 = true;
                                }
                                if (var466.equalsIgnoreCase("fpsoff")) {
                                    client.field344 = false;
                                }
                                if (var466.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var466.equalsIgnoreCase("clientdrop")) {
                                    client.method2897();
                                }
                                if (var466.equalsIgnoreCase("errortest") && client.field468 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field321.method2547(92);
                            client.field321.method2285(var466.length() + 1);
                            client.field321.method2393(var466);
                            continue;
                        }
                        if (var490 == 5021) {
                            var6--;
                            client.field499 = field789[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var490 == 5022) {
                            field789[var6++] = client.field499;
                            continue;
                        }
                    }
                }
                if (var490 < 5400) {
                    if (var490 == 5306) {
                        field788[var5++] = client.method612();
                        continue;
                    }
                    if (var490 == 5307) {
                        var5--;
                        int var467 = field788[var5];
                        if (var467 != 1 && var467 != 2) {
                            continue;
                        }
                        client.field492 = 0L;
                        if (var467 >= 2) {
                            client.field557 = true;
                        } else {
                            client.field557 = false;
                        }
                        Statics.method48();
                        if (client.field288 >= 25) {
                            client.method127();
                        }
                        class144.field2195 = true;
                        continue;
                    }
                    if (var490 == 5308) {
                        field788[var5++] = Statics.field2026.field142;
                        continue;
                    }
                    if (var490 == 5309) {
                        var5--;
                        int var468 = field788[var5];
                        if (var468 == 1 || var468 == 2) {
                            Statics.field2026.field142 = var468;
                            class9.method3591();
                        }
                        continue;
                    }
                }
                if (var490 < 5600) {
                    if (var490 == 5504) {
                        var5 -= 2;
                        int var469 = field788[var5];
                        int var470 = field788[var5 + 1];
                        if (!client.field528) {
                            client.field365 = var469;
                            client.field366 = var470;
                        }
                        continue;
                    }
                    if (var490 == 5505) {
                        field788[var5++] = client.field365;
                        continue;
                    }
                    if (var490 == 5506) {
                        field788[var5++] = client.field366;
                        continue;
                    }
                    if (var490 == 5530) {
                        var5--;
                        int var471 = field788[var5];
                        if (var471 < 0) {
                            var471 = 0;
                        }
                        client.field371 = var471;
                        continue;
                    }
                    if (var490 == 5531) {
                        field788[var5++] = client.field371;
                        continue;
                    }
                }
                if (var490 >= 5700 || var490 != 5630) {
                    if (var490 < 6300) {
                        if (var490 == 6200) {
                            var5 -= 2;
                            client.field407 = (short) field788[var5];
                            if (client.field407 <= 0) {
                                client.field407 = 256;
                            }
                            client.field535 = (short) field788[var5 + 1];
                            if (client.field535 <= 0) {
                                client.field535 = 205;
                            }
                            continue;
                        }
                        if (var490 == 6201) {
                            var5 -= 2;
                            client.field420 = (short) field788[var5];
                            if (client.field420 <= 0) {
                                client.field420 = 256;
                            }
                            client.field337 = (short) field788[var5 + 1];
                            if (client.field337 <= 0) {
                                client.field337 = 320;
                            }
                            continue;
                        }
                        if (var490 == 6202) {
                            var5 -= 4;
                            client.field538 = (short) field788[var5];
                            if (client.field538 <= 0) {
                                client.field538 = 1;
                            }
                            client.field539 = (short) field788[var5 + 1];
                            if (client.field539 <= 0) {
                                client.field539 = 32767;
                            } else if (client.field539 < client.field538) {
                                client.field539 = client.field538;
                            }
                            client.field540 = (short) field788[var5 + 2];
                            if (client.field540 <= 0) {
                                client.field540 = 1;
                            }
                            client.field348 = (short) field788[var5 + 3];
                            if (client.field348 <= 0) {
                                client.field348 = 32767;
                            } else if (client.field348 < client.field540) {
                                client.field348 = client.field540;
                            }
                            continue;
                        }
                        if (var490 == 6203) {
                            if (client.field451 == null) {
                                field788[var5++] = -1;
                                field788[var5++] = -1;
                            } else {
                                client.method945(0, 0, client.field451.field2759, client.field451.field2775, false);
                                field788[var5++] = client.field544;
                                field788[var5++] = client.field545;
                            }
                            continue;
                        }
                        if (var490 == 6204) {
                            field788[var5++] = client.field420;
                            field788[var5++] = client.field337;
                            continue;
                        }
                        if (var490 == 6205) {
                            field788[var5++] = client.field407;
                            field788[var5++] = client.field535;
                            continue;
                        }
                    }
                    if (var490 < 6600) {
                        if (var490 == 6500) {
                            field788[var5++] = class26.method2762() ? 1 : 0;
                            continue;
                        }
                        if (var490 == 6501) {
                            class26.field625 = 0;
                            class26 var472;
                            if (class26.field625 < class26.field627) {
                                var472 = Statics.field626[++class26.field625 - 1];
                            } else {
                                var472 = null;
                            }
                            if (var472 == null) {
                                field788[var5++] = -1;
                                field788[var5++] = 0;
                                field789[var6++] = "";
                                field788[var5++] = 0;
                                field788[var5++] = 0;
                                field789[var6++] = "";
                            } else {
                                field788[var5++] = var472.field632;
                                field788[var5++] = var472.field638;
                                field789[var6++] = var472.field636;
                                field788[var5++] = var472.field637;
                                field788[var5++] = var472.field628;
                                field789[var6++] = var472.field635;
                            }
                            continue;
                        }
                        if (var490 == 6502) {
                            class26 var475;
                            if (class26.field625 < class26.field627) {
                                var475 = Statics.field626[++class26.field625 - 1];
                            } else {
                                var475 = null;
                            }
                            if (var475 == null) {
                                field788[var5++] = -1;
                                field788[var5++] = 0;
                                field789[var6++] = "";
                                field788[var5++] = 0;
                                field788[var5++] = 0;
                                field789[var6++] = "";
                            } else {
                                field788[var5++] = var475.field632;
                                field788[var5++] = var475.field638;
                                field789[var6++] = var475.field636;
                                field788[var5++] = var475.field637;
                                field788[var5++] = var475.field628;
                                field789[var6++] = var475.field635;
                            }
                            continue;
                        }
                        if (var490 == 6506) {
                            var5--;
                            int var477 = field788[var5];
                            class26 var478 = null;
                            for (int var479 = 0; var479 < class26.field627; var479++) {
                                if (Statics.field626[var479].field632 == var477) {
                                    var478 = Statics.field626[var479];
                                    break;
                                }
                            }
                            if (var478 == null) {
                                field788[var5++] = -1;
                                field788[var5++] = 0;
                                field789[var6++] = "";
                                field788[var5++] = 0;
                                field788[var5++] = 0;
                                field789[var6++] = "";
                            } else {
                                field788[var5++] = var478.field632;
                                field788[var5++] = var478.field638;
                                field789[var6++] = var478.field636;
                                field788[var5++] = var478.field637;
                                field788[var5++] = var478.field628;
                                field789[var6++] = var478.field635;
                            }
                            continue;
                        }
                        if (var490 == 6507) {
                            var5 -= 4;
                            int var480 = field788[var5];
                            boolean var481 = field788[var5 + 1] == 1;
                            int var482 = field788[var5 + 2];
                            boolean var483 = field788[var5 + 3] == 1;
                            if (Statics.field626 != null) {
                                class26.method1443(0, Statics.field626.length - 1, var480, var481, var482, var483);
                            }
                            continue;
                        }
                        if (var490 == 6511) {
                            var5--;
                            int var484 = field788[var5];
                            if (var484 >= 0 && var484 < class26.field627) {
                                class26 var485 = Statics.field626[var484];
                                field788[var5++] = var485.field632;
                                field788[var5++] = var485.field638;
                                field789[var6++] = var485.field636;
                                field788[var5++] = var485.field637;
                                field788[var5++] = var485.field628;
                                field789[var6++] = var485.field635;
                                continue;
                            }
                            field788[var5++] = -1;
                            field788[var5++] = 0;
                            field789[var6++] = "";
                            field788[var5++] = 0;
                            field788[var5++] = 0;
                            field789[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field391 = 250;
            }
        } catch (Exception var489) {
            StringBuilder var487 = new StringBuilder(30);
            var487.append("").append(var4.field3102).append(" ");
            for (int var488 = field787 - 1; var488 >= 0; var488--) {
                var487.append("").append(field791[var488].field207.field3102).append(" ");
            }
            var487.append("").append(var10);
            class148.method623(var487.toString(), var489);
        }
    }

    @ObfuscatedName("t.k(IB)V")
    public static void method176(int arg0) {
        if (arg0 == -1 || !Statics.method2098(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2802[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2823 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field17 = var3.field2823;
                method2891(var4, 2000000);
            }
        }
    }
}
