package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("aq")
public class class37 {

    @ObfuscatedName("aq.p")
    public static int[] field801 = new int[5];

    @ObfuscatedName("aq.c")
    public static int[][] field802 = new int[5][5000];

    @ObfuscatedName("aq.f")
    public static int[] field803 = new int[1000];

    @ObfuscatedName("aq.y")
    public static String[] field804 = new String[1000];

    @ObfuscatedName("aq.w")
    public static int field805 = 0;

    @ObfuscatedName("aq.l")
    public static class15[] field807 = new class15[50];

    @ObfuscatedName("aq.o")
    public static Calendar field809 = Calendar.getInstance();

    @ObfuscatedName("aq.u")
    public static final String[] field815 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("aq.s")
    public static int field810 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.h(Lh;I)V")
    public static void method2637(class1 arg0) {
        method705(arg0, 200000);
    }

    @ObfuscatedName("aa.m(Lh;II)V")
    public static void method705(class1 arg0, int arg1) {
        Object[] var2 = arg0.field6;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method2911(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field593;
        int[] var9 = var4.field600;
        byte var10 = -1;
        field805 = 0;
        try {
            Statics.field814 = new int[var4.field595];
            int var11 = 0;
            Statics.field2086 = new String[var4.field596];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field8 == null ? -1 : arg0.field8.field2741;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field3;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field8 == null ? -1 : arg0.field8.field2866;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2741;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2866;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field11;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field814[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field2086[var12++] = var15;
                }
            }
            int var16 = 0;
            field810 = arg0.field5;
            label3157: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var484 = var8[var7];
                if (var484 < 100) {
                    if (var484 == 0) {
                        field803[var5++] = var9[var7];
                        continue;
                    }
                    if (var484 == 1) {
                        int var17 = var9[var7];
                        field803[var5++] = class176.field2896[var17];
                        continue;
                    }
                    if (var484 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2896[var18] = field803[var5];
                        client.method2979(var18);
                        continue;
                    }
                    if (var484 == 3) {
                        field804[var6++] = var4.field598[var7];
                        continue;
                    }
                    if (var484 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var484 == 7) {
                        var5 -= 2;
                        if (field803[var5 + 1] != field803[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var484 == 8) {
                        var5 -= 2;
                        if (field803[var5 + 1] == field803[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var484 == 9) {
                        var5 -= 2;
                        if (field803[var5] < field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var484 == 10) {
                        var5 -= 2;
                        if (field803[var5] > field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var484 == 21) {
                        if (field805 == 0) {
                            return;
                        }
                        class15 var19 = field807[--field805];
                        var4 = var19.field201;
                        var8 = var4.field593;
                        var9 = var4.field600;
                        var7 = var19.field209;
                        Statics.field814 = var19.field200;
                        Statics.field2086 = var19.field203;
                        continue;
                    }
                    if (var484 == 25) {
                        int var20 = var9[var7];
                        field803[var5++] = class176.method624(var20);
                        continue;
                    }
                    if (var484 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class176.method2733(var21, field803[var5]);
                        continue;
                    }
                    if (var484 == 31) {
                        var5 -= 2;
                        if (field803[var5] <= field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var484 == 32) {
                        var5 -= 2;
                        if (field803[var5] >= field803[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var484 == 33) {
                        field803[var5++] = Statics.field814[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var484 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field814[var10001] = field803[var5];
                        continue;
                    }
                    if (var484 == 35) {
                        field804[var6++] = Statics.field2086[var9[var7]];
                        continue;
                    }
                    if (var484 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2086[var10001] = field804[var6];
                        continue;
                    }
                    if (var484 == 37) {
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
                    if (var484 == 38) {
                        var5--;
                        continue;
                    }
                    if (var484 == 39) {
                        var6--;
                        continue;
                    }
                    if (var484 == 40) {
                        int var34 = var9[var7];
                        class23 var35 = class23.method2911(var34);
                        int[] var36 = new int[var35.field595];
                        String[] var37 = new String[var35.field596];
                        for (int var38 = 0; var38 < var35.field597; var38++) {
                            var36[var38] = field803[var5 - var35.field597 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field594; var39++) {
                            var37[var39] = field804[var6 - var35.field594 + var39];
                        }
                        var5 -= var35.field597;
                        var6 -= var35.field594;
                        class15 var40 = new class15();
                        var40.field201 = var4;
                        var40.field209 = var7;
                        var40.field200 = Statics.field814;
                        var40.field203 = Statics.field2086;
                        field807[++field805 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field593;
                        var9 = var35.field600;
                        var7 = -1;
                        Statics.field814 = var36;
                        Statics.field2086 = var37;
                        continue;
                    }
                    if (var484 == 42) {
                        field803[var5++] = Statics.field751.method191(var9[var7]);
                        continue;
                    }
                    if (var484 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field751.method190(var10001, field803[var5]);
                        continue;
                    }
                    if (var484 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field803[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field801[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label3157;
                                }
                                field802[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var484 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field803[var5];
                        if (var47 >= 0 && var47 < field801[var46]) {
                            field803[var5++] = field802[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var484 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field803[var5];
                        if (var49 >= 0 && var49 < field801[var48]) {
                            field802[var48][var49] = field803[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var484 == 47) {
                        String var50 = Statics.field751.method203(var9[var7]);
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field804[var6++] = var50;
                        continue;
                    }
                    if (var484 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field751.method193(var10001, field804[var6]);
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var484 < 1000) {
                    if (var484 == 100) {
                        var5 -= 3;
                        int var52 = field803[var5];
                        int var53 = field803[var5 + 1];
                        int var54 = field803[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var55 = class173.method81(var52);
                        if (var55.field2863 == null) {
                            var55.field2863 = new class173[var54 + 1];
                        }
                        if (var55.field2863.length <= var54) {
                            class173[] var56 = new class173[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2863.length; var57++) {
                                var56[var57] = var55.field2863[var57];
                            }
                            var55.field2863 = var56;
                        }
                        if (var54 > 0 && var55.field2863[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class173 var58 = new class173();
                        var58.field2743 = var53;
                        var58.field2760 = var58.field2741 = var55.field2741;
                        var58.field2866 = var54;
                        var58.field2740 = true;
                        var55.field2863[var54] = var58;
                        if (var51) {
                            Statics.field808 = var58;
                        } else {
                            Statics.field2895 = var58;
                        }
                        client.method2930(var55);
                        continue;
                    }
                    if (var484 == 101) {
                        class173 var59 = var51 ? Statics.field808 : Statics.field2895;
                        class173 var60 = class173.method81(var59.field2741);
                        var60.field2863[var59.field2866] = null;
                        client.method2930(var60);
                        continue;
                    }
                    if (var484 == 102) {
                        var5--;
                        class173 var61 = class173.method81(field803[var5]);
                        var61.field2863 = null;
                        client.method2930(var61);
                        continue;
                    }
                    if (var484 == 200) {
                        var5 -= 2;
                        int var62 = field803[var5];
                        int var63 = field803[var5 + 1];
                        class173 var64 = class173.method2625(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field803[var5++] = 1;
                            if (var51) {
                                Statics.field808 = var64;
                            } else {
                                Statics.field2895 = var64;
                            }
                            continue;
                        }
                        field803[var5++] = 0;
                        continue;
                    }
                    if (var484 == 201) {
                        var5--;
                        class173 var65 = class173.method81(field803[var5]);
                        if (var65 == null) {
                            field803[var5++] = 0;
                        } else {
                            field803[var5++] = 1;
                            if (var51) {
                                Statics.field808 = var65;
                            } else {
                                Statics.field2895 = var65;
                            }
                        }
                        continue;
                    }
                } else if (var484 >= 1000 && var484 < 1100 || var484 >= 2000 && var484 < 2100) {
                    int var66 = -1;
                    class173 var67;
                    if (var484 >= 2000) {
                        var484 -= 1000;
                        var5--;
                        var66 = field803[var5];
                        var67 = class173.method81(var66);
                    } else {
                        var67 = var51 ? Statics.field808 : Statics.field2895;
                    }
                    if (var484 == 1000) {
                        var5 -= 4;
                        var67.field2848 = field803[var5];
                        var67.field2751 = field803[var5 + 1];
                        var67.field2832 = field803[var5 + 2];
                        var67.field2780 = field803[var5 + 3];
                        client.method2930(var67);
                        client.method1748(var67);
                        if (var66 != -1 && var67.field2743 == 0) {
                            client.method2255(Statics.field2793[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var484 == 1001) {
                        var5 -= 4;
                        var67.field2748 = field803[var5];
                        var67.field2753 = field803[var5 + 1];
                        var67.field2736 = field803[var5 + 2];
                        var67.field2749 = field803[var5 + 3];
                        client.method2930(var67);
                        client.method1748(var67);
                        if (var66 != -1 && var67.field2743 == 0) {
                            client.method2255(Statics.field2793[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var484 == 1003) {
                        var5--;
                        boolean var68 = field803[var5] == 1;
                        if (var67.field2761 != var68) {
                            var67.field2761 = var68;
                            client.method2930(var67);
                        }
                        continue;
                    }
                    if (var484 == 1005) {
                        var5--;
                        var67.field2807 = field803[var5] == 1;
                        continue;
                    }
                    if (var484 == 1006) {
                        var5--;
                        var67.field2873 = field803[var5] == 1;
                        continue;
                    }
                } else if (var484 >= 1100 && var484 < 1200 || var484 >= 2100 && var484 < 2200) {
                    int var69 = -1;
                    class173 var70;
                    if (var484 >= 2000) {
                        var484 -= 1000;
                        var5--;
                        var69 = field803[var5];
                        var70 = class173.method81(var69);
                    } else {
                        var70 = var51 ? Statics.field808 : Statics.field2895;
                    }
                    if (var484 == 1100) {
                        var5 -= 2;
                        var70.field2762 = field803[var5];
                        if (var70.field2762 > var70.field2815 - var70.field2756) {
                            var70.field2762 = var70.field2815 - var70.field2756;
                        }
                        if (var70.field2762 < 0) {
                            var70.field2762 = 0;
                        }
                        var70.field2763 = field803[var5 + 1];
                        if (var70.field2763 > var70.field2765 - var70.field2757) {
                            var70.field2763 = var70.field2765 - var70.field2757;
                        }
                        if (var70.field2763 < 0) {
                            var70.field2763 = 0;
                        }
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1101) {
                        var5--;
                        var70.field2766 = field803[var5];
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1102) {
                        var5--;
                        var70.field2770 = field803[var5] == 1;
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1103) {
                        var5--;
                        var70.field2752 = field803[var5];
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1104) {
                        var5--;
                        var70.field2831 = field803[var5];
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1105) {
                        var5--;
                        var70.field2774 = field803[var5];
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1106) {
                        var5--;
                        var70.field2776 = field803[var5];
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1107) {
                        var5--;
                        var70.field2777 = field803[var5] == 1;
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1108) {
                        var70.field2782 = 1;
                        var5--;
                        var70.field2783 = field803[var5];
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1109) {
                        var5 -= 6;
                        var70.field2864 = field803[var5];
                        var70.field2789 = field803[var5 + 1];
                        var70.field2790 = field803[var5 + 2];
                        var70.field2791 = field803[var5 + 3];
                        var70.field2865 = field803[var5 + 4];
                        var70.field2871 = field803[var5 + 5];
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1110) {
                        var5--;
                        int var71 = field803[var5];
                        if (var70.field2814 != var71) {
                            var70.field2814 = var71;
                            var70.field2739 = 0;
                            var70.field2862 = 0;
                            client.method2930(var70);
                        }
                        continue;
                    }
                    if (var484 == 1111) {
                        var5--;
                        var70.field2796 = field803[var5] == 1;
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1112) {
                        var6--;
                        String var72 = field804[var6];
                        if (!var72.equals(var70.field2799)) {
                            var70.field2799 = var72;
                            client.method2930(var70);
                        }
                        continue;
                    }
                    if (var484 == 1113) {
                        var5--;
                        var70.field2798 = field803[var5];
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1114) {
                        var5 -= 3;
                        var70.field2802 = field803[var5];
                        var70.field2803 = field803[var5 + 1];
                        var70.field2837 = field803[var5 + 2];
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1115) {
                        var5--;
                        var70.field2804 = field803[var5] == 1;
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1116) {
                        var5--;
                        var70.field2778 = field803[var5];
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1117) {
                        var5--;
                        var70.field2801 = field803[var5];
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1118) {
                        var5--;
                        var70.field2808 = field803[var5] == 1;
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1119) {
                        var5--;
                        var70.field2781 = field803[var5] == 1;
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1120) {
                        var5 -= 2;
                        var70.field2815 = field803[var5];
                        var70.field2765 = field803[var5 + 1];
                        client.method2930(var70);
                        if (var69 != -1 && var70.field2743 == 0) {
                            client.method2255(Statics.field2793[var69 >> 16], var70, false);
                        }
                        continue;
                    }
                    if (var484 == 1121) {
                        int var73 = var70.field2741;
                        int var74 = var70.field2866;
                        client.field329.method2565(246);
                        client.field329.method2513(var74);
                        client.field329.method2363(var73);
                        client.field449 = var70;
                        client.method2930(var70);
                        continue;
                    }
                    if (var484 == 1122) {
                        var5--;
                        var70.field2775 = field803[var5];
                        client.method2930(var70);
                        continue;
                    }
                } else if (!(var484 < 1200 || var484 >= 1300) || !(var484 < 2200 || var484 >= 2300)) {
                    class173 var75;
                    if (var484 >= 2000) {
                        var484 -= 1000;
                        var5--;
                        var75 = class173.method81(field803[var5]);
                    } else {
                        var75 = var51 ? Statics.field808 : Statics.field2895;
                    }
                    client.method2930(var75);
                    if (var484 == 1200 || var484 == 1205 || var484 == 1212) {
                        var5 -= 2;
                        int var76 = field803[var5];
                        int var77 = field803[var5 + 1];
                        var75.field2859 = var76;
                        var75.field2860 = var77;
                        class52 var78 = class52.method2933(var76);
                        var75.field2790 = var78.field1130;
                        var75.field2791 = var78.field1131;
                        var75.field2865 = var78.field1114;
                        var75.field2864 = var78.field1133;
                        var75.field2789 = var78.field1134;
                        var75.field2871 = var78.field1129;
                        if (var484 == 1205) {
                            var75.field2797 = 0;
                        } else if (var484 == 1212 | var78.field1135 == 1) {
                            var75.field2797 = 1;
                        } else {
                            var75.field2797 = 2;
                        }
                        if (var75.field2794 > 0) {
                            var75.field2871 = var75.field2871 * 32 / var75.field2794;
                        } else if (var75.field2748 > 0) {
                            var75.field2871 = var75.field2871 * 32 / var75.field2748;
                        }
                        continue;
                    }
                    if (var484 == 1201) {
                        var75.field2782 = 2;
                        var5--;
                        var75.field2783 = field803[var5];
                        continue;
                    }
                    if (var484 == 1202) {
                        var75.field2782 = 3;
                        var75.field2783 = Statics.field2683.field32.method3233();
                        continue;
                    }
                } else if (var484 >= 1300 && var484 < 1400 || var484 >= 2300 && var484 < 2400) {
                    class173 var79;
                    if (var484 >= 2000) {
                        var484 -= 1000;
                        var5--;
                        var79 = class173.method81(field803[var5]);
                    } else {
                        var79 = var51 ? Statics.field808 : Statics.field2895;
                    }
                    if (var484 == 1300) {
                        var5--;
                        int var80 = field803[var5] - 1;
                        if (var80 >= 0 && var80 <= 9) {
                            var6--;
                            var79.method3151(var80, field804[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var484 == 1301) {
                        var5 -= 2;
                        int var81 = field803[var5];
                        int var82 = field803[var5 + 1];
                        var79.field2858 = class173.method2625(var81, var82);
                        continue;
                    }
                    if (var484 == 1302) {
                        var5--;
                        var79.field2817 = field803[var5] == 1;
                        continue;
                    }
                    if (var484 == 1303) {
                        var5--;
                        var79.field2735 = field803[var5];
                        continue;
                    }
                    if (var484 == 1304) {
                        var5--;
                        var79.field2813 = field803[var5];
                        continue;
                    }
                    if (var484 == 1305) {
                        var6--;
                        var79.field2812 = field804[var6];
                        continue;
                    }
                    if (var484 == 1306) {
                        var6--;
                        var79.field2768 = field804[var6];
                        continue;
                    }
                    if (var484 == 1307) {
                        var79.field2823 = null;
                        continue;
                    }
                } else {
                    if (var484 >= 1400 && var484 < 1500 || var484 >= 2400 && var484 < 2500) {
                        class173 var83;
                        if (var484 >= 2000) {
                            var484 -= 1000;
                            var5--;
                            var83 = class173.method81(field803[var5]);
                        } else {
                            var83 = var51 ? Statics.field808 : Statics.field2895;
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
                        if (var484 == 1400) {
                            var83.field2846 = var87;
                        }
                        if (var484 == 1401) {
                            var83.field2824 = var87;
                        }
                        if (var484 == 1402) {
                            var83.field2861 = var87;
                        }
                        if (var484 == 1403) {
                            var83.field2825 = var87;
                        }
                        if (var484 == 1404) {
                            var83.field2868 = var87;
                        }
                        if (var484 == 1405) {
                            var83.field2828 = var87;
                        }
                        if (var484 == 1406) {
                            var83.field2747 = var87;
                        }
                        if (var484 == 1407) {
                            var83.field2746 = var87;
                            var83.field2833 = var85;
                        }
                        if (var484 == 1408) {
                            var83.field2838 = var87;
                        }
                        if (var484 == 1409) {
                            var83.field2839 = var87;
                        }
                        if (var484 == 1410) {
                            var83.field2829 = var87;
                        }
                        if (var484 == 1411) {
                            var83.field2730 = var87;
                        }
                        if (var484 == 1412) {
                            var83.field2826 = var87;
                        }
                        if (var484 == 1414) {
                            var83.field2821 = var87;
                            var83.field2835 = var85;
                        }
                        if (var484 == 1415) {
                            var83.field2836 = var87;
                            var83.field2786 = var85;
                        }
                        if (var484 == 1416) {
                            var83.field2830 = var87;
                        }
                        if (var484 == 1417) {
                            var83.field2840 = var87;
                        }
                        if (var484 == 1418) {
                            var83.field2841 = var87;
                        }
                        if (var484 == 1419) {
                            var83.field2842 = var87;
                        }
                        if (var484 == 1420) {
                            var83.field2843 = var87;
                        }
                        if (var484 == 1421) {
                            var83.field2844 = var87;
                        }
                        if (var484 == 1422) {
                            var83.field2845 = var87;
                        }
                        if (var484 == 1423) {
                            var83.field2734 = var87;
                        }
                        if (var484 == 1424) {
                            var83.field2847 = var87;
                        }
                        if (var484 == 1425) {
                            var83.field2849 = var87;
                        }
                        if (var484 == 1426) {
                            var83.field2856 = var87;
                        }
                        if (var484 == 1427) {
                            var83.field2788 = var87;
                        }
                        var83.field2819 = true;
                        continue;
                    }
                    if (var484 < 1600) {
                        class173 var90 = var51 ? Statics.field808 : Statics.field2895;
                        if (var484 == 1500) {
                            field803[var5++] = var90.field2754;
                            continue;
                        }
                        if (var484 == 1501) {
                            field803[var5++] = var90.field2755;
                            continue;
                        }
                        if (var484 == 1502) {
                            field803[var5++] = var90.field2756;
                            continue;
                        }
                        if (var484 == 1503) {
                            field803[var5++] = var90.field2757;
                            continue;
                        }
                        if (var484 == 1504) {
                            field803[var5++] = var90.field2761 ? 1 : 0;
                            continue;
                        }
                        if (var484 == 1505) {
                            field803[var5++] = var90.field2760;
                            continue;
                        }
                    } else if (var484 < 1700) {
                        class173 var91 = var51 ? Statics.field808 : Statics.field2895;
                        if (var484 == 1600) {
                            field803[var5++] = var91.field2762;
                            continue;
                        }
                        if (var484 == 1601) {
                            field803[var5++] = var91.field2763;
                            continue;
                        }
                        if (var484 == 1602) {
                            field804[var6++] = var91.field2799;
                            continue;
                        }
                        if (var484 == 1603) {
                            field803[var5++] = var91.field2815;
                            continue;
                        }
                        if (var484 == 1604) {
                            field803[var5++] = var91.field2765;
                            continue;
                        }
                        if (var484 == 1605) {
                            field803[var5++] = var91.field2871;
                            continue;
                        }
                        if (var484 == 1606) {
                            field803[var5++] = var91.field2790;
                            continue;
                        }
                        if (var484 == 1607) {
                            field803[var5++] = var91.field2865;
                            continue;
                        }
                        if (var484 == 1608) {
                            field803[var5++] = var91.field2791;
                            continue;
                        }
                        if (var484 == 1609) {
                            field803[var5++] = var91.field2752;
                            continue;
                        }
                    } else if (var484 < 1800) {
                        class173 var92 = var51 ? Statics.field808 : Statics.field2895;
                        if (var484 == 1700) {
                            field803[var5++] = var92.field2859;
                            continue;
                        }
                        if (var484 == 1701) {
                            if (var92.field2859 == -1) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = var92.field2860;
                            }
                            continue;
                        }
                        if (var484 == 1702) {
                            field803[var5++] = var92.field2866;
                            continue;
                        }
                    } else if (var484 < 1900) {
                        class173 var93 = var51 ? Statics.field808 : Statics.field2895;
                        if (var484 == 1800) {
                            int[] var94 = field803;
                            int var95 = var5++;
                            int var96 = client.method39(var93);
                            int var97 = var96 >> 11 & 0x3F;
                            var94[var95] = var97;
                            continue;
                        }
                        if (var484 == 1801) {
                            var5--;
                            int var98 = field803[var5];
                            int var485 = var98 - 1;
                            if (var93.field2823 != null && var485 < var93.field2823.length && var93.field2823[var485] != null) {
                                field804[var6++] = var93.field2823[var485];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var484 == 1802) {
                            if (var93.field2812 == null) {
                                field804[var6++] = "";
                            } else {
                                field804[var6++] = var93.field2812;
                            }
                            continue;
                        }
                    } else if (var484 >= 1900 && var484 < 2000 || var484 >= 2900 && var484 < 3000) {
                        class173 var99;
                        if (var484 >= 2000) {
                            var484 -= 1000;
                            var5--;
                            var99 = class173.method81(field803[var5]);
                        } else {
                            var99 = var51 ? Statics.field808 : Statics.field2895;
                        }
                        if (var484 == 1927) {
                            if (field810 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var99.field2788 == null) {
                                return;
                            }
                            class1 var100 = new class1();
                            var100.field8 = var99;
                            var100.field6 = var99.field2788;
                            var100.field5 = field810 + 1;
                            client.field484.method3541(arg0);
                            continue;
                        }
                    } else if (var484 < 2600) {
                        var5--;
                        class173 var101 = class173.method81(field803[var5]);
                        if (var484 == 2500) {
                            field803[var5++] = var101.field2754;
                            continue;
                        }
                        if (var484 == 2501) {
                            field803[var5++] = var101.field2755;
                            continue;
                        }
                        if (var484 == 2502) {
                            field803[var5++] = var101.field2756;
                            continue;
                        }
                        if (var484 == 2503) {
                            field803[var5++] = var101.field2757;
                            continue;
                        }
                        if (var484 == 2504) {
                            field803[var5++] = var101.field2761 ? 1 : 0;
                            continue;
                        }
                        if (var484 == 2505) {
                            field803[var5++] = var101.field2760;
                            continue;
                        }
                    } else if (var484 < 2700) {
                        var5--;
                        class173 var102 = class173.method81(field803[var5]);
                        if (var484 == 2600) {
                            field803[var5++] = var102.field2762;
                            continue;
                        }
                        if (var484 == 2601) {
                            field803[var5++] = var102.field2763;
                            continue;
                        }
                        if (var484 == 2602) {
                            field804[var6++] = var102.field2799;
                            continue;
                        }
                        if (var484 == 2603) {
                            field803[var5++] = var102.field2815;
                            continue;
                        }
                        if (var484 == 2604) {
                            field803[var5++] = var102.field2765;
                            continue;
                        }
                        if (var484 == 2605) {
                            field803[var5++] = var102.field2871;
                            continue;
                        }
                        if (var484 == 2606) {
                            field803[var5++] = var102.field2790;
                            continue;
                        }
                        if (var484 == 2607) {
                            field803[var5++] = var102.field2865;
                            continue;
                        }
                        if (var484 == 2608) {
                            field803[var5++] = var102.field2791;
                            continue;
                        }
                        if (var484 == 2609) {
                            field803[var5++] = var102.field2752;
                            continue;
                        }
                    } else if (var484 < 2800) {
                        if (var484 == 2700) {
                            var5--;
                            class173 var103 = class173.method81(field803[var5]);
                            field803[var5++] = var103.field2859;
                            continue;
                        }
                        if (var484 == 2701) {
                            var5--;
                            class173 var104 = class173.method81(field803[var5]);
                            if (var104.field2859 == -1) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = var104.field2860;
                            }
                            continue;
                        }
                        if (var484 == 2702) {
                            var5--;
                            int var105 = field803[var5];
                            class4 var106 = (class4) client.field446.method3519((long) var105);
                            if (var106 == null) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = 1;
                            }
                            continue;
                        }
                        if (var484 == 2706) {
                            field803[var5++] = client.field422;
                            continue;
                        }
                    } else if (var484 < 2900) {
                        var5--;
                        class173 var107 = class173.method81(field803[var5]);
                        if (var484 == 2800) {
                            int[] var108 = field803;
                            int var109 = var5++;
                            int var110 = client.method39(var107);
                            int var111 = var110 >> 11 & 0x3F;
                            var108[var109] = var111;
                            continue;
                        }
                        if (var484 == 2801) {
                            var5--;
                            int var112 = field803[var5];
                            int var486 = var112 - 1;
                            if (var107.field2823 != null && var486 < var107.field2823.length && var107.field2823[var486] != null) {
                                field804[var6++] = var107.field2823[var486];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var484 == 2802) {
                            if (var107.field2812 == null) {
                                field804[var6++] = "";
                            } else {
                                field804[var6++] = var107.field2812;
                            }
                            continue;
                        }
                    } else if (var484 < 3200) {
                        if (var484 == 3100) {
                            var6--;
                            String var113 = field804[var6];
                            class12.method2263(0, "", var113);
                            continue;
                        }
                        if (var484 == 3101) {
                            var5 -= 2;
                            client.method2196(Statics.field2683, field803[var5], field803[var5 + 1]);
                            continue;
                        }
                        if (var484 == 3103) {
                            client.method2925();
                            continue;
                        }
                        if (var484 == 3104) {
                            var6--;
                            String var114 = field804[var6];
                            int var115 = 0;
                            boolean var116 = false;
                            boolean var117 = false;
                            int var118 = 0;
                            int var119 = var114.length();
                            int var120 = 0;
                            boolean var122;
                            while (true) {
                                if (var120 >= var119) {
                                    var122 = var117;
                                    break;
                                }
                                label3441: {
                                    char var121 = var114.charAt(var120);
                                    if (var120 == 0) {
                                        if (var121 == '-') {
                                            var116 = true;
                                            break label3441;
                                        }
                                        if (var121 == '+') {
                                            break label3441;
                                        }
                                    }
                                    int var487;
                                    if (var121 >= '0' && var121 <= '9') {
                                        var487 = var121 - '0';
                                    } else if (var121 >= 'A' && var121 <= 'Z') {
                                        var487 = var121 - '7';
                                    } else {
                                        if (var121 < 'a' || var121 > 'z') {
                                            var122 = false;
                                            break;
                                        }
                                        var487 = var121 - 'W';
                                    }
                                    if (var487 >= 10) {
                                        var122 = false;
                                        break;
                                    }
                                    if (var116) {
                                        var487 = -var487;
                                    }
                                    int var123 = var118 * 10 + var487;
                                    if (var123 / 10 != var118) {
                                        var122 = false;
                                        break;
                                    }
                                    var118 = var123;
                                    var117 = true;
                                }
                                var120++;
                            }
                            if (var122) {
                                var115 = class163.method3663(var114);
                            }
                            client.field329.method2565(202);
                            client.field329.method2308(var115);
                            continue;
                        }
                        if (var484 == 3105) {
                            var6--;
                            String var125 = field804[var6];
                            client.field329.method2565(122);
                            client.field329.method2305(var125.length() + 1);
                            client.field329.method2311(var125);
                            continue;
                        }
                        if (var484 == 3106) {
                            var6--;
                            String var126 = field804[var6];
                            client.field329.method2565(12);
                            client.field329.method2305(var126.length() + 1);
                            client.field329.method2311(var126);
                            continue;
                        }
                        if (var484 == 3107) {
                            var5--;
                            int var127 = field803[var5];
                            var6--;
                            String var128 = field804[var6];
                            Statics.method174(var127, var128);
                            continue;
                        }
                        if (var484 == 3108) {
                            var5 -= 3;
                            int var129 = field803[var5];
                            int var130 = field803[var5 + 1];
                            int var131 = field803[var5 + 2];
                            class173 var132 = class173.method81(var131);
                            client.method569(var132, var129, var130);
                            continue;
                        }
                        if (var484 == 3109) {
                            var5 -= 2;
                            int var133 = field803[var5];
                            int var134 = field803[var5 + 1];
                            class173 var135 = var51 ? Statics.field808 : Statics.field2895;
                            client.method569(var135, var133, var134);
                            continue;
                        }
                        if (var484 == 3110) {
                            var5--;
                            Statics.field1954 = field803[var5] == 1;
                            continue;
                        }
                        if (var484 == 3111) {
                            field803[var5++] = Statics.field1028.field141 ? 1 : 0;
                            continue;
                        }
                        if (var484 == 3112) {
                            var5--;
                            Statics.field1028.field141 = field803[var5] == 1;
                            class9.method2738();
                            continue;
                        }
                        if (var484 == 3113) {
                            var6--;
                            String var136 = field804[var6];
                            var5--;
                            boolean var137 = field803[var5] == 1;
                            class138.method428(var136, var137, "openjs", false);
                            continue;
                        }
                        if (var484 == 3115) {
                            var5--;
                            int var138 = field803[var5];
                            client.field329.method2565(141);
                            client.field329.method2501(var138);
                            continue;
                        }
                        if (var484 == 3116) {
                            var5--;
                            int var139 = field803[var5];
                            var6 -= 2;
                            String var140 = field804[var6];
                            String var141 = field804[var6 + 1];
                            if (var140.length() <= 500 && var141.length() <= 500) {
                                client.field329.method2565(244);
                                client.field329.method2501(1 + class119.method537(var140) + class119.method537(var141));
                                client.field329.method2344(var139);
                                client.field329.method2311(var141);
                                client.field329.method2311(var140);
                            }
                            continue;
                        }
                    } else if (var484 < 3300) {
                        if (var484 == 3200) {
                            var5 -= 3;
                            client.method2923(field803[var5], field803[var5 + 1], field803[var5 + 2]);
                            continue;
                        }
                        if (var484 == 3201) {
                            var5--;
                            int var142 = field803[var5];
                            if (var142 == -1 && !client.field340) {
                                Statics.field2944.method3348();
                                class183.field2943 = 1;
                                Statics.field2942 = null;
                            } else if (var142 != -1 && client.field538 != var142 && client.field522 != 0 && !client.field340) {
                                class168 var143 = Statics.field264;
                                int var144 = client.field522;
                                class183.field2943 = 1;
                                Statics.field2942 = var143;
                                Statics.field2945 = var142;
                                Statics.field1229 = 0;
                                Statics.field31 = var144;
                                Statics.field2946 = false;
                                Statics.field1865 = 2;
                            }
                            client.field538 = var142;
                            continue;
                        }
                        if (var484 == 3202) {
                            var5 -= 2;
                            int var145 = field803[var5];
                            int var10000 = field803[var5 + 1];
                            if (client.field522 != 0 && var145 != -1) {
                                class183.method3635(Statics.field117, var145, 0, client.field522, false);
                                client.field340 = true;
                            }
                            continue;
                        }
                    } else if (var484 < 3400) {
                        if (var484 == 3300) {
                            field803[var5++] = client.field295;
                            continue;
                        }
                        if (var484 == 3301) {
                            var5 -= 2;
                            int var147 = field803[var5];
                            int var148 = field803[var5 + 1];
                            field803[var5++] = class16.method2010(var147, var148);
                            continue;
                        }
                        if (var484 == 3302) {
                            var5 -= 2;
                            int var149 = field803[var5];
                            int var150 = field803[var5 + 1];
                            int[] var151 = field803;
                            int var152 = var5++;
                            class16 var153 = (class16) class16.field220.method3519((long) var149);
                            int var154;
                            if (var153 == null) {
                                var154 = 0;
                            } else if (var150 >= 0 && var150 < var153.field210.length) {
                                var154 = var153.field210[var150];
                            } else {
                                var154 = 0;
                            }
                            var151[var152] = var154;
                            continue;
                        }
                        if (var484 == 3303) {
                            var5 -= 2;
                            int var155 = field803[var5];
                            int var156 = field803[var5 + 1];
                            int[] var157 = field803;
                            int var158 = var5++;
                            class16 var159 = (class16) class16.field220.method3519((long) var155);
                            int var160;
                            if (var159 == null) {
                                var160 = 0;
                            } else if (var156 == -1) {
                                var160 = 0;
                            } else {
                                int var161 = 0;
                                for (int var162 = 0; var162 < var159.field210.length; var162++) {
                                    if (var159.field211[var162] == var156) {
                                        var161 += var159.field210[var162];
                                    }
                                }
                                var160 = var161;
                            }
                            var157[var158] = var160;
                            continue;
                        }
                        if (var484 == 3304) {
                            var5--;
                            int var163 = field803[var5];
                            int[] var164 = field803;
                            int var165 = var5++;
                            class51 var166 = (class51) class51.field1111.method3472((long) var163);
                            class51 var167;
                            if (var166 == null) {
                                byte[] var168 = Statics.field1108.method3051(5, var163);
                                class51 var169 = new class51();
                                if (var168 != null) {
                                    var169.method967(new class119(var168));
                                }
                                class51.field1111.method3474(var169, (long) var163);
                                var167 = var169;
                            } else {
                                var167 = var166;
                            }
                            var164[var165] = var167.field1109;
                            continue;
                        }
                        if (var484 == 3305) {
                            var5--;
                            int var170 = field803[var5];
                            field803[var5++] = client.field379[var170];
                            continue;
                        }
                        if (var484 == 3306) {
                            var5--;
                            int var171 = field803[var5];
                            field803[var5++] = client.field392[var171];
                            continue;
                        }
                        if (var484 == 3307) {
                            var5--;
                            int var172 = field803[var5];
                            field803[var5++] = client.field440[var172];
                            continue;
                        }
                        if (var484 == 3308) {
                            int var173 = Statics.field880;
                            int var174 = (Statics.field2683.field861 >> 7) + Statics.field77;
                            int var175 = (Statics.field2683.field818 >> 7) + Statics.field271;
                            field803[var5++] = (var173 << 28) + (var174 << 14) + var175;
                            continue;
                        }
                        if (var484 == 3309) {
                            var5--;
                            int var176 = field803[var5];
                            field803[var5++] = var176 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var484 == 3310) {
                            var5--;
                            int var177 = field803[var5];
                            field803[var5++] = var177 >> 28;
                            continue;
                        }
                        if (var484 == 3311) {
                            var5--;
                            int var178 = field803[var5];
                            field803[var5++] = var178 & 0x3FFF;
                            continue;
                        }
                        if (var484 == 3312) {
                            field803[var5++] = client.field290 ? 1 : 0;
                            continue;
                        }
                        if (var484 == 3313) {
                            var5 -= 2;
                            int var179 = field803[var5] + 32768;
                            int var180 = field803[var5 + 1];
                            field803[var5++] = class16.method2010(var179, var180);
                            continue;
                        }
                        if (var484 == 3314) {
                            var5 -= 2;
                            int var181 = field803[var5] + 32768;
                            int var182 = field803[var5 + 1];
                            int[] var183 = field803;
                            int var184 = var5++;
                            class16 var185 = (class16) class16.field220.method3519((long) var181);
                            int var186;
                            if (var185 == null) {
                                var186 = 0;
                            } else if (var182 >= 0 && var182 < var185.field210.length) {
                                var186 = var185.field210[var182];
                            } else {
                                var186 = 0;
                            }
                            var183[var184] = var186;
                            continue;
                        }
                        if (var484 == 3315) {
                            var5 -= 2;
                            int var187 = field803[var5] + 32768;
                            int var188 = field803[var5 + 1];
                            int[] var189 = field803;
                            int var190 = var5++;
                            class16 var191 = (class16) class16.field220.method3519((long) var187);
                            int var192;
                            if (var191 == null) {
                                var192 = 0;
                            } else if (var188 == -1) {
                                var192 = 0;
                            } else {
                                int var193 = 0;
                                for (int var194 = 0; var194 < var191.field210.length; var194++) {
                                    if (var191.field211[var194] == var188) {
                                        var193 += var191.field210[var194];
                                    }
                                }
                                var192 = var193;
                            }
                            var189[var190] = var192;
                            continue;
                        }
                        if (var484 == 3316) {
                            if (client.field452 >= 2) {
                                field803[var5++] = client.field452;
                            } else {
                                field803[var5++] = 0;
                            }
                            continue;
                        }
                        if (var484 == 3317) {
                            field803[var5++] = client.field464;
                            continue;
                        }
                        if (var484 == 3318) {
                            field803[var5++] = client.field357;
                            continue;
                        }
                        if (var484 == 3321) {
                            field803[var5++] = client.field462;
                            continue;
                        }
                        if (var484 == 3322) {
                            field803[var5++] = client.field451;
                            continue;
                        }
                        if (var484 == 3323) {
                            if (client.field300) {
                                field803[var5++] = 1;
                            } else {
                                field803[var5++] = 0;
                            }
                            continue;
                        }
                        if (var484 == 3324) {
                            field803[var5++] = client.field287;
                            continue;
                        }
                    } else if (var484 < 3500) {
                        if (var484 == 3400) {
                            var5 -= 2;
                            int var195 = field803[var5];
                            int var196 = field803[var5 + 1];
                            class49 var197 = (class49) class49.field1093.method3472((long) var195);
                            class49 var198;
                            if (var197 == null) {
                                byte[] var199 = Statics.field1097.method3051(8, var195);
                                class49 var200 = new class49();
                                if (var199 != null) {
                                    var200.method951(new class119(var199));
                                }
                                class49.field1093.method3474(var200, (long) var195);
                                var198 = var200;
                            } else {
                                var198 = var197;
                            }
                            class49 var201 = var198;
                            if (var198.field1088 != 's') {
                            }
                            for (int var202 = 0; var202 < var201.field1091; var202++) {
                                if (var201.field1092[var202] == var196) {
                                    field804[var6++] = var201.field1094[var202];
                                    var201 = null;
                                    break;
                                }
                            }
                            if (var201 != null) {
                                field804[var6++] = var201.field1089;
                            }
                            continue;
                        }
                        if (var484 == 3408) {
                            var5 -= 4;
                            int var203 = field803[var5];
                            int var204 = field803[var5 + 1];
                            int var205 = field803[var5 + 2];
                            int var206 = field803[var5 + 3];
                            class49 var207 = (class49) class49.field1093.method3472((long) var205);
                            class49 var208;
                            if (var207 == null) {
                                byte[] var209 = Statics.field1097.method3051(8, var205);
                                class49 var210 = new class49();
                                if (var209 != null) {
                                    var210.method951(new class119(var209));
                                }
                                class49.field1093.method3474(var210, (long) var205);
                                var208 = var210;
                            } else {
                                var208 = var207;
                            }
                            class49 var211 = var208;
                            if (var208.field1087 == var203 && var208.field1088 == var204) {
                                for (int var212 = 0; var212 < var211.field1091; var212++) {
                                    if (var211.field1092[var212] == var206) {
                                        if (var204 == 115) {
                                            field804[var6++] = var211.field1094[var212];
                                        } else {
                                            field803[var5++] = var211.field1085[var212];
                                        }
                                        var211 = null;
                                        break;
                                    }
                                }
                                if (var211 != null) {
                                    if (var204 == 115) {
                                        field804[var6++] = var211.field1089;
                                    } else {
                                        field803[var5++] = var211.field1090;
                                    }
                                }
                                continue;
                            }
                            if (var204 == 115) {
                                field804[var6++] = "null";
                            } else {
                                field803[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var484 < 3700) {
                        if (var484 == 3600) {
                            if (client.field553 == 0) {
                                field803[var5++] = -2;
                            } else if (client.field553 == 1) {
                                field803[var5++] = -1;
                            } else {
                                field803[var5++] = client.field552;
                            }
                            continue;
                        }
                        if (var484 == 3601) {
                            var5--;
                            int var213 = field803[var5];
                            if (client.field553 == 2 && var213 < client.field552) {
                                field804[var6++] = client.field426[var213].field244;
                                field804[var6++] = client.field426[var213].field245;
                                continue;
                            }
                            field804[var6++] = "";
                            field804[var6++] = "";
                            continue;
                        }
                        if (var484 == 3602) {
                            var5--;
                            int var214 = field803[var5];
                            if (client.field553 == 2 && var214 < client.field552) {
                                field803[var5++] = client.field426[var214].field243;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var484 == 3603) {
                            var5--;
                            int var215 = field803[var5];
                            if (client.field553 == 2 && var215 < client.field552) {
                                field803[var5++] = client.field426[var215].field247;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var484 == 3604) {
                            var6--;
                            String var216 = field804[var6];
                            var5--;
                            int var217 = field803[var5];
                            client.field329.method2565(242);
                            client.field329.method2305(class119.method537(var216) + 1);
                            client.field329.method2343(var217);
                            client.field329.method2311(var216);
                            continue;
                        }
                        if (var484 == 3605) {
                            var6--;
                            String var218 = field804[var6];
                            if (var218 == null) {
                                continue;
                            }
                            if ((client.field552 < 200 || client.field562 == 1) && client.field552 < 400) {
                                String var219 = class164.method188(var218, Statics.field195);
                                if (var219 == null) {
                                    continue;
                                }
                                for (int var220 = 0; var220 < client.field552; var220++) {
                                    class18 var221 = client.field426[var220];
                                    String var222 = class164.method188(var221.field244, Statics.field195);
                                    if (var222 != null && var222.equals(var219)) {
                                        class12.method2263(30, "", var218 + class157.field2486);
                                        continue label3157;
                                    }
                                    if (var221.field245 != null) {
                                        String var223 = class164.method188(var221.field245, Statics.field195);
                                        if (var223 != null && var223.equals(var219)) {
                                            class12.method2263(30, "", var218 + class157.field2486);
                                            continue label3157;
                                        }
                                    }
                                }
                                for (int var224 = 0; var224 < client.field317; var224++) {
                                    class8 var225 = client.field557[var224];
                                    String var226 = class164.method188(var225.field135, Statics.field195);
                                    if (var226 != null && var226.equals(var219)) {
                                        class12.method2263(30, "", class157.field2513 + var218 + class157.field2561);
                                        continue label3157;
                                    }
                                    if (var225.field128 != null) {
                                        String var227 = class164.method188(var225.field128, Statics.field195);
                                        if (var227 != null && var227.equals(var219)) {
                                            class12.method2263(30, "", class157.field2513 + var218 + class157.field2561);
                                            continue label3157;
                                        }
                                    }
                                }
                                if (class164.method188(Statics.field2683.field56, Statics.field195).equals(var219)) {
                                    class12.method2263(30, "", class157.field2466);
                                } else {
                                    client.field329.method2565(152);
                                    client.field329.method2305(class119.method537(var218));
                                    client.field329.method2311(var218);
                                }
                                continue;
                            }
                            class12.method2263(30, "", class157.field2536);
                            continue;
                        }
                        if (var484 == 3606) {
                            var6--;
                            String var228 = field804[var6];
                            if (var228 == null) {
                                continue;
                            }
                            String var229 = class164.method188(var228, Statics.field195);
                            if (var229 == null) {
                                continue;
                            }
                            int var230 = 0;
                            while (true) {
                                if (var230 >= client.field552) {
                                    continue label3157;
                                }
                                class18 var231 = client.field426[var230];
                                String var232 = var231.field244;
                                String var233 = class164.method188(var232, Statics.field195);
                                boolean var234;
                                if (var228 == null || var232 == null) {
                                    var234 = false;
                                } else if (var228.startsWith("#") || var232.startsWith("#")) {
                                    var234 = var228.equals(var232);
                                } else {
                                    var234 = var229.equals(var233);
                                }
                                if (var234) {
                                    client.field552--;
                                    for (int var235 = var230; var235 < client.field552; var235++) {
                                        client.field426[var235] = client.field426[var235 + 1];
                                    }
                                    client.field478 = client.field470;
                                    client.field329.method2565(236);
                                    client.field329.method2305(class119.method537(var228));
                                    client.field329.method2311(var228);
                                    continue label3157;
                                }
                                var230++;
                            }
                        }
                        if (var484 == 3607) {
                            var6--;
                            String var236 = field804[var6];
                            client.method2108(var236, false);
                            continue;
                        }
                        if (var484 == 3608) {
                            var6--;
                            String var237 = field804[var6];
                            client.method2928(var237);
                            continue;
                        }
                        if (var484 == 3609) {
                            var6--;
                            String var238 = field804[var6];
                            class152[] var239 = class152.method2254();
                            for (int var240 = 0; var240 < var239.length; var240++) {
                                class152 var241 = var239[var240];
                                if (var241.field2259 != -1 && var238.startsWith(Statics.method2243(var241.field2259))) {
                                    var238 = var238.substring(6 + Integer.toString(var241.field2259).length());
                                    break;
                                }
                            }
                            field803[var5++] = client.method838(var238, false) ? 1 : 0;
                            continue;
                        }
                        if (var484 == 3611) {
                            if (client.field512 == null) {
                                field804[var6++] = "";
                                continue;
                            }
                            String[] var242 = field804;
                            int var243 = var6++;
                            String var244 = client.field512;
                            long var245 = 0L;
                            int var247 = var244.length();
                            for (int var248 = 0; var248 < var247; var248++) {
                                var245 *= 37L;
                                char var249 = var244.charAt(var248);
                                if (var249 >= 'A' && var249 <= 'Z') {
                                    var245 += (long) (var249 + 1 - 65);
                                } else if (var249 >= 'a' && var249 <= 'z') {
                                    var245 += (long) (var249 + 1 - 97);
                                } else if (var249 >= '0' && var249 <= '9') {
                                    var245 += (long) (var249 + 27 - 48);
                                }
                                if (var245 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var245 % 37L == 0L && var245 != 0L) {
                                var245 /= 37L;
                            }
                            String var252 = Statics.method187(var245);
                            if (var252 == null) {
                                var252 = "";
                            }
                            var242[var243] = var252;
                            continue;
                        }
                        if (var484 == 3612) {
                            if (client.field512 == null) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = Statics.field2229;
                            }
                            continue;
                        }
                        if (var484 == 3613) {
                            var5--;
                            int var254 = field803[var5];
                            if (client.field512 != null && var254 < Statics.field2229) {
                                field804[var6++] = Statics.field174[var254].field621;
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var484 == 3614) {
                            var5--;
                            int var255 = field803[var5];
                            if (client.field512 != null && var255 < Statics.field2229) {
                                field803[var5++] = Statics.field174[var255].field623;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var484 == 3615) {
                            var5--;
                            int var256 = field803[var5];
                            if (client.field512 != null && var256 < Statics.field2229) {
                                field803[var5++] = Statics.field174[var256].field624;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var484 == 3616) {
                            field803[var5++] = Statics.field1658;
                            continue;
                        }
                        if (var484 == 3617) {
                            var6--;
                            String var257 = field804[var6];
                            if (Statics.field174 != null) {
                                client.field329.method2565(209);
                                client.field329.method2305(class119.method537(var257));
                                client.field329.method2311(var257);
                            }
                            continue;
                        }
                        if (var484 == 3618) {
                            field803[var5++] = Statics.field224;
                            continue;
                        }
                        if (var484 == 3619) {
                            var6--;
                            String var258 = field804[var6];
                            client.method150(var258);
                            continue;
                        }
                        if (var484 == 3620) {
                            client.field329.method2565(174);
                            client.field329.method2305(0);
                            continue;
                        }
                        if (var484 == 3621) {
                            if (client.field553 == 0) {
                                field803[var5++] = -1;
                            } else {
                                field803[var5++] = client.field317;
                            }
                            continue;
                        }
                        if (var484 == 3622) {
                            var5--;
                            int var259 = field803[var5];
                            if (client.field553 != 0 && var259 < client.field317) {
                                field804[var6++] = client.field557[var259].field135;
                                field804[var6++] = client.field557[var259].field128;
                                continue;
                            }
                            field804[var6++] = "";
                            field804[var6++] = "";
                            continue;
                        }
                        if (var484 == 3623) {
                            String var260;
                            label2851: {
                                var6--;
                                var260 = field804[var6];
                                if (!var260.startsWith(Statics.method2243(0))) {
                                    String var262 = "<img=1>";
                                    if (!var260.startsWith(var262)) {
                                        break label2851;
                                    }
                                }
                                var260 = var260.substring(7);
                            }
                            field803[var5++] = client.method741(var260) ? 1 : 0;
                            continue;
                        }
                        if (var484 == 3624) {
                            var5--;
                            int var263 = field803[var5];
                            if (Statics.field174 != null && var263 < Statics.field2229 && Statics.field174[var263].field621.equalsIgnoreCase(Statics.field2683.field56)) {
                                field803[var5++] = 1;
                                continue;
                            }
                            field803[var5++] = 0;
                            continue;
                        }
                        if (var484 == 3625) {
                            if (client.field513 == null) {
                                field804[var6++] = "";
                                continue;
                            }
                            String[] var264 = field804;
                            int var265 = var6++;
                            String var266 = client.field513;
                            long var267 = 0L;
                            int var269 = var266.length();
                            for (int var270 = 0; var270 < var269; var270++) {
                                var267 *= 37L;
                                char var271 = var266.charAt(var270);
                                if (var271 >= 'A' && var271 <= 'Z') {
                                    var267 += (long) (var271 + 1 - 65);
                                } else if (var271 >= 'a' && var271 <= 'z') {
                                    var267 += (long) (var271 + 1 - 97);
                                } else if (var271 >= '0' && var271 <= '9') {
                                    var267 += (long) (var271 + 27 - 48);
                                }
                                if (var267 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var267 % 37L == 0L && var267 != 0L) {
                                var267 /= 37L;
                            }
                            String var274 = Statics.method187(var267);
                            if (var274 == null) {
                                var274 = "";
                            }
                            var264[var265] = var274;
                            continue;
                        }
                    } else if (var484 < 4000) {
                        if (var484 == 3903) {
                            var5--;
                            int var276 = field803[var5];
                            field803[var5++] = client.field349[var276].method3702();
                            continue;
                        }
                        if (var484 == 3904) {
                            var5--;
                            int var277 = field803[var5];
                            field803[var5++] = client.field349[var277].field3147;
                            continue;
                        }
                        if (var484 == 3905) {
                            var5--;
                            int var278 = field803[var5];
                            field803[var5++] = client.field349[var278].field3148;
                            continue;
                        }
                        if (var484 == 3906) {
                            var5--;
                            int var279 = field803[var5];
                            field803[var5++] = client.field349[var279].field3146;
                            continue;
                        }
                        if (var484 == 3907) {
                            var5--;
                            int var280 = field803[var5];
                            field803[var5++] = client.field349[var280].field3150;
                            continue;
                        }
                        if (var484 == 3908) {
                            var5--;
                            int var281 = field803[var5];
                            field803[var5++] = client.field349[var281].field3149;
                            continue;
                        }
                        if (var484 == 3910) {
                            var5--;
                            int var282 = field803[var5];
                            int var283 = client.field349[var282].method3701();
                            field803[var5++] = var283 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var484 == 3911) {
                            var5--;
                            int var284 = field803[var5];
                            int var285 = client.field349[var284].method3701();
                            field803[var5++] = var285 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var484 == 3912) {
                            var5--;
                            int var286 = field803[var5];
                            int var287 = client.field349[var286].method3701();
                            field803[var5++] = var287 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var484 == 3913) {
                            var5--;
                            int var288 = field803[var5];
                            int var289 = client.field349[var288].method3701();
                            field803[var5++] = var289 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var484 == 3914) {
                            var5--;
                            boolean var290 = field803[var5] == 1;
                            if (Statics.field162 != null) {
                                Statics.field162.method3719(class221.field3153, var290);
                            }
                            continue;
                        }
                        if (var484 == 3915) {
                            var5--;
                            boolean var291 = field803[var5] == 1;
                            if (Statics.field162 != null) {
                                Statics.field162.method3719(class221.field3154, var291);
                            }
                            continue;
                        }
                        if (var484 == 3916) {
                            var5 -= 2;
                            boolean var292 = field803[var5] == 1;
                            boolean var293 = field803[var5 + 1] == 1;
                            if (Statics.field162 != null) {
                                Statics.field162.method3719(new class22(var293), var292);
                            }
                            continue;
                        }
                        if (var484 == 3917) {
                            var5--;
                            boolean var294 = field803[var5] == 1;
                            if (Statics.field162 != null) {
                                Statics.field162.method3719(class221.field3155, var294);
                            }
                            continue;
                        }
                        if (var484 == 3918) {
                            var5--;
                            boolean var295 = field803[var5] == 1;
                            if (Statics.field162 != null) {
                                Statics.field162.method3719(class221.field3156, var295);
                            }
                            continue;
                        }
                        if (var484 == 3919) {
                            field803[var5++] = Statics.field162 == null ? 0 : Statics.field162.field3152.size();
                            continue;
                        }
                        if (var484 == 3920) {
                            var5--;
                            int var296 = field803[var5];
                            class214 var297 = (class214) Statics.field162.field3152.get(var296);
                            field803[var5++] = var297.field3134;
                            continue;
                        }
                        if (var484 == 3921) {
                            var5--;
                            int var298 = field803[var5];
                            class214 var299 = (class214) Statics.field162.field3152.get(var298);
                            field804[var6++] = var299.method3659();
                            continue;
                        }
                        if (var484 == 3922) {
                            var5--;
                            int var300 = field803[var5];
                            class214 var301 = (class214) Statics.field162.field3152.get(var300);
                            field804[var6++] = var301.method3657();
                            continue;
                        }
                        if (var484 == 3923) {
                            var5--;
                            int var302 = field803[var5];
                            class214 var303 = (class214) Statics.field162.field3152.get(var302);
                            long var304 = class115.method2007() - Statics.field2700 - var303.field3131;
                            int var306 = (int) (var304 / 3600000L);
                            int var307 = (int) ((var304 - (long) (var306 * 3600000)) / 60000L);
                            int var308 = (int) ((var304 - (long) (var306 * 3600000) - (long) (var307 * 60000)) / 1000L);
                            String var309 = var306 + ":" + var307 / 10 + var307 % 10 + ":" + var308 / 10 + var308 % 10;
                            field804[var6++] = var309;
                            continue;
                        }
                        if (var484 == 3924) {
                            var5--;
                            int var310 = field803[var5];
                            class214 var311 = (class214) Statics.field162.field3152.get(var310);
                            field803[var5++] = var311.field3132.field3146;
                            continue;
                        }
                        if (var484 == 3925) {
                            var5--;
                            int var312 = field803[var5];
                            class214 var313 = (class214) Statics.field162.field3152.get(var312);
                            field803[var5++] = var313.field3132.field3148;
                            continue;
                        }
                        if (var484 == 3926) {
                            var5--;
                            int var314 = field803[var5];
                            class214 var315 = (class214) Statics.field162.field3152.get(var314);
                            field803[var5++] = var315.field3132.field3147;
                            continue;
                        }
                    } else if (var484 < 4100) {
                        if (var484 == 4000) {
                            var5 -= 2;
                            int var316 = field803[var5];
                            int var317 = field803[var5 + 1];
                            field803[var5++] = var316 + var317;
                            continue;
                        }
                        if (var484 == 4001) {
                            var5 -= 2;
                            int var318 = field803[var5];
                            int var319 = field803[var5 + 1];
                            field803[var5++] = var318 - var319;
                            continue;
                        }
                        if (var484 == 4002) {
                            var5 -= 2;
                            int var320 = field803[var5];
                            int var321 = field803[var5 + 1];
                            field803[var5++] = var320 * var321;
                            continue;
                        }
                        if (var484 == 4003) {
                            var5 -= 2;
                            int var322 = field803[var5];
                            int var323 = field803[var5 + 1];
                            field803[var5++] = var322 / var323;
                            continue;
                        }
                        if (var484 == 4004) {
                            var5--;
                            int var324 = field803[var5];
                            field803[var5++] = (int) (Math.random() * (double) var324);
                            continue;
                        }
                        if (var484 == 4005) {
                            var5--;
                            int var325 = field803[var5];
                            field803[var5++] = (int) (Math.random() * (double) (var325 + 1));
                            continue;
                        }
                        if (var484 == 4006) {
                            var5 -= 5;
                            int var326 = field803[var5];
                            int var327 = field803[var5 + 1];
                            int var328 = field803[var5 + 2];
                            int var329 = field803[var5 + 3];
                            int var330 = field803[var5 + 4];
                            field803[var5++] = (var327 - var326) * (var330 - var328) / (var329 - var328) + var326;
                            continue;
                        }
                        if (var484 == 4007) {
                            var5 -= 2;
                            int var331 = field803[var5];
                            int var332 = field803[var5 + 1];
                            field803[var5++] = var331 * var332 / 100 + var331;
                            continue;
                        }
                        if (var484 == 4008) {
                            var5 -= 2;
                            int var333 = field803[var5];
                            int var334 = field803[var5 + 1];
                            field803[var5++] = var333 | 0x1 << var334;
                            continue;
                        }
                        if (var484 == 4009) {
                            var5 -= 2;
                            int var335 = field803[var5];
                            int var336 = field803[var5 + 1];
                            field803[var5++] = var335 & -1 - (0x1 << var336);
                            continue;
                        }
                        if (var484 == 4010) {
                            var5 -= 2;
                            int var337 = field803[var5];
                            int var338 = field803[var5 + 1];
                            field803[var5++] = (var337 & 0x1 << var338) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var484 == 4011) {
                            var5 -= 2;
                            int var339 = field803[var5];
                            int var340 = field803[var5 + 1];
                            field803[var5++] = var339 % var340;
                            continue;
                        }
                        if (var484 == 4012) {
                            var5 -= 2;
                            int var341 = field803[var5];
                            int var342 = field803[var5 + 1];
                            if (var341 == 0) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = (int) Math.pow((double) var341, (double) var342);
                            }
                            continue;
                        }
                        if (var484 == 4013) {
                            var5 -= 2;
                            int var343 = field803[var5];
                            int var344 = field803[var5 + 1];
                            if (var343 == 0) {
                                field803[var5++] = 0;
                            } else if (var344 == 0) {
                                field803[var5++] = Integer.MAX_VALUE;
                            } else {
                                field803[var5++] = (int) Math.pow((double) var343, 1.0D / (double) var344);
                            }
                            continue;
                        }
                        if (var484 == 4014) {
                            var5 -= 2;
                            int var345 = field803[var5];
                            int var346 = field803[var5 + 1];
                            field803[var5++] = var345 & var346;
                            continue;
                        }
                        if (var484 == 4015) {
                            var5 -= 2;
                            int var347 = field803[var5];
                            int var348 = field803[var5 + 1];
                            field803[var5++] = var347 | var348;
                            continue;
                        }
                    } else if (var484 < 4200) {
                        if (var484 == 4100) {
                            var6--;
                            String var349 = field804[var6];
                            var5--;
                            int var350 = field803[var5];
                            field804[var6++] = var349 + var350;
                            continue;
                        }
                        if (var484 == 4101) {
                            var6 -= 2;
                            String var351 = field804[var6];
                            String var352 = field804[var6 + 1];
                            field804[var6++] = var351 + var352;
                            continue;
                        }
                        if (var484 == 4102) {
                            var6--;
                            String var353 = field804[var6];
                            var5--;
                            int var354 = field803[var5];
                            String[] var355 = field804;
                            int var356 = var6++;
                            String var358;
                            if (var354 < 0) {
                                var358 = Integer.toString(var354);
                            } else {
                                var358 = Statics.method667(var354, 10, true);
                            }
                            var355[var356] = var353 + var358;
                            continue;
                        }
                        if (var484 == 4103) {
                            var6--;
                            String var359 = field804[var6];
                            field804[var6++] = var359.toLowerCase();
                            continue;
                        }
                        if (var484 == 4104) {
                            var5--;
                            int var360 = field803[var5];
                            long var361 = ((long) var360 + 11745L) * 86400000L;
                            field809.setTime(new Date(var361));
                            int var363 = field809.get(5);
                            int var364 = field809.get(2);
                            int var365 = field809.get(1);
                            field804[var6++] = var363 + "-" + field815[var364] + "-" + var365;
                            continue;
                        }
                        if (var484 == 4105) {
                            var6 -= 2;
                            String var366 = field804[var6];
                            String var367 = field804[var6 + 1];
                            if (Statics.field2683.field32 != null && Statics.field2683.field32.field2904) {
                                field804[var6++] = var367;
                                continue;
                            }
                            field804[var6++] = var366;
                            continue;
                        }
                        if (var484 == 4106) {
                            var5--;
                            int var368 = field803[var5];
                            field804[var6++] = Integer.toString(var368);
                            continue;
                        }
                        if (var484 == 4107) {
                            var6 -= 2;
                            field803[var5++] = class163.method2931(class166.method618(field804[var6], field804[var6 + 1], client.field315));
                            continue;
                        }
                        if (var484 == 4108) {
                            var6--;
                            String var369 = field804[var6];
                            var5 -= 2;
                            int var370 = field803[var5];
                            int var371 = field803[var5 + 1];
                            byte[] var372 = Statics.field771.method3051(var371, 0);
                            class224 var373 = new class224(var372);
                            field803[var5++] = var373.method3732(var369, var370);
                            continue;
                        }
                        if (var484 == 4109) {
                            var6--;
                            String var374 = field804[var6];
                            var5 -= 2;
                            int var375 = field803[var5];
                            int var376 = field803[var5 + 1];
                            byte[] var377 = Statics.field771.method3051(var376, 0);
                            class224 var378 = new class224(var377);
                            field803[var5++] = var378.method3731(var374, var375);
                            continue;
                        }
                        if (var484 == 4110) {
                            var6 -= 2;
                            String var379 = field804[var6];
                            String var380 = field804[var6 + 1];
                            var5--;
                            if (field803[var5] == 1) {
                                field804[var6++] = var379;
                            } else {
                                field804[var6++] = var380;
                            }
                            continue;
                        }
                        if (var484 == 4111) {
                            var6--;
                            String var381 = field804[var6];
                            field804[var6++] = class223.method3730(var381);
                            continue;
                        }
                        if (var484 == 4112) {
                            var6--;
                            String var382 = field804[var6];
                            var5--;
                            int var383 = field803[var5];
                            field804[var6++] = var382 + (char) var383;
                            continue;
                        }
                        if (var484 == 4113) {
                            var5--;
                            int var384 = field803[var5];
                            int[] var385 = field803;
                            int var386 = var5++;
                            char var387 = (char) var384;
                            boolean var388;
                            if (var387 >= ' ' && var387 <= '~') {
                                var388 = true;
                            } else if (var387 >= 160 && var387 <= 255) {
                                var388 = true;
                            } else if (var387 == 8364 || var387 == 338 || var387 == 8212 || var387 == 339 || var387 == 376) {
                                var388 = true;
                            } else {
                                var388 = false;
                            }
                            var385[var386] = var388 ? 1 : 0;
                            continue;
                        }
                        if (var484 == 4114) {
                            var5--;
                            int var389 = field803[var5];
                            int[] var390 = field803;
                            int var391 = var5++;
                            char var392 = (char) var389;
                            boolean var393 = var392 >= '0' && var392 <= '9' || var392 >= 'A' && var392 <= 'Z' || var392 >= 'a' && var392 <= 'z';
                            var390[var391] = var393 ? 1 : 0;
                            continue;
                        }
                        if (var484 == 4115) {
                            var5--;
                            int var394 = field803[var5];
                            field803[var5++] = class163.method3082((char) var394) ? 1 : 0;
                            continue;
                        }
                        if (var484 == 4116) {
                            var5--;
                            int var395 = field803[var5];
                            field803[var5++] = class163.method732((char) var395) ? 1 : 0;
                            continue;
                        }
                        if (var484 == 4117) {
                            var6--;
                            String var396 = field804[var6];
                            if (var396 == null) {
                                field803[var5++] = 0;
                            } else {
                                field803[var5++] = var396.length();
                            }
                            continue;
                        }
                        if (var484 == 4118) {
                            var6--;
                            String var397 = field804[var6];
                            var5 -= 2;
                            int var398 = field803[var5];
                            int var399 = field803[var5 + 1];
                            field804[var6++] = var397.substring(var398, var399);
                            continue;
                        }
                        if (var484 == 4119) {
                            var6--;
                            String var400 = field804[var6];
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
                            field804[var6++] = var401.toString();
                            continue;
                        }
                        if (var484 == 4120) {
                            var6--;
                            String var405 = field804[var6];
                            var5--;
                            int var406 = field803[var5];
                            field803[var5++] = var405.indexOf(var406);
                            continue;
                        }
                        if (var484 == 4121) {
                            var6 -= 2;
                            String var407 = field804[var6];
                            String var408 = field804[var6 + 1];
                            var5--;
                            int var409 = field803[var5];
                            field803[var5++] = var407.indexOf(var408, var409);
                            continue;
                        }
                    } else if (var484 < 4300) {
                        if (var484 == 4200) {
                            var5--;
                            int var410 = field803[var5];
                            field804[var6++] = class52.method2933(var410).field1124;
                            continue;
                        }
                        if (var484 == 4201) {
                            var5 -= 2;
                            int var411 = field803[var5];
                            int var412 = field803[var5 + 1];
                            class52 var413 = class52.method2933(var411);
                            if (var412 >= 1 && var412 <= 5 && var413.field1138[var412 - 1] != null) {
                                field804[var6++] = var413.field1138[var412 - 1];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var484 == 4202) {
                            var5 -= 2;
                            int var414 = field803[var5];
                            int var415 = field803[var5 + 1];
                            class52 var416 = class52.method2933(var414);
                            if (var415 >= 1 && var415 <= 5 && var416.field1139[var415 - 1] != null) {
                                field804[var6++] = var416.field1139[var415 - 1];
                                continue;
                            }
                            field804[var6++] = "";
                            continue;
                        }
                        if (var484 == 4203) {
                            var5--;
                            int var417 = field803[var5];
                            field803[var5++] = class52.method2933(var417).field1123;
                            continue;
                        }
                        if (var484 == 4204) {
                            var5--;
                            int var418 = field803[var5];
                            field803[var5++] = class52.method2933(var418).field1135 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var484 == 4205) {
                            var5--;
                            int var419 = field803[var5];
                            class52 var420 = class52.method2933(var419);
                            if (var420.field1155 == -1 && var420.field1137 >= 0) {
                                field803[var5++] = var420.field1137;
                                continue;
                            }
                            field803[var5++] = var419;
                            continue;
                        }
                        if (var484 == 4206) {
                            var5--;
                            int var421 = field803[var5];
                            class52 var422 = class52.method2933(var421);
                            if (var422.field1155 >= 0 && var422.field1137 >= 0) {
                                field803[var5++] = var422.field1137;
                                continue;
                            }
                            field803[var5++] = var421;
                            continue;
                        }
                        if (var484 == 4207) {
                            var5--;
                            int var423 = field803[var5];
                            field803[var5++] = class52.method2933(var423).field1128 ? 1 : 0;
                            continue;
                        }
                        if (var484 == 4210) {
                            var6--;
                            String var424 = field804[var6];
                            var5--;
                            int var425 = field803[var5];
                            boolean var427 = var425 == 1;
                            String var428 = var424.toLowerCase();
                            short[] var429 = new short[16];
                            int var430 = 0;
                            int var431 = 0;
                            while (true) {
                                if (var431 >= Statics.field1117) {
                                    Statics.field323 = var429;
                                    Statics.field44 = 0;
                                    Statics.field2279 = var430;
                                    String[] var435 = new String[Statics.field2279];
                                    for (int var436 = 0; var436 < Statics.field2279; var436++) {
                                        var435[var436] = class52.method2933(var429[var436]).field1124;
                                    }
                                    class124.method629(var435, Statics.field323);
                                    break;
                                }
                                class52 var432 = class52.method2933(var431);
                                if ((!var427 || var432.field1112) && var432.field1155 == -1 && var432.field1124.toLowerCase().indexOf(var428) != -1) {
                                    if (var430 >= 250) {
                                        Statics.field2279 = -1;
                                        Statics.field323 = null;
                                        break;
                                    }
                                    if (var430 >= var429.length) {
                                        short[] var433 = new short[var429.length * 2];
                                        for (int var434 = 0; var434 < var430; var434++) {
                                            var433[var434] = var429[var434];
                                        }
                                        var429 = var433;
                                    }
                                    var429[var430++] = (short) var431;
                                }
                                var431++;
                            }
                            field803[var5++] = Statics.field2279;
                            continue;
                        }
                        if (var484 == 4211) {
                            if (Statics.field323 != null && Statics.field44 < Statics.field2279) {
                                field803[var5++] = Statics.field323[++Statics.field44 - 1] & 0xFFFF;
                                continue;
                            }
                            field803[var5++] = -1;
                            continue;
                        }
                        if (var484 == 4212) {
                            Statics.field44 = 0;
                            continue;
                        }
                    } else if (var484 < 5100) {
                        if (var484 == 5000) {
                            field803[var5++] = client.field503;
                            continue;
                        }
                        if (var484 == 5001) {
                            var5 -= 3;
                            client.field503 = field803[var5];
                            Statics.field251 = class130.method755(field803[var5 + 1]);
                            if (Statics.field251 == null) {
                                Statics.field251 = class130.field2053;
                            }
                            client.field504 = field803[var5 + 2];
                            client.field329.method2565(249);
                            client.field329.method2305(client.field503);
                            client.field329.method2305(Statics.field251.field2056);
                            client.field329.method2305(client.field504);
                            continue;
                        }
                        if (var484 == 5002) {
                            var6--;
                            String var437 = field804[var6];
                            var5 -= 2;
                            int var438 = field803[var5];
                            int var439 = field803[var5 + 1];
                            client.field329.method2565(227);
                            client.field329.method2305(class119.method537(var437) + 2);
                            client.field329.method2311(var437);
                            client.field329.method2305(var438 - 1);
                            client.field329.method2305(var439);
                            continue;
                        }
                        if (var484 == 5003) {
                            var5 -= 2;
                            int var440 = field803[var5];
                            int var441 = field803[var5 + 1];
                            class36 var442 = class12.method570(var440, var441);
                            if (var442 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                                field804[var6++] = "";
                                field804[var6++] = "";
                            } else {
                                field803[var5++] = var442.field796;
                                field803[var5++] = var442.field789;
                                field804[var6++] = var442.field792 == null ? "" : var442.field792;
                                field804[var6++] = var442.field788 == null ? "" : var442.field788;
                                field804[var6++] = var442.field793 == null ? "" : var442.field793;
                            }
                            continue;
                        }
                        if (var484 == 5004) {
                            var5--;
                            int var443 = field803[var5];
                            class36 var444 = class12.method551(var443);
                            if (var444 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                                field804[var6++] = "";
                                field804[var6++] = "";
                            } else {
                                field803[var5++] = var444.field790;
                                field803[var5++] = var444.field789;
                                field804[var6++] = var444.field792 == null ? "" : var444.field792;
                                field804[var6++] = var444.field788 == null ? "" : var444.field788;
                                field804[var6++] = var444.field793 == null ? "" : var444.field793;
                            }
                            continue;
                        }
                        if (var484 == 5005) {
                            if (Statics.field251 == null) {
                                field803[var5++] = -1;
                            } else {
                                field803[var5++] = Statics.field251.field2056;
                            }
                            continue;
                        }
                        if (var484 == 5008) {
                            var6--;
                            String var445 = field804[var6];
                            var5--;
                            int var446 = field803[var5];
                            String var447 = var445.toLowerCase();
                            byte var448 = 0;
                            if (var447.startsWith(class157.field2315)) {
                                var448 = 0;
                                var445 = var445.substring(class157.field2315.length());
                            } else if (var447.startsWith(class157.field2474)) {
                                var448 = 1;
                                var445 = var445.substring(class157.field2474.length());
                            } else if (var447.startsWith(class157.field2476)) {
                                var448 = 2;
                                var445 = var445.substring(class157.field2476.length());
                            } else if (var447.startsWith(class157.field2478)) {
                                var448 = 3;
                                var445 = var445.substring(class157.field2478.length());
                            } else if (var447.startsWith(class157.field2480)) {
                                var448 = 4;
                                var445 = var445.substring(class157.field2480.length());
                            } else if (var447.startsWith(class157.field2482)) {
                                var448 = 5;
                                var445 = var445.substring(class157.field2482.length());
                            } else if (var447.startsWith(class157.field2484)) {
                                var448 = 6;
                                var445 = var445.substring(class157.field2484.length());
                            } else if (var447.startsWith(class157.field2453)) {
                                var448 = 7;
                                var445 = var445.substring(class157.field2453.length());
                            } else if (var447.startsWith(class157.field2488)) {
                                var448 = 8;
                                var445 = var445.substring(class157.field2488.length());
                            } else if (var447.startsWith(class157.field2490)) {
                                var448 = 9;
                                var445 = var445.substring(class157.field2490.length());
                            } else if (var447.startsWith(class157.field2366)) {
                                var448 = 10;
                                var445 = var445.substring(class157.field2366.length());
                            } else if (var447.startsWith(class157.field2494)) {
                                var448 = 11;
                                var445 = var445.substring(class157.field2494.length());
                            } else if (client.field315 != 0) {
                                if (var447.startsWith(class157.field2473)) {
                                    var448 = 0;
                                    var445 = var445.substring(class157.field2473.length());
                                } else if (var447.startsWith(class157.field2475)) {
                                    var448 = 1;
                                    var445 = var445.substring(class157.field2475.length());
                                } else if (var447.startsWith(class157.field2328)) {
                                    var448 = 2;
                                    var445 = var445.substring(class157.field2328.length());
                                } else if (var447.startsWith(class157.field2429)) {
                                    var448 = 3;
                                    var445 = var445.substring(class157.field2429.length());
                                } else if (var447.startsWith(class157.field2481)) {
                                    var448 = 4;
                                    var445 = var445.substring(class157.field2481.length());
                                } else if (var447.startsWith(class157.field2483)) {
                                    var448 = 5;
                                    var445 = var445.substring(class157.field2483.length());
                                } else if (var447.startsWith(class157.field2485)) {
                                    var448 = 6;
                                    var445 = var445.substring(class157.field2485.length());
                                } else if (var447.startsWith(class157.field2487)) {
                                    var448 = 7;
                                    var445 = var445.substring(class157.field2487.length());
                                } else if (var447.startsWith(class157.field2489)) {
                                    var448 = 8;
                                    var445 = var445.substring(class157.field2489.length());
                                } else if (var447.startsWith(class157.field2491)) {
                                    var448 = 9;
                                    var445 = var445.substring(class157.field2491.length());
                                } else if (var447.startsWith(class157.field2343)) {
                                    var448 = 10;
                                    var445 = var445.substring(class157.field2343.length());
                                } else if (var447.startsWith(class157.field2495)) {
                                    var448 = 11;
                                    var445 = var445.substring(class157.field2495.length());
                                }
                            }
                            String var449 = var445.toLowerCase();
                            byte var450 = 0;
                            if (var449.startsWith(class157.field2496)) {
                                var450 = 1;
                                var445 = var445.substring(class157.field2496.length());
                            } else if (var449.startsWith(class157.field2498)) {
                                var450 = 2;
                                var445 = var445.substring(class157.field2498.length());
                            } else if (var449.startsWith(class157.field2500)) {
                                var450 = 3;
                                var445 = var445.substring(class157.field2500.length());
                            } else if (var449.startsWith(class157.field2502)) {
                                var450 = 4;
                                var445 = var445.substring(class157.field2502.length());
                            } else if (var449.startsWith(class157.field2445)) {
                                var450 = 5;
                                var445 = var445.substring(class157.field2445.length());
                            } else if (client.field315 != 0) {
                                if (var449.startsWith(class157.field2497)) {
                                    var450 = 1;
                                    var445 = var445.substring(class157.field2497.length());
                                } else if (var449.startsWith(class157.field2499)) {
                                    var450 = 2;
                                    var445 = var445.substring(class157.field2499.length());
                                } else if (var449.startsWith(class157.field2501)) {
                                    var450 = 3;
                                    var445 = var445.substring(class157.field2501.length());
                                } else if (var449.startsWith(class157.field2503)) {
                                    var450 = 4;
                                    var445 = var445.substring(class157.field2503.length());
                                } else if (var449.startsWith(class157.field2528)) {
                                    var450 = 5;
                                    var445 = var445.substring(class157.field2528.length());
                                }
                            }
                            client.field329.method2565(171);
                            client.field329.method2305(0);
                            int var451 = client.field329.field1988;
                            client.field329.method2305(var446);
                            client.field329.method2305(var448);
                            client.field329.method2305(var450);
                            class222.method3469(client.field329, var445);
                            client.field329.method2317(client.field329.field1988 - var451);
                            continue;
                        }
                        if (var484 == 5009) {
                            var6 -= 2;
                            String var452 = field804[var6];
                            String var453 = field804[var6 + 1];
                            client.field329.method2565(75);
                            client.field329.method2501(0);
                            int var454 = client.field329.field1988;
                            client.field329.method2311(var452);
                            class222.method3469(client.field329, var453);
                            client.field329.method2316(client.field329.field1988 - var454);
                            continue;
                        }
                        if (var484 == 5015) {
                            String var455;
                            if (Statics.field2683 == null || Statics.field2683.field56 == null) {
                                var455 = "";
                            } else {
                                var455 = Statics.field2683.field56;
                            }
                            field804[var6++] = var455;
                            continue;
                        }
                        if (var484 == 5016) {
                            field803[var5++] = client.field504;
                            continue;
                        }
                        if (var484 == 5017) {
                            var5--;
                            int var456 = field803[var5];
                            field803[var5++] = class12.method944(var456);
                            continue;
                        }
                        if (var484 == 5018) {
                            var5--;
                            int var457 = field803[var5];
                            field803[var5++] = class12.method555(var457);
                            continue;
                        }
                        if (var484 == 5019) {
                            var5--;
                            int var458 = field803[var5];
                            field803[var5++] = class12.method2104(var458);
                            continue;
                        }
                        if (var484 == 5020) {
                            var6--;
                            String var459 = field804[var6];
                            if (var459.equalsIgnoreCase("toggleroof")) {
                                Statics.field1028.field141 = !Statics.field1028.field141;
                                class9.method2738();
                                if (Statics.field1028.field141) {
                                    class12.method2263(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method2263(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var459.equalsIgnoreCase("displayfps")) {
                                client.field301 = !client.field301;
                            }
                            if (client.field452 >= 2) {
                                if (var459.equalsIgnoreCase("fpson")) {
                                    client.field301 = true;
                                }
                                if (var459.equalsIgnoreCase("fpsoff")) {
                                    client.field301 = false;
                                }
                                if (var459.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var459.equalsIgnoreCase("clientdrop")) {
                                    client.method469();
                                }
                                if (var459.equalsIgnoreCase("errortest") && client.field324 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field329.method2565(78);
                            client.field329.method2305(var459.length() + 1);
                            client.field329.method2311(var459);
                            continue;
                        }
                        if (var484 == 5021) {
                            var6--;
                            client.field505 = field804[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var484 == 5022) {
                            field804[var6++] = client.field505;
                            continue;
                        }
                    }
                }
                if (var484 < 5400) {
                    if (var484 == 5306) {
                        int[] var460 = field803;
                        int var461 = var5++;
                        int var462 = client.field403 ? 2 : 1;
                        var460[var461] = var462;
                        continue;
                    }
                    if (var484 == 5307) {
                        var5--;
                        int var463 = field803[var5];
                        if (var463 != 1 && var463 != 2) {
                            continue;
                        }
                        client.field498 = 0L;
                        if (var463 >= 2) {
                            client.field403 = true;
                        } else {
                            client.field403 = false;
                        }
                        client.method1045();
                        if (client.field536 >= 25) {
                            Statics.method932();
                        }
                        class144.field2202 = true;
                        continue;
                    }
                    if (var484 == 5308) {
                        field803[var5++] = Statics.field1028.field147;
                        continue;
                    }
                    if (var484 == 5309) {
                        var5--;
                        int var464 = field803[var5];
                        if (var464 == 1 || var464 == 2) {
                            Statics.field1028.field147 = var464;
                            class9.method2738();
                        }
                        continue;
                    }
                }
                if (var484 < 5600) {
                    if (var484 == 5504) {
                        var5 -= 2;
                        int var465 = field803[var5];
                        int var466 = field803[var5 + 1];
                        if (!client.field533) {
                            client.field370 = var465;
                            client.field371 = var466;
                        }
                        continue;
                    }
                    if (var484 == 5505) {
                        field803[var5++] = client.field370;
                        continue;
                    }
                    if (var484 == 5506) {
                        field803[var5++] = client.field371;
                        continue;
                    }
                    if (var484 == 5530) {
                        var5--;
                        int var467 = field803[var5];
                        if (var467 < 0) {
                            var467 = 0;
                        }
                        client.field376 = var467;
                        continue;
                    }
                    if (var484 == 5531) {
                        field803[var5++] = client.field376;
                        continue;
                    }
                }
                if (var484 >= 5700 || var484 != 5630) {
                    if (var484 < 6300) {
                        if (var484 == 6200) {
                            var5 -= 2;
                            client.field487 = (short) field803[var5];
                            if (client.field487 <= 0) {
                                client.field487 = 256;
                            }
                            client.field459 = (short) field803[var5 + 1];
                            if (client.field459 <= 0) {
                                client.field459 = 205;
                            }
                            continue;
                        }
                        if (var484 == 6201) {
                            var5 -= 2;
                            client.field430 = (short) field803[var5];
                            if (client.field430 <= 0) {
                                client.field430 = 256;
                            }
                            client.field542 = (short) field803[var5 + 1];
                            if (client.field542 <= 0) {
                                client.field542 = 320;
                            }
                            continue;
                        }
                        if (var484 == 6202) {
                            var5 -= 4;
                            client.field543 = (short) field803[var5];
                            if (client.field543 <= 0) {
                                client.field543 = 1;
                            }
                            client.field544 = (short) field803[var5 + 1];
                            if (client.field544 <= 0) {
                                client.field544 = 32767;
                            } else if (client.field544 < client.field543) {
                                client.field544 = client.field543;
                            }
                            client.field545 = (short) field803[var5 + 2];
                            if (client.field545 <= 0) {
                                client.field545 = 1;
                            }
                            client.field546 = (short) field803[var5 + 3];
                            if (client.field546 <= 0) {
                                client.field546 = 32767;
                            } else if (client.field546 < client.field545) {
                                client.field546 = client.field545;
                            }
                            continue;
                        }
                        if (var484 == 6203) {
                            if (client.field457 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = -1;
                            } else {
                                client.method6(0, 0, client.field457.field2756, client.field457.field2757, false);
                                field803[var5++] = client.field549;
                                field803[var5++] = client.field550;
                            }
                            continue;
                        }
                        if (var484 == 6204) {
                            field803[var5++] = client.field430;
                            field803[var5++] = client.field542;
                            continue;
                        }
                        if (var484 == 6205) {
                            field803[var5++] = client.field487;
                            field803[var5++] = client.field459;
                            continue;
                        }
                    }
                    if (var484 < 6600) {
                        if (var484 == 6500) {
                            field803[var5++] = class26.method614() ? 1 : 0;
                            continue;
                        }
                        if (var484 == 6501) {
                            class26 var468 = class26.method3173();
                            if (var468 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                                field803[var5++] = 0;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                            } else {
                                field803[var5++] = var468.field641;
                                field803[var5++] = var468.field642;
                                field804[var6++] = var468.field645;
                                field803[var5++] = var468.field646;
                                field803[var5++] = var468.field653;
                                field804[var6++] = var468.field644;
                            }
                            continue;
                        }
                        if (var484 == 6502) {
                            class26 var469;
                            if (class26.field652 < class26.field637) {
                                var469 = Statics.field676[++class26.field652 - 1];
                            } else {
                                var469 = null;
                            }
                            if (var469 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                                field803[var5++] = 0;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                            } else {
                                field803[var5++] = var469.field641;
                                field803[var5++] = var469.field642;
                                field804[var6++] = var469.field645;
                                field803[var5++] = var469.field646;
                                field803[var5++] = var469.field653;
                                field804[var6++] = var469.field644;
                            }
                            continue;
                        }
                        if (var484 == 6506) {
                            var5--;
                            int var471 = field803[var5];
                            class26 var472 = null;
                            for (int var473 = 0; var473 < class26.field637; var473++) {
                                if (Statics.field676[var473].field641 == var471) {
                                    var472 = Statics.field676[var473];
                                    break;
                                }
                            }
                            if (var472 == null) {
                                field803[var5++] = -1;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                                field803[var5++] = 0;
                                field803[var5++] = 0;
                                field804[var6++] = "";
                            } else {
                                field803[var5++] = var472.field641;
                                field803[var5++] = var472.field642;
                                field804[var6++] = var472.field645;
                                field803[var5++] = var472.field646;
                                field803[var5++] = var472.field653;
                                field804[var6++] = var472.field644;
                            }
                            continue;
                        }
                        if (var484 == 6507) {
                            var5 -= 4;
                            int var474 = field803[var5];
                            boolean var475 = field803[var5 + 1] == 1;
                            int var476 = field803[var5 + 2];
                            boolean var477 = field803[var5 + 3] == 1;
                            if (Statics.field676 != null) {
                                class26.method2917(0, Statics.field676.length - 1, var474, var475, var476, var477);
                            }
                            continue;
                        }
                        if (var484 == 6511) {
                            var5--;
                            int var478 = field803[var5];
                            if (var478 >= 0 && var478 < class26.field637) {
                                class26 var479 = Statics.field676[var478];
                                field803[var5++] = var479.field641;
                                field803[var5++] = var479.field642;
                                field804[var6++] = var479.field645;
                                field803[var5++] = var479.field646;
                                field803[var5++] = var479.field653;
                                field804[var6++] = var479.field644;
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
                client.field339 = 250;
            }
        } catch (Exception var483) {
            StringBuilder var481 = new StringBuilder(30);
            var481.append("").append(var4.field3100).append(" ");
            for (int var482 = field805 - 1; var482 >= 0; var482--) {
                var481.append("").append(field807[var482].field201.field3100).append(" ");
            }
            var481.append("").append(var10);
            class148.method2106(var481.toString(), var483);
        }
    }

    @ObfuscatedName("c.i(II)V")
    public static void method77(int arg0) {
        if (arg0 == -1 || !class173.method2942(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2793[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2820 != null) {
                class1 var4 = new class1();
                var4.field8 = var3;
                var4.field6 = var3.field2820;
                method705(var4, 2000000);
            }
        }
    }
}
