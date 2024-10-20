package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cs")
public class class82 {

    @ObfuscatedName("cs.l")
    public static int[] field1255 = new int[5];

    @ObfuscatedName("cs.b")
    public static int[][] field1253 = new int[5][5000];

    @ObfuscatedName("cs.e")
    public static int[] field1257 = new int[1000];

    @ObfuscatedName("cs.p")
    public static String[] field1258 = new String[1000];

    @ObfuscatedName("cs.n")
    public static int field1259 = 0;

    @ObfuscatedName("cs.o")
    public static class64[] field1260 = new class64[50];

    @ObfuscatedName("cs.u")
    public static Calendar field1263 = Calendar.getInstance();

    @ObfuscatedName("cs.j")
    public static final String[] field1265 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cs.z")
    public static int field1264 = 0;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.t(Lbx;IB)V")
    public static void method187(class69 arg0, int arg1) {
        Object[] var2 = arg0.field788;
        class97 var25;
        if (class246.method3171(arg0.field780)) {
            Statics.field270 = (class49) var2[0];
            class270 var3 = Statics.field3455[Statics.field270.field570];
            class246 var4 = arg0.field780;
            int var5 = var3.field3458;
            int var6 = var3.field3475;
            int var7 = (var5 << 8) + var4.field2962;
            class97 var9 = (class97) class97.field1434.method3625((long) (var7 << 16));
            class97 var10;
            if (var9 == null) {
                String var11 = String.valueOf(var7);
                int var12 = Statics.field236.method4210(var11);
                if (var12 == -1) {
                    var10 = null;
                } else {
                    label495: {
                        byte[] var13 = Statics.field236.method4199(var12);
                        if (var13 != null) {
                            if (var13.length <= 1) {
                                var10 = null;
                                break label495;
                            }
                            class97 var14 = class97.method3(var13);
                            if (var14 != null) {
                                class97.field1434.method3627(var14, (long) (var7 << 16));
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
            class97 var16;
            if (var10 == null) {
                int var17 = class251.method2371(var6, var4);
                class97 var18 = (class97) class97.field1434.method3625((long) (var17 << 16));
                class97 var19;
                if (var18 == null) {
                    String var20 = String.valueOf(var17);
                    int var21 = Statics.field236.method4210(var20);
                    if (var21 == -1) {
                        var19 = null;
                    } else {
                        label440: {
                            byte[] var22 = Statics.field236.method4199(var21);
                            if (var22 != null) {
                                if (var22.length <= 1) {
                                    var19 = null;
                                    break label440;
                                }
                                class97 var23 = class97.method3(var22);
                                if (var23 != null) {
                                    class97.field1434.method3627(var23, (long) (var17 << 16));
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
            class97 var27 = (class97) class97.field1434.method3625((long) var26);
            class97 var28;
            if (var27 == null) {
                byte[] var29 = Statics.field236.method4265(var26, 0);
                if (var29 == null) {
                    var28 = null;
                } else {
                    class97 var30 = class97.method3(var29);
                    class97.field1434.method3627(var30, (long) var26);
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
        Statics.field30 = 0;
        Statics.field3923 = 0;
        int var31 = -1;
        int[] var32 = var25.field1429;
        int[] var33 = var25.field1430;
        byte var34 = -1;
        field1259 = 0;
        try {
            Statics.field628 = new int[var25.field1432];
            int var35 = 0;
            Statics.field2503 = new String[var25.field1435];
            int var36 = 0;
            for (int var37 = 1; var37 < var2.length; var37++) {
                if (var2[var37] instanceof Integer) {
                    int var38 = (Integer) var2[var37];
                    if (var38 == -2147483647) {
                        var38 = arg0.field783;
                    }
                    if (var38 == -2147483646) {
                        var38 = arg0.field790;
                    }
                    if (var38 == -2147483645) {
                        var38 = arg0.field791 == null ? -1 : arg0.field791.field2929;
                    }
                    if (var38 == -2147483644) {
                        var38 = arg0.field785;
                    }
                    if (var38 == -2147483643) {
                        var38 = arg0.field791 == null ? -1 : arg0.field791.field2859;
                    }
                    if (var38 == -2147483642) {
                        var38 = arg0.field786 == null ? -1 : arg0.field786.field2929;
                    }
                    if (var38 == -2147483641) {
                        var38 = arg0.field786 == null ? -1 : arg0.field786.field2859;
                    }
                    if (var38 == -2147483640) {
                        var38 = arg0.field781;
                    }
                    if (var38 == -2147483639) {
                        var38 = arg0.field782;
                    }
                    Statics.field628[var35++] = var38;
                } else if (var2[var37] instanceof String) {
                    String var39 = (String) var2[var37];
                    if (var39.equals("event_opbase")) {
                        var39 = arg0.field789;
                    }
                    Statics.field2503[var36++] = var39;
                }
            }
            int var40 = 0;
            field1264 = arg0.field787;
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
                                                                                                                        if (var25.field1430[var31] == 1) {
                                                                                                                            var71 = true;
                                                                                                                        } else {
                                                                                                                            var71 = false;
                                                                                                                        }
                                                                                                                        int var72 = method744(var77, var25, var71);
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
                                                                                                                        field1257[++Statics.field30 - 1] = var33[var31];
                                                                                                                    } else if (var77 == 1) {
                                                                                                                        int var41 = var33[var31];
                                                                                                                        field1257[++Statics.field30 - 1] = class238.field2771[var41];
                                                                                                                    } else if (var77 == 2) {
                                                                                                                        int var42 = var33[var31];
                                                                                                                        class238.field2771[var42] = field1257[--Statics.field30];
                                                                                                                        client.method15(var42);
                                                                                                                    } else if (var77 == 3) {
                                                                                                                        field1258[++Statics.field3923 - 1] = var25.field1431[var31];
                                                                                                                    } else if (var77 == 6) {
                                                                                                                        var31 += var33[var31];
                                                                                                                    } else if (var77 == 7) {
                                                                                                                        Statics.field30 -= 2;
                                                                                                                        if (field1257[Statics.field30] != field1257[Statics.field30 + 1]) {
                                                                                                                            var31 += var33[var31];
                                                                                                                        }
                                                                                                                    } else if (var77 == 8) {
                                                                                                                        Statics.field30 -= 2;
                                                                                                                        if (field1257[Statics.field30] == field1257[Statics.field30 + 1]) {
                                                                                                                            var31 += var33[var31];
                                                                                                                        }
                                                                                                                    } else if (var77 == 9) {
                                                                                                                        Statics.field30 -= 2;
                                                                                                                        if (field1257[Statics.field30] < field1257[Statics.field30 + 1]) {
                                                                                                                            var31 += var33[var31];
                                                                                                                        }
                                                                                                                    } else if (var77 == 10) {
                                                                                                                        Statics.field30 -= 2;
                                                                                                                        if (field1257[Statics.field30] > field1257[Statics.field30 + 1]) {
                                                                                                                            var31 += var33[var31];
                                                                                                                        }
                                                                                                                    } else if (var77 == 21) {
                                                                                                                        if (field1259 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class64 var43 = field1260[--field1259];
                                                                                                                        var25 = var43.field726;
                                                                                                                        var32 = var25.field1429;
                                                                                                                        var33 = var25.field1430;
                                                                                                                        var31 = var43.field732;
                                                                                                                        Statics.field628 = var43.field725;
                                                                                                                        Statics.field2503 = var43.field728;
                                                                                                                    } else if (var77 == 25) {
                                                                                                                        int var44 = var33[var31];
                                                                                                                        field1257[++Statics.field30 - 1] = class238.method1567(var44);
                                                                                                                    } else if (var77 == 27) {
                                                                                                                        int var45 = var33[var31];
                                                                                                                        class238.method3052(var45, field1257[--Statics.field30]);
                                                                                                                    } else if (var77 == 31) {
                                                                                                                        Statics.field30 -= 2;
                                                                                                                        if (field1257[Statics.field30] <= field1257[Statics.field30 + 1]) {
                                                                                                                            var31 += var33[var31];
                                                                                                                        }
                                                                                                                    } else if (var77 == 32) {
                                                                                                                        Statics.field30 -= 2;
                                                                                                                        if (field1257[Statics.field30] >= field1257[Statics.field30 + 1]) {
                                                                                                                            var31 += var33[var31];
                                                                                                                        }
                                                                                                                    } else if (var77 == 33) {
                                                                                                                        field1257[++Statics.field30 - 1] = Statics.field628[var33[var31]];
                                                                                                                    } else if (var77 == 34) {
                                                                                                                        Statics.field628[var33[var31]] = field1257[--Statics.field30];
                                                                                                                    } else if (var77 == 35) {
                                                                                                                        field1258[++Statics.field3923 - 1] = Statics.field2503[var33[var31]];
                                                                                                                    } else if (var77 == 36) {
                                                                                                                        Statics.field2503[var33[var31]] = field1258[--Statics.field3923];
                                                                                                                    } else if (var77 == 37) {
                                                                                                                        int var46 = var33[var31];
                                                                                                                        Statics.field3923 -= var46;
                                                                                                                        String var47 = Statics.method4985(field1258, Statics.field3923, var46);
                                                                                                                        field1258[++Statics.field3923 - 1] = var47;
                                                                                                                    } else if (var77 == 38) {
                                                                                                                        Statics.field30--;
                                                                                                                    } else if (var77 == 39) {
                                                                                                                        Statics.field3923--;
                                                                                                                    } else if (var77 == 40) {
                                                                                                                        int var48 = var33[var31];
                                                                                                                        class97 var49 = (class97) class97.field1434.method3625((long) var48);
                                                                                                                        class97 var50;
                                                                                                                        if (var49 == null) {
                                                                                                                            byte[] var51 = Statics.field236.method4265(var48, 0);
                                                                                                                            if (var51 == null) {
                                                                                                                                var50 = null;
                                                                                                                            } else {
                                                                                                                                class97 var52 = class97.method3(var51);
                                                                                                                                class97.field1434.method3627(var52, (long) var48);
                                                                                                                                var50 = var52;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var50 = var49;
                                                                                                                        }
                                                                                                                        class97 var53 = var50;
                                                                                                                        int[] var54 = new int[var50.field1432];
                                                                                                                        String[] var55 = new String[var50.field1435];
                                                                                                                        for (int var56 = 0; var56 < var53.field1433; var56++) {
                                                                                                                            var54[var56] = field1257[Statics.field30 - var53.field1433 + var56];
                                                                                                                        }
                                                                                                                        for (int var57 = 0; var57 < var53.field1428; var57++) {
                                                                                                                            var55[var57] = field1258[Statics.field3923 - var53.field1428 + var57];
                                                                                                                        }
                                                                                                                        Statics.field30 -= var53.field1433;
                                                                                                                        Statics.field3923 -= var53.field1428;
                                                                                                                        class64 var58 = new class64();
                                                                                                                        var58.field726 = var25;
                                                                                                                        var58.field732 = var31;
                                                                                                                        var58.field725 = Statics.field628;
                                                                                                                        var58.field728 = Statics.field2503;
                                                                                                                        field1260[++field1259 - 1] = var58;
                                                                                                                        var25 = var53;
                                                                                                                        var32 = var53.field1429;
                                                                                                                        var33 = var53.field1430;
                                                                                                                        var31 = -1;
                                                                                                                        Statics.field628 = var54;
                                                                                                                        Statics.field2503 = var55;
                                                                                                                    } else if (var77 == 42) {
                                                                                                                        field1257[++Statics.field30 - 1] = Statics.field239.method1864(var33[var31]);
                                                                                                                    } else if (var77 == 43) {
                                                                                                                        Statics.field239.method1831(var33[var31], field1257[--Statics.field30]);
                                                                                                                    } else if (var77 == 44) {
                                                                                                                        int var59 = var33[var31] >> 16;
                                                                                                                        int var60 = var33[var31] & 0xFFFF;
                                                                                                                        int var61 = field1257[--Statics.field30];
                                                                                                                        if (var61 >= 0 && var61 <= 5000) {
                                                                                                                            field1255[var59] = var61;
                                                                                                                            byte var62 = -1;
                                                                                                                            if (var60 == 105) {
                                                                                                                                var62 = 0;
                                                                                                                            }
                                                                                                                            int var63 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var63 >= var61) {
                                                                                                                                    continue label267;
                                                                                                                                }
                                                                                                                                field1253[var59][var63] = var62;
                                                                                                                                var63++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var77 == 45) {
                                                                                                                        int var64 = var33[var31];
                                                                                                                        int var65 = field1257[--Statics.field30];
                                                                                                                        if (var65 < 0 || var65 >= field1255[var64]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1257[++Statics.field30 - 1] = field1253[var64][var65];
                                                                                                                    } else if (var77 == 46) {
                                                                                                                        int var66 = var33[var31];
                                                                                                                        Statics.field30 -= 2;
                                                                                                                        int var67 = field1257[Statics.field30];
                                                                                                                        if (var67 < 0 || var67 >= field1255[var66]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1253[var66][var67] = field1257[Statics.field30 + 1];
                                                                                                                    } else if (var77 == 47) {
                                                                                                                        String var68 = Statics.field239.method1834(var33[var31]);
                                                                                                                        if (var68 == null) {
                                                                                                                            var68 = class252.field3052;
                                                                                                                        }
                                                                                                                        field1258[++Statics.field3923 - 1] = var68;
                                                                                                                    } else if (var77 == 48) {
                                                                                                                        Statics.field239.method1833(var33[var31], field1258[--Statics.field3923]);
                                                                                                                    } else if (var77 == 60) {
                                                                                                                        class210 var69 = var25.field1436[var33[var31]];
                                                                                                                        class224 var70 = (class224) var69.method3594((long) field1257[--Statics.field30]);
                                                                                                                        if (var70 != null) {
                                                                                                                            var31 += var70.field2653;
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
            var74.append("").append(var25.field2636).append(" ");
            for (int var75 = field1259 - 1; var75 >= 0; var75--) {
                var74.append("").append(field1260[var75].field726.field2636).append(" ");
            }
            var74.append("").append(var34);
            class165.method2453(var74.toString(), var76);
        }
    }

    @ObfuscatedName("bk.q(ILcj;ZI)I")
    public static int method744(int arg0, class97 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method3145(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method1040(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method3174(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method2083(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method726(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method2832(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            class243 var6 = arg2 ? Statics.field2756 : Statics.field1261;
            byte var7;
            if (arg0 == 1500) {
                field1257[++Statics.field30 - 1] = var6.field2842;
                var7 = 1;
            } else if (arg0 == 1501) {
                field1257[++Statics.field30 - 1] = var6.field2832;
                var7 = 1;
            } else if (arg0 == 1502) {
                field1257[++Statics.field30 - 1] = var6.field2833;
                var7 = 1;
            } else if (arg0 == 1503) {
                field1257[++Statics.field30 - 1] = var6.field2834;
                var7 = 1;
            } else if (arg0 == 1504) {
                field1257[++Statics.field30 - 1] = var6.field2838 ? 1 : 0;
                var7 = 1;
            } else if (arg0 == 1505) {
                field1257[++Statics.field30 - 1] = var6.field2837;
                var7 = 1;
            } else {
                var7 = 2;
            }
            return var7;
        } else if (arg0 < 1700) {
            class243 var8 = arg2 ? Statics.field2756 : Statics.field1261;
            byte var9;
            if (arg0 == 1600) {
                field1257[++Statics.field30 - 1] = var8.field2857;
                var9 = 1;
            } else if (arg0 == 1601) {
                field1257[++Statics.field30 - 1] = var8.field2829;
                var9 = 1;
            } else if (arg0 == 1602) {
                field1258[++Statics.field3923 - 1] = var8.field2827;
                var9 = 1;
            } else if (arg0 == 1603) {
                field1257[++Statics.field30 - 1] = var8.field2841;
                var9 = 1;
            } else if (arg0 == 1604) {
                field1257[++Statics.field30 - 1] = var8.field2878;
                var9 = 1;
            } else if (arg0 == 1605) {
                field1257[++Statics.field30 - 1] = var8.field2872;
                var9 = 1;
            } else if (arg0 == 1606) {
                field1257[++Statics.field30 - 1] = var8.field2869;
                var9 = 1;
            } else if (arg0 == 1607) {
                field1257[++Statics.field30 - 1] = var8.field2871;
                var9 = 1;
            } else if (arg0 == 1608) {
                field1257[++Statics.field30 - 1] = var8.field2819;
                var9 = 1;
            } else if (arg0 == 1609) {
                field1257[++Statics.field30 - 1] = var8.field2897;
                var9 = 1;
            } else if (arg0 == 1610) {
                field1257[++Statics.field30 - 1] = var8.field2953;
                var9 = 1;
            } else if (arg0 == 1611) {
                field1257[++Statics.field30 - 1] = var8.field2843;
                var9 = 1;
            } else if (arg0 == 1612) {
                field1257[++Statics.field30 - 1] = var8.field2880;
                var9 = 1;
            } else if (arg0 == 1613) {
                field1257[++Statics.field30 - 1] = var8.field2809.method12();
                var9 = 1;
            } else {
                var9 = 2;
            }
            return var9;
        } else if (arg0 < 1800) {
            class243 var13 = arg2 ? Statics.field2756 : Statics.field1261;
            byte var14;
            if (arg0 == 1700) {
                field1257[++Statics.field30 - 1] = var13.field2938;
                var14 = 1;
            } else if (arg0 == 1701) {
                if (var13.field2938 == -1) {
                    field1257[++Statics.field30 - 1] = 0;
                } else {
                    field1257[++Statics.field30 - 1] = var13.field2910;
                }
                var14 = 1;
            } else if (arg0 == 1702) {
                field1257[++Statics.field30 - 1] = var13.field2859;
                var14 = 1;
            } else {
                var14 = 2;
            }
            return var14;
        } else if (arg0 < 1900) {
            return method76(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method3475(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1040(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method3174(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method2083(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method726(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method2832(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method1769(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method2994(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method127(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method496(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method3475(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method966(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            byte var15;
            if (arg0 == 3200) {
                Statics.field30 -= 3;
                client.method1895(field1257[Statics.field30], field1257[Statics.field30 + 1], field1257[Statics.field30 + 2]);
                var15 = 1;
            } else if (arg0 == 3201) {
                client.method324(field1257[--Statics.field30]);
                var15 = 1;
            } else if (arg0 == 3202) {
                Statics.field30 -= 2;
                client.method1778(field1257[Statics.field30], field1257[Statics.field30 + 1]);
                var15 = 1;
            } else {
                var15 = 2;
            }
            return var15;
        } else if (arg0 < 3400) {
            return method2343(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            byte var20;
            if (arg0 == 3400) {
                Statics.field30 -= 2;
                int var16 = field1257[Statics.field30];
                int var17 = field1257[Statics.field30 + 1];
                class281 var18 = class281.method4835(var16);
                if (var18.field3562 != 's') {
                }
                for (int var19 = 0; var19 < var18.field3565; var19++) {
                    if (var18.field3566[var19] == var17) {
                        field1258[++Statics.field3923 - 1] = var18.field3568[var19];
                        var18 = null;
                        break;
                    }
                }
                if (var18 != null) {
                    field1258[++Statics.field3923 - 1] = var18.field3570;
                }
                var20 = 1;
            } else if (arg0 == 3408) {
                Statics.field30 -= 4;
                int var21 = field1257[Statics.field30];
                int var22 = field1257[Statics.field30 + 1];
                int var23 = field1257[Statics.field30 + 2];
                int var24 = field1257[Statics.field30 + 3];
                class281 var25 = class281.method4835(var23);
                if (var25.field3569 == var21 && var25.field3562 == var22) {
                    for (int var26 = 0; var26 < var25.field3565; var26++) {
                        if (var25.field3566[var26] == var24) {
                            if (var22 == 115) {
                                field1258[++Statics.field3923 - 1] = var25.field3568[var26];
                            } else {
                                field1257[++Statics.field30 - 1] = var25.field3567[var26];
                            }
                            var25 = null;
                            break;
                        }
                    }
                    if (var25 != null) {
                        if (var22 == 115) {
                            field1258[++Statics.field3923 - 1] = var25.field3570;
                        } else {
                            field1257[++Statics.field30 - 1] = var25.field3561;
                        }
                    }
                    var20 = 1;
                } else {
                    if (var22 == 115) {
                        field1258[++Statics.field3923 - 1] = class252.field3052;
                    } else {
                        field1257[++Statics.field30 - 1] = 0;
                    }
                    var20 = 1;
                }
            } else if (arg0 == 3411) {
                int var27 = field1257[--Statics.field30];
                class281 var28 = class281.method4835(var27);
                field1257[++Statics.field30 - 1] = var28.method4551();
                var20 = 1;
            } else {
                var20 = 2;
            }
            return var20;
        } else if (arg0 < 3700) {
            return method1576(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method3204(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            byte var31;
            if (arg0 == 4000) {
                Statics.field30 -= 2;
                int var29 = field1257[Statics.field30];
                int var30 = field1257[Statics.field30 + 1];
                field1257[++Statics.field30 - 1] = var29 + var30;
                var31 = 1;
            } else if (arg0 == 4001) {
                Statics.field30 -= 2;
                int var32 = field1257[Statics.field30];
                int var33 = field1257[Statics.field30 + 1];
                field1257[++Statics.field30 - 1] = var32 - var33;
                var31 = 1;
            } else if (arg0 == 4002) {
                Statics.field30 -= 2;
                int var34 = field1257[Statics.field30];
                int var35 = field1257[Statics.field30 + 1];
                field1257[++Statics.field30 - 1] = var34 * var35;
                var31 = 1;
            } else if (arg0 == 4003) {
                Statics.field30 -= 2;
                int var36 = field1257[Statics.field30];
                int var37 = field1257[Statics.field30 + 1];
                field1257[++Statics.field30 - 1] = var36 / var37;
                var31 = 1;
            } else if (arg0 == 4004) {
                int var38 = field1257[--Statics.field30];
                field1257[++Statics.field30 - 1] = (int) (Math.random() * (double) var38);
                var31 = 1;
            } else if (arg0 == 4005) {
                int var39 = field1257[--Statics.field30];
                field1257[++Statics.field30 - 1] = (int) (Math.random() * (double) (var39 + 1));
                var31 = 1;
            } else if (arg0 == 4006) {
                Statics.field30 -= 5;
                int var40 = field1257[Statics.field30];
                int var41 = field1257[Statics.field30 + 1];
                int var42 = field1257[Statics.field30 + 2];
                int var43 = field1257[Statics.field30 + 3];
                int var44 = field1257[Statics.field30 + 4];
                field1257[++Statics.field30 - 1] = (var41 - var40) * (var44 - var42) / (var43 - var42) + var40;
                var31 = 1;
            } else if (arg0 == 4007) {
                Statics.field30 -= 2;
                int var45 = field1257[Statics.field30];
                int var46 = field1257[Statics.field30 + 1];
                field1257[++Statics.field30 - 1] = var45 * var46 / 100 + var45;
                var31 = 1;
            } else if (arg0 == 4008) {
                Statics.field30 -= 2;
                int var47 = field1257[Statics.field30];
                int var48 = field1257[Statics.field30 + 1];
                field1257[++Statics.field30 - 1] = var47 | 0x1 << var48;
                var31 = 1;
            } else if (arg0 == 4009) {
                Statics.field30 -= 2;
                int var49 = field1257[Statics.field30];
                int var50 = field1257[Statics.field30 + 1];
                field1257[++Statics.field30 - 1] = var49 & -1 - (0x1 << var50);
                var31 = 1;
            } else if (arg0 == 4010) {
                Statics.field30 -= 2;
                int var51 = field1257[Statics.field30];
                int var52 = field1257[Statics.field30 + 1];
                field1257[++Statics.field30 - 1] = (var51 & 0x1 << var52) == 0 ? 0 : 1;
                var31 = 1;
            } else if (arg0 == 4011) {
                Statics.field30 -= 2;
                int var53 = field1257[Statics.field30];
                int var54 = field1257[Statics.field30 + 1];
                field1257[++Statics.field30 - 1] = var53 % var54;
                var31 = 1;
            } else if (arg0 == 4012) {
                Statics.field30 -= 2;
                int var55 = field1257[Statics.field30];
                int var56 = field1257[Statics.field30 + 1];
                if (var55 == 0) {
                    field1257[++Statics.field30 - 1] = 0;
                } else {
                    field1257[++Statics.field30 - 1] = (int) Math.pow((double) var55, (double) var56);
                }
                var31 = 1;
            } else if (arg0 == 4013) {
                Statics.field30 -= 2;
                int var57 = field1257[Statics.field30];
                int var58 = field1257[Statics.field30 + 1];
                if (var57 == 0) {
                    field1257[++Statics.field30 - 1] = 0;
                    var31 = 1;
                } else {
                    switch(var58) {
                        case 0:
                            field1257[++Statics.field30 - 1] = Integer.MAX_VALUE;
                            break;
                        case 1:
                            field1257[++Statics.field30 - 1] = var57;
                            break;
                        case 2:
                            field1257[++Statics.field30 - 1] = (int) Math.sqrt((double) var57);
                            break;
                        case 3:
                            field1257[++Statics.field30 - 1] = (int) Math.cbrt((double) var57);
                            break;
                        case 4:
                            field1257[++Statics.field30 - 1] = (int) Math.sqrt(Math.sqrt((double) var57));
                            break;
                        default:
                            field1257[++Statics.field30 - 1] = (int) Math.pow((double) var57, 1.0D / (double) var58);
                    }
                    var31 = 1;
                }
            } else if (arg0 == 4014) {
                Statics.field30 -= 2;
                int var59 = field1257[Statics.field30];
                int var60 = field1257[Statics.field30 + 1];
                field1257[++Statics.field30 - 1] = var59 & var60;
                var31 = 1;
            } else if (arg0 == 4015) {
                Statics.field30 -= 2;
                int var61 = field1257[Statics.field30];
                int var62 = field1257[Statics.field30 + 1];
                field1257[++Statics.field30 - 1] = var61 | var62;
                var31 = 1;
            } else if (arg0 == 4018) {
                Statics.field30 -= 3;
                long var63 = (long) field1257[Statics.field30];
                long var65 = (long) field1257[Statics.field30 + 1];
                long var67 = (long) field1257[Statics.field30 + 2];
                field1257[++Statics.field30 - 1] = (int) (var63 * var67 / var65);
                var31 = 1;
            } else {
                var31 = 2;
            }
            return var31;
        } else if (arg0 < 4200) {
            byte var71;
            if (arg0 == 4100) {
                String var69 = field1258[--Statics.field3923];
                int var70 = field1257[--Statics.field30];
                field1258[++Statics.field3923 - 1] = var69 + var70;
                var71 = 1;
            } else if (arg0 == 4101) {
                Statics.field3923 -= 2;
                String var72 = field1258[Statics.field3923];
                String var73 = field1258[Statics.field3923 + 1];
                field1258[++Statics.field3923 - 1] = var72 + var73;
                var71 = 1;
            } else if (arg0 == 4102) {
                String var74 = field1258[--Statics.field3923];
                int var75 = field1257[--Statics.field30];
                field1258[++Statics.field3923 - 1] = var74 + class319.method3122(var75, true);
                var71 = 1;
            } else if (arg0 == 4103) {
                String var76 = field1258[--Statics.field3923];
                field1258[++Statics.field3923 - 1] = var76.toLowerCase();
                var71 = 1;
            } else if (arg0 == 4104) {
                int var77 = field1257[--Statics.field30];
                long var78 = ((long) var77 + 11745L) * 86400000L;
                field1263.setTime(new Date(var78));
                int var80 = field1263.get(5);
                int var81 = field1263.get(2);
                int var82 = field1263.get(1);
                field1258[++Statics.field3923 - 1] = var80 + "-" + field1265[var81] + "-" + var82;
                var71 = 1;
            } else if (arg0 == 4105) {
                Statics.field3923 -= 2;
                String var83 = field1258[Statics.field3923];
                String var84 = field1258[Statics.field3923 + 1];
                if (Statics.field434.field836 != null && Statics.field434.field836.field2784) {
                    field1258[++Statics.field3923 - 1] = var84;
                } else {
                    field1258[++Statics.field3923 - 1] = var83;
                }
                var71 = 1;
            } else if (arg0 == 4106) {
                int var85 = field1257[--Statics.field30];
                field1258[++Statics.field3923 - 1] = Integer.toString(var85);
                var71 = 1;
            } else if (arg0 == 4107) {
                Statics.field3923 -= 2;
                int[] var86 = field1257;
                int var87 = ++Statics.field30 - 1;
                int var88 = class186.method240(field1258[Statics.field3923], field1258[Statics.field3923 + 1], client.field856);
                byte var89;
                if (var88 > 0) {
                    var89 = 1;
                } else if (var88 < 0) {
                    var89 = -1;
                } else {
                    var89 = 0;
                }
                var86[var87] = var89;
                var71 = 1;
            } else if (arg0 == 4108) {
                String var90 = field1258[--Statics.field3923];
                Statics.field30 -= 2;
                int var91 = field1257[Statics.field30];
                int var92 = field1257[Statics.field30 + 1];
                byte[] var93 = Statics.field930.method4265(var92, 0);
                class312 var94 = new class312(var93);
                field1257[++Statics.field30 - 1] = var94.method5071(var90, var91);
                var71 = 1;
            } else if (arg0 == 4109) {
                String var95 = field1258[--Statics.field3923];
                Statics.field30 -= 2;
                int var96 = field1257[Statics.field30];
                int var97 = field1257[Statics.field30 + 1];
                byte[] var98 = Statics.field930.method4265(var97, 0);
                class312 var99 = new class312(var98);
                field1257[++Statics.field30 - 1] = var99.method5064(var95, var96);
                var71 = 1;
            } else if (arg0 == 4110) {
                Statics.field3923 -= 2;
                String var100 = field1258[Statics.field3923];
                String var101 = field1258[Statics.field3923 + 1];
                if (field1257[--Statics.field30] == 1) {
                    field1258[++Statics.field3923 - 1] = var100;
                } else {
                    field1258[++Statics.field3923 - 1] = var101;
                }
                var71 = 1;
            } else if (arg0 == 4111) {
                String var102 = field1258[--Statics.field3923];
                field1258[++Statics.field3923 - 1] = class313.method5072(var102);
                var71 = 1;
            } else if (arg0 == 4112) {
                String var103 = field1258[--Statics.field3923];
                int var104 = field1257[--Statics.field30];
                field1258[++Statics.field3923 - 1] = var103 + (char) var104;
                var71 = 1;
            } else if (arg0 == 4113) {
                int var105 = field1257[--Statics.field30];
                int[] var106 = field1257;
                int var107 = ++Statics.field30 - 1;
                char var108 = (char) var105;
                boolean var109;
                if (var108 >= ' ' && var108 <= '~') {
                    var109 = true;
                } else if (var108 >= 160 && var108 <= 255) {
                    var109 = true;
                } else if (var108 == 8364 || var108 == 338 || var108 == 8212 || var108 == 339 || var108 == 376) {
                    var109 = true;
                } else {
                    var109 = false;
                }
                var106[var107] = var109 ? 1 : 0;
                var71 = 1;
            } else if (arg0 == 4114) {
                int var110 = field1257[--Statics.field30];
                field1257[++Statics.field30 - 1] = class319.method4360((char) var110) ? 1 : 0;
                var71 = 1;
            } else if (arg0 == 4115) {
                int var111 = field1257[--Statics.field30];
                field1257[++Statics.field30 - 1] = class319.method151((char) var111) ? 1 : 0;
                var71 = 1;
            } else if (arg0 == 4116) {
                int var112 = field1257[--Statics.field30];
                int[] var113 = field1257;
                int var114 = ++Statics.field30 - 1;
                char var115 = (char) var112;
                boolean var116 = var115 >= '0' && var115 <= '9';
                var113[var114] = var116 ? 1 : 0;
                var71 = 1;
            } else if (arg0 == 4117) {
                String var117 = field1258[--Statics.field3923];
                if (var117 == null) {
                    field1257[++Statics.field30 - 1] = 0;
                } else {
                    field1257[++Statics.field30 - 1] = var117.length();
                }
                var71 = 1;
            } else if (arg0 == 4118) {
                String var118 = field1258[--Statics.field3923];
                Statics.field30 -= 2;
                int var119 = field1257[Statics.field30];
                int var120 = field1257[Statics.field30 + 1];
                field1258[++Statics.field3923 - 1] = var118.substring(var119, var120);
                var71 = 1;
            } else if (arg0 == 4119) {
                String var121 = field1258[--Statics.field3923];
                StringBuilder var122 = new StringBuilder(var121.length());
                boolean var123 = false;
                for (int var124 = 0; var124 < var121.length(); var124++) {
                    char var125 = var121.charAt(var124);
                    if (var125 == '<') {
                        var123 = true;
                    } else if (var125 == '>') {
                        var123 = false;
                    } else if (!var123) {
                        var122.append(var125);
                    }
                }
                field1258[++Statics.field3923 - 1] = var122.toString();
                var71 = 1;
            } else if (arg0 == 4120) {
                String var126 = field1258[--Statics.field3923];
                int var127 = field1257[--Statics.field30];
                field1257[++Statics.field30 - 1] = var126.indexOf(var127);
                var71 = 1;
            } else if (arg0 == 4121) {
                Statics.field3923 -= 2;
                String var128 = field1258[Statics.field3923];
                String var129 = field1258[Statics.field3923 + 1];
                int var130 = field1257[--Statics.field30];
                field1257[++Statics.field30 - 1] = var128.indexOf(var129, var130);
                var71 = 1;
            } else {
                var71 = 2;
            }
            return var71;
        } else if (arg0 < 4300) {
            byte var132;
            if (arg0 == 4200) {
                int var131 = field1257[--Statics.field30];
                field1258[++Statics.field3923 - 1] = class284.method1694(var131).field3656;
                var132 = 1;
            } else if (arg0 == 4201) {
                Statics.field30 -= 2;
                int var133 = field1257[Statics.field30];
                int var134 = field1257[Statics.field30 + 1];
                class284 var135 = class284.method1694(var133);
                if (var134 < 1 || var134 > 5 || var135.field3655[var134 - 1] == null) {
                    field1258[++Statics.field3923 - 1] = "";
                } else {
                    field1258[++Statics.field3923 - 1] = var135.field3655[var134 - 1];
                }
                var132 = 1;
            } else if (arg0 == 4202) {
                Statics.field30 -= 2;
                int var136 = field1257[Statics.field30];
                int var137 = field1257[Statics.field30 + 1];
                class284 var138 = class284.method1694(var136);
                if (var137 < 1 || var137 > 5 || var138.field3671[var137 - 1] == null) {
                    field1258[++Statics.field3923 - 1] = "";
                } else {
                    field1258[++Statics.field3923 - 1] = var138.field3671[var137 - 1];
                }
                var132 = 1;
            } else if (arg0 == 4203) {
                int var139 = field1257[--Statics.field30];
                field1257[++Statics.field30 - 1] = class284.method1694(var139).field3668;
                var132 = 1;
            } else if (arg0 == 4204) {
                int var140 = field1257[--Statics.field30];
                field1257[++Statics.field30 - 1] = class284.method1694(var140).field3646 == 1 ? 1 : 0;
                var132 = 1;
            } else if (arg0 == 4205) {
                int var141 = field1257[--Statics.field30];
                class284 var142 = class284.method1694(var141);
                if (var142.field3688 == -1 && var142.field3687 >= 0) {
                    field1257[++Statics.field30 - 1] = var142.field3687;
                } else {
                    field1257[++Statics.field30 - 1] = var141;
                }
                var132 = 1;
            } else if (arg0 == 4206) {
                int var143 = field1257[--Statics.field30];
                class284 var144 = class284.method1694(var143);
                if (var144.field3688 >= 0 && var144.field3687 >= 0) {
                    field1257[++Statics.field30 - 1] = var144.field3687;
                } else {
                    field1257[++Statics.field30 - 1] = var143;
                }
                var132 = 1;
            } else if (arg0 == 4207) {
                int var145 = field1257[--Statics.field30];
                field1257[++Statics.field30 - 1] = class284.method1694(var145).field3669 ? 1 : 0;
                var132 = 1;
            } else if (arg0 == 4208) {
                int var146 = field1257[--Statics.field30];
                class284 var147 = class284.method1694(var146);
                if (var147.field3700 == -1 && var147.field3699 >= 0) {
                    field1257[++Statics.field30 - 1] = var147.field3699;
                } else {
                    field1257[++Statics.field30 - 1] = var146;
                }
                var132 = 1;
            } else if (arg0 == 4209) {
                int var148 = field1257[--Statics.field30];
                class284 var149 = class284.method1694(var148);
                if (var149.field3700 >= 0 && var149.field3699 >= 0) {
                    field1257[++Statics.field30 - 1] = var149.field3699;
                } else {
                    field1257[++Statics.field30 - 1] = var148;
                }
                var132 = 1;
            } else if (arg0 == 4210) {
                String var150 = field1258[--Statics.field3923];
                int var151 = field1257[--Statics.field30];
                client.method3473(var150, var151 == 1);
                field1257[++Statics.field30 - 1] = Statics.field1570;
                var132 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field577 == null || Statics.field251 >= Statics.field1570) {
                    field1257[++Statics.field30 - 1] = -1;
                } else {
                    field1257[++Statics.field30 - 1] = Statics.field577[++Statics.field251 - 1] & 0xFFFF;
                }
                var132 = 1;
            } else if (arg0 == 4212) {
                Statics.field251 = 0;
                var132 = 1;
            } else {
                var132 = 2;
            }
            return var132;
        } else if (arg0 < 5100) {
            byte var152;
            if (arg0 == 5000) {
                field1257[++Statics.field30 - 1] = client.field1063;
                var152 = 1;
            } else if (arg0 == 5001) {
                Statics.field30 -= 3;
                client.field1063 = field1257[Statics.field30];
                int var153 = field1257[Statics.field30 + 1];
                class321[] var154 = new class321[] { class321.field3934, class321.field3936, class321.field3935 };
                class321[] var155 = var154;
                int var156 = 0;
                class321 var158;
                while (true) {
                    if (var156 >= var155.length) {
                        var158 = null;
                        break;
                    }
                    class321 var157 = var155[var156];
                    if (var157.field3937 == var153) {
                        var158 = var157;
                        break;
                    }
                    var156++;
                }
                Statics.field2569 = var158;
                if (Statics.field2569 == null) {
                    Statics.field2569 = class321.field3936;
                }
                client.field1064 = field1257[Statics.field30 + 2];
                class185 var159 = class185.method343(class182.field2438, client.field1073.field1457);
                var159.field2478.method3220(client.field1063);
                var159.field2478.method3220(Statics.field2569.field3937);
                var159.field2478.method3220(client.field1064);
                client.field1073.method1916(var159);
                var152 = 1;
            } else if (arg0 == 5002) {
                String var160 = field1258[--Statics.field3923];
                Statics.field30 -= 2;
                int var161 = field1257[Statics.field30];
                int var162 = field1257[Statics.field30 + 1];
                class185 var163 = class185.method343(class182.field2439, client.field1073.field1457);
                var163.field2478.method3220(class195.method126(var160) + 2);
                var163.field2478.method3232(var160);
                var163.field2478.method3220(var161 - 1);
                var163.field2478.method3220(var162);
                client.field1073.method1916(var163);
                var152 = 1;
            } else if (arg0 == 5003) {
                Statics.field30 -= 2;
                int var164 = field1257[Statics.field30];
                int var165 = field1257[Statics.field30 + 1];
                class99 var166 = (class99) class96.field1427.get(var164);
                class71 var167 = var166.method1905(var165);
                if (var167 == null) {
                    field1257[++Statics.field30 - 1] = -1;
                    field1257[++Statics.field30 - 1] = 0;
                    field1258[++Statics.field3923 - 1] = "";
                    field1258[++Statics.field3923 - 1] = "";
                    field1258[++Statics.field3923 - 1] = "";
                    field1257[++Statics.field30 - 1] = 0;
                } else {
                    field1257[++Statics.field30 - 1] = var167.field806;
                    field1257[++Statics.field30 - 1] = var167.field803;
                    field1258[++Statics.field3923 - 1] = var167.field810 == null ? "" : var167.field810;
                    field1258[++Statics.field3923 - 1] = var167.field809 == null ? "" : var167.field809;
                    field1258[++Statics.field3923 - 1] = var167.field811 == null ? "" : var167.field811;
                    field1257[++Statics.field30 - 1] = var167.method1063() ? 1 : (var167.method1075() ? 2 : 0);
                }
                var152 = 1;
            } else if (arg0 == 5004) {
                int var169 = field1257[--Statics.field30];
                class71 var170 = class96.method139(var169);
                if (var170 == null) {
                    field1257[++Statics.field30 - 1] = -1;
                    field1257[++Statics.field30 - 1] = 0;
                    field1258[++Statics.field3923 - 1] = "";
                    field1258[++Statics.field3923 - 1] = "";
                    field1258[++Statics.field3923 - 1] = "";
                    field1257[++Statics.field30 - 1] = 0;
                } else {
                    field1257[++Statics.field30 - 1] = var170.field804;
                    field1257[++Statics.field30 - 1] = var170.field803;
                    field1258[++Statics.field3923 - 1] = var170.field810 == null ? "" : var170.field810;
                    field1258[++Statics.field3923 - 1] = var170.field809 == null ? "" : var170.field809;
                    field1258[++Statics.field3923 - 1] = var170.field811 == null ? "" : var170.field811;
                    field1257[++Statics.field30 - 1] = var170.method1063() ? 1 : (var170.method1075() ? 2 : 0);
                }
                var152 = 1;
            } else if (arg0 == 5005) {
                if (Statics.field2569 == null) {
                    field1257[++Statics.field30 - 1] = -1;
                } else {
                    field1257[++Statics.field30 - 1] = Statics.field2569.field3937;
                }
                var152 = 1;
            } else if (arg0 == 5008) {
                String var171 = field1258[--Statics.field3923];
                int var172 = field1257[--Statics.field30];
                String var173 = var171.toLowerCase();
                byte var174 = 0;
                if (var173.startsWith(class252.field3259)) {
                    var174 = 0;
                    var171 = var171.substring(class252.field3259.length());
                } else if (var173.startsWith(class252.field3200)) {
                    var174 = 1;
                    var171 = var171.substring(class252.field3200.length());
                } else if (var173.startsWith(class252.field3115)) {
                    var174 = 2;
                    var171 = var171.substring(class252.field3115.length());
                } else if (var173.startsWith(class252.field3204)) {
                    var174 = 3;
                    var171 = var171.substring(class252.field3204.length());
                } else if (var173.startsWith(class252.field3075)) {
                    var174 = 4;
                    var171 = var171.substring(class252.field3075.length());
                } else if (var173.startsWith(class252.field3208)) {
                    var174 = 5;
                    var171 = var171.substring(class252.field3208.length());
                } else if (var173.startsWith(class252.field3210)) {
                    var174 = 6;
                    var171 = var171.substring(class252.field3210.length());
                } else if (var173.startsWith(class252.field3245)) {
                    var174 = 7;
                    var171 = var171.substring(class252.field3245.length());
                } else if (var173.startsWith(class252.field3214)) {
                    var174 = 8;
                    var171 = var171.substring(class252.field3214.length());
                } else if (var173.startsWith(class252.field3253)) {
                    var174 = 9;
                    var171 = var171.substring(class252.field3253.length());
                } else if (var173.startsWith(class252.field3218)) {
                    var174 = 10;
                    var171 = var171.substring(class252.field3218.length());
                } else if (var173.startsWith(class252.field3220)) {
                    var174 = 11;
                    var171 = var171.substring(class252.field3220.length());
                } else if (client.field856 != 0) {
                    if (var173.startsWith(class252.field3199)) {
                        var174 = 0;
                        var171 = var171.substring(class252.field3199.length());
                    } else if (var173.startsWith(class252.field3088)) {
                        var174 = 1;
                        var171 = var171.substring(class252.field3088.length());
                    } else if (var173.startsWith(class252.field3251)) {
                        var174 = 2;
                        var171 = var171.substring(class252.field3251.length());
                    } else if (var173.startsWith(class252.field3205)) {
                        var174 = 3;
                        var171 = var171.substring(class252.field3205.length());
                    } else if (var173.startsWith(class252.field3207)) {
                        var174 = 4;
                        var171 = var171.substring(class252.field3207.length());
                    } else if (var173.startsWith(class252.field3209)) {
                        var174 = 5;
                        var171 = var171.substring(class252.field3209.length());
                    } else if (var173.startsWith(class252.field3211)) {
                        var174 = 6;
                        var171 = var171.substring(class252.field3211.length());
                    } else if (var173.startsWith(class252.field3213)) {
                        var174 = 7;
                        var171 = var171.substring(class252.field3213.length());
                    } else if (var173.startsWith(class252.field3234)) {
                        var174 = 8;
                        var171 = var171.substring(class252.field3234.length());
                    } else if (var173.startsWith(class252.field3217)) {
                        var174 = 9;
                        var171 = var171.substring(class252.field3217.length());
                    } else if (var173.startsWith(class252.field3270)) {
                        var174 = 10;
                        var171 = var171.substring(class252.field3270.length());
                    } else if (var173.startsWith(class252.field3227)) {
                        var174 = 11;
                        var171 = var171.substring(class252.field3227.length());
                    }
                }
                String var175 = var171.toLowerCase();
                byte var176 = 0;
                if (var175.startsWith(class252.field3222)) {
                    var176 = 1;
                    var171 = var171.substring(class252.field3222.length());
                } else if (var175.startsWith(class252.field3224)) {
                    var176 = 2;
                    var171 = var171.substring(class252.field3224.length());
                } else if (var175.startsWith(class252.field3106)) {
                    var176 = 3;
                    var171 = var171.substring(class252.field3106.length());
                } else if (var175.startsWith(class252.field3228)) {
                    var176 = 4;
                    var171 = var171.substring(class252.field3228.length());
                } else if (var175.startsWith(class252.field3150)) {
                    var176 = 5;
                    var171 = var171.substring(class252.field3150.length());
                } else if (client.field856 != 0) {
                    if (var175.startsWith(class252.field3223)) {
                        var176 = 1;
                        var171 = var171.substring(class252.field3223.length());
                    } else if (var175.startsWith(class252.field3225)) {
                        var176 = 2;
                        var171 = var171.substring(class252.field3225.length());
                    } else if (var175.startsWith(class252.field3117)) {
                        var176 = 3;
                        var171 = var171.substring(class252.field3117.length());
                    } else if (var175.startsWith(class252.field3291)) {
                        var176 = 4;
                        var171 = var171.substring(class252.field3291.length());
                    } else if (var175.startsWith(class252.field3231)) {
                        var176 = 5;
                        var171 = var171.substring(class252.field3231.length());
                    }
                }
                class185 var177 = class185.method343(class182.field2391, client.field1073.field1457);
                var177.field2478.method3220(0);
                int var178 = var177.field2478.field2545;
                var177.field2478.method3220(var172);
                var177.field2478.method3220(var174);
                var177.field2478.method3220(var176);
                class314.method4089(var177.field2478, var171);
                var177.field2478.method3233(var177.field2478.field2545 - var178);
                client.field1073.method1916(var177);
                var152 = 1;
            } else if (arg0 == 5009) {
                Statics.field3923 -= 2;
                String var179 = field1258[Statics.field3923];
                String var180 = field1258[Statics.field3923 + 1];
                class185 var181 = class185.method343(class182.field2406, client.field1073.field1457);
                var181.field2478.method3323(0);
                int var182 = var181.field2478.field2545;
                var181.field2478.method3232(var179);
                class314.method4089(var181.field2478, var180);
                var181.field2478.method3380(var181.field2478.field2545 - var182);
                client.field1073.method1916(var181);
                var152 = 1;
            } else if (arg0 == 5015) {
                String var183;
                if (Statics.field434 == null || Statics.field434.field820 == null) {
                    var183 = "";
                } else {
                    var183 = Statics.field434.field820.method5022();
                }
                field1258[++Statics.field3923 - 1] = var183;
                var152 = 1;
            } else if (arg0 == 5016) {
                field1257[++Statics.field30 - 1] = client.field1064;
                var152 = 1;
            } else if (arg0 == 5017) {
                int var184 = field1257[--Statics.field30];
                field1257[++Statics.field30 - 1] = class96.method672(var184);
                var152 = 1;
            } else if (arg0 == 5018) {
                int var185 = field1257[--Statics.field30];
                field1257[++Statics.field30 - 1] = class96.method1526(var185);
                var152 = 1;
            } else if (arg0 == 5019) {
                int var186 = field1257[--Statics.field30];
                field1257[++Statics.field30 - 1] = class96.method1088(var186);
                var152 = 1;
            } else if (arg0 == 5020) {
                String var187 = field1258[--Statics.field3923];
                if (var187.equalsIgnoreCase("toggleroof")) {
                    Statics.field521.field1223 = !Statics.field521.field1223;
                    class79.method499();
                    if (Statics.field521.field1223) {
                        class96.method83(99, "", "Roofs are now all hidden");
                    } else {
                        class96.method83(99, "", "Roofs will only be removed selectively");
                    }
                }
                if (var187.equalsIgnoreCase("displayfps")) {
                    client.field1076 = !client.field1076;
                }
                if (var187.equalsIgnoreCase("renderself")) {
                    client.field968 = !client.field968;
                }
                if (var187.equalsIgnoreCase("mouseovertext")) {
                    client.field997 = !client.field997;
                }
                if (client.field936 >= 2) {
                    if (var187.equalsIgnoreCase("aabb")) {
                        if (!class8.field227) {
                            class8.field227 = true;
                            class8.field224 = class12.field253;
                        } else if (class8.field224 == class12.field253) {
                            class8.field227 = true;
                            class8.field224 = class12.field257;
                        } else {
                            class8.field227 = false;
                        }
                    }
                    if (var187.equalsIgnoreCase("showcoord")) {
                        Statics.field3306.field4062 = !Statics.field3306.field4062;
                    }
                    if (var187.equalsIgnoreCase("fpson")) {
                        client.field1076 = true;
                    }
                    if (var187.equalsIgnoreCase("fpsoff")) {
                        client.field1076 = false;
                    }
                    if (var187.equalsIgnoreCase("gc")) {
                        System.gc();
                    }
                    if (var187.equalsIgnoreCase("clientdrop")) {
                        client.method238();
                    }
                    if (var187.equalsIgnoreCase("cs")) {
                        class96.method83(99, "", "" + client.field1068);
                    }
                    if (var187.equalsIgnoreCase("errortest") && client.field907 == 2) {
                        throw new RuntimeException();
                    }
                }
                class185 var188 = class185.method343(class182.field2426, client.field1073.field1457);
                var188.field2478.method3220(var187.length() + 1);
                var188.field2478.method3232(var187);
                client.field1073.method1916(var188);
                var152 = 1;
            } else if (arg0 == 5021) {
                client.field1065 = field1258[--Statics.field3923].toLowerCase().trim();
                var152 = 1;
            } else if (arg0 == 5022) {
                field1258[++Statics.field3923 - 1] = client.field1065;
                var152 = 1;
            } else {
                var152 = 2;
            }
            return var152;
        } else if (arg0 < 5400) {
            return method675(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            byte var194;
            if (arg0 == 5504) {
                Statics.field30 -= 2;
                int var192 = field1257[Statics.field30];
                int var193 = field1257[Statics.field30 + 1];
                if (!client.field852) {
                    client.field918 = var192;
                    client.field919 = var193;
                }
                var194 = 1;
            } else if (arg0 == 5505) {
                field1257[++Statics.field30 - 1] = client.field918;
                var194 = 1;
            } else if (arg0 == 5506) {
                field1257[++Statics.field30 - 1] = client.field919;
                var194 = 1;
            } else if (arg0 == 5530) {
                int var195 = field1257[--Statics.field30];
                if (var195 < 0) {
                    var195 = 0;
                }
                client.field925 = var195;
                var194 = 1;
            } else if (arg0 == 5531) {
                field1257[++Statics.field30 - 1] = client.field925;
                var194 = 1;
            } else {
                var194 = 2;
            }
            return var194;
        } else if (arg0 < 5700) {
            byte var196;
            if (arg0 == 5630) {
                client.field1037 = 250;
                var196 = 1;
            } else {
                var196 = 2;
            }
            return var196;
        } else if (arg0 < 6300) {
            return method1529(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method239(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method2463(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gd.i(ILcj;ZI)I")
    public static int method3145(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field30 -= 3;
            int var3 = field1257[Statics.field30];
            int var4 = field1257[Statics.field30 + 1];
            int var5 = field1257[Statics.field30 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class243 var6 = class243.method3168(var3);
            if (var6.field2898 == null) {
                var6.field2898 = new class243[var5 + 1];
            }
            if (var6.field2898.length <= var5) {
                class243[] var7 = new class243[var5 + 1];
                for (int var8 = 0; var8 < var6.field2898.length; var8++) {
                    var7[var8] = var6.field2898[var8];
                }
                var6.field2898 = var7;
            }
            if (var5 > 0 && var6.field2898[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class243 var9 = new class243();
            var9.field2820 = var4;
            var9.field2837 = var9.field2929 = var6.field2929;
            var9.field2859 = var5;
            var9.field2846 = true;
            var6.field2898[var5] = var9;
            if (arg2) {
                Statics.field2756 = var9;
            } else {
                Statics.field1261 = var9;
            }
            client.method942(var6);
            return 1;
        } else if (arg0 == 101) {
            class243 var10 = arg2 ? Statics.field2756 : Statics.field1261;
            class243 var11 = class243.method3168(var10.field2929);
            var11.field2898[var10.field2859] = null;
            client.method942(var11);
            return 1;
        } else if (arg0 == 102) {
            class243 var12 = class243.method3168(field1257[--Statics.field30]);
            var12.field2898 = null;
            client.method942(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field30 -= 2;
            int var13 = field1257[Statics.field30];
            int var14 = field1257[Statics.field30 + 1];
            class243 var15 = class243.method3087(var13, var14);
            if (var15 == null || var14 == -1) {
                field1257[++Statics.field30 - 1] = 0;
            } else {
                field1257[++Statics.field30 - 1] = 1;
                if (arg2) {
                    Statics.field2756 = var15;
                } else {
                    Statics.field1261 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class243 var16 = class243.method3168(field1257[--Statics.field30]);
            if (var16 == null) {
                field1257[++Statics.field30 - 1] = 0;
            } else {
                field1257[++Statics.field30 - 1] = 1;
                if (arg2) {
                    Statics.field2756 = var16;
                } else {
                    Statics.field1261 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.a(ILcj;ZI)I")
    public static int method1040(int arg0, class97 arg1, boolean arg2) {
        int var3 = -1;
        class243 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1257[--Statics.field30];
            var4 = class243.method3168(var3);
        } else {
            var4 = arg2 ? Statics.field2756 : Statics.field1261;
        }
        if (arg0 == 1000) {
            Statics.field30 -= 4;
            var4.field2913 = field1257[Statics.field30];
            var4.field2864 = field1257[Statics.field30 + 1];
            var4.field2823 = field1257[Statics.field30 + 2];
            var4.field2824 = field1257[Statics.field30 + 3];
            client.method942(var4);
            Statics.field3013.method1411(var4);
            if (var3 != -1 && var4.field2820 == 0) {
                client.method940(Statics.field2810[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field30 -= 4;
            var4.field2939 = field1257[Statics.field30];
            var4.field2807 = field1257[Statics.field30 + 1];
            var4.field2825 = field1257[Statics.field30 + 2];
            var4.field2826 = field1257[Statics.field30 + 3];
            client.method942(var4);
            Statics.field3013.method1411(var4);
            if (var3 != -1 && var4.field2820 == 0) {
                client.method940(Statics.field2810[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1257[--Statics.field30] == 1;
            if (var4.field2838 != var5) {
                var4.field2838 = var5;
                client.method942(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2951 = field1257[--Statics.field30] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2952 = field1257[--Statics.field30] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gs.l(ILcj;ZI)I")
    public static int method3174(int arg0, class97 arg1, boolean arg2) {
        int var3 = -1;
        class243 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1257[--Statics.field30];
            var4 = class243.method3168(var3);
        } else {
            var4 = arg2 ? Statics.field2756 : Statics.field1261;
        }
        if (arg0 == 1100) {
            Statics.field30 -= 2;
            var4.field2857 = field1257[Statics.field30];
            if (var4.field2857 > var4.field2841 - var4.field2833) {
                var4.field2857 = var4.field2841 - var4.field2833;
            }
            if (var4.field2857 < 0) {
                var4.field2857 = 0;
            }
            var4.field2829 = field1257[Statics.field30 + 1];
            if (var4.field2829 > var4.field2878 - var4.field2834) {
                var4.field2829 = var4.field2878 - var4.field2834;
            }
            if (var4.field2829 < 0) {
                var4.field2829 = 0;
            }
            client.method942(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2843 = field1257[--Statics.field30];
            client.method942(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2944 = field1257[--Statics.field30] == 1;
            client.method942(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2897 = field1257[--Statics.field30];
            client.method942(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2851 = field1257[--Statics.field30];
            client.method942(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2853 = field1257[--Statics.field30];
            client.method942(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2870 = field1257[--Statics.field30];
            client.method942(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2855 = field1257[--Statics.field30] == 1;
            client.method942(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2861 = 1;
            var4.field2862 = field1257[--Statics.field30];
            client.method942(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field30 -= 6;
            var4.field2867 = field1257[Statics.field30];
            var4.field2868 = field1257[Statics.field30 + 1];
            var4.field2869 = field1257[Statics.field30 + 2];
            var4.field2819 = field1257[Statics.field30 + 3];
            var4.field2871 = field1257[Statics.field30 + 4];
            var4.field2872 = field1257[Statics.field30 + 5];
            client.method942(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1257[--Statics.field30];
            if (var4.field2839 != var5) {
                var4.field2839 = var5;
                var4.field2940 = 0;
                var4.field2941 = 0;
                client.method942(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2875 = field1257[--Statics.field30] == 1;
            client.method942(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1258[--Statics.field3923];
            if (!var6.equals(var4.field2827)) {
                var4.field2827 = var6;
                client.method942(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2856 = field1257[--Statics.field30];
            client.method942(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field30 -= 3;
            var4.field2828 = field1257[Statics.field30];
            var4.field2882 = field1257[Statics.field30 + 1];
            var4.field2814 = field1257[Statics.field30 + 2];
            client.method942(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2883 = field1257[--Statics.field30] == 1;
            client.method942(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2844 = field1257[--Statics.field30];
            client.method942(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2858 = field1257[--Statics.field30];
            client.method942(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2847 = field1257[--Statics.field30] == 1;
            client.method942(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2860 = field1257[--Statics.field30] == 1;
            client.method942(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field30 -= 2;
            var4.field2841 = field1257[Statics.field30];
            var4.field2878 = field1257[Statics.field30 + 1];
            client.method942(var4);
            if (var3 != -1 && var4.field2820 == 0) {
                client.method940(Statics.field2810[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method4406(var4.field2929, var4.field2859);
            client.field1013 = var4;
            client.method942(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2881 = field1257[--Statics.field30];
            client.method942(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2880 = field1257[--Statics.field30];
            client.method942(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2953 = field1257[--Statics.field30];
            client.method942(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1257[--Statics.field30];
            class330[] var8 = new class330[] { class330.field3969, class330.field3971, class330.field3972, class330.field3970, class330.field3974 };
            class330 var9 = (class330) class190.method241(var8, var7);
            if (var9 != null) {
                var4.field2809 = var9;
                client.method942(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var10 = field1257[--Statics.field30] == 1;
            var4.field2852 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dr.b(ILcj;ZB)I")
    public static int method2083(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method3168(field1257[--Statics.field30]);
        } else {
            var3 = arg2 ? Statics.field2756 : Statics.field1261;
        }
        client.method942(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field30 -= 2;
            int var4 = field1257[Statics.field30];
            int var5 = field1257[Statics.field30 + 1];
            var3.field2938 = var4;
            var3.field2910 = var5;
            class284 var6 = class284.method1694(var4);
            var3.field2869 = var6.field3649;
            var3.field2819 = var6.field3663;
            var3.field2871 = var6.field3664;
            var3.field2867 = var6.field3665;
            var3.field2868 = var6.field3662;
            var3.field2872 = var6.field3661;
            if (arg0 == 1205) {
                var3.field2865 = 0;
            } else if (arg0 == 1212 | var6.field3646 == 1) {
                var3.field2865 = 1;
            } else {
                var3.field2865 = 2;
            }
            if (var3.field2873 > 0) {
                var3.field2872 = var3.field2872 * 32 / var3.field2873;
            } else if (var3.field2939 > 0) {
                var3.field2872 = var3.field2872 * 32 / var3.field2939;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2861 = 2;
            var3.field2862 = field1257[--Statics.field30];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2861 = 3;
            var3.field2862 = Statics.field434.field836.method4064();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bg.e(ILcj;ZB)I")
    public static int method726(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method3168(field1257[--Statics.field30]);
        } else {
            var3 = arg2 ? Statics.field2756 : Statics.field1261;
        }
        if (arg0 == 1300) {
            int var4 = field1257[--Statics.field30] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method4114(var4, field1258[--Statics.field3923]);
                return 1;
            } else {
                Statics.field3923--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field30 -= 2;
            int var5 = field1257[Statics.field30];
            int var6 = field1257[Statics.field30 + 1];
            var3.field2893 = class243.method3087(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2896 = field1257[--Statics.field30] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2818 = field1257[--Statics.field30];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2895 = field1257[--Statics.field30];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2891 = field1258[--Statics.field3923];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2831 = field1258[--Statics.field3923];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2892 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eo.x(ILcj;ZI)I")
    public static int method2832(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method3168(field1257[--Statics.field30]);
        } else {
            var3 = arg2 ? Statics.field2756 : Statics.field1261;
        }
        String var4 = field1258[--Statics.field3923];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1257[--Statics.field30];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1257[--Statics.field30];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1258[--Statics.field3923];
            } else {
                var7[var8] = Integer.valueOf(field1257[--Statics.field30]);
            }
        }
        int var9 = field1257[--Statics.field30];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2900 = var7;
        } else if (arg0 == 1401) {
            var3.field2903 = var7;
        } else if (arg0 == 1402) {
            var3.field2902 = var7;
        } else if (arg0 == 1403) {
            var3.field2904 = var7;
        } else if (arg0 == 1404) {
            var3.field2906 = var7;
        } else if (arg0 == 1405) {
            var3.field2907 = var7;
        } else if (arg0 == 1406) {
            var3.field2808 = var7;
        } else if (arg0 == 1407) {
            var3.field2911 = var7;
            var3.field2912 = var5;
        } else if (arg0 == 1408) {
            var3.field2917 = var7;
        } else if (arg0 == 1409) {
            var3.field2918 = var7;
        } else if (arg0 == 1410) {
            var3.field2908 = var7;
        } else if (arg0 == 1411) {
            var3.field2901 = var7;
        } else if (arg0 == 1412) {
            var3.field2905 = var7;
        } else if (arg0 == 1414) {
            var3.field2889 = var7;
            var3.field2914 = var5;
        } else if (arg0 == 1415) {
            var3.field2915 = var7;
            var3.field2916 = var5;
        } else if (arg0 == 1416) {
            var3.field2909 = var7;
        } else if (arg0 == 1417) {
            var3.field2928 = var7;
        } else if (arg0 == 1418) {
            var3.field2920 = var7;
        } else if (arg0 == 1419) {
            var3.field2921 = var7;
        } else if (arg0 == 1420) {
            var3.field2922 = var7;
        } else if (arg0 == 1421) {
            var3.field2923 = var7;
        } else if (arg0 == 1422) {
            var3.field2924 = var7;
        } else if (arg0 == 1423) {
            var3.field2925 = var7;
        } else if (arg0 == 1424) {
            var3.field2926 = var7;
        } else if (arg0 == 1425) {
            var3.field2874 = var7;
        } else if (arg0 == 1426) {
            var3.field2821 = var7;
        } else if (arg0 == 1427) {
            var3.field2927 = var7;
        } else {
            return 2;
        }
        var3.field2879 = true;
        return 1;
    }

    @ObfuscatedName("u.p(ILcj;ZI)I")
    public static int method76(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = arg2 ? Statics.field2756 : Statics.field1261;
        if (arg0 == 1800) {
            int[] var4 = field1257;
            int var5 = ++Statics.field30 - 1;
            int var6 = Statics.method78(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 1801) {
            int var8 = field1257[--Statics.field30];
            int var9 = var8 - 1;
            if (var3.field2892 == null || var9 >= var3.field2892.length || var3.field2892[var9] == null) {
                field1258[++Statics.field3923 - 1] = "";
            } else {
                field1258[++Statics.field3923 - 1] = var3.field2892[var9];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2891 == null) {
                field1258[++Statics.field3923 - 1] = "";
            } else {
                field1258[++Statics.field3923 - 1] = var3.field2891;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gt.o(ILcj;ZI)I")
    public static int method3475(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method3168(field1257[--Statics.field30]);
        } else {
            var3 = arg2 ? Statics.field2756 : Statics.field1261;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1264 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2927 == null) {
            return 0;
        } else {
            class69 var4 = new class69();
            var4.field791 = var3;
            var4.field788 = var3.field2927;
            var4.field787 = field1264 + 1;
            client.field1046.method3759(var4);
            return 1;
        }
    }

    @ObfuscatedName("cd.c(ILcj;ZI)I")
    public static int method1769(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = class243.method3168(field1257[--Statics.field30]);
        if (arg0 == 2500) {
            field1257[++Statics.field30 - 1] = var3.field2842;
            return 1;
        } else if (arg0 == 2501) {
            field1257[++Statics.field30 - 1] = var3.field2832;
            return 1;
        } else if (arg0 == 2502) {
            field1257[++Statics.field30 - 1] = var3.field2833;
            return 1;
        } else if (arg0 == 2503) {
            field1257[++Statics.field30 - 1] = var3.field2834;
            return 1;
        } else if (arg0 == 2504) {
            field1257[++Statics.field30 - 1] = var3.field2838 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field1257[++Statics.field30 - 1] = var3.field2837;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fd.u(ILcj;ZI)I")
    public static int method2994(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = class243.method3168(field1257[--Statics.field30]);
        if (arg0 == 2600) {
            field1257[++Statics.field30 - 1] = var3.field2857;
            return 1;
        } else if (arg0 == 2601) {
            field1257[++Statics.field30 - 1] = var3.field2829;
            return 1;
        } else if (arg0 == 2602) {
            field1258[++Statics.field3923 - 1] = var3.field2827;
            return 1;
        } else if (arg0 == 2603) {
            field1257[++Statics.field30 - 1] = var3.field2841;
            return 1;
        } else if (arg0 == 2604) {
            field1257[++Statics.field30 - 1] = var3.field2878;
            return 1;
        } else if (arg0 == 2605) {
            field1257[++Statics.field30 - 1] = var3.field2872;
            return 1;
        } else if (arg0 == 2606) {
            field1257[++Statics.field30 - 1] = var3.field2869;
            return 1;
        } else if (arg0 == 2607) {
            field1257[++Statics.field30 - 1] = var3.field2871;
            return 1;
        } else if (arg0 == 2608) {
            field1257[++Statics.field30 - 1] = var3.field2819;
            return 1;
        } else if (arg0 == 2609) {
            field1257[++Statics.field30 - 1] = var3.field2897;
            return 1;
        } else if (arg0 == 2610) {
            field1257[++Statics.field30 - 1] = var3.field2953;
            return 1;
        } else if (arg0 == 2611) {
            field1257[++Statics.field30 - 1] = var3.field2843;
            return 1;
        } else if (arg0 == 2612) {
            field1257[++Statics.field30 - 1] = var3.field2880;
            return 1;
        } else if (arg0 == 2613) {
            field1257[++Statics.field30 - 1] = var3.field2809.method12();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("z.k(ILcj;ZB)I")
    public static int method127(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class243 var3 = class243.method3168(field1257[--Statics.field30]);
            field1257[++Statics.field30 - 1] = var3.field2938;
            return 1;
        } else if (arg0 == 2701) {
            class243 var4 = class243.method3168(field1257[--Statics.field30]);
            if (var4.field2938 == -1) {
                field1257[++Statics.field30 - 1] = 0;
            } else {
                field1257[++Statics.field30 - 1] = var4.field2910;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field1257[--Statics.field30];
            class68 var6 = (class68) client.field1010.method3677((long) var5);
            if (var6 == null) {
                field1257[++Statics.field30 - 1] = 0;
            } else {
                field1257[++Statics.field30 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field1257[++Statics.field30 - 1] = client.field1009;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("au.z(ILcj;ZI)I")
    public static int method496(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = class243.method3168(field1257[--Statics.field30]);
        if (arg0 == 2800) {
            int[] var4 = field1257;
            int var5 = ++Statics.field30 - 1;
            int var6 = Statics.method78(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 2801) {
            int var8 = field1257[--Statics.field30];
            int var9 = var8 - 1;
            if (var3.field2892 == null || var9 >= var3.field2892.length || var3.field2892[var9] == null) {
                field1258[++Statics.field3923 - 1] = "";
            } else {
                field1258[++Statics.field3923 - 1] = var3.field2892[var9];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2891 == null) {
                field1258[++Statics.field3923 - 1] = "";
            } else {
                field1258[++Statics.field3923 - 1] = var3.field2891;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bs.w(ILcj;ZB)I")
    public static int method966(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1258[--Statics.field3923];
            class96.method83(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field30 -= 2;
            client.method3172(Statics.field434, field1257[Statics.field30], field1257[Statics.field30 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            class185 var4 = class185.method343(class182.field2400, client.field1073.field1457);
            client.field1073.method1916(var4);
            for (class68 var5 = (class68) client.field1010.method3667(); var5 != null; var5 = (class68) client.field1010.method3672()) {
                if (var5.field775 == 0 || var5.field775 == 3) {
                    Statics.method1828(var5, true);
                }
            }
            if (client.field1013 != null) {
                client.method942(client.field1013);
                client.field1013 = null;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var6 = field1258[--Statics.field3923];
            int var7 = 0;
            if (class319.method2962(var6)) {
                var7 = class319.method2933(var6);
            }
            class185 var8 = class185.method343(class182.field2370, client.field1073.field1457);
            var8.field2478.method3223(var7);
            client.field1073.method1916(var8);
            return 1;
        } else if (arg0 == 3105) {
            String var9 = field1258[--Statics.field3923];
            class185 var10 = class185.method343(class182.field2387, client.field1073.field1457);
            var10.field2478.method3220(var9.length() + 1);
            var10.field2478.method3232(var9);
            client.field1073.method1916(var10);
            return 1;
        } else if (arg0 == 3106) {
            String var11 = field1258[--Statics.field3923];
            class185 var12 = class185.method343(class182.field2424, client.field1073.field1457);
            var12.field2478.method3220(var11.length() + 1);
            var12.field2478.method3232(var11);
            client.field1073.method1916(var12);
            return 1;
        } else if (arg0 == 3107) {
            int var13 = field1257[--Statics.field30];
            String var14 = field1258[--Statics.field3923];
            int var15 = class94.field1397;
            int[] var16 = class94.field1398;
            boolean var17 = false;
            class306 var18 = new class306(var14, Statics.field613);
            for (int var19 = 0; var19 < var15; var19++) {
                class73 var20 = client.field965[var16[var19]];
                if (var20 != null && Statics.field434 != var20 && var20.field820 != null && var20.field820.equals(var18)) {
                    if (var13 == 1) {
                        class185 var21 = class185.method343(class182.field2447, client.field1073.field1457);
                        var21.field2478.method3318(0);
                        var21.field2478.method3272(var16[var19]);
                        client.field1073.method1916(var21);
                    } else if (var13 == 4) {
                        class185 var22 = class185.method343(class182.field2361, client.field1073.field1457);
                        var22.field2478.method3261(0);
                        var22.field2478.method3272(var16[var19]);
                        client.field1073.method1916(var22);
                    } else if (var13 == 6) {
                        class185 var23 = class185.method343(class182.field2351, client.field1073.field1457);
                        var23.field2478.method3220(0);
                        var23.field2478.method3323(var16[var19]);
                        client.field1073.method1916(var23);
                    } else if (var13 == 7) {
                        class185 var24 = class185.method343(class182.field2434, client.field1073.field1457);
                        var24.field2478.method3261(0);
                        var24.field2478.method3269(var16[var19]);
                        client.field1073.method1916(var24);
                    }
                    var17 = true;
                    break;
                }
            }
            if (!var17) {
                class96.method83(4, "", class252.field3171 + var14);
            }
            return 1;
        } else if (arg0 == 3108) {
            Statics.field30 -= 3;
            int var25 = field1257[Statics.field30];
            int var26 = field1257[Statics.field30 + 1];
            int var27 = field1257[Statics.field30 + 2];
            class243 var28 = class243.method3168(var27);
            client.method495(var28, var25, var26);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field30 -= 2;
            int var29 = field1257[Statics.field30];
            int var30 = field1257[Statics.field30 + 1];
            class243 var31 = arg2 ? Statics.field2756 : Statics.field1261;
            client.method495(var31, var29, var30);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field2112 = field1257[--Statics.field30] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1257[++Statics.field30 - 1] = Statics.field521.field1223 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field521.field1223 = field1257[--Statics.field30] == 1;
            class79.method499();
            return 1;
        } else if (arg0 == 3113) {
            String var32 = field1258[--Statics.field3923];
            boolean var33 = field1257[--Statics.field30] == 1;
            class58.method979(var32, var33, false);
            return 1;
        } else if (arg0 == 3115) {
            int var34 = field1257[--Statics.field30];
            class185 var35 = class185.method343(class182.field2395, client.field1073.field1457);
            var35.field2478.method3323(var34);
            client.field1073.method1916(var35);
            return 1;
        } else if (arg0 == 3116) {
            int var36 = field1257[--Statics.field30];
            Statics.field3923 -= 2;
            String var37 = field1258[Statics.field3923];
            String var38 = field1258[Statics.field3923 + 1];
            if (var37.length() > 500) {
                return 1;
            } else if (var38.length() > 500) {
                return 1;
            } else {
                class185 var39 = class185.method343(class182.field2389, client.field1073.field1457);
                var39.field2478.method3323(1 + class195.method126(var37) + class195.method126(var38));
                var39.field2478.method3261(var36);
                var39.field2478.method3232(var38);
                var39.field2478.method3232(var37);
                client.field1073.method1916(var39);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field995 = field1257[--Statics.field30] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field997 = field1257[--Statics.field30] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field968 = field1257[--Statics.field30] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1257[--Statics.field30] == 1) {
                client.field969 |= 0x1;
            } else {
                client.field969 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1257[--Statics.field30] == 1) {
                client.field969 |= 0x2;
            } else {
                client.field969 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1257[--Statics.field30] == 1) {
                client.field969 |= 0x4;
            } else {
                client.field969 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1257[--Statics.field30] == 1) {
                client.field969 |= 0x8;
            } else {
                client.field969 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field969 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field954 = field1257[--Statics.field30] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field964 = field1257[--Statics.field30] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method341(field1257[--Statics.field30] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field1257[++Statics.field30 - 1] = client.method580() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field30 -= 2;
            client.field1116 = field1257[Statics.field30];
            client.field858 = field1257[Statics.field30 + 1];
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("de.s(ILcj;ZI)I")
    public static int method2343(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1257[++Statics.field30 - 1] = client.field1108;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field30 -= 2;
            int var3 = field1257[Statics.field30];
            int var4 = field1257[Statics.field30 + 1];
            field1257[++Statics.field30 - 1] = class66.method51(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field30 -= 2;
            int var5 = field1257[Statics.field30];
            int var6 = field1257[Statics.field30 + 1];
            field1257[++Statics.field30 - 1] = Statics.method720(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field30 -= 2;
            int var7 = field1257[Statics.field30];
            int var8 = field1257[Statics.field30 + 1];
            field1257[++Statics.field30 - 1] = class66.method48(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1257[--Statics.field30];
            int[] var10 = field1257;
            int var11 = ++Statics.field30 - 1;
            class268 var12 = (class268) class268.field3445.method3625((long) var9);
            class268 var13;
            if (var12 == null) {
                byte[] var14 = Statics.field3444.method4265(5, var9);
                class268 var15 = new class268();
                if (var14 != null) {
                    var15.method4363(new class195(var14));
                }
                class268.field3445.method3627(var15, (long) var9);
                var13 = var15;
            } else {
                var13 = var12;
            }
            var10[var11] = var13.field3446;
            return 1;
        } else if (arg0 == 3305) {
            int var16 = field1257[--Statics.field30];
            field1257[++Statics.field30 - 1] = client.field948[var16];
            return 1;
        } else if (arg0 == 3306) {
            int var17 = field1257[--Statics.field30];
            field1257[++Statics.field30 - 1] = client.field1031[var17];
            return 1;
        } else if (arg0 == 3307) {
            int var18 = field1257[--Statics.field30];
            field1257[++Statics.field30 - 1] = client.field983[var18];
            return 1;
        } else if (arg0 == 3308) {
            int var19 = Statics.field3841;
            int var20 = (Statics.field434.field1175 >> 7) + Statics.field494;
            int var21 = (Statics.field434.field1138 >> 7) + Statics.field2794;
            field1257[++Statics.field30 - 1] = (var19 << 28) + (var20 << 14) + var21;
            return 1;
        } else if (arg0 == 3309) {
            int var22 = field1257[--Statics.field30];
            field1257[++Statics.field30 - 1] = var22 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var23 = field1257[--Statics.field30];
            field1257[++Statics.field30 - 1] = var23 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var24 = field1257[--Statics.field30];
            field1257[++Statics.field30 - 1] = var24 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1257[++Statics.field30 - 1] = client.field854 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field30 -= 2;
            int var25 = field1257[Statics.field30] + 32768;
            int var26 = field1257[Statics.field30 + 1];
            field1257[++Statics.field30 - 1] = class66.method51(var25, var26);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field30 -= 2;
            int var27 = field1257[Statics.field30] + 32768;
            int var28 = field1257[Statics.field30 + 1];
            int[] var29 = field1257;
            int var30 = ++Statics.field30 - 1;
            class66 var31 = (class66) class66.field744.method3677((long) var27);
            int var32;
            if (var31 == null) {
                var32 = 0;
            } else if (var28 >= 0 && var28 < var31.field748.length) {
                var32 = var31.field748[var28];
            } else {
                var32 = 0;
            }
            var29[var30] = var32;
            return 1;
        } else if (arg0 == 3315) {
            Statics.field30 -= 2;
            int var33 = field1257[Statics.field30] + 32768;
            int var34 = field1257[Statics.field30 + 1];
            field1257[++Statics.field30 - 1] = class66.method48(var33, var34);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field936 >= 2) {
                field1257[++Statics.field30 - 1] = client.field936;
            } else {
                field1257[++Statics.field30 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1257[++Statics.field30 - 1] = client.field866;
            return 1;
        } else if (arg0 == 3318) {
            field1257[++Statics.field30 - 1] = client.field850;
            return 1;
        } else if (arg0 == 3321) {
            field1257[++Statics.field30 - 1] = client.field1014;
            return 1;
        } else if (arg0 == 3322) {
            field1257[++Statics.field30 - 1] = client.field863;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field1018) {
                field1257[++Statics.field30 - 1] = 1;
            } else {
                field1257[++Statics.field30 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1257[++Statics.field30 - 1] = client.field851;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field30 -= 4;
            int var35 = field1257[Statics.field30];
            int var36 = field1257[Statics.field30 + 1];
            int var37 = field1257[Statics.field30 + 2];
            int var38 = field1257[Statics.field30 + 3];
            int var39 = (var36 << 14) + var35;
            int var40 = (var37 << 28) + var39;
            int var41 = var38 + var40;
            field1257[++Statics.field30 - 1] = var41;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cb.d(ILcj;ZI)I")
    public static int method1576(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field2030.field1229 == 0) {
                field1257[++Statics.field30 - 1] = -2;
            } else if (Statics.field2030.field1229 == 1) {
                field1257[++Statics.field30 - 1] = -1;
            } else {
                field1257[++Statics.field30 - 1] = Statics.field2030.field1230.method4908();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1257[--Statics.field30];
            if (Statics.field2030.method1580() && var3 >= 0 && var3 < Statics.field2030.field1230.method4908()) {
                class307 var4 = (class307) Statics.field2030.field1230.method4918(var3);
                field1258[++Statics.field3923 - 1] = var4.method4874();
                field1258[++Statics.field3923 - 1] = var4.method4857();
            } else {
                field1258[++Statics.field3923 - 1] = "";
                field1258[++Statics.field3923 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field1257[--Statics.field30];
            if (Statics.field2030.method1580() && var5 >= 0 && var5 < Statics.field2030.field1230.method4908()) {
                field1257[++Statics.field30 - 1] = ((class302) Statics.field2030.field1230.method4918(var5)).field3845;
            } else {
                field1257[++Statics.field30 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field1257[--Statics.field30];
            if (Statics.field2030.method1580() && var6 >= 0 && var6 < Statics.field2030.field1230.method4908()) {
                field1257[++Statics.field30 - 1] = ((class302) Statics.field2030.field1230.method4918(var6)).field3844;
            } else {
                field1257[++Statics.field30 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field1258[--Statics.field3923];
            int var8 = field1257[--Statics.field30];
            class185 var9 = class185.method343(class182.field2401, client.field1073.field1457);
            var9.field2478.method3220(class195.method126(var7) + 1);
            var9.field2478.method3232(var7);
            var9.field2478.method3411(var8);
            client.field1073.method1916(var9);
            return 1;
        } else if (arg0 == 3605) {
            String var10 = field1258[--Statics.field3923];
            Statics.field2030.method1641(var10);
            return 1;
        } else if (arg0 == 3606) {
            String var11 = field1258[--Statics.field3923];
            Statics.field2030.method1591(var11);
            return 1;
        } else if (arg0 == 3607) {
            String var12 = field1258[--Statics.field3923];
            Statics.field2030.method1628(var12);
            return 1;
        } else if (arg0 == 3608) {
            String var13 = field1258[--Statics.field3923];
            Statics.field2030.method1592(var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field1258[--Statics.field3923];
            String var15 = client.method1046(var14);
            field1257[++Statics.field30 - 1] = Statics.field2030.method1585(new class306(var15, Statics.field613), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field616 == null) {
                field1258[++Statics.field3923 - 1] = "";
            } else {
                field1258[++Statics.field3923 - 1] = Statics.field616.field3872;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field616 == null) {
                field1257[++Statics.field30 - 1] = 0;
            } else {
                field1257[++Statics.field30 - 1] = Statics.field616.method4908();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field1257[--Statics.field30];
            if (Statics.field616 == null || var16 >= Statics.field616.method4908()) {
                field1258[++Statics.field3923 - 1] = "";
            } else {
                field1258[++Statics.field3923 - 1] = Statics.field616.method4918(var16).method4856().method5022();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field1257[--Statics.field30];
            if (Statics.field616 == null || var17 >= Statics.field616.method4908()) {
                field1257[++Statics.field30 - 1] = 0;
            } else {
                field1257[++Statics.field30 - 1] = ((class302) Statics.field616.method4918(var17)).method4997();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field1257[--Statics.field30];
            if (Statics.field616 == null || var18 >= Statics.field616.method4908()) {
                field1257[++Statics.field30 - 1] = 0;
            } else {
                field1257[++Statics.field30 - 1] = ((class302) Statics.field616.method4918(var18)).field3844;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1257[++Statics.field30 - 1] = Statics.field616 == null ? 0 : Statics.field616.field3866;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field1258[--Statics.field3923];
            client.method1039(var19);
            return 1;
        } else if (arg0 == 3618) {
            field1257[++Statics.field30 - 1] = Statics.field616 == null ? 0 : Statics.field616.field3871;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field1258[--Statics.field3923];
            if (!var20.equals("")) {
                class185 var21 = class185.method343(class182.field2429, client.field1073.field1457);
                var21.field2478.method3220(class195.method126(var20));
                var21.field2478.method3232(var20);
                client.field1073.method1916(var21);
            }
            return 1;
        } else if (arg0 == 3620) {
            client.method1849();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field2030.method1580()) {
                field1257[++Statics.field30 - 1] = Statics.field2030.field1234.method4908();
            } else {
                field1257[++Statics.field30 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var22 = field1257[--Statics.field30];
            if (Statics.field2030.method1580() && var22 >= 0 && var22 < Statics.field2030.field1234.method4908()) {
                class301 var23 = (class301) Statics.field2030.field1234.method4918(var22);
                field1258[++Statics.field3923 - 1] = var23.method4874();
                field1258[++Statics.field3923 - 1] = var23.method4857();
            } else {
                field1258[++Statics.field3923 - 1] = "";
                field1258[++Statics.field3923 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var24 = field1258[--Statics.field3923];
            String var25 = client.method1046(var24);
            field1257[++Statics.field30 - 1] = Statics.field2030.method1586(new class306(var25, Statics.field613)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var26 = field1257[--Statics.field30];
            if (Statics.field616 == null || var26 >= Statics.field616.method4908() || !Statics.field616.method4918(var26).method4856().equals(Statics.field434.field820)) {
                field1257[++Statics.field30 - 1] = 0;
            } else {
                field1257[++Statics.field30 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field616 == null || Statics.field616.field3869 == null) {
                field1258[++Statics.field3923 - 1] = "";
            } else {
                field1258[++Statics.field3923 - 1] = Statics.field616.field3869;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var27 = field1257[--Statics.field30];
            if (Statics.field616 == null || var27 >= Statics.field616.method4908() || !((class296) Statics.field616.method4918(var27)).method4839()) {
                field1257[++Statics.field30 - 1] = 0;
            } else {
                field1257[++Statics.field30 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var28 = field1257[--Statics.field30];
            if (Statics.field616 == null || var28 >= Statics.field616.method4908() || !((class296) Statics.field616.method4918(var28)).method4854()) {
                field1257[++Statics.field30 - 1] = 0;
            } else {
                field1257[++Statics.field30 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field2030.field1230.method4927();
            return 1;
        } else if (arg0 == 3629) {
            boolean var29 = field1257[--Statics.field30] == 1;
            Statics.field2030.field1230.method4943(new class322(var29));
            return 1;
        } else if (arg0 == 3630) {
            boolean var30 = field1257[--Statics.field30] == 1;
            Statics.field2030.field1230.method4943(new class323(var30));
            return 1;
        } else if (arg0 == 3631) {
            boolean var31 = field1257[--Statics.field30] == 1;
            Statics.field2030.field1230.method4943(new class156(var31));
            return 1;
        } else if (arg0 == 3632) {
            boolean var32 = field1257[--Statics.field30] == 1;
            Statics.field2030.field1230.method4943(new class150(var32));
            return 1;
        } else if (arg0 == 3633) {
            boolean var33 = field1257[--Statics.field30] == 1;
            Statics.field2030.field1230.method4943(new class155(var33));
            return 1;
        } else if (arg0 == 3634) {
            boolean var34 = field1257[--Statics.field30] == 1;
            Statics.field2030.field1230.method4943(new class158(var34));
            return 1;
        } else if (arg0 == 3635) {
            boolean var35 = field1257[--Statics.field30] == 1;
            Statics.field2030.field1230.method4943(new class154(var35));
            return 1;
        } else if (arg0 == 3636) {
            boolean var36 = field1257[--Statics.field30] == 1;
            Statics.field2030.field1230.method4943(new class152(var36));
            return 1;
        } else if (arg0 == 3637) {
            boolean var37 = field1257[--Statics.field30] == 1;
            Statics.field2030.field1230.method4943(new class151(var37));
            return 1;
        } else if (arg0 == 3638) {
            boolean var38 = field1257[--Statics.field30] == 1;
            Statics.field2030.field1230.method4943(new class153(var38));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field2030.field1230.method4919();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field2030.field1234.method4927();
            return 1;
        } else if (arg0 == 3641) {
            boolean var39 = field1257[--Statics.field30] == 1;
            Statics.field2030.field1234.method4943(new class322(var39));
            return 1;
        } else if (arg0 == 3642) {
            boolean var40 = field1257[--Statics.field30] == 1;
            Statics.field2030.field1234.method4943(new class323(var40));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field2030.field1234.method4919();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field616 != null) {
                Statics.field616.method4927();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var41 = field1257[--Statics.field30] == 1;
            if (Statics.field616 != null) {
                Statics.field616.method4943(new class322(var41));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var42 = field1257[--Statics.field30] == 1;
            if (Statics.field616 != null) {
                Statics.field616.method4943(new class323(var42));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var43 = field1257[--Statics.field30] == 1;
            if (Statics.field616 != null) {
                Statics.field616.method4943(new class156(var43));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var44 = field1257[--Statics.field30] == 1;
            if (Statics.field616 != null) {
                Statics.field616.method4943(new class150(var44));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var45 = field1257[--Statics.field30] == 1;
            if (Statics.field616 != null) {
                Statics.field616.method4943(new class155(var45));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var46 = field1257[--Statics.field30] == 1;
            if (Statics.field616 != null) {
                Statics.field616.method4943(new class158(var46));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var47 = field1257[--Statics.field30] == 1;
            if (Statics.field616 != null) {
                Statics.field616.method4943(new class154(var47));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var48 = field1257[--Statics.field30] == 1;
            if (Statics.field616 != null) {
                Statics.field616.method4943(new class152(var48));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var49 = field1257[--Statics.field30] == 1;
            if (Statics.field616 != null) {
                Statics.field616.method4943(new class151(var49));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var50 = field1257[--Statics.field30] == 1;
            if (Statics.field616 != null) {
                Statics.field616.method4943(new class153(var50));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field616 != null) {
                Statics.field616.method4919();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var51 = field1257[--Statics.field30] == 1;
            Statics.field2030.field1230.method4943(new class157(var51));
            return 1;
        } else if (arg0 == 3657) {
            boolean var52 = field1257[--Statics.field30] == 1;
            if (Statics.field616 != null) {
                Statics.field616.method4943(new class157(var52));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gh.f(ILcj;ZI)I")
    public static int method3204(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1257[--Statics.field30];
            field1257[++Statics.field30 - 1] = client.field1113[var3].method93();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1257[--Statics.field30];
            field1257[++Statics.field30 - 1] = client.field1113[var4].field286;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1257[--Statics.field30];
            field1257[++Statics.field30 - 1] = client.field1113[var5].field288;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1257[--Statics.field30];
            field1257[++Statics.field30 - 1] = client.field1113[var6].field294;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1257[--Statics.field30];
            field1257[++Statics.field30 - 1] = client.field1113[var7].field289;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1257[--Statics.field30];
            field1257[++Statics.field30 - 1] = client.field1113[var8].field287;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1257[--Statics.field30];
            int var10 = client.field1113[var9].method100();
            field1257[++Statics.field30 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1257[--Statics.field30];
            int var12 = client.field1113[var11].method100();
            field1257[++Statics.field30 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1257[--Statics.field30];
            int var14 = client.field1113[var13].method100();
            field1257[++Statics.field30 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1257[--Statics.field30];
            int var16 = client.field1113[var15].method100();
            field1257[++Statics.field30 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1257[--Statics.field30] == 1;
            if (Statics.field2062 != null) {
                Statics.field2062.method63(class14.field269, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1257[--Statics.field30] == 1;
            if (Statics.field2062 != null) {
                Statics.field2062.method63(class14.field273, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field30 -= 2;
            boolean var19 = field1257[Statics.field30] == 1;
            boolean var20 = field1257[Statics.field30 + 1] == 1;
            if (Statics.field2062 != null) {
                client.field1114.field847 = var20;
                Statics.field2062.method63(client.field1114, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1257[--Statics.field30] == 1;
            if (Statics.field2062 != null) {
                Statics.field2062.method63(class14.field267, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1257[--Statics.field30] == 1;
            if (Statics.field2062 != null) {
                Statics.field2062.method63(class14.field265, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1257[++Statics.field30 - 1] = Statics.field2062 == null ? 0 : Statics.field2062.field266.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1257[--Statics.field30];
            class15 var24 = (class15) Statics.field2062.field266.get(var23);
            field1257[++Statics.field30 - 1] = var24.field276;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1257[--Statics.field30];
            class15 var26 = (class15) Statics.field2062.field266.get(var25);
            field1258[++Statics.field3923 - 1] = var26.method70();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1257[--Statics.field30];
            class15 var28 = (class15) Statics.field2062.field266.get(var27);
            field1258[++Statics.field3923 - 1] = var28.method72();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1257[--Statics.field30];
            class15 var30 = (class15) Statics.field2062.field266.get(var29);
            long var31 = Statics.method426() - Statics.field2604 - var30.field275;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1258[++Statics.field3923 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1257[--Statics.field30];
            class15 var38 = (class15) Statics.field2062.field266.get(var37);
            field1257[++Statics.field30 - 1] = var38.field282.field294;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1257[--Statics.field30];
            class15 var40 = (class15) Statics.field2062.field266.get(var39);
            field1257[++Statics.field30 - 1] = var40.field282.field288;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1257[--Statics.field30];
            class15 var42 = (class15) Statics.field2062.field266.get(var41);
            field1257[++Statics.field30 - 1] = var42.field282.field286;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ab.r(ILcj;ZB)I")
    public static int method675(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1257[++Statics.field30 - 1] = client.method727();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1257[--Statics.field30];
            if (var3 == 1 || var3 == 2) {
                client.method528(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1257[++Statics.field30 - 1] = Statics.field521.field1221;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1257[--Statics.field30];
            if (var4 == 1 || var4 == 2) {
                Statics.field521.field1221 = var4;
                class79.method499();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bp.y(ILcj;ZI)I")
    public static int method1529(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field30 -= 2;
            client.field1053 = (short) field1257[Statics.field30];
            if (client.field1053 <= 0) {
                client.field1053 = 256;
            }
            client.field1098 = (short) field1257[Statics.field30 + 1];
            if (client.field1098 <= 0) {
                client.field1098 = 205;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field30 -= 2;
            client.field923 = (short) field1257[Statics.field30];
            if (client.field923 <= 0) {
                client.field923 = 256;
            }
            client.field1100 = (short) field1257[Statics.field30 + 1];
            if (client.field1100 <= 0) {
                client.field1100 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field30 -= 4;
            client.field1101 = (short) field1257[Statics.field30];
            if (client.field1101 <= 0) {
                client.field1101 = 1;
            }
            client.field1102 = (short) field1257[Statics.field30 + 1];
            if (client.field1102 <= 0) {
                client.field1102 = 32767;
            } else if (client.field1102 < client.field1101) {
                client.field1102 = client.field1101;
            }
            client.field1103 = (short) field1257[Statics.field30 + 2];
            if (client.field1103 <= 0) {
                client.field1103 = 1;
            }
            client.field1104 = (short) field1257[Statics.field30 + 3];
            if (client.field1104 <= 0) {
                client.field1104 = 32767;
            } else if (client.field1104 < client.field1103) {
                client.field1104 = client.field1103;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field1062 == null) {
                field1257[++Statics.field30 - 1] = -1;
                field1257[++Statics.field30 - 1] = -1;
            } else {
                client.method342(0, 0, client.field1062.field2833, client.field1062.field2834, false);
                field1257[++Statics.field30 - 1] = client.field1107;
                field1257[++Statics.field30 - 1] = client.field946;
            }
            return 1;
        } else if (arg0 == 6204) {
            field1257[++Statics.field30 - 1] = client.field923;
            field1257[++Statics.field30 - 1] = client.field1100;
            return 1;
        } else if (arg0 == 6205) {
            field1257[++Statics.field30 - 1] = client.field1053;
            field1257[++Statics.field30 - 1] = client.field1098;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aj.h(ILcj;ZI)I")
    public static int method239(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1257[++Statics.field30 - 1] = class78.method2920() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class78.field1212 = 0;
            class78 var3 = class78.method1736();
            if (var3 == null) {
                field1257[++Statics.field30 - 1] = -1;
                field1257[++Statics.field30 - 1] = 0;
                field1258[++Statics.field3923 - 1] = "";
                field1257[++Statics.field30 - 1] = 0;
                field1257[++Statics.field30 - 1] = 0;
                field1258[++Statics.field3923 - 1] = "";
            } else {
                field1257[++Statics.field30 - 1] = var3.field1213;
                field1257[++Statics.field30 - 1] = var3.field1217;
                field1258[++Statics.field3923 - 1] = var3.field1218;
                field1257[++Statics.field30 - 1] = var3.field1210;
                field1257[++Statics.field30 - 1] = var3.field1215;
                field1258[++Statics.field3923 - 1] = var3.field1209;
            }
            return 1;
        } else if (arg0 == 6502) {
            class78 var5 = class78.method1736();
            if (var5 == null) {
                field1257[++Statics.field30 - 1] = -1;
                field1257[++Statics.field30 - 1] = 0;
                field1258[++Statics.field3923 - 1] = "";
                field1257[++Statics.field30 - 1] = 0;
                field1257[++Statics.field30 - 1] = 0;
                field1258[++Statics.field3923 - 1] = "";
            } else {
                field1257[++Statics.field30 - 1] = var5.field1213;
                field1257[++Statics.field30 - 1] = var5.field1217;
                field1258[++Statics.field3923 - 1] = var5.field1218;
                field1257[++Statics.field30 - 1] = var5.field1210;
                field1257[++Statics.field30 - 1] = var5.field1215;
                field1258[++Statics.field3923 - 1] = var5.field1209;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var6 = field1257[--Statics.field30];
            class78 var7 = null;
            for (int var8 = 0; var8 < class78.field1208; var8++) {
                if (Statics.field1207[var8].field1213 == var6) {
                    var7 = Statics.field1207[var8];
                    break;
                }
            }
            if (var7 == null) {
                field1257[++Statics.field30 - 1] = -1;
                field1257[++Statics.field30 - 1] = 0;
                field1258[++Statics.field3923 - 1] = "";
                field1257[++Statics.field30 - 1] = 0;
                field1257[++Statics.field30 - 1] = 0;
                field1258[++Statics.field3923 - 1] = "";
            } else {
                field1257[++Statics.field30 - 1] = var7.field1213;
                field1257[++Statics.field30 - 1] = var7.field1217;
                field1258[++Statics.field3923 - 1] = var7.field1218;
                field1257[++Statics.field30 - 1] = var7.field1210;
                field1257[++Statics.field30 - 1] = var7.field1215;
                field1258[++Statics.field3923 - 1] = var7.field1209;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field30 -= 4;
            int var9 = field1257[Statics.field30];
            boolean var10 = field1257[Statics.field30 + 1] == 1;
            int var11 = field1257[Statics.field30 + 2];
            boolean var12 = field1257[Statics.field30 + 3] == 1;
            class78.method105(var9, var10, var11, var12);
            return 1;
        } else if (arg0 == 6511) {
            int var13 = field1257[--Statics.field30];
            if (var13 >= 0 && var13 < class78.field1208) {
                class78 var14 = Statics.field1207[var13];
                field1257[++Statics.field30 - 1] = var14.field1213;
                field1257[++Statics.field30 - 1] = var14.field1217;
                field1258[++Statics.field3923 - 1] = var14.field1218;
                field1257[++Statics.field30 - 1] = var14.field1210;
                field1257[++Statics.field30 - 1] = var14.field1215;
                field1258[++Statics.field3923 - 1] = var14.field1209;
            } else {
                field1257[++Statics.field30 - 1] = -1;
                field1257[++Statics.field30 - 1] = 0;
                field1258[++Statics.field3923 - 1] = "";
                field1257[++Statics.field30 - 1] = 0;
                field1257[++Statics.field30 - 1] = 0;
                field1258[++Statics.field3923 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field994 = field1257[--Statics.field30] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field30 -= 2;
            int var15 = field1257[Statics.field30];
            int var16 = field1257[Statics.field30 + 1];
            class279 var17 = class279.method1768(var16);
            if (var17.method4502()) {
                field1258[++Statics.field3923 - 1] = class286.method4012(var15).method4727(var16, var17.field3548);
            } else {
                field1257[++Statics.field30 - 1] = class286.method4012(var15).method4726(var16, var17.field3551);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field30 -= 2;
            int var18 = field1257[Statics.field30];
            int var19 = field1257[Statics.field30 + 1];
            class279 var20 = class279.method1768(var19);
            if (var20.method4502()) {
                field1258[++Statics.field3923 - 1] = class283.method4427(var18).method4604(var19, var20.field3548);
            } else {
                field1257[++Statics.field30 - 1] = class283.method4427(var18).method4611(var19, var20.field3551);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field30 -= 2;
            int var21 = field1257[Statics.field30];
            int var22 = field1257[Statics.field30 + 1];
            class279 var23 = class279.method1768(var22);
            if (var23.method4502()) {
                field1258[++Statics.field3923 - 1] = class284.method1694(var21).method4665(var22, var23.field3548);
            } else {
                field1257[++Statics.field30 - 1] = class284.method1694(var21).method4664(var22, var23.field3551);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field30 -= 2;
            int var24 = field1257[Statics.field30];
            int var25 = field1257[Statics.field30 + 1];
            class279 var26 = class279.method1768(var25);
            if (var26.method4502()) {
                field1258[++Statics.field3923 - 1] = class280.method1530(var24).method4523(var25, var26.field3548);
            } else {
                field1257[++Statics.field30 - 1] = class280.method1530(var24).method4521(var25, var26.field3551);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1257[++Statics.field30 - 1] = 0;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eb.av(ILcj;ZB)I")
    public static int method2463(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field3841;
            int var4 = (Statics.field434.field1175 >> 7) + Statics.field494;
            int var5 = (Statics.field434.field1138 >> 7) + Statics.field2794;
            client.method2919().method5628(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1257[--Statics.field30];
            String var7 = "";
            class33 var8 = client.method2919().method5573(var6);
            if (var8 != null) {
                var7 = var8.method262();
            }
            field1258[++Statics.field3923 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1257[--Statics.field30];
            client.method2919().method5716(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1257[++Statics.field30 - 1] = client.method2919().method5561();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1257[--Statics.field30];
            client.method2919().method5568(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1257[++Statics.field30 - 1] = client.method2919().method5606() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class239 var11 = new class239(field1257[--Statics.field30]);
            client.method2919().method5603(var11.field2777, var11.field2776);
            return 1;
        } else if (arg0 == 6607) {
            class239 var12 = new class239(field1257[--Statics.field30]);
            client.method2919().method5575(var12.field2777, var12.field2776);
            return 1;
        } else if (arg0 == 6608) {
            class239 var13 = new class239(field1257[--Statics.field30]);
            client.method2919().method5576(var13.field2778, var13.field2777, var13.field2776);
            return 1;
        } else if (arg0 == 6609) {
            class239 var14 = new class239(field1257[--Statics.field30]);
            client.method2919().method5577(var14.field2778, var14.field2777, var14.field2776);
            return 1;
        } else if (arg0 == 6610) {
            field1257[++Statics.field30 - 1] = client.method2919().method5688();
            field1257[++Statics.field30 - 1] = client.method2919().method5579();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1257[--Statics.field30];
            class33 var16 = client.method2919().method5573(var15);
            if (var16 == null) {
                field1257[++Statics.field30 - 1] = 0;
            } else {
                field1257[++Statics.field30 - 1] = var16.method321().method4038();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1257[--Statics.field30];
            class33 var18 = client.method2919().method5573(var17);
            if (var18 == null) {
                field1257[++Statics.field30 - 1] = 0;
                field1257[++Statics.field30 - 1] = 0;
            } else {
                field1257[++Statics.field30 - 1] = (var18.method265() - var18.method264() + 1) * 64;
                field1257[++Statics.field30 - 1] = (var18.method267() - var18.method266() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1257[--Statics.field30];
            class33 var20 = client.method2919().method5573(var19);
            if (var20 == null) {
                field1257[++Statics.field30 - 1] = 0;
                field1257[++Statics.field30 - 1] = 0;
                field1257[++Statics.field30 - 1] = 0;
                field1257[++Statics.field30 - 1] = 0;
            } else {
                field1257[++Statics.field30 - 1] = var20.method264() * 64;
                field1257[++Statics.field30 - 1] = var20.method266() * 64;
                field1257[++Statics.field30 - 1] = var20.method265() * 64 + 64 - 1;
                field1257[++Statics.field30 - 1] = var20.method267() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1257[--Statics.field30];
            class33 var22 = client.method2919().method5573(var21);
            if (var22 == null) {
                field1257[++Statics.field30 - 1] = -1;
            } else {
                field1257[++Statics.field30 - 1] = var22.method328();
            }
            return 1;
        } else if (arg0 == 6615) {
            class239 var23 = client.method2919().method5580();
            if (var23 == null) {
                field1257[++Statics.field30 - 1] = -1;
                field1257[++Statics.field30 - 1] = -1;
            } else {
                field1257[++Statics.field30 - 1] = var23.field2777;
                field1257[++Statics.field30 - 1] = var23.field2776;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1257[++Statics.field30 - 1] = client.method2919().method5558();
            return 1;
        } else if (arg0 == 6617) {
            class239 var24 = new class239(field1257[--Statics.field30]);
            class33 var25 = client.method2919().method5663();
            if (var25 == null) {
                field1257[++Statics.field30 - 1] = -1;
                field1257[++Statics.field30 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method260(var24.field2778, var24.field2777, var24.field2776);
            if (var26 == null) {
                field1257[++Statics.field30 - 1] = -1;
                field1257[++Statics.field30 - 1] = -1;
            } else {
                field1257[++Statics.field30 - 1] = var26[0];
                field1257[++Statics.field30 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class239 var27 = new class239(field1257[--Statics.field30]);
            class33 var28 = client.method2919().method5663();
            if (var28 == null) {
                field1257[++Statics.field30 - 1] = -1;
                field1257[++Statics.field30 - 1] = -1;
                return 1;
            }
            class239 var29 = var28.method257(var27.field2777, var27.field2776);
            if (var29 == null) {
                field1257[++Statics.field30 - 1] = -1;
            } else {
                field1257[++Statics.field30 - 1] = var29.method4038();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field30 -= 2;
            int var30 = field1257[Statics.field30];
            class239 var31 = new class239(field1257[Statics.field30 + 1]);
            method515(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field30 -= 2;
            int var32 = field1257[Statics.field30];
            class239 var33 = new class239(field1257[Statics.field30 + 1]);
            method515(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field30 -= 2;
            int var34 = field1257[Statics.field30];
            class239 var35 = new class239(field1257[Statics.field30 + 1]);
            class33 var36 = client.method2919().method5573(var34);
            if (var36 == null) {
                field1257[++Statics.field30 - 1] = 0;
                return 1;
            } else {
                field1257[++Statics.field30 - 1] = var36.method254(var35.field2778, var35.field2777, var35.field2776) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1257[++Statics.field30 - 1] = client.method2919().method5581();
            field1257[++Statics.field30 - 1] = client.method2919().method5582();
            return 1;
        } else if (arg0 == 6623) {
            class239 var37 = new class239(field1257[--Statics.field30]);
            class33 var38 = client.method2919().method5555(var37.field2778, var37.field2777, var37.field2776);
            if (var38 == null) {
                field1257[++Statics.field30 - 1] = -1;
            } else {
                field1257[++Statics.field30 - 1] = var38.method305();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method2919().method5583(field1257[--Statics.field30]);
            return 1;
        } else if (arg0 == 6625) {
            client.method2919().method5584();
            return 1;
        } else if (arg0 == 6626) {
            client.method2919().method5586(field1257[--Statics.field30]);
            return 1;
        } else if (arg0 == 6627) {
            client.method2919().method5679();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1257[--Statics.field30] == 1;
            client.method2919().method5587(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1257[--Statics.field30];
            client.method2919().method5627(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1257[--Statics.field30];
            client.method2919().method5676(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method2919().method5590();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1257[--Statics.field30] == 1;
            client.method2919().method5705(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field30 -= 2;
            int var43 = field1257[Statics.field30];
            boolean var44 = field1257[Statics.field30 + 1] == 1;
            client.method2919().method5592(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field30 -= 2;
            int var45 = field1257[Statics.field30];
            boolean var46 = field1257[Statics.field30 + 1] == 1;
            client.method2919().method5593(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1257[++Statics.field30 - 1] = client.method2919().method5594() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1257[--Statics.field30];
            field1257[++Statics.field30 - 1] = client.method2919().method5649(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1257[--Statics.field30];
            field1257[++Statics.field30 - 1] = client.method2919().method5629(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field30 -= 2;
            int var49 = field1257[Statics.field30];
            class239 var50 = new class239(field1257[Statics.field30 + 1]);
            class239 var51 = client.method2919().method5599(var49, var50);
            if (var51 == null) {
                field1257[++Statics.field30 - 1] = -1;
            } else {
                field1257[++Statics.field30 - 1] = var51.method4038();
            }
            return 1;
        } else if (arg0 == 6639) {
            class41 var52 = client.method2919().method5563();
            if (var52 == null) {
                field1257[++Statics.field30 - 1] = -1;
                field1257[++Statics.field30 - 1] = -1;
            } else {
                field1257[++Statics.field30 - 1] = var52.field515;
                field1257[++Statics.field30 - 1] = var52.field511.method4038();
            }
            return 1;
        } else if (arg0 == 6640) {
            class41 var53 = client.method2919().method5602();
            if (var53 == null) {
                field1257[++Statics.field30 - 1] = -1;
                field1257[++Statics.field30 - 1] = -1;
            } else {
                field1257[++Statics.field30 - 1] = var53.field515;
                field1257[++Statics.field30 - 1] = var53.field511.method4038();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1257[--Statics.field30];
            class270 var55 = Statics.field3455[var54];
            if (var55.field3461 == null) {
                field1258[++Statics.field3923 - 1] = "";
            } else {
                field1258[++Statics.field3923 - 1] = var55.field3461;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1257[--Statics.field30];
            class270 var57 = Statics.field3455[var56];
            field1257[++Statics.field30 - 1] = var57.field3463;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1257[--Statics.field30];
            class270 var59 = Statics.field3455[var58];
            if (var59 == null) {
                field1257[++Statics.field30 - 1] = -1;
            } else {
                field1257[++Statics.field30 - 1] = var59.field3475;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1257[--Statics.field30];
            class270 var61 = Statics.field3455[var60];
            if (var61 == null) {
                field1257[++Statics.field30 - 1] = -1;
            } else {
                field1257[++Statics.field30 - 1] = var61.field3459;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1257[++Statics.field30 - 1] = Statics.field270.field570;
            return 1;
        } else if (arg0 == 6698) {
            field1257[++Statics.field30 - 1] = Statics.field270.field569.method4038();
            return 1;
        } else if (arg0 == 6699) {
            field1257[++Statics.field30 - 1] = Statics.field270.field571.method4038();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("az.aj(II)V")
    public static void method273(int arg0) {
        if (arg0 == -1 || !class243.method1894(arg0)) {
            return;
        }
        class243[] var1 = Statics.field2810[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class243 var3 = var1[var2];
            if (var3.field2899 != null) {
                class69 var4 = new class69();
                var4.field791 = var3;
                var4.field788 = var3.field2899;
                method187(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("ai.ae(ILik;ZI)V")
    public static void method515(int arg0, class239 arg1, boolean arg2) {
        class33 var3 = client.method2919().method5573(arg0);
        int var4 = Statics.field434.field837;
        int var5 = (Statics.field434.field1175 >> 7) + Statics.field494;
        int var6 = (Statics.field434.field1138 >> 7) + Statics.field2794;
        class239 var7 = new class239(var4, var5, var6);
        client.method2919().method5562(var3, var7, arg1, arg2);
    }
}
