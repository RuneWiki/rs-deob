package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("bq")
public class class64 {

    @ObfuscatedName("bq.a")
    public static int[] field816 = new int[5];

    @ObfuscatedName("bq.u")
    public static int[][] field826 = new int[5][5000];

    @ObfuscatedName("bq.e")
    public static int[] field831 = new int[1000];

    @ObfuscatedName("bq.y")
    public static String[] field822 = new String[1000];

    @ObfuscatedName("bq.f")
    public static int field824 = 0;

    @ObfuscatedName("bq.s")
    public static class57[] field825 = new class57[50];

    @ObfuscatedName("bq.b")
    public static Calendar field815 = Calendar.getInstance();

    @ObfuscatedName("bq.t")
    public static final String[] field827 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("bq.p")
    public static boolean field830 = false;

    @ObfuscatedName("bq.w")
    public static boolean field828 = false;

    @ObfuscatedName("bq.i")
    public static ArrayList field819 = new ArrayList();

    @ObfuscatedName("bq.aq")
    public static int field814 = 0;

    @ObfuscatedName("bq.aw")
    public static final double field832 = Math.log(2.0D);

    public class64() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hm.c(Lcl;IIB)V")
    public static void method3784(class81 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1031;
        class72 var5;
        if (class396.method3979(arg0.field1029)) {
            Statics.field1530 = (class204) var3[0];
            class154 var4 = class154.method1007(Statics.field1530.field2215);
            var5 = class72.method1942(arg0.field1029, var4.field1623, var4.field1642);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class72.method3558(var6);
        }
        if (var5 == null) {
            return;
        }
        Statics.field2755 = 0;
        Statics.field823 = 0;
        int var7 = -1;
        int[] var8 = var5.field941;
        int[] var9 = var5.field948;
        byte var10 = -1;
        field824 = 0;
        field830 = false;
        boolean var11 = false;
        int var12 = 0;
        try {
            Statics.field817 = new int[var5.field950];
            int var13 = 0;
            Statics.field818 = new String[var5.field945];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg0.field1035;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field1030;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field1028 == null ? -1 : arg0.field1028.field3046;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field1037;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field1028 == null ? -1 : arg0.field1028.field3077;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field1032 == null ? -1 : arg0.field1032.field3046;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field1032 == null ? -1 : arg0.field1032.field3077;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field1033;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field1034;
                    }
                    Statics.field817[var13++] = var16;
                } else if (var3[var15] instanceof String) {
                    String var17 = (String) var3[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg0.field1026;
                    }
                    Statics.field818[var14++] = var17;
                }
            }
            field814 = arg0.field1036;
            while (true) {
                var12++;
                if (var12 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var61 = var8[var7];
                if (var61 >= 100) {
                    boolean var48;
                    if (var5.field948[var7] == 1) {
                        var48 = true;
                    } else {
                        var48 = false;
                    }
                    int var49 = method3139(var61, var5, var48);
                    switch(var49) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var61 == 0) {
                    field831[++Statics.field2755 - 1] = var9[var7];
                } else if (var61 == 1) {
                    int var18 = var9[var7];
                    field831[++Statics.field2755 - 1] = class257.field3001[var18];
                } else if (var61 == 2) {
                    int var19 = var9[var7];
                    class257.field3001[var19] = field831[--Statics.field2755];
                    client.method2583(var19);
                } else if (var61 == 3) {
                    field822[++Statics.field823 - 1] = var5.field943[var7];
                } else if (var61 == 6) {
                    var7 += var9[var7];
                } else if (var61 == 7) {
                    Statics.field2755 -= 2;
                    if (field831[Statics.field2755] != field831[Statics.field2755 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 8) {
                    Statics.field2755 -= 2;
                    if (field831[Statics.field2755] == field831[Statics.field2755 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 9) {
                    Statics.field2755 -= 2;
                    if (field831[Statics.field2755] < field831[Statics.field2755 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 10) {
                    Statics.field2755 -= 2;
                    if (field831[Statics.field2755] > field831[Statics.field2755 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 21) {
                    if (field824 == 0) {
                        return;
                    }
                    class57 var21 = field825[--field824];
                    var5 = var21.field447;
                    var8 = var5.field941;
                    var9 = var5.field948;
                    var7 = var21.field452;
                    Statics.field817 = var21.field446;
                    Statics.field818 = var21.field449;
                } else if (var61 == 25) {
                    int var22 = var9[var7];
                    field831[++Statics.field2755 - 1] = class257.method4239(var22);
                } else if (var61 == 27) {
                    int var23 = var9[var7];
                    class257.method976(var23, field831[--Statics.field2755]);
                } else if (var61 == 31) {
                    Statics.field2755 -= 2;
                    if (field831[Statics.field2755] <= field831[Statics.field2755 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 32) {
                    Statics.field2755 -= 2;
                    if (field831[Statics.field2755] >= field831[Statics.field2755 + 1]) {
                        var7 += var9[var7];
                    }
                } else if (var61 == 33) {
                    field831[++Statics.field2755 - 1] = Statics.field817[var9[var7]];
                } else if (var61 == 34) {
                    Statics.field817[var9[var7]] = field831[--Statics.field2755];
                } else if (var61 == 35) {
                    field822[++Statics.field823 - 1] = Statics.field818[var9[var7]];
                } else if (var61 == 36) {
                    Statics.field818[var9[var7]] = field822[--Statics.field823];
                } else if (var61 == 37) {
                    int var24 = var9[var7];
                    Statics.field823 -= var24;
                    String var25 = class319.method4927(field822, Statics.field823, var24);
                    field822[++Statics.field823 - 1] = var25;
                } else if (var61 == 38) {
                    Statics.field2755--;
                } else if (var61 == 39) {
                    Statics.field823--;
                } else if (var61 == 40) {
                    int var26 = var9[var7];
                    class72 var27 = class72.method3558(var26);
                    int[] var28 = new int[var27.field950];
                    String[] var29 = new String[var27.field945];
                    for (int var30 = 0; var30 < var27.field939; var30++) {
                        var28[var30] = field831[Statics.field2755 - var27.field939 + var30];
                    }
                    for (int var31 = 0; var31 < var27.field947; var31++) {
                        var29[var31] = field822[Statics.field823 - var27.field947 + var31];
                    }
                    Statics.field2755 -= var27.field939;
                    Statics.field823 -= var27.field947;
                    class57 var32 = new class57();
                    var32.field447 = var5;
                    var32.field452 = var7;
                    var32.field446 = Statics.field817;
                    var32.field449 = Statics.field818;
                    field825[++field824 - 1] = var32;
                    var5 = var27;
                    var8 = var27.field941;
                    var9 = var27.field948;
                    var7 = -1;
                    Statics.field817 = var28;
                    Statics.field818 = var29;
                } else if (var61 == 42) {
                    field831[++Statics.field2755 - 1] = Statics.field3763.method2149(var9[var7]);
                } else if (var61 == 43) {
                    Statics.field3763.method2148(var9[var7], field831[--Statics.field2755]);
                } else if (var61 == 44) {
                    int var33 = var9[var7] >> 16;
                    int var34 = var9[var7] & 0xFFFF;
                    int var35 = field831[--Statics.field2755];
                    if (var35 < 0 || var35 > 5000) {
                        throw new RuntimeException();
                    }
                    field816[var33] = var35;
                    byte var36 = -1;
                    if (var34 == 105) {
                        var36 = 0;
                    }
                    for (int var37 = 0; var37 < var35; var37++) {
                        field826[var33][var37] = var36;
                    }
                } else if (var61 == 45) {
                    int var38 = var9[var7];
                    int var39 = field831[--Statics.field2755];
                    if (var39 < 0 || var39 >= field816[var38]) {
                        throw new RuntimeException();
                    }
                    field831[++Statics.field2755 - 1] = field826[var38][var39];
                } else if (var61 == 46) {
                    int var40 = var9[var7];
                    Statics.field2755 -= 2;
                    int var41 = field831[Statics.field2755];
                    if (var41 < 0 || var41 >= field816[var40]) {
                        throw new RuntimeException();
                    }
                    field826[var40][var41] = field831[Statics.field2755 + 1];
                } else if (var61 == 47) {
                    String var42 = Statics.field3763.method2153(var9[var7]);
                    if (var42 == null) {
                        var42 = class283.field3339;
                    }
                    field822[++Statics.field823 - 1] = var42;
                } else if (var61 == 48) {
                    Statics.field3763.method2152(var9[var7], field822[--Statics.field823]);
                } else if (var61 == 49) {
                    String var43 = Statics.field3763.method2163(var9[var7]);
                    field822[++Statics.field823 - 1] = var43;
                } else if (var61 == 50) {
                    Statics.field3763.method2150(var9[var7], field822[--Statics.field823]);
                } else if (var61 == 60) {
                    class378 var44 = var5.field940[var9[var7]];
                    class368 var45 = (class368) var44.method5996((long) field831[--Statics.field2755]);
                    if (var45 != null) {
                        var7 += var45.field4054;
                    }
                } else if (var61 == 74) {
                    Integer var46 = Statics.field3859.method2397(var9[var7]);
                    if (var46 == null) {
                        field831[++Statics.field2755 - 1] = -1;
                    } else {
                        field831[++Statics.field2755 - 1] = var46;
                    }
                } else if (var61 == 76) {
                    Integer var47 = Statics.field1389.method5675(var9[var7]);
                    if (var47 == null) {
                        field831[++Statics.field2755 - 1] = -1;
                    } else {
                        field831[++Statics.field2755 - 1] = var47;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var59) {
            var11 = true;
            StringBuilder var52 = new StringBuilder(30);
            var52.append("").append(var5.field4056).append(" ");
            for (int var53 = field824 - 1; var53 >= 0; var53--) {
                var52.append("").append(field825[var53].field447.field4056).append(" ");
            }
            var52.append("").append(var10);
            class424.method21(var52.toString(), var59);
        } finally {
            if (field830) {
                field828 = true;
            }
            while (field819.size() > 0) {
                class93 var56 = (class93) field819.remove(0);
                client.method603(var56.method2115(), var56.method2114(), var56.method2125(), var56.method2116(), "");
            }
            if (field828) {
                client.method5415();
                field828 = false;
                field830 = false;
            }
            if (!var11 && arg2 > 0 && var12 >= arg2) {
                class424.method21("Warning: Script " + var5.field942 + " finished at op count " + var12 + " of max " + arg1, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("fb.m(ILbg;ZI)I")
    public static int method3139(int arg0, class72 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method4240(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method180(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2618(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method2031(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method3392(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method3140(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method4653(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method2707(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method4851(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method4439(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method2263(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method180(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2618(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method2031(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method3392(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method3140(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method1050(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method3209(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method3131(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method185(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method2263(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method3458(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method2332(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method2498(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method416(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method1563(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method2089(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method3971(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method4420(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method2112(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method3501(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method2273(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method5555(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method2343(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method355(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method5346(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method4450(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method5427(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method4939(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method168(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method418(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method1939(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method2704(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method3472(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method4891(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method3977(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("is.k(ILbg;ZB)I")
    public static int method4240(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field2755 -= 3;
            int var3 = field831[Statics.field2755];
            int var4 = field831[Statics.field2755 + 1];
            int var5 = field831[Statics.field2755 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class262 var6 = class262.method2073(var3);
            if (var6.field3180 == null) {
                var6.field3180 = new class262[var5 + 1];
            }
            if (var6.field3180.length <= var5) {
                class262[] var7 = new class262[var5 + 1];
                for (int var8 = 0; var8 < var6.field3180.length; var8++) {
                    var7[var8] = var6.field3180[var8];
                }
                var6.field3180 = var7;
            }
            if (var5 > 0 && var6.field3180[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class262 var9 = new class262();
            var9.field3159 = var4;
            var9.field3065 = var9.field3046 = var6.field3046;
            var9.field3077 = var5;
            var9.field3045 = true;
            var6.field3180[var5] = var9;
            if (arg2) {
                Statics.field1292 = var9;
            } else {
                Statics.field41 = var9;
            }
            client.method2027(var6);
            return 1;
        } else if (arg0 == 101) {
            class262 var10 = arg2 ? Statics.field1292 : Statics.field41;
            class262 var11 = class262.method2073(var10.field3046);
            var11.field3180[var10.field3077] = null;
            client.method2027(var11);
            return 1;
        } else if (arg0 == 102) {
            class262 var12 = class262.method2073(field831[--Statics.field2755]);
            var12.field3180 = null;
            client.method2027(var12);
            return 1;
        } else if (arg0 == 103) {
            Statics.field2755 -= 3;
            return 1;
        } else if (arg0 == 104) {
            Statics.field2755--;
            return 1;
        } else if (arg0 == 200) {
            Statics.field2755 -= 2;
            int var13 = field831[Statics.field2755];
            int var14 = field831[Statics.field2755 + 1];
            class262 var15 = class262.method2816(var13, var14);
            if (var15 == null || var14 == -1) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = 1;
                if (arg2) {
                    Statics.field1292 = var15;
                } else {
                    Statics.field41 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class262 var16 = class262.method2073(field831[--Statics.field2755]);
            if (var16 == null) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = 1;
                if (arg2) {
                    Statics.field1292 = var16;
                } else {
                    Statics.field41 = var16;
                }
            }
            return 1;
        } else if (arg0 == 202) {
            field831[Statics.field2755 + 1] = 0;
            return 1;
        } else if (arg0 == 203) {
            field831[--Statics.field2755 + 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("s.o(ILbg;ZI)I")
    public static int method180(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class262 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field831[--Statics.field2755];
            var4 = class262.method2073(var3);
        } else {
            var4 = arg2 ? Statics.field1292 : Statics.field41;
        }
        if (arg0 == 1000) {
            Statics.field2755 -= 4;
            var4.field3055 = field831[Statics.field2755];
            var4.field3056 = field831[Statics.field2755 + 1];
            var4.field3051 = field831[Statics.field2755 + 2];
            var4.field3059 = field831[Statics.field2755 + 3];
            client.method2027(var4);
            Statics.field3681.method1081(var4);
            if (var3 != -1 && var4.field3159 == 0) {
                client.method2745(Statics.field1535[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field2755 -= 4;
            var4.field3057 = field831[Statics.field2755];
            var4.field3125 = field831[Statics.field2755 + 1];
            var4.field3053 = field831[Statics.field2755 + 2];
            var4.field3115 = field831[Statics.field2755 + 3];
            client.method2027(var4);
            Statics.field3681.method1081(var4);
            if (var3 != -1 && var4.field3159 == 0) {
                client.method2745(Statics.field1535[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field831[--Statics.field2755] == 1;
            if (var4.field3066 != var5) {
                var4.field3066 = var5;
                client.method2027(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3178 = field831[--Statics.field2755] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3191 = field831[--Statics.field2755] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("er.g(ILbg;ZI)I")
    public static int method2618(int arg0, class72 arg1, boolean arg2) {
        int var3 = -1;
        class262 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field831[--Statics.field2755];
            var4 = class262.method2073(var3);
        } else {
            var4 = arg2 ? Statics.field1292 : Statics.field41;
        }
        if (arg0 == 1100) {
            Statics.field2755 -= 2;
            var4.field3067 = field831[Statics.field2755];
            if (var4.field3067 > var4.field3069 - var4.field3098) {
                var4.field3067 = var4.field3069 - var4.field3098;
            }
            if (var4.field3067 < 0) {
                var4.field3067 = 0;
            }
            var4.field3068 = field831[Statics.field2755 + 1];
            if (var4.field3068 > var4.field3096 - var4.field3062) {
                var4.field3068 = var4.field3096 - var4.field3062;
            }
            if (var4.field3068 < 0) {
                var4.field3068 = 0;
            }
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1101) {
            var4.field3071 = field831[--Statics.field2755];
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3075 = field831[--Statics.field2755] == 1;
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3155 = field831[--Statics.field2755];
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3079 = field831[--Statics.field2755];
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3081 = field831[--Statics.field2755];
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3083 = field831[--Statics.field2755];
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3035 = field831[--Statics.field2755] == 1;
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3064 = 1;
            var4.field3032 = field831[--Statics.field2755];
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field2755 -= 6;
            var4.field3095 = field831[Statics.field2755];
            var4.field3044 = field831[Statics.field2755 + 1];
            var4.field3097 = field831[Statics.field2755 + 2];
            var4.field3074 = field831[Statics.field2755 + 3];
            var4.field3099 = field831[Statics.field2755 + 4];
            var4.field3100 = field831[Statics.field2755 + 5];
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var5 = field831[--Statics.field2755];
            if (var4.field3121 != var5) {
                var4.field3121 = var5;
                var4.field3034 = 0;
                var4.field3179 = 0;
                client.method2027(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3103 = field831[--Statics.field2755] == 1;
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var6 = field822[--Statics.field823];
            if (!var6.equals(var4.field3145)) {
                var4.field3145 = var6;
                client.method2027(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3058 = field831[--Statics.field2755];
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field2755 -= 3;
            var4.field3128 = field831[Statics.field2755];
            var4.field3111 = field831[Statics.field2755 + 1];
            var4.field3084 = field831[Statics.field2755 + 2];
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3036 = field831[--Statics.field2755] == 1;
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3164 = field831[--Statics.field2755];
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3086 = field831[--Statics.field2755];
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3087 = field831[--Statics.field2755] == 1;
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3088 = field831[--Statics.field2755] == 1;
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field2755 -= 2;
            var4.field3069 = field831[Statics.field2755];
            var4.field3096 = field831[Statics.field2755 + 1];
            client.method2027(var4);
            if (var3 != -1 && var4.field3159 == 0) {
                client.method2745(Statics.field1535[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method363(var4.field3046, var4.field3077);
            client.field655 = var4;
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3082 = field831[--Statics.field2755];
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3072 = field831[--Statics.field2755];
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3054 = field831[--Statics.field2755];
            client.method2027(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var7 = field831[--Statics.field2755];
            class411 var8 = (class411) class304.method4518(class411.method3600(), var7);
            if (var8 != null) {
                var4.field3076 = var8;
                client.method2027(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var9 = field831[--Statics.field2755] == 1;
            var4.field3118 = var9;
            return 1;
        } else if (arg0 == 1127) {
            boolean var10 = field831[--Statics.field2755] == 1;
            var4.field3061 = var10;
            return 1;
        } else if (arg0 == 1128) {
            Statics.field2755 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.z(ILbg;ZB)I")
    public static int method2031(int arg0, class72 arg1, boolean arg2) {
        class262 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class262.method2073(field831[--Statics.field2755]);
        } else {
            var3 = arg2 ? Statics.field1292 : Statics.field41;
        }
        client.method2027(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field2755 -= 2;
            int var4 = field831[Statics.field2755];
            int var5 = field831[Statics.field2755 + 1];
            var3.field3176 = var4;
            var3.field3177 = var5;
            class170 var6 = class170.method1776(var4);
            var3.field3097 = var6.field1889;
            var3.field3074 = var6.field1873;
            var3.field3099 = var6.field1891;
            var3.field3095 = var6.field1908;
            var3.field3044 = var6.field1893;
            var3.field3100 = var6.field1916;
            if (arg0 == 1205) {
                var3.field3105 = 0;
            } else if (arg0 == 1212 | var6.field1926 == 1) {
                var3.field3105 = 1;
            } else {
                var3.field3105 = 2;
            }
            if (var3.field3090 > 0) {
                var3.field3100 = var3.field3100 * 32 / var3.field3090;
            } else if (var3.field3057 > 0) {
                var3.field3100 = var3.field3100 * 32 / var3.field3057;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3064 = 2;
            var3.field3032 = field831[--Statics.field2755];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3064 = 3;
            var3.field3032 = Statics.field1485.field1064.method4485();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fm.a(ILbg;ZS)I")
    public static int method3392(int arg0, class72 arg1, boolean arg2) {
        boolean var3 = true;
        class262 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class262.method2073(field831[--Statics.field2755]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field1292 : Statics.field41;
        }
        if (arg0 == 1300) {
            int var5 = field831[--Statics.field2755] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method4521(var5, field822[--Statics.field823]);
                return 1;
            } else {
                Statics.field823--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field2755 -= 2;
            int var6 = field831[Statics.field2755];
            int var7 = field831[Statics.field2755 + 1];
            var4.field3127 = class262.method2816(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3130 = field831[--Statics.field2755] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3110 = field831[--Statics.field2755];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3129 = field831[--Statics.field2755];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3116 = field822[--Statics.field823];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3131 = field822[--Statics.field823];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3126 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3192 = field831[--Statics.field2755] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field2755--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field2755 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field831[Statics.field2755 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field831[Statics.field2755 + var10];
                        var9[var10 / 2] = (byte) field831[Statics.field2755 + var10 + 1];
                    }
                }
            } else {
                Statics.field2755 -= 2;
                var8 = new byte[] { (byte) field831[Statics.field2755] };
                var9 = new byte[] { (byte) field831[Statics.field2755 + 1] };
            }
            int var11 = field831[--Statics.field2755] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method3512(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field2755 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field831[Statics.field2755] };
            byte[] var14 = new byte[] { (byte) field831[Statics.field2755 + 1] };
            method3512(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field2755 -= 3;
            int var15 = field831[Statics.field2755] - 1;
            int var16 = field831[Statics.field2755 + 1];
            int var17 = field831[Statics.field2755 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method109(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field831[--Statics.field2755];
            int var20 = field831[--Statics.field2755];
            method109(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field2755--;
            int var21 = field831[Statics.field2755] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            Statics.method1951(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            Statics.method1951(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gk.u(Ljd;I[B[BI)V")
    public static final void method3512(class262 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3101 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3101 = new byte[11][];
            arg0.field3122 = new byte[11][];
            arg0.field3136 = new int[11];
            arg0.field3124 = new int[11];
        }
        arg0.field3101[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3120 = false;
            for (int var4 = 0; var4 < arg0.field3101.length; var4++) {
                if (arg0.field3101[var4] != null) {
                    arg0.field3120 = true;
                    break;
                }
            }
        } else {
            arg0.field3120 = true;
        }
        arg0.field3122[arg1] = arg3;
    }

    @ObfuscatedName("l.e(Ljd;IIII)V")
    public static final void method109(class262 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3136 == null) {
            throw new RuntimeException();
        }
        arg0.field3136[arg1] = arg2;
        arg0.field3124[arg1] = arg3;
    }

    @ObfuscatedName("fb.y(ILbg;ZB)I")
    public static int method3140(int arg0, class72 arg1, boolean arg2) {
        class262 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class262.method2073(field831[--Statics.field2755]);
        } else {
            var3 = arg2 ? Statics.field1292 : Statics.field41;
        }
        String var4 = field822[--Statics.field823];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field831[--Statics.field2755];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field831[--Statics.field2755];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field822[--Statics.field823];
            } else {
                var7[var8] = Integer.valueOf(field831[--Statics.field2755]);
            }
        }
        int var9 = field831[--Statics.field2755];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3134 = var7;
        } else if (arg0 == 1401) {
            var3.field3137 = var7;
        } else if (arg0 == 1402) {
            var3.field3139 = var7;
        } else if (arg0 == 1403) {
            var3.field3138 = var7;
        } else if (arg0 == 1404) {
            var3.field3085 = var7;
        } else if (arg0 == 1405) {
            var3.field3144 = var7;
        } else if (arg0 == 1406) {
            var3.field3140 = var7;
        } else if (arg0 == 1407) {
            var3.field3042 = var7;
            var3.field3146 = var5;
        } else if (arg0 == 1408) {
            var3.field3151 = var7;
        } else if (arg0 == 1409) {
            var3.field3152 = var7;
        } else if (arg0 == 1410) {
            var3.field3107 = var7;
        } else if (arg0 == 1411) {
            var3.field3135 = var7;
        } else if (arg0 == 1412) {
            var3.field3153 = var7;
        } else if (arg0 == 1414) {
            var3.field3147 = var7;
            var3.field3148 = var5;
        } else if (arg0 == 1415) {
            var3.field3149 = var7;
            var3.field3150 = var5;
        } else if (arg0 == 1416) {
            var3.field3143 = var7;
        } else if (arg0 == 1417) {
            var3.field3052 = var7;
        } else if (arg0 == 1418) {
            var3.field3109 = var7;
        } else if (arg0 == 1419) {
            var3.field3141 = var7;
        } else if (arg0 == 1420) {
            var3.field3158 = var7;
        } else if (arg0 == 1421) {
            var3.field3078 = var7;
        } else if (arg0 == 1422) {
            var3.field3162 = var7;
        } else if (arg0 == 1423) {
            var3.field3157 = var7;
        } else if (arg0 == 1424) {
            var3.field3089 = var7;
        } else if (arg0 == 1425) {
            var3.field3166 = var7;
        } else if (arg0 == 1426) {
            var3.field3175 = var7;
        } else if (arg0 == 1427) {
            var3.field3165 = var7;
        } else if (arg0 == 1428) {
            var3.field3160 = var7;
        } else if (arg0 == 1429) {
            var3.field3161 = var7;
        } else if (arg0 == 1430) {
            var3.field3156 = var7;
        } else if (arg0 == 1431) {
            var3.field3070 = var7;
        } else {
            return 2;
        }
        var3.field3132 = true;
        return 1;
    }

    @ObfuscatedName("jz.v(ILbg;ZS)I")
    public static int method4653(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = arg2 ? Statics.field1292 : Statics.field41;
        if (arg0 == 1500) {
            field831[++Statics.field2755 - 1] = var3.field3167;
            return 1;
        } else if (arg0 == 1501) {
            field831[++Statics.field2755 - 1] = var3.field3080;
            return 1;
        } else if (arg0 == 1502) {
            field831[++Statics.field2755 - 1] = var3.field3098;
            return 1;
        } else if (arg0 == 1503) {
            field831[++Statics.field2755 - 1] = var3.field3062;
            return 1;
        } else if (arg0 == 1504) {
            field831[++Statics.field2755 - 1] = var3.field3066 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field831[++Statics.field2755 - 1] = var3.field3065;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fg.f(ILbg;ZB)I")
    public static int method2707(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = arg2 ? Statics.field1292 : Statics.field41;
        if (arg0 == 1600) {
            field831[++Statics.field2755 - 1] = var3.field3067;
            return 1;
        } else if (arg0 == 1601) {
            field831[++Statics.field2755 - 1] = var3.field3068;
            return 1;
        } else if (arg0 == 1602) {
            field822[++Statics.field823 - 1] = var3.field3145;
            return 1;
        } else if (arg0 == 1603) {
            field831[++Statics.field2755 - 1] = var3.field3069;
            return 1;
        } else if (arg0 == 1604) {
            field831[++Statics.field2755 - 1] = var3.field3096;
            return 1;
        } else if (arg0 == 1605) {
            field831[++Statics.field2755 - 1] = var3.field3100;
            return 1;
        } else if (arg0 == 1606) {
            field831[++Statics.field2755 - 1] = var3.field3097;
            return 1;
        } else if (arg0 == 1607) {
            field831[++Statics.field2755 - 1] = var3.field3099;
            return 1;
        } else if (arg0 == 1608) {
            field831[++Statics.field2755 - 1] = var3.field3074;
            return 1;
        } else if (arg0 == 1609) {
            field831[++Statics.field2755 - 1] = var3.field3155;
            return 1;
        } else if (arg0 == 1610) {
            field831[++Statics.field2755 - 1] = var3.field3054;
            return 1;
        } else if (arg0 == 1611) {
            field831[++Statics.field2755 - 1] = var3.field3071;
            return 1;
        } else if (arg0 == 1612) {
            field831[++Statics.field2755 - 1] = var3.field3072;
            return 1;
        } else if (arg0 == 1613) {
            field831[++Statics.field2755 - 1] = var3.field3076.method42();
            return 1;
        } else if (arg0 == 1614) {
            field831[++Statics.field2755 - 1] = var3.field3061 ? 1 : 0;
            return 1;
        } else if (arg0 == 1615 || arg0 == 1616) {
            Statics.field2755++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kf.s(ILbg;ZB)I")
    public static int method4851(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = arg2 ? Statics.field1292 : Statics.field41;
        if (arg0 == 1700) {
            field831[++Statics.field2755 - 1] = var3.field3176;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3176 == -1) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = var3.field3177;
            }
            return 1;
        } else if (arg0 == 1702) {
            field831[++Statics.field2755 - 1] = var3.field3077;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ii.h(ILbg;ZI)I")
    public static int method4439(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = arg2 ? Statics.field1292 : Statics.field41;
        if (arg0 == 1800) {
            field831[++Statics.field2755 - 1] = class263.method2494(client.method967(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field831[--Statics.field2755];
            int var5 = var4 - 1;
            if (var3.field3126 == null || var5 >= var3.field3126.length || var3.field3126[var5] == null) {
                field822[++Statics.field823 - 1] = "";
            } else {
                field822[++Statics.field823 - 1] = var3.field3126[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3116 == null) {
                field822[++Statics.field823 - 1] = "";
            } else {
                field822[++Statics.field823 - 1] = var3.field3116;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ct.d(ILbg;ZI)I")
    public static int method2263(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field814 >= 10) {
                throw new RuntimeException();
            }
            class262 var10;
            if (arg0 >= 2000) {
                var10 = class262.method2073(field831[--Statics.field2755]);
            } else {
                var10 = arg2 ? Statics.field1292 : Statics.field41;
            }
            if (var10.field3165 == null) {
                return 0;
            }
            class81 var11 = new class81();
            var11.field1028 = var10;
            var11.field1031 = var10.field3165;
            var11.field1036 = field814 + 1;
            client.field692.method4986(var11);
            return 1;
        } else if (arg0 == 1928) {
            class262 var3 = arg2 ? Statics.field1292 : Statics.field41;
            int var4 = field831[--Statics.field2755];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class93 var5 = new class93(var4, var3.field3046, var3.field3077, var3.field3176);
            field819.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field2755 -= 3;
            int var6 = field831[Statics.field2755];
            int var7 = field831[Statics.field2755 + 1];
            int var8 = field831[Statics.field2755 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class93 var9 = new class93(var8, var6, var7, class262.method2073(var6).field3176);
            field819.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("br.q(ILbg;ZB)I")
    public static int method1050(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = class262.method2073(field831[--Statics.field2755]);
        if (arg0 == 2500) {
            field831[++Statics.field2755 - 1] = var3.field3167;
            return 1;
        } else if (arg0 == 2501) {
            field831[++Statics.field2755 - 1] = var3.field3080;
            return 1;
        } else if (arg0 == 2502) {
            field831[++Statics.field2755 - 1] = var3.field3098;
            return 1;
        } else if (arg0 == 2503) {
            field831[++Statics.field2755 - 1] = var3.field3062;
            return 1;
        } else if (arg0 == 2504) {
            field831[++Statics.field2755 - 1] = var3.field3066 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field831[++Statics.field2755 - 1] = var3.field3065;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fr.j(ILbg;ZB)I")
    public static int method3209(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = class262.method2073(field831[--Statics.field2755]);
        if (arg0 == 2600) {
            field831[++Statics.field2755 - 1] = var3.field3067;
            return 1;
        } else if (arg0 == 2601) {
            field831[++Statics.field2755 - 1] = var3.field3068;
            return 1;
        } else if (arg0 == 2602) {
            field822[++Statics.field823 - 1] = var3.field3145;
            return 1;
        } else if (arg0 == 2603) {
            field831[++Statics.field2755 - 1] = var3.field3069;
            return 1;
        } else if (arg0 == 2604) {
            field831[++Statics.field2755 - 1] = var3.field3096;
            return 1;
        } else if (arg0 == 2605) {
            field831[++Statics.field2755 - 1] = var3.field3100;
            return 1;
        } else if (arg0 == 2606) {
            field831[++Statics.field2755 - 1] = var3.field3097;
            return 1;
        } else if (arg0 == 2607) {
            field831[++Statics.field2755 - 1] = var3.field3099;
            return 1;
        } else if (arg0 == 2608) {
            field831[++Statics.field2755 - 1] = var3.field3074;
            return 1;
        } else if (arg0 == 2609) {
            field831[++Statics.field2755 - 1] = var3.field3155;
            return 1;
        } else if (arg0 == 2610) {
            field831[++Statics.field2755 - 1] = var3.field3054;
            return 1;
        } else if (arg0 == 2611) {
            field831[++Statics.field2755 - 1] = var3.field3071;
            return 1;
        } else if (arg0 == 2612) {
            field831[++Statics.field2755 - 1] = var3.field3072;
            return 1;
        } else if (arg0 == 2613) {
            field831[++Statics.field2755 - 1] = var3.field3076.method42();
            return 1;
        } else if (arg0 == 2614) {
            field831[++Statics.field2755 - 1] = var3.field3061 ? 1 : 0;
            return 1;
        } else if (arg0 == 2615 || arg0 == 2616) {
            Statics.field2755++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fj.x(ILbg;ZB)I")
    public static int method3131(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class262 var3 = class262.method2073(field831[--Statics.field2755]);
            field831[++Statics.field2755 - 1] = var3.field3176;
            return 1;
        } else if (arg0 == 2701) {
            class262 var4 = class262.method2073(field831[--Statics.field2755]);
            if (var4.field3176 == -1) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = var4.field3177;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field831[--Statics.field2755];
            class80 var6 = (class80) client.field650.method6016((long) var5);
            if (var6 == null) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field831[++Statics.field2755 - 1] = client.field649;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("s.b(ILbg;ZI)I")
    public static int method185(int arg0, class72 arg1, boolean arg2) {
        class262 var3 = class262.method2073(field831[--Statics.field2755]);
        if (arg0 == 2800) {
            field831[++Statics.field2755 - 1] = class263.method2494(client.method967(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field831[--Statics.field2755];
            int var5 = var4 - 1;
            if (var3.field3126 == null || var5 >= var3.field3126.length || var3.field3126[var5] == null) {
                field822[++Statics.field823 - 1] = "";
            } else {
                field822[++Statics.field823 - 1] = var3.field3126[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3116 == null) {
                field822[++Statics.field823 - 1] = "";
            } else {
                field822[++Statics.field823 - 1] = var3.field3116;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gt.t(ILbg;ZI)I")
    public static int method3458(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field822[--Statics.field823];
            class98.method1908(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field2755 -= 2;
            client.method2232(Statics.field1485, field831[Statics.field2755], field831[Statics.field2755 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field828) {
                field830 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field822[--Statics.field823];
            int var5 = 0;
            if (class319.method5370(var4)) {
                var5 = class319.method4849(var4);
            }
            class242 var6 = Statics.method1576(class240.field2666, client.field535.field1282);
            var6.field2767.method6203(var5);
            client.field535.method2211(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field822[--Statics.field823];
            class242 var8 = Statics.method1576(class240.field2726, client.field535.field1282);
            var8.field2767.method6200(var7.length() + 1);
            var8.field2767.method6242(var7);
            client.field535.method2211(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field822[--Statics.field823];
            class242 var10 = Statics.method1576(class240.field2674, client.field535.field1282);
            var10.field2767.method6200(var9.length() + 1);
            var10.field2767.method6242(var9);
            client.field535.method2211(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field831[--Statics.field2755];
            String var12 = field822[--Statics.field823];
            client.method5372(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field2755 -= 3;
            int var13 = field831[Statics.field2755];
            int var14 = field831[Statics.field2755 + 1];
            int var15 = field831[Statics.field2755 + 2];
            class262 var16 = class262.method2073(var15);
            client.method370(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field2755 -= 2;
            int var17 = field831[Statics.field2755];
            int var18 = field831[Statics.field2755 + 1];
            class262 var19 = arg2 ? Statics.field1292 : Statics.field41;
            client.method370(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field949 = field831[--Statics.field2755] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field831[++Statics.field2755 - 1] = Statics.field1779.field1189 ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1779.field1189 = field831[--Statics.field2755] == 1;
            class89.method362();
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field822[--Statics.field823];
            boolean var21 = field831[--Statics.field2755] == 1;
            class30.method1762(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field831[--Statics.field2755];
            class242 var23 = Statics.method1576(class240.field2704, client.field535.field1282);
            var23.field2767.method6311(var22);
            client.field535.method2211(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field831[--Statics.field2755];
            Statics.field823 -= 2;
            String var25 = field822[Statics.field823];
            String var26 = field822[Statics.field823 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class242 var27 = Statics.method1576(class240.field2712, client.field535.field1282);
                var27.field2767.method6311(1 + class400.method5614(var25) + class400.method5614(var26));
                var27.field2767.method6242(var25);
                var27.field2767.method6242(var26);
                var27.field2767.method6200(var24);
                client.field535.method2211(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            client.field635 = field831[--Statics.field2755] == 1;
            return 1;
        } else if (arg0 == 3118) {
            client.field637 = field831[--Statics.field2755] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field608 = field831[--Statics.field2755] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field831[--Statics.field2755] == 1) {
                client.field533 |= 0x1;
            } else {
                client.field533 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field831[--Statics.field2755] == 1) {
                client.field533 |= 0x2;
            } else {
                client.field533 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field831[--Statics.field2755] == 1) {
                client.field533 |= 0x4;
            } else {
                client.field533 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field831[--Statics.field2755] == 1) {
                client.field533 |= 0x8;
            } else {
                client.field533 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field533 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field511 = field831[--Statics.field2755] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field480 = field831[--Statics.field2755] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method217(field831[--Statics.field2755] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field831[++Statics.field2755 - 1] = client.method2496() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field2755 -= 2;
            client.field570 = field831[Statics.field2755];
            client.field599 = field831[Statics.field2755 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field2755 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field2755--;
            return 1;
        } else if (arg0 == 3132) {
            field831[++Statics.field2755 - 1] = Statics.field1611;
            field831[++Statics.field2755 - 1] = Statics.field200;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field2755--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field2755 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field651 = 3;
            client.field544 = field831[--Statics.field2755];
            return 1;
        } else if (arg0 == 3137) {
            client.field651 = 2;
            client.field544 = field831[--Statics.field2755];
            return 1;
        } else if (arg0 == 3138) {
            client.field651 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field651 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field651 = 3;
            client.field544 = arg2 ? Statics.field1292.field3046 : Statics.field41.field3046;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field831[--Statics.field2755] == 1;
            Statics.field1779.field1198 = var28;
            class89.method362();
            return 1;
        } else if (arg0 == 3142) {
            field831[++Statics.field2755 - 1] = Statics.field1779.field1198 ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field831[--Statics.field2755] == 1;
            client.field525 = var29;
            if (!var29) {
                Statics.field1779.field1192 = "";
                class89.method362();
            }
            return 1;
        } else if (arg0 == 3144) {
            field831[++Statics.field2755 - 1] = client.field525 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field831[--Statics.field2755] == 1;
            if (Statics.field1779.field1190 == var30) {
                Statics.field1779.field1190 = !var30;
                class89.method362();
            }
            return 1;
        } else if (arg0 == 3147) {
            field831[++Statics.field2755 - 1] = Statics.field1779.field1190 ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field831[++Statics.field2755 - 1] = class69.field880;
            return 1;
        } else if (arg0 == 3154) {
            field831[++Statics.field2755 - 1] = client.method2284();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field823--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field2755 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field2755--;
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field2755--;
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field823--;
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field2755--;
            field822[++Statics.field823 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field2755--;
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field2755 -= 2;
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field2755 -= 2;
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field2755 -= 2;
            field822[++Statics.field823 - 1] = "";
            field822[++Statics.field823 - 1] = "";
            field822[++Statics.field823 - 1] = "";
            field822[++Statics.field823 - 1] = "";
            field822[++Statics.field823 - 1] = "";
            field822[++Statics.field823 - 1] = "";
            field822[++Statics.field823 - 1] = "";
            field822[++Statics.field823 - 1] = "";
            field822[++Statics.field823 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field2755--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field2755--;
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field2755--;
            return 1;
        } else if (arg0 == 3175) {
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field823--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field823--;
            return 1;
        } else if (arg0 == 3181) {
            int var31 = 100 - Math.min(Math.max(field831[--Statics.field2755], 0), 100);
            client.method4441((double) ((float) var31 / 200.0F + 0.5F));
            return 1;
        } else if (arg0 == 3182) {
            float var32 = ((float) Statics.field1779.field1194 - 0.5F) * 200.0F;
            field831[++Statics.field2755 - 1] = 100 - Math.round(var32);
            return 1;
        } else if (arg0 == 3183 || arg0 == 3184) {
            Statics.field2755--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("db.r(ILbg;ZB)I")
    public static int method2332(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field2755 -= 3;
            client.method737(field831[Statics.field2755], field831[Statics.field2755 + 1], field831[Statics.field2755 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            client.method1581(field831[--Statics.field2755]);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field2755 -= 2;
            client.method3519(field831[Statics.field2755], field831[Statics.field2755 + 1]);
            return 1;
        } else if (arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            int var6 = 0;
            int var7 = field831[--Statics.field2755];
            if (arg0 == 3209) {
                var6 = field831[--Statics.field2755];
            } else if (arg0 == 3181) {
                var6 = 6;
            } else if (arg0 == 3203) {
                var6 = 7;
            } else if (arg0 == 3205) {
                var6 = 8;
            } else if (arg0 == 3207) {
                var6 = 9;
            }
            if (var6 == 6) {
                int var8 = 100 - Math.min(Math.max(var7, 0), 100);
                client.method4441((double) ((float) var8 / 200.0F + 0.5F));
            } else if (var6 == 7) {
                int var9 = Math.min(Math.max(var7, 0), 100);
                client.method3160(Math.round((float) var9 * 2.55F));
            } else if (var6 == 8) {
                int var10 = Math.min(Math.max(var7, 0), 100);
                client.method267(Math.round((float) var10 * 1.27F));
            } else if (var6 == 9) {
                int var11 = Math.min(Math.max(var7, 0), 100);
                client.method4630(Math.round((float) var11 * 1.27F));
            }
            return 1;
        } else if (arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            int var3 = 0;
            int var4 = 0;
            if (arg0 == 3210) {
                var3 = field831[--Statics.field2755];
            } else if (arg0 == 3182) {
                var3 = 6;
            } else if (arg0 == 3204) {
                var3 = 7;
            } else if (arg0 == 3206) {
                var3 = 8;
            } else if (arg0 == 3208) {
                var3 = 9;
            }
            if (var3 == 6) {
                float var5 = ((float) Statics.field1779.field1194 - 0.5F) * 200.0F;
                var4 = 100 - Math.round(var5);
            } else if (var3 == 7) {
                var4 = Math.round((float) Statics.field1779.field1195 / 2.55F);
            } else if (var3 == 8) {
                var4 = Math.round((float) Statics.field1779.field1196 / 1.27F);
            } else if (var3 == 9) {
                var4 = Math.round((float) Statics.field1779.field1199 / 1.27F);
            }
            field831[++Statics.field2755 - 1] = var4;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eh.p(ILbg;ZI)I")
    public static int method2498(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field831[++Statics.field2755 - 1] = client.field744;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field2755 -= 2;
            int var3 = field831[Statics.field2755];
            int var4 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = class78.method2233(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field2755 -= 2;
            int var5 = field831[Statics.field2755];
            int var6 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = class78.method91(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field2755 -= 2;
            int var7 = field831[Statics.field2755];
            int var8 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = class78.method4645(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = class152.method4881(var9).field1610;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = client.field621[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = client.field506[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = client.field623[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field4237;
            int var14 = (Statics.field1485.field1119 >> 7) + Statics.field1942;
            int var15 = (Statics.field1485.field1096 >> 7) + Statics.field3866;
            field831[++Statics.field2755 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field831[++Statics.field2755 - 1] = client.field682 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field2755 -= 2;
            int var19 = field831[Statics.field2755] + 32768;
            int var20 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = class78.method2233(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field2755 -= 2;
            int var21 = field831[Statics.field2755] + 32768;
            int var22 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = class78.method91(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field2755 -= 2;
            int var23 = field831[Statics.field2755] + 32768;
            int var24 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = class78.method4645(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field658 >= 2) {
                field831[++Statics.field2755 - 1] = client.field658;
            } else {
                field831[++Statics.field2755 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field831[++Statics.field2755 - 1] = client.field500;
            return 1;
        } else if (arg0 == 3318) {
            field831[++Statics.field2755 - 1] = client.field654;
            return 1;
        } else if (arg0 == 3321) {
            field831[++Statics.field2755 - 1] = client.field656;
            return 1;
        } else if (arg0 == 3322) {
            field831[++Statics.field2755 - 1] = client.field587;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field580) {
                field831[++Statics.field2755 - 1] = 1;
            } else {
                field831[++Statics.field2755 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field831[++Statics.field2755 - 1] = client.field482;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field2755 -= 4;
            int var25 = field831[Statics.field2755];
            int var26 = field831[Statics.field2755 + 1];
            int var27 = field831[Statics.field2755 + 2];
            int var28 = field831[Statics.field2755 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field831[++Statics.field2755 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field831[++Statics.field2755 - 1] = client.field495;
            return 1;
        } else if (arg0 == 3327) {
            field831[++Statics.field2755 - 1] = client.field676;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aa.w(ILbg;ZI)I")
    public static int method416(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field2755 -= 2;
            int var3 = field831[Statics.field2755];
            int var4 = field831[Statics.field2755 + 1];
            class159 var5 = class159.method2647(var3);
            if (var5.field1690 != 's') {
            }
            for (int var6 = 0; var6 < var5.field1692; var6++) {
                if (var5.field1697[var6] == var4) {
                    field822[++Statics.field823 - 1] = var5.field1695[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field822[++Statics.field823 - 1] = var5.field1696;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field2755 -= 4;
            int var7 = field831[Statics.field2755];
            int var8 = field831[Statics.field2755 + 1];
            int var9 = field831[Statics.field2755 + 2];
            int var10 = field831[Statics.field2755 + 3];
            class159 var11 = class159.method2647(var9);
            if (var11.field1688 != var7 || var11.field1690 != var8) {
                if (var8 == 115) {
                    field822[++Statics.field823 - 1] = class283.field3339;
                } else {
                    field831[++Statics.field2755 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field1692; var12++) {
                if (var11.field1697[var12] == var10) {
                    if (var8 == 115) {
                        field822[++Statics.field823 - 1] = var11.field1695[var12];
                    } else {
                        field831[++Statics.field2755 - 1] = var11.field1694[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field822[++Statics.field823 - 1] = var11.field1696;
                } else {
                    field831[++Statics.field2755 - 1] = var11.field1691;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field831[--Statics.field2755];
            class159 var14 = class159.method2647(var13);
            field831[++Statics.field2755 - 1] = var14.method2695();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bh.i(ILbg;ZB)I")
    public static int method1563(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = class24.method3544(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = class24.method2742(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = class24.method1773(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cx.aq(ILbg;ZB)I")
    public static int method2089(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field100.field794 == 0) {
                field831[++Statics.field2755 - 1] = -2;
            } else if (Statics.field100.field794 == 1) {
                field831[++Statics.field2755 - 1] = -1;
            } else {
                field831[++Statics.field2755 - 1] = Statics.field100.field792.method5504();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field831[--Statics.field2755];
            if (Statics.field100.method1584() && var3 >= 0 && var3 < Statics.field100.field792.method5504()) {
                class334 var4 = (class334) Statics.field100.field792.method5500(var3);
                field822[++Statics.field823 - 1] = var4.method5465();
                field822[++Statics.field823 - 1] = var4.method5457();
            } else {
                field822[++Statics.field823 - 1] = "";
                field822[++Statics.field823 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field831[--Statics.field2755];
            if (Statics.field100.method1584() && var5 >= 0 && var5 < Statics.field100.field792.method5504()) {
                field831[++Statics.field2755 - 1] = ((class341) Statics.field100.field792.method5500(var5)).field3965;
            } else {
                field831[++Statics.field2755 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field831[--Statics.field2755];
            if (Statics.field100.method1584() && var6 >= 0 && var6 < Statics.field100.field792.method5504()) {
                field831[++Statics.field2755 - 1] = ((class341) Statics.field100.field792.method5500(var6)).field3962;
            } else {
                field831[++Statics.field2755 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field822[--Statics.field823];
            int var8 = field831[--Statics.field2755];
            class62.method4125(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field822[--Statics.field823];
            Statics.field100.method1577(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field822[--Statics.field823];
            Statics.field100.method1588(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field822[--Statics.field823];
            Statics.field100.method1565(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field822[--Statics.field823];
            Statics.field100.method1620(var12);
            return 1;
        } else if (arg0 == 3609) {
            String var13 = field822[--Statics.field823];
            String var14 = client.method3267(var13);
            field831[++Statics.field2755 - 1] = Statics.field100.method1570(new class421(var14, Statics.field310), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field1010 == null) {
                field822[++Statics.field823 - 1] = "";
            } else {
                field822[++Statics.field823 - 1] = Statics.field1010.field3929;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field1010 == null) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = Statics.field1010.method5504();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var15 = field831[--Statics.field2755];
            if (Statics.field1010 == null || var15 >= Statics.field1010.method5504()) {
                field822[++Statics.field823 - 1] = "";
            } else {
                field822[++Statics.field823 - 1] = Statics.field1010.method5500(var15).method5455().method6800();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var16 = field831[--Statics.field2755];
            if (Statics.field1010 == null || var16 >= Statics.field1010.method5504()) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = ((class341) Statics.field1010.method5500(var16)).method5560();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var17 = field831[--Statics.field2755];
            if (Statics.field1010 == null || var17 >= Statics.field1010.method5504()) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = ((class341) Statics.field1010.method5500(var17)).field3962;
            }
            return 1;
        } else if (arg0 == 3616) {
            field831[++Statics.field2755 - 1] = Statics.field1010 == null ? 0 : Statics.field1010.field3936;
            return 1;
        } else if (arg0 == 3617) {
            String var18 = field822[--Statics.field823];
            client.method3127(var18);
            return 1;
        } else if (arg0 == 3618) {
            field831[++Statics.field2755 - 1] = Statics.field1010 == null ? 0 : Statics.field1010.field3932;
            return 1;
        } else if (arg0 == 3619) {
            String var19 = field822[--Statics.field823];
            client.method4348(var19);
            return 1;
        } else if (arg0 == 3620) {
            client.method2144();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field100.method1584()) {
                field831[++Statics.field2755 - 1] = Statics.field100.field791.method5504();
            } else {
                field831[++Statics.field2755 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var20 = field831[--Statics.field2755];
            if (Statics.field100.method1584() && var20 >= 0 && var20 < Statics.field100.field791.method5504()) {
                class340 var21 = (class340) Statics.field100.field791.method5500(var20);
                field822[++Statics.field823 - 1] = var21.method5465();
                field822[++Statics.field823 - 1] = var21.method5457();
            } else {
                field822[++Statics.field823 - 1] = "";
                field822[++Statics.field823 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var22 = field822[--Statics.field823];
            String var23 = client.method3267(var22);
            field831[++Statics.field2755 - 1] = Statics.field100.method1571(new class421(var23, Statics.field310)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var24 = field831[--Statics.field2755];
            if (Statics.field1010 == null || var24 >= Statics.field1010.method5504() || !Statics.field1010.method5500(var24).method5455().equals(Statics.field1485.field1070)) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field1010 == null || Statics.field1010.field3930 == null) {
                field822[++Statics.field823 - 1] = "";
            } else {
                field822[++Statics.field823 - 1] = Statics.field1010.field3930;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var25 = field831[--Statics.field2755];
            if (Statics.field1010 == null || var25 >= Statics.field1010.method5504() || !((class336) Statics.field1010.method5500(var25)).method5452()) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var26 = field831[--Statics.field2755];
            if (Statics.field1010 == null || var26 >= Statics.field1010.method5504() || !((class336) Statics.field1010.method5500(var26)).method5442()) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field100.field792.method5498();
            return 1;
        } else if (arg0 == 3629) {
            boolean var27 = field831[--Statics.field2755] == 1;
            Statics.field100.field792.method5503(new class405(var27));
            return 1;
        } else if (arg0 == 3630) {
            boolean var28 = field831[--Statics.field2755] == 1;
            Statics.field100.field792.method5503(new class406(var28));
            return 1;
        } else if (arg0 == 3631) {
            boolean var29 = field831[--Statics.field2755] == 1;
            Statics.field100.field792.method5503(new class106(var29));
            return 1;
        } else if (arg0 == 3632) {
            boolean var30 = field831[--Statics.field2755] == 1;
            Statics.field100.field792.method5503(new class102(var30));
            return 1;
        } else if (arg0 == 3633) {
            boolean var31 = field831[--Statics.field2755] == 1;
            Statics.field100.field792.method5503(new class105(var31));
            return 1;
        } else if (arg0 == 3634) {
            boolean var32 = field831[--Statics.field2755] == 1;
            Statics.field100.field792.method5503(new class110(var32));
            return 1;
        } else if (arg0 == 3635) {
            boolean var33 = field831[--Statics.field2755] == 1;
            Statics.field100.field792.method5503(new class104(var33));
            return 1;
        } else if (arg0 == 3636) {
            boolean var34 = field831[--Statics.field2755] == 1;
            Statics.field100.field792.method5503(new class103(var34));
            return 1;
        } else if (arg0 == 3637) {
            boolean var35 = field831[--Statics.field2755] == 1;
            Statics.field100.field792.method5503(new class107(var35));
            return 1;
        } else if (arg0 == 3638) {
            boolean var36 = field831[--Statics.field2755] == 1;
            Statics.field100.field792.method5503(new class108(var36));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field100.field792.method5496();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field100.field791.method5498();
            return 1;
        } else if (arg0 == 3641) {
            boolean var37 = field831[--Statics.field2755] == 1;
            Statics.field100.field791.method5503(new class405(var37));
            return 1;
        } else if (arg0 == 3642) {
            boolean var38 = field831[--Statics.field2755] == 1;
            Statics.field100.field791.method5503(new class406(var38));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field100.field791.method5496();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field1010 != null) {
                Statics.field1010.method5498();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var39 = field831[--Statics.field2755] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method5503(new class405(var39));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var40 = field831[--Statics.field2755] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method5503(new class406(var40));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var41 = field831[--Statics.field2755] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method5503(new class106(var41));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var42 = field831[--Statics.field2755] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method5503(new class102(var42));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var43 = field831[--Statics.field2755] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method5503(new class105(var43));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var44 = field831[--Statics.field2755] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method5503(new class110(var44));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var45 = field831[--Statics.field2755] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method5503(new class104(var45));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var46 = field831[--Statics.field2755] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method5503(new class103(var46));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var47 = field831[--Statics.field2755] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method5503(new class107(var47));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var48 = field831[--Statics.field2755] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method5503(new class108(var48));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field1010 != null) {
                Statics.field1010.method5496();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var49 = field831[--Statics.field2755] == 1;
            Statics.field100.field792.method5503(new class109(var49));
            return 1;
        } else if (arg0 == 3657) {
            boolean var50 = field831[--Statics.field2755] == 1;
            if (Statics.field1010 != null) {
                Statics.field1010.method5503(new class109(var50));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hr.ad(ILbg;ZB)I")
    public static int method3971(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3700 || arg0 == 3701) {
            Statics.field2755--;
            Statics.field823--;
            return 1;
        } else if (arg0 == 3702) {
            Statics.field2755++;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("iv.al(ILbg;ZB)I")
    public static int method4420(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field1233 == null) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = 1;
                Statics.field3859 = Statics.field1233;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field831[--Statics.field2755];
            if (client.field718[var3] == null) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = 1;
                Statics.field3859 = client.field718[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field822[++Statics.field823 - 1] = Statics.field3859.field1453;
            return 1;
        } else if (arg0 == 3803) {
            field831[++Statics.field2755 - 1] = Statics.field3859.field1448 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field831[++Statics.field2755 - 1] = Statics.field3859.field1449;
            return 1;
        } else if (arg0 == 3805) {
            field831[++Statics.field2755 - 1] = Statics.field3859.field1457;
            return 1;
        } else if (arg0 == 3806) {
            field831[++Statics.field2755 - 1] = Statics.field3859.field1458;
            return 1;
        } else if (arg0 == 3807) {
            field831[++Statics.field2755 - 1] = Statics.field3859.field1459;
            return 1;
        } else if (arg0 == 3809) {
            field831[++Statics.field2755 - 1] = Statics.field3859.field1455;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field831[--Statics.field2755];
            field822[++Statics.field823 - 1] = Statics.field3859.field1471[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = Statics.field3859.field1464[var5];
            return 1;
        } else if (arg0 == 3812) {
            field831[++Statics.field2755 - 1] = Statics.field3859.field1469;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field831[--Statics.field2755];
            field822[++Statics.field823 - 1] = Statics.field3859.field1472[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field2755 -= 3;
            int var7 = field831[Statics.field2755];
            int var8 = field831[Statics.field2755 + 1];
            int var9 = field831[Statics.field2755 + 2];
            field831[++Statics.field2755 - 1] = Statics.field3859.method2386(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field831[++Statics.field2755 - 1] = Statics.field3859.field1470;
            return 1;
        } else if (arg0 == 3816) {
            field831[++Statics.field2755 - 1] = Statics.field3859.field1468;
            return 1;
        } else if (arg0 == 3817) {
            field831[++Statics.field2755 - 1] = Statics.field3859.method2385(field822[--Statics.field823]);
            return 1;
        } else if (arg0 == 3818) {
            field831[Statics.field2755 - 1] = Statics.field3859.method2388()[field831[Statics.field2755 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field2755 -= 2;
            int var10 = field831[Statics.field2755];
            int var11 = field831[Statics.field2755 + 1];
            client.method753(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = Statics.field3859.field1465[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field2755 -= 3;
                int var13 = field831[Statics.field2755];
                boolean var14 = field831[Statics.field2755 + 1] == 1;
                int var15 = field831[Statics.field2755 + 2];
                client.method2131(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field831[--Statics.field2755];
                field831[++Statics.field2755 - 1] = Statics.field3859.field1466[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field2133 == null) {
                    field831[++Statics.field2755 - 1] = 0;
                } else {
                    field831[++Statics.field2755 - 1] = 1;
                    Statics.field147 = Statics.field2133;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field831[--Statics.field2755];
                if (client.field719[var17] == null) {
                    field831[++Statics.field2755 - 1] = 0;
                } else {
                    field831[++Statics.field2755 - 1] = 1;
                    Statics.field147 = client.field719[var17];
                    Statics.field467 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field822[++Statics.field823 - 1] = Statics.field147.field1518;
                return 1;
            } else if (arg0 == 3853) {
                field831[++Statics.field2755 - 1] = Statics.field147.field1514;
                return 1;
            } else if (arg0 == 3854) {
                field831[++Statics.field2755 - 1] = Statics.field147.field1519;
                return 1;
            } else if (arg0 == 3855) {
                field831[++Statics.field2755 - 1] = Statics.field147.method2476();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field831[--Statics.field2755];
                field822[++Statics.field823 - 1] = ((class119) Statics.field147.field1515.get(var18)).field1396.method6800();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field831[--Statics.field2755];
                field831[++Statics.field2755 - 1] = ((class119) Statics.field147.field1515.get(var19)).field1394;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field831[--Statics.field2755];
                field831[++Statics.field2755 - 1] = ((class119) Statics.field147.field1515.get(var20)).field1395;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field831[--Statics.field2755];
                client.method5722(Statics.field467, var21);
                return 1;
            } else if (arg0 == 3860) {
                field831[++Statics.field2755 - 1] = Statics.field147.method2473(field822[--Statics.field823]);
                return 1;
            } else if (arg0 == 3861) {
                field831[Statics.field2755 - 1] = Statics.field147.method2483()[field831[Statics.field2755 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field831[++Statics.field2755 - 1] = Statics.field1389 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("cq.aa(ILbg;ZB)I")
    public static int method2112(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = client.field591[var3].method4876();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = client.field591[var4].field3765;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = client.field591[var5].field3766;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = client.field591[var6].field3769;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = client.field591[var7].field3768;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = client.field591[var8].field3764;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field831[--Statics.field2755];
            int var10 = client.field591[var9].method4885();
            field831[++Statics.field2755 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field831[--Statics.field2755];
            int var12 = client.field591[var11].method4885();
            field831[++Statics.field2755 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field831[--Statics.field2755];
            int var14 = client.field591[var13].method4885();
            field831[++Statics.field2755 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field831[--Statics.field2755];
            int var16 = client.field591[var15].method4885();
            field831[++Statics.field2755 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field831[--Statics.field2755] == 1;
            if (Statics.field1393 != null) {
                Statics.field1393.method4808(class292.field3740, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field831[--Statics.field2755] == 1;
            if (Statics.field1393 != null) {
                Statics.field1393.method4808(class292.field3743, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field2755 -= 2;
            boolean var19 = field831[Statics.field2755] == 1;
            boolean var20 = field831[Statics.field2755 + 1] == 1;
            if (Statics.field1393 != null) {
                client.field760.field477 = var20;
                Statics.field1393.method4808(client.field760, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field831[--Statics.field2755] == 1;
            if (Statics.field1393 != null) {
                Statics.field1393.method4808(class292.field3741, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field831[--Statics.field2755] == 1;
            if (Statics.field1393 != null) {
                Statics.field1393.method4808(class292.field3744, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field831[++Statics.field2755 - 1] = Statics.field1393 == null ? 0 : Statics.field1393.field3745.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field831[--Statics.field2755];
            class298 var24 = (class298) Statics.field1393.field3745.get(var23);
            field831[++Statics.field2755 - 1] = var24.field3759;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field831[--Statics.field2755];
            class298 var26 = (class298) Statics.field1393.field3745.get(var25);
            field822[++Statics.field823 - 1] = var26.method4874();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field831[--Statics.field2755];
            class298 var28 = (class298) Statics.field1393.field3745.get(var27);
            field822[++Statics.field823 - 1] = var28.method4868();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field831[--Statics.field2755];
            class298 var30 = (class298) Statics.field1393.field3745.get(var29);
            long var31 = class397.method3986() - Statics.field862 - var30.field3762;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field822[++Statics.field823 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field831[--Statics.field2755];
            class298 var38 = (class298) Statics.field1393.field3745.get(var37);
            field831[++Statics.field2755 - 1] = var38.field3760.field3769;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field831[--Statics.field2755];
            class298 var40 = (class298) Statics.field1393.field3745.get(var39);
            field831[++Statics.field2755 - 1] = var40.field3760.field3766;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field831[--Statics.field2755];
            class298 var42 = (class298) Statics.field1393.field3745.get(var41);
            field831[++Statics.field2755 - 1] = var42.field3760.field3765;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gc.aw(ILbg;ZI)I")
    public static int method3501(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field2755 -= 2;
            int var3 = field831[Statics.field2755];
            int var4 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field2755 -= 2;
            int var5 = field831[Statics.field2755];
            int var6 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field2755 -= 2;
            int var7 = field831[Statics.field2755];
            int var8 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field2755 -= 2;
            int var9 = field831[Statics.field2755];
            int var10 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field2755 -= 5;
            int var13 = field831[Statics.field2755];
            int var14 = field831[Statics.field2755 + 1];
            int var15 = field831[Statics.field2755 + 2];
            int var16 = field831[Statics.field2755 + 3];
            int var17 = field831[Statics.field2755 + 4];
            field831[++Statics.field2755 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field2755 -= 2;
            int var18 = field831[Statics.field2755];
            int var19 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field2755 -= 2;
            int var20 = field831[Statics.field2755];
            int var21 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field2755 -= 2;
            int var22 = field831[Statics.field2755];
            int var23 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field2755 -= 2;
            int var24 = field831[Statics.field2755];
            int var25 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field2755 -= 2;
            int var26 = field831[Statics.field2755];
            int var27 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field2755 -= 2;
            int var28 = field831[Statics.field2755];
            int var29 = field831[Statics.field2755 + 1];
            if (var28 == 0) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field2755 -= 2;
            int var30 = field831[Statics.field2755];
            int var31 = field831[Statics.field2755 + 1];
            if (var30 == 0) {
                field831[++Statics.field2755 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field831[++Statics.field2755 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field831[++Statics.field2755 - 1] = var30;
                    break;
                case 2:
                    field831[++Statics.field2755 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field831[++Statics.field2755 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field831[++Statics.field2755 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field831[++Statics.field2755 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field2755 -= 2;
            int var32 = field831[Statics.field2755];
            int var33 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field2755 -= 2;
            int var34 = field831[Statics.field2755];
            int var35 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field2755 -= 3;
            long var36 = (long) field831[Statics.field2755];
            long var38 = (long) field831[Statics.field2755 + 1];
            long var40 = (long) field831[Statics.field2755 + 2];
            field831[++Statics.field2755 - 1] = (int) (var36 * var40 / var38);
            return 1;
        } else if (arg0 == 4025) {
            int var42 = class246.method2094(field831[--Statics.field2755]);
            field831[++Statics.field2755 - 1] = var42;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field2755 -= 2;
            int var43 = field831[Statics.field2755];
            int var44 = field831[Statics.field2755 + 1];
            field831[++Statics.field2755 - 1] = var43 ^ 0x1 << var44;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field2755 -= 3;
            int var45 = field831[Statics.field2755];
            int var46 = field831[Statics.field2755 + 1];
            int var47 = field831[Statics.field2755 + 2];
            field831[++Statics.field2755 - 1] = class246.method1633(var45, var46, var47);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field2755 -= 3;
            int var48 = field831[Statics.field2755];
            int var49 = field831[Statics.field2755 + 1];
            int var50 = field831[Statics.field2755 + 2];
            field831[++Statics.field2755 - 1] = class246.method93(var48, var49, var50);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field2755 -= 3;
            int var51 = field831[Statics.field2755];
            int var52 = field831[Statics.field2755 + 1];
            int var53 = field831[Statics.field2755 + 2];
            int var54 = 31 - var53;
            field831[++Statics.field2755 - 1] = var51 << var54 >>> var52 + var54;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field2755 -= 4;
            int var55 = field831[Statics.field2755];
            int var56 = field831[Statics.field2755 + 1];
            int var57 = field831[Statics.field2755 + 2];
            int var58 = field831[Statics.field2755 + 3];
            int var59 = class246.method93(var55, var57, var58);
            int var60 = class246.method2367(var58 - var57 + 1);
            if (var56 > var60) {
                var56 = var60;
            }
            field831[++Statics.field2755 - 1] = var59 | var56 << var57;
            return 1;
        } else if (arg0 == 4032) {
            field831[Statics.field2755 - 1] = Statics.method4584(field831[Statics.field2755 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field831[Statics.field2755 - 1] = class361.method4132(field831[Statics.field2755 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field2755 -= 2;
            int var61 = field831[Statics.field2755];
            int var62 = field831[Statics.field2755 + 1];
            int var63 = class361.method5572(var61, var62);
            field831[++Statics.field2755 - 1] = var63;
            return 1;
        } else if (arg0 == 4035) {
            field831[Statics.field2755 - 1] = Math.abs(field831[Statics.field2755 - 1]);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cz.at(ILbg;ZI)I")
    public static int method2273(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field822[--Statics.field823];
            int var4 = field831[--Statics.field2755];
            field822[++Statics.field823 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field823 -= 2;
            String var5 = field822[Statics.field823];
            String var6 = field822[Statics.field823 + 1];
            field822[++Statics.field823 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field822[--Statics.field823];
            int var8 = field831[--Statics.field2755];
            field822[++Statics.field823 - 1] = var7 + class319.method2705(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field822[--Statics.field823];
            field822[++Statics.field823 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field831[--Statics.field2755];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field815.setTime(new Date(var11));
            int var13 = field815.get(5);
            int var14 = field815.get(2);
            int var15 = field815.get(1);
            field822[++Statics.field823 - 1] = var13 + "-" + field827[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field823 -= 2;
            String var16 = field822[Statics.field823];
            String var17 = field822[Statics.field823 + 1];
            if (Statics.field1485.field1064 != null && Statics.field1485.field1064.field3015) {
                field822[++Statics.field823 - 1] = var17;
            } else {
                field822[++Statics.field823 - 1] = var16;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field831[--Statics.field2755];
            field822[++Statics.field823 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field823 -= 2;
            field831[++Statics.field2755 - 1] = class319.method3603(class320.method2375(field822[Statics.field823], field822[Statics.field823 + 1], Statics.field3879));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field822[--Statics.field823];
            Statics.field2755 -= 2;
            int var20 = field831[Statics.field2755];
            int var21 = field831[Statics.field2755 + 1];
            byte[] var22 = Statics.field4248.method4710(var21, 0);
            class315 var23 = new class315(var22);
            field831[++Statics.field2755 - 1] = var23.method5131(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field822[--Statics.field823];
            Statics.field2755 -= 2;
            int var25 = field831[Statics.field2755];
            int var26 = field831[Statics.field2755 + 1];
            byte[] var27 = Statics.field4248.method4710(var26, 0);
            class315 var28 = new class315(var27);
            field831[++Statics.field2755 - 1] = var28.method5130(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field823 -= 2;
            String var29 = field822[Statics.field823];
            String var30 = field822[Statics.field823 + 1];
            if (field831[--Statics.field2755] == 1) {
                field822[++Statics.field823 - 1] = var29;
            } else {
                field822[++Statics.field823 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field822[--Statics.field823];
            field822[++Statics.field823 - 1] = class316.method5207(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field822[--Statics.field823];
            int var33 = field831[--Statics.field2755];
            field822[++Statics.field823 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = class319.method2145((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = class319.method2274((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = class319.method414((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = class319.method3978((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field822[--Statics.field823];
            if (var38 == null) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field822[--Statics.field823];
            Statics.field2755 -= 2;
            int var40 = field831[Statics.field2755];
            int var41 = field831[Statics.field2755 + 1];
            field822[++Statics.field823 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field822[--Statics.field823];
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
            field822[++Statics.field823 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field822[--Statics.field823];
            int var48 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field823 -= 2;
            String var49 = field822[Statics.field823];
            String var50 = field822[Statics.field823 + 1];
            int var51 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field822[--Statics.field823];
            field822[++Statics.field823 - 1] = var52.toUpperCase();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ml.as(ILbg;ZB)I")
    public static int method5555(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field831[--Statics.field2755];
            field822[++Statics.field823 - 1] = class170.method1776(var3).field1883;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field2755 -= 2;
            int var4 = field831[Statics.field2755];
            int var5 = field831[Statics.field2755 + 1];
            class170 var6 = class170.method1776(var4);
            if (var5 < 1 || var5 > 5 || var6.field1927[var5 - 1] == null) {
                field822[++Statics.field823 - 1] = "";
            } else {
                field822[++Statics.field823 - 1] = var6.field1927[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field2755 -= 2;
            int var7 = field831[Statics.field2755];
            int var8 = field831[Statics.field2755 + 1];
            class170 var9 = class170.method1776(var7);
            if (var8 < 1 || var8 > 5 || var9.field1890[var8 - 1] == null) {
                field822[++Statics.field823 - 1] = "";
            } else {
                field822[++Statics.field823 - 1] = var9.field1890[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = class170.method1776(var10).field1895;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = class170.method1776(var11).field1926 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field831[--Statics.field2755];
            class170 var13 = class170.method1776(var12);
            if (var13.field1915 == -1 && var13.field1914 >= 0) {
                field831[++Statics.field2755 - 1] = var13.field1914;
            } else {
                field831[++Statics.field2755 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field831[--Statics.field2755];
            class170 var15 = class170.method1776(var14);
            if (var15.field1915 >= 0 && var15.field1914 >= 0) {
                field831[++Statics.field2755 - 1] = var15.field1914;
            } else {
                field831[++Statics.field2755 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = class170.method1776(var16).field1896 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field831[--Statics.field2755];
            class170 var18 = class170.method1776(var17);
            if (var18.field1892 == -1 && var18.field1886 >= 0) {
                field831[++Statics.field2755 - 1] = var18.field1886;
            } else {
                field831[++Statics.field2755 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field831[--Statics.field2755];
            class170 var20 = class170.method1776(var19);
            if (var20.field1892 >= 0 && var20.field1886 >= 0) {
                field831[++Statics.field2755 - 1] = var20.field1886;
            } else {
                field831[++Statics.field2755 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field822[--Statics.field823];
            int var22 = field831[--Statics.field2755];
            client.method2304(var21, var22 == 1);
            field831[++Statics.field2755 - 1] = Statics.field1155;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field23 == null || Statics.field128 >= Statics.field1155) {
                field831[++Statics.field2755 - 1] = -1;
            } else {
                field831[++Statics.field2755 - 1] = Statics.field23[++Statics.field128 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field128 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field831[--Statics.field2755];
            int var24 = class170.method1776(var23).method2948();
            if (var24 == -1) {
                field831[++Statics.field2755 - 1] = var24;
            } else {
                field831[++Statics.field2755 - 1] = var24 + 1;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dp.ae(ILbg;ZI)I")
    public static int method2343(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field831[++Statics.field2755 - 1] = client.field709;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field2755 -= 3;
            client.field709 = field831[Statics.field2755];
            Statics.field90 = class417.method2783(field831[Statics.field2755 + 1]);
            if (Statics.field90 == null) {
                Statics.field90 = class417.field4396;
            }
            client.field710 = field831[Statics.field2755 + 2];
            class242 var3 = Statics.method1576(class240.field2687, client.field535.field1282);
            var3.field2767.method6200(client.field709);
            var3.field2767.method6200(Statics.field90.field4394);
            var3.field2767.method6200(client.field710);
            client.field535.method2211(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field822[--Statics.field823];
            Statics.field2755 -= 2;
            int var5 = field831[Statics.field2755];
            int var6 = field831[Statics.field2755 + 1];
            class242 var7 = Statics.method1576(class240.field2745, client.field535.field1282);
            var7.field2767.method6200(class400.method5614(var4) + 2);
            var7.field2767.method6242(var4);
            var7.field2767.method6200(var5 - 1);
            var7.field2767.method6200(var6);
            client.field535.method2211(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field2755 -= 2;
            int var8 = field831[Statics.field2755];
            int var9 = field831[Statics.field2755 + 1];
            class58 var10 = class98.method360(var8, var9);
            if (var10 == null) {
                field831[++Statics.field2755 - 1] = -1;
                field831[++Statics.field2755 - 1] = 0;
                field822[++Statics.field823 - 1] = "";
                field822[++Statics.field823 - 1] = "";
                field822[++Statics.field823 - 1] = "";
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = var10.field455;
                field831[++Statics.field2755 - 1] = var10.field454;
                field822[++Statics.field823 - 1] = var10.field457 == null ? "" : var10.field457;
                field822[++Statics.field823 - 1] = var10.field461 == null ? "" : var10.field461;
                field822[++Statics.field823 - 1] = var10.field462 == null ? "" : var10.field462;
                field831[++Statics.field2755 - 1] = var10.method1017() ? 1 : (var10.method1020() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field831[--Statics.field2755];
            class58 var12 = class98.method87(var11);
            if (var12 == null) {
                field831[++Statics.field2755 - 1] = -1;
                field831[++Statics.field2755 - 1] = 0;
                field822[++Statics.field823 - 1] = "";
                field822[++Statics.field823 - 1] = "";
                field822[++Statics.field823 - 1] = "";
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = var12.field458;
                field831[++Statics.field2755 - 1] = var12.field454;
                field822[++Statics.field823 - 1] = var12.field457 == null ? "" : var12.field457;
                field822[++Statics.field823 - 1] = var12.field461 == null ? "" : var12.field461;
                field822[++Statics.field823 - 1] = var12.field462 == null ? "" : var12.field462;
                field831[++Statics.field2755 - 1] = var12.method1017() ? 1 : (var12.method1020() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field90 == null) {
                field831[++Statics.field2755 - 1] = -1;
            } else {
                field831[++Statics.field2755 - 1] = Statics.field90.field4394;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field822[--Statics.field823];
            int var14 = field831[--Statics.field2755];
            class242 var15 = class422.method6149(var14, var13, Statics.field3879, -1);
            client.field535.method2211(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field823 -= 2;
            String var16 = field822[Statics.field823];
            String var17 = field822[Statics.field823 + 1];
            class242 var18 = Statics.method1576(class240.field2732, client.field535.field1282);
            var18.field2767.method6311(0);
            int var19 = var18.field2767.field4272;
            var18.field2767.method6242(var16);
            class265.method5341(var18.field2767, var17);
            var18.field2767.method6213(var18.field2767.field4272 - var19);
            client.field535.method2211(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field822[--Statics.field823];
            Statics.field2755 -= 2;
            int var21 = field831[Statics.field2755];
            int var22 = field831[Statics.field2755 + 1];
            class242 var23 = class422.method6149(var21, var20, Statics.field3879, var22);
            client.field535.method2211(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field1485 == null || Statics.field1485.field1070 == null) {
                var24 = "";
            } else {
                var24 = Statics.field1485.field1070.method6800();
            }
            field822[++Statics.field823 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field831[++Statics.field2755 - 1] = client.field710;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = class98.method754(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = class98.method2797(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = class98.method2785(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field822[--Statics.field823];
            client.method3513(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field648 = field822[--Statics.field823].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field822[++Statics.field823 - 1] = client.field648;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field822[--Statics.field823];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5024) {
            Statics.field2755--;
            return 1;
        } else if (arg0 == 5025) {
            Statics.field2755++;
            return 1;
        } else if (arg0 == 5030) {
            Statics.field2755 -= 2;
            int var30 = field831[Statics.field2755];
            int var31 = field831[Statics.field2755 + 1];
            class58 var32 = class98.method360(var30, var31);
            if (var32 == null) {
                field831[++Statics.field2755 - 1] = -1;
                field831[++Statics.field2755 - 1] = 0;
                field822[++Statics.field823 - 1] = "";
                field822[++Statics.field823 - 1] = "";
                field822[++Statics.field823 - 1] = "";
                field831[++Statics.field2755 - 1] = 0;
                field822[++Statics.field823 - 1] = "";
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = var32.field455;
                field831[++Statics.field2755 - 1] = var32.field454;
                field822[++Statics.field823 - 1] = var32.field457 == null ? "" : var32.field457;
                field822[++Statics.field823 - 1] = var32.field461 == null ? "" : var32.field461;
                field822[++Statics.field823 - 1] = var32.field462 == null ? "" : var32.field462;
                field831[++Statics.field2755 - 1] = var32.method1017() ? 1 : (var32.method1020() ? 2 : 0);
                field822[++Statics.field823 - 1] = "";
                field831[++Statics.field2755 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field831[--Statics.field2755];
            class58 var34 = class98.method87(var33);
            if (var34 == null) {
                field831[++Statics.field2755 - 1] = -1;
                field831[++Statics.field2755 - 1] = 0;
                field822[++Statics.field823 - 1] = "";
                field822[++Statics.field823 - 1] = "";
                field822[++Statics.field823 - 1] = "";
                field831[++Statics.field2755 - 1] = 0;
                field822[++Statics.field823 - 1] = "";
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = var34.field458;
                field831[++Statics.field2755 - 1] = var34.field454;
                field822[++Statics.field823 - 1] = var34.field457 == null ? "" : var34.field457;
                field822[++Statics.field823 - 1] = var34.field461 == null ? "" : var34.field461;
                field822[++Statics.field823 - 1] = var34.field462 == null ? "" : var34.field462;
                field831[++Statics.field2755 - 1] = var34.method1017() ? 1 : (var34.method1020() ? 2 : 0);
                field822[++Statics.field823 - 1] = "";
                field831[++Statics.field2755 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("p.av(ILbg;ZS)I")
    public static int method355(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field831[++Statics.field2755 - 1] = client.method151();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field831[--Statics.field2755];
            if (var3 == 1 || var3 == 2) {
                client.method1011(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field831[++Statics.field2755 - 1] = Statics.field1779.field1191;
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field831[--Statics.field2755];
            if (var4 == 1 || var4 == 2) {
                Statics.field1779.field1191 = var4;
                class89.method362();
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field2755--;
            return 1;
        } else if (arg0 == 5311) {
            Statics.field2755 -= 2;
            return 1;
        } else if (arg0 == 5312) {
            Statics.field2755--;
            return 1;
        } else if (arg0 == 5350) {
            Statics.field823 -= 2;
            Statics.field2755--;
            return 1;
        } else if (arg0 == 5351) {
            Statics.field823--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("li.ak(ILbg;ZI)I")
    public static int method5346(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field2755 -= 2;
            int var3 = field831[Statics.field2755];
            int var4 = field831[Statics.field2755 + 1];
            if (!client.field736) {
                client.field487 = var3;
                client.field559 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field831[++Statics.field2755 - 1] = client.field487;
            return 1;
        } else if (arg0 == 5506) {
            field831[++Statics.field2755 - 1] = client.field559;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field831[--Statics.field2755];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field541 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field831[++Statics.field2755 - 1] = client.field541;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ia.an(ILbg;ZI)I")
    public static int method4450(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field536 = 250;
            return 1;
        } else if (arg0 == 5631 || arg0 == 5633) {
            Statics.field823 -= 2;
            return 1;
        } else if (arg0 == 5632) {
            field831[++Statics.field2755 - 1] = 26;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("client.ab(II)I")
    public static int method1511(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("id.au(II)I")
    public static int method4432(int arg0) {
        return (int) ((Math.log((double) arg0) / field832 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("la.am(ILbg;ZI)I")
    public static int method5427(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field2755 -= 2;
            client.field724 = (short) method1511(field831[Statics.field2755]);
            if (client.field724 <= 0) {
                client.field724 = 256;
            }
            client.field743 = (short) method1511(field831[Statics.field2755 + 1]);
            if (client.field743 <= 0) {
                client.field743 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field2755 -= 2;
            client.field543 = (short) field831[Statics.field2755];
            if (client.field543 <= 0) {
                client.field543 = 256;
            }
            client.field745 = (short) field831[Statics.field2755 + 1];
            if (client.field745 <= 0) {
                client.field745 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field2755 -= 4;
            client.field643 = (short) field831[Statics.field2755];
            if (client.field643 <= 0) {
                client.field643 = 1;
            }
            client.field747 = (short) field831[Statics.field2755 + 1];
            if (client.field747 <= 0) {
                client.field747 = 32767;
            } else if (client.field747 < client.field643) {
                client.field747 = client.field643;
            }
            client.field712 = (short) field831[Statics.field2755 + 2];
            if (client.field712 <= 0) {
                client.field712 = 1;
            }
            client.field749 = (short) field831[Statics.field2755 + 3];
            if (client.field749 <= 0) {
                client.field749 = 32767;
            } else if (client.field749 < client.field712) {
                client.field749 = client.field712;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field668 == null) {
                field831[++Statics.field2755 - 1] = -1;
                field831[++Statics.field2755 - 1] = -1;
            } else {
                client.method84(0, 0, client.field668.field3098, client.field668.field3062, false);
                field831[++Statics.field2755 - 1] = client.field752;
                field831[++Statics.field2755 - 1] = client.field753;
            }
            return 1;
        } else if (arg0 == 6204) {
            field831[++Statics.field2755 - 1] = client.field543;
            field831[++Statics.field2755 - 1] = client.field745;
            return 1;
        } else if (arg0 == 6205) {
            field831[++Statics.field2755 - 1] = method4432(client.field724);
            field831[++Statics.field2755 - 1] = method4432(client.field743);
            return 1;
        } else if (arg0 == 6220) {
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field831[++Statics.field2755 - 1] = Statics.field1611;
            return 1;
        } else if (arg0 == 6223) {
            field831[++Statics.field2755 - 1] = Statics.field200;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ka.ao(ILbg;ZB)I")
    public static int method4939(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field831[++Statics.field2755 - 1] = class61.method2882() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class61 var3 = class61.method4865();
            if (var3 == null) {
                field831[++Statics.field2755 - 1] = -1;
                field831[++Statics.field2755 - 1] = 0;
                field822[++Statics.field823 - 1] = "";
                field831[++Statics.field2755 - 1] = 0;
                field831[++Statics.field2755 - 1] = 0;
                field822[++Statics.field823 - 1] = "";
            } else {
                field831[++Statics.field2755 - 1] = var3.field778;
                field831[++Statics.field2755 - 1] = var3.field773;
                field822[++Statics.field823 - 1] = var3.field782;
                field831[++Statics.field2755 - 1] = var3.field783;
                field831[++Statics.field2755 - 1] = var3.field780;
                field822[++Statics.field823 - 1] = var3.field772;
            }
            return 1;
        } else if (arg0 == 6502) {
            class61 var4 = class61.method3075();
            if (var4 == null) {
                field831[++Statics.field2755 - 1] = -1;
                field831[++Statics.field2755 - 1] = 0;
                field822[++Statics.field823 - 1] = "";
                field831[++Statics.field2755 - 1] = 0;
                field831[++Statics.field2755 - 1] = 0;
                field822[++Statics.field823 - 1] = "";
            } else {
                field831[++Statics.field2755 - 1] = var4.field778;
                field831[++Statics.field2755 - 1] = var4.field773;
                field822[++Statics.field823 - 1] = var4.field782;
                field831[++Statics.field2755 - 1] = var4.field783;
                field831[++Statics.field2755 - 1] = var4.field780;
                field822[++Statics.field823 - 1] = var4.field772;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field831[--Statics.field2755];
            class61 var6 = null;
            for (int var7 = 0; var7 < class61.field774; var7++) {
                if (Statics.field4253[var7].field778 == var5) {
                    var6 = Statics.field4253[var7];
                    break;
                }
            }
            if (var6 == null) {
                field831[++Statics.field2755 - 1] = -1;
                field831[++Statics.field2755 - 1] = 0;
                field822[++Statics.field823 - 1] = "";
                field831[++Statics.field2755 - 1] = 0;
                field831[++Statics.field2755 - 1] = 0;
                field822[++Statics.field823 - 1] = "";
            } else {
                field831[++Statics.field2755 - 1] = var6.field778;
                field831[++Statics.field2755 - 1] = var6.field773;
                field822[++Statics.field823 - 1] = var6.field782;
                field831[++Statics.field2755 - 1] = var6.field783;
                field831[++Statics.field2755 - 1] = var6.field780;
                field822[++Statics.field823 - 1] = var6.field772;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field2755 -= 4;
            int var8 = field831[Statics.field2755];
            boolean var9 = field831[Statics.field2755 + 1] == 1;
            int var10 = field831[Statics.field2755 + 2];
            boolean var11 = field831[Statics.field2755 + 3] == 1;
            class61.method3531(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field831[--Statics.field2755];
            if (var12 >= 0 && var12 < class61.field774) {
                class61 var13 = Statics.field4253[var12];
                field831[++Statics.field2755 - 1] = var13.field778;
                field831[++Statics.field2755 - 1] = var13.field773;
                field822[++Statics.field823 - 1] = var13.field782;
                field831[++Statics.field2755 - 1] = var13.field783;
                field831[++Statics.field2755 - 1] = var13.field780;
                field822[++Statics.field823 - 1] = var13.field772;
            } else {
                field831[++Statics.field2755 - 1] = -1;
                field831[++Statics.field2755 - 1] = 0;
                field822[++Statics.field823 - 1] = "";
                field831[++Statics.field2755 - 1] = 0;
                field831[++Statics.field2755 - 1] = 0;
                field822[++Statics.field823 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field634 = field831[--Statics.field2755] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field2755 -= 2;
            int var14 = field831[Statics.field2755];
            int var15 = field831[Statics.field2755 + 1];
            class166 var16 = class166.method3159(var15);
            if (var16.method2801()) {
                field822[++Statics.field823 - 1] = class161.method1950(var14).method2724(var15, var16.field1789);
            } else {
                field831[++Statics.field2755 - 1] = class161.method1950(var14).method2722(var15, var16.field1791);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field2755 -= 2;
            int var17 = field831[Statics.field2755];
            int var18 = field831[Statics.field2755 + 1];
            class166 var19 = class166.method3159(var18);
            if (var19.method2801()) {
                field822[++Statics.field823 - 1] = class169.method2878(var17).method2925(var18, var19.field1789);
            } else {
                field831[++Statics.field2755 - 1] = class169.method2878(var17).method2904(var18, var19.field1791);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field2755 -= 2;
            int var20 = field831[Statics.field2755];
            int var21 = field831[Statics.field2755 + 1];
            class166 var22 = class166.method3159(var21);
            if (var22.method2801()) {
                field822[++Statics.field823 - 1] = class170.method1776(var20).method3001(var21, var22.field1789);
            } else {
                field831[++Statics.field2755 - 1] = class170.method1776(var20).method2947(var21, var22.field1791);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field2755 -= 2;
            int var23 = field831[Statics.field2755];
            int var24 = field831[Statics.field2755 + 1];
            class166 var25 = class166.method3159(var24);
            if (var25.method2801()) {
                field822[++Statics.field823 - 1] = class167.method2710(var23).method2824(var24, var25.field1789);
            } else {
                field831[++Statics.field2755 - 1] = class167.method2710(var23).method2823(var24, var25.field1791);
            }
            return 1;
        } else if (arg0 == 6518) {
            field831[++Statics.field2755 - 1] = client.field489 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field831[++Statics.field2755 - 1] = client.field524 & 0x3;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field823--;
            Statics.field2755--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field823--;
            Statics.field2755--;
            return 1;
        } else if (arg0 == 6524) {
            field831[++Statics.field2755 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field831[++Statics.field2755 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field831[++Statics.field2755 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field831[++Statics.field2755 - 1] = client.field488;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("v.ay(ILbg;ZB)I")
    public static int method168(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field4237;
            int var4 = (Statics.field1485.field1119 >> 7) + Statics.field1942;
            int var5 = (Statics.field1485.field1096 >> 7) + Statics.field3866;
            client.method2566().method5797(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field831[--Statics.field2755];
            String var7 = "";
            class181 var8 = client.method2566().method5815(var6);
            if (var8 != null) {
                var7 = var8.method3228();
            }
            field822[++Statics.field823 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field831[--Statics.field2755];
            client.method2566().method5791(var9);
            return 1;
        } else if (arg0 == 6603) {
            field831[++Statics.field2755 - 1] = client.method2566().method5956();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field831[--Statics.field2755];
            client.method2566().method5809(var10);
            return 1;
        } else if (arg0 == 6605) {
            field831[++Statics.field2755 - 1] = client.method2566().method5814() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class258 var11 = new class258(field831[--Statics.field2755]);
            client.method2566().method5943(var11.field3007, var11.field3008);
            return 1;
        } else if (arg0 == 6607) {
            class258 var12 = new class258(field831[--Statics.field2755]);
            client.method2566().method5922(var12.field3007, var12.field3008);
            return 1;
        } else if (arg0 == 6608) {
            class258 var13 = new class258(field831[--Statics.field2755]);
            client.method2566().method5818(var13.field3006, var13.field3007, var13.field3008);
            return 1;
        } else if (arg0 == 6609) {
            class258 var14 = new class258(field831[--Statics.field2755]);
            client.method2566().method5819(var14.field3006, var14.field3007, var14.field3008);
            return 1;
        } else if (arg0 == 6610) {
            field831[++Statics.field2755 - 1] = client.method2566().method5820();
            field831[++Statics.field2755 - 1] = client.method2566().method5821();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field831[--Statics.field2755];
            class181 var16 = client.method2566().method5815(var15);
            if (var16 == null) {
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = var16.method3236().method4467();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field831[--Statics.field2755];
            class181 var18 = client.method2566().method5815(var17);
            if (var18 == null) {
                field831[++Statics.field2755 - 1] = 0;
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = (var18.method3197() - var18.method3196() + 1) * 64;
                field831[++Statics.field2755 - 1] = (var18.method3244() - var18.method3198() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field831[--Statics.field2755];
            class181 var20 = client.method2566().method5815(var19);
            if (var20 == null) {
                field831[++Statics.field2755 - 1] = 0;
                field831[++Statics.field2755 - 1] = 0;
                field831[++Statics.field2755 - 1] = 0;
                field831[++Statics.field2755 - 1] = 0;
            } else {
                field831[++Statics.field2755 - 1] = var20.method3196() * 64;
                field831[++Statics.field2755 - 1] = var20.method3198() * 64;
                field831[++Statics.field2755 - 1] = var20.method3197() * 64 + 64 - 1;
                field831[++Statics.field2755 - 1] = var20.method3244() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field831[--Statics.field2755];
            class181 var22 = client.method2566().method5815(var21);
            if (var22 == null) {
                field831[++Statics.field2755 - 1] = -1;
            } else {
                field831[++Statics.field2755 - 1] = var22.method3195();
            }
            return 1;
        } else if (arg0 == 6615) {
            class258 var23 = client.method2566().method5848();
            if (var23 == null) {
                field831[++Statics.field2755 - 1] = -1;
                field831[++Statics.field2755 - 1] = -1;
            } else {
                field831[++Statics.field2755 - 1] = var23.field3007;
                field831[++Statics.field2755 - 1] = var23.field3008;
            }
            return 1;
        } else if (arg0 == 6616) {
            field831[++Statics.field2755 - 1] = client.method2566().method5799();
            return 1;
        } else if (arg0 == 6617) {
            class258 var24 = new class258(field831[--Statics.field2755]);
            class181 var25 = client.method2566().method5885();
            if (var25 == null) {
                field831[++Statics.field2755 - 1] = -1;
                field831[++Statics.field2755 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method3263(var24.field3006, var24.field3007, var24.field3008);
            if (var26 == null) {
                field831[++Statics.field2755 - 1] = -1;
                field831[++Statics.field2755 - 1] = -1;
            } else {
                field831[++Statics.field2755 - 1] = var26[0];
                field831[++Statics.field2755 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class258 var27 = new class258(field831[--Statics.field2755]);
            class181 var28 = client.method2566().method5885();
            if (var28 == null) {
                field831[++Statics.field2755 - 1] = -1;
                field831[++Statics.field2755 - 1] = -1;
                return 1;
            }
            class258 var29 = var28.method3188(var27.field3007, var27.field3008);
            if (var29 == null) {
                field831[++Statics.field2755 - 1] = -1;
            } else {
                field831[++Statics.field2755 - 1] = var29.method4467();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field2755 -= 2;
            int var30 = field831[Statics.field2755];
            class258 var31 = new class258(field831[Statics.field2755 + 1]);
            method209(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field2755 -= 2;
            int var32 = field831[Statics.field2755];
            class258 var33 = new class258(field831[Statics.field2755 + 1]);
            method209(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field2755 -= 2;
            int var34 = field831[Statics.field2755];
            class258 var35 = new class258(field831[Statics.field2755 + 1]);
            class181 var36 = client.method2566().method5815(var34);
            if (var36 == null) {
                field831[++Statics.field2755 - 1] = 0;
                return 1;
            } else {
                field831[++Statics.field2755 - 1] = var36.method3185(var35.field3006, var35.field3007, var35.field3008) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field831[++Statics.field2755 - 1] = client.method2566().method5823();
            field831[++Statics.field2755 - 1] = client.method2566().method5824();
            return 1;
        } else if (arg0 == 6623) {
            class258 var37 = new class258(field831[--Statics.field2755]);
            class181 var38 = client.method2566().method5796(var37.field3006, var37.field3007, var37.field3008);
            if (var38 == null) {
                field831[++Statics.field2755 - 1] = -1;
            } else {
                field831[++Statics.field2755 - 1] = var38.method3187();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method2566().method5789(field831[--Statics.field2755]);
            return 1;
        } else if (arg0 == 6625) {
            client.method2566().method5808();
            return 1;
        } else if (arg0 == 6626) {
            client.method2566().method5827(field831[--Statics.field2755]);
            return 1;
        } else if (arg0 == 6627) {
            client.method2566().method5870();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field831[--Statics.field2755] == 1;
            client.method2566().method5831(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field831[--Statics.field2755];
            client.method2566().method5946(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field831[--Statics.field2755];
            client.method2566().method5845(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method2566().method5812();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field831[--Statics.field2755] == 1;
            client.method2566().method5833(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field2755 -= 2;
            int var43 = field831[Statics.field2755];
            boolean var44 = field831[Statics.field2755 + 1] == 1;
            client.method2566().method5834(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field2755 -= 2;
            int var45 = field831[Statics.field2755];
            boolean var46 = field831[Statics.field2755 + 1] == 1;
            client.method2566().method5835(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field831[++Statics.field2755 - 1] = client.method2566().method5838() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = client.method2566().method5929(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field831[--Statics.field2755];
            field831[++Statics.field2755 - 1] = client.method2566().method5944(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field2755 -= 2;
            int var49 = field831[Statics.field2755];
            class258 var50 = new class258(field831[Statics.field2755 + 1]);
            class258 var51 = client.method2566().method5841(var49, var50);
            if (var51 == null) {
                field831[++Statics.field2755 - 1] = -1;
            } else {
                field831[++Statics.field2755 - 1] = var51.method4467();
            }
            return 1;
        } else if (arg0 == 6639) {
            class199 var52 = client.method2566().method5816();
            if (var52 == null) {
                field831[++Statics.field2755 - 1] = -1;
                field831[++Statics.field2755 - 1] = -1;
            } else {
                field831[++Statics.field2755 - 1] = var52.method3144();
                field831[++Statics.field2755 - 1] = var52.field2194.method4467();
            }
            return 1;
        } else if (arg0 == 6640) {
            class199 var53 = client.method2566().method5844();
            if (var53 == null) {
                field831[++Statics.field2755 - 1] = -1;
                field831[++Statics.field2755 - 1] = -1;
            } else {
                field831[++Statics.field2755 - 1] = var53.method3144();
                field831[++Statics.field2755 - 1] = var53.field2194.method4467();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field831[--Statics.field2755];
            class154 var55 = class154.method1007(var54);
            if (var55.field1640 == null) {
                field822[++Statics.field823 - 1] = "";
            } else {
                field822[++Statics.field823 - 1] = var55.field1640;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field831[--Statics.field2755];
            class154 var57 = class154.method1007(var56);
            field831[++Statics.field2755 - 1] = var57.field1628;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field831[--Statics.field2755];
            class154 var59 = class154.method1007(var58);
            if (var59 == null) {
                field831[++Statics.field2755 - 1] = -1;
            } else {
                field831[++Statics.field2755 - 1] = var59.field1642;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field831[--Statics.field2755];
            class154 var61 = class154.method1007(var60);
            if (var61 == null) {
                field831[++Statics.field2755 - 1] = -1;
            } else {
                field831[++Statics.field2755 - 1] = var61.field1624;
            }
            return 1;
        } else if (arg0 == 6697) {
            field831[++Statics.field2755 - 1] = Statics.field1530.field2215;
            return 1;
        } else if (arg0 == 6698) {
            field831[++Statics.field2755 - 1] = Statics.field1530.field2219.method4467();
            return 1;
        } else if (arg0 == 6699) {
            field831[++Statics.field2755 - 1] = Statics.field1530.field2216.method4467();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aa.aj(ILbg;ZI)I")
    public static int method418(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6700 || arg0 == 6702 || arg0 == 6704 || arg0 == 6706 || arg0 == 6708) {
            Statics.field2755 -= 2;
            Statics.field823--;
            return 1;
        } else if (arg0 == 6701 || arg0 == 6703 || arg0 == 6705 || arg0 == 6707 || arg0 == 6709) {
            Statics.field2755--;
            return 1;
        } else if (arg0 == 6750) {
            field822[++Statics.field823 - 1] = "";
            return 1;
        } else if (arg0 == 6751 || arg0 == 6752 || arg0 == 6753) {
            field831[++Statics.field2755 - 1] = -1;
            return 1;
        } else if (arg0 == 6754) {
            int var3 = field831[--Statics.field2755];
            class161 var4 = class161.method1950(var3);
            field822[++Statics.field823 - 1] = var4 == null ? "" : var4.field1710;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cw.ap(ILbg;ZI)I")
    public static int method1939(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6800) {
            field822[++Statics.field823 - 1] = "";
            return 1;
        } else if (arg0 == 6801 || arg0 == 6802) {
            field831[++Statics.field2755 - 1] = -1;
            return 1;
        } else if (arg0 == 6850) {
            field822[++Statics.field823 - 1] = "";
            return 1;
        } else if (arg0 == 6851 || arg0 == 6852) {
            field831[++Statics.field2755 - 1] = -1;
            return 1;
        } else if (arg0 == 6853) {
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fg.ai(ILbg;ZI)I")
    public static int method2704(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 6900) {
            field822[++Statics.field823 - 1] = "";
            return 1;
        } else if (arg0 == 6950) {
            field831[++Statics.field2755 - 1] = -1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gu.ac(ILbg;ZI)I")
    public static int method3472(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7000 || arg0 == 7005 || arg0 == 7010 || arg0 == 7015 || arg0 == 7020 || arg0 == 7025 || arg0 == 7030 || arg0 == 7035) {
            Statics.field2755 -= 5;
            return 1;
        } else if (arg0 == 7001 || arg0 == 7002 || arg0 == 7011 || arg0 == 7012 || arg0 == 7021 || arg0 == 7022) {
            Statics.field2755 -= 3;
            return 1;
        } else if (arg0 == 7003 || arg0 == 7013 || arg0 == 7023) {
            Statics.field2755 -= 2;
            return 1;
        } else if (arg0 == 7006 || arg0 == 7007 || arg0 == 7016 || arg0 == 7017 || arg0 == 7026 || arg0 == 7027) {
            Statics.field2755 -= 2;
            return 1;
        } else if (arg0 == 7008 || arg0 == 7018 || arg0 == 7028) {
            Statics.field2755--;
            return 1;
        } else if (arg0 == 7031 || arg0 == 7032) {
            Statics.field823--;
            Statics.field2755--;
            return 1;
        } else if (arg0 == 7033) {
            Statics.field823--;
            return 1;
        } else if (arg0 == 7036 || arg0 == 7037) {
            Statics.field2755 -= 2;
            return 1;
        } else if (arg0 == 7038) {
            Statics.field2755--;
            return 1;
        } else if (arg0 == 7004 || arg0 == 7009 || arg0 == 7014 || arg0 == 7019 || arg0 == 7024 || arg0 == 7029 || arg0 == 7034 || arg0 == 7039) {
            Statics.field2755--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("kq.ag(ILbg;ZB)I")
    public static int method4891(int arg0, class72 arg1, boolean arg2) {
        if (arg0 == 7100) {
            Statics.field2755++;
            return 1;
        } else if (arg0 == 7101) {
            Statics.field823 += 2;
            return 1;
        } else if (arg0 == 7102 || arg0 == 7103 || arg0 == 7104 || arg0 == 7105 || arg0 == 7109) {
            Statics.field2755++;
            return 1;
        } else if (arg0 == 7106) {
            Statics.field2755++;
            return 1;
        } else if (arg0 == 7107) {
            Statics.field2755++;
            return 1;
        } else if (arg0 == 7108) {
            field831[++Statics.field2755 - 1] = client.method4475() ? 1 : 0;
            return 1;
        } else if (arg0 == 7110) {
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 7120) {
            Statics.field2755--;
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else if (arg0 == 7121) {
            Statics.field2755 -= 2;
            field831[++Statics.field2755 - 1] = -1;
            return 1;
        } else if (arg0 == 7122) {
            Statics.field2755 -= 2;
            field831[++Statics.field2755 - 1] = 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hr.ar(ILbg;ZI)I")
    public static int method3977(int arg0, class72 arg1, boolean arg2) {
        if (arg0 >= 7200 && arg0 < 7204) {
            Statics.field2755 -= 5;
            field831[++Statics.field2755 - 1] = -1;
            return 1;
        } else if (arg0 == 7204) {
            Statics.field2755 -= 6;
            field831[++Statics.field2755 - 1] = -1;
            return 1;
        } else if (arg0 >= 7205 && arg0 < 7209) {
            field831[Statics.field2755 - 1] = -1;
            return 1;
        } else if (arg0 == 7209) {
            Statics.field2755 -= 2;
            field831[++Statics.field2755 - 1] = -1;
            return 1;
        } else if (arg0 >= 7210 && arg0 < 7214) {
            Statics.field2755--;
            return 1;
        } else if (arg0 == 7214) {
            Statics.field2755 -= 2;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ce.az(II)V")
    public static void method2282(int arg0) {
        if (arg0 == -1 || !class262.method5238(arg0)) {
            return;
        }
        class262[] var1 = Statics.field1535[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class262 var3 = var1[var2];
            if (var3.field3133 != null) {
                class81 var4 = new class81();
                var4.field1028 = var3;
                var4.field1031 = var3.field3133;
                method3784(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("h.bd(ILiy;ZI)V")
    public static void method209(int arg0, class258 arg1, boolean arg2) {
        class181 var3 = client.method2566().method5815(arg0);
        int var4 = Statics.field1485.field1067;
        int var5 = (Statics.field1485.field1119 >> 7) + Statics.field1942;
        int var6 = (Statics.field1485.field1096 >> 7) + Statics.field3866;
        class258 var7 = new class258(var4, var5, var6);
        client.method2566().method5803(var3, var7, arg1, arg2);
    }
}
