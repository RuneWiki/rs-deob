package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ar")
public class class33 {

    @ObfuscatedName("ar.h")
    public static int[] field711 = new int[5];

    @ObfuscatedName("ar.p")
    public static int[][] field712 = new int[5][5000];

    @ObfuscatedName("ar.n")
    public static int[] field710 = new int[1000];

    @ObfuscatedName("ar.o")
    public static String[] field714 = new String[1000];

    @ObfuscatedName("ar.g")
    public static int field725 = 0;

    @ObfuscatedName("ar.z")
    public static class13[] field716 = new class13[50];

    @ObfuscatedName("ar.w")
    public static Calendar field713 = Calendar.getInstance();

    @ObfuscatedName("ar.x")
    public static final String[] field720 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.b(Lb;II)V")
    public static void method127(class1 arg0, int arg1) {
        Object[] var2 = arg0.field12;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method515(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field513;
        int[] var9 = var4.field514;
        byte var10 = -1;
        field725 = 0;
        try {
            Statics.field707 = new int[var4.field516];
            int var11 = 0;
            Statics.field715 = new String[var4.field517];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field13;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2562;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2680;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2562;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2680;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field14;
                    }
                    Statics.field707[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field715[var12++] = var15;
                }
            }
            int var16 = 0;
            label2428: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var376 = var8[var7];
                if (var376 < 100) {
                    if (var376 == 0) {
                        field710[var5++] = var9[var7];
                        continue;
                    }
                    if (var376 == 1) {
                        int var17 = var9[var7];
                        field710[var5++] = class159.field2692[var17];
                        continue;
                    }
                    if (var376 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class159.field2692[var18] = field710[var5];
                        client.method840(var18);
                        continue;
                    }
                    if (var376 == 3) {
                        field714[var6++] = var4.field515[var7];
                        continue;
                    }
                    if (var376 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var376 == 7) {
                        var5 -= 2;
                        if (field710[var5 + 1] != field710[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var376 == 8) {
                        var5 -= 2;
                        if (field710[var5 + 1] == field710[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var376 == 9) {
                        var5 -= 2;
                        if (field710[var5] < field710[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var376 == 10) {
                        var5 -= 2;
                        if (field710[var5] > field710[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var376 == 21) {
                        if (field725 == 0) {
                            return;
                        }
                        class13 var19 = field716[--field725];
                        var4 = var19.field183;
                        var8 = var4.field513;
                        var9 = var4.field514;
                        var7 = var19.field180;
                        Statics.field707 = var19.field181;
                        Statics.field715 = var19.field185;
                        continue;
                    }
                    if (var376 == 25) {
                        int var20 = var9[var7];
                        field710[var5++] = class159.method2741(var20);
                        continue;
                    }
                    if (var376 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field710[var5];
                        class43 var23 = class43.method96(var21);
                        int var24 = var23.field977;
                        int var25 = var23.field978;
                        int var26 = var23.field984;
                        int var27 = class159.field2693[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class159.field2692[var24] = class159.field2692[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var376 == 31) {
                        var5 -= 2;
                        if (field710[var5] <= field710[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var376 == 32) {
                        var5 -= 2;
                        if (field710[var5] >= field710[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var376 == 33) {
                        field710[var5++] = Statics.field707[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var376 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field707[var10001] = field710[var5];
                        continue;
                    }
                    if (var376 == 35) {
                        field714[var6++] = Statics.field715[var9[var7]];
                        continue;
                    }
                    if (var376 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field715[var10001] = field714[var6];
                        continue;
                    }
                    if (var376 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String var30 = class213.method2866(field714, var6, var29);
                        field714[var6++] = var30;
                        continue;
                    }
                    if (var376 == 38) {
                        var5--;
                        continue;
                    }
                    if (var376 == 39) {
                        var6--;
                        continue;
                    }
                    if (var376 == 40) {
                        int var31 = var9[var7];
                        class19 var32 = class19.method515(var31);
                        int[] var33 = new int[var32.field516];
                        String[] var34 = new String[var32.field517];
                        for (int var35 = 0; var35 < var32.field518; var35++) {
                            var33[var35] = field710[var5 - var32.field518 + var35];
                        }
                        for (int var36 = 0; var36 < var32.field521; var36++) {
                            var34[var36] = field714[var6 - var32.field521 + var36];
                        }
                        var5 -= var32.field518;
                        var6 -= var32.field521;
                        class13 var37 = new class13();
                        var37.field183 = var4;
                        var37.field180 = var7;
                        var37.field181 = Statics.field707;
                        var37.field185 = Statics.field715;
                        field716[++field725 - 1] = var37;
                        var4 = var32;
                        var8 = var32.field513;
                        var9 = var32.field514;
                        var7 = -1;
                        Statics.field707 = var33;
                        Statics.field715 = var34;
                        continue;
                    }
                    if (var376 == 42) {
                        field710[var5++] = client.field427[var9[var7]];
                        continue;
                    }
                    if (var376 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field427[var10001] = field710[var5];
                        continue;
                    }
                    if (var376 == 44) {
                        int var38 = var9[var7] >> 16;
                        int var39 = var9[var7] & 0xFFFF;
                        var5--;
                        int var40 = field710[var5];
                        if (var40 >= 0 && var40 <= 5000) {
                            field711[var38] = var40;
                            byte var41 = -1;
                            if (var39 == 105) {
                                var41 = 0;
                            }
                            int var42 = 0;
                            while (true) {
                                if (var42 >= var40) {
                                    continue label2428;
                                }
                                field712[var38][var42] = var41;
                                var42++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var376 == 45) {
                        int var43 = var9[var7];
                        var5--;
                        int var44 = field710[var5];
                        if (var44 >= 0 && var44 < field711[var43]) {
                            field710[var5++] = field712[var43][var44];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var376 == 46) {
                        int var45 = var9[var7];
                        var5 -= 2;
                        int var46 = field710[var5];
                        if (var46 >= 0 && var46 < field711[var45]) {
                            field712[var45][var46] = field710[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var376 == 47) {
                        String var47 = client.field440[var9[var7]];
                        if (var47 == null) {
                            var47 = "null";
                        }
                        field714[var6++] = var47;
                        continue;
                    }
                    if (var376 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field440[var10001] = field714[var6];
                        continue;
                    }
                }
                boolean var48;
                if (var9[var7] == 1) {
                    var48 = true;
                } else {
                    var48 = false;
                }
                if (var376 < 1000) {
                    if (var376 == 100) {
                        var5 -= 3;
                        int var49 = field710[var5];
                        int var50 = field710[var5 + 1];
                        int var51 = field710[var5 + 2];
                        if (var50 == 0) {
                            throw new RuntimeException();
                        }
                        class157 var52 = class157.method835(var49);
                        if (var52.field2630 == null) {
                            var52.field2630 = new class157[var51 + 1];
                        }
                        if (var52.field2630.length <= var51) {
                            class157[] var53 = new class157[var51 + 1];
                            for (int var54 = 0; var54 < var52.field2630.length; var54++) {
                                var53[var54] = var52.field2630[var54];
                            }
                            var52.field2630 = var53;
                        }
                        if (var51 > 0 && var52.field2630[var51 - 1] == null) {
                            throw new RuntimeException("" + (var51 - 1));
                        }
                        class157 var55 = new class157();
                        var55.field2564 = var50;
                        var55.field2611 = var55.field2562 = var52.field2562;
                        var55.field2680 = var51;
                        var55.field2561 = true;
                        var52.field2630[var51] = var55;
                        if (var48) {
                            Statics.field718 = var55;
                        } else {
                            Statics.field717 = var55;
                        }
                        client.method3452(var52);
                        continue;
                    }
                    if (var376 == 101) {
                        class157 var56 = var48 ? Statics.field718 : Statics.field717;
                        class157 var57 = class157.method835(var56.field2562);
                        var57.field2630[var56.field2680] = null;
                        client.method3452(var57);
                        continue;
                    }
                    if (var376 == 102) {
                        var5--;
                        class157 var58 = class157.method835(field710[var5]);
                        var58.field2630 = null;
                        client.method3452(var58);
                        continue;
                    }
                    if (var376 == 200) {
                        var5 -= 2;
                        int var59 = field710[var5];
                        int var60 = field710[var5 + 1];
                        class157 var61 = class157.method1871(var59, var60);
                        if (var61 != null && var60 != -1) {
                            field710[var5++] = 1;
                            if (var48) {
                                Statics.field718 = var61;
                            } else {
                                Statics.field717 = var61;
                            }
                            continue;
                        }
                        field710[var5++] = 0;
                        continue;
                    }
                } else if (var376 >= 1000 && var376 < 1100 || var376 >= 2000 && var376 < 2100) {
                    class157 var62;
                    if (var376 >= 2000) {
                        var376 -= 1000;
                        var5--;
                        var62 = class157.method835(field710[var5]);
                    } else {
                        var62 = var48 ? Statics.field718 : Statics.field717;
                    }
                    if (var376 == 1000) {
                        var5 -= 2;
                        var62.field2567 = field710[var5];
                        var62.field2643 = field710[var5 + 1];
                        client.method3452(var62);
                        continue;
                    }
                    if (var376 == 1001) {
                        var5 -= 2;
                        var62.field2594 = field710[var5];
                        var62.field2617 = field710[var5 + 1];
                        client.method3452(var62);
                        continue;
                    }
                    if (var376 == 1003) {
                        var5--;
                        boolean var63 = field710[var5] == 1;
                        if (var62.field2633 != var63) {
                            var62.field2633 = var63;
                            client.method3452(var62);
                        }
                        continue;
                    }
                } else if (!(var376 < 1100 || var376 >= 1200) || !(var376 < 2100 || var376 >= 2200)) {
                    class157 var64;
                    if (var376 >= 2000) {
                        var376 -= 1000;
                        var5--;
                        var64 = class157.method835(field710[var5]);
                    } else {
                        var64 = var48 ? Statics.field718 : Statics.field717;
                    }
                    if (var376 == 1100) {
                        var5 -= 2;
                        var64.field2575 = field710[var5];
                        if (var64.field2575 > var64.field2577 - var64.field2594) {
                            var64.field2575 = var64.field2577 - var64.field2594;
                        }
                        if (var64.field2575 < 0) {
                            var64.field2575 = 0;
                        }
                        var64.field2568 = field710[var5 + 1];
                        if (var64.field2568 > var64.field2662 - var64.field2617) {
                            var64.field2568 = var64.field2662 - var64.field2617;
                        }
                        if (var64.field2568 < 0) {
                            var64.field2568 = 0;
                        }
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1101) {
                        var5--;
                        var64.field2579 = field710[var5];
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1102) {
                        var5--;
                        var64.field2583 = field710[var5] == 1;
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1103) {
                        var5--;
                        var64.field2584 = field710[var5];
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1104) {
                        var5--;
                        var64.field2585 = field710[var5];
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1105) {
                        var5--;
                        var64.field2586 = field710[var5];
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1106) {
                        var5--;
                        var64.field2588 = field710[var5];
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1107) {
                        var5--;
                        var64.field2642 = field710[var5] == 1;
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1108) {
                        var64.field2653 = 1;
                        var5--;
                        var64.field2571 = field710[var5];
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1109) {
                        var5 -= 6;
                        var64.field2573 = field710[var5];
                        var64.field2682 = field710[var5 + 1];
                        var64.field2602 = field710[var5 + 2];
                        var64.field2603 = field710[var5 + 3];
                        var64.field2604 = field710[var5 + 4];
                        var64.field2605 = field710[var5 + 5];
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1110) {
                        var5--;
                        int var65 = field710[var5];
                        if (var64.field2598 != var65) {
                            var64.field2598 = var65;
                            var64.field2671 = 0;
                            var64.field2672 = 0;
                            client.method3452(var64);
                        }
                        continue;
                    }
                    if (var376 == 1111) {
                        var5--;
                        var64.field2600 = field710[var5] == 1;
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1112) {
                        var6--;
                        String var66 = field714[var6];
                        if (!var66.equals(var64.field2610)) {
                            var64.field2610 = var66;
                            client.method3452(var64);
                        }
                        continue;
                    }
                    if (var376 == 1113) {
                        var5--;
                        var64.field2609 = field710[var5];
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1114) {
                        var5 -= 3;
                        var64.field2613 = field710[var5];
                        var64.field2614 = field710[var5 + 1];
                        var64.field2612 = field710[var5 + 2];
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1115) {
                        var5--;
                        var64.field2615 = field710[var5] == 1;
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1116) {
                        var5--;
                        var64.field2599 = field710[var5];
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1117) {
                        var5--;
                        var64.field2601 = field710[var5];
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1118) {
                        var5--;
                        var64.field2592 = field710[var5] == 1;
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1119) {
                        var5--;
                        var64.field2676 = field710[var5] == 1;
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1120) {
                        var5 -= 2;
                        var64.field2577 = field710[var5];
                        var64.field2662 = field710[var5 + 1];
                        client.method3452(var64);
                        continue;
                    }
                    if (var376 == 1121) {
                        client.method477(var64.field2562, var64.field2680);
                        client.field406 = var64;
                        client.method3452(var64);
                        continue;
                    }
                } else if (!(var376 < 1200 || var376 >= 1300) || !(var376 < 2200 || var376 >= 2300)) {
                    class157 var67;
                    if (var376 >= 2000) {
                        var376 -= 1000;
                        var5--;
                        var67 = class157.method835(field710[var5]);
                    } else {
                        var67 = var48 ? Statics.field718 : Statics.field717;
                    }
                    client.method3452(var67);
                    if (var376 == 1200 || var376 == 1205 || var376 == 1212) {
                        var5 -= 2;
                        int var68 = field710[var5];
                        int var69 = field710[var5 + 1];
                        var67.field2669 = var68;
                        var67.field2670 = var69;
                        class46 var70 = class46.method2398(var68);
                        var67.field2602 = var70.field1049;
                        var67.field2603 = var70.field1029;
                        var67.field2604 = var70.field1059;
                        var67.field2573 = var70.field1013;
                        var67.field2682 = var70.field1032;
                        var67.field2605 = var70.field1027;
                        if (var376 == 1205) {
                            var67.field2629 = 0;
                        } else if (var376 == 1212 | var70.field1022 == 1) {
                            var67.field2629 = 1;
                        } else {
                            var67.field2629 = 2;
                        }
                        if (var67.field2594 > 0) {
                            var67.field2605 = var67.field2605 * 32 / var67.field2594;
                        }
                        continue;
                    }
                    if (var376 == 1201) {
                        var67.field2653 = 2;
                        var5--;
                        var67.field2571 = field710[var5];
                        continue;
                    }
                    if (var376 == 1202) {
                        var67.field2653 = 3;
                        var67.field2571 = Statics.field920.field36.method2972();
                        continue;
                    }
                } else if ((var376 < 1300 || var376 >= 1400) && (var376 < 2300 || var376 >= 2400)) {
                    if (var376 >= 1400 && var376 < 1500 || var376 >= 2400 && var376 < 2500) {
                        class157 var75;
                        if (var376 >= 2000) {
                            var376 -= 1000;
                            var5--;
                            var75 = class157.method835(field710[var5]);
                        } else {
                            var75 = var48 ? Statics.field718 : Statics.field717;
                        }
                        var6--;
                        String var76 = field714[var6];
                        int[] var77 = null;
                        if (var76.length() > 0 && var76.charAt(var76.length() - 1) == 'Y') {
                            var5--;
                            int var78 = field710[var5];
                            if (var78 > 0) {
                                var77 = new int[var78];
                                while (var78-- > 0) {
                                    var5--;
                                    var77[var78] = field710[var5];
                                }
                            }
                            var76 = var76.substring(0, var76.length() - 1);
                        }
                        Object[] var79 = new Object[var76.length() + 1];
                        for (int var80 = var79.length - 1; var80 >= 1; var80--) {
                            if (var76.charAt(var80 - 1) == 's') {
                                var6--;
                                var79[var80] = field714[var6];
                            } else {
                                var5--;
                                var79[var80] = Integer.valueOf(field710[var5]);
                            }
                        }
                        var5--;
                        int var81 = field710[var5];
                        if (var81 == -1) {
                            var79 = null;
                        } else {
                            var79[0] = Integer.valueOf(var81);
                        }
                        if (var376 == 1400) {
                            var75.field2553 = var79;
                        }
                        if (var376 == 1401) {
                            var75.field2635 = var79;
                        }
                        if (var376 == 1402) {
                            var75.field2634 = var79;
                        }
                        if (var376 == 1403) {
                            var75.field2636 = var79;
                        }
                        if (var376 == 1404) {
                            var75.field2660 = var79;
                        }
                        if (var376 == 1405) {
                            var75.field2655 = var79;
                        }
                        if (var376 == 1406) {
                            var75.field2572 = var79;
                        }
                        if (var376 == 1407) {
                            var75.field2621 = var79;
                            var75.field2644 = var77;
                        }
                        if (var376 == 1408) {
                            var75.field2649 = var79;
                        }
                        if (var376 == 1409) {
                            var75.field2650 = var79;
                        }
                        if (var376 == 1410) {
                            var75.field2681 = var79;
                        }
                        if (var376 == 1411) {
                            var75.field2589 = var79;
                        }
                        if (var376 == 1412) {
                            var75.field2637 = var79;
                        }
                        if (var376 == 1414) {
                            var75.field2645 = var79;
                            var75.field2646 = var77;
                        }
                        if (var376 == 1415) {
                            var75.field2647 = var79;
                            var75.field2648 = var77;
                        }
                        if (var376 == 1416) {
                            var75.field2641 = var79;
                        }
                        if (var376 == 1417) {
                            var75.field2590 = var79;
                        }
                        if (var376 == 1418) {
                            var75.field2595 = var79;
                        }
                        if (var376 == 1419) {
                            var75.field2608 = var79;
                        }
                        if (var376 == 1420) {
                            var75.field2654 = var79;
                        }
                        if (var376 == 1421) {
                            var75.field2554 = var79;
                        }
                        if (var376 == 1422) {
                            var75.field2656 = var79;
                        }
                        if (var376 == 1423) {
                            var75.field2657 = var79;
                        }
                        if (var376 == 1424) {
                            var75.field2658 = var79;
                        }
                        if (var376 == 1425) {
                            var75.field2659 = var79;
                        }
                        if (var376 == 1426) {
                            var75.field2578 = var79;
                        }
                        var75.field2638 = true;
                        continue;
                    }
                    if (var376 < 1600) {
                        class157 var82 = var48 ? Statics.field718 : Statics.field717;
                        if (var376 == 1500) {
                            field710[var5++] = var82.field2567;
                            continue;
                        }
                        if (var376 == 1501) {
                            field710[var5++] = var82.field2643;
                            continue;
                        }
                        if (var376 == 1502) {
                            field710[var5++] = var82.field2594;
                            continue;
                        }
                        if (var376 == 1503) {
                            field710[var5++] = var82.field2617;
                            continue;
                        }
                        if (var376 == 1504) {
                            field710[var5++] = var82.field2633 ? 1 : 0;
                            continue;
                        }
                        if (var376 == 1505) {
                            field710[var5++] = var82.field2611;
                            continue;
                        }
                    } else if (var376 < 1700) {
                        class157 var83 = var48 ? Statics.field718 : Statics.field717;
                        if (var376 == 1600) {
                            field710[var5++] = var83.field2575;
                            continue;
                        }
                        if (var376 == 1601) {
                            field710[var5++] = var83.field2568;
                            continue;
                        }
                        if (var376 == 1602) {
                            field714[var6++] = var83.field2610;
                            continue;
                        }
                        if (var376 == 1603) {
                            field710[var5++] = var83.field2577;
                            continue;
                        }
                        if (var376 == 1604) {
                            field710[var5++] = var83.field2662;
                            continue;
                        }
                        if (var376 == 1605) {
                            field710[var5++] = var83.field2605;
                            continue;
                        }
                        if (var376 == 1606) {
                            field710[var5++] = var83.field2602;
                            continue;
                        }
                        if (var376 == 1607) {
                            field710[var5++] = var83.field2604;
                            continue;
                        }
                        if (var376 == 1608) {
                            field710[var5++] = var83.field2603;
                            continue;
                        }
                    } else if (var376 < 1800) {
                        class157 var84 = var48 ? Statics.field718 : Statics.field717;
                        if (var376 == 1700) {
                            field710[var5++] = var84.field2669;
                            continue;
                        }
                        if (var376 == 1701) {
                            if (var84.field2669 == -1) {
                                field710[var5++] = 0;
                            } else {
                                field710[var5++] = var84.field2670;
                            }
                            continue;
                        }
                        if (var376 == 1702) {
                            field710[var5++] = var84.field2680;
                            continue;
                        }
                    } else if (var376 < 1900) {
                        class157 var85 = var48 ? Statics.field718 : Statics.field717;
                        if (var376 == 1800) {
                            field710[var5++] = class161.method2892(client.method153(var85));
                            continue;
                        }
                        if (var376 == 1801) {
                            var5--;
                            int var86 = field710[var5];
                            int var377 = var86 - 1;
                            if (var85.field2624 != null && var377 < var85.field2624.length && var85.field2624[var377] != null) {
                                field714[var6++] = var85.field2624[var377];
                                continue;
                            }
                            field714[var6++] = "";
                            continue;
                        }
                        if (var376 == 1802) {
                            if (var85.field2566 == null) {
                                field714[var6++] = "";
                            } else {
                                field714[var6++] = var85.field2566;
                            }
                            continue;
                        }
                    } else if (var376 < 2600) {
                        var5--;
                        class157 var87 = class157.method835(field710[var5]);
                        if (var376 == 2500) {
                            field710[var5++] = var87.field2567;
                            continue;
                        }
                        if (var376 == 2501) {
                            field710[var5++] = var87.field2643;
                            continue;
                        }
                        if (var376 == 2502) {
                            field710[var5++] = var87.field2594;
                            continue;
                        }
                        if (var376 == 2503) {
                            field710[var5++] = var87.field2617;
                            continue;
                        }
                        if (var376 == 2504) {
                            field710[var5++] = var87.field2633 ? 1 : 0;
                            continue;
                        }
                        if (var376 == 2505) {
                            field710[var5++] = var87.field2611;
                            continue;
                        }
                    } else if (var376 < 2700) {
                        var5--;
                        class157 var88 = class157.method835(field710[var5]);
                        if (var376 == 2600) {
                            field710[var5++] = var88.field2575;
                            continue;
                        }
                        if (var376 == 2601) {
                            field710[var5++] = var88.field2568;
                            continue;
                        }
                        if (var376 == 2602) {
                            field714[var6++] = var88.field2610;
                            continue;
                        }
                        if (var376 == 2603) {
                            field710[var5++] = var88.field2577;
                            continue;
                        }
                        if (var376 == 2604) {
                            field710[var5++] = var88.field2662;
                            continue;
                        }
                        if (var376 == 2605) {
                            field710[var5++] = var88.field2605;
                            continue;
                        }
                        if (var376 == 2606) {
                            field710[var5++] = var88.field2602;
                            continue;
                        }
                        if (var376 == 2607) {
                            field710[var5++] = var88.field2604;
                            continue;
                        }
                        if (var376 == 2608) {
                            field710[var5++] = var88.field2603;
                            continue;
                        }
                    } else if (var376 < 2800) {
                        if (var376 == 2700) {
                            var5--;
                            class157 var89 = class157.method835(field710[var5]);
                            field710[var5++] = var89.field2669;
                            continue;
                        }
                        if (var376 == 2701) {
                            var5--;
                            class157 var90 = class157.method835(field710[var5]);
                            if (var90.field2669 == -1) {
                                field710[var5++] = 0;
                            } else {
                                field710[var5++] = var90.field2670;
                            }
                            continue;
                        }
                        if (var376 == 2702) {
                            var5--;
                            int var91 = field710[var5];
                            class4 var92 = (class4) client.field403.method3257((long) var91);
                            if (var92 == null) {
                                field710[var5++] = 0;
                            } else {
                                field710[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var376 < 2900) {
                        var5--;
                        class157 var93 = class157.method835(field710[var5]);
                        if (var376 == 2800) {
                            field710[var5++] = class161.method2892(client.method153(var93));
                            continue;
                        }
                        if (var376 == 2801) {
                            var5--;
                            int var94 = field710[var5];
                            int var378 = var94 - 1;
                            if (var93.field2624 != null && var378 < var93.field2624.length && var93.field2624[var378] != null) {
                                field714[var6++] = var93.field2624[var378];
                                continue;
                            }
                            field714[var6++] = "";
                            continue;
                        }
                        if (var376 == 2802) {
                            if (var93.field2566 == null) {
                                field714[var6++] = "";
                            } else {
                                field714[var6++] = var93.field2566;
                            }
                            continue;
                        }
                    } else if (var376 < 3200) {
                        if (var376 == 3100) {
                            var6--;
                            String var95 = field714[var6];
                            class10.method691(0, "", var95);
                            continue;
                        }
                        if (var376 == 3101) {
                            var5 -= 2;
                            client.method145(Statics.field920, field710[var5], field710[var5 + 1]);
                            continue;
                        }
                        if (var376 == 3103) {
                            client.field281.method2381(251);
                            for (class4 var96 = (class4) client.field403.method3260(); var96 != null; var96 = (class4) client.field403.method3261()) {
                                if (var96.field64 == 0 || var96.field64 == 3) {
                                    client.method31(var96, true);
                                }
                            }
                            if (client.field406 != null) {
                                client.method3452(client.field406);
                                client.field406 = null;
                            }
                            continue;
                        }
                        if (var376 == 3104) {
                            var6--;
                            String var97 = field714[var6];
                            int var98 = 0;
                            boolean var99 = class213.method128(var97, 10, true);
                            if (var99) {
                                var98 = class213.method156(var97);
                            }
                            client.field281.method2381(203);
                            client.field281.method2131(var98);
                            continue;
                        }
                        if (var376 == 3105) {
                            var6--;
                            String var100 = field714[var6];
                            client.field281.method2381(90);
                            client.field281.method2203(var100.length() + 1);
                            client.field281.method2133(var100);
                            continue;
                        }
                        if (var376 == 3106) {
                            var6--;
                            String var101 = field714[var6];
                            client.field281.method2381(87);
                            client.field281.method2203(var101.length() + 1);
                            client.field281.method2133(var101);
                            continue;
                        }
                        if (var376 == 3107) {
                            var5--;
                            int var102 = field710[var5];
                            var6--;
                            String var103 = field714[var6];
                            boolean var104 = false;
                            for (int var105 = 0; var105 < client.field478; var105++) {
                                class3 var106 = client.field401[client.field247[var105]];
                                if (var106 != null && var106.field46 != null && var106.field46.equalsIgnoreCase(var103)) {
                                    if (var102 == 1) {
                                        client.field281.method2381(72);
                                        client.field281.method2172(client.field247[var105]);
                                        client.field281.method2203(0);
                                    } else if (var102 == 4) {
                                        client.field281.method2381(49);
                                        client.field281.method2203(0);
                                        client.field281.method2267(client.field247[var105]);
                                    } else if (var102 == 6) {
                                        client.field281.method2381(187);
                                        client.field281.method2173(client.field247[var105]);
                                        client.field281.method2163(0);
                                    } else if (var102 == 7) {
                                        client.field281.method2381(173);
                                        client.field281.method2165(0);
                                        client.field281.method2172(client.field247[var105]);
                                    }
                                    var104 = true;
                                    break;
                                }
                            }
                            if (!var104) {
                                class10.method691(4, "", class147.field2324 + var103);
                            }
                            continue;
                        }
                        if (var376 == 3108) {
                            var5 -= 3;
                            int var107 = field710[var5];
                            int var108 = field710[var5 + 1];
                            int var109 = field710[var5 + 2];
                            class157 var110 = class157.method835(var109);
                            client.method1010(var110, var107, var108);
                            continue;
                        }
                        if (var376 == 3109) {
                            var5 -= 2;
                            int var111 = field710[var5];
                            int var112 = field710[var5 + 1];
                            class157 var113 = var48 ? Statics.field718 : Statics.field717;
                            client.method1010(var113, var111, var112);
                            continue;
                        }
                        if (var376 == 3110) {
                            var5--;
                            Statics.field2049 = field710[var5] == 1;
                            continue;
                        }
                        if (var376 == 3111) {
                            field710[var5++] = Statics.field1422.field135 ? 1 : 0;
                            continue;
                        }
                        if (var376 == 3112) {
                            var5--;
                            Statics.field1422.field135 = field710[var5] == 1;
                            class9.method2557();
                            continue;
                        }
                        if (var376 == 3113) {
                            var6--;
                            String var114 = field714[var6];
                            var5--;
                            boolean var115 = field710[var5] == 1;
                            class129.method531(var114, var115, false);
                            continue;
                        }
                        if (var376 == 3115) {
                            var5--;
                            int var116 = field710[var5];
                            client.field281.method2381(255);
                            client.field281.method2267(var116);
                            continue;
                        }
                    } else if (var376 < 3300) {
                        if (var376 == 3200) {
                            var5 -= 3;
                            client.method1956(field710[var5], field710[var5 + 1], field710[var5 + 2]);
                            continue;
                        }
                        if (var376 == 3201) {
                            var5--;
                            client.method63(field710[var5]);
                            continue;
                        }
                        if (var376 == 3202) {
                            var5 -= 2;
                            int var117 = field710[var5];
                            int var10000 = field710[var5 + 1];
                            if (client.field433 != 0 && var117 != -1) {
                                class166.method2949(Statics.field1510, var117, 0, client.field433, false);
                                client.field448 = true;
                            }
                            continue;
                        }
                    } else if (var376 < 3400) {
                        if (var376 == 3300) {
                            field710[var5++] = client.field249;
                            continue;
                        }
                        if (var376 == 3301) {
                            var5 -= 2;
                            int var119 = field710[var5];
                            int var120 = field710[var5 + 1];
                            field710[var5++] = class14.method605(var119, var120);
                            continue;
                        }
                        if (var376 == 3302) {
                            var5 -= 2;
                            int var121 = field710[var5];
                            int var122 = field710[var5 + 1];
                            int[] var123 = field710;
                            int var124 = var5++;
                            class14 var125 = (class14) class14.field195.method3257((long) var121);
                            int var126;
                            if (var125 == null) {
                                var126 = 0;
                            } else if (var122 >= 0 && var122 < var125.field192.length) {
                                var126 = var125.field192[var122];
                            } else {
                                var126 = 0;
                            }
                            var123[var124] = var126;
                            continue;
                        }
                        if (var376 == 3303) {
                            var5 -= 2;
                            int var127 = field710[var5];
                            int var128 = field710[var5 + 1];
                            field710[var5++] = class14.method1860(var127, var128);
                            continue;
                        }
                        if (var376 == 3304) {
                            var5--;
                            int var129 = field710[var5];
                            int[] var130 = field710;
                            int var131 = var5++;
                            class45 var132 = (class45) class45.field1002.method3218((long) var129);
                            class45 var133;
                            if (var132 == null) {
                                byte[] var134 = Statics.field1003.method2761(5, var129);
                                class45 var135 = new class45();
                                if (var134 != null) {
                                    var135.method841(new class110(var134));
                                }
                                class45.field1002.method3220(var135, (long) var129);
                                var133 = var135;
                            } else {
                                var133 = var132;
                            }
                            var130[var131] = var133.field1001;
                            continue;
                        }
                        if (var376 == 3305) {
                            var5--;
                            int var136 = field710[var5];
                            field710[var5++] = client.field379[var136];
                            continue;
                        }
                        if (var376 == 3306) {
                            var5--;
                            int var137 = field710[var5];
                            field710[var5++] = client.field430[var137];
                            continue;
                        }
                        if (var376 == 3307) {
                            var5--;
                            int var138 = field710[var5];
                            field710[var5++] = client.field381[var138];
                            continue;
                        }
                        if (var376 == 3308) {
                            int var139 = Statics.field788;
                            int var140 = (Statics.field920.field731 >> 7) + Statics.field842;
                            int var141 = (Statics.field920.field787 >> 7) + Statics.field176;
                            field710[var5++] = (var139 << 28) + (var140 << 14) + var141;
                            continue;
                        }
                        if (var376 == 3309) {
                            var5--;
                            int var142 = field710[var5];
                            field710[var5++] = var142 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var376 == 3310) {
                            var5--;
                            int var143 = field710[var5];
                            field710[var5++] = var143 >> 28;
                            continue;
                        }
                        if (var376 == 3311) {
                            var5--;
                            int var144 = field710[var5];
                            field710[var5++] = var144 & 0x3FFF;
                            continue;
                        }
                        if (var376 == 3312) {
                            field710[var5++] = client.field435 ? 1 : 0;
                            continue;
                        }
                        if (var376 == 3313) {
                            var5 -= 2;
                            int var145 = field710[var5] + 32768;
                            int var146 = field710[var5 + 1];
                            field710[var5++] = class14.method605(var145, var146);
                            continue;
                        }
                        if (var376 == 3314) {
                            var5 -= 2;
                            int var147 = field710[var5] + 32768;
                            int var148 = field710[var5 + 1];
                            int[] var149 = field710;
                            int var150 = var5++;
                            class14 var151 = (class14) class14.field195.method3257((long) var147);
                            int var152;
                            if (var151 == null) {
                                var152 = 0;
                            } else if (var148 >= 0 && var148 < var151.field192.length) {
                                var152 = var151.field192[var148];
                            } else {
                                var152 = 0;
                            }
                            var149[var150] = var152;
                            continue;
                        }
                        if (var376 == 3315) {
                            var5 -= 2;
                            int var153 = field710[var5] + 32768;
                            int var154 = field710[var5 + 1];
                            field710[var5++] = class14.method1860(var153, var154);
                            continue;
                        }
                        if (var376 == 3316) {
                            if (client.field409 >= 2) {
                                field710[var5++] = client.field409;
                            } else {
                                field710[var5++] = 0;
                            }
                            continue;
                        }
                        if (var376 == 3317) {
                            field710[var5++] = client.field259;
                            continue;
                        }
                        if (var376 == 3318) {
                            field710[var5++] = client.field443;
                            continue;
                        }
                        if (var376 == 3321) {
                            field710[var5++] = client.field407;
                            continue;
                        }
                        if (var376 == 3322) {
                            field710[var5++] = client.field408;
                            continue;
                        }
                        if (var376 == 3323) {
                            if (client.field411) {
                                field710[var5++] = 1;
                            } else {
                                field710[var5++] = 0;
                            }
                            continue;
                        }
                        if (var376 == 3324) {
                            field710[var5++] = client.field241;
                            continue;
                        }
                    } else if (var376 < 3500) {
                        if (var376 == 3400) {
                            var5 -= 2;
                            int var155 = field710[var5];
                            int var156 = field710[var5 + 1];
                            class44 var157 = (class44) class44.field988.method3218((long) var155);
                            class44 var158;
                            if (var157 == null) {
                                byte[] var159 = Statics.field993.method2761(8, var155);
                                class44 var160 = new class44();
                                if (var159 != null) {
                                    var160.method836(new class110(var159));
                                }
                                class44.field988.method3220(var160, (long) var155);
                                var158 = var160;
                            } else {
                                var158 = var157;
                            }
                            class44 var161 = var158;
                            if (var158.field990 != 's') {
                            }
                            for (int var162 = 0; var162 < var161.field992; var162++) {
                                if (var161.field996[var162] == var156) {
                                    field714[var6++] = var161.field999[var162];
                                    var161 = null;
                                    break;
                                }
                            }
                            if (var161 != null) {
                                field714[var6++] = var161.field991;
                            }
                            continue;
                        }
                        if (var376 == 3408) {
                            var5 -= 4;
                            int var163 = field710[var5];
                            int var164 = field710[var5 + 1];
                            int var165 = field710[var5 + 2];
                            int var166 = field710[var5 + 3];
                            class44 var167 = (class44) class44.field988.method3218((long) var165);
                            class44 var168;
                            if (var167 == null) {
                                byte[] var169 = Statics.field993.method2761(8, var165);
                                class44 var170 = new class44();
                                if (var169 != null) {
                                    var170.method836(new class110(var169));
                                }
                                class44.field988.method3220(var170, (long) var165);
                                var168 = var170;
                            } else {
                                var168 = var167;
                            }
                            class44 var171 = var168;
                            if (var168.field989 == var163 && var168.field990 == var164) {
                                for (int var172 = 0; var172 < var171.field992; var172++) {
                                    if (var171.field996[var172] == var166) {
                                        if (var164 == 115) {
                                            field714[var6++] = var171.field999[var172];
                                        } else {
                                            field710[var5++] = var171.field995[var172];
                                        }
                                        var171 = null;
                                        break;
                                    }
                                }
                                if (var171 != null) {
                                    if (var164 == 115) {
                                        field714[var6++] = var171.field991;
                                    } else {
                                        field710[var5++] = var171.field987;
                                    }
                                }
                                continue;
                            }
                            if (var164 == 115) {
                                field714[var6++] = "null";
                            } else {
                                field710[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var376 < 3700) {
                        if (var376 == 3600) {
                            if (client.field304 == 0) {
                                field710[var5++] = -2;
                            } else if (client.field304 == 1) {
                                field710[var5++] = -1;
                            } else {
                                field710[var5++] = client.field267;
                            }
                            continue;
                        }
                        if (var376 == 3601) {
                            var5--;
                            int var173 = field710[var5];
                            if (client.field304 == 2 && var173 < client.field267) {
                                field714[var6++] = client.field258[var173].field222;
                                field714[var6++] = client.field258[var173].field218;
                                continue;
                            }
                            field714[var6++] = "";
                            field714[var6++] = "";
                            continue;
                        }
                        if (var376 == 3602) {
                            var5--;
                            int var174 = field710[var5];
                            if (client.field304 == 2 && var174 < client.field267) {
                                field710[var5++] = client.field258[var174].field217;
                                continue;
                            }
                            field710[var5++] = 0;
                            continue;
                        }
                        if (var376 == 3603) {
                            var5--;
                            int var175 = field710[var5];
                            if (client.field304 == 2 && var175 < client.field267) {
                                field710[var5++] = client.field258[var175].field220;
                                continue;
                            }
                            field710[var5++] = 0;
                            continue;
                        }
                        if (var376 == 3604) {
                            var6--;
                            String var176 = field714[var6];
                            var5--;
                            int var177 = field710[var5];
                            client.field281.method2381(179);
                            client.field281.method2203(class110.method1954(var176) + 1);
                            client.field281.method2133(var176);
                            client.field281.method2163(var177);
                            continue;
                        }
                        if (var376 == 3605) {
                            var6--;
                            String var178 = field714[var6];
                            client.method646(var178);
                            continue;
                        }
                        if (var376 == 3606) {
                            var6--;
                            String var179 = field714[var6];
                            Statics.method1867(var179);
                            continue;
                        }
                        if (var376 == 3607) {
                            var6--;
                            String var180 = field714[var6];
                            client.method2860(var180, false);
                            continue;
                        }
                        if (var376 == 3608) {
                            var6--;
                            String var181 = field714[var6];
                            client.method672(var181);
                            continue;
                        }
                        if (var376 == 3609) {
                            var6--;
                            String var182 = field714[var6];
                            class142[] var183 = new class142[] { class142.field2127, class142.field2128, class142.field2135, class142.field2129, class142.field2130 };
                            class142[] var184 = var183;
                            for (int var185 = 0; var185 < var184.length; var185++) {
                                class142 var186 = var184[var185];
                                if (var186.field2132 != -1) {
                                    int var188 = var186.field2132;
                                    String var189 = "<img=" + var188 + ">";
                                    if (var182.startsWith(var189)) {
                                        var182 = var182.substring(6 + Integer.toString(var186.field2132).length());
                                        break;
                                    }
                                }
                            }
                            field710[var5++] = client.method65(var182, false) ? 1 : 0;
                            continue;
                        }
                        if (var376 == 3611) {
                            if (client.field495 == null) {
                                field714[var6++] = "";
                            } else {
                                field714[var6++] = class212.method444(client.field495);
                            }
                            continue;
                        }
                        if (var376 == 3612) {
                            if (client.field495 == null) {
                                field710[var5++] = 0;
                            } else {
                                field710[var5++] = Statics.field1896;
                            }
                            continue;
                        }
                        if (var376 == 3613) {
                            var5--;
                            int var190 = field710[var5];
                            if (client.field495 != null && var190 < Statics.field1896) {
                                field714[var6++] = Statics.field1429[var190].field559;
                                continue;
                            }
                            field714[var6++] = "";
                            continue;
                        }
                        if (var376 == 3614) {
                            var5--;
                            int var191 = field710[var5];
                            if (client.field495 != null && var191 < Statics.field1896) {
                                field710[var5++] = Statics.field1429[var191].field560;
                                continue;
                            }
                            field710[var5++] = 0;
                            continue;
                        }
                        if (var376 == 3615) {
                            var5--;
                            int var192 = field710[var5];
                            if (client.field495 != null && var192 < Statics.field1896) {
                                field710[var5++] = Statics.field1429[var192].field562;
                                continue;
                            }
                            field710[var5++] = 0;
                            continue;
                        }
                        if (var376 == 3616) {
                            field710[var5++] = Statics.field581;
                            continue;
                        }
                        if (var376 == 3617) {
                            var6--;
                            String var193 = field714[var6];
                            if (Statics.field1429 != null) {
                                client.field281.method2381(184);
                                client.field281.method2203(class110.method1954(var193));
                                client.field281.method2133(var193);
                            }
                            continue;
                        }
                        if (var376 == 3618) {
                            field710[var5++] = Statics.field148;
                            continue;
                        }
                        if (var376 == 3619) {
                            var6--;
                            String var194 = field714[var6];
                            client.method2086(var194);
                            continue;
                        }
                        if (var376 == 3620) {
                            client.method114();
                            continue;
                        }
                        if (var376 == 3621) {
                            if (client.field304 == 0) {
                                field710[var5++] = -1;
                            } else {
                                field710[var5++] = client.field498;
                            }
                            continue;
                        }
                        if (var376 == 3622) {
                            var5--;
                            int var195 = field710[var5];
                            if (client.field304 != 0 && var195 < client.field498) {
                                field714[var6++] = client.field499[var195].field129;
                                field714[var6++] = client.field499[var195].field125;
                                continue;
                            }
                            field714[var6++] = "";
                            field714[var6++] = "";
                            continue;
                        }
                        if (var376 == 3623) {
                            String var196;
                            label2256: {
                                var6--;
                                var196 = field714[var6];
                                String var198 = "<img=0>";
                                if (!var196.startsWith(var198)) {
                                    String var200 = "<img=1>";
                                    if (!var196.startsWith(var200)) {
                                        break label2256;
                                    }
                                }
                                var196 = var196.substring(7);
                            }
                            field710[var5++] = client.method1866(var196) ? 1 : 0;
                            continue;
                        }
                        if (var376 == 3624) {
                            var5--;
                            int var201 = field710[var5];
                            if (Statics.field1429 != null && var201 < Statics.field1896 && Statics.field1429[var201].field559.equalsIgnoreCase(Statics.field920.field46)) {
                                field710[var5++] = 1;
                                continue;
                            }
                            field710[var5++] = 0;
                            continue;
                        }
                        if (var376 == 3625) {
                            if (client.field468 == null) {
                                field714[var6++] = "";
                            } else {
                                field714[var6++] = class212.method444(client.field468);
                            }
                            continue;
                        }
                    } else if (var376 < 4000) {
                        if (var376 == 3903) {
                            var5--;
                            int var202 = field710[var5];
                            field710[var5++] = client.field503[var202].method3469();
                            continue;
                        }
                        if (var376 == 3904) {
                            var5--;
                            int var203 = field710[var5];
                            field710[var5++] = client.field503[var203].field2955;
                            continue;
                        }
                        if (var376 == 3905) {
                            var5--;
                            int var204 = field710[var5];
                            field710[var5++] = client.field503[var204].field2954;
                            continue;
                        }
                        if (var376 == 3906) {
                            var5--;
                            int var205 = field710[var5];
                            field710[var5++] = client.field503[var205].field2956;
                            continue;
                        }
                        if (var376 == 3907) {
                            var5--;
                            int var206 = field710[var5];
                            field710[var5++] = client.field503[var206].field2957;
                            continue;
                        }
                        if (var376 == 3908) {
                            var5--;
                            int var207 = field710[var5];
                            field710[var5++] = client.field503[var207].field2958;
                            continue;
                        }
                        if (var376 == 3910) {
                            var5--;
                            int var208 = field710[var5];
                            int var209 = client.field503[var208].method3471();
                            field710[var5++] = var209 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var376 == 3911) {
                            var5--;
                            int var210 = field710[var5];
                            int var211 = client.field503[var210].method3471();
                            field710[var5++] = var211 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var376 == 3912) {
                            var5--;
                            int var212 = field710[var5];
                            int var213 = client.field503[var212].method3471();
                            field710[var5++] = var213 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var376 == 3913) {
                            var5--;
                            int var214 = field710[var5];
                            int var215 = client.field503[var214].method3471();
                            field710[var5++] = var215 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var376 == 3914) {
                            var5--;
                            boolean var216 = field710[var5] == 1;
                            if (Statics.field1455 != null) {
                                Statics.field1455.method3483(class204.field2962, var216);
                            }
                            continue;
                        }
                        if (var376 == 3915) {
                            var5--;
                            boolean var217 = field710[var5] == 1;
                            if (Statics.field1455 != null) {
                                Statics.field1455.method3483(class204.field2959, var217);
                            }
                            continue;
                        }
                        if (var376 == 3916) {
                            var5 -= 2;
                            boolean var218 = field710[var5] == 1;
                            boolean var219 = field710[var5 + 1] == 1;
                            if (Statics.field1455 != null) {
                                Statics.field1455.method3483(new class20(var219), var218);
                            }
                            continue;
                        }
                        if (var376 == 3917) {
                            var5--;
                            boolean var220 = field710[var5] == 1;
                            if (Statics.field1455 != null) {
                                Statics.field1455.method3483(class204.field2960, var220);
                            }
                            continue;
                        }
                        if (var376 == 3918) {
                            var5--;
                            boolean var221 = field710[var5] == 1;
                            if (Statics.field1455 != null) {
                                Statics.field1455.method3483(class204.field2963, var221);
                            }
                            continue;
                        }
                        if (var376 == 3919) {
                            field710[var5++] = Statics.field1455 == null ? 0 : Statics.field1455.field2961.size();
                            continue;
                        }
                        if (var376 == 3920) {
                            var5--;
                            int var222 = field710[var5];
                            class197 var223 = (class197) Statics.field1455.field2961.get(var222);
                            field710[var5++] = var223.field2935;
                            continue;
                        }
                        if (var376 == 3921) {
                            var5--;
                            int var224 = field710[var5];
                            class197 var225 = (class197) Statics.field1455.field2961.get(var224);
                            field714[var6++] = var225.method3428();
                            continue;
                        }
                        if (var376 == 3922) {
                            var5--;
                            int var226 = field710[var5];
                            class197 var227 = (class197) Statics.field1455.field2961.get(var226);
                            field714[var6++] = var227.method3429();
                            continue;
                        }
                        if (var376 == 3923) {
                            var5--;
                            int var228 = field710[var5];
                            class197 var229 = (class197) Statics.field1455.field2961.get(var228);
                            long var230 = class106.method3592() - Statics.field2730 - var229.field2934;
                            int var232 = (int) (var230 / 3600000L);
                            int var233 = (int) ((var230 - (long) (var232 * 3600000)) / 60000L);
                            int var234 = (int) ((var230 - (long) (var232 * 3600000) - (long) (var233 * 60000)) / 1000L);
                            String var235 = var232 + ":" + var233 / 10 + var233 % 10 + ":" + var234 / 10 + var234 % 10;
                            field714[var6++] = var235;
                            continue;
                        }
                        if (var376 == 3924) {
                            var5--;
                            int var236 = field710[var5];
                            class197 var237 = (class197) Statics.field1455.field2961.get(var236);
                            field710[var5++] = var237.field2936.field2956;
                            continue;
                        }
                        if (var376 == 3925) {
                            var5--;
                            int var238 = field710[var5];
                            class197 var239 = (class197) Statics.field1455.field2961.get(var238);
                            field710[var5++] = var239.field2936.field2954;
                            continue;
                        }
                        if (var376 == 3926) {
                            var5--;
                            int var240 = field710[var5];
                            class197 var241 = (class197) Statics.field1455.field2961.get(var240);
                            field710[var5++] = var241.field2936.field2955;
                            continue;
                        }
                    } else if (var376 < 4100) {
                        if (var376 == 4000) {
                            var5 -= 2;
                            int var242 = field710[var5];
                            int var243 = field710[var5 + 1];
                            field710[var5++] = var242 + var243;
                            continue;
                        }
                        if (var376 == 4001) {
                            var5 -= 2;
                            int var244 = field710[var5];
                            int var245 = field710[var5 + 1];
                            field710[var5++] = var244 - var245;
                            continue;
                        }
                        if (var376 == 4002) {
                            var5 -= 2;
                            int var246 = field710[var5];
                            int var247 = field710[var5 + 1];
                            field710[var5++] = var246 * var247;
                            continue;
                        }
                        if (var376 == 4003) {
                            var5 -= 2;
                            int var248 = field710[var5];
                            int var249 = field710[var5 + 1];
                            field710[var5++] = var248 / var249;
                            continue;
                        }
                        if (var376 == 4004) {
                            var5--;
                            int var250 = field710[var5];
                            field710[var5++] = (int) (Math.random() * (double) var250);
                            continue;
                        }
                        if (var376 == 4005) {
                            var5--;
                            int var251 = field710[var5];
                            field710[var5++] = (int) (Math.random() * (double) (var251 + 1));
                            continue;
                        }
                        if (var376 == 4006) {
                            var5 -= 5;
                            int var252 = field710[var5];
                            int var253 = field710[var5 + 1];
                            int var254 = field710[var5 + 2];
                            int var255 = field710[var5 + 3];
                            int var256 = field710[var5 + 4];
                            field710[var5++] = (var253 - var252) * (var256 - var254) / (var255 - var254) + var252;
                            continue;
                        }
                        if (var376 == 4007) {
                            var5 -= 2;
                            int var257 = field710[var5];
                            int var258 = field710[var5 + 1];
                            field710[var5++] = var257 * var258 / 100 + var257;
                            continue;
                        }
                        if (var376 == 4008) {
                            var5 -= 2;
                            int var259 = field710[var5];
                            int var260 = field710[var5 + 1];
                            field710[var5++] = var259 | 0x1 << var260;
                            continue;
                        }
                        if (var376 == 4009) {
                            var5 -= 2;
                            int var261 = field710[var5];
                            int var262 = field710[var5 + 1];
                            field710[var5++] = var261 & -1 - (0x1 << var262);
                            continue;
                        }
                        if (var376 == 4010) {
                            var5 -= 2;
                            int var263 = field710[var5];
                            int var264 = field710[var5 + 1];
                            field710[var5++] = (var263 & 0x1 << var264) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var376 == 4011) {
                            var5 -= 2;
                            int var265 = field710[var5];
                            int var266 = field710[var5 + 1];
                            field710[var5++] = var265 % var266;
                            continue;
                        }
                        if (var376 == 4012) {
                            var5 -= 2;
                            int var267 = field710[var5];
                            int var268 = field710[var5 + 1];
                            if (var267 == 0) {
                                field710[var5++] = 0;
                            } else {
                                field710[var5++] = (int) Math.pow((double) var267, (double) var268);
                            }
                            continue;
                        }
                        if (var376 == 4013) {
                            var5 -= 2;
                            int var269 = field710[var5];
                            int var270 = field710[var5 + 1];
                            if (var269 == 0) {
                                field710[var5++] = 0;
                            } else if (var270 == 0) {
                                field710[var5++] = Integer.MAX_VALUE;
                            } else {
                                field710[var5++] = (int) Math.pow((double) var269, 1.0D / (double) var270);
                            }
                            continue;
                        }
                        if (var376 == 4014) {
                            var5 -= 2;
                            int var271 = field710[var5];
                            int var272 = field710[var5 + 1];
                            field710[var5++] = var271 & var272;
                            continue;
                        }
                        if (var376 == 4015) {
                            var5 -= 2;
                            int var273 = field710[var5];
                            int var274 = field710[var5 + 1];
                            field710[var5++] = var273 | var274;
                            continue;
                        }
                    } else if (var376 < 4200) {
                        if (var376 == 4100) {
                            var6--;
                            String var275 = field714[var6];
                            var5--;
                            int var276 = field710[var5];
                            field714[var6++] = var275 + var276;
                            continue;
                        }
                        if (var376 == 4101) {
                            var6 -= 2;
                            String var277 = field714[var6];
                            String var278 = field714[var6 + 1];
                            field714[var6++] = var277 + var278;
                            continue;
                        }
                        if (var376 == 4102) {
                            var6--;
                            String var279 = field714[var6];
                            var5--;
                            int var280 = field710[var5];
                            field714[var6++] = var279 + Statics.method69(var280, true);
                            continue;
                        }
                        if (var376 == 4103) {
                            var6--;
                            String var281 = field714[var6];
                            field714[var6++] = var281.toLowerCase();
                            continue;
                        }
                        if (var376 == 4104) {
                            var5--;
                            int var282 = field710[var5];
                            long var283 = ((long) var282 + 11745L) * 86400000L;
                            field713.setTime(new Date(var283));
                            int var285 = field713.get(5);
                            int var286 = field713.get(2);
                            int var287 = field713.get(1);
                            field714[var6++] = var285 + "-" + field720[var286] + "-" + var287;
                            continue;
                        }
                        if (var376 == 4105) {
                            var6 -= 2;
                            String var288 = field714[var6];
                            String var289 = field714[var6 + 1];
                            if (Statics.field920.field36 != null && Statics.field920.field36.field2703) {
                                field714[var6++] = var289;
                                continue;
                            }
                            field714[var6++] = var288;
                            continue;
                        }
                        if (var376 == 4106) {
                            var5--;
                            int var290 = field710[var5];
                            field714[var6++] = Integer.toString(var290);
                            continue;
                        }
                        if (var376 == 4107) {
                            var6 -= 2;
                            field710[var5++] = class213.method584(class216.method1051(field714[var6], field714[var6 + 1], client.field293));
                            continue;
                        }
                        if (var376 == 4108) {
                            var6--;
                            String var291 = field714[var6];
                            var5 -= 2;
                            int var292 = field710[var5];
                            int var293 = field710[var5 + 1];
                            byte[] var294 = Statics.field2.method2761(var293, 0);
                            class207 var295 = new class207(var294);
                            field710[var5++] = var295.method3511(var291, var292);
                            continue;
                        }
                        if (var376 == 4109) {
                            var6--;
                            String var296 = field714[var6];
                            var5 -= 2;
                            int var297 = field710[var5];
                            int var298 = field710[var5 + 1];
                            byte[] var299 = Statics.field2.method2761(var298, 0);
                            class207 var300 = new class207(var299);
                            field710[var5++] = var300.method3498(var296, var297);
                            continue;
                        }
                        if (var376 == 4110) {
                            var6 -= 2;
                            String var301 = field714[var6];
                            String var302 = field714[var6 + 1];
                            var5--;
                            if (field710[var5] == 1) {
                                field714[var6++] = var301;
                            } else {
                                field714[var6++] = var302;
                            }
                            continue;
                        }
                        if (var376 == 4111) {
                            var6--;
                            String var303 = field714[var6];
                            field714[var6++] = class206.method3540(var303);
                            continue;
                        }
                        if (var376 == 4112) {
                            var6--;
                            String var304 = field714[var6];
                            var5--;
                            int var305 = field710[var5];
                            field714[var6++] = var304 + (char) var305;
                            continue;
                        }
                        if (var376 == 4113) {
                            var5--;
                            int var306 = field710[var5];
                            field710[var5++] = class213.method3093((char) var306) ? 1 : 0;
                            continue;
                        }
                        if (var376 == 4114) {
                            var5--;
                            int var307 = field710[var5];
                            field710[var5++] = class213.method589((char) var307) ? 1 : 0;
                            continue;
                        }
                        if (var376 == 4115) {
                            var5--;
                            int var308 = field710[var5];
                            field710[var5++] = class213.method1869((char) var308) ? 1 : 0;
                            continue;
                        }
                        if (var376 == 4116) {
                            var5--;
                            int var309 = field710[var5];
                            field710[var5++] = class213.method2755((char) var309) ? 1 : 0;
                            continue;
                        }
                        if (var376 == 4117) {
                            var6--;
                            String var310 = field714[var6];
                            if (var310 == null) {
                                field710[var5++] = 0;
                            } else {
                                field710[var5++] = var310.length();
                            }
                            continue;
                        }
                        if (var376 == 4118) {
                            var6--;
                            String var311 = field714[var6];
                            var5 -= 2;
                            int var312 = field710[var5];
                            int var313 = field710[var5 + 1];
                            field714[var6++] = var311.substring(var312, var313);
                            continue;
                        }
                        if (var376 == 4119) {
                            var6--;
                            String var314 = field714[var6];
                            StringBuilder var315 = new StringBuilder(var314.length());
                            boolean var316 = false;
                            for (int var317 = 0; var317 < var314.length(); var317++) {
                                char var318 = var314.charAt(var317);
                                if (var318 == '<') {
                                    var316 = true;
                                } else if (var318 == '>') {
                                    var316 = false;
                                } else if (!var316) {
                                    var315.append(var318);
                                }
                            }
                            field714[var6++] = var315.toString();
                            continue;
                        }
                        if (var376 == 4120) {
                            var6--;
                            String var319 = field714[var6];
                            var5--;
                            int var320 = field710[var5];
                            field710[var5++] = var319.indexOf(var320);
                            continue;
                        }
                        if (var376 == 4121) {
                            var6 -= 2;
                            String var321 = field714[var6];
                            String var322 = field714[var6 + 1];
                            var5--;
                            int var323 = field710[var5];
                            field710[var5++] = var321.indexOf(var322, var323);
                            continue;
                        }
                    } else if (var376 < 4300) {
                        if (var376 == 4200) {
                            var5--;
                            int var324 = field710[var5];
                            field714[var6++] = class46.method2398(var324).field1012;
                            continue;
                        }
                        if (var376 == 4201) {
                            var5 -= 2;
                            int var325 = field710[var5];
                            int var326 = field710[var5 + 1];
                            class46 var327 = class46.method2398(var325);
                            if (var326 >= 1 && var326 <= 5 && var327.field1045[var326 - 1] != null) {
                                field714[var6++] = var327.field1045[var326 - 1];
                                continue;
                            }
                            field714[var6++] = "";
                            continue;
                        }
                        if (var376 == 4202) {
                            var5 -= 2;
                            int var328 = field710[var5];
                            int var329 = field710[var5 + 1];
                            class46 var330 = class46.method2398(var328);
                            if (var329 >= 1 && var329 <= 5 && var330.field1046[var329 - 1] != null) {
                                field714[var6++] = var330.field1046[var329 - 1];
                                continue;
                            }
                            field714[var6++] = "";
                            continue;
                        }
                        if (var376 == 4203) {
                            var5--;
                            int var331 = field710[var5];
                            field710[var5++] = class46.method2398(var331).field1034;
                            continue;
                        }
                        if (var376 == 4204) {
                            var5--;
                            int var332 = field710[var5];
                            field710[var5++] = class46.method2398(var332).field1022 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var376 == 4205) {
                            var5--;
                            int var333 = field710[var5];
                            class46 var334 = class46.method2398(var333);
                            if (var334.field1036 == -1 && var334.field1053 >= 0) {
                                field710[var5++] = var334.field1053;
                                continue;
                            }
                            field710[var5++] = var333;
                            continue;
                        }
                        if (var376 == 4206) {
                            var5--;
                            int var335 = field710[var5];
                            class46 var336 = class46.method2398(var335);
                            if (var336.field1036 >= 0 && var336.field1053 >= 0) {
                                field710[var5++] = var336.field1053;
                                continue;
                            }
                            field710[var5++] = var335;
                            continue;
                        }
                        if (var376 == 4207) {
                            var5--;
                            int var337 = field710[var5];
                            field710[var5++] = class46.method2398(var337).field1035 ? 1 : 0;
                            continue;
                        }
                        if (var376 == 4210) {
                            var6--;
                            String var338 = field714[var6];
                            var5--;
                            int var339 = field710[var5];
                            client.method2748(var338, var339 == 1);
                            field710[var5++] = Statics.field127;
                            continue;
                        }
                        if (var376 == 4211) {
                            if (Statics.field2516 != null && Statics.field1974 < Statics.field127) {
                                field710[var5++] = Statics.field2516[++Statics.field1974 - 1] & 0xFFFF;
                                continue;
                            }
                            field710[var5++] = -1;
                            continue;
                        }
                        if (var376 == 4212) {
                            Statics.field1974 = 0;
                            continue;
                        }
                    } else if (var376 < 5100) {
                        if (var376 == 5000) {
                            field710[var5++] = client.field457;
                            continue;
                        }
                        if (var376 == 5001) {
                            var5 -= 3;
                            client.field457 = field710[var5];
                            Statics.field20 = class121.method80(field710[var5 + 1]);
                            if (Statics.field20 == null) {
                                Statics.field20 = class121.field1925;
                            }
                            client.field458 = field710[var5 + 2];
                            client.field281.method2381(192);
                            client.field281.method2203(client.field457);
                            client.field281.method2203(Statics.field20.field1929);
                            client.field281.method2203(client.field458);
                            continue;
                        }
                        if (var376 == 5002) {
                            var6--;
                            String var340 = field714[var6];
                            var5 -= 2;
                            int var341 = field710[var5];
                            int var342 = field710[var5 + 1];
                            client.field281.method2381(204);
                            client.field281.method2203(class110.method1954(var340) + 2);
                            client.field281.method2133(var340);
                            client.field281.method2203(var341 - 1);
                            client.field281.method2203(var342);
                            continue;
                        }
                        if (var376 == 5003) {
                            var5 -= 2;
                            int var343 = field710[var5];
                            int var344 = field710[var5 + 1];
                            class25 var345 = (class25) class10.field139.get(var343);
                            class32 var346 = var345.method517(var344);
                            if (var346 == null) {
                                field710[var5++] = -1;
                                field710[var5++] = 0;
                                field714[var6++] = "";
                                field714[var6++] = "";
                                field714[var6++] = "";
                            } else {
                                field710[var5++] = var346.field697;
                                field710[var5++] = var346.field698;
                                field714[var6++] = var346.field700 == null ? "" : var346.field700;
                                field714[var6++] = var346.field701 == null ? "" : var346.field701;
                                field714[var6++] = var346.field702 == null ? "" : var346.field702;
                            }
                            continue;
                        }
                        if (var376 == 5004) {
                            var5--;
                            int var348 = field710[var5];
                            class32 var349 = (class32) class10.field140.method3274((long) var348);
                            if (var349 == null) {
                                field710[var5++] = -1;
                                field710[var5++] = 0;
                                field714[var6++] = "";
                                field714[var6++] = "";
                                field714[var6++] = "";
                            } else {
                                field710[var5++] = var349.field699;
                                field710[var5++] = var349.field698;
                                field714[var6++] = var349.field700 == null ? "" : var349.field700;
                                field714[var6++] = var349.field701 == null ? "" : var349.field701;
                                field714[var6++] = var349.field702 == null ? "" : var349.field702;
                            }
                            continue;
                        }
                        if (var376 == 5005) {
                            if (Statics.field20 == null) {
                                field710[var5++] = -1;
                            } else {
                                field710[var5++] = Statics.field20.field1929;
                            }
                            continue;
                        }
                        if (var376 == 5008) {
                            var6--;
                            String var351 = field714[var6];
                            var5--;
                            int var352 = field710[var5];
                            String var353 = var351.toLowerCase();
                            byte var354 = 0;
                            if (var353.startsWith(class147.field2351)) {
                                var354 = 0;
                                var351 = var351.substring(class147.field2351.length());
                            } else if (var353.startsWith(class147.field2229)) {
                                var354 = 1;
                                var351 = var351.substring(class147.field2229.length());
                            } else if (var353.startsWith(class147.field2355)) {
                                var354 = 2;
                                var351 = var351.substring(class147.field2355.length());
                            } else if (var353.startsWith(class147.field2357)) {
                                var354 = 3;
                                var351 = var351.substring(class147.field2357.length());
                            } else if (var353.startsWith(class147.field2359)) {
                                var354 = 4;
                                var351 = var351.substring(class147.field2359.length());
                            } else if (var353.startsWith(class147.field2214)) {
                                var354 = 5;
                                var351 = var351.substring(class147.field2214.length());
                            } else if (var353.startsWith(class147.field2363)) {
                                var354 = 6;
                                var351 = var351.substring(class147.field2363.length());
                            } else if (var353.startsWith(class147.field2328)) {
                                var354 = 7;
                                var351 = var351.substring(class147.field2328.length());
                            } else if (var353.startsWith(class147.field2367)) {
                                var354 = 8;
                                var351 = var351.substring(class147.field2367.length());
                            } else if (var353.startsWith(class147.field2369)) {
                                var354 = 9;
                                var351 = var351.substring(class147.field2369.length());
                            } else if (var353.startsWith(class147.field2371)) {
                                var354 = 10;
                                var351 = var351.substring(class147.field2371.length());
                            } else if (var353.startsWith(class147.field2373)) {
                                var354 = 11;
                                var351 = var351.substring(class147.field2373.length());
                            } else if (client.field293 != 0) {
                                if (var353.startsWith(class147.field2211)) {
                                    var354 = 0;
                                    var351 = var351.substring(class147.field2211.length());
                                } else if (var353.startsWith(class147.field2354)) {
                                    var354 = 1;
                                    var351 = var351.substring(class147.field2354.length());
                                } else if (var353.startsWith(class147.field2356)) {
                                    var354 = 2;
                                    var351 = var351.substring(class147.field2356.length());
                                } else if (var353.startsWith(class147.field2358)) {
                                    var354 = 3;
                                    var351 = var351.substring(class147.field2358.length());
                                } else if (var353.startsWith(class147.field2360)) {
                                    var354 = 4;
                                    var351 = var351.substring(class147.field2360.length());
                                } else if (var353.startsWith(class147.field2228)) {
                                    var354 = 5;
                                    var351 = var351.substring(class147.field2228.length());
                                } else if (var353.startsWith(class147.field2364)) {
                                    var354 = 6;
                                    var351 = var351.substring(class147.field2364.length());
                                } else if (var353.startsWith(class147.field2366)) {
                                    var354 = 7;
                                    var351 = var351.substring(class147.field2366.length());
                                } else if (var353.startsWith(class147.field2368)) {
                                    var354 = 8;
                                    var351 = var351.substring(class147.field2368.length());
                                } else if (var353.startsWith(class147.field2370)) {
                                    var354 = 9;
                                    var351 = var351.substring(class147.field2370.length());
                                } else if (var353.startsWith(class147.field2280)) {
                                    var354 = 10;
                                    var351 = var351.substring(class147.field2280.length());
                                } else if (var353.startsWith(class147.field2374)) {
                                    var354 = 11;
                                    var351 = var351.substring(class147.field2374.length());
                                }
                            }
                            String var355 = var351.toLowerCase();
                            byte var356 = 0;
                            if (var355.startsWith(class147.field2375)) {
                                var356 = 1;
                                var351 = var351.substring(class147.field2375.length());
                            } else if (var355.startsWith(class147.field2335)) {
                                var356 = 2;
                                var351 = var351.substring(class147.field2335.length());
                            } else if (var355.startsWith(class147.field2239)) {
                                var356 = 3;
                                var351 = var351.substring(class147.field2239.length());
                            } else if (var355.startsWith(class147.field2381)) {
                                var356 = 4;
                                var351 = var351.substring(class147.field2381.length());
                            } else if (var355.startsWith(class147.field2261)) {
                                var356 = 5;
                                var351 = var351.substring(class147.field2261.length());
                            } else if (client.field293 != 0) {
                                if (var355.startsWith(class147.field2376)) {
                                    var356 = 1;
                                    var351 = var351.substring(class147.field2376.length());
                                } else if (var355.startsWith(class147.field2378)) {
                                    var356 = 2;
                                    var351 = var351.substring(class147.field2378.length());
                                } else if (var355.startsWith(class147.field2205)) {
                                    var356 = 3;
                                    var351 = var351.substring(class147.field2205.length());
                                } else if (var355.startsWith(class147.field2382)) {
                                    var356 = 4;
                                    var351 = var351.substring(class147.field2382.length());
                                } else if (var355.startsWith(class147.field2198)) {
                                    var356 = 5;
                                    var351 = var351.substring(class147.field2198.length());
                                }
                            }
                            client.field281.method2381(176);
                            client.field281.method2203(0);
                            int var357 = client.field281.field1855;
                            client.field281.method2203(var352);
                            client.field281.method2203(var354);
                            client.field281.method2203(var356);
                            class205.method504(client.field281, var351);
                            client.field281.method2139(client.field281.field1855 - var357);
                            continue;
                        }
                        if (var376 == 5009) {
                            var6 -= 2;
                            String var358 = field714[var6];
                            String var359 = field714[var6 + 1];
                            client.field281.method2381(241);
                            client.field281.method2267(0);
                            int var360 = client.field281.field1855;
                            client.field281.method2133(var358);
                            class205.method504(client.field281, var359);
                            client.field281.method2191(client.field281.field1855 - var360);
                            continue;
                        }
                        if (var376 == 5015) {
                            String var361;
                            if (Statics.field920 == null || Statics.field920.field46 == null) {
                                var361 = "";
                            } else {
                                var361 = Statics.field920.field46;
                            }
                            field714[var6++] = var361;
                            continue;
                        }
                        if (var376 == 5016) {
                            field710[var5++] = client.field458;
                            continue;
                        }
                        if (var376 == 5017) {
                            var5--;
                            int var362 = field710[var5];
                            field710[var5++] = class10.method481(var362);
                            continue;
                        }
                        if (var376 == 5018) {
                            var5--;
                            int var363 = field710[var5];
                            int[] var364 = field710;
                            int var365 = var5++;
                            class32 var366 = (class32) class10.field140.method3274((long) var363);
                            int var367;
                            if (var366 == null) {
                                var367 = -1;
                            } else if (class10.field141.field2890 == var366.field2894) {
                                var367 = -1;
                            } else {
                                var367 = ((class32) var366.field2894).field697;
                            }
                            var364[var365] = var367;
                            continue;
                        }
                        if (var376 == 5019) {
                            var5--;
                            int var368 = field710[var5];
                            field710[var5++] = Statics.method81(var368);
                            continue;
                        }
                        if (var376 == 5020) {
                            var6--;
                            String var369 = field714[var6];
                            if (var369.equalsIgnoreCase("toggleroof")) {
                                Statics.field1422.field135 = !Statics.field1422.field135;
                                class9.method2557();
                                if (Statics.field1422.field135) {
                                    class10.method691(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method691(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field409 >= 2) {
                                if (var369.equalsIgnoreCase("fpson")) {
                                    client.field255 = true;
                                }
                                if (var369.equalsIgnoreCase("fpsoff")) {
                                    client.field255 = false;
                                }
                                if (var369.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var369.equalsIgnoreCase("clientdrop")) {
                                    if (client.field288 > 0) {
                                        client.method2186();
                                    } else {
                                        client.method2950(40);
                                        Statics.field280 = Statics.field607;
                                        Statics.field607 = null;
                                    }
                                }
                                if (var369.equalsIgnoreCase("errortest") && client.field372 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field281.method2381(75);
                            client.field281.method2203(var369.length() + 1);
                            client.field281.method2133(var369);
                            continue;
                        }
                        if (var376 == 5021) {
                            var6--;
                            client.field459 = field714[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var376 == 5022) {
                            field714[var6++] = client.field459;
                            continue;
                        }
                    }
                } else {
                    class157 var71;
                    if (var376 >= 2000) {
                        var376 -= 1000;
                        var5--;
                        var71 = class157.method835(field710[var5]);
                    } else {
                        var71 = var48 ? Statics.field718 : Statics.field717;
                    }
                    if (var376 == 1300) {
                        var5--;
                        int var72 = field710[var5] - 1;
                        if (var72 >= 0 && var72 <= 9) {
                            var6--;
                            var71.method2903(var72, field714[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var376 == 1301) {
                        var5 -= 2;
                        int var73 = field710[var5];
                        int var74 = field710[var5 + 1];
                        var71.field2625 = class157.method1871(var73, var74);
                        continue;
                    }
                    if (var376 == 1302) {
                        var5--;
                        var71.field2628 = field710[var5] == 1;
                        continue;
                    }
                    if (var376 == 1303) {
                        var5--;
                        var71.field2626 = field710[var5];
                        continue;
                    }
                    if (var376 == 1304) {
                        var5--;
                        var71.field2627 = field710[var5];
                        continue;
                    }
                    if (var376 == 1305) {
                        var6--;
                        var71.field2566 = field714[var6];
                        continue;
                    }
                    if (var376 == 1306) {
                        var6--;
                        var71.field2591 = field714[var6];
                        continue;
                    }
                    if (var376 == 1307) {
                        var71.field2624 = null;
                        continue;
                    }
                }
                if (var376 >= 5600 || var376 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var370 = field710[var5];
                int var371 = field710[var5 + 1];
                if (!client.field382) {
                    client.field324 = var370;
                    client.field325 = var371;
                }
            }
        } catch (Exception var375) {
            StringBuilder var373 = new StringBuilder(30);
            var373.append("").append(var4.field2905).append(" ");
            for (int var374 = field725 - 1; var374 >= 0; var374--) {
                var373.append("").append(field716[var374].field183.field2905).append(" ");
            }
            var373.append("").append(var10);
            class139.method1404(var373.toString(), var375);
        }
    }

    @ObfuscatedName("cu.e(II)V")
    public static void method1970(int arg0) {
        if (arg0 == -1 || !class157.method2890(arg0)) {
            return;
        }
        class157[] var1 = Statics.field2673[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3.field2631 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field12 = var3.field2631;
                method127(var4, 2000000);
            }
        }
    }
}
