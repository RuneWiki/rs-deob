package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ay")
public class class32 {

    @ObfuscatedName("ay.o")
    public static int[] field709 = new int[5];

    @ObfuscatedName("ay.n")
    public static int[][] field710 = new int[5][5000];

    @ObfuscatedName("ay.y")
    public static int[] field711 = new int[1000];

    @ObfuscatedName("ay.f")
    public static String[] field712 = new String[1000];

    @ObfuscatedName("ay.p")
    public static int field717 = 0;

    @ObfuscatedName("ay.l")
    public static class13[] field714 = new class13[50];

    @ObfuscatedName("ay.e")
    public static Calendar field716 = Calendar.getInstance();

    @ObfuscatedName("ay.t")
    public static final String[] field713 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.b(Lb;B)V")
    public static void method487(class1 arg0) {
        method3390(arg0, 200000);
    }

    @ObfuscatedName("gs.u(Lb;II)V")
    public static void method3390(class1 arg0, int arg1) {
        Object[] var2 = arg0.field15;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method480(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field540;
        int[] var9 = var4.field531;
        byte var10 = -1;
        field717 = 0;
        try {
            Statics.field1664 = new int[var4.field537];
            int var11 = 0;
            Statics.field1886 = new String[var4.field534];
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
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2530;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field12;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2531;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2530;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2531;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field3;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field1664[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field1886[var12++] = var15;
                }
            }
            int var16 = 0;
            label2471: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var405 = var8[var7];
                if (var405 < 100) {
                    if (var405 == 0) {
                        field711[var5++] = var9[var7];
                        continue;
                    }
                    if (var405 == 1) {
                        int var17 = var9[var7];
                        field711[var5++] = class154.field2657[var17];
                        continue;
                    }
                    if (var405 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class154.field2657[var18] = field711[var5];
                        client.method3433(var18);
                        continue;
                    }
                    if (var405 == 3) {
                        field712[var6++] = var4.field536[var7];
                        continue;
                    }
                    if (var405 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var405 == 7) {
                        var5 -= 2;
                        if (field711[var5 + 1] != field711[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var405 == 8) {
                        var5 -= 2;
                        if (field711[var5 + 1] == field711[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var405 == 9) {
                        var5 -= 2;
                        if (field711[var5] < field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var405 == 10) {
                        var5 -= 2;
                        if (field711[var5] > field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var405 == 21) {
                        if (field717 == 0) {
                            return;
                        }
                        class13 var19 = field714[--field717];
                        var4 = var19.field199;
                        var8 = var4.field540;
                        var9 = var4.field531;
                        var7 = var19.field193;
                        Statics.field1664 = var19.field192;
                        Statics.field1886 = var19.field195;
                        continue;
                    }
                    if (var405 == 25) {
                        int var20 = var9[var7];
                        field711[var5++] = class154.method140(var20);
                        continue;
                    }
                    if (var405 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field711[var5];
                        class42 var23 = (class42) class42.field978.method3114((long) var21);
                        class42 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field987.method2692(14, var21);
                            class42 var26 = new class42();
                            if (var25 != null) {
                                var26.method796(new class107(var25));
                            }
                            class42.field978.method3116(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field980;
                        int var29 = var24.field981;
                        int var30 = var24.field979;
                        int var31 = class154.field2663[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class154.field2657[var28] = class154.field2657[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var405 == 31) {
                        var5 -= 2;
                        if (field711[var5] <= field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var405 == 32) {
                        var5 -= 2;
                        if (field711[var5] >= field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var405 == 33) {
                        field711[var5++] = Statics.field1664[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var405 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1664[var10001] = field711[var5];
                        continue;
                    }
                    if (var405 == 35) {
                        field712[var6++] = Statics.field1886[var9[var7]];
                        continue;
                    }
                    if (var405 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1886[var10001] = field712[var6];
                        continue;
                    }
                    if (var405 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String[] var34 = field712;
                        String var35;
                        if (var33 == 0) {
                            var35 = "";
                        } else if (var33 == 1) {
                            String var36 = var34[var6];
                            if (var36 == null) {
                                var35 = "null";
                            } else {
                                var35 = var36.toString();
                            }
                        } else {
                            int var37 = var6 + var33;
                            int var38 = 0;
                            for (int var39 = var6; var39 < var37; var39++) {
                                String var40 = var34[var39];
                                if (var40 == null) {
                                    var38 += 4;
                                } else {
                                    var38 += var40.length();
                                }
                            }
                            StringBuilder var41 = new StringBuilder(var38);
                            for (int var42 = var6; var42 < var37; var42++) {
                                String var43 = var34[var42];
                                if (var43 == null) {
                                    var41.append("null");
                                } else {
                                    var41.append(var43);
                                }
                            }
                            var35 = var41.toString();
                        }
                        field712[var6++] = var35;
                        continue;
                    }
                    if (var405 == 38) {
                        var5--;
                        continue;
                    }
                    if (var405 == 39) {
                        var6--;
                        continue;
                    }
                    if (var405 == 40) {
                        int var45 = var9[var7];
                        class19 var46 = class19.method480(var45);
                        int[] var47 = new int[var46.field537];
                        String[] var48 = new String[var46.field534];
                        for (int var49 = 0; var49 < var46.field535; var49++) {
                            var47[var49] = field711[var5 - var46.field535 + var49];
                        }
                        for (int var50 = 0; var50 < var46.field529; var50++) {
                            var48[var50] = field712[var6 - var46.field529 + var50];
                        }
                        var5 -= var46.field535;
                        var6 -= var46.field529;
                        class13 var51 = new class13();
                        var51.field199 = var4;
                        var51.field193 = var7;
                        var51.field192 = Statics.field1664;
                        var51.field195 = Statics.field1886;
                        field714[++field717 - 1] = var51;
                        var4 = var46;
                        var8 = var46.field540;
                        var9 = var46.field531;
                        var7 = -1;
                        Statics.field1664 = var47;
                        Statics.field1886 = var48;
                        continue;
                    }
                    if (var405 == 42) {
                        field711[var5++] = client.field455[var9[var7]];
                        continue;
                    }
                    if (var405 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field455[var10001] = field711[var5];
                        continue;
                    }
                    if (var405 == 44) {
                        int var52 = var9[var7] >> 16;
                        int var53 = var9[var7] & 0xFFFF;
                        var5--;
                        int var54 = field711[var5];
                        if (var54 >= 0 && var54 <= 5000) {
                            field709[var52] = var54;
                            byte var55 = -1;
                            if (var53 == 105) {
                                var55 = 0;
                            }
                            int var56 = 0;
                            while (true) {
                                if (var56 >= var54) {
                                    continue label2471;
                                }
                                field710[var52][var56] = var55;
                                var56++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var405 == 45) {
                        int var57 = var9[var7];
                        var5--;
                        int var58 = field711[var5];
                        if (var58 >= 0 && var58 < field709[var57]) {
                            field711[var5++] = field710[var57][var58];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var405 == 46) {
                        int var59 = var9[var7];
                        var5 -= 2;
                        int var60 = field711[var5];
                        if (var60 >= 0 && var60 < field709[var59]) {
                            field710[var59][var60] = field711[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var405 == 47) {
                        String var61 = client.field483[var9[var7]];
                        if (var61 == null) {
                            var61 = "null";
                        }
                        field712[var6++] = var61;
                        continue;
                    }
                    if (var405 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field483[var10001] = field712[var6];
                        continue;
                    }
                }
                boolean var62;
                if (var9[var7] == 1) {
                    var62 = true;
                } else {
                    var62 = false;
                }
                if (var405 < 1000) {
                    if (var405 == 100) {
                        var5 -= 3;
                        int var63 = field711[var5];
                        int var64 = field711[var5 + 1];
                        int var65 = field711[var5 + 2];
                        if (var64 == 0) {
                            throw new RuntimeException();
                        }
                        class152 var66 = Statics.method159(var63);
                        if (var66.field2633 == null) {
                            var66.field2633 = new class152[var65 + 1];
                        }
                        if (var66.field2633.length <= var65) {
                            class152[] var67 = new class152[var65 + 1];
                            for (int var68 = 0; var68 < var66.field2633.length; var68++) {
                                var67[var68] = var66.field2633[var68];
                            }
                            var66.field2633 = var67;
                        }
                        if (var65 > 0 && var66.field2633[var65 - 1] == null) {
                            throw new RuntimeException("" + (var65 - 1));
                        }
                        class152 var69 = new class152();
                        var69.field2580 = var64;
                        var69.field2582 = var69.field2530 = var66.field2530;
                        var69.field2531 = var65;
                        var69.field2529 = true;
                        var66.field2633[var65] = var69;
                        if (var62) {
                            Statics.field204 = var69;
                        } else {
                            Statics.field718 = var69;
                        }
                        client.method535(var66);
                        continue;
                    }
                    if (var405 == 101) {
                        class152 var70 = var62 ? Statics.field204 : Statics.field718;
                        class152 var71 = Statics.method159(var70.field2530);
                        var71.field2633[var70.field2531] = null;
                        client.method535(var71);
                        continue;
                    }
                    if (var405 == 102) {
                        var5--;
                        class152 var72 = Statics.method159(field711[var5]);
                        var72.field2633 = null;
                        client.method535(var72);
                        continue;
                    }
                    if (var405 == 200) {
                        var5 -= 2;
                        int var73 = field711[var5];
                        int var74 = field711[var5 + 1];
                        class152 var75 = class152.method526(var73, var74);
                        if (var75 != null && var74 != -1) {
                            field711[var5++] = 1;
                            if (var62) {
                                Statics.field204 = var75;
                            } else {
                                Statics.field718 = var75;
                            }
                            continue;
                        }
                        field711[var5++] = 0;
                        continue;
                    }
                } else if (!(var405 < 1000 || var405 >= 1100) || !(var405 < 2000 || var405 >= 2100)) {
                    class152 var76;
                    if (var405 >= 2000) {
                        var405 -= 1000;
                        var5--;
                        var76 = Statics.method159(field711[var5]);
                    } else {
                        var76 = var62 ? Statics.field204 : Statics.field718;
                    }
                    if (var405 == 1000) {
                        var5 -= 2;
                        var76.field2535 = field711[var5];
                        var76.field2536 = field711[var5 + 1];
                        client.method535(var76);
                        continue;
                    }
                    if (var405 == 1001) {
                        var5 -= 2;
                        var76.field2575 = field711[var5];
                        var76.field2540 = field711[var5 + 1];
                        client.method535(var76);
                        continue;
                    }
                    if (var405 == 1003) {
                        var5--;
                        boolean var77 = field711[var5] == 1;
                        if (var76.field2542 != var77) {
                            var76.field2542 = var77;
                            client.method535(var76);
                        }
                        continue;
                    }
                } else if (!(var405 < 1100 || var405 >= 1200) || !(var405 < 2100 || var405 >= 2200)) {
                    class152 var78;
                    if (var405 >= 2000) {
                        var405 -= 1000;
                        var5--;
                        var78 = Statics.method159(field711[var5]);
                    } else {
                        var78 = var62 ? Statics.field204 : Statics.field718;
                    }
                    if (var405 == 1100) {
                        var5 -= 2;
                        var78.field2543 = field711[var5];
                        if (var78.field2543 > var78.field2545 - var78.field2575) {
                            var78.field2543 = var78.field2545 - var78.field2575;
                        }
                        if (var78.field2543 < 0) {
                            var78.field2543 = 0;
                        }
                        var78.field2544 = field711[var5 + 1];
                        if (var78.field2544 > var78.field2546 - var78.field2540) {
                            var78.field2544 = var78.field2546 - var78.field2540;
                        }
                        if (var78.field2544 < 0) {
                            var78.field2544 = 0;
                        }
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1101) {
                        var5--;
                        var78.field2547 = field711[var5];
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1102) {
                        var5--;
                        var78.field2551 = field711[var5] == 1;
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1103) {
                        var5--;
                        var78.field2552 = field711[var5];
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1104) {
                        var5--;
                        var78.field2553 = field711[var5];
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1105) {
                        var5--;
                        var78.field2619 = field711[var5];
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1106) {
                        var5--;
                        var78.field2556 = field711[var5];
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1107) {
                        var5--;
                        var78.field2557 = field711[var5] == 1;
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1108) {
                        var78.field2588 = 1;
                        var5--;
                        var78.field2642 = field711[var5];
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1109) {
                        var5 -= 6;
                        var78.field2568 = field711[var5];
                        var78.field2569 = field711[var5 + 1];
                        var78.field2570 = field711[var5 + 2];
                        var78.field2607 = field711[var5 + 3];
                        var78.field2608 = field711[var5 + 4];
                        var78.field2620 = field711[var5 + 5];
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1110) {
                        var5--;
                        int var79 = field711[var5];
                        if (var78.field2566 != var79) {
                            var78.field2566 = var79;
                            var78.field2532 = 0;
                            var78.field2604 = 0;
                            client.method535(var78);
                        }
                        continue;
                    }
                    if (var405 == 1111) {
                        var5--;
                        var78.field2615 = field711[var5] == 1;
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1112) {
                        var6--;
                        String var80 = field712[var6];
                        if (!var80.equals(var78.field2625)) {
                            var78.field2625 = var80;
                            client.method535(var78);
                        }
                        continue;
                    }
                    if (var405 == 1113) {
                        var5--;
                        var78.field2576 = field711[var5];
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1114) {
                        var5 -= 3;
                        var78.field2632 = field711[var5];
                        var78.field2579 = field711[var5 + 1];
                        var78.field2526 = field711[var5 + 2];
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1115) {
                        var5--;
                        var78.field2554 = field711[var5] == 1;
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1116) {
                        var5--;
                        var78.field2611 = field711[var5];
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1117) {
                        var5--;
                        var78.field2559 = field711[var5];
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1118) {
                        var5--;
                        var78.field2573 = field711[var5] == 1;
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1119) {
                        var5--;
                        var78.field2561 = field711[var5] == 1;
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1120) {
                        var5 -= 2;
                        var78.field2545 = field711[var5];
                        var78.field2546 = field711[var5 + 1];
                        client.method535(var78);
                        continue;
                    }
                    if (var405 == 1121) {
                        int var81 = var78.field2530;
                        int var82 = var78.field2531;
                        client.field300.method2389(145);
                        client.field300.method2124(var81);
                        client.field300.method2163(var82);
                        client.field423 = var78;
                        client.method535(var78);
                        continue;
                    }
                } else if (!(var405 < 1200 || var405 >= 1300) || !(var405 < 2200 || var405 >= 2300)) {
                    class152 var83;
                    if (var405 >= 2000) {
                        var405 -= 1000;
                        var5--;
                        var83 = Statics.method159(field711[var5]);
                    } else {
                        var83 = var62 ? Statics.field204 : Statics.field718;
                    }
                    client.method535(var83);
                    if (var405 == 1200) {
                        var5 -= 2;
                        int var84 = field711[var5];
                        int var85 = field711[var5 + 1];
                        var83.field2634 = var84;
                        var83.field2635 = var85;
                        class45 var86 = class45.method2057(var84);
                        var83.field2570 = var86.field1013;
                        var83.field2607 = var86.field1026;
                        var83.field2608 = var86.field1044;
                        var83.field2568 = var86.field1028;
                        var83.field2569 = var86.field1029;
                        var83.field2620 = var86.field1024;
                        if (var83.field2575 > 0) {
                            var83.field2620 = var83.field2620 * 32 / var83.field2575;
                        }
                        continue;
                    }
                    if (var405 == 1201) {
                        var83.field2588 = 2;
                        var5--;
                        var83.field2642 = field711[var5];
                        continue;
                    }
                    if (var405 == 1202) {
                        var83.field2588 = 3;
                        var83.field2642 = Statics.field578.field34.method2891();
                        continue;
                    }
                } else if (var405 >= 1300 && var405 < 1400 || var405 >= 2300 && var405 < 2400) {
                    class152 var87;
                    if (var405 >= 2000) {
                        var405 -= 1000;
                        var5--;
                        var87 = Statics.method159(field711[var5]);
                    } else {
                        var87 = var62 ? Statics.field204 : Statics.field718;
                    }
                    if (var405 == 1300) {
                        var5--;
                        int var88 = field711[var5] - 1;
                        if (var88 >= 0 && var88 <= 9) {
                            var6--;
                            var87.method2836(var88, field712[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var405 == 1301) {
                        var5 -= 2;
                        int var89 = field711[var5];
                        int var90 = field711[var5 + 1];
                        var87.field2592 = class152.method526(var89, var90);
                        continue;
                    }
                    if (var405 == 1302) {
                        var5--;
                        var87.field2595 = field711[var5] == 1;
                        continue;
                    }
                    if (var405 == 1303) {
                        var5--;
                        var87.field2593 = field711[var5];
                        continue;
                    }
                    if (var405 == 1304) {
                        var5--;
                        var87.field2594 = field711[var5];
                        continue;
                    }
                    if (var405 == 1305) {
                        var6--;
                        var87.field2590 = field712[var6];
                        continue;
                    }
                    if (var405 == 1306) {
                        var6--;
                        var87.field2596 = field712[var6];
                        continue;
                    }
                    if (var405 == 1307) {
                        var87.field2591 = null;
                        continue;
                    }
                } else {
                    if (var405 >= 1400 && var405 < 1500 || var405 >= 2400 && var405 < 2500) {
                        class152 var91;
                        if (var405 >= 2000) {
                            var405 -= 1000;
                            var5--;
                            var91 = Statics.method159(field711[var5]);
                        } else {
                            var91 = var62 ? Statics.field204 : Statics.field718;
                        }
                        var6--;
                        String var92 = field712[var6];
                        int[] var93 = null;
                        if (var92.length() > 0 && var92.charAt(var92.length() - 1) == 'Y') {
                            var5--;
                            int var94 = field711[var5];
                            if (var94 > 0) {
                                var93 = new int[var94];
                                while (var94-- > 0) {
                                    var5--;
                                    var93[var94] = field711[var5];
                                }
                            }
                            var92 = var92.substring(0, var92.length() - 1);
                        }
                        Object[] var95 = new Object[var92.length() + 1];
                        for (int var96 = var95.length - 1; var96 >= 1; var96--) {
                            if (var92.charAt(var96 - 1) == 's') {
                                var6--;
                                var95[var96] = field712[var6];
                            } else {
                                var5--;
                                var95[var96] = Integer.valueOf(field711[var5]);
                            }
                        }
                        var5--;
                        int var97 = field711[var5];
                        if (var97 == -1) {
                            var95 = null;
                        } else {
                            var95[0] = Integer.valueOf(var97);
                        }
                        if (var405 == 1400) {
                            var91.field2599 = var95;
                        }
                        if (var405 == 1401) {
                            var91.field2602 = var95;
                        }
                        if (var405 == 1402) {
                            var91.field2549 = var95;
                        }
                        if (var405 == 1403) {
                            var91.field2522 = var95;
                        }
                        if (var405 == 1404) {
                            var91.field2627 = var95;
                        }
                        if (var405 == 1405) {
                            var91.field2603 = var95;
                        }
                        if (var405 == 1406) {
                            var91.field2541 = var95;
                        }
                        if (var405 == 1407) {
                            var91.field2610 = var95;
                            var91.field2616 = var93;
                        }
                        if (var405 == 1408) {
                            var91.field2606 = var95;
                        }
                        if (var405 == 1409) {
                            var91.field2528 = var95;
                        }
                        if (var405 == 1410) {
                            var91.field2648 = var95;
                        }
                        if (var405 == 1411) {
                            var91.field2555 = var95;
                        }
                        if (var405 == 1412) {
                            var91.field2560 = var95;
                        }
                        if (var405 == 1414) {
                            var91.field2612 = var95;
                            var91.field2613 = var93;
                        }
                        if (var405 == 1415) {
                            var91.field2614 = var95;
                            var91.field2621 = var93;
                        }
                        if (var405 == 1416) {
                            var91.field2572 = var95;
                        }
                        if (var405 == 1417) {
                            var91.field2618 = var95;
                        }
                        if (var405 == 1418) {
                            var91.field2558 = var95;
                        }
                        if (var405 == 1419) {
                            var91.field2565 = var95;
                        }
                        if (var405 == 1420) {
                            var91.field2637 = var95;
                        }
                        if (var405 == 1421) {
                            var91.field2622 = var95;
                        }
                        if (var405 == 1422) {
                            var91.field2623 = var95;
                        }
                        if (var405 == 1423) {
                            var91.field2624 = var95;
                        }
                        if (var405 == 1424) {
                            var91.field2617 = var95;
                        }
                        var91.field2597 = true;
                        continue;
                    }
                    if (var405 < 1600) {
                        class152 var98 = var62 ? Statics.field204 : Statics.field718;
                        if (var405 == 1500) {
                            field711[var5++] = var98.field2535;
                            continue;
                        }
                        if (var405 == 1501) {
                            field711[var5++] = var98.field2536;
                            continue;
                        }
                        if (var405 == 1502) {
                            field711[var5++] = var98.field2575;
                            continue;
                        }
                        if (var405 == 1503) {
                            field711[var5++] = var98.field2540;
                            continue;
                        }
                        if (var405 == 1504) {
                            field711[var5++] = var98.field2542 ? 1 : 0;
                            continue;
                        }
                        if (var405 == 1505) {
                            field711[var5++] = var98.field2582;
                            continue;
                        }
                    } else if (var405 < 1700) {
                        class152 var99 = var62 ? Statics.field204 : Statics.field718;
                        if (var405 == 1600) {
                            field711[var5++] = var99.field2543;
                            continue;
                        }
                        if (var405 == 1601) {
                            field711[var5++] = var99.field2544;
                            continue;
                        }
                        if (var405 == 1602) {
                            field712[var6++] = var99.field2625;
                            continue;
                        }
                        if (var405 == 1603) {
                            field711[var5++] = var99.field2545;
                            continue;
                        }
                        if (var405 == 1604) {
                            field711[var5++] = var99.field2546;
                            continue;
                        }
                        if (var405 == 1605) {
                            field711[var5++] = var99.field2620;
                            continue;
                        }
                        if (var405 == 1606) {
                            field711[var5++] = var99.field2570;
                            continue;
                        }
                        if (var405 == 1607) {
                            field711[var5++] = var99.field2608;
                            continue;
                        }
                        if (var405 == 1608) {
                            field711[var5++] = var99.field2607;
                            continue;
                        }
                    } else if (var405 < 1800) {
                        class152 var100 = var62 ? Statics.field204 : Statics.field718;
                        if (var405 == 1700) {
                            field711[var5++] = var100.field2634;
                            continue;
                        }
                        if (var405 == 1701) {
                            if (var100.field2634 == -1) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = var100.field2635;
                            }
                            continue;
                        }
                        if (var405 == 1702) {
                            field711[var5++] = var100.field2531;
                            continue;
                        }
                    } else if (var405 < 1900) {
                        class152 var101 = var62 ? Statics.field204 : Statics.field718;
                        if (var405 == 1800) {
                            field711[var5++] = class156.method570(Statics.method2146(var101));
                            continue;
                        }
                        if (var405 == 1801) {
                            var5--;
                            int var102 = field711[var5];
                            int var406 = var102 - 1;
                            if (var101.field2591 != null && var406 < var101.field2591.length && var101.field2591[var406] != null) {
                                field712[var6++] = var101.field2591[var406];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var405 == 1802) {
                            if (var101.field2590 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = var101.field2590;
                            }
                            continue;
                        }
                    } else if (var405 < 2600) {
                        var5--;
                        class152 var103 = Statics.method159(field711[var5]);
                        if (var405 == 2500) {
                            field711[var5++] = var103.field2535;
                            continue;
                        }
                        if (var405 == 2501) {
                            field711[var5++] = var103.field2536;
                            continue;
                        }
                        if (var405 == 2502) {
                            field711[var5++] = var103.field2575;
                            continue;
                        }
                        if (var405 == 2503) {
                            field711[var5++] = var103.field2540;
                            continue;
                        }
                        if (var405 == 2504) {
                            field711[var5++] = var103.field2542 ? 1 : 0;
                            continue;
                        }
                        if (var405 == 2505) {
                            field711[var5++] = var103.field2582;
                            continue;
                        }
                    } else if (var405 < 2700) {
                        var5--;
                        class152 var104 = Statics.method159(field711[var5]);
                        if (var405 == 2600) {
                            field711[var5++] = var104.field2543;
                            continue;
                        }
                        if (var405 == 2601) {
                            field711[var5++] = var104.field2544;
                            continue;
                        }
                        if (var405 == 2602) {
                            field712[var6++] = var104.field2625;
                            continue;
                        }
                        if (var405 == 2603) {
                            field711[var5++] = var104.field2545;
                            continue;
                        }
                        if (var405 == 2604) {
                            field711[var5++] = var104.field2546;
                            continue;
                        }
                        if (var405 == 2605) {
                            field711[var5++] = var104.field2620;
                            continue;
                        }
                        if (var405 == 2606) {
                            field711[var5++] = var104.field2570;
                            continue;
                        }
                        if (var405 == 2607) {
                            field711[var5++] = var104.field2608;
                            continue;
                        }
                        if (var405 == 2608) {
                            field711[var5++] = var104.field2607;
                            continue;
                        }
                    } else if (var405 < 2800) {
                        if (var405 == 2700) {
                            var5--;
                            class152 var105 = Statics.method159(field711[var5]);
                            field711[var5++] = var105.field2634;
                            continue;
                        }
                        if (var405 == 2701) {
                            var5--;
                            class152 var106 = Statics.method159(field711[var5]);
                            if (var106.field2634 == -1) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = var106.field2635;
                            }
                            continue;
                        }
                        if (var405 == 2702) {
                            var5--;
                            int var107 = field711[var5];
                            class4 var108 = (class4) client.field420.method3157((long) var107);
                            if (var108 == null) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var405 < 2900) {
                        var5--;
                        class152 var109 = Statics.method159(field711[var5]);
                        if (var405 == 2800) {
                            field711[var5++] = class156.method570(Statics.method2146(var109));
                            continue;
                        }
                        if (var405 == 2801) {
                            var5--;
                            int var110 = field711[var5];
                            int var407 = var110 - 1;
                            if (var109.field2591 != null && var407 < var109.field2591.length && var109.field2591[var407] != null) {
                                field712[var6++] = var109.field2591[var407];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var405 == 2802) {
                            if (var109.field2590 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = var109.field2590;
                            }
                            continue;
                        }
                    } else if (var405 < 3200) {
                        if (var405 == 3100) {
                            var6--;
                            String var111 = field712[var6];
                            class10.method88(0, "", var111);
                            continue;
                        }
                        if (var405 == 3101) {
                            var5 -= 2;
                            client.method1974(Statics.field578, field711[var5], field711[var5 + 1]);
                            continue;
                        }
                        if (var405 == 3103) {
                            Statics.method565();
                            continue;
                        }
                        if (var405 == 3104) {
                            var6--;
                            String var112 = field712[var6];
                            int var113 = 0;
                            if (class197.method167(var112)) {
                                int var114 = class197.method308(var112, 10, true);
                                var113 = var114;
                            }
                            client.field300.method2389(138);
                            client.field300.method2124(var113);
                            continue;
                        }
                        if (var405 == 3105) {
                            var6--;
                            String var115 = field712[var6];
                            client.field300.method2389(81);
                            client.field300.method2242(var115.length() + 1);
                            client.field300.method2126(var115);
                            continue;
                        }
                        if (var405 == 3106) {
                            var6--;
                            String var116 = field712[var6];
                            client.field300.method2389(115);
                            client.field300.method2242(var116.length() + 1);
                            client.field300.method2126(var116);
                            continue;
                        }
                        if (var405 == 3107) {
                            var5--;
                            int var117 = field711[var5];
                            var6--;
                            String var118 = field712[var6];
                            client.method75(var117, var118);
                            continue;
                        }
                        if (var405 == 3108) {
                            var5 -= 3;
                            int var119 = field711[var5];
                            int var120 = field711[var5 + 1];
                            int var121 = field711[var5 + 2];
                            class152 var122 = Statics.method159(var121);
                            client.method2347(var122, var119, var120);
                            continue;
                        }
                        if (var405 == 3109) {
                            var5 -= 2;
                            int var123 = field711[var5];
                            int var124 = field711[var5 + 1];
                            class152 var125 = var62 ? Statics.field204 : Statics.field718;
                            client.method2347(var125, var123, var124);
                            continue;
                        }
                        if (var405 == 3110) {
                            var5--;
                            Statics.field1901 = field711[var5] == 1;
                            continue;
                        }
                        if (var405 == 3111) {
                            field711[var5++] = Statics.field250.field140 ? 1 : 0;
                            continue;
                        }
                        if (var405 == 3112) {
                            var5--;
                            Statics.field250.field140 = field711[var5] == 1;
                            class9.method2680();
                            continue;
                        }
                        if (var405 == 3113) {
                            var6--;
                            String var126 = field712[var6];
                            var5--;
                            boolean var127 = field711[var5] == 1;
                            if (!var127) {
                                class125.method2532(var126, 3, "openjs");
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var126));
                                    continue;
                                } catch (Exception var403) {
                                }
                            }
                            if (class125.field1981.startsWith("win")) {
                                class125.method2532(var126, 0, "openjs");
                            } else if (class125.field1981.startsWith("mac")) {
                                class125.method2532(var126, 1, "openjs");
                            } else {
                                class125.method2532(var126, 2, "openjs");
                            }
                            continue;
                        }
                    } else if (var405 < 3300) {
                        if (var405 == 3200) {
                            var5 -= 3;
                            client.method157(field711[var5], field711[var5 + 1], field711[var5 + 2]);
                            continue;
                        }
                        if (var405 == 3201) {
                            var5--;
                            client.method1886(field711[var5]);
                            continue;
                        }
                        if (var405 == 3202) {
                            var5 -= 2;
                            client.method2825(field711[var5], field711[var5 + 1]);
                            continue;
                        }
                    } else if (var405 < 3400) {
                        if (var405 == 3300) {
                            field711[var5++] = client.field376;
                            continue;
                        }
                        if (var405 == 3301) {
                            var5 -= 2;
                            int var129 = field711[var5];
                            int var130 = field711[var5 + 1];
                            int[] var131 = field711;
                            int var132 = var5++;
                            class14 var133 = (class14) class14.field203.method3157((long) var129);
                            int var134;
                            if (var133 == null) {
                                var134 = -1;
                            } else if (var130 >= 0 && var130 < var133.field202.length) {
                                var134 = var133.field202[var130];
                            } else {
                                var134 = -1;
                            }
                            var131[var132] = var134;
                            continue;
                        }
                        if (var405 == 3302) {
                            var5 -= 2;
                            int var135 = field711[var5];
                            int var136 = field711[var5 + 1];
                            field711[var5++] = class14.method2462(var135, var136);
                            continue;
                        }
                        if (var405 == 3303) {
                            var5 -= 2;
                            int var137 = field711[var5];
                            int var138 = field711[var5 + 1];
                            field711[var5++] = class14.method76(var137, var138);
                            continue;
                        }
                        if (var405 == 3304) {
                            var5--;
                            int var139 = field711[var5];
                            field711[var5++] = class44.method722(var139).field1006;
                            continue;
                        }
                        if (var405 == 3305) {
                            var5--;
                            int var140 = field711[var5];
                            field711[var5++] = client.field397[var140];
                            continue;
                        }
                        if (var405 == 3306) {
                            var5--;
                            int var141 = field711[var5];
                            field711[var5++] = client.field398[var141];
                            continue;
                        }
                        if (var405 == 3307) {
                            var5--;
                            int var142 = field711[var5];
                            field711[var5++] = client.field399[var142];
                            continue;
                        }
                        if (var405 == 3308) {
                            int var143 = Statics.field1762;
                            int var144 = (Statics.field578.field762 >> 7) + Statics.field982;
                            int var145 = (Statics.field578.field726 >> 7) + Statics.field169;
                            field711[var5++] = (var143 << 28) + (var144 << 14) + var145;
                            continue;
                        }
                        if (var405 == 3309) {
                            var5--;
                            int var146 = field711[var5];
                            field711[var5++] = var146 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var405 == 3310) {
                            var5--;
                            int var147 = field711[var5];
                            field711[var5++] = var147 >> 28;
                            continue;
                        }
                        if (var405 == 3311) {
                            var5--;
                            int var148 = field711[var5];
                            field711[var5++] = var148 & 0x3FFF;
                            continue;
                        }
                        if (var405 == 3312) {
                            field711[var5++] = client.field263 ? 1 : 0;
                            continue;
                        }
                        if (var405 == 3313) {
                            var5 -= 2;
                            int var149 = field711[var5] + 32768;
                            int var150 = field711[var5 + 1];
                            int[] var151 = field711;
                            int var152 = var5++;
                            class14 var153 = (class14) class14.field203.method3157((long) var149);
                            int var154;
                            if (var153 == null) {
                                var154 = -1;
                            } else if (var150 >= 0 && var150 < var153.field202.length) {
                                var154 = var153.field202[var150];
                            } else {
                                var154 = -1;
                            }
                            var151[var152] = var154;
                            continue;
                        }
                        if (var405 == 3314) {
                            var5 -= 2;
                            int var155 = field711[var5] + 32768;
                            int var156 = field711[var5 + 1];
                            field711[var5++] = class14.method2462(var155, var156);
                            continue;
                        }
                        if (var405 == 3315) {
                            var5 -= 2;
                            int var157 = field711[var5] + 32768;
                            int var158 = field711[var5 + 1];
                            field711[var5++] = class14.method76(var157, var158);
                            continue;
                        }
                        if (var405 == 3316) {
                            if (client.field453 >= 2) {
                                field711[var5++] = client.field453;
                            } else {
                                field711[var5++] = 0;
                            }
                            continue;
                        }
                        if (var405 == 3317) {
                            field711[var5++] = client.field275;
                            continue;
                        }
                        if (var405 == 3318) {
                            field711[var5++] = client.field273;
                            continue;
                        }
                        if (var405 == 3321) {
                            field711[var5++] = client.field424;
                            continue;
                        }
                        if (var405 == 3322) {
                            field711[var5++] = client.field425;
                            continue;
                        }
                        if (var405 == 3323) {
                            if (client.field428) {
                                field711[var5++] = 1;
                            } else {
                                field711[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var405 < 3500) {
                        if (var405 == 3400) {
                            var5 -= 2;
                            int var159 = field711[var5];
                            int var160 = field711[var5 + 1];
                            class43 var161 = class43.method2070(var159);
                            if (var161.field992 != 's') {
                            }
                            for (int var162 = 0; var162 < var161.field998; var162++) {
                                if (var161.field996[var162] == var160) {
                                    field712[var6++] = var161.field994[var162];
                                    var161 = null;
                                    break;
                                }
                            }
                            if (var161 != null) {
                                field712[var6++] = var161.field993;
                            }
                            continue;
                        }
                        if (var405 == 3408) {
                            var5 -= 4;
                            int var163 = field711[var5];
                            int var164 = field711[var5 + 1];
                            int var165 = field711[var5 + 2];
                            int var166 = field711[var5 + 3];
                            class43 var167 = class43.method2070(var165);
                            if (var167.field991 == var163 && var167.field992 == var164) {
                                for (int var168 = 0; var168 < var167.field998; var168++) {
                                    if (var167.field996[var168] == var166) {
                                        if (var164 == 115) {
                                            field712[var6++] = var167.field994[var168];
                                        } else {
                                            field711[var5++] = var167.field997[var168];
                                        }
                                        var167 = null;
                                        break;
                                    }
                                }
                                if (var167 != null) {
                                    if (var164 == 115) {
                                        field712[var6++] = var167.field993;
                                    } else {
                                        field711[var5++] = var167.field995;
                                    }
                                }
                                continue;
                            }
                            if (var164 == 115) {
                                field712[var6++] = "null";
                            } else {
                                field711[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var405 < 3700) {
                        if (var405 == 3600) {
                            if (client.field488 == 0) {
                                field711[var5++] = -2;
                            } else if (client.field488 == 1) {
                                field711[var5++] = -1;
                            } else {
                                field711[var5++] = client.field508;
                            }
                            continue;
                        }
                        if (var405 == 3601) {
                            var5--;
                            int var169 = field711[var5];
                            if (client.field488 == 2 && var169 < client.field508) {
                                field712[var6++] = client.field510[var169].field232;
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var405 == 3602) {
                            var5--;
                            int var170 = field711[var5];
                            if (client.field488 == 2 && var170 < client.field508) {
                                field711[var5++] = client.field510[var170].field228;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var405 == 3603) {
                            var5--;
                            int var171 = field711[var5];
                            if (client.field488 == 2 && var171 < client.field508) {
                                field711[var5++] = client.field510[var171].field229;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var405 == 3604) {
                            var6--;
                            String var172 = field712[var6];
                            var5--;
                            int var173 = field711[var5];
                            client.field300.method2389(241);
                            client.field300.method2242(class107.method1611(var172) + 1);
                            client.field300.method2126(var172);
                            client.field300.method2120(var173);
                            continue;
                        }
                        if (var405 == 3605) {
                            var6--;
                            String var174 = field712[var6];
                            if (var174 == null) {
                                continue;
                            }
                            if ((client.field508 < 200 || client.field380 == 1) && client.field508 < 400) {
                                String var175 = class198.method1884(var174, Statics.field1847);
                                if (var175 == null) {
                                    continue;
                                }
                                for (int var176 = 0; var176 < client.field508; var176++) {
                                    class16 var177 = client.field510[var176];
                                    String var178 = class198.method1884(var177.field232, Statics.field1847);
                                    if (var178 != null && var178.equals(var175)) {
                                        class10.method88(30, "", var174 + class142.field2313);
                                        continue label2471;
                                    }
                                    if (var177.field227 != null) {
                                        String var179 = class198.method1884(var177.field227, Statics.field1847);
                                        if (var179 != null && var179.equals(var175)) {
                                            class10.method88(30, "", var174 + class142.field2313);
                                            continue label2471;
                                        }
                                    }
                                }
                                for (int var180 = 0; var180 < client.field512; var180++) {
                                    class8 var181 = client.field513[var180];
                                    String var182 = class198.method1884(var181.field129, Statics.field1847);
                                    if (var182 != null && var182.equals(var175)) {
                                        class10.method88(30, "", class142.field2286 + var174 + class142.field2319);
                                        continue label2471;
                                    }
                                    if (var181.field130 != null) {
                                        String var183 = class198.method1884(var181.field130, Statics.field1847);
                                        if (var183 != null && var183.equals(var175)) {
                                            class10.method88(30, "", class142.field2286 + var174 + class142.field2319);
                                            continue label2471;
                                        }
                                    }
                                }
                                if (class198.method1884(Statics.field578.field46, Statics.field1847).equals(var175)) {
                                    class10.method88(30, "", class142.field2156);
                                } else {
                                    client.field300.method2389(38);
                                    client.field300.method2242(class107.method1611(var174));
                                    client.field300.method2126(var174);
                                }
                                continue;
                            }
                            class10.method88(30, "", class142.field2312);
                            continue;
                        }
                        if (var405 == 3606) {
                            var6--;
                            String var184 = field712[var6];
                            client.method568(var184);
                            continue;
                        }
                        if (var405 == 3607) {
                            var6--;
                            String var185 = field712[var6];
                            client.method2780(var185, false);
                            continue;
                        }
                        if (var405 == 3608) {
                            var6--;
                            String var186 = field712[var6];
                            if (var186 == null) {
                                continue;
                            }
                            String var187 = class198.method1884(var186, Statics.field1847);
                            if (var187 == null) {
                                continue;
                            }
                            int var188 = 0;
                            while (true) {
                                if (var188 >= client.field512) {
                                    continue label2471;
                                }
                                class8 var189 = client.field513[var188];
                                String var190 = var189.field129;
                                String var191 = class198.method1884(var190, Statics.field1847);
                                boolean var192;
                                if (var186 == null || var190 == null) {
                                    var192 = false;
                                } else if (var186.startsWith("#") || var190.startsWith("#")) {
                                    var192 = var186.equals(var190);
                                } else {
                                    var192 = var187.equals(var191);
                                }
                                if (var192) {
                                    client.field512--;
                                    for (int var193 = var188; var193 < client.field512; var193++) {
                                        client.field513[var193] = client.field513[var193 + 1];
                                    }
                                    client.field452 = client.field443;
                                    client.field300.method2389(1);
                                    class110 var194 = client.field300;
                                    int var195 = var186.length() + 1;
                                    var194.method2242(var195);
                                    client.field300.method2126(var186);
                                    continue label2471;
                                }
                                var188++;
                            }
                        }
                        if (var405 == 3609) {
                            var6--;
                            String var196 = field712[var6];
                            if (var196.startsWith(class2.method3107(0)) || var196.startsWith(class2.method3107(1))) {
                                var196 = var196.substring(7);
                            }
                            field711[var5++] = client.method2538(var196, false) ? 1 : 0;
                            continue;
                        }
                        if (var405 == 3611) {
                            if (client.field427 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = class196.method2768(client.field427);
                            }
                            continue;
                        }
                        if (var405 == 3612) {
                            if (client.field427 == null) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = Statics.field2029;
                            }
                            continue;
                        }
                        if (var405 == 3613) {
                            var5--;
                            int var197 = field711[var5];
                            if (client.field427 != null && var197 < Statics.field2029) {
                                field712[var6++] = Statics.field1452[var197].field567;
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var405 == 3614) {
                            var5--;
                            int var198 = field711[var5];
                            if (client.field427 != null && var198 < Statics.field2029) {
                                field711[var5++] = Statics.field1452[var198].field561;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var405 == 3615) {
                            var5--;
                            int var199 = field711[var5];
                            if (client.field427 != null && var199 < Statics.field2029) {
                                field711[var5++] = Statics.field1452[var199].field562;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var405 == 3616) {
                            field711[var5++] = Statics.field53;
                            continue;
                        }
                        if (var405 == 3617) {
                            var6--;
                            String var200 = field712[var6];
                            if (Statics.field1452 != null) {
                                client.field300.method2389(10);
                                client.field300.method2242(class107.method1611(var200));
                                client.field300.method2126(var200);
                            }
                            continue;
                        }
                        if (var405 == 3618) {
                            field711[var5++] = Statics.field154;
                            continue;
                        }
                        if (var405 == 3619) {
                            var6--;
                            String var201 = field712[var6];
                            client.method876(var201);
                            continue;
                        }
                        if (var405 == 3620) {
                            client.field300.method2389(153);
                            client.field300.method2242(0);
                            continue;
                        }
                        if (var405 == 3621) {
                            if (client.field488 == 0) {
                                field711[var5++] = -1;
                            } else {
                                field711[var5++] = client.field512;
                            }
                            continue;
                        }
                        if (var405 == 3622) {
                            var5--;
                            int var202 = field711[var5];
                            if (client.field488 != 0 && var202 < client.field512) {
                                field712[var6++] = client.field513[var202].field129;
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var405 == 3623) {
                            var6--;
                            String var203 = field712[var6];
                            if (var203.startsWith(class2.method3107(0)) || var203.startsWith(class2.method3107(1))) {
                                var203 = var203.substring(7);
                            }
                            field711[var5++] = client.method25(var203) ? 1 : 0;
                            continue;
                        }
                        if (var405 == 3624) {
                            var5--;
                            int var204 = field711[var5];
                            if (Statics.field1452 != null && var204 < Statics.field2029 && Statics.field1452[var204].field567.equalsIgnoreCase(Statics.field578.field46)) {
                                field711[var5++] = 1;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var405 == 3625) {
                            if (client.field482 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = class196.method2768(client.field482);
                            }
                            continue;
                        }
                    } else if (var405 < 4100) {
                        if (var405 == 4000) {
                            var5 -= 2;
                            int var205 = field711[var5];
                            int var206 = field711[var5 + 1];
                            field711[var5++] = var205 + var206;
                            continue;
                        }
                        if (var405 == 4001) {
                            var5 -= 2;
                            int var207 = field711[var5];
                            int var208 = field711[var5 + 1];
                            field711[var5++] = var207 - var208;
                            continue;
                        }
                        if (var405 == 4002) {
                            var5 -= 2;
                            int var209 = field711[var5];
                            int var210 = field711[var5 + 1];
                            field711[var5++] = var209 * var210;
                            continue;
                        }
                        if (var405 == 4003) {
                            var5 -= 2;
                            int var211 = field711[var5];
                            int var212 = field711[var5 + 1];
                            field711[var5++] = var211 / var212;
                            continue;
                        }
                        if (var405 == 4004) {
                            var5--;
                            int var213 = field711[var5];
                            field711[var5++] = (int) (Math.random() * (double) var213);
                            continue;
                        }
                        if (var405 == 4005) {
                            var5--;
                            int var214 = field711[var5];
                            field711[var5++] = (int) (Math.random() * (double) (var214 + 1));
                            continue;
                        }
                        if (var405 == 4006) {
                            var5 -= 5;
                            int var215 = field711[var5];
                            int var216 = field711[var5 + 1];
                            int var217 = field711[var5 + 2];
                            int var218 = field711[var5 + 3];
                            int var219 = field711[var5 + 4];
                            field711[var5++] = (var216 - var215) * (var219 - var217) / (var218 - var217) + var215;
                            continue;
                        }
                        if (var405 == 4007) {
                            var5 -= 2;
                            int var220 = field711[var5];
                            int var221 = field711[var5 + 1];
                            field711[var5++] = var220 * var221 / 100 + var220;
                            continue;
                        }
                        if (var405 == 4008) {
                            var5 -= 2;
                            int var222 = field711[var5];
                            int var223 = field711[var5 + 1];
                            field711[var5++] = var222 | 0x1 << var223;
                            continue;
                        }
                        if (var405 == 4009) {
                            var5 -= 2;
                            int var224 = field711[var5];
                            int var225 = field711[var5 + 1];
                            field711[var5++] = var224 & -1 - (0x1 << var225);
                            continue;
                        }
                        if (var405 == 4010) {
                            var5 -= 2;
                            int var226 = field711[var5];
                            int var227 = field711[var5 + 1];
                            field711[var5++] = (var226 & 0x1 << var227) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var405 == 4011) {
                            var5 -= 2;
                            int var228 = field711[var5];
                            int var229 = field711[var5 + 1];
                            field711[var5++] = var228 % var229;
                            continue;
                        }
                        if (var405 == 4012) {
                            var5 -= 2;
                            int var230 = field711[var5];
                            int var231 = field711[var5 + 1];
                            if (var230 == 0) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = (int) Math.pow((double) var230, (double) var231);
                            }
                            continue;
                        }
                        if (var405 == 4013) {
                            var5 -= 2;
                            int var232 = field711[var5];
                            int var233 = field711[var5 + 1];
                            if (var232 == 0) {
                                field711[var5++] = 0;
                            } else if (var233 == 0) {
                                field711[var5++] = Integer.MAX_VALUE;
                            } else {
                                field711[var5++] = (int) Math.pow((double) var232, 1.0D / (double) var233);
                            }
                            continue;
                        }
                        if (var405 == 4014) {
                            var5 -= 2;
                            int var234 = field711[var5];
                            int var235 = field711[var5 + 1];
                            field711[var5++] = var234 & var235;
                            continue;
                        }
                        if (var405 == 4015) {
                            var5 -= 2;
                            int var236 = field711[var5];
                            int var237 = field711[var5 + 1];
                            field711[var5++] = var236 | var237;
                            continue;
                        }
                    } else if (var405 < 4200) {
                        if (var405 == 4100) {
                            var6--;
                            String var238 = field712[var6];
                            var5--;
                            int var239 = field711[var5];
                            field712[var6++] = var238 + var239;
                            continue;
                        }
                        if (var405 == 4101) {
                            var6 -= 2;
                            String var240 = field712[var6];
                            String var241 = field712[var6 + 1];
                            field712[var6++] = var240 + var241;
                            continue;
                        }
                        if (var405 == 4102) {
                            var6--;
                            String var242 = field712[var6];
                            var5--;
                            int var243 = field711[var5];
                            String[] var244 = field712;
                            int var245 = var6++;
                            String var247;
                            if (var243 < 0) {
                                var247 = Integer.toString(var243);
                            } else {
                                int var248 = var243;
                                String var249;
                                if (var243 < 0) {
                                    var249 = Integer.toString(var243, 10);
                                } else {
                                    int var250 = 2;
                                    int var251 = var243 / 10;
                                    while (var251 != 0) {
                                        var251 /= 10;
                                        var250++;
                                    }
                                    char[] var252 = new char[var250];
                                    var252[0] = '+';
                                    for (int var253 = var250 - 1; var253 > 0; var253--) {
                                        int var254 = var248;
                                        var248 /= 10;
                                        int var255 = var254 - var248 * 10;
                                        if (var255 >= 10) {
                                            var252[var253] = (char) (var255 + 87);
                                        } else {
                                            var252[var253] = (char) (var255 + 48);
                                        }
                                    }
                                    var249 = new String(var252);
                                }
                                var247 = var249;
                            }
                            var244[var245] = var242 + var247;
                            continue;
                        }
                        if (var405 == 4103) {
                            var6--;
                            String var256 = field712[var6];
                            field712[var6++] = var256.toLowerCase();
                            continue;
                        }
                        if (var405 == 4104) {
                            var5--;
                            int var257 = field711[var5];
                            long var258 = ((long) var257 + 11745L) * 86400000L;
                            field716.setTime(new Date(var258));
                            int var260 = field716.get(5);
                            int var261 = field716.get(2);
                            int var262 = field716.get(1);
                            field712[var6++] = var260 + "-" + field713[var261] + "-" + var262;
                            continue;
                        }
                        if (var405 == 4105) {
                            var6 -= 2;
                            String var263 = field712[var6];
                            String var264 = field712[var6 + 1];
                            if (Statics.field578.field34 != null && Statics.field578.field34.field2670) {
                                field712[var6++] = var264;
                                continue;
                            }
                            field712[var6++] = var263;
                            continue;
                        }
                        if (var405 == 4106) {
                            var5--;
                            int var265 = field711[var5];
                            field712[var6++] = Integer.toString(var265);
                            continue;
                        }
                        if (var405 == 4107) {
                            var6 -= 2;
                            int[] var266 = field711;
                            int var267 = var5++;
                            String var268 = field712[var6];
                            String var269 = field712[var6 + 1];
                            int var270 = client.field265;
                            int var271 = var268.length();
                            int var272 = var269.length();
                            int var273 = 0;
                            int var274 = 0;
                            byte var275 = 0;
                            char var276 = 0;
                            int var277;
                            label2303: while (true) {
                                if (var273 - var275 >= var271 && var274 - var276 >= var272) {
                                    int var287 = Math.min(var271, var272);
                                    for (int var288 = 0; var288 < var287; var288++) {
                                        char var291 = var268.charAt(var288);
                                        char var292 = var269.charAt(var288);
                                        if (var291 != var292 && Character.toUpperCase(var291) != Character.toUpperCase(var292)) {
                                            char var293 = Character.toLowerCase(var291);
                                            char var294 = Character.toLowerCase(var292);
                                            if (var293 != var294) {
                                                var277 = class200.method1969(var293, var270) - class200.method1969(var294, var270);
                                                break label2303;
                                            }
                                        }
                                    }
                                    int var295 = var271 - var272;
                                    if (var295 == 0) {
                                        for (int var296 = 0; var296 < var287; var296++) {
                                            char var297 = var268.charAt(var296);
                                            char var298 = var269.charAt(var296);
                                            if (var297 != var298) {
                                                var277 = class200.method1969(var297, var270) - class200.method1969(var298, var270);
                                                break label2303;
                                            }
                                        }
                                        var277 = 0;
                                    } else {
                                        var277 = var295;
                                    }
                                    break;
                                }
                                if (var273 - var275 >= var271) {
                                    var277 = -1;
                                    break;
                                }
                                if (var274 - var276 >= var272) {
                                    var277 = 1;
                                    break;
                                }
                                char var278;
                                if (var275 == 0) {
                                    var278 = var268.charAt(var273++);
                                } else {
                                    var278 = (char) var275;
                                    boolean var279 = false;
                                }
                                char var280;
                                if (var276 == 0) {
                                    var280 = var269.charAt(var274++);
                                } else {
                                    var280 = var276;
                                    boolean var281 = false;
                                }
                                byte var282;
                                if (var278 == 198) {
                                    var282 = 69;
                                } else if (var278 == 230) {
                                    var282 = 101;
                                } else if (var278 == 223) {
                                    var282 = 115;
                                } else if (var278 == 338) {
                                    var282 = 69;
                                } else if (var278 == 339) {
                                    var282 = 101;
                                } else {
                                    var282 = 0;
                                }
                                var275 = var282;
                                var276 = class200.method779(var280);
                                char var283 = class200.method3275(var278, var270);
                                char var284 = class200.method3275(var280, var270);
                                if (var283 != var284 && Character.toUpperCase(var283) != Character.toUpperCase(var284)) {
                                    char var285 = Character.toLowerCase(var283);
                                    char var286 = Character.toLowerCase(var284);
                                    if (var285 != var286) {
                                        var277 = class200.method1969(var285, var270) - class200.method1969(var286, var270);
                                        break;
                                    }
                                }
                            }
                            byte var300;
                            if (var277 > 0) {
                                var300 = 1;
                            } else if (var277 < 0) {
                                var300 = -1;
                            } else {
                                var300 = 0;
                            }
                            var266[var267] = var300;
                            continue;
                        }
                        if (var405 == 4108) {
                            var6--;
                            String var301 = field712[var6];
                            var5 -= 2;
                            int var302 = field711[var5];
                            int var303 = field711[var5 + 1];
                            byte[] var304 = Statics.field1560.method2692(var303, 0);
                            class191 var305 = new class191(var304);
                            field711[var5++] = var305.method3381(var301, var302);
                            continue;
                        }
                        if (var405 == 4109) {
                            var6--;
                            String var306 = field712[var6];
                            var5 -= 2;
                            int var307 = field711[var5];
                            int var308 = field711[var5 + 1];
                            byte[] var309 = Statics.field1560.method2692(var308, 0);
                            class191 var310 = new class191(var309);
                            field711[var5++] = var310.method3305(var306, var307);
                            continue;
                        }
                        if (var405 == 4110) {
                            var6 -= 2;
                            String var311 = field712[var6];
                            String var312 = field712[var6 + 1];
                            var5--;
                            if (field711[var5] == 1) {
                                field712[var6++] = var311;
                            } else {
                                field712[var6++] = var312;
                            }
                            continue;
                        }
                        if (var405 == 4111) {
                            var6--;
                            String var313 = field712[var6];
                            field712[var6++] = class190.method3300(var313);
                            continue;
                        }
                        if (var405 == 4112) {
                            var6--;
                            String var314 = field712[var6];
                            var5--;
                            int var315 = field711[var5];
                            field712[var6++] = var314 + (char) var315;
                            continue;
                        }
                        if (var405 == 4113) {
                            var5--;
                            int var316 = field711[var5];
                            field711[var5++] = class197.method2688((char) var316) ? 1 : 0;
                            continue;
                        }
                        if (var405 == 4114) {
                            var5--;
                            int var317 = field711[var5];
                            int[] var318 = field711;
                            int var319 = var5++;
                            char var320 = (char) var317;
                            boolean var321 = var320 >= '0' && var320 <= '9' || var320 >= 'A' && var320 <= 'Z' || var320 >= 'a' && var320 <= 'z';
                            var318[var319] = var321 ? 1 : 0;
                            continue;
                        }
                        if (var405 == 4115) {
                            var5--;
                            int var322 = field711[var5];
                            int[] var323 = field711;
                            int var324 = var5++;
                            char var325 = (char) var322;
                            boolean var326 = var325 >= 'A' && var325 <= 'Z' || var325 >= 'a' && var325 <= 'z';
                            var323[var324] = var326 ? 1 : 0;
                            continue;
                        }
                        if (var405 == 4116) {
                            var5--;
                            int var327 = field711[var5];
                            int[] var328 = field711;
                            int var329 = var5++;
                            char var330 = (char) var327;
                            boolean var331 = var330 >= '0' && var330 <= '9';
                            var328[var329] = var331 ? 1 : 0;
                            continue;
                        }
                        if (var405 == 4117) {
                            var6--;
                            String var332 = field712[var6];
                            if (var332 == null) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = var332.length();
                            }
                            continue;
                        }
                        if (var405 == 4118) {
                            var6--;
                            String var333 = field712[var6];
                            var5 -= 2;
                            int var334 = field711[var5];
                            int var335 = field711[var5 + 1];
                            field712[var6++] = var333.substring(var334, var335);
                            continue;
                        }
                        if (var405 == 4119) {
                            var6--;
                            String var336 = field712[var6];
                            StringBuilder var337 = new StringBuilder(var336.length());
                            boolean var338 = false;
                            for (int var339 = 0; var339 < var336.length(); var339++) {
                                char var340 = var336.charAt(var339);
                                if (var340 == '<') {
                                    var338 = true;
                                } else if (var340 == '>') {
                                    var338 = false;
                                } else if (!var338) {
                                    var337.append(var340);
                                }
                            }
                            field712[var6++] = var337.toString();
                            continue;
                        }
                        if (var405 == 4120) {
                            var6--;
                            String var341 = field712[var6];
                            var5--;
                            int var342 = field711[var5];
                            field711[var5++] = var341.indexOf(var342);
                            continue;
                        }
                        if (var405 == 4121) {
                            var6 -= 2;
                            String var343 = field712[var6];
                            String var344 = field712[var6 + 1];
                            var5--;
                            int var345 = field711[var5];
                            field711[var5++] = var343.indexOf(var344, var345);
                            continue;
                        }
                    } else if (var405 < 4300) {
                        if (var405 == 4200) {
                            var5--;
                            int var346 = field711[var5];
                            field712[var6++] = class45.method2057(var346).field1019;
                            continue;
                        }
                        if (var405 == 4201) {
                            var5 -= 2;
                            int var347 = field711[var5];
                            int var348 = field711[var5 + 1];
                            class45 var349 = class45.method2057(var347);
                            if (var348 >= 1 && var348 <= 5 && var349.field1033[var348 - 1] != null) {
                                field712[var6++] = var349.field1033[var348 - 1];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var405 == 4202) {
                            var5 -= 2;
                            int var350 = field711[var5];
                            int var351 = field711[var5 + 1];
                            class45 var352 = class45.method2057(var350);
                            if (var351 >= 1 && var351 <= 5 && var352.field1034[var351 - 1] != null) {
                                field712[var6++] = var352.field1034[var351 - 1];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var405 == 4203) {
                            var5--;
                            int var353 = field711[var5];
                            field711[var5++] = class45.method2057(var353).field1023;
                            continue;
                        }
                        if (var405 == 4204) {
                            var5--;
                            int var354 = field711[var5];
                            field711[var5++] = class45.method2057(var354).field1041 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var405 == 4205) {
                            var5--;
                            int var355 = field711[var5];
                            class45 var356 = class45.method2057(var355);
                            if (var356.field1056 == -1 && var356.field1027 >= 0) {
                                field711[var5++] = var356.field1027;
                                continue;
                            }
                            field711[var5++] = var355;
                            continue;
                        }
                        if (var405 == 4206) {
                            var5--;
                            int var357 = field711[var5];
                            class45 var358 = class45.method2057(var357);
                            if (var358.field1056 >= 0 && var358.field1027 >= 0) {
                                field711[var5++] = var358.field1027;
                                continue;
                            }
                            field711[var5++] = var357;
                            continue;
                        }
                        if (var405 == 4207) {
                            var5--;
                            int var359 = field711[var5];
                            field711[var5++] = class45.method2057(var359).field1032 ? 1 : 0;
                            continue;
                        }
                    } else if (var405 < 5100) {
                        if (var405 == 5000) {
                            field711[var5++] = client.field396;
                            continue;
                        }
                        if (var405 == 5001) {
                            var5 -= 3;
                            client.field396 = field711[var5];
                            int var360 = field711[var5 + 1];
                            class117[] var361 = new class117[] { class117.field1914, class117.field1909, class117.field1908 };
                            class117[] var362 = var361;
                            int var363 = 0;
                            class117 var365;
                            while (true) {
                                if (var363 >= var362.length) {
                                    var365 = null;
                                    break;
                                }
                                class117 var364 = var362[var363];
                                if (var364.field1911 == var360) {
                                    var365 = var364;
                                    break;
                                }
                                var363++;
                            }
                            Statics.field2516 = var365;
                            if (Statics.field2516 == null) {
                                Statics.field2516 = class117.field1909;
                            }
                            client.field474 = field711[var5 + 2];
                            client.field300.method2389(107);
                            client.field300.method2242(client.field396);
                            client.field300.method2242(Statics.field2516.field1911);
                            client.field300.method2242(client.field474);
                            continue;
                        }
                        if (var405 == 5002) {
                            var6--;
                            String var366 = field712[var6];
                            var5 -= 2;
                            int var367 = field711[var5];
                            int var368 = field711[var5 + 1];
                            client.field300.method2389(149);
                            class110 var369 = client.field300;
                            int var370 = var366.length() + 1;
                            var369.method2242(var370 + 2);
                            client.field300.method2126(var366);
                            client.field300.method2242(var367 - 1);
                            client.field300.method2242(var368);
                            continue;
                        }
                        if (var405 == 5003) {
                            var5 -= 2;
                            int var371 = field711[var5];
                            int var372 = field711[var5 + 1];
                            class31 var373 = Statics.method3093(var371, var372);
                            if (var373 == null) {
                                field711[var5++] = -1;
                                field711[var5++] = 0;
                                field712[var6++] = "";
                                field712[var6++] = "";
                                field712[var6++] = "";
                            } else {
                                field711[var5++] = var373.field706;
                                field711[var5++] = var373.field696;
                                field712[var6++] = var373.field698 == null ? "" : var373.field698;
                                field712[var6++] = var373.field699 == null ? "" : var373.field699;
                                field712[var6++] = var373.field700 == null ? "" : var373.field700;
                            }
                            continue;
                        }
                        if (var405 == 5004) {
                            var5--;
                            int var374 = field711[var5];
                            class31 var375 = (class31) class10.field153.method3167((long) var374);
                            if (var375 == null) {
                                field711[var5++] = -1;
                                field711[var5++] = 0;
                                field712[var6++] = "";
                                field712[var6++] = "";
                                field712[var6++] = "";
                            } else {
                                field711[var5++] = var375.field695;
                                field711[var5++] = var375.field696;
                                field712[var6++] = var375.field698 == null ? "" : var375.field698;
                                field712[var6++] = var375.field699 == null ? "" : var375.field699;
                                field712[var6++] = var375.field700 == null ? "" : var375.field700;
                            }
                            continue;
                        }
                        if (var405 == 5005) {
                            if (Statics.field2516 == null) {
                                field711[var5++] = -1;
                            } else {
                                field711[var5++] = Statics.field2516.field1911;
                            }
                            continue;
                        }
                        if (var405 == 5008) {
                            var6--;
                            String var377 = field712[var6];
                            var5--;
                            int var378 = field711[var5];
                            String var379 = var377.toLowerCase();
                            byte var380 = 0;
                            if (var379.startsWith(class142.field2322)) {
                                var380 = 0;
                                var377 = var377.substring(class142.field2322.length());
                            } else if (var379.startsWith(class142.field2324)) {
                                var380 = 1;
                                var377 = var377.substring(class142.field2324.length());
                            } else if (var379.startsWith(class142.field2326)) {
                                var380 = 2;
                                var377 = var377.substring(class142.field2326.length());
                            } else if (var379.startsWith(class142.field2328)) {
                                var380 = 3;
                                var377 = var377.substring(class142.field2328.length());
                            } else if (var379.startsWith(class142.field2330)) {
                                var380 = 4;
                                var377 = var377.substring(class142.field2330.length());
                            } else if (var379.startsWith(class142.field2332)) {
                                var380 = 5;
                                var377 = var377.substring(class142.field2332.length());
                            } else if (var379.startsWith(class142.field2334)) {
                                var380 = 6;
                                var377 = var377.substring(class142.field2334.length());
                            } else if (var379.startsWith(class142.field2283)) {
                                var380 = 7;
                                var377 = var377.substring(class142.field2283.length());
                            } else if (var379.startsWith(class142.field2338)) {
                                var380 = 8;
                                var377 = var377.substring(class142.field2338.length());
                            } else if (var379.startsWith(class142.field2230)) {
                                var380 = 9;
                                var377 = var377.substring(class142.field2230.length());
                            } else if (var379.startsWith(class142.field2342)) {
                                var380 = 10;
                                var377 = var377.substring(class142.field2342.length());
                            } else if (var379.startsWith(class142.field2195)) {
                                var380 = 11;
                                var377 = var377.substring(class142.field2195.length());
                            } else if (client.field265 != 0) {
                                if (var379.startsWith(class142.field2323)) {
                                    var380 = 0;
                                    var377 = var377.substring(class142.field2323.length());
                                } else if (var379.startsWith(class142.field2303)) {
                                    var380 = 1;
                                    var377 = var377.substring(class142.field2303.length());
                                } else if (var379.startsWith(class142.field2163)) {
                                    var380 = 2;
                                    var377 = var377.substring(class142.field2163.length());
                                } else if (var379.startsWith(class142.field2367)) {
                                    var380 = 3;
                                    var377 = var377.substring(class142.field2367.length());
                                } else if (var379.startsWith(class142.field2331)) {
                                    var380 = 4;
                                    var377 = var377.substring(class142.field2331.length());
                                } else if (var379.startsWith(class142.field2333)) {
                                    var380 = 5;
                                    var377 = var377.substring(class142.field2333.length());
                                } else if (var379.startsWith(class142.field2335)) {
                                    var380 = 6;
                                    var377 = var377.substring(class142.field2335.length());
                                } else if (var379.startsWith(class142.field2337)) {
                                    var380 = 7;
                                    var377 = var377.substring(class142.field2337.length());
                                } else if (var379.startsWith(class142.field2214)) {
                                    var380 = 8;
                                    var377 = var377.substring(class142.field2214.length());
                                } else if (var379.startsWith(class142.field2325)) {
                                    var380 = 9;
                                    var377 = var377.substring(class142.field2325.length());
                                } else if (var379.startsWith(class142.field2379)) {
                                    var380 = 10;
                                    var377 = var377.substring(class142.field2379.length());
                                } else if (var379.startsWith(class142.field2345)) {
                                    var380 = 11;
                                    var377 = var377.substring(class142.field2345.length());
                                }
                            }
                            String var381 = var377.toLowerCase();
                            byte var382 = 0;
                            if (var381.startsWith(class142.field2346)) {
                                var382 = 1;
                                var377 = var377.substring(class142.field2346.length());
                            } else if (var381.startsWith(class142.field2348)) {
                                var382 = 2;
                                var377 = var377.substring(class142.field2348.length());
                            } else if (var381.startsWith(class142.field2350)) {
                                var382 = 3;
                                var377 = var377.substring(class142.field2350.length());
                            } else if (var381.startsWith(class142.field2352)) {
                                var382 = 4;
                                var377 = var377.substring(class142.field2352.length());
                            } else if (var381.startsWith(class142.field2354)) {
                                var382 = 5;
                                var377 = var377.substring(class142.field2354.length());
                            } else if (client.field265 != 0) {
                                if (var381.startsWith(class142.field2306)) {
                                    var382 = 1;
                                    var377 = var377.substring(class142.field2306.length());
                                } else if (var381.startsWith(class142.field2349)) {
                                    var382 = 2;
                                    var377 = var377.substring(class142.field2349.length());
                                } else if (var381.startsWith(class142.field2351)) {
                                    var382 = 3;
                                    var377 = var377.substring(class142.field2351.length());
                                } else if (var381.startsWith(class142.field2307)) {
                                    var382 = 4;
                                    var377 = var377.substring(class142.field2307.length());
                                } else if (var381.startsWith(class142.field2355)) {
                                    var382 = 5;
                                    var377 = var377.substring(class142.field2355.length());
                                }
                            }
                            client.field300.method2389(196);
                            client.field300.method2242(0);
                            int var383 = client.field300.field1845;
                            client.field300.method2242(var378);
                            client.field300.method2242(var380);
                            client.field300.method2242(var382);
                            class189.method1010(client.field300, var377);
                            client.field300.method2132(client.field300.field1845 - var383);
                            continue;
                        }
                        if (var405 == 5009) {
                            var6 -= 2;
                            String var384 = field712[var6];
                            String var385 = field712[var6 + 1];
                            client.field300.method2389(249);
                            client.field300.method2277(0);
                            int var386 = client.field300.field1845;
                            client.field300.method2126(var384);
                            class189.method1010(client.field300, var385);
                            client.field300.method2131(client.field300.field1845 - var386);
                            continue;
                        }
                        if (var405 == 5015) {
                            String var387;
                            if (Statics.field578 == null || Statics.field578.field46 == null) {
                                var387 = "";
                            } else {
                                var387 = Statics.field578.field46;
                            }
                            field712[var6++] = var387;
                            continue;
                        }
                        if (var405 == 5016) {
                            field711[var5++] = client.field474;
                            continue;
                        }
                        if (var405 == 5017) {
                            var5--;
                            int var388 = field711[var5];
                            int[] var389 = field711;
                            int var390 = var5++;
                            class24 var391 = (class24) class10.field170.get(var388);
                            int var392;
                            if (var391 == null) {
                                var392 = 0;
                            } else {
                                var392 = var391.method516();
                            }
                            var389[var390] = var392;
                            continue;
                        }
                        if (var405 == 5018) {
                            var5--;
                            int var393 = field711[var5];
                            int[] var394 = field711;
                            int var395 = var5++;
                            class31 var396 = (class31) class10.field153.method3167((long) var393);
                            int var397;
                            if (var396 == null) {
                                var397 = -1;
                            } else if (class10.field166.field2850 == var396.field2853) {
                                var397 = -1;
                            } else {
                                var397 = ((class31) var396.field2853).field706;
                            }
                            var394[var395] = var397;
                            continue;
                        }
                        if (var405 == 5019) {
                            var5--;
                            int var398 = field711[var5];
                            field711[var5++] = class10.method1619(var398);
                            continue;
                        }
                        if (var405 == 5020) {
                            var6--;
                            String var399 = field712[var6];
                            if (var399.equalsIgnoreCase("toggleroof")) {
                                Statics.field250.field140 = !Statics.field250.field140;
                                class9.method2680();
                                if (Statics.field250.field140) {
                                    class10.method88(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method88(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field453 >= 2) {
                                if (var399.equalsIgnoreCase("fpson")) {
                                    client.field274 = true;
                                }
                                if (var399.equalsIgnoreCase("fpsoff")) {
                                    client.field274 = false;
                                }
                                if (var399.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var399.equalsIgnoreCase("clientdrop")) {
                                    client.method1620();
                                }
                                if (var399.equalsIgnoreCase("errortest") && client.field261 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field300.method2389(216);
                            client.field300.method2242(var399.length() + 1);
                            client.field300.method2126(var399);
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var404) {
            StringBuilder var401 = new StringBuilder(30);
            var401.append("").append(var4.field2861).append(" ");
            for (int var402 = field717 - 1; var402 >= 0; var402--) {
                var401.append("").append(field714[var402].field199.field2861).append(" ");
            }
            var401.append("").append(var10);
            class135.method3292(var401.toString(), var404);
        }
    }

    @ObfuscatedName("av.x(II)V")
    public static void method896(int arg0) {
        if (arg0 == -1 || !class152.method139(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2628[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3.field2598 != null) {
                class1 var4 = new class1();
                var4.field1 = var3;
                var4.field15 = var3.field2598;
                method3390(var4, 2000000);
            }
        }
    }
}
