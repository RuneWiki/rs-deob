package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("at")
public class class32 {

    @ObfuscatedName("at.u")
    public static int[] field709 = new int[5];

    @ObfuscatedName("at.j")
    public static int[][] field710 = new int[5][5000];

    @ObfuscatedName("at.b")
    public static int[] field711 = new int[1000];

    @ObfuscatedName("at.v")
    public static String[] field712 = new String[1000];

    @ObfuscatedName("at.y")
    public static int field713 = 0;

    @ObfuscatedName("at.w")
    public static class13[] field718 = new class13[50];

    @ObfuscatedName("at.o")
    public static Calendar field714 = Calendar.getInstance();

    @ObfuscatedName("at.a")
    public static final String[] field716 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.g(Lg;B)V")
    public static void method572(class1 arg0) {
        method510(arg0, 200000);
    }

    @ObfuscatedName("d.s(Lg;II)V")
    public static void method510(class1 arg0, int arg1) {
        Object[] var2 = arg0.field14;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method166(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field513;
        int[] var9 = var4.field526;
        byte var10 = -1;
        field713 = 0;
        try {
            Statics.field707 = new int[var4.field516];
            int var11 = 0;
            Statics.field708 = new String[var4.field517];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field3;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field12 == null ? -1 : arg0.field12.field2535;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field12 == null ? -1 : arg0.field12.field2638;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2535;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2638;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field707[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field708[var12++] = var15;
                }
            }
            int var16 = 0;
            label2515: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var378 = var8[var7];
                if (var378 < 100) {
                    if (var378 == 0) {
                        field711[var5++] = var9[var7];
                        continue;
                    }
                    if (var378 == 1) {
                        int var17 = var9[var7];
                        field711[var5++] = class155.field2664[var17];
                        continue;
                    }
                    if (var378 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class155.field2664[var18] = field711[var5];
                        client.method29(var18);
                        continue;
                    }
                    if (var378 == 3) {
                        field712[var6++] = var4.field515[var7];
                        continue;
                    }
                    if (var378 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var378 == 7) {
                        var5 -= 2;
                        if (field711[var5 + 1] != field711[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var378 == 8) {
                        var5 -= 2;
                        if (field711[var5 + 1] == field711[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var378 == 9) {
                        var5 -= 2;
                        if (field711[var5] < field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var378 == 10) {
                        var5 -= 2;
                        if (field711[var5] > field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var378 == 21) {
                        if (field713 == 0) {
                            return;
                        }
                        class13 var19 = field718[--field713];
                        var4 = var19.field177;
                        var8 = var4.field513;
                        var9 = var4.field526;
                        var7 = var19.field173;
                        Statics.field707 = var19.field180;
                        Statics.field708 = var19.field174;
                        continue;
                    }
                    if (var378 == 25) {
                        int var20 = var9[var7];
                        field711[var5++] = class155.method1855(var20);
                        continue;
                    }
                    if (var378 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field711[var5];
                        class42 var23 = (class42) class42.field977.method3130((long) var21);
                        class42 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field980.method2667(14, var21);
                            class42 var26 = new class42();
                            if (var25 != null) {
                                var26.method802(new class107(var25));
                            }
                            class42.field977.method3126(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field973;
                        int var29 = var24.field974;
                        int var30 = var24.field979;
                        int var31 = class155.field2666[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class155.field2664[var28] = class155.field2664[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var378 == 31) {
                        var5 -= 2;
                        if (field711[var5] <= field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var378 == 32) {
                        var5 -= 2;
                        if (field711[var5] >= field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var378 == 33) {
                        field711[var5++] = Statics.field707[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var378 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field707[var10001] = field711[var5];
                        continue;
                    }
                    if (var378 == 35) {
                        field712[var6++] = Statics.field708[var9[var7]];
                        continue;
                    }
                    if (var378 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field708[var10001] = field712[var6];
                        continue;
                    }
                    if (var378 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String var34 = class200.method2531(field712, var6, var33);
                        field712[var6++] = var34;
                        continue;
                    }
                    if (var378 == 38) {
                        var5--;
                        continue;
                    }
                    if (var378 == 39) {
                        var6--;
                        continue;
                    }
                    if (var378 == 40) {
                        int var35 = var9[var7];
                        class19 var36 = class19.method166(var35);
                        int[] var37 = new int[var36.field516];
                        String[] var38 = new String[var36.field517];
                        for (int var39 = 0; var39 < var36.field527; var39++) {
                            var37[var39] = field711[var5 - var36.field527 + var39];
                        }
                        for (int var40 = 0; var40 < var36.field519; var40++) {
                            var38[var40] = field712[var6 - var36.field519 + var40];
                        }
                        var5 -= var36.field527;
                        var6 -= var36.field519;
                        class13 var41 = new class13();
                        var41.field177 = var4;
                        var41.field173 = var7;
                        var41.field180 = Statics.field707;
                        var41.field174 = Statics.field708;
                        field718[++field713 - 1] = var41;
                        var4 = var36;
                        var8 = var36.field513;
                        var9 = var36.field526;
                        var7 = -1;
                        Statics.field707 = var37;
                        Statics.field708 = var38;
                        continue;
                    }
                    if (var378 == 42) {
                        field711[var5++] = client.field470[var9[var7]];
                        continue;
                    }
                    if (var378 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field470[var10001] = field711[var5];
                        continue;
                    }
                    if (var378 == 44) {
                        int var42 = var9[var7] >> 16;
                        int var43 = var9[var7] & 0xFFFF;
                        var5--;
                        int var44 = field711[var5];
                        if (var44 >= 0 && var44 <= 5000) {
                            field709[var42] = var44;
                            byte var45 = -1;
                            if (var43 == 105) {
                                var45 = 0;
                            }
                            int var46 = 0;
                            while (true) {
                                if (var46 >= var44) {
                                    continue label2515;
                                }
                                field710[var42][var46] = var45;
                                var46++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var378 == 45) {
                        int var47 = var9[var7];
                        var5--;
                        int var48 = field711[var5];
                        if (var48 >= 0 && var48 < field709[var47]) {
                            field711[var5++] = field710[var47][var48];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var378 == 46) {
                        int var49 = var9[var7];
                        var5 -= 2;
                        int var50 = field711[var5];
                        if (var50 >= 0 && var50 < field709[var49]) {
                            field710[var49][var50] = field711[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var378 == 47) {
                        String var51 = client.field441[var9[var7]];
                        if (var51 == null) {
                            var51 = "null";
                        }
                        field712[var6++] = var51;
                        continue;
                    }
                    if (var378 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field441[var10001] = field712[var6];
                        continue;
                    }
                }
                boolean var52;
                if (var9[var7] == 1) {
                    var52 = true;
                } else {
                    var52 = false;
                }
                if (var378 < 1000) {
                    if (var378 == 100) {
                        var5 -= 3;
                        int var53 = field711[var5];
                        int var54 = field711[var5 + 1];
                        int var55 = field711[var5 + 2];
                        if (var54 == 0) {
                            throw new RuntimeException();
                        }
                        class153 var56 = class153.method2362(var53);
                        if (var56.field2623 == null) {
                            var56.field2623 = new class153[var55 + 1];
                        }
                        if (var56.field2623.length <= var55) {
                            class153[] var57 = new class153[var55 + 1];
                            for (int var58 = 0; var58 < var56.field2623.length; var58++) {
                                var57[var58] = var56.field2623[var58];
                            }
                            var56.field2623 = var57;
                        }
                        if (var55 > 0 && var56.field2623[var55 - 1] == null) {
                            throw new RuntimeException("" + (var55 - 1));
                        }
                        class153 var59 = new class153();
                        var59.field2634 = var54;
                        var59.field2578 = var59.field2535 = var56.field2535;
                        var59.field2638 = var55;
                        var59.field2534 = true;
                        var56.field2623[var55] = var59;
                        if (var52) {
                            Statics.field24 = var59;
                        } else {
                            Statics.field715 = var59;
                        }
                        client.method1839(var56);
                        continue;
                    }
                    if (var378 == 101) {
                        class153 var60 = var52 ? Statics.field24 : Statics.field715;
                        class153 var61 = class153.method2362(var60.field2535);
                        var61.field2623[var60.field2638] = null;
                        client.method1839(var61);
                        continue;
                    }
                    if (var378 == 102) {
                        var5--;
                        class153 var62 = class153.method2362(field711[var5]);
                        var62.field2623 = null;
                        client.method1839(var62);
                        continue;
                    }
                    if (var378 == 200) {
                        var5 -= 2;
                        int var63 = field711[var5];
                        int var64 = field711[var5 + 1];
                        class153 var65 = class153.method2470(var63, var64);
                        if (var65 != null && var64 != -1) {
                            field711[var5++] = 1;
                            if (var52) {
                                Statics.field24 = var65;
                            } else {
                                Statics.field715 = var65;
                            }
                            continue;
                        }
                        field711[var5++] = 0;
                        continue;
                    }
                } else if (!(var378 < 1000 || var378 >= 1100) || !(var378 < 2000 || var378 >= 2100)) {
                    class153 var66;
                    if (var378 >= 2000) {
                        var378 -= 1000;
                        var5--;
                        var66 = class153.method2362(field711[var5]);
                    } else {
                        var66 = var52 ? Statics.field24 : Statics.field715;
                    }
                    if (var378 == 1000) {
                        var5 -= 2;
                        var66.field2540 = field711[var5];
                        var66.field2546 = field711[var5 + 1];
                        client.method1839(var66);
                        continue;
                    }
                    if (var378 == 1001) {
                        var5 -= 2;
                        var66.field2544 = field711[var5];
                        var66.field2545 = field711[var5 + 1];
                        client.method1839(var66);
                        continue;
                    }
                    if (var378 == 1003) {
                        var5--;
                        boolean var67 = field711[var5] == 1;
                        if (var66.field2547 != var67) {
                            var66.field2547 = var67;
                            client.method1839(var66);
                        }
                        continue;
                    }
                } else if (var378 >= 1100 && var378 < 1200 || var378 >= 2100 && var378 < 2200) {
                    class153 var68;
                    if (var378 >= 2000) {
                        var378 -= 1000;
                        var5--;
                        var68 = class153.method2362(field711[var5]);
                    } else {
                        var68 = var52 ? Statics.field24 : Statics.field715;
                    }
                    if (var378 == 1100) {
                        var5 -= 2;
                        var68.field2548 = field711[var5];
                        if (var68.field2548 > var68.field2550 - var68.field2544) {
                            var68.field2548 = var68.field2550 - var68.field2544;
                        }
                        if (var68.field2548 < 0) {
                            var68.field2548 = 0;
                        }
                        var68.field2549 = field711[var5 + 1];
                        if (var68.field2549 > var68.field2551 - var68.field2545) {
                            var68.field2549 = var68.field2551 - var68.field2545;
                        }
                        if (var68.field2549 < 0) {
                            var68.field2549 = 0;
                        }
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1101) {
                        var5--;
                        var68.field2552 = field711[var5];
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1102) {
                        var5--;
                        var68.field2583 = field711[var5] == 1;
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1103) {
                        var5--;
                        var68.field2557 = field711[var5];
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1104) {
                        var5--;
                        var68.field2558 = field711[var5];
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1105) {
                        var5--;
                        var68.field2598 = field711[var5];
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1106) {
                        var5--;
                        var68.field2619 = field711[var5];
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1107) {
                        var5--;
                        var68.field2628 = field711[var5] == 1;
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1108) {
                        var68.field2605 = 1;
                        var5--;
                        var68.field2568 = field711[var5];
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1109) {
                        var5 -= 6;
                        var68.field2635 = field711[var5];
                        var68.field2574 = field711[var5 + 1];
                        var68.field2575 = field711[var5 + 2];
                        var68.field2576 = field711[var5 + 3];
                        var68.field2577 = field711[var5 + 4];
                        var68.field2573 = field711[var5 + 5];
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1110) {
                        var5--;
                        int var69 = field711[var5];
                        if (var68.field2571 != var69) {
                            var68.field2571 = var69;
                            var68.field2647 = 0;
                            var68.field2642 = 0;
                            client.method1839(var68);
                        }
                        continue;
                    }
                    if (var378 == 1111) {
                        var5--;
                        var68.field2580 = field711[var5] == 1;
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1112) {
                        var6--;
                        String var70 = field712[var6];
                        if (!var70.equals(var68.field2582)) {
                            var68.field2582 = var70;
                            client.method1839(var68);
                        }
                        continue;
                    }
                    if (var378 == 1113) {
                        var5--;
                        var68.field2581 = field711[var5];
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1114) {
                        var5 -= 3;
                        var68.field2585 = field711[var5];
                        var68.field2531 = field711[var5 + 1];
                        var68.field2584 = field711[var5 + 2];
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1115) {
                        var5--;
                        var68.field2587 = field711[var5] == 1;
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1116) {
                        var5--;
                        var68.field2563 = field711[var5];
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1117) {
                        var5--;
                        var68.field2564 = field711[var5];
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1118) {
                        var5--;
                        var68.field2565 = field711[var5] == 1;
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1119) {
                        var5--;
                        var68.field2624 = field711[var5] == 1;
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1120) {
                        var5 -= 2;
                        var68.field2550 = field711[var5];
                        var68.field2551 = field711[var5 + 1];
                        client.method1839(var68);
                        continue;
                    }
                    if (var378 == 1121) {
                        int var71 = var68.field2535;
                        int var72 = var68.field2638;
                        client.field361.method2334(10);
                        client.field361.method2140(var71);
                        client.field361.method2088(var72);
                        client.field409 = var68;
                        client.method1839(var68);
                        continue;
                    }
                } else if (!(var378 < 1200 || var378 >= 1300) || !(var378 < 2200 || var378 >= 2300)) {
                    class153 var73;
                    if (var378 >= 2000) {
                        var378 -= 1000;
                        var5--;
                        var73 = class153.method2362(field711[var5]);
                    } else {
                        var73 = var52 ? Statics.field24 : Statics.field715;
                    }
                    client.method1839(var73);
                    if (var378 == 1200) {
                        var5 -= 2;
                        int var74 = field711[var5];
                        int var75 = field711[var5 + 1];
                        var73.field2639 = var74;
                        var73.field2640 = var75;
                        class45 var76 = class45.method612(var74);
                        var73.field2575 = var76.field1022;
                        var73.field2576 = var76.field1021;
                        var73.field2577 = var76.field1025;
                        var73.field2635 = var76.field1010;
                        var73.field2574 = var76.field1024;
                        var73.field2573 = var76.field1019;
                        if (var73.field2544 > 0) {
                            var73.field2573 = var73.field2573 * 32 / var73.field2544;
                        }
                        continue;
                    }
                    if (var378 == 1201) {
                        var73.field2605 = 2;
                        var5--;
                        var73.field2568 = field711[var5];
                        continue;
                    }
                    if (var378 == 1202) {
                        var73.field2605 = 3;
                        var73.field2568 = Statics.field628.field30.method2904();
                        continue;
                    }
                } else if (var378 >= 1300 && var378 < 1400 || var378 >= 2300 && var378 < 2400) {
                    class153 var77;
                    if (var378 >= 2000) {
                        var378 -= 1000;
                        var5--;
                        var77 = class153.method2362(field711[var5]);
                    } else {
                        var77 = var52 ? Statics.field24 : Statics.field715;
                    }
                    if (var378 == 1300) {
                        var5--;
                        int var78 = field711[var5] - 1;
                        if (var78 >= 0 && var78 <= 9) {
                            var6--;
                            var77.method2817(var78, field712[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var378 == 1301) {
                        var5 -= 2;
                        int var79 = field711[var5];
                        int var80 = field711[var5 + 1];
                        var77.field2532 = class153.method2470(var79, var80);
                        continue;
                    }
                    if (var378 == 1302) {
                        var5--;
                        var77.field2648 = field711[var5] == 1;
                        continue;
                    }
                    if (var378 == 1303) {
                        var5--;
                        var77.field2526 = field711[var5];
                        continue;
                    }
                    if (var378 == 1304) {
                        var5--;
                        var77.field2599 = field711[var5];
                        continue;
                    }
                    if (var378 == 1305) {
                        var6--;
                        var77.field2595 = field712[var6];
                        continue;
                    }
                    if (var378 == 1306) {
                        var6--;
                        var77.field2652 = field712[var6];
                        continue;
                    }
                    if (var378 == 1307) {
                        var77.field2610 = null;
                        continue;
                    }
                } else {
                    if (var378 >= 1400 && var378 < 1500 || var378 >= 2400 && var378 < 2500) {
                        class153 var81;
                        if (var378 >= 2000) {
                            var378 -= 1000;
                            var5--;
                            var81 = class153.method2362(field711[var5]);
                        } else {
                            var81 = var52 ? Statics.field24 : Statics.field715;
                        }
                        var6--;
                        String var82 = field712[var6];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var5--;
                            int var84 = field711[var5];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var5--;
                                    var83[var84] = field711[var5];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var6--;
                                var85[var86] = field712[var6];
                            } else {
                                var5--;
                                var85[var86] = Integer.valueOf(field711[var5]);
                            }
                        }
                        var5--;
                        int var87 = field711[var5];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var378 == 1400) {
                            var81.field2604 = var85;
                        }
                        if (var378 == 1401) {
                            var81.field2607 = var85;
                        }
                        if (var378 == 1402) {
                            var81.field2606 = var85;
                        }
                        if (var378 == 1403) {
                            var81.field2608 = var85;
                        }
                        if (var378 == 1404) {
                            var81.field2525 = var85;
                        }
                        if (var378 == 1405) {
                            var81.field2611 = var85;
                        }
                        if (var378 == 1406) {
                            var81.field2537 = var85;
                        }
                        if (var378 == 1407) {
                            var81.field2615 = var85;
                            var81.field2616 = var83;
                        }
                        if (var378 == 1408) {
                            var81.field2621 = var85;
                        }
                        if (var378 == 1409) {
                            var81.field2622 = var85;
                        }
                        if (var378 == 1410) {
                            var81.field2627 = var85;
                        }
                        if (var378 == 1411) {
                            var81.field2530 = var85;
                        }
                        if (var378 == 1412) {
                            var81.field2600 = var85;
                        }
                        if (var378 == 1414) {
                            var81.field2617 = var85;
                            var81.field2618 = var83;
                        }
                        if (var378 == 1415) {
                            var81.field2570 = var85;
                            var81.field2529 = var83;
                        }
                        if (var378 == 1416) {
                            var81.field2613 = var85;
                        }
                        if (var378 == 1417) {
                            var81.field2567 = var85;
                        }
                        if (var378 == 1418) {
                            var81.field2614 = var85;
                        }
                        if (var378 == 1419) {
                            var81.field2609 = var85;
                        }
                        if (var378 == 1420) {
                            var81.field2626 = var85;
                        }
                        if (var378 == 1421) {
                            var81.field2562 = var85;
                        }
                        if (var378 == 1422) {
                            var81.field2586 = var85;
                        }
                        if (var378 == 1423) {
                            var81.field2629 = var85;
                        }
                        if (var378 == 1424) {
                            var81.field2637 = var85;
                        }
                        var81.field2602 = true;
                        continue;
                    }
                    if (var378 < 1600) {
                        class153 var88 = var52 ? Statics.field24 : Statics.field715;
                        if (var378 == 1500) {
                            field711[var5++] = var88.field2540;
                            continue;
                        }
                        if (var378 == 1501) {
                            field711[var5++] = var88.field2546;
                            continue;
                        }
                        if (var378 == 1502) {
                            field711[var5++] = var88.field2544;
                            continue;
                        }
                        if (var378 == 1503) {
                            field711[var5++] = var88.field2545;
                            continue;
                        }
                        if (var378 == 1504) {
                            field711[var5++] = var88.field2547 ? 1 : 0;
                            continue;
                        }
                        if (var378 == 1505) {
                            field711[var5++] = var88.field2578;
                            continue;
                        }
                    } else if (var378 < 1700) {
                        class153 var89 = var52 ? Statics.field24 : Statics.field715;
                        if (var378 == 1600) {
                            field711[var5++] = var89.field2548;
                            continue;
                        }
                        if (var378 == 1601) {
                            field711[var5++] = var89.field2549;
                            continue;
                        }
                        if (var378 == 1602) {
                            field712[var6++] = var89.field2582;
                            continue;
                        }
                        if (var378 == 1603) {
                            field711[var5++] = var89.field2550;
                            continue;
                        }
                        if (var378 == 1604) {
                            field711[var5++] = var89.field2551;
                            continue;
                        }
                        if (var378 == 1605) {
                            field711[var5++] = var89.field2573;
                            continue;
                        }
                        if (var378 == 1606) {
                            field711[var5++] = var89.field2575;
                            continue;
                        }
                        if (var378 == 1607) {
                            field711[var5++] = var89.field2577;
                            continue;
                        }
                        if (var378 == 1608) {
                            field711[var5++] = var89.field2576;
                            continue;
                        }
                    } else if (var378 < 1800) {
                        class153 var90 = var52 ? Statics.field24 : Statics.field715;
                        if (var378 == 1700) {
                            field711[var5++] = var90.field2639;
                            continue;
                        }
                        if (var378 == 1701) {
                            if (var90.field2639 == -1) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = var90.field2640;
                            }
                            continue;
                        }
                        if (var378 == 1702) {
                            field711[var5++] = var90.field2638;
                            continue;
                        }
                    } else if (var378 < 1900) {
                        class153 var91 = var52 ? Statics.field24 : Statics.field715;
                        if (var378 == 1800) {
                            field711[var5++] = class157.method648(client.method3000(var91));
                            continue;
                        }
                        if (var378 == 1801) {
                            var5--;
                            int var92 = field711[var5];
                            int var379 = var92 - 1;
                            if (var91.field2610 != null && var379 < var91.field2610.length && var91.field2610[var379] != null) {
                                field712[var6++] = var91.field2610[var379];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var378 == 1802) {
                            if (var91.field2595 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = var91.field2595;
                            }
                            continue;
                        }
                    } else if (var378 < 2600) {
                        var5--;
                        class153 var93 = class153.method2362(field711[var5]);
                        if (var378 == 2500) {
                            field711[var5++] = var93.field2540;
                            continue;
                        }
                        if (var378 == 2501) {
                            field711[var5++] = var93.field2546;
                            continue;
                        }
                        if (var378 == 2502) {
                            field711[var5++] = var93.field2544;
                            continue;
                        }
                        if (var378 == 2503) {
                            field711[var5++] = var93.field2545;
                            continue;
                        }
                        if (var378 == 2504) {
                            field711[var5++] = var93.field2547 ? 1 : 0;
                            continue;
                        }
                        if (var378 == 2505) {
                            field711[var5++] = var93.field2578;
                            continue;
                        }
                    } else if (var378 < 2700) {
                        var5--;
                        class153 var94 = class153.method2362(field711[var5]);
                        if (var378 == 2600) {
                            field711[var5++] = var94.field2548;
                            continue;
                        }
                        if (var378 == 2601) {
                            field711[var5++] = var94.field2549;
                            continue;
                        }
                        if (var378 == 2602) {
                            field712[var6++] = var94.field2582;
                            continue;
                        }
                        if (var378 == 2603) {
                            field711[var5++] = var94.field2550;
                            continue;
                        }
                        if (var378 == 2604) {
                            field711[var5++] = var94.field2551;
                            continue;
                        }
                        if (var378 == 2605) {
                            field711[var5++] = var94.field2573;
                            continue;
                        }
                        if (var378 == 2606) {
                            field711[var5++] = var94.field2575;
                            continue;
                        }
                        if (var378 == 2607) {
                            field711[var5++] = var94.field2577;
                            continue;
                        }
                        if (var378 == 2608) {
                            field711[var5++] = var94.field2576;
                            continue;
                        }
                    } else if (var378 < 2800) {
                        if (var378 == 2700) {
                            var5--;
                            class153 var95 = class153.method2362(field711[var5]);
                            field711[var5++] = var95.field2639;
                            continue;
                        }
                        if (var378 == 2701) {
                            var5--;
                            class153 var96 = class153.method2362(field711[var5]);
                            if (var96.field2639 == -1) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = var96.field2640;
                            }
                            continue;
                        }
                        if (var378 == 2702) {
                            var5--;
                            int var97 = field711[var5];
                            class4 var98 = (class4) client.field406.method3171((long) var97);
                            if (var98 == null) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var378 < 2900) {
                        var5--;
                        class153 var99 = class153.method2362(field711[var5]);
                        if (var378 == 2800) {
                            field711[var5++] = class157.method648(client.method3000(var99));
                            continue;
                        }
                        if (var378 == 2801) {
                            var5--;
                            int var100 = field711[var5];
                            int var380 = var100 - 1;
                            if (var99.field2610 != null && var380 < var99.field2610.length && var99.field2610[var380] != null) {
                                field712[var6++] = var99.field2610[var380];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var378 == 2802) {
                            if (var99.field2595 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = var99.field2595;
                            }
                            continue;
                        }
                    } else if (var378 < 3200) {
                        if (var378 == 3100) {
                            var6--;
                            String var101 = field712[var6];
                            class10.method100(0, "", var101);
                            continue;
                        }
                        if (var378 == 3101) {
                            var5 -= 2;
                            client.method2321(Statics.field628, field711[var5], field711[var5 + 1]);
                            continue;
                        }
                        if (var378 == 3103) {
                            client.method10();
                            continue;
                        }
                        if (var378 == 3104) {
                            var6--;
                            String var102 = field712[var6];
                            int var103 = 0;
                            boolean var104 = class200.method2533(var102, 10, true);
                            if (var104) {
                                int var105 = class200.method2999(var102, 10, true);
                                var103 = var105;
                            }
                            client.field361.method2334(246);
                            client.field361.method2253(var103);
                            continue;
                        }
                        if (var378 == 3105) {
                            var6--;
                            String var106 = field712[var6];
                            client.field361.method2334(126);
                            client.field361.method2087(var106.length() + 1);
                            client.field361.method2092(var106);
                            continue;
                        }
                        if (var378 == 3106) {
                            var6--;
                            String var107 = field712[var6];
                            client.field361.method2334(190);
                            client.field361.method2087(var107.length() + 1);
                            client.field361.method2092(var107);
                            continue;
                        }
                        if (var378 == 3107) {
                            var5--;
                            int var108 = field711[var5];
                            var6--;
                            String var109 = field712[var6];
                            boolean var110 = false;
                            for (int var111 = 0; var111 < client.field259; var111++) {
                                class3 var112 = client.field386[client.field364[var111]];
                                if (var112 != null && var112.field42 != null && var112.field42.equalsIgnoreCase(var109)) {
                                    if (var108 == 1) {
                                        client.field361.method2334(48);
                                        client.field361.method2088(client.field364[var111]);
                                        client.field361.method2132(0);
                                    } else if (var108 == 4) {
                                        client.field361.method2334(181);
                                        client.field361.method2087(0);
                                        client.field361.method2133(client.field364[var111]);
                                    } else if (var108 == 6) {
                                        client.field361.method2334(175);
                                        client.field361.method2284(client.field364[var111]);
                                        client.field361.method2132(0);
                                    } else if (var108 == 7) {
                                        client.field361.method2334(79);
                                        client.field361.method2087(0);
                                        client.field361.method2088(client.field364[var111]);
                                    }
                                    var110 = true;
                                    break;
                                }
                            }
                            if (!var110) {
                                class10.method100(4, "", class143.field2345 + var109);
                            }
                            continue;
                        }
                        if (var378 == 3108) {
                            var5 -= 3;
                            int var113 = field711[var5];
                            int var114 = field711[var5 + 1];
                            int var115 = field711[var5 + 2];
                            class153 var116 = class153.method2362(var115);
                            client.method596(var116, var113, var114);
                            continue;
                        }
                        if (var378 == 3109) {
                            var5 -= 2;
                            int var117 = field711[var5];
                            int var118 = field711[var5 + 1];
                            class153 var119 = var52 ? Statics.field24 : Statics.field715;
                            client.method596(var119, var117, var118);
                            continue;
                        }
                        if (var378 == 3110) {
                            var5--;
                            Statics.field2473 = field711[var5] == 1;
                            continue;
                        }
                        if (var378 == 3111) {
                            field711[var5++] = Statics.field1979.field122 ? 1 : 0;
                            continue;
                        }
                        if (var378 == 3112) {
                            var5--;
                            Statics.field1979.field122 = field711[var5] == 1;
                            class9.method1862();
                            continue;
                        }
                        if (var378 == 3113) {
                            var6--;
                            String var120 = field712[var6];
                            var5--;
                            boolean var121 = field711[var5] == 1;
                            class125.method571(var120, var121, false);
                            continue;
                        }
                    } else if (var378 < 3300) {
                        if (var378 == 3200) {
                            var5 -= 3;
                            int var122 = field711[var5];
                            int var123 = field711[var5 + 1];
                            int var124 = field711[var5 + 2];
                            if (client.field480 != 0 && var123 != 0 && client.field482 < 50) {
                                client.field483[client.field482] = var122;
                                client.field484[client.field482] = var123;
                                client.field481[client.field482] = var124;
                                client.field487[client.field482] = null;
                                client.field486[client.field482] = 0;
                                client.field482++;
                            }
                            continue;
                        }
                        if (var378 == 3201) {
                            var5--;
                            client.method622(field711[var5]);
                            continue;
                        }
                        if (var378 == 3202) {
                            var5 -= 2;
                            int var125 = field711[var5];
                            int var10000 = field711[var5 + 1];
                            if (client.field477 != 0 && var125 != -1) {
                                class162.method1421(Statics.field641, var125, 0, client.field477, false);
                                client.field240 = true;
                            }
                            continue;
                        }
                    } else if (var378 < 3400) {
                        if (var378 == 3300) {
                            field711[var5++] = client.field251;
                            continue;
                        }
                        if (var378 == 3301) {
                            var5 -= 2;
                            int var127 = field711[var5];
                            int var128 = field711[var5 + 1];
                            int[] var129 = field711;
                            int var130 = var5++;
                            class14 var131 = (class14) class14.field192.method3171((long) var127);
                            int var132;
                            if (var131 == null) {
                                var132 = -1;
                            } else if (var128 >= 0 && var128 < var131.field186.length) {
                                var132 = var131.field186[var128];
                            } else {
                                var132 = -1;
                            }
                            var129[var130] = var132;
                            continue;
                        }
                        if (var378 == 3302) {
                            var5 -= 2;
                            int var133 = field711[var5];
                            int var134 = field711[var5 + 1];
                            int[] var135 = field711;
                            int var136 = var5++;
                            class14 var137 = (class14) class14.field192.method3171((long) var133);
                            int var138;
                            if (var137 == null) {
                                var138 = 0;
                            } else if (var134 >= 0 && var134 < var137.field187.length) {
                                var138 = var137.field187[var134];
                            } else {
                                var138 = 0;
                            }
                            var135[var136] = var138;
                            continue;
                        }
                        if (var378 == 3303) {
                            var5 -= 2;
                            int var139 = field711[var5];
                            int var140 = field711[var5 + 1];
                            field711[var5++] = class14.method131(var139, var140);
                            continue;
                        }
                        if (var378 == 3304) {
                            var5--;
                            int var141 = field711[var5];
                            field711[var5++] = class44.method1600(var141).field995;
                            continue;
                        }
                        if (var378 == 3305) {
                            var5--;
                            int var142 = field711[var5];
                            field711[var5++] = client.field381[var142];
                            continue;
                        }
                        if (var378 == 3306) {
                            var5--;
                            int var143 = field711[var5];
                            field711[var5++] = client.field382[var143];
                            continue;
                        }
                        if (var378 == 3307) {
                            var5--;
                            int var144 = field711[var5];
                            field711[var5++] = client.field383[var144];
                            continue;
                        }
                        if (var378 == 3308) {
                            int var145 = Statics.field59;
                            int var146 = (Statics.field628.field771 >> 7) + Statics.field2103;
                            int var147 = (Statics.field628.field721 >> 7) + Statics.field88;
                            field711[var5++] = (var145 << 28) + (var146 << 14) + var147;
                            continue;
                        }
                        if (var378 == 3309) {
                            var5--;
                            int var148 = field711[var5];
                            field711[var5++] = var148 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var378 == 3310) {
                            var5--;
                            int var149 = field711[var5];
                            field711[var5++] = var149 >> 28;
                            continue;
                        }
                        if (var378 == 3311) {
                            var5--;
                            int var150 = field711[var5];
                            field711[var5++] = var150 & 0x3FFF;
                            continue;
                        }
                        if (var378 == 3312) {
                            field711[var5++] = client.field245 ? 1 : 0;
                            continue;
                        }
                        if (var378 == 3313) {
                            var5 -= 2;
                            int var151 = field711[var5] + 32768;
                            int var152 = field711[var5 + 1];
                            int[] var153 = field711;
                            int var154 = var5++;
                            class14 var155 = (class14) class14.field192.method3171((long) var151);
                            int var156;
                            if (var155 == null) {
                                var156 = -1;
                            } else if (var152 >= 0 && var152 < var155.field186.length) {
                                var156 = var155.field186[var152];
                            } else {
                                var156 = -1;
                            }
                            var153[var154] = var156;
                            continue;
                        }
                        if (var378 == 3314) {
                            var5 -= 2;
                            int var157 = field711[var5] + 32768;
                            int var158 = field711[var5 + 1];
                            int[] var159 = field711;
                            int var160 = var5++;
                            class14 var161 = (class14) class14.field192.method3171((long) var157);
                            int var162;
                            if (var161 == null) {
                                var162 = 0;
                            } else if (var158 >= 0 && var158 < var161.field187.length) {
                                var162 = var161.field187[var158];
                            } else {
                                var162 = 0;
                            }
                            var159[var160] = var162;
                            continue;
                        }
                        if (var378 == 3315) {
                            var5 -= 2;
                            int var163 = field711[var5] + 32768;
                            int var164 = field711[var5 + 1];
                            field711[var5++] = class14.method131(var163, var164);
                            continue;
                        }
                        if (var378 == 3316) {
                            if (client.field412 >= 2) {
                                field711[var5++] = client.field412;
                            } else {
                                field711[var5++] = 0;
                            }
                            continue;
                        }
                        if (var378 == 3317) {
                            field711[var5++] = client.field258;
                            continue;
                        }
                        if (var378 == 3318) {
                            field711[var5++] = client.field497;
                            continue;
                        }
                        if (var378 == 3321) {
                            field711[var5++] = client.field410;
                            continue;
                        }
                        if (var378 == 3322) {
                            field711[var5++] = client.field474;
                            continue;
                        }
                        if (var378 == 3323) {
                            if (client.field414) {
                                field711[var5++] = 1;
                            } else {
                                field711[var5++] = 0;
                            }
                            continue;
                        }
                        if (var378 == 3324) {
                            field711[var5++] = client.field242;
                            continue;
                        }
                    } else if (var378 < 3500) {
                        if (var378 == 3400) {
                            var5 -= 2;
                            int var165 = field711[var5];
                            int var166 = field711[var5 + 1];
                            class43 var167 = (class43) class43.field982.method3130((long) var165);
                            class43 var168;
                            if (var167 == null) {
                                byte[] var169 = Statics.field991.method2667(8, var165);
                                class43 var170 = new class43();
                                if (var169 != null) {
                                    var170.method811(new class107(var169));
                                }
                                class43.field982.method3126(var170, (long) var165);
                                var168 = var170;
                            } else {
                                var168 = var167;
                            }
                            class43 var171 = var168;
                            if (var168.field984 != 's') {
                            }
                            for (int var172 = 0; var172 < var171.field987; var172++) {
                                if (var171.field988[var172] == var166) {
                                    field712[var6++] = var171.field986[var172];
                                    var171 = null;
                                    break;
                                }
                            }
                            if (var171 != null) {
                                field712[var6++] = var171.field981;
                            }
                            continue;
                        }
                        if (var378 == 3408) {
                            var5 -= 4;
                            int var173 = field711[var5];
                            int var174 = field711[var5 + 1];
                            int var175 = field711[var5 + 2];
                            int var176 = field711[var5 + 3];
                            class43 var177 = (class43) class43.field982.method3130((long) var175);
                            class43 var178;
                            if (var177 == null) {
                                byte[] var179 = Statics.field991.method2667(8, var175);
                                class43 var180 = new class43();
                                if (var179 != null) {
                                    var180.method811(new class107(var179));
                                }
                                class43.field982.method3126(var180, (long) var175);
                                var178 = var180;
                            } else {
                                var178 = var177;
                            }
                            class43 var181 = var178;
                            if (var178.field983 == var173 && var178.field984 == var174) {
                                for (int var182 = 0; var182 < var181.field987; var182++) {
                                    if (var181.field988[var182] == var176) {
                                        if (var174 == 115) {
                                            field712[var6++] = var181.field986[var182];
                                        } else {
                                            field711[var5++] = var181.field990[var182];
                                        }
                                        var181 = null;
                                        break;
                                    }
                                }
                                if (var181 != null) {
                                    if (var174 == 115) {
                                        field712[var6++] = var181.field981;
                                    } else {
                                        field711[var5++] = var181.field989;
                                    }
                                }
                                continue;
                            }
                            if (var174 == 115) {
                                field712[var6++] = "null";
                            } else {
                                field711[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var378 < 3700) {
                        if (var378 == 3600) {
                            if (client.field278 == 0) {
                                field711[var5++] = -2;
                            } else if (client.field278 == 1) {
                                field711[var5++] = -1;
                            } else {
                                field711[var5++] = client.field318;
                            }
                            continue;
                        }
                        if (var378 == 3601) {
                            var5--;
                            int var183 = field711[var5];
                            if (client.field278 == 2 && var183 < client.field318) {
                                field712[var6++] = client.field496[var183].field225;
                                field712[var6++] = client.field496[var183].field224;
                                continue;
                            }
                            field712[var6++] = "";
                            field712[var6++] = "";
                            continue;
                        }
                        if (var378 == 3602) {
                            var5--;
                            int var184 = field711[var5];
                            if (client.field278 == 2 && var184 < client.field318) {
                                field711[var5++] = client.field496[var184].field215;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var378 == 3603) {
                            var5--;
                            int var185 = field711[var5];
                            if (client.field278 == 2 && var185 < client.field318) {
                                field711[var5++] = client.field496[var185].field216;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var378 == 3604) {
                            var6--;
                            String var186 = field712[var6];
                            var5--;
                            int var187 = field711[var5];
                            client.method1015(var186, var187);
                            continue;
                        }
                        if (var378 == 3605) {
                            var6--;
                            String var188 = field712[var6];
                            client.method805(var188);
                            continue;
                        }
                        if (var378 == 3606) {
                            var6--;
                            String var189 = field712[var6];
                            if (var189 == null) {
                                continue;
                            }
                            String var190 = class201.method2051(var189, Statics.field2395);
                            if (var190 == null) {
                                continue;
                            }
                            int var191 = 0;
                            while (true) {
                                if (var191 >= client.field318) {
                                    continue label2515;
                                }
                                class16 var192 = client.field496[var191];
                                String var193 = var192.field225;
                                String var194 = class201.method2051(var193, Statics.field2395);
                                if (class116.method515(var189, var190, var193, var194)) {
                                    client.field318--;
                                    for (int var195 = var191; var195 < client.field318; var195++) {
                                        client.field496[var195] = client.field496[var195 + 1];
                                    }
                                    client.field437 = client.field429;
                                    client.field361.method2334(46);
                                    class110 var196 = client.field361;
                                    int var197 = var189.length() + 1;
                                    var196.method2087(var197);
                                    client.field361.method2092(var189);
                                    continue label2515;
                                }
                                var191++;
                            }
                        }
                        if (var378 == 3607) {
                            var6--;
                            String var198 = field712[var6];
                            client.method95(var198, false);
                            continue;
                        }
                        if (var378 == 3608) {
                            var6--;
                            String var199 = field712[var6];
                            if (var199 == null) {
                                continue;
                            }
                            String var200 = class201.method2051(var199, Statics.field2395);
                            if (var200 == null) {
                                continue;
                            }
                            int var201 = 0;
                            while (true) {
                                if (var201 >= client.field498) {
                                    continue label2515;
                                }
                                class8 var202 = client.field293[var201];
                                String var203 = var202.field117;
                                String var204 = class201.method2051(var203, Statics.field2395);
                                if (class116.method515(var199, var200, var203, var204)) {
                                    client.field498--;
                                    for (int var205 = var201; var205 < client.field498; var205++) {
                                        client.field293[var205] = client.field293[var205 + 1];
                                    }
                                    client.field437 = client.field429;
                                    client.field361.method2334(219);
                                    class110 var206 = client.field361;
                                    int var207 = var199.length() + 1;
                                    var206.method2087(var207);
                                    client.field361.method2092(var199);
                                    continue label2515;
                                }
                                var201++;
                            }
                        }
                        if (var378 == 3609) {
                            var6--;
                            String var208 = field712[var6];
                            class138[] var209 = new class138[] { class138.field2093, class138.field2102, class138.field2104, class138.field2097, class138.field2095 };
                            class138[] var210 = var209;
                            for (int var211 = 0; var211 < var210.length; var211++) {
                                class138 var212 = var210[var211];
                                if (var212.field2098 != -1 && var208.startsWith(class2.method2522(var212.field2098))) {
                                    var208 = var208.substring(6 + Integer.toString(var212.field2098).length());
                                    break;
                                }
                            }
                            field711[var5++] = client.method2038(var208, false) ? 1 : 0;
                            continue;
                        }
                        if (var378 == 3611) {
                            if (client.field467 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = class199.method703(client.field467);
                            }
                            continue;
                        }
                        if (var378 == 3612) {
                            if (client.field467 == null) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = Statics.field130;
                            }
                            continue;
                        }
                        if (var378 == 3613) {
                            var5--;
                            int var213 = field711[var5];
                            if (client.field467 != null && var213 < Statics.field130) {
                                field712[var6++] = Statics.field1690[var213].field558;
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var378 == 3614) {
                            var5--;
                            int var214 = field711[var5];
                            if (client.field467 != null && var214 < Statics.field130) {
                                field711[var5++] = Statics.field1690[var214].field556;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var378 == 3615) {
                            var5--;
                            int var215 = field711[var5];
                            if (client.field467 != null && var215 < Statics.field130) {
                                field711[var5++] = Statics.field1690[var215].field557;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var378 == 3616) {
                            field711[var5++] = Statics.field1877;
                            continue;
                        }
                        if (var378 == 3617) {
                            var6--;
                            String var216 = field712[var6];
                            client.method583(var216);
                            continue;
                        }
                        if (var378 == 3618) {
                            field711[var5++] = Statics.field1913;
                            continue;
                        }
                        if (var378 == 3619) {
                            var6--;
                            String var217 = field712[var6];
                            if (!var217.equals("")) {
                                client.field361.method2334(197);
                                class110 var218 = client.field361;
                                int var219 = var217.length() + 1;
                                var218.method2087(var219);
                                client.field361.method2092(var217);
                            }
                            continue;
                        }
                        if (var378 == 3620) {
                            client.method1943();
                            continue;
                        }
                        if (var378 == 3621) {
                            if (client.field278 == 0) {
                                field711[var5++] = -1;
                            } else {
                                field711[var5++] = client.field498;
                            }
                            continue;
                        }
                        if (var378 == 3622) {
                            var5--;
                            int var220 = field711[var5];
                            if (client.field278 != 0 && var220 < client.field498) {
                                field712[var6++] = client.field293[var220].field117;
                                field712[var6++] = client.field293[var220].field114;
                                continue;
                            }
                            field712[var6++] = "";
                            field712[var6++] = "";
                            continue;
                        }
                        if (var378 == 3623) {
                            var6--;
                            String var221 = field712[var6];
                            if (var221.startsWith(class2.method2522(0)) || var221.startsWith(class2.method2522(1))) {
                                var221 = var221.substring(7);
                            }
                            field711[var5++] = client.method2433(var221) ? 1 : 0;
                            continue;
                        }
                        if (var378 == 3624) {
                            var5--;
                            int var222 = field711[var5];
                            if (Statics.field1690 != null && var222 < Statics.field130 && Statics.field1690[var222].field558.equalsIgnoreCase(Statics.field628.field42)) {
                                field711[var5++] = 1;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var378 == 3625) {
                            if (client.field276 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = class199.method703(client.field276);
                            }
                            continue;
                        }
                    } else if (var378 < 4100) {
                        if (var378 == 4000) {
                            var5 -= 2;
                            int var223 = field711[var5];
                            int var224 = field711[var5 + 1];
                            field711[var5++] = var223 + var224;
                            continue;
                        }
                        if (var378 == 4001) {
                            var5 -= 2;
                            int var225 = field711[var5];
                            int var226 = field711[var5 + 1];
                            field711[var5++] = var225 - var226;
                            continue;
                        }
                        if (var378 == 4002) {
                            var5 -= 2;
                            int var227 = field711[var5];
                            int var228 = field711[var5 + 1];
                            field711[var5++] = var227 * var228;
                            continue;
                        }
                        if (var378 == 4003) {
                            var5 -= 2;
                            int var229 = field711[var5];
                            int var230 = field711[var5 + 1];
                            field711[var5++] = var229 / var230;
                            continue;
                        }
                        if (var378 == 4004) {
                            var5--;
                            int var231 = field711[var5];
                            field711[var5++] = (int) (Math.random() * (double) var231);
                            continue;
                        }
                        if (var378 == 4005) {
                            var5--;
                            int var232 = field711[var5];
                            field711[var5++] = (int) (Math.random() * (double) (var232 + 1));
                            continue;
                        }
                        if (var378 == 4006) {
                            var5 -= 5;
                            int var233 = field711[var5];
                            int var234 = field711[var5 + 1];
                            int var235 = field711[var5 + 2];
                            int var236 = field711[var5 + 3];
                            int var237 = field711[var5 + 4];
                            field711[var5++] = (var234 - var233) * (var237 - var235) / (var236 - var235) + var233;
                            continue;
                        }
                        if (var378 == 4007) {
                            var5 -= 2;
                            int var238 = field711[var5];
                            int var239 = field711[var5 + 1];
                            field711[var5++] = var238 * var239 / 100 + var238;
                            continue;
                        }
                        if (var378 == 4008) {
                            var5 -= 2;
                            int var240 = field711[var5];
                            int var241 = field711[var5 + 1];
                            field711[var5++] = var240 | 0x1 << var241;
                            continue;
                        }
                        if (var378 == 4009) {
                            var5 -= 2;
                            int var242 = field711[var5];
                            int var243 = field711[var5 + 1];
                            field711[var5++] = var242 & -1 - (0x1 << var243);
                            continue;
                        }
                        if (var378 == 4010) {
                            var5 -= 2;
                            int var244 = field711[var5];
                            int var245 = field711[var5 + 1];
                            field711[var5++] = (var244 & 0x1 << var245) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var378 == 4011) {
                            var5 -= 2;
                            int var246 = field711[var5];
                            int var247 = field711[var5 + 1];
                            field711[var5++] = var246 % var247;
                            continue;
                        }
                        if (var378 == 4012) {
                            var5 -= 2;
                            int var248 = field711[var5];
                            int var249 = field711[var5 + 1];
                            if (var248 == 0) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = (int) Math.pow((double) var248, (double) var249);
                            }
                            continue;
                        }
                        if (var378 == 4013) {
                            var5 -= 2;
                            int var250 = field711[var5];
                            int var251 = field711[var5 + 1];
                            if (var250 == 0) {
                                field711[var5++] = 0;
                            } else if (var251 == 0) {
                                field711[var5++] = Integer.MAX_VALUE;
                            } else {
                                field711[var5++] = (int) Math.pow((double) var250, 1.0D / (double) var251);
                            }
                            continue;
                        }
                        if (var378 == 4014) {
                            var5 -= 2;
                            int var252 = field711[var5];
                            int var253 = field711[var5 + 1];
                            field711[var5++] = var252 & var253;
                            continue;
                        }
                        if (var378 == 4015) {
                            var5 -= 2;
                            int var254 = field711[var5];
                            int var255 = field711[var5 + 1];
                            field711[var5++] = var254 | var255;
                            continue;
                        }
                    } else if (var378 < 4200) {
                        if (var378 == 4100) {
                            var6--;
                            String var256 = field712[var6];
                            var5--;
                            int var257 = field711[var5];
                            field712[var6++] = var256 + var257;
                            continue;
                        }
                        if (var378 == 4101) {
                            var6 -= 2;
                            String var258 = field712[var6];
                            String var259 = field712[var6 + 1];
                            field712[var6++] = var258 + var259;
                            continue;
                        }
                        if (var378 == 4102) {
                            var6--;
                            String var260 = field712[var6];
                            var5--;
                            int var261 = field711[var5];
                            String[] var262 = field712;
                            int var263 = var6++;
                            String var265;
                            if (var261 < 0) {
                                var265 = Integer.toString(var261);
                            } else {
                                var265 = class200.method497(var261, 10, true);
                            }
                            var262[var263] = var260 + var265;
                            continue;
                        }
                        if (var378 == 4103) {
                            var6--;
                            String var266 = field712[var6];
                            field712[var6++] = var266.toLowerCase();
                            continue;
                        }
                        if (var378 == 4104) {
                            var5--;
                            int var267 = field711[var5];
                            long var268 = ((long) var267 + 11745L) * 86400000L;
                            field714.setTime(new Date(var268));
                            int var270 = field714.get(5);
                            int var271 = field714.get(2);
                            int var272 = field714.get(1);
                            field712[var6++] = var270 + "-" + field716[var271] + "-" + var272;
                            continue;
                        }
                        if (var378 == 4105) {
                            var6 -= 2;
                            String var273 = field712[var6];
                            String var274 = field712[var6 + 1];
                            if (Statics.field628.field30 != null && Statics.field628.field30.field2679) {
                                field712[var6++] = var274;
                                continue;
                            }
                            field712[var6++] = var273;
                            continue;
                        }
                        if (var378 == 4106) {
                            var5--;
                            int var275 = field711[var5];
                            field712[var6++] = Integer.toString(var275);
                            continue;
                        }
                        if (var378 == 4107) {
                            var6 -= 2;
                            field711[var5++] = class200.method1763(class203.method85(field712[var6], field712[var6 + 1], client.field283));
                            continue;
                        }
                        if (var378 == 4108) {
                            var6--;
                            String var276 = field712[var6];
                            var5 -= 2;
                            int var277 = field711[var5];
                            int var278 = field711[var5 + 1];
                            byte[] var279 = Statics.field178.method2667(var278, 0);
                            class194 var280 = new class194(var279);
                            field711[var5++] = var280.method3317(var276, var277);
                            continue;
                        }
                        if (var378 == 4109) {
                            var6--;
                            String var281 = field712[var6];
                            var5 -= 2;
                            int var282 = field711[var5];
                            int var283 = field711[var5 + 1];
                            byte[] var284 = Statics.field178.method2667(var283, 0);
                            class194 var285 = new class194(var284);
                            field711[var5++] = var285.method3316(var281, var282);
                            continue;
                        }
                        if (var378 == 4110) {
                            var6 -= 2;
                            String var286 = field712[var6];
                            String var287 = field712[var6 + 1];
                            var5--;
                            if (field711[var5] == 1) {
                                field712[var6++] = var286;
                            } else {
                                field712[var6++] = var287;
                            }
                            continue;
                        }
                        if (var378 == 4111) {
                            var6--;
                            String var288 = field712[var6];
                            field712[var6++] = class193.method3318(var288);
                            continue;
                        }
                        if (var378 == 4112) {
                            var6--;
                            String var289 = field712[var6];
                            var5--;
                            int var290 = field711[var5];
                            field712[var6++] = var289 + (char) var290;
                            continue;
                        }
                        if (var378 == 4113) {
                            var5--;
                            int var291 = field711[var5];
                            field711[var5++] = class200.method502((char) var291) ? 1 : 0;
                            continue;
                        }
                        if (var378 == 4114) {
                            var5--;
                            int var292 = field711[var5];
                            int[] var293 = field711;
                            int var294 = var5++;
                            char var295 = (char) var292;
                            boolean var296 = var295 >= '0' && var295 <= '9' || var295 >= 'A' && var295 <= 'Z' || var295 >= 'a' && var295 <= 'z';
                            var293[var294] = var296 ? 1 : 0;
                            continue;
                        }
                        if (var378 == 4115) {
                            var5--;
                            int var297 = field711[var5];
                            field711[var5++] = class200.method3111((char) var297) ? 1 : 0;
                            continue;
                        }
                        if (var378 == 4116) {
                            var5--;
                            int var298 = field711[var5];
                            field711[var5++] = class200.method1858((char) var298) ? 1 : 0;
                            continue;
                        }
                        if (var378 == 4117) {
                            var6--;
                            String var299 = field712[var6];
                            if (var299 == null) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = var299.length();
                            }
                            continue;
                        }
                        if (var378 == 4118) {
                            var6--;
                            String var300 = field712[var6];
                            var5 -= 2;
                            int var301 = field711[var5];
                            int var302 = field711[var5 + 1];
                            field712[var6++] = var300.substring(var301, var302);
                            continue;
                        }
                        if (var378 == 4119) {
                            var6--;
                            String var303 = field712[var6];
                            StringBuilder var304 = new StringBuilder(var303.length());
                            boolean var305 = false;
                            for (int var306 = 0; var306 < var303.length(); var306++) {
                                char var307 = var303.charAt(var306);
                                if (var307 == '<') {
                                    var305 = true;
                                } else if (var307 == '>') {
                                    var305 = false;
                                } else if (!var305) {
                                    var304.append(var307);
                                }
                            }
                            field712[var6++] = var304.toString();
                            continue;
                        }
                        if (var378 == 4120) {
                            var6--;
                            String var308 = field712[var6];
                            var5--;
                            int var309 = field711[var5];
                            field711[var5++] = var308.indexOf(var309);
                            continue;
                        }
                        if (var378 == 4121) {
                            var6 -= 2;
                            String var310 = field712[var6];
                            String var311 = field712[var6 + 1];
                            var5--;
                            int var312 = field711[var5];
                            field711[var5++] = var310.indexOf(var311, var312);
                            continue;
                        }
                    } else if (var378 < 4300) {
                        if (var378 == 4200) {
                            var5--;
                            int var313 = field711[var5];
                            field712[var6++] = class45.method612(var313).field1014;
                            continue;
                        }
                        if (var378 == 4201) {
                            var5 -= 2;
                            int var314 = field711[var5];
                            int var315 = field711[var5 + 1];
                            class45 var316 = class45.method612(var314);
                            if (var315 >= 1 && var315 <= 5 && var316.field1028[var315 - 1] != null) {
                                field712[var6++] = var316.field1028[var315 - 1];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var378 == 4202) {
                            var5 -= 2;
                            int var317 = field711[var5];
                            int var318 = field711[var5 + 1];
                            class45 var319 = class45.method612(var317);
                            if (var318 >= 1 && var318 <= 5 && var319.field1029[var318 - 1] != null) {
                                field712[var6++] = var319.field1029[var318 - 1];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var378 == 4203) {
                            var5--;
                            int var320 = field711[var5];
                            field711[var5++] = class45.method612(var320).field1026;
                            continue;
                        }
                        if (var378 == 4204) {
                            var5--;
                            int var321 = field711[var5];
                            field711[var5++] = class45.method612(var321).field1043 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var378 == 4205) {
                            var5--;
                            int var322 = field711[var5];
                            class45 var323 = class45.method612(var322);
                            if (var323.field1023 == -1 && var323.field1051 >= 0) {
                                field711[var5++] = var323.field1051;
                                continue;
                            }
                            field711[var5++] = var322;
                            continue;
                        }
                        if (var378 == 4206) {
                            var5--;
                            int var324 = field711[var5];
                            class45 var325 = class45.method612(var324);
                            if (var325.field1023 >= 0 && var325.field1051 >= 0) {
                                field711[var5++] = var325.field1051;
                                continue;
                            }
                            field711[var5++] = var324;
                            continue;
                        }
                        if (var378 == 4207) {
                            var5--;
                            int var326 = field711[var5];
                            field711[var5++] = class45.method612(var326).field1027 ? 1 : 0;
                            continue;
                        }
                    } else if (var378 < 5100) {
                        if (var378 == 5000) {
                            field711[var5++] = client.field458;
                            continue;
                        }
                        if (var378 == 5001) {
                            var5 -= 3;
                            client.field458 = field711[var5];
                            Statics.field2968 = class117.method2532(field711[var5 + 1]);
                            if (Statics.field2968 == null) {
                                Statics.field2968 = class117.field1900;
                            }
                            client.field459 = field711[var5 + 2];
                            client.field361.method2334(75);
                            client.field361.method2087(client.field458);
                            client.field361.method2087(Statics.field2968.field1903);
                            client.field361.method2087(client.field459);
                            continue;
                        }
                        if (var378 == 5002) {
                            var6--;
                            String var327 = field712[var6];
                            var5 -= 2;
                            int var328 = field711[var5];
                            int var329 = field711[var5 + 1];
                            client.field361.method2334(123);
                            class110 var330 = client.field361;
                            int var331 = var327.length() + 1;
                            var330.method2087(var331 + 2);
                            client.field361.method2092(var327);
                            client.field361.method2087(var328 - 1);
                            client.field361.method2087(var329);
                            continue;
                        }
                        if (var378 == 5003) {
                            var5 -= 2;
                            int var332 = field711[var5];
                            int var333 = field711[var5 + 1];
                            class31 var334 = class10.method1427(var332, var333);
                            if (var334 == null) {
                                field711[var5++] = -1;
                                field711[var5++] = 0;
                                field712[var6++] = "";
                                field712[var6++] = "";
                                field712[var6++] = "";
                            } else {
                                field711[var5++] = var334.field702;
                                field711[var5++] = var334.field693;
                                field712[var6++] = var334.field695 == null ? "" : var334.field695;
                                field712[var6++] = var334.field696 == null ? "" : var334.field696;
                                field712[var6++] = var334.field692 == null ? "" : var334.field692;
                            }
                            continue;
                        }
                        if (var378 == 5004) {
                            var5--;
                            int var335 = field711[var5];
                            class31 var336 = class10.method3114(var335);
                            if (var336 == null) {
                                field711[var5++] = -1;
                                field711[var5++] = 0;
                                field712[var6++] = "";
                                field712[var6++] = "";
                                field712[var6++] = "";
                            } else {
                                field711[var5++] = var336.field697;
                                field711[var5++] = var336.field693;
                                field712[var6++] = var336.field695 == null ? "" : var336.field695;
                                field712[var6++] = var336.field696 == null ? "" : var336.field696;
                                field712[var6++] = var336.field692 == null ? "" : var336.field692;
                            }
                            continue;
                        }
                        if (var378 == 5005) {
                            if (Statics.field2968 == null) {
                                field711[var5++] = -1;
                            } else {
                                field711[var5++] = Statics.field2968.field1903;
                            }
                            continue;
                        }
                        if (var378 == 5008) {
                            var6--;
                            String var337 = field712[var6];
                            var5--;
                            int var338 = field711[var5];
                            String var339 = var337.toLowerCase();
                            byte var340 = 0;
                            if (var339.startsWith(class143.field2316)) {
                                var340 = 0;
                                var337 = var337.substring(class143.field2316.length());
                            } else if (var339.startsWith(class143.field2253)) {
                                var340 = 1;
                                var337 = var337.substring(class143.field2253.length());
                            } else if (var339.startsWith(class143.field2320)) {
                                var340 = 2;
                                var337 = var337.substring(class143.field2320.length());
                            } else if (var339.startsWith(class143.field2322)) {
                                var340 = 3;
                                var337 = var337.substring(class143.field2322.length());
                            } else if (var339.startsWith(class143.field2387)) {
                                var340 = 4;
                                var337 = var337.substring(class143.field2387.length());
                            } else if (var339.startsWith(class143.field2207)) {
                                var340 = 5;
                                var337 = var337.substring(class143.field2207.length());
                            } else if (var339.startsWith(class143.field2328)) {
                                var340 = 6;
                                var337 = var337.substring(class143.field2328.length());
                            } else if (var339.startsWith(class143.field2330)) {
                                var340 = 7;
                                var337 = var337.substring(class143.field2330.length());
                            } else if (var339.startsWith(class143.field2332)) {
                                var340 = 8;
                                var337 = var337.substring(class143.field2332.length());
                            } else if (var339.startsWith(class143.field2334)) {
                                var340 = 9;
                                var337 = var337.substring(class143.field2334.length());
                            } else if (var339.startsWith(class143.field2336)) {
                                var340 = 10;
                                var337 = var337.substring(class143.field2336.length());
                            } else if (var339.startsWith(class143.field2338)) {
                                var340 = 11;
                                var337 = var337.substring(class143.field2338.length());
                            } else if (client.field283 != 0) {
                                if (var339.startsWith(class143.field2317)) {
                                    var340 = 0;
                                    var337 = var337.substring(class143.field2317.length());
                                } else if (var339.startsWith(class143.field2319)) {
                                    var340 = 1;
                                    var337 = var337.substring(class143.field2319.length());
                                } else if (var339.startsWith(class143.field2178)) {
                                    var340 = 2;
                                    var337 = var337.substring(class143.field2178.length());
                                } else if (var339.startsWith(class143.field2323)) {
                                    var340 = 3;
                                    var337 = var337.substring(class143.field2323.length());
                                } else if (var339.startsWith(class143.field2325)) {
                                    var340 = 4;
                                    var337 = var337.substring(class143.field2325.length());
                                } else if (var339.startsWith(class143.field2327)) {
                                    var340 = 5;
                                    var337 = var337.substring(class143.field2327.length());
                                } else if (var339.startsWith(class143.field2329)) {
                                    var340 = 6;
                                    var337 = var337.substring(class143.field2329.length());
                                } else if (var339.startsWith(class143.field2331)) {
                                    var340 = 7;
                                    var337 = var337.substring(class143.field2331.length());
                                } else if (var339.startsWith(class143.field2333)) {
                                    var340 = 8;
                                    var337 = var337.substring(class143.field2333.length());
                                } else if (var339.startsWith(class143.field2335)) {
                                    var340 = 9;
                                    var337 = var337.substring(class143.field2335.length());
                                } else if (var339.startsWith(class143.field2337)) {
                                    var340 = 10;
                                    var337 = var337.substring(class143.field2337.length());
                                } else if (var339.startsWith(class143.field2260)) {
                                    var340 = 11;
                                    var337 = var337.substring(class143.field2260.length());
                                }
                            }
                            String var341 = var337.toLowerCase();
                            byte var342 = 0;
                            if (var341.startsWith(class143.field2203)) {
                                var342 = 1;
                                var337 = var337.substring(class143.field2203.length());
                            } else if (var341.startsWith(class143.field2342)) {
                                var342 = 2;
                                var337 = var337.substring(class143.field2342.length());
                            } else if (var341.startsWith(class143.field2344)) {
                                var342 = 3;
                                var337 = var337.substring(class143.field2344.length());
                            } else if (var341.startsWith(class143.field2346)) {
                                var342 = 4;
                                var337 = var337.substring(class143.field2346.length());
                            } else if (var341.startsWith(class143.field2348)) {
                                var342 = 5;
                                var337 = var337.substring(class143.field2348.length());
                            } else if (client.field283 != 0) {
                                if (var341.startsWith(class143.field2206)) {
                                    var342 = 1;
                                    var337 = var337.substring(class143.field2206.length());
                                } else if (var341.startsWith(class143.field2176)) {
                                    var342 = 2;
                                    var337 = var337.substring(class143.field2176.length());
                                } else if (var341.startsWith(class143.field2382)) {
                                    var342 = 3;
                                    var337 = var337.substring(class143.field2382.length());
                                } else if (var341.startsWith(class143.field2266)) {
                                    var342 = 4;
                                    var337 = var337.substring(class143.field2266.length());
                                } else if (var341.startsWith(class143.field2189)) {
                                    var342 = 5;
                                    var337 = var337.substring(class143.field2189.length());
                                }
                            }
                            client.field361.method2334(152);
                            client.field361.method2087(0);
                            int var343 = client.field361.field1835;
                            client.field361.method2087(var338);
                            client.field361.method2087(var340);
                            client.field361.method2087(var342);
                            class110 var344 = client.field361;
                            int var345 = var344.field1835;
                            int var346 = var337.length();
                            byte[] var347 = new byte[var346];
                            for (int var348 = 0; var348 < var346; var348++) {
                                char var349 = var337.charAt(var348);
                                if (!(var349 <= 0 || var349 >= 128) || !(var349 < 160 || var349 > 255)) {
                                    var347[var348] = (byte) var349;
                                } else if (var349 == 8364) {
                                    var347[var348] = -128;
                                } else if (var349 == 8218) {
                                    var347[var348] = -126;
                                } else if (var349 == 402) {
                                    var347[var348] = -125;
                                } else if (var349 == 8222) {
                                    var347[var348] = -124;
                                } else if (var349 == 8230) {
                                    var347[var348] = -123;
                                } else if (var349 == 8224) {
                                    var347[var348] = -122;
                                } else if (var349 == 8225) {
                                    var347[var348] = -121;
                                } else if (var349 == 710) {
                                    var347[var348] = -120;
                                } else if (var349 == 8240) {
                                    var347[var348] = -119;
                                } else if (var349 == 352) {
                                    var347[var348] = -118;
                                } else if (var349 == 8249) {
                                    var347[var348] = -117;
                                } else if (var349 == 338) {
                                    var347[var348] = -116;
                                } else if (var349 == 381) {
                                    var347[var348] = -114;
                                } else if (var349 == 8216) {
                                    var347[var348] = -111;
                                } else if (var349 == 8217) {
                                    var347[var348] = -110;
                                } else if (var349 == 8220) {
                                    var347[var348] = -109;
                                } else if (var349 == 8221) {
                                    var347[var348] = -108;
                                } else if (var349 == 8226) {
                                    var347[var348] = -107;
                                } else if (var349 == 8211) {
                                    var347[var348] = -106;
                                } else if (var349 == 8212) {
                                    var347[var348] = -105;
                                } else if (var349 == 732) {
                                    var347[var348] = -104;
                                } else if (var349 == 8482) {
                                    var347[var348] = -103;
                                } else if (var349 == 353) {
                                    var347[var348] = -102;
                                } else if (var349 == 8250) {
                                    var347[var348] = -101;
                                } else if (var349 == 339) {
                                    var347[var348] = -100;
                                } else if (var349 == 382) {
                                    var347[var348] = -98;
                                } else if (var349 == 376) {
                                    var347[var348] = -97;
                                } else {
                                    var347[var348] = 63;
                                }
                            }
                            var344.method2099(var347.length);
                            var344.field1835 += Statics.field2907.method2027(var347, 0, var347.length, var344.field1839, var344.field1835);
                            client.field361.method2170(client.field361.field1835 - var343);
                            continue;
                        }
                        if (var378 == 5009) {
                            var6 -= 2;
                            String var352 = field712[var6];
                            String var353 = field712[var6 + 1];
                            client.field361.method2334(129);
                            client.field361.method2088(0);
                            int var354 = client.field361.field1835;
                            client.field361.method2092(var352);
                            class110 var355 = client.field361;
                            int var356 = var355.field1835;
                            int var357 = var353.length();
                            byte[] var358 = new byte[var357];
                            for (int var359 = 0; var359 < var357; var359++) {
                                char var360 = var353.charAt(var359);
                                if (!(var360 <= 0 || var360 >= 128) || !(var360 < 160 || var360 > 255)) {
                                    var358[var359] = (byte) var360;
                                } else if (var360 == 8364) {
                                    var358[var359] = -128;
                                } else if (var360 == 8218) {
                                    var358[var359] = -126;
                                } else if (var360 == 402) {
                                    var358[var359] = -125;
                                } else if (var360 == 8222) {
                                    var358[var359] = -124;
                                } else if (var360 == 8230) {
                                    var358[var359] = -123;
                                } else if (var360 == 8224) {
                                    var358[var359] = -122;
                                } else if (var360 == 8225) {
                                    var358[var359] = -121;
                                } else if (var360 == 710) {
                                    var358[var359] = -120;
                                } else if (var360 == 8240) {
                                    var358[var359] = -119;
                                } else if (var360 == 352) {
                                    var358[var359] = -118;
                                } else if (var360 == 8249) {
                                    var358[var359] = -117;
                                } else if (var360 == 338) {
                                    var358[var359] = -116;
                                } else if (var360 == 381) {
                                    var358[var359] = -114;
                                } else if (var360 == 8216) {
                                    var358[var359] = -111;
                                } else if (var360 == 8217) {
                                    var358[var359] = -110;
                                } else if (var360 == 8220) {
                                    var358[var359] = -109;
                                } else if (var360 == 8221) {
                                    var358[var359] = -108;
                                } else if (var360 == 8226) {
                                    var358[var359] = -107;
                                } else if (var360 == 8211) {
                                    var358[var359] = -106;
                                } else if (var360 == 8212) {
                                    var358[var359] = -105;
                                } else if (var360 == 732) {
                                    var358[var359] = -104;
                                } else if (var360 == 8482) {
                                    var358[var359] = -103;
                                } else if (var360 == 353) {
                                    var358[var359] = -102;
                                } else if (var360 == 8250) {
                                    var358[var359] = -101;
                                } else if (var360 == 339) {
                                    var358[var359] = -100;
                                } else if (var360 == 382) {
                                    var358[var359] = -98;
                                } else if (var360 == 376) {
                                    var358[var359] = -97;
                                } else {
                                    var358[var359] = 63;
                                }
                            }
                            var355.method2099(var358.length);
                            var355.field1835 += Statics.field2907.method2027(var358, 0, var358.length, var355.field1839, var355.field1835);
                            client.field361.method2097(client.field361.field1835 - var354);
                            continue;
                        }
                        if (var378 == 5015) {
                            String var363;
                            if (Statics.field628 == null || Statics.field628.field42 == null) {
                                var363 = "";
                            } else {
                                var363 = Statics.field628.field42;
                            }
                            field712[var6++] = var363;
                            continue;
                        }
                        if (var378 == 5016) {
                            field711[var5++] = client.field459;
                            continue;
                        }
                        if (var378 == 5017) {
                            var5--;
                            int var364 = field711[var5];
                            field711[var5++] = class10.method1016(var364);
                            continue;
                        }
                        if (var378 == 5018) {
                            var5--;
                            int var365 = field711[var5];
                            int[] var366 = field711;
                            int var367 = var5++;
                            class31 var368 = (class31) class10.field133.method3184((long) var365);
                            int var369;
                            if (var368 == null) {
                                var369 = -1;
                            } else if (class10.field139.field2858 == var368.field2863) {
                                var369 = -1;
                            } else {
                                var369 = ((class31) var368.field2863).field702;
                            }
                            var366[var367] = var369;
                            continue;
                        }
                        if (var378 == 5019) {
                            var5--;
                            int var370 = field711[var5];
                            field711[var5++] = class10.method593(var370);
                            continue;
                        }
                        if (var378 == 5020) {
                            var6--;
                            String var371 = field712[var6];
                            if (var371.equalsIgnoreCase("toggleroof")) {
                                Statics.field1979.field122 = !Statics.field1979.field122;
                                class9.method1862();
                                if (Statics.field1979.field122) {
                                    class10.method100(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method100(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field412 >= 2) {
                                if (var371.equalsIgnoreCase("fpson")) {
                                    client.field257 = true;
                                }
                                if (var371.equalsIgnoreCase("fpsoff")) {
                                    client.field257 = false;
                                }
                                if (var371.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var371.equalsIgnoreCase("clientdrop")) {
                                    client.method581();
                                }
                                if (var371.equalsIgnoreCase("errortest") && client.field468 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field361.method2334(183);
                            client.field361.method2087(var371.length() + 1);
                            client.field361.method2092(var371);
                            continue;
                        }
                        if (var378 == 5021) {
                            var6--;
                            client.field460 = field712[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var378 == 5022) {
                            field712[var6++] = client.field460;
                            continue;
                        }
                    }
                }
                if (var378 >= 5600 || var378 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var372 = field711[var5];
                int var373 = field711[var5 + 1];
                if (!client.field488) {
                    client.field291 = var372;
                    client.field478 = var373;
                }
            }
        } catch (Exception var377) {
            StringBuilder var375 = new StringBuilder(30);
            var375.append("").append(var4.field2873).append(" ");
            for (int var376 = field713 - 1; var376 >= 0; var376--) {
                var375.append("").append(field718[var376].field177.field2873).append(" ");
            }
            var375.append("").append(var10);
            class135.method1860(var375.toString(), var377);
        }
    }

    @ObfuscatedName("cp.h(IB)V")
    public static void method1762(int arg0) {
        if (arg0 == -1 || !class153.method2045(arg0)) {
            return;
        }
        class153[] var1 = Statics.field2590[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3.field2603 != null) {
                class1 var4 = new class1();
                var4.field12 = var3;
                var4.field14 = var3.field2603;
                method510(var4, 2000000);
            }
        }
    }
}
