package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("aw")
public class class37 {

    @ObfuscatedName("aw.z")
    public static int[] field786 = new int[5];

    @ObfuscatedName("aw.r")
    public static int[][] field789 = new int[5][5000];

    @ObfuscatedName("aw.f")
    public static int[] field790 = new int[1000];

    @ObfuscatedName("aw.s")
    public static String[] field797 = new String[1000];

    @ObfuscatedName("aw.d")
    public static int field803 = 0;

    @ObfuscatedName("aw.l")
    public static class15[] field793 = new class15[50];

    @ObfuscatedName("aw.k")
    public static Calendar field795 = Calendar.getInstance();

    @ObfuscatedName("aw.o")
    public static final String[] field796 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("aw.b")
    public static int field800 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ft.t(Lt;B)V")
    public static void method3136(class1 arg0) {
        method623(arg0, 200000);
    }

    @ObfuscatedName("ag.i(Lt;II)V")
    public static void method623(class1 arg0, int arg1) {
        Object[] var2 = arg0.field6;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method80(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field581;
        int[] var9 = var4.field587;
        byte var10 = -1;
        field803 = 0;
        try {
            Statics.field3168 = new int[var4.field584];
            int var11 = 0;
            Statics.field1462 = new String[var4.field585];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field7;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2777;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field13;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2778;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field11 == null ? -1 : arg0.field11.field2777;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field11 == null ? -1 : arg0.field11.field2778;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field3168[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field1462[var12++] = var15;
                }
            }
            int var16 = 0;
            field800 = arg0.field18;
            label2890: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var458 = var8[var7];
                if (var458 < 100) {
                    if (var458 == 0) {
                        field790[var5++] = var9[var7];
                        continue;
                    }
                    if (var458 == 1) {
                        int var17 = var9[var7];
                        field790[var5++] = class177.field2924[var17];
                        continue;
                    }
                    if (var458 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class177.field2924[var18] = field790[var5];
                        Statics.method1528(var18);
                        continue;
                    }
                    if (var458 == 3) {
                        field797[var6++] = var4.field583[var7];
                        continue;
                    }
                    if (var458 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var458 == 7) {
                        var5 -= 2;
                        if (field790[var5 + 1] != field790[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var458 == 8) {
                        var5 -= 2;
                        if (field790[var5 + 1] == field790[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var458 == 9) {
                        var5 -= 2;
                        if (field790[var5] < field790[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var458 == 10) {
                        var5 -= 2;
                        if (field790[var5] > field790[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var458 == 21) {
                        if (field803 == 0) {
                            return;
                        }
                        class15 var19 = field793[--field803];
                        var4 = var19.field216;
                        var8 = var4.field581;
                        var9 = var4.field587;
                        var7 = var19.field211;
                        Statics.field3168 = var19.field212;
                        Statics.field1462 = var19.field213;
                        continue;
                    }
                    if (var458 == 25) {
                        int var20 = var9[var7];
                        field790[var5++] = class177.method135(var20);
                        continue;
                    }
                    if (var458 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field790[var5];
                        class48 var23 = (class48) class48.field1073.method3453((long) var21);
                        class48 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field1077.method3002(14, var21);
                            class48 var26 = new class48();
                            if (var25 != null) {
                                var26.method918(new class120(var25));
                            }
                            class48.field1073.method3461(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field1074;
                        int var29 = var24.field1075;
                        int var30 = var24.field1079;
                        int var31 = class177.field2927[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class177.field2924[var28] = class177.field2924[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var458 == 31) {
                        var5 -= 2;
                        if (field790[var5] <= field790[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var458 == 32) {
                        var5 -= 2;
                        if (field790[var5] >= field790[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var458 == 33) {
                        field790[var5++] = Statics.field3168[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var458 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field3168[var10001] = field790[var5];
                        continue;
                    }
                    if (var458 == 35) {
                        field797[var6++] = Statics.field1462[var9[var7]];
                        continue;
                    }
                    if (var458 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1462[var10001] = field797[var6];
                        continue;
                    }
                    if (var458 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String[] var34 = field797;
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
                        field797[var6++] = var35;
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
                        int var45 = var9[var7];
                        class23 var46 = class23.method80(var45);
                        int[] var47 = new int[var46.field584];
                        String[] var48 = new String[var46.field585];
                        for (int var49 = 0; var49 < var46.field586; var49++) {
                            var47[var49] = field790[var5 - var46.field586 + var49];
                        }
                        for (int var50 = 0; var50 < var46.field595; var50++) {
                            var48[var50] = field797[var6 - var46.field595 + var50];
                        }
                        var5 -= var46.field586;
                        var6 -= var46.field595;
                        class15 var51 = new class15();
                        var51.field216 = var4;
                        var51.field211 = var7;
                        var51.field212 = Statics.field3168;
                        var51.field213 = Statics.field1462;
                        field793[++field803 - 1] = var51;
                        var4 = var46;
                        var8 = var46.field581;
                        var9 = var46.field587;
                        var7 = -1;
                        Statics.field3168 = var47;
                        Statics.field1462 = var48;
                        continue;
                    }
                    if (var458 == 42) {
                        field790[var5++] = Statics.field1880.method172(var9[var7]);
                        continue;
                    }
                    if (var458 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1880.method171(var10001, field790[var5]);
                        continue;
                    }
                    if (var458 == 44) {
                        int var52 = var9[var7] >> 16;
                        int var53 = var9[var7] & 0xFFFF;
                        var5--;
                        int var54 = field790[var5];
                        if (var54 >= 0 && var54 <= 5000) {
                            field786[var52] = var54;
                            byte var55 = -1;
                            if (var53 == 105) {
                                var55 = 0;
                            }
                            int var56 = 0;
                            while (true) {
                                if (var56 >= var54) {
                                    continue label2890;
                                }
                                field789[var52][var56] = var55;
                                var56++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var458 == 45) {
                        int var57 = var9[var7];
                        var5--;
                        int var58 = field790[var5];
                        if (var58 >= 0 && var58 < field786[var57]) {
                            field790[var5++] = field789[var57][var58];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var458 == 46) {
                        int var59 = var9[var7];
                        var5 -= 2;
                        int var60 = field790[var5];
                        if (var60 >= 0 && var60 < field786[var59]) {
                            field789[var59][var60] = field790[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var458 == 47) {
                        String var61 = Statics.field1880.method174(var9[var7]);
                        if (var61 == null) {
                            var61 = "null";
                        }
                        field797[var6++] = var61;
                        continue;
                    }
                    if (var458 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1880.method173(var10001, field797[var6]);
                        continue;
                    }
                }
                boolean var62;
                if (var9[var7] == 1) {
                    var62 = true;
                } else {
                    var62 = false;
                }
                if (var458 < 1000) {
                    if (var458 == 100) {
                        var5 -= 3;
                        int var63 = field790[var5];
                        int var64 = field790[var5 + 1];
                        int var65 = field790[var5 + 2];
                        if (var64 == 0) {
                            throw new RuntimeException();
                        }
                        class174 var66 = class174.method3117(var63);
                        if (var66.field2771 == null) {
                            var66.field2771 = new class174[var65 + 1];
                        }
                        if (var66.field2771.length <= var65) {
                            class174[] var67 = new class174[var65 + 1];
                            for (int var68 = 0; var68 < var66.field2771.length; var68++) {
                                var67[var68] = var66.field2771[var68];
                            }
                            var66.field2771 = var67;
                        }
                        if (var65 > 0 && var66.field2771[var65 - 1] == null) {
                            throw new RuntimeException("" + (var65 - 1));
                        }
                        class174 var69 = new class174();
                        var69.field2779 = var64;
                        var69.field2796 = var69.field2777 = var66.field2777;
                        var69.field2778 = var65;
                        var69.field2776 = true;
                        var66.field2771[var65] = var69;
                        if (var62) {
                            Statics.field2936 = var69;
                        } else {
                            Statics.field794 = var69;
                        }
                        client.method538(var66);
                        continue;
                    }
                    if (var458 == 101) {
                        class174 var70 = var62 ? Statics.field2936 : Statics.field794;
                        class174 var71 = class174.method3117(var70.field2777);
                        var71.field2771[var70.field2778] = null;
                        client.method538(var71);
                        continue;
                    }
                    if (var458 == 102) {
                        var5--;
                        class174 var72 = class174.method3117(field790[var5]);
                        var72.field2771 = null;
                        client.method538(var72);
                        continue;
                    }
                    if (var458 == 200) {
                        var5 -= 2;
                        int var73 = field790[var5];
                        int var74 = field790[var5 + 1];
                        class174 var75 = class174.method1454(var73, var74);
                        if (var75 != null && var74 != -1) {
                            field790[var5++] = 1;
                            if (var62) {
                                Statics.field2936 = var75;
                            } else {
                                Statics.field794 = var75;
                            }
                            continue;
                        }
                        field790[var5++] = 0;
                        continue;
                    }
                    if (var458 == 201) {
                        var5--;
                        class174 var76 = class174.method3117(field790[var5]);
                        if (var76 == null) {
                            field790[var5++] = 0;
                        } else {
                            field790[var5++] = 1;
                            if (var62) {
                                Statics.field2936 = var76;
                            } else {
                                Statics.field794 = var76;
                            }
                        }
                        continue;
                    }
                } else if (var458 >= 1000 && var458 < 1100 || var458 >= 2000 && var458 < 2100) {
                    int var77 = -1;
                    class174 var78;
                    if (var458 >= 2000) {
                        var458 -= 1000;
                        var5--;
                        var77 = field790[var5];
                        var78 = class174.method3117(var77);
                    } else {
                        var78 = var62 ? Statics.field2936 : Statics.field794;
                    }
                    if (var458 == 1000) {
                        var5 -= 4;
                        var78.field2816 = field790[var5];
                        var78.field2787 = field790[var5 + 1];
                        var78.field2782 = field790[var5 + 2];
                        var78.field2783 = field790[var5 + 3];
                        client.method538(var78);
                        client.method150(var78);
                        if (var77 != -1 && var78.field2779 == 0) {
                            client.method903(Statics.field3169[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var458 == 1001) {
                        var5 -= 4;
                        var78.field2788 = field790[var5];
                        var78.field2789 = field790[var5 + 1];
                        var78.field2784 = field790[var5 + 2];
                        var78.field2785 = field790[var5 + 3];
                        client.method538(var78);
                        client.method150(var78);
                        if (var77 != -1 && var78.field2779 == 0) {
                            client.method903(Statics.field3169[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var458 == 1003) {
                        var5--;
                        boolean var79 = field790[var5] == 1;
                        if (var78.field2876 != var79) {
                            var78.field2876 = var79;
                            client.method538(var78);
                        }
                        continue;
                    }
                    if (var458 == 1005) {
                        var5--;
                        var78.field2910 = field790[var5] == 1;
                        continue;
                    }
                    if (var458 == 1006) {
                        var5--;
                        var78.field2911 = field790[var5] == 1;
                        continue;
                    }
                } else if (!(var458 < 1100 || var458 >= 1200) || !(var458 < 2100 || var458 >= 2200)) {
                    int var80 = -1;
                    class174 var81;
                    if (var458 >= 2000) {
                        var458 -= 1000;
                        var5--;
                        var80 = field790[var5];
                        var81 = class174.method3117(var80);
                    } else {
                        var81 = var62 ? Statics.field2936 : Statics.field794;
                    }
                    if (var458 == 1100) {
                        var5 -= 2;
                        var81.field2836 = field790[var5];
                        if (var81.field2836 > var81.field2895 - var81.field2792) {
                            var81.field2836 = var81.field2895 - var81.field2792;
                        }
                        if (var81.field2836 < 0) {
                            var81.field2836 = 0;
                        }
                        var81.field2862 = field790[var5 + 1];
                        if (var81.field2862 > var81.field2824 - var81.field2793) {
                            var81.field2862 = var81.field2824 - var81.field2793;
                        }
                        if (var81.field2862 < 0) {
                            var81.field2862 = 0;
                        }
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1101) {
                        var5--;
                        var81.field2798 = field790[var5];
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1102) {
                        var5--;
                        var81.field2896 = field790[var5] == 1;
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1103) {
                        var5--;
                        var81.field2808 = field790[var5];
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1104) {
                        var5--;
                        var81.field2810 = field790[var5];
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1105) {
                        var5--;
                        var81.field2812 = field790[var5];
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1106) {
                        var5--;
                        var81.field2858 = field790[var5];
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1107) {
                        var5--;
                        var81.field2815 = field790[var5] == 1;
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1108) {
                        var81.field2872 = 1;
                        var5--;
                        var81.field2830 = field790[var5];
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1109) {
                        var5 -= 6;
                        var81.field2844 = field790[var5];
                        var81.field2827 = field790[var5 + 1];
                        var81.field2790 = field790[var5 + 2];
                        var81.field2799 = field790[var5 + 3];
                        var81.field2800 = field790[var5 + 4];
                        var81.field2831 = field790[var5 + 5];
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1110) {
                        var5--;
                        int var82 = field790[var5];
                        if (var81.field2894 != var82) {
                            var81.field2894 = var82;
                            var81.field2899 = 0;
                            var81.field2768 = 0;
                            client.method538(var81);
                        }
                        continue;
                    }
                    if (var458 == 1111) {
                        var5--;
                        var81.field2856 = field790[var5] == 1;
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1112) {
                        var6--;
                        String var83 = field797[var6];
                        if (!var83.equals(var81.field2833)) {
                            var81.field2833 = var83;
                            client.method538(var81);
                        }
                        continue;
                    }
                    if (var458 == 1113) {
                        var5--;
                        var81.field2878 = field790[var5];
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1114) {
                        var5 -= 3;
                        var81.field2840 = field790[var5];
                        var81.field2841 = field790[var5 + 1];
                        var81.field2839 = field790[var5 + 2];
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1115) {
                        var5--;
                        var81.field2842 = field790[var5] == 1;
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1116) {
                        var5--;
                        var81.field2770 = field790[var5];
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1117) {
                        var5--;
                        var81.field2817 = field790[var5];
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1118) {
                        var5--;
                        var81.field2868 = field790[var5] == 1;
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1119) {
                        var5--;
                        var81.field2819 = field790[var5] == 1;
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1120) {
                        var5 -= 2;
                        var81.field2895 = field790[var5];
                        var81.field2824 = field790[var5 + 1];
                        client.method538(var81);
                        if (var80 != -1 && var81.field2779 == 0) {
                            client.method903(Statics.field3169[var80 >> 16], var81, false);
                        }
                        continue;
                    }
                    if (var458 == 1121) {
                        client.method3195(var81.field2777, var81.field2778);
                        client.field400 = var81;
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1122) {
                        var5--;
                        var81.field2908 = field790[var5];
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1123) {
                        var5--;
                        var81.field2803 = field790[var5];
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1124) {
                        var5--;
                        var81.field2786 = field790[var5];
                        client.method538(var81);
                        continue;
                    }
                    if (var458 == 1125) {
                        var5--;
                        int var84 = field790[var5];
                        class83 var85 = (class83) class110.method632(class83.method3118(), var84);
                        if (var85 != null) {
                            var81.field2807 = var85;
                            client.method538(var81);
                        }
                        continue;
                    }
                } else if (var458 >= 1200 && var458 < 1300 || var458 >= 2200 && var458 < 2300) {
                    class174 var86;
                    if (var458 >= 2000) {
                        var458 -= 1000;
                        var5--;
                        var86 = class174.method3117(field790[var5]);
                    } else {
                        var86 = var62 ? Statics.field2936 : Statics.field794;
                    }
                    client.method538(var86);
                    if (var458 == 1200 || var458 == 1205 || var458 == 1212) {
                        var5 -= 2;
                        int var87 = field790[var5];
                        int var88 = field790[var5 + 1];
                        var86.field2897 = var87;
                        var86.field2898 = var88;
                        class52 var89 = class52.method2583(var87);
                        var86.field2790 = var89.field1127;
                        var86.field2799 = var89.field1128;
                        var86.field2800 = var89.field1145;
                        var86.field2844 = var89.field1111;
                        var86.field2827 = var89.field1131;
                        var86.field2831 = var89.field1112;
                        if (var458 == 1205) {
                            var86.field2835 = 0;
                        } else if (var458 == 1212 | var89.field1132 == 1) {
                            var86.field2835 = 1;
                        } else {
                            var86.field2835 = 2;
                        }
                        if (var86.field2866 > 0) {
                            var86.field2831 = var86.field2831 * 32 / var86.field2866;
                        } else if (var86.field2788 > 0) {
                            var86.field2831 = var86.field2831 * 32 / var86.field2788;
                        }
                        continue;
                    }
                    if (var458 == 1201) {
                        var86.field2872 = 2;
                        var5--;
                        var86.field2830 = field790[var5];
                        continue;
                    }
                    if (var458 == 1202) {
                        var86.field2872 = 3;
                        var86.field2830 = Statics.field2302.field60.method3211();
                        continue;
                    }
                } else if ((var458 < 1300 || var458 >= 1400) && (var458 < 2300 || var458 >= 2400)) {
                    if (var458 >= 1400 && var458 < 1500 || var458 >= 2400 && var458 < 2500) {
                        class174 var94;
                        if (var458 >= 2000) {
                            var458 -= 1000;
                            var5--;
                            var94 = class174.method3117(field790[var5]);
                        } else {
                            var94 = var62 ? Statics.field2936 : Statics.field794;
                        }
                        var6--;
                        String var95 = field797[var6];
                        int[] var96 = null;
                        if (var95.length() > 0 && var95.charAt(var95.length() - 1) == 'Y') {
                            var5--;
                            int var97 = field790[var5];
                            if (var97 > 0) {
                                var96 = new int[var97];
                                while (var97-- > 0) {
                                    var5--;
                                    var96[var97] = field790[var5];
                                }
                            }
                            var95 = var95.substring(0, var95.length() - 1);
                        }
                        Object[] var98 = new Object[var95.length() + 1];
                        for (int var99 = var98.length - 1; var99 >= 1; var99--) {
                            if (var95.charAt(var99 - 1) == 's') {
                                var6--;
                                var98[var99] = field797[var6];
                            } else {
                                var5--;
                                var98[var99] = Integer.valueOf(field790[var5]);
                            }
                        }
                        var5--;
                        int var100 = field790[var5];
                        if (var100 == -1) {
                            var98 = null;
                        } else {
                            var98[0] = Integer.valueOf(var100);
                        }
                        if (var458 == 1400) {
                            var94.field2859 = var98;
                        }
                        if (var458 == 1401) {
                            var94.field2829 = var98;
                        }
                        if (var458 == 1402) {
                            var94.field2861 = var98;
                        }
                        if (var458 == 1403) {
                            var94.field2863 = var98;
                        }
                        if (var458 == 1404) {
                            var94.field2865 = var98;
                        }
                        if (var458 == 1405) {
                            var94.field2791 = var98;
                        }
                        if (var458 == 1406) {
                            var94.field2826 = var98;
                        }
                        if (var458 == 1407) {
                            var94.field2900 = var98;
                            var94.field2901 = var96;
                        }
                        if (var458 == 1408) {
                            var94.field2820 = var98;
                        }
                        if (var458 == 1409) {
                            var94.field2848 = var98;
                        }
                        if (var458 == 1410) {
                            var94.field2867 = var98;
                        }
                        if (var458 == 1411) {
                            var94.field2860 = var98;
                        }
                        if (var458 == 1412) {
                            var94.field2864 = var98;
                        }
                        if (var458 == 1414) {
                            var94.field2774 = var98;
                            var94.field2902 = var96;
                        }
                        if (var458 == 1415) {
                            var94.field2903 = var98;
                            var94.field2875 = var96;
                        }
                        if (var458 == 1416) {
                            var94.field2871 = var98;
                        }
                        if (var458 == 1417) {
                            var94.field2874 = var98;
                        }
                        if (var458 == 1418) {
                            var94.field2809 = var98;
                        }
                        if (var458 == 1419) {
                            var94.field2880 = var98;
                        }
                        if (var458 == 1420) {
                            var94.field2881 = var98;
                        }
                        if (var458 == 1421) {
                            var94.field2882 = var98;
                        }
                        if (var458 == 1422) {
                            var94.field2883 = var98;
                        }
                        if (var458 == 1423) {
                            var94.field2884 = var98;
                        }
                        if (var458 == 1424) {
                            var94.field2885 = var98;
                        }
                        if (var458 == 1425) {
                            var94.field2887 = var98;
                        }
                        if (var458 == 1426) {
                            var94.field2888 = var98;
                        }
                        if (var458 == 1427) {
                            var94.field2886 = var98;
                        }
                        var94.field2857 = true;
                        continue;
                    }
                    if (var458 < 1600) {
                        class174 var101 = var62 ? Statics.field2936 : Statics.field794;
                        if (var458 == 1500) {
                            field790[var5++] = var101.field2877;
                            continue;
                        }
                        if (var458 == 1501) {
                            field790[var5++] = var101.field2802;
                            continue;
                        }
                        if (var458 == 1502) {
                            field790[var5++] = var101.field2792;
                            continue;
                        }
                        if (var458 == 1503) {
                            field790[var5++] = var101.field2793;
                            continue;
                        }
                        if (var458 == 1504) {
                            field790[var5++] = var101.field2876 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 1505) {
                            field790[var5++] = var101.field2796;
                            continue;
                        }
                    } else if (var458 < 1700) {
                        class174 var102 = var62 ? Statics.field2936 : Statics.field794;
                        if (var458 == 1600) {
                            field790[var5++] = var102.field2836;
                            continue;
                        }
                        if (var458 == 1601) {
                            field790[var5++] = var102.field2862;
                            continue;
                        }
                        if (var458 == 1602) {
                            field797[var6++] = var102.field2833;
                            continue;
                        }
                        if (var458 == 1603) {
                            field790[var5++] = var102.field2895;
                            continue;
                        }
                        if (var458 == 1604) {
                            field790[var5++] = var102.field2824;
                            continue;
                        }
                        if (var458 == 1605) {
                            field790[var5++] = var102.field2831;
                            continue;
                        }
                        if (var458 == 1606) {
                            field790[var5++] = var102.field2790;
                            continue;
                        }
                        if (var458 == 1607) {
                            field790[var5++] = var102.field2800;
                            continue;
                        }
                        if (var458 == 1608) {
                            field790[var5++] = var102.field2799;
                            continue;
                        }
                        if (var458 == 1609) {
                            field790[var5++] = var102.field2808;
                            continue;
                        }
                        if (var458 == 1610) {
                            field790[var5++] = var102.field2786;
                            continue;
                        }
                        if (var458 == 1611) {
                            field790[var5++] = var102.field2798;
                            continue;
                        }
                        if (var458 == 1612) {
                            field790[var5++] = var102.field2803;
                            continue;
                        }
                        if (var458 == 1613) {
                            field790[var5++] = var102.field2807.method537();
                            continue;
                        }
                    } else if (var458 < 1800) {
                        class174 var103 = var62 ? Statics.field2936 : Statics.field794;
                        if (var458 == 1700) {
                            field790[var5++] = var103.field2897;
                            continue;
                        }
                        if (var458 == 1701) {
                            if (var103.field2897 == -1) {
                                field790[var5++] = 0;
                            } else {
                                field790[var5++] = var103.field2898;
                            }
                            continue;
                        }
                        if (var458 == 1702) {
                            field790[var5++] = var103.field2778;
                            continue;
                        }
                    } else if (var458 < 1900) {
                        class174 var104 = var62 ? Statics.field2936 : Statics.field794;
                        if (var458 == 1800) {
                            int[] var105 = field790;
                            int var106 = var5++;
                            int var107 = client.method2739(var104);
                            int var108 = var107 >> 11 & 0x3F;
                            var105[var106] = var108;
                            continue;
                        }
                        if (var458 == 1801) {
                            var5--;
                            int var109 = field790[var5];
                            int var459 = var109 - 1;
                            if (var104.field2851 != null && var459 < var104.field2851.length && var104.field2851[var459] != null) {
                                field797[var6++] = var104.field2851[var459];
                                continue;
                            }
                            field797[var6++] = "";
                            continue;
                        }
                        if (var458 == 1802) {
                            if (var104.field2834 == null) {
                                field797[var6++] = "";
                            } else {
                                field797[var6++] = var104.field2834;
                            }
                            continue;
                        }
                    } else if (var458 >= 1900 && var458 < 2000 || var458 >= 2900 && var458 < 3000) {
                        class174 var110;
                        if (var458 >= 2000) {
                            var458 -= 1000;
                            var5--;
                            var110 = class174.method3117(field790[var5]);
                        } else {
                            var110 = var62 ? Statics.field2936 : Statics.field794;
                        }
                        if (var458 == 1927) {
                            if (field800 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var110.field2886 == null) {
                                return;
                            }
                            class1 var111 = new class1();
                            var111.field3 = var110;
                            var111.field6 = var110.field2886;
                            var111.field18 = field800 + 1;
                            client.field396.method3508(arg0);
                            continue;
                        }
                    } else if (var458 < 2600) {
                        var5--;
                        class174 var112 = class174.method3117(field790[var5]);
                        if (var458 == 2500) {
                            field790[var5++] = var112.field2877;
                            continue;
                        }
                        if (var458 == 2501) {
                            field790[var5++] = var112.field2802;
                            continue;
                        }
                        if (var458 == 2502) {
                            field790[var5++] = var112.field2792;
                            continue;
                        }
                        if (var458 == 2503) {
                            field790[var5++] = var112.field2793;
                            continue;
                        }
                        if (var458 == 2504) {
                            field790[var5++] = var112.field2876 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 2505) {
                            field790[var5++] = var112.field2796;
                            continue;
                        }
                    } else if (var458 < 2700) {
                        var5--;
                        class174 var113 = class174.method3117(field790[var5]);
                        if (var458 == 2600) {
                            field790[var5++] = var113.field2836;
                            continue;
                        }
                        if (var458 == 2601) {
                            field790[var5++] = var113.field2862;
                            continue;
                        }
                        if (var458 == 2602) {
                            field797[var6++] = var113.field2833;
                            continue;
                        }
                        if (var458 == 2603) {
                            field790[var5++] = var113.field2895;
                            continue;
                        }
                        if (var458 == 2604) {
                            field790[var5++] = var113.field2824;
                            continue;
                        }
                        if (var458 == 2605) {
                            field790[var5++] = var113.field2831;
                            continue;
                        }
                        if (var458 == 2606) {
                            field790[var5++] = var113.field2790;
                            continue;
                        }
                        if (var458 == 2607) {
                            field790[var5++] = var113.field2800;
                            continue;
                        }
                        if (var458 == 2608) {
                            field790[var5++] = var113.field2799;
                            continue;
                        }
                        if (var458 == 2609) {
                            field790[var5++] = var113.field2808;
                            continue;
                        }
                        if (var458 == 2610) {
                            field790[var5++] = var113.field2786;
                            continue;
                        }
                        if (var458 == 2611) {
                            field790[var5++] = var113.field2798;
                            continue;
                        }
                        if (var458 == 2612) {
                            field790[var5++] = var113.field2803;
                            continue;
                        }
                        if (var458 == 2613) {
                            field790[var5++] = var113.field2807.method537();
                            continue;
                        }
                    } else if (var458 < 2800) {
                        if (var458 == 2700) {
                            var5--;
                            class174 var114 = class174.method3117(field790[var5]);
                            field790[var5++] = var114.field2897;
                            continue;
                        }
                        if (var458 == 2701) {
                            var5--;
                            class174 var115 = class174.method3117(field790[var5]);
                            if (var115.field2897 == -1) {
                                field790[var5++] = 0;
                            } else {
                                field790[var5++] = var115.field2898;
                            }
                            continue;
                        }
                        if (var458 == 2702) {
                            var5--;
                            int var116 = field790[var5];
                            class4 var117 = (class4) client.field444.method3485((long) var116);
                            if (var117 == null) {
                                field790[var5++] = 0;
                            } else {
                                field790[var5++] = 1;
                            }
                            continue;
                        }
                        if (var458 == 2706) {
                            field790[var5++] = client.field443;
                            continue;
                        }
                    } else if (var458 < 2900) {
                        var5--;
                        class174 var118 = class174.method3117(field790[var5]);
                        if (var458 == 2800) {
                            int[] var119 = field790;
                            int var120 = var5++;
                            int var121 = client.method2739(var118);
                            int var122 = var121 >> 11 & 0x3F;
                            var119[var120] = var122;
                            continue;
                        }
                        if (var458 == 2801) {
                            var5--;
                            int var123 = field790[var5];
                            int var460 = var123 - 1;
                            if (var118.field2851 != null && var460 < var118.field2851.length && var118.field2851[var460] != null) {
                                field797[var6++] = var118.field2851[var460];
                                continue;
                            }
                            field797[var6++] = "";
                            continue;
                        }
                        if (var458 == 2802) {
                            if (var118.field2834 == null) {
                                field797[var6++] = "";
                            } else {
                                field797[var6++] = var118.field2834;
                            }
                            continue;
                        }
                    } else if (var458 < 3200) {
                        if (var458 == 3100) {
                            var6--;
                            String var124 = field797[var6];
                            class12.method683(0, "", var124);
                            continue;
                        }
                        if (var458 == 3101) {
                            var5 -= 2;
                            client.method3(Statics.field2302, field790[var5], field790[var5 + 1]);
                            continue;
                        }
                        if (var458 == 3103) {
                            client.method2937();
                            continue;
                        }
                        if (var458 == 3104) {
                            var6--;
                            String var125 = field797[var6];
                            int var126 = 0;
                            boolean var127 = false;
                            boolean var128 = false;
                            int var129 = 0;
                            int var130 = var125.length();
                            int var131 = 0;
                            boolean var133;
                            while (true) {
                                if (var131 >= var130) {
                                    var133 = var128;
                                    break;
                                }
                                label3146: {
                                    char var132 = var125.charAt(var131);
                                    if (var131 == 0) {
                                        if (var132 == '-') {
                                            var127 = true;
                                            break label3146;
                                        }
                                        if (var132 == '+') {
                                            break label3146;
                                        }
                                    }
                                    int var461;
                                    if (var132 >= '0' && var132 <= '9') {
                                        var461 = var132 - '0';
                                    } else if (var132 >= 'A' && var132 <= 'Z') {
                                        var461 = var132 - '7';
                                    } else {
                                        if (var132 < 'a' || var132 > 'z') {
                                            var133 = false;
                                            break;
                                        }
                                        var461 = var132 - 'W';
                                    }
                                    if (var461 >= 10) {
                                        var133 = false;
                                        break;
                                    }
                                    if (var127) {
                                        var461 = -var461;
                                    }
                                    int var134 = var129 * 10 + var461;
                                    if (var134 / 10 != var129) {
                                        var133 = false;
                                        break;
                                    }
                                    var129 = var134;
                                    var128 = true;
                                }
                                var131++;
                            }
                            if (var133) {
                                var126 = class164.method1541(var125);
                            }
                            client.field326.method2573(13);
                            client.field326.method2296(var126);
                            continue;
                        }
                        if (var458 == 3105) {
                            var6--;
                            String var136 = field797[var6];
                            client.field326.method2573(173);
                            client.field326.method2293(var136.length() + 1);
                            client.field326.method2426(var136);
                            continue;
                        }
                        if (var458 == 3106) {
                            var6--;
                            String var137 = field797[var6];
                            client.field326.method2573(187);
                            client.field326.method2293(var137.length() + 1);
                            client.field326.method2426(var137);
                            continue;
                        }
                        if (var458 == 3107) {
                            var5--;
                            int var138 = field790[var5];
                            var6--;
                            String var139 = field797[var6];
                            client.method2192(var138, var139);
                            continue;
                        }
                        if (var458 == 3108) {
                            var5 -= 3;
                            int var140 = field790[var5];
                            int var141 = field790[var5 + 1];
                            int var142 = field790[var5 + 2];
                            class174 var143 = class174.method3117(var142);
                            Statics.method83(var143, var140, var141);
                            continue;
                        }
                        if (var458 == 3109) {
                            var5 -= 2;
                            int var144 = field790[var5];
                            int var145 = field790[var5 + 1];
                            class174 var146 = var62 ? Statics.field2936 : Statics.field794;
                            Statics.method83(var146, var144, var145);
                            continue;
                        }
                        if (var458 == 3110) {
                            var5--;
                            Statics.field1756 = field790[var5] == 1;
                            continue;
                        }
                        if (var458 == 3111) {
                            field790[var5++] = Statics.field1989.field139 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3112) {
                            var5--;
                            Statics.field1989.field139 = field790[var5] == 1;
                            class9.method581();
                            continue;
                        }
                        if (var458 == 3113) {
                            var6--;
                            String var147 = field797[var6];
                            var5--;
                            boolean var148 = field790[var5] == 1;
                            Statics.method2683(var147, var148, false);
                            continue;
                        }
                        if (var458 == 3115) {
                            var5--;
                            int var149 = field790[var5];
                            client.field326.method2573(82);
                            client.field326.method2294(var149);
                            continue;
                        }
                        if (var458 == 3116) {
                            var5--;
                            int var150 = field790[var5];
                            var6 -= 2;
                            String var151 = field797[var6];
                            String var152 = field797[var6 + 1];
                            if (var151.length() <= 500 && var152.length() <= 500) {
                                client.field326.method2573(68);
                                client.field326.method2294(1 + class120.method2086(var151) + class120.method2086(var152));
                                client.field326.method2328(var150);
                                client.field326.method2426(var152);
                                client.field326.method2426(var151);
                            }
                            continue;
                        }
                    } else if (var458 < 3300) {
                        if (var458 == 3200) {
                            var5 -= 3;
                            int var153 = field790[var5];
                            int var154 = field790[var5 + 1];
                            int var155 = field790[var5 + 2];
                            if (client.field561 != 0 && var154 != 0 && client.field525 < 50) {
                                client.field526[client.field525] = var153;
                                client.field320[client.field525] = var154;
                                client.field528[client.field525] = var155;
                                client.field530[client.field525] = null;
                                client.field533[client.field525] = 0;
                                client.field525++;
                            }
                            continue;
                        }
                        if (var458 == 3201) {
                            var5--;
                            client.method795(field790[var5]);
                            continue;
                        }
                        if (var458 == 3202) {
                            var5 -= 2;
                            client.method567(field790[var5], field790[var5 + 1]);
                            continue;
                        }
                    } else if (var458 < 3400) {
                        if (var458 == 3300) {
                            field790[var5++] = client.field333;
                            continue;
                        }
                        if (var458 == 3301) {
                            var5 -= 2;
                            int var156 = field790[var5];
                            int var157 = field790[var5 + 1];
                            field790[var5++] = class16.method2908(var156, var157);
                            continue;
                        }
                        if (var458 == 3302) {
                            var5 -= 2;
                            int var158 = field790[var5];
                            int var159 = field790[var5 + 1];
                            field790[var5++] = class16.method2004(var158, var159);
                            continue;
                        }
                        if (var458 == 3303) {
                            var5 -= 2;
                            int var160 = field790[var5];
                            int var161 = field790[var5 + 1];
                            field790[var5++] = class16.method940(var160, var161);
                            continue;
                        }
                        if (var458 == 3304) {
                            var5--;
                            int var162 = field790[var5];
                            field790[var5++] = class51.method937(var162).field1105;
                            continue;
                        }
                        if (var458 == 3305) {
                            var5--;
                            int var163 = field790[var5];
                            field790[var5++] = client.field304[var163];
                            continue;
                        }
                        if (var458 == 3306) {
                            var5--;
                            int var164 = field790[var5];
                            field790[var5++] = client.field421[var164];
                            continue;
                        }
                        if (var458 == 3307) {
                            var5--;
                            int var165 = field790[var5];
                            field790[var5++] = client.field422[var165];
                            continue;
                        }
                        if (var458 == 3308) {
                            int var166 = Statics.field755;
                            int var167 = (Statics.field2302.field810 >> 7) + Statics.field1566;
                            int var168 = (Statics.field2302.field805 >> 7) + Statics.field359;
                            field790[var5++] = (var166 << 28) + (var167 << 14) + var168;
                            continue;
                        }
                        if (var458 == 3309) {
                            var5--;
                            int var169 = field790[var5];
                            field790[var5++] = var169 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var458 == 3310) {
                            var5--;
                            int var170 = field790[var5];
                            field790[var5++] = var170 >> 28;
                            continue;
                        }
                        if (var458 == 3311) {
                            var5--;
                            int var171 = field790[var5];
                            field790[var5++] = var171 & 0x3FFF;
                            continue;
                        }
                        if (var458 == 3312) {
                            field790[var5++] = client.field287 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3313) {
                            var5 -= 2;
                            int var172 = field790[var5] + 32768;
                            int var173 = field790[var5 + 1];
                            field790[var5++] = class16.method2908(var172, var173);
                            continue;
                        }
                        if (var458 == 3314) {
                            var5 -= 2;
                            int var174 = field790[var5] + 32768;
                            int var175 = field790[var5 + 1];
                            field790[var5++] = class16.method2004(var174, var175);
                            continue;
                        }
                        if (var458 == 3315) {
                            var5 -= 2;
                            int var176 = field790[var5] + 32768;
                            int var177 = field790[var5 + 1];
                            field790[var5++] = class16.method940(var176, var177);
                            continue;
                        }
                        if (var458 == 3316) {
                            if (client.field450 >= 2) {
                                field790[var5++] = client.field450;
                            } else {
                                field790[var5++] = 0;
                            }
                            continue;
                        }
                        if (var458 == 3317) {
                            field790[var5++] = client.field301;
                            continue;
                        }
                        if (var458 == 3318) {
                            field790[var5++] = client.field479;
                            continue;
                        }
                        if (var458 == 3321) {
                            field790[var5++] = client.field532;
                            continue;
                        }
                        if (var458 == 3322) {
                            field790[var5++] = client.field449;
                            continue;
                        }
                        if (var458 == 3323) {
                            if (client.field540) {
                                field790[var5++] = 1;
                            } else {
                                field790[var5++] = 0;
                            }
                            continue;
                        }
                        if (var458 == 3324) {
                            field790[var5++] = client.field284;
                            continue;
                        }
                    } else if (var458 < 3500) {
                        if (var458 == 3400) {
                            var5 -= 2;
                            int var178 = field790[var5];
                            int var179 = field790[var5 + 1];
                            class49 var180 = (class49) class49.field1088.method3453((long) var178);
                            class49 var181;
                            if (var180 == null) {
                                byte[] var182 = Statics.field2207.method3002(8, var178);
                                class49 var183 = new class49();
                                if (var182 != null) {
                                    var183.method931(new class120(var182));
                                }
                                class49.field1088.method3461(var183, (long) var178);
                                var181 = var183;
                            } else {
                                var181 = var180;
                            }
                            class49 var184 = var181;
                            if (var181.field1086 != 's') {
                            }
                            for (int var185 = 0; var185 < var184.field1089; var185++) {
                                if (var184.field1094[var185] == var179) {
                                    field797[var6++] = var184.field1092[var185];
                                    var184 = null;
                                    break;
                                }
                            }
                            if (var184 != null) {
                                field797[var6++] = var184.field1087;
                            }
                            continue;
                        }
                        if (var458 == 3408) {
                            var5 -= 4;
                            int var186 = field790[var5];
                            int var187 = field790[var5 + 1];
                            int var188 = field790[var5 + 2];
                            int var189 = field790[var5 + 3];
                            class49 var190 = (class49) class49.field1088.method3453((long) var188);
                            class49 var191;
                            if (var190 == null) {
                                byte[] var192 = Statics.field2207.method3002(8, var188);
                                class49 var193 = new class49();
                                if (var192 != null) {
                                    var193.method931(new class120(var192));
                                }
                                class49.field1088.method3461(var193, (long) var188);
                                var191 = var193;
                            } else {
                                var191 = var190;
                            }
                            class49 var194 = var191;
                            if (var191.field1085 == var186 && var191.field1086 == var187) {
                                for (int var195 = 0; var195 < var194.field1089; var195++) {
                                    if (var194.field1094[var195] == var189) {
                                        if (var187 == 115) {
                                            field797[var6++] = var194.field1092[var195];
                                        } else {
                                            field790[var5++] = var194.field1091[var195];
                                        }
                                        var194 = null;
                                        break;
                                    }
                                }
                                if (var194 != null) {
                                    if (var187 == 115) {
                                        field797[var6++] = var194.field1087;
                                    } else {
                                        field790[var5++] = var194.field1090;
                                    }
                                }
                                continue;
                            }
                            if (var187 == 115) {
                                field797[var6++] = "null";
                            } else {
                                field790[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var458 < 3700) {
                        if (var458 == 3600) {
                            if (client.field523 == 0) {
                                field790[var5++] = -2;
                            } else if (client.field523 == 1) {
                                field790[var5++] = -1;
                            } else {
                                field790[var5++] = client.field419;
                            }
                            continue;
                        }
                        if (var458 == 3601) {
                            var5--;
                            int var196 = field790[var5];
                            if (client.field523 == 2 && var196 < client.field419) {
                                field797[var6++] = client.field552[var196].field240;
                                field797[var6++] = client.field552[var196].field239;
                                continue;
                            }
                            field797[var6++] = "";
                            field797[var6++] = "";
                            continue;
                        }
                        if (var458 == 3602) {
                            var5--;
                            int var197 = field790[var5];
                            if (client.field523 == 2 && var197 < client.field419) {
                                field790[var5++] = client.field552[var197].field250;
                                continue;
                            }
                            field790[var5++] = 0;
                            continue;
                        }
                        if (var458 == 3603) {
                            var5--;
                            int var198 = field790[var5];
                            if (client.field523 == 2 && var198 < client.field419) {
                                field790[var5++] = client.field552[var198].field238;
                                continue;
                            }
                            field790[var5++] = 0;
                            continue;
                        }
                        if (var458 == 3604) {
                            var6--;
                            String var199 = field797[var6];
                            var5--;
                            int var200 = field790[var5];
                            client.method157(var199, var200);
                            continue;
                        }
                        if (var458 == 3605) {
                            var6--;
                            String var201 = field797[var6];
                            client.method120(var201);
                            continue;
                        }
                        if (var458 == 3606) {
                            var6--;
                            String var202 = field797[var6];
                            client.method2923(var202);
                            continue;
                        }
                        if (var458 == 3607) {
                            var6--;
                            String var203 = field797[var6];
                            client.method2918(var203, false);
                            continue;
                        }
                        if (var458 == 3608) {
                            var6--;
                            String var204 = field797[var6];
                            client.method1998(var204);
                            continue;
                        }
                        if (var458 == 3609) {
                            var6--;
                            String var205 = field797[var6];
                            class153[] var206 = new class153[] { class153.field2300, class153.field2295, class153.field2294, class153.field2291, class153.field2292 };
                            class153[] var207 = var206;
                            for (int var208 = 0; var208 < var207.length; var208++) {
                                class153 var209 = var207[var208];
                                if (var209.field2297 != -1) {
                                    int var211 = var209.field2297;
                                    String var212 = "<img=" + var211 + ">";
                                    if (var205.startsWith(var212)) {
                                        var205 = var205.substring(6 + Integer.toString(var209.field2297).length());
                                        break;
                                    }
                                }
                            }
                            field790[var5++] = client.method930(var205, false) ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3611) {
                            if (client.field283 == null) {
                                field797[var6++] = "";
                            } else {
                                String[] var213 = field797;
                                int var214 = var6++;
                                String var215 = client.field283;
                                String var216 = class163.method35(class163.method4(var215));
                                if (var216 == null) {
                                    var216 = "";
                                }
                                var213[var214] = var216;
                            }
                            continue;
                        }
                        if (var458 == 3612) {
                            if (client.field283 == null) {
                                field790[var5++] = 0;
                            } else {
                                field790[var5++] = Statics.field275;
                            }
                            continue;
                        }
                        if (var458 == 3613) {
                            var5--;
                            int var218 = field790[var5];
                            if (client.field283 != null && var218 < Statics.field275) {
                                field797[var6++] = Statics.field279[var218].field623;
                                continue;
                            }
                            field797[var6++] = "";
                            continue;
                        }
                        if (var458 == 3614) {
                            var5--;
                            int var219 = field790[var5];
                            if (client.field283 != null && var219 < Statics.field275) {
                                field790[var5++] = Statics.field279[var219].field616;
                                continue;
                            }
                            field790[var5++] = 0;
                            continue;
                        }
                        if (var458 == 3615) {
                            var5--;
                            int var220 = field790[var5];
                            if (client.field283 != null && var220 < Statics.field275) {
                                field790[var5++] = Statics.field279[var220].field617;
                                continue;
                            }
                            field790[var5++] = 0;
                            continue;
                        }
                        if (var458 == 3616) {
                            field790[var5++] = Statics.field1376;
                            continue;
                        }
                        if (var458 == 3617) {
                            var6--;
                            String var221 = field797[var6];
                            if (Statics.field279 != null) {
                                client.field326.method2573(51);
                                client.field326.method2293(class120.method2086(var221));
                                client.field326.method2426(var221);
                            }
                            continue;
                        }
                        if (var458 == 3618) {
                            field790[var5++] = Statics.field1357;
                            continue;
                        }
                        if (var458 == 3619) {
                            var6--;
                            String var222 = field797[var6];
                            client.method76(var222);
                            continue;
                        }
                        if (var458 == 3620) {
                            client.method2094();
                            continue;
                        }
                        if (var458 == 3621) {
                            if (client.field523 == 0) {
                                field790[var5++] = -1;
                            } else {
                                field790[var5++] = client.field554;
                            }
                            continue;
                        }
                        if (var458 == 3622) {
                            var5--;
                            int var223 = field790[var5];
                            if (client.field523 != 0 && var223 < client.field554) {
                                field797[var6++] = client.field401[var223].field136;
                                field797[var6++] = client.field401[var223].field135;
                                continue;
                            }
                            field797[var6++] = "";
                            field797[var6++] = "";
                            continue;
                        }
                        if (var458 == 3623) {
                            String var224;
                            label2617: {
                                var6--;
                                var224 = field797[var6];
                                String var226 = "<img=0>";
                                if (!var224.startsWith(var226)) {
                                    String var228 = "<img=1>";
                                    if (!var224.startsWith(var228)) {
                                        break label2617;
                                    }
                                }
                                var224 = var224.substring(7);
                            }
                            field790[var5++] = client.method193(var224) ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3624) {
                            var5--;
                            int var229 = field790[var5];
                            if (Statics.field279 != null && var229 < Statics.field275 && Statics.field279[var229].field623.equalsIgnoreCase(Statics.field2302.field40)) {
                                field790[var5++] = 1;
                                continue;
                            }
                            field790[var5++] = 0;
                            continue;
                        }
                        if (var458 == 3625) {
                            if (client.field511 == null) {
                                field797[var6++] = "";
                            } else {
                                String[] var230 = field797;
                                int var231 = var6++;
                                String var232 = client.field511;
                                String var233 = class163.method35(class163.method4(var232));
                                if (var233 == null) {
                                    var233 = "";
                                }
                                var230[var231] = var233;
                            }
                            continue;
                        }
                    } else if (var458 < 4000) {
                        if (var458 == 3903) {
                            var5--;
                            int var235 = field790[var5];
                            field790[var5++] = client.field559[var235].method3661();
                            continue;
                        }
                        if (var458 == 3904) {
                            var5--;
                            int var236 = field790[var5];
                            field790[var5++] = client.field559[var236].field3173;
                            continue;
                        }
                        if (var458 == 3905) {
                            var5--;
                            int var237 = field790[var5];
                            field790[var5++] = client.field559[var237].field3177;
                            continue;
                        }
                        if (var458 == 3906) {
                            var5--;
                            int var238 = field790[var5];
                            field790[var5++] = client.field559[var238].field3175;
                            continue;
                        }
                        if (var458 == 3907) {
                            var5--;
                            int var239 = field790[var5];
                            field790[var5++] = client.field559[var239].field3172;
                            continue;
                        }
                        if (var458 == 3908) {
                            var5--;
                            int var240 = field790[var5];
                            field790[var5++] = client.field559[var240].field3176;
                            continue;
                        }
                        if (var458 == 3910) {
                            var5--;
                            int var241 = field790[var5];
                            int var242 = client.field559[var241].method3674();
                            field790[var5++] = var242 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3911) {
                            var5--;
                            int var243 = field790[var5];
                            int var244 = client.field559[var243].method3674();
                            field790[var5++] = var244 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3912) {
                            var5--;
                            int var245 = field790[var5];
                            int var246 = client.field559[var245].method3674();
                            field790[var5++] = var246 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3913) {
                            var5--;
                            int var247 = field790[var5];
                            int var248 = client.field559[var247].method3674();
                            field790[var5++] = var248 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 3914) {
                            var5--;
                            boolean var249 = field790[var5] == 1;
                            if (Statics.field2180 != null) {
                                Statics.field2180.method3684(class222.field3183, var249);
                            }
                            continue;
                        }
                        if (var458 == 3915) {
                            var5--;
                            boolean var250 = field790[var5] == 1;
                            if (Statics.field2180 != null) {
                                Statics.field2180.method3684(class222.field3182, var250);
                            }
                            continue;
                        }
                        if (var458 == 3916) {
                            var5 -= 2;
                            boolean var251 = field790[var5] == 1;
                            boolean var252 = field790[var5 + 1] == 1;
                            if (Statics.field2180 != null) {
                                Statics.field2180.method3684(new class22(var252), var251);
                            }
                            continue;
                        }
                        if (var458 == 3917) {
                            var5--;
                            boolean var253 = field790[var5] == 1;
                            if (Statics.field2180 != null) {
                                Statics.field2180.method3684(class222.field3181, var253);
                            }
                            continue;
                        }
                        if (var458 == 3918) {
                            var5--;
                            boolean var254 = field790[var5] == 1;
                            if (Statics.field2180 != null) {
                                Statics.field2180.method3684(class222.field3184, var254);
                            }
                            continue;
                        }
                        if (var458 == 3919) {
                            field790[var5++] = Statics.field2180 == null ? 0 : Statics.field2180.field3180.size();
                            continue;
                        }
                        if (var458 == 3920) {
                            var5--;
                            int var255 = field790[var5];
                            class215 var256 = (class215) Statics.field2180.field3180.get(var255);
                            field790[var5++] = var256.field3161;
                            continue;
                        }
                        if (var458 == 3921) {
                            var5--;
                            int var257 = field790[var5];
                            class215 var258 = (class215) Statics.field2180.field3180.get(var257);
                            field797[var6++] = var258.method3626();
                            continue;
                        }
                        if (var458 == 3922) {
                            var5--;
                            int var259 = field790[var5];
                            class215 var260 = (class215) Statics.field2180.field3180.get(var259);
                            field797[var6++] = var260.method3627();
                            continue;
                        }
                        if (var458 == 3923) {
                            var5--;
                            int var261 = field790[var5];
                            class215 var262 = (class215) Statics.field2180.field3180.get(var261);
                            long var263 = class116.method2586() - Statics.field560 - var262.field3157;
                            int var265 = (int) (var263 / 3600000L);
                            int var266 = (int) ((var263 - (long) (var265 * 3600000)) / 60000L);
                            int var267 = (int) ((var263 - (long) (var265 * 3600000) - (long) (var266 * 60000)) / 1000L);
                            String var268 = var265 + ":" + var266 / 10 + var266 % 10 + ":" + var267 / 10 + var267 % 10;
                            field797[var6++] = var268;
                            continue;
                        }
                        if (var458 == 3924) {
                            var5--;
                            int var269 = field790[var5];
                            class215 var270 = (class215) Statics.field2180.field3180.get(var269);
                            field790[var5++] = var270.field3158.field3175;
                            continue;
                        }
                        if (var458 == 3925) {
                            var5--;
                            int var271 = field790[var5];
                            class215 var272 = (class215) Statics.field2180.field3180.get(var271);
                            field790[var5++] = var272.field3158.field3177;
                            continue;
                        }
                        if (var458 == 3926) {
                            var5--;
                            int var273 = field790[var5];
                            class215 var274 = (class215) Statics.field2180.field3180.get(var273);
                            field790[var5++] = var274.field3158.field3173;
                            continue;
                        }
                    } else if (var458 < 4100) {
                        if (var458 == 4000) {
                            var5 -= 2;
                            int var275 = field790[var5];
                            int var276 = field790[var5 + 1];
                            field790[var5++] = var275 + var276;
                            continue;
                        }
                        if (var458 == 4001) {
                            var5 -= 2;
                            int var277 = field790[var5];
                            int var278 = field790[var5 + 1];
                            field790[var5++] = var277 - var278;
                            continue;
                        }
                        if (var458 == 4002) {
                            var5 -= 2;
                            int var279 = field790[var5];
                            int var280 = field790[var5 + 1];
                            field790[var5++] = var279 * var280;
                            continue;
                        }
                        if (var458 == 4003) {
                            var5 -= 2;
                            int var281 = field790[var5];
                            int var282 = field790[var5 + 1];
                            field790[var5++] = var281 / var282;
                            continue;
                        }
                        if (var458 == 4004) {
                            var5--;
                            int var283 = field790[var5];
                            field790[var5++] = (int) (Math.random() * (double) var283);
                            continue;
                        }
                        if (var458 == 4005) {
                            var5--;
                            int var284 = field790[var5];
                            field790[var5++] = (int) (Math.random() * (double) (var284 + 1));
                            continue;
                        }
                        if (var458 == 4006) {
                            var5 -= 5;
                            int var285 = field790[var5];
                            int var286 = field790[var5 + 1];
                            int var287 = field790[var5 + 2];
                            int var288 = field790[var5 + 3];
                            int var289 = field790[var5 + 4];
                            field790[var5++] = (var286 - var285) * (var289 - var287) / (var288 - var287) + var285;
                            continue;
                        }
                        if (var458 == 4007) {
                            var5 -= 2;
                            int var290 = field790[var5];
                            int var291 = field790[var5 + 1];
                            field790[var5++] = var290 * var291 / 100 + var290;
                            continue;
                        }
                        if (var458 == 4008) {
                            var5 -= 2;
                            int var292 = field790[var5];
                            int var293 = field790[var5 + 1];
                            field790[var5++] = var292 | 0x1 << var293;
                            continue;
                        }
                        if (var458 == 4009) {
                            var5 -= 2;
                            int var294 = field790[var5];
                            int var295 = field790[var5 + 1];
                            field790[var5++] = var294 & -1 - (0x1 << var295);
                            continue;
                        }
                        if (var458 == 4010) {
                            var5 -= 2;
                            int var296 = field790[var5];
                            int var297 = field790[var5 + 1];
                            field790[var5++] = (var296 & 0x1 << var297) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var458 == 4011) {
                            var5 -= 2;
                            int var298 = field790[var5];
                            int var299 = field790[var5 + 1];
                            field790[var5++] = var298 % var299;
                            continue;
                        }
                        if (var458 == 4012) {
                            var5 -= 2;
                            int var300 = field790[var5];
                            int var301 = field790[var5 + 1];
                            if (var300 == 0) {
                                field790[var5++] = 0;
                            } else {
                                field790[var5++] = (int) Math.pow((double) var300, (double) var301);
                            }
                            continue;
                        }
                        if (var458 == 4013) {
                            var5 -= 2;
                            int var302 = field790[var5];
                            int var303 = field790[var5 + 1];
                            if (var302 == 0) {
                                field790[var5++] = 0;
                            } else if (var303 == 0) {
                                field790[var5++] = Integer.MAX_VALUE;
                            } else {
                                field790[var5++] = (int) Math.pow((double) var302, 1.0D / (double) var303);
                            }
                            continue;
                        }
                        if (var458 == 4014) {
                            var5 -= 2;
                            int var304 = field790[var5];
                            int var305 = field790[var5 + 1];
                            field790[var5++] = var304 & var305;
                            continue;
                        }
                        if (var458 == 4015) {
                            var5 -= 2;
                            int var306 = field790[var5];
                            int var307 = field790[var5 + 1];
                            field790[var5++] = var306 | var307;
                            continue;
                        }
                        if (var458 == 4018) {
                            var5 -= 3;
                            long var308 = (long) field790[var5];
                            long var310 = (long) field790[var5 + 1];
                            long var312 = (long) field790[var5 + 2];
                            field790[var5++] = (int) (var308 * var312 / var310);
                            continue;
                        }
                    } else if (var458 < 4200) {
                        if (var458 == 4100) {
                            var6--;
                            String var314 = field797[var6];
                            var5--;
                            int var315 = field790[var5];
                            field797[var6++] = var314 + var315;
                            continue;
                        }
                        if (var458 == 4101) {
                            var6 -= 2;
                            String var316 = field797[var6];
                            String var317 = field797[var6 + 1];
                            field797[var6++] = var316 + var317;
                            continue;
                        }
                        if (var458 == 4102) {
                            var6--;
                            String var318 = field797[var6];
                            var5--;
                            int var319 = field790[var5];
                            field797[var6++] = var318 + Statics.method2914(var319, true);
                            continue;
                        }
                        if (var458 == 4103) {
                            var6--;
                            String var320 = field797[var6];
                            field797[var6++] = var320.toLowerCase();
                            continue;
                        }
                        if (var458 == 4104) {
                            var5--;
                            int var321 = field790[var5];
                            long var322 = ((long) var321 + 11745L) * 86400000L;
                            field795.setTime(new Date(var322));
                            int var324 = field795.get(5);
                            int var325 = field795.get(2);
                            int var326 = field795.get(1);
                            field797[var6++] = var324 + "-" + field796[var325] + "-" + var326;
                            continue;
                        }
                        if (var458 == 4105) {
                            var6 -= 2;
                            String var327 = field797[var6];
                            String var328 = field797[var6 + 1];
                            if (Statics.field2302.field60 != null && Statics.field2302.field60.field2943) {
                                field797[var6++] = var328;
                                continue;
                            }
                            field797[var6++] = var327;
                            continue;
                        }
                        if (var458 == 4106) {
                            var5--;
                            int var329 = field790[var5];
                            field797[var6++] = Integer.toString(var329);
                            continue;
                        }
                        if (var458 == 4107) {
                            var6 -= 2;
                            field790[var5++] = class164.method2615(class167.method79(field797[var6], field797[var6 + 1], client.field289));
                            continue;
                        }
                        if (var458 == 4108) {
                            var6--;
                            String var330 = field797[var6];
                            var5 -= 2;
                            int var331 = field790[var5];
                            int var332 = field790[var5 + 1];
                            byte[] var333 = Statics.field1372.method3002(var332, 0);
                            class225 var334 = new class225(var333);
                            field790[var5++] = var334.method3718(var330, var331);
                            continue;
                        }
                        if (var458 == 4109) {
                            var6--;
                            String var335 = field797[var6];
                            var5 -= 2;
                            int var336 = field790[var5];
                            int var337 = field790[var5 + 1];
                            byte[] var338 = Statics.field1372.method3002(var337, 0);
                            class225 var339 = new class225(var338);
                            field790[var5++] = var339.method3756(var335, var336);
                            continue;
                        }
                        if (var458 == 4110) {
                            var6 -= 2;
                            String var340 = field797[var6];
                            String var341 = field797[var6 + 1];
                            var5--;
                            if (field790[var5] == 1) {
                                field797[var6++] = var340;
                            } else {
                                field797[var6++] = var341;
                            }
                            continue;
                        }
                        if (var458 == 4111) {
                            var6--;
                            String var342 = field797[var6];
                            field797[var6++] = class224.method3704(var342);
                            continue;
                        }
                        if (var458 == 4112) {
                            var6--;
                            String var343 = field797[var6];
                            var5--;
                            int var344 = field790[var5];
                            field797[var6++] = var343 + (char) var344;
                            continue;
                        }
                        if (var458 == 4113) {
                            var5--;
                            int var345 = field790[var5];
                            field790[var5++] = class164.method2232((char) var345) ? 1 : 0;
                            continue;
                        }
                        if (var458 == 4114) {
                            var5--;
                            int var346 = field790[var5];
                            int[] var347 = field790;
                            int var348 = var5++;
                            char var349 = (char) var346;
                            boolean var350 = var349 >= '0' && var349 <= '9' || var349 >= 'A' && var349 <= 'Z' || var349 >= 'a' && var349 <= 'z';
                            var347[var348] = var350 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 4115) {
                            var5--;
                            int var351 = field790[var5];
                            field790[var5++] = class164.method861((char) var351) ? 1 : 0;
                            continue;
                        }
                        if (var458 == 4116) {
                            var5--;
                            int var352 = field790[var5];
                            int[] var353 = field790;
                            int var354 = var5++;
                            char var355 = (char) var352;
                            boolean var356 = var355 >= '0' && var355 <= '9';
                            var353[var354] = var356 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 4117) {
                            var6--;
                            String var357 = field797[var6];
                            if (var357 == null) {
                                field790[var5++] = 0;
                            } else {
                                field790[var5++] = var357.length();
                            }
                            continue;
                        }
                        if (var458 == 4118) {
                            var6--;
                            String var358 = field797[var6];
                            var5 -= 2;
                            int var359 = field790[var5];
                            int var360 = field790[var5 + 1];
                            field797[var6++] = var358.substring(var359, var360);
                            continue;
                        }
                        if (var458 == 4119) {
                            var6--;
                            String var361 = field797[var6];
                            StringBuilder var362 = new StringBuilder(var361.length());
                            boolean var363 = false;
                            for (int var364 = 0; var364 < var361.length(); var364++) {
                                char var365 = var361.charAt(var364);
                                if (var365 == '<') {
                                    var363 = true;
                                } else if (var365 == '>') {
                                    var363 = false;
                                } else if (!var363) {
                                    var362.append(var365);
                                }
                            }
                            field797[var6++] = var362.toString();
                            continue;
                        }
                        if (var458 == 4120) {
                            var6--;
                            String var366 = field797[var6];
                            var5--;
                            int var367 = field790[var5];
                            field790[var5++] = var366.indexOf(var367);
                            continue;
                        }
                        if (var458 == 4121) {
                            var6 -= 2;
                            String var368 = field797[var6];
                            String var369 = field797[var6 + 1];
                            var5--;
                            int var370 = field790[var5];
                            field790[var5++] = var368.indexOf(var369, var370);
                            continue;
                        }
                    } else if (var458 < 4300) {
                        if (var458 == 4200) {
                            var5--;
                            int var371 = field790[var5];
                            field797[var6++] = class52.method2583(var371).field1121;
                            continue;
                        }
                        if (var458 == 4201) {
                            var5 -= 2;
                            int var372 = field790[var5];
                            int var373 = field790[var5 + 1];
                            class52 var374 = class52.method2583(var372);
                            if (var373 >= 1 && var373 <= 5 && var374.field1156[var373 - 1] != null) {
                                field797[var6++] = var374.field1156[var373 - 1];
                                continue;
                            }
                            field797[var6++] = "";
                            continue;
                        }
                        if (var458 == 4202) {
                            var5 -= 2;
                            int var375 = field790[var5];
                            int var376 = field790[var5 + 1];
                            class52 var377 = class52.method2583(var375);
                            if (var376 >= 1 && var376 <= 5 && var377.field1122[var376 - 1] != null) {
                                field797[var6++] = var377.field1122[var376 - 1];
                                continue;
                            }
                            field797[var6++] = "";
                            continue;
                        }
                        if (var458 == 4203) {
                            var5--;
                            int var378 = field790[var5];
                            field790[var5++] = class52.method2583(var378).field1118;
                            continue;
                        }
                        if (var458 == 4204) {
                            var5--;
                            int var379 = field790[var5];
                            field790[var5++] = class52.method2583(var379).field1132 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 4205) {
                            var5--;
                            int var380 = field790[var5];
                            class52 var381 = class52.method2583(var380);
                            if (var381.field1152 == -1 && var381.field1151 >= 0) {
                                field790[var5++] = var381.field1151;
                                continue;
                            }
                            field790[var5++] = var380;
                            continue;
                        }
                        if (var458 == 4206) {
                            var5--;
                            int var382 = field790[var5];
                            class52 var383 = class52.method2583(var382);
                            if (var383.field1152 >= 0 && var383.field1151 >= 0) {
                                field790[var5++] = var383.field1151;
                                continue;
                            }
                            field790[var5++] = var382;
                            continue;
                        }
                        if (var458 == 4207) {
                            var5--;
                            int var384 = field790[var5];
                            field790[var5++] = class52.method2583(var384).field1135 ? 1 : 0;
                            continue;
                        }
                        if (var458 == 4208) {
                            var5--;
                            int var385 = field790[var5];
                            class52 var386 = class52.method2583(var385);
                            if (var386.field1163 == -1 && var386.field1162 >= 0) {
                                field790[var5++] = var386.field1162;
                                continue;
                            }
                            field790[var5++] = var385;
                            continue;
                        }
                        if (var458 == 4209) {
                            var5--;
                            int var387 = field790[var5];
                            class52 var388 = class52.method2583(var387);
                            if (var388.field1163 >= 0 && var388.field1162 >= 0) {
                                field790[var5++] = var388.field1162;
                                continue;
                            }
                            field790[var5++] = var387;
                            continue;
                        }
                        if (var458 == 4210) {
                            var6--;
                            String var389 = field797[var6];
                            var5--;
                            int var390 = field790[var5];
                            boolean var392 = var390 == 1;
                            String var393 = var389.toLowerCase();
                            short[] var394 = new short[16];
                            int var395 = 0;
                            int var396 = 0;
                            while (true) {
                                if (var396 >= Statics.field1126) {
                                    Statics.field1570 = var394;
                                    Statics.field2174 = 0;
                                    Statics.field746 = var395;
                                    String[] var400 = new String[Statics.field746];
                                    for (int var401 = 0; var401 < Statics.field746; var401++) {
                                        var400[var401] = class52.method2583(var394[var401]).field1121;
                                    }
                                    short[] var402 = Statics.field1570;
                                    class125.method703(var400, var402, 0, var400.length - 1);
                                    break;
                                }
                                class52 var397 = class52.method2583(var396);
                                if ((!var392 || var397.field1159) && var397.field1152 == -1 && var397.field1121.toLowerCase().indexOf(var393) != -1) {
                                    if (var395 >= 250) {
                                        Statics.field746 = -1;
                                        Statics.field1570 = null;
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
                            field790[var5++] = Statics.field746;
                            continue;
                        }
                        if (var458 == 4211) {
                            if (Statics.field1570 != null && Statics.field2174 < Statics.field746) {
                                field790[var5++] = Statics.field1570[++Statics.field2174 - 1] & 0xFFFF;
                                continue;
                            }
                            field790[var5++] = -1;
                            continue;
                        }
                        if (var458 == 4212) {
                            Statics.field2174 = 0;
                            continue;
                        }
                    } else if (var458 < 5100) {
                        if (var458 == 5000) {
                            field790[var5++] = client.field501;
                            continue;
                        }
                        if (var458 == 5001) {
                            var5 -= 3;
                            client.field501 = field790[var5];
                            Statics.field2080 = class131.method69(field790[var5 + 1]);
                            if (Statics.field2080 == null) {
                                Statics.field2080 = class131.field2069;
                            }
                            client.field502 = field790[var5 + 2];
                            client.field326.method2573(210);
                            client.field326.method2293(client.field501);
                            client.field326.method2293(Statics.field2080.field2070);
                            client.field326.method2293(client.field502);
                            continue;
                        }
                        if (var458 == 5002) {
                            var6--;
                            String var403 = field797[var6];
                            var5 -= 2;
                            int var404 = field790[var5];
                            int var405 = field790[var5 + 1];
                            client.field326.method2573(220);
                            client.field326.method2293(class120.method2086(var403) + 2);
                            client.field326.method2426(var403);
                            client.field326.method2293(var404 - 1);
                            client.field326.method2293(var405);
                            continue;
                        }
                        if (var458 == 5003) {
                            var5 -= 2;
                            int var406 = field790[var5];
                            int var407 = field790[var5 + 1];
                            class28 var408 = (class28) class12.field176.get(var406);
                            class36 var409 = var408.method621(var407);
                            if (var409 == null) {
                                field790[var5++] = -1;
                                field790[var5++] = 0;
                                field797[var6++] = "";
                                field797[var6++] = "";
                                field797[var6++] = "";
                            } else {
                                field790[var5++] = var409.field781;
                                field790[var5++] = var409.field777;
                                field797[var6++] = var409.field779 == null ? "" : var409.field779;
                                field797[var6++] = var409.field780 == null ? "" : var409.field780;
                                field797[var6++] = var409.field785 == null ? "" : var409.field785;
                            }
                            continue;
                        }
                        if (var458 == 5004) {
                            var5--;
                            int var411 = field790[var5];
                            class36 var412 = class12.method1025(var411);
                            if (var412 == null) {
                                field790[var5++] = -1;
                                field790[var5++] = 0;
                                field797[var6++] = "";
                                field797[var6++] = "";
                                field797[var6++] = "";
                            } else {
                                field790[var5++] = var412.field778;
                                field790[var5++] = var412.field777;
                                field797[var6++] = var412.field779 == null ? "" : var412.field779;
                                field797[var6++] = var412.field780 == null ? "" : var412.field780;
                                field797[var6++] = var412.field785 == null ? "" : var412.field785;
                            }
                            continue;
                        }
                        if (var458 == 5005) {
                            if (Statics.field2080 == null) {
                                field790[var5++] = -1;
                            } else {
                                field790[var5++] = Statics.field2080.field2070;
                            }
                            continue;
                        }
                        if (var458 == 5008) {
                            var6--;
                            String var413 = field797[var6];
                            var5--;
                            int var414 = field790[var5];
                            String var415 = var413.toLowerCase();
                            byte var416 = 0;
                            if (var415.startsWith(class158.field2429)) {
                                var416 = 0;
                                var413 = var413.substring(class158.field2429.length());
                            } else if (var415.startsWith(class158.field2512)) {
                                var416 = 1;
                                var413 = var413.substring(class158.field2512.length());
                            } else if (var415.startsWith(class158.field2574)) {
                                var416 = 2;
                                var413 = var413.substring(class158.field2574.length());
                            } else if (var415.startsWith(class158.field2402)) {
                                var416 = 3;
                                var413 = var413.substring(class158.field2402.length());
                            } else if (var415.startsWith(class158.field2386)) {
                                var416 = 4;
                                var413 = var413.substring(class158.field2386.length());
                            } else if (var415.startsWith(class158.field2555)) {
                                var416 = 5;
                                var413 = var413.substring(class158.field2555.length());
                            } else if (var415.startsWith(class158.field2522)) {
                                var416 = 6;
                                var413 = var413.substring(class158.field2522.length());
                            } else if (var415.startsWith(class158.field2524)) {
                                var416 = 7;
                                var413 = var413.substring(class158.field2524.length());
                            } else if (var415.startsWith(class158.field2526)) {
                                var416 = 8;
                                var413 = var413.substring(class158.field2526.length());
                            } else if (var415.startsWith(class158.field2538)) {
                                var416 = 9;
                                var413 = var413.substring(class158.field2538.length());
                            } else if (var415.startsWith(class158.field2530)) {
                                var416 = 10;
                                var413 = var413.substring(class158.field2530.length());
                            } else if (var415.startsWith(class158.field2345)) {
                                var416 = 11;
                                var413 = var413.substring(class158.field2345.length());
                            } else if (client.field289 != 0) {
                                if (var415.startsWith(class158.field2511)) {
                                    var416 = 0;
                                    var413 = var413.substring(class158.field2511.length());
                                } else if (var415.startsWith(class158.field2472)) {
                                    var416 = 1;
                                    var413 = var413.substring(class158.field2472.length());
                                } else if (var415.startsWith(class158.field2460)) {
                                    var416 = 2;
                                    var413 = var413.substring(class158.field2460.length());
                                } else if (var415.startsWith(class158.field2520)) {
                                    var416 = 3;
                                    var413 = var413.substring(class158.field2520.length());
                                } else if (var415.startsWith(class158.field2340)) {
                                    var416 = 4;
                                    var413 = var413.substring(class158.field2340.length());
                                } else if (var415.startsWith(class158.field2370)) {
                                    var416 = 5;
                                    var413 = var413.substring(class158.field2370.length());
                                } else if (var415.startsWith(class158.field2523)) {
                                    var416 = 6;
                                    var413 = var413.substring(class158.field2523.length());
                                } else if (var415.startsWith(class158.field2528)) {
                                    var416 = 7;
                                    var413 = var413.substring(class158.field2528.length());
                                } else if (var415.startsWith(class158.field2439)) {
                                    var416 = 8;
                                    var413 = var413.substring(class158.field2439.length());
                                } else if (var415.startsWith(class158.field2544)) {
                                    var416 = 9;
                                    var413 = var413.substring(class158.field2544.length());
                                } else if (var415.startsWith(class158.field2531)) {
                                    var416 = 10;
                                    var413 = var413.substring(class158.field2531.length());
                                } else if (var415.startsWith(class158.field2533)) {
                                    var416 = 11;
                                    var413 = var413.substring(class158.field2533.length());
                                }
                            }
                            String var417 = var413.toLowerCase();
                            byte var418 = 0;
                            if (var417.startsWith(class158.field2383)) {
                                var418 = 1;
                                var413 = var413.substring(class158.field2383.length());
                            } else if (var417.startsWith(class158.field2536)) {
                                var418 = 2;
                                var413 = var413.substring(class158.field2536.length());
                            } else if (var417.startsWith(class158.field2589)) {
                                var418 = 3;
                                var413 = var413.substring(class158.field2589.length());
                            } else if (var417.startsWith(class158.field2446)) {
                                var418 = 4;
                                var413 = var413.substring(class158.field2446.length());
                            } else if (var417.startsWith(class158.field2542)) {
                                var418 = 5;
                                var413 = var413.substring(class158.field2542.length());
                            } else if (client.field289 != 0) {
                                if (var417.startsWith(class158.field2535)) {
                                    var418 = 1;
                                    var413 = var413.substring(class158.field2535.length());
                                } else if (var417.startsWith(class158.field2537)) {
                                    var418 = 2;
                                    var413 = var413.substring(class158.field2537.length());
                                } else if (var417.startsWith(class158.field2539)) {
                                    var418 = 3;
                                    var413 = var413.substring(class158.field2539.length());
                                } else if (var417.startsWith(class158.field2541)) {
                                    var418 = 4;
                                    var413 = var413.substring(class158.field2541.length());
                                } else if (var417.startsWith(class158.field2543)) {
                                    var418 = 5;
                                    var413 = var413.substring(class158.field2543.length());
                                }
                            }
                            client.field326.method2573(194);
                            client.field326.method2293(0);
                            int var419 = client.field326.field2001;
                            client.field326.method2293(var414);
                            client.field326.method2293(var416);
                            client.field326.method2293(var418);
                            class223.method3427(client.field326, var413);
                            client.field326.method2305(client.field326.field2001 - var419);
                            continue;
                        }
                        if (var458 == 5009) {
                            var6 -= 2;
                            String var420 = field797[var6];
                            String var421 = field797[var6 + 1];
                            client.field326.method2573(228);
                            client.field326.method2294(0);
                            int var422 = client.field326.field2001;
                            client.field326.method2426(var420);
                            class223.method3427(client.field326, var421);
                            client.field326.method2311(client.field326.field2001 - var422);
                            continue;
                        }
                        if (var458 == 5015) {
                            String var423;
                            if (Statics.field2302 == null || Statics.field2302.field40 == null) {
                                var423 = "";
                            } else {
                                var423 = Statics.field2302.field40;
                            }
                            field797[var6++] = var423;
                            continue;
                        }
                        if (var458 == 5016) {
                            field790[var5++] = client.field502;
                            continue;
                        }
                        if (var458 == 5017) {
                            var5--;
                            int var424 = field790[var5];
                            field790[var5++] = class12.method709(var424);
                            continue;
                        }
                        if (var458 == 5018) {
                            var5--;
                            int var425 = field790[var5];
                            int[] var426 = field790;
                            int var427 = var5++;
                            class36 var428 = (class36) class12.field181.method3498((long) var425);
                            int var429;
                            if (var428 == null) {
                                var429 = -1;
                            } else if (class12.field175.field3111 == var428.field3115) {
                                var429 = -1;
                            } else {
                                var429 = ((class36) var428.field3115).field781;
                            }
                            var426[var427] = var429;
                            continue;
                        }
                        if (var458 == 5019) {
                            var5--;
                            int var430 = field790[var5];
                            field790[var5++] = Statics.method67(var430);
                            continue;
                        }
                        if (var458 == 5020) {
                            var6--;
                            String var431 = field797[var6];
                            client.method2890(var431);
                            continue;
                        }
                        if (var458 == 5021) {
                            var6--;
                            client.field300 = field797[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var458 == 5022) {
                            field797[var6++] = client.field300;
                            continue;
                        }
                    }
                } else {
                    class174 var90;
                    if (var458 >= 2000) {
                        var458 -= 1000;
                        var5--;
                        var90 = class174.method3117(field790[var5]);
                    } else {
                        var90 = var62 ? Statics.field2936 : Statics.field794;
                    }
                    if (var458 == 1300) {
                        var5--;
                        int var91 = field790[var5] - 1;
                        if (var91 >= 0 && var91 <= 9) {
                            var6--;
                            var90.method3149(var91, field797[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var458 == 1301) {
                        var5 -= 2;
                        int var92 = field790[var5];
                        int var93 = field790[var5 + 1];
                        var90.field2852 = class174.method1454(var92, var93);
                        continue;
                    }
                    if (var458 == 1302) {
                        var5--;
                        var90.field2855 = field790[var5] == 1;
                        continue;
                    }
                    if (var458 == 1303) {
                        var5--;
                        var90.field2853 = field790[var5];
                        continue;
                    }
                    if (var458 == 1304) {
                        var5--;
                        var90.field2832 = field790[var5];
                        continue;
                    }
                    if (var458 == 1305) {
                        var6--;
                        var90.field2834 = field797[var6];
                        continue;
                    }
                    if (var458 == 1306) {
                        var6--;
                        var90.field2797 = field797[var6];
                        continue;
                    }
                    if (var458 == 1307) {
                        var90.field2851 = null;
                        continue;
                    }
                }
                if (var458 < 5400) {
                    if (var458 == 5306) {
                        int[] var432 = field790;
                        int var433 = var5++;
                        int var434 = client.field497 ? 2 : 1;
                        var432[var433] = var434;
                        continue;
                    }
                    if (var458 == 5307) {
                        var5--;
                        int var435 = field790[var5];
                        if (var435 == 1 || var435 == 2) {
                            client.method1138(var435);
                        }
                        continue;
                    }
                    if (var458 == 5308) {
                        field790[var5++] = Statics.field1989.field141;
                        continue;
                    }
                    if (var458 == 5309) {
                        var5--;
                        int var436 = field790[var5];
                        if (var436 == 1 || var436 == 2) {
                            Statics.field1989.field141 = var436;
                            class9.method581();
                        }
                        continue;
                    }
                }
                if (var458 < 5600) {
                    if (var458 == 5504) {
                        var5 -= 2;
                        int var437 = field790[var5];
                        int var438 = field790[var5 + 1];
                        if (!client.field531) {
                            client.field368 = var437;
                            client.field303 = var438;
                        }
                        continue;
                    }
                    if (var458 == 5505) {
                        field790[var5++] = client.field368;
                        continue;
                    }
                    if (var458 == 5506) {
                        field790[var5++] = client.field303;
                        continue;
                    }
                    if (var458 == 5530) {
                        var5--;
                        int var439 = field790[var5];
                        if (var439 < 0) {
                            var439 = 0;
                        }
                        client.field374 = var439;
                        continue;
                    }
                    if (var458 == 5531) {
                        field790[var5++] = client.field374;
                        continue;
                    }
                }
                if (var458 >= 5700 || var458 != 5630) {
                    if (var458 < 6300) {
                        if (var458 == 6200) {
                            var5 -= 2;
                            client.field537 = (short) field790[var5];
                            if (client.field537 <= 0) {
                                client.field537 = 256;
                            }
                            client.field420 = (short) field790[var5 + 1];
                            if (client.field420 <= 0) {
                                client.field420 = 205;
                            }
                            continue;
                        }
                        if (var458 == 6201) {
                            var5 -= 2;
                            client.field539 = (short) field790[var5];
                            if (client.field539 <= 0) {
                                client.field539 = 256;
                            }
                            client.field519 = (short) field790[var5 + 1];
                            if (client.field519 <= 0) {
                                client.field519 = 320;
                            }
                            continue;
                        }
                        if (var458 == 6202) {
                            var5 -= 4;
                            client.field541 = (short) field790[var5];
                            if (client.field541 <= 0) {
                                client.field541 = 1;
                            }
                            client.field542 = (short) field790[var5 + 1];
                            if (client.field542 <= 0) {
                                client.field542 = 32767;
                            } else if (client.field542 < client.field541) {
                                client.field542 = client.field541;
                            }
                            client.field527 = (short) field790[var5 + 2];
                            if (client.field527 <= 0) {
                                client.field527 = 1;
                            }
                            client.field544 = (short) field790[var5 + 3];
                            if (client.field544 <= 0) {
                                client.field544 = 32767;
                            } else if (client.field544 < client.field527) {
                                client.field544 = client.field527;
                            }
                            continue;
                        }
                        if (var458 == 6203) {
                            if (client.field455 == null) {
                                field790[var5++] = -1;
                                field790[var5++] = -1;
                            } else {
                                client.method636(0, 0, client.field455.field2792, client.field455.field2793, false);
                                field790[var5++] = client.field415;
                                field790[var5++] = client.field548;
                            }
                            continue;
                        }
                        if (var458 == 6204) {
                            field790[var5++] = client.field539;
                            field790[var5++] = client.field519;
                            continue;
                        }
                        if (var458 == 6205) {
                            field790[var5++] = client.field537;
                            field790[var5++] = client.field420;
                            continue;
                        }
                    }
                    if (var458 < 6600) {
                        if (var458 == 6500) {
                            field790[var5++] = class26.method154() ? 1 : 0;
                            continue;
                        }
                        if (var458 == 6501) {
                            class26.field635 = 0;
                            class26 var440;
                            if (class26.field635 < class26.field630) {
                                var440 = Statics.field637[++class26.field635 - 1];
                            } else {
                                var440 = null;
                            }
                            if (var440 == null) {
                                field790[var5++] = -1;
                                field790[var5++] = 0;
                                field797[var6++] = "";
                                field790[var5++] = 0;
                                field790[var5++] = 0;
                                field797[var6++] = "";
                            } else {
                                field790[var5++] = var440.field638;
                                field790[var5++] = var440.field646;
                                field797[var6++] = var440.field634;
                                field790[var5++] = var440.field643;
                                field790[var5++] = var440.field640;
                                field797[var6++] = var440.field641;
                            }
                            continue;
                        }
                        if (var458 == 6502) {
                            class26 var443;
                            if (class26.field635 < class26.field630) {
                                var443 = Statics.field637[++class26.field635 - 1];
                            } else {
                                var443 = null;
                            }
                            if (var443 == null) {
                                field790[var5++] = -1;
                                field790[var5++] = 0;
                                field797[var6++] = "";
                                field790[var5++] = 0;
                                field790[var5++] = 0;
                                field797[var6++] = "";
                            } else {
                                field790[var5++] = var443.field638;
                                field790[var5++] = var443.field646;
                                field797[var6++] = var443.field634;
                                field790[var5++] = var443.field643;
                                field790[var5++] = var443.field640;
                                field797[var6++] = var443.field641;
                            }
                            continue;
                        }
                        if (var458 == 6506) {
                            var5--;
                            int var445 = field790[var5];
                            class26 var446 = null;
                            for (int var447 = 0; var447 < class26.field630; var447++) {
                                if (Statics.field637[var447].field638 == var445) {
                                    var446 = Statics.field637[var447];
                                    break;
                                }
                            }
                            if (var446 == null) {
                                field790[var5++] = -1;
                                field790[var5++] = 0;
                                field797[var6++] = "";
                                field790[var5++] = 0;
                                field790[var5++] = 0;
                                field797[var6++] = "";
                            } else {
                                field790[var5++] = var446.field638;
                                field790[var5++] = var446.field646;
                                field797[var6++] = var446.field634;
                                field790[var5++] = var446.field643;
                                field790[var5++] = var446.field640;
                                field797[var6++] = var446.field641;
                            }
                            continue;
                        }
                        if (var458 == 6507) {
                            var5 -= 4;
                            int var448 = field790[var5];
                            boolean var449 = field790[var5 + 1] == 1;
                            int var450 = field790[var5 + 2];
                            boolean var451 = field790[var5 + 3] == 1;
                            class26.method2967(var448, var449, var450, var451);
                            continue;
                        }
                        if (var458 == 6511) {
                            var5--;
                            int var452 = field790[var5];
                            if (var452 >= 0 && var452 < class26.field630) {
                                class26 var453 = Statics.field637[var452];
                                field790[var5++] = var453.field638;
                                field790[var5++] = var453.field646;
                                field797[var6++] = var453.field634;
                                field790[var5++] = var453.field643;
                                field790[var5++] = var453.field640;
                                field797[var6++] = var453.field641;
                                continue;
                            }
                            field790[var5++] = -1;
                            field790[var5++] = 0;
                            field797[var6++] = "";
                            field790[var5++] = 0;
                            field790[var5++] = 0;
                            field797[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field336 = 250;
            }
        } catch (Exception var457) {
            StringBuilder var455 = new StringBuilder(30);
            var455.append("").append(var4.field3126).append(" ");
            for (int var456 = field803 - 1; var456 >= 0; var456--) {
                var455.append("").append(field793[var456].field216.field3126).append(" ");
            }
            var455.append("").append(var10);
            class149.method635(var455.toString(), var457);
        }
    }

    @ObfuscatedName("cw.g(II)V")
    public static void method1984(int arg0) {
        if (arg0 == -1 || !class174.method3153(arg0)) {
            return;
        }
        class174[] var1 = Statics.field3169[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174 var3 = var1[var2];
            if (var3.field2828 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field6 = var3.field2828;
                method623(var4, 2000000);
            }
        }
    }
}
