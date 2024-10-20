package deob;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("cx")
public class class72 {

    @ObfuscatedName("cx.ah")
    public static int[] field873 = new int[5];

    @ObfuscatedName("cx.ar")
    public static int[][] field874 = new int[5][5000];

    @ObfuscatedName("cx.ab")
    public static int[] field875 = new int[1000];

    @ObfuscatedName("cx.av")
    public static String[] field886 = new String[1000];

    @ObfuscatedName("cx.aa")
    public static int field878 = 0;

    @ObfuscatedName("cx.ap")
    public static class64[] field871 = new class64[50];

    @ObfuscatedName("cx.ai")
    public static Calendar field881 = Calendar.getInstance();

    @ObfuscatedName("cx.ae")
    public static final String[] field882 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("cx.aq")
    public static boolean field883 = false;

    @ObfuscatedName("cx.az")
    public static boolean field884 = false;

    @ObfuscatedName("cx.at")
    public static ArrayList field887 = new ArrayList();

    @ObfuscatedName("cx.af")
    public static int field879 = 0;

    @ObfuscatedName("cx.by")
    public static final double field885 = Math.log(2.0D);

    public class72() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.ac(Ldl;I)V")
    public static void method2004(class90 arg0) {
        method7507(arg0, 500000, 475000);
    }

    @ObfuscatedName("rw.al(Ldl;III)V")
    public static void method7507(class90 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field1087;
        class81 var5;
        if (class528.method7080(arg0.field1084)) {
            Statics.field2423 = (class294) var3[0];
            class195 var4 = class195.method2991(Statics.field2423.field3106);
            var5 = class81.method448(arg0.field1084, var4.field1956, var4.field1935);
        } else {
            int var6 = (Integer) var3[0];
            var5 = class81.method411(var6);
        }
        if (var5 != null) {
            method3092(arg0, var5, arg1, arg2);
        }
    }

