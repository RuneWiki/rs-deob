package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("p")
public class class25 {

    @ObfuscatedName("p.m")
    public static int[] field391 = new int[5];

    @ObfuscatedName("p.n")
    public static int[][] field403 = new int[5][5000];

    @ObfuscatedName("p.q")
    public static int[] field393 = new int[1000];

    @ObfuscatedName("p.a")
    public static String[] field394 = new String[1000];

    @ObfuscatedName("p.g")
    public static int field388 = 0;

    @ObfuscatedName("p.j")
    public static class17[] field396 = new class17[50];

    @ObfuscatedName("p.z")
    public static Calendar field397 = Calendar.getInstance();

    @ObfuscatedName("p.e")
    public static final String[] field405 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class25() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.u(Lu;S)V")
    public static void method2220(class1 arg0) {
        Object[] var1 = arg0.field7;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method1475(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field68;
        int[] var8 = var3.field65;
        byte var9 = -1;
        field388 = 0;
        try {
            Statics.field389 = new int[var3.field64];
            int var10 = 0;
            Statics.field398 = new String[var3.field69];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field3;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field4;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field15 == null ? -1 : arg0.field15.field2558;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field5;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field15 == null ? -1 : arg0.field15.field2568;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field1 == null ? -1 : arg0.field1.field2558;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field1 == null ? -1 : arg0.field1.field2568;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field10;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field8;
                    }
                    Statics.field389[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field9;
                    }
                    Statics.field398[var11++] = var14;
                }
            }
            int var15 = 0;
            label2362: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var368 = var7[var6];
                if (var368 < 100) {
                    if (var368 == 0) {
                        field393[var4++] = var8[var6];
                        continue;
                    }
                    if (var368 == 1) {
                        int var16 = var8[var6];
                        field393[var4++] = class158.field2687[var16];
                        continue;
                    }
                    if (var368 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class158.field2687[var17] = field393[var4];
                        continue;
                    }
                    if (var368 == 3) {
                        field394[var5++] = var3.field67[var6];
                        continue;
                    }
                    if (var368 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var368 == 7) {
                        var4 -= 2;
                        if (field393[var4 + 1] != field393[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 8) {
                        var4 -= 2;
                        if (field393[var4 + 1] == field393[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 9) {
                        var4 -= 2;
                        if (field393[var4] < field393[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 10) {
                        var4 -= 2;
                        if (field393[var4] > field393[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 21) {
                        if (field388 == 0) {
                            return;
                        }
                        class17 var18 = field396[--field388];
                        var3 = var18.field269;
                        var7 = var3.field68;
                        var8 = var3.field65;
                        var6 = var18.field267;
                        Statics.field389 = var18.field268;
                        Statics.field398 = var18.field270;
                        continue;
                    }
                    if (var368 == 25) {
                        int var19 = var8[var6];
                        field393[var4++] = class158.method3077(var19);
                        continue;
                    }
                    if (var368 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        class158.method804(var20, field393[var4]);
                        continue;
                    }
                    if (var368 == 31) {
                        var4 -= 2;
                        if (field393[var4] <= field393[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 32) {
                        var4 -= 2;
                        if (field393[var4] >= field393[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 33) {
                        field393[var4++] = Statics.field389[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var368 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field389[var10001] = field393[var4];
                        continue;
                    }
                    if (var368 == 35) {
                        field394[var5++] = Statics.field398[var8[var6]];
                        continue;
                    }
                    if (var368 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field398[var10001] = field394[var5];
                        continue;
                    }
                    if (var368 == 37) {
                        int var21 = var8[var6];
                        var5 -= var21;
                        String var22 = class146.method1532(field394, var5, var21);
                        field394[var5++] = var22;
                        continue;
                    }
                    if (var368 == 38) {
                        var4--;
                        continue;
                    }
                    if (var368 == 39) {
                        var5--;
                        continue;
                    }
                    if (var368 == 40) {
                        int var23 = var8[var6];
                        class5 var24 = class5.method1475(var23);
                        int[] var25 = new int[var24.field64];
                        String[] var26 = new String[var24.field69];
                        for (int var27 = 0; var27 < var24.field70; var27++) {
                            var25[var27] = field393[var4 - var24.field70 + var27];
                        }
                        for (int var28 = 0; var28 < var24.field71; var28++) {
                            var26[var28] = field394[var5 - var24.field71 + var28];
                        }
                        var4 -= var24.field70;
                        var5 -= var24.field71;
                        class17 var29 = new class17();
                        var29.field269 = var3;
                        var29.field267 = var6;
                        var29.field268 = Statics.field389;
                        var29.field270 = Statics.field398;
                        field396[++field388 - 1] = var29;
                        var3 = var24;
                        var7 = var24.field68;
                        var8 = var24.field65;
                        var6 = -1;
                        Statics.field389 = var25;
                        Statics.field398 = var26;
                        continue;
                    }
                    if (var368 == 42) {
                        field393[var4++] = client.field701[var8[var6]];
                        continue;
                    }
                    if (var368 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field701[var10001] = field393[var4];
                        continue;
                    }
                    if (var368 == 44) {
                        int var30 = var8[var6] >> 16;
                        int var31 = var8[var6] & 0xFFFF;
                        var4--;
                        int var32 = field393[var4];
                        if (var32 >= 0 && var32 <= 5000) {
                            field391[var30] = var32;
                            byte var33 = -1;
                            if (var31 == 105) {
                                var33 = 0;
                            }
                            int var34 = 0;
                            while (true) {
                                if (var34 >= var32) {
                                    continue label2362;
                                }
                                field403[var30][var34] = var33;
                                var34++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var368 == 45) {
                        int var35 = var8[var6];
                        var4--;
                        int var36 = field393[var4];
                        if (var36 >= 0 && var36 < field391[var35]) {
                            field393[var4++] = field403[var35][var36];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var368 == 46) {
                        int var37 = var8[var6];
                        var4 -= 2;
                        int var38 = field393[var4];
                        if (var38 >= 0 && var38 < field391[var37]) {
                            field403[var37][var38] = field393[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var368 == 47) {
                        String var39 = client.field661[var8[var6]];
                        if (var39 == null) {
                            var39 = "null";
                        }
                        field394[var5++] = var39;
                        continue;
                    }
                    if (var368 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field661[var10001] = field394[var5];
                        continue;
                    }
                }
                boolean var40;
                if (var8[var6] == 1) {
                    var40 = true;
                } else {
                    var40 = false;
                }
                if (var368 < 1000) {
                    if (var368 == 100) {
                        var4 -= 3;
                        int var41 = field393[var4];
                        int var42 = field393[var4 + 1];
                        int var43 = field393[var4 + 2];
                        if (var42 == 0) {
                            throw new RuntimeException();
                        }
                        class157 var44 = class157.method2230(var41);
                        if (var44.field2571 == null) {
                            var44.field2571 = new class157[var43 + 1];
                        }
                        if (var44.field2571.length <= var43) {
                            class157[] var45 = new class157[var43 + 1];
                            for (int var46 = 0; var46 < var44.field2571.length; var46++) {
                                var45[var46] = var44.field2571[var46];
                            }
                            var44.field2571 = var45;
                        }
                        if (var43 > 0 && var44.field2571[var43 - 1] == null) {
                            throw new RuntimeException("" + (var43 - 1));
                        }
                        class157 var47 = new class157();
                        var47.field2620 = var42;
                        var47.field2578 = var47.field2558 = var44.field2558;
                        var47.field2568 = var43;
                        var47.field2565 = true;
                        var44.field2571[var43] = var47;
                        if (var40) {
                            Statics.field237 = var47;
                        } else {
                            Statics.field1996 = var47;
                        }
                        client.method1523(var44);
                        continue;
                    }
                    if (var368 == 101) {
                        class157 var48 = var40 ? Statics.field237 : Statics.field1996;
                        class157 var49 = class157.method2230(var48.field2558);
                        var49.field2571[var48.field2568] = null;
                        client.method1523(var49);
                        continue;
                    }
                    if (var368 == 102) {
                        var4--;
                        class157 var50 = class157.method2230(field393[var4]);
                        var50.field2571 = null;
                        client.method1523(var50);
                        continue;
                    }
                    if (var368 == 200) {
                        var4 -= 2;
                        int var51 = field393[var4];
                        int var52 = field393[var4 + 1];
                        class157 var53 = class157.method2813(var51, var52);
                        if (var53 != null && var52 != -1) {
                            field393[var4++] = 1;
                            if (var40) {
                                Statics.field237 = var53;
                            } else {
                                Statics.field1996 = var53;
                            }
                            continue;
                        }
                        field393[var4++] = 0;
                        continue;
                    }
                } else if (var368 >= 1000 && var368 < 1100 || var368 >= 2000 && var368 < 2100) {
                    class157 var54;
                    if (var368 >= 2000) {
                        var368 -= 1000;
                        var4--;
                        var54 = class157.method2230(field393[var4]);
                    } else {
                        var54 = var40 ? Statics.field237 : Statics.field1996;
                    }
                    if (var368 == 1000) {
                        var4 -= 2;
                        var54.field2572 = field393[var4];
                        var54.field2573 = field393[var4 + 1];
                        client.method1523(var54);
                        continue;
                    }
                    if (var368 == 1001) {
                        var4 -= 2;
                        var54.field2576 = field393[var4];
                        var54.field2577 = field393[var4 + 1];
                        client.method1523(var54);
                        continue;
                    }
                    if (var368 == 1003) {
                        var4--;
                        boolean var55 = field393[var4] == 1;
                        if (var54.field2579 != var55) {
                            var54.field2579 = var55;
                            client.method1523(var54);
                        }
                        continue;
                    }
                } else if (!(var368 < 1100 || var368 >= 1200) || !(var368 < 2100 || var368 >= 2200)) {
                    class157 var56;
                    if (var368 >= 2000) {
                        var368 -= 1000;
                        var4--;
                        var56 = class157.method2230(field393[var4]);
                    } else {
                        var56 = var40 ? Statics.field237 : Statics.field1996;
                    }
                    if (var368 == 1100) {
                        var4 -= 2;
                        var56.field2598 = field393[var4];
                        if (var56.field2598 > var56.field2657 - var56.field2576) {
                            var56.field2598 = var56.field2657 - var56.field2576;
                        }
                        if (var56.field2598 < 0) {
                            var56.field2598 = 0;
                        }
                        var56.field2588 = field393[var4 + 1];
                        if (var56.field2588 > var56.field2583 - var56.field2577) {
                            var56.field2588 = var56.field2583 - var56.field2577;
                        }
                        if (var56.field2588 < 0) {
                            var56.field2588 = 0;
                        }
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1101) {
                        var4--;
                        var56.field2584 = field393[var4];
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1102) {
                        var4--;
                        var56.field2639 = field393[var4] == 1;
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1103) {
                        var4--;
                        var56.field2594 = field393[var4];
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1104) {
                        var4--;
                        var56.field2624 = field393[var4];
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1105) {
                        var4--;
                        var56.field2591 = field393[var4];
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1106) {
                        var4--;
                        var56.field2593 = field393[var4];
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1107) {
                        var4--;
                        var56.field2629 = field393[var4] == 1;
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1108) {
                        var56.field2599 = 1;
                        var4--;
                        var56.field2600 = field393[var4];
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1109) {
                        var4 -= 6;
                        var56.field2605 = field393[var4];
                        var56.field2606 = field393[var4 + 1];
                        var56.field2607 = field393[var4 + 2];
                        var56.field2563 = field393[var4 + 3];
                        var56.field2592 = field393[var4 + 4];
                        var56.field2610 = field393[var4 + 5];
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1110) {
                        var4--;
                        int var57 = field393[var4];
                        if (var56.field2603 != var57) {
                            var56.field2603 = var57;
                            var56.field2673 = 0;
                            var56.field2615 = 0;
                            client.method1523(var56);
                        }
                        continue;
                    }
                    if (var368 == 1111) {
                        var4--;
                        var56.field2636 = field393[var4] == 1;
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1112) {
                        var5--;
                        String var58 = field394[var5];
                        if (!var58.equals(var56.field2614)) {
                            var56.field2614 = var58;
                            client.method1523(var56);
                        }
                        continue;
                    }
                    if (var368 == 1113) {
                        var4--;
                        var56.field2613 = field393[var4];
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1114) {
                        var4 -= 3;
                        var56.field2617 = field393[var4];
                        var56.field2618 = field393[var4 + 1];
                        var56.field2609 = field393[var4 + 2];
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1115) {
                        var4--;
                        var56.field2616 = field393[var4] == 1;
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1116) {
                        var4--;
                        var56.field2595 = field393[var4];
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1117) {
                        var4--;
                        var56.field2601 = field393[var4];
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1118) {
                        var4--;
                        var56.field2597 = field393[var4] == 1;
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1119) {
                        var4--;
                        var56.field2619 = field393[var4] == 1;
                        client.method1523(var56);
                        continue;
                    }
                    if (var368 == 1120) {
                        var4 -= 2;
                        var56.field2657 = field393[var4];
                        var56.field2583 = field393[var4 + 1];
                        client.method1523(var56);
                        continue;
                    }
                } else if (var368 >= 1200 && var368 < 1300 || var368 >= 2200 && var368 < 2300) {
                    class157 var59;
                    if (var368 >= 2000) {
                        var368 -= 1000;
                        var4--;
                        var59 = class157.method2230(field393[var4]);
                    } else {
                        var59 = var40 ? Statics.field237 : Statics.field1996;
                    }
                    client.method1523(var59);
                    if (var368 == 1200) {
                        var4 -= 2;
                        int var60 = field393[var4];
                        int var61 = field393[var4 + 1];
                        var59.field2608 = var60;
                        var59.field2672 = var61;
                        class39 var62 = class39.method525(var60);
                        var59.field2607 = var62.field966;
                        var59.field2563 = var62.field976;
                        var59.field2592 = var62.field977;
                        var59.field2605 = var62.field978;
                        var59.field2606 = var62.field965;
                        var59.field2610 = var62.field974;
                        if (var59.field2576 > 0) {
                            var59.field2610 = var59.field2610 * 32 / var59.field2576;
                        }
                        continue;
                    }
                    if (var368 == 1201) {
                        var59.field2599 = 2;
                        var4--;
                        var59.field2600 = field393[var4];
                        continue;
                    }
                    if (var368 == 1202) {
                        var59.field2599 = 3;
                        var59.field2600 = Statics.field1242.field40.method3203();
                        continue;
                    }
                } else if ((var368 < 1300 || var368 >= 1400) && (var368 < 2300 || var368 >= 2400)) {
                    if (var368 >= 1400 && var368 < 1500 || var368 >= 2400 && var368 < 2500) {
                        class157 var67;
                        if (var368 >= 2000) {
                            var368 -= 1000;
                            var4--;
                            var67 = class157.method2230(field393[var4]);
                        } else {
                            var67 = var40 ? Statics.field237 : Statics.field1996;
                        }
                        var5--;
                        String var68 = field394[var5];
                        int[] var69 = null;
                        if (var68.length() > 0 && var68.charAt(var68.length() - 1) == 'Y') {
                            var4--;
                            int var70 = field393[var4];
                            if (var70 > 0) {
                                var69 = new int[var70];
                                while (var70-- > 0) {
                                    var4--;
                                    var69[var70] = field393[var4];
                                }
                            }
                            var68 = var68.substring(0, var68.length() - 1);
                        }
                        Object[] var71 = new Object[var68.length() + 1];
                        for (int var72 = var71.length - 1; var72 >= 1; var72--) {
                            if (var68.charAt(var72 - 1) == 's') {
                                var5--;
                                var71[var72] = field394[var5];
                            } else {
                                var4--;
                                var71[var72] = Integer.valueOf(field393[var4]);
                            }
                        }
                        var4--;
                        int var73 = field393[var4];
                        if (var73 == -1) {
                            var71 = null;
                        } else {
                            var71[0] = Integer.valueOf(var73);
                        }
                        if (var368 == 1400) {
                            var67.field2638 = var71;
                        }
                        if (var368 == 1401) {
                            var67.field2604 = var71;
                        }
                        if (var368 == 1402) {
                            var67.field2566 = var71;
                        }
                        if (var368 == 1403) {
                            var67.field2640 = var71;
                        }
                        if (var368 == 1404) {
                            var67.field2642 = var71;
                        }
                        if (var368 == 1405) {
                            var67.field2654 = var71;
                        }
                        if (var368 == 1406) {
                            var67.field2590 = var71;
                        }
                        if (var368 == 1407) {
                            var67.field2637 = var71;
                            var67.field2648 = var69;
                        }
                        if (var368 == 1408) {
                            var67.field2653 = var71;
                        }
                        if (var368 == 1409) {
                            var67.field2680 = var71;
                        }
                        if (var368 == 1410) {
                            var67.field2644 = var71;
                        }
                        if (var368 == 1411) {
                            var67.field2621 = var71;
                        }
                        if (var368 == 1412) {
                            var67.field2641 = var71;
                        }
                        if (var368 == 1414) {
                            var67.field2649 = var71;
                            var67.field2650 = var69;
                        }
                        if (var368 == 1415) {
                            var67.field2651 = var71;
                            var67.field2589 = var69;
                        }
                        if (var368 == 1416) {
                            var67.field2645 = var71;
                        }
                        if (var368 == 1417) {
                            var67.field2655 = var71;
                        }
                        if (var368 == 1418) {
                            var67.field2656 = var71;
                        }
                        if (var368 == 1419) {
                            var67.field2585 = var71;
                        }
                        if (var368 == 1420) {
                            var67.field2658 = var71;
                        }
                        if (var368 == 1421) {
                            var67.field2659 = var71;
                        }
                        if (var368 == 1422) {
                            var67.field2660 = var71;
                        }
                        if (var368 == 1423) {
                            var67.field2661 = var71;
                        }
                        if (var368 == 1424) {
                            var67.field2662 = var71;
                        }
                        var67.field2586 = true;
                        continue;
                    }
                    if (var368 < 1600) {
                        class157 var74 = var40 ? Statics.field237 : Statics.field1996;
                        if (var368 == 1500) {
                            field393[var4++] = var74.field2572;
                            continue;
                        }
                        if (var368 == 1501) {
                            field393[var4++] = var74.field2573;
                            continue;
                        }
                        if (var368 == 1502) {
                            field393[var4++] = var74.field2576;
                            continue;
                        }
                        if (var368 == 1503) {
                            field393[var4++] = var74.field2577;
                            continue;
                        }
                        if (var368 == 1504) {
                            field393[var4++] = var74.field2579 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 1505) {
                            field393[var4++] = var74.field2578;
                            continue;
                        }
                    } else if (var368 < 1700) {
                        class157 var75 = var40 ? Statics.field237 : Statics.field1996;
                        if (var368 == 1600) {
                            field393[var4++] = var75.field2598;
                            continue;
                        }
                        if (var368 == 1601) {
                            field393[var4++] = var75.field2588;
                            continue;
                        }
                        if (var368 == 1602) {
                            field394[var5++] = var75.field2614;
                            continue;
                        }
                        if (var368 == 1603) {
                            field393[var4++] = var75.field2657;
                            continue;
                        }
                        if (var368 == 1604) {
                            field393[var4++] = var75.field2583;
                            continue;
                        }
                        if (var368 == 1605) {
                            field393[var4++] = var75.field2610;
                            continue;
                        }
                        if (var368 == 1606) {
                            field393[var4++] = var75.field2607;
                            continue;
                        }
                        if (var368 == 1607) {
                            field393[var4++] = var75.field2592;
                            continue;
                        }
                        if (var368 == 1608) {
                            field393[var4++] = var75.field2563;
                            continue;
                        }
                    } else if (var368 < 1800) {
                        class157 var76 = var40 ? Statics.field237 : Statics.field1996;
                        if (var368 == 1700) {
                            field393[var4++] = var76.field2608;
                            continue;
                        }
                        if (var368 == 1701) {
                            if (var76.field2608 == -1) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = var76.field2672;
                            }
                            continue;
                        }
                        if (var368 == 1702) {
                            field393[var4++] = var76.field2568;
                            continue;
                        }
                    } else if (var368 < 1900) {
                        class157 var77 = var40 ? Statics.field237 : Statics.field1996;
                        if (var368 == 1800) {
                            int[] var78 = field393;
                            int var79 = var4++;
                            int var80 = client.method1599(var77);
                            int var81 = var80 >> 11 & 0x3F;
                            var78[var79] = var81;
                            continue;
                        }
                        if (var368 == 1801) {
                            var4--;
                            int var82 = field393[var4];
                            int var369 = var82 - 1;
                            if (var77.field2628 != null && var369 < var77.field2628.length && var77.field2628[var369] != null) {
                                field394[var5++] = var77.field2628[var369];
                                continue;
                            }
                            field394[var5++] = "";
                            continue;
                        }
                        if (var368 == 1802) {
                            if (var77.field2627 == null) {
                                field394[var5++] = "";
                            } else {
                                field394[var5++] = var77.field2627;
                            }
                            continue;
                        }
                    } else if (var368 < 2600) {
                        var4--;
                        class157 var83 = class157.method2230(field393[var4]);
                        if (var368 == 2500) {
                            field393[var4++] = var83.field2572;
                            continue;
                        }
                        if (var368 == 2501) {
                            field393[var4++] = var83.field2573;
                            continue;
                        }
                        if (var368 == 2502) {
                            field393[var4++] = var83.field2576;
                            continue;
                        }
                        if (var368 == 2503) {
                            field393[var4++] = var83.field2577;
                            continue;
                        }
                        if (var368 == 2504) {
                            field393[var4++] = var83.field2579 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 2505) {
                            field393[var4++] = var83.field2578;
                            continue;
                        }
                    } else if (var368 < 2700) {
                        var4--;
                        class157 var84 = class157.method2230(field393[var4]);
                        if (var368 == 2600) {
                            field393[var4++] = var84.field2598;
                            continue;
                        }
                        if (var368 == 2601) {
                            field393[var4++] = var84.field2588;
                            continue;
                        }
                        if (var368 == 2602) {
                            field394[var5++] = var84.field2614;
                            continue;
                        }
                        if (var368 == 2603) {
                            field393[var4++] = var84.field2657;
                            continue;
                        }
                        if (var368 == 2604) {
                            field393[var4++] = var84.field2583;
                            continue;
                        }
                        if (var368 == 2605) {
                            field393[var4++] = var84.field2610;
                            continue;
                        }
                        if (var368 == 2606) {
                            field393[var4++] = var84.field2607;
                            continue;
                        }
                        if (var368 == 2607) {
                            field393[var4++] = var84.field2592;
                            continue;
                        }
                        if (var368 == 2608) {
                            field393[var4++] = var84.field2563;
                            continue;
                        }
                    } else if (var368 < 2800) {
                        if (var368 == 2700) {
                            var4--;
                            class157 var85 = class157.method2230(field393[var4]);
                            field393[var4++] = var85.field2608;
                            continue;
                        }
                        if (var368 == 2701) {
                            var4--;
                            class157 var86 = class157.method2230(field393[var4]);
                            if (var86.field2608 == -1) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = var86.field2672;
                            }
                            continue;
                        }
                        if (var368 == 2702) {
                            var4--;
                            int var87 = field393[var4];
                            class4 var88 = (class4) client.field567.method3311((long) var87);
                            if (var88 == null) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var368 < 2900) {
                        var4--;
                        class157 var89 = class157.method2230(field393[var4]);
                        if (var368 == 2800) {
                            field393[var4++] = class161.method2716(client.method1599(var89));
                            continue;
                        }
                        if (var368 == 2801) {
                            var4--;
                            int var90 = field393[var4];
                            int var370 = var90 - 1;
                            if (var89.field2628 != null && var370 < var89.field2628.length && var89.field2628[var370] != null) {
                                field394[var5++] = var89.field2628[var370];
                                continue;
                            }
                            field394[var5++] = "";
                            continue;
                        }
                        if (var368 == 2802) {
                            if (var89.field2627 == null) {
                                field394[var5++] = "";
                            } else {
                                field394[var5++] = var89.field2627;
                            }
                            continue;
                        }
                    } else if (var368 < 3200) {
                        if (var368 == 3100) {
                            var5--;
                            String var91 = field394[var5];
                            client.method208(0, "", var91);
                            continue;
                        }
                        if (var368 == 3101) {
                            var4 -= 2;
                            client.method212(Statics.field1242, field393[var4], field393[var4 + 1]);
                            continue;
                        }
                        if (var368 == 3103) {
                            client.method145();
                            continue;
                        }
                        if (var368 == 3104) {
                            var5--;
                            String var92 = field394[var5];
                            int var93 = 0;
                            if (class146.method2210(var92)) {
                                int var94 = class146.method808(var92, 10, true);
                                var93 = var94;
                            }
                            client.field499.method2322(88);
                            client.field499.method2551(var93);
                            continue;
                        }
                        if (var368 == 3105) {
                            var5--;
                            String var95 = field394[var5];
                            client.field499.method2322(205);
                            client.field499.method2554(var95.length() + 1);
                            client.field499.method2439(var95);
                            continue;
                        }
                        if (var368 == 3106) {
                            var5--;
                            String var96 = field394[var5];
                            client.field499.method2322(134);
                            client.field499.method2554(var96.length() + 1);
                            client.field499.method2439(var96);
                            continue;
                        }
                        if (var368 == 3107) {
                            var4--;
                            int var97 = field393[var4];
                            var5--;
                            String var98 = field394[var5];
                            boolean var99 = false;
                            for (int var100 = 0; var100 < client.field593; var100++) {
                                class3 var101 = client.field592[client.field594[var100]];
                                if (var101 != null && var101.field41 != null && var101.field41.equalsIgnoreCase(var98)) {
                                    client.method1307(Statics.field1242.field458[0], Statics.field1242.field421[0], var101.field458[0], var101.field421[0], false, 0, 0, 1, 1, 0, 2);
                                    if (var97 == 1) {
                                        client.field499.method2322(168);
                                        client.field499.method2477(client.field594[var100]);
                                    } else if (var97 == 4) {
                                        client.field499.method2322(243);
                                        client.field499.method2477(client.field594[var100]);
                                    } else if (var97 == 6) {
                                        client.field499.method2322(159);
                                        client.field499.method2477(client.field594[var100]);
                                    } else if (var97 == 7) {
                                        client.field499.method2322(248);
                                        client.field499.method2435(client.field594[var100]);
                                    }
                                    var99 = true;
                                    break;
                                }
                            }
                            if (!var99) {
                                client.method208(0, "", class133.field2065 + var98);
                            }
                            continue;
                        }
                        if (var368 == 3108) {
                            var4 -= 3;
                            int var102 = field393[var4];
                            int var103 = field393[var4 + 1];
                            int var104 = field393[var4 + 2];
                            class157 var105 = class157.method2230(var104);
                            client.method213(var105, var102, var103);
                            continue;
                        }
                        if (var368 == 3109) {
                            var4 -= 2;
                            int var106 = field393[var4];
                            int var107 = field393[var4 + 1];
                            class157 var108 = var40 ? Statics.field237 : Statics.field1996;
                            client.method213(var108, var106, var107);
                            continue;
                        }
                    } else if (var368 < 3300) {
                        if (var368 == 3200) {
                            var4 -= 3;
                            int var109 = field393[var4];
                            int var110 = field393[var4 + 1];
                            int var111 = field393[var4 + 2];
                            if (client.field710 != 0 && var110 != 0 && client.field712 < 50) {
                                client.field713[client.field712] = var109;
                                client.field674[client.field712] = var110;
                                client.field715[client.field712] = var111;
                                client.field717[client.field712] = null;
                                client.field557[client.field712] = 0;
                                client.field712++;
                            }
                            continue;
                        }
                        if (var368 == 3201) {
                            var4--;
                            client.method728(field393[var4]);
                            continue;
                        }
                        if (var368 == 3202) {
                            var4 -= 2;
                            client.method2369(field393[var4], field393[var4 + 1]);
                            continue;
                        }
                    } else if (var368 < 3400) {
                        if (var368 == 3300) {
                            field393[var4++] = client.field477;
                            continue;
                        }
                        if (var368 == 3301) {
                            var4 -= 2;
                            int var112 = field393[var4];
                            int var113 = field393[var4 + 1];
                            field393[var4++] = class18.method63(var112, var113);
                            continue;
                        }
                        if (var368 == 3302) {
                            var4 -= 2;
                            int var114 = field393[var4];
                            int var115 = field393[var4 + 1];
                            int[] var116 = field393;
                            int var117 = var4++;
                            class18 var118 = (class18) class18.field279.method3311((long) var114);
                            int var119;
                            if (var118 == null) {
                                var119 = 0;
                            } else if (var115 >= 0 && var115 < var118.field285.length) {
                                var119 = var118.field285[var115];
                            } else {
                                var119 = 0;
                            }
                            var116[var117] = var119;
                            continue;
                        }
                        if (var368 == 3303) {
                            var4 -= 2;
                            int var120 = field393[var4];
                            int var121 = field393[var4 + 1];
                            int[] var122 = field393;
                            int var123 = var4++;
                            class18 var124 = (class18) class18.field279.method3311((long) var120);
                            int var125;
                            if (var124 == null) {
                                var125 = 0;
                            } else if (var121 == -1) {
                                var125 = 0;
                            } else {
                                int var126 = 0;
                                for (int var127 = 0; var127 < var124.field285.length; var127++) {
                                    if (var124.field277[var127] == var121) {
                                        var126 += var124.field285[var127];
                                    }
                                }
                                var125 = var126;
                            }
                            var122[var123] = var125;
                            continue;
                        }
                        if (var368 == 3304) {
                            var4--;
                            int var128 = field393[var4];
                            field393[var4++] = class40.method42(var128).field1012;
                            continue;
                        }
                        if (var368 == 3305) {
                            var4--;
                            int var129 = field393[var4];
                            field393[var4++] = client.field610[var129];
                            continue;
                        }
                        if (var368 == 3306) {
                            var4--;
                            int var130 = field393[var4];
                            field393[var4++] = client.field611[var130];
                            continue;
                        }
                        if (var368 == 3307) {
                            var4--;
                            int var131 = field393[var4];
                            field393[var4++] = client.field550[var131];
                            continue;
                        }
                        if (var368 == 3308) {
                            int var132 = Statics.field2050;
                            int var133 = (Statics.field1242.field433 >> 7) + Statics.field176;
                            int var134 = (Statics.field1242.field407 >> 7) + Statics.field1999;
                            field393[var4++] = (var132 << 28) + (var133 << 14) + var134;
                            continue;
                        }
                        if (var368 == 3309) {
                            var4--;
                            int var135 = field393[var4];
                            field393[var4++] = var135 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var368 == 3310) {
                            var4--;
                            int var136 = field393[var4];
                            field393[var4++] = var136 >> 28;
                            continue;
                        }
                        if (var368 == 3311) {
                            var4--;
                            int var137 = field393[var4];
                            field393[var4++] = var137 & 0x3FFF;
                            continue;
                        }
                        if (var368 == 3312) {
                            field393[var4++] = client.field471 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3313) {
                            var4 -= 2;
                            int var138 = field393[var4] + 32768;
                            int var139 = field393[var4 + 1];
                            field393[var4++] = class18.method63(var138, var139);
                            continue;
                        }
                        if (var368 == 3314) {
                            var4 -= 2;
                            int var140 = field393[var4] + 32768;
                            int var141 = field393[var4 + 1];
                            int[] var142 = field393;
                            int var143 = var4++;
                            class18 var144 = (class18) class18.field279.method3311((long) var140);
                            int var145;
                            if (var144 == null) {
                                var145 = 0;
                            } else if (var141 >= 0 && var141 < var144.field285.length) {
                                var145 = var144.field285[var141];
                            } else {
                                var145 = 0;
                            }
                            var142[var143] = var145;
                            continue;
                        }
                        if (var368 == 3315) {
                            var4 -= 2;
                            int var146 = field393[var4] + 32768;
                            int var147 = field393[var4 + 1];
                            int[] var148 = field393;
                            int var149 = var4++;
                            class18 var150 = (class18) class18.field279.method3311((long) var146);
                            int var151;
                            if (var150 == null) {
                                var151 = 0;
                            } else if (var147 == -1) {
                                var151 = 0;
                            } else {
                                int var152 = 0;
                                for (int var153 = 0; var153 < var150.field285.length; var153++) {
                                    if (var150.field277[var153] == var147) {
                                        var152 += var150.field285[var153];
                                    }
                                }
                                var151 = var152;
                            }
                            var148[var149] = var151;
                            continue;
                        }
                        if (var368 == 3316) {
                            if (client.field682 >= 2) {
                                field393[var4++] = client.field682;
                            } else {
                                field393[var4++] = 0;
                            }
                            continue;
                        }
                        if (var368 == 3317) {
                            field393[var4++] = client.field582;
                            continue;
                        }
                        if (var368 == 3318) {
                            field393[var4++] = client.field467;
                            continue;
                        }
                        if (var368 == 3321) {
                            field393[var4++] = client.field637;
                            continue;
                        }
                        if (var368 == 3322) {
                            field393[var4++] = client.field638;
                            continue;
                        }
                        if (var368 == 3323) {
                            if (client.field640) {
                                field393[var4++] = 1;
                            } else {
                                field393[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var368 < 3500) {
                        if (var368 == 3400) {
                            var4 -= 2;
                            int var154 = field393[var4];
                            int var155 = field393[var4 + 1];
                            class38 var156 = Statics.method307(var154);
                            if (var156.field949 != 's') {
                            }
                            for (int var157 = 0; var157 < var156.field954; var157++) {
                                if (var156.field955[var157] == var155) {
                                    field394[var5++] = var156.field957[var157];
                                    var156 = null;
                                    break;
                                }
                            }
                            if (var156 != null) {
                                field394[var5++] = var156.field952;
                            }
                            continue;
                        }
                        if (var368 == 3408) {
                            var4 -= 4;
                            int var158 = field393[var4];
                            int var159 = field393[var4 + 1];
                            int var160 = field393[var4 + 2];
                            int var161 = field393[var4 + 3];
                            class38 var162 = Statics.method307(var160);
                            if (var162.field948 == var158 && var162.field949 == var159) {
                                for (int var163 = 0; var163 < var162.field954; var163++) {
                                    if (var162.field955[var163] == var161) {
                                        if (var159 == 115) {
                                            field394[var5++] = var162.field957[var163];
                                        } else {
                                            field393[var4++] = var162.field956[var163];
                                        }
                                        var162 = null;
                                        break;
                                    }
                                }
                                if (var162 != null) {
                                    if (var159 == 115) {
                                        field394[var5++] = var162.field952;
                                    } else {
                                        field393[var4++] = var162.field953;
                                    }
                                }
                                continue;
                            }
                            if (var159 == 115) {
                                field394[var5++] = "null";
                            } else {
                                field393[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var368 < 3700) {
                        if (var368 == 3600) {
                            if (client.field492 == 0) {
                                field393[var4++] = -2;
                            } else if (client.field492 == 1) {
                                field393[var4++] = -1;
                            } else {
                                field393[var4++] = client.field724;
                            }
                            continue;
                        }
                        if (var368 == 3601) {
                            var4--;
                            int var164 = field393[var4];
                            if (client.field492 == 2 && var164 < client.field724) {
                                field394[var5++] = client.field726[var164].field367;
                                continue;
                            }
                            field394[var5++] = "";
                            continue;
                        }
                        if (var368 == 3602) {
                            var4--;
                            int var165 = field393[var4];
                            if (client.field492 == 2 && var165 < client.field724) {
                                field393[var4++] = client.field726[var165].field369;
                                continue;
                            }
                            field393[var4++] = 0;
                            continue;
                        }
                        if (var368 == 3603) {
                            var4--;
                            int var166 = field393[var4];
                            if (client.field492 == 2 && var166 < client.field724) {
                                field393[var4++] = client.field726[var166].field365;
                                continue;
                            }
                            field393[var4++] = 0;
                            continue;
                        }
                        if (var368 == 3604) {
                            var5--;
                            String var167 = field394[var5];
                            var4--;
                            int var168 = field393[var4];
                            client.method2041(var167, var168);
                            continue;
                        }
                        if (var368 == 3605) {
                            var5--;
                            String var169 = field394[var5];
                            if (var169 == null) {
                                continue;
                            }
                            if ((client.field724 < 200 || client.field531 == 1) && client.field724 < 200) {
                                String var170 = class147.method2681(var169, Statics.field520);
                                if (var170 == null) {
                                    continue;
                                }
                                for (int var171 = 0; var171 < client.field724; var171++) {
                                    class22 var172 = client.field726[var171];
                                    String var173 = class147.method2681(var172.field367, Statics.field520);
                                    if (var173 != null && var173.equals(var170)) {
                                        client.method208(0, "", var169 + class133.field2234);
                                        continue label2362;
                                    }
                                    if (var172.field363 != null) {
                                        String var174 = class147.method2681(var172.field363, Statics.field520);
                                        if (var174 != null && var174.equals(var170)) {
                                            client.method208(0, "", var169 + class133.field2234);
                                            continue label2362;
                                        }
                                    }
                                }
                                for (int var175 = 0; var175 < client.field563; var175++) {
                                    class11 var176 = client.field643[var175];
                                    String var177 = class147.method2681(var176.field189, Statics.field520);
                                    if (var177 != null && var177.equals(var170)) {
                                        client.method208(0, "", class133.field2154 + var169 + class133.field2229);
                                        continue label2362;
                                    }
                                    if (var176.field191 != null) {
                                        String var178 = class147.method2681(var176.field191, Statics.field520);
                                        if (var178 != null && var178.equals(var170)) {
                                            client.method208(0, "", class133.field2154 + var169 + class133.field2229);
                                            continue label2362;
                                        }
                                    }
                                }
                                if (class147.method2681(Statics.field1242.field41, Statics.field520).equals(var170)) {
                                    client.method208(0, "", class133.field2128);
                                } else {
                                    client.field499.method2322(59);
                                    class115 var179 = client.field499;
                                    int var180 = var169.length() + 1;
                                    var179.method2554(var180);
                                    client.field499.method2439(var169);
                                }
                                continue;
                            }
                            client.method208(0, "", class133.field2222);
                            continue;
                        }
                        if (var368 == 3606) {
                            var5--;
                            String var181 = field394[var5];
                            client.method3156(var181);
                            continue;
                        }
                        if (var368 == 3607) {
                            var5--;
                            String var182 = field394[var5];
                            client.method31(var182, false);
                            continue;
                        }
                        if (var368 == 3608) {
                            var5--;
                            String var183 = field394[var5];
                            if (var183 == null) {
                                continue;
                            }
                            String var184 = class147.method2681(var183, Statics.field520);
                            if (var184 == null) {
                                continue;
                            }
                            int var185 = 0;
                            while (true) {
                                if (var185 >= client.field563) {
                                    continue label2362;
                                }
                                class11 var186 = client.field643[var185];
                                String var187 = var186.field189;
                                String var188 = class147.method2681(var187, Statics.field520);
                                boolean var189;
                                if (var183 == null || var187 == null) {
                                    var189 = false;
                                } else if (var183.startsWith("#") || var187.startsWith("#")) {
                                    var189 = var183.equals(var187);
                                } else {
                                    var189 = var184.equals(var188);
                                }
                                if (var189) {
                                    client.field563--;
                                    for (int var190 = var185; var190 < client.field563; var190++) {
                                        client.field643[var190] = client.field643[var190 + 1];
                                    }
                                    client.field663 = client.field655;
                                    client.field499.method2322(83);
                                    class115 var191 = client.field499;
                                    int var192 = var183.length() + 1;
                                    var191.method2554(var192);
                                    client.field499.method2439(var183);
                                    continue label2362;
                                }
                                var185++;
                            }
                        }
                        if (var368 == 3609) {
                            var5--;
                            String var193 = field394[var5];
                            if (var193.startsWith(class2.method533(0)) || var193.startsWith(class2.method533(1))) {
                                var193 = var193.substring(7);
                            }
                            field393[var4++] = client.method1529(var193) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3611) {
                            if (client.field697 == null) {
                                field394[var5++] = "";
                                continue;
                            }
                            String[] var194 = field394;
                            int var195 = var5++;
                            String var196 = client.field697;
                            long var197 = 0L;
                            int var199 = var196.length();
                            for (int var200 = 0; var200 < var199; var200++) {
                                var197 *= 37L;
                                char var201 = var196.charAt(var200);
                                if (var201 >= 'A' && var201 <= 'Z') {
                                    var197 += (long) (var201 + 1 - 65);
                                } else if (var201 >= 'a' && var201 <= 'z') {
                                    var197 += (long) (var201 + 1 - 97);
                                } else if (var201 >= '0' && var201 <= '9') {
                                    var197 += (long) (var201 + 27 - 48);
                                }
                                if (var197 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var197 % 37L == 0L && var197 != 0L) {
                                var197 /= 37L;
                            }
                            String var204 = class145.method2211(var197);
                            if (var204 == null) {
                                var204 = "";
                            }
                            var194[var195] = var204;
                            continue;
                        }
                        if (var368 == 3612) {
                            if (client.field697 == null) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = Statics.field1195;
                            }
                            continue;
                        }
                        if (var368 == 3613) {
                            var4--;
                            int var206 = field393[var4];
                            if (client.field697 != null && var206 < Statics.field1195) {
                                field394[var5++] = Statics.field1421[var206].field116;
                                continue;
                            }
                            field394[var5++] = "";
                            continue;
                        }
                        if (var368 == 3614) {
                            var4--;
                            int var207 = field393[var4];
                            if (client.field697 != null && var207 < Statics.field1195) {
                                field393[var4++] = Statics.field1421[var207].field114;
                                continue;
                            }
                            field393[var4++] = 0;
                            continue;
                        }
                        if (var368 == 3615) {
                            var4--;
                            int var208 = field393[var4];
                            if (client.field697 != null && var208 < Statics.field1195) {
                                field393[var4++] = Statics.field1421[var208].field115;
                                continue;
                            }
                            field393[var4++] = 0;
                            continue;
                        }
                        if (var368 == 3616) {
                            field393[var4++] = Statics.field190;
                            continue;
                        }
                        if (var368 == 3617) {
                            var5--;
                            String var209 = field394[var5];
                            if (Statics.field1421 != null) {
                                client.field499.method2322(84);
                                class115 var210 = client.field499;
                                int var211 = var209.length() + 1;
                                var210.method2554(var211);
                                client.field499.method2439(var209);
                            }
                            continue;
                        }
                        if (var368 == 3618) {
                            field393[var4++] = Statics.field1023;
                            continue;
                        }
                        if (var368 == 3619) {
                            var5--;
                            String var212 = field394[var5];
                            if (!var212.equals("")) {
                                client.field499.method2322(188);
                                class115 var213 = client.field499;
                                int var214 = var212.length() + 1;
                                var213.method2554(var214);
                                client.field499.method2439(var212);
                            }
                            continue;
                        }
                        if (var368 == 3620) {
                            client.method729();
                            continue;
                        }
                        if (var368 == 3621) {
                            if (client.field492 == 0) {
                                field393[var4++] = -1;
                            } else {
                                field393[var4++] = client.field563;
                            }
                            continue;
                        }
                        if (var368 == 3622) {
                            var4--;
                            int var215 = field393[var4];
                            if (client.field492 != 0 && var215 < client.field563) {
                                field394[var5++] = client.field643[var215].field189;
                                continue;
                            }
                            field394[var5++] = "";
                            continue;
                        }
                        if (var368 == 3623) {
                            var5--;
                            String var216 = field394[var5];
                            if (var216.startsWith(class2.method533(0)) || var216.startsWith(class2.method533(1))) {
                                var216 = var216.substring(7);
                            }
                            field393[var4++] = client.method17(var216) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3624) {
                            var4--;
                            int var217 = field393[var4];
                            if (Statics.field1421 != null && var217 < Statics.field1195 && Statics.field1421[var217].field116.equalsIgnoreCase(Statics.field1242.field41)) {
                                field393[var4++] = 1;
                                continue;
                            }
                            field393[var4++] = 0;
                            continue;
                        }
                        if (var368 == 3625) {
                            if (client.field703 == null) {
                                field394[var5++] = "";
                                continue;
                            }
                            String[] var218 = field394;
                            int var219 = var5++;
                            String var220 = client.field703;
                            long var221 = 0L;
                            int var223 = var220.length();
                            for (int var224 = 0; var224 < var223; var224++) {
                                var221 *= 37L;
                                char var225 = var220.charAt(var224);
                                if (var225 >= 'A' && var225 <= 'Z') {
                                    var221 += (long) (var225 + 1 - 65);
                                } else if (var225 >= 'a' && var225 <= 'z') {
                                    var221 += (long) (var225 + 1 - 97);
                                } else if (var225 >= '0' && var225 <= '9') {
                                    var221 += (long) (var225 + 27 - 48);
                                }
                                if (var221 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var221 % 37L == 0L && var221 != 0L) {
                                var221 /= 37L;
                            }
                            String var228 = class145.method2211(var221);
                            if (var228 == null) {
                                var228 = "";
                            }
                            var218[var219] = var228;
                            continue;
                        }
                    } else if (var368 < 4100) {
                        if (var368 == 4000) {
                            var4 -= 2;
                            int var230 = field393[var4];
                            int var231 = field393[var4 + 1];
                            field393[var4++] = var230 + var231;
                            continue;
                        }
                        if (var368 == 4001) {
                            var4 -= 2;
                            int var232 = field393[var4];
                            int var233 = field393[var4 + 1];
                            field393[var4++] = var232 - var233;
                            continue;
                        }
                        if (var368 == 4002) {
                            var4 -= 2;
                            int var234 = field393[var4];
                            int var235 = field393[var4 + 1];
                            field393[var4++] = var234 * var235;
                            continue;
                        }
                        if (var368 == 4003) {
                            var4 -= 2;
                            int var236 = field393[var4];
                            int var237 = field393[var4 + 1];
                            field393[var4++] = var236 / var237;
                            continue;
                        }
                        if (var368 == 4004) {
                            var4--;
                            int var238 = field393[var4];
                            field393[var4++] = (int) (Math.random() * (double) var238);
                            continue;
                        }
                        if (var368 == 4005) {
                            var4--;
                            int var239 = field393[var4];
                            field393[var4++] = (int) (Math.random() * (double) (var239 + 1));
                            continue;
                        }
                        if (var368 == 4006) {
                            var4 -= 5;
                            int var240 = field393[var4];
                            int var241 = field393[var4 + 1];
                            int var242 = field393[var4 + 2];
                            int var243 = field393[var4 + 3];
                            int var244 = field393[var4 + 4];
                            field393[var4++] = (var241 - var240) * (var244 - var242) / (var243 - var242) + var240;
                            continue;
                        }
                        if (var368 == 4007) {
                            var4 -= 2;
                            int var245 = field393[var4];
                            int var246 = field393[var4 + 1];
                            field393[var4++] = var245 * var246 / 100 + var245;
                            continue;
                        }
                        if (var368 == 4008) {
                            var4 -= 2;
                            int var247 = field393[var4];
                            int var248 = field393[var4 + 1];
                            field393[var4++] = var247 | 0x1 << var248;
                            continue;
                        }
                        if (var368 == 4009) {
                            var4 -= 2;
                            int var249 = field393[var4];
                            int var250 = field393[var4 + 1];
                            field393[var4++] = var249 & -1 - (0x1 << var250);
                            continue;
                        }
                        if (var368 == 4010) {
                            var4 -= 2;
                            int var251 = field393[var4];
                            int var252 = field393[var4 + 1];
                            field393[var4++] = (var251 & 0x1 << var252) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var368 == 4011) {
                            var4 -= 2;
                            int var253 = field393[var4];
                            int var254 = field393[var4 + 1];
                            field393[var4++] = var253 % var254;
                            continue;
                        }
                        if (var368 == 4012) {
                            var4 -= 2;
                            int var255 = field393[var4];
                            int var256 = field393[var4 + 1];
                            if (var255 == 0) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = (int) Math.pow((double) var255, (double) var256);
                            }
                            continue;
                        }
                        if (var368 == 4013) {
                            var4 -= 2;
                            int var257 = field393[var4];
                            int var258 = field393[var4 + 1];
                            if (var257 == 0) {
                                field393[var4++] = 0;
                            } else if (var258 == 0) {
                                field393[var4++] = Integer.MAX_VALUE;
                            } else {
                                field393[var4++] = (int) Math.pow((double) var257, 1.0D / (double) var258);
                            }
                            continue;
                        }
                        if (var368 == 4014) {
                            var4 -= 2;
                            int var259 = field393[var4];
                            int var260 = field393[var4 + 1];
                            field393[var4++] = var259 & var260;
                            continue;
                        }
                        if (var368 == 4015) {
                            var4 -= 2;
                            int var261 = field393[var4];
                            int var262 = field393[var4 + 1];
                            field393[var4++] = var261 | var262;
                            continue;
                        }
                    } else if (var368 < 4200) {
                        if (var368 == 4100) {
                            var5--;
                            String var263 = field394[var5];
                            var4--;
                            int var264 = field393[var4];
                            field394[var5++] = var263 + var264;
                            continue;
                        }
                        if (var368 == 4101) {
                            var5 -= 2;
                            String var265 = field394[var5];
                            String var266 = field394[var5 + 1];
                            field394[var5++] = var265 + var266;
                            continue;
                        }
                        if (var368 == 4102) {
                            var5--;
                            String var267 = field394[var5];
                            var4--;
                            int var268 = field393[var4];
                            field394[var5++] = var267 + class146.method246(var268, true);
                            continue;
                        }
                        if (var368 == 4103) {
                            var5--;
                            String var269 = field394[var5];
                            field394[var5++] = var269.toLowerCase();
                            continue;
                        }
                        if (var368 == 4104) {
                            var4--;
                            int var270 = field393[var4];
                            long var271 = ((long) var270 + 11745L) * 86400000L;
                            field397.setTime(new Date(var271));
                            int var273 = field397.get(5);
                            int var274 = field397.get(2);
                            int var275 = field397.get(1);
                            field394[var5++] = var273 + "-" + field405[var274] + "-" + var275;
                            continue;
                        }
                        if (var368 == 4105) {
                            var5 -= 2;
                            String var276 = field394[var5];
                            String var277 = field394[var5 + 1];
                            if (Statics.field1242.field40 != null && Statics.field1242.field40.field2703) {
                                field394[var5++] = var277;
                                continue;
                            }
                            field394[var5++] = var276;
                            continue;
                        }
                        if (var368 == 4106) {
                            var4--;
                            int var278 = field393[var4];
                            field394[var5++] = Integer.toString(var278);
                            continue;
                        }
                        if (var368 == 4107) {
                            var5 -= 2;
                            int[] var279 = field393;
                            int var280 = var4++;
                            int var281 = class149.method3363(field394[var5], field394[var5 + 1], client.field473);
                            byte var282;
                            if (var281 > 0) {
                                var282 = 1;
                            } else if (var281 < 0) {
                                var282 = -1;
                            } else {
                                var282 = 0;
                            }
                            var279[var280] = var282;
                            continue;
                        }
                        if (var368 == 4108) {
                            var5--;
                            String var283 = field394[var5];
                            var4 -= 2;
                            int var284 = field393[var4];
                            int var285 = field393[var4 + 1];
                            byte[] var286 = Statics.field1404.method2965(var285, 0);
                            class182 var287 = new class182(var286);
                            field393[var4++] = var287.method3392(var283, var284);
                            continue;
                        }
                        if (var368 == 4109) {
                            var5--;
                            String var288 = field394[var5];
                            var4 -= 2;
                            int var289 = field393[var4];
                            int var290 = field393[var4 + 1];
                            byte[] var291 = Statics.field1404.method2965(var290, 0);
                            class182 var292 = new class182(var291);
                            field393[var4++] = var292.method3391(var288, var289);
                            continue;
                        }
                        if (var368 == 4110) {
                            var5 -= 2;
                            String var293 = field394[var5];
                            String var294 = field394[var5 + 1];
                            var4--;
                            if (field393[var4] == 1) {
                                field394[var5++] = var293;
                            } else {
                                field394[var5++] = var294;
                            }
                            continue;
                        }
                        if (var368 == 4111) {
                            var5--;
                            String var295 = field394[var5];
                            field394[var5++] = class184.method3404(var295);
                            continue;
                        }
                        if (var368 == 4112) {
                            var5--;
                            String var296 = field394[var5];
                            var4--;
                            int var297 = field393[var4];
                            field394[var5++] = var296 + (char) var297;
                            continue;
                        }
                        if (var368 == 4113) {
                            var4--;
                            int var298 = field393[var4];
                            field393[var4++] = Statics.method144((char) var298) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4114) {
                            var4--;
                            int var299 = field393[var4];
                            field393[var4++] = class146.method1368((char) var299) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4115) {
                            var4--;
                            int var300 = field393[var4];
                            field393[var4++] = class146.method1231((char) var300) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4116) {
                            var4--;
                            int var301 = field393[var4];
                            field393[var4++] = Statics.method47((char) var301) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4117) {
                            var5--;
                            String var302 = field394[var5];
                            if (var302 == null) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = var302.length();
                            }
                            continue;
                        }
                        if (var368 == 4118) {
                            var5--;
                            String var303 = field394[var5];
                            var4 -= 2;
                            int var304 = field393[var4];
                            int var305 = field393[var4 + 1];
                            field394[var5++] = var303.substring(var304, var305);
                            continue;
                        }
                        if (var368 == 4119) {
                            var5--;
                            String var306 = field394[var5];
                            StringBuilder var307 = new StringBuilder(var306.length());
                            boolean var308 = false;
                            for (int var309 = 0; var309 < var306.length(); var309++) {
                                char var310 = var306.charAt(var309);
                                if (var310 == '<') {
                                    var308 = true;
                                } else if (var310 == '>') {
                                    var308 = false;
                                } else if (!var308) {
                                    var307.append(var310);
                                }
                            }
                            field394[var5++] = var307.toString();
                            continue;
                        }
                        if (var368 == 4120) {
                            var5--;
                            String var311 = field394[var5];
                            var4--;
                            int var312 = field393[var4];
                            field393[var4++] = var311.indexOf(var312);
                            continue;
                        }
                    } else if (var368 < 4300) {
                        if (var368 == 4200) {
                            var4--;
                            int var313 = field393[var4];
                            field394[var5++] = class39.method525(var313).field969;
                            continue;
                        }
                        if (var368 == 4201) {
                            var4 -= 2;
                            int var314 = field393[var4];
                            int var315 = field393[var4 + 1];
                            class39 var316 = class39.method525(var314);
                            if (var315 >= 1 && var315 <= 5 && var316.field983[var315 - 1] != null) {
                                field394[var5++] = var316.field983[var315 - 1];
                                continue;
                            }
                            field394[var5++] = "";
                            continue;
                        }
                        if (var368 == 4202) {
                            var4 -= 2;
                            int var317 = field393[var4];
                            int var318 = field393[var4 + 1];
                            class39 var319 = class39.method525(var317);
                            if (var318 >= 1 && var318 <= 5 && var319.field984[var318 - 1] != null) {
                                field394[var5++] = var319.field984[var318 - 1];
                                continue;
                            }
                            field394[var5++] = "";
                            continue;
                        }
                        if (var368 == 4203) {
                            var4--;
                            int var320 = field393[var4];
                            field393[var4++] = class39.method525(var320).field982;
                            continue;
                        }
                        if (var368 == 4204) {
                            var4--;
                            int var321 = field393[var4];
                            field393[var4++] = class39.method525(var321).field975 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4205) {
                            var4--;
                            int var322 = field393[var4];
                            class39 var323 = class39.method525(var322);
                            if (var323.field1000 == -1 && var323.field999 >= 0) {
                                field393[var4++] = var323.field999;
                                continue;
                            }
                            field393[var4++] = var322;
                            continue;
                        }
                        if (var368 == 4206) {
                            var4--;
                            int var324 = field393[var4];
                            class39 var325 = class39.method525(var324);
                            if (var325.field1000 >= 0 && var325.field999 >= 0) {
                                field393[var4++] = var325.field999;
                                continue;
                            }
                            field393[var4++] = var324;
                            continue;
                        }
                        if (var368 == 4207) {
                            var4--;
                            int var326 = field393[var4];
                            field393[var4++] = class39.method525(var326).field1001 ? 1 : 0;
                            continue;
                        }
                    } else if (var368 < 5100) {
                        if (var368 == 5000) {
                            field393[var4++] = client.field689;
                            continue;
                        }
                        if (var368 == 5001) {
                            var4 -= 3;
                            client.field689 = field393[var4];
                            int var327 = field393[var4 + 1];
                            class136[] var328 = Statics.method612();
                            int var329 = 0;
                            class136 var331;
                            while (true) {
                                if (var329 >= var328.length) {
                                    var331 = null;
                                    break;
                                }
                                class136 var330 = var328[var329];
                                if (var330.field2314 == var327) {
                                    var331 = var330;
                                    break;
                                }
                                var329++;
                            }
                            Statics.field1017 = var331;
                            if (Statics.field1017 == null) {
                                Statics.field1017 = class136.field2312;
                            }
                            client.field668 = field393[var4 + 2];
                            client.field499.method2322(254);
                            client.field499.method2554(client.field689);
                            client.field499.method2554(Statics.field1017.field2314);
                            client.field499.method2554(client.field668);
                            continue;
                        }
                        if (var368 == 5002) {
                            var5--;
                            String var332 = field394[var5];
                            var4 -= 2;
                            int var333 = field393[var4];
                            int var334 = field393[var4 + 1];
                            client.field499.method2322(45);
                            class115 var335 = client.field499;
                            int var336 = var332.length() + 1;
                            var335.method2554(var336 + 2);
                            client.field499.method2439(var332);
                            client.field499.method2554(var333 - 1);
                            client.field499.method2554(var334);
                            continue;
                        }
                        if (var368 == 5003) {
                            var4--;
                            int var337 = field393[var4];
                            String var338 = null;
                            if (var337 < 100) {
                                var338 = client.field686[var337];
                            }
                            if (var338 == null) {
                                var338 = "";
                            }
                            field394[var5++] = var338;
                            continue;
                        }
                        if (var368 == 5004) {
                            var4--;
                            int var339 = field393[var4];
                            int var340 = -1;
                            if (var339 < 100 && client.field686[var339] != null) {
                                var340 = client.field683[var339];
                            }
                            field393[var4++] = var340;
                            continue;
                        }
                        if (var368 == 5005) {
                            if (Statics.field1017 == null) {
                                field393[var4++] = -1;
                            } else {
                                field393[var4++] = Statics.field1017.field2314;
                            }
                            continue;
                        }
                        if (var368 == 5008) {
                            var5--;
                            String var341 = field394[var5];
                            if (!var341.startsWith("::")) {
                                String var345 = var341.toLowerCase();
                                byte var346 = 0;
                                if (var345.startsWith(class133.field2066)) {
                                    var346 = 0;
                                    var341 = var341.substring(class133.field2066.length());
                                } else if (var345.startsWith(class133.field2179)) {
                                    var346 = 1;
                                    var341 = var341.substring(class133.field2179.length());
                                } else if (var345.startsWith(class133.field2296)) {
                                    var346 = 2;
                                    var341 = var341.substring(class133.field2296.length());
                                } else if (var345.startsWith(class133.field2238)) {
                                    var346 = 3;
                                    var341 = var341.substring(class133.field2238.length());
                                } else if (var345.startsWith(class133.field2240)) {
                                    var346 = 4;
                                    var341 = var341.substring(class133.field2240.length());
                                } else if (var345.startsWith(class133.field2087)) {
                                    var346 = 5;
                                    var341 = var341.substring(class133.field2087.length());
                                } else if (var345.startsWith(class133.field2244)) {
                                    var346 = 6;
                                    var341 = var341.substring(class133.field2244.length());
                                } else if (var345.startsWith(class133.field2200)) {
                                    var346 = 7;
                                    var341 = var341.substring(class133.field2200.length());
                                } else if (var345.startsWith(class133.field2094)) {
                                    var346 = 8;
                                    var341 = var341.substring(class133.field2094.length());
                                } else if (var345.startsWith(class133.field2250)) {
                                    var346 = 9;
                                    var341 = var341.substring(class133.field2250.length());
                                } else if (var345.startsWith(class133.field2252)) {
                                    var346 = 10;
                                    var341 = var341.substring(class133.field2252.length());
                                } else if (var345.startsWith(class133.field2254)) {
                                    var346 = 11;
                                    var341 = var341.substring(class133.field2254.length());
                                } else if (client.field473 != 0) {
                                    if (var345.startsWith(class133.field2183)) {
                                        var346 = 0;
                                        var341 = var341.substring(class133.field2183.length());
                                    } else if (var345.startsWith(class133.field2235)) {
                                        var346 = 1;
                                        var341 = var341.substring(class133.field2235.length());
                                    } else if (var345.startsWith(class133.field2237)) {
                                        var346 = 2;
                                        var341 = var341.substring(class133.field2237.length());
                                    } else if (var345.startsWith(class133.field2239)) {
                                        var346 = 3;
                                        var341 = var341.substring(class133.field2239.length());
                                    } else if (var345.startsWith(class133.field2241)) {
                                        var346 = 4;
                                        var341 = var341.substring(class133.field2241.length());
                                    } else if (var345.startsWith(class133.field2243)) {
                                        var346 = 5;
                                        var341 = var341.substring(class133.field2243.length());
                                    } else if (var345.startsWith(class133.field2245)) {
                                        var346 = 6;
                                        var341 = var341.substring(class133.field2245.length());
                                    } else if (var345.startsWith(class133.field2230)) {
                                        var346 = 7;
                                        var341 = var341.substring(class133.field2230.length());
                                    } else if (var345.startsWith(class133.field2249)) {
                                        var346 = 8;
                                        var341 = var341.substring(class133.field2249.length());
                                    } else if (var345.startsWith(class133.field2172)) {
                                        var346 = 9;
                                        var341 = var341.substring(class133.field2172.length());
                                    } else if (var345.startsWith(class133.field2253)) {
                                        var346 = 10;
                                        var341 = var341.substring(class133.field2253.length());
                                    } else if (var345.startsWith(class133.field2255)) {
                                        var346 = 11;
                                        var341 = var341.substring(class133.field2255.length());
                                    }
                                }
                                String var347 = var341.toLowerCase();
                                byte var348 = 0;
                                if (var347.startsWith(class133.field2139)) {
                                    var348 = 1;
                                    var341 = var341.substring(class133.field2139.length());
                                } else if (var347.startsWith(class133.field2232)) {
                                    var348 = 2;
                                    var341 = var341.substring(class133.field2232.length());
                                } else if (var347.startsWith(class133.field2083)) {
                                    var348 = 3;
                                    var341 = var341.substring(class133.field2083.length());
                                } else if (var347.startsWith(class133.field2177)) {
                                    var348 = 4;
                                    var341 = var341.substring(class133.field2177.length());
                                } else if (var347.startsWith(class133.field2264)) {
                                    var348 = 5;
                                    var341 = var341.substring(class133.field2264.length());
                                } else if (client.field473 != 0) {
                                    if (var347.startsWith(class133.field2081)) {
                                        var348 = 1;
                                        var341 = var341.substring(class133.field2081.length());
                                    } else if (var347.startsWith(class133.field2259)) {
                                        var348 = 2;
                                        var341 = var341.substring(class133.field2259.length());
                                    } else if (var347.startsWith(class133.field2196)) {
                                        var348 = 3;
                                        var341 = var341.substring(class133.field2196.length());
                                    } else if (var347.startsWith(class133.field2263)) {
                                        var348 = 4;
                                        var341 = var341.substring(class133.field2263.length());
                                    } else if (var347.startsWith(class133.field2265)) {
                                        var348 = 5;
                                        var341 = var341.substring(class133.field2265.length());
                                    }
                                }
                                client.field499.method2322(28);
                                client.field499.method2554(0);
                                int var349 = client.field499.field2024;
                                client.field499.method2554(var346);
                                client.field499.method2554(var348);
                                class115 var350 = client.field499;
                                int var351 = var350.field2024;
                                byte[] var352 = class148.method133(var341);
                                var350.method2446(var352.length);
                                var350.field2024 += Statics.field2827.method2377(var352, 0, var352.length, var350.field2022, var350.field2024);
                                client.field499.method2528(client.field499.field2024 - var349);
                                continue;
                            }
                            if (client.field682 >= 2) {
                                if (var341.equalsIgnoreCase("::gc")) {
                                    System.gc();
                                }
                                if (var341.equalsIgnoreCase("::clientdrop")) {
                                    if (client.field518 > 0) {
                                        client.method1392();
                                    } else {
                                        client.method138(40);
                                        Statics.field510 = Statics.field579;
                                        Statics.field579 = null;
                                    }
                                }
                                if (var341.equalsIgnoreCase("::fpson")) {
                                    client.field466 = true;
                                }
                                if (var341.equalsIgnoreCase("::fpsoff")) {
                                    client.field466 = false;
                                }
                                if (var341.equalsIgnoreCase("::noclip")) {
                                    for (int var342 = 0; var342 < 4; var342++) {
                                        for (int var343 = 1; var343 < 103; var343++) {
                                            for (int var344 = 1; var344 < 103; var344++) {
                                                client.field530[var342].field2729[var343][var344] = 0;
                                            }
                                        }
                                    }
                                }
                                if (var341.equalsIgnoreCase("::errortest") && client.field469 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field499.method2322(109);
                            client.field499.method2554(var341.length() - 1);
                            client.field499.method2439(var341.substring(2));
                            continue;
                        }
                        if (var368 == 5009) {
                            var5 -= 2;
                            String var353 = field394[var5];
                            String var354 = field394[var5 + 1];
                            client.field499.method2322(255);
                            client.field499.method2435(0);
                            int var355 = client.field499.field2024;
                            client.field499.method2439(var353);
                            class115 var356 = client.field499;
                            int var357 = var356.field2024;
                            byte[] var358 = class148.method133(var354);
                            var356.method2446(var358.length);
                            var356.field2024 += Statics.field2827.method2377(var358, 0, var358.length, var356.field2022, var356.field2024);
                            client.field499.method2444(client.field499.field2024 - var355);
                            continue;
                        }
                        if (var368 == 5010) {
                            var4--;
                            int var359 = field393[var4];
                            String var360 = null;
                            if (var359 < 100) {
                                var360 = client.field485[var359];
                            }
                            if (var360 == null) {
                                var360 = "";
                            }
                            field394[var5++] = var360;
                            continue;
                        }
                        if (var368 == 5011) {
                            var4--;
                            int var361 = field393[var4];
                            String var362 = null;
                            if (var361 < 100) {
                                var362 = client.field685[var361];
                            }
                            if (var362 == null) {
                                var362 = "";
                            }
                            field394[var5++] = var362;
                            continue;
                        }
                        if (var368 == 5015) {
                            String var363;
                            if (Statics.field1242 == null || Statics.field1242.field41 == null) {
                                var363 = "";
                            } else {
                                var363 = Statics.field1242.field41;
                            }
                            field394[var5++] = var363;
                            continue;
                        }
                        if (var368 == 5016) {
                            field393[var4++] = client.field668;
                            continue;
                        }
                        if (var368 == 5017) {
                            field393[var4++] = client.field474;
                            continue;
                        }
                    }
                } else {
                    class157 var63;
                    if (var368 >= 2000) {
                        var368 -= 1000;
                        var4--;
                        var63 = class157.method2230(field393[var4]);
                    } else {
                        var63 = var40 ? Statics.field237 : Statics.field1996;
                    }
                    if (var368 == 1300) {
                        var4--;
                        int var64 = field393[var4] - 1;
                        if (var64 >= 0 && var64 <= 9) {
                            var5--;
                            var63.method3106(var64, field394[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var368 == 1301) {
                        var4 -= 2;
                        int var65 = field393[var4];
                        int var66 = field393[var4 + 1];
                        var63.field2635 = class157.method2813(var65, var66);
                        continue;
                    }
                    if (var368 == 1302) {
                        var4--;
                        var63.field2632 = field393[var4] == 1;
                        continue;
                    }
                    if (var368 == 1303) {
                        var4--;
                        var63.field2630 = field393[var4];
                        continue;
                    }
                    if (var368 == 1304) {
                        var4--;
                        var63.field2665 = field393[var4];
                        continue;
                    }
                    if (var368 == 1305) {
                        var5--;
                        var63.field2627 = field394[var5];
                        continue;
                    }
                    if (var368 == 1306) {
                        var5--;
                        var63.field2674 = field394[var5];
                        continue;
                    }
                    if (var368 == 1307) {
                        var63.field2628 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var367) {
            StringBuilder var365 = new StringBuilder(30);
            var365.append("").append(var3.field2808).append(" ");
            for (int var366 = field388 - 1; var366 >= 0; var366--) {
                var365.append("").append(field396[var366].field269.field2808).append(" ");
            }
            var365.append("").append(var9);
            class79.method1474(var365.toString(), var367);
        }
    }

    @ObfuscatedName("o.k(II)V")
    public static void method245(int arg0) {
        if (arg0 == -1 || !class157.method1408(arg0)) {
            return;
        }
        class157[] var1 = Statics.field2580[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3.field2671 != null) {
                class1 var4 = new class1();
                var4.field15 = var3;
                var4.field7 = var3.field2671;
                method2220(var4);
            }
        }
    }
}
