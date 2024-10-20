package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cc")
public class class83 {

    @ObfuscatedName("cc.o")
    public static int[] field1347 = new int[5];

    @ObfuscatedName("cc.n")
    public static int[][] field1352 = new int[5][5000];

    @ObfuscatedName("cc.q")
    public static int[] field1349 = new int[1000];

    @ObfuscatedName("cc.k")
    public static String[] field1348 = new String[1000];

    @ObfuscatedName("cc.d")
    public static int field1351 = 0;

    @ObfuscatedName("cc.l")
    public static class63[] field1353 = new class63[50];

    @ObfuscatedName("cc.v")
    public static Calendar field1344 = Calendar.getInstance();

    @ObfuscatedName("cc.c")
    public static final String[] field1354 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cc.u")
    public static int field1355 = 0;

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ek.i(Lbm;I)V")
    public static void method2765(class70 arg0) {
        method260(arg0, 200000);
    }

    @ObfuscatedName("ad.j(Lbm;IB)V")
    public static void method260(class70 arg0, int arg1) {
        Object[] var2 = arg0.field865;
        class221 var3 = arg0.field868;
        boolean var4 = class221.field2797 == var3 || class221.field2800 == var3 || class221.field2799 == var3 || class221.field2810 == var3 || class221.field2801 == var3 || class221.field2802 == var3 || class221.field2804 == var3 || class221.field2798 == var3;
        class99 var26;
        if (var4) {
            Statics.field1544 = (class48) var2[0];
            class244 var5 = Statics.field3295[Statics.field1544.field614];
            class221 var6 = arg0.field868;
            int var7 = var5.field3297;
            int var8 = var5.field3314;
            int var9 = class226.method193(var7, var6);
            class99 var10 = (class99) class99.field1547.method3347((long) (var9 << 16));
            class99 var11;
            if (var10 == null) {
                String var12 = String.valueOf(var9);
                int var13 = Statics.field837.method3840(var12);
                if (var13 == -1) {
                    var11 = null;
                } else {
                    label565: {
                        byte[] var14 = Statics.field837.method3898(var13);
                        if (var14 != null) {
                            if (var14.length <= 1) {
                                var11 = null;
                                break label565;
                            }
                            class99 var15 = class99.method2757(var14);
                            if (var15 != null) {
                                class99.field1547.method3346(var15, (long) (var9 << 16));
                                var11 = var15;
                                break label565;
                            }
                        }
                        var11 = null;
                    }
                }
            } else {
                var11 = var10;
            }
            class99 var17;
            if (var11 == null) {
                int var18 = class226.method2807(var8, var6);
                class99 var19 = (class99) class99.field1547.method3347((long) (var18 << 16));
                class99 var20;
                if (var19 == null) {
                    String var21 = String.valueOf(var18);
                    int var22 = Statics.field837.method3840(var21);
                    if (var22 == -1) {
                        var20 = null;
                    } else {
                        label496: {
                            byte[] var23 = Statics.field837.method3898(var22);
                            if (var23 != null) {
                                if (var23.length <= 1) {
                                    var20 = null;
                                    break label496;
                                }
                                class99 var24 = class99.method2757(var23);
                                if (var24 != null) {
                                    class99.field1547.method3346(var24, (long) (var18 << 16));
                                    var20 = var24;
                                    break label496;
                                }
                            }
                            var20 = null;
                        }
                    }
                } else {
                    var20 = var19;
                }
                if (var20 == null) {
                    var17 = null;
                } else {
                    var17 = var20;
                }
            } else {
                var17 = var11;
            }
            var26 = var17;
        } else {
            int var27 = (Integer) var2[0];
            class99 var28 = (class99) class99.field1547.method3347((long) var27);
            class99 var29;
            if (var28 == null) {
                byte[] var30 = Statics.field837.method3824(var27, 0);
                if (var30 == null) {
                    var29 = null;
                } else {
                    class99 var31 = class99.method2757(var30);
                    class99.field1547.method3346(var31, (long) var27);
                    var29 = var31;
                }
            } else {
                var29 = var28;
            }
            var26 = var29;
        }
        if (var26 == null) {
            return;
        }
        Statics.field871 = 0;
        Statics.field2342 = 0;
        int var32 = -1;
        int[] var33 = var26.field1539;
        int[] var34 = var26.field1540;
        byte var35 = -1;
        field1351 = 0;
        try {
            Statics.field1346 = new int[var26.field1548];
            int var36 = 0;
            Statics.field2322 = new String[var26.field1546];
            int var37 = 0;
            for (int var38 = 1; var38 < var2.length; var38++) {
                if (var2[var38] instanceof Integer) {
                    int var39 = (Integer) var2[var38];
                    if (var39 == -2147483647) {
                        var39 = arg0.field860;
                    }
                    if (var39 == -2147483646) {
                        var39 = arg0.field861;
                    }
                    if (var39 == -2147483645) {
                        var39 = arg0.field859 == null ? -1 : arg0.field859.field2659;
                    }
                    if (var39 == -2147483644) {
                        var39 = arg0.field862;
                    }
                    if (var39 == -2147483643) {
                        var39 = arg0.field859 == null ? -1 : arg0.field859.field2744;
                    }
                    if (var39 == -2147483642) {
                        var39 = arg0.field863 == null ? -1 : arg0.field863.field2659;
                    }
                    if (var39 == -2147483641) {
                        var39 = arg0.field863 == null ? -1 : arg0.field863.field2744;
                    }
                    if (var39 == -2147483640) {
                        var39 = arg0.field857;
                    }
                    if (var39 == -2147483639) {
                        var39 = arg0.field858;
                    }
                    Statics.field1346[var36++] = var39;
                } else if (var2[var38] instanceof String) {
                    String var40 = (String) var2[var38];
                    if (var40.equals("event_opbase")) {
                        var40 = arg0.field866;
                    }
                    Statics.field2322[var37++] = var40;
                }
            }
            int var41 = 0;
            field1355 = arg0.field864;
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
                                                                                                                label303: while (true) {
                                                                                                                    var41++;
                                                                                                                    if (var41 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var32++;
                                                                                                                    int var96 = var33[var32];
                                                                                                                    if (var96 >= 100) {
                                                                                                                        boolean var90;
                                                                                                                        if (var26.field1540[var32] == 1) {
                                                                                                                            var90 = true;
                                                                                                                        } else {
                                                                                                                            var90 = false;
                                                                                                                        }
                                                                                                                        int var91 = method250(var96, var26, var90);
                                                                                                                        switch(var91) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var96 == 0) {
                                                                                                                        field1349[++Statics.field871 - 1] = var34[var32];
                                                                                                                    } else if (var96 == 1) {
                                                                                                                        int var42 = var34[var32];
                                                                                                                        field1349[++Statics.field871 - 1] = class213.field2609[var42];
                                                                                                                    } else if (var96 == 2) {
                                                                                                                        int var43 = var34[var32];
                                                                                                                        class213.field2609[var43] = field1349[--Statics.field871];
                                                                                                                        client.method261(var43);
                                                                                                                    } else if (var96 == 3) {
                                                                                                                        field1348[++Statics.field2342 - 1] = var26.field1541[var32];
                                                                                                                    } else if (var96 == 6) {
                                                                                                                        var32 += var34[var32];
                                                                                                                    } else if (var96 == 7) {
                                                                                                                        Statics.field871 -= 2;
                                                                                                                        if (field1349[Statics.field871] != field1349[Statics.field871 + 1]) {
                                                                                                                            var32 += var34[var32];
                                                                                                                        }
                                                                                                                    } else if (var96 == 8) {
                                                                                                                        Statics.field871 -= 2;
                                                                                                                        if (field1349[Statics.field871] == field1349[Statics.field871 + 1]) {
                                                                                                                            var32 += var34[var32];
                                                                                                                        }
                                                                                                                    } else if (var96 == 9) {
                                                                                                                        Statics.field871 -= 2;
                                                                                                                        if (field1349[Statics.field871] < field1349[Statics.field871 + 1]) {
                                                                                                                            var32 += var34[var32];
                                                                                                                        }
                                                                                                                    } else if (var96 == 10) {
                                                                                                                        Statics.field871 -= 2;
                                                                                                                        if (field1349[Statics.field871] > field1349[Statics.field871 + 1]) {
                                                                                                                            var32 += var34[var32];
                                                                                                                        }
                                                                                                                    } else if (var96 == 21) {
                                                                                                                        if (field1351 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var44 = field1353[--field1351];
                                                                                                                        var26 = var44.field781;
                                                                                                                        var33 = var26.field1539;
                                                                                                                        var34 = var26.field1540;
                                                                                                                        var32 = var44.field782;
                                                                                                                        Statics.field1346 = var44.field783;
                                                                                                                        Statics.field2322 = var44.field784;
                                                                                                                    } else if (var96 == 25) {
                                                                                                                        int var45 = var34[var32];
                                                                                                                        field1349[++Statics.field871 - 1] = class213.method1008(var45);
                                                                                                                    } else if (var96 == 27) {
                                                                                                                        int var46 = var34[var32];
                                                                                                                        int var47 = field1349[--Statics.field871];
                                                                                                                        class252 var48 = class252.method4073(var46);
                                                                                                                        int var49 = var48.field3383;
                                                                                                                        int var50 = var48.field3385;
                                                                                                                        int var51 = var48.field3382;
                                                                                                                        int var52 = class213.field2608[var51 - var50];
                                                                                                                        if (var47 < 0 || var47 > var52) {
                                                                                                                            var47 = 0;
                                                                                                                        }
                                                                                                                        int var53 = var52 << var50;
                                                                                                                        class213.field2609[var49] = class213.field2609[var49] & ~var53 | var47 << var50 & var53;
                                                                                                                    } else if (var96 == 31) {
                                                                                                                        Statics.field871 -= 2;
                                                                                                                        if (field1349[Statics.field871] <= field1349[Statics.field871 + 1]) {
                                                                                                                            var32 += var34[var32];
                                                                                                                        }
                                                                                                                    } else if (var96 == 32) {
                                                                                                                        Statics.field871 -= 2;
                                                                                                                        if (field1349[Statics.field871] >= field1349[Statics.field871 + 1]) {
                                                                                                                            var32 += var34[var32];
                                                                                                                        }
                                                                                                                    } else if (var96 == 33) {
                                                                                                                        field1349[++Statics.field871 - 1] = Statics.field1346[var34[var32]];
                                                                                                                    } else if (var96 == 34) {
                                                                                                                        Statics.field1346[var34[var32]] = field1349[--Statics.field871];
                                                                                                                    } else if (var96 == 35) {
                                                                                                                        field1348[++Statics.field2342 - 1] = Statics.field2322[var34[var32]];
                                                                                                                    } else if (var96 == 36) {
                                                                                                                        Statics.field2322[var34[var32]] = field1348[--Statics.field2342];
                                                                                                                    } else if (var96 == 37) {
                                                                                                                        int var54 = var34[var32];
                                                                                                                        Statics.field2342 -= var54;
                                                                                                                        String[] var55 = field1348;
                                                                                                                        int var56 = Statics.field2342;
                                                                                                                        String var57;
                                                                                                                        if (var54 == 0) {
                                                                                                                            var57 = "";
                                                                                                                        } else if (var54 == 1) {
                                                                                                                            String var58 = var55[var56];
                                                                                                                            if (var58 == null) {
                                                                                                                                var57 = "null";
                                                                                                                            } else {
                                                                                                                                var57 = var58.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var59 = var54 + var56;
                                                                                                                            int var60 = 0;
                                                                                                                            for (int var61 = var56; var61 < var59; var61++) {
                                                                                                                                String var62 = var55[var61];
                                                                                                                                if (var62 == null) {
                                                                                                                                    var60 += 4;
                                                                                                                                } else {
                                                                                                                                    var60 += var62.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var63 = new StringBuilder(var60);
                                                                                                                            for (int var64 = var56; var64 < var59; var64++) {
                                                                                                                                String var65 = var55[var64];
                                                                                                                                if (var65 == null) {
                                                                                                                                    var63.append("null");
                                                                                                                                } else {
                                                                                                                                    var63.append(var65);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var57 = var63.toString();
                                                                                                                        }
                                                                                                                        field1348[++Statics.field2342 - 1] = var57;
                                                                                                                    } else if (var96 == 38) {
                                                                                                                        Statics.field871--;
                                                                                                                    } else if (var96 == 39) {
                                                                                                                        Statics.field2342--;
                                                                                                                    } else if (var96 == 40) {
                                                                                                                        int var67 = var34[var32];
                                                                                                                        class99 var68 = (class99) class99.field1547.method3347((long) var67);
                                                                                                                        class99 var69;
                                                                                                                        if (var68 == null) {
                                                                                                                            byte[] var70 = Statics.field837.method3824(var67, 0);
                                                                                                                            if (var70 == null) {
                                                                                                                                var69 = null;
                                                                                                                            } else {
                                                                                                                                class99 var71 = class99.method2757(var70);
                                                                                                                                class99.field1547.method3346(var71, (long) var67);
                                                                                                                                var69 = var71;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var69 = var68;
                                                                                                                        }
                                                                                                                        class99 var72 = var69;
                                                                                                                        int[] var73 = new int[var69.field1548];
                                                                                                                        String[] var74 = new String[var69.field1546];
                                                                                                                        for (int var75 = 0; var75 < var72.field1538; var75++) {
                                                                                                                            var73[var75] = field1349[Statics.field871 - var72.field1538 + var75];
                                                                                                                        }
                                                                                                                        for (int var76 = 0; var76 < var72.field1545; var76++) {
                                                                                                                            var74[var76] = field1348[Statics.field2342 - var72.field1545 + var76];
                                                                                                                        }
                                                                                                                        Statics.field871 -= var72.field1538;
                                                                                                                        Statics.field2342 -= var72.field1545;
                                                                                                                        class63 var77 = new class63();
                                                                                                                        var77.field781 = var26;
                                                                                                                        var77.field782 = var32;
                                                                                                                        var77.field783 = Statics.field1346;
                                                                                                                        var77.field784 = Statics.field2322;
                                                                                                                        field1353[++field1351 - 1] = var77;
                                                                                                                        var26 = var72;
                                                                                                                        var33 = var72.field1539;
                                                                                                                        var34 = var72.field1540;
                                                                                                                        var32 = -1;
                                                                                                                        Statics.field1346 = var73;
                                                                                                                        Statics.field2322 = var74;
                                                                                                                    } else if (var96 == 42) {
                                                                                                                        field1349[++Statics.field871 - 1] = Statics.field17.method1671(var34[var32]);
                                                                                                                    } else if (var96 == 43) {
                                                                                                                        Statics.field17.method1663(var34[var32], field1349[--Statics.field871]);
                                                                                                                    } else if (var96 == 44) {
                                                                                                                        int var78 = var34[var32] >> 16;
                                                                                                                        int var79 = var34[var32] & 0xFFFF;
                                                                                                                        int var80 = field1349[--Statics.field871];
                                                                                                                        if (var80 >= 0 && var80 <= 5000) {
                                                                                                                            field1347[var78] = var80;
                                                                                                                            byte var81 = -1;
                                                                                                                            if (var79 == 105) {
                                                                                                                                var81 = 0;
                                                                                                                            }
                                                                                                                            int var82 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var82 >= var80) {
                                                                                                                                    continue label303;
                                                                                                                                }
                                                                                                                                field1352[var78][var82] = var81;
                                                                                                                                var82++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var96 == 45) {
                                                                                                                        int var83 = var34[var32];
                                                                                                                        int var84 = field1349[--Statics.field871];
                                                                                                                        if (var84 < 0 || var84 >= field1347[var83]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1349[++Statics.field871 - 1] = field1352[var83][var84];
                                                                                                                    } else if (var96 == 46) {
                                                                                                                        int var85 = var34[var32];
                                                                                                                        Statics.field871 -= 2;
                                                                                                                        int var86 = field1349[Statics.field871];
                                                                                                                        if (var86 < 0 || var86 >= field1347[var85]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1352[var85][var86] = field1349[Statics.field871 + 1];
                                                                                                                    } else if (var96 == 47) {
                                                                                                                        String var87 = Statics.field17.method1667(var34[var32]);
                                                                                                                        if (var87 == null) {
                                                                                                                            var87 = "null";
                                                                                                                        }
                                                                                                                        field1348[++Statics.field2342 - 1] = var87;
                                                                                                                    } else if (var96 == 48) {
                                                                                                                        Statics.field17.method1696(var34[var32], field1348[--Statics.field2342]);
                                                                                                                    } else if (var96 == 60) {
                                                                                                                        class188 var88 = var26.field1543[var34[var32]];
                                                                                                                        class200 var89 = (class200) var88.method3318((long) field1349[--Statics.field871]);
                                                                                                                        if (var89 != null) {
                                                                                                                            var32 += var89.field2488;
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
        } catch (Exception var95) {
            StringBuilder var93 = new StringBuilder(30);
            var93.append("").append(var26.field2475).append(" ");
            for (int var94 = field1351 - 1; var94 >= 0; var94--) {
                var93.append("").append(field1353[var94].field781.field2475).append(" ");
            }
            var93.append("").append(var35);
            class154.method2746(var93.toString(), var95);
        }
    }

    @ObfuscatedName("al.a(ILck;ZS)I")
    public static int method250(int arg0, class99 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method1561(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method990(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method152(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method3788(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method754(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method1401(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            class218 var6 = arg2 ? Statics.field453 : Statics.field367;
            byte var7;
            if (arg0 == 1500) {
                field1349[++Statics.field871 - 1] = var6.field2783;
                var7 = 1;
            } else if (arg0 == 1501) {
                field1349[++Statics.field871 - 1] = var6.field2759;
                var7 = 1;
            } else if (arg0 == 1502) {
                field1349[++Statics.field871 - 1] = var6.field2739;
                var7 = 1;
            } else if (arg0 == 1503) {
                field1349[++Statics.field871 - 1] = var6.field2675;
                var7 = 1;
            } else if (arg0 == 1504) {
                field1349[++Statics.field871 - 1] = var6.field2679 ? 1 : 0;
                var7 = 1;
            } else if (arg0 == 1505) {
                field1349[++Statics.field871 - 1] = var6.field2678;
                var7 = 1;
            } else {
                var7 = 2;
            }
            return var7;
        } else if (arg0 < 1700) {
            return method1690(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method123(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            class218 var8 = arg2 ? Statics.field453 : Statics.field367;
            byte var13;
            if (arg0 == 1800) {
                int[] var9 = field1349;
                int var10 = ++Statics.field871 - 1;
                int var11 = client.method3688(var8);
                int var12 = var11 >> 11 & 0x3F;
                var9[var10] = var12;
                var13 = 1;
            } else if (arg0 == 1801) {
                int var14 = field1349[--Statics.field871];
                int var296 = var14 - 1;
                if (var8.field2733 == null || var296 >= var8.field2733.length || var8.field2733[var296] == null) {
                    field1348[++Statics.field2342 - 1] = "";
                } else {
                    field1348[++Statics.field2342 - 1] = var8.field2733[var296];
                }
                var13 = 1;
            } else if (arg0 == 1802) {
                if (var8.field2682 == null) {
                    field1348[++Statics.field2342 - 1] = "";
                } else {
                    field1348[++Statics.field2342 - 1] = var8.field2682;
                }
                var13 = 1;
            } else {
                var13 = 2;
            }
            return var13;
        } else if (arg0 < 2000) {
            return method40(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method990(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method152(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method3788(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method754(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method1401(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            class218 var15 = class218.method2924(field1349[--Statics.field871]);
            byte var16;
            if (arg0 == 2500) {
                field1349[++Statics.field871 - 1] = var15.field2783;
                var16 = 1;
            } else if (arg0 == 2501) {
                field1349[++Statics.field871 - 1] = var15.field2759;
                var16 = 1;
            } else if (arg0 == 2502) {
                field1349[++Statics.field871 - 1] = var15.field2739;
                var16 = 1;
            } else if (arg0 == 2503) {
                field1349[++Statics.field871 - 1] = var15.field2675;
                var16 = 1;
            } else if (arg0 == 2504) {
                field1349[++Statics.field871 - 1] = var15.field2679 ? 1 : 0;
                var16 = 1;
            } else if (arg0 == 2505) {
                field1349[++Statics.field871 - 1] = var15.field2678;
                var16 = 1;
            } else {
                var16 = 2;
            }
            return var16;
        } else if (arg0 < 2700) {
            return method654(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method2960(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            class218 var17 = class218.method2924(field1349[--Statics.field871]);
            byte var22;
            if (arg0 == 2800) {
                int[] var18 = field1349;
                int var19 = ++Statics.field871 - 1;
                int var20 = client.method3688(var17);
                int var21 = var20 >> 11 & 0x3F;
                var18[var19] = var21;
                var22 = 1;
            } else if (arg0 == 2801) {
                int var23 = field1349[--Statics.field871];
                int var297 = var23 - 1;
                if (var17.field2733 == null || var297 >= var17.field2733.length || var17.field2733[var297] == null) {
                    field1348[++Statics.field2342 - 1] = "";
                } else {
                    field1348[++Statics.field2342 - 1] = var17.field2733[var297];
                }
                var22 = 1;
            } else if (arg0 == 2802) {
                if (var17.field2682 == null) {
                    field1348[++Statics.field2342 - 1] = "";
                } else {
                    field1348[++Statics.field2342 - 1] = var17.field2682;
                }
                var22 = 1;
            } else {
                var22 = 2;
            }
            return var22;
        } else if (arg0 < 3000) {
            return method40(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            byte var25;
            if (arg0 == 3100) {
                String var24 = field1348[--Statics.field2342];
                class98.method1380(0, "", var24);
                var25 = 1;
            } else if (arg0 == 3101) {
                Statics.field871 -= 2;
                client.method82(Statics.field908, field1349[Statics.field871], field1349[Statics.field871 + 1]);
                var25 = 1;
            } else if (arg0 == 3103) {
                client.field986.method3243(174);
                for (class69 var26 = (class69) client.field1093.method3365(); var26 != null; var26 = (class69) client.field1093.method3362()) {
                    if (var26.field848 == 0 || var26.field848 == 3) {
                        client.method1030(var26, true);
                    }
                }
                if (client.field1087 != null) {
                    client.method31(client.field1087);
                    client.field1087 = null;
                }
                var25 = 1;
            } else if (arg0 == 3104) {
                String var27 = field1348[--Statics.field2342];
                int var28 = 0;
                boolean var29 = false;
                boolean var30 = false;
                int var31 = 0;
                int var32 = var27.length();
                int var33 = 0;
                boolean var35;
                while (true) {
                    if (var33 >= var32) {
                        var35 = var30;
                        break;
                    }
                    label1865: {
                        char var34 = var27.charAt(var33);
                        if (var33 == 0) {
                            if (var34 == '-') {
                                var29 = true;
                                break label1865;
                            }
                            if (var34 == '+') {
                                break label1865;
                            }
                        }
                        int var298;
                        if (var34 >= '0' && var34 <= '9') {
                            var298 = var34 - '0';
                        } else if (var34 >= 'A' && var34 <= 'Z') {
                            var298 = var34 - '7';
                        } else {
                            if (var34 < 'a' || var34 > 'z') {
                                var35 = false;
                                break;
                            }
                            var298 = var34 - 'W';
                        }
                        if (var298 >= 10) {
                            var35 = false;
                            break;
                        }
                        if (var29) {
                            var298 = -var298;
                        }
                        int var36 = var31 * 10 + var298;
                        if (var36 / 10 != var31) {
                            var35 = false;
                            break;
                        }
                        var31 = var36;
                        var30 = true;
                    }
                    var33++;
                }
                if (var35) {
                    int var38 = class272.method3811(var27, 10, true);
                    var28 = var38;
                }
                client.field986.method3243(162);
                client.field986.method3136(var28);
                var25 = 1;
            } else if (arg0 == 3105) {
                String var39 = field1348[--Statics.field2342];
                client.field986.method3243(175);
                client.field986.method3102(var39.length() + 1);
                client.field986.method2984(var39);
                var25 = 1;
            } else if (arg0 == 3106) {
                String var40 = field1348[--Statics.field2342];
                client.field986.method3243(216);
                client.field986.method3102(var40.length() + 1);
                client.field986.method2984(var40);
                var25 = 1;
            } else if (arg0 == 3107) {
                int var41 = field1349[--Statics.field871];
                String var42 = field1348[--Statics.field2342];
                client.method2158(var41, var42);
                var25 = 1;
            } else if (arg0 == 3108) {
                Statics.field871 -= 3;
                int var43 = field1349[Statics.field871];
                int var44 = field1349[Statics.field871 + 1];
                int var45 = field1349[Statics.field871 + 2];
                class218 var46 = class218.method2924(var45);
                client.method2409(var46, var43, var44);
                var25 = 1;
            } else if (arg0 == 3109) {
                Statics.field871 -= 2;
                int var47 = field1349[Statics.field871];
                int var48 = field1349[Statics.field871 + 1];
                class218 var49 = arg2 ? Statics.field453 : Statics.field367;
                client.method2409(var49, var47, var48);
                var25 = 1;
            } else if (arg0 == 3110) {
                Statics.field952 = field1349[--Statics.field871] == 1;
                var25 = 1;
            } else if (arg0 == 3111) {
                field1349[++Statics.field871 - 1] = Statics.field2396.field1317 ? 1 : 0;
                var25 = 1;
            } else if (arg0 == 3112) {
                Statics.field2396.field1317 = field1349[--Statics.field871] == 1;
                class81.method163();
                var25 = 1;
            } else if (arg0 == 3113) {
                String var50 = field1348[--Statics.field2342];
                boolean var51 = field1349[--Statics.field871] == 1;
                class57.method476(var50, var51, false);
                var25 = 1;
            } else if (arg0 == 3115) {
                int var52 = field1349[--Statics.field871];
                client.field986.method3243(53);
                client.field986.method2978(var52);
                var25 = 1;
            } else if (arg0 == 3116) {
                int var53 = field1349[--Statics.field871];
                Statics.field2342 -= 2;
                String var54 = field1348[Statics.field2342];
                String var55 = field1348[Statics.field2342 + 1];
                if (var54.length() > 500) {
                    var25 = 1;
                } else if (var55.length() > 500) {
                    var25 = 1;
                } else {
                    client.field986.method3243(165);
                    client.field986.method2978(1 + class175.method1055(var54) + class175.method1055(var55));
                    client.field986.method3058(var53);
                    client.field986.method2984(var55);
                    client.field986.method2984(var54);
                    var25 = 1;
                }
            } else if (arg0 == 3117) {
                client.field970 = field1349[--Statics.field871] == 1;
                var25 = 1;
            } else {
                var25 = 2;
            }
            return var25;
        } else if (arg0 < 3300) {
            byte var59;
            if (arg0 == 3200) {
                Statics.field871 -= 3;
                int var56 = field1349[Statics.field871];
                int var57 = field1349[Statics.field871 + 1];
                int var58 = field1349[Statics.field871 + 2];
                if (client.field1186 != 0 && var57 != 0 && client.field1173 < 50) {
                    client.field1174[client.field1173] = var56;
                    client.field1175[client.field1173] = var57;
                    client.field1002[client.field1173] = var58;
                    client.field1178[client.field1173] = null;
                    client.field1177[client.field1173] = 0;
                    client.field1173++;
                }
                var59 = 1;
            } else if (arg0 == 3201) {
                client.method2731(field1349[--Statics.field871]);
                var59 = 1;
            } else if (arg0 == 3202) {
                Statics.field871 -= 2;
                client.method47(field1349[Statics.field871], field1349[Statics.field871 + 1]);
                var59 = 1;
            } else {
                var59 = 2;
            }
            return var59;
        } else if (arg0 < 3400) {
            return method2893(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            byte var64;
            if (arg0 == 3400) {
                Statics.field871 -= 2;
                int var60 = field1349[Statics.field871];
                int var61 = field1349[Statics.field871 + 1];
                class255 var62 = class255.method3501(var60);
                if (var62.field3404 != 's') {
                }
                for (int var63 = 0; var63 < var62.field3407; var63++) {
                    if (var62.field3408[var63] == var61) {
                        field1348[++Statics.field2342 - 1] = var62.field3410[var63];
                        var62 = null;
                        break;
                    }
                }
                if (var62 != null) {
                    field1348[++Statics.field2342 - 1] = var62.field3409;
                }
                var64 = 1;
            } else if (arg0 == 3408) {
                Statics.field871 -= 4;
                int var65 = field1349[Statics.field871];
                int var66 = field1349[Statics.field871 + 1];
                int var67 = field1349[Statics.field871 + 2];
                int var68 = field1349[Statics.field871 + 3];
                class255 var69 = class255.method3501(var67);
                if (var69.field3403 == var65 && var69.field3404 == var66) {
                    for (int var70 = 0; var70 < var69.field3407; var70++) {
                        if (var69.field3408[var70] == var68) {
                            if (var66 == 115) {
                                field1348[++Statics.field2342 - 1] = var69.field3410[var70];
                            } else {
                                field1349[++Statics.field871 - 1] = var69.field3405[var70];
                            }
                            var69 = null;
                            break;
                        }
                    }
                    if (var69 != null) {
                        if (var66 == 115) {
                            field1348[++Statics.field2342 - 1] = var69.field3409;
                        } else {
                            field1349[++Statics.field871 - 1] = var69.field3406;
                        }
                    }
                    var64 = 1;
                } else {
                    if (var66 == 115) {
                        field1348[++Statics.field2342 - 1] = "null";
                    } else {
                        field1349[++Statics.field871 - 1] = 0;
                    }
                    var64 = 1;
                }
            } else {
                var64 = 2;
            }
            return var64;
        } else if (arg0 < 3700) {
            return method42(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            byte var72;
            if (arg0 == 3903) {
                int var71 = field1349[--Statics.field871];
                field1349[++Statics.field871 - 1] = client.field1015[var71].method101();
                var72 = 1;
            } else if (arg0 == 3904) {
                int var73 = field1349[--Statics.field871];
                field1349[++Statics.field871 - 1] = client.field1015[var73].field311;
                var72 = 1;
            } else if (arg0 == 3905) {
                int var74 = field1349[--Statics.field871];
                field1349[++Statics.field871 - 1] = client.field1015[var74].field309;
                var72 = 1;
            } else if (arg0 == 3906) {
                int var75 = field1349[--Statics.field871];
                field1349[++Statics.field871 - 1] = client.field1015[var75].field310;
                var72 = 1;
            } else if (arg0 == 3907) {
                int var76 = field1349[--Statics.field871];
                field1349[++Statics.field871 - 1] = client.field1015[var76].field314;
                var72 = 1;
            } else if (arg0 == 3908) {
                int var77 = field1349[--Statics.field871];
                field1349[++Statics.field871 - 1] = client.field1015[var77].field312;
                var72 = 1;
            } else if (arg0 == 3910) {
                int var78 = field1349[--Statics.field871];
                int var79 = client.field1015[var78].method105();
                field1349[++Statics.field871 - 1] = var79 == 0 ? 1 : 0;
                var72 = 1;
            } else if (arg0 == 3911) {
                int var80 = field1349[--Statics.field871];
                int var81 = client.field1015[var80].method105();
                field1349[++Statics.field871 - 1] = var81 == 2 ? 1 : 0;
                var72 = 1;
            } else if (arg0 == 3912) {
                int var82 = field1349[--Statics.field871];
                int var83 = client.field1015[var82].method105();
                field1349[++Statics.field871 - 1] = var83 == 5 ? 1 : 0;
                var72 = 1;
            } else if (arg0 == 3913) {
                int var84 = field1349[--Statics.field871];
                int var85 = client.field1015[var84].method105();
                field1349[++Statics.field871 - 1] = var85 == 1 ? 1 : 0;
                var72 = 1;
            } else if (arg0 == 3914) {
                boolean var86 = field1349[--Statics.field871] == 1;
                if (Statics.field2442 != null) {
                    Statics.field2442.method64(class14.field286, var86);
                }
                var72 = 1;
            } else if (arg0 == 3915) {
                boolean var87 = field1349[--Statics.field871] == 1;
                if (Statics.field2442 != null) {
                    Statics.field2442.method64(class14.field285, var87);
                }
                var72 = 1;
            } else if (arg0 == 3916) {
                Statics.field871 -= 2;
                boolean var88 = field1349[Statics.field871] == 1;
                boolean var89 = field1349[Statics.field871 + 1] == 1;
                if (Statics.field2442 != null) {
                    Statics.field2442.method64(new class95(var89), var88);
                }
                var72 = 1;
            } else if (arg0 == 3917) {
                boolean var90 = field1349[--Statics.field871] == 1;
                if (Statics.field2442 != null) {
                    Statics.field2442.method64(class14.field284, var90);
                }
                var72 = 1;
            } else if (arg0 == 3918) {
                boolean var91 = field1349[--Statics.field871] == 1;
                if (Statics.field2442 != null) {
                    Statics.field2442.method64(class14.field292, var91);
                }
                var72 = 1;
            } else if (arg0 == 3919) {
                field1349[++Statics.field871 - 1] = Statics.field2442 == null ? 0 : Statics.field2442.field290.size();
                var72 = 1;
            } else if (arg0 == 3920) {
                int var92 = field1349[--Statics.field871];
                class15 var93 = (class15) Statics.field2442.field290.get(var92);
                field1349[++Statics.field871 - 1] = var93.field299;
                var72 = 1;
            } else if (arg0 == 3921) {
                int var94 = field1349[--Statics.field871];
                class15 var95 = (class15) Statics.field2442.field290.get(var94);
                field1348[++Statics.field2342 - 1] = var95.method75();
                var72 = 1;
            } else if (arg0 == 3922) {
                int var96 = field1349[--Statics.field871];
                class15 var97 = (class15) Statics.field2442.field290.get(var96);
                field1348[++Statics.field2342 - 1] = var97.method78();
                var72 = 1;
            } else if (arg0 == 3923) {
                int var98 = field1349[--Statics.field871];
                class15 var99 = (class15) Statics.field2442.field290.get(var98);
                long var100 = class177.method608() - Statics.field335 - var99.field296;
                int var102 = (int) (var100 / 3600000L);
                int var103 = (int) ((var100 - (long) (var102 * 3600000)) / 60000L);
                int var104 = (int) ((var100 - (long) (var102 * 3600000) - (long) (var103 * 60000)) / 1000L);
                String var105 = var102 + ":" + var103 / 10 + var103 % 10 + ":" + var104 / 10 + var104 % 10;
                field1348[++Statics.field2342 - 1] = var105;
                var72 = 1;
            } else if (arg0 == 3924) {
                int var106 = field1349[--Statics.field871];
                class15 var107 = (class15) Statics.field2442.field290.get(var106);
                field1349[++Statics.field871 - 1] = var107.field297.field310;
                var72 = 1;
            } else if (arg0 == 3925) {
                int var108 = field1349[--Statics.field871];
                class15 var109 = (class15) Statics.field2442.field290.get(var108);
                field1349[++Statics.field871 - 1] = var109.field297.field309;
                var72 = 1;
            } else if (arg0 == 3926) {
                int var110 = field1349[--Statics.field871];
                class15 var111 = (class15) Statics.field2442.field290.get(var110);
                field1349[++Statics.field871 - 1] = var111.field297.field311;
                var72 = 1;
            } else {
                var72 = 2;
            }
            return var72;
        } else if (arg0 < 4100) {
            byte var114;
            if (arg0 == 4000) {
                Statics.field871 -= 2;
                int var112 = field1349[Statics.field871];
                int var113 = field1349[Statics.field871 + 1];
                field1349[++Statics.field871 - 1] = var112 + var113;
                var114 = 1;
            } else if (arg0 == 4001) {
                Statics.field871 -= 2;
                int var115 = field1349[Statics.field871];
                int var116 = field1349[Statics.field871 + 1];
                field1349[++Statics.field871 - 1] = var115 - var116;
                var114 = 1;
            } else if (arg0 == 4002) {
                Statics.field871 -= 2;
                int var117 = field1349[Statics.field871];
                int var118 = field1349[Statics.field871 + 1];
                field1349[++Statics.field871 - 1] = var117 * var118;
                var114 = 1;
            } else if (arg0 == 4003) {
                Statics.field871 -= 2;
                int var119 = field1349[Statics.field871];
                int var120 = field1349[Statics.field871 + 1];
                field1349[++Statics.field871 - 1] = var119 / var120;
                var114 = 1;
            } else if (arg0 == 4004) {
                int var121 = field1349[--Statics.field871];
                field1349[++Statics.field871 - 1] = (int) (Math.random() * (double) var121);
                var114 = 1;
            } else if (arg0 == 4005) {
                int var122 = field1349[--Statics.field871];
                field1349[++Statics.field871 - 1] = (int) (Math.random() * (double) (var122 + 1));
                var114 = 1;
            } else if (arg0 == 4006) {
                Statics.field871 -= 5;
                int var123 = field1349[Statics.field871];
                int var124 = field1349[Statics.field871 + 1];
                int var125 = field1349[Statics.field871 + 2];
                int var126 = field1349[Statics.field871 + 3];
                int var127 = field1349[Statics.field871 + 4];
                field1349[++Statics.field871 - 1] = (var124 - var123) * (var127 - var125) / (var126 - var125) + var123;
                var114 = 1;
            } else if (arg0 == 4007) {
                Statics.field871 -= 2;
                int var128 = field1349[Statics.field871];
                int var129 = field1349[Statics.field871 + 1];
                field1349[++Statics.field871 - 1] = var128 * var129 / 100 + var128;
                var114 = 1;
            } else if (arg0 == 4008) {
                Statics.field871 -= 2;
                int var130 = field1349[Statics.field871];
                int var131 = field1349[Statics.field871 + 1];
                field1349[++Statics.field871 - 1] = var130 | 0x1 << var131;
                var114 = 1;
            } else if (arg0 == 4009) {
                Statics.field871 -= 2;
                int var132 = field1349[Statics.field871];
                int var133 = field1349[Statics.field871 + 1];
                field1349[++Statics.field871 - 1] = var132 & -1 - (0x1 << var133);
                var114 = 1;
            } else if (arg0 == 4010) {
                Statics.field871 -= 2;
                int var134 = field1349[Statics.field871];
                int var135 = field1349[Statics.field871 + 1];
                field1349[++Statics.field871 - 1] = (var134 & 0x1 << var135) == 0 ? 0 : 1;
                var114 = 1;
            } else if (arg0 == 4011) {
                Statics.field871 -= 2;
                int var136 = field1349[Statics.field871];
                int var137 = field1349[Statics.field871 + 1];
                field1349[++Statics.field871 - 1] = var136 % var137;
                var114 = 1;
            } else if (arg0 == 4012) {
                Statics.field871 -= 2;
                int var138 = field1349[Statics.field871];
                int var139 = field1349[Statics.field871 + 1];
                if (var138 == 0) {
                    field1349[++Statics.field871 - 1] = 0;
                } else {
                    field1349[++Statics.field871 - 1] = (int) Math.pow((double) var138, (double) var139);
                }
                var114 = 1;
            } else if (arg0 == 4013) {
                Statics.field871 -= 2;
                int var140 = field1349[Statics.field871];
                int var141 = field1349[Statics.field871 + 1];
                if (var140 == 0) {
                    field1349[++Statics.field871 - 1] = 0;
                } else if (var141 == 0) {
                    field1349[++Statics.field871 - 1] = Integer.MAX_VALUE;
                } else {
                    field1349[++Statics.field871 - 1] = (int) Math.pow((double) var140, 1.0D / (double) var141);
                }
                var114 = 1;
            } else if (arg0 == 4014) {
                Statics.field871 -= 2;
                int var142 = field1349[Statics.field871];
                int var143 = field1349[Statics.field871 + 1];
                field1349[++Statics.field871 - 1] = var142 & var143;
                var114 = 1;
            } else if (arg0 == 4015) {
                Statics.field871 -= 2;
                int var144 = field1349[Statics.field871];
                int var145 = field1349[Statics.field871 + 1];
                field1349[++Statics.field871 - 1] = var144 | var145;
                var114 = 1;
            } else if (arg0 == 4018) {
                Statics.field871 -= 3;
                long var146 = (long) field1349[Statics.field871];
                long var148 = (long) field1349[Statics.field871 + 1];
                long var150 = (long) field1349[Statics.field871 + 2];
                field1349[++Statics.field871 - 1] = (int) (var146 * var150 / var148);
                var114 = 1;
            } else {
                var114 = 2;
            }
            return var114;
        } else if (arg0 < 4200) {
            return method638(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            byte var153;
            if (arg0 == 4200) {
                int var152 = field1349[--Statics.field871];
                field1348[++Statics.field2342 - 1] = class258.method2955(var152).field3494;
                var153 = 1;
            } else if (arg0 == 4201) {
                Statics.field871 -= 2;
                int var154 = field1349[Statics.field871];
                int var155 = field1349[Statics.field871 + 1];
                class258 var156 = class258.method2955(var154);
                if (var155 < 1 || var155 > 5 || var156.field3534[var155 - 1] == null) {
                    field1348[++Statics.field2342 - 1] = "";
                } else {
                    field1348[++Statics.field2342 - 1] = var156.field3534[var155 - 1];
                }
                var153 = 1;
            } else if (arg0 == 4202) {
                Statics.field871 -= 2;
                int var157 = field1349[Statics.field871];
                int var158 = field1349[Statics.field871 + 1];
                class258 var159 = class258.method2955(var157);
                if (var158 < 1 || var158 > 5 || var159.field3509[var158 - 1] == null) {
                    field1348[++Statics.field2342 - 1] = "";
                } else {
                    field1348[++Statics.field2342 - 1] = var159.field3509[var158 - 1];
                }
                var153 = 1;
            } else if (arg0 == 4203) {
                int var160 = field1349[--Statics.field871];
                field1349[++Statics.field871 - 1] = class258.method2955(var160).field3506;
                var153 = 1;
            } else if (arg0 == 4204) {
                int var161 = field1349[--Statics.field871];
                field1349[++Statics.field871 - 1] = class258.method2955(var161).field3491 == 1 ? 1 : 0;
                var153 = 1;
            } else if (arg0 == 4205) {
                int var162 = field1349[--Statics.field871];
                class258 var163 = class258.method2955(var162);
                if (var163.field3486 == -1 && var163.field3525 >= 0) {
                    field1349[++Statics.field871 - 1] = var163.field3525;
                } else {
                    field1349[++Statics.field871 - 1] = var162;
                }
                var153 = 1;
            } else if (arg0 == 4206) {
                int var164 = field1349[--Statics.field871];
                class258 var165 = class258.method2955(var164);
                if (var165.field3486 >= 0 && var165.field3525 >= 0) {
                    field1349[++Statics.field871 - 1] = var165.field3525;
                } else {
                    field1349[++Statics.field871 - 1] = var164;
                }
                var153 = 1;
            } else if (arg0 == 4207) {
                int var166 = field1349[--Statics.field871];
                field1349[++Statics.field871 - 1] = class258.method2955(var166).field3507 ? 1 : 0;
                var153 = 1;
            } else if (arg0 == 4208) {
                int var167 = field1349[--Statics.field871];
                class258 var168 = class258.method2955(var167);
                if (var168.field3498 == -1 && var168.field3537 >= 0) {
                    field1349[++Statics.field871 - 1] = var168.field3537;
                } else {
                    field1349[++Statics.field871 - 1] = var167;
                }
                var153 = 1;
            } else if (arg0 == 4209) {
                int var169 = field1349[--Statics.field871];
                class258 var170 = class258.method2955(var169);
                if (var170.field3498 >= 0 && var170.field3537 >= 0) {
                    field1349[++Statics.field871 - 1] = var170.field3537;
                } else {
                    field1349[++Statics.field871 - 1] = var169;
                }
                var153 = 1;
            } else if (arg0 == 4210) {
                String var171 = field1348[--Statics.field2342];
                int var172 = field1349[--Statics.field871];
                client.method1564(var171, var172 == 1);
                field1349[++Statics.field871 - 1] = Statics.field2444;
                var153 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field3677 == null || Statics.field3320 >= Statics.field2444) {
                    field1349[++Statics.field871 - 1] = -1;
                } else {
                    field1349[++Statics.field871 - 1] = Statics.field3677[++Statics.field3320 - 1] & 0xFFFF;
                }
                var153 = 1;
            } else if (arg0 == 4212) {
                Statics.field3320 = 0;
                var153 = 1;
            } else {
                var153 = 2;
            }
            return var153;
        } else if (arg0 < 5100) {
            byte var173;
            if (arg0 == 5000) {
                field1349[++Statics.field871 - 1] = client.field1149;
                var173 = 1;
            } else if (arg0 == 5001) {
                Statics.field871 -= 3;
                client.field1149 = field1349[Statics.field871];
                int var174 = field1349[Statics.field871 + 1];
                class278[] var175 = new class278[] { class278.field3737, class278.field3738, class278.field3736 };
                class278[] var176 = var175;
                int var177 = 0;
                class278 var179;
                while (true) {
                    if (var177 >= var176.length) {
                        var179 = null;
                        break;
                    }
                    class278 var178 = var176[var177];
                    if (var178.field3739 == var174) {
                        var179 = var178;
                        break;
                    }
                    var177++;
                }
                Statics.field294 = var179;
                if (Statics.field294 == null) {
                    Statics.field294 = class278.field3736;
                }
                client.field1150 = field1349[Statics.field871 + 2];
                client.field986.method3243(222);
                client.field986.method3102(client.field1149);
                client.field986.method3102(Statics.field294.field3739);
                client.field986.method3102(client.field1150);
                var173 = 1;
            } else if (arg0 == 5002) {
                String var180 = field1348[--Statics.field2342];
                Statics.field871 -= 2;
                int var181 = field1349[Statics.field871];
                int var182 = field1349[Statics.field871 + 1];
                client.field986.method3243(57);
                client.field986.method3102(class175.method1055(var180) + 2);
                client.field986.method2984(var180);
                client.field986.method3102(var181 - 1);
                client.field986.method3102(var182);
                var173 = 1;
            } else if (arg0 == 5003) {
                Statics.field871 -= 2;
                int var183 = field1349[Statics.field871];
                int var184 = field1349[Statics.field871 + 1];
                class101 var185 = (class101) class98.field1534.get(var183);
                class73 var186 = var185.method1714(var184);
                if (var186 == null) {
                    field1349[++Statics.field871 - 1] = -1;
                    field1349[++Statics.field871 - 1] = 0;
                    field1348[++Statics.field2342 - 1] = "";
                    field1348[++Statics.field2342 - 1] = "";
                    field1348[++Statics.field2342 - 1] = "";
                } else {
                    field1349[++Statics.field871 - 1] = var186.field892;
                    field1349[++Statics.field871 - 1] = var186.field887;
                    field1348[++Statics.field2342 - 1] = var186.field888 == null ? "" : var186.field888;
                    field1348[++Statics.field2342 - 1] = var186.field890 == null ? "" : var186.field890;
                    field1348[++Statics.field2342 - 1] = var186.field891 == null ? "" : var186.field891;
                }
                var173 = 1;
            } else if (arg0 == 5004) {
                int var188 = field1349[--Statics.field871];
                class73 var189 = (class73) class98.field1533.method3318((long) var188);
                if (var189 == null) {
                    field1349[++Statics.field871 - 1] = -1;
                    field1349[++Statics.field871 - 1] = 0;
                    field1348[++Statics.field2342 - 1] = "";
                    field1348[++Statics.field2342 - 1] = "";
                    field1348[++Statics.field2342 - 1] = "";
                } else {
                    field1349[++Statics.field871 - 1] = var189.field893;
                    field1349[++Statics.field871 - 1] = var189.field887;
                    field1348[++Statics.field2342 - 1] = var189.field888 == null ? "" : var189.field888;
                    field1348[++Statics.field2342 - 1] = var189.field890 == null ? "" : var189.field890;
                    field1348[++Statics.field2342 - 1] = var189.field891 == null ? "" : var189.field891;
                }
                var173 = 1;
            } else if (arg0 == 5005) {
                if (Statics.field294 == null) {
                    field1349[++Statics.field871 - 1] = -1;
                } else {
                    field1349[++Statics.field871 - 1] = Statics.field294.field3739;
                }
                var173 = 1;
            } else if (arg0 == 5008) {
                String var191 = field1348[--Statics.field2342];
                int var192 = field1349[--Statics.field871];
                String var193 = var191.toLowerCase();
                byte var194 = 0;
                if (var193.startsWith(class227.field3035)) {
                    var194 = 0;
                    var191 = var191.substring(class227.field3035.length());
                } else if (var193.startsWith(class227.field3037)) {
                    var194 = 1;
                    var191 = var191.substring(class227.field3037.length());
                } else if (var193.startsWith(class227.field3130)) {
                    var194 = 2;
                    var191 = var191.substring(class227.field3130.length());
                } else if (var193.startsWith(class227.field3041)) {
                    var194 = 3;
                    var191 = var191.substring(class227.field3041.length());
                } else if (var193.startsWith(class227.field3043)) {
                    var194 = 4;
                    var191 = var191.substring(class227.field3043.length());
                } else if (var193.startsWith(class227.field3045)) {
                    var194 = 5;
                    var191 = var191.substring(class227.field3045.length());
                } else if (var193.startsWith(class227.field3047)) {
                    var194 = 6;
                    var191 = var191.substring(class227.field3047.length());
                } else if (var193.startsWith(class227.field3113)) {
                    var194 = 7;
                    var191 = var191.substring(class227.field3113.length());
                } else if (var193.startsWith(class227.field3051)) {
                    var194 = 8;
                    var191 = var191.substring(class227.field3051.length());
                } else if (var193.startsWith(class227.field3056)) {
                    var194 = 9;
                    var191 = var191.substring(class227.field3056.length());
                } else if (var193.startsWith(class227.field3014)) {
                    var194 = 10;
                    var191 = var191.substring(class227.field3014.length());
                } else if (var193.startsWith(class227.field3057)) {
                    var194 = 11;
                    var191 = var191.substring(class227.field3057.length());
                } else if (client.field950 != 0) {
                    if (var193.startsWith(class227.field3036)) {
                        var194 = 0;
                        var191 = var191.substring(class227.field3036.length());
                    } else if (var193.startsWith(class227.field3074)) {
                        var194 = 1;
                        var191 = var191.substring(class227.field3074.length());
                    } else if (var193.startsWith(class227.field3040)) {
                        var194 = 2;
                        var191 = var191.substring(class227.field3040.length());
                    } else if (var193.startsWith(class227.field3042)) {
                        var194 = 3;
                        var191 = var191.substring(class227.field3042.length());
                    } else if (var193.startsWith(class227.field3044)) {
                        var194 = 4;
                        var191 = var191.substring(class227.field3044.length());
                    } else if (var193.startsWith(class227.field3038)) {
                        var194 = 5;
                        var191 = var191.substring(class227.field3038.length());
                    } else if (var193.startsWith(class227.field3048)) {
                        var194 = 6;
                        var191 = var191.substring(class227.field3048.length());
                    } else if (var193.startsWith(class227.field3050)) {
                        var194 = 7;
                        var191 = var191.substring(class227.field3050.length());
                    } else if (var193.startsWith(class227.field3052)) {
                        var194 = 8;
                        var191 = var191.substring(class227.field3052.length());
                    } else if (var193.startsWith(class227.field3054)) {
                        var194 = 9;
                        var191 = var191.substring(class227.field3054.length());
                    } else if (var193.startsWith(class227.field2931)) {
                        var194 = 10;
                        var191 = var191.substring(class227.field2931.length());
                    } else if (var193.startsWith(class227.field3093)) {
                        var194 = 11;
                        var191 = var191.substring(class227.field3093.length());
                    }
                }
                String var195 = var191.toLowerCase();
                byte var196 = 0;
                if (var195.startsWith(class227.field3059)) {
                    var196 = 1;
                    var191 = var191.substring(class227.field3059.length());
                } else if (var195.startsWith(class227.field3061)) {
                    var196 = 2;
                    var191 = var191.substring(class227.field3061.length());
                } else if (var195.startsWith(class227.field2999)) {
                    var196 = 3;
                    var191 = var191.substring(class227.field2999.length());
                } else if (var195.startsWith(class227.field3065)) {
                    var196 = 4;
                    var191 = var191.substring(class227.field3065.length());
                } else if (var195.startsWith(class227.field3084)) {
                    var196 = 5;
                    var191 = var191.substring(class227.field3084.length());
                } else if (client.field950 != 0) {
                    if (var195.startsWith(class227.field3060)) {
                        var196 = 1;
                        var191 = var191.substring(class227.field3060.length());
                    } else if (var195.startsWith(class227.field3062)) {
                        var196 = 2;
                        var191 = var191.substring(class227.field3062.length());
                    } else if (var195.startsWith(class227.field3049)) {
                        var196 = 3;
                        var191 = var191.substring(class227.field3049.length());
                    } else if (var195.startsWith(class227.field3066)) {
                        var196 = 4;
                        var191 = var191.substring(class227.field3066.length());
                    } else if (var195.startsWith(class227.field3068)) {
                        var196 = 5;
                        var191 = var191.substring(class227.field3068.length());
                    }
                }
                client.field986.method3243(13);
                client.field986.method3102(0);
                int var197 = client.field986.field2395;
                client.field986.method3102(var192);
                client.field986.method3102(var194);
                client.field986.method3102(var196);
                class181 var198 = client.field986;
                int var199 = var198.field2395;
                int var200 = var191.length();
                byte[] var201 = new byte[var200];
                for (int var202 = 0; var202 < var200; var202++) {
                    char var203 = var191.charAt(var202);
                    if (var203 > 0 && var203 < 128 || var203 >= 160 && var203 <= 255) {
                        var201[var202] = (byte) var203;
                    } else if (var203 == 8364) {
                        var201[var202] = -128;
                    } else if (var203 == 8218) {
                        var201[var202] = -126;
                    } else if (var203 == 402) {
                        var201[var202] = -125;
                    } else if (var203 == 8222) {
                        var201[var202] = -124;
                    } else if (var203 == 8230) {
                        var201[var202] = -123;
                    } else if (var203 == 8224) {
                        var201[var202] = -122;
                    } else if (var203 == 8225) {
                        var201[var202] = -121;
                    } else if (var203 == 710) {
                        var201[var202] = -120;
                    } else if (var203 == 8240) {
                        var201[var202] = -119;
                    } else if (var203 == 352) {
                        var201[var202] = -118;
                    } else if (var203 == 8249) {
                        var201[var202] = -117;
                    } else if (var203 == 338) {
                        var201[var202] = -116;
                    } else if (var203 == 381) {
                        var201[var202] = -114;
                    } else if (var203 == 8216) {
                        var201[var202] = -111;
                    } else if (var203 == 8217) {
                        var201[var202] = -110;
                    } else if (var203 == 8220) {
                        var201[var202] = -109;
                    } else if (var203 == 8221) {
                        var201[var202] = -108;
                    } else if (var203 == 8226) {
                        var201[var202] = -107;
                    } else if (var203 == 8211) {
                        var201[var202] = -106;
                    } else if (var203 == 8212) {
                        var201[var202] = -105;
                    } else if (var203 == 732) {
                        var201[var202] = -104;
                    } else if (var203 == 8482) {
                        var201[var202] = -103;
                    } else if (var203 == 353) {
                        var201[var202] = -102;
                    } else if (var203 == 8250) {
                        var201[var202] = -101;
                    } else if (var203 == 339) {
                        var201[var202] = -100;
                    } else if (var203 == 382) {
                        var201[var202] = -98;
                    } else if (var203 == 376) {
                        var201[var202] = -97;
                    } else {
                        var201[var202] = 63;
                    }
                }
                var198.method2991(var201.length);
                var198.field2395 += Statics.field3657.method2910(var201, 0, var201.length, var198.field2392, var198.field2395);
                client.field986.method3010(client.field986.field2395 - var197);
                var173 = 1;
            } else if (arg0 == 5009) {
                Statics.field2342 -= 2;
                String var206 = field1348[Statics.field2342];
                String var207 = field1348[Statics.field2342 + 1];
                client.field986.method3243(101);
                client.field986.method2978(0);
                int var208 = client.field986.field2395;
                client.field986.method2984(var206);
                class181 var209 = client.field986;
                int var210 = var209.field2395;
                int var211 = var207.length();
                byte[] var212 = new byte[var211];
                for (int var213 = 0; var213 < var211; var213++) {
                    char var214 = var207.charAt(var213);
                    if (!(var214 <= 0 || var214 >= 128) || !(var214 < 160 || var214 > 255)) {
                        var212[var213] = (byte) var214;
                    } else if (var214 == 8364) {
                        var212[var213] = -128;
                    } else if (var214 == 8218) {
                        var212[var213] = -126;
                    } else if (var214 == 402) {
                        var212[var213] = -125;
                    } else if (var214 == 8222) {
                        var212[var213] = -124;
                    } else if (var214 == 8230) {
                        var212[var213] = -123;
                    } else if (var214 == 8224) {
                        var212[var213] = -122;
                    } else if (var214 == 8225) {
                        var212[var213] = -121;
                    } else if (var214 == 710) {
                        var212[var213] = -120;
                    } else if (var214 == 8240) {
                        var212[var213] = -119;
                    } else if (var214 == 352) {
                        var212[var213] = -118;
                    } else if (var214 == 8249) {
                        var212[var213] = -117;
                    } else if (var214 == 338) {
                        var212[var213] = -116;
                    } else if (var214 == 381) {
                        var212[var213] = -114;
                    } else if (var214 == 8216) {
                        var212[var213] = -111;
                    } else if (var214 == 8217) {
                        var212[var213] = -110;
                    } else if (var214 == 8220) {
                        var212[var213] = -109;
                    } else if (var214 == 8221) {
                        var212[var213] = -108;
                    } else if (var214 == 8226) {
                        var212[var213] = -107;
                    } else if (var214 == 8211) {
                        var212[var213] = -106;
                    } else if (var214 == 8212) {
                        var212[var213] = -105;
                    } else if (var214 == 732) {
                        var212[var213] = -104;
                    } else if (var214 == 8482) {
                        var212[var213] = -103;
                    } else if (var214 == 353) {
                        var212[var213] = -102;
                    } else if (var214 == 8250) {
                        var212[var213] = -101;
                    } else if (var214 == 339) {
                        var212[var213] = -100;
                    } else if (var214 == 382) {
                        var212[var213] = -98;
                    } else if (var214 == 376) {
                        var212[var213] = -97;
                    } else {
                        var212[var213] = 63;
                    }
                }
                var209.method2991(var212.length);
                var209.field2395 += Statics.field3657.method2910(var212, 0, var212.length, var209.field2392, var209.field2395);
                client.field986.method2989(client.field986.field2395 - var208);
                var173 = 1;
            } else if (arg0 == 5015) {
                String var217;
                if (Statics.field908 == null || Statics.field908.field925 == null) {
                    var217 = "";
                } else {
                    var217 = Statics.field908.field925;
                }
                field1348[++Statics.field2342 - 1] = var217;
                var173 = 1;
            } else if (arg0 == 5016) {
                field1349[++Statics.field871 - 1] = client.field1150;
                var173 = 1;
            } else if (arg0 == 5017) {
                int var218 = field1349[--Statics.field871];
                int[] var219 = field1349;
                int var220 = ++Statics.field871 - 1;
                class101 var221 = (class101) class98.field1534.get(var218);
                int var222;
                if (var221 == null) {
                    var222 = 0;
                } else {
                    var222 = var221.method1715();
                }
                var219[var220] = var222;
                var173 = 1;
            } else if (arg0 == 5018) {
                int var223 = field1349[--Statics.field871];
                int[] var224 = field1349;
                int var225 = ++Statics.field871 - 1;
                class73 var226 = (class73) class98.field1533.method3318((long) var223);
                int var227;
                if (var226 == null) {
                    var227 = -1;
                } else if (class98.field1537.field2493 == var226.field2478) {
                    var227 = -1;
                } else {
                    var227 = ((class73) var226.field2478).field892;
                }
                var224[var225] = var227;
                var173 = 1;
            } else if (arg0 == 5019) {
                int var228 = field1349[--Statics.field871];
                field1349[++Statics.field871 - 1] = class98.method576(var228);
                var173 = 1;
            } else if (arg0 == 5020) {
                String var229 = field1348[--Statics.field2342];
                if (var229.equalsIgnoreCase("toggleroof")) {
                    Statics.field2396.field1317 = !Statics.field2396.field1317;
                    class81.method163();
                    if (Statics.field2396.field1317) {
                        class98.method1380(99, "", "Roofs are now all hidden");
                    } else {
                        class98.method1380(99, "", "Roofs will only be removed selectively");
                    }
                }
                if (var229.equalsIgnoreCase("displayfps")) {
                    client.field1029 = !client.field1029;
                }
                if (client.field1099 >= 2) {
                    if (var229.equalsIgnoreCase("aabb")) {
                        if (!class8.field233) {
                            class8.field233 = true;
                            class8.field230 = class12.field274;
                        } else if (class8.field230 == class12.field274) {
                            class8.field233 = true;
                            class8.field230 = class12.field277;
                        } else {
                            class8.field233 = false;
                        }
                    }
                    if (var229.equalsIgnoreCase("fpson")) {
                        client.field1029 = true;
                    }
                    if (var229.equalsIgnoreCase("fpsoff")) {
                        client.field1029 = false;
                    }
                    if (var229.equalsIgnoreCase("gc")) {
                        System.gc();
                    }
                    if (var229.equalsIgnoreCase("clientdrop")) {
                        if (client.field1059 > 0) {
                            client.method477();
                        } else {
                            client.method492(40);
                            Statics.field2566 = Statics.field869;
                            Statics.field869 = null;
                        }
                    }
                    if (var229.equalsIgnoreCase("errortest") && client.field944 == 2) {
                        throw new RuntimeException();
                    }
                }
                client.field986.method3243(64);
                client.field986.method3102(var229.length() + 1);
                client.field986.method2984(var229);
                var173 = 1;
            } else if (arg0 == 5021) {
                client.field1151 = field1348[--Statics.field2342].toLowerCase().trim();
                var173 = 1;
            } else if (arg0 == 5022) {
                field1348[++Statics.field2342 - 1] = client.field1151;
                var173 = 1;
            } else {
                var173 = 2;
            }
            return var173;
        } else if (arg0 < 5400) {
            byte var233;
            if (arg0 == 5306) {
                int[] var230 = field1349;
                int var231 = ++Statics.field871 - 1;
                int var232 = client.field1197 ? 2 : 1;
                var230[var231] = var232;
                var233 = 1;
            } else if (arg0 == 5307) {
                int var234 = field1349[--Statics.field871];
                if (var234 == 1 || var234 == 2) {
                    client.field1105 = 0L;
                    if (var234 >= 2) {
                        client.field1197 = true;
                    } else {
                        client.field1197 = false;
                    }
                    if (client.method530() == 1) {
                        Statics.field1402.method775(765, 503);
                    } else {
                        Statics.field1402.method775(7680, 2160);
                    }
                    if (client.field948 >= 25) {
                        client.method131();
                    }
                }
                var233 = 1;
            } else if (arg0 == 5308) {
                field1349[++Statics.field871 - 1] = Statics.field2396.field1322;
                var233 = 1;
            } else if (arg0 == 5309) {
                int var235 = field1349[--Statics.field871];
                if (var235 == 1 || var235 == 2) {
                    Statics.field2396.field1322 = var235;
                    class81.method163();
                }
                var233 = 1;
            } else {
                var233 = 2;
            }
            return var233;
        } else if (arg0 < 5600) {
            return method1712(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method39(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method579(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method578(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            byte var239;
            if (arg0 == 6600) {
                int var236 = Statics.field409;
                int var237 = (Statics.field908.field1233 >> 7) + Statics.field2202;
                int var238 = (Statics.field908.field1232 >> 7) + Statics.field840;
                client.method658().method4829(var236, var237, var238, true);
                var239 = 1;
            } else if (arg0 == 6601) {
                int var240 = field1349[--Statics.field871];
                String var241 = "";
                class33 var242 = client.method658().method4838(var240);
                if (var242 != null) {
                    var241 = var242.method282();
                }
                field1348[++Statics.field2342 - 1] = var241;
                var239 = 1;
            } else if (arg0 == 6602) {
                int var243 = field1349[--Statics.field871];
                client.method658().method4820(var243);
                var239 = 1;
            } else if (arg0 == 6603) {
                field1349[++Statics.field871 - 1] = client.method658().method4832();
                var239 = 1;
            } else if (arg0 == 6604) {
                int var244 = field1349[--Statics.field871];
                client.method658().method4846(var244);
                var239 = 1;
            } else if (arg0 == 6605) {
                field1349[++Statics.field871 - 1] = client.method658().method4945() ? 1 : 0;
                var239 = 1;
            } else if (arg0 == 6606) {
                class214 var245 = new class214(field1349[--Statics.field871]);
                client.method658().method4836(var245.field2617, var245.field2619);
                var239 = 1;
            } else if (arg0 == 6607) {
                class214 var246 = new class214(field1349[--Statics.field871]);
                client.method658().method4837(var246.field2617, var246.field2619);
                var239 = 1;
            } else if (arg0 == 6608) {
                class214 var247 = new class214(field1349[--Statics.field871]);
                client.method658().method4833(var247.field2618, var247.field2617, var247.field2619);
                var239 = 1;
            } else if (arg0 == 6609) {
                class214 var248 = new class214(field1349[--Statics.field871]);
                client.method658().method4961(var248.field2618, var248.field2617, var248.field2619);
                var239 = 1;
            } else if (arg0 == 6610) {
                field1349[++Statics.field871 - 1] = client.method658().method4897();
                field1349[++Statics.field871 - 1] = client.method658().method4866();
                var239 = 1;
            } else if (arg0 == 6611) {
                int var249 = field1349[--Statics.field871];
                class33 var250 = client.method658().method4838(var249);
                if (var250 == null) {
                    field1349[++Statics.field871 - 1] = 0;
                } else {
                    field1349[++Statics.field871 - 1] = var250.method265().method3679();
                }
                var239 = 1;
            } else if (arg0 == 6612) {
                int var251 = field1349[--Statics.field871];
                class33 var252 = client.method658().method4838(var251);
                if (var252 == null) {
                    field1349[++Statics.field871 - 1] = 0;
                    field1349[++Statics.field871 - 1] = 0;
                } else {
                    field1349[++Statics.field871 - 1] = (var252.method279() - var252.method319() + 1) * 64;
                    field1349[++Statics.field871 - 1] = (var252.method281() - var252.method332() + 1) * 64;
                }
                var239 = 1;
            } else if (arg0 == 6613) {
                int var253 = field1349[--Statics.field871];
                class33 var254 = client.method658().method4838(var253);
                if (var254 == null) {
                    field1349[++Statics.field871 - 1] = 0;
                    field1349[++Statics.field871 - 1] = 0;
                    field1349[++Statics.field871 - 1] = 0;
                    field1349[++Statics.field871 - 1] = 0;
                } else {
                    field1349[++Statics.field871 - 1] = var254.method319() * 64;
                    field1349[++Statics.field871 - 1] = var254.method332() * 64;
                    field1349[++Statics.field871 - 1] = var254.method279() * 64 + 64 - 1;
                    field1349[++Statics.field871 - 1] = var254.method281() * 64 + 64 - 1;
                }
                var239 = 1;
            } else if (arg0 == 6614) {
                int var255 = field1349[--Statics.field871];
                class33 var256 = client.method658().method4838(var255);
                if (var256 == null) {
                    field1349[++Statics.field871 - 1] = -1;
                } else {
                    field1349[++Statics.field871 - 1] = var256.method277();
                }
                var239 = 1;
            } else if (arg0 == 6615) {
                class214 var257 = client.method658().method4818();
                if (var257 == null) {
                    field1349[++Statics.field871 - 1] = -1;
                    field1349[++Statics.field871 - 1] = -1;
                } else {
                    field1349[++Statics.field871 - 1] = var257.field2617;
                    field1349[++Statics.field871 - 1] = var257.field2619;
                }
                var239 = 1;
            } else if (arg0 == 6616) {
                field1349[++Statics.field871 - 1] = client.method658().method4935();
                var239 = 1;
            } else if (arg0 == 6617) {
                class214 var258 = new class214(field1349[--Statics.field871]);
                class33 var259 = client.method658().method4822();
                if (var259 == null) {
                    field1349[++Statics.field871 - 1] = -1;
                    field1349[++Statics.field871 - 1] = -1;
                    var239 = 1;
                } else {
                    int[] var260 = var259.method269(var258.field2618, var258.field2617, var258.field2619);
                    if (var260 == null) {
                        field1349[++Statics.field871 - 1] = -1;
                        field1349[++Statics.field871 - 1] = -1;
                    } else {
                        field1349[++Statics.field871 - 1] = var260[0];
                        field1349[++Statics.field871 - 1] = var260[1];
                    }
                    var239 = 1;
                }
            } else if (arg0 == 6618) {
                class214 var261 = new class214(field1349[--Statics.field871]);
                class33 var262 = client.method658().method4822();
                if (var262 == null) {
                    field1349[++Statics.field871 - 1] = -1;
                    field1349[++Statics.field871 - 1] = -1;
                    var239 = 1;
                } else {
                    class214 var263 = var262.method270(var261.field2617, var261.field2619);
                    if (var263 == null) {
                        field1349[++Statics.field871 - 1] = -1;
                    } else {
                        field1349[++Statics.field871 - 1] = var263.method3679();
                    }
                    var239 = 1;
                }
            } else if (arg0 == 6619) {
                Statics.field871 -= 2;
                int var264 = field1349[Statics.field871];
                class214 var265 = new class214(field1349[Statics.field871 + 1]);
                method507(var264, var265, false);
                var239 = 1;
            } else if (arg0 == 6620) {
                Statics.field871 -= 2;
                int var266 = field1349[Statics.field871];
                class214 var267 = new class214(field1349[Statics.field871 + 1]);
                method507(var266, var267, true);
                var239 = 1;
            } else if (arg0 == 6621) {
                Statics.field871 -= 2;
                int var268 = field1349[Statics.field871];
                class214 var269 = new class214(field1349[Statics.field871 + 1]);
                class33 var270 = client.method658().method4838(var268);
                if (var270 == null) {
                    field1349[++Statics.field871 - 1] = 0;
                    var239 = 1;
                } else {
                    field1349[++Statics.field871 - 1] = var270.method267(var269.field2618, var269.field2617, var269.field2619) ? 1 : 0;
                    var239 = 1;
                }
            } else if (arg0 == 6622) {
                field1349[++Statics.field871 - 1] = client.method658().method4843();
                field1349[++Statics.field871 - 1] = client.method658().method4844();
                var239 = 1;
            } else if (arg0 == 6623) {
                class214 var271 = new class214(field1349[--Statics.field871]);
                class33 var272 = client.method658().method4816(var271.field2618, var271.field2617, var271.field2619);
                if (var272 == null) {
                    field1349[++Statics.field871 - 1] = -1;
                } else {
                    field1349[++Statics.field871 - 1] = var272.method272();
                }
                var239 = 1;
            } else if (arg0 == 6624) {
                client.method658().method4845(field1349[--Statics.field871]);
                var239 = 1;
            } else if (arg0 == 6625) {
                client.method658().method4951();
                var239 = 1;
            } else if (arg0 == 6626) {
                client.method658().method4847(field1349[--Statics.field871]);
                var239 = 1;
            } else if (arg0 == 6627) {
                client.method658().method4848();
                var239 = 1;
            } else if (arg0 == 6628) {
                boolean var273 = field1349[--Statics.field871] == 1;
                client.method658().method4849(var273);
                var239 = 1;
            } else if (arg0 == 6629) {
                int var274 = field1349[--Statics.field871];
                client.method658().method4904(var274);
                var239 = 1;
            } else if (arg0 == 6630) {
                int var275 = field1349[--Statics.field871];
                client.method658().method4957(var275);
                var239 = 1;
            } else if (arg0 == 6631) {
                client.method658().method4852();
                var239 = 1;
            } else if (arg0 == 6632) {
                boolean var276 = field1349[--Statics.field871] == 1;
                client.method658().method4853(var276);
                var239 = 1;
            } else if (arg0 == 6633) {
                Statics.field871 -= 2;
                int var277 = field1349[Statics.field871];
                boolean var278 = field1349[Statics.field871 + 1] == 1;
                client.method658().method4976(var277, var278);
                var239 = 1;
            } else if (arg0 == 6634) {
                Statics.field871 -= 2;
                int var279 = field1349[Statics.field871];
                boolean var280 = field1349[Statics.field871 + 1] == 1;
                client.method658().method4855(var279, var280);
                var239 = 1;
            } else if (arg0 == 6635) {
                field1349[++Statics.field871 - 1] = client.method658().method4856() ? 1 : 0;
                var239 = 1;
            } else if (arg0 == 6636) {
                int var281 = field1349[--Statics.field871];
                field1349[++Statics.field871 - 1] = client.method658().method4857(var281) ? 1 : 0;
                var239 = 1;
            } else if (arg0 == 6637) {
                int var282 = field1349[--Statics.field871];
                field1349[++Statics.field871 - 1] = client.method658().method4858(var282) ? 1 : 0;
                var239 = 1;
            } else if (arg0 == 6638) {
                Statics.field871 -= 2;
                int var283 = field1349[Statics.field871];
                class214 var284 = new class214(field1349[Statics.field871 + 1]);
                class214 var285 = client.method658().method4861(var283, var284);
                if (var285 == null) {
                    field1349[++Statics.field871 - 1] = -1;
                } else {
                    field1349[++Statics.field871 - 1] = var285.method3679();
                }
                var239 = 1;
            } else if (arg0 == 6639) {
                class40 var286 = client.method658().method4863();
                if (var286 == null) {
                    field1349[++Statics.field871 - 1] = -1;
                    field1349[++Statics.field871 - 1] = -1;
                } else {
                    field1349[++Statics.field871 - 1] = var286.field544;
                    field1349[++Statics.field871 - 1] = var286.field553.method3679();
                }
                var239 = 1;
            } else if (arg0 == 6640) {
                class40 var287 = client.method658().method4911();
                if (var287 == null) {
                    field1349[++Statics.field871 - 1] = -1;
                    field1349[++Statics.field871 - 1] = -1;
                } else {
                    field1349[++Statics.field871 - 1] = var287.field544;
                    field1349[++Statics.field871 - 1] = var287.field553.method3679();
                }
                var239 = 1;
            } else if (arg0 == 6693) {
                int var288 = field1349[--Statics.field871];
                class244 var289 = Statics.field3295[var288];
                if (var289.field3300 == null) {
                    field1348[++Statics.field2342 - 1] = "";
                } else {
                    field1348[++Statics.field2342 - 1] = var289.field3300;
                }
                var239 = 1;
            } else if (arg0 == 6694) {
                int var290 = field1349[--Statics.field871];
                class244 var291 = Statics.field3295[var290];
                field1349[++Statics.field871 - 1] = var291.field3302;
                var239 = 1;
            } else if (arg0 == 6695) {
                int var292 = field1349[--Statics.field871];
                class244 var293 = Statics.field3295[var292];
                if (var293 == null) {
                    field1349[++Statics.field871 - 1] = -1;
                } else {
                    field1349[++Statics.field871 - 1] = var293.field3314;
                }
                var239 = 1;
            } else if (arg0 == 6696) {
                int var294 = field1349[--Statics.field871];
                class244 var295 = Statics.field3295[var294];
                if (var295 == null) {
                    field1349[++Statics.field871 - 1] = -1;
                } else {
                    field1349[++Statics.field871 - 1] = var295.field3298;
                }
                var239 = 1;
            } else if (arg0 == 6697) {
                field1349[++Statics.field871 - 1] = Statics.field1544.field614;
                var239 = 1;
            } else if (arg0 == 6698) {
                field1349[++Statics.field871 - 1] = Statics.field1544.field616.method3679();
                var239 = 1;
            } else if (arg0 == 6699) {
                field1349[++Statics.field871 - 1] = Statics.field1544.field615.method3679();
                var239 = 1;
            } else {
                var239 = 2;
            }
            return var239;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ct.r(ILck;ZI)I")
    public static int method1561(int arg0, class99 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field871 -= 3;
            int var3 = field1349[Statics.field871];
            int var4 = field1349[Statics.field871 + 1];
            int var5 = field1349[Statics.field871 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class218 var6 = class218.method2924(var3);
            if (var6.field2680 == null) {
                var6.field2680 = new class218[var5 + 1];
            }
            if (var6.field2680.length <= var5) {
                class218[] var7 = new class218[var5 + 1];
                for (int var8 = 0; var8 < var6.field2680.length; var8++) {
                    var7[var8] = var6.field2680[var8];
                }
                var6.field2680 = var7;
            }
            if (var5 > 0 && var6.field2680[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class218 var9 = new class218();
            var9.field2661 = var4;
            var9.field2678 = var9.field2659 = var6.field2659;
            var9.field2744 = var5;
            var9.field2658 = true;
            var6.field2680[var5] = var9;
            if (arg2) {
                Statics.field453 = var9;
            } else {
                Statics.field367 = var9;
            }
            client.method31(var6);
            return 1;
        } else if (arg0 == 101) {
            class218 var10 = arg2 ? Statics.field453 : Statics.field367;
            class218 var11 = class218.method2924(var10.field2659);
            var11.field2680[var10.field2744] = null;
            client.method31(var11);
            return 1;
        } else if (arg0 == 102) {
            class218 var12 = class218.method2924(field1349[--Statics.field871]);
            var12.field2680 = null;
            client.method31(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field871 -= 2;
            int var13 = field1349[Statics.field871];
            int var14 = field1349[Statics.field871 + 1];
            class218 var15 = class218.method1697(var13, var14);
            if (var15 == null || var14 == -1) {
                field1349[++Statics.field871 - 1] = 0;
            } else {
                field1349[++Statics.field871 - 1] = 1;
                if (arg2) {
                    Statics.field453 = var15;
                } else {
                    Statics.field367 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class218 var16 = class218.method2924(field1349[--Statics.field871]);
            if (var16 == null) {
                field1349[++Statics.field871 - 1] = 0;
            } else {
                field1349[++Statics.field871 - 1] = 1;
                if (arg2) {
                    Statics.field453 = var16;
                } else {
                    Statics.field367 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ba.o(ILck;ZI)I")
    public static int method990(int arg0, class99 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1349[--Statics.field871];
            var4 = class218.method2924(var3);
        } else {
            var4 = arg2 ? Statics.field453 : Statics.field367;
        }
        if (arg0 == 1000) {
            Statics.field871 -= 4;
            var4.field2668 = field1349[Statics.field871];
            var4.field2721 = field1349[Statics.field871 + 1];
            var4.field2664 = field1349[Statics.field871 + 2];
            var4.field2665 = field1349[Statics.field871 + 3];
            client.method31(var4);
            Statics.field1402.method1291(var4);
            if (var3 != -1 && var4.field2661 == 0) {
                client.method1001(Statics.field3666[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field871 -= 4;
            var4.field2686 = field1349[Statics.field871];
            var4.field2671 = field1349[Statics.field871 + 1];
            var4.field2666 = field1349[Statics.field871 + 2];
            var4.field2667 = field1349[Statics.field871 + 3];
            client.method31(var4);
            Statics.field1402.method1291(var4);
            if (var3 != -1 && var4.field2661 == 0) {
                client.method1001(Statics.field3666[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1349[--Statics.field871] == 1;
            if (var4.field2679 != var5) {
                var4.field2679 = var5;
                client.method31(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2655 = field1349[--Statics.field871] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2793 = field1349[--Statics.field871] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("p.n(ILck;ZI)I")
    public static int method152(int arg0, class99 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1349[--Statics.field871];
            var4 = class218.method2924(var3);
        } else {
            var4 = arg2 ? Statics.field453 : Statics.field367;
        }
        if (arg0 == 1100) {
            Statics.field871 -= 2;
            var4.field2709 = field1349[Statics.field871];
            if (var4.field2709 > var4.field2674 - var4.field2739) {
                var4.field2709 = var4.field2674 - var4.field2739;
            }
            if (var4.field2709 < 0) {
                var4.field2709 = 0;
            }
            var4.field2681 = field1349[Statics.field871 + 1];
            if (var4.field2681 > var4.field2683 - var4.field2675) {
                var4.field2681 = var4.field2683 - var4.field2675;
            }
            if (var4.field2681 < 0) {
                var4.field2681 = 0;
            }
            client.method31(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2792 = field1349[--Statics.field871];
            client.method31(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2688 = field1349[--Statics.field871] == 1;
            client.method31(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2690 = field1349[--Statics.field871];
            client.method31(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2692 = field1349[--Statics.field871];
            client.method31(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2694 = field1349[--Statics.field871];
            client.method31(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2696 = field1349[--Statics.field871];
            client.method31(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2697 = field1349[--Statics.field871] == 1;
            client.method31(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2782 = 1;
            var4.field2703 = field1349[--Statics.field871];
            client.method31(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field871 -= 6;
            var4.field2708 = field1349[Statics.field871];
            var4.field2648 = field1349[Statics.field871 + 1];
            var4.field2710 = field1349[Statics.field871 + 2];
            var4.field2711 = field1349[Statics.field871 + 3];
            var4.field2737 = field1349[Statics.field871 + 4];
            var4.field2713 = field1349[Statics.field871 + 5];
            client.method31(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1349[--Statics.field871];
            if (var4.field2784 != var5) {
                var4.field2784 = var5;
                var4.field2781 = 0;
                var4.field2735 = 0;
                client.method31(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2695 = field1349[--Statics.field871] == 1;
            client.method31(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1348[--Statics.field2342];
            if (!var6.equals(var4.field2719)) {
                var4.field2719 = var6;
                client.method31(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2787 = field1349[--Statics.field871];
            client.method31(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field871 -= 3;
            var4.field2722 = field1349[Statics.field871];
            var4.field2723 = field1349[Statics.field871 + 1];
            var4.field2732 = field1349[Statics.field871 + 2];
            client.method31(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2724 = field1349[--Statics.field871] == 1;
            client.method31(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2698 = field1349[--Statics.field871];
            client.method31(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2699 = field1349[--Statics.field871];
            client.method31(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2765 = field1349[--Statics.field871] == 1;
            client.method31(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2701 = field1349[--Statics.field871] == 1;
            client.method31(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field871 -= 2;
            var4.field2674 = field1349[Statics.field871];
            var4.field2683 = field1349[Statics.field871 + 1];
            client.method31(var4);
            if (var3 != -1 && var4.field2661 == 0) {
                client.method1001(Statics.field3666[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2659;
            int var8 = var4.field2744;
            client.field986.method3243(46);
            client.field986.method3026(var8);
            client.field986.method3118(var7);
            client.field1087 = var4;
            client.method31(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2669 = field1349[--Statics.field871];
            client.method31(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2685 = field1349[--Statics.field871];
            client.method31(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2691 = field1349[--Statics.field871];
            client.method31(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var9 = field1349[--Statics.field871];
            class285 var10 = (class285) class170.method1570(class285.method496(), var9);
            if (var10 != null) {
                var4.field2689 = var10;
                client.method31(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var11 = field1349[--Statics.field871] == 1;
            var4.field2693 = var11;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hi.q(ILck;ZI)I")
    public static int method3788(int arg0, class99 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method2924(field1349[--Statics.field871]);
        } else {
            var3 = arg2 ? Statics.field453 : Statics.field367;
        }
        client.method31(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field871 -= 2;
            int var4 = field1349[Statics.field871];
            int var5 = field1349[Statics.field871 + 1];
            var3.field2779 = var4;
            var3.field2780 = var5;
            class258 var6 = class258.method2955(var4);
            var3.field2710 = var6.field3500;
            var3.field2711 = var6.field3485;
            var3.field2737 = var6.field3502;
            var3.field2708 = var6.field3503;
            var3.field2648 = var6.field3504;
            var3.field2713 = var6.field3508;
            if (arg0 == 1205) {
                var3.field2717 = 0;
            } else if (arg0 == 1212 | var6.field3491 == 1) {
                var3.field2717 = 1;
            } else {
                var3.field2717 = 2;
            }
            if (var3.field2714 > 0) {
                var3.field2713 = var3.field2713 * 32 / var3.field2714;
            } else if (var3.field2686 > 0) {
                var3.field2713 = var3.field2713 * 32 / var3.field2686;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2782 = 2;
            var3.field2703 = field1349[--Statics.field871];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2782 = 3;
            var3.field2703 = Statics.field908.field902.method3711();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bv.b(ILck;ZI)I")
    public static int method754(int arg0, class99 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method2924(field1349[--Statics.field871]);
        } else {
            var3 = arg2 ? Statics.field453 : Statics.field367;
        }
        if (arg0 == 1300) {
            int var4 = field1349[--Statics.field871] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3749(var4, field1348[--Statics.field2342]);
                return 1;
            } else {
                Statics.field2342--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field871 -= 2;
            int var5 = field1349[Statics.field871];
            int var6 = field1349[Statics.field871 + 1];
            var3.field2734 = class218.method1697(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2716 = field1349[--Statics.field871] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2660 = field1349[--Statics.field871];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2650 = field1349[--Statics.field871];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2682 = field1348[--Statics.field2342];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2654 = field1348[--Statics.field2342];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2733 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bg.k(ILck;ZI)I")
    public static int method1401(int arg0, class99 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method2924(field1349[--Statics.field871]);
        } else {
            var3 = arg2 ? Statics.field453 : Statics.field367;
        }
        String var4 = field1348[--Statics.field2342];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1349[--Statics.field871];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1349[--Statics.field871];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1348[--Statics.field2342];
            } else {
                var7[var8] = Integer.valueOf(field1349[--Statics.field871]);
            }
        }
        int var9 = field1349[--Statics.field871];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2670 = var7;
        } else if (arg0 == 1401) {
            var3.field2743 = var7;
        } else if (arg0 == 1402) {
            var3.field2712 = var7;
        } else if (arg0 == 1403) {
            var3.field2767 = var7;
        } else if (arg0 == 1404) {
            var3.field2747 = var7;
        } else if (arg0 == 1405) {
            var3.field2748 = var7;
        } else if (arg0 == 1406) {
            var3.field2751 = var7;
        } else if (arg0 == 1407) {
            var3.field2752 = var7;
            var3.field2753 = var5;
        } else if (arg0 == 1408) {
            var3.field2758 = var7;
        } else if (arg0 == 1409) {
            var3.field2702 = var7;
        } else if (arg0 == 1410) {
            var3.field2731 = var7;
        } else if (arg0 == 1411) {
            var3.field2745 = var7;
        } else if (arg0 == 1412) {
            var3.field2746 = var7;
        } else if (arg0 == 1414) {
            var3.field2754 = var7;
            var3.field2755 = var5;
        } else if (arg0 == 1415) {
            var3.field2756 = var7;
            var3.field2757 = var5;
        } else if (arg0 == 1416) {
            var3.field2750 = var7;
        } else if (arg0 == 1417) {
            var3.field2760 = var7;
        } else if (arg0 == 1418) {
            var3.field2761 = var7;
        } else if (arg0 == 1419) {
            var3.field2649 = var7;
        } else if (arg0 == 1420) {
            var3.field2763 = var7;
        } else if (arg0 == 1421) {
            var3.field2764 = var7;
        } else if (arg0 == 1422) {
            var3.field2791 = var7;
        } else if (arg0 == 1423) {
            var3.field2766 = var7;
        } else if (arg0 == 1424) {
            var3.field2789 = var7;
        } else if (arg0 == 1425) {
            var3.field2769 = var7;
        } else if (arg0 == 1426) {
            var3.field2738 = var7;
        } else if (arg0 == 1427) {
            var3.field2768 = var7;
        } else {
            return 2;
        }
        var3.field2786 = true;
        return 1;
    }

    @ObfuscatedName("cy.s(ILck;ZI)I")
    public static int method1690(int arg0, class99 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field453 : Statics.field367;
        if (arg0 == 1600) {
            field1349[++Statics.field871 - 1] = var3.field2709;
            return 1;
        } else if (arg0 == 1601) {
            field1349[++Statics.field871 - 1] = var3.field2681;
            return 1;
        } else if (arg0 == 1602) {
            field1348[++Statics.field2342 - 1] = var3.field2719;
            return 1;
        } else if (arg0 == 1603) {
            field1349[++Statics.field871 - 1] = var3.field2674;
            return 1;
        } else if (arg0 == 1604) {
            field1349[++Statics.field871 - 1] = var3.field2683;
            return 1;
        } else if (arg0 == 1605) {
            field1349[++Statics.field871 - 1] = var3.field2713;
            return 1;
        } else if (arg0 == 1606) {
            field1349[++Statics.field871 - 1] = var3.field2710;
            return 1;
        } else if (arg0 == 1607) {
            field1349[++Statics.field871 - 1] = var3.field2737;
            return 1;
        } else if (arg0 == 1608) {
            field1349[++Statics.field871 - 1] = var3.field2711;
            return 1;
        } else if (arg0 == 1609) {
            field1349[++Statics.field871 - 1] = var3.field2690;
            return 1;
        } else if (arg0 == 1610) {
            field1349[++Statics.field871 - 1] = var3.field2691;
            return 1;
        } else if (arg0 == 1611) {
            field1349[++Statics.field871 - 1] = var3.field2792;
            return 1;
        } else if (arg0 == 1612) {
            field1349[++Statics.field871 - 1] = var3.field2685;
            return 1;
        } else if (arg0 == 1613) {
            field1349[++Statics.field871 - 1] = var3.field2689.method6();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("u.d(ILck;ZI)I")
    public static int method123(int arg0, class99 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field453 : Statics.field367;
        if (arg0 == 1700) {
            field1349[++Statics.field871 - 1] = var3.field2779;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2779 == -1) {
                field1349[++Statics.field871 - 1] = 0;
            } else {
                field1349[++Statics.field871 - 1] = var3.field2780;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1349[++Statics.field871 - 1] = var3.field2744;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.l(ILck;ZI)I")
    public static int method40(int arg0, class99 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method2924(field1349[--Statics.field871]);
        } else {
            var3 = arg2 ? Statics.field453 : Statics.field367;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1355 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2768 == null) {
            return 0;
        } else {
            class70 var4 = new class70();
            var4.field859 = var3;
            var4.field865 = var3.field2768;
            var4.field864 = field1355 + 1;
            client.field1131.method3405(var4);
            return 1;
        }
    }

    @ObfuscatedName("as.c(ILck;ZI)I")
    public static int method654(int arg0, class99 arg1, boolean arg2) {
        class218 var3 = class218.method2924(field1349[--Statics.field871]);
        if (arg0 == 2600) {
            field1349[++Statics.field871 - 1] = var3.field2709;
            return 1;
        } else if (arg0 == 2601) {
            field1349[++Statics.field871 - 1] = var3.field2681;
            return 1;
        } else if (arg0 == 2602) {
            field1348[++Statics.field2342 - 1] = var3.field2719;
            return 1;
        } else if (arg0 == 2603) {
            field1349[++Statics.field871 - 1] = var3.field2674;
            return 1;
        } else if (arg0 == 2604) {
            field1349[++Statics.field871 - 1] = var3.field2683;
            return 1;
        } else if (arg0 == 2605) {
            field1349[++Statics.field871 - 1] = var3.field2713;
            return 1;
        } else if (arg0 == 2606) {
            field1349[++Statics.field871 - 1] = var3.field2710;
            return 1;
        } else if (arg0 == 2607) {
            field1349[++Statics.field871 - 1] = var3.field2737;
            return 1;
        } else if (arg0 == 2608) {
            field1349[++Statics.field871 - 1] = var3.field2711;
            return 1;
        } else if (arg0 == 2609) {
            field1349[++Statics.field871 - 1] = var3.field2690;
            return 1;
        } else if (arg0 == 2610) {
            field1349[++Statics.field871 - 1] = var3.field2691;
            return 1;
        } else if (arg0 == 2611) {
            field1349[++Statics.field871 - 1] = var3.field2792;
            return 1;
        } else if (arg0 == 2612) {
            field1349[++Statics.field871 - 1] = var3.field2685;
            return 1;
        } else if (arg0 == 2613) {
            field1349[++Statics.field871 - 1] = var3.field2689.method6();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fa.u(ILck;ZI)I")
    public static int method2960(int arg0, class99 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class218 var3 = class218.method2924(field1349[--Statics.field871]);
            field1349[++Statics.field871 - 1] = var3.field2779;
            return 1;
        } else if (arg0 == 2701) {
            class218 var4 = class218.method2924(field1349[--Statics.field871]);
            if (var4.field2779 == -1) {
                field1349[++Statics.field871 - 1] = 0;
            } else {
                field1349[++Statics.field871 - 1] = var4.field2780;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1349[--Statics.field871];
            class69 var6 = (class69) client.field1093.method3358((long) var5);
            if (var6 == null) {
                field1349[++Statics.field871 - 1] = 0;
            } else {
                field1349[++Statics.field871 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1349[++Statics.field871 - 1] = client.field1092;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fr.e(ILck;ZB)I")
    public static int method2893(int arg0, class99 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1349[++Statics.field871 - 1] = client.field973;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field871 -= 2;
            int var3 = field1349[Statics.field871];
            int var4 = field1349[Statics.field871 + 1];
            int[] var5 = field1349;
            int var6 = ++Statics.field871 - 1;
            class64 var7 = (class64) class64.field790.method3358((long) var3);
            int var8;
            if (var7 == null) {
                var8 = -1;
            } else if (var4 >= 0 && var4 < var7.field789.length) {
                var8 = var7.field789[var4];
            } else {
                var8 = -1;
            }
            var5[var6] = var8;
            return 1;
        } else if (arg0 == 3302) {
            Statics.field871 -= 2;
            int var9 = field1349[Statics.field871];
            int var10 = field1349[Statics.field871 + 1];
            field1349[++Statics.field871 - 1] = Statics.method118(var9, var10);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field871 -= 2;
            int var11 = field1349[Statics.field871];
            int var12 = field1349[Statics.field871 + 1];
            field1349[++Statics.field871 - 1] = class64.method1571(var11, var12);
            return 1;
        } else if (arg0 == 3304) {
            int var13 = field1349[--Statics.field871];
            int[] var14 = field1349;
            int var15 = ++Statics.field871 - 1;
            class242 var16 = (class242) class242.field3283.method3347((long) var13);
            class242 var17;
            if (var16 == null) {
                byte[] var18 = Statics.field3285.method3824(5, var13);
                class242 var19 = new class242();
                if (var18 != null) {
                    var19.method3953(new class175(var18));
                }
                class242.field3283.method3346(var19, (long) var13);
                var17 = var19;
            } else {
                var17 = var16;
            }
            var14[var15] = var17.field3282;
            return 1;
        } else if (arg0 == 3305) {
            int var20 = field1349[--Statics.field871];
            field1349[++Statics.field871 - 1] = client.field1096[var20];
            return 1;
        } else if (arg0 == 3306) {
            int var21 = field1349[--Statics.field871];
            field1349[++Statics.field871 - 1] = client.field1067[var21];
            return 1;
        } else if (arg0 == 3307) {
            int var22 = field1349[--Statics.field871];
            field1349[++Statics.field871 - 1] = client.field1068[var22];
            return 1;
        } else if (arg0 == 3308) {
            int var23 = Statics.field409;
            int var24 = (Statics.field908.field1233 >> 7) + Statics.field2202;
            int var25 = (Statics.field908.field1232 >> 7) + Statics.field840;
            field1349[++Statics.field871 - 1] = (var23 << 28) + (var24 << 14) + var25;
            return 1;
        } else if (arg0 == 3309) {
            int var26 = field1349[--Statics.field871];
            field1349[++Statics.field871 - 1] = var26 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var27 = field1349[--Statics.field871];
            field1349[++Statics.field871 - 1] = var27 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var28 = field1349[--Statics.field871];
            field1349[++Statics.field871 - 1] = var28 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1349[++Statics.field871 - 1] = client.field945 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field871 -= 2;
            int var29 = field1349[Statics.field871] + 32768;
            int var30 = field1349[Statics.field871 + 1];
            int[] var31 = field1349;
            int var32 = ++Statics.field871 - 1;
            class64 var33 = (class64) class64.field790.method3358((long) var29);
            int var34;
            if (var33 == null) {
                var34 = -1;
            } else if (var30 >= 0 && var30 < var33.field789.length) {
                var34 = var33.field789[var30];
            } else {
                var34 = -1;
            }
            var31[var32] = var34;
            return 1;
        } else if (arg0 == 3314) {
            Statics.field871 -= 2;
            int var35 = field1349[Statics.field871] + 32768;
            int var36 = field1349[Statics.field871 + 1];
            field1349[++Statics.field871 - 1] = Statics.method118(var35, var36);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field871 -= 2;
            int var37 = field1349[Statics.field871] + 32768;
            int var38 = field1349[Statics.field871 + 1];
            field1349[++Statics.field871 - 1] = class64.method1571(var37, var38);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field1099 >= 2) {
                field1349[++Statics.field871 - 1] = client.field1099;
            } else {
                field1349[++Statics.field871 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1349[++Statics.field871 - 1] = client.field1060;
            return 1;
        } else if (arg0 == 3318) {
            field1349[++Statics.field871 - 1] = client.field942;
            return 1;
        } else if (arg0 == 3321) {
            field1349[++Statics.field871 - 1] = client.field1050;
            return 1;
        } else if (arg0 == 3322) {
            field1349[++Statics.field871 - 1] = client.field972;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field953) {
                field1349[++Statics.field871 - 1] = 1;
            } else {
                field1349[++Statics.field871 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1349[++Statics.field871 - 1] = client.field943;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field871 -= 4;
            int var39 = field1349[Statics.field871];
            int var40 = field1349[Statics.field871 + 1];
            int var41 = field1349[Statics.field871 + 2];
            int var42 = field1349[Statics.field871 + 3];
            int var43 = (var40 << 14) + var39;
            int var44 = (var41 << 28) + var43;
            int var45 = var42 + var44;
            field1349[++Statics.field871 - 1] = var45;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.p(ILck;ZI)I")
    public static int method42(int arg0, class99 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (client.field1199 == 0) {
                field1349[++Statics.field871 - 1] = -2;
            } else if (client.field1199 == 1) {
                field1349[++Statics.field871 - 1] = -1;
            } else {
                field1349[++Statics.field871 - 1] = client.field1198;
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1349[--Statics.field871];
            if (client.field1199 == 2 && var3 < client.field1198) {
                field1348[++Statics.field2342 - 1] = client.field1073[var3].field823;
                field1348[++Statics.field2342 - 1] = client.field1073[var3].field818;
            } else {
                field1348[++Statics.field2342 - 1] = "";
                field1348[++Statics.field2342 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var4 = field1349[--Statics.field871];
            if (client.field1199 == 2 && var4 < client.field1198) {
                field1349[++Statics.field871 - 1] = client.field1073[var4].field820;
            } else {
                field1349[++Statics.field871 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var5 = field1349[--Statics.field871];
            if (client.field1199 == 2 && var5 < client.field1198) {
                field1349[++Statics.field871 - 1] = client.field1073[var5].field819;
            } else {
                field1349[++Statics.field871 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var6 = field1348[--Statics.field2342];
            int var7 = field1349[--Statics.field871];
            client.method231(var6, var7);
            return 1;
        } else if (arg0 == 3605) {
            String var8 = field1348[--Statics.field2342];
            client.method195(var8);
            return 1;
        } else if (arg0 == 3606) {
            String var9 = field1348[--Statics.field2342];
            if (var9 != null) {
                String var10 = class269.method2713(var9, Statics.field244);
                if (var10 != null) {
                    for (int var11 = 0; var11 < client.field1198; var11++) {
                        class66 var12 = client.field1073[var11];
                        String var13 = var12.field823;
                        String var14 = class269.method2713(var13, Statics.field244);
                        if (class279.method2703(var9, var10, var13, var14)) {
                            client.field1198--;
                            for (int var15 = var11; var15 < client.field1198; var15++) {
                                client.field1073[var15] = client.field1073[var15 + 1];
                            }
                            client.field1125 = client.field1167;
                            client.field986.method3243(114);
                            client.field986.method3102(class175.method1055(var9));
                            client.field986.method2984(var9);
                            break;
                        }
                    }
                }
            }
            return 1;
        } else if (arg0 == 3607) {
            String var16 = field1348[--Statics.field2342];
            client.method4140(var16, false);
            return 1;
        } else if (arg0 == 3608) {
            String var17 = field1348[--Statics.field2342];
            if (var17 != null) {
                String var18 = class269.method2713(var17, Statics.field244);
                if (var18 != null) {
                    for (int var19 = 0; var19 < client.field962; var19++) {
                        class71 var20 = client.field1203[var19];
                        String var21 = var20.field876;
                        String var22 = class269.method2713(var21, Statics.field244);
                        if (class279.method2703(var17, var18, var21, var22)) {
                            client.field962--;
                            for (int var23 = var19; var23 < client.field962; var23++) {
                                client.field1203[var23] = client.field1203[var23 + 1];
                            }
                            client.field1125 = client.field1167;
                            client.field986.method3243(180);
                            client.field986.method3102(class175.method1055(var17));
                            client.field986.method2984(var17);
                            break;
                        }
                    }
                }
            }
            return 1;
        } else if (arg0 == 3609) {
            String var24 = field1348[--Statics.field2342];
            class232[] var25 = new class232[] { class232.field3176, class232.field3175, class232.field3178, class232.field3180, class232.field3179, class232.field3182 };
            class232[] var26 = var25;
            for (int var27 = 0; var27 < var26.length; var27++) {
                class232 var28 = var26[var27];
                if (var28.field3177 != -1) {
                    int var30 = var28.field3177;
                    String var31 = "<img=" + var30 + ">";
                    if (var24.startsWith(var31)) {
                        var24 = var24.substring(6 + Integer.toString(var28.field3177).length());
                        break;
                    }
                }
            }
            field1349[++Statics.field871 - 1] = client.method1402(var24, false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (client.field1158 == null) {
                field1348[++Statics.field2342 - 1] = "";
            } else {
                field1348[++Statics.field2342 - 1] = class270.method1448(client.field1158);
            }
            return 1;
        } else if (arg0 == 3612) {
            if (client.field1158 == null) {
                field1349[++Statics.field871 - 1] = 0;
            } else {
                field1349[++Statics.field871 - 1] = Statics.field289;
            }
            return 1;
        } else if (arg0 == 3613) {
            int var32 = field1349[--Statics.field871];
            if (client.field1158 == null || var32 >= Statics.field289) {
                field1348[++Statics.field2342 - 1] = "";
            } else {
                field1348[++Statics.field2342 - 1] = Statics.field2849[var32].field940;
            }
            return 1;
        } else if (arg0 == 3614) {
            int var33 = field1349[--Statics.field871];
            if (client.field1158 == null || var33 >= Statics.field289) {
                field1349[++Statics.field871 - 1] = 0;
            } else {
                field1349[++Statics.field871 - 1] = Statics.field2849[var33].field934;
            }
            return 1;
        } else if (arg0 == 3615) {
            int var34 = field1349[--Statics.field871];
            if (client.field1158 == null || var34 >= Statics.field289) {
                field1349[++Statics.field871 - 1] = 0;
            } else {
                field1349[++Statics.field871 - 1] = Statics.field2849[var34].field932;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1349[++Statics.field871 - 1] = Statics.field245;
            return 1;
        } else if (arg0 == 3617) {
            String var35 = field1348[--Statics.field2342];
            if (Statics.field2849 != null) {
                client.field986.method3243(139);
                client.field986.method3102(class175.method1055(var35));
                client.field986.method2984(var35);
            }
            return 1;
        } else if (arg0 == 3618) {
            field1349[++Statics.field871 - 1] = Statics.field509;
            return 1;
        } else if (arg0 == 3619) {
            String var36 = field1348[--Statics.field2342];
            client.method745(var36);
            return 1;
        } else if (arg0 == 3620) {
            client.field986.method3243(144);
            client.field986.method3102(0);
            return 1;
        } else if (arg0 == 3621) {
            if (client.field1199 == 0) {
                field1349[++Statics.field871 - 1] = -1;
            } else {
                field1349[++Statics.field871 - 1] = client.field962;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var37 = field1349[--Statics.field871];
            if (client.field1199 == 0 || var37 >= client.field962) {
                field1348[++Statics.field2342 - 1] = "";
                field1348[++Statics.field2342 - 1] = "";
            } else {
                field1348[++Statics.field2342 - 1] = client.field1203[var37].field876;
                field1348[++Statics.field2342 - 1] = client.field1203[var37].field872;
            }
            return 1;
        } else if (arg0 == 3623) {
            String var38;
            label272: {
                var38 = field1348[--Statics.field2342];
                String var40 = "<img=0>";
                if (!var38.startsWith(var40)) {
                    String var42 = "<img=1>";
                    if (!var38.startsWith(var42)) {
                        break label272;
                    }
                }
                var38 = var38.substring(7);
            }
            field1349[++Statics.field871 - 1] = client.method187(var38) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var43 = field1349[--Statics.field871];
            if (Statics.field2849 == null || var43 >= Statics.field289 || !Statics.field2849[var43].field940.equalsIgnoreCase(Statics.field908.field925)) {
                field1349[++Statics.field871 - 1] = 0;
            } else {
                field1349[++Statics.field871 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (client.field1159 == null) {
                field1348[++Statics.field2342 - 1] = "";
            } else {
                field1348[++Statics.field2342 - 1] = class270.method1448(client.field1159);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.m(ILck;ZI)I")
    public static int method638(int arg0, class99 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1348[--Statics.field2342];
            int var4 = field1349[--Statics.field871];
            field1348[++Statics.field2342 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field2342 -= 2;
            String var5 = field1348[Statics.field2342];
            String var6 = field1348[Statics.field2342 + 1];
            field1348[++Statics.field2342 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1348[--Statics.field2342];
            int var8 = field1349[--Statics.field871];
            field1348[++Statics.field2342 - 1] = var7 + class272.method4(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1348[--Statics.field2342];
            field1348[++Statics.field2342 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1349[--Statics.field871];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1344.setTime(new Date(var11));
            int var13 = field1344.get(5);
            int var14 = field1344.get(2);
            int var15 = field1344.get(1);
            field1348[++Statics.field2342 - 1] = var13 + "-" + field1354[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field2342 -= 2;
            String var16 = field1348[Statics.field2342];
            String var17 = field1348[Statics.field2342 + 1];
            if (Statics.field908.field902 != null && Statics.field908.field902.field2634) {
                field1348[++Statics.field2342 - 1] = var17;
            } else {
                field1348[++Statics.field2342 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1349[--Statics.field871];
            field1348[++Statics.field2342 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field2342 -= 2;
            int[] var19 = field1349;
            int var20 = ++Statics.field871 - 1;
            int var21 = class166.method4634(field1348[Statics.field2342], field1348[Statics.field2342 + 1], client.field950);
            byte var22;
            if (var21 > 0) {
                var22 = 1;
            } else if (var21 < 0) {
                var22 = -1;
            } else {
                var22 = 0;
            }
            var19[var20] = var22;
            return 1;
        } else if (arg0 == 4108) {
            String var23 = field1348[--Statics.field2342];
            Statics.field871 -= 2;
            int var24 = field1349[Statics.field871];
            int var25 = field1349[Statics.field871 + 1];
            byte[] var26 = Statics.field2645.method3824(var25, 0);
            class265 var27 = new class265(var26);
            field1349[++Statics.field871 - 1] = var27.method4461(var23, var24);
            return 1;
        } else if (arg0 == 4109) {
            String var28 = field1348[--Statics.field2342];
            Statics.field871 -= 2;
            int var29 = field1349[Statics.field871];
            int var30 = field1349[Statics.field871 + 1];
            byte[] var31 = Statics.field2645.method3824(var30, 0);
            class265 var32 = new class265(var31);
            field1349[++Statics.field871 - 1] = var32.method4391(var28, var29);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field2342 -= 2;
            String var33 = field1348[Statics.field2342];
            String var34 = field1348[Statics.field2342 + 1];
            if (field1349[--Statics.field871] == 1) {
                field1348[++Statics.field2342 - 1] = var33;
            } else {
                field1348[++Statics.field2342 - 1] = var34;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var35 = field1348[--Statics.field2342];
            field1348[++Statics.field2342 - 1] = class266.method4463(var35);
            return 1;
        } else if (arg0 == 4112) {
            String var36 = field1348[--Statics.field2342];
            int var37 = field1349[--Statics.field871];
            field1348[++Statics.field2342 - 1] = var36 + (char) var37;
            return 1;
        } else if (arg0 == 4113) {
            int var38 = field1349[--Statics.field871];
            field1349[++Statics.field871 - 1] = class272.method552((char) var38) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var39 = field1349[--Statics.field871];
            field1349[++Statics.field871 - 1] = class272.method571((char) var39) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var40 = field1349[--Statics.field871];
            field1349[++Statics.field871 - 1] = class272.method3814((char) var40) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var41 = field1349[--Statics.field871];
            field1349[++Statics.field871 - 1] = class272.method715((char) var41) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var42 = field1348[--Statics.field2342];
            if (var42 == null) {
                field1349[++Statics.field871 - 1] = 0;
            } else {
                field1349[++Statics.field871 - 1] = var42.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var43 = field1348[--Statics.field2342];
            Statics.field871 -= 2;
            int var44 = field1349[Statics.field871];
            int var45 = field1349[Statics.field871 + 1];
            field1348[++Statics.field2342 - 1] = var43.substring(var44, var45);
            return 1;
        } else if (arg0 == 4119) {
            String var46 = field1348[--Statics.field2342];
            StringBuilder var47 = new StringBuilder(var46.length());
            boolean var48 = false;
            for (int var49 = 0; var49 < var46.length(); var49++) {
                char var50 = var46.charAt(var49);
                if (var50 == '<') {
                    var48 = true;
                } else if (var50 == '>') {
                    var48 = false;
                } else if (!var48) {
                    var47.append(var50);
                }
            }
            field1348[++Statics.field2342 - 1] = var47.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var51 = field1348[--Statics.field2342];
            int var52 = field1349[--Statics.field871];
            field1349[++Statics.field871 - 1] = var51.indexOf(var52);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field2342 -= 2;
            String var53 = field1348[Statics.field2342];
            String var54 = field1348[Statics.field2342 + 1];
            int var55 = field1349[--Statics.field871];
            field1349[++Statics.field871 - 1] = var53.indexOf(var54, var55);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cn.x(ILck;ZI)I")
    public static int method1712(int arg0, class99 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field871 -= 2;
            int var3 = field1349[Statics.field871];
            int var4 = field1349[Statics.field871 + 1];
            if (!client.field1179) {
                client.field957 = var3;
                client.field1016 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1349[++Statics.field871 - 1] = client.field957;
            return 1;
        } else if (arg0 == 5506) {
            field1349[++Statics.field871 - 1] = client.field1016;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1349[--Statics.field871];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field1021 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1349[++Statics.field871 - 1] = client.field1021;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.g(ILck;ZI)I")
    public static int method39(int arg0, class99 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field1059 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("an.w(ILck;ZB)I")
    public static int method579(int arg0, class99 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field871 -= 2;
            client.field1185 = (short) field1349[Statics.field871];
            if (client.field1185 <= 0) {
                client.field1185 = 256;
            }
            client.field1098 = (short) field1349[Statics.field871 + 1];
            if (client.field1098 <= 0) {
                client.field1098 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field871 -= 2;
            client.field1187 = (short) field1349[Statics.field871];
            if (client.field1187 <= 0) {
                client.field1187 = 256;
            }
            client.field1053 = (short) field1349[Statics.field871 + 1];
            if (client.field1053 <= 0) {
                client.field1053 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field871 -= 4;
            client.field1189 = (short) field1349[Statics.field871];
            if (client.field1189 <= 0) {
                client.field1189 = 1;
            }
            client.field1190 = (short) field1349[Statics.field871 + 1];
            if (client.field1190 <= 0) {
                client.field1190 = 32767;
            } else if (client.field1190 < client.field1189) {
                client.field1190 = client.field1189;
            }
            client.field1191 = (short) field1349[Statics.field871 + 2];
            if (client.field1191 <= 0) {
                client.field1191 = 1;
            }
            client.field1192 = (short) field1349[Statics.field871 + 3];
            if (client.field1192 <= 0) {
                client.field1192 = 32767;
            } else if (client.field1192 < client.field1191) {
                client.field1192 = client.field1191;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field1104 == null) {
                field1349[++Statics.field871 - 1] = -1;
                field1349[++Statics.field871 - 1] = -1;
            } else {
                client.method342(0, 0, client.field1104.field2739, client.field1104.field2675, false);
                field1349[++Statics.field871 - 1] = client.field1195;
                field1349[++Statics.field871 - 1] = client.field1196;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1349[++Statics.field871 - 1] = client.field1187;
            field1349[++Statics.field871 - 1] = client.field1053;
            return 1;
        } else if (arg0 == 6205) {
            field1349[++Statics.field871 - 1] = client.field1185;
            field1349[++Statics.field871 - 1] = client.field1098;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("an.ar(ILck;ZI)I")
    public static int method578(int arg0, class99 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1349[++Statics.field871 - 1] = class80.method1400() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class80.field1302 = 0;
            class80 var3 = class80.method2897();
            if (var3 == null) {
                field1349[++Statics.field871 - 1] = -1;
                field1349[++Statics.field871 - 1] = 0;
                field1348[++Statics.field2342 - 1] = "";
                field1349[++Statics.field871 - 1] = 0;
                field1349[++Statics.field871 - 1] = 0;
                field1348[++Statics.field2342 - 1] = "";
            } else {
                field1349[++Statics.field871 - 1] = var3.field1300;
                field1349[++Statics.field871 - 1] = var3.field1312;
                field1348[++Statics.field2342 - 1] = var3.field1297;
                field1349[++Statics.field871 - 1] = var3.field1310;
                field1349[++Statics.field871 - 1] = var3.field1307;
                field1348[++Statics.field2342 - 1] = var3.field1305;
            }
            return 1;
        } else if (arg0 == 6502) {
            class80 var5;
            if (class80.field1302 < class80.field1309) {
                var5 = Statics.field1301[++class80.field1302 - 1];
            } else {
                var5 = null;
            }
            if (var5 == null) {
                field1349[++Statics.field871 - 1] = -1;
                field1349[++Statics.field871 - 1] = 0;
                field1348[++Statics.field2342 - 1] = "";
                field1349[++Statics.field871 - 1] = 0;
                field1349[++Statics.field871 - 1] = 0;
                field1348[++Statics.field2342 - 1] = "";
            } else {
                field1349[++Statics.field871 - 1] = var5.field1300;
                field1349[++Statics.field871 - 1] = var5.field1312;
                field1348[++Statics.field2342 - 1] = var5.field1297;
                field1349[++Statics.field871 - 1] = var5.field1310;
                field1349[++Statics.field871 - 1] = var5.field1307;
                field1348[++Statics.field2342 - 1] = var5.field1305;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var7 = field1349[--Statics.field871];
            class80 var8 = null;
            for (int var9 = 0; var9 < class80.field1309; var9++) {
                if (Statics.field1301[var9].field1300 == var7) {
                    var8 = Statics.field1301[var9];
                    break;
                }
            }
            if (var8 == null) {
                field1349[++Statics.field871 - 1] = -1;
                field1349[++Statics.field871 - 1] = 0;
                field1348[++Statics.field2342 - 1] = "";
                field1349[++Statics.field871 - 1] = 0;
                field1349[++Statics.field871 - 1] = 0;
                field1348[++Statics.field2342 - 1] = "";
            } else {
                field1349[++Statics.field871 - 1] = var8.field1300;
                field1349[++Statics.field871 - 1] = var8.field1312;
                field1348[++Statics.field2342 - 1] = var8.field1297;
                field1349[++Statics.field871 - 1] = var8.field1310;
                field1349[++Statics.field871 - 1] = var8.field1307;
                field1348[++Statics.field2342 - 1] = var8.field1305;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field871 -= 4;
            int var10 = field1349[Statics.field871];
            boolean var11 = field1349[Statics.field871 + 1] == 1;
            int var12 = field1349[Statics.field871 + 2];
            boolean var13 = field1349[Statics.field871 + 3] == 1;
            class80.method646(var10, var11, var12, var13);
            return 1;
        } else if (arg0 == 6511) {
            int var14 = field1349[--Statics.field871];
            if (var14 >= 0 && var14 < class80.field1309) {
                class80 var15 = Statics.field1301[var14];
                field1349[++Statics.field871 - 1] = var15.field1300;
                field1349[++Statics.field871 - 1] = var15.field1312;
                field1348[++Statics.field2342 - 1] = var15.field1297;
                field1349[++Statics.field871 - 1] = var15.field1310;
                field1349[++Statics.field871 - 1] = var15.field1307;
                field1348[++Statics.field2342 - 1] = var15.field1305;
            } else {
                field1349[++Statics.field871 - 1] = -1;
                field1349[++Statics.field871 - 1] = 0;
                field1348[++Statics.field2342 - 1] = "";
                field1349[++Statics.field871 - 1] = 0;
                field1349[++Statics.field871 - 1] = 0;
                field1348[++Statics.field2342 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field1048 = field1349[--Statics.field871] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field871 -= 2;
            int var16 = field1349[Statics.field871];
            int var17 = field1349[Statics.field871 + 1];
            class253 var18 = Statics.method661(var17);
            if (var18.method4122()) {
                field1348[++Statics.field2342 - 1] = class260.method2968(var16).method4298(var17, var18.field3393);
            } else {
                field1349[++Statics.field871 - 1] = class260.method2968(var16).method4313(var17, var18.field3391);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field871 -= 2;
            int var19 = field1349[Statics.field871];
            int var20 = field1349[Statics.field871 + 1];
            class253 var21 = Statics.method661(var20);
            if (var21.method4122()) {
                field1348[++Statics.field2342 - 1] = class257.method2716(var19).method4206(var20, var21.field3393);
            } else {
                field1349[++Statics.field871 - 1] = class257.method2716(var19).method4202(var20, var21.field3391);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field871 -= 2;
            int var22 = field1349[Statics.field871];
            int var23 = field1349[Statics.field871 + 1];
            class253 var24 = Statics.method661(var23);
            if (var24.method4122()) {
                field1348[++Statics.field2342 - 1] = class258.method2955(var22).method4240(var23, var24.field3393);
            } else {
                field1349[++Statics.field871 - 1] = class258.method2955(var22).method4239(var23, var24.field3391);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field871 -= 2;
            int var25 = field1349[Statics.field871];
            int var26 = field1349[Statics.field871 + 1];
            class253 var27 = Statics.method661(var26);
            if (var27.method4122()) {
                String[] var28 = field1348;
                int var29 = ++Statics.field2342 - 1;
                class254 var30 = (class254) class254.field3400.method3347((long) var25);
                class254 var31;
                if (var30 == null) {
                    byte[] var32 = Statics.field3273.method3824(34, var25);
                    class254 var33 = new class254();
                    if (var32 != null) {
                        var33.method4134(new class175(var32));
                    }
                    var33.method4133();
                    class254.field3400.method3346(var33, (long) var25);
                    var31 = var33;
                } else {
                    var31 = var30;
                }
                var28[var29] = var31.method4152(var26, var27.field3393);
            } else {
                field1349[++Statics.field871 - 1] = class254.method3730(var25).method4136(var26, var27.field3391);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1349[++Statics.field871 - 1] = 0;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.ax(IB)V")
    public static void method794(int arg0) {
        if (arg0 == -1 || !class218.method66(arg0)) {
            return;
        }
        class218[] var1 = Statics.field3666[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3.field2740 != null) {
                class70 var4 = new class70();
                var4.field859 = var3;
                var4.field865 = var3.field2740;
                method260(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("ay.al(ILhs;ZI)V")
    public static void method507(int arg0, class214 arg1, boolean arg2) {
        class33 var3 = client.method658().method4838(arg0);
        int var4 = Statics.field908.field911;
        int var5 = (Statics.field908.field1233 >> 7) + Statics.field2202;
        int var6 = (Statics.field908.field1232 >> 7) + Statics.field840;
        class214 var7 = new class214(var4, var5, var6);
        client.method658().method4841(var3, var7, arg1, arg2);
    }
}