    @ObfuscatedName("gj.ak(Ldl;Lds;III)V")
    public static void method3092(class90 arg0, class81 arg1, int arg2, int arg3) {
        Object[] var4 = arg0.field1087;
        Statics.field876 = 0;
        Statics.field1867 = 0;
        int var5 = -1;
        int[] var6 = arg1.field1013;
        int[] var7 = arg1.field1007;
        byte var8 = -1;
        field878 = 0;
        field883 = false;
        boolean var9 = false;
        int var10 = 0;
        try {
            Statics.field872 = new int[arg1.field1010];
            int var11 = 0;
            Statics.field1751 = new String[arg1.field1004];
            int var12 = 0;
            for (int var13 = 1; var13 < var4.length; var13++) {
                if (var4[var13] instanceof Integer) {
                    int var14 = (Integer) var4[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field1081;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field1086;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field1088 == null ? -1 : arg0.field1088.field3676;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1082;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field1088 == null ? -1 : arg0.field1088.field3757;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1083 == null ? -1 : arg0.field1083.field3676;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1083 == null ? -1 : arg0.field1083.field3757;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field1080;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field1085;
                    }
                    Statics.field872[var11++] = var14;
                } else if (var4[var13] instanceof String) {
                    String var15 = (String) var4[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1077;
                    }
                    Statics.field1751[var12++] = var15;
                }
            }
            field879 = arg0.field1079;
            while (true) {
                var10++;
                if (var10 > arg2) {
                    throw new RuntimeException();
                }
                var5++;
                int var59 = var6[var5];
                if (var59 >= 100) {
                    boolean var46;
                    if (arg1.field1007[var5] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    int var47 = method4676(var59, arg1, var46);
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
                    field875[++Statics.field876 - 1] = var7[var5];
                } else if (var59 == 1) {
                    int var16 = var7[var5];
                    field875[++Statics.field876 - 1] = class336.field3568[var16];
                } else if (var59 == 2) {
                    int var17 = var7[var5];
                    class336.field3568[var17] = field875[--Statics.field876];
                    client.method2224(var17);
                } else if (var59 == 3) {
                    field886[++Statics.field1867 - 1] = arg1.field1014[var5];
                } else if (var59 == 6) {
                    var5 += var7[var5];
                } else if (var59 == 7) {
                    Statics.field876 -= 2;
                    if (field875[Statics.field876] != field875[Statics.field876 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 8) {
                    Statics.field876 -= 2;
                    if (field875[Statics.field876] == field875[Statics.field876 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 9) {
                    Statics.field876 -= 2;
                    if (field875[Statics.field876] < field875[Statics.field876 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 10) {
                    Statics.field876 -= 2;
                    if (field875[Statics.field876] > field875[Statics.field876 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 21) {
                    if (field878 == 0) {
                        return;
                    }
                    class64 var19 = field871[--field878];
                    arg1 = var19.field488;
                    var6 = arg1.field1013;
                    var7 = arg1.field1007;
                    var5 = var19.field490;
                    Statics.field872 = var19.field489;
                    Statics.field1751 = var19.field487;
                } else if (var59 == 25) {
                    int var20 = var7[var5];
                    field875[++Statics.field876 - 1] = class336.method686(var20);
                } else if (var59 == 27) {
                    int var21 = var7[var5];
                    class336.method2871(var21, field875[--Statics.field876]);
                } else if (var59 == 31) {
                    Statics.field876 -= 2;
                    if (field875[Statics.field876] <= field875[Statics.field876 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 32) {
                    Statics.field876 -= 2;
                    if (field875[Statics.field876] >= field875[Statics.field876 + 1]) {
                        var5 += var7[var5];
                    }
                } else if (var59 == 33) {
                    field875[++Statics.field876 - 1] = Statics.field872[var7[var5]];
                } else if (var59 == 34) {
                    Statics.field872[var7[var5]] = field875[--Statics.field876];
                } else if (var59 == 35) {
                    field886[++Statics.field1867 - 1] = Statics.field1751[var7[var5]];
                } else if (var59 == 36) {
                    Statics.field1751[var7[var5]] = field886[--Statics.field1867];
                } else if (var59 == 37) {
                    int var22 = var7[var5];
                    Statics.field1867 -= var22;
                    String var23 = Statics.method5347(field886, Statics.field1867, var22);
                    field886[++Statics.field1867 - 1] = var23;
                } else if (var59 == 38) {
                    Statics.field876--;
                } else if (var59 == 39) {
                    Statics.field1867--;
                } else if (var59 == 40) {
                    int var24 = var7[var5];
                    class81 var25 = class81.method411(var24);
                    int[] var26 = new int[var25.field1010];
                    String[] var27 = new String[var25.field1004];
                    for (int var28 = 0; var28 < var25.field1011; var28++) {
                        var26[var28] = field875[Statics.field876 - var25.field1011 + var28];
                    }
                    for (int var29 = 0; var29 < var25.field1012; var29++) {
                        var27[var29] = field886[Statics.field1867 - var25.field1012 + var29];
                    }
                    Statics.field876 -= var25.field1011;
                    Statics.field1867 -= var25.field1012;
                    class64 var30 = new class64();
                    var30.field488 = arg1;
                    var30.field490 = var5;
                    var30.field489 = Statics.field872;
                    var30.field487 = Statics.field1751;
                    field871[++field878 - 1] = var30;
                    arg1 = var25;
                    var6 = var25.field1013;
                    var7 = var25.field1007;
                    var5 = -1;
                    Statics.field872 = var26;
                    Statics.field1751 = var27;
                } else if (var59 == 42) {
                    field875[++Statics.field876 - 1] = Statics.field186.method2622(var7[var5]);
                } else if (var59 == 43) {
                    Statics.field186.method2655(var7[var5], field875[--Statics.field876]);
                } else if (var59 == 44) {
                    int var31 = var7[var5] >> 16;
                    int var32 = var7[var5] & 0xFFFF;
                    int var33 = field875[--Statics.field876];
                    if (var33 < 0 || var33 > 5000) {
                        throw new RuntimeException();
                    }
                    field873[var31] = var33;
                    byte var34 = -1;
                    if (var32 == 105) {
                        var34 = 0;
                    }
                    for (int var35 = 0; var35 < var33; var35++) {
                        field874[var31][var35] = var34;
                    }
                } else if (var59 == 45) {
                    int var36 = var7[var5];
                    int var37 = field875[--Statics.field876];
                    if (var37 < 0 || var37 >= field873[var36]) {
                        throw new RuntimeException();
                    }
                    field875[++Statics.field876 - 1] = field874[var36][var37];
                } else if (var59 == 46) {
                    int var38 = var7[var5];
                    Statics.field876 -= 2;
                    int var39 = field875[Statics.field876];
                    if (var39 < 0 || var39 >= field873[var38]) {
                        throw new RuntimeException();
                    }
                    field874[var38][var39] = field875[Statics.field876 + 1];
                } else if (var59 == 47) {
                    String var40 = Statics.field186.method2628(var7[var5]);
                    if (var40 == null) {
                        var40 = class367.field3956;
                    }
                    field886[++Statics.field1867 - 1] = var40;
                } else if (var59 == 48) {
                    Statics.field186.method2627(var7[var5], field886[--Statics.field1867]);
                } else if (var59 == 49) {
                    String var41 = Statics.field186.method2626(var7[var5]);
                    field886[++Statics.field1867 - 1] = var41;
                } else if (var59 == 50) {
                    Statics.field186.method2625(var7[var5], field886[--Statics.field1867]);
                } else if (var59 == 60) {
                    class503 var42 = arg1.field1008[var7[var5]];
                    class487 var43 = (class487) var42.method8070((long) field875[--Statics.field876]);
                    if (var43 != null) {
                        var5 += var43.field4855;
                    }
                } else if (var59 == 74) {
                    Integer var44 = Statics.field3109.method3022(var7[var5]);
                    if (var44 == null) {
                        field875[++Statics.field876 - 1] = -1;
                    } else {
                        field875[++Statics.field876 - 1] = var44;
                    }
                } else if (var59 == 76) {
                    Integer var45 = Statics.field2317.method7685(var7[var5]);
                    if (var45 == null) {
                        field875[++Statics.field876 - 1] = -1;
                    } else {
                        field875[++Statics.field876 - 1] = var45;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var57) {
            var9 = true;
            StringBuilder var50 = new StringBuilder(30);
            var50.append("").append(arg1.field4857).append(" ");
            for (int var51 = field878 - 1; var51 >= 0; var51--) {
                var50.append("").append(field871[var51].field488.field4857).append(" ");
            }
            var50.append("").append(var8);
            class556.method3321(var50.toString(), var57);
        } finally {
            while (field887.size() > 0) {
                class105 var54 = (class105) field887.remove(0);
                client.method4518(var54.method2585(), var54.method2574(), var54.method2586(), var54.method2573(), "");
            }
            if (field883) {
                field883 = false;
                client.method1167();
            }
            if (!var9 && arg3 > 0 && var10 >= arg3) {
                class556.method3321("Warning: Script " + arg1.field1005 + " finished at op count " + var10 + " of max " + arg2, (Throwable) null);
            }
        }
    }

    @ObfuscatedName("js.ax(ILds;ZI)I")
    public static int method4676(int arg0, class81 arg1, boolean arg2) {
        if (arg0 < 1000) {
            return Statics.method3137(arg0, arg1, arg2);
        } else if (arg0 < 1100) {
            return method2456(arg0, arg1, arg2);
        } else if (arg0 < 1200) {
            return method258(arg0, arg1, arg2);
        } else if (arg0 < 1300) {
            return method2030(arg0, arg1, arg2);
        } else if (arg0 < 1400) {
            return method14(arg0, arg1, arg2);
        } else if (arg0 < 1500) {
            return method449(arg0, arg1, arg2);
        } else if (arg0 < 1600) {
            return method2210(arg0, arg1, arg2);
        } else if (arg0 < 1700) {
            return method2917(arg0, arg1, arg2);
        } else if (arg0 < 1800) {
            return method3461(arg0, arg1, arg2);
        } else if (arg0 < 1900) {
            return method162(arg0, arg1, arg2);
        } else if (arg0 < 2000) {
            return method290(arg0, arg1, arg2);
        } else if (arg0 < 2100) {
            return method2456(arg0, arg1, arg2);
        } else if (arg0 < 2200) {
            return method258(arg0, arg1, arg2);
        } else if (arg0 < 2300) {
            return method2030(arg0, arg1, arg2);
        } else if (arg0 < 2400) {
            return method14(arg0, arg1, arg2);
        } else if (arg0 < 2500) {
            return method449(arg0, arg1, arg2);
        } else if (arg0 < 2600) {
            return method438(arg0, arg1, arg2);
        } else if (arg0 < 2700) {
            return method298(arg0, arg1, arg2);
        } else if (arg0 < 2800) {
            return method5616(arg0, arg1, arg2);
        } else if (arg0 < 2900) {
            return Statics.method5306(arg0, arg1, arg2);
        } else if (arg0 < 3000) {
            return method290(arg0, arg1, arg2);
        } else if (arg0 < 3200) {
            return method4794(arg0, arg1, arg2);
        } else if (arg0 < 3300) {
            return method2911(arg0, arg1, arg2);
        } else if (arg0 < 3400) {
            return method4489(arg0, arg1, arg2);
        } else if (arg0 < 3500) {
            return method7428(arg0, arg1, arg2);
        } else if (arg0 < 3600) {
            return method3355(arg0, arg1, arg2);
        } else if (arg0 < 3700) {
            return method689(arg0, arg1, arg2);
        } else if (arg0 < 3800) {
            return method7693(arg0, arg1, arg2);
        } else if (arg0 < 3900) {
            return method154(arg0, arg1, arg2);
        } else if (arg0 < 4000) {
            return method2023(arg0, arg1, arg2);
        } else if (arg0 < 4100) {
            return method3402(arg0, arg1, arg2);
        } else if (arg0 < 4200) {
            return Statics.method2964(arg0, arg1, arg2);
        } else if (arg0 < 4300) {
            return method269(arg0, arg1, arg2);
        } else if (arg0 < 5100) {
            return method2090(arg0, arg1, arg2);
        } else if (arg0 < 5400) {
            return method5699(arg0, arg1, arg2);
        } else if (arg0 < 5600) {
            return method1860(arg0, arg1, arg2);
        } else if (arg0 < 5700) {
            return method2341(arg0, arg1, arg2);
        } else if (arg0 < 6300) {
            return method5201(arg0, arg1, arg2);
        } else if (arg0 < 6600) {
            return method5409(arg0, arg1, arg2);
        } else if (arg0 < 6700) {
            return method6414(arg0, arg1, arg2);
        } else if (arg0 < 6800) {
            return method5606(arg0, arg1, arg2);
        } else if (arg0 < 6900) {
            return method3139(arg0, arg1, arg2);
        } else if (arg0 < 7000) {
            return method2590(arg0, arg1, arg2);
        } else if (arg0 < 7100) {
            return method3910(arg0, arg1, arg2);
        } else if (arg0 < 7200) {
            return method256(arg0, arg1, arg2);
        } else if (arg0 < 7300) {
            return method643(arg0, arg1, arg2);
        } else if (arg0 < 7500) {
            return method7713(arg0, arg1, arg2);
        } else if (arg0 < 7600) {
            return method2119(arg0, arg1, arg2);
        } else if (arg0 < 7700) {
            return method2996(arg0, arg1, arg2);
        } else if (arg0 < 8100) {
            return method11(arg0, arg1, arg2);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dy.ah(ILds;ZS)I")
    public static int method2456(int arg0, class81 arg1, boolean arg2) {
        int var3 = -1;
        class347 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field875[--Statics.field876];
            var4 = Statics.field185.method5639(var3);
        } else {
            var4 = arg2 ? Statics.field4562 : Statics.field3132;
        }
        if (arg0 == 1000) {
            Statics.field876 -= 4;
            var4.field3686 = field875[Statics.field876];
            var4.field3687 = field875[Statics.field876 + 1];
            var4.field3803 = field875[Statics.field876 + 2];
            var4.field3683 = field875[Statics.field876 + 3];
            client.method2979(var4);
            Statics.field1743.method1198(var4);
            if (var3 != -1 && var4.field3679 == 0) {
                client.method2301(Statics.field185.field3588[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1001) {
            Statics.field876 -= 4;
            var4.field3688 = field875[Statics.field876];
            var4.field3689 = field875[Statics.field876 + 1];
            var4.field3684 = field875[Statics.field876 + 2];
            var4.field3775 = field875[Statics.field876 + 3];
            client.method2979(var4);
            Statics.field1743.method1198(var4);
            if (var3 != -1 && var4.field3679 == 0) {
                client.method2301(Statics.field185.field3588[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1003) {
            boolean var5 = field875[--Statics.field876] == 1;
            if (var4.field3697 != var5) {
                var4.field3697 = var5;
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1005) {
            var4.field3825 = field875[--Statics.field876] == 1;
            return 1;
        } else if (arg0 == 1006) {
            var4.field3704 = field875[--Statics.field876] == 1;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("au.ar(ILds;ZI)I")
    public static int method258(int arg0, class81 arg1, boolean arg2) {
        int var3 = -1;
        class347 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = field875[--Statics.field876];
            var4 = Statics.field185.method5639(var3);
        } else {
            var4 = arg2 ? Statics.field4562 : Statics.field3132;
        }
        if (arg0 == 1100) {
            Statics.field876 -= 2;
            int var5 = field875[Statics.field876];
            int var6 = field875[Statics.field876 + 1];
            if (var4.field3679 == 12) {
                class345 var7 = var4.method6013();
                if (var7 != null && var7.method5712(var5, var6)) {
                    client.method2979(var4);
                }
            } else {
                var4.field3713 = var5;
                if (var4.field3713 > var4.field3744 - var4.field3692) {
                    var4.field3713 = var4.field3744 - var4.field3692;
                }
                if (var4.field3713 < 0) {
                    var4.field3713 = 0;
                }
                var4.field3699 = var6;
                if (var4.field3699 > var4.field3776 - var4.field3693) {
                    var4.field3699 = var4.field3776 - var4.field3693;
                }
                if (var4.field3699 < 0) {
                    var4.field3699 = 0;
                }
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1101) {
            var4.field3702 = field875[--Statics.field876];
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1102) {
            var4.field3706 = field875[--Statics.field876] == 1;
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1103) {
            var4.field3708 = field875[--Statics.field876];
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1104) {
            var4.field3716 = field875[--Statics.field876];
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1105) {
            var4.field3809 = field875[--Statics.field876];
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1106) {
            var4.field3715 = field875[--Statics.field876];
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1107) {
            var4.field3819 = field875[--Statics.field876] == 1;
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1108) {
            var4.field3721 = 1;
            var4.field3672 = field875[--Statics.field876];
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1109) {
            Statics.field876 -= 6;
            var4.field3731 = field875[Statics.field876];
            var4.field3728 = field875[Statics.field876 + 1];
            var4.field3729 = field875[Statics.field876 + 2];
            var4.field3674 = field875[Statics.field876 + 3];
            var4.field3765 = field875[Statics.field876 + 4];
            var4.field3723 = field875[Statics.field876 + 5];
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1110) {
            int var8 = field875[--Statics.field876];
            if (var4.field3764 != var8) {
                var4.field3764 = var8;
                var4.field3813 = 0;
                var4.field3814 = 0;
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1111) {
            var4.field3736 = field875[--Statics.field876] == 1;
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1112) {
            String var9 = field886[--Statics.field1867];
            if (!var9.equals(var4.field3740)) {
                if (var4.field3679 == 12) {
                    class345 var10 = var4.method6013();
                    if (var10 != null && var10.method5759()) {
                        var10.method5705(var9);
                    } else {
                        var4.field3740 = var9;
                    }
                } else {
                    var4.field3740 = var9;
                }
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1113) {
            var4.field3739 = field875[--Statics.field876];
            if (var4.field3679 == 12) {
                class345 var11 = var4.method6013();
                if (var11 != null) {
                    var11.method5885();
                }
            }
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1114) {
            Statics.field876 -= 3;
            if (var4.field3679 == 12) {
                class345 var12 = var4.method6013();
                if (var12 != null) {
                    var12.method5936(field875[Statics.field876], field875[Statics.field876 + 1]);
                    var12.method5714(field875[Statics.field876 + 2]);
                }
            } else {
                var4.field3755 = field875[Statics.field876];
                var4.field3685 = field875[Statics.field876 + 1];
                var4.field3742 = field875[Statics.field876 + 2];
            }
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1115) {
            var4.field3745 = field875[--Statics.field876] == 1;
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1116) {
            var4.field3762 = field875[--Statics.field876];
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1117) {
            var4.field3761 = field875[--Statics.field876];
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1118) {
            var4.field3758 = field875[--Statics.field876] == 1;
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1119) {
            var4.field3720 = field875[--Statics.field876] == 1;
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1120) {
            Statics.field876 -= 2;
            var4.field3744 = field875[Statics.field876];
            var4.field3776 = field875[Statics.field876 + 1];
            client.method2979(var4);
            if (var3 != -1 && var4.field3679 == 0) {
                client.method2301(Statics.field185.field3588[var3 >> 16], var4, false);
            }
            return 1;
        } else if (arg0 == 1121) {
            client.method3231(var4.field3676, var4.field3757);
            client.field624 = var4;
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1122) {
            var4.field3724 = field875[--Statics.field876];
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1123) {
            var4.field3703 = field875[--Statics.field876];
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1124) {
            var4.field3749 = field875[--Statics.field876];
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1125) {
            int var13 = field875[--Statics.field876];
            class542 var14 = (class542) class388.method3894(class542.method7712(), var13);
            if (var14 != null) {
                var4.field3707 = var14;
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1126) {
            boolean var15 = field875[--Statics.field876] == 1;
            var4.field3701 = var15;
            return 1;
        } else if (arg0 == 1127) {
            boolean var16 = field875[--Statics.field876] == 1;
            var4.field3737 = var16;
            return 1;
        } else if (arg0 == 1129) {
            var4.field3714 = field886[--Statics.field1867];
            client.method2979(var4);
            return 1;
        } else if (arg0 == 1130) {
            var4.method6091(field886[--Statics.field1867], Statics.field3089, client.method5299());
            return 1;
        } else if (arg0 == 1131) {
            Statics.field876 -= 2;
            var4.method6000(field875[Statics.field876], field875[Statics.field876 + 1]);
            return 1;
        } else if (arg0 == 1132) {
            var4.method6001(field886[--Statics.field1867], field875[--Statics.field876]);
            return 1;
        } else if (arg0 == 1133) {
            Statics.field876--;
            class340 var17 = var4.method6014();
            if (var17 != null) {
                var17.field3592 = field875[Statics.field876];
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1134) {
            Statics.field876--;
            class340 var18 = var4.method6014();
            if (var18 != null) {
                var18.field3593 = field875[Statics.field876];
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1135) {
            Statics.field1867--;
            class345 var19 = var4.method6013();
            if (var19 != null) {
                var4.field3811 = field886[Statics.field1867];
            }
            return 1;
        } else if (arg0 == 1136) {
            Statics.field876--;
            class340 var20 = var4.method6014();
            if (var20 != null) {
                var20.field3594 = field875[Statics.field876];
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1137) {
            Statics.field876--;
            class345 var21 = var4.method6013();
            if (var21 != null && var21.method5720(field875[Statics.field876])) {
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1138) {
            Statics.field876--;
            class345 var22 = var4.method6013();
            if (var22 != null && var22.method5710(field875[Statics.field876])) {
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1139) {
            Statics.field876--;
            class345 var23 = var4.method6013();
            if (var23 != null && var23.method5811(field875[Statics.field876])) {
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1140) {
            boolean var24 = field875[--Statics.field876] == 1;
            client.field757.method3902();
            class345 var25 = var4.method6013();
            if (var25 != null && var25.method5703(var24)) {
                if (var24) {
                    client.field757.method3899(var4);
                }
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1141) {
            boolean var26 = field875[--Statics.field876] == 1;
            if (!var26 && client.field757.method3900() == var4) {
                client.field757.method3902();
                client.method2979(var4);
            }
            class345 var27 = var4.method6013();
            if (var27 != null) {
                var27.method5704(var26);
            }
            return 1;
        } else if (arg0 == 1142) {
            Statics.field876 -= 2;
            class345 var28 = var4.method6013();
            if (var28 != null && var28.method5713(field875[Statics.field876], field875[Statics.field876 + 1])) {
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1143) {
            Statics.field876--;
            class345 var29 = var4.method6013();
            if (var29 != null && var29.method5713(field875[Statics.field876], field875[Statics.field876])) {
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1144) {
            Statics.field876--;
            class345 var30 = var4.method6013();
            if (var30 != null) {
                var30.method5716(field875[Statics.field876]);
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1145) {
            Statics.field876--;
            class345 var31 = var4.method6013();
            if (var31 != null) {
                var31.method5715(field875[Statics.field876]);
            }
            return 1;
        } else if (arg0 == 1146) {
            Statics.field876--;
            class345 var32 = var4.method6013();
            if (var32 != null) {
                var32.method5718(field875[Statics.field876]);
            }
            return 1;
        } else if (arg0 == 1147) {
            Statics.field876--;
            class345 var33 = var4.method6013();
            if (var33 != null) {
                var33.method5717(field875[Statics.field876]);
                client.method2979(var4);
            }
            return 1;
        } else if (arg0 == 1148) {
            Statics.field876 -= 2;
            class28 var34 = var4.method5990();
            if (var34 != null) {
                var34.method363(field875[Statics.field876], field875[Statics.field876 + 1]);
            }
            return 1;
        } else if (arg0 == 1149) {
            Statics.field876 -= 2;
            class28 var35 = var4.method5990();
            if (var35 != null) {
                var35.method364((char) field875[Statics.field876], field875[Statics.field876 + 1]);
            }
            return 1;
        } else if (arg0 == 1150) {
            var4.method6075(field886[--Statics.field1867], Statics.field3089);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cl.ab(ILds;ZB)I")
    public static int method2030(int arg0, class81 arg1, boolean arg2) {
        class347 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field185.method5639(field875[--Statics.field876]);
        } else {
            var3 = arg2 ? Statics.field4562 : Statics.field3132;
        }
        client.method2979(var3);
        if (arg0 == 1200 || arg0 == 1205 || arg0 == 1212) {
            Statics.field876 -= 2;
            int var9 = field875[Statics.field876];
            int var10 = field875[Statics.field876 + 1];
            var3.field3756 = var9;
            var3.field3812 = var10;
            class221 var11 = class221.method3594(var9);
            var3.field3729 = var11.field2274;
            var3.field3674 = var11.field2243;
            var3.field3765 = var11.field2259;
            var3.field3731 = var11.field2260;
            var3.field3728 = var11.field2282;
            var3.field3723 = var11.field2270;
            if (arg0 == 1205) {
                var3.field3738 = 0;
            } else if (arg0 == 1212 | var11.field2262 == 1) {
                var3.field3738 = 1;
            } else {
                var3.field3738 = 2;
            }
            if (var3.field3733 > 0) {
                var3.field3723 = var3.field3723 * 32 / var3.field3733;
            } else if (var3.field3688 > 0) {
                var3.field3723 = var3.field3723 * 32 / var3.field3688;
            }
            return 1;
        } else if (arg0 == 1201) {
            var3.field3721 = 2;
            var3.field3672 = field875[--Statics.field876];
            return 1;
        } else if (arg0 == 1202) {
            var3.field3721 = 3;
            var3.field3672 = Statics.field2696.field1120.method5680();
            return 1;
        } else if (arg0 == 1207) {
            boolean var4 = field875[--Statics.field876] == 1;
            class347.method6193(var3, Statics.field2696.field1120, var4);
            return 1;
        } else if (arg0 == 1208) {
            int var5 = field875[--Statics.field876];
            if (var3.field3735 == null) {
                throw new RuntimeException("");
            }
            class347.method5311(var3, var5);
            return 1;
        } else if (arg0 == 1209) {
            Statics.field876 -= 2;
            int var6 = field875[Statics.field876];
            int var7 = field875[Statics.field876 + 1];
            if (var3.field3735 == null) {
                throw new RuntimeException("");
            }
            class347.method2740(var3, var6, var7);
            return 1;
        } else if (arg0 == 1210) {
            int var8 = field875[--Statics.field876];
            if (var3.field3735 == null) {
                throw new RuntimeException("");
            }
            class347.method2711(var3, Statics.field2696.field1120.field3612, var8);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ao.am(ILds;ZI)I")
    public static int method14(int arg0, class81 arg1, boolean arg2) {
        boolean var3 = true;
        class347 var4;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var4 = Statics.field185.method5639(field875[--Statics.field876]);
            var3 = false;
        } else {
            var4 = arg2 ? Statics.field4562 : Statics.field3132;
        }
        if (arg0 == 1300) {
            int var5 = field875[--Statics.field876] - 1;
            if (var5 >= 0 && var5 <= 9) {
                var4.method5994(var5, field886[--Statics.field1867]);
                return 1;
            } else {
                Statics.field1867--;
                return 1;
            }
        } else if (arg0 == 1301) {
            Statics.field876 -= 2;
            int var6 = field875[Statics.field876];
            int var7 = field875[Statics.field876 + 1];
            var4.field3719 = Statics.field185.method5640(var6, var7);
            return 1;
        } else if (arg0 == 1302) {
            var4.field3763 = field875[--Statics.field876] == 1;
            return 1;
        } else if (arg0 == 1303) {
            var4.field3760 = field875[--Statics.field876];
            return 1;
        } else if (arg0 == 1304) {
            var4.field3712 = field875[--Statics.field876];
            return 1;
        } else if (arg0 == 1305) {
            var4.field3717 = field886[--Statics.field1867];
            return 1;
        } else if (arg0 == 1306) {
            var4.field3772 = field886[--Statics.field1867];
            return 1;
        } else if (arg0 == 1307) {
            var4.field3759 = null;
            return 1;
        } else if (arg0 == 1308) {
            var4.field3827 = field875[--Statics.field876] == 1;
            return 1;
        } else if (arg0 == 1309) {
            Statics.field876--;
            return 1;
        } else if (arg0 == 1350) {
            byte[] var8 = null;
            byte[] var9 = null;
            if (var3) {
                Statics.field876 -= 10;
                int var10;
                for (var10 = 0; var10 < 10 && field875[Statics.field876 + var10] >= 0; var10 += 2) {
                }
                if (var10 > 0) {
                    var8 = new byte[var10 / 2];
                    var9 = new byte[var10 / 2];
                    for (var10 -= 2; var10 >= 0; var10 -= 2) {
                        var8[var10 / 2] = (byte) field875[Statics.field876 + var10];
                        var9[var10 / 2] = (byte) field875[Statics.field876 + var10 + 1];
                    }
                }
            } else {
                Statics.field876 -= 2;
                var8 = new byte[] { (byte) field875[Statics.field876] };
                var9 = new byte[] { (byte) field875[Statics.field876 + 1] };
            }
            int var11 = field875[--Statics.field876] - 1;
            if (var11 < 0 || var11 > 9) {
                throw new RuntimeException();
            }
            method2214(var4, var11, var8, var9);
            return 1;
        } else if (arg0 == 1351) {
            Statics.field876 -= 2;
            byte var12 = 10;
            byte[] var13 = new byte[] { (byte) field875[Statics.field876] };
            byte[] var14 = new byte[] { (byte) field875[Statics.field876 + 1] };
            method2214(var4, var12, var13, var14);
            return 1;
        } else if (arg0 == 1352) {
            Statics.field876 -= 3;
            int var15 = field875[Statics.field876] - 1;
            int var16 = field875[Statics.field876 + 1];
            int var17 = field875[Statics.field876 + 2];
            if (var15 < 0 || var15 > 9) {
                throw new RuntimeException();
            }
            method1122(var4, var15, var16, var17);
            return 1;
        } else if (arg0 == 1353) {
            byte var18 = 10;
            int var19 = field875[--Statics.field876];
            int var20 = field875[--Statics.field876];
            method1122(var4, var18, var19, var20);
            return 1;
        } else if (arg0 == 1354) {
            Statics.field876--;
            int var21 = field875[Statics.field876] - 1;
            if (var21 < 0 || var21 > 9) {
                throw new RuntimeException();
            }
            method262(var4, var21);
            return 1;
        } else if (arg0 == 1355) {
            byte var22 = 10;
            method262(var4, var22);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("de.av(Lnm;I[B[BI)V")
    public static final void method2214(class347 arg0, int arg1, byte[] arg2, byte[] arg3) {
        if (arg0.field3753 == null) {
            if (arg2 == null) {
                return;
            }
            arg0.field3753 = new byte[11][];
            arg0.field3780 = new byte[11][];
            arg0.field3771 = new int[11];
            arg0.field3801 = new int[11];
        }
        arg0.field3753[arg1] = arg2;
        if (arg2 == null) {
            arg0.field3752 = false;
            for (int var4 = 0; var4 < arg0.field3753.length; var4++) {
                if (arg0.field3753[var4] != null) {
                    arg0.field3752 = true;
                    break;
                }
            }
        } else {
            arg0.field3752 = true;
        }
        arg0.field3780[arg1] = arg3;
    }

    @ObfuscatedName("cn.ag(Lnm;IIII)V")
    public static final void method1122(class347 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3771 == null) {
            throw new RuntimeException();
        }
        arg0.field3771[arg1] = arg2;
        arg0.field3801[arg1] = arg3;
    }

    @ObfuscatedName("ai.aa(Lnm;II)V")
    public static final void method262(class347 arg0, int arg1) {
        if (arg0.field3753 == null) {
            throw new RuntimeException();
        }
        if (arg0.field3690 == null) {
            arg0.field3690 = new int[arg0.field3753.length];
        }
        arg0.field3690[arg1] = Integer.MAX_VALUE;
    }

    @ObfuscatedName("bv.ap(ILds;ZB)I")
    public static int method449(int arg0, class81 arg1, boolean arg2) {
        class347 var3;
        if (arg0 >= 2000) {
            arg0 -= 1000;
            var3 = Statics.field185.method5639(field875[--Statics.field876]);
        } else {
            var3 = arg2 ? Statics.field4562 : Statics.field3132;
        }
        String var4 = field886[--Statics.field1867];
        int[] var5 = null;
        if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
            int var6 = field875[--Statics.field876];
            if (var6 > 0) {
                var5 = new int[var6];
                while (var6-- > 0) {
                    var5[var6] = field875[--Statics.field876];
                }
            }
            var4 = var4.substring(0, var4.length() - 1);
        }
        Object[] var7 = new Object[var4.length() + 1];
        for (int var8 = var7.length - 1; var8 >= 1; var8--) {
            if (var4.charAt(var8 - 1) == 's') {
                var7[var8] = field886[--Statics.field1867];
            } else {
                var7[var8] = Integer.valueOf(field875[--Statics.field876]);
            }
        }
        int var9 = field875[--Statics.field876];
        if (var9 == -1) {
            var7 = null;
        } else {
            var7[0] = Integer.valueOf(var9);
        }
        if (arg0 == 1400) {
            var3.field3782 = var7;
        } else if (arg0 == 1401) {
            var3.field3770 = var7;
        } else if (arg0 == 1402) {
            var3.field3769 = var7;
        } else if (arg0 == 1403) {
            var3.field3725 = var7;
        } else if (arg0 == 1404) {
            var3.field3773 = var7;
        } else if (arg0 == 1405) {
            var3.field3774 = var7;
        } else if (arg0 == 1406) {
            var3.field3777 = var7;
        } else if (arg0 == 1407) {
            var3.field3778 = var7;
            var3.field3779 = var5;
        } else if (arg0 == 1408) {
            var3.field3784 = var7;
        } else if (arg0 == 1409) {
            var3.field3785 = var7;
        } else if (arg0 == 1410) {
            var3.field3710 = var7;
        } else if (arg0 == 1411) {
            var3.field3768 = var7;
        } else if (arg0 == 1412) {
            var3.field3767 = var7;
        } else if (arg0 == 1414) {
            var3.field3722 = var7;
            var3.field3781 = var5;
        } else if (arg0 == 1415) {
            var3.field3754 = var7;
            var3.field3783 = var5;
        } else if (arg0 == 1416) {
            var3.field3743 = var7;
        } else if (arg0 == 1417) {
            var3.field3700 = var7;
        } else if (arg0 == 1418) {
            var3.field3788 = var7;
        } else if (arg0 == 1419) {
            var3.field3789 = var7;
        } else if (arg0 == 1420) {
            var3.field3826 = var7;
        } else if (arg0 == 1421) {
            var3.field3793 = var7;
        } else if (arg0 == 1422) {
            var3.field3796 = var7;
        } else if (arg0 == 1423) {
            var3.field3797 = var7;
        } else if (arg0 == 1424) {
            var3.field3718 = var7;
        } else if (arg0 == 1425) {
            var3.field3800 = var7;
        } else if (arg0 == 1426) {
            var3.field3709 = var7;
        } else if (arg0 == 1427) {
            var3.field3799 = var7;
        } else if (arg0 == 1428) {
            var3.field3794 = var7;
        } else if (arg0 == 1429) {
            var3.field3795 = var7;
        } else if (arg0 == 1430) {
            var3.field3790 = var7;
        } else if (arg0 == 1431) {
            var3.field3791 = var7;
        } else if (arg0 == 1434) {
            var3.field3802 = var7;
        } else if (arg0 == 1435) {
            var3.field3786 = var7;
        } else if (arg0 >= 1436 && arg0 <= 1439) {
            class343 var10 = var3.method6016();
            if (var10 != null) {
                if (arg0 == 1436) {
                    var10.field3609 = var7;
                } else if (arg0 == 1437) {
                    var10.field3610 = var7;
                } else if (arg0 == 1438) {
                    var10.field3611 = var7;
                } else if (arg0 == 1439) {
                    var10.field3608 = var7;
                }
            }
        } else {
            return 2;
        }
        var3.field3741 = true;
        return 1;
    }

    @ObfuscatedName("df.ay(ILds;ZI)I")
    public static int method2210(int arg0, class81 arg1, boolean arg2) {
        class347 var3 = arg2 ? Statics.field4562 : Statics.field3132;
        if (arg0 == 1500) {
            field875[++Statics.field876 - 1] = var3.field3670;
            return 1;
        } else if (arg0 == 1501) {
            field875[++Statics.field876 - 1] = var3.field3691;
            return 1;
        } else if (arg0 == 1502) {
            field875[++Statics.field876 - 1] = var3.field3692;
            return 1;
        } else if (arg0 == 1503) {
            field875[++Statics.field876 - 1] = var3.field3693;
            return 1;
        } else if (arg0 == 1504) {
            field875[++Statics.field876 - 1] = var3.field3697 ? 1 : 0;
            return 1;
        } else if (arg0 == 1505) {
            field875[++Statics.field876 - 1] = var3.field3696;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fl.as(ILds;ZI)I")
    public static int method2917(int arg0, class81 arg1, boolean arg2) {
        class347 var3 = arg2 ? Statics.field4562 : Statics.field3132;
        if (arg0 == 1600) {
            field875[++Statics.field876 - 1] = var3.field3713;
            return 1;
        } else if (arg0 == 1601) {
            field875[++Statics.field876 - 1] = var3.field3699;
            return 1;
        } else if (arg0 == 1602) {
            if (var3.field3679 == 12) {
                class345 var4 = var3.method6013();
                if (var4 != null) {
                    field886[++Statics.field1867 - 1] = var4.method5931().method6802();
                    return 1;
                }
            }
            field886[++Statics.field1867 - 1] = var3.field3740;
            return 1;
        } else if (arg0 == 1603) {
            field875[++Statics.field876 - 1] = var3.field3744;
            return 1;
        } else if (arg0 == 1604) {
            field875[++Statics.field876 - 1] = var3.field3776;
            return 1;
        } else if (arg0 == 1605) {
            field875[++Statics.field876 - 1] = var3.field3723;
            return 1;
        } else if (arg0 == 1606) {
            field875[++Statics.field876 - 1] = var3.field3729;
            return 1;
        } else if (arg0 == 1607) {
            field875[++Statics.field876 - 1] = var3.field3765;
            return 1;
        } else if (arg0 == 1608) {
            field875[++Statics.field876 - 1] = var3.field3674;
            return 1;
        } else if (arg0 == 1609) {
            field875[++Statics.field876 - 1] = var3.field3708;
            return 1;
        } else if (arg0 == 1610) {
            field875[++Statics.field876 - 1] = var3.field3749;
            return 1;
        } else if (arg0 == 1611) {
            field875[++Statics.field876 - 1] = var3.field3702;
            return 1;
        } else if (arg0 == 1612) {
            field875[++Statics.field876 - 1] = var3.field3703;
            return 1;
        } else if (arg0 == 1613) {
            field875[++Statics.field876 - 1] = var3.field3707.method38();
            return 1;
        } else if (arg0 == 1614) {
            field875[++Statics.field876 - 1] = var3.field3737 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 1617) {
                class340 var5 = var3.method6014();
                field875[++Statics.field876 - 1] = var5 == null ? 0 : var5.field3592;
            }
            if (arg0 == 1618) {
                class340 var6 = var3.method6014();
                field875[++Statics.field876 - 1] = var6 == null ? 0 : var6.field3593;
                return 1;
            } else if (arg0 == 1619) {
                class345 var7 = var3.method6013();
                field886[++Statics.field1867 - 1] = var7 == null ? "" : var7.method5752().method6802();
                return 1;
            } else if (arg0 == 1620) {
                class340 var8 = var3.method6014();
                field875[++Statics.field876 - 1] = var8 == null ? 0 : var8.field3594;
                return 1;
            } else if (arg0 == 1621) {
                class345 var9 = var3.method6013();
                field875[++Statics.field876 - 1] = var9 == null ? 0 : var9.method5922();
                return 1;
            } else if (arg0 == 1622) {
                class345 var10 = var3.method6013();
                field875[++Statics.field876 - 1] = var10 == null ? 0 : var10.method5763();
                return 1;
            } else if (arg0 == 1623) {
                class345 var11 = var3.method6013();
                field875[++Statics.field876 - 1] = var11 == null ? 0 : var11.method5764();
                return 1;
            } else if (arg0 == 1624) {
                class345 var12 = var3.method6013();
                field875[++Statics.field876 - 1] = var12 != null && var12.method5754() ? 1 : 0;
                return 1;
            } else if (arg0 == 1625) {
                class345 var13 = var3.method6013();
                field875[++Statics.field876 - 1] = var13 != null && var13.method5755() ? 1 : 0;
                return 1;
            } else if (arg0 == 1626) {
                class345 var14 = var3.method6013();
                field886[++Statics.field1867 - 1] = var14 == null ? "" : var14.method5753().method7047();
                return 1;
            } else if (arg0 == 1627) {
                class345 var15 = var3.method6013();
                int var16 = var15 == null ? 0 : var15.method5758();
                int var17 = var15 == null ? 0 : var15.method5757();
                field875[++Statics.field876 - 1] = Math.min(var16, var17);
                field875[++Statics.field876 - 1] = Math.max(var16, var17);
                return 1;
            } else if (arg0 == 1628) {
                class345 var18 = var3.method6013();
                field875[++Statics.field876 - 1] = var18 == null ? 0 : var18.method5757();
                return 1;
            } else if (arg0 == 1629) {
                class345 var19 = var3.method6013();
                field875[++Statics.field876 - 1] = var19 == null ? 0 : var19.method5766();
                return 1;
            } else if (arg0 == 1630) {
                class345 var20 = var3.method6013();
                field875[++Statics.field876 - 1] = var20 == null ? 0 : var20.method5701();
                return 1;
            } else if (arg0 == 1631) {
                class345 var21 = var3.method6013();
                field875[++Statics.field876 - 1] = var21 == null ? 0 : var21.method5767();
                return 1;
            } else if (arg0 == 1632) {
                class345 var22 = var3.method6013();
                field875[++Statics.field876 - 1] = var22 == null ? 0 : var22.method5771();
                return 1;
            } else if (arg0 == 1633) {
                class28 var23 = var3.method5990();
                field875[Statics.field876 - 1] = var23 == null ? 0 : var23.method365(field875[Statics.field876 - 1]);
                return 1;
            } else if (arg0 == 1634) {
                class28 var24 = var3.method5990();
                field875[Statics.field876 - 1] = var24 == null ? 0 : var24.method402((char) field875[Statics.field876 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("hx.aj(ILds;ZI)I")
    public static int method3461(int arg0, class81 arg1, boolean arg2) {
        class347 var3 = arg2 ? Statics.field4562 : Statics.field3132;
        if (arg0 == 1700) {
            field875[++Statics.field876 - 1] = var3.field3756;
            return 1;
        } else if (arg0 == 1701) {
            if (var3.field3756 == -1) {
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = var3.field3812;
            }
            return 1;
        } else if (arg0 == 1702) {
            field875[++Statics.field876 - 1] = var3.field3757;
            return 1;
        } else if (arg0 == 1707) {
            field875[++Statics.field876 - 1] = var3.method6003() ? 1 : 0;
            return 1;
        } else if (arg0 == 1708) {
            return method2621(var3);
        } else if (arg0 == 1709) {
            return method311(var3);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ex.an(Lnm;I)I")
    public static int method2621(class347 arg0) {
        if (arg0.field3679 == 11) {
            String var1 = field886[--Statics.field1867];
            field875[++Statics.field876 - 1] = arg0.method6040(var1);
            return 1;
        } else {
            Statics.field1867--;
            field875[++Statics.field876 - 1] = -1;
            return 1;
        }
    }

    @ObfuscatedName("at.au(Lnm;I)I")
    public static int method311(class347 arg0) {
        if (arg0.field3679 == 11) {
            String var1 = field886[--Statics.field1867];
            field886[++Statics.field1867 - 1] = arg0.method6005(var1);
            return 1;
        } else {
            field886[Statics.field1867 - 1] = "";
            return 1;
        }
    }

    @ObfuscatedName("ay.ai(ILds;ZB)I")
    public static int method162(int arg0, class81 arg1, boolean arg2) {
        class347 var3 = arg2 ? Statics.field4562 : Statics.field3132;
        if (arg0 == 1800) {
            field875[++Statics.field876 - 1] = Statics.method3398(client.method2234(var3));
            return 1;
        } else if (arg0 == 1801) {
            int var4 = field875[--Statics.field876];
            int var5 = var4 - 1;
            if (var3.field3759 == null || var5 >= var3.field3759.length || var3.field3759[var5] == null) {
                field886[++Statics.field1867 - 1] = "";
            } else {
                field886[++Statics.field1867 - 1] = var3.field3759[var5];
            }
            return 1;
        } else if (arg0 == 1802) {
            if (var3.field3717 == null) {
                field886[++Statics.field1867 - 1] = "";
            } else {
                field886[++Statics.field1867 - 1] = var3.field3717;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("aw.ae(ILds;ZI)I")
    public static int method290(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 1927 || arg0 == 2927) {
            if (field879 >= 10) {
                throw new RuntimeException();
            }
            class347 var10;
            if (arg0 >= 2000) {
                var10 = Statics.field185.method5639(field875[--Statics.field876]);
            } else {
                var10 = arg2 ? Statics.field4562 : Statics.field3132;
            }
            if (var10.field3799 == null) {
                return 0;
            }
            class90 var11 = new class90();
            var11.field1088 = var10;
            var11.field1087 = var10.field3799;
            var11.field1079 = field879 + 1;
            client.field707.method6526(var11);
            return 1;
        } else if (arg0 == 1928) {
            class347 var3 = arg2 ? Statics.field4562 : Statics.field3132;
            int var4 = field875[--Statics.field876];
            if (var4 < 1 || var4 > 10) {
                throw new RuntimeException();
            }
            class105 var5 = new class105(var4, var3.field3676, var3.field3757, var3.field3756);
            field887.add(var5);
            return 1;
        } else if (arg0 == 2928) {
            Statics.field876 -= 3;
            int var6 = field875[Statics.field876];
            int var7 = field875[Statics.field876 + 1];
            int var8 = field875[Statics.field876 + 2];
            if (var8 < 1 || var8 > 10) {
                throw new RuntimeException();
            }
            class105 var9 = new class105(var8, var6, var7, Statics.field185.method5639(var6).field3756);
            field887.add(var9);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("be.aw(ILds;ZI)I")
    public static int method438(int arg0, class81 arg1, boolean arg2) {
        class347 var3 = Statics.field185.method5639(field875[--Statics.field876]);
        if (arg0 == 2500) {
            field875[++Statics.field876 - 1] = var3.field3670;
            return 1;
        } else if (arg0 == 2501) {
            field875[++Statics.field876 - 1] = var3.field3691;
            return 1;
        } else if (arg0 == 2502) {
            field875[++Statics.field876 - 1] = var3.field3692;
            return 1;
        } else if (arg0 == 2503) {
            field875[++Statics.field876 - 1] = var3.field3693;
            return 1;
        } else if (arg0 == 2504) {
            field875[++Statics.field876 - 1] = var3.field3697 ? 1 : 0;
            return 1;
        } else if (arg0 == 2505) {
            field875[++Statics.field876 - 1] = var3.field3696;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("az.aq(ILds;ZB)I")
    public static int method298(int arg0, class81 arg1, boolean arg2) {
        class347 var3 = Statics.field185.method5639(field875[--Statics.field876]);
        if (arg0 == 2600) {
            field875[++Statics.field876 - 1] = var3.field3713;
            return 1;
        } else if (arg0 == 2601) {
            field875[++Statics.field876 - 1] = var3.field3699;
            return 1;
        } else if (arg0 == 2602) {
            field886[++Statics.field1867 - 1] = var3.field3740;
            return 1;
        } else if (arg0 == 2603) {
            field875[++Statics.field876 - 1] = var3.field3744;
            return 1;
        } else if (arg0 == 2604) {
            field875[++Statics.field876 - 1] = var3.field3776;
            return 1;
        } else if (arg0 == 2605) {
            field875[++Statics.field876 - 1] = var3.field3723;
            return 1;
        } else if (arg0 == 2606) {
            field875[++Statics.field876 - 1] = var3.field3729;
            return 1;
        } else if (arg0 == 2607) {
            field875[++Statics.field876 - 1] = var3.field3765;
            return 1;
        } else if (arg0 == 2608) {
            field875[++Statics.field876 - 1] = var3.field3674;
            return 1;
        } else if (arg0 == 2609) {
            field875[++Statics.field876 - 1] = var3.field3708;
            return 1;
        } else if (arg0 == 2610) {
            field875[++Statics.field876 - 1] = var3.field3749;
            return 1;
        } else if (arg0 == 2611) {
            field875[++Statics.field876 - 1] = var3.field3702;
            return 1;
        } else if (arg0 == 2612) {
            field875[++Statics.field876 - 1] = var3.field3703;
            return 1;
        } else if (arg0 == 2613) {
            field875[++Statics.field876 - 1] = var3.field3707.method38();
            return 1;
        } else if (arg0 == 2614) {
            field875[++Statics.field876 - 1] = var3.field3737 ? 1 : 0;
            return 1;
        } else {
            if (arg0 == 2617) {
                class340 var4 = var3.method6014();
                field875[++Statics.field876 - 1] = var4 == null ? 0 : var4.field3592;
            }
            if (arg0 == 2618) {
                class340 var5 = var3.method6014();
                field875[++Statics.field876 - 1] = var5 == null ? 0 : var5.field3593;
                return 1;
            } else if (arg0 == 2619) {
                class345 var6 = var3.method6013();
                field886[++Statics.field1867 - 1] = var6 == null ? "" : var6.method5752().method6802();
                return 1;
            } else if (arg0 == 2620) {
                class340 var7 = var3.method6014();
                field875[++Statics.field876 - 1] = var7 == null ? 0 : var7.field3594;
                return 1;
            } else if (arg0 == 2621) {
                class345 var8 = var3.method6013();
                field875[++Statics.field876 - 1] = var8 == null ? 0 : var8.method5922();
                return 1;
            } else if (arg0 == 2622) {
                class345 var9 = var3.method6013();
                field875[++Statics.field876 - 1] = var9 == null ? 0 : var9.method5763();
                return 1;
            } else if (arg0 == 2623) {
                class345 var10 = var3.method6013();
                field875[++Statics.field876 - 1] = var10 == null ? 0 : var10.method5764();
                return 1;
            } else if (arg0 == 2624) {
                class345 var11 = var3.method6013();
                field875[++Statics.field876 - 1] = var11 != null && var11.method5754() ? 1 : 0;
                return 1;
            } else if (arg0 == 2625) {
                class345 var12 = var3.method6013();
                field875[++Statics.field876 - 1] = var12 != null && var12.method5755() ? 1 : 0;
                return 1;
            } else if (arg0 == 2626) {
                class345 var13 = var3.method6013();
                field886[++Statics.field1867 - 1] = var13 == null ? "" : var13.method5753().method7047();
                return 1;
            } else if (arg0 == 2627) {
                class345 var14 = var3.method6013();
                int var15 = var14 == null ? 0 : var14.method5758();
                int var16 = var14 == null ? 0 : var14.method5757();
                field875[++Statics.field876 - 1] = Math.min(var15, var16);
                field875[++Statics.field876 - 1] = Math.max(var15, var16);
                return 1;
            } else if (arg0 == 2628) {
                class345 var17 = var3.method6013();
                field875[++Statics.field876 - 1] = var17 == null ? 0 : var17.method5757();
                return 1;
            } else if (arg0 == 2629) {
                class345 var18 = var3.method6013();
                field875[++Statics.field876 - 1] = var18 == null ? 0 : var18.method5766();
                return 1;
            } else if (arg0 == 2630) {
                class345 var19 = var3.method6013();
                field875[++Statics.field876 - 1] = var19 == null ? 0 : var19.method5701();
                return 1;
            } else if (arg0 == 2631) {
                class345 var20 = var3.method6013();
                field875[++Statics.field876 - 1] = var20 == null ? 0 : var20.method5767();
                return 1;
            } else if (arg0 == 2632) {
                class345 var21 = var3.method6013();
                field875[++Statics.field876 - 1] = var21 == null ? 0 : var21.method5771();
                return 1;
            } else if (arg0 == 2633) {
                class28 var22 = var3.method5990();
                field875[Statics.field876 - 1] = var22 == null ? 0 : var22.method365(field875[Statics.field876 - 1]);
                return 1;
            } else if (arg0 == 2634) {
                class28 var23 = var3.method5990();
                field875[Statics.field876 - 1] = var23 == null ? 0 : var23.method402((char) field875[Statics.field876 - 1]);
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("md.az(ILds;ZB)I")
    public static int method5616(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 2700) {
            class347 var3 = Statics.field185.method5639(field875[--Statics.field876]);
            field875[++Statics.field876 - 1] = var3.field3756;
            return 1;
        } else if (arg0 == 2701) {
            class347 var4 = Statics.field185.method5639(field875[--Statics.field876]);
            if (var4.field3756 == -1) {
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = var4.field3812;
            }
            return 1;
        } else if (arg0 == 2702) {
            int var5 = field875[--Statics.field876];
            class89 var6 = (class89) client.field691.method8104((long) var5);
            if (var6 == null) {
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 2706) {
            field875[++Statics.field876 - 1] = client.field797;
            return 1;
        } else if (arg0 == 2707) {
            class347 var7 = Statics.field185.method5639(field875[--Statics.field876]);
            field875[++Statics.field876 - 1] = var7.method6003() ? 1 : 0;
            return 1;
        } else if (arg0 == 2708) {
            class347 var8 = Statics.field185.method5639(field875[--Statics.field876]);
            return method2621(var8);
        } else if (arg0 == 2709) {
            class347 var9 = Statics.field185.method5639(field875[--Statics.field876]);
            return method311(var9);
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ko.af(ILds;ZB)I")
    public static int method4794(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3100) {
            String var3 = field886[--Statics.field1867];
            class113.method6942(0, "", var3);
            return 1;
        } else if (arg0 == 3101) {
            Statics.field876 -= 2;
            client.method5249(Statics.field2696, field875[Statics.field876], field875[Statics.field876 + 1]);
            return 1;
        } else if (arg0 == 3103) {
            if (!field884) {
                field883 = true;
            }
            return 1;
        } else if (arg0 == 3104) {
            String var4 = field886[--Statics.field1867];
            int var5 = 0;
            if (class402.method2596(var4)) {
                var5 = class402.method677(var4);
            }
            class311 var6 = class311.method2978(class309.field3190, client.field579.field1425);
            var6.field3250.method8351(var5);
            client.field579.method2682(var6);
            return 1;
        } else if (arg0 == 3105) {
            String var7 = field886[--Statics.field1867];
            class311 var8 = class311.method2978(class309.field3191, client.field579.field1425);
            var8.field3250.method8348(var7.length() + 1);
            var8.field3250.method8374(var7);
            client.field579.method2682(var8);
            return 1;
        } else if (arg0 == 3106) {
            String var9 = field886[--Statics.field1867];
            class311 var10 = class311.method2978(class309.field3149, client.field579.field1425);
            var10.field3250.method8348(var9.length() + 1);
            var10.field3250.method8374(var9);
            client.field579.method2682(var10);
            return 1;
        } else if (arg0 == 3107) {
            int var11 = field875[--Statics.field876];
            String var12 = field886[--Statics.field1867];
            client.method6403(var11, var12);
            return 1;
        } else if (arg0 == 3108) {
            Statics.field876 -= 3;
            int var13 = field875[Statics.field876];
            int var14 = field875[Statics.field876 + 1];
            int var15 = field875[Statics.field876 + 2];
            class347 var16 = Statics.field185.method5639(var15);
            client.method3230(var16, var13, var14);
            return 1;
        } else if (arg0 == 3109) {
            Statics.field876 -= 2;
            int var17 = field875[Statics.field876];
            int var18 = field875[Statics.field876 + 1];
            class347 var19 = arg2 ? Statics.field4562 : Statics.field3132;
            client.method3230(var19, var17, var18);
            return 1;
        } else if (arg0 == 3110) {
            Statics.field1462 = field875[--Statics.field876] == 1;
            return 1;
        } else if (arg0 == 3111) {
            field875[++Statics.field876 - 1] = Statics.field1106.method2386() ? 1 : 0;
            return 1;
        } else if (arg0 == 3112) {
            Statics.field1106.method2442(field875[--Statics.field876] == 1);
            return 1;
        } else if (arg0 == 3113) {
            String var20 = field886[--Statics.field1867];
            boolean var21 = field875[--Statics.field876] == 1;
            class32.method4708(var20, var21, false);
            return 1;
        } else if (arg0 == 3115) {
            int var22 = field875[--Statics.field876];
            class311 var23 = class311.method2978(class309.field3186, client.field579.field1425);
            var23.field3250.method8349(var22);
            client.field579.method2682(var23);
            return 1;
        } else if (arg0 == 3116) {
            int var24 = field875[--Statics.field876];
            Statics.field1867 -= 2;
            String var25 = field886[Statics.field1867];
            String var26 = field886[Statics.field1867 + 1];
            if (var25.length() > 500) {
                return 1;
            } else if (var26.length() > 500) {
                return 1;
            } else {
                class311 var27 = class311.method2978(class309.field3193, client.field579.field1425);
                var27.field3250.method8349(1 + class530.method7740(var25) + class530.method7740(var26));
                var27.field3250.method8374(var25);
                var27.field3250.method8374(var26);
                var27.field3250.method8396(var24);
                client.field579.method2682(var27);
                return 1;
            }
        } else if (arg0 == 3117) {
            Statics.field876--;
            return 1;
        } else if (arg0 == 3118) {
            client.field716 = field875[--Statics.field876] == 1;
            return 1;
        } else if (arg0 == 3119) {
            client.field649 = field875[--Statics.field876] == 1;
            return 1;
        } else if (arg0 == 3120) {
            if (field875[--Statics.field876] == 1) {
                client.field823 |= 0x1;
            } else {
                client.field823 &= 0xFFFFFFFE;
            }
            return 1;
        } else if (arg0 == 3121) {
            if (field875[--Statics.field876] == 1) {
                client.field823 |= 0x2;
            } else {
                client.field823 &= 0xFFFFFFFD;
            }
            return 1;
        } else if (arg0 == 3122) {
            if (field875[--Statics.field876] == 1) {
                client.field823 |= 0x4;
            } else {
                client.field823 &= 0xFFFFFFFB;
            }
            return 1;
        } else if (arg0 == 3123) {
            if (field875[--Statics.field876] == 1) {
                client.field823 |= 0x8;
            } else {
                client.field823 &= 0xFFFFFFF7;
            }
            return 1;
        } else if (arg0 == 3124) {
            client.field823 = 0;
            return 1;
        } else if (arg0 == 3125) {
            client.field642 = field875[--Statics.field876] == 1;
            return 1;
        } else if (arg0 == 3126) {
            client.field814 = field875[--Statics.field876] == 1;
            return 1;
        } else if (arg0 == 3127) {
            client.method3014(field875[--Statics.field876] == 1);
            return 1;
        } else if (arg0 == 3128) {
            field875[++Statics.field876 - 1] = client.method840() ? 1 : 0;
            return 1;
        } else if (arg0 == 3129) {
            Statics.field876 -= 2;
            client.field810 = field875[Statics.field876];
            client.field617 = field875[Statics.field876 + 1];
            return 1;
        } else if (arg0 == 3130) {
            Statics.field876 -= 2;
            return 1;
        } else if (arg0 == 3131) {
            Statics.field876--;
            return 1;
        } else if (arg0 == 3132) {
            field875[++Statics.field876 - 1] = Statics.field3598;
            field875[++Statics.field876 - 1] = Statics.field4908;
            return 1;
        } else if (arg0 == 3133) {
            Statics.field876--;
            return 1;
        } else if (arg0 == 3134) {
            return 1;
        } else if (arg0 == 3135) {
            Statics.field876 -= 2;
            return 1;
        } else if (arg0 == 3136) {
            client.field692 = 3;
            client.field693 = field875[--Statics.field876];
            return 1;
        } else if (arg0 == 3137) {
            client.field692 = 2;
            client.field693 = field875[--Statics.field876];
            return 1;
        } else if (arg0 == 3138) {
            client.field692 = 0;
            return 1;
        } else if (arg0 == 3139) {
            client.field692 = 1;
            return 1;
        } else if (arg0 == 3140) {
            client.field692 = 3;
            client.field693 = arg2 ? Statics.field4562.field3676 : Statics.field3132.field3676;
            return 1;
        } else if (arg0 == 3141) {
            boolean var28 = field875[--Statics.field876] == 1;
            Statics.field1106.method2415(var28);
            return 1;
        } else if (arg0 == 3142) {
            field875[++Statics.field876 - 1] = Statics.field1106.method2388() ? 1 : 0;
            return 1;
        } else if (arg0 == 3143) {
            boolean var29 = field875[--Statics.field876] == 1;
            client.field573 = var29;
            if (!var29) {
                Statics.field1106.method2404("");
            }
            return 1;
        } else if (arg0 == 3144) {
            field875[++Statics.field876 - 1] = client.field573 ? 1 : 0;
            return 1;
        } else if (arg0 == 3145) {
            return 1;
        } else if (arg0 == 3146) {
            boolean var30 = field875[--Statics.field876] == 1;
            Statics.field1106.method2389(!var30);
            return 1;
        } else if (arg0 == 3147) {
            field875[++Statics.field876 - 1] = Statics.field1106.method2387() ? 0 : 1;
            return 1;
        } else if (arg0 == 3148) {
            return 1;
        } else if (arg0 == 3149) {
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3150) {
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3151) {
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3152) {
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3153) {
            field875[++Statics.field876 - 1] = class78.field935;
            return 1;
        } else if (arg0 == 3154) {
            field875[++Statics.field876 - 1] = client.method2930();
            return 1;
        } else if (arg0 == 3155) {
            Statics.field1867--;
            return 1;
        } else if (arg0 == 3156) {
            return 1;
        } else if (arg0 == 3157) {
            Statics.field876 -= 2;
            return 1;
        } else if (arg0 == 3158) {
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3159) {
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3160) {
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3161) {
            Statics.field876--;
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3162) {
            Statics.field876--;
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3163) {
            Statics.field1867--;
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3164) {
            Statics.field876--;
            field886[++Statics.field1867 - 1] = "";
            return 1;
        } else if (arg0 == 3165) {
            Statics.field876--;
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3166) {
            Statics.field876 -= 2;
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3167) {
            Statics.field876 -= 2;
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3168) {
            Statics.field876 -= 2;
            field886[++Statics.field1867 - 1] = "";
            field886[++Statics.field1867 - 1] = "";
            field886[++Statics.field1867 - 1] = "";
            field886[++Statics.field1867 - 1] = "";
            field886[++Statics.field1867 - 1] = "";
            field886[++Statics.field1867 - 1] = "";
            field886[++Statics.field1867 - 1] = "";
            field886[++Statics.field1867 - 1] = "";
            field886[++Statics.field1867 - 1] = "";
            return 1;
        } else if (arg0 == 3169) {
            return 1;
        } else if (arg0 == 3170) {
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3171) {
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3172) {
            Statics.field876--;
            return 1;
        } else if (arg0 == 3173) {
            Statics.field876--;
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3174) {
            Statics.field876--;
            return 1;
        } else if (arg0 == 3175) {
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 3176) {
            return 1;
        } else if (arg0 == 3177) {
            return 1;
        } else if (arg0 == 3178) {
            Statics.field1867--;
            return 1;
        } else if (arg0 == 3179) {
            return 1;
        } else if (arg0 == 3180) {
            Statics.field1867--;
            return 1;
        } else if (arg0 == 3181) {
            client.method8047(field875[--Statics.field876]);
            return 1;
        } else if (arg0 == 3182) {
            field875[++Statics.field876 - 1] = client.method4478();
            return 1;
        } else if (arg0 == 3189) {
            int var31 = field875[--Statics.field876];
            client.method7554(var31);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fs.ad(ILds;ZI)I")
    public static int method2911(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3200) {
            Statics.field876 -= 3;
            client.method7516(field875[Statics.field876], field875[Statics.field876 + 1], field875[Statics.field876 + 2]);
            return 1;
        } else if (arg0 == 3201) {
            Statics.field876 -= 5;
            int var3 = field875[Statics.field876];
            int var4 = field875[Statics.field876 + 1];
            int var5 = field875[Statics.field876 + 2];
            int var6 = field875[Statics.field876 + 3];
            int var7 = field875[Statics.field876 + 4];
            ArrayList var8 = new ArrayList();
            var8.add(var3);
            client.method3459(var8, var4, var5, var6, var7);
            return 1;
        } else if (arg0 == 3202) {
            Statics.field876 -= 2;
            client.method7224(field875[Statics.field876], field875[Statics.field876 + 1]);
            return 1;
        } else if (arg0 == 3212 || arg0 == 3213 || arg0 == 3209 || arg0 == 3181 || arg0 == 3203 || arg0 == 3205 || arg0 == 3207) {
            class93 var50 = class93.field1112;
            class92 var51 = class92.field1107;
            int var52 = field875[--Statics.field876];
            if (arg0 == 3212) {
                int var53 = field875[--Statics.field876];
                var50 = (class93) class388.method3894(class93.method2963(), var53);
                if (var50 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var53));
                }
            }
            if (arg0 == 3213) {
                int var54 = field875[--Statics.field876];
                var51 = (class92) class388.method3894(class92.method2299(), var54);
                if (var51 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var54));
                }
            }
            if (arg0 == 3209) {
                int var55 = field875[--Statics.field876];
                var50 = (class93) class388.method3894(class93.method2963(), var55);
                if (var50 == null) {
                    var51 = (class92) class388.method3894(class92.method2299(), var55);
                    if (var51 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var55));
                    }
                }
            } else if (arg0 == 3181) {
                var50 = class93.field1114;
            } else if (arg0 == 3203) {
                var51 = class92.field1101;
            } else if (arg0 == 3205) {
                var51 = class92.field1103;
            } else if (arg0 == 3207) {
                var51 = class92.field1108;
            }
            if (class92.field1107 == var51) {
                switch(var50.field1115) {
                    case 1:
                        Statics.field1106.method2415(var52 == 1);
                        break;
                    case 2:
                        Statics.field1106.method2389(var52 == 1);
                        break;
                    case 3:
                        Statics.field1106.method2457(var52 == 1);
                        break;
                    case 4:
                        if (var52 < 0) {
                            var52 = 0;
                        }
                        Statics.field1106.method2400(var52);
                        break;
                    case 5:
                        client.method8047(var52);
                        break;
                    default:
                        String var56 = String.format("Unkown device option: %s.", var50.toString());
                        throw new RuntimeException(var56);
                }
            } else {
                switch(var51.field1102) {
                    case 1:
                        Statics.field1106.method2442(var52 == 1);
                        break;
                    case 2:
                        int var62 = Math.min(Math.max(var52, 0), 100);
                        int var63 = Math.round((float) (var62 * 255) / 100.0F);
                        client.method3260(var63);
                        break;
                    case 3:
                        int var60 = Math.min(Math.max(var52, 0), 100);
                        int var61 = Math.round((float) (var60 * 127) / 100.0F);
                        client.method3831(var61);
                        break;
                    case 4:
                        int var58 = Math.min(Math.max(var52, 0), 100);
                        int var59 = Math.round((float) (var58 * 127) / 100.0F);
                        client.method3431(var59);
                        break;
                    default:
                        String var57 = String.format("Unkown game option: %s.", var51.toString());
                        throw new RuntimeException(var57);
                }
            }
            return 1;
        } else if (arg0 == 3214 || arg0 == 3215 || arg0 == 3210 || arg0 == 3182 || arg0 == 3204 || arg0 == 3206 || arg0 == 3208) {
            class93 var38 = class93.field1112;
            class92 var39 = class92.field1107;
            boolean var40 = false;
            if (arg0 == 3214) {
                int var41 = field875[--Statics.field876];
                var38 = (class93) class388.method3894(class93.method2963(), var41);
                if (var38 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var41));
                }
            }
            if (arg0 == 3215) {
                int var42 = field875[--Statics.field876];
                var39 = (class92) class388.method3894(class92.method2299(), var42);
                if (var39 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var42));
                }
            }
            if (arg0 == 3210) {
                int var43 = field875[--Statics.field876];
                var38 = (class93) class388.method3894(class93.method2963(), var43);
                if (var38 == null) {
                    var39 = (class92) class388.method3894(class92.method2299(), var43);
                    if (var39 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var43));
                    }
                }
            } else if (arg0 == 3182) {
                var38 = class93.field1114;
            } else if (arg0 == 3204) {
                var39 = class92.field1101;
            } else if (arg0 == 3206) {
                var39 = class92.field1103;
            } else if (arg0 == 3208) {
                var39 = class92.field1108;
            }
            int var45;
            if (class92.field1107 == var39) {
                switch(var38.field1115) {
                    case 1:
                        var45 = Statics.field1106.method2388() ? 1 : 0;
                        break;
                    case 2:
                        var45 = Statics.field1106.method2387() ? 1 : 0;
                        break;
                    case 3:
                        var45 = Statics.field1106.method2407() ? 1 : 0;
                        break;
                    case 4:
                        var45 = Statics.field1106.method2448();
                        break;
                    case 5:
                        var45 = client.method4478();
                        break;
                    default:
                        String var44 = String.format("Unkown device option: %s.", var38.toString());
                        throw new RuntimeException(var44);
                }
            } else {
                switch(var39.field1102) {
                    case 1:
                        var45 = Statics.field1106.method2386() ? 1 : 0;
                        break;
                    case 2:
                        int var49 = Statics.field1106.method2399();
                        var45 = Math.round((float) (var49 * 100) / 255.0F);
                        break;
                    case 3:
                        int var48 = Statics.field1106.method2401();
                        var45 = Math.round((float) (var48 * 100) / 127.0F);
                        break;
                    case 4:
                        int var47 = Statics.field1106.method2473();
                        var45 = Math.round((float) (var47 * 100) / 127.0F);
                        break;
                    default:
                        String var46 = String.format("Unkown game option: %s.", var39.toString());
                        throw new RuntimeException(var46);
                }
            }
            field875[++Statics.field876 - 1] = var45;
            return 1;
        } else if (arg0 == 3211) {
            return 1;
        } else if (arg0 == 3216) {
            int var9 = field875[--Statics.field876];
            int var10 = 0;
            class93 var11 = (class93) class388.method3894(class93.method2963(), var9);
            if (var11 != null) {
                var10 = class93.field1112 == var11 ? 0 : 1;
            }
            field875[++Statics.field876 - 1] = var10;
            return 1;
        } else if (arg0 == 3218) {
            int var12 = field875[--Statics.field876];
            int var13 = 0;
            class92 var14 = (class92) class388.method3894(class92.method2299(), var12);
            if (var14 != null) {
                var13 = class92.field1107 == var14 ? 0 : 1;
            }
            field875[++Statics.field876 - 1] = var13;
            return 1;
        } else if (arg0 == 3217 || arg0 == 3219) {
            class93 var28 = class93.field1112;
            class92 var29 = class92.field1107;
            boolean var30 = true;
            boolean var31 = true;
            if (arg0 == 3217) {
                int var32 = field875[--Statics.field876];
                var28 = (class93) class388.method3894(class93.method2963(), var32);
                if (var28 == null) {
                    throw new RuntimeException(String.format("Unrecognized device option %d", var32));
                }
            }
            if (arg0 == 3219) {
                int var33 = field875[--Statics.field876];
                var29 = (class92) class388.method3894(class92.method2299(), var33);
                if (var29 == null) {
                    throw new RuntimeException(String.format("Unrecognized game option %d", var33));
                }
            }
            byte var35;
            int var36;
            if (class92.field1107 == var29) {
                switch(var28.field1115) {
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
                switch(var29.field1102) {
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
            field875[++Statics.field876 - 1] = var35;
            field875[++Statics.field876 - 1] = var36;
            return 1;
        } else if (arg0 == 3220) {
            Statics.field876 -= 2;
            int var15 = field875[Statics.field876];
            int var16 = field875[Statics.field876 + 1];
            class320.method3819(var15, var16);
            return 1;
        } else if (arg0 == 3221) {
            Statics.field876 -= 6;
            int var17 = field875[Statics.field876];
            int var18 = field875[Statics.field876 + 1];
            int var19 = field875[Statics.field876 + 2];
            int var20 = field875[Statics.field876 + 3];
            int var21 = field875[Statics.field876 + 4];
            int var22 = field875[Statics.field876 + 5];
            ArrayList var23 = new ArrayList();
            var23.add(var17);
            var23.add(var18);
            client.method3459(var23, var19, var20, var21, var22);
            return 1;
        } else if (arg0 == 3222) {
            Statics.field876 -= 4;
            int var24 = field875[Statics.field876];
            int var25 = field875[Statics.field876 + 1];
            int var26 = field875[Statics.field876 + 2];
            int var27 = field875[Statics.field876 + 3];
            class320.method3526(var24, var25, var26, var27);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ja.bn(ILds;ZI)I")
    public static int method4489(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3300) {
            field875[++Statics.field876 - 1] = client.field533;
            return 1;
        } else if (arg0 == 3301) {
            Statics.field876 -= 2;
            int var3 = field875[Statics.field876];
            int var4 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = class87.method6503(var3, var4);
            return 1;
        } else if (arg0 == 3302) {
            Statics.field876 -= 2;
            int var5 = field875[Statics.field876];
            int var6 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = class87.method377(var5, var6);
            return 1;
        } else if (arg0 == 3303) {
            Statics.field876 -= 2;
            int var7 = field875[Statics.field876];
            int var8 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = class87.method3090(var7, var8);
            return 1;
        } else if (arg0 == 3304) {
            int var9 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = class188.method3116(var9).field1904;
            return 1;
        } else if (arg0 == 3305) {
            int var10 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = client.field565[var10];
            return 1;
        } else if (arg0 == 3306) {
            int var11 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = client.field658[var11];
            return 1;
        } else if (arg0 == 3307) {
            int var12 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = client.field664[var12];
            return 1;
        } else if (arg0 == 3308) {
            int var13 = Statics.field1072;
            int var14 = (Statics.field2696.field1227 >> 7) + Statics.field108;
            int var15 = (Statics.field2696.field1187 >> 7) + Statics.field103;
            field875[++Statics.field876 - 1] = (var13 << 28) + (var14 << 14) + var15;
            return 1;
        } else if (arg0 == 3309) {
            int var16 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = var16 >> 14 & 0x3FFF;
            return 1;
        } else if (arg0 == 3310) {
            int var17 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = var17 >> 28;
            return 1;
        } else if (arg0 == 3311) {
            int var18 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = var18 & 0x3FFF;
            return 1;
        } else if (arg0 == 3312) {
            field875[++Statics.field876 - 1] = client.field522 ? 1 : 0;
            return 1;
        } else if (arg0 == 3313) {
            Statics.field876 -= 2;
            int var19 = field875[Statics.field876] + 32768;
            int var20 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = class87.method6503(var19, var20);
            return 1;
        } else if (arg0 == 3314) {
            Statics.field876 -= 2;
            int var21 = field875[Statics.field876] + 32768;
            int var22 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = class87.method377(var21, var22);
            return 1;
        } else if (arg0 == 3315) {
            Statics.field876 -= 2;
            int var23 = field875[Statics.field876] + 32768;
            int var24 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = class87.method3090(var23, var24);
            return 1;
        } else if (arg0 == 3316) {
            if (client.field776 >= 2) {
                field875[++Statics.field876 - 1] = client.field776;
            } else {
                field875[++Statics.field876 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3317) {
            field875[++Statics.field876 - 1] = client.field640;
            return 1;
        } else if (arg0 == 3318) {
            field875[++Statics.field876 - 1] = client.field519;
            return 1;
        } else if (arg0 == 3321) {
            field875[++Statics.field876 - 1] = client.field696 / 100;
            return 1;
        } else if (arg0 == 3322) {
            field875[++Statics.field876 - 1] = client.field697;
            return 1;
        } else if (arg0 == 3323) {
            if (client.field700) {
                field875[++Statics.field876 - 1] = 1;
            } else {
                field875[++Statics.field876 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3324) {
            field875[++Statics.field876 - 1] = client.field520;
            return 1;
        } else if (arg0 == 3325) {
            Statics.field876 -= 4;
            int var25 = field875[Statics.field876];
            int var26 = field875[Statics.field876 + 1];
            int var27 = field875[Statics.field876 + 2];
            int var28 = field875[Statics.field876 + 3];
            int var29 = (var26 << 14) + var25;
            int var30 = (var27 << 28) + var29;
            int var31 = var28 + var30;
            field875[++Statics.field876 - 1] = var31;
            return 1;
        } else if (arg0 == 3326) {
            field875[++Statics.field876 - 1] = client.field653;
            return 1;
        } else if (arg0 == 3327) {
            field875[++Statics.field876 - 1] = client.field598;
            return 1;
        } else if (arg0 == 3331) {
            field875[++Statics.field876 - 1] = client.field696;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ri.bk(ILds;ZI)I")
    public static int method7428(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3400) {
            Statics.field876 -= 2;
            int var3 = field875[Statics.field876];
            int var4 = field875[Statics.field876 + 1];
            class201 var5 = class201.method2012(var3);
            if (var5.field2015 != 's') {
            }
            for (int var6 = 0; var6 < var5.field2018; var6++) {
                if (var5.field2019[var6] == var4) {
                    field886[++Statics.field1867 - 1] = var5.field2014[var6];
                    var5 = null;
                    break;
                }
            }
            if (var5 != null) {
                field886[++Statics.field1867 - 1] = var5.field2012;
            }
            return 1;
        } else if (arg0 == 3408) {
            Statics.field876 -= 4;
            int var7 = field875[Statics.field876];
            int var8 = field875[Statics.field876 + 1];
            int var9 = field875[Statics.field876 + 2];
            int var10 = field875[Statics.field876 + 3];
            class201 var11 = class201.method2012(var9);
            if (var11.field2016 != var7 || var11.field2015 != var8) {
                if (var8 == 115) {
                    field886[++Statics.field1867 - 1] = class367.field3956;
                } else {
                    field875[++Statics.field876 - 1] = 0;
                }
                return 1;
            }
            for (int var12 = 0; var12 < var11.field2018; var12++) {
                if (var11.field2019[var12] == var10) {
                    if (var8 == 115) {
                        field886[++Statics.field1867 - 1] = var11.field2014[var12];
                    } else {
                        field875[++Statics.field876 - 1] = var11.field2020[var12];
                    }
                    var11 = null;
                    break;
                }
            }
            if (var11 != null) {
                if (var8 == 115) {
                    field886[++Statics.field1867 - 1] = var11.field2012;
                } else {
                    field875[++Statics.field876 - 1] = var11.field2017;
                }
            }
            return 1;
        } else if (arg0 == 3411) {
            int var13 = field875[--Statics.field876];
            class201 var14 = class201.method2012(var13);
            field875[++Statics.field876 - 1] = var14.method3438();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hp.by(ILds;ZI)I")
    public static int method3355(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3500) {
            int var3 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = client.field756.method3924(var3) ? 1 : 0;
            return 1;
        } else if (arg0 == 3501) {
            int var4 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = client.field756.method3921(var4) ? 1 : 0;
            return 1;
        } else if (arg0 == 3502) {
            int var5 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = client.field756.method3917(var5) ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bt.bd(ILds;ZI)I")
    public static int method689(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3600) {
            if (Statics.field1907.field850 == 0) {
                field875[++Statics.field876 - 1] = -2;
            } else if (Statics.field1907.field850 == 1) {
                field875[++Statics.field876 - 1] = -1;
            } else {
                field875[++Statics.field876 - 1] = Statics.field1907.field851.method7406();
            }
            return 1;
        } else if (arg0 == 3601) {
            int var3 = field875[--Statics.field876];
            if (Statics.field1907.method1801() && var3 >= 0 && var3 < Statics.field1907.field851.method7406()) {
                class445 var4 = (class445) Statics.field1907.field851.method7367(var3);
                field886[++Statics.field1867 - 1] = var4.method7336();
                field886[++Statics.field1867 - 1] = var4.method7330();
            } else {
                field886[++Statics.field1867 - 1] = "";
                field886[++Statics.field1867 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3602) {
            int var5 = field875[--Statics.field876];
            if (Statics.field1907.method1801() && var5 >= 0 && var5 < Statics.field1907.field851.method7406()) {
                field875[++Statics.field876 - 1] = ((class452) Statics.field1907.field851.method7367(var5)).field4712;
            } else {
                field875[++Statics.field876 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3603) {
            int var6 = field875[--Statics.field876];
            if (Statics.field1907.method1801() && var6 >= 0 && var6 < Statics.field1907.field851.method7406()) {
                field875[++Statics.field876 - 1] = ((class452) Statics.field1907.field851.method7367(var6)).field4713;
            } else {
                field875[++Statics.field876 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 3604) {
            String var7 = field886[--Statics.field1867];
            int var8 = field875[--Statics.field876];
            Statics.method2994(var7, var8);
            return 1;
        } else if (arg0 == 3605) {
            String var9 = field886[--Statics.field1867];
            Statics.field1907.method1834(var9);
            return 1;
        } else if (arg0 == 3606) {
            String var10 = field886[--Statics.field1867];
            Statics.field1907.method1805(var10);
            return 1;
        } else if (arg0 == 3607) {
            String var11 = field886[--Statics.field1867];
            Statics.field1907.method1798(var11);
            return 1;
        } else if (arg0 == 3608) {
            String var12 = field886[--Statics.field1867];
            boolean var13 = true;
            Statics.field1907.method1806(var12, var13);
            return 1;
        } else if (arg0 == 3609) {
            String var14 = field886[--Statics.field1867];
            String var15 = client.method2213(var14);
            field875[++Statics.field876 - 1] = Statics.field1907.method1799(new class553(var15, Statics.field1781), false) ? 1 : 0;
            return 1;
        } else if (arg0 == 3611) {
            if (Statics.field3897 == null) {
                field886[++Statics.field1867 - 1] = "";
            } else {
                field886[++Statics.field1867 - 1] = Statics.field3897.field4683;
            }
            return 1;
        } else if (arg0 == 3612) {
            if (Statics.field3897 == null) {
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = Statics.field3897.method7406();
            }
            return 1;
        } else if (arg0 == 3613) {
            int var16 = field875[--Statics.field876];
            if (Statics.field3897 == null || var16 >= Statics.field3897.method7406()) {
                field886[++Statics.field1867 - 1] = "";
            } else {
                field886[++Statics.field1867 - 1] = Statics.field3897.method7367(var16).method7329().method8985();
            }
            return 1;
        } else if (arg0 == 3614) {
            int var17 = field875[--Statics.field876];
            if (Statics.field3897 == null || var17 >= Statics.field3897.method7406()) {
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = ((class452) Statics.field3897.method7367(var17)).method7434();
            }
            return 1;
        } else if (arg0 == 3615) {
            int var18 = field875[--Statics.field876];
            if (Statics.field3897 == null || var18 >= Statics.field3897.method7406()) {
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = ((class452) Statics.field3897.method7367(var18)).field4713;
            }
            return 1;
        } else if (arg0 == 3616) {
            field875[++Statics.field876 - 1] = Statics.field3897 == null ? 0 : Statics.field3897.field4680;
            return 1;
        } else if (arg0 == 3617) {
            String var19 = field886[--Statics.field1867];
            client.method172(var19);
            return 1;
        } else if (arg0 == 3618) {
            field875[++Statics.field876 - 1] = Statics.field3897 == null ? 0 : Statics.field3897.field4681;
            return 1;
        } else if (arg0 == 3619) {
            String var20 = field886[--Statics.field1867];
            client.method3621(var20);
            return 1;
        } else if (arg0 == 3620) {
            client.method5131();
            return 1;
        } else if (arg0 == 3621) {
            if (Statics.field1907.method1801()) {
                field875[++Statics.field876 - 1] = Statics.field1907.field849.method7406();
            } else {
                field875[++Statics.field876 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 3622) {
            int var21 = field875[--Statics.field876];
            if (Statics.field1907.method1801() && var21 >= 0 && var21 < Statics.field1907.field849.method7406()) {
                class451 var22 = (class451) Statics.field1907.field849.method7367(var21);
                field886[++Statics.field1867 - 1] = var22.method7336();
                field886[++Statics.field1867 - 1] = var22.method7330();
            } else {
                field886[++Statics.field1867 - 1] = "";
                field886[++Statics.field1867 - 1] = "";
            }
            return 1;
        } else if (arg0 == 3623) {
            String var23 = field886[--Statics.field1867];
            String var24 = client.method2213(var23);
            field875[++Statics.field876 - 1] = Statics.field1907.method1800(new class553(var24, Statics.field1781)) ? 1 : 0;
            return 1;
        } else if (arg0 == 3624) {
            int var25 = field875[--Statics.field876];
            if (Statics.field3897 == null || var25 >= Statics.field3897.method7406() || !Statics.field3897.method7367(var25).method7329().equals(Statics.field2696.field1136)) {
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3625) {
            if (Statics.field3897 == null || Statics.field3897.field4684 == null) {
                field886[++Statics.field1867 - 1] = "";
            } else {
                field886[++Statics.field1867 - 1] = Statics.field3897.field4684;
            }
            return 1;
        } else if (arg0 == 3626) {
            int var26 = field875[--Statics.field876];
            if (Statics.field3897 == null || var26 >= Statics.field3897.method7406() || !((class447) Statics.field3897.method7367(var26)).method7315()) {
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3627) {
            int var27 = field875[--Statics.field876];
            if (Statics.field3897 == null || var27 >= Statics.field3897.method7406() || !((class447) Statics.field3897.method7367(var27)).method7317()) {
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = 1;
            }
            return 1;
        } else if (arg0 == 3628) {
            Statics.field1907.field851.method7375();
            return 1;
        } else if (arg0 == 3629) {
            boolean var28 = field875[--Statics.field876] == 1;
            Statics.field1907.field851.method7403(new class536(var28));
            return 1;
        } else if (arg0 == 3630) {
            boolean var29 = field875[--Statics.field876] == 1;
            Statics.field1907.field851.method7403(new class537(var29));
            return 1;
        } else if (arg0 == 3631) {
            boolean var30 = field875[--Statics.field876] == 1;
            Statics.field1907.field851.method7403(new class122(var30));
            return 1;
        } else if (arg0 == 3632) {
            boolean var31 = field875[--Statics.field876] == 1;
            Statics.field1907.field851.method7403(new class118(var31));
            return 1;
        } else if (arg0 == 3633) {
            boolean var32 = field875[--Statics.field876] == 1;
            Statics.field1907.field851.method7403(new class121(var32));
            return 1;
        } else if (arg0 == 3634) {
            boolean var33 = field875[--Statics.field876] == 1;
            Statics.field1907.field851.method7403(new class126(var33));
            return 1;
        } else if (arg0 == 3635) {
            boolean var34 = field875[--Statics.field876] == 1;
            Statics.field1907.field851.method7403(new class120(var34));
            return 1;
        } else if (arg0 == 3636) {
            boolean var35 = field875[--Statics.field876] == 1;
            Statics.field1907.field851.method7403(new class119(var35));
            return 1;
        } else if (arg0 == 3637) {
            boolean var36 = field875[--Statics.field876] == 1;
            Statics.field1907.field851.method7403(new class123(var36));
            return 1;
        } else if (arg0 == 3638) {
            boolean var37 = field875[--Statics.field876] == 1;
            Statics.field1907.field851.method7403(new class124(var37));
            return 1;
        } else if (arg0 == 3639) {
            Statics.field1907.field851.method7368();
            return 1;
        } else if (arg0 == 3640) {
            Statics.field1907.field849.method7375();
            return 1;
        } else if (arg0 == 3641) {
            boolean var38 = field875[--Statics.field876] == 1;
            Statics.field1907.field849.method7403(new class536(var38));
            return 1;
        } else if (arg0 == 3642) {
            boolean var39 = field875[--Statics.field876] == 1;
            Statics.field1907.field849.method7403(new class537(var39));
            return 1;
        } else if (arg0 == 3643) {
            Statics.field1907.field849.method7368();
            return 1;
        } else if (arg0 == 3644) {
            if (Statics.field3897 != null) {
                Statics.field3897.method7375();
            }
            return 1;
        } else if (arg0 == 3645) {
            boolean var40 = field875[--Statics.field876] == 1;
            if (Statics.field3897 != null) {
                Statics.field3897.method7403(new class536(var40));
            }
            return 1;
        } else if (arg0 == 3646) {
            boolean var41 = field875[--Statics.field876] == 1;
            if (Statics.field3897 != null) {
                Statics.field3897.method7403(new class537(var41));
            }
            return 1;
        } else if (arg0 == 3647) {
            boolean var42 = field875[--Statics.field876] == 1;
            if (Statics.field3897 != null) {
                Statics.field3897.method7403(new class122(var42));
            }
            return 1;
        } else if (arg0 == 3648) {
            boolean var43 = field875[--Statics.field876] == 1;
            if (Statics.field3897 != null) {
                Statics.field3897.method7403(new class118(var43));
            }
            return 1;
        } else if (arg0 == 3649) {
            boolean var44 = field875[--Statics.field876] == 1;
            if (Statics.field3897 != null) {
                Statics.field3897.method7403(new class121(var44));
            }
            return 1;
        } else if (arg0 == 3650) {
            boolean var45 = field875[--Statics.field876] == 1;
            if (Statics.field3897 != null) {
                Statics.field3897.method7403(new class126(var45));
            }
            return 1;
        } else if (arg0 == 3651) {
            boolean var46 = field875[--Statics.field876] == 1;
            if (Statics.field3897 != null) {
                Statics.field3897.method7403(new class120(var46));
            }
            return 1;
        } else if (arg0 == 3652) {
            boolean var47 = field875[--Statics.field876] == 1;
            if (Statics.field3897 != null) {
                Statics.field3897.method7403(new class119(var47));
            }
            return 1;
        } else if (arg0 == 3653) {
            boolean var48 = field875[--Statics.field876] == 1;
            if (Statics.field3897 != null) {
                Statics.field3897.method7403(new class123(var48));
            }
            return 1;
        } else if (arg0 == 3654) {
            boolean var49 = field875[--Statics.field876] == 1;
            if (Statics.field3897 != null) {
                Statics.field3897.method7403(new class124(var49));
            }
            return 1;
        } else if (arg0 == 3655) {
            if (Statics.field3897 != null) {
                Statics.field3897.method7368();
            }
            return 1;
        } else if (arg0 == 3656) {
            boolean var50 = field875[--Statics.field876] == 1;
            Statics.field1907.field851.method7403(new class125(var50));
            return 1;
        } else if (arg0 == 3657) {
            boolean var51 = field875[--Statics.field876] == 1;
            if (Statics.field3897 != null) {
                Statics.field3897.method7403(new class125(var51));
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("sm.be(ILds;ZI)I")
    public static int method7693(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ay.bv(ILds;ZI)I")
    public static int method154(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3800) {
            if (Statics.field2094 == null) {
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = 1;
                Statics.field3109 = Statics.field2094;
            }
            return 1;
        } else if (arg0 == 3801) {
            int var3 = field875[--Statics.field876];
            if (client.field607[var3] == null) {
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = 1;
                Statics.field3109 = client.field607[var3];
            }
            return 1;
        } else if (arg0 == 3802) {
            field886[++Statics.field1867 - 1] = Statics.field3109.field1706;
            return 1;
        } else if (arg0 == 3803) {
            field875[++Statics.field876 - 1] = Statics.field3109.field1708 ? 1 : 0;
            return 1;
        } else if (arg0 == 3804) {
            field875[++Statics.field876 - 1] = Statics.field3109.field1710;
            return 1;
        } else if (arg0 == 3805) {
            field875[++Statics.field876 - 1] = Statics.field3109.field1724;
            return 1;
        } else if (arg0 == 3806) {
            field875[++Statics.field876 - 1] = Statics.field3109.field1711;
            return 1;
        } else if (arg0 == 3807) {
            field875[++Statics.field876 - 1] = Statics.field3109.field1701;
            return 1;
        } else if (arg0 == 3809) {
            field875[++Statics.field876 - 1] = Statics.field3109.field1713;
            return 1;
        } else if (arg0 == 3810) {
            int var4 = field875[--Statics.field876];
            field886[++Statics.field1867 - 1] = Statics.field3109.field1709[var4];
            return 1;
        } else if (arg0 == 3811) {
            int var5 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = Statics.field3109.field1723[var5];
            return 1;
        } else if (arg0 == 3812) {
            field875[++Statics.field876 - 1] = Statics.field3109.field1712;
            return 1;
        } else if (arg0 == 3813) {
            int var6 = field875[--Statics.field876];
            field886[++Statics.field1867 - 1] = Statics.field3109.field1725[var6];
            return 1;
        } else if (arg0 == 3814) {
            Statics.field876 -= 3;
            int var7 = field875[Statics.field876];
            int var8 = field875[Statics.field876 + 1];
            int var9 = field875[Statics.field876 + 2];
            field875[++Statics.field876 - 1] = Statics.field3109.method3021(var7, var8, var9);
            return 1;
        } else if (arg0 == 3815) {
            field875[++Statics.field876 - 1] = Statics.field3109.field1720;
            return 1;
        } else if (arg0 == 3816) {
            field875[++Statics.field876 - 1] = Statics.field3109.field1721;
            return 1;
        } else if (arg0 == 3817) {
            field875[++Statics.field876 - 1] = Statics.field3109.method3017(field886[--Statics.field1867]);
            return 1;
        } else if (arg0 == 3818) {
            field875[Statics.field876 - 1] = Statics.field3109.method3023()[field875[Statics.field876 - 1]];
            return 1;
        } else if (arg0 == 3819) {
            Statics.field876 -= 2;
            int var10 = field875[Statics.field876];
            int var11 = field875[Statics.field876 + 1];
            Statics.method688(var11, var10);
            return 1;
        } else if (arg0 == 3820) {
            int var12 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = Statics.field3109.field1718[var12];
            return 1;
        } else {
            if (arg0 == 3821) {
                Statics.field876 -= 3;
                int var13 = field875[Statics.field876];
                boolean var14 = field875[Statics.field876 + 1] == 1;
                int var15 = field875[Statics.field876 + 2];
                client.method2344(var15, var13, var14);
            }
            if (arg0 == 3822) {
                int var16 = field875[--Statics.field876];
                field875[++Statics.field876 - 1] = Statics.field3109.field1719[var16] ? 1 : 0;
                return 1;
            } else if (arg0 == 3850) {
                if (Statics.field1659 == null) {
                    field875[++Statics.field876 - 1] = 0;
                } else {
                    field875[++Statics.field876 - 1] = 1;
                    Statics.field877 = Statics.field1659;
                }
                return 1;
            } else if (arg0 == 3851) {
                int var17 = field875[--Statics.field876];
                if (client.field763[var17] == null) {
                    field875[++Statics.field876 - 1] = 0;
                } else {
                    field875[++Statics.field876 - 1] = 1;
                    Statics.field877 = client.field763[var17];
                    Statics.field1960 = var17;
                }
                return 1;
            } else if (arg0 == 3852) {
                field886[++Statics.field1867 - 1] = Statics.field877.field1775;
                return 1;
            } else if (arg0 == 3853) {
                field875[++Statics.field876 - 1] = Statics.field877.field1779;
                return 1;
            } else if (arg0 == 3854) {
                field875[++Statics.field876 - 1] = Statics.field877.field1778;
                return 1;
            } else if (arg0 == 3855) {
                field875[++Statics.field876 - 1] = Statics.field877.method3120();
                return 1;
            } else if (arg0 == 3856) {
                int var18 = field875[--Statics.field876];
                field886[++Statics.field1867 - 1] = ((class148) Statics.field877.field1772.get(var18)).field1660.method8985();
                return 1;
            } else if (arg0 == 3857) {
                int var19 = field875[--Statics.field876];
                field875[++Statics.field876 - 1] = ((class148) Statics.field877.field1772.get(var19)).field1657;
                return 1;
            } else if (arg0 == 3858) {
                int var20 = field875[--Statics.field876];
                field875[++Statics.field876 - 1] = ((class148) Statics.field877.field1772.get(var20)).field1658;
                return 1;
            } else if (arg0 == 3859) {
                int var21 = field875[--Statics.field876];
                client.method7506(Statics.field1960, var21);
                return 1;
            } else if (arg0 == 3860) {
                field875[++Statics.field876 - 1] = Statics.field877.method3121(field886[--Statics.field1867]);
                return 1;
            } else if (arg0 == 3861) {
                field875[Statics.field876 - 1] = Statics.field877.method3117()[field875[Statics.field876 - 1]];
                return 1;
            } else if (arg0 == 3890) {
                field875[++Statics.field876 - 1] = Statics.field2317 == null ? 0 : 1;
                return 1;
            } else {
                return 2;
            }
        }
    }

    @ObfuscatedName("ct.ba(ILds;ZI)I")
    public static int method2023(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 3903) {
            int var3 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = client.field715[var3].method6453();
            return 1;
        } else if (arg0 == 3904) {
            int var4 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = client.field715[var4].field4399;
            return 1;
        } else if (arg0 == 3905) {
            int var5 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = client.field715[var5].field4400;
            return 1;
        } else if (arg0 == 3906) {
            int var6 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = client.field715[var6].field4398;
            return 1;
        } else if (arg0 == 3907) {
            int var7 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = client.field715[var7].field4402;
            return 1;
        } else if (arg0 == 3908) {
            int var8 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = client.field715[var8].field4403;
            return 1;
        } else if (arg0 == 3910) {
            int var9 = field875[--Statics.field876];
            int var10 = client.field715[var9].method6441();
            field875[++Statics.field876 - 1] = var10 == 0 ? 1 : 0;
            return 1;
        } else if (arg0 == 3911) {
            int var11 = field875[--Statics.field876];
            int var12 = client.field715[var11].method6441();
            field875[++Statics.field876 - 1] = var12 == 2 ? 1 : 0;
            return 1;
        } else if (arg0 == 3912) {
            int var13 = field875[--Statics.field876];
            int var14 = client.field715[var13].method6441();
            field875[++Statics.field876 - 1] = var14 == 5 ? 1 : 0;
            return 1;
        } else if (arg0 == 3913) {
            int var15 = field875[--Statics.field876];
            int var16 = client.field715[var15].method6441();
            field875[++Statics.field876 - 1] = var16 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 3914) {
            boolean var17 = field875[--Statics.field876] == 1;
            if (Statics.field3570 != null) {
                Statics.field3570.method6389(class376.field4370, var17);
            }
            return 1;
        } else if (arg0 == 3915) {
            boolean var18 = field875[--Statics.field876] == 1;
            if (Statics.field3570 != null) {
                Statics.field3570.method6389(class376.field4367, var18);
            }
            return 1;
        } else if (arg0 == 3916) {
            Statics.field876 -= 2;
            boolean var19 = field875[Statics.field876] == 1;
            boolean var20 = field875[Statics.field876 + 1] == 1;
            if (Statics.field3570 != null) {
                client.field682.field515 = var20;
                Statics.field3570.method6389(client.field682, var19);
            }
            return 1;
        } else if (arg0 == 3917) {
            boolean var21 = field875[--Statics.field876] == 1;
            if (Statics.field3570 != null) {
                Statics.field3570.method6389(class376.field4368, var21);
            }
            return 1;
        } else if (arg0 == 3918) {
            boolean var22 = field875[--Statics.field876] == 1;
            if (Statics.field3570 != null) {
                Statics.field3570.method6389(class376.field4371, var22);
            }
            return 1;
        } else if (arg0 == 3919) {
            field875[++Statics.field876 - 1] = Statics.field3570 == null ? 0 : Statics.field3570.field4369.size();
            return 1;
        } else if (arg0 == 3920) {
            int var23 = field875[--Statics.field876];
            class382 var24 = (class382) Statics.field3570.field4369.get(var23);
            field875[++Statics.field876 - 1] = var24.field4395;
            return 1;
        } else if (arg0 == 3921) {
            int var25 = field875[--Statics.field876];
            class382 var26 = (class382) Statics.field3570.field4369.get(var25);
            field886[++Statics.field1867 - 1] = var26.method6432();
            return 1;
        } else if (arg0 == 3922) {
            int var27 = field875[--Statics.field876];
            class382 var28 = (class382) Statics.field3570.field4369.get(var27);
            field886[++Statics.field1867 - 1] = var28.method6434();
            return 1;
        } else if (arg0 == 3923) {
            int var29 = field875[--Statics.field876];
            class382 var30 = (class382) Statics.field3570.field4369.get(var29);
            long var31 = class316.method6401() - Statics.field4527 - var30.field4391;
            int var33 = (int) (var31 / 3600000L);
            int var34 = (int) ((var31 - (long) (var33 * 3600000)) / 60000L);
            int var35 = (int) ((var31 - (long) (var33 * 3600000) - (long) (var34 * 60000)) / 1000L);
            String var36 = var33 + ":" + var34 / 10 + var34 % 10 + ":" + var35 / 10 + var35 % 10;
            field886[++Statics.field1867 - 1] = var36;
            return 1;
        } else if (arg0 == 3924) {
            int var37 = field875[--Statics.field876];
            class382 var38 = (class382) Statics.field3570.field4369.get(var37);
            field875[++Statics.field876 - 1] = var38.field4392.field4398;
            return 1;
        } else if (arg0 == 3925) {
            int var39 = field875[--Statics.field876];
            class382 var40 = (class382) Statics.field3570.field4369.get(var39);
            field875[++Statics.field876 - 1] = var40.field4392.field4400;
            return 1;
        } else if (arg0 == 3926) {
            int var41 = field875[--Statics.field876];
            class382 var42 = (class382) Statics.field3570.field4369.get(var41);
            field875[++Statics.field876 - 1] = var42.field4392.field4399;
            return 1;
        } else if (arg0 == 3939) {
            int var43 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = class221.method3594(var43).field2295 ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hz.bz(ILds;ZS)I")
    public static int method3402(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 4000) {
            Statics.field876 -= 2;
            int var3 = field875[Statics.field876];
            int var4 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = var3 + var4;
            return 1;
        } else if (arg0 == 4001) {
            Statics.field876 -= 2;
            int var5 = field875[Statics.field876];
            int var6 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = var5 - var6;
            return 1;
        } else if (arg0 == 4002) {
            Statics.field876 -= 2;
            int var7 = field875[Statics.field876];
            int var8 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = var7 * var8;
            return 1;
        } else if (arg0 == 4003) {
            Statics.field876 -= 2;
            int var9 = field875[Statics.field876];
            int var10 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = var9 / var10;
            return 1;
        } else if (arg0 == 4004) {
            int var11 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = (int) (Math.random() * (double) var11);
            return 1;
        } else if (arg0 == 4005) {
            int var12 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = (int) (Math.random() * (double) (var12 + 1));
            return 1;
        } else if (arg0 == 4006) {
            Statics.field876 -= 5;
            int var13 = field875[Statics.field876];
            int var14 = field875[Statics.field876 + 1];
            int var15 = field875[Statics.field876 + 2];
            int var16 = field875[Statics.field876 + 3];
            int var17 = field875[Statics.field876 + 4];
            field875[++Statics.field876 - 1] = (var14 - var13) * (var17 - var15) / (var16 - var15) + var13;
            return 1;
        } else if (arg0 == 4007) {
            Statics.field876 -= 2;
            int var18 = field875[Statics.field876];
            int var19 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = var18 * var19 / 100 + var18;
            return 1;
        } else if (arg0 == 4008) {
            Statics.field876 -= 2;
            int var20 = field875[Statics.field876];
            int var21 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = var20 | 0x1 << var21;
            return 1;
        } else if (arg0 == 4009) {
            Statics.field876 -= 2;
            int var22 = field875[Statics.field876];
            int var23 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = var22 & -1 - (0x1 << var23);
            return 1;
        } else if (arg0 == 4010) {
            Statics.field876 -= 2;
            int var24 = field875[Statics.field876];
            int var25 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = (var24 & 0x1 << var25) == 0 ? 0 : 1;
            return 1;
        } else if (arg0 == 4011) {
            Statics.field876 -= 2;
            int var26 = field875[Statics.field876];
            int var27 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = var26 % var27;
            return 1;
        } else if (arg0 == 4012) {
            Statics.field876 -= 2;
            int var28 = field875[Statics.field876];
            int var29 = field875[Statics.field876 + 1];
            if (var28 == 0) {
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = (int) Math.pow((double) var28, (double) var29);
            }
            return 1;
        } else if (arg0 == 4013) {
            Statics.field876 -= 2;
            int var30 = field875[Statics.field876];
            int var31 = field875[Statics.field876 + 1];
            if (var30 == 0) {
                field875[++Statics.field876 - 1] = 0;
                return 1;
            }
            switch(var31) {
                case 0:
                    field875[++Statics.field876 - 1] = Integer.MAX_VALUE;
                    break;
                case 1:
                    field875[++Statics.field876 - 1] = var30;
                    break;
                case 2:
                    field875[++Statics.field876 - 1] = (int) Math.sqrt((double) var30);
                    break;
                case 3:
                    field875[++Statics.field876 - 1] = (int) Math.cbrt((double) var30);
                    break;
                case 4:
                    field875[++Statics.field876 - 1] = (int) Math.sqrt(Math.sqrt((double) var30));
                    break;
                default:
                    field875[++Statics.field876 - 1] = (int) Math.pow((double) var30, 1.0D / (double) var31);
            }
            return 1;
        } else if (arg0 == 4014) {
            Statics.field876 -= 2;
            int var32 = field875[Statics.field876];
            int var33 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = var32 & var33;
            return 1;
        } else if (arg0 == 4015) {
            Statics.field876 -= 2;
            int var34 = field875[Statics.field876];
            int var35 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = var34 | var35;
            return 1;
        } else if (arg0 == 4016) {
            Statics.field876 -= 2;
            int var36 = field875[Statics.field876];
            int var37 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = var36 < var37 ? var36 : var37;
            return 1;
        } else if (arg0 == 4017) {
            Statics.field876 -= 2;
            int var38 = field875[Statics.field876];
            int var39 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = var38 > var39 ? var38 : var39;
            return 1;
        } else if (arg0 == 4018) {
            Statics.field876 -= 3;
            long var40 = (long) field875[Statics.field876];
            long var42 = (long) field875[Statics.field876 + 1];
            long var44 = (long) field875[Statics.field876 + 2];
            field875[++Statics.field876 - 1] = (int) (var40 * var44 / var42);
            return 1;
        } else if (arg0 == 4025) {
            int var46 = class318.method5167(field875[--Statics.field876]);
            field875[++Statics.field876 - 1] = var46;
            return 1;
        } else if (arg0 == 4026) {
            Statics.field876 -= 2;
            int var47 = field875[Statics.field876];
            int var48 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = var47 ^ 0x1 << var48;
            return 1;
        } else if (arg0 == 4027) {
            Statics.field876 -= 3;
            int var49 = field875[Statics.field876];
            int var50 = field875[Statics.field876 + 1];
            int var51 = field875[Statics.field876 + 2];
            field875[++Statics.field876 - 1] = class318.method5979(var49, var50, var51);
            return 1;
        } else if (arg0 == 4028) {
            Statics.field876 -= 3;
            int var52 = field875[Statics.field876];
            int var53 = field875[Statics.field876 + 1];
            int var54 = field875[Statics.field876 + 2];
            field875[++Statics.field876 - 1] = class318.method3114(var52, var53, var54);
            return 1;
        } else if (arg0 == 4029) {
            Statics.field876 -= 3;
            int var55 = field875[Statics.field876];
            int var56 = field875[Statics.field876 + 1];
            int var57 = field875[Statics.field876 + 2];
            int var58 = 31 - var57;
            field875[++Statics.field876 - 1] = var55 << var58 >>> var56 + var58;
            return 1;
        } else if (arg0 == 4030) {
            Statics.field876 -= 4;
            int var59 = field875[Statics.field876];
            int var60 = field875[Statics.field876 + 1];
            int var61 = field875[Statics.field876 + 2];
            int var62 = field875[Statics.field876 + 3];
            int var63 = class318.method3114(var59, var61, var62);
            int var64 = class318.method2029(var62 - var61 + 1);
            if (var60 > var64) {
                var60 = var64;
            }
            field875[++Statics.field876 - 1] = var63 | var60 << var61;
            return 1;
        } else if (arg0 == 4032) {
            field875[Statics.field876 - 1] = class480.method4780(field875[Statics.field876 - 1]);
            return 1;
        } else if (arg0 == 4033) {
            field875[Statics.field876 - 1] = class480.method4806(field875[Statics.field876 - 1]);
            return 1;
        } else if (arg0 == 4034) {
            Statics.field876 -= 2;
            int var65 = field875[Statics.field876];
            int var66 = field875[Statics.field876 + 1];
            int var67 = class480.method2502(var65, var66);
            field875[++Statics.field876 - 1] = var67;
            return 1;
        } else if (arg0 == 4035) {
            field875[Statics.field876 - 1] = Math.abs(field875[Statics.field876 - 1]);
            return 1;
        } else if (arg0 == 4036) {
            String var68 = field886[--Statics.field1867];
            int var69 = -1;
            if (class402.method2596(var68)) {
                var69 = class402.method677(var68);
            }
            field875[++Statics.field876 - 1] = var69;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ai.bo(ILds;ZI)I")
    public static int method269(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 4200) {
            int var3 = field875[--Statics.field876];
            field886[++Statics.field1867 - 1] = class221.method3594(var3).field2251;
            return 1;
        } else if (arg0 == 4201) {
            Statics.field876 -= 2;
            int var4 = field875[Statics.field876];
            int var5 = field875[Statics.field876 + 1];
            class221 var6 = class221.method3594(var4);
            if (var5 < 1 || var5 > 5 || var6.field2268[var5 - 1] == null) {
                field886[++Statics.field1867 - 1] = "";
            } else {
                field886[++Statics.field1867 - 1] = var6.field2268[var5 - 1];
            }
            return 1;
        } else if (arg0 == 4202) {
            Statics.field876 -= 2;
            int var7 = field875[Statics.field876];
            int var8 = field875[Statics.field876 + 1];
            class221 var9 = class221.method3594(var7);
            if (var8 < 1 || var8 > 5 || var9.field2269[var8 - 1] == null) {
                field886[++Statics.field1867 - 1] = "";
            } else {
                field886[++Statics.field1867 - 1] = var9.field2269[var8 - 1];
            }
            return 1;
        } else if (arg0 == 4203) {
            int var10 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = class221.method3594(var10).field2257;
            return 1;
        } else if (arg0 == 4204) {
            int var11 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = class221.method3594(var11).field2262 == 1 ? 1 : 0;
            return 1;
        } else if (arg0 == 4205) {
            int var12 = field875[--Statics.field876];
            class221 var13 = class221.method3594(var12);
            if (var13.field2291 == -1 && var13.field2285 >= 0) {
                field875[++Statics.field876 - 1] = var13.field2285;
            } else {
                field875[++Statics.field876 - 1] = var12;
            }
            return 1;
        } else if (arg0 == 4206) {
            int var14 = field875[--Statics.field876];
            class221 var15 = class221.method3594(var14);
            if (var15.field2291 >= 0 && var15.field2285 >= 0) {
                field875[++Statics.field876 - 1] = var15.field2285;
            } else {
                field875[++Statics.field876 - 1] = var14;
            }
            return 1;
        } else if (arg0 == 4207) {
            int var16 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = class221.method3594(var16).field2267 ? 1 : 0;
            return 1;
        } else if (arg0 == 4208) {
            int var17 = field875[--Statics.field876];
            class221 var18 = class221.method3594(var17);
            if (var18.field2299 == -1 && var18.field2298 >= 0) {
                field875[++Statics.field876 - 1] = var18.field2298;
            } else {
                field875[++Statics.field876 - 1] = var17;
            }
            return 1;
        } else if (arg0 == 4209) {
            int var19 = field875[--Statics.field876];
            class221 var20 = class221.method3594(var19);
            if (var20.field2299 >= 0 && var20.field2298 >= 0) {
                field875[++Statics.field876 - 1] = var20.field2298;
            } else {
                field875[++Statics.field876 - 1] = var19;
            }
            return 1;
        } else if (arg0 == 4210) {
            String var21 = field886[--Statics.field1867];
            int var22 = field875[--Statics.field876];
            client.method3267(var21, var22 == 1);
            field875[++Statics.field876 - 1] = Statics.field325;
            return 1;
        } else if (arg0 == 4211) {
            if (Statics.field1602 == null || Statics.field3414 >= Statics.field325) {
                field875[++Statics.field876 - 1] = -1;
            } else {
                field875[++Statics.field876 - 1] = Statics.field1602[++Statics.field3414 - 1] & 0xFFFF;
            }
            return 1;
        } else if (arg0 == 4212) {
            Statics.field3414 = 0;
            return 1;
        } else if (arg0 == 4213) {
            int var23 = field875[--Statics.field876];
            int var24 = class221.method3594(var23).method3817();
            if (var24 == -1) {
                field875[++Statics.field876 - 1] = var24;
            } else {
                field875[++Statics.field876 - 1] = var24 + 1;
            }
            return 1;
        } else if (arg0 == 4214) {
            int var25 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = class221.method3594(var25).field2264;
            return 1;
        } else if (arg0 == 4215) {
            int var26 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = class221.method3594(var26).field2265;
            return 1;
        } else if (arg0 == 4216) {
            int var27 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = class221.method3594(var27).field2283;
            return 1;
        } else if (arg0 == 4217) {
            int var28 = field875[--Statics.field876];
            class221 var29 = class221.method3594(var28);
            field875[++Statics.field876 - 1] = var29.field2293;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dv.bp(ILds;ZI)I")
    public static int method2090(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 5000) {
            field875[++Statics.field876 - 1] = client.field729;
            return 1;
        } else if (arg0 == 5001) {
            Statics.field876 -= 3;
            client.field729 = field875[Statics.field876];
            Statics.field120 = class549.method2784(field875[Statics.field876 + 1]);
            if (Statics.field120 == null) {
                Statics.field120 = class549.field5275;
            }
            client.field809 = field875[Statics.field876 + 2];
            class311 var3 = class311.method2978(class309.field3206, client.field579.field1425);
            var3.field3250.method8348(client.field729);
            var3.field3250.method8348(Statics.field120.field5272);
            var3.field3250.method8348(client.field809);
            client.field579.method2682(var3);
            return 1;
        } else if (arg0 == 5002) {
            String var4 = field886[--Statics.field1867];
            Statics.field876 -= 2;
            int var5 = field875[Statics.field876];
            int var6 = field875[Statics.field876 + 1];
            class311 var7 = class311.method2978(class309.field3157, client.field579.field1425);
            var7.field3250.method8348(class530.method7740(var4) + 2);
            var7.field3250.method8374(var4);
            var7.field3250.method8348(var5 - 1);
            var7.field3250.method8348(var6);
            client.field579.method2682(var7);
            return 1;
        } else if (arg0 == 5003) {
            Statics.field876 -= 2;
            int var8 = field875[Statics.field876];
            int var9 = field875[Statics.field876 + 1];
            class66 var10 = class113.method834(var8, var9);
            if (var10 == null) {
                field875[++Statics.field876 - 1] = -1;
                field875[++Statics.field876 - 1] = 0;
                field886[++Statics.field1867 - 1] = "";
                field886[++Statics.field1867 - 1] = "";
                field886[++Statics.field1867 - 1] = "";
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = var10.field503;
                field875[++Statics.field876 - 1] = var10.field496;
                field886[++Statics.field1867 - 1] = var10.field498 == null ? "" : var10.field498;
                field886[++Statics.field1867 - 1] = var10.field502 == null ? "" : var10.field502;
                field886[++Statics.field1867 - 1] = var10.field506 == null ? "" : var10.field506;
                field875[++Statics.field876 - 1] = var10.method1130() ? 1 : (var10.method1131() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5004) {
            int var11 = field875[--Statics.field876];
            class66 var12 = class113.method5051(var11);
            if (var12 == null) {
                field875[++Statics.field876 - 1] = -1;
                field875[++Statics.field876 - 1] = 0;
                field886[++Statics.field1867 - 1] = "";
                field886[++Statics.field1867 - 1] = "";
                field886[++Statics.field1867 - 1] = "";
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = var12.field497;
                field875[++Statics.field876 - 1] = var12.field496;
                field886[++Statics.field1867 - 1] = var12.field498 == null ? "" : var12.field498;
                field886[++Statics.field1867 - 1] = var12.field502 == null ? "" : var12.field502;
                field886[++Statics.field1867 - 1] = var12.field506 == null ? "" : var12.field506;
                field875[++Statics.field876 - 1] = var12.method1130() ? 1 : (var12.method1131() ? 2 : 0);
            }
            return 1;
        } else if (arg0 == 5005) {
            if (Statics.field120 == null) {
                field875[++Statics.field876 - 1] = -1;
            } else {
                field875[++Statics.field876 - 1] = Statics.field120.field5272;
            }
            return 1;
        } else if (arg0 == 5008) {
            String var13 = field886[--Statics.field1867];
            int var14 = field875[--Statics.field876];
            class311 var15 = class554.method3096(var14, var13, Statics.field2910, -1);
            client.field579.method2682(var15);
            return 1;
        } else if (arg0 == 5009) {
            Statics.field1867 -= 2;
            String var16 = field886[Statics.field1867];
            String var17 = field886[Statics.field1867 + 1];
            class311 var18 = class311.method2978(class309.field3153, client.field579.field1425);
            var18.field3250.method8349(0);
            int var19 = var18.field3250.field5140;
            var18.field3250.method8374(var16);
            class350.method2998(var18.field3250, var17);
            var18.field3250.method8581(var18.field3250.field5140 - var19);
            client.field579.method2682(var18);
            return 1;
        } else if (arg0 == 5010) {
            String var20 = field886[--Statics.field1867];
            Statics.field876 -= 2;
            int var21 = field875[Statics.field876];
            int var22 = field875[Statics.field876 + 1];
            class311 var23 = class554.method3096(var21, var20, Statics.field2910, var22);
            client.field579.method2682(var23);
            return 1;
        } else if (arg0 == 5015) {
            String var24;
            if (Statics.field2696 == null || Statics.field2696.field1136 == null) {
                var24 = "";
            } else {
                var24 = Statics.field2696.field1136.method8985();
            }
            field886[++Statics.field1867 - 1] = var24;
            return 1;
        } else if (arg0 == 5016) {
            field875[++Statics.field876 - 1] = client.field809;
            return 1;
        } else if (arg0 == 5017) {
            int var25 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = class113.method6411(var25);
            return 1;
        } else if (arg0 == 5018) {
            int var26 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = Statics.method2735(var26);
            return 1;
        } else if (arg0 == 5019) {
            int var27 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = class113.method2237(var27);
            return 1;
        } else if (arg0 == 5020) {
            String var28 = field886[--Statics.field1867];
            client.method3110(var28);
            return 1;
        } else if (arg0 == 5021) {
            client.field753 = field886[--Statics.field1867].toLowerCase().trim();
            return 1;
        } else if (arg0 == 5022) {
            field886[++Statics.field1867 - 1] = client.field753;
            return 1;
        } else if (arg0 == 5023) {
            String var29 = field886[--Statics.field1867];
            System.out.println(var29);
            return 1;
        } else if (arg0 == 5030) {
            Statics.field876 -= 2;
            int var30 = field875[Statics.field876];
            int var31 = field875[Statics.field876 + 1];
            class66 var32 = class113.method834(var30, var31);
            if (var32 == null) {
                field875[++Statics.field876 - 1] = -1;
                field875[++Statics.field876 - 1] = 0;
                field886[++Statics.field1867 - 1] = "";
                field886[++Statics.field1867 - 1] = "";
                field886[++Statics.field1867 - 1] = "";
                field875[++Statics.field876 - 1] = 0;
                field886[++Statics.field1867 - 1] = "";
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = var32.field503;
                field875[++Statics.field876 - 1] = var32.field496;
                field886[++Statics.field1867 - 1] = var32.field498 == null ? "" : var32.field498;
                field886[++Statics.field1867 - 1] = var32.field502 == null ? "" : var32.field502;
                field886[++Statics.field1867 - 1] = var32.field506 == null ? "" : var32.field506;
                field875[++Statics.field876 - 1] = var32.method1130() ? 1 : (var32.method1131() ? 2 : 0);
                field886[++Statics.field1867 - 1] = "";
                field875[++Statics.field876 - 1] = 0;
            }
            return 1;
        } else if (arg0 == 5031) {
            int var33 = field875[--Statics.field876];
            class66 var34 = class113.method5051(var33);
            if (var34 == null) {
                field875[++Statics.field876 - 1] = -1;
                field875[++Statics.field876 - 1] = 0;
                field886[++Statics.field1867 - 1] = "";
                field886[++Statics.field1867 - 1] = "";
                field886[++Statics.field1867 - 1] = "";
                field875[++Statics.field876 - 1] = 0;
                field886[++Statics.field1867 - 1] = "";
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = var34.field497;
                field875[++Statics.field876 - 1] = var34.field496;
                field886[++Statics.field1867 - 1] = var34.field498 == null ? "" : var34.field498;
                field886[++Statics.field1867 - 1] = var34.field502 == null ? "" : var34.field502;
                field886[++Statics.field1867 - 1] = var34.field506 == null ? "" : var34.field506;
                field875[++Statics.field876 - 1] = var34.method1130() ? 1 : (var34.method1131() ? 2 : 0);
                field886[++Statics.field1867 - 1] = "";
                field875[++Statics.field876 - 1] = 0;
            }
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ni.bt(ILds;ZB)I")
    public static int method5699(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 5306) {
            field875[++Statics.field876 - 1] = client.method3268();
            return 1;
        } else if (arg0 == 5307) {
            int var3 = field875[--Statics.field876];
            if (var3 == 1 || var3 == 2) {
                client.method3525(var3);
            }
            return 1;
        } else if (arg0 == 5308) {
            field875[++Statics.field876 - 1] = Statics.field1106.method2409();
            return 1;
        } else if (arg0 == 5309) {
            int var4 = field875[--Statics.field876];
            if (var4 == 1 || var4 == 2) {
                Statics.field1106.method2408(var4);
            }
            return 1;
        } else if (arg0 == 5310) {
            Statics.field876--;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("cj.bm(ILds;ZB)I")
    public static int method1860(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 5504) {
            Statics.field876 -= 2;
            int var3 = field875[Statics.field876];
            int var4 = field875[Statics.field876 + 1];
            if (!client.field769) {
                client.field605 = var3;
                client.field650 = var4;
            }
            return 1;
        } else if (arg0 == 5505) {
            field875[++Statics.field876 - 1] = client.field605;
            return 1;
        } else if (arg0 == 5506) {
            field875[++Statics.field876 - 1] = client.field650;
            return 1;
        } else if (arg0 == 5530) {
            int var5 = field875[--Statics.field876];
            if (var5 < 0) {
                var5 = 0;
            }
            client.field612 = var5;
            return 1;
        } else if (arg0 == 5531) {
            field875[++Statics.field876 - 1] = client.field612;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dt.br(ILds;ZI)I")
    public static int method2341(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 5630) {
            client.field585 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("ks.bs(II)I")
    public static int method5119(int arg0) {
        return (int) Math.pow(2.0D, (double) ((float) arg0 / 256.0F + 7.0F));
    }

    @ObfuscatedName("pw.bc(II)I")
    public static int method6683(int arg0) {
        return (int) ((Math.log((double) arg0) / field885 - 7.0D) * 256.0D);
    }

    @ObfuscatedName("lj.bu(ILds;ZI)I")
    public static int method5201(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6200) {
            Statics.field876 -= 2;
            client.field792 = (short) method5119(field875[Statics.field876]);
            if (client.field792 <= 0) {
                client.field792 = 256;
            }
            client.field793 = (short) method5119(field875[Statics.field876 + 1]);
            if (client.field793 <= 0) {
                client.field793 = 256;
            }
            return 1;
        } else if (arg0 == 6201) {
            Statics.field876 -= 2;
            client.field794 = (short) field875[Statics.field876];
            if (client.field794 <= 0) {
                client.field794 = 256;
            }
            client.field795 = (short) field875[Statics.field876 + 1];
            if (client.field795 <= 0) {
                client.field795 = 320;
            }
            return 1;
        } else if (arg0 == 6202) {
            Statics.field876 -= 4;
            client.field796 = (short) field875[Statics.field876];
            if (client.field796 <= 0) {
                client.field796 = 1;
            }
            client.field663 = (short) field875[Statics.field876 + 1];
            if (client.field663 <= 0) {
                client.field663 = 32767;
            } else if (client.field663 < client.field796) {
                client.field663 = client.field796;
            }
            client.field595 = (short) field875[Statics.field876 + 2];
            if (client.field595 <= 0) {
                client.field595 = 1;
            }
            client.field799 = (short) field875[Statics.field876 + 3];
            if (client.field799 <= 0) {
                client.field799 = 32767;
            } else if (client.field799 < client.field595) {
                client.field799 = client.field595;
            }
            return 1;
        } else if (arg0 == 6203) {
            if (client.field547 == null) {
                field875[++Statics.field876 - 1] = -1;
                field875[++Statics.field876 - 1] = -1;
            } else {
                client.method1017(0, 0, client.field547.field3692, client.field547.field3693, false);
                field875[++Statics.field876 - 1] = client.field523;
                field875[++Statics.field876 - 1] = client.field803;
            }
            return 1;
        } else if (arg0 == 6204) {
            field875[++Statics.field876 - 1] = client.field794;
            field875[++Statics.field876 - 1] = client.field795;
            return 1;
        } else if (arg0 == 6205) {
            field875[++Statics.field876 - 1] = method6683(client.field792);
            field875[++Statics.field876 - 1] = method6683(client.field793);
            return 1;
        } else if (arg0 == 6220) {
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 6221) {
            field875[++Statics.field876 - 1] = 0;
            return 1;
        } else if (arg0 == 6222) {
            field875[++Statics.field876 - 1] = Statics.field3598;
            return 1;
        } else if (arg0 == 6223) {
            field875[++Statics.field876 - 1] = Statics.field4908;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("mr.bf(ILds;ZI)I")
    public static int method5409(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6500) {
            field875[++Statics.field876 - 1] = class69.method312() ? 1 : 0;
            return 1;
        } else if (arg0 == 6501) {
            class69 var3 = class69.method1016();
            if (var3 == null) {
                field875[++Statics.field876 - 1] = -1;
                field875[++Statics.field876 - 1] = 0;
                field886[++Statics.field1867 - 1] = "";
                field875[++Statics.field876 - 1] = 0;
                field875[++Statics.field876 - 1] = 0;
                field886[++Statics.field1867 - 1] = "";
            } else {
                field875[++Statics.field876 - 1] = var3.field833;
                field875[++Statics.field876 - 1] = var3.field832;
                field886[++Statics.field1867 - 1] = var3.field837;
                field875[++Statics.field876 - 1] = var3.field838;
                field875[++Statics.field876 - 1] = var3.field840;
                field886[++Statics.field1867 - 1] = var3.field826;
            }
            return 1;
        } else if (arg0 == 6502) {
            class69 var4 = class69.method301();
            if (var4 == null) {
                field875[++Statics.field876 - 1] = -1;
                field875[++Statics.field876 - 1] = 0;
                field886[++Statics.field1867 - 1] = "";
                field875[++Statics.field876 - 1] = 0;
                field875[++Statics.field876 - 1] = 0;
                field886[++Statics.field1867 - 1] = "";
            } else {
                field875[++Statics.field876 - 1] = var4.field833;
                field875[++Statics.field876 - 1] = var4.field832;
                field886[++Statics.field1867 - 1] = var4.field837;
                field875[++Statics.field876 - 1] = var4.field838;
                field875[++Statics.field876 - 1] = var4.field840;
                field886[++Statics.field1867 - 1] = var4.field826;
            }
            return 1;
        } else if (arg0 == 6506) {
            int var5 = field875[--Statics.field876];
            class69 var6 = null;
            for (int var7 = 0; var7 < class69.field829; var7++) {
                if (Statics.field1471[var7].field833 == var5) {
                    var6 = Statics.field1471[var7];
                    break;
                }
            }
            if (var6 == null) {
                field875[++Statics.field876 - 1] = -1;
                field875[++Statics.field876 - 1] = 0;
                field886[++Statics.field1867 - 1] = "";
                field875[++Statics.field876 - 1] = 0;
                field875[++Statics.field876 - 1] = 0;
                field886[++Statics.field1867 - 1] = "";
            } else {
                field875[++Statics.field876 - 1] = var6.field833;
                field875[++Statics.field876 - 1] = var6.field832;
                field886[++Statics.field1867 - 1] = var6.field837;
                field875[++Statics.field876 - 1] = var6.field838;
                field875[++Statics.field876 - 1] = var6.field840;
                field886[++Statics.field1867 - 1] = var6.field826;
            }
            return 1;
        } else if (arg0 == 6507) {
            Statics.field876 -= 4;
            int var8 = field875[Statics.field876];
            boolean var9 = field875[Statics.field876 + 1] == 1;
            int var10 = field875[Statics.field876 + 2];
            boolean var11 = field875[Statics.field876 + 3] == 1;
            class69.method3995(var8, var9, var10, var11);
            return 1;
        } else if (arg0 == 6511) {
            int var12 = field875[--Statics.field876];
            if (var12 >= 0 && var12 < class69.field829) {
                class69 var13 = Statics.field1471[var12];
                field875[++Statics.field876 - 1] = var13.field833;
                field875[++Statics.field876 - 1] = var13.field832;
                field886[++Statics.field1867 - 1] = var13.field837;
                field875[++Statics.field876 - 1] = var13.field838;
                field875[++Statics.field876 - 1] = var13.field840;
                field886[++Statics.field1867 - 1] = var13.field826;
            } else {
                field875[++Statics.field876 - 1] = -1;
                field875[++Statics.field876 - 1] = 0;
                field886[++Statics.field1867 - 1] = "";
                field875[++Statics.field876 - 1] = 0;
                field875[++Statics.field876 - 1] = 0;
                field886[++Statics.field1867 - 1] = "";
            }
            return 1;
        } else if (arg0 == 6512) {
            client.field676 = field875[--Statics.field876] == 1;
            return 1;
        } else if (arg0 == 6513) {
            Statics.field876 -= 2;
            int var14 = field875[Statics.field876];
            int var15 = field875[Statics.field876 + 1];
            class216 var16 = class216.method3279(var15);
            if (var16.method3596()) {
                field886[++Statics.field1867 - 1] = class206.method3320(var14).method3506(var15, var16.field2154);
            } else {
                field875[++Statics.field876 - 1] = class206.method3320(var14).method3477(var15, var16.field2149);
            }
            return 1;
        } else if (arg0 == 6514) {
            Statics.field876 -= 2;
            int var17 = field875[Statics.field876];
            int var18 = field875[Statics.field876 + 1];
            class216 var19 = class216.method3279(var18);
            if (var19.method3596()) {
                field886[++Statics.field1867 - 1] = Statics.method2243(var17).method3698(var18, var19.field2154);
            } else {
                field875[++Statics.field876 - 1] = Statics.method2243(var17).method3710(var18, var19.field2149);
            }
            return 1;
        } else if (arg0 == 6515) {
            Statics.field876 -= 2;
            int var20 = field875[Statics.field876];
            int var21 = field875[Statics.field876 + 1];
            class216 var22 = class216.method3279(var21);
            if (var22.method3596()) {
                field886[++Statics.field1867 - 1] = class221.method3594(var20).method3778(var21, var22.field2154);
            } else {
                field875[++Statics.field876 - 1] = class221.method3594(var20).method3738(var21, var22.field2149);
            }
            return 1;
        } else if (arg0 == 6516) {
            Statics.field876 -= 2;
            int var23 = field875[Statics.field876];
            int var24 = field875[Statics.field876 + 1];
            class216 var25 = class216.method3279(var24);
            if (var25.method3596()) {
                field886[++Statics.field1867 - 1] = class218.method3112(var23).method3643(var24, var25.field2154);
            } else {
                field875[++Statics.field876 - 1] = class218.method3112(var23).method3634(var24, var25.field2149);
            }
            return 1;
        } else if (arg0 == 6518) {
            field875[++Statics.field876 - 1] = client.field775 ? 1 : 0;
            return 1;
        } else if (arg0 == 6519) {
            field875[++Statics.field876 - 1] = client.field525;
            return 1;
        } else if (arg0 == 6520) {
            return 1;
        } else if (arg0 == 6521) {
            return 1;
        } else if (arg0 == 6522) {
            Statics.field1867--;
            Statics.field876--;
            return 1;
        } else if (arg0 == 6523) {
            Statics.field1867--;
            Statics.field876--;
            return 1;
        } else if (arg0 == 6524) {
            field875[++Statics.field876 - 1] = -1;
            return 1;
        } else if (arg0 == 6525) {
            field875[++Statics.field876 - 1] = 1;
            return 1;
        } else if (arg0 == 6526) {
            field875[++Statics.field876 - 1] = 1;
            return 1;
        } else if (arg0 == 6527) {
            field875[++Statics.field876 - 1] = client.field526;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("oz.bh(ILds;ZI)I")
    public static int method6414(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6600) {
            int var3 = Statics.field1072;
            int var4 = (Statics.field2696.field1227 >> 7) + Statics.field108;
            int var5 = (Statics.field2696.field1187 >> 7) + Statics.field103;
            client.method3009().method7860(var3, var4, var5, true);
            return 1;
        } else if (arg0 == 6601) {
            int var6 = field875[--Statics.field876];
            String var7 = "";
            class271 var8 = client.method3009().method7878(var6);
            if (var8 != null) {
                var7 = var8.method4860();
            }
            field886[++Statics.field1867 - 1] = var7;
            return 1;
        } else if (arg0 == 6602) {
            int var9 = field875[--Statics.field876];
            client.method3009().method7861(var9);
            return 1;
        } else if (arg0 == 6603) {
            field875[++Statics.field876 - 1] = client.method3009().method8019();
            return 1;
        } else if (arg0 == 6604) {
            int var10 = field875[--Statics.field876];
            client.method3009().method7872(var10);
            return 1;
        } else if (arg0 == 6605) {
            field875[++Statics.field876 - 1] = client.method3009().method7952() ? 1 : 0;
            return 1;
        } else if (arg0 == 6606) {
            class337 var11 = new class337(field875[--Statics.field876]);
            client.method3009().method7879(var11.field3578, var11.field3574);
            return 1;
        } else if (arg0 == 6607) {
            class337 var12 = new class337(field875[--Statics.field876]);
            client.method3009().method7880(var12.field3578, var12.field3574);
            return 1;
        } else if (arg0 == 6608) {
            class337 var13 = new class337(field875[--Statics.field876]);
            client.method3009().method7881(var13.field3575, var13.field3578, var13.field3574);
            return 1;
        } else if (arg0 == 6609) {
            class337 var14 = new class337(field875[--Statics.field876]);
            client.method3009().method7882(var14.field3575, var14.field3578, var14.field3574);
            return 1;
        } else if (arg0 == 6610) {
            field875[++Statics.field876 - 1] = client.method3009().method7883();
            field875[++Statics.field876 - 1] = client.method3009().method7877();
            return 1;
        } else if (arg0 == 6611) {
            int var15 = field875[--Statics.field876];
            class271 var16 = client.method3009().method7878(var15);
            if (var16 == null) {
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = var16.method4878().method5621();
            }
            return 1;
        } else if (arg0 == 6612) {
            int var17 = field875[--Statics.field876];
            class271 var18 = client.method3009().method7878(var17);
            if (var18 == null) {
                field875[++Statics.field876 - 1] = 0;
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = (var18.method4872() - var18.method4864() + 1) * 64;
                field875[++Statics.field876 - 1] = (var18.method4918() - var18.method4866() + 1) * 64;
            }
            return 1;
        } else if (arg0 == 6613) {
            int var19 = field875[--Statics.field876];
            class271 var20 = client.method3009().method7878(var19);
            if (var20 == null) {
                field875[++Statics.field876 - 1] = 0;
                field875[++Statics.field876 - 1] = 0;
                field875[++Statics.field876 - 1] = 0;
                field875[++Statics.field876 - 1] = 0;
            } else {
                field875[++Statics.field876 - 1] = var20.method4864() * 64;
                field875[++Statics.field876 - 1] = var20.method4866() * 64;
                field875[++Statics.field876 - 1] = var20.method4872() * 64 + 64 - 1;
                field875[++Statics.field876 - 1] = var20.method4918() * 64 + 64 - 1;
            }
            return 1;
        } else if (arg0 == 6614) {
            int var21 = field875[--Statics.field876];
            class271 var22 = client.method3009().method7878(var21);
            if (var22 == null) {
                field875[++Statics.field876 - 1] = -1;
            } else {
                field875[++Statics.field876 - 1] = var22.method4863();
            }
            return 1;
        } else if (arg0 == 6615) {
            class337 var23 = client.method3009().method7885();
            if (var23 == null) {
                field875[++Statics.field876 - 1] = -1;
                field875[++Statics.field876 - 1] = -1;
            } else {
                field875[++Statics.field876 - 1] = var23.field3578;
                field875[++Statics.field876 - 1] = var23.field3574;
            }
            return 1;
        } else if (arg0 == 6616) {
            field875[++Statics.field876 - 1] = client.method3009().method7862();
            return 1;
        } else if (arg0 == 6617) {
            class337 var24 = new class337(field875[--Statics.field876]);
            class271 var25 = client.method3009().method7863();
            if (var25 == null) {
                field875[++Statics.field876 - 1] = -1;
                field875[++Statics.field876 - 1] = -1;
                return 1;
            }
            int[] var26 = var25.method4854(var24.field3575, var24.field3578, var24.field3574);
            if (var26 == null) {
                field875[++Statics.field876 - 1] = -1;
                field875[++Statics.field876 - 1] = -1;
            } else {
                field875[++Statics.field876 - 1] = var26[0];
                field875[++Statics.field876 - 1] = var26[1];
            }
            return 1;
        } else if (arg0 == 6618) {
            class337 var27 = new class337(field875[--Statics.field876]);
            class271 var28 = client.method3009().method7863();
            if (var28 == null) {
                field875[++Statics.field876 - 1] = -1;
                field875[++Statics.field876 - 1] = -1;
                return 1;
            }
            class337 var29 = var28.method4894(var27.field3578, var27.field3574);
            if (var29 == null) {
                field875[++Statics.field876 - 1] = -1;
            } else {
                field875[++Statics.field876 - 1] = var29.method5621();
            }
            return 1;
        } else if (arg0 == 6619) {
            Statics.field876 -= 2;
            int var30 = field875[Statics.field876];
            class337 var31 = new class337(field875[Statics.field876 + 1]);
            method2741(var30, var31, false);
            return 1;
        } else if (arg0 == 6620) {
            Statics.field876 -= 2;
            int var32 = field875[Statics.field876];
            class337 var33 = new class337(field875[Statics.field876 + 1]);
            method2741(var32, var33, true);
            return 1;
        } else if (arg0 == 6621) {
            Statics.field876 -= 2;
            int var34 = field875[Statics.field876];
            class337 var35 = new class337(field875[Statics.field876 + 1]);
            class271 var36 = client.method3009().method7878(var34);
            if (var36 == null) {
                field875[++Statics.field876 - 1] = 0;
                return 1;
            } else {
                field875[++Statics.field876 - 1] = var36.method4893(var35.field3575, var35.field3578, var35.field3574) ? 1 : 0;
                return 1;
            }
        } else if (arg0 == 6622) {
            field875[++Statics.field876 - 1] = client.method3009().method7857();
            field875[++Statics.field876 - 1] = client.method3009().method8028();
            return 1;
        } else if (arg0 == 6623) {
            class337 var37 = new class337(field875[--Statics.field876]);
            class271 var38 = client.method3009().method7859(var37.field3575, var37.field3578, var37.field3574);
            if (var38 == null) {
                field875[++Statics.field876 - 1] = -1;
            } else {
                field875[++Statics.field876 - 1] = var38.method4857();
            }
            return 1;
        } else if (arg0 == 6624) {
            client.method3009().method7984(field875[--Statics.field876]);
            return 1;
        } else if (arg0 == 6625) {
            client.method3009().method7915();
            return 1;
        } else if (arg0 == 6626) {
            client.method3009().method7869(field875[--Statics.field876]);
            return 1;
        } else if (arg0 == 6627) {
            client.method3009().method7921();
            return 1;
        } else if (arg0 == 6628) {
            boolean var39 = field875[--Statics.field876] == 1;
            client.method3009().method7892(var39);
            return 1;
        } else if (arg0 == 6629) {
            int var40 = field875[--Statics.field876];
            client.method3009().method7893(var40);
            return 1;
        } else if (arg0 == 6630) {
            int var41 = field875[--Statics.field876];
            client.method3009().method7894(var41);
            return 1;
        } else if (arg0 == 6631) {
            client.method3009().method7895();
            return 1;
        } else if (arg0 == 6632) {
            boolean var42 = field875[--Statics.field876] == 1;
            client.method3009().method7896(var42);
            return 1;
        } else if (arg0 == 6633) {
            Statics.field876 -= 2;
            int var43 = field875[Statics.field876];
            boolean var44 = field875[Statics.field876 + 1] == 1;
            client.method3009().method8025(var43, var44);
            return 1;
        } else if (arg0 == 6634) {
            Statics.field876 -= 2;
            int var45 = field875[Statics.field876];
            boolean var46 = field875[Statics.field876 + 1] == 1;
            client.method3009().method7898(var45, var46);
            return 1;
        } else if (arg0 == 6635) {
            field875[++Statics.field876 - 1] = client.method3009().method7899() ? 1 : 0;
            return 1;
        } else if (arg0 == 6636) {
            int var47 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = client.method3009().method7900(var47) ? 1 : 0;
            return 1;
        } else if (arg0 == 6637) {
            int var48 = field875[--Statics.field876];
            field875[++Statics.field876 - 1] = client.method3009().method7901(var48) ? 1 : 0;
            return 1;
        } else if (arg0 == 6638) {
            Statics.field876 -= 2;
            int var49 = field875[Statics.field876];
            class337 var50 = new class337(field875[Statics.field876 + 1]);
            class337 var51 = client.method3009().method7904(var49, var50);
            if (var51 == null) {
                field875[++Statics.field876 - 1] = -1;
            } else {
                field875[++Statics.field876 - 1] = var51.method5621();
            }
            return 1;
        } else if (arg0 == 6639) {
            class289 var52 = client.method3009().method7850();
            if (var52 == null) {
                field875[++Statics.field876 - 1] = -1;
                field875[++Statics.field876 - 1] = -1;
            } else {
                field875[++Statics.field876 - 1] = var52.method4809();
                field875[++Statics.field876 - 1] = var52.field3086.method5621();
            }
            return 1;
        } else if (arg0 == 6640) {
            class289 var53 = client.method3009().method8033();
            if (var53 == null) {
                field875[++Statics.field876 - 1] = -1;
                field875[++Statics.field876 - 1] = -1;
            } else {
                field875[++Statics.field876 - 1] = var53.method4809();
                field875[++Statics.field876 - 1] = var53.field3086.method5621();
            }
            return 1;
        } else if (arg0 == 6693) {
            int var54 = field875[--Statics.field876];
            class195 var55 = class195.method2991(var54);
            if (var55.field1937 == null) {
                field886[++Statics.field1867 - 1] = "";
            } else {
                field886[++Statics.field1867 - 1] = var55.field1937;
            }
            return 1;
        } else if (arg0 == 6694) {
            int var56 = field875[--Statics.field876];
            class195 var57 = class195.method2991(var56);
            field875[++Statics.field876 - 1] = var57.field1939;
            return 1;
        } else if (arg0 == 6695) {
            int var58 = field875[--Statics.field876];
            class195 var59 = class195.method2991(var58);
            if (var59 == null) {
                field875[++Statics.field876 - 1] = -1;
            } else {
                field875[++Statics.field876 - 1] = var59.field1935;
            }
            return 1;
        } else if (arg0 == 6696) {
            int var60 = field875[--Statics.field876];
            class195 var61 = class195.method2991(var60);
            if (var61 == null) {
                field875[++Statics.field876 - 1] = -1;
            } else {
                field875[++Statics.field876 - 1] = var61.field1936;
            }
            return 1;
        } else if (arg0 == 6697) {
            field875[++Statics.field876 - 1] = Statics.field2423.field3106;
            return 1;
        } else if (arg0 == 6698) {
            field875[++Statics.field876 - 1] = Statics.field2423.field3104.method5621();
            return 1;
        } else if (arg0 == 6699) {
            field875[++Statics.field876 - 1] = Statics.field2423.field3105.method5621();
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("me.bl(ILds;ZB)I")
    public static int method5606(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6754) {
            int var3 = field875[--Statics.field876];
            class206 var4 = class206.method3320(var3);
            field886[++Statics.field1867 - 1] = var4 == null ? "" : var4.field2083;
            return 1;
        } else if (arg0 == 6764) {
            Statics.field876 -= 2;
            class206 var5 = class206.method3320(field875[Statics.field876]);
            int var6 = field875[Statics.field876 + 1];
            field875[++Statics.field876 - 1] = var5.method3481(var6);
            field875[++Statics.field876 - 1] = var5.method3483(var6);
            return 1;
        } else if (arg0 == 6765) {
            class206 var7 = class206.method3320(field875[--Statics.field876]);
            field875[++Statics.field876 - 1] = var7 == null ? 0 : var7.field2074;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("gz.bg(ILds;ZB)I")
    public static int method3139(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 6809) {
            int var3 = field875[--Statics.field876];
            class220 var4 = Statics.method2243(var3);
            field886[++Statics.field1867 - 1] = var4 == null ? "" : var4.field2201;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("eo.bj(ILds;ZI)I")
    public static int method2590(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ib.bx(ILds;ZB)I")
    public static int method3910(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("au.bi(ILds;ZI)I")
    public static int method256(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 7108) {
            field875[++Statics.field876 - 1] = client.method3373() ? 1 : 0;
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("bo.bq(ILds;ZI)I")
    public static int method643(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("sl.bw(ILds;ZB)I")
    public static int method7713(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 7463) {
            boolean var3 = field875[--Statics.field876] == 1;
            client.method5605(var3);
            return 1;
        } else {
            return 2;
        }
    }

    @ObfuscatedName("dx.ce(ILds;ZI)I")
    public static int method2119(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 7500 || arg0 == 7508) {
            int var44 = field875[--Statics.field876];
            Object var45 = method1168(var44);
            int var46 = field875[--Statics.field876];
            class522 var47 = client.method835(var46);
            if (var47 == null) {
                throw new RuntimeException();
            }
            int var48 = class524.method2503(var46);
            Statics.field1530 = var47.method8257(var45, var48);
            if (Statics.field1530 == null) {
                client.field588 = -1;
                Statics.field4837 = null;
                if (arg0 == 7500) {
                    field875[++Statics.field876 - 1] = 0;
                }
            } else {
                client.field588 = class524.method6324(var46);
                Statics.field4837 = Statics.field1530.iterator();
                if (arg0 == 7500) {
                    field875[++Statics.field876 - 1] = Statics.field1530.size();
                }
            }
            return 1;
        } else if (arg0 == 7501) {
            if (Statics.field4837 != null && Statics.field4837.hasNext()) {
                field875[++Statics.field876 - 1] = (Integer) Statics.field4837.next();
            } else {
                field875[++Statics.field876 - 1] = -1;
            }
            return 1;
        } else if (arg0 == 7502) {
            Statics.field876 -= 3;
            int var3 = field875[Statics.field876];
            int var4 = field875[Statics.field876 + 1];
            int var5 = field875[Statics.field876 + 2];
            int var6 = class524.method6324(var4);
            int var7 = class524.method3579(var4);
            int var8 = class524.method2503(var4);
            class523 var9 = class523.method3281(var3);
            class521 var10 = class521.method5307(var6);
            int[] var11 = var10.field5080[var7];
            int var12 = 0;
            int var13 = var11.length;
            if (var8 >= 0) {
                if (var8 >= var13) {
                    throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var8 + ", Max: " + var13);
                }
                var12 = var8;
                var13 = var8 + 1;
            }
            Object[] var14 = var9.method8273(var7);
            if (var14 == null && var10.field5079 != null) {
                var14 = var10.field5079[var7];
            }
            if (var14 == null) {
                for (int var15 = var12; var15 < var13; var15++) {
                    int var16 = var11[var15];
                    class518 var17 = class516.method4151(var16);
                    if (class518.field5066 == var17) {
                        field886[++Statics.field1867 - 1] = "";
                    } else {
                        field875[++Statics.field876 - 1] = class516.method6180(var16);
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
                class518 var21 = class516.method4151(var11[var19]);
                if (class518.field5066 == var21) {
                    field886[++Statics.field1867 - 1] = (String) var14[var20];
                } else {
                    field875[++Statics.field876 - 1] = (Integer) var14[var20];
                }
            }
            return 1;
        } else if (arg0 == 7503) {
            Statics.field876 -= 2;
            int var22 = field875[Statics.field876];
            int var23 = field875[Statics.field876 + 1];
            int var24 = 0;
            int var25 = class524.method6324(var23);
            int var26 = class524.method3579(var23);
            class523 var27 = class523.method3281(var22);
            class521 var28 = class521.method5307(var25);
            int[] var29 = var28.field5080[var26];
            Object[] var30 = var27.method8273(var26);
            if (var30 == null && var28.field5079 != null) {
                var30 = var28.field5079[var26];
            }
            if (var30 != null) {
                var24 = var30.length / var29.length;
            }
            field875[++Statics.field876 - 1] = var24;
            return 1;
        } else if (arg0 == 7504 || arg0 == 7510) {
            Statics.field876--;
            int var41 = field875[Statics.field876];
            class522 var42 = client.method3895(var41);
            if (var42 == null) {
                throw new RuntimeException();
            }
            Statics.field1530 = var42.method8257(0, 0);
            int var43 = 0;
            if (Statics.field1530 != null) {
                client.field588 = var41;
                Statics.field4837 = Statics.field1530.iterator();
                var43 = Statics.field1530.size();
            }
            if (arg0 == 7504) {
                field875[++Statics.field876 - 1] = var43;
            }
            return 1;
        } else if (arg0 == 7505) {
            int var31 = field875[--Statics.field876];
            class523 var32 = class523.method3281(var31);
            field875[++Statics.field876 - 1] = var32.field5090;
            return 1;
        } else if (arg0 == 7506) {
            int var33 = field875[--Statics.field876];
            int var34 = -1;
            if (Statics.field1530 != null && var33 >= 0 && var33 < Statics.field1530.size()) {
                var34 = (Integer) Statics.field1530.get(var33);
            }
            field875[++Statics.field876 - 1] = var34;
            return 1;
        } else if (arg0 == 7507 || arg0 == 7509) {
            int var35 = field875[--Statics.field876];
            Object var36 = method1168(var35);
            int var37 = field875[--Statics.field876];
            class522 var38 = client.method835(var37);
            if (var38 == null) {
                throw new RuntimeException();
            } else if (class524.method6324(var37) != client.field588) {
                throw new RuntimeException();
            } else if (Statics.field1530 == null && Statics.field1530.isEmpty()) {
                throw new RuntimeException();
            } else {
                int var39 = class524.method2503(var37);
                List var40 = var38.method8257(var36, var39);
                Statics.field1530 = new LinkedList(Statics.field1530);
                if (var40 == null) {
                    Statics.field1530.clear();
                } else {
                    Statics.field1530.retainAll(var40);
                }
                Statics.field4837 = Statics.field1530.iterator();
                if (arg0 == 7507) {
                    field875[++Statics.field876 - 1] = Statics.field1530.size();
                }
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("fc.cu(ILds;ZI)I")
    public static int method2996(int arg0, class81 arg1, boolean arg2) {
        return 2;
    }

    @ObfuscatedName("ao.cw(ILds;ZI)I")
    public static int method11(int arg0, class81 arg1, boolean arg2) {
        if (arg0 == 8000) {
            Statics.field876--;
            int var3 = field875[Statics.field876];
            int var4 = field873[var3];
            class525.method4482(field874[var3], new int[var4], 0, var4 - 1);
            return 1;
        } else if (arg0 == 8001) {
            Statics.field876 -= 3;
            int var5 = field875[Statics.field876];
            int var6 = field875[Statics.field876 + 1];
            int var7 = field875[Statics.field876 + 2];
            int var8 = field873[var5];
            if (var8 <= 1) {
                return 1;
            } else {
                class425.method7096(field874[var5], var8, var6, var7);
                return 1;
            }
        } else {
            return 2;
        }
    }

    @ObfuscatedName("hr.co(II)V")
    public static void method3528(int arg0) {
        if (arg0 == -1 || !Statics.field185.method5641(arg0)) {
            return;
        }
        class347[] var1 = Statics.field185.field3588[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class347 var3 = var1[var2];
            if (var3.field3766 != null) {
                class90 var4 = new class90();
                var4.field1088 = var3;
                var4.field1087 = var3.field3766;
                method7507(var4, 5000000, 0);
            }
        }
    }

    @ObfuscatedName("eq.cc(ILmo;ZI)V")
    public static void method2741(int arg0, class337 arg1, boolean arg2) {
        class271 var3 = client.method3009().method7878(arg0);
        int var4 = Statics.field2696.field1140;
        int var5 = (Statics.field2696.field1227 >> 7) + Statics.field108;
        int var6 = (Statics.field2696.field1187 >> 7) + Statics.field103;
        class337 var7 = new class337(var4, var5, var6);
        client.method3009().method7866(var3, var7, arg1, arg2);
    }

    @ObfuscatedName("dk.cg(Ltr;I)Ljava/lang/Object;")
    public static Object method2191(class518 arg0) {
        if (arg0 == null) {
            throw new IllegalStateException("popValueOfType() failure - null baseVarType");
        }
        switch(arg0.field5069) {
            case 0:
                return field886[--Statics.field1867];
            case 2:
                return field875[--Statics.field876];
            default:
                throw new IllegalStateException("popValueOfType() failure - unsupported type");
        }
    }

    @ObfuscatedName("cm.cq(IB)Ljava/lang/Object;")
    public static Object method1168(int arg0) {
        return method2191((class518) class388.method3894(class518.method8221(), arg0));
    }
}
