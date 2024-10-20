package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("au")
public class class32 {

    @ObfuscatedName("au.l")
    public static int[] field696 = new int[5];

    @ObfuscatedName("au.g")
    public static int[][] field697 = new int[5][5000];

    @ObfuscatedName("au.a")
    public static int[] field698 = new int[1000];

    @ObfuscatedName("au.x")
    public static String[] field711 = new String[1000];

    @ObfuscatedName("au.r")
    public static int field707 = 0;

    @ObfuscatedName("au.w")
    public static class13[] field701 = new class13[50];

    @ObfuscatedName("au.o")
    public static Calendar field703 = Calendar.getInstance();

    @ObfuscatedName("au.p")
    public static final String[] field704 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.y(Ly;I)V")
    public static void method585(class1 arg0) {
        method25(arg0, 200000);
    }

    @ObfuscatedName("l.u(Ly;II)V")
    public static void method25(class1 arg0, int arg1) {
        Object[] var2 = arg0.field1;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method2357(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field519;
        int[] var9 = var4.field521;
        byte var10 = -1;
        field707 = 0;
        try {
            Statics.field2832 = new int[var4.field522];
            int var11 = 0;
            Statics.field695 = new String[var4.field523];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2503;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field20;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2504;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2503;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2504;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field13;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field2832[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field695[var12++] = var15;
                }
            }
            int var16 = 0;
            label2562: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var401 = var8[var7];
                if (var401 < 100) {
                    if (var401 == 0) {
                        field698[var5++] = var9[var7];
                        continue;
                    }
                    if (var401 == 1) {
                        int var17 = var9[var7];
                        field698[var5++] = class153.field2628[var17];
                        continue;
                    }
                    if (var401 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class153.field2628[var18] = field698[var5];
                        client.method777(var18);
                        continue;
                    }
                    if (var401 == 3) {
                        field711[var6++] = var4.field526[var7];
                        continue;
                    }
                    if (var401 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var401 == 7) {
                        var5 -= 2;
                        if (field698[var5 + 1] != field698[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var401 == 8) {
                        var5 -= 2;
                        if (field698[var5 + 1] == field698[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var401 == 9) {
                        var5 -= 2;
                        if (field698[var5] < field698[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var401 == 10) {
                        var5 -= 2;
                        if (field698[var5] > field698[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var401 == 21) {
                        if (field707 == 0) {
                            return;
                        }
                        class13 var19 = field701[--field707];
                        var4 = var19.field198;
                        var8 = var4.field519;
                        var9 = var4.field521;
                        var7 = var19.field190;
                        Statics.field2832 = var19.field191;
                        Statics.field695 = var19.field188;
                        continue;
                    }
                    if (var401 == 25) {
                        int var20 = var9[var7];
                        field698[var5++] = class153.method1769(var20);
                        continue;
                    }
                    if (var401 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class153.method727(var21, field698[var5]);
                        continue;
                    }
                    if (var401 == 31) {
                        var5 -= 2;
                        if (field698[var5] <= field698[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var401 == 32) {
                        var5 -= 2;
                        if (field698[var5] >= field698[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var401 == 33) {
                        field698[var5++] = Statics.field2832[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var401 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2832[var10001] = field698[var5];
                        continue;
                    }
                    if (var401 == 35) {
                        field711[var6++] = Statics.field695[var9[var7]];
                        continue;
                    }
                    if (var401 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field695[var10001] = field711[var6];
                        continue;
                    }
                    if (var401 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class196.method2673(field711, var6, var22);
                        field711[var6++] = var23;
                        continue;
                    }
                    if (var401 == 38) {
                        var5--;
                        continue;
                    }
                    if (var401 == 39) {
                        var6--;
                        continue;
                    }
                    if (var401 == 40) {
                        int var24 = var9[var7];
                        class19 var25 = class19.method2357(var24);
                        int[] var26 = new int[var25.field522];
                        String[] var27 = new String[var25.field523];
                        for (int var28 = 0; var28 < var25.field525; var28++) {
                            var26[var28] = field698[var5 - var25.field525 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field520; var29++) {
                            var27[var29] = field711[var6 - var25.field520 + var29];
                        }
                        var5 -= var25.field525;
                        var6 -= var25.field520;
                        class13 var30 = new class13();
                        var30.field198 = var4;
                        var30.field190 = var7;
                        var30.field191 = Statics.field2832;
                        var30.field188 = Statics.field695;
                        field701[++field707 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field519;
                        var9 = var25.field521;
                        var7 = -1;
                        Statics.field2832 = var26;
                        Statics.field695 = var27;
                        continue;
                    }
                    if (var401 == 42) {
                        field698[var5++] = client.field271[var9[var7]];
                        continue;
                    }
                    if (var401 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field271[var10001] = field698[var5];
                        continue;
                    }
                    if (var401 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field698[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field696[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2562;
                                }
                                field697[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var401 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field698[var5];
                        if (var37 >= 0 && var37 < field696[var36]) {
                            field698[var5++] = field697[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var401 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field698[var5];
                        if (var39 >= 0 && var39 < field696[var38]) {
                            field697[var38][var39] = field698[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var401 == 47) {
                        String var40 = client.field449[var9[var7]];
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field711[var6++] = var40;
                        continue;
                    }
                    if (var401 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field449[var10001] = field711[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var401 < 1000) {
                    if (var401 == 100) {
                        var5 -= 3;
                        int var42 = field698[var5];
                        int var43 = field698[var5 + 1];
                        int var44 = field698[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class151 var45 = class151.method2354(var42);
                        if (var45.field2586 == null) {
                            var45.field2586 = new class151[var44 + 1];
                        }
                        if (var45.field2586.length <= var44) {
                            class151[] var46 = new class151[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2586.length; var47++) {
                                var46[var47] = var45.field2586[var47];
                            }
                            var45.field2586 = var46;
                        }
                        if (var44 > 0 && var45.field2586[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class151 var48 = new class151();
                        var48.field2499 = var43;
                        var48.field2532 = var48.field2503 = var45.field2503;
                        var48.field2504 = var44;
                        var48.field2502 = true;
                        var45.field2586[var44] = var48;
                        if (var41) {
                            Statics.field67 = var48;
                        } else {
                            Statics.field702 = var48;
                        }
                        client.method2685(var45);
                        continue;
                    }
                    if (var401 == 101) {
                        class151 var49 = var41 ? Statics.field67 : Statics.field702;
                        class151 var50 = class151.method2354(var49.field2503);
                        var50.field2586[var49.field2504] = null;
                        client.method2685(var50);
                        continue;
                    }
                    if (var401 == 102) {
                        var5--;
                        class151 var51 = class151.method2354(field698[var5]);
                        var51.field2586 = null;
                        client.method2685(var51);
                        continue;
                    }
                    if (var401 == 200) {
                        var5 -= 2;
                        int var52 = field698[var5];
                        int var53 = field698[var5 + 1];
                        class151 var54 = class151.method503(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field698[var5++] = 1;
                            if (var41) {
                                Statics.field67 = var54;
                            } else {
                                Statics.field702 = var54;
                            }
                            continue;
                        }
                        field698[var5++] = 0;
                        continue;
                    }
                } else if (var401 >= 1000 && var401 < 1100 || var401 >= 2000 && var401 < 2100) {
                    class151 var55;
                    if (var401 >= 2000) {
                        var401 -= 1000;
                        var5--;
                        var55 = class151.method2354(field698[var5]);
                    } else {
                        var55 = var41 ? Statics.field67 : Statics.field702;
                    }
                    if (var401 == 1000) {
                        var5 -= 2;
                        var55.field2562 = field698[var5];
                        var55.field2545 = field698[var5 + 1];
                        client.method2685(var55);
                        continue;
                    }
                    if (var401 == 1001) {
                        var5 -= 2;
                        var55.field2512 = field698[var5];
                        var55.field2513 = field698[var5 + 1];
                        client.method2685(var55);
                        continue;
                    }
                    if (var401 == 1003) {
                        var5--;
                        boolean var56 = field698[var5] == 1;
                        if (var55.field2515 != var56) {
                            var55.field2515 = var56;
                            client.method2685(var55);
                        }
                        continue;
                    }
                } else if (!(var401 < 1100 || var401 >= 1200) || !(var401 < 2100 || var401 >= 2200)) {
                    class151 var57;
                    if (var401 >= 2000) {
                        var401 -= 1000;
                        var5--;
                        var57 = class151.method2354(field698[var5]);
                    } else {
                        var57 = var41 ? Statics.field67 : Statics.field702;
                    }
                    if (var401 == 1100) {
                        var5 -= 2;
                        var57.field2516 = field698[var5];
                        if (var57.field2516 > var57.field2576 - var57.field2512) {
                            var57.field2516 = var57.field2576 - var57.field2512;
                        }
                        if (var57.field2516 < 0) {
                            var57.field2516 = 0;
                        }
                        var57.field2517 = field698[var5 + 1];
                        if (var57.field2517 > var57.field2519 - var57.field2513) {
                            var57.field2517 = var57.field2519 - var57.field2513;
                        }
                        if (var57.field2517 < 0) {
                            var57.field2517 = 0;
                        }
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1101) {
                        var5--;
                        var57.field2604 = field698[var5];
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1102) {
                        var5--;
                        var57.field2546 = field698[var5] == 1;
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1103) {
                        var5--;
                        var57.field2525 = field698[var5];
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1104) {
                        var5--;
                        var57.field2526 = field698[var5];
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1105) {
                        var5--;
                        var57.field2535 = field698[var5];
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1106) {
                        var5--;
                        var57.field2529 = field698[var5];
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1107) {
                        var5--;
                        var57.field2571 = field698[var5] == 1;
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1108) {
                        var57.field2575 = 1;
                        var5--;
                        var57.field2536 = field698[var5];
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1109) {
                        var5 -= 6;
                        var57.field2541 = field698[var5];
                        var57.field2614 = field698[var5 + 1];
                        var57.field2551 = field698[var5 + 2];
                        var57.field2611 = field698[var5 + 3];
                        var57.field2608 = field698[var5 + 4];
                        var57.field2520 = field698[var5 + 5];
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1110) {
                        var5--;
                        int var58 = field698[var5];
                        if (var57.field2539 != var58) {
                            var57.field2539 = var58;
                            var57.field2554 = 0;
                            var57.field2610 = 0;
                            client.method2685(var57);
                        }
                        continue;
                    }
                    if (var401 == 1111) {
                        var5--;
                        var57.field2548 = field698[var5] == 1;
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1112) {
                        var6--;
                        String var59 = field711[var6];
                        if (!var59.equals(var57.field2550)) {
                            var57.field2550 = var59;
                            client.method2685(var57);
                        }
                        continue;
                    }
                    if (var401 == 1113) {
                        var5--;
                        var57.field2549 = field698[var5];
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1114) {
                        var5 -= 3;
                        var57.field2553 = field698[var5];
                        var57.field2579 = field698[var5 + 1];
                        var57.field2528 = field698[var5 + 2];
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1115) {
                        var5--;
                        var57.field2531 = field698[var5] == 1;
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1116) {
                        var5--;
                        var57.field2511 = field698[var5];
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1117) {
                        var5--;
                        var57.field2542 = field698[var5];
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1118) {
                        var5--;
                        var57.field2533 = field698[var5] == 1;
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1119) {
                        var5--;
                        var57.field2534 = field698[var5] == 1;
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1120) {
                        var5 -= 2;
                        var57.field2576 = field698[var5];
                        var57.field2519 = field698[var5 + 1];
                        client.method2685(var57);
                        continue;
                    }
                    if (var401 == 1121) {
                        int var60 = var57.field2503;
                        int var61 = var57.field2504;
                        client.field294.method2331(197);
                        client.field294.method2137(var61);
                        client.field294.method2232(var60);
                        client.field391 = var57;
                        client.method2685(var57);
                        continue;
                    }
                } else if (!(var401 < 1200 || var401 >= 1300) || !(var401 < 2200 || var401 >= 2300)) {
                    class151 var62;
                    if (var401 >= 2000) {
                        var401 -= 1000;
                        var5--;
                        var62 = class151.method2354(field698[var5]);
                    } else {
                        var62 = var41 ? Statics.field67 : Statics.field702;
                    }
                    client.method2685(var62);
                    if (var401 == 1200) {
                        var5 -= 2;
                        int var63 = field698[var5];
                        int var64 = field698[var5 + 1];
                        var62.field2607 = var63;
                        var62.field2530 = var64;
                        class45 var65 = class45.method148(var63);
                        var62.field2551 = var65.field1007;
                        var62.field2611 = var65.field1008;
                        var62.field2608 = var65.field1021;
                        var62.field2541 = var65.field1010;
                        var62.field2614 = var65.field1011;
                        var62.field2520 = var65.field1006;
                        if (var62.field2512 > 0) {
                            var62.field2520 = var62.field2520 * 32 / var62.field2512;
                        }
                        continue;
                    }
                    if (var401 == 1201) {
                        var62.field2575 = 2;
                        var5--;
                        var62.field2536 = field698[var5];
                        continue;
                    }
                    if (var401 == 1202) {
                        var62.field2575 = 3;
                        var62.field2536 = Statics.field1561.field38.method2924();
                        continue;
                    }
                } else if (var401 >= 1300 && var401 < 1400 || var401 >= 2300 && var401 < 2400) {
                    class151 var66;
                    if (var401 >= 2000) {
                        var401 -= 1000;
                        var5--;
                        var66 = class151.method2354(field698[var5]);
                    } else {
                        var66 = var41 ? Statics.field67 : Statics.field702;
                    }
                    if (var401 == 1300) {
                        var5--;
                        int var67 = field698[var5] - 1;
                        if (var67 >= 0 && var67 <= 9) {
                            var6--;
                            var66.method2854(var67, field711[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var401 == 1301) {
                        var5 -= 2;
                        int var68 = field698[var5];
                        int var69 = field698[var5 + 1];
                        var66.field2565 = class151.method503(var68, var69);
                        continue;
                    }
                    if (var401 == 1302) {
                        var5--;
                        var66.field2568 = field698[var5] == 1;
                        continue;
                    }
                    if (var401 == 1303) {
                        var5--;
                        var66.field2566 = field698[var5];
                        continue;
                    }
                    if (var401 == 1304) {
                        var5--;
                        var66.field2567 = field698[var5];
                        continue;
                    }
                    if (var401 == 1305) {
                        var6--;
                        var66.field2563 = field711[var6];
                        continue;
                    }
                    if (var401 == 1306) {
                        var6--;
                        var66.field2569 = field711[var6];
                        continue;
                    }
                    if (var401 == 1307) {
                        var66.field2564 = null;
                        continue;
                    }
                } else {
                    if (var401 >= 1400 && var401 < 1500 || var401 >= 2400 && var401 < 2500) {
                        class151 var70;
                        if (var401 >= 2000) {
                            var401 -= 1000;
                            var5--;
                            var70 = class151.method2354(field698[var5]);
                        } else {
                            var70 = var41 ? Statics.field67 : Statics.field702;
                        }
                        var6--;
                        String var71 = field711[var6];
                        int[] var72 = null;
                        if (var71.length() > 0 && var71.charAt(var71.length() - 1) == 'Y') {
                            var5--;
                            int var73 = field698[var5];
                            if (var73 > 0) {
                                var72 = new int[var73];
                                while (var73-- > 0) {
                                    var5--;
                                    var72[var73] = field698[var5];
                                }
                            }
                            var71 = var71.substring(0, var71.length() - 1);
                        }
                        Object[] var74 = new Object[var71.length() + 1];
                        for (int var75 = var74.length - 1; var75 >= 1; var75--) {
                            if (var71.charAt(var75 - 1) == 's') {
                                var6--;
                                var74[var75] = field711[var6];
                            } else {
                                var5--;
                                var74[var75] = Integer.valueOf(field698[var5]);
                            }
                        }
                        var5--;
                        int var76 = field698[var5];
                        if (var76 == -1) {
                            var74 = null;
                        } else {
                            var74[0] = Integer.valueOf(var76);
                        }
                        if (var401 == 1400) {
                            var70.field2609 = var74;
                        }
                        if (var401 == 1401) {
                            var70.field2518 = var74;
                        }
                        if (var401 == 1402) {
                            var70.field2574 = var74;
                        }
                        if (var401 == 1403) {
                            var70.field2620 = var74;
                        }
                        if (var401 == 1404) {
                            var70.field2578 = var74;
                        }
                        if (var401 == 1405) {
                            var70.field2523 = var74;
                        }
                        if (var401 == 1406) {
                            var70.field2582 = var74;
                        }
                        if (var401 == 1407) {
                            var70.field2583 = var74;
                            var70.field2584 = var72;
                        }
                        if (var401 == 1408) {
                            var70.field2605 = var74;
                        }
                        if (var401 == 1409) {
                            var70.field2590 = var74;
                        }
                        if (var401 == 1410) {
                            var70.field2580 = var74;
                        }
                        if (var401 == 1411) {
                            var70.field2573 = var74;
                        }
                        if (var401 == 1412) {
                            var70.field2577 = var74;
                        }
                        if (var401 == 1414) {
                            var70.field2585 = var74;
                            var70.field2527 = var72;
                        }
                        if (var401 == 1415) {
                            var70.field2587 = var74;
                            var70.field2588 = var72;
                        }
                        if (var401 == 1416) {
                            var70.field2581 = var74;
                        }
                        if (var401 == 1417) {
                            var70.field2591 = var74;
                        }
                        if (var401 == 1418) {
                            var70.field2592 = var74;
                        }
                        if (var401 == 1419) {
                            var70.field2593 = var74;
                        }
                        if (var401 == 1420) {
                            var70.field2594 = var74;
                        }
                        if (var401 == 1421) {
                            var70.field2544 = var74;
                        }
                        if (var401 == 1422) {
                            var70.field2505 = var74;
                        }
                        if (var401 == 1423) {
                            var70.field2508 = var74;
                        }
                        if (var401 == 1424) {
                            var70.field2598 = var74;
                        }
                        var70.field2570 = true;
                        continue;
                    }
                    if (var401 < 1600) {
                        class151 var77 = var41 ? Statics.field67 : Statics.field702;
                        if (var401 == 1500) {
                            field698[var5++] = var77.field2562;
                            continue;
                        }
                        if (var401 == 1501) {
                            field698[var5++] = var77.field2545;
                            continue;
                        }
                        if (var401 == 1502) {
                            field698[var5++] = var77.field2512;
                            continue;
                        }
                        if (var401 == 1503) {
                            field698[var5++] = var77.field2513;
                            continue;
                        }
                        if (var401 == 1504) {
                            field698[var5++] = var77.field2515 ? 1 : 0;
                            continue;
                        }
                        if (var401 == 1505) {
                            field698[var5++] = var77.field2532;
                            continue;
                        }
                    } else if (var401 < 1700) {
                        class151 var78 = var41 ? Statics.field67 : Statics.field702;
                        if (var401 == 1600) {
                            field698[var5++] = var78.field2516;
                            continue;
                        }
                        if (var401 == 1601) {
                            field698[var5++] = var78.field2517;
                            continue;
                        }
                        if (var401 == 1602) {
                            field711[var6++] = var78.field2550;
                            continue;
                        }
                        if (var401 == 1603) {
                            field698[var5++] = var78.field2576;
                            continue;
                        }
                        if (var401 == 1604) {
                            field698[var5++] = var78.field2519;
                            continue;
                        }
                        if (var401 == 1605) {
                            field698[var5++] = var78.field2520;
                            continue;
                        }
                        if (var401 == 1606) {
                            field698[var5++] = var78.field2551;
                            continue;
                        }
                        if (var401 == 1607) {
                            field698[var5++] = var78.field2608;
                            continue;
                        }
                        if (var401 == 1608) {
                            field698[var5++] = var78.field2611;
                            continue;
                        }
                    } else if (var401 < 1800) {
                        class151 var79 = var41 ? Statics.field67 : Statics.field702;
                        if (var401 == 1700) {
                            field698[var5++] = var79.field2607;
                            continue;
                        }
                        if (var401 == 1701) {
                            if (var79.field2607 == -1) {
                                field698[var5++] = 0;
                            } else {
                                field698[var5++] = var79.field2530;
                            }
                            continue;
                        }
                        if (var401 == 1702) {
                            field698[var5++] = var79.field2504;
                            continue;
                        }
                    } else if (var401 < 1900) {
                        class151 var80 = var41 ? Statics.field67 : Statics.field702;
                        if (var401 == 1800) {
                            int[] var81 = field698;
                            int var82 = var5++;
                            int var83 = client.method731(var80);
                            int var84 = var83 >> 11 & 0x3F;
                            var81[var82] = var84;
                            continue;
                        }
                        if (var401 == 1801) {
                            var5--;
                            int var85 = field698[var5];
                            int var402 = var85 - 1;
                            if (var80.field2564 != null && var402 < var80.field2564.length && var80.field2564[var402] != null) {
                                field711[var6++] = var80.field2564[var402];
                                continue;
                            }
                            field711[var6++] = "";
                            continue;
                        }
                        if (var401 == 1802) {
                            if (var80.field2563 == null) {
                                field711[var6++] = "";
                            } else {
                                field711[var6++] = var80.field2563;
                            }
                            continue;
                        }
                    } else if (var401 < 2600) {
                        var5--;
                        class151 var86 = class151.method2354(field698[var5]);
                        if (var401 == 2500) {
                            field698[var5++] = var86.field2562;
                            continue;
                        }
                        if (var401 == 2501) {
                            field698[var5++] = var86.field2545;
                            continue;
                        }
                        if (var401 == 2502) {
                            field698[var5++] = var86.field2512;
                            continue;
                        }
                        if (var401 == 2503) {
                            field698[var5++] = var86.field2513;
                            continue;
                        }
                        if (var401 == 2504) {
                            field698[var5++] = var86.field2515 ? 1 : 0;
                            continue;
                        }
                        if (var401 == 2505) {
                            field698[var5++] = var86.field2532;
                            continue;
                        }
                    } else if (var401 < 2700) {
                        var5--;
                        class151 var87 = class151.method2354(field698[var5]);
                        if (var401 == 2600) {
                            field698[var5++] = var87.field2516;
                            continue;
                        }
                        if (var401 == 2601) {
                            field698[var5++] = var87.field2517;
                            continue;
                        }
                        if (var401 == 2602) {
                            field711[var6++] = var87.field2550;
                            continue;
                        }
                        if (var401 == 2603) {
                            field698[var5++] = var87.field2576;
                            continue;
                        }
                        if (var401 == 2604) {
                            field698[var5++] = var87.field2519;
                            continue;
                        }
                        if (var401 == 2605) {
                            field698[var5++] = var87.field2520;
                            continue;
                        }
                        if (var401 == 2606) {
                            field698[var5++] = var87.field2551;
                            continue;
                        }
                        if (var401 == 2607) {
                            field698[var5++] = var87.field2608;
                            continue;
                        }
                        if (var401 == 2608) {
                            field698[var5++] = var87.field2611;
                            continue;
                        }
                    } else if (var401 < 2800) {
                        if (var401 == 2700) {
                            var5--;
                            class151 var88 = class151.method2354(field698[var5]);
                            field698[var5++] = var88.field2607;
                            continue;
                        }
                        if (var401 == 2701) {
                            var5--;
                            class151 var89 = class151.method2354(field698[var5]);
                            if (var89.field2607 == -1) {
                                field698[var5++] = 0;
                            } else {
                                field698[var5++] = var89.field2530;
                            }
                            continue;
                        }
                        if (var401 == 2702) {
                            var5--;
                            int var90 = field698[var5];
                            class4 var91 = (class4) client.field414.method3171((long) var90);
                            if (var91 == null) {
                                field698[var5++] = 0;
                            } else {
                                field698[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var401 < 2900) {
                        var5--;
                        class151 var92 = class151.method2354(field698[var5]);
                        if (var401 == 2800) {
                            int[] var93 = field698;
                            int var94 = var5++;
                            int var95 = client.method731(var92);
                            int var96 = var95 >> 11 & 0x3F;
                            var93[var94] = var96;
                            continue;
                        }
                        if (var401 == 2801) {
                            var5--;
                            int var97 = field698[var5];
                            int var403 = var97 - 1;
                            if (var92.field2564 != null && var403 < var92.field2564.length && var92.field2564[var403] != null) {
                                field711[var6++] = var92.field2564[var403];
                                continue;
                            }
                            field711[var6++] = "";
                            continue;
                        }
                        if (var401 == 2802) {
                            if (var92.field2563 == null) {
                                field711[var6++] = "";
                            } else {
                                field711[var6++] = var92.field2563;
                            }
                            continue;
                        }
                    } else if (var401 < 3200) {
                        if (var401 == 3100) {
                            var6--;
                            String var98 = field711[var6];
                            class10.method2659(0, "", var98);
                            continue;
                        }
                        if (var401 == 3101) {
                            var5 -= 2;
                            client.method1853(Statics.field1561, field698[var5], field698[var5 + 1]);
                            continue;
                        }
                        if (var401 == 3103) {
                            client.field294.method2331(179);
                            for (class4 var99 = (class4) client.field414.method3170(); var99 != null; var99 = (class4) client.field414.method3174()) {
                                if (var99.field61 == 0 || var99.field61 == 3) {
                                    client.method1591(var99, true);
                                }
                            }
                            if (client.field391 != null) {
                                client.method2685(client.field391);
                                client.field391 = null;
                            }
                            continue;
                        }
                        if (var401 == 3104) {
                            var6--;
                            String var100 = field711[var6];
                            int var101 = 0;
                            boolean var102 = class196.method2055(var100, 10, true);
                            if (var102) {
                                var101 = class196.method1(var100);
                            }
                            client.field294.method2331(132);
                            client.field294.method2232(var101);
                            continue;
                        }
                        if (var401 == 3105) {
                            var6--;
                            String var103 = field711[var6];
                            client.field294.method2331(199);
                            client.field294.method2278(var103.length() + 1);
                            client.field294.method2275(var103);
                            continue;
                        }
                        if (var401 == 3106) {
                            var6--;
                            String var104 = field711[var6];
                            client.field294.method2331(210);
                            client.field294.method2278(var104.length() + 1);
                            client.field294.method2275(var104);
                            continue;
                        }
                        if (var401 == 3107) {
                            var5--;
                            int var105 = field698[var5];
                            var6--;
                            String var106 = field711[var6];
                            boolean var107 = false;
                            for (int var108 = 0; var108 < client.field373; var108++) {
                                class3 var109 = client.field372[client.field374[var108]];
                                if (var109 != null && var109.field37 != null && var109.field37.equalsIgnoreCase(var106)) {
                                    if (var105 == 1) {
                                        client.field294.method2331(86);
                                        client.field294.method2278(0);
                                        client.field294.method2139(client.field374[var108]);
                                    } else if (var105 == 4) {
                                        client.field294.method2331(236);
                                        client.field294.method2139(client.field374[var108]);
                                        client.field294.method2278(0);
                                    } else if (var105 == 6) {
                                        client.field294.method2331(110);
                                        client.field294.method2170(client.field374[var108]);
                                        client.field294.method2131(0);
                                    } else if (var105 == 7) {
                                        client.field294.method2331(71);
                                        client.field294.method2137(client.field374[var108]);
                                        client.field294.method2278(0);
                                    }
                                    var107 = true;
                                    break;
                                }
                            }
                            if (!var107) {
                                class10.method2659(4, "", class142.field2162 + var106);
                            }
                            continue;
                        }
                        if (var401 == 3108) {
                            var5 -= 3;
                            int var110 = field698[var5];
                            int var111 = field698[var5 + 1];
                            int var112 = field698[var5 + 2];
                            class151 var113 = class151.method2354(var112);
                            client.method2507(var113, var110, var111);
                            continue;
                        }
                        if (var401 == 3109) {
                            var5 -= 2;
                            int var114 = field698[var5];
                            int var115 = field698[var5 + 1];
                            class151 var116 = var41 ? Statics.field67 : Statics.field702;
                            client.method2507(var116, var114, var115);
                            continue;
                        }
                        if (var401 == 3110) {
                            var5--;
                            Statics.field144 = field698[var5] == 1;
                            continue;
                        }
                        if (var401 == 3111) {
                            field698[var5++] = Statics.field559.field141 ? 1 : 0;
                            continue;
                        }
                        if (var401 == 3112) {
                            var5--;
                            Statics.field559.field141 = field698[var5] == 1;
                            class9.method564();
                            continue;
                        }
                        if (var401 == 3113) {
                            var6--;
                            String var117 = field711[var6];
                            var5--;
                            boolean var118 = field698[var5] == 1;
                            class125.method497(var117, var118, false);
                            continue;
                        }
                    } else if (var401 < 3300) {
                        if (var401 == 3200) {
                            var5 -= 3;
                            int var119 = field698[var5];
                            int var120 = field698[var5 + 1];
                            int var121 = field698[var5 + 2];
                            if (client.field342 != 0 && var120 != 0 && client.field489 < 50) {
                                client.field490[client.field489] = var119;
                                client.field491[client.field489] = var120;
                                client.field314[client.field489] = var121;
                                client.field464[client.field489] = null;
                                client.field493[client.field489] = 0;
                                client.field489++;
                            }
                            continue;
                        }
                        if (var401 == 3201) {
                            var5--;
                            int var122 = field698[var5];
                            if (var122 == -1 && !client.field486) {
                                Statics.field2679.method3050();
                                class160.field2683 = 1;
                                Statics.field558 = null;
                            } else if (var122 != -1 && client.field485 != var122 && client.field259 != 0 && !client.field486) {
                                class160.method694(2, Statics.field158, var122, 0, client.field259, false);
                            }
                            client.field485 = var122;
                            continue;
                        }
                        if (var401 == 3202) {
                            var5 -= 2;
                            int var123 = field698[var5];
                            int var10000 = field698[var5 + 1];
                            if (client.field259 != 0 && var123 != -1) {
                                class160.method456(Statics.field1894, var123, 0, client.field259, false);
                                client.field486 = true;
                            }
                            continue;
                        }
                    } else if (var401 < 3400) {
                        if (var401 == 3300) {
                            field698[var5++] = client.field262;
                            continue;
                        }
                        if (var401 == 3301) {
                            var5 -= 2;
                            int var125 = field698[var5];
                            int var126 = field698[var5 + 1];
                            field698[var5++] = Statics.method2452(var125, var126);
                            continue;
                        }
                        if (var401 == 3302) {
                            var5 -= 2;
                            int var127 = field698[var5];
                            int var128 = field698[var5 + 1];
                            int[] var129 = field698;
                            int var130 = var5++;
                            class14 var131 = (class14) class14.field200.method3171((long) var127);
                            int var132;
                            if (var131 == null) {
                                var132 = 0;
                            } else if (var128 >= 0 && var128 < var131.field199.length) {
                                var132 = var131.field199[var128];
                            } else {
                                var132 = 0;
                            }
                            var129[var130] = var132;
                            continue;
                        }
                        if (var401 == 3303) {
                            var5 -= 2;
                            int var133 = field698[var5];
                            int var134 = field698[var5 + 1];
                            int[] var135 = field698;
                            int var136 = var5++;
                            class14 var137 = (class14) class14.field200.method3171((long) var133);
                            int var138;
                            if (var137 == null) {
                                var138 = 0;
                            } else if (var134 == -1) {
                                var138 = 0;
                            } else {
                                int var139 = 0;
                                for (int var140 = 0; var140 < var137.field199.length; var140++) {
                                    if (var137.field203[var140] == var134) {
                                        var139 += var137.field199[var140];
                                    }
                                }
                                var138 = var139;
                            }
                            var135[var136] = var138;
                            continue;
                        }
                        if (var401 == 3304) {
                            var5--;
                            int var141 = field698[var5];
                            field698[var5++] = class44.method457(var141).field985;
                            continue;
                        }
                        if (var401 == 3305) {
                            var5--;
                            int var142 = field698[var5];
                            field698[var5++] = client.field370[var142];
                            continue;
                        }
                        if (var401 == 3306) {
                            var5--;
                            int var143 = field698[var5];
                            field698[var5++] = client.field392[var143];
                            continue;
                        }
                        if (var401 == 3307) {
                            var5--;
                            int var144 = field698[var5];
                            field698[var5++] = client.field393[var144];
                            continue;
                        }
                        if (var401 == 3308) {
                            int var145 = Statics.field72;
                            int var146 = (Statics.field1561.field746 >> 7) + Statics.field966;
                            int var147 = (Statics.field1561.field713 >> 7) + Statics.field1047;
                            field698[var5++] = (var145 << 28) + (var146 << 14) + var147;
                            continue;
                        }
                        if (var401 == 3309) {
                            var5--;
                            int var148 = field698[var5];
                            field698[var5++] = var148 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var401 == 3310) {
                            var5--;
                            int var149 = field698[var5];
                            field698[var5++] = var149 >> 28;
                            continue;
                        }
                        if (var401 == 3311) {
                            var5--;
                            int var150 = field698[var5];
                            field698[var5++] = var150 & 0x3FFF;
                            continue;
                        }
                        if (var401 == 3312) {
                            field698[var5++] = client.field256 ? 1 : 0;
                            continue;
                        }
                        if (var401 == 3313) {
                            var5 -= 2;
                            int var151 = field698[var5] + 32768;
                            int var152 = field698[var5 + 1];
                            field698[var5++] = Statics.method2452(var151, var152);
                            continue;
                        }
                        if (var401 == 3314) {
                            var5 -= 2;
                            int var153 = field698[var5] + 32768;
                            int var154 = field698[var5 + 1];
                            int[] var155 = field698;
                            int var156 = var5++;
                            class14 var157 = (class14) class14.field200.method3171((long) var153);
                            int var158;
                            if (var157 == null) {
                                var158 = 0;
                            } else if (var154 >= 0 && var154 < var157.field199.length) {
                                var158 = var157.field199[var154];
                            } else {
                                var158 = 0;
                            }
                            var155[var156] = var158;
                            continue;
                        }
                        if (var401 == 3315) {
                            var5 -= 2;
                            int var159 = field698[var5] + 32768;
                            int var160 = field698[var5 + 1];
                            int[] var161 = field698;
                            int var162 = var5++;
                            class14 var163 = (class14) class14.field200.method3171((long) var159);
                            int var164;
                            if (var163 == null) {
                                var164 = 0;
                            } else if (var160 == -1) {
                                var164 = 0;
                            } else {
                                int var165 = 0;
                                for (int var166 = 0; var166 < var163.field199.length; var166++) {
                                    if (var163.field203[var166] == var160) {
                                        var165 += var163.field199[var166];
                                    }
                                }
                                var164 = var165;
                            }
                            var161[var162] = var164;
                            continue;
                        }
                        if (var401 == 3316) {
                            if (client.field388 >= 2) {
                                field698[var5++] = client.field388;
                            } else {
                                field698[var5++] = 0;
                            }
                            continue;
                        }
                        if (var401 == 3317) {
                            field698[var5++] = client.field270;
                            continue;
                        }
                        if (var401 == 3318) {
                            field698[var5++] = client.field402;
                            continue;
                        }
                        if (var401 == 3321) {
                            field698[var5++] = client.field404;
                            continue;
                        }
                        if (var401 == 3322) {
                            field698[var5++] = client.field419;
                            continue;
                        }
                        if (var401 == 3323) {
                            if (client.field422) {
                                field698[var5++] = 1;
                            } else {
                                field698[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var401 < 3500) {
                        if (var401 == 3400) {
                            var5 -= 2;
                            int var167 = field698[var5];
                            int var168 = field698[var5 + 1];
                            class43 var169 = (class43) class43.field979.method3145((long) var167);
                            class43 var170;
                            if (var169 == null) {
                                byte[] var171 = Statics.field970.method2704(8, var167);
                                class43 var172 = new class43();
                                if (var171 != null) {
                                    var172.method808(new class107(var171));
                                }
                                class43.field979.method3147(var172, (long) var167);
                                var170 = var172;
                            } else {
                                var170 = var169;
                            }
                            class43 var173 = var170;
                            if (var170.field972 != 's') {
                            }
                            for (int var174 = 0; var174 < var173.field975; var174++) {
                                if (var173.field976[var174] == var168) {
                                    field711[var6++] = var173.field982[var174];
                                    var173 = null;
                                    break;
                                }
                            }
                            if (var173 != null) {
                                field711[var6++] = var173.field980;
                            }
                            continue;
                        }
                        if (var401 == 3408) {
                            var5 -= 4;
                            int var175 = field698[var5];
                            int var176 = field698[var5 + 1];
                            int var177 = field698[var5 + 2];
                            int var178 = field698[var5 + 3];
                            class43 var179 = (class43) class43.field979.method3145((long) var177);
                            class43 var180;
                            if (var179 == null) {
                                byte[] var181 = Statics.field970.method2704(8, var177);
                                class43 var182 = new class43();
                                if (var181 != null) {
                                    var182.method808(new class107(var181));
                                }
                                class43.field979.method3147(var182, (long) var177);
                                var180 = var182;
                            } else {
                                var180 = var179;
                            }
                            class43 var183 = var180;
                            if (var180.field973 == var175 && var180.field972 == var176) {
                                for (int var184 = 0; var184 < var183.field975; var184++) {
                                    if (var183.field976[var184] == var178) {
                                        if (var176 == 115) {
                                            field711[var6++] = var183.field982[var184];
                                        } else {
                                            field698[var5++] = var183.field977[var184];
                                        }
                                        var183 = null;
                                        break;
                                    }
                                }
                                if (var183 != null) {
                                    if (var176 == 115) {
                                        field711[var6++] = var183.field980;
                                    } else {
                                        field698[var5++] = var183.field974;
                                    }
                                }
                                continue;
                            }
                            if (var176 == 115) {
                                field711[var6++] = "null";
                            } else {
                                field698[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var401 < 3700) {
                        if (var401 == 3600) {
                            if (client.field505 == 0) {
                                field698[var5++] = -2;
                            } else if (client.field505 == 1) {
                                field698[var5++] = -1;
                            } else {
                                field698[var5++] = client.field501;
                            }
                            continue;
                        }
                        if (var401 == 3601) {
                            var5--;
                            int var185 = field698[var5];
                            if (client.field505 == 2 && var185 < client.field501) {
                                field711[var6++] = client.field503[var185].field223;
                                continue;
                            }
                            field711[var6++] = "";
                            continue;
                        }
                        if (var401 == 3602) {
                            var5--;
                            int var186 = field698[var5];
                            if (client.field505 == 2 && var186 < client.field501) {
                                field698[var5++] = client.field503[var186].field234;
                                continue;
                            }
                            field698[var5++] = 0;
                            continue;
                        }
                        if (var401 == 3603) {
                            var5--;
                            int var187 = field698[var5];
                            if (client.field505 == 2 && var187 < client.field501) {
                                field698[var5++] = client.field503[var187].field225;
                                continue;
                            }
                            field698[var5++] = 0;
                            continue;
                        }
                        if (var401 == 3604) {
                            var6--;
                            String var188 = field711[var6];
                            var5--;
                            int var189 = field698[var5];
                            client.field294.method2331(34);
                            client.field294.method2278(class107.method71(var188) + 1);
                            client.field294.method2275(var188);
                            client.field294.method2276(var189);
                            continue;
                        }
                        if (var401 == 3605) {
                            var6--;
                            String var190 = field711[var6];
                            client.method1960(var190);
                            continue;
                        }
                        if (var401 == 3606) {
                            var6--;
                            String var191 = field711[var6];
                            client.method2686(var191);
                            continue;
                        }
                        if (var401 == 3607) {
                            var6--;
                            String var192 = field711[var6];
                            client.method155(var192, false);
                            continue;
                        }
                        if (var401 == 3608) {
                            var6--;
                            String var193 = field711[var6];
                            client.method775(var193);
                            continue;
                        }
                        if (var401 == 3609) {
                            var6--;
                            String var194 = field711[var6];
                            if (var194.startsWith(class2.method2678(0)) || var194.startsWith(class2.method2678(1))) {
                                var194 = var194.substring(7);
                            }
                            field698[var5++] = client.method8(var194, false) ? 1 : 0;
                            continue;
                        }
                        if (var401 == 3611) {
                            if (client.field474 == null) {
                                field711[var6++] = "";
                            } else {
                                field711[var6++] = class195.method3430(client.field474);
                            }
                            continue;
                        }
                        if (var401 == 3612) {
                            if (client.field474 == null) {
                                field698[var5++] = 0;
                            } else {
                                field698[var5++] = Statics.field189;
                            }
                            continue;
                        }
                        if (var401 == 3613) {
                            var5--;
                            int var195 = field698[var5];
                            if (client.field474 != null && var195 < Statics.field189) {
                                field711[var6++] = Statics.field177[var195].field557;
                                continue;
                            }
                            field711[var6++] = "";
                            continue;
                        }
                        if (var401 == 3614) {
                            var5--;
                            int var196 = field698[var5];
                            if (client.field474 != null && var196 < Statics.field189) {
                                field698[var5++] = Statics.field177[var196].field554;
                                continue;
                            }
                            field698[var5++] = 0;
                            continue;
                        }
                        if (var401 == 3615) {
                            var5--;
                            int var197 = field698[var5];
                            if (client.field474 != null && var197 < Statics.field189) {
                                field698[var5++] = Statics.field177[var197].field555;
                                continue;
                            }
                            field698[var5++] = 0;
                            continue;
                        }
                        if (var401 == 3616) {
                            field698[var5++] = Statics.field111;
                            continue;
                        }
                        if (var401 == 3617) {
                            var6--;
                            String var198 = field711[var6];
                            client.method1300(var198);
                            continue;
                        }
                        if (var401 == 3618) {
                            field698[var5++] = Statics.field46;
                            continue;
                        }
                        if (var401 == 3619) {
                            var6--;
                            String var199 = field711[var6];
                            if (!var199.equals("")) {
                                client.field294.method2331(235);
                                client.field294.method2278(class107.method71(var199));
                                client.field294.method2275(var199);
                            }
                            continue;
                        }
                        if (var401 == 3620) {
                            client.field294.method2331(235);
                            client.field294.method2278(0);
                            continue;
                        }
                        if (var401 == 3621) {
                            if (client.field505 == 0) {
                                field698[var5++] = -1;
                            } else {
                                field698[var5++] = client.field494;
                            }
                            continue;
                        }
                        if (var401 == 3622) {
                            var5--;
                            int var200 = field698[var5];
                            if (client.field505 != 0 && var200 < client.field494) {
                                field711[var6++] = client.field465[var200].field132;
                                continue;
                            }
                            field711[var6++] = "";
                            continue;
                        }
                        if (var401 == 3623) {
                            var6--;
                            String var201 = field711[var6];
                            if (var201.startsWith(class2.method2678(0)) || var201.startsWith(class2.method2678(1))) {
                                var201 = var201.substring(7);
                            }
                            field698[var5++] = client.method2883(var201) ? 1 : 0;
                            continue;
                        }
                        if (var401 == 3624) {
                            var5--;
                            int var202 = field698[var5];
                            if (Statics.field177 != null && var202 < Statics.field189 && Statics.field177[var202].field557.equalsIgnoreCase(Statics.field1561.field37)) {
                                field698[var5++] = 1;
                                continue;
                            }
                            field698[var5++] = 0;
                            continue;
                        }
                        if (var401 == 3625) {
                            if (client.field356 == null) {
                                field711[var6++] = "";
                            } else {
                                field711[var6++] = class195.method3430(client.field356);
                            }
                            continue;
                        }
                    } else if (var401 < 4100) {
                        if (var401 == 4000) {
                            var5 -= 2;
                            int var203 = field698[var5];
                            int var204 = field698[var5 + 1];
                            field698[var5++] = var203 + var204;
                            continue;
                        }
                        if (var401 == 4001) {
                            var5 -= 2;
                            int var205 = field698[var5];
                            int var206 = field698[var5 + 1];
                            field698[var5++] = var205 - var206;
                            continue;
                        }
                        if (var401 == 4002) {
                            var5 -= 2;
                            int var207 = field698[var5];
                            int var208 = field698[var5 + 1];
                            field698[var5++] = var207 * var208;
                            continue;
                        }
                        if (var401 == 4003) {
                            var5 -= 2;
                            int var209 = field698[var5];
                            int var210 = field698[var5 + 1];
                            field698[var5++] = var209 / var210;
                            continue;
                        }
                        if (var401 == 4004) {
                            var5--;
                            int var211 = field698[var5];
                            field698[var5++] = (int) (Math.random() * (double) var211);
                            continue;
                        }
                        if (var401 == 4005) {
                            var5--;
                            int var212 = field698[var5];
                            field698[var5++] = (int) (Math.random() * (double) (var212 + 1));
                            continue;
                        }
                        if (var401 == 4006) {
                            var5 -= 5;
                            int var213 = field698[var5];
                            int var214 = field698[var5 + 1];
                            int var215 = field698[var5 + 2];
                            int var216 = field698[var5 + 3];
                            int var217 = field698[var5 + 4];
                            field698[var5++] = (var214 - var213) * (var217 - var215) / (var216 - var215) + var213;
                            continue;
                        }
                        if (var401 == 4007) {
                            var5 -= 2;
                            int var218 = field698[var5];
                            int var219 = field698[var5 + 1];
                            field698[var5++] = var218 * var219 / 100 + var218;
                            continue;
                        }
                        if (var401 == 4008) {
                            var5 -= 2;
                            int var220 = field698[var5];
                            int var221 = field698[var5 + 1];
                            field698[var5++] = var220 | 0x1 << var221;
                            continue;
                        }
                        if (var401 == 4009) {
                            var5 -= 2;
                            int var222 = field698[var5];
                            int var223 = field698[var5 + 1];
                            field698[var5++] = var222 & -1 - (0x1 << var223);
                            continue;
                        }
                        if (var401 == 4010) {
                            var5 -= 2;
                            int var224 = field698[var5];
                            int var225 = field698[var5 + 1];
                            field698[var5++] = (var224 & 0x1 << var225) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var401 == 4011) {
                            var5 -= 2;
                            int var226 = field698[var5];
                            int var227 = field698[var5 + 1];
                            field698[var5++] = var226 % var227;
                            continue;
                        }
                        if (var401 == 4012) {
                            var5 -= 2;
                            int var228 = field698[var5];
                            int var229 = field698[var5 + 1];
                            if (var228 == 0) {
                                field698[var5++] = 0;
                            } else {
                                field698[var5++] = (int) Math.pow((double) var228, (double) var229);
                            }
                            continue;
                        }
                        if (var401 == 4013) {
                            var5 -= 2;
                            int var230 = field698[var5];
                            int var231 = field698[var5 + 1];
                            if (var230 == 0) {
                                field698[var5++] = 0;
                            } else if (var231 == 0) {
                                field698[var5++] = Integer.MAX_VALUE;
                            } else {
                                field698[var5++] = (int) Math.pow((double) var230, 1.0D / (double) var231);
                            }
                            continue;
                        }
                        if (var401 == 4014) {
                            var5 -= 2;
                            int var232 = field698[var5];
                            int var233 = field698[var5 + 1];
                            field698[var5++] = var232 & var233;
                            continue;
                        }
                        if (var401 == 4015) {
                            var5 -= 2;
                            int var234 = field698[var5];
                            int var235 = field698[var5 + 1];
                            field698[var5++] = var234 | var235;
                            continue;
                        }
                    } else if (var401 < 4200) {
                        if (var401 == 4100) {
                            var6--;
                            String var236 = field711[var6];
                            var5--;
                            int var237 = field698[var5];
                            field711[var6++] = var236 + var237;
                            continue;
                        }
                        if (var401 == 4101) {
                            var6 -= 2;
                            String var238 = field711[var6];
                            String var239 = field711[var6 + 1];
                            field711[var6++] = var238 + var239;
                            continue;
                        }
                        if (var401 == 4102) {
                            var6--;
                            String var240 = field711[var6];
                            var5--;
                            int var241 = field698[var5];
                            String[] var242 = field711;
                            int var243 = var6++;
                            String var245;
                            if (var241 < 0) {
                                var245 = Integer.toString(var241);
                            } else {
                                int var246 = var241;
                                String var247;
                                if (var241 < 0) {
                                    var247 = Integer.toString(var241, 10);
                                } else {
                                    int var248 = 2;
                                    int var249 = var241 / 10;
                                    while (var249 != 0) {
                                        var249 /= 10;
                                        var248++;
                                    }
                                    char[] var250 = new char[var248];
                                    var250[0] = '+';
                                    for (int var251 = var248 - 1; var251 > 0; var251--) {
                                        int var252 = var246;
                                        var246 /= 10;
                                        int var253 = var252 - var246 * 10;
                                        if (var253 >= 10) {
                                            var250[var251] = (char) (var253 + 87);
                                        } else {
                                            var250[var251] = (char) (var253 + 48);
                                        }
                                    }
                                    var247 = new String(var250);
                                }
                                var245 = var247;
                            }
                            var242[var243] = var240 + var245;
                            continue;
                        }
                        if (var401 == 4103) {
                            var6--;
                            String var254 = field711[var6];
                            field711[var6++] = var254.toLowerCase();
                            continue;
                        }
                        if (var401 == 4104) {
                            var5--;
                            int var255 = field698[var5];
                            long var256 = ((long) var255 + 11745L) * 86400000L;
                            field703.setTime(new Date(var256));
                            int var258 = field703.get(5);
                            int var259 = field703.get(2);
                            int var260 = field703.get(1);
                            field711[var6++] = var258 + "-" + field704[var259] + "-" + var260;
                            continue;
                        }
                        if (var401 == 4105) {
                            var6 -= 2;
                            String var261 = field711[var6];
                            String var262 = field711[var6 + 1];
                            if (Statics.field1561.field38 != null && Statics.field1561.field38.field2641) {
                                field711[var6++] = var262;
                                continue;
                            }
                            field711[var6++] = var261;
                            continue;
                        }
                        if (var401 == 4106) {
                            var5--;
                            int var263 = field698[var5];
                            field711[var6++] = Integer.toString(var263);
                            continue;
                        }
                        if (var401 == 4107) {
                            var6 -= 2;
                            int[] var264 = field698;
                            int var265 = var5++;
                            String var266 = field711[var6];
                            String var267 = field711[var6 + 1];
                            int var268 = client.field497;
                            int var269 = var266.length();
                            int var270 = var267.length();
                            int var271 = 0;
                            int var272 = 0;
                            char var273 = 0;
                            char var274 = 0;
                            int var275;
                            label2373: while (true) {
                                if (var271 - var273 >= var269 && var272 - var274 >= var270) {
                                    int var284 = Math.min(var269, var270);
                                    for (int var285 = 0; var285 < var284; var285++) {
                                        char var288 = var266.charAt(var285);
                                        char var289 = var267.charAt(var285);
                                        if (var288 != var289 && Character.toUpperCase(var288) != Character.toUpperCase(var289)) {
                                            char var290 = Character.toLowerCase(var288);
                                            char var291 = Character.toLowerCase(var289);
                                            if (var290 != var291) {
                                                var275 = class199.method141(var290, var268) - class199.method141(var291, var268);
                                                break label2373;
                                            }
                                        }
                                    }
                                    int var292 = var269 - var270;
                                    if (var292 == 0) {
                                        for (int var293 = 0; var293 < var284; var293++) {
                                            char var294 = var266.charAt(var293);
                                            char var295 = var267.charAt(var293);
                                            if (var294 != var295) {
                                                var275 = class199.method141(var294, var268) - class199.method141(var295, var268);
                                                break label2373;
                                            }
                                        }
                                        var275 = 0;
                                    } else {
                                        var275 = var292;
                                    }
                                    break;
                                }
                                if (var271 - var273 >= var269) {
                                    var275 = -1;
                                    break;
                                }
                                if (var272 - var274 >= var270) {
                                    var275 = 1;
                                    break;
                                }
                                char var276;
                                if (var273 == 0) {
                                    var276 = var266.charAt(var271++);
                                } else {
                                    var276 = var273;
                                    boolean var277 = false;
                                }
                                char var278;
                                if (var274 == 0) {
                                    var278 = var267.charAt(var272++);
                                } else {
                                    var278 = var274;
                                    boolean var279 = false;
                                }
                                var273 = class199.method2700(var276);
                                var274 = class199.method2700(var278);
                                char var280 = class199.method2541(var276, var268);
                                char var281 = class199.method2541(var278, var268);
                                if (var280 != var281 && Character.toUpperCase(var280) != Character.toUpperCase(var281)) {
                                    char var282 = Character.toLowerCase(var280);
                                    char var283 = Character.toLowerCase(var281);
                                    if (var282 != var283) {
                                        var275 = class199.method141(var282, var268) - class199.method141(var283, var268);
                                        break;
                                    }
                                }
                            }
                            byte var297;
                            if (var275 > 0) {
                                var297 = 1;
                            } else if (var275 < 0) {
                                var297 = -1;
                            } else {
                                var297 = 0;
                            }
                            var264[var265] = var297;
                            continue;
                        }
                        if (var401 == 4108) {
                            var6--;
                            String var298 = field711[var6];
                            var5 -= 2;
                            int var299 = field698[var5];
                            int var300 = field698[var5 + 1];
                            byte[] var301 = Statics.field5.method2704(var300, 0);
                            class190 var302 = new class190(var301);
                            field698[var5++] = var302.method3301(var298, var299);
                            continue;
                        }
                        if (var401 == 4109) {
                            var6--;
                            String var303 = field711[var6];
                            var5 -= 2;
                            int var304 = field698[var5];
                            int var305 = field698[var5 + 1];
                            byte[] var306 = Statics.field5.method2704(var305, 0);
                            class190 var307 = new class190(var306);
                            field698[var5++] = var307.method3300(var303, var304);
                            continue;
                        }
                        if (var401 == 4110) {
                            var6 -= 2;
                            String var308 = field711[var6];
                            String var309 = field711[var6 + 1];
                            var5--;
                            if (field698[var5] == 1) {
                                field711[var6++] = var308;
                            } else {
                                field711[var6++] = var309;
                            }
                            continue;
                        }
                        if (var401 == 4111) {
                            var6--;
                            String var310 = field711[var6];
                            field711[var6++] = class189.method3302(var310);
                            continue;
                        }
                        if (var401 == 4112) {
                            var6--;
                            String var311 = field711[var6];
                            var5--;
                            int var312 = field698[var5];
                            field711[var6++] = var311 + (char) var312;
                            continue;
                        }
                        if (var401 == 4113) {
                            var5--;
                            int var313 = field698[var5];
                            int[] var314 = field698;
                            int var315 = var5++;
                            char var316 = (char) var313;
                            boolean var317;
                            if (var316 >= ' ' && var316 <= '~') {
                                var317 = true;
                            } else if (var316 >= 160 && var316 <= 255) {
                                var317 = true;
                            } else if (var316 == 8364 || var316 == 338 || var316 == 8212 || var316 == 339 || var316 == 376) {
                                var317 = true;
                            } else {
                                var317 = false;
                            }
                            var314[var315] = var317 ? 1 : 0;
                            continue;
                        }
                        if (var401 == 4114) {
                            var5--;
                            int var318 = field698[var5];
                            field698[var5++] = class196.method840((char) var318) ? 1 : 0;
                            continue;
                        }
                        if (var401 == 4115) {
                            var5--;
                            int var319 = field698[var5];
                            int[] var320 = field698;
                            int var321 = var5++;
                            char var322 = (char) var319;
                            boolean var323 = var322 >= 'A' && var322 <= 'Z' || var322 >= 'a' && var322 <= 'z';
                            var320[var321] = var323 ? 1 : 0;
                            continue;
                        }
                        if (var401 == 4116) {
                            var5--;
                            int var324 = field698[var5];
                            field698[var5++] = class196.method2396((char) var324) ? 1 : 0;
                            continue;
                        }
                        if (var401 == 4117) {
                            var6--;
                            String var325 = field711[var6];
                            if (var325 == null) {
                                field698[var5++] = 0;
                            } else {
                                field698[var5++] = var325.length();
                            }
                            continue;
                        }
                        if (var401 == 4118) {
                            var6--;
                            String var326 = field711[var6];
                            var5 -= 2;
                            int var327 = field698[var5];
                            int var328 = field698[var5 + 1];
                            field711[var6++] = var326.substring(var327, var328);
                            continue;
                        }
                        if (var401 == 4119) {
                            var6--;
                            String var329 = field711[var6];
                            StringBuilder var330 = new StringBuilder(var329.length());
                            boolean var331 = false;
                            for (int var332 = 0; var332 < var329.length(); var332++) {
                                char var333 = var329.charAt(var332);
                                if (var333 == '<') {
                                    var331 = true;
                                } else if (var333 == '>') {
                                    var331 = false;
                                } else if (!var331) {
                                    var330.append(var333);
                                }
                            }
                            field711[var6++] = var330.toString();
                            continue;
                        }
                        if (var401 == 4120) {
                            var6--;
                            String var334 = field711[var6];
                            var5--;
                            int var335 = field698[var5];
                            field698[var5++] = var334.indexOf(var335);
                            continue;
                        }
                        if (var401 == 4121) {
                            var6 -= 2;
                            String var336 = field711[var6];
                            String var337 = field711[var6 + 1];
                            var5--;
                            int var338 = field698[var5];
                            field698[var5++] = var336.indexOf(var337, var338);
                            continue;
                        }
                    } else if (var401 < 4300) {
                        if (var401 == 4200) {
                            var5--;
                            int var339 = field698[var5];
                            field711[var6++] = class45.method148(var339).field1001;
                            continue;
                        }
                        if (var401 == 4201) {
                            var5 -= 2;
                            int var340 = field698[var5];
                            int var341 = field698[var5 + 1];
                            class45 var342 = class45.method148(var340);
                            if (var341 >= 1 && var341 <= 5 && var342.field997[var341 - 1] != null) {
                                field711[var6++] = var342.field997[var341 - 1];
                                continue;
                            }
                            field711[var6++] = "";
                            continue;
                        }
                        if (var401 == 4202) {
                            var5 -= 2;
                            int var343 = field698[var5];
                            int var344 = field698[var5 + 1];
                            class45 var345 = class45.method148(var343);
                            if (var344 >= 1 && var344 <= 5 && var345.field1016[var344 - 1] != null) {
                                field711[var6++] = var345.field1016[var344 - 1];
                                continue;
                            }
                            field711[var6++] = "";
                            continue;
                        }
                        if (var401 == 4203) {
                            var5--;
                            int var346 = field698[var5];
                            field698[var5++] = class45.method148(var346).field1013;
                            continue;
                        }
                        if (var401 == 4204) {
                            var5--;
                            int var347 = field698[var5];
                            field698[var5++] = class45.method148(var347).field994 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var401 == 4205) {
                            var5--;
                            int var348 = field698[var5];
                            class45 var349 = class45.method148(var348);
                            if (var349.field1032 == -1 && var349.field1031 >= 0) {
                                field698[var5++] = var349.field1031;
                                continue;
                            }
                            field698[var5++] = var348;
                            continue;
                        }
                        if (var401 == 4206) {
                            var5--;
                            int var350 = field698[var5];
                            class45 var351 = class45.method148(var350);
                            if (var351.field1032 >= 0 && var351.field1031 >= 0) {
                                field698[var5++] = var351.field1031;
                                continue;
                            }
                            field698[var5++] = var350;
                            continue;
                        }
                        if (var401 == 4207) {
                            var5--;
                            int var352 = field698[var5];
                            field698[var5++] = class45.method148(var352).field1040 ? 1 : 0;
                            continue;
                        }
                    } else if (var401 < 5100) {
                        if (var401 == 5000) {
                            field698[var5++] = client.field466;
                            continue;
                        }
                        if (var401 == 5001) {
                            var5 -= 3;
                            client.field466 = field698[var5];
                            Statics.field968 = class117.method15(field698[var5 + 1]);
                            if (Statics.field968 == null) {
                                Statics.field968 = class117.field1904;
                            }
                            client.field274 = field698[var5 + 2];
                            client.field294.method2331(87);
                            client.field294.method2278(client.field466);
                            client.field294.method2278(Statics.field968.field1913);
                            client.field294.method2278(client.field274);
                            continue;
                        }
                        if (var401 == 5002) {
                            var6--;
                            String var353 = field711[var6];
                            var5 -= 2;
                            int var354 = field698[var5];
                            int var355 = field698[var5 + 1];
                            client.field294.method2331(246);
                            client.field294.method2278(class107.method71(var353) + 2);
                            client.field294.method2275(var353);
                            client.field294.method2278(var354 - 1);
                            client.field294.method2278(var355);
                            continue;
                        }
                        if (var401 == 5003) {
                            var5 -= 2;
                            int var356 = field698[var5];
                            int var357 = field698[var5 + 1];
                            class31 var358 = Statics.method544(var356, var357);
                            if (var358 == null) {
                                field698[var5++] = -1;
                                field698[var5++] = 0;
                                field711[var6++] = "";
                                field711[var6++] = "";
                                field711[var6++] = "";
                            } else {
                                field698[var5++] = var358.field688;
                                field698[var5++] = var358.field683;
                                field711[var6++] = var358.field685 == null ? "" : var358.field685;
                                field711[var6++] = var358.field686 == null ? "" : var358.field686;
                                field711[var6++] = var358.field687 == null ? "" : var358.field687;
                            }
                            continue;
                        }
                        if (var401 == 5004) {
                            var5--;
                            int var359 = field698[var5];
                            class31 var360 = (class31) class10.field150.method3190((long) var359);
                            if (var360 == null) {
                                field698[var5++] = -1;
                                field698[var5++] = 0;
                                field711[var6++] = "";
                                field711[var6++] = "";
                                field711[var6++] = "";
                            } else {
                                field698[var5++] = var360.field691;
                                field698[var5++] = var360.field683;
                                field711[var6++] = var360.field685 == null ? "" : var360.field685;
                                field711[var6++] = var360.field686 == null ? "" : var360.field686;
                                field711[var6++] = var360.field687 == null ? "" : var360.field687;
                            }
                            continue;
                        }
                        if (var401 == 5005) {
                            if (Statics.field968 == null) {
                                field698[var5++] = -1;
                            } else {
                                field698[var5++] = Statics.field968.field1913;
                            }
                            continue;
                        }
                        if (var401 == 5008) {
                            var6--;
                            String var362 = field711[var6];
                            var5--;
                            int var363 = field698[var5];
                            String var364 = var362.toLowerCase();
                            byte var365 = 0;
                            if (var364.startsWith(class142.field2316)) {
                                var365 = 0;
                                var362 = var362.substring(class142.field2316.length());
                            } else if (var364.startsWith(class142.field2340)) {
                                var365 = 1;
                                var362 = var362.substring(class142.field2340.length());
                            } else if (var364.startsWith(class142.field2320)) {
                                var365 = 2;
                                var362 = var362.substring(class142.field2320.length());
                            } else if (var364.startsWith(class142.field2322)) {
                                var365 = 3;
                                var362 = var362.substring(class142.field2322.length());
                            } else if (var364.startsWith(class142.field2324)) {
                                var365 = 4;
                                var362 = var362.substring(class142.field2324.length());
                            } else if (var364.startsWith(class142.field2326)) {
                                var365 = 5;
                                var362 = var362.substring(class142.field2326.length());
                            } else if (var364.startsWith(class142.field2170)) {
                                var365 = 6;
                                var362 = var362.substring(class142.field2170.length());
                            } else if (var364.startsWith(class142.field2201)) {
                                var365 = 7;
                                var362 = var362.substring(class142.field2201.length());
                            } else if (var364.startsWith(class142.field2332)) {
                                var365 = 8;
                                var362 = var362.substring(class142.field2332.length());
                            } else if (var364.startsWith(class142.field2334)) {
                                var365 = 9;
                                var362 = var362.substring(class142.field2334.length());
                            } else if (var364.startsWith(class142.field2336)) {
                                var365 = 10;
                                var362 = var362.substring(class142.field2336.length());
                            } else if (var364.startsWith(class142.field2338)) {
                                var365 = 11;
                                var362 = var362.substring(class142.field2338.length());
                            } else if (client.field497 != 0) {
                                if (var364.startsWith(class142.field2317)) {
                                    var365 = 0;
                                    var362 = var362.substring(class142.field2317.length());
                                } else if (var364.startsWith(class142.field2319)) {
                                    var365 = 1;
                                    var362 = var362.substring(class142.field2319.length());
                                } else if (var364.startsWith(class142.field2381)) {
                                    var365 = 2;
                                    var362 = var362.substring(class142.field2381.length());
                                } else if (var364.startsWith(class142.field2323)) {
                                    var365 = 3;
                                    var362 = var362.substring(class142.field2323.length());
                                } else if (var364.startsWith(class142.field2325)) {
                                    var365 = 4;
                                    var362 = var362.substring(class142.field2325.length());
                                } else if (var364.startsWith(class142.field2346)) {
                                    var365 = 5;
                                    var362 = var362.substring(class142.field2346.length());
                                } else if (var364.startsWith(class142.field2193)) {
                                    var365 = 6;
                                    var362 = var362.substring(class142.field2193.length());
                                } else if (var364.startsWith(class142.field2331)) {
                                    var365 = 7;
                                    var362 = var362.substring(class142.field2331.length());
                                } else if (var364.startsWith(class142.field2272)) {
                                    var365 = 8;
                                    var362 = var362.substring(class142.field2272.length());
                                } else if (var364.startsWith(class142.field2335)) {
                                    var365 = 9;
                                    var362 = var362.substring(class142.field2335.length());
                                } else if (var364.startsWith(class142.field2197)) {
                                    var365 = 10;
                                    var362 = var362.substring(class142.field2197.length());
                                } else if (var364.startsWith(class142.field2158)) {
                                    var365 = 11;
                                    var362 = var362.substring(class142.field2158.length());
                                }
                            }
                            String var366 = var362.toLowerCase();
                            byte var367 = 0;
                            if (var366.startsWith(class142.field2318)) {
                                var367 = 1;
                                var362 = var362.substring(class142.field2318.length());
                            } else if (var366.startsWith(class142.field2342)) {
                                var367 = 2;
                                var362 = var362.substring(class142.field2342.length());
                            } else if (var366.startsWith(class142.field2265)) {
                                var367 = 3;
                                var362 = var362.substring(class142.field2265.length());
                            } else if (var366.startsWith(class142.field2243)) {
                                var367 = 4;
                                var362 = var362.substring(class142.field2243.length());
                            } else if (var366.startsWith(class142.field2348)) {
                                var367 = 5;
                                var362 = var362.substring(class142.field2348.length());
                            } else if (client.field497 != 0) {
                                if (var366.startsWith(class142.field2341)) {
                                    var367 = 1;
                                    var362 = var362.substring(class142.field2341.length());
                                } else if (var366.startsWith(class142.field2327)) {
                                    var367 = 2;
                                    var362 = var362.substring(class142.field2327.length());
                                } else if (var366.startsWith(class142.field2345)) {
                                    var367 = 3;
                                    var362 = var362.substring(class142.field2345.length());
                                } else if (var366.startsWith(class142.field2370)) {
                                    var367 = 4;
                                    var362 = var362.substring(class142.field2370.length());
                                } else if (var366.startsWith(class142.field2349)) {
                                    var367 = 5;
                                    var362 = var362.substring(class142.field2349.length());
                                }
                            }
                            client.field294.method2331(13);
                            client.field294.method2278(0);
                            int var368 = client.field294.field1854;
                            client.field294.method2278(var363);
                            client.field294.method2278(var365);
                            client.field294.method2278(var367);
                            class110 var369 = client.field294;
                            int var370 = var369.field1854;
                            int var371 = var362.length();
                            byte[] var372 = new byte[var371];
                            for (int var373 = 0; var373 < var371; var373++) {
                                char var374 = var362.charAt(var373);
                                if (!(var374 <= 0 || var374 >= 128) || !(var374 < 160 || var374 > 255)) {
                                    var372[var373] = (byte) var374;
                                } else if (var374 == 8364) {
                                    var372[var373] = -128;
                                } else if (var374 == 8218) {
                                    var372[var373] = -126;
                                } else if (var374 == 402) {
                                    var372[var373] = -125;
                                } else if (var374 == 8222) {
                                    var372[var373] = -124;
                                } else if (var374 == 8230) {
                                    var372[var373] = -123;
                                } else if (var374 == 8224) {
                                    var372[var373] = -122;
                                } else if (var374 == 8225) {
                                    var372[var373] = -121;
                                } else if (var374 == 710) {
                                    var372[var373] = -120;
                                } else if (var374 == 8240) {
                                    var372[var373] = -119;
                                } else if (var374 == 352) {
                                    var372[var373] = -118;
                                } else if (var374 == 8249) {
                                    var372[var373] = -117;
                                } else if (var374 == 338) {
                                    var372[var373] = -116;
                                } else if (var374 == 381) {
                                    var372[var373] = -114;
                                } else if (var374 == 8216) {
                                    var372[var373] = -111;
                                } else if (var374 == 8217) {
                                    var372[var373] = -110;
                                } else if (var374 == 8220) {
                                    var372[var373] = -109;
                                } else if (var374 == 8221) {
                                    var372[var373] = -108;
                                } else if (var374 == 8226) {
                                    var372[var373] = -107;
                                } else if (var374 == 8211) {
                                    var372[var373] = -106;
                                } else if (var374 == 8212) {
                                    var372[var373] = -105;
                                } else if (var374 == 732) {
                                    var372[var373] = -104;
                                } else if (var374 == 8482) {
                                    var372[var373] = -103;
                                } else if (var374 == 353) {
                                    var372[var373] = -102;
                                } else if (var374 == 8250) {
                                    var372[var373] = -101;
                                } else if (var374 == 339) {
                                    var372[var373] = -100;
                                } else if (var374 == 382) {
                                    var372[var373] = -98;
                                } else if (var374 == 376) {
                                    var372[var373] = -97;
                                } else {
                                    var372[var373] = 63;
                                }
                            }
                            var369.method2107(var372.length);
                            var369.field1854 += Statics.field2857.method2041(var372, 0, var372.length, var369.field1856, var369.field1854);
                            client.field294.method2106(client.field294.field1854 - var368);
                            continue;
                        }
                        if (var401 == 5009) {
                            var6 -= 2;
                            String var377 = field711[var6];
                            String var378 = field711[var6 + 1];
                            client.field294.method2331(20);
                            client.field294.method2096(0);
                            int var379 = client.field294.field1854;
                            client.field294.method2275(var377);
                            class110 var380 = client.field294;
                            int var381 = var380.field1854;
                            int var382 = var378.length();
                            byte[] var383 = new byte[var382];
                            for (int var384 = 0; var384 < var382; var384++) {
                                char var385 = var378.charAt(var384);
                                if (!(var385 <= 0 || var385 >= 128) || !(var385 < 160 || var385 > 255)) {
                                    var383[var384] = (byte) var385;
                                } else if (var385 == 8364) {
                                    var383[var384] = -128;
                                } else if (var385 == 8218) {
                                    var383[var384] = -126;
                                } else if (var385 == 402) {
                                    var383[var384] = -125;
                                } else if (var385 == 8222) {
                                    var383[var384] = -124;
                                } else if (var385 == 8230) {
                                    var383[var384] = -123;
                                } else if (var385 == 8224) {
                                    var383[var384] = -122;
                                } else if (var385 == 8225) {
                                    var383[var384] = -121;
                                } else if (var385 == 710) {
                                    var383[var384] = -120;
                                } else if (var385 == 8240) {
                                    var383[var384] = -119;
                                } else if (var385 == 352) {
                                    var383[var384] = -118;
                                } else if (var385 == 8249) {
                                    var383[var384] = -117;
                                } else if (var385 == 338) {
                                    var383[var384] = -116;
                                } else if (var385 == 381) {
                                    var383[var384] = -114;
                                } else if (var385 == 8216) {
                                    var383[var384] = -111;
                                } else if (var385 == 8217) {
                                    var383[var384] = -110;
                                } else if (var385 == 8220) {
                                    var383[var384] = -109;
                                } else if (var385 == 8221) {
                                    var383[var384] = -108;
                                } else if (var385 == 8226) {
                                    var383[var384] = -107;
                                } else if (var385 == 8211) {
                                    var383[var384] = -106;
                                } else if (var385 == 8212) {
                                    var383[var384] = -105;
                                } else if (var385 == 732) {
                                    var383[var384] = -104;
                                } else if (var385 == 8482) {
                                    var383[var384] = -103;
                                } else if (var385 == 353) {
                                    var383[var384] = -102;
                                } else if (var385 == 8250) {
                                    var383[var384] = -101;
                                } else if (var385 == 339) {
                                    var383[var384] = -100;
                                } else if (var385 == 382) {
                                    var383[var384] = -98;
                                } else if (var385 == 376) {
                                    var383[var384] = -97;
                                } else {
                                    var383[var384] = 63;
                                }
                            }
                            var380.method2107(var383.length);
                            var380.field1854 += Statics.field2857.method2041(var383, 0, var383.length, var380.field1856, var380.field1854);
                            client.field294.method2105(client.field294.field1854 - var379);
                            continue;
                        }
                        if (var401 == 5015) {
                            String var388;
                            if (Statics.field1561 == null || Statics.field1561.field37 == null) {
                                var388 = "";
                            } else {
                                var388 = Statics.field1561.field37;
                            }
                            field711[var6++] = var388;
                            continue;
                        }
                        if (var401 == 5016) {
                            field698[var5++] = client.field274;
                            continue;
                        }
                        if (var401 == 5017) {
                            var5--;
                            int var389 = field698[var5];
                            int[] var390 = field698;
                            int var391 = var5++;
                            class24 var392 = (class24) class10.field152.get(var389);
                            int var393;
                            if (var392 == null) {
                                var393 = 0;
                            } else {
                                var393 = var392.method485();
                            }
                            var390[var391] = var393;
                            continue;
                        }
                        if (var401 == 5018) {
                            var5--;
                            int var394 = field698[var5];
                            field698[var5++] = class10.method1871(var394);
                            continue;
                        }
                        if (var401 == 5019) {
                            var5--;
                            int var395 = field698[var5];
                            field698[var5++] = class10.method1593(var395);
                            continue;
                        }
                        if (var401 == 5020) {
                            var6--;
                            String var396 = field711[var6];
                            client.method23(var396);
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var400) {
            StringBuilder var398 = new StringBuilder(30);
            var398.append("").append(var4.field2830).append(" ");
            for (int var399 = field707 - 1; var399 >= 0; var399--) {
                var398.append("").append(field701[var399].field198.field2830).append(" ");
            }
            var398.append("").append(var10);
            class135.method583(var398.toString(), var400);
        }
    }

    @ObfuscatedName("w.k(II)V")
    public static void method99(int arg0) {
        if (arg0 == -1 || !class151.method2456(arg0)) {
            return;
        }
        class151[] var1 = Statics.field2616[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class151 var3 = var1[var2];
            if (var3.field2524 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field1 = var3.field2524;
                method25(var4, 2000000);
            }
        }
    }
}
