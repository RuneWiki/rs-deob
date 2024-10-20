package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("co")
public class class84 {

    @ObfuscatedName("co.w")
    public static int[] field1328 = new int[5];

    @ObfuscatedName("co.z")
    public static int[][] field1335 = new int[5][5000];

    @ObfuscatedName("co.j")
    public static int[] field1330 = new int[1000];

    @ObfuscatedName("co.f")
    public static String[] field1332 = new String[1000];

    @ObfuscatedName("co.o")
    public static int field1333 = 0;

    @ObfuscatedName("co.q")
    public static class63[] field1334 = new class63[50];

    @ObfuscatedName("co.g")
    public static Calendar field1329 = Calendar.getInstance();

    @ObfuscatedName("co.v")
    public static final String[] field1336 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("co.k")
    public static int field1337 = 0;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bb.p(Lbt;I)V")
    public static void method1349(class70 arg0) {
        method616(arg0, 200000);
    }

    @ObfuscatedName("ai.m(Lbt;II)V")
    public static void method616(class70 arg0, int arg1) {
        Object[] var2 = arg0.field822;
        class220 var3 = arg0.field832;
        boolean var4 = class220.field2797 == var3 || class220.field2798 == var3 || class220.field2799 == var3 || class220.field2800 == var3 || class220.field2801 == var3 || class220.field2804 == var3 || class220.field2803 == var3 || class220.field2807 == var3;
        class100 var27;
        if (var4) {
            Statics.field2424 = (class48) var2[0];
            class243 var5 = Statics.field3305[Statics.field2424.field613];
            class220 var6 = arg0.field832;
            int var7 = var5.field3302;
            int var8 = var5.field3307;
            int var9 = class225.method131(var7, var6);
            class100 var10 = (class100) class100.field1534.method3182((long) (var9 << 16));
            class100 var11;
            if (var10 == null) {
                String var12 = String.valueOf(var9);
                int var13 = Statics.field833.method3764(var12);
                if (var13 == -1) {
                    var11 = null;
                } else {
                    label516: {
                        byte[] var14 = Statics.field833.method3710(var13);
                        if (var14 != null) {
                            if (var14.length <= 1) {
                                var11 = null;
                                break label516;
                            }
                            class100 var15 = class100.method618(var14);
                            if (var15 != null) {
                                class100.field1534.method3179(var15, (long) (var9 << 16));
                                var11 = var15;
                                break label516;
                            }
                        }
                        var11 = null;
                    }
                }
            } else {
                var11 = var10;
            }
            class100 var17;
            if (var11 == null) {
                int var18 = (var8 + 40000 << 8) + var6.field2805;
                class100 var20 = (class100) class100.field1534.method3182((long) (var18 << 16));
                class100 var21;
                if (var20 == null) {
                    String var22 = String.valueOf(var18);
                    int var23 = Statics.field833.method3764(var22);
                    if (var23 == -1) {
                        var21 = null;
                    } else {
                        label450: {
                            byte[] var24 = Statics.field833.method3710(var23);
                            if (var24 != null) {
                                if (var24.length <= 1) {
                                    var21 = null;
                                    break label450;
                                }
                                class100 var25 = class100.method618(var24);
                                if (var25 != null) {
                                    class100.field1534.method3179(var25, (long) (var18 << 16));
                                    var21 = var25;
                                    break label450;
                                }
                            }
                            var21 = null;
                        }
                    }
                } else {
                    var21 = var20;
                }
                if (var21 == null) {
                    var17 = null;
                } else {
                    var17 = var21;
                }
            } else {
                var17 = var11;
            }
            var27 = var17;
        } else {
            int var28 = (Integer) var2[0];
            var27 = class100.method575(var28);
        }
        if (var27 == null) {
            return;
        }
        Statics.field1331 = 0;
        Statics.field383 = 0;
        int var29 = -1;
        int[] var30 = var27.field1528;
        int[] var31 = var27.field1529;
        byte var32 = -1;
        field1333 = 0;
        try {
            Statics.field1342 = new int[var27.field1531];
            int var33 = 0;
            Statics.field1326 = new String[var27.field1532];
            int var34 = 0;
            for (int var35 = 1; var35 < var2.length; var35++) {
                if (var2[var35] instanceof Integer) {
                    int var36 = (Integer) var2[var35];
                    if (var36 == -2147483647) {
                        var36 = arg0.field824;
                    }
                    if (var36 == -2147483646) {
                        var36 = arg0.field836;
                    }
                    if (var36 == -2147483645) {
                        var36 = arg0.field823 == null ? -1 : arg0.field823.field2756;
                    }
                    if (var36 == -2147483644) {
                        var36 = arg0.field826;
                    }
                    if (var36 == -2147483643) {
                        var36 = arg0.field823 == null ? -1 : arg0.field823.field2672;
                    }
                    if (var36 == -2147483642) {
                        var36 = arg0.field830 == null ? -1 : arg0.field830.field2756;
                    }
                    if (var36 == -2147483641) {
                        var36 = arg0.field830 == null ? -1 : arg0.field830.field2672;
                    }
                    if (var36 == -2147483640) {
                        var36 = arg0.field828;
                    }
                    if (var36 == -2147483639) {
                        var36 = arg0.field829;
                    }
                    Statics.field1342[var33++] = var36;
                } else if (var2[var35] instanceof String) {
                    String var37 = (String) var2[var35];
                    if (var37.equals("event_opbase")) {
                        var37 = arg0.field834;
                    }
                    Statics.field1326[var34++] = var37;
                }
            }
            int var38 = 0;
            field1337 = arg0.field831;
            while (true) {
                while (true) {
                    while (true) {
                        while (true) {
                            while (true) {
                                while (true) {
                                    while (true) {
                                        while (true) {
                                            while (true) {
                                                while (true) {
                                                    while (true) {
                                                        while (true) {
                                                            while (true) {
                                                                while (true) {
                                                                    while (true) {
                                                                        while (true) {
                                                                            while (true) {
                                                                                while (true) {
                                                                                    while (true) {
                                                                                        while (true) {
                                                                                            while (true) {
                                                                                                while (true) {
                                                                                                    while (true) {
                                                                                                        while (true) {
                                                                                                            while (true) {
                                                                                                                label271: while (true) {
                                                                                                                    var38++;
                                                                                                                    if (var38 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var29++;
                                                                                                                    int var82 = var30[var29];
                                                                                                                    if (var82 >= 100) {
                                                                                                                        boolean var76;
                                                                                                                        if (var27.field1529[var29] == 1) {
                                                                                                                            var76 = true;
                                                                                                                        } else {
                                                                                                                            var76 = false;
                                                                                                                        }
                                                                                                                        int var77 = method1516(var82, var27, var76);
                                                                                                                        switch(var77) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var82 == 0) {
                                                                                                                        field1330[++Statics.field1331 - 1] = var31[var29];
                                                                                                                    } else if (var82 == 1) {
                                                                                                                        int var39 = var31[var29];
                                                                                                                        field1330[++Statics.field1331 - 1] = class212.field2616[var39];
                                                                                                                    } else if (var82 == 2) {
                                                                                                                        int var40 = var31[var29];
                                                                                                                        class212.field2616[var40] = field1330[--Statics.field1331];
                                                                                                                        client.method456(var40);
                                                                                                                    } else if (var82 == 3) {
                                                                                                                        field1332[++Statics.field383 - 1] = var27.field1530[var29];
                                                                                                                    } else if (var82 == 6) {
                                                                                                                        var29 += var31[var29];
                                                                                                                    } else if (var82 == 7) {
                                                                                                                        Statics.field1331 -= 2;
                                                                                                                        if (field1330[Statics.field1331] != field1330[Statics.field1331 + 1]) {
                                                                                                                            var29 += var31[var29];
                                                                                                                        }
                                                                                                                    } else if (var82 == 8) {
                                                                                                                        Statics.field1331 -= 2;
                                                                                                                        if (field1330[Statics.field1331] == field1330[Statics.field1331 + 1]) {
                                                                                                                            var29 += var31[var29];
                                                                                                                        }
                                                                                                                    } else if (var82 == 9) {
                                                                                                                        Statics.field1331 -= 2;
                                                                                                                        if (field1330[Statics.field1331] < field1330[Statics.field1331 + 1]) {
                                                                                                                            var29 += var31[var29];
                                                                                                                        }
                                                                                                                    } else if (var82 == 10) {
                                                                                                                        Statics.field1331 -= 2;
                                                                                                                        if (field1330[Statics.field1331] > field1330[Statics.field1331 + 1]) {
                                                                                                                            var29 += var31[var29];
                                                                                                                        }
                                                                                                                    } else if (var82 == 21) {
                                                                                                                        if (field1333 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var41 = field1334[--field1333];
                                                                                                                        var27 = var41.field770;
                                                                                                                        var30 = var27.field1528;
                                                                                                                        var31 = var27.field1529;
                                                                                                                        var29 = var41.field765;
                                                                                                                        Statics.field1342 = var41.field768;
                                                                                                                        Statics.field1326 = var41.field766;
                                                                                                                    } else if (var82 == 25) {
                                                                                                                        int var42 = var31[var29];
                                                                                                                        field1330[++Statics.field1331 - 1] = class212.method659(var42);
                                                                                                                    } else if (var82 == 27) {
                                                                                                                        int var43 = var31[var29];
                                                                                                                        int var44 = field1330[--Statics.field1331];
                                                                                                                        class251 var45 = (class251) class251.field3390.method3182((long) var43);
                                                                                                                        class251 var46;
                                                                                                                        if (var45 == null) {
                                                                                                                            byte[] var47 = Statics.field3391.method3720(14, var43);
                                                                                                                            class251 var48 = new class251();
                                                                                                                            if (var47 != null) {
                                                                                                                                var48.method3993(new class174(var47));
                                                                                                                            }
                                                                                                                            class251.field3390.method3179(var48, (long) var43);
                                                                                                                            var46 = var48;
                                                                                                                        } else {
                                                                                                                            var46 = var45;
                                                                                                                        }
                                                                                                                        int var50 = var46.field3394;
                                                                                                                        int var51 = var46.field3389;
                                                                                                                        int var52 = var46.field3393;
                                                                                                                        int var53 = class212.field2615[var52 - var51];
                                                                                                                        if (var44 < 0 || var44 > var53) {
                                                                                                                            var44 = 0;
                                                                                                                        }
                                                                                                                        int var54 = var53 << var51;
                                                                                                                        class212.field2616[var50] = class212.field2616[var50] & ~var54 | var44 << var51 & var54;
                                                                                                                    } else if (var82 == 31) {
                                                                                                                        Statics.field1331 -= 2;
                                                                                                                        if (field1330[Statics.field1331] <= field1330[Statics.field1331 + 1]) {
                                                                                                                            var29 += var31[var29];
                                                                                                                        }
                                                                                                                    } else if (var82 == 32) {
                                                                                                                        Statics.field1331 -= 2;
                                                                                                                        if (field1330[Statics.field1331] >= field1330[Statics.field1331 + 1]) {
                                                                                                                            var29 += var31[var29];
                                                                                                                        }
                                                                                                                    } else if (var82 == 33) {
                                                                                                                        field1330[++Statics.field1331 - 1] = Statics.field1342[var31[var29]];
                                                                                                                    } else if (var82 == 34) {
                                                                                                                        Statics.field1342[var31[var29]] = field1330[--Statics.field1331];
                                                                                                                    } else if (var82 == 35) {
                                                                                                                        field1332[++Statics.field383 - 1] = Statics.field1326[var31[var29]];
                                                                                                                    } else if (var82 == 36) {
                                                                                                                        Statics.field1326[var31[var29]] = field1332[--Statics.field383];
                                                                                                                    } else if (var82 == 37) {
                                                                                                                        int var55 = var31[var29];
                                                                                                                        Statics.field383 -= var55;
                                                                                                                        String var56 = class271.method3336(field1332, Statics.field383, var55);
                                                                                                                        field1332[++Statics.field383 - 1] = var56;
                                                                                                                    } else if (var82 == 38) {
                                                                                                                        Statics.field1331--;
                                                                                                                    } else if (var82 == 39) {
                                                                                                                        Statics.field383--;
                                                                                                                    } else if (var82 == 40) {
                                                                                                                        int var57 = var31[var29];
                                                                                                                        class100 var58 = class100.method575(var57);
                                                                                                                        int[] var59 = new int[var58.field1531];
                                                                                                                        String[] var60 = new String[var58.field1532];
                                                                                                                        for (int var61 = 0; var61 < var58.field1538; var61++) {
                                                                                                                            var59[var61] = field1330[Statics.field1331 - var58.field1538 + var61];
                                                                                                                        }
                                                                                                                        for (int var62 = 0; var62 < var58.field1533; var62++) {
                                                                                                                            var60[var62] = field1332[Statics.field383 - var58.field1533 + var62];
                                                                                                                        }
                                                                                                                        Statics.field1331 -= var58.field1538;
                                                                                                                        Statics.field383 -= var58.field1533;
                                                                                                                        class63 var63 = new class63();
                                                                                                                        var63.field770 = var27;
                                                                                                                        var63.field765 = var29;
                                                                                                                        var63.field768 = Statics.field1342;
                                                                                                                        var63.field766 = Statics.field1326;
                                                                                                                        field1334[++field1333 - 1] = var63;
                                                                                                                        var27 = var58;
                                                                                                                        var30 = var58.field1528;
                                                                                                                        var31 = var58.field1529;
                                                                                                                        var29 = -1;
                                                                                                                        Statics.field1342 = var59;
                                                                                                                        Statics.field1326 = var60;
                                                                                                                    } else if (var82 == 42) {
                                                                                                                        field1330[++Statics.field1331 - 1] = Statics.field804.method1609(var31[var29]);
                                                                                                                    } else if (var82 == 43) {
                                                                                                                        Statics.field804.method1615(var31[var29], field1330[--Statics.field1331]);
                                                                                                                    } else if (var82 == 44) {
                                                                                                                        int var64 = var31[var29] >> 16;
                                                                                                                        int var65 = var31[var29] & 0xFFFF;
                                                                                                                        int var66 = field1330[--Statics.field1331];
                                                                                                                        if (var66 >= 0 && var66 <= 5000) {
                                                                                                                            field1328[var64] = var66;
                                                                                                                            byte var67 = -1;
                                                                                                                            if (var65 == 105) {
                                                                                                                                var67 = 0;
                                                                                                                            }
                                                                                                                            int var68 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var68 >= var66) {
                                                                                                                                    continue label271;
                                                                                                                                }
                                                                                                                                field1335[var64][var68] = var67;
                                                                                                                                var68++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var82 == 45) {
                                                                                                                        int var69 = var31[var29];
                                                                                                                        int var70 = field1330[--Statics.field1331];
                                                                                                                        if (var70 < 0 || var70 >= field1328[var69]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1330[++Statics.field1331 - 1] = field1335[var69][var70];
                                                                                                                    } else if (var82 == 46) {
                                                                                                                        int var71 = var31[var29];
                                                                                                                        Statics.field1331 -= 2;
                                                                                                                        int var72 = field1330[Statics.field1331];
                                                                                                                        if (var72 < 0 || var72 >= field1328[var71]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1335[var71][var72] = field1330[Statics.field1331 + 1];
                                                                                                                    } else if (var82 == 47) {
                                                                                                                        String var73 = Statics.field804.method1618(var31[var29]);
                                                                                                                        if (var73 == null) {
                                                                                                                            var73 = "null";
                                                                                                                        }
                                                                                                                        field1332[++Statics.field383 - 1] = var73;
                                                                                                                    } else if (var82 == 48) {
                                                                                                                        Statics.field804.method1590(var31[var29], field1332[--Statics.field383]);
                                                                                                                    } else if (var82 == 60) {
                                                                                                                        class187 var74 = var27.field1535[var31[var29]];
                                                                                                                        class199 var75 = (class199) var74.method3154((long) field1330[--Statics.field1331]);
                                                                                                                        if (var75 != null) {
                                                                                                                            var29 += var75.field2497;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        throw new IllegalStateException();
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception var81) {
            StringBuilder var79 = new StringBuilder(30);
            var79.append("").append(var27.field2483).append(" ");
            for (int var80 = field1333 - 1; var80 >= 0; var80--) {
                var79.append("").append(field1334[var80].field770.field2483).append(" ");
            }
            var79.append("").append(var32);
            class153.method40(var79.toString(), var81);
        }
    }

    @ObfuscatedName("cl.e(ILcq;ZB)I")
    public static int method1516(int arg0, class100 arg1, boolean arg2) {
        if (arg0 < 1000) {
            byte var10;
            if (arg0 == 100) {
                Statics.field1331 -= 3;
                int var3 = field1330[Statics.field1331];
                int var4 = field1330[Statics.field1331 + 1];
                int var5 = field1330[Statics.field1331 + 2];
                if (var4 == 0) {
                    throw new RuntimeException();
                }
                class217 var6 = class217.method3680(var3);
                if (var6.field2676 == null) {
                    var6.field2676 = new class217[var5 + 1];
                }
                if (var6.field2676.length <= var5) {
                    class217[] var7 = new class217[var5 + 1];
                    for (int var8 = 0; var8 < var6.field2676.length; var8++) {
                        var7[var8] = var6.field2676[var8];
                    }
                    var6.field2676 = var7;
                }
                if (var5 > 0 && var6.field2676[var5 - 1] == null) {
                    throw new RuntimeException("" + (var5 - 1));
                }
                class217 var9 = new class217();
                var9.field2657 = var4;
                var9.field2674 = var9.field2756 = var6.field2756;
                var9.field2672 = var5;
                var9.field2656 = true;
                var6.field2676[var5] = var9;
                if (arg2) {
                    Statics.field583 = var9;
                } else {
                    Statics.field458 = var9;
                }
                Statics.method951(var6);
                var10 = 1;
            } else if (arg0 == 101) {
                class217 var11 = arg2 ? Statics.field583 : Statics.field458;
                class217 var12 = class217.method3680(var11.field2756);
                var12.field2676[var11.field2672] = null;
                Statics.method951(var12);
                var10 = 1;
            } else if (arg0 == 102) {
                class217 var13 = class217.method3680(field1330[--Statics.field1331]);
                var13.field2676 = null;
                Statics.method951(var13);
                var10 = 1;
            } else if (arg0 == 200) {
                Statics.field1331 -= 2;
                int var14 = field1330[Statics.field1331];
                int var15 = field1330[Statics.field1331 + 1];
                class217 var16 = class217.method2792(var14, var15);
                if (var16 == null || var15 == -1) {
                    field1330[++Statics.field1331 - 1] = 0;
                } else {
                    field1330[++Statics.field1331 - 1] = 1;
                    if (arg2) {
                        Statics.field583 = var16;
                    } else {
                        Statics.field458 = var16;
                    }
                }
                var10 = 1;
            } else if (arg0 == 201) {
                class217 var17 = class217.method3680(field1330[--Statics.field1331]);
                if (var17 == null) {
                    field1330[++Statics.field1331 - 1] = 0;
                } else {
                    field1330[++Statics.field1331 - 1] = 1;
                    if (arg2) {
                        Statics.field583 = var17;
                    } else {
                        Statics.field458 = var17;
                    }
                }
                var10 = 1;
            } else {
                var10 = 2;
            }
            return var10;
        } else if (arg0 < 1100) {
            return method81(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method978(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method2733(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method323(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method2205(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            class217 var21 = arg2 ? Statics.field583 : Statics.field458;
            byte var22;
            if (arg0 == 1500) {
                field1330[++Statics.field1331 - 1] = var21.field2668;
                var22 = 1;
            } else if (arg0 == 1501) {
                field1330[++Statics.field1331 - 1] = var21.field2669;
                var22 = 1;
            } else if (arg0 == 1502) {
                field1330[++Statics.field1331 - 1] = var21.field2670;
                var22 = 1;
            } else if (arg0 == 1503) {
                field1330[++Statics.field1331 - 1] = var21.field2671;
                var22 = 1;
            } else if (arg0 == 1504) {
                field1330[++Statics.field1331 - 1] = var21.field2700 ? 1 : 0;
                var22 = 1;
            } else if (arg0 == 1505) {
                field1330[++Statics.field1331 - 1] = var21.field2674;
                var22 = 1;
            } else {
                var22 = 2;
            }
            return var22;
        } else if (arg0 < 1700) {
            class217 var23 = arg2 ? Statics.field583 : Statics.field458;
            byte var24;
            if (arg0 == 1600) {
                field1330[++Statics.field1331 - 1] = var23.field2779;
                var24 = 1;
            } else if (arg0 == 1601) {
                field1330[++Statics.field1331 - 1] = var23.field2677;
                var24 = 1;
            } else if (arg0 == 1602) {
                field1332[++Statics.field383 - 1] = var23.field2715;
                var24 = 1;
            } else if (arg0 == 1603) {
                field1330[++Statics.field1331 - 1] = var23.field2767;
                var24 = 1;
            } else if (arg0 == 1604) {
                field1330[++Statics.field1331 - 1] = var23.field2709;
                var24 = 1;
            } else if (arg0 == 1605) {
                field1330[++Statics.field1331 - 1] = var23.field2738;
                var24 = 1;
            } else if (arg0 == 1606) {
                field1330[++Statics.field1331 - 1] = var23.field2706;
                var24 = 1;
            } else if (arg0 == 1607) {
                field1330[++Statics.field1331 - 1] = var23.field2654;
                var24 = 1;
            } else if (arg0 == 1608) {
                field1330[++Statics.field1331 - 1] = var23.field2727;
                var24 = 1;
            } else if (arg0 == 1609) {
                field1330[++Statics.field1331 - 1] = var23.field2686;
                var24 = 1;
            } else if (arg0 == 1610) {
                field1330[++Statics.field1331 - 1] = var23.field2687;
                var24 = 1;
            } else if (arg0 == 1611) {
                field1330[++Statics.field1331 - 1] = var23.field2761;
                var24 = 1;
            } else if (arg0 == 1612) {
                field1330[++Statics.field1331 - 1] = var23.field2729;
                var24 = 1;
            } else if (arg0 == 1613) {
                field1330[++Statics.field1331 - 1] = var23.field2685.method12();
                var24 = 1;
            } else {
                var24 = 2;
            }
            return var24;
        } else if (arg0 < 1800) {
            class217 var28 = arg2 ? Statics.field583 : Statics.field458;
            byte var29;
            if (arg0 == 1700) {
                field1330[++Statics.field1331 - 1] = var28.field2720;
                var29 = 1;
            } else if (arg0 == 1701) {
                if (var28.field2720 == -1) {
                    field1330[++Statics.field1331 - 1] = 0;
                } else {
                    field1330[++Statics.field1331 - 1] = var28.field2776;
                }
                var29 = 1;
            } else if (arg0 == 1702) {
                field1330[++Statics.field1331 - 1] = var28.field2672;
                var29 = 1;
            } else {
                var29 = 2;
            }
            return var29;
        } else if (arg0 < 1900) {
            class217 var30 = arg2 ? Statics.field583 : Statics.field458;
            byte var31;
            if (arg0 == 1800) {
                field1330[++Statics.field1331 - 1] = class218.method241(client.method83(var30));
                var31 = 1;
            } else if (arg0 == 1801) {
                int var32 = field1330[--Statics.field1331];
                int var296 = var32 - 1;
                if (var30.field2790 == null || var296 >= var30.field2790.length || var30.field2790[var296] == null) {
                    field1332[++Statics.field383 - 1] = "";
                } else {
                    field1332[++Statics.field383 - 1] = var30.field2790[var296];
                }
                var31 = 1;
            } else if (arg0 == 1802) {
                if (var30.field2728 == null) {
                    field1332[++Statics.field383 - 1] = "";
                } else {
                    field1332[++Statics.field383 - 1] = var30.field2728;
                }
                var31 = 1;
            } else {
                var31 = 2;
            }
            return var31;
        } else if (arg0 < 2000) {
            return method2317(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method81(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method978(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method2733(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method323(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method2205(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            class217 var33 = class217.method3680(field1330[--Statics.field1331]);
            byte var34;
            if (arg0 == 2500) {
                field1330[++Statics.field1331 - 1] = var33.field2668;
                var34 = 1;
            } else if (arg0 == 2501) {
                field1330[++Statics.field1331 - 1] = var33.field2669;
                var34 = 1;
            } else if (arg0 == 2502) {
                field1330[++Statics.field1331 - 1] = var33.field2670;
                var34 = 1;
            } else if (arg0 == 2503) {
                field1330[++Statics.field1331 - 1] = var33.field2671;
                var34 = 1;
            } else if (arg0 == 2504) {
                field1330[++Statics.field1331 - 1] = var33.field2700 ? 1 : 0;
                var34 = 1;
            } else if (arg0 == 2505) {
                field1330[++Statics.field1331 - 1] = var33.field2674;
                var34 = 1;
            } else {
                var34 = 2;
            }
            return var34;
        } else if (arg0 < 2700) {
            class217 var35 = class217.method3680(field1330[--Statics.field1331]);
            byte var36;
            if (arg0 == 2600) {
                field1330[++Statics.field1331 - 1] = var35.field2779;
                var36 = 1;
            } else if (arg0 == 2601) {
                field1330[++Statics.field1331 - 1] = var35.field2677;
                var36 = 1;
            } else if (arg0 == 2602) {
                field1332[++Statics.field383 - 1] = var35.field2715;
                var36 = 1;
            } else if (arg0 == 2603) {
                field1330[++Statics.field1331 - 1] = var35.field2767;
                var36 = 1;
            } else if (arg0 == 2604) {
                field1330[++Statics.field1331 - 1] = var35.field2709;
                var36 = 1;
            } else if (arg0 == 2605) {
                field1330[++Statics.field1331 - 1] = var35.field2738;
                var36 = 1;
            } else if (arg0 == 2606) {
                field1330[++Statics.field1331 - 1] = var35.field2706;
                var36 = 1;
            } else if (arg0 == 2607) {
                field1330[++Statics.field1331 - 1] = var35.field2654;
                var36 = 1;
            } else if (arg0 == 2608) {
                field1330[++Statics.field1331 - 1] = var35.field2727;
                var36 = 1;
            } else if (arg0 == 2609) {
                field1330[++Statics.field1331 - 1] = var35.field2686;
                var36 = 1;
            } else if (arg0 == 2610) {
                field1330[++Statics.field1331 - 1] = var35.field2687;
                var36 = 1;
            } else if (arg0 == 2611) {
                field1330[++Statics.field1331 - 1] = var35.field2761;
                var36 = 1;
            } else if (arg0 == 2612) {
                field1330[++Statics.field1331 - 1] = var35.field2729;
                var36 = 1;
            } else if (arg0 == 2613) {
                field1330[++Statics.field1331 - 1] = var35.field2685.method12();
                var36 = 1;
            } else {
                var36 = 2;
            }
            return var36;
        } else if (arg0 < 2800) {
            byte var38;
            if (arg0 == 2700) {
                class217 var37 = class217.method3680(field1330[--Statics.field1331]);
                field1330[++Statics.field1331 - 1] = var37.field2720;
                var38 = 1;
            } else if (arg0 == 2701) {
                class217 var39 = class217.method3680(field1330[--Statics.field1331]);
                if (var39.field2720 == -1) {
                    field1330[++Statics.field1331 - 1] = 0;
                } else {
                    field1330[++Statics.field1331 - 1] = var39.field2776;
                }
                var38 = 1;
            } else if (arg0 == 2702) {
                int var40 = field1330[--Statics.field1331];
                class69 var41 = (class69) client.field1119.method3190((long) var40);
                if (var41 == null) {
                    field1330[++Statics.field1331 - 1] = 0;
                } else {
                    field1330[++Statics.field1331 - 1] = 1;
                }
                var38 = 1;
            } else if (arg0 == 2706) {
                field1330[++Statics.field1331 - 1] = client.field1067;
                var38 = 1;
            } else {
                var38 = 2;
            }
            return var38;
        } else if (arg0 < 2900) {
            class217 var42 = class217.method3680(field1330[--Statics.field1331]);
            byte var43;
            if (arg0 == 2800) {
                field1330[++Statics.field1331 - 1] = class218.method241(client.method83(var42));
                var43 = 1;
            } else if (arg0 == 2801) {
                int var44 = field1330[--Statics.field1331];
                int var297 = var44 - 1;
                if (var42.field2790 == null || var297 >= var42.field2790.length || var42.field2790[var297] == null) {
                    field1332[++Statics.field383 - 1] = "";
                } else {
                    field1332[++Statics.field383 - 1] = var42.field2790[var297];
                }
                var43 = 1;
            } else if (arg0 == 2802) {
                if (var42.field2728 == null) {
                    field1332[++Statics.field383 - 1] = "";
                } else {
                    field1332[++Statics.field383 - 1] = var42.field2728;
                }
                var43 = 1;
            } else {
                var43 = 2;
            }
            return var43;
        } else if (arg0 < 3000) {
            return method2317(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method4490(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            byte var48;
            if (arg0 == 3200) {
                Statics.field1331 -= 3;
                int var45 = field1330[Statics.field1331];
                int var46 = field1330[Statics.field1331 + 1];
                int var47 = field1330[Statics.field1331 + 2];
                if (client.field1145 != 0 && var46 != 0 && client.field932 < 50) {
                    client.field1037[client.field932] = var45;
                    client.field1156[client.field932] = var46;
                    client.field1151[client.field932] = var47;
                    client.field1152[client.field932] = null;
                    client.field1171[client.field932] = 0;
                    client.field932++;
                }
                var48 = 1;
            } else if (arg0 == 3201) {
                int var49 = field1330[--Statics.field1331];
                if (var49 == -1 && !client.field1144) {
                    Statics.field2517.method3344();
                    class204.field2518 = 1;
                    Statics.field2519 = null;
                } else if (var49 != -1 && client.field1143 != var49 && client.field1142 != 0 && !client.field1144) {
                    class238 var50 = Statics.field2149;
                    int var51 = client.field1142;
                    class204.field2518 = 1;
                    Statics.field2519 = var50;
                    Statics.field2520 = var49;
                    Statics.field439 = 0;
                    Statics.field2456 = var51;
                    Statics.field1385 = false;
                    Statics.field2305 = 2;
                }
                client.field1143 = var49;
                var48 = 1;
            } else if (arg0 == 3202) {
                Statics.field1331 -= 2;
                client.method862(field1330[Statics.field1331], field1330[Statics.field1331 + 1]);
                var48 = 1;
            } else {
                var48 = 2;
            }
            return var48;
        } else if (arg0 < 3400) {
            return method15(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method963(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method3450(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method50(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method2580(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            byte var54;
            if (arg0 == 4100) {
                String var52 = field1332[--Statics.field383];
                int var53 = field1330[--Statics.field1331];
                field1332[++Statics.field383 - 1] = var52 + var53;
                var54 = 1;
            } else if (arg0 == 4101) {
                Statics.field383 -= 2;
                String var55 = field1332[Statics.field383];
                String var56 = field1332[Statics.field383 + 1];
                field1332[++Statics.field383 - 1] = var55 + var56;
                var54 = 1;
            } else if (arg0 == 4102) {
                String var57 = field1332[--Statics.field383];
                int var58 = field1330[--Statics.field1331];
                field1332[++Statics.field383 - 1] = var57 + Statics.method2135(var58, true);
                var54 = 1;
            } else if (arg0 == 4103) {
                String var59 = field1332[--Statics.field383];
                field1332[++Statics.field383 - 1] = var59.toLowerCase();
                var54 = 1;
            } else if (arg0 == 4104) {
                int var60 = field1330[--Statics.field1331];
                long var61 = ((long) var60 + 11745L) * 86400000L;
                field1329.setTime(new Date(var61));
                int var63 = field1329.get(5);
                int var64 = field1329.get(2);
                int var65 = field1329.get(1);
                field1332[++Statics.field383 - 1] = var63 + "-" + field1336[var64] + "-" + var65;
                var54 = 1;
            } else if (arg0 == 4105) {
                Statics.field383 -= 2;
                String var66 = field1332[Statics.field383];
                String var67 = field1332[Statics.field383 + 1];
                if (Statics.field341.field864 != null && Statics.field341.field864.field2626) {
                    field1332[++Statics.field383 - 1] = var67;
                } else {
                    field1332[++Statics.field383 - 1] = var66;
                }
                var54 = 1;
            } else if (arg0 == 4106) {
                int var68 = field1330[--Statics.field1331];
                field1332[++Statics.field383 - 1] = Integer.toString(var68);
                var54 = 1;
            } else if (arg0 == 4107) {
                Statics.field383 -= 2;
                int[] var69 = field1330;
                int var70 = ++Statics.field1331 - 1;
                int var71 = class165.method3452(field1332[Statics.field383], field1332[Statics.field383 + 1], client.field1121);
                byte var72;
                if (var71 > 0) {
                    var72 = 1;
                } else if (var71 < 0) {
                    var72 = -1;
                } else {
                    var72 = 0;
                }
                var69[var70] = var72;
                var54 = 1;
            } else if (arg0 == 4108) {
                String var73 = field1332[--Statics.field383];
                Statics.field1331 -= 2;
                int var74 = field1330[Statics.field1331];
                int var75 = field1330[Statics.field1331 + 1];
                byte[] var76 = Statics.field477.method3720(var75, 0);
                class264 var77 = new class264(var76);
                field1330[++Statics.field1331 - 1] = var77.method4322(var73, var74);
                var54 = 1;
            } else if (arg0 == 4109) {
                String var78 = field1332[--Statics.field383];
                Statics.field1331 -= 2;
                int var79 = field1330[Statics.field1331];
                int var80 = field1330[Statics.field1331 + 1];
                byte[] var81 = Statics.field477.method3720(var80, 0);
                class264 var82 = new class264(var81);
                field1330[++Statics.field1331 - 1] = var82.method4321(var78, var79);
                var54 = 1;
            } else if (arg0 == 4110) {
                Statics.field383 -= 2;
                String var83 = field1332[Statics.field383];
                String var84 = field1332[Statics.field383 + 1];
                if (field1330[--Statics.field1331] == 1) {
                    field1332[++Statics.field383 - 1] = var83;
                } else {
                    field1332[++Statics.field383 - 1] = var84;
                }
                var54 = 1;
            } else if (arg0 == 4111) {
                String var85 = field1332[--Statics.field383];
                field1332[++Statics.field383 - 1] = class265.method4323(var85);
                var54 = 1;
            } else if (arg0 == 4112) {
                String var86 = field1332[--Statics.field383];
                int var87 = field1330[--Statics.field1331];
                field1332[++Statics.field383 - 1] = var86 + (char) var87;
                var54 = 1;
            } else if (arg0 == 4113) {
                int var88 = field1330[--Statics.field1331];
                int[] var89 = field1330;
                int var90 = ++Statics.field1331 - 1;
                char var91 = (char) var88;
                boolean var92;
                if (var91 >= ' ' && var91 <= '~') {
                    var92 = true;
                } else if (var91 >= 160 && var91 <= 255) {
                    var92 = true;
                } else if (var91 == 8364 || var91 == 338 || var91 == 8212 || var91 == 339 || var91 == 376) {
                    var92 = true;
                } else {
                    var92 = false;
                }
                var89[var90] = var92 ? 1 : 0;
                var54 = 1;
            } else if (arg0 == 4114) {
                int var93 = field1330[--Statics.field1331];
                int[] var94 = field1330;
                int var95 = ++Statics.field1331 - 1;
                char var96 = (char) var93;
                boolean var97 = var96 >= '0' && var96 <= '9' || var96 >= 'A' && var96 <= 'Z' || var96 >= 'a' && var96 <= 'z';
                var94[var95] = var97 ? 1 : 0;
                var54 = 1;
            } else if (arg0 == 4115) {
                int var98 = field1330[--Statics.field1331];
                field1330[++Statics.field1331 - 1] = class271.method2655((char) var98) ? 1 : 0;
                var54 = 1;
            } else if (arg0 == 4116) {
                int var99 = field1330[--Statics.field1331];
                field1330[++Statics.field1331 - 1] = class271.method2582((char) var99) ? 1 : 0;
                var54 = 1;
            } else if (arg0 == 4117) {
                String var100 = field1332[--Statics.field383];
                if (var100 == null) {
                    field1330[++Statics.field1331 - 1] = 0;
                } else {
                    field1330[++Statics.field1331 - 1] = var100.length();
                }
                var54 = 1;
            } else if (arg0 == 4118) {
                String var101 = field1332[--Statics.field383];
                Statics.field1331 -= 2;
                int var102 = field1330[Statics.field1331];
                int var103 = field1330[Statics.field1331 + 1];
                field1332[++Statics.field383 - 1] = var101.substring(var102, var103);
                var54 = 1;
            } else if (arg0 == 4119) {
                String var104 = field1332[--Statics.field383];
                StringBuilder var105 = new StringBuilder(var104.length());
                boolean var106 = false;
                for (int var107 = 0; var107 < var104.length(); var107++) {
                    char var108 = var104.charAt(var107);
                    if (var108 == '<') {
                        var106 = true;
                    } else if (var108 == '>') {
                        var106 = false;
                    } else if (!var106) {
                        var105.append(var108);
                    }
                }
                field1332[++Statics.field383 - 1] = var105.toString();
                var54 = 1;
            } else if (arg0 == 4120) {
                String var109 = field1332[--Statics.field383];
                int var110 = field1330[--Statics.field1331];
                field1330[++Statics.field1331 - 1] = var109.indexOf(var110);
                var54 = 1;
            } else if (arg0 == 4121) {
                Statics.field383 -= 2;
                String var111 = field1332[Statics.field383];
                String var112 = field1332[Statics.field383 + 1];
                int var113 = field1330[--Statics.field1331];
                field1330[++Statics.field1331 - 1] = var111.indexOf(var112, var113);
                var54 = 1;
            } else {
                var54 = 2;
            }
            return var54;
        } else if (arg0 < 4300) {
            byte var115;
            if (arg0 == 4200) {
                int var114 = field1330[--Statics.field1331];
                field1332[++Statics.field383 - 1] = class257.method3684(var114).field3535;
                var115 = 1;
            } else if (arg0 == 4201) {
                Statics.field1331 -= 2;
                int var116 = field1330[Statics.field1331];
                int var117 = field1330[Statics.field1331 + 1];
                class257 var118 = class257.method3684(var116);
                if (var117 < 1 || var117 > 5 || var118.field3502[var117 - 1] == null) {
                    field1332[++Statics.field383 - 1] = "";
                } else {
                    field1332[++Statics.field383 - 1] = var118.field3502[var117 - 1];
                }
                var115 = 1;
            } else if (arg0 == 4202) {
                Statics.field1331 -= 2;
                int var119 = field1330[Statics.field1331];
                int var120 = field1330[Statics.field1331 + 1];
                class257 var121 = class257.method3684(var119);
                if (var120 < 1 || var120 > 5 || var121.field3495[var120 - 1] == null) {
                    field1332[++Statics.field383 - 1] = "";
                } else {
                    field1332[++Statics.field383 - 1] = var121.field3495[var120 - 1];
                }
                var115 = 1;
            } else if (arg0 == 4203) {
                int var122 = field1330[--Statics.field1331];
                field1330[++Statics.field1331 - 1] = class257.method3684(var122).field3515;
                var115 = 1;
            } else if (arg0 == 4204) {
                int var123 = field1330[--Statics.field1331];
                field1330[++Statics.field1331 - 1] = class257.method3684(var123).field3503 == 1 ? 1 : 0;
                var115 = 1;
            } else if (arg0 == 4205) {
                int var124 = field1330[--Statics.field1331];
                class257 var125 = class257.method3684(var124);
                if (var125.field3543 == -1 && var125.field3534 >= 0) {
                    field1330[++Statics.field1331 - 1] = var125.field3534;
                } else {
                    field1330[++Statics.field1331 - 1] = var124;
                }
                var115 = 1;
            } else if (arg0 == 4206) {
                int var126 = field1330[--Statics.field1331];
                class257 var127 = class257.method3684(var126);
                if (var127.field3543 >= 0 && var127.field3534 >= 0) {
                    field1330[++Statics.field1331 - 1] = var127.field3534;
                } else {
                    field1330[++Statics.field1331 - 1] = var126;
                }
                var115 = 1;
            } else if (arg0 == 4207) {
                int var128 = field1330[--Statics.field1331];
                field1330[++Statics.field1331 - 1] = class257.method3684(var128).field3511 ? 1 : 0;
                var115 = 1;
            } else if (arg0 == 4208) {
                int var129 = field1330[--Statics.field1331];
                class257 var130 = class257.method3684(var129);
                if (var130.field3547 == -1 && var130.field3546 >= 0) {
                    field1330[++Statics.field1331 - 1] = var130.field3546;
                } else {
                    field1330[++Statics.field1331 - 1] = var129;
                }
                var115 = 1;
            } else if (arg0 == 4209) {
                int var131 = field1330[--Statics.field1331];
                class257 var132 = class257.method3684(var131);
                if (var132.field3547 >= 0 && var132.field3546 >= 0) {
                    field1330[++Statics.field1331 - 1] = var132.field3546;
                } else {
                    field1330[++Statics.field1331 - 1] = var131;
                }
                var115 = 1;
            } else if (arg0 == 4210) {
                String var133 = field1332[--Statics.field383];
                int var134 = field1330[--Statics.field1331];
                boolean var136 = var134 == 1;
                String var137 = var133.toLowerCase();
                short[] var138 = new short[16];
                int var139 = 0;
                int var140 = 0;
                while (true) {
                    if (var140 >= Statics.field2450) {
                        Statics.field3682 = var138;
                        Statics.field550 = 0;
                        Statics.field45 = var139;
                        String[] var144 = new String[Statics.field45];
                        for (int var145 = 0; var145 < Statics.field45; var145++) {
                            var144[var145] = class257.method3684(var138[var145]).field3535;
                        }
                        short[] var146 = Statics.field3682;
                        class171.method153(var144, var146, 0, var144.length - 1);
                        break;
                    }
                    class257 var141 = class257.method3684(var140);
                    if ((!var136 || var141.field3514) && var141.field3543 == -1 && var141.field3535.toLowerCase().indexOf(var137) != -1) {
                        if (var139 >= 250) {
                            Statics.field45 = -1;
                            Statics.field3682 = null;
                            break;
                        }
                        if (var139 >= var138.length) {
                            short[] var142 = new short[var138.length * 2];
                            for (int var143 = 0; var143 < var139; var143++) {
                                var142[var143] = var138[var143];
                            }
                            var138 = var142;
                        }
                        var138[var139++] = (short) var140;
                    }
                    var140++;
                }
                field1330[++Statics.field1331 - 1] = Statics.field45;
                var115 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field3682 == null || Statics.field550 >= Statics.field45) {
                    field1330[++Statics.field1331 - 1] = -1;
                } else {
                    field1330[++Statics.field1331 - 1] = Statics.field3682[++Statics.field550 - 1] & 0xFFFF;
                }
                var115 = 1;
            } else if (arg0 == 4212) {
                Statics.field550 = 0;
                var115 = 1;
            } else {
                var115 = 2;
            }
            return var115;
        } else if (arg0 < 5100) {
            byte var147;
            if (arg0 == 5000) {
                field1330[++Statics.field1331 - 1] = client.field955;
                var147 = 1;
            } else if (arg0 == 5001) {
                Statics.field1331 -= 3;
                client.field955 = field1330[Statics.field1331];
                Statics.field1481 = class277.method1026(field1330[Statics.field1331 + 1]);
                if (Statics.field1481 == null) {
                    Statics.field1481 = class277.field3735;
                }
                client.field1124 = field1330[Statics.field1331 + 2];
                client.field948.method3054(225);
                client.field948.method2961(client.field955);
                client.field948.method2961(Statics.field1481.field3736);
                client.field948.method2961(client.field1124);
                var147 = 1;
            } else if (arg0 == 5002) {
                String var148 = field1332[--Statics.field383];
                Statics.field1331 -= 2;
                int var149 = field1330[Statics.field1331];
                int var150 = field1330[Statics.field1331 + 1];
                client.field948.method3054(180);
                client.field948.method2961(class174.method954(var148) + 2);
                client.field948.method2902(var148);
                client.field948.method2961(var149 - 1);
                client.field948.method2961(var150);
                var147 = 1;
            } else if (arg0 == 5003) {
                Statics.field1331 -= 2;
                int var151 = field1330[Statics.field1331];
                int var152 = field1330[Statics.field1331 + 1];
                class102 var153 = (class102) class99.field1517.get(var151);
                class73 var154 = var153.method1649(var152);
                if (var154 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                    field1330[++Statics.field1331 - 1] = 0;
                    field1332[++Statics.field383 - 1] = "";
                    field1332[++Statics.field383 - 1] = "";
                    field1332[++Statics.field383 - 1] = "";
                } else {
                    field1330[++Statics.field1331 - 1] = var154.field855;
                    field1330[++Statics.field1331 - 1] = var154.field850;
                    field1332[++Statics.field383 - 1] = var154.field852 == null ? "" : var154.field852;
                    field1332[++Statics.field383 - 1] = var154.field854 == null ? "" : var154.field854;
                    field1332[++Statics.field383 - 1] = var154.field853 == null ? "" : var154.field853;
                }
                var147 = 1;
            } else if (arg0 == 5004) {
                int var156 = field1330[--Statics.field1331];
                class73 var157 = class99.method45(var156);
                if (var157 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                    field1330[++Statics.field1331 - 1] = 0;
                    field1332[++Statics.field383 - 1] = "";
                    field1332[++Statics.field383 - 1] = "";
                    field1332[++Statics.field383 - 1] = "";
                } else {
                    field1330[++Statics.field1331 - 1] = var157.field851;
                    field1330[++Statics.field1331 - 1] = var157.field850;
                    field1332[++Statics.field383 - 1] = var157.field852 == null ? "" : var157.field852;
                    field1332[++Statics.field383 - 1] = var157.field854 == null ? "" : var157.field854;
                    field1332[++Statics.field383 - 1] = var157.field853 == null ? "" : var157.field853;
                }
                var147 = 1;
            } else if (arg0 == 5005) {
                if (Statics.field1481 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                } else {
                    field1330[++Statics.field1331 - 1] = Statics.field1481.field3736;
                }
                var147 = 1;
            } else if (arg0 == 5008) {
                String var158 = field1332[--Statics.field383];
                int var159 = field1330[--Statics.field1331];
                String var160 = var158.toLowerCase();
                byte var161 = 0;
                if (var160.startsWith(class226.field3039)) {
                    var161 = 0;
                    var158 = var158.substring(class226.field3039.length());
                } else if (var160.startsWith(class226.field3021)) {
                    var161 = 1;
                    var158 = var158.substring(class226.field3021.length());
                } else if (var160.startsWith(class226.field3092)) {
                    var161 = 2;
                    var158 = var158.substring(class226.field3092.length());
                } else if (var160.startsWith(class226.field3045)) {
                    var161 = 3;
                    var158 = var158.substring(class226.field3045.length());
                } else if (var160.startsWith(class226.field3047)) {
                    var161 = 4;
                    var158 = var158.substring(class226.field3047.length());
                } else if (var160.startsWith(class226.field3049)) {
                    var161 = 5;
                    var158 = var158.substring(class226.field3049.length());
                } else if (var160.startsWith(class226.field3051)) {
                    var161 = 6;
                    var158 = var158.substring(class226.field3051.length());
                } else if (var160.startsWith(class226.field3053)) {
                    var161 = 7;
                    var158 = var158.substring(class226.field3053.length());
                } else if (var160.startsWith(class226.field3055)) {
                    var161 = 8;
                    var158 = var158.substring(class226.field3055.length());
                } else if (var160.startsWith(class226.field3057)) {
                    var161 = 9;
                    var158 = var158.substring(class226.field3057.length());
                } else if (var160.startsWith(class226.field3059)) {
                    var161 = 10;
                    var158 = var158.substring(class226.field3059.length());
                } else if (var160.startsWith(class226.field3061)) {
                    var161 = 11;
                    var158 = var158.substring(class226.field3061.length());
                } else if (client.field1121 != 0) {
                    if (var160.startsWith(class226.field3040)) {
                        var161 = 0;
                        var158 = var158.substring(class226.field3040.length());
                    } else if (var160.startsWith(class226.field2869)) {
                        var161 = 1;
                        var158 = var158.substring(class226.field2869.length());
                    } else if (var160.startsWith(class226.field3044)) {
                        var161 = 2;
                        var158 = var158.substring(class226.field3044.length());
                    } else if (var160.startsWith(class226.field3001)) {
                        var161 = 3;
                        var158 = var158.substring(class226.field3001.length());
                    } else if (var160.startsWith(class226.field3048)) {
                        var161 = 4;
                        var158 = var158.substring(class226.field3048.length());
                    } else if (var160.startsWith(class226.field3102)) {
                        var161 = 5;
                        var158 = var158.substring(class226.field3102.length());
                    } else if (var160.startsWith(class226.field2922)) {
                        var161 = 6;
                        var158 = var158.substring(class226.field2922.length());
                    } else if (var160.startsWith(class226.field3068)) {
                        var161 = 7;
                        var158 = var158.substring(class226.field3068.length());
                    } else if (var160.startsWith(class226.field3096)) {
                        var161 = 8;
                        var158 = var158.substring(class226.field3096.length());
                    } else if (var160.startsWith(class226.field3058)) {
                        var161 = 9;
                        var158 = var158.substring(class226.field3058.length());
                    } else if (var160.startsWith(class226.field3112)) {
                        var161 = 10;
                        var158 = var158.substring(class226.field3112.length());
                    } else if (var160.startsWith(class226.field3062)) {
                        var161 = 11;
                        var158 = var158.substring(class226.field3062.length());
                    }
                }
                String var162 = var158.toLowerCase();
                byte var163 = 0;
                if (var162.startsWith(class226.field3034)) {
                    var163 = 1;
                    var158 = var158.substring(class226.field3034.length());
                } else if (var162.startsWith(class226.field3065)) {
                    var163 = 2;
                    var158 = var158.substring(class226.field3065.length());
                } else if (var162.startsWith(class226.field3067)) {
                    var163 = 3;
                    var158 = var158.substring(class226.field3067.length());
                } else if (var162.startsWith(class226.field3069)) {
                    var163 = 4;
                    var158 = var158.substring(class226.field3069.length());
                } else if (var162.startsWith(class226.field3133)) {
                    var163 = 5;
                    var158 = var158.substring(class226.field3133.length());
                } else if (client.field1121 != 0) {
                    if (var162.startsWith(class226.field3107)) {
                        var163 = 1;
                        var158 = var158.substring(class226.field3107.length());
                    } else if (var162.startsWith(class226.field3066)) {
                        var163 = 2;
                        var158 = var158.substring(class226.field3066.length());
                    } else if (var162.startsWith(class226.field2941)) {
                        var163 = 3;
                        var158 = var158.substring(class226.field2941.length());
                    } else if (var162.startsWith(class226.field3094)) {
                        var163 = 4;
                        var158 = var158.substring(class226.field3094.length());
                    } else if (var162.startsWith(class226.field3072)) {
                        var163 = 5;
                        var158 = var158.substring(class226.field3072.length());
                    }
                }
                client.field948.method3054(91);
                client.field948.method2961(0);
                int var164 = client.field948.field2408;
                client.field948.method2961(var159);
                client.field948.method2961(var161);
                client.field948.method2961(var163);
                class266.method3525(client.field948, var158);
                client.field948.method2807(client.field948.field2408 - var164);
                var147 = 1;
            } else if (arg0 == 5009) {
                Statics.field383 -= 2;
                String var165 = field1332[Statics.field383];
                String var166 = field1332[Statics.field383 + 1];
                client.field948.method3054(170);
                client.field948.method2957(0);
                int var167 = client.field948.field2408;
                client.field948.method2902(var165);
                class266.method3525(client.field948, var166);
                client.field948.method2933(client.field948.field2408 - var167);
                var147 = 1;
            } else if (arg0 == 5015) {
                String var168;
                if (Statics.field341 == null || Statics.field341.field873 == null) {
                    var168 = "";
                } else {
                    var168 = Statics.field341.field873;
                }
                field1332[++Statics.field383 - 1] = var168;
                var147 = 1;
            } else if (arg0 == 5016) {
                field1330[++Statics.field1331 - 1] = client.field1124;
                var147 = 1;
            } else if (arg0 == 5017) {
                int var169 = field1330[--Statics.field1331];
                int[] var170 = field1330;
                int var171 = ++Statics.field1331 - 1;
                class102 var172 = (class102) class99.field1517.get(var169);
                int var173;
                if (var172 == null) {
                    var173 = 0;
                } else {
                    var173 = var172.method1650();
                }
                var170[var171] = var173;
                var147 = 1;
            } else if (arg0 == 5018) {
                int var174 = field1330[--Statics.field1331];
                int[] var175 = field1330;
                int var176 = ++Statics.field1331 - 1;
                class73 var177 = (class73) class99.field1518.method3154((long) var174);
                int var178;
                if (var177 == null) {
                    var178 = -1;
                } else if (class99.field1524.field2502 == var177.field2488) {
                    var178 = -1;
                } else {
                    var178 = ((class73) var177.field2488).field855;
                }
                var175[var176] = var178;
                var147 = 1;
            } else if (arg0 == 5019) {
                int var179 = field1330[--Statics.field1331];
                field1330[++Statics.field1331 - 1] = class99.method3052(var179);
                var147 = 1;
            } else if (arg0 == 5020) {
                String var180 = field1332[--Statics.field383];
                if (var180.equalsIgnoreCase("toggleroof")) {
                    Statics.field1482.field1300 = !Statics.field1482.field1300;
                    class82.method17();
                    if (Statics.field1482.field1300) {
                        Statics.method19(99, "", "Roofs are now all hidden");
                    } else {
                        Statics.method19(99, "", "Roofs will only be removed selectively");
                    }
                }
                if (var180.equalsIgnoreCase("displayfps")) {
                    client.field919 = !client.field919;
                }
                if (var180.equalsIgnoreCase("clickbox")) {
                    class134.field1926 = !class134.field1926;
                    Statics.method19(99, "", "Clickbox Mode: " + (class134.field1926 ? "AABB" : "Legacy"));
                }
                if (client.field1068 >= 2) {
                    if (var180.equalsIgnoreCase("aabb")) {
                        if (!class8.field239) {
                            class8.field239 = true;
                            class8.field234 = class12.field271;
                            Statics.method19(99, "", "AABB boxes: All");
                        } else if (class8.field234 == class12.field271) {
                            class8.field239 = true;
                            class8.field234 = class12.field275;
                            Statics.method19(99, "", "AABB boxes: Mouse Over");
                        } else {
                            class8.field239 = false;
                            Statics.method19(99, "", "AABB boxes: Off");
                        }
                    }
                    if (var180.equalsIgnoreCase("legacyboxes")) {
                        class8.field235 = !class8.field235;
                        Statics.method19(99, "", "Show legacy boxes: " + class8.field235);
                    }
                    if (var180.equalsIgnoreCase("geotests")) {
                        class8.field236 = !class8.field236;
                        Statics.method19(99, "", "Show geometry tests: " + class8.field236);
                    }
                    if (var180.equalsIgnoreCase("fpson")) {
                        client.field919 = true;
                    }
                    if (var180.equalsIgnoreCase("fpsoff")) {
                        client.field919 = false;
                    }
                    if (var180.equalsIgnoreCase("gc")) {
                        System.gc();
                    }
                    if (var180.equalsIgnoreCase("clientdrop")) {
                        if (client.field958 > 0) {
                            client.method2133();
                        } else {
                            client.method178(40);
                            Statics.field2847 = Statics.field818;
                            Statics.field818 = null;
                        }
                    }
                    if (var180.equalsIgnoreCase("errortest") && client.field1162 == 2) {
                        throw new RuntimeException();
                    }
                }
                client.field948.method3054(146);
                client.field948.method2961(var180.length() + 1);
                client.field948.method2902(var180);
                var147 = 1;
            } else if (arg0 == 5021) {
                client.field1125 = field1332[--Statics.field383].toLowerCase().trim();
                var147 = 1;
            } else if (arg0 == 5022) {
                field1332[++Statics.field383 - 1] = client.field1125;
                var147 = 1;
            } else {
                var147 = 2;
            }
            return var147;
        } else if (arg0 < 5400) {
            byte var181;
            if (arg0 == 5306) {
                field1330[++Statics.field1331 - 1] = client.method3864();
                var181 = 1;
            } else if (arg0 == 5307) {
                int var182 = field1330[--Statics.field1331];
                if (var182 == 1 || var182 == 2) {
                    client.method469(var182);
                }
                var181 = 1;
            } else if (arg0 == 5308) {
                field1330[++Statics.field1331 - 1] = Statics.field1482.field1304;
                var181 = 1;
            } else if (arg0 == 5309) {
                int var183 = field1330[--Statics.field1331];
                if (var183 == 1 || var183 == 2) {
                    Statics.field1482.field1304 = var183;
                    class82.method17();
                }
                var181 = 1;
            } else {
                var181 = 2;
            }
            return var181;
        } else if (arg0 < 5600) {
            byte var189;
            if (arg0 == 5504) {
                Statics.field1331 -= 2;
                int var187 = field1330[Statics.field1331];
                int var188 = field1330[Statics.field1331 + 1];
                if (!client.field1153) {
                    client.field1160 = var187;
                    client.field991 = var188;
                }
                var189 = 1;
            } else if (arg0 == 5505) {
                field1330[++Statics.field1331 - 1] = client.field1160;
                var189 = 1;
            } else if (arg0 == 5506) {
                field1330[++Statics.field1331 - 1] = client.field991;
                var189 = 1;
            } else if (arg0 == 5530) {
                int var190 = field1330[--Statics.field1331];
                if (var190 < 0) {
                    var190 = 0;
                }
                client.field996 = var190;
                var189 = 1;
            } else if (arg0 == 5531) {
                field1330[++Statics.field1331 - 1] = client.field996;
                var189 = 1;
            } else {
                var189 = 2;
            }
            return var189;
        } else if (arg0 < 5700) {
            return method51(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            byte var191;
            if (arg0 == 6200) {
                Statics.field1331 -= 2;
                client.field989 = (short) field1330[Statics.field1331];
                if (client.field989 <= 0) {
                    client.field989 = 256;
                }
                client.field1148 = (short) field1330[Statics.field1331 + 1];
                if (client.field1148 <= 0) {
                    client.field1148 = 205;
                }
                var191 = 1;
            } else if (arg0 == 6201) {
                Statics.field1331 -= 2;
                client.field1161 = (short) field1330[Statics.field1331];
                if (client.field1161 <= 0) {
                    client.field1161 = 256;
                }
                client.field905 = (short) field1330[Statics.field1331 + 1];
                if (client.field905 <= 0) {
                    client.field905 = 320;
                }
                var191 = 1;
            } else if (arg0 == 6202) {
                Statics.field1331 -= 4;
                client.field1163 = (short) field1330[Statics.field1331];
                if (client.field1163 <= 0) {
                    client.field1163 = 1;
                }
                client.field1164 = (short) field1330[Statics.field1331 + 1];
                if (client.field1164 <= 0) {
                    client.field1164 = 32767;
                } else if (client.field1164 < client.field1163) {
                    client.field1164 = client.field1163;
                }
                client.field1165 = (short) field1330[Statics.field1331 + 2];
                if (client.field1165 <= 0) {
                    client.field1165 = 1;
                }
                client.field1166 = (short) field1330[Statics.field1331 + 3];
                if (client.field1166 <= 0) {
                    client.field1166 = 32767;
                } else if (client.field1166 < client.field1165) {
                    client.field1166 = client.field1165;
                }
                var191 = 1;
            } else if (arg0 == 6203) {
                if (client.field1079 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                    field1330[++Statics.field1331 - 1] = -1;
                } else {
                    client.method1000(0, 0, client.field1079.field2670, client.field1079.field2671, false);
                    field1330[++Statics.field1331 - 1] = client.field1169;
                    field1330[++Statics.field1331 - 1] = client.field1041;
                }
                var191 = 1;
            } else if (arg0 == 6204) {
                field1330[++Statics.field1331 - 1] = client.field1161;
                field1330[++Statics.field1331 - 1] = client.field905;
                var191 = 1;
            } else if (arg0 == 6205) {
                field1330[++Statics.field1331 - 1] = client.field989;
                field1330[++Statics.field1331 - 1] = client.field1148;
                var191 = 1;
            } else {
                var191 = 2;
            }
            return var191;
        } else if (arg0 < 6600) {
            byte var192;
            if (arg0 == 6500) {
                field1330[++Statics.field1331 - 1] = class81.method129() ? 1 : 0;
                var192 = 1;
            } else if (arg0 == 6501) {
                class81.field1294 = 0;
                class81 var193;
                if (class81.field1294 < class81.field1282) {
                    var193 = Statics.field1281[++class81.field1294 - 1];
                } else {
                    var193 = null;
                }
                if (var193 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                    field1330[++Statics.field1331 - 1] = 0;
                    field1332[++Statics.field383 - 1] = "";
                    field1330[++Statics.field1331 - 1] = 0;
                    field1330[++Statics.field1331 - 1] = 0;
                    field1332[++Statics.field383 - 1] = "";
                } else {
                    field1330[++Statics.field1331 - 1] = var193.field1278;
                    field1330[++Statics.field1331 - 1] = var193.field1288;
                    field1332[++Statics.field383 - 1] = var193.field1291;
                    field1330[++Statics.field1331 - 1] = var193.field1292;
                    field1330[++Statics.field1331 - 1] = var193.field1287;
                    field1332[++Statics.field383 - 1] = var193.field1286;
                }
                var192 = 1;
            } else if (arg0 == 6502) {
                class81 var196;
                if (class81.field1294 < class81.field1282) {
                    var196 = Statics.field1281[++class81.field1294 - 1];
                } else {
                    var196 = null;
                }
                if (var196 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                    field1330[++Statics.field1331 - 1] = 0;
                    field1332[++Statics.field383 - 1] = "";
                    field1330[++Statics.field1331 - 1] = 0;
                    field1330[++Statics.field1331 - 1] = 0;
                    field1332[++Statics.field383 - 1] = "";
                } else {
                    field1330[++Statics.field1331 - 1] = var196.field1278;
                    field1330[++Statics.field1331 - 1] = var196.field1288;
                    field1332[++Statics.field383 - 1] = var196.field1291;
                    field1330[++Statics.field1331 - 1] = var196.field1292;
                    field1330[++Statics.field1331 - 1] = var196.field1287;
                    field1332[++Statics.field383 - 1] = var196.field1286;
                }
                var192 = 1;
            } else if (arg0 == 6506) {
                int var198 = field1330[--Statics.field1331];
                class81 var199 = null;
                for (int var200 = 0; var200 < class81.field1282; var200++) {
                    if (Statics.field1281[var200].field1278 == var198) {
                        var199 = Statics.field1281[var200];
                        break;
                    }
                }
                if (var199 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                    field1330[++Statics.field1331 - 1] = 0;
                    field1332[++Statics.field383 - 1] = "";
                    field1330[++Statics.field1331 - 1] = 0;
                    field1330[++Statics.field1331 - 1] = 0;
                    field1332[++Statics.field383 - 1] = "";
                } else {
                    field1330[++Statics.field1331 - 1] = var199.field1278;
                    field1330[++Statics.field1331 - 1] = var199.field1288;
                    field1332[++Statics.field383 - 1] = var199.field1291;
                    field1330[++Statics.field1331 - 1] = var199.field1292;
                    field1330[++Statics.field1331 - 1] = var199.field1287;
                    field1332[++Statics.field383 - 1] = var199.field1286;
                }
                var192 = 1;
            } else if (arg0 == 6507) {
                Statics.field1331 -= 4;
                int var201 = field1330[Statics.field1331];
                boolean var202 = field1330[Statics.field1331 + 1] == 1;
                int var203 = field1330[Statics.field1331 + 2];
                boolean var204 = field1330[Statics.field1331 + 3] == 1;
                if (Statics.field1281 != null) {
                    class81.method3686(0, Statics.field1281.length - 1, var201, var202, var203, var204);
                }
                var192 = 1;
            } else if (arg0 == 6511) {
                int var205 = field1330[--Statics.field1331];
                if (var205 >= 0 && var205 < class81.field1282) {
                    class81 var206 = Statics.field1281[var205];
                    field1330[++Statics.field1331 - 1] = var206.field1278;
                    field1330[++Statics.field1331 - 1] = var206.field1288;
                    field1332[++Statics.field383 - 1] = var206.field1291;
                    field1330[++Statics.field1331 - 1] = var206.field1292;
                    field1330[++Statics.field1331 - 1] = var206.field1287;
                    field1332[++Statics.field383 - 1] = var206.field1286;
                } else {
                    field1330[++Statics.field1331 - 1] = -1;
                    field1330[++Statics.field1331 - 1] = 0;
                    field1332[++Statics.field383 - 1] = "";
                    field1330[++Statics.field1331 - 1] = 0;
                    field1330[++Statics.field1331 - 1] = 0;
                    field1332[++Statics.field383 - 1] = "";
                }
                var192 = 1;
            } else if (arg0 == 6512) {
                client.field1141 = field1330[--Statics.field1331] == 1;
                var192 = 1;
            } else if (arg0 == 6513) {
                Statics.field1331 -= 2;
                int var207 = field1330[Statics.field1331];
                int var208 = field1330[Statics.field1331 + 1];
                class252 var209 = class252.method3691(var208);
                if (var209.method3997()) {
                    field1332[++Statics.field383 - 1] = class259.method2658(var207).method4212(var208, var209.field3399);
                } else {
                    field1330[++Statics.field1331 - 1] = class259.method2658(var207).method4211(var208, var209.field3398);
                }
                var192 = 1;
            } else if (arg0 == 6514) {
                Statics.field1331 -= 2;
                int var210 = field1330[Statics.field1331];
                int var211 = field1330[Statics.field1331 + 1];
                class252 var212 = class252.method3691(var211);
                if (var212.method3997()) {
                    field1332[++Statics.field383 - 1] = class256.method239(var210).method4096(var211, var212.field3399);
                } else {
                    field1330[++Statics.field1331 - 1] = class256.method239(var210).method4111(var211, var212.field3398);
                }
                var192 = 1;
            } else if (arg0 == 6515) {
                Statics.field1331 -= 2;
                int var213 = field1330[Statics.field1331];
                int var214 = field1330[Statics.field1331 + 1];
                class252 var215 = class252.method3691(var214);
                if (var215.method3997()) {
                    field1332[++Statics.field383 - 1] = class257.method3684(var213).method4148(var214, var215.field3399);
                } else {
                    field1330[++Statics.field1331 - 1] = class257.method3684(var213).method4152(var214, var215.field3398);
                }
                var192 = 1;
            } else if (arg0 == 6516) {
                Statics.field1331 -= 2;
                int var216 = field1330[Statics.field1331];
                int var217 = field1330[Statics.field1331 + 1];
                class252 var218 = class252.method3691(var217);
                if (var218.method3997()) {
                    String[] var219 = field1332;
                    int var220 = ++Statics.field383 - 1;
                    class253 var221 = (class253) class253.field3401.method3182((long) var216);
                    class253 var222;
                    if (var221 == null) {
                        byte[] var223 = Statics.field2794.method3720(34, var216);
                        class253 var224 = new class253();
                        if (var223 != null) {
                            var224.method4012(new class174(var223));
                        }
                        var224.method4011();
                        class253.field3401.method3179(var224, (long) var216);
                        var222 = var224;
                    } else {
                        var222 = var221;
                    }
                    var219[var220] = var222.method4019(var217, var218.field3399);
                } else {
                    int[] var225 = field1330;
                    int var226 = ++Statics.field1331 - 1;
                    class253 var227 = (class253) class253.field3401.method3182((long) var216);
                    class253 var228;
                    if (var227 == null) {
                        byte[] var229 = Statics.field2794.method3720(34, var216);
                        class253 var230 = new class253();
                        if (var229 != null) {
                            var230.method4012(new class174(var229));
                        }
                        var230.method4011();
                        class253.field3401.method3179(var230, (long) var216);
                        var228 = var230;
                    } else {
                        var228 = var227;
                    }
                    var225[var226] = var228.method4014(var217, var218.field3398);
                }
                var192 = 1;
            } else {
                var192 = 2;
            }
            return var192;
        } else if (arg0 < 6700) {
            byte var234;
            if (arg0 == 6600) {
                int var231 = Statics.field890;
                int var232 = (Statics.field341.field1234 >> 7) + Statics.field340;
                int var233 = (Statics.field341.field1210 >> 7) + Statics.field356;
                client.method961().method4839(var231, var232, var233, true);
                var234 = 1;
            } else if (arg0 == 6601) {
                int var235 = field1330[--Statics.field1331];
                String var236 = "";
                class33 var237 = client.method961().method4822(var235);
                if (var237 != null) {
                    var236 = var237.method311();
                }
                field1332[++Statics.field383 - 1] = var236;
                var234 = 1;
            } else if (arg0 == 6602) {
                int var238 = field1330[--Statics.field1331];
                client.method961().method4724(var238);
                var234 = 1;
            } else if (arg0 == 6603) {
                field1330[++Statics.field1331 - 1] = client.method961().method4736();
                var234 = 1;
            } else if (arg0 == 6604) {
                int var239 = field1330[--Statics.field1331];
                client.method961().method4733(var239);
                var234 = 1;
            } else if (arg0 == 6605) {
                field1330[++Statics.field1331 - 1] = client.method961().method4738() ? 1 : 0;
                var234 = 1;
            } else if (arg0 == 6606) {
                class213 var240 = new class213(field1330[--Statics.field1331]);
                client.method961().method4740(var240.field2619, var240.field2622);
                var234 = 1;
            } else if (arg0 == 6607) {
                class213 var241 = new class213(field1330[--Statics.field1331]);
                client.method961().method4884(var241.field2619, var241.field2622);
                var234 = 1;
            } else if (arg0 == 6608) {
                class213 var242 = new class213(field1330[--Statics.field1331]);
                client.method961().method4853(var242.field2620, var242.field2619, var242.field2622);
                var234 = 1;
            } else if (arg0 == 6609) {
                class213 var243 = new class213(field1330[--Statics.field1331]);
                client.method961().method4743(var243.field2620, var243.field2619, var243.field2622);
                var234 = 1;
            } else if (arg0 == 6610) {
                field1330[++Statics.field1331 - 1] = client.method961().method4744();
                field1330[++Statics.field1331 - 1] = client.method961().method4745();
                var234 = 1;
            } else if (arg0 == 6611) {
                int var244 = field1330[--Statics.field1331];
                class33 var245 = client.method961().method4822(var244);
                if (var245 == null) {
                    field1330[++Statics.field1331 - 1] = 0;
                } else {
                    field1330[++Statics.field1331 - 1] = var245.method273().method3554();
                }
                var234 = 1;
            } else if (arg0 == 6612) {
                int var246 = field1330[--Statics.field1331];
                class33 var247 = client.method961().method4822(var246);
                if (var247 == null) {
                    field1330[++Statics.field1331 - 1] = 0;
                    field1330[++Statics.field1331 - 1] = 0;
                } else {
                    field1330[++Statics.field1331 - 1] = (var247.method267() - var247.method266() + 1) * 64;
                    field1330[++Statics.field1331 - 1] = (var247.method269() - var247.method278() + 1) * 64;
                }
                var234 = 1;
            } else if (arg0 == 6613) {
                int var248 = field1330[--Statics.field1331];
                class33 var249 = client.method961().method4822(var248);
                if (var249 == null) {
                    field1330[++Statics.field1331 - 1] = 0;
                    field1330[++Statics.field1331 - 1] = 0;
                    field1330[++Statics.field1331 - 1] = 0;
                    field1330[++Statics.field1331 - 1] = 0;
                } else {
                    field1330[++Statics.field1331 - 1] = var249.method266() * 64;
                    field1330[++Statics.field1331 - 1] = var249.method278() * 64;
                    field1330[++Statics.field1331 - 1] = var249.method267() * 64 + 64 - 1;
                    field1330[++Statics.field1331 - 1] = var249.method269() * 64 + 64 - 1;
                }
                var234 = 1;
            } else if (arg0 == 6614) {
                int var250 = field1330[--Statics.field1331];
                class33 var251 = client.method961().method4822(var250);
                if (var251 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                } else {
                    field1330[++Statics.field1331 - 1] = var251.method287();
                }
                var234 = 1;
            } else if (arg0 == 6615) {
                class213 var252 = client.method961().method4746();
                if (var252 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                    field1330[++Statics.field1331 - 1] = -1;
                } else {
                    field1330[++Statics.field1331 - 1] = var252.field2619;
                    field1330[++Statics.field1331 - 1] = var252.field2622;
                }
                var234 = 1;
            } else if (arg0 == 6616) {
                field1330[++Statics.field1331 - 1] = client.method961().method4747();
                var234 = 1;
            } else if (arg0 == 6617) {
                class213 var253 = new class213(field1330[--Statics.field1331]);
                class33 var254 = client.method961().method4726();
                if (var254 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                    field1330[++Statics.field1331 - 1] = -1;
                    var234 = 1;
                } else {
                    int[] var255 = var254.method319(var253.field2620, var253.field2619, var253.field2622);
                    if (var255 == null) {
                        field1330[++Statics.field1331 - 1] = -1;
                        field1330[++Statics.field1331 - 1] = -1;
                    } else {
                        field1330[++Statics.field1331 - 1] = var255[0];
                        field1330[++Statics.field1331 - 1] = var255[1];
                    }
                    var234 = 1;
                }
            } else if (arg0 == 6618) {
                class213 var256 = new class213(field1330[--Statics.field1331]);
                class33 var257 = client.method961().method4726();
                if (var257 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                    field1330[++Statics.field1331 - 1] = -1;
                    var234 = 1;
                } else {
                    class213 var258 = var257.method290(var256.field2619, var256.field2622);
                    if (var258 == null) {
                        field1330[++Statics.field1331 - 1] = -1;
                    } else {
                        field1330[++Statics.field1331 - 1] = var258.method3554();
                    }
                    var234 = 1;
                }
            } else if (arg0 == 6619) {
                Statics.field1331 -= 2;
                int var259 = field1330[Statics.field1331];
                class213 var260 = new class213(field1330[Statics.field1331 + 1]);
                class33 var261 = client.method961().method4822(var259);
                int var262 = Statics.field341.field885;
                int var263 = (Statics.field341.field1234 >> 7) + Statics.field340;
                int var264 = (Statics.field341.field1210 >> 7) + Statics.field356;
                class213 var265 = new class213(var262, var263, var264);
                client.method961().method4878(var261, var265, var260, false);
                var234 = 1;
            } else if (arg0 == 6620) {
                Statics.field1331 -= 2;
                int var266 = field1330[Statics.field1331];
                class213 var267 = new class213(field1330[Statics.field1331 + 1]);
                method3854(var266, var267, true);
                var234 = 1;
            } else if (arg0 == 6621) {
                Statics.field1331 -= 2;
                int var268 = field1330[Statics.field1331];
                class213 var269 = new class213(field1330[Statics.field1331 + 1]);
                class33 var270 = client.method961().method4822(var268);
                if (var270 == null) {
                    field1330[++Statics.field1331 - 1] = 0;
                    var234 = 1;
                } else {
                    field1330[++Statics.field1331 - 1] = var270.method255(var269.field2620, var269.field2619, var269.field2622) ? 1 : 0;
                    var234 = 1;
                }
            } else if (arg0 == 6622) {
                field1330[++Statics.field1331 - 1] = client.method961().method4778();
                field1330[++Statics.field1331 - 1] = client.method961().method4815();
                var234 = 1;
            } else if (arg0 == 6623) {
                class213 var271 = new class213(field1330[--Statics.field1331]);
                class33 var272 = client.method961().method4722(var271.field2620, var271.field2619, var271.field2622);
                if (var272 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                } else {
                    field1330[++Statics.field1331 - 1] = var272.method260();
                }
                var234 = 1;
            } else if (arg0 == 6624) {
                client.method961().method4749(field1330[--Statics.field1331]);
                var234 = 1;
            } else if (arg0 == 6625) {
                client.method961().method4751();
                var234 = 1;
            } else if (arg0 == 6626) {
                client.method961().method4818(field1330[--Statics.field1331]);
                var234 = 1;
            } else if (arg0 == 6627) {
                client.method961().method4752();
                var234 = 1;
            } else if (arg0 == 6628) {
                boolean var273 = field1330[--Statics.field1331] == 1;
                client.method961().method4753(var273);
                var234 = 1;
            } else if (arg0 == 6629) {
                int var274 = field1330[--Statics.field1331];
                client.method961().method4754(var274);
                var234 = 1;
            } else if (arg0 == 6630) {
                int var275 = field1330[--Statics.field1331];
                client.method961().method4755(var275);
                var234 = 1;
            } else if (arg0 == 6631) {
                client.method961().method4756();
                var234 = 1;
            } else if (arg0 == 6632) {
                boolean var276 = field1330[--Statics.field1331] == 1;
                client.method961().method4757(var276);
                var234 = 1;
            } else if (arg0 == 6633) {
                Statics.field1331 -= 2;
                int var277 = field1330[Statics.field1331];
                boolean var278 = field1330[Statics.field1331 + 1] == 1;
                client.method961().method4758(var277, var278);
                var234 = 1;
            } else if (arg0 == 6634) {
                Statics.field1331 -= 2;
                int var279 = field1330[Statics.field1331];
                boolean var280 = field1330[Statics.field1331 + 1] == 1;
                client.method961().method4759(var279, var280);
                var234 = 1;
            } else if (arg0 == 6635) {
                field1330[++Statics.field1331 - 1] = client.method961().method4760() ? 1 : 0;
                var234 = 1;
            } else if (arg0 == 6636) {
                int var281 = field1330[--Statics.field1331];
                field1330[++Statics.field1331 - 1] = client.method961().method4784(var281) ? 1 : 0;
                var234 = 1;
            } else if (arg0 == 6637) {
                int var282 = field1330[--Statics.field1331];
                field1330[++Statics.field1331 - 1] = client.method961().method4762(var282) ? 1 : 0;
                var234 = 1;
            } else if (arg0 == 6638) {
                Statics.field1331 -= 2;
                int var283 = field1330[Statics.field1331];
                class213 var284 = new class213(field1330[Statics.field1331 + 1]);
                class213 var285 = client.method961().method4765(var283, var284);
                if (var285 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                } else {
                    field1330[++Statics.field1331 - 1] = var285.method3554();
                }
                var234 = 1;
            } else if (arg0 == 6639) {
                class40 var286 = client.method961().method4785();
                if (var286 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                    field1330[++Statics.field1331 - 1] = -1;
                } else {
                    field1330[++Statics.field1331 - 1] = var286.field542;
                    field1330[++Statics.field1331 - 1] = var286.field539.method3554();
                }
                var234 = 1;
            } else if (arg0 == 6640) {
                class40 var287 = client.method961().method4723();
                if (var287 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                    field1330[++Statics.field1331 - 1] = -1;
                } else {
                    field1330[++Statics.field1331 - 1] = var287.field542;
                    field1330[++Statics.field1331 - 1] = var287.field539.method3554();
                }
                var234 = 1;
            } else if (arg0 == 6693) {
                int var288 = field1330[--Statics.field1331];
                class243 var289 = Statics.field3305[var288];
                if (var289.field3299 == null) {
                    field1332[++Statics.field383 - 1] = "";
                } else {
                    field1332[++Statics.field383 - 1] = var289.field3299;
                }
                var234 = 1;
            } else if (arg0 == 6694) {
                int var290 = field1330[--Statics.field1331];
                class243 var291 = Statics.field3305[var290];
                field1330[++Statics.field1331 - 1] = var291.field3316;
                var234 = 1;
            } else if (arg0 == 6695) {
                int var292 = field1330[--Statics.field1331];
                class243 var293 = Statics.field3305[var292];
                if (var293 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                } else {
                    field1330[++Statics.field1331 - 1] = var293.field3307;
                }
                var234 = 1;
            } else if (arg0 == 6696) {
                int var294 = field1330[--Statics.field1331];
                class243 var295 = Statics.field3305[var294];
                if (var295 == null) {
                    field1330[++Statics.field1331 - 1] = -1;
                } else {
                    field1330[++Statics.field1331 - 1] = var295.field3313;
                }
                var234 = 1;
            } else if (arg0 == 6697) {
                field1330[++Statics.field1331 - 1] = Statics.field2424.field613;
                var234 = 1;
            } else if (arg0 == 6698) {
                field1330[++Statics.field1331 - 1] = Statics.field2424.field609.method3554();
                var234 = 1;
            } else if (arg0 == 6699) {
                field1330[++Statics.field1331 - 1] = Statics.field2424.field608.method3554();
                var234 = 1;
            } else {
                var234 = 2;
            }
            return var234;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("g.t(ILcq;ZI)I")
    public static int method81(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1330[--Statics.field1331];
            var4 = class217.method3680(var3);
        } else {
            var4 = arg2 ? Statics.field583 : Statics.field458;
        }
        if (arg0 == 1000) {
            Statics.field1331 -= 4;
            var4.field2664 = field1330[Statics.field1331];
            var4.field2665 = field1330[Statics.field1331 + 1];
            var4.field2660 = field1330[Statics.field1331 + 2];
            var4.field2661 = field1330[Statics.field1331 + 3];
            Statics.method951(var4);
            Statics.field2818.method1046(var4);
            if (var3 != -1 && var4.field2657 == 0) {
                client.method1557(Statics.field2647[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1331 -= 4;
            var4.field2666 = field1330[Statics.field1331];
            var4.field2667 = field1330[Statics.field1331 + 1];
            var4.field2662 = field1330[Statics.field1331 + 2];
            var4.field2663 = field1330[Statics.field1331 + 3];
            Statics.method951(var4);
            Statics.field2818.method1046(var4);
            if (var3 != -1 && var4.field2657 == 0) {
                client.method1557(Statics.field2647[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1330[--Statics.field1331] == 1;
            if (var4.field2700 != var5) {
                var4.field2700 = var5;
                Statics.method951(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2788 = field1330[--Statics.field1331] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2789 = field1330[--Statics.field1331] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bl.w(ILcq;ZI)I")
    public static int method978(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1330[--Statics.field1331];
            var4 = class217.method3680(var3);
        } else {
            var4 = arg2 ? Statics.field583 : Statics.field458;
        }
        if (arg0 == 1100) {
            Statics.field1331 -= 2;
            var4.field2779 = field1330[Statics.field1331];
            if (var4.field2779 > var4.field2767 - var4.field2670) {
                var4.field2779 = var4.field2767 - var4.field2670;
            }
            if (var4.field2779 < 0) {
                var4.field2779 = 0;
            }
            var4.field2677 = field1330[Statics.field1331 + 1];
            if (var4.field2677 > var4.field2709 - var4.field2671) {
                var4.field2677 = var4.field2709 - var4.field2671;
            }
            if (var4.field2677 < 0) {
                var4.field2677 = 0;
            }
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2761 = field1330[--Statics.field1331];
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2684 = field1330[--Statics.field1331] == 1;
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2686 = field1330[--Statics.field1331];
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2688 = field1330[--Statics.field1331];
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2690 = field1330[--Statics.field1331];
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2692 = field1330[--Statics.field1331];
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2693 = field1330[--Statics.field1331] == 1;
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2696 = 1;
            var4.field2699 = field1330[--Statics.field1331];
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1331 -= 6;
            var4.field2751 = field1330[Statics.field1331];
            var4.field2732 = field1330[Statics.field1331 + 1];
            var4.field2706 = field1330[Statics.field1331 + 2];
            var4.field2727 = field1330[Statics.field1331 + 3];
            var4.field2654 = field1330[Statics.field1331 + 4];
            var4.field2738 = field1330[Statics.field1331 + 5];
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1330[--Statics.field1331];
            if (var4.field2778 != var5) {
                var4.field2778 = var5;
                var4.field2777 = 0;
                var4.field2759 = 0;
                Statics.method951(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2712 = field1330[--Statics.field1331] == 1;
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1332[--Statics.field383];
            if (!var6.equals(var4.field2715)) {
                var4.field2715 = var6;
                Statics.method951(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2714 = field1330[--Statics.field1331];
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1331 -= 3;
            var4.field2697 = field1330[Statics.field1331];
            var4.field2719 = field1330[Statics.field1331 + 1];
            var4.field2681 = field1330[Statics.field1331 + 2];
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2737 = field1330[--Statics.field1331] == 1;
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2694 = field1330[--Statics.field1331];
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2695 = field1330[--Statics.field1331];
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2679 = field1330[--Statics.field1331] == 1;
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2791 = field1330[--Statics.field1331] == 1;
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1331 -= 2;
            var4.field2767 = field1330[Statics.field1331];
            var4.field2709 = field1330[Statics.field1331 + 1];
            Statics.method951(var4);
            if (var3 != -1 && var4.field2657 == 0) {
                client.method1557(Statics.field2647[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method180(var4.field2756, var4.field2672);
            client.field1071 = var4;
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2691 = field1330[--Statics.field1331];
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2729 = field1330[--Statics.field1331];
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2687 = field1330[--Statics.field1331];
            Statics.method951(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1330[--Statics.field1331];
            class284 var8 = (class284) Statics.method666(class284.method894(), var7);
            if (var8 != null) {
                var4.field2685 = var8;
                Statics.method951(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1330[--Statics.field1331] == 1;
            var4.field2689 = var9;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fm.z(ILcq;ZB)I")
    public static int method2733(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3680(field1330[--Statics.field1331]);
        } else {
            var3 = arg2 ? Statics.field583 : Statics.field458;
        }
        Statics.method951(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1331 -= 2;
            int var4 = field1330[Statics.field1331];
            int var5 = field1330[Statics.field1331 + 1];
            var3.field2720 = var4;
            var3.field2776 = var5;
            class257 var6 = class257.method3684(var4);
            var3.field2706 = var6.field3509;
            var3.field2727 = var6.field3510;
            var3.field2654 = var6.field3542;
            var3.field2751 = var6.field3517;
            var3.field2732 = var6.field3513;
            var3.field2738 = var6.field3512;
            if (arg0 == 1205) {
                var3.field2713 = 0;
            } else if (arg0 == 1212 | var6.field3503 == 1) {
                var3.field2713 = 1;
            } else {
                var3.field2713 = 2;
            }
            if (var3.field2710 > 0) {
                var3.field2738 = var3.field2738 * 32 / var3.field2710;
            } else if (var3.field2666 > 0) {
                var3.field2738 = var3.field2738 * 32 / var3.field2666;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2696 = 2;
            var3.field2699 = field1330[--Statics.field1331];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2696 = 3;
            var3.field2699 = Statics.field341.field864.method3597();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("al.j(ILcq;ZB)I")
    public static int method323(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3680(field1330[--Statics.field1331]);
        } else {
            var3 = arg2 ? Statics.field583 : Statics.field458;
        }
        if (arg0 == 1300) {
            int var4 = field1330[--Statics.field1331] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3638(var4, field1332[--Statics.field383]);
                return 1;
            } else {
                Statics.field383--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1331 -= 2;
            int var5 = field1330[Statics.field1331];
            int var6 = field1330[Statics.field1331 + 1];
            var3.field2730 = class217.method2792(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2653 = field1330[--Statics.field1331] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2731 = field1330[--Statics.field1331];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2718 = field1330[--Statics.field1331];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2728 = field1332[--Statics.field383];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2734 = field1332[--Statics.field383];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2790 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dw.c(ILcq;ZI)I")
    public static int method2205(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3680(field1330[--Statics.field1331]);
        } else {
            var3 = arg2 ? Statics.field583 : Statics.field458;
        }
        String var4 = field1332[--Statics.field383];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1330[--Statics.field1331];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1330[--Statics.field1331];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1332[--Statics.field383];
            } else {
                var7[var8] = Integer.valueOf(field1330[--Statics.field1331]);
            }
        }
        int var9 = field1330[--Statics.field1331];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2771 = var7;
        } else if (arg0 == 1401) {
            var3.field2740 = var7;
        } else if (arg0 == 1402) {
            var3.field2739 = var7;
        } else if (arg0 == 1403) {
            var3.field2708 = var7;
        } else if (arg0 == 1404) {
            var3.field2743 = var7;
        } else if (arg0 == 1405) {
            var3.field2744 = var7;
        } else if (arg0 == 1406) {
            var3.field2747 = var7;
        } else if (arg0 == 1407) {
            var3.field2748 = var7;
            var3.field2749 = var5;
        } else if (arg0 == 1408) {
            var3.field2754 = var7;
        } else if (arg0 == 1409) {
            var3.field2658 = var7;
        } else if (arg0 == 1410) {
            var3.field2745 = var7;
        } else if (arg0 == 1411) {
            var3.field2702 = var7;
        } else if (arg0 == 1412) {
            var3.field2704 = var7;
        } else if (arg0 == 1414) {
            var3.field2750 = var7;
            var3.field2783 = var5;
        } else if (arg0 == 1415) {
            var3.field2752 = var7;
            var3.field2753 = var5;
        } else if (arg0 == 1416) {
            var3.field2764 = var7;
        } else if (arg0 == 1417) {
            var3.field2673 = var7;
        } else if (arg0 == 1418) {
            var3.field2757 = var7;
        } else if (arg0 == 1419) {
            var3.field2758 = var7;
        } else if (arg0 == 1420) {
            var3.field2768 = var7;
        } else if (arg0 == 1421) {
            var3.field2741 = var7;
        } else if (arg0 == 1422) {
            var3.field2781 = var7;
        } else if (arg0 == 1423) {
            var3.field2762 = var7;
        } else if (arg0 == 1424) {
            var3.field2763 = var7;
        } else if (arg0 == 1425) {
            var3.field2765 = var7;
        } else if (arg0 == 1426) {
            var3.field2766 = var7;
        } else if (arg0 == 1427) {
            var3.field2707 = var7;
        } else {
            return 2;
        }
        var3.field2735 = true;
        return 1;
    }

    @ObfuscatedName("ei.o(ILcq;ZB)I")
    public static int method2317(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method3680(field1330[--Statics.field1331]);
        } else {
            var3 = arg2 ? Statics.field583 : Statics.field458;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1337 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2707 == null) {
            return 0;
        } else {
            class70 var4 = new class70();
            var4.field823 = var3;
            var4.field822 = var3.field2707;
            var4.field831 = field1337 + 1;
            client.field1106.method3270(var4);
            return 1;
        }
    }

    @ObfuscatedName("jn.q(ILcq;ZI)I")
    public static int method4490(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1332[--Statics.field383];
            Statics.method19(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1331 -= 2;
            client.method48(Statics.field341, field1330[Statics.field1331], field1330[Statics.field1331 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            client.method4472();
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1332[--Statics.field383];
            int var5 = 0;
            if (class271.method2693(var4)) {
                var5 = class271.method1856(var4);
            }
            client.field948.method3054(192);
            client.field948.method2798(var5);
            return 1;
        } else if (arg0 == 3105) {
            String var6 = field1332[--Statics.field383];
            client.field948.method3054(98);
            client.field948.method2961(var6.length() + 1);
            client.field948.method2902(var6);
            return 1;
        } else if (arg0 == 3106) {
            String var7 = field1332[--Statics.field383];
            client.field948.method3054(141);
            client.field948.method2961(var7.length() + 1);
            client.field948.method2902(var7);
            return 1;
        } else if (arg0 == 3107) {
            int var8 = field1330[--Statics.field1331];
            String var9 = field1332[--Statics.field383];
            int var10 = class97.field1488;
            int[] var11 = class97.field1492;
            boolean var12 = false;
            for (int var13 = 0; var13 < var10; var13++) {
                class75 var14 = client.field1049[var11[var13]];
                if (var14 != null && Statics.field341 != var14 && var14.field873 != null && var14.field873.equalsIgnoreCase(var9)) {
                    if (var8 == 1) {
                        client.field948.method3054(187);
                        client.field948.method2844(var11[var13]);
                        client.field948.method2836(0);
                    } else if (var8 == 4) {
                        client.field948.method3054(90);
                        client.field948.method2836(0);
                        client.field948.method2842(var11[var13]);
                    } else if (var8 == 6) {
                        client.field948.method3054(196);
                        client.field948.method2957(var11[var13]);
                        client.field948.method2846(0);
                    } else if (var8 == 7) {
                        client.field948.method3054(165);
                        client.field948.method2842(var11[var13]);
                        client.field948.method2961(0);
                    }
                    var12 = true;
                    break;
                }
            }
            if (!var12) {
                Statics.method19(4, "", class226.field3012 + var9);
            }
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1331 -= 3;
            int var15 = field1330[Statics.field1331];
            int var16 = field1330[Statics.field1331 + 1];
            int var17 = field1330[Statics.field1331 + 2];
            class217 var18 = class217.method3680(var17);
            client.method940(var18, var15, var16);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1331 -= 2;
            int var19 = field1330[Statics.field1331];
            int var20 = field1330[Statics.field1331 + 1];
            class217 var21 = arg2 ? Statics.field583 : Statics.field458;
            client.method940(var21, var19, var20);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field2846 = field1330[--Statics.field1331] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1330[++Statics.field1331 - 1] = Statics.field1482.field1300 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1482.field1300 = field1330[--Statics.field1331] == 1;
            class82.method17();
            return 1;
        } else if (arg0 == 3113) {
            String var22 = field1332[--Statics.field383];
            boolean var23 = field1330[--Statics.field1331] == 1;
            class57.method155(var22, var23, false);
            return 1;
        } else if (arg0 == 3115) {
            int var24 = field1330[--Statics.field1331];
            client.field948.method3054(193);
            client.field948.method2957(var24);
            return 1;
        } else if (arg0 == 3116) {
            int var25 = field1330[--Statics.field1331];
            Statics.field383 -= 2;
            String var26 = field1332[Statics.field383];
            String var27 = field1332[Statics.field383 + 1];
            if (var26.length() > 500) {
                return 1;
            } else if (var27.length() > 500) {
                return 1;
            } else {
                client.field948.method3054(49);
                client.field948.method2957(1 + class174.method954(var26) + class174.method954(var27));
                client.field948.method2902(var27);
                client.field948.method2973(var25);
                client.field948.method2902(var26);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field990 = field1330[--Statics.field1331] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("z.n(ILcq;ZB)I")
    public static int method15(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1330[++Statics.field1331 - 1] = client.field960;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1331 -= 2;
            int var3 = field1330[Statics.field1331];
            int var4 = field1330[Statics.field1331 + 1];
            int[] var5 = field1330;
            int var6 = ++Statics.field1331 - 1;
            class64 var7 = (class64) class64.field776.method3190((long) var3);
            int var8;
            if (var7 == null) {
                var8 = -1;
            } else if (var4 >= 0 && var4 < var7.field773.length) {
                var8 = var7.field773[var4];
            } else {
                var8 = -1;
            }
            var5[var6] = var8;
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1331 -= 2;
            int var9 = field1330[Statics.field1331];
            int var10 = field1330[Statics.field1331 + 1];
            int[] var11 = field1330;
            int var12 = ++Statics.field1331 - 1;
            class64 var13 = (class64) class64.field776.method3190((long) var9);
            int var14;
            if (var13 == null) {
                var14 = 0;
            } else if (var10 >= 0 && var10 < var13.field774.length) {
                var14 = var13.field774[var10];
            } else {
                var14 = 0;
            }
            var11[var12] = var14;
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1331 -= 2;
            int var15 = field1330[Statics.field1331];
            int var16 = field1330[Statics.field1331 + 1];
            field1330[++Statics.field1331 - 1] = class64.method541(var15, var16);
            return 1;
        } else if (arg0 == 3304) {
            int var17 = field1330[--Statics.field1331];
            int[] var18 = field1330;
            int var19 = ++Statics.field1331 - 1;
            class241 var20 = (class241) class241.field3287.method3182((long) var17);
            class241 var21;
            if (var20 == null) {
                byte[] var22 = Statics.field3289.method3720(5, var17);
                class241 var23 = new class241();
                if (var22 != null) {
                    var23.method3849(new class174(var22));
                }
                class241.field3287.method3179(var23, (long) var17);
                var21 = var23;
            } else {
                var21 = var20;
            }
            var18[var19] = var21.field3288;
            return 1;
        } else if (arg0 == 3305) {
            int var24 = field1330[--Statics.field1331];
            field1330[++Statics.field1331 - 1] = client.field1150[var24];
            return 1;
        } else if (arg0 == 3306) {
            int var25 = field1330[--Statics.field1331];
            field1330[++Statics.field1331 - 1] = client.field1013[var25];
            return 1;
        } else if (arg0 == 3307) {
            int var26 = field1330[--Statics.field1331];
            field1330[++Statics.field1331 - 1] = client.field1043[var26];
            return 1;
        } else if (arg0 == 3308) {
            int var27 = Statics.field890;
            int var28 = (Statics.field341.field1234 >> 7) + Statics.field340;
            int var29 = (Statics.field341.field1210 >> 7) + Statics.field356;
            field1330[++Statics.field1331 - 1] = (var27 << 28) + (var28 << 14) + var29;
            return 1;
        } else if (arg0 == 3309) {
            int var30 = field1330[--Statics.field1331];
            field1330[++Statics.field1331 - 1] = var30 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var31 = field1330[--Statics.field1331];
            field1330[++Statics.field1331 - 1] = var31 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var32 = field1330[--Statics.field1331];
            field1330[++Statics.field1331 - 1] = var32 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1330[++Statics.field1331 - 1] = client.field906 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1331 -= 2;
            int var33 = field1330[Statics.field1331] + 32768;
            int var34 = field1330[Statics.field1331 + 1];
            int[] var35 = field1330;
            int var36 = ++Statics.field1331 - 1;
            class64 var37 = (class64) class64.field776.method3190((long) var33);
            int var38;
            if (var37 == null) {
                var38 = -1;
            } else if (var34 >= 0 && var34 < var37.field773.length) {
                var38 = var37.field773[var34];
            } else {
                var38 = -1;
            }
            var35[var36] = var38;
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1331 -= 2;
            int var39 = field1330[Statics.field1331] + 32768;
            int var40 = field1330[Statics.field1331 + 1];
            int[] var41 = field1330;
            int var42 = ++Statics.field1331 - 1;
            class64 var43 = (class64) class64.field776.method3190((long) var39);
            int var44;
            if (var43 == null) {
                var44 = 0;
            } else if (var40 >= 0 && var40 < var43.field774.length) {
                var44 = var43.field774[var40];
            } else {
                var44 = 0;
            }
            var41[var42] = var44;
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1331 -= 2;
            int var45 = field1330[Statics.field1331] + 32768;
            int var46 = field1330[Statics.field1331 + 1];
            field1330[++Statics.field1331 - 1] = class64.method541(var45, var46);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field1068 >= 2) {
                field1330[++Statics.field1331 - 1] = client.field1068;
            } else {
                field1330[++Statics.field1331 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1330[++Statics.field1331 - 1] = client.field920;
            return 1;
        } else if (arg0 == 3318) {
            field1330[++Statics.field1331 - 1] = client.field902;
            return 1;
        } else if (arg0 == 3321) {
            field1330[++Statics.field1331 - 1] = client.field1072;
            return 1;
        } else if (arg0 == 3322) {
            field1330[++Statics.field1331 - 1] = client.field1073;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field1076) {
                field1330[++Statics.field1331 - 1] = 1;
            } else {
                field1330[++Statics.field1331 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1330[++Statics.field1331 - 1] = client.field903;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1331 -= 4;
            int var47 = field1330[Statics.field1331];
            int var48 = field1330[Statics.field1331 + 1];
            int var49 = field1330[Statics.field1331 + 2];
            int var50 = field1330[Statics.field1331 + 3];
            int var51 = (var48 << 14) + var47;
            int var52 = (var49 << 28) + var51;
            int var53 = var50 + var52;
            field1330[++Statics.field1331 - 1] = var53;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bs.a(ILcq;ZI)I")
    public static int method963(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1331 -= 2;
            int var3 = field1330[Statics.field1331];
            int var4 = field1330[Statics.field1331 + 1];
            class254 var5 = class254.method3038(var3);
            if (var5.field3414 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3412; var6++) {
                if (var5.field3406[var6] == var4) {
                    field1332[++Statics.field383 - 1] = var5.field3415[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1332[++Statics.field383 - 1] = var5.field3410;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1331 -= 4;
            int var7 = field1330[Statics.field1331];
            int var8 = field1330[Statics.field1331 + 1];
            int var9 = field1330[Statics.field1331 + 2];
            int var10 = field1330[Statics.field1331 + 3];
            class254 var11 = class254.method3038(var9);
            if (var11.field3408 != var7 || var11.field3414 != var8) {
                if (var8 == 115) {
                    field1332[++Statics.field383 - 1] = "null";
                } else {
                    field1330[++Statics.field1331 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3412; var12++) {
                if (var11.field3406[var12] == var10) {
                    if (var8 == 115) {
                        field1332[++Statics.field383 - 1] = var11.field3415[var12];
                    } else {
                        field1330[++Statics.field1331 - 1] = var11.field3411[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1332[++Statics.field383 - 1] = var11.field3410;
                } else {
                    field1330[++Statics.field1331 - 1] = var11.field3413;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gn.g(ILcq;ZI)I")
    public static int method3450(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (client.field1173 == 0) {
                field1330[++Statics.field1331 - 1] = -2;
            } else if (client.field1173 == 1) {
                field1330[++Statics.field1331 - 1] = -1;
            } else {
                field1330[++Statics.field1331 - 1] = client.field1172;
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1330[--Statics.field1331];
            if (client.field1173 == 2 && var3 < client.field1172) {
                field1332[++Statics.field383 - 1] = client.field935[var3].field797;
                field1332[++Statics.field383 - 1] = client.field935[var3].field795;
            } else {
                field1332[++Statics.field383 - 1] = "";
                field1332[++Statics.field383 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var4 = field1330[--Statics.field1331];
            if (client.field1173 == 2 && var4 < client.field1172) {
                field1330[++Statics.field1331 - 1] = client.field935[var4].field792;
            } else {
                field1330[++Statics.field1331 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var5 = field1330[--Statics.field1331];
            if (client.field1173 == 2 && var5 < client.field1172) {
                field1330[++Statics.field1331 - 1] = client.field935[var5].field794;
            } else {
                field1330[++Statics.field1331 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var6 = field1332[--Statics.field383];
            int var7 = field1330[--Statics.field1331];
            client.method2780(var6, var7);
            return 1;
        } else if (arg0 == 3605) {
            String var8 = field1332[--Statics.field383];
            if (var8 != null) {
                if ((client.field1172 < 200 || client.field1177 == 1) && client.field1172 < 400) {
                    String var9 = class268.method1830(var8, Statics.field483);
                    if (var9 != null) {
                        int var10 = 0;
                        while (true) {
                            if (var10 >= client.field1172) {
                                for (int var14 = 0; var14 < client.field1176; var14++) {
                                    class71 var15 = client.field1149[var14];
                                    String var16 = class268.method1830(var15.field838, Statics.field483);
                                    if (var16 != null && var16.equals(var9)) {
                                        Statics.method19(30, "", class226.field3035 + var8 + class226.field3036);
                                        return 1;
                                    }
                                    if (var15.field837 != null) {
                                        String var17 = class268.method1830(var15.field837, Statics.field483);
                                        if (var17 != null && var17.equals(var9)) {
                                            Statics.method19(30, "", class226.field3035 + var8 + class226.field3036);
                                            return 1;
                                        }
                                    }
                                }
                                if (class268.method1830(Statics.field341.field873, Statics.field483).equals(var9)) {
                                    Statics.method19(30, "", class226.field3033);
                                } else {
                                    client.field948.method3054(186);
                                    client.field948.method2961(class174.method954(var8));
                                    client.field948.method2902(var8);
                                }
                                break;
                            }
                            class66 var11 = client.field935[var10];
                            String var12 = class268.method1830(var11.field797, Statics.field483);
                            if (var12 != null && var12.equals(var9)) {
                                Statics.method19(30, "", var8 + class226.field3030);
                                break;
                            }
                            if (var11.field795 != null) {
                                String var13 = class268.method1830(var11.field795, Statics.field483);
                                if (var13 != null && var13.equals(var9)) {
                                    Statics.method19(30, "", var8 + class226.field3030);
                                    break;
                                }
                            }
                            var10++;
                        }
                    }
                } else {
                    Statics.method19(30, "", class226.field2940);
                }
            }
            return 1;
        } else if (arg0 == 3606) {
            String var18 = field1332[--Statics.field383];
            if (var18 != null) {
                String var19 = class268.method1830(var18, Statics.field483);
                if (var19 != null) {
                    for (int var20 = 0; var20 < client.field1172; var20++) {
                        class66 var21 = client.field935[var20];
                        String var22 = var21.field797;
                        String var23 = class268.method1830(var22, Statics.field483);
                        if (class278.method4442(var18, var19, var22, var23)) {
                            client.field1172--;
                            for (int var24 = var20; var24 < client.field1172; var24++) {
                                client.field935[var24] = client.field935[var24 + 1];
                            }
                            client.field1100 = client.field1092;
                            client.field948.method3054(22);
                            client.field948.method2961(class174.method954(var18));
                            client.field948.method2902(var18);
                            break;
                        }
                    }
                }
            }
            return 1;
        } else if (arg0 == 3607) {
            String var25 = field1332[--Statics.field383];
            client.method2134(var25, false);
            return 1;
        } else if (arg0 == 3608) {
            String var26 = field1332[--Statics.field383];
            client.method3549(var26);
            return 1;
        } else if (arg0 == 3609) {
            String var27 = field1332[--Statics.field383];
            class231[] var28 = new class231[] { class231.field3181, class231.field3179, class231.field3188, class231.field3183, class231.field3180, class231.field3182 };
            class231[] var29 = var28;
            for (int var30 = 0; var30 < var29.length; var30++) {
                class231 var31 = var29[var30];
                if (var31.field3185 != -1 && var27.startsWith(class89.method672(var31.field3185))) {
                    var27 = var27.substring(6 + Integer.toString(var31.field3185).length());
                    break;
                }
            }
            field1330[++Statics.field1331 - 1] = client.method2729(var27, false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (client.field1132 == null) {
                field1332[++Statics.field383 - 1] = "";
            } else {
                field1332[++Statics.field383 - 1] = class269.method3(client.field1132);
            }
            return 1;
        } else if (arg0 == 3612) {
            if (client.field1132 == null) {
                field1330[++Statics.field1331 - 1] = 0;
            } else {
                field1330[++Statics.field1331 - 1] = Statics.field314;
            }
            return 1;
        } else if (arg0 == 3613) {
            int var32 = field1330[--Statics.field1331];
            if (client.field1132 == null || var32 >= Statics.field314) {
                field1332[++Statics.field383 - 1] = "";
            } else {
                field1332[++Statics.field383 - 1] = Statics.field2433[var32].field900;
            }
            return 1;
        } else if (arg0 == 3614) {
            int var33 = field1330[--Statics.field1331];
            if (client.field1132 == null || var33 >= Statics.field314) {
                field1330[++Statics.field1331 - 1] = 0;
            } else {
                field1330[++Statics.field1331 - 1] = Statics.field2433[var33].field894;
            }
            return 1;
        } else if (arg0 == 3615) {
            int var34 = field1330[--Statics.field1331];
            if (client.field1132 == null || var34 >= Statics.field314) {
                field1330[++Statics.field1331 - 1] = 0;
            } else {
                field1330[++Statics.field1331 - 1] = Statics.field2433[var34].field896;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1330[++Statics.field1331 - 1] = Statics.field360;
            return 1;
        } else if (arg0 == 3617) {
            String var35 = field1332[--Statics.field383];
            client.method1267(var35);
            return 1;
        } else if (arg0 == 3618) {
            field1330[++Statics.field1331 - 1] = Statics.field3148;
            return 1;
        } else if (arg0 == 3619) {
            String var36 = field1332[--Statics.field383];
            client.method1487(var36);
            return 1;
        } else if (arg0 == 3620) {
            client.method987();
            return 1;
        } else if (arg0 == 3621) {
            if (client.field1173 == 0) {
                field1330[++Statics.field1331 - 1] = -1;
            } else {
                field1330[++Statics.field1331 - 1] = client.field1176;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var37 = field1330[--Statics.field1331];
            if (client.field1173 == 0 || var37 >= client.field1176) {
                field1332[++Statics.field383 - 1] = "";
                field1332[++Statics.field383 - 1] = "";
            } else {
                field1332[++Statics.field383 - 1] = client.field1149[var37].field838;
                field1332[++Statics.field383 - 1] = client.field1149[var37].field837;
            }
            return 1;
        } else if (arg0 == 3623) {
            String var38 = field1332[--Statics.field383];
            if (var38.startsWith(class89.method672(0)) || var38.startsWith(class89.method672(1))) {
                var38 = var38.substring(7);
            }
            field1330[++Statics.field1331 - 1] = client.method1501(var38) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var39 = field1330[--Statics.field1331];
            if (Statics.field2433 == null || var39 >= Statics.field314 || !Statics.field2433[var39].field900.equalsIgnoreCase(Statics.field341.field873)) {
                field1330[++Statics.field1331 - 1] = 0;
            } else {
                field1330[++Statics.field1331 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (client.field965 == null) {
                field1332[++Statics.field383 - 1] = "";
            } else {
                field1332[++Statics.field383 - 1] = class269.method3(client.field965);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("o.v(ILcq;ZI)I")
    public static int method50(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1330[--Statics.field1331];
            field1330[++Statics.field1331 - 1] = client.field1179[var3].method105();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1330[--Statics.field1331];
            field1330[++Statics.field1331 - 1] = client.field1179[var4].field307;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1330[--Statics.field1331];
            field1330[++Statics.field1331 - 1] = client.field1179[var5].field308;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1330[--Statics.field1331];
            field1330[++Statics.field1331 - 1] = client.field1179[var6].field315;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1330[--Statics.field1331];
            field1330[++Statics.field1331 - 1] = client.field1179[var7].field310;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1330[--Statics.field1331];
            field1330[++Statics.field1331 - 1] = client.field1179[var8].field316;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1330[--Statics.field1331];
            int var10 = client.field1179[var9].method104();
            field1330[++Statics.field1331 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1330[--Statics.field1331];
            int var12 = client.field1179[var11].method104();
            field1330[++Statics.field1331 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1330[--Statics.field1331];
            int var14 = client.field1179[var13].method104();
            field1330[++Statics.field1331 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1330[--Statics.field1331];
            int var16 = client.field1179[var15].method104();
            field1330[++Statics.field1331 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1330[--Statics.field1331] == 1;
            if (Statics.field1182 != null) {
                Statics.field1182.method70(class14.field286, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1330[--Statics.field1331] == 1;
            if (Statics.field1182 != null) {
                Statics.field1182.method70(class14.field284, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1331 -= 2;
            boolean var19 = field1330[Statics.field1331] == 1;
            boolean var20 = field1330[Statics.field1331 + 1] == 1;
            if (Statics.field1182 != null) {
                Statics.field1182.method70(new class96(var20), var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1330[--Statics.field1331] == 1;
            if (Statics.field1182 != null) {
                Statics.field1182.method70(class14.field283, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1330[--Statics.field1331] == 1;
            if (Statics.field1182 != null) {
                Statics.field1182.method70(class14.field289, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1330[++Statics.field1331 - 1] = Statics.field1182 == null ? 0 : Statics.field1182.field288.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1330[--Statics.field1331];
            class15 var24 = (class15) Statics.field1182.field288.get(var23);
            field1330[++Statics.field1331 - 1] = var24.field298;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1330[--Statics.field1331];
            class15 var26 = (class15) Statics.field1182.field288.get(var25);
            field1332[++Statics.field383 - 1] = var26.method72();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1330[--Statics.field1331];
            class15 var28 = (class15) Statics.field1182.field288.get(var27);
            field1332[++Statics.field383 - 1] = var28.method71();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1330[--Statics.field1331];
            class15 var30 = (class15) Statics.field1182.field288.get(var29);
            long var31 = class176.method2747() - Statics.field1922 - var30.field292;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1332[++Statics.field383 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1330[--Statics.field1331];
            class15 var38 = (class15) Statics.field1182.field288.get(var37);
            field1330[++Statics.field1331 - 1] = var38.field293.field315;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1330[--Statics.field1331];
            class15 var40 = (class15) Statics.field1182.field288.get(var39);
            field1330[++Statics.field1331 - 1] = var40.field293.field308;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1330[--Statics.field1331];
            class15 var42 = (class15) Statics.field1182.field288.get(var41);
            field1330[++Statics.field1331 - 1] = var42.field293.field307;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("el.s(ILcq;ZI)I")
    public static int method2580(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1331 -= 2;
            int var3 = field1330[Statics.field1331];
            int var4 = field1330[Statics.field1331 + 1];
            field1330[++Statics.field1331 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1331 -= 2;
            int var5 = field1330[Statics.field1331];
            int var6 = field1330[Statics.field1331 + 1];
            field1330[++Statics.field1331 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1331 -= 2;
            int var7 = field1330[Statics.field1331];
            int var8 = field1330[Statics.field1331 + 1];
            field1330[++Statics.field1331 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1331 -= 2;
            int var9 = field1330[Statics.field1331];
            int var10 = field1330[Statics.field1331 + 1];
            field1330[++Statics.field1331 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1330[--Statics.field1331];
            field1330[++Statics.field1331 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1330[--Statics.field1331];
            field1330[++Statics.field1331 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1331 -= 5;
            int var13 = field1330[Statics.field1331];
            int var14 = field1330[Statics.field1331 + 1];
            int var15 = field1330[Statics.field1331 + 2];
            int var16 = field1330[Statics.field1331 + 3];
            int var17 = field1330[Statics.field1331 + 4];
            field1330[++Statics.field1331 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1331 -= 2;
            int var18 = field1330[Statics.field1331];
            int var19 = field1330[Statics.field1331 + 1];
            field1330[++Statics.field1331 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1331 -= 2;
            int var20 = field1330[Statics.field1331];
            int var21 = field1330[Statics.field1331 + 1];
            field1330[++Statics.field1331 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1331 -= 2;
            int var22 = field1330[Statics.field1331];
            int var23 = field1330[Statics.field1331 + 1];
            field1330[++Statics.field1331 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1331 -= 2;
            int var24 = field1330[Statics.field1331];
            int var25 = field1330[Statics.field1331 + 1];
            field1330[++Statics.field1331 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1331 -= 2;
            int var26 = field1330[Statics.field1331];
            int var27 = field1330[Statics.field1331 + 1];
            field1330[++Statics.field1331 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1331 -= 2;
            int var28 = field1330[Statics.field1331];
            int var29 = field1330[Statics.field1331 + 1];
            if (var28 == 0) {
                field1330[++Statics.field1331 - 1] = 0;
            } else {
                field1330[++Statics.field1331 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1331 -= 2;
            int var30 = field1330[Statics.field1331];
            int var31 = field1330[Statics.field1331 + 1];
            if (var30 == 0) {
                field1330[++Statics.field1331 - 1] = 0;
            } else if (var31 == 0) {
                field1330[++Statics.field1331 - 1] = Integer.MAX_VALUE;
            } else {
                field1330[++Statics.field1331 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1331 -= 2;
            int var32 = field1330[Statics.field1331];
            int var33 = field1330[Statics.field1331 + 1];
            field1330[++Statics.field1331 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1331 -= 2;
            int var34 = field1330[Statics.field1331];
            int var35 = field1330[Statics.field1331 + 1];
            field1330[++Statics.field1331 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1331 -= 3;
            long var36 = (long) field1330[Statics.field1331];
            long var38 = (long) field1330[Statics.field1331 + 1];
            long var40 = (long) field1330[Statics.field1331 + 2];
            field1330[++Statics.field1331 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("q.k(ILcq;ZI)I")
    public static int method51(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field958 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bq.r(II)V")
    public static void method953(int arg0) {
        if (arg0 == -1 || !class217.method892(arg0)) {
            return;
        }
        class217[] var1 = Statics.field2647[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3.field2736 != null) {
                class70 var4 = new class70();
                var4.field823 = var3;
                var4.field822 = var3.field2736;
                method616(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("it.l(ILhg;ZI)V")
    public static void method3854(int arg0, class213 arg1, boolean arg2) {
        class33 var3 = client.method961().method4822(arg0);
        int var4 = Statics.field341.field885;
        int var5 = (Statics.field341.field1234 >> 7) + Statics.field340;
        int var6 = (Statics.field341.field1210 >> 7) + Statics.field356;
        class213 var7 = new class213(var4, var5, var6);
        client.method961().method4878(var3, var7, arg1, arg2);
    }
}
