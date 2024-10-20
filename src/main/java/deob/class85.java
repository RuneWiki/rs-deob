package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cg")
public class class85 {

    @ObfuscatedName("cg.x")
    public static int[] field1345 = new int[5];

    @ObfuscatedName("cg.g")
    public static int[][] field1353 = new int[5][5000];

    @ObfuscatedName("cg.c")
    public static int[] field1347 = new int[1000];

    @ObfuscatedName("cg.w")
    public static String[] field1351 = new String[1000];

    @ObfuscatedName("cg.o")
    public static int field1344 = 0;

    @ObfuscatedName("cg.m")
    public static class63[] field1359 = new class63[50];

    @ObfuscatedName("cg.r")
    public static Calendar field1352 = Calendar.getInstance();

    @ObfuscatedName("cg.e")
    public static final String[] field1349 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cg.v")
    public static int field1350 = 0;

    public class85() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hh.j(Lbm;I)V")
    public static void method3622(class71 arg0) {
        method504(arg0, 200000);
    }

    @ObfuscatedName("al.h(Lbm;II)V")
    public static void method504(class71 arg0, int arg1) {
        Object[] var2 = arg0.field857;
        class221 var3 = arg0.field864;
        boolean var4 = class221.field2799 == var3 || class221.field2793 == var3 || class221.field2791 == var3 || class221.field2792 == var3 || class221.field2790 == var3 || class221.field2794 == var3 || class221.field2795 == var3 || class221.field2796 == var3;
        class101 var6;
        if (var4) {
            Statics.field1667 = (class48) var2[0];
            class244 var5 = Statics.field3285[Statics.field1667.field612];
            var6 = class101.method86(arg0.field864, var5.field3288, var5.field3297);
        } else {
            int var7 = (Integer) var2[0];
            var6 = class101.method1459(var7);
        }
        if (var6 == null) {
            return;
        }
        Statics.field1348 = 0;
        Statics.field1416 = 0;
        int var8 = -1;
        int[] var9 = var6.field1539;
        int[] var10 = var6.field1540;
        byte var11 = -1;
        field1344 = 0;
        try {
            Statics.field1343 = new int[var6.field1542];
            int var12 = 0;
            Statics.field1342 = new String[var6.field1543];
            int var13 = 0;
            for (int var14 = 1; var14 < var2.length; var14++) {
                if (var2[var14] instanceof Integer) {
                    int var15 = (Integer) var2[var14];
                    if (var15 == -2147483647) {
                        var15 = arg0.field858;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg0.field859;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg0.field856 == null ? -1 : arg0.field856.field2723;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg0.field860;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg0.field856 == null ? -1 : arg0.field856.field2698;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg0.field861 == null ? -1 : arg0.field861.field2723;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg0.field861 == null ? -1 : arg0.field861.field2698;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg0.field862;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg0.field863;
                    }
                    Statics.field1343[var12++] = var15;
                } else if (var2[var14] instanceof String) {
                    String var16 = (String) var2[var14];
                    if (var16.equals("event_opbase")) {
                        var16 = arg0.field855;
                    }
                    Statics.field1342[var13++] = var16;
                }
            }
            int var17 = 0;
            field1350 = arg0.field865;
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
                                                                                                                label259: while (true) {
                                                                                                                    var17++;
                                                                                                                    if (var17 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var8++;
                                                                                                                    int var61 = var9[var8];
                                                                                                                    if (var61 >= 100) {
                                                                                                                        boolean var55;
                                                                                                                        if (var6.field1540[var8] == 1) {
                                                                                                                            var55 = true;
                                                                                                                        } else {
                                                                                                                            var55 = false;
                                                                                                                        }
                                                                                                                        int var56 = method3932(var61, var6, var55);
                                                                                                                        switch(var56) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var61 == 0) {
                                                                                                                        field1347[++Statics.field1348 - 1] = var10[var8];
                                                                                                                    } else if (var61 == 1) {
                                                                                                                        int var18 = var10[var8];
                                                                                                                        field1347[++Statics.field1348 - 1] = class213.field2604[var18];
                                                                                                                    } else if (var61 == 2) {
                                                                                                                        int var19 = var10[var8];
                                                                                                                        class213.field2604[var19] = field1347[--Statics.field1348];
                                                                                                                        client.method49(var19);
                                                                                                                    } else if (var61 == 3) {
                                                                                                                        field1351[++Statics.field1416 - 1] = var6.field1541[var8];
                                                                                                                    } else if (var61 == 6) {
                                                                                                                        var8 += var10[var8];
                                                                                                                    } else if (var61 == 7) {
                                                                                                                        Statics.field1348 -= 2;
                                                                                                                        if (field1347[Statics.field1348] != field1347[Statics.field1348 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var61 == 8) {
                                                                                                                        Statics.field1348 -= 2;
                                                                                                                        if (field1347[Statics.field1348] == field1347[Statics.field1348 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var61 == 9) {
                                                                                                                        Statics.field1348 -= 2;
                                                                                                                        if (field1347[Statics.field1348] < field1347[Statics.field1348 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var61 == 10) {
                                                                                                                        Statics.field1348 -= 2;
                                                                                                                        if (field1347[Statics.field1348] > field1347[Statics.field1348 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var61 == 21) {
                                                                                                                        if (field1344 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var20 = field1359[--field1344];
                                                                                                                        var6 = var20.field786;
                                                                                                                        var9 = var6.field1539;
                                                                                                                        var10 = var6.field1540;
                                                                                                                        var8 = var20.field792;
                                                                                                                        Statics.field1343 = var20.field787;
                                                                                                                        Statics.field1342 = var20.field791;
                                                                                                                    } else if (var61 == 25) {
                                                                                                                        int var21 = var10[var8];
                                                                                                                        field1347[++Statics.field1348 - 1] = class213.method13(var21);
                                                                                                                    } else if (var61 == 27) {
                                                                                                                        int var22 = var10[var8];
                                                                                                                        class213.method219(var22, field1347[--Statics.field1348]);
                                                                                                                    } else if (var61 == 31) {
                                                                                                                        Statics.field1348 -= 2;
                                                                                                                        if (field1347[Statics.field1348] <= field1347[Statics.field1348 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var61 == 32) {
                                                                                                                        Statics.field1348 -= 2;
                                                                                                                        if (field1347[Statics.field1348] >= field1347[Statics.field1348 + 1]) {
                                                                                                                            var8 += var10[var8];
                                                                                                                        }
                                                                                                                    } else if (var61 == 33) {
                                                                                                                        field1347[++Statics.field1348 - 1] = Statics.field1343[var10[var8]];
                                                                                                                    } else if (var61 == 34) {
                                                                                                                        Statics.field1343[var10[var8]] = field1347[--Statics.field1348];
                                                                                                                    } else if (var61 == 35) {
                                                                                                                        field1351[++Statics.field1416 - 1] = Statics.field1342[var10[var8]];
                                                                                                                    } else if (var61 == 36) {
                                                                                                                        Statics.field1342[var10[var8]] = field1351[--Statics.field1416];
                                                                                                                    } else if (var61 == 37) {
                                                                                                                        int var23 = var10[var8];
                                                                                                                        Statics.field1416 -= var23;
                                                                                                                        String[] var24 = field1351;
                                                                                                                        int var25 = Statics.field1416;
                                                                                                                        String var26;
                                                                                                                        if (var23 == 0) {
                                                                                                                            var26 = "";
                                                                                                                        } else if (var23 == 1) {
                                                                                                                            String var27 = var24[var25];
                                                                                                                            if (var27 == null) {
                                                                                                                                var26 = "null";
                                                                                                                            } else {
                                                                                                                                var26 = var27.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var28 = var23 + var25;
                                                                                                                            int var29 = 0;
                                                                                                                            for (int var30 = var25; var30 < var28; var30++) {
                                                                                                                                String var31 = var24[var30];
                                                                                                                                if (var31 == null) {
                                                                                                                                    var29 += 4;
                                                                                                                                } else {
                                                                                                                                    var29 += var31.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var32 = new StringBuilder(var29);
                                                                                                                            for (int var33 = var25; var33 < var28; var33++) {
                                                                                                                                String var34 = var24[var33];
                                                                                                                                if (var34 == null) {
                                                                                                                                    var32.append("null");
                                                                                                                                } else {
                                                                                                                                    var32.append(var34);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var26 = var32.toString();
                                                                                                                        }
                                                                                                                        field1351[++Statics.field1416 - 1] = var26;
                                                                                                                    } else if (var61 == 38) {
                                                                                                                        Statics.field1348--;
                                                                                                                    } else if (var61 == 39) {
                                                                                                                        Statics.field1416--;
                                                                                                                    } else if (var61 == 40) {
                                                                                                                        int var36 = var10[var8];
                                                                                                                        class101 var37 = class101.method1459(var36);
                                                                                                                        int[] var38 = new int[var37.field1542];
                                                                                                                        String[] var39 = new String[var37.field1543];
                                                                                                                        for (int var40 = 0; var40 < var37.field1544; var40++) {
                                                                                                                            var38[var40] = field1347[Statics.field1348 - var37.field1544 + var40];
                                                                                                                        }
                                                                                                                        for (int var41 = 0; var41 < var37.field1545; var41++) {
                                                                                                                            var39[var41] = field1351[Statics.field1416 - var37.field1545 + var41];
                                                                                                                        }
                                                                                                                        Statics.field1348 -= var37.field1544;
                                                                                                                        Statics.field1416 -= var37.field1545;
                                                                                                                        class63 var42 = new class63();
                                                                                                                        var42.field786 = var6;
                                                                                                                        var42.field792 = var8;
                                                                                                                        var42.field787 = Statics.field1343;
                                                                                                                        var42.field791 = Statics.field1342;
                                                                                                                        field1359[++field1344 - 1] = var42;
                                                                                                                        var6 = var37;
                                                                                                                        var9 = var37.field1539;
                                                                                                                        var10 = var37.field1540;
                                                                                                                        var8 = -1;
                                                                                                                        Statics.field1343 = var38;
                                                                                                                        Statics.field1342 = var39;
                                                                                                                    } else if (var61 == 42) {
                                                                                                                        field1347[++Statics.field1348 - 1] = Statics.field2260.method1663(var10[var8]);
                                                                                                                    } else if (var61 == 43) {
                                                                                                                        Statics.field2260.method1662(var10[var8], field1347[--Statics.field1348]);
                                                                                                                    } else if (var61 == 44) {
                                                                                                                        int var43 = var10[var8] >> 16;
                                                                                                                        int var44 = var10[var8] & 0xFFFF;
                                                                                                                        int var45 = field1347[--Statics.field1348];
                                                                                                                        if (var45 >= 0 && var45 <= 5000) {
                                                                                                                            field1345[var43] = var45;
                                                                                                                            byte var46 = -1;
                                                                                                                            if (var44 == 105) {
                                                                                                                                var46 = 0;
                                                                                                                            }
                                                                                                                            int var47 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var47 >= var45) {
                                                                                                                                    continue label259;
                                                                                                                                }
                                                                                                                                field1353[var43][var47] = var46;
                                                                                                                                var47++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var61 == 45) {
                                                                                                                        int var48 = var10[var8];
                                                                                                                        int var49 = field1347[--Statics.field1348];
                                                                                                                        if (var49 < 0 || var49 >= field1345[var48]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1347[++Statics.field1348 - 1] = field1353[var48][var49];
                                                                                                                    } else if (var61 == 46) {
                                                                                                                        int var50 = var10[var8];
                                                                                                                        Statics.field1348 -= 2;
                                                                                                                        int var51 = field1347[Statics.field1348];
                                                                                                                        if (var51 < 0 || var51 >= field1345[var50]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1353[var50][var51] = field1347[Statics.field1348 + 1];
                                                                                                                    } else if (var61 == 47) {
                                                                                                                        String var52 = Statics.field2260.method1697(var10[var8]);
                                                                                                                        if (var52 == null) {
                                                                                                                            var52 = "null";
                                                                                                                        }
                                                                                                                        field1351[++Statics.field1416 - 1] = var52;
                                                                                                                    } else if (var61 == 48) {
                                                                                                                        Statics.field2260.method1664(var10[var8], field1351[--Statics.field1416]);
                                                                                                                    } else if (var61 == 60) {
                                                                                                                        class188 var53 = var6.field1548[var10[var8]];
                                                                                                                        class200 var54 = (class200) var53.method3232((long) field1347[--Statics.field1348]);
                                                                                                                        if (var54 != null) {
                                                                                                                            var8 += var54.field2483;
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
        } catch (Exception var60) {
            StringBuilder var58 = new StringBuilder(30);
            var58.append("").append(var6.field2469).append(" ");
            for (int var59 = field1344 - 1; var59 >= 0; var59--) {
                var58.append("").append(field1359[var59].field786.field2469).append(" ");
            }
            var58.append("").append(var11);
            Statics.method1698(var58.toString(), var60);
        }
    }

    @ObfuscatedName("ix.f(ILcj;ZI)I")
    public static int method3932(int arg0, class101 arg1, boolean arg2) {
        if (arg0 < 1000) {
            byte var10;
            if (arg0 == 100) {
                Statics.field1348 -= 3;
                int var3 = field1347[Statics.field1348];
                int var4 = field1347[Statics.field1348 + 1];
                int var5 = field1347[Statics.field1348 + 2];
                if (var4 == 0) {
                    throw new RuntimeException();
                }
                class218 var6 = class218.method1532(var3);
                if (var6.field2774 == null) {
                    var6.field2774 = new class218[var5 + 1];
                }
                if (var6.field2774.length <= var5) {
                    class218[] var7 = new class218[var5 + 1];
                    for (int var8 = 0; var8 < var6.field2774.length; var8++) {
                        var7[var8] = var6.field2774[var8];
                    }
                    var6.field2774 = var7;
                }
                if (var5 > 0 && var6.field2774[var5 - 1] == null) {
                    throw new RuntimeException("" + (var5 - 1));
                }
                class218 var9 = new class218();
                var9.field2652 = var4;
                var9.field2681 = var9.field2723 = var6.field2723;
                var9.field2698 = var5;
                var9.field2756 = true;
                var6.field2774[var5] = var9;
                if (arg2) {
                    Statics.field583 = var9;
                } else {
                    Statics.field2581 = var9;
                }
                client.method1576(var6);
                var10 = 1;
            } else if (arg0 == 101) {
                class218 var11 = arg2 ? Statics.field583 : Statics.field2581;
                class218 var12 = class218.method1532(var11.field2723);
                var12.field2774[var11.field2698] = null;
                client.method1576(var12);
                var10 = 1;
            } else if (arg0 == 102) {
                class218 var13 = class218.method1532(field1347[--Statics.field1348]);
                var13.field2774 = null;
                client.method1576(var13);
                var10 = 1;
            } else if (arg0 == 200) {
                Statics.field1348 -= 2;
                int var14 = field1347[Statics.field1348];
                int var15 = field1347[Statics.field1348 + 1];
                class218 var16 = class218.method3511(var14, var15);
                if (var16 == null || var15 == -1) {
                    field1347[++Statics.field1348 - 1] = 0;
                } else {
                    field1347[++Statics.field1348 - 1] = 1;
                    if (arg2) {
                        Statics.field583 = var16;
                    } else {
                        Statics.field2581 = var16;
                    }
                }
                var10 = 1;
            } else if (arg0 == 201) {
                class218 var17 = class218.method1532(field1347[--Statics.field1348]);
                if (var17 == null) {
                    field1347[++Statics.field1348 - 1] = 0;
                } else {
                    field1347[++Statics.field1348 - 1] = 1;
                    if (arg2) {
                        Statics.field583 = var17;
                    } else {
                        Statics.field2581 = var17;
                    }
                }
                var10 = 1;
            } else {
                var10 = 2;
            }
            return var10;
        } else if (arg0 < 1100) {
            return method1034(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method48(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method470(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method712(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method493(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method131(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            class218 var21 = arg2 ? Statics.field583 : Statics.field2581;
            byte var22;
            if (arg0 == 1700) {
                field1347[++Statics.field1348 - 1] = var21.field2694;
                var22 = 1;
            } else if (arg0 == 1701) {
                if (var21.field2694 == -1) {
                    field1347[++Statics.field1348 - 1] = 0;
                } else {
                    field1347[++Statics.field1348 - 1] = var21.field2758;
                }
                var22 = 1;
            } else if (arg0 == 1702) {
                field1347[++Statics.field1348 - 1] = var21.field2698;
                var22 = 1;
            } else {
                var22 = 2;
            }
            return var22;
        } else if (arg0 < 1900) {
            class218 var23 = arg2 ? Statics.field583 : Statics.field2581;
            byte var28;
            if (arg0 == 1800) {
                int[] var24 = field1347;
                int var25 = ++Statics.field1348 - 1;
                int var26 = client.method4398(var23);
                int var27 = var26 >> 11 & 0x3F;
                var24[var25] = var27;
                var28 = 1;
            } else if (arg0 == 1801) {
                int var29 = field1347[--Statics.field1348];
                int var368 = var29 - 1;
                if (var23.field2724 == null || var368 >= var23.field2724.length || var23.field2724[var368] == null) {
                    field1351[++Statics.field1416 - 1] = "";
                } else {
                    field1351[++Statics.field1416 - 1] = var23.field2724[var368];
                }
                var28 = 1;
            } else if (arg0 == 1802) {
                if (var23.field2689 == null) {
                    field1351[++Statics.field1416 - 1] = "";
                } else {
                    field1351[++Statics.field1416 - 1] = var23.field2689;
                }
                var28 = 1;
            } else {
                var28 = 2;
            }
            return var28;
        } else if (arg0 < 2000) {
            return method1011(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1034(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method48(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method470(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method712(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            class218 var30 = class218.method1532(field1347[--Statics.field1348]);
            byte var31;
            if (arg0 == 2500) {
                field1347[++Statics.field1348 - 1] = var30.field2663;
                var31 = 1;
            } else if (arg0 == 2501) {
                field1347[++Statics.field1348 - 1] = var30.field2664;
                var31 = 1;
            } else if (arg0 == 2502) {
                field1347[++Statics.field1348 - 1] = var30.field2665;
                var31 = 1;
            } else if (arg0 == 2503) {
                field1347[++Statics.field1348 - 1] = var30.field2666;
                var31 = 1;
            } else if (arg0 == 2504) {
                field1347[++Statics.field1348 - 1] = var30.field2670 ? 1 : 0;
                var31 = 1;
            } else if (arg0 == 2505) {
                field1347[++Statics.field1348 - 1] = var30.field2681;
                var31 = 1;
            } else {
                var31 = 2;
            }
            return var31;
        } else if (arg0 < 2700) {
            return method64(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            byte var33;
            if (arg0 == 2700) {
                class218 var32 = class218.method1532(field1347[--Statics.field1348]);
                field1347[++Statics.field1348 - 1] = var32.field2694;
                var33 = 1;
            } else if (arg0 == 2701) {
                class218 var34 = class218.method1532(field1347[--Statics.field1348]);
                if (var34.field2694 == -1) {
                    field1347[++Statics.field1348 - 1] = 0;
                } else {
                    field1347[++Statics.field1348 - 1] = var34.field2758;
                }
                var33 = 1;
            } else if (arg0 == 2702) {
                int var35 = field1347[--Statics.field1348];
                class69 var36 = (class69) client.field1088.method3281((long) var35);
                if (var36 == null) {
                    field1347[++Statics.field1348 - 1] = 0;
                } else {
                    field1347[++Statics.field1348 - 1] = 1;
                }
                var33 = 1;
            } else if (arg0 == 2706) {
                field1347[++Statics.field1348 - 1] = client.field995;
                var33 = 1;
            } else {
                var33 = 2;
            }
            return var33;
        } else if (arg0 < 2900) {
            class218 var37 = class218.method1532(field1347[--Statics.field1348]);
            byte var42;
            if (arg0 == 2800) {
                int[] var38 = field1347;
                int var39 = ++Statics.field1348 - 1;
                int var40 = client.method4398(var37);
                int var41 = var40 >> 11 & 0x3F;
                var38[var39] = var41;
                var42 = 1;
            } else if (arg0 == 2801) {
                int var43 = field1347[--Statics.field1348];
                int var369 = var43 - 1;
                if (var37.field2724 == null || var369 >= var37.field2724.length || var37.field2724[var369] == null) {
                    field1351[++Statics.field1416 - 1] = "";
                } else {
                    field1351[++Statics.field1416 - 1] = var37.field2724[var369];
                }
                var42 = 1;
            } else if (arg0 == 2802) {
                if (var37.field2689 == null) {
                    field1351[++Statics.field1416 - 1] = "";
                } else {
                    field1351[++Statics.field1416 - 1] = var37.field2689;
                }
                var42 = 1;
            } else {
                var42 = 2;
            }
            return var42;
        } else if (arg0 < 3000) {
            return method1011(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            byte var45;
            if (arg0 == 3100) {
                String var44 = field1351[--Statics.field1416];
                class100.method1553(0, "", var44);
                var45 = 1;
            } else if (arg0 == 3101) {
                Statics.field1348 -= 2;
                client.method7(Statics.field312, field1347[Statics.field1348], field1347[Statics.field1348 + 1]);
                var45 = 1;
            } else if (arg0 == 3103) {
                client.method1405();
                var45 = 1;
            } else if (arg0 == 3104) {
                String var46 = field1351[--Statics.field1416];
                int var47 = 0;
                if (class272.method2666(var46)) {
                    var47 = class272.method4199(var46);
                }
                client.field978.method3139(5);
                client.field978.method2891(var47);
                var45 = 1;
            } else if (arg0 == 3105) {
                String var48 = field1351[--Statics.field1416];
                client.field978.method3139(251);
                client.field978.method2888(var48.length() + 1);
                client.field978.method2894(var48);
                var45 = 1;
            } else if (arg0 == 3106) {
                String var49 = field1351[--Statics.field1416];
                client.field978.method3139(0);
                client.field978.method2888(var49.length() + 1);
                client.field978.method2894(var49);
                var45 = 1;
            } else if (arg0 == 3107) {
                int var50 = field1347[--Statics.field1348];
                String var51 = field1351[--Statics.field1416];
                int var52 = class98.field1511;
                int[] var53 = class98.field1512;
                boolean var54 = false;
                for (int var55 = 0; var55 < var52; var55++) {
                    class76 var56 = client.field1046[var53[var55]];
                    if (var56 != null && Statics.field312 != var56 && var56.field915 != null && var56.field915.equalsIgnoreCase(var51)) {
                        if (var50 == 1) {
                            client.field978.method3139(190);
                            client.field978.method2937(var53[var55]);
                            client.field978.method2927(0);
                        } else if (var50 == 4) {
                            client.field978.method3139(154);
                            client.field978.method3041(var53[var55]);
                            client.field978.method2927(0);
                        } else if (var50 == 6) {
                            client.field978.method3139(114);
                            client.field978.method2927(0);
                            client.field978.method3064(var53[var55]);
                        } else if (var50 == 7) {
                            client.field978.method3139(26);
                            client.field978.method2991(0);
                            client.field978.method2937(var53[var55]);
                        }
                        var54 = true;
                        break;
                    }
                }
                if (!var54) {
                    class100.method1553(4, "", class227.field3000 + var51);
                }
                var45 = 1;
            } else if (arg0 == 3108) {
                Statics.field1348 -= 3;
                int var57 = field1347[Statics.field1348];
                int var58 = field1347[Statics.field1348 + 1];
                int var59 = field1347[Statics.field1348 + 2];
                class218 var60 = class218.method1532(var59);
                client.method1006(var60, var57, var58);
                var45 = 1;
            } else if (arg0 == 3109) {
                Statics.field1348 -= 2;
                int var61 = field1347[Statics.field1348];
                int var62 = field1347[Statics.field1348 + 1];
                class218 var63 = arg2 ? Statics.field583 : Statics.field2581;
                client.method1006(var63, var61, var62);
                var45 = 1;
            } else if (arg0 == 3110) {
                Statics.field303 = field1347[--Statics.field1348] == 1;
                var45 = 1;
            } else if (arg0 == 3111) {
                field1347[++Statics.field1348 - 1] = Statics.field22.field1315 ? 1 : 0;
                var45 = 1;
            } else if (arg0 == 3112) {
                Statics.field22.field1315 = field1347[--Statics.field1348] == 1;
                class82.method333();
                var45 = 1;
            } else if (arg0 == 3113) {
                String var64 = field1351[--Statics.field1416];
                boolean var65 = field1347[--Statics.field1348] == 1;
                class57.method253(var64, var65, false);
                var45 = 1;
            } else if (arg0 == 3115) {
                int var66 = field1347[--Statics.field1348];
                client.field978.method3139(69);
                client.field978.method3030(var66);
                var45 = 1;
            } else if (arg0 == 3116) {
                int var67 = field1347[--Statics.field1348];
                Statics.field1416 -= 2;
                String var68 = field1351[Statics.field1416];
                String var69 = field1351[Statics.field1416 + 1];
                if (var68.length() > 500) {
                    var45 = 1;
                } else if (var69.length() > 500) {
                    var45 = 1;
                } else {
                    client.field978.method3139(200);
                    client.field978.method3030(1 + class175.method2869(var68) + class175.method2869(var69));
                    client.field978.method2929(var67);
                    client.field978.method2894(var68);
                    client.field978.method2894(var69);
                    var45 = 1;
                }
            } else if (arg0 == 3117) {
                client.field1075 = field1347[--Statics.field1348] == 1;
                var45 = 1;
            } else {
                var45 = 2;
            }
            return var45;
        } else if (arg0 < 3300) {
            return method719(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            byte var70;
            if (arg0 == 3300) {
                field1347[++Statics.field1348 - 1] = client.field944;
                var70 = 1;
            } else if (arg0 == 3301) {
                Statics.field1348 -= 2;
                int var71 = field1347[Statics.field1348];
                int var72 = field1347[Statics.field1348 + 1];
                field1347[++Statics.field1348 - 1] = Statics.method1624(var71, var72);
                var70 = 1;
            } else if (arg0 == 3302) {
                Statics.field1348 -= 2;
                int var73 = field1347[Statics.field1348];
                int var74 = field1347[Statics.field1348 + 1];
                int[] var75 = field1347;
                int var76 = ++Statics.field1348 - 1;
                class64 var77 = (class64) class64.field799.method3281((long) var73);
                int var78;
                if (var77 == null) {
                    var78 = 0;
                } else if (var74 >= 0 && var74 < var77.field798.length) {
                    var78 = var77.field798[var74];
                } else {
                    var78 = 0;
                }
                var75[var76] = var78;
                var70 = 1;
            } else if (arg0 == 3303) {
                Statics.field1348 -= 2;
                int var79 = field1347[Statics.field1348];
                int var80 = field1347[Statics.field1348 + 1];
                int[] var81 = field1347;
                int var82 = ++Statics.field1348 - 1;
                class64 var83 = (class64) class64.field799.method3281((long) var79);
                int var84;
                if (var83 == null) {
                    var84 = 0;
                } else if (var80 == -1) {
                    var84 = 0;
                } else {
                    int var85 = 0;
                    for (int var86 = 0; var86 < var83.field798.length; var86++) {
                        if (var83.field797[var86] == var80) {
                            var85 += var83.field798[var86];
                        }
                    }
                    var84 = var85;
                }
                var81[var82] = var84;
                var70 = 1;
            } else if (arg0 == 3304) {
                int var87 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = class242.method3(var87).field3268;
                var70 = 1;
            } else if (arg0 == 3305) {
                int var88 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = client.field1060[var88];
                var70 = 1;
            } else if (arg0 == 3306) {
                int var89 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = client.field1138[var89];
                var70 = 1;
            } else if (arg0 == 3307) {
                int var90 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = client.field934[var90];
                var70 = 1;
            } else if (arg0 == 3308) {
                int var91 = Statics.field509;
                int var92 = (Statics.field312.field1262 >> 7) + Statics.field608;
                int var93 = (Statics.field312.field1259 >> 7) + Statics.field587;
                field1347[++Statics.field1348 - 1] = (var91 << 28) + (var92 << 14) + var93;
                var70 = 1;
            } else if (arg0 == 3309) {
                int var94 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = var94 >> 14 & 0x3FFF;
                var70 = 1;
            } else if (arg0 == 3310) {
                int var95 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = var95 >> 28;
                var70 = 1;
            } else if (arg0 == 3311) {
                int var96 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = var96 & 0x3FFF;
                var70 = 1;
            } else if (arg0 == 3312) {
                field1347[++Statics.field1348 - 1] = client.field1104 ? 1 : 0;
                var70 = 1;
            } else if (arg0 == 3313) {
                Statics.field1348 -= 2;
                int var97 = field1347[Statics.field1348] + 32768;
                int var98 = field1347[Statics.field1348 + 1];
                field1347[++Statics.field1348 - 1] = Statics.method1624(var97, var98);
                var70 = 1;
            } else if (arg0 == 3314) {
                Statics.field1348 -= 2;
                int var99 = field1347[Statics.field1348] + 32768;
                int var100 = field1347[Statics.field1348 + 1];
                field1347[++Statics.field1348 - 1] = class64.method4154(var99, var100);
                var70 = 1;
            } else if (arg0 == 3315) {
                Statics.field1348 -= 2;
                int var101 = field1347[Statics.field1348] + 32768;
                int var102 = field1347[Statics.field1348 + 1];
                int[] var103 = field1347;
                int var104 = ++Statics.field1348 - 1;
                class64 var105 = (class64) class64.field799.method3281((long) var101);
                int var106;
                if (var105 == null) {
                    var106 = 0;
                } else if (var102 == -1) {
                    var106 = 0;
                } else {
                    int var107 = 0;
                    for (int var108 = 0; var108 < var105.field798.length; var108++) {
                        if (var105.field797[var108] == var102) {
                            var107 += var105.field798[var108];
                        }
                    }
                    var106 = var107;
                }
                var103[var104] = var106;
                var70 = 1;
            } else if (arg0 == 3316) {
                if (client.field1094 >= 2) {
                    field1347[++Statics.field1348 - 1] = client.field1094;
                } else {
                    field1347[++Statics.field1348 - 1] = 0;
                }
                var70 = 1;
            } else if (arg0 == 3317) {
                field1347[++Statics.field1348 - 1] = client.field951;
                var70 = 1;
            } else if (arg0 == 3318) {
                field1347[++Statics.field1348 - 1] = client.field935;
                var70 = 1;
            } else if (arg0 == 3321) {
                field1347[++Statics.field1348 - 1] = client.field971;
                var70 = 1;
            } else if (arg0 == 3322) {
                field1347[++Statics.field1348 - 1] = client.field1039;
                var70 = 1;
            } else if (arg0 == 3323) {
                if (client.field1159) {
                    field1347[++Statics.field1348 - 1] = 1;
                } else {
                    field1347[++Statics.field1348 - 1] = 0;
                }
                var70 = 1;
            } else if (arg0 == 3324) {
                field1347[++Statics.field1348 - 1] = client.field1006;
                var70 = 1;
            } else if (arg0 == 3325) {
                Statics.field1348 -= 4;
                int var109 = field1347[Statics.field1348];
                int var110 = field1347[Statics.field1348 + 1];
                int var111 = field1347[Statics.field1348 + 2];
                int var112 = field1347[Statics.field1348 + 3];
                int var113 = (var110 << 14) + var109;
                int var114 = (var111 << 28) + var113;
                int var115 = var112 + var114;
                field1347[++Statics.field1348 - 1] = var115;
                var70 = 1;
            } else {
                var70 = 2;
            }
            return var70;
        } else if (arg0 < 3500) {
            byte var120;
            if (arg0 == 3400) {
                Statics.field1348 -= 2;
                int var116 = field1347[Statics.field1348];
                int var117 = field1347[Statics.field1348 + 1];
                class255 var118 = class255.method3758(var116);
                if (var118.field3391 != 's') {
                }
                for (int var119 = 0; var119 < var118.field3394; var119++) {
                    if (var118.field3395[var119] == var117) {
                        field1351[++Statics.field1416 - 1] = var118.field3396[var119];
                        var118 = null;
                        break;
                    }
                }
                if (var118 != null) {
                    field1351[++Statics.field1416 - 1] = var118.field3392;
                }
                var120 = 1;
            } else if (arg0 == 3408) {
                Statics.field1348 -= 4;
                int var121 = field1347[Statics.field1348];
                int var122 = field1347[Statics.field1348 + 1];
                int var123 = field1347[Statics.field1348 + 2];
                int var124 = field1347[Statics.field1348 + 3];
                class255 var125 = class255.method3758(var123);
                if (var125.field3388 == var121 && var125.field3391 == var122) {
                    for (int var126 = 0; var126 < var125.field3394; var126++) {
                        if (var125.field3395[var126] == var124) {
                            if (var122 == 115) {
                                field1351[++Statics.field1416 - 1] = var125.field3396[var126];
                            } else {
                                field1347[++Statics.field1348 - 1] = var125.field3390[var126];
                            }
                            var125 = null;
                            break;
                        }
                    }
                    if (var125 != null) {
                        if (var122 == 115) {
                            field1351[++Statics.field1416 - 1] = var125.field3392;
                        } else {
                            field1347[++Statics.field1348 - 1] = var125.field3393;
                        }
                    }
                    var120 = 1;
                } else {
                    if (var122 == 115) {
                        field1351[++Statics.field1416 - 1] = "null";
                    } else {
                        field1347[++Statics.field1348 - 1] = 0;
                    }
                    var120 = 1;
                }
            } else {
                var120 = 2;
            }
            return var120;
        } else if (arg0 < 3700) {
            byte var127;
            if (arg0 == 3600) {
                if (client.field1193 == 0) {
                    field1347[++Statics.field1348 - 1] = -2;
                } else if (client.field1193 == 1) {
                    field1347[++Statics.field1348 - 1] = -1;
                } else {
                    field1347[++Statics.field1348 - 1] = client.field1172;
                }
                var127 = 1;
            } else if (arg0 == 3601) {
                int var128 = field1347[--Statics.field1348];
                if (client.field1193 == 2 && var128 < client.field1172) {
                    field1351[++Statics.field1416 - 1] = client.field1194[var128].field817;
                    field1351[++Statics.field1416 - 1] = client.field1194[var128].field816;
                } else {
                    field1351[++Statics.field1416 - 1] = "";
                    field1351[++Statics.field1416 - 1] = "";
                }
                var127 = 1;
            } else if (arg0 == 3602) {
                int var129 = field1347[--Statics.field1348];
                if (client.field1193 == 2 && var129 < client.field1172) {
                    field1347[++Statics.field1348 - 1] = client.field1194[var129].field815;
                } else {
                    field1347[++Statics.field1348 - 1] = 0;
                }
                var127 = 1;
            } else if (arg0 == 3603) {
                int var130 = field1347[--Statics.field1348];
                if (client.field1193 == 2 && var130 < client.field1172) {
                    field1347[++Statics.field1348 - 1] = client.field1194[var130].field818;
                } else {
                    field1347[++Statics.field1348 - 1] = 0;
                }
                var127 = 1;
            } else if (arg0 == 3604) {
                String var131 = field1351[--Statics.field1416];
                int var132 = field1347[--Statics.field1348];
                client.method1046(var131, var132);
                var127 = 1;
            } else if (arg0 == 3605) {
                String var133 = field1351[--Statics.field1416];
                if (var133 != null) {
                    if ((client.field1172 < 200 || client.field1121 == 1) && client.field1172 < 400) {
                        String var134 = class269.method4043(var133, Statics.field355);
                        if (var134 != null) {
                            int var135 = 0;
                            label1623: while (true) {
                                if (var135 >= client.field1172) {
                                    for (int var139 = 0; var139 < client.field1196; var139++) {
                                        class72 var140 = client.field1197[var139];
                                        String var141 = class269.method4043(var140.field874, Statics.field355);
                                        if (var141 != null && var141.equals(var134)) {
                                            class100.method1553(30, "", class227.field3110 + var133 + class227.field3024);
                                            break label1623;
                                        }
                                        if (var140.field869 != null) {
                                            String var142 = class269.method4043(var140.field869, Statics.field355);
                                            if (var142 != null && var142.equals(var134)) {
                                                class100.method1553(30, "", class227.field3110 + var133 + class227.field3024);
                                                break label1623;
                                            }
                                        }
                                    }
                                    if (class269.method4043(Statics.field312.field915, Statics.field355).equals(var134)) {
                                        class100.method1553(30, "", class227.field3021);
                                    } else {
                                        client.field978.method3139(226);
                                        client.field978.method2888(class175.method2869(var133));
                                        client.field978.method2894(var133);
                                    }
                                    break;
                                }
                                class66 var136 = client.field1194[var135];
                                String var137 = class269.method4043(var136.field817, Statics.field355);
                                if (var137 != null && var137.equals(var134)) {
                                    class100.method1553(30, "", var133 + class227.field3018);
                                    break;
                                }
                                if (var136.field816 != null) {
                                    String var138 = class269.method4043(var136.field816, Statics.field355);
                                    if (var138 != null && var138.equals(var134)) {
                                        class100.method1553(30, "", var133 + class227.field3018);
                                        break;
                                    }
                                }
                                var135++;
                            }
                        }
                    } else {
                        class100.method1553(30, "", class227.field3130);
                    }
                }
                var127 = 1;
            } else if (arg0 == 3606) {
                String var143 = field1351[--Statics.field1416];
                if (var143 != null) {
                    String var144 = class269.method4043(var143, Statics.field355);
                    if (var144 != null) {
                        for (int var145 = 0; var145 < client.field1172; var145++) {
                            class66 var146 = client.field1194[var145];
                            String var147 = var146.field817;
                            String var148 = class269.method4043(var147, Statics.field355);
                            boolean var149;
                            if (var143 == null || var147 == null) {
                                var149 = false;
                            } else if (var143.startsWith("#") || var147.startsWith("#")) {
                                var149 = var143.equals(var147);
                            } else {
                                var149 = var144.equals(var148);
                            }
                            if (var149) {
                                client.field1172--;
                                for (int var150 = var145; var150 < client.field1172; var150++) {
                                    client.field1194[var150] = client.field1194[var150 + 1];
                                }
                                client.field1120 = client.field1112;
                                client.field978.method3139(175);
                                client.field978.method2888(class175.method2869(var143));
                                client.field978.method2894(var143);
                                break;
                            }
                        }
                    }
                }
                var127 = 1;
            } else if (arg0 == 3607) {
                String var151 = field1351[--Statics.field1416];
                if (var151 != null) {
                    if ((client.field1196 < 100 || client.field1121 == 1) && client.field1196 < 400) {
                        String var152 = class269.method4043(var151, Statics.field355);
                        if (var152 != null) {
                            int var153 = 0;
                            label1561: while (true) {
                                if (var153 >= client.field1196) {
                                    for (int var157 = 0; var157 < client.field1172; var157++) {
                                        class66 var158 = client.field1194[var157];
                                        String var159 = class269.method4043(var158.field817, Statics.field355);
                                        if (var159 != null && var159.equals(var152)) {
                                            class100.method1553(31, "", class227.field2883 + var151 + class227.field3026);
                                            break label1561;
                                        }
                                        if (var158.field816 != null) {
                                            String var160 = class269.method4043(var158.field816, Statics.field355);
                                            if (var160 != null && var160.equals(var152)) {
                                                class100.method1553(31, "", class227.field2883 + var151 + class227.field3026);
                                                break label1561;
                                            }
                                        }
                                    }
                                    if (class269.method4043(Statics.field312.field915, Statics.field355).equals(var152)) {
                                        class100.method1553(31, "", class227.field3117);
                                    } else {
                                        client.field978.method3139(64);
                                        client.field978.method2888(class175.method2869(var151));
                                        client.field978.method2894(var151);
                                    }
                                    break;
                                }
                                class72 var154 = client.field1197[var153];
                                String var155 = class269.method4043(var154.field874, Statics.field355);
                                if (var155 != null && var155.equals(var152)) {
                                    class100.method1553(31, "", var151 + class227.field3020);
                                    break;
                                }
                                if (var154.field869 != null) {
                                    String var156 = class269.method4043(var154.field869, Statics.field355);
                                    if (var156 != null && var156.equals(var152)) {
                                        class100.method1553(31, "", var151 + class227.field3020);
                                        break;
                                    }
                                }
                                var153++;
                            }
                        }
                    } else {
                        class100.method1553(31, "", class227.field3019);
                    }
                }
                var127 = 1;
            } else if (arg0 == 3608) {
                String var161 = field1351[--Statics.field1416];
                if (var161 != null) {
                    String var162 = class269.method4043(var161, Statics.field355);
                    if (var162 != null) {
                        for (int var163 = 0; var163 < client.field1196; var163++) {
                            class72 var164 = client.field1197[var163];
                            String var165 = var164.field874;
                            String var166 = class269.method4043(var165, Statics.field355);
                            boolean var167;
                            if (var161 == null || var165 == null) {
                                var167 = false;
                            } else if (var161.startsWith("#") || var165.startsWith("#")) {
                                var167 = var161.equals(var165);
                            } else {
                                var167 = var162.equals(var166);
                            }
                            if (var167) {
                                client.field1196--;
                                for (int var168 = var163; var168 < client.field1196; var168++) {
                                    client.field1197[var168] = client.field1197[var168 + 1];
                                }
                                client.field1120 = client.field1112;
                                client.field978.method3139(180);
                                client.field978.method2888(class175.method2869(var161));
                                client.field978.method2894(var161);
                                break;
                            }
                        }
                    }
                }
                var127 = 1;
            } else if (arg0 == 3609) {
                String var169 = field1351[--Statics.field1416];
                class232[] var170 = new class232[] { class232.field3169, class232.field3170, class232.field3165, class232.field3168, class232.field3167, class232.field3166 };
                class232[] var171 = var170;
                for (int var172 = 0; var172 < var171.length; var172++) {
                    class232 var173 = var171[var172];
                    if (var173.field3171 != -1 && var169.startsWith(Statics.method1570(var173.field3171))) {
                        var169 = var169.substring(6 + Integer.toString(var173.field3171).length());
                        break;
                    }
                }
                field1347[++Statics.field1348 - 1] = client.method491(var169, false) ? 1 : 0;
                var127 = 1;
            } else if (arg0 == 3611) {
                if (client.field1152 == null) {
                    field1351[++Statics.field1416 - 1] = "";
                } else {
                    String[] var174 = field1351;
                    int var175 = ++Statics.field1416 - 1;
                    String var176 = client.field1152;
                    long var177 = 0L;
                    int var179 = var176.length();
                    for (int var180 = 0; var180 < var179; var180++) {
                        var177 *= 37L;
                        char var181 = var176.charAt(var180);
                        if (var181 >= 'A' && var181 <= 'Z') {
                            var177 += (long) (var181 + 1 - 65);
                        } else if (var181 >= 'a' && var181 <= 'z') {
                            var177 += (long) (var181 + 1 - 97);
                        } else if (var181 >= '0' && var181 <= '9') {
                            var177 += (long) (var181 + 27 - 48);
                        }
                        if (var177 >= 177917621779460413L) {
                            break;
                        }
                    }
                    while (var177 % 37L == 0L && var177 != 0L) {
                        var177 /= 37L;
                    }
                    String var184 = class270.method170(var177);
                    if (var184 == null) {
                        var184 = "";
                    }
                    var174[var175] = var184;
                }
                var127 = 1;
            } else if (arg0 == 3612) {
                if (client.field1152 == null) {
                    field1347[++Statics.field1348 - 1] = 0;
                } else {
                    field1347[++Statics.field1348 - 1] = Statics.field1321;
                }
                var127 = 1;
            } else if (arg0 == 3613) {
                int var186 = field1347[--Statics.field1348];
                if (client.field1152 == null || var186 >= Statics.field1321) {
                    field1351[++Statics.field1416 - 1] = "";
                } else {
                    field1351[++Statics.field1416 - 1] = Statics.field426[var186].field927;
                }
                var127 = 1;
            } else if (arg0 == 3614) {
                int var187 = field1347[--Statics.field1348];
                if (client.field1152 == null || var187 >= Statics.field1321) {
                    field1347[++Statics.field1348 - 1] = 0;
                } else {
                    field1347[++Statics.field1348 - 1] = Statics.field426[var187].field929;
                }
                var127 = 1;
            } else if (arg0 == 3615) {
                int var188 = field1347[--Statics.field1348];
                if (client.field1152 == null || var188 >= Statics.field1321) {
                    field1347[++Statics.field1348 - 1] = 0;
                } else {
                    field1347[++Statics.field1348 - 1] = Statics.field426[var188].field933;
                }
                var127 = 1;
            } else if (arg0 == 3616) {
                field1347[++Statics.field1348 - 1] = Statics.field729;
                var127 = 1;
            } else if (arg0 == 3617) {
                String var189 = field1351[--Statics.field1416];
                if (Statics.field426 != null) {
                    client.field978.method3139(12);
                    client.field978.method2888(class175.method2869(var189));
                    client.field978.method2894(var189);
                }
                var127 = 1;
            } else if (arg0 == 3618) {
                field1347[++Statics.field1348 - 1] = Statics.field1355;
                var127 = 1;
            } else if (arg0 == 3619) {
                String var190 = field1351[--Statics.field1416];
                if (!var190.equals("")) {
                    client.field978.method3139(136);
                    client.field978.method2888(class175.method2869(var190));
                    client.field978.method2894(var190);
                }
                var127 = 1;
            } else if (arg0 == 3620) {
                client.field978.method3139(136);
                client.field978.method2888(0);
                var127 = 1;
            } else if (arg0 == 3621) {
                if (client.field1193 == 0) {
                    field1347[++Statics.field1348 - 1] = -1;
                } else {
                    field1347[++Statics.field1348 - 1] = client.field1196;
                }
                var127 = 1;
            } else if (arg0 == 3622) {
                int var191 = field1347[--Statics.field1348];
                if (client.field1193 == 0 || var191 >= client.field1196) {
                    field1351[++Statics.field1416 - 1] = "";
                    field1351[++Statics.field1416 - 1] = "";
                } else {
                    field1351[++Statics.field1416 - 1] = client.field1197[var191].field874;
                    field1351[++Statics.field1416 - 1] = client.field1197[var191].field869;
                }
                var127 = 1;
            } else if (arg0 == 3623) {
                String var192 = field1351[--Statics.field1416];
                if (var192.startsWith(Statics.method1570(0)) || var192.startsWith(Statics.method1570(1))) {
                    var192 = var192.substring(7);
                }
                field1347[++Statics.field1348 - 1] = client.method217(var192) ? 1 : 0;
                var127 = 1;
            } else if (arg0 == 3624) {
                int var193 = field1347[--Statics.field1348];
                if (Statics.field426 == null || var193 >= Statics.field1321 || !Statics.field426[var193].field927.equalsIgnoreCase(Statics.field312.field915)) {
                    field1347[++Statics.field1348 - 1] = 0;
                } else {
                    field1347[++Statics.field1348 - 1] = 1;
                }
                var127 = 1;
            } else if (arg0 == 3625) {
                if (client.field980 == null) {
                    field1351[++Statics.field1416 - 1] = "";
                } else {
                    String[] var194 = field1351;
                    int var195 = ++Statics.field1416 - 1;
                    String var196 = client.field980;
                    long var197 = 0L;
                    int var199 = var196.length();
                    for (int var200 = 0; var200 < var199; var200++) {
                        var197 *= 37L;
                        char var201 = var196.charAt(var200);
                        if (var201 >= 'A' && var201 <= 'Z') {
                            var197 += (long) (var201 + 1 - 65);
                        } else if (var201 >= 'a' && var201 <= 'z') {
                            var197 += (long) (var201 + 1 - 97);
                        } else if (var201 >= '0' && var201 <= '9') {
                            var197 += (long) (var201 + 27 - 48);
                        }
                        if (var197 >= 177917621779460413L) {
                            break;
                        }
                    }
                    while (var197 % 37L == 0L && var197 != 0L) {
                        var197 /= 37L;
                    }
                    String var204 = class270.method170(var197);
                    if (var204 == null) {
                        var204 = "";
                    }
                    var194[var195] = var204;
                }
                var127 = 1;
            } else {
                var127 = 2;
            }
            return var127;
        } else if (arg0 < 4000) {
            return method3756(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            byte var208;
            if (arg0 == 4000) {
                Statics.field1348 -= 2;
                int var206 = field1347[Statics.field1348];
                int var207 = field1347[Statics.field1348 + 1];
                field1347[++Statics.field1348 - 1] = var206 + var207;
                var208 = 1;
            } else if (arg0 == 4001) {
                Statics.field1348 -= 2;
                int var209 = field1347[Statics.field1348];
                int var210 = field1347[Statics.field1348 + 1];
                field1347[++Statics.field1348 - 1] = var209 - var210;
                var208 = 1;
            } else if (arg0 == 4002) {
                Statics.field1348 -= 2;
                int var211 = field1347[Statics.field1348];
                int var212 = field1347[Statics.field1348 + 1];
                field1347[++Statics.field1348 - 1] = var211 * var212;
                var208 = 1;
            } else if (arg0 == 4003) {
                Statics.field1348 -= 2;
                int var213 = field1347[Statics.field1348];
                int var214 = field1347[Statics.field1348 + 1];
                field1347[++Statics.field1348 - 1] = var213 / var214;
                var208 = 1;
            } else if (arg0 == 4004) {
                int var215 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = (int) (Math.random() * (double) var215);
                var208 = 1;
            } else if (arg0 == 4005) {
                int var216 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = (int) (Math.random() * (double) (var216 + 1));
                var208 = 1;
            } else if (arg0 == 4006) {
                Statics.field1348 -= 5;
                int var217 = field1347[Statics.field1348];
                int var218 = field1347[Statics.field1348 + 1];
                int var219 = field1347[Statics.field1348 + 2];
                int var220 = field1347[Statics.field1348 + 3];
                int var221 = field1347[Statics.field1348 + 4];
                field1347[++Statics.field1348 - 1] = (var218 - var217) * (var221 - var219) / (var220 - var219) + var217;
                var208 = 1;
            } else if (arg0 == 4007) {
                Statics.field1348 -= 2;
                int var222 = field1347[Statics.field1348];
                int var223 = field1347[Statics.field1348 + 1];
                field1347[++Statics.field1348 - 1] = var222 * var223 / 100 + var222;
                var208 = 1;
            } else if (arg0 == 4008) {
                Statics.field1348 -= 2;
                int var224 = field1347[Statics.field1348];
                int var225 = field1347[Statics.field1348 + 1];
                field1347[++Statics.field1348 - 1] = var224 | 0x1 << var225;
                var208 = 1;
            } else if (arg0 == 4009) {
                Statics.field1348 -= 2;
                int var226 = field1347[Statics.field1348];
                int var227 = field1347[Statics.field1348 + 1];
                field1347[++Statics.field1348 - 1] = var226 & -1 - (0x1 << var227);
                var208 = 1;
            } else if (arg0 == 4010) {
                Statics.field1348 -= 2;
                int var228 = field1347[Statics.field1348];
                int var229 = field1347[Statics.field1348 + 1];
                field1347[++Statics.field1348 - 1] = (var228 & 0x1 << var229) == 0 ? 0 : 1;
                var208 = 1;
            } else if (arg0 == 4011) {
                Statics.field1348 -= 2;
                int var230 = field1347[Statics.field1348];
                int var231 = field1347[Statics.field1348 + 1];
                field1347[++Statics.field1348 - 1] = var230 % var231;
                var208 = 1;
            } else if (arg0 == 4012) {
                Statics.field1348 -= 2;
                int var232 = field1347[Statics.field1348];
                int var233 = field1347[Statics.field1348 + 1];
                if (var232 == 0) {
                    field1347[++Statics.field1348 - 1] = 0;
                } else {
                    field1347[++Statics.field1348 - 1] = (int) Math.pow((double) var232, (double) var233);
                }
                var208 = 1;
            } else if (arg0 == 4013) {
                Statics.field1348 -= 2;
                int var234 = field1347[Statics.field1348];
                int var235 = field1347[Statics.field1348 + 1];
                if (var234 == 0) {
                    field1347[++Statics.field1348 - 1] = 0;
                } else if (var235 == 0) {
                    field1347[++Statics.field1348 - 1] = Integer.MAX_VALUE;
                } else {
                    field1347[++Statics.field1348 - 1] = (int) Math.pow((double) var234, 1.0D / (double) var235);
                }
                var208 = 1;
            } else if (arg0 == 4014) {
                Statics.field1348 -= 2;
                int var236 = field1347[Statics.field1348];
                int var237 = field1347[Statics.field1348 + 1];
                field1347[++Statics.field1348 - 1] = var236 & var237;
                var208 = 1;
            } else if (arg0 == 4015) {
                Statics.field1348 -= 2;
                int var238 = field1347[Statics.field1348];
                int var239 = field1347[Statics.field1348 + 1];
                field1347[++Statics.field1348 - 1] = var238 | var239;
                var208 = 1;
            } else if (arg0 == 4018) {
                Statics.field1348 -= 3;
                long var240 = (long) field1347[Statics.field1348];
                long var242 = (long) field1347[Statics.field1348 + 1];
                long var244 = (long) field1347[Statics.field1348 + 2];
                field1347[++Statics.field1348 - 1] = (int) (var240 * var244 / var242);
                var208 = 1;
            } else {
                var208 = 2;
            }
            return var208;
        } else if (arg0 < 4200) {
            byte var248;
            if (arg0 == 4100) {
                String var246 = field1351[--Statics.field1416];
                int var247 = field1347[--Statics.field1348];
                field1351[++Statics.field1416 - 1] = var246 + var247;
                var248 = 1;
            } else if (arg0 == 4101) {
                Statics.field1416 -= 2;
                String var249 = field1351[Statics.field1416];
                String var250 = field1351[Statics.field1416 + 1];
                field1351[++Statics.field1416 - 1] = var249 + var250;
                var248 = 1;
            } else if (arg0 == 4102) {
                String var251 = field1351[--Statics.field1416];
                int var252 = field1347[--Statics.field1348];
                String[] var253 = field1351;
                int var254 = ++Statics.field1416 - 1;
                String var256;
                if (var252 < 0) {
                    var256 = Integer.toString(var252);
                } else {
                    var256 = class272.method3945(var252, 10, true);
                }
                var253[var254] = var251 + var256;
                var248 = 1;
            } else if (arg0 == 4103) {
                String var257 = field1351[--Statics.field1416];
                field1351[++Statics.field1416 - 1] = var257.toLowerCase();
                var248 = 1;
            } else if (arg0 == 4104) {
                int var258 = field1347[--Statics.field1348];
                long var259 = ((long) var258 + 11745L) * 86400000L;
                field1352.setTime(new Date(var259));
                int var261 = field1352.get(5);
                int var262 = field1352.get(2);
                int var263 = field1352.get(1);
                field1351[++Statics.field1416 - 1] = var261 + "-" + field1349[var262] + "-" + var263;
                var248 = 1;
            } else if (arg0 == 4105) {
                Statics.field1416 -= 2;
                String var264 = field1351[Statics.field1416];
                String var265 = field1351[Statics.field1416 + 1];
                if (Statics.field312.field898 != null && Statics.field312.field898.field2616) {
                    field1351[++Statics.field1416 - 1] = var265;
                } else {
                    field1351[++Statics.field1416 - 1] = var264;
                }
                var248 = 1;
            } else if (arg0 == 4106) {
                int var266 = field1347[--Statics.field1348];
                field1351[++Statics.field1416 - 1] = Integer.toString(var266);
                var248 = 1;
            } else if (arg0 == 4107) {
                Statics.field1416 -= 2;
                int[] var267 = field1347;
                int var268 = ++Statics.field1348 - 1;
                int var269 = class166.method1531(field1351[Statics.field1416], field1351[Statics.field1416 + 1], client.field940);
                byte var270;
                if (var269 > 0) {
                    var270 = 1;
                } else if (var269 < 0) {
                    var270 = -1;
                } else {
                    var270 = 0;
                }
                var267[var268] = var270;
                var248 = 1;
            } else if (arg0 == 4108) {
                String var271 = field1351[--Statics.field1416];
                Statics.field1348 -= 2;
                int var272 = field1347[Statics.field1348];
                int var273 = field1347[Statics.field1348 + 1];
                byte[] var274 = Statics.field3618.method3773(var273, 0);
                class265 var275 = new class265(var274);
                field1347[++Statics.field1348 - 1] = var275.method4418(var271, var272);
                var248 = 1;
            } else if (arg0 == 4109) {
                String var276 = field1351[--Statics.field1416];
                Statics.field1348 -= 2;
                int var277 = field1347[Statics.field1348];
                int var278 = field1347[Statics.field1348 + 1];
                byte[] var279 = Statics.field3618.method3773(var278, 0);
                class265 var280 = new class265(var279);
                field1347[++Statics.field1348 - 1] = var280.method4417(var276, var277);
                var248 = 1;
            } else if (arg0 == 4110) {
                Statics.field1416 -= 2;
                String var281 = field1351[Statics.field1416];
                String var282 = field1351[Statics.field1416 + 1];
                if (field1347[--Statics.field1348] == 1) {
                    field1351[++Statics.field1416 - 1] = var281;
                } else {
                    field1351[++Statics.field1416 - 1] = var282;
                }
                var248 = 1;
            } else if (arg0 == 4111) {
                String var283 = field1351[--Statics.field1416];
                field1351[++Statics.field1416 - 1] = class266.method4419(var283);
                var248 = 1;
            } else if (arg0 == 4112) {
                String var284 = field1351[--Statics.field1416];
                int var285 = field1347[--Statics.field1348];
                field1351[++Statics.field1416 - 1] = var284 + (char) var285;
                var248 = 1;
            } else if (arg0 == 4113) {
                int var286 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = class272.method468((char) var286) ? 1 : 0;
                var248 = 1;
            } else if (arg0 == 4114) {
                int var287 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = class272.method2683((char) var287) ? 1 : 0;
                var248 = 1;
            } else if (arg0 == 4115) {
                int var288 = field1347[--Statics.field1348];
                int[] var289 = field1347;
                int var290 = ++Statics.field1348 - 1;
                char var291 = (char) var288;
                boolean var292 = var291 >= 'A' && var291 <= 'Z' || var291 >= 'a' && var291 <= 'z';
                var289[var290] = var292 ? 1 : 0;
                var248 = 1;
            } else if (arg0 == 4116) {
                int var293 = field1347[--Statics.field1348];
                int[] var294 = field1347;
                int var295 = ++Statics.field1348 - 1;
                char var296 = (char) var293;
                boolean var297 = var296 >= '0' && var296 <= '9';
                var294[var295] = var297 ? 1 : 0;
                var248 = 1;
            } else if (arg0 == 4117) {
                String var298 = field1351[--Statics.field1416];
                if (var298 == null) {
                    field1347[++Statics.field1348 - 1] = 0;
                } else {
                    field1347[++Statics.field1348 - 1] = var298.length();
                }
                var248 = 1;
            } else if (arg0 == 4118) {
                String var299 = field1351[--Statics.field1416];
                Statics.field1348 -= 2;
                int var300 = field1347[Statics.field1348];
                int var301 = field1347[Statics.field1348 + 1];
                field1351[++Statics.field1416 - 1] = var299.substring(var300, var301);
                var248 = 1;
            } else if (arg0 == 4119) {
                String var302 = field1351[--Statics.field1416];
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
                field1351[++Statics.field1416 - 1] = var303.toString();
                var248 = 1;
            } else if (arg0 == 4120) {
                String var307 = field1351[--Statics.field1416];
                int var308 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = var307.indexOf(var308);
                var248 = 1;
            } else if (arg0 == 4121) {
                Statics.field1416 -= 2;
                String var309 = field1351[Statics.field1416];
                String var310 = field1351[Statics.field1416 + 1];
                int var311 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = var309.indexOf(var310, var311);
                var248 = 1;
            } else {
                var248 = 2;
            }
            return var248;
        } else if (arg0 < 4300) {
            byte var313;
            if (arg0 == 4200) {
                int var312 = field1347[--Statics.field1348];
                field1351[++Statics.field1416 - 1] = class258.method1923(var312).field3487;
                var313 = 1;
            } else if (arg0 == 4201) {
                Statics.field1348 -= 2;
                int var314 = field1347[Statics.field1348];
                int var315 = field1347[Statics.field1348 + 1];
                class258 var316 = class258.method1923(var314);
                if (var315 < 1 || var315 > 5 || var316.field3501[var315 - 1] == null) {
                    field1351[++Statics.field1416 - 1] = "";
                } else {
                    field1351[++Statics.field1416 - 1] = var316.field3501[var315 - 1];
                }
                var313 = 1;
            } else if (arg0 == 4202) {
                Statics.field1348 -= 2;
                int var317 = field1347[Statics.field1348];
                int var318 = field1347[Statics.field1348 + 1];
                class258 var319 = class258.method1923(var317);
                if (var318 < 1 || var318 > 5 || var319.field3478[var318 - 1] == null) {
                    field1351[++Statics.field1416 - 1] = "";
                } else {
                    field1351[++Statics.field1416 - 1] = var319.field3478[var318 - 1];
                }
                var313 = 1;
            } else if (arg0 == 4203) {
                int var320 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = class258.method1923(var320).field3497;
                var313 = 1;
            } else if (arg0 == 4204) {
                int var321 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = class258.method1923(var321).field3498 == 1 ? 1 : 0;
                var313 = 1;
            } else if (arg0 == 4205) {
                int var322 = field1347[--Statics.field1348];
                class258 var323 = class258.method1923(var322);
                if (var323.field3519 == -1 && var323.field3518 >= 0) {
                    field1347[++Statics.field1348 - 1] = var323.field3518;
                } else {
                    field1347[++Statics.field1348 - 1] = var322;
                }
                var313 = 1;
            } else if (arg0 == 4206) {
                int var324 = field1347[--Statics.field1348];
                class258 var325 = class258.method1923(var324);
                if (var325.field3519 >= 0 && var325.field3518 >= 0) {
                    field1347[++Statics.field1348 - 1] = var325.field3518;
                } else {
                    field1347[++Statics.field1348 - 1] = var324;
                }
                var313 = 1;
            } else if (arg0 == 4207) {
                int var326 = field1347[--Statics.field1348];
                field1347[++Statics.field1348 - 1] = class258.method1923(var326).field3500 ? 1 : 0;
                var313 = 1;
            } else if (arg0 == 4208) {
                int var327 = field1347[--Statics.field1348];
                class258 var328 = class258.method1923(var327);
                if (var328.field3531 == -1 && var328.field3530 >= 0) {
                    field1347[++Statics.field1348 - 1] = var328.field3530;
                } else {
                    field1347[++Statics.field1348 - 1] = var327;
                }
                var313 = 1;
            } else if (arg0 == 4209) {
                int var329 = field1347[--Statics.field1348];
                class258 var330 = class258.method1923(var329);
                if (var330.field3531 >= 0 && var330.field3530 >= 0) {
                    field1347[++Statics.field1348 - 1] = var330.field3530;
                } else {
                    field1347[++Statics.field1348 - 1] = var329;
                }
                var313 = 1;
            } else if (arg0 == 4210) {
                String var331 = field1351[--Statics.field1416];
                int var332 = field1347[--Statics.field1348];
                client.method501(var331, var332 == 1);
                field1347[++Statics.field1348 - 1] = Statics.field350;
                var313 = 1;
            } else if (arg0 == 4211) {
                if (Statics.field2608 == null || Statics.field2341 >= Statics.field350) {
                    field1347[++Statics.field1348 - 1] = -1;
                } else {
                    field1347[++Statics.field1348 - 1] = Statics.field2608[++Statics.field2341 - 1] & 0xFFFF;
                }
                var313 = 1;
            } else if (arg0 == 4212) {
                Statics.field2341 = 0;
                var313 = 1;
            } else {
                var313 = 2;
            }
            return var313;
        } else if (arg0 < 5100) {
            return Statics.method1411(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method41(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            byte var338;
            if (arg0 == 5504) {
                Statics.field1348 -= 2;
                int var336 = field1347[Statics.field1348];
                int var337 = field1347[Statics.field1348 + 1];
                if (!client.field1173) {
                    client.field1069 = var336;
                    client.field1010 = var337;
                }
                var338 = 1;
            } else if (arg0 == 5505) {
                field1347[++Statics.field1348 - 1] = client.field1069;
                var338 = 1;
            } else if (arg0 == 5506) {
                field1347[++Statics.field1348 - 1] = client.field1010;
                var338 = 1;
            } else if (arg0 == 5530) {
                int var339 = field1347[--Statics.field1348];
                if (var339 < 0) {
                    var339 = 0;
                }
                client.field1200 = var339;
                var338 = 1;
            } else if (arg0 == 5531) {
                field1347[++Statics.field1348 - 1] = client.field1200;
                var338 = 1;
            } else {
                var338 = 2;
            }
            return var338;
        } else if (arg0 < 5700) {
            return method3119(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            byte var340;
            if (arg0 == 6200) {
                Statics.field1348 -= 2;
                client.field1179 = (short) field1347[Statics.field1348];
                if (client.field1179 <= 0) {
                    client.field1179 = 256;
                }
                client.field1153 = (short) field1347[Statics.field1348 + 1];
                if (client.field1153 <= 0) {
                    client.field1153 = 205;
                }
                var340 = 1;
            } else if (arg0 == 6201) {
                Statics.field1348 -= 2;
                client.field1181 = (short) field1347[Statics.field1348];
                if (client.field1181 <= 0) {
                    client.field1181 = 256;
                }
                client.field1201 = (short) field1347[Statics.field1348 + 1];
                if (client.field1201 <= 0) {
                    client.field1201 = 320;
                }
                var340 = 1;
            } else if (arg0 == 6202) {
                Statics.field1348 -= 4;
                client.field1127 = (short) field1347[Statics.field1348];
                if (client.field1127 <= 0) {
                    client.field1127 = 1;
                }
                client.field1184 = (short) field1347[Statics.field1348 + 1];
                if (client.field1184 <= 0) {
                    client.field1184 = 32767;
                } else if (client.field1184 < client.field1127) {
                    client.field1184 = client.field1127;
                }
                client.field1185 = (short) field1347[Statics.field1348 + 2];
                if (client.field1185 <= 0) {
                    client.field1185 = 1;
                }
                client.field1087 = (short) field1347[Statics.field1348 + 3];
                if (client.field1087 <= 0) {
                    client.field1087 = 32767;
                } else if (client.field1087 < client.field1185) {
                    client.field1087 = client.field1185;
                }
                var340 = 1;
            } else if (arg0 == 6203) {
                if (client.field1099 == null) {
                    field1347[++Statics.field1348 - 1] = -1;
                    field1347[++Statics.field1348 - 1] = -1;
                } else {
                    client.method1035(0, 0, client.field1099.field2665, client.field1099.field2666, false);
                    field1347[++Statics.field1348 - 1] = client.field1189;
                    field1347[++Statics.field1348 - 1] = client.field1190;
                }
                var340 = 1;
            } else if (arg0 == 6204) {
                field1347[++Statics.field1348 - 1] = client.field1181;
                field1347[++Statics.field1348 - 1] = client.field1201;
                var340 = 1;
            } else if (arg0 == 6205) {
                field1347[++Statics.field1348 - 1] = client.field1179;
                field1347[++Statics.field1348 - 1] = client.field1153;
                var340 = 1;
            } else {
                var340 = 2;
            }
            return var340;
        } else if (arg0 >= 6600) {
            return arg0 < 6700 ? method3746(arg0, arg1, arg2) : 2;
        } else {
            byte var341;
            if (arg0 == 6500) {
                field1347[++Statics.field1348 - 1] = class81.method1058() ? 1 : 0;
                var341 = 1;
            } else if (arg0 == 6501) {
                class81.field1292 = 0;
                class81 var342;
                if (class81.field1292 < class81.field1291) {
                    var342 = Statics.field1290[++class81.field1292 - 1];
                } else {
                    var342 = null;
                }
                if (var342 == null) {
                    field1347[++Statics.field1348 - 1] = -1;
                    field1347[++Statics.field1348 - 1] = 0;
                    field1351[++Statics.field1416 - 1] = "";
                    field1347[++Statics.field1348 - 1] = 0;
                    field1347[++Statics.field1348 - 1] = 0;
                    field1351[++Statics.field1416 - 1] = "";
                } else {
                    field1347[++Statics.field1348 - 1] = var342.field1304;
                    field1347[++Statics.field1348 - 1] = var342.field1302;
                    field1351[++Statics.field1416 - 1] = var342.field1299;
                    field1347[++Statics.field1348 - 1] = var342.field1300;
                    field1347[++Statics.field1348 - 1] = var342.field1296;
                    field1351[++Statics.field1416 - 1] = var342.field1297;
                }
                var341 = 1;
            } else if (arg0 == 6502) {
                class81 var345;
                if (class81.field1292 < class81.field1291) {
                    var345 = Statics.field1290[++class81.field1292 - 1];
                } else {
                    var345 = null;
                }
                if (var345 == null) {
                    field1347[++Statics.field1348 - 1] = -1;
                    field1347[++Statics.field1348 - 1] = 0;
                    field1351[++Statics.field1416 - 1] = "";
                    field1347[++Statics.field1348 - 1] = 0;
                    field1347[++Statics.field1348 - 1] = 0;
                    field1351[++Statics.field1416 - 1] = "";
                } else {
                    field1347[++Statics.field1348 - 1] = var345.field1304;
                    field1347[++Statics.field1348 - 1] = var345.field1302;
                    field1351[++Statics.field1416 - 1] = var345.field1299;
                    field1347[++Statics.field1348 - 1] = var345.field1300;
                    field1347[++Statics.field1348 - 1] = var345.field1296;
                    field1351[++Statics.field1416 - 1] = var345.field1297;
                }
                var341 = 1;
            } else if (arg0 == 6506) {
                int var347 = field1347[--Statics.field1348];
                class81 var348 = null;
                for (int var349 = 0; var349 < class81.field1291; var349++) {
                    if (Statics.field1290[var349].field1304 == var347) {
                        var348 = Statics.field1290[var349];
                        break;
                    }
                }
                if (var348 == null) {
                    field1347[++Statics.field1348 - 1] = -1;
                    field1347[++Statics.field1348 - 1] = 0;
                    field1351[++Statics.field1416 - 1] = "";
                    field1347[++Statics.field1348 - 1] = 0;
                    field1347[++Statics.field1348 - 1] = 0;
                    field1351[++Statics.field1416 - 1] = "";
                } else {
                    field1347[++Statics.field1348 - 1] = var348.field1304;
                    field1347[++Statics.field1348 - 1] = var348.field1302;
                    field1351[++Statics.field1416 - 1] = var348.field1299;
                    field1347[++Statics.field1348 - 1] = var348.field1300;
                    field1347[++Statics.field1348 - 1] = var348.field1296;
                    field1351[++Statics.field1416 - 1] = var348.field1297;
                }
                var341 = 1;
            } else if (arg0 == 6507) {
                Statics.field1348 -= 4;
                int var350 = field1347[Statics.field1348];
                boolean var351 = field1347[Statics.field1348 + 1] == 1;
                int var352 = field1347[Statics.field1348 + 2];
                boolean var353 = field1347[Statics.field1348 + 3] == 1;
                class81.method255(var350, var351, var352, var353);
                var341 = 1;
            } else if (arg0 == 6511) {
                int var354 = field1347[--Statics.field1348];
                if (var354 >= 0 && var354 < class81.field1291) {
                    class81 var355 = Statics.field1290[var354];
                    field1347[++Statics.field1348 - 1] = var355.field1304;
                    field1347[++Statics.field1348 - 1] = var355.field1302;
                    field1351[++Statics.field1416 - 1] = var355.field1299;
                    field1347[++Statics.field1348 - 1] = var355.field1300;
                    field1347[++Statics.field1348 - 1] = var355.field1296;
                    field1351[++Statics.field1416 - 1] = var355.field1297;
                } else {
                    field1347[++Statics.field1348 - 1] = -1;
                    field1347[++Statics.field1348 - 1] = 0;
                    field1351[++Statics.field1416 - 1] = "";
                    field1347[++Statics.field1348 - 1] = 0;
                    field1347[++Statics.field1348 - 1] = 0;
                    field1351[++Statics.field1416 - 1] = "";
                }
                var341 = 1;
            } else if (arg0 == 6512) {
                client.field1047 = field1347[--Statics.field1348] == 1;
                var341 = 1;
            } else if (arg0 == 6513) {
                Statics.field1348 -= 2;
                int var356 = field1347[Statics.field1348];
                int var357 = field1347[Statics.field1348 + 1];
                class253 var358 = class253.method3764(var357);
                if (var358.method4103()) {
                    field1351[++Statics.field1416 - 1] = class260.method3178(var356).method4314(var357, var358.field3375);
                } else {
                    field1347[++Statics.field1348 - 1] = class260.method3178(var356).method4313(var357, var358.field3378);
                }
                var341 = 1;
            } else if (arg0 == 6514) {
                Statics.field1348 -= 2;
                int var359 = field1347[Statics.field1348];
                int var360 = field1347[Statics.field1348 + 1];
                class253 var361 = class253.method3764(var360);
                if (var361.method4103()) {
                    field1351[++Statics.field1416 - 1] = class257.method483(var359).method4212(var360, var361.field3375);
                } else {
                    field1347[++Statics.field1348 - 1] = class257.method483(var359).method4211(var360, var361.field3378);
                }
                var341 = 1;
            } else if (arg0 == 6515) {
                Statics.field1348 -= 2;
                int var362 = field1347[Statics.field1348];
                int var363 = field1347[Statics.field1348 + 1];
                class253 var364 = class253.method3764(var363);
                if (var364.method4103()) {
                    field1351[++Statics.field1416 - 1] = class258.method1923(var362).method4302(var363, var364.field3375);
                } else {
                    field1347[++Statics.field1348 - 1] = class258.method1923(var362).method4252(var363, var364.field3378);
                }
                var341 = 1;
            } else if (arg0 == 6516) {
                Statics.field1348 -= 2;
                int var365 = field1347[Statics.field1348];
                int var366 = field1347[Statics.field1348 + 1];
                class253 var367 = class253.method3764(var366);
                if (var367.method4103()) {
                    field1351[++Statics.field1416 - 1] = class254.method651(var365).method4117(var366, var367.field3375);
                } else {
                    field1347[++Statics.field1348 - 1] = class254.method651(var365).method4124(var366, var367.field3378);
                }
                var341 = 1;
            } else if (arg0 == 6518) {
                field1347[++Statics.field1348 - 1] = 0;
                var341 = 1;
            } else if (arg0 == 6520) {
                var341 = 1;
            } else if (arg0 == 6521) {
                var341 = 1;
            } else {
                var341 = 2;
            }
            return var341;
        }
    }

    @ObfuscatedName("bq.p(ILcj;ZI)I")
    public static int method1034(int arg0, class101 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1347[--Statics.field1348];
            var4 = class218.method1532(var3);
        } else {
            var4 = arg2 ? Statics.field583 : Statics.field2581;
        }
        if (arg0 == 1000) {
            Statics.field1348 -= 4;
            var4.field2659 = field1347[Statics.field1348];
            var4.field2660 = field1347[Statics.field1348 + 1];
            var4.field2655 = field1347[Statics.field1348 + 2];
            var4.field2735 = field1347[Statics.field1348 + 3];
            client.method1576(var4);
            Statics.field408.method1112(var4);
            if (var3 != -1 && var4.field2652 == 0) {
                client.method701(Statics.field2406[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1348 -= 4;
            var4.field2661 = field1347[Statics.field1348];
            var4.field2657 = field1347[Statics.field1348 + 1];
            var4.field2638 = field1347[Statics.field1348 + 2];
            var4.field2671 = field1347[Statics.field1348 + 3];
            client.method1576(var4);
            Statics.field408.method1112(var4);
            if (var3 != -1 && var4.field2652 == 0) {
                client.method701(Statics.field2406[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1347[--Statics.field1348] == 1;
            if (var4.field2670 != var5) {
                var4.field2670 = var5;
                client.method1576(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2759 = field1347[--Statics.field1348] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2733 = field1347[--Statics.field1348] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("h.x(ILcj;ZI)I")
    public static int method2(int arg0, class101 arg1, boolean arg2) {
        int var3 = -1;
        class218 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1347[--Statics.field1348];
            var4 = class218.method1532(var3);
        } else {
            var4 = arg2 ? Statics.field583 : Statics.field2581;
        }
        if (arg0 == 1100) {
            Statics.field1348 -= 2;
            var4.field2771 = field1347[Statics.field1348];
            if (var4.field2771 > var4.field2673 - var4.field2665) {
                var4.field2771 = var4.field2673 - var4.field2665;
            }
            if (var4.field2771 < 0) {
                var4.field2771 = 0;
            }
            var4.field2672 = field1347[Statics.field1348 + 1];
            if (var4.field2672 > var4.field2674 - var4.field2666) {
                var4.field2672 = var4.field2674 - var4.field2666;
            }
            if (var4.field2672 < 0) {
                var4.field2672 = 0;
            }
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2675 = field1347[--Statics.field1348];
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2679 = field1347[--Statics.field1348] == 1;
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2732 = field1347[--Statics.field1348];
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2685 = field1347[--Statics.field1348];
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2747 = field1347[--Statics.field1348];
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2687 = field1347[--Statics.field1348];
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2688 = field1347[--Statics.field1348] == 1;
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2693 = 1;
            var4.field2713 = field1347[--Statics.field1348];
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1348 -= 6;
            var4.field2699 = field1347[Statics.field1348];
            var4.field2700 = field1347[Statics.field1348 + 1];
            var4.field2701 = field1347[Statics.field1348 + 2];
            var4.field2702 = field1347[Statics.field1348 + 3];
            var4.field2703 = field1347[Statics.field1348 + 4];
            var4.field2704 = field1347[Statics.field1348 + 5];
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1347[--Statics.field1348];
            if (var4.field2776 != var5) {
                var4.field2776 = var5;
                var4.field2772 = 0;
                var4.field2748 = 0;
                client.method1576(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2707 = field1347[--Statics.field1348] == 1;
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1351[--Statics.field1416];
            if (!var6.equals(var4.field2710)) {
                var4.field2710 = var6;
                client.method1576(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2709 = field1347[--Statics.field1348];
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1348 -= 3;
            var4.field2773 = field1347[Statics.field1348];
            var4.field2683 = field1347[Statics.field1348 + 1];
            var4.field2712 = field1347[Statics.field1348 + 2];
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2715 = field1347[--Statics.field1348] == 1;
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2642 = field1347[--Statics.field1348];
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2690 = field1347[--Statics.field1348];
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2691 = field1347[--Statics.field1348] == 1;
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2669 = field1347[--Statics.field1348] == 1;
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1348 -= 2;
            var4.field2673 = field1347[Statics.field1348];
            var4.field2674 = field1347[Statics.field1348 + 1];
            client.method1576(var4);
            if (var3 != -1 && var4.field2652 == 0) {
                client.method701(Statics.field2406[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2723;
            int var8 = var4.field2698;
            client.field978.method3139(72);
            client.field978.method3030(var8);
            client.field978.method2946(var7);
            client.field1091 = var4;
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2686 = field1347[--Statics.field1348];
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2676 = field1347[--Statics.field1348];
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2682 = field1347[--Statics.field1348];
            client.method1576(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var9 = field1347[--Statics.field1348];
            class285 var10 = (class285) class170.method3644(class285.method1391(), var9);
            if (var10 != null) {
                var4.field2680 = var10;
                client.method1576(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var11 = field1347[--Statics.field1348] == 1;
            var4.field2684 = var11;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("i.g(ILcj;ZI)I")
    public static int method48(int arg0, class101 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method1532(field1347[--Statics.field1348]);
        } else {
            var3 = arg2 ? Statics.field583 : Statics.field2581;
        }
        client.method1576(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1348 -= 2;
            int var4 = field1347[Statics.field1348];
            int var5 = field1347[Statics.field1348 + 1];
            var3.field2694 = var4;
            var3.field2758 = var5;
            class258 var6 = class258.method1923(var4);
            var3.field2701 = var6.field3492;
            var3.field2702 = var6.field3483;
            var3.field2703 = var6.field3495;
            var3.field2699 = var6.field3496;
            var3.field2700 = var6.field3488;
            var3.field2704 = var6.field3511;
            if (arg0 == 1205) {
                var3.field2708 = 0;
            } else if (arg0 == 1212 | var6.field3498 == 1) {
                var3.field2708 = 1;
            } else {
                var3.field2708 = 2;
            }
            if (var3.field2705 > 0) {
                var3.field2704 = var3.field2704 * 32 / var3.field2705;
            } else if (var3.field2661 > 0) {
                var3.field2704 = var3.field2704 * 32 / var3.field2661;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2693 = 2;
            var3.field2713 = field1347[--Statics.field1348];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2693 = 3;
            var3.field2713 = Statics.field312.field898.method3646();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("as.c(ILcj;ZI)I")
    public static int method470(int arg0, class101 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method1532(field1347[--Statics.field1348]);
        } else {
            var3 = arg2 ? Statics.field583 : Statics.field2581;
        }
        if (arg0 == 1300) {
            int var4 = field1347[--Statics.field1348] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3693(var4, field1351[--Statics.field1416]);
                return 1;
            } else {
                Statics.field1416--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1348 -= 2;
            int var5 = field1347[Statics.field1348];
            int var6 = field1347[Statics.field1348 + 1];
            var3.field2725 = class218.method3511(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2728 = field1347[--Statics.field1348] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2726 = field1347[--Statics.field1348];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2649 = field1347[--Statics.field1348];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2689 = field1351[--Statics.field1416];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2729 = field1351[--Statics.field1416];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2724 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.l(ILcj;ZI)I")
    public static int method712(int arg0, class101 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method1532(field1347[--Statics.field1348]);
        } else {
            var3 = arg2 ? Statics.field583 : Statics.field2581;
        }
        String var4 = field1351[--Statics.field1416];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1347[--Statics.field1348];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1347[--Statics.field1348];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1351[--Statics.field1416];
            } else {
                var7[var8] = Integer.valueOf(field1347[--Statics.field1348]);
            }
        }
        int var9 = field1347[--Statics.field1348];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2741 = var7;
        } else if (arg0 == 1401) {
            var3.field2662 = var7;
        } else if (arg0 == 1402) {
            var3.field2734 = var7;
        } else if (arg0 == 1403) {
            var3.field2736 = var7;
        } else if (arg0 == 1404) {
            var3.field2738 = var7;
        } else if (arg0 == 1405) {
            var3.field2739 = var7;
        } else if (arg0 == 1406) {
            var3.field2742 = var7;
        } else if (arg0 == 1407) {
            var3.field2743 = var7;
            var3.field2744 = var5;
        } else if (arg0 == 1408) {
            var3.field2692 = var7;
        } else if (arg0 == 1409) {
            var3.field2750 = var7;
        } else if (arg0 == 1410) {
            var3.field2740 = var7;
        } else if (arg0 == 1411) {
            var3.field2770 = var7;
        } else if (arg0 == 1412) {
            var3.field2754 = var7;
        } else if (arg0 == 1414) {
            var3.field2658 = var7;
            var3.field2746 = var5;
        } else if (arg0 == 1415) {
            var3.field2737 = var7;
            var3.field2677 = var5;
        } else if (arg0 == 1416) {
            var3.field2643 = var7;
        } else if (arg0 == 1417) {
            var3.field2751 = var7;
        } else if (arg0 == 1418) {
            var3.field2752 = var7;
        } else if (arg0 == 1419) {
            var3.field2753 = var7;
        } else if (arg0 == 1420) {
            var3.field2783 = var7;
        } else if (arg0 == 1421) {
            var3.field2755 = var7;
        } else if (arg0 == 1422) {
            var3.field2762 = var7;
        } else if (arg0 == 1423) {
            var3.field2757 = var7;
        } else if (arg0 == 1424) {
            var3.field2745 = var7;
        } else if (arg0 == 1425) {
            var3.field2656 = var7;
        } else if (arg0 == 1426) {
            var3.field2760 = var7;
        } else if (arg0 == 1427) {
            var3.field2697 = var7;
        } else {
            return 2;
        }
        var3.field2761 = true;
        return 1;
    }

    @ObfuscatedName("az.w(ILcj;ZI)I")
    public static int method493(int arg0, class101 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field583 : Statics.field2581;
        if (arg0 == 1500) {
            field1347[++Statics.field1348 - 1] = var3.field2663;
            return 1;
        } else if (arg0 == 1501) {
            field1347[++Statics.field1348 - 1] = var3.field2664;
            return 1;
        } else if (arg0 == 1502) {
            field1347[++Statics.field1348 - 1] = var3.field2665;
            return 1;
        } else if (arg0 == 1503) {
            field1347[++Statics.field1348 - 1] = var3.field2666;
            return 1;
        } else if (arg0 == 1504) {
            field1347[++Statics.field1348 - 1] = var3.field2670 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1347[++Statics.field1348 - 1] = var3.field2681;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("t.b(ILcj;ZI)I")
    public static int method131(int arg0, class101 arg1, boolean arg2) {
        class218 var3 = arg2 ? Statics.field583 : Statics.field2581;
        if (arg0 == 1600) {
            field1347[++Statics.field1348 - 1] = var3.field2771;
            return 1;
        } else if (arg0 == 1601) {
            field1347[++Statics.field1348 - 1] = var3.field2672;
            return 1;
        } else if (arg0 == 1602) {
            field1351[++Statics.field1416 - 1] = var3.field2710;
            return 1;
        } else if (arg0 == 1603) {
            field1347[++Statics.field1348 - 1] = var3.field2673;
            return 1;
        } else if (arg0 == 1604) {
            field1347[++Statics.field1348 - 1] = var3.field2674;
            return 1;
        } else if (arg0 == 1605) {
            field1347[++Statics.field1348 - 1] = var3.field2704;
            return 1;
        } else if (arg0 == 1606) {
            field1347[++Statics.field1348 - 1] = var3.field2701;
            return 1;
        } else if (arg0 == 1607) {
            field1347[++Statics.field1348 - 1] = var3.field2703;
            return 1;
        } else if (arg0 == 1608) {
            field1347[++Statics.field1348 - 1] = var3.field2702;
            return 1;
        } else if (arg0 == 1609) {
            field1347[++Statics.field1348 - 1] = var3.field2732;
            return 1;
        } else if (arg0 == 1610) {
            field1347[++Statics.field1348 - 1] = var3.field2682;
            return 1;
        } else if (arg0 == 1611) {
            field1347[++Statics.field1348 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 1612) {
            field1347[++Statics.field1348 - 1] = var3.field2676;
            return 1;
        } else if (arg0 == 1613) {
            field1347[++Statics.field1348 - 1] = var3.field2680.method9();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bu.o(ILcj;ZI)I")
    public static int method1011(int arg0, class101 arg1, boolean arg2) {
        class218 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class218.method1532(field1347[--Statics.field1348]);
        } else {
            var3 = arg2 ? Statics.field583 : Statics.field2581;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1350 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2697 == null) {
            return 0;
        } else {
            class71 var4 = new class71();
            var4.field856 = var3;
            var4.field857 = var3.field2697;
            var4.field865 = field1350 + 1;
            client.field965.method3317(var4);
            return 1;
        }
    }

    @ObfuscatedName("s.m(ILcj;ZB)I")
    public static int method64(int arg0, class101 arg1, boolean arg2) {
        class218 var3 = class218.method1532(field1347[--Statics.field1348]);
        if (arg0 == 2600) {
            field1347[++Statics.field1348 - 1] = var3.field2771;
            return 1;
        } else if (arg0 == 2601) {
            field1347[++Statics.field1348 - 1] = var3.field2672;
            return 1;
        } else if (arg0 == 2602) {
            field1351[++Statics.field1416 - 1] = var3.field2710;
            return 1;
        } else if (arg0 == 2603) {
            field1347[++Statics.field1348 - 1] = var3.field2673;
            return 1;
        } else if (arg0 == 2604) {
            field1347[++Statics.field1348 - 1] = var3.field2674;
            return 1;
        } else if (arg0 == 2605) {
            field1347[++Statics.field1348 - 1] = var3.field2704;
            return 1;
        } else if (arg0 == 2606) {
            field1347[++Statics.field1348 - 1] = var3.field2701;
            return 1;
        } else if (arg0 == 2607) {
            field1347[++Statics.field1348 - 1] = var3.field2703;
            return 1;
        } else if (arg0 == 2608) {
            field1347[++Statics.field1348 - 1] = var3.field2702;
            return 1;
        } else if (arg0 == 2609) {
            field1347[++Statics.field1348 - 1] = var3.field2732;
            return 1;
        } else if (arg0 == 2610) {
            field1347[++Statics.field1348 - 1] = var3.field2682;
            return 1;
        } else if (arg0 == 2611) {
            field1347[++Statics.field1348 - 1] = var3.field2675;
            return 1;
        } else if (arg0 == 2612) {
            field1347[++Statics.field1348 - 1] = var3.field2676;
            return 1;
        } else if (arg0 == 2613) {
            field1347[++Statics.field1348 - 1] = var3.field2680.method9();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.e(ILcj;ZB)I")
    public static int method719(int arg0, class101 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field1348 -= 3;
            client.method5(field1347[Statics.field1348], field1347[Statics.field1348 + 1], field1347[Statics.field1348 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            int var3 = field1347[--Statics.field1348];
            if (var3 == -1 && !client.field1164) {
                Statics.field2502.method3460();
                class205.field2508 = 1;
                Statics.field2503 = null;
            } else if (var3 != -1 && client.field1096 != var3 && client.field1025 != 0 && !client.field1164) {
                class239 var4 = Statics.field3387;
                int var5 = client.field1025;
                class205.field2508 = 1;
                Statics.field2503 = var4;
                Statics.field2206 = var3;
                Statics.field2223 = 0;
                Statics.field2505 = var5;
                Statics.field1533 = false;
                Statics.field2506 = 2;
            }
            client.field1096 = var3;
            return 1;
        } else if (arg0 == 3202) {
            Statics.field1348 -= 2;
            int var6 = field1347[Statics.field1348];
            int var7 = field1347[Statics.field1348 + 1];
            if (client.field1025 != 0 && var6 != -1) {
                class205.method1033(Statics.field2366, var6, 0, client.field1025, false);
                client.field1164 = true;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hk.a(ILcj;ZI)I")
    public static int method3756(int arg0, class101 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1347[--Statics.field1348];
            field1347[++Statics.field1348 - 1] = client.field1126[var3].method90();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1347[--Statics.field1348];
            field1347[++Statics.field1348 - 1] = client.field1126[var4].field304;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1347[--Statics.field1348];
            field1347[++Statics.field1348 - 1] = client.field1126[var5].field309;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1347[--Statics.field1348];
            field1347[++Statics.field1348 - 1] = client.field1126[var6].field310;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1347[--Statics.field1348];
            field1347[++Statics.field1348 - 1] = client.field1126[var7].field307;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1347[--Statics.field1348];
            field1347[++Statics.field1348 - 1] = client.field1126[var8].field308;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1347[--Statics.field1348];
            int var10 = client.field1126[var9].method89();
            field1347[++Statics.field1348 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1347[--Statics.field1348];
            int var12 = client.field1126[var11].method89();
            field1347[++Statics.field1348 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1347[--Statics.field1348];
            int var14 = client.field1126[var13].method89();
            field1347[++Statics.field1348 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1347[--Statics.field1348];
            int var16 = client.field1126[var15].method89();
            field1347[++Statics.field1348 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1347[--Statics.field1348] == 1;
            if (Statics.field780 != null) {
                Statics.field780.method65(class14.field277, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1347[--Statics.field1348] == 1;
            if (Statics.field780 != null) {
                Statics.field780.method65(class14.field284, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1348 -= 2;
            boolean var19 = field1347[Statics.field1348] == 1;
            boolean var20 = field1347[Statics.field1348 + 1] == 1;
            if (Statics.field780 != null) {
                Statics.field780.method65(new class97(var20), var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1347[--Statics.field1348] == 1;
            if (Statics.field780 != null) {
                Statics.field780.method65(class14.field275, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1347[--Statics.field1348] == 1;
            if (Statics.field780 != null) {
                Statics.field780.method65(class14.field276, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1347[++Statics.field1348 - 1] = Statics.field780 == null ? 0 : Statics.field780.field283.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1347[--Statics.field1348];
            class15 var24 = (class15) Statics.field780.field283.get(var23);
            field1347[++Statics.field1348 - 1] = var24.field294;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1347[--Statics.field1348];
            class15 var26 = (class15) Statics.field780.field283.get(var25);
            field1351[++Statics.field1416 - 1] = var26.method74();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1347[--Statics.field1348];
            class15 var28 = (class15) Statics.field780.field283.get(var27);
            field1351[++Statics.field1416 - 1] = var28.method71();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1347[--Statics.field1348];
            class15 var30 = (class15) Statics.field780.field283.get(var29);
            long var31 = class177.method1067() - Statics.field430 - var30.field287;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1351[++Statics.field1416 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1347[--Statics.field1348];
            class15 var38 = (class15) Statics.field780.field283.get(var37);
            field1347[++Statics.field1348 - 1] = var38.field292.field310;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1347[--Statics.field1348];
            class15 var40 = (class15) Statics.field780.field283.get(var39);
            field1347[++Statics.field1348 - 1] = var40.field292.field309;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1347[--Statics.field1348];
            class15 var42 = (class15) Statics.field780.field283.get(var41);
            field1347[++Statics.field1348 - 1] = var42.field292.field304;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("m.t(ILcj;ZI)I")
    public static int method41(int arg0, class101 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field1347[++Statics.field1348 - 1] = client.method66();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field1347[--Statics.field1348];
            if (var3 == 1 || var3 == 2) {
                client.field1140 = 0L;
                if (var3 >= 2) {
                    client.field1041 = true;
                } else {
                    client.field1041 = false;
                }
                if (client.method66() == 1) {
                    Statics.field408.method777(765, 503);
                } else {
                    Statics.field408.method777(7680, 2160);
                }
                if (client.field942 >= 25) {
                    client.method1558();
                }
            }
            return 1;
        } else if (arg0 == 5308) {
            field1347[++Statics.field1348 - 1] = Statics.field22.field1311;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field1347[--Statics.field1348];
            if (var4 == 1 || var4 == 2) {
                Statics.field22.field1311 = var4;
                class82.method333();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fa.y(ILcj;ZI)I")
    public static int method3119(int arg0, class101 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field988 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hl.u(ILcj;ZI)I")
    public static int method3746(int arg0, class101 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field509;
            int var4 = (Statics.field312.field1262 >> 7) + Statics.field608;
            int var5 = (Statics.field312.field1259 >> 7) + Statics.field587;
            client.method214().method4852(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1347[--Statics.field1348];
            String var7 = "";
            class33 var8 = client.method214().method4874(var6);
            if (var8 != null) {
                var7 = var8.method283();
            }
            field1351[++Statics.field1416 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1347[--Statics.field1348];
            client.method214().method4859(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1347[++Statics.field1348 - 1] = client.method214().method5007();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1347[--Statics.field1348];
            client.method214().method5033(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1347[++Statics.field1348 - 1] = client.method214().method4873() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class214 var11 = new class214(field1347[--Statics.field1348]);
            client.method214().method4875(var11.field2609, var11.field2611);
            return 1;
        } else if (arg0 == 6607) {
            class214 var12 = new class214(field1347[--Statics.field1348]);
            client.method214().method4876(var12.field2609, var12.field2611);
            return 1;
        } else if (arg0 == 6608) {
            class214 var13 = new class214(field1347[--Statics.field1348]);
            client.method214().method4877(var13.field2610, var13.field2609, var13.field2611);
            return 1;
        } else if (arg0 == 6609) {
            class214 var14 = new class214(field1347[--Statics.field1348]);
            client.method214().method4878(var14.field2610, var14.field2609, var14.field2611);
            return 1;
        } else if (arg0 == 6610) {
            field1347[++Statics.field1348 - 1] = client.method214().method4879();
            field1347[++Statics.field1348 - 1] = client.method214().method4935();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1347[--Statics.field1348];
            class33 var16 = client.method214().method4874(var15);
            if (var16 == null) {
                field1347[++Statics.field1348 - 1] = 0;
            } else {
                field1347[++Statics.field1348 - 1] = var16.method278().method3621();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1347[--Statics.field1348];
            class33 var18 = client.method214().method4874(var17);
            if (var18 == null) {
                field1347[++Statics.field1348 - 1] = 0;
                field1347[++Statics.field1348 - 1] = 0;
            } else {
                field1347[++Statics.field1348 - 1] = (var18.method315() - var18.method271() + 1) * 64;
                field1347[++Statics.field1348 - 1] = (var18.method317() - var18.method288() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1347[--Statics.field1348];
            class33 var20 = client.method214().method4874(var19);
            if (var20 == null) {
                field1347[++Statics.field1348 - 1] = 0;
                field1347[++Statics.field1348 - 1] = 0;
                field1347[++Statics.field1348 - 1] = 0;
                field1347[++Statics.field1348 - 1] = 0;
            } else {
                field1347[++Statics.field1348 - 1] = var20.method271() * 64;
                field1347[++Statics.field1348 - 1] = var20.method288() * 64;
                field1347[++Statics.field1348 - 1] = var20.method315() * 64 + 64 - 1;
                field1347[++Statics.field1348 - 1] = var20.method317() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1347[--Statics.field1348];
            class33 var22 = client.method214().method4874(var21);
            if (var22 == null) {
                field1347[++Statics.field1348 - 1] = -1;
            } else {
                field1347[++Statics.field1348 - 1] = var22.method270();
            }
            return 1;
        } else if (arg0 == 6615) {
            class214 var23 = client.method214().method4881();
            if (var23 == null) {
                field1347[++Statics.field1348 - 1] = -1;
                field1347[++Statics.field1348 - 1] = -1;
            } else {
                field1347[++Statics.field1348 - 1] = var23.field2609;
                field1347[++Statics.field1348 - 1] = var23.field2611;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1347[++Statics.field1348 - 1] = client.method214().method4860();
            return 1;
        } else if (arg0 == 6617) {
            class214 var24 = new class214(field1347[--Statics.field1348]);
            class33 var25 = client.method214().method4965();
            if (var25 == null) {
                field1347[++Statics.field1348 - 1] = -1;
                field1347[++Statics.field1348 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method329(var24.field2610, var24.field2609, var24.field2611);
            if (var26 == null) {
                field1347[++Statics.field1348 - 1] = -1;
                field1347[++Statics.field1348 - 1] = -1;
            } else {
                field1347[++Statics.field1348 - 1] = var26[0];
                field1347[++Statics.field1348 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class214 var27 = new class214(field1347[--Statics.field1348]);
            class33 var28 = client.method214().method4965();
            if (var28 == null) {
                field1347[++Statics.field1348 - 1] = -1;
                field1347[++Statics.field1348 - 1] = -1;
                return 1;
            }
            class214 var29 = var28.method263(var27.field2609, var27.field2611);
            if (var29 == null) {
                field1347[++Statics.field1348 - 1] = -1;
            } else {
                field1347[++Statics.field1348 - 1] = var29.method3621();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field1348 -= 2;
            int var30 = field1347[Statics.field1348];
            class214 var31 = new class214(field1347[Statics.field1348 + 1]);
            class33 var32 = client.method214().method4874(var30);
            int var33 = Statics.field312.field919;
            int var34 = (Statics.field312.field1262 >> 7) + Statics.field608;
            int var35 = (Statics.field312.field1259 >> 7) + Statics.field587;
            class214 var36 = new class214(var33, var34, var35);
            client.method214().method4854(var32, var36, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field1348 -= 2;
            int var37 = field1347[Statics.field1348];
            class214 var38 = new class214(field1347[Statics.field1348 + 1]);
            class33 var39 = client.method214().method4874(var37);
            int var40 = Statics.field312.field919;
            int var41 = (Statics.field312.field1262 >> 7) + Statics.field608;
            int var42 = (Statics.field312.field1259 >> 7) + Statics.field587;
            class214 var43 = new class214(var40, var41, var42);
            client.method214().method4854(var39, var43, var38, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field1348 -= 2;
            int var44 = field1347[Statics.field1348];
            class214 var45 = new class214(field1347[Statics.field1348 + 1]);
            class33 var46 = client.method214().method4874(var44);
            if (var46 == null) {
                field1347[++Statics.field1348 - 1] = 0;
                return 1;
            } else {
                field1347[++Statics.field1348 - 1] = var46.method260(var45.field2610, var45.field2609, var45.field2611) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1347[++Statics.field1348 - 1] = client.method214().method4964();
            field1347[++Statics.field1348 - 1] = client.method214().method4861();
            return 1;
        } else if (arg0 == 6623) {
            class214 var47 = new class214(field1347[--Statics.field1348]);
            class33 var48 = client.method214().method4894(var47.field2610, var47.field2609, var47.field2611);
            if (var48 == null) {
                field1347[++Statics.field1348 - 1] = -1;
            } else {
                field1347[++Statics.field1348 - 1] = var48.method272();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method214().method4884(field1347[--Statics.field1348]);
            return 1;
        } else if (arg0 == 6625) {
            client.method214().method4974();
            return 1;
        } else if (arg0 == 6626) {
            client.method214().method5005(field1347[--Statics.field1348]);
            return 1;
        } else if (arg0 == 6627) {
            client.method214().method4887();
            return 1;
        } else if (arg0 == 6628) {
            boolean var49 = field1347[--Statics.field1348] == 1;
            client.method214().method4888(var49);
            return 1;
        } else if (arg0 == 6629) {
            int var50 = field1347[--Statics.field1348];
            client.method214().method4928(var50);
            return 1;
        } else if (arg0 == 6630) {
            int var51 = field1347[--Statics.field1348];
            client.method214().method4890(var51);
            return 1;
        } else if (arg0 == 6631) {
            client.method214().method4969();
            return 1;
        } else if (arg0 == 6632) {
            boolean var52 = field1347[--Statics.field1348] == 1;
            client.method214().method4892(var52);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field1348 -= 2;
            int var53 = field1347[Statics.field1348];
            boolean var54 = field1347[Statics.field1348 + 1] == 1;
            client.method214().method4922(var53, var54);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field1348 -= 2;
            int var55 = field1347[Statics.field1348];
            boolean var56 = field1347[Statics.field1348 + 1] == 1;
            client.method214().method4889(var55, var56);
            return 1;
        } else if (arg0 == 6635) {
            field1347[++Statics.field1348 - 1] = client.method214().method4960() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var57 = field1347[--Statics.field1348];
            field1347[++Statics.field1348 - 1] = client.method214().method4995(var57) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var58 = field1347[--Statics.field1348];
            field1347[++Statics.field1348 - 1] = client.method214().method4882(var58) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field1348 -= 2;
            int var59 = field1347[Statics.field1348];
            class214 var60 = new class214(field1347[Statics.field1348 + 1]);
            class214 var61 = client.method214().method5022(var59, var60);
            if (var61 == null) {
                field1347[++Statics.field1348 - 1] = -1;
            } else {
                field1347[++Statics.field1348 - 1] = var61.method3621();
            }
            return 1;
        } else if (arg0 == 6639) {
            class40 var62 = client.method214().method4901();
            if (var62 == null) {
                field1347[++Statics.field1348 - 1] = -1;
                field1347[++Statics.field1348 - 1] = -1;
            } else {
                field1347[++Statics.field1348 - 1] = var62.field545;
                field1347[++Statics.field1348 - 1] = var62.field543.method3621();
            }
            return 1;
        } else if (arg0 == 6640) {
            class40 var63 = client.method214().method4902();
            if (var63 == null) {
                field1347[++Statics.field1348 - 1] = -1;
                field1347[++Statics.field1348 - 1] = -1;
            } else {
                field1347[++Statics.field1348 - 1] = var63.field545;
                field1347[++Statics.field1348 - 1] = var63.field543.method3621();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var64 = field1347[--Statics.field1348];
            class244 var65 = Statics.field3285[var64];
            if (var65.field3280 == null) {
                field1351[++Statics.field1416 - 1] = "";
            } else {
                field1351[++Statics.field1416 - 1] = var65.field3280;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var66 = field1347[--Statics.field1348];
            class244 var67 = Statics.field3285[var66];
            field1347[++Statics.field1348 - 1] = var67.field3282;
            return 1;
        } else if (arg0 == 6695) {
            int var68 = field1347[--Statics.field1348];
            class244 var69 = Statics.field3285[var68];
            if (var69 == null) {
                field1347[++Statics.field1348 - 1] = -1;
            } else {
                field1347[++Statics.field1348 - 1] = var69.field3297;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var70 = field1347[--Statics.field1348];
            class244 var71 = Statics.field3285[var70];
            if (var71 == null) {
                field1347[++Statics.field1348 - 1] = -1;
            } else {
                field1347[++Statics.field1348 - 1] = var71.field3281;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1347[++Statics.field1348 - 1] = Statics.field1667.field612;
            return 1;
        } else if (arg0 == 6698) {
            field1347[++Statics.field1348 - 1] = Statics.field1667.field603.method3621();
            return 1;
        } else if (arg0 == 6699) {
            field1347[++Statics.field1348 - 1] = Statics.field1667.field610.method3621();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gx.n(II)V")
    public static void method3512(int arg0) {
        if (arg0 == -1 || !class218.method1059(arg0)) {
            return;
        }
        class218[] var1 = Statics.field2406[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3.field2731 != null) {
                class71 var4 = new class71();
                var4.field856 = var3;
                var4.field857 = var3.field2731;
                method504(var4, 2000000);
            }
        }
    }
}
