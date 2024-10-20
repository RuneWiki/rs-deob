package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cy")
public class class82 {

    @ObfuscatedName("cy.k")
    public static int[] field1271 = new int[5];

    @ObfuscatedName("cy.x")
    public static int[][] field1272 = new int[5][5000];

    @ObfuscatedName("cy.z")
    public static int[] field1273 = new int[1000];

    @ObfuscatedName("cy.w")
    public static String[] field1282 = new String[1000];

    @ObfuscatedName("cy.d")
    public static int field1274 = 0;

    @ObfuscatedName("cy.a")
    public static class64[] field1276 = new class64[50];

    @ObfuscatedName("cy.l")
    public static Calendar field1269 = Calendar.getInstance();

    @ObfuscatedName("cy.m")
    public static final String[] field1278 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cy.h")
    public static int field1279 = 0;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gh.c(Lbq;I)V")
    public static void method3463(class69 arg0) {
        method178(arg0, 500000);
    }

    @ObfuscatedName("g.i(Lbq;IB)V")
    public static void method178(class69 arg0, int arg1) {
        Object[] var2 = arg0.field783;
        class246 var3 = arg0.field790;
        boolean var4 = class246.field2951 == var3 || class246.field2952 == var3 || class246.field2960 == var3 || class246.field2950 == var3 || class246.field2954 == var3 || class246.field2953 == var3 || class246.field2956 == var3 || class246.field2957 == var3;
        class97 var6;
        if (var4) {
            Statics.field479 = (class49) var2[0];
            class270 var5 = Statics.field3472[Statics.field479.field574];
            var6 = class97.method606(arg0.field790, var5.field3453, var5.field3464);
        } else {
            int var7 = (Integer) var2[0];
            class97 var8 = (class97) class97.field1450.method3625((long) var7);
            class97 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field446.method4190(var7, 0);
                if (var10 == null) {
                    var9 = null;
                } else {
                    class97 var11 = class97.method1773(var10);
                    class97.field1450.method3628(var11, (long) var7);
                    var9 = var11;
                }
            } else {
                var9 = var8;
            }
            var6 = var9;
        }
        if (var6 == null) {
            return;
        }
        Statics.field1965 = 0;
        Statics.field1234 = 0;
        int var12 = -1;
        int[] var13 = var6.field1445;
        int[] var14 = var6.field1444;
        byte var15 = -1;
        field1274 = 0;
        try {
            Statics.field641 = new int[var6.field1449];
            int var16 = 0;
            Statics.field2759 = new String[var6.field1446];
            int var17 = 0;
            for (int var18 = 1; var18 < var2.length; var18++) {
                if (var2[var18] instanceof Integer) {
                    int var19 = (Integer) var2[var18];
                    if (var19 == -2147483647) {
                        var19 = arg0.field784;
                    }
                    if (var19 == -2147483646) {
                        var19 = arg0.field779;
                    }
                    if (var19 == -2147483645) {
                        var19 = arg0.field781 == null ? -1 : arg0.field781.field2815;
                    }
                    if (var19 == -2147483644) {
                        var19 = arg0.field792;
                    }
                    if (var19 == -2147483643) {
                        var19 = arg0.field781 == null ? -1 : arg0.field781.field2816;
                    }
                    if (var19 == -2147483642) {
                        var19 = arg0.field785 == null ? -1 : arg0.field785.field2815;
                    }
                    if (var19 == -2147483641) {
                        var19 = arg0.field785 == null ? -1 : arg0.field785.field2816;
                    }
                    if (var19 == -2147483640) {
                        var19 = arg0.field786;
                    }
                    if (var19 == -2147483639) {
                        var19 = arg0.field787;
                    }
                    Statics.field641[var16++] = var19;
                } else if (var2[var18] instanceof String) {
                    String var20 = (String) var2[var18];
                    if (var20.equals("event_opbase")) {
                        var20 = arg0.field788;
                    }
                    Statics.field2759[var17++] = var20;
                }
            }
            int var21 = 0;
            field1279 = arg0.field789;
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
                                                                                                                label252: while (true) {
                                                                                                                    var21++;
                                                                                                                    if (var21 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var12++;
                                                                                                                    int var58 = var13[var12];
                                                                                                                    if (var58 >= 100) {
                                                                                                                        boolean var52;
                                                                                                                        if (var6.field1444[var12] == 1) {
                                                                                                                            var52 = true;
                                                                                                                        } else {
                                                                                                                            var52 = false;
                                                                                                                        }
                                                                                                                        int var53 = method1765(var58, var6, var52);
                                                                                                                        switch(var53) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var58 == 0) {
                                                                                                                        field1273[++Statics.field1965 - 1] = var14[var12];
                                                                                                                    } else if (var58 == 1) {
                                                                                                                        int var22 = var14[var12];
                                                                                                                        field1273[++Statics.field1965 - 1] = class238.field2771[var22];
                                                                                                                    } else if (var58 == 2) {
                                                                                                                        int var23 = var14[var12];
                                                                                                                        class238.field2771[var23] = field1273[--Statics.field1965];
                                                                                                                        client.method1800(var23);
                                                                                                                    } else if (var58 == 3) {
                                                                                                                        field1282[++Statics.field1234 - 1] = var6.field1447[var12];
                                                                                                                    } else if (var58 == 6) {
                                                                                                                        var12 += var14[var12];
                                                                                                                    } else if (var58 == 7) {
                                                                                                                        Statics.field1965 -= 2;
                                                                                                                        if (field1273[Statics.field1965] != field1273[Statics.field1965 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var58 == 8) {
                                                                                                                        Statics.field1965 -= 2;
                                                                                                                        if (field1273[Statics.field1965] == field1273[Statics.field1965 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var58 == 9) {
                                                                                                                        Statics.field1965 -= 2;
                                                                                                                        if (field1273[Statics.field1965] < field1273[Statics.field1965 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var58 == 10) {
                                                                                                                        Statics.field1965 -= 2;
                                                                                                                        if (field1273[Statics.field1965] > field1273[Statics.field1965 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var58 == 21) {
                                                                                                                        if (field1274 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class64 var24 = field1276[--field1274];
                                                                                                                        var6 = var24.field742;
                                                                                                                        var13 = var6.field1445;
                                                                                                                        var14 = var6.field1444;
                                                                                                                        var12 = var24.field739;
                                                                                                                        Statics.field641 = var24.field740;
                                                                                                                        Statics.field2759 = var24.field738;
                                                                                                                    } else if (var58 == 25) {
                                                                                                                        int var25 = var14[var12];
                                                                                                                        field1273[++Statics.field1965 - 1] = class238.method1710(var25);
                                                                                                                    } else if (var58 == 27) {
                                                                                                                        int var26 = var14[var12];
                                                                                                                        class238.method714(var26, field1273[--Statics.field1965]);
                                                                                                                    } else if (var58 == 31) {
                                                                                                                        Statics.field1965 -= 2;
                                                                                                                        if (field1273[Statics.field1965] <= field1273[Statics.field1965 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var58 == 32) {
                                                                                                                        Statics.field1965 -= 2;
                                                                                                                        if (field1273[Statics.field1965] >= field1273[Statics.field1965 + 1]) {
                                                                                                                            var12 += var14[var12];
                                                                                                                        }
                                                                                                                    } else if (var58 == 33) {
                                                                                                                        field1273[++Statics.field1965 - 1] = Statics.field641[var14[var12]];
                                                                                                                    } else if (var58 == 34) {
                                                                                                                        Statics.field641[var14[var12]] = field1273[--Statics.field1965];
                                                                                                                    } else if (var58 == 35) {
                                                                                                                        field1282[++Statics.field1234 - 1] = Statics.field2759[var14[var12]];
                                                                                                                    } else if (var58 == 36) {
                                                                                                                        Statics.field2759[var14[var12]] = field1282[--Statics.field1234];
                                                                                                                    } else if (var58 == 37) {
                                                                                                                        int var27 = var14[var12];
                                                                                                                        Statics.field1234 -= var27;
                                                                                                                        String var28 = class319.method41(field1282, Statics.field1234, var27);
                                                                                                                        field1282[++Statics.field1234 - 1] = var28;
                                                                                                                    } else if (var58 == 38) {
                                                                                                                        Statics.field1965--;
                                                                                                                    } else if (var58 == 39) {
                                                                                                                        Statics.field1234--;
                                                                                                                    } else if (var58 == 40) {
                                                                                                                        int var29 = var14[var12];
                                                                                                                        class97 var30 = (class97) class97.field1450.method3625((long) var29);
                                                                                                                        class97 var31;
                                                                                                                        if (var30 == null) {
                                                                                                                            byte[] var32 = Statics.field446.method4190(var29, 0);
                                                                                                                            if (var32 == null) {
                                                                                                                                var31 = null;
                                                                                                                            } else {
                                                                                                                                class97 var33 = class97.method1773(var32);
                                                                                                                                class97.field1450.method3628(var33, (long) var29);
                                                                                                                                var31 = var33;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var31 = var30;
                                                                                                                        }
                                                                                                                        class97 var34 = var31;
                                                                                                                        int[] var35 = new int[var31.field1449];
                                                                                                                        String[] var36 = new String[var31.field1446];
                                                                                                                        for (int var37 = 0; var37 < var34.field1454; var37++) {
                                                                                                                            var35[var37] = field1273[Statics.field1965 - var34.field1454 + var37];
                                                                                                                        }
                                                                                                                        for (int var38 = 0; var38 < var34.field1451; var38++) {
                                                                                                                            var36[var38] = field1282[Statics.field1234 - var34.field1451 + var38];
                                                                                                                        }
                                                                                                                        Statics.field1965 -= var34.field1454;
                                                                                                                        Statics.field1234 -= var34.field1451;
                                                                                                                        class64 var39 = new class64();
                                                                                                                        var39.field742 = var6;
                                                                                                                        var39.field739 = var12;
                                                                                                                        var39.field740 = Statics.field641;
                                                                                                                        var39.field738 = Statics.field2759;
                                                                                                                        field1276[++field1274 - 1] = var39;
                                                                                                                        var6 = var34;
                                                                                                                        var13 = var34.field1445;
                                                                                                                        var14 = var34.field1444;
                                                                                                                        var12 = -1;
                                                                                                                        Statics.field641 = var35;
                                                                                                                        Statics.field2759 = var36;
                                                                                                                    } else if (var58 == 42) {
                                                                                                                        field1273[++Statics.field1965 - 1] = Statics.field2152.method1805(var14[var12]);
                                                                                                                    } else if (var58 == 43) {
                                                                                                                        Statics.field2152.method1804(var14[var12], field1273[--Statics.field1965]);
                                                                                                                    } else if (var58 == 44) {
                                                                                                                        int var40 = var14[var12] >> 16;
                                                                                                                        int var41 = var14[var12] & 0xFFFF;
                                                                                                                        int var42 = field1273[--Statics.field1965];
                                                                                                                        if (var42 >= 0 && var42 <= 5000) {
                                                                                                                            field1271[var40] = var42;
                                                                                                                            byte var43 = -1;
                                                                                                                            if (var41 == 105) {
                                                                                                                                var43 = 0;
                                                                                                                            }
                                                                                                                            int var44 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var44 >= var42) {
                                                                                                                                    continue label252;
                                                                                                                                }
                                                                                                                                field1272[var40][var44] = var43;
                                                                                                                                var44++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var58 == 45) {
                                                                                                                        int var45 = var14[var12];
                                                                                                                        int var46 = field1273[--Statics.field1965];
                                                                                                                        if (var46 < 0 || var46 >= field1271[var45]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1273[++Statics.field1965 - 1] = field1272[var45][var46];
                                                                                                                    } else if (var58 == 46) {
                                                                                                                        int var47 = var14[var12];
                                                                                                                        Statics.field1965 -= 2;
                                                                                                                        int var48 = field1273[Statics.field1965];
                                                                                                                        if (var48 < 0 || var48 >= field1271[var47]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1272[var47][var48] = field1273[Statics.field1965 + 1];
                                                                                                                    } else if (var58 == 47) {
                                                                                                                        String var49 = Statics.field2152.method1807(var14[var12]);
                                                                                                                        if (var49 == null) {
                                                                                                                            var49 = class252.field3012;
                                                                                                                        }
                                                                                                                        field1282[++Statics.field1234 - 1] = var49;
                                                                                                                    } else if (var58 == 48) {
                                                                                                                        Statics.field2152.method1806(var14[var12], field1282[--Statics.field1234]);
                                                                                                                    } else if (var58 == 60) {
                                                                                                                        class210 var50 = var6.field1452[var14[var12]];
                                                                                                                        class224 var51 = (class224) var50.method3603((long) field1273[--Statics.field1965]);
                                                                                                                        if (var51 != null) {
                                                                                                                            var12 += var51.field2660;
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
        } catch (Exception var57) {
            StringBuilder var55 = new StringBuilder(30);
            var55.append("").append(var6.field2645).append(" ");
            for (int var56 = field1274 - 1; var56 >= 0; var56--) {
                var55.append("").append(field1276[var56].field742.field2645).append(" ");
            }
            var55.append("").append(var15);
            class165.method2883(var55.toString(), var57);
        }
    }

    @ObfuscatedName("ch.o(ILcx;ZI)I")
    public static int method1765(int arg0, class97 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method48(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method1868(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2662(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method40(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method1000(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method2576(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            class243 var6 = arg2 ? Statics.field4074 : Statics.field714;
            byte var7;
            if (arg0 == 1500) {
                field1273[++Statics.field1965 - 1] = var6.field2948;
                var7 = 1;
            } else if (arg0 == 1501) {
                field1273[++Statics.field1965 - 1] = var6.field2829;
                var7 = 1;
            } else if (arg0 == 1502) {
                field1273[++Statics.field1965 - 1] = var6.field2827;
                var7 = 1;
            } else if (arg0 == 1503) {
                field1273[++Statics.field1965 - 1] = var6.field2888;
                var7 = 1;
            } else if (arg0 == 1504) {
                field1273[++Statics.field1965 - 1] = var6.field2835 ? 1 : 0;
                var7 = 1;
            } else if (arg0 == 1505) {
                field1273[++Statics.field1965 - 1] = var6.field2886;
                var7 = 1;
            } else {
                var7 = 2;
            }
            return var7;
        } else if (arg0 < 1700) {
            class243 var8 = arg2 ? Statics.field4074 : Statics.field714;
            byte var9;
            if (arg0 == 1600) {
                field1273[++Statics.field1965 - 1] = var8.field2836;
                var9 = 1;
            } else if (arg0 == 1601) {
                field1273[++Statics.field1965 - 1] = var8.field2837;
                var9 = 1;
            } else if (arg0 == 1602) {
                field1282[++Statics.field1234 - 1] = var8.field2877;
                var9 = 1;
            } else if (arg0 == 1603) {
                field1273[++Statics.field1965 - 1] = var8.field2850;
                var9 = 1;
            } else if (arg0 == 1604) {
                field1273[++Statics.field1965 - 1] = var8.field2839;
                var9 = 1;
            } else if (arg0 == 1605) {
                field1273[++Statics.field1965 - 1] = var8.field2869;
                var9 = 1;
            } else if (arg0 == 1606) {
                field1273[++Statics.field1965 - 1] = var8.field2866;
                var9 = 1;
            } else if (arg0 == 1607) {
                field1273[++Statics.field1965 - 1] = var8.field2825;
                var9 = 1;
            } else if (arg0 == 1608) {
                field1273[++Statics.field1965 - 1] = var8.field2867;
                var9 = 1;
            } else if (arg0 == 1609) {
                field1273[++Statics.field1965 - 1] = var8.field2846;
                var9 = 1;
            } else if (arg0 == 1610) {
                field1273[++Statics.field1965 - 1] = var8.field2847;
                var9 = 1;
            } else if (arg0 == 1611) {
                field1273[++Statics.field1965 - 1] = var8.field2840;
                var9 = 1;
            } else if (arg0 == 1612) {
                field1273[++Statics.field1965 - 1] = var8.field2921;
                var9 = 1;
            } else if (arg0 == 1613) {
                field1273[++Statics.field1965 - 1] = var8.field2897.method8();
                var9 = 1;
            } else {
                var9 = 2;
            }
            return var9;
        } else if (arg0 < 1800) {
            return method175(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            class243 var10 = arg2 ? Statics.field4074 : Statics.field714;
            byte var15;
            if (arg0 == 1800) {
                int[] var11 = field1273;
                int var12 = ++Statics.field1965 - 1;
                int var13 = client.method580(var10);
                int var14 = var13 >> 11 & 0x3F;
                var11[var12] = var14;
                var15 = 1;
            } else if (arg0 == 1801) {
                int var16 = field1273[--Statics.field1965];
                int var348 = var16 - 1;
                if (var10.field2889 == null || var348 >= var10.field2889.length || var10.field2889[var348] == null) {
                    field1282[++Statics.field1234 - 1] = "";
                } else {
                    field1282[++Statics.field1234 - 1] = var10.field2889[var348];
                }
                var15 = 1;
            } else if (arg0 == 1802) {
                if (var10.field2883 == null) {
                    field1282[++Statics.field1234 - 1] = "";
                } else {
                    field1282[++Statics.field1234 - 1] = var10.field2883;
                }
                var15 = 1;
            } else {
                var15 = 2;
            }
            return var15;
        } else if (arg0 < 2000) {
            return method1661(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1868(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2662(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method40(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method1000(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method2576(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method148(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method565(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method4089(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method1449(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method1661(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            byte var18;
            if (arg0 == 3100) {
                String var17 = field1282[--Statics.field1234];
                class96.method3189(0, "", var17);
                var18 = 1;
            } else if (arg0 == 3101) {
                Statics.field1965 -= 2;
                client.method5086(Statics.field260, field1273[Statics.field1965], field1273[Statics.field1965 + 1]);
                var18 = 1;
            } else if (arg0 == 3103) {
                class185 var19 = class185.method2860(class182.field2404, client.field903.field1476);
                client.field903.method1884(var19);
                for (class68 var20 = (class68) client.field1018.method3658(); var20 != null; var20 = (class68) client.field1018.method3661()) {
                    if (var20.field775 == 0 || var20.field775 == 3) {
                        client.method576(var20, true);
                    }
                }
                if (client.field1103 != null) {
                    client.method260(client.field1103);
                    client.field1103 = null;
                }
                var18 = 1;
            } else if (arg0 == 3104) {
                String var21 = field1282[--Statics.field1234];
                int var22 = 0;
                if (class319.method4904(var21)) {
                    int var23 = class319.method2664(var21, 10, true);
                    var22 = var23;
                }
                class185 var24 = class185.method2860(class182.field2417, client.field903.field1476);
                var24.field2501.method3212(var22);
                client.field903.method1884(var24);
                var18 = 1;
            } else if (arg0 == 3105) {
                String var25 = field1282[--Statics.field1234];
                class185 var26 = class185.method2860(class182.field2385, client.field903.field1476);
                var26.field2501.method3209(var25.length() + 1);
                var26.field2501.method3216(var25);
                client.field903.method1884(var26);
                var18 = 1;
            } else if (arg0 == 3106) {
                String var27 = field1282[--Statics.field1234];
                class185 var28 = class185.method2860(class182.field2451, client.field903.field1476);
                var28.field2501.method3209(var27.length() + 1);
                var28.field2501.method3216(var27);
                client.field903.method1884(var28);
                var18 = 1;
            } else if (arg0 == 3107) {
                int var29 = field1273[--Statics.field1965];
                String var30 = field1282[--Statics.field1234];
                int var31 = class94.field1415;
                int[] var32 = class94.field1416;
                boolean var33 = false;
                class306 var34 = new class306(var30, Statics.field1108);
                for (int var35 = 0; var35 < var31; var35++) {
                    class73 var36 = client.field972[var32[var35]];
                    if (var36 != null && Statics.field260 != var36 && var36.field824 != null && var36.field824.equals(var34)) {
                        if (var29 == 1) {
                            class185 var37 = class185.method2860(class182.field2432, client.field903.field1476);
                            var37.field2501.method3354(var32[var35]);
                            var37.field2501.method3250(0);
                            client.field903.method1884(var37);
                        } else if (var29 == 4) {
                            class185 var38 = class185.method2860(class182.field2469, client.field903.field1476);
                            var38.field2501.method3260(var32[var35]);
                            var38.field2501.method3396(0);
                            client.field903.method1884(var38);
                        } else if (var29 == 6) {
                            class185 var39 = class185.method2860(class182.field2378, client.field903.field1476);
                            var39.field2501.method3250(0);
                            var39.field2501.method3210(var32[var35]);
                            client.field903.method1884(var39);
                        } else if (var29 == 7) {
                            class185 var40 = class185.method2860(class182.field2436, client.field903.field1476);
                            var40.field2501.method3250(0);
                            var40.field2501.method3325(var32[var35]);
                            client.field903.method1884(var40);
                        }
                        var33 = true;
                        break;
                    }
                }
                if (!var33) {
                    class96.method3189(4, "", class252.field3162 + var30);
                }
                var18 = 1;
            } else if (arg0 == 3108) {
                Statics.field1965 -= 3;
                int var41 = field1273[Statics.field1965];
                int var42 = field1273[Statics.field1965 + 1];
                int var43 = field1273[Statics.field1965 + 2];
                class243 var44 = class243.method3(var43);
                client.method3928(var44, var41, var42);
                var18 = 1;
            } else if (arg0 == 3109) {
                Statics.field1965 -= 2;
                int var45 = field1273[Statics.field1965];
                int var46 = field1273[Statics.field1965 + 1];
                class243 var47 = arg2 ? Statics.field4074 : Statics.field714;
                client.method3928(var47, var45, var46);
                var18 = 1;
            } else if (arg0 == 3110) {
                Statics.field441 = field1273[--Statics.field1965] == 1;
                var18 = 1;
            } else if (arg0 == 3111) {
                field1273[++Statics.field1965 - 1] = Statics.field565.field1237 ? 1 : 0;
                var18 = 1;
            } else if (arg0 == 3112) {
                Statics.field565.field1237 = field1273[--Statics.field1965] == 1;
                class79.method612();
                var18 = 1;
            } else if (arg0 == 3113) {
                String var48 = field1282[--Statics.field1234];
                boolean var49 = field1273[--Statics.field1965] == 1;
                if (var49) {
                    label1924: {
                        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                            try {
                                Desktop.getDesktop().browse(new URI(var48));
                                break label1924;
                            } catch (Exception var347) {
                            }
                        }
                        if (class58.field647.startsWith("win")) {
                            class58.method2368(var48, 0);
                        } else if (class58.field647.startsWith("mac")) {
                            class58.method498(var48, 1, "openjs");
                        } else {
                            class58.method2368(var48, 2);
                        }
                    }
                } else {
                    class58.method2368(var48, 3);
                }
                var18 = 1;
            } else if (arg0 == 3115) {
                int var51 = field1273[--Statics.field1965];
                class185 var52 = class185.method2860(class182.field2395, client.field903.field1476);
                var52.field2501.method3210(var51);
                client.field903.method1884(var52);
                var18 = 1;
            } else if (arg0 == 3116) {
                int var53 = field1273[--Statics.field1965];
                Statics.field1234 -= 2;
                String var54 = field1282[Statics.field1234];
                String var55 = field1282[Statics.field1234 + 1];
                if (var54.length() > 500) {
                    var18 = 1;
                } else if (var55.length() > 500) {
                    var18 = 1;
                } else {
                    class185 var56 = class185.method2860(class182.field2465, client.field903.field1476);
                    var56.field2501.method3210(1 + class195.method1769(var54) + class195.method1769(var55));
                    var56.field2501.method3216(var55);
                    var56.field2501.method3396(var53);
                    var56.field2501.method3216(var54);
                    client.field903.method1884(var56);
                    var18 = 1;
                }
            } else if (arg0 == 3117) {
                client.field1002 = field1273[--Statics.field1965] == 1;
                var18 = 1;
            } else if (arg0 == 3118) {
                client.field913 = field1273[--Statics.field1965] == 1;
                var18 = 1;
            } else if (arg0 == 3119) {
                client.field975 = field1273[--Statics.field1965] == 1;
                var18 = 1;
            } else if (arg0 == 3120) {
                if (field1273[--Statics.field1965] == 1) {
                    client.field976 |= 0x1;
                } else {
                    client.field976 &= 0xFFFFFFFE;
                }
                var18 = 1;
            } else if (arg0 == 3121) {
                if (field1273[--Statics.field1965] == 1) {
                    client.field976 |= 0x2;
                } else {
                    client.field976 &= 0xFFFFFFFD;
                }
                var18 = 1;
            } else if (arg0 == 3122) {
                if (field1273[--Statics.field1965] == 1) {
                    client.field976 |= 0x4;
                } else {
                    client.field976 &= 0xFFFFFFFB;
                }
                var18 = 1;
            } else if (arg0 == 3123) {
                if (field1273[--Statics.field1965] == 1) {
                    client.field976 |= 0x8;
                } else {
                    client.field976 &= 0xFFFFFFF7;
                }
                var18 = 1;
            } else if (arg0 == 3124) {
                client.field976 = 0;
                var18 = 1;
            } else if (arg0 == 3125) {
                client.field938 = field1273[--Statics.field1965] == 1;
                var18 = 1;
            } else if (arg0 == 3126) {
                client.field961 = field1273[--Statics.field1965] == 1;
                var18 = 1;
            } else if (arg0 == 3127) {
                boolean var57 = field1273[--Statics.field1965] == 1;
                client.field1003 = var57;
                var18 = 1;
            } else if (arg0 == 3128) {
                int[] var58 = field1273;
                int var59 = ++Statics.field1965 - 1;
                boolean var60 = client.field1003;
                var58[var59] = var60 ? 1 : 0;
                var18 = 1;
            } else if (arg0 == 3129) {
                Statics.field1965 -= 2;
                client.field936 = field1273[Statics.field1965];
                client.field937 = field1273[Statics.field1965 + 1];
                var18 = 1;
            } else {
                var18 = 2;
            }
            return var18;
        } else if (arg0 < 3300) {
            return method2903(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            byte var61;
            if (arg0 == 3300) {
                field1273[++Statics.field1965 - 1] = client.field867;
                var61 = 1;
            } else if (arg0 == 3301) {
                Statics.field1965 -= 2;
                int var62 = field1273[Statics.field1965];
                int var63 = field1273[Statics.field1965 + 1];
                int[] var64 = field1273;
                int var65 = ++Statics.field1965 - 1;
                class66 var66 = (class66) class66.field754.method3677((long) var62);
                int var67;
                if (var66 == null) {
                    var67 = -1;
                } else if (var63 >= 0 && var63 < var66.field758.length) {
                    var67 = var66.field758[var63];
                } else {
                    var67 = -1;
                }
                var64[var65] = var67;
                var61 = 1;
            } else if (arg0 == 3302) {
                Statics.field1965 -= 2;
                int var68 = field1273[Statics.field1965];
                int var69 = field1273[Statics.field1965 + 1];
                field1273[++Statics.field1965 - 1] = class66.method1509(var68, var69);
                var61 = 1;
            } else if (arg0 == 3303) {
                Statics.field1965 -= 2;
                int var70 = field1273[Statics.field1965];
                int var71 = field1273[Statics.field1965 + 1];
                int[] var72 = field1273;
                int var73 = ++Statics.field1965 - 1;
                class66 var74 = (class66) class66.field754.method3677((long) var70);
                int var75;
                if (var74 == null) {
                    var75 = 0;
                } else if (var71 == -1) {
                    var75 = 0;
                } else {
                    int var76 = 0;
                    for (int var77 = 0; var77 < var74.field753.length; var77++) {
                        if (var74.field758[var77] == var71) {
                            var76 += var74.field753[var77];
                        }
                    }
                    var75 = var76;
                }
                var72[var73] = var75;
                var61 = 1;
            } else if (arg0 == 3304) {
                int var78 = field1273[--Statics.field1965];
                int[] var79 = field1273;
                int var80 = ++Statics.field1965 - 1;
                class268 var81 = (class268) class268.field3440.method3625((long) var78);
                class268 var82;
                if (var81 == null) {
                    byte[] var83 = Statics.field3439.method4190(5, var78);
                    class268 var84 = new class268();
                    if (var83 != null) {
                        var84.method4363(new class195(var83));
                    }
                    class268.field3440.method3628(var84, (long) var78);
                    var82 = var84;
                } else {
                    var82 = var81;
                }
                var79[var80] = var82.field3441;
                var61 = 1;
            } else if (arg0 == 3305) {
                int var85 = field1273[--Statics.field1965];
                field1273[++Statics.field1965 - 1] = client.field1121[var85];
                var61 = 1;
            } else if (arg0 == 3306) {
                int var86 = field1273[--Statics.field1965];
                field1273[++Statics.field1965 - 1] = client.field917[var86];
                var61 = 1;
            } else if (arg0 == 3307) {
                int var87 = field1273[--Statics.field1965];
                field1273[++Statics.field1965 - 1] = client.field918[var87];
                var61 = 1;
            } else if (arg0 == 3308) {
                int var88 = Statics.field2770;
                int var89 = (Statics.field260.field1186 >> 7) + Statics.field2499;
                int var90 = (Statics.field260.field1210 >> 7) + Statics.field29;
                field1273[++Statics.field1965 - 1] = (var88 << 28) + (var89 << 14) + var90;
                var61 = 1;
            } else if (arg0 == 3309) {
                int var91 = field1273[--Statics.field1965];
                field1273[++Statics.field1965 - 1] = var91 >> 14 & 0x3FFF;
                var61 = 1;
            } else if (arg0 == 3310) {
                int var92 = field1273[--Statics.field1965];
                field1273[++Statics.field1965 - 1] = var92 >> 28;
                var61 = 1;
            } else if (arg0 == 3311) {
                int var93 = field1273[--Statics.field1965];
                field1273[++Statics.field1965 - 1] = var93 & 0x3FFF;
                var61 = 1;
            } else if (arg0 == 3312) {
                field1273[++Statics.field1965 - 1] = client.field856 ? 1 : 0;
                var61 = 1;
            } else if (arg0 == 3313) {
                Statics.field1965 -= 2;
                int var94 = field1273[Statics.field1965] + 32768;
                int var95 = field1273[Statics.field1965 + 1];
                int[] var96 = field1273;
                int var97 = ++Statics.field1965 - 1;
                class66 var98 = (class66) class66.field754.method3677((long) var94);
                int var99;
                if (var98 == null) {
                    var99 = -1;
                } else if (var95 >= 0 && var95 < var98.field758.length) {
                    var99 = var98.field758[var95];
                } else {
                    var99 = -1;
                }
                var96[var97] = var99;
                var61 = 1;
            } else if (arg0 == 3314) {
                Statics.field1965 -= 2;
                int var100 = field1273[Statics.field1965] + 32768;
                int var101 = field1273[Statics.field1965 + 1];
                field1273[++Statics.field1965 - 1] = class66.method1509(var100, var101);
                var61 = 1;
            } else if (arg0 == 3315) {
                Statics.field1965 -= 2;
                int var102 = field1273[Statics.field1965] + 32768;
                int var103 = field1273[Statics.field1965 + 1];
                int[] var104 = field1273;
                int var105 = ++Statics.field1965 - 1;
                class66 var106 = (class66) class66.field754.method3677((long) var102);
                int var107;
                if (var106 == null) {
                    var107 = 0;
                } else if (var103 == -1) {
                    var107 = 0;
                } else {
                    int var108 = 0;
                    for (int var109 = 0; var109 < var106.field753.length; var109++) {
                        if (var106.field758[var109] == var103) {
                            var108 += var106.field753[var109];
                        }
                    }
                    var107 = var108;
                }
                var104[var105] = var107;
                var61 = 1;
            } else if (arg0 == 3316) {
                if (client.field1024 >= 2) {
                    field1273[++Statics.field1965 - 1] = client.field1024;
                } else {
                    field1273[++Statics.field1965 - 1] = 0;
                }
                var61 = 1;
            } else if (arg0 == 3317) {
                field1273[++Statics.field1965 - 1] = client.field874;
                var61 = 1;
            } else if (arg0 == 3318) {
                field1273[++Statics.field1965 - 1] = client.field858;
                var61 = 1;
            } else if (arg0 == 3321) {
                field1273[++Statics.field1965 - 1] = client.field1022;
                var61 = 1;
            } else if (arg0 == 3322) {
                field1273[++Statics.field1965 - 1] = client.field1023;
                var61 = 1;
            } else if (arg0 == 3323) {
                if (client.field1026) {
                    field1273[++Statics.field1965 - 1] = 1;
                } else {
                    field1273[++Statics.field1965 - 1] = 0;
                }
                var61 = 1;
            } else if (arg0 == 3324) {
                field1273[++Statics.field1965 - 1] = client.field859;
                var61 = 1;
            } else if (arg0 == 3325) {
                Statics.field1965 -= 4;
                int var110 = field1273[Statics.field1965];
                int var111 = field1273[Statics.field1965 + 1];
                int var112 = field1273[Statics.field1965 + 2];
                int var113 = field1273[Statics.field1965 + 3];
                int var114 = (var111 << 14) + var110;
                int var115 = (var112 << 28) + var114;
                int var116 = var113 + var115;
                field1273[++Statics.field1965 - 1] = var116;
                var61 = 1;
            } else {
                var61 = 2;
            }
            return var61;
        } else if (arg0 < 3500) {
            return method311(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            byte var117;
            if (arg0 == 3600) {
                if (Statics.field2183.field1247 == 0) {
                    field1273[++Statics.field1965 - 1] = -2;
                } else if (Statics.field2183.field1247 == 1) {
                    field1273[++Statics.field1965 - 1] = -1;
                } else {
                    field1273[++Statics.field1965 - 1] = Statics.field2183.field1251.method4938();
                }
                var117 = 1;
            } else if (arg0 == 3601) {
                int var118 = field1273[--Statics.field1965];
                if (Statics.field2183.method1521() && var118 >= 0 && var118 < Statics.field2183.field1251.method4938()) {
                    class307 var119 = (class307) Statics.field2183.field1251.method4970(var118);
                    field1282[++Statics.field1234 - 1] = var119.method4902();
                    field1282[++Statics.field1234 - 1] = var119.method4886();
                } else {
                    field1282[++Statics.field1234 - 1] = "";
                    field1282[++Statics.field1234 - 1] = "";
                }
                var117 = 1;
            } else if (arg0 == 3602) {
                int var120 = field1273[--Statics.field1965];
                if (Statics.field2183.method1521() && var120 >= 0 && var120 < Statics.field2183.field1251.method4938()) {
                    field1273[++Statics.field1965 - 1] = ((class302) Statics.field2183.field1251.method4970(var120)).field3841;
                } else {
                    field1273[++Statics.field1965 - 1] = 0;
                }
                var117 = 1;
            } else if (arg0 == 3603) {
                int var121 = field1273[--Statics.field1965];
                if (Statics.field2183.method1521() && var121 >= 0 && var121 < Statics.field2183.field1251.method4938()) {
                    field1273[++Statics.field1965 - 1] = ((class302) Statics.field2183.field1251.method4970(var121)).field3839;
                } else {
                    field1273[++Statics.field1965 - 1] = 0;
                }
                var117 = 1;
            } else if (arg0 == 3604) {
                String var122 = field1282[--Statics.field1234];
                int var123 = field1273[--Statics.field1965];
                class80.method518(var122, var123);
                var117 = 1;
            } else if (arg0 == 3605) {
                String var124 = field1282[--Statics.field1234];
                Statics.field2183.method1528(var124);
                var117 = 1;
            } else if (arg0 == 3606) {
                String var125 = field1282[--Statics.field1234];
                Statics.field2183.method1532(var125);
                var117 = 1;
            } else if (arg0 == 3607) {
                String var126 = field1282[--Statics.field1234];
                Statics.field2183.method1530(var126);
                var117 = 1;
            } else if (arg0 == 3608) {
                String var127 = field1282[--Statics.field1234];
                Statics.field2183.method1554(var127);
                var117 = 1;
            } else if (arg0 == 3609) {
                String var128 = field1282[--Statics.field1234];
                String var129 = client.method665(var128);
                field1273[++Statics.field1965 - 1] = Statics.field2183.method1569(new class306(var129, Statics.field1108), false) ? 1 : 0;
                var117 = 1;
            } else if (arg0 == 3611) {
                if (Statics.field444 == null) {
                    field1282[++Statics.field1234 - 1] = "";
                } else {
                    field1282[++Statics.field1234 - 1] = Statics.field444.field3858;
                }
                var117 = 1;
            } else if (arg0 == 3612) {
                if (Statics.field444 == null) {
                    field1273[++Statics.field1965 - 1] = 0;
                } else {
                    field1273[++Statics.field1965 - 1] = Statics.field444.method4938();
                }
                var117 = 1;
            } else if (arg0 == 3613) {
                int var130 = field1273[--Statics.field1965];
                if (Statics.field444 == null || var130 >= Statics.field444.method4938()) {
                    field1282[++Statics.field1234 - 1] = "";
                } else {
                    field1282[++Statics.field1234 - 1] = Statics.field444.method4970(var130).method4884().method5038();
                }
                var117 = 1;
            } else if (arg0 == 3614) {
                int var131 = field1273[--Statics.field1965];
                if (Statics.field444 == null || var131 >= Statics.field444.method4938()) {
                    field1273[++Statics.field1965 - 1] = 0;
                } else {
                    field1273[++Statics.field1965 - 1] = ((class302) Statics.field444.method4970(var131)).method5012();
                }
                var117 = 1;
            } else if (arg0 == 3615) {
                int var132 = field1273[--Statics.field1965];
                if (Statics.field444 == null || var132 >= Statics.field444.method4938()) {
                    field1273[++Statics.field1965 - 1] = 0;
                } else {
                    field1273[++Statics.field1965 - 1] = ((class302) Statics.field444.method4970(var132)).field3839;
                }
                var117 = 1;
            } else if (arg0 == 3616) {
                field1273[++Statics.field1965 - 1] = Statics.field444 == null ? 0 : Statics.field444.field3861;
                var117 = 1;
            } else if (arg0 == 3617) {
                String var133 = field1282[--Statics.field1234];
                if (Statics.field444 != null) {
                    class185 var134 = class185.method2860(class182.field2415, client.field903.field1476);
                    var134.field2501.method3209(class195.method1769(var133));
                    var134.field2501.method3216(var133);
                    client.field903.method1884(var134);
                }
                var117 = 1;
            } else if (arg0 == 3618) {
                field1273[++Statics.field1965 - 1] = Statics.field444 == null ? 0 : Statics.field444.field3863;
                var117 = 1;
            } else if (arg0 == 3619) {
                String var135 = field1282[--Statics.field1234];
                if (!var135.equals("")) {
                    class185 var136 = class185.method2860(class182.field2418, client.field903.field1476);
                    var136.field2501.method3209(class195.method1769(var135));
                    var136.field2501.method3216(var135);
                    client.field903.method1884(var136);
                }
                var117 = 1;
            } else if (arg0 == 3620) {
                client.method3539();
                var117 = 1;
            } else if (arg0 == 3621) {
                if (Statics.field2183.method1521()) {
                    field1273[++Statics.field1965 - 1] = Statics.field2183.field1250.method4938();
                } else {
                    field1273[++Statics.field1965 - 1] = -1;
                }
                var117 = 1;
            } else if (arg0 == 3622) {
                int var137 = field1273[--Statics.field1965];
                if (Statics.field2183.method1521() && var137 >= 0 && var137 < Statics.field2183.field1250.method4938()) {
                    class301 var138 = (class301) Statics.field2183.field1250.method4970(var137);
                    field1282[++Statics.field1234 - 1] = var138.method4902();
                    field1282[++Statics.field1234 - 1] = var138.method4886();
                } else {
                    field1282[++Statics.field1234 - 1] = "";
                    field1282[++Statics.field1234 - 1] = "";
                }
                var117 = 1;
            } else if (arg0 == 3623) {
                String var139 = field1282[--Statics.field1234];
                String var140 = client.method665(var139);
                field1273[++Statics.field1965 - 1] = Statics.field2183.method1559(new class306(var140, Statics.field1108)) ? 1 : 0;
                var117 = 1;
            } else if (arg0 == 3624) {
                int var141 = field1273[--Statics.field1965];
                if (Statics.field444 == null || var141 >= Statics.field444.method4938() || !Statics.field444.method4970(var141).method4884().equals(Statics.field260.field824)) {
                    field1273[++Statics.field1965 - 1] = 0;
                } else {
                    field1273[++Statics.field1965 - 1] = 1;
                }
                var117 = 1;
            } else if (arg0 == 3625) {
                if (Statics.field444 == null || Statics.field444.field3857 == null) {
                    field1282[++Statics.field1234 - 1] = "";
                } else {
                    field1282[++Statics.field1234 - 1] = Statics.field444.field3857;
                }
                var117 = 1;
            } else if (arg0 == 3626) {
                int var142 = field1273[--Statics.field1965];
                if (Statics.field444 == null || var142 >= Statics.field444.method4938() || !((class296) Statics.field444.method4970(var142)).method4861()) {
                    field1273[++Statics.field1965 - 1] = 0;
                } else {
                    field1273[++Statics.field1965 - 1] = 1;
                }
                var117 = 1;
            } else if (arg0 == 3627) {
                int var143 = field1273[--Statics.field1965];
                if (Statics.field444 == null || var143 >= Statics.field444.method4938() || !((class296) Statics.field444.method4970(var143)).method4864()) {
                    field1273[++Statics.field1965 - 1] = 0;
                } else {
                    field1273[++Statics.field1965 - 1] = 1;
                }
                var117 = 1;
            } else if (arg0 == 3628) {
                Statics.field2183.field1251.method4957();
                var117 = 1;
            } else if (arg0 == 3629) {
                boolean var144 = field1273[--Statics.field1965] == 1;
                Statics.field2183.field1251.method4994(new class322(var144));
                var117 = 1;
            } else if (arg0 == 3630) {
                boolean var145 = field1273[--Statics.field1965] == 1;
                Statics.field2183.field1251.method4994(new class323(var145));
                var117 = 1;
            } else if (arg0 == 3631) {
                boolean var146 = field1273[--Statics.field1965] == 1;
                Statics.field2183.field1251.method4994(new class156(var146));
                var117 = 1;
            } else if (arg0 == 3632) {
                boolean var147 = field1273[--Statics.field1965] == 1;
                Statics.field2183.field1251.method4994(new class150(var147));
                var117 = 1;
            } else if (arg0 == 3633) {
                boolean var148 = field1273[--Statics.field1965] == 1;
                Statics.field2183.field1251.method4994(new class155(var148));
                var117 = 1;
            } else if (arg0 == 3634) {
                boolean var149 = field1273[--Statics.field1965] == 1;
                Statics.field2183.field1251.method4994(new class158(var149));
                var117 = 1;
            } else if (arg0 == 3635) {
                boolean var150 = field1273[--Statics.field1965] == 1;
                Statics.field2183.field1251.method4994(new class154(var150));
                var117 = 1;
            } else if (arg0 == 3636) {
                boolean var151 = field1273[--Statics.field1965] == 1;
                Statics.field2183.field1251.method4994(new class152(var151));
                var117 = 1;
            } else if (arg0 == 3637) {
                boolean var152 = field1273[--Statics.field1965] == 1;
                Statics.field2183.field1251.method4994(new class151(var152));
                var117 = 1;
            } else if (arg0 == 3638) {
                boolean var153 = field1273[--Statics.field1965] == 1;
                Statics.field2183.field1251.method4994(new class153(var153));
                var117 = 1;
            } else if (arg0 == 3639) {
                Statics.field2183.field1251.method4956();
                var117 = 1;
            } else if (arg0 == 3640) {
                Statics.field2183.field1250.method4957();
                var117 = 1;
            } else if (arg0 == 3641) {
                boolean var154 = field1273[--Statics.field1965] == 1;
                Statics.field2183.field1250.method4994(new class322(var154));
                var117 = 1;
            } else if (arg0 == 3642) {
                boolean var155 = field1273[--Statics.field1965] == 1;
                Statics.field2183.field1250.method4994(new class323(var155));
                var117 = 1;
            } else if (arg0 == 3643) {
                Statics.field2183.field1250.method4956();
                var117 = 1;
            } else if (arg0 == 3644) {
                if (Statics.field444 != null) {
                    Statics.field444.method4957();
                }
                var117 = 1;
            } else if (arg0 == 3645) {
                boolean var156 = field1273[--Statics.field1965] == 1;
                if (Statics.field444 != null) {
                    Statics.field444.method4994(new class322(var156));
                }
                var117 = 1;
            } else if (arg0 == 3646) {
                boolean var157 = field1273[--Statics.field1965] == 1;
                if (Statics.field444 != null) {
                    Statics.field444.method4994(new class323(var157));
                }
                var117 = 1;
            } else if (arg0 == 3647) {
                boolean var158 = field1273[--Statics.field1965] == 1;
                if (Statics.field444 != null) {
                    Statics.field444.method4994(new class156(var158));
                }
                var117 = 1;
            } else if (arg0 == 3648) {
                boolean var159 = field1273[--Statics.field1965] == 1;
                if (Statics.field444 != null) {
                    Statics.field444.method4994(new class150(var159));
                }
                var117 = 1;
            } else if (arg0 == 3649) {
                boolean var160 = field1273[--Statics.field1965] == 1;
                if (Statics.field444 != null) {
                    Statics.field444.method4994(new class155(var160));
                }
                var117 = 1;
            } else if (arg0 == 3650) {
                boolean var161 = field1273[--Statics.field1965] == 1;
                if (Statics.field444 != null) {
                    Statics.field444.method4994(new class158(var161));
                }
                var117 = 1;
            } else if (arg0 == 3651) {
                boolean var162 = field1273[--Statics.field1965] == 1;
                if (Statics.field444 != null) {
                    Statics.field444.method4994(new class154(var162));
                }
                var117 = 1;
            } else if (arg0 == 3652) {
                boolean var163 = field1273[--Statics.field1965] == 1;
                if (Statics.field444 != null) {
                    Statics.field444.method4994(new class152(var163));
                }
                var117 = 1;
            } else if (arg0 == 3653) {
                boolean var164 = field1273[--Statics.field1965] == 1;
                if (Statics.field444 != null) {
                    Statics.field444.method4994(new class151(var164));
                }
                var117 = 1;
            } else if (arg0 == 3654) {
                boolean var165 = field1273[--Statics.field1965] == 1;
                if (Statics.field444 != null) {
                    Statics.field444.method4994(new class153(var165));
                }
                var117 = 1;
            } else if (arg0 == 3655) {
                if (Statics.field444 != null) {
                    Statics.field444.method4956();
                }
                var117 = 1;
            } else if (arg0 == 3656) {
                boolean var166 = field1273[--Statics.field1965] == 1;
                Statics.field2183.field1251.method4994(new class157(var166));
                var117 = 1;
            } else if (arg0 == 3657) {
                boolean var167 = field1273[--Statics.field1965] == 1;
                if (Statics.field444 != null) {
                    Statics.field444.method4994(new class157(var167));
                }
                var117 = 1;
            } else {
                var117 = 2;
            }
            return var117;
        } else if (arg0 < 4000) {
            return method2859(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            byte var170;
            if (arg0 == 4000) {
                Statics.field1965 -= 2;
                int var168 = field1273[Statics.field1965];
                int var169 = field1273[Statics.field1965 + 1];
                field1273[++Statics.field1965 - 1] = var168 + var169;
                var170 = 1;
            } else if (arg0 == 4001) {
                Statics.field1965 -= 2;
                int var171 = field1273[Statics.field1965];
                int var172 = field1273[Statics.field1965 + 1];
                field1273[++Statics.field1965 - 1] = var171 - var172;
                var170 = 1;
            } else if (arg0 == 4002) {
                Statics.field1965 -= 2;
                int var173 = field1273[Statics.field1965];
                int var174 = field1273[Statics.field1965 + 1];
                field1273[++Statics.field1965 - 1] = var173 * var174;
                var170 = 1;
            } else if (arg0 == 4003) {
                Statics.field1965 -= 2;
                int var175 = field1273[Statics.field1965];
                int var176 = field1273[Statics.field1965 + 1];
                field1273[++Statics.field1965 - 1] = var175 / var176;
                var170 = 1;
            } else if (arg0 == 4004) {
                int var177 = field1273[--Statics.field1965];
                field1273[++Statics.field1965 - 1] = (int) (Math.random() * (double) var177);
                var170 = 1;
            } else if (arg0 == 4005) {
                int var178 = field1273[--Statics.field1965];
                field1273[++Statics.field1965 - 1] = (int) (Math.random() * (double) (var178 + 1));
                var170 = 1;
            } else if (arg0 == 4006) {
                Statics.field1965 -= 5;
                int var179 = field1273[Statics.field1965];
                int var180 = field1273[Statics.field1965 + 1];
                int var181 = field1273[Statics.field1965 + 2];
                int var182 = field1273[Statics.field1965 + 3];
                int var183 = field1273[Statics.field1965 + 4];
                field1273[++Statics.field1965 - 1] = (var180 - var179) * (var183 - var181) / (var182 - var181) + var179;
                var170 = 1;
            } else if (arg0 == 4007) {
                Statics.field1965 -= 2;
                int var184 = field1273[Statics.field1965];
                int var185 = field1273[Statics.field1965 + 1];
                field1273[++Statics.field1965 - 1] = var184 * var185 / 100 + var184;
                var170 = 1;
            } else if (arg0 == 4008) {
                Statics.field1965 -= 2;
                int var186 = field1273[Statics.field1965];
                int var187 = field1273[Statics.field1965 + 1];
                field1273[++Statics.field1965 - 1] = var186 | 0x1 << var187;
                var170 = 1;
            } else if (arg0 == 4009) {
                Statics.field1965 -= 2;
                int var188 = field1273[Statics.field1965];
                int var189 = field1273[Statics.field1965 + 1];
                field1273[++Statics.field1965 - 1] = var188 & -1 - (0x1 << var189);
                var170 = 1;
            } else if (arg0 == 4010) {
                Statics.field1965 -= 2;
                int var190 = field1273[Statics.field1965];
                int var191 = field1273[Statics.field1965 + 1];
                field1273[++Statics.field1965 - 1] = (var190 & 0x1 << var191) == 0 ? 0 : 1;
                var170 = 1;
            } else if (arg0 == 4011) {
                Statics.field1965 -= 2;
                int var192 = field1273[Statics.field1965];
                int var193 = field1273[Statics.field1965 + 1];
                field1273[++Statics.field1965 - 1] = var192 % var193;
                var170 = 1;
            } else if (arg0 == 4012) {
                Statics.field1965 -= 2;
                int var194 = field1273[Statics.field1965];
                int var195 = field1273[Statics.field1965 + 1];
                if (var194 == 0) {
                    field1273[++Statics.field1965 - 1] = 0;
                } else {
                    field1273[++Statics.field1965 - 1] = (int) Math.pow((double) var194, (double) var195);
                }
                var170 = 1;
            } else if (arg0 == 4013) {
                Statics.field1965 -= 2;
                int var196 = field1273[Statics.field1965];
                int var197 = field1273[Statics.field1965 + 1];
                if (var196 == 0) {
                    field1273[++Statics.field1965 - 1] = 0;
                    var170 = 1;
                } else {
                    switch(var197) {
                        case 0:
                            field1273[++Statics.field1965 - 1] = Integer.MAX_VALUE;
                            break;
                        case 1:
                            field1273[++Statics.field1965 - 1] = var196;
                            break;
                        case 2:
                            field1273[++Statics.field1965 - 1] = (int) Math.sqrt((double) var196);
                            break;
                        case 3:
                            field1273[++Statics.field1965 - 1] = (int) Math.cbrt((double) var196);
                            break;
                        case 4:
                            field1273[++Statics.field1965 - 1] = (int) Math.sqrt(Math.sqrt((double) var196));
                            break;
                        default:
                            field1273[++Statics.field1965 - 1] = (int) Math.pow((double) var196, 1.0D / (double) var197);
                    }
                    var170 = 1;
                }
            } else if (arg0 == 4014) {
                Statics.field1965 -= 2;
                int var198 = field1273[Statics.field1965];
                int var199 = field1273[Statics.field1965 + 1];
                field1273[++Statics.field1965 - 1] = var198 & var199;
                var170 = 1;
            } else if (arg0 == 4015) {
                Statics.field1965 -= 2;
                int var200 = field1273[Statics.field1965];
                int var201 = field1273[Statics.field1965 + 1];
                field1273[++Statics.field1965 - 1] = var200 | var201;
                var170 = 1;
            } else if (arg0 == 4018) {
                Statics.field1965 -= 3;
                long var202 = (long) field1273[Statics.field1965];
                long var204 = (long) field1273[Statics.field1965 + 1];
                long var206 = (long) field1273[Statics.field1965 + 2];
                field1273[++Statics.field1965 - 1] = (int) (var202 * var206 / var204);
                var170 = 1;
            } else {
                var170 = 2;
            }
            return var170;
        } else if (arg0 < 4200) {
            byte var210;
            if (arg0 == 4100) {
                String var208 = field1282[--Statics.field1234];
                int var209 = field1273[--Statics.field1965];
                field1282[++Statics.field1234 - 1] = var208 + var209;
                var210 = 1;
            } else if (arg0 == 4101) {
                Statics.field1234 -= 2;
                String var211 = field1282[Statics.field1234];
                String var212 = field1282[Statics.field1234 + 1];
                field1282[++Statics.field1234 - 1] = var211 + var212;
                var210 = 1;
            } else if (arg0 == 4102) {
                String var213 = field1282[--Statics.field1234];
                int var214 = field1273[--Statics.field1965];
                String[] var215 = field1282;
                int var216 = ++Statics.field1234 - 1;
                String var218;
                if (var214 < 0) {
                    var218 = Integer.toString(var214);
                } else {
                    int var219 = var214;
                    String var220;
                    if (var214 < 0) {
                        var220 = Integer.toString(var214, 10);
                    } else {
                        int var221 = 2;
                        int var222 = var214 / 10;
                        while (var222 != 0) {
                            var222 /= 10;
                            var221++;
                        }
                        char[] var223 = new char[var221];
                        var223[0] = '+';
                        for (int var224 = var221 - 1; var224 > 0; var224--) {
                            int var225 = var219;
                            var219 /= 10;
                            int var226 = var225 - var219 * 10;
                            if (var226 >= 10) {
                                var223[var224] = (char) (var226 + 87);
                            } else {
                                var223[var224] = (char) (var226 + 48);
                            }
                        }
                        var220 = new String(var223);
                    }
                    var218 = var220;
                }
                var215[var216] = var213 + var218;
                var210 = 1;
            } else if (arg0 == 4103) {
                String var227 = field1282[--Statics.field1234];
                field1282[++Statics.field1234 - 1] = var227.toLowerCase();
                var210 = 1;
            } else if (arg0 == 4104) {
                int var228 = field1273[--Statics.field1965];
                long var229 = ((long) var228 + 11745L) * 86400000L;
                field1269.setTime(new Date(var229));
                int var231 = field1269.get(5);
                int var232 = field1269.get(2);
                int var233 = field1269.get(1);
                field1282[++Statics.field1234 - 1] = var231 + "-" + field1278[var232] + "-" + var233;
                var210 = 1;
            } else if (arg0 == 4105) {
                Statics.field1234 -= 2;
                String var234 = field1282[Statics.field1234];
                String var235 = field1282[Statics.field1234 + 1];
                if (Statics.field260.field821 != null && Statics.field260.field821.field2783) {
                    field1282[++Statics.field1234 - 1] = var235;
                } else {
                    field1282[++Statics.field1234 - 1] = var234;
                }
                var210 = 1;
            } else if (arg0 == 4106) {
                int var236 = field1273[--Statics.field1965];
                field1282[++Statics.field1234 - 1] = Integer.toString(var236);
                var210 = 1;
            } else if (arg0 == 4107) {
                Statics.field1234 -= 2;
                int[] var237 = field1273;
                int var238 = ++Statics.field1965 - 1;
                String var239 = field1282[Statics.field1234];
                String var240 = field1282[Statics.field1234 + 1];
                int var241 = client.field864;
                int var242 = var239.length();
                int var243 = var240.length();
                int var244 = 0;
                int var245 = 0;
                byte var246 = 0;
                byte var247 = 0;
                int var248;
                label1693: while (true) {
                    if (var244 - var246 >= var242 && var245 - var247 >= var243) {
                        int var259 = Math.min(var242, var243);
                        for (int var260 = 0; var260 < var259; var260++) {
                            char var263 = var239.charAt(var260);
                            char var264 = var240.charAt(var260);
                            if (var263 != var264 && Character.toUpperCase(var263) != Character.toUpperCase(var264)) {
                                char var265 = Character.toLowerCase(var263);
                                char var266 = Character.toLowerCase(var264);
                                if (var265 != var266) {
                                    var248 = class186.method3051(var265, var241) - class186.method3051(var266, var241);
                                    break label1693;
                                }
                            }
                        }
                        int var267 = var242 - var243;
                        if (var267 != 0) {
                            var248 = var267;
                            break;
                        }
                        for (int var268 = 0; var268 < var259; var268++) {
                            char var269 = var239.charAt(var268);
                            char var270 = var240.charAt(var268);
                            if (var269 != var270) {
                                var248 = class186.method3051(var269, var241) - class186.method3051(var270, var241);
                                break label1693;
                            }
                        }
                        var248 = 0;
                        break;
                    }
                    if (var244 - var246 >= var242) {
                        var248 = -1;
                        break;
                    }
                    if (var245 - var247 >= var243) {
                        var248 = 1;
                        break;
                    }
                    char var249;
                    if (var246 == 0) {
                        var249 = var239.charAt(var244++);
                    } else {
                        var249 = (char) var246;
                        boolean var250 = false;
                    }
                    char var251;
                    if (var247 == 0) {
                        var251 = var240.charAt(var245++);
                    } else {
                        var251 = (char) var247;
                        boolean var252 = false;
                    }
                    byte var253;
                    if (var249 == 198) {
                        var253 = 69;
                    } else if (var249 == 230) {
                        var253 = 101;
                    } else if (var249 == 223) {
                        var253 = 115;
                    } else if (var249 == 338) {
                        var253 = 69;
                    } else if (var249 == 339) {
                        var253 = 101;
                    } else {
                        var253 = 0;
                    }
                    var246 = var253;
                    byte var254;
                    if (var251 == 198) {
                        var254 = 69;
                    } else if (var251 == 230) {
                        var254 = 101;
                    } else if (var251 == 223) {
                        var254 = 115;
                    } else if (var251 == 338) {
                        var254 = 69;
                    } else if (var251 == 339) {
                        var254 = 101;
                    } else {
                        var254 = 0;
                    }
                    var247 = var254;
                    char var255 = class186.method4908(var249, var241);
                    char var256 = class186.method4908(var251, var241);
                    if (var255 != var256 && Character.toUpperCase(var255) != Character.toUpperCase(var256)) {
                        char var257 = Character.toLowerCase(var255);
                        char var258 = Character.toLowerCase(var256);
                        if (var257 != var258) {
                            var248 = class186.method3051(var257, var241) - class186.method3051(var258, var241);
                            break;
                        }
                    }
                }
                var237[var238] = class319.method1550(var248);
                var210 = 1;
            } else if (arg0 == 4108) {
                String var271 = field1282[--Statics.field1234];
                Statics.field1965 -= 2;
                int var272 = field1273[Statics.field1965];
                int var273 = field1273[Statics.field1965 + 1];
                byte[] var274 = Statics.field304.method4190(var273, 0);
                class312 var275 = new class312(var274);
                field1273[++Statics.field1965 - 1] = var275.method5109(var271, var272);
                var210 = 1;
            } else if (arg0 == 4109) {
                String var276 = field1282[--Statics.field1234];
                Statics.field1965 -= 2;
                int var277 = field1273[Statics.field1965];
                int var278 = field1273[Statics.field1965 + 1];
                byte[] var279 = Statics.field304.method4190(var278, 0);
                class312 var280 = new class312(var279);
                field1273[++Statics.field1965 - 1] = var280.method5108(var276, var277);
                var210 = 1;
            } else if (arg0 == 4110) {
                Statics.field1234 -= 2;
                String var281 = field1282[Statics.field1234];
                String var282 = field1282[Statics.field1234 + 1];
                if (field1273[--Statics.field1965] == 1) {
                    field1282[++Statics.field1234 - 1] = var281;
                } else {
                    field1282[++Statics.field1234 - 1] = var282;
                }
                var210 = 1;
            } else if (arg0 == 4111) {
                String var283 = field1282[--Statics.field1234];
                field1282[++Statics.field1234 - 1] = class313.method5110(var283);
                var210 = 1;
            } else if (arg0 == 4112) {
                String var284 = field1282[--Statics.field1234];
                int var285 = field1273[--Statics.field1965];
                field1282[++Statics.field1234 - 1] = var284 + (char) var285;
                var210 = 1;
            } else if (arg0 == 4113) {
                int var286 = field1273[--Statics.field1965];
                int[] var287 = field1273;
                int var288 = ++Statics.field1965 - 1;
                char var289 = (char) var286;
                boolean var290;
                if (var289 >= ' ' && var289 <= '~') {
                    var290 = true;
                } else if (var289 >= 160 && var289 <= 255) {
                    var290 = true;
                } else if (var289 == 8364 || var289 == 338 || var289 == 8212 || var289 == 339 || var289 == 376) {
                    var290 = true;
                } else {
                    var290 = false;
                }
                var287[var288] = var290 ? 1 : 0;
                var210 = 1;
            } else if (arg0 == 4114) {
                int var291 = field1273[--Statics.field1965];
                int[] var292 = field1273;
                int var293 = ++Statics.field1965 - 1;
                char var294 = (char) var291;
                boolean var295 = var294 >= '0' && var294 <= '9' || var294 >= 'A' && var294 <= 'Z' || var294 >= 'a' && var294 <= 'z';
                var292[var293] = var295 ? 1 : 0;
                var210 = 1;
            } else if (arg0 == 4115) {
                int var296 = field1273[--Statics.field1965];
                field1273[++Statics.field1965 - 1] = class319.method3136((char) var296) ? 1 : 0;
                var210 = 1;
            } else if (arg0 == 4116) {
                int var297 = field1273[--Statics.field1965];
                field1273[++Statics.field1965 - 1] = class319.method1((char) var297) ? 1 : 0;
                var210 = 1;
            } else if (arg0 == 4117) {
                String var298 = field1282[--Statics.field1234];
                if (var298 == null) {
                    field1273[++Statics.field1965 - 1] = 0;
                } else {
                    field1273[++Statics.field1965 - 1] = var298.length();
                }
                var210 = 1;
            } else if (arg0 == 4118) {
                String var299 = field1282[--Statics.field1234];
                Statics.field1965 -= 2;
                int var300 = field1273[Statics.field1965];
                int var301 = field1273[Statics.field1965 + 1];
                field1282[++Statics.field1234 - 1] = var299.substring(var300, var301);
                var210 = 1;
            } else if (arg0 == 4119) {
                String var302 = field1282[--Statics.field1234];
                StringBuilder var303 = new StringBuilder(var302.length());
                boolean var304 = false;
                for (int var305 = 0; var305 < var302.length(); var305++) {
                    char var306 = var302.charAt(var305);
                    if (var306 == '<') {
                        var304 = true;
                    } else if (var306 == '>') {
                        var304 = false;
                    } else if (!var304) {
                        var303.append(var306);
                    }
                }
                field1282[++Statics.field1234 - 1] = var303.toString();
                var210 = 1;
            } else if (arg0 == 4120) {
                String var307 = field1282[--Statics.field1234];
                int var308 = field1273[--Statics.field1965];
                field1273[++Statics.field1965 - 1] = var307.indexOf(var308);
                var210 = 1;
            } else if (arg0 == 4121) {
                Statics.field1234 -= 2;
                String var309 = field1282[Statics.field1234];
                String var310 = field1282[Statics.field1234 + 1];
                int var311 = field1273[--Statics.field1965];
                field1273[++Statics.field1965 - 1] = var309.indexOf(var310, var311);
                var210 = 1;
            } else {
                var210 = 2;
            }
            return var210;
        } else if (arg0 < 4300) {
            byte var313;
            if (arg0 == 4200) {
                int var312 = field1273[--Statics.field1965];
                field1282[++Statics.field1234 - 1] = class284.method2869(var312).field3645;
                var313 = 1;
            } else if (arg0 == 4201) {
                Statics.field1965 -= 2;
                int var314 = field1273[Statics.field1965];
                int var315 = field1273[Statics.field1965 + 1];
                class284 var316 = class284.method2869(var314);
                if (var315 < 1 || var315 > 5 || var316.field3675[var315 - 1] == null) {
                    field1282[++Statics.field1234 - 1] = "";
                } else {
                    field1282[++Statics.field1234 - 1] = var316.field3675[var315 - 1];
                }
                var313 = 1;
            } else if (arg0 == 4202) {
                Statics.field1965 -= 2;
                int var317 = field1273[Statics.field1965];
                int var318 = field1273[Statics.field1965 + 1];
                class284 var319 = class284.method2869(var317);
                if (var318 < 1 || var318 > 5 || var319.field3660[var318 - 1] == null) {
                    field1282[++Statics.field1234 - 1] = "";
                } else {
                    field1282[++Statics.field1234 - 1] = var319.field3660[var318 - 1];
                }
                var313 = 1;
            } else if (arg0 == 4203) {
                int var320 = field1273[--Statics.field1965];
                field1273[++Statics.field1965 - 1] = class284.method2869(var320).field3657;
                var313 = 1;
            } else if (arg0 == 4204) {
                int var321 = field1273[--Statics.field1965];
                field1273[++Statics.field1965 - 1] = class284.method2869(var321).field3666 == 1 ? 1 : 0;
                var313 = 1;
            } else if (arg0 == 4205) {
                int var322 = field1273[--Statics.field1965];
                class284 var323 = class284.method2869(var322);
                if (var323.field3677 == -1 && var323.field3685 >= 0) {
                    field1273[++Statics.field1965 - 1] = var323.field3685;
                } else {
                    field1273[++Statics.field1965 - 1] = var322;
                }
                var313 = 1;
            } else if (arg0 == 4206) {
                int var324 = field1273[--Statics.field1965];
                class284 var325 = class284.method2869(var324);
                if (var325.field3677 >= 0 && var325.field3685 >= 0) {
                    field1273[++Statics.field1965 - 1] = var325.field3685;
                } else {
                    field1273[++Statics.field1965 - 1] = var324;
                }
                var313 = 1;
            } else if (arg0 == 4207) {
                int var326 = field1273[--Statics.field1965];
                field1273[++Statics.field1965 - 1] = class284.method2869(var326).field3658 ? 1 : 0;
                var313 = 1;
            } else if (arg0 == 4208) {
                int var327 = field1273[--Statics.field1965];
                class284 var328 = class284.method2869(var327);
                if (var328.field3637 == -1 && var328.field3688 >= 0) {
                    field1273[++Statics.field1965 - 1] = var328.field3688;
                } else {
                    field1273[++Statics.field1965 - 1] = var327;
                }
                var313 = 1;
            } else if (arg0 == 4209) {
                int var329 = field1273[--Statics.field1965];
                class284 var330 = class284.method2869(var329);
                if (var330.field3637 >= 0 && var330.field3688 >= 0) {
                    field1273[++Statics.field1965 - 1] = var330.field3688;
                } else {
                    field1273[++Statics.field1965 - 1] = var329;
                }
                var313 = 1;
            } else if (arg0 == 4210) {
                String var331 = field1282[--Statics.field1234];
                int var332 = field1273[--Statics.field1965];
                client.method65(var331, var332 == 1);
                field1273[++Statics.field1965 - 1] = Statics.field1790;
                var313 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field341 == null || Statics.field1244 >= Statics.field1790) {
                    field1273[++Statics.field1965 - 1] = -1;
                } else {
                    field1273[++Statics.field1965 - 1] = Statics.field341[++Statics.field1244 - 1] & 0xFFFF;
                }
                var313 = 1;
            } else if (arg0 == 4212) {
                Statics.field1244 = 0;
                var313 = 1;
            } else {
                var313 = 2;
            }
            return var313;
        } else if (arg0 < 5100) {
            return method3443(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            byte var336;
            if (arg0 == 5306) {
                int[] var333 = field1273;
                int var334 = ++Statics.field1965 - 1;
                int var335 = client.field1070 ? 2 : 1;
                var333[var334] = var335;
                var336 = 1;
            } else if (arg0 == 5307) {
                int var337 = field1273[--Statics.field1965];
                if (var337 == 1 || var337 == 2) {
                    client.method1713(var337);
                }
                var336 = 1;
            } else if (arg0 == 5308) {
                field1273[++Statics.field1965 - 1] = Statics.field565.field1240;
                var336 = 1;
            } else if (arg0 == 5309) {
                int var338 = field1273[--Statics.field1965];
                if (var338 == 1 || var338 == 2) {
                    Statics.field565.field1240 = var338;
                    class79.method612();
                }
                var336 = 1;
            } else {
                var336 = 2;
            }
            return var336;
        } else if (arg0 < 5600) {
            byte var344;
            if (arg0 == 5504) {
                Statics.field1965 -= 2;
                int var342 = field1273[Statics.field1965];
                int var343 = field1273[Statics.field1965 + 1];
                if (!client.field1100) {
                    client.field881 = var342;
                    client.field926 = var343;
                }
                var344 = 1;
            } else if (arg0 == 5505) {
                field1273[++Statics.field1965 - 1] = client.field881;
                var344 = 1;
            } else if (arg0 == 5506) {
                field1273[++Statics.field1965 - 1] = client.field926;
                var344 = 1;
            } else if (arg0 == 5530) {
                int var345 = field1273[--Statics.field1965];
                if (var345 < 0) {
                    var345 = 0;
                }
                client.field932 = var345;
                var344 = 1;
            } else if (arg0 == 5531) {
                field1273[++Statics.field1965 - 1] = client.field932;
                var344 = 1;
            } else {
                var344 = 2;
            }
            return var344;
        } else if (arg0 < 5700) {
            return method2032(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            byte var346;
            if (arg0 == 6200) {
                Statics.field1965 -= 2;
                client.field1106 = (short) field1273[Statics.field1965];
                if (client.field1106 <= 0) {
                    client.field1106 = 256;
                }
                client.field1107 = (short) field1273[Statics.field1965 + 1];
                if (client.field1107 <= 0) {
                    client.field1107 = 205;
                }
                var346 = 1;
            } else if (arg0 == 6201) {
                Statics.field1965 -= 2;
                client.field877 = (short) field1273[Statics.field1965];
                if (client.field877 <= 0) {
                    client.field877 = 256;
                }
                client.field1109 = (short) field1273[Statics.field1965 + 1];
                if (client.field1109 <= 0) {
                    client.field1109 = 320;
                }
                var346 = 1;
            } else if (arg0 == 6202) {
                Statics.field1965 -= 4;
                client.field927 = (short) field1273[Statics.field1965];
                if (client.field927 <= 0) {
                    client.field927 = 1;
                }
                client.field882 = (short) field1273[Statics.field1965 + 1];
                if (client.field882 <= 0) {
                    client.field882 = 32767;
                } else if (client.field882 < client.field927) {
                    client.field882 = client.field927;
                }
                client.field1112 = (short) field1273[Statics.field1965 + 2];
                if (client.field1112 <= 0) {
                    client.field1112 = 1;
                }
                client.field1113 = (short) field1273[Statics.field1965 + 3];
                if (client.field1113 <= 0) {
                    client.field1113 = 32767;
                } else if (client.field1113 < client.field1112) {
                    client.field1113 = client.field1112;
                }
                var346 = 1;
            } else if (arg0 == 6203) {
                if (client.field1027 == null) {
                    field1273[++Statics.field1965 - 1] = -1;
                    field1273[++Statics.field1965 - 1] = -1;
                } else {
                    client.method1774(0, 0, client.field1027.field2827, client.field1027.field2888, false);
                    field1273[++Statics.field1965 - 1] = client.field944;
                    field1273[++Statics.field1965 - 1] = client.field907;
                }
                var346 = 1;
            } else if (arg0 == 6204) {
                field1273[++Statics.field1965 - 1] = client.field877;
                field1273[++Statics.field1965 - 1] = client.field1109;
                var346 = 1;
            } else if (arg0 == 6205) {
                field1273[++Statics.field1965 - 1] = client.field1106;
                field1273[++Statics.field1965 - 1] = client.field1107;
                var346 = 1;
            } else {
                var346 = 2;
            }
            return var346;
        } else if (arg0 < 6600) {
            return method1466(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method485(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("r.j(ILcx;ZI)I")
    public static int method48(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1965 -= 3;
            int var3 = field1273[Statics.field1965];
            int var4 = field1273[Statics.field1965 + 1];
            int var5 = field1273[Statics.field1965 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class243 var6 = class243.method3(var3);
            if (var6.field2939 == null) {
                var6.field2939 = new class243[var5 + 1];
            }
            if (var6.field2939.length <= var5) {
                class243[] var7 = new class243[var5 + 1];
                for (int var8 = 0; var8 < var6.field2939.length; var8++) {
                    var7[var8] = var6.field2939[var8];
                }
                var6.field2939 = var7;
            }
            if (var5 > 0 && var6.field2939[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class243 var9 = new class243();
            var9.field2851 = var4;
            var9.field2886 = var9.field2815 = var6.field2815;
            var9.field2816 = var5;
            var9.field2814 = true;
            var6.field2939[var5] = var9;
            if (arg2) {
                Statics.field4074 = var9;
            } else {
                Statics.field714 = var9;
            }
            client.method260(var6);
            return 1;
        } else if (arg0 == 101) {
            class243 var10 = arg2 ? Statics.field4074 : Statics.field714;
            class243 var11 = class243.method3(var10.field2815);
            var11.field2939[var10.field2816] = null;
            client.method260(var11);
            return 1;
        } else if (arg0 == 102) {
            class243 var12 = class243.method3(field1273[--Statics.field1965]);
            var12.field2939 = null;
            client.method260(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1965 -= 2;
            int var13 = field1273[Statics.field1965];
            int var14 = field1273[Statics.field1965 + 1];
            class243 var15 = class243.method3126(var13, var14);
            if (var15 == null || var14 == -1) {
                field1273[++Statics.field1965 - 1] = 0;
            } else {
                field1273[++Statics.field1965 - 1] = 1;
                if (arg2) {
                    Statics.field4074 = var15;
                } else {
                    Statics.field714 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class243 var16 = class243.method3(field1273[--Statics.field1965]);
            if (var16 == null) {
                field1273[++Statics.field1965 - 1] = 0;
            } else {
                field1273[++Statics.field1965 - 1] = 1;
                if (arg2) {
                    Statics.field4074 = var16;
                } else {
                    Statics.field714 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cx.k(ILcx;ZS)I")
    public static int method1868(int arg0, class97 arg1, boolean arg2) {
        int var3 = -1;
        class243 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1273[--Statics.field1965];
            var4 = class243.method3(var3);
        } else {
            var4 = arg2 ? Statics.field4074 : Statics.field714;
        }
        if (arg0 == 1000) {
            Statics.field1965 -= 4;
            var4.field2824 = field1273[Statics.field1965];
            var4.field2804 = field1273[Statics.field1965 + 1];
            var4.field2820 = field1273[Statics.field1965 + 2];
            var4.field2821 = field1273[Statics.field1965 + 3];
            client.method260(var4);
            Statics.field240.method1105(var4);
            if (var3 != -1 && var4.field2851 == 0) {
                client.method519(Statics.field2520[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1965 -= 4;
            var4.field2826 = field1273[Statics.field1965];
            var4.field2890 = field1273[Statics.field1965 + 1];
            var4.field2822 = field1273[Statics.field1965 + 2];
            var4.field2823 = field1273[Statics.field1965 + 3];
            client.method260(var4);
            Statics.field240.method1105(var4);
            if (var3 != -1 && var4.field2851 == 0) {
                client.method519(Statics.field2520[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1273[--Statics.field1965] == 1;
            if (var4.field2835 != var5) {
                var4.field2835 = var5;
                client.method260(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2868 = field1273[--Statics.field1965] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2949 = field1273[--Statics.field1965] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ev.x(ILcx;ZI)I")
    public static int method2662(int arg0, class97 arg1, boolean arg2) {
        int var3 = -1;
        class243 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1273[--Statics.field1965];
            var4 = class243.method3(var3);
        } else {
            var4 = arg2 ? Statics.field4074 : Statics.field714;
        }
        if (arg0 == 1100) {
            Statics.field1965 -= 2;
            var4.field2836 = field1273[Statics.field1965];
            if (var4.field2836 > var4.field2850 - var4.field2827) {
                var4.field2836 = var4.field2850 - var4.field2827;
            }
            if (var4.field2836 < 0) {
                var4.field2836 = 0;
            }
            var4.field2837 = field1273[Statics.field1965 + 1];
            if (var4.field2837 > var4.field2839 - var4.field2888) {
                var4.field2837 = var4.field2839 - var4.field2888;
            }
            if (var4.field2837 < 0) {
                var4.field2837 = 0;
            }
            client.method260(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2840 = field1273[--Statics.field1965];
            client.method260(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2844 = field1273[--Statics.field1965] == 1;
            client.method260(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2846 = field1273[--Statics.field1965];
            client.method260(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2848 = field1273[--Statics.field1965];
            client.method260(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2894 = field1273[--Statics.field1965];
            client.method260(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2852 = field1273[--Statics.field1965];
            client.method260(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2853 = field1273[--Statics.field1965] == 1;
            client.method260(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2858 = 1;
            var4.field2924 = field1273[--Statics.field1965];
            client.method260(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1965 -= 6;
            var4.field2855 = field1273[Statics.field1965];
            var4.field2865 = field1273[Statics.field1965 + 1];
            var4.field2866 = field1273[Statics.field1965 + 2];
            var4.field2867 = field1273[Statics.field1965 + 3];
            var4.field2825 = field1273[Statics.field1965 + 4];
            var4.field2869 = field1273[Statics.field1965 + 5];
            client.method260(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1273[--Statics.field1965];
            if (var4.field2832 != var5) {
                var4.field2832 = var5;
                var4.field2838 = 0;
                var4.field2807 = 0;
                client.method260(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2830 = field1273[--Statics.field1965] == 1;
            client.method260(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1282[--Statics.field1234];
            if (!var6.equals(var4.field2877)) {
                var4.field2877 = var6;
                client.method260(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2874 = field1273[--Statics.field1965];
            client.method260(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1965 -= 3;
            var4.field2878 = field1273[Statics.field1965];
            var4.field2930 = field1273[Statics.field1965 + 1];
            var4.field2805 = field1273[Statics.field1965 + 2];
            client.method260(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2880 = field1273[--Statics.field1965] == 1;
            client.method260(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2854 = field1273[--Statics.field1965];
            client.method260(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2875 = field1273[--Statics.field1965];
            client.method260(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2849 = field1273[--Statics.field1965] == 1;
            client.method260(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2857 = field1273[--Statics.field1965] == 1;
            client.method260(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1965 -= 2;
            var4.field2850 = field1273[Statics.field1965];
            var4.field2839 = field1273[Statics.field1965 + 1];
            client.method260(var4);
            if (var3 != -1 && var4.field2851 == 0) {
                client.method519(Statics.field2520[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method1869(var4.field2815, var4.field2816);
            client.field1103 = var4;
            client.method260(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2856 = field1273[--Statics.field1965];
            client.method260(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2921 = field1273[--Statics.field1965];
            client.method260(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2847 = field1273[--Statics.field1965];
            client.method260(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1273[--Statics.field1965];
            class330 var8 = (class330) class190.method578(class330.method2041(), var7);
            if (var8 != null) {
                var4.field2897 = var8;
                client.method260(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field1273[--Statics.field1965] == 1;
            var4.field2898 = var9;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("p.z(ILcx;ZI)I")
    public static int method40(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method3(field1273[--Statics.field1965]);
        } else {
            var3 = arg2 ? Statics.field4074 : Statics.field714;
        }
        client.method260(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1965 -= 2;
            int var4 = field1273[Statics.field1965];
            int var5 = field1273[Statics.field1965 + 1];
            var3.field2935 = var4;
            var3.field2936 = var5;
            class284 var6 = class284.method2869(var4);
            var3.field2866 = var6.field3669;
            var3.field2867 = var6.field3641;
            var3.field2825 = var6.field3648;
            var3.field2855 = var6.field3654;
            var3.field2865 = var6.field3655;
            var3.field2869 = var6.field3650;
            if (arg0 == 1205) {
                var3.field2873 = 0;
            } else if (arg0 == 1212 | var6.field3666 == 1) {
                var3.field2873 = 1;
            } else {
                var3.field2873 = 2;
            }
            if (var3.field2870 > 0) {
                var3.field2869 = var3.field2869 * 32 / var3.field2870;
            } else if (var3.field2826 > 0) {
                var3.field2869 = var3.field2869 * 32 / var3.field2826;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2858 = 2;
            var3.field2924 = field1273[--Statics.field1965];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2858 = 3;
            var3.field2924 = Statics.field260.field821.method4070();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bn.p(ILcx;ZI)I")
    public static int method1000(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method3(field1273[--Statics.field1965]);
        } else {
            var3 = arg2 ? Statics.field4074 : Statics.field714;
        }
        if (arg0 == 1300) {
            int var4 = field1273[--Statics.field1965] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method4111(var4, field1282[--Statics.field1234]);
                return 1;
            } else {
                Statics.field1234--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1965 -= 2;
            int var5 = field1273[Statics.field1965];
            int var6 = field1273[Statics.field1965 + 1];
            var3.field2914 = class243.method3126(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2872 = field1273[--Statics.field1965] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2891 = field1273[--Statics.field1965];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2892 = field1273[--Statics.field1965];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2883 = field1282[--Statics.field1234];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2864 = field1282[--Statics.field1234];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2889 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ei.w(ILcx;ZI)I")
    public static int method2576(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method3(field1273[--Statics.field1965]);
        } else {
            var3 = arg2 ? Statics.field4074 : Statics.field714;
        }
        String var4 = field1282[--Statics.field1234];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1273[--Statics.field1965];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1273[--Statics.field1965];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1282[--Statics.field1234];
            } else {
                var7[var8] = Integer.valueOf(field1273[--Statics.field1965]);
            }
        }
        int var9 = field1273[--Statics.field1965];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2828 = var7;
        } else if (arg0 == 1401) {
            var3.field2900 = var7;
        } else if (arg0 == 1402) {
            var3.field2899 = var7;
        } else if (arg0 == 1403) {
            var3.field2901 = var7;
        } else if (arg0 == 1404) {
            var3.field2903 = var7;
        } else if (arg0 == 1405) {
            var3.field2904 = var7;
        } else if (arg0 == 1406) {
            var3.field2944 = var7;
        } else if (arg0 == 1407) {
            var3.field2908 = var7;
            var3.field2909 = var5;
        } else if (arg0 == 1408) {
            var3.field2860 = var7;
        } else if (arg0 == 1409) {
            var3.field2915 = var7;
        } else if (arg0 == 1410) {
            var3.field2905 = var7;
        } else if (arg0 == 1411) {
            var3.field2834 = var7;
        } else if (arg0 == 1412) {
            var3.field2845 = var7;
        } else if (arg0 == 1414) {
            var3.field2871 = var7;
            var3.field2862 = var5;
        } else if (arg0 == 1415) {
            var3.field2912 = var7;
            var3.field2913 = var5;
        } else if (arg0 == 1416) {
            var3.field2906 = var7;
        } else if (arg0 == 1417) {
            var3.field2916 = var7;
        } else if (arg0 == 1418) {
            var3.field2917 = var7;
        } else if (arg0 == 1419) {
            var3.field2919 = var7;
        } else if (arg0 == 1420) {
            var3.field2831 = var7;
        } else if (arg0 == 1421) {
            var3.field2920 = var7;
        } else if (arg0 == 1422) {
            var3.field2861 = var7;
        } else if (arg0 == 1423) {
            var3.field2922 = var7;
        } else if (arg0 == 1424) {
            var3.field2923 = var7;
        } else if (arg0 == 1425) {
            var3.field2925 = var7;
        } else if (arg0 == 1426) {
            var3.field2926 = var7;
        } else if (arg0 == 1427) {
            var3.field2895 = var7;
        } else {
            return 2;
        }
        var3.field2938 = true;
        return 1;
    }

    @ObfuscatedName("q.r(ILcx;ZB)I")
    public static int method175(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = arg2 ? Statics.field4074 : Statics.field714;
        if (arg0 == 1700) {
            field1273[++Statics.field1965 - 1] = var3.field2935;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2935 == -1) {
                field1273[++Statics.field1965 - 1] = 0;
            } else {
                field1273[++Statics.field1965 - 1] = var3.field2936;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1273[++Statics.field1965 - 1] = var3.field2816;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cd.d(ILcx;ZI)I")
    public static int method1661(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method3(field1273[--Statics.field1965]);
        } else {
            var3 = arg2 ? Statics.field4074 : Statics.field714;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1279 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2895 == null) {
            return 0;
        } else {
            class69 var4 = new class69();
            var4.field781 = var3;
            var4.field783 = var3.field2895;
            var4.field789 = field1279 + 1;
            client.field1055.method3716(var4);
            return 1;
        }
    }

    @ObfuscatedName("v.a(ILcx;ZI)I")
    public static int method148(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = class243.method3(field1273[--Statics.field1965]);
        if (arg0 == 2500) {
            field1273[++Statics.field1965 - 1] = var3.field2948;
            return 1;
        } else if (arg0 == 2501) {
            field1273[++Statics.field1965 - 1] = var3.field2829;
            return 1;
        } else if (arg0 == 2502) {
            field1273[++Statics.field1965 - 1] = var3.field2827;
            return 1;
        } else if (arg0 == 2503) {
            field1273[++Statics.field1965 - 1] = var3.field2888;
            return 1;
        } else if (arg0 == 2504) {
            field1273[++Statics.field1965 - 1] = var3.field2835 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1273[++Statics.field1965 - 1] = var3.field2886;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ag.b(ILcx;ZI)I")
    public static int method565(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = class243.method3(field1273[--Statics.field1965]);
        if (arg0 == 2600) {
            field1273[++Statics.field1965 - 1] = var3.field2836;
            return 1;
        } else if (arg0 == 2601) {
            field1273[++Statics.field1965 - 1] = var3.field2837;
            return 1;
        } else if (arg0 == 2602) {
            field1282[++Statics.field1234 - 1] = var3.field2877;
            return 1;
        } else if (arg0 == 2603) {
            field1273[++Statics.field1965 - 1] = var3.field2850;
            return 1;
        } else if (arg0 == 2604) {
            field1273[++Statics.field1965 - 1] = var3.field2839;
            return 1;
        } else if (arg0 == 2605) {
            field1273[++Statics.field1965 - 1] = var3.field2869;
            return 1;
        } else if (arg0 == 2606) {
            field1273[++Statics.field1965 - 1] = var3.field2866;
            return 1;
        } else if (arg0 == 2607) {
            field1273[++Statics.field1965 - 1] = var3.field2825;
            return 1;
        } else if (arg0 == 2608) {
            field1273[++Statics.field1965 - 1] = var3.field2867;
            return 1;
        } else if (arg0 == 2609) {
            field1273[++Statics.field1965 - 1] = var3.field2846;
            return 1;
        } else if (arg0 == 2610) {
            field1273[++Statics.field1965 - 1] = var3.field2847;
            return 1;
        } else if (arg0 == 2611) {
            field1273[++Statics.field1965 - 1] = var3.field2840;
            return 1;
        } else if (arg0 == 2612) {
            field1273[++Statics.field1965 - 1] = var3.field2921;
            return 1;
        } else if (arg0 == 2613) {
            field1273[++Statics.field1965 - 1] = var3.field2897.method8();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ip.h(ILcx;ZB)I")
    public static int method4089(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class243 var3 = class243.method3(field1273[--Statics.field1965]);
            field1273[++Statics.field1965 - 1] = var3.field2935;
            return 1;
        } else if (arg0 == 2701) {
            class243 var4 = class243.method3(field1273[--Statics.field1965]);
            if (var4.field2935 == -1) {
                field1273[++Statics.field1965 - 1] = 0;
            } else {
                field1273[++Statics.field1965 - 1] = var4.field2936;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1273[--Statics.field1965];
            class68 var6 = (class68) client.field1018.method3677((long) var5);
            if (var6 == null) {
                field1273[++Statics.field1965 - 1] = 0;
            } else {
                field1273[++Statics.field1965 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1273[++Statics.field1965 - 1] = client.field1017;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.n(ILcx;ZI)I")
    public static int method1449(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = class243.method3(field1273[--Statics.field1965]);
        if (arg0 == 2800) {
            int[] var4 = field1273;
            int var5 = ++Statics.field1965 - 1;
            int var6 = client.method580(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 2801) {
            int var8 = field1273[--Statics.field1965];
            int var9 = var8 - 1;
            if (var3.field2889 == null || var9 >= var3.field2889.length || var3.field2889[var9] == null) {
                field1282[++Statics.field1234 - 1] = "";
            } else {
                field1282[++Statics.field1234 - 1] = var3.field2889[var9];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2883 == null) {
                field1282[++Statics.field1234 - 1] = "";
            } else {
                field1282[++Statics.field1234 - 1] = var3.field2883;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eo.u(ILcx;ZB)I")
    public static int method2903(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1965 -= 3;
            Statics.method4174(field1273[Statics.field1965], field1273[Statics.field1965 + 1], field1273[Statics.field1965 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            int var3 = field1273[--Statics.field1965];
            if (var3 == -1 && !client.field1091) {
                Statics.field2680.method3836();
                class230.field2681 = 1;
                Statics.field715 = null;
            } else if (var3 != -1 && client.field1090 != var3 && client.field1045 != 0 && !client.field1091) {
                class230.method2297(2, Statics.field13, var3, 0, client.field1045, false);
            }
            client.field1090 = var3;
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1965 -= 2;
            client.method1856(field1273[Statics.field1965], field1273[Statics.field1965 + 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("as.q(ILcx;ZI)I")
    public static int method311(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field1965 -= 2;
            int var3 = field1273[Statics.field1965];
            int var4 = field1273[Statics.field1965 + 1];
            class281 var5 = (class281) class281.field3557.method3625((long) var3);
            class281 var6;
            if (var5 == null) {
                byte[] var7 = Statics.field3554.method4190(8, var3);
                class281 var8 = new class281();
                if (var7 != null) {
                    var8.method4581(new class195(var7));
                }
                class281.field3557.method3628(var8, (long) var3);
                var6 = var8;
            } else {
                var6 = var5;
            }
            class281 var9 = var6;
            if (var6.field3556 != 's') {
            }
            for (int var10 = 0; var10 < var9.field3562; var10++) {
                if (var9.field3560[var10] == var4) {
                    field1282[++Statics.field1234 - 1] = var9.field3553[var10];
                    var9 = null;
                    break;
                }
            }
            if (var9 != null) {
                field1282[++Statics.field1234 - 1] = var9.field3559;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field1965 -= 4;
            int var11 = field1273[Statics.field1965];
            int var12 = field1273[Statics.field1965 + 1];
            int var13 = field1273[Statics.field1965 + 2];
            int var14 = field1273[Statics.field1965 + 3];
            class281 var15 = (class281) class281.field3557.method3625((long) var13);
            class281 var16;
            if (var15 == null) {
                byte[] var17 = Statics.field3554.method4190(8, var13);
                class281 var18 = new class281();
                if (var17 != null) {
                    var18.method4581(new class195(var17));
                }
                class281.field3557.method3628(var18, (long) var13);
                var16 = var18;
            } else {
                var16 = var15;
            }
            class281 var19 = var16;
            if (var16.field3555 != var11 || var16.field3556 != var12) {
                if (var12 == 115) {
                    field1282[++Statics.field1234 - 1] = class252.field3012;
                } else {
                    field1273[++Statics.field1965 - 1] = 0;
                }
                return 1;
            }
            for (int var20 = 0; var20 < var19.field3562; var20++) {
                if (var19.field3560[var20] == var14) {
                    if (var12 == 115) {
                        field1282[++Statics.field1234 - 1] = var19.field3553[var20];
                    } else {
                        field1273[++Statics.field1965 - 1] = var19.field3561[var20];
                    }
                    var19 = null;
                    break;
                }
            }
            if (var19 != null) {
                if (var12 == 115) {
                    field1282[++Statics.field1234 - 1] = var19.field3559;
                } else {
                    field1273[++Statics.field1965 - 1] = var19.field3558;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var21 = field1273[--Statics.field1965];
            class281 var22 = (class281) class281.field3557.method3625((long) var21);
            class281 var23;
            if (var22 == null) {
                byte[] var24 = Statics.field3554.method4190(8, var21);
                class281 var25 = new class281();
                if (var24 != null) {
                    var25.method4581(new class195(var24));
                }
                class281.field3557.method3628(var25, (long) var21);
                var23 = var25;
            } else {
                var23 = var22;
            }
            field1273[++Statics.field1965 - 1] = var23.method4576();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("em.g(ILcx;ZB)I")
    public static int method2859(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1273[--Statics.field1965];
            field1273[++Statics.field1965 - 1] = client.field1122[var3].method103();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1273[--Statics.field1965];
            field1273[++Statics.field1965 - 1] = client.field1122[var4].field285;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1273[--Statics.field1965];
            field1273[++Statics.field1965 - 1] = client.field1122[var5].field291;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1273[--Statics.field1965];
            field1273[++Statics.field1965 - 1] = client.field1122[var6].field287;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1273[--Statics.field1965];
            field1273[++Statics.field1965 - 1] = client.field1122[var7].field288;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1273[--Statics.field1965];
            field1273[++Statics.field1965 - 1] = client.field1122[var8].field284;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1273[--Statics.field1965];
            int var10 = client.field1122[var9].method102();
            field1273[++Statics.field1965 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1273[--Statics.field1965];
            int var12 = client.field1122[var11].method102();
            field1273[++Statics.field1965 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1273[--Statics.field1965];
            int var14 = client.field1122[var13].method102();
            field1273[++Statics.field1965 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1273[--Statics.field1965];
            int var16 = client.field1122[var15].method102();
            field1273[++Statics.field1965 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1273[--Statics.field1965] == 1;
            if (Statics.field889 != null) {
                Statics.field889.method75(class14.field269, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1273[--Statics.field1965] == 1;
            if (Statics.field889 != null) {
                Statics.field889.method75(class14.field268, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1965 -= 2;
            boolean var19 = field1273[Statics.field1965] == 1;
            boolean var20 = field1273[Statics.field1965 + 1] == 1;
            if (Statics.field889 != null) {
                client.field1058.field855 = var20;
                Statics.field889.method75(client.field1058, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1273[--Statics.field1965] == 1;
            if (Statics.field889 != null) {
                Statics.field889.method75(class14.field272, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1273[--Statics.field1965] == 1;
            if (Statics.field889 != null) {
                Statics.field889.method75(class14.field271, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1273[++Statics.field1965 - 1] = Statics.field889 == null ? 0 : Statics.field889.field270.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1273[--Statics.field1965];
            class15 var24 = (class15) Statics.field889.field270.get(var23);
            field1273[++Statics.field1965 - 1] = var24.field274;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1273[--Statics.field1965];
            class15 var26 = (class15) Statics.field889.field270.get(var25);
            field1282[++Statics.field1234 - 1] = var26.method82();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1273[--Statics.field1965];
            class15 var28 = (class15) Statics.field889.field270.get(var27);
            field1282[++Statics.field1234 - 1] = var28.method78();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1273[--Statics.field1965];
            class15 var30 = (class15) Statics.field889.field270.get(var29);
            long var31 = class197.method26() - Statics.field3432 - var30.field279;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1282[++Statics.field1234 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1273[--Statics.field1965];
            class15 var38 = (class15) Statics.field889.field270.get(var37);
            field1273[++Statics.field1965 - 1] = var38.field275.field287;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1273[--Statics.field1965];
            class15 var40 = (class15) Statics.field889.field270.get(var39);
            field1273[++Statics.field1965 - 1] = var40.field275.field291;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1273[--Statics.field1965];
            class15 var42 = (class15) Statics.field889.field270.get(var41);
            field1273[++Statics.field1965 - 1] = var42.field275.field285;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gp.y(ILcx;ZB)I")
    public static int method3443(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field1273[++Statics.field1965 - 1] = client.field1072;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field1965 -= 3;
            client.field1072 = field1273[Statics.field1965];
            Statics.field3297 = class321.method998(field1273[Statics.field1965 + 1]);
            if (Statics.field3297 == null) {
                Statics.field3297 = class321.field3931;
            }
            client.field1036 = field1273[Statics.field1965 + 2];
            class185 var3 = class185.method2860(class182.field2434, client.field903.field1476);
            var3.field2501.method3209(client.field1072);
            var3.field2501.method3209(Statics.field3297.field3930);
            var3.field2501.method3209(client.field1036);
            client.field903.method1884(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field1282[--Statics.field1234];
            Statics.field1965 -= 2;
            int var5 = field1273[Statics.field1965];
            int var6 = field1273[Statics.field1965 + 1];
            class185 var7 = class185.method2860(class182.field2463, client.field903.field1476);
            var7.field2501.method3209(class195.method1769(var4) + 2);
            var7.field2501.method3216(var4);
            var7.field2501.method3209(var5 - 1);
            var7.field2501.method3209(var6);
            client.field903.method1884(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field1965 -= 2;
            int var8 = field1273[Statics.field1965];
            int var9 = field1273[Statics.field1965 + 1];
            class71 var10 = Statics.method2(var8, var9);
            if (var10 == null) {
                field1273[++Statics.field1965 - 1] = -1;
                field1273[++Statics.field1965 - 1] = 0;
                field1282[++Statics.field1234 - 1] = "";
                field1282[++Statics.field1234 - 1] = "";
                field1282[++Statics.field1234 - 1] = "";
                field1273[++Statics.field1965 - 1] = 0;
            } else {
                field1273[++Statics.field1965 - 1] = var10.field812;
                field1273[++Statics.field1965 - 1] = var10.field815;
                field1282[++Statics.field1234 - 1] = var10.field807 == null ? "" : var10.field807;
                field1282[++Statics.field1234 - 1] = var10.field808 == null ? "" : var10.field808;
                field1282[++Statics.field1234 - 1] = var10.field813 == null ? "" : var10.field813;
                field1273[++Statics.field1965 - 1] = var10.method1005() ? 1 : (var10.method1008() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field1273[--Statics.field1965];
            class71 var12 = class96.method160(var11);
            if (var12 == null) {
                field1273[++Statics.field1965 - 1] = -1;
                field1273[++Statics.field1965 - 1] = 0;
                field1282[++Statics.field1234 - 1] = "";
                field1282[++Statics.field1234 - 1] = "";
                field1282[++Statics.field1234 - 1] = "";
                field1273[++Statics.field1965 - 1] = 0;
            } else {
                field1273[++Statics.field1965 - 1] = var12.field806;
                field1273[++Statics.field1965 - 1] = var12.field815;
                field1282[++Statics.field1234 - 1] = var12.field807 == null ? "" : var12.field807;
                field1282[++Statics.field1234 - 1] = var12.field808 == null ? "" : var12.field808;
                field1282[++Statics.field1234 - 1] = var12.field813 == null ? "" : var12.field813;
                field1273[++Statics.field1965 - 1] = var12.method1005() ? 1 : (var12.method1008() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field3297 == null) {
                field1273[++Statics.field1965 - 1] = -1;
            } else {
                field1273[++Statics.field1965 - 1] = Statics.field3297.field3930;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field1282[--Statics.field1234];
            int var14 = field1273[--Statics.field1965];
            String var15 = var13.toLowerCase();
            byte var16 = 0;
            if (var15.startsWith(class252.field3189)) {
                var16 = 0;
                var13 = var13.substring(class252.field3189.length());
            } else if (var15.startsWith(class252.field3173)) {
                var16 = 1;
                var13 = var13.substring(class252.field3173.length());
            } else if (var15.startsWith(class252.field3193)) {
                var16 = 2;
                var13 = var13.substring(class252.field3193.length());
            } else if (var15.startsWith(class252.field3195)) {
                var16 = 3;
                var13 = var13.substring(class252.field3195.length());
            } else if (var15.startsWith(class252.field3049)) {
                var16 = 4;
                var13 = var13.substring(class252.field3049.length());
            } else if (var15.startsWith(class252.field3199)) {
                var16 = 5;
                var13 = var13.substring(class252.field3199.length());
            } else if (var15.startsWith(class252.field3201)) {
                var16 = 6;
                var13 = var13.substring(class252.field3201.length());
            } else if (var15.startsWith(class252.field3203)) {
                var16 = 7;
                var13 = var13.substring(class252.field3203.length());
            } else if (var15.startsWith(class252.field3205)) {
                var16 = 8;
                var13 = var13.substring(class252.field3205.length());
            } else if (var15.startsWith(class252.field3222)) {
                var16 = 9;
                var13 = var13.substring(class252.field3222.length());
            } else if (var15.startsWith(class252.field3209)) {
                var16 = 10;
                var13 = var13.substring(class252.field3209.length());
            } else if (var15.startsWith(class252.field3211)) {
                var16 = 11;
                var13 = var13.substring(class252.field3211.length());
            } else if (client.field864 != 0) {
                if (var15.startsWith(class252.field3190)) {
                    var16 = 0;
                    var13 = var13.substring(class252.field3190.length());
                } else if (var15.startsWith(class252.field3192)) {
                    var16 = 1;
                    var13 = var13.substring(class252.field3192.length());
                } else if (var15.startsWith(class252.field3259)) {
                    var16 = 2;
                    var13 = var13.substring(class252.field3259.length());
                } else if (var15.startsWith(class252.field3196)) {
                    var16 = 3;
                    var13 = var13.substring(class252.field3196.length());
                } else if (var15.startsWith(class252.field3198)) {
                    var16 = 4;
                    var13 = var13.substring(class252.field3198.length());
                } else if (var15.startsWith(class252.field3200)) {
                    var16 = 5;
                    var13 = var13.substring(class252.field3200.length());
                } else if (var15.startsWith(class252.field3202)) {
                    var16 = 6;
                    var13 = var13.substring(class252.field3202.length());
                } else if (var15.startsWith(class252.field3232)) {
                    var16 = 7;
                    var13 = var13.substring(class252.field3232.length());
                } else if (var15.startsWith(class252.field3206)) {
                    var16 = 8;
                    var13 = var13.substring(class252.field3206.length());
                } else if (var15.startsWith(class252.field3208)) {
                    var16 = 9;
                    var13 = var13.substring(class252.field3208.length());
                } else if (var15.startsWith(class252.field3210)) {
                    var16 = 10;
                    var13 = var13.substring(class252.field3210.length());
                } else if (var15.startsWith(class252.field3114)) {
                    var16 = 11;
                    var13 = var13.substring(class252.field3114.length());
                }
            }
            String var17 = var13.toLowerCase();
            byte var18 = 0;
            if (var17.startsWith(class252.field3213)) {
                var18 = 1;
                var13 = var13.substring(class252.field3213.length());
            } else if (var17.startsWith(class252.field3125)) {
                var18 = 2;
                var13 = var13.substring(class252.field3125.length());
            } else if (var17.startsWith(class252.field3064)) {
                var18 = 3;
                var13 = var13.substring(class252.field3064.length());
            } else if (var17.startsWith(class252.field3219)) {
                var18 = 4;
                var13 = var13.substring(class252.field3219.length());
            } else if (var17.startsWith(class252.field3221)) {
                var18 = 5;
                var13 = var13.substring(class252.field3221.length());
            } else if (client.field864 != 0) {
                if (var17.startsWith(class252.field3214)) {
                    var18 = 1;
                    var13 = var13.substring(class252.field3214.length());
                } else if (var17.startsWith(class252.field3246)) {
                    var18 = 2;
                    var13 = var13.substring(class252.field3246.length());
                } else if (var17.startsWith(class252.field3091)) {
                    var18 = 3;
                    var13 = var13.substring(class252.field3091.length());
                } else if (var17.startsWith(class252.field3058)) {
                    var18 = 4;
                    var13 = var13.substring(class252.field3058.length());
                } else if (var17.startsWith(class252.field3130)) {
                    var18 = 5;
                    var13 = var13.substring(class252.field3130.length());
                }
            }
            class185 var19 = class185.method2860(class182.field2450, client.field903.field1476);
            var19.field2501.method3209(0);
            int var20 = var19.field2501.field2566;
            var19.field2501.method3209(var14);
            var19.field2501.method3209(var16);
            var19.field2501.method3209(var18);
            class314.method4740(var19.field2501, var13);
            var19.field2501.method3222(var19.field2501.field2566 - var20);
            client.field903.method1884(var19);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1234 -= 2;
            String var21 = field1282[Statics.field1234];
            String var22 = field1282[Statics.field1234 + 1];
            class185 var23 = class185.method2860(class182.field2441, client.field903.field1476);
            var23.field2501.method3210(0);
            int var24 = var23.field2501.field2566;
            var23.field2501.method3216(var21);
            class314.method4740(var23.field2501, var22);
            var23.field2501.method3221(var23.field2501.field2566 - var24);
            client.field903.method1884(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var25;
            if (Statics.field260 == null || Statics.field260.field824 == null) {
                var25 = "";
            } else {
                var25 = Statics.field260.field824.method5038();
            }
            field1282[++Statics.field1234 - 1] = var25;
            return 1;
        } else if (arg0 == 5016) {
            field1273[++Statics.field1965 - 1] = client.field1036;
            return 1;
        } else if (arg0 == 5017) {
            int var26 = field1273[--Statics.field1965];
            field1273[++Statics.field1965 - 1] = class96.method753(var26);
            return 1;
        } else if (arg0 == 5018) {
            int var27 = field1273[--Statics.field1965];
            int[] var28 = field1273;
            int var29 = ++Statics.field1965 - 1;
            class71 var30 = (class71) class96.field1433.method3603((long) var27);
            int var31;
            if (var30 == null) {
                var31 = -1;
            } else if (class96.field1435.field2667 == var30.field2649) {
                var31 = -1;
            } else {
                var31 = ((class71) var30.field2649).field812;
            }
            var28[var29] = var31;
            return 1;
        } else if (arg0 == 5019) {
            int var32 = field1273[--Statics.field1965];
            field1273[++Statics.field1965 - 1] = class96.method2868(var32);
            return 1;
        } else if (arg0 == 5020) {
            String var33 = field1282[--Statics.field1234];
            if (var33.equalsIgnoreCase("toggleroof")) {
                Statics.field565.field1237 = !Statics.field565.field1237;
                class79.method612();
                if (Statics.field565.field1237) {
                    class96.method3189(99, "", "Roofs are now all hidden");
                } else {
                    class96.method3189(99, "", "Roofs will only be removed selectively");
                }
            }
            if (var33.equalsIgnoreCase("displayfps")) {
                client.field923 = !client.field923;
            }
            if (var33.equalsIgnoreCase("renderself")) {
                client.field975 = !client.field975;
            }
            if (var33.equalsIgnoreCase("mouseovertext")) {
                client.field913 = !client.field913;
            }
            if (client.field1024 >= 2) {
                if (var33.equalsIgnoreCase("aabb")) {
                    if (!class8.field229) {
                        class8.field229 = true;
                        class8.field231 = class12.field253;
                    } else if (class8.field231 == class12.field253) {
                        class8.field229 = true;
                        class8.field231 = class12.field255;
                    } else {
                        class8.field229 = false;
                    }
                }
                if (var33.equalsIgnoreCase("showcoord")) {
                    Statics.field743.field4055 = !Statics.field743.field4055;
                }
                if (var33.equalsIgnoreCase("fpson")) {
                    client.field923 = true;
                }
                if (var33.equalsIgnoreCase("fpsoff")) {
                    client.field923 = false;
                }
                if (var33.equalsIgnoreCase("gc")) {
                    System.gc();
                }
                if (var33.equalsIgnoreCase("clientdrop")) {
                    client.method2902();
                }
                if (var33.equalsIgnoreCase("cs")) {
                    class96.method3189(99, "", "" + client.field906);
                }
                if (var33.equalsIgnoreCase("errortest") && client.field956 == 2) {
                    throw new RuntimeException();
                }
            }
            class185 var34 = class185.method2860(class182.field2384, client.field903.field1476);
            var34.field2501.method3209(var33.length() + 1);
            var34.field2501.method3216(var33);
            client.field903.method1884(var34);
            return 1;
        } else if (arg0 == 5021) {
            client.field870 = field1282[--Statics.field1234].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field1282[++Statics.field1234 - 1] = client.field870;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dz.s(ILcx;ZI)I")
    public static int method2032(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field904 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bg.ac(ILcx;ZI)I")
    public static int method1466(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1273[++Statics.field1965 - 1] = class78.method4354() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class78.field1224 = 0;
            class78 var3;
            if (class78.field1224 < class78.field1223) {
                var3 = Statics.field2059[++class78.field1224 - 1];
            } else {
                var3 = null;
            }
            if (var3 == null) {
                field1273[++Statics.field1965 - 1] = -1;
                field1273[++Statics.field1965 - 1] = 0;
                field1282[++Statics.field1234 - 1] = "";
                field1273[++Statics.field1965 - 1] = 0;
                field1273[++Statics.field1965 - 1] = 0;
                field1282[++Statics.field1234 - 1] = "";
            } else {
                field1273[++Statics.field1965 - 1] = var3.field1231;
                field1273[++Statics.field1965 - 1] = var3.field1219;
                field1282[++Statics.field1234 - 1] = var3.field1226;
                field1273[++Statics.field1965 - 1] = var3.field1232;
                field1273[++Statics.field1965 - 1] = var3.field1229;
                field1282[++Statics.field1234 - 1] = var3.field1228;
            }
            return 1;
        } else if (arg0 == 6502) {
            class78 var6;
            if (class78.field1224 < class78.field1223) {
                var6 = Statics.field2059[++class78.field1224 - 1];
            } else {
                var6 = null;
            }
            if (var6 == null) {
                field1273[++Statics.field1965 - 1] = -1;
                field1273[++Statics.field1965 - 1] = 0;
                field1282[++Statics.field1234 - 1] = "";
                field1273[++Statics.field1965 - 1] = 0;
                field1273[++Statics.field1965 - 1] = 0;
                field1282[++Statics.field1234 - 1] = "";
            } else {
                field1273[++Statics.field1965 - 1] = var6.field1231;
                field1273[++Statics.field1965 - 1] = var6.field1219;
                field1282[++Statics.field1234 - 1] = var6.field1226;
                field1273[++Statics.field1965 - 1] = var6.field1232;
                field1273[++Statics.field1965 - 1] = var6.field1229;
                field1282[++Statics.field1234 - 1] = var6.field1228;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var8 = field1273[--Statics.field1965];
            class78 var9 = null;
            for (int var10 = 0; var10 < class78.field1223; var10++) {
                if (Statics.field2059[var10].field1231 == var8) {
                    var9 = Statics.field2059[var10];
                    break;
                }
            }
            if (var9 == null) {
                field1273[++Statics.field1965 - 1] = -1;
                field1273[++Statics.field1965 - 1] = 0;
                field1282[++Statics.field1234 - 1] = "";
                field1273[++Statics.field1965 - 1] = 0;
                field1273[++Statics.field1965 - 1] = 0;
                field1282[++Statics.field1234 - 1] = "";
            } else {
                field1273[++Statics.field1965 - 1] = var9.field1231;
                field1273[++Statics.field1965 - 1] = var9.field1219;
                field1282[++Statics.field1234 - 1] = var9.field1226;
                field1273[++Statics.field1965 - 1] = var9.field1232;
                field1273[++Statics.field1965 - 1] = var9.field1229;
                field1282[++Statics.field1234 - 1] = var9.field1228;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1965 -= 4;
            int var11 = field1273[Statics.field1965];
            boolean var12 = field1273[Statics.field1965 + 1] == 1;
            int var13 = field1273[Statics.field1965 + 2];
            boolean var14 = field1273[Statics.field1965 + 3] == 1;
            class78.method191(var11, var12, var13, var14);
            return 1;
        } else if (arg0 == 6511) {
            int var15 = field1273[--Statics.field1965];
            if (var15 >= 0 && var15 < class78.field1223) {
                class78 var16 = Statics.field2059[var15];
                field1273[++Statics.field1965 - 1] = var16.field1231;
                field1273[++Statics.field1965 - 1] = var16.field1219;
                field1282[++Statics.field1234 - 1] = var16.field1226;
                field1273[++Statics.field1965 - 1] = var16.field1232;
                field1273[++Statics.field1965 - 1] = var16.field1229;
                field1282[++Statics.field1234 - 1] = var16.field1228;
            } else {
                field1273[++Statics.field1965 - 1] = -1;
                field1273[++Statics.field1965 - 1] = 0;
                field1282[++Statics.field1234 - 1] = "";
                field1273[++Statics.field1965 - 1] = 0;
                field1273[++Statics.field1965 - 1] = 0;
                field1282[++Statics.field1234 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field1095 = field1273[--Statics.field1965] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1965 -= 2;
            int var17 = field1273[Statics.field1965];
            int var18 = field1273[Statics.field1965 + 1];
            class279 var19 = class279.method1444(var18);
            if (var19.method4534()) {
                field1282[++Statics.field1234 - 1] = class286.method995(var17).method4754(var18, var19.field3547);
            } else {
                field1273[++Statics.field1965 - 1] = class286.method995(var17).method4753(var18, var19.field3544);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1965 -= 2;
            int var20 = field1273[Statics.field1965];
            int var21 = field1273[Statics.field1965 + 1];
            class279 var22 = class279.method1444(var21);
            if (var22.method4534()) {
                field1282[++Statics.field1234 - 1] = class283.method4185(var20).method4637(var21, var22.field3547);
            } else {
                field1273[++Statics.field1965 - 1] = class283.method4185(var20).method4636(var21, var22.field3544);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1965 -= 2;
            int var23 = field1273[Statics.field1965];
            int var24 = field1273[Statics.field1965 + 1];
            class279 var25 = class279.method1444(var24);
            if (var25.method4534()) {
                field1282[++Statics.field1234 - 1] = class284.method2869(var23).method4695(var24, var25.field3547);
            } else {
                field1273[++Statics.field1965 - 1] = class284.method2869(var23).method4694(var24, var25.field3544);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1965 -= 2;
            int var26 = field1273[Statics.field1965];
            int var27 = field1273[Statics.field1965 + 1];
            class279 var28 = class279.method1444(var27);
            if (var28.method4534()) {
                field1282[++Statics.field1234 - 1] = class280.method1776(var26).method4555(var27, var28.field3547);
            } else {
                field1273[++Statics.field1965 - 1] = class280.method1776(var26).method4554(var27, var28.field3544);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1273[++Statics.field1965 - 1] = 0;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aq.ap(ILcx;ZI)I")
    public static int method485(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field2770;
            int var4 = (Statics.field260.field1186 >> 7) + Statics.field2499;
            int var5 = (Statics.field260.field1210 >> 7) + Statics.field29;
            client.method2904().method5594(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1273[--Statics.field1965];
            String var7 = "";
            class33 var8 = client.method2904().method5596(var6);
            if (var8 != null) {
                var7 = var8.method284();
            }
            field1282[++Statics.field1234 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1273[--Statics.field1965];
            client.method2904().method5599(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1273[++Statics.field1965 - 1] = client.method2904().method5609();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1273[--Statics.field1965];
            client.method2904().method5706(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1273[++Statics.field1965 - 1] = client.method2904().method5611() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class239 var11 = new class239(field1273[--Statics.field1965]);
            client.method2904().method5670(var11.field2775, var11.field2777);
            return 1;
        } else if (arg0 == 6607) {
            class239 var12 = new class239(field1273[--Statics.field1965]);
            client.method2904().method5716(var12.field2775, var12.field2777);
            return 1;
        } else if (arg0 == 6608) {
            class239 var13 = new class239(field1273[--Statics.field1965]);
            client.method2904().method5615(var13.field2780, var13.field2775, var13.field2777);
            return 1;
        } else if (arg0 == 6609) {
            class239 var14 = new class239(field1273[--Statics.field1965]);
            client.method2904().method5769(var14.field2780, var14.field2775, var14.field2777);
            return 1;
        } else if (arg0 == 6610) {
            field1273[++Statics.field1965 - 1] = client.method2904().method5754();
            field1273[++Statics.field1965 - 1] = client.method2904().method5654();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1273[--Statics.field1965];
            class33 var16 = client.method2904().method5596(var15);
            if (var16 == null) {
                field1273[++Statics.field1965 - 1] = 0;
            } else {
                field1273[++Statics.field1965 - 1] = var16.method321().method4036();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1273[--Statics.field1965];
            class33 var18 = client.method2904().method5596(var17);
            if (var18 == null) {
                field1273[++Statics.field1965 - 1] = 0;
                field1273[++Statics.field1965 - 1] = 0;
            } else {
                field1273[++Statics.field1965 - 1] = (var18.method283() - var18.method282() + 1) * 64;
                field1273[++Statics.field1965 - 1] = (var18.method277() - var18.method337() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1273[--Statics.field1965];
            class33 var20 = client.method2904().method5596(var19);
            if (var20 == null) {
                field1273[++Statics.field1965 - 1] = 0;
                field1273[++Statics.field1965 - 1] = 0;
                field1273[++Statics.field1965 - 1] = 0;
                field1273[++Statics.field1965 - 1] = 0;
            } else {
                field1273[++Statics.field1965 - 1] = var20.method282() * 64;
                field1273[++Statics.field1965 - 1] = var20.method337() * 64;
                field1273[++Statics.field1965 - 1] = var20.method283() * 64 + 64 - 1;
                field1273[++Statics.field1965 - 1] = var20.method277() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1273[--Statics.field1965];
            class33 var22 = client.method2904().method5596(var21);
            if (var22 == null) {
                field1273[++Statics.field1965 - 1] = -1;
            } else {
                field1273[++Statics.field1965 - 1] = var22.method316();
            }
            return 1;
        } else if (arg0 == 6615) {
            class239 var23 = client.method2904().method5626();
            if (var23 == null) {
                field1273[++Statics.field1965 - 1] = -1;
                field1273[++Statics.field1965 - 1] = -1;
            } else {
                field1273[++Statics.field1965 - 1] = var23.field2775;
                field1273[++Statics.field1965 - 1] = var23.field2777;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1273[++Statics.field1965 - 1] = client.method2904().method5704();
            return 1;
        } else if (arg0 == 6617) {
            class239 var24 = new class239(field1273[--Statics.field1965]);
            class33 var25 = client.method2904().method5597();
            if (var25 == null) {
                field1273[++Statics.field1965 - 1] = -1;
                field1273[++Statics.field1965 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method273(var24.field2780, var24.field2775, var24.field2777);
            if (var26 == null) {
                field1273[++Statics.field1965 - 1] = -1;
                field1273[++Statics.field1965 - 1] = -1;
            } else {
                field1273[++Statics.field1965 - 1] = var26[0];
                field1273[++Statics.field1965 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class239 var27 = new class239(field1273[--Statics.field1965]);
            class33 var28 = client.method2904().method5597();
            if (var28 == null) {
                field1273[++Statics.field1965 - 1] = -1;
                field1273[++Statics.field1965 - 1] = -1;
                return 1;
            }
            class239 var29 = var28.method318(var27.field2775, var27.field2777);
            if (var29 == null) {
                field1273[++Statics.field1965 - 1] = -1;
            } else {
                field1273[++Statics.field1965 - 1] = var29.method4036();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1965 -= 2;
            int var30 = field1273[Statics.field1965];
            class239 var31 = new class239(field1273[Statics.field1965 + 1]);
            class33 var32 = client.method2904().method5596(var30);
            int var33 = Statics.field260.field843;
            int var34 = (Statics.field260.field1186 >> 7) + Statics.field2499;
            int var35 = (Statics.field260.field1210 >> 7) + Statics.field29;
            class239 var36 = new class239(var33, var34, var35);
            client.method2904().method5775(var32, var36, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1965 -= 2;
            int var37 = field1273[Statics.field1965];
            class239 var38 = new class239(field1273[Statics.field1965 + 1]);
            class33 var39 = client.method2904().method5596(var37);
            int var40 = Statics.field260.field843;
            int var41 = (Statics.field260.field1186 >> 7) + Statics.field2499;
            int var42 = (Statics.field260.field1210 >> 7) + Statics.field29;
            class239 var43 = new class239(var40, var41, var42);
            client.method2904().method5775(var39, var43, var38, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1965 -= 2;
            int var44 = field1273[Statics.field1965];
            class239 var45 = new class239(field1273[Statics.field1965 + 1]);
            class33 var46 = client.method2904().method5596(var44);
            if (var46 == null) {
                field1273[++Statics.field1965 - 1] = 0;
                return 1;
            } else {
                field1273[++Statics.field1965 - 1] = var46.method271(var45.field2780, var45.field2775, var45.field2777) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1273[++Statics.field1965 - 1] = client.method2904().method5746();
            field1273[++Statics.field1965 - 1] = client.method2904().method5657();
            return 1;
        } else if (arg0 == 6623) {
            class239 var47 = new class239(field1273[--Statics.field1965]);
            class33 var48 = client.method2904().method5593(var47.field2780, var47.field2775, var47.field2777);
            if (var48 == null) {
                field1273[++Statics.field1965 - 1] = -1;
            } else {
                field1273[++Statics.field1965 - 1] = var48.method285();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method2904().method5603(field1273[--Statics.field1965]);
            return 1;
        } else if (arg0 == 6625) {
            client.method2904().method5623();
            return 1;
        } else if (arg0 == 6626) {
            client.method2904().method5624(field1273[--Statics.field1965]);
            return 1;
        } else if (arg0 == 6627) {
            client.method2904().method5625();
            return 1;
        } else if (arg0 == 6628) {
            boolean var49 = field1273[--Statics.field1965] == 1;
            client.method2904().method5639(var49);
            return 1;
        } else if (arg0 == 6629) {
            int var50 = field1273[--Statics.field1965];
            client.method2904().method5627(var50);
            return 1;
        } else if (arg0 == 6630) {
            int var51 = field1273[--Statics.field1965];
            client.method2904().method5648(var51);
            return 1;
        } else if (arg0 == 6631) {
            client.method2904().method5629();
            return 1;
        } else if (arg0 == 6632) {
            boolean var52 = field1273[--Statics.field1965] == 1;
            client.method2904().method5630(var52);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1965 -= 2;
            int var53 = field1273[Statics.field1965];
            boolean var54 = field1273[Statics.field1965 + 1] == 1;
            client.method2904().method5631(var53, var54);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1965 -= 2;
            int var55 = field1273[Statics.field1965];
            boolean var56 = field1273[Statics.field1965 + 1] == 1;
            client.method2904().method5632(var55, var56);
            return 1;
        } else if (arg0 == 6635) {
            field1273[++Statics.field1965 - 1] = client.method2904().method5633() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var57 = field1273[--Statics.field1965];
            field1273[++Statics.field1965 - 1] = client.method2904().method5634(var57) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var58 = field1273[--Statics.field1965];
            field1273[++Statics.field1965 - 1] = client.method2904().method5635(var58) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1965 -= 2;
            int var59 = field1273[Statics.field1965];
            class239 var60 = new class239(field1273[Statics.field1965 + 1]);
            class239 var61 = client.method2904().method5638(var59, var60);
            if (var61 == null) {
                field1273[++Statics.field1965 - 1] = -1;
            } else {
                field1273[++Statics.field1965 - 1] = var61.method4036();
            }
            return 1;
        } else if (arg0 == 6639) {
            class41 var62 = client.method2904().method5653();
            if (var62 == null) {
                field1273[++Statics.field1965 - 1] = -1;
                field1273[++Statics.field1965 - 1] = -1;
            } else {
                field1273[++Statics.field1965 - 1] = var62.field511;
                field1273[++Statics.field1965 - 1] = var62.field513.method4036();
            }
            return 1;
        } else if (arg0 == 6640) {
            class41 var63 = client.method2904().method5641();
            if (var63 == null) {
                field1273[++Statics.field1965 - 1] = -1;
                field1273[++Statics.field1965 - 1] = -1;
            } else {
                field1273[++Statics.field1965 - 1] = var63.field511;
                field1273[++Statics.field1965 - 1] = var63.field513.method4036();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var64 = field1273[--Statics.field1965];
            class270 var65 = Statics.field3472[var64];
            if (var65.field3456 == null) {
                field1282[++Statics.field1234 - 1] = "";
            } else {
                field1282[++Statics.field1234 - 1] = var65.field3456;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var66 = field1273[--Statics.field1965];
            class270 var67 = Statics.field3472[var66];
            field1273[++Statics.field1965 - 1] = var67.field3450;
            return 1;
        } else if (arg0 == 6695) {
            int var68 = field1273[--Statics.field1965];
            class270 var69 = Statics.field3472[var68];
            if (var69 == null) {
                field1273[++Statics.field1965 - 1] = -1;
            } else {
                field1273[++Statics.field1965 - 1] = var69.field3464;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var70 = field1273[--Statics.field1965];
            class270 var71 = Statics.field3472[var70];
            if (var71 == null) {
                field1273[++Statics.field1965 - 1] = -1;
            } else {
                field1273[++Statics.field1965 - 1] = var71.field3471;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1273[++Statics.field1965 - 1] = Statics.field479.field574;
            return 1;
        } else if (arg0 == 6698) {
            field1273[++Statics.field1965 - 1] = Statics.field479.field577.method4036();
            return 1;
        } else if (arg0 == 6699) {
            field1273[++Statics.field1965 - 1] = Statics.field479.field575.method4036();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ct.al(II)V")
    public static void method1585(int arg0) {
        if (arg0 == -1 || !class243.method5054(arg0)) {
            return;
        }
        class243[] var1 = Statics.field2520[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class243 var3 = var1[var2];
            if (var3.field2896 != null) {
                class69 var4 = new class69();
                var4.field781 = var3;
                var4.field783 = var3.field2896;
                method178(var4, 5000000);
            }
        }
    }
}
