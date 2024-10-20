package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("an")
public class class34 {

    @ObfuscatedName("an.h")
    public static int[] field744 = new int[5];

    @ObfuscatedName("an.q")
    public static int[][] field745 = new int[5][5000];

    @ObfuscatedName("an.l")
    public static int[] field742 = new int[1000];

    @ObfuscatedName("an.c")
    public static String[] field747 = new String[1000];

    @ObfuscatedName("an.f")
    public static int field752 = 0;

    @ObfuscatedName("an.s")
    public static class14[] field749 = new class14[50];

    @ObfuscatedName("an.b")
    public static Calendar field750 = Calendar.getInstance();

    @ObfuscatedName("an.v")
    public static final String[] field751 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("an.z")
    public static int field748 = 0;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.n(Ln;I)V")
    public static void method613(class1 arg0) {
        method635(arg0, 200000);
    }

    @ObfuscatedName("au.w(Ln;II)V")
    public static void method635(class1 arg0, int arg1) {
        Object[] var2 = arg0.field7;
        int var3 = (Integer) var2[0];
        class20 var4 = class20.method153(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field551;
        int[] var9 = var4.field552;
        byte var10 = -1;
        field752 = 0;
        try {
            Statics.field743 = new int[var4.field558];
            int var11 = 0;
            Statics.field755 = new String[var4.field555];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field10;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2651;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2652;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field13 == null ? -1 : arg0.field13.field2651;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field13 == null ? -1 : arg0.field13.field2652;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field6;
                    }
                    Statics.field743[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field9;
                    }
                    Statics.field755[var12++] = var15;
                }
            }
            int var16 = 0;
            field748 = arg0.field11;
            label2987: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var474 = var8[var7];
                if (var474 < 100) {
                    if (var474 == 0) {
                        field742[var5++] = var9[var7];
                        continue;
                    }
                    if (var474 == 1) {
                        int var17 = var9[var7];
                        field742[var5++] = class167.field2805[var17];
                        continue;
                    }
                    if (var474 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class167.field2805[var18] = field742[var5];
                        client.method157(var18);
                        continue;
                    }
                    if (var474 == 3) {
                        field747[var6++] = var4.field561[var7];
                        continue;
                    }
                    if (var474 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var474 == 7) {
                        var5 -= 2;
                        if (field742[var5 + 1] != field742[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var474 == 8) {
                        var5 -= 2;
                        if (field742[var5 + 1] == field742[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var474 == 9) {
                        var5 -= 2;
                        if (field742[var5] < field742[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var474 == 10) {
                        var5 -= 2;
                        if (field742[var5] > field742[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var474 == 21) {
                        if (field752 == 0) {
                            return;
                        }
                        class14 var19 = field749[--field752];
                        var4 = var19.field193;
                        var8 = var4.field551;
                        var9 = var4.field552;
                        var7 = var19.field191;
                        Statics.field743 = var19.field192;
                        Statics.field755 = var19.field197;
                        continue;
                    }
                    if (var474 == 25) {
                        int var20 = var9[var7];
                        field742[var5++] = class167.method1895(var20);
                        continue;
                    }
                    if (var474 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field742[var5];
                        class44 var23 = (class44) class44.field1004.method3315((long) var21);
                        class44 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field753.method2859(14, var21);
                            class44 var26 = new class44();
                            if (var25 != null) {
                                var26.method855(new class111(var25));
                            }
                            class44.field1004.method3317(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field1003;
                        int var29 = var24.field1005;
                        int var30 = var24.field1006;
                        int var31 = class167.field2800[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class167.field2805[var28] = class167.field2805[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var474 == 31) {
                        var5 -= 2;
                        if (field742[var5] <= field742[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var474 == 32) {
                        var5 -= 2;
                        if (field742[var5] >= field742[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var474 == 33) {
                        field742[var5++] = Statics.field743[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var474 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field743[var10001] = field742[var5];
                        continue;
                    }
                    if (var474 == 35) {
                        field747[var6++] = Statics.field755[var9[var7]];
                        continue;
                    }
                    if (var474 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field755[var10001] = field747[var6];
                        continue;
                    }
                    if (var474 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String[] var34 = field747;
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
                        field747[var6++] = var35;
                        continue;
                    }
                    if (var474 == 38) {
                        var5--;
                        continue;
                    }
                    if (var474 == 39) {
                        var6--;
                        continue;
                    }
                    if (var474 == 40) {
                        int var45 = var9[var7];
                        class20 var46 = class20.method153(var45);
                        int[] var47 = new int[var46.field558];
                        String[] var48 = new String[var46.field555];
                        for (int var49 = 0; var49 < var46.field550; var49++) {
                            var47[var49] = field742[var5 - var46.field550 + var49];
                        }
                        for (int var50 = 0; var50 < var46.field557; var50++) {
                            var48[var50] = field747[var6 - var46.field557 + var50];
                        }
                        var5 -= var46.field550;
                        var6 -= var46.field557;
                        class14 var51 = new class14();
                        var51.field193 = var4;
                        var51.field191 = var7;
                        var51.field192 = Statics.field743;
                        var51.field197 = Statics.field755;
                        field749[++field752 - 1] = var51;
                        var4 = var46;
                        var8 = var46.field551;
                        var9 = var46.field552;
                        var7 = -1;
                        Statics.field743 = var47;
                        Statics.field755 = var48;
                        continue;
                    }
                    if (var474 == 42) {
                        field742[var5++] = client.field458[var9[var7]];
                        continue;
                    }
                    if (var474 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field458[var10001] = field742[var5];
                        continue;
                    }
                    if (var474 == 44) {
                        int var52 = var9[var7] >> 16;
                        int var53 = var9[var7] & 0xFFFF;
                        var5--;
                        int var54 = field742[var5];
                        if (var54 >= 0 && var54 <= 5000) {
                            field744[var52] = var54;
                            byte var55 = -1;
                            if (var53 == 105) {
                                var55 = 0;
                            }
                            int var56 = 0;
                            while (true) {
                                if (var56 >= var54) {
                                    continue label2987;
                                }
                                field745[var52][var56] = var55;
                                var56++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 45) {
                        int var57 = var9[var7];
                        var5--;
                        int var58 = field742[var5];
                        if (var58 >= 0 && var58 < field744[var57]) {
                            field742[var5++] = field745[var57][var58];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 46) {
                        int var59 = var9[var7];
                        var5 -= 2;
                        int var60 = field742[var5];
                        if (var60 >= 0 && var60 < field744[var59]) {
                            field745[var59][var60] = field742[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 47) {
                        String var61 = client.field459[var9[var7]];
                        if (var61 == null) {
                            var61 = "null";
                        }
                        field747[var6++] = var61;
                        continue;
                    }
                    if (var474 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field459[var10001] = field747[var6];
                        continue;
                    }
                }
                boolean var62;
                if (var9[var7] == 1) {
                    var62 = true;
                } else {
                    var62 = false;
                }
                if (var474 < 1000) {
                    if (var474 == 100) {
                        var5 -= 3;
                        int var63 = field742[var5];
                        int var64 = field742[var5 + 1];
                        int var65 = field742[var5 + 2];
                        if (var64 == 0) {
                            throw new RuntimeException();
                        }
                        class164 var66 = class164.method2517(var63);
                        if (var66.field2743 == null) {
                            var66.field2743 = new class164[var65 + 1];
                        }
                        if (var66.field2743.length <= var65) {
                            class164[] var67 = new class164[var65 + 1];
                            for (int var68 = 0; var68 < var66.field2743.length; var68++) {
                                var67[var68] = var66.field2743[var68];
                            }
                            var66.field2743 = var67;
                        }
                        if (var65 > 0 && var66.field2743[var65 - 1] == null) {
                            throw new RuntimeException("" + (var65 - 1));
                        }
                        class164 var69 = new class164();
                        var69.field2653 = var64;
                        var69.field2774 = var69.field2651 = var66.field2651;
                        var69.field2652 = var65;
                        var69.field2777 = true;
                        var66.field2743[var65] = var69;
                        if (var62) {
                            Statics.field1308 = var69;
                        } else {
                            Statics.field602 = var69;
                        }
                        client.method2103(var66);
                        continue;
                    }
                    if (var474 == 101) {
                        class164 var70 = var62 ? Statics.field1308 : Statics.field602;
                        class164 var71 = class164.method2517(var70.field2651);
                        var71.field2743[var70.field2652] = null;
                        client.method2103(var71);
                        continue;
                    }
                    if (var474 == 102) {
                        var5--;
                        class164 var72 = class164.method2517(field742[var5]);
                        var72.field2743 = null;
                        client.method2103(var72);
                        continue;
                    }
                    if (var474 == 200) {
                        var5 -= 2;
                        int var73 = field742[var5];
                        int var74 = field742[var5 + 1];
                        class164 var75 = class164.method1360(var73, var74);
                        if (var75 != null && var74 != -1) {
                            field742[var5++] = 1;
                            if (var62) {
                                Statics.field1308 = var75;
                            } else {
                                Statics.field602 = var75;
                            }
                            continue;
                        }
                        field742[var5++] = 0;
                        continue;
                    }
                    if (var474 == 201) {
                        var5--;
                        class164 var76 = class164.method2517(field742[var5]);
                        if (var76 == null) {
                            field742[var5++] = 0;
                        } else {
                            field742[var5++] = 1;
                            if (var62) {
                                Statics.field1308 = var76;
                            } else {
                                Statics.field602 = var76;
                            }
                        }
                        continue;
                    }
                } else if (!(var474 < 1000 || var474 >= 1100) || !(var474 < 2000 || var474 >= 2100)) {
                    int var77 = -1;
                    class164 var78;
                    if (var474 >= 2000) {
                        var474 -= 1000;
                        var5--;
                        var77 = field742[var5];
                        var78 = class164.method2517(var77);
                    } else {
                        var78 = var62 ? Statics.field1308 : Statics.field602;
                    }
                    if (var474 == 1000) {
                        var5 -= 4;
                        var78.field2719 = field742[var5];
                        var78.field2661 = field742[var5 + 1];
                        var78.field2660 = field742[var5 + 2];
                        var78.field2657 = field742[var5 + 3];
                        client.method2103(var78);
                        client.method2503(var78);
                        if (var77 != -1 && var78.field2653 == 0) {
                            client.method2754(Statics.field2642[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var474 == 1001) {
                        var5 -= 4;
                        var78.field2662 = field742[var5];
                        var78.field2682 = field742[var5 + 1];
                        var78.field2658 = field742[var5 + 2];
                        var78.field2758 = field742[var5 + 3];
                        client.method2103(var78);
                        client.method2503(var78);
                        if (var77 != -1 && var78.field2653 == 0) {
                            client.method2754(Statics.field2642[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var474 == 1003) {
                        var5--;
                        boolean var79 = field742[var5] == 1;
                        if (var78.field2671 != var79) {
                            var78.field2671 = var79;
                            client.method2103(var78);
                        }
                        continue;
                    }
                    if (var474 == 1005) {
                        var5--;
                        var78.field2782 = field742[var5] == 1;
                        continue;
                    }
                } else if (var474 >= 1100 && var474 < 1200 || var474 >= 2100 && var474 < 2200) {
                    int var80 = -1;
                    class164 var81;
                    if (var474 >= 2000) {
                        var474 -= 1000;
                        var5--;
                        var80 = field742[var5];
                        var81 = class164.method2517(var80);
                    } else {
                        var81 = var62 ? Statics.field1308 : Statics.field602;
                    }
                    if (var474 == 1100) {
                        var5 -= 2;
                        var81.field2672 = field742[var5];
                        if (var81.field2672 > var81.field2674 - var81.field2677) {
                            var81.field2672 = var81.field2674 - var81.field2677;
                        }
                        if (var81.field2672 < 0) {
                            var81.field2672 = 0;
                        }
                        var81.field2673 = field742[var5 + 1];
                        if (var81.field2673 > var81.field2675 - var81.field2667) {
                            var81.field2673 = var81.field2675 - var81.field2667;
                        }
                        if (var81.field2673 < 0) {
                            var81.field2673 = 0;
                        }
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1101) {
                        var5--;
                        var81.field2720 = field742[var5];
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1102) {
                        var5--;
                        var81.field2680 = field742[var5] == 1;
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1103) {
                        var5--;
                        var81.field2659 = field742[var5];
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1104) {
                        var5--;
                        var81.field2681 = field742[var5];
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1105) {
                        var5--;
                        var81.field2684 = field742[var5];
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1106) {
                        var5--;
                        var81.field2691 = field742[var5];
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1107) {
                        var5--;
                        var81.field2687 = field742[var5] == 1;
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1108) {
                        var81.field2692 = 1;
                        var5--;
                        var81.field2647 = field742[var5];
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1109) {
                        var5 -= 6;
                        var81.field2698 = field742[var5];
                        var81.field2699 = field742[var5 + 1];
                        var81.field2776 = field742[var5 + 2];
                        var81.field2701 = field742[var5 + 3];
                        var81.field2702 = field742[var5 + 4];
                        var81.field2703 = field742[var5 + 5];
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1110) {
                        var5--;
                        int var82 = field742[var5];
                        if (var81.field2696 != var82) {
                            var81.field2696 = var82;
                            var81.field2771 = 0;
                            var81.field2772 = 0;
                            client.method2103(var81);
                        }
                        continue;
                    }
                    if (var474 == 1111) {
                        var5--;
                        var81.field2706 = field742[var5] == 1;
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1112) {
                        var6--;
                        String var83 = field747[var6];
                        if (!var83.equals(var81.field2709)) {
                            var81.field2709 = var83;
                            client.method2103(var81);
                        }
                        continue;
                    }
                    if (var474 == 1113) {
                        var5--;
                        var81.field2708 = field742[var5];
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1114) {
                        var5 -= 3;
                        var81.field2712 = field742[var5];
                        var81.field2713 = field742[var5 + 1];
                        var81.field2711 = field742[var5 + 2];
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1115) {
                        var5--;
                        var81.field2780 = field742[var5] == 1;
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1116) {
                        var5--;
                        var81.field2688 = field742[var5];
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1117) {
                        var5--;
                        var81.field2689 = field742[var5];
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1118) {
                        var5--;
                        var81.field2690 = field742[var5] == 1;
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1119) {
                        var5--;
                        var81.field2650 = field742[var5] == 1;
                        client.method2103(var81);
                        continue;
                    }
                    if (var474 == 1120) {
                        var5 -= 2;
                        var81.field2674 = field742[var5];
                        var81.field2675 = field742[var5 + 1];
                        client.method2103(var81);
                        if (var80 != -1 && var81.field2653 == 0) {
                            client.method2754(Statics.field2642[var80 >> 16], var81, false);
                        }
                        continue;
                    }
                    if (var474 == 1121) {
                        client.method135(var81.field2651, var81.field2652);
                        client.field276 = var81;
                        client.method2103(var81);
                        continue;
                    }
                } else if (!(var474 < 1200 || var474 >= 1300) || !(var474 < 2200 || var474 >= 2300)) {
                    class164 var84;
                    if (var474 >= 2000) {
                        var474 -= 1000;
                        var5--;
                        var84 = class164.method2517(field742[var5]);
                    } else {
                        var84 = var62 ? Statics.field1308 : Statics.field602;
                    }
                    client.method2103(var84);
                    if (var474 == 1200 || var474 == 1205 || var474 == 1212) {
                        var5 -= 2;
                        int var85 = field742[var5];
                        int var86 = field742[var5 + 1];
                        var84.field2685 = var85;
                        var84.field2770 = var86;
                        class47 var87 = class47.method496(var85);
                        var84.field2776 = var87.field1045;
                        var84.field2701 = var87.field1032;
                        var84.field2702 = var87.field1042;
                        var84.field2698 = var87.field1051;
                        var84.field2699 = var87.field1052;
                        var84.field2703 = var87.field1048;
                        if (var474 == 1205) {
                            var84.field2707 = 0;
                        } else if (var474 == 1212 | var87.field1076 == 1) {
                            var84.field2707 = 1;
                        } else {
                            var84.field2707 = 2;
                        }
                        if (var84.field2704 > 0) {
                            var84.field2703 = var84.field2703 * 32 / var84.field2704;
                        } else if (var84.field2662 > 0) {
                            var84.field2703 = var84.field2703 * 32 / var84.field2662;
                        }
                        continue;
                    }
                    if (var474 == 1201) {
                        var84.field2692 = 2;
                        var5--;
                        var84.field2647 = field742[var5];
                        continue;
                    }
                    if (var474 == 1202) {
                        var84.field2692 = 3;
                        var84.field2647 = Statics.field633.field29.method3053();
                        continue;
                    }
                } else if ((var474 < 1300 || var474 >= 1400) && (var474 < 2300 || var474 >= 2400)) {
                    if (var474 >= 1400 && var474 < 1500 || var474 >= 2400 && var474 < 2500) {
                        class164 var92;
                        if (var474 >= 2000) {
                            var474 -= 1000;
                            var5--;
                            var92 = class164.method2517(field742[var5]);
                        } else {
                            var92 = var62 ? Statics.field1308 : Statics.field602;
                        }
                        var6--;
                        String var93 = field747[var6];
                        int[] var94 = null;
                        if (var93.length() > 0 && var93.charAt(var93.length() - 1) == 'Y') {
                            var5--;
                            int var95 = field742[var5];
                            if (var95 > 0) {
                                var94 = new int[var95];
                                while (var95-- > 0) {
                                    var5--;
                                    var94[var95] = field742[var5];
                                }
                            }
                            var93 = var93.substring(0, var93.length() - 1);
                        }
                        Object[] var96 = new Object[var93.length() + 1];
                        for (int var97 = var96.length - 1; var97 >= 1; var97--) {
                            if (var93.charAt(var97 - 1) == 's') {
                                var6--;
                                var96[var97] = field747[var6];
                            } else {
                                var5--;
                                var96[var97] = Integer.valueOf(field742[var5]);
                            }
                        }
                        var5--;
                        int var98 = field742[var5];
                        if (var98 == -1) {
                            var96 = null;
                        } else {
                            var96[0] = Integer.valueOf(var98);
                        }
                        if (var474 == 1400) {
                            var92.field2731 = var96;
                        }
                        if (var474 == 1401) {
                            var92.field2734 = var96;
                        }
                        if (var474 == 1402) {
                            var92.field2733 = var96;
                        }
                        if (var474 == 1403) {
                            var92.field2769 = var96;
                        }
                        if (var474 == 1404) {
                            var92.field2737 = var96;
                        }
                        if (var474 == 1405) {
                            var92.field2738 = var96;
                        }
                        if (var474 == 1406) {
                            var92.field2741 = var96;
                        }
                        if (var474 == 1407) {
                            var92.field2742 = var96;
                            var92.field2693 = var94;
                        }
                        if (var474 == 1408) {
                            var92.field2748 = var96;
                        }
                        if (var474 == 1409) {
                            var92.field2749 = var96;
                        }
                        if (var474 == 1410) {
                            var92.field2739 = var96;
                        }
                        if (var474 == 1411) {
                            var92.field2732 = var96;
                        }
                        if (var474 == 1412) {
                            var92.field2676 = var96;
                        }
                        if (var474 == 1414) {
                            var92.field2718 = var96;
                            var92.field2736 = var94;
                        }
                        if (var474 == 1415) {
                            var92.field2746 = var96;
                            var92.field2747 = var94;
                        }
                        if (var474 == 1416) {
                            var92.field2740 = var96;
                        }
                        if (var474 == 1417) {
                            var92.field2695 = var96;
                        }
                        if (var474 == 1418) {
                            var92.field2751 = var96;
                        }
                        if (var474 == 1419) {
                            var92.field2752 = var96;
                        }
                        if (var474 == 1420) {
                            var92.field2753 = var96;
                        }
                        if (var474 == 1421) {
                            var92.field2754 = var96;
                        }
                        if (var474 == 1422) {
                            var92.field2678 = var96;
                        }
                        if (var474 == 1423) {
                            var92.field2756 = var96;
                        }
                        if (var474 == 1424) {
                            var92.field2757 = var96;
                        }
                        if (var474 == 1425) {
                            var92.field2710 = var96;
                        }
                        if (var474 == 1426) {
                            var92.field2760 = var96;
                        }
                        if (var474 == 1427) {
                            var92.field2723 = var96;
                        }
                        var92.field2729 = true;
                        continue;
                    }
                    if (var474 < 1600) {
                        class164 var99 = var62 ? Statics.field1308 : Statics.field602;
                        if (var474 == 1500) {
                            field742[var5++] = var99.field2664;
                            continue;
                        }
                        if (var474 == 1501) {
                            field742[var5++] = var99.field2665;
                            continue;
                        }
                        if (var474 == 1502) {
                            field742[var5++] = var99.field2677;
                            continue;
                        }
                        if (var474 == 1503) {
                            field742[var5++] = var99.field2667;
                            continue;
                        }
                        if (var474 == 1504) {
                            field742[var5++] = var99.field2671 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 1505) {
                            field742[var5++] = var99.field2774;
                            continue;
                        }
                    } else if (var474 < 1700) {
                        class164 var100 = var62 ? Statics.field1308 : Statics.field602;
                        if (var474 == 1600) {
                            field742[var5++] = var100.field2672;
                            continue;
                        }
                        if (var474 == 1601) {
                            field742[var5++] = var100.field2673;
                            continue;
                        }
                        if (var474 == 1602) {
                            field747[var6++] = var100.field2709;
                            continue;
                        }
                        if (var474 == 1603) {
                            field742[var5++] = var100.field2674;
                            continue;
                        }
                        if (var474 == 1604) {
                            field742[var5++] = var100.field2675;
                            continue;
                        }
                        if (var474 == 1605) {
                            field742[var5++] = var100.field2703;
                            continue;
                        }
                        if (var474 == 1606) {
                            field742[var5++] = var100.field2776;
                            continue;
                        }
                        if (var474 == 1607) {
                            field742[var5++] = var100.field2702;
                            continue;
                        }
                        if (var474 == 1608) {
                            field742[var5++] = var100.field2701;
                            continue;
                        }
                        if (var474 == 1609) {
                            field742[var5++] = var100.field2659;
                            continue;
                        }
                    } else if (var474 < 1800) {
                        class164 var101 = var62 ? Statics.field1308 : Statics.field602;
                        if (var474 == 1700) {
                            field742[var5++] = var101.field2685;
                            continue;
                        }
                        if (var474 == 1701) {
                            if (var101.field2685 == -1) {
                                field742[var5++] = 0;
                            } else {
                                field742[var5++] = var101.field2770;
                            }
                            continue;
                        }
                        if (var474 == 1702) {
                            field742[var5++] = var101.field2652;
                            continue;
                        }
                    } else if (var474 < 1900) {
                        class164 var102 = var62 ? Statics.field1308 : Statics.field602;
                        if (var474 == 1800) {
                            int[] var103 = field742;
                            int var104 = var5++;
                            int var105 = client.method573(var102);
                            int var106 = var105 >> 11 & 0x3F;
                            var103[var104] = var106;
                            continue;
                        }
                        if (var474 == 1801) {
                            var5--;
                            int var107 = field742[var5];
                            int var475 = var107 - 1;
                            if (var102.field2700 != null && var475 < var102.field2700.length && var102.field2700[var475] != null) {
                                field747[var6++] = var102.field2700[var475];
                                continue;
                            }
                            field747[var6++] = "";
                            continue;
                        }
                        if (var474 == 1802) {
                            if (var102.field2722 == null) {
                                field747[var6++] = "";
                            } else {
                                field747[var6++] = var102.field2722;
                            }
                            continue;
                        }
                    } else if (!(var474 < 1900 || var474 >= 2000) || !(var474 < 2900 || var474 >= 3000)) {
                        class164 var108;
                        if (var474 >= 2000) {
                            var474 -= 1000;
                            var5--;
                            var108 = class164.method2517(field742[var5]);
                        } else {
                            var108 = var62 ? Statics.field1308 : Statics.field602;
                        }
                        if (var474 == 1927) {
                            if (field748 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var108.field2723 == null) {
                                return;
                            }
                            class1 var109 = new class1();
                            var109.field3 = var108;
                            var109.field7 = var108.field2723;
                            var109.field11 = field748 + 1;
                            client.field461.method3377(arg0);
                            continue;
                        }
                    } else if (var474 < 2600) {
                        var5--;
                        class164 var110 = class164.method2517(field742[var5]);
                        if (var474 == 2500) {
                            field742[var5++] = var110.field2664;
                            continue;
                        }
                        if (var474 == 2501) {
                            field742[var5++] = var110.field2665;
                            continue;
                        }
                        if (var474 == 2502) {
                            field742[var5++] = var110.field2677;
                            continue;
                        }
                        if (var474 == 2503) {
                            field742[var5++] = var110.field2667;
                            continue;
                        }
                        if (var474 == 2504) {
                            field742[var5++] = var110.field2671 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 2505) {
                            field742[var5++] = var110.field2774;
                            continue;
                        }
                    } else if (var474 < 2700) {
                        var5--;
                        class164 var111 = class164.method2517(field742[var5]);
                        if (var474 == 2600) {
                            field742[var5++] = var111.field2672;
                            continue;
                        }
                        if (var474 == 2601) {
                            field742[var5++] = var111.field2673;
                            continue;
                        }
                        if (var474 == 2602) {
                            field747[var6++] = var111.field2709;
                            continue;
                        }
                        if (var474 == 2603) {
                            field742[var5++] = var111.field2674;
                            continue;
                        }
                        if (var474 == 2604) {
                            field742[var5++] = var111.field2675;
                            continue;
                        }
                        if (var474 == 2605) {
                            field742[var5++] = var111.field2703;
                            continue;
                        }
                        if (var474 == 2606) {
                            field742[var5++] = var111.field2776;
                            continue;
                        }
                        if (var474 == 2607) {
                            field742[var5++] = var111.field2702;
                            continue;
                        }
                        if (var474 == 2608) {
                            field742[var5++] = var111.field2701;
                            continue;
                        }
                        if (var474 == 2609) {
                            field742[var5++] = var111.field2659;
                            continue;
                        }
                    } else if (var474 < 2800) {
                        if (var474 == 2700) {
                            var5--;
                            class164 var112 = class164.method2517(field742[var5]);
                            field742[var5++] = var112.field2685;
                            continue;
                        }
                        if (var474 == 2701) {
                            var5--;
                            class164 var113 = class164.method2517(field742[var5]);
                            if (var113.field2685 == -1) {
                                field742[var5++] = 0;
                            } else {
                                field742[var5++] = var113.field2770;
                            }
                            continue;
                        }
                        if (var474 == 2702) {
                            var5--;
                            int var114 = field742[var5];
                            class4 var115 = (class4) client.field421.method3354((long) var114);
                            if (var115 == null) {
                                field742[var5++] = 0;
                            } else {
                                field742[var5++] = 1;
                            }
                            continue;
                        }
                        if (var474 == 2706) {
                            field742[var5++] = client.field420;
                            continue;
                        }
                    } else if (var474 < 2900) {
                        var5--;
                        class164 var116 = class164.method2517(field742[var5]);
                        if (var474 == 2800) {
                            int[] var117 = field742;
                            int var118 = var5++;
                            int var119 = client.method573(var116);
                            int var120 = var119 >> 11 & 0x3F;
                            var117[var118] = var120;
                            continue;
                        }
                        if (var474 == 2801) {
                            var5--;
                            int var121 = field742[var5];
                            int var476 = var121 - 1;
                            if (var116.field2700 != null && var476 < var116.field2700.length && var116.field2700[var476] != null) {
                                field747[var6++] = var116.field2700[var476];
                                continue;
                            }
                            field747[var6++] = "";
                            continue;
                        }
                        if (var474 == 2802) {
                            if (var116.field2722 == null) {
                                field747[var6++] = "";
                            } else {
                                field747[var6++] = var116.field2722;
                            }
                            continue;
                        }
                    } else if (var474 < 3200) {
                        if (var474 == 3100) {
                            var6--;
                            String var122 = field747[var6];
                            class11.method582(0, "", var122);
                            continue;
                        }
                        if (var474 == 3101) {
                            var5 -= 2;
                            client.method2660(Statics.field633, field742[var5], field742[var5 + 1]);
                            continue;
                        }
                        if (var474 == 3103) {
                            client.method2821();
                            continue;
                        }
                        if (var474 == 3104) {
                            var6--;
                            String var123 = field747[var6];
                            int var124 = 0;
                            if (class154.method3(var123)) {
                                var124 = class154.method3040(var123);
                            }
                            client.field521.method2402(168);
                            client.field521.method2143(var124);
                            continue;
                        }
                        if (var474 == 3105) {
                            var6--;
                            String var125 = field747[var6];
                            client.field521.method2402(128);
                            client.field521.method2140(var125.length() + 1);
                            client.field521.method2146(var125);
                            continue;
                        }
                        if (var474 == 3106) {
                            var6--;
                            String var126 = field747[var6];
                            client.field521.method2402(114);
                            client.field521.method2140(var126.length() + 1);
                            client.field521.method2146(var126);
                            continue;
                        }
                        if (var474 == 3107) {
                            var5--;
                            int var127 = field742[var5];
                            var6--;
                            String var128 = field747[var6];
                            boolean var129 = false;
                            for (int var130 = 0; var130 < client.field317; var130++) {
                                class3 var131 = client.field262[client.field379[var130]];
                                if (var131 != null && var131.field30 != null && var131.field30.equalsIgnoreCase(var128)) {
                                    if (var127 == 1) {
                                        client.field521.method2402(110);
                                        client.field521.method2141(client.field379[var130]);
                                        client.field521.method2140(0);
                                    } else if (var127 == 4) {
                                        client.field521.method2402(247);
                                        client.field521.method2140(0);
                                        client.field521.method2322(client.field379[var130]);
                                    } else if (var127 == 6) {
                                        client.field521.method2402(230);
                                        client.field521.method2187(client.field379[var130]);
                                        client.field521.method2140(0);
                                    } else if (var127 == 7) {
                                        client.field521.method2402(89);
                                        client.field521.method2322(client.field379[var130]);
                                        client.field521.method2299(0);
                                    }
                                    var129 = true;
                                    break;
                                }
                            }
                            if (!var129) {
                                class11.method582(4, "", class148.field2351 + var128);
                            }
                            continue;
                        }
                        if (var474 == 3108) {
                            var5 -= 3;
                            int var132 = field742[var5];
                            int var133 = field742[var5 + 1];
                            int var134 = field742[var5 + 2];
                            class164 var135 = class164.method2517(var134);
                            Statics.method3481(var135, var132, var133);
                            continue;
                        }
                        if (var474 == 3109) {
                            var5 -= 2;
                            int var136 = field742[var5];
                            int var137 = field742[var5 + 1];
                            class164 var138 = var62 ? Statics.field1308 : Statics.field602;
                            Statics.method3481(var138, var136, var137);
                            continue;
                        }
                        if (var474 == 3110) {
                            var5--;
                            Statics.field121 = field742[var5] == 1;
                            continue;
                        }
                        if (var474 == 3111) {
                            field742[var5++] = Statics.field1691.field124 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3112) {
                            var5--;
                            Statics.field1691.field124 = field742[var5] == 1;
                            class9.method2360();
                            continue;
                        }
                        if (var474 == 3113) {
                            var6--;
                            String var139 = field747[var6];
                            var5--;
                            boolean var140 = field742[var5] == 1;
                            class130.method493(var139, var140, false);
                            continue;
                        }
                        if (var474 == 3115) {
                            var5--;
                            int var141 = field742[var5];
                            client.field521.method2402(24);
                            client.field521.method2322(var141);
                            continue;
                        }
                    } else if (var474 < 3300) {
                        if (var474 == 3200) {
                            var5 -= 3;
                            client.method3530(field742[var5], field742[var5 + 1], field742[var5 + 2]);
                            continue;
                        }
                        if (var474 == 3201) {
                            var5--;
                            int var142 = field742[var5];
                            if (var142 == -1 && !client.field501) {
                                class174.method2070();
                            } else if (var142 != -1 && client.field500 != var142 && client.field499 != 0 && !client.field501) {
                                class174.method566(2, Statics.field819, var142, 0, client.field499, false);
                            }
                            client.field500 = var142;
                            continue;
                        }
                        if (var474 == 3202) {
                            var5 -= 2;
                            int var143 = field742[var5];
                            int var10000 = field742[var5 + 1];
                            if (client.field499 != 0 && var143 != -1) {
                                class174.method167(Statics.field190, var143, 0, client.field499, false);
                                client.field501 = true;
                            }
                            continue;
                        }
                    } else if (var474 < 3400) {
                        if (var474 == 3300) {
                            field742[var5++] = client.field268;
                            continue;
                        }
                        if (var474 == 3301) {
                            var5 -= 2;
                            int var145 = field742[var5];
                            int var146 = field742[var5 + 1];
                            field742[var5++] = class15.method130(var145, var146);
                            continue;
                        }
                        if (var474 == 3302) {
                            var5 -= 2;
                            int var147 = field742[var5];
                            int var148 = field742[var5 + 1];
                            field742[var5++] = class15.method1617(var147, var148);
                            continue;
                        }
                        if (var474 == 3303) {
                            var5 -= 2;
                            int var149 = field742[var5];
                            int var150 = field742[var5 + 1];
                            int[] var151 = field742;
                            int var152 = var5++;
                            class15 var153 = (class15) class15.field199.method3354((long) var149);
                            int var154;
                            if (var153 == null) {
                                var154 = 0;
                            } else if (var150 == -1) {
                                var154 = 0;
                            } else {
                                int var155 = 0;
                                for (int var156 = 0; var156 < var153.field201.length; var156++) {
                                    if (var153.field200[var156] == var150) {
                                        var155 += var153.field201[var156];
                                    }
                                }
                                var154 = var155;
                            }
                            var151[var152] = var154;
                            continue;
                        }
                        if (var474 == 3304) {
                            var5--;
                            int var157 = field742[var5];
                            int[] var158 = field742;
                            int var159 = var5++;
                            class46 var160 = (class46) class46.field1029.method3315((long) var157);
                            class46 var161;
                            if (var160 == null) {
                                byte[] var162 = Statics.field1025.method2859(5, var157);
                                class46 var163 = new class46();
                                if (var162 != null) {
                                    var163.method883(new class111(var162));
                                }
                                class46.field1029.method3317(var163, (long) var157);
                                var161 = var163;
                            } else {
                                var161 = var160;
                            }
                            var158[var159] = var161.field1026;
                            continue;
                        }
                        if (var474 == 3305) {
                            var5--;
                            int var164 = field742[var5];
                            field742[var5++] = client.field396[var164];
                            continue;
                        }
                        if (var474 == 3306) {
                            var5--;
                            int var165 = field742[var5];
                            field742[var5++] = client.field314[var165];
                            continue;
                        }
                        if (var474 == 3307) {
                            var5--;
                            int var166 = field742[var5];
                            field742[var5++] = client.field398[var166];
                            continue;
                        }
                        if (var474 == 3308) {
                            int var167 = Statics.field863;
                            int var168 = (Statics.field633.field777 >> 7) + Statics.field1903;
                            int var169 = (Statics.field633.field757 >> 7) + Statics.field311;
                            field742[var5++] = (var167 << 28) + (var168 << 14) + var169;
                            continue;
                        }
                        if (var474 == 3309) {
                            var5--;
                            int var170 = field742[var5];
                            field742[var5++] = var170 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var474 == 3310) {
                            var5--;
                            int var171 = field742[var5];
                            field742[var5++] = var171 >> 28;
                            continue;
                        }
                        if (var474 == 3311) {
                            var5--;
                            int var172 = field742[var5];
                            field742[var5++] = var172 & 0x3FFF;
                            continue;
                        }
                        if (var474 == 3312) {
                            field742[var5++] = client.field455 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3313) {
                            var5 -= 2;
                            int var173 = field742[var5] + 32768;
                            int var174 = field742[var5 + 1];
                            field742[var5++] = class15.method130(var173, var174);
                            continue;
                        }
                        if (var474 == 3314) {
                            var5 -= 2;
                            int var175 = field742[var5] + 32768;
                            int var176 = field742[var5 + 1];
                            field742[var5++] = class15.method1617(var175, var176);
                            continue;
                        }
                        if (var474 == 3315) {
                            var5 -= 2;
                            int var177 = field742[var5] + 32768;
                            int var178 = field742[var5 + 1];
                            int[] var179 = field742;
                            int var180 = var5++;
                            class15 var181 = (class15) class15.field199.method3354((long) var177);
                            int var182;
                            if (var181 == null) {
                                var182 = 0;
                            } else if (var178 == -1) {
                                var182 = 0;
                            } else {
                                int var183 = 0;
                                for (int var184 = 0; var184 < var181.field201.length; var184++) {
                                    if (var181.field200[var184] == var178) {
                                        var183 += var181.field201[var184];
                                    }
                                }
                                var182 = var183;
                            }
                            var179[var180] = var182;
                            continue;
                        }
                        if (var474 == 3316) {
                            if (client.field259 >= 2) {
                                field742[var5++] = client.field259;
                            } else {
                                field742[var5++] = 0;
                            }
                            continue;
                        }
                        if (var474 == 3317) {
                            field742[var5++] = client.field452;
                            continue;
                        }
                        if (var474 == 3318) {
                            field742[var5++] = client.field257;
                            continue;
                        }
                        if (var474 == 3321) {
                            field742[var5++] = client.field425;
                            continue;
                        }
                        if (var474 == 3322) {
                            field742[var5++] = client.field426;
                            continue;
                        }
                        if (var474 == 3323) {
                            if (client.field517) {
                                field742[var5++] = 1;
                            } else {
                                field742[var5++] = 0;
                            }
                            continue;
                        }
                        if (var474 == 3324) {
                            field742[var5++] = client.field295;
                            continue;
                        }
                    } else if (var474 < 3500) {
                        if (var474 == 3400) {
                            var5 -= 2;
                            int var185 = field742[var5];
                            int var186 = field742[var5 + 1];
                            class45 var187 = (class45) class45.field1010.method3315((long) var185);
                            class45 var188;
                            if (var187 == null) {
                                byte[] var189 = Statics.field1017.method2859(8, var185);
                                class45 var190 = new class45();
                                if (var189 != null) {
                                    var190.method875(new class111(var189));
                                }
                                class45.field1010.method3317(var190, (long) var185);
                                var188 = var190;
                            } else {
                                var188 = var187;
                            }
                            class45 var191 = var188;
                            if (var188.field1023 != 's') {
                            }
                            for (int var192 = 0; var192 < var191.field1009; var192++) {
                                if (var191.field1016[var192] == var186) {
                                    field747[var6++] = var191.field1018[var192];
                                    var191 = null;
                                    break;
                                }
                            }
                            if (var191 != null) {
                                field747[var6++] = var191.field1013;
                            }
                            continue;
                        }
                        if (var474 == 3408) {
                            var5 -= 4;
                            int var193 = field742[var5];
                            int var194 = field742[var5 + 1];
                            int var195 = field742[var5 + 2];
                            int var196 = field742[var5 + 3];
                            class45 var197 = (class45) class45.field1010.method3315((long) var195);
                            class45 var198;
                            if (var197 == null) {
                                byte[] var199 = Statics.field1017.method2859(8, var195);
                                class45 var200 = new class45();
                                if (var199 != null) {
                                    var200.method875(new class111(var199));
                                }
                                class45.field1010.method3317(var200, (long) var195);
                                var198 = var200;
                            } else {
                                var198 = var197;
                            }
                            class45 var201 = var198;
                            if (var198.field1011 == var193 && var198.field1023 == var194) {
                                for (int var202 = 0; var202 < var201.field1009; var202++) {
                                    if (var201.field1016[var202] == var196) {
                                        if (var194 == 115) {
                                            field747[var6++] = var201.field1018[var202];
                                        } else {
                                            field742[var5++] = var201.field1022[var202];
                                        }
                                        var201 = null;
                                        break;
                                    }
                                }
                                if (var201 != null) {
                                    if (var194 == 115) {
                                        field747[var6++] = var201.field1013;
                                    } else {
                                        field742[var5++] = var201.field1021;
                                    }
                                }
                                continue;
                            }
                            if (var194 == 115) {
                                field747[var6++] = "null";
                            } else {
                                field742[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var474 < 3700) {
                        if (var474 == 3600) {
                            if (client.field518 == 0) {
                                field742[var5++] = -2;
                            } else if (client.field518 == 1) {
                                field742[var5++] = -1;
                            } else {
                                field742[var5++] = client.field254;
                            }
                            continue;
                        }
                        if (var474 == 3601) {
                            var5--;
                            int var203 = field742[var5];
                            if (client.field518 == 2 && var203 < client.field254) {
                                field747[var6++] = client.field449[var203].field233;
                                field747[var6++] = client.field449[var203].field229;
                                continue;
                            }
                            field747[var6++] = "";
                            field747[var6++] = "";
                            continue;
                        }
                        if (var474 == 3602) {
                            var5--;
                            int var204 = field742[var5];
                            if (client.field518 == 2 && var204 < client.field254) {
                                field742[var5++] = client.field449[var204].field230;
                                continue;
                            }
                            field742[var5++] = 0;
                            continue;
                        }
                        if (var474 == 3603) {
                            var5--;
                            int var205 = field742[var5];
                            if (client.field518 == 2 && var205 < client.field254) {
                                field742[var5++] = client.field449[var205].field237;
                                continue;
                            }
                            field742[var5++] = 0;
                            continue;
                        }
                        if (var474 == 3604) {
                            var6--;
                            String var206 = field747[var6];
                            var5--;
                            int var207 = field742[var5];
                            client.method2632(var206, var207);
                            continue;
                        }
                        if (var474 == 3605) {
                            var6--;
                            String var208 = field747[var6];
                            if (var208 == null) {
                                continue;
                            }
                            if ((client.field254 < 200 || client.field306 == 1) && client.field254 < 400) {
                                String var209 = class155.method2657(var208, Statics.field316);
                                if (var209 == null) {
                                    continue;
                                }
                                for (int var210 = 0; var210 < client.field254; var210++) {
                                    class17 var211 = client.field449[var210];
                                    String var212 = class155.method2657(var211.field233, Statics.field316);
                                    if (var212 != null && var212.equals(var209)) {
                                        class11.method582(30, "", var208 + class148.field2369);
                                        continue label2987;
                                    }
                                    if (var211.field229 != null) {
                                        String var213 = class155.method2657(var211.field229, Statics.field316);
                                        if (var213 != null && var213.equals(var209)) {
                                            class11.method582(30, "", var208 + class148.field2369);
                                            continue label2987;
                                        }
                                    }
                                }
                                for (int var214 = 0; var214 < client.field533; var214++) {
                                    class8 var215 = client.field534[var214];
                                    String var216 = class155.method2657(var215.field122, Statics.field316);
                                    if (var216 != null && var216.equals(var209)) {
                                        class11.method582(30, "", class148.field2374 + var208 + class148.field2212);
                                        continue label2987;
                                    }
                                    if (var215.field119 != null) {
                                        String var217 = class155.method2657(var215.field119, Statics.field316);
                                        if (var217 != null && var217.equals(var209)) {
                                            class11.method582(30, "", class148.field2374 + var208 + class148.field2212);
                                            continue label2987;
                                        }
                                    }
                                }
                                if (class155.method2657(Statics.field633.field30, Statics.field316).equals(var209)) {
                                    class11.method582(30, "", class148.field2287);
                                } else {
                                    client.field521.method2402(225);
                                    class114 var218 = client.field521;
                                    int var219 = var208.length() + 1;
                                    var218.method2140(var219);
                                    client.field521.method2146(var208);
                                }
                                continue;
                            }
                            class11.method582(30, "", class148.field2368);
                            continue;
                        }
                        if (var474 == 3606) {
                            var6--;
                            String var220 = field747[var6];
                            client.method2783(var220);
                            continue;
                        }
                        if (var474 == 3607) {
                            var6--;
                            String var221 = field747[var6];
                            if (var221 == null) {
                                continue;
                            }
                            if ((client.field533 < 100 || client.field306 == 1) && client.field533 < 400) {
                                String var222 = class155.method2657(var221, Statics.field316);
                                if (var222 == null) {
                                    continue;
                                }
                                for (int var223 = 0; var223 < client.field533; var223++) {
                                    class8 var224 = client.field534[var223];
                                    String var225 = class155.method2657(var224.field122, Statics.field316);
                                    if (var225 != null && var225.equals(var222)) {
                                        class11.method582(31, "", var221 + class148.field2371);
                                        continue label2987;
                                    }
                                    if (var224.field119 != null) {
                                        String var226 = class155.method2657(var224.field119, Statics.field316);
                                        if (var226 != null && var226.equals(var222)) {
                                            class11.method582(31, "", var221 + class148.field2371);
                                            continue label2987;
                                        }
                                    }
                                }
                                for (int var227 = 0; var227 < client.field254; var227++) {
                                    class17 var228 = client.field449[var227];
                                    String var229 = class155.method2657(var228.field233, Statics.field316);
                                    if (var229 != null && var229.equals(var222)) {
                                        class11.method582(31, "", class148.field2376 + var221 + class148.field2377);
                                        continue label2987;
                                    }
                                    if (var228.field229 != null) {
                                        String var230 = class155.method2657(var228.field229, Statics.field316);
                                        if (var230 != null && var230.equals(var222)) {
                                            class11.method582(31, "", class148.field2376 + var221 + class148.field2377);
                                            continue label2987;
                                        }
                                    }
                                }
                                if (class155.method2657(Statics.field633.field30, Statics.field316).equals(var222)) {
                                    class11.method582(31, "", class148.field2398);
                                } else {
                                    client.field521.method2402(54);
                                    class114 var231 = client.field521;
                                    int var232 = var221.length() + 1;
                                    var231.method2140(var232);
                                    client.field521.method2146(var221);
                                }
                                continue;
                            }
                            class11.method582(31, "", class148.field2370);
                            continue;
                        }
                        if (var474 == 3608) {
                            var6--;
                            String var233 = field747[var6];
                            client.method2102(var233);
                            continue;
                        }
                        if (var474 == 3609) {
                            var6--;
                            String var234 = field747[var6];
                            class143[] var235 = class143.method3096();
                            for (int var236 = 0; var236 < var235.length; var236++) {
                                class143 var237 = var235[var236];
                                if (var237.field2157 != -1) {
                                    int var239 = var237.field2157;
                                    String var240 = "<img=" + var239 + ">";
                                    if (var234.startsWith(var240)) {
                                        var234 = var234.substring(6 + Integer.toString(var237.field2157).length());
                                        break;
                                    }
                                }
                            }
                            field742[var5++] = client.method21(var234, false) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3611) {
                            if (client.field489 == null) {
                                field747[var6++] = "";
                            } else {
                                field747[var6++] = class153.method2802(client.field489);
                            }
                            continue;
                        }
                        if (var474 == 3612) {
                            if (client.field489 == null) {
                                field742[var5++] = 0;
                            } else {
                                field742[var5++] = Statics.field601;
                            }
                            continue;
                        }
                        if (var474 == 3613) {
                            var5--;
                            int var241 = field742[var5];
                            if (client.field489 != null && var241 < Statics.field601) {
                                field747[var6++] = Statics.field2490[var241].field599;
                                continue;
                            }
                            field747[var6++] = "";
                            continue;
                        }
                        if (var474 == 3614) {
                            var5--;
                            int var242 = field742[var5];
                            if (client.field489 != null && var242 < Statics.field601) {
                                field742[var5++] = Statics.field2490[var242].field593;
                                continue;
                            }
                            field742[var5++] = 0;
                            continue;
                        }
                        if (var474 == 3615) {
                            var5--;
                            int var243 = field742[var5];
                            if (client.field489 != null && var243 < Statics.field601) {
                                field742[var5++] = Statics.field2490[var243].field594;
                                continue;
                            }
                            field742[var5++] = 0;
                            continue;
                        }
                        if (var474 == 3616) {
                            field742[var5++] = Statics.field548;
                            continue;
                        }
                        if (var474 == 3617) {
                            var6--;
                            String var244 = field747[var6];
                            client.method871(var244);
                            continue;
                        }
                        if (var474 == 3618) {
                            field742[var5++] = Statics.field1122;
                            continue;
                        }
                        if (var474 == 3619) {
                            var6--;
                            String var245 = field747[var6];
                            client.method2855(var245);
                            continue;
                        }
                        if (var474 == 3620) {
                            client.method636();
                            continue;
                        }
                        if (var474 == 3621) {
                            if (client.field518 == 0) {
                                field742[var5++] = -1;
                            } else {
                                field742[var5++] = client.field533;
                            }
                            continue;
                        }
                        if (var474 == 3622) {
                            var5--;
                            int var246 = field742[var5];
                            if (client.field518 != 0 && var246 < client.field533) {
                                field747[var6++] = client.field534[var246].field122;
                                field747[var6++] = client.field534[var246].field119;
                                continue;
                            }
                            field747[var6++] = "";
                            field747[var6++] = "";
                            continue;
                        }
                        if (var474 == 3623) {
                            String var247;
                            label2707: {
                                var6--;
                                var247 = field747[var6];
                                String var249 = "<img=0>";
                                if (!var247.startsWith(var249)) {
                                    String var251 = "<img=1>";
                                    if (!var247.startsWith(var251)) {
                                        break label2707;
                                    }
                                }
                                var247 = var247.substring(7);
                            }
                            field742[var5++] = client.method2659(var247) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3624) {
                            var5--;
                            int var252 = field742[var5];
                            if (Statics.field2490 != null && var252 < Statics.field601 && Statics.field2490[var252].field599.equalsIgnoreCase(Statics.field633.field30)) {
                                field742[var5++] = 1;
                                continue;
                            }
                            field742[var5++] = 0;
                            continue;
                        }
                        if (var474 == 3625) {
                            if (client.field490 == null) {
                                field747[var6++] = "";
                            } else {
                                field747[var6++] = class153.method2802(client.field490);
                            }
                            continue;
                        }
                    } else if (var474 < 4000) {
                        if (var474 == 3903) {
                            var5--;
                            int var253 = field742[var5];
                            field742[var5++] = client.field538[var253].method3552();
                            continue;
                        }
                        if (var474 == 3904) {
                            var5--;
                            int var254 = field742[var5];
                            field742[var5++] = client.field538[var254].field3068;
                            continue;
                        }
                        if (var474 == 3905) {
                            var5--;
                            int var255 = field742[var5];
                            field742[var5++] = client.field538[var255].field3067;
                            continue;
                        }
                        if (var474 == 3906) {
                            var5--;
                            int var256 = field742[var5];
                            field742[var5++] = client.field538[var256].field3070;
                            continue;
                        }
                        if (var474 == 3907) {
                            var5--;
                            int var257 = field742[var5];
                            field742[var5++] = client.field538[var257].field3071;
                            continue;
                        }
                        if (var474 == 3908) {
                            var5--;
                            int var258 = field742[var5];
                            field742[var5++] = client.field538[var258].field3072;
                            continue;
                        }
                        if (var474 == 3910) {
                            var5--;
                            int var259 = field742[var5];
                            int var260 = client.field538[var259].method3555();
                            field742[var5++] = var260 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3911) {
                            var5--;
                            int var261 = field742[var5];
                            int var262 = client.field538[var261].method3555();
                            field742[var5++] = var262 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3912) {
                            var5--;
                            int var263 = field742[var5];
                            int var264 = client.field538[var263].method3555();
                            field742[var5++] = var264 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3913) {
                            var5--;
                            int var265 = field742[var5];
                            int var266 = client.field538[var265].method3555();
                            field742[var5++] = var266 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3914) {
                            var5--;
                            boolean var267 = field742[var5] == 1;
                            if (Statics.field1150 != null) {
                                Statics.field1150.method3575(class212.field3077, var267);
                            }
                            continue;
                        }
                        if (var474 == 3915) {
                            var5--;
                            boolean var268 = field742[var5] == 1;
                            if (Statics.field1150 != null) {
                                Statics.field1150.method3575(class212.field3075, var268);
                            }
                            continue;
                        }
                        if (var474 == 3916) {
                            var5 -= 2;
                            boolean var269 = field742[var5] == 1;
                            boolean var270 = field742[var5 + 1] == 1;
                            if (Statics.field1150 != null) {
                                Statics.field1150.method3575(new class21(var270), var269);
                            }
                            continue;
                        }
                        if (var474 == 3917) {
                            var5--;
                            boolean var271 = field742[var5] == 1;
                            if (Statics.field1150 != null) {
                                Statics.field1150.method3575(class212.field3076, var271);
                            }
                            continue;
                        }
                        if (var474 == 3918) {
                            var5--;
                            boolean var272 = field742[var5] == 1;
                            if (Statics.field1150 != null) {
                                Statics.field1150.method3575(class212.field3079, var272);
                            }
                            continue;
                        }
                        if (var474 == 3919) {
                            field742[var5++] = Statics.field1150 == null ? 0 : Statics.field1150.field3078.size();
                            continue;
                        }
                        if (var474 == 3920) {
                            var5--;
                            int var273 = field742[var5];
                            class205 var274 = (class205) Statics.field1150.field3078.get(var273);
                            field742[var5++] = var274.field3047;
                            continue;
                        }
                        if (var474 == 3921) {
                            var5--;
                            int var275 = field742[var5];
                            class205 var276 = (class205) Statics.field1150.field3078.get(var275);
                            field747[var6++] = var276.method3503();
                            continue;
                        }
                        if (var474 == 3922) {
                            var5--;
                            int var277 = field742[var5];
                            class205 var278 = (class205) Statics.field1150.field3078.get(var277);
                            field747[var6++] = var278.method3504();
                            continue;
                        }
                        if (var474 == 3923) {
                            var5--;
                            int var279 = field742[var5];
                            class205 var280 = (class205) Statics.field1150.field3078.get(var279);
                            long var281 = class107.method2784() - Statics.field1297 - var280.field3046;
                            int var283 = (int) (var281 / 3600000L);
                            int var284 = (int) ((var281 - (long) (var283 * 3600000)) / 60000L);
                            int var285 = (int) ((var281 - (long) (var283 * 3600000) - (long) (var284 * 60000)) / 1000L);
                            String var286 = var283 + ":" + var284 / 10 + var284 % 10 + ":" + var285 / 10 + var285 % 10;
                            field747[var6++] = var286;
                            continue;
                        }
                        if (var474 == 3924) {
                            var5--;
                            int var287 = field742[var5];
                            class205 var288 = (class205) Statics.field1150.field3078.get(var287);
                            field742[var5++] = var288.field3048.field3070;
                            continue;
                        }
                        if (var474 == 3925) {
                            var5--;
                            int var289 = field742[var5];
                            class205 var290 = (class205) Statics.field1150.field3078.get(var289);
                            field742[var5++] = var290.field3048.field3067;
                            continue;
                        }
                        if (var474 == 3926) {
                            var5--;
                            int var291 = field742[var5];
                            class205 var292 = (class205) Statics.field1150.field3078.get(var291);
                            field742[var5++] = var292.field3048.field3068;
                            continue;
                        }
                    } else if (var474 < 4100) {
                        if (var474 == 4000) {
                            var5 -= 2;
                            int var293 = field742[var5];
                            int var294 = field742[var5 + 1];
                            field742[var5++] = var293 + var294;
                            continue;
                        }
                        if (var474 == 4001) {
                            var5 -= 2;
                            int var295 = field742[var5];
                            int var296 = field742[var5 + 1];
                            field742[var5++] = var295 - var296;
                            continue;
                        }
                        if (var474 == 4002) {
                            var5 -= 2;
                            int var297 = field742[var5];
                            int var298 = field742[var5 + 1];
                            field742[var5++] = var297 * var298;
                            continue;
                        }
                        if (var474 == 4003) {
                            var5 -= 2;
                            int var299 = field742[var5];
                            int var300 = field742[var5 + 1];
                            field742[var5++] = var299 / var300;
                            continue;
                        }
                        if (var474 == 4004) {
                            var5--;
                            int var301 = field742[var5];
                            field742[var5++] = (int) (Math.random() * (double) var301);
                            continue;
                        }
                        if (var474 == 4005) {
                            var5--;
                            int var302 = field742[var5];
                            field742[var5++] = (int) (Math.random() * (double) (var302 + 1));
                            continue;
                        }
                        if (var474 == 4006) {
                            var5 -= 5;
                            int var303 = field742[var5];
                            int var304 = field742[var5 + 1];
                            int var305 = field742[var5 + 2];
                            int var306 = field742[var5 + 3];
                            int var307 = field742[var5 + 4];
                            field742[var5++] = (var304 - var303) * (var307 - var305) / (var306 - var305) + var303;
                            continue;
                        }
                        if (var474 == 4007) {
                            var5 -= 2;
                            int var308 = field742[var5];
                            int var309 = field742[var5 + 1];
                            field742[var5++] = var308 * var309 / 100 + var308;
                            continue;
                        }
                        if (var474 == 4008) {
                            var5 -= 2;
                            int var310 = field742[var5];
                            int var311 = field742[var5 + 1];
                            field742[var5++] = var310 | 0x1 << var311;
                            continue;
                        }
                        if (var474 == 4009) {
                            var5 -= 2;
                            int var312 = field742[var5];
                            int var313 = field742[var5 + 1];
                            field742[var5++] = var312 & -1 - (0x1 << var313);
                            continue;
                        }
                        if (var474 == 4010) {
                            var5 -= 2;
                            int var314 = field742[var5];
                            int var315 = field742[var5 + 1];
                            field742[var5++] = (var314 & 0x1 << var315) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var474 == 4011) {
                            var5 -= 2;
                            int var316 = field742[var5];
                            int var317 = field742[var5 + 1];
                            field742[var5++] = var316 % var317;
                            continue;
                        }
                        if (var474 == 4012) {
                            var5 -= 2;
                            int var318 = field742[var5];
                            int var319 = field742[var5 + 1];
                            if (var318 == 0) {
                                field742[var5++] = 0;
                            } else {
                                field742[var5++] = (int) Math.pow((double) var318, (double) var319);
                            }
                            continue;
                        }
                        if (var474 == 4013) {
                            var5 -= 2;
                            int var320 = field742[var5];
                            int var321 = field742[var5 + 1];
                            if (var320 == 0) {
                                field742[var5++] = 0;
                            } else if (var321 == 0) {
                                field742[var5++] = Integer.MAX_VALUE;
                            } else {
                                field742[var5++] = (int) Math.pow((double) var320, 1.0D / (double) var321);
                            }
                            continue;
                        }
                        if (var474 == 4014) {
                            var5 -= 2;
                            int var322 = field742[var5];
                            int var323 = field742[var5 + 1];
                            field742[var5++] = var322 & var323;
                            continue;
                        }
                        if (var474 == 4015) {
                            var5 -= 2;
                            int var324 = field742[var5];
                            int var325 = field742[var5 + 1];
                            field742[var5++] = var324 | var325;
                            continue;
                        }
                    } else if (var474 < 4200) {
                        if (var474 == 4100) {
                            var6--;
                            String var326 = field747[var6];
                            var5--;
                            int var327 = field742[var5];
                            field747[var6++] = var326 + var327;
                            continue;
                        }
                        if (var474 == 4101) {
                            var6 -= 2;
                            String var328 = field747[var6];
                            String var329 = field747[var6 + 1];
                            field747[var6++] = var328 + var329;
                            continue;
                        }
                        if (var474 == 4102) {
                            var6--;
                            String var330 = field747[var6];
                            var5--;
                            int var331 = field742[var5];
                            String[] var332 = field747;
                            int var333 = var6++;
                            String var335;
                            if (var331 < 0) {
                                var335 = Integer.toString(var331);
                            } else {
                                int var336 = var331;
                                String var337;
                                if (var331 < 0) {
                                    var337 = Integer.toString(var331, 10);
                                } else {
                                    int var338 = 2;
                                    int var339 = var331 / 10;
                                    while (var339 != 0) {
                                        var339 /= 10;
                                        var338++;
                                    }
                                    char[] var340 = new char[var338];
                                    var340[0] = '+';
                                    for (int var341 = var338 - 1; var341 > 0; var341--) {
                                        int var342 = var336;
                                        var336 /= 10;
                                        int var343 = var342 - var336 * 10;
                                        if (var343 >= 10) {
                                            var340[var341] = (char) (var343 + 87);
                                        } else {
                                            var340[var341] = (char) (var343 + 48);
                                        }
                                    }
                                    var337 = new String(var340);
                                }
                                var335 = var337;
                            }
                            var332[var333] = var330 + var335;
                            continue;
                        }
                        if (var474 == 4103) {
                            var6--;
                            String var344 = field747[var6];
                            field747[var6++] = var344.toLowerCase();
                            continue;
                        }
                        if (var474 == 4104) {
                            var5--;
                            int var345 = field742[var5];
                            long var346 = ((long) var345 + 11745L) * 86400000L;
                            field750.setTime(new Date(var346));
                            int var348 = field750.get(5);
                            int var349 = field750.get(2);
                            int var350 = field750.get(1);
                            field747[var6++] = var348 + "-" + field751[var349] + "-" + var350;
                            continue;
                        }
                        if (var474 == 4105) {
                            var6 -= 2;
                            String var351 = field747[var6];
                            String var352 = field747[var6 + 1];
                            if (Statics.field633.field29 != null && Statics.field633.field29.field2821) {
                                field747[var6++] = var352;
                                continue;
                            }
                            field747[var6++] = var351;
                            continue;
                        }
                        if (var474 == 4106) {
                            var5--;
                            int var353 = field742[var5];
                            field747[var6++] = Integer.toString(var353);
                            continue;
                        }
                        if (var474 == 4107) {
                            var6 -= 2;
                            field742[var5++] = class154.method601(class157.method168(field747[var6], field747[var6 + 1], client.field423));
                            continue;
                        }
                        if (var474 == 4108) {
                            var6--;
                            String var354 = field747[var6];
                            var5 -= 2;
                            int var355 = field742[var5];
                            int var356 = field742[var5 + 1];
                            byte[] var357 = Statics.field2484.method2859(var356, 0);
                            class215 var358 = new class215(var357);
                            field742[var5++] = var358.method3590(var354, var355);
                            continue;
                        }
                        if (var474 == 4109) {
                            var6--;
                            String var359 = field747[var6];
                            var5 -= 2;
                            int var360 = field742[var5];
                            int var361 = field742[var5 + 1];
                            byte[] var362 = Statics.field2484.method2859(var361, 0);
                            class215 var363 = new class215(var362);
                            field742[var5++] = var363.method3589(var359, var360);
                            continue;
                        }
                        if (var474 == 4110) {
                            var6 -= 2;
                            String var364 = field747[var6];
                            String var365 = field747[var6 + 1];
                            var5--;
                            if (field742[var5] == 1) {
                                field747[var6++] = var364;
                            } else {
                                field747[var6++] = var365;
                            }
                            continue;
                        }
                        if (var474 == 4111) {
                            var6--;
                            String var366 = field747[var6];
                            field747[var6++] = class214.method3658(var366);
                            continue;
                        }
                        if (var474 == 4112) {
                            var6--;
                            String var367 = field747[var6];
                            var5--;
                            int var368 = field742[var5];
                            field747[var6++] = var367 + (char) var368;
                            continue;
                        }
                        if (var474 == 4113) {
                            var5--;
                            int var369 = field742[var5];
                            field742[var5++] = class154.method2090((char) var369) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4114) {
                            var5--;
                            int var370 = field742[var5];
                            int[] var371 = field742;
                            int var372 = var5++;
                            char var373 = (char) var370;
                            boolean var374 = var373 >= '0' && var373 <= '9' || var373 >= 'A' && var373 <= 'Z' || var373 >= 'a' && var373 <= 'z';
                            var371[var372] = var374 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4115) {
                            var5--;
                            int var375 = field742[var5];
                            field742[var5++] = class154.method123((char) var375) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4116) {
                            var5--;
                            int var376 = field742[var5];
                            int[] var377 = field742;
                            int var378 = var5++;
                            char var379 = (char) var376;
                            boolean var380 = var379 >= '0' && var379 <= '9';
                            var377[var378] = var380 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4117) {
                            var6--;
                            String var381 = field747[var6];
                            if (var381 == null) {
                                field742[var5++] = 0;
                            } else {
                                field742[var5++] = var381.length();
                            }
                            continue;
                        }
                        if (var474 == 4118) {
                            var6--;
                            String var382 = field747[var6];
                            var5 -= 2;
                            int var383 = field742[var5];
                            int var384 = field742[var5 + 1];
                            field747[var6++] = var382.substring(var383, var384);
                            continue;
                        }
                        if (var474 == 4119) {
                            var6--;
                            String var385 = field747[var6];
                            StringBuilder var386 = new StringBuilder(var385.length());
                            boolean var387 = false;
                            for (int var388 = 0; var388 < var385.length(); var388++) {
                                char var389 = var385.charAt(var388);
                                if (var389 == '<') {
                                    var387 = true;
                                } else if (var389 == '>') {
                                    var387 = false;
                                } else if (!var387) {
                                    var386.append(var389);
                                }
                            }
                            field747[var6++] = var386.toString();
                            continue;
                        }
                        if (var474 == 4120) {
                            var6--;
                            String var390 = field747[var6];
                            var5--;
                            int var391 = field742[var5];
                            field742[var5++] = var390.indexOf(var391);
                            continue;
                        }
                        if (var474 == 4121) {
                            var6 -= 2;
                            String var392 = field747[var6];
                            String var393 = field747[var6 + 1];
                            var5--;
                            int var394 = field742[var5];
                            field742[var5++] = var392.indexOf(var393, var394);
                            continue;
                        }
                    } else if (var474 < 4300) {
                        if (var474 == 4200) {
                            var5--;
                            int var395 = field742[var5];
                            field747[var6++] = class47.method496(var395).field1037;
                            continue;
                        }
                        if (var474 == 4201) {
                            var5 -= 2;
                            int var396 = field742[var5];
                            int var397 = field742[var5 + 1];
                            class47 var398 = class47.method496(var396);
                            if (var397 >= 1 && var397 <= 5 && var398.field1056[var397 - 1] != null) {
                                field747[var6++] = var398.field1056[var397 - 1];
                                continue;
                            }
                            field747[var6++] = "";
                            continue;
                        }
                        if (var474 == 4202) {
                            var5 -= 2;
                            int var399 = field742[var5];
                            int var400 = field742[var5 + 1];
                            class47 var401 = class47.method496(var399);
                            if (var400 >= 1 && var400 <= 5 && var401.field1047[var400 - 1] != null) {
                                field747[var6++] = var401.field1047[var400 - 1];
                                continue;
                            }
                            field747[var6++] = "";
                            continue;
                        }
                        if (var474 == 4203) {
                            var5--;
                            int var402 = field742[var5];
                            field742[var5++] = class47.method496(var402).field1054;
                            continue;
                        }
                        if (var474 == 4204) {
                            var5--;
                            int var403 = field742[var5];
                            field742[var5++] = class47.method496(var403).field1076 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4205) {
                            var5--;
                            int var404 = field742[var5];
                            class47 var405 = class47.method496(var404);
                            if (var405.field1073 == -1 && var405.field1072 >= 0) {
                                field742[var5++] = var405.field1072;
                                continue;
                            }
                            field742[var5++] = var404;
                            continue;
                        }
                        if (var474 == 4206) {
                            var5--;
                            int var406 = field742[var5];
                            class47 var407 = class47.method496(var406);
                            if (var407.field1073 >= 0 && var407.field1072 >= 0) {
                                field742[var5++] = var407.field1072;
                                continue;
                            }
                            field742[var5++] = var406;
                            continue;
                        }
                        if (var474 == 4207) {
                            var5--;
                            int var408 = field742[var5];
                            field742[var5++] = class47.method496(var408).field1055 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4210) {
                            var6--;
                            String var409 = field747[var6];
                            var5--;
                            int var410 = field742[var5];
                            boolean var412 = var410 == 1;
                            String var413 = var409.toLowerCase();
                            short[] var414 = new short[16];
                            int var415 = 0;
                            int var416 = 0;
                            while (true) {
                                if (var416 >= Statics.field1060) {
                                    Statics.field754 = var414;
                                    Statics.field679 = 0;
                                    Statics.field563 = var415;
                                    String[] var420 = new String[Statics.field563];
                                    for (int var421 = 0; var421 < Statics.field563; var421++) {
                                        var420[var421] = class47.method496(var414[var421]).field1037;
                                    }
                                    short[] var422 = Statics.field754;
                                    class116.method83(var420, var422, 0, var420.length - 1);
                                    break;
                                }
                                class47 var417 = class47.method496(var416);
                                if ((!var412 || var417.field1080) && var417.field1073 == -1 && var417.field1037.toLowerCase().indexOf(var413) != -1) {
                                    if (var415 >= 250) {
                                        Statics.field563 = -1;
                                        Statics.field754 = null;
                                        break;
                                    }
                                    if (var415 >= var414.length) {
                                        short[] var418 = new short[var414.length * 2];
                                        for (int var419 = 0; var419 < var415; var419++) {
                                            var418[var419] = var414[var419];
                                        }
                                        var414 = var418;
                                    }
                                    var414[var415++] = (short) var416;
                                }
                                var416++;
                            }
                            field742[var5++] = Statics.field563;
                            continue;
                        }
                        if (var474 == 4211) {
                            if (Statics.field754 != null && Statics.field679 < Statics.field563) {
                                field742[var5++] = Statics.field754[++Statics.field679 - 1] & 0xFFFF;
                                continue;
                            }
                            field742[var5++] = -1;
                            continue;
                        }
                        if (var474 == 4212) {
                            Statics.field679 = 0;
                            continue;
                        }
                    } else if (var474 < 5100) {
                        if (var474 == 5000) {
                            field742[var5++] = client.field427;
                            continue;
                        }
                        if (var474 == 5001) {
                            var5 -= 3;
                            client.field427 = field742[var5];
                            Statics.field2964 = class122.method1802(field742[var5 + 1]);
                            if (Statics.field2964 == null) {
                                Statics.field2964 = class122.field1945;
                            }
                            client.field481 = field742[var5 + 2];
                            client.field521.method2402(29);
                            client.field521.method2140(client.field427);
                            client.field521.method2140(Statics.field2964.field1943);
                            client.field521.method2140(client.field481);
                            continue;
                        }
                        if (var474 == 5002) {
                            var6--;
                            String var423 = field747[var6];
                            var5 -= 2;
                            int var424 = field742[var5];
                            int var425 = field742[var5 + 1];
                            client.field521.method2402(44);
                            class114 var426 = client.field521;
                            int var427 = var423.length() + 1;
                            var426.method2140(var427 + 2);
                            client.field521.method2146(var423);
                            client.field521.method2140(var424 - 1);
                            client.field521.method2140(var425);
                            continue;
                        }
                        if (var474 == 5003) {
                            var5 -= 2;
                            int var428 = field742[var5];
                            int var429 = field742[var5 + 1];
                            class26 var430 = (class26) class11.field160.get(var428);
                            class33 var431 = var430.method556(var429);
                            if (var431 == null) {
                                field742[var5++] = -1;
                                field742[var5++] = 0;
                                field747[var6++] = "";
                                field747[var6++] = "";
                                field747[var6++] = "";
                            } else {
                                field742[var5++] = var431.field737;
                                field742[var5++] = var431.field730;
                                field747[var6++] = var431.field729 == null ? "" : var431.field729;
                                field747[var6++] = var431.field733 == null ? "" : var431.field733;
                                field747[var6++] = var431.field734 == null ? "" : var431.field734;
                            }
                            continue;
                        }
                        if (var474 == 5004) {
                            var5--;
                            int var433 = field742[var5];
                            class33 var434 = Statics.method27(var433);
                            if (var434 == null) {
                                field742[var5++] = -1;
                                field742[var5++] = 0;
                                field747[var6++] = "";
                                field747[var6++] = "";
                                field747[var6++] = "";
                            } else {
                                field742[var5++] = var434.field731;
                                field742[var5++] = var434.field730;
                                field747[var6++] = var434.field729 == null ? "" : var434.field729;
                                field747[var6++] = var434.field733 == null ? "" : var434.field733;
                                field747[var6++] = var434.field734 == null ? "" : var434.field734;
                            }
                            continue;
                        }
                        if (var474 == 5005) {
                            if (Statics.field2964 == null) {
                                field742[var5++] = -1;
                            } else {
                                field742[var5++] = Statics.field2964.field1943;
                            }
                            continue;
                        }
                        if (var474 == 5008) {
                            var6--;
                            String var435 = field747[var6];
                            var5--;
                            int var436 = field742[var5];
                            String var437 = var435.toLowerCase();
                            byte var438 = 0;
                            if (var437.startsWith(class148.field2378)) {
                                var438 = 0;
                                var435 = var435.substring(class148.field2378.length());
                            } else if (var437.startsWith(class148.field2271)) {
                                var438 = 1;
                                var435 = var435.substring(class148.field2271.length());
                            } else if (var437.startsWith(class148.field2425)) {
                                var438 = 2;
                                var435 = var435.substring(class148.field2425.length());
                            } else if (var437.startsWith(class148.field2382)) {
                                var438 = 3;
                                var435 = var435.substring(class148.field2382.length());
                            } else if (var437.startsWith(class148.field2469)) {
                                var438 = 4;
                                var435 = var435.substring(class148.field2469.length());
                            } else if (var437.startsWith(class148.field2388)) {
                                var438 = 5;
                                var435 = var435.substring(class148.field2388.length());
                            } else if (var437.startsWith(class148.field2390)) {
                                var438 = 6;
                                var435 = var435.substring(class148.field2390.length());
                            } else if (var437.startsWith(class148.field2387)) {
                                var438 = 7;
                                var435 = var435.substring(class148.field2387.length());
                            } else if (var437.startsWith(class148.field2394)) {
                                var438 = 8;
                                var435 = var435.substring(class148.field2394.length());
                            } else if (var437.startsWith(class148.field2396)) {
                                var438 = 9;
                                var435 = var435.substring(class148.field2396.length());
                            } else if (var437.startsWith(class148.field2354)) {
                                var438 = 10;
                                var435 = var435.substring(class148.field2354.length());
                            } else if (var437.startsWith(class148.field2400)) {
                                var438 = 11;
                                var435 = var435.substring(class148.field2400.length());
                            } else if (client.field423 != 0) {
                                if (var437.startsWith(class148.field2475)) {
                                    var438 = 0;
                                    var435 = var435.substring(class148.field2475.length());
                                } else if (var437.startsWith(class148.field2226)) {
                                    var438 = 1;
                                    var435 = var435.substring(class148.field2226.length());
                                } else if (var437.startsWith(class148.field2383)) {
                                    var438 = 2;
                                    var435 = var435.substring(class148.field2383.length());
                                } else if (var437.startsWith(class148.field2315)) {
                                    var438 = 3;
                                    var435 = var435.substring(class148.field2315.length());
                                } else if (var437.startsWith(class148.field2308)) {
                                    var438 = 4;
                                    var435 = var435.substring(class148.field2308.length());
                                } else if (var437.startsWith(class148.field2389)) {
                                    var438 = 5;
                                    var435 = var435.substring(class148.field2389.length());
                                } else if (var437.startsWith(class148.field2391)) {
                                    var438 = 6;
                                    var435 = var435.substring(class148.field2391.length());
                                } else if (var437.startsWith(class148.field2434)) {
                                    var438 = 7;
                                    var435 = var435.substring(class148.field2434.length());
                                } else if (var437.startsWith(class148.field2395)) {
                                    var438 = 8;
                                    var435 = var435.substring(class148.field2395.length());
                                } else if (var437.startsWith(class148.field2275)) {
                                    var438 = 9;
                                    var435 = var435.substring(class148.field2275.length());
                                } else if (var437.startsWith(class148.field2235)) {
                                    var438 = 10;
                                    var435 = var435.substring(class148.field2235.length());
                                } else if (var437.startsWith(class148.field2381)) {
                                    var438 = 11;
                                    var435 = var435.substring(class148.field2381.length());
                                }
                            }
                            String var439 = var435.toLowerCase();
                            byte var440 = 0;
                            if (var439.startsWith(class148.field2399)) {
                                var440 = 1;
                                var435 = var435.substring(class148.field2399.length());
                            } else if (var439.startsWith(class148.field2385)) {
                                var440 = 2;
                                var435 = var435.substring(class148.field2385.length());
                            } else if (var439.startsWith(class148.field2406)) {
                                var440 = 3;
                                var435 = var435.substring(class148.field2406.length());
                            } else if (var439.startsWith(class148.field2408)) {
                                var440 = 4;
                                var435 = var435.substring(class148.field2408.length());
                            } else if (var439.startsWith(class148.field2410)) {
                                var440 = 5;
                                var435 = var435.substring(class148.field2410.length());
                            } else if (client.field423 != 0) {
                                if (var439.startsWith(class148.field2438)) {
                                    var440 = 1;
                                    var435 = var435.substring(class148.field2438.length());
                                } else if (var439.startsWith(class148.field2405)) {
                                    var440 = 2;
                                    var435 = var435.substring(class148.field2405.length());
                                } else if (var439.startsWith(class148.field2232)) {
                                    var440 = 3;
                                    var435 = var435.substring(class148.field2232.length());
                                } else if (var439.startsWith(class148.field2409)) {
                                    var440 = 4;
                                    var435 = var435.substring(class148.field2409.length());
                                } else if (var439.startsWith(class148.field2411)) {
                                    var440 = 5;
                                    var435 = var435.substring(class148.field2411.length());
                                }
                            }
                            client.field521.method2402(155);
                            client.field521.method2140(0);
                            int var441 = client.field521.field1888;
                            client.field521.method2140(var436);
                            client.field521.method2140(var438);
                            client.field521.method2140(var440);
                            class213.method3290(client.field521, var435);
                            client.field521.method2205(client.field521.field1888 - var441);
                            continue;
                        }
                        if (var474 == 5009) {
                            var6 -= 2;
                            String var442 = field747[var6];
                            String var443 = field747[var6 + 1];
                            client.field521.method2402(33);
                            client.field521.method2322(0);
                            int var444 = client.field521.field1888;
                            client.field521.method2146(var442);
                            class213.method3290(client.field521, var443);
                            client.field521.method2151(client.field521.field1888 - var444);
                            continue;
                        }
                        if (var474 == 5015) {
                            String var445;
                            if (Statics.field633 == null || Statics.field633.field30 == null) {
                                var445 = "";
                            } else {
                                var445 = Statics.field633.field30;
                            }
                            field747[var6++] = var445;
                            continue;
                        }
                        if (var474 == 5016) {
                            field742[var5++] = client.field481;
                            continue;
                        }
                        if (var474 == 5017) {
                            var5--;
                            int var446 = field742[var5];
                            field742[var5++] = class11.method154(var446);
                            continue;
                        }
                        if (var474 == 5018) {
                            var5--;
                            int var447 = field742[var5];
                            int[] var448 = field742;
                            int var449 = var5++;
                            class33 var450 = (class33) class11.field145.method3364((long) var447);
                            int var451;
                            if (var450 == null) {
                                var451 = -1;
                            } else if (class11.field147.field2998 == var450.field3002) {
                                var451 = -1;
                            } else {
                                var451 = ((class33) var450.field3002).field737;
                            }
                            var448[var449] = var451;
                            continue;
                        }
                        if (var474 == 5019) {
                            var5--;
                            int var452 = field742[var5];
                            field742[var5++] = class11.method594(var452);
                            continue;
                        }
                        if (var474 == 5020) {
                            var6--;
                            String var453 = field747[var6];
                            if (var453.equalsIgnoreCase("toggleroof")) {
                                Statics.field1691.field124 = !Statics.field1691.field124;
                                class9.method2360();
                                if (Statics.field1691.field124) {
                                    class11.method582(99, "", "Roofs are now all hidden");
                                } else {
                                    class11.method582(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var453.equalsIgnoreCase("displayfps")) {
                                client.field294 = !client.field294;
                            }
                            if (client.field259 >= 2) {
                                if (var453.equalsIgnoreCase("fpson")) {
                                    client.field294 = true;
                                }
                                if (var453.equalsIgnoreCase("fpsoff")) {
                                    client.field294 = false;
                                }
                                if (var453.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var453.equalsIgnoreCase("clientdrop")) {
                                    if (client.field309 > 0) {
                                        client.method2();
                                    } else {
                                        client.method873(40);
                                        Statics.field1092 = Statics.field3073;
                                        Statics.field3073 = null;
                                    }
                                }
                                if (var453.equalsIgnoreCase("errortest") && client.field493 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field521.method2402(96);
                            client.field521.method2140(var453.length() + 1);
                            client.field521.method2146(var453);
                            continue;
                        }
                        if (var474 == 5021) {
                            var6--;
                            client.field482 = field747[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var474 == 5022) {
                            field747[var6++] = client.field482;
                            continue;
                        }
                    }
                } else {
                    class164 var88;
                    if (var474 >= 2000) {
                        var474 -= 1000;
                        var5--;
                        var88 = class164.method2517(field742[var5]);
                    } else {
                        var88 = var62 ? Statics.field1308 : Statics.field602;
                    }
                    if (var474 == 1300) {
                        var5--;
                        int var89 = field742[var5] - 1;
                        if (var89 >= 0 && var89 <= 9) {
                            var6--;
                            var88.method2992(var89, field747[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var474 == 1301) {
                        var5 -= 2;
                        int var90 = field742[var5];
                        int var91 = field742[var5 + 1];
                        var88.field2761 = class164.method1360(var90, var91);
                        continue;
                    }
                    if (var474 == 1302) {
                        var5--;
                        var88.field2727 = field742[var5] == 1;
                        continue;
                    }
                    if (var474 == 1303) {
                        var5--;
                        var88.field2725 = field742[var5];
                        continue;
                    }
                    if (var474 == 1304) {
                        var5--;
                        var88.field2666 = field742[var5];
                        continue;
                    }
                    if (var474 == 1305) {
                        var6--;
                        var88.field2722 = field747[var6];
                        continue;
                    }
                    if (var474 == 1306) {
                        var6--;
                        var88.field2728 = field747[var6];
                        continue;
                    }
                    if (var474 == 1307) {
                        var88.field2700 = null;
                        continue;
                    }
                }
                if (var474 < 5400) {
                    if (var474 == 5306) {
                        field742[var5++] = client.method1879();
                        continue;
                    }
                    if (var474 == 5307) {
                        var5--;
                        int var454 = field742[var5];
                        if (var454 == 1 || var454 == 2) {
                            client.method152(var454);
                        }
                        continue;
                    }
                    if (var474 == 5308) {
                        field742[var5++] = Statics.field1691.field127;
                        continue;
                    }
                    if (var474 == 5309) {
                        var5--;
                        int var455 = field742[var5];
                        if (var455 == 1 || var455 == 2) {
                            Statics.field1691.field127 = var455;
                            class9.method2360();
                        }
                        continue;
                    }
                }
                if (var474 >= 5600 || var474 != 5504) {
                    if (var474 < 6300) {
                        if (var474 == 6200) {
                            var5 -= 2;
                            client.field516 = (short) field742[var5];
                            if (client.field516 <= 0) {
                                client.field516 = 256;
                            }
                            client.field367 = (short) field742[var5 + 1];
                            if (client.field367 <= 0) {
                                client.field367 = 205;
                            }
                            continue;
                        }
                        if (var474 == 6201) {
                            var5 -= 2;
                            client.field274 = (short) field742[var5];
                            if (client.field274 <= 0) {
                                client.field274 = 256;
                            }
                            client.field519 = (short) field742[var5 + 1];
                            if (client.field519 <= 0) {
                                client.field519 = 320;
                            }
                            continue;
                        }
                        if (var474 == 6202) {
                            var5 -= 4;
                            client.field520 = (short) field742[var5];
                            if (client.field520 <= 0) {
                                client.field520 = 1;
                            }
                            client.field429 = (short) field742[var5 + 1];
                            if (client.field429 <= 0) {
                                client.field429 = 32767;
                            } else if (client.field429 < client.field520) {
                                client.field429 = client.field520;
                            }
                            client.field522 = (short) field742[var5 + 2];
                            if (client.field522 <= 0) {
                                client.field522 = 1;
                            }
                            client.field416 = (short) field742[var5 + 3];
                            if (client.field416 <= 0) {
                                client.field416 = 32767;
                            } else if (client.field416 < client.field522) {
                                client.field416 = client.field522;
                            }
                            continue;
                        }
                        if (var474 == 6203) {
                            if (client.field432 == null) {
                                field742[var5++] = -1;
                                field742[var5++] = -1;
                            } else {
                                client.method950(0, 0, client.field432.field2677, client.field432.field2667, false);
                                field742[var5++] = client.field526;
                                field742[var5++] = client.field527;
                            }
                            continue;
                        }
                        if (var474 == 6204) {
                            field742[var5++] = client.field274;
                            field742[var5++] = client.field519;
                            continue;
                        }
                        if (var474 == 6205) {
                            field742[var5++] = client.field516;
                            field742[var5++] = client.field367;
                            continue;
                        }
                    }
                    if (var474 < 6600) {
                        if (var474 == 6500) {
                            field742[var5++] = class24.method3165() ? 1 : 0;
                            continue;
                        }
                        if (var474 == 6501) {
                            class24.field610 = 0;
                            class24 var458 = class24.method3304();
                            if (var458 == null) {
                                field742[var5++] = -1;
                                field742[var5++] = 0;
                                field747[var6++] = "";
                                field742[var5++] = 0;
                                field742[var5++] = 0;
                                field747[var6++] = "";
                            } else {
                                field742[var5++] = var458.field608;
                                field742[var5++] = var458.field614;
                                field747[var6++] = var458.field617;
                                field742[var5++] = var458.field618;
                                field742[var5++] = var458.field615;
                                field747[var6++] = var458.field616;
                            }
                            continue;
                        }
                        if (var474 == 6502) {
                            class24 var460 = class24.method3304();
                            if (var460 == null) {
                                field742[var5++] = -1;
                                field742[var5++] = 0;
                                field747[var6++] = "";
                                field742[var5++] = 0;
                                field742[var5++] = 0;
                                field747[var6++] = "";
                            } else {
                                field742[var5++] = var460.field608;
                                field742[var5++] = var460.field614;
                                field747[var6++] = var460.field617;
                                field742[var5++] = var460.field618;
                                field742[var5++] = var460.field615;
                                field747[var6++] = var460.field616;
                            }
                            continue;
                        }
                        if (var474 == 6506) {
                            var5--;
                            int var461 = field742[var5];
                            class24 var462 = null;
                            for (int var463 = 0; var463 < class24.field609; var463++) {
                                if (Statics.field544[var463].field608 == var461) {
                                    var462 = Statics.field544[var463];
                                    break;
                                }
                            }
                            if (var462 == null) {
                                field742[var5++] = -1;
                                field742[var5++] = 0;
                                field747[var6++] = "";
                                field742[var5++] = 0;
                                field742[var5++] = 0;
                                field747[var6++] = "";
                            } else {
                                field742[var5++] = var462.field608;
                                field742[var5++] = var462.field614;
                                field747[var6++] = var462.field617;
                                field742[var5++] = var462.field618;
                                field742[var5++] = var462.field615;
                                field747[var6++] = var462.field616;
                            }
                            continue;
                        }
                        if (var474 == 6507) {
                            var5 -= 4;
                            int var464 = field742[var5];
                            boolean var465 = field742[var5 + 1] == 1;
                            int var466 = field742[var5 + 2];
                            boolean var467 = field742[var5 + 3] == 1;
                            if (Statics.field544 != null) {
                                class24.method515(0, Statics.field544.length - 1, var464, var465, var466, var467);
                            }
                            continue;
                        }
                        if (var474 == 6511) {
                            var5--;
                            int var468 = field742[var5];
                            if (var468 >= 0 && var468 < class24.field609) {
                                class24 var469 = Statics.field544[var468];
                                field742[var5++] = var469.field608;
                                field742[var5++] = var469.field614;
                                field747[var6++] = var469.field617;
                                field742[var5++] = var469.field618;
                                field742[var5++] = var469.field615;
                                field747[var6++] = var469.field616;
                                continue;
                            }
                            field742[var5++] = -1;
                            field742[var5++] = 0;
                            field747[var6++] = "";
                            field742[var5++] = 0;
                            field742[var5++] = 0;
                            field747[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var456 = field742[var5];
                int var457 = field742[var5 + 1];
                if (!client.field510) {
                    client.field415 = var456;
                    client.field342 = var457;
                }
            }
        } catch (Exception var473) {
            StringBuilder var471 = new StringBuilder(30);
            var471.append("").append(var4.field3013).append(" ");
            for (int var472 = field752 - 1; var472 >= 0; var472--) {
                var471.append("").append(field749[var472].field193.field3013).append(" ");
            }
            var471.append("").append(var10);
            class140.method1403(var471.toString(), var473);
        }
    }

    @ObfuscatedName("x.i(II)V")
    public static void method517(int arg0) {
        if (arg0 == -1 || !class164.method2633(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2642[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3.field2730 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field7 = var3.field2730;
                method635(var4, 2000000);
            }
        }
    }
}
