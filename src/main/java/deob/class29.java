package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ak")
public class class29 {

    @ObfuscatedName("ak.e")
    public static int[] field691 = new int[5];

    @ObfuscatedName("ak.a")
    public static int[][] field692 = new int[5][5000];

    @ObfuscatedName("ak.l")
    public static int[] field693 = new int[1000];

    @ObfuscatedName("ak.v")
    public static String[] field694 = new String[1000];

    @ObfuscatedName("ak.j")
    public static int field699 = 0;

    @ObfuscatedName("ak.k")
    public static class12[] field695 = new class12[50];

    @ObfuscatedName("ak.b")
    public static Calendar field697 = Calendar.getInstance();

    @ObfuscatedName("ak.i")
    public static final String[] field698 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class29() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.z(Lz;I)V")
    public static void method1054(class1 arg0) {
        method748(arg0, 200000);
    }

    @ObfuscatedName("ah.n(Lz;II)V")
    public static void method748(class1 arg0, int arg1) {
        Object[] var2 = arg0.field10;
        int var3 = (Integer) var2[0];
        class18 var4 = class18.method160(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field539;
        int[] var9 = var4.field548;
        byte var10 = -1;
        field699 = 0;
        try {
            Statics.field1875 = new int[var4.field538];
            int var11 = 0;
            Statics.field2913 = new String[var4.field543];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field9;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2493;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2494;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2493;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2494;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field11;
                    }
                    Statics.field1875[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field15;
                    }
                    Statics.field2913[var12++] = var15;
                }
            }
            int var16 = 0;
            label2279: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var332 = var8[var7];
                if (var332 < 100) {
                    if (var332 == 0) {
                        field693[var5++] = var9[var7];
                        continue;
                    }
                    if (var332 == 1) {
                        int var17 = var9[var7];
                        field693[var5++] = class150.field2625[var17];
                        continue;
                    }
                    if (var332 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class150.field2625[var18] = field693[var5];
                        Statics.method536(var18);
                        continue;
                    }
                    if (var332 == 3) {
                        field694[var6++] = var4.field540[var7];
                        continue;
                    }
                    if (var332 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var332 == 7) {
                        var5 -= 2;
                        if (field693[var5 + 1] != field693[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var332 == 8) {
                        var5 -= 2;
                        if (field693[var5 + 1] == field693[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var332 == 9) {
                        var5 -= 2;
                        if (field693[var5] < field693[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var332 == 10) {
                        var5 -= 2;
                        if (field693[var5] > field693[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var332 == 21) {
                        if (field699 == 0) {
                            return;
                        }
                        class12 var19 = field695[--field699];
                        var4 = var19.field189;
                        var8 = var4.field539;
                        var9 = var4.field548;
                        var7 = var19.field194;
                        Statics.field1875 = var19.field190;
                        Statics.field2913 = var19.field192;
                        continue;
                    }
                    if (var332 == 25) {
                        int var20 = var9[var7];
                        field693[var5++] = class150.method117(var20);
                        continue;
                    }
                    if (var332 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class150.method4(var21, field693[var5]);
                        continue;
                    }
                    if (var332 == 31) {
                        var5 -= 2;
                        if (field693[var5] <= field693[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var332 == 32) {
                        var5 -= 2;
                        if (field693[var5] >= field693[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var332 == 33) {
                        field693[var5++] = Statics.field1875[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var332 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1875[var10001] = field693[var5];
                        continue;
                    }
                    if (var332 == 35) {
                        field694[var6++] = Statics.field2913[var9[var7]];
                        continue;
                    }
                    if (var332 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2913[var10001] = field694[var6];
                        continue;
                    }
                    if (var332 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = Statics.method707(field694, var6, var22);
                        field694[var6++] = var23;
                        continue;
                    }
                    if (var332 == 38) {
                        var5--;
                        continue;
                    }
                    if (var332 == 39) {
                        var6--;
                        continue;
                    }
                    if (var332 == 40) {
                        int var24 = var9[var7];
                        class18 var25 = class18.method160(var24);
                        int[] var26 = new int[var25.field538];
                        String[] var27 = new String[var25.field543];
                        for (int var28 = 0; var28 < var25.field544; var28++) {
                            var26[var28] = field693[var5 - var25.field544 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field545; var29++) {
                            var27[var29] = field694[var6 - var25.field545 + var29];
                        }
                        var5 -= var25.field544;
                        var6 -= var25.field545;
                        class12 var30 = new class12();
                        var30.field189 = var4;
                        var30.field194 = var7;
                        var30.field190 = Statics.field1875;
                        var30.field192 = Statics.field2913;
                        field695[++field699 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field539;
                        var9 = var25.field548;
                        var7 = -1;
                        Statics.field1875 = var26;
                        Statics.field2913 = var27;
                        continue;
                    }
                    if (var332 == 42) {
                        field693[var5++] = client.field460[var9[var7]];
                        continue;
                    }
                    if (var332 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field460[var10001] = field693[var5];
                        continue;
                    }
                    if (var332 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field693[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field691[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2279;
                                }
                                field692[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var332 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field693[var5];
                        if (var37 >= 0 && var37 < field691[var36]) {
                            field693[var5++] = field692[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var332 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field693[var5];
                        if (var39 >= 0 && var39 < field691[var38]) {
                            field692[var38][var39] = field693[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var332 == 47) {
                        String var40 = client.field461[var9[var7]];
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field694[var6++] = var40;
                        continue;
                    }
                    if (var332 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field461[var10001] = field694[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var332 < 1000) {
                    if (var332 == 100) {
                        var5 -= 3;
                        int var42 = field693[var5];
                        int var43 = field693[var5 + 1];
                        int var44 = field693[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class148 var45 = class148.method16(var42);
                        if (var45.field2601 == null) {
                            var45.field2601 = new class148[var44 + 1];
                        }
                        if (var45.field2601.length <= var44) {
                            class148[] var46 = new class148[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2601.length; var47++) {
                                var46[var47] = var45.field2601[var47];
                            }
                            var45.field2601 = var46;
                        }
                        if (var44 > 0 && var45.field2601[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class148 var48 = new class148();
                        var48.field2502 = var43;
                        var48.field2504 = var48.field2493 = var45.field2493;
                        var48.field2494 = var44;
                        var48.field2534 = true;
                        var45.field2601[var44] = var48;
                        if (var41) {
                            Statics.field546 = var48;
                        } else {
                            Statics.field24 = var48;
                        }
                        client.method32(var45);
                        continue;
                    }
                    if (var332 == 101) {
                        class148 var49 = var41 ? Statics.field546 : Statics.field24;
                        class148 var50 = class148.method16(var49.field2493);
                        var50.field2601[var49.field2494] = null;
                        client.method32(var50);
                        continue;
                    }
                    if (var332 == 102) {
                        var5--;
                        class148 var51 = class148.method16(field693[var5]);
                        var51.field2601 = null;
                        client.method32(var51);
                        continue;
                    }
                    if (var332 == 200) {
                        var5 -= 2;
                        int var52 = field693[var5];
                        int var53 = field693[var5 + 1];
                        class148 var54 = class148.method2867(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field693[var5++] = 1;
                            if (var41) {
                                Statics.field546 = var54;
                            } else {
                                Statics.field24 = var54;
                            }
                            continue;
                        }
                        field693[var5++] = 0;
                        continue;
                    }
                } else if (!(var332 < 1000 || var332 >= 1100) || !(var332 < 2000 || var332 >= 2100)) {
                    class148 var55;
                    if (var332 >= 2000) {
                        var332 -= 1000;
                        var5--;
                        var55 = class148.method16(field693[var5]);
                    } else {
                        var55 = var41 ? Statics.field546 : Statics.field24;
                    }
                    if (var332 == 1000) {
                        var5 -= 2;
                        var55.field2521 = field693[var5];
                        var55.field2499 = field693[var5 + 1];
                        client.method32(var55);
                        continue;
                    }
                    if (var332 == 1001) {
                        var5 -= 2;
                        var55.field2516 = field693[var5];
                        var55.field2503 = field693[var5 + 1];
                        client.method32(var55);
                        continue;
                    }
                    if (var332 == 1003) {
                        var5--;
                        boolean var56 = field693[var5] == 1;
                        if (var55.field2505 != var56) {
                            var55.field2505 = var56;
                            client.method32(var55);
                        }
                        continue;
                    }
                } else if (var332 >= 1100 && var332 < 1200 || var332 >= 2100 && var332 < 2200) {
                    class148 var57;
                    if (var332 >= 2000) {
                        var332 -= 1000;
                        var5--;
                        var57 = class148.method16(field693[var5]);
                    } else {
                        var57 = var41 ? Statics.field546 : Statics.field24;
                    }
                    if (var332 == 1100) {
                        var5 -= 2;
                        var57.field2571 = field693[var5];
                        if (var57.field2571 > var57.field2508 - var57.field2516) {
                            var57.field2571 = var57.field2508 - var57.field2516;
                        }
                        if (var57.field2571 < 0) {
                            var57.field2571 = 0;
                        }
                        var57.field2507 = field693[var5 + 1];
                        if (var57.field2507 > var57.field2509 - var57.field2503) {
                            var57.field2507 = var57.field2509 - var57.field2503;
                        }
                        if (var57.field2507 < 0) {
                            var57.field2507 = 0;
                        }
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1101) {
                        var5--;
                        var57.field2510 = field693[var5];
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1102) {
                        var5--;
                        var57.field2514 = field693[var5] == 1;
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1103) {
                        var5--;
                        var57.field2515 = field693[var5];
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1104) {
                        var5--;
                        var57.field2608 = field693[var5];
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1105) {
                        var5--;
                        var57.field2572 = field693[var5];
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1106) {
                        var5--;
                        var57.field2519 = field693[var5];
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1107) {
                        var5--;
                        var57.field2591 = field693[var5] == 1;
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1108) {
                        var57.field2525 = 1;
                        var5--;
                        var57.field2526 = field693[var5];
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1109) {
                        var5 -= 6;
                        var57.field2531 = field693[var5];
                        var57.field2532 = field693[var5 + 1];
                        var57.field2533 = field693[var5 + 2];
                        var57.field2512 = field693[var5 + 3];
                        var57.field2530 = field693[var5 + 4];
                        var57.field2590 = field693[var5 + 5];
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1110) {
                        var5--;
                        int var58 = field693[var5];
                        if (var57.field2589 != var58) {
                            var57.field2589 = var58;
                            var57.field2524 = 0;
                            var57.field2501 = 0;
                            client.method32(var57);
                        }
                        continue;
                    }
                    if (var332 == 1111) {
                        var5--;
                        var57.field2527 = field693[var5] == 1;
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1112) {
                        var6--;
                        String var59 = field694[var6];
                        if (!var59.equals(var57.field2578)) {
                            var57.field2578 = var59;
                            client.method32(var57);
                        }
                        continue;
                    }
                    if (var332 == 1113) {
                        var5--;
                        var57.field2539 = field693[var5];
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1114) {
                        var5 -= 3;
                        var57.field2579 = field693[var5];
                        var57.field2495 = field693[var5 + 1];
                        var57.field2542 = field693[var5 + 2];
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1115) {
                        var5--;
                        var57.field2536 = field693[var5] == 1;
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1116) {
                        var5--;
                        var57.field2540 = field693[var5];
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1117) {
                        var5--;
                        var57.field2522 = field693[var5];
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1118) {
                        var5--;
                        var57.field2523 = field693[var5] == 1;
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1119) {
                        var5--;
                        var57.field2596 = field693[var5] == 1;
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1120) {
                        var5 -= 2;
                        var57.field2508 = field693[var5];
                        var57.field2509 = field693[var5 + 1];
                        client.method32(var57);
                        continue;
                    }
                    if (var332 == 1121) {
                        client.method2063(var57.field2493, var57.field2494);
                        client.field429 = var57;
                        client.method32(var57);
                        continue;
                    }
                } else if (!(var332 < 1200 || var332 >= 1300) || !(var332 < 2200 || var332 >= 2300)) {
                    class148 var60;
                    if (var332 >= 2000) {
                        var332 -= 1000;
                        var5--;
                        var60 = class148.method16(field693[var5]);
                    } else {
                        var60 = var41 ? Statics.field546 : Statics.field24;
                    }
                    client.method32(var60);
                    if (var332 == 1200) {
                        var5 -= 2;
                        int var61 = field693[var5];
                        int var62 = field693[var5 + 1];
                        var60.field2511 = var61;
                        var60.field2598 = var62;
                        class42 var63 = class42.method2477(var61);
                        var60.field2533 = var63.field993;
                        var60.field2512 = var63.field994;
                        var60.field2530 = var63.field995;
                        var60.field2531 = var63.field996;
                        var60.field2532 = var63.field997;
                        var60.field2590 = var63.field1020;
                        if (var60.field2516 > 0) {
                            var60.field2590 = var60.field2590 * 32 / var60.field2516;
                        }
                        continue;
                    }
                    if (var332 == 1201) {
                        var60.field2525 = 2;
                        var5--;
                        var60.field2526 = field693[var5];
                        continue;
                    }
                    if (var332 == 1202) {
                        var60.field2525 = 3;
                        var60.field2526 = Statics.field180.field29.method2951();
                        continue;
                    }
                } else if ((var332 < 1300 || var332 >= 1400) && (var332 < 2300 || var332 >= 2400)) {
                    if (var332 >= 1400 && var332 < 1500 || var332 >= 2400 && var332 < 2500) {
                        class148 var68;
                        if (var332 >= 2000) {
                            var332 -= 1000;
                            var5--;
                            var68 = class148.method16(field693[var5]);
                        } else {
                            var68 = var41 ? Statics.field546 : Statics.field24;
                        }
                        var6--;
                        String var69 = field694[var6];
                        int[] var70 = null;
                        if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                            var5--;
                            int var71 = field693[var5];
                            if (var71 > 0) {
                                var70 = new int[var71];
                                while (var71-- > 0) {
                                    var5--;
                                    var70[var71] = field693[var5];
                                }
                            }
                            var69 = var69.substring(0, var69.length() - 1);
                        }
                        Object[] var72 = new Object[var69.length() + 1];
                        for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                            if (var69.charAt(var73 - 1) == 's') {
                                var6--;
                                var72[var73] = field694[var6];
                            } else {
                                var5--;
                                var72[var73] = Integer.valueOf(field693[var5]);
                            }
                        }
                        var5--;
                        int var74 = field693[var5];
                        if (var74 == -1) {
                            var72 = null;
                        } else {
                            var72[0] = Integer.valueOf(var74);
                        }
                        if (var332 == 1400) {
                            var68.field2562 = var72;
                        }
                        if (var332 == 1401) {
                            var68.field2565 = var72;
                        }
                        if (var332 == 1402) {
                            var68.field2564 = var72;
                        }
                        if (var332 == 1403) {
                            var68.field2566 = var72;
                        }
                        if (var332 == 1404) {
                            var68.field2568 = var72;
                        }
                        if (var332 == 1405) {
                            var68.field2569 = var72;
                        }
                        if (var332 == 1406) {
                            var68.field2587 = var72;
                        }
                        if (var332 == 1407) {
                            var68.field2573 = var72;
                            var68.field2574 = var70;
                        }
                        if (var332 == 1408) {
                            var68.field2529 = var72;
                        }
                        if (var332 == 1409) {
                            var68.field2580 = var72;
                        }
                        if (var332 == 1410) {
                            var68.field2570 = var72;
                        }
                        if (var332 == 1411) {
                            var68.field2563 = var72;
                        }
                        if (var332 == 1412) {
                            var68.field2567 = var72;
                        }
                        if (var332 == 1414) {
                            var68.field2575 = var72;
                            var68.field2576 = var70;
                        }
                        if (var332 == 1415) {
                            var68.field2577 = var72;
                            var68.field2497 = var70;
                        }
                        if (var332 == 1416) {
                            var68.field2484 = var72;
                        }
                        if (var332 == 1417) {
                            var68.field2581 = var72;
                        }
                        if (var332 == 1418) {
                            var68.field2543 = var72;
                        }
                        if (var332 == 1419) {
                            var68.field2583 = var72;
                        }
                        if (var332 == 1420) {
                            var68.field2584 = var72;
                        }
                        if (var332 == 1421) {
                            var68.field2585 = var72;
                        }
                        if (var332 == 1422) {
                            var68.field2535 = var72;
                        }
                        if (var332 == 1423) {
                            var68.field2599 = var72;
                        }
                        if (var332 == 1424) {
                            var68.field2588 = var72;
                        }
                        var68.field2498 = true;
                        continue;
                    }
                    if (var332 < 1600) {
                        class148 var75 = var41 ? Statics.field546 : Statics.field24;
                        if (var332 == 1500) {
                            field693[var5++] = var75.field2521;
                            continue;
                        }
                        if (var332 == 1501) {
                            field693[var5++] = var75.field2499;
                            continue;
                        }
                        if (var332 == 1502) {
                            field693[var5++] = var75.field2516;
                            continue;
                        }
                        if (var332 == 1503) {
                            field693[var5++] = var75.field2503;
                            continue;
                        }
                        if (var332 == 1504) {
                            field693[var5++] = var75.field2505 ? 1 : 0;
                            continue;
                        }
                        if (var332 == 1505) {
                            field693[var5++] = var75.field2504;
                            continue;
                        }
                    } else if (var332 < 1700) {
                        class148 var76 = var41 ? Statics.field546 : Statics.field24;
                        if (var332 == 1600) {
                            field693[var5++] = var76.field2571;
                            continue;
                        }
                        if (var332 == 1601) {
                            field693[var5++] = var76.field2507;
                            continue;
                        }
                        if (var332 == 1602) {
                            field694[var6++] = var76.field2578;
                            continue;
                        }
                        if (var332 == 1603) {
                            field693[var5++] = var76.field2508;
                            continue;
                        }
                        if (var332 == 1604) {
                            field693[var5++] = var76.field2509;
                            continue;
                        }
                        if (var332 == 1605) {
                            field693[var5++] = var76.field2590;
                            continue;
                        }
                        if (var332 == 1606) {
                            field693[var5++] = var76.field2533;
                            continue;
                        }
                        if (var332 == 1607) {
                            field693[var5++] = var76.field2530;
                            continue;
                        }
                        if (var332 == 1608) {
                            field693[var5++] = var76.field2512;
                            continue;
                        }
                    } else if (var332 < 1800) {
                        class148 var77 = var41 ? Statics.field546 : Statics.field24;
                        if (var332 == 1700) {
                            field693[var5++] = var77.field2511;
                            continue;
                        }
                        if (var332 == 1701) {
                            if (var77.field2511 == -1) {
                                field693[var5++] = 0;
                            } else {
                                field693[var5++] = var77.field2598;
                            }
                            continue;
                        }
                        if (var332 == 1702) {
                            field693[var5++] = var77.field2494;
                            continue;
                        }
                    } else if (var332 < 1900) {
                        class148 var78 = var41 ? Statics.field546 : Statics.field24;
                        if (var332 == 1800) {
                            int[] var79 = field693;
                            int var80 = var5++;
                            int var81 = client.method640(var78);
                            int var82 = var81 >> 11 & 0x3F;
                            var79[var80] = var82;
                            continue;
                        }
                        if (var332 == 1801) {
                            var5--;
                            int var83 = field693[var5];
                            int var333 = var83 - 1;
                            if (var78.field2492 != null && var333 < var78.field2492.length && var78.field2492[var333] != null) {
                                field694[var6++] = var78.field2492[var333];
                                continue;
                            }
                            field694[var6++] = "";
                            continue;
                        }
                        if (var332 == 1802) {
                            if (var78.field2597 == null) {
                                field694[var6++] = "";
                            } else {
                                field694[var6++] = var78.field2597;
                            }
                            continue;
                        }
                    } else if (var332 < 2600) {
                        var5--;
                        class148 var84 = class148.method16(field693[var5]);
                        if (var332 == 2500) {
                            field693[var5++] = var84.field2521;
                            continue;
                        }
                        if (var332 == 2501) {
                            field693[var5++] = var84.field2499;
                            continue;
                        }
                        if (var332 == 2502) {
                            field693[var5++] = var84.field2516;
                            continue;
                        }
                        if (var332 == 2503) {
                            field693[var5++] = var84.field2503;
                            continue;
                        }
                        if (var332 == 2504) {
                            field693[var5++] = var84.field2505 ? 1 : 0;
                            continue;
                        }
                        if (var332 == 2505) {
                            field693[var5++] = var84.field2504;
                            continue;
                        }
                    } else if (var332 < 2700) {
                        var5--;
                        class148 var85 = class148.method16(field693[var5]);
                        if (var332 == 2600) {
                            field693[var5++] = var85.field2571;
                            continue;
                        }
                        if (var332 == 2601) {
                            field693[var5++] = var85.field2507;
                            continue;
                        }
                        if (var332 == 2602) {
                            field694[var6++] = var85.field2578;
                            continue;
                        }
                        if (var332 == 2603) {
                            field693[var5++] = var85.field2508;
                            continue;
                        }
                        if (var332 == 2604) {
                            field693[var5++] = var85.field2509;
                            continue;
                        }
                        if (var332 == 2605) {
                            field693[var5++] = var85.field2590;
                            continue;
                        }
                        if (var332 == 2606) {
                            field693[var5++] = var85.field2533;
                            continue;
                        }
                        if (var332 == 2607) {
                            field693[var5++] = var85.field2530;
                            continue;
                        }
                        if (var332 == 2608) {
                            field693[var5++] = var85.field2512;
                            continue;
                        }
                    } else if (var332 < 2800) {
                        if (var332 == 2700) {
                            var5--;
                            class148 var86 = class148.method16(field693[var5]);
                            field693[var5++] = var86.field2511;
                            continue;
                        }
                        if (var332 == 2701) {
                            var5--;
                            class148 var87 = class148.method16(field693[var5]);
                            if (var87.field2511 == -1) {
                                field693[var5++] = 0;
                            } else {
                                field693[var5++] = var87.field2598;
                            }
                            continue;
                        }
                        if (var332 == 2702) {
                            var5--;
                            int var88 = field693[var5];
                            class4 var89 = (class4) client.field426.method3208((long) var88);
                            if (var89 == null) {
                                field693[var5++] = 0;
                            } else {
                                field693[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var332 < 2900) {
                        var5--;
                        class148 var90 = class148.method16(field693[var5]);
                        if (var332 == 2800) {
                            int[] var91 = field693;
                            int var92 = var5++;
                            int var93 = client.method640(var90);
                            int var94 = var93 >> 11 & 0x3F;
                            var91[var92] = var94;
                            continue;
                        }
                        if (var332 == 2801) {
                            var5--;
                            int var95 = field693[var5];
                            int var334 = var95 - 1;
                            if (var90.field2492 != null && var334 < var90.field2492.length && var90.field2492[var334] != null) {
                                field694[var6++] = var90.field2492[var334];
                                continue;
                            }
                            field694[var6++] = "";
                            continue;
                        }
                        if (var332 == 2802) {
                            if (var90.field2597 == null) {
                                field694[var6++] = "";
                            } else {
                                field694[var6++] = var90.field2597;
                            }
                            continue;
                        }
                    } else if (var332 < 3200) {
                        if (var332 == 3100) {
                            var6--;
                            String var96 = field694[var6];
                            client.method555(0, "", var96);
                            continue;
                        }
                        if (var332 == 3101) {
                            var5 -= 2;
                            client.method683(Statics.field180, field693[var5], field693[var5 + 1]);
                            continue;
                        }
                        if (var332 == 3103) {
                            client.method30();
                            continue;
                        }
                        if (var332 == 3104) {
                            var6--;
                            String var97 = field694[var6];
                            int var98 = 0;
                            if (class189.method2620(var97)) {
                                var98 = class189.method2725(var97);
                            }
                            client.field340.method2376(40);
                            client.field340.method2144(var98);
                            continue;
                        }
                        if (var332 == 3105) {
                            var6--;
                            String var99 = field694[var6];
                            client.field340.method2376(54);
                            client.field340.method2113(var99.length() + 1);
                            client.field340.method2118(var99);
                            continue;
                        }
                        if (var332 == 3106) {
                            var6--;
                            String var100 = field694[var6];
                            client.field340.method2376(134);
                            client.field340.method2113(var100.length() + 1);
                            client.field340.method2118(var100);
                            continue;
                        }
                        if (var332 == 3107) {
                            var5--;
                            int var101 = field693[var5];
                            var6--;
                            String var102 = field694[var6];
                            boolean var103 = false;
                            for (int var104 = 0; var104 < client.field385; var104++) {
                                class3 var105 = client.field510[client.field386[var104]];
                                if (var105 != null && var105.field36 != null && var105.field36.equalsIgnoreCase(var102)) {
                                    if (var101 == 1) {
                                        client.field340.method2376(61);
                                        client.field340.method2189(0);
                                        client.field340.method2114(client.field386[var104]);
                                    } else if (var101 == 4) {
                                        client.field340.method2376(187);
                                        client.field340.method2189(0);
                                        client.field340.method2158(client.field386[var104]);
                                    } else if (var101 == 6) {
                                        client.field340.method2376(138);
                                        client.field340.method2150(0);
                                        client.field340.method2157(client.field386[var104]);
                                    } else if (var101 == 7) {
                                        client.field340.method2376(179);
                                        client.field340.method2113(0);
                                        client.field340.method2157(client.field386[var104]);
                                    }
                                    var103 = true;
                                    break;
                                }
                            }
                            if (!var103) {
                                client.method555(4, "", class139.field2266 + var102);
                            }
                            continue;
                        }
                        if (var332 == 3108) {
                            var5 -= 3;
                            int var106 = field693[var5];
                            int var107 = field693[var5 + 1];
                            int var108 = field693[var5 + 2];
                            class148 var109 = class148.method16(var108);
                            client.method153(var109, var106, var107);
                            continue;
                        }
                        if (var332 == 3109) {
                            var5 -= 2;
                            int var110 = field693[var5];
                            int var111 = field693[var5 + 1];
                            class148 var112 = var41 ? Statics.field546 : Statics.field24;
                            client.method153(var112, var110, var111);
                            continue;
                        }
                        if (var332 == 3110) {
                            var5--;
                            Statics.field2015 = field693[var5] == 1;
                            continue;
                        }
                        if (var332 == 3111) {
                            field693[var5++] = Statics.field156.field145 ? 1 : 0;
                            continue;
                        }
                        if (var332 == 3112) {
                            var5--;
                            Statics.field156.field145 = field693[var5] == 1;
                            Statics.method1017();
                            continue;
                        }
                        if (var332 == 3113) {
                            var6--;
                            String var113 = field694[var6];
                            var5--;
                            boolean var114 = field693[var5] == 1;
                            class122.method154(var113, var114, "openjs", false);
                            continue;
                        }
                    } else if (var332 < 3300) {
                        if (var332 == 3200) {
                            var5 -= 3;
                            client.method156(field693[var5], field693[var5 + 1], field693[var5 + 2]);
                            continue;
                        }
                        if (var332 == 3201) {
                            var5--;
                            int var115 = field693[var5];
                            if (var115 == -1 && !client.field503) {
                                class157.method2917();
                            } else if (var115 != -1 && client.field335 != var115 && client.field289 != 0 && !client.field503) {
                                class157.method40(2, Statics.field1804, var115, 0, client.field289, false);
                            }
                            client.field335 = var115;
                            continue;
                        }
                        if (var332 == 3202) {
                            var5 -= 2;
                            int var116 = field693[var5];
                            int var10000 = field693[var5 + 1];
                            if (client.field289 != 0 && var116 != -1) {
                                class157.method858(Statics.field295, var116, 0, client.field289, false);
                                client.field503 = true;
                            }
                            continue;
                        }
                    } else if (var332 < 3400) {
                        if (var332 == 3300) {
                            field693[var5++] = client.field270;
                            continue;
                        }
                        if (var332 == 3301) {
                            var5 -= 2;
                            int var118 = field693[var5];
                            int var119 = field693[var5 + 1];
                            field693[var5++] = class13.method554(var118, var119);
                            continue;
                        }
                        if (var332 == 3302) {
                            var5 -= 2;
                            int var120 = field693[var5];
                            int var121 = field693[var5 + 1];
                            field693[var5++] = class13.method503(var120, var121);
                            continue;
                        }
                        if (var332 == 3303) {
                            var5 -= 2;
                            int var122 = field693[var5];
                            int var123 = field693[var5 + 1];
                            field693[var5++] = class13.method525(var122, var123);
                            continue;
                        }
                        if (var332 == 3304) {
                            var5--;
                            int var124 = field693[var5];
                            field693[var5++] = class41.method578(var124).field976;
                            continue;
                        }
                        if (var332 == 3305) {
                            var5--;
                            int var125 = field693[var5];
                            field693[var5++] = client.field262[var125];
                            continue;
                        }
                        if (var332 == 3306) {
                            var5--;
                            int var126 = field693[var5];
                            field693[var5++] = client.field318[var126];
                            continue;
                        }
                        if (var332 == 3307) {
                            var5--;
                            int var127 = field693[var5];
                            field693[var5++] = client.field293[var127];
                            continue;
                        }
                        if (var332 == 3308) {
                            int var128 = Statics.field1;
                            int var129 = (Statics.field180.field717 >> 7) + Statics.field1624;
                            int var130 = (Statics.field180.field747 >> 7) + Statics.field945;
                            field693[var5++] = (var128 << 28) + (var129 << 14) + var130;
                            continue;
                        }
                        if (var332 == 3309) {
                            var5--;
                            int var131 = field693[var5];
                            field693[var5++] = var131 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var332 == 3310) {
                            var5--;
                            int var132 = field693[var5];
                            field693[var5++] = var132 >> 28;
                            continue;
                        }
                        if (var332 == 3311) {
                            var5--;
                            int var133 = field693[var5];
                            field693[var5++] = var133 & 0x3FFF;
                            continue;
                        }
                        if (var332 == 3312) {
                            field693[var5++] = client.field296 ? 1 : 0;
                            continue;
                        }
                        if (var332 == 3313) {
                            var5 -= 2;
                            int var134 = field693[var5] + 32768;
                            int var135 = field693[var5 + 1];
                            field693[var5++] = class13.method554(var134, var135);
                            continue;
                        }
                        if (var332 == 3314) {
                            var5 -= 2;
                            int var136 = field693[var5] + 32768;
                            int var137 = field693[var5 + 1];
                            field693[var5++] = class13.method503(var136, var137);
                            continue;
                        }
                        if (var332 == 3315) {
                            var5 -= 2;
                            int var138 = field693[var5] + 32768;
                            int var139 = field693[var5 + 1];
                            field693[var5++] = class13.method525(var138, var139);
                            continue;
                        }
                        if (var332 == 3316) {
                            if (client.field432 >= 2) {
                                field693[var5++] = client.field432;
                            } else {
                                field693[var5++] = 0;
                            }
                            continue;
                        }
                        if (var332 == 3317) {
                            field693[var5++] = client.field515;
                            continue;
                        }
                        if (var332 == 3318) {
                            field693[var5++] = client.field494;
                            continue;
                        }
                        if (var332 == 3321) {
                            field693[var5++] = client.field430;
                            continue;
                        }
                        if (var332 == 3322) {
                            field693[var5++] = client.field481;
                            continue;
                        }
                        if (var332 == 3323) {
                            if (client.field405) {
                                field693[var5++] = 1;
                            } else {
                                field693[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var332 < 3500) {
                        if (var332 == 3400) {
                            var5 -= 2;
                            int var140 = field693[var5];
                            int var141 = field693[var5 + 1];
                            class40 var142 = class40.method540(var140);
                            if (var142.field969 != 's') {
                            }
                            for (int var143 = 0; var143 < var142.field963; var143++) {
                                if (var142.field964[var143] == var141) {
                                    field694[var6++] = var142.field958[var143];
                                    var142 = null;
                                    break;
                                }
                            }
                            if (var142 != null) {
                                field694[var6++] = var142.field960;
                            }
                            continue;
                        }
                        if (var332 == 3408) {
                            var5 -= 4;
                            int var144 = field693[var5];
                            int var145 = field693[var5 + 1];
                            int var146 = field693[var5 + 2];
                            int var147 = field693[var5 + 3];
                            class40 var148 = class40.method540(var146);
                            if (var148.field961 == var144 && var148.field969 == var145) {
                                for (int var149 = 0; var149 < var148.field963; var149++) {
                                    if (var148.field964[var149] == var147) {
                                        if (var145 == 115) {
                                            field694[var6++] = var148.field958[var149];
                                        } else {
                                            field693[var5++] = var148.field965[var149];
                                        }
                                        var148 = null;
                                        break;
                                    }
                                }
                                if (var148 != null) {
                                    if (var145 == 115) {
                                        field694[var6++] = var148.field960;
                                    } else {
                                        field693[var5++] = var148.field962;
                                    }
                                }
                                continue;
                            }
                            if (var145 == 115) {
                                field694[var6++] = "null";
                            } else {
                                field693[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var332 < 3700) {
                        if (var332 == 3600) {
                            if (client.field519 == 0) {
                                field693[var5++] = -2;
                            } else if (client.field519 == 1) {
                                field693[var5++] = -1;
                            } else {
                                field693[var5++] = client.field518;
                            }
                            continue;
                        }
                        if (var332 == 3601) {
                            var5--;
                            int var150 = field693[var5];
                            if (client.field519 == 2 && var150 < client.field518) {
                                field694[var6++] = client.field520[var150].field225;
                                continue;
                            }
                            field694[var6++] = "";
                            continue;
                        }
                        if (var332 == 3602) {
                            var5--;
                            int var151 = field693[var5];
                            if (client.field519 == 2 && var151 < client.field518) {
                                field693[var5++] = client.field520[var151].field226;
                                continue;
                            }
                            field693[var5++] = 0;
                            continue;
                        }
                        if (var332 == 3603) {
                            var5--;
                            int var152 = field693[var5];
                            if (client.field519 == 2 && var152 < client.field518) {
                                field693[var5++] = client.field520[var152].field227;
                                continue;
                            }
                            field693[var5++] = 0;
                            continue;
                        }
                        if (var332 == 3604) {
                            var6--;
                            String var153 = field694[var6];
                            var5--;
                            int var154 = field693[var5];
                            client.method2707(var153, var154);
                            continue;
                        }
                        if (var332 == 3605) {
                            var6--;
                            String var155 = field694[var6];
                            client.method1893(var155);
                            continue;
                        }
                        if (var332 == 3606) {
                            var6--;
                            String var156 = field694[var6];
                            if (var156 == null) {
                                continue;
                            }
                            String var157 = class190.method582(var156, Statics.field263);
                            if (var157 == null) {
                                continue;
                            }
                            int var158 = 0;
                            while (true) {
                                if (var158 >= client.field518) {
                                    continue label2279;
                                }
                                class15 var159 = client.field520[var158];
                                String var160 = var159.field225;
                                String var161 = class190.method582(var160, Statics.field263);
                                boolean var162;
                                if (var156 == null || var160 == null) {
                                    var162 = false;
                                } else if (var156.startsWith("#") || var160.startsWith("#")) {
                                    var162 = var156.equals(var160);
                                } else {
                                    var162 = var157.equals(var161);
                                }
                                if (var162) {
                                    client.field518--;
                                    for (int var163 = var158; var163 < client.field518; var163++) {
                                        client.field520[var163] = client.field520[var163 + 1];
                                    }
                                    client.field457 = client.field449;
                                    client.field340.method2376(34);
                                    class107 var164 = client.field340;
                                    int var165 = var156.length() + 1;
                                    var164.method2113(var165);
                                    client.field340.method2118(var156);
                                    continue label2279;
                                }
                                var158++;
                            }
                        }
                        if (var332 == 3607) {
                            var6--;
                            String var166 = field694[var6];
                            if (var166 == null) {
                                continue;
                            }
                            if ((client.field362 < 100 || client.field303 == 1) && client.field362 < 400) {
                                String var167 = class190.method582(var166, Statics.field263);
                                if (var167 == null) {
                                    continue;
                                }
                                for (int var168 = 0; var168 < client.field362; var168++) {
                                    class8 var169 = client.field523[var168];
                                    String var170 = class190.method582(var169.field140, Statics.field263);
                                    if (var170 != null && var170.equals(var167)) {
                                        client.method555(31, "", var166 + class139.field2286);
                                        continue label2279;
                                    }
                                    if (var169.field136 != null) {
                                        String var171 = class190.method582(var169.field136, Statics.field263);
                                        if (var171 != null && var171.equals(var167)) {
                                            client.method555(31, "", var166 + class139.field2286);
                                            continue label2279;
                                        }
                                    }
                                }
                                for (int var172 = 0; var172 < client.field518; var172++) {
                                    class15 var173 = client.field520[var172];
                                    String var174 = class190.method582(var173.field225, Statics.field263);
                                    if (var174 != null && var174.equals(var167)) {
                                        client.method555(31, "", class139.field2291 + var166 + class139.field2148);
                                        continue label2279;
                                    }
                                    if (var173.field223 != null) {
                                        String var175 = class190.method582(var173.field223, Statics.field263);
                                        if (var175 != null && var175.equals(var167)) {
                                            client.method555(31, "", class139.field2291 + var166 + class139.field2148);
                                            continue label2279;
                                        }
                                    }
                                }
                                if (class190.method582(Statics.field180.field36, Statics.field263).equals(var167)) {
                                    client.method555(31, "", class139.field2288);
                                } else {
                                    client.field340.method2376(38);
                                    class107 var176 = client.field340;
                                    int var177 = var166.length() + 1;
                                    var176.method2113(var177);
                                    client.field340.method2118(var166);
                                }
                                continue;
                            }
                            client.method555(31, "", class139.field2285);
                            continue;
                        }
                        if (var332 == 3608) {
                            var6--;
                            String var178 = field694[var6];
                            if (var178 == null) {
                                continue;
                            }
                            String var179 = class190.method582(var178, Statics.field263);
                            if (var179 == null) {
                                continue;
                            }
                            int var180 = 0;
                            while (true) {
                                if (var180 >= client.field362) {
                                    continue label2279;
                                }
                                class8 var181 = client.field523[var180];
                                String var182 = var181.field140;
                                String var183 = class190.method582(var182, Statics.field263);
                                boolean var184;
                                if (var178 == null || var182 == null) {
                                    var184 = false;
                                } else if (var178.startsWith("#") || var182.startsWith("#")) {
                                    var184 = var178.equals(var182);
                                } else {
                                    var184 = var179.equals(var183);
                                }
                                if (var184) {
                                    client.field362--;
                                    for (int var185 = var180; var185 < client.field362; var185++) {
                                        client.field523[var185] = client.field523[var185 + 1];
                                    }
                                    client.field457 = client.field449;
                                    client.field340.method2376(222);
                                    class107 var186 = client.field340;
                                    int var187 = var178.length() + 1;
                                    var186.method2113(var187);
                                    client.field340.method2118(var178);
                                    continue label2279;
                                }
                                var180++;
                            }
                        }
                        if (var332 == 3609) {
                            var6--;
                            String var188 = field694[var6];
                            if (var188.startsWith(class2.method2717(0)) || var188.startsWith(class2.method2717(1))) {
                                var188 = var188.substring(7);
                            }
                            field693[var5++] = client.method139(var188, false) ? 1 : 0;
                            continue;
                        }
                        if (var332 == 3611) {
                            if (client.field491 == null) {
                                field694[var6++] = "";
                            } else {
                                field694[var6++] = class188.method1311(client.field491);
                            }
                            continue;
                        }
                        if (var332 == 3612) {
                            if (client.field491 == null) {
                                field693[var5++] = 0;
                            } else {
                                field693[var5++] = Statics.field1794;
                            }
                            continue;
                        }
                        if (var332 == 3613) {
                            var5--;
                            int var189 = field693[var5];
                            if (client.field491 != null && var189 < Statics.field1794) {
                                field694[var6++] = Statics.field187[var189].field578;
                                continue;
                            }
                            field694[var6++] = "";
                            continue;
                        }
                        if (var332 == 3614) {
                            var5--;
                            int var190 = field693[var5];
                            if (client.field491 != null && var190 < Statics.field1794) {
                                field693[var5++] = Statics.field187[var190].field573;
                                continue;
                            }
                            field693[var5++] = 0;
                            continue;
                        }
                        if (var332 == 3615) {
                            var5--;
                            int var191 = field693[var5];
                            if (client.field491 != null && var191 < Statics.field1794) {
                                field693[var5++] = Statics.field187[var191].field574;
                                continue;
                            }
                            field693[var5++] = 0;
                            continue;
                        }
                        if (var332 == 3616) {
                            field693[var5++] = Statics.field2716;
                            continue;
                        }
                        if (var332 == 3617) {
                            var6--;
                            String var192 = field694[var6];
                            if (Statics.field187 != null) {
                                client.field340.method2376(118);
                                class107 var193 = client.field340;
                                int var194 = var192.length() + 1;
                                var193.method2113(var194);
                                client.field340.method2118(var192);
                            }
                            continue;
                        }
                        if (var332 == 3618) {
                            field693[var5++] = Statics.field1899;
                            continue;
                        }
                        if (var332 == 3619) {
                            var6--;
                            String var195 = field694[var6];
                            client.method1598(var195);
                            continue;
                        }
                        if (var332 == 3620) {
                            client.field340.method2376(253);
                            client.field340.method2113(0);
                            continue;
                        }
                        if (var332 == 3621) {
                            if (client.field519 == 0) {
                                field693[var5++] = -1;
                            } else {
                                field693[var5++] = client.field362;
                            }
                            continue;
                        }
                        if (var332 == 3622) {
                            var5--;
                            int var196 = field693[var5];
                            if (client.field519 != 0 && var196 < client.field362) {
                                field694[var6++] = client.field523[var196].field140;
                                continue;
                            }
                            field694[var6++] = "";
                            continue;
                        }
                        if (var332 == 3623) {
                            var6--;
                            String var197 = field694[var6];
                            if (var197.startsWith(class2.method2717(0)) || var197.startsWith(class2.method2717(1))) {
                                var197 = var197.substring(7);
                            }
                            field693[var5++] = client.method1986(var197) ? 1 : 0;
                            continue;
                        }
                        if (var332 == 3624) {
                            var5--;
                            int var198 = field693[var5];
                            if (Statics.field187 != null && var198 < Statics.field1794 && Statics.field187[var198].field578.equalsIgnoreCase(Statics.field180.field36)) {
                                field693[var5++] = 1;
                                continue;
                            }
                            field693[var5++] = 0;
                            continue;
                        }
                        if (var332 == 3625) {
                            if (client.field492 == null) {
                                field694[var6++] = "";
                            } else {
                                field694[var6++] = class188.method1311(client.field492);
                            }
                            continue;
                        }
                    } else if (var332 < 4100) {
                        if (var332 == 4000) {
                            var5 -= 2;
                            int var199 = field693[var5];
                            int var200 = field693[var5 + 1];
                            field693[var5++] = var199 + var200;
                            continue;
                        }
                        if (var332 == 4001) {
                            var5 -= 2;
                            int var201 = field693[var5];
                            int var202 = field693[var5 + 1];
                            field693[var5++] = var201 - var202;
                            continue;
                        }
                        if (var332 == 4002) {
                            var5 -= 2;
                            int var203 = field693[var5];
                            int var204 = field693[var5 + 1];
                            field693[var5++] = var203 * var204;
                            continue;
                        }
                        if (var332 == 4003) {
                            var5 -= 2;
                            int var205 = field693[var5];
                            int var206 = field693[var5 + 1];
                            field693[var5++] = var205 / var206;
                            continue;
                        }
                        if (var332 == 4004) {
                            var5--;
                            int var207 = field693[var5];
                            field693[var5++] = (int) (Math.random() * (double) var207);
                            continue;
                        }
                        if (var332 == 4005) {
                            var5--;
                            int var208 = field693[var5];
                            field693[var5++] = (int) (Math.random() * (double) (var208 + 1));
                            continue;
                        }
                        if (var332 == 4006) {
                            var5 -= 5;
                            int var209 = field693[var5];
                            int var210 = field693[var5 + 1];
                            int var211 = field693[var5 + 2];
                            int var212 = field693[var5 + 3];
                            int var213 = field693[var5 + 4];
                            field693[var5++] = (var210 - var209) * (var213 - var211) / (var212 - var211) + var209;
                            continue;
                        }
                        if (var332 == 4007) {
                            var5 -= 2;
                            int var214 = field693[var5];
                            int var215 = field693[var5 + 1];
                            field693[var5++] = var214 * var215 / 100 + var214;
                            continue;
                        }
                        if (var332 == 4008) {
                            var5 -= 2;
                            int var216 = field693[var5];
                            int var217 = field693[var5 + 1];
                            field693[var5++] = var216 | 0x1 << var217;
                            continue;
                        }
                        if (var332 == 4009) {
                            var5 -= 2;
                            int var218 = field693[var5];
                            int var219 = field693[var5 + 1];
                            field693[var5++] = var218 & -1 - (0x1 << var219);
                            continue;
                        }
                        if (var332 == 4010) {
                            var5 -= 2;
                            int var220 = field693[var5];
                            int var221 = field693[var5 + 1];
                            field693[var5++] = (var220 & 0x1 << var221) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var332 == 4011) {
                            var5 -= 2;
                            int var222 = field693[var5];
                            int var223 = field693[var5 + 1];
                            field693[var5++] = var222 % var223;
                            continue;
                        }
                        if (var332 == 4012) {
                            var5 -= 2;
                            int var224 = field693[var5];
                            int var225 = field693[var5 + 1];
                            if (var224 == 0) {
                                field693[var5++] = 0;
                            } else {
                                field693[var5++] = (int) Math.pow((double) var224, (double) var225);
                            }
                            continue;
                        }
                        if (var332 == 4013) {
                            var5 -= 2;
                            int var226 = field693[var5];
                            int var227 = field693[var5 + 1];
                            if (var226 == 0) {
                                field693[var5++] = 0;
                            } else if (var227 == 0) {
                                field693[var5++] = Integer.MAX_VALUE;
                            } else {
                                field693[var5++] = (int) Math.pow((double) var226, 1.0D / (double) var227);
                            }
                            continue;
                        }
                        if (var332 == 4014) {
                            var5 -= 2;
                            int var228 = field693[var5];
                            int var229 = field693[var5 + 1];
                            field693[var5++] = var228 & var229;
                            continue;
                        }
                        if (var332 == 4015) {
                            var5 -= 2;
                            int var230 = field693[var5];
                            int var231 = field693[var5 + 1];
                            field693[var5++] = var230 | var231;
                            continue;
                        }
                    } else if (var332 < 4200) {
                        if (var332 == 4100) {
                            var6--;
                            String var232 = field694[var6];
                            var5--;
                            int var233 = field693[var5];
                            field694[var6++] = var232 + var233;
                            continue;
                        }
                        if (var332 == 4101) {
                            var6 -= 2;
                            String var234 = field694[var6];
                            String var235 = field694[var6 + 1];
                            field694[var6++] = var234 + var235;
                            continue;
                        }
                        if (var332 == 4102) {
                            var6--;
                            String var236 = field694[var6];
                            var5--;
                            int var237 = field693[var5];
                            String[] var238 = field694;
                            int var239 = var6++;
                            String var241;
                            if (var237 < 0) {
                                var241 = Integer.toString(var237);
                            } else {
                                var241 = class189.method2899(var237, 10, true);
                            }
                            var238[var239] = var236 + var241;
                            continue;
                        }
                        if (var332 == 4103) {
                            var6--;
                            String var242 = field694[var6];
                            field694[var6++] = var242.toLowerCase();
                            continue;
                        }
                        if (var332 == 4104) {
                            var5--;
                            int var243 = field693[var5];
                            long var244 = ((long) var243 + 11745L) * 86400000L;
                            field697.setTime(new Date(var244));
                            int var246 = field697.get(5);
                            int var247 = field697.get(2);
                            int var248 = field697.get(1);
                            field694[var6++] = var246 + "-" + field698[var247] + "-" + var248;
                            continue;
                        }
                        if (var332 == 4105) {
                            var6 -= 2;
                            String var249 = field694[var6];
                            String var250 = field694[var6 + 1];
                            if (Statics.field180.field29 != null && Statics.field180.field29.field2638) {
                                field694[var6++] = var250;
                                continue;
                            }
                            field694[var6++] = var249;
                            continue;
                        }
                        if (var332 == 4106) {
                            var5--;
                            int var251 = field693[var5];
                            field694[var6++] = Integer.toString(var251);
                            continue;
                        }
                        if (var332 == 4107) {
                            var6 -= 2;
                            int[] var252 = field693;
                            int var253 = var5++;
                            int var254 = class192.method805(field694[var6], field694[var6 + 1], client.field301);
                            byte var255;
                            if (var254 > 0) {
                                var255 = 1;
                            } else if (var254 < 0) {
                                var255 = -1;
                            } else {
                                var255 = 0;
                            }
                            var252[var253] = var255;
                            continue;
                        }
                        if (var332 == 4108) {
                            var6--;
                            String var256 = field694[var6];
                            var5 -= 2;
                            int var257 = field693[var5];
                            int var258 = field693[var5 + 1];
                            byte[] var259 = Statics.field148.method2768(var258, 0);
                            class183 var260 = new class183(var259);
                            field693[var5++] = var260.method3325(var256, var257);
                            continue;
                        }
                        if (var332 == 4109) {
                            var6--;
                            String var261 = field694[var6];
                            var5 -= 2;
                            int var262 = field693[var5];
                            int var263 = field693[var5 + 1];
                            byte[] var264 = Statics.field148.method2768(var263, 0);
                            class183 var265 = new class183(var264);
                            field693[var5++] = var265.method3313(var261, var262);
                            continue;
                        }
                        if (var332 == 4110) {
                            var6 -= 2;
                            String var266 = field694[var6];
                            String var267 = field694[var6 + 1];
                            var5--;
                            if (field693[var5] == 1) {
                                field694[var6++] = var266;
                            } else {
                                field694[var6++] = var267;
                            }
                            continue;
                        }
                        if (var332 == 4111) {
                            var6--;
                            String var268 = field694[var6];
                            field694[var6++] = class182.method3315(var268);
                            continue;
                        }
                        if (var332 == 4112) {
                            var6--;
                            String var269 = field694[var6];
                            var5--;
                            int var270 = field693[var5];
                            field694[var6++] = var269 + (char) var270;
                            continue;
                        }
                        if (var332 == 4113) {
                            var5--;
                            int var271 = field693[var5];
                            field693[var5++] = class189.method31((char) var271) ? 1 : 0;
                            continue;
                        }
                        if (var332 == 4114) {
                            var5--;
                            int var272 = field693[var5];
                            field693[var5++] = class189.method2916((char) var272) ? 1 : 0;
                            continue;
                        }
                        if (var332 == 4115) {
                            var5--;
                            int var273 = field693[var5];
                            int[] var274 = field693;
                            int var275 = var5++;
                            char var276 = (char) var273;
                            boolean var277 = var276 >= 'A' && var276 <= 'Z' || var276 >= 'a' && var276 <= 'z';
                            var274[var275] = var277 ? 1 : 0;
                            continue;
                        }
                        if (var332 == 4116) {
                            var5--;
                            int var278 = field693[var5];
                            field693[var5++] = class189.method553((char) var278) ? 1 : 0;
                            continue;
                        }
                        if (var332 == 4117) {
                            var6--;
                            String var279 = field694[var6];
                            if (var279 == null) {
                                field693[var5++] = 0;
                            } else {
                                field693[var5++] = var279.length();
                            }
                            continue;
                        }
                        if (var332 == 4118) {
                            var6--;
                            String var280 = field694[var6];
                            var5 -= 2;
                            int var281 = field693[var5];
                            int var282 = field693[var5 + 1];
                            field694[var6++] = var280.substring(var281, var282);
                            continue;
                        }
                        if (var332 == 4119) {
                            var6--;
                            String var283 = field694[var6];
                            StringBuilder var284 = new StringBuilder(var283.length());
                            boolean var285 = false;
                            for (int var286 = 0; var286 < var283.length(); var286++) {
                                char var287 = var283.charAt(var286);
                                if (var287 == '<') {
                                    var285 = true;
                                } else if (var287 == '>') {
                                    var285 = false;
                                } else if (!var285) {
                                    var284.append(var287);
                                }
                            }
                            field694[var6++] = var284.toString();
                            continue;
                        }
                        if (var332 == 4120) {
                            var6--;
                            String var288 = field694[var6];
                            var5--;
                            int var289 = field693[var5];
                            field693[var5++] = var288.indexOf(var289);
                            continue;
                        }
                    } else if (var332 < 4300) {
                        if (var332 == 4200) {
                            var5--;
                            int var290 = field693[var5];
                            field694[var6++] = class42.method2477(var290).field987;
                            continue;
                        }
                        if (var332 == 4201) {
                            var5 -= 2;
                            int var291 = field693[var5];
                            int var292 = field693[var5 + 1];
                            class42 var293 = class42.method2477(var291);
                            if (var292 >= 1 && var292 <= 5 && var293.field1001[var292 - 1] != null) {
                                field694[var6++] = var293.field1001[var292 - 1];
                                continue;
                            }
                            field694[var6++] = "";
                            continue;
                        }
                        if (var332 == 4202) {
                            var5 -= 2;
                            int var294 = field693[var5];
                            int var295 = field693[var5 + 1];
                            class42 var296 = class42.method2477(var294);
                            if (var295 >= 1 && var295 <= 5 && var296.field1002[var295 - 1] != null) {
                                field694[var6++] = var296.field1002[var295 - 1];
                                continue;
                            }
                            field694[var6++] = "";
                            continue;
                        }
                        if (var332 == 4203) {
                            var5--;
                            int var297 = field693[var5];
                            field693[var5++] = class42.method2477(var297).field1019;
                            continue;
                        }
                        if (var332 == 4204) {
                            var5--;
                            int var298 = field693[var5];
                            field693[var5++] = class42.method2477(var298).field998 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var332 == 4205) {
                            var5--;
                            int var299 = field693[var5];
                            class42 var300 = class42.method2477(var299);
                            if (var300.field990 == -1 && var300.field1006 >= 0) {
                                field693[var5++] = var300.field1006;
                                continue;
                            }
                            field693[var5++] = var299;
                            continue;
                        }
                        if (var332 == 4206) {
                            var5--;
                            int var301 = field693[var5];
                            class42 var302 = class42.method2477(var301);
                            if (var302.field990 >= 0 && var302.field1006 >= 0) {
                                field693[var5++] = var302.field1006;
                                continue;
                            }
                            field693[var5++] = var301;
                            continue;
                        }
                        if (var332 == 4207) {
                            var5--;
                            int var303 = field693[var5];
                            field693[var5++] = class42.method2477(var303).field1000 ? 1 : 0;
                            continue;
                        }
                    } else if (var332 < 5100) {
                        if (var332 == 5000) {
                            field693[var5++] = client.field483;
                            continue;
                        }
                        if (var332 == 5001) {
                            var5 -= 3;
                            client.field483 = field693[var5];
                            Statics.field22 = class114.method2708(field693[var5 + 1]);
                            if (Statics.field22 == null) {
                                Statics.field22 = class114.field1885;
                            }
                            client.field314 = field693[var5 + 2];
                            client.field340.method2376(132);
                            client.field340.method2113(client.field483);
                            client.field340.method2113(Statics.field22.field1884);
                            client.field340.method2113(client.field314);
                            continue;
                        }
                        if (var332 == 5002) {
                            var6--;
                            String var304 = field694[var6];
                            var5 -= 2;
                            int var305 = field693[var5];
                            int var306 = field693[var5 + 1];
                            client.field340.method2376(220);
                            class107 var307 = client.field340;
                            int var308 = var304.length() + 1;
                            var307.method2113(var308 + 2);
                            client.field340.method2118(var304);
                            client.field340.method2113(var305 - 1);
                            client.field340.method2113(var306);
                            continue;
                        }
                        if (var332 == 5003) {
                            var5--;
                            int var309 = field693[var5];
                            String var310 = null;
                            if (var309 < 100) {
                                var310 = client.field480[var309];
                            }
                            if (var310 == null) {
                                var310 = "";
                            }
                            field694[var6++] = var310;
                            continue;
                        }
                        if (var332 == 5004) {
                            var5--;
                            int var311 = field693[var5];
                            int var312 = -1;
                            if (var311 < 100 && client.field480[var311] != null) {
                                var312 = client.field477[var311];
                            }
                            field693[var5++] = var312;
                            continue;
                        }
                        if (var332 == 5005) {
                            if (Statics.field22 == null) {
                                field693[var5++] = -1;
                            } else {
                                field693[var5++] = Statics.field22.field1884;
                            }
                            continue;
                        }
                        if (var332 == 5008) {
                            var6--;
                            String var313 = field694[var6];
                            if (var313.startsWith("::")) {
                                String var314 = var313.substring(2);
                                if (var314.equalsIgnoreCase("toggleroof")) {
                                    Statics.field156.field145 = !Statics.field156.field145;
                                    Statics.method1017();
                                    if (Statics.field156.field145) {
                                        client.method555(99, "", "Roofs are now all hidden");
                                    } else {
                                        client.method555(99, "", "Roofs will only be removed selectively");
                                    }
                                }
                                if (client.field432 >= 2) {
                                    if (var314.equalsIgnoreCase("fpson")) {
                                        client.field276 = true;
                                    }
                                    if (var314.equalsIgnoreCase("fpsoff")) {
                                        client.field276 = false;
                                    }
                                    if (var314.equalsIgnoreCase("gc")) {
                                        System.gc();
                                    }
                                    if (var314.equalsIgnoreCase("clientdrop")) {
                                        client.method2887();
                                    }
                                    if (var314.equalsIgnoreCase("errortest") && client.field471 == 2) {
                                        throw new RuntimeException();
                                    }
                                }
                                client.field340.method2376(144);
                                client.field340.method2113(var314.length() + 1);
                                client.field340.method2118(var314);
                            } else {
                                String var315 = var313.toLowerCase();
                                byte var316 = 0;
                                if (var315.startsWith(class139.field2293)) {
                                    var316 = 0;
                                    var313 = var313.substring(class139.field2293.length());
                                } else if (var315.startsWith(class139.field2295)) {
                                    var316 = 1;
                                    var313 = var313.substring(class139.field2295.length());
                                } else if (var315.startsWith(class139.field2297)) {
                                    var316 = 2;
                                    var313 = var313.substring(class139.field2297.length());
                                } else if (var315.startsWith(class139.field2187)) {
                                    var316 = 3;
                                    var313 = var313.substring(class139.field2187.length());
                                } else if (var315.startsWith(class139.field2301)) {
                                    var316 = 4;
                                    var313 = var313.substring(class139.field2301.length());
                                } else if (var315.startsWith(class139.field2303)) {
                                    var316 = 5;
                                    var313 = var313.substring(class139.field2303.length());
                                } else if (var315.startsWith(class139.field2305)) {
                                    var316 = 6;
                                    var313 = var313.substring(class139.field2305.length());
                                } else if (var315.startsWith(class139.field2307)) {
                                    var316 = 7;
                                    var313 = var313.substring(class139.field2307.length());
                                } else if (var315.startsWith(class139.field2218)) {
                                    var316 = 8;
                                    var313 = var313.substring(class139.field2218.length());
                                } else if (var315.startsWith(class139.field2215)) {
                                    var316 = 9;
                                    var313 = var313.substring(class139.field2215.length());
                                } else if (var315.startsWith(class139.field2227)) {
                                    var316 = 10;
                                    var313 = var313.substring(class139.field2227.length());
                                } else if (var315.startsWith(class139.field2182)) {
                                    var316 = 11;
                                    var313 = var313.substring(class139.field2182.length());
                                } else if (client.field301 != 0) {
                                    if (var315.startsWith(class139.field2294)) {
                                        var316 = 0;
                                        var313 = var313.substring(class139.field2294.length());
                                    } else if (var315.startsWith(class139.field2322)) {
                                        var316 = 1;
                                        var313 = var313.substring(class139.field2322.length());
                                    } else if (var315.startsWith(class139.field2298)) {
                                        var316 = 2;
                                        var313 = var313.substring(class139.field2298.length());
                                    } else if (var315.startsWith(class139.field2304)) {
                                        var316 = 3;
                                        var313 = var313.substring(class139.field2304.length());
                                    } else if (var315.startsWith(class139.field2302)) {
                                        var316 = 4;
                                        var313 = var313.substring(class139.field2302.length());
                                    } else if (var315.startsWith(class139.field2333)) {
                                        var316 = 5;
                                        var313 = var313.substring(class139.field2333.length());
                                    } else if (var315.startsWith(class139.field2306)) {
                                        var316 = 6;
                                        var313 = var313.substring(class139.field2306.length());
                                    } else if (var315.startsWith(class139.field2284)) {
                                        var316 = 7;
                                        var313 = var313.substring(class139.field2284.length());
                                    } else if (var315.startsWith(class139.field2365)) {
                                        var316 = 8;
                                        var313 = var313.substring(class139.field2365.length());
                                    } else if (var315.startsWith(class139.field2190)) {
                                        var316 = 9;
                                        var313 = var313.substring(class139.field2190.length());
                                    } else if (var315.startsWith(class139.field2314)) {
                                        var316 = 10;
                                        var313 = var313.substring(class139.field2314.length());
                                    } else if (var315.startsWith(class139.field2327)) {
                                        var316 = 11;
                                        var313 = var313.substring(class139.field2327.length());
                                    }
                                }
                                String var317 = var313.toLowerCase();
                                byte var318 = 0;
                                if (var317.startsWith(class139.field2317)) {
                                    var318 = 1;
                                    var313 = var313.substring(class139.field2317.length());
                                } else if (var317.startsWith(class139.field2319)) {
                                    var318 = 2;
                                    var313 = var313.substring(class139.field2319.length());
                                } else if (var317.startsWith(class139.field2321)) {
                                    var318 = 3;
                                    var313 = var313.substring(class139.field2321.length());
                                } else if (var317.startsWith(class139.field2323)) {
                                    var318 = 4;
                                    var313 = var313.substring(class139.field2323.length());
                                } else if (var317.startsWith(class139.field2325)) {
                                    var318 = 5;
                                    var313 = var313.substring(class139.field2325.length());
                                } else if (client.field301 != 0) {
                                    if (var317.startsWith(class139.field2264)) {
                                        var318 = 1;
                                        var313 = var313.substring(class139.field2264.length());
                                    } else if (var317.startsWith(class139.field2320)) {
                                        var318 = 2;
                                        var313 = var313.substring(class139.field2320.length());
                                    } else if (var317.startsWith(class139.field2296)) {
                                        var318 = 3;
                                        var313 = var313.substring(class139.field2296.length());
                                    } else if (var317.startsWith(class139.field2324)) {
                                        var318 = 4;
                                        var313 = var313.substring(class139.field2324.length());
                                    } else if (var317.startsWith(class139.field2202)) {
                                        var318 = 5;
                                        var313 = var313.substring(class139.field2202.length());
                                    }
                                }
                                client.field340.method2376(195);
                                client.field340.method2113(0);
                                int var319 = client.field340.field1815;
                                client.field340.method2113(var316);
                                client.field340.method2113(var318);
                                class181.method593(client.field340, var313);
                                client.field340.method2124(client.field340.field1815 - var319);
                            }
                            continue;
                        }
                        if (var332 == 5009) {
                            var6 -= 2;
                            String var320 = field694[var6];
                            String var321 = field694[var6 + 1];
                            client.field340.method2376(235);
                            client.field340.method2114(0);
                            int var322 = client.field340.field1815;
                            client.field340.method2118(var320);
                            class181.method593(client.field340, var321);
                            client.field340.method2244(client.field340.field1815 - var322);
                            continue;
                        }
                        if (var332 == 5010) {
                            var5--;
                            int var323 = field693[var5];
                            String var324 = null;
                            if (var323 < 100) {
                                var324 = client.field478[var323];
                            }
                            if (var324 == null) {
                                var324 = "";
                            }
                            field694[var6++] = var324;
                            continue;
                        }
                        if (var332 == 5011) {
                            var5--;
                            int var325 = field693[var5];
                            String var326 = null;
                            if (var325 < 100) {
                                var326 = client.field382[var325];
                            }
                            if (var326 == null) {
                                var326 = "";
                            }
                            field694[var6++] = var326;
                            continue;
                        }
                        if (var332 == 5015) {
                            String var327;
                            if (Statics.field180 == null || Statics.field180.field36 == null) {
                                var327 = "";
                            } else {
                                var327 = Statics.field180.field36;
                            }
                            field694[var6++] = var327;
                            continue;
                        }
                        if (var332 == 5016) {
                            field693[var5++] = client.field314;
                            continue;
                        }
                        if (var332 == 5017) {
                            field693[var5++] = client.field433;
                            continue;
                        }
                    }
                } else {
                    class148 var64;
                    if (var332 >= 2000) {
                        var332 -= 1000;
                        var5--;
                        var64 = class148.method16(field693[var5]);
                    } else {
                        var64 = var41 ? Statics.field546 : Statics.field24;
                    }
                    if (var332 == 1300) {
                        var5--;
                        int var65 = field693[var5] - 1;
                        if (var65 >= 0 && var65 <= 9) {
                            var6--;
                            var64.method2878(var65, field694[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var332 == 1301) {
                        var5 -= 2;
                        int var66 = field693[var5];
                        int var67 = field693[var5 + 1];
                        var64.field2496 = class148.method2867(var66, var67);
                        continue;
                    }
                    if (var332 == 1302) {
                        var5--;
                        var64.field2558 = field693[var5] == 1;
                        continue;
                    }
                    if (var332 == 1303) {
                        var5--;
                        var64.field2553 = field693[var5];
                        continue;
                    }
                    if (var332 == 1304) {
                        var5--;
                        var64.field2557 = field693[var5];
                        continue;
                    }
                    if (var332 == 1305) {
                        var6--;
                        var64.field2597 = field694[var6];
                        continue;
                    }
                    if (var332 == 1306) {
                        var6--;
                        var64.field2559 = field694[var6];
                        continue;
                    }
                    if (var332 == 1307) {
                        var64.field2492 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var331) {
            StringBuilder var329 = new StringBuilder(30);
            var329.append("").append(var4.field2817).append(" ");
            for (int var330 = field699 - 1; var330 >= 0; var330--) {
                var329.append("").append(field695[var330].field189.field2817).append(" ");
            }
            var329.append("").append(var10);
            class132.method508(var329.toString(), var331);
        }
    }

    @ObfuscatedName("eg.u(II)V")
    public static void method2719(int arg0) {
        if (arg0 == -1 || !class148.method2726(arg0)) {
            return;
        }
        class148[] var1 = Statics.field2602[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class148 var3 = var1[var2];
            if (var3.field2561 != null) {
                class1 var4 = new class1();
                var4.field4 = var3;
                var4.field10 = var3.field2561;
                method748(var4, 2000000);
            }
        }
    }
}
