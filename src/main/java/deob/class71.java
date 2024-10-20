package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("cb")
public class class71 {

    @ObfuscatedName("cb.ai")
    public static int[] field880 = new int[5];

    @ObfuscatedName("cb.az")
    public static int[][] field883 = new int[5][5000];

    @ObfuscatedName("cb.ap")
    public static int[] field893 = new int[1000];

    @ObfuscatedName("cb.af")
    public static String[] field877 = new String[1000];

    @ObfuscatedName("cb.aq")
    public static int field884 = 0;

    @ObfuscatedName("cb.al")
    public static class64[] field882 = new class64[50];

    @ObfuscatedName("cb.ax")
    public static Calendar field885 = Calendar.getInstance();

    @ObfuscatedName("cb.ah")
    public static final String[] field887 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cb.ay")
    public static boolean field894 = false;

    @ObfuscatedName("cb.aj")
    public static boolean field888 = false;

    @ObfuscatedName("cb.av")
    public static ArrayList field890 = new ArrayList();

    @ObfuscatedName("cb.aw")
    public static int field891 = 0;

    @ObfuscatedName("cb.bk")
    public static final double field892 = Math.log(2.0D);

    public class71() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ky.au(Ldy;B)V")
    public static void method5065(class88 arg0) {
        method2499(arg0, 500000, 475000);
    }

    @ObfuscatedName("dx.ae(Ldy;IIB)V")
    public static void method2499(class88 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1087;
        class79 var5;
        if (class513.method6989(arg0.field1091)) {
            Statics.field522 = (class280) var3[0];
            class188 var4 = class188.method2945(Statics.field522.field3080);
            var5 = class79.method6284(arg0.field1091, var4.field1948, var4.field1963);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class79.method2912(var6);
        }
        if (var5 != null) {
            method2972(arg0, var5, arg1, arg2);
        }
    }

