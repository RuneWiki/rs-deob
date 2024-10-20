package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cj")
public class class85 {

    @ObfuscatedName("cj.w")
    public static int[] field1330 = new int[5];

    @ObfuscatedName("cj.k")
    public static int[][] field1331 = new int[5][5000];

    @ObfuscatedName("cj.v")
    public static int[] field1332 = new int[1000];

    @ObfuscatedName("cj.r")
    public static String[] field1334 = new String[1000];

    @ObfuscatedName("cj.d")
    public static int field1336 = 0;

    @ObfuscatedName("cj.o")
    public static class63[] field1329 = new class63[50];

    @ObfuscatedName("cj.s")
    public static Calendar field1338 = Calendar.getInstance();

    @ObfuscatedName("cj.c")
    public static final String[] field1339 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cj.a")
    public static int field1340 = 0;

    public class85() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("be.e(Lbl;I)V")
    public static void method1409(class71 arg0) {
        method38(arg0, 200000);
    }

    @ObfuscatedName("r.n(Lbl;IB)V")
    public static void method38(class71 arg0, int arg1) {
        Object[] var2 = arg0.field850;
        class101 var4;
        if (class221.method1564(arg0.field846)) {
            Statics.field542 = (class48) var2[0];
            class244 var3 = Statics.field3277[Statics.field542.field601];
            var4 = class101.method178(arg0.field846, var3.field3298, var3.field3297);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class101.method234(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field1333 = 0;
        Statics.field1328 = 0;
        int var6 = -1;
        int[] var7 = var4.field1523;
        int[] var8 = var4.field1522;
        byte var9 = -1;
        field1336 = 0;
        try {
            Statics.field1341 = new int[var4.field1532];
            int var10 = 0;
            Statics.field1342 = new String[var4.field1527];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field838;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field845;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field837 == null ? -1 : arg0.field837.field2624;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field840;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field837 == null ? -1 : arg0.field837.field2726;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field836 == null ? -1 : arg0.field836.field2624;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field836 == null ? -1 : arg0.field836.field2726;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field842;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field843;
                    }
                    Statics.field1341[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field841;
                    }
                    Statics.field1342[var11++] = var14;
                }
            }
            int var15 = 0;
            field1340 = arg0.field849;
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
                                                                                                                label249: while (true) {
                                                                                                                    var15++;
                                                                                                                    if (var15 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var6++;
                                                                                                                    int var59 = var7[var6];
                                                                                                                    if (var59 >= 100) {
                                                                                                                        boolean var53;
                                                                                                                        if (var4.field1522[var6] == 1) {
                                                                                                                            var53 = true;
                                                                                                                        } else {
                                                                                                                            var53 = false;
                                                                                                                        }
                                                                                                                        int var54 = method4149(var59, var4, var53);
                                                                                                                        switch(var54) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var59 == 0) {
                                                                                                                        field1332[++Statics.field1333 - 1] = var8[var6];
                                                                                                                    } else if (var59 == 1) {
                                                                                                                        int var16 = var8[var6];
                                                                                                                        field1332[++Statics.field1333 - 1] = class213.field2585[var16];
                                                                                                                    } else if (var59 == 2) {
                                                                                                                        int var17 = var8[var6];
                                                                                                                        class213.field2585[var17] = field1332[--Statics.field1333];
                                                                                                                        client.method11(var17);
                                                                                                                    } else if (var59 == 3) {
                                                                                                                        field1334[++Statics.field1328 - 1] = var4.field1525[var6];
                                                                                                                    } else if (var59 == 6) {
                                                                                                                        var6 += var8[var6];
                                                                                                                    } else if (var59 == 7) {
                                                                                                                        Statics.field1333 -= 2;
                                                                                                                        if (field1332[Statics.field1333] != field1332[Statics.field1333 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 8) {
                                                                                                                        Statics.field1333 -= 2;
                                                                                                                        if (field1332[Statics.field1333] == field1332[Statics.field1333 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 9) {
                                                                                                                        Statics.field1333 -= 2;
                                                                                                                        if (field1332[Statics.field1333] < field1332[Statics.field1333 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 10) {
                                                                                                                        Statics.field1333 -= 2;
                                                                                                                        if (field1332[Statics.field1333] > field1332[Statics.field1333 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 21) {
                                                                                                                        if (field1336 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var18 = field1329[--field1336];
                                                                                                                        var4 = var18.field767;
                                                                                                                        var7 = var4.field1523;
                                                                                                                        var8 = var4.field1522;
                                                                                                                        var6 = var18.field764;
                                                                                                                        Statics.field1341 = var18.field765;
                                                                                                                        Statics.field1342 = var18.field766;
                                                                                                                    } else if (var59 == 25) {
                                                                                                                        int var19 = var8[var6];
                                                                                                                        field1332[++Statics.field1333 - 1] = class213.method3619(var19);
                                                                                                                    } else if (var59 == 27) {
                                                                                                                        int var20 = var8[var6];
                                                                                                                        class213.method108(var20, field1332[--Statics.field1333]);
                                                                                                                    } else if (var59 == 31) {
                                                                                                                        Statics.field1333 -= 2;
                                                                                                                        if (field1332[Statics.field1333] <= field1332[Statics.field1333 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 32) {
                                                                                                                        Statics.field1333 -= 2;
                                                                                                                        if (field1332[Statics.field1333] >= field1332[Statics.field1333 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 33) {
                                                                                                                        field1332[++Statics.field1333 - 1] = Statics.field1341[var8[var6]];
                                                                                                                    } else if (var59 == 34) {
                                                                                                                        Statics.field1341[var8[var6]] = field1332[--Statics.field1333];
                                                                                                                    } else if (var59 == 35) {
                                                                                                                        field1334[++Statics.field1328 - 1] = Statics.field1342[var8[var6]];
                                                                                                                    } else if (var59 == 36) {
                                                                                                                        Statics.field1342[var8[var6]] = field1334[--Statics.field1328];
                                                                                                                    } else if (var59 == 37) {
                                                                                                                        int var21 = var8[var6];
                                                                                                                        Statics.field1328 -= var21;
                                                                                                                        String[] var22 = field1334;
                                                                                                                        int var23 = Statics.field1328;
                                                                                                                        String var24;
                                                                                                                        if (var21 == 0) {
                                                                                                                            var24 = "";
                                                                                                                        } else if (var21 == 1) {
                                                                                                                            String var25 = var22[var23];
                                                                                                                            if (var25 == null) {
                                                                                                                                var24 = "null";
                                                                                                                            } else {
                                                                                                                                var24 = var25.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var26 = var21 + var23;
                                                                                                                            int var27 = 0;
                                                                                                                            for (int var28 = var23; var28 < var26; var28++) {
                                                                                                                                String var29 = var22[var28];
                                                                                                                                if (var29 == null) {
                                                                                                                                    var27 += 4;
                                                                                                                                } else {
                                                                                                                                    var27 += var29.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var30 = new StringBuilder(var27);
                                                                                                                            for (int var31 = var23; var31 < var26; var31++) {
                                                                                                                                String var32 = var22[var31];
                                                                                                                                if (var32 == null) {
                                                                                                                                    var30.append("null");
                                                                                                                                } else {
                                                                                                                                    var30.append(var32);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var24 = var30.toString();
                                                                                                                        }
                                                                                                                        field1334[++Statics.field1328 - 1] = var24;
                                                                                                                    } else if (var59 == 38) {
                                                                                                                        Statics.field1333--;
                                                                                                                    } else if (var59 == 39) {
                                                                                                                        Statics.field1328--;
                                                                                                                    } else if (var59 == 40) {
                                                                                                                        int var34 = var8[var6];
                                                                                                                        class101 var35 = class101.method234(var34);
                                                                                                                        int[] var36 = new int[var35.field1532];
                                                                                                                        String[] var37 = new String[var35.field1527];
                                                                                                                        for (int var38 = 0; var38 < var35.field1528; var38++) {
                                                                                                                            var36[var38] = field1332[Statics.field1333 - var35.field1528 + var38];
                                                                                                                        }
                                                                                                                        for (int var39 = 0; var39 < var35.field1529; var39++) {
                                                                                                                            var37[var39] = field1334[Statics.field1328 - var35.field1529 + var39];
                                                                                                                        }
                                                                                                                        Statics.field1333 -= var35.field1528;
                                                                                                                        Statics.field1328 -= var35.field1529;
                                                                                                                        class63 var40 = new class63();
                                                                                                                        var40.field767 = var4;
                                                                                                                        var40.field764 = var6;
                                                                                                                        var40.field765 = Statics.field1341;
                                                                                                                        var40.field766 = Statics.field1342;
                                                                                                                        field1329[++field1336 - 1] = var40;
                                                                                                                        var4 = var35;
                                                                                                                        var7 = var35.field1523;
                                                                                                                        var8 = var35.field1522;
                                                                                                                        var6 = -1;
                                                                                                                        Statics.field1341 = var36;
                                                                                                                        Statics.field1342 = var37;
                                                                                                                    } else if (var59 == 42) {
                                                                                                                        field1332[++Statics.field1333 - 1] = Statics.field602.method1727(var8[var6]);
                                                                                                                    } else if (var59 == 43) {
                                                                                                                        Statics.field602.method1694(var8[var6], field1332[--Statics.field1333]);
                                                                                                                    } else if (var59 == 44) {
                                                                                                                        int var41 = var8[var6] >> 16;
                                                                                                                        int var42 = var8[var6] & 0xFFFF;
                                                                                                                        int var43 = field1332[--Statics.field1333];
                                                                                                                        if (var43 >= 0 && var43 <= 5000) {
                                                                                                                            field1330[var41] = var43;
                                                                                                                            byte var44 = -1;
                                                                                                                            if (var42 == 105) {
                                                                                                                                var44 = 0;
                                                                                                                            }
                                                                                                                            int var45 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var45 >= var43) {
                                                                                                                                    continue label249;
                                                                                                                                }
                                                                                                                                field1331[var41][var45] = var44;
                                                                                                                                var45++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var59 == 45) {
                                                                                                                        int var46 = var8[var6];
                                                                                                                        int var47 = field1332[--Statics.field1333];
                                                                                                                        if (var47 < 0 || var47 >= field1330[var46]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1332[++Statics.field1333 - 1] = field1331[var46][var47];
                                                                                                                    } else if (var59 == 46) {
                                                                                                                        int var48 = var8[var6];
                                                                                                                        Statics.field1333 -= 2;
                                                                                                                        int var49 = field1332[Statics.field1333];
                                                                                                                        if (var49 < 0 || var49 >= field1330[var48]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1331[var48][var49] = field1332[Statics.field1333 + 1];
                                                                                                                    } else if (var59 == 47) {
                                                                                                                        String var50 = Statics.field602.method1697(var8[var6]);
                                                                                                                        if (var50 == null) {
                                                                                                                            var50 = "null";
                                                                                                                        }
                                                                                                                        field1334[++Statics.field1328 - 1] = var50;
                                                                                                                    } else if (var59 == 48) {
                                                                                                                        Statics.field602.method1696(var8[var6], field1334[--Statics.field1328]);
                                                                                                                    } else if (var59 == 60) {
                                                                                                                        class188 var51 = var4.field1530[var8[var6]];
                                                                                                                        class200 var52 = (class200) var51.method3249((long) field1332[--Statics.field1333]);
                                                                                                                        if (var52 != null) {
                                                                                                                            var6 += var52.field2466;
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
        } catch (Exception var58) {
            StringBuilder var56 = new StringBuilder(30);
            var56.append("").append(var4.field2451).append(" ");
            for (int var57 = field1336 - 1; var57 >= 0; var57--) {
                var56.append("").append(field1329[var57].field767.field2451).append(" ");
            }
            var56.append("").append(var9);
            class154.method1592(var56.toString(), var58);
        }
    }

    @ObfuscatedName("iw.g(ILcc;ZI)I")
    public static int method4149(int arg0, class101 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method2721(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method998(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2700(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method168(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method47(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method251(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method16(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method1032(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            class218 var6 = arg2 ? Statics.field3662 : Statics.field2165;
            byte var7;
            if (arg0 == 1700) {
                field1332[++Statics.field1333 - 1] = var6.field2612;
                var7 = 1;
            } else if (arg0 == 1701) {
                if (var6.field2612 == -1) {
                    field1332[++Statics.field1333 - 1] = 0;
                } else {
                    field1332[++Statics.field1333 - 1] = var6.field2745;
                }
                var7 = 1;
            } else if (arg0 == 1702) {
                field1332[++Statics.field1333 - 1] = var6.field2726;
                var7 = 1;
            } else {
                var7 = 2;
            }
            return var7;
        } else if (arg0 < 1900) {
            return method1491(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method694(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method998(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2700(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method168(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method47(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method251(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method1046(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            class218 var8 = class218.method4538(field1332[--Statics.field1333]);
            byte var9;
            if (arg0 == 2600) {
                field1332[++Statics.field1333 - 1] = var8.field2674;
                var9 = 1;
            } else if (arg0 == 2601) {
                field1332[++Statics.field1333 - 1] = var8.field2646;
                var9 = 1;
            } else if (arg0 == 2602) {
                field1334[++Statics.field1328 - 1] = var8.field2684;
                var9 = 1;
            } else if (arg0 == 2603) {
                field1332[++Statics.field1333 - 1] = var8.field2647;
                var9 = 1;
            } else if (arg0 == 2604) {
                field1332[++Statics.field1333 - 1] = var8.field2750;
                var9 = 1;
            } else if (arg0 == 2605) {
                field1332[++Statics.field1333 - 1] = var8.field2631;
                var9 = 1;
            } else if (arg0 == 2606) {
                field1332[++Statics.field1333 - 1] = var8.field2675;
                var9 = 1;
            } else if (arg0 == 2607) {
                field1332[++Statics.field1333 - 1] = var8.field2677;
                var9 = 1;
            } else if (arg0 == 2608) {
                field1332[++Statics.field1333 - 1] = var8.field2705;
                var9 = 1;
            } else if (arg0 == 2609) {
                field1332[++Statics.field1333 - 1] = var8.field2655;
                var9 = 1;
            } else if (arg0 == 2610) {
                field1332[++Statics.field1333 - 1] = var8.field2645;
                var9 = 1;
            } else if (arg0 == 2611) {
                field1332[++Statics.field1333 - 1] = var8.field2649;
                var9 = 1;
            } else if (arg0 == 2612) {
                field1332[++Statics.field1333 - 1] = var8.field2650;
                var9 = 1;
            } else if (arg0 == 2613) {
                field1332[++Statics.field1333 - 1] = var8.field2654.method6();
                var9 = 1;
            } else {
                var9 = 2;
            }
            return var9;
        } else if (arg0 < 2800) {
            return method580(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            class218 var10 = class218.method4538(field1332[--Statics.field1333]);
            byte var15;
            if (arg0 == 2800) {
                int[] var11 = field1332;
                int var12 = ++Statics.field1333 - 1;
                int var13 = client.method76(var10);
                int var14 = var13 >> 11 & 0x3F;
                var11[var12] = var14;
                var15 = 1;
            } else if (arg0 == 2801) {
                int var16 = field1332[--Statics.field1333];
                int var293 = var16 - 1;
                if (var10.field2698 == null || var293 >= var10.field2698.length || var10.field2698[var293] == null) {
                    field1334[++Statics.field1328 - 1] = "";
                } else {
                    field1334[++Statics.field1328 - 1] = var10.field2698[var293];
                }
                var15 = 1;
            } else if (arg0 == 2802) {
                if (var10.field2697 == null) {
                    field1334[++Statics.field1328 - 1] = "";
                } else {
                    field1334[++Statics.field1328 - 1] = var10.field2697;
                }
                var15 = 1;
            } else {
                var15 = 2;
            }
            return var15;
        } else if (arg0 < 3000) {
            return method694(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            byte var18;
            if (arg0 == 3100) {
                String var17 = field1334[--Statics.field1328];
                Statics.method206(0, "", var17);
                var18 = 1;
            } else if (arg0 == 3101) {
                Statics.field1333 -= 2;
                client.method4006(Statics.field655, field1332[Statics.field1333], field1332[Statics.field1333 + 1]);
                var18 = 1;
            } else if (arg0 == 3103) {
                client.method432();
                var18 = 1;
            } else if (arg0 == 3104) {
                String var19 = field1334[--Statics.field1328];
                int var20 = 0;
                if (class272.method4148(var19)) {
                    int var21 = class272.method4007(var19, 10, true);
                    var20 = var21;
                }
                client.field957.method3154(251);
                client.field957.method2916(var20);
                var18 = 1;
            } else if (arg0 == 3105) {
                String var22 = field1334[--Statics.field1328];
                client.field957.method3154(34);
                client.field957.method2913(var22.length() + 1);
                client.field957.method2927(var22);
                var18 = 1;
            } else if (arg0 == 3106) {
                String var23 = field1334[--Statics.field1328];
                client.field957.method3154(240);
                client.field957.method2913(var23.length() + 1);
                client.field957.method2927(var23);
                var18 = 1;
            } else if (arg0 == 3107) {
                int var24 = field1332[--Statics.field1333];
                String var25 = field1334[--Statics.field1328];
                client.method997(var24, var25);
                var18 = 1;
            } else if (arg0 == 3108) {
                Statics.field1333 -= 3;
                int var26 = field1332[Statics.field1333];
                int var27 = field1332[Statics.field1333 + 1];
                int var28 = field1332[Statics.field1333 + 2];
                class218 var29 = class218.method4538(var28);
                client.method15(var29, var26, var27);
                var18 = 1;
            } else if (arg0 == 3109) {
                Statics.field1333 -= 2;
                int var30 = field1332[Statics.field1333];
                int var31 = field1332[Statics.field1333 + 1];
                class218 var32 = arg2 ? Statics.field3662 : Statics.field2165;
                client.method15(var32, var30, var31);
                var18 = 1;
            } else if (arg0 == 3110) {
                Statics.field646 = field1332[--Statics.field1333] == 1;
                var18 = 1;
            } else if (arg0 == 3111) {
                field1332[++Statics.field1333 - 1] = Statics.field2198.field1296 ? 1 : 0;
                var18 = 1;
            } else if (arg0 == 3112) {
                Statics.field2198.field1296 = field1332[--Statics.field1333] == 1;
                class82.method1649();
                var18 = 1;
            } else if (arg0 == 3113) {
                String var33 = field1334[--Statics.field1328];
                boolean var34 = field1332[--Statics.field1333] == 1;
                class57.method43(var33, var34, false);
                var18 = 1;
            } else if (arg0 == 3115) {
                int var35 = field1332[--Statics.field1333];
                client.field957.method3154(174);
                client.field957.method2914(var35);
                var18 = 1;
            } else if (arg0 == 3116) {
                int var36 = field1332[--Statics.field1333];
                Statics.field1328 -= 2;
                String var37 = field1334[Statics.field1328];
                String var38 = field1334[Statics.field1328 + 1];
                if (var37.length() > 500) {
                    var18 = 1;
                } else if (var38.length() > 500) {
                    var18 = 1;
                } else {
                    client.field957.method3154(212);
                    client.field957.method2914(1 + class175.method563(var37) + class175.method563(var38));
                    client.field957.method2927(var38);
                    client.field957.method2952(var36);
                    client.field957.method2927(var37);
                    var18 = 1;
                }
            } else if (arg0 == 3117) {
                client.field1010 = field1332[--Statics.field1333] == 1;
                var18 = 1;
            } else {
                var18 = 2;
            }
            return var18;
        } else if (arg0 < 3300) {
            byte var42;
            if (arg0 == 3200) {
                Statics.field1333 -= 3;
                int var39 = field1332[Statics.field1333];
                int var40 = field1332[Statics.field1333 + 1];
                int var41 = field1332[Statics.field1333 + 2];
                if (client.field1110 != 0 && var40 != 0 && client.field1145 < 50) {
                    client.field1176[client.field1145] = var39;
                    client.field1147[client.field1145] = var40;
                    client.field1148[client.field1145] = var41;
                    client.field1150[client.field1145] = null;
                    client.field1149[client.field1145] = 0;
                    client.field1145++;
                }
                var42 = 1;
            } else if (arg0 == 3201) {
                int var43 = field1332[--Statics.field1333];
                if (var43 == -1 && !client.field1142) {
                    Statics.field2487.method3479();
                    class205.field2488 = 1;
                    Statics.field2489 = null;
                } else if (var43 != -1 && client.field1141 != var43 && client.field1061 != 0 && !client.field1142) {
                    class239 var44 = Statics.field3307;
                    int var45 = client.field1061;
                    class205.field2488 = 1;
                    Statics.field2489 = var44;
                    Statics.field274 = var43;
                    Statics.field2490 = 0;
                    Statics.field2491 = var45;
                    Statics.field473 = false;
                    Statics.field2492 = 2;
                }
                client.field1141 = var43;
                var42 = 1;
            } else if (arg0 == 3202) {
                Statics.field1333 -= 2;
                int var46 = field1332[Statics.field1333];
                int var47 = field1332[Statics.field1333 + 1];
                if (client.field1061 != 0 && var46 != -1) {
                    class205.method248(Statics.field475, var46, 0, client.field1061, false);
                    client.field1142 = true;
                }
                var42 = 1;
            } else {
                var42 = 2;
            }
            return var42;
        } else if (arg0 < 3400) {
            return method1475(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method1499(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            byte var48;
            if (arg0 == 3600) {
                if (client.field1171 == 0) {
                    field1332[++Statics.field1333 - 1] = -2;
                } else if (client.field1171 == 1) {
                    field1332[++Statics.field1333 - 1] = -1;
                } else {
                    field1332[++Statics.field1333 - 1] = client.field976;
                }
                var48 = 1;
            } else if (arg0 == 3601) {
                int var49 = field1332[--Statics.field1333];
                if (client.field1171 == 2 && var49 < client.field976) {
                    field1334[++Statics.field1328 - 1] = client.field1172[var49].field802;
                    field1334[++Statics.field1328 - 1] = client.field1172[var49].field797;
                } else {
                    field1334[++Statics.field1328 - 1] = "";
                    field1334[++Statics.field1328 - 1] = "";
                }
                var48 = 1;
            } else if (arg0 == 3602) {
                int var50 = field1332[--Statics.field1333];
                if (client.field1171 == 2 && var50 < client.field976) {
                    field1332[++Statics.field1333 - 1] = client.field1172[var50].field803;
                } else {
                    field1332[++Statics.field1333 - 1] = 0;
                }
                var48 = 1;
            } else if (arg0 == 3603) {
                int var51 = field1332[--Statics.field1333];
                if (client.field1171 == 2 && var51 < client.field976) {
                    field1332[++Statics.field1333 - 1] = client.field1172[var51].field798;
                } else {
                    field1332[++Statics.field1333 - 1] = 0;
                }
                var48 = 1;
            } else if (arg0 == 3604) {
                String var52 = field1334[--Statics.field1328];
                int var53 = field1332[--Statics.field1333];
                client.method2753(var52, var53);
                var48 = 1;
            } else if (arg0 == 3605) {
                String var54 = field1334[--Statics.field1328];
                client.method124(var54);
                var48 = 1;
            } else if (arg0 == 3606) {
                String var55 = field1334[--Statics.field1328];
                client.method19(var55);
                var48 = 1;
            } else if (arg0 == 3607) {
                String var56 = field1334[--Statics.field1328];
                client.method3772(var56, false);
                var48 = 1;
            } else if (arg0 == 3608) {
                String var57 = field1334[--Statics.field1328];
                if (var57 != null) {
                    String var58 = class269.method46(var57, Statics.field423);
                    if (var58 != null) {
                        for (int var59 = 0; var59 < client.field1064; var59++) {
                            class72 var60 = client.field1183[var59];
                            String var61 = var60.field857;
                            String var62 = class269.method46(var61, Statics.field423);
                            if (class279.method1648(var57, var58, var61, var62)) {
                                client.field1064--;
                                for (int var63 = var59; var63 < client.field1064; var63++) {
                                    client.field1183[var63] = client.field1183[var63 + 1];
                                }
                                client.field1092 = client.field1088;
                                client.field957.method3154(255);
                                client.field957.method2913(class175.method563(var57));
                                client.field957.method2927(var57);
                                break;
                            }
                        }
                    }
                }
                var48 = 1;
            } else if (arg0 == 3609) {
                String var64 = field1334[--Statics.field1328];
                class232[] var65 = class232.method1018();
                for (int var66 = 0; var66 < var65.length; var66++) {
                    class232 var67 = var65[var66];
                    if (var67.field3159 != -1) {
                        int var69 = var67.field3159;
                        String var70 = "<img=" + var69 + ">";
                        if (var64.startsWith(var70)) {
                            var64 = var64.substring(6 + Integer.toString(var67.field3159).length());
                            break;
                        }
                    }
                }
                field1332[++Statics.field1333 - 1] = client.method44(var64, false) ? 1 : 0;
                var48 = 1;
            } else if (arg0 == 3611) {
                if (client.field916 == null) {
                    field1334[++Statics.field1328 - 1] = "";
                } else {
                    field1334[++Statics.field1328 - 1] = class270.method14(client.field916);
                }
                var48 = 1;
            } else if (arg0 == 3612) {
                if (client.field916 == null) {
                    field1332[++Statics.field1333 - 1] = 0;
                } else {
                    field1332[++Statics.field1333 - 1] = Statics.field34;
                }
                var48 = 1;
            } else if (arg0 == 3613) {
                int var71 = field1332[--Statics.field1333];
                if (client.field916 == null || var71 >= Statics.field34) {
                    field1334[++Statics.field1328 - 1] = "";
                } else {
                    field1334[++Statics.field1328 - 1] = Statics.field468[var71].field911;
                }
                var48 = 1;
            } else if (arg0 == 3614) {
                int var72 = field1332[--Statics.field1333];
                if (client.field916 == null || var72 >= Statics.field34) {
                    field1332[++Statics.field1333 - 1] = 0;
                } else {
                    field1332[++Statics.field1333 - 1] = Statics.field468[var72].field912;
                }
                var48 = 1;
            } else if (arg0 == 3615) {
                int var73 = field1332[--Statics.field1333];
                if (client.field916 == null || var73 >= Statics.field34) {
                    field1332[++Statics.field1333 - 1] = 0;
                } else {
                    field1332[++Statics.field1333 - 1] = Statics.field468[var73].field910;
                }
                var48 = 1;
            } else if (arg0 == 3616) {
                field1332[++Statics.field1333 - 1] = Statics.field1138;
                var48 = 1;
            } else if (arg0 == 3617) {
                String var74 = field1334[--Statics.field1328];
                client.method469(var74);
                var48 = 1;
            } else if (arg0 == 3618) {
                field1332[++Statics.field1333 - 1] = Statics.field805;
                var48 = 1;
            } else if (arg0 == 3619) {
                String var75 = field1334[--Statics.field1328];
                if (!var75.equals("")) {
                    client.field957.method3154(59);
                    client.field957.method2913(class175.method563(var75));
                    client.field957.method2927(var75);
                }
                var48 = 1;
            } else if (arg0 == 3620) {
                client.method1598();
                var48 = 1;
            } else if (arg0 == 3621) {
                if (client.field1171 == 0) {
                    field1332[++Statics.field1333 - 1] = -1;
                } else {
                    field1332[++Statics.field1333 - 1] = client.field1064;
                }
                var48 = 1;
            } else if (arg0 == 3622) {
                int var76 = field1332[--Statics.field1333];
                if (client.field1171 == 0 || var76 >= client.field1064) {
                    field1334[++Statics.field1328 - 1] = "";
                    field1334[++Statics.field1328 - 1] = "";
                } else {
                    field1334[++Statics.field1328 - 1] = client.field1183[var76].field857;
                    field1334[++Statics.field1328 - 1] = client.field1183[var76].field852;
                }
                var48 = 1;
            } else if (arg0 == 3623) {
                String var77;
                label1267: {
                    var77 = field1334[--Statics.field1328];
                    String var79 = "<img=0>";
                    if (!var77.startsWith(var79)) {
                        String var81 = "<img=1>";
                        if (!var77.startsWith(var81)) {
                            break label1267;
                        }
                    }
                    var77 = var77.substring(7);
                }
                field1332[++Statics.field1333 - 1] = client.method163(var77) ? 1 : 0;
                var48 = 1;
            } else if (arg0 == 3624) {
                int var82 = field1332[--Statics.field1333];
                if (Statics.field468 == null || var82 >= Statics.field34 || !Statics.field468[var82].field911.equalsIgnoreCase(Statics.field655.field896)) {
                    field1332[++Statics.field1333 - 1] = 0;
                } else {
                    field1332[++Statics.field1333 - 1] = 1;
                }
                var48 = 1;
            } else if (arg0 == 3625) {
                if (client.field1130 == null) {
                    field1334[++Statics.field1328 - 1] = "";
                } else {
                    field1334[++Statics.field1328 - 1] = class270.method14(client.field1130);
                }
                var48 = 1;
            } else {
                var48 = 2;
            }
            return var48;
        } else if (arg0 < 4000) {
            byte var84;
            if (arg0 == 3903) {
                int var83 = field1332[--Statics.field1333];
                field1332[++Statics.field1333 - 1] = client.field1179[var83].method95();
                var84 = 1;
            } else if (arg0 == 3904) {
                int var85 = field1332[--Statics.field1333];
                field1332[++Statics.field1333 - 1] = client.field1179[var85].field304;
                var84 = 1;
            } else if (arg0 == 3905) {
                int var86 = field1332[--Statics.field1333];
                field1332[++Statics.field1333 - 1] = client.field1179[var86].field305;
                var84 = 1;
            } else if (arg0 == 3906) {
                int var87 = field1332[--Statics.field1333];
                field1332[++Statics.field1333 - 1] = client.field1179[var87].field306;
                var84 = 1;
            } else if (arg0 == 3907) {
                int var88 = field1332[--Statics.field1333];
                field1332[++Statics.field1333 - 1] = client.field1179[var88].field303;
                var84 = 1;
            } else if (arg0 == 3908) {
                int var89 = field1332[--Statics.field1333];
                field1332[++Statics.field1333 - 1] = client.field1179[var89].field308;
                var84 = 1;
            } else if (arg0 == 3910) {
                int var90 = field1332[--Statics.field1333];
                int var91 = client.field1179[var90].method91();
                field1332[++Statics.field1333 - 1] = var91 == 0 ? 1 : 0;
                var84 = 1;
            } else if (arg0 == 3911) {
                int var92 = field1332[--Statics.field1333];
                int var93 = client.field1179[var92].method91();
                field1332[++Statics.field1333 - 1] = var93 == 2 ? 1 : 0;
                var84 = 1;
            } else if (arg0 == 3912) {
                int var94 = field1332[--Statics.field1333];
                int var95 = client.field1179[var94].method91();
                field1332[++Statics.field1333 - 1] = var95 == 5 ? 1 : 0;
                var84 = 1;
            } else if (arg0 == 3913) {
                int var96 = field1332[--Statics.field1333];
                int var97 = client.field1179[var96].method91();
                field1332[++Statics.field1333 - 1] = var97 == 1 ? 1 : 0;
                var84 = 1;
            } else if (arg0 == 3914) {
                boolean var98 = field1332[--Statics.field1333] == 1;
                if (Statics.field2328 != null) {
                    Statics.field2328.method58(class14.field278, var98);
                }
                var84 = 1;
            } else if (arg0 == 3915) {
                boolean var99 = field1332[--Statics.field1333] == 1;
                if (Statics.field2328 != null) {
                    Statics.field2328.method58(class14.field279, var99);
                }
                var84 = 1;
            } else if (arg0 == 3916) {
                Statics.field1333 -= 2;
                boolean var100 = field1332[Statics.field1333] == 1;
                boolean var101 = field1332[Statics.field1333 + 1] == 1;
                if (Statics.field2328 != null) {
                    Statics.field2328.method58(new class97(var101), var100);
                }
                var84 = 1;
            } else if (arg0 == 3917) {
                boolean var102 = field1332[--Statics.field1333] == 1;
                if (Statics.field2328 != null) {
                    Statics.field2328.method58(class14.field281, var102);
                }
                var84 = 1;
            } else if (arg0 == 3918) {
                boolean var103 = field1332[--Statics.field1333] == 1;
                if (Statics.field2328 != null) {
                    Statics.field2328.method58(class14.field286, var103);
                }
                var84 = 1;
            } else if (arg0 == 3919) {
                field1332[++Statics.field1333 - 1] = Statics.field2328 == null ? 0 : Statics.field2328.field280.size();
                var84 = 1;
            } else if (arg0 == 3920) {
                int var104 = field1332[--Statics.field1333];
                class15 var105 = (class15) Statics.field2328.field280.get(var104);
                field1332[++Statics.field1333 - 1] = var105.field294;
                var84 = 1;
            } else if (arg0 == 3921) {
                int var106 = field1332[--Statics.field1333];
                class15 var107 = (class15) Statics.field2328.field280.get(var106);
                field1334[++Statics.field1328 - 1] = var107.method65();
                var84 = 1;
            } else if (arg0 == 3922) {
                int var108 = field1332[--Statics.field1333];
                class15 var109 = (class15) Statics.field2328.field280.get(var108);
                field1334[++Statics.field1328 - 1] = var109.method69();
                var84 = 1;
            } else if (arg0 == 3923) {
                int var110 = field1332[--Statics.field1333];
                class15 var111 = (class15) Statics.field2328.field280.get(var110);
                long var112 = class177.method2903() - Statics.field666 - var111.field288;
                int var114 = (int) (var112 / 3600000L);
                int var115 = (int) ((var112 - (long) (var114 * 3600000)) / 60000L);
                int var116 = (int) ((var112 - (long) (var114 * 3600000) - (long) (var115 * 60000)) / 1000L);
                String var117 = var114 + ":" + var115 / 10 + var115 % 10 + ":" + var116 / 10 + var116 % 10;
                field1334[++Statics.field1328 - 1] = var117;
                var84 = 1;
            } else if (arg0 == 3924) {
                int var118 = field1332[--Statics.field1333];
                class15 var119 = (class15) Statics.field2328.field280.get(var118);
                field1332[++Statics.field1333 - 1] = var119.field289.field306;
                var84 = 1;
            } else if (arg0 == 3925) {
                int var120 = field1332[--Statics.field1333];
                class15 var121 = (class15) Statics.field2328.field280.get(var120);
                field1332[++Statics.field1333 - 1] = var121.field289.field305;
                var84 = 1;
            } else if (arg0 == 3926) {
                int var122 = field1332[--Statics.field1333];
                class15 var123 = (class15) Statics.field2328.field280.get(var122);
                field1332[++Statics.field1333 - 1] = var123.field289.field304;
                var84 = 1;
            } else {
                var84 = 2;
            }
            return var84;
        } else if (arg0 < 4100) {
            byte var126;
            if (arg0 == 4000) {
                Statics.field1333 -= 2;
                int var124 = field1332[Statics.field1333];
                int var125 = field1332[Statics.field1333 + 1];
                field1332[++Statics.field1333 - 1] = var124 + var125;
                var126 = 1;
            } else if (arg0 == 4001) {
                Statics.field1333 -= 2;
                int var127 = field1332[Statics.field1333];
                int var128 = field1332[Statics.field1333 + 1];
                field1332[++Statics.field1333 - 1] = var127 - var128;
                var126 = 1;
            } else if (arg0 == 4002) {
                Statics.field1333 -= 2;
                int var129 = field1332[Statics.field1333];
                int var130 = field1332[Statics.field1333 + 1];
                field1332[++Statics.field1333 - 1] = var129 * var130;
                var126 = 1;
            } else if (arg0 == 4003) {
                Statics.field1333 -= 2;
                int var131 = field1332[Statics.field1333];
                int var132 = field1332[Statics.field1333 + 1];
                field1332[++Statics.field1333 - 1] = var131 / var132;
                var126 = 1;
            } else if (arg0 == 4004) {
                int var133 = field1332[--Statics.field1333];
                field1332[++Statics.field1333 - 1] = (int) (Math.random() * (double) var133);
                var126 = 1;
            } else if (arg0 == 4005) {
                int var134 = field1332[--Statics.field1333];
                field1332[++Statics.field1333 - 1] = (int) (Math.random() * (double) (var134 + 1));
                var126 = 1;
            } else if (arg0 == 4006) {
                Statics.field1333 -= 5;
                int var135 = field1332[Statics.field1333];
                int var136 = field1332[Statics.field1333 + 1];
                int var137 = field1332[Statics.field1333 + 2];
                int var138 = field1332[Statics.field1333 + 3];
                int var139 = field1332[Statics.field1333 + 4];
                field1332[++Statics.field1333 - 1] = (var136 - var135) * (var139 - var137) / (var138 - var137) + var135;
                var126 = 1;
            } else if (arg0 == 4007) {
                Statics.field1333 -= 2;
                int var140 = field1332[Statics.field1333];
                int var141 = field1332[Statics.field1333 + 1];
                field1332[++Statics.field1333 - 1] = var140 * var141 / 100 + var140;
                var126 = 1;
            } else if (arg0 == 4008) {
                Statics.field1333 -= 2;
                int var142 = field1332[Statics.field1333];
                int var143 = field1332[Statics.field1333 + 1];
                field1332[++Statics.field1333 - 1] = var142 | 0x1 << var143;
                var126 = 1;
            } else if (arg0 == 4009) {
                Statics.field1333 -= 2;
                int var144 = field1332[Statics.field1333];
                int var145 = field1332[Statics.field1333 + 1];
                field1332[++Statics.field1333 - 1] = var144 & -1 - (0x1 << var145);
                var126 = 1;
            } else if (arg0 == 4010) {
                Statics.field1333 -= 2;
                int var146 = field1332[Statics.field1333];
                int var147 = field1332[Statics.field1333 + 1];
                field1332[++Statics.field1333 - 1] = (var146 & 0x1 << var147) == 0 ? 0 : 1;
                var126 = 1;
            } else if (arg0 == 4011) {
                Statics.field1333 -= 2;
                int var148 = field1332[Statics.field1333];
                int var149 = field1332[Statics.field1333 + 1];
                field1332[++Statics.field1333 - 1] = var148 % var149;
                var126 = 1;
            } else if (arg0 == 4012) {
                Statics.field1333 -= 2;
                int var150 = field1332[Statics.field1333];
                int var151 = field1332[Statics.field1333 + 1];
                if (var150 == 0) {
                    field1332[++Statics.field1333 - 1] = 0;
                } else {
                    field1332[++Statics.field1333 - 1] = (int) Math.pow((double) var150, (double) var151);
                }
                var126 = 1;
            } else if (arg0 == 4013) {
                Statics.field1333 -= 2;
                int var152 = field1332[Statics.field1333];
                int var153 = field1332[Statics.field1333 + 1];
                if (var152 == 0) {
                    field1332[++Statics.field1333 - 1] = 0;
                } else if (var153 == 0) {
                    field1332[++Statics.field1333 - 1] = Integer.MAX_VALUE;
                } else {
                    field1332[++Statics.field1333 - 1] = (int) Math.pow((double) var152, 1.0D / (double) var153);
                }
                var126 = 1;
            } else if (arg0 == 4014) {
                Statics.field1333 -= 2;
                int var154 = field1332[Statics.field1333];
                int var155 = field1332[Statics.field1333 + 1];
                field1332[++Statics.field1333 - 1] = var154 & var155;
                var126 = 1;
            } else if (arg0 == 4015) {
                Statics.field1333 -= 2;
                int var156 = field1332[Statics.field1333];
                int var157 = field1332[Statics.field1333 + 1];
                field1332[++Statics.field1333 - 1] = var156 | var157;
                var126 = 1;
            } else if (arg0 == 4018) {
                Statics.field1333 -= 3;
                long var158 = (long) field1332[Statics.field1333];
                long var160 = (long) field1332[Statics.field1333 + 1];
                long var162 = (long) field1332[Statics.field1333 + 2];
                field1332[++Statics.field1333 - 1] = (int) (var158 * var162 / var160);
                var126 = 1;
            } else {
                var126 = 2;
            }
            return var126;
        } else if (arg0 < 4200) {
            return method2205(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            byte var165;
            if (arg0 == 4200) {
                int var164 = field1332[--Statics.field1333];
                field1334[++Statics.field1328 - 1] = class258.method4627(var164).field3487;
                var165 = 1;
            } else if (arg0 == 4201) {
                Statics.field1333 -= 2;
                int var166 = field1332[Statics.field1333];
                int var167 = field1332[Statics.field1333 + 1];
                class258 var168 = class258.method4627(var166);
                if (var167 < 1 || var167 > 5 || var168.field3524[var167 - 1] == null) {
                    field1334[++Statics.field1328 - 1] = "";
                } else {
                    field1334[++Statics.field1328 - 1] = var168.field3524[var167 - 1];
                }
                var165 = 1;
            } else if (arg0 == 4202) {
                Statics.field1333 -= 2;
                int var169 = field1332[Statics.field1333];
                int var170 = field1332[Statics.field1333 + 1];
                class258 var171 = class258.method4627(var169);
                if (var170 < 1 || var170 > 5 || var171.field3502[var170 - 1] == null) {
                    field1334[++Statics.field1328 - 1] = "";
                } else {
                    field1334[++Statics.field1328 - 1] = var171.field3502[var170 - 1];
                }
                var165 = 1;
            } else if (arg0 == 4203) {
                int var172 = field1332[--Statics.field1333];
                field1332[++Statics.field1333 - 1] = class258.method4627(var172).field3499;
                var165 = 1;
            } else if (arg0 == 4204) {
                int var173 = field1332[--Statics.field1333];
                field1332[++Statics.field1333 - 1] = class258.method4627(var173).field3485 == 1 ? 1 : 0;
                var165 = 1;
            } else if (arg0 == 4205) {
                int var174 = field1332[--Statics.field1333];
                class258 var175 = class258.method4627(var174);
                if (var175.field3519 == -1 && var175.field3504 >= 0) {
                    field1332[++Statics.field1333 - 1] = var175.field3504;
                } else {
                    field1332[++Statics.field1333 - 1] = var174;
                }
                var165 = 1;
            } else if (arg0 == 4206) {
                int var176 = field1332[--Statics.field1333];
                class258 var177 = class258.method4627(var176);
                if (var177.field3519 >= 0 && var177.field3504 >= 0) {
                    field1332[++Statics.field1333 - 1] = var177.field3504;
                } else {
                    field1332[++Statics.field1333 - 1] = var176;
                }
                var165 = 1;
            } else if (arg0 == 4207) {
                int var178 = field1332[--Statics.field1333];
                field1332[++Statics.field1333 - 1] = class258.method4627(var178).field3500 ? 1 : 0;
                var165 = 1;
            } else if (arg0 == 4208) {
                int var179 = field1332[--Statics.field1333];
                class258 var180 = class258.method4627(var179);
                if (var180.field3531 == -1 && var180.field3530 >= 0) {
                    field1332[++Statics.field1333 - 1] = var180.field3530;
                } else {
                    field1332[++Statics.field1333 - 1] = var179;
                }
                var165 = 1;
            } else if (arg0 == 4209) {
                int var181 = field1332[--Statics.field1333];
                class258 var182 = class258.method4627(var181);
                if (var182.field3531 >= 0 && var182.field3530 >= 0) {
                    field1332[++Statics.field1333 - 1] = var182.field3530;
                } else {
                    field1332[++Statics.field1333 - 1] = var181;
                }
                var165 = 1;
            } else if (arg0 == 4210) {
                String var183 = field1334[--Statics.field1328];
                int var184 = field1332[--Statics.field1333];
                client.method61(var183, var184 == 1);
                field1332[++Statics.field1333 - 1] = Statics.field374;
                var165 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field2191 == null || Statics.field828 >= Statics.field374) {
                    field1332[++Statics.field1333 - 1] = -1;
                } else {
                    field1332[++Statics.field1333 - 1] = Statics.field2191[++Statics.field828 - 1] & 0xFFFF;
                }
                var165 = 1;
            } else if (arg0 == 4212) {
                Statics.field828 = 0;
                var165 = 1;
            } else {
                var165 = 2;
            }
            return var165;
        } else if (arg0 < 5100) {
            return Statics.method1082(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method151(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            byte var190;
            if (arg0 == 5504) {
                Statics.field1333 -= 2;
                int var188 = field1332[Statics.field1333];
                int var189 = field1332[Statics.field1333 + 1];
                if (!client.field940) {
                    client.field986 = var188;
                    client.field987 = var189;
                }
                var190 = 1;
            } else if (arg0 == 5505) {
                field1332[++Statics.field1333 - 1] = client.field986;
                var190 = 1;
            } else if (arg0 == 5506) {
                field1332[++Statics.field1333 - 1] = client.field987;
                var190 = 1;
            } else if (arg0 == 5530) {
                int var191 = field1332[--Statics.field1333];
                if (var191 < 0) {
                    var191 = 0;
                }
                client.field979 = var191;
                var190 = 1;
            } else if (arg0 == 5531) {
                field1332[++Statics.field1333 - 1] = client.field979;
                var190 = 1;
            } else {
                var190 = 2;
            }
            return var190;
        } else if (arg0 < 5700) {
            byte var192;
            if (arg0 == 5630) {
                client.field1041 = 250;
                var192 = 1;
            } else {
                var192 = 2;
            }
            return var192;
        } else if (arg0 < 6300) {
            byte var193;
            if (arg0 == 6200) {
                Statics.field1333 -= 2;
                client.field1184 = (short) field1332[Statics.field1333];
                if (client.field1184 <= 0) {
                    client.field1184 = 256;
                }
                client.field1158 = (short) field1332[Statics.field1333 + 1];
                if (client.field1158 <= 0) {
                    client.field1158 = 205;
                }
                var193 = 1;
            } else if (arg0 == 6201) {
                Statics.field1333 -= 2;
                client.field1159 = (short) field1332[Statics.field1333];
                if (client.field1159 <= 0) {
                    client.field1159 = 256;
                }
                client.field1063 = (short) field1332[Statics.field1333 + 1];
                if (client.field1063 <= 0) {
                    client.field1063 = 320;
                }
                var193 = 1;
            } else if (arg0 == 6202) {
                Statics.field1333 -= 4;
                client.field965 = (short) field1332[Statics.field1333];
                if (client.field965 <= 0) {
                    client.field965 = 1;
                }
                client.field1162 = (short) field1332[Statics.field1333 + 1];
                if (client.field1162 <= 0) {
                    client.field1162 = 32767;
                } else if (client.field1162 < client.field965) {
                    client.field1162 = client.field965;
                }
                client.field1163 = (short) field1332[Statics.field1333 + 2];
                if (client.field1163 <= 0) {
                    client.field1163 = 1;
                }
                client.field1164 = (short) field1332[Statics.field1333 + 3];
                if (client.field1164 <= 0) {
                    client.field1164 = 32767;
                } else if (client.field1164 < client.field1163) {
                    client.field1164 = client.field1163;
                }
                var193 = 1;
            } else if (arg0 == 6203) {
                if (client.field1170 == null) {
                    field1332[++Statics.field1333 - 1] = -1;
                    field1332[++Statics.field1333 - 1] = -1;
                } else {
                    client.method92(0, 0, client.field1170.field2639, client.field1170.field2640, false);
                    field1332[++Statics.field1333 - 1] = client.field1050;
                    field1332[++Statics.field1333 - 1] = client.field1168;
                }
                var193 = 1;
            } else if (arg0 == 6204) {
                field1332[++Statics.field1333 - 1] = client.field1159;
                field1332[++Statics.field1333 - 1] = client.field1063;
                var193 = 1;
            } else if (arg0 == 6205) {
                field1332[++Statics.field1333 - 1] = client.field1184;
                field1332[++Statics.field1333 - 1] = client.field1158;
                var193 = 1;
            } else {
                var193 = 2;
            }
            return var193;
        } else if (arg0 < 6600) {
            byte var194;
            if (arg0 == 6500) {
                field1332[++Statics.field1333 - 1] = class81.method2752() ? 1 : 0;
                var194 = 1;
            } else if (arg0 == 6501) {
                class81.field1278 = 0;
                class81 var195;
                if (class81.field1278 < class81.field1279) {
                    var195 = Statics.field649[++class81.field1278 - 1];
                } else {
                    var195 = null;
                }
                if (var195 == null) {
                    field1332[++Statics.field1333 - 1] = -1;
                    field1332[++Statics.field1333 - 1] = 0;
                    field1334[++Statics.field1328 - 1] = "";
                    field1332[++Statics.field1333 - 1] = 0;
                    field1332[++Statics.field1333 - 1] = 0;
                    field1334[++Statics.field1328 - 1] = "";
                } else {
                    field1332[++Statics.field1333 - 1] = var195.field1284;
                    field1332[++Statics.field1333 - 1] = var195.field1285;
                    field1334[++Statics.field1328 - 1] = var195.field1288;
                    field1332[++Statics.field1333 - 1] = var195.field1280;
                    field1332[++Statics.field1333 - 1] = var195.field1286;
                    field1334[++Statics.field1328 - 1] = var195.field1291;
                }
                var194 = 1;
            } else if (arg0 == 6502) {
                class81 var198;
                if (class81.field1278 < class81.field1279) {
                    var198 = Statics.field649[++class81.field1278 - 1];
                } else {
                    var198 = null;
                }
                if (var198 == null) {
                    field1332[++Statics.field1333 - 1] = -1;
                    field1332[++Statics.field1333 - 1] = 0;
                    field1334[++Statics.field1328 - 1] = "";
                    field1332[++Statics.field1333 - 1] = 0;
                    field1332[++Statics.field1333 - 1] = 0;
                    field1334[++Statics.field1328 - 1] = "";
                } else {
                    field1332[++Statics.field1333 - 1] = var198.field1284;
                    field1332[++Statics.field1333 - 1] = var198.field1285;
                    field1334[++Statics.field1328 - 1] = var198.field1288;
                    field1332[++Statics.field1333 - 1] = var198.field1280;
                    field1332[++Statics.field1333 - 1] = var198.field1286;
                    field1334[++Statics.field1328 - 1] = var198.field1291;
                }
                var194 = 1;
            } else if (arg0 == 6506) {
                int var200 = field1332[--Statics.field1333];
                class81 var201 = null;
                for (int var202 = 0; var202 < class81.field1279; var202++) {
                    if (Statics.field649[var202].field1284 == var200) {
                        var201 = Statics.field649[var202];
                        break;
                    }
                }
                if (var201 == null) {
                    field1332[++Statics.field1333 - 1] = -1;
                    field1332[++Statics.field1333 - 1] = 0;
                    field1334[++Statics.field1328 - 1] = "";
                    field1332[++Statics.field1333 - 1] = 0;
                    field1332[++Statics.field1333 - 1] = 0;
                    field1334[++Statics.field1328 - 1] = "";
                } else {
                    field1332[++Statics.field1333 - 1] = var201.field1284;
                    field1332[++Statics.field1333 - 1] = var201.field1285;
                    field1334[++Statics.field1328 - 1] = var201.field1288;
                    field1332[++Statics.field1333 - 1] = var201.field1280;
                    field1332[++Statics.field1333 - 1] = var201.field1286;
                    field1334[++Statics.field1328 - 1] = var201.field1291;
                }
                var194 = 1;
            } else if (arg0 == 6507) {
                Statics.field1333 -= 4;
                int var203 = field1332[Statics.field1333];
                boolean var204 = field1332[Statics.field1333 + 1] == 1;
                int var205 = field1332[Statics.field1333 + 2];
                boolean var206 = field1332[Statics.field1333 + 3] == 1;
                class81.method147(var203, var204, var205, var206);
                var194 = 1;
            } else if (arg0 == 6511) {
                int var207 = field1332[--Statics.field1333];
                if (var207 >= 0 && var207 < class81.field1279) {
                    class81 var208 = Statics.field649[var207];
                    field1332[++Statics.field1333 - 1] = var208.field1284;
                    field1332[++Statics.field1333 - 1] = var208.field1285;
                    field1334[++Statics.field1328 - 1] = var208.field1288;
                    field1332[++Statics.field1333 - 1] = var208.field1280;
                    field1332[++Statics.field1333 - 1] = var208.field1286;
                    field1334[++Statics.field1328 - 1] = var208.field1291;
                } else {
                    field1332[++Statics.field1333 - 1] = -1;
                    field1332[++Statics.field1333 - 1] = 0;
                    field1334[++Statics.field1328 - 1] = "";
                    field1332[++Statics.field1333 - 1] = 0;
                    field1332[++Statics.field1333 - 1] = 0;
                    field1334[++Statics.field1328 - 1] = "";
                }
                var194 = 1;
            } else if (arg0 == 6512) {
                client.field1143 = field1332[--Statics.field1333] == 1;
                var194 = 1;
            } else if (arg0 == 6513) {
                Statics.field1333 -= 2;
                int var209 = field1332[Statics.field1333];
                int var210 = field1332[Statics.field1333 + 1];
                class253 var211 = class253.method3666(var210);
                if (var211.method4134()) {
                    field1334[++Statics.field1328 - 1] = class260.method137(var209).method4365(var210, var211.field3382);
                } else {
                    field1332[++Statics.field1333 - 1] = class260.method137(var209).method4348(var210, var211.field3381);
                }
                var194 = 1;
            } else if (arg0 == 6514) {
                Statics.field1333 -= 2;
                int var212 = field1332[Statics.field1333];
                int var213 = field1332[Statics.field1333 + 1];
                class253 var214 = class253.method3666(var213);
                if (var214.method4134()) {
                    field1334[++Statics.field1328 - 1] = class257.method247(var212).method4219(var213, var214.field3382);
                } else {
                    field1332[++Statics.field1333 - 1] = class257.method247(var212).method4230(var213, var214.field3381);
                }
                var194 = 1;
            } else if (arg0 == 6515) {
                Statics.field1333 -= 2;
                int var215 = field1332[Statics.field1333];
                int var216 = field1332[Statics.field1333 + 1];
                class253 var217 = class253.method3666(var216);
                if (var217.method4134()) {
                    field1334[++Statics.field1328 - 1] = class258.method4627(var215).method4284(var216, var217.field3382);
                } else {
                    field1332[++Statics.field1333 - 1] = class258.method4627(var215).method4283(var216, var217.field3381);
                }
                var194 = 1;
            } else if (arg0 == 6516) {
                Statics.field1333 -= 2;
                int var218 = field1332[Statics.field1333];
                int var219 = field1332[Statics.field1333 + 1];
                class253 var220 = class253.method3666(var219);
                if (var220.method4134()) {
                    String[] var221 = field1334;
                    int var222 = ++Statics.field1328 - 1;
                    class254 var223 = (class254) class254.field3389.method3288((long) var218);
                    class254 var224;
                    if (var223 == null) {
                        byte[] var225 = Statics.field3388.method3817(34, var218);
                        class254 var226 = new class254();
                        if (var225 != null) {
                            var226.method4152(new class175(var225));
                        }
                        var226.method4151();
                        class254.field3389.method3278(var226, (long) var218);
                        var224 = var226;
                    } else {
                        var224 = var223;
                    }
                    var221[var222] = var224.method4161(var219, var220.field3382);
                } else {
                    int[] var227 = field1332;
                    int var228 = ++Statics.field1333 - 1;
                    class254 var229 = (class254) class254.field3389.method3288((long) var218);
                    class254 var230;
                    if (var229 == null) {
                        byte[] var231 = Statics.field3388.method3817(34, var218);
                        class254 var232 = new class254();
                        if (var231 != null) {
                            var232.method4152(new class175(var231));
                        }
                        var232.method4151();
                        class254.field3389.method3278(var232, (long) var218);
                        var230 = var232;
                    } else {
                        var230 = var229;
                    }
                    var227[var228] = var230.method4154(var219, var220.field3381);
                }
                var194 = 1;
            } else {
                var194 = 2;
            }
            return var194;
        } else if (arg0 < 6700) {
            byte var236;
            if (arg0 == 6600) {
                int var233 = Statics.field424;
                int var234 = (Statics.field655.field1221 >> 7) + Statics.field376;
                int var235 = (Statics.field655.field1207 >> 7) + Statics.field847;
                client.method166().method4954(var233, var234, var235, true);
                var236 = 1;
            } else if (arg0 == 6601) {
                int var237 = field1332[--Statics.field1333];
                String var238 = "";
                class33 var239 = client.method166().method4915(var237);
                if (var239 != null) {
                    var238 = var239.method264();
                }
                field1334[++Statics.field1328 - 1] = var238;
                var236 = 1;
            } else if (arg0 == 6602) {
                int var240 = field1332[--Statics.field1333];
                client.method166().method4900(var240);
                var236 = 1;
            } else if (arg0 == 6603) {
                field1332[++Statics.field1333 - 1] = client.method166().method5063();
                var236 = 1;
            } else if (arg0 == 6604) {
                int var241 = field1332[--Statics.field1333];
                client.method166().method4909(var241);
                var236 = 1;
            } else if (arg0 == 6605) {
                field1332[++Statics.field1333 - 1] = client.method166().method4952() ? 1 : 0;
                var236 = 1;
            } else if (arg0 == 6606) {
                class214 var242 = new class214(field1332[--Statics.field1333]);
                client.method166().method4922(var242.field2588, var242.field2591);
                var236 = 1;
            } else if (arg0 == 6607) {
                class214 var243 = new class214(field1332[--Statics.field1333]);
                client.method166().method4917(var243.field2588, var243.field2591);
                var236 = 1;
            } else if (arg0 == 6608) {
                class214 var244 = new class214(field1332[--Statics.field1333]);
                client.method166().method4940(var244.field2589, var244.field2588, var244.field2591);
                var236 = 1;
            } else if (arg0 == 6609) {
                class214 var245 = new class214(field1332[--Statics.field1333]);
                client.method166().method4919(var245.field2589, var245.field2588, var245.field2591);
                var236 = 1;
            } else if (arg0 == 6610) {
                field1332[++Statics.field1333 - 1] = client.method166().method5014();
                field1332[++Statics.field1333 - 1] = client.method166().method4963();
                var236 = 1;
            } else if (arg0 == 6611) {
                int var246 = field1332[--Statics.field1333];
                class33 var247 = client.method166().method4915(var246);
                if (var247 == null) {
                    field1332[++Statics.field1333 - 1] = 0;
                } else {
                    field1332[++Statics.field1333 - 1] = var247.method281().method3653();
                }
                var236 = 1;
            } else if (arg0 == 6612) {
                int var248 = field1332[--Statics.field1333];
                class33 var249 = client.method166().method4915(var248);
                if (var249 == null) {
                    field1332[++Statics.field1333 - 1] = 0;
                    field1332[++Statics.field1333 - 1] = 0;
                } else {
                    field1332[++Statics.field1333 - 1] = (var249.method268() - var249.method267() + 1) * 64;
                    field1332[++Statics.field1333 - 1] = (var249.method315() - var249.method269() + 1) * 64;
                }
                var236 = 1;
            } else if (arg0 == 6613) {
                int var250 = field1332[--Statics.field1333];
                class33 var251 = client.method166().method4915(var250);
                if (var251 == null) {
                    field1332[++Statics.field1333 - 1] = 0;
                    field1332[++Statics.field1333 - 1] = 0;
                    field1332[++Statics.field1333 - 1] = 0;
                    field1332[++Statics.field1333 - 1] = 0;
                } else {
                    field1332[++Statics.field1333 - 1] = var251.method267() * 64;
                    field1332[++Statics.field1333 - 1] = var251.method269() * 64;
                    field1332[++Statics.field1333 - 1] = var251.method268() * 64 + 64 - 1;
                    field1332[++Statics.field1333 - 1] = var251.method315() * 64 + 64 - 1;
                }
                var236 = 1;
            } else if (arg0 == 6614) {
                int var252 = field1332[--Statics.field1333];
                class33 var253 = client.method166().method4915(var252);
                if (var253 == null) {
                    field1332[++Statics.field1333 - 1] = -1;
                } else {
                    field1332[++Statics.field1333 - 1] = var253.method266();
                }
                var236 = 1;
            } else if (arg0 == 6615) {
                class214 var254 = client.method166().method4920();
                if (var254 == null) {
                    field1332[++Statics.field1333 - 1] = -1;
                    field1332[++Statics.field1333 - 1] = -1;
                } else {
                    field1332[++Statics.field1333 - 1] = var254.field2588;
                    field1332[++Statics.field1333 - 1] = var254.field2591;
                }
                var236 = 1;
            } else if (arg0 == 6616) {
                field1332[++Statics.field1333 - 1] = client.method166().method4899();
                var236 = 1;
            } else if (arg0 == 6617) {
                class214 var255 = new class214(field1332[--Statics.field1333]);
                class33 var256 = client.method166().method4902();
                if (var256 == null) {
                    field1332[++Statics.field1333 - 1] = -1;
                    field1332[++Statics.field1333 - 1] = -1;
                    var236 = 1;
                } else {
                    int[] var257 = var256.method258(var255.field2589, var255.field2588, var255.field2591);
                    if (var257 == null) {
                        field1332[++Statics.field1333 - 1] = -1;
                        field1332[++Statics.field1333 - 1] = -1;
                    } else {
                        field1332[++Statics.field1333 - 1] = var257[0];
                        field1332[++Statics.field1333 - 1] = var257[1];
                    }
                    var236 = 1;
                }
            } else if (arg0 == 6618) {
                class214 var258 = new class214(field1332[--Statics.field1333]);
                class33 var259 = client.method166().method4902();
                if (var259 == null) {
                    field1332[++Statics.field1333 - 1] = -1;
                    field1332[++Statics.field1333 - 1] = -1;
                    var236 = 1;
                } else {
                    class214 var260 = var259.method259(var258.field2588, var258.field2591);
                    if (var260 == null) {
                        field1332[++Statics.field1333 - 1] = -1;
                    } else {
                        field1332[++Statics.field1333 - 1] = var260.method3653();
                    }
                    var236 = 1;
                }
            } else if (arg0 == 6619) {
                Statics.field1333 -= 2;
                int var261 = field1332[Statics.field1333];
                class214 var262 = new class214(field1332[Statics.field1333 + 1]);
                method208(var261, var262, false);
                var236 = 1;
            } else if (arg0 == 6620) {
                Statics.field1333 -= 2;
                int var263 = field1332[Statics.field1333];
                class214 var264 = new class214(field1332[Statics.field1333 + 1]);
                method208(var263, var264, true);
                var236 = 1;
            } else if (arg0 == 6621) {
                Statics.field1333 -= 2;
                int var265 = field1332[Statics.field1333];
                class214 var266 = new class214(field1332[Statics.field1333 + 1]);
                class33 var267 = client.method166().method4915(var265);
                if (var267 == null) {
                    field1332[++Statics.field1333 - 1] = 0;
                    var236 = 1;
                } else {
                    field1332[++Statics.field1333 - 1] = var267.method256(var266.field2589, var266.field2588, var266.field2591) ? 1 : 0;
                    var236 = 1;
                }
            } else if (arg0 == 6622) {
                field1332[++Statics.field1333 - 1] = client.method166().method4923();
                field1332[++Statics.field1333 - 1] = client.method166().method4924();
                var236 = 1;
            } else if (arg0 == 6623) {
                class214 var268 = new class214(field1332[--Statics.field1333]);
                class33 var269 = client.method166().method4898(var268.field2589, var268.field2588, var268.field2591);
                if (var269 == null) {
                    field1332[++Statics.field1333 - 1] = -1;
                } else {
                    field1332[++Statics.field1333 - 1] = var269.method318();
                }
                var236 = 1;
            } else if (arg0 == 6624) {
                client.method166().method4925(field1332[--Statics.field1333]);
                var236 = 1;
            } else if (arg0 == 6625) {
                client.method166().method4926();
                var236 = 1;
            } else if (arg0 == 6626) {
                client.method166().method4927(field1332[--Statics.field1333]);
                var236 = 1;
            } else if (arg0 == 6627) {
                client.method166().method4928();
                var236 = 1;
            } else if (arg0 == 6628) {
                boolean var270 = field1332[--Statics.field1333] == 1;
                client.method166().method4929(var270);
                var236 = 1;
            } else if (arg0 == 6629) {
                int var271 = field1332[--Statics.field1333];
                client.method166().method4930(var271);
                var236 = 1;
            } else if (arg0 == 6630) {
                int var272 = field1332[--Statics.field1333];
                client.method166().method4931(var272);
                var236 = 1;
            } else if (arg0 == 6631) {
                client.method166().method4932();
                var236 = 1;
            } else if (arg0 == 6632) {
                boolean var273 = field1332[--Statics.field1333] == 1;
                client.method166().method4933(var273);
                var236 = 1;
            } else if (arg0 == 6633) {
                Statics.field1333 -= 2;
                int var274 = field1332[Statics.field1333];
                boolean var275 = field1332[Statics.field1333 + 1] == 1;
                client.method166().method4890(var274, var275);
                var236 = 1;
            } else if (arg0 == 6634) {
                Statics.field1333 -= 2;
                int var276 = field1332[Statics.field1333];
                boolean var277 = field1332[Statics.field1333 + 1] == 1;
                client.method166().method4935(var276, var277);
                var236 = 1;
            } else if (arg0 == 6635) {
                field1332[++Statics.field1333 - 1] = client.method166().method5044() ? 1 : 0;
                var236 = 1;
            } else if (arg0 == 6636) {
                int var278 = field1332[--Statics.field1333];
                field1332[++Statics.field1333 - 1] = client.method166().method4937(var278) ? 1 : 0;
                var236 = 1;
            } else if (arg0 == 6637) {
                int var279 = field1332[--Statics.field1333];
                field1332[++Statics.field1333 - 1] = client.method166().method5042(var279) ? 1 : 0;
                var236 = 1;
            } else if (arg0 == 6638) {
                Statics.field1333 -= 2;
                int var280 = field1332[Statics.field1333];
                class214 var281 = new class214(field1332[Statics.field1333 + 1]);
                class214 var282 = client.method166().method4949(var280, var281);
                if (var282 == null) {
                    field1332[++Statics.field1333 - 1] = -1;
                } else {
                    field1332[++Statics.field1333 - 1] = var282.method3653();
                }
                var236 = 1;
            } else if (arg0 == 6639) {
                class40 var283 = client.method166().method5037();
                if (var283 == null) {
                    field1332[++Statics.field1333 - 1] = -1;
                    field1332[++Statics.field1333 - 1] = -1;
                } else {
                    field1332[++Statics.field1333 - 1] = var283.field535;
                    field1332[++Statics.field1333 - 1] = var283.field531.method3653();
                }
                var236 = 1;
            } else if (arg0 == 6640) {
                class40 var284 = client.method166().method4936();
                if (var284 == null) {
                    field1332[++Statics.field1333 - 1] = -1;
                    field1332[++Statics.field1333 - 1] = -1;
                } else {
                    field1332[++Statics.field1333 - 1] = var284.field535;
                    field1332[++Statics.field1333 - 1] = var284.field531.method3653();
                }
                var236 = 1;
            } else if (arg0 == 6693) {
                int var285 = field1332[--Statics.field1333];
                class244 var286 = Statics.field3277[var285];
                if (var286.field3283 == null) {
                    field1334[++Statics.field1328 - 1] = "";
                } else {
                    field1334[++Statics.field1328 - 1] = var286.field3283;
                }
                var236 = 1;
            } else if (arg0 == 6694) {
                int var287 = field1332[--Statics.field1333];
                class244 var288 = Statics.field3277[var287];
                field1332[++Statics.field1333 - 1] = var288.field3285;
                var236 = 1;
            } else if (arg0 == 6695) {
                int var289 = field1332[--Statics.field1333];
                class244 var290 = Statics.field3277[var289];
                if (var290 == null) {
                    field1332[++Statics.field1333 - 1] = -1;
                } else {
                    field1332[++Statics.field1333 - 1] = var290.field3297;
                }
                var236 = 1;
            } else if (arg0 == 6696) {
                int var291 = field1332[--Statics.field1333];
                class244 var292 = Statics.field3277[var291];
                if (var292 == null) {
                    field1332[++Statics.field1333 - 1] = -1;
                } else {
                    field1332[++Statics.field1333 - 1] = var292.field3281;
                }
                var236 = 1;
            } else if (arg0 == 6697) {
                field1332[++Statics.field1333 - 1] = Statics.field542.field601;
                var236 = 1;
            } else if (arg0 == 6698) {
                field1332[++Statics.field1333 - 1] = Statics.field542.field598.method3653();
                var236 = 1;
            } else if (arg0 == 6699) {
                field1332[++Statics.field1333 - 1] = Statics.field542.field599.method3653();
                var236 = 1;
            } else {
                var236 = 2;
            }
            return var236;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("et.y(ILcc;ZI)I")
    public static int method2721(int arg0, class101 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1333 -= 3;
            int var3 = field1332[Statics.field1333];
            int var4 = field1332[Statics.field1333 + 1];
            int var5 = field1332[Statics.field1333 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class218 var6 = class218.method4538(var3);
            if (var6.field2615 == null) {
                var6.field2615 = new class218[var5 + 1];
            }
            if (var6.field2615.length <= var5) {
                class218[] var7 = new class218[var5 + 1];
                for (int var8 = 0; var8 < var6.field2615.length; var8++) {
                    var7[var8] = var6.field2615[var8];
                }
                var6.field2615 = var7;
            }
            if (var5 > 0 && var6.field2615[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class218 var9 = new class218();
            var9.field2757 = var4;
            var9.field2643 = var9.field2624 = var6.field2624;
            var9.field2726 = var5;
            var9.field2623 = true;
            var6.field2615[var5] = var9;
            if (arg2) {
                Statics.field3662 = var9;
            } else {
                Statics.field2165 = var9;
            }
            client.method4218(var6);
            return 1;
        } else if (arg0 == 101) {
            class218 var10 = arg2 ? Statics.field3662 : Statics.field2165;
            class218 var11 = class218.method4538(var10.field2624);
            var11.field2615[var10.field2726] = null;
            client.method4218(var11);
            return 1;
        } else if (arg0 == 102) {
            class218 var12 = class218.method4538(field1332[--Statics.field1333]);
            var12.field2615 = null;
            client.method4218(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1333 -= 2;
            int var13 = field1332[Statics.field1333];
            int var14 = field1332[Statics.field1333 + 1];
            class218 var15 = Statics.method177(var13, var14);
            if (var15 == null || var14 == -1) {
                field1332[++Statics.field1333 - 1] = 0;
            } else {
                field1332[++Statics.field1333 - 1] = 1;
                if (arg2) {
                    Statics.field3662 = var15;
                } else {
                    Statics.field2165 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class218 var16 = class218.method4538(field1332[--Statics.field1333]);
            if (var16 == null) {
                field1332[++Statics.field1333 - 1] = 0;
            } else {
                field1332[++Statics.field1333 - 1] = 1;
                if (arg2) {
                    Statics.field3662 = var16;
                } else {
                    Statics.field2165 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bm.w(ILcc;ZB)I")
    public static int method998(int arg0, class101 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1332[--Statics.field1333];
            var4 = class218.method4538(var3);
        } else {
            var4 = arg2 ? Statics.field3662 : Statics.field2165;
        }
        if (arg0 == 1000) {
            Statics.field1333 -= 4;
            var4.field2633 = field1332[Statics.field1333];
            var4.field2666 = field1332[Statics.field1333 + 1];
            var4.field2716 = field1332[Statics.field1333 + 2];
            var4.field2630 = field1332[Statics.field1333 + 3];
            client.method4218(var4);
            Statics.field32.method1099(var4);
            if (var3 != -1 && var4.field2757 == 0) {
                client.method1078(Statics.field1482[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1333 -= 4;
            var4.field2635 = field1332[Statics.field1333];
            var4.field2636 = field1332[Statics.field1333 + 1];
            var4.field2628 = field1332[Statics.field1333 + 2];
            var4.field2652 = field1332[Statics.field1333 + 3];
            client.method4218(var4);
            Statics.field32.method1099(var4);
            if (var3 != -1 && var4.field2757 == 0) {
                client.method1078(Statics.field1482[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1332[--Statics.field1333] == 1;
            if (var4.field2644 != var5) {
                var4.field2644 = var5;
                client.method4218(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2703 = field1332[--Statics.field1333] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2686 = field1332[--Statics.field1333] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eq.k(ILcc;ZI)I")
    public static int method2700(int arg0, class101 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1332[--Statics.field1333];
            var4 = class218.method4538(var3);
        } else {
            var4 = arg2 ? Statics.field3662 : Statics.field2165;
        }
        if (arg0 == 1100) {
            Statics.field1333 -= 2;
            var4.field2674 = field1332[Statics.field1333];
            if (var4.field2674 > var4.field2647 - var4.field2639) {
                var4.field2674 = var4.field2647 - var4.field2639;
            }
            if (var4.field2674 < 0) {
                var4.field2674 = 0;
            }
            var4.field2646 = field1332[Statics.field1333 + 1];
            if (var4.field2646 > var4.field2750 - var4.field2640) {
                var4.field2646 = var4.field2750 - var4.field2640;
            }
            if (var4.field2646 < 0) {
                var4.field2646 = 0;
            }
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2649 = field1332[--Statics.field1333];
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2656 = field1332[--Statics.field1333] == 1;
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2655 = field1332[--Statics.field1333];
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2688 = field1332[--Statics.field1333];
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2659 = field1332[--Statics.field1333];
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2629 = field1332[--Statics.field1333];
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2662 = field1332[--Statics.field1333] == 1;
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2667 = 1;
            var4.field2683 = field1332[--Statics.field1333];
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1333 -= 6;
            var4.field2664 = field1332[Statics.field1333];
            var4.field2622 = field1332[Statics.field1333 + 1];
            var4.field2675 = field1332[Statics.field1333 + 2];
            var4.field2705 = field1332[Statics.field1333 + 3];
            var4.field2677 = field1332[Statics.field1333 + 4];
            var4.field2631 = field1332[Statics.field1333 + 5];
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1332[--Statics.field1333];
            if (var4.field2634 != var5) {
                var4.field2634 = var5;
                var4.field2746 = 0;
                var4.field2747 = 0;
                client.method4218(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2681 = field1332[--Statics.field1333] == 1;
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1334[--Statics.field1328];
            if (!var6.equals(var4.field2684)) {
                var4.field2684 = var6;
                client.method4218(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2673 = field1332[--Statics.field1333];
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1333 -= 3;
            var4.field2744 = field1332[Statics.field1333];
            var4.field2758 = field1332[Statics.field1333 + 1];
            var4.field2752 = field1332[Statics.field1333 + 2];
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2689 = field1332[--Statics.field1333] == 1;
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2663 = field1332[--Statics.field1333];
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2756 = field1332[--Statics.field1333];
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2665 = field1332[--Statics.field1333] == 1;
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2625 = field1332[--Statics.field1333] == 1;
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1333 -= 2;
            var4.field2647 = field1332[Statics.field1333];
            var4.field2750 = field1332[Statics.field1333 + 1];
            client.method4218(var4);
            if (var3 != -1 && var4.field2757 == 0) {
                client.method1078(Statics.field1482[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method3(var4.field2624, var4.field2726);
            client.field1067 = var4;
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2660 = field1332[--Statics.field1333];
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2650 = field1332[--Statics.field1333];
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2645 = field1332[--Statics.field1333];
            client.method4218(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1332[--Statics.field1333];
            class285 var8 = (class285) class170.method2298(class285.method3433(), var7);
            if (var8 != null) {
                var4.field2654 = var8;
                client.method4218(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1332[--Statics.field1333] == 1;
            var4.field2658 = var9;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("i.v(ILcc;ZI)I")
    public static int method168(int arg0, class101 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method4538(field1332[--Statics.field1333]);
        } else {
            var3 = arg2 ? Statics.field3662 : Statics.field2165;
        }
        client.method4218(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1333 -= 2;
            int var4 = field1332[Statics.field1333];
            int var5 = field1332[Statics.field1333 + 1];
            var3.field2612 = var4;
            var3.field2745 = var5;
            class258 var6 = class258.method4627(var4);
            var3.field2675 = var6.field3494;
            var3.field2705 = var6.field3532;
            var3.field2677 = var6.field3516;
            var3.field2664 = var6.field3496;
            var3.field2622 = var6.field3501;
            var3.field2631 = var6.field3492;
            if (arg0 == 1205) {
                var3.field2682 = 0;
            } else if (arg0 == 1212 | var6.field3485 == 1) {
                var3.field2682 = 1;
            } else {
                var3.field2682 = 2;
            }
            if (var3.field2679 > 0) {
                var3.field2631 = var3.field2631 * 32 / var3.field2679;
            } else if (var3.field2635 > 0) {
                var3.field2631 = var3.field2631 * 32 / var3.field2635;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2667 = 2;
            var3.field2683 = field1332[--Statics.field1333];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2667 = 3;
            var3.field2683 = Statics.field655.field881.method3677();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("d.z(ILcc;ZI)I")
    public static int method47(int arg0, class101 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method4538(field1332[--Statics.field1333]);
        } else {
            var3 = arg2 ? Statics.field3662 : Statics.field2165;
        }
        if (arg0 == 1300) {
            int var4 = field1332[--Statics.field1333] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3727(var4, field1334[--Statics.field1328]);
                return 1;
            } else {
                Statics.field1328--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1333 -= 2;
            int var5 = field1332[Statics.field1333];
            int var6 = field1332[Statics.field1333 + 1];
            var3.field2699 = Statics.method177(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2702 = field1332[--Statics.field1333] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2700 = field1332[--Statics.field1333];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2701 = field1332[--Statics.field1333];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2697 = field1334[--Statics.field1328];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2725 = field1334[--Statics.field1328];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2698 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("al.r(ILcc;ZB)I")
    public static int method251(int arg0, class101 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method4538(field1332[--Statics.field1333]);
        } else {
            var3 = arg2 ? Statics.field3662 : Statics.field2165;
        }
        String var4 = field1334[--Statics.field1328];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1332[--Statics.field1333];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1332[--Statics.field1333];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1334[--Statics.field1328];
            } else {
                var7[var8] = Integer.valueOf(field1332[--Statics.field1333]);
            }
        }
        int var9 = field1332[--Statics.field1333];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2706 = var7;
        } else if (arg0 == 1401) {
            var3.field2712 = var7;
        } else if (arg0 == 1402) {
            var3.field2708 = var7;
        } else if (arg0 == 1403) {
            var3.field2748 = var7;
        } else if (arg0 == 1404) {
            var3.field2678 = var7;
        } else if (arg0 == 1405) {
            var3.field2713 = var7;
        } else if (arg0 == 1406) {
            var3.field2736 = var7;
        } else if (arg0 == 1407) {
            var3.field2668 = var7;
            var3.field2718 = var5;
        } else if (arg0 == 1408) {
            var3.field2661 = var7;
        } else if (arg0 == 1409) {
            var3.field2724 = var7;
        } else if (arg0 == 1410) {
            var3.field2626 = var7;
        } else if (arg0 == 1411) {
            var3.field2707 = var7;
        } else if (arg0 == 1412) {
            var3.field2711 = var7;
        } else if (arg0 == 1414) {
            var3.field2730 = var7;
            var3.field2720 = var5;
        } else if (arg0 == 1415) {
            var3.field2721 = var7;
            var3.field2722 = var5;
        } else if (arg0 == 1416) {
            var3.field2715 = var7;
        } else if (arg0 == 1417) {
            var3.field2619 = var7;
        } else if (arg0 == 1418) {
            var3.field2751 = var7;
        } else if (arg0 == 1419) {
            var3.field2727 = var7;
        } else if (arg0 == 1420) {
            var3.field2743 = var7;
        } else if (arg0 == 1421) {
            var3.field2729 = var7;
        } else if (arg0 == 1422) {
            var3.field2676 = var7;
        } else if (arg0 == 1423) {
            var3.field2731 = var7;
        } else if (arg0 == 1424) {
            var3.field2732 = var7;
        } else if (arg0 == 1425) {
            var3.field2734 = var7;
        } else if (arg0 == 1426) {
            var3.field2717 = var7;
        } else if (arg0 == 1427) {
            var3.field2733 = var7;
        } else {
            return 2;
        }
        var3.field2740 = true;
        return 1;
    }

    @ObfuscatedName("k.u(ILcc;ZB)I")
    public static int method16(int arg0, class101 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field3662 : Statics.field2165;
        if (arg0 == 1500) {
            field1332[++Statics.field1333 - 1] = var3.field2637;
            return 1;
        } else if (arg0 == 1501) {
            field1332[++Statics.field1333 - 1] = var3.field2638;
            return 1;
        } else if (arg0 == 1502) {
            field1332[++Statics.field1333 - 1] = var3.field2639;
            return 1;
        } else if (arg0 == 1503) {
            field1332[++Statics.field1333 - 1] = var3.field2640;
            return 1;
        } else if (arg0 == 1504) {
            field1332[++Statics.field1333 - 1] = var3.field2644 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1332[++Statics.field1333 - 1] = var3.field2643;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bs.d(ILcc;ZB)I")
    public static int method1032(int arg0, class101 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field3662 : Statics.field2165;
        if (arg0 == 1600) {
            field1332[++Statics.field1333 - 1] = var3.field2674;
            return 1;
        } else if (arg0 == 1601) {
            field1332[++Statics.field1333 - 1] = var3.field2646;
            return 1;
        } else if (arg0 == 1602) {
            field1334[++Statics.field1328 - 1] = var3.field2684;
            return 1;
        } else if (arg0 == 1603) {
            field1332[++Statics.field1333 - 1] = var3.field2647;
            return 1;
        } else if (arg0 == 1604) {
            field1332[++Statics.field1333 - 1] = var3.field2750;
            return 1;
        } else if (arg0 == 1605) {
            field1332[++Statics.field1333 - 1] = var3.field2631;
            return 1;
        } else if (arg0 == 1606) {
            field1332[++Statics.field1333 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 1607) {
            field1332[++Statics.field1333 - 1] = var3.field2677;
            return 1;
        } else if (arg0 == 1608) {
            field1332[++Statics.field1333 - 1] = var3.field2705;
            return 1;
        } else if (arg0 == 1609) {
            field1332[++Statics.field1333 - 1] = var3.field2655;
            return 1;
        } else if (arg0 == 1610) {
            field1332[++Statics.field1333 - 1] = var3.field2645;
            return 1;
        } else if (arg0 == 1611) {
            field1332[++Statics.field1333 - 1] = var3.field2649;
            return 1;
        } else if (arg0 == 1612) {
            field1332[++Statics.field1333 - 1] = var3.field2650;
            return 1;
        } else if (arg0 == 1613) {
            field1332[++Statics.field1333 - 1] = var3.field2654.method6();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cm.o(ILcc;ZI)I")
    public static int method1491(int arg0, class101 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field3662 : Statics.field2165;
        if (arg0 == 1800) {
            int[] var4 = field1332;
            int var5 = ++Statics.field1333 - 1;
            int var6 = client.method76(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 1801) {
            int var8 = field1332[--Statics.field1333];
            int var9 = var8 - 1;
            if (var3.field2698 == null || var9 >= var3.field2698.length || var3.field2698[var9] == null) {
                field1334[++Statics.field1328 - 1] = "";
            } else {
                field1334[++Statics.field1328 - 1] = var3.field2698[var9];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2697 == null) {
                field1334[++Statics.field1328 - 1] = "";
            } else {
                field1334[++Statics.field1328 - 1] = var3.field2697;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bo.s(ILcc;ZI)I")
    public static int method694(int arg0, class101 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method4538(field1332[--Statics.field1333]);
        } else {
            var3 = arg2 ? Statics.field3662 : Statics.field2165;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1340 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2733 == null) {
            return 0;
        } else {
            class71 var4 = new class71();
            var4.field837 = var3;
            var4.field850 = var3.field2733;
            var4.field849 = field1340 + 1;
            client.field1102.method3379(var4);
            return 1;
        }
    }

    @ObfuscatedName("bh.c(ILcc;ZB)I")
    public static int method1046(int arg0, class101 arg1, boolean arg2) {
        class218 var3 = class218.method4538(field1332[--Statics.field1333]);
        if (arg0 == 2500) {
            field1332[++Statics.field1333 - 1] = var3.field2637;
            return 1;
        } else if (arg0 == 2501) {
            field1332[++Statics.field1333 - 1] = var3.field2638;
            return 1;
        } else if (arg0 == 2502) {
            field1332[++Statics.field1333 - 1] = var3.field2639;
            return 1;
        } else if (arg0 == 2503) {
            field1332[++Statics.field1333 - 1] = var3.field2640;
            return 1;
        } else if (arg0 == 2504) {
            field1332[++Statics.field1333 - 1] = var3.field2644 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1332[++Statics.field1333 - 1] = var3.field2643;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ab.m(ILcc;ZI)I")
    public static int method580(int arg0, class101 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class218 var3 = class218.method4538(field1332[--Statics.field1333]);
            field1332[++Statics.field1333 - 1] = var3.field2612;
            return 1;
        } else if (arg0 == 2701) {
            class218 var4 = class218.method4538(field1332[--Statics.field1333]);
            if (var4.field2612 == -1) {
                field1332[++Statics.field1333 - 1] = 0;
            } else {
                field1332[++Statics.field1333 - 1] = var4.field2745;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1332[--Statics.field1333];
            class69 var6 = (class69) client.field1180.method3294((long) var5);
            if (var6 == null) {
                field1332[++Statics.field1333 - 1] = 0;
            } else {
                field1332[++Statics.field1333 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1332[++Statics.field1333 - 1] = client.field1029;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cq.a(ILcc;ZB)I")
    public static int method1475(int arg0, class101 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1332[++Statics.field1333 - 1] = client.field925;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1333 -= 2;
            int var3 = field1332[Statics.field1333];
            int var4 = field1332[Statics.field1333 + 1];
            int[] var5 = field1332;
            int var6 = ++Statics.field1333 - 1;
            class64 var7 = (class64) class64.field775.method3294((long) var3);
            int var8;
            if (var7 == null) {
                var8 = -1;
            } else if (var4 >= 0 && var4 < var7.field772.length) {
                var8 = var7.field772[var4];
            } else {
                var8 = -1;
            }
            var5[var6] = var8;
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1333 -= 2;
            int var9 = field1332[Statics.field1333];
            int var10 = field1332[Statics.field1333 + 1];
            field1332[++Statics.field1333 - 1] = class64.method2509(var9, var10);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1333 -= 2;
            int var11 = field1332[Statics.field1333];
            int var12 = field1332[Statics.field1333 + 1];
            int[] var13 = field1332;
            int var14 = ++Statics.field1333 - 1;
            class64 var15 = (class64) class64.field775.method3294((long) var11);
            int var16;
            if (var15 == null) {
                var16 = 0;
            } else if (var12 == -1) {
                var16 = 0;
            } else {
                int var17 = 0;
                for (int var18 = 0; var18 < var15.field773.length; var18++) {
                    if (var15.field772[var18] == var12) {
                        var17 += var15.field773[var18];
                    }
                }
                var16 = var17;
            }
            var13[var14] = var16;
            return 1;
        } else if (arg0 == 3304) {
            int var19 = field1332[--Statics.field1333];
            int[] var20 = field1332;
            int var21 = ++Statics.field1333 - 1;
            class242 var22 = (class242) class242.field3265.method3288((long) var19);
            class242 var23;
            if (var22 == null) {
                byte[] var24 = Statics.field3266.method3817(5, var19);
                class242 var25 = new class242();
                if (var24 != null) {
                    var25.method3952(new class175(var24));
                }
                class242.field3265.method3278(var25, (long) var19);
                var23 = var25;
            } else {
                var23 = var22;
            }
            var20[var21] = var23.field3264;
            return 1;
        } else if (arg0 == 3305) {
            int var26 = field1332[--Statics.field1333];
            field1332[++Statics.field1333 - 1] = client.field1037[var26];
            return 1;
        } else if (arg0 == 3306) {
            int var27 = field1332[--Statics.field1333];
            field1332[++Statics.field1333 - 1] = client.field1038[var27];
            return 1;
        } else if (arg0 == 3307) {
            int var28 = field1332[--Statics.field1333];
            field1332[++Statics.field1333 - 1] = client.field1039[var28];
            return 1;
        } else if (arg0 == 3308) {
            int var29 = Statics.field424;
            int var30 = (Statics.field655.field1221 >> 7) + Statics.field376;
            int var31 = (Statics.field655.field1207 >> 7) + Statics.field847;
            field1332[++Statics.field1333 - 1] = (var29 << 28) + (var30 << 14) + var31;
            return 1;
        } else if (arg0 == 3309) {
            int var32 = field1332[--Statics.field1333];
            field1332[++Statics.field1333 - 1] = var32 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var33 = field1332[--Statics.field1333];
            field1332[++Statics.field1333 - 1] = var33 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var34 = field1332[--Statics.field1333];
            field1332[++Statics.field1333 - 1] = var34 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1332[++Statics.field1333 - 1] = client.field920 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1333 -= 2;
            int var35 = field1332[Statics.field1333] + 32768;
            int var36 = field1332[Statics.field1333 + 1];
            int[] var37 = field1332;
            int var38 = ++Statics.field1333 - 1;
            class64 var39 = (class64) class64.field775.method3294((long) var35);
            int var40;
            if (var39 == null) {
                var40 = -1;
            } else if (var36 >= 0 && var36 < var39.field772.length) {
                var40 = var39.field772[var36];
            } else {
                var40 = -1;
            }
            var37[var38] = var40;
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1333 -= 2;
            int var41 = field1332[Statics.field1333] + 32768;
            int var42 = field1332[Statics.field1333 + 1];
            field1332[++Statics.field1333 - 1] = class64.method2509(var41, var42);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1333 -= 2;
            int var43 = field1332[Statics.field1333] + 32768;
            int var44 = field1332[Statics.field1333 + 1];
            int[] var45 = field1332;
            int var46 = ++Statics.field1333 - 1;
            class64 var47 = (class64) class64.field775.method3294((long) var43);
            int var48;
            if (var47 == null) {
                var48 = 0;
            } else if (var44 == -1) {
                var48 = 0;
            } else {
                int var49 = 0;
                for (int var50 = 0; var50 < var47.field773.length; var50++) {
                    if (var47.field772[var50] == var44) {
                        var49 += var47.field773[var50];
                    }
                }
                var48 = var49;
            }
            var45[var46] = var48;
            return 1;
        } else if (arg0 == 3316) {
            if (client.field1070 >= 2) {
                field1332[++Statics.field1333 - 1] = client.field1070;
            } else {
                field1332[++Statics.field1333 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1332[++Statics.field1333 - 1] = client.field932;
            return 1;
        } else if (arg0 == 3318) {
            field1332[++Statics.field1333 - 1] = client.field917;
            return 1;
        } else if (arg0 == 3321) {
            field1332[++Statics.field1333 - 1] = client.field1068;
            return 1;
        } else if (arg0 == 3322) {
            field1332[++Statics.field1333 - 1] = client.field1069;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field1072) {
                field1332[++Statics.field1333 - 1] = 1;
            } else {
                field1332[++Statics.field1333 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1332[++Statics.field1333 - 1] = client.field918;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1333 -= 4;
            int var51 = field1332[Statics.field1333];
            int var52 = field1332[Statics.field1333 + 1];
            int var53 = field1332[Statics.field1333 + 2];
            int var54 = field1332[Statics.field1333 + 3];
            int var55 = (var52 << 14) + var51;
            int var56 = (var53 << 28) + var55;
            int var57 = var54 + var56;
            field1332[++Statics.field1333 - 1] = var57;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cm.t(ILcc;ZI)I")
    public static int method1499(int arg0, class101 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1333 -= 2;
            int var3 = field1332[Statics.field1333];
            int var4 = field1332[Statics.field1333 + 1];
            class255 var5 = (class255) class255.field3393.method3288((long) var3);
            class255 var6;
            if (var5 == null) {
                byte[] var7 = Statics.field3394.method3817(8, var3);
                class255 var8 = new class255();
                if (var7 != null) {
                    var8.method4173(new class175(var7));
                }
                class255.field3393.method3278(var8, (long) var3);
                var6 = var8;
            } else {
                var6 = var5;
            }
            class255 var9 = var6;
            if (var6.field3395 != 's') {
            }
            for (int var10 = 0; var10 < var9.field3397; var10++) {
                if (var9.field3396[var10] == var4) {
                    field1334[++Statics.field1328 - 1] = var9.field3401[var10];
                    var9 = null;
                    break;
                }
            }
            if (var9 != null) {
                field1334[++Statics.field1328 - 1] = var9.field3398;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1333 -= 4;
            int var11 = field1332[Statics.field1333];
            int var12 = field1332[Statics.field1333 + 1];
            int var13 = field1332[Statics.field1333 + 2];
            int var14 = field1332[Statics.field1333 + 3];
            class255 var15 = (class255) class255.field3393.method3288((long) var13);
            class255 var16;
            if (var15 == null) {
                byte[] var17 = Statics.field3394.method3817(8, var13);
                class255 var18 = new class255();
                if (var17 != null) {
                    var18.method4173(new class175(var17));
                }
                class255.field3393.method3278(var18, (long) var13);
                var16 = var18;
            } else {
                var16 = var15;
            }
            class255 var19 = var16;
            if (var16.field3392 != var11 || var16.field3395 != var12) {
                if (var12 == 115) {
                    field1334[++Statics.field1328 - 1] = "null";
                } else {
                    field1332[++Statics.field1333 - 1] = 0;
                }
                return 1;
            }
            for (int var20 = 0; var20 < var19.field3397; var20++) {
                if (var19.field3396[var20] == var14) {
                    if (var12 == 115) {
                        field1334[++Statics.field1328 - 1] = var19.field3401[var20];
                    } else {
                        field1332[++Statics.field1333 - 1] = var19.field3400[var20];
                    }
                    var19 = null;
                    break;
                }
            }
            if (var19 != null) {
                if (var12 == 115) {
                    field1334[++Statics.field1328 - 1] = var19.field3398;
                } else {
                    field1332[++Statics.field1333 - 1] = var19.field3399;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dx.p(ILcc;ZB)I")
    public static int method2205(int arg0, class101 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1334[--Statics.field1328];
            int var4 = field1332[--Statics.field1333];
            field1334[++Statics.field1328 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1328 -= 2;
            String var5 = field1334[Statics.field1328];
            String var6 = field1334[Statics.field1328 + 1];
            field1334[++Statics.field1328 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1334[--Statics.field1328];
            int var8 = field1332[--Statics.field1333];
            String[] var9 = field1334;
            int var10 = ++Statics.field1328 - 1;
            String var12;
            if (var8 < 0) {
                var12 = Integer.toString(var8);
            } else {
                var12 = class272.method4070(var8, 10, true);
            }
            var9[var10] = var7 + var12;
            return 1;
        } else if (arg0 == 4103) {
            String var13 = field1334[--Statics.field1328];
            field1334[++Statics.field1328 - 1] = var13.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var14 = field1332[--Statics.field1333];
            long var15 = ((long) var14 + 11745L) * 86400000L;
            field1338.setTime(new Date(var15));
            int var17 = field1338.get(5);
            int var18 = field1338.get(2);
            int var19 = field1338.get(1);
            field1334[++Statics.field1328 - 1] = var17 + "-" + field1339[var18] + "-" + var19;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1328 -= 2;
            String var20 = field1334[Statics.field1328];
            String var21 = field1334[Statics.field1328 + 1];
            if (Statics.field655.field881 != null && Statics.field655.field881.field2596) {
                field1334[++Statics.field1328 - 1] = var21;
            } else {
                field1334[++Statics.field1328 - 1] = var20;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var22 = field1332[--Statics.field1333];
            field1334[++Statics.field1328 - 1] = Integer.toString(var22);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1328 -= 2;
            int[] var23 = field1332;
            int var24 = ++Statics.field1333 - 1;
            int var25 = class166.method2172(field1334[Statics.field1328], field1334[Statics.field1328 + 1], client.field1014);
            byte var26;
            if (var25 > 0) {
                var26 = 1;
            } else if (var25 < 0) {
                var26 = -1;
            } else {
                var26 = 0;
            }
            var23[var24] = var26;
            return 1;
        } else if (arg0 == 4108) {
            String var27 = field1334[--Statics.field1328];
            Statics.field1333 -= 2;
            int var28 = field1332[Statics.field1333];
            int var29 = field1332[Statics.field1333 + 1];
            byte[] var30 = Statics.field825.method3817(var29, 0);
            class265 var31 = new class265(var30);
            field1332[++Statics.field1333 - 1] = var31.method4457(var27, var28);
            return 1;
        } else if (arg0 == 4109) {
            String var32 = field1334[--Statics.field1328];
            Statics.field1333 -= 2;
            int var33 = field1332[Statics.field1333];
            int var34 = field1332[Statics.field1333 + 1];
            byte[] var35 = Statics.field825.method3817(var34, 0);
            class265 var36 = new class265(var35);
            field1332[++Statics.field1333 - 1] = var36.method4456(var32, var33);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1328 -= 2;
            String var37 = field1334[Statics.field1328];
            String var38 = field1334[Statics.field1328 + 1];
            if (field1332[--Statics.field1333] == 1) {
                field1334[++Statics.field1328 - 1] = var37;
            } else {
                field1334[++Statics.field1328 - 1] = var38;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var39 = field1334[--Statics.field1328];
            field1334[++Statics.field1328 - 1] = class266.method4458(var39);
            return 1;
        } else if (arg0 == 4112) {
            String var40 = field1334[--Statics.field1328];
            int var41 = field1332[--Statics.field1333];
            field1334[++Statics.field1328 - 1] = var40 + (char) var41;
            return 1;
        } else if (arg0 == 4113) {
            int var42 = field1332[--Statics.field1333];
            field1332[++Statics.field1333 - 1] = class272.method979((char) var42) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var43 = field1332[--Statics.field1333];
            field1332[++Statics.field1333 - 1] = class272.method1692((char) var43) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var44 = field1332[--Statics.field1333];
            field1332[++Statics.field1333 - 1] = class272.method3959((char) var44) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var45 = field1332[--Statics.field1333];
            int[] var46 = field1332;
            int var47 = ++Statics.field1333 - 1;
            char var48 = (char) var45;
            boolean var49 = var48 >= '0' && var48 <= '9';
            var46[var47] = var49 ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var50 = field1334[--Statics.field1328];
            if (var50 == null) {
                field1332[++Statics.field1333 - 1] = 0;
            } else {
                field1332[++Statics.field1333 - 1] = var50.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var51 = field1334[--Statics.field1328];
            Statics.field1333 -= 2;
            int var52 = field1332[Statics.field1333];
            int var53 = field1332[Statics.field1333 + 1];
            field1334[++Statics.field1328 - 1] = var51.substring(var52, var53);
            return 1;
        } else if (arg0 == 4119) {
            String var54 = field1334[--Statics.field1328];
            StringBuilder var55 = new StringBuilder(var54.length());
            boolean var56 = false;
            for (int var57 = 0; var57 < var54.length(); var57++) {
                char var58 = var54.charAt(var57);
                if (var58 == '<') {
                    var56 = true;
                } else if (var58 == '>') {
                    var56 = false;
                } else if (!var56) {
                    var55.append(var58);
                }
            }
            field1334[++Statics.field1328 - 1] = var55.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var59 = field1334[--Statics.field1328];
            int var60 = field1332[--Statics.field1333];
            field1332[++Statics.field1333 - 1] = var59.indexOf(var60);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1328 -= 2;
            String var61 = field1334[Statics.field1328];
            String var62 = field1334[Statics.field1328 + 1];
            int var63 = field1332[--Statics.field1333];
            field1332[++Statics.field1333 - 1] = var61.indexOf(var62, var63);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.x(ILcc;ZB)I")
    public static int method151(int arg0, class101 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1332[++Statics.field1333 - 1] = client.method2313();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1332[--Statics.field1333];
            if (var3 == 1 || var3 == 2) {
                client.field1116 = 0L;
                if (var3 >= 2) {
                    client.field1117 = true;
                } else {
                    client.field1117 = false;
                }
                if (client.method2313() == 1) {
                    Statics.field32.method745(765, 503);
                } else {
                    Statics.field32.method745(7680, 2160);
                }
                if (client.field923 >= 25) {
                    client.method107();
                }
            }
            return 1;
        } else if (arg0 == 5308) {
            field1332[++Statics.field1333 - 1] = Statics.field2198.field1297;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1332[--Statics.field1333];
            if (var4 == 1 || var4 == 2) {
                Statics.field2198.field1297 = var4;
                class82.method1649();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("id.q(II)V")
    public static void method3932(int arg0) {
        if (arg0 == -1 || !class218.method48(arg0)) {
            return;
        }
        class218[] var1 = Statics.field1482[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3.field2648 != null) {
                class71 var4 = new class71();
                var4.field837 = var3;
                var4.field850 = var3.field2648;
                method38(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("ag.ag(ILhq;ZB)V")
    public static void method208(int arg0, class214 arg1, boolean arg2) {
        class33 var3 = client.method166().method4915(arg0);
        int var4 = Statics.field655.field901;
        int var5 = (Statics.field655.field1221 >> 7) + Statics.field376;
        int var6 = (Statics.field655.field1207 >> 7) + Statics.field847;
        class214 var7 = new class214(var4, var5, var6);
        client.method166().method4905(var3, var7, arg1, arg2);
    }
}
