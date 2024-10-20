package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ae")
public class class32 {

    @ObfuscatedName("ae.r")
    public static int[] field719 = new int[5];

    @ObfuscatedName("ae.e")
    public static int[][] field720 = new int[5][5000];

    @ObfuscatedName("ae.k")
    public static int[] field721 = new int[1000];

    @ObfuscatedName("ae.b")
    public static String[] field722 = new String[1000];

    @ObfuscatedName("ae.n")
    public static int field724 = 0;

    @ObfuscatedName("ae.a")
    public static class13[] field729 = new class13[50];

    @ObfuscatedName("ae.f")
    public static Calendar field726 = Calendar.getInstance();

    @ObfuscatedName("ae.o")
    public static final String[] field727 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.j(Lj;B)V")
    public static void method451(class1 arg0) {
        method2605(arg0, 200000);
    }

    @ObfuscatedName("di.z(Lj;II)V")
    public static void method2605(class1 arg0, int arg1) {
        Object[] var2 = arg0.field9;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method2418(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field538;
        int[] var9 = var4.field549;
        byte var10 = -1;
        field724 = 0;
        try {
            Statics.field733 = new int[var4.field541];
            int var11 = 0;
            Statics.field732 = new String[var4.field544];
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
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2645;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2538;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field15 == null ? -1 : arg0.field15.field2645;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field15 == null ? -1 : arg0.field15.field2538;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field7;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field2;
                    }
                    Statics.field733[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field732[var12++] = var15;
                }
            }
            int var16 = 0;
            label2751: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var432 = var8[var7];
                if (var432 < 100) {
                    if (var432 == 0) {
                        field721[var5++] = var9[var7];
                        continue;
                    }
                    if (var432 == 1) {
                        int var17 = var9[var7];
                        field721[var5++] = class154.field2664[var17];
                        continue;
                    }
                    if (var432 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class154.field2664[var18] = field721[var5];
                        client.method79(var18);
                        continue;
                    }
                    if (var432 == 3) {
                        field722[var6++] = var4.field540[var7];
                        continue;
                    }
                    if (var432 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var432 == 7) {
                        var5 -= 2;
                        if (field721[var5 + 1] != field721[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var432 == 8) {
                        var5 -= 2;
                        if (field721[var5 + 1] == field721[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var432 == 9) {
                        var5 -= 2;
                        if (field721[var5] < field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var432 == 10) {
                        var5 -= 2;
                        if (field721[var5] > field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var432 == 21) {
                        if (field724 == 0) {
                            return;
                        }
                        class13 var19 = field729[--field724];
                        var4 = var19.field182;
                        var8 = var4.field538;
                        var9 = var4.field549;
                        var7 = var19.field184;
                        Statics.field733 = var19.field181;
                        Statics.field732 = var19.field190;
                        continue;
                    }
                    if (var432 == 25) {
                        int var20 = var9[var7];
                        field721[var5++] = class154.method480(var20);
                        continue;
                    }
                    if (var432 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field721[var5];
                        class42 var23 = class42.method2467(var21);
                        int var24 = var23.field974;
                        int var25 = var23.field983;
                        int var26 = var23.field977;
                        int var27 = class154.field2665[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class154.field2664[var24] = class154.field2664[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var432 == 31) {
                        var5 -= 2;
                        if (field721[var5] <= field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var432 == 32) {
                        var5 -= 2;
                        if (field721[var5] >= field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var432 == 33) {
                        field721[var5++] = Statics.field733[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var432 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field733[var10001] = field721[var5];
                        continue;
                    }
                    if (var432 == 35) {
                        field722[var6++] = Statics.field732[var9[var7]];
                        continue;
                    }
                    if (var432 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field732[var10001] = field722[var6];
                        continue;
                    }
                    if (var432 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String[] var30 = field722;
                        String var31;
                        if (var29 == 0) {
                            var31 = "";
                        } else if (var29 == 1) {
                            String var32 = var30[var6];
                            if (var32 == null) {
                                var31 = "null";
                            } else {
                                var31 = var32.toString();
                            }
                        } else {
                            int var33 = var6 + var29;
                            int var34 = 0;
                            for (int var35 = var6; var35 < var33; var35++) {
                                String var36 = var30[var35];
                                if (var36 == null) {
                                    var34 += 4;
                                } else {
                                    var34 += var36.length();
                                }
                            }
                            StringBuilder var37 = new StringBuilder(var34);
                            for (int var38 = var6; var38 < var33; var38++) {
                                String var39 = var30[var38];
                                if (var39 == null) {
                                    var37.append("null");
                                } else {
                                    var37.append(var39);
                                }
                            }
                            var31 = var37.toString();
                        }
                        field722[var6++] = var31;
                        continue;
                    }
                    if (var432 == 38) {
                        var5--;
                        continue;
                    }
                    if (var432 == 39) {
                        var6--;
                        continue;
                    }
                    if (var432 == 40) {
                        int var41 = var9[var7];
                        class19 var42 = class19.method2418(var41);
                        int[] var43 = new int[var42.field541];
                        String[] var44 = new String[var42.field544];
                        for (int var45 = 0; var45 < var42.field543; var45++) {
                            var43[var45] = field721[var5 - var42.field543 + var45];
                        }
                        for (int var46 = 0; var46 < var42.field548; var46++) {
                            var44[var46] = field722[var6 - var42.field548 + var46];
                        }
                        var5 -= var42.field543;
                        var6 -= var42.field548;
                        class13 var47 = new class13();
                        var47.field182 = var4;
                        var47.field184 = var7;
                        var47.field181 = Statics.field733;
                        var47.field190 = Statics.field732;
                        field729[++field724 - 1] = var47;
                        var4 = var42;
                        var8 = var42.field538;
                        var9 = var42.field549;
                        var7 = -1;
                        Statics.field733 = var43;
                        Statics.field732 = var44;
                        continue;
                    }
                    if (var432 == 42) {
                        field721[var5++] = client.field461[var9[var7]];
                        continue;
                    }
                    if (var432 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field461[var10001] = field721[var5];
                        continue;
                    }
                    if (var432 == 44) {
                        int var48 = var9[var7] >> 16;
                        int var49 = var9[var7] & 0xFFFF;
                        var5--;
                        int var50 = field721[var5];
                        if (var50 >= 0 && var50 <= 5000) {
                            field719[var48] = var50;
                            byte var51 = -1;
                            if (var49 == 105) {
                                var51 = 0;
                            }
                            int var52 = 0;
                            while (true) {
                                if (var52 >= var50) {
                                    continue label2751;
                                }
                                field720[var48][var52] = var51;
                                var52++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var432 == 45) {
                        int var53 = var9[var7];
                        var5--;
                        int var54 = field721[var5];
                        if (var54 >= 0 && var54 < field719[var53]) {
                            field721[var5++] = field720[var53][var54];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var432 == 46) {
                        int var55 = var9[var7];
                        var5 -= 2;
                        int var56 = field721[var5];
                        if (var56 >= 0 && var56 < field719[var55]) {
                            field720[var55][var56] = field721[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var432 == 47) {
                        String var57 = client.field483[var9[var7]];
                        if (var57 == null) {
                            var57 = "null";
                        }
                        field722[var6++] = var57;
                        continue;
                    }
                    if (var432 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field483[var10001] = field722[var6];
                        continue;
                    }
                }
                boolean var58;
                if (var9[var7] == 1) {
                    var58 = true;
                } else {
                    var58 = false;
                }
                if (var432 < 1000) {
                    if (var432 == 100) {
                        var5 -= 3;
                        int var59 = field721[var5];
                        int var60 = field721[var5 + 1];
                        int var61 = field721[var5 + 2];
                        if (var60 == 0) {
                            throw new RuntimeException();
                        }
                        class152 var62 = class152.method2559(var59);
                        if (var62.field2541 == null) {
                            var62.field2541 = new class152[var61 + 1];
                        }
                        if (var62.field2541.length <= var61) {
                            class152[] var63 = new class152[var61 + 1];
                            for (int var64 = 0; var64 < var62.field2541.length; var64++) {
                                var63[var64] = var62.field2541[var64];
                            }
                            var62.field2541 = var63;
                        }
                        if (var61 > 0 && var62.field2541[var61 - 1] == null) {
                            throw new RuntimeException("" + (var61 - 1));
                        }
                        class152 var65 = new class152();
                        var65.field2539 = var60;
                        var65.field2573 = var65.field2645 = var62.field2645;
                        var65.field2538 = var61;
                        var65.field2536 = true;
                        var62.field2541[var61] = var65;
                        if (var58) {
                            Statics.field725 = var65;
                        } else {
                            Statics.field1901 = var65;
                        }
                        client.method130(var62);
                        continue;
                    }
                    if (var432 == 101) {
                        class152 var66 = var58 ? Statics.field725 : Statics.field1901;
                        class152 var67 = class152.method2559(var66.field2645);
                        var67.field2541[var66.field2538] = null;
                        client.method130(var67);
                        continue;
                    }
                    if (var432 == 102) {
                        var5--;
                        class152 var68 = class152.method2559(field721[var5]);
                        var68.field2541 = null;
                        client.method130(var68);
                        continue;
                    }
                    if (var432 == 200) {
                        var5 -= 2;
                        int var69 = field721[var5];
                        int var70 = field721[var5 + 1];
                        class152 var71 = Statics.method2714(var69, var70);
                        if (var71 != null && var70 != -1) {
                            field721[var5++] = 1;
                            if (var58) {
                                Statics.field725 = var71;
                            } else {
                                Statics.field1901 = var71;
                            }
                            continue;
                        }
                        field721[var5++] = 0;
                        continue;
                    }
                } else if (!(var432 < 1000 || var432 >= 1100) || !(var432 < 2000 || var432 >= 2100)) {
                    class152 var72;
                    if (var432 >= 2000) {
                        var432 -= 1000;
                        var5--;
                        var72 = class152.method2559(field721[var5]);
                    } else {
                        var72 = var58 ? Statics.field725 : Statics.field1901;
                    }
                    if (var432 == 1000) {
                        var5 -= 2;
                        var72.field2542 = field721[var5];
                        var72.field2543 = field721[var5 + 1];
                        client.method130(var72);
                        continue;
                    }
                    if (var432 == 1001) {
                        var5 -= 2;
                        var72.field2546 = field721[var5];
                        var72.field2547 = field721[var5 + 1];
                        client.method130(var72);
                        continue;
                    }
                    if (var432 == 1003) {
                        var5--;
                        boolean var73 = field721[var5] == 1;
                        if (var72.field2549 != var73) {
                            var72.field2549 = var73;
                            client.method130(var72);
                        }
                        continue;
                    }
                } else if (var432 >= 1100 && var432 < 1200 || var432 >= 2100 && var432 < 2200) {
                    class152 var74;
                    if (var432 >= 2000) {
                        var432 -= 1000;
                        var5--;
                        var74 = class152.method2559(field721[var5]);
                    } else {
                        var74 = var58 ? Statics.field725 : Statics.field1901;
                    }
                    if (var432 == 1100) {
                        var5 -= 2;
                        var74.field2550 = field721[var5];
                        if (var74.field2550 > var74.field2552 - var74.field2546) {
                            var74.field2550 = var74.field2552 - var74.field2546;
                        }
                        if (var74.field2550 < 0) {
                            var74.field2550 = 0;
                        }
                        var74.field2551 = field721[var5 + 1];
                        if (var74.field2551 > var74.field2553 - var74.field2547) {
                            var74.field2551 = var74.field2553 - var74.field2547;
                        }
                        if (var74.field2551 < 0) {
                            var74.field2551 = 0;
                        }
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1101) {
                        var5--;
                        var74.field2565 = field721[var5];
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1102) {
                        var5--;
                        var74.field2558 = field721[var5] == 1;
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1103) {
                        var5--;
                        var74.field2594 = field721[var5];
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1104) {
                        var5--;
                        var74.field2560 = field721[var5];
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1105) {
                        var5--;
                        var74.field2561 = field721[var5];
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1106) {
                        var5--;
                        var74.field2563 = field721[var5];
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1107) {
                        var5--;
                        var74.field2564 = field721[var5] == 1;
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1108) {
                        var74.field2612 = 1;
                        var5--;
                        var74.field2634 = field721[var5];
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1109) {
                        var5 -= 6;
                        var74.field2567 = field721[var5];
                        var74.field2574 = field721[var5 + 1];
                        var74.field2577 = field721[var5 + 2];
                        var74.field2578 = field721[var5 + 3];
                        var74.field2579 = field721[var5 + 4];
                        var74.field2569 = field721[var5 + 5];
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1110) {
                        var5--;
                        int var75 = field721[var5];
                        if (var74.field2644 != var75) {
                            var74.field2644 = var75;
                            var74.field2643 = 0;
                            var74.field2568 = 0;
                            client.method130(var74);
                        }
                        continue;
                    }
                    if (var432 == 1111) {
                        var5--;
                        var74.field2629 = field721[var5] == 1;
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1112) {
                        var6--;
                        String var76 = field722[var6];
                        if (!var76.equals(var74.field2584)) {
                            var74.field2584 = var76;
                            client.method130(var74);
                        }
                        continue;
                    }
                    if (var432 == 1113) {
                        var5--;
                        var74.field2613 = field721[var5];
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1114) {
                        var5 -= 3;
                        var74.field2587 = field721[var5];
                        var74.field2588 = field721[var5 + 1];
                        var74.field2586 = field721[var5 + 2];
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1115) {
                        var5--;
                        var74.field2589 = field721[var5] == 1;
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1116) {
                        var5--;
                        var74.field2614 = field721[var5];
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1117) {
                        var5--;
                        var74.field2566 = field721[var5];
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1118) {
                        var5--;
                        var74.field2576 = field721[var5] == 1;
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1119) {
                        var5--;
                        var74.field2601 = field721[var5] == 1;
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1120) {
                        var5 -= 2;
                        var74.field2552 = field721[var5];
                        var74.field2553 = field721[var5 + 1];
                        client.method130(var74);
                        continue;
                    }
                    if (var432 == 1121) {
                        int var77 = var74.field2645;
                        int var78 = var74.field2538;
                        client.field304.method2369(46);
                        client.field304.method2160(var78);
                        client.field304.method2169(var77);
                        client.field265 = var74;
                        client.method130(var74);
                        continue;
                    }
                } else if (var432 >= 1200 && var432 < 1300 || var432 >= 2200 && var432 < 2300) {
                    class152 var79;
                    if (var432 >= 2000) {
                        var432 -= 1000;
                        var5--;
                        var79 = class152.method2559(field721[var5]);
                    } else {
                        var79 = var58 ? Statics.field725 : Statics.field1901;
                    }
                    client.method130(var79);
                    if (var432 == 1200) {
                        var5 -= 2;
                        int var80 = field721[var5];
                        int var81 = field721[var5 + 1];
                        var79.field2641 = var80;
                        var79.field2642 = var81;
                        class45 var82 = class45.method500(var80);
                        var79.field2577 = var82.field1024;
                        var79.field2578 = var82.field1025;
                        var79.field2579 = var82.field1029;
                        var79.field2567 = var82.field1027;
                        var79.field2574 = var82.field1009;
                        var79.field2569 = var82.field1047;
                        if (var79.field2546 > 0) {
                            var79.field2569 = var79.field2569 * 32 / var79.field2546;
                        }
                        continue;
                    }
                    if (var432 == 1201) {
                        var79.field2612 = 2;
                        var5--;
                        var79.field2634 = field721[var5];
                        continue;
                    }
                    if (var432 == 1202) {
                        var79.field2612 = 3;
                        var79.field2634 = Statics.field391.field38.method2951();
                        continue;
                    }
                } else if ((var432 < 1300 || var432 >= 1400) && (var432 < 2300 || var432 >= 2400)) {
                    if (var432 >= 1400 && var432 < 1500 || var432 >= 2400 && var432 < 2500) {
                        class152 var87;
                        if (var432 >= 2000) {
                            var432 -= 1000;
                            var5--;
                            var87 = class152.method2559(field721[var5]);
                        } else {
                            var87 = var58 ? Statics.field725 : Statics.field1901;
                        }
                        var6--;
                        String var88 = field722[var6];
                        int[] var89 = null;
                        if (var88.length() > 0 && var88.charAt(var88.length() - 1) == 'Y') {
                            var5--;
                            int var90 = field721[var5];
                            if (var90 > 0) {
                                var89 = new int[var90];
                                while (var90-- > 0) {
                                    var5--;
                                    var89[var90] = field721[var5];
                                }
                            }
                            var88 = var88.substring(0, var88.length() - 1);
                        }
                        Object[] var91 = new Object[var88.length() + 1];
                        for (int var92 = var91.length - 1; var92 >= 1; var92--) {
                            if (var88.charAt(var92 - 1) == 's') {
                                var6--;
                                var91[var92] = field722[var6];
                            } else {
                                var5--;
                                var91[var92] = Integer.valueOf(field721[var5]);
                            }
                        }
                        var5--;
                        int var93 = field721[var5];
                        if (var93 == -1) {
                            var91 = null;
                        } else {
                            var91[0] = Integer.valueOf(var93);
                        }
                        if (var432 == 1400) {
                            var87.field2606 = var91;
                        }
                        if (var432 == 1401) {
                            var87.field2620 = var91;
                        }
                        if (var432 == 1402) {
                            var87.field2608 = var91;
                        }
                        if (var432 == 1403) {
                            var87.field2610 = var91;
                        }
                        if (var432 == 1404) {
                            var87.field2632 = var91;
                        }
                        if (var432 == 1405) {
                            var87.field2603 = var91;
                        }
                        if (var432 == 1406) {
                            var87.field2616 = var91;
                        }
                        if (var432 == 1407) {
                            var87.field2617 = var91;
                            var87.field2654 = var89;
                        }
                        if (var432 == 1408) {
                            var87.field2623 = var91;
                        }
                        if (var432 == 1409) {
                            var87.field2624 = var91;
                        }
                        if (var432 == 1410) {
                            var87.field2527 = var91;
                        }
                        if (var432 == 1411) {
                            var87.field2607 = var91;
                        }
                        if (var432 == 1412) {
                            var87.field2611 = var91;
                        }
                        if (var432 == 1414) {
                            var87.field2596 = var91;
                            var87.field2635 = var89;
                        }
                        if (var432 == 1415) {
                            var87.field2621 = var91;
                            var87.field2622 = var89;
                        }
                        if (var432 == 1416) {
                            var87.field2615 = var91;
                        }
                        if (var432 == 1417) {
                            var87.field2626 = var91;
                        }
                        if (var432 == 1418) {
                            var87.field2556 = var91;
                        }
                        if (var432 == 1419) {
                            var87.field2627 = var91;
                        }
                        if (var432 == 1420) {
                            var87.field2619 = var91;
                        }
                        if (var432 == 1421) {
                            var87.field2625 = var91;
                        }
                        if (var432 == 1422) {
                            var87.field2591 = var91;
                        }
                        if (var432 == 1423) {
                            var87.field2631 = var91;
                        }
                        if (var432 == 1424) {
                            var87.field2575 = var91;
                        }
                        var87.field2604 = true;
                        continue;
                    }
                    if (var432 < 1600) {
                        class152 var94 = var58 ? Statics.field725 : Statics.field1901;
                        if (var432 == 1500) {
                            field721[var5++] = var94.field2542;
                            continue;
                        }
                        if (var432 == 1501) {
                            field721[var5++] = var94.field2543;
                            continue;
                        }
                        if (var432 == 1502) {
                            field721[var5++] = var94.field2546;
                            continue;
                        }
                        if (var432 == 1503) {
                            field721[var5++] = var94.field2547;
                            continue;
                        }
                        if (var432 == 1504) {
                            field721[var5++] = var94.field2549 ? 1 : 0;
                            continue;
                        }
                        if (var432 == 1505) {
                            field721[var5++] = var94.field2573;
                            continue;
                        }
                    } else if (var432 < 1700) {
                        class152 var95 = var58 ? Statics.field725 : Statics.field1901;
                        if (var432 == 1600) {
                            field721[var5++] = var95.field2550;
                            continue;
                        }
                        if (var432 == 1601) {
                            field721[var5++] = var95.field2551;
                            continue;
                        }
                        if (var432 == 1602) {
                            field722[var6++] = var95.field2584;
                            continue;
                        }
                        if (var432 == 1603) {
                            field721[var5++] = var95.field2552;
                            continue;
                        }
                        if (var432 == 1604) {
                            field721[var5++] = var95.field2553;
                            continue;
                        }
                        if (var432 == 1605) {
                            field721[var5++] = var95.field2569;
                            continue;
                        }
                        if (var432 == 1606) {
                            field721[var5++] = var95.field2577;
                            continue;
                        }
                        if (var432 == 1607) {
                            field721[var5++] = var95.field2579;
                            continue;
                        }
                        if (var432 == 1608) {
                            field721[var5++] = var95.field2578;
                            continue;
                        }
                    } else if (var432 < 1800) {
                        class152 var96 = var58 ? Statics.field725 : Statics.field1901;
                        if (var432 == 1700) {
                            field721[var5++] = var96.field2641;
                            continue;
                        }
                        if (var432 == 1701) {
                            if (var96.field2641 == -1) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = var96.field2642;
                            }
                            continue;
                        }
                        if (var432 == 1702) {
                            field721[var5++] = var96.field2538;
                            continue;
                        }
                    } else if (var432 < 1900) {
                        class152 var97 = var58 ? Statics.field725 : Statics.field1901;
                        if (var432 == 1800) {
                            int[] var98 = field721;
                            int var99 = var5++;
                            int var100 = client.method94(var97);
                            int var101 = var100 >> 11 & 0x3F;
                            var98[var99] = var101;
                            continue;
                        }
                        if (var432 == 1801) {
                            var5--;
                            int var102 = field721[var5];
                            int var433 = var102 - 1;
                            if (var97.field2592 != null && var433 < var97.field2592.length && var97.field2592[var433] != null) {
                                field722[var6++] = var97.field2592[var433];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var432 == 1802) {
                            if (var97.field2597 == null) {
                                field722[var6++] = "";
                            } else {
                                field722[var6++] = var97.field2597;
                            }
                            continue;
                        }
                    } else if (var432 < 2600) {
                        var5--;
                        class152 var103 = class152.method2559(field721[var5]);
                        if (var432 == 2500) {
                            field721[var5++] = var103.field2542;
                            continue;
                        }
                        if (var432 == 2501) {
                            field721[var5++] = var103.field2543;
                            continue;
                        }
                        if (var432 == 2502) {
                            field721[var5++] = var103.field2546;
                            continue;
                        }
                        if (var432 == 2503) {
                            field721[var5++] = var103.field2547;
                            continue;
                        }
                        if (var432 == 2504) {
                            field721[var5++] = var103.field2549 ? 1 : 0;
                            continue;
                        }
                        if (var432 == 2505) {
                            field721[var5++] = var103.field2573;
                            continue;
                        }
                    } else if (var432 < 2700) {
                        var5--;
                        class152 var104 = class152.method2559(field721[var5]);
                        if (var432 == 2600) {
                            field721[var5++] = var104.field2550;
                            continue;
                        }
                        if (var432 == 2601) {
                            field721[var5++] = var104.field2551;
                            continue;
                        }
                        if (var432 == 2602) {
                            field722[var6++] = var104.field2584;
                            continue;
                        }
                        if (var432 == 2603) {
                            field721[var5++] = var104.field2552;
                            continue;
                        }
                        if (var432 == 2604) {
                            field721[var5++] = var104.field2553;
                            continue;
                        }
                        if (var432 == 2605) {
                            field721[var5++] = var104.field2569;
                            continue;
                        }
                        if (var432 == 2606) {
                            field721[var5++] = var104.field2577;
                            continue;
                        }
                        if (var432 == 2607) {
                            field721[var5++] = var104.field2579;
                            continue;
                        }
                        if (var432 == 2608) {
                            field721[var5++] = var104.field2578;
                            continue;
                        }
                    } else if (var432 < 2800) {
                        if (var432 == 2700) {
                            var5--;
                            class152 var105 = class152.method2559(field721[var5]);
                            field721[var5++] = var105.field2641;
                            continue;
                        }
                        if (var432 == 2701) {
                            var5--;
                            class152 var106 = class152.method2559(field721[var5]);
                            if (var106.field2641 == -1) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = var106.field2642;
                            }
                            continue;
                        }
                        if (var432 == 2702) {
                            var5--;
                            int var107 = field721[var5];
                            class4 var108 = (class4) client.field297.method3214((long) var107);
                            if (var108 == null) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var432 < 2900) {
                        var5--;
                        class152 var109 = class152.method2559(field721[var5]);
                        if (var432 == 2800) {
                            int[] var110 = field721;
                            int var111 = var5++;
                            int var112 = client.method94(var109);
                            int var113 = var112 >> 11 & 0x3F;
                            var110[var111] = var113;
                            continue;
                        }
                        if (var432 == 2801) {
                            var5--;
                            int var114 = field721[var5];
                            int var434 = var114 - 1;
                            if (var109.field2592 != null && var434 < var109.field2592.length && var109.field2592[var434] != null) {
                                field722[var6++] = var109.field2592[var434];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var432 == 2802) {
                            if (var109.field2597 == null) {
                                field722[var6++] = "";
                            } else {
                                field722[var6++] = var109.field2597;
                            }
                            continue;
                        }
                    } else if (var432 < 3200) {
                        if (var432 == 3100) {
                            var6--;
                            String var115 = field722[var6];
                            class10.method545(0, "", var115);
                            continue;
                        }
                        if (var432 == 3101) {
                            var5 -= 2;
                            client.method560(Statics.field391, field721[var5], field721[var5 + 1]);
                            continue;
                        }
                        if (var432 == 3103) {
                            client.method1003();
                            continue;
                        }
                        if (var432 == 3104) {
                            var6--;
                            String var116 = field722[var6];
                            int var117 = 0;
                            boolean var118 = false;
                            boolean var119 = false;
                            int var120 = 0;
                            int var121 = var116.length();
                            int var122 = 0;
                            boolean var124;
                            while (true) {
                                if (var122 >= var121) {
                                    var124 = var119;
                                    break;
                                }
                                label2965: {
                                    char var123 = var116.charAt(var122);
                                    if (var122 == 0) {
                                        if (var123 == '-') {
                                            var118 = true;
                                            break label2965;
                                        }
                                        if (var123 == '+') {
                                            break label2965;
                                        }
                                    }
                                    int var435;
                                    if (var123 >= '0' && var123 <= '9') {
                                        var435 = var123 - '0';
                                    } else if (var123 >= 'A' && var123 <= 'Z') {
                                        var435 = var123 - '7';
                                    } else {
                                        if (var123 < 'a' || var123 > 'z') {
                                            var124 = false;
                                            break;
                                        }
                                        var435 = var123 - 'W';
                                    }
                                    if (var435 >= 10) {
                                        var124 = false;
                                        break;
                                    }
                                    if (var118) {
                                        var435 = -var435;
                                    }
                                    int var125 = var120 * 10 + var435;
                                    if (var125 / 10 != var120) {
                                        var124 = false;
                                        break;
                                    }
                                    var120 = var125;
                                    var119 = true;
                                }
                                var122++;
                            }
                            if (var124) {
                                int var127 = class197.method456(var116, 10, true);
                                var117 = var127;
                            }
                            client.field304.method2369(21);
                            client.field304.method2119(var117);
                            continue;
                        }
                        if (var432 == 3105) {
                            var6--;
                            String var128 = field722[var6];
                            client.field304.method2369(54);
                            client.field304.method2116(var128.length() + 1);
                            client.field304.method2121(var128);
                            continue;
                        }
                        if (var432 == 3106) {
                            var6--;
                            String var129 = field722[var6];
                            client.field304.method2369(133);
                            client.field304.method2116(var129.length() + 1);
                            client.field304.method2121(var129);
                            continue;
                        }
                        if (var432 == 3107) {
                            var5--;
                            int var130 = field721[var5];
                            var6--;
                            String var131 = field722[var6];
                            client.method7(var130, var131);
                            continue;
                        }
                        if (var432 == 3108) {
                            var5 -= 3;
                            int var132 = field721[var5];
                            int var133 = field721[var5 + 1];
                            int var134 = field721[var5 + 2];
                            class152 var135 = class152.method2559(var134);
                            client.method2506(var135, var132, var133);
                            continue;
                        }
                        if (var432 == 3109) {
                            var5 -= 2;
                            int var136 = field721[var5];
                            int var137 = field721[var5 + 1];
                            class152 var138 = var58 ? Statics.field725 : Statics.field1901;
                            client.method2506(var138, var136, var137);
                            continue;
                        }
                        if (var432 == 3110) {
                            var5--;
                            Statics.field58 = field721[var5] == 1;
                            continue;
                        }
                        if (var432 == 3111) {
                            field721[var5++] = Statics.field1921.field140 ? 1 : 0;
                            continue;
                        }
                        if (var432 == 3112) {
                            var5--;
                            Statics.field1921.field140 = field721[var5] == 1;
                            class9.method552();
                            continue;
                        }
                        if (var432 == 3113) {
                            var6--;
                            String var139 = field722[var6];
                            var5--;
                            boolean var140 = field721[var5] == 1;
                            if (!var140) {
                                class125.method2325(var139, 3);
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var139));
                                    continue;
                                } catch (Exception var430) {
                                }
                            }
                            if (class125.field1995.startsWith("win")) {
                                class125.method2325(var139, 0);
                            } else if (class125.field1995.startsWith("mac")) {
                                class125.method454(var139, 1, "openjs");
                            } else {
                                class125.method2325(var139, 2);
                            }
                            continue;
                        }
                    } else if (var432 < 3300) {
                        if (var432 == 3200) {
                            var5 -= 3;
                            int var142 = field721[var5];
                            int var143 = field721[var5 + 1];
                            int var144 = field721[var5 + 2];
                            if (client.field415 != 0 && var143 != 0 && client.field502 < 50) {
                                client.field503[client.field502] = var142;
                                client.field504[client.field502] = var143;
                                client.field505[client.field502] = var144;
                                client.field507[client.field502] = null;
                                client.field479[client.field502] = 0;
                                client.field502++;
                            }
                            continue;
                        }
                        if (var432 == 3201) {
                            var5--;
                            client.method885(field721[var5]);
                            continue;
                        }
                        if (var432 == 3202) {
                            var5 -= 2;
                            client.method1890(field721[var5], field721[var5 + 1]);
                            continue;
                        }
                    } else if (var432 < 3400) {
                        if (var432 == 3300) {
                            field721[var5++] = client.field280;
                            continue;
                        }
                        if (var432 == 3301) {
                            var5 -= 2;
                            int var145 = field721[var5];
                            int var146 = field721[var5 + 1];
                            field721[var5++] = class14.method467(var145, var146);
                            continue;
                        }
                        if (var432 == 3302) {
                            var5 -= 2;
                            int var147 = field721[var5];
                            int var148 = field721[var5 + 1];
                            int[] var149 = field721;
                            int var150 = var5++;
                            class14 var151 = (class14) class14.field203.method3214((long) var147);
                            int var152;
                            if (var151 == null) {
                                var152 = 0;
                            } else if (var148 >= 0 && var148 < var151.field194.length) {
                                var152 = var151.field194[var148];
                            } else {
                                var152 = 0;
                            }
                            var149[var150] = var152;
                            continue;
                        }
                        if (var432 == 3303) {
                            var5 -= 2;
                            int var153 = field721[var5];
                            int var154 = field721[var5 + 1];
                            int[] var155 = field721;
                            int var156 = var5++;
                            class14 var157 = (class14) class14.field203.method3214((long) var153);
                            int var158;
                            if (var157 == null) {
                                var158 = 0;
                            } else if (var154 == -1) {
                                var158 = 0;
                            } else {
                                int var159 = 0;
                                for (int var160 = 0; var160 < var157.field194.length; var160++) {
                                    if (var157.field193[var160] == var154) {
                                        var159 += var157.field194[var160];
                                    }
                                }
                                var158 = var159;
                            }
                            var155[var156] = var158;
                            continue;
                        }
                        if (var432 == 3304) {
                            var5--;
                            int var161 = field721[var5];
                            field721[var5++] = class44.method2698(var161).field1005;
                            continue;
                        }
                        if (var432 == 3305) {
                            var5--;
                            int var162 = field721[var5];
                            field721[var5++] = client.field403[var162];
                            continue;
                        }
                        if (var432 == 3306) {
                            var5--;
                            int var163 = field721[var5];
                            field721[var5++] = client.field323[var163];
                            continue;
                        }
                        if (var432 == 3307) {
                            var5--;
                            int var164 = field721[var5];
                            field721[var5++] = client.field405[var164];
                            continue;
                        }
                        if (var432 == 3308) {
                            int var165 = Statics.field1494;
                            int var166 = (Statics.field391.field747 >> 7) + Statics.field88;
                            int var167 = (Statics.field391.field735 >> 7) + Statics.field316;
                            field721[var5++] = (var165 << 28) + (var166 << 14) + var167;
                            continue;
                        }
                        if (var432 == 3309) {
                            var5--;
                            int var168 = field721[var5];
                            field721[var5++] = var168 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var432 == 3310) {
                            var5--;
                            int var169 = field721[var5];
                            field721[var5++] = var169 >> 28;
                            continue;
                        }
                        if (var432 == 3311) {
                            var5--;
                            int var170 = field721[var5];
                            field721[var5++] = var170 & 0x3FFF;
                            continue;
                        }
                        if (var432 == 3312) {
                            field721[var5++] = client.field264 ? 1 : 0;
                            continue;
                        }
                        if (var432 == 3313) {
                            var5 -= 2;
                            int var171 = field721[var5] + 32768;
                            int var172 = field721[var5 + 1];
                            field721[var5++] = class14.method467(var171, var172);
                            continue;
                        }
                        if (var432 == 3314) {
                            var5 -= 2;
                            int var173 = field721[var5] + 32768;
                            int var174 = field721[var5 + 1];
                            field721[var5++] = class14.method803(var173, var174);
                            continue;
                        }
                        if (var432 == 3315) {
                            var5 -= 2;
                            int var175 = field721[var5] + 32768;
                            int var176 = field721[var5 + 1];
                            int[] var177 = field721;
                            int var178 = var5++;
                            class14 var179 = (class14) class14.field203.method3214((long) var175);
                            int var180;
                            if (var179 == null) {
                                var180 = 0;
                            } else if (var176 == -1) {
                                var180 = 0;
                            } else {
                                int var181 = 0;
                                for (int var182 = 0; var182 < var179.field194.length; var182++) {
                                    if (var179.field193[var182] == var176) {
                                        var181 += var179.field194[var182];
                                    }
                                }
                                var180 = var181;
                            }
                            var177[var178] = var180;
                            continue;
                        }
                        if (var432 == 3316) {
                            if (client.field432 >= 2) {
                                field721[var5++] = client.field432;
                            } else {
                                field721[var5++] = 0;
                            }
                            continue;
                        }
                        if (var432 == 3317) {
                            field721[var5++] = client.field277;
                            continue;
                        }
                        if (var432 == 3318) {
                            field721[var5++] = client.field350;
                            continue;
                        }
                        if (var432 == 3321) {
                            field721[var5++] = client.field430;
                            continue;
                        }
                        if (var432 == 3322) {
                            field721[var5++] = client.field431;
                            continue;
                        }
                        if (var432 == 3323) {
                            if (client.field287) {
                                field721[var5++] = 1;
                            } else {
                                field721[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var432 < 3500) {
                        if (var432 == 3400) {
                            var5 -= 2;
                            int var183 = field721[var5];
                            int var184 = field721[var5 + 1];
                            class43 var185 = class43.method1363(var183);
                            if (var185.field987 != 's') {
                            }
                            for (int var186 = 0; var186 < var185.field990; var186++) {
                                if (var185.field991[var186] == var184) {
                                    field722[var6++] = var185.field993[var186];
                                    var185 = null;
                                    break;
                                }
                            }
                            if (var185 != null) {
                                field722[var6++] = var185.field988;
                            }
                            continue;
                        }
                        if (var432 == 3408) {
                            var5 -= 4;
                            int var187 = field721[var5];
                            int var188 = field721[var5 + 1];
                            int var189 = field721[var5 + 2];
                            int var190 = field721[var5 + 3];
                            class43 var191 = class43.method1363(var189);
                            if (var191.field984 == var187 && var191.field987 == var188) {
                                for (int var192 = 0; var192 < var191.field990; var192++) {
                                    if (var191.field991[var192] == var190) {
                                        if (var188 == 115) {
                                            field722[var6++] = var191.field993[var192];
                                        } else {
                                            field721[var5++] = var191.field992[var192];
                                        }
                                        var191 = null;
                                        break;
                                    }
                                }
                                if (var191 != null) {
                                    if (var188 == 115) {
                                        field722[var6++] = var191.field988;
                                    } else {
                                        field721[var5++] = var191.field998;
                                    }
                                }
                                continue;
                            }
                            if (var188 == 115) {
                                field722[var6++] = "null";
                            } else {
                                field721[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var432 < 3700) {
                        if (var432 == 3600) {
                            if (client.field515 == 0) {
                                field721[var5++] = -2;
                            } else if (client.field515 == 1) {
                                field721[var5++] = -1;
                            } else {
                                field721[var5++] = client.field514;
                            }
                            continue;
                        }
                        if (var432 == 3601) {
                            var5--;
                            int var193 = field721[var5];
                            if (client.field515 == 2 && var193 < client.field514) {
                                field722[var6++] = client.field298[var193].field234;
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var432 == 3602) {
                            var5--;
                            int var194 = field721[var5];
                            if (client.field515 == 2 && var194 < client.field514) {
                                field721[var5++] = client.field298[var194].field230;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var432 == 3603) {
                            var5--;
                            int var195 = field721[var5];
                            if (client.field515 == 2 && var195 < client.field514) {
                                field721[var5++] = client.field298[var195].field228;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var432 == 3604) {
                            var6--;
                            String var196 = field722[var6];
                            var5--;
                            int var197 = field721[var5];
                            client.field304.method2369(228);
                            client.field304.method2116(class107.method1004(var196) + 1);
                            client.field304.method2121(var196);
                            client.field304.method2116(var197);
                            continue;
                        }
                        if (var432 == 3605) {
                            var6--;
                            String var198 = field722[var6];
                            if (var198 == null) {
                                continue;
                            }
                            if ((client.field514 < 200 || client.field321 == 1) && client.field514 < 400) {
                                String var199 = class198.method2067(var198, Statics.field2697);
                                if (var199 == null) {
                                    continue;
                                }
                                for (int var200 = 0; var200 < client.field514; var200++) {
                                    class16 var201 = client.field298[var200];
                                    String var202 = class198.method2067(var201.field234, Statics.field2697);
                                    if (var202 != null && var202.equals(var199)) {
                                        class10.method545(30, "", var198 + class142.field2322);
                                        continue label2751;
                                    }
                                    if (var201.field242 != null) {
                                        String var203 = class198.method2067(var201.field242, Statics.field2697);
                                        if (var203 != null && var203.equals(var199)) {
                                            class10.method545(30, "", var198 + class142.field2322);
                                            continue label2751;
                                        }
                                    }
                                }
                                for (int var204 = 0; var204 < client.field518; var204++) {
                                    class8 var205 = client.field519[var204];
                                    String var206 = class198.method2067(var205.field130, Statics.field2697);
                                    if (var206 != null && var206.equals(var199)) {
                                        class10.method545(30, "", class142.field2327 + var198 + class142.field2192);
                                        continue label2751;
                                    }
                                    if (var205.field124 != null) {
                                        String var207 = class198.method2067(var205.field124, Statics.field2697);
                                        if (var207 != null && var207.equals(var199)) {
                                            class10.method545(30, "", class142.field2327 + var198 + class142.field2192);
                                            continue label2751;
                                        }
                                    }
                                }
                                if (class198.method2067(Statics.field391.field32, Statics.field2697).equals(var199)) {
                                    class10.method545(30, "", class142.field2325);
                                } else {
                                    client.field304.method2369(217);
                                    client.field304.method2116(class107.method1004(var198));
                                    client.field304.method2121(var198);
                                }
                                continue;
                            }
                            class10.method545(30, "", class142.field2321);
                            continue;
                        }
                        if (var432 == 3606) {
                            var6--;
                            String var208 = field722[var6];
                            if (var208 == null) {
                                continue;
                            }
                            String var209 = class198.method2067(var208, Statics.field2697);
                            if (var209 == null) {
                                continue;
                            }
                            int var210 = 0;
                            while (true) {
                                if (var210 >= client.field514) {
                                    continue label2751;
                                }
                                class16 var211 = client.field298[var210];
                                String var212 = var211.field234;
                                String var213 = class198.method2067(var212, Statics.field2697);
                                boolean var214;
                                if (var208 == null || var212 == null) {
                                    var214 = false;
                                } else if (var208.startsWith("#") || var212.startsWith("#")) {
                                    var214 = var208.equals(var212);
                                } else {
                                    var214 = var209.equals(var213);
                                }
                                if (var214) {
                                    client.field514--;
                                    for (int var215 = var210; var215 < client.field514; var215++) {
                                        client.field298[var215] = client.field298[var215 + 1];
                                    }
                                    client.field458 = client.field416;
                                    client.field304.method2369(12);
                                    client.field304.method2116(class107.method1004(var208));
                                    client.field304.method2121(var208);
                                    continue label2751;
                                }
                                var210++;
                            }
                        }
                        if (var432 == 3607) {
                            var6--;
                            String var216 = field722[var6];
                            if (var216 == null) {
                                continue;
                            }
                            if ((client.field518 < 100 || client.field321 == 1) && client.field518 < 400) {
                                String var217 = class198.method2067(var216, Statics.field2697);
                                if (var217 == null) {
                                    continue;
                                }
                                for (int var218 = 0; var218 < client.field518; var218++) {
                                    class8 var219 = client.field519[var218];
                                    String var220 = class198.method2067(var219.field130, Statics.field2697);
                                    if (var220 != null && var220.equals(var217)) {
                                        class10.method545(31, "", var216 + class142.field2324);
                                        continue label2751;
                                    }
                                    if (var219.field124 != null) {
                                        String var221 = class198.method2067(var219.field124, Statics.field2697);
                                        if (var221 != null && var221.equals(var217)) {
                                            class10.method545(31, "", var216 + class142.field2324);
                                            continue label2751;
                                        }
                                    }
                                }
                                for (int var222 = 0; var222 < client.field514; var222++) {
                                    class16 var223 = client.field298[var222];
                                    String var224 = class198.method2067(var223.field234, Statics.field2697);
                                    if (var224 != null && var224.equals(var217)) {
                                        class10.method545(31, "", class142.field2329 + var216 + class142.field2331);
                                        continue label2751;
                                    }
                                    if (var223.field242 != null) {
                                        String var225 = class198.method2067(var223.field242, Statics.field2697);
                                        if (var225 != null && var225.equals(var217)) {
                                            class10.method545(31, "", class142.field2329 + var216 + class142.field2331);
                                            continue label2751;
                                        }
                                    }
                                }
                                if (class198.method2067(Statics.field391.field32, Statics.field2697).equals(var217)) {
                                    class10.method545(31, "", class142.field2326);
                                } else {
                                    client.field304.method2369(255);
                                    client.field304.method2116(class107.method1004(var216));
                                    client.field304.method2121(var216);
                                }
                                continue;
                            }
                            class10.method545(31, "", class142.field2323);
                            continue;
                        }
                        if (var432 == 3608) {
                            var6--;
                            String var226 = field722[var6];
                            client.method1420(var226);
                            continue;
                        }
                        if (var432 == 3609) {
                            var6--;
                            String var227 = field722[var6];
                            if (var227.startsWith(class2.method1971(0)) || var227.startsWith(class2.method1971(1))) {
                                var227 = var227.substring(7);
                            }
                            field721[var5++] = client.method200(var227, false) ? 1 : 0;
                            continue;
                        }
                        if (var432 == 3611) {
                            if (client.field487 == null) {
                                field722[var6++] = "";
                            } else {
                                String[] var228 = field722;
                                int var229 = var6++;
                                String var230 = client.field487;
                                String var231 = class196.method3515(class196.method2719(var230));
                                if (var231 == null) {
                                    var231 = "";
                                }
                                var228[var229] = var231;
                            }
                            continue;
                        }
                        if (var432 == 3612) {
                            if (client.field487 == null) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = Statics.field1357;
                            }
                            continue;
                        }
                        if (var432 == 3613) {
                            var5--;
                            int var233 = field721[var5];
                            if (client.field487 != null && var233 < Statics.field1357) {
                                field722[var6++] = Statics.field1887[var233].field577;
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var432 == 3614) {
                            var5--;
                            int var234 = field721[var5];
                            if (client.field487 != null && var234 < Statics.field1357) {
                                field721[var5++] = Statics.field1887[var234].field568;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var432 == 3615) {
                            var5--;
                            int var235 = field721[var5];
                            if (client.field487 != null && var235 < Statics.field1357) {
                                field721[var5++] = Statics.field1887[var235].field570;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var432 == 3616) {
                            field721[var5++] = Statics.field148;
                            continue;
                        }
                        if (var432 == 3617) {
                            var6--;
                            String var236 = field722[var6];
                            Statics.method2722(var236);
                            continue;
                        }
                        if (var432 == 3618) {
                            field721[var5++] = Statics.field888;
                            continue;
                        }
                        if (var432 == 3619) {
                            var6--;
                            String var237 = field722[var6];
                            client.method2324(var237);
                            continue;
                        }
                        if (var432 == 3620) {
                            client.field304.method2369(232);
                            client.field304.method2116(0);
                            continue;
                        }
                        if (var432 == 3621) {
                            if (client.field515 == 0) {
                                field721[var5++] = -1;
                            } else {
                                field721[var5++] = client.field518;
                            }
                            continue;
                        }
                        if (var432 == 3622) {
                            var5--;
                            int var238 = field721[var5];
                            if (client.field515 != 0 && var238 < client.field518) {
                                field722[var6++] = client.field519[var238].field130;
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var432 == 3623) {
                            var6--;
                            String var239 = field722[var6];
                            if (var239.startsWith(class2.method1971(0)) || var239.startsWith(class2.method1971(1))) {
                                var239 = var239.substring(7);
                            }
                            field721[var5++] = client.method129(var239) ? 1 : 0;
                            continue;
                        }
                        if (var432 == 3624) {
                            var5--;
                            int var240 = field721[var5];
                            if (Statics.field1887 != null && var240 < Statics.field1357 && Statics.field1887[var240].field577.equalsIgnoreCase(Statics.field391.field32)) {
                                field721[var5++] = 1;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var432 == 3625) {
                            if (client.field488 == null) {
                                field722[var6++] = "";
                            } else {
                                String[] var241 = field722;
                                int var242 = var6++;
                                String var243 = client.field488;
                                String var244 = class196.method3515(class196.method2719(var243));
                                if (var244 == null) {
                                    var244 = "";
                                }
                                var241[var242] = var244;
                            }
                            continue;
                        }
                    } else if (var432 < 4100) {
                        if (var432 == 4000) {
                            var5 -= 2;
                            int var246 = field721[var5];
                            int var247 = field721[var5 + 1];
                            field721[var5++] = var246 + var247;
                            continue;
                        }
                        if (var432 == 4001) {
                            var5 -= 2;
                            int var248 = field721[var5];
                            int var249 = field721[var5 + 1];
                            field721[var5++] = var248 - var249;
                            continue;
                        }
                        if (var432 == 4002) {
                            var5 -= 2;
                            int var250 = field721[var5];
                            int var251 = field721[var5 + 1];
                            field721[var5++] = var250 * var251;
                            continue;
                        }
                        if (var432 == 4003) {
                            var5 -= 2;
                            int var252 = field721[var5];
                            int var253 = field721[var5 + 1];
                            field721[var5++] = var252 / var253;
                            continue;
                        }
                        if (var432 == 4004) {
                            var5--;
                            int var254 = field721[var5];
                            field721[var5++] = (int) (Math.random() * (double) var254);
                            continue;
                        }
                        if (var432 == 4005) {
                            var5--;
                            int var255 = field721[var5];
                            field721[var5++] = (int) (Math.random() * (double) (var255 + 1));
                            continue;
                        }
                        if (var432 == 4006) {
                            var5 -= 5;
                            int var256 = field721[var5];
                            int var257 = field721[var5 + 1];
                            int var258 = field721[var5 + 2];
                            int var259 = field721[var5 + 3];
                            int var260 = field721[var5 + 4];
                            field721[var5++] = (var257 - var256) * (var260 - var258) / (var259 - var258) + var256;
                            continue;
                        }
                        if (var432 == 4007) {
                            var5 -= 2;
                            int var261 = field721[var5];
                            int var262 = field721[var5 + 1];
                            field721[var5++] = var261 * var262 / 100 + var261;
                            continue;
                        }
                        if (var432 == 4008) {
                            var5 -= 2;
                            int var263 = field721[var5];
                            int var264 = field721[var5 + 1];
                            field721[var5++] = var263 | 0x1 << var264;
                            continue;
                        }
                        if (var432 == 4009) {
                            var5 -= 2;
                            int var265 = field721[var5];
                            int var266 = field721[var5 + 1];
                            field721[var5++] = var265 & -1 - (0x1 << var266);
                            continue;
                        }
                        if (var432 == 4010) {
                            var5 -= 2;
                            int var267 = field721[var5];
                            int var268 = field721[var5 + 1];
                            field721[var5++] = (var267 & 0x1 << var268) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var432 == 4011) {
                            var5 -= 2;
                            int var269 = field721[var5];
                            int var270 = field721[var5 + 1];
                            field721[var5++] = var269 % var270;
                            continue;
                        }
                        if (var432 == 4012) {
                            var5 -= 2;
                            int var271 = field721[var5];
                            int var272 = field721[var5 + 1];
                            if (var271 == 0) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = (int) Math.pow((double) var271, (double) var272);
                            }
                            continue;
                        }
                        if (var432 == 4013) {
                            var5 -= 2;
                            int var273 = field721[var5];
                            int var274 = field721[var5 + 1];
                            if (var273 == 0) {
                                field721[var5++] = 0;
                            } else if (var274 == 0) {
                                field721[var5++] = Integer.MAX_VALUE;
                            } else {
                                field721[var5++] = (int) Math.pow((double) var273, 1.0D / (double) var274);
                            }
                            continue;
                        }
                        if (var432 == 4014) {
                            var5 -= 2;
                            int var275 = field721[var5];
                            int var276 = field721[var5 + 1];
                            field721[var5++] = var275 & var276;
                            continue;
                        }
                        if (var432 == 4015) {
                            var5 -= 2;
                            int var277 = field721[var5];
                            int var278 = field721[var5 + 1];
                            field721[var5++] = var277 | var278;
                            continue;
                        }
                    } else if (var432 < 4200) {
                        if (var432 == 4100) {
                            var6--;
                            String var279 = field722[var6];
                            var5--;
                            int var280 = field721[var5];
                            field722[var6++] = var279 + var280;
                            continue;
                        }
                        if (var432 == 4101) {
                            var6 -= 2;
                            String var281 = field722[var6];
                            String var282 = field722[var6 + 1];
                            field722[var6++] = var281 + var282;
                            continue;
                        }
                        if (var432 == 4102) {
                            var6--;
                            String var283 = field722[var6];
                            var5--;
                            int var284 = field721[var5];
                            field722[var6++] = var283 + class197.method502(var284, true);
                            continue;
                        }
                        if (var432 == 4103) {
                            var6--;
                            String var285 = field722[var6];
                            field722[var6++] = var285.toLowerCase();
                            continue;
                        }
                        if (var432 == 4104) {
                            var5--;
                            int var286 = field721[var5];
                            long var287 = ((long) var286 + 11745L) * 86400000L;
                            field726.setTime(new Date(var287));
                            int var289 = field726.get(5);
                            int var290 = field726.get(2);
                            int var291 = field726.get(1);
                            field722[var6++] = var289 + "-" + field727[var290] + "-" + var291;
                            continue;
                        }
                        if (var432 == 4105) {
                            var6 -= 2;
                            String var292 = field722[var6];
                            String var293 = field722[var6 + 1];
                            if (Statics.field391.field38 != null && Statics.field391.field38.field2676) {
                                field722[var6++] = var293;
                                continue;
                            }
                            field722[var6++] = var292;
                            continue;
                        }
                        if (var432 == 4106) {
                            var5--;
                            int var294 = field721[var5];
                            field722[var6++] = Integer.toString(var294);
                            continue;
                        }
                        if (var432 == 4107) {
                            var6 -= 2;
                            int[] var295 = field721;
                            int var296 = var5++;
                            String var297 = field722[var6];
                            String var298 = field722[var6 + 1];
                            int var299 = client.field266;
                            int var300 = var297.length();
                            int var301 = var298.length();
                            int var302 = 0;
                            int var303 = 0;
                            char var304 = 0;
                            char var305 = 0;
                            int var306;
                            label2570: while (true) {
                                if (var302 - var304 >= var300 && var303 - var305 >= var301) {
                                    int var315 = Math.min(var300, var301);
                                    for (int var316 = 0; var316 < var315; var316++) {
                                        char var319 = var297.charAt(var316);
                                        char var320 = var298.charAt(var316);
                                        if (var319 != var320 && Character.toUpperCase(var319) != Character.toUpperCase(var320)) {
                                            char var321 = Character.toLowerCase(var319);
                                            char var322 = Character.toLowerCase(var320);
                                            if (var321 != var322) {
                                                var306 = class200.method1046(var321, var299) - class200.method1046(var322, var299);
                                                break label2570;
                                            }
                                        }
                                    }
                                    int var323 = var300 - var301;
                                    if (var323 == 0) {
                                        for (int var324 = 0; var324 < var315; var324++) {
                                            char var325 = var297.charAt(var324);
                                            char var326 = var298.charAt(var324);
                                            if (var325 != var326) {
                                                var306 = class200.method1046(var325, var299) - class200.method1046(var326, var299);
                                                break label2570;
                                            }
                                        }
                                        var306 = 0;
                                    } else {
                                        var306 = var323;
                                    }
                                    break;
                                }
                                if (var302 - var304 >= var300) {
                                    var306 = -1;
                                    break;
                                }
                                if (var303 - var305 >= var301) {
                                    var306 = 1;
                                    break;
                                }
                                char var307;
                                if (var304 == 0) {
                                    var307 = var297.charAt(var302++);
                                } else {
                                    var307 = var304;
                                    boolean var308 = false;
                                }
                                char var309;
                                if (var305 == 0) {
                                    var309 = var298.charAt(var303++);
                                } else {
                                    var309 = var305;
                                    boolean var310 = false;
                                }
                                var304 = Statics.method2852(var307);
                                var305 = Statics.method2852(var309);
                                char var311 = class200.method2926(var307, var299);
                                char var312 = class200.method2926(var309, var299);
                                if (var311 != var312 && Character.toUpperCase(var311) != Character.toUpperCase(var312)) {
                                    char var313 = Character.toLowerCase(var311);
                                    char var314 = Character.toLowerCase(var312);
                                    if (var313 != var314) {
                                        var306 = class200.method1046(var313, var299) - class200.method1046(var314, var299);
                                        break;
                                    }
                                }
                            }
                            byte var328;
                            if (var306 > 0) {
                                var328 = 1;
                            } else if (var306 < 0) {
                                var328 = -1;
                            } else {
                                var328 = 0;
                            }
                            var295[var296] = var328;
                            continue;
                        }
                        if (var432 == 4108) {
                            var6--;
                            String var329 = field722[var6];
                            var5 -= 2;
                            int var330 = field721[var5];
                            int var331 = field721[var5 + 1];
                            byte[] var332 = Statics.field1820.method2739(var331, 0);
                            class191 var333 = new class191(var332);
                            field721[var5++] = var333.method3349(var329, var330);
                            continue;
                        }
                        if (var432 == 4109) {
                            var6--;
                            String var334 = field722[var6];
                            var5 -= 2;
                            int var335 = field721[var5];
                            int var336 = field721[var5 + 1];
                            byte[] var337 = Statics.field1820.method2739(var336, 0);
                            class191 var338 = new class191(var337);
                            field721[var5++] = var338.method3341(var334, var335);
                            continue;
                        }
                        if (var432 == 4110) {
                            var6 -= 2;
                            String var339 = field722[var6];
                            String var340 = field722[var6 + 1];
                            var5--;
                            if (field721[var5] == 1) {
                                field722[var6++] = var339;
                            } else {
                                field722[var6++] = var340;
                            }
                            continue;
                        }
                        if (var432 == 4111) {
                            var6--;
                            String var341 = field722[var6];
                            field722[var6++] = class190.method3343(var341);
                            continue;
                        }
                        if (var432 == 4112) {
                            var6--;
                            String var342 = field722[var6];
                            var5--;
                            int var343 = field721[var5];
                            field722[var6++] = var342 + (char) var343;
                            continue;
                        }
                        if (var432 == 4113) {
                            var5--;
                            int var344 = field721[var5];
                            field721[var5++] = class197.method2383((char) var344) ? 1 : 0;
                            continue;
                        }
                        if (var432 == 4114) {
                            var5--;
                            int var345 = field721[var5];
                            field721[var5++] = class197.method3480((char) var345) ? 1 : 0;
                            continue;
                        }
                        if (var432 == 4115) {
                            var5--;
                            int var346 = field721[var5];
                            int[] var347 = field721;
                            int var348 = var5++;
                            char var349 = (char) var346;
                            boolean var350 = var349 >= 'A' && var349 <= 'Z' || var349 >= 'a' && var349 <= 'z';
                            var347[var348] = var350 ? 1 : 0;
                            continue;
                        }
                        if (var432 == 4116) {
                            var5--;
                            int var351 = field721[var5];
                            int[] var352 = field721;
                            int var353 = var5++;
                            char var354 = (char) var351;
                            boolean var355 = var354 >= '0' && var354 <= '9';
                            var352[var353] = var355 ? 1 : 0;
                            continue;
                        }
                        if (var432 == 4117) {
                            var6--;
                            String var356 = field722[var6];
                            if (var356 == null) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = var356.length();
                            }
                            continue;
                        }
                        if (var432 == 4118) {
                            var6--;
                            String var357 = field722[var6];
                            var5 -= 2;
                            int var358 = field721[var5];
                            int var359 = field721[var5 + 1];
                            field722[var6++] = var357.substring(var358, var359);
                            continue;
                        }
                        if (var432 == 4119) {
                            var6--;
                            String var360 = field722[var6];
                            StringBuilder var361 = new StringBuilder(var360.length());
                            boolean var362 = false;
                            for (int var363 = 0; var363 < var360.length(); var363++) {
                                char var364 = var360.charAt(var363);
                                if (var364 == '<') {
                                    var362 = true;
                                } else if (var364 == '>') {
                                    var362 = false;
                                } else if (!var362) {
                                    var361.append(var364);
                                }
                            }
                            field722[var6++] = var361.toString();
                            continue;
                        }
                        if (var432 == 4120) {
                            var6--;
                            String var365 = field722[var6];
                            var5--;
                            int var366 = field721[var5];
                            field721[var5++] = var365.indexOf(var366);
                            continue;
                        }
                        if (var432 == 4121) {
                            var6 -= 2;
                            String var367 = field722[var6];
                            String var368 = field722[var6 + 1];
                            var5--;
                            int var369 = field721[var5];
                            field721[var5++] = var367.indexOf(var368, var369);
                            continue;
                        }
                    } else if (var432 < 4300) {
                        if (var432 == 4200) {
                            var5--;
                            int var370 = field721[var5];
                            field722[var6++] = class45.method500(var370).field1026;
                            continue;
                        }
                        if (var432 == 4201) {
                            var5 -= 2;
                            int var371 = field721[var5];
                            int var372 = field721[var5 + 1];
                            class45 var373 = class45.method500(var371);
                            if (var372 >= 1 && var372 <= 5 && var373.field1032[var372 - 1] != null) {
                                field722[var6++] = var373.field1032[var372 - 1];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var432 == 4202) {
                            var5 -= 2;
                            int var374 = field721[var5];
                            int var375 = field721[var5 + 1];
                            class45 var376 = class45.method500(var374);
                            if (var375 >= 1 && var375 <= 5 && var376.field1033[var375 - 1] != null) {
                                field722[var6++] = var376.field1033[var375 - 1];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var432 == 4203) {
                            var5--;
                            int var377 = field721[var5];
                            field721[var5++] = class45.method500(var377).field1030;
                            continue;
                        }
                        if (var432 == 4204) {
                            var5--;
                            int var378 = field721[var5];
                            field721[var5++] = class45.method500(var378).field1053 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var432 == 4205) {
                            var5--;
                            int var379 = field721[var5];
                            class45 var380 = class45.method500(var379);
                            if (var380.field1049 == -1 && var380.field1015 >= 0) {
                                field721[var5++] = var380.field1015;
                                continue;
                            }
                            field721[var5++] = var379;
                            continue;
                        }
                        if (var432 == 4206) {
                            var5--;
                            int var381 = field721[var5];
                            class45 var382 = class45.method500(var381);
                            if (var382.field1049 >= 0 && var382.field1015 >= 0) {
                                field721[var5++] = var382.field1015;
                                continue;
                            }
                            field721[var5++] = var381;
                            continue;
                        }
                        if (var432 == 4207) {
                            var5--;
                            int var383 = field721[var5];
                            field721[var5++] = class45.method500(var383).field1021 ? 1 : 0;
                            continue;
                        }
                    } else if (var432 < 5100) {
                        if (var432 == 5000) {
                            field721[var5++] = client.field392;
                            continue;
                        }
                        if (var432 == 5001) {
                            var5 -= 3;
                            client.field392 = field721[var5];
                            Statics.field2039 = class117.method2486(field721[var5 + 1]);
                            if (Statics.field2039 == null) {
                                Statics.field2039 = class117.field1906;
                            }
                            client.field480 = field721[var5 + 2];
                            client.field304.method2369(106);
                            client.field304.method2116(client.field392);
                            client.field304.method2116(Statics.field2039.field1909);
                            client.field304.method2116(client.field480);
                            continue;
                        }
                        if (var432 == 5002) {
                            var6--;
                            String var384 = field722[var6];
                            var5 -= 2;
                            int var385 = field721[var5];
                            int var386 = field721[var5 + 1];
                            client.field304.method2369(45);
                            client.field304.method2116(class107.method1004(var384) + 2);
                            client.field304.method2121(var384);
                            client.field304.method2116(var385 - 1);
                            client.field304.method2116(var386);
                            continue;
                        }
                        if (var432 == 5003) {
                            var5 -= 2;
                            int var387 = field721[var5];
                            int var388 = field721[var5 + 1];
                            class31 var389 = class10.method2915(var387, var388);
                            if (var389 == null) {
                                field721[var5++] = -1;
                                field721[var5++] = 0;
                                field722[var6++] = "";
                                field722[var6++] = "";
                                field722[var6++] = "";
                            } else {
                                field721[var5++] = var389.field713;
                                field721[var5++] = var389.field704;
                                field722[var6++] = var389.field706 == null ? "" : var389.field706;
                                field722[var6++] = var389.field705 == null ? "" : var389.field705;
                                field722[var6++] = var389.field709 == null ? "" : var389.field709;
                            }
                            continue;
                        }
                        if (var432 == 5004) {
                            var5--;
                            int var390 = field721[var5];
                            class31 var391 = class10.method2715(var390);
                            if (var391 == null) {
                                field721[var5++] = -1;
                                field721[var5++] = 0;
                                field722[var6++] = "";
                                field722[var6++] = "";
                                field722[var6++] = "";
                            } else {
                                field721[var5++] = var391.field715;
                                field721[var5++] = var391.field704;
                                field722[var6++] = var391.field706 == null ? "" : var391.field706;
                                field722[var6++] = var391.field705 == null ? "" : var391.field705;
                                field722[var6++] = var391.field709 == null ? "" : var391.field709;
                            }
                            continue;
                        }
                        if (var432 == 5005) {
                            if (Statics.field2039 == null) {
                                field721[var5++] = -1;
                            } else {
                                field721[var5++] = Statics.field2039.field1909;
                            }
                            continue;
                        }
                        if (var432 == 5008) {
                            var6--;
                            String var392 = field722[var6];
                            var5--;
                            int var393 = field721[var5];
                            String var394 = var392.toLowerCase();
                            byte var395 = 0;
                            if (var394.startsWith(class142.field2233)) {
                                var395 = 0;
                                var392 = var392.substring(class142.field2233.length());
                            } else if (var394.startsWith(class142.field2258)) {
                                var395 = 1;
                                var392 = var392.substring(class142.field2258.length());
                            } else if (var394.startsWith(class142.field2335)) {
                                var395 = 2;
                                var392 = var392.substring(class142.field2335.length());
                            } else if (var394.startsWith(class142.field2345)) {
                                var395 = 3;
                                var392 = var392.substring(class142.field2345.length());
                            } else if (var394.startsWith(class142.field2239)) {
                                var395 = 4;
                                var392 = var392.substring(class142.field2239.length());
                            } else if (var394.startsWith(class142.field2341)) {
                                var395 = 5;
                                var392 = var392.substring(class142.field2341.length());
                            } else if (var394.startsWith(class142.field2200)) {
                                var395 = 6;
                                var392 = var392.substring(class142.field2200.length());
                            } else if (var394.startsWith(class142.field2342)) {
                                var395 = 7;
                                var392 = var392.substring(class142.field2342.length());
                            } else if (var394.startsWith(class142.field2347)) {
                                var395 = 8;
                                var392 = var392.substring(class142.field2347.length());
                            } else if (var394.startsWith(class142.field2349)) {
                                var395 = 9;
                                var392 = var392.substring(class142.field2349.length());
                            } else if (var394.startsWith(class142.field2399)) {
                                var395 = 10;
                                var392 = var392.substring(class142.field2399.length());
                            } else if (var394.startsWith(class142.field2162)) {
                                var395 = 11;
                                var392 = var392.substring(class142.field2162.length());
                            } else if (client.field266 != 0) {
                                if (var394.startsWith(class142.field2314)) {
                                    var395 = 0;
                                    var392 = var392.substring(class142.field2314.length());
                                } else if (var394.startsWith(class142.field2334)) {
                                    var395 = 1;
                                    var392 = var392.substring(class142.field2334.length());
                                } else if (var394.startsWith(class142.field2336)) {
                                    var395 = 2;
                                    var392 = var392.substring(class142.field2336.length());
                                } else if (var394.startsWith(class142.field2338)) {
                                    var395 = 3;
                                    var392 = var392.substring(class142.field2338.length());
                                } else if (var394.startsWith(class142.field2340)) {
                                    var395 = 4;
                                    var392 = var392.substring(class142.field2340.length());
                                } else if (var394.startsWith(class142.field2171)) {
                                    var395 = 5;
                                    var392 = var392.substring(class142.field2171.length());
                                } else if (var394.startsWith(class142.field2344)) {
                                    var395 = 6;
                                    var392 = var392.substring(class142.field2344.length());
                                } else if (var394.startsWith(class142.field2339)) {
                                    var395 = 7;
                                    var392 = var392.substring(class142.field2339.length());
                                } else if (var394.startsWith(class142.field2348)) {
                                    var395 = 8;
                                    var392 = var392.substring(class142.field2348.length());
                                } else if (var394.startsWith(class142.field2350)) {
                                    var395 = 9;
                                    var392 = var392.substring(class142.field2350.length());
                                } else if (var394.startsWith(class142.field2352)) {
                                    var395 = 10;
                                    var392 = var392.substring(class142.field2352.length());
                                } else if (var394.startsWith(class142.field2372)) {
                                    var395 = 11;
                                    var392 = var392.substring(class142.field2372.length());
                                }
                            }
                            String var396 = var392.toLowerCase();
                            byte var397 = 0;
                            if (var396.startsWith(class142.field2355)) {
                                var397 = 1;
                                var392 = var392.substring(class142.field2355.length());
                            } else if (var396.startsWith(class142.field2160)) {
                                var397 = 2;
                                var392 = var392.substring(class142.field2160.length());
                            } else if (var396.startsWith(class142.field2359)) {
                                var397 = 3;
                                var392 = var392.substring(class142.field2359.length());
                            } else if (var396.startsWith(class142.field2361)) {
                                var397 = 4;
                                var392 = var392.substring(class142.field2361.length());
                            } else if (var396.startsWith(class142.field2306)) {
                                var397 = 5;
                                var392 = var392.substring(class142.field2306.length());
                            } else if (client.field266 != 0) {
                                if (var396.startsWith(class142.field2356)) {
                                    var397 = 1;
                                    var392 = var392.substring(class142.field2356.length());
                                } else if (var396.startsWith(class142.field2156)) {
                                    var397 = 2;
                                    var392 = var392.substring(class142.field2156.length());
                                } else if (var396.startsWith(class142.field2360)) {
                                    var397 = 3;
                                    var392 = var392.substring(class142.field2360.length());
                                } else if (var396.startsWith(class142.field2362)) {
                                    var397 = 4;
                                    var392 = var392.substring(class142.field2362.length());
                                } else if (var396.startsWith(class142.field2364)) {
                                    var397 = 5;
                                    var392 = var392.substring(class142.field2364.length());
                                }
                            }
                            client.field304.method2369(132);
                            client.field304.method2116(0);
                            int var398 = client.field304.field1847;
                            client.field304.method2116(var393);
                            client.field304.method2116(var395);
                            client.field304.method2116(var397);
                            class110 var399 = client.field304;
                            int var400 = var399.field1847;
                            int var401 = var392.length();
                            byte[] var402 = new byte[var401];
                            for (int var403 = 0; var403 < var401; var403++) {
                                char var404 = var392.charAt(var403);
                                if (var404 > 0 && var404 < 128 || var404 >= 160 && var404 <= 255) {
                                    var402[var403] = (byte) var404;
                                } else if (var404 == 8364) {
                                    var402[var403] = -128;
                                } else if (var404 == 8218) {
                                    var402[var403] = -126;
                                } else if (var404 == 402) {
                                    var402[var403] = -125;
                                } else if (var404 == 8222) {
                                    var402[var403] = -124;
                                } else if (var404 == 8230) {
                                    var402[var403] = -123;
                                } else if (var404 == 8224) {
                                    var402[var403] = -122;
                                } else if (var404 == 8225) {
                                    var402[var403] = -121;
                                } else if (var404 == 710) {
                                    var402[var403] = -120;
                                } else if (var404 == 8240) {
                                    var402[var403] = -119;
                                } else if (var404 == 352) {
                                    var402[var403] = -118;
                                } else if (var404 == 8249) {
                                    var402[var403] = -117;
                                } else if (var404 == 338) {
                                    var402[var403] = -116;
                                } else if (var404 == 381) {
                                    var402[var403] = -114;
                                } else if (var404 == 8216) {
                                    var402[var403] = -111;
                                } else if (var404 == 8217) {
                                    var402[var403] = -110;
                                } else if (var404 == 8220) {
                                    var402[var403] = -109;
                                } else if (var404 == 8221) {
                                    var402[var403] = -108;
                                } else if (var404 == 8226) {
                                    var402[var403] = -107;
                                } else if (var404 == 8211) {
                                    var402[var403] = -106;
                                } else if (var404 == 8212) {
                                    var402[var403] = -105;
                                } else if (var404 == 732) {
                                    var402[var403] = -104;
                                } else if (var404 == 8482) {
                                    var402[var403] = -103;
                                } else if (var404 == 353) {
                                    var402[var403] = -102;
                                } else if (var404 == 8250) {
                                    var402[var403] = -101;
                                } else if (var404 == 339) {
                                    var402[var403] = -100;
                                } else if (var404 == 382) {
                                    var402[var403] = -98;
                                } else if (var404 == 376) {
                                    var402[var403] = -97;
                                } else {
                                    var402[var403] = 63;
                                }
                            }
                            var399.method2128(var402.length);
                            var399.field1847 += Statics.field2889.method2058(var402, 0, var402.length, var399.field1849, var399.field1847);
                            client.field304.method2276(client.field304.field1847 - var398);
                            continue;
                        }
                        if (var432 == 5009) {
                            var6 -= 2;
                            String var407 = field722[var6];
                            String var408 = field722[var6 + 1];
                            client.field304.method2369(167);
                            client.field304.method2270(0);
                            int var409 = client.field304.field1847;
                            client.field304.method2121(var407);
                            class110 var410 = client.field304;
                            int var411 = var410.field1847;
                            int var412 = var408.length();
                            byte[] var413 = new byte[var412];
                            for (int var414 = 0; var414 < var412; var414++) {
                                char var415 = var408.charAt(var414);
                                if (var415 > 0 && var415 < 128 || var415 >= 160 && var415 <= 255) {
                                    var413[var414] = (byte) var415;
                                } else if (var415 == 8364) {
                                    var413[var414] = -128;
                                } else if (var415 == 8218) {
                                    var413[var414] = -126;
                                } else if (var415 == 402) {
                                    var413[var414] = -125;
                                } else if (var415 == 8222) {
                                    var413[var414] = -124;
                                } else if (var415 == 8230) {
                                    var413[var414] = -123;
                                } else if (var415 == 8224) {
                                    var413[var414] = -122;
                                } else if (var415 == 8225) {
                                    var413[var414] = -121;
                                } else if (var415 == 710) {
                                    var413[var414] = -120;
                                } else if (var415 == 8240) {
                                    var413[var414] = -119;
                                } else if (var415 == 352) {
                                    var413[var414] = -118;
                                } else if (var415 == 8249) {
                                    var413[var414] = -117;
                                } else if (var415 == 338) {
                                    var413[var414] = -116;
                                } else if (var415 == 381) {
                                    var413[var414] = -114;
                                } else if (var415 == 8216) {
                                    var413[var414] = -111;
                                } else if (var415 == 8217) {
                                    var413[var414] = -110;
                                } else if (var415 == 8220) {
                                    var413[var414] = -109;
                                } else if (var415 == 8221) {
                                    var413[var414] = -108;
                                } else if (var415 == 8226) {
                                    var413[var414] = -107;
                                } else if (var415 == 8211) {
                                    var413[var414] = -106;
                                } else if (var415 == 8212) {
                                    var413[var414] = -105;
                                } else if (var415 == 732) {
                                    var413[var414] = -104;
                                } else if (var415 == 8482) {
                                    var413[var414] = -103;
                                } else if (var415 == 353) {
                                    var413[var414] = -102;
                                } else if (var415 == 8250) {
                                    var413[var414] = -101;
                                } else if (var415 == 339) {
                                    var413[var414] = -100;
                                } else if (var415 == 382) {
                                    var413[var414] = -98;
                                } else if (var415 == 376) {
                                    var413[var414] = -97;
                                } else {
                                    var413[var414] = 63;
                                }
                            }
                            var410.method2128(var413.length);
                            var410.field1847 += Statics.field2889.method2058(var413, 0, var413.length, var410.field1849, var410.field1847);
                            client.field304.method2150(client.field304.field1847 - var409);
                            continue;
                        }
                        if (var432 == 5015) {
                            String var418;
                            if (Statics.field391 == null || Statics.field391.field32 == null) {
                                var418 = "";
                            } else {
                                var418 = Statics.field391.field32;
                            }
                            field722[var6++] = var418;
                            continue;
                        }
                        if (var432 == 5016) {
                            field721[var5++] = client.field480;
                            continue;
                        }
                        if (var432 == 5017) {
                            var5--;
                            int var419 = field721[var5];
                            field721[var5++] = class10.method2716(var419);
                            continue;
                        }
                        if (var432 == 5018) {
                            var5--;
                            int var420 = field721[var5];
                            field721[var5++] = class10.method39(var420);
                            continue;
                        }
                        if (var432 == 5019) {
                            var5--;
                            int var421 = field721[var5];
                            int[] var422 = field721;
                            int var423 = var5++;
                            class31 var424 = (class31) class10.field151.method3226((long) var421);
                            int var425;
                            if (var424 == null) {
                                var425 = -1;
                            } else if (class10.field152.field2850 == var424.field2854) {
                                var425 = -1;
                            } else {
                                var425 = ((class31) var424.field2854).field713;
                            }
                            var422[var423] = var425;
                            continue;
                        }
                        if (var432 == 5020) {
                            var6--;
                            String var426 = field722[var6];
                            if (var426.equalsIgnoreCase("toggleroof")) {
                                Statics.field1921.field140 = !Statics.field1921.field140;
                                class9.method552();
                                if (Statics.field1921.field140) {
                                    class10.method545(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method545(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field432 >= 2) {
                                if (var426.equalsIgnoreCase("fpson")) {
                                    client.field276 = true;
                                }
                                if (var426.equalsIgnoreCase("fpsoff")) {
                                    client.field276 = false;
                                }
                                if (var426.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var426.equalsIgnoreCase("clientdrop")) {
                                    client.method27();
                                }
                                if (var426.equalsIgnoreCase("errortest") && client.field317 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field304.method2369(176);
                            client.field304.method2116(var426.length() + 1);
                            client.field304.method2121(var426);
                            continue;
                        }
                    }
                } else {
                    class152 var83;
                    if (var432 >= 2000) {
                        var432 -= 1000;
                        var5--;
                        var83 = class152.method2559(field721[var5]);
                    } else {
                        var83 = var58 ? Statics.field725 : Statics.field1901;
                    }
                    if (var432 == 1300) {
                        var5--;
                        int var84 = field721[var5] - 1;
                        if (var84 >= 0 && var84 <= 9) {
                            var6--;
                            var83.method2876(var84, field722[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var432 == 1301) {
                        var5 -= 2;
                        int var85 = field721[var5];
                        int var86 = field721[var5 + 1];
                        var83.field2599 = Statics.method2714(var85, var86);
                        continue;
                    }
                    if (var432 == 1302) {
                        var5--;
                        var83.field2602 = field721[var5] == 1;
                        continue;
                    }
                    if (var432 == 1303) {
                        var5--;
                        var83.field2600 = field721[var5];
                        continue;
                    }
                    if (var432 == 1304) {
                        var5--;
                        var83.field2570 = field721[var5];
                        continue;
                    }
                    if (var432 == 1305) {
                        var6--;
                        var83.field2597 = field722[var6];
                        continue;
                    }
                    if (var432 == 1306) {
                        var6--;
                        var83.field2537 = field722[var6];
                        continue;
                    }
                    if (var432 == 1307) {
                        var83.field2592 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var431) {
            StringBuilder var428 = new StringBuilder(30);
            var428.append("").append(var4.field2861).append(" ");
            for (int var429 = field724 - 1; var429 >= 0; var429--) {
                var428.append("").append(field729[var429].field182.field2861).append(" ");
            }
            var428.append("").append(var10);
            class135.method495(var428.toString(), var431);
        }
    }

    @ObfuscatedName("p.y(II)V")
    public static void method470(int arg0) {
        if (arg0 == -1 || !class152.method487(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2633[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3.field2605 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field9 = var3.field2605;
                method2605(var4, 2000000);
            }
        }
    }
}
