package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cg")
public class class84 {

    @ObfuscatedName("cg.e")
    public static int[] field1305 = new int[5];

    @ObfuscatedName("cg.f")
    public static int[][] field1306 = new int[5][5000];

    @ObfuscatedName("cg.v")
    public static int[] field1308 = new int[1000];

    @ObfuscatedName("cg.i")
    public static String[] field1301 = new String[1000];

    @ObfuscatedName("cg.g")
    public static int field1310 = 0;

    @ObfuscatedName("cg.s")
    public static class62[] field1311 = new class62[50];

    @ObfuscatedName("cg.u")
    public static Calendar field1312 = Calendar.getInstance();

    @ObfuscatedName("cg.b")
    public static final String[] field1313 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cg.k")
    public static int field1307 = 0;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.d(Lbc;I)V")
    public static void method1011(class70 arg0) {
        method1586(arg0, 200000);
    }

    @ObfuscatedName("cb.q(Lbc;II)V")
    public static void method1586(class70 arg0, int arg1) {
        Object[] var2 = arg0.field819;
        class100 var13;
        if (class220.method142(arg0.field820)) {
            Statics.field520 = (class48) var2[0];
            class243 var3 = Statics.field3287[Statics.field520.field569];
            class220 var4 = arg0.field820;
            int var5 = var3.field3279;
            int var6 = var3.field3296;
            int var7 = class224.method111(var5, var4);
            class100 var8 = class100.method1386(var7, var4);
            class100 var9;
            if (var8 == null) {
                int var10 = (var6 + 40000 << 8) + var4.field2777;
                class100 var12 = class100.method1386(var10, var4);
                if (var12 == null) {
                    var9 = null;
                } else {
                    var9 = var12;
                }
            } else {
                var9 = var8;
            }
            var13 = var9;
        } else {
            int var14 = (Integer) var2[0];
            class100 var15 = (class100) class100.field1502.method3252((long) var14);
            class100 var16;
            if (var15 == null) {
                byte[] var17 = Statics.field925.method3750(var14, 0);
                if (var17 == null) {
                    var16 = null;
                } else {
                    class100 var18 = class100.method2175(var17);
                    class100.field1502.method3256(var18, (long) var14);
                    var16 = var18;
                }
            } else {
                var16 = var15;
            }
            var13 = var16;
        }
        if (var13 == null) {
            return;
        }
        Statics.field1315 = 0;
        Statics.field2239 = 0;
        int var19 = -1;
        int[] var20 = var13.field1501;
        int[] var21 = var13.field1500;
        byte var22 = -1;
        field1310 = 0;
        try {
            Statics.field1303 = new int[var13.field1508];
            int var23 = 0;
            Statics.field1314 = new String[var13.field1505];
            int var24 = 0;
            for (int var25 = 1; var25 < var2.length; var25++) {
                if (var2[var25] instanceof Integer) {
                    int var26 = (Integer) var2[var25];
                    if (var26 == -2147483647) {
                        var26 = arg0.field814;
                    }
                    if (var26 == -2147483646) {
                        var26 = arg0.field815;
                    }
                    if (var26 == -2147483645) {
                        var26 = arg0.field813 == null ? -1 : arg0.field813.field2630;
                    }
                    if (var26 == -2147483644) {
                        var26 = arg0.field823;
                    }
                    if (var26 == -2147483643) {
                        var26 = arg0.field813 == null ? -1 : arg0.field813.field2631;
                    }
                    if (var26 == -2147483642) {
                        var26 = arg0.field822 == null ? -1 : arg0.field822.field2630;
                    }
                    if (var26 == -2147483641) {
                        var26 = arg0.field822 == null ? -1 : arg0.field822.field2631;
                    }
                    if (var26 == -2147483640) {
                        var26 = arg0.field818;
                    }
                    if (var26 == -2147483639) {
                        var26 = arg0.field811;
                    }
                    Statics.field1303[var23++] = var26;
                } else if (var2[var25] instanceof String) {
                    String var27 = (String) var2[var25];
                    if (var27.equals("event_opbase")) {
                        var27 = arg0.field827;
                    }
                    Statics.field1314[var24++] = var27;
                }
            }
            int var28 = 0;
            field1307 = arg0.field821;
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
                                                                                                                label276: while (true) {
                                                                                                                    var28++;
                                                                                                                    if (var28 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var19++;
                                                                                                                    int var83 = var20[var19];
                                                                                                                    if (var83 >= 100) {
                                                                                                                        boolean var77;
                                                                                                                        if (var13.field1500[var19] == 1) {
                                                                                                                            var77 = true;
                                                                                                                        } else {
                                                                                                                            var77 = false;
                                                                                                                        }
                                                                                                                        int var78 = method2833(var83, var13, var77);
                                                                                                                        switch(var78) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var83 == 0) {
                                                                                                                        field1308[++Statics.field1315 - 1] = var21[var19];
                                                                                                                    } else if (var83 == 1) {
                                                                                                                        int var29 = var21[var19];
                                                                                                                        field1308[++Statics.field1315 - 1] = class212.field2585[var29];
                                                                                                                    } else if (var83 == 2) {
                                                                                                                        int var30 = var21[var19];
                                                                                                                        class212.field2585[var30] = field1308[--Statics.field1315];
                                                                                                                        client.method999(var30);
                                                                                                                    } else if (var83 == 3) {
                                                                                                                        field1301[++Statics.field2239 - 1] = var13.field1503[var19];
                                                                                                                    } else if (var83 == 6) {
                                                                                                                        var19 += var21[var19];
                                                                                                                    } else if (var83 == 7) {
                                                                                                                        Statics.field1315 -= 2;
                                                                                                                        if (field1308[Statics.field1315] != field1308[Statics.field1315 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var83 == 8) {
                                                                                                                        Statics.field1315 -= 2;
                                                                                                                        if (field1308[Statics.field1315] == field1308[Statics.field1315 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var83 == 9) {
                                                                                                                        Statics.field1315 -= 2;
                                                                                                                        if (field1308[Statics.field1315] < field1308[Statics.field1315 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var83 == 10) {
                                                                                                                        Statics.field1315 -= 2;
                                                                                                                        if (field1308[Statics.field1315] > field1308[Statics.field1315 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var83 == 21) {
                                                                                                                        if (field1310 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class62 var31 = field1311[--field1310];
                                                                                                                        var13 = var31.field732;
                                                                                                                        var20 = var13.field1501;
                                                                                                                        var21 = var13.field1500;
                                                                                                                        var19 = var31.field726;
                                                                                                                        Statics.field1303 = var31.field727;
                                                                                                                        Statics.field1314 = var31.field728;
                                                                                                                    } else if (var83 == 25) {
                                                                                                                        int var32 = var21[var19];
                                                                                                                        field1308[++Statics.field1315 - 1] = class212.method1567(var32);
                                                                                                                    } else if (var83 == 27) {
                                                                                                                        int var33 = var21[var19];
                                                                                                                        int var34 = field1308[--Statics.field1315];
                                                                                                                        class251 var35 = class251.method1392(var33);
                                                                                                                        int var36 = var35.field3363;
                                                                                                                        int var37 = var35.field3364;
                                                                                                                        int var38 = var35.field3365;
                                                                                                                        int var39 = class212.field2583[var38 - var37];
                                                                                                                        if (var34 < 0 || var34 > var39) {
                                                                                                                            var34 = 0;
                                                                                                                        }
                                                                                                                        int var40 = var39 << var37;
                                                                                                                        class212.field2585[var36] = class212.field2585[var36] & ~var40 | var34 << var37 & var40;
                                                                                                                    } else if (var83 == 31) {
                                                                                                                        Statics.field1315 -= 2;
                                                                                                                        if (field1308[Statics.field1315] <= field1308[Statics.field1315 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var83 == 32) {
                                                                                                                        Statics.field1315 -= 2;
                                                                                                                        if (field1308[Statics.field1315] >= field1308[Statics.field1315 + 1]) {
                                                                                                                            var19 += var21[var19];
                                                                                                                        }
                                                                                                                    } else if (var83 == 33) {
                                                                                                                        field1308[++Statics.field1315 - 1] = Statics.field1303[var21[var19]];
                                                                                                                    } else if (var83 == 34) {
                                                                                                                        Statics.field1303[var21[var19]] = field1308[--Statics.field1315];
                                                                                                                    } else if (var83 == 35) {
                                                                                                                        field1301[++Statics.field2239 - 1] = Statics.field1314[var21[var19]];
                                                                                                                    } else if (var83 == 36) {
                                                                                                                        Statics.field1314[var21[var19]] = field1301[--Statics.field2239];
                                                                                                                    } else if (var83 == 37) {
                                                                                                                        int var41 = var21[var19];
                                                                                                                        Statics.field2239 -= var41;
                                                                                                                        String[] var42 = field1301;
                                                                                                                        int var43 = Statics.field2239;
                                                                                                                        String var44;
                                                                                                                        if (var41 == 0) {
                                                                                                                            var44 = "";
                                                                                                                        } else if (var41 == 1) {
                                                                                                                            String var45 = var42[var43];
                                                                                                                            if (var45 == null) {
                                                                                                                                var44 = "null";
                                                                                                                            } else {
                                                                                                                                var44 = var45.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var46 = var41 + var43;
                                                                                                                            int var47 = 0;
                                                                                                                            for (int var48 = var43; var48 < var46; var48++) {
                                                                                                                                String var49 = var42[var48];
                                                                                                                                if (var49 == null) {
                                                                                                                                    var47 += 4;
                                                                                                                                } else {
                                                                                                                                    var47 += var49.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var50 = new StringBuilder(var47);
                                                                                                                            for (int var51 = var43; var51 < var46; var51++) {
                                                                                                                                String var52 = var42[var51];
                                                                                                                                if (var52 == null) {
                                                                                                                                    var50.append("null");
                                                                                                                                } else {
                                                                                                                                    var50.append(var52);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var44 = var50.toString();
                                                                                                                        }
                                                                                                                        field1301[++Statics.field2239 - 1] = var44;
                                                                                                                    } else if (var83 == 38) {
                                                                                                                        Statics.field1315--;
                                                                                                                    } else if (var83 == 39) {
                                                                                                                        Statics.field2239--;
                                                                                                                    } else if (var83 == 40) {
                                                                                                                        int var54 = var21[var19];
                                                                                                                        class100 var55 = (class100) class100.field1502.method3252((long) var54);
                                                                                                                        class100 var56;
                                                                                                                        if (var55 == null) {
                                                                                                                            byte[] var57 = Statics.field925.method3750(var54, 0);
                                                                                                                            if (var57 == null) {
                                                                                                                                var56 = null;
                                                                                                                            } else {
                                                                                                                                class100 var58 = class100.method2175(var57);
                                                                                                                                class100.field1502.method3256(var58, (long) var54);
                                                                                                                                var56 = var58;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var56 = var55;
                                                                                                                        }
                                                                                                                        class100 var59 = var56;
                                                                                                                        int[] var60 = new int[var56.field1508];
                                                                                                                        String[] var61 = new String[var56.field1505];
                                                                                                                        for (int var62 = 0; var62 < var59.field1506; var62++) {
                                                                                                                            var60[var62] = field1308[Statics.field1315 - var59.field1506 + var62];
                                                                                                                        }
                                                                                                                        for (int var63 = 0; var63 < var59.field1504; var63++) {
                                                                                                                            var61[var63] = field1301[Statics.field2239 - var59.field1504 + var63];
                                                                                                                        }
                                                                                                                        Statics.field1315 -= var59.field1506;
                                                                                                                        Statics.field2239 -= var59.field1504;
                                                                                                                        class62 var64 = new class62();
                                                                                                                        var64.field732 = var13;
                                                                                                                        var64.field726 = var19;
                                                                                                                        var64.field727 = Statics.field1303;
                                                                                                                        var64.field728 = Statics.field1314;
                                                                                                                        field1311[++field1310 - 1] = var64;
                                                                                                                        var13 = var59;
                                                                                                                        var20 = var59.field1501;
                                                                                                                        var21 = var59.field1500;
                                                                                                                        var19 = -1;
                                                                                                                        Statics.field1303 = var60;
                                                                                                                        Statics.field1314 = var61;
                                                                                                                    } else if (var83 == 42) {
                                                                                                                        field1308[++Statics.field1315 - 1] = Statics.field629.method1660(var21[var19]);
                                                                                                                    } else if (var83 == 43) {
                                                                                                                        Statics.field629.method1641(var21[var19], field1308[--Statics.field1315]);
                                                                                                                    } else if (var83 == 44) {
                                                                                                                        int var65 = var21[var19] >> 16;
                                                                                                                        int var66 = var21[var19] & 0xFFFF;
                                                                                                                        int var67 = field1308[--Statics.field1315];
                                                                                                                        if (var67 >= 0 && var67 <= 5000) {
                                                                                                                            field1305[var65] = var67;
                                                                                                                            byte var68 = -1;
                                                                                                                            if (var66 == 105) {
                                                                                                                                var68 = 0;
                                                                                                                            }
                                                                                                                            int var69 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var69 >= var67) {
                                                                                                                                    continue label276;
                                                                                                                                }
                                                                                                                                field1306[var65][var69] = var68;
                                                                                                                                var69++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var83 == 45) {
                                                                                                                        int var70 = var21[var19];
                                                                                                                        int var71 = field1308[--Statics.field1315];
                                                                                                                        if (var71 < 0 || var71 >= field1305[var70]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1308[++Statics.field1315 - 1] = field1306[var70][var71];
                                                                                                                    } else if (var83 == 46) {
                                                                                                                        int var72 = var21[var19];
                                                                                                                        Statics.field1315 -= 2;
                                                                                                                        int var73 = field1308[Statics.field1315];
                                                                                                                        if (var73 < 0 || var73 >= field1305[var72]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1306[var72][var73] = field1308[Statics.field1315 + 1];
                                                                                                                    } else if (var83 == 47) {
                                                                                                                        String var74 = Statics.field629.method1671(var21[var19]);
                                                                                                                        if (var74 == null) {
                                                                                                                            var74 = "null";
                                                                                                                        }
                                                                                                                        field1301[++Statics.field2239 - 1] = var74;
                                                                                                                    } else if (var83 == 48) {
                                                                                                                        Statics.field629.method1643(var21[var19], field1301[--Statics.field2239]);
                                                                                                                    } else if (var83 == 60) {
                                                                                                                        class187 var75 = var13.field1507[var21[var19]];
                                                                                                                        class199 var76 = (class199) var75.method3224((long) field1308[--Statics.field1315]);
                                                                                                                        if (var76 != null) {
                                                                                                                            var19 += var76.field2454;
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
        } catch (Exception var82) {
            StringBuilder var80 = new StringBuilder(30);
            var80.append("").append(var13.field2441).append(" ");
            for (int var81 = field1310 - 1; var81 >= 0; var81--) {
                var80.append("").append(field1311[var81].field732.field2441).append(" ");
            }
            var80.append("").append(var22);
            class153.method158(var80.toString(), var82);
        }
    }

    @ObfuscatedName("fq.x(ILcd;ZI)I")
    public static int method2833(int arg0, class100 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method2704(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method1136(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method489(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method940(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method2(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method466(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            class217 var6 = arg2 ? Statics.field2616 : Statics.field852;
            byte var7;
            if (arg0 == 1500) {
                field1308[++Statics.field1315 - 1] = var6.field2643;
                var7 = 1;
            } else if (arg0 == 1501) {
                field1308[++Statics.field1315 - 1] = var6.field2644;
                var7 = 1;
            } else if (arg0 == 1502) {
                field1308[++Statics.field1315 - 1] = var6.field2645;
                var7 = 1;
            } else if (arg0 == 1503) {
                field1308[++Statics.field1315 - 1] = var6.field2634;
                var7 = 1;
            } else if (arg0 == 1504) {
                field1308[++Statics.field1315 - 1] = var6.field2655 ? 1 : 0;
                var7 = 1;
            } else if (arg0 == 1505) {
                field1308[++Statics.field1315 - 1] = var6.field2649;
                var7 = 1;
            } else {
                var7 = 2;
            }
            return var7;
        } else if (arg0 < 1700) {
            class217 var8 = arg2 ? Statics.field2616 : Statics.field852;
            byte var9;
            if (arg0 == 1600) {
                field1308[++Statics.field1315 - 1] = var8.field2651;
                var9 = 1;
            } else if (arg0 == 1601) {
                field1308[++Statics.field1315 - 1] = var8.field2713;
                var9 = 1;
            } else if (arg0 == 1602) {
                field1301[++Statics.field2239 - 1] = var8.field2690;
                var9 = 1;
            } else if (arg0 == 1603) {
                field1308[++Statics.field1315 - 1] = var8.field2667;
                var9 = 1;
            } else if (arg0 == 1604) {
                field1308[++Statics.field1315 - 1] = var8.field2654;
                var9 = 1;
            } else if (arg0 == 1605) {
                field1308[++Statics.field1315 - 1] = var8.field2684;
                var9 = 1;
            } else if (arg0 == 1606) {
                field1308[++Statics.field1315 - 1] = var8.field2681;
                var9 = 1;
            } else if (arg0 == 1607) {
                field1308[++Statics.field1315 - 1] = var8.field2683;
                var9 = 1;
            } else if (arg0 == 1608) {
                field1308[++Statics.field1315 - 1] = var8.field2737;
                var9 = 1;
            } else if (arg0 == 1609) {
                field1308[++Statics.field1315 - 1] = var8.field2661;
                var9 = 1;
            } else if (arg0 == 1610) {
                field1308[++Statics.field1315 - 1] = var8.field2662;
                var9 = 1;
            } else if (arg0 == 1611) {
                field1308[++Statics.field1315 - 1] = var8.field2711;
                var9 = 1;
            } else if (arg0 == 1612) {
                field1308[++Statics.field1315 - 1] = var8.field2656;
                var9 = 1;
            } else if (arg0 == 1613) {
                field1308[++Statics.field1315 - 1] = var8.field2704.method8();
                var9 = 1;
            } else {
                var9 = 2;
            }
            return var9;
        } else if (arg0 < 1800) {
            return method1010(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return Statics.method993(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method225(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1136(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method489(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method940(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method2(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method466(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method165(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method1694(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            byte var11;
            if (arg0 == 2700) {
                class217 var10 = class217.method2656(field1308[--Statics.field1315]);
                field1308[++Statics.field1315 - 1] = var10.field2750;
                var11 = 1;
            } else if (arg0 == 2701) {
                class217 var12 = class217.method2656(field1308[--Statics.field1315]);
                if (var12.field2750 == -1) {
                    field1308[++Statics.field1315 - 1] = 0;
                } else {
                    field1308[++Statics.field1315 - 1] = var12.field2751;
                }
                var11 = 1;
            } else if (arg0 == 2702) {
                int var13 = field1308[--Statics.field1315];
                class69 var14 = (class69) client.field1097.method3263((long) var13);
                if (var14 == null) {
                    field1308[++Statics.field1315 - 1] = 0;
                } else {
                    field1308[++Statics.field1315 - 1] = 1;
                }
                var11 = 1;
            } else if (arg0 == 2706) {
                field1308[++Statics.field1315 - 1] = client.field1044;
                var11 = 1;
            } else {
                var11 = 2;
            }
            return var11;
        } else if (arg0 < 2900) {
            return method739(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method225(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method3566(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            byte var15;
            if (arg0 == 3200) {
                Statics.field1315 -= 3;
                client.method1015(field1308[Statics.field1315], field1308[Statics.field1315 + 1], field1308[Statics.field1315 + 2]);
                var15 = 1;
            } else if (arg0 == 3201) {
                int var16 = field1308[--Statics.field1315];
                if (var16 == -1 && !client.field1122) {
                    class204.method624();
                } else if (var16 != -1 && client.field1070 != var16 && client.field1120 != 0 && !client.field1122) {
                    class204.method493(2, Statics.field18, var16, 0, client.field1120, false);
                }
                client.field1070 = var16;
                var15 = 1;
            } else if (arg0 == 3202) {
                Statics.field1315 -= 2;
                client.method1540(field1308[Statics.field1315], field1308[Statics.field1315 + 1]);
                var15 = 1;
            } else {
                var15 = 2;
            }
            return var15;
        } else if (arg0 < 3400) {
            byte var17;
            if (arg0 == 3300) {
                field1308[++Statics.field1315 - 1] = client.field902;
                var17 = 1;
            } else if (arg0 == 3301) {
                Statics.field1315 -= 2;
                int var18 = field1308[Statics.field1315];
                int var19 = field1308[Statics.field1315 + 1];
                int[] var20 = field1308;
                int var21 = ++Statics.field1315 - 1;
                class64 var22 = (class64) class64.field756.method3263((long) var18);
                int var23;
                if (var22 == null) {
                    var23 = -1;
                } else if (var19 >= 0 && var19 < var22.field761.length) {
                    var23 = var22.field761[var19];
                } else {
                    var23 = -1;
                }
                var20[var21] = var23;
                var17 = 1;
            } else if (arg0 == 3302) {
                Statics.field1315 -= 2;
                int var24 = field1308[Statics.field1315];
                int var25 = field1308[Statics.field1315 + 1];
                field1308[++Statics.field1315 - 1] = class64.method1558(var24, var25);
                var17 = 1;
            } else if (arg0 == 3303) {
                Statics.field1315 -= 2;
                int var26 = field1308[Statics.field1315];
                int var27 = field1308[Statics.field1315 + 1];
                field1308[++Statics.field1315 - 1] = class64.method3736(var26, var27);
                var17 = 1;
            } else if (arg0 == 3304) {
                int var28 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = class241.method38(var28).field3265;
                var17 = 1;
            } else if (arg0 == 3305) {
                int var29 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = client.field903[var29];
                var17 = 1;
            } else if (arg0 == 3306) {
                int var30 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = client.field1137[var30];
                var17 = 1;
            } else if (arg0 == 3307) {
                int var31 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = client.field1020[var31];
                var17 = 1;
            } else if (arg0 == 3308) {
                int var32 = Statics.field237;
                int var33 = (Statics.field2829.field1232 >> 7) + Statics.field448;
                int var34 = (Statics.field2829.field1191 >> 7) + Statics.field301;
                field1308[++Statics.field1315 - 1] = (var32 << 28) + (var33 << 14) + var34;
                var17 = 1;
            } else if (arg0 == 3309) {
                int var35 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = var35 >> 14 & 0x3FFF;
                var17 = 1;
            } else if (arg0 == 3310) {
                int var36 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = var36 >> 28;
                var17 = 1;
            } else if (arg0 == 3311) {
                int var37 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = var37 & 0x3FFF;
                var17 = 1;
            } else if (arg0 == 3312) {
                field1308[++Statics.field1315 - 1] = client.field892 ? 1 : 0;
                var17 = 1;
            } else if (arg0 == 3313) {
                Statics.field1315 -= 2;
                int var38 = field1308[Statics.field1315] + 32768;
                int var39 = field1308[Statics.field1315 + 1];
                int[] var40 = field1308;
                int var41 = ++Statics.field1315 - 1;
                class64 var42 = (class64) class64.field756.method3263((long) var38);
                int var43;
                if (var42 == null) {
                    var43 = -1;
                } else if (var39 >= 0 && var39 < var42.field761.length) {
                    var43 = var42.field761[var39];
                } else {
                    var43 = -1;
                }
                var40[var41] = var43;
                var17 = 1;
            } else if (arg0 == 3314) {
                Statics.field1315 -= 2;
                int var44 = field1308[Statics.field1315] + 32768;
                int var45 = field1308[Statics.field1315 + 1];
                field1308[++Statics.field1315 - 1] = class64.method1558(var44, var45);
                var17 = 1;
            } else if (arg0 == 3315) {
                Statics.field1315 -= 2;
                int var46 = field1308[Statics.field1315] + 32768;
                int var47 = field1308[Statics.field1315 + 1];
                field1308[++Statics.field1315 - 1] = class64.method3736(var46, var47);
                var17 = 1;
            } else if (arg0 == 3316) {
                if (client.field914 >= 2) {
                    field1308[++Statics.field1315 - 1] = client.field914;
                } else {
                    field1308[++Statics.field1315 - 1] = 0;
                }
                var17 = 1;
            } else if (arg0 == 3317) {
                field1308[++Statics.field1315 - 1] = client.field909;
                var17 = 1;
            } else if (arg0 == 3318) {
                field1308[++Statics.field1315 - 1] = client.field893;
                var17 = 1;
            } else if (arg0 == 3321) {
                field1308[++Statics.field1315 - 1] = client.field1155;
                var17 = 1;
            } else if (arg0 == 3322) {
                field1308[++Statics.field1315 - 1] = client.field1050;
                var17 = 1;
            } else if (arg0 == 3323) {
                if (client.field1053) {
                    field1308[++Statics.field1315 - 1] = 1;
                } else {
                    field1308[++Statics.field1315 - 1] = 0;
                }
                var17 = 1;
            } else if (arg0 == 3324) {
                field1308[++Statics.field1315 - 1] = client.field961;
                var17 = 1;
            } else if (arg0 == 3325) {
                Statics.field1315 -= 4;
                int var48 = field1308[Statics.field1315];
                int var49 = field1308[Statics.field1315 + 1];
                int var50 = field1308[Statics.field1315 + 2];
                int var51 = field1308[Statics.field1315 + 3];
                int var52 = (var49 << 14) + var48;
                int var53 = (var50 << 28) + var52;
                int var54 = var51 + var53;
                field1308[++Statics.field1315 - 1] = var54;
                var17 = 1;
            } else {
                var17 = 2;
            }
            return var17;
        } else if (arg0 < 3500) {
            return method936(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            byte var55;
            if (arg0 == 3600) {
                if (client.field1145 == 0) {
                    field1308[++Statics.field1315 - 1] = -2;
                } else if (client.field1145 == 1) {
                    field1308[++Statics.field1315 - 1] = -1;
                } else {
                    field1308[++Statics.field1315 - 1] = client.field1150;
                }
                var55 = 1;
            } else if (arg0 == 3601) {
                int var56 = field1308[--Statics.field1315];
                if (client.field1145 == 2 && var56 < client.field1150) {
                    field1301[++Statics.field2239 - 1] = client.field1152[var56].field779;
                    field1301[++Statics.field2239 - 1] = client.field1152[var56].field777;
                } else {
                    field1301[++Statics.field2239 - 1] = "";
                    field1301[++Statics.field2239 - 1] = "";
                }
                var55 = 1;
            } else if (arg0 == 3602) {
                int var57 = field1308[--Statics.field1315];
                if (client.field1145 == 2 && var57 < client.field1150) {
                    field1308[++Statics.field1315 - 1] = client.field1152[var57].field778;
                } else {
                    field1308[++Statics.field1315 - 1] = 0;
                }
                var55 = 1;
            } else if (arg0 == 3603) {
                int var58 = field1308[--Statics.field1315];
                if (client.field1145 == 2 && var58 < client.field1150) {
                    field1308[++Statics.field1315 - 1] = client.field1152[var58].field776;
                } else {
                    field1308[++Statics.field1315 - 1] = 0;
                }
                var55 = 1;
            } else if (arg0 == 3604) {
                String var59 = field1301[--Statics.field2239];
                int var60 = field1308[--Statics.field1315];
                client.method987(var59, var60);
                var55 = 1;
            } else if (arg0 == 3605) {
                String var61 = field1301[--Statics.field2239];
                client.method4009(var61);
                var55 = 1;
            } else if (arg0 == 3606) {
                String var62 = field1301[--Statics.field2239];
                if (var62 != null) {
                    String var63 = class268.method43(var62, Statics.field716);
                    if (var63 != null) {
                        for (int var64 = 0; var64 < client.field1150; var64++) {
                            class66 var65 = client.field1152[var64];
                            String var66 = var65.field779;
                            String var67 = class268.method43(var66, Statics.field716);
                            boolean var68;
                            if (var62 == null || var66 == null) {
                                var68 = false;
                            } else if (var62.startsWith("#") || var66.startsWith("#")) {
                                var68 = var62.equals(var66);
                            } else {
                                var68 = var63.equals(var67);
                            }
                            if (var68) {
                                client.field1150--;
                                for (int var69 = var64; var69 < client.field1150; var69++) {
                                    client.field1152[var69] = client.field1152[var69 + 1];
                                }
                                client.field1077 = client.field1069;
                                client.field937.method3133(136);
                                client.field937.method2899(Statics.method2363(var62));
                                client.field937.method2905(var62);
                                break;
                            }
                        }
                    }
                }
                var55 = 1;
            } else if (arg0 == 3607) {
                String var70 = field1301[--Statics.field2239];
                if (var70 != null) {
                    if ((client.field1154 < 100 || client.field1102 == 1) && client.field1154 < 400) {
                        String var71 = class268.method43(var70, Statics.field716);
                        if (var71 != null) {
                            int var72 = 0;
                            label1355: while (true) {
                                if (var72 >= client.field1154) {
                                    for (int var76 = 0; var76 < client.field1150; var76++) {
                                        class66 var77 = client.field1152[var76];
                                        String var78 = class268.method43(var77.field779, Statics.field716);
                                        if (var78 != null && var78.equals(var71)) {
                                            class99.method3389(31, "", class226.field3008 + var70 + class226.field3009);
                                            break label1355;
                                        }
                                        if (var77.field777 != null) {
                                            String var79 = class268.method43(var77.field777, Statics.field716);
                                            if (var79 != null && var79.equals(var71)) {
                                                class99.method3389(31, "", class226.field3008 + var70 + class226.field3009);
                                                break label1355;
                                            }
                                        }
                                    }
                                    if (class268.method43(Statics.field2829.field875, Statics.field716).equals(var71)) {
                                        class99.method3389(31, "", class226.field2944);
                                    } else {
                                        client.field937.method3133(70);
                                        client.field937.method2899(Statics.method2363(var70));
                                        client.field937.method2905(var70);
                                    }
                                    break;
                                }
                                class71 var73 = client.field897[var72];
                                String var74 = class268.method43(var73.field831, Statics.field716);
                                if (var74 != null && var74.equals(var71)) {
                                    class99.method3389(31, "", var70 + class226.field2894);
                                    break;
                                }
                                if (var73.field832 != null) {
                                    String var75 = class268.method43(var73.field832, Statics.field716);
                                    if (var75 != null && var75.equals(var71)) {
                                        class99.method3389(31, "", var70 + class226.field2894);
                                        break;
                                    }
                                }
                                var72++;
                            }
                        }
                    } else {
                        class99.method3389(31, "", class226.field2973);
                    }
                }
                var55 = 1;
            } else if (arg0 == 3608) {
                String var80 = field1301[--Statics.field2239];
                if (var80 != null) {
                    String var81 = class268.method43(var80, Statics.field716);
                    if (var81 != null) {
                        for (int var82 = 0; var82 < client.field1154; var82++) {
                            class71 var83 = client.field897[var82];
                            String var84 = var83.field831;
                            String var85 = class268.method43(var84, Statics.field716);
                            boolean var86;
                            if (var80 == null || var84 == null) {
                                var86 = false;
                            } else if (var80.startsWith("#") || var84.startsWith("#")) {
                                var86 = var80.equals(var84);
                            } else {
                                var86 = var81.equals(var85);
                            }
                            if (var86) {
                                client.field1154--;
                                for (int var87 = var82; var87 < client.field1154; var87++) {
                                    client.field897[var87] = client.field897[var87 + 1];
                                }
                                client.field1077 = client.field1069;
                                client.field937.method3133(42);
                                client.field937.method2899(Statics.method2363(var80));
                                client.field937.method2905(var80);
                                break;
                            }
                        }
                    }
                }
                var55 = 1;
            } else if (arg0 == 3609) {
                String var88 = field1301[--Statics.field2239];
                class231[] var89 = new class231[] { class231.field3157, class231.field3155, class231.field3158, class231.field3154, class231.field3156, class231.field3153 };
                class231[] var90 = var89;
                for (int var91 = 0; var91 < var90.length; var91++) {
                    class231 var92 = var90[var91];
                    if (var92.field3160 != -1) {
                        int var94 = var92.field3160;
                        String var95 = "<img=" + var94 + ">";
                        if (var88.startsWith(var95)) {
                            var88 = var88.substring(6 + Integer.toString(var92.field3160).length());
                            break;
                        }
                    }
                }
                field1308[++Statics.field1315 - 1] = client.method237(var88, false) ? 1 : 0;
                var55 = 1;
            } else if (arg0 == 3611) {
                if (client.field1110 == null) {
                    field1301[++Statics.field2239 - 1] = "";
                } else {
                    field1301[++Statics.field2239 - 1] = class269.method4237(client.field1110);
                }
                var55 = 1;
            } else if (arg0 == 3612) {
                if (client.field1110 == null) {
                    field1308[++Statics.field1315 - 1] = 0;
                } else {
                    field1308[++Statics.field1315 - 1] = Statics.field328;
                }
                var55 = 1;
            } else if (arg0 == 3613) {
                int var96 = field1308[--Statics.field1315];
                if (client.field1110 == null || var96 >= Statics.field328) {
                    field1301[++Statics.field2239 - 1] = "";
                } else {
                    field1301[++Statics.field2239 - 1] = Statics.field488[var96].field888;
                }
                var55 = 1;
            } else if (arg0 == 3614) {
                int var97 = field1308[--Statics.field1315];
                if (client.field1110 == null || var97 >= Statics.field328) {
                    field1308[++Statics.field1315 - 1] = 0;
                } else {
                    field1308[++Statics.field1315 - 1] = Statics.field488[var97].field886;
                }
                var55 = 1;
            } else if (arg0 == 3615) {
                int var98 = field1308[--Statics.field1315];
                if (client.field1110 == null || var98 >= Statics.field328) {
                    field1308[++Statics.field1315 - 1] = 0;
                } else {
                    field1308[++Statics.field1315 - 1] = Statics.field488[var98].field887;
                }
                var55 = 1;
            } else if (arg0 == 3616) {
                field1308[++Statics.field1315 - 1] = Statics.field3232;
                var55 = 1;
            } else if (arg0 == 3617) {
                String var99 = field1301[--Statics.field2239];
                if (Statics.field488 != null) {
                    client.field937.method3133(137);
                    client.field937.method2899(Statics.method2363(var99));
                    client.field937.method2905(var99);
                }
                var55 = 1;
            } else if (arg0 == 3618) {
                field1308[++Statics.field1315 - 1] = Statics.field792;
                var55 = 1;
            } else if (arg0 == 3619) {
                String var100 = field1301[--Statics.field2239];
                client.method105(var100);
                var55 = 1;
            } else if (arg0 == 3620) {
                client.field937.method3133(209);
                client.field937.method2899(0);
                var55 = 1;
            } else if (arg0 == 3621) {
                if (client.field1145 == 0) {
                    field1308[++Statics.field1315 - 1] = -1;
                } else {
                    field1308[++Statics.field1315 - 1] = client.field1154;
                }
                var55 = 1;
            } else if (arg0 == 3622) {
                int var101 = field1308[--Statics.field1315];
                if (client.field1145 == 0 || var101 >= client.field1154) {
                    field1301[++Statics.field2239 - 1] = "";
                    field1301[++Statics.field2239 - 1] = "";
                } else {
                    field1301[++Statics.field2239 - 1] = client.field897[var101].field831;
                    field1301[++Statics.field2239 - 1] = client.field897[var101].field832;
                }
                var55 = 1;
            } else if (arg0 == 3623) {
                String var102;
                label1264: {
                    var102 = field1301[--Statics.field2239];
                    String var104 = "<img=0>";
                    if (!var102.startsWith(var104)) {
                        String var106 = "<img=1>";
                        if (!var102.startsWith(var106)) {
                            break label1264;
                        }
                    }
                    var102 = var102.substring(7);
                }
                field1308[++Statics.field1315 - 1] = client.method986(var102) ? 1 : 0;
                var55 = 1;
            } else if (arg0 == 3624) {
                int var107 = field1308[--Statics.field1315];
                if (Statics.field488 == null || var107 >= Statics.field328 || !Statics.field488[var107].field888.equalsIgnoreCase(Statics.field2829.field875)) {
                    field1308[++Statics.field1315 - 1] = 0;
                } else {
                    field1308[++Statics.field1315 - 1] = 1;
                }
                var55 = 1;
            } else if (arg0 == 3625) {
                if (client.field1132 == null) {
                    field1301[++Statics.field2239 - 1] = "";
                } else {
                    field1301[++Statics.field2239 - 1] = class269.method4237(client.field1132);
                }
                var55 = 1;
            } else {
                var55 = 2;
            }
            return var55;
        } else if (arg0 < 4000) {
            return method3589(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method1976(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            byte var110;
            if (arg0 == 4100) {
                String var108 = field1301[--Statics.field2239];
                int var109 = field1308[--Statics.field1315];
                field1301[++Statics.field2239 - 1] = var108 + var109;
                var110 = 1;
            } else if (arg0 == 4101) {
                Statics.field2239 -= 2;
                String var111 = field1301[Statics.field2239];
                String var112 = field1301[Statics.field2239 + 1];
                field1301[++Statics.field2239 - 1] = var111 + var112;
                var110 = 1;
            } else if (arg0 == 4102) {
                String var113 = field1301[--Statics.field2239];
                int var114 = field1308[--Statics.field1315];
                String[] var115 = field1301;
                int var116 = ++Statics.field2239 - 1;
                String var118;
                if (var114 < 0) {
                    var118 = Integer.toString(var114);
                } else {
                    int var119 = var114;
                    String var120;
                    if (var114 < 0) {
                        var120 = Integer.toString(var114, 10);
                    } else {
                        int var121 = 2;
                        int var122 = var114 / 10;
                        while (var122 != 0) {
                            var122 /= 10;
                            var121++;
                        }
                        char[] var123 = new char[var121];
                        var123[0] = '+';
                        for (int var124 = var121 - 1; var124 > 0; var124--) {
                            int var125 = var119;
                            var119 /= 10;
                            int var126 = var125 - var119 * 10;
                            if (var126 >= 10) {
                                var123[var124] = (char) (var126 + 87);
                            } else {
                                var123[var124] = (char) (var126 + 48);
                            }
                        }
                        var120 = new String(var123);
                    }
                    var118 = var120;
                }
                var115[var116] = var113 + var118;
                var110 = 1;
            } else if (arg0 == 4103) {
                String var127 = field1301[--Statics.field2239];
                field1301[++Statics.field2239 - 1] = var127.toLowerCase();
                var110 = 1;
            } else if (arg0 == 4104) {
                int var128 = field1308[--Statics.field1315];
                long var129 = ((long) var128 + 11745L) * 86400000L;
                field1312.setTime(new Date(var129));
                int var131 = field1312.get(5);
                int var132 = field1312.get(2);
                int var133 = field1312.get(1);
                field1301[++Statics.field2239 - 1] = var131 + "-" + field1313[var132] + "-" + var133;
                var110 = 1;
            } else if (arg0 == 4105) {
                Statics.field2239 -= 2;
                String var134 = field1301[Statics.field2239];
                String var135 = field1301[Statics.field2239 + 1];
                if (Statics.field2829.field858 != null && Statics.field2829.field858.field2600) {
                    field1301[++Statics.field2239 - 1] = var135;
                } else {
                    field1301[++Statics.field2239 - 1] = var134;
                }
                var110 = 1;
            } else if (arg0 == 4106) {
                int var136 = field1308[--Statics.field1315];
                field1301[++Statics.field2239 - 1] = Integer.toString(var136);
                var110 = 1;
            } else if (arg0 == 4107) {
                Statics.field2239 -= 2;
                int[] var137 = field1308;
                int var138 = ++Statics.field1315 - 1;
                String var139 = field1301[Statics.field2239];
                String var140 = field1301[Statics.field2239 + 1];
                int var141 = client.field899;
                int var142 = var139.length();
                int var143 = var140.length();
                int var144 = 0;
                int var145 = 0;
                char var146 = 0;
                char var147 = 0;
                int var156;
                label1482: while (true) {
                    if (var144 - var146 >= var142 && var145 - var147 >= var143) {
                        int var148 = Math.min(var142, var143);
                        for (int var149 = 0; var149 < var148; var149++) {
                            char var152 = var139.charAt(var149);
                            char var153 = var140.charAt(var149);
                            if (var152 != var153 && Character.toUpperCase(var152) != Character.toUpperCase(var153)) {
                                char var154 = Character.toLowerCase(var152);
                                char var155 = Character.toLowerCase(var153);
                                if (var154 != var155) {
                                    var156 = class165.method2818(var154, var141) - class165.method2818(var155, var141);
                                    break label1482;
                                }
                            }
                        }
                        int var157 = var142 - var143;
                        if (var157 != 0) {
                            var156 = var157;
                            break;
                        }
                        for (int var158 = 0; var158 < var148; var158++) {
                            char var159 = var139.charAt(var158);
                            char var160 = var140.charAt(var158);
                            if (var159 != var160) {
                                var156 = class165.method2818(var159, var141) - class165.method2818(var160, var141);
                                break label1482;
                            }
                        }
                        var156 = 0;
                        break;
                    }
                    if (var144 - var146 >= var142) {
                        var156 = -1;
                        break;
                    }
                    if (var145 - var147 >= var143) {
                        var156 = 1;
                        break;
                    }
                    char var161;
                    if (var146 == 0) {
                        var161 = var139.charAt(var144++);
                    } else {
                        var161 = var146;
                        boolean var162 = false;
                    }
                    char var163;
                    if (var147 == 0) {
                        var163 = var140.charAt(var145++);
                    } else {
                        var163 = var147;
                        boolean var164 = false;
                    }
                    var146 = class165.method44(var161);
                    var147 = class165.method44(var163);
                    char var165 = class165.method1706(var161, var141);
                    char var166 = class165.method1706(var163, var141);
                    if (var165 != var166 && Character.toUpperCase(var165) != Character.toUpperCase(var166)) {
                        char var167 = Character.toLowerCase(var165);
                        char var168 = Character.toLowerCase(var166);
                        if (var167 != var168) {
                            var156 = class165.method2818(var167, var141) - class165.method2818(var168, var141);
                            break;
                        }
                    }
                }
                var137[var138] = class271.method3160(var156);
                var110 = 1;
            } else if (arg0 == 4108) {
                String var169 = field1301[--Statics.field2239];
                Statics.field1315 -= 2;
                int var170 = field1308[Statics.field1315];
                int var171 = field1308[Statics.field1315 + 1];
                byte[] var172 = Statics.field2257.method3750(var171, 0);
                class264 var173 = new class264(var172);
                field1308[++Statics.field1315 - 1] = var173.method4405(var169, var170);
                var110 = 1;
            } else if (arg0 == 4109) {
                String var174 = field1301[--Statics.field2239];
                Statics.field1315 -= 2;
                int var175 = field1308[Statics.field1315];
                int var176 = field1308[Statics.field1315 + 1];
                byte[] var177 = Statics.field2257.method3750(var176, 0);
                class264 var178 = new class264(var177);
                field1308[++Statics.field1315 - 1] = var178.method4380(var174, var175);
                var110 = 1;
            } else if (arg0 == 4110) {
                Statics.field2239 -= 2;
                String var179 = field1301[Statics.field2239];
                String var180 = field1301[Statics.field2239 + 1];
                if (field1308[--Statics.field1315] == 1) {
                    field1301[++Statics.field2239 - 1] = var179;
                } else {
                    field1301[++Statics.field2239 - 1] = var180;
                }
                var110 = 1;
            } else if (arg0 == 4111) {
                String var181 = field1301[--Statics.field2239];
                field1301[++Statics.field2239 - 1] = class265.method4360(var181);
                var110 = 1;
            } else if (arg0 == 4112) {
                String var182 = field1301[--Statics.field2239];
                int var183 = field1308[--Statics.field1315];
                field1301[++Statics.field2239 - 1] = var182 + (char) var183;
                var110 = 1;
            } else if (arg0 == 4113) {
                int var184 = field1308[--Statics.field1315];
                int[] var185 = field1308;
                int var186 = ++Statics.field1315 - 1;
                char var187 = (char) var184;
                boolean var188;
                if (var187 >= ' ' && var187 <= '~') {
                    var188 = true;
                } else if (var187 >= 160 && var187 <= 255) {
                    var188 = true;
                } else if (var187 == 8364 || var187 == 338 || var187 == 8212 || var187 == 339 || var187 == 376) {
                    var188 = true;
                } else {
                    var188 = false;
                }
                var185[var186] = var188 ? 1 : 0;
                var110 = 1;
            } else if (arg0 == 4114) {
                int var189 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = class271.method1050((char) var189) ? 1 : 0;
                var110 = 1;
            } else if (arg0 == 4115) {
                int var190 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = class271.method3837((char) var190) ? 1 : 0;
                var110 = 1;
            } else if (arg0 == 4116) {
                int var191 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = class271.method2772((char) var191) ? 1 : 0;
                var110 = 1;
            } else if (arg0 == 4117) {
                String var192 = field1301[--Statics.field2239];
                if (var192 == null) {
                    field1308[++Statics.field1315 - 1] = 0;
                } else {
                    field1308[++Statics.field1315 - 1] = var192.length();
                }
                var110 = 1;
            } else if (arg0 == 4118) {
                String var193 = field1301[--Statics.field2239];
                Statics.field1315 -= 2;
                int var194 = field1308[Statics.field1315];
                int var195 = field1308[Statics.field1315 + 1];
                field1301[++Statics.field2239 - 1] = var193.substring(var194, var195);
                var110 = 1;
            } else if (arg0 == 4119) {
                String var196 = field1301[--Statics.field2239];
                StringBuilder var197 = new StringBuilder(var196.length());
                boolean var198 = false;
                for (int var199 = 0; var199 < var196.length(); var199++) {
                    char var200 = var196.charAt(var199);
                    if (var200 == '<') {
                        var198 = true;
                    } else if (var200 == '>') {
                        var198 = false;
                    } else if (!var198) {
                        var197.append(var200);
                    }
                }
                field1301[++Statics.field2239 - 1] = var197.toString();
                var110 = 1;
            } else if (arg0 == 4120) {
                String var201 = field1301[--Statics.field2239];
                int var202 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = var201.indexOf(var202);
                var110 = 1;
            } else if (arg0 == 4121) {
                Statics.field2239 -= 2;
                String var203 = field1301[Statics.field2239];
                String var204 = field1301[Statics.field2239 + 1];
                int var205 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = var203.indexOf(var204, var205);
                var110 = 1;
            } else {
                var110 = 2;
            }
            return var110;
        } else if (arg0 < 4300) {
            byte var207;
            if (arg0 == 4200) {
                int var206 = field1308[--Statics.field1315];
                field1301[++Statics.field2239 - 1] = Statics.method992(var206).field3477;
                var207 = 1;
            } else if (arg0 == 4201) {
                Statics.field1315 -= 2;
                int var208 = field1308[Statics.field1315];
                int var209 = field1308[Statics.field1315 + 1];
                class257 var210 = Statics.method992(var208);
                if (var209 < 1 || var209 > 5 || var210.field3491[var209 - 1] == null) {
                    field1301[++Statics.field2239 - 1] = "";
                } else {
                    field1301[++Statics.field2239 - 1] = var210.field3491[var209 - 1];
                }
                var207 = 1;
            } else if (arg0 == 4202) {
                Statics.field1315 -= 2;
                int var211 = field1308[Statics.field1315];
                int var212 = field1308[Statics.field1315 + 1];
                class257 var213 = Statics.method992(var211);
                if (var212 < 1 || var212 > 5 || var213.field3492[var212 - 1] == null) {
                    field1301[++Statics.field2239 - 1] = "";
                } else {
                    field1301[++Statics.field2239 - 1] = var213.field3492[var212 - 1];
                }
                var207 = 1;
            } else if (arg0 == 4203) {
                int var214 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = Statics.method992(var214).field3489;
                var207 = 1;
            } else if (arg0 == 4204) {
                int var215 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = Statics.method992(var215).field3511 == 1 ? 1 : 0;
                var207 = 1;
            } else if (arg0 == 4205) {
                int var216 = field1308[--Statics.field1315];
                class257 var217 = Statics.method992(var216);
                if (var217.field3500 == -1 && var217.field3508 >= 0) {
                    field1308[++Statics.field1315 - 1] = var217.field3508;
                } else {
                    field1308[++Statics.field1315 - 1] = var216;
                }
                var207 = 1;
            } else if (arg0 == 4206) {
                int var218 = field1308[--Statics.field1315];
                class257 var219 = Statics.method992(var218);
                if (var219.field3500 >= 0 && var219.field3508 >= 0) {
                    field1308[++Statics.field1315 - 1] = var219.field3508;
                } else {
                    field1308[++Statics.field1315 - 1] = var218;
                }
                var207 = 1;
            } else if (arg0 == 4207) {
                int var220 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = Statics.method992(var220).field3490 ? 1 : 0;
                var207 = 1;
            } else if (arg0 == 4208) {
                int var221 = field1308[--Statics.field1315];
                class257 var222 = Statics.method992(var221);
                if (var222.field3521 == -1 && var222.field3520 >= 0) {
                    field1308[++Statics.field1315 - 1] = var222.field3520;
                } else {
                    field1308[++Statics.field1315 - 1] = var221;
                }
                var207 = 1;
            } else if (arg0 == 4209) {
                int var223 = field1308[--Statics.field1315];
                class257 var224 = Statics.method992(var223);
                if (var224.field3521 >= 0 && var224.field3520 >= 0) {
                    field1308[++Statics.field1315 - 1] = var224.field3520;
                } else {
                    field1308[++Statics.field1315 - 1] = var223;
                }
                var207 = 1;
            } else if (arg0 == 4210) {
                String var225 = field1301[--Statics.field2239];
                int var226 = field1308[--Statics.field1315];
                client.method300(var225, var226 == 1);
                field1308[++Statics.field1315 - 1] = Statics.field696;
                var207 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field393 == null || Statics.field3342 >= Statics.field696) {
                    field1308[++Statics.field1315 - 1] = -1;
                } else {
                    field1308[++Statics.field1315 - 1] = Statics.field393[++Statics.field3342 - 1] & 0xFFFF;
                }
                var207 = 1;
            } else if (arg0 == 4212) {
                Statics.field3342 = 0;
                var207 = 1;
            } else {
                var207 = 2;
            }
            return var207;
        } else if (arg0 < 5100) {
            return method3(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            byte var227;
            if (arg0 == 5306) {
                field1308[++Statics.field1315 - 1] = client.method46();
                var227 = 1;
            } else if (arg0 == 5307) {
                int var228 = field1308[--Statics.field1315];
                if (var228 == 1 || var228 == 2) {
                    client.method86(var228);
                }
                var227 = 1;
            } else if (arg0 == 5308) {
                field1308[++Statics.field1315 - 1] = Statics.field2320.field1276;
                var227 = 1;
            } else if (arg0 == 5309) {
                int var229 = field1308[--Statics.field1315];
                if (var229 == 1 || var229 == 2) {
                    Statics.field2320.field1276 = var229;
                    class82.method1605();
                }
                var227 = 1;
            } else {
                var227 = 2;
            }
            return var227;
        } else if (arg0 < 5600) {
            return method136(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method990(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            byte var230;
            if (arg0 == 6200) {
                Statics.field1315 -= 2;
                client.field1071 = (short) field1308[Statics.field1315];
                if (client.field1071 <= 0) {
                    client.field1071 = 256;
                }
                client.field1001 = (short) field1308[Statics.field1315 + 1];
                if (client.field1001 <= 0) {
                    client.field1001 = 205;
                }
                var230 = 1;
            } else if (arg0 == 6201) {
                Statics.field1315 -= 2;
                client.field1139 = (short) field1308[Statics.field1315];
                if (client.field1139 <= 0) {
                    client.field1139 = 256;
                }
                client.field1018 = (short) field1308[Statics.field1315 + 1];
                if (client.field1018 <= 0) {
                    client.field1018 = 320;
                }
                var230 = 1;
            } else if (arg0 == 6202) {
                Statics.field1315 -= 4;
                client.field1141 = (short) field1308[Statics.field1315];
                if (client.field1141 <= 0) {
                    client.field1141 = 1;
                }
                client.field1142 = (short) field1308[Statics.field1315 + 1];
                if (client.field1142 <= 0) {
                    client.field1142 = 32767;
                } else if (client.field1142 < client.field1141) {
                    client.field1142 = client.field1141;
                }
                client.field1138 = (short) field1308[Statics.field1315 + 2];
                if (client.field1138 <= 0) {
                    client.field1138 = 1;
                }
                client.field1144 = (short) field1308[Statics.field1315 + 3];
                if (client.field1144 <= 0) {
                    client.field1144 = 32767;
                } else if (client.field1144 < client.field1138) {
                    client.field1144 = client.field1138;
                }
                var230 = 1;
            } else if (arg0 == 6203) {
                if (client.field1056 == null) {
                    field1308[++Statics.field1315 - 1] = -1;
                    field1308[++Statics.field1315 - 1] = -1;
                } else {
                    client.method1672(0, 0, client.field1056.field2645, client.field1056.field2634, false);
                    field1308[++Statics.field1315 - 1] = client.field940;
                    field1308[++Statics.field1315 - 1] = client.field1148;
                }
                var230 = 1;
            } else if (arg0 == 6204) {
                field1308[++Statics.field1315 - 1] = client.field1139;
                field1308[++Statics.field1315 - 1] = client.field1018;
                var230 = 1;
            } else if (arg0 == 6205) {
                field1308[++Statics.field1315 - 1] = client.field1071;
                field1308[++Statics.field1315 - 1] = client.field1001;
                var230 = 1;
            } else {
                var230 = 2;
            }
            return var230;
        } else if (arg0 < 6600) {
            byte var231;
            if (arg0 == 6500) {
                field1308[++Statics.field1315 - 1] = class81.method1559() ? 1 : 0;
                var231 = 1;
            } else if (arg0 == 6501) {
                class81 var232 = class81.method991();
                if (var232 == null) {
                    field1308[++Statics.field1315 - 1] = -1;
                    field1308[++Statics.field1315 - 1] = 0;
                    field1301[++Statics.field2239 - 1] = "";
                    field1308[++Statics.field1315 - 1] = 0;
                    field1308[++Statics.field1315 - 1] = 0;
                    field1301[++Statics.field2239 - 1] = "";
                } else {
                    field1308[++Statics.field1315 - 1] = var232.field1269;
                    field1308[++Statics.field1315 - 1] = var232.field1270;
                    field1301[++Statics.field2239 - 1] = var232.field1273;
                    field1308[++Statics.field1315 - 1] = var232.field1265;
                    field1308[++Statics.field1315 - 1] = var232.field1261;
                    field1301[++Statics.field2239 - 1] = var232.field1275;
                }
                var231 = 1;
            } else if (arg0 == 6502) {
                class81 var233;
                if (class81.field1262 < class81.field1264) {
                    var233 = Statics.field1263[++class81.field1262 - 1];
                } else {
                    var233 = null;
                }
                if (var233 == null) {
                    field1308[++Statics.field1315 - 1] = -1;
                    field1308[++Statics.field1315 - 1] = 0;
                    field1301[++Statics.field2239 - 1] = "";
                    field1308[++Statics.field1315 - 1] = 0;
                    field1308[++Statics.field1315 - 1] = 0;
                    field1301[++Statics.field2239 - 1] = "";
                } else {
                    field1308[++Statics.field1315 - 1] = var233.field1269;
                    field1308[++Statics.field1315 - 1] = var233.field1270;
                    field1301[++Statics.field2239 - 1] = var233.field1273;
                    field1308[++Statics.field1315 - 1] = var233.field1265;
                    field1308[++Statics.field1315 - 1] = var233.field1261;
                    field1301[++Statics.field2239 - 1] = var233.field1275;
                }
                var231 = 1;
            } else if (arg0 == 6506) {
                int var235 = field1308[--Statics.field1315];
                class81 var236 = null;
                for (int var237 = 0; var237 < class81.field1264; var237++) {
                    if (Statics.field1263[var237].field1269 == var235) {
                        var236 = Statics.field1263[var237];
                        break;
                    }
                }
                if (var236 == null) {
                    field1308[++Statics.field1315 - 1] = -1;
                    field1308[++Statics.field1315 - 1] = 0;
                    field1301[++Statics.field2239 - 1] = "";
                    field1308[++Statics.field1315 - 1] = 0;
                    field1308[++Statics.field1315 - 1] = 0;
                    field1301[++Statics.field2239 - 1] = "";
                } else {
                    field1308[++Statics.field1315 - 1] = var236.field1269;
                    field1308[++Statics.field1315 - 1] = var236.field1270;
                    field1301[++Statics.field2239 - 1] = var236.field1273;
                    field1308[++Statics.field1315 - 1] = var236.field1265;
                    field1308[++Statics.field1315 - 1] = var236.field1261;
                    field1301[++Statics.field2239 - 1] = var236.field1275;
                }
                var231 = 1;
            } else if (arg0 == 6507) {
                Statics.field1315 -= 4;
                int var238 = field1308[Statics.field1315];
                boolean var239 = field1308[Statics.field1315 + 1] == 1;
                int var240 = field1308[Statics.field1315 + 2];
                boolean var241 = field1308[Statics.field1315 + 3] == 1;
                class81.method32(var238, var239, var240, var241);
                var231 = 1;
            } else if (arg0 == 6511) {
                int var242 = field1308[--Statics.field1315];
                if (var242 >= 0 && var242 < class81.field1264) {
                    class81 var243 = Statics.field1263[var242];
                    field1308[++Statics.field1315 - 1] = var243.field1269;
                    field1308[++Statics.field1315 - 1] = var243.field1270;
                    field1301[++Statics.field2239 - 1] = var243.field1273;
                    field1308[++Statics.field1315 - 1] = var243.field1265;
                    field1308[++Statics.field1315 - 1] = var243.field1261;
                    field1301[++Statics.field2239 - 1] = var243.field1275;
                } else {
                    field1308[++Statics.field1315 - 1] = -1;
                    field1308[++Statics.field1315 - 1] = 0;
                    field1301[++Statics.field2239 - 1] = "";
                    field1308[++Statics.field1315 - 1] = 0;
                    field1308[++Statics.field1315 - 1] = 0;
                    field1301[++Statics.field2239 - 1] = "";
                }
                var231 = 1;
            } else if (arg0 == 6512) {
                client.field1031 = field1308[--Statics.field1315] == 1;
                var231 = 1;
            } else if (arg0 == 6513) {
                Statics.field1315 -= 2;
                int var244 = field1308[Statics.field1315];
                int var245 = field1308[Statics.field1315 + 1];
                class252 var246 = class252.method1696(var245);
                if (var246.method4029()) {
                    field1301[++Statics.field2239 - 1] = class259.method941(var244).method4243(var245, var246.field3370);
                } else {
                    field1308[++Statics.field1315 - 1] = class259.method941(var244).method4242(var245, var246.field3372);
                }
                var231 = 1;
            } else if (arg0 == 6514) {
                Statics.field1315 -= 2;
                int var247 = field1308[Statics.field1315];
                int var248 = field1308[Statics.field1315 + 1];
                class252 var249 = class252.method1696(var248);
                if (var249.method4029()) {
                    field1301[++Statics.field2239 - 1] = class256.method997(var247).method4161(var248, var249.field3370);
                } else {
                    field1308[++Statics.field1315 - 1] = class256.method997(var247).method4158(var248, var249.field3372);
                }
                var231 = 1;
            } else if (arg0 == 6515) {
                Statics.field1315 -= 2;
                int var250 = field1308[Statics.field1315];
                int var251 = field1308[Statics.field1315 + 1];
                class252 var252 = class252.method1696(var251);
                if (var252.method4029()) {
                    field1301[++Statics.field2239 - 1] = Statics.method992(var250).method4177(var251, var252.field3370);
                } else {
                    field1308[++Statics.field1315 - 1] = Statics.method992(var250).method4176(var251, var252.field3372);
                }
                var231 = 1;
            } else if (arg0 == 6516) {
                Statics.field1315 -= 2;
                int var253 = field1308[Statics.field1315];
                int var254 = field1308[Statics.field1315 + 1];
                class252 var255 = class252.method1696(var254);
                if (var255.method4029()) {
                    String[] var256 = field1301;
                    int var257 = ++Statics.field2239 - 1;
                    class253 var258 = (class253) class253.field3374.method3252((long) var253);
                    class253 var259;
                    if (var258 == null) {
                        byte[] var260 = Statics.field1465.method3750(34, var253);
                        class253 var261 = new class253();
                        if (var260 != null) {
                            var261.method4050(new class174(var260));
                        }
                        var261.method4049();
                        class253.field3374.method3256(var261, (long) var253);
                        var259 = var261;
                    } else {
                        var259 = var258;
                    }
                    var256[var257] = var259.method4058(var254, var255.field3370);
                } else {
                    field1308[++Statics.field1315 - 1] = class253.method53(var253).method4053(var254, var255.field3372);
                }
                var231 = 1;
            } else {
                var231 = 2;
            }
            return var231;
        } else if (arg0 < 6700) {
            byte var265;
            if (arg0 == 6600) {
                int var262 = Statics.field237;
                int var263 = (Statics.field2829.field1232 >> 7) + Statics.field448;
                int var264 = (Statics.field2829.field1191 >> 7) + Statics.field301;
                client.method73().method4804(var262, var263, var264, true);
                var265 = 1;
            } else if (arg0 == 6601) {
                int var266 = field1308[--Statics.field1315];
                String var267 = "";
                class33 var268 = client.method73().method4820(var266);
                if (var268 != null) {
                    var267 = var268.method249();
                }
                field1301[++Statics.field2239 - 1] = var267;
                var265 = 1;
            } else if (arg0 == 6602) {
                int var269 = field1308[--Statics.field1315];
                client.method73().method4805(var269);
                var265 = 1;
            } else if (arg0 == 6603) {
                field1308[++Statics.field1315 - 1] = client.method73().method4817();
                var265 = 1;
            } else if (arg0 == 6604) {
                int var270 = field1308[--Statics.field1315];
                client.method73().method4814(var270);
                var265 = 1;
            } else if (arg0 == 6605) {
                field1308[++Statics.field1315 - 1] = client.method73().method4795() ? 1 : 0;
                var265 = 1;
            } else if (arg0 == 6606) {
                class213 var271 = new class213(field1308[--Statics.field1315]);
                client.method73().method4821(var271.field2592, var271.field2593);
                var265 = 1;
            } else if (arg0 == 6607) {
                class213 var272 = new class213(field1308[--Statics.field1315]);
                client.method73().method4822(var272.field2592, var272.field2593);
                var265 = 1;
            } else if (arg0 == 6608) {
                class213 var273 = new class213(field1308[--Statics.field1315]);
                client.method73().method4823(var273.field2591, var273.field2592, var273.field2593);
                var265 = 1;
            } else if (arg0 == 6609) {
                class213 var274 = new class213(field1308[--Statics.field1315]);
                client.method73().method4824(var274.field2591, var274.field2592, var274.field2593);
                var265 = 1;
            } else if (arg0 == 6610) {
                field1308[++Statics.field1315 - 1] = client.method73().method4825();
                field1308[++Statics.field1315 - 1] = client.method73().method4949();
                var265 = 1;
            } else if (arg0 == 6611) {
                int var275 = field1308[--Statics.field1315];
                class33 var276 = client.method73().method4820(var275);
                if (var276 == null) {
                    field1308[++Statics.field1315 - 1] = 0;
                } else {
                    field1308[++Statics.field1315 - 1] = var276.method281().method3598();
                }
                var265 = 1;
            } else if (arg0 == 6612) {
                int var277 = field1308[--Statics.field1315];
                class33 var278 = client.method73().method4820(var277);
                if (var278 == null) {
                    field1308[++Statics.field1315 - 1] = 0;
                    field1308[++Statics.field1315 - 1] = 0;
                } else {
                    field1308[++Statics.field1315 - 1] = (var278.method253() - var278.method252() + 1) * 64;
                    field1308[++Statics.field1315 - 1] = (var278.method239() - var278.method282() + 1) * 64;
                }
                var265 = 1;
            } else if (arg0 == 6613) {
                int var279 = field1308[--Statics.field1315];
                class33 var280 = client.method73().method4820(var279);
                if (var280 == null) {
                    field1308[++Statics.field1315 - 1] = 0;
                    field1308[++Statics.field1315 - 1] = 0;
                    field1308[++Statics.field1315 - 1] = 0;
                    field1308[++Statics.field1315 - 1] = 0;
                } else {
                    field1308[++Statics.field1315 - 1] = var280.method252() * 64;
                    field1308[++Statics.field1315 - 1] = var280.method282() * 64;
                    field1308[++Statics.field1315 - 1] = var280.method253() * 64 + 64 - 1;
                    field1308[++Statics.field1315 - 1] = var280.method239() * 64 + 64 - 1;
                }
                var265 = 1;
            } else if (arg0 == 6614) {
                int var281 = field1308[--Statics.field1315];
                class33 var282 = client.method73().method4820(var281);
                if (var282 == null) {
                    field1308[++Statics.field1315 - 1] = -1;
                } else {
                    field1308[++Statics.field1315 - 1] = var282.method251();
                }
                var265 = 1;
            } else if (arg0 == 6615) {
                class213 var283 = client.method73().method4884();
                if (var283 == null) {
                    field1308[++Statics.field1315 - 1] = -1;
                    field1308[++Statics.field1315 - 1] = -1;
                } else {
                    field1308[++Statics.field1315 - 1] = var283.field2592;
                    field1308[++Statics.field1315 - 1] = var283.field2593;
                }
                var265 = 1;
            } else if (arg0 == 6616) {
                field1308[++Statics.field1315 - 1] = client.method73().method4806();
                var265 = 1;
            } else if (arg0 == 6617) {
                class213 var284 = new class213(field1308[--Statics.field1315]);
                class33 var285 = client.method73().method4944();
                if (var285 == null) {
                    field1308[++Statics.field1315 - 1] = -1;
                    field1308[++Statics.field1315 - 1] = -1;
                    var265 = 1;
                } else {
                    int[] var286 = var285.method243(var284.field2591, var284.field2592, var284.field2593);
                    if (var286 == null) {
                        field1308[++Statics.field1315 - 1] = -1;
                        field1308[++Statics.field1315 - 1] = -1;
                    } else {
                        field1308[++Statics.field1315 - 1] = var286[0];
                        field1308[++Statics.field1315 - 1] = var286[1];
                    }
                    var265 = 1;
                }
            } else if (arg0 == 6618) {
                class213 var287 = new class213(field1308[--Statics.field1315]);
                class33 var288 = client.method73().method4944();
                if (var288 == null) {
                    field1308[++Statics.field1315 - 1] = -1;
                    field1308[++Statics.field1315 - 1] = -1;
                    var265 = 1;
                } else {
                    class213 var289 = var288.method244(var287.field2592, var287.field2593);
                    if (var289 == null) {
                        field1308[++Statics.field1315 - 1] = -1;
                    } else {
                        field1308[++Statics.field1315 - 1] = var289.method3598();
                    }
                    var265 = 1;
                }
            } else if (arg0 == 6619) {
                Statics.field1315 -= 2;
                int var290 = field1308[Statics.field1315];
                class213 var291 = new class213(field1308[Statics.field1315 + 1]);
                method3872(var290, var291, false);
                var265 = 1;
            } else if (arg0 == 6620) {
                Statics.field1315 -= 2;
                int var292 = field1308[Statics.field1315];
                class213 var293 = new class213(field1308[Statics.field1315 + 1]);
                method3872(var292, var293, true);
                var265 = 1;
            } else if (arg0 == 6621) {
                Statics.field1315 -= 2;
                int var294 = field1308[Statics.field1315];
                class213 var295 = new class213(field1308[Statics.field1315 + 1]);
                class33 var296 = client.method73().method4820(var294);
                if (var296 == null) {
                    field1308[++Statics.field1315 - 1] = 0;
                    var265 = 1;
                } else {
                    field1308[++Statics.field1315 - 1] = var296.method241(var295.field2591, var295.field2592, var295.field2593) ? 1 : 0;
                    var265 = 1;
                }
            } else if (arg0 == 6622) {
                field1308[++Statics.field1315 - 1] = client.method73().method4828();
                field1308[++Statics.field1315 - 1] = client.method73().method4829();
                var265 = 1;
            } else if (arg0 == 6623) {
                class213 var297 = new class213(field1308[--Statics.field1315]);
                class33 var298 = client.method73().method4866(var297.field2591, var297.field2592, var297.field2593);
                if (var298 == null) {
                    field1308[++Statics.field1315 - 1] = -1;
                } else {
                    field1308[++Statics.field1315 - 1] = var298.method238();
                }
                var265 = 1;
            } else if (arg0 == 6624) {
                client.method73().method4830(field1308[--Statics.field1315]);
                var265 = 1;
            } else if (arg0 == 6625) {
                client.method73().method4937();
                var265 = 1;
            } else if (arg0 == 6626) {
                client.method73().method4800(field1308[--Statics.field1315]);
                var265 = 1;
            } else if (arg0 == 6627) {
                client.method73().method4882();
                var265 = 1;
            } else if (arg0 == 6628) {
                boolean var299 = field1308[--Statics.field1315] == 1;
                client.method73().method4834(var299);
                var265 = 1;
            } else if (arg0 == 6629) {
                int var300 = field1308[--Statics.field1315];
                client.method73().method4972(var300);
                var265 = 1;
            } else if (arg0 == 6630) {
                int var301 = field1308[--Statics.field1315];
                client.method73().method4836(var301);
                var265 = 1;
            } else if (arg0 == 6631) {
                client.method73().method4837();
                var265 = 1;
            } else if (arg0 == 6632) {
                boolean var302 = field1308[--Statics.field1315] == 1;
                client.method73().method4843(var302);
                var265 = 1;
            } else if (arg0 == 6633) {
                Statics.field1315 -= 2;
                int var303 = field1308[Statics.field1315];
                boolean var304 = field1308[Statics.field1315 + 1] == 1;
                client.method73().method4839(var303, var304);
                var265 = 1;
            } else if (arg0 == 6634) {
                Statics.field1315 -= 2;
                int var305 = field1308[Statics.field1315];
                boolean var306 = field1308[Statics.field1315 + 1] == 1;
                client.method73().method4840(var305, var306);
                var265 = 1;
            } else if (arg0 == 6635) {
                field1308[++Statics.field1315 - 1] = client.method73().method4841() ? 1 : 0;
                var265 = 1;
            } else if (arg0 == 6636) {
                int var307 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = client.method73().method4929(var307) ? 1 : 0;
                var265 = 1;
            } else if (arg0 == 6637) {
                int var308 = field1308[--Statics.field1315];
                field1308[++Statics.field1315 - 1] = client.method73().method4810(var308) ? 1 : 0;
                var265 = 1;
            } else if (arg0 == 6638) {
                Statics.field1315 -= 2;
                int var309 = field1308[Statics.field1315];
                class213 var310 = new class213(field1308[Statics.field1315 + 1]);
                class213 var311 = client.method73().method4846(var309, var310);
                if (var311 == null) {
                    field1308[++Statics.field1315 - 1] = -1;
                } else {
                    field1308[++Statics.field1315 - 1] = var311.method3598();
                }
                var265 = 1;
            } else if (arg0 == 6639) {
                class40 var312 = client.method73().method4807();
                if (var312 == null) {
                    field1308[++Statics.field1315 - 1] = -1;
                    field1308[++Statics.field1315 - 1] = -1;
                } else {
                    field1308[++Statics.field1315 - 1] = var312.field506;
                    field1308[++Statics.field1315 - 1] = var312.field505.method3598();
                }
                var265 = 1;
            } else if (arg0 == 6640) {
                class40 var313 = client.method73().method4849();
                if (var313 == null) {
                    field1308[++Statics.field1315 - 1] = -1;
                    field1308[++Statics.field1315 - 1] = -1;
                } else {
                    field1308[++Statics.field1315 - 1] = var313.field506;
                    field1308[++Statics.field1315 - 1] = var313.field505.method3598();
                }
                var265 = 1;
            } else if (arg0 == 6693) {
                int var314 = field1308[--Statics.field1315];
                class243 var315 = Statics.field3287[var314];
                if (var315.field3282 == null) {
                    field1301[++Statics.field2239 - 1] = "";
                } else {
                    field1301[++Statics.field2239 - 1] = var315.field3282;
                }
                var265 = 1;
            } else if (arg0 == 6694) {
                int var316 = field1308[--Statics.field1315];
                class243 var317 = Statics.field3287[var316];
                field1308[++Statics.field1315 - 1] = var317.field3284;
                var265 = 1;
            } else if (arg0 == 6695) {
                int var318 = field1308[--Statics.field1315];
                class243 var319 = Statics.field3287[var318];
                if (var319 == null) {
                    field1308[++Statics.field1315 - 1] = -1;
                } else {
                    field1308[++Statics.field1315 - 1] = var319.field3296;
                }
                var265 = 1;
            } else if (arg0 == 6696) {
                int var320 = field1308[--Statics.field1315];
                class243 var321 = Statics.field3287[var320];
                if (var321 == null) {
                    field1308[++Statics.field1315 - 1] = -1;
                } else {
                    field1308[++Statics.field1315 - 1] = var321.field3293;
                }
                var265 = 1;
            } else if (arg0 == 6697) {
                field1308[++Statics.field1315 - 1] = Statics.field520.field569;
                var265 = 1;
            } else if (arg0 == 6698) {
                field1308[++Statics.field1315 - 1] = Statics.field520.field566.method3598();
                var265 = 1;
            } else if (arg0 == 6699) {
                field1308[++Statics.field1315 - 1] = Statics.field520.field570.method3598();
                var265 = 1;
            } else {
                var265 = 2;
            }
            return var265;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eg.y(ILcd;ZI)I")
    public static int method2704(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1315 -= 3;
            int var3 = field1308[Statics.field1315];
            int var4 = field1308[Statics.field1315 + 1];
            int var5 = field1308[Statics.field1315 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class217 var6 = class217.method2656(var3);
            if (var6.field2754 == null) {
                var6.field2754 = new class217[var5 + 1];
            }
            if (var6.field2754.length <= var5) {
                class217[] var7 = new class217[var5 + 1];
                for (int var8 = 0; var8 < var6.field2754.length; var8++) {
                    var7[var8] = var6.field2754[var8];
                }
                var6.field2754 = var7;
            }
            if (var5 > 0 && var6.field2754[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class217 var9 = new class217();
            var9.field2695 = var4;
            var9.field2649 = var9.field2630 = var6.field2630;
            var9.field2631 = var5;
            var9.field2629 = true;
            var6.field2754[var5] = var9;
            if (arg2) {
                Statics.field2616 = var9;
            } else {
                Statics.field852 = var9;
            }
            client.method625(var6);
            return 1;
        } else if (arg0 == 101) {
            class217 var10 = arg2 ? Statics.field2616 : Statics.field852;
            class217 var11 = class217.method2656(var10.field2630);
            var11.field2754[var10.field2631] = null;
            client.method625(var11);
            return 1;
        } else if (arg0 == 102) {
            class217 var12 = class217.method2656(field1308[--Statics.field1315]);
            var12.field2754 = null;
            client.method625(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1315 -= 2;
            int var13 = field1308[Statics.field1315];
            int var14 = field1308[Statics.field1315 + 1];
            class217 var15 = class217.method2846(var13, var14);
            if (var15 == null || var14 == -1) {
                field1308[++Statics.field1315 - 1] = 0;
            } else {
                field1308[++Statics.field1315 - 1] = 1;
                if (arg2) {
                    Statics.field2616 = var15;
                } else {
                    Statics.field852 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class217 var16 = class217.method2656(field1308[--Statics.field1315]);
            if (var16 == null) {
                field1308[++Statics.field1315 - 1] = 0;
            } else {
                field1308[++Statics.field1315 - 1] = 1;
                if (arg2) {
                    Statics.field2616 = var16;
                } else {
                    Statics.field852 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.e(ILcd;ZI)I")
    public static int method1136(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1308[--Statics.field1315];
            var4 = class217.method2656(var3);
        } else {
            var4 = arg2 ? Statics.field2616 : Statics.field852;
        }
        if (arg0 == 1000) {
            Statics.field1315 -= 4;
            var4.field2639 = field1308[Statics.field1315];
            var4.field2640 = field1308[Statics.field1315 + 1];
            var4.field2635 = field1308[Statics.field1315 + 2];
            var4.field2697 = field1308[Statics.field1315 + 3];
            client.method625(var4);
            Statics.field1458.method1257(var4);
            if (var3 != -1 && var4.field2695 == 0) {
                client.method1389(Statics.field2321[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1315 -= 4;
            var4.field2641 = field1308[Statics.field1315];
            var4.field2642 = field1308[Statics.field1315 + 1];
            var4.field2738 = field1308[Statics.field1315 + 2];
            var4.field2638 = field1308[Statics.field1315 + 3];
            client.method625(var4);
            Statics.field1458.method1257(var4);
            if (var3 != -1 && var4.field2695 == 0) {
                client.method1389(Statics.field2321[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1308[--Statics.field1315] == 1;
            if (var4.field2655 != var5) {
                var4.field2655 = var5;
                client.method625(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2682 = field1308[--Statics.field1315] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2764 = field1308[--Statics.field1315] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aq.f(ILcd;ZS)I")
    public static int method489(int arg0, class100 arg1, boolean arg2) {
        int var3 = -1;
        class217 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1308[--Statics.field1315];
            var4 = class217.method2656(var3);
        } else {
            var4 = arg2 ? Statics.field2616 : Statics.field852;
        }
        if (arg0 == 1100) {
            Statics.field1315 -= 2;
            var4.field2651 = field1308[Statics.field1315];
            if (var4.field2651 > var4.field2667 - var4.field2645) {
                var4.field2651 = var4.field2667 - var4.field2645;
            }
            if (var4.field2651 < 0) {
                var4.field2651 = 0;
            }
            var4.field2713 = field1308[Statics.field1315 + 1];
            if (var4.field2713 > var4.field2654 - var4.field2634) {
                var4.field2713 = var4.field2654 - var4.field2634;
            }
            if (var4.field2713 < 0) {
                var4.field2713 = 0;
            }
            client.method625(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2711 = field1308[--Statics.field1315];
            client.method625(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2659 = field1308[--Statics.field1315] == 1;
            client.method625(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2661 = field1308[--Statics.field1315];
            client.method625(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2663 = field1308[--Statics.field1315];
            client.method625(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2665 = field1308[--Statics.field1315];
            client.method625(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2728 = field1308[--Statics.field1315];
            client.method625(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2734 = field1308[--Statics.field1315] == 1;
            client.method625(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2671 = 1;
            var4.field2674 = field1308[--Statics.field1315];
            client.method625(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1315 -= 6;
            var4.field2679 = field1308[Statics.field1315];
            var4.field2694 = field1308[Statics.field1315 + 1];
            var4.field2681 = field1308[Statics.field1315 + 2];
            var4.field2737 = field1308[Statics.field1315 + 3];
            var4.field2683 = field1308[Statics.field1315 + 4];
            var4.field2684 = field1308[Statics.field1315 + 5];
            client.method625(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1308[--Statics.field1315];
            if (var4.field2677 != var5) {
                var4.field2677 = var5;
                var4.field2752 = 0;
                var4.field2700 = 0;
                client.method625(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2687 = field1308[--Statics.field1315] == 1;
            client.method625(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1301[--Statics.field2239];
            if (!var6.equals(var4.field2690)) {
                var4.field2690 = var6;
                client.method625(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2689 = field1308[--Statics.field1315];
            client.method625(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1315 -= 3;
            var4.field2693 = field1308[Statics.field1315];
            var4.field2688 = field1308[Statics.field1315 + 1];
            var4.field2692 = field1308[Statics.field1315 + 2];
            client.method625(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2621 = field1308[--Statics.field1315] == 1;
            client.method625(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2669 = field1308[--Statics.field1315];
            client.method625(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2670 = field1308[--Statics.field1315];
            client.method625(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2726 = field1308[--Statics.field1315] == 1;
            client.method625(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2760 = field1308[--Statics.field1315] == 1;
            client.method625(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1315 -= 2;
            var4.field2667 = field1308[Statics.field1315];
            var4.field2654 = field1308[Statics.field1315 + 1];
            client.method625(var4);
            if (var3 != -1 && var4.field2695 == 0) {
                client.method1389(Statics.field2321[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2630;
            int var8 = var4.field2631;
            client.field937.method3133(161);
            client.field937.method2936(var8);
            client.field937.method3067(var7);
            client.field896 = var4;
            client.method625(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2666 = field1308[--Statics.field1315];
            client.method625(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2656 = field1308[--Statics.field1315];
            client.method625(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2662 = field1308[--Statics.field1315];
            client.method625(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var9 = field1308[--Statics.field1315];
            class284[] var10 = new class284[] { class284.field3752, class284.field3750, class284.field3756, class284.field3755, class284.field3751 };
            class284 var11 = (class284) class169.method2811(var10, var9);
            if (var11 != null) {
                var4.field2704 = var11;
                client.method625(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var12 = field1308[--Statics.field1315] == 1;
            var4.field2664 = var12;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.v(ILcd;ZI)I")
    public static int method940(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method2656(field1308[--Statics.field1315]);
        } else {
            var3 = arg2 ? Statics.field2616 : Statics.field852;
        }
        client.method625(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1315 -= 2;
            int var4 = field1308[Statics.field1315];
            int var5 = field1308[Statics.field1315 + 1];
            var3.field2750 = var4;
            var3.field2751 = var5;
            class257 var6 = Statics.method992(var4);
            var3.field2681 = var6.field3483;
            var3.field2737 = var6.field3484;
            var3.field2683 = var6.field3485;
            var3.field2679 = var6.field3486;
            var3.field2694 = var6.field3487;
            var3.field2684 = var6.field3466;
            if (arg0 == 1205) {
                var3.field2745 = 0;
            } else if (arg0 == 1212 | var6.field3511 == 1) {
                var3.field2745 = 1;
            } else {
                var3.field2745 = 2;
            }
            if (var3.field2685 > 0) {
                var3.field2684 = var3.field2684 * 32 / var3.field2685;
            } else if (var3.field2641 > 0) {
                var3.field2684 = var3.field2684 * 32 / var3.field2641;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2671 = 2;
            var3.field2674 = field1308[--Statics.field1315];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2671 = 3;
            var3.field2674 = Statics.field2829.field858.method3625();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("q.t(ILcd;ZB)I")
    public static int method2(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method2656(field1308[--Statics.field1315]);
        } else {
            var3 = arg2 ? Statics.field2616 : Statics.field852;
        }
        if (arg0 == 1300) {
            int var4 = field1308[--Statics.field1315] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3670(var4, field1301[--Statics.field2239]);
                return 1;
            } else {
                Statics.field2239--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1315 -= 2;
            int var5 = field1308[Statics.field1315];
            int var6 = field1308[Statics.field1315 + 1];
            var3.field2705 = class217.method2846(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2653 = field1308[--Statics.field1315] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2710 = field1308[--Statics.field1315];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2707 = field1308[--Statics.field1315];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2740 = field1301[--Statics.field2239];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2709 = field1301[--Statics.field2239];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2696 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ah.i(ILcd;ZI)I")
    public static int method466(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method2656(field1308[--Statics.field1315]);
        } else {
            var3 = arg2 ? Statics.field2616 : Statics.field852;
        }
        String var4 = field1301[--Statics.field2239];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1308[--Statics.field1315];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1308[--Statics.field1315];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1301[--Statics.field2239];
            } else {
                var7[var8] = Integer.valueOf(field1308[--Statics.field1315]);
            }
        }
        int var9 = field1308[--Statics.field1315];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2712 = var7;
        } else if (arg0 == 1401) {
            var3.field2715 = var7;
        } else if (arg0 == 1402) {
            var3.field2691 = var7;
        } else if (arg0 == 1403) {
            var3.field2716 = var7;
        } else if (arg0 == 1404) {
            var3.field2636 = var7;
        } else if (arg0 == 1405) {
            var3.field2719 = var7;
        } else if (arg0 == 1406) {
            var3.field2722 = var7;
        } else if (arg0 == 1407) {
            var3.field2723 = var7;
            var3.field2724 = var5;
        } else if (arg0 == 1408) {
            var3.field2703 = var7;
        } else if (arg0 == 1409) {
            var3.field2730 = var7;
        } else if (arg0 == 1410) {
            var3.field2720 = var7;
        } else if (arg0 == 1411) {
            var3.field2708 = var7;
        } else if (arg0 == 1412) {
            var3.field2717 = var7;
        } else if (arg0 == 1414) {
            var3.field2714 = var7;
            var3.field2753 = var5;
        } else if (arg0 == 1415) {
            var3.field2727 = var7;
            var3.field2747 = var5;
        } else if (arg0 == 1416) {
            var3.field2721 = var7;
        } else if (arg0 == 1417) {
            var3.field2731 = var7;
        } else if (arg0 == 1418) {
            var3.field2732 = var7;
        } else if (arg0 == 1419) {
            var3.field2733 = var7;
        } else if (arg0 == 1420) {
            var3.field2678 = var7;
        } else if (arg0 == 1421) {
            var3.field2632 = var7;
        } else if (arg0 == 1422) {
            var3.field2706 = var7;
        } else if (arg0 == 1423) {
            var3.field2686 = var7;
        } else if (arg0 == 1424) {
            var3.field2646 = var7;
        } else if (arg0 == 1425) {
            var3.field2763 = var7;
        } else if (arg0 == 1426) {
            var3.field2741 = var7;
        } else if (arg0 == 1427) {
            var3.field2742 = var7;
        } else {
            return 2;
        }
        var3.field2746 = true;
        return 1;
    }

    @ObfuscatedName("bc.r(ILcd;ZI)I")
    public static int method1010(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = arg2 ? Statics.field2616 : Statics.field852;
        if (arg0 == 1700) {
            field1308[++Statics.field1315 - 1] = var3.field2750;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2750 == -1) {
                field1308[++Statics.field1315 - 1] = 0;
            } else {
                field1308[++Statics.field1315 - 1] = var3.field2751;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1308[++Statics.field1315 - 1] = var3.field2631;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ax.s(ILcd;ZB)I")
    public static int method225(int arg0, class100 arg1, boolean arg2) {
        class217 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class217.method2656(field1308[--Statics.field1315]);
        } else {
            var3 = arg2 ? Statics.field2616 : Statics.field852;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1307 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2742 == null) {
            return 0;
        } else {
            class70 var4 = new class70();
            var4.field813 = var3;
            var4.field819 = var3.field2742;
            var4.field821 = field1307 + 1;
            client.field1083.method3318(var4);
            return 1;
        }
    }

    @ObfuscatedName("j.o(ILcd;ZI)I")
    public static int method165(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method2656(field1308[--Statics.field1315]);
        if (arg0 == 2500) {
            field1308[++Statics.field1315 - 1] = var3.field2643;
            return 1;
        } else if (arg0 == 2501) {
            field1308[++Statics.field1315 - 1] = var3.field2644;
            return 1;
        } else if (arg0 == 2502) {
            field1308[++Statics.field1315 - 1] = var3.field2645;
            return 1;
        } else if (arg0 == 2503) {
            field1308[++Statics.field1315 - 1] = var3.field2634;
            return 1;
        } else if (arg0 == 2504) {
            field1308[++Statics.field1315 - 1] = var3.field2655 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1308[++Statics.field1315 - 1] = var3.field2649;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cr.p(ILcd;ZI)I")
    public static int method1694(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method2656(field1308[--Statics.field1315]);
        if (arg0 == 2600) {
            field1308[++Statics.field1315 - 1] = var3.field2651;
            return 1;
        } else if (arg0 == 2601) {
            field1308[++Statics.field1315 - 1] = var3.field2713;
            return 1;
        } else if (arg0 == 2602) {
            field1301[++Statics.field2239 - 1] = var3.field2690;
            return 1;
        } else if (arg0 == 2603) {
            field1308[++Statics.field1315 - 1] = var3.field2667;
            return 1;
        } else if (arg0 == 2604) {
            field1308[++Statics.field1315 - 1] = var3.field2654;
            return 1;
        } else if (arg0 == 2605) {
            field1308[++Statics.field1315 - 1] = var3.field2684;
            return 1;
        } else if (arg0 == 2606) {
            field1308[++Statics.field1315 - 1] = var3.field2681;
            return 1;
        } else if (arg0 == 2607) {
            field1308[++Statics.field1315 - 1] = var3.field2683;
            return 1;
        } else if (arg0 == 2608) {
            field1308[++Statics.field1315 - 1] = var3.field2737;
            return 1;
        } else if (arg0 == 2609) {
            field1308[++Statics.field1315 - 1] = var3.field2661;
            return 1;
        } else if (arg0 == 2610) {
            field1308[++Statics.field1315 - 1] = var3.field2662;
            return 1;
        } else if (arg0 == 2611) {
            field1308[++Statics.field1315 - 1] = var3.field2711;
            return 1;
        } else if (arg0 == 2612) {
            field1308[++Statics.field1315 - 1] = var3.field2656;
            return 1;
        } else if (arg0 == 2613) {
            field1308[++Statics.field1315 - 1] = var3.field2704.method8();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bh.u(ILcd;ZI)I")
    public static int method739(int arg0, class100 arg1, boolean arg2) {
        class217 var3 = class217.method2656(field1308[--Statics.field1315]);
        if (arg0 == 2800) {
            field1308[++Statics.field1315 - 1] = class218.method2674(client.method2879(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1308[--Statics.field1315];
            int var5 = var4 - 1;
            if (var3.field2696 == null || var5 >= var3.field2696.length || var3.field2696[var5] == null) {
                field1301[++Statics.field2239 - 1] = "";
            } else {
                field1301[++Statics.field2239 - 1] = var3.field2696[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2740 == null) {
                field1301[++Statics.field2239 - 1] = "";
            } else {
                field1301[++Statics.field2239 - 1] = var3.field2740;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gh.b(ILcd;ZI)I")
    public static int method3566(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1301[--Statics.field2239];
            class99.method3389(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1315 -= 2;
            client.method678(Statics.field2829, field1308[Statics.field1315], field1308[Statics.field1315 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            client.method3129();
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1301[--Statics.field2239];
            int var5 = 0;
            boolean var6 = false;
            boolean var7 = false;
            int var8 = 0;
            int var9 = var4.length();
            int var10 = 0;
            boolean var12;
            while (true) {
                if (var10 >= var9) {
                    var12 = var7;
                    break;
                }
                label209: {
                    char var11 = var4.charAt(var10);
                    if (var10 == 0) {
                        if (var11 == '-') {
                            var6 = true;
                            break label209;
                        }
                        if (var11 == '+') {
                            break label209;
                        }
                    }
                    int var33;
                    if (var11 >= '0' && var11 <= '9') {
                        var33 = var11 - '0';
                    } else if (var11 >= 'A' && var11 <= 'Z') {
                        var33 = var11 - '7';
                    } else {
                        if (var11 < 'a' || var11 > 'z') {
                            var12 = false;
                            break;
                        }
                        var33 = var11 - 'W';
                    }
                    if (var33 >= 10) {
                        var12 = false;
                        break;
                    }
                    if (var6) {
                        var33 = -var33;
                    }
                    int var13 = var8 * 10 + var33;
                    if (var13 / 10 != var8) {
                        var12 = false;
                        break;
                    }
                    var8 = var13;
                    var7 = true;
                }
                var10++;
            }
            if (var12) {
                int var15 = class271.method2729(var4, 10, true);
                var5 = var15;
            }
            client.field937.method3133(119);
            client.field937.method2902(var5);
            return 1;
        } else if (arg0 == 3105) {
            String var16 = field1301[--Statics.field2239];
            client.field937.method3133(134);
            client.field937.method2899(var16.length() + 1);
            client.field937.method2905(var16);
            return 1;
        } else if (arg0 == 3106) {
            String var17 = field1301[--Statics.field2239];
            client.field937.method3133(65);
            client.field937.method2899(var17.length() + 1);
            client.field937.method2905(var17);
            return 1;
        } else if (arg0 == 3107) {
            int var18 = field1308[--Statics.field1315];
            String var19 = field1301[--Statics.field2239];
            client.method1673(var18, var19);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1315 -= 3;
            int var20 = field1308[Statics.field1315];
            int var21 = field1308[Statics.field1315 + 1];
            int var22 = field1308[Statics.field1315 + 2];
            class217 var23 = class217.method2656(var22);
            client.method164(var23, var20, var21);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1315 -= 2;
            int var24 = field1308[Statics.field1315];
            int var25 = field1308[Statics.field1315 + 1];
            class217 var26 = arg2 ? Statics.field2616 : Statics.field852;
            client.method164(var26, var24, var25);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field793 = field1308[--Statics.field1315] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1308[++Statics.field1315 - 1] = Statics.field2320.field1278 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field2320.field1278 = field1308[--Statics.field1315] == 1;
            class82.method1605();
            return 1;
        } else if (arg0 == 3113) {
            String var27 = field1301[--Statics.field2239];
            boolean var28 = field1308[--Statics.field1315] == 1;
            class57.method1708(var27, var28, false);
            return 1;
        } else if (arg0 == 3115) {
            int var29 = field1308[--Statics.field1315];
            client.field937.method3133(221);
            client.field937.method2900(var29);
            return 1;
        } else if (arg0 == 3116) {
            int var30 = field1308[--Statics.field1315];
            Statics.field2239 -= 2;
            String var31 = field1301[Statics.field2239];
            String var32 = field1301[Statics.field2239 + 1];
            if (var31.length() > 500) {
                return 1;
            } else if (var32.length() > 500) {
                return 1;
            } else {
                client.field937.method3133(184);
                client.field937.method2900(1 + Statics.method2363(var31) + Statics.method2363(var32));
                client.field937.method2905(var32);
                client.field937.method2905(var31);
                client.field937.method2899(var30);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field1032 = field1308[--Statics.field1315] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.w(ILcd;ZI)I")
    public static int method936(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1315 -= 2;
            int var3 = field1308[Statics.field1315];
            int var4 = field1308[Statics.field1315 + 1];
            class254 var5 = class254.method3740(var3);
            if (var5.field3388 != 's') {
            }
            for (int var6 = 0; var6 < var5.field3382; var6++) {
                if (var5.field3383[var6] == var4) {
                    field1301[++Statics.field2239 - 1] = var5.field3387[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field1301[++Statics.field2239 - 1] = var5.field3380;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1315 -= 4;
            int var7 = field1308[Statics.field1315];
            int var8 = field1308[Statics.field1315 + 1];
            int var9 = field1308[Statics.field1315 + 2];
            int var10 = field1308[Statics.field1315 + 3];
            class254 var11 = class254.method3740(var9);
            if (var11.field3378 != var7 || var11.field3388 != var8) {
                if (var8 == 115) {
                    field1301[++Statics.field2239 - 1] = "null";
                } else {
                    field1308[++Statics.field1315 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field3382; var12++) {
                if (var11.field3383[var12] == var10) {
                    if (var8 == 115) {
                        field1301[++Statics.field2239 - 1] = var11.field3387[var12];
                    } else {
                        field1308[++Statics.field1315 - 1] = var11.field3384[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field1301[++Statics.field2239 - 1] = var11.field3380;
                } else {
                    field1308[++Statics.field1315 - 1] = var11.field3381;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hr.k(ILcd;ZI)I")
    public static int method3589(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1308[--Statics.field1315];
            field1308[++Statics.field1315 - 1] = client.field1159[var3].method90();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1308[--Statics.field1315];
            field1308[++Statics.field1315 - 1] = client.field1159[var4].field292;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1308[--Statics.field1315];
            field1308[++Statics.field1315 - 1] = client.field1159[var5].field297;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1308[--Statics.field1315];
            field1308[++Statics.field1315 - 1] = client.field1159[var6].field293;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1308[--Statics.field1315];
            field1308[++Statics.field1315 - 1] = client.field1159[var7].field294;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1308[--Statics.field1315];
            field1308[++Statics.field1315 - 1] = client.field1159[var8].field295;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1308[--Statics.field1315];
            int var10 = client.field1159[var9].method96();
            field1308[++Statics.field1315 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1308[--Statics.field1315];
            int var12 = client.field1159[var11].method96();
            field1308[++Statics.field1315 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1308[--Statics.field1315];
            int var14 = client.field1159[var13].method96();
            field1308[++Statics.field1315 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1308[--Statics.field1315];
            int var16 = client.field1159[var15].method96();
            field1308[++Statics.field1315 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1308[--Statics.field1315] == 1;
            if (Statics.field3351 != null) {
                Statics.field3351.method66(class14.field276, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1308[--Statics.field1315] == 1;
            if (Statics.field3351 != null) {
                Statics.field3351.method66(class14.field267, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1315 -= 2;
            boolean var19 = field1308[Statics.field1315] == 1;
            boolean var20 = field1308[Statics.field1315 + 1] == 1;
            if (Statics.field3351 != null) {
                Statics.field3351.method66(new class96(var20), var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1308[--Statics.field1315] == 1;
            if (Statics.field3351 != null) {
                Statics.field3351.method66(class14.field266, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1308[--Statics.field1315] == 1;
            if (Statics.field3351 != null) {
                Statics.field3351.method66(class14.field269, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1308[++Statics.field1315 - 1] = Statics.field3351 == null ? 0 : Statics.field3351.field271.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1308[--Statics.field1315];
            class15 var24 = (class15) Statics.field3351.field271.get(var23);
            field1308[++Statics.field1315 - 1] = var24.field278;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1308[--Statics.field1315];
            class15 var26 = (class15) Statics.field3351.field271.get(var25);
            field1301[++Statics.field2239 - 1] = var26.method72();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1308[--Statics.field1315];
            class15 var28 = (class15) Statics.field3351.field271.get(var27);
            field1301[++Statics.field2239 - 1] = var28.method76();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1308[--Statics.field1315];
            class15 var30 = (class15) Statics.field3351.field271.get(var29);
            long var31 = class176.method3746() - Statics.field623 - var30.field279;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1301[++Statics.field2239 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1308[--Statics.field1315];
            class15 var38 = (class15) Statics.field3351.field271.get(var37);
            field1308[++Statics.field1315 - 1] = var38.field280.field293;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1308[--Statics.field1315];
            class15 var40 = (class15) Statics.field3351.field271.get(var39);
            field1308[++Statics.field1315 - 1] = var40.field280.field297;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1308[--Statics.field1315];
            class15 var42 = (class15) Statics.field3351.field271.get(var41);
            field1308[++Statics.field1315 - 1] = var42.field280.field292;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dp.c(ILcd;ZI)I")
    public static int method1976(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field1315 -= 2;
            int var3 = field1308[Statics.field1315];
            int var4 = field1308[Statics.field1315 + 1];
            field1308[++Statics.field1315 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field1315 -= 2;
            int var5 = field1308[Statics.field1315];
            int var6 = field1308[Statics.field1315 + 1];
            field1308[++Statics.field1315 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field1315 -= 2;
            int var7 = field1308[Statics.field1315];
            int var8 = field1308[Statics.field1315 + 1];
            field1308[++Statics.field1315 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field1315 -= 2;
            int var9 = field1308[Statics.field1315];
            int var10 = field1308[Statics.field1315 + 1];
            field1308[++Statics.field1315 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1308[--Statics.field1315];
            field1308[++Statics.field1315 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1308[--Statics.field1315];
            field1308[++Statics.field1315 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field1315 -= 5;
            int var13 = field1308[Statics.field1315];
            int var14 = field1308[Statics.field1315 + 1];
            int var15 = field1308[Statics.field1315 + 2];
            int var16 = field1308[Statics.field1315 + 3];
            int var17 = field1308[Statics.field1315 + 4];
            field1308[++Statics.field1315 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field1315 -= 2;
            int var18 = field1308[Statics.field1315];
            int var19 = field1308[Statics.field1315 + 1];
            field1308[++Statics.field1315 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field1315 -= 2;
            int var20 = field1308[Statics.field1315];
            int var21 = field1308[Statics.field1315 + 1];
            field1308[++Statics.field1315 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field1315 -= 2;
            int var22 = field1308[Statics.field1315];
            int var23 = field1308[Statics.field1315 + 1];
            field1308[++Statics.field1315 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field1315 -= 2;
            int var24 = field1308[Statics.field1315];
            int var25 = field1308[Statics.field1315 + 1];
            field1308[++Statics.field1315 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field1315 -= 2;
            int var26 = field1308[Statics.field1315];
            int var27 = field1308[Statics.field1315 + 1];
            field1308[++Statics.field1315 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field1315 -= 2;
            int var28 = field1308[Statics.field1315];
            int var29 = field1308[Statics.field1315 + 1];
            if (var28 == 0) {
                field1308[++Statics.field1315 - 1] = 0;
            } else {
                field1308[++Statics.field1315 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field1315 -= 2;
            int var30 = field1308[Statics.field1315];
            int var31 = field1308[Statics.field1315 + 1];
            if (var30 == 0) {
                field1308[++Statics.field1315 - 1] = 0;
            } else if (var31 == 0) {
                field1308[++Statics.field1315 - 1] = Integer.MAX_VALUE;
            } else {
                field1308[++Statics.field1315 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field1315 -= 2;
            int var32 = field1308[Statics.field1315];
            int var33 = field1308[Statics.field1315 + 1];
            field1308[++Statics.field1315 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field1315 -= 2;
            int var34 = field1308[Statics.field1315];
            int var35 = field1308[Statics.field1315 + 1];
            field1308[++Statics.field1315 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field1315 -= 3;
            long var36 = (long) field1308[Statics.field1315];
            long var38 = (long) field1308[Statics.field1315 + 1];
            long var40 = (long) field1308[Statics.field1315 + 2];
            field1308[++Statics.field1315 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("x.h(ILcd;ZI)I")
    public static int method3(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1308[++Statics.field1315 - 1] = client.field1101;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1315 -= 3;
            client.field1101 = field1308[Statics.field1315];
            int var3 = field1308[Statics.field1315 + 1];
            class277[] var4 = class277.method2651();
            int var5 = 0;
            class277 var7;
            while (true) {
                if (var5 >= var4.length) {
                    var7 = null;
                    break;
                }
                class277 var6 = var4[var5];
                if (var6.field3723 == var3) {
                    var7 = var6;
                    break;
                }
                var5++;
            }
            Statics.field3722 = var7;
            if (Statics.field3722 == null) {
                Statics.field3722 = class277.field3719;
            }
            client.field1045 = field1308[Statics.field1315 + 2];
            client.field937.method3133(215);
            client.field937.method2899(client.field1101);
            client.field937.method2899(Statics.field3722.field3723);
            client.field937.method2899(client.field1045);
            return 1;
        } else if (arg0 == 5002) {
            String var8 = field1301[--Statics.field2239];
            Statics.field1315 -= 2;
            int var9 = field1308[Statics.field1315];
            int var10 = field1308[Statics.field1315 + 1];
            client.field937.method3133(160);
            client.field937.method2899(Statics.method2363(var8) + 2);
            client.field937.method2905(var8);
            client.field937.method2899(var9 - 1);
            client.field937.method2899(var10);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1315 -= 2;
            int var11 = field1308[Statics.field1315];
            int var12 = field1308[Statics.field1315 + 1];
            class73 var13 = class99.method480(var11, var12);
            if (var13 == null) {
                field1308[++Statics.field1315 - 1] = -1;
                field1308[++Statics.field1315 - 1] = 0;
                field1301[++Statics.field2239 - 1] = "";
                field1301[++Statics.field2239 - 1] = "";
                field1301[++Statics.field2239 - 1] = "";
            } else {
                field1308[++Statics.field1315 - 1] = var13.field847;
                field1308[++Statics.field1315 - 1] = var13.field845;
                field1301[++Statics.field2239 - 1] = var13.field848 == null ? "" : var13.field848;
                field1301[++Statics.field2239 - 1] = var13.field844 == null ? "" : var13.field844;
                field1301[++Statics.field2239 - 1] = var13.field849 == null ? "" : var13.field849;
            }
            return 1;
        } else if (arg0 == 5004) {
            int var14 = field1308[--Statics.field1315];
            class73 var15 = (class73) class99.field1495.method3224((long) var14);
            if (var15 == null) {
                field1308[++Statics.field1315 - 1] = -1;
                field1308[++Statics.field1315 - 1] = 0;
                field1301[++Statics.field2239 - 1] = "";
                field1301[++Statics.field2239 - 1] = "";
                field1301[++Statics.field2239 - 1] = "";
            } else {
                field1308[++Statics.field1315 - 1] = var15.field846;
                field1308[++Statics.field1315 - 1] = var15.field845;
                field1301[++Statics.field2239 - 1] = var15.field848 == null ? "" : var15.field848;
                field1301[++Statics.field2239 - 1] = var15.field844 == null ? "" : var15.field844;
                field1301[++Statics.field2239 - 1] = var15.field849 == null ? "" : var15.field849;
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field3722 == null) {
                field1308[++Statics.field1315 - 1] = -1;
            } else {
                field1308[++Statics.field1315 - 1] = Statics.field3722.field3723;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var17 = field1301[--Statics.field2239];
            int var18 = field1308[--Statics.field1315];
            String var19 = var17.toLowerCase();
            byte var20 = 0;
            if (var19.startsWith(class226.field2945)) {
                var20 = 0;
                var17 = var17.substring(class226.field2945.length());
            } else if (var19.startsWith(class226.field3012)) {
                var20 = 1;
                var17 = var17.substring(class226.field3012.length());
            } else if (var19.startsWith(class226.field3014)) {
                var20 = 2;
                var17 = var17.substring(class226.field3014.length());
            } else if (var19.startsWith(class226.field3016)) {
                var20 = 3;
                var17 = var17.substring(class226.field3016.length());
            } else if (var19.startsWith(class226.field3018)) {
                var20 = 4;
                var17 = var17.substring(class226.field3018.length());
            } else if (var19.startsWith(class226.field3020)) {
                var20 = 5;
                var17 = var17.substring(class226.field3020.length());
            } else if (var19.startsWith(class226.field3064)) {
                var20 = 6;
                var17 = var17.substring(class226.field3064.length());
            } else if (var19.startsWith(class226.field3024)) {
                var20 = 7;
                var17 = var17.substring(class226.field3024.length());
            } else if (var19.startsWith(class226.field3026)) {
                var20 = 8;
                var17 = var17.substring(class226.field3026.length());
            } else if (var19.startsWith(class226.field3028)) {
                var20 = 9;
                var17 = var17.substring(class226.field3028.length());
            } else if (var19.startsWith(class226.field3030)) {
                var20 = 10;
                var17 = var17.substring(class226.field3030.length());
            } else if (var19.startsWith(class226.field3032)) {
                var20 = 11;
                var17 = var17.substring(class226.field3032.length());
            } else if (client.field899 != 0) {
                if (var19.startsWith(class226.field3011)) {
                    var20 = 0;
                    var17 = var17.substring(class226.field3011.length());
                } else if (var19.startsWith(class226.field3013)) {
                    var20 = 1;
                    var17 = var17.substring(class226.field3013.length());
                } else if (var19.startsWith(class226.field3015)) {
                    var20 = 2;
                    var17 = var17.substring(class226.field3015.length());
                } else if (var19.startsWith(class226.field3017)) {
                    var20 = 3;
                    var17 = var17.substring(class226.field3017.length());
                } else if (var19.startsWith(class226.field3052)) {
                    var20 = 4;
                    var17 = var17.substring(class226.field3052.length());
                } else if (var19.startsWith(class226.field2841)) {
                    var20 = 5;
                    var17 = var17.substring(class226.field2841.length());
                } else if (var19.startsWith(class226.field3078)) {
                    var20 = 6;
                    var17 = var17.substring(class226.field3078.length());
                } else if (var19.startsWith(class226.field3025)) {
                    var20 = 7;
                    var17 = var17.substring(class226.field3025.length());
                } else if (var19.startsWith(class226.field2920)) {
                    var20 = 8;
                    var17 = var17.substring(class226.field2920.length());
                } else if (var19.startsWith(class226.field3029)) {
                    var20 = 9;
                    var17 = var17.substring(class226.field3029.length());
                } else if (var19.startsWith(class226.field2994)) {
                    var20 = 10;
                    var17 = var17.substring(class226.field2994.length());
                } else if (var19.startsWith(class226.field2955)) {
                    var20 = 11;
                    var17 = var17.substring(class226.field2955.length());
                }
            }
            String var21 = var17.toLowerCase();
            byte var22 = 0;
            if (var21.startsWith(class226.field3087)) {
                var22 = 1;
                var17 = var17.substring(class226.field3087.length());
            } else if (var21.startsWith(class226.field3036)) {
                var22 = 2;
                var17 = var17.substring(class226.field3036.length());
            } else if (var21.startsWith(class226.field3038)) {
                var22 = 3;
                var17 = var17.substring(class226.field3038.length());
            } else if (var21.startsWith(class226.field2983)) {
                var22 = 4;
                var17 = var17.substring(class226.field2983.length());
            } else if (var21.startsWith(class226.field3042)) {
                var22 = 5;
                var17 = var17.substring(class226.field3042.length());
            } else if (client.field899 != 0) {
                if (var21.startsWith(class226.field2861)) {
                    var22 = 1;
                    var17 = var17.substring(class226.field2861.length());
                } else if (var21.startsWith(class226.field3037)) {
                    var22 = 2;
                    var17 = var17.substring(class226.field3037.length());
                } else if (var21.startsWith(class226.field2845)) {
                    var22 = 3;
                    var17 = var17.substring(class226.field2845.length());
                } else if (var21.startsWith(class226.field3041)) {
                    var22 = 4;
                    var17 = var17.substring(class226.field3041.length());
                } else if (var21.startsWith(class226.field3043)) {
                    var22 = 5;
                    var17 = var17.substring(class226.field3043.length());
                }
            }
            client.field937.method3133(174);
            client.field937.method2899(0);
            int var23 = client.field937.field2364;
            client.field937.method2899(var18);
            client.field937.method2899(var20);
            client.field937.method2899(var22);
            class180 var24 = client.field937;
            int var25 = var24.field2364;
            int var26 = var17.length();
            byte[] var27 = new byte[var26];
            for (int var28 = 0; var28 < var26; var28++) {
                char var29 = var17.charAt(var28);
                if (var29 > 0 && var29 < 128 || var29 >= 160 && var29 <= 255) {
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
            var24.method2912(var27.length);
            var24.field2364 += Statics.field3640.method2835(var27, 0, var27.length, var24.field2367, var24.field2364);
            client.field937.method3047(client.field937.field2364 - var23);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field2239 -= 2;
            String var32 = field1301[Statics.field2239];
            String var33 = field1301[Statics.field2239 + 1];
            client.field937.method3133(45);
            client.field937.method2900(0);
            int var34 = client.field937.field2364;
            client.field937.method2905(var32);
            class180 var35 = client.field937;
            int var36 = var35.field2364;
            int var37 = var33.length();
            byte[] var38 = new byte[var37];
            for (int var39 = 0; var39 < var37; var39++) {
                char var40 = var33.charAt(var39);
                if (var40 > 0 && var40 < 128 || var40 >= 160 && var40 <= 255) {
                    var38[var39] = (byte) var40;
                } else if (var40 == 8364) {
                    var38[var39] = -128;
                } else if (var40 == 8218) {
                    var38[var39] = -126;
                } else if (var40 == 402) {
                    var38[var39] = -125;
                } else if (var40 == 8222) {
                    var38[var39] = -124;
                } else if (var40 == 8230) {
                    var38[var39] = -123;
                } else if (var40 == 8224) {
                    var38[var39] = -122;
                } else if (var40 == 8225) {
                    var38[var39] = -121;
                } else if (var40 == 710) {
                    var38[var39] = -120;
                } else if (var40 == 8240) {
                    var38[var39] = -119;
                } else if (var40 == 352) {
                    var38[var39] = -118;
                } else if (var40 == 8249) {
                    var38[var39] = -117;
                } else if (var40 == 338) {
                    var38[var39] = -116;
                } else if (var40 == 381) {
                    var38[var39] = -114;
                } else if (var40 == 8216) {
                    var38[var39] = -111;
                } else if (var40 == 8217) {
                    var38[var39] = -110;
                } else if (var40 == 8220) {
                    var38[var39] = -109;
                } else if (var40 == 8221) {
                    var38[var39] = -108;
                } else if (var40 == 8226) {
                    var38[var39] = -107;
                } else if (var40 == 8211) {
                    var38[var39] = -106;
                } else if (var40 == 8212) {
                    var38[var39] = -105;
                } else if (var40 == 732) {
                    var38[var39] = -104;
                } else if (var40 == 8482) {
                    var38[var39] = -103;
                } else if (var40 == 353) {
                    var38[var39] = -102;
                } else if (var40 == 8250) {
                    var38[var39] = -101;
                } else if (var40 == 339) {
                    var38[var39] = -100;
                } else if (var40 == 382) {
                    var38[var39] = -98;
                } else if (var40 == 376) {
                    var38[var39] = -97;
                } else {
                    var38[var39] = 63;
                }
            }
            var35.method2912(var38.length);
            var35.field2364 += Statics.field3640.method2835(var38, 0, var38.length, var35.field2367, var35.field2364);
            client.field937.method2910(client.field937.field2364 - var34);
            return 1;
        } else if (arg0 == 5015) {
            String var43;
            if (Statics.field2829 == null || Statics.field2829.field875 == null) {
                var43 = "";
            } else {
                var43 = Statics.field2829.field875;
            }
            field1301[++Statics.field2239 - 1] = var43;
            return 1;
        } else if (arg0 == 5016) {
            field1308[++Statics.field1315 - 1] = client.field1045;
            return 1;
        } else if (arg0 == 5017) {
            int var44 = field1308[--Statics.field1315];
            field1308[++Statics.field1315 - 1] = class99.method1707(var44);
            return 1;
        } else if (arg0 == 5018) {
            int var45 = field1308[--Statics.field1315];
            field1308[++Statics.field1315 - 1] = class99.method989(var45);
            return 1;
        } else if (arg0 == 5019) {
            int var46 = field1308[--Statics.field1315];
            int[] var47 = field1308;
            int var48 = ++Statics.field1315 - 1;
            class73 var49 = (class73) class99.field1495.method3224((long) var46);
            int var50;
            if (var49 == null) {
                var50 = -1;
            } else if (class99.field1496.field2459 == var49.field2444) {
                var50 = -1;
            } else {
                var50 = ((class73) var49.field2444).field847;
            }
            var47[var48] = var50;
            return 1;
        } else if (arg0 == 5020) {
            String var51 = field1301[--Statics.field2239];
            client.method116(var51);
            return 1;
        } else if (arg0 == 5021) {
            client.field1103 = field1301[--Statics.field2239].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1301[++Statics.field2239 - 1] = client.field1103;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.z(ILcd;ZI)I")
    public static int method136(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1315 -= 2;
            int var3 = field1308[Statics.field1315];
            int var4 = field1308[Statics.field1315 + 1];
            if (!client.field1131) {
                client.field978 = var3;
                client.field915 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1308[++Statics.field1315 - 1] = client.field978;
            return 1;
        } else if (arg0 == 5506) {
            field1308[++Statics.field1315 - 1] = client.field915;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1308[--Statics.field1315];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field908 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1308[++Statics.field1315 - 1] = client.field908;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("br.j(ILcd;ZI)I")
    public static int method990(int arg0, class100 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field947 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("b.am(II)V")
    public static void method88(int arg0) {
        if (arg0 == -1 || !class217.method33(arg0)) {
            return;
        }
        class217[] var1 = Statics.field2321[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3.field2650 != null) {
                class70 var4 = new class70();
                var4.field813 = var3;
                var4.field819 = var3.field2650;
                method1586(var4, 2000000);
            }
        }
    }

    @ObfuscatedName("ih.ac(ILhy;ZB)V")
    public static void method3872(int arg0, class213 arg1, boolean arg2) {
        class33 var3 = client.method73().method4820(arg0);
        int var4 = Statics.field2829.field882;
        int var5 = (Statics.field2829.field1232 >> 7) + Statics.field448;
        int var6 = (Statics.field2829.field1191 >> 7) + Statics.field301;
        class213 var7 = new class213(var4, var5, var6);
        client.method73().method4855(var3, var7, arg1, arg2);
    }
}
