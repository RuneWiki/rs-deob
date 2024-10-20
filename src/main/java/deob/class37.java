package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ai")
public class class37 {

    @ObfuscatedName("ai.y")
    public static int[] field806 = new int[5];

    @ObfuscatedName("ai.e")
    public static int[][] field802 = new int[5][5000];

    @ObfuscatedName("ai.g")
    public static int[] field803 = new int[1000];

    @ObfuscatedName("ai.m")
    public static String[] field804 = new String[1000];

    @ObfuscatedName("ai.j")
    public static int field805 = 0;

    @ObfuscatedName("ai.n")
    public static class15[] field798 = new class15[50];

    @ObfuscatedName("ai.i")
    public static Calendar field808 = Calendar.getInstance();

    @ObfuscatedName("ai.v")
    public static final String[] field810 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ai.z")
    public static int field809 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ed.a(La;I)V")
    public static void method2928(class1 arg0) {
        method1496(arg0, 200000);
    }

    @ObfuscatedName("bi.r(La;II)V")
    public static void method1496(class1 arg0, int arg1) {
        Object[] var2 = arg0.field9;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method798(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field597;
        int[] var9 = var4.field598;
        byte var10 = -1;
        field805 = 0;
        try {
            Statics.field799 = new int[var4.field600];
            int var11 = 0;
            Statics.field800 = new String[var4.field601];
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
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2801;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2745;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2801;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2745;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field11;
                    }
                    Statics.field799[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1;
                    }
                    Statics.field800[var12++] = var15;
                }
            }
            int var16 = 0;
            field809 = arg0.field10;
            label2963: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var461 = var8[var7];
                if (var461 < 100) {
                    if (var461 == 0) {
                        field803[var5++] = var9[var7];
                        continue;
                    }
                    if (var461 == 1) {
                        int var17 = var9[var7];
                        field803[var5++] = class176.field2891[var17];
                        continue;
                    }
                    if (var461 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2891[var18] = field803[var5];
                        Statics.method934(var18);
                        continue;
                    }
                    if (var461 == 3) {
                        field804[var6++] = var4.field599[var7];
                        continue;
                    }
                    if (var461 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var461 == 7) {
                        var5 -= 2;
                        if (field803[var5 + 1] != field803[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 8) {
                        var5 -= 2;
                        if (field803[var5 + 1] == field803[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 9) {
                        var5 -= 2;
                        if (field803[var5] < field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 10) {
                        var5 -= 2;
                        if (field803[var5] > field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 21) {
                        if (field805 == 0) {
                            return;
                        }
                        class15 var19 = field798[--field805];
                        var4 = var19.field214;
                        var8 = var4.field597;
                        var9 = var4.field598;
                        var7 = var19.field204;
                        Statics.field799 = var19.field208;
                        Statics.field800 = var19.field203;
                        continue;
                    }
                    if (var461 == 25) {
                        int var20 = var9[var7];
                        field803[var5++] = class176.method2646(var20);
                        continue;
                    }
                    if (var461 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class176.method3151(var21, field803[var5]);
                        continue;
                    }
                    if (var461 == 31) {
                        var5 -= 2;
                        if (field803[var5] <= field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 32) {
                        var5 -= 2;
                        if (field803[var5] >= field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var461 == 33) {
                        field803[var5++] = Statics.field799[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var461 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field799[var10001] = field803[var5];
                        continue;
                    }
                    if (var461 == 35) {
                        field804[var6++] = Statics.field800[var9[var7]];
                        continue;
                    }
                    if (var461 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field800[var10001] = field804[var6];
                        continue;
                    }
                    if (var461 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field804;
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
                        field804[var6++] = var24;
                        continue;
                    }
                    if (var461 == 38) {
                        var5--;
                        continue;
                    }
                    if (var461 == 39) {
                        var6--;
                        continue;
                    }
                    if (var461 == 40) {
                        int var34 = var9[var7];
                        class23 var35 = class23.method798(var34);
                        int[] var36 = new int[var35.field600];
                        String[] var37 = new String[var35.field601];
                        for (int var38 = 0; var38 < var35.field602; var38++) {
                            var36[var38] = field803[var5 - var35.field602 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field596; var39++) {
                            var37[var39] = field804[var6 - var35.field596 + var39];
                        }
                        var5 -= var35.field602;
                        var6 -= var35.field596;
                        class15 var40 = new class15();
                        var40.field214 = var4;
                        var40.field204 = var7;
                        var40.field208 = Statics.field799;
                        var40.field203 = Statics.field800;
                        field798[++field805 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field597;
                        var9 = var35.field598;
                        var7 = -1;
                        Statics.field799 = var36;
                        Statics.field800 = var37;
                        continue;
                    }
                    if (var461 == 42) {
                        field803[var5++] = Statics.field1959.method212(var9[var7]);
                        continue;
                    }
                    if (var461 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1959.method210(var10001, field803[var5]);
                        continue;
                    }
                    if (var461 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field803[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field806[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2963;
                                }
                                field802[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var461 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field803[var5];
                        if (var47 >= 0 && var47 < field806[var46]) {
                            field803[var5++] = field802[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var461 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field803[var5];
                        if (var49 >= 0 && var49 < field806[var48]) {
                            field802[var48][var49] = field803[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var461 == 47) {
                        String var50 = Statics.field1959.method217(var9[var7]);
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field804[var6++] = var50;
                        continue;
                    }
                    if (var461 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1959.method216(var10001, field804[var6]);
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var461 < 1000) {
                    if (var461 == 100) {
                        var5 -= 3;
                        int var52 = field803[var5];
                        int var53 = field803[var5 + 1];
                        int var54 = field803[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var55 = class173.method2041(var52);
                        if (var55.field2866 == null) {
                            var55.field2866 = new class173[var54 + 1];
                        }
                        if (var55.field2866.length <= var54) {
                            class173[] var56 = new class173[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2866.length; var57++) {
                                var56[var57] = var55.field2866[var57];
                            }
                            var55.field2866 = var56;
                        }
                        if (var54 > 0 && var55.field2866[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class173 var58 = new class173();
                        var58.field2765 = var53;
                        var58.field2763 = var58.field2801 = var55.field2801;
                        var58.field2745 = var54;
                        var58.field2743 = true;
                        var55.field2866[var54] = var58;
                        if (var51) {
                            Statics.field807 = var58;
                        } else {
                            Statics.field585 = var58;
                        }
                        client.method723(var55);
                        continue;
                    }
                    if (var461 == 101) {
                        class173 var59 = var51 ? Statics.field807 : Statics.field585;
                        class173 var60 = class173.method2041(var59.field2801);
                        var60.field2866[var59.field2745] = null;
                        client.method723(var60);
                        continue;
                    }
                    if (var461 == 102) {
                        var5--;
                        class173 var61 = class173.method2041(field803[var5]);
                        var61.field2866 = null;
                        client.method723(var61);
                        continue;
                    }
                    if (var461 == 200) {
                        var5 -= 2;
                        int var62 = field803[var5];
                        int var63 = field803[var5 + 1];
                        class173 var64 = class173.method176(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field803[var5++] = 1;
                            if (var51) {
                                Statics.field807 = var64;
                            } else {
                                Statics.field585 = var64;
                            }
                            continue;
                        }
                        field803[var5++] = 0;
                        continue;
                    }
                    if (var461 == 201) {
                        var5--;
                        class173 var65 = class173.method2041(field803[var5]);
                        if (var65 == null) {
                            field803[var5++] = 0;
                        } else {
                            field803[var5++] = 1;
                            if (var51) {
                                Statics.field807 = var65;
                            } else {
                                Statics.field585 = var65;
                            }
                        }
                        continue;
                    }
                } else if (var461 >= 1000 && var461 < 1100 || var461 >= 2000 && var461 < 2100) {
                    int var66 = -1;
                    class173 var67;
                    if (var461 >= 2000) {
                        var461 -= 1000;
                        var5--;
                        var66 = field803[var5];
                        var67 = class173.method2041(var66);
                    } else {
                        var67 = var51 ? Statics.field807 : Statics.field585;
                    }
                    if (var461 == 1000) {
                        var5 -= 4;
                        var67.field2744 = field803[var5];
                        var67.field2754 = field803[var5 + 1];
                        var67.field2749 = field803[var5 + 2];
                        var67.field2750 = field803[var5 + 3];
                        client.method723(var67);
                        client.method1960(var67);
                        if (var66 != -1 && var67.field2765 == 0) {
                            client.method15(Statics.field2851[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var461 == 1001) {
                        var5 -= 4;
                        var67.field2784 = field803[var5];
                        var67.field2756 = field803[var5 + 1];
                        var67.field2751 = field803[var5 + 2];
                        var67.field2752 = field803[var5 + 3];
                        client.method723(var67);
                        client.method1960(var67);
                        if (var66 != -1 && var67.field2765 == 0) {
                            client.method15(Statics.field2851[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var461 == 1003) {
                        var5--;
                        boolean var68 = field803[var5] == 1;
                        if (var67.field2764 != var68) {
                            var67.field2764 = var68;
                            client.method723(var67);
                        }
                        continue;
                    }
                    if (var461 == 1005) {
                        var5--;
                        var67.field2875 = field803[var5] == 1;
                        continue;
                    }
                    if (var461 == 1006) {
                        var5--;
                        var67.field2876 = field803[var5] == 1;
                        continue;
                    }
                } else if (var461 >= 1100 && var461 < 1200 || var461 >= 2100 && var461 < 2200) {
                    int var69 = -1;
                    class173 var70;
                    if (var461 >= 2000) {
                        var461 -= 1000;
                        var5--;
                        var69 = field803[var5];
                        var70 = class173.method2041(var69);
                    } else {
                        var70 = var51 ? Statics.field807 : Statics.field585;
                    }
                    if (var461 == 1100) {
                        var5 -= 2;
                        var70.field2804 = field803[var5];
                        if (var70.field2804 > var70.field2767 - var70.field2753) {
                            var70.field2804 = var70.field2767 - var70.field2753;
                        }
                        if (var70.field2804 < 0) {
                            var70.field2804 = 0;
                        }
                        var70.field2766 = field803[var5 + 1];
                        if (var70.field2766 > var70.field2814 - var70.field2760) {
                            var70.field2766 = var70.field2814 - var70.field2760;
                        }
                        if (var70.field2766 < 0) {
                            var70.field2766 = 0;
                        }
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1101) {
                        var5--;
                        var70.field2769 = field803[var5];
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1102) {
                        var5--;
                        var70.field2773 = field803[var5] == 1;
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1103) {
                        var5--;
                        var70.field2774 = field803[var5];
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1104) {
                        var5--;
                        var70.field2805 = field803[var5];
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1105) {
                        var5--;
                        var70.field2777 = field803[var5];
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1106) {
                        var5--;
                        var70.field2780 = field803[var5];
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1107) {
                        var5--;
                        var70.field2822 = field803[var5] == 1;
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1108) {
                        var70.field2785 = 1;
                        var5--;
                        var70.field2847 = field803[var5];
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1109) {
                        var5 -= 6;
                        var70.field2791 = field803[var5];
                        var70.field2794 = field803[var5 + 1];
                        var70.field2793 = field803[var5 + 2];
                        var70.field2803 = field803[var5 + 3];
                        var70.field2795 = field803[var5 + 4];
                        var70.field2796 = field803[var5 + 5];
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1110) {
                        var5--;
                        int var71 = field803[var5];
                        if (var70.field2789 != var71) {
                            var70.field2789 = var71;
                            var70.field2809 = 0;
                            var70.field2865 = 0;
                            client.method723(var70);
                        }
                        continue;
                    }
                    if (var461 == 1111) {
                        var5--;
                        var70.field2818 = field803[var5] == 1;
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1112) {
                        var6--;
                        String var72 = field804[var6];
                        if (!var72.equals(var70.field2779)) {
                            var70.field2779 = var72;
                            client.method723(var70);
                        }
                        continue;
                    }
                    if (var461 == 1113) {
                        var5--;
                        var70.field2832 = field803[var5];
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1114) {
                        var5 -= 3;
                        var70.field2820 = field803[var5];
                        var70.field2867 = field803[var5 + 1];
                        var70.field2742 = field803[var5 + 2];
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1115) {
                        var5--;
                        var70.field2786 = field803[var5] == 1;
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1116) {
                        var5--;
                        var70.field2781 = field803[var5];
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1117) {
                        var5--;
                        var70.field2782 = field803[var5];
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1118) {
                        var5--;
                        var70.field2862 = field803[var5] == 1;
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1119) {
                        var5--;
                        var70.field2844 = field803[var5] == 1;
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1120) {
                        var5 -= 2;
                        var70.field2767 = field803[var5];
                        var70.field2814 = field803[var5 + 1];
                        client.method723(var70);
                        if (var69 != -1 && var70.field2765 == 0) {
                            client.method15(Statics.field2851[var69 >> 16], var70, false);
                        }
                        continue;
                    }
                    if (var461 == 1121) {
                        int var73 = var70.field2801;
                        int var74 = var70.field2745;
                        client.field302.method2586(159);
                        client.field302.method2485(var73);
                        client.field302.method2378(var74);
                        client.field432 = var70;
                        client.method723(var70);
                        continue;
                    }
                    if (var461 == 1122) {
                        var5--;
                        var70.field2778 = field803[var5];
                        client.method723(var70);
                        continue;
                    }
                } else if (var461 >= 1200 && var461 < 1300 || var461 >= 2200 && var461 < 2300) {
                    class173 var75;
                    if (var461 >= 2000) {
                        var461 -= 1000;
                        var5--;
                        var75 = class173.method2041(field803[var5]);
                    } else {
                        var75 = var51 ? Statics.field807 : Statics.field585;
                    }
                    client.method723(var75);
                    if (var461 == 1200 || var461 == 1205 || var461 == 1212) {
                        var5 -= 2;
                        int var76 = field803[var5];
                        int var77 = field803[var5 + 1];
                        var75.field2835 = var76;
                        var75.field2863 = var77;
                        class52 var78 = class52.method1531(var76);
                        var75.field2793 = var78.field1142;
                        var75.field2803 = var78.field1123;
                        var75.field2795 = var78.field1150;
                        var75.field2791 = var78.field1125;
                        var75.field2794 = var78.field1126;
                        var75.field2796 = var78.field1128;
                        if (var461 == 1205) {
                            var75.field2840 = 0;
                        } else if (var461 == 1212 | var78.field1127 == 1) {
                            var75.field2840 = 1;
                        } else {
                            var75.field2840 = 2;
                        }
                        if (var75.field2797 > 0) {
                            var75.field2796 = var75.field2796 * 32 / var75.field2797;
                        } else if (var75.field2784 > 0) {
                            var75.field2796 = var75.field2796 * 32 / var75.field2784;
                        }
                        continue;
                    }
                    if (var461 == 1201) {
                        var75.field2785 = 2;
                        var5--;
                        var75.field2847 = field803[var5];
                        continue;
                    }
                    if (var461 == 1202) {
                        var75.field2785 = 3;
                        var75.field2847 = Statics.field2254.field44.method3276();
                        continue;
                    }
                } else if (var461 >= 1300 && var461 < 1400 || var461 >= 2300 && var461 < 2400) {
                    class173 var79;
                    if (var461 >= 2000) {
                        var461 -= 1000;
                        var5--;
                        var79 = class173.method2041(field803[var5]);
                    } else {
                        var79 = var51 ? Statics.field807 : Statics.field585;
                    }
                    if (var461 == 1300) {
                        var5--;
                        int var80 = field803[var5] - 1;
                        if (var80 >= 0 && var80 <= 9) {
                            var6--;
                            var79.method3209(var80, field804[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var461 == 1301) {
                        var5 -= 2;
                        int var81 = field803[var5];
                        int var82 = field803[var5 + 1];
                        var79.field2817 = class173.method176(var81, var82);
                        continue;
                    }
                    if (var461 == 1302) {
                        var5--;
                        var79.field2755 = field803[var5] == 1;
                        continue;
                    }
                    if (var461 == 1303) {
                        var5--;
                        var79.field2733 = field803[var5];
                        continue;
                    }
                    if (var461 == 1304) {
                        var5--;
                        var79.field2819 = field803[var5];
                        continue;
                    }
                    if (var461 == 1305) {
                        var6--;
                        var79.field2815 = field804[var6];
                        continue;
                    }
                    if (var461 == 1306) {
                        var6--;
                        var79.field2821 = field804[var6];
                        continue;
                    }
                    if (var461 == 1307) {
                        var79.field2816 = null;
                        continue;
                    }
                } else {
                    if (var461 >= 1400 && var461 < 1500 || var461 >= 2400 && var461 < 2500) {
                        class173 var83;
                        if (var461 >= 2000) {
                            var461 -= 1000;
                            var5--;
                            var83 = class173.method2041(field803[var5]);
                        } else {
                            var83 = var51 ? Statics.field807 : Statics.field585;
                        }
                        var6--;
                        String var84 = field804[var6];
                        int[] var85 = null;
                        if (var84.length() > 0 && var84.charAt(var84.length() - 1) == 'Y') {
                            var5--;
                            int var86 = field803[var5];
                            if (var86 > 0) {
                                var85 = new int[var86];
                                while (var86-- > 0) {
                                    var5--;
                                    var85[var86] = field803[var5];
                                }
                            }
                            var84 = var84.substring(0, var84.length() - 1);
                        }
                        Object[] var87 = new Object[var84.length() + 1];
                        for (int var88 = var87.length - 1; var88 >= 1; var88--) {
                            if (var84.charAt(var88 - 1) == 's') {
                                var6--;
                                var87[var88] = field804[var6];
                            } else {
                                var5--;
                                var87[var88] = Integer.valueOf(field803[var5]);
                            }
                        }
                        var5--;
                        int var89 = field803[var5];
                        if (var89 == -1) {
                            var87 = null;
                        } else {
                            var87[0] = Integer.valueOf(var89);
                        }
                        if (var461 == 1400) {
                            var83.field2740 = var87;
                        }
                        if (var461 == 1401) {
                            var83.field2827 = var87;
                        }
                        if (var461 == 1402) {
                            var83.field2826 = var87;
                        }
                        if (var461 == 1403) {
                            var83.field2828 = var87;
                        }
                        if (var461 == 1404) {
                            var83.field2830 = var87;
                        }
                        if (var461 == 1405) {
                            var83.field2831 = var87;
                        }
                        if (var461 == 1406) {
                            var83.field2857 = var87;
                        }
                        if (var461 == 1407) {
                            var83.field2757 = var87;
                            var83.field2836 = var85;
                        }
                        if (var461 == 1408) {
                            var83.field2841 = var87;
                        }
                        if (var461 == 1409) {
                            var83.field2842 = var87;
                        }
                        if (var461 == 1410) {
                            var83.field2768 = var87;
                        }
                        if (var461 == 1411) {
                            var83.field2825 = var87;
                        }
                        if (var461 == 1412) {
                            var83.field2829 = var87;
                        }
                        if (var461 == 1414) {
                            var83.field2837 = var87;
                            var83.field2834 = var85;
                        }
                        if (var461 == 1415) {
                            var83.field2839 = var87;
                            var83.field2813 = var85;
                        }
                        if (var461 == 1416) {
                            var83.field2833 = var87;
                        }
                        if (var461 == 1417) {
                            var83.field2843 = var87;
                        }
                        if (var461 == 1418) {
                            var83.field2812 = var87;
                        }
                        if (var461 == 1419) {
                            var83.field2845 = var87;
                        }
                        if (var461 == 1420) {
                            var83.field2869 = var87;
                        }
                        if (var461 == 1421) {
                            var83.field2741 = var87;
                        }
                        if (var461 == 1422) {
                            var83.field2848 = var87;
                        }
                        if (var461 == 1423) {
                            var83.field2849 = var87;
                        }
                        if (var461 == 1424) {
                            var83.field2850 = var87;
                        }
                        if (var461 == 1425) {
                            var83.field2852 = var87;
                        }
                        if (var461 == 1426) {
                            var83.field2853 = var87;
                        }
                        if (var461 == 1427) {
                            var83.field2800 = var87;
                        }
                        var83.field2759 = true;
                        continue;
                    }
                    if (var461 < 1600) {
                        class173 var90 = var51 ? Statics.field807 : Statics.field585;
                        if (var461 == 1500) {
                            field803[var5++] = var90.field2735;
                            continue;
                        }
                        if (var461 == 1501) {
                            field803[var5++] = var90.field2758;
                            continue;
                        }
                        if (var461 == 1502) {
                            field803[var5++] = var90.field2753;
                            continue;
                        }
                        if (var461 == 1503) {
                            field803[var5++] = var90.field2760;
                            continue;
                        }
                        if (var461 == 1504) {
                            field803[var5++] = var90.field2764 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 1505) {
                            field803[var5++] = var90.field2763;
                            continue;
                        }
                    } else if (var461 < 1700) {
                        class173 var91 = var51 ? Statics.field807 : Statics.field585;
                        if (var461 == 1600) {
                            field803[var5++] = var91.field2804;
                            continue;
                        }
                        if (var461 == 1601) {
                            field803[var5++] = var91.field2766;
                            continue;
                        }
                        if (var461 == 1602) {
                            field804[var6++] = var91.field2779;
                            continue;
                        }
                        if (var461 == 1603) {
                            field803[var5++] = var91.field2767;
                            continue;
                        }
                        if (var461 == 1604) {
                            field803[var5++] = var91.field2814;
                            continue;
                        }
                        if (var461 == 1605) {
                            field803[var5++] = var91.field2796;
                            continue;
                        }
                        if (var461 == 1606) {
                            field803[var5++] = var91.field2793;
                            continue;
                        }
                        if (var461 == 1607) {
                            field803[var5++] = var91.field2795;
                            continue;
                        }
                        if (var461 == 1608) {
                            field803[var5++] = var91.field2803;
                            continue;
                        }
                        if (var461 == 1609) {
                            field803[var5++] = var91.field2774;
                            continue;
                        }
                    } else if (var461 < 1800) {
                        class173 var92 = var51 ? Statics.field807 : Statics.field585;
                        if (var461 == 1700) {
                            field803[var5++] = var92.field2835;
                            continue;
                        }
                        if (var461 == 1701) {
                            if (var92.field2835 == -1) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = var92.field2863;
                            }
                            continue;
                        }
                        if (var461 == 1702) {
                            field803[var5++] = var92.field2745;
                            continue;
                        }
                    } else if (var461 < 1900) {
                        class173 var93 = var51 ? Statics.field807 : Statics.field585;
                        if (var461 == 1800) {
                            int[] var94 = field803;
                            int var95 = var5++;
                            int var96 = client.method2141(var93);
                            int var97 = var96 >> 11 & 0x3F;
                            var94[var95] = var97;
                            continue;
                        }
                        if (var461 == 1801) {
                            var5--;
                            int var98 = field803[var5];
                            int var462 = var98 - 1;
                            if (var93.field2816 != null && var462 < var93.field2816.length && var93.field2816[var462] != null) {
                                field804[var6++] = var93.field2816[var462];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var461 == 1802) {
                            if (var93.field2815 == null) {
                                field804[var6++] = "";
                            } else {
                                field804[var6++] = var93.field2815;
                            }
                            continue;
                        }
                    } else if (!(var461 < 1900 || var461 >= 2000) || !(var461 < 2900 || var461 >= 3000)) {
                        class173 var99;
                        if (var461 >= 2000) {
                            var461 -= 1000;
                            var5--;
                            var99 = class173.method2041(field803[var5]);
                        } else {
                            var99 = var51 ? Statics.field807 : Statics.field585;
                        }
                        if (var461 == 1927) {
                            if (field809 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var99.field2800 == null) {
                                return;
                            }
                            class1 var100 = new class1();
                            var100.field7 = var99;
                            var100.field9 = var99.field2800;
                            var100.field10 = field809 + 1;
                            client.field293.method3570(arg0);
                            continue;
                        }
                    } else if (var461 < 2600) {
                        var5--;
                        class173 var101 = class173.method2041(field803[var5]);
                        if (var461 == 2500) {
                            field803[var5++] = var101.field2735;
                            continue;
                        }
                        if (var461 == 2501) {
                            field803[var5++] = var101.field2758;
                            continue;
                        }
                        if (var461 == 2502) {
                            field803[var5++] = var101.field2753;
                            continue;
                        }
                        if (var461 == 2503) {
                            field803[var5++] = var101.field2760;
                            continue;
                        }
                        if (var461 == 2504) {
                            field803[var5++] = var101.field2764 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 2505) {
                            field803[var5++] = var101.field2763;
                            continue;
                        }
                    } else if (var461 < 2700) {
                        var5--;
                        class173 var102 = class173.method2041(field803[var5]);
                        if (var461 == 2600) {
                            field803[var5++] = var102.field2804;
                            continue;
                        }
                        if (var461 == 2601) {
                            field803[var5++] = var102.field2766;
                            continue;
                        }
                        if (var461 == 2602) {
                            field804[var6++] = var102.field2779;
                            continue;
                        }
                        if (var461 == 2603) {
                            field803[var5++] = var102.field2767;
                            continue;
                        }
                        if (var461 == 2604) {
                            field803[var5++] = var102.field2814;
                            continue;
                        }
                        if (var461 == 2605) {
                            field803[var5++] = var102.field2796;
                            continue;
                        }
                        if (var461 == 2606) {
                            field803[var5++] = var102.field2793;
                            continue;
                        }
                        if (var461 == 2607) {
                            field803[var5++] = var102.field2795;
                            continue;
                        }
                        if (var461 == 2608) {
                            field803[var5++] = var102.field2803;
                            continue;
                        }
                        if (var461 == 2609) {
                            field803[var5++] = var102.field2774;
                            continue;
                        }
                    } else if (var461 < 2800) {
                        if (var461 == 2700) {
                            var5--;
                            class173 var103 = class173.method2041(field803[var5]);
                            field803[var5++] = var103.field2835;
                            continue;
                        }
                        if (var461 == 2701) {
                            var5--;
                            class173 var104 = class173.method2041(field803[var5]);
                            if (var104.field2835 == -1) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = var104.field2863;
                            }
                            continue;
                        }
                        if (var461 == 2702) {
                            var5--;
                            int var105 = field803[var5];
                            class4 var106 = (class4) client.field455.method3539((long) var105);
                            if (var106 == null) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = 1;
                            }
                            continue;
                        }
                        if (var461 == 2706) {
                            field803[var5++] = client.field454;
                            continue;
                        }
                    } else if (var461 < 2900) {
                        var5--;
                        class173 var107 = class173.method2041(field803[var5]);
                        if (var461 == 2800) {
                            int[] var108 = field803;
                            int var109 = var5++;
                            int var110 = client.method2141(var107);
                            int var111 = var110 >> 11 & 0x3F;
                            var108[var109] = var111;
                            continue;
                        }
                        if (var461 == 2801) {
                            var5--;
                            int var112 = field803[var5];
                            int var463 = var112 - 1;
                            if (var107.field2816 != null && var463 < var107.field2816.length && var107.field2816[var463] != null) {
                                field804[var6++] = var107.field2816[var463];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var461 == 2802) {
                            if (var107.field2815 == null) {
                                field804[var6++] = "";
                            } else {
                                field804[var6++] = var107.field2815;
                            }
                            continue;
                        }
                    } else if (var461 < 3200) {
                        if (var461 == 3100) {
                            var6--;
                            String var113 = field804[var6];
                            class12.method2769(0, "", var113);
                            continue;
                        }
                        if (var461 == 3101) {
                            var5 -= 2;
                            client.method179(Statics.field2254, field803[var5], field803[var5 + 1]);
                            continue;
                        }
                        if (var461 == 3103) {
                            client.field302.method2586(138);
                            for (class4 var114 = (class4) client.field455.method3551(); var114 != null; var114 = (class4) client.field455.method3542()) {
                                if (var114.field63 == 0 || var114.field63 == 3) {
                                    client.method2279(var114, true);
                                }
                            }
                            if (client.field432 != null) {
                                client.method723(client.field432);
                                client.field432 = null;
                            }
                            continue;
                        }
                        if (var461 == 3104) {
                            var6--;
                            String var115 = field804[var6];
                            int var116 = 0;
                            if (class163.method3498(var115)) {
                                int var117 = class163.method2271(var115, 10, true);
                                var116 = var117;
                            }
                            client.field302.method2586(91);
                            client.field302.method2496(var116);
                            continue;
                        }
                        if (var461 == 3105) {
                            var6--;
                            String var118 = field804[var6];
                            client.field302.method2586(131);
                            client.field302.method2330(var118.length() + 1);
                            client.field302.method2336(var118);
                            continue;
                        }
                        if (var461 == 3106) {
                            var6--;
                            String var119 = field804[var6];
                            client.field302.method2586(252);
                            client.field302.method2330(var119.length() + 1);
                            client.field302.method2336(var119);
                            continue;
                        }
                        if (var461 == 3107) {
                            var5--;
                            int var120 = field803[var5];
                            var6--;
                            String var121 = field804[var6];
                            client.method983(var120, var121);
                            continue;
                        }
                        if (var461 == 3108) {
                            var5 -= 3;
                            int var122 = field803[var5];
                            int var123 = field803[var5 + 1];
                            int var124 = field803[var5 + 2];
                            class173 var125 = class173.method2041(var124);
                            client.method585(var125, var122, var123);
                            continue;
                        }
                        if (var461 == 3109) {
                            var5 -= 2;
                            int var126 = field803[var5];
                            int var127 = field803[var5 + 1];
                            class173 var128 = var51 ? Statics.field807 : Statics.field585;
                            client.method585(var128, var126, var127);
                            continue;
                        }
                        if (var461 == 3110) {
                            var5--;
                            Statics.field3150 = field803[var5] == 1;
                            continue;
                        }
                        if (var461 == 3111) {
                            field803[var5++] = Statics.field1549.field132 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3112) {
                            var5--;
                            Statics.field1549.field132 = field803[var5] == 1;
                            class9.method2269();
                            continue;
                        }
                        if (var461 == 3113) {
                            var6--;
                            String var129 = field804[var6];
                            var5--;
                            boolean var130 = field803[var5] == 1;
                            class138.method695(var129, var130, false);
                            continue;
                        }
                        if (var461 == 3115) {
                            var5--;
                            int var131 = field803[var5];
                            client.field302.method2586(6);
                            client.field302.method2331(var131);
                            continue;
                        }
                        if (var461 == 3116) {
                            var5--;
                            int var132 = field803[var5];
                            var6 -= 2;
                            String var133 = field804[var6];
                            String var134 = field804[var6 + 1];
                            if (var133.length() <= 500 && var134.length() <= 500) {
                                client.field302.method2586(187);
                                client.field302.method2331(1 + class119.method571(var133) + class119.method571(var134));
                                client.field302.method2336(var134);
                                client.field302.method2330(var132);
                                client.field302.method2336(var133);
                            }
                            continue;
                        }
                    } else if (var461 < 3300) {
                        if (var461 == 3200) {
                            var5 -= 3;
                            int var135 = field803[var5];
                            int var136 = field803[var5 + 1];
                            int var137 = field803[var5 + 2];
                            if (client.field535 != 0 && var136 != 0 && client.field537 < 50) {
                                client.field327[client.field537] = var135;
                                client.field539[client.field537] = var136;
                                client.field540[client.field537] = var137;
                                client.field542[client.field537] = null;
                                client.field504[client.field537] = 0;
                                client.field537++;
                            }
                            continue;
                        }
                        if (var461 == 3201) {
                            var5--;
                            int var138 = field803[var5];
                            if (var138 == -1 && !client.field534) {
                                Statics.field2943.method3382();
                                class183.field2948 = 1;
                                Statics.field2947 = null;
                            } else if (var138 != -1 && client.field533 != var138 && client.field532 != 0 && !client.field534) {
                                class183.method713(2, Statics.field2055, var138, 0, client.field532, false);
                            }
                            client.field533 = var138;
                            continue;
                        }
                        if (var461 == 3202) {
                            var5 -= 2;
                            client.method637(field803[var5], field803[var5 + 1]);
                            continue;
                        }
                    } else if (var461 < 3400) {
                        if (var461 == 3300) {
                            field803[var5++] = client.field304;
                            continue;
                        }
                        if (var461 == 3301) {
                            var5 -= 2;
                            int var139 = field803[var5];
                            int var140 = field803[var5 + 1];
                            field803[var5++] = class16.method2605(var139, var140);
                            continue;
                        }
                        if (var461 == 3302) {
                            var5 -= 2;
                            int var141 = field803[var5];
                            int var142 = field803[var5 + 1];
                            int[] var143 = field803;
                            int var144 = var5++;
                            class16 var145 = (class16) class16.field226.method3539((long) var141);
                            int var146;
                            if (var145 == null) {
                                var146 = 0;
                            } else if (var142 >= 0 && var142 < var145.field222.length) {
                                var146 = var145.field222[var142];
                            } else {
                                var146 = 0;
                            }
                            var143[var144] = var146;
                            continue;
                        }
                        if (var461 == 3303) {
                            var5 -= 2;
                            int var147 = field803[var5];
                            int var148 = field803[var5 + 1];
                            int[] var149 = field803;
                            int var150 = var5++;
                            class16 var151 = (class16) class16.field226.method3539((long) var147);
                            int var152;
                            if (var151 == null) {
                                var152 = 0;
                            } else if (var148 == -1) {
                                var152 = 0;
                            } else {
                                int var153 = 0;
                                for (int var154 = 0; var154 < var151.field222.length; var154++) {
                                    if (var151.field216[var154] == var148) {
                                        var153 += var151.field222[var154];
                                    }
                                }
                                var152 = var153;
                            }
                            var149[var150] = var152;
                            continue;
                        }
                        if (var461 == 3304) {
                            var5--;
                            int var155 = field803[var5];
                            int[] var156 = field803;
                            int var157 = var5++;
                            class51 var158 = (class51) class51.field1098.method3507((long) var155);
                            class51 var159;
                            if (var158 == null) {
                                byte[] var160 = Statics.field1101.method3025(5, var155);
                                class51 var161 = new class51();
                                if (var160 != null) {
                                    var161.method1007(new class119(var160));
                                }
                                class51.field1098.method3509(var161, (long) var155);
                                var159 = var161;
                            } else {
                                var159 = var158;
                            }
                            var156[var157] = var159.field1099;
                            continue;
                        }
                        if (var461 == 3305) {
                            var5--;
                            int var162 = field803[var5];
                            field803[var5++] = client.field431[var162];
                            continue;
                        }
                        if (var461 == 3306) {
                            var5--;
                            int var163 = field803[var5];
                            field803[var5++] = client.field338[var163];
                            continue;
                        }
                        if (var461 == 3307) {
                            var5--;
                            int var164 = field803[var5];
                            field803[var5++] = client.field291[var164];
                            continue;
                        }
                        if (var461 == 3308) {
                            int var165 = Statics.field1079;
                            int var166 = (Statics.field2254.field871 >> 7) + Statics.field2215;
                            int var167 = (Statics.field2254.field814 >> 7) + Statics.field258;
                            field803[var5++] = (var165 << 28) + (var166 << 14) + var167;
                            continue;
                        }
                        if (var461 == 3309) {
                            var5--;
                            int var168 = field803[var5];
                            field803[var5++] = var168 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var461 == 3310) {
                            var5--;
                            int var169 = field803[var5];
                            field803[var5++] = var169 >> 28;
                            continue;
                        }
                        if (var461 == 3311) {
                            var5--;
                            int var170 = field803[var5];
                            field803[var5++] = var170 & 0x3FFF;
                            continue;
                        }
                        if (var461 == 3312) {
                            field803[var5++] = client.field297 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3313) {
                            var5 -= 2;
                            int var171 = field803[var5] + 32768;
                            int var172 = field803[var5 + 1];
                            field803[var5++] = class16.method2605(var171, var172);
                            continue;
                        }
                        if (var461 == 3314) {
                            var5 -= 2;
                            int var173 = field803[var5] + 32768;
                            int var174 = field803[var5 + 1];
                            int[] var175 = field803;
                            int var176 = var5++;
                            class16 var177 = (class16) class16.field226.method3539((long) var173);
                            int var178;
                            if (var177 == null) {
                                var178 = 0;
                            } else if (var174 >= 0 && var174 < var177.field222.length) {
                                var178 = var177.field222[var174];
                            } else {
                                var178 = 0;
                            }
                            var175[var176] = var178;
                            continue;
                        }
                        if (var461 == 3315) {
                            var5 -= 2;
                            int var179 = field803[var5] + 32768;
                            int var180 = field803[var5 + 1];
                            int[] var181 = field803;
                            int var182 = var5++;
                            class16 var183 = (class16) class16.field226.method3539((long) var179);
                            int var184;
                            if (var183 == null) {
                                var184 = 0;
                            } else if (var180 == -1) {
                                var184 = 0;
                            } else {
                                int var185 = 0;
                                for (int var186 = 0; var186 < var183.field222.length; var186++) {
                                    if (var183.field216[var186] == var180) {
                                        var185 += var183.field222[var186];
                                    }
                                }
                                var184 = var185;
                            }
                            var181[var182] = var184;
                            continue;
                        }
                        if (var461 == 3316) {
                            if (client.field461 >= 2) {
                                field803[var5++] = client.field461;
                            } else {
                                field803[var5++] = 0;
                            }
                            continue;
                        }
                        if (var461 == 3317) {
                            field803[var5++] = client.field311;
                            continue;
                        }
                        if (var461 == 3318) {
                            field803[var5++] = client.field528;
                            continue;
                        }
                        if (var461 == 3321) {
                            field803[var5++] = client.field459;
                            continue;
                        }
                        if (var461 == 3322) {
                            field803[var5++] = client.field337;
                            continue;
                        }
                        if (var461 == 3323) {
                            if (client.field472) {
                                field803[var5++] = 1;
                            } else {
                                field803[var5++] = 0;
                            }
                            continue;
                        }
                        if (var461 == 3324) {
                            field803[var5++] = client.field507;
                            continue;
                        }
                    } else if (var461 < 3500) {
                        if (var461 == 3400) {
                            var5 -= 2;
                            int var187 = field803[var5];
                            int var188 = field803[var5 + 1];
                            class49 var189 = (class49) class49.field1077.method3507((long) var187);
                            class49 var190;
                            if (var189 == null) {
                                byte[] var191 = Statics.field1070.method3025(8, var187);
                                class49 var192 = new class49();
                                if (var191 != null) {
                                    var192.method988(new class119(var191));
                                }
                                class49.field1077.method3509(var192, (long) var187);
                                var190 = var192;
                            } else {
                                var190 = var189;
                            }
                            class49 var193 = var190;
                            if (var190.field1072 != 's') {
                            }
                            for (int var194 = 0; var194 < var193.field1076; var194++) {
                                if (var193.field1088[var194] == var188) {
                                    field804[var6++] = var193.field1078[var194];
                                    var193 = null;
                                    break;
                                }
                            }
                            if (var193 != null) {
                                field804[var6++] = var193.field1073;
                            }
                            continue;
                        }
                        if (var461 == 3408) {
                            var5 -= 4;
                            int var195 = field803[var5];
                            int var196 = field803[var5 + 1];
                            int var197 = field803[var5 + 2];
                            int var198 = field803[var5 + 3];
                            class49 var199 = (class49) class49.field1077.method3507((long) var197);
                            class49 var200;
                            if (var199 == null) {
                                byte[] var201 = Statics.field1070.method3025(8, var197);
                                class49 var202 = new class49();
                                if (var201 != null) {
                                    var202.method988(new class119(var201));
                                }
                                class49.field1077.method3509(var202, (long) var197);
                                var200 = var202;
                            } else {
                                var200 = var199;
                            }
                            class49 var203 = var200;
                            if (var200.field1071 == var195 && var200.field1072 == var196) {
                                for (int var204 = 0; var204 < var203.field1076; var204++) {
                                    if (var203.field1088[var204] == var198) {
                                        if (var196 == 115) {
                                            field804[var6++] = var203.field1078[var204];
                                        } else {
                                            field803[var5++] = var203.field1081[var204];
                                        }
                                        var203 = null;
                                        break;
                                    }
                                }
                                if (var203 != null) {
                                    if (var196 == 115) {
                                        field804[var6++] = var203.field1073;
                                    } else {
                                        field803[var5++] = var203.field1074;
                                    }
                                }
                                continue;
                            }
                            if (var196 == 115) {
                                field804[var6++] = "null";
                            } else {
                                field803[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var461 < 3700) {
                        if (var461 == 3600) {
                            if (client.field370 == 0) {
                                field803[var5++] = -2;
                            } else if (client.field370 == 1) {
                                field803[var5++] = -1;
                            } else {
                                field803[var5++] = client.field563;
                            }
                            continue;
                        }
                        if (var461 == 3601) {
                            var5--;
                            int var205 = field803[var5];
                            if (client.field370 == 2 && var205 < client.field563) {
                                field804[var6++] = client.field514[var205].field262;
                                field804[var6++] = client.field514[var205].field249;
                                continue;
                            }
                            field804[var6++] = "";
                            field804[var6++] = "";
                            continue;
                        }
                        if (var461 == 3602) {
                            var5--;
                            int var206 = field803[var5];
                            if (client.field370 == 2 && var206 < client.field563) {
                                field803[var5++] = client.field514[var206].field250;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var461 == 3603) {
                            var5--;
                            int var207 = field803[var5];
                            if (client.field370 == 2 && var207 < client.field563) {
                                field803[var5++] = client.field514[var207].field251;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var461 == 3604) {
                            var6--;
                            String var208 = field804[var6];
                            var5--;
                            int var209 = field803[var5];
                            client.method2043(var208, var209);
                            continue;
                        }
                        if (var461 == 3605) {
                            var6--;
                            String var210 = field804[var6];
                            client.method110(var210);
                            continue;
                        }
                        if (var461 == 3606) {
                            var6--;
                            String var211 = field804[var6];
                            if (var211 == null) {
                                continue;
                            }
                            String var212 = class164.method2658(var211, Statics.field2063);
                            if (var212 == null) {
                                continue;
                            }
                            int var213 = 0;
                            while (true) {
                                if (var213 >= client.field563) {
                                    continue label2963;
                                }
                                class18 var214 = client.field514[var213];
                                String var215 = var214.field262;
                                String var216 = class164.method2658(var215, Statics.field2063);
                                boolean var217;
                                if (var211 == null || var215 == null) {
                                    var217 = false;
                                } else if (var211.startsWith("#") || var215.startsWith("#")) {
                                    var217 = var211.equals(var215);
                                } else {
                                    var217 = var212.equals(var216);
                                }
                                if (var217) {
                                    client.field563--;
                                    for (int var218 = var213; var218 < client.field563; var218++) {
                                        client.field514[var218] = client.field514[var218 + 1];
                                    }
                                    client.field497 = client.field480;
                                    client.field302.method2586(9);
                                    client.field302.method2330(class119.method571(var211));
                                    client.field302.method2336(var211);
                                    continue label2963;
                                }
                                var213++;
                            }
                        }
                        if (var461 == 3607) {
                            var6--;
                            String var219 = field804[var6];
                            if (var219 == null) {
                                continue;
                            }
                            if ((client.field510 < 100 || client.field460 == 1) && client.field510 < 400) {
                                String var220 = class164.method2658(var219, Statics.field2063);
                                if (var220 == null) {
                                    continue;
                                }
                                for (int var221 = 0; var221 < client.field510; var221++) {
                                    class8 var222 = client.field569[var221];
                                    String var223 = class164.method2658(var222.field130, Statics.field2063);
                                    if (var223 != null && var223.equals(var220)) {
                                        class12.method2769(31, "", var219 + class157.field2460);
                                        continue label2963;
                                    }
                                    if (var222.field126 != null) {
                                        String var224 = class164.method2658(var222.field126, Statics.field2063);
                                        if (var224 != null && var224.equals(var220)) {
                                            class12.method2769(31, "", var219 + class157.field2460);
                                            continue label2963;
                                        }
                                    }
                                }
                                for (int var225 = 0; var225 < client.field563; var225++) {
                                    class18 var226 = client.field514[var225];
                                    String var227 = class164.method2658(var226.field262, Statics.field2063);
                                    if (var227 != null && var227.equals(var220)) {
                                        class12.method2769(31, "", class157.field2465 + var219 + class157.field2298);
                                        continue label2963;
                                    }
                                    if (var226.field249 != null) {
                                        String var228 = class164.method2658(var226.field249, Statics.field2063);
                                        if (var228 != null && var228.equals(var220)) {
                                            class12.method2769(31, "", class157.field2465 + var219 + class157.field2298);
                                            continue label2963;
                                        }
                                    }
                                }
                                if (class164.method2658(Statics.field2254.field41, Statics.field2063).equals(var220)) {
                                    class12.method2769(31, "", class157.field2462);
                                } else {
                                    client.field302.method2586(3);
                                    client.field302.method2330(class119.method571(var219));
                                    client.field302.method2336(var219);
                                }
                                continue;
                            }
                            class12.method2769(31, "", class157.field2308);
                            continue;
                        }
                        if (var461 == 3608) {
                            var6--;
                            String var229 = field804[var6];
                            client.method1064(var229);
                            continue;
                        }
                        if (var461 == 3609) {
                            var6--;
                            String var230 = field804[var6];
                            class152[] var231 = class152.method3685();
                            for (int var232 = 0; var232 < var231.length; var232++) {
                                class152 var233 = var231[var232];
                                if (var233.field2249 != -1) {
                                    int var235 = var233.field2249;
                                    String var236 = "<img=" + var235 + ">";
                                    if (var230.startsWith(var236)) {
                                        var230 = var230.substring(6 + Integer.toString(var233.field2249).length());
                                        break;
                                    }
                                }
                            }
                            field803[var5++] = client.method137(var230, false) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3611) {
                            if (client.field439 == null) {
                                field804[var6++] = "";
                            } else {
                                String[] var237 = field804;
                                int var238 = var6++;
                                String var239 = client.field439;
                                String var240 = class162.method701(class162.method1778(var239));
                                if (var240 == null) {
                                    var240 = "";
                                }
                                var237[var238] = var240;
                            }
                            continue;
                        }
                        if (var461 == 3612) {
                            if (client.field439 == null) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = Statics.field152;
                            }
                            continue;
                        }
                        if (var461 == 3613) {
                            var5--;
                            int var242 = field803[var5];
                            if (client.field439 != null && var242 < Statics.field152) {
                                field804[var6++] = Statics.field1004[var242].field625;
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var461 == 3614) {
                            var5--;
                            int var243 = field803[var5];
                            if (client.field439 != null && var243 < Statics.field152) {
                                field803[var5++] = Statics.field1004[var243].field630;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var461 == 3615) {
                            var5--;
                            int var244 = field803[var5];
                            if (client.field439 != null && var244 < Statics.field152) {
                                field803[var5++] = Statics.field1004[var244].field627;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var461 == 3616) {
                            field803[var5++] = Statics.field185;
                            continue;
                        }
                        if (var461 == 3617) {
                            var6--;
                            String var245 = field804[var6];
                            client.method842(var245);
                            continue;
                        }
                        if (var461 == 3618) {
                            field803[var5++] = Statics.field163;
                            continue;
                        }
                        if (var461 == 3619) {
                            var6--;
                            String var246 = field804[var6];
                            if (!var246.equals("")) {
                                client.field302.method2586(53);
                                client.field302.method2330(class119.method571(var246));
                                client.field302.method2336(var246);
                            }
                            continue;
                        }
                        if (var461 == 3620) {
                            Statics.method2270();
                            continue;
                        }
                        if (var461 == 3621) {
                            if (client.field370 == 0) {
                                field803[var5++] = -1;
                            } else {
                                field803[var5++] = client.field510;
                            }
                            continue;
                        }
                        if (var461 == 3622) {
                            var5--;
                            int var247 = field803[var5];
                            if (client.field370 != 0 && var247 < client.field510) {
                                field804[var6++] = client.field569[var247].field130;
                                field804[var6++] = client.field569[var247].field126;
                                continue;
                            }
                            field804[var6++] = "";
                            field804[var6++] = "";
                            continue;
                        }
                        if (var461 == 3623) {
                            String var248;
                            label2735: {
                                var6--;
                                var248 = field804[var6];
                                String var250 = "<img=0>";
                                if (!var248.startsWith(var250)) {
                                    String var252 = "<img=1>";
                                    if (!var248.startsWith(var252)) {
                                        break label2735;
                                    }
                                }
                                var248 = var248.substring(7);
                            }
                            field803[var5++] = client.method628(var248) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3624) {
                            var5--;
                            int var253 = field803[var5];
                            if (Statics.field1004 != null && var253 < Statics.field152 && Statics.field1004[var253].field625.equalsIgnoreCase(Statics.field2254.field41)) {
                                field803[var5++] = 1;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var461 == 3625) {
                            if (client.field315 == null) {
                                field804[var6++] = "";
                            } else {
                                String[] var254 = field804;
                                int var255 = var6++;
                                String var256 = client.field315;
                                String var257 = class162.method701(class162.method1778(var256));
                                if (var257 == null) {
                                    var257 = "";
                                }
                                var254[var255] = var257;
                            }
                            continue;
                        }
                    } else if (var461 < 4000) {
                        if (var461 == 3903) {
                            var5--;
                            int var259 = field803[var5];
                            field803[var5++] = client.field573[var259].method3744();
                            continue;
                        }
                        if (var461 == 3904) {
                            var5--;
                            int var260 = field803[var5];
                            field803[var5++] = client.field573[var260].field3164;
                            continue;
                        }
                        if (var461 == 3905) {
                            var5--;
                            int var261 = field803[var5];
                            field803[var5++] = client.field573[var261].field3165;
                            continue;
                        }
                        if (var461 == 3906) {
                            var5--;
                            int var262 = field803[var5];
                            field803[var5++] = client.field573[var262].field3163;
                            continue;
                        }
                        if (var461 == 3907) {
                            var5--;
                            int var263 = field803[var5];
                            field803[var5++] = client.field573[var263].field3166;
                            continue;
                        }
                        if (var461 == 3908) {
                            var5--;
                            int var264 = field803[var5];
                            field803[var5++] = client.field573[var264].field3168;
                            continue;
                        }
                        if (var461 == 3910) {
                            var5--;
                            int var265 = field803[var5];
                            int var266 = client.field573[var265].method3743();
                            field803[var5++] = var266 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3911) {
                            var5--;
                            int var267 = field803[var5];
                            int var268 = client.field573[var267].method3743();
                            field803[var5++] = var268 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3912) {
                            var5--;
                            int var269 = field803[var5];
                            int var270 = client.field573[var269].method3743();
                            field803[var5++] = var270 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3913) {
                            var5--;
                            int var271 = field803[var5];
                            int var272 = client.field573[var271].method3743();
                            field803[var5++] = var272 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 3914) {
                            var5--;
                            boolean var273 = field803[var5] == 1;
                            if (Statics.field2654 != null) {
                                Statics.field2654.method3760(class221.field3172, var273);
                            }
                            continue;
                        }
                        if (var461 == 3915) {
                            var5--;
                            boolean var274 = field803[var5] == 1;
                            if (Statics.field2654 != null) {
                                Statics.field2654.method3760(class221.field3173, var274);
                            }
                            continue;
                        }
                        if (var461 == 3916) {
                            var5 -= 2;
                            boolean var275 = field803[var5] == 1;
                            boolean var276 = field803[var5 + 1] == 1;
                            if (Statics.field2654 != null) {
                                Statics.field2654.method3760(new class22(var276), var275);
                            }
                            continue;
                        }
                        if (var461 == 3917) {
                            var5--;
                            boolean var277 = field803[var5] == 1;
                            if (Statics.field2654 != null) {
                                Statics.field2654.method3760(class221.field3171, var277);
                            }
                            continue;
                        }
                        if (var461 == 3918) {
                            var5--;
                            boolean var278 = field803[var5] == 1;
                            if (Statics.field2654 != null) {
                                Statics.field2654.method3760(class221.field3174, var278);
                            }
                            continue;
                        }
                        if (var461 == 3919) {
                            field803[var5++] = Statics.field2654 == null ? 0 : Statics.field2654.field3170.size();
                            continue;
                        }
                        if (var461 == 3920) {
                            var5--;
                            int var279 = field803[var5];
                            class214 var280 = (class214) Statics.field2654.field3170.get(var279);
                            field803[var5++] = var280.field3143;
                            continue;
                        }
                        if (var461 == 3921) {
                            var5--;
                            int var281 = field803[var5];
                            class214 var282 = (class214) Statics.field2654.field3170.get(var281);
                            field804[var6++] = var282.method3700();
                            continue;
                        }
                        if (var461 == 3922) {
                            var5--;
                            int var283 = field803[var5];
                            class214 var284 = (class214) Statics.field2654.field3170.get(var283);
                            field804[var6++] = var284.method3701();
                            continue;
                        }
                        if (var461 == 3923) {
                            var5--;
                            int var285 = field803[var5];
                            class214 var286 = (class214) Statics.field2654.field3170.get(var285);
                            long var287 = class115.method207() - Statics.field1097 - var286.field3141;
                            int var289 = (int) (var287 / 3600000L);
                            int var290 = (int) ((var287 - (long) (var289 * 3600000)) / 60000L);
                            int var291 = (int) ((var287 - (long) (var289 * 3600000) - (long) (var290 * 60000)) / 1000L);
                            String var292 = var289 + ":" + var290 / 10 + var290 % 10 + ":" + var291 / 10 + var291 % 10;
                            field804[var6++] = var292;
                            continue;
                        }
                        if (var461 == 3924) {
                            var5--;
                            int var293 = field803[var5];
                            class214 var294 = (class214) Statics.field2654.field3170.get(var293);
                            field803[var5++] = var294.field3140.field3163;
                            continue;
                        }
                        if (var461 == 3925) {
                            var5--;
                            int var295 = field803[var5];
                            class214 var296 = (class214) Statics.field2654.field3170.get(var295);
                            field803[var5++] = var296.field3140.field3165;
                            continue;
                        }
                        if (var461 == 3926) {
                            var5--;
                            int var297 = field803[var5];
                            class214 var298 = (class214) Statics.field2654.field3170.get(var297);
                            field803[var5++] = var298.field3140.field3164;
                            continue;
                        }
                    } else if (var461 < 4100) {
                        if (var461 == 4000) {
                            var5 -= 2;
                            int var299 = field803[var5];
                            int var300 = field803[var5 + 1];
                            field803[var5++] = var299 + var300;
                            continue;
                        }
                        if (var461 == 4001) {
                            var5 -= 2;
                            int var301 = field803[var5];
                            int var302 = field803[var5 + 1];
                            field803[var5++] = var301 - var302;
                            continue;
                        }
                        if (var461 == 4002) {
                            var5 -= 2;
                            int var303 = field803[var5];
                            int var304 = field803[var5 + 1];
                            field803[var5++] = var303 * var304;
                            continue;
                        }
                        if (var461 == 4003) {
                            var5 -= 2;
                            int var305 = field803[var5];
                            int var306 = field803[var5 + 1];
                            field803[var5++] = var305 / var306;
                            continue;
                        }
                        if (var461 == 4004) {
                            var5--;
                            int var307 = field803[var5];
                            field803[var5++] = (int) (Math.random() * (double) var307);
                            continue;
                        }
                        if (var461 == 4005) {
                            var5--;
                            int var308 = field803[var5];
                            field803[var5++] = (int) (Math.random() * (double) (var308 + 1));
                            continue;
                        }
                        if (var461 == 4006) {
                            var5 -= 5;
                            int var309 = field803[var5];
                            int var310 = field803[var5 + 1];
                            int var311 = field803[var5 + 2];
                            int var312 = field803[var5 + 3];
                            int var313 = field803[var5 + 4];
                            field803[var5++] = (var310 - var309) * (var313 - var311) / (var312 - var311) + var309;
                            continue;
                        }
                        if (var461 == 4007) {
                            var5 -= 2;
                            int var314 = field803[var5];
                            int var315 = field803[var5 + 1];
                            field803[var5++] = var314 * var315 / 100 + var314;
                            continue;
                        }
                        if (var461 == 4008) {
                            var5 -= 2;
                            int var316 = field803[var5];
                            int var317 = field803[var5 + 1];
                            field803[var5++] = var316 | 0x1 << var317;
                            continue;
                        }
                        if (var461 == 4009) {
                            var5 -= 2;
                            int var318 = field803[var5];
                            int var319 = field803[var5 + 1];
                            field803[var5++] = var318 & -1 - (0x1 << var319);
                            continue;
                        }
                        if (var461 == 4010) {
                            var5 -= 2;
                            int var320 = field803[var5];
                            int var321 = field803[var5 + 1];
                            field803[var5++] = (var320 & 0x1 << var321) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var461 == 4011) {
                            var5 -= 2;
                            int var322 = field803[var5];
                            int var323 = field803[var5 + 1];
                            field803[var5++] = var322 % var323;
                            continue;
                        }
                        if (var461 == 4012) {
                            var5 -= 2;
                            int var324 = field803[var5];
                            int var325 = field803[var5 + 1];
                            if (var324 == 0) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = (int) Math.pow((double) var324, (double) var325);
                            }
                            continue;
                        }
                        if (var461 == 4013) {
                            var5 -= 2;
                            int var326 = field803[var5];
                            int var327 = field803[var5 + 1];
                            if (var326 == 0) {
                                field803[var5++] = 0;
                            } else if (var327 == 0) {
                                field803[var5++] = Integer.MAX_VALUE;
                            } else {
                                field803[var5++] = (int) Math.pow((double) var326, 1.0D / (double) var327);
                            }
                            continue;
                        }
                        if (var461 == 4014) {
                            var5 -= 2;
                            int var328 = field803[var5];
                            int var329 = field803[var5 + 1];
                            field803[var5++] = var328 & var329;
                            continue;
                        }
                        if (var461 == 4015) {
                            var5 -= 2;
                            int var330 = field803[var5];
                            int var331 = field803[var5 + 1];
                            field803[var5++] = var330 | var331;
                            continue;
                        }
                    } else if (var461 < 4200) {
                        if (var461 == 4100) {
                            var6--;
                            String var332 = field804[var6];
                            var5--;
                            int var333 = field803[var5];
                            field804[var6++] = var332 + var333;
                            continue;
                        }
                        if (var461 == 4101) {
                            var6 -= 2;
                            String var334 = field804[var6];
                            String var335 = field804[var6 + 1];
                            field804[var6++] = var334 + var335;
                            continue;
                        }
                        if (var461 == 4102) {
                            var6--;
                            String var336 = field804[var6];
                            var5--;
                            int var337 = field803[var5];
                            field804[var6++] = var336 + class163.method2653(var337, true);
                            continue;
                        }
                        if (var461 == 4103) {
                            var6--;
                            String var338 = field804[var6];
                            field804[var6++] = var338.toLowerCase();
                            continue;
                        }
                        if (var461 == 4104) {
                            var5--;
                            int var339 = field803[var5];
                            long var340 = ((long) var339 + 11745L) * 86400000L;
                            field808.setTime(new Date(var340));
                            int var342 = field808.get(5);
                            int var343 = field808.get(2);
                            int var344 = field808.get(1);
                            field804[var6++] = var342 + "-" + field810[var343] + "-" + var344;
                            continue;
                        }
                        if (var461 == 4105) {
                            var6 -= 2;
                            String var345 = field804[var6];
                            String var346 = field804[var6 + 1];
                            if (Statics.field2254.field44 != null && Statics.field2254.field44.field2905) {
                                field804[var6++] = var346;
                                continue;
                            }
                            field804[var6++] = var345;
                            continue;
                        }
                        if (var461 == 4106) {
                            var5--;
                            int var347 = field803[var5];
                            field804[var6++] = Integer.toString(var347);
                            continue;
                        }
                        if (var461 == 4107) {
                            var6 -= 2;
                            int[] var348 = field803;
                            int var349 = var5++;
                            int var350 = class166.method2632(field804[var6], field804[var6 + 1], client.field299);
                            byte var351;
                            if (var350 > 0) {
                                var351 = 1;
                            } else if (var350 < 0) {
                                var351 = -1;
                            } else {
                                var351 = 0;
                            }
                            var348[var349] = var351;
                            continue;
                        }
                        if (var461 == 4108) {
                            var6--;
                            String var352 = field804[var6];
                            var5 -= 2;
                            int var353 = field803[var5];
                            int var354 = field803[var5 + 1];
                            byte[] var355 = Statics.field1392.method3025(var354, 0);
                            class224 var356 = new class224(var355);
                            field803[var5++] = var356.method3770(var352, var353);
                            continue;
                        }
                        if (var461 == 4109) {
                            var6--;
                            String var357 = field804[var6];
                            var5 -= 2;
                            int var358 = field803[var5];
                            int var359 = field803[var5 + 1];
                            byte[] var360 = Statics.field1392.method3025(var359, 0);
                            class224 var361 = new class224(var360);
                            field803[var5++] = var361.method3769(var357, var358);
                            continue;
                        }
                        if (var461 == 4110) {
                            var6 -= 2;
                            String var362 = field804[var6];
                            String var363 = field804[var6 + 1];
                            var5--;
                            if (field803[var5] == 1) {
                                field804[var6++] = var362;
                            } else {
                                field804[var6++] = var363;
                            }
                            continue;
                        }
                        if (var461 == 4111) {
                            var6--;
                            String var364 = field804[var6];
                            field804[var6++] = class223.method3845(var364);
                            continue;
                        }
                        if (var461 == 4112) {
                            var6--;
                            String var365 = field804[var6];
                            var5--;
                            int var366 = field803[var5];
                            field804[var6++] = var365 + (char) var366;
                            continue;
                        }
                        if (var461 == 4113) {
                            var5--;
                            int var367 = field803[var5];
                            field803[var5++] = class163.method2631((char) var367) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4114) {
                            var5--;
                            int var368 = field803[var5];
                            int[] var369 = field803;
                            int var370 = var5++;
                            char var371 = (char) var368;
                            boolean var372 = var371 >= '0' && var371 <= '9' || var371 >= 'A' && var371 <= 'Z' || var371 >= 'a' && var371 <= 'z';
                            var369[var370] = var372 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4115) {
                            var5--;
                            int var373 = field803[var5];
                            int[] var374 = field803;
                            int var375 = var5++;
                            char var376 = (char) var373;
                            boolean var377 = var376 >= 'A' && var376 <= 'Z' || var376 >= 'a' && var376 <= 'z';
                            var374[var375] = var377 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4116) {
                            var5--;
                            int var378 = field803[var5];
                            field803[var5++] = class163.method590((char) var378) ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4117) {
                            var6--;
                            String var379 = field804[var6];
                            if (var379 == null) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = var379.length();
                            }
                            continue;
                        }
                        if (var461 == 4118) {
                            var6--;
                            String var380 = field804[var6];
                            var5 -= 2;
                            int var381 = field803[var5];
                            int var382 = field803[var5 + 1];
                            field804[var6++] = var380.substring(var381, var382);
                            continue;
                        }
                        if (var461 == 4119) {
                            var6--;
                            String var383 = field804[var6];
                            StringBuilder var384 = new StringBuilder(var383.length());
                            boolean var385 = false;
                            for (int var386 = 0; var386 < var383.length(); var386++) {
                                char var387 = var383.charAt(var386);
                                if (var387 == '<') {
                                    var385 = true;
                                } else if (var387 == '>') {
                                    var385 = false;
                                } else if (!var385) {
                                    var384.append(var387);
                                }
                            }
                            field804[var6++] = var384.toString();
                            continue;
                        }
                        if (var461 == 4120) {
                            var6--;
                            String var388 = field804[var6];
                            var5--;
                            int var389 = field803[var5];
                            field803[var5++] = var388.indexOf(var389);
                            continue;
                        }
                        if (var461 == 4121) {
                            var6 -= 2;
                            String var390 = field804[var6];
                            String var391 = field804[var6 + 1];
                            var5--;
                            int var392 = field803[var5];
                            field803[var5++] = var390.indexOf(var391, var392);
                            continue;
                        }
                    } else if (var461 < 4300) {
                        if (var461 == 4200) {
                            var5--;
                            int var393 = field803[var5];
                            field804[var6++] = class52.method1531(var393).field1116;
                            continue;
                        }
                        if (var461 == 4201) {
                            var5 -= 2;
                            int var394 = field803[var5];
                            int var395 = field803[var5 + 1];
                            class52 var396 = class52.method1531(var394);
                            if (var395 >= 1 && var395 <= 5 && var396.field1130[var395 - 1] != null) {
                                field804[var6++] = var396.field1130[var395 - 1];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var461 == 4202) {
                            var5 -= 2;
                            int var397 = field803[var5];
                            int var398 = field803[var5 + 1];
                            class52 var399 = class52.method1531(var397);
                            if (var398 >= 1 && var398 <= 5 && var399.field1136[var398 - 1] != null) {
                                field804[var6++] = var399.field1136[var398 - 1];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var461 == 4203) {
                            var5--;
                            int var400 = field803[var5];
                            field803[var5++] = class52.method1531(var400).field1144;
                            continue;
                        }
                        if (var461 == 4204) {
                            var5--;
                            int var401 = field803[var5];
                            field803[var5++] = class52.method1531(var401).field1127 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4205) {
                            var5--;
                            int var402 = field803[var5];
                            class52 var403 = class52.method1531(var402);
                            if (var403.field1121 == -1 && var403.field1146 >= 0) {
                                field803[var5++] = var403.field1146;
                                continue;
                            }
                            field803[var5++] = var402;
                            continue;
                        }
                        if (var461 == 4206) {
                            var5--;
                            int var404 = field803[var5];
                            class52 var405 = class52.method1531(var404);
                            if (var405.field1121 >= 0 && var405.field1146 >= 0) {
                                field803[var5++] = var405.field1146;
                                continue;
                            }
                            field803[var5++] = var404;
                            continue;
                        }
                        if (var461 == 4207) {
                            var5--;
                            int var406 = field803[var5];
                            field803[var5++] = class52.method1531(var406).field1129 ? 1 : 0;
                            continue;
                        }
                        if (var461 == 4210) {
                            var6--;
                            String var407 = field804[var6];
                            var5--;
                            int var408 = field803[var5];
                            client.method1193(var407, var408 == 1);
                            field803[var5++] = Statics.field752;
                            continue;
                        }
                        if (var461 == 4211) {
                            if (Statics.field1758 != null && Statics.field880 < Statics.field752) {
                                field803[var5++] = Statics.field1758[++Statics.field880 - 1] & 0xFFFF;
                                continue;
                            }
                            field803[var5++] = -1;
                            continue;
                        }
                        if (var461 == 4212) {
                            Statics.field880 = 0;
                            continue;
                        }
                    } else if (var461 < 5100) {
                        if (var461 == 5000) {
                            field803[var5++] = client.field513;
                            continue;
                        }
                        if (var461 == 5001) {
                            var5 -= 3;
                            client.field513 = field803[var5];
                            Statics.field127 = class130.method188(field803[var5 + 1]);
                            if (Statics.field127 == null) {
                                Statics.field127 = class130.field2056;
                            }
                            client.field483 = field803[var5 + 2];
                            client.field302.method2586(140);
                            client.field302.method2330(client.field513);
                            client.field302.method2330(Statics.field127.field2051);
                            client.field302.method2330(client.field483);
                            continue;
                        }
                        if (var461 == 5002) {
                            var6--;
                            String var409 = field804[var6];
                            var5 -= 2;
                            int var410 = field803[var5];
                            int var411 = field803[var5 + 1];
                            client.field302.method2586(235);
                            client.field302.method2330(class119.method571(var409) + 2);
                            client.field302.method2336(var409);
                            client.field302.method2330(var410 - 1);
                            client.field302.method2330(var411);
                            continue;
                        }
                        if (var461 == 5003) {
                            var5 -= 2;
                            int var412 = field803[var5];
                            int var413 = field803[var5 + 1];
                            class28 var414 = (class28) class12.field170.get(var412);
                            class36 var415 = var414.method631(var413);
                            if (var415 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                                field804[var6++] = "";
                                field804[var6++] = "";
                            } else {
                                field803[var5++] = var415.field790;
                                field803[var5++] = var415.field789;
                                field804[var6++] = var415.field792 == null ? "" : var415.field792;
                                field804[var6++] = var415.field793 == null ? "" : var415.field793;
                                field804[var6++] = var415.field794 == null ? "" : var415.field794;
                            }
                            continue;
                        }
                        if (var461 == 5004) {
                            var5--;
                            int var417 = field803[var5];
                            class36 var418 = (class36) class12.field165.method3564((long) var417);
                            if (var418 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                                field804[var6++] = "";
                                field804[var6++] = "";
                            } else {
                                field803[var5++] = var418.field791;
                                field803[var5++] = var418.field789;
                                field804[var6++] = var418.field792 == null ? "" : var418.field792;
                                field804[var6++] = var418.field793 == null ? "" : var418.field793;
                                field804[var6++] = var418.field794 == null ? "" : var418.field794;
                            }
                            continue;
                        }
                        if (var461 == 5005) {
                            if (Statics.field127 == null) {
                                field803[var5++] = -1;
                            } else {
                                field803[var5++] = Statics.field127.field2051;
                            }
                            continue;
                        }
                        if (var461 == 5008) {
                            var6--;
                            String var420 = field804[var6];
                            var5--;
                            int var421 = field803[var5];
                            String var422 = var420.toLowerCase();
                            byte var423 = 0;
                            if (var422.startsWith(class157.field2467)) {
                                var423 = 0;
                                var420 = var420.substring(class157.field2467.length());
                            } else if (var422.startsWith(class157.field2469)) {
                                var423 = 1;
                                var420 = var420.substring(class157.field2469.length());
                            } else if (var422.startsWith(class157.field2471)) {
                                var423 = 2;
                                var420 = var420.substring(class157.field2471.length());
                            } else if (var422.startsWith(class157.field2473)) {
                                var423 = 3;
                                var420 = var420.substring(class157.field2473.length());
                            } else if (var422.startsWith(class157.field2475)) {
                                var423 = 4;
                                var420 = var420.substring(class157.field2475.length());
                            } else if (var422.startsWith(class157.field2477)) {
                                var423 = 5;
                                var420 = var420.substring(class157.field2477.length());
                            } else if (var422.startsWith(class157.field2396)) {
                                var423 = 6;
                                var420 = var420.substring(class157.field2396.length());
                            } else if (var422.startsWith(class157.field2481)) {
                                var423 = 7;
                                var420 = var420.substring(class157.field2481.length());
                            } else if (var422.startsWith(class157.field2483)) {
                                var423 = 8;
                                var420 = var420.substring(class157.field2483.length());
                            } else if (var422.startsWith(class157.field2485)) {
                                var423 = 9;
                                var420 = var420.substring(class157.field2485.length());
                            } else if (var422.startsWith(class157.field2491)) {
                                var423 = 10;
                                var420 = var420.substring(class157.field2491.length());
                            } else if (var422.startsWith(class157.field2489)) {
                                var423 = 11;
                                var420 = var420.substring(class157.field2489.length());
                            } else if (client.field299 != 0) {
                                if (var422.startsWith(class157.field2468)) {
                                    var423 = 0;
                                    var420 = var420.substring(class157.field2468.length());
                                } else if (var422.startsWith(class157.field2470)) {
                                    var423 = 1;
                                    var420 = var420.substring(class157.field2470.length());
                                } else if (var422.startsWith(class157.field2408)) {
                                    var423 = 2;
                                    var420 = var420.substring(class157.field2408.length());
                                } else if (var422.startsWith(class157.field2474)) {
                                    var423 = 3;
                                    var420 = var420.substring(class157.field2474.length());
                                } else if (var422.startsWith(class157.field2502)) {
                                    var423 = 4;
                                    var420 = var420.substring(class157.field2502.length());
                                } else if (var422.startsWith(class157.field2357)) {
                                    var423 = 5;
                                    var420 = var420.substring(class157.field2357.length());
                                } else if (var422.startsWith(class157.field2480)) {
                                    var423 = 6;
                                    var420 = var420.substring(class157.field2480.length());
                                } else if (var422.startsWith(class157.field2341)) {
                                    var423 = 7;
                                    var420 = var420.substring(class157.field2341.length());
                                } else if (var422.startsWith(class157.field2484)) {
                                    var423 = 8;
                                    var420 = var420.substring(class157.field2484.length());
                                } else if (var422.startsWith(class157.field2486)) {
                                    var423 = 9;
                                    var420 = var420.substring(class157.field2486.length());
                                } else if (var422.startsWith(class157.field2506)) {
                                    var423 = 10;
                                    var420 = var420.substring(class157.field2506.length());
                                } else if (var422.startsWith(class157.field2459)) {
                                    var423 = 11;
                                    var420 = var420.substring(class157.field2459.length());
                                }
                            }
                            String var424 = var420.toLowerCase();
                            byte var425 = 0;
                            if (var424.startsWith(class157.field2359)) {
                                var425 = 1;
                                var420 = var420.substring(class157.field2359.length());
                            } else if (var424.startsWith(class157.field2493)) {
                                var425 = 2;
                                var420 = var420.substring(class157.field2493.length());
                            } else if (var424.startsWith(class157.field2495)) {
                                var425 = 3;
                                var420 = var420.substring(class157.field2495.length());
                            } else if (var424.startsWith(class157.field2497)) {
                                var425 = 4;
                                var420 = var420.substring(class157.field2497.length());
                            } else if (var424.startsWith(class157.field2499)) {
                                var425 = 5;
                                var420 = var420.substring(class157.field2499.length());
                            } else if (client.field299 != 0) {
                                if (var424.startsWith(class157.field2492)) {
                                    var425 = 1;
                                    var420 = var420.substring(class157.field2492.length());
                                } else if (var424.startsWith(class157.field2494)) {
                                    var425 = 2;
                                    var420 = var420.substring(class157.field2494.length());
                                } else if (var424.startsWith(class157.field2496)) {
                                    var425 = 3;
                                    var420 = var420.substring(class157.field2496.length());
                                } else if (var424.startsWith(class157.field2498)) {
                                    var425 = 4;
                                    var420 = var420.substring(class157.field2498.length());
                                } else if (var424.startsWith(class157.field2500)) {
                                    var425 = 5;
                                    var420 = var420.substring(class157.field2500.length());
                                }
                            }
                            client.field302.method2586(246);
                            client.field302.method2330(0);
                            int var426 = client.field302.field1980;
                            client.field302.method2330(var421);
                            client.field302.method2330(var423);
                            client.field302.method2330(var425);
                            class222.method2623(client.field302, var420);
                            client.field302.method2342(client.field302.field1980 - var426);
                            continue;
                        }
                        if (var461 == 5009) {
                            var6 -= 2;
                            String var427 = field804[var6];
                            String var428 = field804[var6 + 1];
                            client.field302.method2586(253);
                            client.field302.method2331(0);
                            int var429 = client.field302.field1980;
                            client.field302.method2336(var427);
                            class222.method2623(client.field302, var428);
                            client.field302.method2341(client.field302.field1980 - var429);
                            continue;
                        }
                        if (var461 == 5015) {
                            String var430;
                            if (Statics.field2254 == null || Statics.field2254.field41 == null) {
                                var430 = "";
                            } else {
                                var430 = Statics.field2254.field41;
                            }
                            field804[var6++] = var430;
                            continue;
                        }
                        if (var461 == 5016) {
                            field803[var5++] = client.field483;
                            continue;
                        }
                        if (var461 == 5017) {
                            var5--;
                            int var431 = field803[var5];
                            field803[var5++] = class12.method2629(var431);
                            continue;
                        }
                        if (var461 == 5018) {
                            var5--;
                            int var432 = field803[var5];
                            field803[var5++] = Statics.method1598(var432);
                            continue;
                        }
                        if (var461 == 5019) {
                            var5--;
                            int var433 = field803[var5];
                            field803[var5++] = class12.method164(var433);
                            continue;
                        }
                        if (var461 == 5020) {
                            var6--;
                            String var434 = field804[var6];
                            if (var434.equalsIgnoreCase("toggleroof")) {
                                Statics.field1549.field132 = !Statics.field1549.field132;
                                class9.method2269();
                                if (Statics.field1549.field132) {
                                    class12.method2769(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method2769(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var434.equalsIgnoreCase("displayfps")) {
                                client.field310 = !client.field310;
                            }
                            if (client.field461 >= 2) {
                                if (var434.equalsIgnoreCase("fpson")) {
                                    client.field310 = true;
                                }
                                if (var434.equalsIgnoreCase("fpsoff")) {
                                    client.field310 = false;
                                }
                                if (var434.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var434.equalsIgnoreCase("clientdrop")) {
                                    if (client.field346 > 0) {
                                        client.method3697();
                                    } else {
                                        client.method10(40);
                                        Statics.field2070 = Statics.field2913;
                                        Statics.field2913 = null;
                                    }
                                }
                                if (var434.equalsIgnoreCase("errortest") && client.field296 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field302.method2586(218);
                            client.field302.method2330(var434.length() + 1);
                            client.field302.method2336(var434);
                            continue;
                        }
                        if (var461 == 5021) {
                            var6--;
                            client.field515 = field804[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var461 == 5022) {
                            field804[var6++] = client.field515;
                            continue;
                        }
                    }
                }
                if (var461 < 5400) {
                    if (var461 == 5306) {
                        int[] var435 = field803;
                        int var436 = var5++;
                        int var437 = client.field509 ? 2 : 1;
                        var435[var436] = var437;
                        continue;
                    }
                    if (var461 == 5307) {
                        var5--;
                        int var438 = field803[var5];
                        if (var438 != 1 && var438 != 2) {
                            continue;
                        }
                        client.field508 = 0L;
                        if (var438 >= 2) {
                            client.field509 = true;
                        } else {
                            client.field509 = false;
                        }
                        client.method1775();
                        if (client.field553 >= 25) {
                            client.field302.method2586(78);
                            class122 var439 = client.field302;
                            int var440 = client.field509 ? 2 : 1;
                            var439.method2330(var440);
                            client.field302.method2331(Statics.field108);
                            client.field302.method2331(Statics.field750);
                        }
                        class144.field2191 = true;
                        continue;
                    }
                    if (var461 == 5308) {
                        field803[var5++] = Statics.field1549.field134;
                        continue;
                    }
                    if (var461 == 5309) {
                        var5--;
                        int var441 = field803[var5];
                        if (var441 == 1 || var441 == 2) {
                            Statics.field1549.field134 = var441;
                            class9.method2269();
                        }
                        continue;
                    }
                }
                if (var461 < 5600) {
                    if (var461 == 5504) {
                        var5 -= 2;
                        int var442 = field803[var5];
                        int var443 = field803[var5 + 1];
                        if (!client.field543) {
                            client.field555 = var442;
                            client.field496 = var443;
                        }
                        continue;
                    }
                    if (var461 == 5505) {
                        field803[var5++] = client.field555;
                        continue;
                    }
                    if (var461 == 5506) {
                        field803[var5++] = client.field496;
                        continue;
                    }
                    if (var461 == 5530) {
                        var5--;
                        int var444 = field803[var5];
                        if (var444 < 0) {
                            var444 = 0;
                        }
                        client.field334 = var444;
                        continue;
                    }
                    if (var461 == 5531) {
                        field803[var5++] = client.field334;
                        continue;
                    }
                }
                if (var461 >= 5700 || var461 != 5630) {
                    if (var461 < 6300) {
                        if (var461 == 6200) {
                            var5 -= 2;
                            client.field442 = (short) field803[var5];
                            if (client.field442 <= 0) {
                                client.field442 = 256;
                            }
                            client.field551 = (short) field803[var5 + 1];
                            if (client.field551 <= 0) {
                                client.field551 = 205;
                            }
                            continue;
                        }
                        if (var461 == 6201) {
                            var5 -= 2;
                            client.field552 = (short) field803[var5];
                            if (client.field552 <= 0) {
                                client.field552 = 256;
                            }
                            client.field458 = (short) field803[var5 + 1];
                            if (client.field458 <= 0) {
                                client.field458 = 320;
                            }
                            continue;
                        }
                        if (var461 == 6202) {
                            var5 -= 4;
                            client.field554 = (short) field803[var5];
                            if (client.field554 <= 0) {
                                client.field554 = 1;
                            }
                            client.field373 = (short) field803[var5 + 1];
                            if (client.field373 <= 0) {
                                client.field373 = 32767;
                            } else if (client.field373 < client.field554) {
                                client.field373 = client.field554;
                            }
                            client.field326 = (short) field803[var5 + 2];
                            if (client.field326 <= 0) {
                                client.field326 = 1;
                            }
                            client.field557 = (short) field803[var5 + 3];
                            if (client.field557 <= 0) {
                                client.field557 = 32767;
                            } else if (client.field557 < client.field326) {
                                client.field557 = client.field326;
                            }
                            continue;
                        }
                        if (var461 == 6203) {
                            if (client.field466 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = -1;
                            } else {
                                client.method169(0, 0, client.field466.field2753, client.field466.field2760, false);
                                field803[var5++] = client.field560;
                                field803[var5++] = client.field561;
                            }
                            continue;
                        }
                        if (var461 == 6204) {
                            field803[var5++] = client.field552;
                            field803[var5++] = client.field458;
                            continue;
                        }
                        if (var461 == 6205) {
                            field803[var5++] = client.field442;
                            field803[var5++] = client.field551;
                            continue;
                        }
                    }
                    if (var461 < 6600) {
                        if (var461 == 6500) {
                            field803[var5++] = class26.method100() ? 1 : 0;
                            continue;
                        }
                        if (var461 == 6501) {
                            class26.field641 = 0;
                            class26 var445 = class26.method1006();
                            if (var445 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                                field803[var5++] = 0;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                            } else {
                                field803[var5++] = var445.field639;
                                field803[var5++] = var445.field640;
                                field804[var6++] = var445.field644;
                                field803[var5++] = var445.field645;
                                field803[var5++] = var445.field636;
                                field804[var6++] = var445.field631;
                            }
                            continue;
                        }
                        if (var461 == 6502) {
                            class26 var447 = class26.method1006();
                            if (var447 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                                field803[var5++] = 0;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                            } else {
                                field803[var5++] = var447.field639;
                                field803[var5++] = var447.field640;
                                field804[var6++] = var447.field644;
                                field803[var5++] = var447.field645;
                                field803[var5++] = var447.field636;
                                field804[var6++] = var447.field631;
                            }
                            continue;
                        }
                        if (var461 == 6506) {
                            var5--;
                            int var448 = field803[var5];
                            class26 var449 = null;
                            for (int var450 = 0; var450 < class26.field635; var450++) {
                                if (Statics.field634[var450].field639 == var448) {
                                    var449 = Statics.field634[var450];
                                    break;
                                }
                            }
                            if (var449 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                                field803[var5++] = 0;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                            } else {
                                field803[var5++] = var449.field639;
                                field803[var5++] = var449.field640;
                                field804[var6++] = var449.field644;
                                field803[var5++] = var449.field645;
                                field803[var5++] = var449.field636;
                                field804[var6++] = var449.field631;
                            }
                            continue;
                        }
                        if (var461 == 6507) {
                            var5 -= 4;
                            int var451 = field803[var5];
                            boolean var452 = field803[var5 + 1] == 1;
                            int var453 = field803[var5 + 2];
                            boolean var454 = field803[var5 + 3] == 1;
                            if (Statics.field634 != null) {
                                class26.method181(0, Statics.field634.length - 1, var451, var452, var453, var454);
                            }
                            continue;
                        }
                        if (var461 == 6511) {
                            var5--;
                            int var455 = field803[var5];
                            if (var455 >= 0 && var455 < class26.field635) {
                                class26 var456 = Statics.field634[var455];
                                field803[var5++] = var456.field639;
                                field803[var5++] = var456.field640;
                                field804[var6++] = var456.field644;
                                field803[var5++] = var456.field645;
                                field803[var5++] = var456.field636;
                                field804[var6++] = var456.field631;
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
                client.field346 = 250;
            }
        } catch (Exception var460) {
            StringBuilder var458 = new StringBuilder(30);
            var458.append("").append(var4.field3112).append(" ");
            for (int var459 = field805 - 1; var459 >= 0; var459--) {
                var458.append("").append(field798[var459].field214.field3112).append(" ");
            }
            var458.append("").append(var10);
            class148.method643(var458.toString(), var460);
        }
    }

    @ObfuscatedName("dd.f(IB)V")
    public static void method2230(int arg0) {
        if (arg0 == -1 || !Statics.method2150(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2851[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2823 != null) {
                class1 var4 = new class1();
                var4.field7 = var3;
                var4.field9 = var3.field2823;
                method1496(var4, 2000000);
            }
        }
    }
}
