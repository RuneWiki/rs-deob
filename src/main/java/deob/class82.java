package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("cl")
public class class82 {

    @ObfuscatedName("cl.h")
    public static int[] field1283 = new int[5];

    @ObfuscatedName("cl.m")
    public static int[][] field1281 = new int[5][5000];

    @ObfuscatedName("cl.z")
    public static int[] field1282 = new int[1000];

    @ObfuscatedName("cl.u")
    public static String[] field1287 = new String[1000];

    @ObfuscatedName("cl.y")
    public static int field1284 = 0;

    @ObfuscatedName("cl.a")
    public static class64[] field1278 = new class64[50];

    @ObfuscatedName("cl.l")
    public static Calendar field1285 = Calendar.getInstance();

    @ObfuscatedName("cl.s")
    public static final String[] field1292 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cl.q")
    public static int field1289 = 0;

    public class82() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.o(Lbi;I)V")
    public static void method2061(class69 arg0) {
        method4437(arg0, 500000);
    }

    @ObfuscatedName("je.k(Lbi;II)V")
    public static void method4437(class69 arg0, int arg1) {
        Object[] var2 = arg0.field808;
        class97 var4;
        if (class246.method4536(arg0.field801)) {
            Statics.field340 = (class49) var2[0];
            class270 var3 = Statics.field3455[Statics.field340.field596];
            var4 = class97.method3119(arg0.field801, var3.field3464, var3.field3474);
        } else {
            int var5 = (Integer) var2[0];
            var4 = class97.method275(var5);
        }
        if (var4 == null) {
            return;
        }
        Statics.field278 = 0;
        Statics.field638 = 0;
        int var6 = -1;
        int[] var7 = var4.field1457;
        int[] var8 = var4.field1458;
        byte var9 = -1;
        field1284 = 0;
        try {
            Statics.field1280 = new int[var4.field1461];
            int var10 = 0;
            Statics.field1279 = new String[var4.field1462];
            int var11 = 0;
            for (int var12 = 1; var12 < var2.length; var12++) {
                if (var2[var12] instanceof Integer) {
                    int var13 = (Integer) var2[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field800;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field799;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field798 == null ? -1 : arg0.field798.field2826;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field802;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field798 == null ? -1 : arg0.field798.field2824;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field803 == null ? -1 : arg0.field803.field2826;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field803 == null ? -1 : arg0.field803.field2824;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field804;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field805;
                    }
                    Statics.field1280[var10++] = var13;
                } else if (var2[var12] instanceof String) {
                    String var14 = (String) var2[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field797;
                    }
                    Statics.field1279[var11++] = var14;
                }
            }
            int var15 = 0;
            field1289 = arg0.field807;
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
                                                                                                                        if (var4.field1458[var6] == 1) {
                                                                                                                            var53 = true;
                                                                                                                        } else {
                                                                                                                            var53 = false;
                                                                                                                        }
                                                                                                                        int var54 = method501(var59, var4, var53);
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
                                                                                                                        field1282[++Statics.field278 - 1] = var8[var6];
                                                                                                                    } else if (var59 == 1) {
                                                                                                                        int var16 = var8[var6];
                                                                                                                        field1282[++Statics.field278 - 1] = class238.field2779[var16];
                                                                                                                    } else if (var59 == 2) {
                                                                                                                        int var17 = var8[var6];
                                                                                                                        class238.field2779[var17] = field1282[--Statics.field278];
                                                                                                                        client.method131(var17);
                                                                                                                    } else if (var59 == 3) {
                                                                                                                        field1287[++Statics.field638 - 1] = var4.field1459[var6];
                                                                                                                    } else if (var59 == 6) {
                                                                                                                        var6 += var8[var6];
                                                                                                                    } else if (var59 == 7) {
                                                                                                                        Statics.field278 -= 2;
                                                                                                                        if (field1282[Statics.field278] != field1282[Statics.field278 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 8) {
                                                                                                                        Statics.field278 -= 2;
                                                                                                                        if (field1282[Statics.field278] == field1282[Statics.field278 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 9) {
                                                                                                                        Statics.field278 -= 2;
                                                                                                                        if (field1282[Statics.field278] < field1282[Statics.field278 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 10) {
                                                                                                                        Statics.field278 -= 2;
                                                                                                                        if (field1282[Statics.field278] > field1282[Statics.field278 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 21) {
                                                                                                                        if (field1284 == 0) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        class64 var18 = field1278[--field1284];
                                                                                                                        var4 = var18.field757;
                                                                                                                        var7 = var4.field1457;
                                                                                                                        var8 = var4.field1458;
                                                                                                                        var6 = var18.field759;
                                                                                                                        Statics.field1280 = var18.field761;
                                                                                                                        Statics.field1279 = var18.field758;
                                                                                                                    } else if (var59 == 25) {
                                                                                                                        int var19 = var8[var6];
                                                                                                                        field1282[++Statics.field278 - 1] = class238.method1854(var19);
                                                                                                                    } else if (var59 == 27) {
                                                                                                                        int var20 = var8[var6];
                                                                                                                        class238.method5187(var20, field1282[--Statics.field278]);
                                                                                                                    } else if (var59 == 31) {
                                                                                                                        Statics.field278 -= 2;
                                                                                                                        if (field1282[Statics.field278] <= field1282[Statics.field278 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 32) {
                                                                                                                        Statics.field278 -= 2;
                                                                                                                        if (field1282[Statics.field278] >= field1282[Statics.field278 + 1]) {
                                                                                                                            var6 += var8[var6];
                                                                                                                        }
                                                                                                                    } else if (var59 == 33) {
                                                                                                                        field1282[++Statics.field278 - 1] = Statics.field1280[var8[var6]];
                                                                                                                    } else if (var59 == 34) {
                                                                                                                        Statics.field1280[var8[var6]] = field1282[--Statics.field278];
                                                                                                                    } else if (var59 == 35) {
                                                                                                                        field1287[++Statics.field638 - 1] = Statics.field1279[var8[var6]];
                                                                                                                    } else if (var59 == 36) {
                                                                                                                        Statics.field1279[var8[var6]] = field1287[--Statics.field638];
                                                                                                                    } else if (var59 == 37) {
                                                                                                                        int var21 = var8[var6];
                                                                                                                        Statics.field638 -= var21;
                                                                                                                        String[] var22 = field1287;
                                                                                                                        int var23 = Statics.field638;
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
                                                                                                                        field1287[++Statics.field638 - 1] = var24;
                                                                                                                    } else if (var59 == 38) {
                                                                                                                        Statics.field278--;
                                                                                                                    } else if (var59 == 39) {
                                                                                                                        Statics.field638--;
                                                                                                                    } else if (var59 == 40) {
                                                                                                                        int var34 = var8[var6];
                                                                                                                        class97 var35 = class97.method275(var34);
                                                                                                                        int[] var36 = new int[var35.field1461];
                                                                                                                        String[] var37 = new String[var35.field1462];
                                                                                                                        for (int var38 = 0; var38 < var35.field1465; var38++) {
                                                                                                                            var36[var38] = field1282[Statics.field278 - var35.field1465 + var38];
                                                                                                                        }
                                                                                                                        for (int var39 = 0; var39 < var35.field1463; var39++) {
                                                                                                                            var37[var39] = field1287[Statics.field638 - var35.field1463 + var39];
                                                                                                                        }
                                                                                                                        Statics.field278 -= var35.field1465;
                                                                                                                        Statics.field638 -= var35.field1463;
                                                                                                                        class64 var40 = new class64();
                                                                                                                        var40.field757 = var4;
                                                                                                                        var40.field759 = var6;
                                                                                                                        var40.field761 = Statics.field1280;
                                                                                                                        var40.field758 = Statics.field1279;
                                                                                                                        field1278[++field1284 - 1] = var40;
                                                                                                                        var4 = var35;
                                                                                                                        var7 = var35.field1457;
                                                                                                                        var8 = var35.field1458;
                                                                                                                        var6 = -1;
                                                                                                                        Statics.field1280 = var36;
                                                                                                                        Statics.field1279 = var37;
                                                                                                                    } else if (var59 == 42) {
                                                                                                                        field1282[++Statics.field278 - 1] = Statics.field1973.method1796(var8[var6]);
                                                                                                                    } else if (var59 == 43) {
                                                                                                                        Statics.field1973.method1798(var8[var6], field1282[--Statics.field278]);
                                                                                                                    } else if (var59 == 44) {
                                                                                                                        int var41 = var8[var6] >> 16;
                                                                                                                        int var42 = var8[var6] & 0xFFFF;
                                                                                                                        int var43 = field1282[--Statics.field278];
                                                                                                                        if (var43 >= 0 && var43 <= 5000) {
                                                                                                                            field1283[var41] = var43;
                                                                                                                            byte var44 = -1;
                                                                                                                            if (var42 == 105) {
                                                                                                                                var44 = 0;
                                                                                                                            }
                                                                                                                            int var45 = 0;
                                                                                                                            while (true) {
                                                                                                                                if (var45 >= var43) {
                                                                                                                                    continue label249;
                                                                                                                                }
                                                                                                                                field1281[var41][var45] = var44;
                                                                                                                                var45++;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        throw new RuntimeException();
                                                                                                                    } else if (var59 == 45) {
                                                                                                                        int var46 = var8[var6];
                                                                                                                        int var47 = field1282[--Statics.field278];
                                                                                                                        if (var47 < 0 || var47 >= field1283[var46]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1282[++Statics.field278 - 1] = field1281[var46][var47];
                                                                                                                    } else if (var59 == 46) {
                                                                                                                        int var48 = var8[var6];
                                                                                                                        Statics.field278 -= 2;
                                                                                                                        int var49 = field1282[Statics.field278];
                                                                                                                        if (var49 < 0 || var49 >= field1283[var48]) {
                                                                                                                            throw new RuntimeException();
                                                                                                                        }
                                                                                                                        field1281[var48][var49] = field1282[Statics.field278 + 1];
                                                                                                                    } else if (var59 == 47) {
                                                                                                                        String var50 = Statics.field1973.method1799(var8[var6]);
                                                                                                                        if (var50 == null) {
                                                                                                                            var50 = class252.field3032;
                                                                                                                        }
                                                                                                                        field1287[++Statics.field638 - 1] = var50;
                                                                                                                    } else if (var59 == 48) {
                                                                                                                        Statics.field1973.method1822(var8[var6], field1287[--Statics.field638]);
                                                                                                                    } else if (var59 == 60) {
                                                                                                                        class210 var51 = var4.field1464[var8[var6]];
                                                                                                                        class224 var52 = (class224) var51.method3575((long) field1282[--Statics.field278]);
                                                                                                                        if (var52 != null) {
                                                                                                                            var6 += var52.field2669;
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
            var56.append("").append(var4.field2652).append(" ");
            for (int var57 = field1284 - 1; var57 >= 0; var57--) {
                var56.append("").append(field1278[var57].field757.field2652).append(" ");
            }
            var56.append("").append(var9);
            class165.method1744(var56.toString(), var58);
        }
    }

    @ObfuscatedName("az.t(ILcr;ZI)I")
    public static int method501(int arg0, class97 arg1, boolean arg2) {
        if (arg0 < 1000) {
            byte var10;
            if (arg0 == 100) {
                Statics.field278 -= 3;
                int var3 = field1282[Statics.field278];
                int var4 = field1282[Statics.field278 + 1];
                int var5 = field1282[Statics.field278 + 2];
                if (var4 == 0) {
                    throw new RuntimeException();
                }
                class243 var6 = class243.method577(var3);
                if (var6.field2947 == null) {
                    var6.field2947 = new class243[var5 + 1];
                }
                if (var6.field2947.length <= var5) {
                    class243[] var7 = new class243[var5 + 1];
                    for (int var8 = 0; var8 < var6.field2947.length; var8++) {
                        var7[var8] = var6.field2947[var8];
                    }
                    var6.field2947 = var7;
                }
                if (var5 > 0 && var6.field2947[var5 - 1] == null) {
                    throw new RuntimeException("" + (var5 - 1));
                }
                class243 var9 = new class243();
                var9.field2825 = var4;
                var9.field2899 = var9.field2826 = var6.field2826;
                var9.field2824 = var5;
                var9.field2822 = true;
                var6.field2947[var5] = var9;
                if (arg2) {
                    Statics.field1286 = var9;
                } else {
                    Statics.field2219 = var9;
                }
                client.method5068(var6);
                var10 = 1;
            } else if (arg0 == 101) {
                class243 var11 = arg2 ? Statics.field1286 : Statics.field2219;
                class243 var12 = class243.method577(var11.field2826);
                var12.field2947[var11.field2824] = null;
                client.method5068(var12);
                var10 = 1;
            } else if (arg0 == 102) {
                class243 var13 = class243.method577(field1282[--Statics.field278]);
                var13.field2947 = null;
                client.method5068(var13);
                var10 = 1;
            } else if (arg0 == 200) {
                Statics.field278 -= 2;
                int var14 = field1282[Statics.field278];
                int var15 = field1282[Statics.field278 + 1];
                class243 var16 = class243.method5065(var14, var15);
                if (var16 == null || var15 == -1) {
                    field1282[++Statics.field278 - 1] = 0;
                } else {
                    field1282[++Statics.field278 - 1] = 1;
                    if (arg2) {
                        Statics.field1286 = var16;
                    } else {
                        Statics.field2219 = var16;
                    }
                }
                var10 = 1;
            } else if (arg0 == 201) {
                class243 var17 = class243.method577(field1282[--Statics.field278]);
                if (var17 == null) {
                    field1282[++Statics.field278 - 1] = 0;
                } else {
                    field1282[++Statics.field278 - 1] = 1;
                    if (arg2) {
                        Statics.field1286 = var17;
                    } else {
                        Statics.field2219 = var17;
                    }
                }
                var10 = 1;
            } else {
                var10 = 2;
            }
            return var10;
        } else if (arg0 < 1100) {
            return method1064(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method3487(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method2549(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method4153(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method4512(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            class243 var21 = arg2 ? Statics.field1286 : Statics.field2219;
            byte var22;
            if (arg0 == 1500) {
                field1282[++Statics.field278 - 1] = var21.field2823;
                var22 = 1;
            } else if (arg0 == 1501) {
                field1282[++Statics.field278 - 1] = var21.field2837;
                var22 = 1;
            } else if (arg0 == 1502) {
                field1282[++Statics.field278 - 1] = var21.field2838;
                var22 = 1;
            } else if (arg0 == 1503) {
                field1282[++Statics.field278 - 1] = var21.field2919;
                var22 = 1;
            } else if (arg0 == 1504) {
                field1282[++Statics.field278 - 1] = var21.field2843 ? 1 : 0;
                var22 = 1;
            } else if (arg0 == 1505) {
                field1282[++Statics.field278 - 1] = var21.field2899;
                var22 = 1;
            } else {
                var22 = 2;
            }
            return var22;
        } else if (arg0 < 1700) {
            class243 var23 = arg2 ? Statics.field1286 : Statics.field2219;
            byte var24;
            if (arg0 == 1600) {
                field1282[++Statics.field278 - 1] = var23.field2844;
                var24 = 1;
            } else if (arg0 == 1601) {
                field1282[++Statics.field278 - 1] = var23.field2845;
                var24 = 1;
            } else if (arg0 == 1602) {
                field1287[++Statics.field638 - 1] = var23.field2883;
                var24 = 1;
            } else if (arg0 == 1603) {
                field1282[++Statics.field278 - 1] = var23.field2846;
                var24 = 1;
            } else if (arg0 == 1604) {
                field1282[++Statics.field278 - 1] = var23.field2934;
                var24 = 1;
            } else if (arg0 == 1605) {
                field1282[++Statics.field278 - 1] = var23.field2811;
                var24 = 1;
            } else if (arg0 == 1606) {
                field1282[++Statics.field278 - 1] = var23.field2812;
                var24 = 1;
            } else if (arg0 == 1607) {
                field1282[++Statics.field278 - 1] = var23.field2945;
                var24 = 1;
            } else if (arg0 == 1608) {
                field1282[++Statics.field278 - 1] = var23.field2875;
                var24 = 1;
            } else if (arg0 == 1609) {
                field1282[++Statics.field278 - 1] = var23.field2849;
                var24 = 1;
            } else if (arg0 == 1610) {
                field1282[++Statics.field278 - 1] = var23.field2855;
                var24 = 1;
            } else if (arg0 == 1611) {
                field1282[++Statics.field278 - 1] = var23.field2848;
                var24 = 1;
            } else if (arg0 == 1612) {
                field1282[++Statics.field278 - 1] = var23.field2842;
                var24 = 1;
            } else if (arg0 == 1613) {
                field1282[++Statics.field278 - 1] = var23.field2910.method8();
                var24 = 1;
            } else {
                var24 = 2;
            }
            return var24;
        } else if (arg0 < 1800) {
            class243 var28 = arg2 ? Statics.field1286 : Statics.field2219;
            byte var29;
            if (arg0 == 1700) {
                field1282[++Statics.field278 - 1] = var28.field2943;
                var29 = 1;
            } else if (arg0 == 1701) {
                if (var28.field2943 == -1) {
                    field1282[++Statics.field278 - 1] = 0;
                } else {
                    field1282[++Statics.field278 - 1] = var28.field2944;
                }
                var29 = 1;
            } else if (arg0 == 1702) {
                field1282[++Statics.field278 - 1] = var28.field2824;
                var29 = 1;
            } else {
                var29 = 2;
            }
            return var29;
        } else if (arg0 < 1900) {
            return method4048(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method3122(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method1064(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method3487(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method2549(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method4153(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method4512(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return Statics.method260(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            class243 var30 = class243.method577(field1282[--Statics.field278]);
            byte var31;
            if (arg0 == 2600) {
                field1282[++Statics.field278 - 1] = var30.field2844;
                var31 = 1;
            } else if (arg0 == 2601) {
                field1282[++Statics.field278 - 1] = var30.field2845;
                var31 = 1;
            } else if (arg0 == 2602) {
                field1287[++Statics.field638 - 1] = var30.field2883;
                var31 = 1;
            } else if (arg0 == 2603) {
                field1282[++Statics.field278 - 1] = var30.field2846;
                var31 = 1;
            } else if (arg0 == 2604) {
                field1282[++Statics.field278 - 1] = var30.field2934;
                var31 = 1;
            } else if (arg0 == 2605) {
                field1282[++Statics.field278 - 1] = var30.field2811;
                var31 = 1;
            } else if (arg0 == 2606) {
                field1282[++Statics.field278 - 1] = var30.field2812;
                var31 = 1;
            } else if (arg0 == 2607) {
                field1282[++Statics.field278 - 1] = var30.field2945;
                var31 = 1;
            } else if (arg0 == 2608) {
                field1282[++Statics.field278 - 1] = var30.field2875;
                var31 = 1;
            } else if (arg0 == 2609) {
                field1282[++Statics.field278 - 1] = var30.field2849;
                var31 = 1;
            } else if (arg0 == 2610) {
                field1282[++Statics.field278 - 1] = var30.field2855;
                var31 = 1;
            } else if (arg0 == 2611) {
                field1282[++Statics.field278 - 1] = var30.field2848;
                var31 = 1;
            } else if (arg0 == 2612) {
                field1282[++Statics.field278 - 1] = var30.field2842;
                var31 = 1;
            } else if (arg0 == 2613) {
                field1282[++Statics.field278 - 1] = var30.field2910.method8();
                var31 = 1;
            } else {
                var31 = 2;
            }
            return var31;
        } else if (arg0 < 2800) {
            byte var33;
            if (arg0 == 2700) {
                class243 var32 = class243.method577(field1282[--Statics.field278]);
                field1282[++Statics.field278 - 1] = var32.field2943;
                var33 = 1;
            } else if (arg0 == 2701) {
                class243 var34 = class243.method577(field1282[--Statics.field278]);
                if (var34.field2943 == -1) {
                    field1282[++Statics.field278 - 1] = 0;
                } else {
                    field1282[++Statics.field278 - 1] = var34.field2944;
                }
                var33 = 1;
            } else if (arg0 == 2702) {
                int var35 = field1282[--Statics.field278];
                class68 var36 = (class68) client.field1031.method3637((long) var35);
                if (var36 == null) {
                    field1282[++Statics.field278 - 1] = 0;
                } else {
                    field1282[++Statics.field278 - 1] = 1;
                }
                var33 = 1;
            } else if (arg0 == 2706) {
                field1282[++Statics.field278 - 1] = client.field1016;
                var33 = 1;
            } else {
                var33 = 2;
            }
            return var33;
        } else if (arg0 < 2900) {
            class243 var37 = class243.method577(field1282[--Statics.field278]);
            byte var38;
            if (arg0 == 2800) {
                field1282[++Statics.field278 - 1] = class244.method4137(client.method2446(var37));
                var38 = 1;
            } else if (arg0 == 2801) {
                int var39 = field1282[--Statics.field278];
                int var209 = var39 - 1;
                if (var37.field2897 == null || var209 >= var37.field2897.length || var37.field2897[var209] == null) {
                    field1287[++Statics.field638 - 1] = "";
                } else {
                    field1287[++Statics.field638 - 1] = var37.field2897[var209];
                }
                var38 = 1;
            } else if (arg0 == 2802) {
                if (var37.field2847 == null) {
                    field1287[++Statics.field638 - 1] = "";
                } else {
                    field1287[++Statics.field638 - 1] = var37.field2847;
                }
                var38 = 1;
            } else {
                var38 = 2;
            }
            return var38;
        } else if (arg0 < 3000) {
            return method3122(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method547(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method177(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            byte var40;
            if (arg0 == 3300) {
                field1282[++Statics.field278 - 1] = client.field929;
                var40 = 1;
            } else if (arg0 == 3301) {
                Statics.field278 -= 2;
                int var41 = field1282[Statics.field278];
                int var42 = field1282[Statics.field278 + 1];
                field1282[++Statics.field278 - 1] = class66.method959(var41, var42);
                var40 = 1;
            } else if (arg0 == 3302) {
                Statics.field278 -= 2;
                int var43 = field1282[Statics.field278];
                int var44 = field1282[Statics.field278 + 1];
                field1282[++Statics.field278 - 1] = class66.method37(var43, var44);
                var40 = 1;
            } else if (arg0 == 3303) {
                Statics.field278 -= 2;
                int var45 = field1282[Statics.field278];
                int var46 = field1282[Statics.field278 + 1];
                int[] var47 = field1282;
                int var48 = ++Statics.field278 - 1;
                class66 var49 = (class66) class66.field772.method3637((long) var45);
                int var50;
                if (var49 == null) {
                    var50 = 0;
                } else if (var46 == -1) {
                    var50 = 0;
                } else {
                    int var51 = 0;
                    for (int var52 = 0; var52 < var49.field768.length; var52++) {
                        if (var49.field769[var52] == var46) {
                            var51 += var49.field768[var52];
                        }
                    }
                    var50 = var51;
                }
                var47[var48] = var50;
                var40 = 1;
            } else if (arg0 == 3304) {
                int var53 = field1282[--Statics.field278];
                int[] var54 = field1282;
                int var55 = ++Statics.field278 - 1;
                class268 var56 = (class268) class268.field3449.method3601((long) var53);
                class268 var57;
                if (var56 == null) {
                    byte[] var58 = Statics.field3450.method4241(5, var53);
                    class268 var59 = new class268();
                    if (var58 != null) {
                        var59.method4331(new class195(var58));
                    }
                    class268.field3449.method3603(var59, (long) var53);
                    var57 = var59;
                } else {
                    var57 = var56;
                }
                var54[var55] = var57.field3447;
                var40 = 1;
            } else if (arg0 == 3305) {
                int var60 = field1282[--Statics.field278];
                field1282[++Statics.field278 - 1] = client.field1006[var60];
                var40 = 1;
            } else if (arg0 == 3306) {
                int var61 = field1282[--Statics.field278];
                field1282[++Statics.field278 - 1] = client.field1003[var61];
                var40 = 1;
            } else if (arg0 == 3307) {
                int var62 = field1282[--Statics.field278];
                field1282[++Statics.field278 - 1] = client.field1002[var62];
                var40 = 1;
            } else if (arg0 == 3308) {
                int var63 = Statics.field270;
                int var64 = (Statics.field642.field1211 >> 7) + Statics.field2048;
                int var65 = (Statics.field642.field1188 >> 7) + Statics.field360;
                field1282[++Statics.field278 - 1] = (var63 << 28) + (var64 << 14) + var65;
                var40 = 1;
            } else if (arg0 == 3309) {
                int var66 = field1282[--Statics.field278];
                field1282[++Statics.field278 - 1] = var66 >> 14 & 0x3FFF;
                var40 = 1;
            } else if (arg0 == 3310) {
                int var67 = field1282[--Statics.field278];
                field1282[++Statics.field278 - 1] = var67 >> 28;
                var40 = 1;
            } else if (arg0 == 3311) {
                int var68 = field1282[--Statics.field278];
                field1282[++Statics.field278 - 1] = var68 & 0x3FFF;
                var40 = 1;
            } else if (arg0 == 3312) {
                field1282[++Statics.field278 - 1] = client.field874 ? 1 : 0;
                var40 = 1;
            } else if (arg0 == 3313) {
                Statics.field278 -= 2;
                int var69 = field1282[Statics.field278] + 32768;
                int var70 = field1282[Statics.field278 + 1];
                field1282[++Statics.field278 - 1] = class66.method959(var69, var70);
                var40 = 1;
            } else if (arg0 == 3314) {
                Statics.field278 -= 2;
                int var71 = field1282[Statics.field278] + 32768;
                int var72 = field1282[Statics.field278 + 1];
                field1282[++Statics.field278 - 1] = class66.method37(var71, var72);
                var40 = 1;
            } else if (arg0 == 3315) {
                Statics.field278 -= 2;
                int var73 = field1282[Statics.field278] + 32768;
                int var74 = field1282[Statics.field278 + 1];
                int[] var75 = field1282;
                int var76 = ++Statics.field278 - 1;
                class66 var77 = (class66) class66.field772.method3637((long) var73);
                int var78;
                if (var77 == null) {
                    var78 = 0;
                } else if (var74 == -1) {
                    var78 = 0;
                } else {
                    int var79 = 0;
                    for (int var80 = 0; var80 < var77.field768.length; var80++) {
                        if (var77.field769[var80] == var74) {
                            var79 += var77.field768[var80];
                        }
                    }
                    var78 = var79;
                }
                var75[var76] = var78;
                var40 = 1;
            } else if (arg0 == 3316) {
                if (client.field1102 >= 2) {
                    field1282[++Statics.field278 - 1] = client.field1102;
                } else {
                    field1282[++Statics.field278 - 1] = 0;
                }
                var40 = 1;
            } else if (arg0 == 3317) {
                field1282[++Statics.field278 - 1] = client.field889;
                var40 = 1;
            } else if (arg0 == 3318) {
                field1282[++Statics.field278 - 1] = client.field871;
                var40 = 1;
            } else if (arg0 == 3321) {
                field1282[++Statics.field278 - 1] = client.field1125;
                var40 = 1;
            } else if (arg0 == 3322) {
                field1282[++Statics.field278 - 1] = client.field1036;
                var40 = 1;
            } else if (arg0 == 3323) {
                if (client.field1021) {
                    field1282[++Statics.field278 - 1] = 1;
                } else {
                    field1282[++Statics.field278 - 1] = 0;
                }
                var40 = 1;
            } else if (arg0 == 3324) {
                field1282[++Statics.field278 - 1] = client.field935;
                var40 = 1;
            } else if (arg0 == 3325) {
                Statics.field278 -= 4;
                int var81 = field1282[Statics.field278];
                int var82 = field1282[Statics.field278 + 1];
                int var83 = field1282[Statics.field278 + 2];
                int var84 = field1282[Statics.field278 + 3];
                int var85 = (var82 << 14) + var81;
                int var86 = (var83 << 28) + var85;
                int var87 = var84 + var86;
                field1282[++Statics.field278 - 1] = var87;
                var40 = 1;
            } else {
                var40 = 2;
            }
            return var40;
        } else if (arg0 < 3500) {
            byte var96;
            if (arg0 == 3400) {
                Statics.field278 -= 2;
                int var88 = field1282[Statics.field278];
                int var89 = field1282[Statics.field278 + 1];
                class281 var90 = (class281) class281.field3564.method3601((long) var88);
                class281 var91;
                if (var90 == null) {
                    byte[] var92 = Statics.field3559.method4241(8, var88);
                    class281 var93 = new class281();
                    if (var92 != null) {
                        var93.method4561(new class195(var92));
                    }
                    class281.field3564.method3603(var93, (long) var88);
                    var91 = var93;
                } else {
                    var91 = var90;
                }
                class281 var94 = var91;
                if (var91.field3561 != 's') {
                }
                for (int var95 = 0; var95 < var94.field3567; var95++) {
                    if (var94.field3565[var95] == var89) {
                        field1287[++Statics.field638 - 1] = var94.field3562[var95];
                        var94 = null;
                        break;
                    }
                }
                if (var94 != null) {
                    field1287[++Statics.field638 - 1] = var94.field3566;
                }
                var96 = 1;
            } else if (arg0 == 3408) {
                Statics.field278 -= 4;
                int var97 = field1282[Statics.field278];
                int var98 = field1282[Statics.field278 + 1];
                int var99 = field1282[Statics.field278 + 2];
                int var100 = field1282[Statics.field278 + 3];
                class281 var101 = (class281) class281.field3564.method3601((long) var99);
                class281 var102;
                if (var101 == null) {
                    byte[] var103 = Statics.field3559.method4241(8, var99);
                    class281 var104 = new class281();
                    if (var103 != null) {
                        var104.method4561(new class195(var103));
                    }
                    class281.field3564.method3603(var104, (long) var99);
                    var102 = var104;
                } else {
                    var102 = var101;
                }
                class281 var105 = var102;
                if (var102.field3560 == var97 && var102.field3561 == var98) {
                    for (int var106 = 0; var106 < var105.field3567; var106++) {
                        if (var105.field3565[var106] == var100) {
                            if (var98 == 115) {
                                field1287[++Statics.field638 - 1] = var105.field3562[var106];
                            } else {
                                field1282[++Statics.field278 - 1] = var105.field3558[var106];
                            }
                            var105 = null;
                            break;
                        }
                    }
                    if (var105 != null) {
                        if (var98 == 115) {
                            field1287[++Statics.field638 - 1] = var105.field3566;
                        } else {
                            field1282[++Statics.field278 - 1] = var105.field3563;
                        }
                    }
                    var96 = 1;
                } else {
                    if (var98 == 115) {
                        field1287[++Statics.field638 - 1] = class252.field3032;
                    } else {
                        field1282[++Statics.field278 - 1] = 0;
                    }
                    var96 = 1;
                }
            } else if (arg0 == 3411) {
                int var107 = field1282[--Statics.field278];
                class281 var108 = (class281) class281.field3564.method3601((long) var107);
                class281 var109;
                if (var108 == null) {
                    byte[] var110 = Statics.field3559.method4241(8, var107);
                    class281 var111 = new class281();
                    if (var110 != null) {
                        var111.method4561(new class195(var110));
                    }
                    class281.field3564.method3603(var111, (long) var107);
                    var109 = var111;
                } else {
                    var109 = var108;
                }
                field1282[++Statics.field278 - 1] = var109.method4571();
                var96 = 1;
            } else {
                var96 = 2;
            }
            return var96;
        } else if (arg0 < 3700) {
            byte var113;
            if (arg0 == 3600) {
                if (Statics.field426.field1254 == 0) {
                    field1282[++Statics.field278 - 1] = -2;
                } else if (Statics.field426.field1254 == 1) {
                    field1282[++Statics.field278 - 1] = -1;
                } else {
                    field1282[++Statics.field278 - 1] = Statics.field426.field1257.method4916();
                }
                var113 = 1;
            } else if (arg0 == 3601) {
                int var114 = field1282[--Statics.field278];
                if (Statics.field426.method1587() && var114 >= 0 && var114 < Statics.field426.field1257.method4916()) {
                    class307 var115 = (class307) Statics.field426.field1257.method4926(var114);
                    field1287[++Statics.field638 - 1] = var115.method4879();
                    field1287[++Statics.field638 - 1] = var115.method4875();
                } else {
                    field1287[++Statics.field638 - 1] = "";
                    field1287[++Statics.field638 - 1] = "";
                }
                var113 = 1;
            } else if (arg0 == 3602) {
                int var116 = field1282[--Statics.field278];
                if (Statics.field426.method1587() && var116 >= 0 && var116 < Statics.field426.field1257.method4916()) {
                    field1282[++Statics.field278 - 1] = ((class302) Statics.field426.field1257.method4926(var116)).field3848;
                } else {
                    field1282[++Statics.field278 - 1] = 0;
                }
                var113 = 1;
            } else if (arg0 == 3603) {
                int var117 = field1282[--Statics.field278];
                if (Statics.field426.method1587() && var117 >= 0 && var117 < Statics.field426.field1257.method4916()) {
                    field1282[++Statics.field278 - 1] = ((class302) Statics.field426.field1257.method4926(var117)).field3847;
                } else {
                    field1282[++Statics.field278 - 1] = 0;
                }
                var113 = 1;
            } else if (arg0 == 3604) {
                String var118 = field1287[--Statics.field638];
                int var119 = field1282[--Statics.field278];
                class185 var120 = class185.method267(class182.field2463, client.field958.field1485);
                var120.field2505.method3189(class195.method451(var118) + 1);
                var120.field2505.method3229(var119);
                var120.field2505.method3214(var118);
                client.field958.method1882(var120);
                var113 = 1;
            } else if (arg0 == 3605) {
                String var121 = field1287[--Statics.field638];
                Statics.field426.method1635(var121);
                var113 = 1;
            } else if (arg0 == 3606) {
                String var122 = field1287[--Statics.field638];
                Statics.field426.method1597(var122);
                var113 = 1;
            } else if (arg0 == 3607) {
                String var123 = field1287[--Statics.field638];
                Statics.field426.method1637(var123);
                var113 = 1;
            } else if (arg0 == 3608) {
                String var124 = field1287[--Statics.field638];
                Statics.field426.method1598(var124);
                var113 = 1;
            } else if (arg0 == 3609) {
                String var125 = field1287[--Statics.field638];
                String var126 = client.method5067(var125);
                field1282[++Statics.field278 - 1] = Statics.field426.method1592(new class306(var126, Statics.field2519), false) ? 1 : 0;
                var113 = 1;
            } else if (arg0 == 3611) {
                if (Statics.field696 == null) {
                    field1287[++Statics.field638 - 1] = "";
                } else {
                    field1287[++Statics.field638 - 1] = Statics.field696.field3871;
                }
                var113 = 1;
            } else if (arg0 == 3612) {
                if (Statics.field696 == null) {
                    field1282[++Statics.field278 - 1] = 0;
                } else {
                    field1282[++Statics.field278 - 1] = Statics.field696.method4916();
                }
                var113 = 1;
            } else if (arg0 == 3613) {
                int var127 = field1282[--Statics.field278];
                if (Statics.field696 == null || var127 >= Statics.field696.method4916()) {
                    field1287[++Statics.field638 - 1] = "";
                } else {
                    field1287[++Statics.field638 - 1] = Statics.field696.method4926(var127).method4883().method5015();
                }
                var113 = 1;
            } else if (arg0 == 3614) {
                int var128 = field1282[--Statics.field278];
                if (Statics.field696 == null || var128 >= Statics.field696.method4916()) {
                    field1282[++Statics.field278 - 1] = 0;
                } else {
                    field1282[++Statics.field278 - 1] = ((class302) Statics.field696.method4926(var128)).method4990();
                }
                var113 = 1;
            } else if (arg0 == 3615) {
                int var129 = field1282[--Statics.field278];
                if (Statics.field696 == null || var129 >= Statics.field696.method4916()) {
                    field1282[++Statics.field278 - 1] = 0;
                } else {
                    field1282[++Statics.field278 - 1] = ((class302) Statics.field696.method4926(var129)).field3847;
                }
                var113 = 1;
            } else if (arg0 == 3616) {
                field1282[++Statics.field278 - 1] = Statics.field696 == null ? 0 : Statics.field696.field3866;
                var113 = 1;
            } else if (arg0 == 3617) {
                String var130 = field1287[--Statics.field638];
                client.method69(var130);
                var113 = 1;
            } else if (arg0 == 3618) {
                field1282[++Statics.field278 - 1] = Statics.field696 == null ? 0 : Statics.field696.field3872;
                var113 = 1;
            } else if (arg0 == 3619) {
                String var131 = field1287[--Statics.field638];
                if (!var131.equals("")) {
                    class185 var132 = class185.method267(class182.field2399, client.field958.field1485);
                    var132.field2505.method3189(class195.method451(var131));
                    var132.field2505.method3214(var131);
                    client.field958.method1882(var132);
                }
                var113 = 1;
            } else if (arg0 == 3620) {
                client.method2444();
                var113 = 1;
            } else if (arg0 == 3621) {
                if (Statics.field426.method1587()) {
                    field1282[++Statics.field278 - 1] = Statics.field426.field1255.method4916();
                } else {
                    field1282[++Statics.field278 - 1] = -1;
                }
                var113 = 1;
            } else if (arg0 == 3622) {
                int var133 = field1282[--Statics.field278];
                if (Statics.field426.method1587() && var133 >= 0 && var133 < Statics.field426.field1255.method4916()) {
                    class301 var134 = (class301) Statics.field426.field1255.method4926(var133);
                    field1287[++Statics.field638 - 1] = var134.method4879();
                    field1287[++Statics.field638 - 1] = var134.method4875();
                } else {
                    field1287[++Statics.field638 - 1] = "";
                    field1287[++Statics.field638 - 1] = "";
                }
                var113 = 1;
            } else if (arg0 == 3623) {
                String var135 = field1287[--Statics.field638];
                String var136 = client.method5067(var135);
                field1282[++Statics.field278 - 1] = Statics.field426.method1593(new class306(var136, Statics.field2519)) ? 1 : 0;
                var113 = 1;
            } else if (arg0 == 3624) {
                int var137 = field1282[--Statics.field278];
                if (Statics.field696 == null || var137 >= Statics.field696.method4916() || !Statics.field696.method4926(var137).method4883().equals(Statics.field642.field842)) {
                    field1282[++Statics.field278 - 1] = 0;
                } else {
                    field1282[++Statics.field278 - 1] = 1;
                }
                var113 = 1;
            } else if (arg0 == 3625) {
                if (Statics.field696 == null || Statics.field696.field3870 == null) {
                    field1287[++Statics.field638 - 1] = "";
                } else {
                    field1287[++Statics.field638 - 1] = Statics.field696.field3870;
                }
                var113 = 1;
            } else if (arg0 == 3626) {
                int var138 = field1282[--Statics.field278];
                if (Statics.field696 == null || var138 >= Statics.field696.method4916() || !((class296) Statics.field696.method4926(var138)).method4854()) {
                    field1282[++Statics.field278 - 1] = 0;
                } else {
                    field1282[++Statics.field278 - 1] = 1;
                }
                var113 = 1;
            } else if (arg0 == 3627) {
                int var139 = field1282[--Statics.field278];
                if (Statics.field696 == null || var139 >= Statics.field696.method4916() || !((class296) Statics.field696.method4926(var139)).method4872()) {
                    field1282[++Statics.field278 - 1] = 0;
                } else {
                    field1282[++Statics.field278 - 1] = 1;
                }
                var113 = 1;
            } else if (arg0 == 3628) {
                Statics.field426.field1257.method4934();
                var113 = 1;
            } else if (arg0 == 3629) {
                boolean var140 = field1282[--Statics.field278] == 1;
                Statics.field426.field1257.method4935(new class322(var140));
                var113 = 1;
            } else if (arg0 == 3630) {
                boolean var141 = field1282[--Statics.field278] == 1;
                Statics.field426.field1257.method4935(new class323(var141));
                var113 = 1;
            } else if (arg0 == 3631) {
                boolean var142 = field1282[--Statics.field278] == 1;
                Statics.field426.field1257.method4935(new class156(var142));
                var113 = 1;
            } else if (arg0 == 3632) {
                boolean var143 = field1282[--Statics.field278] == 1;
                Statics.field426.field1257.method4935(new class150(var143));
                var113 = 1;
            } else if (arg0 == 3633) {
                boolean var144 = field1282[--Statics.field278] == 1;
                Statics.field426.field1257.method4935(new class155(var144));
                var113 = 1;
            } else if (arg0 == 3634) {
                boolean var145 = field1282[--Statics.field278] == 1;
                Statics.field426.field1257.method4935(new class158(var145));
                var113 = 1;
            } else if (arg0 == 3635) {
                boolean var146 = field1282[--Statics.field278] == 1;
                Statics.field426.field1257.method4935(new class154(var146));
                var113 = 1;
            } else if (arg0 == 3636) {
                boolean var147 = field1282[--Statics.field278] == 1;
                Statics.field426.field1257.method4935(new class152(var147));
                var113 = 1;
            } else if (arg0 == 3637) {
                boolean var148 = field1282[--Statics.field278] == 1;
                Statics.field426.field1257.method4935(new class151(var148));
                var113 = 1;
            } else if (arg0 == 3638) {
                boolean var149 = field1282[--Statics.field278] == 1;
                Statics.field426.field1257.method4935(new class153(var149));
                var113 = 1;
            } else if (arg0 == 3639) {
                Statics.field426.field1257.method4939();
                var113 = 1;
            } else if (arg0 == 3640) {
                Statics.field426.field1255.method4934();
                var113 = 1;
            } else if (arg0 == 3641) {
                boolean var150 = field1282[--Statics.field278] == 1;
                Statics.field426.field1255.method4935(new class322(var150));
                var113 = 1;
            } else if (arg0 == 3642) {
                boolean var151 = field1282[--Statics.field278] == 1;
                Statics.field426.field1255.method4935(new class323(var151));
                var113 = 1;
            } else if (arg0 == 3643) {
                Statics.field426.field1255.method4939();
                var113 = 1;
            } else if (arg0 == 3644) {
                if (Statics.field696 != null) {
                    Statics.field696.method4934();
                }
                var113 = 1;
            } else if (arg0 == 3645) {
                boolean var152 = field1282[--Statics.field278] == 1;
                if (Statics.field696 != null) {
                    Statics.field696.method4935(new class322(var152));
                }
                var113 = 1;
            } else if (arg0 == 3646) {
                boolean var153 = field1282[--Statics.field278] == 1;
                if (Statics.field696 != null) {
                    Statics.field696.method4935(new class323(var153));
                }
                var113 = 1;
            } else if (arg0 == 3647) {
                boolean var154 = field1282[--Statics.field278] == 1;
                if (Statics.field696 != null) {
                    Statics.field696.method4935(new class156(var154));
                }
                var113 = 1;
            } else if (arg0 == 3648) {
                boolean var155 = field1282[--Statics.field278] == 1;
                if (Statics.field696 != null) {
                    Statics.field696.method4935(new class150(var155));
                }
                var113 = 1;
            } else if (arg0 == 3649) {
                boolean var156 = field1282[--Statics.field278] == 1;
                if (Statics.field696 != null) {
                    Statics.field696.method4935(new class155(var156));
                }
                var113 = 1;
            } else if (arg0 == 3650) {
                boolean var157 = field1282[--Statics.field278] == 1;
                if (Statics.field696 != null) {
                    Statics.field696.method4935(new class158(var157));
                }
                var113 = 1;
            } else if (arg0 == 3651) {
                boolean var158 = field1282[--Statics.field278] == 1;
                if (Statics.field696 != null) {
                    Statics.field696.method4935(new class154(var158));
                }
                var113 = 1;
            } else if (arg0 == 3652) {
                boolean var159 = field1282[--Statics.field278] == 1;
                if (Statics.field696 != null) {
                    Statics.field696.method4935(new class152(var159));
                }
                var113 = 1;
            } else if (arg0 == 3653) {
                boolean var160 = field1282[--Statics.field278] == 1;
                if (Statics.field696 != null) {
                    Statics.field696.method4935(new class151(var160));
                }
                var113 = 1;
            } else if (arg0 == 3654) {
                boolean var161 = field1282[--Statics.field278] == 1;
                if (Statics.field696 != null) {
                    Statics.field696.method4935(new class153(var161));
                }
                var113 = 1;
            } else if (arg0 == 3655) {
                if (Statics.field696 != null) {
                    Statics.field696.method4939();
                }
                var113 = 1;
            } else if (arg0 == 3656) {
                boolean var162 = field1282[--Statics.field278] == 1;
                Statics.field426.field1257.method4935(new class157(var162));
                var113 = 1;
            } else if (arg0 == 3657) {
                boolean var163 = field1282[--Statics.field278] == 1;
                if (Statics.field696 != null) {
                    Statics.field696.method4935(new class157(var163));
                }
                var113 = 1;
            } else {
                var113 = 2;
            }
            return var113;
        } else if (arg0 < 4000) {
            return method1550(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method46(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method659(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method16(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            byte var164;
            if (arg0 == 5000) {
                field1282[++Statics.field278 - 1] = client.field1084;
                var164 = 1;
            } else if (arg0 == 5001) {
                Statics.field278 -= 3;
                client.field1084 = field1282[Statics.field278];
                int var165 = field1282[Statics.field278 + 1];
                class321[] var166 = class321.method4986();
                int var167 = 0;
                class321 var169;
                while (true) {
                    if (var167 >= var166.length) {
                        var169 = null;
                        break;
                    }
                    class321 var168 = var166[var167];
                    if (var168.field3933 == var165) {
                        var169 = var168;
                        break;
                    }
                    var167++;
                }
                Statics.field580 = var169;
                if (Statics.field580 == null) {
                    Statics.field580 = class321.field3934;
                }
                client.field1085 = field1282[Statics.field278 + 2];
                class185 var170 = class185.method267(class182.field2387, client.field958.field1485);
                var170.field2505.method3189(client.field1084);
                var170.field2505.method3189(Statics.field580.field3933);
                var170.field2505.method3189(client.field1085);
                client.field958.method1882(var170);
                var164 = 1;
            } else if (arg0 == 5002) {
                String var171 = field1287[--Statics.field638];
                Statics.field278 -= 2;
                int var172 = field1282[Statics.field278];
                int var173 = field1282[Statics.field278 + 1];
                class185 var174 = class185.method267(class182.field2460, client.field958.field1485);
                var174.field2505.method3189(class195.method451(var171) + 2);
                var174.field2505.method3214(var171);
                var174.field2505.method3189(var172 - 1);
                var174.field2505.method3189(var173);
                client.field958.method1882(var174);
                var164 = 1;
            } else if (arg0 == 5003) {
                Statics.field278 -= 2;
                int var175 = field1282[Statics.field278];
                int var176 = field1282[Statics.field278 + 1];
                class99 var177 = (class99) class96.field1452.get(var175);
                class71 var178 = var177.method1859(var176);
                if (var178 == null) {
                    field1282[++Statics.field278 - 1] = -1;
                    field1282[++Statics.field278 - 1] = 0;
                    field1287[++Statics.field638 - 1] = "";
                    field1287[++Statics.field638 - 1] = "";
                    field1287[++Statics.field638 - 1] = "";
                    field1282[++Statics.field278 - 1] = 0;
                } else {
                    field1282[++Statics.field278 - 1] = var178.field828;
                    field1282[++Statics.field278 - 1] = var178.field829;
                    field1287[++Statics.field638 - 1] = var178.field824 == null ? "" : var178.field824;
                    field1287[++Statics.field638 - 1] = var178.field826 == null ? "" : var178.field826;
                    field1287[++Statics.field638 - 1] = var178.field827 == null ? "" : var178.field827;
                    field1282[++Statics.field278 - 1] = var178.method1036() ? 1 : (var178.method1039() ? 2 : 0);
                }
                var164 = 1;
            } else if (arg0 == 5004) {
                int var180 = field1282[--Statics.field278];
                class71 var181 = (class71) class96.field1451.method3575((long) var180);
                if (var181 == null) {
                    field1282[++Statics.field278 - 1] = -1;
                    field1282[++Statics.field278 - 1] = 0;
                    field1287[++Statics.field638 - 1] = "";
                    field1287[++Statics.field638 - 1] = "";
                    field1287[++Statics.field638 - 1] = "";
                    field1282[++Statics.field278 - 1] = 0;
                } else {
                    field1282[++Statics.field278 - 1] = var181.field823;
                    field1282[++Statics.field278 - 1] = var181.field829;
                    field1287[++Statics.field638 - 1] = var181.field824 == null ? "" : var181.field824;
                    field1287[++Statics.field638 - 1] = var181.field826 == null ? "" : var181.field826;
                    field1287[++Statics.field638 - 1] = var181.field827 == null ? "" : var181.field827;
                    field1282[++Statics.field278 - 1] = var181.method1036() ? 1 : (var181.method1039() ? 2 : 0);
                }
                var164 = 1;
            } else if (arg0 == 5005) {
                if (Statics.field580 == null) {
                    field1282[++Statics.field278 - 1] = -1;
                } else {
                    field1282[++Statics.field278 - 1] = Statics.field580.field3933;
                }
                var164 = 1;
            } else if (arg0 == 5008) {
                String var183 = field1287[--Statics.field638];
                int var184 = field1282[--Statics.field278];
                String var185 = var183.toLowerCase();
                byte var186 = 0;
                if (var185.startsWith(class252.field3201)) {
                    var186 = 0;
                    var183 = var183.substring(class252.field3201.length());
                } else if (var185.startsWith(class252.field3183)) {
                    var186 = 1;
                    var183 = var183.substring(class252.field3183.length());
                } else if (var185.startsWith(class252.field3205)) {
                    var186 = 2;
                    var183 = var183.substring(class252.field3205.length());
                } else if (var185.startsWith(class252.field3207)) {
                    var186 = 3;
                    var183 = var183.substring(class252.field3207.length());
                } else if (var185.startsWith(class252.field3060)) {
                    var186 = 4;
                    var183 = var183.substring(class252.field3060.length());
                } else if (var185.startsWith(class252.field3292)) {
                    var186 = 5;
                    var183 = var183.substring(class252.field3292.length());
                } else if (var185.startsWith(class252.field3037)) {
                    var186 = 6;
                    var183 = var183.substring(class252.field3037.length());
                } else if (var185.startsWith(class252.field3159)) {
                    var186 = 7;
                    var183 = var183.substring(class252.field3159.length());
                } else if (var185.startsWith(class252.field3078)) {
                    var186 = 8;
                    var183 = var183.substring(class252.field3078.length());
                } else if (var185.startsWith(class252.field3219)) {
                    var186 = 9;
                    var183 = var183.substring(class252.field3219.length());
                } else if (var185.startsWith(class252.field3246)) {
                    var186 = 10;
                    var183 = var183.substring(class252.field3246.length());
                } else if (var185.startsWith(class252.field3223)) {
                    var186 = 11;
                    var183 = var183.substring(class252.field3223.length());
                } else if (client.field980 != 0) {
                    if (var185.startsWith(class252.field3202)) {
                        var186 = 0;
                        var183 = var183.substring(class252.field3202.length());
                    } else if (var185.startsWith(class252.field3204)) {
                        var186 = 1;
                        var183 = var183.substring(class252.field3204.length());
                    } else if (var185.startsWith(class252.field3305)) {
                        var186 = 2;
                        var183 = var183.substring(class252.field3305.length());
                    } else if (var185.startsWith(class252.field3208)) {
                        var186 = 3;
                        var183 = var183.substring(class252.field3208.length());
                    } else if (var185.startsWith(class252.field3210)) {
                        var186 = 4;
                        var183 = var183.substring(class252.field3210.length());
                    } else if (var185.startsWith(class252.field3062)) {
                        var186 = 5;
                        var183 = var183.substring(class252.field3062.length());
                    } else if (var185.startsWith(class252.field3212)) {
                        var186 = 6;
                        var183 = var183.substring(class252.field3212.length());
                    } else if (var185.startsWith(class252.field3216)) {
                        var186 = 7;
                        var183 = var183.substring(class252.field3216.length());
                    } else if (var185.startsWith(class252.field3051)) {
                        var186 = 8;
                        var183 = var183.substring(class252.field3051.length());
                    } else if (var185.startsWith(class252.field3075)) {
                        var186 = 9;
                        var183 = var183.substring(class252.field3075.length());
                    } else if (var185.startsWith(class252.field3222)) {
                        var186 = 10;
                        var183 = var183.substring(class252.field3222.length());
                    } else if (var185.startsWith(class252.field3224)) {
                        var186 = 11;
                        var183 = var183.substring(class252.field3224.length());
                    }
                }
                String var187 = var183.toLowerCase();
                byte var188 = 0;
                if (var187.startsWith(class252.field3055)) {
                    var188 = 1;
                    var183 = var183.substring(class252.field3055.length());
                } else if (var187.startsWith(class252.field3138)) {
                    var188 = 2;
                    var183 = var183.substring(class252.field3138.length());
                } else if (var187.startsWith(class252.field3146)) {
                    var188 = 3;
                    var183 = var183.substring(class252.field3146.length());
                } else if (var187.startsWith(class252.field3156)) {
                    var188 = 4;
                    var183 = var183.substring(class252.field3156.length());
                } else if (var187.startsWith(class252.field3233)) {
                    var188 = 5;
                    var183 = var183.substring(class252.field3233.length());
                } else if (client.field980 != 0) {
                    if (var187.startsWith(class252.field3226)) {
                        var188 = 1;
                        var183 = var183.substring(class252.field3226.length());
                    } else if (var187.startsWith(class252.field3228)) {
                        var188 = 2;
                        var183 = var183.substring(class252.field3228.length());
                    } else if (var187.startsWith(class252.field3230)) {
                        var188 = 3;
                        var183 = var183.substring(class252.field3230.length());
                    } else if (var187.startsWith(class252.field3232)) {
                        var188 = 4;
                        var183 = var183.substring(class252.field3232.length());
                    } else if (var187.startsWith(class252.field3041)) {
                        var188 = 5;
                        var183 = var183.substring(class252.field3041.length());
                    }
                }
                class185 var189 = class185.method267(class182.field2414, client.field958.field1485);
                var189.field2505.method3189(0);
                int var190 = var189.field2505.field2575;
                var189.field2505.method3189(var184);
                var189.field2505.method3189(var186);
                var189.field2505.method3189(var188);
                class314.method4892(var189.field2505, var183);
                var189.field2505.method3202(var189.field2505.field2575 - var190);
                client.field958.method1882(var189);
                var164 = 1;
            } else if (arg0 == 5009) {
                Statics.field638 -= 2;
                String var191 = field1287[Statics.field638];
                String var192 = field1287[Statics.field638 + 1];
                class185 var193 = class185.method267(class182.field2391, client.field958.field1485);
                var193.field2505.method3190(0);
                int var194 = var193.field2505.field2575;
                var193.field2505.method3214(var191);
                class314.method4892(var193.field2505, var192);
                var193.field2505.method3201(var193.field2505.field2575 - var194);
                client.field958.method1882(var193);
                var164 = 1;
            } else if (arg0 == 5015) {
                String var195;
                if (Statics.field642 == null || Statics.field642.field842 == null) {
                    var195 = "";
                } else {
                    var195 = Statics.field642.field842.method5015();
                }
                field1287[++Statics.field638 - 1] = var195;
                var164 = 1;
            } else if (arg0 == 5016) {
                field1282[++Statics.field278 - 1] = client.field1085;
                var164 = 1;
            } else if (arg0 == 5017) {
                int var196 = field1282[--Statics.field278];
                field1282[++Statics.field278 - 1] = class96.method11(var196);
                var164 = 1;
            } else if (arg0 == 5018) {
                int var197 = field1282[--Statics.field278];
                int[] var198 = field1282;
                int var199 = ++Statics.field278 - 1;
                class71 var200 = (class71) class96.field1451.method3575((long) var197);
                int var201;
                if (var200 == null) {
                    var201 = -1;
                } else if (class96.field1454.field2676 == var200.field2658) {
                    var201 = -1;
                } else {
                    var201 = ((class71) var200.field2658).field828;
                }
                var198[var199] = var201;
                var164 = 1;
            } else if (arg0 == 5019) {
                int var202 = field1282[--Statics.field278];
                int[] var203 = field1282;
                int var204 = ++Statics.field278 - 1;
                class71 var205 = (class71) class96.field1451.method3575((long) var202);
                int var206;
                if (var205 == null) {
                    var206 = -1;
                } else if (class96.field1454.field2676 == var205.field2657) {
                    var206 = -1;
                } else {
                    var206 = ((class71) var205.field2657).field828;
                }
                var203[var204] = var206;
                var164 = 1;
            } else if (arg0 == 5020) {
                String var207 = field1287[--Statics.field638];
                client.method1118(var207);
                var164 = 1;
            } else if (arg0 == 5021) {
                client.field1086 = field1287[--Statics.field638].toLowerCase().trim();
                var164 = 1;
            } else if (arg0 == 5022) {
                field1287[++Statics.field638 - 1] = client.field1086;
                var164 = 1;
            } else {
                var164 = 2;
            }
            return var164;
        } else if (arg0 < 5400) {
            return method99(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method2445(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method1122(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            byte var208;
            if (arg0 == 6200) {
                Statics.field278 -= 2;
                client.field1121 = (short) field1282[Statics.field278];
                if (client.field1121 <= 0) {
                    client.field1121 = 256;
                }
                client.field1119 = (short) field1282[Statics.field278 + 1];
                if (client.field1119 <= 0) {
                    client.field1119 = 205;
                }
                var208 = 1;
            } else if (arg0 == 6201) {
                Statics.field278 -= 2;
                client.field1019 = (short) field1282[Statics.field278];
                if (client.field1019 <= 0) {
                    client.field1019 = 256;
                }
                client.field1105 = (short) field1282[Statics.field278 + 1];
                if (client.field1105 <= 0) {
                    client.field1105 = 320;
                }
                var208 = 1;
            } else if (arg0 == 6202) {
                Statics.field278 -= 4;
                client.field1122 = (short) field1282[Statics.field278];
                if (client.field1122 <= 0) {
                    client.field1122 = 1;
                }
                client.field1123 = (short) field1282[Statics.field278 + 1];
                if (client.field1123 <= 0) {
                    client.field1123 = 32767;
                } else if (client.field1123 < client.field1122) {
                    client.field1123 = client.field1122;
                }
                client.field1124 = (short) field1282[Statics.field278 + 2];
                if (client.field1124 <= 0) {
                    client.field1124 = 1;
                }
                client.field912 = (short) field1282[Statics.field278 + 3];
                if (client.field912 <= 0) {
                    client.field912 = 32767;
                } else if (client.field912 < client.field1124) {
                    client.field912 = client.field1124;
                }
                var208 = 1;
            } else if (arg0 == 6203) {
                if (client.field1040 == null) {
                    field1282[++Statics.field278 - 1] = -1;
                    field1282[++Statics.field278 - 1] = -1;
                } else {
                    client.method497(0, 0, client.field1040.field2838, client.field1040.field2919, false);
                    field1282[++Statics.field278 - 1] = client.field1128;
                    field1282[++Statics.field278 - 1] = client.field1129;
                }
                var208 = 1;
            } else if (arg0 == 6204) {
                field1282[++Statics.field278 - 1] = client.field1019;
                field1282[++Statics.field278 - 1] = client.field1105;
                var208 = 1;
            } else if (arg0 == 6205) {
                field1282[++Statics.field278 - 1] = client.field1121;
                field1282[++Statics.field278 - 1] = client.field1119;
                var208 = 1;
            } else {
                var208 = 2;
            }
            return var208;
        } else if (arg0 < 6600) {
            return method162(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method1(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bv.d(ILcr;ZI)I")
    public static int method1064(int arg0, class97 arg1, boolean arg2) {
        int var3 = -1;
        class243 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1282[--Statics.field278];
            var4 = class243.method577(var3);
        } else {
            var4 = arg2 ? Statics.field1286 : Statics.field2219;
        }
        if (arg0 == 1000) {
            Statics.field278 -= 4;
            var4.field2832 = field1282[Statics.field278];
            var4.field2853 = field1282[Statics.field278 + 1];
            var4.field2817 = field1282[Statics.field278 + 2];
            var4.field2829 = field1282[Statics.field278 + 3];
            client.method5068(var4);
            Statics.field359.method1494(var4);
            if (var3 != -1 && var4.field2825 == 0) {
                client.method1733(Statics.field812[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field278 -= 4;
            var4.field2957 = field1282[Statics.field278];
            var4.field2835 = field1282[Statics.field278 + 1];
            var4.field2830 = field1282[Statics.field278 + 2];
            var4.field2831 = field1282[Statics.field278 + 3];
            client.method5068(var4);
            Statics.field359.method1494(var4);
            if (var3 != -1 && var4.field2825 == 0) {
                client.method1733(Statics.field812[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field1282[--Statics.field278] == 1;
            if (var4.field2843 != var5) {
                var4.field2843 = var5;
                client.method5068(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field2956 = field1282[--Statics.field278] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field2896 = field1282[--Statics.field278] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gs.h(ILcr;ZI)I")
    public static int method3487(int arg0, class97 arg1, boolean arg2) {
        int var3 = -1;
        class243 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field1282[--Statics.field278];
            var4 = class243.method577(var3);
        } else {
            var4 = arg2 ? Statics.field1286 : Statics.field2219;
        }
        if (arg0 == 1100) {
            Statics.field278 -= 2;
            var4.field2844 = field1282[Statics.field278];
            if (var4.field2844 > var4.field2846 - var4.field2838) {
                var4.field2844 = var4.field2846 - var4.field2838;
            }
            if (var4.field2844 < 0) {
                var4.field2844 = 0;
            }
            var4.field2845 = field1282[Statics.field278 + 1];
            if (var4.field2845 > var4.field2934 - var4.field2919) {
                var4.field2845 = var4.field2934 - var4.field2919;
            }
            if (var4.field2845 < 0) {
                var4.field2845 = 0;
            }
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field2848 = field1282[--Statics.field278];
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field2877 = field1282[--Statics.field278] == 1;
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field2849 = field1282[--Statics.field278];
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field2958 = field1282[--Statics.field278];
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field2858 = field1282[--Statics.field278];
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field2860 = field1282[--Statics.field278];
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field2861 = field1282[--Statics.field278] == 1;
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field2866 = 1;
            var4.field2867 = field1282[--Statics.field278];
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field278 -= 6;
            var4.field2872 = field1282[Statics.field278];
            var4.field2813 = field1282[Statics.field278 + 1];
            var4.field2812 = field1282[Statics.field278 + 2];
            var4.field2875 = field1282[Statics.field278 + 3];
            var4.field2945 = field1282[Statics.field278 + 4];
            var4.field2811 = field1282[Statics.field278 + 5];
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field1282[--Statics.field278];
            if (var4.field2870 != var5) {
                var4.field2870 = var5;
                var4.field2936 = 0;
                var4.field2946 = 0;
                client.method5068(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field2880 = field1282[--Statics.field278] == 1;
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field1287[--Statics.field638];
            if (!var6.equals(var4.field2883)) {
                var4.field2883 = var6;
                client.method5068(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field2882 = field1282[--Statics.field278];
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field278 -= 3;
            var4.field2886 = field1282[Statics.field278];
            var4.field2834 = field1282[Statics.field278 + 1];
            var4.field2885 = field1282[Statics.field278 + 2];
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field2931 = field1282[--Statics.field278] == 1;
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field2862 = field1282[--Statics.field278];
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field2873 = field1282[--Statics.field278];
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field2864 = field1282[--Statics.field278] == 1;
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field2865 = field1282[--Statics.field278] == 1;
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field278 -= 2;
            var4.field2846 = field1282[Statics.field278];
            var4.field2934 = field1282[Statics.field278 + 1];
            client.method5068(var4);
            if (var3 != -1 && var4.field2825 == 0) {
                client.method1733(Statics.field812[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method87(var4.field2826, var4.field2824);
            client.field1034 = var4;
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field2859 = field1282[--Statics.field278];
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field2842 = field1282[--Statics.field278];
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field2855 = field1282[--Statics.field278];
            client.method5068(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field1282[--Statics.field278];
            class330[] var8 = new class330[] { class330.field3967, class330.field3966, class330.field3969, class330.field3970, class330.field3968 };
            class330 var9 = (class330) class190.method4146(var8, var7);
            if (var9 != null) {
                var4.field2910 = var9;
                client.method5068(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var10 = field1282[--Statics.field278] == 1;
            var4.field2904 = var10;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ep.m(ILcr;ZB)I")
    public static int method2549(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method577(field1282[--Statics.field278]);
        } else {
            var3 = arg2 ? Statics.field1286 : Statics.field2219;
        }
        client.method5068(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field278 -= 2;
            int var4 = field1282[Statics.field278];
            int var5 = field1282[Statics.field278 + 1];
            var3.field2943 = var4;
            var3.field2944 = var5;
            class284 var6 = class284.method660(var4);
            var3.field2812 = var6.field3659;
            var3.field2875 = var6.field3660;
            var3.field2945 = var6.field3690;
            var3.field2872 = var6.field3662;
            var3.field2813 = var6.field3663;
            var3.field2811 = var6.field3658;
            if (arg0 == 1205) {
                var3.field2854 = 0;
            } else if (arg0 == 1212 | var6.field3664 == 1) {
                var3.field2854 = 1;
            } else {
                var3.field2854 = 2;
            }
            if (var3.field2881 > 0) {
                var3.field2811 = var3.field2811 * 32 / var3.field2881;
            } else if (var3.field2957 > 0) {
                var3.field2811 = var3.field2811 * 32 / var3.field2957;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field2866 = 2;
            var3.field2867 = field1282[--Statics.field278];
            return 1;
        } else if (arg0 == 1202) {
            var3.field2866 = 3;
            var3.field2867 = Statics.field642.field848.method4024();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jz.z(ILcr;ZB)I")
    public static int method4153(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method577(field1282[--Statics.field278]);
        } else {
            var3 = arg2 ? Statics.field1286 : Statics.field2219;
        }
        if (arg0 == 1300) {
            int var4 = field1282[--Statics.field278] - 1;
            if (var4 >= 0 && var4 <= 9) {
                var3.method4065(var4, field1287[--Statics.field638]);
                return 1;
            } else {
                Statics.field638--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field278 -= 2;
            int var5 = field1282[Statics.field278];
            int var6 = field1282[Statics.field278 + 1];
            var3.field2898 = class243.method5065(var5, var6);
            return 1;
        } else if (arg0 == 1302) {
            var3.field2901 = field1282[--Statics.field278] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var3.field2852 = field1282[--Statics.field278];
            return 1;
        } else if (arg0 == 1304) {
            var3.field2900 = field1282[--Statics.field278];
            return 1;
        } else if (arg0 == 1305) {
            var3.field2847 = field1287[--Statics.field638];
            return 1;
        } else if (arg0 == 1306) {
            var3.field2902 = field1287[--Statics.field638];
            return 1;
        } else if (arg0 == 1307) {
            var3.field2897 = null;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jt.i(ILcr;ZS)I")
    public static int method4512(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method577(field1282[--Statics.field278]);
        } else {
            var3 = arg2 ? Statics.field1286 : Statics.field2219;
        }
        String var4 = field1287[--Statics.field638];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field1282[--Statics.field278];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field1282[--Statics.field278];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field1287[--Statics.field638];
            } else {
                var7[var8] = Integer.valueOf(field1282[--Statics.field278]);
            }
        }
        int var9 = field1282[--Statics.field278];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field2863 = var7;
        } else if (arg0 == 1401) {
            var3.field2908 = var7;
        } else if (arg0 == 1402) {
            var3.field2907 = var7;
        } else if (arg0 == 1403) {
            var3.field2941 = var7;
        } else if (arg0 == 1404) {
            var3.field2895 = var7;
        } else if (arg0 == 1405) {
            var3.field2912 = var7;
        } else if (arg0 == 1406) {
            var3.field2915 = var7;
        } else if (arg0 == 1407) {
            var3.field2879 = var7;
            var3.field2924 = var5;
        } else if (arg0 == 1408) {
            var3.field2922 = var7;
        } else if (arg0 == 1409) {
            var3.field2874 = var7;
        } else if (arg0 == 1410) {
            var3.field2913 = var7;
        } else if (arg0 == 1411) {
            var3.field2906 = var7;
        } else if (arg0 == 1412) {
            var3.field2887 = var7;
        } else if (arg0 == 1414) {
            var3.field2918 = var7;
            var3.field2911 = var5;
        } else if (arg0 == 1415) {
            var3.field2920 = var7;
            var3.field2921 = var5;
        } else if (arg0 == 1416) {
            var3.field2833 = var7;
        } else if (arg0 == 1417) {
            var3.field2926 = var7;
        } else if (arg0 == 1418) {
            var3.field2925 = var7;
        } else if (arg0 == 1419) {
            var3.field2930 = var7;
        } else if (arg0 == 1420) {
            var3.field2927 = var7;
        } else if (arg0 == 1421) {
            var3.field2928 = var7;
        } else if (arg0 == 1422) {
            var3.field2929 = var7;
        } else if (arg0 == 1423) {
            var3.field2876 = var7;
        } else if (arg0 == 1424) {
            var3.field2851 = var7;
        } else if (arg0 == 1425) {
            var3.field2871 = var7;
        } else if (arg0 == 1426) {
            var3.field2948 = var7;
        } else if (arg0 == 1427) {
            var3.field2932 = var7;
        } else {
            return 2;
        }
        var3.field2892 = true;
        return 1;
    }

    @ObfuscatedName("ic.u(ILcr;ZS)I")
    public static int method4048(int arg0, class97 arg1, boolean arg2) {
        class243 var3 = arg2 ? Statics.field1286 : Statics.field2219;
        if (arg0 == 1800) {
            field1282[++Statics.field278 - 1] = class244.method4137(client.method2446(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field1282[--Statics.field278];
            int var5 = var4 - 1;
            if (var3.field2897 == null || var5 >= var3.field2897.length || var3.field2897[var5] == null) {
                field1287[++Statics.field638 - 1] = "";
            } else {
                field1287[++Statics.field638 - 1] = var3.field2897[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field2847 == null) {
                field1287[++Statics.field638 - 1] = "";
            } else {
                field1287[++Statics.field638 - 1] = var3.field2847;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fl.x(ILcr;ZI)I")
    public static int method3122(int arg0, class97 arg1, boolean arg2) {
        class243 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class243.method577(field1282[--Statics.field278]);
        } else {
            var3 = arg2 ? Statics.field1286 : Statics.field2219;
        }
        if (arg0 != 1927) {
            return 2;
        } else if (field1289 >= 10) {
            throw new RuntimeException();
        } else if (var3.field2932 == null) {
            return 0;
        } else {
            class69 var4 = new class69();
            var4.field798 = var3;
            var4.field808 = var3.field2932;
            var4.field807 = field1289 + 1;
            client.field1067.method3690(var4);
            return 1;
        }
    }

    @ObfuscatedName("ad.a(ILcr;ZI)I")
    public static int method547(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field1287[--Statics.field638];
            class96.method752(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field278 -= 2;
            client.method2834(Statics.field642, field1282[Statics.field278], field1282[Statics.field278 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            class185 var4 = class185.method267(class182.field2429, client.field958.field1485);
            client.field958.method1882(var4);
            for (class68 var5 = (class68) client.field1031.method3641(); var5 != null; var5 = (class68) client.field1031.method3640()) {
                if (var5.field789 == 0 || var5.field789 == 3) {
                    client.method757(var5, true);
                }
            }
            if (client.field1034 != null) {
                client.method5068(client.field1034);
                client.field1034 = null;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var6 = field1287[--Statics.field638];
            int var7 = 0;
            if (class319.method26(var6)) {
                int var8 = class319.method2871(var6, 10, true);
                var7 = var8;
            }
            class185 var9 = class185.method267(class182.field2411, client.field958.field1485);
            var9.field2505.method3405(var7);
            client.field958.method1882(var9);
            return 1;
        } else if (arg0 == 3105) {
            String var10 = field1287[--Statics.field638];
            class185 var11 = class185.method267(class182.field2481, client.field958.field1485);
            var11.field2505.method3189(var10.length() + 1);
            var11.field2505.method3214(var10);
            client.field958.method1882(var11);
            return 1;
        } else if (arg0 == 3106) {
            String var12 = field1287[--Statics.field638];
            class185 var13 = class185.method267(class182.field2398, client.field958.field1485);
            var13.field2505.method3189(var12.length() + 1);
            var13.field2505.method3214(var12);
            client.field958.method1882(var13);
            return 1;
        } else if (arg0 == 3107) {
            int var14 = field1282[--Statics.field278];
            String var15 = field1287[--Statics.field638];
            client.method266(var14, var15);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field278 -= 3;
            int var16 = field1282[Statics.field278];
            int var17 = field1282[Statics.field278 + 1];
            int var18 = field1282[Statics.field278 + 2];
            class243 var19 = class243.method577(var18);
            client.method228(var19, var16, var17);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field278 -= 2;
            int var20 = field1282[Statics.field278];
            int var21 = field1282[Statics.field278 + 1];
            class243 var22 = arg2 ? Statics.field1286 : Statics.field2219;
            client.method228(var22, var20, var21);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field590 = field1282[--Statics.field278] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field1282[++Statics.field278 - 1] = Statics.field1142.field1241 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1142.field1241 = field1282[--Statics.field278] == 1;
            class79.method949();
            return 1;
        } else if (arg0 == 3113) {
            String var23 = field1287[--Statics.field638];
            boolean var24 = field1282[--Statics.field278] == 1;
            if (var24) {
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                    try {
                        Desktop.getDesktop().browse(new URI(var23));
                        return 1;
                    } catch (Exception var35) {
                    }
                }
                if (class58.field668.startsWith("win")) {
                    class58.method3415(var23, 0);
                } else if (class58.field668.startsWith("mac")) {
                    class58.method1716(var23, 1, "openjs");
                } else {
                    class58.method3415(var23, 2);
                }
            } else {
                class58.method3415(var23, 3);
            }
            return 1;
        } else if (arg0 == 3115) {
            int var26 = field1282[--Statics.field278];
            class185 var27 = class185.method267(class182.field2390, client.field958.field1485);
            var27.field2505.method3190(var26);
            client.field958.method1882(var27);
            return 1;
        } else if (arg0 == 3116) {
            int var28 = field1282[--Statics.field278];
            Statics.field638 -= 2;
            String var29 = field1287[Statics.field638];
            String var30 = field1287[Statics.field638 + 1];
            if (var29.length() > 500) {
                return 1;
            } else if (var30.length() > 500) {
                return 1;
            } else {
                class185 var31 = class185.method267(class182.field2386, client.field958.field1485);
                var31.field2505.method3190(1 + class195.method451(var29) + class195.method451(var30));
                var31.field2505.method3214(var30);
                var31.field2505.method3230(var28);
                var31.field2505.method3214(var29);
                client.field958.method1882(var31);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field982 = field1282[--Statics.field278] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field1018 = field1282[--Statics.field278] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field989 = field1282[--Statics.field278] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field1282[--Statics.field278] == 1) {
                client.field1101 |= 0x1;
            } else {
                client.field1101 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field1282[--Statics.field278] == 1) {
                client.field1101 |= 0x2;
            } else {
                client.field1101 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field1282[--Statics.field278] == 1) {
                client.field1101 |= 0x4;
            } else {
                client.field1101 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field1282[--Statics.field278] == 1) {
                client.field1101 |= 0x8;
            } else {
                client.field1101 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field1101 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field975 = field1282[--Statics.field278] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field1098 = field1282[--Statics.field278] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method179(field1282[--Statics.field278] == 1);
            return 1;
        } else if (arg0 == 3128) {
            int[] var32 = field1282;
            int var33 = ++Statics.field278 - 1;
            boolean var34 = client.field1017;
            var32[var33] = var34 ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field278 -= 2;
            client.field1060 = field1282[Statics.field278];
            client.field951 = field1282[Statics.field278 + 1];
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("p.v(ILcr;ZB)I")
    public static int method177(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field278 -= 3;
            int var3 = field1282[Statics.field278];
            int var4 = field1282[Statics.field278 + 1];
            int var5 = field1282[Statics.field278 + 2];
            if (client.field1076 != 0 && var4 != 0 && client.field1106 < 50) {
                client.field1104[client.field1106] = var3;
                client.field1030[client.field1106] = var4;
                client.field1109[client.field1106] = var5;
                client.field1111[client.field1106] = null;
                client.field1110[client.field1106] = 0;
                client.field1106++;
            }
            return 1;
        } else if (arg0 == 3201) {
            int var6 = field1282[--Statics.field278];
            if (var6 == -1 && !client.field1103) {
                class230.method2916();
            } else if (var6 != -1 && client.field1027 != var6 && client.field997 != 0 && !client.field1103) {
                class230.method2958(2, Statics.field2606, var6, 0, client.field997, false);
            }
            client.field1027 = var6;
            return 1;
        } else if (arg0 == 3202) {
            Statics.field278 -= 2;
            int var7 = field1282[Statics.field278];
            int var8 = field1282[Statics.field278 + 1];
            if (client.field997 != 0 && var7 != -1) {
                class230.method3130(Statics.field2531, var7, 0, client.field997, false);
                client.field1103 = true;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bg.q(ILcr;ZI)I")
    public static int method1550(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = client.field1134[var3].method104();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = client.field1134[var4].field307;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = client.field1134[var5].field317;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = client.field1134[var6].field310;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = client.field1134[var7].field311;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = client.field1134[var8].field312;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field1282[--Statics.field278];
            int var10 = client.field1134[var9].method96();
            field1282[++Statics.field278 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field1282[--Statics.field278];
            int var12 = client.field1134[var11].method96();
            field1282[++Statics.field278 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field1282[--Statics.field278];
            int var14 = client.field1134[var13].method96();
            field1282[++Statics.field278 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field1282[--Statics.field278];
            int var16 = client.field1134[var15].method96();
            field1282[++Statics.field278 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field1282[--Statics.field278] == 1;
            if (Statics.field656 != null) {
                Statics.field656.method60(class14.field286, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field1282[--Statics.field278] == 1;
            if (Statics.field656 != null) {
                Statics.field656.method60(class14.field291, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field278 -= 2;
            boolean var19 = field1282[Statics.field278] == 1;
            boolean var20 = field1282[Statics.field278 + 1] == 1;
            if (Statics.field656 != null) {
                client.field1135.field866 = var20;
                Statics.field656.method60(client.field1135, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field1282[--Statics.field278] == 1;
            if (Statics.field656 != null) {
                Statics.field656.method60(class14.field284, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field1282[--Statics.field278] == 1;
            if (Statics.field656 != null) {
                Statics.field656.method60(class14.field289, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field1282[++Statics.field278 - 1] = Statics.field656 == null ? 0 : Statics.field656.field287.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field1282[--Statics.field278];
            class15 var24 = (class15) Statics.field656.field287.get(var23);
            field1282[++Statics.field278 - 1] = var24.field296;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field1282[--Statics.field278];
            class15 var26 = (class15) Statics.field656.field287.get(var25);
            field1287[++Statics.field638 - 1] = var26.method70();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field1282[--Statics.field278];
            class15 var28 = (class15) Statics.field656.field287.get(var27);
            field1287[++Statics.field638 - 1] = var28.method68();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field1282[--Statics.field278];
            class15 var30 = (class15) Statics.field656.field287.get(var29);
            long var31 = class197.method1005() - Statics.field835 - var30.field293;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field1287[++Statics.field638 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field1282[--Statics.field278];
            class15 var38 = (class15) Statics.field656.field287.get(var37);
            field1282[++Statics.field278 - 1] = var38.field292.field310;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field1282[--Statics.field278];
            class15 var40 = (class15) Statics.field656.field287.get(var39);
            field1282[++Statics.field278 - 1] = var40.field292.field317;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field1282[--Statics.field278];
            class15 var42 = (class15) Statics.field656.field287.get(var41);
            field1282[++Statics.field278 - 1] = var42.field292.field307;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("w.r(ILcr;ZI)I")
    public static int method46(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field278 -= 2;
            int var3 = field1282[Statics.field278];
            int var4 = field1282[Statics.field278 + 1];
            field1282[++Statics.field278 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field278 -= 2;
            int var5 = field1282[Statics.field278];
            int var6 = field1282[Statics.field278 + 1];
            field1282[++Statics.field278 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field278 -= 2;
            int var7 = field1282[Statics.field278];
            int var8 = field1282[Statics.field278 + 1];
            field1282[++Statics.field278 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field278 -= 2;
            int var9 = field1282[Statics.field278];
            int var10 = field1282[Statics.field278 + 1];
            field1282[++Statics.field278 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field278 -= 5;
            int var13 = field1282[Statics.field278];
            int var14 = field1282[Statics.field278 + 1];
            int var15 = field1282[Statics.field278 + 2];
            int var16 = field1282[Statics.field278 + 3];
            int var17 = field1282[Statics.field278 + 4];
            field1282[++Statics.field278 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field278 -= 2;
            int var18 = field1282[Statics.field278];
            int var19 = field1282[Statics.field278 + 1];
            field1282[++Statics.field278 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field278 -= 2;
            int var20 = field1282[Statics.field278];
            int var21 = field1282[Statics.field278 + 1];
            field1282[++Statics.field278 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field278 -= 2;
            int var22 = field1282[Statics.field278];
            int var23 = field1282[Statics.field278 + 1];
            field1282[++Statics.field278 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field278 -= 2;
            int var24 = field1282[Statics.field278];
            int var25 = field1282[Statics.field278 + 1];
            field1282[++Statics.field278 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field278 -= 2;
            int var26 = field1282[Statics.field278];
            int var27 = field1282[Statics.field278 + 1];
            field1282[++Statics.field278 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field278 -= 2;
            int var28 = field1282[Statics.field278];
            int var29 = field1282[Statics.field278 + 1];
            if (var28 == 0) {
                field1282[++Statics.field278 - 1] = 0;
            } else {
                field1282[++Statics.field278 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field278 -= 2;
            int var30 = field1282[Statics.field278];
            int var31 = field1282[Statics.field278 + 1];
            if (var30 == 0) {
                field1282[++Statics.field278 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field1282[++Statics.field278 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field1282[++Statics.field278 - 1] = var30;
                    break;
                case 2:
                    field1282[++Statics.field278 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field1282[++Statics.field278 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field1282[++Statics.field278 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field1282[++Statics.field278 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field278 -= 2;
            int var32 = field1282[Statics.field278];
            int var33 = field1282[Statics.field278 + 1];
            field1282[++Statics.field278 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field278 -= 2;
            int var34 = field1282[Statics.field278];
            int var35 = field1282[Statics.field278 + 1];
            field1282[++Statics.field278 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field278 -= 3;
            long var36 = (long) field1282[Statics.field278];
            long var38 = (long) field1282[Statics.field278 + 1];
            long var40 = (long) field1282[Statics.field278 + 2];
            field1282[++Statics.field278 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aw.j(ILcr;ZI)I")
    public static int method659(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field1287[--Statics.field638];
            int var4 = field1282[--Statics.field278];
            field1287[++Statics.field638 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field638 -= 2;
            String var5 = field1287[Statics.field638];
            String var6 = field1287[Statics.field638 + 1];
            field1287[++Statics.field638 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field1287[--Statics.field638];
            int var8 = field1282[--Statics.field278];
            field1287[++Statics.field638 - 1] = var7 + class319.method18(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field1287[--Statics.field638];
            field1287[++Statics.field638 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field1282[--Statics.field278];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field1285.setTime(new Date(var11));
            int var13 = field1285.get(5);
            int var14 = field1285.get(2);
            int var15 = field1285.get(1);
            field1287[++Statics.field638 - 1] = var13 + "-" + field1292[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field638 -= 2;
            String var16 = field1287[Statics.field638];
            String var17 = field1287[Statics.field638 + 1];
            if (Statics.field642.field848 != null && Statics.field642.field848.field2791) {
                field1287[++Statics.field638 - 1] = var17;
            } else {
                field1287[++Statics.field638 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field1282[--Statics.field278];
            field1287[++Statics.field638 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field638 -= 2;
            int[] var19 = field1282;
            int var20 = ++Statics.field278 - 1;
            String var21 = field1287[Statics.field638];
            String var22 = field1287[Statics.field638 + 1];
            int var23 = client.field980;
            int var24 = var21.length();
            int var25 = var22.length();
            int var26 = 0;
            int var27 = 0;
            byte var28 = 0;
            byte var29 = 0;
            int var38;
            label255: while (true) {
                if (var26 - var28 >= var24 && var27 - var29 >= var25) {
                    int var30 = Math.min(var24, var25);
                    for (int var31 = 0; var31 < var30; var31++) {
                        char var34 = var21.charAt(var31);
                        char var35 = var22.charAt(var31);
                        if (var34 != var35 && Character.toUpperCase(var34) != Character.toUpperCase(var35)) {
                            char var36 = Character.toLowerCase(var34);
                            char var37 = Character.toLowerCase(var35);
                            if (var36 != var37) {
                                var38 = class186.method72(var36, var23) - class186.method72(var37, var23);
                                break label255;
                            }
                        }
                    }
                    int var39 = var24 - var25;
                    if (var39 == 0) {
                        for (int var40 = 0; var40 < var30; var40++) {
                            char var41 = var21.charAt(var40);
                            char var42 = var22.charAt(var40);
                            if (var41 != var42) {
                                var38 = class186.method72(var41, var23) - class186.method72(var42, var23);
                                break label255;
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
                    var43 = (char) var28;
                    boolean var44 = false;
                }
                char var45;
                if (var29 == 0) {
                    var45 = var22.charAt(var27++);
                } else {
                    var45 = (char) var29;
                    boolean var46 = false;
                }
                byte var47;
                if (var43 == 198) {
                    var47 = 69;
                } else if (var43 == 230) {
                    var47 = 101;
                } else if (var43 == 223) {
                    var47 = 115;
                } else if (var43 == 338) {
                    var47 = 69;
                } else if (var43 == 339) {
                    var47 = 101;
                } else {
                    var47 = 0;
                }
                var28 = var47;
                byte var48;
                if (var45 == 198) {
                    var48 = 69;
                } else if (var45 == 230) {
                    var48 = 101;
                } else if (var45 == 223) {
                    var48 = 115;
                } else if (var45 == 338) {
                    var48 = 69;
                } else if (var45 == 339) {
                    var48 = 101;
                } else {
                    var48 = 0;
                }
                var29 = var48;
                char var49 = class186.method3131(var43, var23);
                char var50 = class186.method3131(var45, var23);
                if (var49 != var50 && Character.toUpperCase(var49) != Character.toUpperCase(var50)) {
                    char var51 = Character.toLowerCase(var49);
                    char var52 = Character.toLowerCase(var50);
                    if (var51 != var52) {
                        var38 = class186.method72(var51, var23) - class186.method72(var52, var23);
                        break;
                    }
                }
            }
            var19[var20] = class319.method4135(var38);
            return 1;
        } else if (arg0 == 4108) {
            String var53 = field1287[--Statics.field638];
            Statics.field278 -= 2;
            int var54 = field1282[Statics.field278];
            int var55 = field1282[Statics.field278 + 1];
            byte[] var56 = Statics.field640.method4241(var55, 0);
            class312 var57 = new class312(var56);
            field1282[++Statics.field278 - 1] = var57.method5086(var53, var54);
            return 1;
        } else if (arg0 == 4109) {
            String var58 = field1287[--Statics.field638];
            Statics.field278 -= 2;
            int var59 = field1282[Statics.field278];
            int var60 = field1282[Statics.field278 + 1];
            byte[] var61 = Statics.field640.method4241(var60, 0);
            class312 var62 = new class312(var61);
            field1282[++Statics.field278 - 1] = var62.method5085(var58, var59);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field638 -= 2;
            String var63 = field1287[Statics.field638];
            String var64 = field1287[Statics.field638 + 1];
            if (field1282[--Statics.field278] == 1) {
                field1287[++Statics.field638 - 1] = var63;
            } else {
                field1287[++Statics.field638 - 1] = var64;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var65 = field1287[--Statics.field638];
            field1287[++Statics.field638 - 1] = class313.method5087(var65);
            return 1;
        } else if (arg0 == 4112) {
            String var66 = field1287[--Statics.field638];
            int var67 = field1282[--Statics.field278];
            field1287[++Statics.field638 - 1] = var66 + (char) var67;
            return 1;
        } else if (arg0 == 4113) {
            int var68 = field1282[--Statics.field278];
            int[] var69 = field1282;
            int var70 = ++Statics.field278 - 1;
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
            int var73 = field1282[--Statics.field278];
            int[] var74 = field1282;
            int var75 = ++Statics.field278 - 1;
            char var76 = (char) var73;
            boolean var77 = var76 >= '0' && var76 <= '9' || var76 >= 'A' && var76 <= 'Z' || var76 >= 'a' && var76 <= 'z';
            var74[var75] = var77 ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var78 = field1282[--Statics.field278];
            int[] var79 = field1282;
            int var80 = ++Statics.field278 - 1;
            char var81 = (char) var78;
            boolean var82 = var81 >= 'A' && var81 <= 'Z' || var81 >= 'a' && var81 <= 'z';
            var79[var80] = var82 ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var83 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = class319.method998((char) var83) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var84 = field1287[--Statics.field638];
            if (var84 == null) {
                field1282[++Statics.field278 - 1] = 0;
            } else {
                field1282[++Statics.field278 - 1] = var84.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var85 = field1287[--Statics.field638];
            Statics.field278 -= 2;
            int var86 = field1282[Statics.field278];
            int var87 = field1282[Statics.field278 + 1];
            field1287[++Statics.field638 - 1] = var85.substring(var86, var87);
            return 1;
        } else if (arg0 == 4119) {
            String var88 = field1287[--Statics.field638];
            StringBuilder var89 = new StringBuilder(var88.length());
            boolean var90 = false;
            for (int var91 = 0; var91 < var88.length(); var91++) {
                char var92 = var88.charAt(var91);
                if (var92 == '<') {
                    var90 = true;
                } else if (var92 == '>') {
                    var90 = false;
                } else if (!var90) {
                    var89.append(var92);
                }
            }
            field1287[++Statics.field638 - 1] = var89.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var93 = field1287[--Statics.field638];
            int var94 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = var93.indexOf(var94);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field638 -= 2;
            String var95 = field1287[Statics.field638];
            String var96 = field1287[Statics.field638 + 1];
            int var97 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = var95.indexOf(var96, var97);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("z.b(ILcr;ZB)I")
    public static int method16(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field1282[--Statics.field278];
            field1287[++Statics.field638 - 1] = class284.method660(var3).field3674;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field278 -= 2;
            int var4 = field1282[Statics.field278];
            int var5 = field1282[Statics.field278 + 1];
            class284 var6 = class284.method660(var4);
            if (var5 < 1 || var5 > 5 || var6.field3667[var5 - 1] == null) {
                field1287[++Statics.field638 - 1] = "";
            } else {
                field1287[++Statics.field638 - 1] = var6.field3667[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field278 -= 2;
            int var7 = field1282[Statics.field278];
            int var8 = field1282[Statics.field278 + 1];
            class284 var9 = class284.method660(var7);
            if (var8 < 1 || var8 > 5 || var9.field3668[var8 - 1] == null) {
                field1287[++Statics.field638 - 1] = "";
            } else {
                field1287[++Statics.field638 - 1] = var9.field3668[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = class284.method660(var10).field3665;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = class284.method660(var11).field3664 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field1282[--Statics.field278];
            class284 var13 = class284.method660(var12);
            if (var13.field3685 == -1 && var13.field3684 >= 0) {
                field1282[++Statics.field278 - 1] = var13.field3684;
            } else {
                field1282[++Statics.field278 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field1282[--Statics.field278];
            class284 var15 = class284.method660(var14);
            if (var15.field3685 >= 0 && var15.field3684 >= 0) {
                field1282[++Statics.field278 - 1] = var15.field3684;
            } else {
                field1282[++Statics.field278 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = class284.method660(var16).field3661 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field1282[--Statics.field278];
            class284 var18 = class284.method660(var17);
            if (var18.field3648 == -1 && var18.field3696 >= 0) {
                field1282[++Statics.field278 - 1] = var18.field3696;
            } else {
                field1282[++Statics.field278 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field1282[--Statics.field278];
            class284 var20 = class284.method660(var19);
            if (var20.field3648 >= 0 && var20.field3696 >= 0) {
                field1282[++Statics.field278 - 1] = var20.field3696;
            } else {
                field1282[++Statics.field278 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field1287[--Statics.field638];
            int var22 = field1282[--Statics.field278];
            client.method61(var21, var22 == 1);
            field1282[++Statics.field278 - 1] = Statics.field738;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1249 == null || Statics.field1288 >= Statics.field738) {
                field1282[++Statics.field278 - 1] = -1;
            } else {
                field1282[++Statics.field278 - 1] = Statics.field1249[++Statics.field1288 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field1288 = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("v.g(ILcr;ZI)I")
    public static int method99(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 5306) {
            int[] var3 = field1282;
            int var4 = ++Statics.field278 - 1;
            int var5 = client.field1025 ? 2 : 1;
            var3[var4] = var5;
            return 1;
        } else if (arg0 == 5307) {
            int var6 = field1282[--Statics.field278];
            if (var6 == 1 || var6 == 2) {
                client.method719(var6);
            }
            return 1;
        } else if (arg0 == 5308) {
            field1282[++Statics.field278 - 1] = Statics.field1142.field1245;
            return 1;
        } else if (arg0 == 5309) {
            int var7 = field1282[--Statics.field278];
            if (var7 == 1 || var7 == 2) {
                Statics.field1142.field1245 = var7;
                class79.method949();
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dn.f(ILcr;ZI)I")
    public static int method2445(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field278 -= 2;
            int var3 = field1282[Statics.field278];
            int var4 = field1282[Statics.field278 + 1];
            if (!client.field1112) {
                client.field939 = var3;
                client.field1044 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field1282[++Statics.field278 - 1] = client.field939;
            return 1;
        } else if (arg0 == 5506) {
            field1282[++Statics.field278 - 1] = client.field1044;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field1282[--Statics.field278];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field946 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field1282[++Statics.field278 - 1] = client.field946;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bw.p(ILcr;ZI)I")
    public static int method1122(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field916 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("f.e(ILcr;ZB)I")
    public static int method162(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field1282[++Statics.field278 - 1] = class78.method4132() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class78.field1229 = 0;
            class78 var3;
            if (class78.field1229 < class78.field1228) {
                var3 = Statics.field1227[++class78.field1229 - 1];
            } else {
                var3 = null;
            }
            if (var3 == null) {
                field1282[++Statics.field278 - 1] = -1;
                field1282[++Statics.field278 - 1] = 0;
                field1287[++Statics.field638 - 1] = "";
                field1282[++Statics.field278 - 1] = 0;
                field1282[++Statics.field278 - 1] = 0;
                field1287[++Statics.field638 - 1] = "";
            } else {
                field1282[++Statics.field278 - 1] = var3.field1236;
                field1282[++Statics.field278 - 1] = var3.field1234;
                field1287[++Statics.field638 - 1] = var3.field1239;
                field1282[++Statics.field278 - 1] = var3.field1224;
                field1282[++Statics.field278 - 1] = var3.field1233;
                field1287[++Statics.field638 - 1] = var3.field1235;
            }
            return 1;
        } else if (arg0 == 6502) {
            class78 var6;
            if (class78.field1229 < class78.field1228) {
                var6 = Statics.field1227[++class78.field1229 - 1];
            } else {
                var6 = null;
            }
            if (var6 == null) {
                field1282[++Statics.field278 - 1] = -1;
                field1282[++Statics.field278 - 1] = 0;
                field1287[++Statics.field638 - 1] = "";
                field1282[++Statics.field278 - 1] = 0;
                field1282[++Statics.field278 - 1] = 0;
                field1287[++Statics.field638 - 1] = "";
            } else {
                field1282[++Statics.field278 - 1] = var6.field1236;
                field1282[++Statics.field278 - 1] = var6.field1234;
                field1287[++Statics.field638 - 1] = var6.field1239;
                field1282[++Statics.field278 - 1] = var6.field1224;
                field1282[++Statics.field278 - 1] = var6.field1233;
                field1287[++Statics.field638 - 1] = var6.field1235;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var8 = field1282[--Statics.field278];
            class78 var9 = null;
            for (int var10 = 0; var10 < class78.field1228; var10++) {
                if (Statics.field1227[var10].field1236 == var8) {
                    var9 = Statics.field1227[var10];
                    break;
                }
            }
            if (var9 == null) {
                field1282[++Statics.field278 - 1] = -1;
                field1282[++Statics.field278 - 1] = 0;
                field1287[++Statics.field638 - 1] = "";
                field1282[++Statics.field278 - 1] = 0;
                field1282[++Statics.field278 - 1] = 0;
                field1287[++Statics.field638 - 1] = "";
            } else {
                field1282[++Statics.field278 - 1] = var9.field1236;
                field1282[++Statics.field278 - 1] = var9.field1234;
                field1287[++Statics.field638 - 1] = var9.field1239;
                field1282[++Statics.field278 - 1] = var9.field1224;
                field1282[++Statics.field278 - 1] = var9.field1233;
                field1287[++Statics.field638 - 1] = var9.field1235;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field278 -= 4;
            int var11 = field1282[Statics.field278];
            boolean var12 = field1282[Statics.field278 + 1] == 1;
            int var13 = field1282[Statics.field278 + 2];
            boolean var14 = field1282[Statics.field278 + 3] == 1;
            class78.method176(var11, var12, var13, var14);
            return 1;
        } else if (arg0 == 6511) {
            int var15 = field1282[--Statics.field278];
            if (var15 >= 0 && var15 < class78.field1228) {
                class78 var16 = Statics.field1227[var15];
                field1282[++Statics.field278 - 1] = var16.field1236;
                field1282[++Statics.field278 - 1] = var16.field1234;
                field1287[++Statics.field638 - 1] = var16.field1239;
                field1282[++Statics.field278 - 1] = var16.field1224;
                field1282[++Statics.field278 - 1] = var16.field1233;
                field1287[++Statics.field638 - 1] = var16.field1235;
            } else {
                field1282[++Statics.field278 - 1] = -1;
                field1282[++Statics.field278 - 1] = 0;
                field1287[++Statics.field638 - 1] = "";
                field1282[++Statics.field278 - 1] = 0;
                field1282[++Statics.field278 - 1] = 0;
                field1287[++Statics.field638 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field1015 = field1282[--Statics.field278] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field278 -= 2;
            int var17 = field1282[Statics.field278];
            int var18 = field1282[Statics.field278 + 1];
            class279 var19 = class279.method4491(var18);
            if (var19.method4530()) {
                field1287[++Statics.field638 - 1] = class286.method3973(var17).method4737(var18, var19.field3550);
            } else {
                field1282[++Statics.field278 - 1] = class286.method3973(var17).method4736(var18, var19.field3546);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field278 -= 2;
            int var20 = field1282[Statics.field278];
            int var21 = field1282[Statics.field278 + 1];
            class279 var22 = class279.method4491(var21);
            if (var22.method4530()) {
                field1287[++Statics.field638 - 1] = class283.method713(var20).method4622(var21, var22.field3550);
            } else {
                field1282[++Statics.field278 - 1] = class283.method713(var20).method4617(var21, var22.field3546);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field278 -= 2;
            int var23 = field1282[Statics.field278];
            int var24 = field1282[Statics.field278 + 1];
            class279 var25 = class279.method4491(var24);
            if (var25.method4530()) {
                field1287[++Statics.field638 - 1] = class284.method660(var23).method4683(var24, var25.field3550);
            } else {
                field1282[++Statics.field278 - 1] = class284.method660(var23).method4682(var24, var25.field3546);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field278 -= 2;
            int var26 = field1282[Statics.field278];
            int var27 = field1282[Statics.field278 + 1];
            class279 var28 = class279.method4491(var27);
            if (var28.method4530()) {
                field1287[++Statics.field638 - 1] = class280.method3786(var26).method4546(var27, var28.field3550);
            } else {
                int[] var29 = field1282;
                int var30 = ++Statics.field278 - 1;
                class280 var31 = (class280) class280.field3554.method3601((long) var26);
                class280 var32;
                if (var31 == null) {
                    byte[] var33 = Statics.field3553.method4241(34, var26);
                    class280 var34 = new class280();
                    if (var33 != null) {
                        var34.method4551(new class195(var33));
                    }
                    var34.method4539();
                    class280.field3554.method3603(var34, (long) var26);
                    var32 = var34;
                } else {
                    var32 = var31;
                }
                var29[var30] = var32.method4538(var27, var28.field3546);
            }
            return 1;
        } else if (arg0 == 6518) {
            field1282[++Statics.field278 - 1] = client.field879 ? 1 : 0;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field638--;
            Statics.field278--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field638--;
            Statics.field278--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("k.c(ILcr;ZI)I")
    public static int method1(int arg0, class97 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field270;
            int var4 = (Statics.field642.field1211 >> 7) + Statics.field2048;
            int var5 = (Statics.field642.field1188 >> 7) + Statics.field360;
            client.method1736().method5579(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field1282[--Statics.field278];
            String var7 = "";
            class33 var8 = client.method1736().method5597(var6);
            if (var8 != null) {
                var7 = var8.method289();
            }
            field1287[++Statics.field638 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field1282[--Statics.field278];
            client.method1736().method5580(var9);
            return 1;
        } else if (arg0 == 6603) {
            field1282[++Statics.field278 - 1] = client.method1736().method5594();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field1282[--Statics.field278];
            client.method1736().method5591(var10);
            return 1;
        } else if (arg0 == 6605) {
            field1282[++Statics.field278 - 1] = client.method1736().method5596() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class239 var11 = new class239(field1282[--Statics.field278]);
            client.method1736().method5598(var11.field2787, var11.field2785);
            return 1;
        } else if (arg0 == 6607) {
            class239 var12 = new class239(field1282[--Statics.field278]);
            client.method1736().method5599(var12.field2787, var12.field2785);
            return 1;
        } else if (arg0 == 6608) {
            class239 var13 = new class239(field1282[--Statics.field278]);
            client.method1736().method5590(var13.field2784, var13.field2787, var13.field2785);
            return 1;
        } else if (arg0 == 6609) {
            class239 var14 = new class239(field1282[--Statics.field278]);
            client.method1736().method5601(var14.field2784, var14.field2787, var14.field2785);
            return 1;
        } else if (arg0 == 6610) {
            field1282[++Statics.field278 - 1] = client.method1736().method5608();
            field1282[++Statics.field278 - 1] = client.method1736().method5603();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field1282[--Statics.field278];
            class33 var16 = client.method1736().method5597(var15);
            if (var16 == null) {
                field1282[++Statics.field278 - 1] = 0;
            } else {
                field1282[++Statics.field278 - 1] = var16.method299().method3997();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field1282[--Statics.field278];
            class33 var18 = client.method1736().method5597(var17);
            if (var18 == null) {
                field1282[++Statics.field278 - 1] = 0;
                field1282[++Statics.field278 - 1] = 0;
            } else {
                field1282[++Statics.field278 - 1] = (var18.method322() - var18.method350() + 1) * 64;
                field1282[++Statics.field278 - 1] = (var18.method293() - var18.method294() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field1282[--Statics.field278];
            class33 var20 = client.method1736().method5597(var19);
            if (var20 == null) {
                field1282[++Statics.field278 - 1] = 0;
                field1282[++Statics.field278 - 1] = 0;
                field1282[++Statics.field278 - 1] = 0;
                field1282[++Statics.field278 - 1] = 0;
            } else {
                field1282[++Statics.field278 - 1] = var20.method350() * 64;
                field1282[++Statics.field278 - 1] = var20.method294() * 64;
                field1282[++Statics.field278 - 1] = var20.method322() * 64 + 64 - 1;
                field1282[++Statics.field278 - 1] = var20.method293() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field1282[--Statics.field278];
            class33 var22 = client.method1736().method5597(var21);
            if (var22 == null) {
                field1282[++Statics.field278 - 1] = -1;
            } else {
                field1282[++Statics.field278 - 1] = var22.method300();
            }
            return 1;
        } else if (arg0 == 6615) {
            class239 var23 = client.method1736().method5604();
            if (var23 == null) {
                field1282[++Statics.field278 - 1] = -1;
                field1282[++Statics.field278 - 1] = -1;
            } else {
                field1282[++Statics.field278 - 1] = var23.field2787;
                field1282[++Statics.field278 - 1] = var23.field2785;
            }
            return 1;
        } else if (arg0 == 6616) {
            field1282[++Statics.field278 - 1] = client.method1736().method5581();
            return 1;
        } else if (arg0 == 6617) {
            class239 var24 = new class239(field1282[--Statics.field278]);
            class33 var25 = client.method1736().method5582();
            if (var25 == null) {
                field1282[++Statics.field278 - 1] = -1;
                field1282[++Statics.field278 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method283(var24.field2784, var24.field2787, var24.field2785);
            if (var26 == null) {
                field1282[++Statics.field278 - 1] = -1;
                field1282[++Statics.field278 - 1] = -1;
            } else {
                field1282[++Statics.field278 - 1] = var26[0];
                field1282[++Statics.field278 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class239 var27 = new class239(field1282[--Statics.field278]);
            class33 var28 = client.method1736().method5582();
            if (var28 == null) {
                field1282[++Statics.field278 - 1] = -1;
                field1282[++Statics.field278 - 1] = -1;
                return 1;
            }
            class239 var29 = var28.method284(var27.field2787, var27.field2785);
            if (var29 == null) {
                field1282[++Statics.field278 - 1] = -1;
            } else {
                field1282[++Statics.field278 - 1] = var29.method3997();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field278 -= 2;
            int var30 = field1282[Statics.field278];
            class239 var31 = new class239(field1282[Statics.field278 + 1]);
            method272(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field278 -= 2;
            int var32 = field1282[Statics.field278];
            class239 var33 = new class239(field1282[Statics.field278 + 1]);
            method272(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field278 -= 2;
            int var34 = field1282[Statics.field278];
            class239 var35 = new class239(field1282[Statics.field278 + 1]);
            class33 var36 = client.method1736().method5597(var34);
            if (var36 == null) {
                field1282[++Statics.field278 - 1] = 0;
                return 1;
            } else {
                field1282[++Statics.field278 - 1] = var36.method281(var35.field2784, var35.field2787, var35.field2785) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field1282[++Statics.field278 - 1] = client.method1736().method5605();
            field1282[++Statics.field278 - 1] = client.method1736().method5606();
            return 1;
        } else if (arg0 == 6623) {
            class239 var37 = new class239(field1282[--Statics.field278]);
            class33 var38 = client.method1736().method5622(var37.field2784, var37.field2787, var37.field2785);
            if (var38 == null) {
                field1282[++Statics.field278 - 1] = -1;
            } else {
                field1282[++Statics.field278 - 1] = var38.method286();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method1736().method5679(field1282[--Statics.field278]);
            return 1;
        } else if (arg0 == 6625) {
            client.method1736().method5718();
            return 1;
        } else if (arg0 == 6626) {
            client.method1736().method5609(field1282[--Statics.field278]);
            return 1;
        } else if (arg0 == 6627) {
            client.method1736().method5702();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field1282[--Statics.field278] == 1;
            client.method1736().method5667(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field1282[--Statics.field278];
            client.method1736().method5612(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field1282[--Statics.field278];
            client.method1736().method5695(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method1736().method5721();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field1282[--Statics.field278] == 1;
            client.method1736().method5615(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field278 -= 2;
            int var43 = field1282[Statics.field278];
            boolean var44 = field1282[Statics.field278 + 1] == 1;
            client.method1736().method5616(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field278 -= 2;
            int var45 = field1282[Statics.field278];
            boolean var46 = field1282[Statics.field278 + 1] == 1;
            client.method1736().method5617(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field1282[++Statics.field278 - 1] = client.method1736().method5635() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = client.method1736().method5619(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field1282[--Statics.field278];
            field1282[++Statics.field278 - 1] = client.method1736().method5620(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field278 -= 2;
            int var49 = field1282[Statics.field278];
            class239 var50 = new class239(field1282[Statics.field278 + 1]);
            class239 var51 = client.method1736().method5623(var49, var50);
            if (var51 == null) {
                field1282[++Statics.field278 - 1] = -1;
            } else {
                field1282[++Statics.field278 - 1] = var51.method3997();
            }
            return 1;
        } else if (arg0 == 6639) {
            class41 var52 = client.method1736().method5625();
            if (var52 == null) {
                field1282[++Statics.field278 - 1] = -1;
                field1282[++Statics.field278 - 1] = -1;
            } else {
                field1282[++Statics.field278 - 1] = var52.field524;
                field1282[++Statics.field278 - 1] = var52.field533.method3997();
            }
            return 1;
        } else if (arg0 == 6640) {
            class41 var53 = client.method1736().method5626();
            if (var53 == null) {
                field1282[++Statics.field278 - 1] = -1;
                field1282[++Statics.field278 - 1] = -1;
            } else {
                field1282[++Statics.field278 - 1] = var53.field524;
                field1282[++Statics.field278 - 1] = var53.field533.method3997();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field1282[--Statics.field278];
            class270 var55 = Statics.field3455[var54];
            if (var55.field3458 == null) {
                field1287[++Statics.field638 - 1] = "";
            } else {
                field1287[++Statics.field638 - 1] = var55.field3458;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field1282[--Statics.field278];
            class270 var57 = Statics.field3455[var56];
            field1282[++Statics.field278 - 1] = var57.field3459;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field1282[--Statics.field278];
            class270 var59 = Statics.field3455[var58];
            if (var59 == null) {
                field1282[++Statics.field278 - 1] = -1;
            } else {
                field1282[++Statics.field278 - 1] = var59.field3474;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field1282[--Statics.field278];
            class270 var61 = Statics.field3455[var60];
            if (var61 == null) {
                field1282[++Statics.field278 - 1] = -1;
            } else {
                field1282[++Statics.field278 - 1] = var61.field3466;
            }
            return 1;
        } else if (arg0 == 6697) {
            field1282[++Statics.field278 - 1] = Statics.field340.field596;
            return 1;
        } else if (arg0 == 6698) {
            field1282[++Statics.field278 - 1] = Statics.field340.field591.method3997();
            return 1;
        } else if (arg0 == 6699) {
            field1282[++Statics.field278 - 1] = Statics.field340.field592.method3997();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("b.ag(II)V")
    public static void method158(int arg0) {
        if (arg0 == -1 || !class243.method3175(arg0)) {
            return;
        }
        class243[] var1 = Statics.field812[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class243 var3 = var1[var2];
            if (var3.field2935 != null) {
                class69 var4 = new class69();
                var4.field798 = var3;
                var4.field808 = var3.field2935;
                method4437(var4, 5000000);
            }
        }
    }

    @ObfuscatedName("al.at(ILix;ZI)V")
    public static void method272(int arg0, class239 arg1, boolean arg2) {
        class33 var3 = client.method1736().method5597(arg0);
        int var4 = Statics.field642.field857;
        int var5 = (Statics.field642.field1211 >> 7) + Statics.field2048;
        int var6 = (Statics.field642.field1188 >> 7) + Statics.field360;
        class239 var7 = new class239(var4, var5, var6);
        client.method1736().method5585(var3, var7, arg1, arg2);
    }
}
