package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("av")
public class class32 {

    @ObfuscatedName("av.m")
    public static int[] field719 = new int[5];

    @ObfuscatedName("av.j")
    public static int[][] field727 = new int[5][5000];

    @ObfuscatedName("av.g")
    public static int[] field721 = new int[1000];

    @ObfuscatedName("av.p")
    public static String[] field716 = new String[1000];

    @ObfuscatedName("av.o")
    public static int field723 = 0;

    @ObfuscatedName("av.b")
    public static class13[] field720 = new class13[50];

    @ObfuscatedName("av.d")
    public static Calendar field724 = Calendar.getInstance();

    @ObfuscatedName("av.s")
    public static final String[] field729 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.k(Lk;B)V")
    public static void method1033(class1 arg0) {
        method17(arg0, 200000);
    }

    @ObfuscatedName("y.r(Lk;IB)V")
    public static void method17(class1 arg0, int arg1) {
        Object[] var2 = arg0.field8;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method488(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field530;
        int[] var9 = var4.field531;
        byte var10 = -1;
        field723 = 0;
        try {
            Statics.field717 = new int[var4.field533];
            int var11 = 0;
            Statics.field718 = new String[var4.field532];
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
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2549;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2535;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2549;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2535;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field15;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field717[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field718[var12++] = var15;
                }
            }
            int var16 = 0;
            label2793: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var440 = var8[var7];
                if (var440 < 100) {
                    if (var440 == 0) {
                        field721[var5++] = var9[var7];
                        continue;
                    }
                    if (var440 == 1) {
                        int var17 = var9[var7];
                        field721[var5++] = class154.field2665[var17];
                        continue;
                    }
                    if (var440 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class154.field2665[var18] = field721[var5];
                        client.method502(var18);
                        continue;
                    }
                    if (var440 == 3) {
                        field716[var6++] = var4.field529[var7];
                        continue;
                    }
                    if (var440 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var440 == 7) {
                        var5 -= 2;
                        if (field721[var5 + 1] != field721[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 8) {
                        var5 -= 2;
                        if (field721[var5 + 1] == field721[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 9) {
                        var5 -= 2;
                        if (field721[var5] < field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 10) {
                        var5 -= 2;
                        if (field721[var5] > field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 21) {
                        if (field723 == 0) {
                            return;
                        }
                        class13 var19 = field720[--field723];
                        var4 = var19.field191;
                        var8 = var4.field530;
                        var9 = var4.field531;
                        var7 = var19.field190;
                        Statics.field717 = var19.field192;
                        Statics.field718 = var19.field193;
                        continue;
                    }
                    if (var440 == 25) {
                        int var20 = var9[var7];
                        field721[var5++] = class154.method2548(var20);
                        continue;
                    }
                    if (var440 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class154.method1601(var21, field721[var5]);
                        continue;
                    }
                    if (var440 == 31) {
                        var5 -= 2;
                        if (field721[var5] <= field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 32) {
                        var5 -= 2;
                        if (field721[var5] >= field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var440 == 33) {
                        field721[var5++] = Statics.field717[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var440 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field717[var10001] = field721[var5];
                        continue;
                    }
                    if (var440 == 35) {
                        field716[var6++] = Statics.field718[var9[var7]];
                        continue;
                    }
                    if (var440 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field718[var10001] = field716[var6];
                        continue;
                    }
                    if (var440 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field716;
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
                        field716[var6++] = var24;
                        continue;
                    }
                    if (var440 == 38) {
                        var5--;
                        continue;
                    }
                    if (var440 == 39) {
                        var6--;
                        continue;
                    }
                    if (var440 == 40) {
                        int var34 = var9[var7];
                        class19 var35 = class19.method488(var34);
                        int[] var36 = new int[var35.field533];
                        String[] var37 = new String[var35.field532];
                        for (int var38 = 0; var38 < var35.field534; var38++) {
                            var36[var38] = field721[var5 - var35.field534 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field536; var39++) {
                            var37[var39] = field716[var6 - var35.field536 + var39];
                        }
                        var5 -= var35.field534;
                        var6 -= var35.field536;
                        class13 var40 = new class13();
                        var40.field191 = var4;
                        var40.field190 = var7;
                        var40.field192 = Statics.field717;
                        var40.field193 = Statics.field718;
                        field720[++field723 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field530;
                        var9 = var35.field531;
                        var7 = -1;
                        Statics.field717 = var36;
                        Statics.field718 = var37;
                        continue;
                    }
                    if (var440 == 42) {
                        field721[var5++] = client.field440[var9[var7]];
                        continue;
                    }
                    if (var440 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field440[var10001] = field721[var5];
                        continue;
                    }
                    if (var440 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field721[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field719[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2793;
                                }
                                field727[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var440 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field721[var5];
                        if (var47 >= 0 && var47 < field719[var46]) {
                            field721[var5++] = field727[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var440 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field721[var5];
                        if (var49 >= 0 && var49 < field719[var48]) {
                            field727[var48][var49] = field721[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var440 == 47) {
                        String var50 = client.field452[var9[var7]];
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field716[var6++] = var50;
                        continue;
                    }
                    if (var440 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field452[var10001] = field716[var6];
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var440 < 1000) {
                    if (var440 == 100) {
                        var5 -= 3;
                        int var52 = field721[var5];
                        int var53 = field721[var5 + 1];
                        int var54 = field721[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class152 var55 = Statics.method480(var52);
                        if (var55.field2604 == null) {
                            var55.field2604 = new class152[var54 + 1];
                        }
                        if (var55.field2604.length <= var54) {
                            class152[] var56 = new class152[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2604.length; var57++) {
                                var56[var57] = var55.field2604[var57];
                            }
                            var55.field2604 = var56;
                        }
                        if (var54 > 0 && var55.field2604[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class152 var58 = new class152();
                        var58.field2536 = var53;
                        var58.field2545 = var58.field2549 = var55.field2549;
                        var58.field2535 = var54;
                        var58.field2533 = true;
                        var55.field2604[var54] = var58;
                        if (var51) {
                            Statics.field725 = var58;
                        } else {
                            Statics.field195 = var58;
                        }
                        client.method3127(var55);
                        continue;
                    }
                    if (var440 == 101) {
                        class152 var59 = var51 ? Statics.field725 : Statics.field195;
                        class152 var60 = Statics.method480(var59.field2549);
                        var60.field2604[var59.field2535] = null;
                        client.method3127(var60);
                        continue;
                    }
                    if (var440 == 102) {
                        var5--;
                        class152 var61 = Statics.method480(field721[var5]);
                        var61.field2604 = null;
                        client.method3127(var61);
                        continue;
                    }
                    if (var440 == 200) {
                        var5 -= 2;
                        int var62 = field721[var5];
                        int var63 = field721[var5 + 1];
                        class152 var64 = class152.method696(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field721[var5++] = 1;
                            if (var51) {
                                Statics.field725 = var64;
                            } else {
                                Statics.field195 = var64;
                            }
                            continue;
                        }
                        field721[var5++] = 0;
                        continue;
                    }
                } else if (!(var440 < 1000 || var440 >= 1100) || !(var440 < 2000 || var440 >= 2100)) {
                    class152 var65;
                    if (var440 >= 2000) {
                        var440 -= 1000;
                        var5--;
                        var65 = Statics.method480(field721[var5]);
                    } else {
                        var65 = var51 ? Statics.field725 : Statics.field195;
                    }
                    if (var440 == 1000) {
                        var5 -= 2;
                        var65.field2587 = field721[var5];
                        var65.field2540 = field721[var5 + 1];
                        client.method3127(var65);
                        continue;
                    }
                    if (var440 == 1001) {
                        var5 -= 2;
                        var65.field2543 = field721[var5];
                        var65.field2544 = field721[var5 + 1];
                        client.method3127(var65);
                        continue;
                    }
                    if (var440 == 1003) {
                        var5--;
                        boolean var66 = field721[var5] == 1;
                        if (var65.field2546 != var66) {
                            var65.field2546 = var66;
                            client.method3127(var65);
                        }
                        continue;
                    }
                } else if (!(var440 < 1100 || var440 >= 1200) || !(var440 < 2100 || var440 >= 2200)) {
                    class152 var67;
                    if (var440 >= 2000) {
                        var440 -= 1000;
                        var5--;
                        var67 = Statics.method480(field721[var5]);
                    } else {
                        var67 = var51 ? Statics.field725 : Statics.field195;
                    }
                    if (var440 == 1100) {
                        var5 -= 2;
                        var67.field2547 = field721[var5];
                        if (var67.field2547 > var67.field2561 - var67.field2543) {
                            var67.field2547 = var67.field2561 - var67.field2543;
                        }
                        if (var67.field2547 < 0) {
                            var67.field2547 = 0;
                        }
                        var67.field2553 = field721[var5 + 1];
                        if (var67.field2553 > var67.field2550 - var67.field2544) {
                            var67.field2553 = var67.field2550 - var67.field2544;
                        }
                        if (var67.field2553 < 0) {
                            var67.field2553 = 0;
                        }
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1101) {
                        var5--;
                        var67.field2551 = field721[var5];
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1102) {
                        var5--;
                        var67.field2555 = field721[var5] == 1;
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1103) {
                        var5--;
                        var67.field2556 = field721[var5];
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1104) {
                        var5--;
                        var67.field2557 = field721[var5];
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1105) {
                        var5--;
                        var67.field2558 = field721[var5];
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1106) {
                        var5--;
                        var67.field2560 = field721[var5];
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1107) {
                        var5--;
                        var67.field2571 = field721[var5] == 1;
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1108) {
                        var67.field2566 = 1;
                        var5--;
                        var67.field2559 = field721[var5];
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1109) {
                        var5 -= 6;
                        var67.field2572 = field721[var5];
                        var67.field2573 = field721[var5 + 1];
                        var67.field2574 = field721[var5 + 2];
                        var67.field2612 = field721[var5 + 3];
                        var67.field2597 = field721[var5 + 4];
                        var67.field2577 = field721[var5 + 5];
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1110) {
                        var5--;
                        int var68 = field721[var5];
                        if (var67.field2644 != var68) {
                            var67.field2644 = var68;
                            var67.field2654 = 0;
                            var67.field2641 = 0;
                            client.method3127(var67);
                        }
                        continue;
                    }
                    if (var440 == 1111) {
                        var5--;
                        var67.field2579 = field721[var5] == 1;
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1112) {
                        var6--;
                        String var69 = field716[var6];
                        if (!var69.equals(var67.field2646)) {
                            var67.field2646 = var69;
                            client.method3127(var67);
                        }
                        continue;
                    }
                    if (var440 == 1113) {
                        var5--;
                        var67.field2580 = field721[var5];
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1114) {
                        var5 -= 3;
                        var67.field2584 = field721[var5];
                        var67.field2539 = field721[var5 + 1];
                        var67.field2526 = field721[var5 + 2];
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1115) {
                        var5--;
                        var67.field2586 = field721[var5] == 1;
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1116) {
                        var5--;
                        var67.field2562 = field721[var5];
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1117) {
                        var5--;
                        var67.field2605 = field721[var5];
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1118) {
                        var5--;
                        var67.field2564 = field721[var5] == 1;
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1119) {
                        var5--;
                        var67.field2565 = field721[var5] == 1;
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1120) {
                        var5 -= 2;
                        var67.field2561 = field721[var5];
                        var67.field2550 = field721[var5 + 1];
                        client.method3127(var67);
                        continue;
                    }
                    if (var440 == 1121) {
                        client.method1077(var67.field2549, var67.field2535);
                        client.field420 = var67;
                        client.method3127(var67);
                        continue;
                    }
                } else if (var440 >= 1200 && var440 < 1300 || var440 >= 2200 && var440 < 2300) {
                    class152 var70;
                    if (var440 >= 2000) {
                        var440 -= 1000;
                        var5--;
                        var70 = Statics.method480(field721[var5]);
                    } else {
                        var70 = var51 ? Statics.field725 : Statics.field195;
                    }
                    client.method3127(var70);
                    if (var440 == 1200) {
                        var5 -= 2;
                        int var71 = field721[var5];
                        int var72 = field721[var5 + 1];
                        var70.field2638 = var71;
                        var70.field2639 = var72;
                        class45 var73 = class45.method1864(var71);
                        var70.field2574 = var73.field1052;
                        var70.field2612 = var73.field1027;
                        var70.field2597 = var73.field1028;
                        var70.field2572 = var73.field1029;
                        var70.field2573 = var73.field1030;
                        var70.field2577 = var73.field1025;
                        if (var70.field2543 > 0) {
                            var70.field2577 = var70.field2577 * 32 / var70.field2543;
                        }
                        continue;
                    }
                    if (var440 == 1201) {
                        var70.field2566 = 2;
                        var5--;
                        var70.field2559 = field721[var5];
                        continue;
                    }
                    if (var440 == 1202) {
                        var70.field2566 = 3;
                        var70.field2559 = Statics.field555.field29.method2901();
                        continue;
                    }
                } else if (var440 >= 1300 && var440 < 1400 || var440 >= 2300 && var440 < 2400) {
                    class152 var74;
                    if (var440 >= 2000) {
                        var440 -= 1000;
                        var5--;
                        var74 = Statics.method480(field721[var5]);
                    } else {
                        var74 = var51 ? Statics.field725 : Statics.field195;
                    }
                    if (var440 == 1300) {
                        var5--;
                        int var75 = field721[var5] - 1;
                        if (var75 >= 0 && var75 <= 9) {
                            var6--;
                            var74.method2832(var75, field716[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var440 == 1301) {
                        var5 -= 2;
                        int var76 = field721[var5];
                        int var77 = field721[var5 + 1];
                        var74.field2596 = class152.method696(var76, var77);
                        continue;
                    }
                    if (var440 == 1302) {
                        var5--;
                        var74.field2631 = field721[var5] == 1;
                        continue;
                    }
                    if (var440 == 1303) {
                        var5--;
                        var74.field2575 = field721[var5];
                        continue;
                    }
                    if (var440 == 1304) {
                        var5--;
                        var74.field2538 = field721[var5];
                        continue;
                    }
                    if (var440 == 1305) {
                        var6--;
                        var74.field2594 = field716[var6];
                        continue;
                    }
                    if (var440 == 1306) {
                        var6--;
                        var74.field2600 = field716[var6];
                        continue;
                    }
                    if (var440 == 1307) {
                        var74.field2552 = null;
                        continue;
                    }
                } else {
                    if (var440 >= 1400 && var440 < 1500 || var440 >= 2400 && var440 < 2500) {
                        class152 var78;
                        if (var440 >= 2000) {
                            var440 -= 1000;
                            var5--;
                            var78 = Statics.method480(field721[var5]);
                        } else {
                            var78 = var51 ? Statics.field725 : Statics.field195;
                        }
                        var6--;
                        String var79 = field716[var6];
                        int[] var80 = null;
                        if (var79.length() > 0 && var79.charAt(var79.length() - 1) == 'Y') {
                            var5--;
                            int var81 = field721[var5];
                            if (var81 > 0) {
                                var80 = new int[var81];
                                while (var81-- > 0) {
                                    var5--;
                                    var80[var81] = field721[var5];
                                }
                            }
                            var79 = var79.substring(0, var79.length() - 1);
                        }
                        Object[] var82 = new Object[var79.length() + 1];
                        for (int var83 = var82.length - 1; var83 >= 1; var83--) {
                            if (var79.charAt(var83 - 1) == 's') {
                                var6--;
                                var82[var83] = field716[var6];
                            } else {
                                var5--;
                                var82[var83] = Integer.valueOf(field721[var5]);
                            }
                        }
                        var5--;
                        int var84 = field721[var5];
                        if (var84 == -1) {
                            var82 = null;
                        } else {
                            var82[0] = Integer.valueOf(var84);
                        }
                        if (var440 == 1400) {
                            var78.field2542 = var82;
                        }
                        if (var440 == 1401) {
                            var78.field2606 = var82;
                        }
                        if (var440 == 1402) {
                            var78.field2583 = var82;
                        }
                        if (var440 == 1403) {
                            var78.field2607 = var82;
                        }
                        if (var440 == 1404) {
                            var78.field2609 = var82;
                        }
                        if (var440 == 1405) {
                            var78.field2610 = var82;
                        }
                        if (var440 == 1406) {
                            var78.field2652 = var82;
                        }
                        if (var440 == 1407) {
                            var78.field2570 = var82;
                            var78.field2615 = var80;
                        }
                        if (var440 == 1408) {
                            var78.field2623 = var82;
                        }
                        if (var440 == 1409) {
                            var78.field2621 = var82;
                        }
                        if (var440 == 1410) {
                            var78.field2611 = var82;
                        }
                        if (var440 == 1411) {
                            var78.field2581 = var82;
                        }
                        if (var440 == 1412) {
                            var78.field2608 = var82;
                        }
                        if (var440 == 1414) {
                            var78.field2616 = var82;
                            var78.field2617 = var80;
                        }
                        if (var440 == 1415) {
                            var78.field2618 = var82;
                            var78.field2619 = var80;
                        }
                        if (var440 == 1416) {
                            var78.field2589 = var82;
                        }
                        if (var440 == 1417) {
                            var78.field2622 = var82;
                        }
                        if (var440 == 1418) {
                            var78.field2635 = var82;
                        }
                        if (var440 == 1419) {
                            var78.field2624 = var82;
                        }
                        if (var440 == 1420) {
                            var78.field2625 = var82;
                        }
                        if (var440 == 1421) {
                            var78.field2541 = var82;
                        }
                        if (var440 == 1422) {
                            var78.field2627 = var82;
                        }
                        if (var440 == 1423) {
                            var78.field2628 = var82;
                        }
                        if (var440 == 1424) {
                            var78.field2629 = var82;
                        }
                        var78.field2601 = true;
                        continue;
                    }
                    if (var440 < 1600) {
                        class152 var85 = var51 ? Statics.field725 : Statics.field195;
                        if (var440 == 1500) {
                            field721[var5++] = var85.field2587;
                            continue;
                        }
                        if (var440 == 1501) {
                            field721[var5++] = var85.field2540;
                            continue;
                        }
                        if (var440 == 1502) {
                            field721[var5++] = var85.field2543;
                            continue;
                        }
                        if (var440 == 1503) {
                            field721[var5++] = var85.field2544;
                            continue;
                        }
                        if (var440 == 1504) {
                            field721[var5++] = var85.field2546 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 1505) {
                            field721[var5++] = var85.field2545;
                            continue;
                        }
                    } else if (var440 < 1700) {
                        class152 var86 = var51 ? Statics.field725 : Statics.field195;
                        if (var440 == 1600) {
                            field721[var5++] = var86.field2547;
                            continue;
                        }
                        if (var440 == 1601) {
                            field721[var5++] = var86.field2553;
                            continue;
                        }
                        if (var440 == 1602) {
                            field716[var6++] = var86.field2646;
                            continue;
                        }
                        if (var440 == 1603) {
                            field721[var5++] = var86.field2561;
                            continue;
                        }
                        if (var440 == 1604) {
                            field721[var5++] = var86.field2550;
                            continue;
                        }
                        if (var440 == 1605) {
                            field721[var5++] = var86.field2577;
                            continue;
                        }
                        if (var440 == 1606) {
                            field721[var5++] = var86.field2574;
                            continue;
                        }
                        if (var440 == 1607) {
                            field721[var5++] = var86.field2597;
                            continue;
                        }
                        if (var440 == 1608) {
                            field721[var5++] = var86.field2612;
                            continue;
                        }
                    } else if (var440 < 1800) {
                        class152 var87 = var51 ? Statics.field725 : Statics.field195;
                        if (var440 == 1700) {
                            field721[var5++] = var87.field2638;
                            continue;
                        }
                        if (var440 == 1701) {
                            if (var87.field2638 == -1) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = var87.field2639;
                            }
                            continue;
                        }
                        if (var440 == 1702) {
                            field721[var5++] = var87.field2535;
                            continue;
                        }
                    } else if (var440 < 1900) {
                        class152 var88 = var51 ? Statics.field725 : Statics.field195;
                        if (var440 == 1800) {
                            field721[var5++] = class156.method439(client.method2818(var88));
                            continue;
                        }
                        if (var440 == 1801) {
                            var5--;
                            int var89 = field721[var5];
                            int var441 = var89 - 1;
                            if (var88.field2552 != null && var441 < var88.field2552.length && var88.field2552[var441] != null) {
                                field716[var6++] = var88.field2552[var441];
                                continue;
                            }
                            field716[var6++] = "";
                            continue;
                        }
                        if (var440 == 1802) {
                            if (var88.field2594 == null) {
                                field716[var6++] = "";
                            } else {
                                field716[var6++] = var88.field2594;
                            }
                            continue;
                        }
                    } else if (var440 < 2600) {
                        var5--;
                        class152 var90 = Statics.method480(field721[var5]);
                        if (var440 == 2500) {
                            field721[var5++] = var90.field2587;
                            continue;
                        }
                        if (var440 == 2501) {
                            field721[var5++] = var90.field2540;
                            continue;
                        }
                        if (var440 == 2502) {
                            field721[var5++] = var90.field2543;
                            continue;
                        }
                        if (var440 == 2503) {
                            field721[var5++] = var90.field2544;
                            continue;
                        }
                        if (var440 == 2504) {
                            field721[var5++] = var90.field2546 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 2505) {
                            field721[var5++] = var90.field2545;
                            continue;
                        }
                    } else if (var440 < 2700) {
                        var5--;
                        class152 var91 = Statics.method480(field721[var5]);
                        if (var440 == 2600) {
                            field721[var5++] = var91.field2547;
                            continue;
                        }
                        if (var440 == 2601) {
                            field721[var5++] = var91.field2553;
                            continue;
                        }
                        if (var440 == 2602) {
                            field716[var6++] = var91.field2646;
                            continue;
                        }
                        if (var440 == 2603) {
                            field721[var5++] = var91.field2561;
                            continue;
                        }
                        if (var440 == 2604) {
                            field721[var5++] = var91.field2550;
                            continue;
                        }
                        if (var440 == 2605) {
                            field721[var5++] = var91.field2577;
                            continue;
                        }
                        if (var440 == 2606) {
                            field721[var5++] = var91.field2574;
                            continue;
                        }
                        if (var440 == 2607) {
                            field721[var5++] = var91.field2597;
                            continue;
                        }
                        if (var440 == 2608) {
                            field721[var5++] = var91.field2612;
                            continue;
                        }
                    } else if (var440 < 2800) {
                        if (var440 == 2700) {
                            var5--;
                            class152 var92 = Statics.method480(field721[var5]);
                            field721[var5++] = var92.field2638;
                            continue;
                        }
                        if (var440 == 2701) {
                            var5--;
                            class152 var93 = Statics.method480(field721[var5]);
                            if (var93.field2638 == -1) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = var93.field2639;
                            }
                            continue;
                        }
                        if (var440 == 2702) {
                            var5--;
                            int var94 = field721[var5];
                            class4 var95 = (class4) client.field417.method3163((long) var94);
                            if (var95 == null) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var440 < 2900) {
                        var5--;
                        class152 var96 = Statics.method480(field721[var5]);
                        if (var440 == 2800) {
                            field721[var5++] = class156.method439(client.method2818(var96));
                            continue;
                        }
                        if (var440 == 2801) {
                            var5--;
                            int var97 = field721[var5];
                            int var442 = var97 - 1;
                            if (var96.field2552 != null && var442 < var96.field2552.length && var96.field2552[var442] != null) {
                                field716[var6++] = var96.field2552[var442];
                                continue;
                            }
                            field716[var6++] = "";
                            continue;
                        }
                        if (var440 == 2802) {
                            if (var96.field2594 == null) {
                                field716[var6++] = "";
                            } else {
                                field716[var6++] = var96.field2594;
                            }
                            continue;
                        }
                    } else if (var440 < 3200) {
                        if (var440 == 3100) {
                            var6--;
                            String var98 = field716[var6];
                            class10.method2663(0, "", var98);
                            continue;
                        }
                        if (var440 == 3101) {
                            var5 -= 2;
                            client.method35(Statics.field555, field721[var5], field721[var5 + 1]);
                            continue;
                        }
                        if (var440 == 3103) {
                            client.method2820();
                            continue;
                        }
                        if (var440 == 3104) {
                            var6--;
                            String var99 = field716[var6];
                            int var100 = 0;
                            if (class199.method1973(var99)) {
                                int var101 = class199.method125(var99, 10, true);
                                var100 = var101;
                            }
                            client.field382.method2356(110);
                            client.field382.method2100(var100);
                            continue;
                        }
                        if (var440 == 3105) {
                            var6--;
                            String var102 = field716[var6];
                            client.field382.method2356(243);
                            client.field382.method2097(var102.length() + 1);
                            client.field382.method2186(var102);
                            continue;
                        }
                        if (var440 == 3106) {
                            var6--;
                            String var103 = field716[var6];
                            client.field382.method2356(109);
                            client.field382.method2097(var103.length() + 1);
                            client.field382.method2186(var103);
                            continue;
                        }
                        if (var440 == 3107) {
                            var5--;
                            int var104 = field721[var5];
                            var6--;
                            String var105 = field716[var6];
                            boolean var106 = false;
                            for (int var107 = 0; var107 < client.field374; var107++) {
                                class3 var108 = client.field311[client.field317[var107]];
                                if (var108 != null && var108.field43 != null && var108.field43.equalsIgnoreCase(var105)) {
                                    if (var104 == 1) {
                                        client.field382.method2356(149);
                                        client.field382.method2132(0);
                                        client.field382.method2098(client.field317[var107]);
                                    } else if (var104 == 4) {
                                        client.field382.method2356(193);
                                        client.field382.method2133(0);
                                        client.field382.method2236(client.field317[var107]);
                                    } else if (var104 == 6) {
                                        client.field382.method2356(132);
                                        client.field382.method2220(client.field317[var107]);
                                        client.field382.method2133(0);
                                    } else if (var104 == 7) {
                                        client.field382.method2356(172);
                                        client.field382.method2098(client.field317[var107]);
                                        client.field382.method2097(0);
                                    }
                                    var106 = true;
                                    break;
                                }
                            }
                            if (!var106) {
                                class10.method2663(4, "", class142.field2297 + var105);
                            }
                            continue;
                        }
                        if (var440 == 3108) {
                            var5 -= 3;
                            int var109 = field721[var5];
                            int var110 = field721[var5 + 1];
                            int var111 = field721[var5 + 2];
                            class152 var112 = Statics.method480(var111);
                            client.method2301(var112, var109, var110);
                            continue;
                        }
                        if (var440 == 3109) {
                            var5 -= 2;
                            int var113 = field721[var5];
                            int var114 = field721[var5 + 1];
                            class152 var115 = var51 ? Statics.field725 : Statics.field195;
                            client.method2301(var115, var113, var114);
                            continue;
                        }
                        if (var440 == 3110) {
                            var5--;
                            Statics.field1294 = field721[var5] == 1;
                            continue;
                        }
                        if (var440 == 3111) {
                            field721[var5++] = Statics.field1087.field134 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3112) {
                            var5--;
                            Statics.field1087.field134 = field721[var5] == 1;
                            class9.method2790();
                            continue;
                        }
                        if (var440 == 3113) {
                            var6--;
                            String var116 = field716[var6];
                            var5--;
                            boolean var117 = field721[var5] == 1;
                            class125.method769(var116, var117, "openjs", false);
                            continue;
                        }
                    } else if (var440 < 3300) {
                        if (var440 == 3200) {
                            var5 -= 3;
                            int var118 = field721[var5];
                            int var119 = field721[var5 + 1];
                            int var120 = field721[var5 + 2];
                            if (client.field490 != 0 && var119 != 0 && client.field497 < 50) {
                                client.field493[client.field497] = var118;
                                client.field494[client.field497] = var119;
                                client.field495[client.field497] = var120;
                                client.field289[client.field497] = null;
                                client.field496[client.field497] = 0;
                                client.field497++;
                            }
                            continue;
                        }
                        if (var440 == 3201) {
                            var5--;
                            client.method505(field721[var5]);
                            continue;
                        }
                        if (var440 == 3202) {
                            var5 -= 2;
                            client.method562(field721[var5], field721[var5 + 1]);
                            continue;
                        }
                    } else if (var440 < 3400) {
                        if (var440 == 3300) {
                            field721[var5++] = client.field261;
                            continue;
                        }
                        if (var440 == 3301) {
                            var5 -= 2;
                            int var121 = field721[var5];
                            int var122 = field721[var5 + 1];
                            field721[var5++] = class14.method831(var121, var122);
                            continue;
                        }
                        if (var440 == 3302) {
                            var5 -= 2;
                            int var123 = field721[var5];
                            int var124 = field721[var5 + 1];
                            field721[var5++] = class14.method899(var123, var124);
                            continue;
                        }
                        if (var440 == 3303) {
                            var5 -= 2;
                            int var125 = field721[var5];
                            int var126 = field721[var5 + 1];
                            field721[var5++] = class14.method518(var125, var126);
                            continue;
                        }
                        if (var440 == 3304) {
                            var5--;
                            int var127 = field721[var5];
                            int[] var128 = field721;
                            int var129 = var5++;
                            class44 var130 = (class44) class44.field1003.method3141((long) var127);
                            class44 var131;
                            if (var130 == null) {
                                byte[] var132 = Statics.field1010.method2749(5, var127);
                                class44 var133 = new class44();
                                if (var132 != null) {
                                    var133.method844(new class107(var132));
                                }
                                class44.field1003.method3137(var133, (long) var127);
                                var131 = var133;
                            } else {
                                var131 = var130;
                            }
                            var128[var129] = var131.field1004;
                            continue;
                        }
                        if (var440 == 3305) {
                            var5--;
                            int var134 = field721[var5];
                            field721[var5++] = client.field324[var134];
                            continue;
                        }
                        if (var440 == 3306) {
                            var5--;
                            int var135 = field721[var5];
                            field721[var5++] = client.field502[var135];
                            continue;
                        }
                        if (var440 == 3307) {
                            var5--;
                            int var136 = field721[var5];
                            field721[var5++] = client.field312[var136];
                            continue;
                        }
                        if (var440 == 3308) {
                            int var137 = Statics.field207;
                            int var138 = (Statics.field555.field730 >> 7) + Statics.field1492;
                            int var139 = (Statics.field555.field780 >> 7) + Statics.field1454;
                            field721[var5++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var440 == 3309) {
                            var5--;
                            int var140 = field721[var5];
                            field721[var5++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var440 == 3310) {
                            var5--;
                            int var141 = field721[var5];
                            field721[var5++] = var141 >> 28;
                            continue;
                        }
                        if (var440 == 3311) {
                            var5--;
                            int var142 = field721[var5];
                            field721[var5++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var440 == 3312) {
                            field721[var5++] = client.field256 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3313) {
                            var5 -= 2;
                            int var143 = field721[var5] + 32768;
                            int var144 = field721[var5 + 1];
                            field721[var5++] = class14.method831(var143, var144);
                            continue;
                        }
                        if (var440 == 3314) {
                            var5 -= 2;
                            int var145 = field721[var5] + 32768;
                            int var146 = field721[var5 + 1];
                            field721[var5++] = class14.method899(var145, var146);
                            continue;
                        }
                        if (var440 == 3315) {
                            var5 -= 2;
                            int var147 = field721[var5] + 32768;
                            int var148 = field721[var5 + 1];
                            field721[var5++] = class14.method518(var147, var148);
                            continue;
                        }
                        if (var440 == 3316) {
                            if (client.field423 >= 2) {
                                field721[var5++] = client.field423;
                            } else {
                                field721[var5++] = 0;
                            }
                            continue;
                        }
                        if (var440 == 3317) {
                            field721[var5++] = client.field268;
                            continue;
                        }
                        if (var440 == 3318) {
                            field721[var5++] = client.field253;
                            continue;
                        }
                        if (var440 == 3321) {
                            field721[var5++] = client.field421;
                            continue;
                        }
                        if (var440 == 3322) {
                            field721[var5++] = client.field488;
                            continue;
                        }
                        if (var440 == 3323) {
                            if (client.field425) {
                                field721[var5++] = 1;
                            } else {
                                field721[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var440 < 3500) {
                        if (var440 == 3400) {
                            var5 -= 2;
                            int var149 = field721[var5];
                            int var150 = field721[var5 + 1];
                            class43 var151 = class43.method758(var149);
                            if (var151.field993 != 's') {
                            }
                            for (int var152 = 0; var152 < var151.field994; var152++) {
                                if (var151.field995[var152] == var150) {
                                    field716[var6++] = var151.field997[var152];
                                    var151 = null;
                                    break;
                                }
                            }
                            if (var151 != null) {
                                field716[var6++] = var151.field992;
                            }
                            continue;
                        }
                        if (var440 == 3408) {
                            var5 -= 4;
                            int var153 = field721[var5];
                            int var154 = field721[var5 + 1];
                            int var155 = field721[var5 + 2];
                            int var156 = field721[var5 + 3];
                            class43 var157 = class43.method758(var155);
                            if (var157.field990 == var153 && var157.field993 == var154) {
                                for (int var158 = 0; var158 < var157.field994; var158++) {
                                    if (var157.field995[var158] == var156) {
                                        if (var154 == 115) {
                                            field716[var6++] = var157.field997[var158];
                                        } else {
                                            field721[var5++] = var157.field991[var158];
                                        }
                                        var157 = null;
                                        break;
                                    }
                                }
                                if (var157 != null) {
                                    if (var154 == 115) {
                                        field716[var6++] = var157.field992;
                                    } else {
                                        field721[var5++] = var157.field1001;
                                    }
                                }
                                continue;
                            }
                            if (var154 == 115) {
                                field716[var6++] = "null";
                            } else {
                                field721[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var440 < 3700) {
                        if (var440 == 3600) {
                            if (client.field395 == 0) {
                                field721[var5++] = -2;
                            } else if (client.field395 == 1) {
                                field721[var5++] = -1;
                            } else {
                                field721[var5++] = client.field369;
                            }
                            continue;
                        }
                        if (var440 == 3601) {
                            var5--;
                            int var159 = field721[var5];
                            if (client.field395 == 2 && var159 < client.field369) {
                                field716[var6++] = client.field506[var159].field234;
                                field716[var6++] = client.field506[var159].field228;
                                continue;
                            }
                            field716[var6++] = "";
                            field716[var6++] = "";
                            continue;
                        }
                        if (var440 == 3602) {
                            var5--;
                            int var160 = field721[var5];
                            if (client.field395 == 2 && var160 < client.field369) {
                                field721[var5++] = client.field506[var160].field229;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var440 == 3603) {
                            var5--;
                            int var161 = field721[var5];
                            if (client.field395 == 2 && var161 < client.field369) {
                                field721[var5++] = client.field506[var161].field230;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var440 == 3604) {
                            var6--;
                            String var162 = field716[var6];
                            var5--;
                            int var163 = field721[var5];
                            client.field382.method2356(100);
                            class110 var164 = client.field382;
                            int var165 = var162.length() + 1;
                            var164.method2097(var165 + 1);
                            client.field382.method2097(var163);
                            client.field382.method2186(var162);
                            continue;
                        }
                        if (var440 == 3605) {
                            var6--;
                            String var166 = field716[var6];
                            if (var166 == null) {
                                continue;
                            }
                            if ((client.field369 < 200 || client.field380 == 1) && client.field369 < 400) {
                                String var167 = class200.method2549(var166, Statics.field2960);
                                if (var167 == null) {
                                    continue;
                                }
                                for (int var168 = 0; var168 < client.field369; var168++) {
                                    class16 var169 = client.field506[var168];
                                    String var170 = class200.method2549(var169.field234, Statics.field2960);
                                    if (var170 != null && var170.equals(var167)) {
                                        class10.method2663(30, "", var166 + class142.field2315);
                                        continue label2793;
                                    }
                                    if (var169.field228 != null) {
                                        String var171 = class200.method2549(var169.field228, Statics.field2960);
                                        if (var171 != null && var171.equals(var167)) {
                                            class10.method2663(30, "", var166 + class142.field2315);
                                            continue label2793;
                                        }
                                    }
                                }
                                for (int var172 = 0; var172 < client.field508; var172++) {
                                    class8 var173 = client.field509[var172];
                                    String var174 = class200.method2549(var173.field131, Statics.field2960);
                                    if (var174 != null && var174.equals(var167)) {
                                        class10.method2663(30, "", class142.field2320 + var166 + class142.field2321);
                                        continue label2793;
                                    }
                                    if (var173.field125 != null) {
                                        String var175 = class200.method2549(var173.field125, Statics.field2960);
                                        if (var175 != null && var175.equals(var167)) {
                                            class10.method2663(30, "", class142.field2320 + var166 + class142.field2321);
                                            continue label2793;
                                        }
                                    }
                                }
                                if (class200.method2549(Statics.field555.field43, Statics.field2960).equals(var167)) {
                                    class10.method2663(30, "", class142.field2318);
                                } else {
                                    client.field382.method2356(200);
                                    class110 var176 = client.field382;
                                    int var177 = var166.length() + 1;
                                    var176.method2097(var177);
                                    client.field382.method2186(var166);
                                }
                                continue;
                            }
                            class10.method2663(30, "", class142.field2260);
                            continue;
                        }
                        if (var440 == 3606) {
                            var6--;
                            String var178 = field716[var6];
                            client.method811(var178);
                            continue;
                        }
                        if (var440 == 3607) {
                            var6--;
                            String var179 = field716[var6];
                            if (var179 == null) {
                                continue;
                            }
                            if ((client.field508 < 100 || client.field380 == 1) && client.field508 < 400) {
                                String var180 = class200.method2549(var179, Statics.field2960);
                                if (var180 == null) {
                                    continue;
                                }
                                for (int var181 = 0; var181 < client.field508; var181++) {
                                    class8 var182 = client.field509[var181];
                                    String var183 = class200.method2549(var182.field131, Statics.field2960);
                                    if (var183 != null && var183.equals(var180)) {
                                        class10.method2663(31, "", var179 + class142.field2317);
                                        continue label2793;
                                    }
                                    if (var182.field125 != null) {
                                        String var184 = class200.method2549(var182.field125, Statics.field2960);
                                        if (var184 != null && var184.equals(var180)) {
                                            class10.method2663(31, "", var179 + class142.field2317);
                                            continue label2793;
                                        }
                                    }
                                }
                                for (int var185 = 0; var185 < client.field369; var185++) {
                                    class16 var186 = client.field506[var185];
                                    String var187 = class200.method2549(var186.field234, Statics.field2960);
                                    if (var187 != null && var187.equals(var180)) {
                                        class10.method2663(31, "", class142.field2374 + var179 + class142.field2323);
                                        continue label2793;
                                    }
                                    if (var186.field228 != null) {
                                        String var188 = class200.method2549(var186.field228, Statics.field2960);
                                        if (var188 != null && var188.equals(var180)) {
                                            class10.method2663(31, "", class142.field2374 + var179 + class142.field2323);
                                            continue label2793;
                                        }
                                    }
                                }
                                if (class200.method2549(Statics.field555.field43, Statics.field2960).equals(var180)) {
                                    class10.method2663(31, "", class142.field2379);
                                } else {
                                    client.field382.method2356(57);
                                    class110 var189 = client.field382;
                                    int var190 = var179.length() + 1;
                                    var189.method2097(var190);
                                    client.field382.method2186(var179);
                                }
                                continue;
                            }
                            class10.method2663(31, "", class142.field2316);
                            continue;
                        }
                        if (var440 == 3608) {
                            var6--;
                            String var191 = field716[var6];
                            if (var191 == null) {
                                continue;
                            }
                            String var192 = class200.method2549(var191, Statics.field2960);
                            if (var192 == null) {
                                continue;
                            }
                            int var193 = 0;
                            while (true) {
                                if (var193 >= client.field508) {
                                    continue label2793;
                                }
                                class8 var194 = client.field509[var193];
                                String var195 = var194.field131;
                                String var196 = class200.method2549(var195, Statics.field2960);
                                boolean var197;
                                if (var191 == null || var195 == null) {
                                    var197 = false;
                                } else if (var191.startsWith("#") || var195.startsWith("#")) {
                                    var197 = var191.equals(var195);
                                } else {
                                    var197 = var192.equals(var196);
                                }
                                if (var197) {
                                    client.field508--;
                                    for (int var198 = var193; var198 < client.field508; var198++) {
                                        client.field509[var198] = client.field509[var198 + 1];
                                    }
                                    client.field359 = client.field325;
                                    client.field382.method2356(222);
                                    class110 var199 = client.field382;
                                    int var200 = var191.length() + 1;
                                    var199.method2097(var200);
                                    client.field382.method2186(var191);
                                    continue label2793;
                                }
                                var193++;
                            }
                        }
                        if (var440 == 3609) {
                            var6--;
                            String var201 = field716[var6];
                            if (var201.startsWith(class2.method760(0)) || var201.startsWith(class2.method760(1))) {
                                var201 = var201.substring(7);
                            }
                            field721[var5++] = client.method517(var201, false) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3611) {
                            if (client.field331 == null) {
                                field716[var6++] = "";
                                continue;
                            }
                            String[] var202 = field716;
                            int var203 = var6++;
                            String var204 = client.field331;
                            long var205 = 0L;
                            int var207 = var204.length();
                            for (int var208 = 0; var208 < var207; var208++) {
                                var205 *= 37L;
                                char var209 = var204.charAt(var208);
                                if (var209 >= 'A' && var209 <= 'Z') {
                                    var205 += (long) (var209 + 1 - 65);
                                } else if (var209 >= 'a' && var209 <= 'z') {
                                    var205 += (long) (var209 + 1 - 97);
                                } else if (var209 >= '0' && var209 <= '9') {
                                    var205 += (long) (var209 + 27 - 48);
                                }
                                if (var205 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var205 % 37L == 0L && var205 != 0L) {
                                var205 /= 37L;
                            }
                            String var212 = class198.method448(var205);
                            if (var212 == null) {
                                var212 = "";
                            }
                            var202[var203] = var212;
                            continue;
                        }
                        if (var440 == 3612) {
                            if (client.field331 == null) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = Statics.field172;
                            }
                            continue;
                        }
                        if (var440 == 3613) {
                            var5--;
                            int var214 = field721[var5];
                            if (client.field331 != null && var214 < Statics.field172) {
                                field716[var6++] = Statics.field2404[var214].field566;
                                continue;
                            }
                            field716[var6++] = "";
                            continue;
                        }
                        if (var440 == 3614) {
                            var5--;
                            int var215 = field721[var5];
                            if (client.field331 != null && var215 < Statics.field172) {
                                field721[var5++] = Statics.field2404[var215].field568;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var440 == 3615) {
                            var5--;
                            int var216 = field721[var5];
                            if (client.field331 != null && var216 < Statics.field172) {
                                field721[var5++] = Statics.field2404[var216].field562;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var440 == 3616) {
                            field721[var5++] = Statics.field1352;
                            continue;
                        }
                        if (var440 == 3617) {
                            var6--;
                            String var217 = field716[var6];
                            if (Statics.field2404 != null) {
                                client.field382.method2356(242);
                                class110 var218 = client.field382;
                                int var219 = var217.length() + 1;
                                var218.method2097(var219);
                                client.field382.method2186(var217);
                            }
                            continue;
                        }
                        if (var440 == 3618) {
                            field721[var5++] = Statics.field788;
                            continue;
                        }
                        if (var440 == 3619) {
                            var6--;
                            String var220 = field716[var6];
                            client.method592(var220);
                            continue;
                        }
                        if (var440 == 3620) {
                            client.method516();
                            continue;
                        }
                        if (var440 == 3621) {
                            if (client.field395 == 0) {
                                field721[var5++] = -1;
                            } else {
                                field721[var5++] = client.field508;
                            }
                            continue;
                        }
                        if (var440 == 3622) {
                            var5--;
                            int var221 = field721[var5];
                            if (client.field395 != 0 && var221 < client.field508) {
                                field716[var6++] = client.field509[var221].field131;
                                field716[var6++] = client.field509[var221].field125;
                                continue;
                            }
                            field716[var6++] = "";
                            field716[var6++] = "";
                            continue;
                        }
                        if (var440 == 3623) {
                            var6--;
                            String var222 = field716[var6];
                            if (var222.startsWith(class2.method760(0)) || var222.startsWith(class2.method760(1))) {
                                var222 = var222.substring(7);
                            }
                            field721[var5++] = client.method3066(var222) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 3624) {
                            var5--;
                            int var223 = field721[var5];
                            if (Statics.field2404 != null && var223 < Statics.field172 && Statics.field2404[var223].field566.equalsIgnoreCase(Statics.field555.field43)) {
                                field721[var5++] = 1;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var440 == 3625) {
                            if (client.field478 == null) {
                                field716[var6++] = "";
                                continue;
                            }
                            String[] var224 = field716;
                            int var225 = var6++;
                            String var226 = client.field478;
                            long var227 = 0L;
                            int var229 = var226.length();
                            for (int var230 = 0; var230 < var229; var230++) {
                                var227 *= 37L;
                                char var231 = var226.charAt(var230);
                                if (var231 >= 'A' && var231 <= 'Z') {
                                    var227 += (long) (var231 + 1 - 65);
                                } else if (var231 >= 'a' && var231 <= 'z') {
                                    var227 += (long) (var231 + 1 - 97);
                                } else if (var231 >= '0' && var231 <= '9') {
                                    var227 += (long) (var231 + 27 - 48);
                                }
                                if (var227 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var227 % 37L == 0L && var227 != 0L) {
                                var227 /= 37L;
                            }
                            String var234 = class198.method448(var227);
                            if (var234 == null) {
                                var234 = "";
                            }
                            var224[var225] = var234;
                            continue;
                        }
                    } else if (var440 < 4100) {
                        if (var440 == 4000) {
                            var5 -= 2;
                            int var236 = field721[var5];
                            int var237 = field721[var5 + 1];
                            field721[var5++] = var236 + var237;
                            continue;
                        }
                        if (var440 == 4001) {
                            var5 -= 2;
                            int var238 = field721[var5];
                            int var239 = field721[var5 + 1];
                            field721[var5++] = var238 - var239;
                            continue;
                        }
                        if (var440 == 4002) {
                            var5 -= 2;
                            int var240 = field721[var5];
                            int var241 = field721[var5 + 1];
                            field721[var5++] = var240 * var241;
                            continue;
                        }
                        if (var440 == 4003) {
                            var5 -= 2;
                            int var242 = field721[var5];
                            int var243 = field721[var5 + 1];
                            field721[var5++] = var242 / var243;
                            continue;
                        }
                        if (var440 == 4004) {
                            var5--;
                            int var244 = field721[var5];
                            field721[var5++] = (int) (Math.random() * (double) var244);
                            continue;
                        }
                        if (var440 == 4005) {
                            var5--;
                            int var245 = field721[var5];
                            field721[var5++] = (int) (Math.random() * (double) (var245 + 1));
                            continue;
                        }
                        if (var440 == 4006) {
                            var5 -= 5;
                            int var246 = field721[var5];
                            int var247 = field721[var5 + 1];
                            int var248 = field721[var5 + 2];
                            int var249 = field721[var5 + 3];
                            int var250 = field721[var5 + 4];
                            field721[var5++] = (var247 - var246) * (var250 - var248) / (var249 - var248) + var246;
                            continue;
                        }
                        if (var440 == 4007) {
                            var5 -= 2;
                            int var251 = field721[var5];
                            int var252 = field721[var5 + 1];
                            field721[var5++] = var251 * var252 / 100 + var251;
                            continue;
                        }
                        if (var440 == 4008) {
                            var5 -= 2;
                            int var253 = field721[var5];
                            int var254 = field721[var5 + 1];
                            field721[var5++] = var253 | 0x1 << var254;
                            continue;
                        }
                        if (var440 == 4009) {
                            var5 -= 2;
                            int var255 = field721[var5];
                            int var256 = field721[var5 + 1];
                            field721[var5++] = var255 & -1 - (0x1 << var256);
                            continue;
                        }
                        if (var440 == 4010) {
                            var5 -= 2;
                            int var257 = field721[var5];
                            int var258 = field721[var5 + 1];
                            field721[var5++] = (var257 & 0x1 << var258) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var440 == 4011) {
                            var5 -= 2;
                            int var259 = field721[var5];
                            int var260 = field721[var5 + 1];
                            field721[var5++] = var259 % var260;
                            continue;
                        }
                        if (var440 == 4012) {
                            var5 -= 2;
                            int var261 = field721[var5];
                            int var262 = field721[var5 + 1];
                            if (var261 == 0) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = (int) Math.pow((double) var261, (double) var262);
                            }
                            continue;
                        }
                        if (var440 == 4013) {
                            var5 -= 2;
                            int var263 = field721[var5];
                            int var264 = field721[var5 + 1];
                            if (var263 == 0) {
                                field721[var5++] = 0;
                            } else if (var264 == 0) {
                                field721[var5++] = Integer.MAX_VALUE;
                            } else {
                                field721[var5++] = (int) Math.pow((double) var263, 1.0D / (double) var264);
                            }
                            continue;
                        }
                        if (var440 == 4014) {
                            var5 -= 2;
                            int var265 = field721[var5];
                            int var266 = field721[var5 + 1];
                            field721[var5++] = var265 & var266;
                            continue;
                        }
                        if (var440 == 4015) {
                            var5 -= 2;
                            int var267 = field721[var5];
                            int var268 = field721[var5 + 1];
                            field721[var5++] = var267 | var268;
                            continue;
                        }
                    } else if (var440 < 4200) {
                        if (var440 == 4100) {
                            var6--;
                            String var269 = field716[var6];
                            var5--;
                            int var270 = field721[var5];
                            field716[var6++] = var269 + var270;
                            continue;
                        }
                        if (var440 == 4101) {
                            var6 -= 2;
                            String var271 = field716[var6];
                            String var272 = field716[var6 + 1];
                            field716[var6++] = var271 + var272;
                            continue;
                        }
                        if (var440 == 4102) {
                            var6--;
                            String var273 = field716[var6];
                            var5--;
                            int var274 = field721[var5];
                            String[] var275 = field716;
                            int var276 = var6++;
                            String var278;
                            if (var274 < 0) {
                                var278 = Integer.toString(var274);
                            } else {
                                int var279 = var274;
                                String var280;
                                if (var274 < 0) {
                                    var280 = Integer.toString(var274, 10);
                                } else {
                                    int var281 = 2;
                                    int var282 = var274 / 10;
                                    while (var282 != 0) {
                                        var282 /= 10;
                                        var281++;
                                    }
                                    char[] var283 = new char[var281];
                                    var283[0] = '+';
                                    for (int var284 = var281 - 1; var284 > 0; var284--) {
                                        int var285 = var279;
                                        var279 /= 10;
                                        int var286 = var285 - var279 * 10;
                                        if (var286 >= 10) {
                                            var283[var284] = (char) (var286 + 87);
                                        } else {
                                            var283[var284] = (char) (var286 + 48);
                                        }
                                    }
                                    var280 = new String(var283);
                                }
                                var278 = var280;
                            }
                            var275[var276] = var273 + var278;
                            continue;
                        }
                        if (var440 == 4103) {
                            var6--;
                            String var287 = field716[var6];
                            field716[var6++] = var287.toLowerCase();
                            continue;
                        }
                        if (var440 == 4104) {
                            var5--;
                            int var288 = field721[var5];
                            long var289 = ((long) var288 + 11745L) * 86400000L;
                            field724.setTime(new Date(var289));
                            int var291 = field724.get(5);
                            int var292 = field724.get(2);
                            int var293 = field724.get(1);
                            field716[var6++] = var291 + "-" + field729[var292] + "-" + var293;
                            continue;
                        }
                        if (var440 == 4105) {
                            var6 -= 2;
                            String var294 = field716[var6];
                            String var295 = field716[var6 + 1];
                            if (Statics.field555.field29 != null && Statics.field555.field29.field2674) {
                                field716[var6++] = var295;
                                continue;
                            }
                            field716[var6++] = var294;
                            continue;
                        }
                        if (var440 == 4106) {
                            var5--;
                            int var296 = field721[var5];
                            field716[var6++] = Integer.toString(var296);
                            continue;
                        }
                        if (var440 == 4107) {
                            var6 -= 2;
                            int[] var297 = field721;
                            int var298 = var5++;
                            String var299 = field716[var6];
                            String var300 = field716[var6 + 1];
                            int var301 = client.field258;
                            int var302 = var299.length();
                            int var303 = var300.length();
                            int var304 = 0;
                            int var305 = 0;
                            byte var306 = 0;
                            byte var307 = 0;
                            int var308;
                            label2631: while (true) {
                                if (var304 - var306 >= var302 && var305 - var307 >= var303) {
                                    int var319 = Math.min(var302, var303);
                                    for (int var320 = 0; var320 < var319; var320++) {
                                        char var323 = var299.charAt(var320);
                                        char var324 = var300.charAt(var320);
                                        if (var323 != var324 && Character.toUpperCase(var323) != Character.toUpperCase(var324)) {
                                            char var325 = Character.toLowerCase(var323);
                                            char var326 = Character.toLowerCase(var324);
                                            if (var325 != var326) {
                                                var308 = class202.method3461(var325, var301) - class202.method3461(var326, var301);
                                                break label2631;
                                            }
                                        }
                                    }
                                    int var327 = var302 - var303;
                                    if (var327 == 0) {
                                        for (int var328 = 0; var328 < var319; var328++) {
                                            char var329 = var299.charAt(var328);
                                            char var330 = var300.charAt(var328);
                                            if (var329 != var330) {
                                                var308 = class202.method3461(var329, var301) - class202.method3461(var330, var301);
                                                break label2631;
                                            }
                                        }
                                        var308 = 0;
                                    } else {
                                        var308 = var327;
                                    }
                                    break;
                                }
                                if (var304 - var306 >= var302) {
                                    var308 = -1;
                                    break;
                                }
                                if (var305 - var307 >= var303) {
                                    var308 = 1;
                                    break;
                                }
                                char var309;
                                if (var306 == 0) {
                                    var309 = var299.charAt(var304++);
                                } else {
                                    var309 = (char) var306;
                                    boolean var310 = false;
                                }
                                char var311;
                                if (var307 == 0) {
                                    var311 = var300.charAt(var305++);
                                } else {
                                    var311 = (char) var307;
                                    boolean var312 = false;
                                }
                                byte var313;
                                if (var309 == 198) {
                                    var313 = 69;
                                } else if (var309 == 230) {
                                    var313 = 101;
                                } else if (var309 == 223) {
                                    var313 = 115;
                                } else if (var309 == 338) {
                                    var313 = 69;
                                } else if (var309 == 339) {
                                    var313 = 101;
                                } else {
                                    var313 = 0;
                                }
                                var306 = var313;
                                byte var314;
                                if (var311 == 198) {
                                    var314 = 69;
                                } else if (var311 == 230) {
                                    var314 = 101;
                                } else if (var311 == 223) {
                                    var314 = 115;
                                } else if (var311 == 338) {
                                    var314 = 69;
                                } else if (var311 == 339) {
                                    var314 = 101;
                                } else {
                                    var314 = 0;
                                }
                                var307 = var314;
                                char var315 = class202.method761(var309, var301);
                                char var316 = class202.method761(var311, var301);
                                if (var315 != var316 && Character.toUpperCase(var315) != Character.toUpperCase(var316)) {
                                    char var317 = Character.toLowerCase(var315);
                                    char var318 = Character.toLowerCase(var316);
                                    if (var317 != var318) {
                                        var308 = class202.method3461(var317, var301) - class202.method3461(var318, var301);
                                        break;
                                    }
                                }
                            }
                            var297[var298] = class199.method2302(var308);
                            continue;
                        }
                        if (var440 == 4108) {
                            var6--;
                            String var331 = field716[var6];
                            var5 -= 2;
                            int var332 = field721[var5];
                            int var333 = field721[var5 + 1];
                            byte[] var334 = Statics.field138.method2749(var333, 0);
                            class193 var335 = new class193(var334);
                            field721[var5++] = var335.method3312(var331, var332);
                            continue;
                        }
                        if (var440 == 4109) {
                            var6--;
                            String var336 = field716[var6];
                            var5 -= 2;
                            int var337 = field721[var5];
                            int var338 = field721[var5 + 1];
                            byte[] var339 = Statics.field138.method2749(var338, 0);
                            class193 var340 = new class193(var339);
                            field721[var5++] = var340.method3318(var336, var337);
                            continue;
                        }
                        if (var440 == 4110) {
                            var6 -= 2;
                            String var341 = field716[var6];
                            String var342 = field716[var6 + 1];
                            var5--;
                            if (field721[var5] == 1) {
                                field716[var6++] = var341;
                            } else {
                                field716[var6++] = var342;
                            }
                            continue;
                        }
                        if (var440 == 4111) {
                            var6--;
                            String var343 = field716[var6];
                            field716[var6++] = class192.method3354(var343);
                            continue;
                        }
                        if (var440 == 4112) {
                            var6--;
                            String var344 = field716[var6];
                            var5--;
                            int var345 = field721[var5];
                            field716[var6++] = var344 + (char) var345;
                            continue;
                        }
                        if (var440 == 4113) {
                            var5--;
                            int var346 = field721[var5];
                            field721[var5++] = class199.method1965((char) var346) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4114) {
                            var5--;
                            int var347 = field721[var5];
                            field721[var5++] = class199.method2912((char) var347) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4115) {
                            var5--;
                            int var348 = field721[var5];
                            field721[var5++] = class199.method3492((char) var348) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4116) {
                            var5--;
                            int var349 = field721[var5];
                            field721[var5++] = class199.method3288((char) var349) ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4117) {
                            var6--;
                            String var350 = field716[var6];
                            if (var350 == null) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = var350.length();
                            }
                            continue;
                        }
                        if (var440 == 4118) {
                            var6--;
                            String var351 = field716[var6];
                            var5 -= 2;
                            int var352 = field721[var5];
                            int var353 = field721[var5 + 1];
                            field716[var6++] = var351.substring(var352, var353);
                            continue;
                        }
                        if (var440 == 4119) {
                            var6--;
                            String var354 = field716[var6];
                            StringBuilder var355 = new StringBuilder(var354.length());
                            boolean var356 = false;
                            for (int var357 = 0; var357 < var354.length(); var357++) {
                                char var358 = var354.charAt(var357);
                                if (var358 == '<') {
                                    var356 = true;
                                } else if (var358 == '>') {
                                    var356 = false;
                                } else if (!var356) {
                                    var355.append(var358);
                                }
                            }
                            field716[var6++] = var355.toString();
                            continue;
                        }
                        if (var440 == 4120) {
                            var6--;
                            String var359 = field716[var6];
                            var5--;
                            int var360 = field721[var5];
                            field721[var5++] = var359.indexOf(var360);
                            continue;
                        }
                        if (var440 == 4121) {
                            var6 -= 2;
                            String var361 = field716[var6];
                            String var362 = field716[var6 + 1];
                            var5--;
                            int var363 = field721[var5];
                            field721[var5++] = var361.indexOf(var362, var363);
                            continue;
                        }
                    } else if (var440 < 4300) {
                        if (var440 == 4200) {
                            var5--;
                            int var364 = field721[var5];
                            field716[var6++] = class45.method1864(var364).field1020;
                            continue;
                        }
                        if (var440 == 4201) {
                            var5 -= 2;
                            int var365 = field721[var5];
                            int var366 = field721[var5 + 1];
                            class45 var367 = class45.method1864(var365);
                            if (var366 >= 1 && var366 <= 5 && var367.field1034[var366 - 1] != null) {
                                field716[var6++] = var367.field1034[var366 - 1];
                                continue;
                            }
                            field716[var6++] = "";
                            continue;
                        }
                        if (var440 == 4202) {
                            var5 -= 2;
                            int var368 = field721[var5];
                            int var369 = field721[var5 + 1];
                            class45 var370 = class45.method1864(var368);
                            if (var369 >= 1 && var369 <= 5 && var370.field1021[var369 - 1] != null) {
                                field716[var6++] = var370.field1021[var369 - 1];
                                continue;
                            }
                            field716[var6++] = "";
                            continue;
                        }
                        if (var440 == 4203) {
                            var5--;
                            int var371 = field721[var5];
                            field721[var5++] = class45.method1864(var371).field1035;
                            continue;
                        }
                        if (var440 == 4204) {
                            var5--;
                            int var372 = field721[var5];
                            field721[var5++] = class45.method1864(var372).field1031 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var440 == 4205) {
                            var5--;
                            int var373 = field721[var5];
                            class45 var374 = class45.method1864(var373);
                            if (var374.field1051 == -1 && var374.field1043 >= 0) {
                                field721[var5++] = var374.field1043;
                                continue;
                            }
                            field721[var5++] = var373;
                            continue;
                        }
                        if (var440 == 4206) {
                            var5--;
                            int var375 = field721[var5];
                            class45 var376 = class45.method1864(var375);
                            if (var376.field1051 >= 0 && var376.field1043 >= 0) {
                                field721[var5++] = var376.field1043;
                                continue;
                            }
                            field721[var5++] = var375;
                            continue;
                        }
                        if (var440 == 4207) {
                            var5--;
                            int var377 = field721[var5];
                            field721[var5++] = class45.method1864(var377).field1057 ? 1 : 0;
                            continue;
                        }
                    } else if (var440 < 5100) {
                        if (var440 == 5000) {
                            field721[var5++] = client.field469;
                            continue;
                        }
                        if (var440 == 5001) {
                            var5 -= 3;
                            client.field469 = field721[var5];
                            Statics.field603 = Statics.method1871(field721[var5 + 1]);
                            if (Statics.field603 == null) {
                                Statics.field603 = class117.field1921;
                            }
                            client.field470 = field721[var5 + 2];
                            client.field382.method2356(232);
                            client.field382.method2097(client.field469);
                            client.field382.method2097(Statics.field603.field1923);
                            client.field382.method2097(client.field470);
                            continue;
                        }
                        if (var440 == 5002) {
                            var6--;
                            String var378 = field716[var6];
                            var5 -= 2;
                            int var379 = field721[var5];
                            int var380 = field721[var5 + 1];
                            client.field382.method2356(221);
                            class110 var381 = client.field382;
                            int var382 = var378.length() + 1;
                            var381.method2097(var382 + 2);
                            client.field382.method2186(var378);
                            client.field382.method2097(var379 - 1);
                            client.field382.method2097(var380);
                            continue;
                        }
                        if (var440 == 5003) {
                            var5 -= 2;
                            int var383 = field721[var5];
                            int var384 = field721[var5 + 1];
                            class24 var385 = (class24) class10.field160.get(var383);
                            class31 var386 = var385.method493(var384);
                            if (var386 == null) {
                                field721[var5++] = -1;
                                field721[var5++] = 0;
                                field716[var6++] = "";
                                field716[var6++] = "";
                                field716[var6++] = "";
                            } else {
                                field721[var5++] = var386.field700;
                                field721[var5++] = var386.field701;
                                field716[var6++] = var386.field703 == null ? "" : var386.field703;
                                field716[var6++] = var386.field704 == null ? "" : var386.field704;
                                field716[var6++] = var386.field706 == null ? "" : var386.field706;
                            }
                            continue;
                        }
                        if (var440 == 5004) {
                            var5--;
                            int var388 = field721[var5];
                            class31 var389 = (class31) class10.field152.method3178((long) var388);
                            if (var389 == null) {
                                field721[var5++] = -1;
                                field721[var5++] = 0;
                                field716[var6++] = "";
                                field716[var6++] = "";
                                field716[var6++] = "";
                            } else {
                                field721[var5++] = var389.field702;
                                field721[var5++] = var389.field701;
                                field716[var6++] = var389.field703 == null ? "" : var389.field703;
                                field716[var6++] = var389.field704 == null ? "" : var389.field704;
                                field716[var6++] = var389.field706 == null ? "" : var389.field706;
                            }
                            continue;
                        }
                        if (var440 == 5005) {
                            if (Statics.field603 == null) {
                                field721[var5++] = -1;
                            } else {
                                field721[var5++] = Statics.field603.field1923;
                            }
                            continue;
                        }
                        if (var440 == 5008) {
                            var6--;
                            String var391 = field716[var6];
                            var5--;
                            int var392 = field721[var5];
                            String var393 = var391.toLowerCase();
                            byte var394 = 0;
                            if (var393.startsWith(class142.field2324)) {
                                var394 = 0;
                                var391 = var391.substring(class142.field2324.length());
                            } else if (var393.startsWith(class142.field2326)) {
                                var394 = 1;
                                var391 = var391.substring(class142.field2326.length());
                            } else if (var393.startsWith(class142.field2328)) {
                                var394 = 2;
                                var391 = var391.substring(class142.field2328.length());
                            } else if (var393.startsWith(class142.field2330)) {
                                var394 = 3;
                                var391 = var391.substring(class142.field2330.length());
                            } else if (var393.startsWith(class142.field2178)) {
                                var394 = 4;
                                var391 = var391.substring(class142.field2178.length());
                            } else if (var393.startsWith(class142.field2215)) {
                                var394 = 5;
                                var391 = var391.substring(class142.field2215.length());
                            } else if (var393.startsWith(class142.field2210)) {
                                var394 = 6;
                                var391 = var391.substring(class142.field2210.length());
                            } else if (var393.startsWith(class142.field2391)) {
                                var394 = 7;
                                var391 = var391.substring(class142.field2391.length());
                            } else if (var393.startsWith(class142.field2340)) {
                                var394 = 8;
                                var391 = var391.substring(class142.field2340.length());
                            } else if (var393.startsWith(class142.field2342)) {
                                var394 = 9;
                                var391 = var391.substring(class142.field2342.length());
                            } else if (var393.startsWith(class142.field2344)) {
                                var394 = 10;
                                var391 = var391.substring(class142.field2344.length());
                            } else if (var393.startsWith(class142.field2346)) {
                                var394 = 11;
                                var391 = var391.substring(class142.field2346.length());
                            } else if (client.field258 != 0) {
                                if (var393.startsWith(class142.field2325)) {
                                    var394 = 0;
                                    var391 = var391.substring(class142.field2325.length());
                                } else if (var393.startsWith(class142.field2327)) {
                                    var394 = 1;
                                    var391 = var391.substring(class142.field2327.length());
                                } else if (var393.startsWith(class142.field2329)) {
                                    var394 = 2;
                                    var391 = var391.substring(class142.field2329.length());
                                } else if (var393.startsWith(class142.field2331)) {
                                    var394 = 3;
                                    var391 = var391.substring(class142.field2331.length());
                                } else if (var393.startsWith(class142.field2262)) {
                                    var394 = 4;
                                    var391 = var391.substring(class142.field2262.length());
                                } else if (var393.startsWith(class142.field2335)) {
                                    var394 = 5;
                                    var391 = var391.substring(class142.field2335.length());
                                } else if (var393.startsWith(class142.field2337)) {
                                    var394 = 6;
                                    var391 = var391.substring(class142.field2337.length());
                                } else if (var393.startsWith(class142.field2354)) {
                                    var394 = 7;
                                    var391 = var391.substring(class142.field2354.length());
                                } else if (var393.startsWith(class142.field2341)) {
                                    var394 = 8;
                                    var391 = var391.substring(class142.field2341.length());
                                } else if (var393.startsWith(class142.field2343)) {
                                    var394 = 9;
                                    var391 = var391.substring(class142.field2343.length());
                                } else if (var393.startsWith(class142.field2345)) {
                                    var394 = 10;
                                    var391 = var391.substring(class142.field2345.length());
                                } else if (var393.startsWith(class142.field2248)) {
                                    var394 = 11;
                                    var391 = var391.substring(class142.field2248.length());
                                }
                            }
                            String var395 = var391.toLowerCase();
                            byte var396 = 0;
                            if (var395.startsWith(class142.field2348)) {
                                var396 = 1;
                                var391 = var391.substring(class142.field2348.length());
                            } else if (var395.startsWith(class142.field2350)) {
                                var396 = 2;
                                var391 = var391.substring(class142.field2350.length());
                            } else if (var395.startsWith(class142.field2352)) {
                                var396 = 3;
                                var391 = var391.substring(class142.field2352.length());
                            } else if (var395.startsWith(class142.field2190)) {
                                var396 = 4;
                                var391 = var391.substring(class142.field2190.length());
                            } else if (var395.startsWith(class142.field2267)) {
                                var396 = 5;
                                var391 = var391.substring(class142.field2267.length());
                            } else if (client.field258 != 0) {
                                if (var395.startsWith(class142.field2349)) {
                                    var396 = 1;
                                    var391 = var391.substring(class142.field2349.length());
                                } else if (var395.startsWith(class142.field2306)) {
                                    var396 = 2;
                                    var391 = var391.substring(class142.field2306.length());
                                } else if (var395.startsWith(class142.field2347)) {
                                    var396 = 3;
                                    var391 = var391.substring(class142.field2347.length());
                                } else if (var395.startsWith(class142.field2203)) {
                                    var396 = 4;
                                    var391 = var391.substring(class142.field2203.length());
                                } else if (var395.startsWith(class142.field2357)) {
                                    var396 = 5;
                                    var391 = var391.substring(class142.field2357.length());
                                }
                            }
                            client.field382.method2356(114);
                            client.field382.method2097(0);
                            int var397 = client.field382.field1863;
                            client.field382.method2097(var392);
                            client.field382.method2097(var394);
                            client.field382.method2097(var396);
                            class110 var398 = client.field382;
                            int var399 = var398.field1863;
                            int var400 = var391.length();
                            byte[] var401 = new byte[var400];
                            for (int var402 = 0; var402 < var400; var402++) {
                                char var403 = var391.charAt(var402);
                                if (!(var403 <= 0 || var403 >= 128) || !(var403 < 160 || var403 > 255)) {
                                    var401[var402] = (byte) var403;
                                } else if (var403 == 8364) {
                                    var401[var402] = -128;
                                } else if (var403 == 8218) {
                                    var401[var402] = -126;
                                } else if (var403 == 402) {
                                    var401[var402] = -125;
                                } else if (var403 == 8222) {
                                    var401[var402] = -124;
                                } else if (var403 == 8230) {
                                    var401[var402] = -123;
                                } else if (var403 == 8224) {
                                    var401[var402] = -122;
                                } else if (var403 == 8225) {
                                    var401[var402] = -121;
                                } else if (var403 == 710) {
                                    var401[var402] = -120;
                                } else if (var403 == 8240) {
                                    var401[var402] = -119;
                                } else if (var403 == 352) {
                                    var401[var402] = -118;
                                } else if (var403 == 8249) {
                                    var401[var402] = -117;
                                } else if (var403 == 338) {
                                    var401[var402] = -116;
                                } else if (var403 == 381) {
                                    var401[var402] = -114;
                                } else if (var403 == 8216) {
                                    var401[var402] = -111;
                                } else if (var403 == 8217) {
                                    var401[var402] = -110;
                                } else if (var403 == 8220) {
                                    var401[var402] = -109;
                                } else if (var403 == 8221) {
                                    var401[var402] = -108;
                                } else if (var403 == 8226) {
                                    var401[var402] = -107;
                                } else if (var403 == 8211) {
                                    var401[var402] = -106;
                                } else if (var403 == 8212) {
                                    var401[var402] = -105;
                                } else if (var403 == 732) {
                                    var401[var402] = -104;
                                } else if (var403 == 8482) {
                                    var401[var402] = -103;
                                } else if (var403 == 353) {
                                    var401[var402] = -102;
                                } else if (var403 == 8250) {
                                    var401[var402] = -101;
                                } else if (var403 == 339) {
                                    var401[var402] = -100;
                                } else if (var403 == 382) {
                                    var401[var402] = -98;
                                } else if (var403 == 376) {
                                    var401[var402] = -97;
                                } else {
                                    var401[var402] = 63;
                                }
                            }
                            var398.method2109(var401.length);
                            var398.field1863 += Statics.field2901.method2056(var401, 0, var401.length, var398.field1865, var398.field1863);
                            client.field382.method2108(client.field382.field1863 - var397);
                            continue;
                        }
                        if (var440 == 5009) {
                            var6 -= 2;
                            String var406 = field716[var6];
                            String var407 = field716[var6 + 1];
                            client.field382.method2356(175);
                            client.field382.method2098(0);
                            int var408 = client.field382.field1863;
                            client.field382.method2186(var406);
                            class110 var409 = client.field382;
                            int var410 = var409.field1863;
                            int var411 = var407.length();
                            byte[] var412 = new byte[var411];
                            for (int var413 = 0; var413 < var411; var413++) {
                                char var414 = var407.charAt(var413);
                                if (var414 > 0 && var414 < 128 || var414 >= 160 && var414 <= 255) {
                                    var412[var413] = (byte) var414;
                                } else if (var414 == 8364) {
                                    var412[var413] = -128;
                                } else if (var414 == 8218) {
                                    var412[var413] = -126;
                                } else if (var414 == 402) {
                                    var412[var413] = -125;
                                } else if (var414 == 8222) {
                                    var412[var413] = -124;
                                } else if (var414 == 8230) {
                                    var412[var413] = -123;
                                } else if (var414 == 8224) {
                                    var412[var413] = -122;
                                } else if (var414 == 8225) {
                                    var412[var413] = -121;
                                } else if (var414 == 710) {
                                    var412[var413] = -120;
                                } else if (var414 == 8240) {
                                    var412[var413] = -119;
                                } else if (var414 == 352) {
                                    var412[var413] = -118;
                                } else if (var414 == 8249) {
                                    var412[var413] = -117;
                                } else if (var414 == 338) {
                                    var412[var413] = -116;
                                } else if (var414 == 381) {
                                    var412[var413] = -114;
                                } else if (var414 == 8216) {
                                    var412[var413] = -111;
                                } else if (var414 == 8217) {
                                    var412[var413] = -110;
                                } else if (var414 == 8220) {
                                    var412[var413] = -109;
                                } else if (var414 == 8221) {
                                    var412[var413] = -108;
                                } else if (var414 == 8226) {
                                    var412[var413] = -107;
                                } else if (var414 == 8211) {
                                    var412[var413] = -106;
                                } else if (var414 == 8212) {
                                    var412[var413] = -105;
                                } else if (var414 == 732) {
                                    var412[var413] = -104;
                                } else if (var414 == 8482) {
                                    var412[var413] = -103;
                                } else if (var414 == 353) {
                                    var412[var413] = -102;
                                } else if (var414 == 8250) {
                                    var412[var413] = -101;
                                } else if (var414 == 339) {
                                    var412[var413] = -100;
                                } else if (var414 == 382) {
                                    var412[var413] = -98;
                                } else if (var414 == 376) {
                                    var412[var413] = -97;
                                } else {
                                    var412[var413] = 63;
                                }
                            }
                            var409.method2109(var412.length);
                            var409.field1863 += Statics.field2901.method2056(var412, 0, var412.length, var409.field1865, var409.field1863);
                            client.field382.method2233(client.field382.field1863 - var408);
                            continue;
                        }
                        if (var440 == 5015) {
                            String var417;
                            if (Statics.field555 == null || Statics.field555.field43 == null) {
                                var417 = "";
                            } else {
                                var417 = Statics.field555.field43;
                            }
                            field716[var6++] = var417;
                            continue;
                        }
                        if (var440 == 5016) {
                            field721[var5++] = client.field470;
                            continue;
                        }
                        if (var440 == 5017) {
                            var5--;
                            int var418 = field721[var5];
                            int[] var419 = field721;
                            int var420 = var5++;
                            class24 var421 = (class24) class10.field160.get(var418);
                            int var422;
                            if (var421 == null) {
                                var422 = 0;
                            } else {
                                var422 = var421.method494();
                            }
                            var419[var420] = var422;
                            continue;
                        }
                        if (var440 == 5018) {
                            var5--;
                            int var423 = field721[var5];
                            int[] var424 = field721;
                            int var425 = var5++;
                            class31 var426 = (class31) class10.field152.method3178((long) var423);
                            int var427;
                            if (var426 == null) {
                                var427 = -1;
                            } else if (class10.field153.field2861 == var426.field2866) {
                                var427 = -1;
                            } else {
                                var427 = ((class31) var426.field2866).field700;
                            }
                            var424[var425] = var427;
                            continue;
                        }
                        if (var440 == 5019) {
                            var5--;
                            int var428 = field721[var5];
                            int[] var429 = field721;
                            int var430 = var5++;
                            class31 var431 = (class31) class10.field152.method3178((long) var428);
                            int var432;
                            if (var431 == null) {
                                var432 = -1;
                            } else if (class10.field153.field2861 == var431.field2865) {
                                var432 = -1;
                            } else {
                                var432 = ((class31) var431.field2865).field700;
                            }
                            var429[var430] = var432;
                            continue;
                        }
                        if (var440 == 5020) {
                            var6--;
                            String var433 = field716[var6];
                            if (var433.equalsIgnoreCase("toggleroof")) {
                                Statics.field1087.field134 = !Statics.field1087.field134;
                                class9.method2790();
                                if (Statics.field1087.field134) {
                                    class10.method2663(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method2663(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field423 >= 2) {
                                if (var433.equalsIgnoreCase("fpson")) {
                                    client.field375 = true;
                                }
                                if (var433.equalsIgnoreCase("fpsoff")) {
                                    client.field375 = false;
                                }
                                if (var433.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var433.equalsIgnoreCase("clientdrop")) {
                                    client.method1970();
                                }
                                if (var433.equalsIgnoreCase("errortest") && client.field255 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field382.method2356(75);
                            client.field382.method2097(var433.length() + 1);
                            client.field382.method2186(var433);
                            continue;
                        }
                    }
                }
                if (var440 >= 5600 || var440 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var434 = field721[var5];
                int var435 = field721[var5 + 1];
                if (!client.field371) {
                    client.field337 = var434;
                    client.field511 = var435;
                }
            }
        } catch (Exception var439) {
            StringBuilder var437 = new StringBuilder(30);
            var437.append("").append(var4.field2877).append(" ");
            for (int var438 = field723 - 1; var438 >= 0; var438--) {
                var437.append("").append(field720[var438].field191.field2877).append(" ");
            }
            var437.append("").append(var10);
            class135.method1963(var437.toString(), var439);
        }
    }

    @ObfuscatedName("q.y(II)V")
    public static void method507(int arg0) {
        if (arg0 == -1 || !class152.method565(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2634[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3.field2602 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field8 = var3.field2602;
                method17(var4, 2000000);
            }
        }
    }
}
