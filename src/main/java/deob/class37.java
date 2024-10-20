package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("al")
public class class37 {

    @ObfuscatedName("al.e")
    public static int[] field790 = new int[5];

    @ObfuscatedName("al.c")
    public static int[][] field791 = new int[5][5000];

    @ObfuscatedName("al.a")
    public static int[] field792 = new int[1000];

    @ObfuscatedName("al.q")
    public static String[] field793 = new String[1000];

    @ObfuscatedName("al.m")
    public static int field794 = 0;

    @ObfuscatedName("al.n")
    public static class15[] field788 = new class15[50];

    @ObfuscatedName("al.f")
    public static Calendar field797 = Calendar.getInstance();

    @ObfuscatedName("al.s")
    public static final String[] field801 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("al.z")
    public static int field799 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("co.y(Ly;I)V")
    public static void method1926(class1 arg0) {
        method3188(arg0, 200000);
    }

    @ObfuscatedName("fq.d(Ly;II)V")
    public static void method3188(class1 arg0, int arg1) {
        Object[] var2 = arg0.field15;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method558(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field591;
        int[] var9 = var4.field599;
        byte var10 = -1;
        field794 = 0;
        try {
            Statics.field796 = new int[var4.field594];
            int var11 = 0;
            Statics.field789 = new String[var4.field595];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field14;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2727;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2728;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2727;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2728;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field12;
                    }
                    Statics.field796[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field789[var12++] = var15;
                }
            }
            int var16 = 0;
            field799 = arg0.field11;
            label3112: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var505 = var8[var7];
                if (var505 < 100) {
                    if (var505 == 0) {
                        field792[var5++] = var9[var7];
                        continue;
                    }
                    if (var505 == 1) {
                        int var17 = var9[var7];
                        field792[var5++] = class176.field2875[var17];
                        continue;
                    }
                    if (var505 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2875[var18] = field792[var5];
                        client.method554(var18);
                        continue;
                    }
                    if (var505 == 3) {
                        field793[var6++] = var4.field593[var7];
                        continue;
                    }
                    if (var505 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var505 == 7) {
                        var5 -= 2;
                        if (field792[var5 + 1] != field792[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var505 == 8) {
                        var5 -= 2;
                        if (field792[var5 + 1] == field792[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var505 == 9) {
                        var5 -= 2;
                        if (field792[var5] < field792[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var505 == 10) {
                        var5 -= 2;
                        if (field792[var5] > field792[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var505 == 21) {
                        if (field794 == 0) {
                            return;
                        }
                        class15 var19 = field788[--field794];
                        var4 = var19.field219;
                        var8 = var4.field591;
                        var9 = var4.field599;
                        var7 = var19.field211;
                        Statics.field796 = var19.field210;
                        Statics.field789 = var19.field213;
                        continue;
                    }
                    if (var505 == 25) {
                        int var20 = var9[var7];
                        field792[var5++] = class176.method2749(var20);
                        continue;
                    }
                    if (var505 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field792[var5];
                        class48 var23 = (class48) class48.field1067.method3425((long) var21);
                        class48 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field1072.method3045(14, var21);
                            class48 var26 = new class48();
                            if (var25 != null) {
                                var26.method953(new class119(var25));
                            }
                            class48.field1067.method3427(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field1068;
                        int var29 = var24.field1070;
                        int var30 = var24.field1066;
                        int var31 = class176.field2873[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class176.field2875[var28] = class176.field2875[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var505 == 31) {
                        var5 -= 2;
                        if (field792[var5] <= field792[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var505 == 32) {
                        var5 -= 2;
                        if (field792[var5] >= field792[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var505 == 33) {
                        field792[var5++] = Statics.field796[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var505 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field796[var10001] = field792[var5];
                        continue;
                    }
                    if (var505 == 35) {
                        field793[var6++] = Statics.field789[var9[var7]];
                        continue;
                    }
                    if (var505 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field789[var10001] = field793[var6];
                        continue;
                    }
                    if (var505 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String var34 = class163.method42(field793, var6, var33);
                        field793[var6++] = var34;
                        continue;
                    }
                    if (var505 == 38) {
                        var5--;
                        continue;
                    }
                    if (var505 == 39) {
                        var6--;
                        continue;
                    }
                    if (var505 == 40) {
                        int var35 = var9[var7];
                        class23 var36 = class23.method558(var35);
                        int[] var37 = new int[var36.field594];
                        String[] var38 = new String[var36.field595];
                        for (int var39 = 0; var39 < var36.field596; var39++) {
                            var37[var39] = field792[var5 - var36.field596 + var39];
                        }
                        for (int var40 = 0; var40 < var36.field597; var40++) {
                            var38[var40] = field793[var6 - var36.field597 + var40];
                        }
                        var5 -= var36.field596;
                        var6 -= var36.field597;
                        class15 var41 = new class15();
                        var41.field219 = var4;
                        var41.field211 = var7;
                        var41.field210 = Statics.field796;
                        var41.field213 = Statics.field789;
                        field788[++field794 - 1] = var41;
                        var4 = var36;
                        var8 = var36.field591;
                        var9 = var36.field599;
                        var7 = -1;
                        Statics.field796 = var37;
                        Statics.field789 = var38;
                        continue;
                    }
                    if (var505 == 42) {
                        field792[var5++] = Statics.field480.method214(var9[var7]);
                        continue;
                    }
                    if (var505 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field480.method217(var10001, field792[var5]);
                        continue;
                    }
                    if (var505 == 44) {
                        int var42 = var9[var7] >> 16;
                        int var43 = var9[var7] & 0xFFFF;
                        var5--;
                        int var44 = field792[var5];
                        if (var44 >= 0 && var44 <= 5000) {
                            field790[var42] = var44;
                            byte var45 = -1;
                            if (var43 == 105) {
                                var45 = 0;
                            }
                            int var46 = 0;
                            while (true) {
                                if (var46 >= var44) {
                                    continue label3112;
                                }
                                field791[var42][var46] = var45;
                                var46++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var505 == 45) {
                        int var47 = var9[var7];
                        var5--;
                        int var48 = field792[var5];
                        if (var48 >= 0 && var48 < field790[var47]) {
                            field792[var5++] = field791[var47][var48];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var505 == 46) {
                        int var49 = var9[var7];
                        var5 -= 2;
                        int var50 = field792[var5];
                        if (var50 >= 0 && var50 < field790[var49]) {
                            field791[var49][var50] = field792[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var505 == 47) {
                        String var51 = Statics.field480.method231(var9[var7]);
                        if (var51 == null) {
                            var51 = "null";
                        }
                        field793[var6++] = var51;
                        continue;
                    }
                    if (var505 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field480.method204(var10001, field793[var6]);
                        continue;
                    }
                }
                boolean var52;
                if (var9[var7] == 1) {
                    var52 = true;
                } else {
                    var52 = false;
                }
                if (var505 < 1000) {
                    if (var505 == 100) {
                        var5 -= 3;
                        int var53 = field792[var5];
                        int var54 = field792[var5 + 1];
                        int var55 = field792[var5 + 2];
                        if (var54 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var56 = class173.method945(var53);
                        if (var56.field2849 == null) {
                            var56.field2849 = new class173[var55 + 1];
                        }
                        if (var56.field2849.length <= var55) {
                            class173[] var57 = new class173[var55 + 1];
                            for (int var58 = 0; var58 < var56.field2849.length; var58++) {
                                var57[var58] = var56.field2849[var58];
                            }
                            var56.field2849 = var57;
                        }
                        if (var55 > 0 && var56.field2849[var55 - 1] == null) {
                            throw new RuntimeException("" + (var55 - 1));
                        }
                        class173 var59 = new class173();
                        var59.field2729 = var54;
                        var59.field2746 = var59.field2727 = var56.field2727;
                        var59.field2728 = var55;
                        var59.field2726 = true;
                        var56.field2849[var55] = var59;
                        if (var52) {
                            Statics.field598 = var59;
                        } else {
                            Statics.field795 = var59;
                        }
                        client.method628(var56);
                        continue;
                    }
                    if (var505 == 101) {
                        class173 var60 = var52 ? Statics.field598 : Statics.field795;
                        class173 var61 = class173.method945(var60.field2727);
                        var61.field2849[var60.field2728] = null;
                        client.method628(var61);
                        continue;
                    }
                    if (var505 == 102) {
                        var5--;
                        class173 var62 = class173.method945(field792[var5]);
                        var62.field2849 = null;
                        client.method628(var62);
                        continue;
                    }
                    if (var505 == 200) {
                        var5 -= 2;
                        int var63 = field792[var5];
                        int var64 = field792[var5 + 1];
                        class173 var65 = class173.method2665(var63, var64);
                        if (var65 != null && var64 != -1) {
                            field792[var5++] = 1;
                            if (var52) {
                                Statics.field598 = var65;
                            } else {
                                Statics.field795 = var65;
                            }
                            continue;
                        }
                        field792[var5++] = 0;
                        continue;
                    }
                    if (var505 == 201) {
                        var5--;
                        class173 var66 = class173.method945(field792[var5]);
                        if (var66 == null) {
                            field792[var5++] = 0;
                        } else {
                            field792[var5++] = 1;
                            if (var52) {
                                Statics.field598 = var66;
                            } else {
                                Statics.field795 = var66;
                            }
                        }
                        continue;
                    }
                } else if (var505 >= 1000 && var505 < 1100 || var505 >= 2000 && var505 < 2100) {
                    int var67 = -1;
                    class173 var68;
                    if (var505 >= 2000) {
                        var505 -= 1000;
                        var5--;
                        var67 = field792[var5];
                        var68 = class173.method945(var67);
                    } else {
                        var68 = var52 ? Statics.field598 : Statics.field795;
                    }
                    if (var505 == 1000) {
                        var5 -= 4;
                        var68.field2823 = field792[var5];
                        var68.field2737 = field792[var5 + 1];
                        var68.field2732 = field792[var5 + 2];
                        var68.field2733 = field792[var5 + 3];
                        client.method628(var68);
                        client.method2271(var68);
                        if (var67 != -1 && var68.field2729 == 0) {
                            client.method892(Statics.field2745[var67 >> 16], var68, false);
                        }
                        continue;
                    }
                    if (var505 == 1001) {
                        var5 -= 4;
                        var68.field2738 = field792[var5];
                        var68.field2739 = field792[var5 + 1];
                        var68.field2730 = field792[var5 + 2];
                        var68.field2735 = field792[var5 + 3];
                        client.method628(var68);
                        client.method2271(var68);
                        if (var67 != -1 && var68.field2729 == 0) {
                            client.method892(Statics.field2745[var67 >> 16], var68, false);
                        }
                        continue;
                    }
                    if (var505 == 1003) {
                        var5--;
                        boolean var69 = field792[var5] == 1;
                        if (var68.field2724 != var69) {
                            var68.field2724 = var69;
                            client.method628(var68);
                        }
                        continue;
                    }
                    if (var505 == 1005) {
                        var5--;
                        var68.field2858 = field792[var5] == 1;
                        continue;
                    }
                    if (var505 == 1006) {
                        var5--;
                        var68.field2774 = field792[var5] == 1;
                        continue;
                    }
                } else if (var505 >= 1100 && var505 < 1200 || var505 >= 2100 && var505 < 2200) {
                    int var70 = -1;
                    class173 var71;
                    if (var505 >= 2000) {
                        var505 -= 1000;
                        var5--;
                        var70 = field792[var5];
                        var71 = class173.method945(var70);
                    } else {
                        var71 = var52 ? Statics.field598 : Statics.field795;
                    }
                    if (var505 == 1100) {
                        var5 -= 2;
                        var71.field2764 = field792[var5];
                        if (var71.field2764 > var71.field2750 - var71.field2825) {
                            var71.field2764 = var71.field2750 - var71.field2825;
                        }
                        if (var71.field2764 < 0) {
                            var71.field2764 = 0;
                        }
                        var71.field2749 = field792[var5 + 1];
                        if (var71.field2749 > var71.field2850 - var71.field2743) {
                            var71.field2749 = var71.field2850 - var71.field2743;
                        }
                        if (var71.field2749 < 0) {
                            var71.field2749 = 0;
                        }
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1101) {
                        var5--;
                        var71.field2798 = field792[var5];
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1102) {
                        var5--;
                        var71.field2756 = field792[var5] == 1;
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1103) {
                        var5--;
                        var71.field2757 = field792[var5];
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1104) {
                        var5--;
                        var71.field2847 = field792[var5];
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1105) {
                        var5--;
                        var71.field2792 = field792[var5];
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1106) {
                        var5--;
                        var71.field2762 = field792[var5];
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1107) {
                        var5--;
                        var71.field2763 = field792[var5] == 1;
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1108) {
                        var71.field2718 = 1;
                        var5--;
                        var71.field2769 = field792[var5];
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1109) {
                        var5 -= 6;
                        var71.field2779 = field792[var5];
                        var71.field2775 = field792[var5 + 1];
                        var71.field2776 = field792[var5 + 2];
                        var71.field2784 = field792[var5 + 3];
                        var71.field2778 = field792[var5 + 4];
                        var71.field2790 = field792[var5 + 5];
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1110) {
                        var5--;
                        int var72 = field792[var5];
                        if (var71.field2751 != var72) {
                            var71.field2751 = var72;
                            var71.field2859 = 0;
                            var71.field2794 = 0;
                            client.method628(var71);
                        }
                        continue;
                    }
                    if (var505 == 1111) {
                        var5--;
                        var71.field2782 = field792[var5] == 1;
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1112) {
                        var6--;
                        String var73 = field793[var6];
                        if (!var73.equals(var71.field2721)) {
                            var71.field2721 = var73;
                            client.method628(var71);
                        }
                        continue;
                    }
                    if (var505 == 1113) {
                        var5--;
                        var71.field2802 = field792[var5];
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1114) {
                        var5 -= 3;
                        var71.field2788 = field792[var5];
                        var71.field2748 = field792[var5 + 1];
                        var71.field2844 = field792[var5 + 2];
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1115) {
                        var5--;
                        var71.field2740 = field792[var5] == 1;
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1116) {
                        var5--;
                        var71.field2752 = field792[var5];
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1117) {
                        var5--;
                        var71.field2765 = field792[var5];
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1118) {
                        var5--;
                        var71.field2766 = field792[var5] == 1;
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1119) {
                        var5--;
                        var71.field2767 = field792[var5] == 1;
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1120) {
                        var5 -= 2;
                        var71.field2750 = field792[var5];
                        var71.field2850 = field792[var5 + 1];
                        client.method628(var71);
                        if (var70 != -1 && var71.field2729 == 0) {
                            client.method892(Statics.field2745[var70 >> 16], var71, false);
                        }
                        continue;
                    }
                    if (var505 == 1121) {
                        client.method106(var71.field2727, var71.field2728);
                        client.field453 = var71;
                        client.method628(var71);
                        continue;
                    }
                    if (var505 == 1122) {
                        var5--;
                        var71.field2761 = field792[var5];
                        client.method628(var71);
                        continue;
                    }
                } else if (var505 >= 1200 && var505 < 1300 || var505 >= 2200 && var505 < 2300) {
                    class173 var74;
                    if (var505 >= 2000) {
                        var505 -= 1000;
                        var5--;
                        var74 = class173.method945(field792[var5]);
                    } else {
                        var74 = var52 ? Statics.field598 : Statics.field795;
                    }
                    client.method628(var74);
                    if (var505 == 1200 || var505 == 1205 || var505 == 1212) {
                        var5 -= 2;
                        int var75 = field792[var5];
                        int var76 = field792[var5 + 1];
                        var74.field2845 = var75;
                        var74.field2846 = var76;
                        class52 var77 = class52.method560(var75);
                        var74.field2776 = var77.field1150;
                        var74.field2784 = var77.field1113;
                        var74.field2778 = var77.field1126;
                        var74.field2779 = var77.field1127;
                        var74.field2775 = var77.field1119;
                        var74.field2790 = var77.field1123;
                        if (var505 == 1205) {
                            var74.field2783 = 0;
                        } else if (var505 == 1212 | var77.field1149 == 1) {
                            var74.field2783 = 1;
                        } else {
                            var74.field2783 = 2;
                        }
                        if (var74.field2780 > 0) {
                            var74.field2790 = var74.field2790 * 32 / var74.field2780;
                        } else if (var74.field2738 > 0) {
                            var74.field2790 = var74.field2790 * 32 / var74.field2738;
                        }
                        continue;
                    }
                    if (var505 == 1201) {
                        var74.field2718 = 2;
                        var5--;
                        var74.field2769 = field792[var5];
                        continue;
                    }
                    if (var505 == 1202) {
                        var74.field2718 = 3;
                        var74.field2769 = Statics.field677.field39.method3216();
                        continue;
                    }
                } else if (var505 >= 1300 && var505 < 1400 || var505 >= 2300 && var505 < 2400) {
                    class173 var78;
                    if (var505 >= 2000) {
                        var505 -= 1000;
                        var5--;
                        var78 = class173.method945(field792[var5]);
                    } else {
                        var78 = var52 ? Statics.field598 : Statics.field795;
                    }
                    if (var505 == 1300) {
                        var5--;
                        int var79 = field792[var5] - 1;
                        if (var79 >= 0 && var79 <= 9) {
                            var6--;
                            var78.method3114(var79, field793[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var505 == 1301) {
                        var5 -= 2;
                        int var80 = field792[var5];
                        int var81 = field792[var5 + 1];
                        var78.field2741 = class173.method2665(var80, var81);
                        continue;
                    }
                    if (var505 == 1302) {
                        var5--;
                        var78.field2803 = field792[var5] == 1;
                        continue;
                    }
                    if (var505 == 1303) {
                        var5--;
                        var78.field2801 = field792[var5];
                        continue;
                    }
                    if (var505 == 1304) {
                        var5--;
                        var78.field2838 = field792[var5];
                        continue;
                    }
                    if (var505 == 1305) {
                        var6--;
                        var78.field2747 = field793[var6];
                        continue;
                    }
                    if (var505 == 1306) {
                        var6--;
                        var78.field2804 = field793[var6];
                        continue;
                    }
                    if (var505 == 1307) {
                        var78.field2799 = null;
                        continue;
                    }
                } else {
                    if (var505 >= 1400 && var505 < 1500 || var505 >= 2400 && var505 < 2500) {
                        class173 var82;
                        if (var505 >= 2000) {
                            var505 -= 1000;
                            var5--;
                            var82 = class173.method945(field792[var5]);
                        } else {
                            var82 = var52 ? Statics.field598 : Statics.field795;
                        }
                        var6--;
                        String var83 = field793[var6];
                        int[] var84 = null;
                        if (var83.length() > 0 && var83.charAt(var83.length() - 1) == 'Y') {
                            var5--;
                            int var85 = field792[var5];
                            if (var85 > 0) {
                                var84 = new int[var85];
                                while (var85-- > 0) {
                                    var5--;
                                    var84[var85] = field792[var5];
                                }
                            }
                            var83 = var83.substring(0, var83.length() - 1);
                        }
                        Object[] var86 = new Object[var83.length() + 1];
                        for (int var87 = var86.length - 1; var87 >= 1; var87--) {
                            if (var83.charAt(var87 - 1) == 's') {
                                var6--;
                                var86[var87] = field793[var6];
                            } else {
                                var5--;
                                var86[var87] = Integer.valueOf(field792[var5]);
                            }
                        }
                        var5--;
                        int var88 = field792[var5];
                        if (var88 == -1) {
                            var86 = null;
                        } else {
                            var86[0] = Integer.valueOf(var88);
                        }
                        if (var505 == 1400) {
                            var82.field2848 = var86;
                        }
                        if (var505 == 1401) {
                            var82.field2841 = var86;
                        }
                        if (var505 == 1402) {
                            var82.field2771 = var86;
                        }
                        if (var505 == 1403) {
                            var82.field2760 = var86;
                        }
                        if (var505 == 1404) {
                            var82.field2813 = var86;
                        }
                        if (var505 == 1405) {
                            var82.field2814 = var86;
                        }
                        if (var505 == 1406) {
                            var82.field2817 = var86;
                        }
                        if (var505 == 1407) {
                            var82.field2818 = var86;
                            var82.field2819 = var84;
                        }
                        if (var505 == 1408) {
                            var82.field2824 = var86;
                        }
                        if (var505 == 1409) {
                            var82.field2772 = var86;
                        }
                        if (var505 == 1410) {
                            var82.field2815 = var86;
                        }
                        if (var505 == 1411) {
                            var82.field2808 = var86;
                        }
                        if (var505 == 1412) {
                            var82.field2805 = var86;
                        }
                        if (var505 == 1414) {
                            var82.field2820 = var86;
                            var82.field2821 = var84;
                        }
                        if (var505 == 1415) {
                            var82.field2822 = var86;
                            var82.field2734 = var84;
                        }
                        if (var505 == 1416) {
                            var82.field2816 = var86;
                        }
                        if (var505 == 1417) {
                            var82.field2826 = var86;
                        }
                        if (var505 == 1418) {
                            var82.field2827 = var86;
                        }
                        if (var505 == 1419) {
                            var82.field2828 = var86;
                        }
                        if (var505 == 1420) {
                            var82.field2829 = var86;
                        }
                        if (var505 == 1421) {
                            var82.field2830 = var86;
                        }
                        if (var505 == 1422) {
                            var82.field2831 = var86;
                        }
                        if (var505 == 1423) {
                            var82.field2832 = var86;
                        }
                        if (var505 == 1424) {
                            var82.field2833 = var86;
                        }
                        if (var505 == 1425) {
                            var82.field2835 = var86;
                        }
                        if (var505 == 1426) {
                            var82.field2836 = var86;
                        }
                        if (var505 == 1427) {
                            var82.field2834 = var86;
                        }
                        var82.field2787 = true;
                        continue;
                    }
                    if (var505 < 1600) {
                        class173 var89 = var52 ? Statics.field598 : Statics.field795;
                        if (var505 == 1500) {
                            field792[var5++] = var89.field2768;
                            continue;
                        }
                        if (var505 == 1501) {
                            field792[var5++] = var89.field2812;
                            continue;
                        }
                        if (var505 == 1502) {
                            field792[var5++] = var89.field2825;
                            continue;
                        }
                        if (var505 == 1503) {
                            field792[var5++] = var89.field2743;
                            continue;
                        }
                        if (var505 == 1504) {
                            field792[var5++] = var89.field2724 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 1505) {
                            field792[var5++] = var89.field2746;
                            continue;
                        }
                    } else if (var505 < 1700) {
                        class173 var90 = var52 ? Statics.field598 : Statics.field795;
                        if (var505 == 1600) {
                            field792[var5++] = var90.field2764;
                            continue;
                        }
                        if (var505 == 1601) {
                            field792[var5++] = var90.field2749;
                            continue;
                        }
                        if (var505 == 1602) {
                            field793[var6++] = var90.field2721;
                            continue;
                        }
                        if (var505 == 1603) {
                            field792[var5++] = var90.field2750;
                            continue;
                        }
                        if (var505 == 1604) {
                            field792[var5++] = var90.field2850;
                            continue;
                        }
                        if (var505 == 1605) {
                            field792[var5++] = var90.field2790;
                            continue;
                        }
                        if (var505 == 1606) {
                            field792[var5++] = var90.field2776;
                            continue;
                        }
                        if (var505 == 1607) {
                            field792[var5++] = var90.field2778;
                            continue;
                        }
                        if (var505 == 1608) {
                            field792[var5++] = var90.field2784;
                            continue;
                        }
                        if (var505 == 1609) {
                            field792[var5++] = var90.field2757;
                            continue;
                        }
                    } else if (var505 < 1800) {
                        class173 var91 = var52 ? Statics.field598 : Statics.field795;
                        if (var505 == 1700) {
                            field792[var5++] = var91.field2845;
                            continue;
                        }
                        if (var505 == 1701) {
                            if (var91.field2845 == -1) {
                                field792[var5++] = 0;
                            } else {
                                field792[var5++] = var91.field2846;
                            }
                            continue;
                        }
                        if (var505 == 1702) {
                            field792[var5++] = var91.field2728;
                            continue;
                        }
                    } else if (var505 < 1900) {
                        class173 var92 = var52 ? Statics.field598 : Statics.field795;
                        if (var505 == 1800) {
                            int[] var93 = field792;
                            int var94 = var5++;
                            int var95 = client.method165(var92);
                            int var96 = var95 >> 11 & 0x3F;
                            var93[var94] = var96;
                            continue;
                        }
                        if (var505 == 1801) {
                            var5--;
                            int var97 = field792[var5];
                            int var506 = var97 - 1;
                            if (var92.field2799 != null && var506 < var92.field2799.length && var92.field2799[var506] != null) {
                                field793[var6++] = var92.field2799[var506];
                                continue;
                            }
                            field793[var6++] = "";
                            continue;
                        }
                        if (var505 == 1802) {
                            if (var92.field2747 == null) {
                                field793[var6++] = "";
                            } else {
                                field793[var6++] = var92.field2747;
                            }
                            continue;
                        }
                    } else if (!(var505 < 1900 || var505 >= 2000) || !(var505 < 2900 || var505 >= 3000)) {
                        class173 var98;
                        if (var505 >= 2000) {
                            var505 -= 1000;
                            var5--;
                            var98 = class173.method945(field792[var5]);
                        } else {
                            var98 = var52 ? Statics.field598 : Statics.field795;
                        }
                        if (var505 == 1927) {
                            if (field799 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var98.field2834 == null) {
                                return;
                            }
                            class1 var99 = new class1();
                            var99.field3 = var98;
                            var99.field15 = var98.field2834;
                            var99.field11 = field799 + 1;
                            client.field489.method3488(arg0);
                            continue;
                        }
                    } else if (var505 < 2600) {
                        var5--;
                        class173 var100 = class173.method945(field792[var5]);
                        if (var505 == 2500) {
                            field792[var5++] = var100.field2768;
                            continue;
                        }
                        if (var505 == 2501) {
                            field792[var5++] = var100.field2812;
                            continue;
                        }
                        if (var505 == 2502) {
                            field792[var5++] = var100.field2825;
                            continue;
                        }
                        if (var505 == 2503) {
                            field792[var5++] = var100.field2743;
                            continue;
                        }
                        if (var505 == 2504) {
                            field792[var5++] = var100.field2724 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 2505) {
                            field792[var5++] = var100.field2746;
                            continue;
                        }
                    } else if (var505 < 2700) {
                        var5--;
                        class173 var101 = class173.method945(field792[var5]);
                        if (var505 == 2600) {
                            field792[var5++] = var101.field2764;
                            continue;
                        }
                        if (var505 == 2601) {
                            field792[var5++] = var101.field2749;
                            continue;
                        }
                        if (var505 == 2602) {
                            field793[var6++] = var101.field2721;
                            continue;
                        }
                        if (var505 == 2603) {
                            field792[var5++] = var101.field2750;
                            continue;
                        }
                        if (var505 == 2604) {
                            field792[var5++] = var101.field2850;
                            continue;
                        }
                        if (var505 == 2605) {
                            field792[var5++] = var101.field2790;
                            continue;
                        }
                        if (var505 == 2606) {
                            field792[var5++] = var101.field2776;
                            continue;
                        }
                        if (var505 == 2607) {
                            field792[var5++] = var101.field2778;
                            continue;
                        }
                        if (var505 == 2608) {
                            field792[var5++] = var101.field2784;
                            continue;
                        }
                        if (var505 == 2609) {
                            field792[var5++] = var101.field2757;
                            continue;
                        }
                    } else if (var505 < 2800) {
                        if (var505 == 2700) {
                            var5--;
                            class173 var102 = class173.method945(field792[var5]);
                            field792[var5++] = var102.field2845;
                            continue;
                        }
                        if (var505 == 2701) {
                            var5--;
                            class173 var103 = class173.method945(field792[var5]);
                            if (var103.field2845 == -1) {
                                field792[var5++] = 0;
                            } else {
                                field792[var5++] = var103.field2846;
                            }
                            continue;
                        }
                        if (var505 == 2702) {
                            var5--;
                            int var104 = field792[var5];
                            class4 var105 = (class4) client.field450.method3459((long) var104);
                            if (var105 == null) {
                                field792[var5++] = 0;
                            } else {
                                field792[var5++] = 1;
                            }
                            continue;
                        }
                        if (var505 == 2706) {
                            field792[var5++] = client.field413;
                            continue;
                        }
                    } else if (var505 < 2900) {
                        var5--;
                        class173 var106 = class173.method945(field792[var5]);
                        if (var505 == 2800) {
                            int[] var107 = field792;
                            int var108 = var5++;
                            int var109 = client.method165(var106);
                            int var110 = var109 >> 11 & 0x3F;
                            var107[var108] = var110;
                            continue;
                        }
                        if (var505 == 2801) {
                            var5--;
                            int var111 = field792[var5];
                            int var507 = var111 - 1;
                            if (var106.field2799 != null && var507 < var106.field2799.length && var106.field2799[var507] != null) {
                                field793[var6++] = var106.field2799[var507];
                                continue;
                            }
                            field793[var6++] = "";
                            continue;
                        }
                        if (var505 == 2802) {
                            if (var106.field2747 == null) {
                                field793[var6++] = "";
                            } else {
                                field793[var6++] = var106.field2747;
                            }
                            continue;
                        }
                    } else if (var505 < 3200) {
                        if (var505 == 3100) {
                            var6--;
                            String var112 = field793[var6];
                            class12.method2628(0, "", var112);
                            continue;
                        }
                        if (var505 == 3101) {
                            var5 -= 2;
                            client.method733(Statics.field677, field792[var5], field792[var5 + 1]);
                            continue;
                        }
                        if (var505 == 3103) {
                            client.method2703();
                            continue;
                        }
                        if (var505 == 3104) {
                            var6--;
                            String var113 = field793[var6];
                            int var114 = 0;
                            boolean var115 = false;
                            boolean var116 = false;
                            int var117 = 0;
                            int var118 = var113.length();
                            int var119 = 0;
                            boolean var121;
                            while (true) {
                                if (var119 >= var118) {
                                    var121 = var116;
                                    break;
                                }
                                label3392: {
                                    char var120 = var113.charAt(var119);
                                    if (var119 == 0) {
                                        if (var120 == '-') {
                                            var115 = true;
                                            break label3392;
                                        }
                                        if (var120 == '+') {
                                            break label3392;
                                        }
                                    }
                                    int var508;
                                    if (var120 >= '0' && var120 <= '9') {
                                        var508 = var120 - '0';
                                    } else if (var120 >= 'A' && var120 <= 'Z') {
                                        var508 = var120 - '7';
                                    } else {
                                        if (var120 < 'a' || var120 > 'z') {
                                            var121 = false;
                                            break;
                                        }
                                        var508 = var120 - 'W';
                                    }
                                    if (var508 >= 10) {
                                        var121 = false;
                                        break;
                                    }
                                    if (var115) {
                                        var508 = -var508;
                                    }
                                    int var122 = var117 * 10 + var508;
                                    if (var122 / 10 != var117) {
                                        var121 = false;
                                        break;
                                    }
                                    var117 = var122;
                                    var116 = true;
                                }
                                var119++;
                            }
                            if (var121) {
                                int var124 = class163.method708(var113, 10, true);
                                var114 = var124;
                            }
                            client.field337.method2574(97);
                            client.field337.method2423(var114);
                            continue;
                        }
                        if (var505 == 3105) {
                            var6--;
                            String var125 = field793[var6];
                            client.field337.method2574(121);
                            client.field337.method2354(var125.length() + 1);
                            client.field337.method2372(var125);
                            continue;
                        }
                        if (var505 == 3106) {
                            var6--;
                            String var126 = field793[var6];
                            client.field337.method2574(54);
                            client.field337.method2354(var126.length() + 1);
                            client.field337.method2372(var126);
                            continue;
                        }
                        if (var505 == 3107) {
                            var5--;
                            int var127 = field792[var5];
                            var6--;
                            String var128 = field793[var6];
                            int var129 = class33.field750;
                            int[] var130 = class33.field751;
                            boolean var131 = false;
                            for (int var132 = 0; var132 < var129; var132++) {
                                class3 var133 = client.field412[var130[var132]];
                                if (var133 != null && Statics.field677 != var133 && var133.field38 != null && var133.field38.equalsIgnoreCase(var128)) {
                                    if (var127 == 1) {
                                        client.field337.method2574(45);
                                        client.field337.method2351(0);
                                        client.field337.method2360(var130[var132]);
                                    } else if (var127 == 4) {
                                        client.field337.method2574(195);
                                        client.field337.method2354(0);
                                        client.field337.method2359(var130[var132]);
                                    } else if (var127 == 6) {
                                        client.field337.method2574(77);
                                        client.field337.method2351(0);
                                        client.field337.method2358(var130[var132]);
                                    } else if (var127 == 7) {
                                        client.field337.method2574(239);
                                        client.field337.method2351(0);
                                        client.field337.method2360(var130[var132]);
                                    }
                                    var131 = true;
                                    break;
                                }
                            }
                            if (!var131) {
                                class12.method2628(4, "", class157.field2442 + var128);
                            }
                            continue;
                        }
                        if (var505 == 3108) {
                            var5 -= 3;
                            int var134 = field792[var5];
                            int var135 = field792[var5 + 1];
                            int var136 = field792[var5 + 2];
                            class173 var137 = class173.method945(var136);
                            client.method2251(var137, var134, var135);
                            continue;
                        }
                        if (var505 == 3109) {
                            var5 -= 2;
                            int var138 = field792[var5];
                            int var139 = field792[var5 + 1];
                            class173 var140 = var52 ? Statics.field598 : Statics.field795;
                            client.method2251(var140, var138, var139);
                            continue;
                        }
                        if (var505 == 3110) {
                            var5--;
                            Statics.field319 = field792[var5] == 1;
                            continue;
                        }
                        if (var505 == 3111) {
                            field792[var5++] = Statics.field1549.field144 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3112) {
                            var5--;
                            Statics.field1549.field144 = field792[var5] == 1;
                            class9.method38();
                            continue;
                        }
                        if (var505 == 3113) {
                            var6--;
                            String var141 = field793[var6];
                            var5--;
                            boolean var142 = field792[var5] == 1;
                            class138.method2244(var141, var142, "openjs", false);
                            continue;
                        }
                        if (var505 == 3115) {
                            var5--;
                            int var143 = field792[var5];
                            client.field337.method2574(23);
                            client.field337.method2312(var143);
                            continue;
                        }
                        if (var505 == 3116) {
                            var5--;
                            int var144 = field792[var5];
                            var6 -= 2;
                            String var145 = field793[var6];
                            String var146 = field793[var6 + 1];
                            if (var145.length() <= 500 && var146.length() <= 500) {
                                client.field337.method2574(50);
                                client.field337.method2312(1 + class119.method636(var145) + class119.method636(var146));
                                client.field337.method2372(var146);
                                client.field337.method2372(var145);
                                client.field337.method2350(var144);
                            }
                            continue;
                        }
                    } else if (var505 < 3300) {
                        if (var505 == 3200) {
                            var5 -= 3;
                            int var147 = field792[var5];
                            int var148 = field792[var5 + 1];
                            int var149 = field792[var5 + 2];
                            if (client.field528 != 0 && var148 != 0 && client.field550 < 50) {
                                client.field533[client.field550] = var147;
                                client.field534[client.field550] = var148;
                                client.field542[client.field550] = var149;
                                client.field469[client.field550] = null;
                                client.field294[client.field550] = 0;
                                client.field550++;
                            }
                            continue;
                        }
                        if (var505 == 3201) {
                            var5--;
                            client.method2908(field792[var5]);
                            continue;
                        }
                        if (var505 == 3202) {
                            var5 -= 2;
                            Statics.method2909(field792[var5], field792[var5 + 1]);
                            continue;
                        }
                    } else if (var505 < 3400) {
                        if (var505 == 3300) {
                            field792[var5++] = client.field303;
                            continue;
                        }
                        if (var505 == 3301) {
                            var5 -= 2;
                            int var150 = field792[var5];
                            int var151 = field792[var5 + 1];
                            int[] var152 = field792;
                            int var153 = var5++;
                            class16 var154 = (class16) class16.field228.method3459((long) var150);
                            int var155;
                            if (var154 == null) {
                                var155 = -1;
                            } else if (var151 >= 0 && var151 < var154.field224.length) {
                                var155 = var154.field224[var151];
                            } else {
                                var155 = -1;
                            }
                            var152[var153] = var155;
                            continue;
                        }
                        if (var505 == 3302) {
                            var5 -= 2;
                            int var156 = field792[var5];
                            int var157 = field792[var5 + 1];
                            field792[var5++] = class16.method586(var156, var157);
                            continue;
                        }
                        if (var505 == 3303) {
                            var5 -= 2;
                            int var158 = field792[var5];
                            int var159 = field792[var5 + 1];
                            int[] var160 = field792;
                            int var161 = var5++;
                            class16 var162 = (class16) class16.field228.method3459((long) var158);
                            int var163;
                            if (var162 == null) {
                                var163 = 0;
                            } else if (var159 == -1) {
                                var163 = 0;
                            } else {
                                int var164 = 0;
                                for (int var165 = 0; var165 < var162.field225.length; var165++) {
                                    if (var162.field224[var165] == var159) {
                                        var164 += var162.field225[var165];
                                    }
                                }
                                var163 = var164;
                            }
                            var160[var161] = var163;
                            continue;
                        }
                        if (var505 == 3304) {
                            var5--;
                            int var166 = field792[var5];
                            int[] var167 = field792;
                            int var168 = var5++;
                            class51 var169 = (class51) class51.field1100.method3425((long) var166);
                            class51 var170;
                            if (var169 == null) {
                                byte[] var171 = Statics.field1106.method3045(5, var166);
                                class51 var172 = new class51();
                                if (var171 != null) {
                                    var172.method983(new class119(var171));
                                }
                                class51.field1100.method3427(var172, (long) var166);
                                var170 = var172;
                            } else {
                                var170 = var169;
                            }
                            var167[var168] = var170.field1099;
                            continue;
                        }
                        if (var505 == 3305) {
                            var5--;
                            int var173 = field792[var5];
                            field792[var5++] = client.field426[var173];
                            continue;
                        }
                        if (var505 == 3306) {
                            var5--;
                            int var174 = field792[var5];
                            field792[var5++] = client.field427[var174];
                            continue;
                        }
                        if (var505 == 3307) {
                            var5--;
                            int var175 = field792[var5];
                            field792[var5++] = client.field428[var175];
                            continue;
                        }
                        if (var505 == 3308) {
                            int var176 = Statics.field27;
                            int var177 = (Statics.field677.field839 >> 7) + Statics.field941;
                            int var178 = (Statics.field677.field803 >> 7) + Statics.field23;
                            field792[var5++] = (var176 << 28) + (var177 << 14) + var178;
                            continue;
                        }
                        if (var505 == 3309) {
                            var5--;
                            int var179 = field792[var5];
                            field792[var5++] = var179 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var505 == 3310) {
                            var5--;
                            int var180 = field792[var5];
                            field792[var5++] = var180 >> 28;
                            continue;
                        }
                        if (var505 == 3311) {
                            var5--;
                            int var181 = field792[var5];
                            field792[var5++] = var181 & 0x3FFF;
                            continue;
                        }
                        if (var505 == 3312) {
                            field792[var5++] = client.field296 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3313) {
                            var5 -= 2;
                            int var182 = field792[var5] + 32768;
                            int var183 = field792[var5 + 1];
                            int[] var184 = field792;
                            int var185 = var5++;
                            class16 var186 = (class16) class16.field228.method3459((long) var182);
                            int var187;
                            if (var186 == null) {
                                var187 = -1;
                            } else if (var183 >= 0 && var183 < var186.field224.length) {
                                var187 = var186.field224[var183];
                            } else {
                                var187 = -1;
                            }
                            var184[var185] = var187;
                            continue;
                        }
                        if (var505 == 3314) {
                            var5 -= 2;
                            int var188 = field792[var5] + 32768;
                            int var189 = field792[var5 + 1];
                            field792[var5++] = class16.method586(var188, var189);
                            continue;
                        }
                        if (var505 == 3315) {
                            var5 -= 2;
                            int var190 = field792[var5] + 32768;
                            int var191 = field792[var5 + 1];
                            int[] var192 = field792;
                            int var193 = var5++;
                            class16 var194 = (class16) class16.field228.method3459((long) var190);
                            int var195;
                            if (var194 == null) {
                                var195 = 0;
                            } else if (var191 == -1) {
                                var195 = 0;
                            } else {
                                int var196 = 0;
                                for (int var197 = 0; var197 < var194.field225.length; var197++) {
                                    if (var194.field224[var197] == var191) {
                                        var196 += var194.field225[var197];
                                    }
                                }
                                var195 = var196;
                            }
                            var192[var193] = var195;
                            continue;
                        }
                        if (var505 == 3316) {
                            if (client.field295 >= 2) {
                                field792[var5++] = client.field295;
                            } else {
                                field792[var5++] = 0;
                            }
                            continue;
                        }
                        if (var505 == 3317) {
                            field792[var5++] = client.field548;
                            continue;
                        }
                        if (var505 == 3318) {
                            field792[var5++] = client.field293;
                            continue;
                        }
                        if (var505 == 3321) {
                            field792[var5++] = client.field560;
                            continue;
                        }
                        if (var505 == 3322) {
                            field792[var5++] = client.field455;
                            continue;
                        }
                        if (var505 == 3323) {
                            if (client.field306) {
                                field792[var5++] = 1;
                            } else {
                                field792[var5++] = 0;
                            }
                            continue;
                        }
                        if (var505 == 3324) {
                            field792[var5++] = client.field409;
                            continue;
                        }
                    } else if (var505 < 3500) {
                        if (var505 == 3400) {
                            var5 -= 2;
                            int var198 = field792[var5];
                            int var199 = field792[var5 + 1];
                            class49 var200 = class49.method2874(var198);
                            if (var200.field1075 != 's') {
                            }
                            for (int var201 = 0; var201 < var200.field1076; var201++) {
                                if (var200.field1079[var201] == var199) {
                                    field793[var6++] = var200.field1080[var201];
                                    var200 = null;
                                    break;
                                }
                            }
                            if (var200 != null) {
                                field793[var6++] = var200.field1077;
                            }
                            continue;
                        }
                        if (var505 == 3408) {
                            var5 -= 4;
                            int var202 = field792[var5];
                            int var203 = field792[var5 + 1];
                            int var204 = field792[var5 + 2];
                            int var205 = field792[var5 + 3];
                            class49 var206 = class49.method2874(var204);
                            if (var206.field1073 == var202 && var206.field1075 == var203) {
                                for (int var207 = 0; var207 < var206.field1076; var207++) {
                                    if (var206.field1079[var207] == var205) {
                                        if (var203 == 115) {
                                            field793[var6++] = var206.field1080[var207];
                                        } else {
                                            field792[var5++] = var206.field1081[var207];
                                        }
                                        var206 = null;
                                        break;
                                    }
                                }
                                if (var206 != null) {
                                    if (var203 == 115) {
                                        field793[var6++] = var206.field1077;
                                    } else {
                                        field792[var5++] = var206.field1078;
                                    }
                                }
                                continue;
                            }
                            if (var203 == 115) {
                                field793[var6++] = "null";
                            } else {
                                field792[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var505 < 3700) {
                        if (var505 == 3600) {
                            if (client.field559 == 0) {
                                field792[var5++] = -2;
                            } else if (client.field559 == 1) {
                                field792[var5++] = -1;
                            } else {
                                field792[var5++] = client.field419;
                            }
                            continue;
                        }
                        if (var505 == 3601) {
                            var5--;
                            int var208 = field792[var5];
                            if (client.field559 == 2 && var208 < client.field419) {
                                field793[var6++] = client.field369[var208].field253;
                                field793[var6++] = client.field369[var208].field254;
                                continue;
                            }
                            field793[var6++] = "";
                            field793[var6++] = "";
                            continue;
                        }
                        if (var505 == 3602) {
                            var5--;
                            int var209 = field792[var5];
                            if (client.field559 == 2 && var209 < client.field419) {
                                field792[var5++] = client.field369[var209].field260;
                                continue;
                            }
                            field792[var5++] = 0;
                            continue;
                        }
                        if (var505 == 3603) {
                            var5--;
                            int var210 = field792[var5];
                            if (client.field559 == 2 && var210 < client.field419) {
                                field792[var5++] = client.field369[var210].field259;
                                continue;
                            }
                            field792[var5++] = 0;
                            continue;
                        }
                        if (var505 == 3604) {
                            var6--;
                            String var211 = field793[var6];
                            var5--;
                            int var212 = field792[var5];
                            client.field337.method2574(10);
                            client.field337.method2354(class119.method636(var211) + 1);
                            client.field337.method2354(var212);
                            client.field337.method2372(var211);
                            continue;
                        }
                        if (var505 == 3605) {
                            var6--;
                            String var213 = field793[var6];
                            if (var213 == null) {
                                continue;
                            }
                            if ((client.field419 < 200 || client.field414 == 1) && client.field419 < 400) {
                                String var214 = class164.method171(var213, Statics.field2000);
                                if (var214 == null) {
                                    continue;
                                }
                                for (int var215 = 0; var215 < client.field419; var215++) {
                                    class18 var216 = client.field369[var215];
                                    String var217 = class164.method171(var216.field253, Statics.field2000);
                                    if (var217 != null && var217.equals(var214)) {
                                        class12.method2628(30, "", var213 + class157.field2498);
                                        continue label3112;
                                    }
                                    if (var216.field254 != null) {
                                        String var218 = class164.method171(var216.field254, Statics.field2000);
                                        if (var218 != null && var218.equals(var214)) {
                                            class12.method2628(30, "", var213 + class157.field2498);
                                            continue label3112;
                                        }
                                    }
                                }
                                for (int var219 = 0; var219 < client.field562; var219++) {
                                    class8 var220 = client.field563[var219];
                                    String var221 = class164.method171(var220.field138, Statics.field2000);
                                    if (var221 != null && var221.equals(var214)) {
                                        class12.method2628(30, "", class157.field2465 + var213 + class157.field2466);
                                        continue label3112;
                                    }
                                    if (var220.field128 != null) {
                                        String var222 = class164.method171(var220.field128, Statics.field2000);
                                        if (var222 != null && var222.equals(var214)) {
                                            class12.method2628(30, "", class157.field2465 + var213 + class157.field2466);
                                            continue label3112;
                                        }
                                    }
                                }
                                if (class164.method171(Statics.field677.field38, Statics.field2000).equals(var214)) {
                                    class12.method2628(30, "", class157.field2360);
                                } else {
                                    client.field337.method2574(233);
                                    client.field337.method2354(class119.method636(var213));
                                    client.field337.method2372(var213);
                                }
                                continue;
                            }
                            class12.method2628(30, "", class157.field2459);
                            continue;
                        }
                        if (var505 == 3606) {
                            var6--;
                            String var223 = field793[var6];
                            if (var223 == null) {
                                continue;
                            }
                            String var224 = class164.method171(var223, Statics.field2000);
                            if (var224 == null) {
                                continue;
                            }
                            int var225 = 0;
                            while (true) {
                                if (var225 >= client.field419) {
                                    continue label3112;
                                }
                                class18 var226 = client.field369[var225];
                                String var227 = var226.field253;
                                String var228 = class164.method171(var227, Statics.field2000);
                                if (Statics.method2026(var223, var224, var227, var228)) {
                                    client.field419--;
                                    for (int var229 = var225; var229 < client.field419; var229++) {
                                        client.field369[var229] = client.field369[var229 + 1];
                                    }
                                    client.field329 = client.field357;
                                    client.field337.method2574(186);
                                    client.field337.method2354(class119.method636(var223));
                                    client.field337.method2372(var223);
                                    continue label3112;
                                }
                                var225++;
                            }
                        }
                        if (var505 == 3607) {
                            var6--;
                            String var230 = field793[var6];
                            client.method2248(var230, false);
                            continue;
                        }
                        if (var505 == 3608) {
                            var6--;
                            String var231 = field793[var6];
                            if (var231 == null) {
                                continue;
                            }
                            String var232 = class164.method171(var231, Statics.field2000);
                            if (var232 == null) {
                                continue;
                            }
                            int var233 = 0;
                            while (true) {
                                if (var233 >= client.field562) {
                                    continue label3112;
                                }
                                class8 var234 = client.field563[var233];
                                String var235 = var234.field138;
                                String var236 = class164.method171(var235, Statics.field2000);
                                if (Statics.method2026(var231, var232, var235, var236)) {
                                    client.field562--;
                                    for (int var237 = var233; var237 < client.field562; var237++) {
                                        client.field563[var237] = client.field563[var237 + 1];
                                    }
                                    client.field329 = client.field357;
                                    client.field337.method2574(143);
                                    client.field337.method2354(class119.method636(var231));
                                    client.field337.method2372(var231);
                                    continue label3112;
                                }
                                var233++;
                            }
                        }
                        if (var505 == 3609) {
                            var6--;
                            String var238 = field793[var6];
                            class152[] var239 = class152.method2875();
                            for (int var240 = 0; var240 < var239.length; var240++) {
                                class152 var241 = var239[var240];
                                if (var241.field2237 != -1) {
                                    int var243 = var241.field2237;
                                    String var244 = "<img=" + var243 + ">";
                                    if (var238.startsWith(var244)) {
                                        var238 = var238.substring(6 + Integer.toString(var241.field2237).length());
                                        break;
                                    }
                                }
                            }
                            field792[var5++] = client.method192(var238, false) ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3611) {
                            if (client.field517 == null) {
                                field793[var6++] = "";
                                continue;
                            }
                            String[] var245 = field793;
                            int var246 = var6++;
                            String var247 = client.field517;
                            long var248 = 0L;
                            int var250 = var247.length();
                            for (int var251 = 0; var251 < var250; var251++) {
                                var248 *= 37L;
                                char var252 = var247.charAt(var251);
                                if (var252 >= 'A' && var252 <= 'Z') {
                                    var248 += (long) (var252 + 1 - 65);
                                } else if (var252 >= 'a' && var252 <= 'z') {
                                    var248 += (long) (var252 + 1 - 97);
                                } else if (var252 >= '0' && var252 <= '9') {
                                    var248 += (long) (var252 + 27 - 48);
                                }
                                if (var248 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var248 % 37L == 0L && var248 != 0L) {
                                var248 /= 37L;
                            }
                            String var255 = class162.method1554(var248);
                            if (var255 == null) {
                                var255 = "";
                            }
                            var245[var246] = var255;
                            continue;
                        }
                        if (var505 == 3612) {
                            if (client.field517 == null) {
                                field792[var5++] = 0;
                            } else {
                                field792[var5++] = Statics.field1543;
                            }
                            continue;
                        }
                        if (var505 == 3613) {
                            var5--;
                            int var257 = field792[var5];
                            if (client.field517 != null && var257 < Statics.field1543) {
                                field793[var6++] = Statics.field179[var257].field629;
                                continue;
                            }
                            field793[var6++] = "";
                            continue;
                        }
                        if (var505 == 3614) {
                            var5--;
                            int var258 = field792[var5];
                            if (client.field517 != null && var258 < Statics.field1543) {
                                field792[var5++] = Statics.field179[var258].field627;
                                continue;
                            }
                            field792[var5++] = 0;
                            continue;
                        }
                        if (var505 == 3615) {
                            var5--;
                            int var259 = field792[var5];
                            if (client.field517 != null && var259 < Statics.field1543) {
                                field792[var5++] = Statics.field179[var259].field625;
                                continue;
                            }
                            field792[var5++] = 0;
                            continue;
                        }
                        if (var505 == 3616) {
                            field792[var5++] = Statics.field1048;
                            continue;
                        }
                        if (var505 == 3617) {
                            var6--;
                            String var260 = field793[var6];
                            if (Statics.field179 != null) {
                                client.field337.method2574(228);
                                client.field337.method2354(class119.method636(var260));
                                client.field337.method2372(var260);
                            }
                            continue;
                        }
                        if (var505 == 3618) {
                            field792[var5++] = Statics.field173;
                            continue;
                        }
                        if (var505 == 3619) {
                            var6--;
                            String var261 = field793[var6];
                            if (!var261.equals("")) {
                                client.field337.method2574(134);
                                client.field337.method2354(class119.method636(var261));
                                client.field337.method2372(var261);
                            }
                            continue;
                        }
                        if (var505 == 3620) {
                            client.field337.method2574(134);
                            client.field337.method2354(0);
                            continue;
                        }
                        if (var505 == 3621) {
                            if (client.field559 == 0) {
                                field792[var5++] = -1;
                            } else {
                                field792[var5++] = client.field562;
                            }
                            continue;
                        }
                        if (var505 == 3622) {
                            var5--;
                            int var262 = field792[var5];
                            if (client.field559 != 0 && var262 < client.field562) {
                                field793[var6++] = client.field563[var262].field138;
                                field793[var6++] = client.field563[var262].field128;
                                continue;
                            }
                            field793[var6++] = "";
                            field793[var6++] = "";
                            continue;
                        }
                        if (var505 == 3623) {
                            String var263;
                            label2802: {
                                var6--;
                                var263 = field793[var6];
                                String var265 = "<img=0>";
                                if (!var263.startsWith(var265)) {
                                    String var267 = "<img=1>";
                                    if (!var263.startsWith(var267)) {
                                        break label2802;
                                    }
                                }
                                var263 = var263.substring(7);
                            }
                            field792[var5++] = client.method187(var263) ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3624) {
                            var5--;
                            int var268 = field792[var5];
                            if (Statics.field179 != null && var268 < Statics.field1543 && Statics.field179[var268].field629.equalsIgnoreCase(Statics.field677.field38)) {
                                field792[var5++] = 1;
                                continue;
                            }
                            field792[var5++] = 0;
                            continue;
                        }
                        if (var505 == 3625) {
                            if (client.field518 == null) {
                                field793[var6++] = "";
                                continue;
                            }
                            String[] var269 = field793;
                            int var270 = var6++;
                            String var271 = client.field518;
                            long var272 = 0L;
                            int var274 = var271.length();
                            for (int var275 = 0; var275 < var274; var275++) {
                                var272 *= 37L;
                                char var276 = var271.charAt(var275);
                                if (var276 >= 'A' && var276 <= 'Z') {
                                    var272 += (long) (var276 + 1 - 65);
                                } else if (var276 >= 'a' && var276 <= 'z') {
                                    var272 += (long) (var276 + 1 - 97);
                                } else if (var276 >= '0' && var276 <= '9') {
                                    var272 += (long) (var276 + 27 - 48);
                                }
                                if (var272 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var272 % 37L == 0L && var272 != 0L) {
                                var272 /= 37L;
                            }
                            String var279 = class162.method1554(var272);
                            if (var279 == null) {
                                var279 = "";
                            }
                            var269[var270] = var279;
                            continue;
                        }
                    } else if (var505 < 4000) {
                        if (var505 == 3903) {
                            var5--;
                            int var281 = field792[var5];
                            field792[var5++] = client.field567[var281].method3668();
                            continue;
                        }
                        if (var505 == 3904) {
                            var5--;
                            int var282 = field792[var5];
                            field792[var5++] = client.field567[var282].field3145;
                            continue;
                        }
                        if (var505 == 3905) {
                            var5--;
                            int var283 = field792[var5];
                            field792[var5++] = client.field567[var283].field3144;
                            continue;
                        }
                        if (var505 == 3906) {
                            var5--;
                            int var284 = field792[var5];
                            field792[var5++] = client.field567[var284].field3150;
                            continue;
                        }
                        if (var505 == 3907) {
                            var5--;
                            int var285 = field792[var5];
                            field792[var5++] = client.field567[var285].field3148;
                            continue;
                        }
                        if (var505 == 3908) {
                            var5--;
                            int var286 = field792[var5];
                            field792[var5++] = client.field567[var286].field3149;
                            continue;
                        }
                        if (var505 == 3910) {
                            var5--;
                            int var287 = field792[var5];
                            int var288 = client.field567[var287].method3667();
                            field792[var5++] = var288 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3911) {
                            var5--;
                            int var289 = field792[var5];
                            int var290 = client.field567[var289].method3667();
                            field792[var5++] = var290 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3912) {
                            var5--;
                            int var291 = field792[var5];
                            int var292 = client.field567[var291].method3667();
                            field792[var5++] = var292 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3913) {
                            var5--;
                            int var293 = field792[var5];
                            int var294 = client.field567[var293].method3667();
                            field792[var5++] = var294 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3914) {
                            var5--;
                            boolean var295 = field792[var5] == 1;
                            if (Statics.field68 != null) {
                                Statics.field68.method3687(class221.field3151, var295);
                            }
                            continue;
                        }
                        if (var505 == 3915) {
                            var5--;
                            boolean var296 = field792[var5] == 1;
                            if (Statics.field68 != null) {
                                Statics.field68.method3687(class221.field3153, var296);
                            }
                            continue;
                        }
                        if (var505 == 3916) {
                            var5 -= 2;
                            boolean var297 = field792[var5] == 1;
                            boolean var298 = field792[var5 + 1] == 1;
                            if (Statics.field68 != null) {
                                Statics.field68.method3687(new class22(var298), var297);
                            }
                            continue;
                        }
                        if (var505 == 3917) {
                            var5--;
                            boolean var299 = field792[var5] == 1;
                            if (Statics.field68 != null) {
                                Statics.field68.method3687(class221.field3152, var299);
                            }
                            continue;
                        }
                        if (var505 == 3918) {
                            var5--;
                            boolean var300 = field792[var5] == 1;
                            if (Statics.field68 != null) {
                                Statics.field68.method3687(class221.field3155, var300);
                            }
                            continue;
                        }
                        if (var505 == 3919) {
                            field792[var5++] = Statics.field68 == null ? 0 : Statics.field68.field3156.size();
                            continue;
                        }
                        if (var505 == 3920) {
                            var5--;
                            int var301 = field792[var5];
                            class214 var302 = (class214) Statics.field68.field3156.get(var301);
                            field792[var5++] = var302.field3124;
                            continue;
                        }
                        if (var505 == 3921) {
                            var5--;
                            int var303 = field792[var5];
                            class214 var304 = (class214) Statics.field68.field3156.get(var303);
                            field793[var6++] = var304.method3621();
                            continue;
                        }
                        if (var505 == 3922) {
                            var5--;
                            int var305 = field792[var5];
                            class214 var306 = (class214) Statics.field68.field3156.get(var305);
                            field793[var6++] = var306.method3624();
                            continue;
                        }
                        if (var505 == 3923) {
                            var5--;
                            int var307 = field792[var5];
                            class214 var308 = (class214) Statics.field68.field3156.get(var307);
                            long var309 = class115.method671() - Statics.field2874 - var308.field3121;
                            int var311 = (int) (var309 / 3600000L);
                            int var312 = (int) ((var309 - (long) (var311 * 3600000)) / 60000L);
                            int var313 = (int) ((var309 - (long) (var311 * 3600000) - (long) (var312 * 60000)) / 1000L);
                            String var314 = var311 + ":" + var312 / 10 + var312 % 10 + ":" + var313 / 10 + var313 % 10;
                            field793[var6++] = var314;
                            continue;
                        }
                        if (var505 == 3924) {
                            var5--;
                            int var315 = field792[var5];
                            class214 var316 = (class214) Statics.field68.field3156.get(var315);
                            field792[var5++] = var316.field3123.field3150;
                            continue;
                        }
                        if (var505 == 3925) {
                            var5--;
                            int var317 = field792[var5];
                            class214 var318 = (class214) Statics.field68.field3156.get(var317);
                            field792[var5++] = var318.field3123.field3144;
                            continue;
                        }
                        if (var505 == 3926) {
                            var5--;
                            int var319 = field792[var5];
                            class214 var320 = (class214) Statics.field68.field3156.get(var319);
                            field792[var5++] = var320.field3123.field3145;
                            continue;
                        }
                    } else if (var505 < 4100) {
                        if (var505 == 4000) {
                            var5 -= 2;
                            int var321 = field792[var5];
                            int var322 = field792[var5 + 1];
                            field792[var5++] = var321 + var322;
                            continue;
                        }
                        if (var505 == 4001) {
                            var5 -= 2;
                            int var323 = field792[var5];
                            int var324 = field792[var5 + 1];
                            field792[var5++] = var323 - var324;
                            continue;
                        }
                        if (var505 == 4002) {
                            var5 -= 2;
                            int var325 = field792[var5];
                            int var326 = field792[var5 + 1];
                            field792[var5++] = var325 * var326;
                            continue;
                        }
                        if (var505 == 4003) {
                            var5 -= 2;
                            int var327 = field792[var5];
                            int var328 = field792[var5 + 1];
                            field792[var5++] = var327 / var328;
                            continue;
                        }
                        if (var505 == 4004) {
                            var5--;
                            int var329 = field792[var5];
                            field792[var5++] = (int) (Math.random() * (double) var329);
                            continue;
                        }
                        if (var505 == 4005) {
                            var5--;
                            int var330 = field792[var5];
                            field792[var5++] = (int) (Math.random() * (double) (var330 + 1));
                            continue;
                        }
                        if (var505 == 4006) {
                            var5 -= 5;
                            int var331 = field792[var5];
                            int var332 = field792[var5 + 1];
                            int var333 = field792[var5 + 2];
                            int var334 = field792[var5 + 3];
                            int var335 = field792[var5 + 4];
                            field792[var5++] = (var332 - var331) * (var335 - var333) / (var334 - var333) + var331;
                            continue;
                        }
                        if (var505 == 4007) {
                            var5 -= 2;
                            int var336 = field792[var5];
                            int var337 = field792[var5 + 1];
                            field792[var5++] = var336 * var337 / 100 + var336;
                            continue;
                        }
                        if (var505 == 4008) {
                            var5 -= 2;
                            int var338 = field792[var5];
                            int var339 = field792[var5 + 1];
                            field792[var5++] = var338 | 0x1 << var339;
                            continue;
                        }
                        if (var505 == 4009) {
                            var5 -= 2;
                            int var340 = field792[var5];
                            int var341 = field792[var5 + 1];
                            field792[var5++] = var340 & -1 - (0x1 << var341);
                            continue;
                        }
                        if (var505 == 4010) {
                            var5 -= 2;
                            int var342 = field792[var5];
                            int var343 = field792[var5 + 1];
                            field792[var5++] = (var342 & 0x1 << var343) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var505 == 4011) {
                            var5 -= 2;
                            int var344 = field792[var5];
                            int var345 = field792[var5 + 1];
                            field792[var5++] = var344 % var345;
                            continue;
                        }
                        if (var505 == 4012) {
                            var5 -= 2;
                            int var346 = field792[var5];
                            int var347 = field792[var5 + 1];
                            if (var346 == 0) {
                                field792[var5++] = 0;
                            } else {
                                field792[var5++] = (int) Math.pow((double) var346, (double) var347);
                            }
                            continue;
                        }
                        if (var505 == 4013) {
                            var5 -= 2;
                            int var348 = field792[var5];
                            int var349 = field792[var5 + 1];
                            if (var348 == 0) {
                                field792[var5++] = 0;
                            } else if (var349 == 0) {
                                field792[var5++] = Integer.MAX_VALUE;
                            } else {
                                field792[var5++] = (int) Math.pow((double) var348, 1.0D / (double) var349);
                            }
                            continue;
                        }
                        if (var505 == 4014) {
                            var5 -= 2;
                            int var350 = field792[var5];
                            int var351 = field792[var5 + 1];
                            field792[var5++] = var350 & var351;
                            continue;
                        }
                        if (var505 == 4015) {
                            var5 -= 2;
                            int var352 = field792[var5];
                            int var353 = field792[var5 + 1];
                            field792[var5++] = var352 | var353;
                            continue;
                        }
                    } else if (var505 < 4200) {
                        if (var505 == 4100) {
                            var6--;
                            String var354 = field793[var6];
                            var5--;
                            int var355 = field792[var5];
                            field793[var6++] = var354 + var355;
                            continue;
                        }
                        if (var505 == 4101) {
                            var6 -= 2;
                            String var356 = field793[var6];
                            String var357 = field793[var6 + 1];
                            field793[var6++] = var356 + var357;
                            continue;
                        }
                        if (var505 == 4102) {
                            var6--;
                            String var358 = field793[var6];
                            var5--;
                            int var359 = field792[var5];
                            field793[var6++] = var358 + class163.method2615(var359, true);
                            continue;
                        }
                        if (var505 == 4103) {
                            var6--;
                            String var360 = field793[var6];
                            field793[var6++] = var360.toLowerCase();
                            continue;
                        }
                        if (var505 == 4104) {
                            var5--;
                            int var361 = field792[var5];
                            long var362 = ((long) var361 + 11745L) * 86400000L;
                            field797.setTime(new Date(var362));
                            int var364 = field797.get(5);
                            int var365 = field797.get(2);
                            int var366 = field797.get(1);
                            field793[var6++] = var364 + "-" + field801[var365] + "-" + var366;
                            continue;
                        }
                        if (var505 == 4105) {
                            var6 -= 2;
                            String var367 = field793[var6];
                            String var368 = field793[var6 + 1];
                            if (Statics.field677.field39 != null && Statics.field677.field39.field2887) {
                                field793[var6++] = var368;
                                continue;
                            }
                            field793[var6++] = var367;
                            continue;
                        }
                        if (var505 == 4106) {
                            var5--;
                            int var369 = field792[var5];
                            field793[var6++] = Integer.toString(var369);
                            continue;
                        }
                        if (var505 == 4107) {
                            var6 -= 2;
                            field792[var5++] = class163.method2630(class166.method942(field793[var6], field793[var6 + 1], client.field316));
                            continue;
                        }
                        if (var505 == 4108) {
                            var6--;
                            String var370 = field793[var6];
                            var5 -= 2;
                            int var371 = field792[var5];
                            int var372 = field792[var5 + 1];
                            byte[] var373 = Statics.field300.method3045(var372, 0);
                            class224 var374 = new class224(var373);
                            field792[var5++] = var374.method3763(var370, var371);
                            continue;
                        }
                        if (var505 == 4109) {
                            var6--;
                            String var375 = field793[var6];
                            var5 -= 2;
                            int var376 = field792[var5];
                            int var377 = field792[var5 + 1];
                            byte[] var378 = Statics.field300.method3045(var377, 0);
                            class224 var379 = new class224(var378);
                            field792[var5++] = var379.method3699(var375, var376);
                            continue;
                        }
                        if (var505 == 4110) {
                            var6 -= 2;
                            String var380 = field793[var6];
                            String var381 = field793[var6 + 1];
                            var5--;
                            if (field792[var5] == 1) {
                                field793[var6++] = var380;
                            } else {
                                field793[var6++] = var381;
                            }
                            continue;
                        }
                        if (var505 == 4111) {
                            var6--;
                            String var382 = field793[var6];
                            field793[var6++] = class223.method3766(var382);
                            continue;
                        }
                        if (var505 == 4112) {
                            var6--;
                            String var383 = field793[var6];
                            var5--;
                            int var384 = field792[var5];
                            field793[var6++] = var383 + (char) var384;
                            continue;
                        }
                        if (var505 == 4113) {
                            var5--;
                            int var385 = field792[var5];
                            int[] var386 = field792;
                            int var387 = var5++;
                            char var388 = (char) var385;
                            boolean var389;
                            if (var388 >= ' ' && var388 <= '~') {
                                var389 = true;
                            } else if (var388 >= 160 && var388 <= 255) {
                                var389 = true;
                            } else if (var388 == 8364 || var388 == 338 || var388 == 8212 || var388 == 339 || var388 == 376) {
                                var389 = true;
                            } else {
                                var389 = false;
                            }
                            var386[var387] = var389 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4114) {
                            var5--;
                            int var390 = field792[var5];
                            field792[var5++] = class163.method2787((char) var390) ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4115) {
                            var5--;
                            int var391 = field792[var5];
                            int[] var392 = field792;
                            int var393 = var5++;
                            char var394 = (char) var391;
                            boolean var395 = var394 >= 'A' && var394 <= 'Z' || var394 >= 'a' && var394 <= 'z';
                            var392[var393] = var395 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4116) {
                            var5--;
                            int var396 = field792[var5];
                            field792[var5++] = class163.method2648((char) var396) ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4117) {
                            var6--;
                            String var397 = field793[var6];
                            if (var397 == null) {
                                field792[var5++] = 0;
                            } else {
                                field792[var5++] = var397.length();
                            }
                            continue;
                        }
                        if (var505 == 4118) {
                            var6--;
                            String var398 = field793[var6];
                            var5 -= 2;
                            int var399 = field792[var5];
                            int var400 = field792[var5 + 1];
                            field793[var6++] = var398.substring(var399, var400);
                            continue;
                        }
                        if (var505 == 4119) {
                            var6--;
                            String var401 = field793[var6];
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
                            field793[var6++] = var402.toString();
                            continue;
                        }
                        if (var505 == 4120) {
                            var6--;
                            String var406 = field793[var6];
                            var5--;
                            int var407 = field792[var5];
                            field792[var5++] = var406.indexOf(var407);
                            continue;
                        }
                        if (var505 == 4121) {
                            var6 -= 2;
                            String var408 = field793[var6];
                            String var409 = field793[var6 + 1];
                            var5--;
                            int var410 = field792[var5];
                            field792[var5++] = var408.indexOf(var409, var410);
                            continue;
                        }
                    } else if (var505 < 4300) {
                        if (var505 == 4200) {
                            var5--;
                            int var411 = field792[var5];
                            field793[var6++] = class52.method560(var411).field1118;
                            continue;
                        }
                        if (var505 == 4201) {
                            var5 -= 2;
                            int var412 = field792[var5];
                            int var413 = field792[var5 + 1];
                            class52 var414 = class52.method560(var412);
                            if (var413 >= 1 && var413 <= 5 && var414.field1132[var413 - 1] != null) {
                                field793[var6++] = var414.field1132[var413 - 1];
                                continue;
                            }
                            field793[var6++] = "";
                            continue;
                        }
                        if (var505 == 4202) {
                            var5 -= 2;
                            int var415 = field792[var5];
                            int var416 = field792[var5 + 1];
                            class52 var417 = class52.method560(var415);
                            if (var416 >= 1 && var416 <= 5 && var417.field1133[var416 - 1] != null) {
                                field793[var6++] = var417.field1133[var416 - 1];
                                continue;
                            }
                            field793[var6++] = "";
                            continue;
                        }
                        if (var505 == 4203) {
                            var5--;
                            int var418 = field792[var5];
                            field792[var5++] = class52.method560(var418).field1130;
                            continue;
                        }
                        if (var505 == 4204) {
                            var5--;
                            int var419 = field792[var5];
                            field792[var5++] = class52.method560(var419).field1149 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4205) {
                            var5--;
                            int var420 = field792[var5];
                            class52 var421 = class52.method560(var420);
                            if (var421.field1121 == -1 && var421.field1148 >= 0) {
                                field792[var5++] = var421.field1148;
                                continue;
                            }
                            field792[var5++] = var420;
                            continue;
                        }
                        if (var505 == 4206) {
                            var5--;
                            int var422 = field792[var5];
                            class52 var423 = class52.method560(var422);
                            if (var423.field1121 >= 0 && var423.field1148 >= 0) {
                                field792[var5++] = var423.field1148;
                                continue;
                            }
                            field792[var5++] = var422;
                            continue;
                        }
                        if (var505 == 4207) {
                            var5--;
                            int var424 = field792[var5];
                            field792[var5++] = class52.method560(var424).field1131 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4210) {
                            var6--;
                            String var425 = field793[var6];
                            var5--;
                            int var426 = field792[var5];
                            boolean var428 = var426 == 1;
                            String var429 = var425.toLowerCase();
                            short[] var430 = new short[16];
                            int var431 = 0;
                            int var432 = 0;
                            while (true) {
                                if (var432 >= Statics.field1143) {
                                    Statics.field2189 = var430;
                                    Statics.field1094 = 0;
                                    Statics.field800 = var431;
                                    String[] var436 = new String[Statics.field800];
                                    for (int var437 = 0; var437 < Statics.field800; var437++) {
                                        var436[var437] = class52.method560(var430[var437]).field1118;
                                    }
                                    short[] var438 = Statics.field2189;
                                    class124.method2607(var436, var438, 0, var436.length - 1);
                                    break;
                                }
                                class52 var433 = class52.method560(var432);
                                if ((!var428 || var433.field1125) && var433.field1121 == -1 && var433.field1118.toLowerCase().indexOf(var429) != -1) {
                                    if (var431 >= 250) {
                                        Statics.field800 = -1;
                                        Statics.field2189 = null;
                                        break;
                                    }
                                    if (var431 >= var430.length) {
                                        short[] var434 = new short[var430.length * 2];
                                        for (int var435 = 0; var435 < var431; var435++) {
                                            var434[var435] = var430[var435];
                                        }
                                        var430 = var434;
                                    }
                                    var430[var431++] = (short) var432;
                                }
                                var432++;
                            }
                            field792[var5++] = Statics.field800;
                            continue;
                        }
                        if (var505 == 4211) {
                            if (Statics.field2189 != null && Statics.field1094 < Statics.field800) {
                                field792[var5++] = Statics.field2189[++Statics.field1094 - 1] & 0xFFFF;
                                continue;
                            }
                            field792[var5++] = -1;
                            continue;
                        }
                        if (var505 == 4212) {
                            Statics.field1094 = 0;
                            continue;
                        }
                    } else if (var505 < 5100) {
                        if (var505 == 5000) {
                            field792[var5++] = client.field363;
                            continue;
                        }
                        if (var505 == 5001) {
                            var5 -= 3;
                            client.field363 = field792[var5];
                            int var439 = field792[var5 + 1];
                            class130[] var440 = class130.method2270();
                            int var441 = 0;
                            class130 var443;
                            while (true) {
                                if (var441 >= var440.length) {
                                    var443 = null;
                                    break;
                                }
                                class130 var442 = var440[var441];
                                if (var442.field2044 == var439) {
                                    var443 = var442;
                                    break;
                                }
                                var441++;
                            }
                            Statics.field218 = var443;
                            if (Statics.field218 == null) {
                                Statics.field218 = class130.field2042;
                            }
                            client.field509 = field792[var5 + 2];
                            client.field337.method2574(21);
                            client.field337.method2354(client.field363);
                            client.field337.method2354(Statics.field218.field2044);
                            client.field337.method2354(client.field509);
                            continue;
                        }
                        if (var505 == 5002) {
                            var6--;
                            String var444 = field793[var6];
                            var5 -= 2;
                            int var445 = field792[var5];
                            int var446 = field792[var5 + 1];
                            client.field337.method2574(171);
                            client.field337.method2354(class119.method636(var444) + 2);
                            client.field337.method2372(var444);
                            client.field337.method2354(var445 - 1);
                            client.field337.method2354(var446);
                            continue;
                        }
                        if (var505 == 5003) {
                            var5 -= 2;
                            int var447 = field792[var5];
                            int var448 = field792[var5 + 1];
                            class28 var449 = (class28) class12.field180.get(var447);
                            class36 var450 = var449.method624(var448);
                            if (var450 == null) {
                                field792[var5++] = -1;
                                field792[var5++] = 0;
                                field793[var6++] = "";
                                field793[var6++] = "";
                                field793[var6++] = "";
                            } else {
                                field792[var5++] = var450.field784;
                                field792[var5++] = var450.field780;
                                field793[var6++] = var450.field785 == null ? "" : var450.field785;
                                field793[var6++] = var450.field783 == null ? "" : var450.field783;
                                field793[var6++] = var450.field779 == null ? "" : var450.field779;
                            }
                            continue;
                        }
                        if (var505 == 5004) {
                            var5--;
                            int var452 = field792[var5];
                            class36 var453 = class12.method134(var452);
                            if (var453 == null) {
                                field792[var5++] = -1;
                                field792[var5++] = 0;
                                field793[var6++] = "";
                                field793[var6++] = "";
                                field793[var6++] = "";
                            } else {
                                field792[var5++] = var453.field781;
                                field792[var5++] = var453.field780;
                                field793[var6++] = var453.field785 == null ? "" : var453.field785;
                                field793[var6++] = var453.field783 == null ? "" : var453.field783;
                                field793[var6++] = var453.field779 == null ? "" : var453.field779;
                            }
                            continue;
                        }
                        if (var505 == 5005) {
                            if (Statics.field218 == null) {
                                field792[var5++] = -1;
                            } else {
                                field792[var5++] = Statics.field218.field2044;
                            }
                            continue;
                        }
                        if (var505 == 5008) {
                            var6--;
                            String var454 = field793[var6];
                            var5--;
                            int var455 = field792[var5];
                            String var456 = var454.toLowerCase();
                            byte var457 = 0;
                            if (var456.startsWith(class157.field2469)) {
                                var457 = 0;
                                var454 = var454.substring(class157.field2469.length());
                            } else if (var456.startsWith(class157.field2471)) {
                                var457 = 1;
                                var454 = var454.substring(class157.field2471.length());
                            } else if (var456.startsWith(class157.field2331)) {
                                var457 = 2;
                                var454 = var454.substring(class157.field2331.length());
                            } else if (var456.startsWith(class157.field2418)) {
                                var457 = 3;
                                var454 = var454.substring(class157.field2418.length());
                            } else if (var456.startsWith(class157.field2477)) {
                                var457 = 4;
                                var454 = var454.substring(class157.field2477.length());
                            } else if (var456.startsWith(class157.field2479)) {
                                var457 = 5;
                                var454 = var454.substring(class157.field2479.length());
                            } else if (var456.startsWith(class157.field2481)) {
                                var457 = 6;
                                var454 = var454.substring(class157.field2481.length());
                            } else if (var456.startsWith(class157.field2483)) {
                                var457 = 7;
                                var454 = var454.substring(class157.field2483.length());
                            } else if (var456.startsWith(class157.field2473)) {
                                var457 = 8;
                                var454 = var454.substring(class157.field2473.length());
                            } else if (var456.startsWith(class157.field2373)) {
                                var457 = 9;
                                var454 = var454.substring(class157.field2373.length());
                            } else if (var456.startsWith(class157.field2441)) {
                                var457 = 10;
                                var454 = var454.substring(class157.field2441.length());
                            } else if (var456.startsWith(class157.field2553)) {
                                var457 = 11;
                                var454 = var454.substring(class157.field2553.length());
                            } else if (client.field316 != 0) {
                                if (var456.startsWith(class157.field2371)) {
                                    var457 = 0;
                                    var454 = var454.substring(class157.field2371.length());
                                } else if (var456.startsWith(class157.field2472)) {
                                    var457 = 1;
                                    var454 = var454.substring(class157.field2472.length());
                                } else if (var456.startsWith(class157.field2474)) {
                                    var457 = 2;
                                    var454 = var454.substring(class157.field2474.length());
                                } else if (var456.startsWith(class157.field2476)) {
                                    var457 = 3;
                                    var454 = var454.substring(class157.field2476.length());
                                } else if (var456.startsWith(class157.field2368)) {
                                    var457 = 4;
                                    var454 = var454.substring(class157.field2368.length());
                                } else if (var456.startsWith(class157.field2480)) {
                                    var457 = 5;
                                    var454 = var454.substring(class157.field2480.length());
                                } else if (var456.startsWith(class157.field2482)) {
                                    var457 = 6;
                                    var454 = var454.substring(class157.field2482.length());
                                } else if (var456.startsWith(class157.field2364)) {
                                    var457 = 7;
                                    var454 = var454.substring(class157.field2364.length());
                                } else if (var456.startsWith(class157.field2541)) {
                                    var457 = 8;
                                    var454 = var454.substring(class157.field2541.length());
                                } else if (var456.startsWith(class157.field2499)) {
                                    var457 = 9;
                                    var454 = var454.substring(class157.field2499.length());
                                } else if (var456.startsWith(class157.field2390)) {
                                    var457 = 10;
                                    var454 = var454.substring(class157.field2390.length());
                                } else if (var456.startsWith(class157.field2396)) {
                                    var457 = 11;
                                    var454 = var454.substring(class157.field2396.length());
                                }
                            }
                            String var458 = var454.toLowerCase();
                            byte var459 = 0;
                            if (var458.startsWith(class157.field2493)) {
                                var459 = 1;
                                var454 = var454.substring(class157.field2493.length());
                            } else if (var458.startsWith(class157.field2495)) {
                                var459 = 2;
                                var454 = var454.substring(class157.field2495.length());
                            } else if (var458.startsWith(class157.field2497)) {
                                var459 = 3;
                                var454 = var454.substring(class157.field2497.length());
                            } else if (var458.startsWith(class157.field2372)) {
                                var459 = 4;
                                var454 = var454.substring(class157.field2372.length());
                            } else if (var458.startsWith(class157.field2501)) {
                                var459 = 5;
                                var454 = var454.substring(class157.field2501.length());
                            } else if (client.field316 != 0) {
                                if (var458.startsWith(class157.field2494)) {
                                    var459 = 1;
                                    var454 = var454.substring(class157.field2494.length());
                                } else if (var458.startsWith(class157.field2444)) {
                                    var459 = 2;
                                    var454 = var454.substring(class157.field2444.length());
                                } else if (var458.startsWith(class157.field2375)) {
                                    var459 = 3;
                                    var454 = var454.substring(class157.field2375.length());
                                } else if (var458.startsWith(class157.field2500)) {
                                    var459 = 4;
                                    var454 = var454.substring(class157.field2500.length());
                                } else if (var458.startsWith(class157.field2327)) {
                                    var459 = 5;
                                    var454 = var454.substring(class157.field2327.length());
                                }
                            }
                            client.field337.method2574(192);
                            client.field337.method2354(0);
                            int var460 = client.field337.field1973;
                            client.field337.method2354(var455);
                            client.field337.method2354(var457);
                            client.field337.method2354(var459);
                            class122 var461 = client.field337;
                            int var462 = var461.field1973;
                            byte[] var463 = class165.method1568(var454);
                            var461.method2389(var463.length);
                            var461.field1973 += Statics.field3159.method2256(var463, 0, var463.length, var461.field1974, var461.field1973);
                            client.field337.method2532(client.field337.field1973 - var460);
                            continue;
                        }
                        if (var505 == 5009) {
                            var6 -= 2;
                            String var464 = field793[var6];
                            String var465 = field793[var6 + 1];
                            client.field337.method2574(181);
                            client.field337.method2312(0);
                            int var466 = client.field337.field1973;
                            client.field337.method2372(var464);
                            class122 var467 = client.field337;
                            int var468 = var467.field1973;
                            byte[] var469 = class165.method1568(var465);
                            var467.method2389(var469.length);
                            var467.field1973 += Statics.field3159.method2256(var469, 0, var469.length, var467.field1974, var467.field1973);
                            client.field337.method2477(client.field337.field1973 - var466);
                            continue;
                        }
                        if (var505 == 5015) {
                            String var470;
                            if (Statics.field677 == null || Statics.field677.field38 == null) {
                                var470 = "";
                            } else {
                                var470 = Statics.field677.field38;
                            }
                            field793[var6++] = var470;
                            continue;
                        }
                        if (var505 == 5016) {
                            field792[var5++] = client.field509;
                            continue;
                        }
                        if (var505 == 5017) {
                            var5--;
                            int var471 = field792[var5];
                            field792[var5++] = class12.method37(var471);
                            continue;
                        }
                        if (var505 == 5018) {
                            var5--;
                            int var472 = field792[var5];
                            int[] var473 = field792;
                            int var474 = var5++;
                            class36 var475 = (class36) class12.field178.method3475((long) var472);
                            int var476;
                            if (var475 == null) {
                                var476 = -1;
                            } else if (class12.field184.field3077 == var475.field3081) {
                                var476 = -1;
                            } else {
                                var476 = ((class36) var475.field3081).field784;
                            }
                            var473[var474] = var476;
                            continue;
                        }
                        if (var505 == 5019) {
                            var5--;
                            int var477 = field792[var5];
                            field792[var5++] = class12.method1512(var477);
                            continue;
                        }
                        if (var505 == 5020) {
                            var6--;
                            String var478 = field793[var6];
                            client.method122(var478);
                            continue;
                        }
                        if (var505 == 5021) {
                            var6--;
                            client.field461 = field793[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var505 == 5022) {
                            field793[var6++] = client.field461;
                            continue;
                        }
                    }
                }
                if (var505 < 5400) {
                    if (var505 == 5306) {
                        int[] var479 = field792;
                        int var480 = var5++;
                        int var481 = client.field504 ? 2 : 1;
                        var479[var480] = var481;
                        continue;
                    }
                    if (var505 == 5307) {
                        var5--;
                        int var482 = field792[var5];
                        if (var482 == 1 || var482 == 2) {
                            client.method2912(var482);
                        }
                        continue;
                    }
                    if (var505 == 5308) {
                        field792[var5++] = Statics.field1549.field146;
                        continue;
                    }
                    if (var505 == 5309) {
                        var5--;
                        int var483 = field792[var5];
                        if (var483 == 1 || var483 == 2) {
                            Statics.field1549.field146 = var483;
                            class9.method38();
                        }
                        continue;
                    }
                }
                if (var505 < 5600) {
                    if (var505 == 5504) {
                        var5 -= 2;
                        int var484 = field792[var5];
                        int var485 = field792[var5 + 1];
                        if (!client.field431) {
                            client.field374 = var484;
                            client.field375 = var485;
                        }
                        continue;
                    }
                    if (var505 == 5505) {
                        field792[var5++] = client.field374;
                        continue;
                    }
                    if (var505 == 5506) {
                        field792[var5++] = client.field375;
                        continue;
                    }
                    if (var505 == 5530) {
                        var5--;
                        int var486 = field792[var5];
                        if (var486 < 0) {
                            var486 = 0;
                        }
                        client.field380 = var486;
                        continue;
                    }
                    if (var505 == 5531) {
                        field792[var5++] = client.field380;
                        continue;
                    }
                }
                if (var505 >= 5700 || var505 != 5630) {
                    if (var505 < 6300) {
                        if (var505 == 6200) {
                            var5 -= 2;
                            client.field545 = (short) field792[var5];
                            if (client.field545 <= 0) {
                                client.field545 = 256;
                            }
                            client.field368 = (short) field792[var5 + 1];
                            if (client.field368 <= 0) {
                                client.field368 = 205;
                            }
                            continue;
                        }
                        if (var505 == 6201) {
                            var5 -= 2;
                            client.field438 = (short) field792[var5];
                            if (client.field438 <= 0) {
                                client.field438 = 256;
                            }
                            client.field572 = (short) field792[var5 + 1];
                            if (client.field572 <= 0) {
                                client.field572 = 320;
                            }
                            continue;
                        }
                        if (var505 == 6202) {
                            var5 -= 4;
                            client.field549 = (short) field792[var5];
                            if (client.field549 <= 0) {
                                client.field549 = 1;
                            }
                            client.field330 = (short) field792[var5 + 1];
                            if (client.field330 <= 0) {
                                client.field330 = 32767;
                            } else if (client.field330 < client.field549) {
                                client.field330 = client.field549;
                            }
                            client.field551 = (short) field792[var5 + 2];
                            if (client.field551 <= 0) {
                                client.field551 = 1;
                            }
                            client.field541 = (short) field792[var5 + 3];
                            if (client.field541 <= 0) {
                                client.field541 = 32767;
                            } else if (client.field541 < client.field551) {
                                client.field541 = client.field551;
                            }
                            continue;
                        }
                        if (var505 == 6203) {
                            if (client.field338 == null) {
                                field792[var5++] = -1;
                                field792[var5++] = -1;
                            } else {
                                client.method2028(0, 0, client.field338.field2825, client.field338.field2743, false);
                                field792[var5++] = client.field555;
                                field792[var5++] = client.field556;
                            }
                            continue;
                        }
                        if (var505 == 6204) {
                            field792[var5++] = client.field438;
                            field792[var5++] = client.field572;
                            continue;
                        }
                        if (var505 == 6205) {
                            field792[var5++] = client.field545;
                            field792[var5++] = client.field368;
                            continue;
                        }
                    }
                    if (var505 < 6600) {
                        if (var505 == 6500) {
                            field792[var5++] = Statics.method1750() ? 1 : 0;
                            continue;
                        }
                        if (var505 == 6501) {
                            class26.field636 = 0;
                            class26 var487;
                            if (class26.field636 < class26.field635) {
                                var487 = Statics.field634[++class26.field636 - 1];
                            } else {
                                var487 = null;
                            }
                            if (var487 == null) {
                                field792[var5++] = -1;
                                field792[var5++] = 0;
                                field793[var6++] = "";
                                field792[var5++] = 0;
                                field792[var5++] = 0;
                                field793[var6++] = "";
                            } else {
                                field792[var5++] = var487.field641;
                                field792[var5++] = var487.field640;
                                field793[var6++] = var487.field643;
                                field792[var5++] = var487.field651;
                                field792[var5++] = var487.field644;
                                field793[var6++] = var487.field642;
                            }
                            continue;
                        }
                        if (var505 == 6502) {
                            class26 var490;
                            if (class26.field636 < class26.field635) {
                                var490 = Statics.field634[++class26.field636 - 1];
                            } else {
                                var490 = null;
                            }
                            if (var490 == null) {
                                field792[var5++] = -1;
                                field792[var5++] = 0;
                                field793[var6++] = "";
                                field792[var5++] = 0;
                                field792[var5++] = 0;
                                field793[var6++] = "";
                            } else {
                                field792[var5++] = var490.field641;
                                field792[var5++] = var490.field640;
                                field793[var6++] = var490.field643;
                                field792[var5++] = var490.field651;
                                field792[var5++] = var490.field644;
                                field793[var6++] = var490.field642;
                            }
                            continue;
                        }
                        if (var505 == 6506) {
                            var5--;
                            int var492 = field792[var5];
                            class26 var493 = null;
                            for (int var494 = 0; var494 < class26.field635; var494++) {
                                if (Statics.field634[var494].field641 == var492) {
                                    var493 = Statics.field634[var494];
                                    break;
                                }
                            }
                            if (var493 == null) {
                                field792[var5++] = -1;
                                field792[var5++] = 0;
                                field793[var6++] = "";
                                field792[var5++] = 0;
                                field792[var5++] = 0;
                                field793[var6++] = "";
                            } else {
                                field792[var5++] = var493.field641;
                                field792[var5++] = var493.field640;
                                field793[var6++] = var493.field643;
                                field792[var5++] = var493.field651;
                                field792[var5++] = var493.field644;
                                field793[var6++] = var493.field642;
                            }
                            continue;
                        }
                        if (var505 == 6507) {
                            var5 -= 4;
                            int var495 = field792[var5];
                            boolean var496 = field792[var5 + 1] == 1;
                            int var497 = field792[var5 + 2];
                            boolean var498 = field792[var5 + 3] == 1;
                            if (Statics.field634 != null) {
                                class26.method1927(0, Statics.field634.length - 1, var495, var496, var497, var498);
                            }
                            continue;
                        }
                        if (var505 == 6511) {
                            var5--;
                            int var499 = field792[var5];
                            if (var499 >= 0 && var499 < class26.field635) {
                                class26 var500 = Statics.field634[var499];
                                field792[var5++] = var500.field641;
                                field792[var5++] = var500.field640;
                                field793[var6++] = var500.field643;
                                field792[var5++] = var500.field651;
                                field792[var5++] = var500.field644;
                                field793[var6++] = var500.field642;
                                continue;
                            }
                            field792[var5++] = -1;
                            field792[var5++] = 0;
                            field793[var6++] = "";
                            field792[var5++] = 0;
                            field792[var5++] = 0;
                            field793[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field344 = 250;
            }
        } catch (Exception var504) {
            StringBuilder var502 = new StringBuilder(30);
            var502.append("").append(var4.field3091).append(" ");
            for (int var503 = field794 - 1; var503 >= 0; var503--) {
                var502.append("").append(field788[var503].field219.field3091).append(" ");
            }
            var502.append("").append(var10);
            class148.method2701(var502.toString(), var504);
        }
    }

    @ObfuscatedName("l.g(II)V")
    public static void method573(int arg0) {
        if (arg0 == -1 || !Statics.method723(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2745[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2806 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field15 = var3.field2806;
                method3188(var4, 2000000);
            }
        }
    }
}
