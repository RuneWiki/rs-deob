package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;

@ObfuscatedName("cv")
public class class83 {

    @ObfuscatedName("cv.u")
    public static int[] field1241 = new int[5];

    @ObfuscatedName("cv.z")
    public static int[][] field1246 = new int[5][5000];

    @ObfuscatedName("cv.t")
    public static int[] field1242 = new int[1000];

    @ObfuscatedName("cv.g")
    public static String[] field1245 = new String[1000];

    @ObfuscatedName("cv.x")
    public static int field1238 = 0;

    @ObfuscatedName("cv.c")
    public static class63[] field1250 = new class63[50];

    @ObfuscatedName("cv.y")
    public static Calendar field1248 = Calendar.getInstance();

    @ObfuscatedName("cv.o")
    public static final String[] field1249 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cv.i")
    public static int field1251 = 0;

    public class83() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.a(Lby;S)V")
    public static void method2139(class69 arg0) {
        method142(arg0, 200000);
    }

    @ObfuscatedName("b.w(Lby;IB)V")
    public static void method142(class69 arg0, int arg1) {
        Object[] var2 = arg0.field775;
        class231 var3 = arg0.field780;
        boolean var4 = class231.field2901 == var3 || class231.field2898 == var3 || class231.field2907 == var3 || class231.field2900 == var3 || class231.field2904 == var3 || class231.field2902 == var3 || class231.field2903 == var3 || class231.field2897 == var3;
        class98 var14;
        if (var4) {
            Statics.field1239 = (class48) var2[0];
            class254 var5 = Statics.field3379[Statics.field1239.field565];
            class231 var6 = arg0.field780;
            int var7 = var5.field3396;
            int var8 = var5.field3399;
            int var9 = class236.method621(var7, var6);
            class98 var10 = class98.method72(var9, var6);
            class98 var11;
            if (var10 == null) {
                int var12 = class236.method2932(var8, var6);
                class98 var13 = class98.method72(var12, var6);
                if (var13 == null) {
                    var11 = null;
                } else {
                    var11 = var13;
                }
            } else {
                var11 = var10;
            }
            var14 = var11;
        } else {
            int var15 = (Integer) var2[0];
            var14 = class98.method944(var15);
        }
        if (var14 == null) {
            return;
        }
        Statics.field1244 = 0;
        Statics.field466 = 0;
        int var16 = -1;
        int[] var17 = var14.field1422;
        int[] var18 = var14.field1423;
        byte var19 = -1;
        field1238 = 0;
        try {
            Statics.field3750 = new int[var14.field1425];
            int var20 = 0;
            Statics.field1243 = new String[var14.field1426];
            int var21 = 0;
            for (int var22 = 1; var22 < var2.length; var22++) {
                if (var2[var22] instanceof Integer) {
                    int var23 = (Integer) var2[var22];
                    if (var23 == -2147483647) {
                        var23 = arg0.field772;
                    }
                    if (var23 == -2147483646) {
                        var23 = arg0.field773;
                    }
                    if (var23 == -2147483645) {
                        var23 = arg0.field771 == null ? -1 : arg0.field771.field2868;
                    }
                    if (var23 == -2147483644) {
                        var23 = arg0.field774;
                    }
                    if (var23 == -2147483643) {
                        var23 = arg0.field771 == null ? -1 : arg0.field771.field2761;
                    }
                    if (var23 == -2147483642) {
                        var23 = arg0.field777 == null ? -1 : arg0.field777.field2868;
                    }
                    if (var23 == -2147483641) {
                        var23 = arg0.field777 == null ? -1 : arg0.field777.field2761;
                    }
                    if (var23 == -2147483640) {
                        var23 = arg0.field769;
                    }
                    if (var23 == -2147483639) {
                        var23 = arg0.field776;
                    }
                    Statics.field3750[var20++] = var23;
                } else if (var2[var22] instanceof String) {
                    String var24 = (String) var2[var22];
                    if (var24.equals("event_opbase")) {
                        var24 = arg0.field778;
                    }
                    Statics.field1243[var21++] = var24;
                }
            }
            int var25 = 0;
            field1251 = arg0.field779;
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
                                                                                                                label278: while (true) {
                                                                                                                    var25++;
                                                                                                                    if (var25 > arg1) {
                                                                                                                        throw new RuntimeException();
                                                                                                                    }
                                                                                                                    var16++;
                                                                                                                    int var80 = var17[var16];
                                                                                                                    if (var80 >= 100) {
                                                                                                                        boolean var74;
                                                                                                                        if (var14.field1423[var16] == 1) {
                                                                                                                            var74 = true;
                                                                                                                        } else {
                                                                                                                            var74 = false;
                                                                                                                        }
                                                                                                                        int var75 = Statics.method3752(var80, var14, var74);
                                                                                                                        switch(var75) {
                                                                                                                            case 0:
                                                                                                                                return;
                                                                                                                            case 1:
                                                                                                                            default:
                                                                                                                                break;
                                                                                                                            case 2:
                                                                                                                                throw new IllegalStateException();
                                                                                                                        }
                                                                                                                    } else if (var80 == 0) {
                                                                                                                        field1242[++Statics.field1244 - 1] = var18[var16];
                                                                                                                    } else if (var80 == 1) {
                                                                                                                        int var26 = var18[var16];
                                                                                                                        field1242[++Statics.field1244 - 1] = class223.field2723[var26];
                                                                                                                    } else if (var80 == 2) {
                                                                                                                        int var27 = var18[var16];
                                                                                                                        class223.field2723[var27] = field1242[--Statics.field1244];
                                                                                                                        client.method2693(var27);
                                                                                                                    } else if (var80 == 3) {
                                                                                                                        field1245[++Statics.field466 - 1] = var14.field1427[var16];
                                                                                                                    } else if (var80 == 6) {
                                                                                                                        var16 += var18[var16];
                                                                                                                    } else if (var80 == 7) {
                                                                                                                        Statics.field1244 -= 2;
                                                                                                                        if (field1242[Statics.field1244] != field1242[Statics.field1244 + 1]) {
                                                                                                                            var16 += var18[var16];
                                                                                                                        }
                                                                                                                    } else if (var80 == 8) {
                                                                                                                        Statics.field1244 -= 2;
                                                                                                                        if (field1242[Statics.field1244] == field1242[Statics.field1244 + 1]) {
                                                                                                                            var16 += var18[var16];
                                                                                                                        }
                                                                                                                    } else if (var80 == 9) {
                                                                                                                        Statics.field1244 -= 2;
                                                                                                                        if (field1242[Statics.field1244] < field1242[Statics.field1244 + 1]) {
                                                                                                                            var16 += var18[var16];
                                                                                                                        }
                                                                                                                    } else if (var80 == 10) {
                                                                                                                        Statics.field1244 -= 2;
                                                                                                                        if (field1242[Statics.field1244] > field1242[Statics.field1244 + 1]) {
                                                                                                                            var16 += var18[var16];
                                                                                                                        }
                                                                                                                    } else if (var80 == 21) {
                                                                                                                        if (field1238 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class63 var28 = field1250[--field1238];
                                                                                                                        var14 = var28.field716;
                                                                                                                        var17 = var14.field1422;
                                                                                                                        var18 = var14.field1423;
                                                                                                                        var16 = var28.field717;
                                                                                                                        Statics.field3750 = var28.field714;
                                                                                                                        Statics.field1243 = var28.field721;
                                                                                                                    } else if (var80 == 25) {
                                                                                                                        int var29 = var18[var16];
                                                                                                                        field1242[++Statics.field1244 - 1] = Statics.method463(var29);
                                                                                                                    } else if (var80 == 27) {
                                                                                                                        int var30 = var18[var16];
                                                                                                                        int var31 = field1242[--Statics.field1244];
                                                                                                                        class262 var32 = (class262) class262.field3458.method3373((long) var30);
                                                                                                                        class262 var33;
                                                                                                                        if (var32 == null) {
                                                                                                                            byte[] var34 = Statics.field3460.method3897(14, var30);
                                                                                                                            class262 var35 = new class262();
                                                                                                                            if (var34 != null) {
                                                                                                                                var35.method4189(new class185(var34));
                                                                                                                            }
                                                                                                                            class262.field3458.method3375(var35, (long) var30);
                                                                                                                            var33 = var35;
                                                                                                                        } else {
                                                                                                                            var33 = var32;
                                                                                                                        }
                                                                                                                        int var37 = var33.field3462;
                                                                                                                        int var38 = var33.field3461;
                                                                                                                        int var39 = var33.field3464;
                                                                                                                        int var40 = class223.field2721[var39 - var38];
                                                                                                                        if (var31 < 0 || var31 > var40) {
                                                                                                                            var31 = 0;
                                                                                                                        }
                                                                                                                        int var41 = var40 << var38;
                                                                                                                        class223.field2723[var37] = class223.field2723[var37] & ~var41 | var31 << var38 & var41;
                                                                                                                    } else if (var80 == 31) {
                                                                                                                        Statics.field1244 -= 2;
                                                                                                                        if (field1242[Statics.field1244] <= field1242[Statics.field1244 + 1]) {
                                                                                                                            var16 += var18[var16];
                                                                                                                        }
                                                                                                                    } else if (var80 == 32) {
                                                                                                                        Statics.field1244 -= 2;
                                                                                                                        if (field1242[Statics.field1244] >= field1242[Statics.field1244 + 1]) {
                                                                                                                            var16 += var18[var16];
                                                                                                                        }
                                                                                                                    } else if (var80 == 33) {
                                                                                                                        field1242[++Statics.field1244 - 1] = Statics.field3750[var18[var16]];
                                                                                                                    } else if (var80 == 34) {
                                                                                                                        Statics.field3750[var18[var16]] = field1242[--Statics.field1244];
                                                                                                                    } else if (var80 == 35) {
                                                                                                                        field1245[++Statics.field466 - 1] = Statics.field1243[var18[var16]];
                                                                                                                    } else if (var80 == 36) {
                                                                                                                        Statics.field1243[var18[var16]] = field1245[--Statics.field466];
                                                                                                                    } else if (var80 == 37) {
                                                                                                                        int var42 = var18[var16];
                                                                                                                        Statics.field466 -= var42;
                                                                                                                        String[] var43 = field1245;
                                                                                                                        int var44 = Statics.field466;
                                                                                                                        String var45;
                                                                                                                        if (var42 == 0) {
                                                                                                                            var45 = "";
                                                                                                                        } else if (var42 == 1) {
                                                                                                                            String var46 = var43[var44];
                                                                                                                            if (var46 == null) {
                                                                                                                                var45 = "null";
                                                                                                                            } else {
                                                                                                                                var45 = var46.toString();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            int var47 = var42 + var44;
                                                                                                                            int var48 = 0;
                                                                                                                            for (int var49 = var44; var49 < var47; var49++) {
                                                                                                                                String var50 = var43[var49];
                                                                                                                                if (var50 == null) {
                                                                                                                                    var48 += 4;
                                                                                                                                } else {
                                                                                                                                    var48 += var50.length();
                                                                                                                                }
                                                                                                                            }
                                                                                                                            StringBuilder var51 = new StringBuilder(var48);
                                                                                                                            for (int var52 = var44; var52 < var47; var52++) {
                                                                                                                                String var53 = var43[var52];
                                                                                                                                if (var53 == null) {
                                                                                                                                    var51.append("null");
                                                                                                                                } else {
                                                                                                                                    var51.append(var53);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var45 = var51.toString();
                                                                                                                        }
                                                                                                                        field1245[++Statics.field466 - 1] = var45;
                                                                                                                    } else if (var80 == 38) {
                                                                                                                        Statics.field1244--;
                                                                                                                    } else if (var80 == 39) {
                                                                                                                        Statics.field466--;
                                                                                                                    } else if (var80 == 40) {
                                                                                                                        int var55 = var18[var16];
                                                                                                                        class98 var56 = class98.method944(var55);
                                                                                                                        int[] var57 = new int[var56.field1425];
                                                                                                                        String[] var58 = new String[var56.field1426];
                                                                                                                        for (int var59 = 0; var59 < var56.field1421; var59++) {
                                                                                                                            var57[var59] = field1242[Statics.field1244 - var56.field1421 + var59];
                                                                                                                        }
                                                                                                                        for (int var60 = 0; var60 < var56.field1428; var60++) {
                                                                                                                            var58[var60] = field1245[Statics.field466 - var56.field1428 + var60];
                                                                                                                        }
                                                                                                                        Statics.field1244 -= var56.field1421;
                                                                                                                        Statics.field466 -= var56.field1428;
                                                                                                                        class63 var61 = new class63();
                                                                                                                        var61.field716 = var14;
                                                                                                                        var61.field717 = var16;
                                                                                                                        var61.field714 = Statics.field3750;
                                                                                                                        var61.field721 = Statics.field1243;
                                                                                                                        field1250[++field1238 - 1] = var61;
                                                                                                                        var14 = var56;
                                                                                                                        var17 = var56.field1422;
                                                                                                                        var18 = var56.field1423;
                                                                                                                        var16 = -1;
                                                                                                                        Statics.field3750 = var57;
                                                                                                                        Statics.field1243 = var58;
                                                                                                                    } else if (var80 == 42) {
                                                                                                                        field1242[++Statics.field1244 - 1] = Statics.field1460.method1618(var18[var16]);
                                                                                                                    } else if (var80 == 43) {
                                                                                                                        Statics.field1460.method1617(var18[var16], field1242[--Statics.field1244]);
                                                                                                                    } else if (var80 == 44) {
                                                                                                                        int var62 = var18[var16] >> 16;
                                                                                                                        int var63 = var18[var16] & 0xFFFF;
                                                                                                                        int var64 = field1242[--Statics.field1244];
                                                                                                                        if (var64 >= 0 && var64 <= 5000) {
                                                                                                                            field1241[var62] = var64;
                                                                                                                            byte var65 = -1;
                                                                                                                            if (var63 == 105) {
                                                                                                                                var65 = 0;
                                                                                                                            }
                                                                                                                            int var66 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var66 >= var64) {
                                                                                                                                    continue label278;
                                                                                                                                }
                                                                                                                                field1246[var62][var66] = var65;
                                                                                                                                var66++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var80 == 45) {
                                                                                                                        int var67 = var18[var16];
                                                                                                                        int var68 = field1242[--Statics.field1244];
                                                                                                                        if (var68 < 0 || var68 >= field1241[var67]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1242[++Statics.field1244 - 1] = field1246[var67][var68];
                                                                                                                    } else if (var80 == 46) {
                                                                                                                        int var69 = var18[var16];
                                                                                                                        Statics.field1244 -= 2;
                                                                                                                        int var70 = field1242[Statics.field1244];
                                                                                                                        if (var70 < 0 || var70 >= field1241[var69]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1246[var69][var70] = field1242[Statics.field1244 + 1];
                                                                                                                    } else if (var80 == 47) {
                                                                                                                        String var71 = Statics.field1460.method1616(var18[var16]);
                                                                                                                        if (var71 == null) {
                                                                                                                            var71 = "null";
                                                                                                                        }
                                                                                                                        field1245[++Statics.field466 - 1] = var71;
                                                                                                                    } else if (var80 == 48) {
                                                                                                                        Statics.field1460.method1619(var18[var16], field1245[--Statics.field466]);
                                                                                                                    } else if (var80 == 60) {
                                                                                                                        class198 var72 = var14.field1429[var18[var16]];
                                                                                                                        class210 var73 = (class210) var72.method3350((long) field1242[--Statics.field1244]);
                                                                                                                        if (var73 != null) {
                                                                                                                            var16 += var73.field2604;
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
        } catch (Exception var79) {
            StringBuilder var77 = new StringBuilder(30);
            var77.append("").append(var14.field2589).append(" ");
            for (int var78 = field1238 - 1; var78 >= 0; var78--) {
                var77.append("").append(field1250[var78].field716.field2589).append(" ");
            }
            var77.append("").append(var19);
            class155.method1339(var77.toString(), var79);
        }
    }

    @ObfuscatedName("bo.k(ILck;ZB)I")
    public static int method1337(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field1244 -= 3;
            int var3 = field1242[Statics.field1244];
            int var4 = field1242[Statics.field1244 + 1];
            int var5 = field1242[Statics.field1244 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class228 var6 = class228.method2391(var3);
            if (var6.field2833 == null) {
                var6.field2833 = new class228[var5 + 1];
            }
            if (var6.field2833.length <= var5) {
                class228[] var7 = new class228[var5 + 1];
                for (int var8 = 0; var8 < var6.field2833.length; var8++) {
                    var7[var8] = var6.field2833[var8];
                }
                var6.field2833 = var7;
            }
            if (var5 > 0 && var6.field2833[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class228 var9 = new class228();
            var9.field2762 = var4;
            var9.field2779 = var9.field2868 = var6.field2868;
            var9.field2761 = var5;
            var9.field2791 = true;
            var6.field2833[var5] = var9;
            if (arg2) {
                Statics.field2009 = var9;
            } else {
                Statics.field1307 = var9;
            }
            client.method308(var6);
            return 1;
        } else if (arg0 == 101) {
            class228 var10 = arg2 ? Statics.field2009 : Statics.field1307;
            class228 var11 = class228.method2391(var10.field2868);
            var11.field2833[var10.field2761] = null;
            client.method308(var11);
            return 1;
        } else if (arg0 == 102) {
            class228 var12 = class228.method2391(field1242[--Statics.field1244]);
            var12.field2833 = null;
            client.method308(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field1244 -= 2;
            int var13 = field1242[Statics.field1244];
            int var14 = field1242[Statics.field1244 + 1];
            class228 var15 = class228.method2202(var13, var14);
            if (var15 == null || var14 == -1) {
                field1242[++Statics.field1244 - 1] = 0;
            } else {
                field1242[++Statics.field1244 - 1] = 1;
                if (arg2) {
                    Statics.field2009 = var15;
                } else {
                    Statics.field1307 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class228 var16 = class228.method2391(field1242[--Statics.field1244]);
            if (var16 == null) {
                field1242[++Statics.field1244 - 1] = 0;
            } else {
                field1242[++Statics.field1244 - 1] = 1;
                if (arg2) {
                    Statics.field2009 = var16;
                } else {
                    Statics.field1307 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bh.u(ILck;ZI)I")
    public static int method935(int arg0, class98 arg1, boolean arg2) {
        int var3 = -1;
        class228 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1242[--Statics.field1244];
            var4 = class228.method2391(var3);
        } else {
            var4 = arg2 ? Statics.field2009 : Statics.field1307;
        }
        if (arg0 == 1000) {
            Statics.field1244 -= 4;
            var4.field2769 = field1242[Statics.field1244];
            var4.field2770 = field1242[Statics.field1244 + 1];
            var4.field2765 = field1242[Statics.field1244 + 2];
            var4.field2839 = field1242[Statics.field1244 + 3];
            client.method308(var4);
            Statics.field284.method1035(var4);
            if (var3 != -1 && var4.field2762 == 0) {
                client.method91(Statics.field2858[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field1244 -= 4;
            var4.field2771 = field1242[Statics.field1244];
            var4.field2818 = field1242[Statics.field1244 + 1];
            var4.field2767 = field1242[Statics.field1244 + 2];
            var4.field2768 = field1242[Statics.field1244 + 3];
            client.method308(var4);
            Statics.field284.method1035(var4);
            if (var3 != -1 && var4.field2762 == 0) {
                client.method91(Statics.field2858[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1242[--Statics.field1244] == 1;
            if (var4.field2832 != var5) {
                var4.field2832 = var5;
                client.method308(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2774 = field1242[--Statics.field1244] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2889 = field1242[--Statics.field1244] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ay.z(ILck;ZB)I")
    public static int method490(int arg0, class98 arg1, boolean arg2) {
        int var3 = -1;
        class228 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1242[--Statics.field1244];
            var4 = class228.method2391(var3);
        } else {
            var4 = arg2 ? Statics.field2009 : Statics.field1307;
        }
        if (arg0 == 1100) {
            Statics.field1244 -= 2;
            var4.field2883 = field1242[Statics.field1244];
            if (var4.field2883 > var4.field2817 - var4.field2884) {
                var4.field2883 = var4.field2817 - var4.field2884;
            }
            if (var4.field2883 < 0) {
                var4.field2883 = 0;
            }
            var4.field2782 = field1242[Statics.field1244 + 1];
            if (var4.field2782 > var4.field2784 - var4.field2776) {
                var4.field2782 = var4.field2784 - var4.field2776;
            }
            if (var4.field2782 < 0) {
                var4.field2782 = 0;
            }
            client.method308(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2785 = field1242[--Statics.field1244];
            client.method308(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2789 = field1242[--Statics.field1244] == 1;
            client.method308(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2794 = field1242[--Statics.field1244];
            client.method308(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2793 = field1242[--Statics.field1244];
            client.method308(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2795 = field1242[--Statics.field1244];
            client.method308(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2797 = field1242[--Statics.field1244];
            client.method308(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2780 = field1242[--Statics.field1244] == 1;
            client.method308(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2803 = 1;
            var4.field2804 = field1242[--Statics.field1244];
            client.method308(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field1244 -= 6;
            var4.field2809 = field1242[Statics.field1244];
            var4.field2810 = field1242[Statics.field1244 + 1];
            var4.field2811 = field1242[Statics.field1244 + 2];
            var4.field2812 = field1242[Statics.field1244 + 3];
            var4.field2813 = field1242[Statics.field1244 + 4];
            var4.field2814 = field1242[Statics.field1244 + 5];
            client.method308(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1242[--Statics.field1244];
            if (var4.field2807 != var5) {
                var4.field2807 = var5;
                var4.field2882 = 0;
                var4.field2893 = 0;
                client.method308(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2796 = field1242[--Statics.field1244] == 1;
            client.method308(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1245[--Statics.field466];
            if (!var6.equals(var4.field2820)) {
                var4.field2820 = var6;
                client.method308(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2819 = field1242[--Statics.field1244];
            client.method308(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field1244 -= 3;
            var4.field2815 = field1242[Statics.field1244];
            var4.field2824 = field1242[Statics.field1244 + 1];
            var4.field2822 = field1242[Statics.field1244 + 2];
            client.method308(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2825 = field1242[--Statics.field1244] == 1;
            client.method308(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2799 = field1242[--Statics.field1244];
            client.method308(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2750 = field1242[--Statics.field1244];
            client.method308(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2801 = field1242[--Statics.field1244] == 1;
            client.method308(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2775 = field1242[--Statics.field1244] == 1;
            client.method308(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field1244 -= 2;
            var4.field2817 = field1242[Statics.field1244];
            var4.field2784 = field1242[Statics.field1244 + 1];
            client.method308(var4);
            if (var3 != -1 && var4.field2762 == 0) {
                client.method91(Statics.field2858[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            int var7 = var4.field2868;
            int var8 = var4.field2761;
            class175 var9 = class175.method3893(class172.field2325, client.field889.field1450);
            var9.field2434.method3005(var7);
            var9.field2434.method2997(var8);
            client.field889.method1706(var9);
            client.field959 = var4;
            client.method308(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2753 = field1242[--Statics.field1244];
            client.method308(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2786 = field1242[--Statics.field1244];
            client.method308(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2875 = field1242[--Statics.field1244];
            client.method308(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var10 = field1242[--Statics.field1244];
            class297 var11 = (class297) class180.method1581(class297.method3(), var10);
            if (var11 != null) {
                var4.field2790 = var11;
                client.method308(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var12 = field1242[--Statics.field1244] == 1;
            var4.field2845 = var12;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cj.t(ILck;ZI)I")
    public static int method1488(int arg0, class98 arg1, boolean arg2) {
        class228 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class228.method2391(field1242[--Statics.field1244]);
        } else {
            var3 = arg2 ? Statics.field2009 : Statics.field1307;
        }
        client.method308(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field1244 -= 2;
            int var4 = field1242[Statics.field1244];
            int var5 = field1242[Statics.field1244 + 1];
            var3.field2880 = var4;
            var3.field2881 = var5;
            class268 var6 = class268.method4160(var4);
            var3.field2811 = var6.field3573;
            var3.field2812 = var6.field3593;
            var3.field2813 = var6.field3577;
            var3.field2809 = var6.field3578;
            var3.field2810 = var6.field3612;
            var3.field2814 = var6.field3574;
            if (arg0 == 1205) {
                var3.field2867 = 0;
            } else if (arg0 == 1212 | var6.field3591 == 1) {
                var3.field2867 = 1;
            } else {
                var3.field2867 = 2;
            }
            if (var3.field2837 > 0) {
                var3.field2814 = var3.field2814 * 32 / var3.field2837;
            } else if (var3.field2771 > 0) {
                var3.field2814 = var3.field2814 * 32 / var3.field2771;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2803 = 2;
            var3.field2804 = field1242[--Statics.field1244];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2803 = 3;
            var3.field2804 = Statics.field2088.field827.method3761();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("e.f(ILck;ZI)I")
    public static int method6(int arg0, class98 arg1, boolean arg2) {
        class228 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class228.method2391(field1242[--Statics.field1244]);
        } else {
            var3 = arg2 ? Statics.field2009 : Statics.field1307;
        }
        if (arg0 == 1300) {
            int var4 = field1242[--Statics.field1244] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method3802(var4, field1245[--Statics.field466]);
                return 1;
            } else {
                Statics.field466--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field1244 -= 2;
            int var5 = field1242[Statics.field1244];
            int var6 = field1242[Statics.field1244 + 1];
            var3.field2783 = class228.method2202(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2890 = field1242[--Statics.field1244] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2836 = field1242[--Statics.field1244];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2885 = field1242[--Statics.field1244];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2854 = field1245[--Statics.field466];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2852 = field1245[--Statics.field466];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2834 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bw.g(ILck;ZI)I")
    public static int method885(int arg0, class98 arg1, boolean arg2) {
        class228 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class228.method2391(field1242[--Statics.field1244]);
        } else {
            var3 = arg2 ? Statics.field2009 : Statics.field1307;
        }
        String var4 = field1245[--Statics.field466];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1242[--Statics.field1244];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1242[--Statics.field1244];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1245[--Statics.field466];
            } else {
                var7[var8] = Integer.valueOf(field1242[--Statics.field1244]);
            }
        }
        int var9 = field1242[--Statics.field1244];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2848 = var7;
        } else if (arg0 == 1401) {
            var3.field2874 = var7;
        } else if (arg0 == 1402) {
            var3.field2844 = var7;
        } else if (arg0 == 1403) {
            var3.field2846 = var7;
        } else if (arg0 == 1404) {
            var3.field2766 = var7;
        } else if (arg0 == 1405) {
            var3.field2849 = var7;
        } else if (arg0 == 1406) {
            var3.field2798 = var7;
        } else if (arg0 == 1407) {
            var3.field2853 = var7;
            var3.field2840 = var5;
        } else if (arg0 == 1408) {
            var3.field2859 = var7;
        } else if (arg0 == 1409) {
            var3.field2860 = var7;
        } else if (arg0 == 1410) {
            var3.field2850 = var7;
        } else if (arg0 == 1411) {
            var3.field2843 = var7;
        } else if (arg0 == 1412) {
            var3.field2847 = var7;
        } else if (arg0 == 1414) {
            var3.field2855 = var7;
            var3.field2856 = var5;
        } else if (arg0 == 1415) {
            var3.field2751 = var7;
            var3.field2792 = var5;
        } else if (arg0 == 1416) {
            var3.field2851 = var7;
        } else if (arg0 == 1417) {
            var3.field2861 = var7;
        } else if (arg0 == 1418) {
            var3.field2862 = var7;
        } else if (arg0 == 1419) {
            var3.field2752 = var7;
        } else if (arg0 == 1420) {
            var3.field2892 = var7;
        } else if (arg0 == 1421) {
            var3.field2865 = var7;
        } else if (arg0 == 1422) {
            var3.field2866 = var7;
        } else if (arg0 == 1423) {
            var3.field2800 = var7;
        } else if (arg0 == 1424) {
            var3.field2857 = var7;
        } else if (arg0 == 1425) {
            var3.field2870 = var7;
        } else if (arg0 == 1426) {
            var3.field2802 = var7;
        } else if (arg0 == 1427) {
            var3.field2869 = var7;
        } else {
            return 2;
        }
        var3.field2888 = true;
        return 1;
    }

    @ObfuscatedName("ek.x(ILck;ZI)I")
    public static int method2390(int arg0, class98 arg1, boolean arg2) {
        class228 var3 = arg2 ? Statics.field2009 : Statics.field1307;
        if (arg0 == 1500) {
            field1242[++Statics.field1244 - 1] = var3.field2773;
            return 1;
        } else if (arg0 == 1501) {
            field1242[++Statics.field1244 - 1] = var3.field2835;
            return 1;
        } else if (arg0 == 1502) {
            field1242[++Statics.field1244 - 1] = var3.field2884;
            return 1;
        } else if (arg0 == 1503) {
            field1242[++Statics.field1244 - 1] = var3.field2776;
            return 1;
        } else if (arg0 == 1504) {
            field1242[++Statics.field1244 - 1] = var3.field2832 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field1242[++Statics.field1244 - 1] = var3.field2779;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("il.c(ILck;ZB)I")
    public static int method3886(int arg0, class98 arg1, boolean arg2) {
        class228 var3 = arg2 ? Statics.field2009 : Statics.field1307;
        if (arg0 == 1700) {
            field1242[++Statics.field1244 - 1] = var3.field2880;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field2880 == -1) {
                field1242[++Statics.field1244 - 1] = 0;
            } else {
                field1242[++Statics.field1244 - 1] = var3.field2881;
            }
            return 1;
        } else if (arg0 == 1702) {
            field1242[++Statics.field1244 - 1] = var3.field2761;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dn.n(ILck;ZB)I")
    public static int method1879(int arg0, class98 arg1, boolean arg2) {
        class228 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class228.method2391(field1242[--Statics.field1244]);
        } else {
            var3 = arg2 ? Statics.field2009 : Statics.field1307;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1251 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2869 == null) {
            return 0;
        } else {
            class69 var4 = new class69();
            var4.field771 = var3;
            var4.field775 = var3.field2869;
            var4.field779 = field1251 + 1;
            client.field1028.method3446(var4);
            return 1;
        }
    }

    @ObfuscatedName("client.y(ILck;ZI)I")
    public static int method1167(int arg0, class98 arg1, boolean arg2) {
        class228 var3 = class228.method2391(field1242[--Statics.field1244]);
        if (arg0 == 2600) {
            field1242[++Statics.field1244 - 1] = var3.field2883;
            return 1;
        } else if (arg0 == 2601) {
            field1242[++Statics.field1244 - 1] = var3.field2782;
            return 1;
        } else if (arg0 == 2602) {
            field1245[++Statics.field466 - 1] = var3.field2820;
            return 1;
        } else if (arg0 == 2603) {
            field1242[++Statics.field1244 - 1] = var3.field2817;
            return 1;
        } else if (arg0 == 2604) {
            field1242[++Statics.field1244 - 1] = var3.field2784;
            return 1;
        } else if (arg0 == 2605) {
            field1242[++Statics.field1244 - 1] = var3.field2814;
            return 1;
        } else if (arg0 == 2606) {
            field1242[++Statics.field1244 - 1] = var3.field2811;
            return 1;
        } else if (arg0 == 2607) {
            field1242[++Statics.field1244 - 1] = var3.field2813;
            return 1;
        } else if (arg0 == 2608) {
            field1242[++Statics.field1244 - 1] = var3.field2812;
            return 1;
        } else if (arg0 == 2609) {
            field1242[++Statics.field1244 - 1] = var3.field2794;
            return 1;
        } else if (arg0 == 2610) {
            field1242[++Statics.field1244 - 1] = var3.field2875;
            return 1;
        } else if (arg0 == 2611) {
            field1242[++Statics.field1244 - 1] = var3.field2785;
            return 1;
        } else if (arg0 == 2612) {
            field1242[++Statics.field1244 - 1] = var3.field2786;
            return 1;
        } else if (arg0 == 2613) {
            field1242[++Statics.field1244 - 1] = var3.field2790.method10();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bx.o(ILck;ZI)I")
    public static int method852(int arg0, class98 arg1, boolean arg2) {
        class228 var3 = class228.method2391(field1242[--Statics.field1244]);
        if (arg0 == 2800) {
            int[] var4 = field1242;
            int var5 = ++Statics.field1244 - 1;
            int var6 = client.method464(var3);
            int var7 = var6 >> 11 & 0x3F;
            var4[var5] = var7;
            return 1;
        } else if (arg0 == 2801) {
            int var8 = field1242[--Statics.field1244];
            int var9 = var8 - 1;
            if (var3.field2834 == null || var9 >= var3.field2834.length || var3.field2834[var9] == null) {
                field1245[++Statics.field466 - 1] = "";
            } else {
                field1245[++Statics.field466 - 1] = var3.field2834[var9];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field2854 == null) {
                field1245[++Statics.field466 - 1] = "";
            } else {
                field1245[++Statics.field466 - 1] = var3.field2854;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fk.r(ILck;ZB)I")
    public static int method2868(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1245[--Statics.field466];
            class97.method172(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field1244 -= 2;
            client.method473(Statics.field2088, field1242[Statics.field1244], field1242[Statics.field1244 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            client.method3848();
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field1245[--Statics.field466];
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
                label236: {
                    char var11 = var4.charAt(var10);
                    if (var10 == 0) {
                        if (var11 == '-') {
                            var6 = true;
                            break label236;
                        }
                        if (var11 == '+') {
                            break label236;
                        }
                    }
                    int var39;
                    if (var11 >= '0' && var11 <= '9') {
                        var39 = var11 - '0';
                    } else if (var11 >= 'A' && var11 <= 'Z') {
                        var39 = var11 - '7';
                    } else {
                        if (var11 < 'a' || var11 > 'z') {
                            var12 = false;
                            break;
                        }
                        var39 = var11 - 'W';
                    }
                    if (var39 >= 10) {
                        var12 = false;
                        break;
                    }
                    if (var6) {
                        var39 = -var39;
                    }
                    int var13 = var8 * 10 + var39;
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
                var5 = class282.method3856(var4);
            }
            class175 var15 = class175.method3893(class172.field2318, client.field889.field1450);
            var15.field2434.method2949(var5);
            client.field889.method1706(var15);
            return 1;
        } else if (arg0 == 3105) {
            String var16 = field1245[--Statics.field466];
            class175 var17 = class175.method3893(class172.field2367, client.field889.field1450);
            var17.field2434.method2946(var16.length() + 1);
            var17.field2434.method3106(var16);
            client.field889.method1706(var17);
            return 1;
        } else if (arg0 == 3106) {
            String var18 = field1245[--Statics.field466];
            class175 var19 = class175.method3893(class172.field2364, client.field889.field1450);
            var19.field2434.method2946(var18.length() + 1);
            var19.field2434.method3106(var18);
            client.field889.method1706(var19);
            return 1;
        } else if (arg0 == 3107) {
            int var20 = field1242[--Statics.field1244];
            String var21 = field1245[--Statics.field466];
            client.method968(var20, var21);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field1244 -= 3;
            int var22 = field1242[Statics.field1244];
            int var23 = field1242[Statics.field1244 + 1];
            int var24 = field1242[Statics.field1244 + 2];
            class228 var25 = class228.method2391(var24);
            client.method305(var25, var22, var23);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field1244 -= 2;
            int var26 = field1242[Statics.field1244];
            int var27 = field1242[Statics.field1244 + 1];
            class228 var28 = arg2 ? Statics.field2009 : Statics.field1307;
            client.method305(var28, var26, var27);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field456 = field1242[--Statics.field1244] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1242[++Statics.field1244 - 1] = Statics.field15.field1211 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field15.field1211 = field1242[--Statics.field1244] == 1;
            class81.method52();
            return 1;
        } else if (arg0 == 3113) {
            String var29 = field1245[--Statics.field466];
            boolean var30 = field1242[--Statics.field1244] == 1;
            if (var30) {
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                    try {
                        Desktop.getDesktop().browse(new URI(var29));
                        return 1;
                    } catch (Exception var38) {
                    }
                }
                if (class57.field622.startsWith("win")) {
                    class57.method667(var29, 0);
                } else if (class57.field622.startsWith("mac")) {
                    class57.method456(var29, 1, "openjs");
                } else {
                    class57.method667(var29, 2);
                }
            } else {
                class57.method667(var29, 3);
            }
            return 1;
        } else if (arg0 == 3115) {
            int var32 = field1242[--Statics.field1244];
            class175 var33 = class175.method3893(class172.field2386, client.field889.field1450);
            var33.field2434.method2944(var32);
            client.field889.method1706(var33);
            return 1;
        } else if (arg0 == 3116) {
            int var34 = field1242[--Statics.field1244];
            Statics.field466 -= 2;
            String var35 = field1245[Statics.field466];
            String var36 = field1245[Statics.field466 + 1];
            if (var35.length() > 500) {
                return 1;
            } else if (var36.length() > 500) {
                return 1;
            } else {
                class175 var37 = class175.method3893(class172.field2356, client.field889.field1450);
                var37.field2434.method2944(1 + class185.method960(var35) + class185.method960(var36));
                var37.field2434.method2987(var34);
                var37.field2434.method3106(var35);
                var37.field2434.method3106(var36);
                client.field889.method1706(var37);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field977 = field1242[--Statics.field1244] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("t.i(ILck;ZB)I")
    public static int method22(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field1242[++Statics.field1244 - 1] = client.field963;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field1244 -= 2;
            int var3 = field1242[Statics.field1244];
            int var4 = field1242[Statics.field1244 + 1];
            field1242[++Statics.field1244 - 1] = class64.method167(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field1244 -= 2;
            int var5 = field1242[Statics.field1244];
            int var6 = field1242[Statics.field1244 + 1];
            field1242[++Statics.field1244 - 1] = class64.method137(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field1244 -= 2;
            int var7 = field1242[Statics.field1244];
            int var8 = field1242[Statics.field1244 + 1];
            field1242[++Statics.field1244 - 1] = class64.method457(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = class252.method1525(var9).field3370;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = client.field1024[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = client.field964[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = client.field914[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field235;
            int var14 = (Statics.field2088.field1182 >> 7) + Statics.field556;
            int var15 = (Statics.field2088.field1143 >> 7) + Statics.field895;
            field1242[++Statics.field1244 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field1242[++Statics.field1244 - 1] = client.field850 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field1244 -= 2;
            int var19 = field1242[Statics.field1244] + 32768;
            int var20 = field1242[Statics.field1244 + 1];
            field1242[++Statics.field1244 - 1] = class64.method167(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field1244 -= 2;
            int var21 = field1242[Statics.field1244] + 32768;
            int var22 = field1242[Statics.field1244 + 1];
            field1242[++Statics.field1244 - 1] = class64.method137(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field1244 -= 2;
            int var23 = field1242[Statics.field1244] + 32768;
            int var24 = field1242[Statics.field1244 + 1];
            field1242[++Statics.field1244 - 1] = class64.method457(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field996 >= 2) {
                field1242[++Statics.field1244 - 1] = client.field996;
            } else {
                field1242[++Statics.field1244 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field1242[++Statics.field1244 - 1] = client.field862;
            return 1;
        } else if (arg0 == 3318) {
            field1242[++Statics.field1244 - 1] = client.field847;
            return 1;
        } else if (arg0 == 3321) {
            field1242[++Statics.field1244 - 1] = client.field994;
            return 1;
        } else if (arg0 == 3322) {
            field1242[++Statics.field1244 - 1] = client.field995;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field872) {
                field1242[++Statics.field1244 - 1] = 1;
            } else {
                field1242[++Statics.field1244 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field1242[++Statics.field1244 - 1] = client.field891;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field1244 -= 4;
            int var25 = field1242[Statics.field1244];
            int var26 = field1242[Statics.field1244 + 1];
            int var27 = field1242[Statics.field1244 + 2];
            int var28 = field1242[Statics.field1244 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field1242[++Statics.field1244 - 1] = var31;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aw.q(ILck;ZS)I")
    public static int method471(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (client.field1095 == 0) {
                field1242[++Statics.field1244 - 1] = -2;
            } else if (client.field1095 == 1) {
                field1242[++Statics.field1244 - 1] = -1;
            } else {
                field1242[++Statics.field1244 - 1] = client.field1094;
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field1242[--Statics.field1244];
            if (client.field1095 == 2 && var3 < client.field1094) {
                field1245[++Statics.field466 - 1] = client.field990[var3].field750;
                field1245[++Statics.field466 - 1] = client.field990[var3].field744;
            } else {
                field1245[++Statics.field466 - 1] = "";
                field1245[++Statics.field466 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var4 = field1242[--Statics.field1244];
            if (client.field1095 == 2 && var4 < client.field1094) {
                field1242[++Statics.field1244 - 1] = client.field990[var4].field747;
            } else {
                field1242[++Statics.field1244 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var5 = field1242[--Statics.field1244];
            if (client.field1095 == 2 && var5 < client.field1094) {
                field1242[++Statics.field1244 - 1] = client.field990[var5].field746;
            } else {
                field1242[++Statics.field1244 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var6 = field1245[--Statics.field466];
            int var7 = field1242[--Statics.field1244];
            class175 var8 = class175.method3893(class172.field2397, client.field889.field1450);
            var8.field2434.method2946(class185.method960(var6) + 1);
            var8.field2434.method2987(var7);
            var8.field2434.method3106(var6);
            client.field889.method1706(var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field1245[--Statics.field466];
            client.method31(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field1245[--Statics.field466];
            client.method758(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field1245[--Statics.field466];
            if (var11 != null) {
                if ((client.field905 < 100 || client.field919 == 1) && client.field905 < 400) {
                    String var12 = class279.method3736(var11, Statics.field1110);
                    if (var12 != null) {
                        int var13 = 0;
                        while (true) {
                            if (var13 >= client.field905) {
                                for (int var17 = 0; var17 < client.field1094; var17++) {
                                    class66 var18 = client.field990[var17];
                                    String var19 = class279.method3736(var18.field750, Statics.field1110);
                                    if (var19 != null && var19.equals(var12)) {
                                        class97.method172(31, "", class237.field3133 + var11 + class237.field3134);
                                        return 1;
                                    }
                                    if (var18.field744 != null) {
                                        String var20 = class279.method3736(var18.field744, Statics.field1110);
                                        if (var20 != null && var20.equals(var12)) {
                                            class97.method172(31, "", class237.field3133 + var11 + class237.field3134);
                                            return 1;
                                        }
                                    }
                                }
                                if (class279.method3736(Statics.field2088.field832, Statics.field1110).equals(var12)) {
                                    class97.method172(31, "", class237.field3130);
                                } else {
                                    class175 var21 = class175.method3893(class172.field2399, client.field889.field1450);
                                    var21.field2434.method2946(class185.method960(var11));
                                    var21.field2434.method3106(var11);
                                    client.field889.method1706(var21);
                                }
                                break;
                            }
                            class70 var14 = client.field1066[var13];
                            String var15 = class279.method3736(var14.field786, Statics.field1110);
                            if (var15 != null && var15.equals(var12)) {
                                class97.method172(31, "", var11 + class237.field3128);
                                break;
                            }
                            if (var14.field782 != null) {
                                String var16 = class279.method3736(var14.field782, Statics.field1110);
                                if (var16 != null && var16.equals(var12)) {
                                    class97.method172(31, "", var11 + class237.field3128);
                                    break;
                                }
                            }
                            var13++;
                        }
                    }
                } else {
                    class97.method172(31, "", class237.field3097);
                }
            }
            return 1;
        } else if (arg0 == 3608) {
            String var22 = field1245[--Statics.field466];
            if (var22 != null) {
                String var23 = class279.method3736(var22, Statics.field1110);
                if (var23 != null) {
                    for (int var24 = 0; var24 < client.field905; var24++) {
                        class70 var25 = client.field1066[var24];
                        String var26 = var25.field786;
                        String var27 = class279.method3736(var26, Statics.field1110);
                        boolean var28;
                        if (var22 == null || var26 == null) {
                            var28 = false;
                        } else if (var22.startsWith("#") || var26.startsWith("#")) {
                            var28 = var22.equals(var26);
                        } else {
                            var28 = var23.equals(var27);
                        }
                        if (var28) {
                            client.field905--;
                            for (int var29 = var24; var29 < client.field905; var29++) {
                                client.field1066[var29] = client.field1066[var29 + 1];
                            }
                            client.field1042 = client.field1058;
                            class175 var30 = class175.method3893(class172.field2402, client.field889.field1450);
                            var30.field2434.method2946(class185.method960(var22));
                            var30.field2434.method3106(var22);
                            client.field889.method1706(var30);
                            break;
                        }
                    }
                }
            }
            return 1;
        } else if (arg0 == 3609) {
            String var31 = field1245[--Statics.field466];
            class242[] var32 = class242.method2282();
            for (int var33 = 0; var33 < var32.length; var33++) {
                class242 var34 = var32[var33];
                if (var34.field3280 != -1) {
                    int var36 = var34.field3280;
                    String var37 = "<img=" + var36 + ">";
                    if (var31.startsWith(var37)) {
                        var31 = var31.substring(6 + Integer.toString(var34.field3280).length());
                        break;
                    }
                }
            }
            field1242[++Statics.field1244 - 1] = client.method620(var31, false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (client.field1054 == null) {
                field1245[++Statics.field466 - 1] = "";
            } else {
                field1245[++Statics.field466 - 1] = class280.method4284(client.field1054);
            }
            return 1;
        } else if (arg0 == 3612) {
            if (client.field1054 == null) {
                field1242[++Statics.field1244 - 1] = 0;
            } else {
                field1242[++Statics.field1244 - 1] = Statics.field2559;
            }
            return 1;
        } else if (arg0 == 3613) {
            int var38 = field1242[--Statics.field1244];
            if (client.field1054 == null || var38 >= Statics.field2559) {
                field1245[++Statics.field466 - 1] = "";
            } else {
                field1245[++Statics.field466 - 1] = Statics.field631[var38].field839;
            }
            return 1;
        } else if (arg0 == 3614) {
            int var39 = field1242[--Statics.field1244];
            if (client.field1054 == null || var39 >= Statics.field2559) {
                field1242[++Statics.field1244 - 1] = 0;
            } else {
                field1242[++Statics.field1244 - 1] = Statics.field631[var39].field840;
            }
            return 1;
        } else if (arg0 == 3615) {
            int var40 = field1242[--Statics.field1244];
            if (client.field1054 == null || var40 >= Statics.field2559) {
                field1242[++Statics.field1244 - 1] = 0;
            } else {
                field1242[++Statics.field1244 - 1] = Statics.field631[var40].field842;
            }
            return 1;
        } else if (arg0 == 3616) {
            field1242[++Statics.field1244 - 1] = Statics.field2210;
            return 1;
        } else if (arg0 == 3617) {
            String var41 = field1245[--Statics.field466];
            if (Statics.field631 != null) {
                class175 var42 = class175.method3893(class172.field2313, client.field889.field1450);
                var42.field2434.method2946(class185.method960(var41));
                var42.field2434.method3106(var41);
                client.field889.method1706(var42);
            }
            return 1;
        } else if (arg0 == 3618) {
            field1242[++Statics.field1244 - 1] = Statics.field1898;
            return 1;
        } else if (arg0 == 3619) {
            String var43 = field1245[--Statics.field466];
            if (!var43.equals("")) {
                class175 var44 = class175.method3893(class172.field2343, client.field889.field1450);
                var44.field2434.method2946(class185.method960(var43));
                var44.field2434.method3106(var43);
                client.field889.method1706(var44);
            }
            return 1;
        } else if (arg0 == 3620) {
            client.method2473();
            return 1;
        } else if (arg0 == 3621) {
            if (client.field1095 == 0) {
                field1242[++Statics.field1244 - 1] = -1;
            } else {
                field1242[++Statics.field1244 - 1] = client.field905;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var45 = field1242[--Statics.field1244];
            if (client.field1095 == 0 || var45 >= client.field905) {
                field1245[++Statics.field466 - 1] = "";
                field1245[++Statics.field466 - 1] = "";
            } else {
                field1245[++Statics.field466 - 1] = client.field1066[var45].field786;
                field1245[++Statics.field466 - 1] = client.field1066[var45].field782;
            }
            return 1;
        } else if (arg0 == 3623) {
            String var46;
            label332: {
                var46 = field1245[--Statics.field466];
                String var48 = "<img=0>";
                if (!var46.startsWith(var48)) {
                    String var50 = "<img=1>";
                    if (!var46.startsWith(var50)) {
                        break label332;
                    }
                }
                var46 = var46.substring(7);
            }
            field1242[++Statics.field1244 - 1] = client.method203(var46) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var51 = field1242[--Statics.field1244];
            if (Statics.field631 == null || var51 >= Statics.field2559 || !Statics.field631[var51].field839.equalsIgnoreCase(Statics.field2088.field832)) {
                field1242[++Statics.field1244 - 1] = 0;
            } else {
                field1242[++Statics.field1244 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (client.field953 == null) {
                field1245[++Statics.field466 - 1] = "";
            } else {
                field1245[++Statics.field466 - 1] = class280.method4284(client.field953);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fk.b(ILck;ZB)I")
    public static int method2867(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = client.field912[var3].method89();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = client.field912[var4].field293;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = client.field912[var5].field290;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = client.field912[var6].field291;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = client.field912[var7].field295;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = client.field912[var8].field288;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1242[--Statics.field1244];
            int var10 = client.field912[var9].method86();
            field1242[++Statics.field1244 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1242[--Statics.field1244];
            int var12 = client.field912[var11].method86();
            field1242[++Statics.field1244 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1242[--Statics.field1244];
            int var14 = client.field912[var13].method86();
            field1242[++Statics.field1244 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1242[--Statics.field1244];
            int var16 = client.field912[var15].method86();
            field1242[++Statics.field1244 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1242[--Statics.field1244] == 1;
            if (Statics.field627 != null) {
                Statics.field627.method57(class14.field271, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1242[--Statics.field1244] == 1;
            if (Statics.field627 != null) {
                Statics.field627.method57(class14.field272, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field1244 -= 2;
            boolean var19 = field1242[Statics.field1244] == 1;
            boolean var20 = field1242[Statics.field1244 + 1] == 1;
            if (Statics.field627 != null) {
                client.field1104.field838 = var20;
                Statics.field627.method57(client.field1104, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1242[--Statics.field1244] == 1;
            if (Statics.field627 != null) {
                Statics.field627.method57(class14.field269, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1242[--Statics.field1244] == 1;
            if (Statics.field627 != null) {
                Statics.field627.method57(class14.field268, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1242[++Statics.field1244 - 1] = Statics.field627 == null ? 0 : Statics.field627.field270.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1242[--Statics.field1244];
            class15 var24 = (class15) Statics.field627.field270.get(var23);
            field1242[++Statics.field1244 - 1] = var24.field282;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1242[--Statics.field1244];
            class15 var26 = (class15) Statics.field627.field270.get(var25);
            field1245[++Statics.field466 - 1] = var26.method61();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1242[--Statics.field1244];
            class15 var28 = (class15) Statics.field627.field270.get(var27);
            field1245[++Statics.field466 - 1] = var28.method67();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1242[--Statics.field1244];
            class15 var30 = (class15) Statics.field627.field270.get(var29);
            long var31 = class187.method1411() - Statics.field393 - var30.field279;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1245[++Statics.field466 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1242[--Statics.field1244];
            class15 var38 = (class15) Statics.field627.field270.get(var37);
            field1242[++Statics.field1244 - 1] = var38.field277.field291;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1242[--Statics.field1244];
            class15 var40 = (class15) Statics.field627.field270.get(var39);
            field1242[++Statics.field1244 - 1] = var40.field277.field290;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1242[--Statics.field1244];
            class15 var42 = (class15) Statics.field627.field270.get(var41);
            field1242[++Statics.field1244 - 1] = var42.field277.field293;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eb.h(ILck;ZI)I")
    public static int method2662(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1242[--Statics.field1244];
            field1245[++Statics.field466 - 1] = class268.method4160(var3).field3569;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field1244 -= 2;
            int var4 = field1242[Statics.field1244];
            int var5 = field1242[Statics.field1244 + 1];
            class268 var6 = class268.method4160(var4);
            if (var5 < 1 || var5 > 5 || var6.field3583[var5 - 1] == null) {
                field1245[++Statics.field466 - 1] = "";
            } else {
                field1245[++Statics.field466 - 1] = var6.field3583[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field1244 -= 2;
            int var7 = field1242[Statics.field1244];
            int var8 = field1242[Statics.field1244 + 1];
            class268 var9 = class268.method4160(var7);
            if (var8 < 1 || var8 > 5 || var9.field3604[var8 - 1] == null) {
                field1245[++Statics.field466 - 1] = "";
            } else {
                field1245[++Statics.field466 - 1] = var9.field3604[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = class268.method4160(var10).field3581;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = class268.method4160(var11).field3591 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1242[--Statics.field1244];
            class268 var13 = class268.method4160(var12);
            if (var13.field3592 == -1 && var13.field3600 >= 0) {
                field1242[++Statics.field1244 - 1] = var13.field3600;
            } else {
                field1242[++Statics.field1244 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1242[--Statics.field1244];
            class268 var15 = class268.method4160(var14);
            if (var15.field3592 >= 0 && var15.field3600 >= 0) {
                field1242[++Statics.field1244 - 1] = var15.field3600;
            } else {
                field1242[++Statics.field1244 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1242[--Statics.field1244];
            field1242[++Statics.field1244 - 1] = class268.method4160(var16).field3582 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1242[--Statics.field1244];
            class268 var18 = class268.method4160(var17);
            if (var18.field3613 == -1 && var18.field3576 >= 0) {
                field1242[++Statics.field1244 - 1] = var18.field3576;
            } else {
                field1242[++Statics.field1244 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1242[--Statics.field1244];
            class268 var20 = class268.method4160(var19);
            if (var20.field3613 >= 0 && var20.field3576 >= 0) {
                field1242[++Statics.field1244 - 1] = var20.field3576;
            } else {
                field1242[++Statics.field1244 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1245[--Statics.field466];
            int var22 = field1242[--Statics.field1244];
            Statics.method2670(var21, var22 == 1);
            field1242[++Statics.field1244 - 1] = Statics.field524;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1183 == null || Statics.field767 >= Statics.field524) {
                field1242[++Statics.field1244 - 1] = -1;
            } else {
                field1242[++Statics.field1244 - 1] = Statics.field1183[++Statics.field767 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field767 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dv.d(ILck;ZI)I")
    public static int method2141(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 5306) {
            int[] var3 = field1242;
            int var4 = ++Statics.field1244 - 1;
            int var5 = client.field1043 ? 2 : 1;
            var3[var4] = var5;
            return 1;
        } else if (arg0 == 5307) {
            int var6 = field1242[--Statics.field1244];
            if (var6 == 1 || var6 == 2) {
                client.method458(var6);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1242[++Statics.field1244 - 1] = Statics.field15.field1214;
            return 1;
        } else if (arg0 == 5309) {
            int var7 = field1242[--Statics.field1244];
            if (var7 == 1 || var7 == 2) {
                Statics.field15.field1214 = var7;
                class81.method52();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jc.v(ILck;ZI)I")
    public static int method4181(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field1244 -= 2;
            int var3 = field1242[Statics.field1244];
            int var4 = field1242[Statics.field1244 + 1];
            if (!client.field931) {
                client.field999 = var3;
                client.field913 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1242[++Statics.field1244 - 1] = client.field999;
            return 1;
        } else if (arg0 == 5506) {
            field1242[++Statics.field1244 - 1] = client.field913;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1242[--Statics.field1244];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field1015 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1242[++Statics.field1244 - 1] = client.field1015;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.p(ILck;ZS)I")
    public static int method492(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field882 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cb.ab(ILck;ZI)I")
    public static int method1424(int arg0, class98 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1242[++Statics.field1244 - 1] = class80.method964() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class80.field1197 = 0;
            class80 var3;
            if (class80.field1197 < class80.field1192) {
                var3 = Statics.field727[++class80.field1197 - 1];
            } else {
                var3 = null;
            }
            if (var3 == null) {
                field1242[++Statics.field1244 - 1] = -1;
                field1242[++Statics.field1244 - 1] = 0;
                field1245[++Statics.field466 - 1] = "";
                field1242[++Statics.field1244 - 1] = 0;
                field1242[++Statics.field1244 - 1] = 0;
                field1245[++Statics.field466 - 1] = "";
            } else {
                field1242[++Statics.field1244 - 1] = var3.field1206;
                field1242[++Statics.field1244 - 1] = var3.field1201;
                field1245[++Statics.field466 - 1] = var3.field1199;
                field1242[++Statics.field1244 - 1] = var3.field1205;
                field1242[++Statics.field1244 - 1] = var3.field1202;
                field1245[++Statics.field466 - 1] = var3.field1203;
            }
            return 1;
        } else if (arg0 == 6502) {
            class80 var6;
            if (class80.field1197 < class80.field1192) {
                var6 = Statics.field727[++class80.field1197 - 1];
            } else {
                var6 = null;
            }
            if (var6 == null) {
                field1242[++Statics.field1244 - 1] = -1;
                field1242[++Statics.field1244 - 1] = 0;
                field1245[++Statics.field466 - 1] = "";
                field1242[++Statics.field1244 - 1] = 0;
                field1242[++Statics.field1244 - 1] = 0;
                field1245[++Statics.field466 - 1] = "";
            } else {
                field1242[++Statics.field1244 - 1] = var6.field1206;
                field1242[++Statics.field1244 - 1] = var6.field1201;
                field1245[++Statics.field466 - 1] = var6.field1199;
                field1242[++Statics.field1244 - 1] = var6.field1205;
                field1242[++Statics.field1244 - 1] = var6.field1202;
                field1245[++Statics.field466 - 1] = var6.field1203;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var8 = field1242[--Statics.field1244];
            class80 var9 = null;
            for (int var10 = 0; var10 < class80.field1192; var10++) {
                if (Statics.field727[var10].field1206 == var8) {
                    var9 = Statics.field727[var10];
                    break;
                }
            }
            if (var9 == null) {
                field1242[++Statics.field1244 - 1] = -1;
                field1242[++Statics.field1244 - 1] = 0;
                field1245[++Statics.field466 - 1] = "";
                field1242[++Statics.field1244 - 1] = 0;
                field1242[++Statics.field1244 - 1] = 0;
                field1245[++Statics.field466 - 1] = "";
            } else {
                field1242[++Statics.field1244 - 1] = var9.field1206;
                field1242[++Statics.field1244 - 1] = var9.field1201;
                field1245[++Statics.field466 - 1] = var9.field1199;
                field1242[++Statics.field1244 - 1] = var9.field1205;
                field1242[++Statics.field1244 - 1] = var9.field1202;
                field1245[++Statics.field466 - 1] = var9.field1203;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field1244 -= 4;
            int var11 = field1242[Statics.field1244];
            boolean var12 = field1242[Statics.field1244 + 1] == 1;
            int var13 = field1242[Statics.field1244 + 2];
            boolean var14 = field1242[Statics.field1244 + 3] == 1;
            if (Statics.field727 != null) {
                Statics.method3717(0, Statics.field727.length - 1, var11, var12, var13, var14);
            }
            return 1;
        } else if (arg0 == 6511) {
            int var15 = field1242[--Statics.field1244];
            if (var15 >= 0 && var15 < class80.field1192) {
                class80 var16 = Statics.field727[var15];
                field1242[++Statics.field1244 - 1] = var16.field1206;
                field1242[++Statics.field1244 - 1] = var16.field1201;
                field1245[++Statics.field466 - 1] = var16.field1199;
                field1242[++Statics.field1244 - 1] = var16.field1205;
                field1242[++Statics.field1244 - 1] = var16.field1202;
                field1245[++Statics.field466 - 1] = var16.field1203;
            } else {
                field1242[++Statics.field1244 - 1] = -1;
                field1242[++Statics.field1244 - 1] = 0;
                field1245[++Statics.field466 - 1] = "";
                field1242[++Statics.field1244 - 1] = 0;
                field1242[++Statics.field1244 - 1] = 0;
                field1245[++Statics.field466 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field976 = field1242[--Statics.field1244] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field1244 -= 2;
            int var17 = field1242[Statics.field1244];
            int var18 = field1242[Statics.field1244 + 1];
            class263 var19 = class263.method4053(var18);
            if (var19.method4206()) {
                field1245[++Statics.field466 - 1] = class270.method1336(var17).method4402(var18, var19.field3469);
            } else {
                field1242[++Statics.field1244 - 1] = class270.method1336(var17).method4401(var18, var19.field3470);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field1244 -= 2;
            int var20 = field1242[Statics.field1244];
            int var21 = field1242[Statics.field1244 + 1];
            class263 var22 = class263.method4053(var21);
            if (var22.method4206()) {
                field1245[++Statics.field466 - 1] = class267.method2129(var20).method4312(var21, var22.field3469);
            } else {
                field1242[++Statics.field1244 - 1] = class267.method2129(var20).method4295(var21, var22.field3470);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field1244 -= 2;
            int var23 = field1242[Statics.field1244];
            int var24 = field1242[Statics.field1244 + 1];
            class263 var25 = class263.method4053(var24);
            if (var25.method4206()) {
                field1245[++Statics.field466 - 1] = class268.method4160(var23).method4349(var24, var25.field3469);
            } else {
                field1242[++Statics.field1244 - 1] = class268.method4160(var23).method4348(var24, var25.field3470);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field1244 -= 2;
            int var26 = field1242[Statics.field1244];
            int var27 = field1242[Statics.field1244 + 1];
            class263 var28 = class263.method4053(var27);
            if (var28.method4206()) {
                String[] var29 = field1245;
                int var30 = ++Statics.field466 - 1;
                class264 var31 = (class264) class264.field3473.method3373((long) var26);
                class264 var32;
                if (var31 == null) {
                    byte[] var33 = Statics.field3472.method3897(34, var26);
                    class264 var34 = new class264();
                    if (var33 != null) {
                        var34.method4226(new class185(var33));
                    }
                    var34.method4218();
                    class264.field3473.method3375(var34, (long) var26);
                    var32 = var34;
                } else {
                    var32 = var31;
                }
                var29[var30] = var32.method4217(var27, var28.field3469);
            } else {
                int[] var35 = field1242;
                int var36 = ++Statics.field1244 - 1;
                class264 var37 = (class264) class264.field3473.method3373((long) var26);
                class264 var38;
                if (var37 == null) {
                    byte[] var39 = Statics.field3472.method3897(34, var26);
                    class264 var40 = new class264();
                    if (var39 != null) {
                        var40.method4226(new class185(var39));
                    }
                    var40.method4218();
                    class264.field3473.method3375(var40, (long) var26);
                    var38 = var40;
                } else {
                    var38 = var37;
                }
                var35[var36] = var38.method4221(var27, var28.field3470);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1242[++Statics.field1244 - 1] = 0;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bh.ag(ILhc;ZB)V")
    public static void method937(int arg0, class224 arg1, boolean arg2) {
        class33 var3 = client.method1515().method4972(arg0);
        int var4 = Statics.field2088.field822;
        int var5 = (Statics.field2088.field1182 >> 7) + Statics.field556;
        int var6 = (Statics.field2088.field1143 >> 7) + Statics.field895;
        class224 var7 = new class224(var4, var5, var6);
        client.method1515().method4962(var3, var7, arg1, arg2);
    }
}
