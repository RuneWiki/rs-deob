package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cs")
public class class83 {

    @ObfuscatedName("cs.v")
    public static int[] field1263 = new int[5];

    @ObfuscatedName("cs.m")
    public static int[][] field1270 = new int[5][5000];

    @ObfuscatedName("cs.b")
    public static int[] field1265 = new int[1000];

    @ObfuscatedName("cs.p")
    public static String[] field1262 = new String[1000];

    @ObfuscatedName("cs.l")
    public static int field1268 = 0;

    @ObfuscatedName("cs.u")
    public static class63[] field1269 = new class63[50];

    @ObfuscatedName("cs.y")
    public static Calendar field1261 = Calendar.getInstance();

    @ObfuscatedName("cs.j")
    public static final String[] field1272 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cs.s")
    public static int field1273 = 0;

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.d(Lbx;I)V")
    public static void method86(class69 arg0) {
        method2974(arg0, 200000);
    }

    @ObfuscatedName("fz.x(Lbx;II)V")
    public static void method2974(class69 arg0, int arg1) {
        Object[] var2 = arg0.field798;
        class98 var25;
        if (class227.method160(arg0.field809)) {
            Statics.field381 = (class48) var2[0];
            class250 var3 = Statics.field3365[Statics.field381.field573];
            class227 var4 = arg0.field809;
            int var5 = var3.field3367;
            int var6 = var3.field3385;
            int var7 = (var5 << 8) + var4.field2875;
            class98 var9 = (class98) class98.field1442.method3418((long) (var7 << 16));
            class98 var10;
            if (var9 == null) {
                String var11 = String.valueOf(var7);
                int var12 = Statics.field11.method3951(var11);
                if (var12 == -1) {
                    var10 = null;
                } else {
                    label495: {
                        byte[] var13 = Statics.field11.method3941(var12);
                        if (var13 != null) {
                            if (var13.length <= 1) {
                                var10 = null;
                                break label495;
                            }
                            class98 var14 = class98.method72(var13);
                            if (var14 != null) {
                                class98.field1442.method3417(var14, (long) (var7 << 16));
                                var10 = var14;
                                break label495;
                            }
                        }
                        var10 = null;
                    }
                }
            } else {
                var10 = var9;
            }
            class98 var16;
            if (var10 == null) {
                int var17 = class232.method3789(var6, var4);
                class98 var18 = (class98) class98.field1442.method3418((long) (var17 << 16));
                class98 var19;
                if (var18 == null) {
                    String var20 = String.valueOf(var17);
                    int var21 = Statics.field11.method3951(var20);
                    if (var21 == -1) {
                        var19 = null;
                    } else {
                        label440: {
                            byte[] var22 = Statics.field11.method3941(var21);
                            if (var22 != null) {
                                if (var22.length <= 1) {
                                    var19 = null;
                                    break label440;
                                }
                                class98 var23 = class98.method72(var22);
                                if (var23 != null) {
                                    class98.field1442.method3417(var23, (long) (var17 << 16));
                                    var19 = var23;
                                    break label440;
                                }
                            }
                            var19 = null;
                        }
                    }
                } else {
                    var19 = var18;
                }
                if (var19 == null) {
                    var16 = null;
                } else {
                    var16 = var19;
                }
            } else {
                var16 = var10;
            }
            var25 = var16;
        } else {
            int var26 = (Integer) var2[0];
            class98 var27 = (class98) class98.field1442.method3418((long) var26);
            class98 var28;
            if (var27 == null) {
                byte[] var29 = Statics.field11.method3935(var26, 0);
                if (var29 == null) {
                    var28 = null;
                } else {
                    class98 var30 = class98.method72(var29);
                    class98.field1442.method3417(var30, (long) var26);
                    var28 = var30;
                }
            } else {
                var28 = var27;
            }
            var25 = var28;
        }
        if (var25 == null) {
            return;
        }
        Statics.field269 = 0;
        Statics.field1267 = 0;
        int var31 = -1;
        int[] var32 = var25.field1448;
        int[] var33 = var25.field1447;
        byte var34 = -1;
        field1268 = 0;
        try {
            Statics.field1260 = new int[var25.field1445];
            int var35 = 0;
            Statics.field624 = new String[var25.field1443];
            int var36 = 0;
            for (int var37 = 1; var37 < var2.length; var37++) {
                if (var2[var37] instanceof Integer) {
                    int var38 = (Integer) var2[var37];
                    if (var38 == -2147483647) {
                        var38 = arg0.field801;
                    }
                    if (var38 == -2147483646) {
                        var38 = arg0.field802;
                    }
                    if (var38 == -2147483645) {
                        var38 = arg0.field800 == null ? -1 : arg0.field800.field2725;
                    }
                    if (var38 == -2147483644) {
                        var38 = arg0.field807;
                    }
                    if (var38 == -2147483643) {
                        var38 = arg0.field800 == null ? -1 : arg0.field800.field2726;
                    }
                    if (var38 == -2147483642) {
                        var38 = arg0.field804 == null ? -1 : arg0.field804.field2725;
                    }
                    if (var38 == -2147483641) {
                        var38 = arg0.field804 == null ? -1 : arg0.field804.field2726;
                    }
                    if (var38 == -2147483640) {
                        var38 = arg0.field803;
                    }
                    if (var38 == -2147483639) {
                        var38 = arg0.field811;
                    }
                    Statics.field1260[var35++] = var38;
                } else if (var2[var37] instanceof String) {
                    String var39 = (String) var2[var37];
                    if (var39.equals("event_opbase")) {
                        var39 = arg0.field806;
                    }
                    Statics.field624[var36++] = var39;
                }
            }
            int var40 = 0;
            field1273 = arg0.field808;
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
                                                                                                                label267: while (true) {
                                                                                                                    var40++;
                                                                                                                    if (var40 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var31++;
                                                                                                                    int var77 = var32[var31];
                                                                                                                    if (var77 >= 100) {
                                                                                                                        boolean var71;
                                                                                                                        if (var25.field1447[var31] == 1) {
                                                                                                                            var71 = true;
                                                                                                                        } else {
                                                                                                                            var71 = false;
                                                                                                                        }
                                                                                                                        int var72 = method1590(var77, var25, var71);
                                                                                                                        switch(var72) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var77 == 0) {
                                                                                                                        field1265[++Statics.field269 - 1] = var33[var31];
                                                                                                                    } else if (var77 == 1) {
                                                                                                                        int var41 = var33[var31];
                                                                                                                        field1265[++Statics.field269 - 1] = class219.field2688[var41];
                                                                                                                    } else if (var77 == 2) {
                                                                                                                        int var42 = var33[var31];
                                                                                                                        class219.field2688[var42] = field1265[--Statics.field269];
                                                                                                                        client.method1596(var42);
                                                                                                                    } else if (var77 == 3) {
                                                                                                                        field1262[++Statics.field1267 - 1] = var25.field1444[var31];
                                                                                                                    } else if (var77 == 6) {
                                                                                                                        var31 += var33[var31];
                                                                                                                    } else if (var77 == 7) {
                                                                                                                        Statics.field269 -= 2;
                                                                                                                        if (field1265[Statics.field269] != field1265[Statics.field269 + 1]) {
                                                                                                                            var31 += var33[var31];
                                                                                                                        }
                                                                                                                    } else if (var77 == 8) {
                                                                                                                        Statics.field269 -= 2;
                                                                                                                        if (field1265[Statics.field269] == field1265[Statics.field269 + 1]) {
                                                                                                                            var31 += var33[var31];
                                                                                                                        }
                                                                                                                    } else if (var77 == 9) {
                                                                                                                        Statics.field269 -= 2;
                                                                                                                        if (field1265[Statics.field269] < field1265[Statics.field269 + 1]) {
                                                                                                                            var31 += var33[var31];
                                                                                                                        }
                                                                                                                    } else if (var77 == 10) {
                                                                                                                        Statics.field269 -= 2;
                                                                                                                        if (field1265[Statics.field269] > field1265[Statics.field269 + 1]) {
                                                                                                                            var31 += var33[var31];
                                                                                                                        }
                                                                                                                    } else if (var77 == 21) {
                                                                                                                        if (field1268 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var43 = field1269[--field1268];
                                                                                                                        var25 = var43.field743;
                                                                                                                        var32 = var25.field1448;
                                                                                                                        var33 = var25.field1447;
                                                                                                                        var31 = var43.field741;
                                                                                                                        Statics.field1260 = var43.field742;
                                                                                                                        Statics.field624 = var43.field740;
                                                                                                                    } else if (var77 == 25) {
                                                                                                                        int var44 = var33[var31];
                                                                                                                        field1265[++Statics.field269 - 1] = class219.method1016(var44);
                                                                                                                    } else if (var77 == 27) {
                                                                                                                        int var45 = var33[var31];
                                                                                                                        class219.method1738(var45, field1265[--Statics.field269]);
                                                                                                                    } else if (var77 == 31) {
                                                                                                                        Statics.field269 -= 2;
                                                                                                                        if (field1265[Statics.field269] <= field1265[Statics.field269 + 1]) {
                                                                                                                            var31 += var33[var31];
                                                                                                                        }
                                                                                                                    } else if (var77 == 32) {
                                                                                                                        Statics.field269 -= 2;
                                                                                                                        if (field1265[Statics.field269] >= field1265[Statics.field269 + 1]) {
                                                                                                                            var31 += var33[var31];
                                                                                                                        }
                                                                                                                    } else if (var77 == 33) {
                                                                                                                        field1265[++Statics.field269 - 1] = Statics.field1260[var33[var31]];
                                                                                                                    } else if (var77 == 34) {
                                                                                                                        Statics.field1260[var33[var31]] = field1265[--Statics.field269];
                                                                                                                    } else if (var77 == 35) {
                                                                                                                        field1262[++Statics.field1267 - 1] = Statics.field624[var33[var31]];
                                                                                                                    } else if (var77 == 36) {
                                                                                                                        Statics.field624[var33[var31]] = field1262[--Statics.field1267];
                                                                                                                    } else if (var77 == 37) {
                                                                                                                        int var46 = var33[var31];
                                                                                                                        Statics.field1267 -= var46;
                                                                                                                        String var47 = class278.method22(field1262, Statics.field1267, var46);
                                                                                                                        field1262[++Statics.field1267 - 1] = var47;
                                                                                                                    } else if (var77 == 38) {
                                                                                                                        Statics.field269--;
                                                                                                                    } else if (var77 == 39) {
                                                                                                                        Statics.field1267--;
                                                                                                                    } else if (var77 == 40) {
                                                                                                                        int var48 = var33[var31];
                                                                                                                        class98 var49 = (class98) class98.field1442.method3418((long) var48);
                                                                                                                        class98 var50;
                                                                                                                        if (var49 == null) {
                                                                                                                            byte[] var51 = Statics.field11.method3935(var48, 0);
                                                                                                                            if (var51 == null) {
                                                                                                                                var50 = null;
                                                                                                                            } else {
                                                                                                                                class98 var52 = class98.method72(var51);
                                                                                                                                class98.field1442.method3417(var52, (long) var48);
                                                                                                                                var50 = var52;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var50 = var49;
                                                                                                                        }
                                                                                                                        class98 var53 = var50;
                                                                                                                        int[] var54 = new int[var50.field1445];
                                                                                                                        String[] var55 = new String[var50.field1443];
                                                                                                                        for (int var56 = 0; var56 < var53.field1441; var56++) {
                                                                                                                            var54[var56] = field1265[Statics.field269 - var53.field1441 + var56];
                                                                                                                        }
                                                                                                                        for (int var57 = 0; var57 < var53.field1446; var57++) {
                                                                                                                            var55[var57] = field1262[Statics.field1267 - var53.field1446 + var57];
                                                                                                                        }
                                                                                                                        Statics.field269 -= var53.field1441;
                                                                                                                        Statics.field1267 -= var53.field1446;
                                                                                                                        class63 var58 = new class63();
                                                                                                                        var58.field743 = var25;
                                                                                                                        var58.field741 = var31;
                                                                                                                        var58.field742 = Statics.field1260;
                                                                                                                        var58.field740 = Statics.field624;
                                                                                                                        field1269[++field1268 - 1] = var58;
                                                                                                                        var25 = var53;
                                                                                                                        var32 = var53.field1448;
                                                                                                                        var33 = var53.field1447;
                                                                                                                        var31 = -1;
                                                                                                                        Statics.field1260 = var54;
                                                                                                                        Statics.field624 = var55;
                                                                                                                    } else if (var77 == 42) {
                                                                                                                        field1265[++Statics.field269 - 1] = Statics.field383.method1715(var33[var31]);
                                                                                                                    } else if (var77 == 43) {
                                                                                                                        Statics.field383.method1705(var33[var31], field1265[--Statics.field269]);
                                                                                                                    } else if (var77 == 44) {
                                                                                                                        int var59 = var33[var31] >> 16;
                                                                                                                        int var60 = var33[var31] & 0xFFFF;
                                                                                                                        int var61 = field1265[--Statics.field269];
                                                                                                                        if (var61 >= 0 && var61 <= 5000) {
                                                                                                                            field1263[var59] = var61;
                                                                                                                            byte var62 = -1;
                                                                                                                            if (var60 == 105) {
                                                                                                                                var62 = 0;
                                                                                                                            }
                                                                                                                            int var63 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var63 >= var61) {
                                                                                                                                    continue label267;
                                                                                                                                }
                                                                                                                                field1270[var59][var63] = var62;
                                                                                                                                var63++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var77 == 45) {
                                                                                                                        int var64 = var33[var31];
                                                                                                                        int var65 = field1265[--Statics.field269];
                                                                                                                        if (var65 < 0 || var65 >= field1263[var64]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1265[++Statics.field269 - 1] = field1270[var64][var65];
                                                                                                                    } else if (var77 == 46) {
                                                                                                                        int var66 = var33[var31];
                                                                                                                        Statics.field269 -= 2;
                                                                                                                        int var67 = field1265[Statics.field269];
                                                                                                                        if (var67 < 0 || var67 >= field1263[var66]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1270[var66][var67] = field1265[Statics.field269 + 1];
                                                                                                                    } else if (var77 == 47) {
                                                                                                                        String var68 = Statics.field383.method1708(var33[var31]);
                                                                                                                        if (var68 == null) {
                                                                                                                            var68 = "null";
                                                                                                                        }
                                                                                                                        field1262[++Statics.field1267 - 1] = var68;
                                                                                                                    } else if (var77 == 48) {
                                                                                                                        Statics.field383.method1722(var33[var31], field1262[--Statics.field1267]);
                                                                                                                    } else if (var77 == 60) {
                                                                                                                        class194 var69 = var25.field1449[var33[var31]];
                                                                                                                        class206 var70 = (class206) var69.method3391((long) field1265[--Statics.field269]);
                                                                                                                        if (var70 != null) {
                                                                                                                            var31 += var70.field2579;
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
        } catch (Exception var76) {
            StringBuilder var74 = new StringBuilder(30);
            var74.append("").append(var25.field2564).append(" ");
            for (int var75 = field1268 - 1; var75 >= 0; var75--) {
                var74.append("").append(field1269[var75].field743.field2564).append(" ");
            }
            var74.append("").append(var34);
            class154.method1684(var74.toString(), var76);
        }
    }

    @ObfuscatedName("cs.k(ILce;ZI)I")
    public static int method1590(int arg0, class98 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return Statics.method2385(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method153(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method54(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method110(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method648(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method143(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method2783(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            class224 var3 = arg2 ? Statics.field637 : Statics.field1266;
            byte var4;
            if (arg0 == 1600) {
                field1265[++Statics.field269 - 1] = var3.field2746;
                var4 = 1;
            } else if (arg0 == 1601) {
                field1265[++Statics.field269 - 1] = var3.field2747;
                var4 = 1;
            } else if (arg0 == 1602) {
                field1262[++Statics.field1267 - 1] = var3.field2793;
                var4 = 1;
            } else if (arg0 == 1603) {
                field1265[++Statics.field269 - 1] = var3.field2748;
                var4 = 1;
            } else if (arg0 == 1604) {
                field1265[++Statics.field269 - 1] = var3.field2749;
                var4 = 1;
            } else if (arg0 == 1605) {
                field1265[++Statics.field269 - 1] = var3.field2782;
                var4 = 1;
            } else if (arg0 == 1606) {
                field1265[++Statics.field269 - 1] = var3.field2776;
                var4 = 1;
            } else if (arg0 == 1607) {
                field1265[++Statics.field269 - 1] = var3.field2843;
                var4 = 1;
            } else if (arg0 == 1608) {
                field1265[++Statics.field269 - 1] = var3.field2777;
                var4 = 1;
            } else if (arg0 == 1609) {
                field1265[++Statics.field269 - 1] = var3.field2756;
                var4 = 1;
            } else if (arg0 == 1610) {
                field1265[++Statics.field269 - 1] = var3.field2730;
                var4 = 1;
            } else if (arg0 == 1611) {
                field1265[++Statics.field269 - 1] = var3.field2764;
                var4 = 1;
            } else if (arg0 == 1612) {
                field1265[++Statics.field269 - 1] = var3.field2751;
                var4 = 1;
            } else if (arg0 == 1613) {
                field1265[++Statics.field269 - 1] = var3.field2755.method18();
                var4 = 1;
            } else {
                var4 = 2;
            }
            return var4;
        } else if (arg0 < 1800) {
            class224 var8 = arg2 ? Statics.field637 : Statics.field1266;
            byte var9;
            if (arg0 == 1700) {
                field1265[++Statics.field269 - 1] = var8.field2754;
                var9 = 1;
            } else if (arg0 == 1701) {
                if (var8.field2754 == -1) {
                    field1265[++Statics.field269 - 1] = 0;
                } else {
                    field1265[++Statics.field269 - 1] = var8.field2846;
                }
                var9 = 1;
            } else if (arg0 == 1702) {
                field1265[++Statics.field269 - 1] = var8.field2726;
                var9 = 1;
            } else {
                var9 = 2;
            }
            return var9;
        } else if (arg0 < 1900) {
            return method206(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            int var10 = arg0;
            class224 var11;
            if (arg0 >= 2000) {
                var10 = arg0 - 1000;
                var11 = class224.method1627(field1265[--Statics.field269]);
            } else {
                var11 = arg2 ? Statics.field637 : Statics.field1266;
            }
            byte var12;
            if (var10 == 1927) {
                if (field1273 >= 10) {
                    throw new RuntimeException();
                }
                if (var11.field2834 == null) {
                    var12 = 0;
                } else {
                    class69 var13 = new class69();
                    var13.field800 = var11;
                    var13.field798 = var11.field2834;
                    var13.field808 = field1273 + 1;
                    client.field1011.method3502(var13);
                    var12 = 1;
                }
            } else {
                var12 = 2;
            }
            return var12;
        } else if (arg0 < 2100) {
            return method153(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method54(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method110(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method648(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method143(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            class224 var14 = class224.method1627(field1265[--Statics.field269]);
            byte var15;
            if (arg0 == 2500) {
                field1265[++Statics.field269 - 1] = var14.field2738;
                var15 = 1;
            } else if (arg0 == 2501) {
                field1265[++Statics.field269 - 1] = var14.field2739;
                var15 = 1;
            } else if (arg0 == 2502) {
                field1265[++Statics.field269 - 1] = var14.field2740;
                var15 = 1;
            } else if (arg0 == 2503) {
                field1265[++Statics.field269 - 1] = var14.field2741;
                var15 = 1;
            } else if (arg0 == 2504) {
                field1265[++Statics.field269 - 1] = var14.field2745 ? 1 : 0;
                var15 = 1;
            } else if (arg0 == 2505) {
                field1265[++Statics.field269 - 1] = var14.field2744;
                var15 = 1;
            } else {
                var15 = 2;
            }
            return var15;
        } else if (arg0 < 2700) {
            return method146(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            byte var17;
            if (arg0 == 2700) {
                class224 var16 = class224.method1627(field1265[--Statics.field269]);
                field1265[++Statics.field269 - 1] = var16.field2754;
                var17 = 1;
            } else if (arg0 == 2701) {
                class224 var18 = class224.method1627(field1265[--Statics.field269]);
                if (var18.field2754 == -1) {
                    field1265[++Statics.field269 - 1] = 0;
                } else {
                    field1265[++Statics.field269 - 1] = var18.field2846;
                }
                var17 = 1;
            } else if (arg0 == 2702) {
                int var19 = field1265[--Statics.field269];
                class68 var20 = (class68) client.field1070.method3438((long) var19);
                if (var20 == null) {
                    field1265[++Statics.field269 - 1] = 0;
                } else {
                    field1265[++Statics.field269 - 1] = 1;
                }
                var17 = 1;
            } else if (arg0 == 2706) {
                field1265[++Statics.field269 - 1] = client.field1016;
                var17 = 1;
            } else {
                var17 = 2;
            }
            return var17;
        } else if (arg0 < 2900) {
            class224 var21 = class224.method1627(field1265[--Statics.field269]);
            byte var26;
            if (arg0 == 2800) {
                int[] var22 = field1265;
                int var23 = ++Statics.field269 - 1;
                int var24 = client.method1097(var21);
                int var25 = var24 >> 11 & 0x3F;
                var22[var23] = var25;
                var26 = 1;
            } else if (arg0 == 2801) {
                int var27 = field1265[--Statics.field269];
                int var174 = var27 - 1;
                if (var21.field2813 == null || var174 >= var21.field2813.length || var21.field2813[var174] == null) {
                    field1262[++Statics.field1267 - 1] = "";
                } else {
                    field1262[++Statics.field1267 - 1] = var21.field2813[var174];
                }
                var26 = 1;
            } else if (arg0 == 2802) {
                if (var21.field2842 == null) {
                    field1262[++Statics.field1267 - 1] = "";
                } else {
                    field1262[++Statics.field1267 - 1] = var21.field2842;
                }
                var26 = 1;
            } else {
                var26 = 2;
            }
            return var26;
        } else if (arg0 < 3000) {
            int var28 = arg0;
            class224 var29;
            if (arg0 >= 2000) {
                var28 = arg0 - 1000;
                var29 = class224.method1627(field1265[--Statics.field269]);
            } else {
                var29 = arg2 ? Statics.field637 : Statics.field1266;
            }
            byte var30;
            if (var28 == 1927) {
                if (field1273 >= 10) {
                    throw new RuntimeException();
                }
                if (var29.field2834 == null) {
                    var30 = 0;
                } else {
                    class69 var31 = new class69();
                    var31.field800 = var29;
                    var31.field798 = var29.field2834;
                    var31.field808 = field1273 + 1;
                    client.field1011.method3502(var31);
                    var30 = 1;
                }
            } else {
                var30 = 2;
            }
            return var30;
        } else if (arg0 < 3200) {
            byte var33;
            if (arg0 == 3100) {
                String var32 = field1262[--Statics.field1267];
                class97.method706(0, "", var32);
                var33 = 1;
            } else if (arg0 == 3101) {
                Statics.field269 -= 2;
                Statics.method1037(Statics.field2501, field1265[Statics.field269], field1265[Statics.field269 + 1]);
                var33 = 1;
            } else if (arg0 == 3103) {
                client.method237();
                var33 = 1;
            } else if (arg0 == 3104) {
                String var34 = field1262[--Statics.field1267];
                int var35 = 0;
                if (class278.method1570(var34)) {
                    var35 = class278.method477(var34);
                }
                class171 var36 = class171.method3795(class168.field2377, client.field917.field1471);
                var36.field2423.method3149(var35);
                client.field917.method1777(var36);
                var33 = 1;
            } else if (arg0 == 3105) {
                String var37 = field1262[--Statics.field1267];
                class171 var38 = class171.method3795(class168.field2308, client.field917.field1471);
                var38.field2423.method3020(var37.length() + 1);
                var38.field2423.method3027(var37);
                client.field917.method1777(var38);
                var33 = 1;
            } else if (arg0 == 3106) {
                String var39 = field1262[--Statics.field1267];
                class171 var40 = class171.method3795(class168.field2395, client.field917.field1471);
                var40.field2423.method3020(var39.length() + 1);
                var40.field2423.method3027(var39);
                client.field917.method1777(var40);
                var33 = 1;
            } else if (arg0 == 3107) {
                int var41 = field1265[--Statics.field269];
                String var42 = field1262[--Statics.field1267];
                client.method56(var41, var42);
                var33 = 1;
            } else if (arg0 == 3108) {
                Statics.field269 -= 3;
                int var43 = field1265[Statics.field269];
                int var44 = field1265[Statics.field269 + 1];
                int var45 = field1265[Statics.field269 + 2];
                class224 var46 = class224.method1627(var45);
                client.method1631(var46, var43, var44);
                var33 = 1;
            } else if (arg0 == 3109) {
                Statics.field269 -= 2;
                int var47 = field1265[Statics.field269];
                int var48 = field1265[Statics.field269 + 1];
                class224 var49 = arg2 ? Statics.field637 : Statics.field1266;
                client.method1631(var49, var47, var48);
                var33 = 1;
            } else if (arg0 == 3110) {
                Statics.field957 = field1265[--Statics.field269] == 1;
                var33 = 1;
            } else if (arg0 == 3111) {
                field1265[++Statics.field269 - 1] = Statics.field632.field1234 ? 1 : 0;
                var33 = 1;
            } else if (arg0 == 3112) {
                Statics.field632.field1234 = field1265[--Statics.field269] == 1;
                class81.method1010();
                var33 = 1;
            } else if (arg0 == 3113) {
                String var50 = field1262[--Statics.field1267];
                boolean var51 = field1265[--Statics.field269] == 1;
                class57.method1039(var50, var51, false);
                var33 = 1;
            } else if (arg0 == 3115) {
                int var52 = field1265[--Statics.field269];
                class171 var53 = class171.method3795(class168.field2315, client.field917.field1471);
                var53.field2423.method3021(var52);
                client.field917.method1777(var53);
                var33 = 1;
            } else if (arg0 == 3116) {
                int var54 = field1265[--Statics.field269];
                Statics.field1267 -= 2;
                String var55 = field1262[Statics.field1267];
                String var56 = field1262[Statics.field1267 + 1];
                if (var55.length() > 500) {
                    var33 = 1;
                } else if (var56.length() > 500) {
                    var33 = 1;
                } else {
                    class171 var57 = class171.method3795(class168.field2384, client.field917.field1471);
                    var57.field2423.method3021(1 + class181.method1954(var55) + class181.method1954(var56));
                    var57.field2423.method3027(var55);
                    var57.field2423.method3027(var56);
                    var57.field2423.method3020(var54);
                    client.field917.method1777(var57);
                    var33 = 1;
                }
            } else if (arg0 == 3117) {
                client.field1003 = field1265[--Statics.field269] == 1;
                var33 = 1;
            } else {
                var33 = 2;
            }
            return var33;
        } else if (arg0 < 3300) {
            return method49(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method3558(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method4758(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            byte var58;
            if (arg0 == 3600) {
                if (client.field1023 == 0) {
                    field1265[++Statics.field269 - 1] = -2;
                } else if (client.field1023 == 1) {
                    field1265[++Statics.field269 - 1] = -1;
                } else {
                    field1265[++Statics.field269 - 1] = client.field1120;
                }
                var58 = 1;
            } else if (arg0 == 3601) {
                int var59 = field1265[--Statics.field269];
                if (client.field1023 == 2 && var59 < client.field1120) {
                    field1262[++Statics.field1267 - 1] = client.field1122[var59].field780;
                    field1262[++Statics.field1267 - 1] = client.field1122[var59].field779;
                } else {
                    field1262[++Statics.field1267 - 1] = "";
                    field1262[++Statics.field1267 - 1] = "";
                }
                var58 = 1;
            } else if (arg0 == 3602) {
                int var60 = field1265[--Statics.field269];
                if (client.field1023 == 2 && var60 < client.field1120) {
                    field1265[++Statics.field269 - 1] = client.field1122[var60].field783;
                } else {
                    field1265[++Statics.field269 - 1] = 0;
                }
                var58 = 1;
            } else if (arg0 == 3603) {
                int var61 = field1265[--Statics.field269];
                if (client.field1023 == 2 && var61 < client.field1120) {
                    field1265[++Statics.field269 - 1] = client.field1122[var61].field781;
                } else {
                    field1265[++Statics.field269 - 1] = 0;
                }
                var58 = 1;
            } else if (arg0 == 3604) {
                String var62 = field1262[--Statics.field1267];
                int var63 = field1265[--Statics.field269];
                class171 var64 = class171.method3795(class168.field2349, client.field917.field1471);
                var64.field2423.method3020(class181.method1954(var62) + 1);
                var64.field2423.method3062(var63);
                var64.field2423.method3027(var62);
                client.field917.method1777(var64);
                var58 = 1;
            } else if (arg0 == 3605) {
                String var65 = field1262[--Statics.field1267];
                if (var65 != null) {
                    if ((client.field1120 < 200 || client.field977 == 1) && client.field1120 < 400) {
                        String var66 = class275.method1598(var65, Statics.field3240);
                        if (var66 != null) {
                            int var67 = 0;
                            label958: while (true) {
                                if (var67 >= client.field1120) {
                                    for (int var71 = 0; var71 < client.field1124; var71++) {
                                        class70 var72 = client.field1125[var71];
                                        String var73 = class275.method1598(var72.field816, Statics.field3240);
                                        if (var73 != null && var73.equals(var66)) {
                                            class97.method706(30, "", class233.field3103 + var65 + class233.field3104);
                                            break label958;
                                        }
                                        if (var72.field815 != null) {
                                            String var74 = class275.method1598(var72.field815, Statics.field3240);
                                            if (var74 != null && var74.equals(var66)) {
                                                class97.method706(30, "", class233.field3103 + var65 + class233.field3104);
                                                break label958;
                                            }
                                        }
                                    }
                                    if (class275.method1598(Statics.field2501.field844, Statics.field3240).equals(var66)) {
                                        class97.method706(30, "", class233.field3101);
                                    } else {
                                        class171 var75 = class171.method3795(class168.field2311, client.field917.field1471);
                                        var75.field2423.method3020(class181.method1954(var65));
                                        var75.field2423.method3027(var65);
                                        client.field917.method1777(var75);
                                    }
                                    break;
                                }
                                class66 var68 = client.field1122[var67];
                                String var69 = class275.method1598(var68.field780, Statics.field3240);
                                if (var69 != null && var69.equals(var66)) {
                                    class97.method706(30, "", var65 + class233.field3098);
                                    break;
                                }
                                if (var68.field779 != null) {
                                    String var70 = class275.method1598(var68.field779, Statics.field3240);
                                    if (var70 != null && var70.equals(var66)) {
                                        class97.method706(30, "", var65 + class233.field3098);
                                        break;
                                    }
                                }
                                var67++;
                            }
                        }
                    } else {
                        class97.method706(30, "", class233.field3214);
                    }
                }
                var58 = 1;
            } else if (arg0 == 3606) {
                String var76 = field1262[--Statics.field1267];
                client.method3339(var76);
                var58 = 1;
            } else if (arg0 == 3607) {
                String var77 = field1262[--Statics.field1267];
                client.method122(var77, false);
                var58 = 1;
            } else if (arg0 == 3608) {
                String var78 = field1262[--Statics.field1267];
                if (var78 != null) {
                    String var79 = class275.method1598(var78, Statics.field3240);
                    if (var79 != null) {
                        for (int var80 = 0; var80 < client.field1124; var80++) {
                            class70 var81 = client.field1125[var80];
                            String var82 = var81.field816;
                            String var83 = class275.method1598(var82, Statics.field3240);
                            boolean var84;
                            if (var78 == null || var82 == null) {
                                var84 = false;
                            } else if (var78.startsWith("#") || var82.startsWith("#")) {
                                var84 = var78.equals(var82);
                            } else {
                                var84 = var79.equals(var83);
                            }
                            if (var84) {
                                client.field1124--;
                                for (int var85 = var80; var85 < client.field1124; var85++) {
                                    client.field1125[var85] = client.field1125[var85 + 1];
                                }
                                client.field978 = client.field882;
                                class171 var86 = class171.method3795(class168.field2343, client.field917.field1471);
                                var86.field2423.method3020(class181.method1954(var78));
                                var86.field2423.method3027(var78);
                                client.field917.method1777(var86);
                                break;
                            }
                        }
                    }
                }
                var58 = 1;
            } else if (arg0 == 3609) {
                String var87 = field1262[--Statics.field1267];
                class238[] var88 = class238.method994();
                for (int var89 = 0; var89 < var88.length; var89++) {
                    class238 var90 = var88[var89];
                    if (var90.field3252 != -1 && var87.startsWith(class88.method1449(var90.field3252))) {
                        var87 = var87.substring(6 + Integer.toString(var90.field3252).length());
                        break;
                    }
                }
                field1265[++Statics.field269 - 1] = client.method6(var87, false) ? 1 : 0;
                var58 = 1;
            } else if (arg0 == 3611) {
                if (client.field1131 == null) {
                    field1262[++Statics.field1267 - 1] = "";
                } else {
                    field1262[++Statics.field1267 - 1] = class276.method232(client.field1131);
                }
                var58 = 1;
            } else if (arg0 == 3612) {
                if (client.field1131 == null) {
                    field1265[++Statics.field269 - 1] = 0;
                } else {
                    field1265[++Statics.field269 - 1] = Statics.field733;
                }
                var58 = 1;
            } else if (arg0 == 3613) {
                int var91 = field1265[--Statics.field269];
                if (client.field1131 == null || var91 >= Statics.field733) {
                    field1262[++Statics.field1267 - 1] = "";
                } else {
                    field1262[++Statics.field1267 - 1] = Statics.field2537[var91].field871;
                }
                var58 = 1;
            } else if (arg0 == 3614) {
                int var92 = field1265[--Statics.field269];
                if (client.field1131 == null || var92 >= Statics.field733) {
                    field1265[++Statics.field269 - 1] = 0;
                } else {
                    field1265[++Statics.field269 - 1] = Statics.field2537[var92].field867;
                }
                var58 = 1;
            } else if (arg0 == 3615) {
                int var93 = field1265[--Statics.field269];
                if (client.field1131 == null || var93 >= Statics.field733) {
                    field1265[++Statics.field269 - 1] = 0;
                } else {
                    field1265[++Statics.field269 - 1] = Statics.field2537[var93].field869;
                }
                var58 = 1;
            } else if (arg0 == 3616) {
                field1265[++Statics.field269 - 1] = Statics.field721;
                var58 = 1;
            } else if (arg0 == 3617) {
                String var94 = field1262[--Statics.field1267];
                if (Statics.field2537 != null) {
                    class171 var95 = class171.method3795(class168.field2375, client.field917.field1471);
                    var95.field2423.method3020(class181.method1954(var94));
                    var95.field2423.method3027(var94);
                    client.field917.method1777(var95);
                }
                var58 = 1;
            } else if (arg0 == 3618) {
                field1265[++Statics.field269 - 1] = Statics.field283;
                var58 = 1;
            } else if (arg0 == 3619) {
                String var96 = field1262[--Statics.field1267];
                client.method3812(var96);
                var58 = 1;
            } else if (arg0 == 3620) {
                client.method159();
                var58 = 1;
            } else if (arg0 == 3621) {
                if (client.field1023 == 0) {
                    field1265[++Statics.field269 - 1] = -1;
                } else {
                    field1265[++Statics.field269 - 1] = client.field1124;
                }
                var58 = 1;
            } else if (arg0 == 3622) {
                int var97 = field1265[--Statics.field269];
                if (client.field1023 == 0 || var97 >= client.field1124) {
                    field1262[++Statics.field1267 - 1] = "";
                    field1262[++Statics.field1267 - 1] = "";
                } else {
                    field1262[++Statics.field1267 - 1] = client.field1125[var97].field816;
                    field1262[++Statics.field1267 - 1] = client.field1125[var97].field815;
                }
                var58 = 1;
            } else if (arg0 == 3623) {
                String var98 = field1262[--Statics.field1267];
                if (var98.startsWith(class88.method1449(0)) || var98.startsWith(class88.method1449(1))) {
                    var98 = var98.substring(7);
                }
                field1265[++Statics.field269 - 1] = client.method228(var98) ? 1 : 0;
                var58 = 1;
            } else if (arg0 == 3624) {
                int var99 = field1265[--Statics.field269];
                if (Statics.field2537 == null || var99 >= Statics.field733 || !Statics.field2537[var99].field871.equalsIgnoreCase(Statics.field2501.field844)) {
                    field1265[++Statics.field269 - 1] = 0;
                } else {
                    field1265[++Statics.field269 - 1] = 1;
                }
                var58 = 1;
            } else if (arg0 == 3625) {
                if (client.field1081 == null) {
                    field1262[++Statics.field1267 - 1] = "";
                } else {
                    field1262[++Statics.field1267 - 1] = class276.method232(client.field1081);
                }
                var58 = 1;
            } else {
                var58 = 2;
            }
            return var58;
        } else if (arg0 < 4000) {
            byte var101;
            if (arg0 == 3903) {
                int var100 = field1265[--Statics.field269];
                field1265[++Statics.field269 - 1] = client.field1129[var100].method101();
                var101 = 1;
            } else if (arg0 == 3904) {
                int var102 = field1265[--Statics.field269];
                field1265[++Statics.field269 - 1] = client.field1129[var102].field296;
                var101 = 1;
            } else if (arg0 == 3905) {
                int var103 = field1265[--Statics.field269];
                field1265[++Statics.field269 - 1] = client.field1129[var103].field293;
                var101 = 1;
            } else if (arg0 == 3906) {
                int var104 = field1265[--Statics.field269];
                field1265[++Statics.field269 - 1] = client.field1129[var104].field294;
                var101 = 1;
            } else if (arg0 == 3907) {
                int var105 = field1265[--Statics.field269];
                field1265[++Statics.field269 - 1] = client.field1129[var105].field297;
                var101 = 1;
            } else if (arg0 == 3908) {
                int var106 = field1265[--Statics.field269];
                field1265[++Statics.field269 - 1] = client.field1129[var106].field298;
                var101 = 1;
            } else if (arg0 == 3910) {
                int var107 = field1265[--Statics.field269];
                int var108 = client.field1129[var107].method100();
                field1265[++Statics.field269 - 1] = var108 == 0 ? 1 : 0;
                var101 = 1;
            } else if (arg0 == 3911) {
                int var109 = field1265[--Statics.field269];
                int var110 = client.field1129[var109].method100();
                field1265[++Statics.field269 - 1] = var110 == 2 ? 1 : 0;
                var101 = 1;
            } else if (arg0 == 3912) {
                int var111 = field1265[--Statics.field269];
                int var112 = client.field1129[var111].method100();
                field1265[++Statics.field269 - 1] = var112 == 5 ? 1 : 0;
                var101 = 1;
            } else if (arg0 == 3913) {
                int var113 = field1265[--Statics.field269];
                int var114 = client.field1129[var113].method100();
                field1265[++Statics.field269 - 1] = var114 == 1 ? 1 : 0;
                var101 = 1;
            } else if (arg0 == 3914) {
                boolean var115 = field1265[--Statics.field269] == 1;
                if (Statics.field28 != null) {
                    Statics.field28.method75(class14.field265, var115);
                }
                var101 = 1;
            } else if (arg0 == 3915) {
                boolean var116 = field1265[--Statics.field269] == 1;
                if (Statics.field28 != null) {
                    Statics.field28.method75(class14.field272, var116);
                }
                var101 = 1;
            } else if (arg0 == 3916) {
                Statics.field269 -= 2;
                boolean var117 = field1265[Statics.field269] == 1;
                boolean var118 = field1265[Statics.field269 + 1] == 1;
                if (Statics.field28 != null) {
                    client.field1130.field864 = var118;
                    Statics.field28.method75(client.field1130, var117);
                }
                var101 = 1;
            } else if (arg0 == 3917) {
                boolean var119 = field1265[--Statics.field269] == 1;
                if (Statics.field28 != null) {
                    Statics.field28.method75(class14.field267, var119);
                }
                var101 = 1;
            } else if (arg0 == 3918) {
                boolean var120 = field1265[--Statics.field269] == 1;
                if (Statics.field28 != null) {
                    Statics.field28.method75(class14.field264, var120);
                }
                var101 = 1;
            } else if (arg0 == 3919) {
                field1265[++Statics.field269 - 1] = Statics.field28 == null ? 0 : Statics.field28.field266.size();
                var101 = 1;
            } else if (arg0 == 3920) {
                int var121 = field1265[--Statics.field269];
                class15 var122 = (class15) Statics.field28.field266.get(var121);
                field1265[++Statics.field269 - 1] = var122.field281;
                var101 = 1;
            } else if (arg0 == 3921) {
                int var123 = field1265[--Statics.field269];
                class15 var124 = (class15) Statics.field28.field266.get(var123);
                field1262[++Statics.field1267 - 1] = var124.method84();
                var101 = 1;
            } else if (arg0 == 3922) {
                int var125 = field1265[--Statics.field269];
                class15 var126 = (class15) Statics.field28.field266.get(var125);
                field1262[++Statics.field1267 - 1] = var126.method85();
                var101 = 1;
            } else if (arg0 == 3923) {
                int var127 = field1265[--Statics.field269];
                class15 var128 = (class15) Statics.field28.field266.get(var127);
                long var129 = class183.method2932() - Statics.field2534 - var128.field274;
                int var131 = (int) (var129 / 3600000L);
                int var132 = (int) ((var129 - (long) (var131 * 3600000)) / 60000L);
                int var133 = (int) ((var129 - (long) (var131 * 3600000) - (long) (var132 * 60000)) / 1000L);
                String var134 = var131 + ":" + var132 / 10 + var132 % 10 + ":" + var133 / 10 + var133 % 10;
                field1262[++Statics.field1267 - 1] = var134;
                var101 = 1;
            } else if (arg0 == 3924) {
                int var135 = field1265[--Statics.field269];
                class15 var136 = (class15) Statics.field28.field266.get(var135);
                field1265[++Statics.field269 - 1] = var136.field275.field294;
                var101 = 1;
            } else if (arg0 == 3925) {
                int var137 = field1265[--Statics.field269];
                class15 var138 = (class15) Statics.field28.field266.get(var137);
                field1265[++Statics.field269 - 1] = var138.field275.field293;
                var101 = 1;
            } else if (arg0 == 3926) {
                int var139 = field1265[--Statics.field269];
                class15 var140 = (class15) Statics.field28.field266.get(var139);
                field1265[++Statics.field269 - 1] = var140.field275.field296;
                var101 = 1;
            } else {
                var101 = 2;
            }
            return var101;
        } else if (arg0 < 4100) {
            return method20(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method4268(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            byte var142;
            if (arg0 == 4200) {
                int var141 = field1265[--Statics.field269];
                field1262[++Statics.field1267 - 1] = class264.method482(var141).field3562;
                var142 = 1;
            } else if (arg0 == 4201) {
                Statics.field269 -= 2;
                int var143 = field1265[Statics.field269];
                int var144 = field1265[Statics.field269 + 1];
                class264 var145 = class264.method482(var143);
                if (var144 < 1 || var144 > 5 || var145.field3576[var144 - 1] == null) {
                    field1262[++Statics.field1267 - 1] = "";
                } else {
                    field1262[++Statics.field1267 - 1] = var145.field3576[var144 - 1];
                }
                var142 = 1;
            } else if (arg0 == 4202) {
                Statics.field269 -= 2;
                int var146 = field1265[Statics.field269];
                int var147 = field1265[Statics.field269 + 1];
                class264 var148 = class264.method482(var146);
                if (var147 < 1 || var147 > 5 || var148.field3577[var147 - 1] == null) {
                    field1262[++Statics.field1267 - 1] = "";
                } else {
                    field1262[++Statics.field1267 - 1] = var148.field3577[var147 - 1];
                }
                var142 = 1;
            } else if (arg0 == 4203) {
                int var149 = field1265[--Statics.field269];
                field1265[++Statics.field269 - 1] = class264.method482(var149).field3574;
                var142 = 1;
            } else if (arg0 == 4204) {
                int var150 = field1265[--Statics.field269];
                field1265[++Statics.field269 - 1] = class264.method482(var150).field3573 == 1 ? 1 : 0;
                var142 = 1;
            } else if (arg0 == 4205) {
                int var151 = field1265[--Statics.field269];
                class264 var152 = class264.method482(var151);
                if (var152.field3594 == -1 && var152.field3596 >= 0) {
                    field1265[++Statics.field269 - 1] = var152.field3596;
                } else {
                    field1265[++Statics.field269 - 1] = var151;
                }
                var142 = 1;
            } else if (arg0 == 4206) {
                int var153 = field1265[--Statics.field269];
                class264 var154 = class264.method482(var153);
                if (var154.field3594 >= 0 && var154.field3596 >= 0) {
                    field1265[++Statics.field269 - 1] = var154.field3596;
                } else {
                    field1265[++Statics.field269 - 1] = var153;
                }
                var142 = 1;
            } else if (arg0 == 4207) {
                int var155 = field1265[--Statics.field269];
                field1265[++Statics.field269 - 1] = class264.method482(var155).field3575 ? 1 : 0;
                var142 = 1;
            } else if (arg0 == 4208) {
                int var156 = field1265[--Statics.field269];
                class264 var157 = class264.method482(var156);
                if (var157.field3606 == -1 && var157.field3558 >= 0) {
                    field1265[++Statics.field269 - 1] = var157.field3558;
                } else {
                    field1265[++Statics.field269 - 1] = var156;
                }
                var142 = 1;
            } else if (arg0 == 4209) {
                int var158 = field1265[--Statics.field269];
                class264 var159 = class264.method482(var158);
                if (var159.field3606 >= 0 && var159.field3558 >= 0) {
                    field1265[++Statics.field269 - 1] = var159.field3558;
                } else {
                    field1265[++Statics.field269 - 1] = var158;
                }
                var142 = 1;
            } else if (arg0 == 4210) {
                String var160 = field1262[--Statics.field1267];
                int var161 = field1265[--Statics.field269];
                client.method2776(var160, var161 == 1);
                field1265[++Statics.field269 - 1] = Statics.field2912;
                var142 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field627 == null || Statics.field322 >= Statics.field2912) {
                    field1265[++Statics.field269 - 1] = -1;
                } else {
                    field1265[++Statics.field269 - 1] = Statics.field627[++Statics.field322 - 1] & 0xFFFF;
                }
                var142 = 1;
            } else if (arg0 == 4212) {
                Statics.field322 = 0;
                var142 = 1;
            } else {
                var142 = 2;
            }
            return var142;
        } else if (arg0 < 5100) {
            return method58(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            byte var162;
            if (arg0 == 5306) {
                field1265[++Statics.field269 - 1] = client.method3334();
                var162 = 1;
            } else if (arg0 == 5307) {
                int var163 = field1265[--Statics.field269];
                if (var163 == 1 || var163 == 2) {
                    client.field1068 = 0L;
                    if (var163 >= 2) {
                        client.field1069 = true;
                    } else {
                        client.field1069 = false;
                    }
                    if (client.method3334() == 1) {
                        Statics.field3793.method761(765, 503);
                    } else {
                        Statics.field3793.method761(7680, 2160);
                    }
                    if (client.field879 >= 25) {
                        class171 var164 = class171.method3795(class168.field2322, client.field917.field1471);
                        var164.field2423.method3020(client.method3334());
                        var164.field2423.method3021(Statics.field1308);
                        var164.field2423.method3021(Statics.field674);
                        client.field917.method1777(var164);
                    }
                }
                var162 = 1;
            } else if (arg0 == 5308) {
                field1265[++Statics.field269 - 1] = Statics.field632.field1236;
                var162 = 1;
            } else if (arg0 == 5309) {
                int var165 = field1265[--Statics.field269];
                if (var165 == 1 || var165 == 2) {
                    Statics.field632.field1236 = var165;
                    class81.method1010();
                }
                var162 = 1;
            } else {
                var162 = 2;
            }
            return var162;
        } else if (arg0 < 5600) {
            byte var171;
            if (arg0 == 5504) {
                Statics.field269 -= 2;
                int var169 = field1265[Statics.field269];
                int var170 = field1265[Statics.field269 + 1];
                if (!client.field1101) {
                    client.field998 = var169;
                    client.field939 = var170;
                }
                var171 = 1;
            } else if (arg0 == 5505) {
                field1265[++Statics.field269 - 1] = client.field998;
                var171 = 1;
            } else if (arg0 == 5506) {
                field1265[++Statics.field269 - 1] = client.field939;
                var171 = 1;
            } else if (arg0 == 5530) {
                int var172 = field1265[--Statics.field269];
                if (var172 < 0) {
                    var172 = 0;
                }
                client.field944 = var172;
                var171 = 1;
            } else if (arg0 == 5531) {
                field1265[++Statics.field269 - 1] = client.field944;
                var171 = 1;
            } else {
                var171 = 2;
            }
            return var171;
        } else if (arg0 < 5700) {
            byte var173;
            if (arg0 == 5630) {
                client.field1109 = 250;
                var173 = 1;
            } else {
                var173 = 2;
            }
            return var173;
        } else if (arg0 < 6300) {
            return method1021(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method639(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method2291(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("q.v(ILce;ZI)I")
    public static int method153(int arg0, class98 arg1, boolean arg2) {
        int var3 = -1;
        class224 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1265[--Statics.field269];
            var4 = class224.method1627(var3);
        } else {
            var4 = arg2 ? Statics.field637 : Statics.field1266;
        }
        if (arg0 == 1000) {
            Statics.field269 -= 4;
            var4.field2734 = field1265[Statics.field269];
            var4.field2735 = field1265[Statics.field269 + 1];
            var4.field2789 = field1265[Statics.field269 + 2];
            var4.field2731 = field1265[Statics.field269 + 3];
            client.method503(var4);
            Statics.field3793.method1114(var4);
            if (var3 != -1 && var4.field2727 == 0) {
                client.method4517(Statics.field257[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field269 -= 4;
            var4.field2809 = field1265[Statics.field269];
            var4.field2737 = field1265[Statics.field269 + 1];
            var4.field2732 = field1265[Statics.field269 + 2];
            var4.field2819 = field1265[Statics.field269 + 3];
            client.method503(var4);
            Statics.field3793.method1114(var4);
            if (var3 != -1 && var4.field2727 == 0) {
                client.method4517(Statics.field257[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1265[--Statics.field269] == 1;
            if (var4.field2745 != var5) {
                var4.field2745 = var5;
                client.method503(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2858 = field1265[--Statics.field269] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2827 = field1265[--Statics.field269] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.m(ILce;ZB)I")
    public static int method54(int arg0, class98 arg1, boolean arg2) {
        int var3 = -1;
        class224 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1265[--Statics.field269];
            var4 = class224.method1627(var3);
        } else {
            var4 = arg2 ? Statics.field637 : Statics.field1266;
        }
        if (arg0 == 1100) {
            Statics.field269 -= 2;
            var4.field2746 = field1265[Statics.field269];
            if (var4.field2746 > var4.field2748 - var4.field2740) {
                var4.field2746 = var4.field2748 - var4.field2740;
            }
            if (var4.field2746 < 0) {
                var4.field2746 = 0;
            }
            var4.field2747 = field1265[Statics.field269 + 1];
            if (var4.field2747 > var4.field2749 - var4.field2741) {
                var4.field2747 = var4.field2749 - var4.field2741;
            }
            if (var4.field2747 < 0) {
                var4.field2747 = 0;
            }
            client.method503(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2764 = field1265[--Statics.field269];
            client.method503(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2787 = field1265[--Statics.field269] == 1;
            client.method503(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2756 = field1265[--Statics.field269];
            client.method503(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2758 = field1265[--Statics.field269];
            client.method503(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2760 = field1265[--Statics.field269];
            client.method503(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2797 = field1265[--Statics.field269];
            client.method503(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2763 = field1265[--Statics.field269] == 1;
            client.method503(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2768 = 1;
            var4.field2769 = field1265[--Statics.field269];
            client.method503(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field269 -= 6;
            var4.field2774 = field1265[Statics.field269];
            var4.field2775 = field1265[Statics.field269 + 1];
            var4.field2776 = field1265[Statics.field269 + 2];
            var4.field2777 = field1265[Statics.field269 + 3];
            var4.field2843 = field1265[Statics.field269 + 4];
            var4.field2782 = field1265[Statics.field269 + 5];
            client.method503(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1265[--Statics.field269];
            if (var4.field2845 != var5) {
                var4.field2845 = var5;
                var4.field2847 = 0;
                var4.field2784 = 0;
                client.method503(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2844 = field1265[--Statics.field269] == 1;
            client.method503(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1262[--Statics.field1267];
            if (!var6.equals(var4.field2793)) {
                var4.field2793 = var6;
                client.method503(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2820 = field1265[--Statics.field269];
            client.method503(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field269 -= 3;
            var4.field2788 = field1265[Statics.field269];
            var4.field2810 = field1265[Statics.field269 + 1];
            var4.field2825 = field1265[Statics.field269 + 2];
            client.method503(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2790 = field1265[--Statics.field269] == 1;
            client.method503(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2794 = field1265[--Statics.field269];
            client.method503(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2772 = field1265[--Statics.field269];
            client.method503(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2766 = field1265[--Statics.field269] == 1;
            client.method503(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2759 = field1265[--Statics.field269] == 1;
            client.method503(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field269 -= 2;
            var4.field2748 = field1265[Statics.field269];
            var4.field2749 = field1265[Statics.field269 + 1];
            client.method503(var4);
            if (var3 != -1 && var4.field2727 == 0) {
                client.method4517(Statics.field257[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method3268(var4.field2725, var4.field2726);
            client.field1019 = var4;
            client.method503(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2765 = field1265[--Statics.field269];
            client.method503(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2751 = field1265[--Statics.field269];
            client.method503(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2730 = field1265[--Statics.field269];
            client.method503(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1265[--Statics.field269];
            class293[] var8 = new class293[] { class293.field3819, class293.field3820, class293.field3824, class293.field3821, class293.field3823 };
            class293 var9 = (class293) class176.method1702(var8, var7);
            if (var9 != null) {
                var4.field2755 = var9;
                client.method503(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var10 = field1265[--Statics.field269] == 1;
            var4.field2757 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.b(ILce;ZB)I")
    public static int method110(int arg0, class98 arg1, boolean arg2) {
        class224 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class224.method1627(field1265[--Statics.field269]);
        } else {
            var3 = arg2 ? Statics.field637 : Statics.field1266;
        }
        client.method503(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field269 -= 2;
            int var4 = field1265[Statics.field269];
            int var5 = field1265[Statics.field269 + 1];
            var3.field2754 = var4;
            var3.field2846 = var5;
            class264 var6 = class264.method482(var4);
            var3.field2776 = var6.field3568;
            var3.field2777 = var6.field3584;
            var3.field2843 = var6.field3570;
            var3.field2774 = var6.field3571;
            var3.field2775 = var6.field3567;
            var3.field2782 = var6.field3557;
            if (arg0 == 1205) {
                var3.field2783 = 0;
            } else if (arg0 == 1212 | var6.field3573 == 1) {
                var3.field2783 = 1;
            } else {
                var3.field2783 = 2;
            }
            if (var3.field2780 > 0) {
                var3.field2782 = var3.field2782 * 32 / var3.field2780;
            } else if (var3.field2809 > 0) {
                var3.field2782 = var3.field2782 * 32 / var3.field2809;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2768 = 2;
            var3.field2769 = field1265[--Statics.field269];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2768 = 3;
            var3.field2769 = Statics.field2501.field857.method3831();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("av.t(ILce;ZI)I")
    public static int method648(int arg0, class98 arg1, boolean arg2) {
        class224 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class224.method1627(field1265[--Statics.field269]);
        } else {
            var3 = arg2 ? Statics.field637 : Statics.field1266;
        }
        if (arg0 == 1300) {
            int var4 = field1265[--Statics.field269] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3857(var4, field1262[--Statics.field1267]);
                return 1;
            } else {
                Statics.field1267--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field269 -= 2;
            int var5 = field1265[Statics.field269];
            int var6 = field1265[Statics.field269 + 1];
            var3.field2800 = class224.method2811(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2803 = field1265[--Statics.field269] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2801 = field1265[--Statics.field269];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2802 = field1265[--Statics.field269];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2842 = field1262[--Statics.field1267];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2715 = field1262[--Statics.field1267];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2813 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("e.p(ILce;ZI)I")
    public static int method143(int arg0, class98 arg1, boolean arg2) {
        class224 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class224.method1627(field1265[--Statics.field269]);
        } else {
            var3 = arg2 ? Statics.field637 : Statics.field1266;
        }
        String var4 = field1262[--Statics.field1267];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1265[--Statics.field269];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1265[--Statics.field269];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1262[--Statics.field1267];
            } else {
                var7[var8] = Integer.valueOf(field1265[--Statics.field269]);
            }
        }
        int var9 = field1265[--Statics.field269];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2807 = var7;
        } else if (arg0 == 1401) {
            var3.field2761 = var7;
        } else if (arg0 == 1402) {
            var3.field2853 = var7;
        } else if (arg0 == 1403) {
            var3.field2723 = var7;
        } else if (arg0 == 1404) {
            var3.field2750 = var7;
        } else if (arg0 == 1405) {
            var3.field2814 = var7;
        } else if (arg0 == 1406) {
            var3.field2817 = var7;
        } else if (arg0 == 1407) {
            var3.field2849 = var7;
            var3.field2743 = var5;
        } else if (arg0 == 1408) {
            var3.field2824 = var7;
        } else if (arg0 == 1409) {
            var3.field2804 = var7;
        } else if (arg0 == 1410) {
            var3.field2815 = var7;
        } else if (arg0 == 1411) {
            var3.field2806 = var7;
        } else if (arg0 == 1412) {
            var3.field2812 = var7;
        } else if (arg0 == 1414) {
            var3.field2799 = var7;
            var3.field2821 = var5;
        } else if (arg0 == 1415) {
            var3.field2822 = var7;
            var3.field2808 = var5;
        } else if (arg0 == 1416) {
            var3.field2785 = var7;
        } else if (arg0 == 1417) {
            var3.field2826 = var7;
        } else if (arg0 == 1418) {
            var3.field2850 = var7;
        } else if (arg0 == 1419) {
            var3.field2828 = var7;
        } else if (arg0 == 1420) {
            var3.field2829 = var7;
        } else if (arg0 == 1421) {
            var3.field2830 = var7;
        } else if (arg0 == 1422) {
            var3.field2831 = var7;
        } else if (arg0 == 1423) {
            var3.field2832 = var7;
        } else if (arg0 == 1424) {
            var3.field2862 = var7;
        } else if (arg0 == 1425) {
            var3.field2835 = var7;
        } else if (arg0 == 1426) {
            var3.field2836 = var7;
        } else if (arg0 == 1427) {
            var3.field2834 = var7;
        } else {
            return 2;
        }
        var3.field2771 = true;
        return 1;
    }

    @ObfuscatedName("eb.r(ILce;ZI)I")
    public static int method2783(int arg0, class98 arg1, boolean arg2) {
        class224 var3 = arg2 ? Statics.field637 : Statics.field1266;
        if (arg0 == 1500) {
            field1265[++Statics.field269 - 1] = var3.field2738;
            return 1;
        } else if (arg0 == 1501) {
            field1265[++Statics.field269 - 1] = var3.field2739;
            return 1;
        } else if (arg0 == 1502) {
            field1265[++Statics.field269 - 1] = var3.field2740;
            return 1;
        } else if (arg0 == 1503) {
            field1265[++Statics.field269 - 1] = var3.field2741;
            return 1;
        } else if (arg0 == 1504) {
            field1265[++Statics.field269 - 1] = var3.field2745 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1265[++Statics.field269 - 1] = var3.field2744;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.l(ILce;ZI)I")
    public static int method206(int arg0, class98 arg1, boolean arg2) {
        class224 var3 = arg2 ? Statics.field637 : Statics.field1266;
        if (arg0 == 1800) {
            int[] var4 = field1265;
            int var5 = ++Statics.field269 - 1;
            int var6 = client.method1097(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 1801) {
            int var8 = field1265[--Statics.field269];
            int var9 = var8 - 1;
            if (var3.field2813 == null || var9 >= var3.field2813.length || var3.field2813[var9] == null) {
                field1262[++Statics.field1267 - 1] = "";
            } else {
                field1262[++Statics.field1267 - 1] = var3.field2813[var9];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2842 == null) {
                field1262[++Statics.field1267 - 1] = "";
            } else {
                field1262[++Statics.field1267 - 1] = var3.field2842;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("e.u(ILce;ZI)I")
    public static int method146(int arg0, class98 arg1, boolean arg2) {
        class224 var3 = class224.method1627(field1265[--Statics.field269]);
        if (arg0 == 2600) {
            field1265[++Statics.field269 - 1] = var3.field2746;
            return 1;
        } else if (arg0 == 2601) {
            field1265[++Statics.field269 - 1] = var3.field2747;
            return 1;
        } else if (arg0 == 2602) {
            field1262[++Statics.field1267 - 1] = var3.field2793;
            return 1;
        } else if (arg0 == 2603) {
            field1265[++Statics.field269 - 1] = var3.field2748;
            return 1;
        } else if (arg0 == 2604) {
            field1265[++Statics.field269 - 1] = var3.field2749;
            return 1;
        } else if (arg0 == 2605) {
            field1265[++Statics.field269 - 1] = var3.field2782;
            return 1;
        } else if (arg0 == 2606) {
            field1265[++Statics.field269 - 1] = var3.field2776;
            return 1;
        } else if (arg0 == 2607) {
            field1265[++Statics.field269 - 1] = var3.field2843;
            return 1;
        } else if (arg0 == 2608) {
            field1265[++Statics.field269 - 1] = var3.field2777;
            return 1;
        } else if (arg0 == 2609) {
            field1265[++Statics.field269 - 1] = var3.field2756;
            return 1;
        } else if (arg0 == 2610) {
            field1265[++Statics.field269 - 1] = var3.field2730;
            return 1;
        } else if (arg0 == 2611) {
            field1265[++Statics.field269 - 1] = var3.field2764;
            return 1;
        } else if (arg0 == 2612) {
            field1265[++Statics.field269 - 1] = var3.field2751;
            return 1;
        } else if (arg0 == 2613) {
            field1265[++Statics.field269 - 1] = var3.field2755.method18();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("r.c(ILce;ZB)I")
    public static int method49(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field269 -= 3;
            client.method633(field1265[Statics.field269], field1265[Statics.field269 + 1], field1265[Statics.field269 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            int var3 = field1265[--Statics.field269];
            if (var3 == -1 && !client.field1096) {
                class211.method1033();
            } else if (var3 != -1 && client.field1091 != var3 && client.field1114 != 0 && !client.field1096) {
                class245 var4 = Statics.field631;
                int var5 = client.field1114;
                class211.field2599 = 1;
                Statics.field23 = var4;
                Statics.field238 = var3;
                Statics.field2600 = 0;
                Statics.field1589 = var5;
                Statics.field323 = false;
                Statics.field2217 = 2;
            }
            client.field1091 = var3;
            return 1;
        } else if (arg0 == 3202) {
            Statics.field269 -= 2;
            client.method1602(field1265[Statics.field269], field1265[Statics.field269 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hc.j(ILce;ZB)I")
    public static int method3558(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1265[++Statics.field269 - 1] = client.field881;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field269 -= 2;
            int var3 = field1265[Statics.field269];
            int var4 = field1265[Statics.field269 + 1];
            int[] var5 = field1265;
            int var6 = ++Statics.field269 - 1;
            class64 var7 = (class64) class64.field754.method3438((long) var3);
            int var8;
            if (var7 == null) {
                var8 = -1;
            } else if (var4 >= 0 && var4 < var7.field756.length) {
                var8 = var7.field756[var4];
            } else {
                var8 = -1;
            }
            var5[var6] = var8;
            return 1;
        } else if (arg0 == 3302) {
            Statics.field269 -= 2;
            int var9 = field1265[Statics.field269];
            int var10 = field1265[Statics.field269 + 1];
            int[] var11 = field1265;
            int var12 = ++Statics.field269 - 1;
            class64 var13 = (class64) class64.field754.method3438((long) var9);
            int var14;
            if (var13 == null) {
                var14 = 0;
            } else if (var10 >= 0 && var10 < var13.field751.length) {
                var14 = var13.field751[var10];
            } else {
                var14 = 0;
            }
            var11[var12] = var14;
            return 1;
        } else if (arg0 == 3303) {
            Statics.field269 -= 2;
            int var15 = field1265[Statics.field269];
            int var16 = field1265[Statics.field269 + 1];
            field1265[++Statics.field269 - 1] = class64.method1753(var15, var16);
            return 1;
        } else if (arg0 == 3304) {
            int var17 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = class248.method1638(var17).field3351;
            return 1;
        } else if (arg0 == 3305) {
            int var18 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = client.field989[var18];
            return 1;
        } else if (arg0 == 3306) {
            int var19 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = client.field1090[var19];
            return 1;
        } else if (arg0 == 3307) {
            int var20 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = client.field991[var20];
            return 1;
        } else if (arg0 == 3308) {
            int var21 = Statics.field3219;
            int var22 = (Statics.field2501.field1149 >> 7) + Statics.field3306;
            int var23 = (Statics.field2501.field1198 >> 7) + Statics.field2066;
            field1265[++Statics.field269 - 1] = (var21 << 28) + (var22 << 14) + var23;
            return 1;
        } else if (arg0 == 3309) {
            int var24 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = var24 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var25 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = var25 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var26 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = var26 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1265[++Statics.field269 - 1] = client.field973 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field269 -= 2;
            int var27 = field1265[Statics.field269] + 32768;
            int var28 = field1265[Statics.field269 + 1];
            int[] var29 = field1265;
            int var30 = ++Statics.field269 - 1;
            class64 var31 = (class64) class64.field754.method3438((long) var27);
            int var32;
            if (var31 == null) {
                var32 = -1;
            } else if (var28 >= 0 && var28 < var31.field756.length) {
                var32 = var31.field756[var28];
            } else {
                var32 = -1;
            }
            var29[var30] = var32;
            return 1;
        } else if (arg0 == 3314) {
            Statics.field269 -= 2;
            int var33 = field1265[Statics.field269] + 32768;
            int var34 = field1265[Statics.field269 + 1];
            int[] var35 = field1265;
            int var36 = ++Statics.field269 - 1;
            class64 var37 = (class64) class64.field754.method3438((long) var33);
            int var38;
            if (var37 == null) {
                var38 = 0;
            } else if (var34 >= 0 && var34 < var37.field751.length) {
                var38 = var37.field751[var34];
            } else {
                var38 = 0;
            }
            var35[var36] = var38;
            return 1;
        } else if (arg0 == 3315) {
            Statics.field269 -= 2;
            int var39 = field1265[Statics.field269] + 32768;
            int var40 = field1265[Statics.field269 + 1];
            field1265[++Statics.field269 - 1] = class64.method1753(var39, var40);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field1026 >= 2) {
                field1265[++Statics.field269 - 1] = client.field1026;
            } else {
                field1265[++Statics.field269 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1265[++Statics.field269 - 1] = client.field932;
            return 1;
        } else if (arg0 == 3318) {
            field1265[++Statics.field269 - 1] = client.field1040;
            return 1;
        } else if (arg0 == 3321) {
            field1265[++Statics.field269 - 1] = client.field1020;
            return 1;
        } else if (arg0 == 3322) {
            field1265[++Statics.field269 - 1] = client.field1021;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field1080) {
                field1265[++Statics.field269 - 1] = 1;
            } else {
                field1265[++Statics.field269 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1265[++Statics.field269 - 1] = client.field874;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field269 -= 4;
            int var41 = field1265[Statics.field269];
            int var42 = field1265[Statics.field269 + 1];
            int var43 = field1265[Statics.field269 + 2];
            int var44 = field1265[Statics.field269 + 3];
            int var45 = (var42 << 14) + var41;
            int var46 = (var43 << 28) + var45;
            int var47 = var44 + var46;
            field1265[++Statics.field269 - 1] = var47;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jx.f(ILce;ZI)I")
    public static int method4758(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field269 -= 2;
            int var3 = field1265[Statics.field269];
            int var4 = field1265[Statics.field269 + 1];
            class261 var5 = (class261) class261.field3467.method3418((long) var3);
            class261 var6;
            if (var5 == null) {
                byte[] var7 = Statics.field3476.method3935(8, var3);
                class261 var8 = new class261();
                if (var7 != null) {
                    var8.method4298(new class181(var7));
                }
                class261.field3467.method3417(var8, (long) var3);
                var6 = var8;
            } else {
                var6 = var5;
            }
            class261 var9 = var6;
            if (var6.field3471 != 's') {
            }
            for (int var10 = 0; var10 < var9.field3474; var10++) {
                if (var9.field3472[var10] == var4) {
                    field1262[++Statics.field1267 - 1] = var9.field3468[var10];
                    var9 = null;
                    break;
                }
            }
            if (var9 != null) {
                field1262[++Statics.field1267 - 1] = var9.field3469;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field269 -= 4;
            int var11 = field1265[Statics.field269];
            int var12 = field1265[Statics.field269 + 1];
            int var13 = field1265[Statics.field269 + 2];
            int var14 = field1265[Statics.field269 + 3];
            class261 var15 = (class261) class261.field3467.method3418((long) var13);
            class261 var16;
            if (var15 == null) {
                byte[] var17 = Statics.field3476.method3935(8, var13);
                class261 var18 = new class261();
                if (var17 != null) {
                    var18.method4298(new class181(var17));
                }
                class261.field3467.method3417(var18, (long) var13);
                var16 = var18;
            } else {
                var16 = var15;
            }
            class261 var19 = var16;
            if (var16.field3465 != var11 || var16.field3471 != var12) {
                if (var12 == 115) {
                    field1262[++Statics.field1267 - 1] = "null";
                } else {
                    field1265[++Statics.field269 - 1] = 0;
                }
                return 1;
            }
            for (int var20 = 0; var20 < var19.field3474; var20++) {
                if (var19.field3472[var20] == var14) {
                    if (var12 == 115) {
                        field1262[++Statics.field1267 - 1] = var19.field3468[var20];
                    } else {
                        field1265[++Statics.field269 - 1] = var19.field3473[var20];
                    }
                    var19 = null;
                    break;
                }
            }
            if (var19 != null) {
                if (var12 == 115) {
                    field1262[++Statics.field1267 - 1] = var19.field3469;
                } else {
                    field1265[++Statics.field269 - 1] = var19.field3470;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("m.s(ILce;ZB)I")
    public static int method20(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field269 -= 2;
            int var3 = field1265[Statics.field269];
            int var4 = field1265[Statics.field269 + 1];
            field1265[++Statics.field269 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field269 -= 2;
            int var5 = field1265[Statics.field269];
            int var6 = field1265[Statics.field269 + 1];
            field1265[++Statics.field269 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field269 -= 2;
            int var7 = field1265[Statics.field269];
            int var8 = field1265[Statics.field269 + 1];
            field1265[++Statics.field269 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field269 -= 2;
            int var9 = field1265[Statics.field269];
            int var10 = field1265[Statics.field269 + 1];
            field1265[++Statics.field269 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field269 -= 5;
            int var13 = field1265[Statics.field269];
            int var14 = field1265[Statics.field269 + 1];
            int var15 = field1265[Statics.field269 + 2];
            int var16 = field1265[Statics.field269 + 3];
            int var17 = field1265[Statics.field269 + 4];
            field1265[++Statics.field269 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field269 -= 2;
            int var18 = field1265[Statics.field269];
            int var19 = field1265[Statics.field269 + 1];
            field1265[++Statics.field269 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field269 -= 2;
            int var20 = field1265[Statics.field269];
            int var21 = field1265[Statics.field269 + 1];
            field1265[++Statics.field269 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field269 -= 2;
            int var22 = field1265[Statics.field269];
            int var23 = field1265[Statics.field269 + 1];
            field1265[++Statics.field269 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field269 -= 2;
            int var24 = field1265[Statics.field269];
            int var25 = field1265[Statics.field269 + 1];
            field1265[++Statics.field269 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field269 -= 2;
            int var26 = field1265[Statics.field269];
            int var27 = field1265[Statics.field269 + 1];
            field1265[++Statics.field269 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field269 -= 2;
            int var28 = field1265[Statics.field269];
            int var29 = field1265[Statics.field269 + 1];
            if (var28 == 0) {
                field1265[++Statics.field269 - 1] = 0;
            } else {
                field1265[++Statics.field269 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field269 -= 2;
            int var30 = field1265[Statics.field269];
            int var31 = field1265[Statics.field269 + 1];
            if (var30 == 0) {
                field1265[++Statics.field269 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1265[++Statics.field269 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1265[++Statics.field269 - 1] = var30;
                    break;
                case 2:
                    field1265[++Statics.field269 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1265[++Statics.field269 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1265[++Statics.field269 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1265[++Statics.field269 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field269 -= 2;
            int var32 = field1265[Statics.field269];
            int var33 = field1265[Statics.field269 + 1];
            field1265[++Statics.field269 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field269 -= 2;
            int var34 = field1265[Statics.field269];
            int var35 = field1265[Statics.field269 + 1];
            field1265[++Statics.field269 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field269 -= 3;
            long var36 = (long) field1265[Statics.field269];
            long var38 = (long) field1265[Statics.field269 + 1];
            long var40 = (long) field1265[Statics.field269 + 2];
            field1265[++Statics.field269 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ic.e(ILce;ZI)I")
    public static int method4268(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1262[--Statics.field1267];
            int var4 = field1265[--Statics.field269];
            field1262[++Statics.field1267 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1267 -= 2;
            String var5 = field1262[Statics.field1267];
            String var6 = field1262[Statics.field1267 + 1];
            field1262[++Statics.field1267 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1262[--Statics.field1267];
            int var8 = field1265[--Statics.field269];
            field1262[++Statics.field1267 - 1] = var7 + class278.method2821(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1262[--Statics.field1267];
            field1262[++Statics.field1267 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1265[--Statics.field269];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1261.setTime(new Date(var11));
            int var13 = field1261.get(5);
            int var14 = field1261.get(2);
            int var15 = field1261.get(1);
            field1262[++Statics.field1267 - 1] = var13 + "-" + field1272[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1267 -= 2;
            String var16 = field1262[Statics.field1267];
            String var17 = field1262[Statics.field1267 + 1];
            if (Statics.field2501.field857 != null && Statics.field2501.field857.field2695) {
                field1262[++Statics.field1267 - 1] = var17;
            } else {
                field1262[++Statics.field1267 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1265[--Statics.field269];
            field1262[++Statics.field1267 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1267 -= 2;
            int[] var19 = field1265;
            int var20 = ++Statics.field269 - 1;
            String var21 = field1262[Statics.field1267];
            String var22 = field1262[Statics.field1267 + 1];
            int var23 = client.field878;
            int var24 = var21.length();
            int var25 = var22.length();
            int var26 = 0;
            int var27 = 0;
            char var28 = 0;
            char var29 = 0;
            int var38;
            label218: while (true) {
                if (var26 - var28 >= var24 && var27 - var29 >= var25) {
                    int var30 = Math.min(var24, var25);
                    for (int var31 = 0; var31 < var30; var31++) {
                        char var34 = var21.charAt(var31);
                        char var35 = var22.charAt(var31);
                        if (var34 != var35 && Character.toUpperCase(var34) != Character.toUpperCase(var35)) {
                            char var36 = Character.toLowerCase(var34);
                            char var37 = Character.toLowerCase(var35);
                            if (var36 != var37) {
                                var38 = class172.method1513(var36, var23) - class172.method1513(var37, var23);
                                break label218;
                            }
                        }
                    }
                    int var39 = var24 - var25;
                    if (var39 == 0) {
                        for (int var40 = 0; var40 < var30; var40++) {
                            char var41 = var21.charAt(var40);
                            char var42 = var22.charAt(var40);
                            if (var41 != var42) {
                                var38 = class172.method1513(var41, var23) - class172.method1513(var42, var23);
                                break label218;
                            }
                        }
                        var38 = 0;
                    } else {
                        var38 = var39;
                    }
                    break;
                }
                if (var26 - var28 >= var24) {
                    var38 = -1;
                    break;
                }
                if (var27 - var29 >= var25) {
                    var38 = 1;
                    break;
                }
                char var43;
                if (var28 == 0) {
                    var43 = var21.charAt(var26++);
                } else {
                    var43 = var28;
                    boolean var44 = false;
                }
                char var45;
                if (var29 == 0) {
                    var45 = var22.charAt(var27++);
                } else {
                    var45 = var29;
                    boolean var46 = false;
                }
                var28 = class172.method475(var43);
                var29 = class172.method475(var45);
                char var47 = class172.method1950(var43, var23);
                char var48 = class172.method1950(var45, var23);
                if (var47 != var48 && Character.toUpperCase(var47) != Character.toUpperCase(var48)) {
                    char var49 = Character.toLowerCase(var47);
                    char var50 = Character.toLowerCase(var48);
                    if (var49 != var50) {
                        var38 = class172.method1513(var49, var23) - class172.method1513(var50, var23);
                        break;
                    }
                }
            }
            byte var52;
            if (var38 > 0) {
                var52 = 1;
            } else if (var38 < 0) {
                var52 = -1;
            } else {
                var52 = 0;
            }
            var19[var20] = var52;
            return 1;
        } else if (arg0 == 4108) {
            String var53 = field1262[--Statics.field1267];
            Statics.field269 -= 2;
            int var54 = field1265[Statics.field269];
            int var55 = field1265[Statics.field269 + 1];
            byte[] var56 = Statics.field551.method3935(var55, 0);
            class271 var57 = new class271(var56);
            field1265[++Statics.field269 - 1] = var57.method4582(var53, var54);
            return 1;
        } else if (arg0 == 4109) {
            String var58 = field1262[--Statics.field1267];
            Statics.field269 -= 2;
            int var59 = field1265[Statics.field269];
            int var60 = field1265[Statics.field269 + 1];
            byte[] var61 = Statics.field551.method3935(var60, 0);
            class271 var62 = new class271(var61);
            field1265[++Statics.field269 - 1] = var62.method4581(var58, var59);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1267 -= 2;
            String var63 = field1262[Statics.field1267];
            String var64 = field1262[Statics.field1267 + 1];
            if (field1265[--Statics.field269] == 1) {
                field1262[++Statics.field1267 - 1] = var63;
            } else {
                field1262[++Statics.field1267 - 1] = var64;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var65 = field1262[--Statics.field1267];
            field1262[++Statics.field1267 - 1] = class272.method4638(var65);
            return 1;
        } else if (arg0 == 4112) {
            String var66 = field1262[--Statics.field1267];
            int var67 = field1265[--Statics.field269];
            field1262[++Statics.field1267 - 1] = var66 + (char) var67;
            return 1;
        } else if (arg0 == 4113) {
            int var68 = field1265[--Statics.field269];
            int[] var69 = field1265;
            int var70 = ++Statics.field269 - 1;
            char var71 = (char) var68;
            boolean var72;
            if (var71 >= ' ' && var71 <= '~') {
                var72 = true;
            } else if (var71 >= 160 && var71 <= 255) {
                var72 = true;
            } else if (var71 == 8364 || var71 == 338 || var71 == 8212 || var71 == 339 || var71 == 376) {
                var72 = true;
            } else {
                var72 = false;
            }
            var69[var70] = var72 ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var73 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = class278.method4872((char) var73) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var74 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = class278.method1013((char) var74) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var75 = field1265[--Statics.field269];
            int[] var76 = field1265;
            int var77 = ++Statics.field269 - 1;
            char var78 = (char) var75;
            boolean var79 = var78 >= '0' && var78 <= '9';
            var76[var77] = var79 ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var80 = field1262[--Statics.field1267];
            if (var80 == null) {
                field1265[++Statics.field269 - 1] = 0;
            } else {
                field1265[++Statics.field269 - 1] = var80.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var81 = field1262[--Statics.field1267];
            Statics.field269 -= 2;
            int var82 = field1265[Statics.field269];
            int var83 = field1265[Statics.field269 + 1];
            field1262[++Statics.field1267 - 1] = var81.substring(var82, var83);
            return 1;
        } else if (arg0 == 4119) {
            String var84 = field1262[--Statics.field1267];
            StringBuilder var85 = new StringBuilder(var84.length());
            boolean var86 = false;
            for (int var87 = 0; var87 < var84.length(); var87++) {
                char var88 = var84.charAt(var87);
                if (var88 == '<') {
                    var86 = true;
                } else if (var88 == '>') {
                    var86 = false;
                } else if (!var86) {
                    var85.append(var88);
                }
            }
            field1262[++Statics.field1267 - 1] = var85.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var89 = field1262[--Statics.field1267];
            int var90 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = var89.indexOf(var90);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1267 -= 2;
            String var91 = field1262[Statics.field1267];
            String var92 = field1262[Statics.field1267 + 1];
            int var93 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = var91.indexOf(var92, var93);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("u.q(ILce;ZI)I")
    public static int method58(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1265[++Statics.field269 - 1] = client.field1071;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field269 -= 3;
            client.field1071 = field1265[Statics.field269];
            int var3 = field1265[Statics.field269 + 1];
            class286[] var4 = class286.method3009();
            int var5 = 0;
            class286 var7;
            while (true) {
                if (var5 >= var4.length) {
                    var7 = null;
                    break;
                }
                class286 var6 = var4[var5];
                if (var6.field3785 == var3) {
                    var7 = var6;
                    break;
                }
                var5++;
            }
            Statics.field2706 = var7;
            if (Statics.field2706 == null) {
                Statics.field2706 = class286.field3788;
            }
            client.field987 = field1265[Statics.field269 + 2];
            class171 var8 = class171.method3795(class168.field2328, client.field917.field1471);
            var8.field2423.method3020(client.field1071);
            var8.field2423.method3020(Statics.field2706.field3785);
            var8.field2423.method3020(client.field987);
            client.field917.method1777(var8);
            return 1;
        } else if (arg0 == 5002) {
            String var9 = field1262[--Statics.field1267];
            Statics.field269 -= 2;
            int var10 = field1265[Statics.field269];
            int var11 = field1265[Statics.field269 + 1];
            class171 var12 = class171.method3795(class168.field2344, client.field917.field1471);
            var12.field2423.method3020(class181.method1954(var9) + 2);
            var12.field2423.method3027(var9);
            var12.field2423.method3020(var10 - 1);
            var12.field2423.method3020(var11);
            client.field917.method1777(var12);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field269 -= 2;
            int var13 = field1265[Statics.field269];
            int var14 = field1265[Statics.field269 + 1];
            class72 var15 = class97.method1452(var13, var14);
            if (var15 == null) {
                field1265[++Statics.field269 - 1] = -1;
                field1265[++Statics.field269 - 1] = 0;
                field1262[++Statics.field1267 - 1] = "";
                field1262[++Statics.field1267 - 1] = "";
                field1262[++Statics.field1267 - 1] = "";
            } else {
                field1265[++Statics.field269 - 1] = var15.field831;
                field1265[++Statics.field269 - 1] = var15.field826;
                field1262[++Statics.field1267 - 1] = var15.field833 == null ? "" : var15.field833;
                field1262[++Statics.field1267 - 1] = var15.field830 == null ? "" : var15.field830;
                field1262[++Statics.field1267 - 1] = var15.field829 == null ? "" : var15.field829;
            }
            return 1;
        } else if (arg0 == 5004) {
            int var16 = field1265[--Statics.field269];
            class72 var17 = (class72) class97.field1435.method3391((long) var16);
            if (var17 == null) {
                field1265[++Statics.field269 - 1] = -1;
                field1265[++Statics.field269 - 1] = 0;
                field1262[++Statics.field1267 - 1] = "";
                field1262[++Statics.field1267 - 1] = "";
                field1262[++Statics.field1267 - 1] = "";
            } else {
                field1265[++Statics.field269 - 1] = var17.field828;
                field1265[++Statics.field269 - 1] = var17.field826;
                field1262[++Statics.field1267 - 1] = var17.field833 == null ? "" : var17.field833;
                field1262[++Statics.field1267 - 1] = var17.field830 == null ? "" : var17.field830;
                field1262[++Statics.field1267 - 1] = var17.field829 == null ? "" : var17.field829;
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field2706 == null) {
                field1265[++Statics.field269 - 1] = -1;
            } else {
                field1265[++Statics.field269 - 1] = Statics.field2706.field3785;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var19 = field1262[--Statics.field1267];
            int var20 = field1265[--Statics.field269];
            String var21 = var19.toLowerCase();
            byte var22 = 0;
            if (var21.startsWith(class233.field3107)) {
                var22 = 0;
                var19 = var19.substring(class233.field3107.length());
            } else if (var21.startsWith(class233.field3109)) {
                var22 = 1;
                var19 = var19.substring(class233.field3109.length());
            } else if (var21.startsWith(class233.field3111)) {
                var22 = 2;
                var19 = var19.substring(class233.field3111.length());
            } else if (var21.startsWith(class233.field2973)) {
                var22 = 3;
                var19 = var19.substring(class233.field2973.length());
            } else if (var21.startsWith(class233.field3115)) {
                var22 = 4;
                var19 = var19.substring(class233.field3115.length());
            } else if (var21.startsWith(class233.field3117)) {
                var22 = 5;
                var19 = var19.substring(class233.field3117.length());
            } else if (var21.startsWith(class233.field3160)) {
                var22 = 6;
                var19 = var19.substring(class233.field3160.length());
            } else if (var21.startsWith(class233.field3121)) {
                var22 = 7;
                var19 = var19.substring(class233.field3121.length());
            } else if (var21.startsWith(class233.field3123)) {
                var22 = 8;
                var19 = var19.substring(class233.field3123.length());
            } else if (var21.startsWith(class233.field3125)) {
                var22 = 9;
                var19 = var19.substring(class233.field3125.length());
            } else if (var21.startsWith(class233.field3127)) {
                var22 = 10;
                var19 = var19.substring(class233.field3127.length());
            } else if (var21.startsWith(class233.field3129)) {
                var22 = 11;
                var19 = var19.substring(class233.field3129.length());
            } else if (client.field878 != 0) {
                if (var21.startsWith(class233.field3108)) {
                    var22 = 0;
                    var19 = var19.substring(class233.field3108.length());
                } else if (var21.startsWith(class233.field3077)) {
                    var22 = 1;
                    var19 = var19.substring(class233.field3077.length());
                } else if (var21.startsWith(class233.field3112)) {
                    var22 = 2;
                    var19 = var19.substring(class233.field3112.length());
                } else if (var21.startsWith(class233.field3114)) {
                    var22 = 3;
                    var19 = var19.substring(class233.field3114.length());
                } else if (var21.startsWith(class233.field3116)) {
                    var22 = 4;
                    var19 = var19.substring(class233.field3116.length());
                } else if (var21.startsWith(class233.field3118)) {
                    var22 = 5;
                    var19 = var19.substring(class233.field3118.length());
                } else if (var21.startsWith(class233.field3056)) {
                    var22 = 6;
                    var19 = var19.substring(class233.field3056.length());
                } else if (var21.startsWith(class233.field2979)) {
                    var22 = 7;
                    var19 = var19.substring(class233.field2979.length());
                } else if (var21.startsWith(class233.field2995)) {
                    var22 = 8;
                    var19 = var19.substring(class233.field2995.length());
                } else if (var21.startsWith(class233.field3126)) {
                    var22 = 9;
                    var19 = var19.substring(class233.field3126.length());
                } else if (var21.startsWith(class233.field3128)) {
                    var22 = 10;
                    var19 = var19.substring(class233.field3128.length());
                } else if (var21.startsWith(class233.field3130)) {
                    var22 = 11;
                    var19 = var19.substring(class233.field3130.length());
                }
            }
            String var23 = var19.toLowerCase();
            byte var24 = 0;
            if (var23.startsWith(class233.field3131)) {
                var24 = 1;
                var19 = var19.substring(class233.field3131.length());
            } else if (var23.startsWith(class233.field3133)) {
                var24 = 2;
                var19 = var19.substring(class233.field3133.length());
            } else if (var23.startsWith(class233.field2941)) {
                var24 = 3;
                var19 = var19.substring(class233.field2941.length());
            } else if (var23.startsWith(class233.field3137)) {
                var24 = 4;
                var19 = var19.substring(class233.field3137.length());
            } else if (var23.startsWith(class233.field2957)) {
                var24 = 5;
                var19 = var19.substring(class233.field2957.length());
            } else if (client.field878 != 0) {
                if (var23.startsWith(class233.field3069)) {
                    var24 = 1;
                    var19 = var19.substring(class233.field3069.length());
                } else if (var23.startsWith(class233.field2935)) {
                    var24 = 2;
                    var19 = var19.substring(class233.field2935.length());
                } else if (var23.startsWith(class233.field3202)) {
                    var24 = 3;
                    var19 = var19.substring(class233.field3202.length());
                } else if (var23.startsWith(class233.field3138)) {
                    var24 = 4;
                    var19 = var19.substring(class233.field3138.length());
                } else if (var23.startsWith(class233.field3140)) {
                    var24 = 5;
                    var19 = var19.substring(class233.field3140.length());
                }
            }
            class171 var25 = class171.method3795(class168.field2387, client.field917.field1471);
            var25.field2423.method3020(0);
            int var26 = var25.field2423.field2498;
            var25.field2423.method3020(var20);
            var25.field2423.method3020(var22);
            var25.field2423.method3020(var24);
            class273.method231(var25.field2423, var19);
            var25.field2423.method3033(var25.field2423.field2498 - var26);
            client.field917.method1777(var25);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1267 -= 2;
            String var27 = field1262[Statics.field1267];
            String var28 = field1262[Statics.field1267 + 1];
            class171 var29 = class171.method3795(class168.field2379, client.field917.field1471);
            var29.field2423.method3021(0);
            int var30 = var29.field2423.field2498;
            var29.field2423.method3027(var27);
            class273.method231(var29.field2423, var28);
            var29.field2423.method3238(var29.field2423.field2498 - var30);
            client.field917.method1777(var29);
            return 1;
        } else if (arg0 == 5015) {
            String var31;
            if (Statics.field2501 == null || Statics.field2501.field844 == null) {
                var31 = "";
            } else {
                var31 = Statics.field2501.field844;
            }
            field1262[++Statics.field1267 - 1] = var31;
            return 1;
        } else if (arg0 == 5016) {
            field1265[++Statics.field269 - 1] = client.field987;
            return 1;
        } else if (arg0 == 5017) {
            int var32 = field1265[--Statics.field269];
            int[] var33 = field1265;
            int var34 = ++Statics.field269 - 1;
            class100 var35 = (class100) class97.field1439.get(var32);
            int var36;
            if (var35 == null) {
                var36 = 0;
            } else {
                var36 = var35.method1768();
            }
            var33[var34] = var36;
            return 1;
        } else if (arg0 == 5018) {
            int var37 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = class97.method43(var37);
            return 1;
        } else if (arg0 == 5019) {
            int var38 = field1265[--Statics.field269];
            int[] var39 = field1265;
            int var40 = ++Statics.field269 - 1;
            class72 var41 = (class72) class97.field1435.method3391((long) var38);
            int var42;
            if (var41 == null) {
                var42 = -1;
            } else if (class97.field1436.field2584 == var41.field2570) {
                var42 = -1;
            } else {
                var42 = ((class72) var41.field2570).field831;
            }
            var39[var40] = var42;
            return 1;
        } else if (arg0 == 5020) {
            String var43 = field1262[--Statics.field1267];
            client.method681(var43);
            return 1;
        } else if (arg0 == 5021) {
            client.field1073 = field1262[--Statics.field1267].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1262[++Statics.field1267 - 1] = client.field1073;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("br.h(ILce;ZI)I")
    public static int method1021(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field269 -= 2;
            client.field1107 = (short) field1265[Statics.field269];
            if (client.field1107 <= 0) {
                client.field1107 = 256;
            }
            client.field1108 = (short) field1265[Statics.field269 + 1];
            if (client.field1108 <= 0) {
                client.field1108 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field269 -= 2;
            client.field1037 = (short) field1265[Statics.field269];
            if (client.field1037 <= 0) {
                client.field1037 = 256;
            }
            client.field1110 = (short) field1265[Statics.field269 + 1];
            if (client.field1110 <= 0) {
                client.field1110 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field269 -= 4;
            client.field927 = (short) field1265[Statics.field269];
            if (client.field927 <= 0) {
                client.field927 = 1;
            }
            client.field1112 = (short) field1265[Statics.field269 + 1];
            if (client.field1112 <= 0) {
                client.field1112 = 32767;
            } else if (client.field1112 < client.field927) {
                client.field1112 = client.field927;
            }
            client.field1113 = (short) field1265[Statics.field269 + 2];
            if (client.field1113 <= 0) {
                client.field1113 = 1;
            }
            client.field1062 = (short) field1265[Statics.field269 + 3];
            if (client.field1062 <= 0) {
                client.field1062 = 32767;
            } else if (client.field1062 < client.field1113) {
                client.field1062 = client.field1113;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field1027 == null) {
                field1265[++Statics.field269 - 1] = -1;
                field1265[++Statics.field269 - 1] = -1;
            } else {
                client.method1567(0, 0, client.field1027.field2740, client.field1027.field2741, false);
                field1265[++Statics.field269 - 1] = client.field1117;
                field1265[++Statics.field269 - 1] = client.field1118;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1265[++Statics.field269 - 1] = client.field1037;
            field1265[++Statics.field269 - 1] = client.field1110;
            return 1;
        } else if (arg0 == 6205) {
            field1265[++Statics.field269 - 1] = client.field1107;
            field1265[++Statics.field269 - 1] = client.field1108;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ao.i(ILce;ZI)I")
    public static int method639(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1265[++Statics.field269 - 1] = class80.method610() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class80.field1218 = 0;
            class80 var3;
            if (class80.field1218 < class80.field1219) {
                var3 = Statics.field1230[++class80.field1218 - 1];
            } else {
                var3 = null;
            }
            if (var3 == null) {
                field1265[++Statics.field269 - 1] = -1;
                field1265[++Statics.field269 - 1] = 0;
                field1262[++Statics.field1267 - 1] = "";
                field1265[++Statics.field269 - 1] = 0;
                field1265[++Statics.field269 - 1] = 0;
                field1262[++Statics.field1267 - 1] = "";
            } else {
                field1265[++Statics.field269 - 1] = var3.field1222;
                field1265[++Statics.field269 - 1] = var3.field1213;
                field1262[++Statics.field1267 - 1] = var3.field1226;
                field1265[++Statics.field269 - 1] = var3.field1217;
                field1265[++Statics.field269 - 1] = var3.field1224;
                field1262[++Statics.field1267 - 1] = var3.field1228;
            }
            return 1;
        } else if (arg0 == 6502) {
            class80 var6;
            if (class80.field1218 < class80.field1219) {
                var6 = Statics.field1230[++class80.field1218 - 1];
            } else {
                var6 = null;
            }
            if (var6 == null) {
                field1265[++Statics.field269 - 1] = -1;
                field1265[++Statics.field269 - 1] = 0;
                field1262[++Statics.field1267 - 1] = "";
                field1265[++Statics.field269 - 1] = 0;
                field1265[++Statics.field269 - 1] = 0;
                field1262[++Statics.field1267 - 1] = "";
            } else {
                field1265[++Statics.field269 - 1] = var6.field1222;
                field1265[++Statics.field269 - 1] = var6.field1213;
                field1262[++Statics.field1267 - 1] = var6.field1226;
                field1265[++Statics.field269 - 1] = var6.field1217;
                field1265[++Statics.field269 - 1] = var6.field1224;
                field1262[++Statics.field1267 - 1] = var6.field1228;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var8 = field1265[--Statics.field269];
            class80 var9 = null;
            for (int var10 = 0; var10 < class80.field1219; var10++) {
                if (Statics.field1230[var10].field1222 == var8) {
                    var9 = Statics.field1230[var10];
                    break;
                }
            }
            if (var9 == null) {
                field1265[++Statics.field269 - 1] = -1;
                field1265[++Statics.field269 - 1] = 0;
                field1262[++Statics.field1267 - 1] = "";
                field1265[++Statics.field269 - 1] = 0;
                field1265[++Statics.field269 - 1] = 0;
                field1262[++Statics.field1267 - 1] = "";
            } else {
                field1265[++Statics.field269 - 1] = var9.field1222;
                field1265[++Statics.field269 - 1] = var9.field1213;
                field1262[++Statics.field1267 - 1] = var9.field1226;
                field1265[++Statics.field269 - 1] = var9.field1217;
                field1265[++Statics.field269 - 1] = var9.field1224;
                field1262[++Statics.field1267 - 1] = var9.field1228;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field269 -= 4;
            int var11 = field1265[Statics.field269];
            boolean var12 = field1265[Statics.field269 + 1] == 1;
            int var13 = field1265[Statics.field269 + 2];
            boolean var14 = field1265[Statics.field269 + 3] == 1;
            if (Statics.field1230 != null) {
                class80.method502(0, Statics.field1230.length - 1, var11, var12, var13, var14);
            }
            return 1;
        } else if (arg0 == 6511) {
            int var15 = field1265[--Statics.field269];
            if (var15 >= 0 && var15 < class80.field1219) {
                class80 var16 = Statics.field1230[var15];
                field1265[++Statics.field269 - 1] = var16.field1222;
                field1265[++Statics.field269 - 1] = var16.field1213;
                field1262[++Statics.field1267 - 1] = var16.field1226;
                field1265[++Statics.field269 - 1] = var16.field1217;
                field1265[++Statics.field269 - 1] = var16.field1224;
                field1262[++Statics.field1267 - 1] = var16.field1228;
            } else {
                field1265[++Statics.field269 - 1] = -1;
                field1265[++Statics.field269 - 1] = 0;
                field1262[++Statics.field1267 - 1] = "";
                field1265[++Statics.field269 - 1] = 0;
                field1265[++Statics.field269 - 1] = 0;
                field1262[++Statics.field1267 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field1061 = field1265[--Statics.field269] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field269 -= 2;
            int var17 = field1265[Statics.field269];
            int var18 = field1265[Statics.field269 + 1];
            class259 var19 = class259.method1094(var18);
            if (var19.method4264()) {
                field1262[++Statics.field1267 - 1] = class266.method4(var17).method4508(var18, var19.field3459);
            } else {
                field1265[++Statics.field269 - 1] = class266.method4(var17).method4487(var18, var19.field3458);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field269 -= 2;
            int var20 = field1265[Statics.field269];
            int var21 = field1265[Statics.field269 + 1];
            class259 var22 = class259.method1094(var21);
            if (var22.method4264()) {
                field1262[++Statics.field1267 - 1] = class263.method10(var20).method4359(var21, var22.field3459);
            } else {
                field1265[++Statics.field269 - 1] = class263.method10(var20).method4358(var21, var22.field3458);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field269 -= 2;
            int var23 = field1265[Statics.field269];
            int var24 = field1265[Statics.field269 + 1];
            class259 var25 = class259.method1094(var24);
            if (var25.method4264()) {
                field1262[++Statics.field1267 - 1] = class264.method482(var23).method4419(var24, var25.field3459);
            } else {
                field1265[++Statics.field269 - 1] = class264.method482(var23).method4449(var24, var25.field3458);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field269 -= 2;
            int var26 = field1265[Statics.field269];
            int var27 = field1265[Statics.field269 + 1];
            class259 var28 = class259.method1094(var27);
            if (var28.method4264()) {
                field1262[++Statics.field1267 - 1] = class260.method2842(var26).method4278(var27, var28.field3459);
            } else {
                field1265[++Statics.field269 - 1] = class260.method2842(var26).method4273(var27, var28.field3458);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1265[++Statics.field269 - 1] = 0;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dy.o(ILce;ZI)I")
    public static int method2291(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field3219;
            int var4 = (Statics.field2501.field1149 >> 7) + Statics.field3306;
            int var5 = (Statics.field2501.field1198 >> 7) + Statics.field2066;
            client.method1001().method5037(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1265[--Statics.field269];
            String var7 = "";
            class33 var8 = client.method1001().method5053(var6);
            if (var8 != null) {
                var7 = var8.method251();
            }
            field1262[++Statics.field1267 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1265[--Statics.field269];
            client.method1001().method5038(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1265[++Statics.field269 - 1] = client.method1001().method5050();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1265[--Statics.field269];
            client.method1001().method5154(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1265[++Statics.field269 - 1] = client.method1001().method5052() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class220 var11 = new class220(field1265[--Statics.field269]);
            client.method1001().method5054(var11.field2691, var11.field2692);
            return 1;
        } else if (arg0 == 6607) {
            class220 var12 = new class220(field1265[--Statics.field269]);
            client.method1001().method5055(var12.field2691, var12.field2692);
            return 1;
        } else if (arg0 == 6608) {
            class220 var13 = new class220(field1265[--Statics.field269]);
            client.method1001().method5178(var13.field2690, var13.field2691, var13.field2692);
            return 1;
        } else if (arg0 == 6609) {
            class220 var14 = new class220(field1265[--Statics.field269]);
            client.method1001().method5057(var14.field2690, var14.field2691, var14.field2692);
            return 1;
        } else if (arg0 == 6610) {
            field1265[++Statics.field269 - 1] = client.method1001().method5105();
            field1265[++Statics.field269 - 1] = client.method1001().method5059();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1265[--Statics.field269];
            class33 var16 = client.method1001().method5053(var15);
            if (var16 == null) {
                field1265[++Statics.field269 - 1] = 0;
            } else {
                field1265[++Statics.field269 - 1] = var16.method323().method3799();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1265[--Statics.field269];
            class33 var18 = client.method1001().method5053(var17);
            if (var18 == null) {
                field1265[++Statics.field269 - 1] = 0;
                field1265[++Statics.field269 - 1] = 0;
            } else {
                field1265[++Statics.field269 - 1] = (var18.method255() - var18.method254() + 1) * 64;
                field1265[++Statics.field269 - 1] = (var18.method257() - var18.method256() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1265[--Statics.field269];
            class33 var20 = client.method1001().method5053(var19);
            if (var20 == null) {
                field1265[++Statics.field269 - 1] = 0;
                field1265[++Statics.field269 - 1] = 0;
                field1265[++Statics.field269 - 1] = 0;
                field1265[++Statics.field269 - 1] = 0;
            } else {
                field1265[++Statics.field269 - 1] = var20.method254() * 64;
                field1265[++Statics.field269 - 1] = var20.method256() * 64;
                field1265[++Statics.field269 - 1] = var20.method255() * 64 + 64 - 1;
                field1265[++Statics.field269 - 1] = var20.method257() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1265[--Statics.field269];
            class33 var22 = client.method1001().method5053(var21);
            if (var22 == null) {
                field1265[++Statics.field269 - 1] = -1;
            } else {
                field1265[++Statics.field269 - 1] = var22.method253();
            }
            return 1;
        } else if (arg0 == 6615) {
            class220 var23 = client.method1001().method5060();
            if (var23 == null) {
                field1265[++Statics.field269 - 1] = -1;
                field1265[++Statics.field269 - 1] = -1;
            } else {
                field1265[++Statics.field269 - 1] = var23.field2691;
                field1265[++Statics.field269 - 1] = var23.field2692;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1265[++Statics.field269 - 1] = client.method1001().method5190();
            return 1;
        } else if (arg0 == 6617) {
            class220 var24 = new class220(field1265[--Statics.field269]);
            class33 var25 = client.method1001().method5121();
            if (var25 == null) {
                field1265[++Statics.field269 - 1] = -1;
                field1265[++Statics.field269 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method245(var24.field2690, var24.field2691, var24.field2692);
            if (var26 == null) {
                field1265[++Statics.field269 - 1] = -1;
                field1265[++Statics.field269 - 1] = -1;
            } else {
                field1265[++Statics.field269 - 1] = var26[0];
                field1265[++Statics.field269 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class220 var27 = new class220(field1265[--Statics.field269]);
            class33 var28 = client.method1001().method5121();
            if (var28 == null) {
                field1265[++Statics.field269 - 1] = -1;
                field1265[++Statics.field269 - 1] = -1;
                return 1;
            }
            class220 var29 = var28.method258(var27.field2691, var27.field2692);
            if (var29 == null) {
                field1265[++Statics.field269 - 1] = -1;
            } else {
                field1265[++Statics.field269 - 1] = var29.method3799();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field269 -= 2;
            int var30 = field1265[Statics.field269];
            class220 var31 = new class220(field1265[Statics.field269 + 1]);
            method2252(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field269 -= 2;
            int var32 = field1265[Statics.field269];
            class220 var33 = new class220(field1265[Statics.field269 + 1]);
            method2252(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field269 -= 2;
            int var34 = field1265[Statics.field269];
            class220 var35 = new class220(field1265[Statics.field269 + 1]);
            class33 var36 = client.method1001().method5053(var34);
            if (var36 == null) {
                field1265[++Statics.field269 - 1] = 0;
                return 1;
            } else {
                field1265[++Statics.field269 - 1] = var36.method243(var35.field2690, var35.field2691, var35.field2692) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1265[++Statics.field269 - 1] = client.method1001().method5061();
            field1265[++Statics.field269 - 1] = client.method1001().method5062();
            return 1;
        } else if (arg0 == 6623) {
            class220 var37 = new class220(field1265[--Statics.field269]);
            class33 var38 = client.method1001().method5036(var37.field2690, var37.field2691, var37.field2692);
            if (var38 == null) {
                field1265[++Statics.field269 - 1] = -1;
            } else {
                field1265[++Statics.field269 - 1] = var38.method248();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method1001().method5063(field1265[--Statics.field269]);
            return 1;
        } else if (arg0 == 6625) {
            client.method1001().method5064();
            return 1;
        } else if (arg0 == 6626) {
            client.method1001().method5070(field1265[--Statics.field269]);
            return 1;
        } else if (arg0 == 6627) {
            client.method1001().method5066();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1265[--Statics.field269] == 1;
            client.method1001().method5217(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1265[--Statics.field269];
            client.method1001().method5197(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1265[--Statics.field269];
            client.method1001().method5193(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method1001().method5185();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1265[--Statics.field269] == 1;
            client.method1001().method5100(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field269 -= 2;
            int var43 = field1265[Statics.field269];
            boolean var44 = field1265[Statics.field269 + 1] == 1;
            client.method1001().method5072(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field269 -= 2;
            int var45 = field1265[Statics.field269];
            boolean var46 = field1265[Statics.field269 + 1] == 1;
            client.method1001().method5073(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1265[++Statics.field269 - 1] = client.method1001().method5074() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = client.method1001().method5153(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1265[--Statics.field269];
            field1265[++Statics.field269 - 1] = client.method1001().method5109(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field269 -= 2;
            int var49 = field1265[Statics.field269];
            class220 var50 = new class220(field1265[Statics.field269 + 1]);
            class220 var51 = client.method1001().method5079(var49, var50);
            if (var51 == null) {
                field1265[++Statics.field269 - 1] = -1;
            } else {
                field1265[++Statics.field269 - 1] = var51.method3799();
            }
            return 1;
        } else if (arg0 == 6639) {
            class40 var52 = client.method1001().method5130();
            if (var52 == null) {
                field1265[++Statics.field269 - 1] = -1;
                field1265[++Statics.field269 - 1] = -1;
            } else {
                field1265[++Statics.field269 - 1] = var52.field514;
                field1265[++Statics.field269 - 1] = var52.field507.method3799();
            }
            return 1;
        } else if (arg0 == 6640) {
            class40 var53 = client.method1001().method5082();
            if (var53 == null) {
                field1265[++Statics.field269 - 1] = -1;
                field1265[++Statics.field269 - 1] = -1;
            } else {
                field1265[++Statics.field269 - 1] = var53.field514;
                field1265[++Statics.field269 - 1] = var53.field507.method3799();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1265[--Statics.field269];
            class250 var55 = Statics.field3365[var54];
            if (var55.field3370 == null) {
                field1262[++Statics.field1267 - 1] = "";
            } else {
                field1262[++Statics.field1267 - 1] = var55.field3370;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1265[--Statics.field269];
            class250 var57 = Statics.field3365[var56];
            field1265[++Statics.field269 - 1] = var57.field3372;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1265[--Statics.field269];
            class250 var59 = Statics.field3365[var58];
            if (var59 == null) {
                field1265[++Statics.field269 - 1] = -1;
            } else {
                field1265[++Statics.field269 - 1] = var59.field3385;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1265[--Statics.field269];
            class250 var61 = Statics.field3365[var60];
            if (var61 == null) {
                field1265[++Statics.field269 - 1] = -1;
            } else {
                field1265[++Statics.field269 - 1] = var61.field3379;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1265[++Statics.field269 - 1] = Statics.field381.field573;
            return 1;
        } else if (arg0 == 6698) {
            field1265[++Statics.field269 - 1] = Statics.field381.field576.method3799();
            return 1;
        } else if (arg0 == 6699) {
            field1265[++Statics.field269 - 1] = Statics.field381.field575.method3799();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bg.w(IB)V")
    public static void method919(int arg0) {
        if (arg0 == -1 || !class224.method3331(arg0)) {
            return;
        }
        class224[] var1 = Statics.field257[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class224 var3 = var1[var2];
            if (var3.field2762 != null) {
                class69 var4 = new class69();
                var4.field800 = var3;
                var4.field798 = var3.field2762;
                method2974(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("dt.ah(ILhp;ZI)V")
    public static void method2252(int arg0, class220 arg1, boolean arg2) {
        class33 var3 = client.method1001().method5053(arg0);
        int var4 = Statics.field2501.field854;
        int var5 = (Statics.field2501.field1149 >> 7) + Statics.field3306;
        int var6 = (Statics.field2501.field1198 >> 7) + Statics.field2066;
        class220 var7 = new class220(var4, var5, var6);
        client.method1001().method5208(var3, var7, arg1, arg2);
    }
}
