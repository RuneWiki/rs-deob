package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("aw")
public class class33 {

    @ObfuscatedName("aw.r")
    public static int[] field742 = new int[5];

    @ObfuscatedName("aw.o")
    public static int[][] field743 = new int[5][5000];

    @ObfuscatedName("aw.l")
    public static int[] field744 = new int[1000];

    @ObfuscatedName("aw.m")
    public static String[] field751 = new String[1000];

    @ObfuscatedName("aw.j")
    public static int field746 = 0;

    @ObfuscatedName("aw.s")
    public static class12[] field748 = new class12[50];

    @ObfuscatedName("aw.p")
    public static Calendar field753 = Calendar.getInstance();

    @ObfuscatedName("aw.y")
    public static final String[] field745 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("aw.a")
    public static int field752 = 0;

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.f(Lz;I)V")
    public static void method566(class19 arg0) {
        method713(arg0, 200000);
    }

    @ObfuscatedName("ar.i(Lz;II)V")
    public static void method713(class19 arg0, int arg1) {
        Object[] var2 = arg0.field200;
        int var3 = (Integer) var2[0];
        class49 var4 = class49.method590(var3);
        if (var4 == null) {
            return;
        }
        Statics.field714 = 0;
        Statics.field750 = 0;
        int var5 = -1;
        int[] var6 = var4.field966;
        int[] var7 = var4.field963;
        byte var8 = -1;
        field746 = 0;
        try {
            Statics.field740 = new int[var4.field965];
            int var9 = 0;
            Statics.field741 = new String[var4.field961];
            int var10 = 0;
            for (int var11 = 1; var11 < var2.length; var11++) {
                if (var2[var11] instanceof Integer) {
                    int var12 = (Integer) var2[var11];
                    if (var12 == -2147483647) {
                        var12 = arg0.field199;
                    }
                    if (var12 == -2147483646) {
                        var12 = arg0.field202;
                    }
                    if (var12 == -2147483645) {
                        var12 = arg0.field208 == null ? -1 : arg0.field208.field2274;
                    }
                    if (var12 == -2147483644) {
                        var12 = arg0.field203;
                    }
                    if (var12 == -2147483643) {
                        var12 = arg0.field208 == null ? -1 : arg0.field208.field2221;
                    }
                    if (var12 == -2147483642) {
                        var12 = arg0.field204 == null ? -1 : arg0.field204.field2274;
                    }
                    if (var12 == -2147483641) {
                        var12 = arg0.field204 == null ? -1 : arg0.field204.field2221;
                    }
                    if (var12 == -2147483640) {
                        var12 = arg0.field205;
                    }
                    if (var12 == -2147483639) {
                        var12 = arg0.field206;
                    }
                    Statics.field740[var9++] = var12;
                } else if (var2[var11] instanceof String) {
                    String var13 = (String) var2[var11];
                    if (var13.equals("event_opbase")) {
                        var13 = arg0.field201;
                    }
                    Statics.field741[var10++] = var13;
                }
            }
            int var14 = 0;
            field752 = arg0.field209;
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
                                                                                                                label219: while (true) {
                                                                                                                    var14++;
                                                                                                                    if (var14 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var5++;
                                                                                                                    int var52 = var6[var5];
                                                                                                                    if (var52 >= 100) {
                                                                                                                        boolean var46;
                                                                                                                        if (var4.field963[var5] == 1) {
                                                                                                                            var46 = true;
                                                                                                                        } else {
                                                                                                                            var46 = false;
                                                                                                                        }
                                                                                                                        int var47 = method159(var52, var4, var46);
                                                                                                                        switch(var47) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var52 == 0) {
                                                                                                                        field744[++Statics.field714 - 1] = var7[var5];
                                                                                                                    } else if (var52 == 1) {
                                                                                                                        int var15 = var7[var5];
                                                                                                                        field744[++Statics.field714 - 1] = class166.field2181[var15];
                                                                                                                    } else if (var52 == 2) {
                                                                                                                        int var16 = var7[var5];
                                                                                                                        class166.field2181[var16] = field744[--Statics.field714];
                                                                                                                        client.method551(var16);
                                                                                                                    } else if (var52 == 3) {
                                                                                                                        field751[++Statics.field750 - 1] = var4.field964[var5];
                                                                                                                    } else if (var52 == 6) {
                                                                                                                        var5 += var7[var5];
                                                                                                                    } else if (var52 == 7) {
                                                                                                                        Statics.field714 -= 2;
                                                                                                                        if (field744[Statics.field714] != field744[Statics.field714 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 8) {
                                                                                                                        Statics.field714 -= 2;
                                                                                                                        if (field744[Statics.field714] == field744[Statics.field714 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 9) {
                                                                                                                        Statics.field714 -= 2;
                                                                                                                        if (field744[Statics.field714] < field744[Statics.field714 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 10) {
                                                                                                                        Statics.field714 -= 2;
                                                                                                                        if (field744[Statics.field714] > field744[Statics.field714 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 21) {
                                                                                                                        if (field746 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class12 var17 = field748[--field746];
                                                                                                                        var4 = var17.field112;
                                                                                                                        var6 = var4.field966;
                                                                                                                        var7 = var4.field963;
                                                                                                                        var5 = var17.field105;
                                                                                                                        Statics.field740 = var17.field106;
                                                                                                                        Statics.field741 = var17.field113;
                                                                                                                    } else if (var52 == 25) {
                                                                                                                        int var18 = var7[var5];
                                                                                                                        field744[++Statics.field714 - 1] = class166.method561(var18);
                                                                                                                    } else if (var52 == 27) {
                                                                                                                        int var19 = var7[var5];
                                                                                                                        int var20 = field744[--Statics.field714];
                                                                                                                        class195 var21 = Statics.method202(var19);
                                                                                                                        int var22 = var21.field2860;
                                                                                                                        int var23 = var21.field2859;
                                                                                                                        int var24 = var21.field2856;
                                                                                                                        int var25 = class166.field2183[var24 - var23];
                                                                                                                        if (var20 < 0 || var20 > var25) {
                                                                                                                            var20 = 0;
                                                                                                                        }
                                                                                                                        int var26 = var25 << var23;
                                                                                                                        class166.field2181[var22] = class166.field2181[var22] & ~var26 | var20 << var23 & var26;
                                                                                                                    } else if (var52 == 31) {
                                                                                                                        Statics.field714 -= 2;
                                                                                                                        if (field744[Statics.field714] <= field744[Statics.field714 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 32) {
                                                                                                                        Statics.field714 -= 2;
                                                                                                                        if (field744[Statics.field714] >= field744[Statics.field714 + 1]) {
                                                                                                                            var5 += var7[var5];
                                                                                                                        }
                                                                                                                    } else if (var52 == 33) {
                                                                                                                        field744[++Statics.field714 - 1] = Statics.field740[var7[var5]];
                                                                                                                    } else if (var52 == 34) {
                                                                                                                        Statics.field740[var7[var5]] = field744[--Statics.field714];
                                                                                                                    } else if (var52 == 35) {
                                                                                                                        field751[++Statics.field750 - 1] = Statics.field741[var7[var5]];
                                                                                                                    } else if (var52 == 36) {
                                                                                                                        Statics.field741[var7[var5]] = field751[--Statics.field750];
                                                                                                                    } else if (var52 == 37) {
                                                                                                                        int var27 = var7[var5];
                                                                                                                        Statics.field750 -= var27;
                                                                                                                        String var28 = class208.method3092(field751, Statics.field750, var27);
                                                                                                                        field751[++Statics.field750 - 1] = var28;
                                                                                                                    } else if (var52 == 38) {
                                                                                                                        Statics.field714--;
                                                                                                                    } else if (var52 == 39) {
                                                                                                                        Statics.field750--;
                                                                                                                    } else if (var52 == 40) {
                                                                                                                        int var29 = var7[var5];
                                                                                                                        class49 var30 = class49.method590(var29);
                                                                                                                        int[] var31 = new int[var30.field965];
                                                                                                                        String[] var32 = new String[var30.field961];
                                                                                                                        for (int var33 = 0; var33 < var30.field967; var33++) {
                                                                                                                            var31[var33] = field744[Statics.field714 - var30.field967 + var33];
                                                                                                                        }
                                                                                                                        for (int var34 = 0; var34 < var30.field968; var34++) {
                                                                                                                            var32[var34] = field751[Statics.field750 - var30.field968 + var34];
                                                                                                                        }
                                                                                                                        Statics.field714 -= var30.field967;
                                                                                                                        Statics.field750 -= var30.field968;
                                                                                                                        class12 var35 = new class12();
                                                                                                                        var35.field112 = var4;
                                                                                                                        var35.field105 = var5;
                                                                                                                        var35.field106 = Statics.field740;
                                                                                                                        var35.field113 = Statics.field741;
                                                                                                                        field748[++field746 - 1] = var35;
                                                                                                                        var4 = var30;
                                                                                                                        var6 = var30.field966;
                                                                                                                        var7 = var30.field963;
                                                                                                                        var5 = -1;
                                                                                                                        Statics.field740 = var31;
                                                                                                                        Statics.field741 = var32;
                                                                                                                    } else if (var52 == 42) {
                                                                                                                        field744[++Statics.field714 - 1] = Statics.field78.method852(var7[var5]);
                                                                                                                    } else if (var52 == 43) {
                                                                                                                        Statics.field78.method851(var7[var5], field744[--Statics.field714]);
                                                                                                                    } else if (var52 == 44) {
                                                                                                                        int var36 = var7[var5] >> 16;
                                                                                                                        int var37 = var7[var5] & 0xFFFF;
                                                                                                                        int var38 = field744[--Statics.field714];
                                                                                                                        if (var38 >= 0 && var38 <= 5000) {
                                                                                                                            field742[var36] = var38;
                                                                                                                            byte var39 = -1;
                                                                                                                            if (var37 == 105) {
                                                                                                                                var39 = 0;
                                                                                                                            }
                                                                                                                            int var40 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var40 >= var38) {
                                                                                                                                    continue label219;
                                                                                                                                }
                                                                                                                                field743[var36][var40] = var39;
                                                                                                                                var40++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var52 == 45) {
                                                                                                                        int var41 = var7[var5];
                                                                                                                        int var42 = field744[--Statics.field714];
                                                                                                                        if (var42 < 0 || var42 >= field742[var41]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field744[++Statics.field714 - 1] = field743[var41][var42];
                                                                                                                    } else if (var52 == 46) {
                                                                                                                        int var43 = var7[var5];
                                                                                                                        Statics.field714 -= 2;
                                                                                                                        int var44 = field744[Statics.field714];
                                                                                                                        if (var44 < 0 || var44 >= field742[var43]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field743[var43][var44] = field744[Statics.field714 + 1];
                                                                                                                    } else if (var52 == 47) {
                                                                                                                        String var45 = Statics.field78.method854(var7[var5]);
                                                                                                                        if (var45 == null) {
                                                                                                                            var45 = "null";
                                                                                                                        }
                                                                                                                        field751[++Statics.field750 - 1] = var45;
                                                                                                                    } else if (var52 == 48) {
                                                                                                                        Statics.field78.method878(var7[var5], field751[--Statics.field750]);
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
        } catch (Exception var51) {
            StringBuilder var49 = new StringBuilder(30);
            var49.append("").append(var4.field1905).append(" ");
            for (int var50 = field746 - 1; var50 >= 0; var50--) {
                var49.append("").append(field748[var50].field112.field1905).append(" ");
            }
            var49.append("").append(var8);
            Statics.method1851(var49.toString(), var51);
        }
    }

    @ObfuscatedName("d.u(ILaz;ZI)I")
    public static int method159(int arg0, class49 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method2893(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method1853(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method573(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return Statics.method170(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method907(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method236(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            class170 var6 = arg2 ? Statics.field2124 : Statics.field747;
            byte var7;
            if (arg0 == 1500) {
                field744[++Statics.field714 - 1] = var6.field2233;
                var7 = 1;
            } else if (arg0 == 1501) {
                field744[++Statics.field714 - 1] = var6.field2234;
                var7 = 1;
            } else if (arg0 == 1502) {
                field744[++Statics.field714 - 1] = var6.field2294;
                var7 = 1;
            } else if (arg0 == 1503) {
                field744[++Statics.field714 - 1] = var6.field2210;
                var7 = 1;
            } else if (arg0 == 1504) {
                field744[++Statics.field714 - 1] = var6.field2256 ? 1 : 0;
                var7 = 1;
            } else if (arg0 == 1505) {
                field744[++Statics.field714 - 1] = var6.field2239;
                var7 = 1;
            } else {
                var7 = 2;
            }
            return var7;
        } else if (arg0 < 1700) {
            class170 var8 = arg2 ? Statics.field2124 : Statics.field747;
            byte var9;
            if (arg0 == 1600) {
                field744[++Statics.field714 - 1] = var8.field2332;
                var9 = 1;
            } else if (arg0 == 1601) {
                field744[++Statics.field714 - 1] = var8.field2217;
                var9 = 1;
            } else if (arg0 == 1602) {
                field751[++Statics.field750 - 1] = var8.field2280;
                var9 = 1;
            } else if (arg0 == 1603) {
                field744[++Statics.field714 - 1] = var8.field2328;
                var9 = 1;
            } else if (arg0 == 1604) {
                field744[++Statics.field714 - 1] = var8.field2244;
                var9 = 1;
            } else if (arg0 == 1605) {
                field744[++Statics.field714 - 1] = var8.field2321;
                var9 = 1;
            } else if (arg0 == 1606) {
                field744[++Statics.field714 - 1] = var8.field2271;
                var9 = 1;
            } else if (arg0 == 1607) {
                field744[++Statics.field714 - 1] = var8.field2273;
                var9 = 1;
            } else if (arg0 == 1608) {
                field744[++Statics.field714 - 1] = var8.field2272;
                var9 = 1;
            } else if (arg0 == 1609) {
                field744[++Statics.field714 - 1] = var8.field2251;
                var9 = 1;
            } else if (arg0 == 1610) {
                field744[++Statics.field714 - 1] = var8.field2252;
                var9 = 1;
            } else if (arg0 == 1611) {
                field744[++Statics.field714 - 1] = var8.field2245;
                var9 = 1;
            } else if (arg0 == 1612) {
                field744[++Statics.field714 - 1] = var8.field2246;
                var9 = 1;
            } else if (arg0 == 1613) {
                field744[++Statics.field714 - 1] = var8.field2250.method758();
                var9 = 1;
            } else {
                var9 = 2;
            }
            return var9;
        } else if (arg0 < 1800) {
            class170 var13 = arg2 ? Statics.field2124 : Statics.field747;
            byte var14;
            if (arg0 == 1700) {
                field744[++Statics.field714 - 1] = var13.field2340;
                var14 = 1;
            } else if (arg0 == 1701) {
                if (var13.field2340 == -1) {
                    field744[++Statics.field714 - 1] = 0;
                } else {
                    field744[++Statics.field714 - 1] = var13.field2222;
                }
                var14 = 1;
            } else if (arg0 == 1702) {
                field744[++Statics.field714 - 1] = var13.field2221;
                var14 = 1;
            } else {
                var14 = 2;
            }
            return var14;
        } else if (arg0 < 1900) {
            return method5(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method3600(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1853(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method573(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return Statics.method170(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method907(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method236(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method181(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            class170 var15 = Statics.method1837(field744[--Statics.field714]);
            byte var16;
            if (arg0 == 2600) {
                field744[++Statics.field714 - 1] = var15.field2332;
                var16 = 1;
            } else if (arg0 == 2601) {
                field744[++Statics.field714 - 1] = var15.field2217;
                var16 = 1;
            } else if (arg0 == 2602) {
                field751[++Statics.field750 - 1] = var15.field2280;
                var16 = 1;
            } else if (arg0 == 2603) {
                field744[++Statics.field714 - 1] = var15.field2328;
                var16 = 1;
            } else if (arg0 == 2604) {
                field744[++Statics.field714 - 1] = var15.field2244;
                var16 = 1;
            } else if (arg0 == 2605) {
                field744[++Statics.field714 - 1] = var15.field2321;
                var16 = 1;
            } else if (arg0 == 2606) {
                field744[++Statics.field714 - 1] = var15.field2271;
                var16 = 1;
            } else if (arg0 == 2607) {
                field744[++Statics.field714 - 1] = var15.field2273;
                var16 = 1;
            } else if (arg0 == 2608) {
                field744[++Statics.field714 - 1] = var15.field2272;
                var16 = 1;
            } else if (arg0 == 2609) {
                field744[++Statics.field714 - 1] = var15.field2251;
                var16 = 1;
            } else if (arg0 == 2610) {
                field744[++Statics.field714 - 1] = var15.field2252;
                var16 = 1;
            } else if (arg0 == 2611) {
                field744[++Statics.field714 - 1] = var15.field2245;
                var16 = 1;
            } else if (arg0 == 2612) {
                field744[++Statics.field714 - 1] = var15.field2246;
                var16 = 1;
            } else if (arg0 == 2613) {
                field744[++Statics.field714 - 1] = var15.field2250.method758();
                var16 = 1;
            } else {
                var16 = 2;
            }
            return var16;
        } else if (arg0 < 2800) {
            byte var18;
            if (arg0 == 2700) {
                class170 var17 = Statics.method1837(field744[--Statics.field714]);
                field744[++Statics.field714 - 1] = var17.field2340;
                var18 = 1;
            } else if (arg0 == 2701) {
                class170 var19 = Statics.method1837(field744[--Statics.field714]);
                if (var19.field2340 == -1) {
                    field744[++Statics.field714 - 1] = 0;
                } else {
                    field744[++Statics.field714 - 1] = var19.field2222;
                }
                var18 = 1;
            } else if (arg0 == 2702) {
                int var20 = field744[--Statics.field714];
                class18 var21 = (class18) client.field554.method2254((long) var20);
                if (var21 == null) {
                    field744[++Statics.field714 - 1] = 0;
                } else {
                    field744[++Statics.field714 - 1] = 1;
                }
                var18 = 1;
            } else if (arg0 == 2706) {
                field744[++Statics.field714 - 1] = client.field464;
                var18 = 1;
            } else {
                var18 = 2;
            }
            return var18;
        } else if (arg0 < 2900) {
            class170 var22 = Statics.method1837(field744[--Statics.field714]);
            byte var27;
            if (arg0 == 2800) {
                int[] var23 = field744;
                int var24 = ++Statics.field714 - 1;
                int var25 = client.method3309(var22);
                int var26 = var25 >> 11 & 0x3F;
                var23[var24] = var26;
                var27 = 1;
            } else if (arg0 == 2801) {
                int var28 = field744[--Statics.field714];
                int var214 = var28 - 1;
                if (var22.field2247 == null || var214 >= var22.field2247.length || var22.field2247[var214] == null) {
                    field751[++Statics.field750 - 1] = "";
                } else {
                    field751[++Statics.field750 - 1] = var22.field2247[var214];
                }
                var27 = 1;
            } else if (arg0 == 2802) {
                if (var22.field2293 == null) {
                    field751[++Statics.field750 - 1] = "";
                } else {
                    field751[++Statics.field750 - 1] = var22.field2293;
                }
                var27 = 1;
            } else {
                var27 = 2;
            }
            return var27;
        } else if (arg0 < 3000) {
            return method3600(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method2142(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            byte var32;
            if (arg0 == 3200) {
                Statics.field714 -= 3;
                int var29 = field744[Statics.field714];
                int var30 = field744[Statics.field714 + 1];
                int var31 = field744[Statics.field714 + 2];
                if (client.field544 != 0 && var30 != 0 && client.field546 < 50) {
                    client.field547[client.field546] = var29;
                    client.field548[client.field546] = var30;
                    client.field335[client.field546] = var31;
                    client.field551[client.field546] = null;
                    client.field465[client.field546] = 0;
                    client.field546++;
                }
                var32 = 1;
            } else if (arg0 == 3201) {
                int var33 = field744[--Statics.field714];
                if (var33 == -1 && !client.field543) {
                    class139.method1399();
                } else if (var33 != -1 && client.field542 != var33 && client.field541 != 0 && !client.field543) {
                    class185 var34 = Statics.field587;
                    int var35 = client.field541;
                    class139.field1941 = 1;
                    Statics.field2062 = var34;
                    Statics.field1942 = var33;
                    Statics.field1778 = 0;
                    Statics.field784 = var35;
                    Statics.field1939 = false;
                    Statics.field1938 = 2;
                }
                client.field542 = var33;
                var32 = 1;
            } else if (arg0 == 3202) {
                Statics.field714 -= 2;
                int var36 = field744[Statics.field714];
                int var37 = field744[Statics.field714 + 1];
                if (client.field541 != 0 && var36 != -1) {
                    class139.method1400(Statics.field163, var36, 0, client.field541, false);
                    client.field543 = true;
                }
                var32 = 1;
            } else {
                var32 = 2;
            }
            return var32;
        } else if (arg0 < 3400) {
            byte var38;
            if (arg0 == 3300) {
                field744[++Statics.field714 - 1] = client.field312;
                var38 = 1;
            } else if (arg0 == 3301) {
                Statics.field714 -= 2;
                int var39 = field744[Statics.field714];
                int var40 = field744[Statics.field714 + 1];
                field744[++Statics.field714 - 1] = class13.method2640(var39, var40);
                var38 = 1;
            } else if (arg0 == 3302) {
                Statics.field714 -= 2;
                int var41 = field744[Statics.field714];
                int var42 = field744[Statics.field714 + 1];
                int[] var43 = field744;
                int var44 = ++Statics.field714 - 1;
                class13 var45 = (class13) class13.field124.method2254((long) var41);
                int var46;
                if (var45 == null) {
                    var46 = 0;
                } else if (var42 >= 0 && var42 < var45.field120.length) {
                    var46 = var45.field120[var42];
                } else {
                    var46 = 0;
                }
                var43[var44] = var46;
                var38 = 1;
            } else if (arg0 == 3303) {
                Statics.field714 -= 2;
                int var47 = field744[Statics.field714];
                int var48 = field744[Statics.field714 + 1];
                int[] var49 = field744;
                int var50 = ++Statics.field714 - 1;
                class13 var51 = (class13) class13.field124.method2254((long) var47);
                int var52;
                if (var51 == null) {
                    var52 = 0;
                } else if (var48 == -1) {
                    var52 = 0;
                } else {
                    int var53 = 0;
                    for (int var54 = 0; var54 < var51.field120.length; var54++) {
                        if (var51.field119[var54] == var48) {
                            var53 += var51.field120[var54];
                        }
                    }
                    var52 = var53;
                }
                var49[var50] = var52;
                var38 = 1;
            } else if (arg0 == 3304) {
                int var55 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = class187.method182(var55).field2786;
                var38 = 1;
            } else if (arg0 == 3305) {
                int var56 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = client.field424[var56];
                var38 = 1;
            } else if (arg0 == 3306) {
                int var57 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = client.field354[var57];
                var38 = 1;
            } else if (arg0 == 3307) {
                int var58 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = client.field439[var58];
                var38 = 1;
            } else if (arg0 == 3308) {
                int var59 = Statics.field3063;
                int var60 = (Statics.field899.field625 >> 7) + Statics.field1880;
                int var61 = (Statics.field899.field620 >> 7) + Statics.field2792;
                field744[++Statics.field714 - 1] = (var59 << 28) + (var60 << 14) + var61;
                var38 = 1;
            } else if (arg0 == 3309) {
                int var62 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = var62 >> 14 & 0x3FFF;
                var38 = 1;
            } else if (arg0 == 3310) {
                int var63 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = var63 >> 28;
                var38 = 1;
            } else if (arg0 == 3311) {
                int var64 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = var64 & 0x3FFF;
                var38 = 1;
            } else if (arg0 == 3312) {
                field744[++Statics.field714 - 1] = client.field306 ? 1 : 0;
                var38 = 1;
            } else if (arg0 == 3313) {
                Statics.field714 -= 2;
                int var65 = field744[Statics.field714] + 32768;
                int var66 = field744[Statics.field714 + 1];
                field744[++Statics.field714 - 1] = class13.method2640(var65, var66);
                var38 = 1;
            } else if (arg0 == 3314) {
                Statics.field714 -= 2;
                int var67 = field744[Statics.field714] + 32768;
                int var68 = field744[Statics.field714 + 1];
                int[] var69 = field744;
                int var70 = ++Statics.field714 - 1;
                class13 var71 = (class13) class13.field124.method2254((long) var67);
                int var72;
                if (var71 == null) {
                    var72 = 0;
                } else if (var68 >= 0 && var68 < var71.field120.length) {
                    var72 = var71.field120[var68];
                } else {
                    var72 = 0;
                }
                var69[var70] = var72;
                var38 = 1;
            } else if (arg0 == 3315) {
                Statics.field714 -= 2;
                int var73 = field744[Statics.field714] + 32768;
                int var74 = field744[Statics.field714 + 1];
                int[] var75 = field744;
                int var76 = ++Statics.field714 - 1;
                class13 var77 = (class13) class13.field124.method2254((long) var73);
                int var78;
                if (var77 == null) {
                    var78 = 0;
                } else if (var74 == -1) {
                    var78 = 0;
                } else {
                    int var79 = 0;
                    for (int var80 = 0; var80 < var77.field120.length; var80++) {
                        if (var77.field119[var80] == var74) {
                            var79 += var77.field120[var80];
                        }
                    }
                    var78 = var79;
                }
                var75[var76] = var78;
                var38 = 1;
            } else if (arg0 == 3316) {
                if (client.field471 >= 2) {
                    field744[++Statics.field714 - 1] = client.field471;
                } else {
                    field744[++Statics.field714 - 1] = 0;
                }
                var38 = 1;
            } else if (arg0 == 3317) {
                field744[++Statics.field714 - 1] = client.field320;
                var38 = 1;
            } else if (arg0 == 3318) {
                field744[++Statics.field714 - 1] = client.field301;
                var38 = 1;
            } else if (arg0 == 3321) {
                field744[++Statics.field714 - 1] = client.field469;
                var38 = 1;
            } else if (arg0 == 3322) {
                field744[++Statics.field714 - 1] = client.field470;
                var38 = 1;
            } else if (arg0 == 3323) {
                if (client.field369) {
                    field744[++Statics.field714 - 1] = 1;
                } else {
                    field744[++Statics.field714 - 1] = 0;
                }
                var38 = 1;
            } else if (arg0 == 3324) {
                field744[++Statics.field714 - 1] = client.field302;
                var38 = 1;
            } else {
                var38 = 2;
            }
            return var38;
        } else if (arg0 < 3500) {
            byte var89;
            if (arg0 == 3400) {
                Statics.field714 -= 2;
                int var81 = field744[Statics.field714];
                int var82 = field744[Statics.field714 + 1];
                class196 var83 = (class196) class196.field2864.method2240((long) var81);
                class196 var84;
                if (var83 == null) {
                    byte[] var85 = Statics.field2868.method3163(8, var81);
                    class196 var86 = new class196();
                    if (var85 != null) {
                        var86.method3376(new class154(var85));
                    }
                    class196.field2864.method2246(var86, (long) var81);
                    var84 = var86;
                } else {
                    var84 = var83;
                }
                class196 var87 = var84;
                if (var84.field2866 != 's') {
                }
                for (int var88 = 0; var88 < var87.field2869; var88++) {
                    if (var87.field2863[var88] == var82) {
                        field751[++Statics.field750 - 1] = var87.field2872[var88];
                        var87 = null;
                        break;
                    }
                }
                if (var87 != null) {
                    field751[++Statics.field750 - 1] = var87.field2867;
                }
                var89 = 1;
            } else if (arg0 == 3408) {
                Statics.field714 -= 4;
                int var90 = field744[Statics.field714];
                int var91 = field744[Statics.field714 + 1];
                int var92 = field744[Statics.field714 + 2];
                int var93 = field744[Statics.field714 + 3];
                class196 var94 = (class196) class196.field2864.method2240((long) var92);
                class196 var95;
                if (var94 == null) {
                    byte[] var96 = Statics.field2868.method3163(8, var92);
                    class196 var97 = new class196();
                    if (var96 != null) {
                        var97.method3376(new class154(var96));
                    }
                    class196.field2864.method2246(var97, (long) var92);
                    var95 = var97;
                } else {
                    var95 = var94;
                }
                class196 var98 = var95;
                if (var95.field2865 == var90 && var95.field2866 == var91) {
                    for (int var99 = 0; var99 < var98.field2869; var99++) {
                        if (var98.field2863[var99] == var93) {
                            if (var91 == 115) {
                                field751[++Statics.field750 - 1] = var98.field2872[var99];
                            } else {
                                field744[++Statics.field714 - 1] = var98.field2873[var99];
                            }
                            var98 = null;
                            break;
                        }
                    }
                    if (var98 != null) {
                        if (var91 == 115) {
                            field751[++Statics.field750 - 1] = var98.field2867;
                        } else {
                            field744[++Statics.field714 - 1] = var98.field2870;
                        }
                    }
                    var89 = 1;
                } else {
                    if (var91 == 115) {
                        field751[++Statics.field750 - 1] = "null";
                    } else {
                        field744[++Statics.field714 - 1] = 0;
                    }
                    var89 = 1;
                }
            } else {
                var89 = 2;
            }
            return var89;
        } else if (arg0 < 3700) {
            return method1879(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            byte var101;
            if (arg0 == 3903) {
                int var100 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = client.field580[var100].method46();
                var101 = 1;
            } else if (arg0 == 3904) {
                int var102 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = client.field580[var102].field39;
                var101 = 1;
            } else if (arg0 == 3905) {
                int var103 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = client.field580[var103].field36;
                var101 = 1;
            } else if (arg0 == 3906) {
                int var104 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = client.field580[var104].field38;
                var101 = 1;
            } else if (arg0 == 3907) {
                int var105 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = client.field580[var105].field45;
                var101 = 1;
            } else if (arg0 == 3908) {
                int var106 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = client.field580[var106].field37;
                var101 = 1;
            } else if (arg0 == 3910) {
                int var107 = field744[--Statics.field714];
                int var108 = client.field580[var107].method32();
                field744[++Statics.field714 - 1] = var108 == 0 ? 1 : 0;
                var101 = 1;
            } else if (arg0 == 3911) {
                int var109 = field744[--Statics.field714];
                int var110 = client.field580[var109].method32();
                field744[++Statics.field714 - 1] = var110 == 2 ? 1 : 0;
                var101 = 1;
            } else if (arg0 == 3912) {
                int var111 = field744[--Statics.field714];
                int var112 = client.field580[var111].method32();
                field744[++Statics.field714 - 1] = var112 == 5 ? 1 : 0;
                var101 = 1;
            } else if (arg0 == 3913) {
                int var113 = field744[--Statics.field714];
                int var114 = client.field580[var113].method32();
                field744[++Statics.field714 - 1] = var114 == 1 ? 1 : 0;
                var101 = 1;
            } else if (arg0 == 3914) {
                boolean var115 = field744[--Statics.field714] == 1;
                if (Statics.field139 != null) {
                    Statics.field139.method6(class2.field11, var115);
                }
                var101 = 1;
            } else if (arg0 == 3915) {
                boolean var116 = field744[--Statics.field714] == 1;
                if (Statics.field139 != null) {
                    Statics.field139.method6(class2.field17, var116);
                }
                var101 = 1;
            } else if (arg0 == 3916) {
                Statics.field714 -= 2;
                boolean var117 = field744[Statics.field714] == 1;
                boolean var118 = field744[Statics.field714 + 1] == 1;
                if (Statics.field139 != null) {
                    Statics.field139.method6(new class45(var118), var117);
                }
                var101 = 1;
            } else if (arg0 == 3917) {
                boolean var119 = field744[--Statics.field714] == 1;
                if (Statics.field139 != null) {
                    Statics.field139.method6(class2.field9, var119);
                }
                var101 = 1;
            } else if (arg0 == 3918) {
                boolean var120 = field744[--Statics.field714] == 1;
                if (Statics.field139 != null) {
                    Statics.field139.method6(class2.field12, var120);
                }
                var101 = 1;
            } else if (arg0 == 3919) {
                field744[++Statics.field714 - 1] = Statics.field139 == null ? 0 : Statics.field139.field14.size();
                var101 = 1;
            } else if (arg0 == 3920) {
                int var121 = field744[--Statics.field714];
                class3 var122 = (class3) Statics.field139.field14.get(var121);
                field744[++Statics.field714 - 1] = var122.field23;
                var101 = 1;
            } else if (arg0 == 3921) {
                int var123 = field744[--Statics.field714];
                class3 var124 = (class3) Statics.field139.field14.get(var123);
                field751[++Statics.field750 - 1] = var124.method11();
                var101 = 1;
            } else if (arg0 == 3922) {
                int var125 = field744[--Statics.field714];
                class3 var126 = (class3) Statics.field139.field14.get(var125);
                field751[++Statics.field750 - 1] = var126.method16();
                var101 = 1;
            } else if (arg0 == 3923) {
                int var127 = field744[--Statics.field714];
                class3 var128 = (class3) Statics.field139.field14.get(var127);
                long var129 = class156.method848() - Statics.field1699 - var128.field19;
                int var131 = (int) (var129 / 3600000L);
                int var132 = (int) ((var129 - (long) (var131 * 3600000)) / 60000L);
                int var133 = (int) ((var129 - (long) (var131 * 3600000) - (long) (var132 * 60000)) / 1000L);
                String var134 = var131 + ":" + var132 / 10 + var132 % 10 + ":" + var133 / 10 + var133 % 10;
                field751[++Statics.field750 - 1] = var134;
                var101 = 1;
            } else if (arg0 == 3924) {
                int var135 = field744[--Statics.field714];
                class3 var136 = (class3) Statics.field139.field14.get(var135);
                field744[++Statics.field714 - 1] = var136.field20.field38;
                var101 = 1;
            } else if (arg0 == 3925) {
                int var137 = field744[--Statics.field714];
                class3 var138 = (class3) Statics.field139.field14.get(var137);
                field744[++Statics.field714 - 1] = var138.field20.field36;
                var101 = 1;
            } else if (arg0 == 3926) {
                int var139 = field744[--Statics.field714];
                class3 var140 = (class3) Statics.field139.field14.get(var139);
                field744[++Statics.field714 - 1] = var140.field20.field39;
                var101 = 1;
            } else {
                var101 = 2;
            }
            return var101;
        } else if (arg0 < 4100) {
            byte var143;
            if (arg0 == 4000) {
                Statics.field714 -= 2;
                int var141 = field744[Statics.field714];
                int var142 = field744[Statics.field714 + 1];
                field744[++Statics.field714 - 1] = var141 + var142;
                var143 = 1;
            } else if (arg0 == 4001) {
                Statics.field714 -= 2;
                int var144 = field744[Statics.field714];
                int var145 = field744[Statics.field714 + 1];
                field744[++Statics.field714 - 1] = var144 - var145;
                var143 = 1;
            } else if (arg0 == 4002) {
                Statics.field714 -= 2;
                int var146 = field744[Statics.field714];
                int var147 = field744[Statics.field714 + 1];
                field744[++Statics.field714 - 1] = var146 * var147;
                var143 = 1;
            } else if (arg0 == 4003) {
                Statics.field714 -= 2;
                int var148 = field744[Statics.field714];
                int var149 = field744[Statics.field714 + 1];
                field744[++Statics.field714 - 1] = var148 / var149;
                var143 = 1;
            } else if (arg0 == 4004) {
                int var150 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = (int) (Math.random() * (double) var150);
                var143 = 1;
            } else if (arg0 == 4005) {
                int var151 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = (int) (Math.random() * (double) (var151 + 1));
                var143 = 1;
            } else if (arg0 == 4006) {
                Statics.field714 -= 5;
                int var152 = field744[Statics.field714];
                int var153 = field744[Statics.field714 + 1];
                int var154 = field744[Statics.field714 + 2];
                int var155 = field744[Statics.field714 + 3];
                int var156 = field744[Statics.field714 + 4];
                field744[++Statics.field714 - 1] = (var153 - var152) * (var156 - var154) / (var155 - var154) + var152;
                var143 = 1;
            } else if (arg0 == 4007) {
                Statics.field714 -= 2;
                int var157 = field744[Statics.field714];
                int var158 = field744[Statics.field714 + 1];
                field744[++Statics.field714 - 1] = var157 * var158 / 100 + var157;
                var143 = 1;
            } else if (arg0 == 4008) {
                Statics.field714 -= 2;
                int var159 = field744[Statics.field714];
                int var160 = field744[Statics.field714 + 1];
                field744[++Statics.field714 - 1] = var159 | 0x1 << var160;
                var143 = 1;
            } else if (arg0 == 4009) {
                Statics.field714 -= 2;
                int var161 = field744[Statics.field714];
                int var162 = field744[Statics.field714 + 1];
                field744[++Statics.field714 - 1] = var161 & -1 - (0x1 << var162);
                var143 = 1;
            } else if (arg0 == 4010) {
                Statics.field714 -= 2;
                int var163 = field744[Statics.field714];
                int var164 = field744[Statics.field714 + 1];
                field744[++Statics.field714 - 1] = (var163 & 0x1 << var164) == 0 ? 0 : 1;
                var143 = 1;
            } else if (arg0 == 4011) {
                Statics.field714 -= 2;
                int var165 = field744[Statics.field714];
                int var166 = field744[Statics.field714 + 1];
                field744[++Statics.field714 - 1] = var165 % var166;
                var143 = 1;
            } else if (arg0 == 4012) {
                Statics.field714 -= 2;
                int var167 = field744[Statics.field714];
                int var168 = field744[Statics.field714 + 1];
                if (var167 == 0) {
                    field744[++Statics.field714 - 1] = 0;
                } else {
                    field744[++Statics.field714 - 1] = (int) Math.pow((double) var167, (double) var168);
                }
                var143 = 1;
            } else if (arg0 == 4013) {
                Statics.field714 -= 2;
                int var169 = field744[Statics.field714];
                int var170 = field744[Statics.field714 + 1];
                if (var169 == 0) {
                    field744[++Statics.field714 - 1] = 0;
                } else if (var170 == 0) {
                    field744[++Statics.field714 - 1] = Integer.MAX_VALUE;
                } else {
                    field744[++Statics.field714 - 1] = (int) Math.pow((double) var169, 1.0D / (double) var170);
                }
                var143 = 1;
            } else if (arg0 == 4014) {
                Statics.field714 -= 2;
                int var171 = field744[Statics.field714];
                int var172 = field744[Statics.field714 + 1];
                field744[++Statics.field714 - 1] = var171 & var172;
                var143 = 1;
            } else if (arg0 == 4015) {
                Statics.field714 -= 2;
                int var173 = field744[Statics.field714];
                int var174 = field744[Statics.field714 + 1];
                field744[++Statics.field714 - 1] = var173 | var174;
                var143 = 1;
            } else if (arg0 == 4018) {
                Statics.field714 -= 3;
                long var175 = (long) field744[Statics.field714];
                long var177 = (long) field744[Statics.field714 + 1];
                long var179 = (long) field744[Statics.field714 + 2];
                field744[++Statics.field714 - 1] = (int) (var175 * var179 / var177);
                var143 = 1;
            } else {
                var143 = 2;
            }
            return var143;
        } else if (arg0 < 4200) {
            return method2649(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            byte var182;
            if (arg0 == 4200) {
                int var181 = field744[--Statics.field714];
                field751[++Statics.field750 - 1] = class199.method3402(var181).field2954;
                var182 = 1;
            } else if (arg0 == 4201) {
                Statics.field714 -= 2;
                int var183 = field744[Statics.field714];
                int var184 = field744[Statics.field714 + 1];
                class199 var185 = class199.method3402(var183);
                if (var184 < 1 || var184 > 5 || var185.field2957[var184 - 1] == null) {
                    field751[++Statics.field750 - 1] = "";
                } else {
                    field751[++Statics.field750 - 1] = var185.field2957[var184 - 1];
                }
                var182 = 1;
            } else if (arg0 == 4202) {
                Statics.field714 -= 2;
                int var186 = field744[Statics.field714];
                int var187 = field744[Statics.field714 + 1];
                class199 var188 = class199.method3402(var186);
                if (var187 < 1 || var187 > 5 || var188.field2970[var187 - 1] == null) {
                    field751[++Statics.field750 - 1] = "";
                } else {
                    field751[++Statics.field750 - 1] = var188.field2970[var187 - 1];
                }
                var182 = 1;
            } else if (arg0 == 4203) {
                int var189 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = class199.method3402(var189).field2971;
                var182 = 1;
            } else if (arg0 == 4204) {
                int var190 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = class199.method3402(var190).field2958 == 1 ? 1 : 0;
                var182 = 1;
            } else if (arg0 == 4205) {
                int var191 = field744[--Statics.field714];
                class199 var192 = class199.method3402(var191);
                if (var192.field2991 == -1 && var192.field2990 >= 0) {
                    field744[++Statics.field714 - 1] = var192.field2990;
                } else {
                    field744[++Statics.field714 - 1] = var191;
                }
                var182 = 1;
            } else if (arg0 == 4206) {
                int var193 = field744[--Statics.field714];
                class199 var194 = class199.method3402(var193);
                if (var194.field2991 >= 0 && var194.field2990 >= 0) {
                    field744[++Statics.field714 - 1] = var194.field2990;
                } else {
                    field744[++Statics.field714 - 1] = var193;
                }
                var182 = 1;
            } else if (arg0 == 4207) {
                int var195 = field744[--Statics.field714];
                field744[++Statics.field714 - 1] = class199.method3402(var195).field2972 ? 1 : 0;
                var182 = 1;
            } else if (arg0 == 4208) {
                int var196 = field744[--Statics.field714];
                class199 var197 = class199.method3402(var196);
                if (var197.field3002 == -1 && var197.field2959 >= 0) {
                    field744[++Statics.field714 - 1] = var197.field2959;
                } else {
                    field744[++Statics.field714 - 1] = var196;
                }
                var182 = 1;
            } else if (arg0 == 4209) {
                int var198 = field744[--Statics.field714];
                class199 var199 = class199.method3402(var198);
                if (var199.field3002 >= 0 && var199.field2959 >= 0) {
                    field744[++Statics.field714 - 1] = var199.field2959;
                } else {
                    field744[++Statics.field714 - 1] = var198;
                }
                var182 = 1;
            } else if (arg0 == 4210) {
                String var200 = field751[--Statics.field750];
                int var201 = field744[--Statics.field714];
                boolean var203 = var201 == 1;
                String var204 = var200.toLowerCase();
                short[] var205 = new short[16];
                int var206 = 0;
                int var207 = 0;
                while (true) {
                    if (var207 >= Statics.field3001) {
                        Statics.field795 = var205;
                        Statics.field79 = 0;
                        Statics.field1105 = var206;
                        String[] var211 = new String[Statics.field1105];
                        for (int var212 = 0; var212 < Statics.field1105; var212++) {
                            var211[var212] = class199.method3402(var205[var212]).field2954;
                        }
                        class151.method2631(var211, Statics.field795);
                        break;
                    }
                    class199 var208 = class199.method3402(var207);
                    if ((!var203 || var208.field2998) && var208.field2991 == -1 && var208.field2954.toLowerCase().indexOf(var204) != -1) {
                        if (var206 >= 250) {
                            Statics.field1105 = -1;
                            Statics.field795 = null;
                            break;
                        }
                        if (var206 >= var205.length) {
                            short[] var209 = new short[var205.length * 2];
                            for (int var210 = 0; var210 < var206; var210++) {
                                var209[var210] = var205[var210];
                            }
                            var205 = var209;
                        }
                        var205[var206++] = (short) var207;
                    }
                    var207++;
                }
                field744[++Statics.field714 - 1] = Statics.field1105;
                var182 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field795 == null || Statics.field79 >= Statics.field1105) {
                    field744[++Statics.field714 - 1] = -1;
                } else {
                    field744[++Statics.field714 - 1] = Statics.field795[++Statics.field79 - 1] & 0xFFFF;
                }
                var182 = 1;
            } else if (arg0 == 4212) {
                Statics.field79 = 0;
                var182 = 1;
            } else {
                var182 = 2;
            }
            return var182;
        } else if (arg0 < 5100) {
            return method3226(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return Statics.method141(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method174(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method153(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            byte var213;
            if (arg0 == 6200) {
                Statics.field714 -= 2;
                client.field326 = (short) field744[Statics.field714];
                if (client.field326 <= 0) {
                    client.field326 = 256;
                }
                client.field559 = (short) field744[Statics.field714 + 1];
                if (client.field559 <= 0) {
                    client.field559 = 205;
                }
                var213 = 1;
            } else if (arg0 == 6201) {
                Statics.field714 -= 2;
                client.field560 = (short) field744[Statics.field714];
                if (client.field560 <= 0) {
                    client.field560 = 256;
                }
                client.field561 = (short) field744[Statics.field714 + 1];
                if (client.field561 <= 0) {
                    client.field561 = 320;
                }
                var213 = 1;
            } else if (arg0 == 6202) {
                Statics.field714 -= 4;
                client.field506 = (short) field744[Statics.field714];
                if (client.field506 <= 0) {
                    client.field506 = 1;
                }
                client.field563 = (short) field744[Statics.field714 + 1];
                if (client.field563 <= 0) {
                    client.field563 = 32767;
                } else if (client.field563 < client.field506) {
                    client.field563 = client.field506;
                }
                client.field564 = (short) field744[Statics.field714 + 2];
                if (client.field564 <= 0) {
                    client.field564 = 1;
                }
                client.field565 = (short) field744[Statics.field714 + 3];
                if (client.field565 <= 0) {
                    client.field565 = 32767;
                } else if (client.field565 < client.field564) {
                    client.field565 = client.field564;
                }
                var213 = 1;
            } else if (arg0 == 6203) {
                if (client.field476 == null) {
                    field744[++Statics.field714 - 1] = -1;
                    field744[++Statics.field714 - 1] = -1;
                } else {
                    client.method155(0, 0, client.field476.field2294, client.field476.field2210, false);
                    field744[++Statics.field714 - 1] = client.field568;
                    field744[++Statics.field714 - 1] = client.field569;
                }
                var213 = 1;
            } else if (arg0 == 6204) {
                field744[++Statics.field714 - 1] = client.field560;
                field744[++Statics.field714 - 1] = client.field561;
                var213 = 1;
            } else if (arg0 == 6205) {
                field744[++Statics.field714 - 1] = client.field326;
                field744[++Statics.field714 - 1] = client.field559;
                var213 = 1;
            } else {
                var213 = 2;
            }
            return var213;
        } else if (arg0 < 6600) {
            return method1096(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fm.r(ILaz;ZI)I")
    public static int method2893(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field714 -= 3;
            int var3 = field744[Statics.field714];
            int var4 = field744[Statics.field714 + 1];
            int var5 = field744[Statics.field714 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class170 var6 = Statics.method1837(var3);
            if (var6.field2344 == null) {
                var6.field2344 = new class170[var5 + 1];
            }
            if (var6.field2344.length <= var5) {
                class170[] var7 = new class170[var5 + 1];
                for (int var8 = 0; var8 < var6.field2344.length; var8++) {
                    var7[var8] = var6.field2344[var8];
                }
                var6.field2344 = var7;
            }
            if (var5 > 0 && var6.field2344[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class170 var9 = new class170();
            var9.field2241 = var4;
            var9.field2239 = var9.field2274 = var6.field2274;
            var9.field2221 = var5;
            var9.field2230 = true;
            var6.field2344[var5] = var9;
            if (arg2) {
                Statics.field2124 = var9;
            } else {
                Statics.field747 = var9;
            }
            client.method198(var6);
            return 1;
        } else if (arg0 == 101) {
            class170 var10 = arg2 ? Statics.field2124 : Statics.field747;
            class170 var11 = Statics.method1837(var10.field2274);
            var11.field2344[var10.field2221] = null;
            client.method198(var11);
            return 1;
        } else if (arg0 == 102) {
            class170 var12 = Statics.method1837(field744[--Statics.field714]);
            var12.field2344 = null;
            client.method198(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field714 -= 2;
            int var13 = field744[Statics.field714];
            int var14 = field744[Statics.field714 + 1];
            class170 var15 = class170.method2195(var13, var14);
            if (var15 == null || var14 == -1) {
                field744[++Statics.field714 - 1] = 0;
            } else {
                field744[++Statics.field714 - 1] = 1;
                if (arg2) {
                    Statics.field2124 = var15;
                } else {
                    Statics.field747 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class170 var16 = Statics.method1837(field744[--Statics.field714]);
            if (var16 == null) {
                field744[++Statics.field714 - 1] = 0;
            } else {
                field744[++Statics.field714 - 1] = 1;
                if (arg2) {
                    Statics.field2124 = var16;
                } else {
                    Statics.field747 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cz.o(ILaz;ZI)I")
    public static int method1853(int arg0, class49 arg1, boolean arg2) {
        int var3 = -1;
        class170 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field744[--Statics.field714];
            var4 = Statics.method1837(var3);
        } else {
            var4 = arg2 ? Statics.field2124 : Statics.field747;
        }
        if (arg0 == 1000) {
            Statics.field714 -= 4;
            var4.field2229 = field744[Statics.field714];
            var4.field2238 = field744[Statics.field714 + 1];
            var4.field2352 = field744[Statics.field714 + 2];
            var4.field2218 = field744[Statics.field714 + 3];
            client.method198(var4);
            client.method55(var4);
            if (var3 != -1 && var4.field2241 == 0) {
                Statics.method17(Statics.field2240[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field714 -= 4;
            var4.field2231 = field744[Statics.field714];
            var4.field2232 = field744[Statics.field714 + 1];
            var4.field2227 = field744[Statics.field714 + 2];
            var4.field2228 = field744[Statics.field714 + 3];
            client.method198(var4);
            client.method55(var4);
            if (var3 != -1 && var4.field2241 == 0) {
                Statics.method17(Statics.field2240[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field744[--Statics.field714] == 1;
            if (var4.field2256 != var5) {
                var4.field2256 = var5;
                client.method198(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2211 = field744[--Statics.field714] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2354 = field744[--Statics.field714] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("an.l(ILaz;ZI)I")
    public static int method573(int arg0, class49 arg1, boolean arg2) {
        int var3 = -1;
        class170 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field744[--Statics.field714];
            var4 = Statics.method1837(var3);
        } else {
            var4 = arg2 ? Statics.field2124 : Statics.field747;
        }
        if (arg0 == 1100) {
            Statics.field714 -= 2;
            var4.field2332 = field744[Statics.field714];
            if (var4.field2332 > var4.field2328 - var4.field2294) {
                var4.field2332 = var4.field2328 - var4.field2294;
            }
            if (var4.field2332 < 0) {
                var4.field2332 = 0;
            }
            var4.field2217 = field744[Statics.field714 + 1];
            if (var4.field2217 > var4.field2244 - var4.field2210) {
                var4.field2217 = var4.field2244 - var4.field2210;
            }
            if (var4.field2217 < 0) {
                var4.field2217 = 0;
            }
            client.method198(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2245 = field744[--Statics.field714];
            client.method198(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2268 = field744[--Statics.field714] == 1;
            client.method198(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2251 = field744[--Statics.field714];
            client.method198(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2219 = field744[--Statics.field714];
            client.method198(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2236 = field744[--Statics.field714];
            client.method198(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2295 = field744[--Statics.field714];
            client.method198(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2258 = field744[--Statics.field714] == 1;
            client.method198(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2243 = 1;
            var4.field2264 = field744[--Statics.field714];
            client.method198(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field714 -= 6;
            var4.field2269 = field744[Statics.field714];
            var4.field2270 = field744[Statics.field714 + 1];
            var4.field2271 = field744[Statics.field714 + 2];
            var4.field2272 = field744[Statics.field714 + 3];
            var4.field2273 = field744[Statics.field714 + 4];
            var4.field2321 = field744[Statics.field714 + 5];
            client.method198(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field744[--Statics.field714];
            if (var4.field2267 != var5) {
                var4.field2267 = var5;
                var4.field2345 = 0;
                var4.field2343 = 0;
                client.method198(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2297 = field744[--Statics.field714] == 1;
            client.method198(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field751[--Statics.field750];
            if (!var6.equals(var4.field2280)) {
                var4.field2280 = var6;
                client.method198(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2308 = field744[--Statics.field714];
            client.method198(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field714 -= 3;
            var4.field2220 = field744[Statics.field714];
            var4.field2284 = field744[Statics.field714 + 1];
            var4.field2213 = field744[Statics.field714 + 2];
            client.method198(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2299 = field744[--Statics.field714] == 1;
            client.method198(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2259 = field744[--Statics.field714];
            client.method198(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2260 = field744[--Statics.field714];
            client.method198(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2306 = field744[--Statics.field714] == 1;
            client.method198(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2262 = field744[--Statics.field714] == 1;
            client.method198(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field714 -= 2;
            var4.field2328 = field744[Statics.field714];
            var4.field2244 = field744[Statics.field714 + 1];
            client.method198(var4);
            if (var3 != -1 && var4.field2241 == 0) {
                Statics.method17(Statics.field2240[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2274;
            int var8 = var4.field2221;
            client.field495.method2889(153);
            client.field495.method2699(var8);
            client.field495.method2707(var7);
            client.field468 = var4;
            client.method198(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2333 = field744[--Statics.field714];
            client.method198(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2246 = field744[--Statics.field714];
            client.method198(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2252 = field744[--Statics.field714];
            client.method198(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var9 = field744[--Statics.field714];
            class222[] var10 = new class222[] { class222.field3201, class222.field3202, class222.field3204, class222.field3203, class222.field3207 };
            class222 var11 = (class222) class149.method557(var10, var9);
            if (var11 != null) {
                var4.field2250 = var11;
                client.method198(var4);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ay.m(ILaz;ZI)I")
    public static int method907(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.method1837(field744[--Statics.field714]);
        } else {
            var3 = arg2 ? Statics.field2124 : Statics.field747;
        }
        if (arg0 == 1300) {
            int var4 = field744[--Statics.field714] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3050(var4, field751[--Statics.field750]);
                return 1;
            } else {
                Statics.field750--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field714 -= 2;
            int var5 = field744[Statics.field714];
            int var6 = field744[Statics.field714 + 1];
            var3.field2303 = class170.method2195(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2298 = field744[--Statics.field714] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2296 = field744[--Statics.field714];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2224 = field744[--Statics.field714];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2293 = field751[--Statics.field750];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2329 = field751[--Statics.field750];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2247 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("t.w(ILaz;ZI)I")
    public static int method236(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.method1837(field744[--Statics.field714]);
        } else {
            var3 = arg2 ? Statics.field2124 : Statics.field747;
        }
        String var4 = field751[--Statics.field750];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field744[--Statics.field714];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field744[--Statics.field714];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field751[--Statics.field750];
            } else {
                var7[var8] = Integer.valueOf(field744[--Statics.field714]);
            }
        }
        int var9 = field744[--Statics.field714];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2338 = var7;
        } else if (arg0 == 1401) {
            var3.field2305 = var7;
        } else if (arg0 == 1402) {
            var3.field2304 = var7;
        } else if (arg0 == 1403) {
            var3.field2301 = var7;
        } else if (arg0 == 1404) {
            var3.field2249 = var7;
        } else if (arg0 == 1405) {
            var3.field2309 = var7;
        } else if (arg0 == 1406) {
            var3.field2312 = var7;
        } else if (arg0 == 1407) {
            var3.field2313 = var7;
            var3.field2314 = var5;
        } else if (arg0 == 1408) {
            var3.field2319 = var7;
        } else if (arg0 == 1409) {
            var3.field2320 = var7;
        } else if (arg0 == 1410) {
            var3.field2311 = var7;
        } else if (arg0 == 1411) {
            var3.field2288 = var7;
        } else if (arg0 == 1412) {
            var3.field2307 = var7;
        } else if (arg0 == 1414) {
            var3.field2315 = var7;
            var3.field2316 = var5;
        } else if (arg0 == 1415) {
            var3.field2317 = var7;
            var3.field2283 = var5;
        } else if (arg0 == 1416) {
            var3.field2351 = var7;
        } else if (arg0 == 1417) {
            var3.field2263 = var7;
        } else if (arg0 == 1418) {
            var3.field2322 = var7;
        } else if (arg0 == 1419) {
            var3.field2323 = var7;
        } else if (arg0 == 1420) {
            var3.field2291 = var7;
        } else if (arg0 == 1421) {
            var3.field2325 = var7;
        } else if (arg0 == 1422) {
            var3.field2285 = var7;
        } else if (arg0 == 1423) {
            var3.field2327 = var7;
        } else if (arg0 == 1424) {
            var3.field2235 = var7;
        } else if (arg0 == 1425) {
            var3.field2330 = var7;
        } else if (arg0 == 1426) {
            var3.field2331 = var7;
        } else if (arg0 == 1427) {
            var3.field2342 = var7;
        } else {
            return 2;
        }
        var3.field2300 = true;
        return 1;
    }

    @ObfuscatedName("i.j(ILaz;ZB)I")
    public static int method5(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = arg2 ? Statics.field2124 : Statics.field747;
        if (arg0 == 1800) {
            int[] var4 = field744;
            int var5 = ++Statics.field714 - 1;
            int var6 = client.method3309(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 1801) {
            int var8 = field744[--Statics.field714];
            int var9 = var8 - 1;
            if (var3.field2247 == null || var9 >= var3.field2247.length || var3.field2247[var9] == null) {
                field751[++Statics.field750 - 1] = "";
            } else {
                field751[++Statics.field750 - 1] = var3.field2247[var9];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2293 == null) {
                field751[++Statics.field750 - 1] = "";
            } else {
                field751[++Statics.field750 - 1] = var3.field2293;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gk.s(ILaz;ZI)I")
    public static int method3600(int arg0, class49 arg1, boolean arg2) {
        class170 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.method1837(field744[--Statics.field714]);
        } else {
            var3 = arg2 ? Statics.field2124 : Statics.field747;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field752 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2342 == null) {
            return 0;
        } else {
            class19 var4 = new class19();
            var4.field208 = var3;
            var4.field200 = var3.field2342;
            var4.field209 = field752 + 1;
            client.field503.method2296(var4);
            return 1;
        }
    }

    @ObfuscatedName("x.q(ILaz;ZI)I")
    public static int method181(int arg0, class49 arg1, boolean arg2) {
        class170 var3 = Statics.method1837(field744[--Statics.field714]);
        if (arg0 == 2500) {
            field744[++Statics.field714 - 1] = var3.field2233;
            return 1;
        } else if (arg0 == 2501) {
            field744[++Statics.field714 - 1] = var3.field2234;
            return 1;
        } else if (arg0 == 2502) {
            field744[++Statics.field714 - 1] = var3.field2294;
            return 1;
        } else if (arg0 == 2503) {
            field744[++Statics.field714 - 1] = var3.field2210;
            return 1;
        } else if (arg0 == 2504) {
            field744[++Statics.field714 - 1] = var3.field2256 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field744[++Statics.field714 - 1] = var3.field2239;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("db.d(ILaz;ZI)I")
    public static int method2142(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field751[--Statics.field750];
            class48.method225(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field714 -= 2;
            client.method166(Statics.field899, field744[Statics.field714], field744[Statics.field714 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            client.method3194();
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field751[--Statics.field750];
            int var5 = 0;
            if (class208.method1994(var4)) {
                int var6 = class208.method3324(var4, 10, true);
                var5 = var6;
            }
            client.field495.method2889(202);
            client.field495.method2654(var5);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field751[--Statics.field750];
            client.field495.method2889(127);
            client.field495.method2651(var7.length() + 1);
            client.field495.method2730(var7);
            return 1;
        } else if (arg0 == 3106) {
            String var8 = field751[--Statics.field750];
            client.field495.method2889(168);
            client.field495.method2651(var8.length() + 1);
            client.field495.method2730(var8);
            return 1;
        } else if (arg0 == 3107) {
            int var9 = field744[--Statics.field714];
            String var10 = field751[--Statics.field750];
            int var11 = class46.field924;
            int[] var12 = class46.field919;
            boolean var13 = false;
            for (int var14 = 0; var14 < var11; var14++) {
                class24 var15 = client.field423[var12[var14]];
                if (var15 != null && Statics.field899 != var15 && var15.field279 != null && var15.field279.equalsIgnoreCase(var10)) {
                    if (var9 == 1) {
                        client.field495.method2889(28);
                        client.field495.method2651(0);
                        client.field495.method2694(var12[var14]);
                    } else if (var9 == 4) {
                        client.field495.method2889(135);
                        client.field495.method2694(var12[var14]);
                        client.field495.method2691(0);
                    } else if (var9 == 6) {
                        client.field495.method2889(172);
                        client.field495.method2694(var12[var14]);
                        client.field495.method2651(0);
                    } else if (var9 == 7) {
                        client.field495.method2889(45);
                        client.field495.method2772(var12[var14]);
                        client.field495.method2691(0);
                    }
                    var13 = true;
                    break;
                }
            }
            if (!var13) {
                class48.method225(4, "", class174.field2522 + var10);
            }
            return 1;
        } else if (arg0 == 3108) {
            Statics.field714 -= 3;
            int var16 = field744[Statics.field714];
            int var17 = field744[Statics.field714 + 1];
            int var18 = field744[Statics.field714 + 2];
            class170 var19 = Statics.method1837(var18);
            client.method188(var19, var16, var17);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field714 -= 2;
            int var20 = field744[Statics.field714];
            int var21 = field744[Statics.field714 + 1];
            class170 var22 = arg2 ? Statics.field2124 : Statics.field747;
            client.method188(var22, var20, var21);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field2688 = field744[--Statics.field714] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field744[++Statics.field714 - 1] = Statics.field2059.field717 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field2059.field717 = field744[--Statics.field714] == 1;
            class31.method2638();
            return 1;
        } else if (arg0 == 3113) {
            String var23 = field751[--Statics.field750];
            boolean var24 = field744[--Statics.field714] == 1;
            class115.method609(var23, var24, false);
            return 1;
        } else if (arg0 == 3115) {
            int var25 = field744[--Statics.field714];
            client.field495.method2889(121);
            client.field495.method2793(var25);
            return 1;
        } else if (arg0 == 3116) {
            int var26 = field744[--Statics.field714];
            Statics.field750 -= 2;
            String var27 = field751[Statics.field750];
            String var28 = field751[Statics.field750 + 1];
            if (var27.length() > 500) {
                return 1;
            } else if (var28.length() > 500) {
                return 1;
            } else {
                client.field495.method2889(173);
                client.field495.method2793(1 + class154.method1352(var27) + class154.method1352(var28));
                client.field495.method2730(var28);
                client.field495.method2691(var26);
                client.field495.method2730(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field418 = field744[--Statics.field714] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("co.p(ILaz;ZB)I")
    public static int method1879(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (client.field572 == 0) {
                field744[++Statics.field714 - 1] = -2;
            } else if (client.field572 == 1) {
                field744[++Statics.field714 - 1] = -1;
            } else {
                field744[++Statics.field714 - 1] = client.field556;
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field744[--Statics.field714];
            if (client.field572 == 2 && var3 < client.field556) {
                field751[++Statics.field750 - 1] = client.field298[var3].field166;
                field751[++Statics.field750 - 1] = client.field298[var3].field155;
            } else {
                field751[++Statics.field750 - 1] = "";
                field751[++Statics.field750 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var4 = field744[--Statics.field714];
            if (client.field572 == 2 && var4 < client.field556) {
                field744[++Statics.field714 - 1] = client.field298[var4].field156;
            } else {
                field744[++Statics.field714 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var5 = field744[--Statics.field714];
            if (client.field572 == 2 && var5 < client.field556) {
                field744[++Statics.field714 - 1] = client.field298[var5].field164;
            } else {
                field744[++Statics.field714 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var6 = field751[--Statics.field750];
            int var7 = field744[--Statics.field714];
            client.field495.method2889(32);
            client.field495.method2651(class154.method1352(var6) + 1);
            client.field495.method2730(var6);
            client.field495.method2691(var7);
            return 1;
        } else if (arg0 == 3605) {
            String var8 = field751[--Statics.field750];
            if (var8 != null) {
                if ((client.field556 < 200 || client.field314 == 1) && client.field556 < 400) {
                    String var9 = class205.method3259(var8, Statics.field215);
                    if (var9 != null) {
                        int var10 = 0;
                        while (true) {
                            if (var10 >= client.field556) {
                                for (int var14 = 0; var14 < client.field575; var14++) {
                                    class20 var15 = client.field576[var14];
                                    String var16 = class205.method3259(var15.field226, Statics.field215);
                                    if (var16 != null && var16.equals(var9)) {
                                        class48.method225(30, "", class174.field2412 + var8 + class174.field2546);
                                        return 1;
                                    }
                                    if (var15.field223 != null) {
                                        String var17 = class205.method3259(var15.field223, Statics.field215);
                                        if (var17 != null && var17.equals(var9)) {
                                            class48.method225(30, "", class174.field2412 + var8 + class174.field2546);
                                            return 1;
                                        }
                                    }
                                }
                                if (class205.method3259(Statics.field899.field279, Statics.field215).equals(var9)) {
                                    class48.method225(30, "", class174.field2479);
                                } else {
                                    client.field495.method2889(228);
                                    client.field495.method2651(class154.method1352(var8));
                                    client.field495.method2730(var8);
                                }
                                break;
                            }
                            class15 var11 = client.field298[var10];
                            String var12 = class205.method3259(var11.field166, Statics.field215);
                            if (var12 != null && var12.equals(var9)) {
                                class48.method225(30, "", var8 + class174.field2590);
                                break;
                            }
                            if (var11.field155 != null) {
                                String var13 = class205.method3259(var11.field155, Statics.field215);
                                if (var13 != null && var13.equals(var9)) {
                                    class48.method225(30, "", var8 + class174.field2590);
                                    break;
                                }
                            }
                            var10++;
                        }
                    }
                } else {
                    class48.method225(30, "", class174.field2557);
                }
            }
            return 1;
        } else if (arg0 == 3606) {
            String var18 = field751[--Statics.field750];
            if (var18 != null) {
                String var19 = class205.method3259(var18, Statics.field215);
                if (var19 != null) {
                    for (int var20 = 0; var20 < client.field556; var20++) {
                        class15 var21 = client.field298[var20];
                        String var22 = var21.field166;
                        String var23 = class205.method3259(var22, Statics.field215);
                        boolean var24;
                        if (var18 == null || var22 == null) {
                            var24 = false;
                        } else if (var18.startsWith("#") || var22.startsWith("#")) {
                            var24 = var18.equals(var22);
                        } else {
                            var24 = var19.equals(var23);
                        }
                        if (var24) {
                            client.field556--;
                            for (int var25 = var20; var25 < client.field556; var25++) {
                                client.field298[var25] = client.field298[var25 + 1];
                            }
                            client.field497 = client.field562;
                            client.field495.method2889(89);
                            client.field495.method2651(class154.method1352(var18));
                            client.field495.method2730(var18);
                            break;
                        }
                    }
                }
            }
            return 1;
        } else if (arg0 == 3607) {
            String var26 = field751[--Statics.field750];
            if (var26 != null) {
                if ((client.field575 < 100 || client.field314 == 1) && client.field575 < 400) {
                    String var27 = class205.method3259(var26, Statics.field215);
                    if (var27 != null) {
                        int var28 = 0;
                        while (true) {
                            if (var28 >= client.field575) {
                                for (int var32 = 0; var32 < client.field556; var32++) {
                                    class15 var33 = client.field298[var32];
                                    String var34 = class205.method3259(var33.field166, Statics.field215);
                                    if (var34 != null && var34.equals(var27)) {
                                        class48.method225(31, "", class174.field2547 + var26 + class174.field2544);
                                        return 1;
                                    }
                                    if (var33.field155 != null) {
                                        String var35 = class205.method3259(var33.field155, Statics.field215);
                                        if (var35 != null && var35.equals(var27)) {
                                            class48.method225(31, "", class174.field2547 + var26 + class174.field2544);
                                            return 1;
                                        }
                                    }
                                }
                                if (class205.method3259(Statics.field899.field279, Statics.field215).equals(var27)) {
                                    class48.method225(31, "", class174.field2592);
                                } else {
                                    client.field495.method2889(95);
                                    client.field495.method2651(class154.method1352(var26));
                                    client.field495.method2730(var26);
                                }
                                break;
                            }
                            class20 var29 = client.field576[var28];
                            String var30 = class205.method3259(var29.field226, Statics.field215);
                            if (var30 != null && var30.equals(var27)) {
                                class48.method225(31, "", var26 + class174.field2542);
                                break;
                            }
                            if (var29.field223 != null) {
                                String var31 = class205.method3259(var29.field223, Statics.field215);
                                if (var31 != null && var31.equals(var27)) {
                                    class48.method225(31, "", var26 + class174.field2542);
                                    break;
                                }
                            }
                            var28++;
                        }
                    }
                } else {
                    class48.method225(31, "", class174.field2499);
                }
            }
            return 1;
        } else if (arg0 == 3608) {
            String var36 = field751[--Statics.field750];
            if (var36 != null) {
                String var37 = class205.method3259(var36, Statics.field215);
                if (var37 != null) {
                    for (int var38 = 0; var38 < client.field575; var38++) {
                        class20 var39 = client.field576[var38];
                        String var40 = var39.field226;
                        String var41 = class205.method3259(var40, Statics.field215);
                        boolean var42;
                        if (var36 == null || var40 == null) {
                            var42 = false;
                        } else if (var36.startsWith("#") || var40.startsWith("#")) {
                            var42 = var36.equals(var40);
                        } else {
                            var42 = var37.equals(var41);
                        }
                        if (var42) {
                            client.field575--;
                            for (int var43 = var38; var43 < client.field575; var43++) {
                                client.field576[var43] = client.field576[var43 + 1];
                            }
                            client.field497 = client.field562;
                            client.field495.method2889(64);
                            client.field495.method2651(class154.method1352(var36));
                            client.field495.method2730(var36);
                            break;
                        }
                    }
                }
            }
            return 1;
        } else if (arg0 == 3609) {
            String var44 = field751[--Statics.field750];
            class178[] var45 = class178.method24();
            for (int var46 = 0; var46 < var45.length; var46++) {
                class178 var47 = var45[var46];
                if (var47.field2696 != -1 && var44.startsWith(class38.method645(var47.field2696))) {
                    var44 = var44.substring(6 + Integer.toString(var47.field2696).length());
                    break;
                }
            }
            field744[++Statics.field714 - 1] = client.method138(var44, false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (client.field531 == null) {
                field751[++Statics.field750 - 1] = "";
            } else {
                String[] var48 = field751;
                int var49 = ++Statics.field750 - 1;
                String var50 = client.field531;
                String var51 = class206.method81(class206.method752(var50));
                if (var51 == null) {
                    var51 = "";
                }
                var48[var49] = var51;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (client.field531 == null) {
                field744[++Statics.field714 - 1] = 0;
            } else {
                field744[++Statics.field714 - 1] = Statics.field1449;
            }
            return 1;
        } else if (arg0 == 3613) {
            int var53 = field744[--Statics.field714];
            if (client.field531 == null || var53 >= Statics.field1449) {
                field751[++Statics.field750 - 1] = "";
            } else {
                field751[++Statics.field750 - 1] = Statics.field2137[var53].field290;
            }
            return 1;
        } else if (arg0 == 3614) {
            int var54 = field744[--Statics.field714];
            if (client.field531 == null || var54 >= Statics.field1449) {
                field744[++Statics.field714 - 1] = 0;
            } else {
                field744[++Statics.field714 - 1] = Statics.field2137[var54].field287;
            }
            return 1;
        } else if (arg0 == 3615) {
            int var55 = field744[--Statics.field714];
            if (client.field531 == null || var55 >= Statics.field1449) {
                field744[++Statics.field714 - 1] = 0;
            } else {
                field744[++Statics.field714 - 1] = Statics.field2137[var55].field288;
            }
            return 1;
        } else if (arg0 == 3616) {
            field744[++Statics.field714 - 1] = Statics.field960;
            return 1;
        } else if (arg0 == 3617) {
            String var56 = field751[--Statics.field750];
            client.method3112(var56);
            return 1;
        } else if (arg0 == 3618) {
            field744[++Statics.field714 - 1] = Statics.field76;
            return 1;
        } else if (arg0 == 3619) {
            String var57 = field751[--Statics.field750];
            client.method756(var57);
            return 1;
        } else if (arg0 == 3620) {
            client.method2865();
            return 1;
        } else if (arg0 == 3621) {
            if (client.field572 == 0) {
                field744[++Statics.field714 - 1] = -1;
            } else {
                field744[++Statics.field714 - 1] = client.field575;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var58 = field744[--Statics.field714];
            if (client.field572 == 0 || var58 >= client.field575) {
                field751[++Statics.field750 - 1] = "";
                field751[++Statics.field750 - 1] = "";
            } else {
                field751[++Statics.field750 - 1] = client.field576[var58].field226;
                field751[++Statics.field750 - 1] = client.field576[var58].field223;
            }
            return 1;
        } else if (arg0 == 3623) {
            String var59 = field751[--Statics.field750];
            if (var59.startsWith(class38.method645(0)) || var59.startsWith(class38.method645(1))) {
                var59 = var59.substring(7);
            }
            field744[++Statics.field714 - 1] = client.method1844(var59) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var60 = field744[--Statics.field714];
            if (Statics.field2137 == null || var60 >= Statics.field1449 || !Statics.field2137[var60].field290.equalsIgnoreCase(Statics.field899.field279)) {
                field744[++Statics.field714 - 1] = 0;
            } else {
                field744[++Statics.field714 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (client.field416 == null) {
                field751[++Statics.field750 - 1] = "";
            } else {
                String[] var61 = field751;
                int var62 = ++Statics.field750 - 1;
                String var63 = client.field416;
                String var64 = class206.method81(class206.method752(var63));
                if (var64 == null) {
                    var64 = "";
                }
                var61[var62] = var64;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ek.y(ILaz;ZB)I")
    public static int method2649(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field751[--Statics.field750];
            int var4 = field744[--Statics.field714];
            field751[++Statics.field750 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field750 -= 2;
            String var5 = field751[Statics.field750];
            String var6 = field751[Statics.field750 + 1];
            field751[++Statics.field750 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field751[--Statics.field750];
            int var8 = field744[--Statics.field714];
            String[] var9 = field751;
            int var10 = ++Statics.field750 - 1;
            String var12;
            if (var8 < 0) {
                var12 = Integer.toString(var8);
            } else {
                int var13 = var8;
                String var14;
                if (var8 < 0) {
                    var14 = Integer.toString(var8, 10);
                } else {
                    int var15 = 2;
                    int var16 = var8 / 10;
                    while (var16 != 0) {
                        var16 /= 10;
                        var15++;
                    }
                    char[] var17 = new char[var15];
                    var17[0] = '+';
                    for (int var18 = var15 - 1; var18 > 0; var18--) {
                        int var19 = var13;
                        var13 /= 10;
                        int var20 = var19 - var13 * 10;
                        if (var20 >= 10) {
                            var17[var18] = (char) (var20 + 87);
                        } else {
                            var17[var18] = (char) (var20 + 48);
                        }
                    }
                    var14 = new String(var17);
                }
                var12 = var14;
            }
            var9[var10] = var7 + var12;
            return 1;
        } else if (arg0 == 4103) {
            String var21 = field751[--Statics.field750];
            field751[++Statics.field750 - 1] = var21.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var22 = field744[--Statics.field714];
            long var23 = ((long) var22 + 11745L) * 86400000L;
            field753.setTime(new Date(var23));
            int var25 = field753.get(5);
            int var26 = field753.get(2);
            int var27 = field753.get(1);
            field751[++Statics.field750 - 1] = var25 + "-" + field745[var26] + "-" + var27;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field750 -= 2;
            String var28 = field751[Statics.field750];
            String var29 = field751[Statics.field750 + 1];
            if (Statics.field899.field257 != null && Statics.field899.field257.field2187) {
                field751[++Statics.field750 - 1] = var29;
            } else {
                field751[++Statics.field750 - 1] = var28;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var30 = field744[--Statics.field714];
            field751[++Statics.field750 - 1] = Integer.toString(var30);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field750 -= 2;
            field744[++Statics.field714 - 1] = class208.method90(class203.method917(field751[Statics.field750], field751[Statics.field750 + 1], client.field309));
            return 1;
        } else if (arg0 == 4108) {
            String var31 = field751[--Statics.field750];
            Statics.field714 -= 2;
            int var32 = field744[Statics.field714];
            int var33 = field744[Statics.field714 + 1];
            byte[] var34 = Statics.field57.method3163(var33, 0);
            class209 var35 = new class209(var34);
            field744[++Statics.field714 - 1] = var35.method3695(var31, var32);
            return 1;
        } else if (arg0 == 4109) {
            String var36 = field751[--Statics.field750];
            Statics.field714 -= 2;
            int var37 = field744[Statics.field714];
            int var38 = field744[Statics.field714 + 1];
            byte[] var39 = Statics.field57.method3163(var38, 0);
            class209 var40 = new class209(var39);
            field744[++Statics.field714 - 1] = var40.method3683(var36, var37);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field750 -= 2;
            String var41 = field751[Statics.field750];
            String var42 = field751[Statics.field750 + 1];
            if (field744[--Statics.field714] == 1) {
                field751[++Statics.field750 - 1] = var41;
            } else {
                field751[++Statics.field750 - 1] = var42;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var43 = field751[--Statics.field750];
            field751[++Statics.field750 - 1] = class210.method3675(var43);
            return 1;
        } else if (arg0 == 4112) {
            String var44 = field751[--Statics.field750];
            int var45 = field744[--Statics.field714];
            field751[++Statics.field750 - 1] = var44 + (char) var45;
            return 1;
        } else if (arg0 == 4113) {
            int var46 = field744[--Statics.field714];
            int[] var47 = field744;
            int var48 = ++Statics.field714 - 1;
            char var49 = (char) var46;
            boolean var50;
            if (var49 >= ' ' && var49 <= '~') {
                var50 = true;
            } else if (var49 >= 160 && var49 <= 255) {
                var50 = true;
            } else if (var49 == 8364 || var49 == 338 || var49 == 8212 || var49 == 339 || var49 == 376) {
                var50 = true;
            } else {
                var50 = false;
            }
            var47[var48] = var50 ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var51 = field744[--Statics.field714];
            int[] var52 = field744;
            int var53 = ++Statics.field714 - 1;
            char var54 = (char) var51;
            boolean var55 = var54 >= '0' && var54 <= '9' || var54 >= 'A' && var54 <= 'Z' || var54 >= 'a' && var54 <= 'z';
            var52[var53] = var55 ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var56 = field744[--Statics.field714];
            field744[++Statics.field714 - 1] = class208.method1647((char) var56) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var57 = field744[--Statics.field714];
            field744[++Statics.field714 - 1] = class208.method3611((char) var57) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var58 = field751[--Statics.field750];
            if (var58 == null) {
                field744[++Statics.field714 - 1] = 0;
            } else {
                field744[++Statics.field714 - 1] = var58.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var59 = field751[--Statics.field750];
            Statics.field714 -= 2;
            int var60 = field744[Statics.field714];
            int var61 = field744[Statics.field714 + 1];
            field751[++Statics.field750 - 1] = var59.substring(var60, var61);
            return 1;
        } else if (arg0 == 4119) {
            String var62 = field751[--Statics.field750];
            StringBuilder var63 = new StringBuilder(var62.length());
            boolean var64 = false;
            for (int var65 = 0; var65 < var62.length(); var65++) {
                char var66 = var62.charAt(var65);
                if (var66 == '<') {
                    var64 = true;
                } else if (var66 == '>') {
                    var64 = false;
                } else if (!var64) {
                    var63.append(var66);
                }
            }
            field751[++Statics.field750 - 1] = var63.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var67 = field751[--Statics.field750];
            int var68 = field744[--Statics.field714];
            field744[++Statics.field714 - 1] = var67.indexOf(var68);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field750 -= 2;
            String var69 = field751[Statics.field750];
            String var70 = field751[Statics.field750 + 1];
            int var71 = field744[--Statics.field714];
            field744[++Statics.field714 - 1] = var69.indexOf(var70, var71);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gp.a(ILaz;ZI)I")
    public static int method3226(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field744[++Statics.field714 - 1] = client.field522;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field714 -= 3;
            client.field522 = field744[Statics.field714];
            Statics.field2042 = class217.method1406(field744[Statics.field714 + 1]);
            if (Statics.field2042 == null) {
                Statics.field2042 = class217.field3183;
            }
            client.field523 = field744[Statics.field714 + 2];
            client.field495.method2889(77);
            client.field495.method2651(client.field522);
            client.field495.method2651(Statics.field2042.field3182);
            client.field495.method2651(client.field523);
            return 1;
        } else if (arg0 == 5002) {
            String var3 = field751[--Statics.field750];
            Statics.field714 -= 2;
            int var4 = field744[Statics.field714];
            int var5 = field744[Statics.field714 + 1];
            client.field495.method2889(208);
            client.field495.method2651(class154.method1352(var3) + 2);
            client.field495.method2730(var3);
            client.field495.method2651(var4 - 1);
            client.field495.method2651(var5);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field714 -= 2;
            int var6 = field744[Statics.field714];
            int var7 = field744[Statics.field714 + 1];
            class22 var8 = Statics.method175(var6, var7);
            if (var8 == null) {
                field744[++Statics.field714 - 1] = -1;
                field744[++Statics.field714 - 1] = 0;
                field751[++Statics.field750 - 1] = "";
                field751[++Statics.field750 - 1] = "";
                field751[++Statics.field750 - 1] = "";
            } else {
                field744[++Statics.field714 - 1] = var8.field242;
                field744[++Statics.field714 - 1] = var8.field240;
                field751[++Statics.field750 - 1] = var8.field239 == null ? "" : var8.field239;
                field751[++Statics.field750 - 1] = var8.field243 == null ? "" : var8.field243;
                field751[++Statics.field750 - 1] = var8.field249 == null ? "" : var8.field249;
            }
            return 1;
        } else if (arg0 == 5004) {
            int var9 = field744[--Statics.field714];
            class22 var10 = (class22) class48.field950.method2217((long) var9);
            if (var10 == null) {
                field744[++Statics.field714 - 1] = -1;
                field744[++Statics.field714 - 1] = 0;
                field751[++Statics.field750 - 1] = "";
                field751[++Statics.field750 - 1] = "";
                field751[++Statics.field750 - 1] = "";
            } else {
                field744[++Statics.field714 - 1] = var10.field244;
                field744[++Statics.field714 - 1] = var10.field240;
                field751[++Statics.field750 - 1] = var10.field239 == null ? "" : var10.field239;
                field751[++Statics.field750 - 1] = var10.field243 == null ? "" : var10.field243;
                field751[++Statics.field750 - 1] = var10.field249 == null ? "" : var10.field249;
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field2042 == null) {
                field744[++Statics.field714 - 1] = -1;
            } else {
                field744[++Statics.field714 - 1] = Statics.field2042.field3182;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var12 = field751[--Statics.field750];
            int var13 = field744[--Statics.field714];
            String var14 = var12.toLowerCase();
            byte var15 = 0;
            if (var14.startsWith(class174.field2415)) {
                var15 = 0;
                var12 = var12.substring(class174.field2415.length());
            } else if (var14.startsWith(class174.field2540)) {
                var15 = 1;
                var12 = var12.substring(class174.field2540.length());
            } else if (var14.startsWith(class174.field2553)) {
                var15 = 2;
                var12 = var12.substring(class174.field2553.length());
            } else if (var14.startsWith(class174.field2555)) {
                var15 = 3;
                var12 = var12.substring(class174.field2555.length());
            } else if (var14.startsWith(class174.field2548)) {
                var15 = 4;
                var12 = var12.substring(class174.field2548.length());
            } else if (var14.startsWith(class174.field2559)) {
                var15 = 5;
                var12 = var12.substring(class174.field2559.length());
            } else if (var14.startsWith(class174.field2561)) {
                var15 = 6;
                var12 = var12.substring(class174.field2561.length());
            } else if (var14.startsWith(class174.field2563)) {
                var15 = 7;
                var12 = var12.substring(class174.field2563.length());
            } else if (var14.startsWith(class174.field2565)) {
                var15 = 8;
                var12 = var12.substring(class174.field2565.length());
            } else if (var14.startsWith(class174.field2567)) {
                var15 = 9;
                var12 = var12.substring(class174.field2567.length());
            } else if (var14.startsWith(class174.field2486)) {
                var15 = 10;
                var12 = var12.substring(class174.field2486.length());
            } else if (var14.startsWith(class174.field2571)) {
                var15 = 11;
                var12 = var12.substring(class174.field2571.length());
            } else if (client.field309 != 0) {
                if (var14.startsWith(class174.field2523)) {
                    var15 = 0;
                    var12 = var12.substring(class174.field2523.length());
                } else if (var14.startsWith(class174.field2510)) {
                    var15 = 1;
                    var12 = var12.substring(class174.field2510.length());
                } else if (var14.startsWith(class174.field2593)) {
                    var15 = 2;
                    var12 = var12.substring(class174.field2593.length());
                } else if (var14.startsWith(class174.field2556)) {
                    var15 = 3;
                    var12 = var12.substring(class174.field2556.length());
                } else if (var14.startsWith(class174.field2635)) {
                    var15 = 4;
                    var12 = var12.substring(class174.field2635.length());
                } else if (var14.startsWith(class174.field2560)) {
                    var15 = 5;
                    var12 = var12.substring(class174.field2560.length());
                } else if (var14.startsWith(class174.field2562)) {
                    var15 = 6;
                    var12 = var12.substring(class174.field2562.length());
                } else if (var14.startsWith(class174.field2564)) {
                    var15 = 7;
                    var12 = var12.substring(class174.field2564.length());
                } else if (var14.startsWith(class174.field2566)) {
                    var15 = 8;
                    var12 = var12.substring(class174.field2566.length());
                } else if (var14.startsWith(class174.field2568)) {
                    var15 = 9;
                    var12 = var12.substring(class174.field2568.length());
                } else if (var14.startsWith(class174.field2579)) {
                    var15 = 10;
                    var12 = var12.substring(class174.field2579.length());
                } else if (var14.startsWith(class174.field2572)) {
                    var15 = 11;
                    var12 = var12.substring(class174.field2572.length());
                }
            }
            String var16 = var12.toLowerCase();
            byte var17 = 0;
            if (var16.startsWith(class174.field2600)) {
                var17 = 1;
                var12 = var12.substring(class174.field2600.length());
            } else if (var16.startsWith(class174.field2507)) {
                var17 = 2;
                var12 = var12.substring(class174.field2507.length());
            } else if (var16.startsWith(class174.field2577)) {
                var17 = 3;
                var12 = var12.substring(class174.field2577.length());
            } else if (var16.startsWith(class174.field2649)) {
                var17 = 4;
                var12 = var12.substring(class174.field2649.length());
            } else if (var16.startsWith(class174.field2581)) {
                var17 = 5;
                var12 = var12.substring(class174.field2581.length());
            } else if (client.field309 != 0) {
                if (var16.startsWith(class174.field2549)) {
                    var17 = 1;
                    var12 = var12.substring(class174.field2549.length());
                } else if (var16.startsWith(class174.field2375)) {
                    var17 = 2;
                    var12 = var12.substring(class174.field2375.length());
                } else if (var16.startsWith(class174.field2578)) {
                    var17 = 3;
                    var12 = var12.substring(class174.field2578.length());
                } else if (var16.startsWith(class174.field2580)) {
                    var17 = 4;
                    var12 = var12.substring(class174.field2580.length());
                } else if (var16.startsWith(class174.field2582)) {
                    var17 = 5;
                    var12 = var12.substring(class174.field2582.length());
                }
            }
            client.field495.method2889(78);
            client.field495.method2651(0);
            int var18 = client.field495.field2111;
            client.field495.method2651(var13);
            client.field495.method2651(var15);
            client.field495.method2651(var17);
            class160 var19 = client.field495;
            int var20 = var19.field2111;
            int var21 = var12.length();
            byte[] var22 = new byte[var21];
            for (int var23 = 0; var23 < var21; var23++) {
                char var24 = var12.charAt(var23);
                if (!(var24 <= 0 || var24 >= 128) || !(var24 < 160 || var24 > 255)) {
                    var22[var23] = (byte) var24;
                } else if (var24 == 8364) {
                    var22[var23] = -128;
                } else if (var24 == 8218) {
                    var22[var23] = -126;
                } else if (var24 == 402) {
                    var22[var23] = -125;
                } else if (var24 == 8222) {
                    var22[var23] = -124;
                } else if (var24 == 8230) {
                    var22[var23] = -123;
                } else if (var24 == 8224) {
                    var22[var23] = -122;
                } else if (var24 == 8225) {
                    var22[var23] = -121;
                } else if (var24 == 710) {
                    var22[var23] = -120;
                } else if (var24 == 8240) {
                    var22[var23] = -119;
                } else if (var24 == 352) {
                    var22[var23] = -118;
                } else if (var24 == 8249) {
                    var22[var23] = -117;
                } else if (var24 == 338) {
                    var22[var23] = -116;
                } else if (var24 == 381) {
                    var22[var23] = -114;
                } else if (var24 == 8216) {
                    var22[var23] = -111;
                } else if (var24 == 8217) {
                    var22[var23] = -110;
                } else if (var24 == 8220) {
                    var22[var23] = -109;
                } else if (var24 == 8221) {
                    var22[var23] = -108;
                } else if (var24 == 8226) {
                    var22[var23] = -107;
                } else if (var24 == 8211) {
                    var22[var23] = -106;
                } else if (var24 == 8212) {
                    var22[var23] = -105;
                } else if (var24 == 732) {
                    var22[var23] = -104;
                } else if (var24 == 8482) {
                    var22[var23] = -103;
                } else if (var24 == 353) {
                    var22[var23] = -102;
                } else if (var24 == 8250) {
                    var22[var23] = -101;
                } else if (var24 == 339) {
                    var22[var23] = -100;
                } else if (var24 == 382) {
                    var22[var23] = -98;
                } else if (var24 == 376) {
                    var22[var23] = -97;
                } else {
                    var22[var23] = 63;
                }
            }
            var19.method2731(var22.length);
            var19.field2111 += Statics.field3134.method2592(var22, 0, var22.length, var19.field2114, var19.field2111);
            client.field495.method2663(client.field495.field2111 - var18);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field750 -= 2;
            String var27 = field751[Statics.field750];
            String var28 = field751[Statics.field750 + 1];
            client.field495.method2889(238);
            client.field495.method2793(0);
            int var29 = client.field495.field2111;
            client.field495.method2730(var27);
            class160 var30 = client.field495;
            int var31 = var30.field2111;
            int var32 = var28.length();
            byte[] var33 = new byte[var32];
            for (int var34 = 0; var34 < var32; var34++) {
                char var35 = var28.charAt(var34);
                if (var35 > 0 && var35 < 128 || var35 >= 160 && var35 <= 255) {
                    var33[var34] = (byte) var35;
                } else if (var35 == 8364) {
                    var33[var34] = -128;
                } else if (var35 == 8218) {
                    var33[var34] = -126;
                } else if (var35 == 402) {
                    var33[var34] = -125;
                } else if (var35 == 8222) {
                    var33[var34] = -124;
                } else if (var35 == 8230) {
                    var33[var34] = -123;
                } else if (var35 == 8224) {
                    var33[var34] = -122;
                } else if (var35 == 8225) {
                    var33[var34] = -121;
                } else if (var35 == 710) {
                    var33[var34] = -120;
                } else if (var35 == 8240) {
                    var33[var34] = -119;
                } else if (var35 == 352) {
                    var33[var34] = -118;
                } else if (var35 == 8249) {
                    var33[var34] = -117;
                } else if (var35 == 338) {
                    var33[var34] = -116;
                } else if (var35 == 381) {
                    var33[var34] = -114;
                } else if (var35 == 8216) {
                    var33[var34] = -111;
                } else if (var35 == 8217) {
                    var33[var34] = -110;
                } else if (var35 == 8220) {
                    var33[var34] = -109;
                } else if (var35 == 8221) {
                    var33[var34] = -108;
                } else if (var35 == 8226) {
                    var33[var34] = -107;
                } else if (var35 == 8211) {
                    var33[var34] = -106;
                } else if (var35 == 8212) {
                    var33[var34] = -105;
                } else if (var35 == 732) {
                    var33[var34] = -104;
                } else if (var35 == 8482) {
                    var33[var34] = -103;
                } else if (var35 == 353) {
                    var33[var34] = -102;
                } else if (var35 == 8250) {
                    var33[var34] = -101;
                } else if (var35 == 339) {
                    var33[var34] = -100;
                } else if (var35 == 382) {
                    var33[var34] = -98;
                } else if (var35 == 376) {
                    var33[var34] = -97;
                } else {
                    var33[var34] = 63;
                }
            }
            var30.method2731(var33.length);
            var30.field2111 += Statics.field3134.method2592(var33, 0, var33.length, var30.field2114, var30.field2111);
            client.field495.method2847(client.field495.field2111 - var29);
            return 1;
        } else if (arg0 == 5015) {
            String var38;
            if (Statics.field899 == null || Statics.field899.field279 == null) {
                var38 = "";
            } else {
                var38 = Statics.field899.field279;
            }
            field751[++Statics.field750 - 1] = var38;
            return 1;
        } else if (arg0 == 5016) {
            field744[++Statics.field714 - 1] = client.field523;
            return 1;
        } else if (arg0 == 5017) {
            int var39 = field744[--Statics.field714];
            field744[++Statics.field714 - 1] = class48.method195(var39);
            return 1;
        } else if (arg0 == 5018) {
            int var40 = field744[--Statics.field714];
            field744[++Statics.field714 - 1] = class48.method736(var40);
            return 1;
        } else if (arg0 == 5019) {
            int var41 = field744[--Statics.field714];
            int[] var42 = field744;
            int var43 = ++Statics.field714 - 1;
            class22 var44 = (class22) class48.field950.method2217((long) var41);
            int var45;
            if (var44 == null) {
                var45 = -1;
            } else if (class48.field953.field1924 == var44.field1909) {
                var45 = -1;
            } else {
                var45 = ((class22) var44.field1909).field242;
            }
            var42[var43] = var45;
            return 1;
        } else if (arg0 == 5020) {
            String var46 = field751[--Statics.field750];
            client.method751(var46);
            return 1;
        } else if (arg0 == 5021) {
            client.field473 = field751[--Statics.field750].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field751[++Statics.field750 - 1] = client.field473;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("z.z(ILaz;ZB)I")
    public static int method174(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field714 -= 2;
            int var3 = field744[Statics.field714];
            int var4 = field744[Statics.field714 + 1];
            if (!client.field447) {
                client.field399 = var3;
                client.field387 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field744[++Statics.field714 - 1] = client.field399;
            return 1;
        } else if (arg0 == 5506) {
            field744[++Statics.field714 - 1] = client.field387;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field744[--Statics.field714];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field573 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field744[++Statics.field714 - 1] = client.field573;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("q.x(ILaz;ZI)I")
    public static int method153(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field356 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bu.g(ILaz;ZI)I")
    public static int method1096(int arg0, class49 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field744[++Statics.field714 - 1] = class30.method717() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class30 var3 = class30.method18();
            if (var3 == null) {
                field744[++Statics.field714 - 1] = -1;
                field744[++Statics.field714 - 1] = 0;
                field751[++Statics.field750 - 1] = "";
                field744[++Statics.field714 - 1] = 0;
                field744[++Statics.field714 - 1] = 0;
                field751[++Statics.field750 - 1] = "";
            } else {
                field744[++Statics.field714 - 1] = var3.field701;
                field744[++Statics.field714 - 1] = var3.field692;
                field751[++Statics.field750 - 1] = var3.field705;
                field744[++Statics.field714 - 1] = var3.field706;
                field744[++Statics.field714 - 1] = var3.field702;
                field751[++Statics.field750 - 1] = var3.field704;
            }
            return 1;
        } else if (arg0 == 6502) {
            class30 var4 = class30.method1395();
            if (var4 == null) {
                field744[++Statics.field714 - 1] = -1;
                field744[++Statics.field714 - 1] = 0;
                field751[++Statics.field750 - 1] = "";
                field744[++Statics.field714 - 1] = 0;
                field744[++Statics.field714 - 1] = 0;
                field751[++Statics.field750 - 1] = "";
            } else {
                field744[++Statics.field714 - 1] = var4.field701;
                field744[++Statics.field714 - 1] = var4.field692;
                field751[++Statics.field750 - 1] = var4.field705;
                field744[++Statics.field714 - 1] = var4.field706;
                field744[++Statics.field714 - 1] = var4.field702;
                field751[++Statics.field750 - 1] = var4.field704;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field744[--Statics.field714];
            class30 var6 = null;
            for (int var7 = 0; var7 < class30.field709; var7++) {
                if (Statics.field703[var7].field701 == var5) {
                    var6 = Statics.field703[var7];
                    break;
                }
            }
            if (var6 == null) {
                field744[++Statics.field714 - 1] = -1;
                field744[++Statics.field714 - 1] = 0;
                field751[++Statics.field750 - 1] = "";
                field744[++Statics.field714 - 1] = 0;
                field744[++Statics.field714 - 1] = 0;
                field751[++Statics.field750 - 1] = "";
            } else {
                field744[++Statics.field714 - 1] = var6.field701;
                field744[++Statics.field714 - 1] = var6.field692;
                field751[++Statics.field750 - 1] = var6.field705;
                field744[++Statics.field714 - 1] = var6.field706;
                field744[++Statics.field714 - 1] = var6.field702;
                field751[++Statics.field750 - 1] = var6.field704;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field714 -= 4;
            int var8 = field744[Statics.field714];
            boolean var9 = field744[Statics.field714 + 1] == 1;
            int var10 = field744[Statics.field714 + 2];
            boolean var11 = field744[Statics.field714 + 3] == 1;
            class30.method165(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field744[--Statics.field714];
            if (var12 >= 0 && var12 < class30.field709) {
                class30 var13 = Statics.field703[var12];
                field744[++Statics.field714 - 1] = var13.field701;
                field744[++Statics.field714 - 1] = var13.field692;
                field751[++Statics.field750 - 1] = var13.field705;
                field744[++Statics.field714 - 1] = var13.field706;
                field744[++Statics.field714 - 1] = var13.field702;
                field751[++Statics.field750 - 1] = var13.field704;
            } else {
                field744[++Statics.field714 - 1] = -1;
                field744[++Statics.field714 - 1] = 0;
                field751[++Statics.field750 - 1] = "";
                field744[++Statics.field714 - 1] = 0;
                field744[++Statics.field714 - 1] = 0;
                field751[++Statics.field750 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field449 = field744[--Statics.field714] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dp.b(IB)V")
    public static void method2098(int arg0) {
        if (arg0 == -1 || !class170.method179(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2240[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3.field2226 != null) {
                class19 var4 = new class19();
                var4.field208 = var3;
                var4.field200 = var3.field2226;
                method713(var4, 2000000);
            }
        }
    }
}
