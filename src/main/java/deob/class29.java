package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ay")
public class class29 {

    @ObfuscatedName("ay.r")
    public static int[] field684 = new int[5];

    @ObfuscatedName("ay.i")
    public static int[][] field683 = new int[5][5000];

    @ObfuscatedName("ay.f")
    public static int[] field687 = new int[1000];

    @ObfuscatedName("ay.a")
    public static String[] field680 = new String[1000];

    @ObfuscatedName("ay.w")
    public static int field686 = 0;

    @ObfuscatedName("ay.u")
    public static class12[] field689 = new class12[50];

    @ObfuscatedName("ay.j")
    public static Calendar field690 = Calendar.getInstance();

    @ObfuscatedName("ay.q")
    public static final String[] field691 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class29() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ec.m(Lm;B)V")
    public static void method2814(class1 arg0) {
        method519(arg0, 200000);
    }

    @ObfuscatedName("e.k(Lm;II)V")
    public static void method519(class1 arg0, int arg1) {
        Object[] var2 = arg0.field9;
        int var3 = (Integer) var2[0];
        class18 var4 = class18.method478(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field521;
        int[] var9 = var4.field534;
        byte var10 = -1;
        field686 = 0;
        try {
            Statics.field136 = new int[var4.field524];
            int var11 = 0;
            Statics.field672 = new String[var4.field522];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field11 == null ? -1 : arg0.field11.field2507;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field11 == null ? -1 : arg0.field11.field2527;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2507;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2527;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field2;
                    }
                    Statics.field136[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field672[var12++] = var15;
                }
            }
            int var16 = 0;
            label2542: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var418 = var8[var7];
                if (var418 < 100) {
                    if (var418 == 0) {
                        field687[var5++] = var9[var7];
                        continue;
                    }
                    if (var418 == 1) {
                        int var17 = var9[var7];
                        field687[var5++] = class150.field2603[var17];
                        continue;
                    }
                    if (var418 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class150.field2603[var18] = field687[var5];
                        client.method1761(var18);
                        continue;
                    }
                    if (var418 == 3) {
                        field680[var6++] = var4.field523[var7];
                        continue;
                    }
                    if (var418 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var418 == 7) {
                        var5 -= 2;
                        if (field687[var5 + 1] != field687[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var418 == 8) {
                        var5 -= 2;
                        if (field687[var5 + 1] == field687[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var418 == 9) {
                        var5 -= 2;
                        if (field687[var5] < field687[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var418 == 10) {
                        var5 -= 2;
                        if (field687[var5] > field687[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var418 == 21) {
                        if (field686 == 0) {
                            return;
                        }
                        class12 var19 = field689[--field686];
                        var4 = var19.field200;
                        var8 = var4.field521;
                        var9 = var4.field534;
                        var7 = var19.field195;
                        Statics.field136 = var19.field190;
                        Statics.field672 = var19.field198;
                        continue;
                    }
                    if (var418 == 25) {
                        int var20 = var9[var7];
                        field687[var5++] = class150.method88(var20);
                        continue;
                    }
                    if (var418 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field687[var5];
                        class39 var23 = (class39) class39.field947.method3137((long) var21);
                        class39 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field945.method2725(14, var21);
                            class39 var26 = new class39();
                            if (var25 != null) {
                                var26.method760(new class104(var25));
                            }
                            class39.field947.method3130(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field954;
                        int var29 = var24.field948;
                        int var30 = var24.field949;
                        int var31 = class150.field2607[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class150.field2603[var28] = class150.field2603[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var418 == 31) {
                        var5 -= 2;
                        if (field687[var5] <= field687[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var418 == 32) {
                        var5 -= 2;
                        if (field687[var5] >= field687[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var418 == 33) {
                        field687[var5++] = Statics.field136[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var418 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field136[var10001] = field687[var5];
                        continue;
                    }
                    if (var418 == 35) {
                        field680[var6++] = Statics.field672[var9[var7]];
                        continue;
                    }
                    if (var418 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field672[var10001] = field680[var6];
                        continue;
                    }
                    if (var418 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String var34 = class189.method48(field680, var6, var33);
                        field680[var6++] = var34;
                        continue;
                    }
                    if (var418 == 38) {
                        var5--;
                        continue;
                    }
                    if (var418 == 39) {
                        var6--;
                        continue;
                    }
                    if (var418 == 40) {
                        int var35 = var9[var7];
                        class18 var36 = class18.method478(var35);
                        int[] var37 = new int[var36.field524];
                        String[] var38 = new String[var36.field522];
                        for (int var39 = 0; var39 < var36.field520; var39++) {
                            var37[var39] = field687[var5 - var36.field520 + var39];
                        }
                        for (int var40 = 0; var40 < var36.field533; var40++) {
                            var38[var40] = field680[var6 - var36.field533 + var40];
                        }
                        var5 -= var36.field520;
                        var6 -= var36.field533;
                        class12 var41 = new class12();
                        var41.field200 = var4;
                        var41.field195 = var7;
                        var41.field190 = Statics.field136;
                        var41.field198 = Statics.field672;
                        field689[++field686 - 1] = var41;
                        var4 = var36;
                        var8 = var36.field521;
                        var9 = var36.field534;
                        var7 = -1;
                        Statics.field136 = var37;
                        Statics.field672 = var38;
                        continue;
                    }
                    if (var418 == 42) {
                        field687[var5++] = client.field452[var9[var7]];
                        continue;
                    }
                    if (var418 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field452[var10001] = field687[var5];
                        continue;
                    }
                    if (var418 == 44) {
                        int var42 = var9[var7] >> 16;
                        int var43 = var9[var7] & 0xFFFF;
                        var5--;
                        int var44 = field687[var5];
                        if (var44 >= 0 && var44 <= 5000) {
                            field684[var42] = var44;
                            byte var45 = -1;
                            if (var43 == 105) {
                                var45 = 0;
                            }
                            int var46 = 0;
                            while (true) {
                                if (var46 >= var44) {
                                    continue label2542;
                                }
                                field683[var42][var46] = var45;
                                var46++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var418 == 45) {
                        int var47 = var9[var7];
                        var5--;
                        int var48 = field687[var5];
                        if (var48 >= 0 && var48 < field684[var47]) {
                            field687[var5++] = field683[var47][var48];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var418 == 46) {
                        int var49 = var9[var7];
                        var5 -= 2;
                        int var50 = field687[var5];
                        if (var50 >= 0 && var50 < field684[var49]) {
                            field683[var49][var50] = field687[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var418 == 47) {
                        String var51 = client.field376[var9[var7]];
                        if (var51 == null) {
                            var51 = "null";
                        }
                        field680[var6++] = var51;
                        continue;
                    }
                    if (var418 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field376[var10001] = field680[var6];
                        continue;
                    }
                }
                boolean var52;
                if (var9[var7] == 1) {
                    var52 = true;
                } else {
                    var52 = false;
                }
                if (var418 < 1000) {
                    if (var418 == 100) {
                        var5 -= 3;
                        int var53 = field687[var5];
                        int var54 = field687[var5 + 1];
                        int var55 = field687[var5 + 2];
                        if (var54 == 0) {
                            throw new RuntimeException();
                        }
                        class148 var56 = class148.method1290(var53);
                        if (var56.field2585 == null) {
                            var56.field2585 = new class148[var55 + 1];
                        }
                        if (var56.field2585.length <= var55) {
                            class148[] var57 = new class148[var55 + 1];
                            for (int var58 = 0; var58 < var56.field2585.length; var58++) {
                                var57[var58] = var56.field2585[var58];
                            }
                            var56.field2585 = var57;
                        }
                        if (var55 > 0 && var56.field2585[var55 - 1] == null) {
                            throw new RuntimeException("" + (var55 - 1));
                        }
                        class148 var59 = new class148();
                        var59.field2479 = var54;
                        var59.field2502 = var59.field2507 = var56.field2507;
                        var59.field2527 = var55;
                        var59.field2476 = true;
                        var56.field2585[var55] = var59;
                        if (var52) {
                            Statics.field688 = var59;
                        } else {
                            Statics.field1034 = var59;
                        }
                        client.method141(var56);
                        continue;
                    }
                    if (var418 == 101) {
                        class148 var60 = var52 ? Statics.field688 : Statics.field1034;
                        class148 var61 = class148.method1290(var60.field2507);
                        var61.field2585[var60.field2527] = null;
                        client.method141(var61);
                        continue;
                    }
                    if (var418 == 102) {
                        var5--;
                        class148 var62 = class148.method1290(field687[var5]);
                        var62.field2585 = null;
                        client.method141(var62);
                        continue;
                    }
                    if (var418 == 200) {
                        var5 -= 2;
                        int var63 = field687[var5];
                        int var64 = field687[var5 + 1];
                        class148 var65 = class148.method2650(var63, var64);
                        if (var65 != null && var64 != -1) {
                            field687[var5++] = 1;
                            if (var52) {
                                Statics.field688 = var65;
                            } else {
                                Statics.field1034 = var65;
                            }
                            continue;
                        }
                        field687[var5++] = 0;
                        continue;
                    }
                } else if (var418 >= 1000 && var418 < 1100 || var418 >= 2000 && var418 < 2100) {
                    class148 var66;
                    if (var418 >= 2000) {
                        var418 -= 1000;
                        var5--;
                        var66 = class148.method1290(field687[var5]);
                    } else {
                        var66 = var52 ? Statics.field688 : Statics.field1034;
                    }
                    if (var418 == 1000) {
                        var5 -= 2;
                        var66.field2482 = field687[var5];
                        var66.field2555 = field687[var5 + 1];
                        client.method141(var66);
                        continue;
                    }
                    if (var418 == 1001) {
                        var5 -= 2;
                        var66.field2485 = field687[var5];
                        var66.field2487 = field687[var5 + 1];
                        client.method141(var66);
                        continue;
                    }
                    if (var418 == 1003) {
                        var5--;
                        boolean var67 = field687[var5] == 1;
                        if (var66.field2589 != var67) {
                            var66.field2589 = var67;
                            client.method141(var66);
                        }
                        continue;
                    }
                } else if (var418 >= 1100 && var418 < 1200 || var418 >= 2100 && var418 < 2200) {
                    class148 var68;
                    if (var418 >= 2000) {
                        var418 -= 1000;
                        var5--;
                        var68 = class148.method1290(field687[var5]);
                    } else {
                        var68 = var52 ? Statics.field688 : Statics.field1034;
                    }
                    if (var418 == 1100) {
                        var5 -= 2;
                        var68.field2495 = field687[var5];
                        if (var68.field2495 > var68.field2492 - var68.field2485) {
                            var68.field2495 = var68.field2492 - var68.field2485;
                        }
                        if (var68.field2495 < 0) {
                            var68.field2495 = 0;
                        }
                        var68.field2551 = field687[var5 + 1];
                        if (var68.field2551 > var68.field2575 - var68.field2487) {
                            var68.field2551 = var68.field2575 - var68.field2487;
                        }
                        if (var68.field2551 < 0) {
                            var68.field2551 = 0;
                        }
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1101) {
                        var5--;
                        var68.field2494 = field687[var5];
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1102) {
                        var5--;
                        var68.field2523 = field687[var5] == 1;
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1103) {
                        var5--;
                        var68.field2499 = field687[var5];
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1104) {
                        var5--;
                        var68.field2500 = field687[var5];
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1105) {
                        var5--;
                        var68.field2501 = field687[var5];
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1106) {
                        var5--;
                        var68.field2486 = field687[var5];
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1107) {
                        var5--;
                        var68.field2504 = field687[var5] == 1;
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1108) {
                        var68.field2509 = 1;
                        var5--;
                        var68.field2547 = field687[var5];
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1109) {
                        var5 -= 6;
                        var68.field2554 = field687[var5];
                        var68.field2516 = field687[var5 + 1];
                        var68.field2489 = field687[var5 + 2];
                        var68.field2518 = field687[var5 + 3];
                        var68.field2519 = field687[var5 + 4];
                        var68.field2520 = field687[var5 + 5];
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1110) {
                        var5--;
                        int var69 = field687[var5];
                        if (var68.field2517 != var69) {
                            var68.field2517 = var69;
                            var68.field2583 = 0;
                            var68.field2483 = 0;
                            client.method141(var68);
                        }
                        continue;
                    }
                    if (var418 == 1111) {
                        var5--;
                        var68.field2522 = field687[var5] == 1;
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1112) {
                        var6--;
                        String var70 = field680[var6];
                        if (!var70.equals(var68.field2537)) {
                            var68.field2537 = var70;
                            client.method141(var68);
                        }
                        continue;
                    }
                    if (var418 == 1113) {
                        var5--;
                        var68.field2490 = field687[var5];
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1114) {
                        var5 -= 3;
                        var68.field2591 = field687[var5];
                        var68.field2528 = field687[var5 + 1];
                        var68.field2526 = field687[var5 + 2];
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1115) {
                        var5--;
                        var68.field2513 = field687[var5] == 1;
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1116) {
                        var5--;
                        var68.field2544 = field687[var5];
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1117) {
                        var5--;
                        var68.field2506 = field687[var5];
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1118) {
                        var5--;
                        var68.field2505 = field687[var5] == 1;
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1119) {
                        var5--;
                        var68.field2508 = field687[var5] == 1;
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1120) {
                        var5 -= 2;
                        var68.field2492 = field687[var5];
                        var68.field2575 = field687[var5 + 1];
                        client.method141(var68);
                        continue;
                    }
                    if (var418 == 1121) {
                        client.method2056(var68.field2507, var68.field2527);
                        client.field446 = var68;
                        client.method141(var68);
                        continue;
                    }
                } else if (var418 >= 1200 && var418 < 1300 || var418 >= 2200 && var418 < 2300) {
                    class148 var71;
                    if (var418 >= 2000) {
                        var418 -= 1000;
                        var5--;
                        var71 = class148.method1290(field687[var5]);
                    } else {
                        var71 = var52 ? Statics.field688 : Statics.field1034;
                    }
                    client.method141(var71);
                    if (var418 == 1200) {
                        var5 -= 2;
                        int var72 = field687[var5];
                        int var73 = field687[var5 + 1];
                        var71.field2581 = var72;
                        var71.field2582 = var73;
                        class42 var74 = class42.method124(var72);
                        var71.field2489 = var74.field992;
                        var71.field2518 = var74.field995;
                        var71.field2519 = var74.field994;
                        var71.field2554 = var74.field1015;
                        var71.field2516 = var74.field996;
                        var71.field2520 = var74.field991;
                        if (var71.field2485 > 0) {
                            var71.field2520 = var71.field2520 * 32 / var71.field2485;
                        }
                        continue;
                    }
                    if (var418 == 1201) {
                        var71.field2509 = 2;
                        var5--;
                        var71.field2547 = field687[var5];
                        continue;
                    }
                    if (var418 == 1202) {
                        var71.field2509 = 3;
                        var71.field2547 = Statics.field944.field50.method2920();
                        continue;
                    }
                } else if ((var418 < 1300 || var418 >= 1400) && (var418 < 2300 || var418 >= 2400)) {
                    if (var418 >= 1400 && var418 < 1500 || var418 >= 2400 && var418 < 2500) {
                        class148 var79;
                        if (var418 >= 2000) {
                            var418 -= 1000;
                            var5--;
                            var79 = class148.method1290(field687[var5]);
                        } else {
                            var79 = var52 ? Statics.field688 : Statics.field1034;
                        }
                        var6--;
                        String var80 = field680[var6];
                        int[] var81 = null;
                        if (var80.length() > 0 && var80.charAt(var80.length() - 1) == 'Y') {
                            var5--;
                            int var82 = field687[var5];
                            if (var82 > 0) {
                                var81 = new int[var82];
                                while (var82-- > 0) {
                                    var5--;
                                    var81[var82] = field687[var5];
                                }
                            }
                            var80 = var80.substring(0, var80.length() - 1);
                        }
                        Object[] var83 = new Object[var80.length() + 1];
                        for (int var84 = var83.length - 1; var84 >= 1; var84--) {
                            if (var80.charAt(var84 - 1) == 's') {
                                var6--;
                                var83[var84] = field680[var6];
                            } else {
                                var5--;
                                var83[var84] = Integer.valueOf(field687[var5]);
                            }
                        }
                        var5--;
                        int var85 = field687[var5];
                        if (var85 == -1) {
                            var83 = null;
                        } else {
                            var83[0] = Integer.valueOf(var85);
                        }
                        if (var418 == 1400) {
                            var79.field2546 = var83;
                        }
                        if (var418 == 1401) {
                            var79.field2549 = var83;
                        }
                        if (var418 == 1402) {
                            var79.field2586 = var83;
                        }
                        if (var418 == 1403) {
                            var79.field2550 = var83;
                        }
                        if (var418 == 1404) {
                            var79.field2552 = var83;
                        }
                        if (var418 == 1405) {
                            var79.field2553 = var83;
                        }
                        if (var418 == 1406) {
                            var79.field2556 = var83;
                        }
                        if (var418 == 1407) {
                            var79.field2557 = var83;
                            var79.field2558 = var81;
                        }
                        if (var418 == 1408) {
                            var79.field2584 = var83;
                        }
                        if (var418 == 1409) {
                            var79.field2564 = var83;
                        }
                        if (var418 == 1410) {
                            var79.field2530 = var83;
                        }
                        if (var418 == 1411) {
                            var79.field2563 = var83;
                        }
                        if (var418 == 1412) {
                            var79.field2541 = var83;
                        }
                        if (var418 == 1414) {
                            var79.field2471 = var83;
                            var79.field2560 = var81;
                        }
                        if (var418 == 1415) {
                            var79.field2561 = var83;
                            var79.field2562 = var81;
                        }
                        if (var418 == 1416) {
                            var79.field2498 = var83;
                        }
                        if (var418 == 1417) {
                            var79.field2565 = var83;
                        }
                        if (var418 == 1418) {
                            var79.field2566 = var83;
                        }
                        if (var418 == 1419) {
                            var79.field2567 = var83;
                        }
                        if (var418 == 1420) {
                            var79.field2568 = var83;
                        }
                        if (var418 == 1421) {
                            var79.field2569 = var83;
                        }
                        if (var418 == 1422) {
                            var79.field2576 = var83;
                        }
                        if (var418 == 1423) {
                            var79.field2571 = var83;
                        }
                        if (var418 == 1424) {
                            var79.field2478 = var83;
                        }
                        var79.field2548 = true;
                        continue;
                    }
                    if (var418 < 1600) {
                        class148 var86 = var52 ? Statics.field688 : Statics.field1034;
                        if (var418 == 1500) {
                            field687[var5++] = var86.field2482;
                            continue;
                        }
                        if (var418 == 1501) {
                            field687[var5++] = var86.field2555;
                            continue;
                        }
                        if (var418 == 1502) {
                            field687[var5++] = var86.field2485;
                            continue;
                        }
                        if (var418 == 1503) {
                            field687[var5++] = var86.field2487;
                            continue;
                        }
                        if (var418 == 1504) {
                            field687[var5++] = var86.field2589 ? 1 : 0;
                            continue;
                        }
                        if (var418 == 1505) {
                            field687[var5++] = var86.field2502;
                            continue;
                        }
                    } else if (var418 < 1700) {
                        class148 var87 = var52 ? Statics.field688 : Statics.field1034;
                        if (var418 == 1600) {
                            field687[var5++] = var87.field2495;
                            continue;
                        }
                        if (var418 == 1601) {
                            field687[var5++] = var87.field2551;
                            continue;
                        }
                        if (var418 == 1602) {
                            field680[var6++] = var87.field2537;
                            continue;
                        }
                        if (var418 == 1603) {
                            field687[var5++] = var87.field2492;
                            continue;
                        }
                        if (var418 == 1604) {
                            field687[var5++] = var87.field2575;
                            continue;
                        }
                        if (var418 == 1605) {
                            field687[var5++] = var87.field2520;
                            continue;
                        }
                        if (var418 == 1606) {
                            field687[var5++] = var87.field2489;
                            continue;
                        }
                        if (var418 == 1607) {
                            field687[var5++] = var87.field2519;
                            continue;
                        }
                        if (var418 == 1608) {
                            field687[var5++] = var87.field2518;
                            continue;
                        }
                    } else if (var418 < 1800) {
                        class148 var88 = var52 ? Statics.field688 : Statics.field1034;
                        if (var418 == 1700) {
                            field687[var5++] = var88.field2581;
                            continue;
                        }
                        if (var418 == 1701) {
                            if (var88.field2581 == -1) {
                                field687[var5++] = 0;
                            } else {
                                field687[var5++] = var88.field2582;
                            }
                            continue;
                        }
                        if (var418 == 1702) {
                            field687[var5++] = var88.field2527;
                            continue;
                        }
                    } else if (var418 < 1900) {
                        class148 var89 = var52 ? Statics.field688 : Statics.field1034;
                        if (var418 == 1800) {
                            field687[var5++] = class152.method2677(client.method2642(var89));
                            continue;
                        }
                        if (var418 == 1801) {
                            var5--;
                            int var90 = field687[var5];
                            int var419 = var90 - 1;
                            if (var89.field2538 != null && var419 < var89.field2538.length && var89.field2538[var419] != null) {
                                field680[var6++] = var89.field2538[var419];
                                continue;
                            }
                            field680[var6++] = "";
                            continue;
                        }
                        if (var418 == 1802) {
                            if (var89.field2477 == null) {
                                field680[var6++] = "";
                            } else {
                                field680[var6++] = var89.field2477;
                            }
                            continue;
                        }
                    } else if (var418 < 2600) {
                        var5--;
                        class148 var91 = class148.method1290(field687[var5]);
                        if (var418 == 2500) {
                            field687[var5++] = var91.field2482;
                            continue;
                        }
                        if (var418 == 2501) {
                            field687[var5++] = var91.field2555;
                            continue;
                        }
                        if (var418 == 2502) {
                            field687[var5++] = var91.field2485;
                            continue;
                        }
                        if (var418 == 2503) {
                            field687[var5++] = var91.field2487;
                            continue;
                        }
                        if (var418 == 2504) {
                            field687[var5++] = var91.field2589 ? 1 : 0;
                            continue;
                        }
                        if (var418 == 2505) {
                            field687[var5++] = var91.field2502;
                            continue;
                        }
                    } else if (var418 < 2700) {
                        var5--;
                        class148 var92 = class148.method1290(field687[var5]);
                        if (var418 == 2600) {
                            field687[var5++] = var92.field2495;
                            continue;
                        }
                        if (var418 == 2601) {
                            field687[var5++] = var92.field2551;
                            continue;
                        }
                        if (var418 == 2602) {
                            field680[var6++] = var92.field2537;
                            continue;
                        }
                        if (var418 == 2603) {
                            field687[var5++] = var92.field2492;
                            continue;
                        }
                        if (var418 == 2604) {
                            field687[var5++] = var92.field2575;
                            continue;
                        }
                        if (var418 == 2605) {
                            field687[var5++] = var92.field2520;
                            continue;
                        }
                        if (var418 == 2606) {
                            field687[var5++] = var92.field2489;
                            continue;
                        }
                        if (var418 == 2607) {
                            field687[var5++] = var92.field2519;
                            continue;
                        }
                        if (var418 == 2608) {
                            field687[var5++] = var92.field2518;
                            continue;
                        }
                    } else if (var418 < 2800) {
                        if (var418 == 2700) {
                            var5--;
                            class148 var93 = class148.method1290(field687[var5]);
                            field687[var5++] = var93.field2581;
                            continue;
                        }
                        if (var418 == 2701) {
                            var5--;
                            class148 var94 = class148.method1290(field687[var5]);
                            if (var94.field2581 == -1) {
                                field687[var5++] = 0;
                            } else {
                                field687[var5++] = var94.field2582;
                            }
                            continue;
                        }
                        if (var418 == 2702) {
                            var5--;
                            int var95 = field687[var5];
                            class4 var96 = (class4) client.field408.method3159((long) var95);
                            if (var96 == null) {
                                field687[var5++] = 0;
                            } else {
                                field687[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var418 < 2900) {
                        var5--;
                        class148 var97 = class148.method1290(field687[var5]);
                        if (var418 == 2800) {
                            field687[var5++] = class152.method2677(client.method2642(var97));
                            continue;
                        }
                        if (var418 == 2801) {
                            var5--;
                            int var98 = field687[var5];
                            int var420 = var98 - 1;
                            if (var97.field2538 != null && var420 < var97.field2538.length && var97.field2538[var420] != null) {
                                field680[var6++] = var97.field2538[var420];
                                continue;
                            }
                            field680[var6++] = "";
                            continue;
                        }
                        if (var418 == 2802) {
                            if (var97.field2477 == null) {
                                field680[var6++] = "";
                            } else {
                                field680[var6++] = var97.field2477;
                            }
                            continue;
                        }
                    } else if (var418 < 3200) {
                        if (var418 == 3100) {
                            var6--;
                            String var99 = field680[var6];
                            client.method2508(0, "", var99);
                            continue;
                        }
                        if (var418 == 3101) {
                            var5 -= 2;
                            client.method1051(Statics.field944, field687[var5], field687[var5 + 1]);
                            continue;
                        }
                        if (var418 == 3103) {
                            client.method27();
                            continue;
                        }
                        if (var418 == 3104) {
                            var6--;
                            String var100 = field680[var6];
                            int var101 = 0;
                            boolean var102 = false;
                            boolean var103 = false;
                            int var104 = 0;
                            int var105 = var100.length();
                            int var106 = 0;
                            boolean var108;
                            while (true) {
                                if (var106 >= var105) {
                                    var108 = var103;
                                    break;
                                }
                                label2738: {
                                    char var107 = var100.charAt(var106);
                                    if (var106 == 0) {
                                        if (var107 == '-') {
                                            var102 = true;
                                            break label2738;
                                        }
                                        if (var107 == '+') {
                                            break label2738;
                                        }
                                    }
                                    int var421;
                                    if (var107 >= '0' && var107 <= '9') {
                                        var421 = var107 - '0';
                                    } else if (var107 >= 'A' && var107 <= 'Z') {
                                        var421 = var107 - '7';
                                    } else {
                                        if (var107 < 'a' || var107 > 'z') {
                                            var108 = false;
                                            break;
                                        }
                                        var421 = var107 - 'W';
                                    }
                                    if (var421 >= 10) {
                                        var108 = false;
                                        break;
                                    }
                                    if (var102) {
                                        var421 = -var421;
                                    }
                                    int var109 = var104 * 10 + var421;
                                    if (var109 / 10 != var104) {
                                        var108 = false;
                                        break;
                                    }
                                    var104 = var109;
                                    var103 = true;
                                }
                                var106++;
                            }
                            if (var108) {
                                var101 = class189.method2557(var100);
                            }
                            client.field289.method2372(153);
                            client.field289.method2131(var101);
                            continue;
                        }
                        if (var418 == 3105) {
                            var6--;
                            String var111 = field680[var6];
                            client.field289.method2372(2);
                            client.field289.method2133(var111.length() + 1);
                            client.field289.method2116(var111);
                            continue;
                        }
                        if (var418 == 3106) {
                            var6--;
                            String var112 = field680[var6];
                            client.field289.method2372(199);
                            client.field289.method2133(var112.length() + 1);
                            client.field289.method2116(var112);
                            continue;
                        }
                        if (var418 == 3107) {
                            var5--;
                            int var113 = field687[var5];
                            var6--;
                            String var114 = field680[var6];
                            boolean var115 = false;
                            for (int var116 = 0; var116 < client.field367; var116++) {
                                class3 var117 = client.field366[client.field368[var116]];
                                if (var117 != null && var117.field38 != null && var117.field38.equalsIgnoreCase(var114)) {
                                    if (var113 == 1) {
                                        client.field289.method2372(110);
                                        client.field289.method2160(client.field368[var116]);
                                        client.field289.method2133(0);
                                    } else if (var113 == 4) {
                                        client.field289.method2372(219);
                                        client.field289.method2237(0);
                                        client.field289.method2160(client.field368[var116]);
                                    } else if (var113 == 6) {
                                        client.field289.method2372(76);
                                        client.field289.method2231(client.field368[var116]);
                                        client.field289.method2246(0);
                                    } else if (var113 == 7) {
                                        client.field289.method2372(48);
                                        client.field289.method2231(client.field368[var116]);
                                        client.field289.method2133(0);
                                    }
                                    var115 = true;
                                    break;
                                }
                            }
                            if (!var115) {
                                client.method2508(4, "", class139.field2259 + var114);
                            }
                            continue;
                        }
                        if (var418 == 3108) {
                            var5 -= 3;
                            int var118 = field687[var5];
                            int var119 = field687[var5 + 1];
                            int var120 = field687[var5 + 2];
                            class148 var121 = class148.method1290(var120);
                            client.method9(var121, var118, var119);
                            continue;
                        }
                        if (var418 == 3109) {
                            var5 -= 2;
                            int var122 = field687[var5];
                            int var123 = field687[var5 + 1];
                            class148 var124 = var52 ? Statics.field688 : Statics.field1034;
                            client.method9(var124, var122, var123);
                            continue;
                        }
                        if (var418 == 3110) {
                            var5--;
                            Statics.field1067 = field687[var5] == 1;
                            continue;
                        }
                        if (var418 == 3111) {
                            field687[var5++] = Statics.field1858.field145 ? 1 : 0;
                            continue;
                        }
                        if (var418 == 3112) {
                            var5--;
                            Statics.field1858.field145 = field687[var5] == 1;
                            class9.method165();
                            continue;
                        }
                        if (var418 == 3113) {
                            var6--;
                            String var125 = field680[var6];
                            var5--;
                            boolean var126 = field687[var5] == 1;
                            class122.method1320(var125, var126, false);
                            continue;
                        }
                    } else if (var418 < 3300) {
                        if (var418 == 3200) {
                            var5 -= 3;
                            int var127 = field687[var5];
                            int var128 = field687[var5 + 1];
                            int var129 = field687[var5 + 2];
                            if (client.field486 != 0 && var128 != 0 && client.field377 < 50) {
                                client.field489[client.field377] = var127;
                                client.field490[client.field377] = var128;
                                client.field317[client.field377] = var129;
                                client.field405[client.field377] = null;
                                client.field492[client.field377] = 0;
                                client.field377++;
                            }
                            continue;
                        }
                        if (var418 == 3201) {
                            var5--;
                            int var130 = field687[var5];
                            if (var130 == -1 && !client.field421) {
                                class157.method515();
                            } else if (var130 != -1 && client.field312 != var130 && client.field483 != 0 && !client.field421) {
                                class143 var131 = Statics.field1996;
                                int var132 = client.field483;
                                class157.field2660 = 1;
                                Statics.field183 = var131;
                                Statics.field1638 = var130;
                                Statics.field2366 = 0;
                                Statics.field2657 = var132;
                                Statics.field2662 = false;
                                Statics.field2056 = 2;
                            }
                            client.field312 = var130;
                            continue;
                        }
                        if (var418 == 3202) {
                            var5 -= 2;
                            int var133 = field687[var5];
                            int var10000 = field687[var5 + 1];
                            if (client.field483 != 0 && var133 != -1) {
                                class157.method1866(Statics.field67, var133, 0, client.field483, false);
                                client.field421 = true;
                            }
                            continue;
                        }
                    } else if (var418 < 3400) {
                        if (var418 == 3300) {
                            field687[var5++] = client.field463;
                            continue;
                        }
                        if (var418 == 3301) {
                            var5 -= 2;
                            int var135 = field687[var5];
                            int var136 = field687[var5 + 1];
                            int[] var137 = field687;
                            int var138 = var5++;
                            class13 var139 = (class13) class13.field207.method3159((long) var135);
                            int var140;
                            if (var139 == null) {
                                var140 = -1;
                            } else if (var136 >= 0 && var136 < var139.field203.length) {
                                var140 = var139.field203[var136];
                            } else {
                                var140 = -1;
                            }
                            var137[var138] = var140;
                            continue;
                        }
                        if (var418 == 3302) {
                            var5 -= 2;
                            int var141 = field687[var5];
                            int var142 = field687[var5 + 1];
                            int[] var143 = field687;
                            int var144 = var5++;
                            class13 var145 = (class13) class13.field207.method3159((long) var141);
                            int var146;
                            if (var145 == null) {
                                var146 = 0;
                            } else if (var142 >= 0 && var142 < var145.field204.length) {
                                var146 = var145.field204[var142];
                            } else {
                                var146 = 0;
                            }
                            var143[var144] = var146;
                            continue;
                        }
                        if (var418 == 3303) {
                            var5 -= 2;
                            int var147 = field687[var5];
                            int var148 = field687[var5 + 1];
                            field687[var5++] = Statics.method2625(var147, var148);
                            continue;
                        }
                        if (var418 == 3304) {
                            var5--;
                            int var149 = field687[var5];
                            int[] var150 = field687;
                            int var151 = var5++;
                            class41 var152 = (class41) class41.field969.method3137((long) var149);
                            class41 var153;
                            if (var152 == null) {
                                byte[] var154 = Statics.field971.method2725(5, var149);
                                class41 var155 = new class41();
                                if (var154 != null) {
                                    var155.method785(new class104(var154));
                                }
                                class41.field969.method3130(var155, (long) var149);
                                var153 = var155;
                            } else {
                                var153 = var152;
                            }
                            var150[var151] = var153.field974;
                            continue;
                        }
                        if (var418 == 3305) {
                            var5--;
                            int var156 = field687[var5];
                            field687[var5++] = client.field385[var156];
                            continue;
                        }
                        if (var418 == 3306) {
                            var5--;
                            int var157 = field687[var5];
                            field687[var5++] = client.field386[var157];
                            continue;
                        }
                        if (var418 == 3307) {
                            var5--;
                            int var158 = field687[var5];
                            field687[var5++] = client.field387[var158];
                            continue;
                        }
                        if (var418 == 3308) {
                            int var159 = Statics.field1795;
                            int var160 = (Statics.field944.field704 >> 7) + Statics.field557;
                            int var161 = (Statics.field944.field693 >> 7) + Statics.field172;
                            field687[var5++] = (var159 << 28) + (var160 << 14) + var161;
                            continue;
                        }
                        if (var418 == 3309) {
                            var5--;
                            int var162 = field687[var5];
                            field687[var5++] = var162 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var418 == 3310) {
                            var5--;
                            int var163 = field687[var5];
                            field687[var5++] = var163 >> 28;
                            continue;
                        }
                        if (var418 == 3311) {
                            var5--;
                            int var164 = field687[var5];
                            field687[var5++] = var164 & 0x3FFF;
                            continue;
                        }
                        if (var418 == 3312) {
                            field687[var5++] = client.field254 ? 1 : 0;
                            continue;
                        }
                        if (var418 == 3313) {
                            var5 -= 2;
                            int var165 = field687[var5] + 32768;
                            int var166 = field687[var5 + 1];
                            int[] var167 = field687;
                            int var168 = var5++;
                            class13 var169 = (class13) class13.field207.method3159((long) var165);
                            int var170;
                            if (var169 == null) {
                                var170 = -1;
                            } else if (var166 >= 0 && var166 < var169.field203.length) {
                                var170 = var169.field203[var166];
                            } else {
                                var170 = -1;
                            }
                            var167[var168] = var170;
                            continue;
                        }
                        if (var418 == 3314) {
                            var5 -= 2;
                            int var171 = field687[var5] + 32768;
                            int var172 = field687[var5 + 1];
                            int[] var173 = field687;
                            int var174 = var5++;
                            class13 var175 = (class13) class13.field207.method3159((long) var171);
                            int var176;
                            if (var175 == null) {
                                var176 = 0;
                            } else if (var172 >= 0 && var172 < var175.field204.length) {
                                var176 = var175.field204[var172];
                            } else {
                                var176 = 0;
                            }
                            var173[var174] = var176;
                            continue;
                        }
                        if (var418 == 3315) {
                            var5 -= 2;
                            int var177 = field687[var5] + 32768;
                            int var178 = field687[var5 + 1];
                            field687[var5++] = Statics.method2625(var177, var178);
                            continue;
                        }
                        if (var418 == 3316) {
                            if (client.field470 >= 2) {
                                field687[var5++] = client.field470;
                            } else {
                                field687[var5++] = 0;
                            }
                            continue;
                        }
                        if (var418 == 3317) {
                            field687[var5++] = client.field266;
                            continue;
                        }
                        if (var418 == 3318) {
                            field687[var5++] = client.field249;
                            continue;
                        }
                        if (var418 == 3321) {
                            field687[var5++] = client.field412;
                            continue;
                        }
                        if (var418 == 3322) {
                            field687[var5++] = client.field413;
                            continue;
                        }
                        if (var418 == 3323) {
                            if (client.field416) {
                                field687[var5++] = 1;
                            } else {
                                field687[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var418 < 3500) {
                        if (var418 == 3400) {
                            var5 -= 2;
                            int var179 = field687[var5];
                            int var180 = field687[var5 + 1];
                            class40 var181 = (class40) class40.field957.method3137((long) var179);
                            class40 var182;
                            if (var181 == null) {
                                byte[] var183 = Statics.field963.method2725(8, var179);
                                class40 var184 = new class40();
                                if (var183 != null) {
                                    var184.method772(new class104(var183));
                                }
                                class40.field957.method3130(var184, (long) var179);
                                var182 = var184;
                            } else {
                                var182 = var181;
                            }
                            class40 var185 = var182;
                            if (var182.field959 != 's') {
                            }
                            for (int var186 = 0; var186 < var185.field962; var186++) {
                                if (var185.field968[var186] == var180) {
                                    field680[var6++] = var185.field965[var186];
                                    var185 = null;
                                    break;
                                }
                            }
                            if (var185 != null) {
                                field680[var6++] = var185.field960;
                            }
                            continue;
                        }
                        if (var418 == 3408) {
                            var5 -= 4;
                            int var187 = field687[var5];
                            int var188 = field687[var5 + 1];
                            int var189 = field687[var5 + 2];
                            int var190 = field687[var5 + 3];
                            class40 var191 = (class40) class40.field957.method3137((long) var189);
                            class40 var192;
                            if (var191 == null) {
                                byte[] var193 = Statics.field963.method2725(8, var189);
                                class40 var194 = new class40();
                                if (var193 != null) {
                                    var194.method772(new class104(var193));
                                }
                                class40.field957.method3130(var194, (long) var189);
                                var192 = var194;
                            } else {
                                var192 = var191;
                            }
                            class40 var195 = var192;
                            if (var192.field958 == var187 && var192.field959 == var188) {
                                for (int var196 = 0; var196 < var195.field962; var196++) {
                                    if (var195.field968[var196] == var190) {
                                        if (var188 == 115) {
                                            field680[var6++] = var195.field965[var196];
                                        } else {
                                            field687[var5++] = var195.field964[var196];
                                        }
                                        var195 = null;
                                        break;
                                    }
                                }
                                if (var195 != null) {
                                    if (var188 == 115) {
                                        field680[var6++] = var195.field960;
                                    } else {
                                        field687[var5++] = var195.field961;
                                    }
                                }
                                continue;
                            }
                            if (var188 == 115) {
                                field680[var6++] = "null";
                            } else {
                                field687[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var418 < 3700) {
                        if (var418 == 3600) {
                            if (client.field501 == 0) {
                                field687[var5++] = -2;
                            } else if (client.field501 == 1) {
                                field687[var5++] = -1;
                            } else {
                                field687[var5++] = client.field491;
                            }
                            continue;
                        }
                        if (var418 == 3601) {
                            var5--;
                            int var197 = field687[var5];
                            if (client.field501 == 2 && var197 < client.field491) {
                                field680[var6++] = client.field502[var197].field229;
                                continue;
                            }
                            field680[var6++] = "";
                            continue;
                        }
                        if (var418 == 3602) {
                            var5--;
                            int var198 = field687[var5];
                            if (client.field501 == 2 && var198 < client.field491) {
                                field687[var5++] = client.field502[var198].field231;
                                continue;
                            }
                            field687[var5++] = 0;
                            continue;
                        }
                        if (var418 == 3603) {
                            var5--;
                            int var199 = field687[var5];
                            if (client.field501 == 2 && var199 < client.field491) {
                                field687[var5++] = client.field502[var199].field226;
                                continue;
                            }
                            field687[var5++] = 0;
                            continue;
                        }
                        if (var418 == 3604) {
                            var6--;
                            String var200 = field680[var6];
                            var5--;
                            int var201 = field687[var5];
                            client.method32(var200, var201);
                            continue;
                        }
                        if (var418 == 3605) {
                            var6--;
                            String var202 = field680[var6];
                            client.method96(var202);
                            continue;
                        }
                        if (var418 == 3606) {
                            var6--;
                            String var203 = field680[var6];
                            client.method500(var203);
                            continue;
                        }
                        if (var418 == 3607) {
                            var6--;
                            String var204 = field680[var6];
                            if (var204 == null) {
                                continue;
                            }
                            if ((client.field504 < 100 || client.field373 == 1) && client.field504 < 400) {
                                String var205 = class190.method2903(var204, Statics.field184);
                                if (var205 == null) {
                                    continue;
                                }
                                for (int var206 = 0; var206 < client.field504; var206++) {
                                    class8 var207 = client.field505[var206];
                                    String var208 = class190.method2903(var207.field131, Statics.field184);
                                    if (var208 != null && var208.equals(var205)) {
                                        client.method2508(31, "", var204 + class139.field2279);
                                        continue label2542;
                                    }
                                    if (var207.field134 != null) {
                                        String var209 = class190.method2903(var207.field134, Statics.field184);
                                        if (var209 != null && var209.equals(var205)) {
                                            client.method2508(31, "", var204 + class139.field2279);
                                            continue label2542;
                                        }
                                    }
                                }
                                for (int var210 = 0; var210 < client.field491; var210++) {
                                    class15 var211 = client.field502[var210];
                                    String var212 = class190.method2903(var211.field229, Statics.field184);
                                    if (var212 != null && var212.equals(var205)) {
                                        client.method2508(31, "", class139.field2199 + var204 + class139.field2285);
                                        continue label2542;
                                    }
                                    if (var211.field224 != null) {
                                        String var213 = class190.method2903(var211.field224, Statics.field184);
                                        if (var213 != null && var213.equals(var205)) {
                                            client.method2508(31, "", class139.field2199 + var204 + class139.field2285);
                                            continue label2542;
                                        }
                                    }
                                }
                                if (class190.method2903(Statics.field944.field38, Statics.field184).equals(var205)) {
                                    client.method2508(31, "", class139.field2281);
                                } else {
                                    client.field289.method2372(52);
                                    class107 var214 = client.field289;
                                    int var215 = var204.length() + 1;
                                    var214.method2133(var215);
                                    client.field289.method2116(var204);
                                }
                                continue;
                            }
                            client.method2508(31, "", class139.field2164);
                            continue;
                        }
                        if (var418 == 3608) {
                            var6--;
                            String var216 = field680[var6];
                            if (var216 == null) {
                                continue;
                            }
                            String var217 = class190.method2903(var216, Statics.field184);
                            if (var217 == null) {
                                continue;
                            }
                            int var218 = 0;
                            while (true) {
                                if (var218 >= client.field504) {
                                    continue label2542;
                                }
                                class8 var219 = client.field505[var218];
                                String var220 = var219.field131;
                                String var221 = class190.method2903(var220, Statics.field184);
                                if (class113.method1760(var216, var217, var220, var221)) {
                                    client.field504--;
                                    for (int var222 = var218; var222 < client.field504; var222++) {
                                        client.field505[var222] = client.field505[var222 + 1];
                                    }
                                    client.field439 = client.field318;
                                    client.field289.method2372(1);
                                    class107 var223 = client.field289;
                                    int var224 = var216.length() + 1;
                                    var223.method2133(var224);
                                    client.field289.method2116(var216);
                                    continue label2542;
                                }
                                var218++;
                            }
                        }
                        if (var418 == 3609) {
                            var6--;
                            String var225 = field680[var6];
                            if (var225.startsWith(class2.method572(0)) || var225.startsWith(class2.method572(1))) {
                                var225 = var225.substring(7);
                            }
                            field687[var5++] = client.method137(var225, false) ? 1 : 0;
                            continue;
                        }
                        if (var418 == 3611) {
                            if (client.field350 == null) {
                                field680[var6++] = "";
                            } else {
                                field680[var6++] = class188.method1865(client.field350);
                            }
                            continue;
                        }
                        if (var418 == 3612) {
                            if (client.field350 == null) {
                                field687[var5++] = 0;
                            } else {
                                field687[var5++] = Statics.field418;
                            }
                            continue;
                        }
                        if (var418 == 3613) {
                            var5--;
                            int var226 = field687[var5];
                            if (client.field350 != null && var226 < Statics.field418) {
                                field680[var6++] = Statics.field1311[var226].field563;
                                continue;
                            }
                            field680[var6++] = "";
                            continue;
                        }
                        if (var418 == 3614) {
                            var5--;
                            int var227 = field687[var5];
                            if (client.field350 != null && var227 < Statics.field418) {
                                field687[var5++] = Statics.field1311[var227].field559;
                                continue;
                            }
                            field687[var5++] = 0;
                            continue;
                        }
                        if (var418 == 3615) {
                            var5--;
                            int var228 = field687[var5];
                            if (client.field350 != null && var228 < Statics.field418) {
                                field687[var5++] = Statics.field1311[var228].field561;
                                continue;
                            }
                            field687[var5++] = 0;
                            continue;
                        }
                        if (var418 == 3616) {
                            field687[var5++] = Statics.field155;
                            continue;
                        }
                        if (var418 == 3617) {
                            var6--;
                            String var229 = field680[var6];
                            client.method2321(var229);
                            continue;
                        }
                        if (var418 == 3618) {
                            field687[var5++] = Statics.field1243;
                            continue;
                        }
                        if (var418 == 3619) {
                            var6--;
                            String var230 = field680[var6];
                            if (!var230.equals("")) {
                                client.field289.method2372(35);
                                class107 var231 = client.field289;
                                int var232 = var230.length() + 1;
                                var231.method2133(var232);
                                client.field289.method2116(var230);
                            }
                            continue;
                        }
                        if (var418 == 3620) {
                            client.field289.method2372(35);
                            client.field289.method2133(0);
                            continue;
                        }
                        if (var418 == 3621) {
                            if (client.field501 == 0) {
                                field687[var5++] = -1;
                            } else {
                                field687[var5++] = client.field504;
                            }
                            continue;
                        }
                        if (var418 == 3622) {
                            var5--;
                            int var233 = field687[var5];
                            if (client.field501 != 0 && var233 < client.field504) {
                                field680[var6++] = client.field505[var233].field131;
                                continue;
                            }
                            field680[var6++] = "";
                            continue;
                        }
                        if (var418 == 3623) {
                            var6--;
                            String var234 = field680[var6];
                            if (var234.startsWith(class2.method572(0)) || var234.startsWith(class2.method572(1))) {
                                var234 = var234.substring(7);
                            }
                            field687[var5++] = client.method150(var234) ? 1 : 0;
                            continue;
                        }
                        if (var418 == 3624) {
                            var5--;
                            int var235 = field687[var5];
                            if (Statics.field1311 != null && var235 < Statics.field418 && Statics.field1311[var235].field563.equalsIgnoreCase(Statics.field944.field38)) {
                                field687[var5++] = 1;
                                continue;
                            }
                            field687[var5++] = 0;
                            continue;
                        }
                        if (var418 == 3625) {
                            if (client.field474 == null) {
                                field680[var6++] = "";
                            } else {
                                field680[var6++] = class188.method1865(client.field474);
                            }
                            continue;
                        }
                    } else if (var418 < 4100) {
                        if (var418 == 4000) {
                            var5 -= 2;
                            int var236 = field687[var5];
                            int var237 = field687[var5 + 1];
                            field687[var5++] = var236 + var237;
                            continue;
                        }
                        if (var418 == 4001) {
                            var5 -= 2;
                            int var238 = field687[var5];
                            int var239 = field687[var5 + 1];
                            field687[var5++] = var238 - var239;
                            continue;
                        }
                        if (var418 == 4002) {
                            var5 -= 2;
                            int var240 = field687[var5];
                            int var241 = field687[var5 + 1];
                            field687[var5++] = var240 * var241;
                            continue;
                        }
                        if (var418 == 4003) {
                            var5 -= 2;
                            int var242 = field687[var5];
                            int var243 = field687[var5 + 1];
                            field687[var5++] = var242 / var243;
                            continue;
                        }
                        if (var418 == 4004) {
                            var5--;
                            int var244 = field687[var5];
                            field687[var5++] = (int) (Math.random() * (double) var244);
                            continue;
                        }
                        if (var418 == 4005) {
                            var5--;
                            int var245 = field687[var5];
                            field687[var5++] = (int) (Math.random() * (double) (var245 + 1));
                            continue;
                        }
                        if (var418 == 4006) {
                            var5 -= 5;
                            int var246 = field687[var5];
                            int var247 = field687[var5 + 1];
                            int var248 = field687[var5 + 2];
                            int var249 = field687[var5 + 3];
                            int var250 = field687[var5 + 4];
                            field687[var5++] = (var247 - var246) * (var250 - var248) / (var249 - var248) + var246;
                            continue;
                        }
                        if (var418 == 4007) {
                            var5 -= 2;
                            int var251 = field687[var5];
                            int var252 = field687[var5 + 1];
                            field687[var5++] = var251 * var252 / 100 + var251;
                            continue;
                        }
                        if (var418 == 4008) {
                            var5 -= 2;
                            int var253 = field687[var5];
                            int var254 = field687[var5 + 1];
                            field687[var5++] = var253 | 0x1 << var254;
                            continue;
                        }
                        if (var418 == 4009) {
                            var5 -= 2;
                            int var255 = field687[var5];
                            int var256 = field687[var5 + 1];
                            field687[var5++] = var255 & -1 - (0x1 << var256);
                            continue;
                        }
                        if (var418 == 4010) {
                            var5 -= 2;
                            int var257 = field687[var5];
                            int var258 = field687[var5 + 1];
                            field687[var5++] = (var257 & 0x1 << var258) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var418 == 4011) {
                            var5 -= 2;
                            int var259 = field687[var5];
                            int var260 = field687[var5 + 1];
                            field687[var5++] = var259 % var260;
                            continue;
                        }
                        if (var418 == 4012) {
                            var5 -= 2;
                            int var261 = field687[var5];
                            int var262 = field687[var5 + 1];
                            if (var261 == 0) {
                                field687[var5++] = 0;
                            } else {
                                field687[var5++] = (int) Math.pow((double) var261, (double) var262);
                            }
                            continue;
                        }
                        if (var418 == 4013) {
                            var5 -= 2;
                            int var263 = field687[var5];
                            int var264 = field687[var5 + 1];
                            if (var263 == 0) {
                                field687[var5++] = 0;
                            } else if (var264 == 0) {
                                field687[var5++] = Integer.MAX_VALUE;
                            } else {
                                field687[var5++] = (int) Math.pow((double) var263, 1.0D / (double) var264);
                            }
                            continue;
                        }
                        if (var418 == 4014) {
                            var5 -= 2;
                            int var265 = field687[var5];
                            int var266 = field687[var5 + 1];
                            field687[var5++] = var265 & var266;
                            continue;
                        }
                        if (var418 == 4015) {
                            var5 -= 2;
                            int var267 = field687[var5];
                            int var268 = field687[var5 + 1];
                            field687[var5++] = var267 | var268;
                            continue;
                        }
                    } else if (var418 < 4200) {
                        if (var418 == 4100) {
                            var6--;
                            String var269 = field680[var6];
                            var5--;
                            int var270 = field687[var5];
                            field680[var6++] = var269 + var270;
                            continue;
                        }
                        if (var418 == 4101) {
                            var6 -= 2;
                            String var271 = field680[var6];
                            String var272 = field680[var6 + 1];
                            field680[var6++] = var271 + var272;
                            continue;
                        }
                        if (var418 == 4102) {
                            var6--;
                            String var273 = field680[var6];
                            var5--;
                            int var274 = field687[var5];
                            String[] var275 = field680;
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
                        if (var418 == 4103) {
                            var6--;
                            String var287 = field680[var6];
                            field680[var6++] = var287.toLowerCase();
                            continue;
                        }
                        if (var418 == 4104) {
                            var5--;
                            int var288 = field687[var5];
                            long var289 = ((long) var288 + 11745L) * 86400000L;
                            field690.setTime(new Date(var289));
                            int var291 = field690.get(5);
                            int var292 = field690.get(2);
                            int var293 = field690.get(1);
                            field680[var6++] = var291 + "-" + field691[var292] + "-" + var293;
                            continue;
                        }
                        if (var418 == 4105) {
                            var6 -= 2;
                            String var294 = field680[var6];
                            String var295 = field680[var6 + 1];
                            if (Statics.field944.field50 != null && Statics.field944.field50.field2622) {
                                field680[var6++] = var295;
                                continue;
                            }
                            field680[var6++] = var294;
                            continue;
                        }
                        if (var418 == 4106) {
                            var5--;
                            int var296 = field687[var5];
                            field680[var6++] = Integer.toString(var296);
                            continue;
                        }
                        if (var418 == 4107) {
                            var6 -= 2;
                            int[] var297 = field687;
                            int var298 = var5++;
                            String var299 = field680[var6];
                            String var300 = field680[var6 + 1];
                            int var301 = client.field256;
                            int var302 = var299.length();
                            int var303 = var300.length();
                            int var304 = 0;
                            int var305 = 0;
                            byte var306 = 0;
                            char var307 = 0;
                            int var308;
                            label2376: while (true) {
                                if (var304 - var306 >= var302 && var305 - var307 >= var303) {
                                    int var318 = Math.min(var302, var303);
                                    for (int var319 = 0; var319 < var318; var319++) {
                                        char var322 = var299.charAt(var319);
                                        char var323 = var300.charAt(var319);
                                        if (var322 != var323 && Character.toUpperCase(var322) != Character.toUpperCase(var323)) {
                                            char var324 = Character.toLowerCase(var322);
                                            char var325 = Character.toLowerCase(var323);
                                            if (var324 != var325) {
                                                var308 = class192.method123(var324, var301) - class192.method123(var325, var301);
                                                break label2376;
                                            }
                                        }
                                    }
                                    int var326 = var302 - var303;
                                    if (var326 == 0) {
                                        for (int var327 = 0; var327 < var318; var327++) {
                                            char var328 = var299.charAt(var327);
                                            char var329 = var300.charAt(var327);
                                            if (var328 != var329) {
                                                var308 = class192.method123(var328, var301) - class192.method123(var329, var301);
                                                break label2376;
                                            }
                                        }
                                        var308 = 0;
                                    } else {
                                        var308 = var326;
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
                                    var311 = var307;
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
                                var307 = class192.method15(var311);
                                char var314 = class192.method3249(var309, var301);
                                char var315 = class192.method3249(var311, var301);
                                if (var314 != var315 && Character.toUpperCase(var314) != Character.toUpperCase(var315)) {
                                    char var316 = Character.toLowerCase(var314);
                                    char var317 = Character.toLowerCase(var315);
                                    if (var316 != var317) {
                                        var308 = class192.method123(var316, var301) - class192.method123(var317, var301);
                                        break;
                                    }
                                }
                            }
                            byte var331;
                            if (var308 > 0) {
                                var331 = 1;
                            } else if (var308 < 0) {
                                var331 = -1;
                            } else {
                                var331 = 0;
                            }
                            var297[var298] = var331;
                            continue;
                        }
                        if (var418 == 4108) {
                            var6--;
                            String var332 = field680[var6];
                            var5 -= 2;
                            int var333 = field687[var5];
                            int var334 = field687[var5 + 1];
                            byte[] var335 = Statics.field904.method2725(var334, 0);
                            class183 var336 = new class183(var335);
                            field687[var5++] = var336.method3330(var332, var333);
                            continue;
                        }
                        if (var418 == 4109) {
                            var6--;
                            String var337 = field680[var6];
                            var5 -= 2;
                            int var338 = field687[var5];
                            int var339 = field687[var5 + 1];
                            byte[] var340 = Statics.field904.method2725(var339, 0);
                            class183 var341 = new class183(var340);
                            field687[var5++] = var341.method3266(var337, var338);
                            continue;
                        }
                        if (var418 == 4110) {
                            var6 -= 2;
                            String var342 = field680[var6];
                            String var343 = field680[var6 + 1];
                            var5--;
                            if (field687[var5] == 1) {
                                field680[var6++] = var342;
                            } else {
                                field680[var6++] = var343;
                            }
                            continue;
                        }
                        if (var418 == 4111) {
                            var6--;
                            String var344 = field680[var6];
                            field680[var6++] = class182.method3268(var344);
                            continue;
                        }
                        if (var418 == 4112) {
                            var6--;
                            String var345 = field680[var6];
                            var5--;
                            int var346 = field687[var5];
                            field680[var6++] = var345 + (char) var346;
                            continue;
                        }
                        if (var418 == 4113) {
                            var5--;
                            int var347 = field687[var5];
                            int[] var348 = field687;
                            int var349 = var5++;
                            char var350 = (char) var347;
                            boolean var351;
                            if (var350 >= ' ' && var350 <= '~') {
                                var351 = true;
                            } else if (var350 >= 160 && var350 <= 255) {
                                var351 = true;
                            } else if (var350 == 8364 || var350 == 338 || var350 == 8212 || var350 == 339 || var350 == 376) {
                                var351 = true;
                            } else {
                                var351 = false;
                            }
                            var348[var349] = var351 ? 1 : 0;
                            continue;
                        }
                        if (var418 == 4114) {
                            var5--;
                            int var352 = field687[var5];
                            field687[var5++] = class189.method2864((char) var352) ? 1 : 0;
                            continue;
                        }
                        if (var418 == 4115) {
                            var5--;
                            int var353 = field687[var5];
                            field687[var5++] = class189.method745((char) var353) ? 1 : 0;
                            continue;
                        }
                        if (var418 == 4116) {
                            var5--;
                            int var354 = field687[var5];
                            int[] var355 = field687;
                            int var356 = var5++;
                            char var357 = (char) var354;
                            boolean var358 = var357 >= '0' && var357 <= '9';
                            var355[var356] = var358 ? 1 : 0;
                            continue;
                        }
                        if (var418 == 4117) {
                            var6--;
                            String var359 = field680[var6];
                            if (var359 == null) {
                                field687[var5++] = 0;
                            } else {
                                field687[var5++] = var359.length();
                            }
                            continue;
                        }
                        if (var418 == 4118) {
                            var6--;
                            String var360 = field680[var6];
                            var5 -= 2;
                            int var361 = field687[var5];
                            int var362 = field687[var5 + 1];
                            field680[var6++] = var360.substring(var361, var362);
                            continue;
                        }
                        if (var418 == 4119) {
                            var6--;
                            String var363 = field680[var6];
                            StringBuilder var364 = new StringBuilder(var363.length());
                            boolean var365 = false;
                            for (int var366 = 0; var366 < var363.length(); var366++) {
                                char var367 = var363.charAt(var366);
                                if (var367 == '<') {
                                    var365 = true;
                                } else if (var367 == '>') {
                                    var365 = false;
                                } else if (!var365) {
                                    var364.append(var367);
                                }
                            }
                            field680[var6++] = var364.toString();
                            continue;
                        }
                        if (var418 == 4120) {
                            var6--;
                            String var368 = field680[var6];
                            var5--;
                            int var369 = field687[var5];
                            field687[var5++] = var368.indexOf(var369);
                            continue;
                        }
                    } else if (var418 < 4300) {
                        if (var418 == 4200) {
                            var5--;
                            int var370 = field687[var5];
                            field680[var6++] = class42.method124(var370).field985;
                            continue;
                        }
                        if (var418 == 4201) {
                            var5 -= 2;
                            int var371 = field687[var5];
                            int var372 = field687[var5 + 1];
                            class42 var373 = class42.method124(var371);
                            if (var372 >= 1 && var372 <= 5 && var373.field1000[var372 - 1] != null) {
                                field680[var6++] = var373.field1000[var372 - 1];
                                continue;
                            }
                            field680[var6++] = "";
                            continue;
                        }
                        if (var418 == 4202) {
                            var5 -= 2;
                            int var374 = field687[var5];
                            int var375 = field687[var5 + 1];
                            class42 var376 = class42.method124(var374);
                            if (var375 >= 1 && var375 <= 5 && var376.field1001[var375 - 1] != null) {
                                field680[var6++] = var376.field1001[var375 - 1];
                                continue;
                            }
                            field680[var6++] = "";
                            continue;
                        }
                        if (var418 == 4203) {
                            var5--;
                            int var377 = field687[var5];
                            field687[var5++] = class42.method124(var377).field999;
                            continue;
                        }
                        if (var418 == 4204) {
                            var5--;
                            int var378 = field687[var5];
                            field687[var5++] = class42.method124(var378).field997 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var418 == 4205) {
                            var5--;
                            int var379 = field687[var5];
                            class42 var380 = class42.method124(var379);
                            if (var380.field979 == -1 && var380.field1013 >= 0) {
                                field687[var5++] = var380.field1013;
                                continue;
                            }
                            field687[var5++] = var379;
                            continue;
                        }
                        if (var418 == 4206) {
                            var5--;
                            int var381 = field687[var5];
                            class42 var382 = class42.method124(var381);
                            if (var382.field979 >= 0 && var382.field1013 >= 0) {
                                field687[var5++] = var382.field1013;
                                continue;
                            }
                            field687[var5++] = var381;
                            continue;
                        }
                        if (var418 == 4207) {
                            var5--;
                            int var383 = field687[var5];
                            field687[var5++] = class42.method124(var383).field982 ? 1 : 0;
                            continue;
                        }
                    } else if (var418 < 5100) {
                        if (var418 == 5000) {
                            field687[var5++] = client.field465;
                            continue;
                        }
                        if (var418 == 5001) {
                            var5 -= 3;
                            client.field465 = field687[var5];
                            int var384 = field687[var5 + 1];
                            class114[] var385 = new class114[] { class114.field1865, class114.field1867, class114.field1864 };
                            class114[] var386 = var385;
                            int var387 = 0;
                            class114 var389;
                            while (true) {
                                if (var387 >= var386.length) {
                                    var389 = null;
                                    break;
                                }
                                class114 var388 = var386[var387];
                                if (var388.field1866 == var384) {
                                    var389 = var388;
                                    break;
                                }
                                var387++;
                            }
                            Statics.field667 = var389;
                            if (Statics.field667 == null) {
                                Statics.field667 = class114.field1864;
                            }
                            client.field466 = field687[var5 + 2];
                            client.field289.method2372(77);
                            client.field289.method2133(client.field465);
                            client.field289.method2133(Statics.field667.field1866);
                            client.field289.method2133(client.field466);
                            continue;
                        }
                        if (var418 == 5002) {
                            var6--;
                            String var390 = field680[var6];
                            var5 -= 2;
                            int var391 = field687[var5];
                            int var392 = field687[var5 + 1];
                            client.field289.method2372(87);
                            class107 var393 = client.field289;
                            int var394 = var390.length() + 1;
                            var393.method2133(var394 + 2);
                            client.field289.method2116(var390);
                            client.field289.method2133(var391 - 1);
                            client.field289.method2133(var392);
                            continue;
                        }
                        if (var418 == 5003) {
                            var5--;
                            int var395 = field687[var5];
                            String var396 = null;
                            if (var395 < 100) {
                                var396 = client.field456[var395];
                            }
                            if (var396 == null) {
                                var396 = "";
                            }
                            field680[var6++] = var396;
                            continue;
                        }
                        if (var418 == 5004) {
                            var5--;
                            int var397 = field687[var5];
                            int var398 = -1;
                            if (var397 < 100 && client.field456[var397] != null) {
                                var398 = client.field459[var397];
                            }
                            field687[var5++] = var398;
                            continue;
                        }
                        if (var418 == 5005) {
                            if (Statics.field667 == null) {
                                field687[var5++] = -1;
                            } else {
                                field687[var5++] = Statics.field667.field1866;
                            }
                            continue;
                        }
                        if (var418 == 5008) {
                            var6--;
                            String var399 = field680[var6];
                            if (var399.startsWith("::")) {
                                String var400 = var399.substring(2);
                                if (var400.equalsIgnoreCase("toggleroof")) {
                                    Statics.field1858.field145 = !Statics.field1858.field145;
                                    class9.method165();
                                    if (Statics.field1858.field145) {
                                        client.method2508(99, "", "Roofs are now all hidden");
                                    } else {
                                        client.method2508(99, "", "Roofs will only be removed selectively");
                                    }
                                }
                                if (client.field470 >= 2) {
                                    if (var400.equalsIgnoreCase("fpson")) {
                                        client.field265 = true;
                                    }
                                    if (var400.equalsIgnoreCase("fpsoff")) {
                                        client.field265 = false;
                                    }
                                    if (var400.equalsIgnoreCase("gc")) {
                                        System.gc();
                                    }
                                    if (var400.equalsIgnoreCase("clientdrop")) {
                                        if (client.field259 > 0) {
                                            client.method473();
                                        } else {
                                            client.method138(40);
                                            Statics.field565 = Statics.field2909;
                                            Statics.field2909 = null;
                                        }
                                    }
                                    if (var400.equalsIgnoreCase("errortest") && client.field371 == 2) {
                                        throw new RuntimeException();
                                    }
                                }
                                client.field289.method2372(182);
                                client.field289.method2133(var400.length() + 1);
                                client.field289.method2116(var400);
                            } else {
                                String var401 = var399.toLowerCase();
                                byte var402 = 0;
                                if (var401.startsWith(class139.field2255)) {
                                    var402 = 0;
                                    var399 = var399.substring(class139.field2255.length());
                                } else if (var401.startsWith(class139.field2343)) {
                                    var402 = 1;
                                    var399 = var399.substring(class139.field2343.length());
                                } else if (var401.startsWith(class139.field2121)) {
                                    var402 = 2;
                                    var399 = var399.substring(class139.field2121.length());
                                } else if (var401.startsWith(class139.field2292)) {
                                    var402 = 3;
                                    var399 = var399.substring(class139.field2292.length());
                                } else if (var401.startsWith(class139.field2294)) {
                                    var402 = 4;
                                    var399 = var399.substring(class139.field2294.length());
                                } else if (var401.startsWith(class139.field2296)) {
                                    var402 = 5;
                                    var399 = var399.substring(class139.field2296.length());
                                } else if (var401.startsWith(class139.field2298)) {
                                    var402 = 6;
                                    var399 = var399.substring(class139.field2298.length());
                                } else if (var401.startsWith(class139.field2289)) {
                                    var402 = 7;
                                    var399 = var399.substring(class139.field2289.length());
                                } else if (var401.startsWith(class139.field2346)) {
                                    var402 = 8;
                                    var399 = var399.substring(class139.field2346.length());
                                } else if (var401.startsWith(class139.field2304)) {
                                    var402 = 9;
                                    var399 = var399.substring(class139.field2304.length());
                                } else if (var401.startsWith(class139.field2306)) {
                                    var402 = 10;
                                    var399 = var399.substring(class139.field2306.length());
                                } else if (var401.startsWith(class139.field2308)) {
                                    var402 = 11;
                                    var399 = var399.substring(class139.field2308.length());
                                } else if (client.field256 != 0) {
                                    if (var401.startsWith(class139.field2225)) {
                                        var402 = 0;
                                        var399 = var399.substring(class139.field2225.length());
                                    } else if (var401.startsWith(class139.field2312)) {
                                        var402 = 1;
                                        var399 = var399.substring(class139.field2312.length());
                                    } else if (var401.startsWith(class139.field2291)) {
                                        var402 = 2;
                                        var399 = var399.substring(class139.field2291.length());
                                    } else if (var401.startsWith(class139.field2157)) {
                                        var402 = 3;
                                        var399 = var399.substring(class139.field2157.length());
                                    } else if (var401.startsWith(class139.field2333)) {
                                        var402 = 4;
                                        var399 = var399.substring(class139.field2333.length());
                                    } else if (var401.startsWith(class139.field2144)) {
                                        var402 = 5;
                                        var399 = var399.substring(class139.field2144.length());
                                    } else if (var401.startsWith(class139.field2299)) {
                                        var402 = 6;
                                        var399 = var399.substring(class139.field2299.length());
                                    } else if (var401.startsWith(class139.field2301)) {
                                        var402 = 7;
                                        var399 = var399.substring(class139.field2301.length());
                                    } else if (var401.startsWith(class139.field2230)) {
                                        var402 = 8;
                                        var399 = var399.substring(class139.field2230.length());
                                    } else if (var401.startsWith(class139.field2315)) {
                                        var402 = 9;
                                        var399 = var399.substring(class139.field2315.length());
                                    } else if (var401.startsWith(class139.field2307)) {
                                        var402 = 10;
                                        var399 = var399.substring(class139.field2307.length());
                                    } else if (var401.startsWith(class139.field2309)) {
                                        var402 = 11;
                                        var399 = var399.substring(class139.field2309.length());
                                    }
                                }
                                String var403 = var399.toLowerCase();
                                byte var404 = 0;
                                if (var403.startsWith(class139.field2310)) {
                                    var404 = 1;
                                    var399 = var399.substring(class139.field2310.length());
                                } else if (var403.startsWith(class139.field2134)) {
                                    var404 = 2;
                                    var399 = var399.substring(class139.field2134.length());
                                } else if (var403.startsWith(class139.field2243)) {
                                    var404 = 3;
                                    var399 = var399.substring(class139.field2243.length());
                                } else if (var403.startsWith(class139.field2322)) {
                                    var404 = 4;
                                    var399 = var399.substring(class139.field2322.length());
                                } else if (var403.startsWith(class139.field2302)) {
                                    var404 = 5;
                                    var399 = var399.substring(class139.field2302.length());
                                } else if (client.field256 != 0) {
                                    if (var403.startsWith(class139.field2278)) {
                                        var404 = 1;
                                        var399 = var399.substring(class139.field2278.length());
                                    } else if (var403.startsWith(class139.field2313)) {
                                        var404 = 2;
                                        var399 = var399.substring(class139.field2313.length());
                                    } else if (var403.startsWith(class139.field2347)) {
                                        var404 = 3;
                                        var399 = var399.substring(class139.field2347.length());
                                    } else if (var403.startsWith(class139.field2162)) {
                                        var404 = 4;
                                        var399 = var399.substring(class139.field2162.length());
                                    } else if (var403.startsWith(class139.field2319)) {
                                        var404 = 5;
                                        var399 = var399.substring(class139.field2319.length());
                                    }
                                }
                                client.field289.method2372(84);
                                client.field289.method2133(0);
                                int var405 = client.field289.field1806;
                                client.field289.method2133(var402);
                                client.field289.method2133(var404);
                                class181.method508(client.field289, var399);
                                client.field289.method2127(client.field289.field1806 - var405);
                            }
                            continue;
                        }
                        if (var418 == 5009) {
                            var6 -= 2;
                            String var406 = field680[var6];
                            String var407 = field680[var6 + 1];
                            client.field289.method2372(25);
                            client.field289.method2117(0);
                            int var408 = client.field289.field1806;
                            client.field289.method2116(var406);
                            class181.method508(client.field289, var407);
                            client.field289.method2126(client.field289.field1806 - var408);
                            continue;
                        }
                        if (var418 == 5010) {
                            var5--;
                            int var409 = field687[var5];
                            String var410 = null;
                            if (var409 < 100) {
                                var410 = client.field460[var409];
                            }
                            if (var410 == null) {
                                var410 = "";
                            }
                            field680[var6++] = var410;
                            continue;
                        }
                        if (var418 == 5011) {
                            var5--;
                            int var411 = field687[var5];
                            String var412 = null;
                            if (var411 < 100) {
                                var412 = client.field461[var411];
                            }
                            if (var412 == null) {
                                var412 = "";
                            }
                            field680[var6++] = var412;
                            continue;
                        }
                        if (var418 == 5015) {
                            String var413;
                            if (Statics.field944 == null || Statics.field944.field38 == null) {
                                var413 = "";
                            } else {
                                var413 = Statics.field944.field38;
                            }
                            field680[var6++] = var413;
                            continue;
                        }
                        if (var418 == 5016) {
                            field687[var5++] = client.field466;
                            continue;
                        }
                        if (var418 == 5017) {
                            field687[var5++] = client.field432;
                            continue;
                        }
                    }
                } else {
                    class148 var75;
                    if (var418 >= 2000) {
                        var418 -= 1000;
                        var5--;
                        var75 = class148.method1290(field687[var5]);
                    } else {
                        var75 = var52 ? Statics.field688 : Statics.field1034;
                    }
                    if (var418 == 1300) {
                        var5--;
                        int var76 = field687[var5] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var6--;
                            var75.method2842(var76, field680[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var418 == 1301) {
                        var5 -= 2;
                        int var77 = field687[var5];
                        int var78 = field687[var5 + 1];
                        var75.field2539 = class148.method2650(var77, var78);
                        continue;
                    }
                    if (var418 == 1302) {
                        var5--;
                        var75.field2542 = field687[var5] == 1;
                        continue;
                    }
                    if (var418 == 1303) {
                        var5--;
                        var75.field2540 = field687[var5];
                        continue;
                    }
                    if (var418 == 1304) {
                        var5--;
                        var75.field2534 = field687[var5];
                        continue;
                    }
                    if (var418 == 1305) {
                        var6--;
                        var75.field2477 = field680[var6];
                        continue;
                    }
                    if (var418 == 1306) {
                        var6--;
                        var75.field2543 = field680[var6];
                        continue;
                    }
                    if (var418 == 1307) {
                        var75.field2538 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var417) {
            StringBuilder var415 = new StringBuilder(30);
            var415.append("").append(var4.field2812).append(" ");
            for (int var416 = field686 - 1; var416 >= 0; var416--) {
                var415.append("").append(field689[var416].field200.field2812).append(" ");
            }
            var415.append("").append(var10);
            class132.method130(var415.toString(), var417);
        }
    }

    @ObfuscatedName("aa.y(IB)V")
    public static void method795(int arg0) {
        if (arg0 == -1 || !class148.method148(arg0)) {
            return;
        }
        class148[] var1 = Statics.field2524[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class148 var3 = var1[var2];
            if (var3.field2545 != null) {
                class1 var4 = new class1();
                var4.field11 = var3;
                var4.field9 = var3.field2545;
                method519(var4, 2000000);
            }
        }
    }
}
