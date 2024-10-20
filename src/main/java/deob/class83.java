package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cr")
public class class83 {

    @ObfuscatedName("cr.v")
    public static int[] field1255 = new int[5];

    @ObfuscatedName("cr.x")
    public static int[][] field1257 = new int[5][5000];

    @ObfuscatedName("cr.e")
    public static int[] field1258 = new int[1000];

    @ObfuscatedName("cr.b")
    public static String[] field1259 = new String[1000];

    @ObfuscatedName("cr.c")
    public static int field1260 = 0;

    @ObfuscatedName("cr.a")
    public static class63[] field1261 = new class63[50];

    @ObfuscatedName("cr.k")
    public static Calendar field1262 = Calendar.getInstance();

    @ObfuscatedName("cr.t")
    public static final String[] field1267 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cr.u")
    public static int field1264 = 0;

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.m(Lbi;I)V")
    public static void method1986(class69 arg0) {
        method1028(arg0, 200000);
    }

    @ObfuscatedName("ba.p(Lbi;IB)V")
    public static void method1028(class69 arg0, int arg1) {
        Object[] var2 = arg0.field792;
        class98 var4;
        if (class227.method1027(arg0.field797)) {
            Statics.field588 = (class48) var2[0];
            class250 var3 = Statics.field3359[Statics.field588.field579];
            var4 = class98.method2756(arg0.field797, var3.field3353, var3.field3370);
        } else {
            int var5 = (Integer) var2[0];
            class98 var6 = (class98) class98.field1446.method3419((long) var5);
            class98 var7;
            if (var6 == null) {
                byte[] var8 = Statics.field549.method3930(var5, 0);
                if (var8 == null) {
                    var7 = null;
                } else {
                    class98 var9 = class98.method2814(var8);
                    class98.field1446.method3418(var9, (long) var5);
                    var7 = var9;
                }
            } else {
                var7 = var6;
            }
            var4 = var7;
        }
        if (var4 == null) {
            return;
        }
        Statics.field651 = 0;
        Statics.field355 = 0;
        int var10 = -1;
        int[] var11 = var4.field1437;
        int[] var12 = var4.field1438;
        byte var13 = -1;
        field1260 = 0;
        try {
            Statics.field1254 = new int[var4.field1442];
            int var14 = 0;
            Statics.field1265 = new String[var4.field1436];
            int var15 = 0;
            for (int var16 = 1; var16 < var2.length; var16++) {
                if (var2[var16] instanceof Integer) {
                    int var17 = (Integer) var2[var16];
                    if (var17 == -2147483647) {
                        var17 = arg0.field788;
                    }
                    if (var17 == -2147483646) {
                        var17 = arg0.field789;
                    }
                    if (var17 == -2147483645) {
                        var17 = arg0.field795 == null ? -1 : arg0.field795.field2764;
                    }
                    if (var17 == -2147483644) {
                        var17 = arg0.field790;
                    }
                    if (var17 == -2147483643) {
                        var17 = arg0.field795 == null ? -1 : arg0.field795.field2728;
                    }
                    if (var17 == -2147483642) {
                        var17 = arg0.field791 == null ? -1 : arg0.field791.field2764;
                    }
                    if (var17 == -2147483641) {
                        var17 = arg0.field791 == null ? -1 : arg0.field791.field2728;
                    }
                    if (var17 == -2147483640) {
                        var17 = arg0.field796;
                    }
                    if (var17 == -2147483639) {
                        var17 = arg0.field793;
                    }
                    Statics.field1254[var14++] = var17;
                } else if (var2[var16] instanceof String) {
                    String var18 = (String) var2[var16];
                    if (var18.equals("event_opbase")) {
                        var18 = arg0.field794;
                    }
                    Statics.field1265[var15++] = var18;
                }
            }
            int var19 = 0;
            field1264 = arg0.field785;
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
                                                                                                                label266: while (true) {
                                                                                                                    var19++;
                                                                                                                    if (var19 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var10++;
                                                                                                                    int var67 = var11[var10];
                                                                                                                    if (var67 >= 100) {
                                                                                                                        boolean var61;
                                                                                                                        if (var4.field1438[var10] == 1) {
                                                                                                                            var61 = true;
                                                                                                                        } else {
                                                                                                                            var61 = false;
                                                                                                                        }
                                                                                                                        int var62 = method1105(var67, var4, var61);
                                                                                                                        switch(var62) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var67 == 0) {
                                                                                                                        field1258[++Statics.field651 - 1] = var12[var10];
                                                                                                                    } else if (var67 == 1) {
                                                                                                                        int var20 = var12[var10];
                                                                                                                        field1258[++Statics.field651 - 1] = class219.field2689[var20];
                                                                                                                    } else if (var67 == 2) {
                                                                                                                        int var21 = var12[var10];
                                                                                                                        class219.field2689[var21] = field1258[--Statics.field651];
                                                                                                                        client.method1766(var21);
                                                                                                                    } else if (var67 == 3) {
                                                                                                                        field1259[++Statics.field355 - 1] = var4.field1439[var10];
                                                                                                                    } else if (var67 == 6) {
                                                                                                                        var10 += var12[var10];
                                                                                                                    } else if (var67 == 7) {
                                                                                                                        Statics.field651 -= 2;
                                                                                                                        if (field1258[Statics.field651] != field1258[Statics.field651 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var67 == 8) {
                                                                                                                        Statics.field651 -= 2;
                                                                                                                        if (field1258[Statics.field651] == field1258[Statics.field651 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var67 == 9) {
                                                                                                                        Statics.field651 -= 2;
                                                                                                                        if (field1258[Statics.field651] < field1258[Statics.field651 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var67 == 10) {
                                                                                                                        Statics.field651 -= 2;
                                                                                                                        if (field1258[Statics.field651] > field1258[Statics.field651 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var67 == 21) {
                                                                                                                        if (field1260 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var22 = field1261[--field1260];
                                                                                                                        var4 = var22.field741;
                                                                                                                        var11 = var4.field1437;
                                                                                                                        var12 = var4.field1438;
                                                                                                                        var10 = var22.field742;
                                                                                                                        Statics.field1254 = var22.field743;
                                                                                                                        Statics.field1265 = var22.field744;
                                                                                                                    } else if (var67 == 25) {
                                                                                                                        int var23 = var12[var10];
                                                                                                                        field1258[++Statics.field651 - 1] = class219.method1684(var23);
                                                                                                                    } else if (var67 == 27) {
                                                                                                                        int var24 = var12[var10];
                                                                                                                        class219.method2274(var24, field1258[--Statics.field651]);
                                                                                                                    } else if (var67 == 31) {
                                                                                                                        Statics.field651 -= 2;
                                                                                                                        if (field1258[Statics.field651] <= field1258[Statics.field651 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var67 == 32) {
                                                                                                                        Statics.field651 -= 2;
                                                                                                                        if (field1258[Statics.field651] >= field1258[Statics.field651 + 1]) {
                                                                                                                            var10 += var12[var10];
                                                                                                                        }
                                                                                                                    } else if (var67 == 33) {
                                                                                                                        field1258[++Statics.field651 - 1] = Statics.field1254[var12[var10]];
                                                                                                                    } else if (var67 == 34) {
                                                                                                                        Statics.field1254[var12[var10]] = field1258[--Statics.field651];
                                                                                                                    } else if (var67 == 35) {
                                                                                                                        field1259[++Statics.field355 - 1] = Statics.field1265[var12[var10]];
                                                                                                                    } else if (var67 == 36) {
                                                                                                                        Statics.field1265[var12[var10]] = field1259[--Statics.field355];
                                                                                                                    } else if (var67 == 37) {
                                                                                                                        int var25 = var12[var10];
                                                                                                                        Statics.field355 -= var25;
                                                                                                                        String[] var26 = field1259;
                                                                                                                        int var27 = Statics.field355;
                                                                                                                        String var28;
                                                                                                                        if (var25 == 0) {
                                                                                                                            var28 = "";
                                                                                                                        } else if (var25 == 1) {
                                                                                                                            String var29 = var26[var27];
                                                                                                                            if (var29 == null) {
                                                                                                                                var28 = "null";
                                                                                                                            } else {
                                                                                                                                var28 = var29.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var30 = var25 + var27;
                                                                                                                            int var31 = 0;
                                                                                                                            for (int var32 = var27; var32 < var30; var32++) {
                                                                                                                                String var33 = var26[var32];
                                                                                                                                if (var33 == null) {
                                                                                                                                    var31 += 4;
                                                                                                                                } else {
                                                                                                                                    var31 += var33.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var34 = new StringBuilder(var31);
                                                                                                                            for (int var35 = var27; var35 < var30; var35++) {
                                                                                                                                String var36 = var26[var35];
                                                                                                                                if (var36 == null) {
                                                                                                                                    var34.append("null");
                                                                                                                                } else {
                                                                                                                                    var34.append(var36);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var28 = var34.toString();
                                                                                                                        }
                                                                                                                        field1259[++Statics.field355 - 1] = var28;
                                                                                                                    } else if (var67 == 38) {
                                                                                                                        Statics.field651--;
                                                                                                                    } else if (var67 == 39) {
                                                                                                                        Statics.field355--;
                                                                                                                    } else if (var67 == 40) {
                                                                                                                        int var38 = var12[var10];
                                                                                                                        class98 var39 = (class98) class98.field1446.method3419((long) var38);
                                                                                                                        class98 var40;
                                                                                                                        if (var39 == null) {
                                                                                                                            byte[] var41 = Statics.field549.method3930(var38, 0);
                                                                                                                            if (var41 == null) {
                                                                                                                                var40 = null;
                                                                                                                            } else {
                                                                                                                                class98 var42 = class98.method2814(var41);
                                                                                                                                class98.field1446.method3418(var42, (long) var38);
                                                                                                                                var40 = var42;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var40 = var39;
                                                                                                                        }
                                                                                                                        class98 var43 = var40;
                                                                                                                        int[] var44 = new int[var40.field1442];
                                                                                                                        String[] var45 = new String[var40.field1436];
                                                                                                                        for (int var46 = 0; var46 < var43.field1441; var46++) {
                                                                                                                            var44[var46] = field1258[Statics.field651 - var43.field1441 + var46];
                                                                                                                        }
                                                                                                                        for (int var47 = 0; var47 < var43.field1443; var47++) {
                                                                                                                            var45[var47] = field1259[Statics.field355 - var43.field1443 + var47];
                                                                                                                        }
                                                                                                                        Statics.field651 -= var43.field1441;
                                                                                                                        Statics.field355 -= var43.field1443;
                                                                                                                        class63 var48 = new class63();
                                                                                                                        var48.field741 = var4;
                                                                                                                        var48.field742 = var10;
                                                                                                                        var48.field743 = Statics.field1254;
                                                                                                                        var48.field744 = Statics.field1265;
                                                                                                                        field1261[++field1260 - 1] = var48;
                                                                                                                        var4 = var43;
                                                                                                                        var11 = var43.field1437;
                                                                                                                        var12 = var43.field1438;
                                                                                                                        var10 = -1;
                                                                                                                        Statics.field1254 = var44;
                                                                                                                        Statics.field1265 = var45;
                                                                                                                    } else if (var67 == 42) {
                                                                                                                        field1258[++Statics.field651 - 1] = Statics.field10.method1707(var12[var10]);
                                                                                                                    } else if (var67 == 43) {
                                                                                                                        Statics.field10.method1708(var12[var10], field1258[--Statics.field651]);
                                                                                                                    } else if (var67 == 44) {
                                                                                                                        int var49 = var12[var10] >> 16;
                                                                                                                        int var50 = var12[var10] & 0xFFFF;
                                                                                                                        int var51 = field1258[--Statics.field651];
                                                                                                                        if (var51 >= 0 && var51 <= 5000) {
                                                                                                                            field1255[var49] = var51;
                                                                                                                            byte var52 = -1;
                                                                                                                            if (var50 == 105) {
                                                                                                                                var52 = 0;
                                                                                                                            }
                                                                                                                            int var53 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var53 >= var51) {
                                                                                                                                    continue label266;
                                                                                                                                }
                                                                                                                                field1257[var49][var53] = var52;
                                                                                                                                var53++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var67 == 45) {
                                                                                                                        int var54 = var12[var10];
                                                                                                                        int var55 = field1258[--Statics.field651];
                                                                                                                        if (var55 < 0 || var55 >= field1255[var54]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1258[++Statics.field651 - 1] = field1257[var54][var55];
                                                                                                                    } else if (var67 == 46) {
                                                                                                                        int var56 = var12[var10];
                                                                                                                        Statics.field651 -= 2;
                                                                                                                        int var57 = field1258[Statics.field651];
                                                                                                                        if (var57 < 0 || var57 >= field1255[var56]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1257[var56][var57] = field1258[Statics.field651 + 1];
                                                                                                                    } else if (var67 == 47) {
                                                                                                                        String var58 = Statics.field10.method1711(var12[var10]);
                                                                                                                        if (var58 == null) {
                                                                                                                            var58 = "null";
                                                                                                                        }
                                                                                                                        field1259[++Statics.field355 - 1] = var58;
                                                                                                                    } else if (var67 == 48) {
                                                                                                                        Statics.field10.method1710(var12[var10], field1259[--Statics.field355]);
                                                                                                                    } else if (var67 == 60) {
                                                                                                                        class194 var59 = var4.field1444[var12[var10]];
                                                                                                                        class206 var60 = (class206) var59.method3389((long) field1258[--Statics.field651]);
                                                                                                                        if (var60 != null) {
                                                                                                                            var10 += var60.field2577;
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
        } catch (Exception var66) {
            StringBuilder var64 = new StringBuilder(30);
            var64.append("").append(var4.field2563).append(" ");
            for (int var65 = field1260 - 1; var65 >= 0; var65--) {
                var64.append("").append(field1261[var65].field741.field2563).append(" ");
            }
            var64.append("").append(var13);
            class154.method355(var64.toString(), var66);
        }
    }

    @ObfuscatedName("bh.i(ILcw;ZI)I")
    public static int method1105(int arg0, class98 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method226(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method1639(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method4076(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method503(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method2922(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method1056(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            class224 var6 = arg2 ? Statics.field3790 : Statics.field769;
            byte var7;
            if (arg0 == 1500) {
                field1258[++Statics.field651 - 1] = var6.field2740;
                var7 = 1;
            } else if (arg0 == 1501) {
                field1258[++Statics.field651 - 1] = var6.field2741;
                var7 = 1;
            } else if (arg0 == 1502) {
                field1258[++Statics.field651 - 1] = var6.field2742;
                var7 = 1;
            } else if (arg0 == 1503) {
                field1258[++Statics.field651 - 1] = var6.field2775;
                var7 = 1;
            } else if (arg0 == 1504) {
                field1258[++Statics.field651 - 1] = var6.field2747 ? 1 : 0;
                var7 = 1;
            } else if (arg0 == 1505) {
                field1258[++Statics.field651 - 1] = var6.field2746;
                var7 = 1;
            } else {
                var7 = 2;
            }
            return var7;
        } else if (arg0 < 1700) {
            class224 var8 = arg2 ? Statics.field3790 : Statics.field769;
            byte var9;
            if (arg0 == 1600) {
                field1258[++Statics.field651 - 1] = var8.field2748;
                var9 = 1;
            } else if (arg0 == 1601) {
                field1258[++Statics.field651 - 1] = var8.field2749;
                var9 = 1;
            } else if (arg0 == 1602) {
                field1259[++Statics.field355 - 1] = var8.field2787;
                var9 = 1;
            } else if (arg0 == 1603) {
                field1258[++Statics.field651 - 1] = var8.field2823;
                var9 = 1;
            } else if (arg0 == 1604) {
                field1258[++Statics.field651 - 1] = var8.field2751;
                var9 = 1;
            } else if (arg0 == 1605) {
                field1258[++Statics.field651 - 1] = var8.field2781;
                var9 = 1;
            } else if (arg0 == 1606) {
                field1258[++Statics.field651 - 1] = var8.field2855;
                var9 = 1;
            } else if (arg0 == 1607) {
                field1258[++Statics.field651 - 1] = var8.field2780;
                var9 = 1;
            } else if (arg0 == 1608) {
                field1258[++Statics.field651 - 1] = var8.field2779;
                var9 = 1;
            } else if (arg0 == 1609) {
                field1258[++Statics.field651 - 1] = var8.field2727;
                var9 = 1;
            } else if (arg0 == 1610) {
                field1258[++Statics.field651 - 1] = var8.field2759;
                var9 = 1;
            } else if (arg0 == 1611) {
                field1258[++Statics.field651 - 1] = var8.field2752;
                var9 = 1;
            } else if (arg0 == 1612) {
                field1258[++Statics.field651 - 1] = var8.field2754;
                var9 = 1;
            } else if (arg0 == 1613) {
                field1258[++Statics.field651 - 1] = var8.field2757.method9();
                var9 = 1;
            } else {
                var9 = 2;
            }
            return var9;
        } else if (arg0 < 1800) {
            return method113(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method2547(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method3742(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1639(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method4076(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method503(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method2922(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method1056(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method68(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            class224 var10 = class224.method1468(field1258[--Statics.field651]);
            byte var11;
            if (arg0 == 2600) {
                field1258[++Statics.field651 - 1] = var10.field2748;
                var11 = 1;
            } else if (arg0 == 2601) {
                field1258[++Statics.field651 - 1] = var10.field2749;
                var11 = 1;
            } else if (arg0 == 2602) {
                field1259[++Statics.field355 - 1] = var10.field2787;
                var11 = 1;
            } else if (arg0 == 2603) {
                field1258[++Statics.field651 - 1] = var10.field2823;
                var11 = 1;
            } else if (arg0 == 2604) {
                field1258[++Statics.field651 - 1] = var10.field2751;
                var11 = 1;
            } else if (arg0 == 2605) {
                field1258[++Statics.field651 - 1] = var10.field2781;
                var11 = 1;
            } else if (arg0 == 2606) {
                field1258[++Statics.field651 - 1] = var10.field2855;
                var11 = 1;
            } else if (arg0 == 2607) {
                field1258[++Statics.field651 - 1] = var10.field2780;
                var11 = 1;
            } else if (arg0 == 2608) {
                field1258[++Statics.field651 - 1] = var10.field2779;
                var11 = 1;
            } else if (arg0 == 2609) {
                field1258[++Statics.field651 - 1] = var10.field2727;
                var11 = 1;
            } else if (arg0 == 2610) {
                field1258[++Statics.field651 - 1] = var10.field2759;
                var11 = 1;
            } else if (arg0 == 2611) {
                field1258[++Statics.field651 - 1] = var10.field2752;
                var11 = 1;
            } else if (arg0 == 2612) {
                field1258[++Statics.field651 - 1] = var10.field2754;
                var11 = 1;
            } else if (arg0 == 2613) {
                field1258[++Statics.field651 - 1] = var10.field2757.method9();
                var11 = 1;
            } else {
                var11 = 2;
            }
            return var11;
        } else if (arg0 < 2800) {
            byte var13;
            if (arg0 == 2700) {
                class224 var12 = class224.method1468(field1258[--Statics.field651]);
                field1258[++Statics.field651 - 1] = var12.field2829;
                var13 = 1;
            } else if (arg0 == 2701) {
                class224 var14 = class224.method1468(field1258[--Statics.field651]);
                if (var14.field2829 == -1) {
                    field1258[++Statics.field651 - 1] = 0;
                } else {
                    field1258[++Statics.field651 - 1] = var14.field2848;
                }
                var13 = 1;
            } else if (arg0 == 2702) {
                int var15 = field1258[--Statics.field651];
                class68 var16 = (class68) client.field1026.method3444((long) var15);
                if (var16 == null) {
                    field1258[++Statics.field651 - 1] = 0;
                } else {
                    field1258[++Statics.field651 - 1] = 1;
                }
                var13 = 1;
            } else if (arg0 == 2706) {
                field1258[++Statics.field651 - 1] = client.field1010;
                var13 = 1;
            } else {
                var13 = 2;
            }
            return var13;
        } else if (arg0 < 2900) {
            return method354(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method3742(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            byte var18;
            if (arg0 == 3100) {
                String var17 = field1259[--Statics.field355];
                class97.method1752(0, "", var17);
                var18 = 1;
            } else if (arg0 == 3101) {
                Statics.field651 -= 2;
                client.method462(Statics.field601, field1258[Statics.field651], field1258[Statics.field651 + 1]);
                var18 = 1;
            } else if (arg0 == 3103) {
                class171 var19 = class171.method1482(class168.field2375, client.field953.field1479);
                client.field953.method1783(var19);
                for (class68 var20 = (class68) client.field1026.method3433(); var20 != null; var20 = (class68) client.field1026.method3440()) {
                    if (var20.field784 == 0 || var20.field784 == 3) {
                        client.method2748(var20, true);
                    }
                }
                if (client.field1014 != null) {
                    client.method353(client.field1014);
                    client.field1014 = null;
                }
                var18 = 1;
            } else if (arg0 == 3104) {
                String var21 = field1259[--Statics.field355];
                int var22 = 0;
                if (class278.method3231(var21)) {
                    var22 = class278.method1706(var21);
                }
                class171 var23 = class171.method1482(class168.field2376, client.field953.field1479);
                var23.field2424.method2999(var22);
                client.field953.method1783(var23);
                var18 = 1;
            } else if (arg0 == 3105) {
                String var24 = field1259[--Statics.field355];
                class171 var25 = class171.method1482(class168.field2395, client.field953.field1479);
                var25.field2424.method2996(var24.length() + 1);
                var25.field2424.method3003(var24);
                client.field953.method1783(var25);
                var18 = 1;
            } else if (arg0 == 3106) {
                String var26 = field1259[--Statics.field355];
                class171 var27 = class171.method1482(class168.field2383, client.field953.field1479);
                var27.field2424.method2996(var26.length() + 1);
                var27.field2424.method3003(var26);
                client.field953.method1783(var27);
                var18 = 1;
            } else if (arg0 == 3107) {
                int var28 = field1258[--Statics.field651];
                String var29 = field1259[--Statics.field355];
                int var30 = class95.field1406;
                int[] var31 = class95.field1407;
                boolean var32 = false;
                for (int var33 = 0; var33 < var30; var33++) {
                    class74 var34 = client.field1113[var31[var33]];
                    if (var34 != null && Statics.field601 != var34 && var34.field852 != null && var34.field852.equalsIgnoreCase(var29)) {
                        if (var28 == 1) {
                            class171 var35 = class171.method1482(class168.field2351, client.field953.field1479);
                            var35.field2424.method3130(0);
                            var35.field2424.method3097(var31[var33]);
                            client.field953.method1783(var35);
                        } else if (var28 == 4) {
                            class171 var36 = class171.method1482(class168.field2344, client.field953.field1479);
                            var36.field2424.method3046(var31[var33]);
                            var36.field2424.method3038(0);
                            client.field953.method1783(var36);
                        } else if (var28 == 6) {
                            class171 var37 = class171.method1482(class168.field2356, client.field953.field1479);
                            var37.field2424.method3038(0);
                            var37.field2424.method3046(var31[var33]);
                            client.field953.method1783(var37);
                        } else if (var28 == 7) {
                            class171 var38 = class171.method1482(class168.field2357, client.field953.field1479);
                            var38.field2424.method3101(0);
                            var38.field2424.method3097(var31[var33]);
                            client.field953.method1783(var38);
                        }
                        var32 = true;
                        break;
                    }
                }
                if (!var32) {
                    class97.method1752(4, "", class233.field3026 + var29);
                }
                var18 = 1;
            } else if (arg0 == 3108) {
                Statics.field651 -= 3;
                int var39 = field1258[Statics.field651];
                int var40 = field1258[Statics.field651 + 1];
                int var41 = field1258[Statics.field651 + 2];
                class224 var42 = class224.method1468(var41);
                client.method2377(var42, var39, var40);
                var18 = 1;
            } else if (arg0 == 3109) {
                Statics.field651 -= 2;
                int var43 = field1258[Statics.field651];
                int var44 = field1258[Statics.field651 + 1];
                class224 var45 = arg2 ? Statics.field3790 : Statics.field769;
                client.method2377(var45, var43, var44);
                var18 = 1;
            } else if (arg0 == 3110) {
                Statics.field1400 = field1258[--Statics.field651] == 1;
                var18 = 1;
            } else if (arg0 == 3111) {
                field1258[++Statics.field651 - 1] = Statics.field2494.field1227 ? 1 : 0;
                var18 = 1;
            } else if (arg0 == 3112) {
                Statics.field2494.field1227 = field1258[--Statics.field651] == 1;
                class81.method2914();
                var18 = 1;
            } else if (arg0 == 3113) {
                String var46 = field1259[--Statics.field355];
                boolean var47 = field1258[--Statics.field651] == 1;
                class57.method2736(var46, var47, false);
                var18 = 1;
            } else if (arg0 == 3115) {
                int var48 = field1258[--Statics.field651];
                class171 var49 = class171.method1482(class168.field2380, client.field953.field1479);
                var49.field2424.method2997(var48);
                client.field953.method1783(var49);
                var18 = 1;
            } else if (arg0 == 3116) {
                int var50 = field1258[--Statics.field651];
                Statics.field355 -= 2;
                String var51 = field1259[Statics.field355];
                String var52 = field1259[Statics.field355 + 1];
                if (var51.length() > 500) {
                    var18 = 1;
                } else if (var52.length() > 500) {
                    var18 = 1;
                } else {
                    class171 var53 = class171.method1482(class168.field2368, client.field953.field1479);
                    var53.field2424.method2997(1 + class181.method1683(var51) + class181.method1683(var52));
                    var53.field2424.method2996(var50);
                    var53.field2424.method3003(var51);
                    var53.field2424.method3003(var52);
                    client.field953.method1783(var53);
                    var18 = 1;
                }
            } else if (arg0 == 3117) {
                client.field998 = field1258[--Statics.field651] == 1;
                var18 = 1;
            } else {
                var18 = 2;
            }
            return var18;
        } else if (arg0 < 3300) {
            byte var57;
            if (arg0 == 3200) {
                Statics.field651 -= 3;
                int var54 = field1258[Statics.field651];
                int var55 = field1258[Statics.field651 + 1];
                int var56 = field1258[Statics.field651 + 2];
                if (client.field1090 != 0 && var55 != 0 && client.field1092 < 50) {
                    client.field911[client.field1092] = var54;
                    client.field1094[client.field1092] = var55;
                    client.field1095[client.field1092] = var56;
                    client.field980[client.field1092] = null;
                    client.field1034[client.field1092] = 0;
                    client.field1092++;
                }
                var57 = 1;
            } else if (arg0 == 3201) {
                client.method74(field1258[--Statics.field651]);
                var57 = 1;
            } else if (arg0 == 3202) {
                Statics.field651 -= 2;
                int var58 = field1258[Statics.field651];
                int var59 = field1258[Statics.field651 + 1];
                if (client.field1060 != 0 && var58 != -1) {
                    class211.method3245(Statics.field3233, var58, 0, client.field1060, false);
                    client.field1089 = true;
                }
                var57 = 1;
            } else {
                var57 = 2;
            }
            return var57;
        } else if (arg0 < 3400) {
            byte var60;
            if (arg0 == 3300) {
                field1258[++Statics.field651 - 1] = client.field1054;
                var60 = 1;
            } else if (arg0 == 3301) {
                Statics.field651 -= 2;
                int var61 = field1258[Statics.field651];
                int var62 = field1258[Statics.field651 + 1];
                field1258[++Statics.field651 - 1] = class64.method1058(var61, var62);
                var60 = 1;
            } else if (arg0 == 3302) {
                Statics.field651 -= 2;
                int var63 = field1258[Statics.field651];
                int var64 = field1258[Statics.field651 + 1];
                int[] var65 = field1258;
                int var66 = ++Statics.field651 - 1;
                class64 var67 = (class64) class64.field750.method3444((long) var63);
                int var68;
                if (var67 == null) {
                    var68 = 0;
                } else if (var64 >= 0 && var64 < var67.field748.length) {
                    var68 = var67.field748[var64];
                } else {
                    var68 = 0;
                }
                var65[var66] = var68;
                var60 = 1;
            } else if (arg0 == 3303) {
                Statics.field651 -= 2;
                int var69 = field1258[Statics.field651];
                int var70 = field1258[Statics.field651 + 1];
                int[] var71 = field1258;
                int var72 = ++Statics.field651 - 1;
                class64 var73 = (class64) class64.field750.method3444((long) var69);
                int var74;
                if (var73 == null) {
                    var74 = 0;
                } else if (var70 == -1) {
                    var74 = 0;
                } else {
                    int var75 = 0;
                    for (int var76 = 0; var76 < var73.field748.length; var76++) {
                        if (var73.field747[var76] == var70) {
                            var75 += var73.field748[var76];
                        }
                    }
                    var74 = var75;
                }
                var71[var72] = var74;
                var60 = 1;
            } else if (arg0 == 3304) {
                int var77 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = class248.method2793(var77).field3340;
                var60 = 1;
            } else if (arg0 == 3305) {
                int var78 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = client.field896[var78];
                var60 = 1;
            } else if (arg0 == 3306) {
                int var79 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = client.field985[var79];
                var60 = 1;
            } else if (arg0 == 3307) {
                int var80 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = client.field986[var80];
                var60 = 1;
            } else if (arg0 == 3308) {
                int var81 = Statics.field801;
                int var82 = (Statics.field601.field1188 >> 7) + Statics.field1709;
                int var83 = (Statics.field601.field1145 >> 7) + Statics.field1710;
                field1258[++Statics.field651 - 1] = (var81 << 28) + (var82 << 14) + var83;
                var60 = 1;
            } else if (arg0 == 3309) {
                int var84 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = var84 >> 14 & 0x3FFF;
                var60 = 1;
            } else if (arg0 == 3310) {
                int var85 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = var85 >> 28;
                var60 = 1;
            } else if (arg0 == 3311) {
                int var86 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = var86 & 0x3FFF;
                var60 = 1;
            } else if (arg0 == 3312) {
                field1258[++Statics.field651 - 1] = client.field874 ? 1 : 0;
                var60 = 1;
            } else if (arg0 == 3313) {
                Statics.field651 -= 2;
                int var87 = field1258[Statics.field651] + 32768;
                int var88 = field1258[Statics.field651 + 1];
                field1258[++Statics.field651 - 1] = class64.method1058(var87, var88);
                var60 = 1;
            } else if (arg0 == 3314) {
                Statics.field651 -= 2;
                int var89 = field1258[Statics.field651] + 32768;
                int var90 = field1258[Statics.field651 + 1];
                int[] var91 = field1258;
                int var92 = ++Statics.field651 - 1;
                class64 var93 = (class64) class64.field750.method3444((long) var89);
                int var94;
                if (var93 == null) {
                    var94 = 0;
                } else if (var90 >= 0 && var90 < var93.field748.length) {
                    var94 = var93.field748[var90];
                } else {
                    var94 = 0;
                }
                var91[var92] = var94;
                var60 = 1;
            } else if (arg0 == 3315) {
                Statics.field651 -= 2;
                int var95 = field1258[Statics.field651] + 32768;
                int var96 = field1258[Statics.field651 + 1];
                int[] var97 = field1258;
                int var98 = ++Statics.field651 - 1;
                class64 var99 = (class64) class64.field750.method3444((long) var95);
                int var100;
                if (var99 == null) {
                    var100 = 0;
                } else if (var96 == -1) {
                    var100 = 0;
                } else {
                    int var101 = 0;
                    for (int var102 = 0; var102 < var99.field748.length; var102++) {
                        if (var99.field747[var102] == var96) {
                            var101 += var99.field748[var102];
                        }
                    }
                    var100 = var101;
                }
                var97[var98] = var100;
                var60 = 1;
            } else if (arg0 == 3316) {
                if (client.field1017 >= 2) {
                    field1258[++Statics.field651 - 1] = client.field1017;
                } else {
                    field1258[++Statics.field651 - 1] = 0;
                }
                var60 = 1;
            } else if (arg0 == 3317) {
                field1258[++Statics.field651 - 1] = client.field1096;
                var60 = 1;
            } else if (arg0 == 3318) {
                field1258[++Statics.field651 - 1] = client.field871;
                var60 = 1;
            } else if (arg0 == 3321) {
                field1258[++Statics.field651 - 1] = client.field963;
                var60 = 1;
            } else if (arg0 == 3322) {
                field1258[++Statics.field651 - 1] = client.field1075;
                var60 = 1;
            } else if (arg0 == 3323) {
                if (client.field1019) {
                    field1258[++Statics.field651 - 1] = 1;
                } else {
                    field1258[++Statics.field651 - 1] = 0;
                }
                var60 = 1;
            } else if (arg0 == 3324) {
                field1258[++Statics.field651 - 1] = client.field872;
                var60 = 1;
            } else if (arg0 == 3325) {
                Statics.field651 -= 4;
                int var103 = field1258[Statics.field651];
                int var104 = field1258[Statics.field651 + 1];
                int var105 = field1258[Statics.field651 + 2];
                int var106 = field1258[Statics.field651 + 3];
                int var107 = (var104 << 14) + var103;
                int var108 = (var105 << 28) + var107;
                int var109 = var106 + var108;
                field1258[++Statics.field651 - 1] = var109;
                var60 = 1;
            } else {
                var60 = 2;
            }
            return var60;
        } else if (arg0 < 3500) {
            byte var118;
            if (arg0 == 3400) {
                Statics.field651 -= 2;
                int var110 = field1258[Statics.field651];
                int var111 = field1258[Statics.field651 + 1];
                class261 var112 = (class261) class261.field3453.method3419((long) var110);
                class261 var113;
                if (var112 == null) {
                    byte[] var114 = Statics.field3457.method3930(8, var110);
                    class261 var115 = new class261();
                    if (var114 != null) {
                        var115.method4280(new class181(var114));
                    }
                    class261.field3453.method3418(var115, (long) var110);
                    var113 = var115;
                } else {
                    var113 = var112;
                }
                class261 var116 = var113;
                if (var113.field3455 != 's') {
                }
                for (int var117 = 0; var117 < var116.field3452; var117++) {
                    if (var116.field3459[var117] == var111) {
                        field1259[++Statics.field355 - 1] = var116.field3461[var117];
                        var116 = null;
                        break;
                    }
                }
                if (var116 != null) {
                    field1259[++Statics.field355 - 1] = var116.field3456;
                }
                var118 = 1;
            } else if (arg0 == 3408) {
                Statics.field651 -= 4;
                int var119 = field1258[Statics.field651];
                int var120 = field1258[Statics.field651 + 1];
                int var121 = field1258[Statics.field651 + 2];
                int var122 = field1258[Statics.field651 + 3];
                class261 var123 = (class261) class261.field3453.method3419((long) var121);
                class261 var124;
                if (var123 == null) {
                    byte[] var125 = Statics.field3457.method3930(8, var121);
                    class261 var126 = new class261();
                    if (var125 != null) {
                        var126.method4280(new class181(var125));
                    }
                    class261.field3453.method3418(var126, (long) var121);
                    var124 = var126;
                } else {
                    var124 = var123;
                }
                class261 var127 = var124;
                if (var124.field3454 == var119 && var124.field3455 == var120) {
                    for (int var128 = 0; var128 < var127.field3452; var128++) {
                        if (var127.field3459[var128] == var122) {
                            if (var120 == 115) {
                                field1259[++Statics.field355 - 1] = var127.field3461[var128];
                            } else {
                                field1258[++Statics.field651 - 1] = var127.field3460[var128];
                            }
                            var127 = null;
                            break;
                        }
                    }
                    if (var127 != null) {
                        if (var120 == 115) {
                            field1259[++Statics.field355 - 1] = var127.field3456;
                        } else {
                            field1258[++Statics.field651 - 1] = var127.field3458;
                        }
                    }
                    var118 = 1;
                } else {
                    if (var120 == 115) {
                        field1259[++Statics.field355 - 1] = "null";
                    } else {
                        field1258[++Statics.field651 - 1] = 0;
                    }
                    var118 = 1;
                }
            } else {
                var118 = 2;
            }
            return var118;
        } else if (arg0 < 3700) {
            byte var129;
            if (arg0 == 3600) {
                if (client.field1022 == 0) {
                    field1258[++Statics.field651 - 1] = -2;
                } else if (client.field1022 == 1) {
                    field1258[++Statics.field651 - 1] = -1;
                } else {
                    field1258[++Statics.field651 - 1] = client.field1117;
                }
                var129 = 1;
            } else if (arg0 == 3601) {
                int var130 = field1258[--Statics.field651];
                if (client.field1022 == 2 && var130 < client.field1117) {
                    field1259[++Statics.field355 - 1] = client.field1004[var130].field773;
                    field1259[++Statics.field355 - 1] = client.field1004[var130].field768;
                } else {
                    field1259[++Statics.field355 - 1] = "";
                    field1259[++Statics.field355 - 1] = "";
                }
                var129 = 1;
            } else if (arg0 == 3602) {
                int var131 = field1258[--Statics.field651];
                if (client.field1022 == 2 && var131 < client.field1117) {
                    field1258[++Statics.field651 - 1] = client.field1004[var131].field774;
                } else {
                    field1258[++Statics.field651 - 1] = 0;
                }
                var129 = 1;
            } else if (arg0 == 3603) {
                int var132 = field1258[--Statics.field651];
                if (client.field1022 == 2 && var132 < client.field1117) {
                    field1258[++Statics.field651 - 1] = client.field1004[var132].field770;
                } else {
                    field1258[++Statics.field651 - 1] = 0;
                }
                var129 = 1;
            } else if (arg0 == 3604) {
                String var133 = field1259[--Statics.field355];
                int var134 = field1258[--Statics.field651];
                class171 var135 = class171.method1482(class168.field2384, client.field953.field1479);
                var135.field2424.method2996(class181.method1683(var133) + 1);
                var135.field2424.method3101(var134);
                var135.field2424.method3003(var133);
                client.field953.method1783(var135);
                var129 = 1;
            } else if (arg0 == 3605) {
                String var136 = field1259[--Statics.field355];
                if (var136 != null) {
                    if ((client.field1117 < 200 || client.field972 == 1) && client.field1117 < 400) {
                        String var137 = class275.method3310(var136, Statics.field719);
                        if (var137 != null) {
                            int var138 = 0;
                            label1568: while (true) {
                                if (var138 >= client.field1117) {
                                    for (int var142 = 0; var142 < client.field1018; var142++) {
                                        class70 var143 = client.field1122[var142];
                                        String var144 = class275.method3310(var143.field799, Statics.field719);
                                        if (var144 != null && var144.equals(var137)) {
                                            class97.method1752(30, "", class233.field3095 + var136 + class233.field3096);
                                            break label1568;
                                        }
                                        if (var143.field803 != null) {
                                            String var145 = class275.method3310(var143.field803, Statics.field719);
                                            if (var145 != null && var145.equals(var137)) {
                                                class97.method1752(30, "", class233.field3095 + var136 + class233.field3096);
                                                break label1568;
                                            }
                                        }
                                    }
                                    if (class275.method3310(Statics.field601.field852, Statics.field719).equals(var137)) {
                                        class97.method1752(30, "", class233.field2964);
                                    } else {
                                        class171 var146 = class171.method1482(class168.field2398, client.field953.field1479);
                                        var146.field2424.method2996(class181.method1683(var136));
                                        var146.field2424.method3003(var136);
                                        client.field953.method1783(var146);
                                    }
                                    break;
                                }
                                class66 var139 = client.field1004[var138];
                                String var140 = class275.method3310(var139.field773, Statics.field719);
                                if (var140 != null && var140.equals(var137)) {
                                    class97.method1752(30, "", var136 + class233.field3164);
                                    break;
                                }
                                if (var139.field768 != null) {
                                    String var141 = class275.method3310(var139.field768, Statics.field719);
                                    if (var141 != null && var141.equals(var137)) {
                                        class97.method1752(30, "", var136 + class233.field3164);
                                        break;
                                    }
                                }
                                var138++;
                            }
                        }
                    } else {
                        class97.method1752(30, "", class233.field3051);
                    }
                }
                var129 = 1;
            } else if (arg0 == 3606) {
                String var147 = field1259[--Statics.field355];
                if (var147 != null) {
                    String var148 = class275.method3310(var147, Statics.field719);
                    if (var148 != null) {
                        for (int var149 = 0; var149 < client.field1117; var149++) {
                            class66 var150 = client.field1004[var149];
                            String var151 = var150.field773;
                            String var152 = class275.method3310(var151, Statics.field719);
                            boolean var153;
                            if (var147 == null || var151 == null) {
                                var153 = false;
                            } else if (var147.startsWith("#") || var151.startsWith("#")) {
                                var153 = var147.equals(var151);
                            } else {
                                var153 = var148.equals(var152);
                            }
                            if (var153) {
                                client.field1117--;
                                for (int var154 = var149; var154 < client.field1117; var154++) {
                                    client.field1004[var154] = client.field1004[var154 + 1];
                                }
                                client.field1043 = client.field1101;
                                class171 var155 = class171.method1482(class168.field2397, client.field953.field1479);
                                var155.field2424.method2996(class181.method1683(var147));
                                var155.field2424.method3003(var147);
                                client.field953.method1783(var155);
                                break;
                            }
                        }
                    }
                }
                var129 = 1;
            } else if (arg0 == 3607) {
                String var156 = field1259[--Statics.field355];
                client.method493(var156, false);
                var129 = 1;
            } else if (arg0 == 3608) {
                String var157 = field1259[--Statics.field355];
                client.method133(var157);
                var129 = 1;
            } else if (arg0 == 3609) {
                String var158 = field1259[--Statics.field355];
                class238[] var159 = class238.method102();
                for (int var160 = 0; var160 < var159.length; var160++) {
                    class238 var161 = var159[var160];
                    if (var161.field3241 != -1) {
                        int var163 = var161.field3241;
                        String var164 = "<img=" + var163 + ">";
                        if (var158.startsWith(var164)) {
                            var158 = var158.substring(6 + Integer.toString(var161.field3241).length());
                            break;
                        }
                    }
                }
                field1258[++Statics.field651 - 1] = client.method1463(var158, false) ? 1 : 0;
                var129 = 1;
            } else if (arg0 == 3611) {
                if (client.field1076 == null) {
                    field1259[++Statics.field355 - 1] = "";
                } else {
                    String[] var165 = field1259;
                    int var166 = ++Statics.field355 - 1;
                    String var167 = client.field1076;
                    long var168 = 0L;
                    int var170 = var167.length();
                    for (int var171 = 0; var171 < var170; var171++) {
                        var168 *= 37L;
                        char var172 = var167.charAt(var171);
                        if (var172 >= 'A' && var172 <= 'Z') {
                            var168 += (long) (var172 + 1 - 65);
                        } else if (var172 >= 'a' && var172 <= 'z') {
                            var168 += (long) (var172 + 1 - 97);
                        } else if (var172 >= '0' && var172 <= '9') {
                            var168 += (long) (var172 + 27 - 48);
                        }
                        if (var168 >= 177917621779460413L) {
                            break;
                        }
                    }
                    while (var168 % 37L == 0L && var168 != 0L) {
                        var168 /= 37L;
                    }
                    String var175 = class276.method1540(var168);
                    if (var175 == null) {
                        var175 = "";
                    }
                    var165[var166] = var175;
                }
                var129 = 1;
            } else if (arg0 == 3612) {
                if (client.field1076 == null) {
                    field1258[++Statics.field651 - 1] = 0;
                } else {
                    field1258[++Statics.field651 - 1] = Statics.field927;
                }
                var129 = 1;
            } else if (arg0 == 3613) {
                int var177 = field1258[--Statics.field651];
                if (client.field1076 == null || var177 >= Statics.field927) {
                    field1259[++Statics.field355 - 1] = "";
                } else {
                    field1259[++Statics.field355 - 1] = Statics.field1456[var177].field862;
                }
                var129 = 1;
            } else if (arg0 == 3614) {
                int var178 = field1258[--Statics.field651];
                if (client.field1076 == null || var178 >= Statics.field927) {
                    field1258[++Statics.field651 - 1] = 0;
                } else {
                    field1258[++Statics.field651 - 1] = Statics.field1456[var178].field864;
                }
                var129 = 1;
            } else if (arg0 == 3615) {
                int var179 = field1258[--Statics.field651];
                if (client.field1076 == null || var179 >= Statics.field927) {
                    field1258[++Statics.field651 - 1] = 0;
                } else {
                    field1258[++Statics.field651 - 1] = Statics.field1456[var179].field869;
                }
                var129 = 1;
            } else if (arg0 == 3616) {
                field1258[++Statics.field651 - 1] = Statics.field806;
                var129 = 1;
            } else if (arg0 == 3617) {
                String var180 = field1259[--Statics.field355];
                client.method41(var180);
                var129 = 1;
            } else if (arg0 == 3618) {
                field1258[++Statics.field651 - 1] = Statics.field249;
                var129 = 1;
            } else if (arg0 == 3619) {
                String var181 = field1259[--Statics.field355];
                client.method147(var181);
                var129 = 1;
            } else if (arg0 == 3620) {
                client.method1739();
                var129 = 1;
            } else if (arg0 == 3621) {
                if (client.field1022 == 0) {
                    field1258[++Statics.field651 - 1] = -1;
                } else {
                    field1258[++Statics.field651 - 1] = client.field1018;
                }
                var129 = 1;
            } else if (arg0 == 3622) {
                int var182 = field1258[--Statics.field651];
                if (client.field1022 == 0 || var182 >= client.field1018) {
                    field1259[++Statics.field355 - 1] = "";
                    field1259[++Statics.field355 - 1] = "";
                } else {
                    field1259[++Statics.field355 - 1] = client.field1122[var182].field799;
                    field1259[++Statics.field355 - 1] = client.field1122[var182].field803;
                }
                var129 = 1;
            } else if (arg0 == 3623) {
                String var183;
                label1418: {
                    var183 = field1259[--Statics.field355];
                    String var185 = "<img=0>";
                    if (!var183.startsWith(var185)) {
                        String var187 = "<img=1>";
                        if (!var183.startsWith(var187)) {
                            break label1418;
                        }
                    }
                    var183 = var183.substring(7);
                }
                field1258[++Statics.field651 - 1] = client.method2378(var183) ? 1 : 0;
                var129 = 1;
            } else if (arg0 == 3624) {
                int var188 = field1258[--Statics.field651];
                if (Statics.field1456 == null || var188 >= Statics.field927 || !Statics.field1456[var188].field862.equalsIgnoreCase(Statics.field601.field852)) {
                    field1258[++Statics.field651 - 1] = 0;
                } else {
                    field1258[++Statics.field651 - 1] = 1;
                }
                var129 = 1;
            } else if (arg0 == 3625) {
                if (client.field1077 == null) {
                    field1259[++Statics.field355 - 1] = "";
                } else {
                    String[] var189 = field1259;
                    int var190 = ++Statics.field355 - 1;
                    String var191 = client.field1077;
                    long var192 = 0L;
                    int var194 = var191.length();
                    for (int var195 = 0; var195 < var194; var195++) {
                        var192 *= 37L;
                        char var196 = var191.charAt(var195);
                        if (var196 >= 'A' && var196 <= 'Z') {
                            var192 += (long) (var196 + 1 - 65);
                        } else if (var196 >= 'a' && var196 <= 'z') {
                            var192 += (long) (var196 + 1 - 97);
                        } else if (var196 >= '0' && var196 <= '9') {
                            var192 += (long) (var196 + 27 - 48);
                        }
                        if (var192 >= 177917621779460413L) {
                            break;
                        }
                    }
                    while (var192 % 37L == 0L && var192 != 0L) {
                        var192 /= 37L;
                    }
                    String var199 = class276.method1540(var192);
                    if (var199 == null) {
                        var199 = "";
                    }
                    var189[var190] = var199;
                }
                var129 = 1;
            } else {
                var129 = 2;
            }
            return var129;
        } else if (arg0 < 4000) {
            byte var202;
            if (arg0 == 3903) {
                int var201 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = client.field1126[var201].method107();
                var202 = 1;
            } else if (arg0 == 3904) {
                int var203 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = client.field1126[var203].field299;
                var202 = 1;
            } else if (arg0 == 3905) {
                int var204 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = client.field1126[var204].field300;
                var202 = 1;
            } else if (arg0 == 3906) {
                int var205 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = client.field1126[var205].field298;
                var202 = 1;
            } else if (arg0 == 3907) {
                int var206 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = client.field1126[var206].field302;
                var202 = 1;
            } else if (arg0 == 3908) {
                int var207 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = client.field1126[var207].field303;
                var202 = 1;
            } else if (arg0 == 3910) {
                int var208 = field1258[--Statics.field651];
                int var209 = client.field1126[var208].method106();
                field1258[++Statics.field651 - 1] = var209 == 0 ? 1 : 0;
                var202 = 1;
            } else if (arg0 == 3911) {
                int var210 = field1258[--Statics.field651];
                int var211 = client.field1126[var210].method106();
                field1258[++Statics.field651 - 1] = var211 == 2 ? 1 : 0;
                var202 = 1;
            } else if (arg0 == 3912) {
                int var212 = field1258[--Statics.field651];
                int var213 = client.field1126[var212].method106();
                field1258[++Statics.field651 - 1] = var213 == 5 ? 1 : 0;
                var202 = 1;
            } else if (arg0 == 3913) {
                int var214 = field1258[--Statics.field651];
                int var215 = client.field1126[var214].method106();
                field1258[++Statics.field651 - 1] = var215 == 1 ? 1 : 0;
                var202 = 1;
            } else if (arg0 == 3914) {
                boolean var216 = field1258[--Statics.field651] == 1;
                if (Statics.field2447 != null) {
                    Statics.field2447.method72(class14.field278, var216);
                }
                var202 = 1;
            } else if (arg0 == 3915) {
                boolean var217 = field1258[--Statics.field651] == 1;
                if (Statics.field2447 != null) {
                    Statics.field2447.method72(class14.field277, var217);
                }
                var202 = 1;
            } else if (arg0 == 3916) {
                Statics.field651 -= 2;
                boolean var218 = field1258[Statics.field651] == 1;
                boolean var219 = field1258[Statics.field651 + 1] == 1;
                if (Statics.field2447 != null) {
                    client.field1127.field860 = var219;
                    Statics.field2447.method72(client.field1127, var218);
                }
                var202 = 1;
            } else if (arg0 == 3917) {
                boolean var220 = field1258[--Statics.field651] == 1;
                if (Statics.field2447 != null) {
                    Statics.field2447.method72(class14.field279, var220);
                }
                var202 = 1;
            } else if (arg0 == 3918) {
                boolean var221 = field1258[--Statics.field651] == 1;
                if (Statics.field2447 != null) {
                    Statics.field2447.method72(class14.field275, var221);
                }
                var202 = 1;
            } else if (arg0 == 3919) {
                field1258[++Statics.field651 - 1] = Statics.field2447 == null ? 0 : Statics.field2447.field276.size();
                var202 = 1;
            } else if (arg0 == 3920) {
                int var222 = field1258[--Statics.field651];
                class15 var223 = (class15) Statics.field2447.field276.get(var222);
                field1258[++Statics.field651 - 1] = var223.field292;
                var202 = 1;
            } else if (arg0 == 3921) {
                int var224 = field1258[--Statics.field651];
                class15 var225 = (class15) Statics.field2447.field276.get(var224);
                field1259[++Statics.field355 - 1] = var225.method86();
                var202 = 1;
            } else if (arg0 == 3922) {
                int var226 = field1258[--Statics.field651];
                class15 var227 = (class15) Statics.field2447.field276.get(var226);
                field1259[++Statics.field355 - 1] = var227.method77();
                var202 = 1;
            } else if (arg0 == 3923) {
                int var228 = field1258[--Statics.field651];
                class15 var229 = (class15) Statics.field2447.field276.get(var228);
                long var230 = class183.method4541() - Statics.field736 - var229.field285;
                int var232 = (int) (var230 / 3600000L);
                int var233 = (int) ((var230 - (long) (var232 * 3600000)) / 60000L);
                int var234 = (int) ((var230 - (long) (var232 * 3600000) - (long) (var233 * 60000)) / 1000L);
                String var235 = var232 + ":" + var233 / 10 + var233 % 10 + ":" + var234 / 10 + var234 % 10;
                field1259[++Statics.field355 - 1] = var235;
                var202 = 1;
            } else if (arg0 == 3924) {
                int var236 = field1258[--Statics.field651];
                class15 var237 = (class15) Statics.field2447.field276.get(var236);
                field1258[++Statics.field651 - 1] = var237.field286.field298;
                var202 = 1;
            } else if (arg0 == 3925) {
                int var238 = field1258[--Statics.field651];
                class15 var239 = (class15) Statics.field2447.field276.get(var238);
                field1258[++Statics.field651 - 1] = var239.field286.field300;
                var202 = 1;
            } else if (arg0 == 3926) {
                int var240 = field1258[--Statics.field651];
                class15 var241 = (class15) Statics.field2447.field276.get(var240);
                field1258[++Statics.field651 - 1] = var241.field286.field299;
                var202 = 1;
            } else {
                var202 = 2;
            }
            return var202;
        } else if (arg0 < 4100) {
            return method3329(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            byte var244;
            if (arg0 == 4100) {
                String var242 = field1259[--Statics.field355];
                int var243 = field1258[--Statics.field651];
                field1259[++Statics.field355 - 1] = var242 + var243;
                var244 = 1;
            } else if (arg0 == 4101) {
                Statics.field355 -= 2;
                String var245 = field1259[Statics.field355];
                String var246 = field1259[Statics.field355 + 1];
                field1259[++Statics.field355 - 1] = var245 + var246;
                var244 = 1;
            } else if (arg0 == 4102) {
                String var247 = field1259[--Statics.field355];
                int var248 = field1258[--Statics.field651];
                String[] var249 = field1259;
                int var250 = ++Statics.field355 - 1;
                String var252;
                if (var248 < 0) {
                    var252 = Integer.toString(var248);
                } else {
                    var252 = class278.method3887(var248, 10, true);
                }
                var249[var250] = var247 + var252;
                var244 = 1;
            } else if (arg0 == 4103) {
                String var253 = field1259[--Statics.field355];
                field1259[++Statics.field355 - 1] = var253.toLowerCase();
                var244 = 1;
            } else if (arg0 == 4104) {
                int var254 = field1258[--Statics.field651];
                long var255 = ((long) var254 + 11745L) * 86400000L;
                field1262.setTime(new Date(var255));
                int var257 = field1262.get(5);
                int var258 = field1262.get(2);
                int var259 = field1262.get(1);
                field1259[++Statics.field355 - 1] = var257 + "-" + field1267[var258] + "-" + var259;
                var244 = 1;
            } else if (arg0 == 4105) {
                Statics.field355 -= 2;
                String var260 = field1259[Statics.field355];
                String var261 = field1259[Statics.field355 + 1];
                if (Statics.field601.field833 != null && Statics.field601.field833.field2698) {
                    field1259[++Statics.field355 - 1] = var261;
                } else {
                    field1259[++Statics.field355 - 1] = var260;
                }
                var244 = 1;
            } else if (arg0 == 4106) {
                int var262 = field1258[--Statics.field651];
                field1259[++Statics.field355 - 1] = Integer.toString(var262);
                var244 = 1;
            } else if (arg0 == 4107) {
                Statics.field355 -= 2;
                field1258[++Statics.field651 - 1] = class278.method1032(class172.method4465(field1259[Statics.field355], field1259[Statics.field355 + 1], client.field1061));
                var244 = 1;
            } else if (arg0 == 4108) {
                String var263 = field1259[--Statics.field355];
                Statics.field651 -= 2;
                int var264 = field1258[Statics.field651];
                int var265 = field1258[Statics.field651 + 1];
                byte[] var266 = Statics.field383.method3930(var265, 0);
                class271 var267 = new class271(var266);
                field1258[++Statics.field651 - 1] = var267.method4558(var263, var264);
                var244 = 1;
            } else if (arg0 == 4109) {
                String var268 = field1259[--Statics.field355];
                Statics.field651 -= 2;
                int var269 = field1258[Statics.field651];
                int var270 = field1258[Statics.field651 + 1];
                byte[] var271 = Statics.field383.method3930(var270, 0);
                class271 var272 = new class271(var271);
                field1258[++Statics.field651 - 1] = var272.method4583(var268, var269);
                var244 = 1;
            } else if (arg0 == 4110) {
                Statics.field355 -= 2;
                String var273 = field1259[Statics.field355];
                String var274 = field1259[Statics.field355 + 1];
                if (field1258[--Statics.field651] == 1) {
                    field1259[++Statics.field355 - 1] = var273;
                } else {
                    field1259[++Statics.field355 - 1] = var274;
                }
                var244 = 1;
            } else if (arg0 == 4111) {
                String var275 = field1259[--Statics.field355];
                field1259[++Statics.field355 - 1] = class272.method4559(var275);
                var244 = 1;
            } else if (arg0 == 4112) {
                String var276 = field1259[--Statics.field355];
                int var277 = field1258[--Statics.field651];
                field1259[++Statics.field355 - 1] = var276 + (char) var277;
                var244 = 1;
            } else if (arg0 == 4113) {
                int var278 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = class278.method530((char) var278) ? 1 : 0;
                var244 = 1;
            } else if (arg0 == 4114) {
                int var279 = field1258[--Statics.field651];
                int[] var280 = field1258;
                int var281 = ++Statics.field651 - 1;
                char var282 = (char) var279;
                boolean var283 = var282 >= '0' && var282 <= '9' || var282 >= 'A' && var282 <= 'Z' || var282 >= 'a' && var282 <= 'z';
                var280[var281] = var283 ? 1 : 0;
                var244 = 1;
            } else if (arg0 == 4115) {
                int var284 = field1258[--Statics.field651];
                int[] var285 = field1258;
                int var286 = ++Statics.field651 - 1;
                char var287 = (char) var284;
                boolean var288 = var287 >= 'A' && var287 <= 'Z' || var287 >= 'a' && var287 <= 'z';
                var285[var286] = var288 ? 1 : 0;
                var244 = 1;
            } else if (arg0 == 4116) {
                int var289 = field1258[--Statics.field651];
                int[] var290 = field1258;
                int var291 = ++Statics.field651 - 1;
                char var292 = (char) var289;
                boolean var293 = var292 >= '0' && var292 <= '9';
                var290[var291] = var293 ? 1 : 0;
                var244 = 1;
            } else if (arg0 == 4117) {
                String var294 = field1259[--Statics.field355];
                if (var294 == null) {
                    field1258[++Statics.field651 - 1] = 0;
                } else {
                    field1258[++Statics.field651 - 1] = var294.length();
                }
                var244 = 1;
            } else if (arg0 == 4118) {
                String var295 = field1259[--Statics.field355];
                Statics.field651 -= 2;
                int var296 = field1258[Statics.field651];
                int var297 = field1258[Statics.field651 + 1];
                field1259[++Statics.field355 - 1] = var295.substring(var296, var297);
                var244 = 1;
            } else if (arg0 == 4119) {
                String var298 = field1259[--Statics.field355];
                StringBuilder var299 = new StringBuilder(var298.length());
                boolean var300 = false;
                for (int var301 = 0; var301 < var298.length(); var301++) {
                    char var302 = var298.charAt(var301);
                    if (var302 == '<') {
                        var300 = true;
                    } else if (var302 == '>') {
                        var300 = false;
                    } else if (!var300) {
                        var299.append(var302);
                    }
                }
                field1259[++Statics.field355 - 1] = var299.toString();
                var244 = 1;
            } else if (arg0 == 4120) {
                String var303 = field1259[--Statics.field355];
                int var304 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = var303.indexOf(var304);
                var244 = 1;
            } else if (arg0 == 4121) {
                Statics.field355 -= 2;
                String var305 = field1259[Statics.field355];
                String var306 = field1259[Statics.field355 + 1];
                int var307 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = var305.indexOf(var306, var307);
                var244 = 1;
            } else {
                var244 = 2;
            }
            return var244;
        } else if (arg0 < 4300) {
            byte var309;
            if (arg0 == 4200) {
                int var308 = field1258[--Statics.field651];
                field1259[++Statics.field355 - 1] = class264.method4124(var308).field3551;
                var309 = 1;
            } else if (arg0 == 4201) {
                Statics.field651 -= 2;
                int var310 = field1258[Statics.field651];
                int var311 = field1258[Statics.field651 + 1];
                class264 var312 = class264.method4124(var310);
                if (var311 < 1 || var311 > 5 || var312.field3578[var311 - 1] == null) {
                    field1259[++Statics.field355 - 1] = "";
                } else {
                    field1259[++Statics.field355 - 1] = var312.field3578[var311 - 1];
                }
                var309 = 1;
            } else if (arg0 == 4202) {
                Statics.field651 -= 2;
                int var313 = field1258[Statics.field651];
                int var314 = field1258[Statics.field651 + 1];
                class264 var315 = class264.method4124(var313);
                if (var314 < 1 || var314 > 5 || var315.field3565[var314 - 1] == null) {
                    field1259[++Statics.field355 - 1] = "";
                } else {
                    field1259[++Statics.field355 - 1] = var315.field3565[var314 - 1];
                }
                var309 = 1;
            } else if (arg0 == 4203) {
                int var316 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = class264.method4124(var316).field3563;
                var309 = 1;
            } else if (arg0 == 4204) {
                int var317 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = class264.method4124(var317).field3559 == 1 ? 1 : 0;
                var309 = 1;
            } else if (arg0 == 4205) {
                int var318 = field1258[--Statics.field651];
                class264 var319 = class264.method4124(var318);
                if (var319.field3588 == -1 && var319.field3582 >= 0) {
                    field1258[++Statics.field651 - 1] = var319.field3582;
                } else {
                    field1258[++Statics.field651 - 1] = var318;
                }
                var309 = 1;
            } else if (arg0 == 4206) {
                int var320 = field1258[--Statics.field651];
                class264 var321 = class264.method4124(var320);
                if (var321.field3588 >= 0 && var321.field3582 >= 0) {
                    field1258[++Statics.field651 - 1] = var321.field3582;
                } else {
                    field1258[++Statics.field651 - 1] = var320;
                }
                var309 = 1;
            } else if (arg0 == 4207) {
                int var322 = field1258[--Statics.field651];
                field1258[++Statics.field651 - 1] = class264.method4124(var322).field3564 ? 1 : 0;
                var309 = 1;
            } else if (arg0 == 4208) {
                int var323 = field1258[--Statics.field651];
                class264 var324 = class264.method4124(var323);
                if (var324.field3595 == -1 && var324.field3594 >= 0) {
                    field1258[++Statics.field651 - 1] = var324.field3594;
                } else {
                    field1258[++Statics.field651 - 1] = var323;
                }
                var309 = 1;
            } else if (arg0 == 4209) {
                int var325 = field1258[--Statics.field651];
                class264 var326 = class264.method4124(var325);
                if (var326.field3595 >= 0 && var326.field3594 >= 0) {
                    field1258[++Statics.field651 - 1] = var326.field3594;
                } else {
                    field1258[++Statics.field651 - 1] = var325;
                }
                var309 = 1;
            } else if (arg0 == 4210) {
                String var327 = field1259[--Statics.field355];
                int var328 = field1258[--Statics.field651];
                client.method162(var327, var328 == 1);
                field1258[++Statics.field651 - 1] = Statics.field552;
                var309 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field636 == null || Statics.field844 >= Statics.field552) {
                    field1258[++Statics.field651 - 1] = -1;
                } else {
                    field1258[++Statics.field651 - 1] = Statics.field636[++Statics.field844 - 1] & 0xFFFF;
                }
                var309 = 1;
            } else if (arg0 == 4212) {
                Statics.field844 = 0;
                var309 = 1;
            } else {
                var309 = 2;
            }
            return var309;
        } else if (arg0 < 5100) {
            return method40(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            byte var332;
            if (arg0 == 5306) {
                int[] var329 = field1258;
                int var330 = ++Statics.field651 - 1;
                int var331 = client.field1097 ? 2 : 1;
                var329[var330] = var331;
                var332 = 1;
            } else if (arg0 == 5307) {
                int var333 = field1258[--Statics.field651];
                if (var333 == 1 || var333 == 2) {
                    client.method181(var333);
                }
                var332 = 1;
            } else if (arg0 == 5308) {
                field1258[++Statics.field651 - 1] = Statics.field2494.field1231;
                var332 = 1;
            } else if (arg0 == 5309) {
                int var334 = field1258[--Statics.field651];
                if (var334 == 1 || var334 == 2) {
                    Statics.field2494.field1231 = var334;
                    class81.method2914();
                }
                var332 = 1;
            } else {
                var332 = 2;
            }
            return var332;
        } else if (arg0 < 5600) {
            byte var340;
            if (arg0 == 5504) {
                Statics.field651 -= 2;
                int var338 = field1258[Statics.field651];
                int var339 = field1258[Statics.field651 + 1];
                if (!client.field1098) {
                    client.field933 = var338;
                    client.field934 = var339;
                }
                var340 = 1;
            } else if (arg0 == 5505) {
                field1258[++Statics.field651 - 1] = client.field933;
                var340 = 1;
            } else if (arg0 == 5506) {
                field1258[++Statics.field651 - 1] = client.field934;
                var340 = 1;
            } else if (arg0 == 5530) {
                int var341 = field1258[--Statics.field651];
                if (var341 < 0) {
                    var341 = 0;
                }
                client.field951 = var341;
                var340 = 1;
            } else if (arg0 == 5531) {
                field1258[++Statics.field651 - 1] = client.field951;
                var340 = 1;
            } else {
                var340 = 2;
            }
            return var340;
        } else if (arg0 < 5700) {
            byte var342;
            if (arg0 == 5630) {
                client.field913 = 250;
                var342 = 1;
            } else {
                var342 = 2;
            }
            return var342;
        } else if (arg0 < 6300) {
            return method721(arg0, arg1, arg2);
        } else if (arg0 >= 6600) {
            return arg0 < 6700 ? method83(arg0, arg1, arg2) : 2;
        } else {
            byte var343;
            if (arg0 == 6500) {
                field1258[++Statics.field651 - 1] = class80.method36() ? 1 : 0;
                var343 = 1;
            } else if (arg0 == 6501) {
                class80 var344 = class80.method2742();
                if (var344 == null) {
                    field1258[++Statics.field651 - 1] = -1;
                    field1258[++Statics.field651 - 1] = 0;
                    field1259[++Statics.field355 - 1] = "";
                    field1258[++Statics.field651 - 1] = 0;
                    field1258[++Statics.field651 - 1] = 0;
                    field1259[++Statics.field355 - 1] = "";
                } else {
                    field1258[++Statics.field651 - 1] = var344.field1219;
                    field1258[++Statics.field651 - 1] = var344.field1212;
                    field1259[++Statics.field355 - 1] = var344.field1224;
                    field1258[++Statics.field651 - 1] = var344.field1225;
                    field1258[++Statics.field651 - 1] = var344.field1222;
                    field1259[++Statics.field355 - 1] = var344.field1223;
                }
                var343 = 1;
            } else if (arg0 == 6502) {
                class80 var345 = class80.method4433();
                if (var345 == null) {
                    field1258[++Statics.field651 - 1] = -1;
                    field1258[++Statics.field651 - 1] = 0;
                    field1259[++Statics.field355 - 1] = "";
                    field1258[++Statics.field651 - 1] = 0;
                    field1258[++Statics.field651 - 1] = 0;
                    field1259[++Statics.field355 - 1] = "";
                } else {
                    field1258[++Statics.field651 - 1] = var345.field1219;
                    field1258[++Statics.field651 - 1] = var345.field1212;
                    field1259[++Statics.field355 - 1] = var345.field1224;
                    field1258[++Statics.field651 - 1] = var345.field1225;
                    field1258[++Statics.field651 - 1] = var345.field1222;
                    field1259[++Statics.field355 - 1] = var345.field1223;
                }
                var343 = 1;
            } else if (arg0 == 6506) {
                int var346 = field1258[--Statics.field651];
                class80 var347 = null;
                for (int var348 = 0; var348 < class80.field1216; var348++) {
                    if (Statics.field2694[var348].field1219 == var346) {
                        var347 = Statics.field2694[var348];
                        break;
                    }
                }
                if (var347 == null) {
                    field1258[++Statics.field651 - 1] = -1;
                    field1258[++Statics.field651 - 1] = 0;
                    field1259[++Statics.field355 - 1] = "";
                    field1258[++Statics.field651 - 1] = 0;
                    field1258[++Statics.field651 - 1] = 0;
                    field1259[++Statics.field355 - 1] = "";
                } else {
                    field1258[++Statics.field651 - 1] = var347.field1219;
                    field1258[++Statics.field651 - 1] = var347.field1212;
                    field1259[++Statics.field355 - 1] = var347.field1224;
                    field1258[++Statics.field651 - 1] = var347.field1225;
                    field1258[++Statics.field651 - 1] = var347.field1222;
                    field1259[++Statics.field355 - 1] = var347.field1223;
                }
                var343 = 1;
            } else if (arg0 == 6507) {
                Statics.field651 -= 4;
                int var349 = field1258[Statics.field651];
                boolean var350 = field1258[Statics.field651 + 1] == 1;
                int var351 = field1258[Statics.field651 + 2];
                boolean var352 = field1258[Statics.field651 + 3] == 1;
                if (Statics.field2694 != null) {
                    class80.method3907(0, Statics.field2694.length - 1, var349, var350, var351, var352);
                }
                var343 = 1;
            } else if (arg0 == 6511) {
                int var353 = field1258[--Statics.field651];
                if (var353 >= 0 && var353 < class80.field1216) {
                    class80 var354 = Statics.field2694[var353];
                    field1258[++Statics.field651 - 1] = var354.field1219;
                    field1258[++Statics.field651 - 1] = var354.field1212;
                    field1259[++Statics.field355 - 1] = var354.field1224;
                    field1258[++Statics.field651 - 1] = var354.field1225;
                    field1258[++Statics.field651 - 1] = var354.field1222;
                    field1259[++Statics.field355 - 1] = var354.field1223;
                } else {
                    field1258[++Statics.field651 - 1] = -1;
                    field1258[++Statics.field651 - 1] = 0;
                    field1259[++Statics.field355 - 1] = "";
                    field1258[++Statics.field651 - 1] = 0;
                    field1258[++Statics.field651 - 1] = 0;
                    field1259[++Statics.field355 - 1] = "";
                }
                var343 = 1;
            } else if (arg0 == 6512) {
                client.field997 = field1258[--Statics.field651] == 1;
                var343 = 1;
            } else if (arg0 == 6513) {
                Statics.field651 -= 2;
                int var355 = field1258[Statics.field651];
                int var356 = field1258[Statics.field651 + 1];
                class259 var357 = class259.method3309(var356);
                if (var357.method4245()) {
                    field1259[++Statics.field355 - 1] = class266.method1704(var355).method4457(var356, var357.field3443);
                } else {
                    field1258[++Statics.field651 - 1] = class266.method1704(var355).method4459(var356, var357.field3444);
                }
                var343 = 1;
            } else if (arg0 == 6514) {
                Statics.field651 -= 2;
                int var358 = field1258[Statics.field651];
                int var359 = field1258[Statics.field651 + 1];
                class259 var360 = class259.method3309(var359);
                if (var360.method4245()) {
                    field1259[++Statics.field355 - 1] = class263.method190(var358).method4339(var359, var360.field3443);
                } else {
                    field1258[++Statics.field651 - 1] = class263.method190(var358).method4348(var359, var360.field3444);
                }
                var343 = 1;
            } else if (arg0 == 6515) {
                Statics.field651 -= 2;
                int var361 = field1258[Statics.field651];
                int var362 = field1258[Statics.field651 + 1];
                class259 var363 = class259.method3309(var362);
                if (var363.method4245()) {
                    field1259[++Statics.field355 - 1] = class264.method4124(var361).method4395(var362, var363.field3443);
                } else {
                    field1258[++Statics.field651 - 1] = class264.method4124(var361).method4394(var362, var363.field3444);
                }
                var343 = 1;
            } else if (arg0 == 6516) {
                Statics.field651 -= 2;
                int var364 = field1258[Statics.field651];
                int var365 = field1258[Statics.field651 + 1];
                class259 var366 = class259.method3309(var365);
                if (var366.method4245()) {
                    String[] var367 = field1259;
                    int var368 = ++Statics.field355 - 1;
                    class260 var369 = (class260) class260.field3449.method3419((long) var364);
                    class260 var370;
                    if (var369 == null) {
                        byte[] var371 = Statics.field3448.method3930(34, var364);
                        class260 var372 = new class260();
                        if (var371 != null) {
                            var372.method4271(new class181(var371));
                        }
                        var372.method4278();
                        class260.field3449.method3418(var372, (long) var364);
                        var370 = var372;
                    } else {
                        var370 = var369;
                    }
                    var367[var368] = var370.method4274(var365, var366.field3443);
                } else {
                    int[] var373 = field1258;
                    int var374 = ++Statics.field651 - 1;
                    class260 var375 = (class260) class260.field3449.method3419((long) var364);
                    class260 var376;
                    if (var375 == null) {
                        byte[] var377 = Statics.field3448.method3930(34, var364);
                        class260 var378 = new class260();
                        if (var377 != null) {
                            var378.method4271(new class181(var377));
                        }
                        var378.method4278();
                        class260.field3449.method3418(var378, (long) var364);
                        var376 = var378;
                    } else {
                        var376 = var375;
                    }
                    var373[var374] = var376.method4268(var365, var366.field3444);
                }
                var343 = 1;
            } else if (arg0 == 6518) {
                field1258[++Statics.field651 - 1] = 0;
                var343 = 1;
            } else if (arg0 == 6520) {
                var343 = 1;
            } else if (arg0 == 6521) {
                var343 = 1;
            } else {
                var343 = 2;
            }
            return var343;
        }
    }

    @ObfuscatedName("ao.j(ILcw;ZI)I")
    public static int method226(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field651 -= 3;
            int var3 = field1258[Statics.field651];
            int var4 = field1258[Statics.field651 + 1];
            int var5 = field1258[Statics.field651 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class224 var6 = class224.method1468(var3);
            if (var6.field2856 == null) {
                var6.field2856 = new class224[var5 + 1];
            }
            if (var6.field2856.length <= var5) {
                class224[] var7 = new class224[var5 + 1];
                for (int var8 = 0; var8 < var6.field2856.length; var8++) {
                    var7[var8] = var6.field2856[var8];
                }
                var6.field2856 = var7;
            }
            if (var5 > 0 && var6.field2856[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class224 var9 = new class224();
            var9.field2809 = var4;
            var9.field2746 = var9.field2764 = var6.field2764;
            var9.field2728 = var5;
            var9.field2857 = true;
            var6.field2856[var5] = var9;
            if (arg2) {
                Statics.field3790 = var9;
            } else {
                Statics.field769 = var9;
            }
            client.method353(var6);
            return 1;
        } else if (arg0 == 101) {
            class224 var10 = arg2 ? Statics.field3790 : Statics.field769;
            class224 var11 = class224.method1468(var10.field2764);
            var11.field2856[var10.field2728] = null;
            client.method353(var11);
            return 1;
        } else if (arg0 == 102) {
            class224 var12 = class224.method1468(field1258[--Statics.field651]);
            var12.field2856 = null;
            client.method353(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field651 -= 2;
            int var13 = field1258[Statics.field651];
            int var14 = field1258[Statics.field651 + 1];
            class224 var15 = class224.method3325(var13, var14);
            if (var15 == null || var14 == -1) {
                field1258[++Statics.field651 - 1] = 0;
            } else {
                field1258[++Statics.field651 - 1] = 1;
                if (arg2) {
                    Statics.field3790 = var15;
                } else {
                    Statics.field769 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class224 var16 = class224.method1468(field1258[--Statics.field651]);
            if (var16 == null) {
                field1258[++Statics.field651 - 1] = 0;
            } else {
                field1258[++Statics.field651 - 1] = 1;
                if (arg2) {
                    Statics.field3790 = var16;
                } else {
                    Statics.field769 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cj.v(ILcw;ZI)I")
    public static int method1639(int arg0, class98 arg1, boolean arg2) {
        int var3 = -1;
        class224 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1258[--Statics.field651];
            var4 = class224.method1468(var3);
        } else {
            var4 = arg2 ? Statics.field3790 : Statics.field769;
        }
        if (arg0 == 1000) {
            Statics.field651 -= 4;
            var4.field2818 = field1258[Statics.field651];
            var4.field2758 = field1258[Statics.field651 + 1];
            var4.field2732 = field1258[Statics.field651 + 2];
            var4.field2733 = field1258[Statics.field651 + 3];
            client.method353(var4);
            Statics.field247.method1128(var4);
            if (var3 != -1 && var4.field2809 == 0) {
                client.method169(Statics.field3299[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field651 -= 4;
            var4.field2726 = field1258[Statics.field651];
            var4.field2739 = field1258[Statics.field651 + 1];
            var4.field2835 = field1258[Statics.field651 + 2];
            var4.field2735 = field1258[Statics.field651 + 3];
            client.method353(var4);
            Statics.field247.method1128(var4);
            if (var3 != -1 && var4.field2809 == 0) {
                client.method169(Statics.field3299[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1258[--Statics.field651] == 1;
            if (var4.field2747 != var5) {
                var4.field2747 = var5;
                client.method353(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2860 = field1258[--Statics.field651] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2734 = field1258[--Statics.field651] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ic.x(ILcw;ZI)I")
    public static int method4076(int arg0, class98 arg1, boolean arg2) {
        int var3 = -1;
        class224 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1258[--Statics.field651];
            var4 = class224.method1468(var3);
        } else {
            var4 = arg2 ? Statics.field3790 : Statics.field769;
        }
        if (arg0 == 1100) {
            Statics.field651 -= 2;
            var4.field2748 = field1258[Statics.field651];
            if (var4.field2748 > var4.field2823 - var4.field2742) {
                var4.field2748 = var4.field2823 - var4.field2742;
            }
            if (var4.field2748 < 0) {
                var4.field2748 = 0;
            }
            var4.field2749 = field1258[Statics.field651 + 1];
            if (var4.field2749 > var4.field2751 - var4.field2775) {
                var4.field2749 = var4.field2751 - var4.field2775;
            }
            if (var4.field2749 < 0) {
                var4.field2749 = 0;
            }
            client.method353(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2752 = field1258[--Statics.field651];
            client.method353(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2815 = field1258[--Statics.field651] == 1;
            client.method353(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2727 = field1258[--Statics.field651];
            client.method353(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2760 = field1258[--Statics.field651];
            client.method353(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2762 = field1258[--Statics.field651];
            client.method353(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2716 = field1258[--Statics.field651];
            client.method353(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2765 = field1258[--Statics.field651] == 1;
            client.method353(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2770 = 1;
            var4.field2771 = field1258[--Statics.field651];
            client.method353(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field651 -= 6;
            var4.field2776 = field1258[Statics.field651];
            var4.field2769 = field1258[Statics.field651 + 1];
            var4.field2855 = field1258[Statics.field651 + 2];
            var4.field2779 = field1258[Statics.field651 + 3];
            var4.field2780 = field1258[Statics.field651 + 4];
            var4.field2781 = field1258[Statics.field651 + 5];
            client.method353(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1258[--Statics.field651];
            if (var4.field2774 != var5) {
                var4.field2774 = var5;
                var4.field2738 = 0;
                var4.field2850 = 0;
                client.method353(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2784 = field1258[--Statics.field651] == 1;
            client.method353(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1259[--Statics.field355];
            if (!var6.equals(var4.field2787)) {
                var4.field2787 = var6;
                client.method353(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2858 = field1258[--Statics.field651];
            client.method353(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field651 -= 3;
            var4.field2854 = field1258[Statics.field651];
            var4.field2753 = field1258[Statics.field651 + 1];
            var4.field2789 = field1258[Statics.field651 + 2];
            client.method353(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2714 = field1258[--Statics.field651] == 1;
            client.method353(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2778 = field1258[--Statics.field651];
            client.method353(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2767 = field1258[--Statics.field651];
            client.method353(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2768 = field1258[--Statics.field651] == 1;
            client.method353(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2763 = field1258[--Statics.field651] == 1;
            client.method353(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field651 -= 2;
            var4.field2823 = field1258[Statics.field651];
            var4.field2751 = field1258[Statics.field651 + 1];
            client.method353(var4);
            if (var3 != -1 && var4.field2809 == 0) {
                client.method169(Statics.field3299[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method500(var4.field2764, var4.field2728);
            client.field1014 = var4;
            client.method353(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2861 = field1258[--Statics.field651];
            client.method353(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2754 = field1258[--Statics.field651];
            client.method353(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2759 = field1258[--Statics.field651];
            client.method353(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1258[--Statics.field651];
            class293[] var8 = new class293[] { class293.field3825, class293.field3827, class293.field3823, class293.field3826, class293.field3824 };
            class293 var9 = (class293) class176.method676(var8, var7);
            if (var9 != null) {
                var4.field2757 = var9;
                client.method353(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var10 = field1258[--Statics.field651] == 1;
            var4.field2761 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("an.e(ILcw;ZB)I")
    public static int method503(int arg0, class98 arg1, boolean arg2) {
        class224 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class224.method1468(field1258[--Statics.field651]);
        } else {
            var3 = arg2 ? Statics.field3790 : Statics.field769;
        }
        client.method353(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field651 -= 2;
            int var4 = field1258[Statics.field651];
            int var5 = field1258[Statics.field651 + 1];
            var3.field2829 = var4;
            var3.field2848 = var5;
            class264 var6 = class264.method4124(var4);
            var3.field2855 = var6.field3557;
            var3.field2779 = var6.field3556;
            var3.field2780 = var6.field3569;
            var3.field2776 = var6.field3560;
            var3.field2769 = var6.field3592;
            var3.field2781 = var6.field3547;
            if (arg0 == 1205) {
                var3.field2785 = 0;
            } else if (arg0 == 1212 | var6.field3559 == 1) {
                var3.field2785 = 1;
            } else {
                var3.field2785 = 2;
            }
            if (var3.field2782 > 0) {
                var3.field2781 = var3.field2781 * 32 / var3.field2782;
            } else if (var3.field2726 > 0) {
                var3.field2781 = var3.field2781 * 32 / var3.field2726;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2770 = 2;
            var3.field2771 = field1258[--Statics.field651];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2770 = 3;
            var3.field2771 = Statics.field601.field833.method3787();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fg.l(ILcw;ZB)I")
    public static int method2922(int arg0, class98 arg1, boolean arg2) {
        class224 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class224.method1468(field1258[--Statics.field651]);
        } else {
            var3 = arg2 ? Statics.field3790 : Statics.field769;
        }
        if (arg0 == 1300) {
            int var4 = field1258[--Statics.field651] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3839(var4, field1259[--Statics.field355]);
                return 1;
            } else {
                Statics.field355--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field651 -= 2;
            int var5 = field1258[Statics.field651];
            int var6 = field1258[Statics.field651 + 1];
            var3.field2828 = class224.method3325(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2805 = field1258[--Statics.field651] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2790 = field1258[--Statics.field651];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2804 = field1258[--Statics.field651];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2800 = field1259[--Statics.field355];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2806 = field1259[--Statics.field355];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2801 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.b(ILcw;ZI)I")
    public static int method1056(int arg0, class98 arg1, boolean arg2) {
        class224 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class224.method1468(field1258[--Statics.field651]);
        } else {
            var3 = arg2 ? Statics.field3790 : Statics.field769;
        }
        String var4 = field1259[--Statics.field355];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1258[--Statics.field651];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1258[--Statics.field651];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1259[--Statics.field355];
            } else {
                var7[var8] = Integer.valueOf(field1258[--Statics.field651]);
            }
        }
        int var9 = field1258[--Statics.field651];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2847 = var7;
        } else if (arg0 == 1401) {
            var3.field2812 = var7;
        } else if (arg0 == 1402) {
            var3.field2811 = var7;
        } else if (arg0 == 1403) {
            var3.field2766 = var7;
        } else if (arg0 == 1404) {
            var3.field2837 = var7;
        } else if (arg0 == 1405) {
            var3.field2817 = var7;
        } else if (arg0 == 1406) {
            var3.field2819 = var7;
        } else if (arg0 == 1407) {
            var3.field2820 = var7;
            var3.field2821 = var5;
        } else if (arg0 == 1408) {
            var3.field2826 = var7;
        } else if (arg0 == 1409) {
            var3.field2827 = var7;
        } else if (arg0 == 1410) {
            var3.field2744 = var7;
        } else if (arg0 == 1411) {
            var3.field2756 = var7;
        } else if (arg0 == 1412) {
            var3.field2814 = var7;
        } else if (arg0 == 1414) {
            var3.field2822 = var7;
            var3.field2813 = var5;
        } else if (arg0 == 1415) {
            var3.field2824 = var7;
            var3.field2825 = var5;
        } else if (arg0 == 1416) {
            var3.field2832 = var7;
        } else if (arg0 == 1417) {
            var3.field2816 = var7;
        } else if (arg0 == 1418) {
            var3.field2743 = var7;
        } else if (arg0 == 1419) {
            var3.field2830 = var7;
        } else if (arg0 == 1420) {
            var3.field2831 = var7;
        } else if (arg0 == 1421) {
            var3.field2799 = var7;
        } else if (arg0 == 1422) {
            var3.field2833 = var7;
        } else if (arg0 == 1423) {
            var3.field2834 = var7;
        } else if (arg0 == 1424) {
            var3.field2722 = var7;
        } else if (arg0 == 1425) {
            var3.field2851 = var7;
        } else if (arg0 == 1426) {
            var3.field2838 = var7;
        } else if (arg0 == 1427) {
            var3.field2836 = var7;
        } else {
            return 2;
        }
        var3.field2750 = true;
        return 1;
    }

    @ObfuscatedName("h.n(ILcw;ZI)I")
    public static int method113(int arg0, class98 arg1, boolean arg2) {
        class224 var3 = arg2 ? Statics.field3790 : Statics.field769;
        if (arg0 == 1700) {
            field1258[++Statics.field651 - 1] = var3.field2829;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2829 == -1) {
                field1258[++Statics.field651 - 1] = 0;
            } else {
                field1258[++Statics.field651 - 1] = var3.field2848;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1258[++Statics.field651 - 1] = var3.field2728;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ej.c(ILcw;ZI)I")
    public static int method2547(int arg0, class98 arg1, boolean arg2) {
        class224 var3 = arg2 ? Statics.field3790 : Statics.field769;
        if (arg0 == 1800) {
            field1258[++Statics.field651 - 1] = class225.method1601(client.method1528(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1258[--Statics.field651];
            int var5 = var4 - 1;
            if (var3.field2801 == null || var5 >= var3.field2801.length || var3.field2801[var5] == null) {
                field1259[++Statics.field355 - 1] = "";
            } else {
                field1259[++Statics.field355 - 1] = var3.field2801[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2800 == null) {
                field1259[++Statics.field355 - 1] = "";
            } else {
                field1259[++Statics.field355 - 1] = var3.field2800;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hr.a(ILcw;ZS)I")
    public static int method3742(int arg0, class98 arg1, boolean arg2) {
        class224 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class224.method1468(field1258[--Statics.field651]);
        } else {
            var3 = arg2 ? Statics.field3790 : Statics.field769;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1264 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2836 == null) {
            return 0;
        } else {
            class69 var4 = new class69();
            var4.field795 = var3;
            var4.field792 = var3.field2836;
            var4.field785 = field1264 + 1;
            client.field1049.method3480(var4);
            return 1;
        }
    }

    @ObfuscatedName("w.y(ILcw;ZI)I")
    public static int method68(int arg0, class98 arg1, boolean arg2) {
        class224 var3 = class224.method1468(field1258[--Statics.field651]);
        if (arg0 == 2500) {
            field1258[++Statics.field651 - 1] = var3.field2740;
            return 1;
        } else if (arg0 == 2501) {
            field1258[++Statics.field651 - 1] = var3.field2741;
            return 1;
        } else if (arg0 == 2502) {
            field1258[++Statics.field651 - 1] = var3.field2742;
            return 1;
        } else if (arg0 == 2503) {
            field1258[++Statics.field651 - 1] = var3.field2775;
            return 1;
        } else if (arg0 == 2504) {
            field1258[++Statics.field651 - 1] = var3.field2747 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1258[++Statics.field651 - 1] = var3.field2746;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("av.w(ILcw;ZI)I")
    public static int method354(int arg0, class98 arg1, boolean arg2) {
        class224 var3 = class224.method1468(field1258[--Statics.field651]);
        if (arg0 == 2800) {
            field1258[++Statics.field651 - 1] = class225.method1601(client.method1528(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1258[--Statics.field651];
            int var5 = var4 - 1;
            if (var3.field2801 == null || var5 >= var3.field2801.length || var3.field2801[var5] == null) {
                field1259[++Statics.field355 - 1] = "";
            } else {
                field1259[++Statics.field355 - 1] = var3.field2801[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2800 == null) {
                field1259[++Statics.field355 - 1] = "";
            } else {
                field1259[++Statics.field355 - 1] = var3.field2800;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gv.k(ILcw;ZI)I")
    public static int method3329(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field651 -= 2;
            int var3 = field1258[Statics.field651];
            int var4 = field1258[Statics.field651 + 1];
            field1258[++Statics.field651 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field651 -= 2;
            int var5 = field1258[Statics.field651];
            int var6 = field1258[Statics.field651 + 1];
            field1258[++Statics.field651 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field651 -= 2;
            int var7 = field1258[Statics.field651];
            int var8 = field1258[Statics.field651 + 1];
            field1258[++Statics.field651 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field651 -= 2;
            int var9 = field1258[Statics.field651];
            int var10 = field1258[Statics.field651 + 1];
            field1258[++Statics.field651 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1258[--Statics.field651];
            field1258[++Statics.field651 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1258[--Statics.field651];
            field1258[++Statics.field651 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field651 -= 5;
            int var13 = field1258[Statics.field651];
            int var14 = field1258[Statics.field651 + 1];
            int var15 = field1258[Statics.field651 + 2];
            int var16 = field1258[Statics.field651 + 3];
            int var17 = field1258[Statics.field651 + 4];
            field1258[++Statics.field651 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field651 -= 2;
            int var18 = field1258[Statics.field651];
            int var19 = field1258[Statics.field651 + 1];
            field1258[++Statics.field651 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field651 -= 2;
            int var20 = field1258[Statics.field651];
            int var21 = field1258[Statics.field651 + 1];
            field1258[++Statics.field651 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field651 -= 2;
            int var22 = field1258[Statics.field651];
            int var23 = field1258[Statics.field651 + 1];
            field1258[++Statics.field651 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field651 -= 2;
            int var24 = field1258[Statics.field651];
            int var25 = field1258[Statics.field651 + 1];
            field1258[++Statics.field651 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field651 -= 2;
            int var26 = field1258[Statics.field651];
            int var27 = field1258[Statics.field651 + 1];
            field1258[++Statics.field651 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field651 -= 2;
            int var28 = field1258[Statics.field651];
            int var29 = field1258[Statics.field651 + 1];
            if (var28 == 0) {
                field1258[++Statics.field651 - 1] = 0;
            } else {
                field1258[++Statics.field651 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field651 -= 2;
            int var30 = field1258[Statics.field651];
            int var31 = field1258[Statics.field651 + 1];
            if (var30 == 0) {
                field1258[++Statics.field651 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1258[++Statics.field651 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1258[++Statics.field651 - 1] = var30;
                    break;
                case 2:
                    field1258[++Statics.field651 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1258[++Statics.field651 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1258[++Statics.field651 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1258[++Statics.field651 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field651 -= 2;
            int var32 = field1258[Statics.field651];
            int var33 = field1258[Statics.field651 + 1];
            field1258[++Statics.field651 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field651 -= 2;
            int var34 = field1258[Statics.field651];
            int var35 = field1258[Statics.field651 + 1];
            field1258[++Statics.field651 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field651 -= 3;
            long var36 = (long) field1258[Statics.field651];
            long var38 = (long) field1258[Statics.field651 + 1];
            long var40 = (long) field1258[Statics.field651 + 2];
            field1258[++Statics.field651 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("b.t(ILcw;ZI)I")
    public static int method40(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1258[++Statics.field651 - 1] = client.field1058;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field651 -= 3;
            client.field1058 = field1258[Statics.field651];
            Statics.field2433 = class286.method4099(field1258[Statics.field651 + 1]);
            if (Statics.field2433 == null) {
                Statics.field2433 = class286.field3794;
            }
            client.field906 = field1258[Statics.field651 + 2];
            class171 var3 = class171.method1482(class168.field2343, client.field953.field1479);
            var3.field2424.method2996(client.field1058);
            var3.field2424.method2996(Statics.field2433.field3786);
            var3.field2424.method2996(client.field906);
            client.field953.method1783(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1259[--Statics.field355];
            Statics.field651 -= 2;
            int var5 = field1258[Statics.field651];
            int var6 = field1258[Statics.field651 + 1];
            class171 var7 = class171.method1482(class168.field2389, client.field953.field1479);
            var7.field2424.method2996(class181.method1683(var4) + 2);
            var7.field2424.method3003(var4);
            var7.field2424.method2996(var5 - 1);
            var7.field2424.method2996(var6);
            client.field953.method1783(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field651 -= 2;
            int var8 = field1258[Statics.field651];
            int var9 = field1258[Statics.field651 + 1];
            class100 var10 = (class100) class97.field1435.get(var8);
            class72 var11 = var10.method1772(var9);
            if (var11 == null) {
                field1258[++Statics.field651 - 1] = -1;
                field1258[++Statics.field651 - 1] = 0;
                field1259[++Statics.field355 - 1] = "";
                field1259[++Statics.field355 - 1] = "";
                field1259[++Statics.field355 - 1] = "";
            } else {
                field1258[++Statics.field651 - 1] = var11.field823;
                field1258[++Statics.field651 - 1] = var11.field815;
                field1259[++Statics.field355 - 1] = var11.field814 == null ? "" : var11.field814;
                field1259[++Statics.field355 - 1] = var11.field818 == null ? "" : var11.field818;
                field1259[++Statics.field355 - 1] = var11.field819 == null ? "" : var11.field819;
            }
            return 1;
        } else if (arg0 == 5004) {
            int var13 = field1258[--Statics.field651];
            class72 var14 = (class72) class97.field1434.method3389((long) var13);
            if (var14 == null) {
                field1258[++Statics.field651 - 1] = -1;
                field1258[++Statics.field651 - 1] = 0;
                field1259[++Statics.field355 - 1] = "";
                field1259[++Statics.field355 - 1] = "";
                field1259[++Statics.field355 - 1] = "";
            } else {
                field1258[++Statics.field651 - 1] = var14.field817;
                field1258[++Statics.field651 - 1] = var14.field815;
                field1259[++Statics.field355 - 1] = var14.field814 == null ? "" : var14.field814;
                field1259[++Statics.field355 - 1] = var14.field818 == null ? "" : var14.field818;
                field1259[++Statics.field355 - 1] = var14.field819 == null ? "" : var14.field819;
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field2433 == null) {
                field1258[++Statics.field651 - 1] = -1;
            } else {
                field1258[++Statics.field651 - 1] = Statics.field2433.field3786;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var16 = field1259[--Statics.field355];
            int var17 = field1258[--Statics.field651];
            String var18 = var16.toLowerCase();
            byte var19 = 0;
            if (var18.startsWith(class233.field3099)) {
                var19 = 0;
                var16 = var16.substring(class233.field3099.length());
            } else if (var18.startsWith(class233.field3101)) {
                var19 = 1;
                var16 = var16.substring(class233.field3101.length());
            } else if (var18.startsWith(class233.field2926)) {
                var19 = 2;
                var16 = var16.substring(class233.field2926.length());
            } else if (var18.startsWith(class233.field3025)) {
                var19 = 3;
                var16 = var16.substring(class233.field3025.length());
            } else if (var18.startsWith(class233.field3107)) {
                var19 = 4;
                var16 = var16.substring(class233.field3107.length());
            } else if (var18.startsWith(class233.field3109)) {
                var19 = 5;
                var16 = var16.substring(class233.field3109.length());
            } else if (var18.startsWith(class233.field3111)) {
                var19 = 6;
                var16 = var16.substring(class233.field3111.length());
            } else if (var18.startsWith(class233.field3113)) {
                var19 = 7;
                var16 = var16.substring(class233.field3113.length());
            } else if (var18.startsWith(class233.field3115)) {
                var19 = 8;
                var16 = var16.substring(class233.field3115.length());
            } else if (var18.startsWith(class233.field3117)) {
                var19 = 9;
                var16 = var16.substring(class233.field3117.length());
            } else if (var18.startsWith(class233.field3119)) {
                var19 = 10;
                var16 = var16.substring(class233.field3119.length());
            } else if (var18.startsWith(class233.field3121)) {
                var19 = 11;
                var16 = var16.substring(class233.field3121.length());
            } else if (client.field1061 != 0) {
                if (var18.startsWith(class233.field2976)) {
                    var19 = 0;
                    var16 = var16.substring(class233.field2976.length());
                } else if (var18.startsWith(class233.field3003)) {
                    var19 = 1;
                    var16 = var16.substring(class233.field3003.length());
                } else if (var18.startsWith(class233.field3104)) {
                    var19 = 2;
                    var16 = var16.substring(class233.field3104.length());
                } else if (var18.startsWith(class233.field3005)) {
                    var19 = 3;
                    var16 = var16.substring(class233.field3005.length());
                } else if (var18.startsWith(class233.field3155)) {
                    var19 = 4;
                    var16 = var16.substring(class233.field3155.length());
                } else if (var18.startsWith(class233.field3110)) {
                    var19 = 5;
                    var16 = var16.substring(class233.field3110.length());
                } else if (var18.startsWith(class233.field2957)) {
                    var19 = 6;
                    var16 = var16.substring(class233.field2957.length());
                } else if (var18.startsWith(class233.field3114)) {
                    var19 = 7;
                    var16 = var16.substring(class233.field3114.length());
                } else if (var18.startsWith(class233.field3116)) {
                    var19 = 8;
                    var16 = var16.substring(class233.field3116.length());
                } else if (var18.startsWith(class233.field3118)) {
                    var19 = 9;
                    var16 = var16.substring(class233.field3118.length());
                } else if (var18.startsWith(class233.field3120)) {
                    var19 = 10;
                    var16 = var16.substring(class233.field3120.length());
                } else if (var18.startsWith(class233.field3021)) {
                    var19 = 11;
                    var16 = var16.substring(class233.field3021.length());
                }
            }
            String var20 = var16.toLowerCase();
            byte var21 = 0;
            if (var20.startsWith(class233.field3145)) {
                var21 = 1;
                var16 = var16.substring(class233.field3145.length());
            } else if (var20.startsWith(class233.field3135)) {
                var21 = 2;
                var16 = var16.substring(class233.field3135.length());
            } else if (var20.startsWith(class233.field3127)) {
                var21 = 3;
                var16 = var16.substring(class233.field3127.length());
            } else if (var20.startsWith(class233.field3129)) {
                var21 = 4;
                var16 = var16.substring(class233.field3129.length());
            } else if (var20.startsWith(class233.field3131)) {
                var21 = 5;
                var16 = var16.substring(class233.field3131.length());
            } else if (client.field1061 != 0) {
                if (var20.startsWith(class233.field3124)) {
                    var21 = 1;
                    var16 = var16.substring(class233.field3124.length());
                } else if (var20.startsWith(class233.field3126)) {
                    var21 = 2;
                    var16 = var16.substring(class233.field3126.length());
                } else if (var20.startsWith(class233.field3128)) {
                    var21 = 3;
                    var16 = var16.substring(class233.field3128.length());
                } else if (var20.startsWith(class233.field3130)) {
                    var21 = 4;
                    var16 = var16.substring(class233.field3130.length());
                } else if (var20.startsWith(class233.field3132)) {
                    var21 = 5;
                    var16 = var16.substring(class233.field3132.length());
                }
            }
            class171 var22 = class171.method1482(class168.field2400, client.field953.field1479);
            var22.field2424.method2996(0);
            int var23 = var22.field2424.field2498;
            var22.field2424.method2996(var17);
            var22.field2424.method2996(var19);
            var22.field2424.method2996(var21);
            class187 var24 = var22.field2424;
            int var25 = var24.field2498;
            int var26 = var16.length();
            byte[] var27 = new byte[var26];
            for (int var28 = 0; var28 < var26; var28++) {
                char var29 = var16.charAt(var28);
                if (!(var29 <= 0 || var29 >= 128) || !(var29 < 160 || var29 > 255)) {
                    var27[var28] = (byte) var29;
                } else if (var29 == 8364) {
                    var27[var28] = -128;
                } else if (var29 == 8218) {
                    var27[var28] = -126;
                } else if (var29 == 402) {
                    var27[var28] = -125;
                } else if (var29 == 8222) {
                    var27[var28] = -124;
                } else if (var29 == 8230) {
                    var27[var28] = -123;
                } else if (var29 == 8224) {
                    var27[var28] = -122;
                } else if (var29 == 8225) {
                    var27[var28] = -121;
                } else if (var29 == 710) {
                    var27[var28] = -120;
                } else if (var29 == 8240) {
                    var27[var28] = -119;
                } else if (var29 == 352) {
                    var27[var28] = -118;
                } else if (var29 == 8249) {
                    var27[var28] = -117;
                } else if (var29 == 338) {
                    var27[var28] = -116;
                } else if (var29 == 381) {
                    var27[var28] = -114;
                } else if (var29 == 8216) {
                    var27[var28] = -111;
                } else if (var29 == 8217) {
                    var27[var28] = -110;
                } else if (var29 == 8220) {
                    var27[var28] = -109;
                } else if (var29 == 8221) {
                    var27[var28] = -108;
                } else if (var29 == 8226) {
                    var27[var28] = -107;
                } else if (var29 == 8211) {
                    var27[var28] = -106;
                } else if (var29 == 8212) {
                    var27[var28] = -105;
                } else if (var29 == 732) {
                    var27[var28] = -104;
                } else if (var29 == 8482) {
                    var27[var28] = -103;
                } else if (var29 == 353) {
                    var27[var28] = -102;
                } else if (var29 == 8250) {
                    var27[var28] = -101;
                } else if (var29 == 339) {
                    var27[var28] = -100;
                } else if (var29 == 382) {
                    var27[var28] = -98;
                } else if (var29 == 376) {
                    var27[var28] = -97;
                } else {
                    var27[var28] = 63;
                }
            }
            var24.method3157(var27.length);
            var24.field2498 += Statics.field3718.method2940(var27, 0, var27.length, var24.field2499, var24.field2498);
            var22.field2424.method3014(var22.field2424.field2498 - var23);
            client.field953.method1783(var22);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field355 -= 2;
            String var32 = field1259[Statics.field355];
            String var33 = field1259[Statics.field355 + 1];
            class171 var34 = class171.method1482(class168.field2337, client.field953.field1479);
            var34.field2424.method2997(0);
            int var35 = var34.field2424.field2498;
            var34.field2424.method3003(var32);
            class187 var36 = var34.field2424;
            int var37 = var36.field2498;
            int var38 = var33.length();
            byte[] var39 = new byte[var38];
            for (int var40 = 0; var40 < var38; var40++) {
                char var41 = var33.charAt(var40);
                if (var41 > 0 && var41 < 128 || var41 >= 160 && var41 <= 255) {
                    var39[var40] = (byte) var41;
                } else if (var41 == 8364) {
                    var39[var40] = -128;
                } else if (var41 == 8218) {
                    var39[var40] = -126;
                } else if (var41 == 402) {
                    var39[var40] = -125;
                } else if (var41 == 8222) {
                    var39[var40] = -124;
                } else if (var41 == 8230) {
                    var39[var40] = -123;
                } else if (var41 == 8224) {
                    var39[var40] = -122;
                } else if (var41 == 8225) {
                    var39[var40] = -121;
                } else if (var41 == 710) {
                    var39[var40] = -120;
                } else if (var41 == 8240) {
                    var39[var40] = -119;
                } else if (var41 == 352) {
                    var39[var40] = -118;
                } else if (var41 == 8249) {
                    var39[var40] = -117;
                } else if (var41 == 338) {
                    var39[var40] = -116;
                } else if (var41 == 381) {
                    var39[var40] = -114;
                } else if (var41 == 8216) {
                    var39[var40] = -111;
                } else if (var41 == 8217) {
                    var39[var40] = -110;
                } else if (var41 == 8220) {
                    var39[var40] = -109;
                } else if (var41 == 8221) {
                    var39[var40] = -108;
                } else if (var41 == 8226) {
                    var39[var40] = -107;
                } else if (var41 == 8211) {
                    var39[var40] = -106;
                } else if (var41 == 8212) {
                    var39[var40] = -105;
                } else if (var41 == 732) {
                    var39[var40] = -104;
                } else if (var41 == 8482) {
                    var39[var40] = -103;
                } else if (var41 == 353) {
                    var39[var40] = -102;
                } else if (var41 == 8250) {
                    var39[var40] = -101;
                } else if (var41 == 339) {
                    var39[var40] = -100;
                } else if (var41 == 382) {
                    var39[var40] = -98;
                } else if (var41 == 376) {
                    var39[var40] = -97;
                } else {
                    var39[var40] = 63;
                }
            }
            var36.method3157(var39.length);
            var36.field2498 += Statics.field3718.method2940(var39, 0, var39.length, var36.field2499, var36.field2498);
            var34.field2424.method3137(var34.field2424.field2498 - var35);
            client.field953.method1783(var34);
            return 1;
        } else if (arg0 == 5015) {
            String var44;
            if (Statics.field601 == null || Statics.field601.field852 == null) {
                var44 = "";
            } else {
                var44 = Statics.field601.field852;
            }
            field1259[++Statics.field355 - 1] = var44;
            return 1;
        } else if (arg0 == 5016) {
            field1258[++Statics.field651 - 1] = client.field906;
            return 1;
        } else if (arg0 == 5017) {
            int var45 = field1258[--Statics.field651];
            field1258[++Statics.field651 - 1] = class97.method2751(var45);
            return 1;
        } else if (arg0 == 5018) {
            int var46 = field1258[--Statics.field651];
            int[] var47 = field1258;
            int var48 = ++Statics.field651 - 1;
            class72 var49 = (class72) class97.field1434.method3389((long) var46);
            int var50;
            if (var49 == null) {
                var50 = -1;
            } else if (class97.field1428.field2582 == var49.field2567) {
                var50 = -1;
            } else {
                var50 = ((class72) var49.field2567).field823;
            }
            var47[var48] = var50;
            return 1;
        } else if (arg0 == 5019) {
            int var51 = field1258[--Statics.field651];
            field1258[++Statics.field651 - 1] = class97.method222(var51);
            return 1;
        } else if (arg0 == 5020) {
            String var52 = field1259[--Statics.field355];
            client.method4542(var52);
            return 1;
        } else if (arg0 == 5021) {
            client.field1015 = field1259[--Statics.field355].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1259[++Statics.field355 - 1] = client.field1015;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ar.h(ILcw;ZB)I")
    public static int method721(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field651 -= 2;
            client.field1104 = (short) field1258[Statics.field651];
            if (client.field1104 <= 0) {
                client.field1104 = 256;
            }
            client.field1105 = (short) field1258[Statics.field651 + 1];
            if (client.field1105 <= 0) {
                client.field1105 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field651 -= 2;
            client.field1106 = (short) field1258[Statics.field651];
            if (client.field1106 <= 0) {
                client.field1106 = 256;
            }
            client.field1107 = (short) field1258[Statics.field651 + 1];
            if (client.field1107 <= 0) {
                client.field1107 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field651 -= 4;
            client.field1108 = (short) field1258[Statics.field651];
            if (client.field1108 <= 0) {
                client.field1108 = 1;
            }
            client.field912 = (short) field1258[Statics.field651 + 1];
            if (client.field912 <= 0) {
                client.field912 = 32767;
            } else if (client.field912 < client.field1108) {
                client.field912 = client.field1108;
            }
            client.field882 = (short) field1258[Statics.field651 + 2];
            if (client.field882 <= 0) {
                client.field882 = 1;
            }
            client.field1109 = (short) field1258[Statics.field651 + 3];
            if (client.field1109 <= 0) {
                client.field1109 = 32767;
            } else if (client.field1109 < client.field882) {
                client.field1109 = client.field882;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field924 == null) {
                field1258[++Statics.field651 - 1] = -1;
                field1258[++Statics.field651 - 1] = -1;
            } else {
                client.method2973(0, 0, client.field924.field2742, client.field924.field2775, false);
                field1258[++Statics.field651 - 1] = client.field1114;
                field1258[++Statics.field651 - 1] = client.field1115;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1258[++Statics.field651 - 1] = client.field1106;
            field1258[++Statics.field651 - 1] = client.field1107;
            return 1;
        } else if (arg0 == 6205) {
            field1258[++Statics.field651 - 1] = client.field1104;
            field1258[++Statics.field651 - 1] = client.field1105;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.u(ILcw;ZI)I")
    public static int method83(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field801;
            int var4 = (Statics.field601.field1188 >> 7) + Statics.field1709;
            int var5 = (Statics.field601.field1145 >> 7) + Statics.field1710;
            client.method14().method5110(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1258[--Statics.field651];
            String var7 = "";
            class33 var8 = client.method14().method5052(var6);
            if (var8 != null) {
                var7 = var8.method269();
            }
            field1259[++Statics.field355 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1258[--Statics.field651];
            client.method14().method5037(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1258[++Statics.field651 - 1] = client.method14().method5061();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1258[--Statics.field651];
            client.method14().method5046(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1258[++Statics.field651 - 1] = client.method14().method5051() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class220 var11 = new class220(field1258[--Statics.field651]);
            client.method14().method5140(var11.field2692, var11.field2691);
            return 1;
        } else if (arg0 == 6607) {
            class220 var12 = new class220(field1258[--Statics.field651]);
            client.method14().method5054(var12.field2692, var12.field2691);
            return 1;
        } else if (arg0 == 6608) {
            class220 var13 = new class220(field1258[--Statics.field651]);
            client.method14().method5055(var13.field2695, var13.field2692, var13.field2691);
            return 1;
        } else if (arg0 == 6609) {
            class220 var14 = new class220(field1258[--Statics.field651]);
            client.method14().method5056(var14.field2695, var14.field2692, var14.field2691);
            return 1;
        } else if (arg0 == 6610) {
            field1258[++Statics.field651 - 1] = client.method14().method5117();
            field1258[++Statics.field651 - 1] = client.method14().method5058();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1258[--Statics.field651];
            class33 var16 = client.method14().method5052(var15);
            if (var16 == null) {
                field1258[++Statics.field651 - 1] = 0;
            } else {
                field1258[++Statics.field651 - 1] = var16.method270().method3769();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1258[--Statics.field651];
            class33 var18 = client.method14().method5052(var17);
            if (var18 == null) {
                field1258[++Statics.field651 - 1] = 0;
                field1258[++Statics.field651 - 1] = 0;
            } else {
                field1258[++Statics.field651 - 1] = (var18.method283() - var18.method282() + 1) * 64;
                field1258[++Statics.field651 - 1] = (var18.method285() - var18.method284() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1258[--Statics.field651];
            class33 var20 = client.method14().method5052(var19);
            if (var20 == null) {
                field1258[++Statics.field651 - 1] = 0;
                field1258[++Statics.field651 - 1] = 0;
                field1258[++Statics.field651 - 1] = 0;
                field1258[++Statics.field651 - 1] = 0;
            } else {
                field1258[++Statics.field651 - 1] = var20.method282() * 64;
                field1258[++Statics.field651 - 1] = var20.method284() * 64;
                field1258[++Statics.field651 - 1] = var20.method283() * 64 + 64 - 1;
                field1258[++Statics.field651 - 1] = var20.method285() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1258[--Statics.field651];
            class33 var22 = client.method14().method5052(var21);
            if (var22 == null) {
                field1258[++Statics.field651 - 1] = -1;
            } else {
                field1258[++Statics.field651 - 1] = var22.method281();
            }
            return 1;
        } else if (arg0 == 6615) {
            class220 var23 = client.method14().method5172();
            if (var23 == null) {
                field1258[++Statics.field651 - 1] = -1;
                field1258[++Statics.field651 - 1] = -1;
            } else {
                field1258[++Statics.field651 - 1] = var23.field2692;
                field1258[++Statics.field651 - 1] = var23.field2691;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1258[++Statics.field651 - 1] = client.method14().method5038();
            return 1;
        } else if (arg0 == 6617) {
            class220 var24 = new class220(field1258[--Statics.field651]);
            class33 var25 = client.method14().method5039();
            if (var25 == null) {
                field1258[++Statics.field651 - 1] = -1;
                field1258[++Statics.field651 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method273(var24.field2695, var24.field2692, var24.field2691);
            if (var26 == null) {
                field1258[++Statics.field651 - 1] = -1;
                field1258[++Statics.field651 - 1] = -1;
            } else {
                field1258[++Statics.field651 - 1] = var26[0];
                field1258[++Statics.field651 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class220 var27 = new class220(field1258[--Statics.field651]);
            class33 var28 = client.method14().method5039();
            if (var28 == null) {
                field1258[++Statics.field651 - 1] = -1;
                field1258[++Statics.field651 - 1] = -1;
                return 1;
            }
            class220 var29 = var28.method286(var27.field2692, var27.field2691);
            if (var29 == null) {
                field1258[++Statics.field651 - 1] = -1;
            } else {
                field1258[++Statics.field651 - 1] = var29.method3769();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field651 -= 2;
            int var30 = field1258[Statics.field651];
            class220 var31 = new class220(field1258[Statics.field651 + 1]);
            method4721(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field651 -= 2;
            int var32 = field1258[Statics.field651];
            class220 var33 = new class220(field1258[Statics.field651 + 1]);
            class33 var34 = client.method14().method5052(var32);
            int var35 = Statics.field601.field853;
            int var36 = (Statics.field601.field1188 >> 7) + Statics.field1709;
            int var37 = (Statics.field601.field1145 >> 7) + Statics.field1710;
            class220 var38 = new class220(var35, var36, var37);
            client.method14().method5042(var34, var38, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field651 -= 2;
            int var39 = field1258[Statics.field651];
            class220 var40 = new class220(field1258[Statics.field651 + 1]);
            class33 var41 = client.method14().method5052(var39);
            if (var41 == null) {
                field1258[++Statics.field651 - 1] = 0;
                return 1;
            } else {
                field1258[++Statics.field651 - 1] = var41.method303(var40.field2695, var40.field2692, var40.field2691) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1258[++Statics.field651 - 1] = client.method14().method5060();
            field1258[++Statics.field651 - 1] = client.method14().method5063();
            return 1;
        } else if (arg0 == 6623) {
            class220 var42 = new class220(field1258[--Statics.field651]);
            class33 var43 = client.method14().method5035(var42.field2695, var42.field2692, var42.field2691);
            if (var43 == null) {
                field1258[++Statics.field651 - 1] = -1;
            } else {
                field1258[++Statics.field651 - 1] = var43.method351();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method14().method5163(field1258[--Statics.field651]);
            return 1;
        } else if (arg0 == 6625) {
            client.method14().method5206();
            return 1;
        } else if (arg0 == 6626) {
            client.method14().method5064(field1258[--Statics.field651]);
            return 1;
        } else if (arg0 == 6627) {
            client.method14().method5169();
            return 1;
        } else if (arg0 == 6628) {
            boolean var44 = field1258[--Statics.field651] == 1;
            client.method14().method5066(var44);
            return 1;
        } else if (arg0 == 6629) {
            int var45 = field1258[--Statics.field651];
            client.method14().method5067(var45);
            return 1;
        } else if (arg0 == 6630) {
            int var46 = field1258[--Statics.field651];
            client.method14().method5085(var46);
            return 1;
        } else if (arg0 == 6631) {
            client.method14().method5069();
            return 1;
        } else if (arg0 == 6632) {
            boolean var47 = field1258[--Statics.field651] == 1;
            client.method14().method5147(var47);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field651 -= 2;
            int var48 = field1258[Statics.field651];
            boolean var49 = field1258[Statics.field651 + 1] == 1;
            client.method14().method5118(var48, var49);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field651 -= 2;
            int var50 = field1258[Statics.field651];
            boolean var51 = field1258[Statics.field651 + 1] == 1;
            client.method14().method5072(var50, var51);
            return 1;
        } else if (arg0 == 6635) {
            field1258[++Statics.field651 - 1] = client.method14().method5073() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var52 = field1258[--Statics.field651];
            field1258[++Statics.field651 - 1] = client.method14().method5074(var52) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var53 = field1258[--Statics.field651];
            field1258[++Statics.field651 - 1] = client.method14().method5075(var53) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field651 -= 2;
            int var54 = field1258[Statics.field651];
            class220 var55 = new class220(field1258[Statics.field651 + 1]);
            class220 var56 = client.method14().method5131(var54, var55);
            if (var56 == null) {
                field1258[++Statics.field651 - 1] = -1;
            } else {
                field1258[++Statics.field651 - 1] = var56.method3769();
            }
            return 1;
        } else if (arg0 == 6639) {
            class40 var57 = client.method14().method5079();
            if (var57 == null) {
                field1258[++Statics.field651 - 1] = -1;
                field1258[++Statics.field651 - 1] = -1;
            } else {
                field1258[++Statics.field651 - 1] = var57.field509;
                field1258[++Statics.field651 - 1] = var57.field500.method3769();
            }
            return 1;
        } else if (arg0 == 6640) {
            class40 var58 = client.method14().method5080();
            if (var58 == null) {
                field1258[++Statics.field651 - 1] = -1;
                field1258[++Statics.field651 - 1] = -1;
            } else {
                field1258[++Statics.field651 - 1] = var58.field509;
                field1258[++Statics.field651 - 1] = var58.field500.method3769();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var59 = field1258[--Statics.field651];
            class250 var60 = Statics.field3359[var59];
            if (var60.field3358 == null) {
                field1259[++Statics.field355 - 1] = "";
            } else {
                field1259[++Statics.field355 - 1] = var60.field3358;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var61 = field1258[--Statics.field651];
            class250 var62 = Statics.field3359[var61];
            field1258[++Statics.field651 - 1] = var62.field3355;
            return 1;
        } else if (arg0 == 6695) {
            int var63 = field1258[--Statics.field651];
            class250 var64 = Statics.field3359[var63];
            if (var64 == null) {
                field1258[++Statics.field651 - 1] = -1;
            } else {
                field1258[++Statics.field651 - 1] = var64.field3370;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var65 = field1258[--Statics.field651];
            class250 var66 = Statics.field3359[var65];
            if (var66 == null) {
                field1258[++Statics.field651 - 1] = -1;
            } else {
                field1258[++Statics.field651 - 1] = var66.field3354;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1258[++Statics.field651 - 1] = Statics.field588.field579;
            return 1;
        } else if (arg0 == 6698) {
            field1258[++Statics.field651 - 1] = Statics.field588.field583.method3769();
            return 1;
        } else if (arg0 == 6699) {
            field1258[++Statics.field651 - 1] = Statics.field588.field580.method3769();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ab.r(IB)V")
    public static void method257(int arg0) {
        if (arg0 == -1 || !class224.method1621(arg0)) {
            return;
        }
        class224[] var1 = Statics.field3299[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class224 var3 = var1[var2];
            if (var3.field2808 != null) {
                class69 var4 = new class69();
                var4.field795 = var3;
                var4.field792 = var3.field2808;
                method1028(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("ja.o(ILhq;ZI)V")
    public static void method4721(int arg0, class220 arg1, boolean arg2) {
        class33 var3 = client.method14().method5052(arg0);
        int var4 = Statics.field601.field853;
        int var5 = (Statics.field601.field1188 >> 7) + Statics.field1709;
        int var6 = (Statics.field601.field1145 >> 7) + Statics.field1710;
        class220 var7 = new class220(var4, var5, var6);
        client.method14().method5042(var3, var7, arg1, arg2);
    }
}
