package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("as")
public class class32 {

    @ObfuscatedName("as.w")
    public static int[] field725 = new int[5];

    @ObfuscatedName("as.m")
    public static int[][] field726 = new int[5][5000];

    @ObfuscatedName("as.u")
    public static int[] field722 = new int[1000];

    @ObfuscatedName("as.j")
    public static String[] field728 = new String[1000];

    @ObfuscatedName("as.o")
    public static int field724 = 0;

    @ObfuscatedName("as.h")
    public static class13[] field730 = new class13[50];

    @ObfuscatedName("as.l")
    public static Calendar field732 = Calendar.getInstance();

    @ObfuscatedName("as.x")
    public static final String[] field733 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.g(Lg;I)V")
    public static void method44(class1 arg0) {
        method35(arg0, 200000);
    }

    @ObfuscatedName("e.i(Lg;II)V")
    public static void method35(class1 arg0, int arg1) {
        Object[] var2 = arg0.field5;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method1743(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field527;
        int[] var9 = var4.field528;
        byte var10 = -1;
        field724 = 0;
        try {
            Statics.field723 = new int[var4.field529];
            int var11 = 0;
            Statics.field727 = new String[var4.field531];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field14;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2583;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2557;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field2 == null ? -1 : arg0.field2.field2583;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field2 == null ? -1 : arg0.field2.field2557;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field7;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field723[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field727[var12++] = var15;
                }
            }
            int var16 = 0;
            label2535: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var448 = var8[var7];
                if (var448 < 100) {
                    if (var448 == 0) {
                        field722[var5++] = var9[var7];
                        continue;
                    }
                    if (var448 == 1) {
                        int var17 = var9[var7];
                        field722[var5++] = class155.field2684[var17];
                        continue;
                    }
                    if (var448 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class155.field2684[var18] = field722[var5];
                        client.method2408(var18);
                        continue;
                    }
                    if (var448 == 3) {
                        field728[var6++] = var4.field536[var7];
                        continue;
                    }
                    if (var448 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var448 == 7) {
                        var5 -= 2;
                        if (field722[var5 + 1] != field722[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var448 == 8) {
                        var5 -= 2;
                        if (field722[var5 + 1] == field722[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var448 == 9) {
                        var5 -= 2;
                        if (field722[var5] < field722[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var448 == 10) {
                        var5 -= 2;
                        if (field722[var5] > field722[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var448 == 21) {
                        if (field724 == 0) {
                            return;
                        }
                        class13 var19 = field730[--field724];
                        var4 = var19.field199;
                        var8 = var4.field527;
                        var9 = var4.field528;
                        var7 = var19.field193;
                        Statics.field723 = var19.field198;
                        Statics.field727 = var19.field195;
                        continue;
                    }
                    if (var448 == 25) {
                        int var20 = var9[var7];
                        field722[var5++] = class155.method879(var20);
                        continue;
                    }
                    if (var448 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class155.method479(var21, field722[var5]);
                        continue;
                    }
                    if (var448 == 31) {
                        var5 -= 2;
                        if (field722[var5] <= field722[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var448 == 32) {
                        var5 -= 2;
                        if (field722[var5] >= field722[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var448 == 33) {
                        field722[var5++] = Statics.field723[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var448 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field723[var10001] = field722[var5];
                        continue;
                    }
                    if (var448 == 35) {
                        field728[var6++] = Statics.field727[var9[var7]];
                        continue;
                    }
                    if (var448 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field727[var10001] = field728[var6];
                        continue;
                    }
                    if (var448 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field728;
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
                        field728[var6++] = var24;
                        continue;
                    }
                    if (var448 == 38) {
                        var5--;
                        continue;
                    }
                    if (var448 == 39) {
                        var6--;
                        continue;
                    }
                    if (var448 == 40) {
                        int var34 = var9[var7];
                        class19 var35 = class19.method1743(var34);
                        int[] var36 = new int[var35.field529];
                        String[] var37 = new String[var35.field531];
                        for (int var38 = 0; var38 < var35.field532; var38++) {
                            var36[var38] = field722[var5 - var35.field532 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field530; var39++) {
                            var37[var39] = field728[var6 - var35.field530 + var39];
                        }
                        var5 -= var35.field532;
                        var6 -= var35.field530;
                        class13 var40 = new class13();
                        var40.field199 = var4;
                        var40.field193 = var7;
                        var40.field198 = Statics.field723;
                        var40.field195 = Statics.field727;
                        field730[++field724 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field527;
                        var9 = var35.field528;
                        var7 = -1;
                        Statics.field723 = var36;
                        Statics.field727 = var37;
                        continue;
                    }
                    if (var448 == 42) {
                        field722[var5++] = client.field338[var9[var7]];
                        continue;
                    }
                    if (var448 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field338[var10001] = field722[var5];
                        continue;
                    }
                    if (var448 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field722[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field725[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2535;
                                }
                                field726[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var448 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field722[var5];
                        if (var47 >= 0 && var47 < field725[var46]) {
                            field722[var5++] = field726[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var448 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field722[var5];
                        if (var49 >= 0 && var49 < field725[var48]) {
                            field726[var48][var49] = field722[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var448 == 47) {
                        String var50 = client.field453[var9[var7]];
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field728[var6++] = var50;
                        continue;
                    }
                    if (var448 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field453[var10001] = field728[var6];
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var448 < 1000) {
                    if (var448 == 100) {
                        var5 -= 3;
                        int var52 = field722[var5];
                        int var53 = field722[var5 + 1];
                        int var54 = field722[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class153 var55 = class153.method1565(var52);
                        if (var55.field2664 == null) {
                            var55.field2664 = new class153[var54 + 1];
                        }
                        if (var55.field2664.length <= var54) {
                            class153[] var56 = new class153[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2664.length; var57++) {
                                var56[var57] = var55.field2664[var57];
                            }
                            var55.field2664 = var56;
                        }
                        if (var54 > 0 && var55.field2664[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class153 var58 = new class153();
                        var58.field2558 = var53;
                        var58.field2654 = var58.field2583 = var55.field2583;
                        var58.field2557 = var54;
                        var58.field2635 = true;
                        var55.field2664[var54] = var58;
                        if (var51) {
                            Statics.field731 = var58;
                        } else {
                            Statics.field1252 = var58;
                        }
                        client.method1830(var55);
                        continue;
                    }
                    if (var448 == 101) {
                        class153 var59 = var51 ? Statics.field731 : Statics.field1252;
                        class153 var60 = class153.method1565(var59.field2583);
                        var60.field2664[var59.field2557] = null;
                        client.method1830(var60);
                        continue;
                    }
                    if (var448 == 102) {
                        var5--;
                        class153 var61 = class153.method1565(field722[var5]);
                        var61.field2664 = null;
                        client.method1830(var61);
                        continue;
                    }
                    if (var448 == 200) {
                        var5 -= 2;
                        int var62 = field722[var5];
                        int var63 = field722[var5 + 1];
                        class153 var64 = class153.method2544(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field722[var5++] = 1;
                            if (var51) {
                                Statics.field731 = var64;
                            } else {
                                Statics.field1252 = var64;
                            }
                            continue;
                        }
                        field722[var5++] = 0;
                        continue;
                    }
                } else if (!(var448 < 1000 || var448 >= 1100) || !(var448 < 2000 || var448 >= 2100)) {
                    class153 var65;
                    if (var448 >= 2000) {
                        var448 -= 1000;
                        var5--;
                        var65 = class153.method1565(field722[var5]);
                    } else {
                        var65 = var51 ? Statics.field731 : Statics.field1252;
                    }
                    if (var448 == 1000) {
                        var5 -= 2;
                        var65.field2581 = field722[var5];
                        var65.field2562 = field722[var5 + 1];
                        client.method1830(var65);
                        continue;
                    }
                    if (var448 == 1001) {
                        var5 -= 2;
                        var65.field2565 = field722[var5];
                        var65.field2603 = field722[var5 + 1];
                        client.method1830(var65);
                        continue;
                    }
                    if (var448 == 1003) {
                        var5--;
                        boolean var66 = field722[var5] == 1;
                        if (var65.field2568 != var66) {
                            var65.field2568 = var66;
                            client.method1830(var65);
                        }
                        continue;
                    }
                } else if (!(var448 < 1100 || var448 >= 1200) || !(var448 < 2100 || var448 >= 2200)) {
                    class153 var67;
                    if (var448 >= 2000) {
                        var448 -= 1000;
                        var5--;
                        var67 = class153.method1565(field722[var5]);
                    } else {
                        var67 = var51 ? Statics.field731 : Statics.field1252;
                    }
                    if (var448 == 1100) {
                        var5 -= 2;
                        var67.field2569 = field722[var5];
                        if (var67.field2569 > var67.field2643 - var67.field2565) {
                            var67.field2569 = var67.field2643 - var67.field2565;
                        }
                        if (var67.field2569 < 0) {
                            var67.field2569 = 0;
                        }
                        var67.field2659 = field722[var5 + 1];
                        if (var67.field2659 > var67.field2639 - var67.field2603) {
                            var67.field2659 = var67.field2639 - var67.field2603;
                        }
                        if (var67.field2659 < 0) {
                            var67.field2659 = 0;
                        }
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1101) {
                        var5--;
                        var67.field2573 = field722[var5];
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1102) {
                        var5--;
                        var67.field2546 = field722[var5] == 1;
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1103) {
                        var5--;
                        var67.field2548 = field722[var5];
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1104) {
                        var5--;
                        var67.field2579 = field722[var5];
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1105) {
                        var5--;
                        var67.field2580 = field722[var5];
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1106) {
                        var5--;
                        var67.field2582 = field722[var5];
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1107) {
                        var5--;
                        var67.field2673 = field722[var5] == 1;
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1108) {
                        var67.field2588 = 1;
                        var5--;
                        var67.field2589 = field722[var5];
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1109) {
                        var5 -= 6;
                        var67.field2594 = field722[var5];
                        var67.field2595 = field722[var5 + 1];
                        var67.field2578 = field722[var5 + 2];
                        var67.field2550 = field722[var5 + 3];
                        var67.field2598 = field722[var5 + 4];
                        var67.field2599 = field722[var5 + 5];
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1110) {
                        var5--;
                        int var68 = field722[var5];
                        if (var67.field2592 != var68) {
                            var67.field2592 = var68;
                            var67.field2626 = 0;
                            var67.field2663 = 0;
                            client.method1830(var67);
                        }
                        continue;
                    }
                    if (var448 == 1111) {
                        var5--;
                        var67.field2652 = field722[var5] == 1;
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1112) {
                        var6--;
                        String var69 = field728[var6];
                        if (!var69.equals(var67.field2620)) {
                            var67.field2620 = var69;
                            client.method1830(var67);
                        }
                        continue;
                    }
                    if (var448 == 1113) {
                        var5--;
                        var67.field2602 = field722[var5];
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1114) {
                        var5 -= 3;
                        var67.field2606 = field722[var5];
                        var67.field2607 = field722[var5 + 1];
                        var67.field2605 = field722[var5 + 2];
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1115) {
                        var5--;
                        var67.field2566 = field722[var5] == 1;
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1116) {
                        var5--;
                        var67.field2584 = field722[var5];
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1117) {
                        var5--;
                        var67.field2634 = field722[var5];
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1118) {
                        var5--;
                        var67.field2630 = field722[var5] == 1;
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1119) {
                        var5--;
                        var67.field2587 = field722[var5] == 1;
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1120) {
                        var5 -= 2;
                        var67.field2643 = field722[var5];
                        var67.field2639 = field722[var5 + 1];
                        client.method1830(var67);
                        continue;
                    }
                    if (var448 == 1121) {
                        int var70 = var67.field2583;
                        int var71 = var67.field2557;
                        client.field298.method2335(61);
                        client.field298.method2244(var70);
                        client.field298.method2100(var71);
                        client.field436 = var67;
                        client.method1830(var67);
                        continue;
                    }
                } else if (!(var448 < 1200 || var448 >= 1300) || !(var448 < 2200 || var448 >= 2300)) {
                    class153 var72;
                    if (var448 >= 2000) {
                        var448 -= 1000;
                        var5--;
                        var72 = class153.method1565(field722[var5]);
                    } else {
                        var72 = var51 ? Statics.field731 : Statics.field1252;
                    }
                    client.method1830(var72);
                    if (var448 == 1200) {
                        var5 -= 2;
                        int var73 = field722[var5];
                        int var74 = field722[var5 + 1];
                        var72.field2660 = var73;
                        var72.field2661 = var74;
                        class45 var75 = Statics.method2406(var73);
                        var72.field2578 = var75.field1020;
                        var72.field2550 = var75.field1021;
                        var72.field2598 = var75.field1008;
                        var72.field2594 = var75.field1023;
                        var72.field2595 = var75.field1024;
                        var72.field2599 = var75.field1031;
                        if (var72.field2565 > 0) {
                            var72.field2599 = var72.field2599 * 32 / var72.field2565;
                        }
                        continue;
                    }
                    if (var448 == 1201) {
                        var72.field2588 = 2;
                        var5--;
                        var72.field2589 = field722[var5];
                        continue;
                    }
                    if (var448 == 1202) {
                        var72.field2588 = 3;
                        var72.field2589 = Statics.field1767.field35.method2925();
                        continue;
                    }
                } else if (var448 >= 1300 && var448 < 1400 || var448 >= 2300 && var448 < 2400) {
                    class153 var76;
                    if (var448 >= 2000) {
                        var448 -= 1000;
                        var5--;
                        var76 = class153.method1565(field722[var5]);
                    } else {
                        var76 = var51 ? Statics.field731 : Statics.field1252;
                    }
                    if (var448 == 1300) {
                        var5--;
                        int var77 = field722[var5] - 1;
                        if (var77 >= 0 && var77 <= 9) {
                            var6--;
                            var76.method2826(var77, field728[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var448 == 1301) {
                        var5 -= 2;
                        int var78 = field722[var5];
                        int var79 = field722[var5 + 1];
                        var76.field2618 = class153.method2544(var78, var79);
                        continue;
                    }
                    if (var448 == 1302) {
                        var5--;
                        var76.field2621 = field722[var5] == 1;
                        continue;
                    }
                    if (var448 == 1303) {
                        var5--;
                        var76.field2619 = field722[var5];
                        continue;
                    }
                    if (var448 == 1304) {
                        var5--;
                        var76.field2586 = field722[var5];
                        continue;
                    }
                    if (var448 == 1305) {
                        var6--;
                        var76.field2647 = field728[var6];
                        continue;
                    }
                    if (var448 == 1306) {
                        var6--;
                        var76.field2622 = field728[var6];
                        continue;
                    }
                    if (var448 == 1307) {
                        var76.field2617 = null;
                        continue;
                    }
                } else {
                    if (var448 >= 1400 && var448 < 1500 || var448 >= 2400 && var448 < 2500) {
                        class153 var80;
                        if (var448 >= 2000) {
                            var448 -= 1000;
                            var5--;
                            var80 = class153.method1565(field722[var5]);
                        } else {
                            var80 = var51 ? Statics.field731 : Statics.field1252;
                        }
                        var6--;
                        String var81 = field728[var6];
                        int[] var82 = null;
                        if (var81.length() > 0 && var81.charAt(var81.length() - 1) == 'Y') {
                            var5--;
                            int var83 = field722[var5];
                            if (var83 > 0) {
                                var82 = new int[var83];
                                while (var83-- > 0) {
                                    var5--;
                                    var82[var83] = field722[var5];
                                }
                            }
                            var81 = var81.substring(0, var81.length() - 1);
                        }
                        Object[] var84 = new Object[var81.length() + 1];
                        for (int var85 = var84.length - 1; var85 >= 1; var85--) {
                            if (var81.charAt(var85 - 1) == 's') {
                                var6--;
                                var84[var85] = field728[var6];
                            } else {
                                var5--;
                                var84[var85] = Integer.valueOf(field722[var5]);
                            }
                        }
                        var5--;
                        int var86 = field722[var5];
                        if (var86 == -1) {
                            var84 = null;
                        } else {
                            var84[0] = Integer.valueOf(var86);
                        }
                        if (var448 == 1400) {
                            var80.field2625 = var84;
                        }
                        if (var448 == 1401) {
                            var80.field2555 = var84;
                        }
                        if (var448 == 1402) {
                            var80.field2561 = var84;
                        }
                        if (var448 == 1403) {
                            var80.field2601 = var84;
                        }
                        if (var448 == 1404) {
                            var80.field2613 = var84;
                        }
                        if (var448 == 1405) {
                            var80.field2632 = var84;
                        }
                        if (var448 == 1406) {
                            var80.field2628 = var84;
                        }
                        if (var448 == 1407) {
                            var80.field2636 = var84;
                            var80.field2637 = var82;
                        }
                        if (var448 == 1408) {
                            var80.field2642 = var84;
                        }
                        if (var448 == 1409) {
                            var80.field2559 = var84;
                        }
                        if (var448 == 1410) {
                            var80.field2633 = var84;
                        }
                        if (var448 == 1411) {
                            var80.field2572 = var84;
                        }
                        if (var448 == 1412) {
                            var80.field2608 = var84;
                        }
                        if (var448 == 1414) {
                            var80.field2638 = var84;
                            var80.field2627 = var82;
                        }
                        if (var448 == 1415) {
                            var80.field2640 = var84;
                            var80.field2641 = var82;
                        }
                        if (var448 == 1416) {
                            var80.field2616 = var84;
                        }
                        if (var448 == 1417) {
                            var80.field2644 = var84;
                        }
                        if (var448 == 1418) {
                            var80.field2629 = var84;
                        }
                        if (var448 == 1419) {
                            var80.field2646 = var84;
                        }
                        if (var448 == 1420) {
                            var80.field2662 = var84;
                        }
                        if (var448 == 1421) {
                            var80.field2648 = var84;
                        }
                        if (var448 == 1422) {
                            var80.field2649 = var84;
                        }
                        if (var448 == 1423) {
                            var80.field2650 = var84;
                        }
                        if (var448 == 1424) {
                            var80.field2577 = var84;
                        }
                        var80.field2623 = true;
                        continue;
                    }
                    if (var448 < 1600) {
                        class153 var87 = var51 ? Statics.field731 : Statics.field1252;
                        if (var448 == 1500) {
                            field722[var5++] = var87.field2581;
                            continue;
                        }
                        if (var448 == 1501) {
                            field722[var5++] = var87.field2562;
                            continue;
                        }
                        if (var448 == 1502) {
                            field722[var5++] = var87.field2565;
                            continue;
                        }
                        if (var448 == 1503) {
                            field722[var5++] = var87.field2603;
                            continue;
                        }
                        if (var448 == 1504) {
                            field722[var5++] = var87.field2568 ? 1 : 0;
                            continue;
                        }
                        if (var448 == 1505) {
                            field722[var5++] = var87.field2654;
                            continue;
                        }
                    } else if (var448 < 1700) {
                        class153 var88 = var51 ? Statics.field731 : Statics.field1252;
                        if (var448 == 1600) {
                            field722[var5++] = var88.field2569;
                            continue;
                        }
                        if (var448 == 1601) {
                            field722[var5++] = var88.field2659;
                            continue;
                        }
                        if (var448 == 1602) {
                            field728[var6++] = var88.field2620;
                            continue;
                        }
                        if (var448 == 1603) {
                            field722[var5++] = var88.field2643;
                            continue;
                        }
                        if (var448 == 1604) {
                            field722[var5++] = var88.field2639;
                            continue;
                        }
                        if (var448 == 1605) {
                            field722[var5++] = var88.field2599;
                            continue;
                        }
                        if (var448 == 1606) {
                            field722[var5++] = var88.field2578;
                            continue;
                        }
                        if (var448 == 1607) {
                            field722[var5++] = var88.field2598;
                            continue;
                        }
                        if (var448 == 1608) {
                            field722[var5++] = var88.field2550;
                            continue;
                        }
                    } else if (var448 < 1800) {
                        class153 var89 = var51 ? Statics.field731 : Statics.field1252;
                        if (var448 == 1700) {
                            field722[var5++] = var89.field2660;
                            continue;
                        }
                        if (var448 == 1701) {
                            if (var89.field2660 == -1) {
                                field722[var5++] = 0;
                            } else {
                                field722[var5++] = var89.field2661;
                            }
                            continue;
                        }
                        if (var448 == 1702) {
                            field722[var5++] = var89.field2557;
                            continue;
                        }
                    } else if (var448 < 1900) {
                        class153 var90 = var51 ? Statics.field731 : Statics.field1252;
                        if (var448 == 1800) {
                            int[] var91 = field722;
                            int var92 = var5++;
                            int var93 = client.method1833(var90);
                            int var94 = var93 >> 11 & 0x3F;
                            var91[var92] = var94;
                            continue;
                        }
                        if (var448 == 1801) {
                            var5--;
                            int var95 = field722[var5];
                            int var449 = var95 - 1;
                            if (var90.field2617 != null && var449 < var90.field2617.length && var90.field2617[var449] != null) {
                                field728[var6++] = var90.field2617[var449];
                                continue;
                            }
                            field728[var6++] = "";
                            continue;
                        }
                        if (var448 == 1802) {
                            if (var90.field2647 == null) {
                                field728[var6++] = "";
                            } else {
                                field728[var6++] = var90.field2647;
                            }
                            continue;
                        }
                    } else if (var448 < 2600) {
                        var5--;
                        class153 var96 = class153.method1565(field722[var5]);
                        if (var448 == 2500) {
                            field722[var5++] = var96.field2581;
                            continue;
                        }
                        if (var448 == 2501) {
                            field722[var5++] = var96.field2562;
                            continue;
                        }
                        if (var448 == 2502) {
                            field722[var5++] = var96.field2565;
                            continue;
                        }
                        if (var448 == 2503) {
                            field722[var5++] = var96.field2603;
                            continue;
                        }
                        if (var448 == 2504) {
                            field722[var5++] = var96.field2568 ? 1 : 0;
                            continue;
                        }
                        if (var448 == 2505) {
                            field722[var5++] = var96.field2654;
                            continue;
                        }
                    } else if (var448 < 2700) {
                        var5--;
                        class153 var97 = class153.method1565(field722[var5]);
                        if (var448 == 2600) {
                            field722[var5++] = var97.field2569;
                            continue;
                        }
                        if (var448 == 2601) {
                            field722[var5++] = var97.field2659;
                            continue;
                        }
                        if (var448 == 2602) {
                            field728[var6++] = var97.field2620;
                            continue;
                        }
                        if (var448 == 2603) {
                            field722[var5++] = var97.field2643;
                            continue;
                        }
                        if (var448 == 2604) {
                            field722[var5++] = var97.field2639;
                            continue;
                        }
                        if (var448 == 2605) {
                            field722[var5++] = var97.field2599;
                            continue;
                        }
                        if (var448 == 2606) {
                            field722[var5++] = var97.field2578;
                            continue;
                        }
                        if (var448 == 2607) {
                            field722[var5++] = var97.field2598;
                            continue;
                        }
                        if (var448 == 2608) {
                            field722[var5++] = var97.field2550;
                            continue;
                        }
                    } else if (var448 < 2800) {
                        if (var448 == 2700) {
                            var5--;
                            class153 var98 = class153.method1565(field722[var5]);
                            field722[var5++] = var98.field2660;
                            continue;
                        }
                        if (var448 == 2701) {
                            var5--;
                            class153 var99 = class153.method1565(field722[var5]);
                            if (var99.field2660 == -1) {
                                field722[var5++] = 0;
                            } else {
                                field722[var5++] = var99.field2661;
                            }
                            continue;
                        }
                        if (var448 == 2702) {
                            var5--;
                            int var100 = field722[var5];
                            class4 var101 = (class4) client.field418.method3174((long) var100);
                            if (var101 == null) {
                                field722[var5++] = 0;
                            } else {
                                field722[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var448 < 2900) {
                        var5--;
                        class153 var102 = class153.method1565(field722[var5]);
                        if (var448 == 2800) {
                            int[] var103 = field722;
                            int var104 = var5++;
                            int var105 = client.method1833(var102);
                            int var106 = var105 >> 11 & 0x3F;
                            var103[var104] = var106;
                            continue;
                        }
                        if (var448 == 2801) {
                            var5--;
                            int var107 = field722[var5];
                            int var450 = var107 - 1;
                            if (var102.field2617 != null && var450 < var102.field2617.length && var102.field2617[var450] != null) {
                                field728[var6++] = var102.field2617[var450];
                                continue;
                            }
                            field728[var6++] = "";
                            continue;
                        }
                        if (var448 == 2802) {
                            if (var102.field2647 == null) {
                                field728[var6++] = "";
                            } else {
                                field728[var6++] = var102.field2647;
                            }
                            continue;
                        }
                    } else if (var448 < 3200) {
                        if (var448 == 3100) {
                            var6--;
                            String var108 = field728[var6];
                            class10.method469(0, "", var108);
                            continue;
                        }
                        if (var448 == 3101) {
                            var5 -= 2;
                            client.method2455(Statics.field1767, field722[var5], field722[var5 + 1]);
                            continue;
                        }
                        if (var448 == 3103) {
                            client.method2642();
                            continue;
                        }
                        if (var448 == 3104) {
                            var6--;
                            String var109 = field728[var6];
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
                                label2744: {
                                    char var116 = var109.charAt(var115);
                                    if (var115 == 0) {
                                        if (var116 == '-') {
                                            var111 = true;
                                            break label2744;
                                        }
                                        if (var116 == '+') {
                                            break label2744;
                                        }
                                    }
                                    int var451;
                                    if (var116 >= '0' && var116 <= '9') {
                                        var451 = var116 - '0';
                                    } else if (var116 >= 'A' && var116 <= 'Z') {
                                        var451 = var116 - '7';
                                    } else {
                                        if (var116 < 'a' || var116 > 'z') {
                                            var117 = false;
                                            break;
                                        }
                                        var451 = var116 - 'W';
                                    }
                                    if (var451 >= 10) {
                                        var117 = false;
                                        break;
                                    }
                                    if (var111) {
                                        var451 = -var451;
                                    }
                                    int var118 = var113 * 10 + var451;
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
                                int var120 = class200.method97(var109, 10, true);
                                var110 = var120;
                            }
                            client.field298.method2335(225);
                            client.field298.method2247(var110);
                            continue;
                        }
                        if (var448 == 3105) {
                            var6--;
                            String var121 = field728[var6];
                            client.field298.method2335(238);
                            client.field298.method2079(var121.length() + 1);
                            client.field298.method2193(var121);
                            continue;
                        }
                        if (var448 == 3106) {
                            var6--;
                            String var122 = field728[var6];
                            client.field298.method2335(108);
                            client.field298.method2079(var122.length() + 1);
                            client.field298.method2193(var122);
                            continue;
                        }
                        if (var448 == 3107) {
                            var5--;
                            int var123 = field722[var5];
                            var6--;
                            String var124 = field728[var6];
                            client.method110(var123, var124);
                            continue;
                        }
                        if (var448 == 3108) {
                            var5 -= 3;
                            int var125 = field722[var5];
                            int var126 = field722[var5 + 1];
                            int var127 = field722[var5 + 2];
                            class153 var128 = class153.method1565(var127);
                            client.method2860(var128, var125, var126);
                            continue;
                        }
                        if (var448 == 3109) {
                            var5 -= 2;
                            int var129 = field722[var5];
                            int var130 = field722[var5 + 1];
                            class153 var131 = var51 ? Statics.field731 : Statics.field1252;
                            client.method2860(var131, var129, var130);
                            continue;
                        }
                        if (var448 == 3110) {
                            var5--;
                            Statics.field235 = field722[var5] == 1;
                            continue;
                        }
                        if (var448 == 3111) {
                            field722[var5++] = Statics.field1459.field140 ? 1 : 0;
                            continue;
                        }
                        if (var448 == 3112) {
                            var5--;
                            Statics.field1459.field140 = field722[var5] == 1;
                            class9.method8();
                            continue;
                        }
                        if (var448 == 3113) {
                            var6--;
                            String var132 = field728[var6];
                            var5--;
                            boolean var133 = field722[var5] == 1;
                            if (!var133) {
                                class125.method661(var132, 3);
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var132));
                                    continue;
                                } catch (Exception var446) {
                                }
                            }
                            if (class125.field1994.startsWith("win")) {
                                class125.method661(var132, 0);
                            } else if (class125.field1994.startsWith("mac")) {
                                class125.method1950(var132, 1, "openjs");
                            } else {
                                class125.method661(var132, 2);
                            }
                            continue;
                        }
                    } else if (var448 < 3300) {
                        if (var448 == 3200) {
                            var5 -= 3;
                            client.method31(field722[var5], field722[var5 + 1], field722[var5 + 2]);
                            continue;
                        }
                        if (var448 == 3201) {
                            var5--;
                            client.method516(field722[var5]);
                            continue;
                        }
                        if (var448 == 3202) {
                            var5 -= 2;
                            client.method1741(field722[var5], field722[var5 + 1]);
                            continue;
                        }
                    } else if (var448 < 3400) {
                        if (var448 == 3300) {
                            field722[var5++] = client.field269;
                            continue;
                        }
                        if (var448 == 3301) {
                            var5 -= 2;
                            int var135 = field722[var5];
                            int var136 = field722[var5 + 1];
                            int[] var137 = field722;
                            int var138 = var5++;
                            class14 var139 = (class14) class14.field208.method3174((long) var135);
                            int var140;
                            if (var139 == null) {
                                var140 = -1;
                            } else if (var136 >= 0 && var136 < var139.field207.length) {
                                var140 = var139.field207[var136];
                            } else {
                                var140 = -1;
                            }
                            var137[var138] = var140;
                            continue;
                        }
                        if (var448 == 3302) {
                            var5 -= 2;
                            int var141 = field722[var5];
                            int var142 = field722[var5 + 1];
                            field722[var5++] = class14.method454(var141, var142);
                            continue;
                        }
                        if (var448 == 3303) {
                            var5 -= 2;
                            int var143 = field722[var5];
                            int var144 = field722[var5 + 1];
                            field722[var5++] = class14.method2542(var143, var144);
                            continue;
                        }
                        if (var448 == 3304) {
                            var5--;
                            int var145 = field722[var5];
                            field722[var5++] = class44.method117(var145).field1003;
                            continue;
                        }
                        if (var448 == 3305) {
                            var5--;
                            int var146 = field722[var5];
                            field722[var5++] = client.field394[var146];
                            continue;
                        }
                        if (var448 == 3306) {
                            var5--;
                            int var147 = field722[var5];
                            field722[var5++] = client.field395[var147];
                            continue;
                        }
                        if (var448 == 3307) {
                            var5--;
                            int var148 = field722[var5];
                            field722[var5++] = client.field516[var148];
                            continue;
                        }
                        if (var448 == 3308) {
                            int var149 = Statics.field1;
                            int var150 = (Statics.field1767.field780 >> 7) + Statics.field1870;
                            int var151 = (Statics.field1767.field761 >> 7) + Statics.field47;
                            field722[var5++] = (var149 << 28) + (var150 << 14) + var151;
                            continue;
                        }
                        if (var448 == 3309) {
                            var5--;
                            int var152 = field722[var5];
                            field722[var5++] = var152 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var448 == 3310) {
                            var5--;
                            int var153 = field722[var5];
                            field722[var5++] = var153 >> 28;
                            continue;
                        }
                        if (var448 == 3311) {
                            var5--;
                            int var154 = field722[var5];
                            field722[var5++] = var154 & 0x3FFF;
                            continue;
                        }
                        if (var448 == 3312) {
                            field722[var5++] = client.field264 ? 1 : 0;
                            continue;
                        }
                        if (var448 == 3313) {
                            var5 -= 2;
                            int var155 = field722[var5] + 32768;
                            int var156 = field722[var5 + 1];
                            int[] var157 = field722;
                            int var158 = var5++;
                            class14 var159 = (class14) class14.field208.method3174((long) var155);
                            int var160;
                            if (var159 == null) {
                                var160 = -1;
                            } else if (var156 >= 0 && var156 < var159.field207.length) {
                                var160 = var159.field207[var156];
                            } else {
                                var160 = -1;
                            }
                            var157[var158] = var160;
                            continue;
                        }
                        if (var448 == 3314) {
                            var5 -= 2;
                            int var161 = field722[var5] + 32768;
                            int var162 = field722[var5 + 1];
                            int[] var163 = field722;
                            int var164 = var5++;
                            class14 var165 = (class14) class14.field208.method3174((long) var161);
                            int var166;
                            if (var165 == null) {
                                var166 = 0;
                            } else if (var162 >= 0 && var162 < var165.field206.length) {
                                var166 = var165.field206[var162];
                            } else {
                                var166 = 0;
                            }
                            var163[var164] = var166;
                            continue;
                        }
                        if (var448 == 3315) {
                            var5 -= 2;
                            int var167 = field722[var5] + 32768;
                            int var168 = field722[var5 + 1];
                            field722[var5++] = class14.method2542(var167, var168);
                            continue;
                        }
                        if (var448 == 3316) {
                            if (client.field424 >= 2) {
                                field722[var5++] = client.field424;
                            } else {
                                field722[var5++] = 0;
                            }
                            continue;
                        }
                        if (var448 == 3317) {
                            field722[var5++] = client.field276;
                            continue;
                        }
                        if (var448 == 3318) {
                            field722[var5++] = client.field258;
                            continue;
                        }
                        if (var448 == 3321) {
                            field722[var5++] = client.field272;
                            continue;
                        }
                        if (var448 == 3322) {
                            field722[var5++] = client.field299;
                            continue;
                        }
                        if (var448 == 3323) {
                            if (client.field426) {
                                field722[var5++] = 1;
                            } else {
                                field722[var5++] = 0;
                            }
                            continue;
                        }
                        if (var448 == 3324) {
                            field722[var5++] = client.field259;
                            continue;
                        }
                    } else if (var448 < 3500) {
                        if (var448 == 3400) {
                            var5 -= 2;
                            int var169 = field722[var5];
                            int var170 = field722[var5 + 1];
                            class43 var171 = (class43) class43.field988.method3135((long) var169);
                            class43 var172;
                            if (var171 == null) {
                                byte[] var173 = Statics.field996.method2734(8, var169);
                                class43 var174 = new class43();
                                if (var173 != null) {
                                    var174.method798(new class107(var173));
                                }
                                class43.field988.method3140(var174, (long) var169);
                                var172 = var174;
                            } else {
                                var172 = var171;
                            }
                            class43 var175 = var172;
                            if (var172.field985 != 's') {
                            }
                            for (int var176 = 0; var176 < var175.field991; var176++) {
                                if (var175.field994[var176] == var170) {
                                    field728[var6++] = var175.field990[var176];
                                    var175 = null;
                                    break;
                                }
                            }
                            if (var175 != null) {
                                field728[var6++] = var175.field986;
                            }
                            continue;
                        }
                        if (var448 == 3408) {
                            var5 -= 4;
                            int var177 = field722[var5];
                            int var178 = field722[var5 + 1];
                            int var179 = field722[var5 + 2];
                            int var180 = field722[var5 + 3];
                            class43 var181 = (class43) class43.field988.method3135((long) var179);
                            class43 var182;
                            if (var181 == null) {
                                byte[] var183 = Statics.field996.method2734(8, var179);
                                class43 var184 = new class43();
                                if (var183 != null) {
                                    var184.method798(new class107(var183));
                                }
                                class43.field988.method3140(var184, (long) var179);
                                var182 = var184;
                            } else {
                                var182 = var181;
                            }
                            class43 var185 = var182;
                            if (var182.field987 == var177 && var182.field985 == var178) {
                                for (int var186 = 0; var186 < var185.field991; var186++) {
                                    if (var185.field994[var186] == var180) {
                                        if (var178 == 115) {
                                            field728[var6++] = var185.field990[var186];
                                        } else {
                                            field722[var5++] = var185.field992[var186];
                                        }
                                        var185 = null;
                                        break;
                                    }
                                }
                                if (var185 != null) {
                                    if (var178 == 115) {
                                        field728[var6++] = var185.field986;
                                    } else {
                                        field722[var5++] = var185.field989;
                                    }
                                }
                                continue;
                            }
                            if (var178 == 115) {
                                field728[var6++] = "null";
                            } else {
                                field722[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var448 < 3700) {
                        if (var448 == 3600) {
                            if (client.field375 == 0) {
                                field722[var5++] = -2;
                            } else if (client.field375 == 1) {
                                field722[var5++] = -1;
                            } else {
                                field722[var5++] = client.field507;
                            }
                            continue;
                        }
                        if (var448 == 3601) {
                            var5--;
                            int var187 = field722[var5];
                            if (client.field375 == 2 && var187 < client.field507) {
                                field728[var6++] = client.field509[var187].field236;
                                field728[var6++] = client.field509[var187].field237;
                                continue;
                            }
                            field728[var6++] = "";
                            field728[var6++] = "";
                            continue;
                        }
                        if (var448 == 3602) {
                            var5--;
                            int var188 = field722[var5];
                            if (client.field375 == 2 && var188 < client.field507) {
                                field722[var5++] = client.field509[var188].field231;
                                continue;
                            }
                            field722[var5++] = 0;
                            continue;
                        }
                        if (var448 == 3603) {
                            var5--;
                            int var189 = field722[var5];
                            if (client.field375 == 2 && var189 < client.field507) {
                                field722[var5++] = client.field509[var189].field234;
                                continue;
                            }
                            field722[var5++] = 0;
                            continue;
                        }
                        if (var448 == 3604) {
                            var6--;
                            String var190 = field728[var6];
                            var5--;
                            int var191 = field722[var5];
                            client.field298.method2335(199);
                            class110 var192 = client.field298;
                            int var193 = var190.length() + 1;
                            var192.method2079(var193 + 1);
                            client.field298.method2193(var190);
                            client.field298.method2079(var191);
                            continue;
                        }
                        if (var448 == 3605) {
                            var6--;
                            String var194 = field728[var6];
                            if (var194 == null) {
                                continue;
                            }
                            if ((client.field507 < 200 || client.field508 == 1) && client.field507 < 400) {
                                String var195 = class201.method2517(var194, Statics.field274);
                                if (var195 == null) {
                                    continue;
                                }
                                for (int var196 = 0; var196 < client.field507; var196++) {
                                    class16 var197 = client.field509[var196];
                                    String var198 = class201.method2517(var197.field236, Statics.field274);
                                    if (var198 != null && var198.equals(var195)) {
                                        class10.method469(30, "", var194 + class143.field2337);
                                        continue label2535;
                                    }
                                    if (var197.field237 != null) {
                                        String var199 = class201.method2517(var197.field237, Statics.field274);
                                        if (var199 != null && var199.equals(var195)) {
                                            class10.method469(30, "", var194 + class143.field2337);
                                            continue label2535;
                                        }
                                    }
                                }
                                for (int var200 = 0; var200 < client.field457; var200++) {
                                    class8 var201 = client.field512[var200];
                                    String var202 = class201.method2517(var201.field129, Statics.field274);
                                    if (var202 != null && var202.equals(var195)) {
                                        class10.method469(30, "", class143.field2342 + var194 + class143.field2343);
                                        continue label2535;
                                    }
                                    if (var201.field128 != null) {
                                        String var203 = class201.method2517(var201.field128, Statics.field274);
                                        if (var203 != null && var203.equals(var195)) {
                                            class10.method469(30, "", class143.field2342 + var194 + class143.field2343);
                                            continue label2535;
                                        }
                                    }
                                }
                                if (class201.method2517(Statics.field1767.field45, Statics.field274).equals(var195)) {
                                    class10.method469(30, "", class143.field2260);
                                } else {
                                    client.field298.method2335(118);
                                    class110 var204 = client.field298;
                                    int var205 = var194.length() + 1;
                                    var204.method2079(var205);
                                    client.field298.method2193(var194);
                                }
                                continue;
                            }
                            class10.method469(30, "", class143.field2335);
                            continue;
                        }
                        if (var448 == 3606) {
                            var6--;
                            String var206 = field728[var6];
                            client.method547(var206);
                            continue;
                        }
                        if (var448 == 3607) {
                            var6--;
                            String var207 = field728[var6];
                            client.method877(var207, false);
                            continue;
                        }
                        if (var448 == 3608) {
                            var6--;
                            String var208 = field728[var6];
                            client.method2331(var208);
                            continue;
                        }
                        if (var448 == 3609) {
                            var6--;
                            String var209 = field728[var6];
                            class138[] var210 = class138.method2462();
                            for (int var211 = 0; var211 < var210.length; var211++) {
                                class138 var212 = var210[var211];
                                if (var212.field2116 != -1) {
                                    int var214 = var212.field2116;
                                    String var215 = "<img=" + var214 + ">";
                                    if (var209.startsWith(var215)) {
                                        var209 = var209.substring(6 + Integer.toString(var212.field2116).length());
                                        break;
                                    }
                                }
                            }
                            field722[var5++] = client.method2454(var209, false) ? 1 : 0;
                            continue;
                        }
                        if (var448 == 3611) {
                            if (client.field480 == null) {
                                field728[var6++] = "";
                            } else {
                                String[] var216 = field728;
                                int var217 = var6++;
                                String var218 = client.field480;
                                String var219 = class199.method743(class199.method2547(var218));
                                if (var219 == null) {
                                    var219 = "";
                                }
                                var216[var217] = var219;
                            }
                            continue;
                        }
                        if (var448 == 3612) {
                            if (client.field480 == null) {
                                field722[var5++] = 0;
                            } else {
                                field722[var5++] = Statics.field1354;
                            }
                            continue;
                        }
                        if (var448 == 3613) {
                            var5--;
                            int var221 = field722[var5];
                            if (client.field480 != null && var221 < Statics.field1354) {
                                field728[var6++] = Statics.field175[var221].field565;
                                continue;
                            }
                            field728[var6++] = "";
                            continue;
                        }
                        if (var448 == 3614) {
                            var5--;
                            int var222 = field722[var5];
                            if (client.field480 != null && var222 < Statics.field1354) {
                                field722[var5++] = Statics.field175[var222].field567;
                                continue;
                            }
                            field722[var5++] = 0;
                            continue;
                        }
                        if (var448 == 3615) {
                            var5--;
                            int var223 = field722[var5];
                            if (client.field480 != null && var223 < Statics.field1354) {
                                field722[var5++] = Statics.field175[var223].field563;
                                continue;
                            }
                            field722[var5++] = 0;
                            continue;
                        }
                        if (var448 == 3616) {
                            field722[var5++] = Statics.field174;
                            continue;
                        }
                        if (var448 == 3617) {
                            var6--;
                            String var224 = field728[var6];
                            client.method1568(var224);
                            continue;
                        }
                        if (var448 == 3618) {
                            field722[var5++] = Statics.field1820;
                            continue;
                        }
                        if (var448 == 3619) {
                            var6--;
                            String var225 = field728[var6];
                            if (!var225.equals("")) {
                                client.field298.method2335(41);
                                class110 var226 = client.field298;
                                int var227 = var225.length() + 1;
                                var226.method2079(var227);
                                client.field298.method2193(var225);
                            }
                            continue;
                        }
                        if (var448 == 3620) {
                            client.method2040();
                            continue;
                        }
                        if (var448 == 3621) {
                            if (client.field375 == 0) {
                                field722[var5++] = -1;
                            } else {
                                field722[var5++] = client.field457;
                            }
                            continue;
                        }
                        if (var448 == 3622) {
                            var5--;
                            int var228 = field722[var5];
                            if (client.field375 != 0 && var228 < client.field457) {
                                field728[var6++] = client.field512[var228].field129;
                                field728[var6++] = client.field512[var228].field128;
                                continue;
                            }
                            field728[var6++] = "";
                            field728[var6++] = "";
                            continue;
                        }
                        if (var448 == 3623) {
                            String var229;
                            label2272: {
                                var6--;
                                var229 = field728[var6];
                                String var231 = "<img=0>";
                                if (!var229.startsWith(var231)) {
                                    String var233 = "<img=1>";
                                    if (!var229.startsWith(var233)) {
                                        break label2272;
                                    }
                                }
                                var229 = var229.substring(7);
                            }
                            field722[var5++] = client.method1379(var229) ? 1 : 0;
                            continue;
                        }
                        if (var448 == 3624) {
                            var5--;
                            int var234 = field722[var5];
                            if (Statics.field175 != null && var234 < Statics.field1354 && Statics.field175[var234].field565.equalsIgnoreCase(Statics.field1767.field45)) {
                                field722[var5++] = 1;
                                continue;
                            }
                            field722[var5++] = 0;
                            continue;
                        }
                        if (var448 == 3625) {
                            if (client.field481 == null) {
                                field728[var6++] = "";
                            } else {
                                String[] var235 = field728;
                                int var236 = var6++;
                                String var237 = client.field481;
                                String var238 = class199.method743(class199.method2547(var237));
                                if (var238 == null) {
                                    var238 = "";
                                }
                                var235[var236] = var238;
                            }
                            continue;
                        }
                    } else if (var448 < 4100) {
                        if (var448 == 4000) {
                            var5 -= 2;
                            int var240 = field722[var5];
                            int var241 = field722[var5 + 1];
                            field722[var5++] = var240 + var241;
                            continue;
                        }
                        if (var448 == 4001) {
                            var5 -= 2;
                            int var242 = field722[var5];
                            int var243 = field722[var5 + 1];
                            field722[var5++] = var242 - var243;
                            continue;
                        }
                        if (var448 == 4002) {
                            var5 -= 2;
                            int var244 = field722[var5];
                            int var245 = field722[var5 + 1];
                            field722[var5++] = var244 * var245;
                            continue;
                        }
                        if (var448 == 4003) {
                            var5 -= 2;
                            int var246 = field722[var5];
                            int var247 = field722[var5 + 1];
                            field722[var5++] = var246 / var247;
                            continue;
                        }
                        if (var448 == 4004) {
                            var5--;
                            int var248 = field722[var5];
                            field722[var5++] = (int) (Math.random() * (double) var248);
                            continue;
                        }
                        if (var448 == 4005) {
                            var5--;
                            int var249 = field722[var5];
                            field722[var5++] = (int) (Math.random() * (double) (var249 + 1));
                            continue;
                        }
                        if (var448 == 4006) {
                            var5 -= 5;
                            int var250 = field722[var5];
                            int var251 = field722[var5 + 1];
                            int var252 = field722[var5 + 2];
                            int var253 = field722[var5 + 3];
                            int var254 = field722[var5 + 4];
                            field722[var5++] = (var251 - var250) * (var254 - var252) / (var253 - var252) + var250;
                            continue;
                        }
                        if (var448 == 4007) {
                            var5 -= 2;
                            int var255 = field722[var5];
                            int var256 = field722[var5 + 1];
                            field722[var5++] = var255 * var256 / 100 + var255;
                            continue;
                        }
                        if (var448 == 4008) {
                            var5 -= 2;
                            int var257 = field722[var5];
                            int var258 = field722[var5 + 1];
                            field722[var5++] = var257 | 0x1 << var258;
                            continue;
                        }
                        if (var448 == 4009) {
                            var5 -= 2;
                            int var259 = field722[var5];
                            int var260 = field722[var5 + 1];
                            field722[var5++] = var259 & -1 - (0x1 << var260);
                            continue;
                        }
                        if (var448 == 4010) {
                            var5 -= 2;
                            int var261 = field722[var5];
                            int var262 = field722[var5 + 1];
                            field722[var5++] = (var261 & 0x1 << var262) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var448 == 4011) {
                            var5 -= 2;
                            int var263 = field722[var5];
                            int var264 = field722[var5 + 1];
                            field722[var5++] = var263 % var264;
                            continue;
                        }
                        if (var448 == 4012) {
                            var5 -= 2;
                            int var265 = field722[var5];
                            int var266 = field722[var5 + 1];
                            if (var265 == 0) {
                                field722[var5++] = 0;
                            } else {
                                field722[var5++] = (int) Math.pow((double) var265, (double) var266);
                            }
                            continue;
                        }
                        if (var448 == 4013) {
                            var5 -= 2;
                            int var267 = field722[var5];
                            int var268 = field722[var5 + 1];
                            if (var267 == 0) {
                                field722[var5++] = 0;
                            } else if (var268 == 0) {
                                field722[var5++] = Integer.MAX_VALUE;
                            } else {
                                field722[var5++] = (int) Math.pow((double) var267, 1.0D / (double) var268);
                            }
                            continue;
                        }
                        if (var448 == 4014) {
                            var5 -= 2;
                            int var269 = field722[var5];
                            int var270 = field722[var5 + 1];
                            field722[var5++] = var269 & var270;
                            continue;
                        }
                        if (var448 == 4015) {
                            var5 -= 2;
                            int var271 = field722[var5];
                            int var272 = field722[var5 + 1];
                            field722[var5++] = var271 | var272;
                            continue;
                        }
                    } else if (var448 < 4200) {
                        if (var448 == 4100) {
                            var6--;
                            String var273 = field728[var6];
                            var5--;
                            int var274 = field722[var5];
                            field728[var6++] = var273 + var274;
                            continue;
                        }
                        if (var448 == 4101) {
                            var6 -= 2;
                            String var275 = field728[var6];
                            String var276 = field728[var6 + 1];
                            field728[var6++] = var275 + var276;
                            continue;
                        }
                        if (var448 == 4102) {
                            var6--;
                            String var277 = field728[var6];
                            var5--;
                            int var278 = field722[var5];
                            String[] var279 = field728;
                            int var280 = var6++;
                            String var282;
                            if (var278 < 0) {
                                var282 = Integer.toString(var278);
                            } else {
                                int var283 = var278;
                                String var284;
                                if (var278 < 0) {
                                    var284 = Integer.toString(var278, 10);
                                } else {
                                    int var285 = 2;
                                    int var286 = var278 / 10;
                                    while (var286 != 0) {
                                        var286 /= 10;
                                        var285++;
                                    }
                                    char[] var287 = new char[var285];
                                    var287[0] = '+';
                                    for (int var288 = var285 - 1; var288 > 0; var288--) {
                                        int var289 = var283;
                                        var283 /= 10;
                                        int var290 = var289 - var283 * 10;
                                        if (var290 >= 10) {
                                            var287[var288] = (char) (var290 + 87);
                                        } else {
                                            var287[var288] = (char) (var290 + 48);
                                        }
                                    }
                                    var284 = new String(var287);
                                }
                                var282 = var284;
                            }
                            var279[var280] = var277 + var282;
                            continue;
                        }
                        if (var448 == 4103) {
                            var6--;
                            String var291 = field728[var6];
                            field728[var6++] = var291.toLowerCase();
                            continue;
                        }
                        if (var448 == 4104) {
                            var5--;
                            int var292 = field722[var5];
                            long var293 = ((long) var292 + 11745L) * 86400000L;
                            field732.setTime(new Date(var293));
                            int var295 = field732.get(5);
                            int var296 = field732.get(2);
                            int var297 = field732.get(1);
                            field728[var6++] = var295 + "-" + field733[var296] + "-" + var297;
                            continue;
                        }
                        if (var448 == 4105) {
                            var6 -= 2;
                            String var298 = field728[var6];
                            String var299 = field728[var6 + 1];
                            if (Statics.field1767.field35 != null && Statics.field1767.field35.field2690) {
                                field728[var6++] = var299;
                                continue;
                            }
                            field728[var6++] = var298;
                            continue;
                        }
                        if (var448 == 4106) {
                            var5--;
                            int var300 = field722[var5];
                            field728[var6++] = Integer.toString(var300);
                            continue;
                        }
                        if (var448 == 4107) {
                            var6 -= 2;
                            int[] var301 = field722;
                            int var302 = var5++;
                            String var303 = field728[var6];
                            String var304 = field728[var6 + 1];
                            int var305 = client.field266;
                            int var306 = var303.length();
                            int var307 = var304.length();
                            int var308 = 0;
                            int var309 = 0;
                            byte var310 = 0;
                            byte var311 = 0;
                            int var312;
                            label2359: while (true) {
                                if (var308 - var310 >= var306 && var309 - var311 >= var307) {
                                    int var323 = Math.min(var306, var307);
                                    for (int var324 = 0; var324 < var323; var324++) {
                                        char var327 = var303.charAt(var324);
                                        char var328 = var304.charAt(var324);
                                        if (var327 != var328 && Character.toUpperCase(var327) != Character.toUpperCase(var328)) {
                                            char var329 = Character.toLowerCase(var327);
                                            char var330 = Character.toLowerCase(var328);
                                            if (var329 != var330) {
                                                var312 = class203.method28(var329, var305) - class203.method28(var330, var305);
                                                break label2359;
                                            }
                                        }
                                    }
                                    int var331 = var306 - var307;
                                    if (var331 == 0) {
                                        for (int var332 = 0; var332 < var323; var332++) {
                                            char var333 = var303.charAt(var332);
                                            char var334 = var304.charAt(var332);
                                            if (var333 != var334) {
                                                var312 = class203.method28(var333, var305) - class203.method28(var334, var305);
                                                break label2359;
                                            }
                                        }
                                        var312 = 0;
                                    } else {
                                        var312 = var331;
                                    }
                                    break;
                                }
                                if (var308 - var310 >= var306) {
                                    var312 = -1;
                                    break;
                                }
                                if (var309 - var311 >= var307) {
                                    var312 = 1;
                                    break;
                                }
                                char var313;
                                if (var310 == 0) {
                                    var313 = var303.charAt(var308++);
                                } else {
                                    var313 = (char) var310;
                                    boolean var314 = false;
                                }
                                char var315;
                                if (var311 == 0) {
                                    var315 = var304.charAt(var309++);
                                } else {
                                    var315 = (char) var311;
                                    boolean var316 = false;
                                }
                                byte var317;
                                if (var313 == 198) {
                                    var317 = 69;
                                } else if (var313 == 230) {
                                    var317 = 101;
                                } else if (var313 == 223) {
                                    var317 = 115;
                                } else if (var313 == 338) {
                                    var317 = 69;
                                } else if (var313 == 339) {
                                    var317 = 101;
                                } else {
                                    var317 = 0;
                                }
                                var310 = var317;
                                byte var318;
                                if (var315 == 198) {
                                    var318 = 69;
                                } else if (var315 == 230) {
                                    var318 = 101;
                                } else if (var315 == 223) {
                                    var318 = 115;
                                } else if (var315 == 338) {
                                    var318 = 69;
                                } else if (var315 == 339) {
                                    var318 = 101;
                                } else {
                                    var318 = 0;
                                }
                                var311 = var318;
                                char var319 = class203.method1736(var313, var305);
                                char var320 = class203.method1736(var315, var305);
                                if (var319 != var320 && Character.toUpperCase(var319) != Character.toUpperCase(var320)) {
                                    char var321 = Character.toLowerCase(var319);
                                    char var322 = Character.toLowerCase(var320);
                                    if (var321 != var322) {
                                        var312 = class203.method28(var321, var305) - class203.method28(var322, var305);
                                        break;
                                    }
                                }
                            }
                            byte var336;
                            if (var312 > 0) {
                                var336 = 1;
                            } else if (var312 < 0) {
                                var336 = -1;
                            } else {
                                var336 = 0;
                            }
                            var301[var302] = var336;
                            continue;
                        }
                        if (var448 == 4108) {
                            var6--;
                            String var337 = field728[var6];
                            var5 -= 2;
                            int var338 = field722[var5];
                            int var339 = field722[var5 + 1];
                            byte[] var340 = Statics.field945.method2734(var339, 0);
                            class194 var341 = new class194(var340);
                            field722[var5++] = var341.method3333(var337, var338);
                            continue;
                        }
                        if (var448 == 4109) {
                            var6--;
                            String var342 = field728[var6];
                            var5 -= 2;
                            int var343 = field722[var5];
                            int var344 = field722[var5 + 1];
                            byte[] var345 = Statics.field945.method2734(var344, 0);
                            class194 var346 = new class194(var345);
                            field722[var5++] = var346.method3410(var342, var343);
                            continue;
                        }
                        if (var448 == 4110) {
                            var6 -= 2;
                            String var347 = field728[var6];
                            String var348 = field728[var6 + 1];
                            var5--;
                            if (field722[var5] == 1) {
                                field728[var6++] = var347;
                            } else {
                                field728[var6++] = var348;
                            }
                            continue;
                        }
                        if (var448 == 4111) {
                            var6--;
                            String var349 = field728[var6];
                            field728[var6++] = class193.method3334(var349);
                            continue;
                        }
                        if (var448 == 4112) {
                            var6--;
                            String var350 = field728[var6];
                            var5--;
                            int var351 = field722[var5];
                            field728[var6++] = var350 + (char) var351;
                            continue;
                        }
                        if (var448 == 4113) {
                            var5--;
                            int var352 = field722[var5];
                            int[] var353 = field722;
                            int var354 = var5++;
                            char var355 = (char) var352;
                            boolean var356;
                            if (var355 >= ' ' && var355 <= '~') {
                                var356 = true;
                            } else if (var355 >= 160 && var355 <= 255) {
                                var356 = true;
                            } else if (var355 == 8364 || var355 == 338 || var355 == 8212 || var355 == 339 || var355 == 376) {
                                var356 = true;
                            } else {
                                var356 = false;
                            }
                            var353[var354] = var356 ? 1 : 0;
                            continue;
                        }
                        if (var448 == 4114) {
                            var5--;
                            int var357 = field722[var5];
                            int[] var358 = field722;
                            int var359 = var5++;
                            char var360 = (char) var357;
                            boolean var361 = var360 >= '0' && var360 <= '9' || var360 >= 'A' && var360 <= 'Z' || var360 >= 'a' && var360 <= 'z';
                            var358[var359] = var361 ? 1 : 0;
                            continue;
                        }
                        if (var448 == 4115) {
                            var5--;
                            int var362 = field722[var5];
                            int[] var363 = field722;
                            int var364 = var5++;
                            char var365 = (char) var362;
                            boolean var366 = var365 >= 'A' && var365 <= 'Z' || var365 >= 'a' && var365 <= 'z';
                            var363[var364] = var366 ? 1 : 0;
                            continue;
                        }
                        if (var448 == 4116) {
                            var5--;
                            int var367 = field722[var5];
                            int[] var368 = field722;
                            int var369 = var5++;
                            char var370 = (char) var367;
                            boolean var371 = var370 >= '0' && var370 <= '9';
                            var368[var369] = var371 ? 1 : 0;
                            continue;
                        }
                        if (var448 == 4117) {
                            var6--;
                            String var372 = field728[var6];
                            if (var372 == null) {
                                field722[var5++] = 0;
                            } else {
                                field722[var5++] = var372.length();
                            }
                            continue;
                        }
                        if (var448 == 4118) {
                            var6--;
                            String var373 = field728[var6];
                            var5 -= 2;
                            int var374 = field722[var5];
                            int var375 = field722[var5 + 1];
                            field728[var6++] = var373.substring(var374, var375);
                            continue;
                        }
                        if (var448 == 4119) {
                            var6--;
                            String var376 = field728[var6];
                            StringBuilder var377 = new StringBuilder(var376.length());
                            boolean var378 = false;
                            for (int var379 = 0; var379 < var376.length(); var379++) {
                                char var380 = var376.charAt(var379);
                                if (var380 == '<') {
                                    var378 = true;
                                } else if (var380 == '>') {
                                    var378 = false;
                                } else if (!var378) {
                                    var377.append(var380);
                                }
                            }
                            field728[var6++] = var377.toString();
                            continue;
                        }
                        if (var448 == 4120) {
                            var6--;
                            String var381 = field728[var6];
                            var5--;
                            int var382 = field722[var5];
                            field722[var5++] = var381.indexOf(var382);
                            continue;
                        }
                        if (var448 == 4121) {
                            var6 -= 2;
                            String var383 = field728[var6];
                            String var384 = field728[var6 + 1];
                            var5--;
                            int var385 = field722[var5];
                            field722[var5++] = var383.indexOf(var384, var385);
                            continue;
                        }
                    } else if (var448 < 4300) {
                        if (var448 == 4200) {
                            var5--;
                            int var386 = field722[var5];
                            field728[var6++] = Statics.method2406(var386).field1026;
                            continue;
                        }
                        if (var448 == 4201) {
                            var5 -= 2;
                            int var387 = field722[var5];
                            int var388 = field722[var5 + 1];
                            class45 var389 = Statics.method2406(var387);
                            if (var388 >= 1 && var388 <= 5 && var389.field1028[var388 - 1] != null) {
                                field728[var6++] = var389.field1028[var388 - 1];
                                continue;
                            }
                            field728[var6++] = "";
                            continue;
                        }
                        if (var448 == 4202) {
                            var5 -= 2;
                            int var390 = field722[var5];
                            int var391 = field722[var5 + 1];
                            class45 var392 = Statics.method2406(var390);
                            if (var391 >= 1 && var391 <= 5 && var392.field1019[var391 - 1] != null) {
                                field728[var6++] = var392.field1019[var391 - 1];
                                continue;
                            }
                            field728[var6++] = "";
                            continue;
                        }
                        if (var448 == 4203) {
                            var5--;
                            int var393 = field722[var5];
                            field722[var5++] = Statics.method2406(var393).field1044;
                            continue;
                        }
                        if (var448 == 4204) {
                            var5--;
                            int var394 = field722[var5];
                            field722[var5++] = Statics.method2406(var394).field1025 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var448 == 4205) {
                            var5--;
                            int var395 = field722[var5];
                            class45 var396 = Statics.method2406(var395);
                            if (var396.field1045 == -1 && var396.field1006 >= 0) {
                                field722[var5++] = var396.field1006;
                                continue;
                            }
                            field722[var5++] = var395;
                            continue;
                        }
                        if (var448 == 4206) {
                            var5--;
                            int var397 = field722[var5];
                            class45 var398 = Statics.method2406(var397);
                            if (var398.field1045 >= 0 && var398.field1006 >= 0) {
                                field722[var5++] = var398.field1006;
                                continue;
                            }
                            field722[var5++] = var397;
                            continue;
                        }
                        if (var448 == 4207) {
                            var5--;
                            int var399 = field722[var5];
                            field722[var5++] = Statics.method2406(var399).field1027 ? 1 : 0;
                            continue;
                        }
                    } else if (var448 < 5100) {
                        if (var448 == 5000) {
                            field722[var5++] = client.field288;
                            continue;
                        }
                        if (var448 == 5001) {
                            var5 -= 3;
                            client.field288 = field722[var5];
                            Statics.field1284 = class117.method2511(field722[var5 + 1]);
                            if (Statics.field1284 == null) {
                                Statics.field1284 = class117.field1909;
                            }
                            client.field471 = field722[var5 + 2];
                            client.field298.method2335(82);
                            client.field298.method2079(client.field288);
                            client.field298.method2079(Statics.field1284.field1911);
                            client.field298.method2079(client.field471);
                            continue;
                        }
                        if (var448 == 5002) {
                            var6--;
                            String var400 = field728[var6];
                            var5 -= 2;
                            int var401 = field722[var5];
                            int var402 = field722[var5 + 1];
                            client.field298.method2335(53);
                            class110 var403 = client.field298;
                            int var404 = var400.length() + 1;
                            var403.method2079(var404 + 2);
                            client.field298.method2193(var400);
                            client.field298.method2079(var401 - 1);
                            client.field298.method2079(var402);
                            continue;
                        }
                        if (var448 == 5003) {
                            var5 -= 2;
                            int var405 = field722[var5];
                            int var406 = field722[var5 + 1];
                            class24 var407 = (class24) class10.field150.get(var405);
                            class31 var408 = var407.method498(var406);
                            if (var408 == null) {
                                field722[var5++] = -1;
                                field722[var5++] = 0;
                                field728[var6++] = "";
                                field728[var6++] = "";
                                field728[var6++] = "";
                            } else {
                                field722[var5++] = var408.field716;
                                field722[var5++] = var408.field712;
                                field728[var6++] = var408.field717 == null ? "" : var408.field717;
                                field728[var6++] = var408.field715 == null ? "" : var408.field715;
                                field728[var6++] = var408.field714 == null ? "" : var408.field714;
                            }
                            continue;
                        }
                        if (var448 == 5004) {
                            var5--;
                            int var410 = field722[var5];
                            class31 var411 = Statics.method2856(var410);
                            if (var411 == null) {
                                field722[var5++] = -1;
                                field722[var5++] = 0;
                                field728[var6++] = "";
                                field728[var6++] = "";
                                field728[var6++] = "";
                            } else {
                                field722[var5++] = var411.field713;
                                field722[var5++] = var411.field712;
                                field728[var6++] = var411.field717 == null ? "" : var411.field717;
                                field728[var6++] = var411.field715 == null ? "" : var411.field715;
                                field728[var6++] = var411.field714 == null ? "" : var411.field714;
                            }
                            continue;
                        }
                        if (var448 == 5005) {
                            if (Statics.field1284 == null) {
                                field722[var5++] = -1;
                            } else {
                                field722[var5++] = Statics.field1284.field1911;
                            }
                            continue;
                        }
                        if (var448 == 5008) {
                            var6--;
                            String var412 = field728[var6];
                            var5--;
                            int var413 = field722[var5];
                            String var414 = var412.toLowerCase();
                            byte var415 = 0;
                            if (var414.startsWith(class143.field2346)) {
                                var415 = 0;
                                var412 = var412.substring(class143.field2346.length());
                            } else if (var414.startsWith(class143.field2348)) {
                                var415 = 1;
                                var412 = var412.substring(class143.field2348.length());
                            } else if (var414.startsWith(class143.field2350)) {
                                var415 = 2;
                                var412 = var412.substring(class143.field2350.length());
                            } else if (var414.startsWith(class143.field2352)) {
                                var415 = 3;
                                var412 = var412.substring(class143.field2352.length());
                            } else if (var414.startsWith(class143.field2376)) {
                                var415 = 4;
                                var412 = var412.substring(class143.field2376.length());
                            } else if (var414.startsWith(class143.field2356)) {
                                var415 = 5;
                                var412 = var412.substring(class143.field2356.length());
                            } else if (var414.startsWith(class143.field2358)) {
                                var415 = 6;
                                var412 = var412.substring(class143.field2358.length());
                            } else if (var414.startsWith(class143.field2369)) {
                                var415 = 7;
                                var412 = var412.substring(class143.field2369.length());
                            } else if (var414.startsWith(class143.field2362)) {
                                var415 = 8;
                                var412 = var412.substring(class143.field2362.length());
                            } else if (var414.startsWith(class143.field2354)) {
                                var415 = 9;
                                var412 = var412.substring(class143.field2354.length());
                            } else if (var414.startsWith(class143.field2321)) {
                                var415 = 10;
                                var412 = var412.substring(class143.field2321.length());
                            } else if (var414.startsWith(class143.field2368)) {
                                var415 = 11;
                                var412 = var412.substring(class143.field2368.length());
                            } else if (client.field266 != 0) {
                                if (var414.startsWith(class143.field2347)) {
                                    var415 = 0;
                                    var412 = var412.substring(class143.field2347.length());
                                } else if (var414.startsWith(class143.field2305)) {
                                    var415 = 1;
                                    var412 = var412.substring(class143.field2305.length());
                                } else if (var414.startsWith(class143.field2351)) {
                                    var415 = 2;
                                    var412 = var412.substring(class143.field2351.length());
                                } else if (var414.startsWith(class143.field2228)) {
                                    var415 = 3;
                                    var412 = var412.substring(class143.field2228.length());
                                } else if (var414.startsWith(class143.field2299)) {
                                    var415 = 4;
                                    var412 = var412.substring(class143.field2299.length());
                                } else if (var414.startsWith(class143.field2284)) {
                                    var415 = 5;
                                    var412 = var412.substring(class143.field2284.length());
                                } else if (var414.startsWith(class143.field2359)) {
                                    var415 = 6;
                                    var412 = var412.substring(class143.field2359.length());
                                } else if (var414.startsWith(class143.field2361)) {
                                    var415 = 7;
                                    var412 = var412.substring(class143.field2361.length());
                                } else if (var414.startsWith(class143.field2363)) {
                                    var415 = 8;
                                    var412 = var412.substring(class143.field2363.length());
                                } else if (var414.startsWith(class143.field2365)) {
                                    var415 = 9;
                                    var412 = var412.substring(class143.field2365.length());
                                } else if (var414.startsWith(class143.field2367)) {
                                    var415 = 10;
                                    var412 = var412.substring(class143.field2367.length());
                                } else if (var414.startsWith(class143.field2293)) {
                                    var415 = 11;
                                    var412 = var412.substring(class143.field2293.length());
                                }
                            }
                            String var416 = var412.toLowerCase();
                            byte var417 = 0;
                            if (var416.startsWith(class143.field2401)) {
                                var417 = 1;
                                var412 = var412.substring(class143.field2401.length());
                            } else if (var416.startsWith(class143.field2372)) {
                                var417 = 2;
                                var412 = var412.substring(class143.field2372.length());
                            } else if (var416.startsWith(class143.field2374)) {
                                var417 = 3;
                                var412 = var412.substring(class143.field2374.length());
                            } else if (var416.startsWith(class143.field2330)) {
                                var417 = 4;
                                var412 = var412.substring(class143.field2330.length());
                            } else if (var416.startsWith(class143.field2378)) {
                                var417 = 5;
                                var412 = var412.substring(class143.field2378.length());
                            } else if (client.field266 != 0) {
                                if (var416.startsWith(class143.field2371)) {
                                    var417 = 1;
                                    var412 = var412.substring(class143.field2371.length());
                                } else if (var416.startsWith(class143.field2373)) {
                                    var417 = 2;
                                    var412 = var412.substring(class143.field2373.length());
                                } else if (var416.startsWith(class143.field2375)) {
                                    var417 = 3;
                                    var412 = var412.substring(class143.field2375.length());
                                } else if (var416.startsWith(class143.field2218)) {
                                    var417 = 4;
                                    var412 = var412.substring(class143.field2218.length());
                                } else if (var416.startsWith(class143.field2379)) {
                                    var417 = 5;
                                    var412 = var412.substring(class143.field2379.length());
                                }
                            }
                            client.field298.method2335(24);
                            client.field298.method2079(0);
                            int var418 = client.field298.field1844;
                            client.field298.method2079(var413);
                            client.field298.method2079(var415);
                            client.field298.method2079(var417);
                            class110 var419 = client.field298;
                            int var420 = var419.field1844;
                            byte[] var421 = class202.method2384(var412);
                            var419.method2090(var421.length);
                            var419.field1844 += Statics.field2911.method2036(var421, 0, var421.length, var419.field1843, var419.field1844);
                            client.field298.method2089(client.field298.field1844 - var418);
                            continue;
                        }
                        if (var448 == 5009) {
                            var6 -= 2;
                            String var422 = field728[var6];
                            String var423 = field728[var6 + 1];
                            client.field298.method2335(111);
                            client.field298.method2100(0);
                            int var424 = client.field298.field1844;
                            client.field298.method2193(var422);
                            class110 var425 = client.field298;
                            int var426 = var425.field1844;
                            byte[] var427 = class202.method2384(var423);
                            var425.method2090(var427.length);
                            var425.field1844 += Statics.field2911.method2036(var427, 0, var427.length, var425.field1843, var425.field1844);
                            client.field298.method2088(client.field298.field1844 - var424);
                            continue;
                        }
                        if (var448 == 5015) {
                            String var428;
                            if (Statics.field1767 == null || Statics.field1767.field45 == null) {
                                var428 = "";
                            } else {
                                var428 = Statics.field1767.field45;
                            }
                            field728[var6++] = var428;
                            continue;
                        }
                        if (var448 == 5016) {
                            field722[var5++] = client.field471;
                            continue;
                        }
                        if (var448 == 5017) {
                            var5--;
                            int var429 = field722[var5];
                            int[] var430 = field722;
                            int var431 = var5++;
                            class24 var432 = (class24) class10.field150.get(var429);
                            int var433;
                            if (var432 == null) {
                                var433 = 0;
                            } else {
                                var433 = var432.method492();
                            }
                            var430[var431] = var433;
                            continue;
                        }
                        if (var448 == 5018) {
                            var5--;
                            int var434 = field722[var5];
                            field722[var5++] = class10.method2359(var434);
                            continue;
                        }
                        if (var448 == 5019) {
                            var5--;
                            int var435 = field722[var5];
                            int[] var436 = field722;
                            int var437 = var5++;
                            class31 var438 = (class31) class10.field151.method3189((long) var435);
                            int var439;
                            if (var438 == null) {
                                var439 = -1;
                            } else if (class10.field152.field2871 == var438.field2875) {
                                var439 = -1;
                            } else {
                                var439 = ((class31) var438.field2875).field716;
                            }
                            var436[var437] = var439;
                            continue;
                        }
                        if (var448 == 5020) {
                            var6--;
                            String var440 = field728[var6];
                            client.method565(var440);
                            continue;
                        }
                        if (var448 == 5021) {
                            var6--;
                            client.field472 = field728[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var448 == 5022) {
                            field728[var6++] = client.field472;
                            continue;
                        }
                    }
                }
                if (var448 >= 5600 || var448 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var441 = field722[var5];
                int var442 = field722[var5 + 1];
                if (!client.field501) {
                    client.field339 = var441;
                    client.field503 = var442;
                }
            }
        } catch (Exception var447) {
            StringBuilder var444 = new StringBuilder(30);
            var444.append("").append(var4.field2885).append(" ");
            for (int var445 = field724 - 1; var445 >= 0; var445--) {
                var444.append("").append(field730[var445].field199.field2885).append(" ");
            }
            var444.append("").append(var10);
            class135.method33(var444.toString(), var447);
        }
    }

    @ObfuscatedName("cn.k(II)V")
    public static void method1740(int arg0) {
        if (arg0 == -1 || !class153.method2498(arg0)) {
            return;
        }
        class153[] var1 = Statics.field2556[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3.field2624 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field5 = var3.field2624;
                method35(var4, 2000000);
            }
        }
    }
}
