package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ac")
public class class37 {

    @ObfuscatedName("ac.f")
    public static int[] field800 = new int[5];

    @ObfuscatedName("ac.g")
    public static int[][] field803 = new int[5][5000];

    @ObfuscatedName("ac.o")
    public static int[] field804 = new int[1000];

    @ObfuscatedName("ac.s")
    public static String[] field805 = new String[1000];

    @ObfuscatedName("ac.k")
    public static int field806 = 0;

    @ObfuscatedName("ac.b")
    public static class15[] field808 = new class15[50];

    @ObfuscatedName("ac.p")
    public static Calendar field810 = Calendar.getInstance();

    @ObfuscatedName("ac.d")
    public static final String[] field809 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ac.i")
    public static int field812 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dj.h(Lh;II)V")
    public static void method2681(class1 arg0, int arg1) {
        Object[] var2 = arg0.field9;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method3068(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field608;
        int[] var9 = var4.field609;
        byte var10 = -1;
        field806 = 0;
        try {
            Statics.field811 = new int[var4.field611];
            int var11 = 0;
            Statics.field801 = new String[var4.field613];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field14;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2732;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2735;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2732;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2735;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field5;
                    }
                    Statics.field811[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1;
                    }
                    Statics.field801[var12++] = var15;
                }
            }
            int var16 = 0;
            field812 = arg0.field11;
            label2995: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var467 = var8[var7];
                if (var467 < 100) {
                    if (var467 == 0) {
                        field804[var5++] = var9[var7];
                        continue;
                    }
                    if (var467 == 1) {
                        int var17 = var9[var7];
                        field804[var5++] = class176.field2879[var17];
                        continue;
                    }
                    if (var467 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2879[var18] = field804[var5];
                        client.method806(var18);
                        continue;
                    }
                    if (var467 == 3) {
                        field805[var6++] = var4.field612[var7];
                        continue;
                    }
                    if (var467 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var467 == 7) {
                        var5 -= 2;
                        if (field804[var5 + 1] != field804[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var467 == 8) {
                        var5 -= 2;
                        if (field804[var5 + 1] == field804[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var467 == 9) {
                        var5 -= 2;
                        if (field804[var5] < field804[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var467 == 10) {
                        var5 -= 2;
                        if (field804[var5] > field804[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var467 == 21) {
                        if (field806 == 0) {
                            return;
                        }
                        class15 var19 = field808[--field806];
                        var4 = var19.field213;
                        var8 = var4.field608;
                        var9 = var4.field609;
                        var7 = var19.field214;
                        Statics.field811 = var19.field215;
                        Statics.field801 = var19.field216;
                        continue;
                    }
                    if (var467 == 25) {
                        int var20 = var9[var7];
                        field804[var5++] = class176.method156(var20);
                        continue;
                    }
                    if (var467 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class176.method2985(var21, field804[var5]);
                        continue;
                    }
                    if (var467 == 31) {
                        var5 -= 2;
                        if (field804[var5] <= field804[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var467 == 32) {
                        var5 -= 2;
                        if (field804[var5] >= field804[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var467 == 33) {
                        field804[var5++] = Statics.field811[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var467 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field811[var10001] = field804[var5];
                        continue;
                    }
                    if (var467 == 35) {
                        field805[var6++] = Statics.field801[var9[var7]];
                        continue;
                    }
                    if (var467 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field801[var10001] = field805[var6];
                        continue;
                    }
                    if (var467 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field805;
                        String var24;
                        if (var22 == 0) {
                            var24 = "";
                        } else if (var22 == 1) {
                            String var25 = var23[var6];
                            if (var25 == null) {
                                var24 = "null";
                            } else {
                                var24 = var25.toString();
                            }
                        } else {
                            int var26 = var6 + var22;
                            int var27 = 0;
                            for (int var28 = var6; var28 < var26; var28++) {
                                String var29 = var23[var28];
                                if (var29 == null) {
                                    var27 += 4;
                                } else {
                                    var27 += var29.length();
                                }
                            }
                            StringBuilder var30 = new StringBuilder(var27);
                            for (int var31 = var6; var31 < var26; var31++) {
                                String var32 = var23[var31];
                                if (var32 == null) {
                                    var30.append("null");
                                } else {
                                    var30.append(var32);
                                }
                            }
                            var24 = var30.toString();
                        }
                        field805[var6++] = var24;
                        continue;
                    }
                    if (var467 == 38) {
                        var5--;
                        continue;
                    }
                    if (var467 == 39) {
                        var6--;
                        continue;
                    }
                    if (var467 == 40) {
                        int var34 = var9[var7];
                        class23 var35 = class23.method3068(var34);
                        int[] var36 = new int[var35.field611];
                        String[] var37 = new String[var35.field613];
                        for (int var38 = 0; var38 < var35.field616; var38++) {
                            var36[var38] = field804[var5 - var35.field616 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field615; var39++) {
                            var37[var39] = field805[var6 - var35.field615 + var39];
                        }
                        var5 -= var35.field616;
                        var6 -= var35.field615;
                        class15 var40 = new class15();
                        var40.field213 = var4;
                        var40.field214 = var7;
                        var40.field215 = Statics.field811;
                        var40.field216 = Statics.field801;
                        field808[++field806 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field608;
                        var9 = var35.field609;
                        var7 = -1;
                        Statics.field811 = var36;
                        Statics.field801 = var37;
                        continue;
                    }
                    if (var467 == 42) {
                        field804[var5++] = Statics.field2045.method204(var9[var7]);
                        continue;
                    }
                    if (var467 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2045.method203(var10001, field804[var5]);
                        continue;
                    }
                    if (var467 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field804[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field800[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2995;
                                }
                                field803[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var467 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field804[var5];
                        if (var47 >= 0 && var47 < field800[var46]) {
                            field804[var5++] = field803[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var467 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field804[var5];
                        if (var49 >= 0 && var49 < field800[var48]) {
                            field803[var48][var49] = field804[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var467 == 47) {
                        String var50 = Statics.field2045.method224(var9[var7]);
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field805[var6++] = var50;
                        continue;
                    }
                    if (var467 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2045.method218(var10001, field805[var6]);
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var467 < 1000) {
                    if (var467 == 100) {
                        var5 -= 3;
                        int var52 = field804[var5];
                        int var53 = field804[var5 + 1];
                        int var54 = field804[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var55 = class173.method2977(var52);
                        if (var55.field2854 == null) {
                            var55.field2854 = new class173[var54 + 1];
                        }
                        if (var55.field2854.length <= var54) {
                            class173[] var56 = new class173[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2854.length; var57++) {
                                var56[var57] = var55.field2854[var57];
                            }
                            var55.field2854 = var56;
                        }
                        if (var54 > 0 && var55.field2854[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class173 var58 = new class173();
                        var58.field2734 = var53;
                        var58.field2786 = var58.field2732 = var55.field2732;
                        var58.field2735 = var54;
                        var58.field2820 = true;
                        var55.field2854[var54] = var58;
                        if (var51) {
                            Statics.field3132 = var58;
                        } else {
                            Statics.field696 = var58;
                        }
                        client.method2263(var55);
                        continue;
                    }
                    if (var467 == 101) {
                        class173 var59 = var51 ? Statics.field3132 : Statics.field696;
                        class173 var60 = class173.method2977(var59.field2732);
                        var60.field2854[var59.field2735] = null;
                        client.method2263(var60);
                        continue;
                    }
                    if (var467 == 102) {
                        var5--;
                        class173 var61 = class173.method2977(field804[var5]);
                        var61.field2854 = null;
                        client.method2263(var61);
                        continue;
                    }
                    if (var467 == 200) {
                        var5 -= 2;
                        int var62 = field804[var5];
                        int var63 = field804[var5 + 1];
                        class173 var64 = class173.method2077(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field804[var5++] = 1;
                            if (var51) {
                                Statics.field3132 = var64;
                            } else {
                                Statics.field696 = var64;
                            }
                            continue;
                        }
                        field804[var5++] = 0;
                        continue;
                    }
                    if (var467 == 201) {
                        var5--;
                        class173 var65 = class173.method2977(field804[var5]);
                        if (var65 == null) {
                            field804[var5++] = 0;
                        } else {
                            field804[var5++] = 1;
                            if (var51) {
                                Statics.field3132 = var65;
                            } else {
                                Statics.field696 = var65;
                            }
                        }
                        continue;
                    }
                } else if (var467 >= 1000 && var467 < 1100 || var467 >= 2000 && var467 < 2100) {
                    int var66 = -1;
                    class173 var67;
                    if (var467 >= 2000) {
                        var467 -= 1000;
                        var5--;
                        var66 = field804[var5];
                        var67 = class173.method2977(var66);
                    } else {
                        var67 = var51 ? Statics.field3132 : Statics.field696;
                    }
                    if (var467 == 1000) {
                        var5 -= 4;
                        var67.field2785 = field804[var5];
                        var67.field2742 = field804[var5 + 1];
                        var67.field2737 = field804[var5 + 2];
                        var67.field2807 = field804[var5 + 3];
                        client.method2263(var67);
                        client.method111(var67);
                        if (var66 != -1 && var67.field2734 == 0) {
                            client.method2996(Statics.field2791[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var467 == 1001) {
                        var5 -= 4;
                        var67.field2743 = field804[var5];
                        var67.field2744 = field804[var5 + 1];
                        var67.field2739 = field804[var5 + 2];
                        var67.field2740 = field804[var5 + 3];
                        client.method2263(var67);
                        client.method111(var67);
                        if (var66 != -1 && var67.field2734 == 0) {
                            client.method2996(Statics.field2791[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var467 == 1003) {
                        var5--;
                        boolean var68 = field804[var5] == 1;
                        if (var67.field2752 != var68) {
                            var67.field2752 = var68;
                            client.method2263(var67);
                        }
                        continue;
                    }
                    if (var467 == 1005) {
                        var5--;
                        var67.field2733 = field804[var5] == 1;
                        continue;
                    }
                    if (var467 == 1006) {
                        var5--;
                        var67.field2864 = field804[var5] == 1;
                        continue;
                    }
                } else if (var467 >= 1100 && var467 < 1200 || var467 >= 2100 && var467 < 2200) {
                    int var69 = -1;
                    class173 var70;
                    if (var467 >= 2000) {
                        var467 -= 1000;
                        var5--;
                        var69 = field804[var5];
                        var70 = class173.method2977(var69);
                    } else {
                        var70 = var51 ? Statics.field3132 : Statics.field696;
                    }
                    if (var467 == 1100) {
                        var5 -= 2;
                        var70.field2753 = field804[var5];
                        if (var70.field2753 > var70.field2755 - var70.field2747) {
                            var70.field2753 = var70.field2755 - var70.field2747;
                        }
                        if (var70.field2753 < 0) {
                            var70.field2753 = 0;
                        }
                        var70.field2819 = field804[var5 + 1];
                        if (var70.field2819 > var70.field2756 - var70.field2748) {
                            var70.field2819 = var70.field2756 - var70.field2748;
                        }
                        if (var70.field2819 < 0) {
                            var70.field2819 = 0;
                        }
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1101) {
                        var5--;
                        var70.field2745 = field804[var5];
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1102) {
                        var5--;
                        var70.field2761 = field804[var5] == 1;
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1103) {
                        var5--;
                        var70.field2772 = field804[var5];
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1104) {
                        var5--;
                        var70.field2763 = field804[var5];
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1105) {
                        var5--;
                        var70.field2780 = field804[var5];
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1106) {
                        var5--;
                        var70.field2727 = field804[var5];
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1107) {
                        var5--;
                        var70.field2768 = field804[var5] == 1;
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1108) {
                        var70.field2839 = 1;
                        var5--;
                        var70.field2774 = field804[var5];
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1109) {
                        var5 -= 6;
                        var70.field2779 = field804[var5];
                        var70.field2781 = field804[var5 + 1];
                        var70.field2725 = field804[var5 + 2];
                        var70.field2782 = field804[var5 + 3];
                        var70.field2783 = field804[var5 + 4];
                        var70.field2784 = field804[var5 + 5];
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1110) {
                        var5--;
                        int var71 = field804[var5];
                        if (var70.field2861 != var71) {
                            var70.field2861 = var71;
                            var70.field2841 = 0;
                            var70.field2860 = 0;
                            client.method2263(var70);
                        }
                        continue;
                    }
                    if (var467 == 1111) {
                        var5--;
                        var70.field2787 = field804[var5] == 1;
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1112) {
                        var6--;
                        String var72 = field805[var6];
                        if (!var72.equals(var70.field2790)) {
                            var70.field2790 = var72;
                            client.method2263(var70);
                        }
                        continue;
                    }
                    if (var467 == 1113) {
                        var5--;
                        var70.field2853 = field804[var5];
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1114) {
                        var5 -= 3;
                        var70.field2793 = field804[var5];
                        var70.field2794 = field804[var5 + 1];
                        var70.field2792 = field804[var5 + 2];
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1115) {
                        var5--;
                        var70.field2795 = field804[var5] == 1;
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1116) {
                        var5--;
                        var70.field2769 = field804[var5];
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1117) {
                        var5--;
                        var70.field2770 = field804[var5];
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1118) {
                        var5--;
                        var70.field2771 = field804[var5] == 1;
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1119) {
                        var5--;
                        var70.field2773 = field804[var5] == 1;
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1120) {
                        var5 -= 2;
                        var70.field2755 = field804[var5];
                        var70.field2756 = field804[var5 + 1];
                        client.method2263(var70);
                        if (var69 != -1 && var70.field2734 == 0) {
                            client.method2996(Statics.field2791[var69 >> 16], var70, false);
                        }
                        continue;
                    }
                    if (var467 == 1121) {
                        int var73 = var70.field2732;
                        int var74 = var70.field2735;
                        client.field341.method2631(177);
                        client.field341.method2582(var74);
                        client.field341.method2426(var73);
                        client.field463 = var70;
                        client.method2263(var70);
                        continue;
                    }
                    if (var467 == 1122) {
                        var5--;
                        var70.field2840 = field804[var5];
                        client.method2263(var70);
                        continue;
                    }
                } else if (!(var467 < 1200 || var467 >= 1300) || !(var467 < 2200 || var467 >= 2300)) {
                    class173 var75;
                    if (var467 >= 2000) {
                        var467 -= 1000;
                        var5--;
                        var75 = class173.method2977(field804[var5]);
                    } else {
                        var75 = var51 ? Statics.field3132 : Statics.field696;
                    }
                    client.method2263(var75);
                    if (var467 == 1200 || var467 == 1205 || var467 == 1212) {
                        var5 -= 2;
                        int var76 = field804[var5];
                        int var77 = field804[var5 + 1];
                        var75.field2850 = var76;
                        var75.field2851 = var77;
                        class52 var78 = class52.method588(var76);
                        var75.field2725 = var78.field1121;
                        var75.field2782 = var78.field1122;
                        var75.field2783 = var78.field1123;
                        var75.field2779 = var78.field1124;
                        var75.field2781 = var78.field1125;
                        var75.field2784 = var78.field1126;
                        if (var467 == 1205) {
                            var75.field2802 = 0;
                        } else if (var467 == 1212 | var78.field1109 == 1) {
                            var75.field2802 = 1;
                        } else {
                            var75.field2802 = 2;
                        }
                        if (var75.field2754 > 0) {
                            var75.field2784 = var75.field2784 * 32 / var75.field2754;
                        } else if (var75.field2743 > 0) {
                            var75.field2784 = var75.field2784 * 32 / var75.field2743;
                        }
                        continue;
                    }
                    if (var467 == 1201) {
                        var75.field2839 = 2;
                        var5--;
                        var75.field2774 = field804[var5];
                        continue;
                    }
                    if (var467 == 1202) {
                        var75.field2839 = 3;
                        var75.field2774 = Statics.field101.field32.method3330();
                        continue;
                    }
                } else if ((var467 < 1300 || var467 >= 1400) && (var467 < 2300 || var467 >= 2400)) {
                    if (var467 >= 1400 && var467 < 1500 || var467 >= 2400 && var467 < 2500) {
                        class173 var83;
                        if (var467 >= 2000) {
                            var467 -= 1000;
                            var5--;
                            var83 = class173.method2977(field804[var5]);
                        } else {
                            var83 = var51 ? Statics.field3132 : Statics.field696;
                        }
                        var6--;
                        String var84 = field805[var6];
                        int[] var85 = null;
                        if (var84.length() > 0 && var84.charAt(var84.length() - 1) == 'Y') {
                            var5--;
                            int var86 = field804[var5];
                            if (var86 > 0) {
                                var85 = new int[var86];
                                while (var86-- > 0) {
                                    var5--;
                                    var85[var86] = field804[var5];
                                }
                            }
                            var84 = var84.substring(0, var84.length() - 1);
                        }
                        Object[] var87 = new Object[var84.length() + 1];
                        for (int var88 = var87.length - 1; var88 >= 1; var88--) {
                            if (var84.charAt(var88 - 1) == 's') {
                                var6--;
                                var87[var88] = field805[var6];
                            } else {
                                var5--;
                                var87[var88] = Integer.valueOf(field804[var5]);
                            }
                        }
                        var5--;
                        int var89 = field804[var5];
                        if (var89 == -1) {
                            var87 = null;
                        } else {
                            var87[0] = Integer.valueOf(var89);
                        }
                        if (var467 == 1400) {
                            var83.field2812 = var87;
                        }
                        if (var467 == 1401) {
                            var83.field2815 = var87;
                        }
                        if (var467 == 1402) {
                            var83.field2814 = var87;
                        }
                        if (var467 == 1403) {
                            var83.field2816 = var87;
                        }
                        if (var467 == 1404) {
                            var83.field2724 = var87;
                        }
                        if (var467 == 1405) {
                            var83.field2722 = var87;
                        }
                        if (var467 == 1406) {
                            var83.field2822 = var87;
                        }
                        if (var467 == 1407) {
                            var83.field2823 = var87;
                            var83.field2824 = var85;
                        }
                        if (var467 == 1408) {
                            var83.field2829 = var87;
                        }
                        if (var467 == 1409) {
                            var83.field2830 = var87;
                        }
                        if (var467 == 1410) {
                            var83.field2760 = var87;
                        }
                        if (var467 == 1411) {
                            var83.field2813 = var87;
                        }
                        if (var467 == 1412) {
                            var83.field2842 = var87;
                        }
                        if (var467 == 1414) {
                            var83.field2825 = var87;
                            var83.field2826 = var85;
                        }
                        if (var467 == 1415) {
                            var83.field2827 = var87;
                            var83.field2828 = var85;
                        }
                        if (var467 == 1416) {
                            var83.field2801 = var87;
                        }
                        if (var467 == 1417) {
                            var83.field2730 = var87;
                        }
                        if (var467 == 1418) {
                            var83.field2832 = var87;
                        }
                        if (var467 == 1419) {
                            var83.field2833 = var87;
                        }
                        if (var467 == 1420) {
                            var83.field2834 = var87;
                        }
                        if (var467 == 1421) {
                            var83.field2835 = var87;
                        }
                        if (var467 == 1422) {
                            var83.field2836 = var87;
                        }
                        if (var467 == 1423) {
                            var83.field2837 = var87;
                        }
                        if (var467 == 1424) {
                            var83.field2838 = var87;
                        }
                        if (var467 == 1425) {
                            var83.field2849 = var87;
                        }
                        if (var467 == 1426) {
                            var83.field2765 = var87;
                        }
                        if (var467 == 1427) {
                            var83.field2736 = var87;
                        }
                        var83.field2803 = true;
                        continue;
                    }
                    if (var467 < 1600) {
                        class173 var90 = var51 ? Statics.field3132 : Statics.field696;
                        if (var467 == 1500) {
                            field804[var5++] = var90.field2863;
                            continue;
                        }
                        if (var467 == 1501) {
                            field804[var5++] = var90.field2746;
                            continue;
                        }
                        if (var467 == 1502) {
                            field804[var5++] = var90.field2747;
                            continue;
                        }
                        if (var467 == 1503) {
                            field804[var5++] = var90.field2748;
                            continue;
                        }
                        if (var467 == 1504) {
                            field804[var5++] = var90.field2752 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 1505) {
                            field804[var5++] = var90.field2786;
                            continue;
                        }
                    } else if (var467 < 1700) {
                        class173 var91 = var51 ? Statics.field3132 : Statics.field696;
                        if (var467 == 1600) {
                            field804[var5++] = var91.field2753;
                            continue;
                        }
                        if (var467 == 1601) {
                            field804[var5++] = var91.field2819;
                            continue;
                        }
                        if (var467 == 1602) {
                            field805[var6++] = var91.field2790;
                            continue;
                        }
                        if (var467 == 1603) {
                            field804[var5++] = var91.field2755;
                            continue;
                        }
                        if (var467 == 1604) {
                            field804[var5++] = var91.field2756;
                            continue;
                        }
                        if (var467 == 1605) {
                            field804[var5++] = var91.field2784;
                            continue;
                        }
                        if (var467 == 1606) {
                            field804[var5++] = var91.field2725;
                            continue;
                        }
                        if (var467 == 1607) {
                            field804[var5++] = var91.field2783;
                            continue;
                        }
                        if (var467 == 1608) {
                            field804[var5++] = var91.field2782;
                            continue;
                        }
                        if (var467 == 1609) {
                            field804[var5++] = var91.field2772;
                            continue;
                        }
                    } else if (var467 < 1800) {
                        class173 var92 = var51 ? Statics.field3132 : Statics.field696;
                        if (var467 == 1700) {
                            field804[var5++] = var92.field2850;
                            continue;
                        }
                        if (var467 == 1701) {
                            if (var92.field2850 == -1) {
                                field804[var5++] = 0;
                            } else {
                                field804[var5++] = var92.field2851;
                            }
                            continue;
                        }
                        if (var467 == 1702) {
                            field804[var5++] = var92.field2735;
                            continue;
                        }
                    } else if (var467 < 1900) {
                        class173 var93 = var51 ? Statics.field3132 : Statics.field696;
                        if (var467 == 1800) {
                            int[] var94 = field804;
                            int var95 = var5++;
                            int var96 = client.method2693(var93);
                            int var97 = var96 >> 11 & 0x3F;
                            var94[var95] = var97;
                            continue;
                        }
                        if (var467 == 1801) {
                            var5--;
                            int var98 = field804[var5];
                            int var468 = var98 - 1;
                            if (var93.field2804 != null && var468 < var93.field2804.length && var93.field2804[var468] != null) {
                                field805[var6++] = var93.field2804[var468];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var467 == 1802) {
                            if (var93.field2723 == null) {
                                field805[var6++] = "";
                            } else {
                                field805[var6++] = var93.field2723;
                            }
                            continue;
                        }
                    } else if (var467 >= 1900 && var467 < 2000 || var467 >= 2900 && var467 < 3000) {
                        class173 var99;
                        if (var467 >= 2000) {
                            var467 -= 1000;
                            var5--;
                            var99 = class173.method2977(field804[var5]);
                        } else {
                            var99 = var51 ? Statics.field3132 : Statics.field696;
                        }
                        if (var467 == 1927) {
                            if (field812 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var99.field2736 == null) {
                                return;
                            }
                            class1 var100 = new class1();
                            var100.field3 = var99;
                            var100.field9 = var99.field2736;
                            var100.field11 = field812 + 1;
                            client.field498.method3609(arg0);
                            continue;
                        }
                    } else if (var467 < 2600) {
                        var5--;
                        class173 var101 = class173.method2977(field804[var5]);
                        if (var467 == 2500) {
                            field804[var5++] = var101.field2863;
                            continue;
                        }
                        if (var467 == 2501) {
                            field804[var5++] = var101.field2746;
                            continue;
                        }
                        if (var467 == 2502) {
                            field804[var5++] = var101.field2747;
                            continue;
                        }
                        if (var467 == 2503) {
                            field804[var5++] = var101.field2748;
                            continue;
                        }
                        if (var467 == 2504) {
                            field804[var5++] = var101.field2752 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 2505) {
                            field804[var5++] = var101.field2786;
                            continue;
                        }
                    } else if (var467 < 2700) {
                        var5--;
                        class173 var102 = class173.method2977(field804[var5]);
                        if (var467 == 2600) {
                            field804[var5++] = var102.field2753;
                            continue;
                        }
                        if (var467 == 2601) {
                            field804[var5++] = var102.field2819;
                            continue;
                        }
                        if (var467 == 2602) {
                            field805[var6++] = var102.field2790;
                            continue;
                        }
                        if (var467 == 2603) {
                            field804[var5++] = var102.field2755;
                            continue;
                        }
                        if (var467 == 2604) {
                            field804[var5++] = var102.field2756;
                            continue;
                        }
                        if (var467 == 2605) {
                            field804[var5++] = var102.field2784;
                            continue;
                        }
                        if (var467 == 2606) {
                            field804[var5++] = var102.field2725;
                            continue;
                        }
                        if (var467 == 2607) {
                            field804[var5++] = var102.field2783;
                            continue;
                        }
                        if (var467 == 2608) {
                            field804[var5++] = var102.field2782;
                            continue;
                        }
                        if (var467 == 2609) {
                            field804[var5++] = var102.field2772;
                            continue;
                        }
                    } else if (var467 < 2800) {
                        if (var467 == 2700) {
                            var5--;
                            class173 var103 = class173.method2977(field804[var5]);
                            field804[var5++] = var103.field2850;
                            continue;
                        }
                        if (var467 == 2701) {
                            var5--;
                            class173 var104 = class173.method2977(field804[var5]);
                            if (var104.field2850 == -1) {
                                field804[var5++] = 0;
                            } else {
                                field804[var5++] = var104.field2851;
                            }
                            continue;
                        }
                        if (var467 == 2702) {
                            var5--;
                            int var105 = field804[var5];
                            class4 var106 = (class4) client.field460.method3584((long) var105);
                            if (var106 == null) {
                                field804[var5++] = 0;
                            } else {
                                field804[var5++] = 1;
                            }
                            continue;
                        }
                        if (var467 == 2706) {
                            field804[var5++] = client.field416;
                            continue;
                        }
                    } else if (var467 < 2900) {
                        var5--;
                        class173 var107 = class173.method2977(field804[var5]);
                        if (var467 == 2800) {
                            int[] var108 = field804;
                            int var109 = var5++;
                            int var110 = client.method2693(var107);
                            int var111 = var110 >> 11 & 0x3F;
                            var108[var109] = var111;
                            continue;
                        }
                        if (var467 == 2801) {
                            var5--;
                            int var112 = field804[var5];
                            int var469 = var112 - 1;
                            if (var107.field2804 != null && var469 < var107.field2804.length && var107.field2804[var469] != null) {
                                field805[var6++] = var107.field2804[var469];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var467 == 2802) {
                            if (var107.field2723 == null) {
                                field805[var6++] = "";
                            } else {
                                field805[var6++] = var107.field2723;
                            }
                            continue;
                        }
                    } else if (var467 < 3200) {
                        if (var467 == 3100) {
                            var6--;
                            String var113 = field805[var6];
                            class12.method974(0, "", var113);
                            continue;
                        }
                        if (var467 == 3101) {
                            var5 -= 2;
                            client.method2320(Statics.field101, field804[var5], field804[var5 + 1]);
                            continue;
                        }
                        if (var467 == 3103) {
                            client.method715();
                            continue;
                        }
                        if (var467 == 3104) {
                            var6--;
                            String var114 = field805[var6];
                            int var115 = 0;
                            if (class163.method2258(var114)) {
                                int var116 = class163.method694(var114, 10, true);
                                var115 = var116;
                            }
                            client.field341.method2631(84);
                            client.field341.method2556(var115);
                            continue;
                        }
                        if (var467 == 3105) {
                            var6--;
                            String var117 = field805[var6];
                            client.field341.method2631(160);
                            client.field341.method2499(var117.length() + 1);
                            client.field341.method2374(var117);
                            continue;
                        }
                        if (var467 == 3106) {
                            var6--;
                            String var118 = field805[var6];
                            client.field341.method2631(238);
                            client.field341.method2499(var118.length() + 1);
                            client.field341.method2374(var118);
                            continue;
                        }
                        if (var467 == 3107) {
                            var5--;
                            int var119 = field804[var5];
                            var6--;
                            String var120 = field805[var6];
                            int var121 = class33.field774;
                            int[] var122 = class33.field769;
                            boolean var123 = false;
                            for (int var124 = 0; var124 < var121; var124++) {
                                class3 var125 = client.field421[var122[var124]];
                                if (var125 != null && Statics.field101 != var125 && var125.field41 != null && var125.field41.equalsIgnoreCase(var120)) {
                                    if (var119 == 1) {
                                        client.field341.method2631(208);
                                        client.field341.method2397(0);
                                        client.field341.method2369(var122[var124]);
                                    } else if (var119 == 4) {
                                        client.field341.method2631(142);
                                        client.field341.method2407(0);
                                        client.field341.method2582(var122[var124]);
                                    } else if (var119 == 6) {
                                        client.field341.method2631(153);
                                        client.field341.method2407(0);
                                        client.field341.method2582(var122[var124]);
                                    } else if (var119 == 7) {
                                        client.field341.method2631(107);
                                        client.field341.method2415(var122[var124]);
                                        client.field341.method2499(0);
                                    }
                                    var123 = true;
                                    break;
                                }
                            }
                            if (!var123) {
                                class12.method974(4, "", class157.field2507 + var120);
                            }
                            continue;
                        }
                        if (var467 == 3108) {
                            var5 -= 3;
                            int var126 = field804[var5];
                            int var127 = field804[var5 + 1];
                            int var128 = field804[var5 + 2];
                            class173 var129 = class173.method2977(var128);
                            client.method2673(var129, var126, var127);
                            continue;
                        }
                        if (var467 == 3109) {
                            var5 -= 2;
                            int var130 = field804[var5];
                            int var131 = field804[var5 + 1];
                            class173 var132 = var51 ? Statics.field3132 : Statics.field696;
                            client.method2673(var132, var130, var131);
                            continue;
                        }
                        if (var467 == 3110) {
                            var5--;
                            Statics.field2584 = field804[var5] == 1;
                            continue;
                        }
                        if (var467 == 3111) {
                            field804[var5++] = Statics.field2871.field152 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3112) {
                            var5--;
                            Statics.field2871.field152 = field804[var5] == 1;
                            class9.method2589();
                            continue;
                        }
                        if (var467 == 3113) {
                            var6--;
                            String var133 = field805[var6];
                            var5--;
                            boolean var134 = field804[var5] == 1;
                            if (!var134) {
                                Statics.method764(var133, 3);
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var133));
                                    continue;
                                } catch (Exception var465) {
                                }
                            }
                            if (class138.field2120.startsWith("win")) {
                                Statics.method764(var133, 0);
                            } else if (class138.field2120.startsWith("mac")) {
                                class138.method1054(var133, 1, "openjs");
                            } else {
                                Statics.method764(var133, 2);
                            }
                            continue;
                        }
                        if (var467 == 3115) {
                            var5--;
                            int var136 = field804[var5];
                            client.field341.method2631(76);
                            client.field341.method2369(var136);
                            continue;
                        }
                        if (var467 == 3116) {
                            var5--;
                            int var137 = field804[var5];
                            var6 -= 2;
                            String var138 = field805[var6];
                            String var139 = field805[var6 + 1];
                            if (var138.length() <= 500 && var139.length() <= 500) {
                                client.field341.method2631(106);
                                client.field341.method2369(1 + class119.method2072(var138) + class119.method2072(var139));
                                client.field341.method2499(var137);
                                client.field341.method2374(var138);
                                client.field341.method2374(var139);
                            }
                            continue;
                        }
                    } else if (var467 < 3300) {
                        if (var467 == 3200) {
                            var5 -= 3;
                            Statics.method1974(field804[var5], field804[var5 + 1], field804[var5 + 2]);
                            continue;
                        }
                        if (var467 == 3201) {
                            var5--;
                            client.method3182(field804[var5]);
                            continue;
                        }
                        if (var467 == 3202) {
                            var5 -= 2;
                            client.method2306(field804[var5], field804[var5 + 1]);
                            continue;
                        }
                    } else if (var467 < 3400) {
                        if (var467 == 3300) {
                            field804[var5++] = client.field303;
                            continue;
                        }
                        if (var467 == 3301) {
                            var5 -= 2;
                            int var140 = field804[var5];
                            int var141 = field804[var5 + 1];
                            field804[var5++] = class16.method618(var140, var141);
                            continue;
                        }
                        if (var467 == 3302) {
                            var5 -= 2;
                            int var142 = field804[var5];
                            int var143 = field804[var5 + 1];
                            int[] var144 = field804;
                            int var145 = var5++;
                            class16 var146 = (class16) class16.field233.method3584((long) var142);
                            int var147;
                            if (var146 == null) {
                                var147 = 0;
                            } else if (var143 >= 0 && var143 < var146.field227.length) {
                                var147 = var146.field227[var143];
                            } else {
                                var147 = 0;
                            }
                            var144[var145] = var147;
                            continue;
                        }
                        if (var467 == 3303) {
                            var5 -= 2;
                            int var148 = field804[var5];
                            int var149 = field804[var5 + 1];
                            int[] var150 = field804;
                            int var151 = var5++;
                            class16 var152 = (class16) class16.field233.method3584((long) var148);
                            int var153;
                            if (var152 == null) {
                                var153 = 0;
                            } else if (var149 == -1) {
                                var153 = 0;
                            } else {
                                int var154 = 0;
                                for (int var155 = 0; var155 < var152.field227.length; var155++) {
                                    if (var152.field226[var155] == var149) {
                                        var154 += var152.field227[var155];
                                    }
                                }
                                var153 = var154;
                            }
                            var150[var151] = var153;
                            continue;
                        }
                        if (var467 == 3304) {
                            var5--;
                            int var156 = field804[var5];
                            field804[var5++] = class51.method2645(var156).field1099;
                            continue;
                        }
                        if (var467 == 3305) {
                            var5--;
                            int var157 = field804[var5];
                            field804[var5++] = client.field435[var157];
                            continue;
                        }
                        if (var467 == 3306) {
                            var5--;
                            int var158 = field804[var5];
                            field804[var5++] = client.field436[var158];
                            continue;
                        }
                        if (var467 == 3307) {
                            var5--;
                            int var159 = field804[var5];
                            field804[var5++] = client.field437[var159];
                            continue;
                        }
                        if (var467 == 3308) {
                            int var160 = Statics.field721;
                            int var161 = (Statics.field101.field853 >> 7) + Statics.field2719;
                            int var162 = (Statics.field101.field843 >> 7) + Statics.field607;
                            field804[var5++] = (var160 << 28) + (var161 << 14) + var162;
                            continue;
                        }
                        if (var467 == 3309) {
                            var5--;
                            int var163 = field804[var5];
                            field804[var5++] = var163 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var467 == 3310) {
                            var5--;
                            int var164 = field804[var5];
                            field804[var5++] = var164 >> 28;
                            continue;
                        }
                        if (var467 == 3311) {
                            var5--;
                            int var165 = field804[var5];
                            field804[var5++] = var165 & 0x3FFF;
                            continue;
                        }
                        if (var467 == 3312) {
                            field804[var5++] = client.field300 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3313) {
                            var5 -= 2;
                            int var166 = field804[var5] + 32768;
                            int var167 = field804[var5 + 1];
                            field804[var5++] = class16.method618(var166, var167);
                            continue;
                        }
                        if (var467 == 3314) {
                            var5 -= 2;
                            int var168 = field804[var5] + 32768;
                            int var169 = field804[var5 + 1];
                            int[] var170 = field804;
                            int var171 = var5++;
                            class16 var172 = (class16) class16.field233.method3584((long) var168);
                            int var173;
                            if (var172 == null) {
                                var173 = 0;
                            } else if (var169 >= 0 && var169 < var172.field227.length) {
                                var173 = var172.field227[var169];
                            } else {
                                var173 = 0;
                            }
                            var170[var171] = var173;
                            continue;
                        }
                        if (var467 == 3315) {
                            var5 -= 2;
                            int var174 = field804[var5] + 32768;
                            int var175 = field804[var5 + 1];
                            int[] var176 = field804;
                            int var177 = var5++;
                            class16 var178 = (class16) class16.field233.method3584((long) var174);
                            int var179;
                            if (var178 == null) {
                                var179 = 0;
                            } else if (var175 == -1) {
                                var179 = 0;
                            } else {
                                int var180 = 0;
                                for (int var181 = 0; var181 < var178.field227.length; var181++) {
                                    if (var178.field226[var181] == var175) {
                                        var180 += var178.field227[var181];
                                    }
                                }
                                var179 = var180;
                            }
                            var176[var177] = var179;
                            continue;
                        }
                        if (var467 == 3316) {
                            if (client.field453 >= 2) {
                                field804[var5++] = client.field453;
                            } else {
                                field804[var5++] = 0;
                            }
                            continue;
                        }
                        if (var467 == 3317) {
                            field804[var5++] = client.field313;
                            continue;
                        }
                        if (var467 == 3318) {
                            field804[var5++] = client.field296;
                            continue;
                        }
                        if (var467 == 3321) {
                            field804[var5++] = client.field312;
                            continue;
                        }
                        if (var467 == 3322) {
                            field804[var5++] = client.field465;
                            continue;
                        }
                        if (var467 == 3323) {
                            if (client.field468) {
                                field804[var5++] = 1;
                            } else {
                                field804[var5++] = 0;
                            }
                            continue;
                        }
                        if (var467 == 3324) {
                            field804[var5++] = client.field467;
                            continue;
                        }
                    } else if (var467 < 3500) {
                        if (var467 == 3400) {
                            var5 -= 2;
                            int var182 = field804[var5];
                            int var183 = field804[var5 + 1];
                            class49 var184 = (class49) class49.field1089.method3538((long) var182);
                            class49 var185;
                            if (var184 == null) {
                                byte[] var186 = Statics.field1078.method3073(8, var182);
                                class49 var187 = new class49();
                                if (var186 != null) {
                                    var187.method965(new class119(var186));
                                }
                                class49.field1089.method3540(var187, (long) var182);
                                var185 = var187;
                            } else {
                                var185 = var184;
                            }
                            class49 var188 = var185;
                            if (var185.field1084 != 's') {
                            }
                            for (int var189 = 0; var189 < var188.field1083; var189++) {
                                if (var188.field1086[var189] == var183) {
                                    field805[var6++] = var188.field1080[var189];
                                    var188 = null;
                                    break;
                                }
                            }
                            if (var188 != null) {
                                field805[var6++] = var188.field1081;
                            }
                            continue;
                        }
                        if (var467 == 3408) {
                            var5 -= 4;
                            int var190 = field804[var5];
                            int var191 = field804[var5 + 1];
                            int var192 = field804[var5 + 2];
                            int var193 = field804[var5 + 3];
                            class49 var194 = (class49) class49.field1089.method3538((long) var192);
                            class49 var195;
                            if (var194 == null) {
                                byte[] var196 = Statics.field1078.method3073(8, var192);
                                class49 var197 = new class49();
                                if (var196 != null) {
                                    var197.method965(new class119(var196));
                                }
                                class49.field1089.method3540(var197, (long) var192);
                                var195 = var197;
                            } else {
                                var195 = var194;
                            }
                            class49 var198 = var195;
                            if (var195.field1079 == var190 && var195.field1084 == var191) {
                                for (int var199 = 0; var199 < var198.field1083; var199++) {
                                    if (var198.field1086[var199] == var193) {
                                        if (var191 == 115) {
                                            field805[var6++] = var198.field1080[var199];
                                        } else {
                                            field804[var5++] = var198.field1085[var199];
                                        }
                                        var198 = null;
                                        break;
                                    }
                                }
                                if (var198 != null) {
                                    if (var191 == 115) {
                                        field805[var6++] = var198.field1081;
                                    } else {
                                        field804[var5++] = var198.field1082;
                                    }
                                }
                                continue;
                            }
                            if (var191 == 115) {
                                field805[var6++] = "null";
                            } else {
                                field804[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var467 < 3700) {
                        if (var467 == 3600) {
                            if (client.field568 == 0) {
                                field804[var5++] = -2;
                            } else if (client.field568 == 1) {
                                field804[var5++] = -1;
                            } else {
                                field804[var5++] = client.field578;
                            }
                            continue;
                        }
                        if (var467 == 3601) {
                            var5--;
                            int var200 = field804[var5];
                            if (client.field568 == 2 && var200 < client.field578) {
                                field805[var6++] = client.field478[var200].field258;
                                field805[var6++] = client.field478[var200].field254;
                                continue;
                            }
                            field805[var6++] = "";
                            field805[var6++] = "";
                            continue;
                        }
                        if (var467 == 3602) {
                            var5--;
                            int var201 = field804[var5];
                            if (client.field568 == 2 && var201 < client.field578) {
                                field804[var5++] = client.field478[var201].field260;
                                continue;
                            }
                            field804[var5++] = 0;
                            continue;
                        }
                        if (var467 == 3603) {
                            var5--;
                            int var202 = field804[var5];
                            if (client.field568 == 2 && var202 < client.field578) {
                                field804[var5++] = client.field478[var202].field256;
                                continue;
                            }
                            field804[var5++] = 0;
                            continue;
                        }
                        if (var467 == 3604) {
                            var6--;
                            String var203 = field805[var6];
                            var5--;
                            int var204 = field804[var5];
                            client.field341.method2631(44);
                            client.field341.method2499(class119.method2072(var203) + 1);
                            client.field341.method2408(var204);
                            client.field341.method2374(var203);
                            continue;
                        }
                        if (var467 == 3605) {
                            var6--;
                            String var205 = field805[var6];
                            client.method735(var205);
                            continue;
                        }
                        if (var467 == 3606) {
                            var6--;
                            String var206 = field805[var6];
                            if (var206 == null) {
                                continue;
                            }
                            String var207 = class164.method175(var206, Statics.field1868);
                            if (var207 == null) {
                                continue;
                            }
                            int var208 = 0;
                            while (true) {
                                if (var208 >= client.field578) {
                                    continue label2995;
                                }
                                class18 var209 = client.field478[var208];
                                String var210 = var209.field258;
                                String var211 = class164.method175(var210, Statics.field1868);
                                boolean var212;
                                if (var206 == null || var210 == null) {
                                    var212 = false;
                                } else if (var206.startsWith("#") || var210.startsWith("#")) {
                                    var212 = var206.equals(var210);
                                } else {
                                    var212 = var207.equals(var211);
                                }
                                if (var212) {
                                    client.field578--;
                                    for (int var213 = var208; var213 < client.field578; var213++) {
                                        client.field478[var213] = client.field478[var213 + 1];
                                    }
                                    client.field492 = client.field484;
                                    client.field341.method2631(251);
                                    client.field341.method2499(class119.method2072(var206));
                                    client.field341.method2374(var206);
                                    continue label2995;
                                }
                                var208++;
                            }
                        }
                        if (var467 == 3607) {
                            var6--;
                            String var214 = field805[var6];
                            client.method586(var214, false);
                            continue;
                        }
                        if (var467 == 3608) {
                            var6--;
                            String var215 = field805[var6];
                            client.method136(var215);
                            continue;
                        }
                        if (var467 == 3609) {
                            var6--;
                            String var216 = field805[var6];
                            class152[] var217 = class152.method2251();
                            for (int var218 = 0; var218 < var217.length; var218++) {
                                class152 var219 = var217[var218];
                                if (var219.field2253 != -1 && var216.startsWith(class2.method567(var219.field2253))) {
                                    var216 = var216.substring(6 + Integer.toString(var219.field2253).length());
                                    break;
                                }
                            }
                            field804[var5++] = client.method2863(var216, false) ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3611) {
                            if (client.field526 == null) {
                                field805[var6++] = "";
                            } else {
                                field805[var6++] = class162.method1784(client.field526);
                            }
                            continue;
                        }
                        if (var467 == 3612) {
                            if (client.field526 == null) {
                                field804[var5++] = 0;
                            } else {
                                field804[var5++] = Statics.field75;
                            }
                            continue;
                        }
                        if (var467 == 3613) {
                            var5--;
                            int var220 = field804[var5];
                            if (client.field526 != null && var220 < Statics.field75) {
                                field805[var6++] = Statics.field137[var220].field644;
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var467 == 3614) {
                            var5--;
                            int var221 = field804[var5];
                            if (client.field526 != null && var221 < Statics.field75) {
                                field804[var5++] = Statics.field137[var221].field640;
                                continue;
                            }
                            field804[var5++] = 0;
                            continue;
                        }
                        if (var467 == 3615) {
                            var5--;
                            int var222 = field804[var5];
                            if (client.field526 != null && var222 < Statics.field75) {
                                field804[var5++] = Statics.field137[var222].field641;
                                continue;
                            }
                            field804[var5++] = 0;
                            continue;
                        }
                        if (var467 == 3616) {
                            field804[var5++] = Statics.field3191;
                            continue;
                        }
                        if (var467 == 3617) {
                            var6--;
                            String var223 = field805[var6];
                            client.method2059(var223);
                            continue;
                        }
                        if (var467 == 3618) {
                            field804[var5++] = Statics.field2037;
                            continue;
                        }
                        if (var467 == 3619) {
                            var6--;
                            String var224 = field805[var6];
                            if (!var224.equals("")) {
                                client.field341.method2631(232);
                                client.field341.method2499(class119.method2072(var224));
                                client.field341.method2374(var224);
                            }
                            continue;
                        }
                        if (var467 == 3620) {
                            client.method736();
                            continue;
                        }
                        if (var467 == 3621) {
                            if (client.field568 == 0) {
                                field804[var5++] = -1;
                            } else {
                                field804[var5++] = client.field356;
                            }
                            continue;
                        }
                        if (var467 == 3622) {
                            var5--;
                            int var225 = field804[var5];
                            if (client.field568 != 0 && var225 < client.field356) {
                                field805[var6++] = client.field572[var225].field141;
                                field805[var6++] = client.field572[var225].field148;
                                continue;
                            }
                            field805[var6++] = "";
                            field805[var6++] = "";
                            continue;
                        }
                        if (var467 == 3623) {
                            var6--;
                            String var226 = field805[var6];
                            if (var226.startsWith(class2.method567(0)) || var226.startsWith(class2.method567(1))) {
                                var226 = var226.substring(7);
                            }
                            field804[var5++] = client.method2(var226) ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3624) {
                            var5--;
                            int var227 = field804[var5];
                            if (Statics.field137 != null && var227 < Statics.field75 && Statics.field137[var227].field644.equalsIgnoreCase(Statics.field101.field41)) {
                                field804[var5++] = 1;
                                continue;
                            }
                            field804[var5++] = 0;
                            continue;
                        }
                        if (var467 == 3625) {
                            if (client.field527 == null) {
                                field805[var6++] = "";
                            } else {
                                field805[var6++] = class162.method1784(client.field527);
                            }
                            continue;
                        }
                    } else if (var467 < 4000) {
                        if (var467 == 3903) {
                            var5--;
                            int var228 = field804[var5];
                            field804[var5++] = client.field576[var228].method3791();
                            continue;
                        }
                        if (var467 == 3904) {
                            var5--;
                            int var229 = field804[var5];
                            field804[var5++] = client.field576[var229].field3149;
                            continue;
                        }
                        if (var467 == 3905) {
                            var5--;
                            int var230 = field804[var5];
                            field804[var5++] = client.field576[var230].field3150;
                            continue;
                        }
                        if (var467 == 3906) {
                            var5--;
                            int var231 = field804[var5];
                            field804[var5++] = client.field576[var231].field3153;
                            continue;
                        }
                        if (var467 == 3907) {
                            var5--;
                            int var232 = field804[var5];
                            field804[var5++] = client.field576[var232].field3152;
                            continue;
                        }
                        if (var467 == 3908) {
                            var5--;
                            int var233 = field804[var5];
                            field804[var5++] = client.field576[var233].field3148;
                            continue;
                        }
                        if (var467 == 3910) {
                            var5--;
                            int var234 = field804[var5];
                            int var235 = client.field576[var234].method3810();
                            field804[var5++] = var235 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3911) {
                            var5--;
                            int var236 = field804[var5];
                            int var237 = client.field576[var236].method3810();
                            field804[var5++] = var237 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3912) {
                            var5--;
                            int var238 = field804[var5];
                            int var239 = client.field576[var238].method3810();
                            field804[var5++] = var239 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3913) {
                            var5--;
                            int var240 = field804[var5];
                            int var241 = client.field576[var240].method3810();
                            field804[var5++] = var241 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3914) {
                            var5--;
                            boolean var242 = field804[var5] == 1;
                            if (Statics.field229 != null) {
                                Statics.field229.method3812(class221.field3157, var242);
                            }
                            continue;
                        }
                        if (var467 == 3915) {
                            var5--;
                            boolean var243 = field804[var5] == 1;
                            if (Statics.field229 != null) {
                                Statics.field229.method3812(class221.field3156, var243);
                            }
                            continue;
                        }
                        if (var467 == 3916) {
                            var5 -= 2;
                            boolean var244 = field804[var5] == 1;
                            boolean var245 = field804[var5 + 1] == 1;
                            if (Statics.field229 != null) {
                                Statics.field229.method3812(new class22(var245), var244);
                            }
                            continue;
                        }
                        if (var467 == 3917) {
                            var5--;
                            boolean var246 = field804[var5] == 1;
                            if (Statics.field229 != null) {
                                Statics.field229.method3812(class221.field3160, var246);
                            }
                            continue;
                        }
                        if (var467 == 3918) {
                            var5--;
                            boolean var247 = field804[var5] == 1;
                            if (Statics.field229 != null) {
                                Statics.field229.method3812(class221.field3154, var247);
                            }
                            continue;
                        }
                        if (var467 == 3919) {
                            field804[var5++] = Statics.field229 == null ? 0 : Statics.field229.field3155.size();
                            continue;
                        }
                        if (var467 == 3920) {
                            var5--;
                            int var248 = field804[var5];
                            class214 var249 = (class214) Statics.field229.field3155.get(var248);
                            field804[var5++] = var249.field3129;
                            continue;
                        }
                        if (var467 == 3921) {
                            var5--;
                            int var250 = field804[var5];
                            class214 var251 = (class214) Statics.field229.field3155.get(var250);
                            field805[var6++] = var251.method3747();
                            continue;
                        }
                        if (var467 == 3922) {
                            var5--;
                            int var252 = field804[var5];
                            class214 var253 = (class214) Statics.field229.field3155.get(var252);
                            field805[var6++] = var253.method3746();
                            continue;
                        }
                        if (var467 == 3923) {
                            var5--;
                            int var254 = field804[var5];
                            class214 var255 = (class214) Statics.field229.field3155.get(var254);
                            long var256 = class115.method2082() - Statics.field251 - var255.field3125;
                            int var258 = (int) (var256 / 3600000L);
                            int var259 = (int) ((var256 - (long) (var258 * 3600000)) / 60000L);
                            int var260 = (int) ((var256 - (long) (var258 * 3600000) - (long) (var259 * 60000)) / 1000L);
                            String var261 = var258 + ":" + var259 / 10 + var259 % 10 + ":" + var260 / 10 + var260 % 10;
                            field805[var6++] = var261;
                            continue;
                        }
                        if (var467 == 3924) {
                            var5--;
                            int var262 = field804[var5];
                            class214 var263 = (class214) Statics.field229.field3155.get(var262);
                            field804[var5++] = var263.field3126.field3153;
                            continue;
                        }
                        if (var467 == 3925) {
                            var5--;
                            int var264 = field804[var5];
                            class214 var265 = (class214) Statics.field229.field3155.get(var264);
                            field804[var5++] = var265.field3126.field3150;
                            continue;
                        }
                        if (var467 == 3926) {
                            var5--;
                            int var266 = field804[var5];
                            class214 var267 = (class214) Statics.field229.field3155.get(var266);
                            field804[var5++] = var267.field3126.field3149;
                            continue;
                        }
                    } else if (var467 < 4100) {
                        if (var467 == 4000) {
                            var5 -= 2;
                            int var268 = field804[var5];
                            int var269 = field804[var5 + 1];
                            field804[var5++] = var268 + var269;
                            continue;
                        }
                        if (var467 == 4001) {
                            var5 -= 2;
                            int var270 = field804[var5];
                            int var271 = field804[var5 + 1];
                            field804[var5++] = var270 - var271;
                            continue;
                        }
                        if (var467 == 4002) {
                            var5 -= 2;
                            int var272 = field804[var5];
                            int var273 = field804[var5 + 1];
                            field804[var5++] = var272 * var273;
                            continue;
                        }
                        if (var467 == 4003) {
                            var5 -= 2;
                            int var274 = field804[var5];
                            int var275 = field804[var5 + 1];
                            field804[var5++] = var274 / var275;
                            continue;
                        }
                        if (var467 == 4004) {
                            var5--;
                            int var276 = field804[var5];
                            field804[var5++] = (int) (Math.random() * (double) var276);
                            continue;
                        }
                        if (var467 == 4005) {
                            var5--;
                            int var277 = field804[var5];
                            field804[var5++] = (int) (Math.random() * (double) (var277 + 1));
                            continue;
                        }
                        if (var467 == 4006) {
                            var5 -= 5;
                            int var278 = field804[var5];
                            int var279 = field804[var5 + 1];
                            int var280 = field804[var5 + 2];
                            int var281 = field804[var5 + 3];
                            int var282 = field804[var5 + 4];
                            field804[var5++] = (var279 - var278) * (var282 - var280) / (var281 - var280) + var278;
                            continue;
                        }
                        if (var467 == 4007) {
                            var5 -= 2;
                            int var283 = field804[var5];
                            int var284 = field804[var5 + 1];
                            field804[var5++] = var283 * var284 / 100 + var283;
                            continue;
                        }
                        if (var467 == 4008) {
                            var5 -= 2;
                            int var285 = field804[var5];
                            int var286 = field804[var5 + 1];
                            field804[var5++] = var285 | 0x1 << var286;
                            continue;
                        }
                        if (var467 == 4009) {
                            var5 -= 2;
                            int var287 = field804[var5];
                            int var288 = field804[var5 + 1];
                            field804[var5++] = var287 & -1 - (0x1 << var288);
                            continue;
                        }
                        if (var467 == 4010) {
                            var5 -= 2;
                            int var289 = field804[var5];
                            int var290 = field804[var5 + 1];
                            field804[var5++] = (var289 & 0x1 << var290) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var467 == 4011) {
                            var5 -= 2;
                            int var291 = field804[var5];
                            int var292 = field804[var5 + 1];
                            field804[var5++] = var291 % var292;
                            continue;
                        }
                        if (var467 == 4012) {
                            var5 -= 2;
                            int var293 = field804[var5];
                            int var294 = field804[var5 + 1];
                            if (var293 == 0) {
                                field804[var5++] = 0;
                            } else {
                                field804[var5++] = (int) Math.pow((double) var293, (double) var294);
                            }
                            continue;
                        }
                        if (var467 == 4013) {
                            var5 -= 2;
                            int var295 = field804[var5];
                            int var296 = field804[var5 + 1];
                            if (var295 == 0) {
                                field804[var5++] = 0;
                            } else if (var296 == 0) {
                                field804[var5++] = Integer.MAX_VALUE;
                            } else {
                                field804[var5++] = (int) Math.pow((double) var295, 1.0D / (double) var296);
                            }
                            continue;
                        }
                        if (var467 == 4014) {
                            var5 -= 2;
                            int var297 = field804[var5];
                            int var298 = field804[var5 + 1];
                            field804[var5++] = var297 & var298;
                            continue;
                        }
                        if (var467 == 4015) {
                            var5 -= 2;
                            int var299 = field804[var5];
                            int var300 = field804[var5 + 1];
                            field804[var5++] = var299 | var300;
                            continue;
                        }
                    } else if (var467 < 4200) {
                        if (var467 == 4100) {
                            var6--;
                            String var301 = field805[var6];
                            var5--;
                            int var302 = field804[var5];
                            field805[var6++] = var301 + var302;
                            continue;
                        }
                        if (var467 == 4101) {
                            var6 -= 2;
                            String var303 = field805[var6];
                            String var304 = field805[var6 + 1];
                            field805[var6++] = var303 + var304;
                            continue;
                        }
                        if (var467 == 4102) {
                            var6--;
                            String var305 = field805[var6];
                            var5--;
                            int var306 = field804[var5];
                            String[] var307 = field805;
                            int var308 = var6++;
                            String var310;
                            if (var306 < 0) {
                                var310 = Integer.toString(var306);
                            } else {
                                int var311 = var306;
                                String var312;
                                if (var306 < 0) {
                                    var312 = Integer.toString(var306, 10);
                                } else {
                                    int var313 = 2;
                                    int var314 = var306 / 10;
                                    while (var314 != 0) {
                                        var314 /= 10;
                                        var313++;
                                    }
                                    char[] var315 = new char[var313];
                                    var315[0] = '+';
                                    for (int var316 = var313 - 1; var316 > 0; var316--) {
                                        int var317 = var311;
                                        var311 /= 10;
                                        int var318 = var317 - var311 * 10;
                                        if (var318 >= 10) {
                                            var315[var316] = (char) (var318 + 87);
                                        } else {
                                            var315[var316] = (char) (var318 + 48);
                                        }
                                    }
                                    var312 = new String(var315);
                                }
                                var310 = var312;
                            }
                            var307[var308] = var305 + var310;
                            continue;
                        }
                        if (var467 == 4103) {
                            var6--;
                            String var319 = field805[var6];
                            field805[var6++] = var319.toLowerCase();
                            continue;
                        }
                        if (var467 == 4104) {
                            var5--;
                            int var320 = field804[var5];
                            long var321 = ((long) var320 + 11745L) * 86400000L;
                            field810.setTime(new Date(var321));
                            int var323 = field810.get(5);
                            int var324 = field810.get(2);
                            int var325 = field810.get(1);
                            field805[var6++] = var323 + "-" + field809[var324] + "-" + var325;
                            continue;
                        }
                        if (var467 == 4105) {
                            var6 -= 2;
                            String var326 = field805[var6];
                            String var327 = field805[var6 + 1];
                            if (Statics.field101.field32 != null && Statics.field101.field32.field2888) {
                                field805[var6++] = var327;
                                continue;
                            }
                            field805[var6++] = var326;
                            continue;
                        }
                        if (var467 == 4106) {
                            var5--;
                            int var328 = field804[var5];
                            field805[var6++] = Integer.toString(var328);
                            continue;
                        }
                        if (var467 == 4107) {
                            var6 -= 2;
                            int[] var329 = field804;
                            int var330 = var5++;
                            String var331 = field805[var6];
                            String var332 = field805[var6 + 1];
                            int var333 = client.field302;
                            int var334 = var331.length();
                            int var335 = var332.length();
                            int var336 = 0;
                            int var337 = 0;
                            char var338 = 0;
                            char var339 = 0;
                            int var340;
                            label2799: while (true) {
                                if (var336 - var338 >= var334 && var337 - var339 >= var335) {
                                    int var349 = Math.min(var334, var335);
                                    for (int var350 = 0; var350 < var349; var350++) {
                                        char var353 = var331.charAt(var350);
                                        char var354 = var332.charAt(var350);
                                        if (var353 != var354 && Character.toUpperCase(var353) != Character.toUpperCase(var354)) {
                                            char var355 = Character.toLowerCase(var353);
                                            char var356 = Character.toLowerCase(var354);
                                            if (var355 != var356) {
                                                var340 = class166.method975(var355, var333) - class166.method975(var356, var333);
                                                break label2799;
                                            }
                                        }
                                    }
                                    int var357 = var334 - var335;
                                    if (var357 == 0) {
                                        for (int var358 = 0; var358 < var349; var358++) {
                                            char var359 = var331.charAt(var358);
                                            char var360 = var332.charAt(var358);
                                            if (var359 != var360) {
                                                var340 = class166.method975(var359, var333) - class166.method975(var360, var333);
                                                break label2799;
                                            }
                                        }
                                        var340 = 0;
                                    } else {
                                        var340 = var357;
                                    }
                                    break;
                                }
                                if (var336 - var338 >= var334) {
                                    var340 = -1;
                                    break;
                                }
                                if (var337 - var339 >= var335) {
                                    var340 = 1;
                                    break;
                                }
                                char var341;
                                if (var338 == 0) {
                                    var341 = var331.charAt(var336++);
                                } else {
                                    var341 = var338;
                                    boolean var342 = false;
                                }
                                char var343;
                                if (var339 == 0) {
                                    var343 = var332.charAt(var337++);
                                } else {
                                    var343 = var339;
                                    boolean var344 = false;
                                }
                                var338 = class166.method646(var341);
                                var339 = class166.method646(var343);
                                char var345 = class166.method43(var341, var333);
                                char var346 = class166.method43(var343, var333);
                                if (var345 != var346 && Character.toUpperCase(var345) != Character.toUpperCase(var346)) {
                                    char var347 = Character.toLowerCase(var345);
                                    char var348 = Character.toLowerCase(var346);
                                    if (var347 != var348) {
                                        var340 = class166.method975(var347, var333) - class166.method975(var348, var333);
                                        break;
                                    }
                                }
                            }
                            var329[var330] = class163.method890(var340);
                            continue;
                        }
                        if (var467 == 4108) {
                            var6--;
                            String var361 = field805[var6];
                            var5 -= 2;
                            int var362 = field804[var5];
                            int var363 = field804[var5 + 1];
                            byte[] var364 = Statics.field221.method3073(var363, 0);
                            class224 var365 = new class224(var364);
                            field804[var5++] = var365.method3830(var361, var362);
                            continue;
                        }
                        if (var467 == 4109) {
                            var6--;
                            String var366 = field805[var6];
                            var5 -= 2;
                            int var367 = field804[var5];
                            int var368 = field804[var5 + 1];
                            byte[] var369 = Statics.field221.method3073(var368, 0);
                            class224 var370 = new class224(var369);
                            field804[var5++] = var370.method3873(var366, var367);
                            continue;
                        }
                        if (var467 == 4110) {
                            var6 -= 2;
                            String var371 = field805[var6];
                            String var372 = field805[var6 + 1];
                            var5--;
                            if (field804[var5] == 1) {
                                field805[var6++] = var371;
                            } else {
                                field805[var6++] = var372;
                            }
                            continue;
                        }
                        if (var467 == 4111) {
                            var6--;
                            String var373 = field805[var6];
                            field805[var6++] = class223.method3831(var373);
                            continue;
                        }
                        if (var467 == 4112) {
                            var6--;
                            String var374 = field805[var6];
                            var5--;
                            int var375 = field804[var5];
                            field805[var6++] = var374 + (char) var375;
                            continue;
                        }
                        if (var467 == 4113) {
                            var5--;
                            int var376 = field804[var5];
                            int[] var377 = field804;
                            int var378 = var5++;
                            char var379 = (char) var376;
                            boolean var380;
                            if (var379 >= ' ' && var379 <= '~') {
                                var380 = true;
                            } else if (var379 >= 160 && var379 <= 255) {
                                var380 = true;
                            } else if (var379 == 8364 || var379 == 338 || var379 == 8212 || var379 == 339 || var379 == 376) {
                                var380 = true;
                            } else {
                                var380 = false;
                            }
                            var377[var378] = var380 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 4114) {
                            var5--;
                            int var381 = field804[var5];
                            field804[var5++] = class163.method706((char) var381) ? 1 : 0;
                            continue;
                        }
                        if (var467 == 4115) {
                            var5--;
                            int var382 = field804[var5];
                            int[] var383 = field804;
                            int var384 = var5++;
                            char var385 = (char) var382;
                            boolean var386 = var385 >= 'A' && var385 <= 'Z' || var385 >= 'a' && var385 <= 'z';
                            var383[var384] = var386 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 4116) {
                            var5--;
                            int var387 = field804[var5];
                            field804[var5++] = class163.method127((char) var387) ? 1 : 0;
                            continue;
                        }
                        if (var467 == 4117) {
                            var6--;
                            String var388 = field805[var6];
                            if (var388 == null) {
                                field804[var5++] = 0;
                            } else {
                                field804[var5++] = var388.length();
                            }
                            continue;
                        }
                        if (var467 == 4118) {
                            var6--;
                            String var389 = field805[var6];
                            var5 -= 2;
                            int var390 = field804[var5];
                            int var391 = field804[var5 + 1];
                            field805[var6++] = var389.substring(var390, var391);
                            continue;
                        }
                        if (var467 == 4119) {
                            var6--;
                            String var392 = field805[var6];
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
                            field805[var6++] = var393.toString();
                            continue;
                        }
                        if (var467 == 4120) {
                            var6--;
                            String var397 = field805[var6];
                            var5--;
                            int var398 = field804[var5];
                            field804[var5++] = var397.indexOf(var398);
                            continue;
                        }
                        if (var467 == 4121) {
                            var6 -= 2;
                            String var399 = field805[var6];
                            String var400 = field805[var6 + 1];
                            var5--;
                            int var401 = field804[var5];
                            field804[var5++] = var399.indexOf(var400, var401);
                            continue;
                        }
                    } else if (var467 < 4300) {
                        if (var467 == 4200) {
                            var5--;
                            int var402 = field804[var5];
                            field805[var6++] = class52.method588(var402).field1151;
                            continue;
                        }
                        if (var467 == 4201) {
                            var5 -= 2;
                            int var403 = field804[var5];
                            int var404 = field804[var5 + 1];
                            class52 var405 = class52.method588(var403);
                            if (var404 >= 1 && var404 <= 5 && var405.field1129[var404 - 1] != null) {
                                field805[var6++] = var405.field1129[var404 - 1];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var467 == 4202) {
                            var5 -= 2;
                            int var406 = field804[var5];
                            int var407 = field804[var5 + 1];
                            class52 var408 = class52.method588(var406);
                            if (var407 >= 1 && var407 <= 5 && var408.field1130[var407 - 1] != null) {
                                field805[var6++] = var408.field1130[var407 - 1];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var467 == 4203) {
                            var5--;
                            int var409 = field804[var5];
                            field804[var5++] = class52.method588(var409).field1144;
                            continue;
                        }
                        if (var467 == 4204) {
                            var5--;
                            int var410 = field804[var5];
                            field804[var5++] = class52.method588(var410).field1109 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 4205) {
                            var5--;
                            int var411 = field804[var5];
                            class52 var412 = class52.method588(var411);
                            if (var412.field1146 == -1 && var412.field1145 >= 0) {
                                field804[var5++] = var412.field1145;
                                continue;
                            }
                            field804[var5++] = var411;
                            continue;
                        }
                        if (var467 == 4206) {
                            var5--;
                            int var413 = field804[var5];
                            class52 var414 = class52.method588(var413);
                            if (var414.field1146 >= 0 && var414.field1145 >= 0) {
                                field804[var5++] = var414.field1145;
                                continue;
                            }
                            field804[var5++] = var413;
                            continue;
                        }
                        if (var467 == 4207) {
                            var5--;
                            int var415 = field804[var5];
                            field804[var5++] = class52.method588(var415).field1128 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 4210) {
                            var6--;
                            String var416 = field805[var6];
                            var5--;
                            int var417 = field804[var5];
                            client.method2590(var416, var417 == 1);
                            field804[var5++] = Statics.field2073;
                            continue;
                        }
                        if (var467 == 4211) {
                            if (Statics.field2024 != null && Statics.field1748 < Statics.field2073) {
                                field804[var5++] = Statics.field2024[++Statics.field1748 - 1] & 0xFFFF;
                                continue;
                            }
                            field804[var5++] = -1;
                            continue;
                        }
                        if (var467 == 4212) {
                            Statics.field1748 = 0;
                            continue;
                        }
                    } else if (var467 < 5100) {
                        if (var467 == 5000) {
                            field804[var5++] = client.field406;
                            continue;
                        }
                        if (var467 == 5001) {
                            var5 -= 3;
                            client.field406 = field804[var5];
                            Statics.field717 = class130.method2976(field804[var5 + 1]);
                            if (Statics.field717 == null) {
                                Statics.field717 = class130.field2044;
                            }
                            client.field518 = field804[var5 + 2];
                            client.field341.method2631(70);
                            client.field341.method2499(client.field406);
                            client.field341.method2499(Statics.field717.field2043);
                            client.field341.method2499(client.field518);
                            continue;
                        }
                        if (var467 == 5002) {
                            var6--;
                            String var418 = field805[var6];
                            var5 -= 2;
                            int var419 = field804[var5];
                            int var420 = field804[var5 + 1];
                            client.field341.method2631(198);
                            client.field341.method2499(class119.method2072(var418) + 2);
                            client.field341.method2374(var418);
                            client.field341.method2499(var419 - 1);
                            client.field341.method2499(var420);
                            continue;
                        }
                        if (var467 == 5003) {
                            var5 -= 2;
                            int var421 = field804[var5];
                            int var422 = field804[var5 + 1];
                            class36 var423 = class12.method990(var421, var422);
                            if (var423 == null) {
                                field804[var5++] = -1;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                                field805[var6++] = "";
                                field805[var6++] = "";
                            } else {
                                field804[var5++] = var423.field798;
                                field804[var5++] = var423.field793;
                                field805[var6++] = var423.field795 == null ? "" : var423.field795;
                                field805[var6++] = var423.field796 == null ? "" : var423.field796;
                                field805[var6++] = var423.field794 == null ? "" : var423.field794;
                            }
                            continue;
                        }
                        if (var467 == 5004) {
                            var5--;
                            int var424 = field804[var5];
                            class36 var425 = class12.method2978(var424);
                            if (var425 == null) {
                                field804[var5++] = -1;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                                field805[var6++] = "";
                                field805[var6++] = "";
                            } else {
                                field804[var5++] = var425.field792;
                                field804[var5++] = var425.field793;
                                field805[var6++] = var425.field795 == null ? "" : var425.field795;
                                field805[var6++] = var425.field796 == null ? "" : var425.field796;
                                field805[var6++] = var425.field794 == null ? "" : var425.field794;
                            }
                            continue;
                        }
                        if (var467 == 5005) {
                            if (Statics.field717 == null) {
                                field804[var5++] = -1;
                            } else {
                                field804[var5++] = Statics.field717.field2043;
                            }
                            continue;
                        }
                        if (var467 == 5008) {
                            var6--;
                            String var426 = field805[var6];
                            var5--;
                            int var427 = field804[var5];
                            String var428 = var426.toLowerCase();
                            byte var429 = 0;
                            if (var428.startsWith(class157.field2480)) {
                                var429 = 0;
                                var426 = var426.substring(class157.field2480.length());
                            } else if (var428.startsWith(class157.field2379)) {
                                var429 = 1;
                                var426 = var426.substring(class157.field2379.length());
                            } else if (var428.startsWith(class157.field2336)) {
                                var429 = 2;
                                var426 = var426.substring(class157.field2336.length());
                            } else if (var428.startsWith(class157.field2505)) {
                                var429 = 3;
                                var426 = var426.substring(class157.field2505.length());
                            } else if (var428.startsWith(class157.field2438)) {
                                var429 = 4;
                                var426 = var426.substring(class157.field2438.length());
                            } else if (var428.startsWith(class157.field2344)) {
                                var429 = 5;
                                var426 = var426.substring(class157.field2344.length());
                            } else if (var428.startsWith(class157.field2492)) {
                                var429 = 6;
                                var426 = var426.substring(class157.field2492.length());
                            } else if (var428.startsWith(class157.field2494)) {
                                var429 = 7;
                                var426 = var426.substring(class157.field2494.length());
                            } else if (var428.startsWith(class157.field2534)) {
                                var429 = 8;
                                var426 = var426.substring(class157.field2534.length());
                            } else if (var428.startsWith(class157.field2498)) {
                                var429 = 9;
                                var426 = var426.substring(class157.field2498.length());
                            } else if (var428.startsWith(class157.field2500)) {
                                var429 = 10;
                                var426 = var426.substring(class157.field2500.length());
                            } else if (var428.startsWith(class157.field2502)) {
                                var429 = 11;
                                var426 = var426.substring(class157.field2502.length());
                            } else if (client.field302 != 0) {
                                if (var428.startsWith(class157.field2481)) {
                                    var429 = 0;
                                    var426 = var426.substring(class157.field2481.length());
                                } else if (var428.startsWith(class157.field2450)) {
                                    var429 = 1;
                                    var426 = var426.substring(class157.field2450.length());
                                } else if (var428.startsWith(class157.field2485)) {
                                    var429 = 2;
                                    var426 = var426.substring(class157.field2485.length());
                                } else if (var428.startsWith(class157.field2536)) {
                                    var429 = 3;
                                    var426 = var426.substring(class157.field2536.length());
                                } else if (var428.startsWith(class157.field2489)) {
                                    var429 = 4;
                                    var426 = var426.substring(class157.field2489.length());
                                } else if (var428.startsWith(class157.field2491)) {
                                    var429 = 5;
                                    var426 = var426.substring(class157.field2491.length());
                                } else if (var428.startsWith(class157.field2493)) {
                                    var429 = 6;
                                    var426 = var426.substring(class157.field2493.length());
                                } else if (var428.startsWith(class157.field2495)) {
                                    var429 = 7;
                                    var426 = var426.substring(class157.field2495.length());
                                } else if (var428.startsWith(class157.field2360)) {
                                    var429 = 8;
                                    var426 = var426.substring(class157.field2360.length());
                                } else if (var428.startsWith(class157.field2499)) {
                                    var429 = 9;
                                    var426 = var426.substring(class157.field2499.length());
                                } else if (var428.startsWith(class157.field2304)) {
                                    var429 = 10;
                                    var426 = var426.substring(class157.field2304.length());
                                } else if (var428.startsWith(class157.field2503)) {
                                    var429 = 11;
                                    var426 = var426.substring(class157.field2503.length());
                                }
                            }
                            String var430 = var426.toLowerCase();
                            byte var431 = 0;
                            if (var430.startsWith(class157.field2373)) {
                                var431 = 1;
                                var426 = var426.substring(class157.field2373.length());
                            } else if (var430.startsWith(class157.field2466)) {
                                var431 = 2;
                                var426 = var426.substring(class157.field2466.length());
                            } else if (var430.startsWith(class157.field2508)) {
                                var431 = 3;
                                var426 = var426.substring(class157.field2508.length());
                            } else if (var430.startsWith(class157.field2510)) {
                                var431 = 4;
                                var426 = var426.substring(class157.field2510.length());
                            } else if (var430.startsWith(class157.field2378)) {
                                var431 = 5;
                                var426 = var426.substring(class157.field2378.length());
                            } else if (client.field302 != 0) {
                                if (var430.startsWith(class157.field2550)) {
                                    var431 = 1;
                                    var426 = var426.substring(class157.field2550.length());
                                } else if (var430.startsWith(class157.field2551)) {
                                    var431 = 2;
                                    var426 = var426.substring(class157.field2551.length());
                                } else if (var430.startsWith(class157.field2509)) {
                                    var431 = 3;
                                    var426 = var426.substring(class157.field2509.length());
                                } else if (var430.startsWith(class157.field2539)) {
                                    var431 = 4;
                                    var426 = var426.substring(class157.field2539.length());
                                } else if (var430.startsWith(class157.field2501)) {
                                    var431 = 5;
                                    var426 = var426.substring(class157.field2501.length());
                                }
                            }
                            client.field341.method2631(248);
                            client.field341.method2499(0);
                            int var432 = client.field341.field1973;
                            client.field341.method2499(var427);
                            client.field341.method2499(var429);
                            client.field341.method2499(var431);
                            class222.method176(client.field341, var426);
                            client.field341.method2380(client.field341.field1973 - var432);
                            continue;
                        }
                        if (var467 == 5009) {
                            var6 -= 2;
                            String var433 = field805[var6];
                            String var434 = field805[var6 + 1];
                            client.field341.method2631(137);
                            client.field341.method2369(0);
                            int var435 = client.field341.field1973;
                            client.field341.method2374(var433);
                            class222.method176(client.field341, var434);
                            client.field341.method2379(client.field341.field1973 - var435);
                            continue;
                        }
                        if (var467 == 5015) {
                            String var436;
                            if (Statics.field101 == null || Statics.field101.field41 == null) {
                                var436 = "";
                            } else {
                                var436 = Statics.field101.field41;
                            }
                            field805[var6++] = var436;
                            continue;
                        }
                        if (var467 == 5016) {
                            field804[var5++] = client.field518;
                            continue;
                        }
                        if (var467 == 5017) {
                            var5--;
                            int var437 = field804[var5];
                            field804[var5++] = class12.method1(var437);
                            continue;
                        }
                        if (var467 == 5018) {
                            var5--;
                            int var438 = field804[var5];
                            field804[var5++] = class12.method615(var438);
                            continue;
                        }
                        if (var467 == 5019) {
                            var5--;
                            int var439 = field804[var5];
                            int[] var440 = field804;
                            int var441 = var5++;
                            class36 var442 = (class36) class12.field182.method3593((long) var439);
                            int var443;
                            if (var442 == null) {
                                var443 = -1;
                            } else if (class12.field181.field3079 == var442.field3083) {
                                var443 = -1;
                            } else {
                                var443 = ((class36) var442.field3083).field798;
                            }
                            var440[var441] = var443;
                            continue;
                        }
                        if (var467 == 5020) {
                            var6--;
                            String var444 = field805[var6];
                            if (var444.equalsIgnoreCase("toggleroof")) {
                                Statics.field2871.field152 = !Statics.field2871.field152;
                                class9.method2589();
                                if (Statics.field2871.field152) {
                                    class12.method974(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method974(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var444.equalsIgnoreCase("displayfps")) {
                                client.field562 = !client.field562;
                            }
                            if (client.field453 >= 2) {
                                if (var444.equalsIgnoreCase("fpson")) {
                                    client.field562 = true;
                                }
                                if (var444.equalsIgnoreCase("fpsoff")) {
                                    client.field562 = false;
                                }
                                if (var444.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var444.equalsIgnoreCase("clientdrop")) {
                                    client.method4();
                                }
                                if (var444.equalsIgnoreCase("errortest") && client.field298 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field341.method2631(222);
                            client.field341.method2499(var444.length() + 1);
                            client.field341.method2374(var444);
                            continue;
                        }
                        if (var467 == 5021) {
                            var6--;
                            client.field519 = field805[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var467 == 5022) {
                            field805[var6++] = client.field519;
                            continue;
                        }
                    }
                } else {
                    class173 var79;
                    if (var467 >= 2000) {
                        var467 -= 1000;
                        var5--;
                        var79 = class173.method2977(field804[var5]);
                    } else {
                        var79 = var51 ? Statics.field3132 : Statics.field696;
                    }
                    if (var467 == 1300) {
                        var5--;
                        int var80 = field804[var5] - 1;
                        if (var80 >= 0 && var80 <= 9) {
                            var6--;
                            var79.method3221(var80, field805[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var467 == 1301) {
                        var5 -= 2;
                        int var81 = field804[var5];
                        int var82 = field804[var5 + 1];
                        var79.field2805 = class173.method2077(var81, var82);
                        continue;
                    }
                    if (var467 == 1302) {
                        var5--;
                        var79.field2811 = field804[var5] == 1;
                        continue;
                    }
                    if (var467 == 1303) {
                        var5--;
                        var79.field2806 = field804[var5];
                        continue;
                    }
                    if (var467 == 1304) {
                        var5--;
                        var79.field2762 = field804[var5];
                        continue;
                    }
                    if (var467 == 1305) {
                        var6--;
                        var79.field2723 = field805[var6];
                        continue;
                    }
                    if (var467 == 1306) {
                        var6--;
                        var79.field2809 = field805[var6];
                        continue;
                    }
                    if (var467 == 1307) {
                        var79.field2804 = null;
                        continue;
                    }
                }
                if (var467 < 5400) {
                    if (var467 == 5306) {
                        field804[var5++] = client.method724();
                        continue;
                    }
                    if (var467 == 5307) {
                        var5--;
                        int var445 = field804[var5];
                        if (var445 == 1 || var445 == 2) {
                            client.method2335(var445);
                        }
                        continue;
                    }
                    if (var467 == 5308) {
                        field804[var5++] = Statics.field2871.field150;
                        continue;
                    }
                    if (var467 == 5309) {
                        var5--;
                        int var446 = field804[var5];
                        if (var446 == 1 || var446 == 2) {
                            Statics.field2871.field150 = var446;
                            class9.method2589();
                        }
                        continue;
                    }
                }
                if (var467 < 5600) {
                    if (var467 == 5504) {
                        var5 -= 2;
                        int var447 = field804[var5];
                        int var448 = field804[var5 + 1];
                        if (!client.field548) {
                            client.field384 = var447;
                            client.field385 = var448;
                        }
                        continue;
                    }
                    if (var467 == 5505) {
                        field804[var5++] = client.field384;
                        continue;
                    }
                    if (var467 == 5506) {
                        field804[var5++] = client.field385;
                        continue;
                    }
                    if (var467 == 5530) {
                        var5--;
                        int var449 = field804[var5];
                        if (var449 < 0) {
                            var449 = 0;
                        }
                        client.field390 = var449;
                        continue;
                    }
                    if (var467 == 5531) {
                        field804[var5++] = client.field390;
                        continue;
                    }
                }
                if (var467 >= 5700 || var467 != 5630) {
                    if (var467 < 6300) {
                        if (var467 == 6200) {
                            var5 -= 2;
                            client.field485 = (short) field804[var5];
                            if (client.field485 <= 0) {
                                client.field485 = 256;
                            }
                            client.field555 = (short) field804[var5 + 1];
                            if (client.field555 <= 0) {
                                client.field555 = 205;
                            }
                            continue;
                        }
                        if (var467 == 6201) {
                            var5 -= 2;
                            client.field556 = (short) field804[var5];
                            if (client.field556 <= 0) {
                                client.field556 = 256;
                            }
                            client.field557 = (short) field804[var5 + 1];
                            if (client.field557 <= 0) {
                                client.field557 = 320;
                            }
                            continue;
                        }
                        if (var467 == 6202) {
                            var5 -= 4;
                            client.field558 = (short) field804[var5];
                            if (client.field558 <= 0) {
                                client.field558 = 1;
                            }
                            client.field474 = (short) field804[var5 + 1];
                            if (client.field474 <= 0) {
                                client.field474 = 32767;
                            } else if (client.field474 < client.field558) {
                                client.field474 = client.field558;
                            }
                            client.field335 = (short) field804[var5 + 2];
                            if (client.field335 <= 0) {
                                client.field335 = 1;
                            }
                            client.field561 = (short) field804[var5 + 3];
                            if (client.field561 <= 0) {
                                client.field561 = 32767;
                            } else if (client.field561 < client.field335) {
                                client.field561 = client.field335;
                            }
                            continue;
                        }
                        if (var467 == 6203) {
                            if (client.field471 == null) {
                                field804[var5++] = -1;
                                field804[var5++] = -1;
                            } else {
                                client.method185(0, 0, client.field471.field2747, client.field471.field2748, false);
                                field804[var5++] = client.field522;
                                field804[var5++] = client.field565;
                            }
                            continue;
                        }
                        if (var467 == 6204) {
                            field804[var5++] = client.field556;
                            field804[var5++] = client.field557;
                            continue;
                        }
                        if (var467 == 6205) {
                            field804[var5++] = client.field485;
                            field804[var5++] = client.field555;
                            continue;
                        }
                    }
                    if (var467 < 6600) {
                        if (var467 == 6500) {
                            field804[var5++] = class26.method689() ? 1 : 0;
                            continue;
                        }
                        if (var467 == 6501) {
                            class26 var450 = class26.method569();
                            if (var450 == null) {
                                field804[var5++] = -1;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                                field804[var5++] = 0;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                            } else {
                                field804[var5++] = var450.field655;
                                field804[var5++] = var450.field660;
                                field805[var6++] = var450.field663;
                                field804[var5++] = var450.field664;
                                field804[var5++] = var450.field661;
                                field805[var6++] = var450.field662;
                            }
                            continue;
                        }
                        if (var467 == 6502) {
                            class26 var451;
                            if (class26.field659 < class26.field654) {
                                var451 = Statics.field651[++class26.field659 - 1];
                            } else {
                                var451 = null;
                            }
                            if (var451 == null) {
                                field804[var5++] = -1;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                                field804[var5++] = 0;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                            } else {
                                field804[var5++] = var451.field655;
                                field804[var5++] = var451.field660;
                                field805[var6++] = var451.field663;
                                field804[var5++] = var451.field664;
                                field804[var5++] = var451.field661;
                                field805[var6++] = var451.field662;
                            }
                            continue;
                        }
                        if (var467 == 6506) {
                            var5--;
                            int var453 = field804[var5];
                            class26 var454 = null;
                            for (int var455 = 0; var455 < class26.field654; var455++) {
                                if (Statics.field651[var455].field655 == var453) {
                                    var454 = Statics.field651[var455];
                                    break;
                                }
                            }
                            if (var454 == null) {
                                field804[var5++] = -1;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                                field804[var5++] = 0;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                            } else {
                                field804[var5++] = var454.field655;
                                field804[var5++] = var454.field660;
                                field805[var6++] = var454.field663;
                                field804[var5++] = var454.field664;
                                field804[var5++] = var454.field661;
                                field805[var6++] = var454.field662;
                            }
                            continue;
                        }
                        if (var467 == 6507) {
                            var5 -= 4;
                            int var456 = field804[var5];
                            boolean var457 = field804[var5 + 1] == 1;
                            int var458 = field804[var5 + 2];
                            boolean var459 = field804[var5 + 3] == 1;
                            if (Statics.field651 != null) {
                                class26.method2309(0, Statics.field651.length - 1, var456, var457, var458, var459);
                            }
                            continue;
                        }
                        if (var467 == 6511) {
                            var5--;
                            int var460 = field804[var5];
                            if (var460 >= 0 && var460 < class26.field654) {
                                class26 var461 = Statics.field651[var460];
                                field804[var5++] = var461.field655;
                                field804[var5++] = var461.field660;
                                field805[var6++] = var461.field663;
                                field804[var5++] = var461.field664;
                                field804[var5++] = var461.field661;
                                field805[var6++] = var461.field662;
                                continue;
                            }
                            field804[var5++] = -1;
                            field804[var5++] = 0;
                            field805[var6++] = "";
                            field804[var5++] = 0;
                            field804[var5++] = 0;
                            field805[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field481 = 250;
            }
        } catch (Exception var466) {
            StringBuilder var463 = new StringBuilder(30);
            var463.append("").append(var4.field3093).append(" ");
            for (int var464 = field806 - 1; var464 >= 0; var464--) {
                var463.append("").append(field808[var464].field213.field3093).append(" ");
            }
            var463.append("").append(var10);
            class148.method190(var463.toString(), var466);
        }
    }

    @ObfuscatedName("af.q(IB)V")
    public static void method644(int arg0) {
        if (arg0 == -1 || !class173.method692(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2791[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2751 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field9 = var3.field2751;
                method2681(var4, 2000000);
            }
        }
    }
}
