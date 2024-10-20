package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("al")
public class class37 {

    @ObfuscatedName("al.g")
    public static int[] field799 = new int[5];

    @ObfuscatedName("al.m")
    public static int[][] field796 = new int[5][5000];

    @ObfuscatedName("al.b")
    public static int[] field798 = new int[1000];

    @ObfuscatedName("al.p")
    public static String[] field804 = new String[1000];

    @ObfuscatedName("al.t")
    public static int field801 = 0;

    @ObfuscatedName("al.w")
    public static class15[] field802 = new class15[50];

    @ObfuscatedName("al.z")
    public static Calendar field797 = Calendar.getInstance();

    @ObfuscatedName("al.v")
    public static final String[] field794 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("al.j")
    public static int field805 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fa.l(Ll;I)V")
    public static void method2961(class1 arg0) {
        method2963(arg0, 200000);
    }

    @ObfuscatedName("fl.e(Ll;II)V")
    public static void method2963(class1 arg0, int arg1) {
        Object[] var2 = arg0.field13;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method2983(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field603;
        int[] var9 = var4.field595;
        byte var10 = -1;
        field801 = 0;
        try {
            Statics.field800 = new int[var4.field597];
            int var11 = 0;
            Statics.field793 = new String[var4.field605];
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
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2742;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2817;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2742;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2817;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field800[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field793[var12++] = var15;
                }
            }
            int var16 = 0;
            field805 = arg0.field3;
            label3244: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var473 = var8[var7];
                if (var473 < 100) {
                    if (var473 == 0) {
                        field798[var5++] = var9[var7];
                        continue;
                    }
                    if (var473 == 1) {
                        int var17 = var9[var7];
                        field798[var5++] = class176.field2889[var17];
                        continue;
                    }
                    if (var473 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2889[var18] = field798[var5];
                        client.method2821(var18);
                        continue;
                    }
                    if (var473 == 3) {
                        field804[var6++] = var4.field596[var7];
                        continue;
                    }
                    if (var473 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var473 == 7) {
                        var5 -= 2;
                        if (field798[var5 + 1] != field798[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var473 == 8) {
                        var5 -= 2;
                        if (field798[var5 + 1] == field798[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var473 == 9) {
                        var5 -= 2;
                        if (field798[var5] < field798[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var473 == 10) {
                        var5 -= 2;
                        if (field798[var5] > field798[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var473 == 21) {
                        if (field801 == 0) {
                            return;
                        }
                        class15 var19 = field802[--field801];
                        var4 = var19.field219;
                        var8 = var4.field603;
                        var9 = var4.field595;
                        var7 = var19.field212;
                        Statics.field800 = var19.field223;
                        Statics.field793 = var19.field214;
                        continue;
                    }
                    if (var473 == 25) {
                        int var20 = var9[var7];
                        field798[var5++] = Statics.method1245(var20);
                        continue;
                    }
                    if (var473 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class176.method187(var21, field798[var5]);
                        continue;
                    }
                    if (var473 == 31) {
                        var5 -= 2;
                        if (field798[var5] <= field798[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var473 == 32) {
                        var5 -= 2;
                        if (field798[var5] >= field798[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var473 == 33) {
                        field798[var5++] = Statics.field800[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var473 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field800[var10001] = field798[var5];
                        continue;
                    }
                    if (var473 == 35) {
                        field804[var6++] = Statics.field793[var9[var7]];
                        continue;
                    }
                    if (var473 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field793[var10001] = field804[var6];
                        continue;
                    }
                    if (var473 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class163.method9(field804, var6, var22);
                        field804[var6++] = var23;
                        continue;
                    }
                    if (var473 == 38) {
                        var5--;
                        continue;
                    }
                    if (var473 == 39) {
                        var6--;
                        continue;
                    }
                    if (var473 == 40) {
                        int var24 = var9[var7];
                        class23 var25 = class23.method2983(var24);
                        int[] var26 = new int[var25.field597];
                        String[] var27 = new String[var25.field605];
                        for (int var28 = 0; var28 < var25.field594; var28++) {
                            var26[var28] = field798[var5 - var25.field594 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field599; var29++) {
                            var27[var29] = field804[var6 - var25.field599 + var29];
                        }
                        var5 -= var25.field594;
                        var6 -= var25.field599;
                        class15 var30 = new class15();
                        var30.field219 = var4;
                        var30.field212 = var7;
                        var30.field223 = Statics.field800;
                        var30.field214 = Statics.field793;
                        field802[++field801 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field603;
                        var9 = var25.field595;
                        var7 = -1;
                        Statics.field800 = var26;
                        Statics.field793 = var27;
                        continue;
                    }
                    if (var473 == 42) {
                        field798[var5++] = Statics.field284.method198(var9[var7]);
                        continue;
                    }
                    if (var473 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field284.method197(var10001, field798[var5]);
                        continue;
                    }
                    if (var473 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field798[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field799[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label3244;
                                }
                                field796[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var473 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field798[var5];
                        if (var37 >= 0 && var37 < field799[var36]) {
                            field798[var5++] = field796[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var473 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field798[var5];
                        if (var39 >= 0 && var39 < field799[var38]) {
                            field796[var38][var39] = field798[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var473 == 47) {
                        String var40 = Statics.field284.method200(var9[var7]);
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field804[var6++] = var40;
                        continue;
                    }
                    if (var473 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field284.method199(var10001, field804[var6]);
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var473 < 1000) {
                    if (var473 == 100) {
                        var5 -= 3;
                        int var42 = field798[var5];
                        int var43 = field798[var5 + 1];
                        int var44 = field798[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var45 = class173.method793(var42);
                        if (var45.field2864 == null) {
                            var45.field2864 = new class173[var44 + 1];
                        }
                        if (var45.field2864.length <= var44) {
                            class173[] var46 = new class173[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2864.length; var47++) {
                                var46[var47] = var45.field2864[var47];
                            }
                            var45.field2864 = var46;
                        }
                        if (var44 > 0 && var45.field2864[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class173 var48 = new class173();
                        var48.field2744 = var43;
                        var48.field2754 = var48.field2742 = var45.field2742;
                        var48.field2817 = var44;
                        var48.field2779 = true;
                        var45.field2864[var44] = var48;
                        if (var41) {
                            Statics.field681 = var48;
                        } else {
                            Statics.field700 = var48;
                        }
                        client.method13(var45);
                        continue;
                    }
                    if (var473 == 101) {
                        class173 var49 = var41 ? Statics.field681 : Statics.field700;
                        class173 var50 = class173.method793(var49.field2742);
                        var50.field2864[var49.field2817] = null;
                        client.method13(var50);
                        continue;
                    }
                    if (var473 == 102) {
                        var5--;
                        class173 var51 = class173.method793(field798[var5]);
                        var51.field2864 = null;
                        client.method13(var51);
                        continue;
                    }
                    if (var473 == 200) {
                        var5 -= 2;
                        int var52 = field798[var5];
                        int var53 = field798[var5 + 1];
                        class173 var54 = class173.method732(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field798[var5++] = 1;
                            if (var41) {
                                Statics.field681 = var54;
                            } else {
                                Statics.field700 = var54;
                            }
                            continue;
                        }
                        field798[var5++] = 0;
                        continue;
                    }
                    if (var473 == 201) {
                        var5--;
                        class173 var55 = class173.method793(field798[var5]);
                        if (var55 == null) {
                            field798[var5++] = 0;
                        } else {
                            field798[var5++] = 1;
                            if (var41) {
                                Statics.field681 = var55;
                            } else {
                                Statics.field700 = var55;
                            }
                        }
                        continue;
                    }
                } else if (!(var473 < 1000 || var473 >= 1100) || !(var473 < 2000 || var473 >= 2100)) {
                    int var56 = -1;
                    class173 var57;
                    if (var473 >= 2000) {
                        var473 -= 1000;
                        var5--;
                        var56 = field798[var5];
                        var57 = class173.method793(var56);
                    } else {
                        var57 = var41 ? Statics.field681 : Statics.field700;
                    }
                    if (var473 == 1000) {
                        var5 -= 4;
                        var57.field2751 = field798[var5];
                        var57.field2808 = field798[var5 + 1];
                        var57.field2747 = field798[var5 + 2];
                        var57.field2869 = field798[var5 + 3];
                        client.method13(var57);
                        client.method228(var57);
                        if (var56 != -1 && var57.field2744 == 0) {
                            client.method186(Statics.field2868[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var473 == 1001) {
                        var5 -= 4;
                        var57.field2753 = field798[var5];
                        var57.field2766 = field798[var5 + 1];
                        var57.field2736 = field798[var5 + 2];
                        var57.field2750 = field798[var5 + 3];
                        client.method13(var57);
                        client.method228(var57);
                        if (var56 != -1 && var57.field2744 == 0) {
                            client.method186(Statics.field2868[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var473 == 1003) {
                        var5--;
                        boolean var58 = field798[var5] == 1;
                        if (var57.field2762 != var58) {
                            var57.field2762 = var58;
                            client.method13(var57);
                        }
                        continue;
                    }
                    if (var473 == 1005) {
                        var5--;
                        var57.field2873 = field798[var5] == 1;
                        continue;
                    }
                    if (var473 == 1006) {
                        var5--;
                        var57.field2874 = field798[var5] == 1;
                        continue;
                    }
                } else if (var473 >= 1100 && var473 < 1200 || var473 >= 2100 && var473 < 2200) {
                    int var59 = -1;
                    class173 var60;
                    if (var473 >= 2000) {
                        var473 -= 1000;
                        var5--;
                        var59 = field798[var5];
                        var60 = class173.method793(var59);
                    } else {
                        var60 = var41 ? Statics.field681 : Statics.field700;
                    }
                    if (var473 == 1100) {
                        var5 -= 2;
                        var60.field2763 = field798[var5];
                        if (var60.field2763 > var60.field2752 - var60.field2831) {
                            var60.field2763 = var60.field2752 - var60.field2831;
                        }
                        if (var60.field2763 < 0) {
                            var60.field2763 = 0;
                        }
                        var60.field2764 = field798[var5 + 1];
                        if (var60.field2764 > var60.field2791 - var60.field2758) {
                            var60.field2764 = var60.field2791 - var60.field2758;
                        }
                        if (var60.field2764 < 0) {
                            var60.field2764 = 0;
                        }
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1101) {
                        var5--;
                        var60.field2815 = field798[var5];
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1102) {
                        var5--;
                        var60.field2767 = field798[var5] == 1;
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1103) {
                        var5--;
                        var60.field2771 = field798[var5];
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1104) {
                        var5--;
                        var60.field2859 = field798[var5];
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1105) {
                        var5--;
                        var60.field2775 = field798[var5];
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1106) {
                        var5--;
                        var60.field2777 = field798[var5];
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1107) {
                        var5--;
                        var60.field2778 = field798[var5] == 1;
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1108) {
                        var60.field2783 = 1;
                        var5--;
                        var60.field2786 = field798[var5];
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1109) {
                        var5 -= 6;
                        var60.field2830 = field798[var5];
                        var60.field2790 = field798[var5 + 1];
                        var60.field2769 = field798[var5 + 2];
                        var60.field2792 = field798[var5 + 3];
                        var60.field2793 = field798[var5 + 4];
                        var60.field2794 = field798[var5 + 5];
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1110) {
                        var5--;
                        int var61 = field798[var5];
                        if (var60.field2788 != var61) {
                            var60.field2788 = var61;
                            var60.field2862 = 0;
                            var60.field2863 = 0;
                            client.method13(var60);
                        }
                        continue;
                    }
                    if (var473 == 1111) {
                        var5--;
                        var60.field2797 = field798[var5] == 1;
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1112) {
                        var6--;
                        String var62 = field804[var6];
                        if (!var62.equals(var60.field2841)) {
                            var60.field2841 = var62;
                            client.method13(var60);
                        }
                        continue;
                    }
                    if (var473 == 1113) {
                        var5--;
                        var60.field2784 = field798[var5];
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1114) {
                        var5 -= 3;
                        var60.field2803 = field798[var5];
                        var60.field2804 = field798[var5 + 1];
                        var60.field2802 = field798[var5 + 2];
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1115) {
                        var5--;
                        var60.field2805 = field798[var5] == 1;
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1116) {
                        var5--;
                        var60.field2858 = field798[var5];
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1117) {
                        var5--;
                        var60.field2749 = field798[var5];
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1118) {
                        var5--;
                        var60.field2781 = field798[var5] == 1;
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1119) {
                        var5--;
                        var60.field2782 = field798[var5] == 1;
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1120) {
                        var5 -= 2;
                        var60.field2752 = field798[var5];
                        var60.field2791 = field798[var5 + 1];
                        client.method13(var60);
                        if (var59 != -1 && var60.field2744 == 0) {
                            client.method186(Statics.field2868[var59 >> 16], var60, false);
                        }
                        continue;
                    }
                    if (var473 == 1121) {
                        int var63 = var60.field2742;
                        int var64 = var60.field2817;
                        client.field338.method2622(63);
                        client.field338.method2431(var64);
                        client.field338.method2429(var63);
                        client.field405 = var60;
                        client.method13(var60);
                        continue;
                    }
                    if (var473 == 1122) {
                        var5--;
                        var60.field2806 = field798[var5];
                        client.method13(var60);
                        continue;
                    }
                } else if (!(var473 < 1200 || var473 >= 1300) || !(var473 < 2200 || var473 >= 2300)) {
                    class173 var65;
                    if (var473 >= 2000) {
                        var473 -= 1000;
                        var5--;
                        var65 = class173.method793(field798[var5]);
                    } else {
                        var65 = var41 ? Statics.field681 : Statics.field700;
                    }
                    client.method13(var65);
                    if (var473 == 1200 || var473 == 1205 || var473 == 1212) {
                        var5 -= 2;
                        int var66 = field798[var5];
                        int var67 = field798[var5 + 1];
                        var65.field2860 = var66;
                        var65.field2861 = var67;
                        class52 var68 = class52.method646(var66);
                        var65.field2769 = var68.field1106;
                        var65.field2792 = var68.field1134;
                        var65.field2793 = var68.field1108;
                        var65.field2830 = var68.field1131;
                        var65.field2790 = var68.field1110;
                        var65.field2794 = var68.field1105;
                        if (var473 == 1205) {
                            var65.field2798 = 0;
                        } else if (var473 == 1212 | var68.field1111 == 1) {
                            var65.field2798 = 1;
                        } else {
                            var65.field2798 = 2;
                        }
                        if (var65.field2795 > 0) {
                            var65.field2794 = var65.field2794 * 32 / var65.field2795;
                        } else if (var65.field2753 > 0) {
                            var65.field2794 = var65.field2794 * 32 / var65.field2753;
                        }
                        continue;
                    }
                    if (var473 == 1201) {
                        var65.field2783 = 2;
                        var5--;
                        var65.field2786 = field798[var5];
                        continue;
                    }
                    if (var473 == 1202) {
                        var65.field2783 = 3;
                        var65.field2786 = Statics.field143.field34.method3248();
                        continue;
                    }
                } else if ((var473 < 1300 || var473 >= 1400) && (var473 < 2300 || var473 >= 2400)) {
                    if (var473 >= 1400 && var473 < 1500 || var473 >= 2400 && var473 < 2500) {
                        class173 var73;
                        if (var473 >= 2000) {
                            var473 -= 1000;
                            var5--;
                            var73 = class173.method793(field798[var5]);
                        } else {
                            var73 = var41 ? Statics.field681 : Statics.field700;
                        }
                        var6--;
                        String var74 = field804[var6];
                        int[] var75 = null;
                        if (var74.length() > 0 && var74.charAt(var74.length() - 1) == 'Y') {
                            var5--;
                            int var76 = field798[var5];
                            if (var76 > 0) {
                                var75 = new int[var76];
                                while (var76-- > 0) {
                                    var5--;
                                    var75[var76] = field798[var5];
                                }
                            }
                            var74 = var74.substring(0, var74.length() - 1);
                        }
                        Object[] var77 = new Object[var74.length() + 1];
                        for (int var78 = var77.length - 1; var78 >= 1; var78--) {
                            if (var74.charAt(var78 - 1) == 's') {
                                var6--;
                                var77[var78] = field804[var6];
                            } else {
                                var5--;
                                var77[var78] = Integer.valueOf(field798[var5]);
                            }
                        }
                        var5--;
                        int var79 = field798[var5];
                        if (var79 == -1) {
                            var77 = null;
                        } else {
                            var77[0] = Integer.valueOf(var79);
                        }
                        if (var473 == 1400) {
                            var73.field2822 = var77;
                        }
                        if (var473 == 1401) {
                            var73.field2825 = var77;
                        }
                        if (var473 == 1402) {
                            var73.field2824 = var77;
                        }
                        if (var473 == 1403) {
                            var73.field2826 = var77;
                        }
                        if (var473 == 1404) {
                            var73.field2828 = var77;
                        }
                        if (var473 == 1405) {
                            var73.field2829 = var77;
                        }
                        if (var473 == 1406) {
                            var73.field2832 = var77;
                        }
                        if (var473 == 1407) {
                            var73.field2833 = var77;
                            var73.field2834 = var75;
                        }
                        if (var473 == 1408) {
                            var73.field2741 = var77;
                        }
                        if (var473 == 1409) {
                            var73.field2840 = var77;
                        }
                        if (var473 == 1410) {
                            var73.field2820 = var77;
                        }
                        if (var473 == 1411) {
                            var73.field2823 = var77;
                        }
                        if (var473 == 1412) {
                            var73.field2827 = var77;
                        }
                        if (var473 == 1414) {
                            var73.field2843 = var77;
                            var73.field2836 = var75;
                        }
                        if (var473 == 1415) {
                            var73.field2837 = var77;
                            var73.field2838 = var75;
                        }
                        if (var473 == 1416) {
                            var73.field2760 = var77;
                        }
                        if (var473 == 1417) {
                            var73.field2839 = var77;
                        }
                        if (var473 == 1418) {
                            var73.field2842 = var77;
                        }
                        if (var473 == 1419) {
                            var73.field2732 = var77;
                        }
                        if (var473 == 1420) {
                            var73.field2789 = var77;
                        }
                        if (var473 == 1421) {
                            var73.field2845 = var77;
                        }
                        if (var473 == 1422) {
                            var73.field2846 = var77;
                        }
                        if (var473 == 1423) {
                            var73.field2847 = var77;
                        }
                        if (var473 == 1424) {
                            var73.field2848 = var77;
                        }
                        if (var473 == 1425) {
                            var73.field2850 = var77;
                        }
                        if (var473 == 1426) {
                            var73.field2851 = var77;
                        }
                        if (var473 == 1427) {
                            var73.field2849 = var77;
                        }
                        var73.field2772 = true;
                        continue;
                    }
                    if (var473 < 1600) {
                        class173 var80 = var41 ? Statics.field681 : Statics.field700;
                        if (var473 == 1500) {
                            field798[var5++] = var80.field2774;
                            continue;
                        }
                        if (var473 == 1501) {
                            field798[var5++] = var80.field2835;
                            continue;
                        }
                        if (var473 == 1502) {
                            field798[var5++] = var80.field2831;
                            continue;
                        }
                        if (var473 == 1503) {
                            field798[var5++] = var80.field2758;
                            continue;
                        }
                        if (var473 == 1504) {
                            field798[var5++] = var80.field2762 ? 1 : 0;
                            continue;
                        }
                        if (var473 == 1505) {
                            field798[var5++] = var80.field2754;
                            continue;
                        }
                    } else if (var473 < 1700) {
                        class173 var81 = var41 ? Statics.field681 : Statics.field700;
                        if (var473 == 1600) {
                            field798[var5++] = var81.field2763;
                            continue;
                        }
                        if (var473 == 1601) {
                            field798[var5++] = var81.field2764;
                            continue;
                        }
                        if (var473 == 1602) {
                            field804[var6++] = var81.field2841;
                            continue;
                        }
                        if (var473 == 1603) {
                            field798[var5++] = var81.field2752;
                            continue;
                        }
                        if (var473 == 1604) {
                            field798[var5++] = var81.field2791;
                            continue;
                        }
                        if (var473 == 1605) {
                            field798[var5++] = var81.field2794;
                            continue;
                        }
                        if (var473 == 1606) {
                            field798[var5++] = var81.field2769;
                            continue;
                        }
                        if (var473 == 1607) {
                            field798[var5++] = var81.field2793;
                            continue;
                        }
                        if (var473 == 1608) {
                            field798[var5++] = var81.field2792;
                            continue;
                        }
                        if (var473 == 1609) {
                            field798[var5++] = var81.field2771;
                            continue;
                        }
                    } else if (var473 < 1800) {
                        class173 var82 = var41 ? Statics.field681 : Statics.field700;
                        if (var473 == 1700) {
                            field798[var5++] = var82.field2860;
                            continue;
                        }
                        if (var473 == 1701) {
                            if (var82.field2860 == -1) {
                                field798[var5++] = 0;
                            } else {
                                field798[var5++] = var82.field2861;
                            }
                            continue;
                        }
                        if (var473 == 1702) {
                            field798[var5++] = var82.field2817;
                            continue;
                        }
                    } else if (var473 < 1900) {
                        class173 var83 = var41 ? Statics.field681 : Statics.field700;
                        if (var473 == 1800) {
                            int[] var84 = field798;
                            int var85 = var5++;
                            int var86 = client.method46(var83);
                            int var87 = var86 >> 11 & 0x3F;
                            var84[var85] = var87;
                            continue;
                        }
                        if (var473 == 1801) {
                            var5--;
                            int var88 = field798[var5];
                            int var474 = var88 - 1;
                            if (var83.field2814 != null && var474 < var83.field2814.length && var83.field2814[var474] != null) {
                                field804[var6++] = var83.field2814[var474];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var473 == 1802) {
                            if (var83.field2813 == null) {
                                field804[var6++] = "";
                            } else {
                                field804[var6++] = var83.field2813;
                            }
                            continue;
                        }
                    } else if (var473 >= 1900 && var473 < 2000 || var473 >= 2900 && var473 < 3000) {
                        class173 var89;
                        if (var473 >= 2000) {
                            var473 -= 1000;
                            var5--;
                            var89 = class173.method793(field798[var5]);
                        } else {
                            var89 = var41 ? Statics.field681 : Statics.field700;
                        }
                        if (var473 == 1927) {
                            if (field805 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var89.field2849 == null) {
                                return;
                            }
                            class1 var90 = new class1();
                            var90.field7 = var89;
                            var90.field13 = var89.field2849;
                            var90.field3 = field805 + 1;
                            client.field491.method3567(arg0);
                            continue;
                        }
                    } else if (var473 < 2600) {
                        var5--;
                        class173 var91 = class173.method793(field798[var5]);
                        if (var473 == 2500) {
                            field798[var5++] = var91.field2774;
                            continue;
                        }
                        if (var473 == 2501) {
                            field798[var5++] = var91.field2835;
                            continue;
                        }
                        if (var473 == 2502) {
                            field798[var5++] = var91.field2831;
                            continue;
                        }
                        if (var473 == 2503) {
                            field798[var5++] = var91.field2758;
                            continue;
                        }
                        if (var473 == 2504) {
                            field798[var5++] = var91.field2762 ? 1 : 0;
                            continue;
                        }
                        if (var473 == 2505) {
                            field798[var5++] = var91.field2754;
                            continue;
                        }
                    } else if (var473 < 2700) {
                        var5--;
                        class173 var92 = class173.method793(field798[var5]);
                        if (var473 == 2600) {
                            field798[var5++] = var92.field2763;
                            continue;
                        }
                        if (var473 == 2601) {
                            field798[var5++] = var92.field2764;
                            continue;
                        }
                        if (var473 == 2602) {
                            field804[var6++] = var92.field2841;
                            continue;
                        }
                        if (var473 == 2603) {
                            field798[var5++] = var92.field2752;
                            continue;
                        }
                        if (var473 == 2604) {
                            field798[var5++] = var92.field2791;
                            continue;
                        }
                        if (var473 == 2605) {
                            field798[var5++] = var92.field2794;
                            continue;
                        }
                        if (var473 == 2606) {
                            field798[var5++] = var92.field2769;
                            continue;
                        }
                        if (var473 == 2607) {
                            field798[var5++] = var92.field2793;
                            continue;
                        }
                        if (var473 == 2608) {
                            field798[var5++] = var92.field2792;
                            continue;
                        }
                        if (var473 == 2609) {
                            field798[var5++] = var92.field2771;
                            continue;
                        }
                    } else if (var473 < 2800) {
                        if (var473 == 2700) {
                            var5--;
                            class173 var93 = class173.method793(field798[var5]);
                            field798[var5++] = var93.field2860;
                            continue;
                        }
                        if (var473 == 2701) {
                            var5--;
                            class173 var94 = class173.method793(field798[var5]);
                            if (var94.field2860 == -1) {
                                field798[var5++] = 0;
                            } else {
                                field798[var5++] = var94.field2861;
                            }
                            continue;
                        }
                        if (var473 == 2702) {
                            var5--;
                            int var95 = field798[var5];
                            class4 var96 = (class4) client.field453.method3509((long) var95);
                            if (var96 == null) {
                                field798[var5++] = 0;
                            } else {
                                field798[var5++] = 1;
                            }
                            continue;
                        }
                        if (var473 == 2706) {
                            field798[var5++] = client.field452;
                            continue;
                        }
                    } else if (var473 < 2900) {
                        var5--;
                        class173 var97 = class173.method793(field798[var5]);
                        if (var473 == 2800) {
                            int[] var98 = field798;
                            int var99 = var5++;
                            int var100 = client.method46(var97);
                            int var101 = var100 >> 11 & 0x3F;
                            var98[var99] = var101;
                            continue;
                        }
                        if (var473 == 2801) {
                            var5--;
                            int var102 = field798[var5];
                            int var475 = var102 - 1;
                            if (var97.field2814 != null && var475 < var97.field2814.length && var97.field2814[var475] != null) {
                                field804[var6++] = var97.field2814[var475];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var473 == 2802) {
                            if (var97.field2813 == null) {
                                field804[var6++] = "";
                            } else {
                                field804[var6++] = var97.field2813;
                            }
                            continue;
                        }
                    } else if (var473 < 3200) {
                        if (var473 == 3100) {
                            var6--;
                            String var103 = field804[var6];
                            class12.method755(0, "", var103);
                            continue;
                        }
                        if (var473 == 3101) {
                            var5 -= 2;
                            client.method1594(Statics.field143, field798[var5], field798[var5 + 1]);
                            continue;
                        }
                        if (var473 == 3103) {
                            client.field338.method2622(110);
                            for (class4 var104 = (class4) client.field453.method3512(); var104 != null; var104 = (class4) client.field453.method3513()) {
                                if (var104.field63 == 0 || var104.field63 == 3) {
                                    client.method1214(var104, true);
                                }
                            }
                            if (client.field405 != null) {
                                client.method13(client.field405);
                                client.field405 = null;
                            }
                            continue;
                        }
                        if (var473 == 3104) {
                            var6--;
                            String var105 = field804[var6];
                            int var106 = 0;
                            if (class163.method670(var105)) {
                                int var107 = class163.method562(var105, 10, true);
                                var106 = var107;
                            }
                            client.field338.method2622(134);
                            client.field338.method2376(var106);
                            continue;
                        }
                        if (var473 == 3105) {
                            var6--;
                            String var108 = field804[var6];
                            client.field338.method2622(162);
                            client.field338.method2503(var108.length() + 1);
                            client.field338.method2379(var108);
                            continue;
                        }
                        if (var473 == 3106) {
                            var6--;
                            String var109 = field804[var6];
                            client.field338.method2622(227);
                            client.field338.method2503(var109.length() + 1);
                            client.field338.method2379(var109);
                            continue;
                        }
                        if (var473 == 3107) {
                            var5--;
                            int var110 = field798[var5];
                            var6--;
                            String var111 = field804[var6];
                            int var112 = class33.field755;
                            int[] var113 = class33.field754;
                            boolean var114 = false;
                            for (int var115 = 0; var115 < var112; var115++) {
                                class3 var116 = client.field415[var113[var115]];
                                if (var116 != null && Statics.field143 != var116 && var116.field48 != null && var116.field48.equalsIgnoreCase(var111)) {
                                    if (var110 == 1) {
                                        client.field338.method2622(158);
                                        client.field338.method2511(0);
                                        client.field338.method2374(var113[var115]);
                                    } else if (var110 == 4) {
                                        client.field338.method2622(238);
                                        client.field338.method2503(0);
                                        client.field338.method2422(var113[var115]);
                                    } else if (var110 == 6) {
                                        client.field338.method2622(117);
                                        client.field338.method2422(var113[var115]);
                                        client.field338.method2451(0);
                                    } else if (var110 == 7) {
                                        client.field338.method2622(210);
                                        client.field338.method2401(var113[var115]);
                                        client.field338.method2451(0);
                                    }
                                    var114 = true;
                                    break;
                                }
                            }
                            if (!var114) {
                                class12.method755(4, "", class157.field2447 + var111);
                            }
                            continue;
                        }
                        if (var473 == 3108) {
                            var5 -= 3;
                            int var117 = field798[var5];
                            int var118 = field798[var5 + 1];
                            int var119 = field798[var5 + 2];
                            class173 var120 = class173.method793(var119);
                            client.method3462(var120, var117, var118);
                            continue;
                        }
                        if (var473 == 3109) {
                            var5 -= 2;
                            int var121 = field798[var5];
                            int var122 = field798[var5 + 1];
                            class173 var123 = var41 ? Statics.field681 : Statics.field700;
                            client.method3462(var123, var121, var122);
                            continue;
                        }
                        if (var473 == 3110) {
                            var5--;
                            Statics.field592 = field798[var5] == 1;
                            continue;
                        }
                        if (var473 == 3111) {
                            field798[var5++] = Statics.field1371.field139 ? 1 : 0;
                            continue;
                        }
                        if (var473 == 3112) {
                            var5--;
                            Statics.field1371.field139 = field798[var5] == 1;
                            class9.method3716();
                            continue;
                        }
                        if (var473 == 3113) {
                            var6--;
                            String var124 = field804[var6];
                            var5--;
                            boolean var125 = field798[var5] == 1;
                            class138.method2770(var124, var125, false);
                            continue;
                        }
                        if (var473 == 3115) {
                            var5--;
                            int var126 = field798[var5];
                            client.field338.method2622(85);
                            client.field338.method2374(var126);
                            continue;
                        }
                        if (var473 == 3116) {
                            var5--;
                            int var127 = field798[var5];
                            var6 -= 2;
                            String var128 = field804[var6];
                            String var129 = field804[var6 + 1];
                            if (var128.length() <= 500 && var129.length() <= 500) {
                                client.field338.method2622(130);
                                client.field338.method2374(1 + class119.method156(var128) + class119.method156(var129));
                                client.field338.method2511(var127);
                                client.field338.method2379(var129);
                                client.field338.method2379(var128);
                            }
                            continue;
                        }
                    } else if (var473 < 3300) {
                        if (var473 == 3200) {
                            var5 -= 3;
                            int var130 = field798[var5];
                            int var131 = field798[var5 + 1];
                            int var132 = field798[var5 + 2];
                            if (client.field532 != 0 && var131 != 0 && client.field534 < 50) {
                                client.field535[client.field534] = var130;
                                client.field536[client.field534] = var131;
                                client.field312[client.field534] = var132;
                                client.field322[client.field534] = null;
                                client.field538[client.field534] = 0;
                                client.field534++;
                            }
                            continue;
                        }
                        if (var473 == 3201) {
                            var5--;
                            client.method1968(field798[var5]);
                            continue;
                        }
                        if (var473 == 3202) {
                            var5 -= 2;
                            client.method794(field798[var5], field798[var5 + 1]);
                            continue;
                        }
                    } else if (var473 < 3400) {
                        if (var473 == 3300) {
                            field798[var5++] = client.field548;
                            continue;
                        }
                        if (var473 == 3301) {
                            var5 -= 2;
                            int var133 = field798[var5];
                            int var134 = field798[var5 + 1];
                            field798[var5++] = class16.method941(var133, var134);
                            continue;
                        }
                        if (var473 == 3302) {
                            var5 -= 2;
                            int var135 = field798[var5];
                            int var136 = field798[var5 + 1];
                            field798[var5++] = class16.method2326(var135, var136);
                            continue;
                        }
                        if (var473 == 3303) {
                            var5 -= 2;
                            int var137 = field798[var5];
                            int var138 = field798[var5 + 1];
                            field798[var5++] = class16.method154(var137, var138);
                            continue;
                        }
                        if (var473 == 3304) {
                            var5--;
                            int var139 = field798[var5];
                            int[] var140 = field798;
                            int var141 = var5++;
                            class51 var142 = (class51) class51.field1091.method3478((long) var139);
                            class51 var143;
                            if (var142 == null) {
                                byte[] var144 = Statics.field1083.method3050(5, var139);
                                class51 var145 = new class51();
                                if (var144 != null) {
                                    var145.method1012(new class119(var144));
                                }
                                class51.field1091.method3479(var145, (long) var139);
                                var143 = var145;
                            } else {
                                var143 = var142;
                            }
                            var140[var141] = var143.field1082;
                            continue;
                        }
                        if (var473 == 3305) {
                            var5--;
                            int var146 = field798[var5];
                            field798[var5++] = client.field387[var146];
                            continue;
                        }
                        if (var473 == 3306) {
                            var5--;
                            int var147 = field798[var5];
                            field798[var5++] = client.field417[var147];
                            continue;
                        }
                        if (var473 == 3307) {
                            var5--;
                            int var148 = field798[var5];
                            field798[var5++] = client.field339[var148];
                            continue;
                        }
                        if (var473 == 3308) {
                            int var149 = Statics.field124;
                            int var150 = (Statics.field143.field861 >> 7) + Statics.field233;
                            int var151 = (Statics.field143.field812 >> 7) + Statics.field647;
                            field798[var5++] = (var149 << 28) + (var150 << 14) + var151;
                            continue;
                        }
                        if (var473 == 3309) {
                            var5--;
                            int var152 = field798[var5];
                            field798[var5++] = var152 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var473 == 3310) {
                            var5--;
                            int var153 = field798[var5];
                            field798[var5++] = var153 >> 28;
                            continue;
                        }
                        if (var473 == 3311) {
                            var5--;
                            int var154 = field798[var5];
                            field798[var5++] = var154 & 0x3FFF;
                            continue;
                        }
                        if (var473 == 3312) {
                            field798[var5++] = client.field504 ? 1 : 0;
                            continue;
                        }
                        if (var473 == 3313) {
                            var5 -= 2;
                            int var155 = field798[var5] + 32768;
                            int var156 = field798[var5 + 1];
                            field798[var5++] = class16.method941(var155, var156);
                            continue;
                        }
                        if (var473 == 3314) {
                            var5 -= 2;
                            int var157 = field798[var5] + 32768;
                            int var158 = field798[var5 + 1];
                            field798[var5++] = class16.method2326(var157, var158);
                            continue;
                        }
                        if (var473 == 3315) {
                            var5 -= 2;
                            int var159 = field798[var5] + 32768;
                            int var160 = field798[var5 + 1];
                            field798[var5++] = class16.method154(var159, var160);
                            continue;
                        }
                        if (var473 == 3316) {
                            if (client.field368 >= 2) {
                                field798[var5++] = client.field368;
                            } else {
                                field798[var5++] = 0;
                            }
                            continue;
                        }
                        if (var473 == 3317) {
                            field798[var5++] = client.field531;
                            continue;
                        }
                        if (var473 == 3318) {
                            field798[var5++] = client.field544;
                            continue;
                        }
                        if (var473 == 3321) {
                            field798[var5++] = client.field517;
                            continue;
                        }
                        if (var473 == 3322) {
                            field798[var5++] = client.field458;
                            continue;
                        }
                        if (var473 == 3323) {
                            if (client.field461) {
                                field798[var5++] = 1;
                            } else {
                                field798[var5++] = 0;
                            }
                            continue;
                        }
                        if (var473 == 3324) {
                            field798[var5++] = client.field431;
                            continue;
                        }
                    } else if (var473 < 3500) {
                        if (var473 == 3400) {
                            var5 -= 2;
                            int var161 = field798[var5];
                            int var162 = field798[var5 + 1];
                            class49 var163 = (class49) class49.field1060.method3478((long) var161);
                            class49 var164;
                            if (var163 == null) {
                                byte[] var165 = Statics.field1069.method3050(8, var161);
                                class49 var166 = new class49();
                                if (var165 != null) {
                                    var166.method989(new class119(var165));
                                }
                                class49.field1060.method3479(var166, (long) var161);
                                var164 = var166;
                            } else {
                                var164 = var163;
                            }
                            class49 var167 = var164;
                            if (var164.field1063 != 's') {
                            }
                            for (int var168 = 0; var168 < var167.field1066; var168++) {
                                if (var167.field1064[var168] == var162) {
                                    field804[var6++] = var167.field1062[var168];
                                    var167 = null;
                                    break;
                                }
                            }
                            if (var167 != null) {
                                field804[var6++] = var167.field1065;
                            }
                            continue;
                        }
                        if (var473 == 3408) {
                            var5 -= 4;
                            int var169 = field798[var5];
                            int var170 = field798[var5 + 1];
                            int var171 = field798[var5 + 2];
                            int var172 = field798[var5 + 3];
                            class49 var173 = (class49) class49.field1060.method3478((long) var171);
                            class49 var174;
                            if (var173 == null) {
                                byte[] var175 = Statics.field1069.method3050(8, var171);
                                class49 var176 = new class49();
                                if (var175 != null) {
                                    var176.method989(new class119(var175));
                                }
                                class49.field1060.method3479(var176, (long) var171);
                                var174 = var176;
                            } else {
                                var174 = var173;
                            }
                            class49 var177 = var174;
                            if (var174.field1067 == var169 && var174.field1063 == var170) {
                                for (int var178 = 0; var178 < var177.field1066; var178++) {
                                    if (var177.field1064[var178] == var172) {
                                        if (var170 == 115) {
                                            field804[var6++] = var177.field1062[var178];
                                        } else {
                                            field798[var5++] = var177.field1068[var178];
                                        }
                                        var177 = null;
                                        break;
                                    }
                                }
                                if (var177 != null) {
                                    if (var170 == 115) {
                                        field804[var6++] = var177.field1065;
                                    } else {
                                        field798[var5++] = var177.field1061;
                                    }
                                }
                                continue;
                            }
                            if (var170 == 115) {
                                field804[var6++] = "null";
                            } else {
                                field798[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var473 < 3700) {
                        if (var473 == 3600) {
                            if (client.field561 == 0) {
                                field798[var5++] = -2;
                            } else if (client.field561 == 1) {
                                field798[var5++] = -1;
                            } else {
                                field798[var5++] = client.field560;
                            }
                            continue;
                        }
                        if (var473 == 3601) {
                            var5--;
                            int var179 = field798[var5];
                            if (client.field561 == 2 && var179 < client.field560) {
                                field804[var6++] = client.field562[var179].field249;
                                field804[var6++] = client.field562[var179].field261;
                                continue;
                            }
                            field804[var6++] = "";
                            field804[var6++] = "";
                            continue;
                        }
                        if (var473 == 3602) {
                            var5--;
                            int var180 = field798[var5];
                            if (client.field561 == 2 && var180 < client.field560) {
                                field798[var5++] = client.field562[var180].field250;
                                continue;
                            }
                            field798[var5++] = 0;
                            continue;
                        }
                        if (var473 == 3603) {
                            var5--;
                            int var181 = field798[var5];
                            if (client.field561 == 2 && var181 < client.field560) {
                                field798[var5++] = client.field562[var181].field251;
                                continue;
                            }
                            field798[var5++] = 0;
                            continue;
                        }
                        if (var473 == 3604) {
                            var6--;
                            String var182 = field804[var6];
                            var5--;
                            int var183 = field798[var5];
                            client.field338.method2622(171);
                            client.field338.method2503(class119.method156(var182) + 1);
                            client.field338.method2413(var183);
                            client.field338.method2379(var182);
                            continue;
                        }
                        if (var473 == 3605) {
                            var6--;
                            String var184 = field804[var6];
                            if (var184 == null) {
                                continue;
                            }
                            if ((client.field560 < 200 || client.field451 == 1) && client.field560 < 400) {
                                String var185 = class164.method2070(var184, Statics.field489);
                                if (var185 == null) {
                                    continue;
                                }
                                for (int var186 = 0; var186 < client.field560; var186++) {
                                    class18 var187 = client.field562[var186];
                                    String var188 = class164.method2070(var187.field249, Statics.field489);
                                    if (var188 != null && var188.equals(var185)) {
                                        class12.method755(30, "", var184 + class157.field2465);
                                        continue label3244;
                                    }
                                    if (var187.field261 != null) {
                                        String var189 = class164.method2070(var187.field261, Statics.field489);
                                        if (var189 != null && var189.equals(var185)) {
                                            class12.method755(30, "", var184 + class157.field2465);
                                            continue label3244;
                                        }
                                    }
                                }
                                for (int var190 = 0; var190 < client.field564; var190++) {
                                    class8 var191 = client.field565[var190];
                                    String var192 = class164.method2070(var191.field131, Statics.field489);
                                    if (var192 != null && var192.equals(var185)) {
                                        class12.method755(30, "", class157.field2470 + var184 + class157.field2471);
                                        continue label3244;
                                    }
                                    if (var191.field129 != null) {
                                        String var193 = class164.method2070(var191.field129, Statics.field489);
                                        if (var193 != null && var193.equals(var185)) {
                                            class12.method755(30, "", class157.field2470 + var184 + class157.field2471);
                                            continue label3244;
                                        }
                                    }
                                }
                                if (class164.method2070(Statics.field143.field48, Statics.field489).equals(var185)) {
                                    class12.method755(30, "", class157.field2505);
                                } else {
                                    client.field338.method2622(196);
                                    client.field338.method2503(class119.method156(var184));
                                    client.field338.method2379(var184);
                                }
                                continue;
                            }
                            class12.method755(30, "", class157.field2464);
                            continue;
                        }
                        if (var473 == 3606) {
                            var6--;
                            String var194 = field804[var6];
                            if (var194 == null) {
                                continue;
                            }
                            String var195 = class164.method2070(var194, Statics.field489);
                            if (var195 == null) {
                                continue;
                            }
                            int var196 = 0;
                            while (true) {
                                if (var196 >= client.field560) {
                                    continue label3244;
                                }
                                class18 var197 = client.field562[var196];
                                String var198 = var197.field249;
                                String var199 = class164.method2070(var198, Statics.field489);
                                boolean var200;
                                if (var194 == null || var198 == null) {
                                    var200 = false;
                                } else if (var194.startsWith("#") || var198.startsWith("#")) {
                                    var200 = var194.equals(var198);
                                } else {
                                    var200 = var195.equals(var199);
                                }
                                if (var200) {
                                    client.field560--;
                                    for (int var201 = var196; var201 < client.field560; var201++) {
                                        client.field562[var201] = client.field562[var201 + 1];
                                    }
                                    client.field485 = client.field477;
                                    client.field338.method2622(174);
                                    client.field338.method2503(class119.method156(var194));
                                    client.field338.method2379(var194);
                                    continue label3244;
                                }
                                var196++;
                            }
                        }
                        if (var473 == 3607) {
                            var6--;
                            String var202 = field804[var6];
                            if (var202 == null) {
                                continue;
                            }
                            if ((client.field564 < 100 || client.field451 == 1) && client.field564 < 400) {
                                String var203 = class164.method2070(var202, Statics.field489);
                                if (var203 == null) {
                                    continue;
                                }
                                for (int var204 = 0; var204 < client.field564; var204++) {
                                    class8 var205 = client.field565[var204];
                                    String var206 = class164.method2070(var205.field131, Statics.field489);
                                    if (var206 != null && var206.equals(var203)) {
                                        class12.method755(31, "", var202 + class157.field2343);
                                        continue label3244;
                                    }
                                    if (var205.field129 != null) {
                                        String var207 = class164.method2070(var205.field129, Statics.field489);
                                        if (var207 != null && var207.equals(var203)) {
                                            class12.method755(31, "", var202 + class157.field2343);
                                            continue label3244;
                                        }
                                    }
                                }
                                for (int var208 = 0; var208 < client.field560; var208++) {
                                    class18 var209 = client.field562[var208];
                                    String var210 = class164.method2070(var209.field249, Statics.field489);
                                    if (var210 != null && var210.equals(var203)) {
                                        class12.method755(31, "", class157.field2472 + var202 + class157.field2473);
                                        continue label3244;
                                    }
                                    if (var209.field261 != null) {
                                        String var211 = class164.method2070(var209.field261, Statics.field489);
                                        if (var211 != null && var211.equals(var203)) {
                                            class12.method755(31, "", class157.field2472 + var202 + class157.field2473);
                                            continue label3244;
                                        }
                                    }
                                }
                                if (class164.method2070(Statics.field143.field48, Statics.field489).equals(var203)) {
                                    class12.method755(31, "", class157.field2469);
                                } else {
                                    client.field338.method2622(244);
                                    client.field338.method2503(class119.method156(var202));
                                    client.field338.method2379(var202);
                                }
                                continue;
                            }
                            class12.method755(31, "", class157.field2555);
                            continue;
                        }
                        if (var473 == 3608) {
                            var6--;
                            String var212 = field804[var6];
                            client.method1528(var212);
                            continue;
                        }
                        if (var473 == 3609) {
                            var6--;
                            String var213 = field804[var6];
                            class152[] var214 = class152.method2691();
                            for (int var215 = 0; var215 < var214.length; var215++) {
                                class152 var216 = var214[var215];
                                if (var216.field2255 != -1 && var213.startsWith(class2.method1210(var216.field2255))) {
                                    var213 = var213.substring(6 + Integer.toString(var216.field2255).length());
                                    break;
                                }
                            }
                            field798[var5++] = Statics.method2169(var213, false) ? 1 : 0;
                            continue;
                        }
                        if (var473 == 3611) {
                            if (client.field519 == null) {
                                field804[var6++] = "";
                            } else {
                                field804[var6++] = class162.method568(client.field519);
                            }
                            continue;
                        }
                        if (var473 == 3612) {
                            if (client.field519 == null) {
                                field798[var5++] = 0;
                            } else {
                                field798[var5++] = Statics.field1944;
                            }
                            continue;
                        }
                        if (var473 == 3613) {
                            var5--;
                            int var217 = field798[var5];
                            if (client.field519 != null && var217 < Statics.field1944) {
                                field804[var6++] = Statics.field2189[var217].field630;
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var473 == 3614) {
                            var5--;
                            int var218 = field798[var5];
                            if (client.field519 != null && var218 < Statics.field1944) {
                                field798[var5++] = Statics.field2189[var218].field632;
                                continue;
                            }
                            field798[var5++] = 0;
                            continue;
                        }
                        if (var473 == 3615) {
                            var5--;
                            int var219 = field798[var5];
                            if (client.field519 != null && var219 < Statics.field1944) {
                                field798[var5++] = Statics.field2189[var219].field628;
                                continue;
                            }
                            field798[var5++] = 0;
                            continue;
                        }
                        if (var473 == 3616) {
                            field798[var5++] = Statics.field1593;
                            continue;
                        }
                        if (var473 == 3617) {
                            var6--;
                            String var220 = field804[var6];
                            client.method162(var220);
                            continue;
                        }
                        if (var473 == 3618) {
                            field798[var5++] = Statics.field3198;
                            continue;
                        }
                        if (var473 == 3619) {
                            var6--;
                            String var221 = field804[var6];
                            if (!var221.equals("")) {
                                client.field338.method2622(64);
                                client.field338.method2503(class119.method156(var221));
                                client.field338.method2379(var221);
                            }
                            continue;
                        }
                        if (var473 == 3620) {
                            client.method663();
                            continue;
                        }
                        if (var473 == 3621) {
                            if (client.field561 == 0) {
                                field798[var5++] = -1;
                            } else {
                                field798[var5++] = client.field564;
                            }
                            continue;
                        }
                        if (var473 == 3622) {
                            var5--;
                            int var222 = field798[var5];
                            if (client.field561 != 0 && var222 < client.field564) {
                                field804[var6++] = client.field565[var222].field131;
                                field804[var6++] = client.field565[var222].field129;
                                continue;
                            }
                            field804[var6++] = "";
                            field804[var6++] = "";
                            continue;
                        }
                        if (var473 == 3623) {
                            var6--;
                            String var223 = field804[var6];
                            if (var223.startsWith(class2.method1210(0)) || var223.startsWith(class2.method1210(1))) {
                                var223 = var223.substring(7);
                            }
                            field798[var5++] = client.method601(var223) ? 1 : 0;
                            continue;
                        }
                        if (var473 == 3624) {
                            var5--;
                            int var224 = field798[var5];
                            if (Statics.field2189 != null && var224 < Statics.field1944 && Statics.field2189[var224].field630.equalsIgnoreCase(Statics.field143.field48)) {
                                field798[var5++] = 1;
                                continue;
                            }
                            field798[var5++] = 0;
                            continue;
                        }
                        if (var473 == 3625) {
                            if (client.field520 == null) {
                                field804[var6++] = "";
                            } else {
                                field804[var6++] = class162.method568(client.field520);
                            }
                            continue;
                        }
                    } else if (var473 < 4000) {
                        if (var473 == 3903) {
                            var5--;
                            int var225 = field798[var5];
                            field798[var5++] = client.field569[var225].method3697();
                            continue;
                        }
                        if (var473 == 3904) {
                            var5--;
                            int var226 = field798[var5];
                            field798[var5++] = client.field569[var226].field3160;
                            continue;
                        }
                        if (var473 == 3905) {
                            var5--;
                            int var227 = field798[var5];
                            field798[var5++] = client.field569[var227].field3158;
                            continue;
                        }
                        if (var473 == 3906) {
                            var5--;
                            int var228 = field798[var5];
                            field798[var5++] = client.field569[var228].field3159;
                            continue;
                        }
                        if (var473 == 3907) {
                            var5--;
                            int var229 = field798[var5];
                            field798[var5++] = client.field569[var229].field3156;
                            continue;
                        }
                        if (var473 == 3908) {
                            var5--;
                            int var230 = field798[var5];
                            field798[var5++] = client.field569[var230].field3161;
                            continue;
                        }
                        if (var473 == 3910) {
                            var5--;
                            int var231 = field798[var5];
                            int var232 = client.field569[var231].method3695();
                            field798[var5++] = var232 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var473 == 3911) {
                            var5--;
                            int var233 = field798[var5];
                            int var234 = client.field569[var233].method3695();
                            field798[var5++] = var234 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var473 == 3912) {
                            var5--;
                            int var235 = field798[var5];
                            int var236 = client.field569[var235].method3695();
                            field798[var5++] = var236 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var473 == 3913) {
                            var5--;
                            int var237 = field798[var5];
                            int var238 = client.field569[var237].method3695();
                            field798[var5++] = var238 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var473 == 3914) {
                            var5--;
                            boolean var239 = field798[var5] == 1;
                            if (Statics.field2642 != null) {
                                Statics.field2642.method3718(class221.field3163, var239);
                            }
                            continue;
                        }
                        if (var473 == 3915) {
                            var5--;
                            boolean var240 = field798[var5] == 1;
                            if (Statics.field2642 != null) {
                                Statics.field2642.method3718(class221.field3164, var240);
                            }
                            continue;
                        }
                        if (var473 == 3916) {
                            var5 -= 2;
                            boolean var241 = field798[var5] == 1;
                            boolean var242 = field798[var5 + 1] == 1;
                            if (Statics.field2642 != null) {
                                Statics.field2642.method3718(new class22(var242), var241);
                            }
                            continue;
                        }
                        if (var473 == 3917) {
                            var5--;
                            boolean var243 = field798[var5] == 1;
                            if (Statics.field2642 != null) {
                                Statics.field2642.method3718(class221.field3165, var243);
                            }
                            continue;
                        }
                        if (var473 == 3918) {
                            var5--;
                            boolean var244 = field798[var5] == 1;
                            if (Statics.field2642 != null) {
                                Statics.field2642.method3718(class221.field3166, var244);
                            }
                            continue;
                        }
                        if (var473 == 3919) {
                            field798[var5++] = Statics.field2642 == null ? 0 : Statics.field2642.field3162.size();
                            continue;
                        }
                        if (var473 == 3920) {
                            var5--;
                            int var245 = field798[var5];
                            class214 var246 = (class214) Statics.field2642.field3162.get(var245);
                            field798[var5++] = var246.field3137;
                            continue;
                        }
                        if (var473 == 3921) {
                            var5--;
                            int var247 = field798[var5];
                            class214 var248 = (class214) Statics.field2642.field3162.get(var247);
                            field804[var6++] = var248.method3656();
                            continue;
                        }
                        if (var473 == 3922) {
                            var5--;
                            int var249 = field798[var5];
                            class214 var250 = (class214) Statics.field2642.field3162.get(var249);
                            field804[var6++] = var250.method3655();
                            continue;
                        }
                        if (var473 == 3923) {
                            var5--;
                            int var251 = field798[var5];
                            class214 var252 = (class214) Statics.field2642.field3162.get(var251);
                            long var253 = class115.method2266() - Statics.field1353 - var252.field3136;
                            int var255 = (int) (var253 / 3600000L);
                            int var256 = (int) ((var253 - (long) (var255 * 3600000)) / 60000L);
                            int var257 = (int) ((var253 - (long) (var255 * 3600000) - (long) (var256 * 60000)) / 1000L);
                            String var258 = var255 + ":" + var256 / 10 + var256 % 10 + ":" + var257 / 10 + var257 % 10;
                            field804[var6++] = var258;
                            continue;
                        }
                        if (var473 == 3924) {
                            var5--;
                            int var259 = field798[var5];
                            class214 var260 = (class214) Statics.field2642.field3162.get(var259);
                            field798[var5++] = var260.field3135.field3159;
                            continue;
                        }
                        if (var473 == 3925) {
                            var5--;
                            int var261 = field798[var5];
                            class214 var262 = (class214) Statics.field2642.field3162.get(var261);
                            field798[var5++] = var262.field3135.field3158;
                            continue;
                        }
                        if (var473 == 3926) {
                            var5--;
                            int var263 = field798[var5];
                            class214 var264 = (class214) Statics.field2642.field3162.get(var263);
                            field798[var5++] = var264.field3135.field3160;
                            continue;
                        }
                    } else if (var473 < 4100) {
                        if (var473 == 4000) {
                            var5 -= 2;
                            int var265 = field798[var5];
                            int var266 = field798[var5 + 1];
                            field798[var5++] = var265 + var266;
                            continue;
                        }
                        if (var473 == 4001) {
                            var5 -= 2;
                            int var267 = field798[var5];
                            int var268 = field798[var5 + 1];
                            field798[var5++] = var267 - var268;
                            continue;
                        }
                        if (var473 == 4002) {
                            var5 -= 2;
                            int var269 = field798[var5];
                            int var270 = field798[var5 + 1];
                            field798[var5++] = var269 * var270;
                            continue;
                        }
                        if (var473 == 4003) {
                            var5 -= 2;
                            int var271 = field798[var5];
                            int var272 = field798[var5 + 1];
                            field798[var5++] = var271 / var272;
                            continue;
                        }
                        if (var473 == 4004) {
                            var5--;
                            int var273 = field798[var5];
                            field798[var5++] = (int) (Math.random() * (double) var273);
                            continue;
                        }
                        if (var473 == 4005) {
                            var5--;
                            int var274 = field798[var5];
                            field798[var5++] = (int) (Math.random() * (double) (var274 + 1));
                            continue;
                        }
                        if (var473 == 4006) {
                            var5 -= 5;
                            int var275 = field798[var5];
                            int var276 = field798[var5 + 1];
                            int var277 = field798[var5 + 2];
                            int var278 = field798[var5 + 3];
                            int var279 = field798[var5 + 4];
                            field798[var5++] = (var276 - var275) * (var279 - var277) / (var278 - var277) + var275;
                            continue;
                        }
                        if (var473 == 4007) {
                            var5 -= 2;
                            int var280 = field798[var5];
                            int var281 = field798[var5 + 1];
                            field798[var5++] = var280 * var281 / 100 + var280;
                            continue;
                        }
                        if (var473 == 4008) {
                            var5 -= 2;
                            int var282 = field798[var5];
                            int var283 = field798[var5 + 1];
                            field798[var5++] = var282 | 0x1 << var283;
                            continue;
                        }
                        if (var473 == 4009) {
                            var5 -= 2;
                            int var284 = field798[var5];
                            int var285 = field798[var5 + 1];
                            field798[var5++] = var284 & -1 - (0x1 << var285);
                            continue;
                        }
                        if (var473 == 4010) {
                            var5 -= 2;
                            int var286 = field798[var5];
                            int var287 = field798[var5 + 1];
                            field798[var5++] = (var286 & 0x1 << var287) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var473 == 4011) {
                            var5 -= 2;
                            int var288 = field798[var5];
                            int var289 = field798[var5 + 1];
                            field798[var5++] = var288 % var289;
                            continue;
                        }
                        if (var473 == 4012) {
                            var5 -= 2;
                            int var290 = field798[var5];
                            int var291 = field798[var5 + 1];
                            if (var290 == 0) {
                                field798[var5++] = 0;
                            } else {
                                field798[var5++] = (int) Math.pow((double) var290, (double) var291);
                            }
                            continue;
                        }
                        if (var473 == 4013) {
                            var5 -= 2;
                            int var292 = field798[var5];
                            int var293 = field798[var5 + 1];
                            if (var292 == 0) {
                                field798[var5++] = 0;
                            } else if (var293 == 0) {
                                field798[var5++] = Integer.MAX_VALUE;
                            } else {
                                field798[var5++] = (int) Math.pow((double) var292, 1.0D / (double) var293);
                            }
                            continue;
                        }
                        if (var473 == 4014) {
                            var5 -= 2;
                            int var294 = field798[var5];
                            int var295 = field798[var5 + 1];
                            field798[var5++] = var294 & var295;
                            continue;
                        }
                        if (var473 == 4015) {
                            var5 -= 2;
                            int var296 = field798[var5];
                            int var297 = field798[var5 + 1];
                            field798[var5++] = var296 | var297;
                            continue;
                        }
                    } else if (var473 < 4200) {
                        if (var473 == 4100) {
                            var6--;
                            String var298 = field804[var6];
                            var5--;
                            int var299 = field798[var5];
                            field804[var6++] = var298 + var299;
                            continue;
                        }
                        if (var473 == 4101) {
                            var6 -= 2;
                            String var300 = field804[var6];
                            String var301 = field804[var6 + 1];
                            field804[var6++] = var300 + var301;
                            continue;
                        }
                        if (var473 == 4102) {
                            var6--;
                            String var302 = field804[var6];
                            var5--;
                            int var303 = field798[var5];
                            String[] var304 = field804;
                            int var305 = var6++;
                            String var307;
                            if (var303 < 0) {
                                var307 = Integer.toString(var303);
                            } else {
                                int var308 = var303;
                                String var309;
                                if (var303 < 0) {
                                    var309 = Integer.toString(var303, 10);
                                } else {
                                    int var310 = 2;
                                    int var311 = var303 / 10;
                                    while (var311 != 0) {
                                        var311 /= 10;
                                        var310++;
                                    }
                                    char[] var312 = new char[var310];
                                    var312[0] = '+';
                                    for (int var313 = var310 - 1; var313 > 0; var313--) {
                                        int var314 = var308;
                                        var308 /= 10;
                                        int var315 = var314 - var308 * 10;
                                        if (var315 >= 10) {
                                            var312[var313] = (char) (var315 + 87);
                                        } else {
                                            var312[var313] = (char) (var315 + 48);
                                        }
                                    }
                                    var309 = new String(var312);
                                }
                                var307 = var309;
                            }
                            var304[var305] = var302 + var307;
                            continue;
                        }
                        if (var473 == 4103) {
                            var6--;
                            String var316 = field804[var6];
                            field804[var6++] = var316.toLowerCase();
                            continue;
                        }
                        if (var473 == 4104) {
                            var5--;
                            int var317 = field798[var5];
                            long var318 = ((long) var317 + 11745L) * 86400000L;
                            field797.setTime(new Date(var318));
                            int var320 = field797.get(5);
                            int var321 = field797.get(2);
                            int var322 = field797.get(1);
                            field804[var6++] = var320 + "-" + field794[var321] + "-" + var322;
                            continue;
                        }
                        if (var473 == 4105) {
                            var6 -= 2;
                            String var323 = field804[var6];
                            String var324 = field804[var6 + 1];
                            if (Statics.field143.field34 != null && Statics.field143.field34.field2901) {
                                field804[var6++] = var324;
                                continue;
                            }
                            field804[var6++] = var323;
                            continue;
                        }
                        if (var473 == 4106) {
                            var5--;
                            int var325 = field798[var5];
                            field804[var6++] = Integer.toString(var325);
                            continue;
                        }
                        if (var473 == 4107) {
                            var6 -= 2;
                            int[] var326 = field798;
                            int var327 = var5++;
                            int var328 = class166.method2695(field804[var6], field804[var6 + 1], client.field301);
                            byte var329;
                            if (var328 > 0) {
                                var329 = 1;
                            } else if (var328 < 0) {
                                var329 = -1;
                            } else {
                                var329 = 0;
                            }
                            var326[var327] = var329;
                            continue;
                        }
                        if (var473 == 4108) {
                            var6--;
                            String var330 = field804[var6];
                            var5 -= 2;
                            int var331 = field798[var5];
                            int var332 = field798[var5 + 1];
                            byte[] var333 = Statics.field3147.method3050(var332, 0);
                            class224 var334 = new class224(var333);
                            field798[var5++] = var334.method3733(var330, var331);
                            continue;
                        }
                        if (var473 == 4109) {
                            var6--;
                            String var335 = field804[var6];
                            var5 -= 2;
                            int var336 = field798[var5];
                            int var337 = field798[var5 + 1];
                            byte[] var338 = Statics.field3147.method3050(var337, 0);
                            class224 var339 = new class224(var338);
                            field798[var5++] = var339.method3732(var335, var336);
                            continue;
                        }
                        if (var473 == 4110) {
                            var6 -= 2;
                            String var340 = field804[var6];
                            String var341 = field804[var6 + 1];
                            var5--;
                            if (field798[var5] == 1) {
                                field804[var6++] = var340;
                            } else {
                                field804[var6++] = var341;
                            }
                            continue;
                        }
                        if (var473 == 4111) {
                            var6--;
                            String var342 = field804[var6];
                            field804[var6++] = class223.method3734(var342);
                            continue;
                        }
                        if (var473 == 4112) {
                            var6--;
                            String var343 = field804[var6];
                            var5--;
                            int var344 = field798[var5];
                            field804[var6++] = var343 + (char) var344;
                            continue;
                        }
                        if (var473 == 4113) {
                            var5--;
                            int var345 = field798[var5];
                            int[] var346 = field798;
                            int var347 = var5++;
                            char var348 = (char) var345;
                            boolean var349;
                            if (var348 >= ' ' && var348 <= '~') {
                                var349 = true;
                            } else if (var348 >= 160 && var348 <= 255) {
                                var349 = true;
                            } else if (var348 == 8364 || var348 == 338 || var348 == 8212 || var348 == 339 || var348 == 376) {
                                var349 = true;
                            } else {
                                var349 = false;
                            }
                            var346[var347] = var349 ? 1 : 0;
                            continue;
                        }
                        if (var473 == 4114) {
                            var5--;
                            int var350 = field798[var5];
                            field798[var5++] = class163.method660((char) var350) ? 1 : 0;
                            continue;
                        }
                        if (var473 == 4115) {
                            var5--;
                            int var351 = field798[var5];
                            int[] var352 = field798;
                            int var353 = var5++;
                            char var354 = (char) var351;
                            boolean var355 = var354 >= 'A' && var354 <= 'Z' || var354 >= 'a' && var354 <= 'z';
                            var352[var353] = var355 ? 1 : 0;
                            continue;
                        }
                        if (var473 == 4116) {
                            var5--;
                            int var356 = field798[var5];
                            int[] var357 = field798;
                            int var358 = var5++;
                            char var359 = (char) var356;
                            boolean var360 = var359 >= '0' && var359 <= '9';
                            var357[var358] = var360 ? 1 : 0;
                            continue;
                        }
                        if (var473 == 4117) {
                            var6--;
                            String var361 = field804[var6];
                            if (var361 == null) {
                                field798[var5++] = 0;
                            } else {
                                field798[var5++] = var361.length();
                            }
                            continue;
                        }
                        if (var473 == 4118) {
                            var6--;
                            String var362 = field804[var6];
                            var5 -= 2;
                            int var363 = field798[var5];
                            int var364 = field798[var5 + 1];
                            field804[var6++] = var362.substring(var363, var364);
                            continue;
                        }
                        if (var473 == 4119) {
                            var6--;
                            String var365 = field804[var6];
                            StringBuilder var366 = new StringBuilder(var365.length());
                            boolean var367 = false;
                            for (int var368 = 0; var368 < var365.length(); var368++) {
                                char var369 = var365.charAt(var368);
                                if (var369 == '<') {
                                    var367 = true;
                                } else if (var369 == '>') {
                                    var367 = false;
                                } else if (!var367) {
                                    var366.append(var369);
                                }
                            }
                            field804[var6++] = var366.toString();
                            continue;
                        }
                        if (var473 == 4120) {
                            var6--;
                            String var370 = field804[var6];
                            var5--;
                            int var371 = field798[var5];
                            field798[var5++] = var370.indexOf(var371);
                            continue;
                        }
                        if (var473 == 4121) {
                            var6 -= 2;
                            String var372 = field804[var6];
                            String var373 = field804[var6 + 1];
                            var5--;
                            int var374 = field798[var5];
                            field798[var5++] = var372.indexOf(var373, var374);
                            continue;
                        }
                    } else if (var473 < 4300) {
                        if (var473 == 4200) {
                            var5--;
                            int var375 = field798[var5];
                            field804[var6++] = class52.method646(var375).field1113;
                            continue;
                        }
                        if (var473 == 4201) {
                            var5 -= 2;
                            int var376 = field798[var5];
                            int var377 = field798[var5 + 1];
                            class52 var378 = class52.method646(var376);
                            if (var377 >= 1 && var377 <= 5 && var378.field1114[var377 - 1] != null) {
                                field804[var6++] = var378.field1114[var377 - 1];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var473 == 4202) {
                            var5 -= 2;
                            int var379 = field798[var5];
                            int var380 = field798[var5 + 1];
                            class52 var381 = class52.method646(var379);
                            if (var380 >= 1 && var380 <= 5 && var381.field1125[var380 - 1] != null) {
                                field804[var6++] = var381.field1125[var380 - 1];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var473 == 4203) {
                            var5--;
                            int var382 = field798[var5];
                            field798[var5++] = class52.method646(var382).field1112;
                            continue;
                        }
                        if (var473 == 4204) {
                            var5--;
                            int var383 = field798[var5];
                            field798[var5++] = class52.method646(var383).field1111 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var473 == 4205) {
                            var5--;
                            int var384 = field798[var5];
                            class52 var385 = class52.method646(var384);
                            if (var385.field1100 == -1 && var385.field1094 >= 0) {
                                field798[var5++] = var385.field1094;
                                continue;
                            }
                            field798[var5++] = var384;
                            continue;
                        }
                        if (var473 == 4206) {
                            var5--;
                            int var386 = field798[var5];
                            class52 var387 = class52.method646(var386);
                            if (var387.field1100 >= 0 && var387.field1094 >= 0) {
                                field798[var5++] = var387.field1094;
                                continue;
                            }
                            field798[var5++] = var386;
                            continue;
                        }
                        if (var473 == 4207) {
                            var5--;
                            int var388 = field798[var5];
                            field798[var5++] = class52.method646(var388).field1101 ? 1 : 0;
                            continue;
                        }
                        if (var473 == 4210) {
                            var6--;
                            String var389 = field804[var6];
                            var5--;
                            int var390 = field798[var5];
                            boolean var392 = var390 == 1;
                            String var393 = var389.toLowerCase();
                            short[] var394 = new short[16];
                            int var395 = 0;
                            int var396 = 0;
                            while (true) {
                                if (var396 >= Statics.field875) {
                                    Statics.field270 = var394;
                                    Statics.field2171 = 0;
                                    Statics.field71 = var395;
                                    String[] var400 = new String[Statics.field71];
                                    for (int var401 = 0; var401 < Statics.field71; var401++) {
                                        var400[var401] = class52.method646(var394[var401]).field1113;
                                    }
                                    class124.method1966(var400, Statics.field270);
                                    break;
                                }
                                class52 var397 = class52.method646(var396);
                                if ((!var392 || var397.field1107) && var397.field1100 == -1 && var397.field1113.toLowerCase().indexOf(var393) != -1) {
                                    if (var395 >= 250) {
                                        Statics.field71 = -1;
                                        Statics.field270 = null;
                                        break;
                                    }
                                    if (var395 >= var394.length) {
                                        short[] var398 = new short[var394.length * 2];
                                        for (int var399 = 0; var399 < var395; var399++) {
                                            var398[var399] = var394[var399];
                                        }
                                        var394 = var398;
                                    }
                                    var394[var395++] = (short) var396;
                                }
                                var396++;
                            }
                            field798[var5++] = Statics.field71;
                            continue;
                        }
                        if (var473 == 4211) {
                            if (Statics.field270 != null && Statics.field2171 < Statics.field71) {
                                field798[var5++] = Statics.field270[++Statics.field2171 - 1] & 0xFFFF;
                                continue;
                            }
                            field798[var5++] = -1;
                            continue;
                        }
                        if (var473 == 4212) {
                            Statics.field2171 = 0;
                            continue;
                        }
                    } else if (var473 < 5100) {
                        if (var473 == 5000) {
                            field798[var5++] = client.field510;
                            continue;
                        }
                        if (var473 == 5001) {
                            var5 -= 3;
                            client.field510 = field798[var5];
                            Statics.field616 = class130.method1009(field798[var5 + 1]);
                            if (Statics.field616 == null) {
                                Statics.field616 = class130.field2057;
                            }
                            client.field444 = field798[var5 + 2];
                            client.field338.method2622(121);
                            client.field338.method2503(client.field510);
                            client.field338.method2503(Statics.field616.field2059);
                            client.field338.method2503(client.field444);
                            continue;
                        }
                        if (var473 == 5002) {
                            var6--;
                            String var402 = field804[var6];
                            var5 -= 2;
                            int var403 = field798[var5];
                            int var404 = field798[var5 + 1];
                            client.field338.method2622(93);
                            client.field338.method2503(class119.method156(var402) + 2);
                            client.field338.method2379(var402);
                            client.field338.method2503(var403 - 1);
                            client.field338.method2503(var404);
                            continue;
                        }
                        if (var473 == 5003) {
                            var5 -= 2;
                            int var405 = field798[var5];
                            int var406 = field798[var5 + 1];
                            class36 var407 = class12.method2946(var405, var406);
                            if (var407 == null) {
                                field798[var5++] = -1;
                                field798[var5++] = 0;
                                field804[var6++] = "";
                                field804[var6++] = "";
                                field804[var6++] = "";
                            } else {
                                field798[var5++] = var407.field789;
                                field798[var5++] = var407.field786;
                                field804[var6++] = var407.field791 == null ? "" : var407.field791;
                                field804[var6++] = var407.field788 == null ? "" : var407.field788;
                                field804[var6++] = var407.field790 == null ? "" : var407.field790;
                            }
                            continue;
                        }
                        if (var473 == 5004) {
                            var5--;
                            int var408 = field798[var5];
                            class36 var409 = class12.method2165(var408);
                            if (var409 == null) {
                                field798[var5++] = -1;
                                field798[var5++] = 0;
                                field804[var6++] = "";
                                field804[var6++] = "";
                                field804[var6++] = "";
                            } else {
                                field798[var5++] = var409.field787;
                                field798[var5++] = var409.field786;
                                field804[var6++] = var409.field791 == null ? "" : var409.field791;
                                field804[var6++] = var409.field788 == null ? "" : var409.field788;
                                field804[var6++] = var409.field790 == null ? "" : var409.field790;
                            }
                            continue;
                        }
                        if (var473 == 5005) {
                            if (Statics.field616 == null) {
                                field798[var5++] = -1;
                            } else {
                                field798[var5++] = Statics.field616.field2059;
                            }
                            continue;
                        }
                        if (var473 == 5008) {
                            var6--;
                            String var410 = field804[var6];
                            var5--;
                            int var411 = field798[var5];
                            String var412 = var410.toLowerCase();
                            byte var413 = 0;
                            if (var412.startsWith(class157.field2474)) {
                                var413 = 0;
                                var410 = var410.substring(class157.field2474.length());
                            } else if (var412.startsWith(class157.field2476)) {
                                var413 = 1;
                                var410 = var410.substring(class157.field2476.length());
                            } else if (var412.startsWith(class157.field2478)) {
                                var413 = 2;
                                var410 = var410.substring(class157.field2478.length());
                            } else if (var412.startsWith(class157.field2468)) {
                                var413 = 3;
                                var410 = var410.substring(class157.field2468.length());
                            } else if (var412.startsWith(class157.field2311)) {
                                var413 = 4;
                                var410 = var410.substring(class157.field2311.length());
                            } else if (var412.startsWith(class157.field2484)) {
                                var413 = 5;
                                var410 = var410.substring(class157.field2484.length());
                            } else if (var412.startsWith(class157.field2416)) {
                                var413 = 6;
                                var410 = var410.substring(class157.field2416.length());
                            } else if (var412.startsWith(class157.field2532)) {
                                var413 = 7;
                                var410 = var410.substring(class157.field2532.length());
                            } else if (var412.startsWith(class157.field2490)) {
                                var413 = 8;
                                var410 = var410.substring(class157.field2490.length());
                            } else if (var412.startsWith(class157.field2492)) {
                                var413 = 9;
                                var410 = var410.substring(class157.field2492.length());
                            } else if (var412.startsWith(class157.field2494)) {
                                var413 = 10;
                                var410 = var410.substring(class157.field2494.length());
                            } else if (var412.startsWith(class157.field2496)) {
                                var413 = 11;
                                var410 = var410.substring(class157.field2496.length());
                            } else if (client.field301 != 0) {
                                if (var412.startsWith(class157.field2475)) {
                                    var413 = 0;
                                    var410 = var410.substring(class157.field2475.length());
                                } else if (var412.startsWith(class157.field2431)) {
                                    var413 = 1;
                                    var410 = var410.substring(class157.field2431.length());
                                } else if (var412.startsWith(class157.field2479)) {
                                    var413 = 2;
                                    var410 = var410.substring(class157.field2479.length());
                                } else if (var412.startsWith(class157.field2481)) {
                                    var413 = 3;
                                    var410 = var410.substring(class157.field2481.length());
                                } else if (var412.startsWith(class157.field2483)) {
                                    var413 = 4;
                                    var410 = var410.substring(class157.field2483.length());
                                } else if (var412.startsWith(class157.field2485)) {
                                    var413 = 5;
                                    var410 = var410.substring(class157.field2485.length());
                                } else if (var412.startsWith(class157.field2565)) {
                                    var413 = 6;
                                    var410 = var410.substring(class157.field2565.length());
                                } else if (var412.startsWith(class157.field2489)) {
                                    var413 = 7;
                                    var410 = var410.substring(class157.field2489.length());
                                } else if (var412.startsWith(class157.field2491)) {
                                    var413 = 8;
                                    var410 = var410.substring(class157.field2491.length());
                                } else if (var412.startsWith(class157.field2493)) {
                                    var413 = 9;
                                    var410 = var410.substring(class157.field2493.length());
                                } else if (var412.startsWith(class157.field2301)) {
                                    var413 = 10;
                                    var410 = var410.substring(class157.field2301.length());
                                } else if (var412.startsWith(class157.field2497)) {
                                    var413 = 11;
                                    var410 = var410.substring(class157.field2497.length());
                                }
                            }
                            String var414 = var410.toLowerCase();
                            byte var415 = 0;
                            if (var414.startsWith(class157.field2498)) {
                                var415 = 1;
                                var410 = var410.substring(class157.field2498.length());
                            } else if (var414.startsWith(class157.field2500)) {
                                var415 = 2;
                                var410 = var410.substring(class157.field2500.length());
                            } else if (var414.startsWith(class157.field2350)) {
                                var415 = 3;
                                var410 = var410.substring(class157.field2350.length());
                            } else if (var414.startsWith(class157.field2504)) {
                                var415 = 4;
                                var410 = var410.substring(class157.field2504.length());
                            } else if (var414.startsWith(class157.field2506)) {
                                var415 = 5;
                                var410 = var410.substring(class157.field2506.length());
                            } else if (client.field301 != 0) {
                                if (var414.startsWith(class157.field2499)) {
                                    var415 = 1;
                                    var410 = var410.substring(class157.field2499.length());
                                } else if (var414.startsWith(class157.field2501)) {
                                    var415 = 2;
                                    var410 = var410.substring(class157.field2501.length());
                                } else if (var414.startsWith(class157.field2503)) {
                                    var415 = 3;
                                    var410 = var410.substring(class157.field2503.length());
                                } else if (var414.startsWith(class157.field2542)) {
                                    var415 = 4;
                                    var410 = var410.substring(class157.field2542.length());
                                } else if (var414.startsWith(class157.field2507)) {
                                    var415 = 5;
                                    var410 = var410.substring(class157.field2507.length());
                                }
                            }
                            client.field338.method2622(140);
                            client.field338.method2503(0);
                            int var416 = client.field338.field1988;
                            client.field338.method2503(var411);
                            client.field338.method2503(var413);
                            client.field338.method2503(var415);
                            class122 var417 = client.field338;
                            int var418 = var417.field1988;
                            int var419 = var410.length();
                            byte[] var420 = new byte[var419];
                            for (int var421 = 0; var421 < var419; var421++) {
                                char var422 = var410.charAt(var421);
                                if (!(var422 <= 0 || var422 >= 128) || !(var422 < 160 || var422 > 255)) {
                                    var420[var421] = (byte) var422;
                                } else if (var422 == 8364) {
                                    var420[var421] = -128;
                                } else if (var422 == 8218) {
                                    var420[var421] = -126;
                                } else if (var422 == 402) {
                                    var420[var421] = -125;
                                } else if (var422 == 8222) {
                                    var420[var421] = -124;
                                } else if (var422 == 8230) {
                                    var420[var421] = -123;
                                } else if (var422 == 8224) {
                                    var420[var421] = -122;
                                } else if (var422 == 8225) {
                                    var420[var421] = -121;
                                } else if (var422 == 710) {
                                    var420[var421] = -120;
                                } else if (var422 == 8240) {
                                    var420[var421] = -119;
                                } else if (var422 == 352) {
                                    var420[var421] = -118;
                                } else if (var422 == 8249) {
                                    var420[var421] = -117;
                                } else if (var422 == 338) {
                                    var420[var421] = -116;
                                } else if (var422 == 381) {
                                    var420[var421] = -114;
                                } else if (var422 == 8216) {
                                    var420[var421] = -111;
                                } else if (var422 == 8217) {
                                    var420[var421] = -110;
                                } else if (var422 == 8220) {
                                    var420[var421] = -109;
                                } else if (var422 == 8221) {
                                    var420[var421] = -108;
                                } else if (var422 == 8226) {
                                    var420[var421] = -107;
                                } else if (var422 == 8211) {
                                    var420[var421] = -106;
                                } else if (var422 == 8212) {
                                    var420[var421] = -105;
                                } else if (var422 == 732) {
                                    var420[var421] = -104;
                                } else if (var422 == 8482) {
                                    var420[var421] = -103;
                                } else if (var422 == 353) {
                                    var420[var421] = -102;
                                } else if (var422 == 8250) {
                                    var420[var421] = -101;
                                } else if (var422 == 339) {
                                    var420[var421] = -100;
                                } else if (var422 == 382) {
                                    var420[var421] = -98;
                                } else if (var422 == 376) {
                                    var420[var421] = -97;
                                } else {
                                    var420[var421] = 63;
                                }
                            }
                            var417.method2386(var420.length);
                            var417.field1988 += Statics.field3168.method2312(var420, 0, var420.length, var417.field1986, var417.field1988);
                            client.field338.method2385(client.field338.field1988 - var416);
                            continue;
                        }
                        if (var473 == 5009) {
                            var6 -= 2;
                            String var425 = field804[var6];
                            String var426 = field804[var6 + 1];
                            client.field338.method2622(253);
                            client.field338.method2374(0);
                            int var427 = client.field338.field1988;
                            client.field338.method2379(var425);
                            class122 var428 = client.field338;
                            int var429 = var428.field1988;
                            int var430 = var426.length();
                            byte[] var431 = new byte[var430];
                            for (int var432 = 0; var432 < var430; var432++) {
                                char var433 = var426.charAt(var432);
                                if (!(var433 <= 0 || var433 >= 128) || !(var433 < 160 || var433 > 255)) {
                                    var431[var432] = (byte) var433;
                                } else if (var433 == 8364) {
                                    var431[var432] = -128;
                                } else if (var433 == 8218) {
                                    var431[var432] = -126;
                                } else if (var433 == 402) {
                                    var431[var432] = -125;
                                } else if (var433 == 8222) {
                                    var431[var432] = -124;
                                } else if (var433 == 8230) {
                                    var431[var432] = -123;
                                } else if (var433 == 8224) {
                                    var431[var432] = -122;
                                } else if (var433 == 8225) {
                                    var431[var432] = -121;
                                } else if (var433 == 710) {
                                    var431[var432] = -120;
                                } else if (var433 == 8240) {
                                    var431[var432] = -119;
                                } else if (var433 == 352) {
                                    var431[var432] = -118;
                                } else if (var433 == 8249) {
                                    var431[var432] = -117;
                                } else if (var433 == 338) {
                                    var431[var432] = -116;
                                } else if (var433 == 381) {
                                    var431[var432] = -114;
                                } else if (var433 == 8216) {
                                    var431[var432] = -111;
                                } else if (var433 == 8217) {
                                    var431[var432] = -110;
                                } else if (var433 == 8220) {
                                    var431[var432] = -109;
                                } else if (var433 == 8221) {
                                    var431[var432] = -108;
                                } else if (var433 == 8226) {
                                    var431[var432] = -107;
                                } else if (var433 == 8211) {
                                    var431[var432] = -106;
                                } else if (var433 == 8212) {
                                    var431[var432] = -105;
                                } else if (var433 == 732) {
                                    var431[var432] = -104;
                                } else if (var433 == 8482) {
                                    var431[var432] = -103;
                                } else if (var433 == 353) {
                                    var431[var432] = -102;
                                } else if (var433 == 8250) {
                                    var431[var432] = -101;
                                } else if (var433 == 339) {
                                    var431[var432] = -100;
                                } else if (var433 == 382) {
                                    var431[var432] = -98;
                                } else if (var433 == 376) {
                                    var431[var432] = -97;
                                } else {
                                    var431[var432] = 63;
                                }
                            }
                            var428.method2386(var431.length);
                            var428.field1988 += Statics.field3168.method2312(var431, 0, var431.length, var428.field1986, var428.field1988);
                            client.field338.method2384(client.field338.field1988 - var427);
                            continue;
                        }
                        if (var473 == 5015) {
                            String var436;
                            if (Statics.field143 == null || Statics.field143.field48 == null) {
                                var436 = "";
                            } else {
                                var436 = Statics.field143.field48;
                            }
                            field804[var6++] = var436;
                            continue;
                        }
                        if (var473 == 5016) {
                            field798[var5++] = client.field444;
                            continue;
                        }
                        if (var473 == 5017) {
                            var5--;
                            int var437 = field798[var5];
                            int[] var438 = field798;
                            int var439 = var5++;
                            class28 var440 = (class28) class12.field175.get(var437);
                            int var441;
                            if (var440 == null) {
                                var441 = 0;
                            } else {
                                var441 = var440.method647();
                            }
                            var438[var439] = var441;
                            continue;
                        }
                        if (var473 == 5018) {
                            var5--;
                            int var442 = field798[var5];
                            field798[var5++] = class12.method3215(var442);
                            continue;
                        }
                        if (var473 == 5019) {
                            var5--;
                            int var443 = field798[var5];
                            int[] var444 = field798;
                            int var445 = var5++;
                            class36 var446 = (class36) class12.field174.method3528((long) var443);
                            int var447;
                            if (var446 == null) {
                                var447 = -1;
                            } else if (class12.field171.field3091 == var446.field3095) {
                                var447 = -1;
                            } else {
                                var447 = ((class36) var446.field3095).field789;
                            }
                            var444[var445] = var447;
                            continue;
                        }
                        if (var473 == 5020) {
                            var6--;
                            String var448 = field804[var6];
                            if (var448.equalsIgnoreCase("toggleroof")) {
                                Statics.field1371.field139 = !Statics.field1371.field139;
                                class9.method3716();
                                if (Statics.field1371.field139) {
                                    class12.method755(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method755(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var448.equalsIgnoreCase("displayfps")) {
                                client.field528 = !client.field528;
                            }
                            if (client.field368 >= 2) {
                                if (var448.equalsIgnoreCase("fpson")) {
                                    client.field528 = true;
                                }
                                if (var448.equalsIgnoreCase("fpsoff")) {
                                    client.field528 = false;
                                }
                                if (var448.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var448.equalsIgnoreCase("clientdrop")) {
                                    client.method659();
                                }
                                if (var448.equalsIgnoreCase("errortest") && client.field297 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field338.method2622(243);
                            client.field338.method2503(var448.length() + 1);
                            client.field338.method2379(var448);
                            continue;
                        }
                        if (var473 == 5021) {
                            var6--;
                            client.field512 = field804[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var473 == 5022) {
                            field804[var6++] = client.field512;
                            continue;
                        }
                    }
                } else {
                    class173 var69;
                    if (var473 >= 2000) {
                        var473 -= 1000;
                        var5--;
                        var69 = class173.method793(field798[var5]);
                    } else {
                        var69 = var41 ? Statics.field681 : Statics.field700;
                    }
                    if (var473 == 1300) {
                        var5--;
                        int var70 = field798[var5] - 1;
                        if (var70 >= 0 && var70 <= 9) {
                            var6--;
                            var69.method3181(var70, field804[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var473 == 1301) {
                        var5 -= 2;
                        int var71 = field798[var5];
                        int var72 = field798[var5 + 1];
                        var69.field2799 = class173.method732(var71, var72);
                        continue;
                    }
                    if (var473 == 1302) {
                        var5--;
                        var69.field2818 = field798[var5] == 1;
                        continue;
                    }
                    if (var473 == 1303) {
                        var5--;
                        var69.field2773 = field798[var5];
                        continue;
                    }
                    if (var473 == 1304) {
                        var5--;
                        var69.field2800 = field798[var5];
                        continue;
                    }
                    if (var473 == 1305) {
                        var6--;
                        var69.field2813 = field804[var6];
                        continue;
                    }
                    if (var473 == 1306) {
                        var6--;
                        var69.field2756 = field804[var6];
                        continue;
                    }
                    if (var473 == 1307) {
                        var69.field2814 = null;
                        continue;
                    }
                }
                if (var473 < 5400) {
                    if (var473 == 5306) {
                        int[] var449 = field798;
                        int var450 = var5++;
                        int var451 = client.field506 ? 2 : 1;
                        var449[var450] = var451;
                        continue;
                    }
                    if (var473 == 5307) {
                        var5--;
                        int var452 = field798[var5];
                        if (var452 == 1 || var452 == 2) {
                            client.method2330(var452);
                        }
                        continue;
                    }
                    if (var473 == 5308) {
                        field798[var5++] = Statics.field1371.field144;
                        continue;
                    }
                    if (var473 == 5309) {
                        var5--;
                        int var453 = field798[var5];
                        if (var453 == 1 || var453 == 2) {
                            Statics.field1371.field144 = var453;
                            class9.method3716();
                        }
                        continue;
                    }
                }
                if (var473 < 5600) {
                    if (var473 == 5504) {
                        var5 -= 2;
                        int var454 = field798[var5];
                        int var455 = field798[var5 + 1];
                        if (!client.field540) {
                            client.field378 = var454;
                            client.field442 = var455;
                        }
                        continue;
                    }
                    if (var473 == 5505) {
                        field798[var5++] = client.field378;
                        continue;
                    }
                    if (var473 == 5506) {
                        field798[var5++] = client.field442;
                        continue;
                    }
                    if (var473 == 5530) {
                        var5--;
                        int var456 = field798[var5];
                        if (var456 < 0) {
                            var456 = 0;
                        }
                        client.field384 = var456;
                        continue;
                    }
                    if (var473 == 5531) {
                        field798[var5++] = client.field384;
                        continue;
                    }
                }
                if (var473 >= 5700 || var473 != 5630) {
                    if (var473 < 6300) {
                        if (var473 == 6200) {
                            var5 -= 2;
                            client.field547 = (short) field798[var5];
                            if (client.field547 <= 0) {
                                client.field547 = 256;
                            }
                            client.field408 = (short) field798[var5 + 1];
                            if (client.field408 <= 0) {
                                client.field408 = 205;
                            }
                            continue;
                        }
                        if (var473 == 6201) {
                            var5 -= 2;
                            client.field549 = (short) field798[var5];
                            if (client.field549 <= 0) {
                                client.field549 = 256;
                            }
                            client.field503 = (short) field798[var5 + 1];
                            if (client.field503 <= 0) {
                                client.field503 = 320;
                            }
                            continue;
                        }
                        if (var473 == 6202) {
                            var5 -= 4;
                            client.field551 = (short) field798[var5];
                            if (client.field551 <= 0) {
                                client.field551 = 1;
                            }
                            client.field552 = (short) field798[var5 + 1];
                            if (client.field552 <= 0) {
                                client.field552 = 32767;
                            } else if (client.field552 < client.field551) {
                                client.field552 = client.field551;
                            }
                            client.field553 = (short) field798[var5 + 2];
                            if (client.field553 <= 0) {
                                client.field553 = 1;
                            }
                            client.field554 = (short) field798[var5 + 3];
                            if (client.field554 <= 0) {
                                client.field554 = 32767;
                            } else if (client.field554 < client.field553) {
                                client.field554 = client.field553;
                            }
                            continue;
                        }
                        if (var473 == 6203) {
                            if (client.field464 == null) {
                                field798[var5++] = -1;
                                field798[var5++] = -1;
                            } else {
                                client.method1010(0, 0, client.field464.field2831, client.field464.field2758, false);
                                field798[var5++] = client.field475;
                                field798[var5++] = client.field313;
                            }
                            continue;
                        }
                        if (var473 == 6204) {
                            field798[var5++] = client.field549;
                            field798[var5++] = client.field503;
                            continue;
                        }
                        if (var473 == 6205) {
                            field798[var5++] = client.field547;
                            field798[var5++] = client.field408;
                            continue;
                        }
                    }
                    if (var473 < 6600) {
                        if (var473 == 6500) {
                            field798[var5++] = class26.method2956() ? 1 : 0;
                            continue;
                        }
                        if (var473 == 6501) {
                            class26.field653 = 0;
                            class26 var457 = class26.method2580();
                            if (var457 == null) {
                                field798[var5++] = -1;
                                field798[var5++] = 0;
                                field804[var6++] = "";
                                field798[var5++] = 0;
                                field798[var5++] = 0;
                                field804[var6++] = "";
                            } else {
                                field798[var5++] = var457.field646;
                                field798[var5++] = var457.field642;
                                field804[var6++] = var457.field650;
                                field798[var5++] = var457.field651;
                                field798[var5++] = var457.field648;
                                field804[var6++] = var457.field657;
                            }
                            continue;
                        }
                        if (var473 == 6502) {
                            class26 var459 = class26.method2580();
                            if (var459 == null) {
                                field798[var5++] = -1;
                                field798[var5++] = 0;
                                field804[var6++] = "";
                                field798[var5++] = 0;
                                field798[var5++] = 0;
                                field804[var6++] = "";
                            } else {
                                field798[var5++] = var459.field646;
                                field798[var5++] = var459.field642;
                                field804[var6++] = var459.field650;
                                field798[var5++] = var459.field651;
                                field798[var5++] = var459.field648;
                                field804[var6++] = var459.field657;
                            }
                            continue;
                        }
                        if (var473 == 6506) {
                            var5--;
                            int var460 = field798[var5];
                            class26 var461 = null;
                            for (int var462 = 0; var462 < class26.field645; var462++) {
                                if (Statics.field660[var462].field646 == var460) {
                                    var461 = Statics.field660[var462];
                                    break;
                                }
                            }
                            if (var461 == null) {
                                field798[var5++] = -1;
                                field798[var5++] = 0;
                                field804[var6++] = "";
                                field798[var5++] = 0;
                                field798[var5++] = 0;
                                field804[var6++] = "";
                            } else {
                                field798[var5++] = var461.field646;
                                field798[var5++] = var461.field642;
                                field804[var6++] = var461.field650;
                                field798[var5++] = var461.field651;
                                field798[var5++] = var461.field648;
                                field804[var6++] = var461.field657;
                            }
                            continue;
                        }
                        if (var473 == 6507) {
                            var5 -= 4;
                            int var463 = field798[var5];
                            boolean var464 = field798[var5 + 1] == 1;
                            int var465 = field798[var5 + 2];
                            boolean var466 = field798[var5 + 3] == 1;
                            if (Statics.field660 != null) {
                                class26.method3291(0, Statics.field660.length - 1, var463, var464, var465, var466);
                            }
                            continue;
                        }
                        if (var473 == 6511) {
                            var5--;
                            int var467 = field798[var5];
                            if (var467 >= 0 && var467 < class26.field645) {
                                class26 var468 = Statics.field660[var467];
                                field798[var5++] = var468.field646;
                                field798[var5++] = var468.field642;
                                field804[var6++] = var468.field650;
                                field798[var5++] = var468.field651;
                                field798[var5++] = var468.field648;
                                field804[var6++] = var468.field657;
                                continue;
                            }
                            field798[var5++] = -1;
                            field798[var5++] = 0;
                            field804[var6++] = "";
                            field798[var5++] = 0;
                            field798[var5++] = 0;
                            field804[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field348 = 250;
            }
        } catch (Exception var472) {
            StringBuilder var470 = new StringBuilder(30);
            var470.append("").append(var4.field3107).append(" ");
            for (int var471 = field801 - 1; var471 >= 0; var471--) {
                var470.append("").append(field802[var471].field219.field3107).append(" ");
            }
            var470.append("").append(var10);
            class148.method2819(var470.toString(), var472);
        }
    }

    @ObfuscatedName("j.q(II)V")
    public static void method164(int arg0) {
        if (arg0 == -1 || !class173.method2073(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2868[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2821 != null) {
                class1 var4 = new class1();
                var4.field7 = var3;
                var4.field13 = var3.field2821;
                method2963(var4, 2000000);
            }
        }
    }
}
