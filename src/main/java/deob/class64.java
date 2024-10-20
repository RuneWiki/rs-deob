package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("bs")
public class class64 {

    @ObfuscatedName("bs.q")
    public static int[] field833 = new int[5];

    @ObfuscatedName("bs.i")
    public static int[][] field822 = new int[5][5000];

    @ObfuscatedName("bs.k")
    public static int[] field829 = new int[1000];

    @ObfuscatedName("bs.n")
    public static String[] field824 = new String[1000];

    @ObfuscatedName("bs.a")
    public static int field823 = 0;

    @ObfuscatedName("bs.m")
    public static class57[] field830 = new class57[50];

    @ObfuscatedName("bs.p")
    public static Calendar field828 = Calendar.getInstance();

    @ObfuscatedName("bs.e")
    public static final String[] field826 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bs.x")
    public static boolean field821 = false;

    @ObfuscatedName("bs.f")
    public static boolean field817 = false;

    @ObfuscatedName("bs.t")
    public static ArrayList field832 = new ArrayList();

    @ObfuscatedName("bs.j")
    public static int field831 = 0;

    @ObfuscatedName("bs.av")
    public static final double field825 = Math.log(2.0D);

    public class64() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ha.s(Lco;S)V")
    public static void method4069(class81 arg0) {
        Statics.method1756(arg0, 500000, 475000);
    }

