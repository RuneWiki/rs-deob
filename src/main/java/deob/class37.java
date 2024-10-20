package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ah")
public class class37 {

    @ObfuscatedName("ah.m")
    public static int[] field801 = new int[5];

    @ObfuscatedName("ah.t")
    public static int[][] field802 = new int[5][5000];

    @ObfuscatedName("ah.j")
    public static int[] field803 = new int[1000];

    @ObfuscatedName("ah.n")
    public static String[] field804 = new String[1000];

    @ObfuscatedName("ah.l")
    public static int field810 = 0;

    @ObfuscatedName("ah.i")
    public static class15[] field806 = new class15[50];

    @ObfuscatedName("ah.o")
    public static Calendar field816 = Calendar.getInstance();

    @ObfuscatedName("ah.p")
    public static final String[] field798 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ah.b")
    public static int field807 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.f(Lf;I)V")
    public static void method179(class1 arg0) {
        method1067(arg0, 200000);
    }

    @ObfuscatedName("as.s(Lf;II)V")
    public static void method1067(class1 arg0, int arg1) {
        Object[] var2 = arg0.field9;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method624(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field599;
        int[] var9 = var4.field601;
        byte var10 = -1;
        field810 = 0;
        try {
            Statics.field799 = new int[var4.field609];
            int var11 = 0;
            Statics.field800 = new String[var4.field600];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field10;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2744;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2745;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2744;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2745;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field12;
                    }
                    Statics.field799[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field6;
                    }
                    Statics.field800[var12++] = var15;
                }
            }
            int var16 = 0;
            field807 = arg0.field5;
            label2960: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var450 = var8[var7];
                if (var450 < 100) {
                    if (var450 == 0) {
                        field803[var5++] = var9[var7];
                        continue;
                    }
                    if (var450 == 1) {
                        int var17 = var9[var7];
                        field803[var5++] = class176.field2900[var17];
                        continue;
                    }
                    if (var450 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2900[var18] = field803[var5];
                        client.method961(var18);
                        continue;
                    }
                    if (var450 == 3) {
                        field804[var6++] = var4.field602[var7];
                        continue;
                    }
                    if (var450 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var450 == 7) {
                        var5 -= 2;
                        if (field803[var5 + 1] != field803[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var450 == 8) {
                        var5 -= 2;
                        if (field803[var5 + 1] == field803[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var450 == 9) {
                        var5 -= 2;
                        if (field803[var5] < field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var450 == 10) {
                        var5 -= 2;
                        if (field803[var5] > field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var450 == 21) {
                        if (field810 == 0) {
                            return;
                        }
                        class15 var19 = field806[--field810];
                        var4 = var19.field216;
                        var8 = var4.field599;
                        var9 = var4.field601;
                        var7 = var19.field221;
                        Statics.field799 = var19.field215;
                        Statics.field800 = var19.field218;
                        continue;
                    }
                    if (var450 == 25) {
                        int var20 = var9[var7];
                        field803[var5++] = class176.method1774(var20);
                        continue;
                    }
                    if (var450 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class176.method2922(var21, field803[var5]);
                        continue;
                    }
                    if (var450 == 31) {
                        var5 -= 2;
                        if (field803[var5] <= field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var450 == 32) {
                        var5 -= 2;
                        if (field803[var5] >= field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var450 == 33) {
                        field803[var5++] = Statics.field799[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var450 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field799[var10001] = field803[var5];
                        continue;
                    }
                    if (var450 == 35) {
                        field804[var6++] = Statics.field800[var9[var7]];
                        continue;
                    }
                    if (var450 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field800[var10001] = field804[var6];
                        continue;
                    }
                    if (var450 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class163.method594(field804, var6, var22);
                        field804[var6++] = var23;
                        continue;
                    }
                    if (var450 == 38) {
                        var5--;
                        continue;
                    }
                    if (var450 == 39) {
                        var6--;
                        continue;
                    }
                    if (var450 == 40) {
                        int var24 = var9[var7];
                        class23 var25 = class23.method624(var24);
                        int[] var26 = new int[var25.field609];
                        String[] var27 = new String[var25.field600];
                        for (int var28 = 0; var28 < var25.field605; var28++) {
                            var26[var28] = field803[var5 - var25.field605 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field606; var29++) {
                            var27[var29] = field804[var6 - var25.field606 + var29];
                        }
                        var5 -= var25.field605;
                        var6 -= var25.field606;
                        class15 var30 = new class15();
                        var30.field216 = var4;
                        var30.field221 = var7;
                        var30.field215 = Statics.field799;
                        var30.field218 = Statics.field800;
                        field806[++field810 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field599;
                        var9 = var25.field601;
                        var7 = -1;
                        Statics.field799 = var26;
                        Statics.field800 = var27;
                        continue;
                    }
                    if (var450 == 42) {
                        field803[var5++] = Statics.field1048.method192(var9[var7]);
                        continue;
                    }
                    if (var450 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1048.method219(var10001, field803[var5]);
                        continue;
                    }
                    if (var450 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field803[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field801[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2960;
                                }
                                field802[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var450 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field803[var5];
                        if (var37 >= 0 && var37 < field801[var36]) {
                            field803[var5++] = field802[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var450 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field803[var5];
                        if (var39 >= 0 && var39 < field801[var38]) {
                            field802[var38][var39] = field803[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var450 == 47) {
                        String var40 = Statics.field1048.method199(var9[var7]);
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field804[var6++] = var40;
                        continue;
                    }
                    if (var450 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1048.method193(var10001, field804[var6]);
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var450 < 1000) {
                    if (var450 == 100) {
                        var5 -= 3;
                        int var42 = field803[var5];
                        int var43 = field803[var5 + 1];
                        int var44 = field803[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var45 = class173.method2297(var42);
                        if (var45.field2866 == null) {
                            var45.field2866 = new class173[var44 + 1];
                        }
                        if (var45.field2866.length <= var44) {
                            class173[] var46 = new class173[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2866.length; var47++) {
                                var46[var47] = var45.field2866[var47];
                            }
                            var45.field2866 = var46;
                        }
                        if (var44 > 0 && var45.field2866[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class173 var48 = new class173();
                        var48.field2746 = var43;
                        var48.field2831 = var48.field2744 = var45.field2744;
                        var48.field2745 = var44;
                        var48.field2743 = true;
                        var45.field2866[var44] = var48;
                        if (var41) {
                            Statics.field809 = var48;
                        } else {
                            Statics.field777 = var48;
                        }
                        Statics.method1777(var45);
                        continue;
                    }
                    if (var450 == 101) {
                        class173 var49 = var41 ? Statics.field809 : Statics.field777;
                        class173 var50 = class173.method2297(var49.field2744);
                        var50.field2866[var49.field2745] = null;
                        Statics.method1777(var50);
                        continue;
                    }
                    if (var450 == 102) {
                        var5--;
                        class173 var51 = class173.method2297(field803[var5]);
                        var51.field2866 = null;
                        Statics.method1777(var51);
                        continue;
                    }
                    if (var450 == 200) {
                        var5 -= 2;
                        int var52 = field803[var5];
                        int var53 = field803[var5 + 1];
                        class173 var54 = class173.method1498(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field803[var5++] = 1;
                            if (var41) {
                                Statics.field809 = var54;
                            } else {
                                Statics.field777 = var54;
                            }
                            continue;
                        }
                        field803[var5++] = 0;
                        continue;
                    }
                    if (var450 == 201) {
                        var5--;
                        class173 var55 = class173.method2297(field803[var5]);
                        if (var55 == null) {
                            field803[var5++] = 0;
                        } else {
                            field803[var5++] = 1;
                            if (var41) {
                                Statics.field809 = var55;
                            } else {
                                Statics.field777 = var55;
                            }
                        }
                        continue;
                    }
                } else if (var450 >= 1000 && var450 < 1100 || var450 >= 2000 && var450 < 2100) {
                    int var56 = -1;
                    class173 var57;
                    if (var450 >= 2000) {
                        var450 -= 1000;
                        var5--;
                        var56 = field803[var5];
                        var57 = class173.method2297(var56);
                    } else {
                        var57 = var41 ? Statics.field809 : Statics.field777;
                    }
                    if (var450 == 1000) {
                        var5 -= 4;
                        var57.field2870 = field803[var5];
                        var57.field2754 = field803[var5 + 1];
                        var57.field2749 = field803[var5 + 2];
                        var57.field2750 = field803[var5 + 3];
                        Statics.method1777(var57);
                        client.method959(var57);
                        if (var56 != -1 && var57.field2746 == 0) {
                            client.method2640(Statics.field2803[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var450 == 1001) {
                        var5 -= 4;
                        var57.field2755 = field803[var5];
                        var57.field2756 = field803[var5 + 1];
                        var57.field2751 = field803[var5 + 2];
                        var57.field2788 = field803[var5 + 3];
                        Statics.method1777(var57);
                        client.method959(var57);
                        if (var56 != -1 && var57.field2746 == 0) {
                            client.method2640(Statics.field2803[var56 >> 16], var57, false);
                        }
                        continue;
                    }
                    if (var450 == 1003) {
                        var5--;
                        boolean var58 = field803[var5] == 1;
                        if (var57.field2764 != var58) {
                            var57.field2764 = var58;
                            Statics.method1777(var57);
                        }
                        continue;
                    }
                    if (var450 == 1005) {
                        var5--;
                        var57.field2762 = field803[var5] == 1;
                        continue;
                    }
                    if (var450 == 1006) {
                        var5--;
                        var57.field2876 = field803[var5] == 1;
                        continue;
                    }
                } else if (var450 >= 1100 && var450 < 1200 || var450 >= 2100 && var450 < 2200) {
                    int var59 = -1;
                    class173 var60;
                    if (var450 >= 2000) {
                        var450 -= 1000;
                        var5--;
                        var59 = field803[var5];
                        var60 = class173.method2297(var59);
                    } else {
                        var60 = var41 ? Statics.field809 : Statics.field777;
                    }
                    if (var450 == 1100) {
                        var5 -= 2;
                        var60.field2765 = field803[var5];
                        if (var60.field2765 > var60.field2767 - var60.field2759) {
                            var60.field2765 = var60.field2767 - var60.field2759;
                        }
                        if (var60.field2765 < 0) {
                            var60.field2765 = 0;
                        }
                        var60.field2766 = field803[var5 + 1];
                        if (var60.field2766 > var60.field2768 - var60.field2782) {
                            var60.field2766 = var60.field2768 - var60.field2782;
                        }
                        if (var60.field2766 < 0) {
                            var60.field2766 = 0;
                        }
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1101) {
                        var5--;
                        var60.field2769 = field803[var5];
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1102) {
                        var5--;
                        var60.field2773 = field803[var5] == 1;
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1103) {
                        var5--;
                        var60.field2774 = field803[var5];
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1104) {
                        var5--;
                        var60.field2775 = field803[var5];
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1105) {
                        var5--;
                        var60.field2777 = field803[var5];
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1106) {
                        var5--;
                        var60.field2760 = field803[var5];
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1107) {
                        var5--;
                        var60.field2780 = field803[var5] == 1;
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1108) {
                        var60.field2785 = 1;
                        var5--;
                        var60.field2786 = field803[var5];
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1109) {
                        var5 -= 6;
                        var60.field2791 = field803[var5];
                        var60.field2792 = field803[var5 + 1];
                        var60.field2793 = field803[var5 + 2];
                        var60.field2794 = field803[var5 + 3];
                        var60.field2795 = field803[var5 + 4];
                        var60.field2796 = field803[var5 + 5];
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1110) {
                        var5--;
                        int var61 = field803[var5];
                        if (var60.field2789 != var61) {
                            var60.field2789 = var61;
                            var60.field2864 = 0;
                            var60.field2865 = 0;
                            Statics.method1777(var60);
                        }
                        continue;
                    }
                    if (var450 == 1111) {
                        var5--;
                        var60.field2799 = field803[var5] == 1;
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1112) {
                        var6--;
                        String var62 = field804[var6];
                        if (!var62.equals(var60.field2826)) {
                            var60.field2826 = var62;
                            Statics.method1777(var60);
                        }
                        continue;
                    }
                    if (var450 == 1113) {
                        var5--;
                        var60.field2801 = field803[var5];
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1114) {
                        var5 -= 3;
                        var60.field2805 = field803[var5];
                        var60.field2806 = field803[var5 + 1];
                        var60.field2812 = field803[var5 + 2];
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1115) {
                        var5--;
                        var60.field2862 = field803[var5] == 1;
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1116) {
                        var5--;
                        var60.field2828 = field803[var5];
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1117) {
                        var5--;
                        var60.field2739 = field803[var5];
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1118) {
                        var5--;
                        var60.field2859 = field803[var5] == 1;
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1119) {
                        var5--;
                        var60.field2784 = field803[var5] == 1;
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1120) {
                        var5 -= 2;
                        var60.field2767 = field803[var5];
                        var60.field2768 = field803[var5 + 1];
                        Statics.method1777(var60);
                        if (var59 != -1 && var60.field2746 == 0) {
                            client.method2640(Statics.field2803[var59 >> 16], var60, false);
                        }
                        continue;
                    }
                    if (var450 == 1121) {
                        client.method132(var60.field2744, var60.field2745);
                        client.field461 = var60;
                        Statics.method1777(var60);
                        continue;
                    }
                    if (var450 == 1122) {
                        var5--;
                        var60.field2778 = field803[var5];
                        Statics.method1777(var60);
                        continue;
                    }
                } else if (var450 >= 1200 && var450 < 1300 || var450 >= 2200 && var450 < 2300) {
                    class173 var63;
                    if (var450 >= 2000) {
                        var450 -= 1000;
                        var5--;
                        var63 = class173.method2297(field803[var5]);
                    } else {
                        var63 = var41 ? Statics.field809 : Statics.field777;
                    }
                    Statics.method1777(var63);
                    if (var450 == 1200 || var450 == 1205 || var450 == 1212) {
                        var5 -= 2;
                        int var64 = field803[var5];
                        int var65 = field803[var5 + 1];
                        var63.field2752 = var64;
                        var63.field2875 = var65;
                        class52 var66 = Statics.method975(var64);
                        var63.field2793 = var66.field1162;
                        var63.field2794 = var66.field1128;
                        var63.field2795 = var66.field1129;
                        var63.field2791 = var66.field1130;
                        var63.field2792 = var66.field1131;
                        var63.field2796 = var66.field1126;
                        if (var450 == 1205) {
                            var63.field2800 = 0;
                        } else if (var450 == 1212 | var66.field1109 == 1) {
                            var63.field2800 = 1;
                        } else {
                            var63.field2800 = 2;
                        }
                        if (var63.field2871 > 0) {
                            var63.field2796 = var63.field2796 * 32 / var63.field2871;
                        } else if (var63.field2755 > 0) {
                            var63.field2796 = var63.field2796 * 32 / var63.field2755;
                        }
                        continue;
                    }
                    if (var450 == 1201) {
                        var63.field2785 = 2;
                        var5--;
                        var63.field2786 = field803[var5];
                        continue;
                    }
                    if (var450 == 1202) {
                        var63.field2785 = 3;
                        var63.field2786 = Statics.field2054.field50.method3263();
                        continue;
                    }
                } else if ((var450 < 1300 || var450 >= 1400) && (var450 < 2300 || var450 >= 2400)) {
                    if (var450 >= 1400 && var450 < 1500 || var450 >= 2400 && var450 < 2500) {
                        class173 var71;
                        if (var450 >= 2000) {
                            var450 -= 1000;
                            var5--;
                            var71 = class173.method2297(field803[var5]);
                        } else {
                            var71 = var41 ? Statics.field809 : Statics.field777;
                        }
                        var6--;
                        String var72 = field804[var6];
                        int[] var73 = null;
                        if (var72.length() > 0 && var72.charAt(var72.length() - 1) == 'Y') {
                            var5--;
                            int var74 = field803[var5];
                            if (var74 > 0) {
                                var73 = new int[var74];
                                while (var74-- > 0) {
                                    var5--;
                                    var73[var74] = field803[var5];
                                }
                            }
                            var72 = var72.substring(0, var72.length() - 1);
                        }
                        Object[] var75 = new Object[var72.length() + 1];
                        for (int var76 = var75.length - 1; var76 >= 1; var76--) {
                            if (var72.charAt(var76 - 1) == 's') {
                                var6--;
                                var75[var76] = field804[var6];
                            } else {
                                var5--;
                                var75[var76] = Integer.valueOf(field803[var5]);
                            }
                        }
                        var5--;
                        int var77 = field803[var5];
                        if (var77 == -1) {
                            var75 = null;
                        } else {
                            var75[0] = Integer.valueOf(var77);
                        }
                        if (var450 == 1400) {
                            var71.field2824 = var75;
                        }
                        if (var450 == 1401) {
                            var71.field2827 = var75;
                        }
                        if (var450 == 1402) {
                            var71.field2804 = var75;
                        }
                        if (var450 == 1403) {
                            var71.field2757 = var75;
                        }
                        if (var450 == 1404) {
                            var71.field2770 = var75;
                        }
                        if (var450 == 1405) {
                            var71.field2848 = var75;
                        }
                        if (var450 == 1406) {
                            var71.field2834 = var75;
                        }
                        if (var450 == 1407) {
                            var71.field2843 = var75;
                            var71.field2735 = var73;
                        }
                        if (var450 == 1408) {
                            var71.field2841 = var75;
                        }
                        if (var450 == 1409) {
                            var71.field2832 = var75;
                        }
                        if (var450 == 1410) {
                            var71.field2863 = var75;
                        }
                        if (var450 == 1411) {
                            var71.field2825 = var75;
                        }
                        if (var450 == 1412) {
                            var71.field2829 = var75;
                        }
                        if (var450 == 1414) {
                            var71.field2837 = var75;
                            var71.field2838 = var73;
                        }
                        if (var450 == 1415) {
                            var71.field2851 = var75;
                            var71.field2840 = var73;
                        }
                        if (var450 == 1416) {
                            var71.field2833 = var75;
                        }
                        if (var450 == 1417) {
                            var71.field2779 = var75;
                        }
                        if (var450 == 1418) {
                            var71.field2844 = var75;
                        }
                        if (var450 == 1419) {
                            var71.field2781 = var75;
                        }
                        if (var450 == 1420) {
                            var71.field2811 = var75;
                        }
                        if (var450 == 1421) {
                            var71.field2847 = var75;
                        }
                        if (var450 == 1422) {
                            var71.field2845 = var75;
                        }
                        if (var450 == 1423) {
                            var71.field2849 = var75;
                        }
                        if (var450 == 1424) {
                            var71.field2816 = var75;
                        }
                        if (var450 == 1425) {
                            var71.field2852 = var75;
                        }
                        if (var450 == 1426) {
                            var71.field2874 = var75;
                        }
                        if (var450 == 1427) {
                            var71.field2820 = var75;
                        }
                        var71.field2822 = true;
                        continue;
                    }
                    if (var450 < 1600) {
                        class173 var78 = var41 ? Statics.field809 : Statics.field777;
                        if (var450 == 1500) {
                            field803[var5++] = var78.field2830;
                            continue;
                        }
                        if (var450 == 1501) {
                            field803[var5++] = var78.field2758;
                            continue;
                        }
                        if (var450 == 1502) {
                            field803[var5++] = var78.field2759;
                            continue;
                        }
                        if (var450 == 1503) {
                            field803[var5++] = var78.field2782;
                            continue;
                        }
                        if (var450 == 1504) {
                            field803[var5++] = var78.field2764 ? 1 : 0;
                            continue;
                        }
                        if (var450 == 1505) {
                            field803[var5++] = var78.field2831;
                            continue;
                        }
                    } else if (var450 < 1700) {
                        class173 var79 = var41 ? Statics.field809 : Statics.field777;
                        if (var450 == 1600) {
                            field803[var5++] = var79.field2765;
                            continue;
                        }
                        if (var450 == 1601) {
                            field803[var5++] = var79.field2766;
                            continue;
                        }
                        if (var450 == 1602) {
                            field804[var6++] = var79.field2826;
                            continue;
                        }
                        if (var450 == 1603) {
                            field803[var5++] = var79.field2767;
                            continue;
                        }
                        if (var450 == 1604) {
                            field803[var5++] = var79.field2768;
                            continue;
                        }
                        if (var450 == 1605) {
                            field803[var5++] = var79.field2796;
                            continue;
                        }
                        if (var450 == 1606) {
                            field803[var5++] = var79.field2793;
                            continue;
                        }
                        if (var450 == 1607) {
                            field803[var5++] = var79.field2795;
                            continue;
                        }
                        if (var450 == 1608) {
                            field803[var5++] = var79.field2794;
                            continue;
                        }
                        if (var450 == 1609) {
                            field803[var5++] = var79.field2774;
                            continue;
                        }
                    } else if (var450 < 1800) {
                        class173 var80 = var41 ? Statics.field809 : Statics.field777;
                        if (var450 == 1700) {
                            field803[var5++] = var80.field2752;
                            continue;
                        }
                        if (var450 == 1701) {
                            if (var80.field2752 == -1) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = var80.field2875;
                            }
                            continue;
                        }
                        if (var450 == 1702) {
                            field803[var5++] = var80.field2745;
                            continue;
                        }
                    } else if (var450 < 1900) {
                        class173 var81 = var41 ? Statics.field809 : Statics.field777;
                        if (var450 == 1800) {
                            field803[var5++] = class178.method2792(client.method1237(var81));
                            continue;
                        }
                        if (var450 == 1801) {
                            var5--;
                            int var82 = field803[var5];
                            int var451 = var82 - 1;
                            if (var81.field2839 != null && var451 < var81.field2839.length && var81.field2839[var451] != null) {
                                field804[var6++] = var81.field2839[var451];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var450 == 1802) {
                            if (var81.field2815 == null) {
                                field804[var6++] = "";
                            } else {
                                field804[var6++] = var81.field2815;
                            }
                            continue;
                        }
                    } else if (!(var450 < 1900 || var450 >= 2000) || !(var450 < 2900 || var450 >= 3000)) {
                        class173 var83;
                        if (var450 >= 2000) {
                            var450 -= 1000;
                            var5--;
                            var83 = class173.method2297(field803[var5]);
                        } else {
                            var83 = var41 ? Statics.field809 : Statics.field777;
                        }
                        if (var450 == 1927) {
                            if (field807 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var83.field2820 == null) {
                                return;
                            }
                            class1 var84 = new class1();
                            var84.field3 = var83;
                            var84.field9 = var83.field2820;
                            var84.field5 = field807 + 1;
                            client.field496.method3559(arg0);
                            continue;
                        }
                    } else if (var450 < 2600) {
                        var5--;
                        class173 var85 = class173.method2297(field803[var5]);
                        if (var450 == 2500) {
                            field803[var5++] = var85.field2830;
                            continue;
                        }
                        if (var450 == 2501) {
                            field803[var5++] = var85.field2758;
                            continue;
                        }
                        if (var450 == 2502) {
                            field803[var5++] = var85.field2759;
                            continue;
                        }
                        if (var450 == 2503) {
                            field803[var5++] = var85.field2782;
                            continue;
                        }
                        if (var450 == 2504) {
                            field803[var5++] = var85.field2764 ? 1 : 0;
                            continue;
                        }
                        if (var450 == 2505) {
                            field803[var5++] = var85.field2831;
                            continue;
                        }
                    } else if (var450 < 2700) {
                        var5--;
                        class173 var86 = class173.method2297(field803[var5]);
                        if (var450 == 2600) {
                            field803[var5++] = var86.field2765;
                            continue;
                        }
                        if (var450 == 2601) {
                            field803[var5++] = var86.field2766;
                            continue;
                        }
                        if (var450 == 2602) {
                            field804[var6++] = var86.field2826;
                            continue;
                        }
                        if (var450 == 2603) {
                            field803[var5++] = var86.field2767;
                            continue;
                        }
                        if (var450 == 2604) {
                            field803[var5++] = var86.field2768;
                            continue;
                        }
                        if (var450 == 2605) {
                            field803[var5++] = var86.field2796;
                            continue;
                        }
                        if (var450 == 2606) {
                            field803[var5++] = var86.field2793;
                            continue;
                        }
                        if (var450 == 2607) {
                            field803[var5++] = var86.field2795;
                            continue;
                        }
                        if (var450 == 2608) {
                            field803[var5++] = var86.field2794;
                            continue;
                        }
                        if (var450 == 2609) {
                            field803[var5++] = var86.field2774;
                            continue;
                        }
                    } else if (var450 < 2800) {
                        if (var450 == 2700) {
                            var5--;
                            class173 var87 = class173.method2297(field803[var5]);
                            field803[var5++] = var87.field2752;
                            continue;
                        }
                        if (var450 == 2701) {
                            var5--;
                            class173 var88 = class173.method2297(field803[var5]);
                            if (var88.field2752 == -1) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = var88.field2875;
                            }
                            continue;
                        }
                        if (var450 == 2702) {
                            var5--;
                            int var89 = field803[var5];
                            class4 var90 = (class4) client.field458.method3532((long) var89);
                            if (var90 == null) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = 1;
                            }
                            continue;
                        }
                        if (var450 == 2706) {
                            field803[var5++] = client.field457;
                            continue;
                        }
                    } else if (var450 < 2900) {
                        var5--;
                        class173 var91 = class173.method2297(field803[var5]);
                        if (var450 == 2800) {
                            field803[var5++] = class178.method2792(client.method1237(var91));
                            continue;
                        }
                        if (var450 == 2801) {
                            var5--;
                            int var92 = field803[var5];
                            int var452 = var92 - 1;
                            if (var91.field2839 != null && var452 < var91.field2839.length && var91.field2839[var452] != null) {
                                field804[var6++] = var91.field2839[var452];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var450 == 2802) {
                            if (var91.field2815 == null) {
                                field804[var6++] = "";
                            } else {
                                field804[var6++] = var91.field2815;
                            }
                            continue;
                        }
                    } else if (var450 < 3200) {
                        if (var450 == 3100) {
                            var6--;
                            String var93 = field804[var6];
                            class12.method3488(0, "", var93);
                            continue;
                        }
                        if (var450 == 3101) {
                            var5 -= 2;
                            client.method103(Statics.field2054, field803[var5], field803[var5 + 1]);
                            continue;
                        }
                        if (var450 == 3103) {
                            client.field493.method2617(237);
                            for (class4 var94 = (class4) client.field458.method3543(); var94 != null; var94 = (class4) client.field458.method3537()) {
                                if (var94.field58 == 0 || var94.field58 == 3) {
                                    client.method3227(var94, true);
                                }
                            }
                            if (client.field461 != null) {
                                Statics.method1777(client.field461);
                                client.field461 = null;
                            }
                            continue;
                        }
                        if (var450 == 3104) {
                            var6--;
                            String var95 = field804[var6];
                            int var96 = 0;
                            if (class163.method737(var95)) {
                                int var97 = class163.method2287(var95, 10, true);
                                var96 = var97;
                            }
                            client.field493.method2617(67);
                            client.field493.method2351(var96);
                            continue;
                        }
                        if (var450 == 3105) {
                            var6--;
                            String var98 = field804[var6];
                            client.field493.method2617(164);
                            client.field493.method2426(var98.length() + 1);
                            client.field493.method2354(var98);
                            continue;
                        }
                        if (var450 == 3106) {
                            var6--;
                            String var99 = field804[var6];
                            client.field493.method2617(55);
                            client.field493.method2426(var99.length() + 1);
                            client.field493.method2354(var99);
                            continue;
                        }
                        if (var450 == 3107) {
                            var5--;
                            int var100 = field803[var5];
                            var6--;
                            String var101 = field804[var6];
                            int var102 = class33.field751;
                            int[] var103 = class33.field752;
                            boolean var104 = false;
                            for (int var105 = 0; var105 < var102; var105++) {
                                class3 var106 = client.field296[var103[var105]];
                                if (var106 != null && Statics.field2054 != var106 && var106.field52 != null && var106.field52.equalsIgnoreCase(var101)) {
                                    if (var100 == 1) {
                                        client.field493.method2617(46);
                                        client.field493.method2402(0);
                                        client.field493.method2349(var103[var105]);
                                    } else if (var100 == 4) {
                                        client.field493.method2617(97);
                                        client.field493.method2392(0);
                                        client.field493.method2395(var103[var105]);
                                    } else if (var100 == 6) {
                                        client.field493.method2617(110);
                                        client.field493.method2426(0);
                                        client.field493.method2406(var103[var105]);
                                    } else if (var100 == 7) {
                                        client.field493.method2617(81);
                                        client.field493.method2406(var103[var105]);
                                        client.field493.method2392(0);
                                    }
                                    var104 = true;
                                    break;
                                }
                            }
                            if (!var104) {
                                class12.method3488(4, "", class157.field2445 + var101);
                            }
                            continue;
                        }
                        if (var450 == 3108) {
                            var5 -= 3;
                            int var107 = field803[var5];
                            int var108 = field803[var5 + 1];
                            int var109 = field803[var5 + 2];
                            class173 var110 = class173.method2297(var109);
                            client.method3177(var110, var107, var108);
                            continue;
                        }
                        if (var450 == 3109) {
                            var5 -= 2;
                            int var111 = field803[var5];
                            int var112 = field803[var5 + 1];
                            class173 var113 = var41 ? Statics.field809 : Statics.field777;
                            client.method3177(var113, var111, var112);
                            continue;
                        }
                        if (var450 == 3110) {
                            var5--;
                            Statics.field306 = field803[var5] == 1;
                            continue;
                        }
                        if (var450 == 3111) {
                            field803[var5++] = Statics.field2060.field153 ? 1 : 0;
                            continue;
                        }
                        if (var450 == 3112) {
                            var5--;
                            Statics.field2060.field153 = field803[var5] == 1;
                            class9.method1958();
                            continue;
                        }
                        if (var450 == 3113) {
                            var6--;
                            String var114 = field804[var6];
                            var5--;
                            boolean var115 = field803[var5] == 1;
                            class138.method149(var114, var115, false);
                            continue;
                        }
                        if (var450 == 3115) {
                            var5--;
                            int var116 = field803[var5];
                            client.field493.method2617(94);
                            client.field493.method2349(var116);
                            continue;
                        }
                        if (var450 == 3116) {
                            var5--;
                            int var117 = field803[var5];
                            var6 -= 2;
                            String var118 = field804[var6];
                            String var119 = field804[var6 + 1];
                            if (var118.length() <= 500 && var119.length() <= 500) {
                                client.field493.method2617(44);
                                client.field493.method2349(1 + class119.method1572(var118) + class119.method1572(var119));
                                client.field493.method2354(var118);
                                client.field493.method2354(var119);
                                client.field493.method2386(var117);
                            }
                            continue;
                        }
                    } else if (var450 < 3300) {
                        if (var450 == 3200) {
                            var5 -= 3;
                            int var120 = field803[var5];
                            int var121 = field803[var5 + 1];
                            int var122 = field803[var5 + 2];
                            if (client.field537 != 0 && var121 != 0 && client.field539 < 50) {
                                client.field540[client.field539] = var120;
                                client.field397[client.field539] = var121;
                                client.field542[client.field539] = var122;
                                client.field547[client.field539] = null;
                                client.field543[client.field539] = 0;
                                client.field539++;
                            }
                            continue;
                        }
                        if (var450 == 3201) {
                            var5--;
                            int var123 = field803[var5];
                            if (var123 == -1 && !client.field386) {
                                Statics.field3134.method3380();
                                class183.field2950 = 1;
                                Statics.field2947 = null;
                            } else if (var123 != -1 && client.field535 != var123 && client.field299 != 0 && !client.field386) {
                                class183.method1534(2, Statics.field108, var123, 0, client.field299, false);
                            }
                            client.field535 = var123;
                            continue;
                        }
                        if (var450 == 3202) {
                            var5 -= 2;
                            client.method2160(field803[var5], field803[var5 + 1]);
                            continue;
                        }
                    } else if (var450 < 3400) {
                        if (var450 == 3300) {
                            field803[var5++] = client.field577;
                            continue;
                        }
                        if (var450 == 3301) {
                            var5 -= 2;
                            int var124 = field803[var5];
                            int var125 = field803[var5 + 1];
                            field803[var5++] = class16.method1194(var124, var125);
                            continue;
                        }
                        if (var450 == 3302) {
                            var5 -= 2;
                            int var126 = field803[var5];
                            int var127 = field803[var5 + 1];
                            int[] var128 = field803;
                            int var129 = var5++;
                            class16 var130 = (class16) class16.field225.method3532((long) var126);
                            int var131;
                            if (var130 == null) {
                                var131 = 0;
                            } else if (var127 >= 0 && var127 < var130.field229.length) {
                                var131 = var130.field229[var127];
                            } else {
                                var131 = 0;
                            }
                            var128[var129] = var131;
                            continue;
                        }
                        if (var450 == 3303) {
                            var5 -= 2;
                            int var132 = field803[var5];
                            int var133 = field803[var5 + 1];
                            field803[var5++] = class16.method2235(var132, var133);
                            continue;
                        }
                        if (var450 == 3304) {
                            var5--;
                            int var134 = field803[var5];
                            int[] var135 = field803;
                            int var136 = var5++;
                            class51 var137 = (class51) class51.field1098.method3497((long) var134);
                            class51 var138;
                            if (var137 == null) {
                                byte[] var139 = Statics.field1106.method3038(5, var134);
                                class51 var140 = new class51();
                                if (var139 != null) {
                                    var140.method998(new class119(var139));
                                }
                                class51.field1098.method3508(var140, (long) var134);
                                var138 = var140;
                            } else {
                                var138 = var137;
                            }
                            var135[var136] = var138.field1102;
                            continue;
                        }
                        if (var450 == 3305) {
                            var5--;
                            int var141 = field803[var5];
                            field803[var5++] = client.field382[var141];
                            continue;
                        }
                        if (var450 == 3306) {
                            var5--;
                            int var142 = field803[var5];
                            field803[var5++] = client.field435[var142];
                            continue;
                        }
                        if (var450 == 3307) {
                            var5--;
                            int var143 = field803[var5];
                            field803[var5++] = client.field436[var143];
                            continue;
                        }
                        if (var450 == 3308) {
                            int var144 = Statics.field1961;
                            int var145 = (Statics.field2054.field828 >> 7) + Statics.field2576;
                            int var146 = (Statics.field2054.field818 >> 7) + Statics.field2133;
                            field803[var5++] = (var144 << 28) + (var145 << 14) + var146;
                            continue;
                        }
                        if (var450 == 3309) {
                            var5--;
                            int var147 = field803[var5];
                            field803[var5++] = var147 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var450 == 3310) {
                            var5--;
                            int var148 = field803[var5];
                            field803[var5++] = var148 >> 28;
                            continue;
                        }
                        if (var450 == 3311) {
                            var5--;
                            int var149 = field803[var5];
                            field803[var5++] = var149 & 0x3FFF;
                            continue;
                        }
                        if (var450 == 3312) {
                            field803[var5++] = client.field570 ? 1 : 0;
                            continue;
                        }
                        if (var450 == 3313) {
                            var5 -= 2;
                            int var150 = field803[var5] + 32768;
                            int var151 = field803[var5 + 1];
                            field803[var5++] = class16.method1194(var150, var151);
                            continue;
                        }
                        if (var450 == 3314) {
                            var5 -= 2;
                            int var152 = field803[var5] + 32768;
                            int var153 = field803[var5 + 1];
                            int[] var154 = field803;
                            int var155 = var5++;
                            class16 var156 = (class16) class16.field225.method3532((long) var152);
                            int var157;
                            if (var156 == null) {
                                var157 = 0;
                            } else if (var153 >= 0 && var153 < var156.field229.length) {
                                var157 = var156.field229[var153];
                            } else {
                                var157 = 0;
                            }
                            var154[var155] = var157;
                            continue;
                        }
                        if (var450 == 3315) {
                            var5 -= 2;
                            int var158 = field803[var5] + 32768;
                            int var159 = field803[var5 + 1];
                            field803[var5++] = class16.method2235(var158, var159);
                            continue;
                        }
                        if (var450 == 3316) {
                            if (client.field569 >= 2) {
                                field803[var5++] = client.field569;
                            } else {
                                field803[var5++] = 0;
                            }
                            continue;
                        }
                        if (var450 == 3317) {
                            field803[var5++] = client.field384;
                            continue;
                        }
                        if (var450 == 3318) {
                            field803[var5++] = client.field441;
                            continue;
                        }
                        if (var450 == 3321) {
                            field803[var5++] = client.field358;
                            continue;
                        }
                        if (var450 == 3322) {
                            field803[var5++] = client.field431;
                            continue;
                        }
                        if (var450 == 3323) {
                            if (client.field466) {
                                field803[var5++] = 1;
                            } else {
                                field803[var5++] = 0;
                            }
                            continue;
                        }
                        if (var450 == 3324) {
                            field803[var5++] = client.field398;
                            continue;
                        }
                    } else if (var450 < 3500) {
                        if (var450 == 3400) {
                            var5 -= 2;
                            int var160 = field803[var5];
                            int var161 = field803[var5 + 1];
                            class49 var162 = class49.method3700(var160);
                            if (var162.field1078 != 's') {
                            }
                            for (int var163 = 0; var163 < var162.field1081; var163++) {
                                if (var162.field1082[var163] == var161) {
                                    field804[var6++] = var162.field1084[var163];
                                    var162 = null;
                                    break;
                                }
                            }
                            if (var162 != null) {
                                field804[var6++] = var162.field1079;
                            }
                            continue;
                        }
                        if (var450 == 3408) {
                            var5 -= 4;
                            int var164 = field803[var5];
                            int var165 = field803[var5 + 1];
                            int var166 = field803[var5 + 2];
                            int var167 = field803[var5 + 3];
                            class49 var168 = class49.method3700(var166);
                            if (var168.field1076 == var164 && var168.field1078 == var165) {
                                for (int var169 = 0; var169 < var168.field1081; var169++) {
                                    if (var168.field1082[var169] == var167) {
                                        if (var165 == 115) {
                                            field804[var6++] = var168.field1084[var169];
                                        } else {
                                            field803[var5++] = var168.field1087[var169];
                                        }
                                        var168 = null;
                                        break;
                                    }
                                }
                                if (var168 != null) {
                                    if (var165 == 115) {
                                        field804[var6++] = var168.field1079;
                                    } else {
                                        field803[var5++] = var168.field1080;
                                    }
                                }
                                continue;
                            }
                            if (var165 == 115) {
                                field804[var6++] = "null";
                            } else {
                                field803[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var450 < 3700) {
                        if (var450 == 3600) {
                            if (client.field565 == 0) {
                                field803[var5++] = -2;
                            } else if (client.field565 == 1) {
                                field803[var5++] = -1;
                            } else {
                                field803[var5++] = client.field564;
                            }
                            continue;
                        }
                        if (var450 == 3601) {
                            var5--;
                            int var170 = field803[var5];
                            if (client.field565 == 2 && var170 < client.field564) {
                                field804[var6++] = client.field566[var170].field262;
                                field804[var6++] = client.field566[var170].field256;
                                continue;
                            }
                            field804[var6++] = "";
                            field804[var6++] = "";
                            continue;
                        }
                        if (var450 == 3602) {
                            var5--;
                            int var171 = field803[var5];
                            if (client.field565 == 2 && var171 < client.field564) {
                                field803[var5++] = client.field566[var171].field255;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var450 == 3603) {
                            var5--;
                            int var172 = field803[var5];
                            if (client.field565 == 2 && var172 < client.field564) {
                                field803[var5++] = client.field566[var172].field259;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var450 == 3604) {
                            var6--;
                            String var173 = field804[var6];
                            var5--;
                            int var174 = field803[var5];
                            client.method729(var173, var174);
                            continue;
                        }
                        if (var450 == 3605) {
                            var6--;
                            String var175 = field804[var6];
                            if (var175 == null) {
                                continue;
                            }
                            if ((client.field564 < 200 || client.field422 == 1) && client.field564 < 400) {
                                String var176 = class164.method2754(var175, Statics.field3198);
                                if (var176 == null) {
                                    continue;
                                }
                                for (int var177 = 0; var177 < client.field564; var177++) {
                                    class18 var178 = client.field566[var177];
                                    String var179 = class164.method2754(var178.field262, Statics.field3198);
                                    if (var179 != null && var179.equals(var176)) {
                                        class12.method3488(30, "", var175 + class157.field2463);
                                        continue label2960;
                                    }
                                    if (var178.field256 != null) {
                                        String var180 = class164.method2754(var178.field256, Statics.field3198);
                                        if (var180 != null && var180.equals(var176)) {
                                            class12.method3488(30, "", var175 + class157.field2463);
                                            continue label2960;
                                        }
                                    }
                                }
                                for (int var181 = 0; var181 < client.field568; var181++) {
                                    class8 var182 = client.field468[var181];
                                    String var183 = class164.method2754(var182.field142, Statics.field3198);
                                    if (var183 != null && var183.equals(var176)) {
                                        class12.method3488(30, "", class157.field2468 + var175 + class157.field2469);
                                        continue label2960;
                                    }
                                    if (var182.field134 != null) {
                                        String var184 = class164.method2754(var182.field134, Statics.field3198);
                                        if (var184 != null && var184.equals(var176)) {
                                            class12.method3488(30, "", class157.field2468 + var175 + class157.field2469);
                                            continue label2960;
                                        }
                                    }
                                }
                                if (class164.method2754(Statics.field2054.field52, Statics.field3198).equals(var176)) {
                                    class12.method3488(30, "", class157.field2466);
                                } else {
                                    client.field493.method2617(7);
                                    client.field493.method2426(class119.method1572(var175));
                                    client.field493.method2354(var175);
                                }
                                continue;
                            }
                            class12.method3488(30, "", class157.field2462);
                            continue;
                        }
                        if (var450 == 3606) {
                            var6--;
                            String var185 = field804[var6];
                            if (var185 == null) {
                                continue;
                            }
                            String var186 = class164.method2754(var185, Statics.field3198);
                            if (var186 == null) {
                                continue;
                            }
                            int var187 = 0;
                            while (true) {
                                if (var187 >= client.field564) {
                                    continue label2960;
                                }
                                class18 var188 = client.field566[var187];
                                String var189 = var188.field262;
                                String var190 = class164.method2754(var189, Statics.field3198);
                                if (class129.method1960(var185, var186, var189, var190)) {
                                    client.field564--;
                                    for (int var191 = var187; var191 < client.field564; var191++) {
                                        client.field566[var191] = client.field566[var191 + 1];
                                    }
                                    client.field487 = client.field302;
                                    client.field493.method2617(155);
                                    client.field493.method2426(class119.method1572(var185));
                                    client.field493.method2354(var185);
                                    continue label2960;
                                }
                                var187++;
                            }
                        }
                        if (var450 == 3607) {
                            var6--;
                            String var192 = field804[var6];
                            if (var192 == null) {
                                continue;
                            }
                            if ((client.field568 < 100 || client.field422 == 1) && client.field568 < 400) {
                                String var193 = class164.method2754(var192, Statics.field3198);
                                if (var193 == null) {
                                    continue;
                                }
                                for (int var194 = 0; var194 < client.field568; var194++) {
                                    class8 var195 = client.field468[var194];
                                    String var196 = class164.method2754(var195.field142, Statics.field3198);
                                    if (var196 != null && var196.equals(var193)) {
                                        class12.method3488(31, "", var192 + class157.field2465);
                                        continue label2960;
                                    }
                                    if (var195.field134 != null) {
                                        String var197 = class164.method2754(var195.field134, Statics.field3198);
                                        if (var197 != null && var197.equals(var193)) {
                                            class12.method3488(31, "", var192 + class157.field2465);
                                            continue label2960;
                                        }
                                    }
                                }
                                for (int var198 = 0; var198 < client.field564; var198++) {
                                    class18 var199 = client.field566[var198];
                                    String var200 = class164.method2754(var199.field262, Statics.field3198);
                                    if (var200 != null && var200.equals(var193)) {
                                        class12.method3488(31, "", class157.field2534 + var192 + class157.field2316);
                                        continue label2960;
                                    }
                                    if (var199.field256 != null) {
                                        String var201 = class164.method2754(var199.field256, Statics.field3198);
                                        if (var201 != null && var201.equals(var193)) {
                                            class12.method3488(31, "", class157.field2534 + var192 + class157.field2316);
                                            continue label2960;
                                        }
                                    }
                                }
                                if (class164.method2754(Statics.field2054.field52, Statics.field3198).equals(var193)) {
                                    class12.method3488(31, "", class157.field2467);
                                } else {
                                    client.field493.method2617(59);
                                    client.field493.method2426(class119.method1572(var192));
                                    client.field493.method2354(var192);
                                }
                                continue;
                            }
                            class12.method3488(31, "", class157.field2447);
                            continue;
                        }
                        if (var450 == 3608) {
                            var6--;
                            String var202 = field804[var6];
                            client.method2652(var202);
                            continue;
                        }
                        if (var450 == 3609) {
                            var6--;
                            String var203 = field804[var6];
                            class152[] var204 = new class152[] { class152.field2250, class152.field2248, class152.field2249, class152.field2246, class152.field2247 };
                            class152[] var205 = var204;
                            for (int var206 = 0; var206 < var205.length; var206++) {
                                class152 var207 = var205[var206];
                                if (var207.field2252 != -1) {
                                    int var209 = var207.field2252;
                                    String var210 = "<img=" + var209 + ">";
                                    if (var203.startsWith(var210)) {
                                        var203 = var203.substring(6 + Integer.toString(var207.field2252).length());
                                        break;
                                    }
                                }
                            }
                            field803[var5++] = client.method1785(var203, false) ? 1 : 0;
                            continue;
                        }
                        if (var450 == 3611) {
                            if (client.field524 == null) {
                                field804[var6++] = "";
                            } else {
                                String[] var211 = field804;
                                int var212 = var6++;
                                String var213 = client.field524;
                                String var214 = class162.method728(class162.method2302(var213));
                                if (var214 == null) {
                                    var214 = "";
                                }
                                var211[var212] = var214;
                            }
                            continue;
                        }
                        if (var450 == 3612) {
                            if (client.field524 == null) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = Statics.field245;
                            }
                            continue;
                        }
                        if (var450 == 3613) {
                            var5--;
                            int var216 = field803[var5];
                            if (client.field524 != null && var216 < Statics.field245) {
                                field804[var6++] = Statics.field2075[var216].field636;
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var450 == 3614) {
                            var5--;
                            int var217 = field803[var5];
                            if (client.field524 != null && var217 < Statics.field245) {
                                field803[var5++] = Statics.field2075[var217].field633;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var450 == 3615) {
                            var5--;
                            int var218 = field803[var5];
                            if (client.field524 != null && var218 < Statics.field245) {
                                field803[var5++] = Statics.field2075[var218].field634;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var450 == 3616) {
                            field803[var5++] = Statics.field1906;
                            continue;
                        }
                        if (var450 == 3617) {
                            var6--;
                            String var219 = field804[var6];
                            if (Statics.field2075 != null) {
                                client.field493.method2617(51);
                                client.field493.method2426(class119.method1572(var219));
                                client.field493.method2354(var219);
                            }
                            continue;
                        }
                        if (var450 == 3618) {
                            field803[var5++] = Statics.field1044;
                            continue;
                        }
                        if (var450 == 3619) {
                            var6--;
                            String var220 = field804[var6];
                            client.method3179(var220);
                            continue;
                        }
                        if (var450 == 3620) {
                            client.field493.method2617(38);
                            client.field493.method2426(0);
                            continue;
                        }
                        if (var450 == 3621) {
                            if (client.field565 == 0) {
                                field803[var5++] = -1;
                            } else {
                                field803[var5++] = client.field568;
                            }
                            continue;
                        }
                        if (var450 == 3622) {
                            var5--;
                            int var221 = field803[var5];
                            if (client.field565 != 0 && var221 < client.field568) {
                                field804[var6++] = client.field468[var221].field142;
                                field804[var6++] = client.field468[var221].field134;
                                continue;
                            }
                            field804[var6++] = "";
                            field804[var6++] = "";
                            continue;
                        }
                        if (var450 == 3623) {
                            String var222;
                            label2689: {
                                var6--;
                                var222 = field804[var6];
                                String var224 = "<img=0>";
                                if (!var222.startsWith(var224)) {
                                    String var226 = "<img=1>";
                                    if (!var222.startsWith(var226)) {
                                        break label2689;
                                    }
                                }
                                var222 = var222.substring(7);
                            }
                            field803[var5++] = client.method2149(var222) ? 1 : 0;
                            continue;
                        }
                        if (var450 == 3624) {
                            var5--;
                            int var227 = field803[var5];
                            if (Statics.field2075 != null && var227 < Statics.field245 && Statics.field2075[var227].field636.equalsIgnoreCase(Statics.field2054.field52)) {
                                field803[var5++] = 1;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var450 == 3625) {
                            if (client.field520 == null) {
                                field804[var6++] = "";
                            } else {
                                String[] var228 = field804;
                                int var229 = var6++;
                                String var230 = client.field520;
                                String var231 = class162.method728(class162.method2302(var230));
                                if (var231 == null) {
                                    var231 = "";
                                }
                                var228[var229] = var231;
                            }
                            continue;
                        }
                    } else if (var450 < 4000) {
                        if (var450 == 3903) {
                            var5--;
                            int var233 = field803[var5];
                            field803[var5++] = client.field573[var233].method3732();
                            continue;
                        }
                        if (var450 == 3904) {
                            var5--;
                            int var234 = field803[var5];
                            field803[var5++] = client.field573[var234].field3156;
                            continue;
                        }
                        if (var450 == 3905) {
                            var5--;
                            int var235 = field803[var5];
                            field803[var5++] = client.field573[var235].field3157;
                            continue;
                        }
                        if (var450 == 3906) {
                            var5--;
                            int var236 = field803[var5];
                            field803[var5++] = client.field573[var236].field3158;
                            continue;
                        }
                        if (var450 == 3907) {
                            var5--;
                            int var237 = field803[var5];
                            field803[var5++] = client.field573[var237].field3159;
                            continue;
                        }
                        if (var450 == 3908) {
                            var5--;
                            int var238 = field803[var5];
                            field803[var5++] = client.field573[var238].field3155;
                            continue;
                        }
                        if (var450 == 3910) {
                            var5--;
                            int var239 = field803[var5];
                            int var240 = client.field573[var239].method3737();
                            field803[var5++] = var240 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var450 == 3911) {
                            var5--;
                            int var241 = field803[var5];
                            int var242 = client.field573[var241].method3737();
                            field803[var5++] = var242 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var450 == 3912) {
                            var5--;
                            int var243 = field803[var5];
                            int var244 = client.field573[var243].method3737();
                            field803[var5++] = var244 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var450 == 3913) {
                            var5--;
                            int var245 = field803[var5];
                            int var246 = client.field573[var245].method3737();
                            field803[var5++] = var246 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var450 == 3914) {
                            var5--;
                            boolean var247 = field803[var5] == 1;
                            if (Statics.field161 != null) {
                                Statics.field161.method3754(class221.field3166, var247);
                            }
                            continue;
                        }
                        if (var450 == 3915) {
                            var5--;
                            boolean var248 = field803[var5] == 1;
                            if (Statics.field161 != null) {
                                Statics.field161.method3754(class221.field3163, var248);
                            }
                            continue;
                        }
                        if (var450 == 3916) {
                            var5 -= 2;
                            boolean var249 = field803[var5] == 1;
                            boolean var250 = field803[var5 + 1] == 1;
                            if (Statics.field161 != null) {
                                Statics.field161.method3754(new class22(var250), var249);
                            }
                            continue;
                        }
                        if (var450 == 3917) {
                            var5--;
                            boolean var251 = field803[var5] == 1;
                            if (Statics.field161 != null) {
                                Statics.field161.method3754(class221.field3164, var251);
                            }
                            continue;
                        }
                        if (var450 == 3918) {
                            var5--;
                            boolean var252 = field803[var5] == 1;
                            if (Statics.field161 != null) {
                                Statics.field161.method3754(class221.field3167, var252);
                            }
                            continue;
                        }
                        if (var450 == 3919) {
                            field803[var5++] = Statics.field161 == null ? 0 : Statics.field161.field3165.size();
                            continue;
                        }
                        if (var450 == 3920) {
                            var5--;
                            int var253 = field803[var5];
                            class214 var254 = (class214) Statics.field161.field3165.get(var253);
                            field803[var5++] = var254.field3139;
                            continue;
                        }
                        if (var450 == 3921) {
                            var5--;
                            int var255 = field803[var5];
                            class214 var256 = (class214) Statics.field161.field3165.get(var255);
                            field804[var6++] = var256.method3698();
                            continue;
                        }
                        if (var450 == 3922) {
                            var5--;
                            int var257 = field803[var5];
                            class214 var258 = (class214) Statics.field161.field3165.get(var257);
                            field804[var6++] = var258.method3694();
                            continue;
                        }
                        if (var450 == 3923) {
                            var5--;
                            int var259 = field803[var5];
                            class214 var260 = (class214) Statics.field161.field3165.get(var259);
                            long var261 = class115.method645() - Statics.field695 - var260.field3138;
                            int var263 = (int) (var261 / 3600000L);
                            int var264 = (int) ((var261 - (long) (var263 * 3600000)) / 60000L);
                            int var265 = (int) ((var261 - (long) (var263 * 3600000) - (long) (var264 * 60000)) / 1000L);
                            String var266 = var263 + ":" + var264 / 10 + var264 % 10 + ":" + var265 / 10 + var265 % 10;
                            field804[var6++] = var266;
                            continue;
                        }
                        if (var450 == 3924) {
                            var5--;
                            int var267 = field803[var5];
                            class214 var268 = (class214) Statics.field161.field3165.get(var267);
                            field803[var5++] = var268.field3137.field3158;
                            continue;
                        }
                        if (var450 == 3925) {
                            var5--;
                            int var269 = field803[var5];
                            class214 var270 = (class214) Statics.field161.field3165.get(var269);
                            field803[var5++] = var270.field3137.field3157;
                            continue;
                        }
                        if (var450 == 3926) {
                            var5--;
                            int var271 = field803[var5];
                            class214 var272 = (class214) Statics.field161.field3165.get(var271);
                            field803[var5++] = var272.field3137.field3156;
                            continue;
                        }
                    } else if (var450 < 4100) {
                        if (var450 == 4000) {
                            var5 -= 2;
                            int var273 = field803[var5];
                            int var274 = field803[var5 + 1];
                            field803[var5++] = var273 + var274;
                            continue;
                        }
                        if (var450 == 4001) {
                            var5 -= 2;
                            int var275 = field803[var5];
                            int var276 = field803[var5 + 1];
                            field803[var5++] = var275 - var276;
                            continue;
                        }
                        if (var450 == 4002) {
                            var5 -= 2;
                            int var277 = field803[var5];
                            int var278 = field803[var5 + 1];
                            field803[var5++] = var277 * var278;
                            continue;
                        }
                        if (var450 == 4003) {
                            var5 -= 2;
                            int var279 = field803[var5];
                            int var280 = field803[var5 + 1];
                            field803[var5++] = var279 / var280;
                            continue;
                        }
                        if (var450 == 4004) {
                            var5--;
                            int var281 = field803[var5];
                            field803[var5++] = (int) (Math.random() * (double) var281);
                            continue;
                        }
                        if (var450 == 4005) {
                            var5--;
                            int var282 = field803[var5];
                            field803[var5++] = (int) (Math.random() * (double) (var282 + 1));
                            continue;
                        }
                        if (var450 == 4006) {
                            var5 -= 5;
                            int var283 = field803[var5];
                            int var284 = field803[var5 + 1];
                            int var285 = field803[var5 + 2];
                            int var286 = field803[var5 + 3];
                            int var287 = field803[var5 + 4];
                            field803[var5++] = (var284 - var283) * (var287 - var285) / (var286 - var285) + var283;
                            continue;
                        }
                        if (var450 == 4007) {
                            var5 -= 2;
                            int var288 = field803[var5];
                            int var289 = field803[var5 + 1];
                            field803[var5++] = var288 * var289 / 100 + var288;
                            continue;
                        }
                        if (var450 == 4008) {
                            var5 -= 2;
                            int var290 = field803[var5];
                            int var291 = field803[var5 + 1];
                            field803[var5++] = var290 | 0x1 << var291;
                            continue;
                        }
                        if (var450 == 4009) {
                            var5 -= 2;
                            int var292 = field803[var5];
                            int var293 = field803[var5 + 1];
                            field803[var5++] = var292 & -1 - (0x1 << var293);
                            continue;
                        }
                        if (var450 == 4010) {
                            var5 -= 2;
                            int var294 = field803[var5];
                            int var295 = field803[var5 + 1];
                            field803[var5++] = (var294 & 0x1 << var295) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var450 == 4011) {
                            var5 -= 2;
                            int var296 = field803[var5];
                            int var297 = field803[var5 + 1];
                            field803[var5++] = var296 % var297;
                            continue;
                        }
                        if (var450 == 4012) {
                            var5 -= 2;
                            int var298 = field803[var5];
                            int var299 = field803[var5 + 1];
                            if (var298 == 0) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = (int) Math.pow((double) var298, (double) var299);
                            }
                            continue;
                        }
                        if (var450 == 4013) {
                            var5 -= 2;
                            int var300 = field803[var5];
                            int var301 = field803[var5 + 1];
                            if (var300 == 0) {
                                field803[var5++] = 0;
                            } else if (var301 == 0) {
                                field803[var5++] = Integer.MAX_VALUE;
                            } else {
                                field803[var5++] = (int) Math.pow((double) var300, 1.0D / (double) var301);
                            }
                            continue;
                        }
                        if (var450 == 4014) {
                            var5 -= 2;
                            int var302 = field803[var5];
                            int var303 = field803[var5 + 1];
                            field803[var5++] = var302 & var303;
                            continue;
                        }
                        if (var450 == 4015) {
                            var5 -= 2;
                            int var304 = field803[var5];
                            int var305 = field803[var5 + 1];
                            field803[var5++] = var304 | var305;
                            continue;
                        }
                    } else if (var450 < 4200) {
                        if (var450 == 4100) {
                            var6--;
                            String var306 = field804[var6];
                            var5--;
                            int var307 = field803[var5];
                            field804[var6++] = var306 + var307;
                            continue;
                        }
                        if (var450 == 4101) {
                            var6 -= 2;
                            String var308 = field804[var6];
                            String var309 = field804[var6 + 1];
                            field804[var6++] = var308 + var309;
                            continue;
                        }
                        if (var450 == 4102) {
                            var6--;
                            String var310 = field804[var6];
                            var5--;
                            int var311 = field803[var5];
                            field804[var6++] = var310 + class163.method13(var311, true);
                            continue;
                        }
                        if (var450 == 4103) {
                            var6--;
                            String var312 = field804[var6];
                            field804[var6++] = var312.toLowerCase();
                            continue;
                        }
                        if (var450 == 4104) {
                            var5--;
                            int var313 = field803[var5];
                            long var314 = ((long) var313 + 11745L) * 86400000L;
                            field816.setTime(new Date(var314));
                            int var316 = field816.get(5);
                            int var317 = field816.get(2);
                            int var318 = field816.get(1);
                            field804[var6++] = var316 + "-" + field798[var317] + "-" + var318;
                            continue;
                        }
                        if (var450 == 4105) {
                            var6 -= 2;
                            String var319 = field804[var6];
                            String var320 = field804[var6 + 1];
                            if (Statics.field2054.field50 != null && Statics.field2054.field50.field2910) {
                                field804[var6++] = var320;
                                continue;
                            }
                            field804[var6++] = var319;
                            continue;
                        }
                        if (var450 == 4106) {
                            var5--;
                            int var321 = field803[var5];
                            field804[var6++] = Integer.toString(var321);
                            continue;
                        }
                        if (var450 == 4107) {
                            var6 -= 2;
                            field803[var5++] = class163.method941(class166.method2793(field804[var6], field804[var6 + 1], client.field304));
                            continue;
                        }
                        if (var450 == 4108) {
                            var6--;
                            String var322 = field804[var6];
                            var5 -= 2;
                            int var323 = field803[var5];
                            int var324 = field803[var5 + 1];
                            byte[] var325 = Statics.field129.method3038(var324, 0);
                            class224 var326 = new class224(var325);
                            field803[var5++] = var326.method3813(var322, var323);
                            continue;
                        }
                        if (var450 == 4109) {
                            var6--;
                            String var327 = field804[var6];
                            var5 -= 2;
                            int var328 = field803[var5];
                            int var329 = field803[var5 + 1];
                            byte[] var330 = Statics.field129.method3038(var329, 0);
                            class224 var331 = new class224(var330);
                            field803[var5++] = var331.method3766(var327, var328);
                            continue;
                        }
                        if (var450 == 4110) {
                            var6 -= 2;
                            String var332 = field804[var6];
                            String var333 = field804[var6 + 1];
                            var5--;
                            if (field803[var5] == 1) {
                                field804[var6++] = var332;
                            } else {
                                field804[var6++] = var333;
                            }
                            continue;
                        }
                        if (var450 == 4111) {
                            var6--;
                            String var334 = field804[var6];
                            field804[var6++] = class223.method3774(var334);
                            continue;
                        }
                        if (var450 == 4112) {
                            var6--;
                            String var335 = field804[var6];
                            var5--;
                            int var336 = field803[var5];
                            field804[var6++] = var335 + (char) var336;
                            continue;
                        }
                        if (var450 == 4113) {
                            var5--;
                            int var337 = field803[var5];
                            field803[var5++] = class163.method2931((char) var337) ? 1 : 0;
                            continue;
                        }
                        if (var450 == 4114) {
                            var5--;
                            int var338 = field803[var5];
                            int[] var339 = field803;
                            int var340 = var5++;
                            char var341 = (char) var338;
                            boolean var342 = var341 >= '0' && var341 <= '9' || var341 >= 'A' && var341 <= 'Z' || var341 >= 'a' && var341 <= 'z';
                            var339[var340] = var342 ? 1 : 0;
                            continue;
                        }
                        if (var450 == 4115) {
                            var5--;
                            int var343 = field803[var5];
                            field803[var5++] = class163.method158((char) var343) ? 1 : 0;
                            continue;
                        }
                        if (var450 == 4116) {
                            var5--;
                            int var344 = field803[var5];
                            field803[var5++] = class163.method1575((char) var344) ? 1 : 0;
                            continue;
                        }
                        if (var450 == 4117) {
                            var6--;
                            String var345 = field804[var6];
                            if (var345 == null) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = var345.length();
                            }
                            continue;
                        }
                        if (var450 == 4118) {
                            var6--;
                            String var346 = field804[var6];
                            var5 -= 2;
                            int var347 = field803[var5];
                            int var348 = field803[var5 + 1];
                            field804[var6++] = var346.substring(var347, var348);
                            continue;
                        }
                        if (var450 == 4119) {
                            var6--;
                            String var349 = field804[var6];
                            StringBuilder var350 = new StringBuilder(var349.length());
                            boolean var351 = false;
                            for (int var352 = 0; var352 < var349.length(); var352++) {
                                char var353 = var349.charAt(var352);
                                if (var353 == '<') {
                                    var351 = true;
                                } else if (var353 == '>') {
                                    var351 = false;
                                } else if (!var351) {
                                    var350.append(var353);
                                }
                            }
                            field804[var6++] = var350.toString();
                            continue;
                        }
                        if (var450 == 4120) {
                            var6--;
                            String var354 = field804[var6];
                            var5--;
                            int var355 = field803[var5];
                            field803[var5++] = var354.indexOf(var355);
                            continue;
                        }
                        if (var450 == 4121) {
                            var6 -= 2;
                            String var356 = field804[var6];
                            String var357 = field804[var6 + 1];
                            var5--;
                            int var358 = field803[var5];
                            field803[var5++] = var356.indexOf(var357, var358);
                            continue;
                        }
                    } else if (var450 < 4300) {
                        if (var450 == 4200) {
                            var5--;
                            int var359 = field803[var5];
                            field804[var6++] = Statics.method975(var359).field1117;
                            continue;
                        }
                        if (var450 == 4201) {
                            var5 -= 2;
                            int var360 = field803[var5];
                            int var361 = field803[var5 + 1];
                            class52 var362 = Statics.method975(var360);
                            if (var361 >= 1 && var361 <= 5 && var362.field1135[var361 - 1] != null) {
                                field804[var6++] = var362.field1135[var361 - 1];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var450 == 4202) {
                            var5 -= 2;
                            int var363 = field803[var5];
                            int var364 = field803[var5 + 1];
                            class52 var365 = Statics.method975(var363);
                            if (var364 >= 1 && var364 <= 5 && var365.field1127[var364 - 1] != null) {
                                field804[var6++] = var365.field1127[var364 - 1];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var450 == 4203) {
                            var5--;
                            int var366 = field803[var5];
                            field803[var5++] = Statics.method975(var366).field1133;
                            continue;
                        }
                        if (var450 == 4204) {
                            var5--;
                            int var367 = field803[var5];
                            field803[var5++] = Statics.method975(var367).field1109 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var450 == 4205) {
                            var5--;
                            int var368 = field803[var5];
                            class52 var369 = Statics.method975(var368);
                            if (var369.field1160 == -1 && var369.field1151 >= 0) {
                                field803[var5++] = var369.field1151;
                                continue;
                            }
                            field803[var5++] = var368;
                            continue;
                        }
                        if (var450 == 4206) {
                            var5--;
                            int var370 = field803[var5];
                            class52 var371 = Statics.method975(var370);
                            if (var371.field1160 >= 0 && var371.field1151 >= 0) {
                                field803[var5++] = var371.field1151;
                                continue;
                            }
                            field803[var5++] = var370;
                            continue;
                        }
                        if (var450 == 4207) {
                            var5--;
                            int var372 = field803[var5];
                            field803[var5++] = Statics.method975(var372).field1134 ? 1 : 0;
                            continue;
                        }
                        if (var450 == 4210) {
                            var6--;
                            String var373 = field804[var6];
                            var5--;
                            int var374 = field803[var5];
                            boolean var376 = var374 == 1;
                            String var377 = var373.toLowerCase();
                            short[] var378 = new short[16];
                            int var379 = 0;
                            int var380 = 0;
                            while (true) {
                                if (var380 >= Statics.field1114) {
                                    Statics.field24 = var378;
                                    Statics.field74 = 0;
                                    Statics.field97 = var379;
                                    String[] var384 = new String[Statics.field97];
                                    for (int var385 = 0; var385 < Statics.field97; var385++) {
                                        var384[var385] = Statics.method975(var378[var385]).field1117;
                                    }
                                    short[] var386 = Statics.field24;
                                    class124.method2300(var384, var386, 0, var384.length - 1);
                                    break;
                                }
                                class52 var381 = Statics.method975(var380);
                                if ((!var376 || var381.field1123) && var381.field1160 == -1 && var381.field1117.toLowerCase().indexOf(var377) != -1) {
                                    if (var379 >= 250) {
                                        Statics.field97 = -1;
                                        Statics.field24 = null;
                                        break;
                                    }
                                    if (var379 >= var378.length) {
                                        short[] var382 = new short[var378.length * 2];
                                        for (int var383 = 0; var383 < var379; var383++) {
                                            var382[var383] = var378[var383];
                                        }
                                        var378 = var382;
                                    }
                                    var378[var379++] = (short) var380;
                                }
                                var380++;
                            }
                            field803[var5++] = Statics.field97;
                            continue;
                        }
                        if (var450 == 4211) {
                            if (Statics.field24 != null && Statics.field74 < Statics.field97) {
                                field803[var5++] = Statics.field24[++Statics.field74 - 1] & 0xFFFF;
                                continue;
                            }
                            field803[var5++] = -1;
                            continue;
                        }
                        if (var450 == 4212) {
                            Statics.field74 = 0;
                            continue;
                        }
                    } else if (var450 < 5100) {
                        if (var450 == 5000) {
                            field803[var5++] = client.field415;
                            continue;
                        }
                        if (var450 == 5001) {
                            var5 -= 3;
                            client.field415 = field803[var5];
                            int var387 = field803[var5 + 1];
                            class130[] var388 = new class130[] { class130.field2064, class130.field2063, class130.field2067 };
                            class130[] var389 = var388;
                            int var390 = 0;
                            class130 var392;
                            while (true) {
                                if (var390 >= var389.length) {
                                    var392 = null;
                                    break;
                                }
                                class130 var391 = var389[var390];
                                if (var391.field2066 == var387) {
                                    var392 = var391;
                                    break;
                                }
                                var390++;
                            }
                            Statics.field132 = var392;
                            if (Statics.field132 == null) {
                                Statics.field132 = class130.field2064;
                            }
                            client.field438 = field803[var5 + 2];
                            client.field493.method2617(147);
                            client.field493.method2426(client.field415);
                            client.field493.method2426(Statics.field132.field2066);
                            client.field493.method2426(client.field438);
                            continue;
                        }
                        if (var450 == 5002) {
                            var6--;
                            String var393 = field804[var6];
                            var5 -= 2;
                            int var394 = field803[var5];
                            int var395 = field803[var5 + 1];
                            client.field493.method2617(223);
                            client.field493.method2426(class119.method1572(var393) + 2);
                            client.field493.method2354(var393);
                            client.field493.method2426(var394 - 1);
                            client.field493.method2426(var395);
                            continue;
                        }
                        if (var450 == 5003) {
                            var5 -= 2;
                            int var396 = field803[var5];
                            int var397 = field803[var5 + 1];
                            class36 var398 = class12.method3(var396, var397);
                            if (var398 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                                field804[var6++] = "";
                                field804[var6++] = "";
                            } else {
                                field803[var5++] = var398.field796;
                                field803[var5++] = var398.field792;
                                field804[var6++] = var398.field795 == null ? "" : var398.field795;
                                field804[var6++] = var398.field793 == null ? "" : var398.field793;
                                field804[var6++] = var398.field797 == null ? "" : var398.field797;
                            }
                            continue;
                        }
                        if (var450 == 5004) {
                            var5--;
                            int var399 = field803[var5];
                            class36 var400 = (class36) class12.field183.method3548((long) var399);
                            if (var400 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                                field804[var6++] = "";
                                field804[var6++] = "";
                            } else {
                                field803[var5++] = var400.field794;
                                field803[var5++] = var400.field792;
                                field804[var6++] = var400.field795 == null ? "" : var400.field795;
                                field804[var6++] = var400.field793 == null ? "" : var400.field793;
                                field804[var6++] = var400.field797 == null ? "" : var400.field797;
                            }
                            continue;
                        }
                        if (var450 == 5005) {
                            if (Statics.field132 == null) {
                                field803[var5++] = -1;
                            } else {
                                field803[var5++] = Statics.field132.field2066;
                            }
                            continue;
                        }
                        if (var450 == 5008) {
                            var6--;
                            String var402 = field804[var6];
                            var5--;
                            int var403 = field803[var5];
                            String var404 = var402.toLowerCase();
                            byte var405 = 0;
                            if (var404.startsWith(class157.field2359)) {
                                var405 = 0;
                                var402 = var402.substring(class157.field2359.length());
                            } else if (var404.startsWith(class157.field2357)) {
                                var405 = 1;
                                var402 = var402.substring(class157.field2357.length());
                            } else if (var404.startsWith(class157.field2569)) {
                                var405 = 2;
                                var402 = var402.substring(class157.field2569.length());
                            } else if (var404.startsWith(class157.field2478)) {
                                var405 = 3;
                                var402 = var402.substring(class157.field2478.length());
                            } else if (var404.startsWith(class157.field2520)) {
                                var405 = 4;
                                var402 = var402.substring(class157.field2520.length());
                            } else if (var404.startsWith(class157.field2482)) {
                                var405 = 5;
                                var402 = var402.substring(class157.field2482.length());
                            } else if (var404.startsWith(class157.field2437)) {
                                var405 = 6;
                                var402 = var402.substring(class157.field2437.length());
                            } else if (var404.startsWith(class157.field2470)) {
                                var405 = 7;
                                var402 = var402.substring(class157.field2470.length());
                            } else if (var404.startsWith(class157.field2488)) {
                                var405 = 8;
                                var402 = var402.substring(class157.field2488.length());
                            } else if (var404.startsWith(class157.field2490)) {
                                var405 = 9;
                                var402 = var402.substring(class157.field2490.length());
                            } else if (var404.startsWith(class157.field2324)) {
                                var405 = 10;
                                var402 = var402.substring(class157.field2324.length());
                            } else if (var404.startsWith(class157.field2419)) {
                                var405 = 11;
                                var402 = var402.substring(class157.field2419.length());
                            } else if (client.field304 != 0) {
                                if (var404.startsWith(class157.field2473)) {
                                    var405 = 0;
                                    var402 = var402.substring(class157.field2473.length());
                                } else if (var404.startsWith(class157.field2475)) {
                                    var405 = 1;
                                    var402 = var402.substring(class157.field2475.length());
                                } else if (var404.startsWith(class157.field2477)) {
                                    var405 = 2;
                                    var402 = var402.substring(class157.field2477.length());
                                } else if (var404.startsWith(class157.field2479)) {
                                    var405 = 3;
                                    var402 = var402.substring(class157.field2479.length());
                                } else if (var404.startsWith(class157.field2481)) {
                                    var405 = 4;
                                    var402 = var402.substring(class157.field2481.length());
                                } else if (var404.startsWith(class157.field2483)) {
                                    var405 = 5;
                                    var402 = var402.substring(class157.field2483.length());
                                } else if (var404.startsWith(class157.field2485)) {
                                    var405 = 6;
                                    var402 = var402.substring(class157.field2485.length());
                                } else if (var404.startsWith(class157.field2487)) {
                                    var405 = 7;
                                    var402 = var402.substring(class157.field2487.length());
                                } else if (var404.startsWith(class157.field2474)) {
                                    var405 = 8;
                                    var402 = var402.substring(class157.field2474.length());
                                } else if (var404.startsWith(class157.field2518)) {
                                    var405 = 9;
                                    var402 = var402.substring(class157.field2518.length());
                                } else if (var404.startsWith(class157.field2493)) {
                                    var405 = 10;
                                    var402 = var402.substring(class157.field2493.length());
                                } else if (var404.startsWith(class157.field2476)) {
                                    var405 = 11;
                                    var402 = var402.substring(class157.field2476.length());
                                }
                            }
                            String var406 = var402.toLowerCase();
                            byte var407 = 0;
                            if (var406.startsWith(class157.field2454)) {
                                var407 = 1;
                                var402 = var402.substring(class157.field2454.length());
                            } else if (var406.startsWith(class157.field2489)) {
                                var407 = 2;
                                var402 = var402.substring(class157.field2489.length());
                            } else if (var406.startsWith(class157.field2500)) {
                                var407 = 3;
                                var402 = var402.substring(class157.field2500.length());
                            } else if (var406.startsWith(class157.field2425)) {
                                var407 = 4;
                                var402 = var402.substring(class157.field2425.length());
                            } else if (var406.startsWith(class157.field2504)) {
                                var407 = 5;
                                var402 = var402.substring(class157.field2504.length());
                            } else if (client.field304 != 0) {
                                if (var406.startsWith(class157.field2497)) {
                                    var407 = 1;
                                    var402 = var402.substring(class157.field2497.length());
                                } else if (var406.startsWith(class157.field2499)) {
                                    var407 = 2;
                                    var402 = var402.substring(class157.field2499.length());
                                } else if (var406.startsWith(class157.field2556)) {
                                    var407 = 3;
                                    var402 = var402.substring(class157.field2556.length());
                                } else if (var406.startsWith(class157.field2519)) {
                                    var407 = 4;
                                    var402 = var402.substring(class157.field2519.length());
                                } else if (var406.startsWith(class157.field2553)) {
                                    var407 = 5;
                                    var402 = var402.substring(class157.field2553.length());
                                }
                            }
                            client.field493.method2617(154);
                            client.field493.method2426(0);
                            int var408 = client.field493.field1994;
                            client.field493.method2426(var403);
                            client.field493.method2426(var405);
                            client.field493.method2426(var407);
                            class222.method3031(client.field493, var402);
                            client.field493.method2401(client.field493.field1994 - var408);
                            continue;
                        }
                        if (var450 == 5009) {
                            var6 -= 2;
                            String var409 = field804[var6];
                            String var410 = field804[var6 + 1];
                            client.field493.method2617(247);
                            client.field493.method2349(0);
                            int var411 = client.field493.field1994;
                            client.field493.method2354(var409);
                            class222.method3031(client.field493, var410);
                            client.field493.method2521(client.field493.field1994 - var411);
                            continue;
                        }
                        if (var450 == 5015) {
                            String var412;
                            if (Statics.field2054 == null || Statics.field2054.field52 == null) {
                                var412 = "";
                            } else {
                                var412 = Statics.field2054.field52;
                            }
                            field804[var6++] = var412;
                            continue;
                        }
                        if (var450 == 5016) {
                            field803[var5++] = client.field438;
                            continue;
                        }
                        if (var450 == 5017) {
                            var5--;
                            int var413 = field803[var5];
                            int[] var414 = field803;
                            int var415 = var5++;
                            class28 var416 = (class28) class12.field181.get(var413);
                            int var417;
                            if (var416 == null) {
                                var417 = 0;
                            } else {
                                var417 = var416.method629();
                            }
                            var414[var415] = var417;
                            continue;
                        }
                        if (var450 == 5018) {
                            var5--;
                            int var418 = field803[var5];
                            int[] var419 = field803;
                            int var420 = var5++;
                            class36 var421 = (class36) class12.field183.method3548((long) var418);
                            int var422;
                            if (var421 == null) {
                                var422 = -1;
                            } else if (class12.field182.field3091 == var421.field3096) {
                                var422 = -1;
                            } else {
                                var422 = ((class36) var421.field3096).field796;
                            }
                            var419[var420] = var422;
                            continue;
                        }
                        if (var450 == 5019) {
                            var5--;
                            int var423 = field803[var5];
                            int[] var424 = field803;
                            int var425 = var5++;
                            class36 var426 = (class36) class12.field183.method3548((long) var423);
                            int var427;
                            if (var426 == null) {
                                var427 = -1;
                            } else if (class12.field182.field3091 == var426.field3095) {
                                var427 = -1;
                            } else {
                                var427 = ((class36) var426.field3095).field796;
                            }
                            var424[var425] = var427;
                            continue;
                        }
                        if (var450 == 5020) {
                            var6--;
                            String var428 = field804[var6];
                            client.method939(var428);
                            continue;
                        }
                        if (var450 == 5021) {
                            var6--;
                            client.field517 = field804[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var450 == 5022) {
                            field804[var6++] = client.field517;
                            continue;
                        }
                    }
                } else {
                    class173 var67;
                    if (var450 >= 2000) {
                        var450 -= 1000;
                        var5--;
                        var67 = class173.method2297(field803[var5]);
                    } else {
                        var67 = var41 ? Statics.field809 : Statics.field777;
                    }
                    if (var450 == 1300) {
                        var5--;
                        int var68 = field803[var5] - 1;
                        if (var68 >= 0 && var68 <= 9) {
                            var6--;
                            var67.method3191(var68, field804[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var450 == 1301) {
                        var5 -= 2;
                        int var69 = field803[var5];
                        int var70 = field803[var5 + 1];
                        var67.field2817 = class173.method1498(var69, var70);
                        continue;
                    }
                    if (var450 == 1302) {
                        var5--;
                        var67.field2748 = field803[var5] == 1;
                        continue;
                    }
                    if (var450 == 1303) {
                        var5--;
                        var67.field2818 = field803[var5];
                        continue;
                    }
                    if (var450 == 1304) {
                        var5--;
                        var67.field2846 = field803[var5];
                        continue;
                    }
                    if (var450 == 1305) {
                        var6--;
                        var67.field2815 = field804[var6];
                        continue;
                    }
                    if (var450 == 1306) {
                        var6--;
                        var67.field2821 = field804[var6];
                        continue;
                    }
                    if (var450 == 1307) {
                        var67.field2839 = null;
                        continue;
                    }
                }
                if (var450 < 5400) {
                    if (var450 == 5306) {
                        field803[var5++] = client.method562();
                        continue;
                    }
                    if (var450 == 5307) {
                        var5--;
                        int var429 = field803[var5];
                        if (var429 != 1 && var429 != 2) {
                            continue;
                        }
                        client.field510 = 0L;
                        if (var429 >= 2) {
                            client.field511 = true;
                        } else {
                            client.field511 = false;
                        }
                        client.method2967();
                        if (client.field305 >= 25) {
                            client.method92();
                        }
                        class144.field2190 = true;
                        continue;
                    }
                    if (var450 == 5308) {
                        field803[var5++] = Statics.field2060.field150;
                        continue;
                    }
                    if (var450 == 5309) {
                        var5--;
                        int var430 = field803[var5];
                        if (var430 == 1 || var430 == 2) {
                            Statics.field2060.field150 = var430;
                            class9.method1958();
                        }
                        continue;
                    }
                }
                if (var450 < 5600) {
                    if (var450 == 5504) {
                        var5 -= 2;
                        int var431 = field803[var5];
                        int var432 = field803[var5 + 1];
                        if (!client.field548) {
                            client.field383 = var431;
                            client.field347 = var432;
                        }
                        continue;
                    }
                    if (var450 == 5505) {
                        field803[var5++] = client.field383;
                        continue;
                    }
                    if (var450 == 5506) {
                        field803[var5++] = client.field347;
                        continue;
                    }
                    if (var450 == 5530) {
                        var5--;
                        int var433 = field803[var5];
                        if (var433 < 0) {
                            var433 = 0;
                        }
                        client.field389 = var433;
                        continue;
                    }
                    if (var450 == 5531) {
                        field803[var5++] = client.field389;
                        continue;
                    }
                }
                if (var450 >= 5700 || var450 != 5630) {
                    if (var450 < 6300) {
                        if (var450 == 6200) {
                            var5 -= 2;
                            client.field551 = (short) field803[var5];
                            if (client.field551 <= 0) {
                                client.field551 = 256;
                            }
                            client.field307 = (short) field803[var5 + 1];
                            if (client.field307 <= 0) {
                                client.field307 = 205;
                            }
                            continue;
                        }
                        if (var450 == 6201) {
                            var5 -= 2;
                            client.field553 = (short) field803[var5];
                            if (client.field553 <= 0) {
                                client.field553 = 256;
                            }
                            client.field554 = (short) field803[var5 + 1];
                            if (client.field554 <= 0) {
                                client.field554 = 320;
                            }
                            continue;
                        }
                        if (var450 == 6202) {
                            var5 -= 4;
                            client.field555 = (short) field803[var5];
                            if (client.field555 <= 0) {
                                client.field555 = 1;
                            }
                            client.field561 = (short) field803[var5 + 1];
                            if (client.field561 <= 0) {
                                client.field561 = 32767;
                            } else if (client.field561 < client.field555) {
                                client.field561 = client.field555;
                            }
                            client.field557 = (short) field803[var5 + 2];
                            if (client.field557 <= 0) {
                                client.field557 = 1;
                            }
                            client.field558 = (short) field803[var5 + 3];
                            if (client.field558 <= 0) {
                                client.field558 = 32767;
                            } else if (client.field558 < client.field557) {
                                client.field558 = client.field557;
                            }
                            continue;
                        }
                        if (var450 == 6203) {
                            if (client.field469 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = -1;
                            } else {
                                Statics.method2054(0, 0, client.field469.field2759, client.field469.field2782, false);
                                field803[var5++] = client.field437;
                                field803[var5++] = client.field562;
                            }
                            continue;
                        }
                        if (var450 == 6204) {
                            field803[var5++] = client.field553;
                            field803[var5++] = client.field554;
                            continue;
                        }
                        if (var450 == 6205) {
                            field803[var5++] = client.field551;
                            field803[var5++] = client.field307;
                            continue;
                        }
                    }
                    if (var450 < 6600) {
                        if (var450 == 6500) {
                            field803[var5++] = class26.method2234() ? 1 : 0;
                            continue;
                        }
                        if (var450 == 6501) {
                            class26 var434 = class26.method695();
                            if (var434 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                                field803[var5++] = 0;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                            } else {
                                field803[var5++] = var434.field647;
                                field803[var5++] = var434.field646;
                                field804[var6++] = var434.field651;
                                field803[var5++] = var434.field652;
                                field803[var5++] = var434.field648;
                                field804[var6++] = var434.field642;
                            }
                            continue;
                        }
                        if (var450 == 6502) {
                            class26 var435;
                            if (class26.field644 < class26.field643) {
                                var435 = Statics.field2727[++class26.field644 - 1];
                            } else {
                                var435 = null;
                            }
                            if (var435 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                                field803[var5++] = 0;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                            } else {
                                field803[var5++] = var435.field647;
                                field803[var5++] = var435.field646;
                                field804[var6++] = var435.field651;
                                field803[var5++] = var435.field652;
                                field803[var5++] = var435.field648;
                                field804[var6++] = var435.field642;
                            }
                            continue;
                        }
                        if (var450 == 6506) {
                            var5--;
                            int var437 = field803[var5];
                            class26 var438 = null;
                            for (int var439 = 0; var439 < class26.field643; var439++) {
                                if (Statics.field2727[var439].field647 == var437) {
                                    var438 = Statics.field2727[var439];
                                    break;
                                }
                            }
                            if (var438 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                                field803[var5++] = 0;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                            } else {
                                field803[var5++] = var438.field647;
                                field803[var5++] = var438.field646;
                                field804[var6++] = var438.field651;
                                field803[var5++] = var438.field652;
                                field803[var5++] = var438.field648;
                                field804[var6++] = var438.field642;
                            }
                            continue;
                        }
                        if (var450 == 6507) {
                            var5 -= 4;
                            int var440 = field803[var5];
                            boolean var441 = field803[var5 + 1] == 1;
                            int var442 = field803[var5 + 2];
                            boolean var443 = field803[var5 + 3] == 1;
                            if (Statics.field2727 != null) {
                                class26.method182(0, Statics.field2727.length - 1, var440, var441, var442, var443);
                            }
                            continue;
                        }
                        if (var450 == 6511) {
                            var5--;
                            int var444 = field803[var5];
                            if (var444 >= 0 && var444 < class26.field643) {
                                class26 var445 = Statics.field2727[var444];
                                field803[var5++] = var445.field647;
                                field803[var5++] = var445.field646;
                                field804[var6++] = var445.field651;
                                field803[var5++] = var445.field652;
                                field803[var5++] = var445.field648;
                                field804[var6++] = var445.field642;
                                continue;
                            }
                            field803[var5++] = -1;
                            field803[var5++] = 0;
                            field804[var6++] = "";
                            field803[var5++] = 0;
                            field803[var5++] = 0;
                            field804[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field352 = 250;
            }
        } catch (Exception var449) {
            StringBuilder var447 = new StringBuilder(30);
            var447.append("").append(var4.field3105).append(" ");
            for (int var448 = field810 - 1; var448 >= 0; var448--) {
                var447.append("").append(field806[var448].field216.field3105).append(" ");
            }
            var447.append("").append(var10);
            class148.method1532(var447.toString(), var449);
        }
    }

    @ObfuscatedName("cg.q(II)V")
    public static void method1776(int arg0) {
        if (arg0 == -1 || !class173.method584(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2803[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2823 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field9 = var3.field2823;
                method1067(var4, 2000000);
            }
        }
    }
}
