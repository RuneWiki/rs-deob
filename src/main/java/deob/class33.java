package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ax")
public class class33 {

    @ObfuscatedName("ax.r")
    public static int[] field735 = new int[5];

    @ObfuscatedName("ax.a")
    public static int[][] field728 = new int[5][5000];

    @ObfuscatedName("ax.n")
    public static int[] field732 = new int[1000];

    @ObfuscatedName("ax.x")
    public static String[] field730 = new String[1000];

    @ObfuscatedName("ax.g")
    public static int field731 = 0;

    @ObfuscatedName("ax.o")
    public static class13[] field727 = new class13[50];

    @ObfuscatedName("ax.w")
    public static Calendar field734 = Calendar.getInstance();

    @ObfuscatedName("ax.t")
    public static final String[] field733 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.f(Lf;I)V")
    public static void method654(class1 arg0) {
        method548(arg0, 200000);
    }

    @ObfuscatedName("z.k(Lf;IB)V")
    public static void method548(class1 arg0, int arg1) {
        Object[] var2 = arg0.field7;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method2520(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field526;
        int[] var9 = var4.field529;
        byte var10 = -1;
        field731 = 0;
        try {
            Statics.field725 = new int[var4.field533];
            int var11 = 0;
            Statics.field726 = new String[var4.field531];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2551;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field2;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2552;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field12 == null ? -1 : arg0.field12.field2551;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field12 == null ? -1 : arg0.field12.field2552;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field725[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field726[var12++] = var15;
                }
            }
            int var16 = 0;
            label2835: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var454 = var8[var7];
                if (var454 < 100) {
                    if (var454 == 0) {
                        field732[var5++] = var9[var7];
                        continue;
                    }
                    if (var454 == 1) {
                        int var17 = var9[var7];
                        field732[var5++] = class157.field2680[var17];
                        continue;
                    }
                    if (var454 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class157.field2680[var18] = field732[var5];
                        client.method849(var18);
                        continue;
                    }
                    if (var454 == 3) {
                        field730[var6++] = var4.field530[var7];
                        continue;
                    }
                    if (var454 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var454 == 7) {
                        var5 -= 2;
                        if (field732[var5 + 1] != field732[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var454 == 8) {
                        var5 -= 2;
                        if (field732[var5 + 1] == field732[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var454 == 9) {
                        var5 -= 2;
                        if (field732[var5] < field732[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var454 == 10) {
                        var5 -= 2;
                        if (field732[var5] > field732[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var454 == 21) {
                        if (field731 == 0) {
                            return;
                        }
                        class13 var19 = field727[--field731];
                        var4 = var19.field186;
                        var8 = var4.field526;
                        var9 = var4.field529;
                        var7 = var19.field180;
                        Statics.field725 = var19.field181;
                        Statics.field726 = var19.field179;
                        continue;
                    }
                    if (var454 == 25) {
                        int var20 = var9[var7];
                        field732[var5++] = class157.method33(var20);
                        continue;
                    }
                    if (var454 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class157.method728(var21, field732[var5]);
                        continue;
                    }
                    if (var454 == 31) {
                        var5 -= 2;
                        if (field732[var5] <= field732[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var454 == 32) {
                        var5 -= 2;
                        if (field732[var5] >= field732[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var454 == 33) {
                        field732[var5++] = Statics.field725[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var454 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field725[var10001] = field732[var5];
                        continue;
                    }
                    if (var454 == 35) {
                        field730[var6++] = Statics.field726[var9[var7]];
                        continue;
                    }
                    if (var454 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field726[var10001] = field730[var6];
                        continue;
                    }
                    if (var454 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field730;
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
                        field730[var6++] = var24;
                        continue;
                    }
                    if (var454 == 38) {
                        var5--;
                        continue;
                    }
                    if (var454 == 39) {
                        var6--;
                        continue;
                    }
                    if (var454 == 40) {
                        int var34 = var9[var7];
                        class19 var35 = class19.method2520(var34);
                        int[] var36 = new int[var35.field533];
                        String[] var37 = new String[var35.field531];
                        for (int var38 = 0; var38 < var35.field532; var38++) {
                            var36[var38] = field732[var5 - var35.field532 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field527; var39++) {
                            var37[var39] = field730[var6 - var35.field527 + var39];
                        }
                        var5 -= var35.field532;
                        var6 -= var35.field527;
                        class13 var40 = new class13();
                        var40.field186 = var4;
                        var40.field180 = var7;
                        var40.field181 = Statics.field725;
                        var40.field179 = Statics.field726;
                        field727[++field731 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field526;
                        var9 = var35.field529;
                        var7 = -1;
                        Statics.field725 = var36;
                        Statics.field726 = var37;
                        continue;
                    }
                    if (var454 == 42) {
                        field732[var5++] = client.field449[var9[var7]];
                        continue;
                    }
                    if (var454 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field449[var10001] = field732[var5];
                        continue;
                    }
                    if (var454 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field732[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field735[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2835;
                                }
                                field728[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var454 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field732[var5];
                        if (var47 >= 0 && var47 < field735[var46]) {
                            field732[var5++] = field728[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var454 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field732[var5];
                        if (var49 >= 0 && var49 < field735[var48]) {
                            field728[var48][var49] = field732[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var454 == 47) {
                        String var50 = client.field450[var9[var7]];
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field730[var6++] = var50;
                        continue;
                    }
                    if (var454 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field450[var10001] = field730[var6];
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var454 < 1000) {
                    if (var454 == 100) {
                        var5 -= 3;
                        int var52 = field732[var5];
                        int var53 = field732[var5 + 1];
                        int var54 = field732[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class155 var55 = class155.method3191(var52);
                        if (var55.field2662 == null) {
                            var55.field2662 = new class155[var54 + 1];
                        }
                        if (var55.field2662.length <= var54) {
                            class155[] var56 = new class155[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2662.length; var57++) {
                                var56[var57] = var55.field2662[var57];
                            }
                            var55.field2662 = var56;
                        }
                        if (var54 > 0 && var55.field2662[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class155 var58 = new class155();
                        var58.field2570 = var53;
                        var58.field2562 = var58.field2551 = var55.field2551;
                        var58.field2552 = var54;
                        var58.field2603 = true;
                        var55.field2662[var54] = var58;
                        if (var51) {
                            Statics.field2936 = var58;
                        } else {
                            Statics.field516 = var58;
                        }
                        client.method2750(var55);
                        continue;
                    }
                    if (var454 == 101) {
                        class155 var59 = var51 ? Statics.field2936 : Statics.field516;
                        class155 var60 = class155.method3191(var59.field2551);
                        var60.field2662[var59.field2552] = null;
                        client.method2750(var60);
                        continue;
                    }
                    if (var454 == 102) {
                        var5--;
                        class155 var61 = class155.method3191(field732[var5]);
                        var61.field2662 = null;
                        client.method2750(var61);
                        continue;
                    }
                    if (var454 == 200) {
                        var5 -= 2;
                        int var62 = field732[var5];
                        int var63 = field732[var5 + 1];
                        class155 var64 = class155.method611(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field732[var5++] = 1;
                            if (var51) {
                                Statics.field2936 = var64;
                            } else {
                                Statics.field516 = var64;
                            }
                            continue;
                        }
                        field732[var5++] = 0;
                        continue;
                    }
                } else if (var454 >= 1000 && var454 < 1100 || var454 >= 2000 && var454 < 2100) {
                    class155 var65;
                    if (var454 >= 2000) {
                        var454 -= 1000;
                        var5--;
                        var65 = class155.method3191(field732[var5]);
                    } else {
                        var65 = var51 ? Statics.field2936 : Statics.field516;
                    }
                    if (var454 == 1000) {
                        var5 -= 2;
                        var65.field2569 = field732[var5];
                        var65.field2554 = field732[var5 + 1];
                        client.method2750(var65);
                        continue;
                    }
                    if (var454 == 1001) {
                        var5 -= 2;
                        var65.field2560 = field732[var5];
                        var65.field2567 = field732[var5 + 1];
                        client.method2750(var65);
                        continue;
                    }
                    if (var454 == 1003) {
                        var5--;
                        boolean var66 = field732[var5] == 1;
                        if (var65.field2563 != var66) {
                            var65.field2563 = var66;
                            client.method2750(var65);
                        }
                        continue;
                    }
                } else if (var454 >= 1100 && var454 < 1200 || var454 >= 2100 && var454 < 2200) {
                    class155 var67;
                    if (var454 >= 2000) {
                        var454 -= 1000;
                        var5--;
                        var67 = class155.method3191(field732[var5]);
                    } else {
                        var67 = var51 ? Statics.field2936 : Statics.field516;
                    }
                    if (var454 == 1100) {
                        var5 -= 2;
                        var67.field2564 = field732[var5];
                        if (var67.field2564 > var67.field2616 - var67.field2560) {
                            var67.field2564 = var67.field2616 - var67.field2560;
                        }
                        if (var67.field2564 < 0) {
                            var67.field2564 = 0;
                        }
                        var67.field2565 = field732[var5 + 1];
                        if (var67.field2565 > var67.field2587 - var67.field2567) {
                            var67.field2565 = var67.field2587 - var67.field2567;
                        }
                        if (var67.field2565 < 0) {
                            var67.field2565 = 0;
                        }
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1101) {
                        var5--;
                        var67.field2593 = field732[var5];
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1102) {
                        var5--;
                        var67.field2644 = field732[var5] == 1;
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1103) {
                        var5--;
                        var67.field2573 = field732[var5];
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1104) {
                        var5--;
                        var67.field2574 = field732[var5];
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1105) {
                        var5--;
                        var67.field2575 = field732[var5];
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1106) {
                        var5--;
                        var67.field2577 = field732[var5];
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1107) {
                        var5--;
                        var67.field2578 = field732[var5] == 1;
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1108) {
                        var67.field2557 = 1;
                        var5--;
                        var67.field2548 = field732[var5];
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1109) {
                        var5 -= 6;
                        var67.field2589 = field732[var5];
                        var67.field2602 = field732[var5 + 1];
                        var67.field2591 = field732[var5 + 2];
                        var67.field2549 = field732[var5 + 3];
                        var67.field2584 = field732[var5 + 4];
                        var67.field2594 = field732[var5 + 5];
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1110) {
                        var5--;
                        int var68 = field732[var5];
                        if (var67.field2547 != var68) {
                            var67.field2547 = var68;
                            var67.field2660 = 0;
                            var67.field2661 = 0;
                            client.method2750(var67);
                        }
                        continue;
                    }
                    if (var454 == 1111) {
                        var5--;
                        var67.field2596 = field732[var5] == 1;
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1112) {
                        var6--;
                        String var69 = field730[var6];
                        if (!var69.equals(var67.field2599)) {
                            var67.field2599 = var69;
                            client.method2750(var67);
                        }
                        continue;
                    }
                    if (var454 == 1113) {
                        var5--;
                        var67.field2598 = field732[var5];
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1114) {
                        var5 -= 3;
                        var67.field2635 = field732[var5];
                        var67.field2600 = field732[var5 + 1];
                        var67.field2601 = field732[var5 + 2];
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1115) {
                        var5--;
                        var67.field2617 = field732[var5] == 1;
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1116) {
                        var5--;
                        var67.field2579 = field732[var5];
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1117) {
                        var5--;
                        var67.field2580 = field732[var5];
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1118) {
                        var5--;
                        var67.field2581 = field732[var5] == 1;
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1119) {
                        var5--;
                        var67.field2590 = field732[var5] == 1;
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1120) {
                        var5 -= 2;
                        var67.field2616 = field732[var5];
                        var67.field2587 = field732[var5 + 1];
                        client.method2750(var67);
                        continue;
                    }
                    if (var454 == 1121) {
                        int var70 = var67.field2551;
                        int var71 = var67.field2552;
                        client.field291.method2406(138);
                        client.field291.method2145(var71);
                        client.field291.method2197(var70);
                        client.field416 = var67;
                        client.method2750(var67);
                        continue;
                    }
                } else if (!(var454 < 1200 || var454 >= 1300) || !(var454 < 2200 || var454 >= 2300)) {
                    class155 var72;
                    if (var454 >= 2000) {
                        var454 -= 1000;
                        var5--;
                        var72 = class155.method3191(field732[var5]);
                    } else {
                        var72 = var51 ? Statics.field2936 : Statics.field516;
                    }
                    client.method2750(var72);
                    if (var454 == 1200 || var454 == 1205 || var454 == 1212) {
                        var5 -= 2;
                        int var73 = field732[var5];
                        int var74 = field732[var5 + 1];
                        var72.field2658 = var73;
                        var72.field2659 = var74;
                        class46 var75 = class46.method515(var73);
                        var72.field2591 = var75.field1036;
                        var72.field2549 = var75.field1055;
                        var72.field2584 = var75.field1021;
                        var72.field2589 = var75.field1039;
                        var72.field2602 = var75.field1040;
                        var72.field2594 = var75.field1035;
                        if (var454 == 1205) {
                            var72.field2597 = 0;
                        } else if (var454 == 1212 | var75.field1041 == 1) {
                            var72.field2597 = 1;
                        } else {
                            var72.field2597 = 2;
                        }
                        if (var72.field2560 > 0) {
                            var72.field2594 = var72.field2594 * 32 / var72.field2560;
                        }
                        continue;
                    }
                    if (var454 == 1201) {
                        var72.field2557 = 2;
                        var5--;
                        var72.field2548 = field732[var5];
                        continue;
                    }
                    if (var454 == 1202) {
                        var72.field2557 = 3;
                        var72.field2548 = Statics.field377.field26.method2974();
                        continue;
                    }
                } else if (var454 >= 1300 && var454 < 1400 || var454 >= 2300 && var454 < 2400) {
                    class155 var76;
                    if (var454 >= 2000) {
                        var454 -= 1000;
                        var5--;
                        var76 = class155.method3191(field732[var5]);
                    } else {
                        var76 = var51 ? Statics.field2936 : Statics.field516;
                    }
                    if (var454 == 1300) {
                        var5--;
                        int var77 = field732[var5] - 1;
                        if (var77 >= 0 && var77 <= 9) {
                            var6--;
                            var76.method2896(var77, field730[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var454 == 1301) {
                        var5 -= 2;
                        int var78 = field732[var5];
                        int var79 = field732[var5 + 1];
                        var76.field2614 = class155.method611(var78, var79);
                        continue;
                    }
                    if (var454 == 1302) {
                        var5--;
                        var76.field2625 = field732[var5] == 1;
                        continue;
                    }
                    if (var454 == 1303) {
                        var5--;
                        var76.field2615 = field732[var5];
                        continue;
                    }
                    if (var454 == 1304) {
                        var5--;
                        var76.field2553 = field732[var5];
                        continue;
                    }
                    if (var454 == 1305) {
                        var6--;
                        var76.field2612 = field730[var6];
                        continue;
                    }
                    if (var454 == 1306) {
                        var6--;
                        var76.field2550 = field730[var6];
                        continue;
                    }
                    if (var454 == 1307) {
                        var76.field2646 = null;
                        continue;
                    }
                } else {
                    if (var454 >= 1400 && var454 < 1500 || var454 >= 2400 && var454 < 2500) {
                        class155 var80;
                        if (var454 >= 2000) {
                            var454 -= 1000;
                            var5--;
                            var80 = class155.method3191(field732[var5]);
                        } else {
                            var80 = var51 ? Statics.field2936 : Statics.field516;
                        }
                        var6--;
                        String var81 = field730[var6];
                        int[] var82 = null;
                        if (var81.length() > 0 && var81.charAt(var81.length() - 1) == 'Y') {
                            var5--;
                            int var83 = field732[var5];
                            if (var83 > 0) {
                                var82 = new int[var83];
                                while (var83-- > 0) {
                                    var5--;
                                    var82[var83] = field732[var5];
                                }
                            }
                            var81 = var81.substring(0, var81.length() - 1);
                        }
                        Object[] var84 = new Object[var81.length() + 1];
                        for (int var85 = var84.length - 1; var85 >= 1; var85--) {
                            if (var81.charAt(var85 - 1) == 's') {
                                var6--;
                                var84[var85] = field730[var6];
                            } else {
                                var5--;
                                var84[var85] = Integer.valueOf(field732[var5]);
                            }
                        }
                        var5--;
                        int var86 = field732[var5];
                        if (var86 == -1) {
                            var84 = null;
                        } else {
                            var84[0] = Integer.valueOf(var86);
                        }
                        if (var454 == 1400) {
                            var80.field2621 = var84;
                        }
                        if (var454 == 1401) {
                            var80.field2624 = var84;
                        }
                        if (var454 == 1402) {
                            var80.field2623 = var84;
                        }
                        if (var454 == 1403) {
                            var80.field2556 = var84;
                        }
                        if (var454 == 1404) {
                            var80.field2638 = var84;
                        }
                        if (var454 == 1405) {
                            var80.field2656 = var84;
                        }
                        if (var454 == 1406) {
                            var80.field2631 = var84;
                        }
                        if (var454 == 1407) {
                            var80.field2650 = var84;
                            var80.field2633 = var82;
                        }
                        if (var454 == 1408) {
                            var80.field2542 = var84;
                        }
                        if (var454 == 1409) {
                            var80.field2639 = var84;
                        }
                        if (var454 == 1410) {
                            var80.field2583 = var84;
                        }
                        if (var454 == 1411) {
                            var80.field2632 = var84;
                        }
                        if (var454 == 1412) {
                            var80.field2626 = var84;
                        }
                        if (var454 == 1414) {
                            var80.field2582 = var84;
                            var80.field2671 = var82;
                        }
                        if (var454 == 1415) {
                            var80.field2636 = var84;
                            var80.field2637 = var82;
                        }
                        if (var454 == 1416) {
                            var80.field2586 = var84;
                        }
                        if (var454 == 1417) {
                            var80.field2640 = var84;
                        }
                        if (var454 == 1418) {
                            var80.field2641 = var84;
                        }
                        if (var454 == 1419) {
                            var80.field2642 = var84;
                        }
                        if (var454 == 1420) {
                            var80.field2545 = var84;
                        }
                        if (var454 == 1421) {
                            var80.field2595 = var84;
                        }
                        if (var454 == 1422) {
                            var80.field2645 = var84;
                        }
                        if (var454 == 1423) {
                            var80.field2618 = var84;
                        }
                        if (var454 == 1424) {
                            var80.field2647 = var84;
                        }
                        if (var454 == 1425) {
                            var80.field2648 = var84;
                        }
                        if (var454 == 1426) {
                            var80.field2649 = var84;
                        }
                        var80.field2619 = true;
                        continue;
                    }
                    if (var454 < 1600) {
                        class155 var87 = var51 ? Statics.field2936 : Statics.field516;
                        if (var454 == 1500) {
                            field732[var5++] = var87.field2569;
                            continue;
                        }
                        if (var454 == 1501) {
                            field732[var5++] = var87.field2554;
                            continue;
                        }
                        if (var454 == 1502) {
                            field732[var5++] = var87.field2560;
                            continue;
                        }
                        if (var454 == 1503) {
                            field732[var5++] = var87.field2567;
                            continue;
                        }
                        if (var454 == 1504) {
                            field732[var5++] = var87.field2563 ? 1 : 0;
                            continue;
                        }
                        if (var454 == 1505) {
                            field732[var5++] = var87.field2562;
                            continue;
                        }
                    } else if (var454 < 1700) {
                        class155 var88 = var51 ? Statics.field2936 : Statics.field516;
                        if (var454 == 1600) {
                            field732[var5++] = var88.field2564;
                            continue;
                        }
                        if (var454 == 1601) {
                            field732[var5++] = var88.field2565;
                            continue;
                        }
                        if (var454 == 1602) {
                            field730[var6++] = var88.field2599;
                            continue;
                        }
                        if (var454 == 1603) {
                            field732[var5++] = var88.field2616;
                            continue;
                        }
                        if (var454 == 1604) {
                            field732[var5++] = var88.field2587;
                            continue;
                        }
                        if (var454 == 1605) {
                            field732[var5++] = var88.field2594;
                            continue;
                        }
                        if (var454 == 1606) {
                            field732[var5++] = var88.field2591;
                            continue;
                        }
                        if (var454 == 1607) {
                            field732[var5++] = var88.field2584;
                            continue;
                        }
                        if (var454 == 1608) {
                            field732[var5++] = var88.field2549;
                            continue;
                        }
                    } else if (var454 < 1800) {
                        class155 var89 = var51 ? Statics.field2936 : Statics.field516;
                        if (var454 == 1700) {
                            field732[var5++] = var89.field2658;
                            continue;
                        }
                        if (var454 == 1701) {
                            if (var89.field2658 == -1) {
                                field732[var5++] = 0;
                            } else {
                                field732[var5++] = var89.field2659;
                            }
                            continue;
                        }
                        if (var454 == 1702) {
                            field732[var5++] = var89.field2552;
                            continue;
                        }
                    } else if (var454 < 1900) {
                        class155 var90 = var51 ? Statics.field2936 : Statics.field516;
                        if (var454 == 1800) {
                            int[] var91 = field732;
                            int var92 = var5++;
                            int var93 = client.method38(var90);
                            int var94 = var93 >> 11 & 0x3F;
                            var91[var92] = var94;
                            continue;
                        }
                        if (var454 == 1801) {
                            var5--;
                            int var95 = field732[var5];
                            int var455 = var95 - 1;
                            if (var90.field2646 != null && var455 < var90.field2646.length && var90.field2646[var455] != null) {
                                field730[var6++] = var90.field2646[var455];
                                continue;
                            }
                            field730[var6++] = "";
                            continue;
                        }
                        if (var454 == 1802) {
                            if (var90.field2612 == null) {
                                field730[var6++] = "";
                            } else {
                                field730[var6++] = var90.field2612;
                            }
                            continue;
                        }
                    } else if (var454 < 2600) {
                        var5--;
                        class155 var96 = class155.method3191(field732[var5]);
                        if (var454 == 2500) {
                            field732[var5++] = var96.field2569;
                            continue;
                        }
                        if (var454 == 2501) {
                            field732[var5++] = var96.field2554;
                            continue;
                        }
                        if (var454 == 2502) {
                            field732[var5++] = var96.field2560;
                            continue;
                        }
                        if (var454 == 2503) {
                            field732[var5++] = var96.field2567;
                            continue;
                        }
                        if (var454 == 2504) {
                            field732[var5++] = var96.field2563 ? 1 : 0;
                            continue;
                        }
                        if (var454 == 2505) {
                            field732[var5++] = var96.field2562;
                            continue;
                        }
                    } else if (var454 < 2700) {
                        var5--;
                        class155 var97 = class155.method3191(field732[var5]);
                        if (var454 == 2600) {
                            field732[var5++] = var97.field2564;
                            continue;
                        }
                        if (var454 == 2601) {
                            field732[var5++] = var97.field2565;
                            continue;
                        }
                        if (var454 == 2602) {
                            field730[var6++] = var97.field2599;
                            continue;
                        }
                        if (var454 == 2603) {
                            field732[var5++] = var97.field2616;
                            continue;
                        }
                        if (var454 == 2604) {
                            field732[var5++] = var97.field2587;
                            continue;
                        }
                        if (var454 == 2605) {
                            field732[var5++] = var97.field2594;
                            continue;
                        }
                        if (var454 == 2606) {
                            field732[var5++] = var97.field2591;
                            continue;
                        }
                        if (var454 == 2607) {
                            field732[var5++] = var97.field2584;
                            continue;
                        }
                        if (var454 == 2608) {
                            field732[var5++] = var97.field2549;
                            continue;
                        }
                    } else if (var454 < 2800) {
                        if (var454 == 2700) {
                            var5--;
                            class155 var98 = class155.method3191(field732[var5]);
                            field732[var5++] = var98.field2658;
                            continue;
                        }
                        if (var454 == 2701) {
                            var5--;
                            class155 var99 = class155.method3191(field732[var5]);
                            if (var99.field2658 == -1) {
                                field732[var5++] = 0;
                            } else {
                                field732[var5++] = var99.field2659;
                            }
                            continue;
                        }
                        if (var454 == 2702) {
                            var5--;
                            int var100 = field732[var5];
                            class4 var101 = (class4) client.field413.method3244((long) var100);
                            if (var101 == null) {
                                field732[var5++] = 0;
                            } else {
                                field732[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var454 < 2900) {
                        var5--;
                        class155 var102 = class155.method3191(field732[var5]);
                        if (var454 == 2800) {
                            int[] var103 = field732;
                            int var104 = var5++;
                            int var105 = client.method38(var102);
                            int var106 = var105 >> 11 & 0x3F;
                            var103[var104] = var106;
                            continue;
                        }
                        if (var454 == 2801) {
                            var5--;
                            int var107 = field732[var5];
                            int var456 = var107 - 1;
                            if (var102.field2646 != null && var456 < var102.field2646.length && var102.field2646[var456] != null) {
                                field730[var6++] = var102.field2646[var456];
                                continue;
                            }
                            field730[var6++] = "";
                            continue;
                        }
                        if (var454 == 2802) {
                            if (var102.field2612 == null) {
                                field730[var6++] = "";
                            } else {
                                field730[var6++] = var102.field2612;
                            }
                            continue;
                        }
                    } else if (var454 < 3200) {
                        if (var454 == 3100) {
                            var6--;
                            String var108 = field730[var6];
                            class10.method2441(0, "", var108);
                            continue;
                        }
                        if (var454 == 3101) {
                            var5 -= 2;
                            client.method2497(Statics.field377, field732[var5], field732[var5 + 1]);
                            continue;
                        }
                        if (var454 == 3103) {
                            client.method509();
                            continue;
                        }
                        if (var454 == 3104) {
                            var6--;
                            String var109 = field730[var6];
                            int var110 = 0;
                            boolean var111 = false;
                            boolean var112 = false;
                            int var113 = 0;
                            int var114 = var109.length();
                            int var115 = 0;
                            boolean var117;
                            while (true) {
                                if (var115 >= var114) {
                                    var117 = var112;
                                    break;
                                }
                                label3076: {
                                    char var116 = var109.charAt(var115);
                                    if (var115 == 0) {
                                        if (var116 == '-') {
                                            var111 = true;
                                            break label3076;
                                        }
                                        if (var116 == '+') {
                                            break label3076;
                                        }
                                    }
                                    int var457;
                                    if (var116 >= '0' && var116 <= '9') {
                                        var457 = var116 - '0';
                                    } else if (var116 >= 'A' && var116 <= 'Z') {
                                        var457 = var116 - '7';
                                    } else {
                                        if (var116 < 'a' || var116 > 'z') {
                                            var117 = false;
                                            break;
                                        }
                                        var457 = var116 - 'W';
                                    }
                                    if (var457 >= 10) {
                                        var117 = false;
                                        break;
                                    }
                                    if (var111) {
                                        var457 = -var457;
                                    }
                                    int var118 = var113 * 10 + var457;
                                    if (var118 / 10 != var113) {
                                        var117 = false;
                                        break;
                                    }
                                    var113 = var118;
                                    var112 = true;
                                }
                                var115++;
                            }
                            if (var117) {
                                int var120 = class211.method98(var109, 10, true);
                                var110 = var120;
                            }
                            client.field291.method2406(87);
                            client.field291.method2147(var110);
                            continue;
                        }
                        if (var454 == 3105) {
                            var6--;
                            String var121 = field730[var6];
                            client.field291.method2406(57);
                            client.field291.method2144(var121.length() + 1);
                            client.field291.method2149(var121);
                            continue;
                        }
                        if (var454 == 3106) {
                            var6--;
                            String var122 = field730[var6];
                            client.field291.method2406(165);
                            client.field291.method2144(var122.length() + 1);
                            client.field291.method2149(var122);
                            continue;
                        }
                        if (var454 == 3107) {
                            var5--;
                            int var123 = field732[var5];
                            var6--;
                            String var124 = field730[var6];
                            boolean var125 = false;
                            for (int var126 = 0; var126 < client.field412; var126++) {
                                class3 var127 = client.field369[client.field371[var126]];
                                if (var127 != null && var127.field46 != null && var127.field46.equalsIgnoreCase(var124)) {
                                    if (var123 == 1) {
                                        client.field291.method2406(58);
                                        client.field291.method2180(0);
                                        client.field291.method2145(client.field371[var126]);
                                    } else if (var123 == 4) {
                                        client.field291.method2406(151);
                                        client.field291.method2291(client.field371[var126]);
                                        client.field291.method2144(0);
                                    } else if (var123 == 6) {
                                        client.field291.method2406(59);
                                        client.field291.method2291(client.field371[var126]);
                                        client.field291.method2179(0);
                                    } else if (var123 == 7) {
                                        client.field291.method2406(145);
                                        client.field291.method2257(client.field371[var126]);
                                        client.field291.method2179(0);
                                    }
                                    var125 = true;
                                    break;
                                }
                            }
                            if (!var125) {
                                class10.method2441(4, "", class145.field2319 + var124);
                            }
                            continue;
                        }
                        if (var454 == 3108) {
                            var5 -= 3;
                            int var128 = field732[var5];
                            int var129 = field732[var5 + 1];
                            int var130 = field732[var5 + 2];
                            class155 var131 = class155.method3191(var130);
                            client.method619(var131, var128, var129);
                            continue;
                        }
                        if (var454 == 3109) {
                            var5 -= 2;
                            int var132 = field732[var5];
                            int var133 = field732[var5 + 1];
                            class155 var134 = var51 ? Statics.field2936 : Statics.field516;
                            client.method619(var134, var132, var133);
                            continue;
                        }
                        if (var454 == 3110) {
                            var5--;
                            Statics.field1264 = field732[var5] == 1;
                            continue;
                        }
                        if (var454 == 3111) {
                            field732[var5++] = Statics.field184.field132 ? 1 : 0;
                            continue;
                        }
                        if (var454 == 3112) {
                            var5--;
                            Statics.field184.field132 = field732[var5] == 1;
                            class9.method2715();
                            continue;
                        }
                        if (var454 == 3113) {
                            var6--;
                            String var135 = field730[var6];
                            var5--;
                            boolean var136 = field732[var5] == 1;
                            class127.method1644(var135, var136, "openjs", false);
                            continue;
                        }
                        if (var454 == 3115) {
                            var5--;
                            int var137 = field732[var5];
                            client.field291.method2406(205);
                            client.field291.method2145(var137);
                            continue;
                        }
                    } else if (var454 < 3300) {
                        if (var454 == 3200) {
                            var5 -= 3;
                            int var138 = field732[var5];
                            int var139 = field732[var5 + 1];
                            int var140 = field732[var5 + 2];
                            if (client.field489 != 0 && var139 != 0 && client.field492 < 50) {
                                client.field352[client.field492] = var138;
                                client.field494[client.field492] = var139;
                                client.field409[client.field492] = var140;
                                client.field497[client.field492] = null;
                                client.field496[client.field492] = 0;
                                client.field492++;
                            }
                            continue;
                        }
                        if (var454 == 3201) {
                            var5--;
                            client.method34(field732[var5]);
                            continue;
                        }
                        if (var454 == 3202) {
                            var5 -= 2;
                            int var141 = field732[var5];
                            int var10000 = field732[var5 + 1];
                            if (client.field479 != 0 && var141 != -1) {
                                class164.method118(Statics.field1889, var141, 0, client.field479, false);
                                client.field488 = true;
                            }
                            continue;
                        }
                    } else if (var454 < 3400) {
                        if (var454 == 3300) {
                            field732[var5++] = client.field372;
                            continue;
                        }
                        if (var454 == 3301) {
                            var5 -= 2;
                            int var143 = field732[var5];
                            int var144 = field732[var5 + 1];
                            field732[var5++] = class14.method479(var143, var144);
                            continue;
                        }
                        if (var454 == 3302) {
                            var5 -= 2;
                            int var145 = field732[var5];
                            int var146 = field732[var5 + 1];
                            field732[var5++] = class14.method2503(var145, var146);
                            continue;
                        }
                        if (var454 == 3303) {
                            var5 -= 2;
                            int var147 = field732[var5];
                            int var148 = field732[var5 + 1];
                            int[] var149 = field732;
                            int var150 = var5++;
                            class14 var151 = (class14) class14.field199.method3244((long) var147);
                            int var152;
                            if (var151 == null) {
                                var152 = 0;
                            } else if (var148 == -1) {
                                var152 = 0;
                            } else {
                                int var153 = 0;
                                for (int var154 = 0; var154 < var151.field190.length; var154++) {
                                    if (var151.field189[var154] == var148) {
                                        var153 += var151.field190[var154];
                                    }
                                }
                                var152 = var153;
                            }
                            var149[var150] = var152;
                            continue;
                        }
                        if (var454 == 3304) {
                            var5--;
                            int var155 = field732[var5];
                            int[] var156 = field732;
                            int var157 = var5++;
                            class45 var158 = (class45) class45.field1014.method3207((long) var155);
                            class45 var159;
                            if (var158 == null) {
                                byte[] var160 = Statics.field1018.method2763(5, var155);
                                class45 var161 = new class45();
                                if (var160 != null) {
                                    var161.method876(new class108(var160));
                                }
                                class45.field1014.method3209(var161, (long) var155);
                                var159 = var161;
                            } else {
                                var159 = var158;
                            }
                            var156[var157] = var159.field1016;
                            continue;
                        }
                        if (var454 == 3305) {
                            var5--;
                            int var162 = field732[var5];
                            field732[var5++] = client.field389[var162];
                            continue;
                        }
                        if (var454 == 3306) {
                            var5--;
                            int var163 = field732[var5];
                            field732[var5++] = client.field390[var163];
                            continue;
                        }
                        if (var454 == 3307) {
                            var5--;
                            int var164 = field732[var5];
                            field732[var5++] = client.field458[var164];
                            continue;
                        }
                        if (var454 == 3308) {
                            int var165 = Statics.field999;
                            int var166 = (Statics.field377.field789 >> 7) + Statics.field140;
                            int var167 = (Statics.field377.field754 >> 7) + Statics.field737;
                            field732[var5++] = (var165 << 28) + (var166 << 14) + var167;
                            continue;
                        }
                        if (var454 == 3309) {
                            var5--;
                            int var168 = field732[var5];
                            field732[var5++] = var168 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var454 == 3310) {
                            var5--;
                            int var169 = field732[var5];
                            field732[var5++] = var169 >> 28;
                            continue;
                        }
                        if (var454 == 3311) {
                            var5--;
                            int var170 = field732[var5];
                            field732[var5++] = var170 & 0x3FFF;
                            continue;
                        }
                        if (var454 == 3312) {
                            field732[var5++] = client.field250 ? 1 : 0;
                            continue;
                        }
                        if (var454 == 3313) {
                            var5 -= 2;
                            int var171 = field732[var5] + 32768;
                            int var172 = field732[var5 + 1];
                            field732[var5++] = class14.method479(var171, var172);
                            continue;
                        }
                        if (var454 == 3314) {
                            var5 -= 2;
                            int var173 = field732[var5] + 32768;
                            int var174 = field732[var5 + 1];
                            field732[var5++] = class14.method2503(var173, var174);
                            continue;
                        }
                        if (var454 == 3315) {
                            var5 -= 2;
                            int var175 = field732[var5] + 32768;
                            int var176 = field732[var5 + 1];
                            int[] var177 = field732;
                            int var178 = var5++;
                            class14 var179 = (class14) class14.field199.method3244((long) var175);
                            int var180;
                            if (var179 == null) {
                                var180 = 0;
                            } else if (var176 == -1) {
                                var180 = 0;
                            } else {
                                int var181 = 0;
                                for (int var182 = 0; var182 < var179.field190.length; var182++) {
                                    if (var179.field189[var182] == var176) {
                                        var181 += var179.field190[var182];
                                    }
                                }
                                var180 = var181;
                            }
                            var177[var178] = var180;
                            continue;
                        }
                        if (var454 == 3316) {
                            if (client.field419 >= 2) {
                                field732[var5++] = client.field419;
                            } else {
                                field732[var5++] = 0;
                            }
                            continue;
                        }
                        if (var454 == 3317) {
                            field732[var5++] = client.field493;
                            continue;
                        }
                        if (var454 == 3318) {
                            field732[var5++] = client.field253;
                            continue;
                        }
                        if (var454 == 3321) {
                            field732[var5++] = client.field417;
                            continue;
                        }
                        if (var454 == 3322) {
                            field732[var5++] = client.field418;
                            continue;
                        }
                        if (var454 == 3323) {
                            if (client.field421) {
                                field732[var5++] = 1;
                            } else {
                                field732[var5++] = 0;
                            }
                            continue;
                        }
                        if (var454 == 3324) {
                            field732[var5++] = client.field254;
                            continue;
                        }
                    } else if (var454 < 3500) {
                        if (var454 == 3400) {
                            var5 -= 2;
                            int var183 = field732[var5];
                            int var184 = field732[var5 + 1];
                            class44 var185 = (class44) class44.field1013.method3207((long) var183);
                            class44 var186;
                            if (var185 == null) {
                                byte[] var187 = Statics.field2683.method2763(8, var183);
                                class44 var188 = new class44();
                                if (var187 != null) {
                                    var188.method866(new class108(var187));
                                }
                                class44.field1013.method3209(var188, (long) var183);
                                var186 = var188;
                            } else {
                                var186 = var185;
                            }
                            class44 var189 = var186;
                            if (var186.field1004 != 's') {
                            }
                            for (int var190 = 0; var190 < var189.field1007; var190++) {
                                if (var189.field1008[var190] == var184) {
                                    field730[var6++] = var189.field1010[var190];
                                    var189 = null;
                                    break;
                                }
                            }
                            if (var189 != null) {
                                field730[var6++] = var189.field1005;
                            }
                            continue;
                        }
                        if (var454 == 3408) {
                            var5 -= 4;
                            int var191 = field732[var5];
                            int var192 = field732[var5 + 1];
                            int var193 = field732[var5 + 2];
                            int var194 = field732[var5 + 3];
                            class44 var195 = (class44) class44.field1013.method3207((long) var193);
                            class44 var196;
                            if (var195 == null) {
                                byte[] var197 = Statics.field2683.method2763(8, var193);
                                class44 var198 = new class44();
                                if (var197 != null) {
                                    var198.method866(new class108(var197));
                                }
                                class44.field1013.method3209(var198, (long) var193);
                                var196 = var198;
                            } else {
                                var196 = var195;
                            }
                            class44 var199 = var196;
                            if (var196.field1011 == var191 && var196.field1004 == var192) {
                                for (int var200 = 0; var200 < var199.field1007; var200++) {
                                    if (var199.field1008[var200] == var194) {
                                        if (var192 == 115) {
                                            field730[var6++] = var199.field1010[var200];
                                        } else {
                                            field732[var5++] = var199.field1009[var200];
                                        }
                                        var199 = null;
                                        break;
                                    }
                                }
                                if (var199 != null) {
                                    if (var192 == 115) {
                                        field730[var6++] = var199.field1005;
                                    } else {
                                        field732[var5++] = var199.field1006;
                                    }
                                }
                                continue;
                            }
                            if (var192 == 115) {
                                field730[var6++] = "null";
                            } else {
                                field732[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var454 < 3700) {
                        if (var454 == 3600) {
                            if (client.field505 == 0) {
                                field732[var5++] = -2;
                            } else if (client.field505 == 1) {
                                field732[var5++] = -1;
                            } else {
                                field732[var5++] = client.field396;
                            }
                            continue;
                        }
                        if (var454 == 3601) {
                            var5--;
                            int var201 = field732[var5];
                            if (client.field505 == 2 && var201 < client.field396) {
                                field730[var6++] = client.field277[var201].field221;
                                field730[var6++] = client.field277[var201].field227;
                                continue;
                            }
                            field730[var6++] = "";
                            field730[var6++] = "";
                            continue;
                        }
                        if (var454 == 3602) {
                            var5--;
                            int var202 = field732[var5];
                            if (client.field505 == 2 && var202 < client.field396) {
                                field732[var5++] = client.field277[var202].field222;
                                continue;
                            }
                            field732[var5++] = 0;
                            continue;
                        }
                        if (var454 == 3603) {
                            var5--;
                            int var203 = field732[var5];
                            if (client.field505 == 2 && var203 < client.field396) {
                                field732[var5++] = client.field277[var203].field223;
                                continue;
                            }
                            field732[var5++] = 0;
                            continue;
                        }
                        if (var454 == 3604) {
                            var6--;
                            String var204 = field730[var6];
                            var5--;
                            int var205 = field732[var5];
                            client.method2001(var204, var205);
                            continue;
                        }
                        if (var454 == 3605) {
                            var6--;
                            String var206 = field730[var6];
                            client.method3018(var206);
                            continue;
                        }
                        if (var454 == 3606) {
                            var6--;
                            String var207 = field730[var6];
                            client.method1919(var207);
                            continue;
                        }
                        if (var454 == 3607) {
                            var6--;
                            String var208 = field730[var6];
                            client.method493(var208, false);
                            continue;
                        }
                        if (var454 == 3608) {
                            var6--;
                            String var209 = field730[var6];
                            if (var209 == null) {
                                continue;
                            }
                            String var210 = class212.method2741(var209, Statics.field2060);
                            if (var210 == null) {
                                continue;
                            }
                            int var211 = 0;
                            while (true) {
                                if (var211 >= client.field403) {
                                    continue label2835;
                                }
                                class8 var212 = client.field509[var211];
                                String var213 = var212.field126;
                                String var214 = class212.method2741(var213, Statics.field2060);
                                if (class118.method2447(var209, var210, var213, var214)) {
                                    client.field403--;
                                    for (int var215 = var211; var215 < client.field403; var215++) {
                                        client.field509[var215] = client.field509[var215 + 1];
                                    }
                                    client.field444 = client.field495;
                                    client.field291.method2406(53);
                                    client.field291.method2144(class108.method480(var209));
                                    client.field291.method2149(var209);
                                    continue label2835;
                                }
                                var211++;
                            }
                        }
                        if (var454 == 3609) {
                            var6--;
                            String var216 = field730[var6];
                            class140[] var217 = new class140[] { class140.field2132, class140.field2126, class140.field2128, class140.field2127, class140.field2129 };
                            class140[] var218 = var217;
                            for (int var219 = 0; var219 < var218.length; var219++) {
                                class140 var220 = var218[var219];
                                if (var220.field2135 != -1 && var216.startsWith(class2.method1918(var220.field2135))) {
                                    var216 = var216.substring(6 + Integer.toString(var220.field2135).length());
                                    break;
                                }
                            }
                            field732[var5++] = client.method606(var216, false) ? 1 : 0;
                            continue;
                        }
                        if (var454 == 3611) {
                            if (client.field476 == null) {
                                field730[var6++] = "";
                            } else {
                                String[] var221 = field730;
                                int var222 = var6++;
                                String var223 = client.field476;
                                String var224 = class210.method2399(class210.method2451(var223));
                                if (var224 == null) {
                                    var224 = "";
                                }
                                var221[var222] = var224;
                            }
                            continue;
                        }
                        if (var454 == 3612) {
                            if (client.field476 == null) {
                                field732[var5++] = 0;
                            } else {
                                field732[var5++] = Statics.field704;
                            }
                            continue;
                        }
                        if (var454 == 3613) {
                            var5--;
                            int var226 = field732[var5];
                            if (client.field476 != null && var226 < Statics.field704) {
                                field730[var6++] = Statics.field1684[var226].field575;
                                continue;
                            }
                            field730[var6++] = "";
                            continue;
                        }
                        if (var454 == 3614) {
                            var5--;
                            int var227 = field732[var5];
                            if (client.field476 != null && var227 < Statics.field704) {
                                field732[var5++] = Statics.field1684[var227].field579;
                                continue;
                            }
                            field732[var5++] = 0;
                            continue;
                        }
                        if (var454 == 3615) {
                            var5--;
                            int var228 = field732[var5];
                            if (client.field476 != null && var228 < Statics.field704) {
                                field732[var5++] = Statics.field1684[var228].field570;
                                continue;
                            }
                            field732[var5++] = 0;
                            continue;
                        }
                        if (var454 == 3616) {
                            field732[var5++] = Statics.field710;
                            continue;
                        }
                        if (var454 == 3617) {
                            var6--;
                            String var229 = field730[var6];
                            client.method3204(var229);
                            continue;
                        }
                        if (var454 == 3618) {
                            field732[var5++] = Statics.field127;
                            continue;
                        }
                        if (var454 == 3619) {
                            var6--;
                            String var230 = field730[var6];
                            client.method2840(var230);
                            continue;
                        }
                        if (var454 == 3620) {
                            Statics.method1649();
                            continue;
                        }
                        if (var454 == 3621) {
                            if (client.field505 == 0) {
                                field732[var5++] = -1;
                            } else {
                                field732[var5++] = client.field403;
                            }
                            continue;
                        }
                        if (var454 == 3622) {
                            var5--;
                            int var231 = field732[var5];
                            if (client.field505 != 0 && var231 < client.field403) {
                                field730[var6++] = client.field509[var231].field126;
                                field730[var6++] = client.field509[var231].field124;
                                continue;
                            }
                            field730[var6++] = "";
                            field730[var6++] = "";
                            continue;
                        }
                        if (var454 == 3623) {
                            var6--;
                            String var232 = field730[var6];
                            if (var232.startsWith(class2.method1918(0)) || var232.startsWith(class2.method1918(1))) {
                                var232 = var232.substring(7);
                            }
                            field732[var5++] = Statics.method32(var232) ? 1 : 0;
                            continue;
                        }
                        if (var454 == 3624) {
                            var5--;
                            int var233 = field732[var5];
                            if (Statics.field1684 != null && var233 < Statics.field704 && Statics.field1684[var233].field575.equalsIgnoreCase(Statics.field377.field46)) {
                                field732[var5++] = 1;
                                continue;
                            }
                            field732[var5++] = 0;
                            continue;
                        }
                        if (var454 == 3625) {
                            if (client.field477 == null) {
                                field730[var6++] = "";
                            } else {
                                String[] var234 = field730;
                                int var235 = var6++;
                                String var236 = client.field477;
                                String var237 = class210.method2399(class210.method2451(var236));
                                if (var237 == null) {
                                    var237 = "";
                                }
                                var234[var235] = var237;
                            }
                            continue;
                        }
                    } else if (var454 < 4000) {
                        if (var454 == 3903) {
                            var5--;
                            int var239 = field732[var5];
                            field732[var5++] = client.field513[var239].method3439();
                            continue;
                        }
                        if (var454 == 3904) {
                            var5--;
                            int var240 = field732[var5];
                            field732[var5++] = client.field513[var240].field2933;
                            continue;
                        }
                        if (var454 == 3905) {
                            var5--;
                            int var241 = field732[var5];
                            field732[var5++] = client.field513[var241].field2934;
                            continue;
                        }
                        if (var454 == 3906) {
                            var5--;
                            int var242 = field732[var5];
                            field732[var5++] = client.field513[var242].field2935;
                            continue;
                        }
                        if (var454 == 3907) {
                            var5--;
                            int var243 = field732[var5];
                            field732[var5++] = client.field513[var243].field2932;
                            continue;
                        }
                        if (var454 == 3908) {
                            var5--;
                            int var244 = field732[var5];
                            field732[var5++] = client.field513[var244].field2937;
                            continue;
                        }
                        if (var454 == 3910) {
                            var5--;
                            int var245 = field732[var5];
                            int var246 = client.field513[var245].method3438();
                            field732[var5++] = var246 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var454 == 3911) {
                            var5--;
                            int var247 = field732[var5];
                            int var248 = client.field513[var247].method3438();
                            field732[var5++] = var248 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var454 == 3912) {
                            var5--;
                            int var249 = field732[var5];
                            int var250 = client.field513[var249].method3438();
                            field732[var5++] = var250 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var454 == 3913) {
                            var5--;
                            int var251 = field732[var5];
                            int var252 = client.field513[var251].method3438();
                            field732[var5++] = var252 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var454 == 3914) {
                            var5--;
                            boolean var253 = field732[var5] == 1;
                            if (Statics.field621 != null) {
                                Statics.field621.method3450(class202.field2946, var253);
                            }
                            continue;
                        }
                        if (var454 == 3915) {
                            var5--;
                            boolean var254 = field732[var5] == 1;
                            if (Statics.field621 != null) {
                                Statics.field621.method3450(class202.field2944, var254);
                            }
                            continue;
                        }
                        if (var454 == 3916) {
                            var5 -= 2;
                            boolean var255 = field732[var5] == 1;
                            boolean var256 = field732[var5 + 1] == 1;
                            if (Statics.field621 != null) {
                                Statics.field621.method3450(new class20(var256), var255);
                            }
                            continue;
                        }
                        if (var454 == 3917) {
                            var5--;
                            boolean var257 = field732[var5] == 1;
                            if (Statics.field621 != null) {
                                Statics.field621.method3450(class202.field2948, var257);
                            }
                            continue;
                        }
                        if (var454 == 3918) {
                            var5--;
                            boolean var258 = field732[var5] == 1;
                            if (Statics.field621 != null) {
                                Statics.field621.method3450(class202.field2947, var258);
                            }
                            continue;
                        }
                        if (var454 == 3919) {
                            field732[var5++] = Statics.field621 == null ? 0 : Statics.field621.field2943.size();
                            continue;
                        }
                        if (var454 == 3920) {
                            var5--;
                            int var259 = field732[var5];
                            class195 var260 = (class195) Statics.field621.field2943.get(var259);
                            field732[var5++] = var260.field2910;
                            continue;
                        }
                        if (var454 == 3921) {
                            var5--;
                            int var261 = field732[var5];
                            class195 var262 = (class195) Statics.field621.field2943.get(var261);
                            field730[var6++] = var262.method3405();
                            continue;
                        }
                        if (var454 == 3922) {
                            var5--;
                            int var263 = field732[var5];
                            class195 var264 = (class195) Statics.field621.field2943.get(var263);
                            field730[var6++] = var264.method3403();
                            continue;
                        }
                        if (var454 == 3923) {
                            var5--;
                            int var265 = field732[var5];
                            class195 var266 = (class195) Statics.field621.field2943.get(var265);
                            long var267 = class104.method1417() - Statics.field547 - var266.field2911;
                            int var269 = (int) (var267 / 3600000L);
                            int var270 = (int) ((var267 - (long) (var269 * 3600000)) / 60000L);
                            int var271 = (int) ((var267 - (long) (var269 * 3600000) - (long) (var270 * 60000)) / 1000L);
                            String var272 = var269 + ":" + var270 / 10 + var270 % 10 + ":" + var271 / 10 + var271 % 10;
                            field730[var6++] = var272;
                            continue;
                        }
                        if (var454 == 3924) {
                            var5--;
                            int var273 = field732[var5];
                            class195 var274 = (class195) Statics.field621.field2943.get(var273);
                            field732[var5++] = var274.field2912.field2935;
                            continue;
                        }
                        if (var454 == 3925) {
                            var5--;
                            int var275 = field732[var5];
                            class195 var276 = (class195) Statics.field621.field2943.get(var275);
                            field732[var5++] = var276.field2912.field2934;
                            continue;
                        }
                        if (var454 == 3926) {
                            var5--;
                            int var277 = field732[var5];
                            class195 var278 = (class195) Statics.field621.field2943.get(var277);
                            field732[var5++] = var278.field2912.field2933;
                            continue;
                        }
                    } else if (var454 < 4100) {
                        if (var454 == 4000) {
                            var5 -= 2;
                            int var279 = field732[var5];
                            int var280 = field732[var5 + 1];
                            field732[var5++] = var279 + var280;
                            continue;
                        }
                        if (var454 == 4001) {
                            var5 -= 2;
                            int var281 = field732[var5];
                            int var282 = field732[var5 + 1];
                            field732[var5++] = var281 - var282;
                            continue;
                        }
                        if (var454 == 4002) {
                            var5 -= 2;
                            int var283 = field732[var5];
                            int var284 = field732[var5 + 1];
                            field732[var5++] = var283 * var284;
                            continue;
                        }
                        if (var454 == 4003) {
                            var5 -= 2;
                            int var285 = field732[var5];
                            int var286 = field732[var5 + 1];
                            field732[var5++] = var285 / var286;
                            continue;
                        }
                        if (var454 == 4004) {
                            var5--;
                            int var287 = field732[var5];
                            field732[var5++] = (int) (Math.random() * (double) var287);
                            continue;
                        }
                        if (var454 == 4005) {
                            var5--;
                            int var288 = field732[var5];
                            field732[var5++] = (int) (Math.random() * (double) (var288 + 1));
                            continue;
                        }
                        if (var454 == 4006) {
                            var5 -= 5;
                            int var289 = field732[var5];
                            int var290 = field732[var5 + 1];
                            int var291 = field732[var5 + 2];
                            int var292 = field732[var5 + 3];
                            int var293 = field732[var5 + 4];
                            field732[var5++] = (var290 - var289) * (var293 - var291) / (var292 - var291) + var289;
                            continue;
                        }
                        if (var454 == 4007) {
                            var5 -= 2;
                            int var294 = field732[var5];
                            int var295 = field732[var5 + 1];
                            field732[var5++] = var294 * var295 / 100 + var294;
                            continue;
                        }
                        if (var454 == 4008) {
                            var5 -= 2;
                            int var296 = field732[var5];
                            int var297 = field732[var5 + 1];
                            field732[var5++] = var296 | 0x1 << var297;
                            continue;
                        }
                        if (var454 == 4009) {
                            var5 -= 2;
                            int var298 = field732[var5];
                            int var299 = field732[var5 + 1];
                            field732[var5++] = var298 & -1 - (0x1 << var299);
                            continue;
                        }
                        if (var454 == 4010) {
                            var5 -= 2;
                            int var300 = field732[var5];
                            int var301 = field732[var5 + 1];
                            field732[var5++] = (var300 & 0x1 << var301) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var454 == 4011) {
                            var5 -= 2;
                            int var302 = field732[var5];
                            int var303 = field732[var5 + 1];
                            field732[var5++] = var302 % var303;
                            continue;
                        }
                        if (var454 == 4012) {
                            var5 -= 2;
                            int var304 = field732[var5];
                            int var305 = field732[var5 + 1];
                            if (var304 == 0) {
                                field732[var5++] = 0;
                            } else {
                                field732[var5++] = (int) Math.pow((double) var304, (double) var305);
                            }
                            continue;
                        }
                        if (var454 == 4013) {
                            var5 -= 2;
                            int var306 = field732[var5];
                            int var307 = field732[var5 + 1];
                            if (var306 == 0) {
                                field732[var5++] = 0;
                            } else if (var307 == 0) {
                                field732[var5++] = Integer.MAX_VALUE;
                            } else {
                                field732[var5++] = (int) Math.pow((double) var306, 1.0D / (double) var307);
                            }
                            continue;
                        }
                        if (var454 == 4014) {
                            var5 -= 2;
                            int var308 = field732[var5];
                            int var309 = field732[var5 + 1];
                            field732[var5++] = var308 & var309;
                            continue;
                        }
                        if (var454 == 4015) {
                            var5 -= 2;
                            int var310 = field732[var5];
                            int var311 = field732[var5 + 1];
                            field732[var5++] = var310 | var311;
                            continue;
                        }
                    } else if (var454 < 4200) {
                        if (var454 == 4100) {
                            var6--;
                            String var312 = field730[var6];
                            var5--;
                            int var313 = field732[var5];
                            field730[var6++] = var312 + var313;
                            continue;
                        }
                        if (var454 == 4101) {
                            var6 -= 2;
                            String var314 = field730[var6];
                            String var315 = field730[var6 + 1];
                            field730[var6++] = var314 + var315;
                            continue;
                        }
                        if (var454 == 4102) {
                            var6--;
                            String var316 = field730[var6];
                            var5--;
                            int var317 = field732[var5];
                            String[] var318 = field730;
                            int var319 = var6++;
                            String var321;
                            if (var317 < 0) {
                                var321 = Integer.toString(var317);
                            } else {
                                int var322 = var317;
                                String var323;
                                if (var317 < 0) {
                                    var323 = Integer.toString(var317, 10);
                                } else {
                                    int var324 = 2;
                                    int var325 = var317 / 10;
                                    while (var325 != 0) {
                                        var325 /= 10;
                                        var324++;
                                    }
                                    char[] var326 = new char[var324];
                                    var326[0] = '+';
                                    for (int var327 = var324 - 1; var327 > 0; var327--) {
                                        int var328 = var322;
                                        var322 /= 10;
                                        int var329 = var328 - var322 * 10;
                                        if (var329 >= 10) {
                                            var326[var327] = (char) (var329 + 87);
                                        } else {
                                            var326[var327] = (char) (var329 + 48);
                                        }
                                    }
                                    var323 = new String(var326);
                                }
                                var321 = var323;
                            }
                            var318[var319] = var316 + var321;
                            continue;
                        }
                        if (var454 == 4103) {
                            var6--;
                            String var330 = field730[var6];
                            field730[var6++] = var330.toLowerCase();
                            continue;
                        }
                        if (var454 == 4104) {
                            var5--;
                            int var331 = field732[var5];
                            long var332 = ((long) var331 + 11745L) * 86400000L;
                            field734.setTime(new Date(var332));
                            int var334 = field734.get(5);
                            int var335 = field734.get(2);
                            int var336 = field734.get(1);
                            field730[var6++] = var334 + "-" + field733[var335] + "-" + var336;
                            continue;
                        }
                        if (var454 == 4105) {
                            var6 -= 2;
                            String var337 = field730[var6];
                            String var338 = field730[var6 + 1];
                            if (Statics.field377.field26 != null && Statics.field377.field26.field2689) {
                                field730[var6++] = var338;
                                continue;
                            }
                            field730[var6++] = var337;
                            continue;
                        }
                        if (var454 == 4106) {
                            var5--;
                            int var339 = field732[var5];
                            field730[var6++] = Integer.toString(var339);
                            continue;
                        }
                        if (var454 == 4107) {
                            var6 -= 2;
                            field732[var5++] = class211.method483(class214.method2002(field730[var6], field730[var6 + 1], client.field333));
                            continue;
                        }
                        if (var454 == 4108) {
                            var6--;
                            String var340 = field730[var6];
                            var5 -= 2;
                            int var341 = field732[var5];
                            int var342 = field732[var5 + 1];
                            byte[] var343 = Statics.field123.method2763(var342, 0);
                            class205 var344 = new class205(var343);
                            field732[var5++] = var344.method3533(var340, var341);
                            continue;
                        }
                        if (var454 == 4109) {
                            var6--;
                            String var345 = field730[var6];
                            var5 -= 2;
                            int var346 = field732[var5];
                            int var347 = field732[var5 + 1];
                            byte[] var348 = Statics.field123.method2763(var347, 0);
                            class205 var349 = new class205(var348);
                            field732[var5++] = var349.method3461(var345, var346);
                            continue;
                        }
                        if (var454 == 4110) {
                            var6 -= 2;
                            String var350 = field730[var6];
                            String var351 = field730[var6 + 1];
                            var5--;
                            if (field732[var5] == 1) {
                                field730[var6++] = var350;
                            } else {
                                field730[var6++] = var351;
                            }
                            continue;
                        }
                        if (var454 == 4111) {
                            var6--;
                            String var352 = field730[var6];
                            field730[var6++] = class204.method3463(var352);
                            continue;
                        }
                        if (var454 == 4112) {
                            var6--;
                            String var353 = field730[var6];
                            var5--;
                            int var354 = field732[var5];
                            field730[var6++] = var353 + (char) var354;
                            continue;
                        }
                        if (var454 == 4113) {
                            var5--;
                            int var355 = field732[var5];
                            field732[var5++] = class211.method2449((char) var355) ? 1 : 0;
                            continue;
                        }
                        if (var454 == 4114) {
                            var5--;
                            int var356 = field732[var5];
                            field732[var5++] = class211.method169((char) var356) ? 1 : 0;
                            continue;
                        }
                        if (var454 == 4115) {
                            var5--;
                            int var357 = field732[var5];
                            field732[var5++] = class211.method3411((char) var357) ? 1 : 0;
                            continue;
                        }
                        if (var454 == 4116) {
                            var5--;
                            int var358 = field732[var5];
                            int[] var359 = field732;
                            int var360 = var5++;
                            char var361 = (char) var358;
                            boolean var362 = var361 >= '0' && var361 <= '9';
                            var359[var360] = var362 ? 1 : 0;
                            continue;
                        }
                        if (var454 == 4117) {
                            var6--;
                            String var363 = field730[var6];
                            if (var363 == null) {
                                field732[var5++] = 0;
                            } else {
                                field732[var5++] = var363.length();
                            }
                            continue;
                        }
                        if (var454 == 4118) {
                            var6--;
                            String var364 = field730[var6];
                            var5 -= 2;
                            int var365 = field732[var5];
                            int var366 = field732[var5 + 1];
                            field730[var6++] = var364.substring(var365, var366);
                            continue;
                        }
                        if (var454 == 4119) {
                            var6--;
                            String var367 = field730[var6];
                            StringBuilder var368 = new StringBuilder(var367.length());
                            boolean var369 = false;
                            for (int var370 = 0; var370 < var367.length(); var370++) {
                                char var371 = var367.charAt(var370);
                                if (var371 == '<') {
                                    var369 = true;
                                } else if (var371 == '>') {
                                    var369 = false;
                                } else if (!var369) {
                                    var368.append(var371);
                                }
                            }
                            field730[var6++] = var368.toString();
                            continue;
                        }
                        if (var454 == 4120) {
                            var6--;
                            String var372 = field730[var6];
                            var5--;
                            int var373 = field732[var5];
                            field732[var5++] = var372.indexOf(var373);
                            continue;
                        }
                        if (var454 == 4121) {
                            var6 -= 2;
                            String var374 = field730[var6];
                            String var375 = field730[var6 + 1];
                            var5--;
                            int var376 = field732[var5];
                            field732[var5++] = var374.indexOf(var375, var376);
                            continue;
                        }
                    } else if (var454 < 4300) {
                        if (var454 == 4200) {
                            var5--;
                            int var377 = field732[var5];
                            field730[var6++] = class46.method515(var377).field1030;
                            continue;
                        }
                        if (var454 == 4201) {
                            var5 -= 2;
                            int var378 = field732[var5];
                            int var379 = field732[var5 + 1];
                            class46 var380 = class46.method515(var378);
                            if (var379 >= 1 && var379 <= 5 && var380.field1024[var379 - 1] != null) {
                                field730[var6++] = var380.field1024[var379 - 1];
                                continue;
                            }
                            field730[var6++] = "";
                            continue;
                        }
                        if (var454 == 4202) {
                            var5 -= 2;
                            int var381 = field732[var5];
                            int var382 = field732[var5 + 1];
                            class46 var383 = class46.method515(var381);
                            if (var382 >= 1 && var382 <= 5 && var383.field1069[var382 - 1] != null) {
                                field730[var6++] = var383.field1069[var382 - 1];
                                continue;
                            }
                            field730[var6++] = "";
                            continue;
                        }
                        if (var454 == 4203) {
                            var5--;
                            int var384 = field732[var5];
                            field732[var5++] = class46.method515(var384).field1042;
                            continue;
                        }
                        if (var454 == 4204) {
                            var5--;
                            int var385 = field732[var5];
                            field732[var5++] = class46.method515(var385).field1041 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var454 == 4205) {
                            var5--;
                            int var386 = field732[var5];
                            class46 var387 = class46.method515(var386);
                            if (var387.field1061 == -1 && var387.field1048 >= 0) {
                                field732[var5++] = var387.field1048;
                                continue;
                            }
                            field732[var5++] = var386;
                            continue;
                        }
                        if (var454 == 4206) {
                            var5--;
                            int var388 = field732[var5];
                            class46 var389 = class46.method515(var388);
                            if (var389.field1061 >= 0 && var389.field1048 >= 0) {
                                field732[var5++] = var389.field1048;
                                continue;
                            }
                            field732[var5++] = var388;
                            continue;
                        }
                        if (var454 == 4207) {
                            var5--;
                            int var390 = field732[var5];
                            field732[var5++] = class46.method515(var390).field1043 ? 1 : 0;
                            continue;
                        }
                        if (var454 == 4210) {
                            var6--;
                            String var391 = field730[var6];
                            var5--;
                            int var392 = field732[var5];
                            boolean var394 = var392 == 1;
                            Statics.field2729.field2485 = false;
                            String var395 = var391.toLowerCase();
                            short[] var396 = new short[16];
                            int var397 = 0;
                            int var398 = 0;
                            while (true) {
                                if (var398 >= Statics.field1028) {
                                    Statics.field722 = var396;
                                    Statics.field52 = 0;
                                    Statics.field81 = var397;
                                    String[] var402 = new String[Statics.field81];
                                    for (int var403 = 0; var403 < Statics.field81; var403++) {
                                        var402[var403] = class46.method515(var396[var403]).field1030;
                                    }
                                    class113.method501(var402, Statics.field722);
                                    Statics.field2729.method2799();
                                    Statics.field2729.field2485 = true;
                                    break;
                                }
                                class46 var399 = class46.method515(var398);
                                if ((!var394 || var399.field1068) && var399.field1061 == -1 && var399.field1030.toLowerCase().indexOf(var395) != -1) {
                                    if (var397 >= 250) {
                                        Statics.field81 = -1;
                                        Statics.field722 = null;
                                        break;
                                    }
                                    if (var397 >= var396.length) {
                                        short[] var400 = new short[var396.length * 2];
                                        for (int var401 = 0; var401 < var397; var401++) {
                                            var400[var401] = var396[var401];
                                        }
                                        var396 = var400;
                                    }
                                    var396[var397++] = (short) var398;
                                }
                                var398++;
                            }
                            field732[var5++] = Statics.field81;
                            continue;
                        }
                        if (var454 == 4211) {
                            if (Statics.field722 != null && Statics.field52 < Statics.field81) {
                                field732[var5++] = Statics.field722[++Statics.field52 - 1] & 0xFFFF;
                                continue;
                            }
                            field732[var5++] = -1;
                            continue;
                        }
                        if (var454 == 4212) {
                            Statics.field52 = 0;
                            continue;
                        }
                    } else if (var454 < 5100) {
                        if (var454 == 5000) {
                            field732[var5++] = client.field407;
                            continue;
                        }
                        if (var454 == 5001) {
                            var5 -= 3;
                            client.field407 = field732[var5];
                            Statics.field22 = class119.method182(field732[var5 + 1]);
                            if (Statics.field22 == null) {
                                Statics.field22 = class119.field1926;
                            }
                            client.field466 = field732[var5 + 2];
                            client.field291.method2406(2);
                            client.field291.method2144(client.field407);
                            client.field291.method2144(Statics.field22.field1928);
                            client.field291.method2144(client.field466);
                            continue;
                        }
                        if (var454 == 5002) {
                            var6--;
                            String var404 = field730[var6];
                            var5 -= 2;
                            int var405 = field732[var5];
                            int var406 = field732[var5 + 1];
                            client.field291.method2406(236);
                            client.field291.method2144(class108.method480(var404) + 2);
                            client.field291.method2149(var404);
                            client.field291.method2144(var405 - 1);
                            client.field291.method2144(var406);
                            continue;
                        }
                        if (var454 == 5003) {
                            var5 -= 2;
                            int var407 = field732[var5];
                            int var408 = field732[var5 + 1];
                            class32 var409 = class10.method495(var407, var408);
                            if (var409 == null) {
                                field732[var5++] = -1;
                                field732[var5++] = 0;
                                field730[var6++] = "";
                                field730[var6++] = "";
                                field730[var6++] = "";
                            } else {
                                field732[var5++] = var409.field714;
                                field732[var5++] = var409.field715;
                                field730[var6++] = var409.field716 == null ? "" : var409.field716;
                                field730[var6++] = var409.field717 == null ? "" : var409.field717;
                                field730[var6++] = var409.field719 == null ? "" : var409.field719;
                            }
                            continue;
                        }
                        if (var454 == 5004) {
                            var5--;
                            int var410 = field732[var5];
                            class32 var411 = (class32) class10.field144.method3261((long) var410);
                            if (var411 == null) {
                                field732[var5++] = -1;
                                field732[var5++] = 0;
                                field730[var6++] = "";
                                field730[var6++] = "";
                                field730[var6++] = "";
                            } else {
                                field732[var5++] = var411.field721;
                                field732[var5++] = var411.field715;
                                field730[var6++] = var411.field716 == null ? "" : var411.field716;
                                field730[var6++] = var411.field717 == null ? "" : var411.field717;
                                field730[var6++] = var411.field719 == null ? "" : var411.field719;
                            }
                            continue;
                        }
                        if (var454 == 5005) {
                            if (Statics.field22 == null) {
                                field732[var5++] = -1;
                            } else {
                                field732[var5++] = Statics.field22.field1928;
                            }
                            continue;
                        }
                        if (var454 == 5008) {
                            var6--;
                            String var413 = field730[var6];
                            var5--;
                            int var414 = field732[var5];
                            String var415 = var413.toLowerCase();
                            byte var416 = 0;
                            if (var415.startsWith(class145.field2346)) {
                                var416 = 0;
                                var413 = var413.substring(class145.field2346.length());
                            } else if (var415.startsWith(class145.field2348)) {
                                var416 = 1;
                                var413 = var413.substring(class145.field2348.length());
                            } else if (var415.startsWith(class145.field2350)) {
                                var416 = 2;
                                var413 = var413.substring(class145.field2350.length());
                            } else if (var415.startsWith(class145.field2352)) {
                                var416 = 3;
                                var413 = var413.substring(class145.field2352.length());
                            } else if (var415.startsWith(class145.field2295)) {
                                var416 = 4;
                                var413 = var413.substring(class145.field2295.length());
                            } else if (var415.startsWith(class145.field2356)) {
                                var416 = 5;
                                var413 = var413.substring(class145.field2356.length());
                            } else if (var415.startsWith(class145.field2358)) {
                                var416 = 6;
                                var413 = var413.substring(class145.field2358.length());
                            } else if (var415.startsWith(class145.field2360)) {
                                var416 = 7;
                                var413 = var413.substring(class145.field2360.length());
                            } else if (var415.startsWith(class145.field2210)) {
                                var416 = 8;
                                var413 = var413.substring(class145.field2210.length());
                            } else if (var415.startsWith(class145.field2263)) {
                                var416 = 9;
                                var413 = var413.substring(class145.field2263.length());
                            } else if (var415.startsWith(class145.field2366)) {
                                var416 = 10;
                                var413 = var413.substring(class145.field2366.length());
                            } else if (var415.startsWith(class145.field2368)) {
                                var416 = 11;
                                var413 = var413.substring(class145.field2368.length());
                            } else if (client.field333 != 0) {
                                if (var415.startsWith(class145.field2347)) {
                                    var416 = 0;
                                    var413 = var413.substring(class145.field2347.length());
                                } else if (var415.startsWith(class145.field2349)) {
                                    var416 = 1;
                                    var413 = var413.substring(class145.field2349.length());
                                } else if (var415.startsWith(class145.field2351)) {
                                    var416 = 2;
                                    var413 = var413.substring(class145.field2351.length());
                                } else if (var415.startsWith(class145.field2255)) {
                                    var416 = 3;
                                    var413 = var413.substring(class145.field2255.length());
                                } else if (var415.startsWith(class145.field2242)) {
                                    var416 = 4;
                                    var413 = var413.substring(class145.field2242.length());
                                } else if (var415.startsWith(class145.field2382)) {
                                    var416 = 5;
                                    var413 = var413.substring(class145.field2382.length());
                                } else if (var415.startsWith(class145.field2251)) {
                                    var416 = 6;
                                    var413 = var413.substring(class145.field2251.length());
                                } else if (var415.startsWith(class145.field2314)) {
                                    var416 = 7;
                                    var413 = var413.substring(class145.field2314.length());
                                } else if (var415.startsWith(class145.field2363)) {
                                    var416 = 8;
                                    var413 = var413.substring(class145.field2363.length());
                                } else if (var415.startsWith(class145.field2365)) {
                                    var416 = 9;
                                    var413 = var413.substring(class145.field2365.length());
                                } else if (var415.startsWith(class145.field2294)) {
                                    var416 = 10;
                                    var413 = var413.substring(class145.field2294.length());
                                } else if (var415.startsWith(class145.field2396)) {
                                    var416 = 11;
                                    var413 = var413.substring(class145.field2396.length());
                                }
                            }
                            String var417 = var413.toLowerCase();
                            byte var418 = 0;
                            if (var417.startsWith(class145.field2201)) {
                                var418 = 1;
                                var413 = var413.substring(class145.field2201.length());
                            } else if (var417.startsWith(class145.field2372)) {
                                var418 = 2;
                                var413 = var413.substring(class145.field2372.length());
                            } else if (var417.startsWith(class145.field2374)) {
                                var418 = 3;
                                var413 = var413.substring(class145.field2374.length());
                            } else if (var417.startsWith(class145.field2386)) {
                                var418 = 4;
                                var413 = var413.substring(class145.field2386.length());
                            } else if (var417.startsWith(class145.field2231)) {
                                var418 = 5;
                                var413 = var413.substring(class145.field2231.length());
                            } else if (client.field333 != 0) {
                                if (var417.startsWith(class145.field2390)) {
                                    var418 = 1;
                                    var413 = var413.substring(class145.field2390.length());
                                } else if (var417.startsWith(class145.field2373)) {
                                    var418 = 2;
                                    var413 = var413.substring(class145.field2373.length());
                                } else if (var417.startsWith(class145.field2375)) {
                                    var418 = 3;
                                    var413 = var413.substring(class145.field2375.length());
                                } else if (var417.startsWith(class145.field2243)) {
                                    var418 = 4;
                                    var413 = var413.substring(class145.field2243.length());
                                } else if (var417.startsWith(class145.field2379)) {
                                    var418 = 5;
                                    var413 = var413.substring(class145.field2379.length());
                                }
                            }
                            client.field291.method2406(252);
                            client.field291.method2144(0);
                            int var419 = client.field291.field1859;
                            client.field291.method2144(var414);
                            client.field291.method2144(var416);
                            client.field291.method2144(var418);
                            class111 var420 = client.field291;
                            int var421 = var420.field1859;
                            int var422 = var413.length();
                            byte[] var423 = new byte[var422];
                            for (int var424 = 0; var424 < var422; var424++) {
                                char var425 = var413.charAt(var424);
                                if (var425 > 0 && var425 < 128 || var425 >= 160 && var425 <= 255) {
                                    var423[var424] = (byte) var425;
                                } else if (var425 == 8364) {
                                    var423[var424] = -128;
                                } else if (var425 == 8218) {
                                    var423[var424] = -126;
                                } else if (var425 == 402) {
                                    var423[var424] = -125;
                                } else if (var425 == 8222) {
                                    var423[var424] = -124;
                                } else if (var425 == 8230) {
                                    var423[var424] = -123;
                                } else if (var425 == 8224) {
                                    var423[var424] = -122;
                                } else if (var425 == 8225) {
                                    var423[var424] = -121;
                                } else if (var425 == 710) {
                                    var423[var424] = -120;
                                } else if (var425 == 8240) {
                                    var423[var424] = -119;
                                } else if (var425 == 352) {
                                    var423[var424] = -118;
                                } else if (var425 == 8249) {
                                    var423[var424] = -117;
                                } else if (var425 == 338) {
                                    var423[var424] = -116;
                                } else if (var425 == 381) {
                                    var423[var424] = -114;
                                } else if (var425 == 8216) {
                                    var423[var424] = -111;
                                } else if (var425 == 8217) {
                                    var423[var424] = -110;
                                } else if (var425 == 8220) {
                                    var423[var424] = -109;
                                } else if (var425 == 8221) {
                                    var423[var424] = -108;
                                } else if (var425 == 8226) {
                                    var423[var424] = -107;
                                } else if (var425 == 8211) {
                                    var423[var424] = -106;
                                } else if (var425 == 8212) {
                                    var423[var424] = -105;
                                } else if (var425 == 732) {
                                    var423[var424] = -104;
                                } else if (var425 == 8482) {
                                    var423[var424] = -103;
                                } else if (var425 == 353) {
                                    var423[var424] = -102;
                                } else if (var425 == 8250) {
                                    var423[var424] = -101;
                                } else if (var425 == 339) {
                                    var423[var424] = -100;
                                } else if (var425 == 382) {
                                    var423[var424] = -98;
                                } else if (var425 == 376) {
                                    var423[var424] = -97;
                                } else {
                                    var423[var424] = 63;
                                }
                            }
                            var420.method2156(var423.length);
                            var420.field1859 += Statics.field2950.method2090(var423, 0, var423.length, var420.field1854, var420.field1859);
                            client.field291.method2354(client.field291.field1859 - var419);
                            continue;
                        }
                        if (var454 == 5009) {
                            var6 -= 2;
                            String var428 = field730[var6];
                            String var429 = field730[var6 + 1];
                            client.field291.method2406(244);
                            client.field291.method2145(0);
                            int var430 = client.field291.field1859;
                            client.field291.method2149(var428);
                            class111 var431 = client.field291;
                            int var432 = var431.field1859;
                            int var433 = var429.length();
                            byte[] var434 = new byte[var433];
                            for (int var435 = 0; var435 < var433; var435++) {
                                char var436 = var429.charAt(var435);
                                if (!(var436 <= 0 || var436 >= 128) || !(var436 < 160 || var436 > 255)) {
                                    var434[var435] = (byte) var436;
                                } else if (var436 == 8364) {
                                    var434[var435] = -128;
                                } else if (var436 == 8218) {
                                    var434[var435] = -126;
                                } else if (var436 == 402) {
                                    var434[var435] = -125;
                                } else if (var436 == 8222) {
                                    var434[var435] = -124;
                                } else if (var436 == 8230) {
                                    var434[var435] = -123;
                                } else if (var436 == 8224) {
                                    var434[var435] = -122;
                                } else if (var436 == 8225) {
                                    var434[var435] = -121;
                                } else if (var436 == 710) {
                                    var434[var435] = -120;
                                } else if (var436 == 8240) {
                                    var434[var435] = -119;
                                } else if (var436 == 352) {
                                    var434[var435] = -118;
                                } else if (var436 == 8249) {
                                    var434[var435] = -117;
                                } else if (var436 == 338) {
                                    var434[var435] = -116;
                                } else if (var436 == 381) {
                                    var434[var435] = -114;
                                } else if (var436 == 8216) {
                                    var434[var435] = -111;
                                } else if (var436 == 8217) {
                                    var434[var435] = -110;
                                } else if (var436 == 8220) {
                                    var434[var435] = -109;
                                } else if (var436 == 8221) {
                                    var434[var435] = -108;
                                } else if (var436 == 8226) {
                                    var434[var435] = -107;
                                } else if (var436 == 8211) {
                                    var434[var435] = -106;
                                } else if (var436 == 8212) {
                                    var434[var435] = -105;
                                } else if (var436 == 732) {
                                    var434[var435] = -104;
                                } else if (var436 == 8482) {
                                    var434[var435] = -103;
                                } else if (var436 == 353) {
                                    var434[var435] = -102;
                                } else if (var436 == 8250) {
                                    var434[var435] = -101;
                                } else if (var436 == 339) {
                                    var434[var435] = -100;
                                } else if (var436 == 382) {
                                    var434[var435] = -98;
                                } else if (var436 == 376) {
                                    var434[var435] = -97;
                                } else {
                                    var434[var435] = 63;
                                }
                            }
                            var431.method2156(var434.length);
                            var431.field1859 += Statics.field2950.method2090(var434, 0, var434.length, var431.field1854, var431.field1859);
                            client.field291.method2154(client.field291.field1859 - var430);
                            continue;
                        }
                        if (var454 == 5015) {
                            String var439;
                            if (Statics.field377 == null || Statics.field377.field46 == null) {
                                var439 = "";
                            } else {
                                var439 = Statics.field377.field46;
                            }
                            field730[var6++] = var439;
                            continue;
                        }
                        if (var454 == 5016) {
                            field732[var5++] = client.field466;
                            continue;
                        }
                        if (var454 == 5017) {
                            var5--;
                            int var440 = field732[var5];
                            field732[var5++] = class10.method52(var440);
                            continue;
                        }
                        if (var454 == 5018) {
                            var5--;
                            int var441 = field732[var5];
                            int[] var442 = field732;
                            int var443 = var5++;
                            class32 var444 = (class32) class10.field144.method3261((long) var441);
                            int var445;
                            if (var444 == null) {
                                var445 = -1;
                            } else if (class10.field145.field2868 == var444.field2873) {
                                var445 = -1;
                            } else {
                                var445 = ((class32) var444.field2873).field714;
                            }
                            var442[var443] = var445;
                            continue;
                        }
                        if (var454 == 5019) {
                            var5--;
                            int var446 = field732[var5];
                            field732[var5++] = class10.method474(var446);
                            continue;
                        }
                        if (var454 == 5020) {
                            var6--;
                            String var447 = field730[var6];
                            client.method3595(var447);
                            continue;
                        }
                        if (var454 == 5021) {
                            var6--;
                            client.field469 = field730[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var454 == 5022) {
                            field730[var6++] = client.field469;
                            continue;
                        }
                    }
                }
                if (var454 >= 5600 || var454 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var448 = field732[var5];
                int var449 = field732[var5 + 1];
                if (!client.field288) {
                    client.field339 = var448;
                    client.field262 = var449;
                }
            }
        } catch (Exception var453) {
            StringBuilder var451 = new StringBuilder(30);
            var451.append("").append(var4.field2882).append(" ");
            for (int var452 = field731 - 1; var452 >= 0; var452--) {
                var451.append("").append(field727[var452].field186.field2882).append(" ");
            }
            var451.append("").append(var10);
            class137.method94(var451.toString(), var453);
        }
    }

    @ObfuscatedName("aw.y(IB)V")
    public static void method607(int arg0) {
        if (arg0 == -1 || !class155.method2108(arg0)) {
            return;
        }
        class155[] var1 = Statics.field2653[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class155 var3 = var1[var2];
            if (var3.field2620 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field7 = var3.field2620;
                method548(var4, 2000000);
            }
        }
    }
}