    @ObfuscatedName("fx.ao(Ldy;Ldh;III)V")
    public static void method2972(class88 arg0, class79 arg1, int arg2, int arg3) {
        Object[] var4 = arg0.field1087;
        Statics.field335 = 0;
        Statics.field1625 = 0;
        int var5 = -1;
        int[] var6 = arg1.field1011;
        int[] var7 = arg1.field1012;
        byte var8 = -1;
        field884 = 0;
        field894 = false;
        boolean var9 = false;
        int var10 = 0;
        try {
            Statics.field3541 = new int[arg1.field1014];
            int var11 = 0;
            Statics.field879 = new String[arg1.field1018];
            int var12 = 0;
            for (int var13 = 1; var13 < var4.length; var13++) {
                if (var4[var13] instanceof Integer) {
                    int var14 = (Integer) var4[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field1085;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field1088;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field1084 == null ? -1 : arg0.field1084.field3647;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1089;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field1084 == null ? -1 : arg0.field1084.field3770;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1090 == null ? -1 : arg0.field1090.field3647;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1090 == null ? -1 : arg0.field1090.field3770;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field1086;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field1092;
                    }
                    Statics.field3541[var11++] = var14;
                } else if (var4[var13] instanceof String) {
                    String var15 = (String) var4[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1093;
                    }
                    Statics.field879[var12++] = var15;
                }
            }
            field891 = arg0.field1094;
            while (true) {
                var10++;
                if (var10 > arg2) {
                    throw new RuntimeException();
                }
                var5++;
                int var59 = var6[var5];
                if (var59 >= 100) {
                    boolean var46;
                    if (arg1.field1012[var5] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    int var47 = method2679(var59, arg1, var46);
                    switch(var47) {
                        case 0:
                            return;
                        case 1:
                        default:
                            break;
                        case 2:
                            throw new IllegalStateException();
                    }
                } else if (var59 == 0) {
                    field893[++Statics.field335 - 1] = var7[var5];
                } else if (var59 == 1) {
                    int var16 = var7[var5];
                    field893[++Statics.field335 - 1] = class322.field3540[var16];
                } else if (var59 == 2) {
                    int var17 = var7[var5];
                    class322.field3540[var17] = field893[--Statics.field335];
                    client.method5042(var17);
                } else if (var59 == 3) {
                    field877[++Statics.field1625 - 1] = arg1.field1013[var5];
                } else if (var59 == 6) {
                    var5 += var7[var5];
                } else if (var59 == 7) {
                    Statics.field335 -= 2;
                    if (field893[Statics.field335] != field893[Statics.field335 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 8) {
                    Statics.field335 -= 2;
                    if (field893[Statics.field335] == field893[Statics.field335 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 9) {
                    Statics.field335 -= 2;
                    if (field893[Statics.field335] < field893[Statics.field335 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 10) {
                    Statics.field335 -= 2;
                    if (field893[Statics.field335] > field893[Statics.field335 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 21) {
                    if (field884 == 0) {
                        return;
                    }
                    class64 var19 = field882[--field884];
                    arg1 = var19.field493;
                    var6 = arg1.field1011;
                    var7 = arg1.field1012;
                    var5 = var19.field497;
                    Statics.field3541 = var19.field494;
                    Statics.field879 = var19.field495;
                } else if (var59 == 25) {
                    int var20 = var7[var5];
                    field893[++Statics.field335 - 1] = class322.method2448(var20);
                } else if (var59 == 27) {
                    int var21 = var7[var5];
                    Statics.method4396(var21, field893[--Statics.field335]);
                } else if (var59 == 31) {
                    Statics.field335 -= 2;
                    if (field893[Statics.field335] <= field893[Statics.field335 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 32) {
                    Statics.field335 -= 2;
                    if (field893[Statics.field335] >= field893[Statics.field335 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 33) {
                    field893[++Statics.field335 - 1] = Statics.field3541[var7[var5]];
                } else if (var59 == 34) {
                    Statics.field3541[var7[var5]] = field893[--Statics.field335];
                } else if (var59 == 35) {
                    field877[++Statics.field1625 - 1] = Statics.field879[var7[var5]];
                } else if (var59 == 36) {
                    Statics.field879[var7[var5]] = field877[--Statics.field1625];
                } else if (var59 == 37) {
                    int var22 = var7[var5];
                    Statics.field1625 -= var22;
                    String var23 = class387.method5057(field877, Statics.field1625, var22);
                    field877[++Statics.field1625 - 1] = var23;
                } else if (var59 == 38) {
                    Statics.field335--;
                } else if (var59 == 39) {
                    Statics.field1625--;
                } else if (var59 == 40) {
                    int var24 = var7[var5];
                    class79 var25 = class79.method2912(var24);
                    int[] var26 = new int[var25.field1014];
                    String[] var27 = new String[var25.field1018];
                    for (int var28 = 0; var28 < var25.field1016; var28++) {
                        var26[var28] = field893[Statics.field335 - var25.field1016 + var28];
                    }
                    for (int var29 = 0; var29 < var25.field1017; var29++) {
                        var27[var29] = field877[Statics.field1625 - var25.field1017 + var29];
                    }
                    Statics.field335 -= var25.field1016;
                    Statics.field1625 -= var25.field1017;
                    class64 var30 = new class64();
                    var30.field493 = arg1;
                    var30.field497 = var5;
                    var30.field494 = Statics.field3541;
                    var30.field495 = Statics.field879;
                    field882[++field884 - 1] = var30;
                    arg1 = var25;
                    var6 = var25.field1011;
                    var7 = var25.field1012;
                    var5 = -1;
                    Statics.field3541 = var26;
                    Statics.field879 = var27;
                } else if (var59 == 42) {
                    field893[++Statics.field335 - 1] = Statics.field137.method2597(var7[var5]);
                } else if (var59 == 43) {
                    Statics.field137.method2633(var7[var5], field893[--Statics.field335]);
                } else if (var59 == 44) {
                    int var31 = var7[var5] >> 16;
                    int var32 = var7[var5] & 0xFFFF;
                    int var33 = field893[--Statics.field335];
                    if (var33 < 0 || var33 > 5000) {
                        throw new RuntimeException();
                    }
                    field880[var31] = var33;
                    byte var34 = -1;
                    if (var32 == 105) {
                        var34 = 0;
                    }
                    for (int var35 = 0; var35 < var33; var35++) {
                        field883[var31][var35] = var34;
                    }
                } else if (var59 == 45) {
                    int var36 = var7[var5];
                    int var37 = field893[--Statics.field335];
                    if (var37 < 0 || var37 >= field880[var36]) {
                        throw new RuntimeException();
                    }
                    field893[++Statics.field335 - 1] = field883[var36][var37];
                } else if (var59 == 46) {
                    int var38 = var7[var5];
                    Statics.field335 -= 2;
                    int var39 = field893[Statics.field335];
                    if (var39 < 0 || var39 >= field880[var38]) {
                        throw new RuntimeException();
                    }
                    field883[var38][var39] = field893[Statics.field335 + 1];
                } else if (var59 == 47) {
                    String var40 = Statics.field137.method2601(var7[var5]);
                    if (var40 == null) {
                        var40 = class352.field4223;
                    }
                    field877[++Statics.field1625 - 1] = var40;
                } else if (var59 == 48) {
                    Statics.field137.method2611(var7[var5], field877[--Statics.field1625]);
                } else if (var59 == 49) {
                    String var41 = Statics.field137.method2599(var7[var5]);
                    field877[++Statics.field1625 - 1] = var41;
                } else if (var59 == 50) {
                    Statics.field137.method2615(var7[var5], field877[--Statics.field1625]);
                } else if (var59 == 60) {
                    class488 var42 = arg1.field1019[var7[var5]];
                    class472 var43 = (class472) var42.method8008((long) field893[--Statics.field335]);
                    if (var43 != null) {
                        var5 += var43.field4812;
                    }
                } else if (var59 == 74) {
                    Integer var44 = Statics.field4803.method2992(var7[var5]);
                    if (var44 == null) {
                        field893[++Statics.field335 - 1] = -1;
                    } else {
                        field893[++Statics.field335 - 1] = var44;
                    }
                } else if (var59 == 76) {
                    Integer var45 = Statics.field1655.method7612(var7[var5]);
                    if (var45 == null) {
                        field893[++Statics.field335 - 1] = -1;
                    } else {
                        field893[++Statics.field335 - 1] = var45;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var57) {
            var9 = true;
            StringBuilder var50 = new StringBuilder(30);
            var50.append("").append(arg1.field4814).append(" ");
            for (int var51 = field884 - 1; var51 >= 0; var51--) {
                var50.append("").append(field882[var51].field493.field4814).append(" ");
            }
            var50.append("").append(var8);
            Statics.method2661(var50.toString(), var57);
        } finally {
            while (field890.size() > 0) {
                class103 var54 = (class103) field890.remove(0);
                client.method875(var54.method2545(), var54.method2548(), var54.method2539(), var54.method2534(), "");
            }
            if (field894) {
                field894 = false;
                client.method4697();
            }
            if (!var9 && arg3 > 0 && var10 >= arg3) {
                Statics.method2661("Warning: Script " + arg1.field1015 + " finished at op count " + var10 + " of max " + arg2, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("er.at(ILdh;ZI)I")
    public static int method2679(int arg0, class79 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return method4392(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method2074(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method2258(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method2186(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method145(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method3123(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method2911(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method5040(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return Statics.method2095(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method2078(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method8155(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method2074(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method2258(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method2186(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method145(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method3123(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method1999(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method7060(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method5515(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return method2254(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method8155(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method7684(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method5071(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method6350(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method7345(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method4439(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method200(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method455(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method1845(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method6050(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method6062(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return method1073(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method2556(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method6078(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method3069(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method7687(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method1982(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return Statics.method7488(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method2947(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method1983(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method2529(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method3265(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method1038(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method35(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method2649(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method3201(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return Statics.method2185(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method860(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method3255(arg0, arg1, arg2);
        } else if (arg0 < 8100) {
            return method3920(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("jt.ac(ILdh;ZB)I")
    public static int method4392(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 100) {
            Statics.field335 -= 3;
            int var3 = field893[Statics.field335];
            int var4 = field893[Statics.field335 + 1];
            int var5 = field893[Statics.field335 + 2];
            if (var4 == 0) {
                throw new RuntimeException();
            }
            class332 var6 = class332.method2255(var3);
            if (var6.field3784 == null) {
                var6.field3784 = new class332[var5 + 1];
            }
            if (var6.field3784.length <= var5) {
                class332[] var7 = new class332[var5 + 1];
                for (int var8 = 0; var8 < var6.field3784.length; var8++) {
                    var7[var8] = var6.field3784[var8];
                }
                var6.field3784 = var7;
            }
            if (var5 > 0 && var6.field3784[var5 - 1] == null) {
                throw new RuntimeException("" + (var5 - 1));
            }
            class332 var9 = new class332();
            var9.field3649 = var4;
            var9.field3666 = var9.field3647 = var6.field3647;
            var9.field3770 = var5;
            var9.field3731 = true;
            if (var4 == 12) {
                var9.method5870();
                var9.method5988().method5609(new class106(var9));
                var9.method5988().method5608(new class107(var9));
            }
            var6.field3784[var5] = var9;
            if (arg2) {
                Statics.field2872 = var9;
            } else {
                Statics.field2809 = var9;
            }
            client.method3930(var6);
            return 1;
        } else if (arg0 == 101) {
            class332 var10 = arg2 ? Statics.field2872 : Statics.field2809;
            class332 var11 = class332.method2255(var10.field3647);
            var11.field3784[var10.field3770] = null;
            client.method3930(var11);
            return 1;
        } else if (arg0 == 102) {
            class332 var12 = class332.method2255(field893[--Statics.field335]);
            var12.field3784 = null;
            client.method3930(var12);
            return 1;
        } else if (arg0 == 200) {
            Statics.field335 -= 2;
            int var13 = field893[Statics.field335];
            int var14 = field893[Statics.field335 + 1];
            class332 var15 = class332.method865(var13, var14);
            if (var15 == null || var14 == -1) {
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = 1;
                if (arg2) {
                    Statics.field2872 = var15;
                } else {
                    Statics.field2809 = var15;
                }
            }
            return 1;
        } else if (arg0 == 201) {
            class332 var16 = class332.method2255(field893[--Statics.field335]);
            if (var16 == null) {
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = 1;
                if (arg2) {
                    Statics.field2872 = var16;
                } else {
                    Statics.field2809 = var16;
                }
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cc.ai(ILdh;ZS)I")
    public static int method2074(int arg0, class79 arg1, boolean arg2) {
        int var3 = -1;
        class332 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field893[--Statics.field335];
            var4 = class332.method2255(var3);
        } else {
            var4 = arg2 ? Statics.field2872 : Statics.field2809;
        }
        if (arg0 == 1000) {
            Statics.field335 -= 4;
            var4.field3656 = field893[Statics.field335];
            var4.field3657 = field893[Statics.field335 + 1];
            var4.field3652 = field893[Statics.field335 + 2];
            var4.field3653 = field893[Statics.field335 + 3];
            client.method3930(var4);
            Statics.field2415.method1208(var4);
            if (var3 != -1 && var4.field3649 == 0) {
                client.method2001(Statics.field3229[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field335 -= 4;
            var4.field3658 = field893[Statics.field335];
            var4.field3659 = field893[Statics.field335 + 1];
            var4.field3654 = field893[Statics.field335 + 2];
            var4.field3655 = field893[Statics.field335 + 3];
            client.method3930(var4);
            Statics.field2415.method1208(var4);
            if (var3 != -1 && var4.field3649 == 0) {
                client.method2001(Statics.field3229[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field893[--Statics.field335] == 1;
            if (var4.field3667 != var5) {
                var4.field3667 = var5;
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3794 = field893[--Statics.field335] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3795 = field893[--Statics.field335] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dw.az(ILdh;ZI)I")
    public static int method2258(int arg0, class79 arg1, boolean arg2) {
        int var3 = -1;
        class332 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field893[--Statics.field335];
            var4 = class332.method2255(var3);
        } else {
            var4 = arg2 ? Statics.field2872 : Statics.field2809;
        }
        if (arg0 == 1100) {
            Statics.field335 -= 2;
            int var5 = field893[Statics.field335];
            int var6 = field893[Statics.field335 + 1];
            if (var4.field3649 == 12) {
                class330 var7 = var4.method5988();
                if (var7 != null && var7.method5571(var5, var6)) {
                    client.method3930(var4);
                }
            } else {
                var4.field3668 = var5;
                if (var4.field3668 > var4.field3738 - var4.field3662) {
                    var4.field3668 = var4.field3738 - var4.field3662;
                }
                if (var4.field3668 < 0) {
                    var4.field3668 = 0;
                }
                var4.field3682 = var6;
                if (var4.field3682 > var4.field3671 - var4.field3635) {
                    var4.field3682 = var4.field3671 - var4.field3635;
                }
                if (var4.field3682 < 0) {
                    var4.field3682 = 0;
                }
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3672 = field893[--Statics.field335];
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3712 = field893[--Statics.field335] == 1;
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3670 = field893[--Statics.field335];
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3680 = field893[--Statics.field335];
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3737 = field893[--Statics.field335];
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3685 = field893[--Statics.field335];
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3686 = field893[--Statics.field335] == 1;
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3691 = 1;
            var4.field3692 = field893[--Statics.field335];
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field335 -= 6;
            var4.field3697 = field893[Statics.field335];
            var4.field3773 = field893[Statics.field335 + 1];
            var4.field3699 = field893[Statics.field335 + 2];
            var4.field3718 = field893[Statics.field335 + 3];
            var4.field3766 = field893[Statics.field335 + 4];
            var4.field3702 = field893[Statics.field335 + 5];
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field893[--Statics.field335];
            if (var4.field3695 != var8) {
                var4.field3695 = var8;
                var4.field3782 = 0;
                var4.field3783 = 0;
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3723 = field893[--Statics.field335] == 1;
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field877[--Statics.field1625];
            if (!var9.equals(var4.field3710)) {
                var4.field3710 = var9;
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3756 = field893[--Statics.field335];
            if (var4.field3649 == 12) {
                class330 var10 = var4.method5988();
                if (var10 != null) {
                    var10.method5578();
                }
            }
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field335 -= 3;
            if (var4.field3649 == 12) {
                class330 var11 = var4.method5988();
                if (var11 != null) {
                    var11.method5723(field893[Statics.field335], field893[Statics.field335 + 1]);
                    var11.method5573(field893[Statics.field335 + 2]);
                }
            } else {
                var4.field3713 = field893[Statics.field335];
                var4.field3772 = field893[Statics.field335 + 1];
                var4.field3747 = field893[Statics.field335 + 2];
            }
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3631 = field893[--Statics.field335] == 1;
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3687 = field893[--Statics.field335];
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3688 = field893[--Statics.field335];
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3689 = field893[--Statics.field335] == 1;
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3690 = field893[--Statics.field335] == 1;
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field335 -= 2;
            var4.field3738 = field893[Statics.field335];
            var4.field3671 = field893[Statics.field335 + 1];
            client.method3930(var4);
            if (var3 != -1 && var4.field3649 == 0) {
                client.method2001(Statics.field3229[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method7686(var4.field3647, var4.field3770);
            client.field704 = var4;
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3683 = field893[--Statics.field335];
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3673 = field893[--Statics.field335];
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3679 = field893[--Statics.field335];
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var12 = field893[--Statics.field335];
            class527 var13 = (class527) class373.method371(class527.method5378(), var12);
            if (var13 != null) {
                var4.field3677 = var13;
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var14 = field893[--Statics.field335] == 1;
            var4.field3681 = var14;
            return 1;
        } else if (arg0 == 1127) {
            boolean var15 = field893[--Statics.field335] == 1;
            var4.field3707 = var15;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3684 = field877[--Statics.field1625];
            client.method3930(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method5947(field877[--Statics.field1625], Statics.field4644, client.method2688());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field335 -= 2;
            var4.method5899(field893[Statics.field335], field893[Statics.field335 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method5859(field877[--Statics.field1625], field893[--Statics.field335]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field335--;
            class325 var16 = var4.method5872();
            if (var16 != null) {
                var16.field3548 = field893[Statics.field335];
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field335--;
            class325 var17 = var4.method5872();
            if (var17 != null) {
                var17.field3549 = field893[Statics.field335];
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field1625--;
            class330 var18 = var4.method5988();
            if (var18 != null) {
                var4.field3627 = field877[Statics.field1625];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field335--;
            class325 var19 = var4.method5872();
            if (var19 != null) {
                var19.field3550 = field893[Statics.field335];
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field335--;
            class330 var20 = var4.method5988();
            if (var20 != null && var20.method5568(field893[Statics.field335])) {
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field335--;
            class330 var21 = var4.method5988();
            if (var21 != null && var21.method5569(field893[Statics.field335])) {
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field335--;
            class330 var22 = var4.method5988();
            if (var22 != null && var22.method5778(field893[Statics.field335])) {
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var23 = field893[--Statics.field335] == 1;
            client.field766.method3792();
            class330 var24 = var4.method5988();
            if (var24 != null && var24.method5562(var23)) {
                if (var23) {
                    client.field766.method3793(var4);
                }
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var25 = field893[--Statics.field335] == 1;
            if (!var25 && client.field766.method3787() == var4) {
                client.field766.method3792();
                client.method3930(var4);
            }
            class330 var26 = var4.method5988();
            if (var26 != null) {
                var26.method5599(var25);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field335 -= 2;
            class330 var27 = var4.method5988();
            if (var27 != null && var27.method5586(field893[Statics.field335], field893[Statics.field335 + 1])) {
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field335--;
            class330 var28 = var4.method5988();
            if (var28 != null && var28.method5586(field893[Statics.field335], field893[Statics.field335])) {
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field335--;
            class330 var29 = var4.method5988();
            if (var29 != null) {
                var29.method5834(field893[Statics.field335]);
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field335--;
            class330 var30 = var4.method5988();
            if (var30 != null) {
                var30.method5574(field893[Statics.field335]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field335--;
            class330 var31 = var4.method5988();
            if (var31 != null) {
                var31.method5657(field893[Statics.field335]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field335--;
            class330 var32 = var4.method5988();
            if (var32 != null) {
                var32.method5832(field893[Statics.field335]);
                client.method3930(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field335 -= 2;
            class28 var33 = var4.method5857();
            if (var33 != null) {
                var33.method388(field893[Statics.field335], field893[Statics.field335 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field335 -= 2;
            class28 var34 = var4.method5857();
            if (var34 != null) {
                var34.method413((char) field893[Statics.field335], field893[Statics.field335 + 1]);
            }
            return 1;
        } else if (arg0 == 1150) {
            var4.method5923(field877[--Statics.field1625], Statics.field4644);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ds.ap(ILdh;ZI)I")
    public static int method2186(int arg0, class79 arg1, boolean arg2) {
        class332 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class332.method2255(field893[--Statics.field335]);
        } else {
            var3 = arg2 ? Statics.field2872 : Statics.field2809;
        }
        client.method3930(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field335 -= 2;
            int var9 = field893[Statics.field335];
            int var10 = field893[Statics.field335 + 1];
            var3.field3780 = var9;
            var3.field3781 = var10;
            class207 var11 = class207.method3280(var9);
            var3.field3699 = var11.field2223;
            var3.field3718 = var11.field2242;
            var3.field3766 = var11.field2227;
            var3.field3697 = var11.field2224;
            var3.field3773 = var11.field2245;
            var3.field3702 = var11.field2250;
            if (arg0 == 1205) {
                var3.field3708 = 0;
            } else if (arg0 == 1212 | var11.field2246 == 1) {
                var3.field3708 = 1;
            } else {
                var3.field3708 = 2;
            }
            if (var3.field3703 > 0) {
                var3.field3702 = var3.field3702 * 32 / var3.field3703;
            } else if (var3.field3658 > 0) {
                var3.field3702 = var3.field3702 * 32 / var3.field3658;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3691 = 2;
            var3.field3692 = field893[--Statics.field335];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3691 = 3;
            var3.field3692 = Statics.field2132.field1129.method5527();
            return 1;
        } else if (arg0 == 1207) {
            boolean var4 = field893[--Statics.field335] == 1;
            Statics.method3063(var3, Statics.field2132.field1129, var4);
            return 1;
        } else if (arg0 == 1208) {
            int var5 = field893[--Statics.field335];
            if (var3.field3705 == null) {
                throw new RuntimeException("");
            }
            class332.method704(var3, var5);
            return 1;
        } else if (arg0 == 1209) {
            Statics.field335 -= 2;
            int var6 = field893[Statics.field335];
            int var7 = field893[Statics.field335 + 1];
            if (var3.field3705 == null) {
                throw new RuntimeException("");
            }
            class332.method2151(var3, var6, var7);
            return 1;
        } else if (arg0 == 1210) {
            int var8 = field893[--Statics.field335];
            if (var3.field3705 == null) {
                throw new RuntimeException("");
            }
            class332.method2918(var3, Statics.field2132.field1129.field3573, var8);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("al.aa(ILdh;ZI)I")
    public static int method145(int arg0, class79 arg1, boolean arg2) {
        boolean var3 = true;
        class332 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = class332.method2255(field893[--Statics.field335]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field2872 : Statics.field2809;
        }
        if (arg0 == 1300) {
            int var5 = field893[--Statics.field335] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method5852(var5, field877[--Statics.field1625]);
                return 1;
            } else {
                Statics.field1625--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field335 -= 2;
            int var6 = field893[Statics.field335];
            int var7 = field893[Statics.field335 + 1];
            var4.field3750 = class332.method865(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3732 = field893[--Statics.field335] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3660 = field893[--Statics.field335];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3704 = field893[--Statics.field335];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3651 = field877[--Statics.field1625];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3733 = field877[--Statics.field1625];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3728 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3796 = field893[--Statics.field335] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field335--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field335 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field893[Statics.field335 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field893[Statics.field335 + var10];
                        var9[var10 / 2] = (byte) field893[Statics.field335 + var10 + 1];
                    }
                }
            } else {
                Statics.field335 -= 2;
                var8 = new byte[] { (byte) field893[Statics.field335] };
                var9 = new byte[] { (byte) field893[Statics.field335 + 1] };
            }
            int var11 = field893[--Statics.field335] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method7975(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field335 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field893[Statics.field335] };
            byte[] var14 = new byte[] { (byte) field893[Statics.field335 + 1] };
            method7975(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field335 -= 3;
            int var15 = field893[Statics.field335] - 1;
            int var16 = field893[Statics.field335 + 1];
            int var17 = field893[Statics.field335 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method2803(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field893[--Statics.field335];
            int var20 = field893[--Statics.field335];
            method2803(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field335--;
            int var21 = field893[Statics.field335] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method2165(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method2165(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("si.af(Lmi;I[B[BI)V")
    public static final void method7975(class332 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3698 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3698 = new byte[11][];
            arg0.field3797 = new byte[11][];
            arg0.field3725 = new int[11];
            arg0.field3726 = new int[11];
        }
        arg0.field3698[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3722 = false;
            for (int var4 = 0; var4 < arg0.field3698.length; var4++) {
                if (arg0.field3698[var4] != null) {
                    arg0.field3722 = true;
                    break;
                }
            }
        } else {
            arg0.field3722 = true;
        }
        arg0.field3797[arg1] = arg3;
    }

    @ObfuscatedName("ex.ad(Lmi;IIIB)V")
    public static final void method2803(class332 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3725 == null) {
            throw new RuntimeException();
        }
        arg0.field3725[arg1] = arg2;
        arg0.field3726[arg1] = arg3;
    }

    @ObfuscatedName("dg.aq(Lmi;II)V")
    public static final void method2165(class332 arg0, int arg1) {
        if (arg0.field3698 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3793 == null) {
            arg0.field3793 = new int[arg0.field3698.length];
        }
        arg0.field3793[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("gv.al(ILdh;ZI)I")
    public static int method3123(int arg0, class79 arg1, boolean arg2) {
        class332 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = class332.method2255(field893[--Statics.field335]);
        } else {
            var3 = arg2 ? Statics.field2872 : Statics.field2809;
        }
        String var4 = field877[--Statics.field1625];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field893[--Statics.field335];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field893[--Statics.field335];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field877[--Statics.field1625];
            } else {
                var7[var8] = Integer.valueOf(field893[--Statics.field335]);
            }
        }
        int var9 = field893[--Statics.field335];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3701 = var7;
        } else if (arg0 == 1401) {
            var3.field3739 = var7;
        } else if (arg0 == 1402) {
            var3.field3736 = var7;
        } else if (arg0 == 1403) {
            var3.field3740 = var7;
        } else if (arg0 == 1404) {
            var3.field3711 = var7;
        } else if (arg0 == 1405) {
            var3.field3743 = var7;
        } else if (arg0 == 1406) {
            var3.field3746 = var7;
        } else if (arg0 == 1407) {
            var3.field3717 = var7;
            var3.field3748 = var5;
        } else if (arg0 == 1408) {
            var3.field3638 = var7;
        } else if (arg0 == 1409) {
            var3.field3754 = var7;
        } else if (arg0 == 1410) {
            var3.field3744 = var7;
        } else if (arg0 == 1411) {
            var3.field3644 = var7;
        } else if (arg0 == 1412) {
            var3.field3741 = var7;
        } else if (arg0 == 1414) {
            var3.field3749 = var7;
            var3.field3678 = var5;
        } else if (arg0 == 1415) {
            var3.field3751 = var7;
            var3.field3752 = var5;
        } else if (arg0 == 1416) {
            var3.field3745 = var7;
        } else if (arg0 == 1417) {
            var3.field3674 = var7;
        } else if (arg0 == 1418) {
            var3.field3634 = var7;
        } else if (arg0 == 1419) {
            var3.field3758 = var7;
        } else if (arg0 == 1420) {
            var3.field3706 = var7;
        } else if (arg0 == 1421) {
            var3.field3762 = var7;
        } else if (arg0 == 1422) {
            var3.field3765 = var7;
        } else if (arg0 == 1423) {
            var3.field3696 = var7;
        } else if (arg0 == 1424) {
            var3.field3729 = var7;
        } else if (arg0 == 1425) {
            var3.field3769 = var7;
        } else if (arg0 == 1426) {
            var3.field3785 = var7;
        } else if (arg0 == 1427) {
            var3.field3639 = var7;
        } else if (arg0 == 1428) {
            var3.field3763 = var7;
        } else if (arg0 == 1429) {
            var3.field3764 = var7;
        } else if (arg0 == 1430) {
            var3.field3768 = var7;
        } else if (arg0 == 1431) {
            var3.field3724 = var7;
        } else if (arg0 == 1434) {
            var3.field3715 = var7;
        } else if (arg0 == 1435) {
            var3.field3755 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class328 var10 = var3.method5874();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3565 = var7;
                } else if (arg0 == 1437) {
                    var10.field3566 = var7;
                } else if (arg0 == 1438) {
                    var10.field3561 = var7;
                } else if (arg0 == 1439) {
                    var10.field3563 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3734 = true;
        return 1;
    }

    @ObfuscatedName("fs.an(ILdh;ZI)I")
    public static int method2911(int arg0, class79 arg1, boolean arg2) {
        class332 var3 = arg2 ? Statics.field2872 : Statics.field2809;
        if (arg0 == 1500) {
            field893[++Statics.field335 - 1] = var3.field3648;
            return 1;
        } else if (arg0 == 1501) {
            field893[++Statics.field335 - 1] = var3.field3661;
            return 1;
        } else if (arg0 == 1502) {
            field893[++Statics.field335 - 1] = var3.field3662;
            return 1;
        } else if (arg0 == 1503) {
            field893[++Statics.field335 - 1] = var3.field3635;
            return 1;
        } else if (arg0 == 1504) {
            field893[++Statics.field335 - 1] = var3.field3667 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field893[++Statics.field335 - 1] = var3.field3666;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ks.ar(ILdh;ZI)I")
    public static int method5040(int arg0, class79 arg1, boolean arg2) {
        class332 var3 = arg2 ? Statics.field2872 : Statics.field2809;
        if (arg0 == 1600) {
            field893[++Statics.field335 - 1] = var3.field3668;
            return 1;
        } else if (arg0 == 1601) {
            field893[++Statics.field335 - 1] = var3.field3682;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3649 == 12) {
                class330 var4 = var3.method5988();
                if (var4 != null) {
                    field877[++Statics.field1625 - 1] = var4.method5686().method6696();
                    return 1;
                }
            }
            field877[++Statics.field1625 - 1] = var3.field3710;
            return 1;
        } else if (arg0 == 1603) {
            field893[++Statics.field335 - 1] = var3.field3738;
            return 1;
        } else if (arg0 == 1604) {
            field893[++Statics.field335 - 1] = var3.field3671;
            return 1;
        } else if (arg0 == 1605) {
            field893[++Statics.field335 - 1] = var3.field3702;
            return 1;
        } else if (arg0 == 1606) {
            field893[++Statics.field335 - 1] = var3.field3699;
            return 1;
        } else if (arg0 == 1607) {
            field893[++Statics.field335 - 1] = var3.field3766;
            return 1;
        } else if (arg0 == 1608) {
            field893[++Statics.field335 - 1] = var3.field3718;
            return 1;
        } else if (arg0 == 1609) {
            field893[++Statics.field335 - 1] = var3.field3670;
            return 1;
        } else if (arg0 == 1610) {
            field893[++Statics.field335 - 1] = var3.field3679;
            return 1;
        } else if (arg0 == 1611) {
            field893[++Statics.field335 - 1] = var3.field3672;
            return 1;
        } else if (arg0 == 1612) {
            field893[++Statics.field335 - 1] = var3.field3673;
            return 1;
        } else if (arg0 == 1613) {
            field893[++Statics.field335 - 1] = var3.field3677.method30();
            return 1;
        } else if (arg0 == 1614) {
            field893[++Statics.field335 - 1] = var3.field3707 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class325 var5 = var3.method5872();
                field893[++Statics.field335 - 1] = var5 == null ? 0 : var5.field3548;
            }
            if (arg0 == 1618) {
                class325 var6 = var3.method5872();
                field893[++Statics.field335 - 1] = var6 == null ? 0 : var6.field3549;
                return 1;
            } else if (arg0 == 1619) {
                class330 var7 = var3.method5988();
                field877[++Statics.field1625 - 1] = var7 == null ? "" : var7.method5611().method6696();
                return 1;
            } else if (arg0 == 1620) {
                class325 var8 = var3.method5872();
                field893[++Statics.field335 - 1] = var8 == null ? 0 : var8.field3550;
                return 1;
            } else if (arg0 == 1621) {
                class330 var9 = var3.method5988();
                field893[++Statics.field335 - 1] = var9 == null ? 0 : var9.method5782();
                return 1;
            } else if (arg0 == 1622) {
                class330 var10 = var3.method5988();
                field893[++Statics.field335 - 1] = var10 == null ? 0 : var10.method5754();
                return 1;
            } else if (arg0 == 1623) {
                class330 var11 = var3.method5988();
                field893[++Statics.field335 - 1] = var11 == null ? 0 : var11.method5818();
                return 1;
            } else if (arg0 == 1624) {
                class330 var12 = var3.method5988();
                field893[++Statics.field335 - 1] = var12 != null && var12.method5613() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class330 var13 = var3.method5988();
                field893[++Statics.field335 - 1] = var13 != null && var13.method5614() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class330 var14 = var3.method5988();
                field877[++Statics.field1625 - 1] = var14 == null ? "" : var14.method5576().method6948();
                return 1;
            } else if (arg0 == 1627) {
                class330 var15 = var3.method5988();
                int var16 = var15 == null ? 0 : var15.method5617();
                int var17 = var15 == null ? 0 : var15.method5616();
                field893[++Statics.field335 - 1] = Math.min(var16, var17);
                field893[++Statics.field335 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class330 var18 = var3.method5988();
                field893[++Statics.field335 - 1] = var18 == null ? 0 : var18.method5616();
                return 1;
            } else if (arg0 == 1629) {
                class330 var19 = var3.method5988();
                field893[++Statics.field335 - 1] = var19 == null ? 0 : var19.method5579();
                return 1;
            } else if (arg0 == 1630) {
                class330 var20 = var3.method5988();
                field893[++Statics.field335 - 1] = var20 == null ? 0 : var20.method5624();
                return 1;
            } else if (arg0 == 1631) {
                class330 var21 = var3.method5988();
                field893[++Statics.field335 - 1] = var21 == null ? 0 : var21.method5717();
                return 1;
            } else if (arg0 == 1632) {
                class330 var22 = var3.method5988();
                field893[++Statics.field335 - 1] = var22 == null ? 0 : var22.method5570();
                return 1;
            } else if (arg0 == 1633) {
                class28 var23 = var3.method5857();
                field893[Statics.field335 - 1] = var23 == null ? 0 : var23.method383(field893[Statics.field335 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class28 var24 = var3.method5857();
                field893[Statics.field335 - 1] = var24 == null ? 0 : var24.method389((char) field893[Statics.field335 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("kn.ag(Lmi;I)I")
    public static int method5041(class332 arg0) {
        if (arg0.field3649 == 11) {
            String var1 = field877[--Statics.field1625];
            field893[++Statics.field335 - 1] = arg0.method5862(var1);
            return 1;
        } else {
            Statics.field1625--;
            field893[++Statics.field335 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("ps.am(Lmi;I)I")
    public static int method6635(class332 arg0) {
        if (arg0.field3649 == 11) {
            String var1 = field877[--Statics.field1625];
            field877[++Statics.field1625 - 1] = arg0.method5863(var1);
            return 1;
        } else {
            field877[Statics.field1625 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("cc.ax(ILdh;ZB)I")
    public static int method2078(int arg0, class79 arg1, boolean arg2) {
        class332 var3 = arg2 ? Statics.field2872 : Statics.field2809;
        if (arg0 == 1800) {
            field893[++Statics.field335 - 1] = class333.method3374(client.method3401(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field893[--Statics.field335];
            int var5 = var4 - 1;
            if (var3.field3728 == null || var5 >= var3.field3728.length || var3.field3728[var5] == null) {
                field877[++Statics.field1625 - 1] = "";
            } else {
                field877[++Statics.field1625 - 1] = var3.field3728[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3651 == null) {
                field877[++Statics.field1625 - 1] = "";
            } else {
                field877[++Statics.field1625 - 1] = var3.field3651;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("tl.ah(ILdh;ZI)I")
    public static int method8155(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field891 >= 10) {
                throw new RuntimeException();
            }
            class332 var10;
            if (arg0 >= 2000) {
                var10 = class332.method2255(field893[--Statics.field335]);
            } else {
                var10 = arg2 ? Statics.field2872 : Statics.field2809;
            }
            if (var10.field3639 == null) {
                return 0;
            }
            class88 var11 = new class88();
            var11.field1084 = var10;
            var11.field1087 = var10.field3639;
            var11.field1094 = field891 + 1;
            client.field742.method6405(var11);
            return 1;
        } else if (arg0 == 1928) {
            class332 var3 = arg2 ? Statics.field2872 : Statics.field2809;
            int var4 = field893[--Statics.field335];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class103 var5 = new class103(var4, var3.field3647, var3.field3770, var3.field3780);
            field890.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field335 -= 3;
            int var6 = field893[Statics.field335];
            int var7 = field893[Statics.field335 + 1];
            int var8 = field893[Statics.field335 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class103 var9 = new class103(var8, var6, var7, class332.method2255(var6).field3780);
            field890.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cz.as(ILdh;ZB)I")
    public static int method1999(int arg0, class79 arg1, boolean arg2) {
        class332 var3 = class332.method2255(field893[--Statics.field335]);
        if (arg0 == 2500) {
            field893[++Statics.field335 - 1] = var3.field3648;
            return 1;
        } else if (arg0 == 2501) {
            field893[++Statics.field335 - 1] = var3.field3661;
            return 1;
        } else if (arg0 == 2502) {
            field893[++Statics.field335 - 1] = var3.field3662;
            return 1;
        } else if (arg0 == 2503) {
            field893[++Statics.field335 - 1] = var3.field3635;
            return 1;
        } else if (arg0 == 2504) {
            field893[++Statics.field335 - 1] = var3.field3667 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field893[++Statics.field335 - 1] = var3.field3666;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("pb.ay(ILdh;ZI)I")
    public static int method7060(int arg0, class79 arg1, boolean arg2) {
        class332 var3 = class332.method2255(field893[--Statics.field335]);
        if (arg0 == 2600) {
            field893[++Statics.field335 - 1] = var3.field3668;
            return 1;
        } else if (arg0 == 2601) {
            field893[++Statics.field335 - 1] = var3.field3682;
            return 1;
        } else if (arg0 == 2602) {
            field877[++Statics.field1625 - 1] = var3.field3710;
            return 1;
        } else if (arg0 == 2603) {
            field893[++Statics.field335 - 1] = var3.field3738;
            return 1;
        } else if (arg0 == 2604) {
            field893[++Statics.field335 - 1] = var3.field3671;
            return 1;
        } else if (arg0 == 2605) {
            field893[++Statics.field335 - 1] = var3.field3702;
            return 1;
        } else if (arg0 == 2606) {
            field893[++Statics.field335 - 1] = var3.field3699;
            return 1;
        } else if (arg0 == 2607) {
            field893[++Statics.field335 - 1] = var3.field3766;
            return 1;
        } else if (arg0 == 2608) {
            field893[++Statics.field335 - 1] = var3.field3718;
            return 1;
        } else if (arg0 == 2609) {
            field893[++Statics.field335 - 1] = var3.field3670;
            return 1;
        } else if (arg0 == 2610) {
            field893[++Statics.field335 - 1] = var3.field3679;
            return 1;
        } else if (arg0 == 2611) {
            field893[++Statics.field335 - 1] = var3.field3672;
            return 1;
        } else if (arg0 == 2612) {
            field893[++Statics.field335 - 1] = var3.field3673;
            return 1;
        } else if (arg0 == 2613) {
            field893[++Statics.field335 - 1] = var3.field3677.method30();
            return 1;
        } else if (arg0 == 2614) {
            field893[++Statics.field335 - 1] = var3.field3707 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class325 var4 = var3.method5872();
                field893[++Statics.field335 - 1] = var4 == null ? 0 : var4.field3548;
            }
            if (arg0 == 2618) {
                class325 var5 = var3.method5872();
                field893[++Statics.field335 - 1] = var5 == null ? 0 : var5.field3549;
                return 1;
            } else if (arg0 == 2619) {
                class330 var6 = var3.method5988();
                field877[++Statics.field1625 - 1] = var6 == null ? "" : var6.method5611().method6696();
                return 1;
            } else if (arg0 == 2620) {
                class325 var7 = var3.method5872();
                field893[++Statics.field335 - 1] = var7 == null ? 0 : var7.field3550;
                return 1;
            } else if (arg0 == 2621) {
                class330 var8 = var3.method5988();
                field893[++Statics.field335 - 1] = var8 == null ? 0 : var8.method5782();
                return 1;
            } else if (arg0 == 2622) {
                class330 var9 = var3.method5988();
                field893[++Statics.field335 - 1] = var9 == null ? 0 : var9.method5754();
                return 1;
            } else if (arg0 == 2623) {
                class330 var10 = var3.method5988();
                field893[++Statics.field335 - 1] = var10 == null ? 0 : var10.method5818();
                return 1;
            } else if (arg0 == 2624) {
                class330 var11 = var3.method5988();
                field893[++Statics.field335 - 1] = var11 != null && var11.method5613() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class330 var12 = var3.method5988();
                field893[++Statics.field335 - 1] = var12 != null && var12.method5614() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class330 var13 = var3.method5988();
                field877[++Statics.field1625 - 1] = var13 == null ? "" : var13.method5576().method6948();
                return 1;
            } else if (arg0 == 2627) {
                class330 var14 = var3.method5988();
                int var15 = var14 == null ? 0 : var14.method5617();
                int var16 = var14 == null ? 0 : var14.method5616();
                field893[++Statics.field335 - 1] = Math.min(var15, var16);
                field893[++Statics.field335 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class330 var17 = var3.method5988();
                field893[++Statics.field335 - 1] = var17 == null ? 0 : var17.method5616();
                return 1;
            } else if (arg0 == 2629) {
                class330 var18 = var3.method5988();
                field893[++Statics.field335 - 1] = var18 == null ? 0 : var18.method5579();
                return 1;
            } else if (arg0 == 2630) {
                class330 var19 = var3.method5988();
                field893[++Statics.field335 - 1] = var19 == null ? 0 : var19.method5624();
                return 1;
            } else if (arg0 == 2631) {
                class330 var20 = var3.method5988();
                field893[++Statics.field335 - 1] = var20 == null ? 0 : var20.method5717();
                return 1;
            } else if (arg0 == 2632) {
                class330 var21 = var3.method5988();
                field893[++Statics.field335 - 1] = var21 == null ? 0 : var21.method5570();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method5857();
                field893[Statics.field335 - 1] = var22 == null ? 0 : var22.method383(field893[Statics.field335 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method5857();
                field893[Statics.field335 - 1] = var23 == null ? 0 : var23.method389((char) field893[Statics.field335 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("mw.aj(ILdh;ZI)I")
    public static int method5515(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class332 var3 = class332.method2255(field893[--Statics.field335]);
            field893[++Statics.field335 - 1] = var3.field3780;
            return 1;
        } else if (arg0 == 2701) {
            class332 var4 = class332.method2255(field893[--Statics.field335]);
            if (var4.field3780 == -1) {
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = var4.field3781;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field893[--Statics.field335];
            class87 var6 = (class87) client.field548.method8025((long) var5);
            if (var6 == null) {
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field893[++Statics.field335 - 1] = client.field699;
            return 1;
        } else if (arg0 == 2707) {
            class332 var7 = class332.method2255(field893[--Statics.field335]);
            field893[++Statics.field335 - 1] = var7.method5930() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class332 var8 = class332.method2255(field893[--Statics.field335]);
            return method5041(var8);
        } else if (arg0 == 2709) {
            class332 var9 = class332.method2255(field893[--Statics.field335]);
            return method6635(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("df.av(ILdh;ZI)I")
    public static int method2254(int arg0, class79 arg1, boolean arg2) {
        class332 var3 = class332.method2255(field893[--Statics.field335]);
        if (arg0 == 2800) {
            field893[++Statics.field335 - 1] = class333.method3374(client.method3401(var3));
            return 1;
        } else if (arg0 == 2801) {
            int var4 = field893[--Statics.field335];
            int var5 = var4 - 1;
            if (var3.field3728 == null || var5 >= var3.field3728.length || var3.field3728[var5] == null) {
                field877[++Statics.field1625 - 1] = "";
            } else {
                field877[++Statics.field1625 - 1] = var3.field3728[var5];
            }
            return 1;
        } else if (arg0 == 2802) {
            if (var3.field3651 == null) {
                field877[++Statics.field1625 - 1] = "";
            } else {
                field877[++Statics.field1625 - 1] = var3.field3651;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("rn.aw(ILdh;ZI)I")
    public static int method7684(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field877[--Statics.field1625];
            class111.method683(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field335 -= 2;
            client.method8060(Statics.field2132, field893[Statics.field335], field893[Statics.field335 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field888) {
                field894 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field877[--Statics.field1625];
            int var5 = 0;
            if (class387.method3929(var4)) {
                var5 = class387.method2307(var4);
            }
            class297 var6 = class297.method1166(class295.field3202, client.field592.field1429);
            var6.field3227.method8464(var5);
            client.field592.method2665(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field877[--Statics.field1625];
            class297 var8 = class297.method1166(class295.field3110, client.field592.field1429);
            var8.field3227.method8283(var7.length() + 1);
            var8.field3227.method8290(var7);
            client.field592.method2665(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field877[--Statics.field1625];
            class297 var10 = class297.method1166(class295.field3206, client.field592.field1429);
            var10.field3227.method8283(var9.length() + 1);
            var10.field3227.method8290(var9);
            client.field592.method2665(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field893[--Statics.field335];
            String var12 = field877[--Statics.field1625];
            client.method169(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field335 -= 3;
            int var13 = field893[Statics.field335];
            int var14 = field893[Statics.field335 + 1];
            int var15 = field893[Statics.field335 + 2];
            class332 var16 = class332.method2255(var15);
            client.method4154(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field335 -= 2;
            int var17 = field893[Statics.field335];
            int var18 = field893[Statics.field335 + 1];
            class332 var19 = arg2 ? Statics.field2872 : Statics.field2809;
            client.method4154(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field1924 = field893[--Statics.field335] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field893[++Statics.field335 - 1] = Statics.field4737.method2343() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field4737.method2342(field893[--Statics.field335] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field877[--Statics.field1625];
            boolean var21 = field893[--Statics.field335] == 1;
            class32.method446(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field893[--Statics.field335];
            class297 var23 = class297.method1166(class295.field3199, client.field592.field1429);
            var23.field3227.method8345(var22);
            client.field592.method2665(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field893[--Statics.field335];
            Statics.field1625 -= 2;
            String var25 = field877[Statics.field1625];
            String var26 = field877[Statics.field1625 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class297 var27 = class297.method1166(class295.field3130, client.field592.field1429);
                var27.field3227.method8345(1 + class515.method7389(var25) + class515.method7389(var26));
                var27.field3227.method8290(var26);
                var27.field3227.method8283(var24);
                var27.field3227.method8290(var25);
                client.field592.method2665(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            Statics.field335--;
            return 1;
        } else if (arg0 == 3118) {
            client.field687 = field893[--Statics.field335] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field765 = field893[--Statics.field335] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field893[--Statics.field335] == 1) {
                client.field530 |= 0x1;
            } else {
                client.field530 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field893[--Statics.field335] == 1) {
                client.field530 |= 0x2;
            } else {
                client.field530 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field893[--Statics.field335] == 1) {
                client.field530 |= 0x4;
            } else {
                client.field530 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field893[--Statics.field335] == 1) {
                client.field530 |= 0x8;
            } else {
                client.field530 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field530 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field818 = field893[--Statics.field335] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field653 = field893[--Statics.field335] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method168(field893[--Statics.field335] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field893[++Statics.field335 - 1] = client.method445() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field335 -= 2;
            client.field625 = field893[Statics.field335];
            client.field626 = field893[Statics.field335 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field335 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field335--;
            return 1;
        } else if (arg0 == 3132) {
            field893[++Statics.field335 - 1] = Statics.field1450;
            field893[++Statics.field335 - 1] = Statics.field1890;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field335--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field335 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field541 = 3;
            client.field702 = field893[--Statics.field335];
            return 1;
        } else if (arg0 == 3137) {
            client.field541 = 2;
            client.field702 = field893[--Statics.field335];
            return 1;
        } else if (arg0 == 3138) {
            client.field541 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field541 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field541 = 3;
            client.field702 = arg2 ? Statics.field2872.field3647 : Statics.field2809.field3647;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field893[--Statics.field335] == 1;
            Statics.field4737.method2389(var28);
            return 1;
        } else if (arg0 == 3142) {
            field893[++Statics.field335 - 1] = Statics.field4737.method2349() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field893[--Statics.field335] == 1;
            client.field581 = var29;
            if (!var29) {
                Statics.field4737.method2360("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field893[++Statics.field335 - 1] = client.field581 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field893[--Statics.field335] == 1;
            Statics.field4737.method2369(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field893[++Statics.field335 - 1] = Statics.field4737.method2379() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field893[++Statics.field335 - 1] = class76.field938;
            return 1;
        } else if (arg0 == 3154) {
            field893[++Statics.field335 - 1] = client.method1832();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1625--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field335 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field335--;
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field335--;
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1625--;
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field335--;
            field877[++Statics.field1625 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field335--;
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field335 -= 2;
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field335 -= 2;
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field335 -= 2;
            field877[++Statics.field1625 - 1] = "";
            field877[++Statics.field1625 - 1] = "";
            field877[++Statics.field1625 - 1] = "";
            field877[++Statics.field1625 - 1] = "";
            field877[++Statics.field1625 - 1] = "";
            field877[++Statics.field1625 - 1] = "";
            field877[++Statics.field1625 - 1] = "";
            field877[++Statics.field1625 - 1] = "";
            field877[++Statics.field1625 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field335--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field335--;
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field335--;
            return 1;
        } else if (arg0 == 3175) {
            field893[++Statics.field335 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field1625--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field1625--;
            return 1;
        } else if (arg0 == 3181) {
            client.method298(field893[--Statics.field335]);
            return 1;
        } else if (arg0 == 3182) {
            field893[++Statics.field335 - 1] = client.method6063();
            return 1;
        } else if (arg0 == 3189) {
            int var31 = field893[--Statics.field335];
            client.method7979(var31);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ky.ak(ILdh;ZB)I")
    public static int method5071(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field335 -= 3;
            client.method381(field893[Statics.field335], field893[Statics.field335 + 1], field893[Statics.field335 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            Statics.field335 -= 5;
            int var3 = field893[Statics.field335];
            int var4 = field893[Statics.field335 + 1];
            int var5 = field893[Statics.field335 + 2];
            int var6 = field893[Statics.field335 + 3];
            int var7 = field893[Statics.field335 + 4];
            ArrayList var8 = new ArrayList();
            var8.add(var3);
            client.method3056(var8, var4, var5, var6, var7);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field335 -= 2;
            client.method2051(field893[Statics.field335], field893[Statics.field335 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class91 var50 = class91.field1127;
            class90 var51 = class90.field1114;
            int var52 = field893[--Statics.field335];
            if (arg0 == 3212) {
                int var53 = field893[--Statics.field335];
                var50 = (class91) class373.method371(class91.method5017(), var53);
                if (var50 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var53));
                }
            }
            if (arg0 == 3213) {
                int var54 = field893[--Statics.field335];
                var51 = (class90) class373.method371(class90.method5484(), var54);
                if (var51 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var54));
                }
            }
            if (arg0 == 3209) {
                int var55 = field893[--Statics.field335];
                var50 = (class91) class373.method371(class91.method5017(), var55);
                if (var50 == null) {
                    var51 = (class90) class373.method371(class90.method5484(), var55);
                    if (var51 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var55));
                    }
                }
            } else if (arg0 == 3181) {
                var50 = class91.field1123;
            } else if (arg0 == 3203) {
                var51 = class90.field1107;
            } else if (arg0 == 3205) {
                var51 = class90.field1110;
            } else if (arg0 == 3207) {
                var51 = class90.field1116;
            }
            if (class90.field1114 == var51) {
                switch(var50.field1124) {
                    case 1:
                        Statics.field4737.method2389(var52 == 1);
                        break;
                    case 2:
                        Statics.field4737.method2369(var52 == 1);
                        break;
                    case 3:
                        Statics.field4737.method2347(var52 == 1);
                        break;
                    case 4:
                        if (var52 < 0) {
                            var52 = 0;
                        }
                        Statics.field4737.method2350(var52);
                        break;
                    case 5:
                        client.method298(var52);
                        break;
                    default:
                        String var56 = String.format("Unkown device option: %s.", var50.toString());
                        throw new RuntimeException(var56);
                }
            } else {
                switch(var51.field1112) {
                    case 1:
                        Statics.field4737.method2342(var52 == 1);
                        break;
                    case 2:
                        int var62 = Math.min(Math.max(var52, 0), 100);
                        int var63 = Math.round((float) (var62 * 255) / 100.0F);
                        client.method5138(var63);
                        break;
                    case 3:
                        int var60 = Math.min(Math.max(var52, 0), 100);
                        int var61 = Math.round((float) (var60 * 127) / 100.0F);
                        client.method6578(var61);
                        break;
                    case 4:
                        int var58 = Math.min(Math.max(var52, 0), 100);
                        int var59 = Math.round((float) (var58 * 127) / 100.0F);
                        client.method155(var59);
                        break;
                    default:
                        String var57 = String.format("Unkown game option: %s.", var51.toString());
                        throw new RuntimeException(var57);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class91 var38 = class91.field1127;
            class90 var39 = class90.field1114;
            boolean var40 = false;
            if (arg0 == 3214) {
                int var41 = field893[--Statics.field335];
                var38 = (class91) class373.method371(class91.method5017(), var41);
                if (var38 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var41));
                }
            }
            if (arg0 == 3215) {
                int var42 = field893[--Statics.field335];
                var39 = (class90) class373.method371(class90.method5484(), var42);
                if (var39 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var42));
                }
            }
            if (arg0 == 3210) {
                int var43 = field893[--Statics.field335];
                var38 = (class91) class373.method371(class91.method5017(), var43);
                if (var38 == null) {
                    var39 = (class90) class373.method371(class90.method5484(), var43);
                    if (var39 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var43));
                    }
                }
            } else if (arg0 == 3182) {
                var38 = class91.field1123;
            } else if (arg0 == 3204) {
                var39 = class90.field1107;
            } else if (arg0 == 3206) {
                var39 = class90.field1110;
            } else if (arg0 == 3208) {
                var39 = class90.field1116;
            }
            int var45;
            if (class90.field1114 == var39) {
                switch(var38.field1124) {
                    case 1:
                        var45 = Statics.field4737.method2349() ? 1 : 0;
                        break;
                    case 2:
                        var45 = Statics.field4737.method2379() ? 1 : 0;
                        break;
                    case 3:
                        var45 = Statics.field4737.method2358() ? 1 : 0;
                        break;
                    case 4:
                        var45 = Statics.field4737.method2351();
                        break;
                    case 5:
                        var45 = client.method6063();
                        break;
                    default:
                        String var44 = String.format("Unkown device option: %s.", var38.toString());
                        throw new RuntimeException(var44);
                }
            } else {
                switch(var39.field1112) {
                    case 1:
                        var45 = Statics.field4737.method2343() ? 1 : 0;
                        break;
                    case 2:
                        int var49 = Statics.field4737.method2346();
                        var45 = Math.round((float) (var49 * 100) / 255.0F);
                        break;
                    case 3:
                        int var48 = Statics.field4737.method2357();
                        var45 = Math.round((float) (var48 * 100) / 127.0F);
                        break;
                    case 4:
                        int var47 = Statics.field4737.method2449();
                        var45 = Math.round((float) (var47 * 100) / 127.0F);
                        break;
                    default:
                        String var46 = String.format("Unkown game option: %s.", var39.toString());
                        throw new RuntimeException(var46);
                }
            }
            field893[++Statics.field335 - 1] = var45;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else if (arg0 == 3216) {
            int var9 = field893[--Statics.field335];
            int var10 = 0;
            class91 var11 = (class91) class373.method371(class91.method5017(), var9);
            if (var11 != null) {
                var10 = class91.field1127 == var11 ? 0 : 1;
            }
            field893[++Statics.field335 - 1] = var10;
            return 1;
        } else if (arg0 == 3218) {
            int var12 = field893[--Statics.field335];
            int var13 = 0;
            class90 var14 = (class90) class373.method371(class90.method5484(), var12);
            if (var14 != null) {
                var13 = class90.field1114 == var14 ? 0 : 1;
            }
            field893[++Statics.field335 - 1] = var13;
            return 1;
        } else if (arg0 == 3217 || arg0 == 3219) {
            class91 var28 = class91.field1127;
            class90 var29 = class90.field1114;
            boolean var30 = true;
            boolean var31 = true;
            if (arg0 == 3217) {
                int var32 = field893[--Statics.field335];
                var28 = (class91) class373.method371(class91.method5017(), var32);
                if (var28 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var32));
                }
            }
            if (arg0 == 3219) {
                int var33 = field893[--Statics.field335];
                var29 = (class90) class373.method371(class90.method5484(), var33);
                if (var29 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var33));
                }
            }
            byte var35;
            int var36;
            if (class90.field1114 == var29) {
                switch(var28.field1124) {
                    case 1:
                    case 2:
                    case 3:
                        var35 = 0;
                        var36 = 1;
                        break;
                    case 4:
                        var35 = 0;
                        var36 = Integer.MAX_VALUE;
                        break;
                    case 5:
                        var35 = 0;
                        var36 = 100;
                        break;
                    default:
                        String var34 = String.format("Unkown device option: %s.", var28.toString());
                        throw new RuntimeException(var34);
                }
            } else {
                switch(var29.field1112) {
                    case 1:
                        var35 = 0;
                        var36 = 1;
                        break;
                    case 2:
                    case 3:
                    case 4:
                        var35 = 0;
                        var36 = 100;
                        break;
                    default:
                        String var37 = String.format("Unkown game option: %s.", var29.toString());
                        throw new RuntimeException(var37);
                }
            }
            field893[++Statics.field335 - 1] = var35;
            field893[++Statics.field335 - 1] = var36;
            return 1;
        } else if (arg0 == 3220) {
            Statics.field335 -= 2;
            int var15 = field893[Statics.field335];
            int var16 = field893[Statics.field335 + 1];
            class306.method2092(var15, var16);
            return 1;
        } else if (arg0 == 3221) {
            Statics.field335 -= 6;
            int var17 = field893[Statics.field335];
            int var18 = field893[Statics.field335 + 1];
            int var19 = field893[Statics.field335 + 2];
            int var20 = field893[Statics.field335 + 3];
            int var21 = field893[Statics.field335 + 4];
            int var22 = field893[Statics.field335 + 5];
            ArrayList var23 = new ArrayList();
            var23.add(var17);
            var23.add(var18);
            client.method3056(var23, var19, var20, var21, var22);
            return 1;
        } else if (arg0 == 3222) {
            Statics.field335 -= 4;
            int var24 = field893[Statics.field335];
            int var25 = field893[Statics.field335 + 1];
            int var26 = field893[Statics.field335 + 2];
            int var27 = field893[Statics.field335 + 3];
            class306.method2684(var24, var25, var26, var27);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ok.bh(ILdh;ZB)I")
    public static int method6350(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field893[++Statics.field335 - 1] = client.field833;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field335 -= 2;
            int var3 = field893[Statics.field335];
            int var4 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = class85.method3785(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field335 -= 2;
            int var5 = field893[Statics.field335];
            int var6 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = class85.method2094(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field335 -= 2;
            int var7 = field893[Statics.field335];
            int var8 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = class85.method3830(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = class186.method6213(var9).field1929;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = client.field671[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = client.field821[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = client.field824[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field1321;
            int var14 = (Statics.field2132.field1228 >> 7) + Statics.field1448;
            int var15 = (Statics.field2132.field1199 >> 7) + Statics.field354;
            field893[++Statics.field335 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field893[++Statics.field335 - 1] = client.field554 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field335 -= 2;
            int var19 = field893[Statics.field335] + 32768;
            int var20 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = class85.method3785(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field335 -= 2;
            int var21 = field893[Statics.field335] + 32768;
            int var22 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = class85.method2094(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field335 -= 2;
            int var23 = field893[Statics.field335] + 32768;
            int var24 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = class85.method3830(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field615 >= 2) {
                field893[++Statics.field335 - 1] = client.field615;
            } else {
                field893[++Statics.field335 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field893[++Statics.field335 - 1] = client.field547;
            return 1;
        } else if (arg0 == 3318) {
            field893[++Statics.field335 - 1] = client.field527;
            return 1;
        } else if (arg0 == 3321) {
            field893[++Statics.field335 - 1] = client.field644 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field893[++Statics.field335 - 1] = client.field815;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field825) {
                field893[++Statics.field335 - 1] = 1;
            } else {
                field893[++Statics.field335 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field893[++Statics.field335 - 1] = client.field528;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field335 -= 4;
            int var25 = field893[Statics.field335];
            int var26 = field893[Statics.field335 + 1];
            int var27 = field893[Statics.field335 + 2];
            int var28 = field893[Statics.field335 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field893[++Statics.field335 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field893[++Statics.field335 - 1] = client.field543;
            return 1;
        } else if (arg0 == 3327) {
            field893[++Statics.field335 - 1] = client.field544;
            return 1;
        } else if (arg0 == 3331) {
            field893[++Statics.field335 - 1] = client.field644;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("qt.bj(ILdh;ZI)I")
    public static int method7345(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field335 -= 2;
            int var3 = field893[Statics.field335];
            int var4 = field893[Statics.field335 + 1];
            class193 var5 = class193.method5058(var3);
            if (var5.field2010 != 's') {
            }
            for (int var6 = 0; var6 < var5.field2013; var6++) {
                if (var5.field2007[var6] == var4) {
                    field877[++Statics.field1625 - 1] = var5.field2014[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field877[++Statics.field1625 - 1] = var5.field2011;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field335 -= 4;
            int var7 = field893[Statics.field335];
            int var8 = field893[Statics.field335 + 1];
            int var9 = field893[Statics.field335 + 2];
            int var10 = field893[Statics.field335 + 3];
            class193 var11 = class193.method5058(var9);
            if (var11.field2009 != var7 || var11.field2010 != var8) {
                if (var8 == 115) {
                    field877[++Statics.field1625 - 1] = class352.field4223;
                } else {
                    field893[++Statics.field335 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field2013; var12++) {
                if (var11.field2007[var12] == var10) {
                    if (var8 == 115) {
                        field877[++Statics.field1625 - 1] = var11.field2014[var12];
                    } else {
                        field893[++Statics.field335 - 1] = var11.field2016[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field877[++Statics.field1625 - 1] = var11.field2011;
                } else {
                    field893[++Statics.field335 - 1] = var11.field2008;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field893[--Statics.field335];
            class193 var14 = class193.method5058(var13);
            field893[++Statics.field335 - 1] = var14.method3381();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("je.bk(ILdh;ZB)I")
    public static int method4439(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = client.field675.method3811(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = client.field675.method3805(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = client.field675.method3803(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ag.bv(ILdh;ZB)I")
    public static int method200(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field3367.field852 == 0) {
                field893[++Statics.field335 - 1] = -2;
            } else if (Statics.field3367.field852 == 1) {
                field893[++Statics.field335 - 1] = -1;
            } else {
                field893[++Statics.field335 - 1] = Statics.field3367.field855.method7328();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field893[--Statics.field335];
            if (Statics.field3367.method1770() && var3 >= 0 && var3 < Statics.field3367.field855.method7328()) {
                class430 var4 = (class430) Statics.field3367.field855.method7285(var3);
                field877[++Statics.field1625 - 1] = var4.method7251();
                field877[++Statics.field1625 - 1] = var4.method7252();
            } else {
                field877[++Statics.field1625 - 1] = "";
                field877[++Statics.field1625 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field893[--Statics.field335];
            if (Statics.field3367.method1770() && var5 >= 0 && var5 < Statics.field3367.field855.method7328()) {
                field893[++Statics.field335 - 1] = ((class437) Statics.field3367.field855.method7285(var5)).field4671;
            } else {
                field893[++Statics.field335 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field893[--Statics.field335];
            if (Statics.field3367.method1770() && var6 >= 0 && var6 < Statics.field3367.field855.method7328()) {
                field893[++Statics.field335 - 1] = ((class437) Statics.field3367.field855.method7285(var6)).field4672;
            } else {
                field893[++Statics.field335 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field877[--Statics.field1625];
            int var8 = field893[--Statics.field335];
            class69.method3070(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field877[--Statics.field1625];
            Statics.field3367.method1777(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field877[--Statics.field1625];
            Statics.field3367.method1781(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field877[--Statics.field1625];
            Statics.field3367.method1779(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field877[--Statics.field1625];
            boolean var13 = true;
            Statics.field3367.method1782(var12, var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field877[--Statics.field1625];
            String var15 = client.method3264(var14);
            field893[++Statics.field335 - 1] = Statics.field3367.method1775(new class538(var15, Statics.field4388), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field265 == null) {
                field877[++Statics.field1625 - 1] = "";
            } else {
                field877[++Statics.field1625 - 1] = Statics.field265.field4636;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field265 == null) {
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = Statics.field265.method7328();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field893[--Statics.field335];
            if (Statics.field265 == null || var16 >= Statics.field265.method7328()) {
                field877[++Statics.field1625 - 1] = "";
            } else {
                field877[++Statics.field1625 - 1] = Statics.field265.method7285(var16).method7250().method8917();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field893[--Statics.field335];
            if (Statics.field265 == null || var17 >= Statics.field265.method7328()) {
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = ((class437) Statics.field265.method7285(var17)).method7353();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field893[--Statics.field335];
            if (Statics.field265 == null || var18 >= Statics.field265.method7328()) {
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = ((class437) Statics.field265.method7285(var18)).field4672;
            }
            return 1;
        } else if (arg0 == 3616) {
            field893[++Statics.field335 - 1] = Statics.field265 == null ? 0 : Statics.field265.field4641;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field877[--Statics.field1625];
            client.method2901(var19);
            return 1;
        } else if (arg0 == 3618) {
            field893[++Statics.field335 - 1] = Statics.field265 == null ? 0 : Statics.field265.field4642;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field877[--Statics.field1625];
            client.method2706(var20);
            return 1;
        } else if (arg0 == 3620) {
            client.method2206();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field3367.method1770()) {
                field893[++Statics.field335 - 1] = Statics.field3367.field853.method7328();
            } else {
                field893[++Statics.field335 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var21 = field893[--Statics.field335];
            if (Statics.field3367.method1770() && var21 >= 0 && var21 < Statics.field3367.field853.method7328()) {
                class436 var22 = (class436) Statics.field3367.field853.method7285(var21);
                field877[++Statics.field1625 - 1] = var22.method7251();
                field877[++Statics.field1625 - 1] = var22.method7252();
            } else {
                field877[++Statics.field1625 - 1] = "";
                field877[++Statics.field1625 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var23 = field877[--Statics.field1625];
            String var24 = client.method3264(var23);
            field893[++Statics.field335 - 1] = Statics.field3367.method1776(new class538(var24, Statics.field4388)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var25 = field893[--Statics.field335];
            if (Statics.field265 == null || var25 >= Statics.field265.method7328() || !Statics.field265.method7285(var25).method7250().equals(Statics.field2132.field1146)) {
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field265 == null || Statics.field265.field4640 == null) {
                field877[++Statics.field1625 - 1] = "";
            } else {
                field877[++Statics.field1625 - 1] = Statics.field265.field4640;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var26 = field893[--Statics.field335];
            if (Statics.field265 == null || var26 >= Statics.field265.method7328() || !((class432) Statics.field265.method7285(var26)).method7234()) {
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var27 = field893[--Statics.field335];
            if (Statics.field265 == null || var27 >= Statics.field265.method7328() || !((class432) Statics.field265.method7285(var27)).method7236()) {
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field3367.field855.method7326();
            return 1;
        } else if (arg0 == 3629) {
            boolean var28 = field893[--Statics.field335] == 1;
            Statics.field3367.field855.method7291(new class521(var28));
            return 1;
        } else if (arg0 == 3630) {
            boolean var29 = field893[--Statics.field335] == 1;
            Statics.field3367.field855.method7291(new class522(var29));
            return 1;
        } else if (arg0 == 3631) {
            boolean var30 = field893[--Statics.field335] == 1;
            Statics.field3367.field855.method7291(new class120(var30));
            return 1;
        } else if (arg0 == 3632) {
            boolean var31 = field893[--Statics.field335] == 1;
            Statics.field3367.field855.method7291(new class116(var31));
            return 1;
        } else if (arg0 == 3633) {
            boolean var32 = field893[--Statics.field335] == 1;
            Statics.field3367.field855.method7291(new class119(var32));
            return 1;
        } else if (arg0 == 3634) {
            boolean var33 = field893[--Statics.field335] == 1;
            Statics.field3367.field855.method7291(new class124(var33));
            return 1;
        } else if (arg0 == 3635) {
            boolean var34 = field893[--Statics.field335] == 1;
            Statics.field3367.field855.method7291(new class118(var34));
            return 1;
        } else if (arg0 == 3636) {
            boolean var35 = field893[--Statics.field335] == 1;
            Statics.field3367.field855.method7291(new class117(var35));
            return 1;
        } else if (arg0 == 3637) {
            boolean var36 = field893[--Statics.field335] == 1;
            Statics.field3367.field855.method7291(new class121(var36));
            return 1;
        } else if (arg0 == 3638) {
            boolean var37 = field893[--Statics.field335] == 1;
            Statics.field3367.field855.method7291(new class122(var37));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field3367.field855.method7330();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field3367.field853.method7326();
            return 1;
        } else if (arg0 == 3641) {
            boolean var38 = field893[--Statics.field335] == 1;
            Statics.field3367.field853.method7291(new class521(var38));
            return 1;
        } else if (arg0 == 3642) {
            boolean var39 = field893[--Statics.field335] == 1;
            Statics.field3367.field853.method7291(new class522(var39));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field3367.field853.method7330();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field265 != null) {
                Statics.field265.method7326();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var40 = field893[--Statics.field335] == 1;
            if (Statics.field265 != null) {
                Statics.field265.method7291(new class521(var40));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var41 = field893[--Statics.field335] == 1;
            if (Statics.field265 != null) {
                Statics.field265.method7291(new class522(var41));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var42 = field893[--Statics.field335] == 1;
            if (Statics.field265 != null) {
                Statics.field265.method7291(new class120(var42));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var43 = field893[--Statics.field335] == 1;
            if (Statics.field265 != null) {
                Statics.field265.method7291(new class116(var43));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var44 = field893[--Statics.field335] == 1;
            if (Statics.field265 != null) {
                Statics.field265.method7291(new class119(var44));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var45 = field893[--Statics.field335] == 1;
            if (Statics.field265 != null) {
                Statics.field265.method7291(new class124(var45));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var46 = field893[--Statics.field335] == 1;
            if (Statics.field265 != null) {
                Statics.field265.method7291(new class118(var46));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var47 = field893[--Statics.field335] == 1;
            if (Statics.field265 != null) {
                Statics.field265.method7291(new class117(var47));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var48 = field893[--Statics.field335] == 1;
            if (Statics.field265 != null) {
                Statics.field265.method7291(new class121(var48));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var49 = field893[--Statics.field335] == 1;
            if (Statics.field265 != null) {
                Statics.field265.method7291(new class122(var49));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field265 != null) {
                Statics.field265.method7330();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var50 = field893[--Statics.field335] == 1;
            Statics.field3367.field855.method7291(new class123(var50));
            return 1;
        } else if (arg0 == 3657) {
            boolean var51 = field893[--Statics.field335] == 1;
            if (Statics.field265 != null) {
                Statics.field265.method7291(new class123(var51));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bd.bt(ILdh;ZS)I")
    public static int method455(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ca.bd(ILdh;ZI)I")
    public static int method1845(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field1391 == null) {
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = 1;
                Statics.field4803 = Statics.field1391;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field893[--Statics.field335];
            if (client.field771[var3] == null) {
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = 1;
                Statics.field4803 = client.field771[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field877[++Statics.field1625 - 1] = Statics.field4803.field1734;
            return 1;
        } else if (arg0 == 3803) {
            field893[++Statics.field335 - 1] = Statics.field4803.field1733 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field893[++Statics.field335 - 1] = Statics.field4803.field1747;
            return 1;
        } else if (arg0 == 3805) {
            field893[++Statics.field335 - 1] = Statics.field4803.field1735;
            return 1;
        } else if (arg0 == 3806) {
            field893[++Statics.field335 - 1] = Statics.field4803.field1736;
            return 1;
        } else if (arg0 == 3807) {
            field893[++Statics.field335 - 1] = Statics.field4803.field1737;
            return 1;
        } else if (arg0 == 3809) {
            field893[++Statics.field335 - 1] = Statics.field4803.field1738;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field893[--Statics.field335];
            field877[++Statics.field1625 - 1] = Statics.field4803.field1749[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = Statics.field4803.field1740[var5];
            return 1;
        } else if (arg0 == 3812) {
            field893[++Statics.field335 - 1] = Statics.field4803.field1731;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field893[--Statics.field335];
            field877[++Statics.field1625 - 1] = Statics.field4803.field1750[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field335 -= 3;
            int var7 = field893[Statics.field335];
            int var8 = field893[Statics.field335 + 1];
            int var9 = field893[Statics.field335 + 2];
            field893[++Statics.field335 - 1] = Statics.field4803.method3001(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field893[++Statics.field335 - 1] = Statics.field4803.field1745;
            return 1;
        } else if (arg0 == 3816) {
            field893[++Statics.field335 - 1] = Statics.field4803.field1730;
            return 1;
        } else if (arg0 == 3817) {
            field893[++Statics.field335 - 1] = Statics.field4803.method2999(field877[--Statics.field1625]);
            return 1;
        } else if (arg0 == 3818) {
            field893[Statics.field335 - 1] = Statics.field4803.method2993()[field893[Statics.field335 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field335 -= 2;
            int var10 = field893[Statics.field335];
            int var11 = field893[Statics.field335 + 1];
            client.method6619(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = Statics.field4803.field1743[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field335 -= 3;
                int var13 = field893[Statics.field335];
                boolean var14 = field893[Statics.field335 + 1] == 1;
                int var15 = field893[Statics.field335 + 2];
                client.method846(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field893[--Statics.field335];
                field893[++Statics.field335 - 1] = Statics.field4803.field1744[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field2085 == null) {
                    field893[++Statics.field335 - 1] = 0;
                } else {
                    field893[++Statics.field335 - 1] = 1;
                    Statics.field4478 = Statics.field2085;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field893[--Statics.field335];
                if (client.field772[var17] == null) {
                    field893[++Statics.field335 - 1] = 0;
                } else {
                    field893[++Statics.field335 - 1] = 1;
                    Statics.field4478 = client.field772[var17];
                    Statics.field1453 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field877[++Statics.field1625 - 1] = Statics.field4478.field1806;
                return 1;
            } else if (arg0 == 3853) {
                field893[++Statics.field335 - 1] = Statics.field4478.field1805;
                return 1;
            } else if (arg0 == 3854) {
                field893[++Statics.field335 - 1] = Statics.field4478.field1801;
                return 1;
            } else if (arg0 == 3855) {
                field893[++Statics.field335 - 1] = Statics.field4478.method3076();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field893[--Statics.field335];
                field877[++Statics.field1625 - 1] = ((class146) Statics.field4478.field1803.get(var18)).field1678.method8917();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field893[--Statics.field335];
                field893[++Statics.field335 - 1] = ((class146) Statics.field4478.field1803.get(var19)).field1679;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field893[--Statics.field335];
                field893[++Statics.field335 - 1] = ((class146) Statics.field4478.field1803.get(var20)).field1681;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field893[--Statics.field335];
                client.method2782(Statics.field1453, var21);
                return 1;
            } else if (arg0 == 3860) {
                field893[++Statics.field335 - 1] = Statics.field4478.method3077(field877[--Statics.field1625]);
                return 1;
            } else if (arg0 == 3861) {
                field893[Statics.field335 - 1] = Statics.field4478.method3084()[field893[Statics.field335 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field893[++Statics.field335 - 1] = Statics.field1655 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("nb.by(ILdh;ZI)I")
    public static int method6050(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = client.field806[var3].method6296();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = client.field806[var4].field4351;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = client.field806[var5].field4356;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = client.field806[var6].field4353;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = client.field806[var7].field4354;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = client.field806[var8].field4350;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field893[--Statics.field335];
            int var10 = client.field806[var9].method6295();
            field893[++Statics.field335 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field893[--Statics.field335];
            int var12 = client.field806[var11].method6295();
            field893[++Statics.field335 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field893[--Statics.field335];
            int var14 = client.field806[var13].method6295();
            field893[++Statics.field335 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field893[--Statics.field335];
            int var16 = client.field806[var15].method6295();
            field893[++Statics.field335 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field893[--Statics.field335] == 1;
            if (Statics.field4452 != null) {
                Statics.field4452.method6245(class361.field4329, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field893[--Statics.field335] == 1;
            if (Statics.field4452 != null) {
                Statics.field4452.method6245(class361.field4331, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field335 -= 2;
            boolean var19 = field893[Statics.field335] == 1;
            boolean var20 = field893[Statics.field335 + 1] == 1;
            if (Statics.field4452 != null) {
                client.field819.field524 = var20;
                Statics.field4452.method6245(client.field819, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field893[--Statics.field335] == 1;
            if (Statics.field4452 != null) {
                Statics.field4452.method6245(class361.field4327, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field893[--Statics.field335] == 1;
            if (Statics.field4452 != null) {
                Statics.field4452.method6245(class361.field4330, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field893[++Statics.field335 - 1] = Statics.field4452 == null ? 0 : Statics.field4452.field4328.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field893[--Statics.field335];
            class367 var24 = (class367) Statics.field4452.field4328.get(var23);
            field893[++Statics.field335 - 1] = var24.field4349;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field893[--Statics.field335];
            class367 var26 = (class367) Statics.field4452.field4328.get(var25);
            field877[++Statics.field1625 - 1] = var26.method6290();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field893[--Statics.field335];
            class367 var28 = (class367) Statics.field4452.field4328.get(var27);
            field877[++Statics.field1625 - 1] = var28.method6287();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field893[--Statics.field335];
            class367 var30 = (class367) Statics.field4452.field4328.get(var29);
            long var31 = class302.method655() - Statics.field1606 - var30.field4347;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field877[++Statics.field1625 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field893[--Statics.field335];
            class367 var38 = (class367) Statics.field4452.field4328.get(var37);
            field893[++Statics.field335 - 1] = var38.field4345.field4353;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field893[--Statics.field335];
            class367 var40 = (class367) Statics.field4452.field4328.get(var39);
            field893[++Statics.field335 - 1] = var40.field4345.field4356;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field893[--Statics.field335];
            class367 var42 = (class367) Statics.field4452.field4328.get(var41);
            field893[++Statics.field335 - 1] = var42.field4345.field4351;
            return 1;
        } else if (arg0 == 3939) {
            int var43 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = class207.method3280(var43).field2279 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("np.bs(ILdh;ZB)I")
    public static int method6062(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field335 -= 2;
            int var3 = field893[Statics.field335];
            int var4 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field335 -= 2;
            int var5 = field893[Statics.field335];
            int var6 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field335 -= 2;
            int var7 = field893[Statics.field335];
            int var8 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field335 -= 2;
            int var9 = field893[Statics.field335];
            int var10 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field335 -= 5;
            int var13 = field893[Statics.field335];
            int var14 = field893[Statics.field335 + 1];
            int var15 = field893[Statics.field335 + 2];
            int var16 = field893[Statics.field335 + 3];
            int var17 = field893[Statics.field335 + 4];
            field893[++Statics.field335 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field335 -= 2;
            int var18 = field893[Statics.field335];
            int var19 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field335 -= 2;
            int var20 = field893[Statics.field335];
            int var21 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field335 -= 2;
            int var22 = field893[Statics.field335];
            int var23 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field335 -= 2;
            int var24 = field893[Statics.field335];
            int var25 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field335 -= 2;
            int var26 = field893[Statics.field335];
            int var27 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field335 -= 2;
            int var28 = field893[Statics.field335];
            int var29 = field893[Statics.field335 + 1];
            if (var28 == 0) {
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field335 -= 2;
            int var30 = field893[Statics.field335];
            int var31 = field893[Statics.field335 + 1];
            if (var30 == 0) {
                field893[++Statics.field335 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field893[++Statics.field335 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field893[++Statics.field335 - 1] = var30;
                    break;
                case 2:
                    field893[++Statics.field335 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field893[++Statics.field335 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field893[++Statics.field335 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field893[++Statics.field335 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field335 -= 2;
            int var32 = field893[Statics.field335];
            int var33 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field335 -= 2;
            int var34 = field893[Statics.field335];
            int var35 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field335 -= 2;
            int var36 = field893[Statics.field335];
            int var37 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field335 -= 2;
            int var38 = field893[Statics.field335];
            int var39 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field335 -= 3;
            long var40 = (long) field893[Statics.field335];
            long var42 = (long) field893[Statics.field335 + 1];
            long var44 = (long) field893[Statics.field335 + 2];
            field893[++Statics.field335 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = Statics.method5200(field893[--Statics.field335]);
            field893[++Statics.field335 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field335 -= 2;
            int var47 = field893[Statics.field335];
            int var48 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field335 -= 3;
            int var49 = field893[Statics.field335];
            int var50 = field893[Statics.field335 + 1];
            int var51 = field893[Statics.field335 + 2];
            field893[++Statics.field335 - 1] = class304.method5989(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field335 -= 3;
            int var52 = field893[Statics.field335];
            int var53 = field893[Statics.field335 + 1];
            int var54 = field893[Statics.field335 + 2];
            field893[++Statics.field335 - 1] = class304.method3282(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field335 -= 3;
            int var55 = field893[Statics.field335];
            int var56 = field893[Statics.field335 + 1];
            int var57 = field893[Statics.field335 + 2];
            int var58 = 31 - var57;
            field893[++Statics.field335 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field335 -= 4;
            int var59 = field893[Statics.field335];
            int var60 = field893[Statics.field335 + 1];
            int var61 = field893[Statics.field335 + 2];
            int var62 = field893[Statics.field335 + 3];
            int var63 = class304.method3282(var59, var61, var62);
            int var64 = class304.method2059(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field893[++Statics.field335 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field893[Statics.field335 - 1] = class465.method4395(field893[Statics.field335 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field893[Statics.field335 - 1] = class465.method6998(field893[Statics.field335 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field335 -= 2;
            int var65 = field893[Statics.field335];
            int var66 = field893[Statics.field335 + 1];
            int var67 = class465.method6059(var65, var66);
            field893[++Statics.field335 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field893[Statics.field335 - 1] = Math.abs(field893[Statics.field335 - 1]);
            return 1;
        } else if (arg0 == 4036) {
            String var68 = field877[--Statics.field1625];
            int var69 = -1;
            if (class387.method3929(var68)) {
                var69 = class387.method2307(var68);
            }
            field893[++Statics.field335 - 1] = var69;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cx.bm(ILdh;ZB)I")
    public static int method1073(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 4100) {
            String var3 = field877[--Statics.field1625];
            int var4 = field893[--Statics.field335];
            field877[++Statics.field1625 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4101) {
            Statics.field1625 -= 2;
            String var5 = field877[Statics.field1625];
            String var6 = field877[Statics.field1625 + 1];
            field877[++Statics.field1625 - 1] = var5 + var6;
            return 1;
        } else if (arg0 == 4102) {
            String var7 = field877[--Statics.field1625];
            int var8 = field893[--Statics.field335];
            field877[++Statics.field1625 - 1] = var7 + class387.method1108(var8, true);
            return 1;
        } else if (arg0 == 4103) {
            String var9 = field877[--Statics.field1625];
            field877[++Statics.field1625 - 1] = var9.toLowerCase();
            return 1;
        } else if (arg0 == 4104) {
            int var10 = field893[--Statics.field335];
            long var11 = ((long) var10 + 11745L) * 86400000L;
            field885.setTime(new Date(var11));
            int var13 = field885.get(5);
            int var14 = field885.get(2);
            int var15 = field885.get(1);
            field877[++Statics.field1625 - 1] = var13 + "-" + field887[var14] + "-" + var15;
            return 1;
        } else if (arg0 == 4105) {
            Statics.field1625 -= 2;
            String var16 = field877[Statics.field1625];
            String var17 = field877[Statics.field1625 + 1];
            if (Statics.field2132.field1129 == null || Statics.field2132.field1129.field3573 == 0) {
                field877[++Statics.field1625 - 1] = var16;
            } else {
                field877[++Statics.field1625 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4106) {
            int var18 = field893[--Statics.field335];
            field877[++Statics.field1625 - 1] = Integer.toString(var18);
            return 1;
        } else if (arg0 == 4107) {
            Statics.field1625 -= 2;
            field893[++Statics.field335 - 1] = class387.method3719(class388.method6054(field877[Statics.field1625], field877[Statics.field1625 + 1], Statics.field1676));
            return 1;
        } else if (arg0 == 4108) {
            String var19 = field877[--Statics.field1625];
            Statics.field335 -= 2;
            int var20 = field893[Statics.field335];
            int var21 = field893[Statics.field335 + 1];
            byte[] var22 = Statics.field1158.method6128(var21, 0);
            class394 var23 = new class394(var22);
            field893[++Statics.field335 - 1] = var23.method6841(var19, var20);
            return 1;
        } else if (arg0 == 4109) {
            String var24 = field877[--Statics.field1625];
            Statics.field335 -= 2;
            int var25 = field893[Statics.field335];
            int var26 = field893[Statics.field335 + 1];
            byte[] var27 = Statics.field1158.method6128(var26, 0);
            class394 var28 = new class394(var27);
            field893[++Statics.field335 - 1] = var28.method6875(var24, var25);
            return 1;
        } else if (arg0 == 4110) {
            Statics.field1625 -= 2;
            String var29 = field877[Statics.field1625];
            String var30 = field877[Statics.field1625 + 1];
            if (field893[--Statics.field335] == 1) {
                field877[++Statics.field1625 - 1] = var29;
            } else {
                field877[++Statics.field1625 - 1] = var30;
            }
            return 1;
        } else if (arg0 == 4111) {
            String var31 = field877[--Statics.field1625];
            field877[++Statics.field1625 - 1] = class398.method6856(var31);
            return 1;
        } else if (arg0 == 4112) {
            String var32 = field877[--Statics.field1625];
            int var33 = field893[--Statics.field335];
            field877[++Statics.field1625 - 1] = var32 + (char) var33;
            return 1;
        } else if (arg0 == 4113) {
            int var34 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = class387.method1179((char) var34) ? 1 : 0;
            return 1;
        } else if (arg0 == 4114) {
            int var35 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = class387.method5051((char) var35) ? 1 : 0;
            return 1;
        } else if (arg0 == 4115) {
            int var36 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = class387.method3498((char) var36) ? 1 : 0;
            return 1;
        } else if (arg0 == 4116) {
            int var37 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = Statics.method5838((char) var37) ? 1 : 0;
            return 1;
        } else if (arg0 == 4117) {
            String var38 = field877[--Statics.field1625];
            if (var38 == null) {
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = var38.length();
            }
            return 1;
        } else if (arg0 == 4118) {
            String var39 = field877[--Statics.field1625];
            Statics.field335 -= 2;
            int var40 = field893[Statics.field335];
            int var41 = field893[Statics.field335 + 1];
            field877[++Statics.field1625 - 1] = var39.substring(var40, var41);
            return 1;
        } else if (arg0 == 4119) {
            String var42 = field877[--Statics.field1625];
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
            field877[++Statics.field1625 - 1] = var43.toString();
            return 1;
        } else if (arg0 == 4120) {
            String var47 = field877[--Statics.field1625];
            int var48 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = var47.indexOf(var48);
            return 1;
        } else if (arg0 == 4121) {
            Statics.field1625 -= 2;
            String var49 = field877[Statics.field1625];
            String var50 = field877[Statics.field1625 + 1];
            int var51 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = var49.indexOf(var50, var51);
            return 1;
        } else if (arg0 == 4122) {
            String var52 = field877[--Statics.field1625];
            field877[++Statics.field1625 - 1] = var52.toUpperCase();
            return 1;
        } else if (arg0 == 4123) {
            Statics.field1625 -= 3;
            String var53 = field877[Statics.field1625];
            String var54 = field877[Statics.field1625 + 1];
            String var55 = field877[Statics.field1625 + 2];
            if (Statics.field2132.field1129 == null) {
                field877[++Statics.field1625 - 1] = var55;
                return 1;
            }
            switch(Statics.field2132.field1129.field3575) {
                case 0:
                    field877[++Statics.field1625 - 1] = var53;
                    break;
                case 1:
                    field877[++Statics.field1625 - 1] = var54;
                    break;
                case 2:
                default:
                    field877[++Statics.field1625 - 1] = var55;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dc.bf(ILdh;ZB)I")
    public static int method2556(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field893[--Statics.field335];
            field877[++Statics.field1625 - 1] = class207.method3280(var3).field2251;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field335 -= 2;
            int var4 = field893[Statics.field335];
            int var5 = field893[Statics.field335 + 1];
            class207 var6 = class207.method3280(var4);
            if (var5 < 1 || var5 > 5 || var6.field2252[var5 - 1] == null) {
                field877[++Statics.field1625 - 1] = "";
            } else {
                field877[++Statics.field1625 - 1] = var6.field2252[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field335 -= 2;
            int var7 = field893[Statics.field335];
            int var8 = field893[Statics.field335 + 1];
            class207 var9 = class207.method3280(var7);
            if (var8 < 1 || var8 > 5 || var9.field2253[var8 - 1] == null) {
                field877[++Statics.field1625 - 1] = "";
            } else {
                field877[++Statics.field1625 - 1] = var9.field2253[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = class207.method3280(var10).field2247;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = class207.method3280(var11).field2246 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field893[--Statics.field335];
            class207 var13 = class207.method3280(var12);
            if (var13.field2241 == -1 && var13.field2269 >= 0) {
                field893[++Statics.field335 - 1] = var13.field2269;
            } else {
                field893[++Statics.field335 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field893[--Statics.field335];
            class207 var15 = class207.method3280(var14);
            if (var15.field2241 >= 0 && var15.field2269 >= 0) {
                field893[++Statics.field335 - 1] = var15.field2269;
            } else {
                field893[++Statics.field335 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = class207.method3280(var16).field2238 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field893[--Statics.field335];
            class207 var18 = class207.method3280(var17);
            if (var18.field2283 == -1 && var18.field2240 >= 0) {
                field893[++Statics.field335 - 1] = var18.field2240;
            } else {
                field893[++Statics.field335 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field893[--Statics.field335];
            class207 var20 = class207.method3280(var19);
            if (var20.field2283 >= 0 && var20.field2240 >= 0) {
                field893[++Statics.field335 - 1] = var20.field2240;
            } else {
                field893[++Statics.field335 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field877[--Statics.field1625];
            int var22 = field893[--Statics.field335];
            client.method3068(var21, var22 == 1);
            field893[++Statics.field335 - 1] = Statics.field163;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1761 == null || Statics.field4375 >= Statics.field163) {
                field893[++Statics.field335 - 1] = -1;
            } else {
                field893[++Statics.field335 - 1] = Statics.field1761[++Statics.field4375 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field4375 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field893[--Statics.field335];
            int var24 = class207.method3280(var23).method3666();
            if (var24 == -1) {
                field893[++Statics.field335 - 1] = var24;
            } else {
                field893[++Statics.field335 - 1] = var24 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var25 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = class207.method3280(var25).field2248;
            return 1;
        } else if (arg0 == 4215) {
            int var26 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = class207.method3280(var26).field2231;
            return 1;
        } else if (arg0 == 4216) {
            int var27 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = class207.method3280(var27).field2249;
            return 1;
        } else if (arg0 == 4217) {
            int var28 = field893[--Statics.field335];
            class207 var29 = class207.method3280(var28);
            field893[++Statics.field335 - 1] = var29.field2236;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ny.bq(ILdh;ZB)I")
    public static int method6078(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field893[++Statics.field335 - 1] = client.field760;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field335 -= 3;
            client.field760 = field893[Statics.field335];
            Statics.field1540 = class534.method311(field893[Statics.field335 + 1]);
            if (Statics.field1540 == null) {
                Statics.field1540 = class534.field5248;
            }
            client.field761 = field893[Statics.field335 + 2];
            class297 var3 = class297.method1166(class295.field3188, client.field592.field1429);
            var3.field3227.method8283(client.field760);
            var3.field3227.method8283(Statics.field1540.field5247);
            var3.field3227.method8283(client.field761);
            client.field592.method2665(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field877[--Statics.field1625];
            Statics.field335 -= 2;
            int var5 = field893[Statics.field335];
            int var6 = field893[Statics.field335 + 1];
            class297 var7 = class297.method1166(class295.field3192, client.field592.field1429);
            var7.field3227.method8283(class515.method7389(var4) + 2);
            var7.field3227.method8290(var4);
            var7.field3227.method8283(var5 - 1);
            var7.field3227.method8283(var6);
            client.field592.method2665(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field335 -= 2;
            int var8 = field893[Statics.field335];
            int var9 = field893[Statics.field335 + 1];
            class65 var10 = class111.method6024(var8, var9);
            if (var10 == null) {
                field893[++Statics.field335 - 1] = -1;
                field893[++Statics.field335 - 1] = 0;
                field877[++Statics.field1625 - 1] = "";
                field877[++Statics.field1625 - 1] = "";
                field877[++Statics.field1625 - 1] = "";
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = var10.field503;
                field893[++Statics.field335 - 1] = var10.field499;
                field877[++Statics.field1625 - 1] = var10.field501 == null ? "" : var10.field501;
                field877[++Statics.field1625 - 1] = var10.field505 == null ? "" : var10.field505;
                field877[++Statics.field1625 - 1] = var10.field506 == null ? "" : var10.field506;
                field893[++Statics.field335 - 1] = var10.method1145() ? 1 : (var10.method1131() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field893[--Statics.field335];
            class65 var12 = class111.method483(var11);
            if (var12 == null) {
                field893[++Statics.field335 - 1] = -1;
                field893[++Statics.field335 - 1] = 0;
                field877[++Statics.field1625 - 1] = "";
                field877[++Statics.field1625 - 1] = "";
                field877[++Statics.field1625 - 1] = "";
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = var12.field500;
                field893[++Statics.field335 - 1] = var12.field499;
                field877[++Statics.field1625 - 1] = var12.field501 == null ? "" : var12.field501;
                field877[++Statics.field1625 - 1] = var12.field505 == null ? "" : var12.field505;
                field877[++Statics.field1625 - 1] = var12.field506 == null ? "" : var12.field506;
                field893[++Statics.field335 - 1] = var12.method1145() ? 1 : (var12.method1131() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field1540 == null) {
                field893[++Statics.field335 - 1] = -1;
            } else {
                field893[++Statics.field335 - 1] = Statics.field1540.field5247;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field877[--Statics.field1625];
            int var14 = field893[--Statics.field335];
            class297 var15 = class539.method2302(var14, var13, Statics.field1676, -1);
            client.field592.method2665(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1625 -= 2;
            String var16 = field877[Statics.field1625];
            String var17 = field877[Statics.field1625 + 1];
            class297 var18 = class297.method1166(class295.field3193, client.field592.field1429);
            var18.field3227.method8345(0);
            int var19 = var18.field3227.field5111;
            var18.field3227.method8290(var16);
            class335.method3914(var18.field3227, var17);
            var18.field3227.method8296(var18.field3227.field5111 - var19);
            client.field592.method2665(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field877[--Statics.field1625];
            Statics.field335 -= 2;
            int var21 = field893[Statics.field335];
            int var22 = field893[Statics.field335 + 1];
            class297 var23 = class539.method2302(var21, var20, Statics.field1676, var22);
            client.field592.method2665(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field2132 == null || Statics.field2132.field1146 == null) {
                var24 = "";
            } else {
                var24 = Statics.field2132.field1146.method8917();
            }
            field877[++Statics.field1625 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field893[++Statics.field335 - 1] = client.field761;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = class111.method3399(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = class111.method5187(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = class111.method2959(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field877[--Statics.field1625];
            client.method2183(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field555 = field877[--Statics.field1625].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field877[++Statics.field1625 - 1] = client.field555;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field877[--Statics.field1625];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field335 -= 2;
            int var30 = field893[Statics.field335];
            int var31 = field893[Statics.field335 + 1];
            class65 var32 = class111.method6024(var30, var31);
            if (var32 == null) {
                field893[++Statics.field335 - 1] = -1;
                field893[++Statics.field335 - 1] = 0;
                field877[++Statics.field1625 - 1] = "";
                field877[++Statics.field1625 - 1] = "";
                field877[++Statics.field1625 - 1] = "";
                field893[++Statics.field335 - 1] = 0;
                field877[++Statics.field1625 - 1] = "";
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = var32.field503;
                field893[++Statics.field335 - 1] = var32.field499;
                field877[++Statics.field1625 - 1] = var32.field501 == null ? "" : var32.field501;
                field877[++Statics.field1625 - 1] = var32.field505 == null ? "" : var32.field505;
                field877[++Statics.field1625 - 1] = var32.field506 == null ? "" : var32.field506;
                field893[++Statics.field335 - 1] = var32.method1145() ? 1 : (var32.method1131() ? 2 : 0);
                field877[++Statics.field1625 - 1] = "";
                field893[++Statics.field335 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field893[--Statics.field335];
            class65 var34 = class111.method483(var33);
            if (var34 == null) {
                field893[++Statics.field335 - 1] = -1;
                field893[++Statics.field335 - 1] = 0;
                field877[++Statics.field1625 - 1] = "";
                field877[++Statics.field1625 - 1] = "";
                field877[++Statics.field1625 - 1] = "";
                field893[++Statics.field335 - 1] = 0;
                field877[++Statics.field1625 - 1] = "";
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = var34.field500;
                field893[++Statics.field335 - 1] = var34.field499;
                field877[++Statics.field1625 - 1] = var34.field501 == null ? "" : var34.field501;
                field877[++Statics.field1625 - 1] = var34.field505 == null ? "" : var34.field505;
                field877[++Statics.field1625 - 1] = var34.field506 == null ? "" : var34.field506;
                field893[++Statics.field335 - 1] = var34.method1145() ? 1 : (var34.method1131() ? 2 : 0);
                field877[++Statics.field1625 - 1] = "";
                field893[++Statics.field335 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gw.ba(ILdh;ZI)I")
    public static int method3069(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field893[++Statics.field335 - 1] = client.method3928();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field893[--Statics.field335];
            if (var3 == 1 || var3 == 2) {
                Statics.method5055(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field893[++Statics.field335 - 1] = Statics.field4737.method2365();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field893[--Statics.field335];
            if (var4 == 1 || var4 == 2) {
                Statics.field4737.method2364(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field335--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("rn.bl(ILdh;ZI)I")
    public static int method7687(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field335 -= 2;
            int var3 = field893[Statics.field335];
            int var4 = field893[Statics.field335 + 1];
            if (!client.field788) {
                client.field566 = var3;
                client.field705 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field893[++Statics.field335 - 1] = client.field566;
            return 1;
        } else if (arg0 == 5506) {
            field893[++Statics.field335 - 1] = client.field705;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field893[--Statics.field335];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field621 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field893[++Statics.field335 - 1] = client.field621;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cb.bp(ILdh;ZI)I")
    public static int method1982(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field580 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fa.bu(II)I")
    public static int method3053(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("mn.bo(II)I")
    public static int method5998(int arg0) {
        return (int) ((Math.log((double) arg0) / field892 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("fr.br(ILdh;ZI)I")
    public static int method2947(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field893[++Statics.field335 - 1] = class68.method2802() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class68 var3 = class68.method283();
            if (var3 == null) {
                field893[++Statics.field335 - 1] = -1;
                field893[++Statics.field335 - 1] = 0;
                field877[++Statics.field1625 - 1] = "";
                field893[++Statics.field335 - 1] = 0;
                field893[++Statics.field335 - 1] = 0;
                field877[++Statics.field1625 - 1] = "";
            } else {
                field893[++Statics.field335 - 1] = var3.field841;
                field893[++Statics.field335 - 1] = var3.field837;
                field877[++Statics.field1625 - 1] = var3.field845;
                field893[++Statics.field335 - 1] = var3.field846;
                field893[++Statics.field335 - 1] = var3.field843;
                field877[++Statics.field1625 - 1] = var3.field844;
            }
            return 1;
        } else if (arg0 == 6502) {
            class68 var4 = class68.method3330();
            if (var4 == null) {
                field893[++Statics.field335 - 1] = -1;
                field893[++Statics.field335 - 1] = 0;
                field877[++Statics.field1625 - 1] = "";
                field893[++Statics.field335 - 1] = 0;
                field893[++Statics.field335 - 1] = 0;
                field877[++Statics.field1625 - 1] = "";
            } else {
                field893[++Statics.field335 - 1] = var4.field841;
                field893[++Statics.field335 - 1] = var4.field837;
                field877[++Statics.field1625 - 1] = var4.field845;
                field893[++Statics.field335 - 1] = var4.field846;
                field893[++Statics.field335 - 1] = var4.field843;
                field877[++Statics.field1625 - 1] = var4.field844;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field893[--Statics.field335];
            class68 var6 = null;
            for (int var7 = 0; var7 < class68.field842; var7++) {
                if (Statics.field1879[var7].field841 == var5) {
                    var6 = Statics.field1879[var7];
                    break;
                }
            }
            if (var6 == null) {
                field893[++Statics.field335 - 1] = -1;
                field893[++Statics.field335 - 1] = 0;
                field877[++Statics.field1625 - 1] = "";
                field893[++Statics.field335 - 1] = 0;
                field893[++Statics.field335 - 1] = 0;
                field877[++Statics.field1625 - 1] = "";
            } else {
                field893[++Statics.field335 - 1] = var6.field841;
                field893[++Statics.field335 - 1] = var6.field837;
                field877[++Statics.field1625 - 1] = var6.field845;
                field893[++Statics.field335 - 1] = var6.field846;
                field893[++Statics.field335 - 1] = var6.field843;
                field877[++Statics.field1625 - 1] = var6.field844;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field335 -= 4;
            int var8 = field893[Statics.field335];
            boolean var9 = field893[Statics.field335 + 1] == 1;
            int var10 = field893[Statics.field335 + 2];
            boolean var11 = field893[Statics.field335 + 3] == 1;
            class68.method2902(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field893[--Statics.field335];
            if (var12 >= 0 && var12 < class68.field842) {
                class68 var13 = Statics.field1879[var12];
                field893[++Statics.field335 - 1] = var13.field841;
                field893[++Statics.field335 - 1] = var13.field837;
                field877[++Statics.field1625 - 1] = var13.field845;
                field893[++Statics.field335 - 1] = var13.field846;
                field893[++Statics.field335 - 1] = var13.field843;
                field877[++Statics.field1625 - 1] = var13.field844;
            } else {
                field893[++Statics.field335 - 1] = -1;
                field893[++Statics.field335 - 1] = 0;
                field877[++Statics.field1625 - 1] = "";
                field893[++Statics.field335 - 1] = 0;
                field893[++Statics.field335 - 1] = 0;
                field877[++Statics.field1625 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field685 = field893[--Statics.field335] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field335 -= 2;
            int var14 = field893[Statics.field335];
            int var15 = field893[Statics.field335 + 1];
            class203 var16 = class203.method3266(var15);
            if (var16.method3518()) {
                field877[++Statics.field1625 - 1] = class196.method2202(var14).method3434(var15, var16.field2137);
            } else {
                field893[++Statics.field335 - 1] = class196.method2202(var14).method3446(var15, var16.field2133);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field335 -= 2;
            int var17 = field893[Statics.field335];
            int var18 = field893[Statics.field335 + 1];
            class203 var19 = class203.method3266(var18);
            if (var19.method3518()) {
                field877[++Statics.field1625 - 1] = class206.method3321(var17).method3612(var18, var19.field2137);
            } else {
                field893[++Statics.field335 - 1] = class206.method3321(var17).method3611(var18, var19.field2133);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field335 -= 2;
            int var20 = field893[Statics.field335];
            int var21 = field893[Statics.field335 + 1];
            class203 var22 = class203.method3266(var21);
            if (var22.method3518()) {
                field877[++Statics.field1625 - 1] = class207.method3280(var20).method3655(var21, var22.field2137);
            } else {
                field893[++Statics.field335 - 1] = class207.method3280(var20).method3664(var21, var22.field2133);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field335 -= 2;
            int var23 = field893[Statics.field335];
            int var24 = field893[Statics.field335 + 1];
            class203 var25 = class203.method3266(var24);
            if (var25.method3518()) {
                field877[++Statics.field1625 - 1] = class204.method2578(var23).method3542(var24, var25.field2137);
            } else {
                field893[++Statics.field335 - 1] = class204.method2578(var23).method3541(var24, var25.field2133);
            }
            return 1;
        } else if (arg0 == 6518) {
            field893[++Statics.field335 - 1] = client.field762 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field893[++Statics.field335 - 1] = client.field533;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1625--;
            Statics.field335--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1625--;
            Statics.field335--;
            return 1;
        } else if (arg0 == 6524) {
            field893[++Statics.field335 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field893[++Statics.field335 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field893[++Statics.field335 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field893[++Statics.field335 - 1] = client.field545;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cb.be(ILdh;ZI)I")
    public static int method1983(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1321;
            int var4 = (Statics.field2132.field1228 >> 7) + Statics.field1448;
            int var5 = (Statics.field2132.field1199 >> 7) + Statics.field354;
            client.method4150().method7783(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field893[--Statics.field335];
            String var7 = "";
            class257 var8 = client.method4150().method7855(var6);
            if (var8 != null) {
                var7 = var8.method4740();
            }
            field877[++Statics.field1625 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field893[--Statics.field335];
            client.method4150().method7787(var9);
            return 1;
        } else if (arg0 == 6603) {
            field893[++Statics.field335 - 1] = client.method4150().method7801();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field893[--Statics.field335];
            client.method4150().method7798(var10);
            return 1;
        } else if (arg0 == 6605) {
            field893[++Statics.field335 - 1] = client.method4150().method7893() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class323 var11 = new class323(field893[--Statics.field335]);
            client.method4150().method7805(var11.field3543, var11.field3545);
            return 1;
        } else if (arg0 == 6607) {
            class323 var12 = new class323(field893[--Statics.field335]);
            client.method4150().method7806(var12.field3543, var12.field3545);
            return 1;
        } else if (arg0 == 6608) {
            class323 var13 = new class323(field893[--Statics.field335]);
            client.method4150().method7807(var13.field3544, var13.field3543, var13.field3545);
            return 1;
        } else if (arg0 == 6609) {
            class323 var14 = new class323(field893[--Statics.field335]);
            client.method4150().method7808(var14.field3544, var14.field3543, var14.field3545);
            return 1;
        } else if (arg0 == 6610) {
            field893[++Statics.field335 - 1] = client.method4150().method7809();
            field893[++Statics.field335 - 1] = client.method4150().method7887();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field893[--Statics.field335];
            class257 var16 = client.method4150().method7855(var15);
            if (var16 == null) {
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = var16.method4752().method5500();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field893[--Statics.field335];
            class257 var18 = client.method4150().method7855(var17);
            if (var18 == null) {
                field893[++Statics.field335 - 1] = 0;
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = (var18.method4790() - var18.method4743() + 1) * 64;
                field893[++Statics.field335 - 1] = (var18.method4763() - var18.method4776() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field893[--Statics.field335];
            class257 var20 = client.method4150().method7855(var19);
            if (var20 == null) {
                field893[++Statics.field335 - 1] = 0;
                field893[++Statics.field335 - 1] = 0;
                field893[++Statics.field335 - 1] = 0;
                field893[++Statics.field335 - 1] = 0;
            } else {
                field893[++Statics.field335 - 1] = var20.method4743() * 64;
                field893[++Statics.field335 - 1] = var20.method4776() * 64;
                field893[++Statics.field335 - 1] = var20.method4790() * 64 + 64 - 1;
                field893[++Statics.field335 - 1] = var20.method4763() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field893[--Statics.field335];
            class257 var22 = client.method4150().method7855(var21);
            if (var22 == null) {
                field893[++Statics.field335 - 1] = -1;
            } else {
                field893[++Statics.field335 - 1] = var22.method4742();
            }
            return 1;
        } else if (arg0 == 6615) {
            class323 var23 = client.method4150().method7784();
            if (var23 == null) {
                field893[++Statics.field335 - 1] = -1;
                field893[++Statics.field335 - 1] = -1;
            } else {
                field893[++Statics.field335 - 1] = var23.field3543;
                field893[++Statics.field335 - 1] = var23.field3545;
            }
            return 1;
        } else if (arg0 == 6616) {
            field893[++Statics.field335 - 1] = client.method4150().method7788();
            return 1;
        } else if (arg0 == 6617) {
            class323 var24 = new class323(field893[--Statics.field335]);
            class257 var25 = client.method4150().method7789();
            if (var25 == null) {
                field893[++Statics.field335 - 1] = -1;
                field893[++Statics.field335 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4762(var24.field3544, var24.field3543, var24.field3545);
            if (var26 == null) {
                field893[++Statics.field335 - 1] = -1;
                field893[++Statics.field335 - 1] = -1;
            } else {
                field893[++Statics.field335 - 1] = var26[0];
                field893[++Statics.field335 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class323 var27 = new class323(field893[--Statics.field335]);
            class257 var28 = client.method4150().method7789();
            if (var28 == null) {
                field893[++Statics.field335 - 1] = -1;
                field893[++Statics.field335 - 1] = -1;
                return 1;
            }
            class323 var29 = var28.method4736(var27.field3543, var27.field3545);
            if (var29 == null) {
                field893[++Statics.field335 - 1] = -1;
            } else {
                field893[++Statics.field335 - 1] = var29.method5500();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field335 -= 2;
            int var30 = field893[Statics.field335];
            class323 var31 = new class323(field893[Statics.field335 + 1]);
            method3071(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field335 -= 2;
            int var32 = field893[Statics.field335];
            class323 var33 = new class323(field893[Statics.field335 + 1]);
            method3071(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field335 -= 2;
            int var34 = field893[Statics.field335];
            class323 var35 = new class323(field893[Statics.field335 + 1]);
            class257 var36 = client.method4150().method7855(var34);
            if (var36 == null) {
                field893[++Statics.field335 - 1] = 0;
                return 1;
            } else {
                field893[++Statics.field335 - 1] = var36.method4732(var35.field3544, var35.field3543, var35.field3545) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field893[++Statics.field335 - 1] = client.method4150().method7812();
            field893[++Statics.field335 - 1] = client.method4150().method7813();
            return 1;
        } else if (arg0 == 6623) {
            class323 var37 = new class323(field893[--Statics.field335]);
            class257 var38 = client.method4150().method7785(var37.field3544, var37.field3543, var37.field3545);
            if (var38 == null) {
                field893[++Statics.field335 - 1] = -1;
            } else {
                field893[++Statics.field335 - 1] = var38.method4747();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method4150().method7814(field893[--Statics.field335]);
            return 1;
        } else if (arg0 == 6625) {
            client.method4150().method7815();
            return 1;
        } else if (arg0 == 6626) {
            client.method4150().method7816(field893[--Statics.field335]);
            return 1;
        } else if (arg0 == 6627) {
            client.method4150().method7817();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field893[--Statics.field335] == 1;
            client.method4150().method7818(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field893[--Statics.field335];
            client.method4150().method7795(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field893[--Statics.field335];
            client.method4150().method7820(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method4150().method7821();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field893[--Statics.field335] == 1;
            client.method4150().method7822(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field335 -= 2;
            int var43 = field893[Statics.field335];
            boolean var44 = field893[Statics.field335 + 1] == 1;
            client.method4150().method7867(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field335 -= 2;
            int var45 = field893[Statics.field335];
            boolean var46 = field893[Statics.field335 + 1] == 1;
            client.method4150().method7786(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field893[++Statics.field335 - 1] = client.method4150().method7825() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = client.method4150().method7937(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field893[--Statics.field335];
            field893[++Statics.field335 - 1] = client.method4150().method7827(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field335 -= 2;
            int var49 = field893[Statics.field335];
            class323 var50 = new class323(field893[Statics.field335 + 1]);
            class323 var51 = client.method4150().method7830(var49, var50);
            if (var51 == null) {
                field893[++Statics.field335 - 1] = -1;
            } else {
                field893[++Statics.field335 - 1] = var51.method5500();
            }
            return 1;
        } else if (arg0 == 6639) {
            class275 var52 = client.method4150().method7777();
            if (var52 == null) {
                field893[++Statics.field335 - 1] = -1;
                field893[++Statics.field335 - 1] = -1;
            } else {
                field893[++Statics.field335 - 1] = var52.method4685();
                field893[++Statics.field335 - 1] = var52.field3058.method5500();
            }
            return 1;
        } else if (arg0 == 6640) {
            class275 var53 = client.method4150().method7833();
            if (var53 == null) {
                field893[++Statics.field335 - 1] = -1;
                field893[++Statics.field335 - 1] = -1;
            } else {
                field893[++Statics.field335 - 1] = var53.method4685();
                field893[++Statics.field335 - 1] = var53.field3058.method5500();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field893[--Statics.field335];
            class188 var55 = class188.method2945(var54);
            if (var55.field1947 == null) {
                field877[++Statics.field1625 - 1] = "";
            } else {
                field877[++Statics.field1625 - 1] = var55.field1947;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field893[--Statics.field335];
            class188 var57 = class188.method2945(var56);
            field893[++Statics.field335 - 1] = var57.field1949;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field893[--Statics.field335];
            class188 var59 = class188.method2945(var58);
            if (var59 == null) {
                field893[++Statics.field335 - 1] = -1;
            } else {
                field893[++Statics.field335 - 1] = var59.field1963;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field893[--Statics.field335];
            class188 var61 = class188.method2945(var60);
            if (var61 == null) {
                field893[++Statics.field335 - 1] = -1;
            } else {
                field893[++Statics.field335 - 1] = var61.field1945;
            }
            return 1;
        } else if (arg0 == 6697) {
            field893[++Statics.field335 - 1] = Statics.field522.field3080;
            return 1;
        } else if (arg0 == 6698) {
            field893[++Statics.field335 - 1] = Statics.field522.field3076.method5500();
            return 1;
        } else if (arg0 == 6699) {
            field893[++Statics.field335 - 1] = Statics.field522.field3078.method5500();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dq.bi(ILdh;ZI)I")
    public static int method2529(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field893[--Statics.field335];
            class196 var4 = class196.method2202(var3);
            field877[++Statics.field1625 - 1] = var4 == null ? "" : var4.field2037;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field335 -= 2;
            class196 var5 = class196.method2202(field893[Statics.field335]);
            int var6 = field893[Statics.field335 + 1];
            field893[++Statics.field335 - 1] = var5.method3411(var6);
            field893[++Statics.field335 - 1] = var5.method3431(var6);
            return 1;
        } else if (arg0 == 6765) {
            class196 var7 = class196.method2202(field893[--Statics.field335]);
            field893[++Statics.field335 - 1] = var7 == null ? 0 : var7.field2062;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ho.bz(ILdh;ZI)I")
    public static int method3265(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field893[--Statics.field335];
            class206 var4 = class206.method3321(var3);
            field877[++Statics.field1625 - 1] = var4 == null ? "" : var4.field2181;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cf.bx(ILdh;ZI)I")
    public static int method1038(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("az.bn(ILdh;ZI)I")
    public static int method35(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ea.bw(ILdh;ZI)I")
    public static int method2649(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field893[++Statics.field335 - 1] = client.method7346() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gf.bc(ILdh;ZI)I")
    public static int method3201(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("bi.cw(ILdh;ZI)I")
    public static int method860(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field893[--Statics.field335];
            Object var45 = method3916(var44);
            int var46 = field893[--Statics.field335];
            class507 var47 = client.method6046(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class509.method3918(var46);
            Statics.field1973 = var47.method8195(var45, var48);
            if (Statics.field1973 == null) {
                client.field823 = -1;
                Statics.field426 = null;
                if (arg0 == 7500) {
                    field893[++Statics.field335 - 1] = 0;
                }
            } else {
                client.field823 = class509.method2770(var46);
                Statics.field426 = Statics.field1973.iterator();
                if (arg0 == 7500) {
                    field893[++Statics.field335 - 1] = Statics.field1973.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field426 != null && Statics.field426.hasNext()) {
                field893[++Statics.field335 - 1] = (Integer) Statics.field426.next();
            } else {
                field893[++Statics.field335 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field335 -= 3;
            int var3 = field893[Statics.field335];
            int var4 = field893[Statics.field335 + 1];
            int var5 = field893[Statics.field335 + 2];
            int var6 = class509.method2770(var4);
            int var7 = class509.method3402(var4);
            int var8 = class509.method3918(var4);
            class508 var9 = class508.method3057(var3);
            class506 var10 = class506.method3058(var6);
            int[] var11 = var10.field5044[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method8206(var7);
            if (var14 == null && var10.field5046 != null) {
                var14 = var10.field5046[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class503 var17 = class501.method3784(var16);
                    if (class503.field5031 == var17) {
                        field877[++Statics.field1625 - 1] = "";
                    } else {
                        field893[++Statics.field335 - 1] = class501.method2854(var16);
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
                class503 var21 = class501.method3784(var11[var19]);
                if (class503.field5031 == var21) {
                    field877[++Statics.field1625 - 1] = (String) var14[var20];
                } else {
                    field893[++Statics.field335 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field335 -= 2;
            int var22 = field893[Statics.field335];
            int var23 = field893[Statics.field335 + 1];
            int var24 = 0;
            int var25 = class509.method2770(var23);
            int var26 = class509.method3402(var23);
            class508 var27 = class508.method3057(var22);
            class506 var28 = class506.method3058(var25);
            int[] var29 = var28.field5044[var26];
            Object[] var30 = var27.method8206(var26);
            if (var30 == null && var28.field5046 != null) {
                var30 = var28.field5046[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field893[++Statics.field335 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field335--;
            int var41 = field893[Statics.field335];
            class507 var42 = client.method7194(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field1973 = var42.method8195(0, 0);
            int var43 = 0;
            if (Statics.field1973 != null) {
                client.field823 = var41;
                Statics.field426 = Statics.field1973.iterator();
                var43 = Statics.field1973.size();
            }
            if (arg0 == 7504) {
                field893[++Statics.field335 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field893[--Statics.field335];
            class508 var32 = class508.method3057(var31);
            field893[++Statics.field335 - 1] = var32.field5056;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field893[--Statics.field335];
            int var34 = -1;
            if (Statics.field1973 != null && var33 >= 0 && var33 < Statics.field1973.size()) {
                var34 = (Integer) Statics.field1973.get(var33);
            }
            field893[++Statics.field335 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field893[--Statics.field335];
            Object var36 = method3916(var35);
            int var37 = field893[--Statics.field335];
            class507 var38 = client.method6046(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class509.method2770(var37) != client.field823) {
                throw new RuntimeException();
            } else if (Statics.field1973 == null && Statics.field1973.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class509.method3918(var37);
                List var40 = var38.method8195(var36, var39);
                Statics.field1973 = new LinkedList(Statics.field1973);
                if (var40 == null) {
                    Statics.field1973.clear();
                } else {
                    Statics.field1973.retainAll(var40);
                }
                Statics.field426 = Statics.field1973.iterator();
                if (arg0 == 7507) {
                    field893[++Statics.field335 - 1] = Statics.field1973.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gt.cf(ILdh;ZI)I")
    public static int method3255(int arg0, class79 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ih.cm(ILdh;ZI)I")
    public static int method3920(int arg0, class79 arg1, boolean arg2) {
        if (arg0 == 8000) {
            Statics.field335--;
            int var3 = field893[Statics.field335];
            int var4 = field880[var3];
            class510.method7744(field883[var3], new int[var4], 0, var4 - 1);
            return 1;
        } else if (arg0 == 8001) {
            Statics.field335 -= 3;
            int var5 = field893[Statics.field335];
            int var6 = field893[Statics.field335 + 1];
            int var7 = field893[Statics.field335 + 2];
            int var8 = field880[var5];
            if (var8 <= 1) {
                return 1;
            } else {
                class410.method7012(field883[var5], var8, var6, var7);
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("in.cn(IS)V")
    public static void method3917(int arg0) {
        if (arg0 == -1 || !class332.method6373(arg0)) {
            return;
        }
        class332[] var1 = Statics.field3229[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class332 var3 = var1[var2];
            if (var3.field3735 != null) {
                class88 var4 = new class88();
                var4.field1084 = var3;
                var4.field1087 = var3.field3735;
                method2499(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("gi.cs(ILmc;ZI)V")
    public static void method3071(int arg0, class323 arg1, boolean arg2) {
        class257 var3 = client.method4150().method7855(arg0);
        int var4 = Statics.field2132.field1150;
        int var5 = (Statics.field2132.field1228 >> 7) + Statics.field1448;
        int var6 = (Statics.field2132.field1199 >> 7) + Statics.field354;
        class323 var7 = new class323(var4, var5, var6);
        client.method4150().method7792(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("gy.cx(Ltb;I)Ljava/lang/Object;")
    public static Object method3218(class503 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field5032) {
            case 1:
                return field893[--Statics.field335];
            case 2:
                return field877[--Statics.field1625];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("in.cr(IB)Ljava/lang/Object;")
    public static Object method3916(int arg0) {
        return method3218((class503) class373.method371(class503.method8172(), arg0));
    }
}