    @ObfuscatedName("hn.v(ILbz;ZI)I")
    public static int method4071(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field4306 -= 3;
            int var3 = field829[Statics.field4306];
            int var4 = field829[Statics.field4306 + 1];
            int var5 = field829[Statics.field4306 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class295 var6 = class295.method3238(var3);
            if (var6.field3398 == null) {
                var6.field3398 = new class295[var5 + 1];
            }
            if (var6.field3398.length <= var5) {
                class295[] var7 = new class295[var5 + 1];
                for (int var8 = 0; var8 < var6.field3398.length; var8++) {
                    var7[var8] = var6.field3398[var8];
                }
                var6.field3398 = var7;
            }
            if (var5 > 0 && var6.field3398[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class295 var9 = new class295();
            var9.field3360 = var4;
            var9.field3377 = var9.field3358 = var6.field3358;
            var9.field3359 = var5;
            var9.field3389 = true;
            var6.field3398[var5] = var9;
            if (arg2) {
                Statics.field317 = var9;
            } else {
                Statics.field4320 = var9;
            }
            client.method2620(var6);
            return 1;
        } else if (arg0 == 101) {
            class295 var10 = arg2 ? Statics.field317 : Statics.field4320;
            class295 var11 = class295.method3238(var10.field3358);
            var11.field3398[var10.field3359] = null;
            client.method2620(var11);
            return 1;
        } else if (arg0 == 102) {
            class295 var12 = class295.method3238(field829[--Statics.field4306]);
            var12.field3398 = null;
            client.method2620(var12);
            return 1;
        } else if (arg0 == 103) {
            Statics.field4306 -= 3;
            return 1;
        } else if (arg0 == 104) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 200) {
            Statics.field4306 -= 2;
            int var13 = field829[Statics.field4306];
            int var14 = field829[Statics.field4306 + 1];
            class295 var15 = class295.method2636(var13, var14);
            if (var15 == null || var14 == -1) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = 1;
                if (arg2) {
                    Statics.field317 = var15;
                } else {
                    Statics.field4320 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class295 var16 = class295.method3238(field829[--Statics.field4306]);
            if (var16 == null) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = 1;
                if (arg2) {
                    Statics.field317 = var16;
                } else {
                    Statics.field4320 = var16;
                }
            }
            return 1;
        } else if (arg0 == 202) {
            field829[Statics.field4306 + 1] = 0;
            return 1;
        } else if (arg0 == 203) {
            field829[--Statics.field4306 + 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ku.c(ILbz;ZI)I")
    public static int method4925(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class295 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field829[--Statics.field4306];
            var4 = class295.method3238(var3);
        } else {
            var4 = arg2 ? Statics.field317 : Statics.field4320;
        }
        if (arg0 == 1000) {
            Statics.field4306 -= 4;
            var4.field3367 = field829[Statics.field4306];
            var4.field3426 = field829[Statics.field4306 + 1];
            var4.field3392 = field829[Statics.field4306 + 2];
            var4.field3364 = field829[Statics.field4306 + 3];
            client.method2620(var4);
            Statics.field3295.method1031(var4);
            if (var3 != -1 && var4.field3360 == 0) {
                client.method3148(Statics.field4250[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field4306 -= 4;
            var4.field3369 = field829[Statics.field4306];
            var4.field3407 = field829[Statics.field4306 + 1];
            var4.field3463 = field829[Statics.field4306 + 2];
            var4.field3366 = field829[Statics.field4306 + 3];
            client.method2620(var4);
            Statics.field3295.method1031(var4);
            if (var3 != -1 && var4.field3360 == 0) {
                client.method3148(Statics.field4250[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field829[--Statics.field4306] == 1;
            if (var4.field3378 != var5) {
                var4.field3378 = var5;
                client.method2620(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3508 = field829[--Statics.field4306] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3509 = field829[--Statics.field4306] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bw.q(ILbz;ZI)I")
    public static int method1005(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class295 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field829[--Statics.field4306];
            var4 = class295.method3238(var3);
        } else {
            var4 = arg2 ? Statics.field317 : Statics.field4320;
        }
        if (arg0 == 1100) {
            Statics.field4306 -= 2;
            var4.field3379 = field829[Statics.field4306];
            if (var4.field3379 > var4.field3381 - var4.field3373) {
                var4.field3379 = var4.field3381 - var4.field3373;
            }
            if (var4.field3379 < 0) {
                var4.field3379 = 0;
            }
            var4.field3380 = field829[Statics.field4306 + 1];
            if (var4.field3380 > var4.field3382 - var4.field3427) {
                var4.field3380 = var4.field3382 - var4.field3427;
            }
            if (var4.field3380 < 0) {
                var4.field3380 = 0;
            }
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field3383 = field829[--Statics.field4306];
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3387 = field829[--Statics.field4306] == 1;
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3428 = field829[--Statics.field4306];
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3391 = field829[--Statics.field4306];
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3393 = field829[--Statics.field4306];
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3396 = field829[--Statics.field4306];
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3397 = field829[--Statics.field4306] == 1;
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3424 = 1;
            var4.field3403 = field829[--Statics.field4306];
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field4306 -= 6;
            var4.field3408 = field829[Statics.field4306];
            var4.field3409 = field829[Statics.field4306 + 1];
            var4.field3410 = field829[Statics.field4306 + 2];
            var4.field3472 = field829[Statics.field4306 + 3];
            var4.field3412 = field829[Statics.field4306 + 4];
            var4.field3465 = field829[Statics.field4306 + 5];
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field829[--Statics.field4306];
            if (var4.field3402 != var5) {
                var4.field3402 = var5;
                var4.field3435 = 0;
                var4.field3497 = 0;
                client.method2620(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3416 = field829[--Statics.field4306] == 1;
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field824[--Statics.field1369];
            if (!var6.equals(var4.field3461)) {
                var4.field3461 = var6;
                client.method2620(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3419 = field829[--Statics.field4306];
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field4306 -= 3;
            var4.field3423 = field829[Statics.field4306];
            var4.field3444 = field829[Statics.field4306 + 1];
            var4.field3422 = field829[Statics.field4306 + 2];
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3484 = field829[--Statics.field4306] == 1;
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3386 = field829[--Statics.field4306];
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3399 = field829[--Statics.field4306];
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3400 = field829[--Statics.field4306] == 1;
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3401 = field829[--Statics.field4306] == 1;
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field4306 -= 2;
            var4.field3381 = field829[Statics.field4306];
            var4.field3382 = field829[Statics.field4306 + 1];
            client.method2620(var4);
            if (var3 != -1 && var4.field3360 == 0) {
                client.method3148(Statics.field4250[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method1290(var4.field3358, var4.field3359);
            client.field611 = var4;
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3462 = field829[--Statics.field4306];
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3384 = field829[--Statics.field4306];
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3390 = field829[--Statics.field4306];
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field829[--Statics.field4306];
            class455 var8 = (class455) class330.method525(class455.method5126(), var7);
            if (var8 != null) {
                var4.field3496 = var8;
                client.method2620(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field829[--Statics.field4306] == 1;
            var4.field3451 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field829[--Statics.field4306] == 1;
            var4.field3490 = var10;
            return 1;
        } else if (arg0 == 1128) {
            Statics.field4306 -= 2;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3374 = field824[--Statics.field1369];
            client.method2620(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method4979(field824[--Statics.field1369], Statics.field1771, client.method1040());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field4306 -= 2;
            var4.method4988(field829[Statics.field4306], field829[Statics.field4306 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method4973(field824[--Statics.field1369], field829[--Statics.field4306]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.i(ILbz;ZI)I")
    public static int method165(int arg0, class72 arg1, boolean arg2) {
        class295 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class295.method3238(field829[--Statics.field4306]);
        } else {
            var3 = arg2 ? Statics.field317 : Statics.field4320;
        }
        client.method2620(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field4306 -= 2;
            int var4 = field829[Statics.field4306];
            int var5 = field829[Statics.field4306 + 1];
            var3.field3375 = var4;
            var3.field3395 = var5;
            class188 var6 = class188.method2231(var4);
            var3.field3410 = var6.field2105;
            var3.field3472 = var6.field2128;
            var3.field3412 = var6.field2107;
            var3.field3408 = var6.field2108;
            var3.field3409 = var6.field2109;
            var3.field3465 = var6.field2104;
            if (arg0 == 1205) {
                var3.field3418 = 0;
            } else if (arg0 == 1212 | var6.field2134 == 1) {
                var3.field3418 = 1;
            } else {
                var3.field3418 = 2;
            }
            if (var3.field3414 > 0) {
                var3.field3465 = var3.field3465 * 32 / var3.field3414;
            } else if (var3.field3369 > 0) {
                var3.field3465 = var3.field3465 * 32 / var3.field3369;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3424 = 2;
            var3.field3403 = field829[--Statics.field4306];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3424 = 3;
            var3.field3403 = Statics.field454.field1084.method4943();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eq.k(ILbz;ZI)I")
    public static int method2740(int arg0, class72 arg1, boolean arg2) {
        boolean var3 = true;
        class295 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class295.method3238(field829[--Statics.field4306]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field317 : Statics.field4320;
        }
        if (arg0 == 1300) {
            int var5 = field829[--Statics.field4306] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4984(var5, field824[--Statics.field1369]);
                return 1;
            } else {
                Statics.field1369--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field4306 -= 2;
            int var6 = field829[Statics.field4306];
            int var7 = field829[Statics.field4306 + 1];
            var4.field3485 = class295.method2636(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3491 = field829[--Statics.field4306] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3438 = field829[--Statics.field4306];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3420 = field829[--Statics.field4306];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3447 = field824[--Statics.field1369];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3495 = field824[--Statics.field1369];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3443 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3510 = field829[--Statics.field4306] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field4306 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field829[Statics.field4306 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field829[Statics.field4306 + var10];
                        var9[var10 / 2] = (byte) field829[Statics.field4306 + var10 + 1];
                    }
                }
            } else {
                Statics.field4306 -= 2;
                var8 = new byte[] { (byte) field829[Statics.field4306] };
                var9 = new byte[] { (byte) field829[Statics.field4306 + 1] };
            }
            int var11 = field829[--Statics.field4306] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method1524(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field4306 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field829[Statics.field4306] };
            byte[] var14 = new byte[] { (byte) field829[Statics.field4306 + 1] };
            method1524(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field4306 -= 3;
            int var15 = field829[Statics.field4306] - 1;
            int var16 = field829[Statics.field4306 + 1];
            int var17 = field829[Statics.field4306 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method341(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field829[--Statics.field4306];
            int var20 = field829[--Statics.field4306];
            method341(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field4306--;
            int var21 = field829[Statics.field4306] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method1477(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method1477(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bd.o(Lkn;I[B[BB)V")
    public static final void method1524(class295 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3350 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3350 = new byte[11][];
            arg0.field3498 = new byte[11][];
            arg0.field3440 = new int[11];
            arg0.field3411 = new int[11];
        }
        arg0.field3350[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3437 = false;
            for (int var4 = 0; var4 < arg0.field3350.length; var4++) {
                if (arg0.field3350[var4] != null) {
                    arg0.field3437 = true;
                    break;
                }
            }
        } else {
            arg0.field3437 = true;
        }
        arg0.field3498[arg1] = arg3;
    }

    @ObfuscatedName("t.n(Lkn;IIII)V")
    public static final void method341(class295 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3440 == null) {
            throw new RuntimeException();
        }
        arg0.field3440[arg1] = arg2;
        arg0.field3411[arg1] = arg3;
    }

    @ObfuscatedName("client.d(Lkn;II)V")
    public static final void method1477(class295 arg0, int arg1) {
        if (arg0.field3350 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3507 == null) {
            arg0.field3507 = new int[arg0.field3350.length];
        }
        arg0.field3507[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("cl.a(ILbz;ZI)I")
    public static int method1966(int arg0, class72 arg1, boolean arg2) {
        class295 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class295.method3238(field829[--Statics.field4306]);
        } else {
            var3 = arg2 ? Statics.field317 : Statics.field4320;
        }
        String var4 = field824[--Statics.field1369];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field829[--Statics.field4306];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field829[--Statics.field4306];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field824[--Statics.field1369];
            } else {
                var7[var8] = Integer.valueOf(field829[--Statics.field4306]);
            }
        }
        int var9 = field829[--Statics.field4306];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3353 = var7;
        } else if (arg0 == 1401) {
            var3.field3454 = var7;
        } else if (arg0 == 1402) {
            var3.field3453 = var7;
        } else if (arg0 == 1403) {
            var3.field3455 = var7;
        } else if (arg0 == 1404) {
            var3.field3457 = var7;
        } else if (arg0 == 1405) {
            var3.field3458 = var7;
        } else if (arg0 == 1406) {
            var3.field3425 = var7;
        } else if (arg0 == 1407) {
            var3.field3413 = var7;
            var3.field3345 = var5;
        } else if (arg0 == 1408) {
            var3.field3468 = var7;
        } else if (arg0 == 1409) {
            var3.field3469 = var7;
        } else if (arg0 == 1410) {
            var3.field3459 = var7;
        } else if (arg0 == 1411) {
            var3.field3452 = var7;
        } else if (arg0 == 1412) {
            var3.field3456 = var7;
        } else if (arg0 == 1414) {
            var3.field3464 = var7;
            var3.field3388 = var5;
        } else if (arg0 == 1415) {
            var3.field3466 = var7;
            var3.field3357 = var5;
        } else if (arg0 == 1416) {
            var3.field3460 = var7;
        } else if (arg0 == 1417) {
            var3.field3470 = var7;
        } else if (arg0 == 1418) {
            var3.field3471 = var7;
        } else if (arg0 == 1419) {
            var3.field3436 = var7;
        } else if (arg0 == 1420) {
            var3.field3475 = var7;
        } else if (arg0 == 1421) {
            var3.field3430 = var7;
        } else if (arg0 == 1422) {
            var3.field3479 = var7;
        } else if (arg0 == 1423) {
            var3.field3480 = var7;
        } else if (arg0 == 1424) {
            var3.field3481 = var7;
        } else if (arg0 == 1425) {
            var3.field3483 = var7;
        } else if (arg0 == 1426) {
            var3.field3442 = var7;
        } else if (arg0 == 1427) {
            var3.field3482 = var7;
        } else if (arg0 == 1428) {
            var3.field3477 = var7;
        } else if (arg0 == 1429) {
            var3.field3370 = var7;
        } else if (arg0 == 1430) {
            var3.field3473 = var7;
        } else if (arg0 == 1431) {
            var3.field3494 = var7;
        } else if (arg0 == 1434) {
            var3.field3365 = var7;
        } else {
            return 2;
        }
        var3.field3449 = true;
        return 1;
    }

    @ObfuscatedName("ev.m(ILbz;ZI)I")
    public static int method2637(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = arg2 ? Statics.field317 : Statics.field4320;
        if (arg0 == 1500) {
            field829[++Statics.field4306 - 1] = var3.field3371;
            return 1;
        } else if (arg0 == 1501) {
            field829[++Statics.field4306 - 1] = var3.field3446;
            return 1;
        } else if (arg0 == 1502) {
            field829[++Statics.field4306 - 1] = var3.field3373;
            return 1;
        } else if (arg0 == 1503) {
            field829[++Statics.field4306 - 1] = var3.field3427;
            return 1;
        } else if (arg0 == 1504) {
            field829[++Statics.field4306 - 1] = var3.field3378 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field829[++Statics.field4306 - 1] = var3.field3377;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lh.u(ILbz;ZI)I")
    public static int method5347(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = arg2 ? Statics.field317 : Statics.field4320;
        if (arg0 == 1600) {
            field829[++Statics.field4306 - 1] = var3.field3379;
            return 1;
        } else if (arg0 == 1601) {
            field829[++Statics.field4306 - 1] = var3.field3380;
            return 1;
        } else if (arg0 == 1602) {
            field824[++Statics.field1369 - 1] = var3.field3461;
            return 1;
        } else if (arg0 == 1603) {
            field829[++Statics.field4306 - 1] = var3.field3381;
            return 1;
        } else if (arg0 == 1604) {
            field829[++Statics.field4306 - 1] = var3.field3382;
            return 1;
        } else if (arg0 == 1605) {
            field829[++Statics.field4306 - 1] = var3.field3465;
            return 1;
        } else if (arg0 == 1606) {
            field829[++Statics.field4306 - 1] = var3.field3410;
            return 1;
        } else if (arg0 == 1607) {
            field829[++Statics.field4306 - 1] = var3.field3412;
            return 1;
        } else if (arg0 == 1608) {
            field829[++Statics.field4306 - 1] = var3.field3472;
            return 1;
        } else if (arg0 == 1609) {
            field829[++Statics.field4306 - 1] = var3.field3428;
            return 1;
        } else if (arg0 == 1610) {
            field829[++Statics.field4306 - 1] = var3.field3390;
            return 1;
        } else if (arg0 == 1611) {
            field829[++Statics.field4306 - 1] = var3.field3383;
            return 1;
        } else if (arg0 == 1612) {
            field829[++Statics.field4306 - 1] = var3.field3384;
            return 1;
        } else if (arg0 == 1613) {
            field829[++Statics.field4306 - 1] = var3.field3496.method39();
            return 1;
        } else if (arg0 == 1614) {
            field829[++Statics.field4306 - 1] = var3.field3490 ? 1 : 0;
            return 1;
        } else if (arg0 == 1615 || arg0 == 1616) {
            Statics.field4306++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hm.l(ILbz;ZI)I")
    public static int method4088(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = arg2 ? Statics.field317 : Statics.field4320;
        if (arg0 == 1700) {
            field829[++Statics.field4306 - 1] = var3.field3375;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3375 == -1) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = var3.field3395;
            }
            return 1;
        } else if (arg0 == 1702) {
            field829[++Statics.field4306 - 1] = var3.field3359;
            return 1;
        } else if (arg0 == 1707) {
            field829[++Statics.field4306 - 1] = var3.method5002() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method2803(var3);
        } else if (arg0 == 1709) {
            return method2233(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("er.z(Lkn;I)I")
    public static int method2803(class295 arg0) {
        if (arg0.field3360 == 11) {
            String var1 = field824[--Statics.field1369];
            field829[++Statics.field4306 - 1] = arg0.method4992(var1);
            return 1;
        } else {
            Statics.field1369--;
            field829[++Statics.field4306 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("cs.r(Lkn;S)I")
    public static int method2233(class295 arg0) {
        if (arg0.field3360 == 11) {
            String var1 = field824[--Statics.field1369];
            field824[++Statics.field1369 - 1] = arg0.method4993(var1);
            return 1;
        } else {
            field824[Statics.field1369 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("bp.y(ILbz;ZI)I")
    public static int method1830(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = arg2 ? Statics.field317 : Statics.field4320;
        if (arg0 == 1800) {
            field829[++Statics.field4306 - 1] = class296.method5413(client.method3477(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field829[--Statics.field4306];
            int var5 = var4 - 1;
            if (var3.field3443 == null || var5 >= var3.field3443.length || var3.field3443[var5] == null) {
                field824[++Statics.field1369 - 1] = "";
            } else {
                field824[++Statics.field1369 - 1] = var3.field3443[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3447 == null) {
                field824[++Statics.field1369 - 1] = "";
            } else {
                field824[++Statics.field1369 - 1] = var3.field3447;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fz.p(ILbz;ZI)I")
    public static int method2946(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field831 >= 10) {
                throw new RuntimeException();
            }
            class295 var10;
            if (arg0 >= 2000) {
                var10 = class295.method3238(field829[--Statics.field4306]);
            } else {
                var10 = arg2 ? Statics.field317 : Statics.field4320;
            }
            if (var10.field3482 == null) {
                return 0;
            }
            class81 var11 = new class81();
            var11.field1030 = var10;
            var11.field1037 = var10.field3482;
            var11.field1040 = field831 + 1;
            client.field751.method5425(var11);
            return 1;
        } else if (arg0 == 1928) {
            class295 var3 = arg2 ? Statics.field317 : Statics.field4320;
            int var4 = field829[--Statics.field4306];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class94 var5 = new class94(var4, var3.field3358, var3.field3359, var3.field3375);
            field832.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field4306 -= 3;
            int var6 = field829[Statics.field4306];
            int var7 = field829[Statics.field4306 + 1];
            int var8 = field829[Statics.field4306 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class94 var9 = new class94(var8, var6, var7, class295.method3238(var6).field3375);
            field832.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fg.e(ILbz;ZI)I")
    public static int method2928(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = class295.method3238(field829[--Statics.field4306]);
        if (arg0 == 2500) {
            field829[++Statics.field4306 - 1] = var3.field3371;
            return 1;
        } else if (arg0 == 2501) {
            field829[++Statics.field4306 - 1] = var3.field3446;
            return 1;
        } else if (arg0 == 2502) {
            field829[++Statics.field4306 - 1] = var3.field3373;
            return 1;
        } else if (arg0 == 2503) {
            field829[++Statics.field4306 - 1] = var3.field3427;
            return 1;
        } else if (arg0 == 2504) {
            field829[++Statics.field4306 - 1] = var3.field3378 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field829[++Statics.field4306 - 1] = var3.field3377;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bi.b(ILbz;ZB)I")
    public static int method1858(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = class295.method3238(field829[--Statics.field4306]);
        if (arg0 == 2600) {
            field829[++Statics.field4306 - 1] = var3.field3379;
            return 1;
        } else if (arg0 == 2601) {
            field829[++Statics.field4306 - 1] = var3.field3380;
            return 1;
        } else if (arg0 == 2602) {
            field824[++Statics.field1369 - 1] = var3.field3461;
            return 1;
        } else if (arg0 == 2603) {
            field829[++Statics.field4306 - 1] = var3.field3381;
            return 1;
        } else if (arg0 == 2604) {
            field829[++Statics.field4306 - 1] = var3.field3382;
            return 1;
        } else if (arg0 == 2605) {
            field829[++Statics.field4306 - 1] = var3.field3465;
            return 1;
        } else if (arg0 == 2606) {
            field829[++Statics.field4306 - 1] = var3.field3410;
            return 1;
        } else if (arg0 == 2607) {
            field829[++Statics.field4306 - 1] = var3.field3412;
            return 1;
        } else if (arg0 == 2608) {
            field829[++Statics.field4306 - 1] = var3.field3472;
            return 1;
        } else if (arg0 == 2609) {
            field829[++Statics.field4306 - 1] = var3.field3428;
            return 1;
        } else if (arg0 == 2610) {
            field829[++Statics.field4306 - 1] = var3.field3390;
            return 1;
        } else if (arg0 == 2611) {
            field829[++Statics.field4306 - 1] = var3.field3383;
            return 1;
        } else if (arg0 == 2612) {
            field829[++Statics.field4306 - 1] = var3.field3384;
            return 1;
        } else if (arg0 == 2613) {
            field829[++Statics.field4306 - 1] = var3.field3496.method39();
            return 1;
        } else if (arg0 == 2614) {
            field829[++Statics.field4306 - 1] = var3.field3490 ? 1 : 0;
            return 1;
        } else if (arg0 == 2615 || arg0 == 2616) {
            Statics.field4306++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("du.x(ILbz;ZI)I")
    public static int method2418(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class295 var3 = class295.method3238(field829[--Statics.field4306]);
            field829[++Statics.field4306 - 1] = var3.field3375;
            return 1;
        } else if (arg0 == 2701) {
            class295 var4 = class295.method3238(field829[--Statics.field4306]);
            if (var4.field3375 == -1) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = var4.field3395;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field829[--Statics.field4306];
            class80 var6 = (class80) client.field651.method6695((long) var5);
            if (var6 == null) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field829[++Statics.field4306 - 1] = client.field650;
            return 1;
        } else if (arg0 == 2707) {
            class295 var7 = class295.method3238(field829[--Statics.field4306]);
            field829[++Statics.field4306 - 1] = var7.method5002() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class295 var8 = class295.method3238(field829[--Statics.field4306]);
            return method2803(var8);
        } else if (arg0 == 2709) {
            class295 var9 = class295.method3238(field829[--Statics.field4306]);
            return method2233(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("l.f(ILbz;ZI)I")
    public static int method174(int arg0, class72 arg1, boolean arg2) {
        class295 var3 = class295.method3238(field829[--Statics.field4306]);
        if (arg0 == 2800) {
            field829[++Statics.field4306 - 1] = class296.method5413(client.method3477(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field829[--Statics.field4306];
            int var5 = var4 - 1;
            if (var3.field3443 == null || var5 >= var3.field3443.length || var3.field3443[var5] == null) {
                field824[++Statics.field1369 - 1] = "";
            } else {
                field824[++Statics.field1369 - 1] = var3.field3443[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3447 == null) {
                field824[++Statics.field1369 - 1] = "";
            } else {
                field824[++Statics.field1369 - 1] = var3.field3447;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eq.t(ILbz;ZI)I")
    public static int method2742(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field824[--Statics.field1369];
            class99.method2996(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field4306 -= 2;
            client.method5117(Statics.field454, field829[Statics.field4306], field829[Statics.field4306 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field817) {
                field821 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field824[--Statics.field1369];
            int var5 = 0;
            if (class344.method4416(var4)) {
                var5 = class344.method6018(var4);
            }
            class265 var6 = class265.method349(class263.field2984, client.field536.field1339);
            var6.field3039.method6915(var5);
            client.field536.method2330(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field824[--Statics.field1369];
            class265 var8 = class265.method349(class263.field3016, client.field536.field1339);
            var8.field3039.method6912(var7.length() + 1);
            var8.field3039.method6950(var7);
            client.field536.method2330(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field824[--Statics.field1369];
            class265 var10 = class265.method349(class263.field2926, client.field536.field1339);
            var10.field3039.method6912(var9.length() + 1);
            var10.field3039.method6950(var9);
            client.field536.method2330(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field829[--Statics.field4306];
            String var12 = field824[--Statics.field1369];
            client.method4561(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field4306 -= 3;
            int var13 = field829[Statics.field4306];
            int var14 = field829[Statics.field4306 + 1];
            int var15 = field829[Statics.field4306 + 2];
            class295 var16 = class295.method3238(var15);
            client.method4422(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field4306 -= 2;
            int var17 = field829[Statics.field4306];
            int var18 = field829[Statics.field4306 + 1];
            class295 var19 = arg2 ? Statics.field317 : Statics.field4320;
            client.method4422(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field4383 = field829[--Statics.field4306] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field829[++Statics.field4306 - 1] = Statics.field4303.method2091() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field4303.method2123(field829[--Statics.field4306] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field824[--Statics.field1369];
            boolean var21 = field829[--Statics.field4306] == 1;
            class30.method6381(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field829[--Statics.field4306];
            class265 var23 = class265.method349(class263.field2951, client.field536.field1339);
            var23.field3039.method6913(var22);
            client.field536.method2330(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field829[--Statics.field4306];
            Statics.field1369 -= 2;
            String var25 = field824[Statics.field1369];
            String var26 = field824[Statics.field1369 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class265 var27 = class265.method349(class263.field3006, client.field536.field1339);
                var27.field3039.method6913(1 + class444.method5118(var25) + class444.method5118(var26));
                var27.field3039.method7171(var24);
                var27.field3039.method6950(var26);
                var27.field3039.method6950(var25);
                client.field536.method2330(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field629 = field829[--Statics.field4306] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field638 = field829[--Statics.field4306] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field546 = field829[--Statics.field4306] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field829[--Statics.field4306] == 1) {
                client.field609 |= 0x1;
            } else {
                client.field609 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field829[--Statics.field4306] == 1) {
                client.field609 |= 0x2;
            } else {
                client.field609 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field829[--Statics.field4306] == 1) {
                client.field609 |= 0x4;
            } else {
                client.field609 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field829[--Statics.field4306] == 1) {
                client.field609 |= 0x8;
            } else {
                client.field609 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field609 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field564 = field829[--Statics.field4306] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field603 = field829[--Statics.field4306] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method339(field829[--Statics.field4306] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field829[++Statics.field4306 - 1] = client.method2420() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field4306 -= 2;
            client.field568 = field829[Statics.field4306];
            client.field569 = field829[Statics.field4306 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field4306 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 3132) {
            field829[++Statics.field4306 - 1] = Statics.field32;
            field829[++Statics.field4306 - 1] = Statics.field2650;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field4306 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field742 = 3;
            client.field653 = field829[--Statics.field4306];
            return 1;
        } else if (arg0 == 3137) {
            client.field742 = 2;
            client.field653 = field829[--Statics.field4306];
            return 1;
        } else if (arg0 == 3138) {
            client.field742 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field742 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field742 = 3;
            client.field653 = arg2 ? Statics.field317.field3358 : Statics.field4320.field3358;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field829[--Statics.field4306] == 1;
            Statics.field4303.method2092(var28);
            return 1;
        } else if (arg0 == 3142) {
            field829[++Statics.field4306 - 1] = Statics.field4303.method2093() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field829[--Statics.field4306] == 1;
            client.field524 = var29;
            if (!var29) {
                Statics.field4303.method2150("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field829[++Statics.field4306 - 1] = client.field524 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field829[--Statics.field4306] == 1;
            Statics.field4303.method2094(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field829[++Statics.field4306 - 1] = Statics.field4303.method2095() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field829[++Statics.field4306 - 1] = class69.field904;
            return 1;
        } else if (arg0 == 3154) {
            field829[++Statics.field4306 - 1] = client.method2744();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1369--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field4306 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field4306--;
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field4306--;
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1369--;
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field4306--;
            field824[++Statics.field1369 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field4306--;
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field4306 -= 2;
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field4306 -= 2;
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field4306 -= 2;
            field824[++Statics.field1369 - 1] = "";
            field824[++Statics.field1369 - 1] = "";
            field824[++Statics.field1369 - 1] = "";
            field824[++Statics.field1369 - 1] = "";
            field824[++Statics.field1369 - 1] = "";
            field824[++Statics.field1369 - 1] = "";
            field824[++Statics.field1369 - 1] = "";
            field824[++Statics.field1369 - 1] = "";
            field824[++Statics.field1369 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field4306--;
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 3175) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field1369--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field1369--;
            return 1;
        } else if (arg0 == 3181) {
            client.method4479(field829[--Statics.field4306]);
            return 1;
        } else if (arg0 == 3182) {
            field829[++Statics.field4306 - 1] = client.method4139();
            return 1;
        } else if (arg0 == 3183 || arg0 == 3184) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 3187) {
            Statics.field1369 -= 2;
            return 1;
        } else if (arg0 == 3188) {
            return 1;
        } else if (arg0 == 3189) {
            int var31 = field829[--Statics.field4306];
            class190 var32 = class190.method5853(var31);
            if (var32.method3388()) {
                class190.method3206(var32.field2177);
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ea.j(ILbz;ZI)I")
    public static int method2666(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field4306 -= 3;
            client.method2763(field829[Statics.field4306], field829[Statics.field4306 + 1], field829[Statics.field4306 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method2945(field829[--Statics.field4306]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field4306 -= 2;
            client.method2906(field829[Statics.field4306], field829[Statics.field4306 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class84 var15 = class84.field1077;
            class83 var16 = class83.field1066;
            int var17 = field829[--Statics.field4306];
            if (arg0 == 3212) {
                int var18 = field829[--Statics.field4306];
                var15 = (class84) class330.method525(class84.method2257(), var18);
                if (var15 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var18));
                }
            }
            if (arg0 == 3213) {
                int var19 = field829[--Statics.field4306];
                var16 = (class83) class330.method525(class83.method523(), var19);
                if (var16 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var19));
                }
            }
            if (arg0 == 3209) {
                int var20 = field829[--Statics.field4306];
                var15 = (class84) class330.method525(class84.method2257(), var20);
                if (var15 == null) {
                    var16 = (class83) class330.method525(class83.method523(), var20);
                    if (var16 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var20));
                    }
                }
            } else if (arg0 == 3181) {
                var15 = class84.field1079;
            } else if (arg0 == 3203) {
                var16 = class83.field1063;
            } else if (arg0 == 3205) {
                var16 = class83.field1064;
            } else if (arg0 == 3207) {
                var16 = class83.field1065;
            }
            if (class83.field1066 == var16) {
                switch(var15.field1076) {
                    case 1:
                        Statics.field4303.method2092(var17 == 1);
                        break;
                    case 2:
                        Statics.field4303.method2094(var17 == 1);
                        break;
                    case 3:
                        Statics.field4303.method2158(var17 == 1);
                        break;
                    case 4:
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        Statics.field4303.method2099(var17);
                        break;
                    case 5:
                        client.method4479(var17);
                        break;
                    default:
                        String var21 = String.format("Unkown device option: %s.", var15.toString());
                        throw new RuntimeException(var21);
                }
            } else {
                switch(var16.field1062) {
                    case 1:
                        Statics.field4303.method2123(var17 == 1);
                        break;
                    case 2:
                        int var27 = Math.min(Math.max(var17, 0), 100);
                        int var28 = Math.round((float) (var27 * 255) / 100.0F);
                        client.method95(var28);
                        break;
                    case 3:
                        int var25 = Math.min(Math.max(var17, 0), 100);
                        int var26 = Math.round((float) (var25 * 127) / 100.0F);
                        Statics.method3143(var26);
                        break;
                    case 4:
                        int var23 = Math.min(Math.max(var17, 0), 100);
                        int var24 = Math.round((float) (var23 * 127) / 100.0F);
                        client.method2649(var24);
                        break;
                    default:
                        String var22 = String.format("Unkown game option: %s.", var16.toString());
                        throw new RuntimeException(var22);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class84 var3 = class84.field1077;
            class83 var4 = class83.field1066;
            boolean var5 = false;
            if (arg0 == 3214) {
                int var6 = field829[--Statics.field4306];
                var3 = (class84) class330.method525(class84.method2257(), var6);
                if (var3 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var6));
                }
            }
            if (arg0 == 3215) {
                int var7 = field829[--Statics.field4306];
                var4 = (class83) class330.method525(class83.method523(), var7);
                if (var4 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                }
            }
            if (arg0 == 3210) {
                int var8 = field829[--Statics.field4306];
                var3 = (class84) class330.method525(class84.method2257(), var8);
                if (var3 == null) {
                    var4 = (class83) class330.method525(class83.method523(), var8);
                    if (var4 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var8));
                    }
                }
            } else if (arg0 == 3182) {
                var3 = class84.field1079;
            } else if (arg0 == 3204) {
                var4 = class83.field1063;
            } else if (arg0 == 3206) {
                var4 = class83.field1064;
            } else if (arg0 == 3208) {
                var4 = class83.field1065;
            }
            int var10;
            if (class83.field1066 == var4) {
                switch(var3.field1076) {
                    case 1:
                        var10 = Statics.field4303.method2093() ? 1 : 0;
                        break;
                    case 2:
                        var10 = Statics.field4303.method2095() ? 1 : 0;
                        break;
                    case 3:
                        var10 = Statics.field4303.method2098() ? 1 : 0;
                        break;
                    case 4:
                        var10 = Statics.field4303.method2100();
                        break;
                    case 5:
                        var10 = client.method4139();
                        break;
                    default:
                        String var9 = String.format("Unkown device option: %s.", var3.toString());
                        throw new RuntimeException(var9);
                }
            } else {
                switch(var4.field1062) {
                    case 1:
                        var10 = Statics.field4303.method2091() ? 1 : 0;
                        break;
                    case 2:
                        int var14 = Statics.field4303.method2104();
                        var10 = Math.round((float) (var14 * 100) / 255.0F);
                        break;
                    case 3:
                        int var13 = Statics.field4303.method2086();
                        var10 = Math.round((float) (var13 * 100) / 127.0F);
                        break;
                    case 4:
                        int var12 = Statics.field4303.method2108();
                        var10 = Math.round((float) (var12 * 100) / 127.0F);
                        break;
                    default:
                        String var11 = String.format("Unkown game option: %s.", var4.toString());
                        throw new RuntimeException(var11);
                }
            }
            field829[++Statics.field4306 - 1] = var10;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ki.g(ILbz;ZS)I")
    public static int method5091(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field829[++Statics.field4306 - 1] = client.field487;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field4306 -= 2;
            int var3 = field829[Statics.field4306];
            int var4 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = class78.method6794(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field4306 -= 2;
            int var5 = field829[Statics.field4306];
            int var6 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = class78.method2915(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field4306 -= 2;
            int var7 = field829[Statics.field4306];
            int var8 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = class78.method291(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = Statics.method282(var9).field1799;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = client.field621[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = client.field738[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = client.field623[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field3173;
            int var14 = (Statics.field454.field1172 >> 7) + Statics.field405;
            int var15 = (Statics.field454.field1155 >> 7) + Statics.field31;
            field829[++Statics.field4306 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field829[++Statics.field4306 - 1] = client.field479 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field4306 -= 2;
            int var19 = field829[Statics.field4306] + 32768;
            int var20 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = class78.method6794(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field4306 -= 2;
            int var21 = field829[Statics.field4306] + 32768;
            int var22 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = class78.method2915(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field4306 -= 2;
            int var23 = field829[Statics.field4306] + 32768;
            int var24 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = class78.method291(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field757 >= 2) {
                field829[++Statics.field4306 - 1] = client.field757;
            } else {
                field829[++Statics.field4306 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field829[++Statics.field4306 - 1] = client.field493;
            return 1;
        } else if (arg0 == 3318) {
            field829[++Statics.field4306 - 1] = client.field476;
            return 1;
        } else if (arg0 == 3321) {
            field829[++Statics.field4306 - 1] = client.field657;
            return 1;
        } else if (arg0 == 3322) {
            field829[++Statics.field4306 - 1] = client.field658;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field661) {
                field829[++Statics.field4306 - 1] = 1;
            } else {
                field829[++Statics.field4306 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field829[++Statics.field4306 - 1] = client.field477;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field4306 -= 4;
            int var25 = field829[Statics.field4306];
            int var26 = field829[Statics.field4306 + 1];
            int var27 = field829[Statics.field4306 + 2];
            int var28 = field829[Statics.field4306 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field829[++Statics.field4306 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field829[++Statics.field4306 - 1] = client.field554;
            return 1;
        } else if (arg0 == 3327) {
            field829[++Statics.field4306 - 1] = client.field689;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("df.ar(ILbz;ZI)I")
    public static int method2618(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field4306 -= 2;
            int var3 = field829[Statics.field4306];
            int var4 = field829[Statics.field4306 + 1];
            class176 var5 = class176.method4120(var3);
            if (var5.field1882 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1890; var6++) {
                if (var5.field1886[var6] == var4) {
                    field824[++Statics.field1369 - 1] = var5.field1888[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field824[++Statics.field1369 - 1] = var5.field1881;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field4306 -= 4;
            int var7 = field829[Statics.field4306];
            int var8 = field829[Statics.field4306 + 1];
            int var9 = field829[Statics.field4306 + 2];
            int var10 = field829[Statics.field4306 + 3];
            class176 var11 = class176.method4120(var9);
            if (var11.field1885 != var7 || var11.field1882 != var8) {
                if (var8 == 115) {
                    field824[++Statics.field1369 - 1] = class309.field3624;
                } else {
                    field829[++Statics.field4306 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1890; var12++) {
                if (var11.field1886[var12] == var10) {
                    if (var8 == 115) {
                        field824[++Statics.field1369 - 1] = var11.field1888[var12];
                    } else {
                        field829[++Statics.field4306 - 1] = var11.field1887[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field824[++Statics.field1369 - 1] = var11.field1881;
                } else {
                    field829[++Statics.field4306 - 1] = var11.field1893;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field829[--Statics.field4306];
            class176 var14 = class176.method4120(var13);
            field829[++Statics.field4306 - 1] = var14.method3053();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("lj.aq(ILbz;ZB)I")
    public static int method5328(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = class24.method3164(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = class24.method5098(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = class24.method1948(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bh.av(ILbz;ZI)I")
    public static int method1764(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field4063.field795 == 0) {
                field829[++Statics.field4306 - 1] = -2;
            } else if (Statics.field4063.field795 == 1) {
                field829[++Statics.field4306 - 1] = -1;
            } else {
                field829[++Statics.field4306 - 1] = Statics.field4063.field793.method6067();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field829[--Statics.field4306];
            if (Statics.field4063.method1529() && var3 >= 0 && var3 < Statics.field4063.field793.method6067()) {
                class369 var4 = (class369) Statics.field4063.field793.method6051(var3);
                field824[++Statics.field1369 - 1] = var4.method5997();
                field824[++Statics.field1369 - 1] = var4.method6003();
            } else {
                field824[++Statics.field1369 - 1] = "";
                field824[++Statics.field1369 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field829[--Statics.field4306];
            if (Statics.field4063.method1529() && var5 >= 0 && var5 < Statics.field4063.field793.method6067()) {
                field829[++Statics.field4306 - 1] = ((class376) Statics.field4063.field793.method6051(var5)).field4328;
            } else {
                field829[++Statics.field4306 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field829[--Statics.field4306];
            if (Statics.field4063.method1529() && var6 >= 0 && var6 < Statics.field4063.field793.method6067()) {
                field829[++Statics.field4306 - 1] = ((class376) Statics.field4063.field793.method6051(var6)).field4326;
            } else {
                field829[++Statics.field4306 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field824[--Statics.field1369];
            int var8 = field829[--Statics.field4306];
            class62.method2905(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field824[--Statics.field1369];
            Statics.field4063.method1536(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field824[--Statics.field1369];
            Statics.field4063.method1598(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field824[--Statics.field1369];
            Statics.field4063.method1538(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field824[--Statics.field1369];
            Statics.field4063.method1553(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field824[--Statics.field1369];
            String var14 = client.method4440(var13);
            field829[++Statics.field4306 - 1] = Statics.field4063.method1534(new class465(var14, Statics.field2008), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field105 == null) {
                field824[++Statics.field1369 - 1] = "";
            } else {
                field824[++Statics.field1369 - 1] = Statics.field105.field4291;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field105 == null) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = Statics.field105.method6067();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field829[--Statics.field4306];
            if (Statics.field105 == null || var15 >= Statics.field105.method6067()) {
                field824[++Statics.field1369 - 1] = "";
            } else {
                field824[++Statics.field1369 - 1] = Statics.field105.method6051(var15).method5996().method7491();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field829[--Statics.field4306];
            if (Statics.field105 == null || var16 >= Statics.field105.method6067()) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = ((class376) Statics.field105.method6051(var16)).method6106();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field829[--Statics.field4306];
            if (Statics.field105 == null || var17 >= Statics.field105.method6067()) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = ((class376) Statics.field105.method6051(var17)).field4326;
            }
            return 1;
        } else if (arg0 == 3616) {
            field829[++Statics.field4306 - 1] = Statics.field105 == null ? 0 : Statics.field105.field4290;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field824[--Statics.field1369];
            client.method1848(var18);
            return 1;
        } else if (arg0 == 3618) {
            field829[++Statics.field4306 - 1] = Statics.field105 == null ? 0 : Statics.field105.field4285;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field824[--Statics.field1369];
            client.method1817(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method2503();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field4063.method1529()) {
                field829[++Statics.field4306 - 1] = Statics.field4063.field791.method6067();
            } else {
                field829[++Statics.field4306 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field829[--Statics.field4306];
            if (Statics.field4063.method1529() && var20 >= 0 && var20 < Statics.field4063.field791.method6067()) {
                class375 var21 = (class375) Statics.field4063.field791.method6051(var20);
                field824[++Statics.field1369 - 1] = var21.method5997();
                field824[++Statics.field1369 - 1] = var21.method6003();
            } else {
                field824[++Statics.field1369 - 1] = "";
                field824[++Statics.field1369 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field824[--Statics.field1369];
            String var23 = client.method4440(var22);
            field829[++Statics.field4306 - 1] = Statics.field4063.method1550(new class465(var23, Statics.field2008)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field829[--Statics.field4306];
            if (Statics.field105 == null || var24 >= Statics.field105.method6067() || !Statics.field105.method6051(var24).method5996().equals(Statics.field454.field1110)) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field105 == null || Statics.field105.field4289 == null) {
                field824[++Statics.field1369 - 1] = "";
            } else {
                field824[++Statics.field1369 - 1] = Statics.field105.field4289;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field829[--Statics.field4306];
            if (Statics.field105 == null || var25 >= Statics.field105.method6067() || !((class371) Statics.field105.method6051(var25)).method5979()) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field829[--Statics.field4306];
            if (Statics.field105 == null || var26 >= Statics.field105.method6067() || !((class371) Statics.field105.method6051(var26)).method5986()) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field4063.field793.method6040();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field829[--Statics.field4306] == 1;
            Statics.field4063.field793.method6041(new class449(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field829[--Statics.field4306] == 1;
            Statics.field4063.field793.method6041(new class450(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field829[--Statics.field4306] == 1;
            Statics.field4063.field793.method6041(new class108(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field829[--Statics.field4306] == 1;
            Statics.field4063.field793.method6041(new class104(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field829[--Statics.field4306] == 1;
            Statics.field4063.field793.method6041(new class107(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field829[--Statics.field4306] == 1;
            Statics.field4063.field793.method6041(new class112(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field829[--Statics.field4306] == 1;
            Statics.field4063.field793.method6041(new class106(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field829[--Statics.field4306] == 1;
            Statics.field4063.field793.method6041(new class105(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field829[--Statics.field4306] == 1;
            Statics.field4063.field793.method6041(new class109(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field829[--Statics.field4306] == 1;
            Statics.field4063.field793.method6041(new class110(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field4063.field793.method6032();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field4063.field791.method6040();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field829[--Statics.field4306] == 1;
            Statics.field4063.field791.method6041(new class449(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field829[--Statics.field4306] == 1;
            Statics.field4063.field791.method6041(new class450(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field4063.field791.method6032();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field105 != null) {
                Statics.field105.method6040();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field829[--Statics.field4306] == 1;
            if (Statics.field105 != null) {
                Statics.field105.method6041(new class449(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field829[--Statics.field4306] == 1;
            if (Statics.field105 != null) {
                Statics.field105.method6041(new class450(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field829[--Statics.field4306] == 1;
            if (Statics.field105 != null) {
                Statics.field105.method6041(new class108(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field829[--Statics.field4306] == 1;
            if (Statics.field105 != null) {
                Statics.field105.method6041(new class104(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field829[--Statics.field4306] == 1;
            if (Statics.field105 != null) {
                Statics.field105.method6041(new class107(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field829[--Statics.field4306] == 1;
            if (Statics.field105 != null) {
                Statics.field105.method6041(new class112(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field829[--Statics.field4306] == 1;
            if (Statics.field105 != null) {
                Statics.field105.method6041(new class106(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field829[--Statics.field4306] == 1;
            if (Statics.field105 != null) {
                Statics.field105.method6041(new class105(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field829[--Statics.field4306] == 1;
            if (Statics.field105 != null) {
                Statics.field105.method6041(new class109(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field829[--Statics.field4306] == 1;
            if (Statics.field105 != null) {
                Statics.field105.method6041(new class110(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field105 != null) {
                Statics.field105.method6032();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field829[--Statics.field4306] == 1;
            Statics.field4063.field793.method6041(new class111(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field829[--Statics.field4306] == 1;
            if (Statics.field105 != null) {
                Statics.field105.method6041(new class111(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("x.aj(ILbz;ZI)I")
    public static int method289(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3700 || arg0 == 3701) {
            Statics.field4306--;
            Statics.field1369--;
            return 1;
        } else if (arg0 == 3702) {
            Statics.field4306++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eb.ax(ILbz;ZI)I")
    public static int method2664(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field4591 == null) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = 1;
                Statics.field1327 = Statics.field4591;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field829[--Statics.field4306];
            if (client.field719[var3] == null) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = 1;
                Statics.field1327 = client.field719[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field824[++Statics.field1369 - 1] = Statics.field1327.field1605;
            return 1;
        } else if (arg0 == 3803) {
            field829[++Statics.field4306 - 1] = Statics.field1327.field1624 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field829[++Statics.field4306 - 1] = Statics.field1327.field1607;
            return 1;
        } else if (arg0 == 3805) {
            field829[++Statics.field4306 - 1] = Statics.field1327.field1600;
            return 1;
        } else if (arg0 == 3806) {
            field829[++Statics.field4306 - 1] = Statics.field1327.field1616;
            return 1;
        } else if (arg0 == 3807) {
            field829[++Statics.field4306 - 1] = Statics.field1327.field1611;
            return 1;
        } else if (arg0 == 3809) {
            field829[++Statics.field4306 - 1] = Statics.field1327.field1612;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field829[--Statics.field4306];
            field824[++Statics.field1369 - 1] = Statics.field1327.field1623[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = Statics.field1327.field1615[var5];
            return 1;
        } else if (arg0 == 3812) {
            field829[++Statics.field4306 - 1] = Statics.field1327.field1621;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field829[--Statics.field4306];
            field824[++Statics.field1369 - 1] = Statics.field1327.field1614[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field4306 -= 3;
            int var7 = field829[Statics.field4306];
            int var8 = field829[Statics.field4306 + 1];
            int var9 = field829[Statics.field4306 + 2];
            field829[++Statics.field4306 - 1] = Statics.field1327.method2687(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field829[++Statics.field4306 - 1] = Statics.field1327.field1619;
            return 1;
        } else if (arg0 == 3816) {
            field829[++Statics.field4306 - 1] = Statics.field1327.field1609;
            return 1;
        } else if (arg0 == 3817) {
            field829[++Statics.field4306 - 1] = Statics.field1327.method2673(field824[--Statics.field1369]);
            return 1;
        } else if (arg0 == 3818) {
            field829[Statics.field4306 - 1] = Statics.field1327.method2676()[field829[Statics.field4306 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field4306 -= 2;
            int var10 = field829[Statics.field4306];
            int var11 = field829[Statics.field4306 + 1];
            client.method2419(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = Statics.field1327.field1617[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field4306 -= 3;
                int var13 = field829[Statics.field4306];
                boolean var14 = field829[Statics.field4306 + 1] == 1;
                int var15 = field829[Statics.field4306 + 2];
                client.method2632(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field829[--Statics.field4306];
                field829[++Statics.field4306 - 1] = Statics.field1327.field1620[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field4039 == null) {
                    field829[++Statics.field4306 - 1] = 0;
                } else {
                    field829[++Statics.field4306 - 1] = 1;
                    Statics.field827 = Statics.field4039;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field829[--Statics.field4306];
                if (client.field678[var17] == null) {
                    field829[++Statics.field4306 - 1] = 0;
                } else {
                    field829[++Statics.field4306 - 1] = 1;
                    Statics.field827 = client.field678[var17];
                    Statics.field1745 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field824[++Statics.field1369 - 1] = Statics.field827.field1668;
                return 1;
            } else if (arg0 == 3853) {
                field829[++Statics.field4306 - 1] = Statics.field827.field1670;
                return 1;
            } else if (arg0 == 3854) {
                field829[++Statics.field4306 - 1] = Statics.field827.field1667;
                return 1;
            } else if (arg0 == 3855) {
                field829[++Statics.field4306 - 1] = Statics.field827.method2768();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field829[--Statics.field4306];
                field824[++Statics.field1369 - 1] = ((class131) Statics.field827.field1663.get(var18)).field1544.method7491();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field829[--Statics.field4306];
                field829[++Statics.field4306 - 1] = ((class131) Statics.field827.field1663.get(var19)).field1543;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field829[--Statics.field4306];
                field829[++Statics.field4306 - 1] = ((class131) Statics.field827.field1663.get(var20)).field1542;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field829[--Statics.field4306];
                client.method1849(Statics.field1745, var21);
                return 1;
            } else if (arg0 == 3860) {
                field829[++Statics.field4306 - 1] = Statics.field827.method2778(field824[--Statics.field1369]);
                return 1;
            } else if (arg0 == 3861) {
                field829[Statics.field4306 - 1] = Statics.field827.method2765()[field829[Statics.field4306 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field829[++Statics.field4306 - 1] = Statics.field3319 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("pu.ab(ILbz;ZS)I")
    public static int method6828(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = client.field577[var3].method5364();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = client.field577[var4].field4072;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = client.field577[var5].field4074;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = client.field577[var6].field4075;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = client.field577[var7].field4076;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = client.field577[var8].field4077;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field829[--Statics.field4306];
            int var10 = client.field577[var9].method5350();
            field829[++Statics.field4306 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field829[--Statics.field4306];
            int var12 = client.field577[var11].method5350();
            field829[++Statics.field4306 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field829[--Statics.field4306];
            int var14 = client.field577[var13].method5350();
            field829[++Statics.field4306 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field829[--Statics.field4306];
            int var16 = client.field577[var15].method5350();
            field829[++Statics.field4306 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field829[--Statics.field4306] == 1;
            if (Statics.field1384 != null) {
                Statics.field1384.method5291(class318.field4044, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field829[--Statics.field4306] == 1;
            if (Statics.field1384 != null) {
                Statics.field1384.method5291(class318.field4043, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field4306 -= 2;
            boolean var19 = field829[Statics.field4306] == 1;
            boolean var20 = field829[Statics.field4306 + 1] == 1;
            if (Statics.field1384 != null) {
                client.field762.field470 = var20;
                Statics.field1384.method5291(client.field762, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field829[--Statics.field4306] == 1;
            if (Statics.field1384 != null) {
                Statics.field1384.method5291(class318.field4042, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field829[--Statics.field4306] == 1;
            if (Statics.field1384 != null) {
                Statics.field1384.method5291(class318.field4045, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field829[++Statics.field4306 - 1] = Statics.field1384 == null ? 0 : Statics.field1384.field4046.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field829[--Statics.field4306];
            class324 var24 = (class324) Statics.field1384.field4046.get(var23);
            field829[++Statics.field4306 - 1] = var24.field4068;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field829[--Statics.field4306];
            class324 var26 = (class324) Statics.field1384.field4046.get(var25);
            field824[++Statics.field1369 - 1] = var26.method5346();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field829[--Statics.field4306];
            class324 var28 = (class324) Statics.field1384.field4046.get(var27);
            field824[++Statics.field1369 - 1] = var28.method5339();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field829[--Statics.field4306];
            class324 var30 = (class324) Statics.field1384.field4046.get(var29);
            long var31 = class270.method3146() - Statics.field4588 - var30.field4067;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field824[++Statics.field1369 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field829[--Statics.field4306];
            class324 var38 = (class324) Statics.field1384.field4046.get(var37);
            field829[++Statics.field4306 - 1] = var38.field4069.field4075;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field829[--Statics.field4306];
            class324 var40 = (class324) Statics.field1384.field4046.get(var39);
            field829[++Statics.field4306 - 1] = var40.field4069.field4074;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field829[--Statics.field4306];
            class324 var42 = (class324) Statics.field1384.field4046.get(var41);
            field829[++Statics.field4306 - 1] = var42.field4069.field4072;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cr.ak(ILbz;ZB)I")
    public static int method2221(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field4306 -= 2;
            int var3 = field829[Statics.field4306];
            int var4 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field4306 -= 2;
            int var5 = field829[Statics.field4306];
            int var6 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field4306 -= 2;
            int var7 = field829[Statics.field4306];
            int var8 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field4306 -= 2;
            int var9 = field829[Statics.field4306];
            int var10 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field4306 -= 5;
            int var13 = field829[Statics.field4306];
            int var14 = field829[Statics.field4306 + 1];
            int var15 = field829[Statics.field4306 + 2];
            int var16 = field829[Statics.field4306 + 3];
            int var17 = field829[Statics.field4306 + 4];
            field829[++Statics.field4306 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field4306 -= 2;
            int var18 = field829[Statics.field4306];
            int var19 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field4306 -= 2;
            int var20 = field829[Statics.field4306];
            int var21 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field4306 -= 2;
            int var22 = field829[Statics.field4306];
            int var23 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field4306 -= 2;
            int var24 = field829[Statics.field4306];
            int var25 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field4306 -= 2;
            int var26 = field829[Statics.field4306];
            int var27 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field4306 -= 2;
            int var28 = field829[Statics.field4306];
            int var29 = field829[Statics.field4306 + 1];
            if (var28 == 0) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field4306 -= 2;
            int var30 = field829[Statics.field4306];
            int var31 = field829[Statics.field4306 + 1];
            if (var30 == 0) {
                field829[++Statics.field4306 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field829[++Statics.field4306 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field829[++Statics.field4306 - 1] = var30;
                    break;
                case 2:
                    field829[++Statics.field4306 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field829[++Statics.field4306 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field829[++Statics.field4306 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field829[++Statics.field4306 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field4306 -= 2;
            int var32 = field829[Statics.field4306];
            int var33 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field4306 -= 2;
            int var34 = field829[Statics.field4306];
            int var35 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field4306 -= 3;
            long var36 = (long) field829[Statics.field4306];
            long var38 = (long) field829[Statics.field4306 + 1];
            long var40 = (long) field829[Statics.field4306 + 2];
            field829[++Statics.field4306 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else if (arg0 == 4025) {
            int var42 = class272.method4387(field829[--Statics.field4306]);
            field829[++Statics.field4306 - 1] = var42;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field4306 -= 2;
            int var43 = field829[Statics.field4306];
            int var44 = field829[Statics.field4306 + 1];
            field829[++Statics.field4306 - 1] = var43 ^ 0x1 << var44;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field4306 -= 3;
            int var45 = field829[Statics.field4306];
            int var46 = field829[Statics.field4306 + 1];
            int var47 = field829[Statics.field4306 + 2];
            field829[++Statics.field4306 - 1] = class272.method3593(var45, var46, var47);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field4306 -= 3;
            int var48 = field829[Statics.field4306];
            int var49 = field829[Statics.field4306 + 1];
            int var50 = field829[Statics.field4306 + 2];
            field829[++Statics.field4306 - 1] = class272.method2210(var48, var49, var50);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field4306 -= 3;
            int var51 = field829[Statics.field4306];
            int var52 = field829[Statics.field4306 + 1];
            int var53 = field829[Statics.field4306 + 2];
            int var54 = 31 - var53;
            field829[++Statics.field4306 - 1] = var51 << var54 >>> var52 + var54;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field4306 -= 4;
            int var55 = field829[Statics.field4306];
            int var56 = field829[Statics.field4306 + 1];
            int var57 = field829[Statics.field4306 + 2];
            int var58 = field829[Statics.field4306 + 3];
            int var59 = class272.method2210(var55, var57, var58);
            int var60 = Statics.method166(var58 - var57 + 1);
            if (var56 > var60) {
                var56 = var60;
            }
            field829[++Statics.field4306 - 1] = var59 | var56 << var57;
            return 1;
        } else if (arg0 == 4032) {
            field829[Statics.field4306 - 1] = class403.method200(field829[Statics.field4306 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field829[Statics.field4306 - 1] = class403.method4096(field829[Statics.field4306 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field4306 -= 2;
            int var61 = field829[Statics.field4306];
            int var62 = field829[Statics.field4306 + 1];
            int var63 = class403.method5643(var61, var62);
            field829[++Statics.field4306 - 1] = var63;
            return 1;
        } else if (arg0 == 4035) {
            field829[Statics.field4306 - 1] = Math.abs(field829[Statics.field4306 - 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ap.au(ILbz;ZI)I")
    public static int method717(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field824[--Statics.field1369];
            int var4 = field829[--Statics.field4306];
            field824[++Statics.field1369 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1369 -= 2;
            String var5 = field824[Statics.field1369];
            String var6 = field824[Statics.field1369 + 1];
            field824[++Statics.field1369 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field824[--Statics.field1369];
            int var8 = field829[--Statics.field4306];
            field824[++Statics.field1369 - 1] = var7 + class344.method5168(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field824[--Statics.field1369];
            field824[++Statics.field1369 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field829[--Statics.field4306];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field828.setTime(new Date(var11));
            int var13 = field828.get(5);
            int var14 = field828.get(2);
            int var15 = field828.get(1);
            field824[++Statics.field1369 - 1] = var13 + "-" + field826[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1369 -= 2;
            String var16 = field824[Statics.field1369];
            String var17 = field824[Statics.field1369 + 1];
            if (Statics.field454.field1084 != null && Statics.field454.field1084.field3328) {
                field824[++Statics.field1369 - 1] = var17;
            } else {
                field824[++Statics.field1369 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field829[--Statics.field4306];
            field824[++Statics.field1369 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1369 -= 2;
            field829[++Statics.field4306 - 1] = class344.method1958(class345.method4433(field824[Statics.field1369], field824[Statics.field1369 + 1], Statics.field1773));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field824[--Statics.field1369];
            Statics.field4306 -= 2;
            int var20 = field829[Statics.field4306];
            int var21 = field829[Statics.field4306 + 1];
            byte[] var22 = Statics.field1048.method5179(var21, 0);
            class350 var23 = new class350(var22);
            field829[++Statics.field4306 - 1] = var23.method5735(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field824[--Statics.field1369];
            Statics.field4306 -= 2;
            int var25 = field829[Statics.field4306];
            int var26 = field829[Statics.field4306 + 1];
            byte[] var27 = Statics.field1048.method5179(var26, 0);
            class350 var28 = new class350(var27);
            field829[++Statics.field4306 - 1] = var28.method5731(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1369 -= 2;
            String var29 = field824[Statics.field1369];
            String var30 = field824[Statics.field1369 + 1];
            if (field829[--Statics.field4306] == 1) {
                field824[++Statics.field1369 - 1] = var29;
            } else {
                field824[++Statics.field1369 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field824[--Statics.field1369];
            field824[++Statics.field1369 - 1] = class351.method5714(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field824[--Statics.field1369];
            int var33 = field829[--Statics.field4306];
            field824[++Statics.field1369 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = class344.method2619((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = class344.method2489((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = class344.method1947((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = Statics.method2457((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field824[--Statics.field1369];
            if (var38 == null) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field824[--Statics.field1369];
            Statics.field4306 -= 2;
            int var40 = field829[Statics.field4306];
            int var41 = field829[Statics.field4306 + 1];
            field824[++Statics.field1369 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field824[--Statics.field1369];
            StringBuilder var43 = new StringBuilder(var42.length());
            boolean var44 = false;
            for (int var45 = 0; var45 < var42.length(); var45++) {
                char var46 = var42.charAt(var45);
                if (var46 == '<') {
                    var44 = true;
                } else if (var46 == '>') {
                    var44 = false;
                } else if (!var44) {
                    var43.append(var46);
                }
            }
            field824[++Statics.field1369 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field824[--Statics.field1369];
            int var48 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1369 -= 2;
            String var49 = field824[Statics.field1369];
            String var50 = field824[Statics.field1369 + 1];
            int var51 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field824[--Statics.field1369];
            field824[++Statics.field1369 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nm.ae(ILbz;ZB)I")
    public static int method6178(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field829[--Statics.field4306];
            field824[++Statics.field1369 - 1] = class188.method2231(var3).field2110;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field4306 -= 2;
            int var4 = field829[Statics.field4306];
            int var5 = field829[Statics.field4306 + 1];
            class188 var6 = class188.method2231(var4);
            if (var5 < 1 || var5 > 5 || var6.field2113[var5 - 1] == null) {
                field824[++Statics.field1369 - 1] = "";
            } else {
                field824[++Statics.field1369 - 1] = var6.field2113[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field4306 -= 2;
            int var7 = field829[Statics.field4306];
            int var8 = field829[Statics.field4306 + 1];
            class188 var9 = class188.method2231(var7);
            if (var8 < 1 || var8 > 5 || var9.field2088[var8 - 1] == null) {
                field824[++Statics.field1369 - 1] = "";
            } else {
                field824[++Statics.field1369 - 1] = var9.field2088[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = class188.method2231(var10).field2111;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = class188.method2231(var11).field2134 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field829[--Statics.field4306];
            class188 var13 = class188.method2231(var12);
            if (var13.field2131 == -1 && var13.field2130 >= 0) {
                field829[++Statics.field4306 - 1] = var13.field2130;
            } else {
                field829[++Statics.field4306 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field829[--Statics.field4306];
            class188 var15 = class188.method2231(var14);
            if (var15.field2131 >= 0 && var15.field2130 >= 0) {
                field829[++Statics.field4306 - 1] = var15.field2130;
            } else {
                field829[++Statics.field4306 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = class188.method2231(var16).field2101 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field829[--Statics.field4306];
            class188 var18 = class188.method2231(var17);
            if (var18.field2143 == -1 && var18.field2142 >= 0) {
                field829[++Statics.field4306 - 1] = var18.field2142;
            } else {
                field829[++Statics.field4306 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field829[--Statics.field4306];
            class188 var20 = class188.method2231(var19);
            if (var20.field2143 >= 0 && var20.field2142 >= 0) {
                field829[++Statics.field4306 - 1] = var20.field2142;
            } else {
                field829[++Statics.field4306 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field824[--Statics.field1369];
            int var22 = field829[--Statics.field4306];
            Statics.method2669(var21, var22 == 1);
            field829[++Statics.field4306 - 1] = Statics.field1045;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field3185 == null || Statics.field3303 >= Statics.field1045) {
                field829[++Statics.field4306 - 1] = -1;
            } else {
                field829[++Statics.field4306 - 1] = Statics.field3185[++Statics.field3303 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field3303 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field829[--Statics.field4306];
            int var24 = class188.method2231(var23).method3348();
            if (var24 == -1) {
                field829[++Statics.field4306 - 1] = var24;
            } else {
                field829[++Statics.field4306 - 1] = var24 + 1;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bc.as(ILbz;ZB)I")
    public static int method1781(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field829[++Statics.field4306 - 1] = client.field710;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field4306 -= 3;
            client.field710 = field829[Statics.field4306];
            Statics.field1106 = class461.method5094(field829[Statics.field4306 + 1]);
            if (Statics.field1106 == null) {
                Statics.field1106 = class461.field4824;
            }
            client.field708 = field829[Statics.field4306 + 2];
            class265 var3 = class265.method349(class263.field3000, client.field536.field1339);
            var3.field3039.method6912(client.field710);
            var3.field3039.method6912(Statics.field1106.field4825);
            var3.field3039.method6912(client.field708);
            client.field536.method2330(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field824[--Statics.field1369];
            Statics.field4306 -= 2;
            int var5 = field829[Statics.field4306];
            int var6 = field829[Statics.field4306 + 1];
            class265 var7 = class265.method349(class263.field3021, client.field536.field1339);
            var7.field3039.method6912(class444.method5118(var4) + 2);
            var7.field3039.method6950(var4);
            var7.field3039.method6912(var5 - 1);
            var7.field3039.method6912(var6);
            client.field536.method2330(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field4306 -= 2;
            int var8 = field829[Statics.field4306];
            int var9 = field829[Statics.field4306 + 1];
            class58 var10 = class99.method4877(var8, var9);
            if (var10 == null) {
                field829[++Statics.field4306 - 1] = -1;
                field829[++Statics.field4306 - 1] = 0;
                field824[++Statics.field1369 - 1] = "";
                field824[++Statics.field1369 - 1] = "";
                field824[++Statics.field1369 - 1] = "";
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = var10.field466;
                field829[++Statics.field4306 - 1] = var10.field458;
                field824[++Statics.field1369 - 1] = var10.field460 == null ? "" : var10.field460;
                field824[++Statics.field1369 - 1] = var10.field464 == null ? "" : var10.field464;
                field824[++Statics.field1369 - 1] = var10.field463 == null ? "" : var10.field463;
                field829[++Statics.field4306 - 1] = var10.method987() ? 1 : (var10.method985() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field829[--Statics.field4306];
            class58 var12 = class99.method2089(var11);
            if (var12 == null) {
                field829[++Statics.field4306 - 1] = -1;
                field829[++Statics.field4306 - 1] = 0;
                field824[++Statics.field1369 - 1] = "";
                field824[++Statics.field1369 - 1] = "";
                field824[++Statics.field1369 - 1] = "";
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = var12.field459;
                field829[++Statics.field4306 - 1] = var12.field458;
                field824[++Statics.field1369 - 1] = var12.field460 == null ? "" : var12.field460;
                field824[++Statics.field1369 - 1] = var12.field464 == null ? "" : var12.field464;
                field824[++Statics.field1369 - 1] = var12.field463 == null ? "" : var12.field463;
                field829[++Statics.field4306 - 1] = var12.method987() ? 1 : (var12.method985() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field1106 == null) {
                field829[++Statics.field4306 - 1] = -1;
            } else {
                field829[++Statics.field4306 - 1] = Statics.field1106.field4825;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field824[--Statics.field1369];
            int var14 = field829[--Statics.field4306];
            class265 var15 = class466.method4611(var14, var13, Statics.field1773, -1);
            client.field536.method2330(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1369 -= 2;
            String var16 = field824[Statics.field1369];
            String var17 = field824[Statics.field1369 + 1];
            class265 var18 = class265.method349(class263.field3008, client.field536.field1339);
            var18.field3039.method6913(0);
            int var19 = var18.field3039.field4708;
            var18.field3039.method6950(var16);
            class283.method4543(var18.field3039, var17);
            var18.field3039.method6925(var18.field3039.field4708 - var19);
            client.field536.method2330(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field824[--Statics.field1369];
            Statics.field4306 -= 2;
            int var21 = field829[Statics.field4306];
            int var22 = field829[Statics.field4306 + 1];
            class265 var23 = class466.method4611(var21, var20, Statics.field1773, var22);
            client.field536.method2330(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field454 == null || Statics.field454.field1110 == null) {
                var24 = "";
            } else {
                var24 = Statics.field454.field1110.method7491();
            }
            field824[++Statics.field1369 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field829[++Statics.field4306 - 1] = client.field708;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = class99.method4363(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = class99.method195(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = class99.method6651(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field824[--Statics.field1369];
            client.method576(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field712 = field824[--Statics.field1369].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field824[++Statics.field1369 - 1] = client.field712;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field824[--Statics.field1369];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5024) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 5025) {
            Statics.field4306++;
            return 1;
        } else if (arg0 == 5030) {
            Statics.field4306 -= 2;
            int var30 = field829[Statics.field4306];
            int var31 = field829[Statics.field4306 + 1];
            class58 var32 = class99.method4877(var30, var31);
            if (var32 == null) {
                field829[++Statics.field4306 - 1] = -1;
                field829[++Statics.field4306 - 1] = 0;
                field824[++Statics.field1369 - 1] = "";
                field824[++Statics.field1369 - 1] = "";
                field824[++Statics.field1369 - 1] = "";
                field829[++Statics.field4306 - 1] = 0;
                field824[++Statics.field1369 - 1] = "";
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = var32.field466;
                field829[++Statics.field4306 - 1] = var32.field458;
                field824[++Statics.field1369 - 1] = var32.field460 == null ? "" : var32.field460;
                field824[++Statics.field1369 - 1] = var32.field464 == null ? "" : var32.field464;
                field824[++Statics.field1369 - 1] = var32.field463 == null ? "" : var32.field463;
                field829[++Statics.field4306 - 1] = var32.method987() ? 1 : (var32.method985() ? 2 : 0);
                field824[++Statics.field1369 - 1] = "";
                field829[++Statics.field4306 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field829[--Statics.field4306];
            class58 var34 = class99.method2089(var33);
            if (var34 == null) {
                field829[++Statics.field4306 - 1] = -1;
                field829[++Statics.field4306 - 1] = 0;
                field824[++Statics.field1369 - 1] = "";
                field824[++Statics.field1369 - 1] = "";
                field824[++Statics.field1369 - 1] = "";
                field829[++Statics.field4306 - 1] = 0;
                field824[++Statics.field1369 - 1] = "";
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = var34.field459;
                field829[++Statics.field4306 - 1] = var34.field458;
                field824[++Statics.field1369 - 1] = var34.field460 == null ? "" : var34.field460;
                field824[++Statics.field1369 - 1] = var34.field464 == null ? "" : var34.field464;
                field824[++Statics.field1369 - 1] = var34.field463 == null ? "" : var34.field463;
                field829[++Statics.field4306 - 1] = var34.method987() ? 1 : (var34.method985() ? 2 : 0);
                field824[++Statics.field1369 - 1] = "";
                field829[++Statics.field4306 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fx.ay(ILbz;ZI)I")
    public static int method2935(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field829[++Statics.field4306 - 1] = client.method356();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field829[--Statics.field4306];
            if (var3 == 1 || var3 == 2) {
                client.method2737(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field829[++Statics.field4306 - 1] = Statics.field4303.method2113();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field829[--Statics.field4306];
            if (var4 == 1 || var4 == 2) {
                Statics.field4303.method2126(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 5311) {
            Statics.field4306 -= 2;
            return 1;
        } else if (arg0 == 5312) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 5350) {
            Statics.field1369 -= 2;
            Statics.field4306--;
            return 1;
        } else if (arg0 == 5351) {
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hd.ag(ILbz;ZI)I")
    public static int method4438(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field4306 -= 2;
            int var3 = field829[Statics.field4306];
            int var4 = field829[Statics.field4306 + 1];
            if (!client.field737) {
                client.field557 = var3;
                client.field558 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field829[++Statics.field4306 - 1] = client.field557;
            return 1;
        } else if (arg0 == 5506) {
            field829[++Statics.field4306 - 1] = client.field558;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field829[--Statics.field4306];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field599 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field829[++Statics.field4306 - 1] = client.field599;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bz.ad(ILbz;ZI)I")
    public static int method1845(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field537 = 250;
            return 1;
        } else if (arg0 == 5631 || arg0 == 5633) {
            Statics.field1369 -= 2;
            return 1;
        } else if (arg0 == 5632) {
            field829[++Statics.field4306 - 1] = 26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ki.af(II)I")
    public static int method5090(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("bg.aw(II)I")
    public static int method1563(int arg0) {
        return (int) ((Math.log((double) arg0) / field825 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("jn.ai(ILbz;ZI)I")
    public static int method4634(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field4306 -= 2;
            client.field562 = (short) method5090(field829[Statics.field4306]);
            if (client.field562 <= 0) {
                client.field562 = 256;
            }
            client.field745 = (short) method5090(field829[Statics.field4306 + 1]);
            if (client.field745 <= 0) {
                client.field745 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field4306 -= 2;
            client.field746 = (short) field829[Statics.field4306];
            if (client.field746 <= 0) {
                client.field746 = 256;
            }
            client.field770 = (short) field829[Statics.field4306 + 1];
            if (client.field770 <= 0) {
                client.field770 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field4306 -= 4;
            client.field748 = (short) field829[Statics.field4306];
            if (client.field748 <= 0) {
                client.field748 = 1;
            }
            client.field749 = (short) field829[Statics.field4306 + 1];
            if (client.field749 <= 0) {
                client.field749 = 32767;
            } else if (client.field749 < client.field748) {
                client.field749 = client.field748;
            }
            client.field750 = (short) field829[Statics.field4306 + 2];
            if (client.field750 <= 0) {
                client.field750 = 1;
            }
            client.field725 = (short) field829[Statics.field4306 + 3];
            if (client.field725 <= 0) {
                client.field725 = 32767;
            } else if (client.field725 < client.field750) {
                client.field725 = client.field750;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field571 == null) {
                field829[++Statics.field4306 - 1] = -1;
                field829[++Statics.field4306 - 1] = -1;
            } else {
                client.method2656(0, 0, client.field571.field3373, client.field571.field3427, false);
                field829[++Statics.field4306 - 1] = client.field705;
                field829[++Statics.field4306 - 1] = client.field755;
            }
            return 1;
        } else if (arg0 == 6204) {
            field829[++Statics.field4306 - 1] = client.field746;
            field829[++Statics.field4306 - 1] = client.field770;
            return 1;
        } else if (arg0 == 6205) {
            field829[++Statics.field4306 - 1] = method1563(client.field562);
            field829[++Statics.field4306 - 1] = method1563(client.field745);
            return 1;
        } else if (arg0 == 6220) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field829[++Statics.field4306 - 1] = Statics.field32;
            return 1;
        } else if (arg0 == 6223) {
            field829[++Statics.field4306 - 1] = Statics.field2650;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("be.ap(ILbz;ZB)I")
    public static int method1920(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field829[++Statics.field4306 - 1] = class61.method19() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class61 var3 = class61.method1757();
            if (var3 == null) {
                field829[++Statics.field4306 - 1] = -1;
                field829[++Statics.field4306 - 1] = 0;
                field824[++Statics.field1369 - 1] = "";
                field829[++Statics.field4306 - 1] = 0;
                field829[++Statics.field4306 - 1] = 0;
                field824[++Statics.field1369 - 1] = "";
            } else {
                field829[++Statics.field4306 - 1] = var3.field780;
                field829[++Statics.field4306 - 1] = var3.field781;
                field824[++Statics.field1369 - 1] = var3.field784;
                field829[++Statics.field4306 - 1] = var3.field785;
                field829[++Statics.field4306 - 1] = var3.field782;
                field824[++Statics.field1369 - 1] = var3.field783;
            }
            return 1;
        } else if (arg0 == 6502) {
            class61 var4 = class61.method1608();
            if (var4 == null) {
                field829[++Statics.field4306 - 1] = -1;
                field829[++Statics.field4306 - 1] = 0;
                field824[++Statics.field1369 - 1] = "";
                field829[++Statics.field4306 - 1] = 0;
                field829[++Statics.field4306 - 1] = 0;
                field824[++Statics.field1369 - 1] = "";
            } else {
                field829[++Statics.field4306 - 1] = var4.field780;
                field829[++Statics.field4306 - 1] = var4.field781;
                field824[++Statics.field1369 - 1] = var4.field784;
                field829[++Statics.field4306 - 1] = var4.field785;
                field829[++Statics.field4306 - 1] = var4.field782;
                field824[++Statics.field1369 - 1] = var4.field783;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field829[--Statics.field4306];
            class61 var6 = null;
            for (int var7 = 0; var7 < class61.field773; var7++) {
                if (Statics.field775[var7].field780 == var5) {
                    var6 = Statics.field775[var7];
                    break;
                }
            }
            if (var6 == null) {
                field829[++Statics.field4306 - 1] = -1;
                field829[++Statics.field4306 - 1] = 0;
                field824[++Statics.field1369 - 1] = "";
                field829[++Statics.field4306 - 1] = 0;
                field829[++Statics.field4306 - 1] = 0;
                field824[++Statics.field1369 - 1] = "";
            } else {
                field829[++Statics.field4306 - 1] = var6.field780;
                field829[++Statics.field4306 - 1] = var6.field781;
                field824[++Statics.field1369 - 1] = var6.field784;
                field829[++Statics.field4306 - 1] = var6.field785;
                field829[++Statics.field4306 - 1] = var6.field782;
                field824[++Statics.field1369 - 1] = var6.field783;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field4306 -= 4;
            int var8 = field829[Statics.field4306];
            boolean var9 = field829[Statics.field4306 + 1] == 1;
            int var10 = field829[Statics.field4306 + 2];
            boolean var11 = field829[Statics.field4306 + 3] == 1;
            class61.method1950(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field829[--Statics.field4306];
            if (var12 >= 0 && var12 < class61.field773) {
                class61 var13 = Statics.field775[var12];
                field829[++Statics.field4306 - 1] = var13.field780;
                field829[++Statics.field4306 - 1] = var13.field781;
                field824[++Statics.field1369 - 1] = var13.field784;
                field829[++Statics.field4306 - 1] = var13.field785;
                field829[++Statics.field4306 - 1] = var13.field782;
                field824[++Statics.field1369 - 1] = var13.field783;
            } else {
                field829[++Statics.field4306 - 1] = -1;
                field829[++Statics.field4306 - 1] = 0;
                field824[++Statics.field1369 - 1] = "";
                field829[++Statics.field4306 - 1] = 0;
                field829[++Statics.field4306 - 1] = 0;
                field824[++Statics.field1369 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field544 = field829[--Statics.field4306] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field4306 -= 2;
            int var14 = field829[Statics.field4306];
            int var15 = field829[Statics.field4306 + 1];
            class184 var16 = class184.method6425(var15);
            if (var16.method3170()) {
                field824[++Statics.field1369 - 1] = class178.method2587(var14).method3105(var15, var16.field1997);
            } else {
                field829[++Statics.field4306 - 1] = class178.method2587(var14).method3074(var15, var16.field1999);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field4306 -= 2;
            int var17 = field829[Statics.field4306];
            int var18 = field829[Statics.field4306 + 1];
            class184 var19 = class184.method6425(var18);
            if (var19.method3170()) {
                field824[++Statics.field1369 - 1] = class187.method2907(var17).method3251(var18, var19.field1997);
            } else {
                field829[++Statics.field4306 - 1] = class187.method2907(var17).method3250(var18, var19.field1999);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field4306 -= 2;
            int var20 = field829[Statics.field4306];
            int var21 = field829[Statics.field4306 + 1];
            class184 var22 = class184.method6425(var21);
            if (var22.method3170()) {
                field824[++Statics.field1369 - 1] = class188.method2231(var20).method3302(var21, var22.field1997);
            } else {
                field829[++Statics.field4306 - 1] = class188.method2231(var20).method3301(var21, var22.field1999);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field4306 -= 2;
            int var23 = field829[Statics.field4306];
            int var24 = field829[Statics.field4306 + 1];
            class184 var25 = class184.method6425(var24);
            if (var25.method3170()) {
                field824[++Statics.field1369 - 1] = class185.method6318(var23).method3198(var24, var25.field1997);
            } else {
                field829[++Statics.field4306 - 1] = class185.method6318(var23).method3201(var24, var25.field1999);
            }
            return 1;
        } else if (arg0 == 6518) {
            field829[++Statics.field4306 - 1] = client.field552 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field829[++Statics.field4306 - 1] = client.field482;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1369--;
            Statics.field4306--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1369--;
            Statics.field4306--;
            return 1;
        } else if (arg0 == 6524) {
            field829[++Statics.field4306 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field829[++Statics.field4306 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field829[++Statics.field4306 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field829[++Statics.field4306 - 1] = client.field483;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("a.az(ILbz;ZI)I")
    public static int method99(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field3173;
            int var4 = (Statics.field454.field1172 >> 7) + Statics.field405;
            int var5 = (Statics.field454.field1155 >> 7) + Statics.field31;
            client.method1760().method6459(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field829[--Statics.field4306];
            String var7 = "";
            class225 var8 = client.method1760().method6477(var6);
            if (var8 != null) {
                var7 = var8.method4161();
            }
            field824[++Statics.field1369 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field829[--Statics.field4306];
            client.method1760().method6460(var9);
            return 1;
        } else if (arg0 == 6603) {
            field829[++Statics.field4306 - 1] = client.method1760().method6474();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field829[--Statics.field4306];
            client.method1760().method6471(var10);
            return 1;
        } else if (arg0 == 6605) {
            field829[++Statics.field4306 - 1] = client.method1760().method6450() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class290 var11 = new class290(field829[--Statics.field4306]);
            client.method1760().method6478(var11.field3320, var11.field3317);
            return 1;
        } else if (arg0 == 6607) {
            class290 var12 = new class290(field829[--Statics.field4306]);
            client.method1760().method6561(var12.field3320, var12.field3317);
            return 1;
        } else if (arg0 == 6608) {
            class290 var13 = new class290(field829[--Statics.field4306]);
            client.method1760().method6510(var13.field3318, var13.field3320, var13.field3317);
            return 1;
        } else if (arg0 == 6609) {
            class290 var14 = new class290(field829[--Statics.field4306]);
            client.method1760().method6557(var14.field3318, var14.field3320, var14.field3317);
            return 1;
        } else if (arg0 == 6610) {
            field829[++Statics.field4306 - 1] = client.method1760().method6482();
            field829[++Statics.field4306 - 1] = client.method1760().method6483();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field829[--Statics.field4306];
            class225 var16 = client.method1760().method6477(var15);
            if (var16 == null) {
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = var16.method4171().method4907();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field829[--Statics.field4306];
            class225 var18 = client.method1760().method6477(var17);
            if (var18 == null) {
                field829[++Statics.field4306 - 1] = 0;
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = (var18.method4165() - var18.method4164() + 1) * 64;
                field829[++Statics.field4306 - 1] = (var18.method4190() - var18.method4166() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field829[--Statics.field4306];
            class225 var20 = client.method1760().method6477(var19);
            if (var20 == null) {
                field829[++Statics.field4306 - 1] = 0;
                field829[++Statics.field4306 - 1] = 0;
                field829[++Statics.field4306 - 1] = 0;
                field829[++Statics.field4306 - 1] = 0;
            } else {
                field829[++Statics.field4306 - 1] = var20.method4164() * 64;
                field829[++Statics.field4306 - 1] = var20.method4166() * 64;
                field829[++Statics.field4306 - 1] = var20.method4165() * 64 + 64 - 1;
                field829[++Statics.field4306 - 1] = var20.method4190() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field829[--Statics.field4306];
            class225 var22 = client.method1760().method6477(var21);
            if (var22 == null) {
                field829[++Statics.field4306 - 1] = -1;
            } else {
                field829[++Statics.field4306 - 1] = var22.method4163();
            }
            return 1;
        } else if (arg0 == 6615) {
            class290 var23 = client.method1760().method6484();
            if (var23 == null) {
                field829[++Statics.field4306 - 1] = -1;
                field829[++Statics.field4306 - 1] = -1;
            } else {
                field829[++Statics.field4306 - 1] = var23.field3320;
                field829[++Statics.field4306 - 1] = var23.field3317;
            }
            return 1;
        } else if (arg0 == 6616) {
            field829[++Statics.field4306 - 1] = client.method1760().method6481();
            return 1;
        } else if (arg0 == 6617) {
            class290 var24 = new class290(field829[--Statics.field4306]);
            class225 var25 = client.method1760().method6462();
            if (var25 == null) {
                field829[++Statics.field4306 - 1] = -1;
                field829[++Statics.field4306 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4187(var24.field3318, var24.field3320, var24.field3317);
            if (var26 == null) {
                field829[++Statics.field4306 - 1] = -1;
                field829[++Statics.field4306 - 1] = -1;
            } else {
                field829[++Statics.field4306 - 1] = var26[0];
                field829[++Statics.field4306 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class290 var27 = new class290(field829[--Statics.field4306]);
            class225 var28 = client.method1760().method6462();
            if (var28 == null) {
                field829[++Statics.field4306 - 1] = -1;
                field829[++Statics.field4306 - 1] = -1;
                return 1;
            }
            class290 var29 = var28.method4200(var27.field3320, var27.field3317);
            if (var29 == null) {
                field829[++Statics.field4306 - 1] = -1;
            } else {
                field829[++Statics.field4306 - 1] = var29.method4907();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field4306 -= 2;
            int var30 = field829[Statics.field4306];
            class290 var31 = new class290(field829[Statics.field4306 + 1]);
            method259(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field4306 -= 2;
            int var32 = field829[Statics.field4306];
            class290 var33 = new class290(field829[Statics.field4306 + 1]);
            method259(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field4306 -= 2;
            int var34 = field829[Statics.field4306];
            class290 var35 = new class290(field829[Statics.field4306 + 1]);
            class225 var36 = client.method1760().method6477(var34);
            if (var36 == null) {
                field829[++Statics.field4306 - 1] = 0;
                return 1;
            } else {
                field829[++Statics.field4306 - 1] = var36.method4153(var35.field3318, var35.field3320, var35.field3317) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field829[++Statics.field4306 - 1] = client.method1760().method6599();
            field829[++Statics.field4306 - 1] = client.method1760().method6583();
            return 1;
        } else if (arg0 == 6623) {
            class290 var37 = new class290(field829[--Statics.field4306]);
            class225 var38 = client.method1760().method6458(var37.field3318, var37.field3320, var37.field3317);
            if (var38 == null) {
                field829[++Statics.field4306 - 1] = -1;
            } else {
                field829[++Statics.field4306 - 1] = var38.method4158();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method1760().method6487(field829[--Statics.field4306]);
            return 1;
        } else if (arg0 == 6625) {
            client.method1760().method6488();
            return 1;
        } else if (arg0 == 6626) {
            client.method1760().method6489(field829[--Statics.field4306]);
            return 1;
        } else if (arg0 == 6627) {
            client.method1760().method6494();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field829[--Statics.field4306] == 1;
            client.method1760().method6448(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field829[--Statics.field4306];
            client.method1760().method6537(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field829[--Statics.field4306];
            client.method1760().method6493(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method1760().method6563();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field829[--Statics.field4306] == 1;
            client.method1760().method6495(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field4306 -= 2;
            int var43 = field829[Statics.field4306];
            boolean var44 = field829[Statics.field4306 + 1] == 1;
            client.method1760().method6577(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field4306 -= 2;
            int var45 = field829[Statics.field4306];
            boolean var46 = field829[Statics.field4306 + 1] == 1;
            client.method1760().method6497(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field829[++Statics.field4306 - 1] = client.method1760().method6498() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = client.method1760().method6499(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field829[--Statics.field4306];
            field829[++Statics.field4306 - 1] = client.method1760().method6500(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field4306 -= 2;
            int var49 = field829[Statics.field4306];
            class290 var50 = new class290(field829[Statics.field4306 + 1]);
            class290 var51 = client.method1760().method6503(var49, var50);
            if (var51 == null) {
                field829[++Statics.field4306 - 1] = -1;
            } else {
                field829[++Statics.field4306 - 1] = var51.method4907();
            }
            return 1;
        } else if (arg0 == 6639) {
            class243 var52 = client.method1760().method6505();
            if (var52 == null) {
                field829[++Statics.field4306 - 1] = -1;
                field829[++Statics.field4306 - 1] = -1;
            } else {
                field829[++Statics.field4306 - 1] = var52.method4097();
                field829[++Statics.field4306 - 1] = var52.field2864.method4907();
            }
            return 1;
        } else if (arg0 == 6640) {
            class243 var53 = client.method1760().method6506();
            if (var53 == null) {
                field829[++Statics.field4306 - 1] = -1;
                field829[++Statics.field4306 - 1] = -1;
            } else {
                field829[++Statics.field4306 - 1] = var53.method4097();
                field829[++Statics.field4306 - 1] = var53.field2864.method4907();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field829[--Statics.field4306];
            class171 var55 = class171.method3061(var54);
            if (var55.field1817 == null) {
                field824[++Statics.field1369 - 1] = "";
            } else {
                field824[++Statics.field1369 - 1] = var55.field1817;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field829[--Statics.field4306];
            class171 var57 = class171.method3061(var56);
            field829[++Statics.field4306 - 1] = var57.field1826;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field829[--Statics.field4306];
            class171 var59 = class171.method3061(var58);
            if (var59 == null) {
                field829[++Statics.field4306 - 1] = -1;
            } else {
                field829[++Statics.field4306 - 1] = var59.field1834;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field829[--Statics.field4306];
            class171 var61 = class171.method3061(var60);
            if (var61 == null) {
                field829[++Statics.field4306 - 1] = -1;
            } else {
                field829[++Statics.field4306 - 1] = var61.field1822;
            }
            return 1;
        } else if (arg0 == 6697) {
            field829[++Statics.field4306 - 1] = Statics.field1747.field2889;
            return 1;
        } else if (arg0 == 6698) {
            field829[++Statics.field4306 - 1] = Statics.field1747.field2886.method4907();
            return 1;
        } else if (arg0 == 6699) {
            field829[++Statics.field4306 - 1] = Statics.field1747.field2888.method4907();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ca.an(ILbz;ZB)I")
    public static int method2380(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6700 || arg0 == 6702 || arg0 == 6704 || arg0 == 6706 || arg0 == 6708) {
            Statics.field4306 -= 2;
            Statics.field1369--;
            return 1;
        } else if (arg0 == 6701 || arg0 == 6703 || arg0 == 6705 || arg0 == 6707 || arg0 == 6709) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 6750) {
            field824[++Statics.field1369 - 1] = "";
            return 1;
        } else if (arg0 == 6751 || arg0 == 6752 || arg0 == 6753) {
            field829[++Statics.field4306 - 1] = -1;
            return 1;
        } else if (arg0 == 6754) {
            int var3 = field829[--Statics.field4306];
            class178 var4 = class178.method2587(var3);
            field824[++Statics.field1369 - 1] = var4 == null ? "" : var4.field1936;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ak.ah(ILbz;ZI)I")
    public static int method564(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6800) {
            field824[++Statics.field1369 - 1] = "";
            return 1;
        } else if (arg0 == 6801 || arg0 == 6802) {
            field829[++Statics.field4306 - 1] = -1;
            return 1;
        } else if (arg0 == 6809) {
            int var3 = field829[--Statics.field4306];
            class187 var4 = class187.method2907(var3);
            field824[++Statics.field1369 - 1] = var4 == null ? "" : var4.field2046;
            return 1;
        } else if (arg0 == 6850) {
            field824[++Statics.field1369 - 1] = "";
            return 1;
        } else if (arg0 == 6851 || arg0 == 6852) {
            field829[++Statics.field4306 - 1] = -1;
            return 1;
        } else if (arg0 == 6853) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("es.aa(ILbz;ZB)I")
    public static int method2668(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6900) {
            field824[++Statics.field1369 - 1] = "";
            return 1;
        } else if (arg0 == 6950) {
            field829[++Statics.field4306 - 1] = -1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("nk.at(ILbz;ZI)I")
    public static int method6176(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7000 || arg0 == 7005 || arg0 == 7010 || arg0 == 7015 || arg0 == 7020 || arg0 == 7025 || arg0 == 7030 || arg0 == 7035) {
            Statics.field4306 -= 5;
            return 1;
        } else if (arg0 == 7001 || arg0 == 7002 || arg0 == 7011 || arg0 == 7012 || arg0 == 7021 || arg0 == 7022) {
            Statics.field4306 -= 3;
            return 1;
        } else if (arg0 == 7003 || arg0 == 7013 || arg0 == 7023) {
            Statics.field4306 -= 2;
            return 1;
        } else if (arg0 == 7006 || arg0 == 7007 || arg0 == 7016 || arg0 == 7017 || arg0 == 7026 || arg0 == 7027) {
            Statics.field4306 -= 2;
            return 1;
        } else if (arg0 == 7008 || arg0 == 7018 || arg0 == 7028) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 7031 || arg0 == 7032) {
            Statics.field1369--;
            Statics.field4306--;
            return 1;
        } else if (arg0 == 7033) {
            Statics.field1369--;
            return 1;
        } else if (arg0 == 7036 || arg0 == 7037) {
            Statics.field4306 -= 2;
            return 1;
        } else if (arg0 == 7038) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 7004 || arg0 == 7009 || arg0 == 7014 || arg0 == 7019 || arg0 == 7024 || arg0 == 7029 || arg0 == 7034 || arg0 == 7039) {
            Statics.field4306--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kg.bq(ILbz;ZI)I")
    public static int method5116(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7100) {
            Statics.field4306++;
            return 1;
        } else if (arg0 == 7101) {
            Statics.field1369 += 2;
            return 1;
        } else if (arg0 == 7102 || arg0 == 7103 || arg0 == 7104 || arg0 == 7105 || arg0 == 7109) {
            Statics.field4306++;
            return 1;
        } else if (arg0 == 7106) {
            Statics.field4306++;
            return 1;
        } else if (arg0 == 7107) {
            Statics.field4306++;
            return 1;
        } else if (arg0 == 7108) {
            field829[++Statics.field4306 - 1] = client.method2890() ? 1 : 0;
            return 1;
        } else if (arg0 == 7110) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 7120) {
            Statics.field4306--;
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 7121) {
            Statics.field4306 -= 2;
            field829[++Statics.field4306 - 1] = -1;
            return 1;
        } else if (arg0 == 7122) {
            Statics.field4306 -= 2;
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dy.bn(ILbz;ZI)I")
    public static int method2440(int arg0, class72 arg1, boolean arg2) {
        if (arg0 >= 7200 && arg0 < 7204) {
            Statics.field4306 -= 5;
            field829[++Statics.field4306 - 1] = -1;
            return 1;
        } else if (arg0 == 7204) {
            Statics.field4306 -= 6;
            field829[++Statics.field4306 - 1] = -1;
            return 1;
        } else if (arg0 >= 7205 && arg0 < 7209) {
            field829[Statics.field4306 - 1] = -1;
            return 1;
        } else if (arg0 == 7209) {
            Statics.field4306 -= 2;
            field829[++Statics.field4306 - 1] = -1;
            return 1;
        } else if (arg0 >= 7210 && arg0 < 7214) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 7214) {
            Statics.field4306 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fv.bl(ILbz;ZI)I")
    public static int method3005(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7400) {
            Statics.field4306--;
            Statics.field1369--;
            return 1;
        } else if (arg0 == 7401) {
            Statics.field4306--;
            Statics.field1369--;
            return 1;
        } else if (arg0 == 7402) {
            Statics.field4306 -= 2;
            Statics.field1369--;
            return 1;
        } else if (arg0 == 7403) {
            Statics.field4306 -= 2;
            Statics.field1369--;
            return 1;
        } else if (arg0 == 7404) {
            Statics.field4306--;
            Statics.field1369--;
            return 1;
        } else if (arg0 == 7405) {
            Statics.field4306 -= 2;
            return 1;
        } else if (arg0 == 7406) {
            Statics.field4306--;
            field824[++Statics.field1369 - 1] = "";
            return 1;
        } else if (arg0 == 7407) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 7408) {
            Statics.field4306 -= 2;
            Statics.field1369--;
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 7409) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 7463) {
            boolean var3 = field829[--Statics.field4306] == 1;
            client.method995(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gz.bv(ILbz;ZI)I")
    public static int method3165(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field829[--Statics.field4306];
            Object var45 = method2475(var44);
            int var46 = field829[--Statics.field4306];
            class438 var47 = Statics.method984(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class440.method4928(var46);
            Statics.field1282 = var47.method6830(var45, var48);
            if (Statics.field1282 == null) {
                client.field765 = -1;
                Statics.field3548 = null;
                if (arg0 == 7500) {
                    field829[++Statics.field4306 - 1] = 0;
                }
            } else {
                client.field765 = class440.method2761(var46);
                Statics.field3548 = Statics.field1282.iterator();
                if (arg0 == 7500) {
                    field829[++Statics.field4306 - 1] = Statics.field1282.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field3548 != null && Statics.field3548.hasNext()) {
                field829[++Statics.field4306 - 1] = (Integer) Statics.field3548.next();
            } else {
                field829[++Statics.field4306 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field4306 -= 3;
            int var3 = field829[Statics.field4306];
            int var4 = field829[Statics.field4306 + 1];
            int var5 = field829[Statics.field4306 + 2];
            int var6 = class440.method2761(var4);
            int var7 = class440.method2681(var4);
            int var8 = class440.method4928(var4);
            class439 var9 = class439.method2382(var3);
            class437 var10 = class437.method5176(var6);
            int[] var11 = var10.field4669[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method6841(var7);
            if (var14 == null && var10.field4672 != null) {
                var14 = var10.field4672[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class434 var17 = class432.method280(var16);
                    if (class434.field4656 == var17) {
                        field824[++Statics.field1369 - 1] = "";
                    } else {
                        field829[++Statics.field4306 - 1] = class432.method5834(var16);
                    }
                }
                return 1;
            }
            int var18 = var14.length / var11.length;
            if (var5 < 0 || var5 >= var18) {
                throw new RuntimeException();
            }
            for (int var19 = var12; var19 < var13; var19++) {
                int var20 = var11.length * var5 + var19;
                class434 var21 = class432.method280(var11[var19]);
                if (class434.field4656 == var21) {
                    field824[++Statics.field1369 - 1] = (String) var14[var20];
                } else {
                    field829[++Statics.field4306 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field4306 -= 2;
            int var22 = field829[Statics.field4306];
            int var23 = field829[Statics.field4306 + 1];
            int var24 = 0;
            int var25 = class440.method2761(var23);
            int var26 = class440.method2681(var23);
            class439 var27 = class439.method2382(var22);
            class437 var28 = class437.method5176(var25);
            int[] var29 = var28.field4669[var26];
            Object[] var30 = var27.method6841(var26);
            if (var30 == null && var28.field4672 != null) {
                var30 = var28.field4672[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field829[++Statics.field4306 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7509) {
            Statics.field4306--;
            int var41 = field829[Statics.field4306];
            class438 var42 = client.method2515(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field1282 = var42.method6830(0, 0);
            int var43 = 0;
            if (Statics.field1282 != null) {
                client.field765 = var41;
                Statics.field3548 = Statics.field1282.iterator();
                var43 = Statics.field1282.size();
            }
            if (arg0 == 7504) {
                field829[++Statics.field4306 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field829[--Statics.field4306];
            class439 var32 = class439.method2382(var31);
            field829[++Statics.field4306 - 1] = var32.field4678;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field829[--Statics.field4306];
            int var34 = -1;
            if (Statics.field1282 != null && var33 >= 0 && var33 < Statics.field1282.size()) {
                var34 = (Integer) Statics.field1282.get(var33);
            }
            field829[++Statics.field4306 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7510) {
            int var35 = field829[--Statics.field4306];
            Object var36 = method2475(var35);
            int var37 = field829[--Statics.field4306];
            class438 var38 = Statics.method984(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class440.method2761(var37) != client.field765) {
                throw new RuntimeException();
            } else if (Statics.field1282 == null && Statics.field1282.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class440.method4928(var37);
                List var40 = var38.method6830(var36, var39);
                Statics.field1282 = new LinkedList(Statics.field1282);
                if (var40 == null) {
                    Statics.field1282.clear();
                } else {
                    Statics.field1282.retainAll(var40);
                }
                Statics.field3548 = Statics.field1282.iterator();
                if (arg0 == 7507) {
                    field829[++Statics.field4306 - 1] = Statics.field1282.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ch.bu(ILbz;ZI)I")
    public static int method1970(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7600) {
            Statics.field1369--;
            return 1;
        } else if (arg0 == 7601) {
            Statics.field1369--;
            return 1;
        } else if (arg0 == 7602) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 7603) {
            Statics.field4306--;
            field824[++Statics.field1369 - 1] = "";
            return 1;
        } else if (arg0 == 7604) {
            Statics.field1369--;
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 7605) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 7606) {
            Statics.field4306 -= 2;
            field829[++Statics.field4306 - 1] = 0;
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 7607) {
            return 1;
        } else if (arg0 == 7608) {
            Statics.field1369--;
            return 1;
        } else if (arg0 == 7609) {
            Statics.field1369--;
            return 1;
        } else if (arg0 == 7610) {
            Statics.field1369--;
            return 1;
        } else if (arg0 == 7611) {
            Statics.field4306--;
            return 1;
        } else if (arg0 == 7612) {
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else if (arg0 == 7613) {
            Statics.field4306--;
            field824[++Statics.field1369 - 1] = "";
            return 1;
        } else if (arg0 == 7614) {
            return 1;
        } else if (arg0 == 7615) {
            Statics.field1369--;
            return 1;
        } else if (arg0 == 7616) {
            Statics.field1369--;
            Statics.field4306 -= 2;
            return 1;
        } else if (arg0 == 7617) {
            Statics.field1369--;
            field829[++Statics.field4306 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("js.bb(II)V")
    public static void method4878(int arg0) {
        if (arg0 == -1 || !class295.method3187(arg0)) {
            return;
        }
        class295[] var1 = Statics.field4250[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class295 var3 = var1[var2];
            if (var3.field3450 != null) {
                class81 var4 = new class81();
                var4.field1030 = var3;
                var4.field1037 = var3.field3450;
                Statics.method1756(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("p.bt(ILku;ZI)V")
    public static void method259(int arg0, class290 arg1, boolean arg2) {
        class225 var3 = client.method1760().method6477(arg0);
        int var4 = Statics.field454.field1105;
        int var5 = (Statics.field454.field1172 >> 7) + Statics.field405;
        int var6 = (Statics.field454.field1155 >> 7) + Statics.field31;
        class290 var7 = new class290(var4, var5, var6);
        client.method1760().method6608(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("dz.bd(IB)Ljava/lang/Object;")
    public static Object method2475(int arg0) {
        return Statics.method2458((class434) class330.method525(Statics.method6797(), arg0));
    }
}
