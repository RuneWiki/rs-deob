package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("az")
public class class37 {

    @ObfuscatedName("az.l")
    public static int[] field802 = new int[5];

    @ObfuscatedName("az.d")
    public static int[][] field806 = new int[5][5000];

    @ObfuscatedName("az.n")
    public static int[] field804 = new int[1000];

    @ObfuscatedName("az.m")
    public static String[] field805 = new String[1000];

    @ObfuscatedName("az.g")
    public static int field818 = 0;

    @ObfuscatedName("az.s")
    public static class15[] field807 = new class15[50];

    @ObfuscatedName("az.o")
    public static Calendar field808 = Calendar.getInstance();

    @ObfuscatedName("az.q")
    public static final String[] field811 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("az.p")
    public static int field810 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.f(Lf;II)V")
    public static void method722(class1 arg0, int arg1) {
        Object[] var2 = arg0.field1;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method3192(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field593;
        int[] var9 = var4.field594;
        byte var10 = -1;
        field818 = 0;
        try {
            Statics.field800 = new int[var4.field592];
            int var11 = 0;
            Statics.field817 = new String[var4.field597];
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
                        var14 = arg0.field2 == null ? -1 : arg0.field2.field2870;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field3;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field2 == null ? -1 : arg0.field2.field2756;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field13 == null ? -1 : arg0.field13.field2870;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field13 == null ? -1 : arg0.field13.field2756;
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
                    Statics.field817[var12++] = var15;
                }
            }
            int var16 = 0;
            field810 = arg0.field11;
            label2850: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var455 = var8[var7];
                if (var455 < 100) {
                    if (var455 == 0) {
                        field804[var5++] = var9[var7];
                        continue;
                    }
                    if (var455 == 1) {
                        int var17 = var9[var7];
                        field804[var5++] = class177.field2906[var17];
                        continue;
                    }
                    if (var455 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class177.field2906[var18] = field804[var5];
                        client.method608(var18);
                        continue;
                    }
                    if (var455 == 3) {
                        field805[var6++] = var4.field602[var7];
                        continue;
                    }
                    if (var455 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var455 == 7) {
                        var5 -= 2;
                        if (field804[var5 + 1] != field804[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var455 == 8) {
                        var5 -= 2;
                        if (field804[var5 + 1] == field804[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var455 == 9) {
                        var5 -= 2;
                        if (field804[var5] < field804[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var455 == 10) {
                        var5 -= 2;
                        if (field804[var5] > field804[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var455 == 21) {
                        if (field818 == 0) {
                            return;
                        }
                        class15 var19 = field807[--field818];
                        var4 = var19.field214;
                        var8 = var4.field593;
                        var9 = var4.field594;
                        var7 = var19.field208;
                        Statics.field800 = var19.field209;
                        Statics.field817 = var19.field210;
                        continue;
                    }
                    if (var455 == 25) {
                        int var20 = var9[var7];
                        field804[var5++] = class177.method2677(var20);
                        continue;
                    }
                    if (var455 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class177.method685(var21, field804[var5]);
                        continue;
                    }
                    if (var455 == 31) {
                        var5 -= 2;
                        if (field804[var5] <= field804[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var455 == 32) {
                        var5 -= 2;
                        if (field804[var5] >= field804[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var455 == 33) {
                        field804[var5++] = Statics.field800[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var455 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field800[var10001] = field804[var5];
                        continue;
                    }
                    if (var455 == 35) {
                        field805[var6++] = Statics.field817[var9[var7]];
                        continue;
                    }
                    if (var455 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field817[var10001] = field805[var6];
                        continue;
                    }
                    if (var455 == 37) {
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
                    if (var455 == 38) {
                        var5--;
                        continue;
                    }
                    if (var455 == 39) {
                        var6--;
                        continue;
                    }
                    if (var455 == 40) {
                        int var34 = var9[var7];
                        class23 var35 = class23.method3192(var34);
                        int[] var36 = new int[var35.field592];
                        String[] var37 = new String[var35.field597];
                        for (int var38 = 0; var38 < var35.field598; var38++) {
                            var36[var38] = field804[var5 - var35.field598 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field599; var39++) {
                            var37[var39] = field805[var6 - var35.field599 + var39];
                        }
                        var5 -= var35.field598;
                        var6 -= var35.field599;
                        class15 var40 = new class15();
                        var40.field214 = var4;
                        var40.field208 = var7;
                        var40.field209 = Statics.field800;
                        var40.field210 = Statics.field817;
                        field807[++field818 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field593;
                        var9 = var35.field594;
                        var7 = -1;
                        Statics.field800 = var36;
                        Statics.field817 = var37;
                        continue;
                    }
                    if (var455 == 42) {
                        field804[var5++] = Statics.field66.method205(var9[var7]);
                        continue;
                    }
                    if (var455 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field66.method204(var10001, field804[var5]);
                        continue;
                    }
                    if (var455 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field804[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field802[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2850;
                                }
                                field806[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var455 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field804[var5];
                        if (var47 >= 0 && var47 < field802[var46]) {
                            field804[var5++] = field806[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var455 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field804[var5];
                        if (var49 >= 0 && var49 < field802[var48]) {
                            field806[var48][var49] = field804[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var455 == 47) {
                        String var50 = Statics.field66.method236(var9[var7]);
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field805[var6++] = var50;
                        continue;
                    }
                    if (var455 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field66.method232(var10001, field805[var6]);
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var455 < 1000) {
                    if (var455 == 100) {
                        var5 -= 3;
                        int var52 = field804[var5];
                        int var53 = field804[var5 + 1];
                        int var54 = field804[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class174 var55 = class174.method2958(var52);
                        if (var55.field2768 == null) {
                            var55.field2768 = new class174[var54 + 1];
                        }
                        if (var55.field2768.length <= var54) {
                            class174[] var56 = new class174[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2768.length; var57++) {
                                var56[var57] = var55.field2768[var57];
                            }
                            var55.field2768 = var56;
                        }
                        if (var54 > 0 && var55.field2768[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class174 var58 = new class174();
                        var58.field2799 = var53;
                        var58.field2774 = var58.field2870 = var55.field2870;
                        var58.field2756 = var54;
                        var58.field2861 = true;
                        var55.field2768[var54] = var58;
                        if (var51) {
                            Statics.field801 = var58;
                        } else {
                            Statics.field814 = var58;
                        }
                        client.method791(var55);
                        continue;
                    }
                    if (var455 == 101) {
                        class174 var59 = var51 ? Statics.field801 : Statics.field814;
                        class174 var60 = class174.method2958(var59.field2870);
                        var60.field2768[var59.field2756] = null;
                        client.method791(var60);
                        continue;
                    }
                    if (var455 == 102) {
                        var5--;
                        class174 var61 = class174.method2958(field804[var5]);
                        var61.field2768 = null;
                        client.method791(var61);
                        continue;
                    }
                    if (var455 == 200) {
                        var5 -= 2;
                        int var62 = field804[var5];
                        int var63 = field804[var5 + 1];
                        class174 var64 = class174.method3194(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field804[var5++] = 1;
                            if (var51) {
                                Statics.field801 = var64;
                            } else {
                                Statics.field814 = var64;
                            }
                            continue;
                        }
                        field804[var5++] = 0;
                        continue;
                    }
                    if (var455 == 201) {
                        var5--;
                        class174 var65 = class174.method2958(field804[var5]);
                        if (var65 == null) {
                            field804[var5++] = 0;
                        } else {
                            field804[var5++] = 1;
                            if (var51) {
                                Statics.field801 = var65;
                            } else {
                                Statics.field814 = var65;
                            }
                        }
                        continue;
                    }
                } else if (var455 >= 1000 && var455 < 1100 || var455 >= 2000 && var455 < 2100) {
                    int var66 = -1;
                    class174 var67;
                    if (var455 >= 2000) {
                        var455 -= 1000;
                        var5--;
                        var66 = field804[var5];
                        var67 = class174.method2958(var66);
                    } else {
                        var67 = var51 ? Statics.field801 : Statics.field814;
                    }
                    if (var455 == 1000) {
                        var5 -= 4;
                        var67.field2764 = field804[var5];
                        var67.field2754 = field804[var5 + 1];
                        var67.field2760 = field804[var5 + 2];
                        var67.field2859 = field804[var5 + 3];
                        client.method791(var67);
                        client.method997(var67);
                        if (var66 != -1 && var67.field2799 == 0) {
                            client.method1584(Statics.field2771[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var455 == 1001) {
                        var5 -= 4;
                        var67.field2826 = field804[var5];
                        var67.field2864 = field804[var5 + 1];
                        var67.field2762 = field804[var5 + 2];
                        var67.field2763 = field804[var5 + 3];
                        client.method791(var67);
                        client.method997(var67);
                        if (var66 != -1 && var67.field2799 == 0) {
                            client.method1584(Statics.field2771[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var455 == 1003) {
                        var5--;
                        boolean var68 = field804[var5] == 1;
                        if (var67.field2775 != var68) {
                            var67.field2775 = var68;
                            client.method791(var67);
                        }
                        continue;
                    }
                    if (var455 == 1005) {
                        var5--;
                        var67.field2888 = field804[var5] == 1;
                        continue;
                    }
                    if (var455 == 1006) {
                        var5--;
                        var67.field2850 = field804[var5] == 1;
                        continue;
                    }
                } else if (!(var455 < 1100 || var455 >= 1200) || !(var455 < 2100 || var455 >= 2200)) {
                    int var69 = -1;
                    class174 var70;
                    if (var455 >= 2000) {
                        var455 -= 1000;
                        var5--;
                        var69 = field804[var5];
                        var70 = class174.method2958(var69);
                    } else {
                        var70 = var51 ? Statics.field801 : Statics.field814;
                    }
                    if (var455 == 1100) {
                        var5 -= 2;
                        var70.field2879 = field804[var5];
                        if (var70.field2879 > var70.field2778 - var70.field2770) {
                            var70.field2879 = var70.field2778 - var70.field2770;
                        }
                        if (var70.field2879 < 0) {
                            var70.field2879 = 0;
                        }
                        var70.field2777 = field804[var5 + 1];
                        if (var70.field2777 > var70.field2779 - var70.field2889) {
                            var70.field2777 = var70.field2779 - var70.field2889;
                        }
                        if (var70.field2777 < 0) {
                            var70.field2777 = 0;
                        }
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1101) {
                        var5--;
                        var70.field2780 = field804[var5];
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1102) {
                        var5--;
                        var70.field2843 = field804[var5] == 1;
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1103) {
                        var5--;
                        var70.field2786 = field804[var5];
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1104) {
                        var5--;
                        var70.field2788 = field804[var5];
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1105) {
                        var5--;
                        var70.field2790 = field804[var5];
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1106) {
                        var5--;
                        var70.field2878 = field804[var5];
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1107) {
                        var5--;
                        var70.field2793 = field804[var5] == 1;
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1108) {
                        var70.field2798 = 1;
                        var5--;
                        var70.field2769 = field804[var5];
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1109) {
                        var5 -= 6;
                        var70.field2804 = field804[var5];
                        var70.field2805 = field804[var5 + 1];
                        var70.field2806 = field804[var5 + 2];
                        var70.field2807 = field804[var5 + 3];
                        var70.field2747 = field804[var5 + 4];
                        var70.field2875 = field804[var5 + 5];
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1110) {
                        var5--;
                        int var71 = field804[var5];
                        if (var70.field2757 != var71) {
                            var70.field2757 = var71;
                            var70.field2877 = 0;
                            var70.field2744 = 0;
                            client.method791(var70);
                        }
                        continue;
                    }
                    if (var455 == 1111) {
                        var5--;
                        var70.field2812 = field804[var5] == 1;
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1112) {
                        var6--;
                        String var72 = field805[var6];
                        if (!var72.equals(var70.field2815)) {
                            var70.field2815 = var72;
                            client.method791(var70);
                        }
                        continue;
                    }
                    if (var455 == 1113) {
                        var5--;
                        var70.field2814 = field804[var5];
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1114) {
                        var5 -= 3;
                        var70.field2818 = field804[var5];
                        var70.field2819 = field804[var5 + 1];
                        var70.field2817 = field804[var5 + 2];
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1115) {
                        var5--;
                        var70.field2820 = field804[var5] == 1;
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1116) {
                        var5--;
                        var70.field2794 = field804[var5];
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1117) {
                        var5--;
                        var70.field2802 = field804[var5];
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1118) {
                        var5--;
                        var70.field2755 = field804[var5] == 1;
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1119) {
                        var5--;
                        var70.field2838 = field804[var5] == 1;
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1120) {
                        var5 -= 2;
                        var70.field2778 = field804[var5];
                        var70.field2779 = field804[var5 + 1];
                        client.method791(var70);
                        if (var69 != -1 && var70.field2799 == 0) {
                            client.method1584(Statics.field2771[var69 >> 16], var70, false);
                        }
                        continue;
                    }
                    if (var455 == 1121) {
                        int var73 = var70.field2870;
                        int var74 = var70.field2756;
                        client.field334.method2604(89);
                        client.field334.method2426(var73);
                        client.field334.method2371(var74);
                        client.field313 = var70;
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1122) {
                        var5--;
                        var70.field2791 = field804[var5];
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1123) {
                        var5--;
                        var70.field2781 = field804[var5];
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1124) {
                        var5--;
                        var70.field2840 = field804[var5];
                        client.method791(var70);
                        continue;
                    }
                    if (var455 == 1125) {
                        var5--;
                        int var75 = field804[var5];
                        class83 var76 = (class83) class110.method170(class83.method168(), var75);
                        if (var76 != null) {
                            var70.field2785 = var76;
                            client.method791(var70);
                        }
                        continue;
                    }
                } else if (!(var455 < 1200 || var455 >= 1300) || !(var455 < 2200 || var455 >= 2300)) {
                    class174 var77;
                    if (var455 >= 2000) {
                        var455 -= 1000;
                        var5--;
                        var77 = class174.method2958(field804[var5]);
                    } else {
                        var77 = var51 ? Statics.field801 : Statics.field814;
                    }
                    client.method791(var77);
                    if (var455 == 1200 || var455 == 1205 || var455 == 1212) {
                        var5 -= 2;
                        int var78 = field804[var5];
                        int var79 = field804[var5 + 1];
                        var77.field2765 = var78;
                        var77.field2795 = var79;
                        class52 var80 = class52.method2827(var78);
                        var77.field2806 = var80.field1118;
                        var77.field2807 = var80.field1130;
                        var77.field2747 = var80.field1132;
                        var77.field2804 = var80.field1134;
                        var77.field2805 = var80.field1133;
                        var77.field2875 = var80.field1128;
                        if (var455 == 1205) {
                            var77.field2813 = 0;
                        } else if (var455 == 1212 | var80.field1152 == 1) {
                            var77.field2813 = 1;
                        } else {
                            var77.field2813 = 2;
                        }
                        if (var77.field2810 > 0) {
                            var77.field2875 = var77.field2875 * 32 / var77.field2810;
                        } else if (var77.field2826 > 0) {
                            var77.field2875 = var77.field2875 * 32 / var77.field2826;
                        }
                        continue;
                    }
                    if (var455 == 1201) {
                        var77.field2798 = 2;
                        var5--;
                        var77.field2769 = field804[var5];
                        continue;
                    }
                    if (var455 == 1202) {
                        var77.field2798 = 3;
                        var77.field2769 = Statics.field226.field37.method3285();
                        continue;
                    }
                } else if (var455 >= 1300 && var455 < 1400 || var455 >= 2300 && var455 < 2400) {
                    class174 var81;
                    if (var455 >= 2000) {
                        var455 -= 1000;
                        var5--;
                        var81 = class174.method2958(field804[var5]);
                    } else {
                        var81 = var51 ? Statics.field801 : Statics.field814;
                    }
                    if (var455 == 1300) {
                        var5--;
                        int var82 = field804[var5] - 1;
                        if (var82 >= 0 && var82 <= 9) {
                            var6--;
                            var81.method3206(var82, field805[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var455 == 1301) {
                        var5 -= 2;
                        int var83 = field804[var5];
                        int var84 = field804[var5 + 1];
                        var81.field2830 = class174.method3194(var83, var84);
                        continue;
                    }
                    if (var455 == 1302) {
                        var5--;
                        var81.field2833 = field804[var5] == 1;
                        continue;
                    }
                    if (var455 == 1303) {
                        var5--;
                        var81.field2831 = field804[var5];
                        continue;
                    }
                    if (var455 == 1304) {
                        var5--;
                        var81.field2832 = field804[var5];
                        continue;
                    }
                    if (var455 == 1305) {
                        var6--;
                        var81.field2834 = field805[var6];
                        continue;
                    }
                    if (var455 == 1306) {
                        var6--;
                        var81.field2796 = field805[var6];
                        continue;
                    }
                    if (var455 == 1307) {
                        var81.field2855 = null;
                        continue;
                    }
                } else {
                    if (var455 >= 1400 && var455 < 1500 || var455 >= 2400 && var455 < 2500) {
                        class174 var85;
                        if (var455 >= 2000) {
                            var455 -= 1000;
                            var5--;
                            var85 = class174.method2958(field804[var5]);
                        } else {
                            var85 = var51 ? Statics.field801 : Statics.field814;
                        }
                        var6--;
                        String var86 = field805[var6];
                        int[] var87 = null;
                        if (var86.length() > 0 && var86.charAt(var86.length() - 1) == 'Y') {
                            var5--;
                            int var88 = field804[var5];
                            if (var88 > 0) {
                                var87 = new int[var88];
                                while (var88-- > 0) {
                                    var5--;
                                    var87[var88] = field804[var5];
                                }
                            }
                            var86 = var86.substring(0, var86.length() - 1);
                        }
                        Object[] var89 = new Object[var86.length() + 1];
                        for (int var90 = var89.length - 1; var90 >= 1; var90--) {
                            if (var86.charAt(var90 - 1) == 's') {
                                var6--;
                                var89[var90] = field805[var6];
                            } else {
                                var5--;
                                var89[var90] = Integer.valueOf(field804[var5]);
                            }
                        }
                        var5--;
                        int var91 = field804[var5];
                        if (var91 == -1) {
                            var89 = null;
                        } else {
                            var89[0] = Integer.valueOf(var91);
                        }
                        if (var455 == 1400) {
                            var85.field2837 = var89;
                        }
                        if (var455 == 1401) {
                            var85.field2882 = var89;
                        }
                        if (var455 == 1402) {
                            var85.field2773 = var89;
                        }
                        if (var455 == 1403) {
                            var85.field2841 = var89;
                        }
                        if (var455 == 1404) {
                            var85.field2876 = var89;
                        }
                        if (var455 == 1405) {
                            var85.field2844 = var89;
                        }
                        if (var455 == 1406) {
                            var85.field2847 = var89;
                        }
                        if (var455 == 1407) {
                            var85.field2848 = var89;
                            var85.field2849 = var87;
                        }
                        if (var455 == 1408) {
                            var85.field2854 = var89;
                        }
                        if (var455 == 1409) {
                            var85.field2860 = var89;
                        }
                        if (var455 == 1410) {
                            var85.field2845 = var89;
                        }
                        if (var455 == 1411) {
                            var85.field2873 = var89;
                        }
                        if (var455 == 1412) {
                            var85.field2766 = var89;
                        }
                        if (var455 == 1414) {
                            var85.field2866 = var89;
                            var85.field2851 = var87;
                        }
                        if (var455 == 1415) {
                            var85.field2852 = var89;
                            var85.field2853 = var87;
                        }
                        if (var455 == 1416) {
                            var85.field2846 = var89;
                        }
                        if (var455 == 1417) {
                            var85.field2856 = var89;
                        }
                        if (var455 == 1418) {
                            var85.field2767 = var89;
                        }
                        if (var455 == 1419) {
                            var85.field2858 = var89;
                        }
                        if (var455 == 1420) {
                            var85.field2746 = var89;
                        }
                        if (var455 == 1421) {
                            var85.field2839 = var89;
                        }
                        if (var455 == 1422) {
                            var85.field2752 = var89;
                        }
                        if (var455 == 1423) {
                            var85.field2829 = var89;
                        }
                        if (var455 == 1424) {
                            var85.field2863 = var89;
                        }
                        if (var455 == 1425) {
                            var85.field2865 = var89;
                        }
                        if (var455 == 1426) {
                            var85.field2792 = var89;
                        }
                        if (var455 == 1427) {
                            var85.field2857 = var89;
                        }
                        var85.field2835 = true;
                        continue;
                    }
                    if (var455 < 1600) {
                        class174 var92 = var51 ? Statics.field801 : Statics.field814;
                        if (var455 == 1500) {
                            field804[var5++] = var92.field2874;
                            continue;
                        }
                        if (var455 == 1501) {
                            field804[var5++] = var92.field2808;
                            continue;
                        }
                        if (var455 == 1502) {
                            field804[var5++] = var92.field2770;
                            continue;
                        }
                        if (var455 == 1503) {
                            field804[var5++] = var92.field2889;
                            continue;
                        }
                        if (var455 == 1504) {
                            field804[var5++] = var92.field2775 ? 1 : 0;
                            continue;
                        }
                        if (var455 == 1505) {
                            field804[var5++] = var92.field2774;
                            continue;
                        }
                    } else if (var455 < 1700) {
                        class174 var93 = var51 ? Statics.field801 : Statics.field814;
                        if (var455 == 1600) {
                            field804[var5++] = var93.field2879;
                            continue;
                        }
                        if (var455 == 1601) {
                            field804[var5++] = var93.field2777;
                            continue;
                        }
                        if (var455 == 1602) {
                            field805[var6++] = var93.field2815;
                            continue;
                        }
                        if (var455 == 1603) {
                            field804[var5++] = var93.field2778;
                            continue;
                        }
                        if (var455 == 1604) {
                            field804[var5++] = var93.field2779;
                            continue;
                        }
                        if (var455 == 1605) {
                            field804[var5++] = var93.field2875;
                            continue;
                        }
                        if (var455 == 1606) {
                            field804[var5++] = var93.field2806;
                            continue;
                        }
                        if (var455 == 1607) {
                            field804[var5++] = var93.field2747;
                            continue;
                        }
                        if (var455 == 1608) {
                            field804[var5++] = var93.field2807;
                            continue;
                        }
                        if (var455 == 1609) {
                            field804[var5++] = var93.field2786;
                            continue;
                        }
                        if (var455 == 1610) {
                            field804[var5++] = var93.field2840;
                            continue;
                        }
                        if (var455 == 1611) {
                            field804[var5++] = var93.field2780;
                            continue;
                        }
                        if (var455 == 1612) {
                            field804[var5++] = var93.field2781;
                            continue;
                        }
                        if (var455 == 1613) {
                            field804[var5++] = var93.field2785.method590();
                            continue;
                        }
                    } else if (var455 < 1800) {
                        class174 var94 = var51 ? Statics.field801 : Statics.field814;
                        if (var455 == 1700) {
                            field804[var5++] = var94.field2765;
                            continue;
                        }
                        if (var455 == 1701) {
                            if (var94.field2765 == -1) {
                                field804[var5++] = 0;
                            } else {
                                field804[var5++] = var94.field2795;
                            }
                            continue;
                        }
                        if (var455 == 1702) {
                            field804[var5++] = var94.field2756;
                            continue;
                        }
                    } else if (var455 < 1900) {
                        class174 var95 = var51 ? Statics.field801 : Statics.field814;
                        if (var455 == 1800) {
                            int[] var96 = field804;
                            int var97 = var5++;
                            int var98 = client.method198(var95);
                            int var99 = var98 >> 11 & 0x3F;
                            var96[var97] = var99;
                            continue;
                        }
                        if (var455 == 1801) {
                            var5--;
                            int var100 = field804[var5];
                            int var456 = var100 - 1;
                            if (var95.field2855 != null && var456 < var95.field2855.length && var95.field2855[var456] != null) {
                                field805[var6++] = var95.field2855[var456];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var455 == 1802) {
                            if (var95.field2834 == null) {
                                field805[var6++] = "";
                            } else {
                                field805[var6++] = var95.field2834;
                            }
                            continue;
                        }
                    } else if (!(var455 < 1900 || var455 >= 2000) || !(var455 < 2900 || var455 >= 3000)) {
                        class174 var101;
                        if (var455 >= 2000) {
                            var455 -= 1000;
                            var5--;
                            var101 = class174.method2958(field804[var5]);
                        } else {
                            var101 = var51 ? Statics.field801 : Statics.field814;
                        }
                        if (var455 == 1927) {
                            if (field810 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var101.field2857 == null) {
                                return;
                            }
                            class1 var102 = new class1();
                            var102.field2 = var101;
                            var102.field1 = var101.field2857;
                            var102.field11 = field810 + 1;
                            client.field487.method3610(arg0);
                            continue;
                        }
                    } else if (var455 < 2600) {
                        var5--;
                        class174 var103 = class174.method2958(field804[var5]);
                        if (var455 == 2500) {
                            field804[var5++] = var103.field2874;
                            continue;
                        }
                        if (var455 == 2501) {
                            field804[var5++] = var103.field2808;
                            continue;
                        }
                        if (var455 == 2502) {
                            field804[var5++] = var103.field2770;
                            continue;
                        }
                        if (var455 == 2503) {
                            field804[var5++] = var103.field2889;
                            continue;
                        }
                        if (var455 == 2504) {
                            field804[var5++] = var103.field2775 ? 1 : 0;
                            continue;
                        }
                        if (var455 == 2505) {
                            field804[var5++] = var103.field2774;
                            continue;
                        }
                    } else if (var455 < 2700) {
                        var5--;
                        class174 var104 = class174.method2958(field804[var5]);
                        if (var455 == 2600) {
                            field804[var5++] = var104.field2879;
                            continue;
                        }
                        if (var455 == 2601) {
                            field804[var5++] = var104.field2777;
                            continue;
                        }
                        if (var455 == 2602) {
                            field805[var6++] = var104.field2815;
                            continue;
                        }
                        if (var455 == 2603) {
                            field804[var5++] = var104.field2778;
                            continue;
                        }
                        if (var455 == 2604) {
                            field804[var5++] = var104.field2779;
                            continue;
                        }
                        if (var455 == 2605) {
                            field804[var5++] = var104.field2875;
                            continue;
                        }
                        if (var455 == 2606) {
                            field804[var5++] = var104.field2806;
                            continue;
                        }
                        if (var455 == 2607) {
                            field804[var5++] = var104.field2747;
                            continue;
                        }
                        if (var455 == 2608) {
                            field804[var5++] = var104.field2807;
                            continue;
                        }
                        if (var455 == 2609) {
                            field804[var5++] = var104.field2786;
                            continue;
                        }
                        if (var455 == 2610) {
                            field804[var5++] = var104.field2840;
                            continue;
                        }
                        if (var455 == 2611) {
                            field804[var5++] = var104.field2780;
                            continue;
                        }
                        if (var455 == 2612) {
                            field804[var5++] = var104.field2781;
                            continue;
                        }
                        if (var455 == 2613) {
                            field804[var5++] = var104.field2785.method590();
                            continue;
                        }
                    } else if (var455 < 2800) {
                        if (var455 == 2700) {
                            var5--;
                            class174 var105 = class174.method2958(field804[var5]);
                            field804[var5++] = var105.field2765;
                            continue;
                        }
                        if (var455 == 2701) {
                            var5--;
                            class174 var106 = class174.method2958(field804[var5]);
                            if (var106.field2765 == -1) {
                                field804[var5++] = 0;
                            } else {
                                field804[var5++] = var106.field2795;
                            }
                            continue;
                        }
                        if (var455 == 2702) {
                            var5--;
                            int var107 = field804[var5];
                            class4 var108 = (class4) client.field449.method3555((long) var107);
                            if (var108 == null) {
                                field804[var5++] = 0;
                            } else {
                                field804[var5++] = 1;
                            }
                            continue;
                        }
                        if (var455 == 2706) {
                            field804[var5++] = client.field392;
                            continue;
                        }
                    } else if (var455 < 2900) {
                        var5--;
                        class174 var109 = class174.method2958(field804[var5]);
                        if (var455 == 2800) {
                            int[] var110 = field804;
                            int var111 = var5++;
                            int var112 = client.method198(var109);
                            int var113 = var112 >> 11 & 0x3F;
                            var110[var111] = var113;
                            continue;
                        }
                        if (var455 == 2801) {
                            var5--;
                            int var114 = field804[var5];
                            int var457 = var114 - 1;
                            if (var109.field2855 != null && var457 < var109.field2855.length && var109.field2855[var457] != null) {
                                field805[var6++] = var109.field2855[var457];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var455 == 2802) {
                            if (var109.field2834 == null) {
                                field805[var6++] = "";
                            } else {
                                field805[var6++] = var109.field2834;
                            }
                            continue;
                        }
                    } else if (var455 < 3200) {
                        if (var455 == 3100) {
                            var6--;
                            String var115 = field805[var6];
                            class12.method1120(0, "", var115);
                            continue;
                        }
                        if (var455 == 3101) {
                            var5 -= 2;
                            client.method107(Statics.field226, field804[var5], field804[var5 + 1]);
                            continue;
                        }
                        if (var455 == 3103) {
                            client.method2105();
                            continue;
                        }
                        if (var455 == 3104) {
                            var6--;
                            String var116 = field805[var6];
                            int var117 = 0;
                            if (class164.method2962(var116)) {
                                var117 = class164.method749(var116);
                            }
                            client.field334.method2604(90);
                            client.field334.method2370(var117);
                            continue;
                        }
                        if (var455 == 3105) {
                            var6--;
                            String var118 = field805[var6];
                            client.field334.method2604(234);
                            client.field334.method2485(var118.length() + 1);
                            client.field334.method2376(var118);
                            continue;
                        }
                        if (var455 == 3106) {
                            var6--;
                            String var119 = field805[var6];
                            client.field334.method2604(207);
                            client.field334.method2485(var119.length() + 1);
                            client.field334.method2376(var119);
                            continue;
                        }
                        if (var455 == 3107) {
                            var5--;
                            int var120 = field804[var5];
                            var6--;
                            String var121 = field805[var6];
                            client.method2749(var120, var121);
                            continue;
                        }
                        if (var455 == 3108) {
                            var5 -= 3;
                            int var122 = field804[var5];
                            int var123 = field804[var5 + 1];
                            int var124 = field804[var5 + 2];
                            class174 var125 = class174.method2958(var124);
                            Statics.method195(var125, var122, var123);
                            continue;
                        }
                        if (var455 == 3109) {
                            var5 -= 2;
                            int var126 = field804[var5];
                            int var127 = field804[var5 + 1];
                            class174 var128 = var51 ? Statics.field801 : Statics.field814;
                            Statics.method195(var128, var126, var127);
                            continue;
                        }
                        if (var455 == 3110) {
                            var5--;
                            Statics.field2225 = field804[var5] == 1;
                            continue;
                        }
                        if (var455 == 3111) {
                            field804[var5++] = Statics.field581.field141 ? 1 : 0;
                            continue;
                        }
                        if (var455 == 3112) {
                            var5--;
                            Statics.field581.field141 = field804[var5] == 1;
                            class9.method606();
                            continue;
                        }
                        if (var455 == 3113) {
                            var6--;
                            String var129 = field805[var6];
                            var5--;
                            boolean var130 = field804[var5] == 1;
                            class139.method692(var129, var130, false);
                            continue;
                        }
                        if (var455 == 3115) {
                            var5--;
                            int var131 = field804[var5];
                            client.field334.method2604(62);
                            client.field334.method2371(var131);
                            continue;
                        }
                        if (var455 == 3116) {
                            var5--;
                            int var132 = field804[var5];
                            var6 -= 2;
                            String var133 = field805[var6];
                            String var134 = field805[var6 + 1];
                            if (var133.length() <= 500 && var134.length() <= 500) {
                                client.field334.method2604(223);
                                client.field334.method2371(1 + class120.method622(var133) + class120.method622(var134));
                                client.field334.method2485(var132);
                                client.field334.method2376(var133);
                                client.field334.method2376(var134);
                            }
                            continue;
                        }
                    } else if (var455 < 3300) {
                        if (var455 == 3200) {
                            var5 -= 3;
                            client.method1994(field804[var5], field804[var5 + 1], field804[var5 + 2]);
                            continue;
                        }
                        if (var455 == 3201) {
                            var5--;
                            int var135 = field804[var5];
                            if (var135 == -1 && !client.field527) {
                                class184.method780();
                            } else if (var135 != -1 && client.field316 != var135 && client.field525 != 0 && !client.field527) {
                                class169 var136 = Statics.field262;
                                int var137 = client.field525;
                                class184.field2954 = 1;
                                Statics.field583 = var136;
                                Statics.field590 = var135;
                                Statics.field3146 = 0;
                                Statics.field2957 = var137;
                                Statics.field584 = false;
                                Statics.field2958 = 2;
                            }
                            client.field316 = var135;
                            continue;
                        }
                        if (var455 == 3202) {
                            var5 -= 2;
                            client.method3514(field804[var5], field804[var5 + 1]);
                            continue;
                        }
                    } else if (var455 < 3400) {
                        if (var455 == 3300) {
                            field804[var5++] = client.field302;
                            continue;
                        }
                        if (var455 == 3301) {
                            var5 -= 2;
                            int var138 = field804[var5];
                            int var139 = field804[var5 + 1];
                            field804[var5++] = class16.method1623(var138, var139);
                            continue;
                        }
                        if (var455 == 3302) {
                            var5 -= 2;
                            int var140 = field804[var5];
                            int var141 = field804[var5 + 1];
                            field804[var5++] = class16.method974(var140, var141);
                            continue;
                        }
                        if (var455 == 3303) {
                            var5 -= 2;
                            int var142 = field804[var5];
                            int var143 = field804[var5 + 1];
                            int[] var144 = field804;
                            int var145 = var5++;
                            class16 var146 = (class16) class16.field230.method3555((long) var142);
                            int var147;
                            if (var146 == null) {
                                var147 = 0;
                            } else if (var143 == -1) {
                                var147 = 0;
                            } else {
                                int var148 = 0;
                                for (int var149 = 0; var149 < var146.field224.length; var149++) {
                                    if (var146.field222[var149] == var143) {
                                        var148 += var146.field224[var149];
                                    }
                                }
                                var147 = var148;
                            }
                            var144[var145] = var147;
                            continue;
                        }
                        if (var455 == 3304) {
                            var5--;
                            int var150 = field804[var5];
                            int[] var151 = field804;
                            int var152 = var5++;
                            class51 var153 = (class51) class51.field1111.method3530((long) var150);
                            class51 var154;
                            if (var153 == null) {
                                byte[] var155 = Statics.field3216.method3061(5, var150);
                                class51 var156 = new class51();
                                if (var155 != null) {
                                    var156.method1037(new class120(var155));
                                }
                                class51.field1111.method3521(var156, (long) var150);
                                var154 = var156;
                            } else {
                                var154 = var153;
                            }
                            var151[var152] = var154.field1110;
                            continue;
                        }
                        if (var455 == 3305) {
                            var5--;
                            int var157 = field804[var5];
                            field804[var5++] = client.field425[var157];
                            continue;
                        }
                        if (var455 == 3306) {
                            var5--;
                            int var158 = field804[var5];
                            field804[var5++] = client.field426[var158];
                            continue;
                        }
                        if (var455 == 3307) {
                            var5--;
                            int var159 = field804[var5];
                            field804[var5++] = client.field427[var159];
                            continue;
                        }
                        if (var455 == 3308) {
                            int var160 = Statics.field213;
                            int var161 = (Statics.field226.field838 >> 7) + Statics.field2735;
                            int var162 = (Statics.field226.field881 >> 7) + Statics.field577;
                            field804[var5++] = (var160 << 28) + (var161 << 14) + var162;
                            continue;
                        }
                        if (var455 == 3309) {
                            var5--;
                            int var163 = field804[var5];
                            field804[var5++] = var163 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var455 == 3310) {
                            var5--;
                            int var164 = field804[var5];
                            field804[var5++] = var164 >> 28;
                            continue;
                        }
                        if (var455 == 3311) {
                            var5--;
                            int var165 = field804[var5];
                            field804[var5++] = var165 & 0x3FFF;
                            continue;
                        }
                        if (var455 == 3312) {
                            field804[var5++] = client.field411 ? 1 : 0;
                            continue;
                        }
                        if (var455 == 3313) {
                            var5 -= 2;
                            int var166 = field804[var5] + 32768;
                            int var167 = field804[var5 + 1];
                            int[] var168 = field804;
                            int var169 = var5++;
                            class16 var170 = (class16) class16.field230.method3555((long) var166);
                            int var171;
                            if (var170 == null) {
                                var171 = -1;
                            } else if (var167 >= 0 && var167 < var170.field222.length) {
                                var171 = var170.field222[var167];
                            } else {
                                var171 = -1;
                            }
                            var168[var169] = var171;
                            continue;
                        }
                        if (var455 == 3314) {
                            var5 -= 2;
                            int var172 = field804[var5] + 32768;
                            int var173 = field804[var5 + 1];
                            field804[var5++] = class16.method974(var172, var173);
                            continue;
                        }
                        if (var455 == 3315) {
                            var5 -= 2;
                            int var174 = field804[var5] + 32768;
                            int var175 = field804[var5 + 1];
                            int[] var176 = field804;
                            int var177 = var5++;
                            class16 var178 = (class16) class16.field230.method3555((long) var174);
                            int var179;
                            if (var178 == null) {
                                var179 = 0;
                            } else if (var175 == -1) {
                                var179 = 0;
                            } else {
                                int var180 = 0;
                                for (int var181 = 0; var181 < var178.field224.length; var181++) {
                                    if (var178.field222[var181] == var175) {
                                        var180 += var178.field224[var181];
                                    }
                                }
                                var179 = var180;
                            }
                            var176[var177] = var179;
                            continue;
                        }
                        if (var455 == 3316) {
                            if (client.field455 >= 2) {
                                field804[var5++] = client.field455;
                            } else {
                                field804[var5++] = 0;
                            }
                            continue;
                        }
                        if (var455 == 3317) {
                            field804[var5++] = client.field310;
                            continue;
                        }
                        if (var455 == 3318) {
                            field804[var5++] = client.field387;
                            continue;
                        }
                        if (var455 == 3321) {
                            field804[var5++] = client.field453;
                            continue;
                        }
                        if (var455 == 3322) {
                            field804[var5++] = client.field454;
                            continue;
                        }
                        if (var455 == 3323) {
                            if (client.field457) {
                                field804[var5++] = 1;
                            } else {
                                field804[var5++] = 0;
                            }
                            continue;
                        }
                        if (var455 == 3324) {
                            field804[var5++] = client.field292;
                            continue;
                        }
                    } else if (var455 < 3500) {
                        if (var455 == 3400) {
                            var5 -= 2;
                            int var182 = field804[var5];
                            int var183 = field804[var5 + 1];
                            class49 var184 = (class49) class49.field1089.method3530((long) var182);
                            class49 var185;
                            if (var184 == null) {
                                byte[] var186 = Statics.field1093.method3061(8, var182);
                                class49 var187 = new class49();
                                if (var186 != null) {
                                    var187.method1011(new class120(var186));
                                }
                                class49.field1089.method3521(var187, (long) var182);
                                var185 = var187;
                            } else {
                                var185 = var184;
                            }
                            class49 var188 = var185;
                            if (var185.field1091 != 's') {
                            }
                            for (int var189 = 0; var189 < var188.field1094; var189++) {
                                if (var188.field1095[var189] == var183) {
                                    field805[var6++] = var188.field1097[var189];
                                    var188 = null;
                                    break;
                                }
                            }
                            if (var188 != null) {
                                field805[var6++] = var188.field1098;
                            }
                            continue;
                        }
                        if (var455 == 3408) {
                            var5 -= 4;
                            int var190 = field804[var5];
                            int var191 = field804[var5 + 1];
                            int var192 = field804[var5 + 2];
                            int var193 = field804[var5 + 3];
                            class49 var194 = (class49) class49.field1089.method3530((long) var192);
                            class49 var195;
                            if (var194 == null) {
                                byte[] var196 = Statics.field1093.method3061(8, var192);
                                class49 var197 = new class49();
                                if (var196 != null) {
                                    var197.method1011(new class120(var196));
                                }
                                class49.field1089.method3521(var197, (long) var192);
                                var195 = var197;
                            } else {
                                var195 = var194;
                            }
                            class49 var198 = var195;
                            if (var195.field1090 == var190 && var195.field1091 == var191) {
                                for (int var199 = 0; var199 < var198.field1094; var199++) {
                                    if (var198.field1095[var199] == var193) {
                                        if (var191 == 115) {
                                            field805[var6++] = var198.field1097[var199];
                                        } else {
                                            field804[var5++] = var198.field1092[var199];
                                        }
                                        var198 = null;
                                        break;
                                    }
                                }
                                if (var198 != null) {
                                    if (var191 == 115) {
                                        field805[var6++] = var198.field1098;
                                    } else {
                                        field804[var5++] = var198.field1096;
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
                    } else if (var455 < 3700) {
                        if (var455 == 3600) {
                            if (client.field398 == 0) {
                                field804[var5++] = -2;
                            } else if (client.field398 == 1) {
                                field804[var5++] = -1;
                            } else {
                                field804[var5++] = client.field556;
                            }
                            continue;
                        }
                        if (var455 == 3601) {
                            var5--;
                            int var200 = field804[var5];
                            if (client.field398 == 2 && var200 < client.field556) {
                                field805[var6++] = client.field558[var200].field255;
                                field805[var6++] = client.field558[var200].field249;
                                continue;
                            }
                            field805[var6++] = "";
                            field805[var6++] = "";
                            continue;
                        }
                        if (var455 == 3602) {
                            var5--;
                            int var201 = field804[var5];
                            if (client.field398 == 2 && var201 < client.field556) {
                                field804[var5++] = client.field558[var201].field250;
                                continue;
                            }
                            field804[var5++] = 0;
                            continue;
                        }
                        if (var455 == 3603) {
                            var5--;
                            int var202 = field804[var5];
                            if (client.field398 == 2 && var202 < client.field556) {
                                field804[var5++] = client.field558[var202].field261;
                                continue;
                            }
                            field804[var5++] = 0;
                            continue;
                        }
                        if (var455 == 3604) {
                            var6--;
                            String var203 = field805[var6];
                            var5--;
                            int var204 = field804[var5];
                            client.method766(var203, var204);
                            continue;
                        }
                        if (var455 == 3605) {
                            var6--;
                            String var205 = field805[var6];
                            client.method3051(var205);
                            continue;
                        }
                        if (var455 == 3606) {
                            var6--;
                            String var206 = field805[var6];
                            Statics.method49(var206);
                            continue;
                        }
                        if (var455 == 3607) {
                            var6--;
                            String var207 = field805[var6];
                            client.method1544(var207, false);
                            continue;
                        }
                        if (var455 == 3608) {
                            var6--;
                            String var208 = field805[var6];
                            if (var208 == null) {
                                continue;
                            }
                            String var209 = class165.method2795(var208, Statics.field295);
                            if (var209 == null) {
                                continue;
                            }
                            int var210 = 0;
                            while (true) {
                                if (var210 >= client.field560) {
                                    continue label2850;
                                }
                                class8 var211 = client.field561[var210];
                                String var212 = var211.field135;
                                String var213 = class165.method2795(var212, Statics.field295);
                                if (class130.method667(var208, var209, var212, var213)) {
                                    client.field560--;
                                    for (int var214 = var210; var214 < client.field560; var214++) {
                                        client.field561[var214] = client.field561[var214 + 1];
                                    }
                                    client.field481 = client.field564;
                                    client.field334.method2604(111);
                                    client.field334.method2485(class120.method622(var208));
                                    client.field334.method2376(var208);
                                    continue label2850;
                                }
                                var210++;
                            }
                        }
                        if (var455 == 3609) {
                            var6--;
                            String var215 = field805[var6];
                            class153[] var216 = class153.method132();
                            for (int var217 = 0; var217 < var216.length; var217++) {
                                class153 var218 = var216[var217];
                                if (var218.field2261 != -1) {
                                    int var220 = var218.field2261;
                                    String var221 = "<img=" + var220 + ">";
                                    if (var215.startsWith(var221)) {
                                        var215 = var215.substring(6 + Integer.toString(var218.field2261).length());
                                        break;
                                    }
                                }
                            }
                            field804[var5++] = client.method1995(var215, false) ? 1 : 0;
                            continue;
                        }
                        if (var455 == 3611) {
                            if (client.field515 == null) {
                                field805[var6++] = "";
                            } else {
                                field805[var6++] = class163.method238(client.field515);
                            }
                            continue;
                        }
                        if (var455 == 3612) {
                            if (client.field515 == null) {
                                field804[var5++] = 0;
                            } else {
                                field804[var5++] = Statics.field1637;
                            }
                            continue;
                        }
                        if (var455 == 3613) {
                            var5--;
                            int var222 = field804[var5];
                            if (client.field515 != null && var222 < Statics.field1637) {
                                field805[var6++] = Statics.field793[var222].field630;
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var455 == 3614) {
                            var5--;
                            int var223 = field804[var5];
                            if (client.field515 != null && var223 < Statics.field1637) {
                                field804[var5++] = Statics.field793[var223].field623;
                                continue;
                            }
                            field804[var5++] = 0;
                            continue;
                        }
                        if (var455 == 3615) {
                            var5--;
                            int var224 = field804[var5];
                            if (client.field515 != null && var224 < Statics.field1637) {
                                field804[var5++] = Statics.field793[var224].field624;
                                continue;
                            }
                            field804[var5++] = 0;
                            continue;
                        }
                        if (var455 == 3616) {
                            field804[var5++] = Statics.field2960;
                            continue;
                        }
                        if (var455 == 3617) {
                            var6--;
                            String var225 = field805[var6];
                            client.method2106(var225);
                            continue;
                        }
                        if (var455 == 3618) {
                            field804[var5++] = Statics.field149;
                            continue;
                        }
                        if (var455 == 3619) {
                            var6--;
                            String var226 = field805[var6];
                            client.method2953(var226);
                            continue;
                        }
                        if (var455 == 3620) {
                            client.method752();
                            continue;
                        }
                        if (var455 == 3621) {
                            if (client.field398 == 0) {
                                field804[var5++] = -1;
                            } else {
                                field804[var5++] = client.field560;
                            }
                            continue;
                        }
                        if (var455 == 3622) {
                            var5--;
                            int var227 = field804[var5];
                            if (client.field398 != 0 && var227 < client.field560) {
                                field805[var6++] = client.field561[var227].field135;
                                field805[var6++] = client.field561[var227].field138;
                                continue;
                            }
                            field805[var6++] = "";
                            field805[var6++] = "";
                            continue;
                        }
                        if (var455 == 3623) {
                            String var228;
                            label2639: {
                                var6--;
                                var228 = field805[var6];
                                String var230 = "<img=0>";
                                if (!var228.startsWith(var230)) {
                                    String var232 = "<img=1>";
                                    if (!var228.startsWith(var232)) {
                                        break label2639;
                                    }
                                }
                                var228 = var228.substring(7);
                            }
                            field804[var5++] = client.method44(var228) ? 1 : 0;
                            continue;
                        }
                        if (var455 == 3624) {
                            var5--;
                            int var233 = field804[var5];
                            if (Statics.field793 != null && var233 < Statics.field1637 && Statics.field793[var233].field630.equalsIgnoreCase(Statics.field226.field61)) {
                                field804[var5++] = 1;
                                continue;
                            }
                            field804[var5++] = 0;
                            continue;
                        }
                        if (var455 == 3625) {
                            if (client.field516 == null) {
                                field805[var6++] = "";
                            } else {
                                field805[var6++] = class163.method238(client.field516);
                            }
                            continue;
                        }
                    } else if (var455 < 4000) {
                        if (var455 == 3903) {
                            var5--;
                            int var234 = field804[var5];
                            field804[var5++] = client.field565[var234].method3751();
                            continue;
                        }
                        if (var455 == 3904) {
                            var5--;
                            int var235 = field804[var5];
                            field804[var5++] = client.field565[var235].field3169;
                            continue;
                        }
                        if (var455 == 3905) {
                            var5--;
                            int var236 = field804[var5];
                            field804[var5++] = client.field565[var236].field3170;
                            continue;
                        }
                        if (var455 == 3906) {
                            var5--;
                            int var237 = field804[var5];
                            field804[var5++] = client.field565[var237].field3173;
                            continue;
                        }
                        if (var455 == 3907) {
                            var5--;
                            int var238 = field804[var5];
                            field804[var5++] = client.field565[var238].field3172;
                            continue;
                        }
                        if (var455 == 3908) {
                            var5--;
                            int var239 = field804[var5];
                            field804[var5++] = client.field565[var239].field3171;
                            continue;
                        }
                        if (var455 == 3910) {
                            var5--;
                            int var240 = field804[var5];
                            int var241 = client.field565[var240].method3750();
                            field804[var5++] = var241 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var455 == 3911) {
                            var5--;
                            int var242 = field804[var5];
                            int var243 = client.field565[var242].method3750();
                            field804[var5++] = var243 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var455 == 3912) {
                            var5--;
                            int var244 = field804[var5];
                            int var245 = client.field565[var244].method3750();
                            field804[var5++] = var245 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var455 == 3913) {
                            var5--;
                            int var246 = field804[var5];
                            int var247 = client.field565[var246].method3750();
                            field804[var5++] = var247 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var455 == 3914) {
                            var5--;
                            boolean var248 = field804[var5] == 1;
                            if (Statics.field2099 != null) {
                                Statics.field2099.method3768(class222.field3176, var248);
                            }
                            continue;
                        }
                        if (var455 == 3915) {
                            var5--;
                            boolean var249 = field804[var5] == 1;
                            if (Statics.field2099 != null) {
                                Statics.field2099.method3768(class222.field3178, var249);
                            }
                            continue;
                        }
                        if (var455 == 3916) {
                            var5 -= 2;
                            boolean var250 = field804[var5] == 1;
                            boolean var251 = field804[var5 + 1] == 1;
                            if (Statics.field2099 != null) {
                                Statics.field2099.method3768(new class22(var251), var250);
                            }
                            continue;
                        }
                        if (var455 == 3917) {
                            var5--;
                            boolean var252 = field804[var5] == 1;
                            if (Statics.field2099 != null) {
                                Statics.field2099.method3768(class222.field3175, var252);
                            }
                            continue;
                        }
                        if (var455 == 3918) {
                            var5--;
                            boolean var253 = field804[var5] == 1;
                            if (Statics.field2099 != null) {
                                Statics.field2099.method3768(class222.field3179, var253);
                            }
                            continue;
                        }
                        if (var455 == 3919) {
                            field804[var5++] = Statics.field2099 == null ? 0 : Statics.field2099.field3177.size();
                            continue;
                        }
                        if (var455 == 3920) {
                            var5--;
                            int var254 = field804[var5];
                            class215 var255 = (class215) Statics.field2099.field3177.get(var254);
                            field804[var5++] = var255.field3150;
                            continue;
                        }
                        if (var455 == 3921) {
                            var5--;
                            int var256 = field804[var5];
                            class215 var257 = (class215) Statics.field2099.field3177.get(var256);
                            field805[var6++] = var257.method3707();
                            continue;
                        }
                        if (var455 == 3922) {
                            var5--;
                            int var258 = field804[var5];
                            class215 var259 = (class215) Statics.field2099.field3177.get(var258);
                            field805[var6++] = var259.method3708();
                            continue;
                        }
                        if (var455 == 3923) {
                            var5--;
                            int var260 = field804[var5];
                            class215 var261 = (class215) Statics.field2099.field3177.get(var260);
                            long var262 = class116.method2672() - Statics.field146 - var261.field3149;
                            int var264 = (int) (var262 / 3600000L);
                            int var265 = (int) ((var262 - (long) (var264 * 3600000)) / 60000L);
                            int var266 = (int) ((var262 - (long) (var264 * 3600000) - (long) (var265 * 60000)) / 1000L);
                            String var267 = var264 + ":" + var265 / 10 + var265 % 10 + ":" + var266 / 10 + var266 % 10;
                            field805[var6++] = var267;
                            continue;
                        }
                        if (var455 == 3924) {
                            var5--;
                            int var268 = field804[var5];
                            class215 var269 = (class215) Statics.field2099.field3177.get(var268);
                            field804[var5++] = var269.field3148.field3173;
                            continue;
                        }
                        if (var455 == 3925) {
                            var5--;
                            int var270 = field804[var5];
                            class215 var271 = (class215) Statics.field2099.field3177.get(var270);
                            field804[var5++] = var271.field3148.field3170;
                            continue;
                        }
                        if (var455 == 3926) {
                            var5--;
                            int var272 = field804[var5];
                            class215 var273 = (class215) Statics.field2099.field3177.get(var272);
                            field804[var5++] = var273.field3148.field3169;
                            continue;
                        }
                    } else if (var455 < 4100) {
                        if (var455 == 4000) {
                            var5 -= 2;
                            int var274 = field804[var5];
                            int var275 = field804[var5 + 1];
                            field804[var5++] = var274 + var275;
                            continue;
                        }
                        if (var455 == 4001) {
                            var5 -= 2;
                            int var276 = field804[var5];
                            int var277 = field804[var5 + 1];
                            field804[var5++] = var276 - var277;
                            continue;
                        }
                        if (var455 == 4002) {
                            var5 -= 2;
                            int var278 = field804[var5];
                            int var279 = field804[var5 + 1];
                            field804[var5++] = var278 * var279;
                            continue;
                        }
                        if (var455 == 4003) {
                            var5 -= 2;
                            int var280 = field804[var5];
                            int var281 = field804[var5 + 1];
                            field804[var5++] = var280 / var281;
                            continue;
                        }
                        if (var455 == 4004) {
                            var5--;
                            int var282 = field804[var5];
                            field804[var5++] = (int) (Math.random() * (double) var282);
                            continue;
                        }
                        if (var455 == 4005) {
                            var5--;
                            int var283 = field804[var5];
                            field804[var5++] = (int) (Math.random() * (double) (var283 + 1));
                            continue;
                        }
                        if (var455 == 4006) {
                            var5 -= 5;
                            int var284 = field804[var5];
                            int var285 = field804[var5 + 1];
                            int var286 = field804[var5 + 2];
                            int var287 = field804[var5 + 3];
                            int var288 = field804[var5 + 4];
                            field804[var5++] = (var285 - var284) * (var288 - var286) / (var287 - var286) + var284;
                            continue;
                        }
                        if (var455 == 4007) {
                            var5 -= 2;
                            int var289 = field804[var5];
                            int var290 = field804[var5 + 1];
                            field804[var5++] = var289 * var290 / 100 + var289;
                            continue;
                        }
                        if (var455 == 4008) {
                            var5 -= 2;
                            int var291 = field804[var5];
                            int var292 = field804[var5 + 1];
                            field804[var5++] = var291 | 0x1 << var292;
                            continue;
                        }
                        if (var455 == 4009) {
                            var5 -= 2;
                            int var293 = field804[var5];
                            int var294 = field804[var5 + 1];
                            field804[var5++] = var293 & -1 - (0x1 << var294);
                            continue;
                        }
                        if (var455 == 4010) {
                            var5 -= 2;
                            int var295 = field804[var5];
                            int var296 = field804[var5 + 1];
                            field804[var5++] = (var295 & 0x1 << var296) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var455 == 4011) {
                            var5 -= 2;
                            int var297 = field804[var5];
                            int var298 = field804[var5 + 1];
                            field804[var5++] = var297 % var298;
                            continue;
                        }
                        if (var455 == 4012) {
                            var5 -= 2;
                            int var299 = field804[var5];
                            int var300 = field804[var5 + 1];
                            if (var299 == 0) {
                                field804[var5++] = 0;
                            } else {
                                field804[var5++] = (int) Math.pow((double) var299, (double) var300);
                            }
                            continue;
                        }
                        if (var455 == 4013) {
                            var5 -= 2;
                            int var301 = field804[var5];
                            int var302 = field804[var5 + 1];
                            if (var301 == 0) {
                                field804[var5++] = 0;
                            } else if (var302 == 0) {
                                field804[var5++] = Integer.MAX_VALUE;
                            } else {
                                field804[var5++] = (int) Math.pow((double) var301, 1.0D / (double) var302);
                            }
                            continue;
                        }
                        if (var455 == 4014) {
                            var5 -= 2;
                            int var303 = field804[var5];
                            int var304 = field804[var5 + 1];
                            field804[var5++] = var303 & var304;
                            continue;
                        }
                        if (var455 == 4015) {
                            var5 -= 2;
                            int var305 = field804[var5];
                            int var306 = field804[var5 + 1];
                            field804[var5++] = var305 | var306;
                            continue;
                        }
                        if (var455 == 4018) {
                            var5 -= 3;
                            long var307 = (long) field804[var5];
                            long var309 = (long) field804[var5 + 1];
                            long var311 = (long) field804[var5 + 2];
                            field804[var5++] = (int) (var307 * var311 / var309);
                            continue;
                        }
                    } else if (var455 < 4200) {
                        if (var455 == 4100) {
                            var6--;
                            String var313 = field805[var6];
                            var5--;
                            int var314 = field804[var5];
                            field805[var6++] = var313 + var314;
                            continue;
                        }
                        if (var455 == 4101) {
                            var6 -= 2;
                            String var315 = field805[var6];
                            String var316 = field805[var6 + 1];
                            field805[var6++] = var315 + var316;
                            continue;
                        }
                        if (var455 == 4102) {
                            var6--;
                            String var317 = field805[var6];
                            var5--;
                            int var318 = field804[var5];
                            String[] var319 = field805;
                            int var320 = var6++;
                            String var322;
                            if (var318 < 0) {
                                var322 = Integer.toString(var318);
                            } else {
                                var322 = class164.method1592(var318, 10, true);
                            }
                            var319[var320] = var317 + var322;
                            continue;
                        }
                        if (var455 == 4103) {
                            var6--;
                            String var323 = field805[var6];
                            field805[var6++] = var323.toLowerCase();
                            continue;
                        }
                        if (var455 == 4104) {
                            var5--;
                            int var324 = field804[var5];
                            long var325 = ((long) var324 + 11745L) * 86400000L;
                            field808.setTime(new Date(var325));
                            int var327 = field808.get(5);
                            int var328 = field808.get(2);
                            int var329 = field808.get(1);
                            field805[var6++] = var327 + "-" + field811[var328] + "-" + var329;
                            continue;
                        }
                        if (var455 == 4105) {
                            var6 -= 2;
                            String var330 = field805[var6];
                            String var331 = field805[var6 + 1];
                            if (Statics.field226.field37 != null && Statics.field226.field37.field2918) {
                                field805[var6++] = var331;
                                continue;
                            }
                            field805[var6++] = var330;
                            continue;
                        }
                        if (var455 == 4106) {
                            var5--;
                            int var332 = field804[var5];
                            field805[var6++] = Integer.toString(var332);
                            continue;
                        }
                        if (var455 == 4107) {
                            var6 -= 2;
                            field804[var5++] = class164.method694(class167.method2599(field805[var6], field805[var6 + 1], client.field298));
                            continue;
                        }
                        if (var455 == 4108) {
                            var6--;
                            String var333 = field805[var6];
                            var5 -= 2;
                            int var334 = field804[var5];
                            int var335 = field804[var5 + 1];
                            byte[] var336 = Statics.field3005.method3061(var335, 0);
                            class225 var337 = new class225(var336);
                            field804[var5++] = var337.method3779(var333, var334);
                            continue;
                        }
                        if (var455 == 4109) {
                            var6--;
                            String var338 = field805[var6];
                            var5 -= 2;
                            int var339 = field804[var5];
                            int var340 = field804[var5 + 1];
                            byte[] var341 = Statics.field3005.method3061(var340, 0);
                            class225 var342 = new class225(var341);
                            field804[var5++] = var342.method3778(var338, var339);
                            continue;
                        }
                        if (var455 == 4110) {
                            var6 -= 2;
                            String var343 = field805[var6];
                            String var344 = field805[var6 + 1];
                            var5--;
                            if (field804[var5] == 1) {
                                field805[var6++] = var343;
                            } else {
                                field805[var6++] = var344;
                            }
                            continue;
                        }
                        if (var455 == 4111) {
                            var6--;
                            String var345 = field805[var6];
                            field805[var6++] = class224.method3802(var345);
                            continue;
                        }
                        if (var455 == 4112) {
                            var6--;
                            String var346 = field805[var6];
                            var5--;
                            int var347 = field804[var5];
                            field805[var6++] = var346 + (char) var347;
                            continue;
                        }
                        if (var455 == 4113) {
                            var5--;
                            int var348 = field804[var5];
                            field804[var5++] = class164.method2305((char) var348) ? 1 : 0;
                            continue;
                        }
                        if (var455 == 4114) {
                            var5--;
                            int var349 = field804[var5];
                            field804[var5++] = class164.method664((char) var349) ? 1 : 0;
                            continue;
                        }
                        if (var455 == 4115) {
                            var5--;
                            int var350 = field804[var5];
                            field804[var5++] = class164.method868((char) var350) ? 1 : 0;
                            continue;
                        }
                        if (var455 == 4116) {
                            var5--;
                            int var351 = field804[var5];
                            field804[var5++] = class164.method763((char) var351) ? 1 : 0;
                            continue;
                        }
                        if (var455 == 4117) {
                            var6--;
                            String var352 = field805[var6];
                            if (var352 == null) {
                                field804[var5++] = 0;
                            } else {
                                field804[var5++] = var352.length();
                            }
                            continue;
                        }
                        if (var455 == 4118) {
                            var6--;
                            String var353 = field805[var6];
                            var5 -= 2;
                            int var354 = field804[var5];
                            int var355 = field804[var5 + 1];
                            field805[var6++] = var353.substring(var354, var355);
                            continue;
                        }
                        if (var455 == 4119) {
                            var6--;
                            String var356 = field805[var6];
                            StringBuilder var357 = new StringBuilder(var356.length());
                            boolean var358 = false;
                            for (int var359 = 0; var359 < var356.length(); var359++) {
                                char var360 = var356.charAt(var359);
                                if (var360 == '<') {
                                    var358 = true;
                                } else if (var360 == '>') {
                                    var358 = false;
                                } else if (!var358) {
                                    var357.append(var360);
                                }
                            }
                            field805[var6++] = var357.toString();
                            continue;
                        }
                        if (var455 == 4120) {
                            var6--;
                            String var361 = field805[var6];
                            var5--;
                            int var362 = field804[var5];
                            field804[var5++] = var361.indexOf(var362);
                            continue;
                        }
                        if (var455 == 4121) {
                            var6 -= 2;
                            String var363 = field805[var6];
                            String var364 = field805[var6 + 1];
                            var5--;
                            int var365 = field804[var5];
                            field804[var5++] = var363.indexOf(var364, var365);
                            continue;
                        }
                    } else if (var455 < 4300) {
                        if (var455 == 4200) {
                            var5--;
                            int var366 = field804[var5];
                            field805[var6++] = class52.method2827(var366).field1129;
                            continue;
                        }
                        if (var455 == 4201) {
                            var5 -= 2;
                            int var367 = field804[var5];
                            int var368 = field804[var5 + 1];
                            class52 var369 = class52.method2827(var367);
                            if (var368 >= 1 && var368 <= 5 && var369.field1137[var368 - 1] != null) {
                                field805[var6++] = var369.field1137[var368 - 1];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var455 == 4202) {
                            var5 -= 2;
                            int var370 = field804[var5];
                            int var371 = field804[var5 + 1];
                            class52 var372 = class52.method2827(var370);
                            if (var371 >= 1 && var371 <= 5 && var372.field1150[var371 - 1] != null) {
                                field805[var6++] = var372.field1150[var371 - 1];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var455 == 4203) {
                            var5--;
                            int var373 = field804[var5];
                            field804[var5++] = class52.method2827(var373).field1135;
                            continue;
                        }
                        if (var455 == 4204) {
                            var5--;
                            int var374 = field804[var5];
                            field804[var5++] = class52.method2827(var374).field1152 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var455 == 4205) {
                            var5--;
                            int var375 = field804[var5];
                            class52 var376 = class52.method2827(var375);
                            if (var376.field1154 == -1 && var376.field1153 >= 0) {
                                field804[var5++] = var376.field1153;
                                continue;
                            }
                            field804[var5++] = var375;
                            continue;
                        }
                        if (var455 == 4206) {
                            var5--;
                            int var377 = field804[var5];
                            class52 var378 = class52.method2827(var377);
                            if (var378.field1154 >= 0 && var378.field1153 >= 0) {
                                field804[var5++] = var378.field1153;
                                continue;
                            }
                            field804[var5++] = var377;
                            continue;
                        }
                        if (var455 == 4207) {
                            var5--;
                            int var379 = field804[var5];
                            field804[var5++] = class52.method2827(var379).field1147 ? 1 : 0;
                            continue;
                        }
                        if (var455 == 4208) {
                            var5--;
                            int var380 = field804[var5];
                            class52 var381 = class52.method2827(var380);
                            if (var381.field1165 == -1 && var381.field1164 >= 0) {
                                field804[var5++] = var381.field1164;
                                continue;
                            }
                            field804[var5++] = var380;
                            continue;
                        }
                        if (var455 == 4209) {
                            var5--;
                            int var382 = field804[var5];
                            class52 var383 = class52.method2827(var382);
                            if (var383.field1165 >= 0 && var383.field1164 >= 0) {
                                field804[var5++] = var383.field1164;
                                continue;
                            }
                            field804[var5++] = var382;
                            continue;
                        }
                        if (var455 == 4210) {
                            var6--;
                            String var384 = field805[var6];
                            var5--;
                            int var385 = field804[var5];
                            client.method1522(var384, var385 == 1);
                            field804[var5++] = Statics.field626;
                            continue;
                        }
                        if (var455 == 4211) {
                            if (Statics.field1875 != null && Statics.field2648 < Statics.field626) {
                                field804[var5++] = Statics.field1875[++Statics.field2648 - 1] & 0xFFFF;
                                continue;
                            }
                            field804[var5++] = -1;
                            continue;
                        }
                        if (var455 == 4212) {
                            Statics.field2648 = 0;
                            continue;
                        }
                    } else if (var455 < 5100) {
                        if (var455 == 5000) {
                            field804[var5++] = client.field506;
                            continue;
                        }
                        if (var455 == 5001) {
                            var5 -= 3;
                            client.field506 = field804[var5];
                            int var386 = field804[var5 + 1];
                            class131[] var387 = class131.method2326();
                            int var388 = 0;
                            class131 var390;
                            while (true) {
                                if (var388 >= var387.length) {
                                    var390 = null;
                                    break;
                                }
                                class131 var389 = var387[var388];
                                if (var389.field2066 == var386) {
                                    var390 = var389;
                                    break;
                                }
                                var388++;
                            }
                            Statics.field1078 = var390;
                            if (Statics.field1078 == null) {
                                Statics.field1078 = class131.field2061;
                            }
                            client.field507 = field804[var5 + 2];
                            client.field334.method2604(129);
                            client.field334.method2485(client.field506);
                            client.field334.method2485(Statics.field1078.field2066);
                            client.field334.method2485(client.field507);
                            continue;
                        }
                        if (var455 == 5002) {
                            var6--;
                            String var391 = field805[var6];
                            var5 -= 2;
                            int var392 = field804[var5];
                            int var393 = field804[var5 + 1];
                            client.field334.method2604(135);
                            client.field334.method2485(class120.method622(var391) + 2);
                            client.field334.method2376(var391);
                            client.field334.method2485(var392 - 1);
                            client.field334.method2485(var393);
                            continue;
                        }
                        if (var455 == 5003) {
                            var5 -= 2;
                            int var394 = field804[var5];
                            int var395 = field804[var5 + 1];
                            class36 var396 = class12.method1239(var394, var395);
                            if (var396 == null) {
                                field804[var5++] = -1;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                                field805[var6++] = "";
                                field805[var6++] = "";
                            } else {
                                field804[var5++] = var396.field794;
                                field804[var5++] = var396.field787;
                                field805[var6++] = var396.field790 == null ? "" : var396.field790;
                                field805[var6++] = var396.field791 == null ? "" : var396.field791;
                                field805[var6++] = var396.field792 == null ? "" : var396.field792;
                            }
                            continue;
                        }
                        if (var455 == 5004) {
                            var5--;
                            int var397 = field804[var5];
                            class36 var398 = (class36) class12.field183.method3573((long) var397);
                            if (var398 == null) {
                                field804[var5++] = -1;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                                field805[var6++] = "";
                                field805[var6++] = "";
                            } else {
                                field804[var5++] = var398.field795;
                                field804[var5++] = var398.field787;
                                field805[var6++] = var398.field790 == null ? "" : var398.field790;
                                field805[var6++] = var398.field791 == null ? "" : var398.field791;
                                field805[var6++] = var398.field792 == null ? "" : var398.field792;
                            }
                            continue;
                        }
                        if (var455 == 5005) {
                            if (Statics.field1078 == null) {
                                field804[var5++] = -1;
                            } else {
                                field804[var5++] = Statics.field1078.field2066;
                            }
                            continue;
                        }
                        if (var455 == 5008) {
                            var6--;
                            String var400 = field805[var6];
                            var5--;
                            int var401 = field804[var5];
                            String var402 = var400.toLowerCase();
                            byte var403 = 0;
                            if (var402.startsWith(class158.field2490)) {
                                var403 = 0;
                                var400 = var400.substring(class158.field2490.length());
                            } else if (var402.startsWith(class158.field2483)) {
                                var403 = 1;
                                var400 = var400.substring(class158.field2483.length());
                            } else if (var402.startsWith(class158.field2485)) {
                                var403 = 2;
                                var400 = var400.substring(class158.field2485.length());
                            } else if (var402.startsWith(class158.field2321)) {
                                var403 = 3;
                                var400 = var400.substring(class158.field2321.length());
                            } else if (var402.startsWith(class158.field2489)) {
                                var403 = 4;
                                var400 = var400.substring(class158.field2489.length());
                            } else if (var402.startsWith(class158.field2491)) {
                                var403 = 5;
                                var400 = var400.substring(class158.field2491.length());
                            } else if (var402.startsWith(class158.field2379)) {
                                var403 = 6;
                                var400 = var400.substring(class158.field2379.length());
                            } else if (var402.startsWith(class158.field2392)) {
                                var403 = 7;
                                var400 = var400.substring(class158.field2392.length());
                            } else if (var402.startsWith(class158.field2420)) {
                                var403 = 8;
                                var400 = var400.substring(class158.field2420.length());
                            } else if (var402.startsWith(class158.field2499)) {
                                var403 = 9;
                                var400 = var400.substring(class158.field2499.length());
                            } else if (var402.startsWith(class158.field2501)) {
                                var403 = 10;
                                var400 = var400.substring(class158.field2501.length());
                            } else if (var402.startsWith(class158.field2502)) {
                                var403 = 11;
                                var400 = var400.substring(class158.field2502.length());
                            } else if (client.field298 != 0) {
                                if (var402.startsWith(class158.field2482)) {
                                    var403 = 0;
                                    var400 = var400.substring(class158.field2482.length());
                                } else if (var402.startsWith(class158.field2484)) {
                                    var403 = 1;
                                    var400 = var400.substring(class158.field2484.length());
                                } else if (var402.startsWith(class158.field2456)) {
                                    var403 = 2;
                                    var400 = var400.substring(class158.field2456.length());
                                } else if (var402.startsWith(class158.field2535)) {
                                    var403 = 3;
                                    var400 = var400.substring(class158.field2535.length());
                                } else if (var402.startsWith(class158.field2475)) {
                                    var403 = 4;
                                    var400 = var400.substring(class158.field2475.length());
                                } else if (var402.startsWith(class158.field2516)) {
                                    var403 = 5;
                                    var400 = var400.substring(class158.field2516.length());
                                } else if (var402.startsWith(class158.field2494)) {
                                    var403 = 6;
                                    var400 = var400.substring(class158.field2494.length());
                                } else if (var402.startsWith(class158.field2496)) {
                                    var403 = 7;
                                    var400 = var400.substring(class158.field2496.length());
                                } else if (var402.startsWith(class158.field2498)) {
                                    var403 = 8;
                                    var400 = var400.substring(class158.field2498.length());
                                } else if (var402.startsWith(class158.field2500)) {
                                    var403 = 9;
                                    var400 = var400.substring(class158.field2500.length());
                                } else if (var402.startsWith(class158.field2369)) {
                                    var403 = 10;
                                    var400 = var400.substring(class158.field2369.length());
                                } else if (var402.startsWith(class158.field2479)) {
                                    var403 = 11;
                                    var400 = var400.substring(class158.field2479.length());
                                }
                            }
                            String var404 = var400.toLowerCase();
                            byte var405 = 0;
                            if (var404.startsWith(class158.field2505)) {
                                var405 = 1;
                                var400 = var400.substring(class158.field2505.length());
                            } else if (var404.startsWith(class158.field2507)) {
                                var405 = 2;
                                var400 = var400.substring(class158.field2507.length());
                            } else if (var404.startsWith(class158.field2509)) {
                                var405 = 3;
                                var400 = var400.substring(class158.field2509.length());
                            } else if (var404.startsWith(class158.field2311)) {
                                var405 = 4;
                                var400 = var400.substring(class158.field2311.length());
                            } else if (var404.startsWith(class158.field2513)) {
                                var405 = 5;
                                var400 = var400.substring(class158.field2513.length());
                            } else if (client.field298 != 0) {
                                if (var404.startsWith(class158.field2320)) {
                                    var405 = 1;
                                    var400 = var400.substring(class158.field2320.length());
                                } else if (var404.startsWith(class158.field2508)) {
                                    var405 = 2;
                                    var400 = var400.substring(class158.field2508.length());
                                } else if (var404.startsWith(class158.field2350)) {
                                    var405 = 3;
                                    var400 = var400.substring(class158.field2350.length());
                                } else if (var404.startsWith(class158.field2586)) {
                                    var405 = 4;
                                    var400 = var400.substring(class158.field2586.length());
                                } else if (var404.startsWith(class158.field2514)) {
                                    var405 = 5;
                                    var400 = var400.substring(class158.field2514.length());
                                }
                            }
                            client.field334.method2604(57);
                            client.field334.method2485(0);
                            int var406 = client.field334.field1999;
                            client.field334.method2485(var401);
                            client.field334.method2485(var403);
                            client.field334.method2485(var405);
                            class123 var407 = client.field334;
                            int var408 = var407.field1999;
                            byte[] var409 = class166.method2676(var400);
                            var407.method2431(var409.length);
                            var407.field1999 += Statics.field3182.method2320(var409, 0, var409.length, var407.field2001, var407.field1999);
                            client.field334.method2382(client.field334.field1999 - var406);
                            continue;
                        }
                        if (var455 == 5009) {
                            var6 -= 2;
                            String var410 = field805[var6];
                            String var411 = field805[var6 + 1];
                            client.field334.method2604(246);
                            client.field334.method2371(0);
                            int var412 = client.field334.field1999;
                            client.field334.method2376(var410);
                            class123 var413 = client.field334;
                            int var414 = var413.field1999;
                            byte[] var415 = class166.method2676(var411);
                            var413.method2431(var415.length);
                            var413.field1999 += Statics.field3182.method2320(var415, 0, var415.length, var413.field2001, var413.field1999);
                            client.field334.method2381(client.field334.field1999 - var412);
                            continue;
                        }
                        if (var455 == 5015) {
                            String var416;
                            if (Statics.field226 == null || Statics.field226.field61 == null) {
                                var416 = "";
                            } else {
                                var416 = Statics.field226.field61;
                            }
                            field805[var6++] = var416;
                            continue;
                        }
                        if (var455 == 5016) {
                            field804[var5++] = client.field507;
                            continue;
                        }
                        if (var455 == 5017) {
                            var5--;
                            int var417 = field804[var5];
                            int[] var418 = field804;
                            int var419 = var5++;
                            class28 var420 = (class28) class12.field179.get(var417);
                            int var421;
                            if (var420 == null) {
                                var421 = 0;
                            } else {
                                var421 = var420.method675();
                            }
                            var418[var419] = var421;
                            continue;
                        }
                        if (var455 == 5018) {
                            var5--;
                            int var422 = field804[var5];
                            int[] var423 = field804;
                            int var424 = var5++;
                            class36 var425 = (class36) class12.field183.method3573((long) var422);
                            int var426;
                            if (var425 == null) {
                                var426 = -1;
                            } else if (class12.field180.field3102 == var425.field3106) {
                                var426 = -1;
                            } else {
                                var426 = ((class36) var425.field3106).field794;
                            }
                            var423[var424] = var426;
                            continue;
                        }
                        if (var455 == 5019) {
                            var5--;
                            int var427 = field804[var5];
                            field804[var5++] = class12.method2259(var427);
                            continue;
                        }
                        if (var455 == 5020) {
                            var6--;
                            String var428 = field805[var6];
                            client.method135(var428);
                            continue;
                        }
                        if (var455 == 5021) {
                            var6--;
                            client.field508 = field805[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var455 == 5022) {
                            field805[var6++] = client.field508;
                            continue;
                        }
                    }
                }
                if (var455 < 5400) {
                    if (var455 == 5306) {
                        int[] var429 = field804;
                        int var430 = var5++;
                        int var431 = client.field502 ? 2 : 1;
                        var429[var430] = var431;
                        continue;
                    }
                    if (var455 == 5307) {
                        var5--;
                        int var432 = field804[var5];
                        if (var432 != 1 && var432 != 2) {
                            continue;
                        }
                        client.field293 = 0L;
                        if (var432 >= 2) {
                            client.field502 = true;
                        } else {
                            client.field502 = false;
                        }
                        client.method2971();
                        if (client.field300 >= 25) {
                            client.field334.method2604(81);
                            class123 var433 = client.field334;
                            int var434 = client.field502 ? 2 : 1;
                            var433.method2485(var434);
                            client.field334.method2371(Statics.field709);
                            client.field334.method2371(Statics.field2275);
                        }
                        class145.field2197 = true;
                        continue;
                    }
                    if (var455 == 5308) {
                        field804[var5++] = Statics.field581.field143;
                        continue;
                    }
                    if (var455 == 5309) {
                        var5--;
                        int var435 = field804[var5];
                        if (var435 == 1 || var435 == 2) {
                            Statics.field581.field143 = var435;
                            class9.method606();
                        }
                        continue;
                    }
                }
                if (var455 < 5600) {
                    if (var455 == 5504) {
                        var5 -= 2;
                        int var436 = field804[var5];
                        int var437 = field804[var5 + 1];
                        if (!client.field537) {
                            client.field374 = var436;
                            client.field375 = var437;
                        }
                        continue;
                    }
                    if (var455 == 5505) {
                        field804[var5++] = client.field374;
                        continue;
                    }
                    if (var455 == 5506) {
                        field804[var5++] = client.field375;
                        continue;
                    }
                    if (var455 == 5530) {
                        var5--;
                        int var438 = field804[var5];
                        if (var438 < 0) {
                            var438 = 0;
                        }
                        client.field380 = var438;
                        continue;
                    }
                    if (var455 == 5531) {
                        field804[var5++] = client.field380;
                        continue;
                    }
                }
                if (var455 >= 5700 || var455 != 5630) {
                    if (var455 < 6300) {
                        if (var455 == 6200) {
                            var5 -= 2;
                            client.field345 = (short) field804[var5];
                            if (client.field345 <= 0) {
                                client.field345 = 256;
                            }
                            client.field544 = (short) field804[var5 + 1];
                            if (client.field544 <= 0) {
                                client.field544 = 205;
                            }
                            continue;
                        }
                        if (var455 == 6201) {
                            var5 -= 2;
                            client.field545 = (short) field804[var5];
                            if (client.field545 <= 0) {
                                client.field545 = 256;
                            }
                            client.field445 = (short) field804[var5 + 1];
                            if (client.field445 <= 0) {
                                client.field445 = 320;
                            }
                            continue;
                        }
                        if (var455 == 6202) {
                            var5 -= 4;
                            client.field547 = (short) field804[var5];
                            if (client.field547 <= 0) {
                                client.field547 = 1;
                            }
                            client.field548 = (short) field804[var5 + 1];
                            if (client.field548 <= 0) {
                                client.field548 = 32767;
                            } else if (client.field548 < client.field547) {
                                client.field548 = client.field547;
                            }
                            client.field421 = (short) field804[var5 + 2];
                            if (client.field421 <= 0) {
                                client.field421 = 1;
                            }
                            client.field566 = (short) field804[var5 + 3];
                            if (client.field566 <= 0) {
                                client.field566 = 32767;
                            } else if (client.field566 < client.field421) {
                                client.field566 = client.field421;
                            }
                            continue;
                        }
                        if (var455 == 6203) {
                            if (client.field463 == null) {
                                field804[var5++] = -1;
                                field804[var5++] = -1;
                            } else {
                                client.method2967(0, 0, client.field463.field2770, client.field463.field2889, false);
                                field804[var5++] = client.field433;
                                field804[var5++] = client.field554;
                            }
                            continue;
                        }
                        if (var455 == 6204) {
                            field804[var5++] = client.field545;
                            field804[var5++] = client.field445;
                            continue;
                        }
                        if (var455 == 6205) {
                            field804[var5++] = client.field345;
                            field804[var5++] = client.field544;
                            continue;
                        }
                    }
                    if (var455 < 6600) {
                        if (var455 == 6500) {
                            field804[var5++] = class26.method616() ? 1 : 0;
                            continue;
                        }
                        if (var455 == 6501) {
                            class26 var439 = class26.method50();
                            if (var439 == null) {
                                field804[var5++] = -1;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                                field804[var5++] = 0;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                            } else {
                                field804[var5++] = var439.field641;
                                field804[var5++] = var439.field642;
                                field805[var6++] = var439.field632;
                                field804[var5++] = var439.field651;
                                field804[var5++] = var439.field639;
                                field805[var6++] = var439.field644;
                            }
                            continue;
                        }
                        if (var455 == 6502) {
                            class26 var440;
                            if (class26.field638 < class26.field637) {
                                var440 = Statics.field636[++class26.field638 - 1];
                            } else {
                                var440 = null;
                            }
                            if (var440 == null) {
                                field804[var5++] = -1;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                                field804[var5++] = 0;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                            } else {
                                field804[var5++] = var440.field641;
                                field804[var5++] = var440.field642;
                                field805[var6++] = var440.field632;
                                field804[var5++] = var440.field651;
                                field804[var5++] = var440.field639;
                                field805[var6++] = var440.field644;
                            }
                            continue;
                        }
                        if (var455 == 6506) {
                            var5--;
                            int var442 = field804[var5];
                            class26 var443 = null;
                            for (int var444 = 0; var444 < class26.field637; var444++) {
                                if (Statics.field636[var444].field641 == var442) {
                                    var443 = Statics.field636[var444];
                                    break;
                                }
                            }
                            if (var443 == null) {
                                field804[var5++] = -1;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                                field804[var5++] = 0;
                                field804[var5++] = 0;
                                field805[var6++] = "";
                            } else {
                                field804[var5++] = var443.field641;
                                field804[var5++] = var443.field642;
                                field805[var6++] = var443.field632;
                                field804[var5++] = var443.field651;
                                field804[var5++] = var443.field639;
                                field805[var6++] = var443.field644;
                            }
                            continue;
                        }
                        if (var455 == 6507) {
                            var5 -= 4;
                            int var445 = field804[var5];
                            boolean var446 = field804[var5 + 1] == 1;
                            int var447 = field804[var5 + 2];
                            boolean var448 = field804[var5 + 3] == 1;
                            class26.method625(var445, var446, var447, var448);
                            continue;
                        }
                        if (var455 == 6511) {
                            var5--;
                            int var449 = field804[var5];
                            if (var449 >= 0 && var449 < class26.field637) {
                                class26 var450 = Statics.field636[var449];
                                field804[var5++] = var450.field641;
                                field804[var5++] = var450.field642;
                                field805[var6++] = var450.field632;
                                field804[var5++] = var450.field651;
                                field804[var5++] = var450.field639;
                                field805[var6++] = var450.field644;
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
                client.field344 = 250;
            }
        } catch (Exception var454) {
            StringBuilder var452 = new StringBuilder(30);
            var452.append("").append(var4.field3116).append(" ");
            for (int var453 = field818 - 1; var453 >= 0; var453--) {
                var452.append("").append(field807[var453].field214.field3116).append(" ");
            }
            var452.append("").append(var10);
            class149.method957(var452.toString(), var454);
        }
    }

    @ObfuscatedName("fe.u(II)V")
    public static void method2963(int arg0) {
        if (arg0 == -1 || !class174.method2723(arg0)) {
            return;
        }
        class174[] var1 = Statics.field2771[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174 var3 = var1[var2];
            if (var3.field2836 != null) {
                class1 var4 = new class1();
                var4.field2 = var3;
                var4.field1 = var3.field2836;
                method722(var4, 2000000);
            }
        }
    }
}
