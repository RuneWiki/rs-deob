package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ah")
public class class37 {

    @ObfuscatedName("ah.d")
    public static int[] field801 = new int[5];

    @ObfuscatedName("ah.u")
    public static int[][] field802 = new int[5][5000];

    @ObfuscatedName("ah.o")
    public static int[] field803 = new int[1000];

    @ObfuscatedName("ah.b")
    public static String[] field809 = new String[1000];

    @ObfuscatedName("ah.k")
    public static int field805 = 0;

    @ObfuscatedName("ah.c")
    public static class15[] field806 = new class15[50];

    @ObfuscatedName("ah.i")
    public static Calendar field807 = Calendar.getInstance();

    @ObfuscatedName("ah.r")
    public static final String[] field808 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ah.m")
    public static int field811 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.s(Ls;I)V")
    public static void method192(class1 arg0) {
        method196(arg0, 200000);
    }

    @ObfuscatedName("z.j(Ls;II)V")
    public static void method196(class1 arg0, int arg1) {
        Object[] var2 = arg0.field13;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method93(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field585;
        int[] var9 = var4.field586;
        byte var10 = -1;
        field805 = 0;
        try {
            Statics.field799 = new int[var4.field588];
            int var11 = 0;
            Statics.field804 = new String[var4.field589];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field15;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field9 == null ? -1 : arg0.field9.field2827;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field9 == null ? -1 : arg0.field9.field2767;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2827;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2767;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field4;
                    }
                    Statics.field799[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field804[var12++] = var15;
                }
            }
            int var16 = 0;
            field811 = arg0.field3;
            label3317: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var493 = var8[var7];
                if (var493 < 100) {
                    if (var493 == 0) {
                        field803[var5++] = var9[var7];
                        continue;
                    }
                    if (var493 == 1) {
                        int var17 = var9[var7];
                        field803[var5++] = class177.field2921[var17];
                        continue;
                    }
                    if (var493 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class177.field2921[var18] = field803[var5];
                        client.method1049(var18);
                        continue;
                    }
                    if (var493 == 3) {
                        field809[var6++] = var4.field587[var7];
                        continue;
                    }
                    if (var493 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var493 == 7) {
                        var5 -= 2;
                        if (field803[var5 + 1] != field803[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var493 == 8) {
                        var5 -= 2;
                        if (field803[var5 + 1] == field803[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var493 == 9) {
                        var5 -= 2;
                        if (field803[var5] < field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var493 == 10) {
                        var5 -= 2;
                        if (field803[var5] > field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var493 == 21) {
                        if (field805 == 0) {
                            return;
                        }
                        class15 var19 = field806[--field805];
                        var4 = var19.field201;
                        var8 = var4.field585;
                        var9 = var4.field586;
                        var7 = var19.field199;
                        Statics.field799 = var19.field202;
                        Statics.field804 = var19.field203;
                        continue;
                    }
                    if (var493 == 25) {
                        int var20 = var9[var7];
                        field803[var5++] = class177.method680(var20);
                        continue;
                    }
                    if (var493 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field803[var5];
                        class48 var23 = (class48) class48.field1066.method3484((long) var21);
                        class48 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field1071.method3014(14, var21);
                            class48 var26 = new class48();
                            if (var25 != null) {
                                var26.method935(new class120(var25));
                            }
                            class48.field1066.method3486(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field1067;
                        int var29 = var24.field1065;
                        int var30 = var24.field1069;
                        int var31 = class177.field2920[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class177.field2921[var28] = class177.field2921[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var493 == 31) {
                        var5 -= 2;
                        if (field803[var5] <= field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var493 == 32) {
                        var5 -= 2;
                        if (field803[var5] >= field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var493 == 33) {
                        field803[var5++] = Statics.field799[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var493 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field799[var10001] = field803[var5];
                        continue;
                    }
                    if (var493 == 35) {
                        field809[var6++] = Statics.field804[var9[var7]];
                        continue;
                    }
                    if (var493 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field804[var10001] = field809[var6];
                        continue;
                    }
                    if (var493 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String[] var34 = field809;
                        String var35;
                        if (var33 == 0) {
                            var35 = "";
                        } else if (var33 == 1) {
                            String var36 = var34[var6];
                            if (var36 == null) {
                                var35 = "null";
                            } else {
                                var35 = var36.toString();
                            }
                        } else {
                            int var37 = var6 + var33;
                            int var38 = 0;
                            for (int var39 = var6; var39 < var37; var39++) {
                                String var40 = var34[var39];
                                if (var40 == null) {
                                    var38 += 4;
                                } else {
                                    var38 += var40.length();
                                }
                            }
                            StringBuilder var41 = new StringBuilder(var38);
                            for (int var42 = var6; var42 < var37; var42++) {
                                String var43 = var34[var42];
                                if (var43 == null) {
                                    var41.append("null");
                                } else {
                                    var41.append(var43);
                                }
                            }
                            var35 = var41.toString();
                        }
                        field809[var6++] = var35;
                        continue;
                    }
                    if (var493 == 38) {
                        var5--;
                        continue;
                    }
                    if (var493 == 39) {
                        var6--;
                        continue;
                    }
                    if (var493 == 40) {
                        int var45 = var9[var7];
                        class23 var46 = class23.method93(var45);
                        int[] var47 = new int[var46.field588];
                        String[] var48 = new String[var46.field589];
                        for (int var49 = 0; var49 < var46.field593; var49++) {
                            var47[var49] = field803[var5 - var46.field593 + var49];
                        }
                        for (int var50 = 0; var50 < var46.field591; var50++) {
                            var48[var50] = field809[var6 - var46.field591 + var50];
                        }
                        var5 -= var46.field593;
                        var6 -= var46.field591;
                        class15 var51 = new class15();
                        var51.field201 = var4;
                        var51.field199 = var7;
                        var51.field202 = Statics.field799;
                        var51.field203 = Statics.field804;
                        field806[++field805 - 1] = var51;
                        var4 = var46;
                        var8 = var46.field585;
                        var9 = var46.field586;
                        var7 = -1;
                        Statics.field799 = var47;
                        Statics.field804 = var48;
                        continue;
                    }
                    if (var493 == 42) {
                        field803[var5++] = Statics.field785.method208(var9[var7]);
                        continue;
                    }
                    if (var493 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field785.method221(var10001, field803[var5]);
                        continue;
                    }
                    if (var493 == 44) {
                        int var52 = var9[var7] >> 16;
                        int var53 = var9[var7] & 0xFFFF;
                        var5--;
                        int var54 = field803[var5];
                        if (var54 >= 0 && var54 <= 5000) {
                            field801[var52] = var54;
                            byte var55 = -1;
                            if (var53 == 105) {
                                var55 = 0;
                            }
                            int var56 = 0;
                            while (true) {
                                if (var56 >= var54) {
                                    continue label3317;
                                }
                                field802[var52][var56] = var55;
                                var56++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var493 == 45) {
                        int var57 = var9[var7];
                        var5--;
                        int var58 = field803[var5];
                        if (var58 >= 0 && var58 < field801[var57]) {
                            field803[var5++] = field802[var57][var58];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var493 == 46) {
                        int var59 = var9[var7];
                        var5 -= 2;
                        int var60 = field803[var5];
                        if (var60 >= 0 && var60 < field801[var59]) {
                            field802[var59][var60] = field803[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var493 == 47) {
                        String var61 = Statics.field785.method228(var9[var7]);
                        if (var61 == null) {
                            var61 = "null";
                        }
                        field809[var6++] = var61;
                        continue;
                    }
                    if (var493 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field785.method209(var10001, field809[var6]);
                        continue;
                    }
                }
                boolean var62;
                if (var9[var7] == 1) {
                    var62 = true;
                } else {
                    var62 = false;
                }
                if (var493 < 1000) {
                    if (var493 == 100) {
                        var5 -= 3;
                        int var63 = field803[var5];
                        int var64 = field803[var5 + 1];
                        int var65 = field803[var5 + 2];
                        if (var64 == 0) {
                            throw new RuntimeException();
                        }
                        class174 var66 = class174.method634(var63);
                        if (var66.field2848 == null) {
                            var66.field2848 = new class174[var65 + 1];
                        }
                        if (var66.field2848.length <= var65) {
                            class174[] var67 = new class174[var65 + 1];
                            for (int var68 = 0; var68 < var66.field2848.length; var68++) {
                                var67[var68] = var66.field2848[var68];
                            }
                            var66.field2848 = var67;
                        }
                        if (var65 > 0 && var66.field2848[var65 - 1] == null) {
                            throw new RuntimeException("" + (var65 - 1));
                        }
                        class174 var69 = new class174();
                        var69.field2768 = var64;
                        var69.field2785 = var69.field2827 = var66.field2827;
                        var69.field2767 = var65;
                        var69.field2765 = true;
                        var66.field2848[var65] = var69;
                        if (var62) {
                            Statics.field2174 = var69;
                        } else {
                            Statics.field186 = var69;
                        }
                        client.method687(var66);
                        continue;
                    }
                    if (var493 == 101) {
                        class174 var70 = var62 ? Statics.field2174 : Statics.field186;
                        class174 var71 = class174.method634(var70.field2827);
                        var71.field2848[var70.field2767] = null;
                        client.method687(var71);
                        continue;
                    }
                    if (var493 == 102) {
                        var5--;
                        class174 var72 = class174.method634(field803[var5]);
                        var72.field2848 = null;
                        client.method687(var72);
                        continue;
                    }
                    if (var493 == 200) {
                        var5 -= 2;
                        int var73 = field803[var5];
                        int var74 = field803[var5 + 1];
                        class174 var75 = class174.method912(var73, var74);
                        if (var75 != null && var74 != -1) {
                            field803[var5++] = 1;
                            if (var62) {
                                Statics.field2174 = var75;
                            } else {
                                Statics.field186 = var75;
                            }
                            continue;
                        }
                        field803[var5++] = 0;
                        continue;
                    }
                    if (var493 == 201) {
                        var5--;
                        class174 var76 = class174.method634(field803[var5]);
                        if (var76 == null) {
                            field803[var5++] = 0;
                        } else {
                            field803[var5++] = 1;
                            if (var62) {
                                Statics.field2174 = var76;
                            } else {
                                Statics.field186 = var76;
                            }
                        }
                        continue;
                    }
                } else if (var493 >= 1000 && var493 < 1100 || var493 >= 2000 && var493 < 2100) {
                    int var77 = -1;
                    class174 var78;
                    if (var493 >= 2000) {
                        var493 -= 1000;
                        var5--;
                        var77 = field803[var5];
                        var78 = class174.method634(var77);
                    } else {
                        var78 = var62 ? Statics.field2174 : Statics.field186;
                    }
                    if (var493 == 1000) {
                        var5 -= 4;
                        var78.field2775 = field803[var5];
                        var78.field2776 = field803[var5 + 1];
                        var78.field2771 = field803[var5 + 2];
                        var78.field2811 = field803[var5 + 3];
                        client.method687(var78);
                        Statics.method1938(var78);
                        if (var77 != -1 && var78.field2768 == 0) {
                            client.method2638(Statics.field3172[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var493 == 1001) {
                        var5 -= 4;
                        var78.field2777 = field803[var5];
                        var78.field2778 = field803[var5 + 1];
                        var78.field2773 = field803[var5 + 2];
                        var78.field2890 = field803[var5 + 3];
                        client.method687(var78);
                        Statics.method1938(var78);
                        if (var77 != -1 && var78.field2768 == 0) {
                            client.method2638(Statics.field3172[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var493 == 1003) {
                        var5--;
                        boolean var79 = field803[var5] == 1;
                        if (var78.field2774 != var79) {
                            var78.field2774 = var79;
                            client.method687(var78);
                        }
                        continue;
                    }
                    if (var493 == 1005) {
                        var5--;
                        var78.field2899 = field803[var5] == 1;
                        continue;
                    }
                    if (var493 == 1006) {
                        var5--;
                        var78.field2878 = field803[var5] == 1;
                        continue;
                    }
                } else if (var493 >= 1100 && var493 < 1200 || var493 >= 2100 && var493 < 2200) {
                    int var80 = -1;
                    class174 var81;
                    if (var493 >= 2000) {
                        var493 -= 1000;
                        var5--;
                        var80 = field803[var5];
                        var81 = class174.method634(var80);
                    } else {
                        var81 = var62 ? Statics.field2174 : Statics.field186;
                    }
                    if (var493 == 1100) {
                        var5 -= 2;
                        var81.field2787 = field803[var5];
                        if (var81.field2787 > var81.field2849 - var81.field2887) {
                            var81.field2787 = var81.field2849 - var81.field2887;
                        }
                        if (var81.field2787 < 0) {
                            var81.field2787 = 0;
                        }
                        var81.field2788 = field803[var5 + 1];
                        if (var81.field2788 > var81.field2859 - var81.field2782) {
                            var81.field2788 = var81.field2859 - var81.field2782;
                        }
                        if (var81.field2788 < 0) {
                            var81.field2788 = 0;
                        }
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1101) {
                        var5--;
                        var81.field2791 = field803[var5];
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1102) {
                        var5--;
                        var81.field2795 = field803[var5] == 1;
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1103) {
                        var5--;
                        var81.field2797 = field803[var5];
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1104) {
                        var5--;
                        var81.field2799 = field803[var5];
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1105) {
                        var5--;
                        var81.field2891 = field803[var5];
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1106) {
                        var5--;
                        var81.field2803 = field803[var5];
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1107) {
                        var5--;
                        var81.field2804 = field803[var5] == 1;
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1108) {
                        var81.field2789 = 1;
                        var5--;
                        var81.field2831 = field803[var5];
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1109) {
                        var5 -= 6;
                        var81.field2860 = field803[var5];
                        var81.field2816 = field803[var5 + 1];
                        var81.field2817 = field803[var5 + 2];
                        var81.field2818 = field803[var5 + 3];
                        var81.field2819 = field803[var5 + 4];
                        var81.field2820 = field803[var5 + 5];
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1110) {
                        var5--;
                        int var82 = field803[var5];
                        if (var81.field2813 != var82) {
                            var81.field2813 = var82;
                            var81.field2835 = 0;
                            var81.field2755 = 0;
                            client.method687(var81);
                        }
                        continue;
                    }
                    if (var493 == 1111) {
                        var5--;
                        var81.field2823 = field803[var5] == 1;
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1112) {
                        var6--;
                        String var83 = field809[var6];
                        if (!var83.equals(var81.field2826)) {
                            var81.field2826 = var83;
                            client.method687(var81);
                        }
                        continue;
                    }
                    if (var493 == 1113) {
                        var5--;
                        var81.field2825 = field803[var5];
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1114) {
                        var5 -= 3;
                        var81.field2829 = field803[var5];
                        var81.field2830 = field803[var5 + 1];
                        var81.field2900 = field803[var5 + 2];
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1115) {
                        var5--;
                        var81.field2770 = field803[var5] == 1;
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1116) {
                        var5--;
                        var81.field2805 = field803[var5];
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1117) {
                        var5--;
                        var81.field2806 = field803[var5];
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1118) {
                        var5--;
                        var81.field2841 = field803[var5] == 1;
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1119) {
                        var5--;
                        var81.field2808 = field803[var5] == 1;
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1120) {
                        var5 -= 2;
                        var81.field2849 = field803[var5];
                        var81.field2859 = field803[var5 + 1];
                        client.method687(var81);
                        if (var80 != -1 && var81.field2768 == 0) {
                            client.method2638(Statics.field3172[var80 >> 16], var81, false);
                        }
                        continue;
                    }
                    if (var493 == 1121) {
                        int var84 = var81.field2827;
                        int var85 = var81.field2767;
                        client.field323.method2583(99);
                        client.field323.method2507(var85);
                        client.field323.method2377(var84);
                        client.field442 = var81;
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1122) {
                        var5--;
                        var81.field2802 = field803[var5];
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1123) {
                        var5--;
                        var81.field2792 = field803[var5];
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1124) {
                        var5--;
                        var81.field2834 = field803[var5];
                        client.method687(var81);
                        continue;
                    }
                    if (var493 == 1125) {
                        var5--;
                        int var86 = field803[var5];
                        class83 var87 = (class83) class110.method1520(class83.method715(), var86);
                        if (var87 != null) {
                            var81.field2796 = var87;
                            client.method687(var81);
                        }
                        continue;
                    }
                } else if (!(var493 < 1200 || var493 >= 1300) || !(var493 < 2200 || var493 >= 2300)) {
                    class174 var88;
                    if (var493 >= 2000) {
                        var493 -= 1000;
                        var5--;
                        var88 = class174.method634(field803[var5]);
                    } else {
                        var88 = var62 ? Statics.field2174 : Statics.field186;
                    }
                    client.method687(var88);
                    if (var493 == 1200 || var493 == 1205 || var493 == 1212) {
                        var5 -= 2;
                        int var89 = field803[var5];
                        int var90 = field803[var5 + 1];
                        var88.field2886 = var89;
                        var88.field2781 = var90;
                        class52 var91 = class52.method126(var89);
                        var88.field2817 = var91.field1123;
                        var88.field2818 = var91.field1124;
                        var88.field2819 = var91.field1127;
                        var88.field2860 = var91.field1126;
                        var88.field2816 = var91.field1139;
                        var88.field2820 = var91.field1122;
                        if (var493 == 1205) {
                            var88.field2824 = 0;
                        } else if (var493 == 1212 | var91.field1128 == 1) {
                            var88.field2824 = 1;
                        } else {
                            var88.field2824 = 2;
                        }
                        if (var88.field2821 > 0) {
                            var88.field2820 = var88.field2820 * 32 / var88.field2821;
                        } else if (var88.field2777 > 0) {
                            var88.field2820 = var88.field2820 * 32 / var88.field2777;
                        }
                        continue;
                    }
                    if (var493 == 1201) {
                        var88.field2789 = 2;
                        var5--;
                        var88.field2831 = field803[var5];
                        continue;
                    }
                    if (var493 == 1202) {
                        var88.field2789 = 3;
                        var88.field2831 = Statics.field1882.field35.method3262();
                        continue;
                    }
                } else if ((var493 < 1300 || var493 >= 1400) && (var493 < 2300 || var493 >= 2400)) {
                    if (var493 >= 1400 && var493 < 1500 || var493 >= 2400 && var493 < 2500) {
                        class174 var96;
                        if (var493 >= 2000) {
                            var493 -= 1000;
                            var5--;
                            var96 = class174.method634(field803[var5]);
                        } else {
                            var96 = var62 ? Statics.field2174 : Statics.field186;
                        }
                        var6--;
                        String var97 = field809[var6];
                        int[] var98 = null;
                        if (var97.length() > 0 && var97.charAt(var97.length() - 1) == 'Y') {
                            var5--;
                            int var99 = field803[var5];
                            if (var99 > 0) {
                                var98 = new int[var99];
                                while (var99-- > 0) {
                                    var5--;
                                    var98[var99] = field803[var5];
                                }
                            }
                            var97 = var97.substring(0, var97.length() - 1);
                        }
                        Object[] var100 = new Object[var97.length() + 1];
                        for (int var101 = var100.length - 1; var101 >= 1; var101--) {
                            if (var97.charAt(var101 - 1) == 's') {
                                var6--;
                                var100[var101] = field809[var6];
                            } else {
                                var5--;
                                var100[var101] = Integer.valueOf(field803[var5]);
                            }
                        }
                        var5--;
                        int var102 = field803[var5];
                        if (var102 == -1) {
                            var100 = null;
                        } else {
                            var100[0] = Integer.valueOf(var102);
                        }
                        if (var493 == 1400) {
                            var96.field2873 = var100;
                        }
                        if (var493 == 1401) {
                            var96.field2851 = var100;
                        }
                        if (var493 == 1402) {
                            var96.field2850 = var100;
                        }
                        if (var493 == 1403) {
                            var96.field2852 = var100;
                        }
                        if (var493 == 1404) {
                            var96.field2854 = var100;
                        }
                        if (var493 == 1405) {
                            var96.field2855 = var100;
                        }
                        if (var493 == 1406) {
                            var96.field2801 = var100;
                        }
                        if (var493 == 1407) {
                            var96.field2809 = var100;
                            var96.field2772 = var98;
                        }
                        if (var493 == 1408) {
                            var96.field2794 = var100;
                        }
                        if (var493 == 1409) {
                            var96.field2866 = var100;
                        }
                        if (var493 == 1410) {
                            var96.field2856 = var100;
                        }
                        if (var493 == 1411) {
                            var96.field2881 = var100;
                        }
                        if (var493 == 1412) {
                            var96.field2853 = var100;
                        }
                        if (var493 == 1414) {
                            var96.field2861 = var100;
                            var96.field2759 = var98;
                        }
                        if (var493 == 1415) {
                            var96.field2863 = var100;
                            var96.field2864 = var98;
                        }
                        if (var493 == 1416) {
                            var96.field2893 = var100;
                        }
                        if (var493 == 1417) {
                            var96.field2844 = var100;
                        }
                        if (var493 == 1418) {
                            var96.field2868 = var100;
                        }
                        if (var493 == 1419) {
                            var96.field2869 = var100;
                        }
                        if (var493 == 1420) {
                            var96.field2870 = var100;
                        }
                        if (var493 == 1421) {
                            var96.field2871 = var100;
                        }
                        if (var493 == 1422) {
                            var96.field2783 = var100;
                        }
                        if (var493 == 1423) {
                            var96.field2764 = var100;
                        }
                        if (var493 == 1424) {
                            var96.field2874 = var100;
                        }
                        if (var493 == 1425) {
                            var96.field2876 = var100;
                        }
                        if (var493 == 1426) {
                            var96.field2793 = var100;
                        }
                        if (var493 == 1427) {
                            var96.field2875 = var100;
                        }
                        var96.field2846 = true;
                        continue;
                    }
                    if (var493 < 1600) {
                        class174 var103 = var62 ? Statics.field2174 : Statics.field186;
                        if (var493 == 1500) {
                            field803[var5++] = var103.field2769;
                            continue;
                        }
                        if (var493 == 1501) {
                            field803[var5++] = var103.field2780;
                            continue;
                        }
                        if (var493 == 1502) {
                            field803[var5++] = var103.field2887;
                            continue;
                        }
                        if (var493 == 1503) {
                            field803[var5++] = var103.field2782;
                            continue;
                        }
                        if (var493 == 1504) {
                            field803[var5++] = var103.field2774 ? 1 : 0;
                            continue;
                        }
                        if (var493 == 1505) {
                            field803[var5++] = var103.field2785;
                            continue;
                        }
                    } else if (var493 < 1700) {
                        class174 var104 = var62 ? Statics.field2174 : Statics.field186;
                        if (var493 == 1600) {
                            field803[var5++] = var104.field2787;
                            continue;
                        }
                        if (var493 == 1601) {
                            field803[var5++] = var104.field2788;
                            continue;
                        }
                        if (var493 == 1602) {
                            field809[var6++] = var104.field2826;
                            continue;
                        }
                        if (var493 == 1603) {
                            field803[var5++] = var104.field2849;
                            continue;
                        }
                        if (var493 == 1604) {
                            field803[var5++] = var104.field2859;
                            continue;
                        }
                        if (var493 == 1605) {
                            field803[var5++] = var104.field2820;
                            continue;
                        }
                        if (var493 == 1606) {
                            field803[var5++] = var104.field2817;
                            continue;
                        }
                        if (var493 == 1607) {
                            field803[var5++] = var104.field2819;
                            continue;
                        }
                        if (var493 == 1608) {
                            field803[var5++] = var104.field2818;
                            continue;
                        }
                        if (var493 == 1609) {
                            field803[var5++] = var104.field2797;
                            continue;
                        }
                        if (var493 == 1610) {
                            field803[var5++] = var104.field2834;
                            continue;
                        }
                        if (var493 == 1611) {
                            field803[var5++] = var104.field2791;
                            continue;
                        }
                        if (var493 == 1612) {
                            field803[var5++] = var104.field2792;
                            continue;
                        }
                        if (var493 == 1613) {
                            field803[var5++] = var104.field2796.method541();
                            continue;
                        }
                    } else if (var493 < 1800) {
                        class174 var105 = var62 ? Statics.field2174 : Statics.field186;
                        if (var493 == 1700) {
                            field803[var5++] = var105.field2886;
                            continue;
                        }
                        if (var493 == 1701) {
                            if (var105.field2886 == -1) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = var105.field2781;
                            }
                            continue;
                        }
                        if (var493 == 1702) {
                            field803[var5++] = var105.field2767;
                            continue;
                        }
                    } else if (var493 < 1900) {
                        class174 var106 = var62 ? Statics.field2174 : Statics.field186;
                        if (var493 == 1800) {
                            int[] var107 = field803;
                            int var108 = var5++;
                            int var109 = client.method942(var106);
                            int var110 = var109 >> 11 & 0x3F;
                            var107[var108] = var110;
                            continue;
                        }
                        if (var493 == 1801) {
                            var5--;
                            int var111 = field803[var5];
                            int var494 = var111 - 1;
                            if (var106.field2840 != null && var494 < var106.field2840.length && var106.field2840[var494] != null) {
                                field809[var6++] = var106.field2840[var494];
                                continue;
                            }
                            field809[var6++] = "";
                            continue;
                        }
                        if (var493 == 1802) {
                            if (var106.field2790 == null) {
                                field809[var6++] = "";
                            } else {
                                field809[var6++] = var106.field2790;
                            }
                            continue;
                        }
                    } else if (!(var493 < 1900 || var493 >= 2000) || !(var493 < 2900 || var493 >= 3000)) {
                        class174 var112;
                        if (var493 >= 2000) {
                            var493 -= 1000;
                            var5--;
                            var112 = class174.method634(field803[var5]);
                        } else {
                            var112 = var62 ? Statics.field2174 : Statics.field186;
                        }
                        if (var493 == 1927) {
                            if (field811 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var112.field2875 == null) {
                                return;
                            }
                            class1 var113 = new class1();
                            var113.field9 = var112;
                            var113.field13 = var112.field2875;
                            var113.field3 = field811 + 1;
                            client.field284.method3548(arg0);
                            continue;
                        }
                    } else if (var493 < 2600) {
                        var5--;
                        class174 var114 = class174.method634(field803[var5]);
                        if (var493 == 2500) {
                            field803[var5++] = var114.field2769;
                            continue;
                        }
                        if (var493 == 2501) {
                            field803[var5++] = var114.field2780;
                            continue;
                        }
                        if (var493 == 2502) {
                            field803[var5++] = var114.field2887;
                            continue;
                        }
                        if (var493 == 2503) {
                            field803[var5++] = var114.field2782;
                            continue;
                        }
                        if (var493 == 2504) {
                            field803[var5++] = var114.field2774 ? 1 : 0;
                            continue;
                        }
                        if (var493 == 2505) {
                            field803[var5++] = var114.field2785;
                            continue;
                        }
                    } else if (var493 < 2700) {
                        var5--;
                        class174 var115 = class174.method634(field803[var5]);
                        if (var493 == 2600) {
                            field803[var5++] = var115.field2787;
                            continue;
                        }
                        if (var493 == 2601) {
                            field803[var5++] = var115.field2788;
                            continue;
                        }
                        if (var493 == 2602) {
                            field809[var6++] = var115.field2826;
                            continue;
                        }
                        if (var493 == 2603) {
                            field803[var5++] = var115.field2849;
                            continue;
                        }
                        if (var493 == 2604) {
                            field803[var5++] = var115.field2859;
                            continue;
                        }
                        if (var493 == 2605) {
                            field803[var5++] = var115.field2820;
                            continue;
                        }
                        if (var493 == 2606) {
                            field803[var5++] = var115.field2817;
                            continue;
                        }
                        if (var493 == 2607) {
                            field803[var5++] = var115.field2819;
                            continue;
                        }
                        if (var493 == 2608) {
                            field803[var5++] = var115.field2818;
                            continue;
                        }
                        if (var493 == 2609) {
                            field803[var5++] = var115.field2797;
                            continue;
                        }
                        if (var493 == 2610) {
                            field803[var5++] = var115.field2834;
                            continue;
                        }
                        if (var493 == 2611) {
                            field803[var5++] = var115.field2791;
                            continue;
                        }
                        if (var493 == 2612) {
                            field803[var5++] = var115.field2792;
                            continue;
                        }
                        if (var493 == 2613) {
                            field803[var5++] = var115.field2796.method541();
                            continue;
                        }
                    } else if (var493 < 2800) {
                        if (var493 == 2700) {
                            var5--;
                            class174 var116 = class174.method634(field803[var5]);
                            field803[var5++] = var116.field2886;
                            continue;
                        }
                        if (var493 == 2701) {
                            var5--;
                            class174 var117 = class174.method634(field803[var5]);
                            if (var117.field2886 == -1) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = var117.field2781;
                            }
                            continue;
                        }
                        if (var493 == 2702) {
                            var5--;
                            int var118 = field803[var5];
                            class4 var119 = (class4) client.field309.method3518((long) var118);
                            if (var119 == null) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = 1;
                            }
                            continue;
                        }
                        if (var493 == 2706) {
                            field803[var5++] = client.field413;
                            continue;
                        }
                    } else if (var493 < 2900) {
                        var5--;
                        class174 var120 = class174.method634(field803[var5]);
                        if (var493 == 2800) {
                            int[] var121 = field803;
                            int var122 = var5++;
                            int var123 = client.method942(var120);
                            int var124 = var123 >> 11 & 0x3F;
                            var121[var122] = var124;
                            continue;
                        }
                        if (var493 == 2801) {
                            var5--;
                            int var125 = field803[var5];
                            int var495 = var125 - 1;
                            if (var120.field2840 != null && var495 < var120.field2840.length && var120.field2840[var495] != null) {
                                field809[var6++] = var120.field2840[var495];
                                continue;
                            }
                            field809[var6++] = "";
                            continue;
                        }
                        if (var493 == 2802) {
                            if (var120.field2790 == null) {
                                field809[var6++] = "";
                            } else {
                                field809[var6++] = var120.field2790;
                            }
                            continue;
                        }
                    } else if (var493 < 3200) {
                        if (var493 == 3100) {
                            var6--;
                            String var126 = field809[var6];
                            class12.method2629(0, "", var126);
                            continue;
                        }
                        if (var493 == 3101) {
                            var5 -= 2;
                            client.method199(Statics.field1882, field803[var5], field803[var5 + 1]);
                            continue;
                        }
                        if (var493 == 3103) {
                            client.field323.method2583(224);
                            for (class4 var127 = (class4) client.field309.method3521(); var127 != null; var127 = (class4) client.field309.method3522()) {
                                if (var127.field63 == 0 || var127.field63 == 3) {
                                    client.method717(var127, true);
                                }
                            }
                            if (client.field442 != null) {
                                client.method687(client.field442);
                                client.field442 = null;
                            }
                            continue;
                        }
                        if (var493 == 3104) {
                            var6--;
                            String var128 = field809[var6];
                            int var129 = 0;
                            if (class164.method2686(var128)) {
                                int var130 = class164.method2575(var128, 10, true);
                                var129 = var130;
                            }
                            client.field323.method2583(181);
                            client.field323.method2326(var129);
                            continue;
                        }
                        if (var493 == 3105) {
                            var6--;
                            String var131 = field809[var6];
                            client.field323.method2583(82);
                            client.field323.method2323(var131.length() + 1);
                            client.field323.method2329(var131);
                            continue;
                        }
                        if (var493 == 3106) {
                            var6--;
                            String var132 = field809[var6];
                            client.field323.method2583(55);
                            client.field323.method2323(var132.length() + 1);
                            client.field323.method2329(var132);
                            continue;
                        }
                        if (var493 == 3107) {
                            var5--;
                            int var133 = field803[var5];
                            var6--;
                            String var134 = field809[var6];
                            int var135 = class33.field756;
                            int[] var136 = class33.field757;
                            boolean var137 = false;
                            for (int var138 = 0; var138 < var135; var138++) {
                                class3 var139 = client.field492[var136[var138]];
                                if (var139 != null && Statics.field1882 != var139 && var139.field60 != null && var139.field60.equalsIgnoreCase(var134)) {
                                    if (var133 == 1) {
                                        client.field323.method2583(89);
                                        client.field323.method2436(0);
                                        client.field323.method2371(var136[var138]);
                                    } else if (var133 == 4) {
                                        client.field323.method2583(128);
                                        client.field323.method2507(var136[var138]);
                                        client.field323.method2527(0);
                                    } else if (var133 == 6) {
                                        client.field323.method2583(134);
                                        client.field323.method2323(0);
                                        client.field323.method2403(var136[var138]);
                                    } else if (var133 == 7) {
                                        client.field323.method2583(52);
                                        client.field323.method2371(var136[var138]);
                                        client.field323.method2362(0);
                                    }
                                    var137 = true;
                                    break;
                                }
                            }
                            if (!var137) {
                                class12.method2629(4, "", class158.field2547 + var134);
                            }
                            continue;
                        }
                        if (var493 == 3108) {
                            var5 -= 3;
                            int var140 = field803[var5];
                            int var141 = field803[var5 + 1];
                            int var142 = field803[var5 + 2];
                            class174 var143 = class174.method634(var142);
                            client.method2652(var143, var140, var141);
                            continue;
                        }
                        if (var493 == 3109) {
                            var5 -= 2;
                            int var144 = field803[var5];
                            int var145 = field803[var5 + 1];
                            class174 var146 = var62 ? Statics.field2174 : Statics.field186;
                            client.method2652(var146, var144, var145);
                            continue;
                        }
                        if (var493 == 3110) {
                            var5--;
                            Statics.field1564 = field803[var5] == 1;
                            continue;
                        }
                        if (var493 == 3111) {
                            field803[var5++] = Statics.field1389.field149 ? 1 : 0;
                            continue;
                        }
                        if (var493 == 3112) {
                            var5--;
                            Statics.field1389.field149 = field803[var5] == 1;
                            class9.method99();
                            continue;
                        }
                        if (var493 == 3113) {
                            var6--;
                            String var147 = field809[var6];
                            var5--;
                            boolean var148 = field803[var5] == 1;
                            class139.method2134(var147, var148, "openjs", false);
                            continue;
                        }
                        if (var493 == 3115) {
                            var5--;
                            int var149 = field803[var5];
                            client.field323.method2583(234);
                            client.field323.method2507(var149);
                            continue;
                        }
                        if (var493 == 3116) {
                            var5--;
                            int var150 = field803[var5];
                            var6 -= 2;
                            String var151 = field809[var6];
                            String var152 = field809[var6 + 1];
                            if (var151.length() <= 500 && var152.length() <= 500) {
                                client.field323.method2583(167);
                                client.field323.method2507(1 + class120.method636(var151) + class120.method636(var152));
                                client.field323.method2323(var150);
                                client.field323.method2329(var152);
                                client.field323.method2329(var151);
                            }
                            continue;
                        }
                    } else if (var493 < 3300) {
                        if (var493 == 3200) {
                            var5 -= 3;
                            client.method2921(field803[var5], field803[var5 + 1], field803[var5 + 2]);
                            continue;
                        }
                        if (var493 == 3201) {
                            var5--;
                            client.method1554(field803[var5]);
                            continue;
                        }
                        if (var493 == 3202) {
                            var5 -= 2;
                            Statics.method2273(field803[var5], field803[var5 + 1]);
                            continue;
                        }
                    } else if (var493 < 3400) {
                        if (var493 == 3300) {
                            field803[var5++] = client.field336;
                            continue;
                        }
                        if (var493 == 3301) {
                            var5 -= 2;
                            int var153 = field803[var5];
                            int var154 = field803[var5 + 1];
                            int[] var155 = field803;
                            int var156 = var5++;
                            class16 var157 = (class16) class16.field205.method3518((long) var153);
                            int var158;
                            if (var157 == null) {
                                var158 = -1;
                            } else if (var154 >= 0 && var154 < var157.field211.length) {
                                var158 = var157.field211[var154];
                            } else {
                                var158 = -1;
                            }
                            var155[var156] = var158;
                            continue;
                        }
                        if (var493 == 3302) {
                            var5 -= 2;
                            int var159 = field803[var5];
                            int var160 = field803[var5 + 1];
                            field803[var5++] = class16.method549(var159, var160);
                            continue;
                        }
                        if (var493 == 3303) {
                            var5 -= 2;
                            int var161 = field803[var5];
                            int var162 = field803[var5 + 1];
                            int[] var163 = field803;
                            int var164 = var5++;
                            class16 var165 = (class16) class16.field205.method3518((long) var161);
                            int var166;
                            if (var165 == null) {
                                var166 = 0;
                            } else if (var162 == -1) {
                                var166 = 0;
                            } else {
                                int var167 = 0;
                                for (int var168 = 0; var168 < var165.field207.length; var168++) {
                                    if (var165.field211[var168] == var162) {
                                        var167 += var165.field207[var168];
                                    }
                                }
                                var166 = var167;
                            }
                            var163[var164] = var166;
                            continue;
                        }
                        if (var493 == 3304) {
                            var5--;
                            int var169 = field803[var5];
                            int[] var170 = field803;
                            int var171 = var5++;
                            class51 var172 = (class51) class51.field1104.method3484((long) var169);
                            class51 var173;
                            if (var172 == null) {
                                byte[] var174 = Statics.field1103.method3014(5, var169);
                                class51 var175 = new class51();
                                if (var174 != null) {
                                    var175.method964(new class120(var174));
                                }
                                class51.field1104.method3486(var175, (long) var169);
                                var173 = var175;
                            } else {
                                var173 = var172;
                            }
                            var170[var171] = var173.field1102;
                            continue;
                        }
                        if (var493 == 3305) {
                            var5--;
                            int var176 = field803[var5];
                            field803[var5++] = client.field400[var176];
                            continue;
                        }
                        if (var493 == 3306) {
                            var5--;
                            int var177 = field803[var5];
                            field803[var5++] = client.field416[var177];
                            continue;
                        }
                        if (var493 == 3307) {
                            var5--;
                            int var178 = field803[var5];
                            field803[var5++] = client.field428[var178];
                            continue;
                        }
                        if (var493 == 3308) {
                            int var179 = Statics.field582;
                            int var180 = (Statics.field1882.field824 >> 7) + Statics.field595;
                            int var181 = (Statics.field1882.field814 >> 7) + Statics.field1982;
                            field803[var5++] = (var179 << 28) + (var180 << 14) + var181;
                            continue;
                        }
                        if (var493 == 3309) {
                            var5--;
                            int var182 = field803[var5];
                            field803[var5++] = var182 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var493 == 3310) {
                            var5--;
                            int var183 = field803[var5];
                            field803[var5++] = var183 >> 28;
                            continue;
                        }
                        if (var493 == 3311) {
                            var5--;
                            int var184 = field803[var5];
                            field803[var5++] = var184 & 0x3FFF;
                            continue;
                        }
                        if (var493 == 3312) {
                            field803[var5++] = client.field448 ? 1 : 0;
                            continue;
                        }
                        if (var493 == 3313) {
                            var5 -= 2;
                            int var185 = field803[var5] + 32768;
                            int var186 = field803[var5 + 1];
                            int[] var187 = field803;
                            int var188 = var5++;
                            class16 var189 = (class16) class16.field205.method3518((long) var185);
                            int var190;
                            if (var189 == null) {
                                var190 = -1;
                            } else if (var186 >= 0 && var186 < var189.field211.length) {
                                var190 = var189.field211[var186];
                            } else {
                                var190 = -1;
                            }
                            var187[var188] = var190;
                            continue;
                        }
                        if (var493 == 3314) {
                            var5 -= 2;
                            int var191 = field803[var5] + 32768;
                            int var192 = field803[var5 + 1];
                            field803[var5++] = class16.method549(var191, var192);
                            continue;
                        }
                        if (var493 == 3315) {
                            var5 -= 2;
                            int var193 = field803[var5] + 32768;
                            int var194 = field803[var5 + 1];
                            field803[var5++] = class16.method692(var193, var194);
                            continue;
                        }
                        if (var493 == 3316) {
                            if (client.field518 >= 2) {
                                field803[var5++] = client.field518;
                            } else {
                                field803[var5++] = 0;
                            }
                            continue;
                        }
                        if (var493 == 3317) {
                            field803[var5++] = client.field296;
                            continue;
                        }
                        if (var493 == 3318) {
                            field803[var5++] = client.field552;
                            continue;
                        }
                        if (var493 == 3321) {
                            field803[var5++] = client.field302;
                            continue;
                        }
                        if (var493 == 3322) {
                            field803[var5++] = client.field438;
                            continue;
                        }
                        if (var493 == 3323) {
                            if (client.field503) {
                                field803[var5++] = 1;
                            } else {
                                field803[var5++] = 0;
                            }
                            continue;
                        }
                        if (var493 == 3324) {
                            field803[var5++] = client.field280;
                            continue;
                        }
                    } else if (var493 < 3500) {
                        if (var493 == 3400) {
                            var5 -= 2;
                            int var195 = field803[var5];
                            int var196 = field803[var5 + 1];
                            class49 var197 = class49.method1762(var195);
                            if (var197.field1077 != 's') {
                            }
                            for (int var198 = 0; var198 < var197.field1080; var198++) {
                                if (var197.field1081[var198] == var196) {
                                    field809[var6++] = var197.field1078[var198];
                                    var197 = null;
                                    break;
                                }
                            }
                            if (var197 != null) {
                                field809[var6++] = var197.field1088;
                            }
                            continue;
                        }
                        if (var493 == 3408) {
                            var5 -= 4;
                            int var199 = field803[var5];
                            int var200 = field803[var5 + 1];
                            int var201 = field803[var5 + 2];
                            int var202 = field803[var5 + 3];
                            class49 var203 = class49.method1762(var201);
                            if (var203.field1076 == var199 && var203.field1077 == var200) {
                                for (int var204 = 0; var204 < var203.field1080; var204++) {
                                    if (var203.field1081[var204] == var202) {
                                        if (var200 == 115) {
                                            field809[var6++] = var203.field1078[var204];
                                        } else {
                                            field803[var5++] = var203.field1082[var204];
                                        }
                                        var203 = null;
                                        break;
                                    }
                                }
                                if (var203 != null) {
                                    if (var200 == 115) {
                                        field809[var6++] = var203.field1088;
                                    } else {
                                        field803[var5++] = var203.field1079;
                                    }
                                }
                                continue;
                            }
                            if (var200 == 115) {
                                field809[var6++] = "null";
                            } else {
                                field803[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var493 < 3700) {
                        if (var493 == 3600) {
                            if (client.field545 == 0) {
                                field803[var5++] = -2;
                            } else if (client.field545 == 1) {
                                field803[var5++] = -1;
                            } else {
                                field803[var5++] = client.field500;
                            }
                            continue;
                        }
                        if (var493 == 3601) {
                            var5--;
                            int var205 = field803[var5];
                            if (client.field545 == 2 && var205 < client.field500) {
                                field809[var6++] = client.field549[var205].field248;
                                field809[var6++] = client.field549[var205].field241;
                                continue;
                            }
                            field809[var6++] = "";
                            field809[var6++] = "";
                            continue;
                        }
                        if (var493 == 3602) {
                            var5--;
                            int var206 = field803[var5];
                            if (client.field545 == 2 && var206 < client.field500) {
                                field803[var5++] = client.field549[var206].field245;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var493 == 3603) {
                            var5--;
                            int var207 = field803[var5];
                            if (client.field545 == 2 && var207 < client.field500) {
                                field803[var5++] = client.field549[var207].field238;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var493 == 3604) {
                            var6--;
                            String var208 = field809[var6];
                            var5--;
                            int var209 = field803[var5];
                            client.method30(var208, var209);
                            continue;
                        }
                        if (var493 == 3605) {
                            var6--;
                            String var210 = field809[var6];
                            if (var210 == null) {
                                continue;
                            }
                            if ((client.field500 < 200 || client.field403 == 1) && client.field500 < 400) {
                                String var211 = class165.method679(var210, Statics.field25);
                                if (var211 == null) {
                                    continue;
                                }
                                for (int var212 = 0; var212 < client.field500; var212++) {
                                    class18 var213 = client.field549[var212];
                                    String var214 = class165.method679(var213.field248, Statics.field25);
                                    if (var214 != null && var214.equals(var211)) {
                                        class12.method2629(30, "", var210 + class158.field2389);
                                        continue label3317;
                                    }
                                    if (var213.field241 != null) {
                                        String var215 = class165.method679(var213.field241, Statics.field25);
                                        if (var215 != null && var215.equals(var211)) {
                                            class12.method2629(30, "", var210 + class158.field2389);
                                            continue label3317;
                                        }
                                    }
                                }
                                for (int var216 = 0; var216 < client.field551; var216++) {
                                    class8 var217 = client.field345[var216];
                                    String var218 = class165.method679(var217.field134, Statics.field25);
                                    if (var218 != null && var218.equals(var211)) {
                                        class12.method2629(30, "", class158.field2489 + var210 + class158.field2369);
                                        continue label3317;
                                    }
                                    if (var217.field136 != null) {
                                        String var219 = class165.method679(var217.field136, Statics.field25);
                                        if (var219 != null && var219.equals(var211)) {
                                            class12.method2629(30, "", class158.field2489 + var210 + class158.field2369);
                                            continue label3317;
                                        }
                                    }
                                }
                                if (class165.method679(Statics.field1882.field60, Statics.field25).equals(var211)) {
                                    class12.method2629(30, "", class158.field2468);
                                } else {
                                    client.field323.method2583(130);
                                    client.field323.method2323(class120.method636(var210));
                                    client.field323.method2329(var210);
                                }
                                continue;
                            }
                            class12.method2629(30, "", class158.field2392);
                            continue;
                        }
                        if (var493 == 3606) {
                            var6--;
                            String var220 = field809[var6];
                            if (var220 == null) {
                                continue;
                            }
                            String var221 = class165.method679(var220, Statics.field25);
                            if (var221 == null) {
                                continue;
                            }
                            int var222 = 0;
                            while (true) {
                                if (var222 >= client.field500) {
                                    continue label3317;
                                }
                                class18 var223 = client.field549[var222];
                                String var224 = var223.field248;
                                String var225 = class165.method679(var224, Statics.field25);
                                boolean var226;
                                if (var220 == null || var224 == null) {
                                    var226 = false;
                                } else if (var220.startsWith("#") || var224.startsWith("#")) {
                                    var226 = var220.equals(var224);
                                } else {
                                    var226 = var221.equals(var225);
                                }
                                if (var226) {
                                    client.field500--;
                                    for (int var227 = var222; var227 < client.field500; var227++) {
                                        client.field549[var227] = client.field549[var227 + 1];
                                    }
                                    client.field471 = client.field463;
                                    client.field323.method2583(131);
                                    client.field323.method2323(class120.method636(var220));
                                    client.field323.method2329(var220);
                                    continue label3317;
                                }
                                var222++;
                            }
                        }
                        if (var493 == 3607) {
                            var6--;
                            String var228 = field809[var6];
                            client.method7(var228, false);
                            continue;
                        }
                        if (var493 == 3608) {
                            var6--;
                            String var229 = field809[var6];
                            client.method2737(var229);
                            continue;
                        }
                        if (var493 == 3609) {
                            var6--;
                            String var230 = field809[var6];
                            class153[] var231 = class153.method2287();
                            for (int var232 = 0; var232 < var231.length; var232++) {
                                class153 var233 = var231[var232];
                                if (var233.field2284 != -1 && var230.startsWith(class2.method2927(var233.field2284))) {
                                    var230 = var230.substring(6 + Integer.toString(var233.field2284).length());
                                    break;
                                }
                            }
                            field803[var5++] = client.method236(var230, false) ? 1 : 0;
                            continue;
                        }
                        if (var493 == 3611) {
                            if (client.field505 == null) {
                                field809[var6++] = "";
                                continue;
                            }
                            String[] var234 = field809;
                            int var235 = var6++;
                            String var236 = client.field505;
                            long var237 = 0L;
                            int var239 = var236.length();
                            for (int var240 = 0; var240 < var239; var240++) {
                                var237 *= 37L;
                                char var241 = var236.charAt(var240);
                                if (var241 >= 'A' && var241 <= 'Z') {
                                    var237 += (long) (var241 + 1 - 65);
                                } else if (var241 >= 'a' && var241 <= 'z') {
                                    var237 += (long) (var241 + 1 - 97);
                                } else if (var241 >= '0' && var241 <= '9') {
                                    var237 += (long) (var241 + 27 - 48);
                                }
                                if (var237 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var237 % 37L == 0L && var237 != 0L) {
                                var237 /= 37L;
                            }
                            String var244 = class163.method693(var237);
                            if (var244 == null) {
                                var244 = "";
                            }
                            var234[var235] = var244;
                            continue;
                        }
                        if (var493 == 3612) {
                            if (client.field505 == null) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = Statics.field1960;
                            }
                            continue;
                        }
                        if (var493 == 3613) {
                            var5--;
                            int var246 = field803[var5];
                            if (client.field505 != null && var246 < Statics.field1960) {
                                field809[var6++] = Statics.field2613[var246].field617;
                                continue;
                            }
                            field809[var6++] = "";
                            continue;
                        }
                        if (var493 == 3614) {
                            var5--;
                            int var247 = field803[var5];
                            if (client.field505 != null && var247 < Statics.field1960) {
                                field803[var5++] = Statics.field2613[var247].field619;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var493 == 3615) {
                            var5--;
                            int var248 = field803[var5];
                            if (client.field505 != null && var248 < Statics.field1960) {
                                field803[var5++] = Statics.field2613[var248].field623;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var493 == 3616) {
                            field803[var5++] = Statics.field780;
                            continue;
                        }
                        if (var493 == 3617) {
                            var6--;
                            String var249 = field809[var6];
                            if (Statics.field2613 != null) {
                                client.field323.method2583(50);
                                client.field323.method2323(class120.method636(var249));
                                client.field323.method2329(var249);
                            }
                            continue;
                        }
                        if (var493 == 3618) {
                            field803[var5++] = Statics.field397;
                            continue;
                        }
                        if (var493 == 3619) {
                            var6--;
                            String var250 = field809[var6];
                            if (!var250.equals("")) {
                                client.field323.method2583(21);
                                client.field323.method2323(class120.method636(var250));
                                client.field323.method2329(var250);
                            }
                            continue;
                        }
                        if (var493 == 3620) {
                            client.method2540();
                            continue;
                        }
                        if (var493 == 3621) {
                            if (client.field545 == 0) {
                                field803[var5++] = -1;
                            } else {
                                field803[var5++] = client.field551;
                            }
                            continue;
                        }
                        if (var493 == 3622) {
                            var5--;
                            int var251 = field803[var5];
                            if (client.field545 != 0 && var251 < client.field551) {
                                field809[var6++] = client.field345[var251].field134;
                                field809[var6++] = client.field345[var251].field136;
                                continue;
                            }
                            field809[var6++] = "";
                            field809[var6++] = "";
                            continue;
                        }
                        if (var493 == 3623) {
                            var6--;
                            String var252 = field809[var6];
                            if (var252.startsWith(class2.method2927(0)) || var252.startsWith(class2.method2927(1))) {
                                var252 = var252.substring(7);
                            }
                            field803[var5++] = client.method191(var252) ? 1 : 0;
                            continue;
                        }
                        if (var493 == 3624) {
                            var5--;
                            int var253 = field803[var5];
                            if (Statics.field2613 != null && var253 < Statics.field1960 && Statics.field2613[var253].field617.equalsIgnoreCase(Statics.field1882.field60)) {
                                field803[var5++] = 1;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var493 == 3625) {
                            if (client.field417 == null) {
                                field809[var6++] = "";
                                continue;
                            }
                            String[] var254 = field809;
                            int var255 = var6++;
                            String var256 = client.field417;
                            long var257 = 0L;
                            int var259 = var256.length();
                            for (int var260 = 0; var260 < var259; var260++) {
                                var257 *= 37L;
                                char var261 = var256.charAt(var260);
                                if (var261 >= 'A' && var261 <= 'Z') {
                                    var257 += (long) (var261 + 1 - 65);
                                } else if (var261 >= 'a' && var261 <= 'z') {
                                    var257 += (long) (var261 + 1 - 97);
                                } else if (var261 >= '0' && var261 <= '9') {
                                    var257 += (long) (var261 + 27 - 48);
                                }
                                if (var257 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var257 % 37L == 0L && var257 != 0L) {
                                var257 /= 37L;
                            }
                            String var264 = class163.method693(var257);
                            if (var264 == null) {
                                var264 = "";
                            }
                            var254[var255] = var264;
                            continue;
                        }
                    } else if (var493 < 4000) {
                        if (var493 == 3903) {
                            var5--;
                            int var266 = field803[var5];
                            field803[var5++] = client.field389[var266].method3709();
                            continue;
                        }
                        if (var493 == 3904) {
                            var5--;
                            int var267 = field803[var5];
                            field803[var5++] = client.field389[var267].field3179;
                            continue;
                        }
                        if (var493 == 3905) {
                            var5--;
                            int var268 = field803[var5];
                            field803[var5++] = client.field389[var268].field3177;
                            continue;
                        }
                        if (var493 == 3906) {
                            var5--;
                            int var269 = field803[var5];
                            field803[var5++] = client.field389[var269].field3178;
                            continue;
                        }
                        if (var493 == 3907) {
                            var5--;
                            int var270 = field803[var5];
                            field803[var5++] = client.field389[var270].field3175;
                            continue;
                        }
                        if (var493 == 3908) {
                            var5--;
                            int var271 = field803[var5];
                            field803[var5++] = client.field389[var271].field3180;
                            continue;
                        }
                        if (var493 == 3910) {
                            var5--;
                            int var272 = field803[var5];
                            int var273 = client.field389[var272].method3715();
                            field803[var5++] = var273 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var493 == 3911) {
                            var5--;
                            int var274 = field803[var5];
                            int var275 = client.field389[var274].method3715();
                            field803[var5++] = var275 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var493 == 3912) {
                            var5--;
                            int var276 = field803[var5];
                            int var277 = client.field389[var276].method3715();
                            field803[var5++] = var277 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var493 == 3913) {
                            var5--;
                            int var278 = field803[var5];
                            int var279 = client.field389[var278].method3715();
                            field803[var5++] = var279 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var493 == 3914) {
                            var5--;
                            boolean var280 = field803[var5] == 1;
                            if (Statics.field872 != null) {
                                Statics.field872.method3726(class222.field3183, var280);
                            }
                            continue;
                        }
                        if (var493 == 3915) {
                            var5--;
                            boolean var281 = field803[var5] == 1;
                            if (Statics.field872 != null) {
                                Statics.field872.method3726(class222.field3186, var281);
                            }
                            continue;
                        }
                        if (var493 == 3916) {
                            var5 -= 2;
                            boolean var282 = field803[var5] == 1;
                            boolean var283 = field803[var5 + 1] == 1;
                            if (Statics.field872 != null) {
                                Statics.field872.method3726(new class22(var283), var282);
                            }
                            continue;
                        }
                        if (var493 == 3917) {
                            var5--;
                            boolean var284 = field803[var5] == 1;
                            if (Statics.field872 != null) {
                                Statics.field872.method3726(class222.field3182, var284);
                            }
                            continue;
                        }
                        if (var493 == 3918) {
                            var5--;
                            boolean var285 = field803[var5] == 1;
                            if (Statics.field872 != null) {
                                Statics.field872.method3726(class222.field3181, var285);
                            }
                            continue;
                        }
                        if (var493 == 3919) {
                            field803[var5++] = Statics.field872 == null ? 0 : Statics.field872.field3184.size();
                            continue;
                        }
                        if (var493 == 3920) {
                            var5--;
                            int var286 = field803[var5];
                            class215 var287 = (class215) Statics.field872.field3184.get(var286);
                            field803[var5++] = var287.field3162;
                            continue;
                        }
                        if (var493 == 3921) {
                            var5--;
                            int var288 = field803[var5];
                            class215 var289 = (class215) Statics.field872.field3184.get(var288);
                            field809[var6++] = var289.method3665();
                            continue;
                        }
                        if (var493 == 3922) {
                            var5--;
                            int var290 = field803[var5];
                            class215 var291 = (class215) Statics.field872.field3184.get(var290);
                            field809[var6++] = var291.method3666();
                            continue;
                        }
                        if (var493 == 3923) {
                            var5--;
                            int var292 = field803[var5];
                            class215 var293 = (class215) Statics.field872.field3184.get(var292);
                            long var294 = class116.method157() - Statics.field67 - var293.field3161;
                            int var296 = (int) (var294 / 3600000L);
                            int var297 = (int) ((var294 - (long) (var296 * 3600000)) / 60000L);
                            int var298 = (int) ((var294 - (long) (var296 * 3600000) - (long) (var297 * 60000)) / 1000L);
                            String var299 = var296 + ":" + var297 / 10 + var297 % 10 + ":" + var298 / 10 + var298 % 10;
                            field809[var6++] = var299;
                            continue;
                        }
                        if (var493 == 3924) {
                            var5--;
                            int var300 = field803[var5];
                            class215 var301 = (class215) Statics.field872.field3184.get(var300);
                            field803[var5++] = var301.field3160.field3178;
                            continue;
                        }
                        if (var493 == 3925) {
                            var5--;
                            int var302 = field803[var5];
                            class215 var303 = (class215) Statics.field872.field3184.get(var302);
                            field803[var5++] = var303.field3160.field3177;
                            continue;
                        }
                        if (var493 == 3926) {
                            var5--;
                            int var304 = field803[var5];
                            class215 var305 = (class215) Statics.field872.field3184.get(var304);
                            field803[var5++] = var305.field3160.field3179;
                            continue;
                        }
                    } else if (var493 < 4100) {
                        if (var493 == 4000) {
                            var5 -= 2;
                            int var306 = field803[var5];
                            int var307 = field803[var5 + 1];
                            field803[var5++] = var306 + var307;
                            continue;
                        }
                        if (var493 == 4001) {
                            var5 -= 2;
                            int var308 = field803[var5];
                            int var309 = field803[var5 + 1];
                            field803[var5++] = var308 - var309;
                            continue;
                        }
                        if (var493 == 4002) {
                            var5 -= 2;
                            int var310 = field803[var5];
                            int var311 = field803[var5 + 1];
                            field803[var5++] = var310 * var311;
                            continue;
                        }
                        if (var493 == 4003) {
                            var5 -= 2;
                            int var312 = field803[var5];
                            int var313 = field803[var5 + 1];
                            field803[var5++] = var312 / var313;
                            continue;
                        }
                        if (var493 == 4004) {
                            var5--;
                            int var314 = field803[var5];
                            field803[var5++] = (int) (Math.random() * (double) var314);
                            continue;
                        }
                        if (var493 == 4005) {
                            var5--;
                            int var315 = field803[var5];
                            field803[var5++] = (int) (Math.random() * (double) (var315 + 1));
                            continue;
                        }
                        if (var493 == 4006) {
                            var5 -= 5;
                            int var316 = field803[var5];
                            int var317 = field803[var5 + 1];
                            int var318 = field803[var5 + 2];
                            int var319 = field803[var5 + 3];
                            int var320 = field803[var5 + 4];
                            field803[var5++] = (var317 - var316) * (var320 - var318) / (var319 - var318) + var316;
                            continue;
                        }
                        if (var493 == 4007) {
                            var5 -= 2;
                            int var321 = field803[var5];
                            int var322 = field803[var5 + 1];
                            field803[var5++] = var321 * var322 / 100 + var321;
                            continue;
                        }
                        if (var493 == 4008) {
                            var5 -= 2;
                            int var323 = field803[var5];
                            int var324 = field803[var5 + 1];
                            field803[var5++] = var323 | 0x1 << var324;
                            continue;
                        }
                        if (var493 == 4009) {
                            var5 -= 2;
                            int var325 = field803[var5];
                            int var326 = field803[var5 + 1];
                            field803[var5++] = var325 & -1 - (0x1 << var326);
                            continue;
                        }
                        if (var493 == 4010) {
                            var5 -= 2;
                            int var327 = field803[var5];
                            int var328 = field803[var5 + 1];
                            field803[var5++] = (var327 & 0x1 << var328) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var493 == 4011) {
                            var5 -= 2;
                            int var329 = field803[var5];
                            int var330 = field803[var5 + 1];
                            field803[var5++] = var329 % var330;
                            continue;
                        }
                        if (var493 == 4012) {
                            var5 -= 2;
                            int var331 = field803[var5];
                            int var332 = field803[var5 + 1];
                            if (var331 == 0) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = (int) Math.pow((double) var331, (double) var332);
                            }
                            continue;
                        }
                        if (var493 == 4013) {
                            var5 -= 2;
                            int var333 = field803[var5];
                            int var334 = field803[var5 + 1];
                            if (var333 == 0) {
                                field803[var5++] = 0;
                            } else if (var334 == 0) {
                                field803[var5++] = Integer.MAX_VALUE;
                            } else {
                                field803[var5++] = (int) Math.pow((double) var333, 1.0D / (double) var334);
                            }
                            continue;
                        }
                        if (var493 == 4014) {
                            var5 -= 2;
                            int var335 = field803[var5];
                            int var336 = field803[var5 + 1];
                            field803[var5++] = var335 & var336;
                            continue;
                        }
                        if (var493 == 4015) {
                            var5 -= 2;
                            int var337 = field803[var5];
                            int var338 = field803[var5 + 1];
                            field803[var5++] = var337 | var338;
                            continue;
                        }
                        if (var493 == 4018) {
                            var5 -= 3;
                            long var339 = (long) field803[var5];
                            long var341 = (long) field803[var5 + 1];
                            long var343 = (long) field803[var5 + 2];
                            field803[var5++] = (int) (var339 * var343 / var341);
                            continue;
                        }
                    } else if (var493 < 4200) {
                        if (var493 == 4100) {
                            var6--;
                            String var345 = field809[var6];
                            var5--;
                            int var346 = field803[var5];
                            field809[var6++] = var345 + var346;
                            continue;
                        }
                        if (var493 == 4101) {
                            var6 -= 2;
                            String var347 = field809[var6];
                            String var348 = field809[var6 + 1];
                            field809[var6++] = var347 + var348;
                            continue;
                        }
                        if (var493 == 4102) {
                            var6--;
                            String var349 = field809[var6];
                            var5--;
                            int var350 = field803[var5];
                            field809[var6++] = var349 + class164.method854(var350, true);
                            continue;
                        }
                        if (var493 == 4103) {
                            var6--;
                            String var351 = field809[var6];
                            field809[var6++] = var351.toLowerCase();
                            continue;
                        }
                        if (var493 == 4104) {
                            var5--;
                            int var352 = field803[var5];
                            long var353 = ((long) var352 + 11745L) * 86400000L;
                            field807.setTime(new Date(var353));
                            int var355 = field807.get(5);
                            int var356 = field807.get(2);
                            int var357 = field807.get(1);
                            field809[var6++] = var355 + "-" + field808[var356] + "-" + var357;
                            continue;
                        }
                        if (var493 == 4105) {
                            var6 -= 2;
                            String var358 = field809[var6];
                            String var359 = field809[var6 + 1];
                            if (Statics.field1882.field35 != null && Statics.field1882.field35.field2937) {
                                field809[var6++] = var359;
                                continue;
                            }
                            field809[var6++] = var358;
                            continue;
                        }
                        if (var493 == 4106) {
                            var5--;
                            int var360 = field803[var5];
                            field809[var6++] = Integer.toString(var360);
                            continue;
                        }
                        if (var493 == 4107) {
                            var6 -= 2;
                            int[] var361 = field803;
                            int var362 = var5++;
                            int var363 = class167.method2990(field809[var6], field809[var6 + 1], client.field286);
                            byte var364;
                            if (var363 > 0) {
                                var364 = 1;
                            } else if (var363 < 0) {
                                var364 = -1;
                            } else {
                                var364 = 0;
                            }
                            var361[var362] = var364;
                            continue;
                        }
                        if (var493 == 4108) {
                            var6--;
                            String var365 = field809[var6];
                            var5 -= 2;
                            int var366 = field803[var5];
                            int var367 = field803[var5 + 1];
                            byte[] var368 = Statics.field148.method3014(var367, 0);
                            class225 var369 = new class225(var368);
                            field803[var5++] = var369.method3741(var365, var366);
                            continue;
                        }
                        if (var493 == 4109) {
                            var6--;
                            String var370 = field809[var6];
                            var5 -= 2;
                            int var371 = field803[var5];
                            int var372 = field803[var5 + 1];
                            byte[] var373 = Statics.field148.method3014(var372, 0);
                            class225 var374 = new class225(var373);
                            field803[var5++] = var374.method3764(var370, var371);
                            continue;
                        }
                        if (var493 == 4110) {
                            var6 -= 2;
                            String var375 = field809[var6];
                            String var376 = field809[var6 + 1];
                            var5--;
                            if (field803[var5] == 1) {
                                field809[var6++] = var375;
                            } else {
                                field809[var6++] = var376;
                            }
                            continue;
                        }
                        if (var493 == 4111) {
                            var6--;
                            String var377 = field809[var6];
                            field809[var6++] = class224.method3742(var377);
                            continue;
                        }
                        if (var493 == 4112) {
                            var6--;
                            String var378 = field809[var6];
                            var5--;
                            int var379 = field803[var5];
                            field809[var6++] = var378 + (char) var379;
                            continue;
                        }
                        if (var493 == 4113) {
                            var5--;
                            int var380 = field803[var5];
                            int[] var381 = field803;
                            int var382 = var5++;
                            char var383 = (char) var380;
                            boolean var384;
                            if (var383 >= ' ' && var383 <= '~') {
                                var384 = true;
                            } else if (var383 >= 160 && var383 <= 255) {
                                var384 = true;
                            } else if (var383 == 8364 || var383 == 338 || var383 == 8212 || var383 == 339 || var383 == 376) {
                                var384 = true;
                            } else {
                                var384 = false;
                            }
                            var381[var382] = var384 ? 1 : 0;
                            continue;
                        }
                        if (var493 == 4114) {
                            var5--;
                            int var385 = field803[var5];
                            field803[var5++] = class164.method683((char) var385) ? 1 : 0;
                            continue;
                        }
                        if (var493 == 4115) {
                            var5--;
                            int var386 = field803[var5];
                            int[] var387 = field803;
                            int var388 = var5++;
                            char var389 = (char) var386;
                            boolean var390 = var389 >= 'A' && var389 <= 'Z' || var389 >= 'a' && var389 <= 'z';
                            var387[var388] = var390 ? 1 : 0;
                            continue;
                        }
                        if (var493 == 4116) {
                            var5--;
                            int var391 = field803[var5];
                            int[] var392 = field803;
                            int var393 = var5++;
                            char var394 = (char) var391;
                            boolean var395 = var394 >= '0' && var394 <= '9';
                            var392[var393] = var395 ? 1 : 0;
                            continue;
                        }
                        if (var493 == 4117) {
                            var6--;
                            String var396 = field809[var6];
                            if (var396 == null) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = var396.length();
                            }
                            continue;
                        }
                        if (var493 == 4118) {
                            var6--;
                            String var397 = field809[var6];
                            var5 -= 2;
                            int var398 = field803[var5];
                            int var399 = field803[var5 + 1];
                            field809[var6++] = var397.substring(var398, var399);
                            continue;
                        }
                        if (var493 == 4119) {
                            var6--;
                            String var400 = field809[var6];
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
                            field809[var6++] = var401.toString();
                            continue;
                        }
                        if (var493 == 4120) {
                            var6--;
                            String var405 = field809[var6];
                            var5--;
                            int var406 = field803[var5];
                            field803[var5++] = var405.indexOf(var406);
                            continue;
                        }
                        if (var493 == 4121) {
                            var6 -= 2;
                            String var407 = field809[var6];
                            String var408 = field809[var6 + 1];
                            var5--;
                            int var409 = field803[var5];
                            field803[var5++] = var407.indexOf(var408, var409);
                            continue;
                        }
                    } else if (var493 < 4300) {
                        if (var493 == 4200) {
                            var5--;
                            int var410 = field803[var5];
                            field809[var6++] = class52.method126(var410).field1129;
                            continue;
                        }
                        if (var493 == 4201) {
                            var5 -= 2;
                            int var411 = field803[var5];
                            int var412 = field803[var5 + 1];
                            class52 var413 = class52.method126(var411);
                            if (var412 >= 1 && var412 <= 5 && var413.field1131[var412 - 1] != null) {
                                field809[var6++] = var413.field1131[var412 - 1];
                                continue;
                            }
                            field809[var6++] = "";
                            continue;
                        }
                        if (var493 == 4202) {
                            var5 -= 2;
                            int var414 = field803[var5];
                            int var415 = field803[var5 + 1];
                            class52 var416 = class52.method126(var414);
                            if (var415 >= 1 && var415 <= 5 && var416.field1125[var415 - 1] != null) {
                                field809[var6++] = var416.field1125[var415 - 1];
                                continue;
                            }
                            field809[var6++] = "";
                            continue;
                        }
                        if (var493 == 4203) {
                            var5--;
                            int var417 = field803[var5];
                            field803[var5++] = class52.method126(var417).field1112;
                            continue;
                        }
                        if (var493 == 4204) {
                            var5--;
                            int var418 = field803[var5];
                            field803[var5++] = class52.method126(var418).field1128 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var493 == 4205) {
                            var5--;
                            int var419 = field803[var5];
                            class52 var420 = class52.method126(var419);
                            if (var420.field1148 == -1 && var420.field1147 >= 0) {
                                field803[var5++] = var420.field1147;
                                continue;
                            }
                            field803[var5++] = var419;
                            continue;
                        }
                        if (var493 == 4206) {
                            var5--;
                            int var421 = field803[var5];
                            class52 var422 = class52.method126(var421);
                            if (var422.field1148 >= 0 && var422.field1147 >= 0) {
                                field803[var5++] = var422.field1147;
                                continue;
                            }
                            field803[var5++] = var421;
                            continue;
                        }
                        if (var493 == 4207) {
                            var5--;
                            int var423 = field803[var5];
                            field803[var5++] = class52.method126(var423).field1130 ? 1 : 0;
                            continue;
                        }
                        if (var493 == 4208) {
                            var5--;
                            int var424 = field803[var5];
                            class52 var425 = class52.method126(var424);
                            if (var425.field1110 == -1 && var425.field1158 >= 0) {
                                field803[var5++] = var425.field1158;
                                continue;
                            }
                            field803[var5++] = var424;
                            continue;
                        }
                        if (var493 == 4209) {
                            var5--;
                            int var426 = field803[var5];
                            class52 var427 = class52.method126(var426);
                            if (var427.field1110 >= 0 && var427.field1158 >= 0) {
                                field803[var5++] = var427.field1158;
                                continue;
                            }
                            field803[var5++] = var426;
                            continue;
                        }
                        if (var493 == 4210) {
                            var6--;
                            String var428 = field809[var6];
                            var5--;
                            int var429 = field803[var5];
                            client.method816(var428, var429 == 1);
                            field803[var5++] = Statics.field96;
                            continue;
                        }
                        if (var493 == 4211) {
                            if (Statics.field874 != null && Statics.field1084 < Statics.field96) {
                                field803[var5++] = Statics.field874[++Statics.field1084 - 1] & 0xFFFF;
                                continue;
                            }
                            field803[var5++] = -1;
                            continue;
                        }
                        if (var493 == 4212) {
                            Statics.field1084 = 0;
                            continue;
                        }
                    } else if (var493 < 5100) {
                        if (var493 == 5000) {
                            field803[var5++] = client.field496;
                            continue;
                        }
                        if (var493 == 5001) {
                            var5 -= 3;
                            client.field496 = field803[var5];
                            Statics.field1378 = class131.method678(field803[var5 + 1]);
                            if (Statics.field1378 == null) {
                                Statics.field1378 = class131.field2070;
                            }
                            client.field293 = field803[var5 + 2];
                            client.field323.method2583(189);
                            client.field323.method2323(client.field496);
                            client.field323.method2323(Statics.field1378.field2074);
                            client.field323.method2323(client.field293);
                            continue;
                        }
                        if (var493 == 5002) {
                            var6--;
                            String var430 = field809[var6];
                            var5 -= 2;
                            int var431 = field803[var5];
                            int var432 = field803[var5 + 1];
                            client.field323.method2583(66);
                            client.field323.method2323(class120.method636(var430) + 2);
                            client.field323.method2329(var430);
                            client.field323.method2323(var431 - 1);
                            client.field323.method2323(var432);
                            continue;
                        }
                        if (var493 == 5003) {
                            var5 -= 2;
                            int var433 = field803[var5];
                            int var434 = field803[var5 + 1];
                            class36 var435 = class12.method625(var433, var434);
                            if (var435 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field809[var6++] = "";
                                field809[var6++] = "";
                                field809[var6++] = "";
                            } else {
                                field803[var5++] = var435.field790;
                                field803[var5++] = var435.field791;
                                field809[var6++] = var435.field796 == null ? "" : var435.field796;
                                field809[var6++] = var435.field787 == null ? "" : var435.field787;
                                field809[var6++] = var435.field792 == null ? "" : var435.field792;
                            }
                            continue;
                        }
                        if (var493 == 5004) {
                            var5--;
                            int var436 = field803[var5];
                            class36 var437 = class12.method2224(var436);
                            if (var437 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field809[var6++] = "";
                                field809[var6++] = "";
                                field809[var6++] = "";
                            } else {
                                field803[var5++] = var437.field788;
                                field803[var5++] = var437.field791;
                                field809[var6++] = var437.field796 == null ? "" : var437.field796;
                                field809[var6++] = var437.field787 == null ? "" : var437.field787;
                                field809[var6++] = var437.field792 == null ? "" : var437.field792;
                            }
                            continue;
                        }
                        if (var493 == 5005) {
                            if (Statics.field1378 == null) {
                                field803[var5++] = -1;
                            } else {
                                field803[var5++] = Statics.field1378.field2074;
                            }
                            continue;
                        }
                        if (var493 == 5008) {
                            var6--;
                            String var438 = field809[var6];
                            var5--;
                            int var439 = field803[var5];
                            String var440 = var438.toLowerCase();
                            byte var441 = 0;
                            if (var440.startsWith(class158.field2493)) {
                                var441 = 0;
                                var438 = var438.substring(class158.field2493.length());
                            } else if (var440.startsWith(class158.field2495)) {
                                var441 = 1;
                                var438 = var438.substring(class158.field2495.length());
                            } else if (var440.startsWith(class158.field2411)) {
                                var441 = 2;
                                var438 = var438.substring(class158.field2411.length());
                            } else if (var440.startsWith(class158.field2400)) {
                                var441 = 3;
                                var438 = var438.substring(class158.field2400.length());
                            } else if (var440.startsWith(class158.field2501)) {
                                var441 = 4;
                                var438 = var438.substring(class158.field2501.length());
                            } else if (var440.startsWith(class158.field2503)) {
                                var441 = 5;
                                var438 = var438.substring(class158.field2503.length());
                            } else if (var440.startsWith(class158.field2417)) {
                                var441 = 6;
                                var438 = var438.substring(class158.field2417.length());
                            } else if (var440.startsWith(class158.field2507)) {
                                var441 = 7;
                                var438 = var438.substring(class158.field2507.length());
                            } else if (var440.startsWith(class158.field2330)) {
                                var441 = 8;
                                var438 = var438.substring(class158.field2330.length());
                            } else if (var440.startsWith(class158.field2577)) {
                                var441 = 9;
                                var438 = var438.substring(class158.field2577.length());
                            } else if (var440.startsWith(class158.field2390)) {
                                var441 = 10;
                                var438 = var438.substring(class158.field2390.length());
                            } else if (var440.startsWith(class158.field2504)) {
                                var441 = 11;
                                var438 = var438.substring(class158.field2504.length());
                            } else if (client.field286 != 0) {
                                if (var440.startsWith(class158.field2494)) {
                                    var441 = 0;
                                    var438 = var438.substring(class158.field2494.length());
                                } else if (var440.startsWith(class158.field2443)) {
                                    var441 = 1;
                                    var438 = var438.substring(class158.field2443.length());
                                } else if (var440.startsWith(class158.field2498)) {
                                    var441 = 2;
                                    var438 = var438.substring(class158.field2498.length());
                                } else if (var440.startsWith(class158.field2500)) {
                                    var441 = 3;
                                    var438 = var438.substring(class158.field2500.length());
                                } else if (var440.startsWith(class158.field2502)) {
                                    var441 = 4;
                                    var438 = var438.substring(class158.field2502.length());
                                } else if (var440.startsWith(class158.field2432)) {
                                    var441 = 5;
                                    var438 = var438.substring(class158.field2432.length());
                                } else if (var440.startsWith(class158.field2460)) {
                                    var441 = 6;
                                    var438 = var438.substring(class158.field2460.length());
                                } else if (var440.startsWith(class158.field2508)) {
                                    var441 = 7;
                                    var438 = var438.substring(class158.field2508.length());
                                } else if (var440.startsWith(class158.field2510)) {
                                    var441 = 8;
                                    var438 = var438.substring(class158.field2510.length());
                                } else if (var440.startsWith(class158.field2512)) {
                                    var441 = 9;
                                    var438 = var438.substring(class158.field2512.length());
                                } else if (var440.startsWith(class158.field2514)) {
                                    var441 = 10;
                                    var438 = var438.substring(class158.field2514.length());
                                } else if (var440.startsWith(class158.field2513)) {
                                    var441 = 11;
                                    var438 = var438.substring(class158.field2513.length());
                                }
                            }
                            String var442 = var438.toLowerCase();
                            byte var443 = 0;
                            if (var442.startsWith(class158.field2517)) {
                                var443 = 1;
                                var438 = var438.substring(class158.field2517.length());
                            } else if (var442.startsWith(class158.field2519)) {
                                var443 = 2;
                                var438 = var438.substring(class158.field2519.length());
                            } else if (var442.startsWith(class158.field2521)) {
                                var443 = 3;
                                var438 = var438.substring(class158.field2521.length());
                            } else if (var442.startsWith(class158.field2523)) {
                                var443 = 4;
                                var438 = var438.substring(class158.field2523.length());
                            } else if (var442.startsWith(class158.field2347)) {
                                var443 = 5;
                                var438 = var438.substring(class158.field2347.length());
                            } else if (client.field286 != 0) {
                                if (var442.startsWith(class158.field2518)) {
                                    var443 = 1;
                                    var438 = var438.substring(class158.field2518.length());
                                } else if (var442.startsWith(class158.field2520)) {
                                    var443 = 2;
                                    var438 = var438.substring(class158.field2520.length());
                                } else if (var442.startsWith(class158.field2522)) {
                                    var443 = 3;
                                    var438 = var438.substring(class158.field2522.length());
                                } else if (var442.startsWith(class158.field2438)) {
                                    var443 = 4;
                                    var438 = var438.substring(class158.field2438.length());
                                } else if (var442.startsWith(class158.field2526)) {
                                    var443 = 5;
                                    var438 = var438.substring(class158.field2526.length());
                                }
                            }
                            client.field323.method2583(201);
                            client.field323.method2323(0);
                            int var444 = client.field323.field2006;
                            client.field323.method2323(var439);
                            client.field323.method2323(var441);
                            client.field323.method2323(var443);
                            class123 var445 = client.field323;
                            int var446 = var445.field2006;
                            int var447 = var438.length();
                            byte[] var448 = new byte[var447];
                            for (int var449 = 0; var449 < var447; var449++) {
                                char var450 = var438.charAt(var449);
                                if (!(var450 <= 0 || var450 >= 128) || !(var450 < 160 || var450 > 255)) {
                                    var448[var449] = (byte) var450;
                                } else if (var450 == 8364) {
                                    var448[var449] = -128;
                                } else if (var450 == 8218) {
                                    var448[var449] = -126;
                                } else if (var450 == 402) {
                                    var448[var449] = -125;
                                } else if (var450 == 8222) {
                                    var448[var449] = -124;
                                } else if (var450 == 8230) {
                                    var448[var449] = -123;
                                } else if (var450 == 8224) {
                                    var448[var449] = -122;
                                } else if (var450 == 8225) {
                                    var448[var449] = -121;
                                } else if (var450 == 710) {
                                    var448[var449] = -120;
                                } else if (var450 == 8240) {
                                    var448[var449] = -119;
                                } else if (var450 == 352) {
                                    var448[var449] = -118;
                                } else if (var450 == 8249) {
                                    var448[var449] = -117;
                                } else if (var450 == 338) {
                                    var448[var449] = -116;
                                } else if (var450 == 381) {
                                    var448[var449] = -114;
                                } else if (var450 == 8216) {
                                    var448[var449] = -111;
                                } else if (var450 == 8217) {
                                    var448[var449] = -110;
                                } else if (var450 == 8220) {
                                    var448[var449] = -109;
                                } else if (var450 == 8221) {
                                    var448[var449] = -108;
                                } else if (var450 == 8226) {
                                    var448[var449] = -107;
                                } else if (var450 == 8211) {
                                    var448[var449] = -106;
                                } else if (var450 == 8212) {
                                    var448[var449] = -105;
                                } else if (var450 == 732) {
                                    var448[var449] = -104;
                                } else if (var450 == 8482) {
                                    var448[var449] = -103;
                                } else if (var450 == 353) {
                                    var448[var449] = -102;
                                } else if (var450 == 8250) {
                                    var448[var449] = -101;
                                } else if (var450 == 339) {
                                    var448[var449] = -100;
                                } else if (var450 == 382) {
                                    var448[var449] = -98;
                                } else if (var450 == 376) {
                                    var448[var449] = -97;
                                } else {
                                    var448[var449] = 63;
                                }
                            }
                            var445.method2336(var448.length);
                            var445.field2006 += Statics.field3188.method2278(var448, 0, var448.length, var445.field2008, var445.field2006);
                            client.field323.method2408(client.field323.field2006 - var444);
                            continue;
                        }
                        if (var493 == 5009) {
                            var6 -= 2;
                            String var453 = field809[var6];
                            String var454 = field809[var6 + 1];
                            client.field323.method2583(212);
                            client.field323.method2507(0);
                            int var455 = client.field323.field2006;
                            client.field323.method2329(var453);
                            class123 var456 = client.field323;
                            int var457 = var456.field2006;
                            int var458 = var454.length();
                            byte[] var459 = new byte[var458];
                            for (int var460 = 0; var460 < var458; var460++) {
                                char var461 = var454.charAt(var460);
                                if (!(var461 <= 0 || var461 >= 128) || !(var461 < 160 || var461 > 255)) {
                                    var459[var460] = (byte) var461;
                                } else if (var461 == 8364) {
                                    var459[var460] = -128;
                                } else if (var461 == 8218) {
                                    var459[var460] = -126;
                                } else if (var461 == 402) {
                                    var459[var460] = -125;
                                } else if (var461 == 8222) {
                                    var459[var460] = -124;
                                } else if (var461 == 8230) {
                                    var459[var460] = -123;
                                } else if (var461 == 8224) {
                                    var459[var460] = -122;
                                } else if (var461 == 8225) {
                                    var459[var460] = -121;
                                } else if (var461 == 710) {
                                    var459[var460] = -120;
                                } else if (var461 == 8240) {
                                    var459[var460] = -119;
                                } else if (var461 == 352) {
                                    var459[var460] = -118;
                                } else if (var461 == 8249) {
                                    var459[var460] = -117;
                                } else if (var461 == 338) {
                                    var459[var460] = -116;
                                } else if (var461 == 381) {
                                    var459[var460] = -114;
                                } else if (var461 == 8216) {
                                    var459[var460] = -111;
                                } else if (var461 == 8217) {
                                    var459[var460] = -110;
                                } else if (var461 == 8220) {
                                    var459[var460] = -109;
                                } else if (var461 == 8221) {
                                    var459[var460] = -108;
                                } else if (var461 == 8226) {
                                    var459[var460] = -107;
                                } else if (var461 == 8211) {
                                    var459[var460] = -106;
                                } else if (var461 == 8212) {
                                    var459[var460] = -105;
                                } else if (var461 == 732) {
                                    var459[var460] = -104;
                                } else if (var461 == 8482) {
                                    var459[var460] = -103;
                                } else if (var461 == 353) {
                                    var459[var460] = -102;
                                } else if (var461 == 8250) {
                                    var459[var460] = -101;
                                } else if (var461 == 339) {
                                    var459[var460] = -100;
                                } else if (var461 == 382) {
                                    var459[var460] = -98;
                                } else if (var461 == 376) {
                                    var459[var460] = -97;
                                } else {
                                    var459[var460] = 63;
                                }
                            }
                            var456.method2336(var459.length);
                            var456.field2006 += Statics.field3188.method2278(var459, 0, var459.length, var456.field2008, var456.field2006);
                            client.field323.method2370(client.field323.field2006 - var455);
                            continue;
                        }
                        if (var493 == 5015) {
                            String var464;
                            if (Statics.field1882 == null || Statics.field1882.field60 == null) {
                                var464 = "";
                            } else {
                                var464 = Statics.field1882.field60;
                            }
                            field809[var6++] = var464;
                            continue;
                        }
                        if (var493 == 5016) {
                            field803[var5++] = client.field293;
                            continue;
                        }
                        if (var493 == 5017) {
                            var5--;
                            int var465 = field803[var5];
                            field803[var5++] = class12.method3364(var465);
                            continue;
                        }
                        if (var493 == 5018) {
                            var5--;
                            int var466 = field803[var5];
                            field803[var5++] = class12.method1455(var466);
                            continue;
                        }
                        if (var493 == 5019) {
                            var5--;
                            int var467 = field803[var5];
                            field803[var5++] = class12.method2628(var467);
                            continue;
                        }
                        if (var493 == 5020) {
                            var6--;
                            String var468 = field809[var6];
                            if (var468.equalsIgnoreCase("toggleroof")) {
                                Statics.field1389.field149 = !Statics.field1389.field149;
                                class9.method99();
                                if (Statics.field1389.field149) {
                                    class12.method2629(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method2629(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var468.equalsIgnoreCase("displayfps")) {
                                client.field283 = !client.field283;
                            }
                            if (client.field518 >= 2) {
                                if (var468.equalsIgnoreCase("fpson")) {
                                    client.field283 = true;
                                }
                                if (var468.equalsIgnoreCase("fpsoff")) {
                                    client.field283 = false;
                                }
                                if (var468.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var468.equalsIgnoreCase("clientdrop")) {
                                    client.method2288();
                                }
                                if (var468.equalsIgnoreCase("errortest") && client.field282 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field323.method2583(146);
                            client.field323.method2323(var468.length() + 1);
                            client.field323.method2329(var468);
                            continue;
                        }
                        if (var493 == 5021) {
                            var6--;
                            client.field394 = field809[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var493 == 5022) {
                            field809[var6++] = client.field394;
                            continue;
                        }
                    }
                } else {
                    class174 var92;
                    if (var493 >= 2000) {
                        var493 -= 1000;
                        var5--;
                        var92 = class174.method634(field803[var5]);
                    } else {
                        var92 = var62 ? Statics.field2174 : Statics.field186;
                    }
                    if (var493 == 1300) {
                        var5--;
                        int var93 = field803[var5] - 1;
                        if (var93 >= 0 && var93 <= 9) {
                            var6--;
                            var92.method3148(var93, field809[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var493 == 1301) {
                        var5 -= 2;
                        int var94 = field803[var5];
                        int var95 = field803[var5 + 1];
                        var92.field2872 = class174.method912(var94, var95);
                        continue;
                    }
                    if (var493 == 1302) {
                        var5--;
                        var92.field2857 = field803[var5] == 1;
                        continue;
                    }
                    if (var493 == 1303) {
                        var5--;
                        var92.field2842 = field803[var5];
                        continue;
                    }
                    if (var493 == 1304) {
                        var5--;
                        var92.field2843 = field803[var5];
                        continue;
                    }
                    if (var493 == 1305) {
                        var6--;
                        var92.field2790 = field809[var6];
                        continue;
                    }
                    if (var493 == 1306) {
                        var6--;
                        var92.field2845 = field809[var6];
                        continue;
                    }
                    if (var493 == 1307) {
                        var92.field2840 = null;
                        continue;
                    }
                }
                if (var493 < 5400) {
                    if (var493 == 5306) {
                        int[] var469 = field803;
                        int var470 = var5++;
                        int var471 = client.field337 ? 2 : 1;
                        var469[var470] = var471;
                        continue;
                    }
                    if (var493 == 5307) {
                        var5--;
                        int var472 = field803[var5];
                        if (var472 == 1 || var472 == 2) {
                            client.method125(var472);
                        }
                        continue;
                    }
                    if (var493 == 5308) {
                        field803[var5++] = Statics.field1389.field145;
                        continue;
                    }
                    if (var493 == 5309) {
                        var5--;
                        int var473 = field803[var5];
                        if (var473 == 1 || var473 == 2) {
                            Statics.field1389.field145 = var473;
                            class9.method99();
                        }
                        continue;
                    }
                }
                if (var493 < 5600) {
                    if (var493 == 5504) {
                        var5 -= 2;
                        int var474 = field803[var5];
                        int var475 = field803[var5 + 1];
                        if (!client.field559) {
                            client.field364 = var474;
                            client.field365 = var475;
                        }
                        continue;
                    }
                    if (var493 == 5505) {
                        field803[var5++] = client.field364;
                        continue;
                    }
                    if (var493 == 5506) {
                        field803[var5++] = client.field365;
                        continue;
                    }
                    if (var493 == 5530) {
                        var5--;
                        int var476 = field803[var5];
                        if (var476 < 0) {
                            var476 = 0;
                        }
                        client.field370 = var476;
                        continue;
                    }
                    if (var493 == 5531) {
                        field803[var5++] = client.field370;
                        continue;
                    }
                }
                if (var493 >= 5700 || var493 != 5630) {
                    if (var493 < 6300) {
                        if (var493 == 6200) {
                            var5 -= 2;
                            client.field555 = (short) field803[var5];
                            if (client.field555 <= 0) {
                                client.field555 = 256;
                            }
                            client.field535 = (short) field803[var5 + 1];
                            if (client.field535 <= 0) {
                                client.field535 = 205;
                            }
                            continue;
                        }
                        if (var493 == 6201) {
                            var5 -= 2;
                            client.field534 = (short) field803[var5];
                            if (client.field534 <= 0) {
                                client.field534 = 256;
                            }
                            client.field537 = (short) field803[var5 + 1];
                            if (client.field537 <= 0) {
                                client.field537 = 320;
                            }
                            continue;
                        }
                        if (var493 == 6202) {
                            var5 -= 4;
                            client.field324 = (short) field803[var5];
                            if (client.field324 <= 0) {
                                client.field324 = 1;
                            }
                            client.field539 = (short) field803[var5 + 1];
                            if (client.field539 <= 0) {
                                client.field539 = 32767;
                            } else if (client.field539 < client.field324) {
                                client.field539 = client.field324;
                            }
                            client.field402 = (short) field803[var5 + 2];
                            if (client.field402 <= 0) {
                                client.field402 = 1;
                            }
                            client.field541 = (short) field803[var5 + 3];
                            if (client.field541 <= 0) {
                                client.field541 = 32767;
                            } else if (client.field541 < client.field402) {
                                client.field541 = client.field402;
                            }
                            continue;
                        }
                        if (var493 == 6203) {
                            if (client.field450 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = -1;
                            } else {
                                client.method135(0, 0, client.field450.field2887, client.field450.field2782, false);
                                field803[var5++] = client.field473;
                                field803[var5++] = client.field384;
                            }
                            continue;
                        }
                        if (var493 == 6204) {
                            field803[var5++] = client.field534;
                            field803[var5++] = client.field537;
                            continue;
                        }
                        if (var493 == 6205) {
                            field803[var5++] = client.field555;
                            field803[var5++] = client.field535;
                            continue;
                        }
                    }
                    if (var493 < 6600) {
                        if (var493 == 6500) {
                            field803[var5++] = class26.method714() ? 1 : 0;
                            continue;
                        }
                        if (var493 == 6501) {
                            class26.field630 = 0;
                            class26 var477 = class26.method1162();
                            if (var477 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field809[var6++] = "";
                                field803[var5++] = 0;
                                field803[var5++] = 0;
                                field809[var6++] = "";
                            } else {
                                field803[var5++] = var477.field633;
                                field803[var5++] = var477.field634;
                                field809[var6++] = var477.field642;
                                field803[var5++] = var477.field638;
                                field803[var5++] = var477.field635;
                                field809[var6++] = var477.field636;
                            }
                            continue;
                        }
                        if (var493 == 6502) {
                            class26 var479 = class26.method1162();
                            if (var479 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field809[var6++] = "";
                                field803[var5++] = 0;
                                field803[var5++] = 0;
                                field809[var6++] = "";
                            } else {
                                field803[var5++] = var479.field633;
                                field803[var5++] = var479.field634;
                                field809[var6++] = var479.field642;
                                field803[var5++] = var479.field638;
                                field803[var5++] = var479.field635;
                                field809[var6++] = var479.field636;
                            }
                            continue;
                        }
                        if (var493 == 6506) {
                            var5--;
                            int var480 = field803[var5];
                            class26 var481 = null;
                            for (int var482 = 0; var482 < class26.field629; var482++) {
                                if (Statics.field637[var482].field633 == var480) {
                                    var481 = Statics.field637[var482];
                                    break;
                                }
                            }
                            if (var481 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field809[var6++] = "";
                                field803[var5++] = 0;
                                field803[var5++] = 0;
                                field809[var6++] = "";
                            } else {
                                field803[var5++] = var481.field633;
                                field803[var5++] = var481.field634;
                                field809[var6++] = var481.field642;
                                field803[var5++] = var481.field638;
                                field803[var5++] = var481.field635;
                                field809[var6++] = var481.field636;
                            }
                            continue;
                        }
                        if (var493 == 6507) {
                            var5 -= 4;
                            int var483 = field803[var5];
                            boolean var484 = field803[var5 + 1] == 1;
                            int var485 = field803[var5 + 2];
                            boolean var486 = field803[var5 + 3] == 1;
                            class26.method1556(var483, var484, var485, var486);
                            continue;
                        }
                        if (var493 == 6511) {
                            var5--;
                            int var487 = field803[var5];
                            if (var487 >= 0 && var487 < class26.field629) {
                                class26 var488 = Statics.field637[var487];
                                field803[var5++] = var488.field633;
                                field803[var5++] = var488.field634;
                                field809[var6++] = var488.field642;
                                field803[var5++] = var488.field638;
                                field803[var5++] = var488.field635;
                                field809[var6++] = var488.field636;
                                continue;
                            }
                            field803[var5++] = -1;
                            field803[var5++] = 0;
                            field809[var6++] = "";
                            field803[var5++] = 0;
                            field803[var5++] = 0;
                            field809[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field333 = 250;
            }
        } catch (Exception var492) {
            StringBuilder var490 = new StringBuilder(30);
            var490.append("").append(var4.field3126).append(" ");
            for (int var491 = field805 - 1; var491 >= 0; var491--) {
                var490.append("").append(field806[var491].field201.field3126).append(" ");
            }
            var490.append("").append(var10);
            class149.method1942(var490.toString(), var492);
        }
    }

    @ObfuscatedName("h.p(II)V")
    public static void method193(int arg0) {
        if (arg0 == -1 || !class174.method3472(arg0)) {
            return;
        }
        class174[] var1 = Statics.field3172[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174 var3 = var1[var2];
            if (var3.field2847 != null) {
                class1 var4 = new class1();
                var4.field9 = var3;
                var4.field13 = var3.field2847;
                method196(var4, 2000000);
            }
        }
    }
}
