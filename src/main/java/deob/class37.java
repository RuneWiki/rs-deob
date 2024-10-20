package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ag")
public class class37 {

    @ObfuscatedName("ag.o")
    public static int[] field794 = new int[5];

    @ObfuscatedName("ag.c")
    public static int[][] field795 = new int[5][5000];

    @ObfuscatedName("ag.p")
    public static int[] field796 = new int[1000];

    @ObfuscatedName("ag.j")
    public static String[] field805 = new String[1000];

    @ObfuscatedName("ag.a")
    public static int field798 = 0;

    @ObfuscatedName("ag.y")
    public static class15[] field799 = new class15[50];

    @ObfuscatedName("ag.w")
    public static Calendar field797 = Calendar.getInstance();

    @ObfuscatedName("ag.l")
    public static final String[] field801 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ag.q")
    public static int field802 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.v(Lv;II)V")
    public static void method574(class1 arg0, int arg1) {
        Object[] var2 = arg0.field13;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method2297(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field593;
        int[] var9 = var4.field594;
        byte var10 = -1;
        field798 = 0;
        try {
            Statics.field793 = new int[var4.field598];
            int var11 = 0;
            Statics.field800 = new String[var4.field592];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field12;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2840;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2817;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field9 == null ? -1 : arg0.field9.field2840;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field9 == null ? -1 : arg0.field9.field2817;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field17;
                    }
                    Statics.field793[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field800[var12++] = var15;
                }
            }
            int var16 = 0;
            field802 = arg0.field3;
            label3104: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var516 = var8[var7];
                if (var516 < 100) {
                    if (var516 == 0) {
                        field796[var5++] = var9[var7];
                        continue;
                    }
                    if (var516 == 1) {
                        int var17 = var9[var7];
                        field796[var5++] = class176.field2908[var17];
                        continue;
                    }
                    if (var516 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2908[var18] = field796[var5];
                        client.method568(var18);
                        continue;
                    }
                    if (var516 == 3) {
                        field805[var6++] = var4.field595[var7];
                        continue;
                    }
                    if (var516 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var516 == 7) {
                        var5 -= 2;
                        if (field796[var5 + 1] != field796[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var516 == 8) {
                        var5 -= 2;
                        if (field796[var5 + 1] == field796[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var516 == 9) {
                        var5 -= 2;
                        if (field796[var5] < field796[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var516 == 10) {
                        var5 -= 2;
                        if (field796[var5] > field796[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var516 == 21) {
                        if (field798 == 0) {
                            return;
                        }
                        class15 var19 = field799[--field798];
                        var4 = var19.field211;
                        var8 = var4.field593;
                        var9 = var4.field594;
                        var7 = var19.field215;
                        Statics.field793 = var19.field210;
                        Statics.field800 = var19.field208;
                        continue;
                    }
                    if (var516 == 25) {
                        int var20 = var9[var7];
                        field796[var5++] = class176.method542(var20);
                        continue;
                    }
                    if (var516 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field796[var5];
                        class48 var23 = (class48) class48.field1058.method3490((long) var21);
                        class48 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field3154.method3082(14, var21);
                            class48 var26 = new class48();
                            if (var25 != null) {
                                var26.method952(new class119(var25));
                            }
                            class48.field1058.method3502(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field1060;
                        int var29 = var24.field1061;
                        int var30 = var24.field1066;
                        int var31 = class176.field2910[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class176.field2908[var28] = class176.field2908[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var516 == 31) {
                        var5 -= 2;
                        if (field796[var5] <= field796[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var516 == 32) {
                        var5 -= 2;
                        if (field796[var5] >= field796[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var516 == 33) {
                        field796[var5++] = Statics.field793[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var516 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field793[var10001] = field796[var5];
                        continue;
                    }
                    if (var516 == 35) {
                        field805[var6++] = Statics.field800[var9[var7]];
                        continue;
                    }
                    if (var516 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field800[var10001] = field805[var6];
                        continue;
                    }
                    if (var516 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String[] var34 = field805;
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
                        field805[var6++] = var35;
                        continue;
                    }
                    if (var516 == 38) {
                        var5--;
                        continue;
                    }
                    if (var516 == 39) {
                        var6--;
                        continue;
                    }
                    if (var516 == 40) {
                        int var45 = var9[var7];
                        class23 var46 = class23.method2297(var45);
                        int[] var47 = new int[var46.field598];
                        String[] var48 = new String[var46.field592];
                        for (int var49 = 0; var49 < var46.field596; var49++) {
                            var47[var49] = field796[var5 - var46.field596 + var49];
                        }
                        for (int var50 = 0; var50 < var46.field599; var50++) {
                            var48[var50] = field805[var6 - var46.field599 + var50];
                        }
                        var5 -= var46.field596;
                        var6 -= var46.field599;
                        class15 var51 = new class15();
                        var51.field211 = var4;
                        var51.field215 = var7;
                        var51.field210 = Statics.field793;
                        var51.field208 = Statics.field800;
                        field799[++field798 - 1] = var51;
                        var4 = var46;
                        var8 = var46.field593;
                        var9 = var46.field594;
                        var7 = -1;
                        Statics.field793 = var47;
                        Statics.field800 = var48;
                        continue;
                    }
                    if (var516 == 42) {
                        field796[var5++] = Statics.field238.method213(var9[var7]);
                        continue;
                    }
                    if (var516 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field238.method202(var10001, field796[var5]);
                        continue;
                    }
                    if (var516 == 44) {
                        int var52 = var9[var7] >> 16;
                        int var53 = var9[var7] & 0xFFFF;
                        var5--;
                        int var54 = field796[var5];
                        if (var54 >= 0 && var54 <= 5000) {
                            field794[var52] = var54;
                            byte var55 = -1;
                            if (var53 == 105) {
                                var55 = 0;
                            }
                            int var56 = 0;
                            while (true) {
                                if (var56 >= var54) {
                                    continue label3104;
                                }
                                field795[var52][var56] = var55;
                                var56++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var516 == 45) {
                        int var57 = var9[var7];
                        var5--;
                        int var58 = field796[var5];
                        if (var58 >= 0 && var58 < field794[var57]) {
                            field796[var5++] = field795[var57][var58];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var516 == 46) {
                        int var59 = var9[var7];
                        var5 -= 2;
                        int var60 = field796[var5];
                        if (var60 >= 0 && var60 < field794[var59]) {
                            field795[var59][var60] = field796[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var516 == 47) {
                        String var61 = Statics.field238.method215(var9[var7]);
                        if (var61 == null) {
                            var61 = "null";
                        }
                        field805[var6++] = var61;
                        continue;
                    }
                    if (var516 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field238.method237(var10001, field805[var6]);
                        continue;
                    }
                }
                boolean var62;
                if (var9[var7] == 1) {
                    var62 = true;
                } else {
                    var62 = false;
                }
                if (var516 < 1000) {
                    if (var516 == 100) {
                        var5 -= 3;
                        int var63 = field796[var5];
                        int var64 = field796[var5 + 1];
                        int var65 = field796[var5 + 2];
                        if (var64 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var66 = class173.method2370(var63);
                        if (var66.field2879 == null) {
                            var66.field2879 = new class173[var65 + 1];
                        }
                        if (var66.field2879.length <= var65) {
                            class173[] var67 = new class173[var65 + 1];
                            for (int var68 = 0; var68 < var66.field2879.length; var68++) {
                                var67[var68] = var66.field2879[var68];
                            }
                            var66.field2879 = var67;
                        }
                        if (var65 > 0 && var66.field2879[var65 - 1] == null) {
                            throw new RuntimeException("" + (var65 - 1));
                        }
                        class173 var69 = new class173();
                        var69.field2759 = var64;
                        var69.field2886 = var69.field2840 = var66.field2840;
                        var69.field2817 = var65;
                        var69.field2756 = true;
                        var66.field2879[var65] = var69;
                        if (var62) {
                            Statics.field2263 = var69;
                        } else {
                            Statics.field3011 = var69;
                        }
                        client.method629(var66);
                        continue;
                    }
                    if (var516 == 101) {
                        class173 var70 = var62 ? Statics.field2263 : Statics.field3011;
                        class173 var71 = class173.method2370(var70.field2840);
                        var71.field2879[var70.field2817] = null;
                        client.method629(var71);
                        continue;
                    }
                    if (var516 == 102) {
                        var5--;
                        class173 var72 = class173.method2370(field796[var5]);
                        var72.field2879 = null;
                        client.method629(var72);
                        continue;
                    }
                    if (var516 == 200) {
                        var5 -= 2;
                        int var73 = field796[var5];
                        int var74 = field796[var5 + 1];
                        class173 var75 = class173.method913(var73, var74);
                        if (var75 != null && var74 != -1) {
                            field796[var5++] = 1;
                            if (var62) {
                                Statics.field2263 = var75;
                            } else {
                                Statics.field3011 = var75;
                            }
                            continue;
                        }
                        field796[var5++] = 0;
                        continue;
                    }
                    if (var516 == 201) {
                        var5--;
                        class173 var76 = class173.method2370(field796[var5]);
                        if (var76 == null) {
                            field796[var5++] = 0;
                        } else {
                            field796[var5++] = 1;
                            if (var62) {
                                Statics.field2263 = var76;
                            } else {
                                Statics.field3011 = var76;
                            }
                        }
                        continue;
                    }
                } else if (!(var516 < 1000 || var516 >= 1100) || !(var516 < 2000 || var516 >= 2100)) {
                    int var77 = -1;
                    class173 var78;
                    if (var516 >= 2000) {
                        var516 -= 1000;
                        var5--;
                        var77 = field796[var5];
                        var78 = class173.method2370(var77);
                    } else {
                        var78 = var62 ? Statics.field2263 : Statics.field3011;
                    }
                    if (var516 == 1000) {
                        var5 -= 4;
                        var78.field2766 = field796[var5];
                        var78.field2767 = field796[var5 + 1];
                        var78.field2762 = field796[var5 + 2];
                        var78.field2763 = field796[var5 + 3];
                        client.method629(var78);
                        client.method1233(var78);
                        if (var77 != -1 && var78.field2759 == 0) {
                            client.method551(Statics.field2841[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var516 == 1001) {
                        var5 -= 4;
                        var78.field2866 = field796[var5];
                        var78.field2769 = field796[var5 + 1];
                        var78.field2764 = field796[var5 + 2];
                        var78.field2765 = field796[var5 + 3];
                        client.method629(var78);
                        client.method1233(var78);
                        if (var77 != -1 && var78.field2759 == 0) {
                            client.method551(Statics.field2841[var77 >> 16], var78, false);
                        }
                        continue;
                    }
                    if (var516 == 1003) {
                        var5--;
                        boolean var79 = field796[var5] == 1;
                        if (var78.field2799 != var79) {
                            var78.field2799 = var79;
                            client.method629(var78);
                        }
                        continue;
                    }
                    if (var516 == 1005) {
                        var5--;
                        var78.field2888 = field796[var5] == 1;
                        continue;
                    }
                    if (var516 == 1006) {
                        var5--;
                        var78.field2889 = field796[var5] == 1;
                        continue;
                    }
                } else if (var516 >= 1100 && var516 < 1200 || var516 >= 2100 && var516 < 2200) {
                    int var80 = -1;
                    class173 var81;
                    if (var516 >= 2000) {
                        var516 -= 1000;
                        var5--;
                        var80 = field796[var5];
                        var81 = class173.method2370(var80);
                    } else {
                        var81 = var62 ? Statics.field2263 : Statics.field3011;
                    }
                    if (var516 == 1100) {
                        var5 -= 2;
                        var81.field2778 = field796[var5];
                        if (var81.field2778 > var81.field2780 - var81.field2772) {
                            var81.field2778 = var81.field2780 - var81.field2772;
                        }
                        if (var81.field2778 < 0) {
                            var81.field2778 = 0;
                        }
                        var81.field2779 = field796[var5 + 1];
                        if (var81.field2779 > var81.field2781 - var81.field2773) {
                            var81.field2779 = var81.field2781 - var81.field2773;
                        }
                        if (var81.field2779 < 0) {
                            var81.field2779 = 0;
                        }
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1101) {
                        var5--;
                        var81.field2782 = field796[var5];
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1102) {
                        var5--;
                        var81.field2843 = field796[var5] == 1;
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1103) {
                        var5--;
                        var81.field2877 = field796[var5];
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1104) {
                        var5--;
                        var81.field2788 = field796[var5];
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1105) {
                        var5--;
                        var81.field2790 = field796[var5];
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1106) {
                        var5--;
                        var81.field2792 = field796[var5];
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1107) {
                        var5--;
                        var81.field2784 = field796[var5] == 1;
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1108) {
                        var81.field2798 = 1;
                        var5--;
                        var81.field2808 = field796[var5];
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1109) {
                        var5 -= 6;
                        var81.field2804 = field796[var5];
                        var81.field2805 = field796[var5 + 1];
                        var81.field2806 = field796[var5 + 2];
                        var81.field2807 = field796[var5 + 3];
                        var81.field2753 = field796[var5 + 4];
                        var81.field2809 = field796[var5 + 5];
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1110) {
                        var5--;
                        int var82 = field796[var5];
                        if (var81.field2872 != var82) {
                            var81.field2872 = var82;
                            var81.field2835 = 0;
                            var81.field2878 = 0;
                            client.method629(var81);
                        }
                        continue;
                    }
                    if (var516 == 1111) {
                        var5--;
                        var81.field2774 = field796[var5] == 1;
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1112) {
                        var6--;
                        String var83 = field805[var6];
                        if (!var83.equals(var81.field2815)) {
                            var81.field2815 = var83;
                            client.method629(var81);
                        }
                        continue;
                    }
                    if (var516 == 1113) {
                        var5--;
                        var81.field2755 = field796[var5];
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1114) {
                        var5 -= 3;
                        var81.field2818 = field796[var5];
                        var81.field2819 = field796[var5 + 1];
                        var81.field2845 = field796[var5 + 2];
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1115) {
                        var5--;
                        var81.field2820 = field796[var5] == 1;
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1116) {
                        var5--;
                        var81.field2794 = field796[var5];
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1117) {
                        var5--;
                        var81.field2795 = field796[var5];
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1118) {
                        var5--;
                        var81.field2796 = field796[var5] == 1;
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1119) {
                        var5--;
                        var81.field2797 = field796[var5] == 1;
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1120) {
                        var5 -= 2;
                        var81.field2780 = field796[var5];
                        var81.field2781 = field796[var5 + 1];
                        client.method629(var81);
                        if (var80 != -1 && var81.field2759 == 0) {
                            client.method551(Statics.field2841[var80 >> 16], var81, false);
                        }
                        continue;
                    }
                    if (var516 == 1121) {
                        int var84 = var81.field2840;
                        int var85 = var81.field2817;
                        client.field332.method2599(250);
                        client.field332.method2336(var85);
                        client.field332.method2429(var84);
                        client.field518 = var81;
                        client.method629(var81);
                        continue;
                    }
                    if (var516 == 1122) {
                        var5--;
                        var81.field2791 = field796[var5];
                        client.method629(var81);
                        continue;
                    }
                } else if (var516 >= 1200 && var516 < 1300 || var516 >= 2200 && var516 < 2300) {
                    class173 var86;
                    if (var516 >= 2000) {
                        var516 -= 1000;
                        var5--;
                        var86 = class173.method2370(field796[var5]);
                    } else {
                        var86 = var62 ? Statics.field2263 : Statics.field3011;
                    }
                    client.method629(var86);
                    if (var516 == 1200 || var516 == 1205 || var516 == 1212) {
                        var5 -= 2;
                        int var87 = field796[var5];
                        int var88 = field796[var5 + 1];
                        var86.field2875 = var87;
                        var86.field2832 = var88;
                        class52 var89 = class52.method36(var87);
                        var86.field2806 = var89.field1118;
                        var86.field2807 = var89.field1119;
                        var86.field2753 = var89.field1115;
                        var86.field2804 = var89.field1139;
                        var86.field2805 = var89.field1126;
                        var86.field2809 = var89.field1127;
                        if (var516 == 1205) {
                            var86.field2813 = 0;
                        } else if (var516 == 1212 | var89.field1123 == 1) {
                            var86.field2813 = 1;
                        } else {
                            var86.field2813 = 2;
                        }
                        if (var86.field2810 > 0) {
                            var86.field2809 = var86.field2809 * 32 / var86.field2810;
                        } else if (var86.field2866 > 0) {
                            var86.field2809 = var86.field2809 * 32 / var86.field2866;
                        }
                        continue;
                    }
                    if (var516 == 1201) {
                        var86.field2798 = 2;
                        var5--;
                        var86.field2808 = field796[var5];
                        continue;
                    }
                    if (var516 == 1202) {
                        var86.field2798 = 3;
                        var86.field2808 = Statics.field242.field32.method3250();
                        continue;
                    }
                } else if ((var516 < 1300 || var516 >= 1400) && (var516 < 2300 || var516 >= 2400)) {
                    if (var516 >= 1400 && var516 < 1500 || var516 >= 2400 && var516 < 2500) {
                        class173 var94;
                        if (var516 >= 2000) {
                            var516 -= 1000;
                            var5--;
                            var94 = class173.method2370(field796[var5]);
                        } else {
                            var94 = var62 ? Statics.field2263 : Statics.field3011;
                        }
                        var6--;
                        String var95 = field805[var6];
                        int[] var96 = null;
                        if (var95.length() > 0 && var95.charAt(var95.length() - 1) == 'Y') {
                            var5--;
                            int var97 = field796[var5];
                            if (var97 > 0) {
                                var96 = new int[var97];
                                while (var97-- > 0) {
                                    var5--;
                                    var96[var97] = field796[var5];
                                }
                            }
                            var95 = var95.substring(0, var95.length() - 1);
                        }
                        Object[] var98 = new Object[var95.length() + 1];
                        for (int var99 = var98.length - 1; var99 >= 1; var99--) {
                            if (var95.charAt(var99 - 1) == 's') {
                                var6--;
                                var98[var99] = field805[var6];
                            } else {
                                var5--;
                                var98[var99] = Integer.valueOf(field796[var5]);
                            }
                        }
                        var5--;
                        int var100 = field796[var5];
                        if (var100 == -1) {
                            var98 = null;
                        } else {
                            var98[0] = Integer.valueOf(var100);
                        }
                        if (var516 == 1400) {
                            var94.field2837 = var98;
                        }
                        if (var516 == 1401) {
                            var94.field2864 = var98;
                        }
                        if (var516 == 1402) {
                            var94.field2839 = var98;
                        }
                        if (var516 == 1403) {
                            var94.field2789 = var98;
                        }
                        if (var516 == 1404) {
                            var94.field2859 = var98;
                        }
                        if (var516 == 1405) {
                            var94.field2844 = var98;
                        }
                        if (var516 == 1406) {
                            var94.field2847 = var98;
                        }
                        if (var516 == 1407) {
                            var94.field2829 = var98;
                            var94.field2849 = var96;
                        }
                        if (var516 == 1408) {
                            var94.field2833 = var98;
                        }
                        if (var516 == 1409) {
                            var94.field2761 = var98;
                        }
                        if (var516 == 1410) {
                            var94.field2787 = var98;
                        }
                        if (var516 == 1411) {
                            var94.field2838 = var98;
                        }
                        if (var516 == 1412) {
                            var94.field2842 = var98;
                        }
                        if (var516 == 1414) {
                            var94.field2758 = var98;
                            var94.field2846 = var96;
                        }
                        if (var516 == 1415) {
                            var94.field2814 = var98;
                            var94.field2853 = var96;
                        }
                        if (var516 == 1416) {
                            var94.field2812 = var98;
                        }
                        if (var516 == 1417) {
                            var94.field2748 = var98;
                        }
                        if (var516 == 1418) {
                            var94.field2868 = var98;
                        }
                        if (var516 == 1419) {
                            var94.field2858 = var98;
                        }
                        if (var516 == 1420) {
                            var94.field2777 = var98;
                        }
                        if (var516 == 1421) {
                            var94.field2860 = var98;
                        }
                        if (var516 == 1422) {
                            var94.field2854 = var98;
                        }
                        if (var516 == 1423) {
                            var94.field2862 = var98;
                        }
                        if (var516 == 1424) {
                            var94.field2834 = var98;
                        }
                        if (var516 == 1425) {
                            var94.field2865 = var98;
                        }
                        if (var516 == 1426) {
                            var94.field2870 = var98;
                        }
                        if (var516 == 1427) {
                            var94.field2851 = var98;
                        }
                        var94.field2861 = true;
                        continue;
                    }
                    if (var516 < 1600) {
                        class173 var101 = var62 ? Statics.field2263 : Statics.field3011;
                        if (var516 == 1500) {
                            field796[var5++] = var101.field2770;
                            continue;
                        }
                        if (var516 == 1501) {
                            field796[var5++] = var101.field2771;
                            continue;
                        }
                        if (var516 == 1502) {
                            field796[var5++] = var101.field2772;
                            continue;
                        }
                        if (var516 == 1503) {
                            field796[var5++] = var101.field2773;
                            continue;
                        }
                        if (var516 == 1504) {
                            field796[var5++] = var101.field2799 ? 1 : 0;
                            continue;
                        }
                        if (var516 == 1505) {
                            field796[var5++] = var101.field2886;
                            continue;
                        }
                    } else if (var516 < 1700) {
                        class173 var102 = var62 ? Statics.field2263 : Statics.field3011;
                        if (var516 == 1600) {
                            field796[var5++] = var102.field2778;
                            continue;
                        }
                        if (var516 == 1601) {
                            field796[var5++] = var102.field2779;
                            continue;
                        }
                        if (var516 == 1602) {
                            field805[var6++] = var102.field2815;
                            continue;
                        }
                        if (var516 == 1603) {
                            field796[var5++] = var102.field2780;
                            continue;
                        }
                        if (var516 == 1604) {
                            field796[var5++] = var102.field2781;
                            continue;
                        }
                        if (var516 == 1605) {
                            field796[var5++] = var102.field2809;
                            continue;
                        }
                        if (var516 == 1606) {
                            field796[var5++] = var102.field2806;
                            continue;
                        }
                        if (var516 == 1607) {
                            field796[var5++] = var102.field2753;
                            continue;
                        }
                        if (var516 == 1608) {
                            field796[var5++] = var102.field2807;
                            continue;
                        }
                        if (var516 == 1609) {
                            field796[var5++] = var102.field2877;
                            continue;
                        }
                    } else if (var516 < 1800) {
                        class173 var103 = var62 ? Statics.field2263 : Statics.field3011;
                        if (var516 == 1700) {
                            field796[var5++] = var103.field2875;
                            continue;
                        }
                        if (var516 == 1701) {
                            if (var103.field2875 == -1) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = var103.field2832;
                            }
                            continue;
                        }
                        if (var516 == 1702) {
                            field796[var5++] = var103.field2817;
                            continue;
                        }
                    } else if (var516 < 1900) {
                        class173 var104 = var62 ? Statics.field2263 : Statics.field3011;
                        if (var516 == 1800) {
                            field796[var5++] = class178.method806(client.method44(var104));
                            continue;
                        }
                        if (var516 == 1801) {
                            var5--;
                            int var105 = field796[var5];
                            int var517 = var105 - 1;
                            if (var104.field2802 != null && var517 < var104.field2802.length && var104.field2802[var517] != null) {
                                field805[var6++] = var104.field2802[var517];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var516 == 1802) {
                            if (var104.field2828 == null) {
                                field805[var6++] = "";
                            } else {
                                field805[var6++] = var104.field2828;
                            }
                            continue;
                        }
                    } else if (!(var516 < 1900 || var516 >= 2000) || !(var516 < 2900 || var516 >= 3000)) {
                        class173 var106;
                        if (var516 >= 2000) {
                            var516 -= 1000;
                            var5--;
                            var106 = class173.method2370(field796[var5]);
                        } else {
                            var106 = var62 ? Statics.field2263 : Statics.field3011;
                        }
                        if (var516 == 1927) {
                            if (field802 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var106.field2851 == null) {
                                return;
                            }
                            class1 var107 = new class1();
                            var107.field4 = var106;
                            var107.field13 = var106.field2851;
                            var107.field3 = field802 + 1;
                            client.field519.method3558(arg0);
                            continue;
                        }
                    } else if (var516 < 2600) {
                        var5--;
                        class173 var108 = class173.method2370(field796[var5]);
                        if (var516 == 2500) {
                            field796[var5++] = var108.field2770;
                            continue;
                        }
                        if (var516 == 2501) {
                            field796[var5++] = var108.field2771;
                            continue;
                        }
                        if (var516 == 2502) {
                            field796[var5++] = var108.field2772;
                            continue;
                        }
                        if (var516 == 2503) {
                            field796[var5++] = var108.field2773;
                            continue;
                        }
                        if (var516 == 2504) {
                            field796[var5++] = var108.field2799 ? 1 : 0;
                            continue;
                        }
                        if (var516 == 2505) {
                            field796[var5++] = var108.field2886;
                            continue;
                        }
                    } else if (var516 < 2700) {
                        var5--;
                        class173 var109 = class173.method2370(field796[var5]);
                        if (var516 == 2600) {
                            field796[var5++] = var109.field2778;
                            continue;
                        }
                        if (var516 == 2601) {
                            field796[var5++] = var109.field2779;
                            continue;
                        }
                        if (var516 == 2602) {
                            field805[var6++] = var109.field2815;
                            continue;
                        }
                        if (var516 == 2603) {
                            field796[var5++] = var109.field2780;
                            continue;
                        }
                        if (var516 == 2604) {
                            field796[var5++] = var109.field2781;
                            continue;
                        }
                        if (var516 == 2605) {
                            field796[var5++] = var109.field2809;
                            continue;
                        }
                        if (var516 == 2606) {
                            field796[var5++] = var109.field2806;
                            continue;
                        }
                        if (var516 == 2607) {
                            field796[var5++] = var109.field2753;
                            continue;
                        }
                        if (var516 == 2608) {
                            field796[var5++] = var109.field2807;
                            continue;
                        }
                        if (var516 == 2609) {
                            field796[var5++] = var109.field2877;
                            continue;
                        }
                    } else if (var516 < 2800) {
                        if (var516 == 2700) {
                            var5--;
                            class173 var110 = class173.method2370(field796[var5]);
                            field796[var5++] = var110.field2875;
                            continue;
                        }
                        if (var516 == 2701) {
                            var5--;
                            class173 var111 = class173.method2370(field796[var5]);
                            if (var111.field2875 == -1) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = var111.field2832;
                            }
                            continue;
                        }
                        if (var516 == 2702) {
                            var5--;
                            int var112 = field796[var5];
                            class4 var113 = (class4) client.field448.method3524((long) var112);
                            if (var113 == null) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = 1;
                            }
                            continue;
                        }
                        if (var516 == 2706) {
                            field796[var5++] = client.field549;
                            continue;
                        }
                    } else if (var516 < 2900) {
                        var5--;
                        class173 var114 = class173.method2370(field796[var5]);
                        if (var516 == 2800) {
                            field796[var5++] = class178.method806(client.method44(var114));
                            continue;
                        }
                        if (var516 == 2801) {
                            var5--;
                            int var115 = field796[var5];
                            int var518 = var115 - 1;
                            if (var114.field2802 != null && var518 < var114.field2802.length && var114.field2802[var518] != null) {
                                field805[var6++] = var114.field2802[var518];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var516 == 2802) {
                            if (var114.field2828 == null) {
                                field805[var6++] = "";
                            } else {
                                field805[var6++] = var114.field2828;
                            }
                            continue;
                        }
                    } else if (var516 < 3200) {
                        if (var516 == 3100) {
                            var6--;
                            String var116 = field805[var6];
                            class12.method869(0, "", var116);
                            continue;
                        }
                        if (var516 == 3101) {
                            var5 -= 2;
                            client.method2929(Statics.field242, field796[var5], field796[var5 + 1]);
                            continue;
                        }
                        if (var516 == 3103) {
                            client.method2673();
                            continue;
                        }
                        if (var516 == 3104) {
                            var6--;
                            String var117 = field805[var6];
                            int var118 = 0;
                            boolean var119 = class163.method752(var117, 10, true);
                            if (var119) {
                                var118 = class163.method635(var117);
                            }
                            client.field332.method2599(136);
                            client.field332.method2338(var118);
                            continue;
                        }
                        if (var516 == 3105) {
                            var6--;
                            String var120 = field805[var6];
                            client.field332.method2599(23);
                            client.field332.method2398(var120.length() + 1);
                            client.field332.method2440(var120);
                            continue;
                        }
                        if (var516 == 3106) {
                            var6--;
                            String var121 = field805[var6];
                            client.field332.method2599(65);
                            client.field332.method2398(var121.length() + 1);
                            client.field332.method2440(var121);
                            continue;
                        }
                        if (var516 == 3107) {
                            var5--;
                            int var122 = field796[var5];
                            var6--;
                            String var123 = field805[var6];
                            client.method707(var122, var123);
                            continue;
                        }
                        if (var516 == 3108) {
                            var5 -= 3;
                            int var124 = field796[var5];
                            int var125 = field796[var5 + 1];
                            int var126 = field796[var5 + 2];
                            class173 var127 = class173.method2370(var126);
                            client.method190(var127, var124, var125);
                            continue;
                        }
                        if (var516 == 3109) {
                            var5 -= 2;
                            int var128 = field796[var5];
                            int var129 = field796[var5 + 1];
                            class173 var130 = var62 ? Statics.field2263 : Statics.field3011;
                            client.method190(var130, var128, var129);
                            continue;
                        }
                        if (var516 == 3110) {
                            var5--;
                            Statics.field571 = field796[var5] == 1;
                            continue;
                        }
                        if (var516 == 3111) {
                            field796[var5++] = Statics.field666.field143 ? 1 : 0;
                            continue;
                        }
                        if (var516 == 3112) {
                            var5--;
                            Statics.field666.field143 = field796[var5] == 1;
                            class9.method178();
                            continue;
                        }
                        if (var516 == 3113) {
                            var6--;
                            String var131 = field805[var6];
                            var5--;
                            boolean var132 = field796[var5] == 1;
                            class138.method2051(var131, var132, false);
                            continue;
                        }
                        if (var516 == 3115) {
                            var5--;
                            int var133 = field796[var5];
                            client.field332.method2599(118);
                            client.field332.method2336(var133);
                            continue;
                        }
                        if (var516 == 3116) {
                            var5--;
                            int var134 = field796[var5];
                            var6 -= 2;
                            String var135 = field805[var6];
                            String var136 = field805[var6 + 1];
                            if (var135.length() <= 500 && var136.length() <= 500) {
                                client.field332.method2599(229);
                                client.field332.method2336(1 + class119.method2931(var135) + class119.method2931(var136));
                                client.field332.method2374(var134);
                                client.field332.method2440(var135);
                                client.field332.method2440(var136);
                            }
                            continue;
                        }
                    } else if (var516 < 3300) {
                        if (var516 == 3200) {
                            var5 -= 3;
                            int var137 = field796[var5];
                            int var138 = field796[var5 + 1];
                            int var139 = field796[var5 + 2];
                            if (client.field527 != 0 && var138 != 0 && client.field376 < 50) {
                                client.field530[client.field376] = var137;
                                client.field531[client.field376] = var138;
                                client.field532[client.field376] = var139;
                                client.field460[client.field376] = null;
                                client.field533[client.field376] = 0;
                                client.field376++;
                            }
                            continue;
                        }
                        if (var516 == 3201) {
                            var5--;
                            int var140 = field796[var5];
                            if (var140 == -1 && !client.field526) {
                                Statics.field2963.method3371();
                                class183.field2958 = 1;
                                Statics.field2959 = null;
                            } else if (var140 != -1 && client.field296 != var140 && client.field402 != 0 && !client.field526) {
                                class183.method2794(2, Statics.field2160, var140, 0, client.field402, false);
                            }
                            client.field296 = var140;
                            continue;
                        }
                        if (var516 == 3202) {
                            var5 -= 2;
                            int var141 = field796[var5];
                            int var10000 = field796[var5 + 1];
                            if (client.field402 != 0 && var141 != -1) {
                                class183.method2795(Statics.field2077, var141, 0, client.field402, false);
                                client.field526 = true;
                            }
                            continue;
                        }
                    } else if (var516 < 3400) {
                        if (var516 == 3300) {
                            field796[var5++] = client.field298;
                            continue;
                        }
                        if (var516 == 3301) {
                            var5 -= 2;
                            int var143 = field796[var5];
                            int var144 = field796[var5 + 1];
                            field796[var5++] = class16.method592(var143, var144);
                            continue;
                        }
                        if (var516 == 3302) {
                            var5 -= 2;
                            int var145 = field796[var5];
                            int var146 = field796[var5 + 1];
                            int[] var147 = field796;
                            int var148 = var5++;
                            class16 var149 = (class16) class16.field222.method3524((long) var145);
                            int var150;
                            if (var149 == null) {
                                var150 = 0;
                            } else if (var146 >= 0 && var146 < var149.field218.length) {
                                var150 = var149.field218[var146];
                            } else {
                                var150 = 0;
                            }
                            var147[var148] = var150;
                            continue;
                        }
                        if (var516 == 3303) {
                            var5 -= 2;
                            int var151 = field796[var5];
                            int var152 = field796[var5 + 1];
                            field796[var5++] = Statics.method768(var151, var152);
                            continue;
                        }
                        if (var516 == 3304) {
                            var5--;
                            int var153 = field796[var5];
                            field796[var5++] = class51.method680(var153).field1094;
                            continue;
                        }
                        if (var516 == 3305) {
                            var5--;
                            int var154 = field796[var5];
                            field796[var5++] = client.field508[var154];
                            continue;
                        }
                        if (var516 == 3306) {
                            var5--;
                            int var155 = field796[var5];
                            field796[var5++] = client.field425[var155];
                            continue;
                        }
                        if (var516 == 3307) {
                            var5--;
                            int var156 = field796[var5];
                            field796[var5++] = client.field482[var156];
                            continue;
                        }
                        if (var516 == 3308) {
                            int var157 = Statics.field24;
                            int var158 = (Statics.field242.field863 >> 7) + Statics.field630;
                            int var159 = (Statics.field242.field819 >> 7) + Statics.field147;
                            field796[var5++] = (var157 << 28) + (var158 << 14) + var159;
                            continue;
                        }
                        if (var516 == 3309) {
                            var5--;
                            int var160 = field796[var5];
                            field796[var5++] = var160 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var516 == 3310) {
                            var5--;
                            int var161 = field796[var5];
                            field796[var5++] = var161 >> 28;
                            continue;
                        }
                        if (var516 == 3311) {
                            var5--;
                            int var162 = field796[var5];
                            field796[var5++] = var162 & 0x3FFF;
                            continue;
                        }
                        if (var516 == 3312) {
                            field796[var5++] = client.field406 ? 1 : 0;
                            continue;
                        }
                        if (var516 == 3313) {
                            var5 -= 2;
                            int var163 = field796[var5] + 32768;
                            int var164 = field796[var5 + 1];
                            field796[var5++] = class16.method592(var163, var164);
                            continue;
                        }
                        if (var516 == 3314) {
                            var5 -= 2;
                            int var165 = field796[var5] + 32768;
                            int var166 = field796[var5 + 1];
                            int[] var167 = field796;
                            int var168 = var5++;
                            class16 var169 = (class16) class16.field222.method3524((long) var165);
                            int var170;
                            if (var169 == null) {
                                var170 = 0;
                            } else if (var166 >= 0 && var166 < var169.field218.length) {
                                var170 = var169.field218[var166];
                            } else {
                                var170 = 0;
                            }
                            var167[var168] = var170;
                            continue;
                        }
                        if (var516 == 3315) {
                            var5 -= 2;
                            int var171 = field796[var5] + 32768;
                            int var172 = field796[var5 + 1];
                            field796[var5++] = Statics.method768(var171, var172);
                            continue;
                        }
                        if (var516 == 3316) {
                            if (client.field454 >= 2) {
                                field796[var5++] = client.field454;
                            } else {
                                field796[var5++] = 0;
                            }
                            continue;
                        }
                        if (var516 == 3317) {
                            field796[var5++] = client.field305;
                            continue;
                        }
                        if (var516 == 3318) {
                            field796[var5++] = client.field289;
                            continue;
                        }
                        if (var516 == 3321) {
                            field796[var5++] = client.field417;
                            continue;
                        }
                        if (var516 == 3322) {
                            field796[var5++] = client.field453;
                            continue;
                        }
                        if (var516 == 3323) {
                            if (client.field456) {
                                field796[var5++] = 1;
                            } else {
                                field796[var5++] = 0;
                            }
                            continue;
                        }
                        if (var516 == 3324) {
                            field796[var5++] = client.field293;
                            continue;
                        }
                    } else if (var516 < 3500) {
                        if (var516 == 3400) {
                            var5 -= 2;
                            int var173 = field796[var5];
                            int var174 = field796[var5 + 1];
                            class49 var175 = class49.method563(var173);
                            if (var175.field1071 != 's') {
                            }
                            for (int var176 = 0; var176 < var175.field1069; var176++) {
                                if (var175.field1075[var176] == var174) {
                                    field805[var6++] = var175.field1077[var176];
                                    var175 = null;
                                    break;
                                }
                            }
                            if (var175 != null) {
                                field805[var6++] = var175.field1072;
                            }
                            continue;
                        }
                        if (var516 == 3408) {
                            var5 -= 4;
                            int var177 = field796[var5];
                            int var178 = field796[var5 + 1];
                            int var179 = field796[var5 + 2];
                            int var180 = field796[var5 + 3];
                            class49 var181 = class49.method563(var179);
                            if (var181.field1068 == var177 && var181.field1071 == var178) {
                                for (int var182 = 0; var182 < var181.field1069; var182++) {
                                    if (var181.field1075[var182] == var180) {
                                        if (var178 == 115) {
                                            field805[var6++] = var181.field1077[var182];
                                        } else {
                                            field796[var5++] = var181.field1076[var182];
                                        }
                                        var181 = null;
                                        break;
                                    }
                                }
                                if (var181 != null) {
                                    if (var178 == 115) {
                                        field805[var6++] = var181.field1072;
                                    } else {
                                        field796[var5++] = var181.field1073;
                                    }
                                }
                                continue;
                            }
                            if (var178 == 115) {
                                field805[var6++] = "null";
                            } else {
                                field796[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var516 < 3700) {
                        if (var516 == 3600) {
                            if (client.field471 == 0) {
                                field796[var5++] = -2;
                            } else if (client.field471 == 1) {
                                field796[var5++] = -1;
                            } else {
                                field796[var5++] = client.field554;
                            }
                            continue;
                        }
                        if (var516 == 3601) {
                            var5--;
                            int var183 = field796[var5];
                            if (client.field471 == 2 && var183 < client.field554) {
                                field805[var6++] = client.field556[var183].field254;
                                field805[var6++] = client.field556[var183].field249;
                                continue;
                            }
                            field805[var6++] = "";
                            field805[var6++] = "";
                            continue;
                        }
                        if (var516 == 3602) {
                            var5--;
                            int var184 = field796[var5];
                            if (client.field471 == 2 && var184 < client.field554) {
                                field796[var5++] = client.field556[var184].field247;
                                continue;
                            }
                            field796[var5++] = 0;
                            continue;
                        }
                        if (var516 == 3603) {
                            var5--;
                            int var185 = field796[var5];
                            if (client.field471 == 2 && var185 < client.field554) {
                                field796[var5++] = client.field556[var185].field250;
                                continue;
                            }
                            field796[var5++] = 0;
                            continue;
                        }
                        if (var516 == 3604) {
                            var6--;
                            String var186 = field805[var6];
                            var5--;
                            int var187 = field796[var5];
                            client.method132(var186, var187);
                            continue;
                        }
                        if (var516 == 3605) {
                            var6--;
                            String var188 = field805[var6];
                            if (var188 == null) {
                                continue;
                            }
                            if ((client.field554 < 200 || client.field389 == 1) && client.field554 < 400) {
                                String var189 = class164.method2917(var188, Statics.field207);
                                if (var189 == null) {
                                    continue;
                                }
                                for (int var190 = 0; var190 < client.field554; var190++) {
                                    class18 var191 = client.field556[var190];
                                    String var192 = class164.method2917(var191.field254, Statics.field207);
                                    if (var192 != null && var192.equals(var189)) {
                                        class12.method869(30, "", var188 + class157.field2344);
                                        continue label3104;
                                    }
                                    if (var191.field249 != null) {
                                        String var193 = class164.method2917(var191.field249, Statics.field207);
                                        if (var193 != null && var193.equals(var189)) {
                                            class12.method869(30, "", var188 + class157.field2344);
                                            continue label3104;
                                        }
                                    }
                                }
                                for (int var194 = 0; var194 < client.field558; var194++) {
                                    class8 var195 = client.field559[var194];
                                    String var196 = class164.method2917(var195.field140, Statics.field207);
                                    if (var196 != null && var196.equals(var189)) {
                                        class12.method869(30, "", class157.field2490 + var188 + class157.field2439);
                                        continue label3104;
                                    }
                                    if (var195.field136 != null) {
                                        String var197 = class164.method2917(var195.field136, Statics.field207);
                                        if (var197 != null && var197.equals(var189)) {
                                            class12.method869(30, "", class157.field2490 + var188 + class157.field2439);
                                            continue label3104;
                                        }
                                    }
                                }
                                if (class164.method2917(Statics.field242.field36, Statics.field207).equals(var189)) {
                                    class12.method869(30, "", class157.field2375);
                                } else {
                                    client.field332.method2599(244);
                                    client.field332.method2398(class119.method2931(var188));
                                    client.field332.method2440(var188);
                                }
                                continue;
                            }
                            class12.method869(30, "", class157.field2484);
                            continue;
                        }
                        if (var516 == 3606) {
                            var6--;
                            String var198 = field805[var6];
                            if (var198 == null) {
                                continue;
                            }
                            String var199 = class164.method2917(var198, Statics.field207);
                            if (var199 == null) {
                                continue;
                            }
                            int var200 = 0;
                            while (true) {
                                if (var200 >= client.field554) {
                                    continue label3104;
                                }
                                class18 var201 = client.field556[var200];
                                String var202 = var201.field254;
                                String var203 = class164.method2917(var202, Statics.field207);
                                boolean var204;
                                if (var198 == null || var202 == null) {
                                    var204 = false;
                                } else if (var198.startsWith("#") || var202.startsWith("#")) {
                                    var204 = var198.equals(var202);
                                } else {
                                    var204 = var199.equals(var203);
                                }
                                if (var204) {
                                    client.field554--;
                                    for (int var205 = var200; var205 < client.field554; var205++) {
                                        client.field556[var205] = client.field556[var205 + 1];
                                    }
                                    client.field495 = client.field422;
                                    client.field332.method2599(232);
                                    client.field332.method2398(class119.method2931(var198));
                                    client.field332.method2440(var198);
                                    continue label3104;
                                }
                                var200++;
                            }
                        }
                        if (var516 == 3607) {
                            var6--;
                            String var206 = field805[var6];
                            if (var206 == null) {
                                continue;
                            }
                            if ((client.field558 < 100 || client.field389 == 1) && client.field558 < 400) {
                                String var207 = class164.method2917(var206, Statics.field207);
                                if (var207 == null) {
                                    continue;
                                }
                                for (int var208 = 0; var208 < client.field558; var208++) {
                                    class8 var209 = client.field559[var208];
                                    String var210 = class164.method2917(var209.field140, Statics.field207);
                                    if (var210 != null && var210.equals(var207)) {
                                        class12.method869(31, "", var206 + class157.field2487);
                                        continue label3104;
                                    }
                                    if (var209.field136 != null) {
                                        String var211 = class164.method2917(var209.field136, Statics.field207);
                                        if (var211 != null && var211.equals(var207)) {
                                            class12.method869(31, "", var206 + class157.field2487);
                                            continue label3104;
                                        }
                                    }
                                }
                                for (int var212 = 0; var212 < client.field554; var212++) {
                                    class18 var213 = client.field556[var212];
                                    String var214 = class164.method2917(var213.field254, Statics.field207);
                                    if (var214 != null && var214.equals(var207)) {
                                        class12.method869(31, "", class157.field2492 + var206 + class157.field2459);
                                        continue label3104;
                                    }
                                    if (var213.field249 != null) {
                                        String var215 = class164.method2917(var213.field249, Statics.field207);
                                        if (var215 != null && var215.equals(var207)) {
                                            class12.method869(31, "", class157.field2492 + var206 + class157.field2459);
                                            continue label3104;
                                        }
                                    }
                                }
                                if (class164.method2917(Statics.field242.field36, Statics.field207).equals(var207)) {
                                    class12.method869(31, "", class157.field2486);
                                } else {
                                    client.field332.method2599(231);
                                    client.field332.method2398(class119.method2931(var206));
                                    client.field332.method2440(var206);
                                }
                                continue;
                            }
                            class12.method869(31, "", class157.field2403);
                            continue;
                        }
                        if (var516 == 3608) {
                            var6--;
                            String var216 = field805[var6];
                            client.method630(var216);
                            continue;
                        }
                        if (var516 == 3609) {
                            var6--;
                            String var217 = field805[var6];
                            class152[] var218 = new class152[] { class152.field2266, class152.field2282, class152.field2269, class152.field2270, class152.field2278 };
                            class152[] var219 = var218;
                            for (int var220 = 0; var220 < var219.length; var220++) {
                                class152 var221 = var219[var220];
                                if (var221.field2272 != -1) {
                                    int var223 = var221.field2272;
                                    String var224 = "<img=" + var223 + ">";
                                    if (var217.startsWith(var224)) {
                                        var217 = var217.substring(6 + Integer.toString(var221.field2272).length());
                                        break;
                                    }
                                }
                            }
                            field796[var5++] = Statics.method368(var217, false) ? 1 : 0;
                            continue;
                        }
                        if (var516 == 3611) {
                            if (client.field368 == null) {
                                field805[var6++] = "";
                                continue;
                            }
                            String[] var225 = field805;
                            int var226 = var6++;
                            String var227 = client.field368;
                            long var228 = 0L;
                            int var230 = var227.length();
                            for (int var231 = 0; var231 < var230; var231++) {
                                var228 *= 37L;
                                char var232 = var227.charAt(var231);
                                if (var232 >= 'A' && var232 <= 'Z') {
                                    var228 += (long) (var232 + 1 - 65);
                                } else if (var232 >= 'a' && var232 <= 'z') {
                                    var228 += (long) (var232 + 1 - 97);
                                } else if (var232 >= '0' && var232 <= '9') {
                                    var228 += (long) (var232 + 27 - 48);
                                }
                                if (var228 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var228 % 37L == 0L && var228 != 0L) {
                                var228 /= 37L;
                            }
                            String var235 = class162.method2923(var228);
                            if (var235 == null) {
                                var235 = "";
                            }
                            var225[var226] = var235;
                            continue;
                        }
                        if (var516 == 3612) {
                            if (client.field368 == null) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = Statics.field1740;
                            }
                            continue;
                        }
                        if (var516 == 3613) {
                            var5--;
                            int var237 = field796[var5];
                            if (client.field368 != null && var237 < Statics.field1740) {
                                field805[var6++] = Statics.field204[var237].field628;
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var516 == 3614) {
                            var5--;
                            int var238 = field796[var5];
                            if (client.field368 != null && var238 < Statics.field1740) {
                                field796[var5++] = Statics.field204[var238].field621;
                                continue;
                            }
                            field796[var5++] = 0;
                            continue;
                        }
                        if (var516 == 3615) {
                            var5--;
                            int var239 = field796[var5];
                            if (client.field368 != null && var239 < Statics.field1740) {
                                field796[var5++] = Statics.field204[var239].field622;
                                continue;
                            }
                            field796[var5++] = 0;
                            continue;
                        }
                        if (var516 == 3616) {
                            field796[var5++] = Statics.field2029;
                            continue;
                        }
                        if (var516 == 3617) {
                            var6--;
                            String var240 = field805[var6];
                            if (Statics.field204 != null) {
                                client.field332.method2599(87);
                                client.field332.method2398(class119.method2931(var240));
                                client.field332.method2440(var240);
                            }
                            continue;
                        }
                        if (var516 == 3618) {
                            field796[var5++] = Statics.field162;
                            continue;
                        }
                        if (var516 == 3619) {
                            var6--;
                            String var241 = field805[var6];
                            if (!var241.equals("")) {
                                client.field332.method2599(180);
                                client.field332.method2398(class119.method2931(var241));
                                client.field332.method2440(var241);
                            }
                            continue;
                        }
                        if (var516 == 3620) {
                            client.field332.method2599(180);
                            client.field332.method2398(0);
                            continue;
                        }
                        if (var516 == 3621) {
                            if (client.field471 == 0) {
                                field796[var5++] = -1;
                            } else {
                                field796[var5++] = client.field558;
                            }
                            continue;
                        }
                        if (var516 == 3622) {
                            var5--;
                            int var242 = field796[var5];
                            if (client.field471 != 0 && var242 < client.field558) {
                                field805[var6++] = client.field559[var242].field140;
                                field805[var6++] = client.field559[var242].field136;
                                continue;
                            }
                            field805[var6++] = "";
                            field805[var6++] = "";
                            continue;
                        }
                        if (var516 == 3623) {
                            String var243;
                            label2812: {
                                var6--;
                                var243 = field805[var6];
                                String var245 = "<img=0>";
                                if (!var243.startsWith(var245)) {
                                    String var247 = "<img=1>";
                                    if (!var243.startsWith(var247)) {
                                        break label2812;
                                    }
                                }
                                var243 = var243.substring(7);
                            }
                            field796[var5++] = Statics.method2288(var243) ? 1 : 0;
                            continue;
                        }
                        if (var516 == 3624) {
                            var5--;
                            int var248 = field796[var5];
                            if (Statics.field204 != null && var248 < Statics.field1740 && Statics.field204[var248].field628.equalsIgnoreCase(Statics.field242.field36)) {
                                field796[var5++] = 1;
                                continue;
                            }
                            field796[var5++] = 0;
                            continue;
                        }
                        if (var516 == 3625) {
                            if (client.field314 == null) {
                                field805[var6++] = "";
                                continue;
                            }
                            String[] var249 = field805;
                            int var250 = var6++;
                            String var251 = client.field314;
                            long var252 = 0L;
                            int var254 = var251.length();
                            for (int var255 = 0; var255 < var254; var255++) {
                                var252 *= 37L;
                                char var256 = var251.charAt(var255);
                                if (var256 >= 'A' && var256 <= 'Z') {
                                    var252 += (long) (var256 + 1 - 65);
                                } else if (var256 >= 'a' && var256 <= 'z') {
                                    var252 += (long) (var256 + 1 - 97);
                                } else if (var256 >= '0' && var256 <= '9') {
                                    var252 += (long) (var256 + 27 - 48);
                                }
                                if (var252 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var252 % 37L == 0L && var252 != 0L) {
                                var252 /= 37L;
                            }
                            String var259 = class162.method2923(var252);
                            if (var259 == null) {
                                var259 = "";
                            }
                            var249[var250] = var259;
                            continue;
                        }
                    } else if (var516 < 4000) {
                        if (var516 == 3903) {
                            var5--;
                            int var261 = field796[var5];
                            field796[var5++] = client.field534[var261].method3732();
                            continue;
                        }
                        if (var516 == 3904) {
                            var5--;
                            int var262 = field796[var5];
                            field796[var5++] = client.field534[var262].field3163;
                            continue;
                        }
                        if (var516 == 3905) {
                            var5--;
                            int var263 = field796[var5];
                            field796[var5++] = client.field534[var263].field3162;
                            continue;
                        }
                        if (var516 == 3906) {
                            var5--;
                            int var264 = field796[var5];
                            field796[var5++] = client.field534[var264].field3164;
                            continue;
                        }
                        if (var516 == 3907) {
                            var5--;
                            int var265 = field796[var5];
                            field796[var5++] = client.field534[var265].field3161;
                            continue;
                        }
                        if (var516 == 3908) {
                            var5--;
                            int var266 = field796[var5];
                            field796[var5++] = client.field534[var266].field3166;
                            continue;
                        }
                        if (var516 == 3910) {
                            var5--;
                            int var267 = field796[var5];
                            int var268 = client.field534[var267].method3731();
                            field796[var5++] = var268 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var516 == 3911) {
                            var5--;
                            int var269 = field796[var5];
                            int var270 = client.field534[var269].method3731();
                            field796[var5++] = var270 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var516 == 3912) {
                            var5--;
                            int var271 = field796[var5];
                            int var272 = client.field534[var271].method3731();
                            field796[var5++] = var272 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var516 == 3913) {
                            var5--;
                            int var273 = field796[var5];
                            int var274 = client.field534[var273].method3731();
                            field796[var5++] = var274 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var516 == 3914) {
                            var5--;
                            boolean var275 = field796[var5] == 1;
                            if (Statics.field42 != null) {
                                Statics.field42.method3747(class221.field3171, var275);
                            }
                            continue;
                        }
                        if (var516 == 3915) {
                            var5--;
                            boolean var276 = field796[var5] == 1;
                            if (Statics.field42 != null) {
                                Statics.field42.method3747(class221.field3169, var276);
                            }
                            continue;
                        }
                        if (var516 == 3916) {
                            var5 -= 2;
                            boolean var277 = field796[var5] == 1;
                            boolean var278 = field796[var5 + 1] == 1;
                            if (Statics.field42 != null) {
                                Statics.field42.method3747(new class22(var278), var277);
                            }
                            continue;
                        }
                        if (var516 == 3917) {
                            var5--;
                            boolean var279 = field796[var5] == 1;
                            if (Statics.field42 != null) {
                                Statics.field42.method3747(class221.field3168, var279);
                            }
                            continue;
                        }
                        if (var516 == 3918) {
                            var5--;
                            boolean var280 = field796[var5] == 1;
                            if (Statics.field42 != null) {
                                Statics.field42.method3747(class221.field3172, var280);
                            }
                            continue;
                        }
                        if (var516 == 3919) {
                            field796[var5++] = Statics.field42 == null ? 0 : Statics.field42.field3170.size();
                            continue;
                        }
                        if (var516 == 3920) {
                            var5--;
                            int var281 = field796[var5];
                            class214 var282 = (class214) Statics.field42.field3170.get(var281);
                            field796[var5++] = var282.field3142;
                            continue;
                        }
                        if (var516 == 3921) {
                            var5--;
                            int var283 = field796[var5];
                            class214 var284 = (class214) Statics.field42.field3170.get(var283);
                            field805[var6++] = var284.method3686();
                            continue;
                        }
                        if (var516 == 3922) {
                            var5--;
                            int var285 = field796[var5];
                            class214 var286 = (class214) Statics.field42.field3170.get(var285);
                            field805[var6++] = var286.method3685();
                            continue;
                        }
                        if (var516 == 3923) {
                            var5--;
                            int var287 = field796[var5];
                            class214 var288 = (class214) Statics.field42.field3170.get(var287);
                            long var289 = class115.method819() - Statics.field1591 - var288.field3141;
                            int var291 = (int) (var289 / 3600000L);
                            int var292 = (int) ((var289 - (long) (var291 * 3600000)) / 60000L);
                            int var293 = (int) ((var289 - (long) (var291 * 3600000) - (long) (var292 * 60000)) / 1000L);
                            String var294 = var291 + ":" + var292 / 10 + var292 % 10 + ":" + var293 / 10 + var293 % 10;
                            field805[var6++] = var294;
                            continue;
                        }
                        if (var516 == 3924) {
                            var5--;
                            int var295 = field796[var5];
                            class214 var296 = (class214) Statics.field42.field3170.get(var295);
                            field796[var5++] = var296.field3143.field3164;
                            continue;
                        }
                        if (var516 == 3925) {
                            var5--;
                            int var297 = field796[var5];
                            class214 var298 = (class214) Statics.field42.field3170.get(var297);
                            field796[var5++] = var298.field3143.field3162;
                            continue;
                        }
                        if (var516 == 3926) {
                            var5--;
                            int var299 = field796[var5];
                            class214 var300 = (class214) Statics.field42.field3170.get(var299);
                            field796[var5++] = var300.field3143.field3163;
                            continue;
                        }
                    } else if (var516 < 4100) {
                        if (var516 == 4000) {
                            var5 -= 2;
                            int var301 = field796[var5];
                            int var302 = field796[var5 + 1];
                            field796[var5++] = var301 + var302;
                            continue;
                        }
                        if (var516 == 4001) {
                            var5 -= 2;
                            int var303 = field796[var5];
                            int var304 = field796[var5 + 1];
                            field796[var5++] = var303 - var304;
                            continue;
                        }
                        if (var516 == 4002) {
                            var5 -= 2;
                            int var305 = field796[var5];
                            int var306 = field796[var5 + 1];
                            field796[var5++] = var305 * var306;
                            continue;
                        }
                        if (var516 == 4003) {
                            var5 -= 2;
                            int var307 = field796[var5];
                            int var308 = field796[var5 + 1];
                            field796[var5++] = var307 / var308;
                            continue;
                        }
                        if (var516 == 4004) {
                            var5--;
                            int var309 = field796[var5];
                            field796[var5++] = (int) (Math.random() * (double) var309);
                            continue;
                        }
                        if (var516 == 4005) {
                            var5--;
                            int var310 = field796[var5];
                            field796[var5++] = (int) (Math.random() * (double) (var310 + 1));
                            continue;
                        }
                        if (var516 == 4006) {
                            var5 -= 5;
                            int var311 = field796[var5];
                            int var312 = field796[var5 + 1];
                            int var313 = field796[var5 + 2];
                            int var314 = field796[var5 + 3];
                            int var315 = field796[var5 + 4];
                            field796[var5++] = (var312 - var311) * (var315 - var313) / (var314 - var313) + var311;
                            continue;
                        }
                        if (var516 == 4007) {
                            var5 -= 2;
                            int var316 = field796[var5];
                            int var317 = field796[var5 + 1];
                            field796[var5++] = var316 * var317 / 100 + var316;
                            continue;
                        }
                        if (var516 == 4008) {
                            var5 -= 2;
                            int var318 = field796[var5];
                            int var319 = field796[var5 + 1];
                            field796[var5++] = var318 | 0x1 << var319;
                            continue;
                        }
                        if (var516 == 4009) {
                            var5 -= 2;
                            int var320 = field796[var5];
                            int var321 = field796[var5 + 1];
                            field796[var5++] = var320 & -1 - (0x1 << var321);
                            continue;
                        }
                        if (var516 == 4010) {
                            var5 -= 2;
                            int var322 = field796[var5];
                            int var323 = field796[var5 + 1];
                            field796[var5++] = (var322 & 0x1 << var323) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var516 == 4011) {
                            var5 -= 2;
                            int var324 = field796[var5];
                            int var325 = field796[var5 + 1];
                            field796[var5++] = var324 % var325;
                            continue;
                        }
                        if (var516 == 4012) {
                            var5 -= 2;
                            int var326 = field796[var5];
                            int var327 = field796[var5 + 1];
                            if (var326 == 0) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = (int) Math.pow((double) var326, (double) var327);
                            }
                            continue;
                        }
                        if (var516 == 4013) {
                            var5 -= 2;
                            int var328 = field796[var5];
                            int var329 = field796[var5 + 1];
                            if (var328 == 0) {
                                field796[var5++] = 0;
                            } else if (var329 == 0) {
                                field796[var5++] = Integer.MAX_VALUE;
                            } else {
                                field796[var5++] = (int) Math.pow((double) var328, 1.0D / (double) var329);
                            }
                            continue;
                        }
                        if (var516 == 4014) {
                            var5 -= 2;
                            int var330 = field796[var5];
                            int var331 = field796[var5 + 1];
                            field796[var5++] = var330 & var331;
                            continue;
                        }
                        if (var516 == 4015) {
                            var5 -= 2;
                            int var332 = field796[var5];
                            int var333 = field796[var5 + 1];
                            field796[var5++] = var332 | var333;
                            continue;
                        }
                    } else if (var516 < 4200) {
                        if (var516 == 4100) {
                            var6--;
                            String var334 = field805[var6];
                            var5--;
                            int var335 = field796[var5];
                            field805[var6++] = var334 + var335;
                            continue;
                        }
                        if (var516 == 4101) {
                            var6 -= 2;
                            String var336 = field805[var6];
                            String var337 = field805[var6 + 1];
                            field805[var6++] = var336 + var337;
                            continue;
                        }
                        if (var516 == 4102) {
                            var6--;
                            String var338 = field805[var6];
                            var5--;
                            int var339 = field796[var5];
                            String[] var340 = field805;
                            int var341 = var6++;
                            String var343;
                            if (var339 < 0) {
                                var343 = Integer.toString(var339);
                            } else {
                                int var344 = var339;
                                String var345;
                                if (var339 < 0) {
                                    var345 = Integer.toString(var339, 10);
                                } else {
                                    int var346 = 2;
                                    int var347 = var339 / 10;
                                    while (var347 != 0) {
                                        var347 /= 10;
                                        var346++;
                                    }
                                    char[] var348 = new char[var346];
                                    var348[0] = '+';
                                    for (int var349 = var346 - 1; var349 > 0; var349--) {
                                        int var350 = var344;
                                        var344 /= 10;
                                        int var351 = var350 - var344 * 10;
                                        if (var351 >= 10) {
                                            var348[var349] = (char) (var351 + 87);
                                        } else {
                                            var348[var349] = (char) (var351 + 48);
                                        }
                                    }
                                    var345 = new String(var348);
                                }
                                var343 = var345;
                            }
                            var340[var341] = var338 + var343;
                            continue;
                        }
                        if (var516 == 4103) {
                            var6--;
                            String var352 = field805[var6];
                            field805[var6++] = var352.toLowerCase();
                            continue;
                        }
                        if (var516 == 4104) {
                            var5--;
                            int var353 = field796[var5];
                            long var354 = ((long) var353 + 11745L) * 86400000L;
                            field797.setTime(new Date(var354));
                            int var356 = field797.get(5);
                            int var357 = field797.get(2);
                            int var358 = field797.get(1);
                            field805[var6++] = var356 + "-" + field801[var357] + "-" + var358;
                            continue;
                        }
                        if (var516 == 4105) {
                            var6 -= 2;
                            String var359 = field805[var6];
                            String var360 = field805[var6 + 1];
                            if (Statics.field242.field32 != null && Statics.field242.field32.field2922) {
                                field805[var6++] = var360;
                                continue;
                            }
                            field805[var6++] = var359;
                            continue;
                        }
                        if (var516 == 4106) {
                            var5--;
                            int var361 = field796[var5];
                            field805[var6++] = Integer.toString(var361);
                            continue;
                        }
                        if (var516 == 4107) {
                            var6 -= 2;
                            int[] var362 = field796;
                            int var363 = var5++;
                            String var364 = field805[var6];
                            String var365 = field805[var6 + 1];
                            int var366 = client.field480;
                            int var367 = var364.length();
                            int var368 = var365.length();
                            int var369 = 0;
                            int var370 = 0;
                            char var371 = 0;
                            char var372 = 0;
                            int var373;
                            label2922: while (true) {
                                if (var369 - var371 >= var367 && var370 - var372 >= var368) {
                                    int var382 = Math.min(var367, var368);
                                    for (int var383 = 0; var383 < var382; var383++) {
                                        char var386 = var364.charAt(var383);
                                        char var387 = var365.charAt(var383);
                                        if (var386 != var387 && Character.toUpperCase(var386) != Character.toUpperCase(var387)) {
                                            char var388 = Character.toLowerCase(var386);
                                            char var389 = Character.toLowerCase(var387);
                                            if (var388 != var389) {
                                                var373 = class166.method642(var388, var366) - class166.method642(var389, var366);
                                                break label2922;
                                            }
                                        }
                                    }
                                    int var390 = var367 - var368;
                                    if (var390 == 0) {
                                        for (int var391 = 0; var391 < var382; var391++) {
                                            char var392 = var364.charAt(var391);
                                            char var393 = var365.charAt(var391);
                                            if (var392 != var393) {
                                                var373 = class166.method642(var392, var366) - class166.method642(var393, var366);
                                                break label2922;
                                            }
                                        }
                                        var373 = 0;
                                    } else {
                                        var373 = var390;
                                    }
                                    break;
                                }
                                if (var369 - var371 >= var367) {
                                    var373 = -1;
                                    break;
                                }
                                if (var370 - var372 >= var368) {
                                    var373 = 1;
                                    break;
                                }
                                char var374;
                                if (var371 == 0) {
                                    var374 = var364.charAt(var369++);
                                } else {
                                    var374 = var371;
                                    boolean var375 = false;
                                }
                                char var376;
                                if (var372 == 0) {
                                    var376 = var365.charAt(var370++);
                                } else {
                                    var376 = var372;
                                    boolean var377 = false;
                                }
                                var371 = class166.method2710(var374);
                                var372 = class166.method2710(var376);
                                char var378 = class166.method2278(var374, var366);
                                char var379 = class166.method2278(var376, var366);
                                if (var378 != var379 && Character.toUpperCase(var378) != Character.toUpperCase(var379)) {
                                    char var380 = Character.toLowerCase(var378);
                                    char var381 = Character.toLowerCase(var379);
                                    if (var380 != var381) {
                                        var373 = class166.method642(var380, var366) - class166.method642(var381, var366);
                                        break;
                                    }
                                }
                            }
                            byte var395;
                            if (var373 > 0) {
                                var395 = 1;
                            } else if (var373 < 0) {
                                var395 = -1;
                            } else {
                                var395 = 0;
                            }
                            var362[var363] = var395;
                            continue;
                        }
                        if (var516 == 4108) {
                            var6--;
                            String var396 = field805[var6];
                            var5 -= 2;
                            int var397 = field796[var5];
                            int var398 = field796[var5 + 1];
                            byte[] var399 = Statics.field807.method3082(var398, 0);
                            class224 var400 = new class224(var399);
                            field796[var5++] = var400.method3760(var396, var397);
                            continue;
                        }
                        if (var516 == 4109) {
                            var6--;
                            String var401 = field805[var6];
                            var5 -= 2;
                            int var402 = field796[var5];
                            int var403 = field796[var5 + 1];
                            byte[] var404 = Statics.field807.method3082(var403, 0);
                            class224 var405 = new class224(var404);
                            field796[var5++] = var405.method3759(var401, var402);
                            continue;
                        }
                        if (var516 == 4110) {
                            var6 -= 2;
                            String var406 = field805[var6];
                            String var407 = field805[var6 + 1];
                            var5--;
                            if (field796[var5] == 1) {
                                field805[var6++] = var406;
                            } else {
                                field805[var6++] = var407;
                            }
                            continue;
                        }
                        if (var516 == 4111) {
                            var6--;
                            String var408 = field805[var6];
                            field805[var6++] = class223.method3778(var408);
                            continue;
                        }
                        if (var516 == 4112) {
                            var6--;
                            String var409 = field805[var6];
                            var5--;
                            int var410 = field796[var5];
                            field805[var6++] = var409 + (char) var410;
                            continue;
                        }
                        if (var516 == 4113) {
                            var5--;
                            int var411 = field796[var5];
                            field796[var5++] = class163.method2928((char) var411) ? 1 : 0;
                            continue;
                        }
                        if (var516 == 4114) {
                            var5--;
                            int var412 = field796[var5];
                            field796[var5++] = class163.method3231((char) var412) ? 1 : 0;
                            continue;
                        }
                        if (var516 == 4115) {
                            var5--;
                            int var413 = field796[var5];
                            field796[var5++] = class163.method1190((char) var413) ? 1 : 0;
                            continue;
                        }
                        if (var516 == 4116) {
                            var5--;
                            int var414 = field796[var5];
                            int[] var415 = field796;
                            int var416 = var5++;
                            char var417 = (char) var414;
                            boolean var418 = var417 >= '0' && var417 <= '9';
                            var415[var416] = var418 ? 1 : 0;
                            continue;
                        }
                        if (var516 == 4117) {
                            var6--;
                            String var419 = field805[var6];
                            if (var419 == null) {
                                field796[var5++] = 0;
                            } else {
                                field796[var5++] = var419.length();
                            }
                            continue;
                        }
                        if (var516 == 4118) {
                            var6--;
                            String var420 = field805[var6];
                            var5 -= 2;
                            int var421 = field796[var5];
                            int var422 = field796[var5 + 1];
                            field805[var6++] = var420.substring(var421, var422);
                            continue;
                        }
                        if (var516 == 4119) {
                            var6--;
                            String var423 = field805[var6];
                            StringBuilder var424 = new StringBuilder(var423.length());
                            boolean var425 = false;
                            for (int var426 = 0; var426 < var423.length(); var426++) {
                                char var427 = var423.charAt(var426);
                                if (var427 == '<') {
                                    var425 = true;
                                } else if (var427 == '>') {
                                    var425 = false;
                                } else if (!var425) {
                                    var424.append(var427);
                                }
                            }
                            field805[var6++] = var424.toString();
                            continue;
                        }
                        if (var516 == 4120) {
                            var6--;
                            String var428 = field805[var6];
                            var5--;
                            int var429 = field796[var5];
                            field796[var5++] = var428.indexOf(var429);
                            continue;
                        }
                        if (var516 == 4121) {
                            var6 -= 2;
                            String var430 = field805[var6];
                            String var431 = field805[var6 + 1];
                            var5--;
                            int var432 = field796[var5];
                            field796[var5++] = var430.indexOf(var431, var432);
                            continue;
                        }
                    } else if (var516 < 4300) {
                        if (var516 == 4200) {
                            var5--;
                            int var433 = field796[var5];
                            field805[var6++] = class52.method36(var433).field1112;
                            continue;
                        }
                        if (var516 == 4201) {
                            var5 -= 2;
                            int var434 = field796[var5];
                            int var435 = field796[var5 + 1];
                            class52 var436 = class52.method36(var434);
                            if (var435 >= 1 && var435 <= 5 && var436.field1109[var435 - 1] != null) {
                                field805[var6++] = var436.field1109[var435 - 1];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var516 == 4202) {
                            var5 -= 2;
                            int var437 = field796[var5];
                            int var438 = field796[var5 + 1];
                            class52 var439 = class52.method36(var437);
                            if (var438 >= 1 && var438 <= 5 && var439.field1133[var438 - 1] != null) {
                                field805[var6++] = var439.field1133[var438 - 1];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var516 == 4203) {
                            var5--;
                            int var440 = field796[var5];
                            field796[var5++] = class52.method36(var440).field1143;
                            continue;
                        }
                        if (var516 == 4204) {
                            var5--;
                            int var441 = field796[var5];
                            field796[var5++] = class52.method36(var441).field1123 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var516 == 4205) {
                            var5--;
                            int var442 = field796[var5];
                            class52 var443 = class52.method36(var442);
                            if (var443.field1131 == -1 && var443.field1142 >= 0) {
                                field796[var5++] = var443.field1142;
                                continue;
                            }
                            field796[var5++] = var442;
                            continue;
                        }
                        if (var516 == 4206) {
                            var5--;
                            int var444 = field796[var5];
                            class52 var445 = class52.method36(var444);
                            if (var445.field1131 >= 0 && var445.field1142 >= 0) {
                                field796[var5++] = var445.field1142;
                                continue;
                            }
                            field796[var5++] = var444;
                            continue;
                        }
                        if (var516 == 4207) {
                            var5--;
                            int var446 = field796[var5];
                            field796[var5++] = class52.method36(var446).field1125 ? 1 : 0;
                            continue;
                        }
                        if (var516 == 4210) {
                            var6--;
                            String var447 = field805[var6];
                            var5--;
                            int var448 = field796[var5];
                            client.method2136(var447, var448 == 1);
                            field796[var5++] = Statics.field1376;
                            continue;
                        }
                        if (var516 == 4211) {
                            if (Statics.field2058 != null && Statics.field98 < Statics.field1376) {
                                field796[var5++] = Statics.field2058[++Statics.field98 - 1] & 0xFFFF;
                                continue;
                            }
                            field796[var5++] = -1;
                            continue;
                        }
                        if (var516 == 4212) {
                            Statics.field98 = 0;
                            continue;
                        }
                    } else if (var516 < 5100) {
                        if (var516 == 5000) {
                            field796[var5++] = client.field505;
                            continue;
                        }
                        if (var516 == 5001) {
                            var5 -= 3;
                            client.field505 = field796[var5];
                            int var449 = field796[var5 + 1];
                            class130[] var450 = new class130[] { class130.field2054, class130.field2053, class130.field2060 };
                            class130[] var451 = var450;
                            int var452 = 0;
                            class130 var454;
                            while (true) {
                                if (var452 >= var451.length) {
                                    var454 = null;
                                    break;
                                }
                                class130 var453 = var451[var452];
                                if (var453.field2056 == var449) {
                                    var454 = var453;
                                    break;
                                }
                                var452++;
                            }
                            Statics.field205 = var454;
                            if (Statics.field205 == null) {
                                Statics.field205 = class130.field2054;
                            }
                            client.field506 = field796[var5 + 2];
                            client.field332.method2599(120);
                            client.field332.method2398(client.field505);
                            client.field332.method2398(Statics.field205.field2056);
                            client.field332.method2398(client.field506);
                            continue;
                        }
                        if (var516 == 5002) {
                            var6--;
                            String var455 = field805[var6];
                            var5 -= 2;
                            int var456 = field796[var5];
                            int var457 = field796[var5 + 1];
                            client.field332.method2599(166);
                            client.field332.method2398(class119.method2931(var455) + 2);
                            client.field332.method2440(var455);
                            client.field332.method2398(var456 - 1);
                            client.field332.method2398(var457);
                            continue;
                        }
                        if (var516 == 5003) {
                            var5 -= 2;
                            int var458 = field796[var5];
                            int var459 = field796[var5 + 1];
                            class28 var460 = (class28) class12.field181.get(var458);
                            class36 var461 = var460.method624(var459);
                            if (var461 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = 0;
                                field805[var6++] = "";
                                field805[var6++] = "";
                                field805[var6++] = "";
                            } else {
                                field796[var5++] = var461.field788;
                                field796[var5++] = var461.field784;
                                field805[var6++] = var461.field789 == null ? "" : var461.field789;
                                field805[var6++] = var461.field787 == null ? "" : var461.field787;
                                field805[var6++] = var461.field786 == null ? "" : var461.field786;
                            }
                            continue;
                        }
                        if (var516 == 5004) {
                            var5--;
                            int var463 = field796[var5];
                            class36 var464 = class12.method49(var463);
                            if (var464 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = 0;
                                field805[var6++] = "";
                                field805[var6++] = "";
                                field805[var6++] = "";
                            } else {
                                field796[var5++] = var464.field785;
                                field796[var5++] = var464.field784;
                                field805[var6++] = var464.field789 == null ? "" : var464.field789;
                                field805[var6++] = var464.field787 == null ? "" : var464.field787;
                                field805[var6++] = var464.field786 == null ? "" : var464.field786;
                            }
                            continue;
                        }
                        if (var516 == 5005) {
                            if (Statics.field205 == null) {
                                field796[var5++] = -1;
                            } else {
                                field796[var5++] = Statics.field205.field2056;
                            }
                            continue;
                        }
                        if (var516 == 5008) {
                            var6--;
                            String var465 = field805[var6];
                            var5--;
                            int var466 = field796[var5];
                            String var467 = var465.toLowerCase();
                            byte var468 = 0;
                            if (var467.startsWith(class157.field2546)) {
                                var468 = 0;
                                var465 = var465.substring(class157.field2546.length());
                            } else if (var467.startsWith(class157.field2323)) {
                                var468 = 1;
                                var465 = var465.substring(class157.field2323.length());
                            } else if (var467.startsWith(class157.field2493)) {
                                var468 = 2;
                                var465 = var465.substring(class157.field2493.length());
                            } else if (var467.startsWith(class157.field2500)) {
                                var468 = 3;
                                var465 = var465.substring(class157.field2500.length());
                            } else if (var467.startsWith(class157.field2501)) {
                                var468 = 4;
                                var465 = var465.substring(class157.field2501.length());
                            } else if (var467.startsWith(class157.field2563)) {
                                var468 = 5;
                                var465 = var465.substring(class157.field2563.length());
                            } else if (var467.startsWith(class157.field2506)) {
                                var468 = 6;
                                var465 = var465.substring(class157.field2506.length());
                            } else if (var467.startsWith(class157.field2508)) {
                                var468 = 7;
                                var465 = var465.substring(class157.field2508.length());
                            } else if (var467.startsWith(class157.field2510)) {
                                var468 = 8;
                                var465 = var465.substring(class157.field2510.length());
                            } else if (var467.startsWith(class157.field2512)) {
                                var468 = 9;
                                var465 = var465.substring(class157.field2512.length());
                            } else if (var467.startsWith(class157.field2431)) {
                                var468 = 10;
                                var465 = var465.substring(class157.field2431.length());
                            } else if (var467.startsWith(class157.field2516)) {
                                var468 = 11;
                                var465 = var465.substring(class157.field2516.length());
                            } else if (client.field480 != 0) {
                                if (var467.startsWith(class157.field2593)) {
                                    var468 = 0;
                                    var465 = var465.substring(class157.field2593.length());
                                } else if (var467.startsWith(class157.field2497)) {
                                    var468 = 1;
                                    var465 = var465.substring(class157.field2497.length());
                                } else if (var467.startsWith(class157.field2499)) {
                                    var468 = 2;
                                    var465 = var465.substring(class157.field2499.length());
                                } else if (var467.startsWith(class157.field2383)) {
                                    var468 = 3;
                                    var465 = var465.substring(class157.field2383.length());
                                } else if (var467.startsWith(class157.field2503)) {
                                    var468 = 4;
                                    var465 = var465.substring(class157.field2503.length());
                                } else if (var467.startsWith(class157.field2376)) {
                                    var468 = 5;
                                    var465 = var465.substring(class157.field2376.length());
                                } else if (var467.startsWith(class157.field2539)) {
                                    var468 = 6;
                                    var465 = var465.substring(class157.field2539.length());
                                } else if (var467.startsWith(class157.field2509)) {
                                    var468 = 7;
                                    var465 = var465.substring(class157.field2509.length());
                                } else if (var467.startsWith(class157.field2511)) {
                                    var468 = 8;
                                    var465 = var465.substring(class157.field2511.length());
                                } else if (var467.startsWith(class157.field2513)) {
                                    var468 = 9;
                                    var465 = var465.substring(class157.field2513.length());
                                } else if (var467.startsWith(class157.field2515)) {
                                    var468 = 10;
                                    var465 = var465.substring(class157.field2515.length());
                                } else if (var467.startsWith(class157.field2517)) {
                                    var468 = 11;
                                    var465 = var465.substring(class157.field2517.length());
                                }
                            }
                            String var469 = var465.toLowerCase();
                            byte var470 = 0;
                            if (var469.startsWith(class157.field2518)) {
                                var470 = 1;
                                var465 = var465.substring(class157.field2518.length());
                            } else if (var469.startsWith(class157.field2402)) {
                                var470 = 2;
                                var465 = var465.substring(class157.field2402.length());
                            } else if (var469.startsWith(class157.field2522)) {
                                var470 = 3;
                                var465 = var465.substring(class157.field2522.length());
                            } else if (var469.startsWith(class157.field2346)) {
                                var470 = 4;
                                var465 = var465.substring(class157.field2346.length());
                            } else if (var469.startsWith(class157.field2526)) {
                                var470 = 5;
                                var465 = var465.substring(class157.field2526.length());
                            } else if (client.field480 != 0) {
                                if (var469.startsWith(class157.field2519)) {
                                    var470 = 1;
                                    var465 = var465.substring(class157.field2519.length());
                                } else if (var469.startsWith(class157.field2521)) {
                                    var470 = 2;
                                    var465 = var465.substring(class157.field2521.length());
                                } else if (var469.startsWith(class157.field2523)) {
                                    var470 = 3;
                                    var465 = var465.substring(class157.field2523.length());
                                } else if (var469.startsWith(class157.field2525)) {
                                    var470 = 4;
                                    var465 = var465.substring(class157.field2525.length());
                                } else if (var469.startsWith(class157.field2527)) {
                                    var470 = 5;
                                    var465 = var465.substring(class157.field2527.length());
                                }
                            }
                            client.field332.method2599(178);
                            client.field332.method2398(0);
                            int var471 = client.field332.field1984;
                            client.field332.method2398(var466);
                            client.field332.method2398(var468);
                            client.field332.method2398(var470);
                            class122 var472 = client.field332;
                            int var473 = var472.field1984;
                            byte[] var474 = class165.method875(var465);
                            var472.method2348(var474.length);
                            var472.field1984 += Statics.field3175.method2285(var474, 0, var474.length, var472.field1988, var472.field1984);
                            client.field332.method2347(client.field332.field1984 - var471);
                            continue;
                        }
                        if (var516 == 5009) {
                            var6 -= 2;
                            String var475 = field805[var6];
                            String var476 = field805[var6 + 1];
                            client.field332.method2599(112);
                            client.field332.method2336(0);
                            int var477 = client.field332.field1984;
                            client.field332.method2440(var475);
                            class122 var478 = client.field332;
                            int var479 = var478.field1984;
                            byte[] var480 = class165.method875(var476);
                            var478.method2348(var480.length);
                            var478.field1984 += Statics.field3175.method2285(var480, 0, var480.length, var478.field1988, var478.field1984);
                            client.field332.method2346(client.field332.field1984 - var477);
                            continue;
                        }
                        if (var516 == 5015) {
                            String var481;
                            if (Statics.field242 == null || Statics.field242.field36 == null) {
                                var481 = "";
                            } else {
                                var481 = Statics.field242.field36;
                            }
                            field805[var6++] = var481;
                            continue;
                        }
                        if (var516 == 5016) {
                            field796[var5++] = client.field506;
                            continue;
                        }
                        if (var516 == 5017) {
                            var5--;
                            int var482 = field796[var5];
                            field796[var5++] = class12.method725(var482);
                            continue;
                        }
                        if (var516 == 5018) {
                            var5--;
                            int var483 = field796[var5];
                            field796[var5++] = class12.method1956(var483);
                            continue;
                        }
                        if (var516 == 5019) {
                            var5--;
                            int var484 = field796[var5];
                            int[] var485 = field796;
                            int var486 = var5++;
                            class36 var487 = (class36) class12.field172.method3545((long) var484);
                            int var488;
                            if (var487 == null) {
                                var488 = -1;
                            } else if (class12.field171.field3100 == var487.field3104) {
                                var488 = -1;
                            } else {
                                var488 = ((class36) var487.field3104).field788;
                            }
                            var485[var486] = var488;
                            continue;
                        }
                        if (var516 == 5020) {
                            var6--;
                            String var489 = field805[var6];
                            Statics.method2(var489);
                            continue;
                        }
                        if (var516 == 5021) {
                            var6--;
                            client.field514 = field805[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var516 == 5022) {
                            field805[var6++] = client.field514;
                            continue;
                        }
                    }
                } else {
                    class173 var90;
                    if (var516 >= 2000) {
                        var516 -= 1000;
                        var5--;
                        var90 = class173.method2370(field796[var5]);
                    } else {
                        var90 = var62 ? Statics.field2263 : Statics.field3011;
                    }
                    if (var516 == 1300) {
                        var5--;
                        int var91 = field796[var5] - 1;
                        if (var91 >= 0 && var91 <= 9) {
                            var6--;
                            var90.method3189(var91, field805[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var516 == 1301) {
                        var5 -= 2;
                        int var92 = field796[var5];
                        int var93 = field796[var5 + 1];
                        var90.field2830 = class173.method913(var92, var93);
                        continue;
                    }
                    if (var516 == 1302) {
                        var5--;
                        var90.field2768 = field796[var5] == 1;
                        continue;
                    }
                    if (var516 == 1303) {
                        var5--;
                        var90.field2831 = field796[var5];
                        continue;
                    }
                    if (var516 == 1304) {
                        var5--;
                        var90.field2793 = field796[var5];
                        continue;
                    }
                    if (var516 == 1305) {
                        var6--;
                        var90.field2828 = field805[var6];
                        continue;
                    }
                    if (var516 == 1306) {
                        var6--;
                        var90.field2850 = field805[var6];
                        continue;
                    }
                    if (var516 == 1307) {
                        var90.field2802 = null;
                        continue;
                    }
                }
                if (var516 < 5400) {
                    if (var516 == 5306) {
                        int[] var490 = field796;
                        int var491 = var5++;
                        int var492 = client.field501 ? 2 : 1;
                        var490[var491] = var492;
                        continue;
                    }
                    if (var516 == 5307) {
                        var5--;
                        int var493 = field796[var5];
                        if (var493 != 1 && var493 != 2) {
                            continue;
                        }
                        client.field286 = 0L;
                        if (var493 >= 2) {
                            client.field501 = true;
                        } else {
                            client.field501 = false;
                        }
                        client.method558();
                        if (client.field475 >= 25) {
                            client.field332.method2599(158);
                            class122 var494 = client.field332;
                            int var495 = client.field501 ? 2 : 1;
                            var494.method2398(var495);
                            client.field332.method2336(Statics.field1957);
                            client.field332.method2336(Statics.field716);
                        }
                        class144.field2211 = true;
                        continue;
                    }
                    if (var516 == 5308) {
                        field796[var5++] = Statics.field666.field144;
                        continue;
                    }
                    if (var516 == 5309) {
                        var5--;
                        int var496 = field796[var5];
                        if (var496 == 1 || var496 == 2) {
                            Statics.field666.field144 = var496;
                            class9.method178();
                        }
                        continue;
                    }
                }
                if (var516 < 5600) {
                    if (var516 == 5504) {
                        var5 -= 2;
                        int var497 = field796[var5];
                        int var498 = field796[var5 + 1];
                        if (!client.field535) {
                            client.field373 = var497;
                            client.field374 = var498;
                        }
                        continue;
                    }
                    if (var516 == 5505) {
                        field796[var5++] = client.field373;
                        continue;
                    }
                    if (var516 == 5506) {
                        field796[var5++] = client.field374;
                        continue;
                    }
                    if (var516 == 5530) {
                        var5--;
                        int var499 = field796[var5];
                        if (var499 < 0) {
                            var499 = 0;
                        }
                        client.field379 = var499;
                        continue;
                    }
                    if (var516 == 5531) {
                        field796[var5++] = client.field379;
                        continue;
                    }
                }
                if (var516 >= 5700 || var516 != 5630) {
                    if (var516 < 6300) {
                        if (var516 == 6200) {
                            var5 -= 2;
                            client.field386 = (short) field796[var5];
                            if (client.field386 <= 0) {
                                client.field386 = 256;
                            }
                            client.field542 = (short) field796[var5 + 1];
                            if (client.field542 <= 0) {
                                client.field542 = 205;
                            }
                            continue;
                        }
                        if (var516 == 6201) {
                            var5 -= 2;
                            client.field543 = (short) field796[var5];
                            if (client.field543 <= 0) {
                                client.field543 = 256;
                            }
                            client.field544 = (short) field796[var5 + 1];
                            if (client.field544 <= 0) {
                                client.field544 = 320;
                            }
                            continue;
                        }
                        if (var516 == 6202) {
                            var5 -= 4;
                            client.field424 = (short) field796[var5];
                            if (client.field424 <= 0) {
                                client.field424 = 1;
                            }
                            client.field434 = (short) field796[var5 + 1];
                            if (client.field434 <= 0) {
                                client.field434 = 32767;
                            } else if (client.field434 < client.field424) {
                                client.field434 = client.field424;
                            }
                            client.field547 = (short) field796[var5 + 2];
                            if (client.field547 <= 0) {
                                client.field547 = 1;
                            }
                            client.field548 = (short) field796[var5 + 3];
                            if (client.field548 <= 0) {
                                client.field548 = 32767;
                            } else if (client.field548 < client.field547) {
                                client.field548 = client.field547;
                            }
                            continue;
                        }
                        if (var516 == 6203) {
                            if (client.field412 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = -1;
                            } else {
                                client.method2997(0, 0, client.field412.field2772, client.field412.field2773, false);
                                field796[var5++] = client.field459;
                                field796[var5++] = client.field552;
                            }
                            continue;
                        }
                        if (var516 == 6204) {
                            field796[var5++] = client.field543;
                            field796[var5++] = client.field544;
                            continue;
                        }
                        if (var516 == 6205) {
                            field796[var5++] = client.field386;
                            field796[var5++] = client.field542;
                            continue;
                        }
                    }
                    if (var516 < 6600) {
                        if (var516 == 6500) {
                            field796[var5++] = class26.method1157() ? 1 : 0;
                            continue;
                        }
                        if (var516 == 6501) {
                            class26 var500 = class26.method705();
                            if (var500 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = 0;
                                field805[var6++] = "";
                                field796[var5++] = 0;
                                field796[var5++] = 0;
                                field805[var6++] = "";
                            } else {
                                field796[var5++] = var500.field640;
                                field796[var5++] = var500.field632;
                                field805[var6++] = var500.field644;
                                field796[var5++] = var500.field631;
                                field796[var5++] = var500.field642;
                                field805[var6++] = var500.field643;
                            }
                            continue;
                        }
                        if (var516 == 6502) {
                            class26 var501;
                            if (class26.field637 < class26.field636) {
                                var501 = Statics.field638[++class26.field637 - 1];
                            } else {
                                var501 = null;
                            }
                            if (var501 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = 0;
                                field805[var6++] = "";
                                field796[var5++] = 0;
                                field796[var5++] = 0;
                                field805[var6++] = "";
                            } else {
                                field796[var5++] = var501.field640;
                                field796[var5++] = var501.field632;
                                field805[var6++] = var501.field644;
                                field796[var5++] = var501.field631;
                                field796[var5++] = var501.field642;
                                field805[var6++] = var501.field643;
                            }
                            continue;
                        }
                        if (var516 == 6506) {
                            var5--;
                            int var503 = field796[var5];
                            class26 var504 = null;
                            for (int var505 = 0; var505 < class26.field636; var505++) {
                                if (Statics.field638[var505].field640 == var503) {
                                    var504 = Statics.field638[var505];
                                    break;
                                }
                            }
                            if (var504 == null) {
                                field796[var5++] = -1;
                                field796[var5++] = 0;
                                field805[var6++] = "";
                                field796[var5++] = 0;
                                field796[var5++] = 0;
                                field805[var6++] = "";
                            } else {
                                field796[var5++] = var504.field640;
                                field796[var5++] = var504.field632;
                                field805[var6++] = var504.field644;
                                field796[var5++] = var504.field631;
                                field796[var5++] = var504.field642;
                                field805[var6++] = var504.field643;
                            }
                            continue;
                        }
                        if (var516 == 6507) {
                            var5 -= 4;
                            int var506 = field796[var5];
                            boolean var507 = field796[var5 + 1] == 1;
                            int var508 = field796[var5 + 2];
                            boolean var509 = field796[var5 + 3] == 1;
                            class26.method769(var506, var507, var508, var509);
                            continue;
                        }
                        if (var516 == 6511) {
                            var5--;
                            int var510 = field796[var5];
                            if (var510 >= 0 && var510 < class26.field636) {
                                class26 var511 = Statics.field638[var510];
                                field796[var5++] = var511.field640;
                                field796[var5++] = var511.field632;
                                field805[var6++] = var511.field644;
                                field796[var5++] = var511.field631;
                                field796[var5++] = var511.field642;
                                field805[var6++] = var511.field643;
                                continue;
                            }
                            field796[var5++] = -1;
                            field796[var5++] = 0;
                            field805[var6++] = "";
                            field796[var5++] = 0;
                            field796[var5++] = 0;
                            field805[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field345 = 250;
            }
        } catch (Exception var515) {
            StringBuilder var513 = new StringBuilder(30);
            var513.append("").append(var4.field3115).append(" ");
            for (int var514 = field798 - 1; var514 >= 0; var514--) {
                var513.append("").append(field799[var514].field211.field3115).append(" ");
            }
            var513.append("").append(var10);
            class148.method1777(var513.toString(), var515);
        }
    }

    @ObfuscatedName("cg.f(II)V")
    public static void method1952(int arg0) {
        if (arg0 == -1 || !class173.method2711(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2841[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2824 != null) {
                class1 var4 = new class1();
                var4.field4 = var3;
                var4.field13 = var3.field2824;
                method574(var4, 2000000);
            }
        }
    }
}
