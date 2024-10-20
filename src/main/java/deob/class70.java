package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("be")
public class class70 {

    @ObfuscatedName("be.u")
    public static int[] field1001 = new int[5];

    @ObfuscatedName("be.q")
    public static int[][] field1003 = new int[5][5000];

    @ObfuscatedName("be.k")
    public static int[] field1000 = new int[1000];

    @ObfuscatedName("be.x")
    public static String[] field1002 = new String[1000];

    @ObfuscatedName("be.p")
    public static int field1009 = 0;

    @ObfuscatedName("be.b")
    public static class52[] field1007 = new class52[50];

    @ObfuscatedName("be.g")
    public static Calendar field1008 = Calendar.getInstance();

    @ObfuscatedName("be.m")
    public static final String[] field999 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("be.t")
    public static int field1010 = 0;

    public class70() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.z(Lbo;I)V")
    public static void method1589(class57 arg0) {
        method5242(arg0, 500000);
    }

    @ObfuscatedName("ki.w(Lbo;II)V")
    public static void method5242(class57 arg0, int arg1) {
        Object[] var2 = arg0.field513;
        int var3 = arg0.field516;
        boolean var4 = var3 == 10 || var3 == 11 || var3 == 12 || var3 == 13 || var3 == 14 || var3 == 15 || var3 == 16 || var3 == 17;
        class85 var15;
        if (var4) {
            Statics.field3751 = (class37) var2[0];
            class256 var5 = Statics.field3247[Statics.field3751.field308];
            int var6 = arg0.field516;
            int var7 = var5.field3239;
            int var8 = var5.field3241;
            int var9 = class237.method171(var7, var6);
            class85 var10 = class85.method2874(var9, var6);
            class85 var11;
            if (var10 == null) {
                int var12 = (var8 + 40000 << 8) + var6;
                class85 var14 = class85.method2874(var12, var6);
                if (var14 == null) {
                    var11 = null;
                } else {
                    var11 = var14;
                }
            } else {
                var11 = var10;
            }
            var15 = var11;
        } else {
            int var16 = (Integer) var2[0];
            var15 = class85.method2869(var16);
        }
        if (var15 == null) {
            return;
        }
        Statics.field1004 = 0;
        Statics.field498 = 0;
        int var17 = -1;
        int[] var18 = var15.field1190;
        int[] var19 = var15.field1197;
        byte var20 = -1;
        field1009 = 0;
        try {
            Statics.field1006 = new int[var15.field1193];
            int var21 = 0;
            Statics.field1801 = new String[var15.field1194];
            int var22 = 0;
            for (int var23 = 1; var23 < var2.length; var23++) {
                if (var2[var23] instanceof Integer) {
                    int var24 = (Integer) var2[var23];
                    if (var24 == -2147483647) {
                        var24 = arg0.field512;
                    }
                    if (var24 == -2147483646) {
                        var24 = arg0.field509;
                    }
                    if (var24 == -2147483645) {
                        var24 = arg0.field507 == null ? -1 : arg0.field507.field2692;
                    }
                    if (var24 == -2147483644) {
                        var24 = arg0.field518;
                    }
                    if (var24 == -2147483643) {
                        var24 = arg0.field507 == null ? -1 : arg0.field507.field2607;
                    }
                    if (var24 == -2147483642) {
                        var24 = arg0.field508 == null ? -1 : arg0.field508.field2692;
                    }
                    if (var24 == -2147483641) {
                        var24 = arg0.field508 == null ? -1 : arg0.field508.field2607;
                    }
                    if (var24 == -2147483640) {
                        var24 = arg0.field510;
                    }
                    if (var24 == -2147483639) {
                        var24 = arg0.field514;
                    }
                    Statics.field1006[var21++] = var24;
                } else if (var2[var23] instanceof String) {
                    String var25 = (String) var2[var23];
                    if (var25.equals("event_opbase")) {
                        var25 = arg0.field505;
                    }
                    Statics.field1801[var22++] = var25;
                }
            }
            int var26 = 0;
            field1010 = arg0.field515;
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
                                                                                                                label244: while (true) {
                                                                                                                    var26++;
                                                                                                                    if (var26 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var17++;
                                                                                                                    int var59 = var18[var17];
                                                                                                                    if (var59 >= 100) {
                                                                                                                        boolean var53;
                                                                                                                        if (var15.field1197[var17] == 1) {
                                                                                                                            var53 = true;
                                                                                                                        } else {
                                                                                                                            var53 = false;
                                                                                                                        }
                                                                                                                        int var54 = method3558(var59, var15, var53);
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
                                                                                                                        field1000[++Statics.field1004 - 1] = var19[var17];
                                                                                                                    } else if (var59 == 1) {
                                                                                                                        int var27 = var19[var17];
                                                                                                                        field1000[++Statics.field1004 - 1] = class226.field2559[var27];
                                                                                                                    } else if (var59 == 2) {
                                                                                                                        int var28 = var19[var17];
                                                                                                                        class226.field2559[var28] = field1000[--Statics.field1004];
                                                                                                                        client.method670(var28);
                                                                                                                    } else if (var59 == 3) {
                                                                                                                        field1002[++Statics.field498 - 1] = var15.field1192[var17];
                                                                                                                    } else if (var59 == 6) {
                                                                                                                        var17 += var19[var17];
                                                                                                                    } else if (var59 == 7) {
                                                                                                                        Statics.field1004 -= 2;
                                                                                                                        if (field1000[Statics.field1004] != field1000[Statics.field1004 + 1]) {
                                                                                                                            var17 += var19[var17];
                                                                                                                        }
                                                                                                                    } else if (var59 == 8) {
                                                                                                                        Statics.field1004 -= 2;
                                                                                                                        if (field1000[Statics.field1004] == field1000[Statics.field1004 + 1]) {
                                                                                                                            var17 += var19[var17];
                                                                                                                        }
                                                                                                                    } else if (var59 == 9) {
                                                                                                                        Statics.field1004 -= 2;
                                                                                                                        if (field1000[Statics.field1004] < field1000[Statics.field1004 + 1]) {
                                                                                                                            var17 += var19[var17];
                                                                                                                        }
                                                                                                                    } else if (var59 == 10) {
                                                                                                                        Statics.field1004 -= 2;
                                                                                                                        if (field1000[Statics.field1004] > field1000[Statics.field1004 + 1]) {
                                                                                                                            var17 += var19[var17];
                                                                                                                        }
                                                                                                                    } else if (var59 == 21) {
                                                                                                                        if (field1009 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class52 var29 = field1007[--field1009];
                                                                                                                        var15 = var29.field467;
                                                                                                                        var18 = var15.field1190;
                                                                                                                        var19 = var15.field1197;
                                                                                                                        var17 = var29.field464;
                                                                                                                        Statics.field1006 = var29.field463;
                                                                                                                        Statics.field1801 = var29.field466;
                                                                                                                    } else if (var59 == 25) {
                                                                                                                        int var30 = var19[var17];
                                                                                                                        field1000[++Statics.field1004 - 1] = class226.method3095(var30);
                                                                                                                    } else if (var59 == 27) {
                                                                                                                        int var31 = var19[var17];
                                                                                                                        class226.method1578(var31, field1000[--Statics.field1004]);
                                                                                                                    } else if (var59 == 31) {
                                                                                                                        Statics.field1004 -= 2;
                                                                                                                        if (field1000[Statics.field1004] <= field1000[Statics.field1004 + 1]) {
                                                                                                                            var17 += var19[var17];
                                                                                                                        }
                                                                                                                    } else if (var59 == 32) {
                                                                                                                        Statics.field1004 -= 2;
                                                                                                                        if (field1000[Statics.field1004] >= field1000[Statics.field1004 + 1]) {
                                                                                                                            var17 += var19[var17];
                                                                                                                        }
                                                                                                                    } else if (var59 == 33) {
                                                                                                                        field1000[++Statics.field1004 - 1] = Statics.field1006[var19[var17]];
                                                                                                                    } else if (var59 == 34) {
                                                                                                                        Statics.field1006[var19[var17]] = field1000[--Statics.field1004];
                                                                                                                    } else if (var59 == 35) {
                                                                                                                        field1002[++Statics.field498 - 1] = Statics.field1801[var19[var17]];
                                                                                                                    } else if (var59 == 36) {
                                                                                                                        Statics.field1801[var19[var17]] = field1002[--Statics.field498];
                                                                                                                    } else if (var59 == 37) {
                                                                                                                        int var32 = var19[var17];
                                                                                                                        Statics.field498 -= var32;
                                                                                                                        String var33 = class306.method4406(field1002, Statics.field498, var32);
                                                                                                                        field1002[++Statics.field498 - 1] = var33;
                                                                                                                    } else if (var59 == 38) {
                                                                                                                        Statics.field1004--;
                                                                                                                    } else if (var59 == 39) {
                                                                                                                        Statics.field498--;
                                                                                                                    } else if (var59 == 40) {
                                                                                                                        int var34 = var19[var17];
                                                                                                                        class85 var35 = class85.method2869(var34);
                                                                                                                        int[] var36 = new int[var35.field1193];
                                                                                                                        String[] var37 = new String[var35.field1194];
                                                                                                                        for (int var38 = 0; var38 < var35.field1189; var38++) {
                                                                                                                            var36[var38] = field1000[Statics.field1004 - var35.field1189 + var38];
                                                                                                                        }
                                                                                                                        for (int var39 = 0; var39 < var35.field1196; var39++) {
                                                                                                                            var37[var39] = field1002[Statics.field498 - var35.field1196 + var39];
                                                                                                                        }
                                                                                                                        Statics.field1004 -= var35.field1189;
                                                                                                                        Statics.field498 -= var35.field1196;
                                                                                                                        class52 var40 = new class52();
                                                                                                                        var40.field467 = var15;
                                                                                                                        var40.field464 = var17;
                                                                                                                        var40.field463 = Statics.field1006;
                                                                                                                        var40.field466 = Statics.field1801;
                                                                                                                        field1007[++field1009 - 1] = var40;
                                                                                                                        var15 = var35;
                                                                                                                        var18 = var35.field1190;
                                                                                                                        var19 = var35.field1197;
                                                                                                                        var17 = -1;
                                                                                                                        Statics.field1006 = var36;
                                                                                                                        Statics.field1801 = var37;
                                                                                                                    } else if (var59 == 42) {
                                                                                                                        field1000[++Statics.field1004 - 1] = Statics.field186.method1768(var19[var17]);
                                                                                                                    } else if (var59 == 43) {
                                                                                                                        Statics.field186.method1774(var19[var17], field1000[--Statics.field1004]);
                                                                                                                    } else if (var59 == 44) {
                                                                                                                        int var41 = var19[var17] >> 16;
                                                                                                                        int var42 = var19[var17] & 0xFFFF;
                                                                                                                        int var43 = field1000[--Statics.field1004];
                                                                                                                        if (var43 >= 0 && var43 <= 5000) {
                                                                                                                            field1001[var41] = var43;
                                                                                                                            byte var44 = -1;
                                                                                                                            if (var42 == 105) {
                                                                                                                                var44 = 0;
                                                                                                                            }
                                                                                                                            int var45 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var45 >= var43) {
                                                                                                                                    continue label244;
                                                                                                                                }
                                                                                                                                field1003[var41][var45] = var44;
                                                                                                                                var45++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var59 == 45) {
                                                                                                                        int var46 = var19[var17];
                                                                                                                        int var47 = field1000[--Statics.field1004];
                                                                                                                        if (var47 < 0 || var47 >= field1001[var46]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1000[++Statics.field1004 - 1] = field1003[var46][var47];
                                                                                                                    } else if (var59 == 46) {
                                                                                                                        int var48 = var19[var17];
                                                                                                                        Statics.field1004 -= 2;
                                                                                                                        int var49 = field1000[Statics.field1004];
                                                                                                                        if (var49 < 0 || var49 >= field1001[var48]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1003[var48][var49] = field1000[Statics.field1004 + 1];
                                                                                                                    } else if (var59 == 47) {
                                                                                                                        String var50 = Statics.field186.method1761(var19[var17]);
                                                                                                                        if (var50 == null) {
                                                                                                                            var50 = class238.field2798;
                                                                                                                        }
                                                                                                                        field1002[++Statics.field498 - 1] = var50;
                                                                                                                    } else if (var59 == 48) {
                                                                                                                        Statics.field186.method1760(var19[var17], field1002[--Statics.field498]);
                                                                                                                    } else if (var59 == 60) {
                                                                                                                        class198 var51 = var15.field1195[var19[var17]];
                                                                                                                        class212 var52 = (class212) var51.method3637((long) field1000[--Statics.field1004]);
                                                                                                                        if (var52 != null) {
                                                                                                                            var17 += var52.field2439;
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
            var56.append("").append(var15.field2422).append(" ");
            for (int var57 = field1009 - 1; var57 >= 0; var57--) {
                var56.append("").append(field1007[var57].field467.field2422).append(" ");
            }
            var56.append("").append(var20);
            class153.method66(var56.toString(), var58);
        }
    }

    @ObfuscatedName("gc.s(ILce;ZB)I")
    public static int method3558(int arg0, class85 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method481(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method830(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2082(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method1657(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method255(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method4129(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method1498(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            class231 var3 = arg2 ? Statics.field3562 : Statics.field3302;
            byte var4;
            if (arg0 == 1600) {
                field1000[++Statics.field1004 - 1] = var3.field2627;
                var4 = 1;
            } else if (arg0 == 1601) {
                field1000[++Statics.field1004 - 1] = var3.field2664;
                var4 = 1;
            } else if (arg0 == 1602) {
                field1002[++Statics.field498 - 1] = var3.field2668;
                var4 = 1;
            } else if (arg0 == 1603) {
                field1000[++Statics.field1004 - 1] = var3.field2629;
                var4 = 1;
            } else if (arg0 == 1604) {
                field1000[++Statics.field1004 - 1] = var3.field2630;
                var4 = 1;
            } else if (arg0 == 1605) {
                field1000[++Statics.field1004 - 1] = var3.field2705;
                var4 = 1;
            } else if (arg0 == 1606) {
                field1000[++Statics.field1004 - 1] = var3.field2657;
                var4 = 1;
            } else if (arg0 == 1607) {
                field1000[++Statics.field1004 - 1] = var3.field2659;
                var4 = 1;
            } else if (arg0 == 1608) {
                field1000[++Statics.field1004 - 1] = var3.field2658;
                var4 = 1;
            } else if (arg0 == 1609) {
                field1000[++Statics.field1004 - 1] = var3.field2637;
                var4 = 1;
            } else if (arg0 == 1610) {
                field1000[++Statics.field1004 - 1] = var3.field2609;
                var4 = 1;
            } else if (arg0 == 1611) {
                field1000[++Statics.field1004 - 1] = var3.field2631;
                var4 = 1;
            } else if (arg0 == 1612) {
                field1000[++Statics.field1004 - 1] = var3.field2632;
                var4 = 1;
            } else if (arg0 == 1613) {
                field1000[++Statics.field1004 - 1] = var3.field2702.method142();
                var4 = 1;
            } else if (arg0 == 1614) {
                field1000[++Statics.field1004 - 1] = var3.field2727 ? 1 : 0;
                var4 = 1;
            } else {
                var4 = 2;
            }
            return var4;
        } else if (arg0 < 1800) {
            class231 var8 = arg2 ? Statics.field3562 : Statics.field3302;
            byte var9;
            if (arg0 == 1700) {
                field1000[++Statics.field1004 - 1] = var8.field2650;
                var9 = 1;
            } else if (arg0 == 1701) {
                if (var8.field2650 == -1) {
                    field1000[++Statics.field1004 - 1] = 0;
                } else {
                    field1000[++Statics.field1004 - 1] = var8.field2728;
                }
                var9 = 1;
            } else if (arg0 == 1702) {
                field1000[++Statics.field1004 - 1] = var8.field2607;
                var9 = 1;
            } else {
                var9 = 2;
            }
            return var9;
        } else if (arg0 < 1900) {
            return method835(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method5227(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method830(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2082(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method1657(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method255(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method4129(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            class231 var10 = class231.method415(field1000[--Statics.field1004]);
            byte var11;
            if (arg0 == 2500) {
                field1000[++Statics.field1004 - 1] = var10.field2619;
                var11 = 1;
            } else if (arg0 == 2501) {
                field1000[++Statics.field1004 - 1] = var10.field2620;
                var11 = 1;
            } else if (arg0 == 2502) {
                field1000[++Statics.field1004 - 1] = var10.field2676;
                var11 = 1;
            } else if (arg0 == 2503) {
                field1000[++Statics.field1004 - 1] = var10.field2622;
                var11 = 1;
            } else if (arg0 == 2504) {
                field1000[++Statics.field1004 - 1] = var10.field2626 ? 1 : 0;
                var11 = 1;
            } else if (arg0 == 2505) {
                field1000[++Statics.field1004 - 1] = var10.field2606;
                var11 = 1;
            } else {
                var11 = 2;
            }
            return var11;
        } else if (arg0 < 2700) {
            return method112(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method3069(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method1047(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method5227(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            byte var13;
            if (arg0 == 3100) {
                String var12 = field1002[--Statics.field498];
                class84.method2942(0, "", var12);
                var13 = 1;
            } else if (arg0 == 3101) {
                Statics.field1004 -= 2;
                Statics.method2872(Statics.field1877, field1000[Statics.field1004], field1000[Statics.field1004 + 1]);
                var13 = 1;
            } else if (arg0 == 3103) {
                class173 var14 = Statics.method414(class170.field2196, client.field627.field1219);
                client.field627.method1847(var14);
                for (class56 var15 = (class56) client.field742.method3710(); var15 != null; var15 = (class56) client.field742.method3711()) {
                    if (var15.field495 == 0 || var15.field495 == 3) {
                        client.method242(var15, true);
                    }
                }
                if (client.field745 != null) {
                    client.method1035(client.field745);
                    client.field745 = null;
                }
                var13 = 1;
            } else if (arg0 == 3104) {
                String var16 = field1002[--Statics.field498];
                int var17 = 0;
                if (class306.method2093(var16)) {
                    int var18 = class306.method1586(var16, 10, true);
                    var17 = var18;
                }
                class173 var19 = Statics.method414(class170.field2151, client.field627.field1219);
                var19.field2258.method3410(var17);
                client.field627.method1847(var19);
                var13 = 1;
            } else if (arg0 == 3105) {
                String var20 = field1002[--Statics.field498];
                class173 var21 = Statics.method414(class170.field2210, client.field627.field1219);
                var21.field2258.method3235(var20.length() + 1);
                var21.field2258.method3402(var20);
                client.field627.method1847(var21);
                var13 = 1;
            } else if (arg0 == 3106) {
                String var22 = field1002[--Statics.field498];
                class173 var23 = Statics.method414(class170.field2137, client.field627.field1219);
                var23.field2258.method3235(var22.length() + 1);
                var23.field2258.method3402(var22);
                client.field627.method1847(var23);
                var13 = 1;
            } else if (arg0 == 3107) {
                int var24 = field1000[--Statics.field1004];
                String var25 = field1002[--Statics.field498];
                int var26 = class82.field1168;
                int[] var27 = class82.field1160;
                boolean var28 = false;
                class292 var29 = new class292(var25, Statics.field307);
                for (int var30 = 0; var30 < var26; var30++) {
                    class61 var31 = client.field611[var27[var30]];
                    if (var31 != null && Statics.field1877 != var31 && var31.field553 != null && var31.field553.equals(var29)) {
                        if (var24 == 1) {
                            class173 var32 = Statics.method414(class170.field2207, client.field627.field1219);
                            var32.field2258.method3235(0);
                            var32.field2258.method3458(var27[var30]);
                            client.field627.method1847(var32);
                        } else if (var24 == 4) {
                            class173 var33 = Statics.method414(class170.field2221, client.field627.field1219);
                            var33.field2258.method3474(var27[var30]);
                            var33.field2258.method3235(0);
                            client.field627.method1847(var33);
                        } else if (var24 == 6) {
                            class173 var34 = Statics.method414(class170.field2164, client.field627.field1219);
                            var34.field2258.method3278(0);
                            var34.field2258.method3474(var27[var30]);
                            client.field627.method1847(var34);
                        } else if (var24 == 7) {
                            class173 var35 = Statics.method414(class170.field2223, client.field627.field1219);
                            var35.field2258.method3285(var27[var30]);
                            var35.field2258.method3277(0);
                            client.field627.method1847(var35);
                        }
                        var28 = true;
                        break;
                    }
                }
                if (!var28) {
                    class84.method2942(4, "", class238.field2941 + var25);
                }
                var13 = 1;
            } else if (arg0 == 3108) {
                Statics.field1004 -= 3;
                int var36 = field1000[Statics.field1004];
                int var37 = field1000[Statics.field1004 + 1];
                int var38 = field1000[Statics.field1004 + 2];
                class231 var39 = class231.method415(var38);
                client.method3150(var39, var36, var37);
                var13 = 1;
            } else if (arg0 == 3109) {
                Statics.field1004 -= 2;
                int var40 = field1000[Statics.field1004];
                int var41 = field1000[Statics.field1004 + 1];
                class231 var42 = arg2 ? Statics.field3562 : Statics.field3302;
                client.method3150(var42, var40, var41);
                var13 = 1;
            } else if (arg0 == 3110) {
                Statics.field3230 = field1000[--Statics.field1004] == 1;
                var13 = 1;
            } else if (arg0 == 3111) {
                field1000[++Statics.field1004 - 1] = Statics.field62.field961 ? 1 : 0;
                var13 = 1;
            } else if (arg0 == 3112) {
                Statics.field62.field961 = field1000[--Statics.field1004] == 1;
                class67.method939();
                var13 = 1;
            } else if (arg0 == 3113) {
                String var43 = field1002[--Statics.field498];
                boolean var44 = field1000[--Statics.field1004] == 1;
                class46.method4762(var43, var44, false);
                var13 = 1;
            } else if (arg0 == 3115) {
                int var45 = field1000[--Statics.field1004];
                class173 var46 = Statics.method414(class170.field2226, client.field627.field1219);
                var46.field2258.method3458(var45);
                client.field627.method1847(var46);
                var13 = 1;
            } else if (arg0 == 3116) {
                int var47 = field1000[--Statics.field1004];
                Statics.field498 -= 2;
                String var48 = field1002[Statics.field498];
                String var49 = field1002[Statics.field498 + 1];
                if (var48.length() > 500) {
                    var13 = 1;
                } else if (var49.length() > 500) {
                    var13 = 1;
                } else {
                    class173 var50 = Statics.method414(class170.field2168, client.field627.field1219);
                    var50.field2258.method3458(1 + class183.method5380(var48) + class183.method5380(var49));
                    var50.field2258.method3278(var47);
                    var50.field2258.method3402(var49);
                    var50.field2258.method3402(var48);
                    client.field627.method1847(var50);
                    var13 = 1;
                }
            } else if (arg0 == 3117) {
                client.field727 = field1000[--Statics.field1004] == 1;
                var13 = 1;
            } else if (arg0 == 3118) {
                client.field729 = field1000[--Statics.field1004] == 1;
                var13 = 1;
            } else if (arg0 == 3119) {
                client.field700 = field1000[--Statics.field1004] == 1;
                var13 = 1;
            } else if (arg0 == 3120) {
                if (field1000[--Statics.field1004] == 1) {
                    client.field659 |= 0x1;
                } else {
                    client.field659 &= 0xFFFFFFFE;
                }
                var13 = 1;
            } else if (arg0 == 3121) {
                if (field1000[--Statics.field1004] == 1) {
                    client.field659 |= 0x2;
                } else {
                    client.field659 &= 0xFFFFFFFD;
                }
                var13 = 1;
            } else if (arg0 == 3122) {
                if (field1000[--Statics.field1004] == 1) {
                    client.field659 |= 0x4;
                } else {
                    client.field659 &= 0xFFFFFFFB;
                }
                var13 = 1;
            } else if (arg0 == 3123) {
                if (field1000[--Statics.field1004] == 1) {
                    client.field659 |= 0x8;
                } else {
                    client.field659 &= 0xFFFFFFF7;
                }
                var13 = 1;
            } else if (arg0 == 3124) {
                client.field659 = 0;
                var13 = 1;
            } else if (arg0 == 3125) {
                client.field622 = field1000[--Statics.field1004] == 1;
                var13 = 1;
            } else if (arg0 == 3126) {
                client.field678 = field1000[--Statics.field1004] == 1;
                var13 = 1;
            } else if (arg0 == 3127) {
                boolean var51 = field1000[--Statics.field1004] == 1;
                client.field728 = var51;
                var13 = 1;
            } else if (arg0 == 3128) {
                int[] var52 = field1000;
                int var53 = ++Statics.field1004 - 1;
                boolean var54 = client.field728;
                var52[var53] = var54 ? 1 : 0;
                var13 = 1;
            } else if (arg0 == 3129) {
                Statics.field1004 -= 2;
                client.field751 = field1000[Statics.field1004];
                client.field662 = field1000[Statics.field1004 + 1];
                var13 = 1;
            } else if (arg0 == 3130) {
                Statics.field1004 -= 2;
                var13 = 1;
            } else if (arg0 == 3131) {
                Statics.field1004--;
                var13 = 1;
            } else if (arg0 == 3132) {
                field1000[++Statics.field1004 - 1] = Statics.field1180;
                field1000[++Statics.field1004 - 1] = Statics.field3139;
                var13 = 1;
            } else if (arg0 == 3133) {
                Statics.field1004--;
                var13 = 1;
            } else {
                var13 = 2;
            }
            return var13;
        } else if (arg0 < 3300) {
            byte var58;
            if (arg0 == 3200) {
                Statics.field1004 -= 3;
                int var55 = field1000[Statics.field1004];
                int var56 = field1000[Statics.field1004 + 1];
                int var57 = field1000[Statics.field1004 + 2];
                if (client.field815 != 0 && var56 != 0 && client.field657 < 50) {
                    client.field818[client.field657] = var55;
                    client.field677[client.field657] = var56;
                    client.field820[client.field657] = var57;
                    client.field720[client.field657] = null;
                    client.field821[client.field657] = 0;
                    client.field657++;
                }
                var58 = 1;
            } else if (arg0 == 3201) {
                int var59 = field1000[--Statics.field1004];
                if (var59 == -1 && !client.field814) {
                    class218.method89();
                } else if (var59 != -1 && client.field813 != var59 && client.field812 != 0 && !client.field814) {
                    class218.method1495(2, Statics.field1148, var59, 0, client.field812, false);
                }
                client.field813 = var59;
                var58 = 1;
            } else if (arg0 == 3202) {
                Statics.field1004 -= 2;
                int var60 = field1000[Statics.field1004];
                int var61 = field1000[Statics.field1004 + 1];
                if (client.field812 != 0 && var60 != -1) {
                    class218.method1447(Statics.field577, var60, 0, client.field812, false);
                    client.field814 = true;
                }
                var58 = 1;
            } else {
                var58 = 2;
            }
            return var58;
        } else if (arg0 < 3400) {
            return method3172(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            byte var66;
            if (arg0 == 3400) {
                Statics.field1004 -= 2;
                int var62 = field1000[Statics.field1004];
                int var63 = field1000[Statics.field1004 + 1];
                class267 var64 = class267.method3306(var62);
                if (var64.field3338 != 's') {
                }
                for (int var65 = 0; var65 < var64.field3346; var65++) {
                    if (var64.field3344[var65] == var63) {
                        field1002[++Statics.field498 - 1] = var64.field3340[var65];
                        var64 = null;
                        break;
                    }
                }
                if (var64 != null) {
                    field1002[++Statics.field498 - 1] = var64.field3341;
                }
                var66 = 1;
            } else if (arg0 == 3408) {
                Statics.field1004 -= 4;
                int var67 = field1000[Statics.field1004];
                int var68 = field1000[Statics.field1004 + 1];
                int var69 = field1000[Statics.field1004 + 2];
                int var70 = field1000[Statics.field1004 + 3];
                class267 var71 = class267.method3306(var69);
                if (var71.field3337 == var67 && var71.field3338 == var68) {
                    for (int var72 = 0; var72 < var71.field3346; var72++) {
                        if (var71.field3344[var72] == var70) {
                            if (var68 == 115) {
                                field1002[++Statics.field498 - 1] = var71.field3340[var72];
                            } else {
                                field1000[++Statics.field1004 - 1] = var71.field3345[var72];
                            }
                            var71 = null;
                            break;
                        }
                    }
                    if (var71 != null) {
                        if (var68 == 115) {
                            field1002[++Statics.field498 - 1] = var71.field3341;
                        } else {
                            field1000[++Statics.field1004 - 1] = var71.field3342;
                        }
                    }
                    var66 = 1;
                } else {
                    if (var68 == 115) {
                        field1002[++Statics.field498 - 1] = class238.field2798;
                    } else {
                        field1000[++Statics.field1004 - 1] = 0;
                    }
                    var66 = 1;
                }
            } else if (arg0 == 3411) {
                int var73 = field1000[--Statics.field1004];
                class267 var74 = class267.method3306(var73);
                field1000[++Statics.field1004 - 1] = var74.method4589();
                var66 = 1;
            } else {
                var66 = 2;
            }
            return var66;
        } else if (arg0 < 3700) {
            byte var75;
            if (arg0 == 3600) {
                if (Statics.field2333.field977 == 0) {
                    field1000[++Statics.field1004 - 1] = -2;
                } else if (Statics.field2333.field977 == 1) {
                    field1000[++Statics.field1004 - 1] = -1;
                } else {
                    field1000[++Statics.field1004 - 1] = Statics.field2333.field971.method4933();
                }
                var75 = 1;
            } else if (arg0 == 3601) {
                int var76 = field1000[--Statics.field1004];
                if (Statics.field2333.method1517() && var76 >= 0 && var76 < Statics.field2333.field971.method4933()) {
                    class293 var77 = (class293) Statics.field2333.field971.method4942(var76);
                    field1002[++Statics.field498 - 1] = var77.method4894();
                    field1002[++Statics.field498 - 1] = var77.method4895();
                } else {
                    field1002[++Statics.field498 - 1] = "";
                    field1002[++Statics.field498 - 1] = "";
                }
                var75 = 1;
            } else if (arg0 == 3602) {
                int var78 = field1000[--Statics.field1004];
                if (Statics.field2333.method1517() && var78 >= 0 && var78 < Statics.field2333.field971.method4933()) {
                    field1000[++Statics.field1004 - 1] = ((class288) Statics.field2333.field971.method4942(var78)).field3629;
                } else {
                    field1000[++Statics.field1004 - 1] = 0;
                }
                var75 = 1;
            } else if (arg0 == 3603) {
                int var79 = field1000[--Statics.field1004];
                if (Statics.field2333.method1517() && var79 >= 0 && var79 < Statics.field2333.field971.method4933()) {
                    field1000[++Statics.field1004 - 1] = ((class288) Statics.field2333.field971.method4942(var79)).field3630;
                } else {
                    field1000[++Statics.field1004 - 1] = 0;
                }
                var75 = 1;
            } else if (arg0 == 3604) {
                String var80 = field1002[--Statics.field498];
                int var81 = field1000[--Statics.field1004];
                class173 var82 = Statics.method414(class170.field2169, client.field627.field1219);
                var82.field2258.method3235(class183.method5380(var80) + 1);
                var82.field2258.method3277(var81);
                var82.field2258.method3402(var80);
                client.field627.method1847(var82);
                var75 = 1;
            } else if (arg0 == 3605) {
                String var83 = field1002[--Statics.field498];
                Statics.field2333.method1524(var83);
                var75 = 1;
            } else if (arg0 == 3606) {
                String var84 = field1002[--Statics.field498];
                Statics.field2333.method1558(var84);
                var75 = 1;
            } else if (arg0 == 3607) {
                String var85 = field1002[--Statics.field498];
                Statics.field2333.method1526(var85);
                var75 = 1;
            } else if (arg0 == 3608) {
                String var86 = field1002[--Statics.field498];
                Statics.field2333.method1529(var86);
                var75 = 1;
            } else if (arg0 == 3609) {
                String var87 = field1002[--Statics.field498];
                String var88 = client.method2908(var87);
                field1000[++Statics.field1004 - 1] = Statics.field2333.method1553(new class292(var88, Statics.field307), false) ? 1 : 0;
                var75 = 1;
            } else if (arg0 == 3611) {
                if (Statics.field95 == null) {
                    field1002[++Statics.field498 - 1] = "";
                } else {
                    field1002[++Statics.field498 - 1] = Statics.field95.field3655;
                }
                var75 = 1;
            } else if (arg0 == 3612) {
                if (Statics.field95 == null) {
                    field1000[++Statics.field1004 - 1] = 0;
                } else {
                    field1000[++Statics.field1004 - 1] = Statics.field95.method4933();
                }
                var75 = 1;
            } else if (arg0 == 3613) {
                int var89 = field1000[--Statics.field1004];
                if (Statics.field95 == null || var89 >= Statics.field95.method4933()) {
                    field1002[++Statics.field498 - 1] = "";
                } else {
                    field1002[++Statics.field498 - 1] = Statics.field95.method4942(var89).method4893().method5033();
                }
                var75 = 1;
            } else if (arg0 == 3614) {
                int var90 = field1000[--Statics.field1004];
                if (Statics.field95 == null || var90 >= Statics.field95.method4933()) {
                    field1000[++Statics.field1004 - 1] = 0;
                } else {
                    field1000[++Statics.field1004 - 1] = ((class288) Statics.field95.method4942(var90)).method5009();
                }
                var75 = 1;
            } else if (arg0 == 3615) {
                int var91 = field1000[--Statics.field1004];
                if (Statics.field95 == null || var91 >= Statics.field95.method4933()) {
                    field1000[++Statics.field1004 - 1] = 0;
                } else {
                    field1000[++Statics.field1004 - 1] = ((class288) Statics.field95.method4942(var91)).field3630;
                }
                var75 = 1;
            } else if (arg0 == 3616) {
                field1000[++Statics.field1004 - 1] = Statics.field95 == null ? 0 : Statics.field95.field3652;
                var75 = 1;
            } else if (arg0 == 3617) {
                String var92 = field1002[--Statics.field498];
                client.method3211(var92);
                var75 = 1;
            } else if (arg0 == 3618) {
                field1000[++Statics.field1004 - 1] = Statics.field95 == null ? 0 : Statics.field95.field3658;
                var75 = 1;
            } else if (arg0 == 3619) {
                String var93 = field1002[--Statics.field498];
                Statics.method111(var93);
                var75 = 1;
            } else if (arg0 == 3620) {
                class173 var94 = Statics.method414(class170.field2154, client.field627.field1219);
                var94.field2258.method3235(0);
                client.field627.method1847(var94);
                var75 = 1;
            } else if (arg0 == 3621) {
                if (Statics.field2333.method1517()) {
                    field1000[++Statics.field1004 - 1] = Statics.field2333.field976.method4933();
                } else {
                    field1000[++Statics.field1004 - 1] = -1;
                }
                var75 = 1;
            } else if (arg0 == 3622) {
                int var95 = field1000[--Statics.field1004];
                if (Statics.field2333.method1517() && var95 >= 0 && var95 < Statics.field2333.field976.method4933()) {
                    class287 var96 = (class287) Statics.field2333.field976.method4942(var95);
                    field1002[++Statics.field498 - 1] = var96.method4894();
                    field1002[++Statics.field498 - 1] = var96.method4895();
                } else {
                    field1002[++Statics.field498 - 1] = "";
                    field1002[++Statics.field498 - 1] = "";
                }
                var75 = 1;
            } else if (arg0 == 3623) {
                String var97 = field1002[--Statics.field498];
                String var98 = client.method2908(var97);
                field1000[++Statics.field1004 - 1] = Statics.field2333.method1523(new class292(var98, Statics.field307)) ? 1 : 0;
                var75 = 1;
            } else if (arg0 == 3624) {
                int var99 = field1000[--Statics.field1004];
                if (Statics.field95 == null || var99 >= Statics.field95.method4933() || !Statics.field95.method4942(var99).method4893().equals(Statics.field1877.field553)) {
                    field1000[++Statics.field1004 - 1] = 0;
                } else {
                    field1000[++Statics.field1004 - 1] = 1;
                }
                var75 = 1;
            } else if (arg0 == 3625) {
                if (Statics.field95 == null || Statics.field95.field3656 == null) {
                    field1002[++Statics.field498 - 1] = "";
                } else {
                    field1002[++Statics.field498 - 1] = Statics.field95.field3656;
                }
                var75 = 1;
            } else if (arg0 == 3626) {
                int var100 = field1000[--Statics.field1004];
                if (Statics.field95 == null || var100 >= Statics.field95.method4933() || !((class282) Statics.field95.method4942(var100)).method4872()) {
                    field1000[++Statics.field1004 - 1] = 0;
                } else {
                    field1000[++Statics.field1004 - 1] = 1;
                }
                var75 = 1;
            } else if (arg0 == 3627) {
                int var101 = field1000[--Statics.field1004];
                if (Statics.field95 == null || var101 >= Statics.field95.method4933() || !((class282) Statics.field95.method4942(var101)).method4873()) {
                    field1000[++Statics.field1004 - 1] = 0;
                } else {
                    field1000[++Statics.field1004 - 1] = 1;
                }
                var75 = 1;
            } else if (arg0 == 3628) {
                Statics.field2333.field971.method4951();
                var75 = 1;
            } else if (arg0 == 3629) {
                boolean var102 = field1000[--Statics.field1004] == 1;
                Statics.field2333.field971.method4952(new class309(var102));
                var75 = 1;
            } else if (arg0 == 3630) {
                boolean var103 = field1000[--Statics.field1004] == 1;
                Statics.field2333.field971.method4952(new class310(var103));
                var75 = 1;
            } else if (arg0 == 3631) {
                boolean var104 = field1000[--Statics.field1004] == 1;
                Statics.field2333.field971.method4952(new class144(var104));
                var75 = 1;
            } else if (arg0 == 3632) {
                boolean var105 = field1000[--Statics.field1004] == 1;
                Statics.field2333.field971.method4952(new class138(var105));
                var75 = 1;
            } else if (arg0 == 3633) {
                boolean var106 = field1000[--Statics.field1004] == 1;
                Statics.field2333.field971.method4952(new class143(var106));
                var75 = 1;
            } else if (arg0 == 3634) {
                boolean var107 = field1000[--Statics.field1004] == 1;
                Statics.field2333.field971.method4952(new class146(var107));
                var75 = 1;
            } else if (arg0 == 3635) {
                boolean var108 = field1000[--Statics.field1004] == 1;
                Statics.field2333.field971.method4952(new class142(var108));
                var75 = 1;
            } else if (arg0 == 3636) {
                boolean var109 = field1000[--Statics.field1004] == 1;
                Statics.field2333.field971.method4952(new class140(var109));
                var75 = 1;
            } else if (arg0 == 3637) {
                boolean var110 = field1000[--Statics.field1004] == 1;
                Statics.field2333.field971.method4952(new class139(var110));
                var75 = 1;
            } else if (arg0 == 3638) {
                boolean var111 = field1000[--Statics.field1004] == 1;
                Statics.field2333.field971.method4952(new class141(var111));
                var75 = 1;
            } else if (arg0 == 3639) {
                Statics.field2333.field971.method4943();
                var75 = 1;
            } else if (arg0 == 3640) {
                Statics.field2333.field976.method4951();
                var75 = 1;
            } else if (arg0 == 3641) {
                boolean var112 = field1000[--Statics.field1004] == 1;
                Statics.field2333.field976.method4952(new class309(var112));
                var75 = 1;
            } else if (arg0 == 3642) {
                boolean var113 = field1000[--Statics.field1004] == 1;
                Statics.field2333.field976.method4952(new class310(var113));
                var75 = 1;
            } else if (arg0 == 3643) {
                Statics.field2333.field976.method4943();
                var75 = 1;
            } else if (arg0 == 3644) {
                if (Statics.field95 != null) {
                    Statics.field95.method4951();
                }
                var75 = 1;
            } else if (arg0 == 3645) {
                boolean var114 = field1000[--Statics.field1004] == 1;
                if (Statics.field95 != null) {
                    Statics.field95.method4952(new class309(var114));
                }
                var75 = 1;
            } else if (arg0 == 3646) {
                boolean var115 = field1000[--Statics.field1004] == 1;
                if (Statics.field95 != null) {
                    Statics.field95.method4952(new class310(var115));
                }
                var75 = 1;
            } else if (arg0 == 3647) {
                boolean var116 = field1000[--Statics.field1004] == 1;
                if (Statics.field95 != null) {
                    Statics.field95.method4952(new class144(var116));
                }
                var75 = 1;
            } else if (arg0 == 3648) {
                boolean var117 = field1000[--Statics.field1004] == 1;
                if (Statics.field95 != null) {
                    Statics.field95.method4952(new class138(var117));
                }
                var75 = 1;
            } else if (arg0 == 3649) {
                boolean var118 = field1000[--Statics.field1004] == 1;
                if (Statics.field95 != null) {
                    Statics.field95.method4952(new class143(var118));
                }
                var75 = 1;
            } else if (arg0 == 3650) {
                boolean var119 = field1000[--Statics.field1004] == 1;
                if (Statics.field95 != null) {
                    Statics.field95.method4952(new class146(var119));
                }
                var75 = 1;
            } else if (arg0 == 3651) {
                boolean var120 = field1000[--Statics.field1004] == 1;
                if (Statics.field95 != null) {
                    Statics.field95.method4952(new class142(var120));
                }
                var75 = 1;
            } else if (arg0 == 3652) {
                boolean var121 = field1000[--Statics.field1004] == 1;
                if (Statics.field95 != null) {
                    Statics.field95.method4952(new class140(var121));
                }
                var75 = 1;
            } else if (arg0 == 3653) {
                boolean var122 = field1000[--Statics.field1004] == 1;
                if (Statics.field95 != null) {
                    Statics.field95.method4952(new class139(var122));
                }
                var75 = 1;
            } else if (arg0 == 3654) {
                boolean var123 = field1000[--Statics.field1004] == 1;
                if (Statics.field95 != null) {
                    Statics.field95.method4952(new class141(var123));
                }
                var75 = 1;
            } else if (arg0 == 3655) {
                if (Statics.field95 != null) {
                    Statics.field95.method4943();
                }
                var75 = 1;
            } else if (arg0 == 3656) {
                boolean var124 = field1000[--Statics.field1004] == 1;
                Statics.field2333.field971.method4952(new class145(var124));
                var75 = 1;
            } else if (arg0 == 3657) {
                boolean var125 = field1000[--Statics.field1004] == 1;
                if (Statics.field95 != null) {
                    Statics.field95.method4952(new class145(var125));
                }
                var75 = 1;
            } else {
                var75 = 2;
            }
            return var75;
        } else if (arg0 < 4000) {
            return method438(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            byte var128;
            if (arg0 == 4000) {
                Statics.field1004 -= 2;
                int var126 = field1000[Statics.field1004];
                int var127 = field1000[Statics.field1004 + 1];
                field1000[++Statics.field1004 - 1] = var126 + var127;
                var128 = 1;
            } else if (arg0 == 4001) {
                Statics.field1004 -= 2;
                int var129 = field1000[Statics.field1004];
                int var130 = field1000[Statics.field1004 + 1];
                field1000[++Statics.field1004 - 1] = var129 - var130;
                var128 = 1;
            } else if (arg0 == 4002) {
                Statics.field1004 -= 2;
                int var131 = field1000[Statics.field1004];
                int var132 = field1000[Statics.field1004 + 1];
                field1000[++Statics.field1004 - 1] = var131 * var132;
                var128 = 1;
            } else if (arg0 == 4003) {
                Statics.field1004 -= 2;
                int var133 = field1000[Statics.field1004];
                int var134 = field1000[Statics.field1004 + 1];
                field1000[++Statics.field1004 - 1] = var133 / var134;
                var128 = 1;
            } else if (arg0 == 4004) {
                int var135 = field1000[--Statics.field1004];
                field1000[++Statics.field1004 - 1] = (int) (Math.random() * (double) var135);
                var128 = 1;
            } else if (arg0 == 4005) {
                int var136 = field1000[--Statics.field1004];
                field1000[++Statics.field1004 - 1] = (int) (Math.random() * (double) (var136 + 1));
                var128 = 1;
            } else if (arg0 == 4006) {
                Statics.field1004 -= 5;
                int var137 = field1000[Statics.field1004];
                int var138 = field1000[Statics.field1004 + 1];
                int var139 = field1000[Statics.field1004 + 2];
                int var140 = field1000[Statics.field1004 + 3];
                int var141 = field1000[Statics.field1004 + 4];
                field1000[++Statics.field1004 - 1] = (var138 - var137) * (var141 - var139) / (var140 - var139) + var137;
                var128 = 1;
            } else if (arg0 == 4007) {
                Statics.field1004 -= 2;
                int var142 = field1000[Statics.field1004];
                int var143 = field1000[Statics.field1004 + 1];
                field1000[++Statics.field1004 - 1] = var142 * var143 / 100 + var142;
                var128 = 1;
            } else if (arg0 == 4008) {
                Statics.field1004 -= 2;
                int var144 = field1000[Statics.field1004];
                int var145 = field1000[Statics.field1004 + 1];
                field1000[++Statics.field1004 - 1] = var144 | 0x1 << var145;
                var128 = 1;
            } else if (arg0 == 4009) {
                Statics.field1004 -= 2;
                int var146 = field1000[Statics.field1004];
                int var147 = field1000[Statics.field1004 + 1];
                field1000[++Statics.field1004 - 1] = var146 & -1 - (0x1 << var147);
                var128 = 1;
            } else if (arg0 == 4010) {
                Statics.field1004 -= 2;
                int var148 = field1000[Statics.field1004];
                int var149 = field1000[Statics.field1004 + 1];
                field1000[++Statics.field1004 - 1] = (var148 & 0x1 << var149) == 0 ? 0 : 1;
                var128 = 1;
            } else if (arg0 == 4011) {
                Statics.field1004 -= 2;
                int var150 = field1000[Statics.field1004];
                int var151 = field1000[Statics.field1004 + 1];
                field1000[++Statics.field1004 - 1] = var150 % var151;
                var128 = 1;
            } else if (arg0 == 4012) {
                Statics.field1004 -= 2;
                int var152 = field1000[Statics.field1004];
                int var153 = field1000[Statics.field1004 + 1];
                if (var152 == 0) {
                    field1000[++Statics.field1004 - 1] = 0;
                } else {
                    field1000[++Statics.field1004 - 1] = (int) Math.pow((double) var152, (double) var153);
                }
                var128 = 1;
            } else if (arg0 == 4013) {
                Statics.field1004 -= 2;
                int var154 = field1000[Statics.field1004];
                int var155 = field1000[Statics.field1004 + 1];
                if (var154 == 0) {
                    field1000[++Statics.field1004 - 1] = 0;
                    var128 = 1;
                } else {
                    switch(var155) {
                        case 0:
                            field1000[++Statics.field1004 - 1] = Integer.MAX_VALUE;
                            break;
                        case 1:
                            field1000[++Statics.field1004 - 1] = var154;
                            break;
                        case 2:
                            field1000[++Statics.field1004 - 1] = (int) Math.sqrt((double) var154);
                            break;
                        case 3:
                            field1000[++Statics.field1004 - 1] = (int) Math.cbrt((double) var154);
                            break;
                        case 4:
                            field1000[++Statics.field1004 - 1] = (int) Math.sqrt(Math.sqrt((double) var154));
                            break;
                        default:
                            field1000[++Statics.field1004 - 1] = (int) Math.pow((double) var154, 1.0D / (double) var155);
                    }
                    var128 = 1;
                }
            } else if (arg0 == 4014) {
                Statics.field1004 -= 2;
                int var156 = field1000[Statics.field1004];
                int var157 = field1000[Statics.field1004 + 1];
                field1000[++Statics.field1004 - 1] = var156 & var157;
                var128 = 1;
            } else if (arg0 == 4015) {
                Statics.field1004 -= 2;
                int var158 = field1000[Statics.field1004];
                int var159 = field1000[Statics.field1004 + 1];
                field1000[++Statics.field1004 - 1] = var158 | var159;
                var128 = 1;
            } else if (arg0 == 4018) {
                Statics.field1004 -= 3;
                long var160 = (long) field1000[Statics.field1004];
                long var162 = (long) field1000[Statics.field1004 + 1];
                long var164 = (long) field1000[Statics.field1004 + 2];
                field1000[++Statics.field1004 - 1] = (int) (var160 * var164 / var162);
                var128 = 1;
            } else {
                var128 = 2;
            }
            return var128;
        } else if (arg0 < 4200) {
            return method955(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method1681(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method140(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method75(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method3229(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method2327(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method2999(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method60(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return Statics.method1451(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("an.l(ILce;ZI)I")
    public static int method481(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1004 -= 3;
            int var3 = field1000[Statics.field1004];
            int var4 = field1000[Statics.field1004 + 1];
            int var5 = field1000[Statics.field1004 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class231 var6 = class231.method415(var3);
            if (var6.field2737 == null) {
                var6.field2737 = new class231[var5 + 1];
            }
            if (var6.field2737.length <= var5) {
                class231[] var7 = new class231[var5 + 1];
                for (int var8 = 0; var8 < var6.field2737.length; var8++) {
                    var7[var8] = var6.field2737[var8];
                }
                var6.field2737 = var7;
            }
            if (var5 > 0 && var6.field2737[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class231 var9 = new class231();
            var9.field2722 = var4;
            var9.field2606 = var9.field2692 = var6.field2692;
            var9.field2607 = var5;
            var9.field2605 = true;
            var6.field2737[var5] = var9;
            if (arg2) {
                Statics.field3562 = var9;
            } else {
                Statics.field3302 = var9;
            }
            client.method1035(var6);
            return 1;
        } else if (arg0 == 101) {
            class231 var10 = arg2 ? Statics.field3562 : Statics.field3302;
            class231 var11 = class231.method415(var10.field2692);
            var11.field2737[var10.field2607] = null;
            client.method1035(var11);
            return 1;
        } else if (arg0 == 102) {
            class231 var12 = class231.method415(field1000[--Statics.field1004]);
            var12.field2737 = null;
            client.method1035(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1004 -= 2;
            int var13 = field1000[Statics.field1004];
            int var14 = field1000[Statics.field1004 + 1];
            class231 var15 = class231.method2960(var13, var14);
            if (var15 == null || var14 == -1) {
                field1000[++Statics.field1004 - 1] = 0;
            } else {
                field1000[++Statics.field1004 - 1] = 1;
                if (arg2) {
                    Statics.field3562 = var15;
                } else {
                    Statics.field3302 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class231 var16 = class231.method415(field1000[--Statics.field1004]);
            if (var16 == null) {
                field1000[++Statics.field1004 - 1] = 0;
            } else {
                field1000[++Statics.field1004 - 1] = 1;
                if (arg2) {
                    Statics.field3562 = var16;
                } else {
                    Statics.field3302 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aj.u(ILce;ZB)I")
    public static int method830(int arg0, class85 arg1, boolean arg2) {
        int var3 = -1;
        class231 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1000[--Statics.field1004];
            var4 = class231.method415(var3);
        } else {
            var4 = arg2 ? Statics.field3562 : Statics.field3302;
        }
        if (arg0 == 1000) {
            Statics.field1004 -= 4;
            var4.field2608 = field1000[Statics.field1004];
            var4.field2616 = field1000[Statics.field1004 + 1];
            var4.field2611 = field1000[Statics.field1004 + 2];
            var4.field2612 = field1000[Statics.field1004 + 3];
            client.method1035(var4);
            Statics.field2335.method1069(var4);
            if (var3 != -1 && var4.field2722 == 0) {
                client.method3094(Statics.field367[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1004 -= 4;
            var4.field2617 = field1000[Statics.field1004];
            var4.field2618 = field1000[Statics.field1004 + 1];
            var4.field2613 = field1000[Statics.field1004 + 2];
            var4.field2625 = field1000[Statics.field1004 + 3];
            client.method1035(var4);
            Statics.field2335.method1069(var4);
            if (var3 != -1 && var4.field2722 == 0) {
                client.method3094(Statics.field367[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1000[--Statics.field1004] == 1;
            if (var4.field2626 != var5) {
                var4.field2626 = var5;
                client.method1035(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2649 = field1000[--Statics.field1004] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2741 = field1000[--Statics.field1004] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cu.q(ILce;ZI)I")
    public static int method2082(int arg0, class85 arg1, boolean arg2) {
        int var3 = -1;
        class231 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1000[--Statics.field1004];
            var4 = class231.method415(var3);
        } else {
            var4 = arg2 ? Statics.field3562 : Statics.field3302;
        }
        if (arg0 == 1100) {
            Statics.field1004 -= 2;
            var4.field2627 = field1000[Statics.field1004];
            if (var4.field2627 > var4.field2629 - var4.field2676) {
                var4.field2627 = var4.field2629 - var4.field2676;
            }
            if (var4.field2627 < 0) {
                var4.field2627 = 0;
            }
            var4.field2664 = field1000[Statics.field1004 + 1];
            if (var4.field2664 > var4.field2630 - var4.field2622) {
                var4.field2664 = var4.field2630 - var4.field2622;
            }
            if (var4.field2664 < 0) {
                var4.field2664 = 0;
            }
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2631 = field1000[--Statics.field1004];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2711 = field1000[--Statics.field1004] == 1;
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2637 = field1000[--Statics.field1004];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2639 = field1000[--Statics.field1004];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2641 = field1000[--Statics.field1004];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2597 = field1000[--Statics.field1004];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2644 = field1000[--Statics.field1004] == 1;
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2666 = 1;
            var4.field2594 = field1000[--Statics.field1004];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1004 -= 6;
            var4.field2593 = field1000[Statics.field1004];
            var4.field2656 = field1000[Statics.field1004 + 1];
            var4.field2657 = field1000[Statics.field1004 + 2];
            var4.field2658 = field1000[Statics.field1004 + 3];
            var4.field2659 = field1000[Statics.field1004 + 4];
            var4.field2705 = field1000[Statics.field1004 + 5];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1000[--Statics.field1004];
            if (var4.field2596 != var5) {
                var4.field2596 = var5;
                var4.field2729 = 0;
                var4.field2614 = 0;
                client.method1035(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2663 = field1000[--Statics.field1004] == 1;
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1002[--Statics.field498];
            if (!var6.equals(var4.field2668)) {
                var4.field2668 = var6;
                client.method1035(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2740 = field1000[--Statics.field1004];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1004 -= 3;
            var4.field2670 = field1000[Statics.field1004];
            var4.field2682 = field1000[Statics.field1004 + 1];
            var4.field2669 = field1000[Statics.field1004 + 2];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2672 = field1000[--Statics.field1004] == 1;
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2645 = field1000[--Statics.field1004];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2646 = field1000[--Statics.field1004];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2647 = field1000[--Statics.field1004] == 1;
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2648 = field1000[--Statics.field1004] == 1;
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1004 -= 2;
            var4.field2629 = field1000[Statics.field1004];
            var4.field2630 = field1000[Statics.field1004 + 1];
            client.method1035(var4);
            if (var3 != -1 && var4.field2722 == 0) {
                client.method3094(Statics.field367[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method1792(var4.field2692, var4.field2607);
            client.field745 = var4;
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2642 = field1000[--Statics.field1004];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2632 = field1000[--Statics.field1004];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2609 = field1000[--Statics.field1004];
            client.method1035(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1000[--Statics.field1004];
            class317 var8 = (class317) class178.method1685(class317.method404(), var7);
            if (var8 != null) {
                var4.field2702 = var8;
                client.method1035(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1000[--Statics.field1004] == 1;
            var4.field2640 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field1000[--Statics.field1004] == 1;
            var4.field2727 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("by.i(ILce;ZB)I")
    public static int method1657(int arg0, class85 arg1, boolean arg2) {
        class231 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class231.method415(field1000[--Statics.field1004]);
        } else {
            var3 = arg2 ? Statics.field3562 : Statics.field3302;
        }
        client.method1035(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1004 -= 2;
            int var4 = field1000[Statics.field1004];
            int var5 = field1000[Statics.field1004 + 1];
            var3.field2650 = var4;
            var3.field2728 = var5;
            class270 var6 = class270.method2359(var4);
            var3.field2657 = var6.field3440;
            var3.field2658 = var6.field3441;
            var3.field2659 = var6.field3475;
            var3.field2593 = var6.field3443;
            var3.field2656 = var6.field3444;
            var3.field2705 = var6.field3439;
            if (arg0 == 1205) {
                var3.field2665 = 0;
            } else if (arg0 == 1212 | var6.field3445 == 1) {
                var3.field2665 = 1;
            } else {
                var3.field2665 = 2;
            }
            if (var3.field2661 > 0) {
                var3.field2705 = var3.field2705 * 32 / var3.field2661;
            } else if (var3.field2617 > 0) {
                var3.field2705 = var3.field2705 * 32 / var3.field2617;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2666 = 2;
            var3.field2594 = field1000[--Statics.field1004];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2666 = 3;
            var3.field2594 = Statics.field1877.field547.method4117();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("j.x(ILce;ZI)I")
    public static int method255(int arg0, class85 arg1, boolean arg2) {
        class231 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class231.method415(field1000[--Statics.field1004]);
        } else {
            var3 = arg2 ? Statics.field3562 : Statics.field3302;
        }
        if (arg0 == 1300) {
            int var4 = field1000[--Statics.field1004] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method4146(var4, field1002[--Statics.field498]);
                return 1;
            } else {
                Statics.field498--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1004 -= 2;
            int var5 = field1000[Statics.field1004];
            int var6 = field1000[Statics.field1004 + 1];
            var3.field2667 = class231.method2960(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2635 = field1000[--Statics.field1004] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2683 = field1000[--Statics.field1004];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2685 = field1000[--Statics.field1004];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2680 = field1002[--Statics.field498];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2662 = field1002[--Statics.field498];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2681 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hr.e(ILce;ZI)I")
    public static int method4129(int arg0, class85 arg1, boolean arg2) {
        class231 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class231.method415(field1000[--Statics.field1004]);
        } else {
            var3 = arg2 ? Statics.field3562 : Statics.field3302;
        }
        String var4 = field1002[--Statics.field498];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1000[--Statics.field1004];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1000[--Statics.field1004];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1002[--Statics.field498];
            } else {
                var7[var8] = Integer.valueOf(field1000[--Statics.field1004]);
            }
        }
        int var9 = field1000[--Statics.field1004];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2689 = var7;
        } else if (arg0 == 1401) {
            var3.field2615 = var7;
        } else if (arg0 == 1402) {
            var3.field2691 = var7;
        } else if (arg0 == 1403) {
            var3.field2693 = var7;
        } else if (arg0 == 1404) {
            var3.field2695 = var7;
        } else if (arg0 == 1405) {
            var3.field2696 = var7;
        } else if (arg0 == 1406) {
            var3.field2699 = var7;
        } else if (arg0 == 1407) {
            var3.field2700 = var7;
            var3.field2701 = var5;
        } else if (arg0 == 1408) {
            var3.field2706 = var7;
        } else if (arg0 == 1409) {
            var3.field2707 = var7;
        } else if (arg0 == 1410) {
            var3.field2697 = var7;
        } else if (arg0 == 1411) {
            var3.field2690 = var7;
        } else if (arg0 == 1412) {
            var3.field2595 = var7;
        } else if (arg0 == 1414) {
            var3.field2671 = var7;
            var3.field2734 = var5;
        } else if (arg0 == 1415) {
            var3.field2704 = var7;
            var3.field2636 = var5;
        } else if (arg0 == 1416) {
            var3.field2735 = var7;
        } else if (arg0 == 1417) {
            var3.field2708 = var7;
        } else if (arg0 == 1418) {
            var3.field2709 = var7;
        } else if (arg0 == 1419) {
            var3.field2638 = var7;
        } else if (arg0 == 1420) {
            var3.field2719 = var7;
        } else if (arg0 == 1421) {
            var3.field2712 = var7;
        } else if (arg0 == 1422) {
            var3.field2713 = var7;
        } else if (arg0 == 1423) {
            var3.field2655 = var7;
        } else if (arg0 == 1424) {
            var3.field2715 = var7;
        } else if (arg0 == 1425) {
            var3.field2717 = var7;
        } else if (arg0 == 1426) {
            var3.field2694 = var7;
        } else if (arg0 == 1427) {
            var3.field2716 = var7;
        } else {
            return 2;
        }
        var3.field2687 = true;
        return 1;
    }

    @ObfuscatedName("bb.p(ILce;ZI)I")
    public static int method1498(int arg0, class85 arg1, boolean arg2) {
        class231 var3 = arg2 ? Statics.field3562 : Statics.field3302;
        if (arg0 == 1500) {
            field1000[++Statics.field1004 - 1] = var3.field2619;
            return 1;
        } else if (arg0 == 1501) {
            field1000[++Statics.field1004 - 1] = var3.field2620;
            return 1;
        } else if (arg0 == 1502) {
            field1000[++Statics.field1004 - 1] = var3.field2676;
            return 1;
        } else if (arg0 == 1503) {
            field1000[++Statics.field1004 - 1] = var3.field2622;
            return 1;
        } else if (arg0 == 1504) {
            field1000[++Statics.field1004 - 1] = var3.field2626 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1000[++Statics.field1004 - 1] = var3.field2606;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aj.b(ILce;ZI)I")
    public static int method835(int arg0, class85 arg1, boolean arg2) {
        class231 var3 = arg2 ? Statics.field3562 : Statics.field3302;
        if (arg0 == 1800) {
            field1000[++Statics.field1004 - 1] = class232.method3011(client.method406(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1000[--Statics.field1004];
            int var5 = var4 - 1;
            if (var3.field2681 == null || var5 >= var3.field2681.length || var3.field2681[var5] == null) {
                field1002[++Statics.field498 - 1] = "";
            } else {
                field1002[++Statics.field498 - 1] = var3.field2681[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2680 == null) {
                field1002[++Statics.field498 - 1] = "";
            } else {
                field1002[++Statics.field498 - 1] = var3.field2680;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kq.n(ILce;ZI)I")
    public static int method5227(int arg0, class85 arg1, boolean arg2) {
        class231 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class231.method415(field1000[--Statics.field1004]);
        } else {
            var3 = arg2 ? Statics.field3562 : Statics.field3302;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1010 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2716 == null) {
            return 0;
        } else {
            class57 var4 = new class57();
            var4.field507 = var3;
            var4.field513 = var3.field2716;
            var4.field515 = field1010 + 1;
            client.field639.method3765(var4);
            return 1;
        }
    }

    @ObfuscatedName("f.f(ILce;ZS)I")
    public static int method112(int arg0, class85 arg1, boolean arg2) {
        class231 var3 = class231.method415(field1000[--Statics.field1004]);
        if (arg0 == 2600) {
            field1000[++Statics.field1004 - 1] = var3.field2627;
            return 1;
        } else if (arg0 == 2601) {
            field1000[++Statics.field1004 - 1] = var3.field2664;
            return 1;
        } else if (arg0 == 2602) {
            field1002[++Statics.field498 - 1] = var3.field2668;
            return 1;
        } else if (arg0 == 2603) {
            field1000[++Statics.field1004 - 1] = var3.field2629;
            return 1;
        } else if (arg0 == 2604) {
            field1000[++Statics.field1004 - 1] = var3.field2630;
            return 1;
        } else if (arg0 == 2605) {
            field1000[++Statics.field1004 - 1] = var3.field2705;
            return 1;
        } else if (arg0 == 2606) {
            field1000[++Statics.field1004 - 1] = var3.field2657;
            return 1;
        } else if (arg0 == 2607) {
            field1000[++Statics.field1004 - 1] = var3.field2659;
            return 1;
        } else if (arg0 == 2608) {
            field1000[++Statics.field1004 - 1] = var3.field2658;
            return 1;
        } else if (arg0 == 2609) {
            field1000[++Statics.field1004 - 1] = var3.field2637;
            return 1;
        } else if (arg0 == 2610) {
            field1000[++Statics.field1004 - 1] = var3.field2609;
            return 1;
        } else if (arg0 == 2611) {
            field1000[++Statics.field1004 - 1] = var3.field2631;
            return 1;
        } else if (arg0 == 2612) {
            field1000[++Statics.field1004 - 1] = var3.field2632;
            return 1;
        } else if (arg0 == 2613) {
            field1000[++Statics.field1004 - 1] = var3.field2702.method142();
            return 1;
        } else if (arg0 == 2614) {
            field1000[++Statics.field1004 - 1] = var3.field2727 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fu.g(ILce;ZI)I")
    public static int method3069(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class231 var3 = class231.method415(field1000[--Statics.field1004]);
            field1000[++Statics.field1004 - 1] = var3.field2650;
            return 1;
        } else if (arg0 == 2701) {
            class231 var4 = class231.method415(field1000[--Statics.field1004]);
            if (var4.field2650 == -1) {
                field1000[++Statics.field1004 - 1] = 0;
            } else {
                field1000[++Statics.field1004 - 1] = var4.field2728;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1000[--Statics.field1004];
            class56 var6 = (class56) client.field742.method3712((long) var5);
            if (var6 == null) {
                field1000[++Statics.field1004 - 1] = 0;
            } else {
                field1000[++Statics.field1004 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1000[++Statics.field1004 - 1] = client.field684;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bg.m(ILce;ZI)I")
    public static int method1047(int arg0, class85 arg1, boolean arg2) {
        class231 var3 = class231.method415(field1000[--Statics.field1004]);
        if (arg0 == 2800) {
            field1000[++Statics.field1004 - 1] = class232.method3011(client.method406(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field1000[--Statics.field1004];
            int var5 = var4 - 1;
            if (var3.field2681 == null || var5 >= var3.field2681.length || var3.field2681[var5] == null) {
                field1002[++Statics.field498 - 1] = "";
            } else {
                field1002[++Statics.field498 - 1] = var3.field2681[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2680 == null) {
                field1002[++Statics.field498 - 1] = "";
            } else {
                field1002[++Statics.field498 - 1] = var3.field2680;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fg.r(ILce;ZI)I")
    public static int method3172(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1000[++Statics.field1004 - 1] = client.field592;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1004 -= 2;
            int var3 = field1000[Statics.field1004];
            int var4 = field1000[Statics.field1004 + 1];
            field1000[++Statics.field1004 - 1] = class54.method4193(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1004 -= 2;
            int var5 = field1000[Statics.field1004];
            int var6 = field1000[Statics.field1004 + 1];
            int[] var7 = field1000;
            int var8 = ++Statics.field1004 - 1;
            class54 var9 = (class54) class54.field475.method3712((long) var5);
            int var10;
            if (var9 == null) {
                var10 = 0;
            } else if (var6 >= 0 && var6 < var9.field474.length) {
                var10 = var9.field474[var6];
            } else {
                var10 = 0;
            }
            var7[var8] = var10;
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1004 -= 2;
            int var11 = field1000[Statics.field1004];
            int var12 = field1000[Statics.field1004 + 1];
            field1000[++Statics.field1004 - 1] = class54.method2913(var11, var12);
            return 1;
        } else if (arg0 == 3304) {
            int var13 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = class254.method2861(var13).field3228;
            return 1;
        } else if (arg0 == 3305) {
            int var14 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = client.field713[var14];
            return 1;
        } else if (arg0 == 3306) {
            int var15 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = client.field714[var15];
            return 1;
        } else if (arg0 == 3307) {
            int var16 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = client.field641[var16];
            return 1;
        } else if (arg0 == 3308) {
            int var17 = Statics.field83;
            int var18 = (Statics.field1877.field932 >> 7) + Statics.field869;
            int var19 = (Statics.field1877.field882 >> 7) + Statics.field755;
            field1000[++Statics.field1004 - 1] = (var17 << 28) + (var18 << 14) + var19;
            return 1;
        } else if (arg0 == 3309) {
            int var20 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = var20 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var21 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = var21 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var22 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = var22 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1000[++Statics.field1004 - 1] = client.field669 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1004 -= 2;
            int var23 = field1000[Statics.field1004] + 32768;
            int var24 = field1000[Statics.field1004 + 1];
            field1000[++Statics.field1004 - 1] = class54.method4193(var23, var24);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1004 -= 2;
            int var25 = field1000[Statics.field1004] + 32768;
            int var26 = field1000[Statics.field1004 + 1];
            int[] var27 = field1000;
            int var28 = ++Statics.field1004 - 1;
            class54 var29 = (class54) class54.field475.method3712((long) var25);
            int var30;
            if (var29 == null) {
                var30 = 0;
            } else if (var26 >= 0 && var26 < var29.field474.length) {
                var30 = var29.field474[var26];
            } else {
                var30 = 0;
            }
            var27[var28] = var30;
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1004 -= 2;
            int var31 = field1000[Statics.field1004] + 32768;
            int var32 = field1000[Statics.field1004 + 1];
            field1000[++Statics.field1004 - 1] = class54.method2913(var31, var32);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field748 >= 2) {
                field1000[++Statics.field1004 - 1] = client.field748;
            } else {
                field1000[++Statics.field1004 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1000[++Statics.field1004 - 1] = client.field599;
            return 1;
        } else if (arg0 == 3318) {
            field1000[++Statics.field1004 - 1] = client.field582;
            return 1;
        } else if (arg0 == 3321) {
            field1000[++Statics.field1004 - 1] = client.field746;
            return 1;
        } else if (arg0 == 3322) {
            field1000[++Statics.field1004 - 1] = client.field783;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field777) {
                field1000[++Statics.field1004 - 1] = 1;
            } else {
                field1000[++Statics.field1004 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1000[++Statics.field1004 - 1] = client.field633;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1004 -= 4;
            int var33 = field1000[Statics.field1004];
            int var34 = field1000[Statics.field1004 + 1];
            int var35 = field1000[Statics.field1004 + 2];
            int var36 = field1000[Statics.field1004 + 3];
            int var37 = (var34 << 14) + var33;
            int var38 = (var35 << 28) + var37;
            int var39 = var36 + var38;
            field1000[++Statics.field1004 - 1] = var39;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aw.t(ILce;ZB)I")
    public static int method438(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = client.field845[var3].method40();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = client.field845[var4].field30;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = client.field845[var5].field31;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = client.field845[var6].field34;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = client.field845[var7].field33;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = client.field845[var8].field29;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1000[--Statics.field1004];
            int var10 = client.field845[var9].method39();
            field1000[++Statics.field1004 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1000[--Statics.field1004];
            int var12 = client.field845[var11].method39();
            field1000[++Statics.field1004 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1000[--Statics.field1004];
            int var14 = client.field845[var13].method39();
            field1000[++Statics.field1004 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1000[--Statics.field1004];
            int var16 = client.field845[var15].method39();
            field1000[++Statics.field1004 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1000[--Statics.field1004] == 1;
            if (Statics.field155 != null) {
                Statics.field155.method10(class2.field12, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1000[--Statics.field1004] == 1;
            if (Statics.field155 != null) {
                Statics.field155.method10(class2.field14, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1004 -= 2;
            boolean var19 = field1000[Statics.field1004] == 1;
            boolean var20 = field1000[Statics.field1004 + 1] == 1;
            if (Statics.field155 != null) {
                client.field666.field576 = var20;
                Statics.field155.method10(client.field666, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1000[--Statics.field1004] == 1;
            if (Statics.field155 != null) {
                Statics.field155.method10(class2.field10, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1000[--Statics.field1004] == 1;
            if (Statics.field155 != null) {
                Statics.field155.method10(class2.field17, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1000[++Statics.field1004 - 1] = Statics.field155 == null ? 0 : Statics.field155.field11.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1000[--Statics.field1004];
            class3 var24 = (class3) Statics.field155.field11.get(var23);
            field1000[++Statics.field1004 - 1] = var24.field20;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1000[--Statics.field1004];
            class3 var26 = (class3) Statics.field155.field11.get(var25);
            field1002[++Statics.field498 - 1] = var26.method17();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1000[--Statics.field1004];
            class3 var28 = (class3) Statics.field155.field11.get(var27);
            field1002[++Statics.field498 - 1] = var28.method19();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1000[--Statics.field1004];
            class3 var30 = (class3) Statics.field155.field11.get(var29);
            long var31 = class185.method3250() - Statics.field1014 - var30.field21;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1002[++Statics.field498 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1000[--Statics.field1004];
            class3 var38 = (class3) Statics.field155.field11.get(var37);
            field1000[++Statics.field1004 - 1] = var38.field18.field34;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1000[--Statics.field1004];
            class3 var40 = (class3) Statics.field155.field11.get(var39);
            field1000[++Statics.field1004 - 1] = var40.field18.field31;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1000[--Statics.field1004];
            class3 var42 = (class3) Statics.field155.field11.get(var41);
            field1000[++Statics.field1004 - 1] = var42.field18.field30;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bq.o(ILce;ZI)I")
    public static int method955(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1002[--Statics.field498];
            int var4 = field1000[--Statics.field1004];
            field1002[++Statics.field498 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field498 -= 2;
            String var5 = field1002[Statics.field498];
            String var6 = field1002[Statics.field498 + 1];
            field1002[++Statics.field498 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1002[--Statics.field498];
            int var8 = field1000[--Statics.field1004];
            String[] var9 = field1002;
            int var10 = ++Statics.field498 - 1;
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
            String var21 = field1002[--Statics.field498];
            field1002[++Statics.field498 - 1] = var21.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var22 = field1000[--Statics.field1004];
            long var23 = ((long) var22 + 11745L) * 86400000L;
            field1008.setTime(new Date(var23));
            int var25 = field1008.get(5);
            int var26 = field1008.get(2);
            int var27 = field1008.get(1);
            field1002[++Statics.field498 - 1] = var25 + "-" + field999[var26] + "-" + var27;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field498 -= 2;
            String var28 = field1002[Statics.field498];
            String var29 = field1002[Statics.field498 + 1];
            if (Statics.field1877.field547 != null && Statics.field1877.field547.field2572) {
                field1002[++Statics.field498 - 1] = var29;
            } else {
                field1002[++Statics.field498 - 1] = var28;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var30 = field1000[--Statics.field1004];
            field1002[++Statics.field498 - 1] = Integer.toString(var30);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field498 -= 2;
            int[] var31 = field1000;
            int var32 = ++Statics.field1004 - 1;
            int var33 = class174.method3028(field1002[Statics.field498], field1002[Statics.field498 + 1], client.field828);
            byte var34;
            if (var33 > 0) {
                var34 = 1;
            } else if (var33 < 0) {
                var34 = -1;
            } else {
                var34 = 0;
            }
            var31[var32] = var34;
            return 1;
        } else if (arg0 == 4108) {
            String var35 = field1002[--Statics.field498];
            Statics.field1004 -= 2;
            int var36 = field1000[Statics.field1004];
            int var37 = field1000[Statics.field1004 + 1];
            byte[] var38 = Statics.field462.method4247(var37, 0);
            class299 var39 = new class299(var38);
            field1000[++Statics.field1004 - 1] = var39.method5095(var35, var36);
            return 1;
        } else if (arg0 == 4109) {
            String var40 = field1002[--Statics.field498];
            Statics.field1004 -= 2;
            int var41 = field1000[Statics.field1004];
            int var42 = field1000[Statics.field1004 + 1];
            byte[] var43 = Statics.field462.method4247(var42, 0);
            class299 var44 = new class299(var43);
            field1000[++Statics.field1004 - 1] = var44.method5094(var40, var41);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field498 -= 2;
            String var45 = field1002[Statics.field498];
            String var46 = field1002[Statics.field498 + 1];
            if (field1000[--Statics.field1004] == 1) {
                field1002[++Statics.field498 - 1] = var45;
            } else {
                field1002[++Statics.field498 - 1] = var46;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var47 = field1002[--Statics.field498];
            field1002[++Statics.field498 - 1] = class300.method5096(var47);
            return 1;
        } else if (arg0 == 4112) {
            String var48 = field1002[--Statics.field498];
            int var49 = field1000[--Statics.field1004];
            field1002[++Statics.field498 - 1] = var48 + (char) var49;
            return 1;
        } else if (arg0 == 4113) {
            int var50 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = class306.method923((char) var50) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var51 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = class306.method3074((char) var51) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var52 = field1000[--Statics.field1004];
            int[] var53 = field1000;
            int var54 = ++Statics.field1004 - 1;
            char var55 = (char) var52;
            boolean var56 = var55 >= 'A' && var55 <= 'Z' || var55 >= 'a' && var55 <= 'z';
            var53[var54] = var56 ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var57 = field1000[--Statics.field1004];
            int[] var58 = field1000;
            int var59 = ++Statics.field1004 - 1;
            char var60 = (char) var57;
            boolean var61 = var60 >= '0' && var60 <= '9';
            var58[var59] = var61 ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var62 = field1002[--Statics.field498];
            if (var62 == null) {
                field1000[++Statics.field1004 - 1] = 0;
            } else {
                field1000[++Statics.field1004 - 1] = var62.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var63 = field1002[--Statics.field498];
            Statics.field1004 -= 2;
            int var64 = field1000[Statics.field1004];
            int var65 = field1000[Statics.field1004 + 1];
            field1002[++Statics.field498 - 1] = var63.substring(var64, var65);
            return 1;
        } else if (arg0 == 4119) {
            String var66 = field1002[--Statics.field498];
            StringBuilder var67 = new StringBuilder(var66.length());
            boolean var68 = false;
            for (int var69 = 0; var69 < var66.length(); var69++) {
                char var70 = var66.charAt(var69);
                if (var70 == '<') {
                    var68 = true;
                } else if (var70 == '>') {
                    var68 = false;
                } else if (!var68) {
                    var67.append(var70);
                }
            }
            field1002[++Statics.field498 - 1] = var67.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var71 = field1002[--Statics.field498];
            int var72 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = var71.indexOf(var72);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field498 -= 2;
            String var73 = field1002[Statics.field498];
            String var74 = field1002[Statics.field498 + 1];
            int var75 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = var73.indexOf(var74, var75);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bd.y(ILce;ZI)I")
    public static int method1681(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1000[--Statics.field1004];
            field1002[++Statics.field498 - 1] = class270.method2359(var3).field3434;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1004 -= 2;
            int var4 = field1000[Statics.field1004];
            int var5 = field1000[Statics.field1004 + 1];
            class270 var6 = class270.method2359(var4);
            if (var5 < 1 || var5 > 5 || var6.field3448[var5 - 1] == null) {
                field1002[++Statics.field498 - 1] = "";
            } else {
                field1002[++Statics.field498 - 1] = var6.field3448[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1004 -= 2;
            int var7 = field1000[Statics.field1004];
            int var8 = field1000[Statics.field1004 + 1];
            class270 var9 = class270.method2359(var7);
            if (var8 < 1 || var8 > 5 || var9.field3426[var8 - 1] == null) {
                field1002[++Statics.field498 - 1] = "";
            } else {
                field1002[++Statics.field498 - 1] = var9.field3426[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = class270.method2359(var10).field3446;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = class270.method2359(var11).field3445 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1000[--Statics.field1004];
            class270 var13 = class270.method2359(var12);
            if (var13.field3466 == -1 && var13.field3465 >= 0) {
                field1000[++Statics.field1004 - 1] = var13.field3465;
            } else {
                field1000[++Statics.field1004 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1000[--Statics.field1004];
            class270 var15 = class270.method2359(var14);
            if (var15.field3466 >= 0 && var15.field3465 >= 0) {
                field1000[++Statics.field1004 - 1] = var15.field3465;
            } else {
                field1000[++Statics.field1004 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = class270.method2359(var16).field3447 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1000[--Statics.field1004];
            class270 var18 = class270.method2359(var17);
            if (var18.field3478 == -1 && var18.field3477 >= 0) {
                field1000[++Statics.field1004 - 1] = var18.field3477;
            } else {
                field1000[++Statics.field1004 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1000[--Statics.field1004];
            class270 var20 = class270.method2359(var19);
            if (var20.field3478 >= 0 && var20.field3477 >= 0) {
                field1000[++Statics.field1004 - 1] = var20.field3477;
            } else {
                field1000[++Statics.field1004 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1002[--Statics.field498];
            int var22 = field1000[--Statics.field1004];
            boolean var24 = var22 == 1;
            String var25 = var21.toLowerCase();
            short[] var26 = new short[16];
            int var27 = 0;
            int var28 = 0;
            while (true) {
                if (var28 >= Statics.field1213) {
                    Statics.field232 = var26;
                    Statics.field496 = 0;
                    Statics.field1779 = var27;
                    String[] var32 = new String[Statics.field1779];
                    for (int var33 = 0; var33 < Statics.field1779; var33++) {
                        var32[var33] = class270.method2359(var26[var33]).field3434;
                    }
                    class180.method2870(var32, Statics.field232);
                    break;
                }
                class270 var29 = class270.method2359(var28);
                if ((!var24 || var29.field3437) && var29.field3466 == -1 && var29.field3434.toLowerCase().indexOf(var25) != -1) {
                    if (var27 >= 250) {
                        Statics.field1779 = -1;
                        Statics.field232 = null;
                        break;
                    }
                    if (var27 >= var26.length) {
                        short[] var30 = new short[var26.length * 2];
                        for (int var31 = 0; var31 < var27; var31++) {
                            var30[var31] = var26[var31];
                        }
                        var26 = var30;
                    }
                    var26[var27++] = (short) var28;
                }
                var28++;
            }
            field1000[++Statics.field1004 - 1] = Statics.field1779;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field232 == null || Statics.field496 >= Statics.field1779) {
                field1000[++Statics.field1004 - 1] = -1;
            } else {
                field1000[++Statics.field1004 - 1] = Statics.field232[++Statics.field496 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field496 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("g.a(ILce;ZI)I")
    public static int method140(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1000[++Statics.field1004 - 1] = client.field631;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1004 -= 3;
            client.field631 = field1000[Statics.field1004];
            Statics.field1900 = class308.method3539(field1000[Statics.field1004 + 1]);
            if (Statics.field1900 == null) {
                Statics.field1900 = class308.field3735;
            }
            client.field796 = field1000[Statics.field1004 + 2];
            class173 var3 = Statics.method414(class170.field2193, client.field627.field1219);
            var3.field2258.method3235(client.field631);
            var3.field2258.method3235(Statics.field1900.field3736);
            var3.field2258.method3235(client.field796);
            client.field627.method1847(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1002[--Statics.field498];
            Statics.field1004 -= 2;
            int var5 = field1000[Statics.field1004];
            int var6 = field1000[Statics.field1004 + 1];
            class173 var7 = Statics.method414(class170.field2186, client.field627.field1219);
            var7.field2258.method3235(class183.method5380(var4) + 2);
            var7.field2258.method3402(var4);
            var7.field2258.method3235(var5 - 1);
            var7.field2258.method3235(var6);
            client.field627.method1847(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1004 -= 2;
            int var8 = field1000[Statics.field1004];
            int var9 = field1000[Statics.field1004 + 1];
            class87 var10 = (class87) class84.field1181.get(var8);
            class59 var11 = var10.method1832(var9);
            if (var11 == null) {
                field1000[++Statics.field1004 - 1] = -1;
                field1000[++Statics.field1004 - 1] = 0;
                field1002[++Statics.field498 - 1] = "";
                field1002[++Statics.field498 - 1] = "";
                field1002[++Statics.field498 - 1] = "";
                field1000[++Statics.field1004 - 1] = 0;
            } else {
                field1000[++Statics.field1004 - 1] = var11.field541;
                field1000[++Statics.field1004 - 1] = var11.field536;
                field1002[++Statics.field498 - 1] = var11.field532 == null ? "" : var11.field532;
                field1002[++Statics.field498 - 1] = var11.field538 == null ? "" : var11.field538;
                field1002[++Statics.field498 - 1] = var11.field534 == null ? "" : var11.field534;
                field1000[++Statics.field1004 - 1] = var11.method961() ? 1 : (var11.method964() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var13 = field1000[--Statics.field1004];
            class59 var14 = class84.method1051(var13);
            if (var14 == null) {
                field1000[++Statics.field1004 - 1] = -1;
                field1000[++Statics.field1004 - 1] = 0;
                field1002[++Statics.field498 - 1] = "";
                field1002[++Statics.field498 - 1] = "";
                field1002[++Statics.field498 - 1] = "";
                field1000[++Statics.field1004 - 1] = 0;
            } else {
                field1000[++Statics.field1004 - 1] = var14.field533;
                field1000[++Statics.field1004 - 1] = var14.field536;
                field1002[++Statics.field498 - 1] = var14.field532 == null ? "" : var14.field532;
                field1002[++Statics.field498 - 1] = var14.field538 == null ? "" : var14.field538;
                field1002[++Statics.field498 - 1] = var14.field534 == null ? "" : var14.field534;
                field1000[++Statics.field1004 - 1] = var14.method961() ? 1 : (var14.method964() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field1900 == null) {
                field1000[++Statics.field1004 - 1] = -1;
            } else {
                field1000[++Statics.field1004 - 1] = Statics.field1900.field3736;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var15 = field1002[--Statics.field498];
            int var16 = field1000[--Statics.field1004];
            String var17 = var15.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class238.field2968)) {
                var18 = 0;
                var15 = var15.substring(class238.field2968.length());
            } else if (var17.startsWith(class238.field2870)) {
                var18 = 1;
                var15 = var15.substring(class238.field2870.length());
            } else if (var17.startsWith(class238.field2972)) {
                var18 = 2;
                var15 = var15.substring(class238.field2972.length());
            } else if (var17.startsWith(class238.field2974)) {
                var18 = 3;
                var15 = var15.substring(class238.field2974.length());
            } else if (var17.startsWith(class238.field2976)) {
                var18 = 4;
                var15 = var15.substring(class238.field2976.length());
            } else if (var17.startsWith(class238.field2978)) {
                var18 = 5;
                var15 = var15.substring(class238.field2978.length());
            } else if (var17.startsWith(class238.field2980)) {
                var18 = 6;
                var15 = var15.substring(class238.field2980.length());
            } else if (var17.startsWith(class238.field2982)) {
                var18 = 7;
                var15 = var15.substring(class238.field2982.length());
            } else if (var17.startsWith(class238.field2984)) {
                var18 = 8;
                var15 = var15.substring(class238.field2984.length());
            } else if (var17.startsWith(class238.field3025)) {
                var18 = 9;
                var15 = var15.substring(class238.field3025.length());
            } else if (var17.startsWith(class238.field2988)) {
                var18 = 10;
                var15 = var15.substring(class238.field2988.length());
            } else if (var17.startsWith(class238.field2990)) {
                var18 = 11;
                var15 = var15.substring(class238.field2990.length());
            } else if (client.field828 != 0) {
                if (var17.startsWith(class238.field2969)) {
                    var18 = 0;
                    var15 = var15.substring(class238.field2969.length());
                } else if (var17.startsWith(class238.field3062)) {
                    var18 = 1;
                    var15 = var15.substring(class238.field3062.length());
                } else if (var17.startsWith(class238.field2939)) {
                    var18 = 2;
                    var15 = var15.substring(class238.field2939.length());
                } else if (var17.startsWith(class238.field2975)) {
                    var18 = 3;
                    var15 = var15.substring(class238.field2975.length());
                } else if (var17.startsWith(class238.field2977)) {
                    var18 = 4;
                    var15 = var15.substring(class238.field2977.length());
                } else if (var17.startsWith(class238.field2979)) {
                    var18 = 5;
                    var15 = var15.substring(class238.field2979.length());
                } else if (var17.startsWith(class238.field2981)) {
                    var18 = 6;
                    var15 = var15.substring(class238.field2981.length());
                } else if (var17.startsWith(class238.field2983)) {
                    var18 = 7;
                    var15 = var15.substring(class238.field2983.length());
                } else if (var17.startsWith(class238.field2985)) {
                    var18 = 8;
                    var15 = var15.substring(class238.field2985.length());
                } else if (var17.startsWith(class238.field2987)) {
                    var18 = 9;
                    var15 = var15.substring(class238.field2987.length());
                } else if (var17.startsWith(class238.field2963)) {
                    var18 = 10;
                    var15 = var15.substring(class238.field2963.length());
                } else if (var17.startsWith(class238.field2991)) {
                    var18 = 11;
                    var15 = var15.substring(class238.field2991.length());
                }
            }
            String var19 = var15.toLowerCase();
            byte var20 = 0;
            if (var19.startsWith(class238.field3034)) {
                var20 = 1;
                var15 = var15.substring(class238.field3034.length());
            } else if (var19.startsWith(class238.field2994)) {
                var20 = 2;
                var15 = var15.substring(class238.field2994.length());
            } else if (var19.startsWith(class238.field2996)) {
                var20 = 3;
                var15 = var15.substring(class238.field2996.length());
            } else if (var19.startsWith(class238.field2998)) {
                var20 = 4;
                var15 = var15.substring(class238.field2998.length());
            } else if (var19.startsWith(class238.field3000)) {
                var20 = 5;
                var15 = var15.substring(class238.field3000.length());
            } else if (client.field828 != 0) {
                if (var19.startsWith(class238.field3012)) {
                    var20 = 1;
                    var15 = var15.substring(class238.field3012.length());
                } else if (var19.startsWith(class238.field2995)) {
                    var20 = 2;
                    var15 = var15.substring(class238.field2995.length());
                } else if (var19.startsWith(class238.field3052)) {
                    var20 = 3;
                    var15 = var15.substring(class238.field3052.length());
                } else if (var19.startsWith(class238.field2926)) {
                    var20 = 4;
                    var15 = var15.substring(class238.field2926.length());
                } else if (var19.startsWith(class238.field3001)) {
                    var20 = 5;
                    var15 = var15.substring(class238.field3001.length());
                }
            }
            class173 var21 = Statics.method414(class170.field2180, client.field627.field1219);
            var21.field2258.method3235(0);
            int var22 = var21.field2258.field2340;
            var21.field2258.method3235(var16);
            var21.field2258.method3235(var18);
            var21.field2258.method3235(var20);
            class301.method3532(var21.field2258, var15);
            var21.field2258.method3248(var21.field2258.field2340 - var22);
            client.field627.method1847(var21);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field498 -= 2;
            String var23 = field1002[Statics.field498];
            String var24 = field1002[Statics.field498 + 1];
            class173 var25 = Statics.method414(class170.field2155, client.field627.field1219);
            var25.field2258.method3458(0);
            int var26 = var25.field2258.field2340;
            var25.field2258.method3402(var23);
            class301.method3532(var25.field2258, var24);
            var25.field2258.method3317(var25.field2258.field2340 - var26);
            client.field627.method1847(var25);
            return 1;
        } else if (arg0 == 5015) {
            String var27;
            if (Statics.field1877 == null || Statics.field1877.field553 == null) {
                var27 = "";
            } else {
                var27 = Statics.field1877.field553.method5033();
            }
            field1002[++Statics.field498 - 1] = var27;
            return 1;
        } else if (arg0 == 5016) {
            field1000[++Statics.field1004 - 1] = client.field796;
            return 1;
        } else if (arg0 == 5017) {
            int var28 = field1000[--Statics.field1004];
            int[] var29 = field1000;
            int var30 = ++Statics.field1004 - 1;
            class87 var31 = (class87) class84.field1181.get(var28);
            int var32;
            if (var31 == null) {
                var32 = 0;
            } else {
                var32 = var31.method1843();
            }
            var29[var30] = var32;
            return 1;
        } else if (arg0 == 5018) {
            int var33 = field1000[--Statics.field1004];
            field1000[++Statics.field1004 - 1] = class84.method1514(var33);
            return 1;
        } else if (arg0 == 5019) {
            int var34 = field1000[--Statics.field1004];
            int[] var35 = field1000;
            int var36 = ++Statics.field1004 - 1;
            class59 var37 = (class59) class84.field1182.method3637((long) var34);
            int var38;
            if (var37 == null) {
                var38 = -1;
            } else if (class84.field1185.field2446 == var37.field2428) {
                var38 = -1;
            } else {
                var38 = ((class59) var37.field2428).field541;
            }
            var35[var36] = var38;
            return 1;
        } else if (arg0 == 5020) {
            String var39 = field1002[--Statics.field498];
            client.method952(var39);
            return 1;
        } else if (arg0 == 5021) {
            client.field797 = field1002[--Statics.field498].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1002[++Statics.field498 - 1] = client.field797;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.c(ILce;ZI)I")
    public static int method75(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 5306) {
            int[] var3 = field1000;
            int var4 = ++Statics.field1004 - 1;
            int var5 = client.field793 ? 2 : 1;
            var3[var4] = var5;
            return 1;
        } else if (arg0 == 5307) {
            int var6 = field1000[--Statics.field1004];
            if (var6 == 1 || var6 == 2) {
                client.method912(var6);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1000[++Statics.field1004 - 1] = Statics.field62.field958;
            return 1;
        } else if (arg0 == 5309) {
            int var7 = field1000[--Statics.field1004];
            if (var7 == 1 || var7 == 2) {
                Statics.field62.field958 = var7;
                class67.method939();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fb.v(ILce;ZI)I")
    public static int method3229(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1004 -= 2;
            int var3 = field1000[Statics.field1004];
            int var4 = field1000[Statics.field1004 + 1];
            if (!client.field823) {
                client.field650 = var3;
                client.field718 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1000[++Statics.field1004 - 1] = client.field650;
            return 1;
        } else if (arg0 == 5506) {
            field1000[++Statics.field1004 - 1] = client.field718;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1000[--Statics.field1004];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field645 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1000[++Statics.field1004 - 1] = client.field645;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("de.af(ILce;ZB)I")
    public static int method2327(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field628 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ej.ah(ILce;ZI)I")
    public static int method2999(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field1004 -= 2;
            client.field803 = (short) field1000[Statics.field1004];
            if (client.field803 <= 0) {
                client.field803 = 256;
            }
            client.field830 = (short) field1000[Statics.field1004 + 1];
            if (client.field830 <= 0) {
                client.field830 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field1004 -= 2;
            client.field849 = (short) field1000[Statics.field1004];
            if (client.field849 <= 0) {
                client.field849 = 256;
            }
            client.field832 = (short) field1000[Statics.field1004 + 1];
            if (client.field832 <= 0) {
                client.field832 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field1004 -= 4;
            client.field833 = (short) field1000[Statics.field1004];
            if (client.field833 <= 0) {
                client.field833 = 1;
            }
            client.field834 = (short) field1000[Statics.field1004 + 1];
            if (client.field834 <= 0) {
                client.field834 = 32767;
            } else if (client.field834 < client.field833) {
                client.field834 = client.field833;
            }
            client.field835 = (short) field1000[Statics.field1004 + 2];
            if (client.field835 <= 0) {
                client.field835 = 1;
            }
            client.field836 = (short) field1000[Statics.field1004 + 3];
            if (client.field836 <= 0) {
                client.field836 = 32767;
            } else if (client.field836 < client.field835) {
                client.field836 = client.field835;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field785 == null) {
                field1000[++Statics.field1004 - 1] = -1;
                field1000[++Statics.field1004 - 1] = -1;
            } else {
                client.method635(0, 0, client.field785.field2676, client.field785.field2622, false);
                field1000[++Statics.field1004 - 1] = client.field839;
                field1000[++Statics.field1004 - 1] = client.field663;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1000[++Statics.field1004 - 1] = client.field849;
            field1000[++Statics.field1004 - 1] = client.field832;
            return 1;
        } else if (arg0 == 6205) {
            field1000[++Statics.field1004 - 1] = client.field803;
            field1000[++Statics.field1004 - 1] = client.field830;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("q.ab(ILce;ZB)I")
    public static int method60(int arg0, class85 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1000[++Statics.field1004 - 1] = class66.method37() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class66.field945 = 0;
            class66 var3 = class66.method4223();
            if (var3 == null) {
                field1000[++Statics.field1004 - 1] = -1;
                field1000[++Statics.field1004 - 1] = 0;
                field1002[++Statics.field498 - 1] = "";
                field1000[++Statics.field1004 - 1] = 0;
                field1000[++Statics.field1004 - 1] = 0;
                field1002[++Statics.field498 - 1] = "";
            } else {
                field1000[++Statics.field1004 - 1] = var3.field948;
                field1000[++Statics.field1004 - 1] = var3.field949;
                field1002[++Statics.field498 - 1] = var3.field952;
                field1000[++Statics.field1004 - 1] = var3.field953;
                field1000[++Statics.field1004 - 1] = var3.field956;
                field1002[++Statics.field498 - 1] = var3.field951;
            }
            return 1;
        } else if (arg0 == 6502) {
            class66 var5 = class66.method4223();
            if (var5 == null) {
                field1000[++Statics.field1004 - 1] = -1;
                field1000[++Statics.field1004 - 1] = 0;
                field1002[++Statics.field498 - 1] = "";
                field1000[++Statics.field1004 - 1] = 0;
                field1000[++Statics.field1004 - 1] = 0;
                field1002[++Statics.field498 - 1] = "";
            } else {
                field1000[++Statics.field1004 - 1] = var5.field948;
                field1000[++Statics.field1004 - 1] = var5.field949;
                field1002[++Statics.field498 - 1] = var5.field952;
                field1000[++Statics.field1004 - 1] = var5.field953;
                field1000[++Statics.field1004 - 1] = var5.field956;
                field1002[++Statics.field498 - 1] = var5.field951;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var6 = field1000[--Statics.field1004];
            class66 var7 = null;
            for (int var8 = 0; var8 < class66.field946; var8++) {
                if (Statics.field950[var8].field948 == var6) {
                    var7 = Statics.field950[var8];
                    break;
                }
            }
            if (var7 == null) {
                field1000[++Statics.field1004 - 1] = -1;
                field1000[++Statics.field1004 - 1] = 0;
                field1002[++Statics.field498 - 1] = "";
                field1000[++Statics.field1004 - 1] = 0;
                field1000[++Statics.field1004 - 1] = 0;
                field1002[++Statics.field498 - 1] = "";
            } else {
                field1000[++Statics.field1004 - 1] = var7.field948;
                field1000[++Statics.field1004 - 1] = var7.field949;
                field1002[++Statics.field498 - 1] = var7.field952;
                field1000[++Statics.field1004 - 1] = var7.field953;
                field1000[++Statics.field1004 - 1] = var7.field956;
                field1002[++Statics.field498 - 1] = var7.field951;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1004 -= 4;
            int var9 = field1000[Statics.field1004];
            boolean var10 = field1000[Statics.field1004 + 1] == 1;
            int var11 = field1000[Statics.field1004 + 2];
            boolean var12 = field1000[Statics.field1004 + 3] == 1;
            if (Statics.field950 != null) {
                class66.method2577(0, Statics.field950.length - 1, var9, var10, var11, var12);
            }
            return 1;
        } else if (arg0 == 6511) {
            int var13 = field1000[--Statics.field1004];
            if (var13 >= 0 && var13 < class66.field946) {
                class66 var14 = Statics.field950[var13];
                field1000[++Statics.field1004 - 1] = var14.field948;
                field1000[++Statics.field1004 - 1] = var14.field949;
                field1002[++Statics.field498 - 1] = var14.field952;
                field1000[++Statics.field1004 - 1] = var14.field953;
                field1000[++Statics.field1004 - 1] = var14.field956;
                field1002[++Statics.field498 - 1] = var14.field951;
            } else {
                field1000[++Statics.field1004 - 1] = -1;
                field1000[++Statics.field1004 - 1] = 0;
                field1002[++Statics.field498 - 1] = "";
                field1000[++Statics.field1004 - 1] = 0;
                field1000[++Statics.field1004 - 1] = 0;
                field1002[++Statics.field498 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field726 = field1000[--Statics.field1004] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1004 -= 2;
            int var15 = field1000[Statics.field1004];
            int var16 = field1000[Statics.field1004 + 1];
            class265 var17 = Statics.method4231(var16);
            if (var17.method4560()) {
                field1002[++Statics.field498 - 1] = class272.method4763(var15).method4773(var16, var17.field3334);
            } else {
                field1000[++Statics.field1004 - 1] = class272.method4763(var15).method4772(var16, var17.field3331);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1004 -= 2;
            int var18 = field1000[Statics.field1004];
            int var19 = field1000[Statics.field1004 + 1];
            class265 var20 = Statics.method4231(var19);
            if (var20.method4560()) {
                field1002[++Statics.field498 - 1] = class269.method2323(var18).method4645(var19, var20.field3334);
            } else {
                field1000[++Statics.field1004 - 1] = class269.method2323(var18).method4644(var19, var20.field3331);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1004 -= 2;
            int var21 = field1000[Statics.field1004];
            int var22 = field1000[Statics.field1004 + 1];
            class265 var23 = Statics.method4231(var22);
            if (var23.method4560()) {
                field1002[++Statics.field498 - 1] = class270.method2359(var21).method4730(var22, var23.field3334);
            } else {
                field1000[++Statics.field1004 - 1] = class270.method2359(var21).method4708(var22, var23.field3331);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1004 -= 2;
            int var24 = field1000[Statics.field1004];
            int var25 = field1000[Statics.field1004 + 1];
            class265 var26 = Statics.method4231(var25);
            if (var26.method4560()) {
                String[] var27 = field1002;
                int var28 = ++Statics.field498 - 1;
                class266 var29 = (class266) class266.field3335.method3681((long) var24);
                class266 var30;
                if (var29 == null) {
                    byte[] var31 = Statics.field43.method4247(34, var24);
                    class266 var32 = new class266();
                    if (var31 != null) {
                        var32.method4569(new class183(var31));
                    }
                    var32.method4570();
                    class266.field3335.method3675(var32, (long) var24);
                    var30 = var32;
                } else {
                    var30 = var29;
                }
                var27[var28] = var30.method4572(var25, var26.field3334);
            } else {
                int[] var33 = field1000;
                int var34 = ++Statics.field1004 - 1;
                class266 var35 = (class266) class266.field3335.method3681((long) var24);
                class266 var36;
                if (var35 == null) {
                    byte[] var37 = Statics.field43.method4247(34, var24);
                    class266 var38 = new class266();
                    if (var37 != null) {
                        var38.method4569(new class183(var37));
                    }
                    var38.method4570();
                    class266.field3335.method3675(var38, (long) var24);
                    var36 = var38;
                } else {
                    var36 = var35;
                }
                var33[var34] = var36.method4571(var25, var26.field3331);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1000[++Statics.field1004 - 1] = client.field589 ? 1 : 0;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field498--;
            Statics.field1004--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field498--;
            Statics.field1004--;
            return 1;
        } else if (arg0 == 6524) {
            field1000[++Statics.field1004 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field1000[++Statics.field1004 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field1000[++Statics.field1004 - 1] = 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("er.ak(II)V")
    public static void method2884(int arg0) {
        if (arg0 == -1 || !class231.method4540(arg0)) {
            return;
        }
        class231[] var1 = Statics.field367[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class231 var3 = var1[var2];
            if (var3.field2688 != null) {
                class57 var4 = new class57();
                var4.field507 = var3;
                var4.field513 = var3.field2688;
                method5242(var4, 5000000);
            }
        }
    }
}
